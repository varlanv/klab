package com.varlanv.klab.renderer

import com.varlanv.klab.collections.Floats
import com.varlanv.klab.collections.MutBytes
import com.varlanv.klab.collections.MutFloats
import com.varlanv.klab.collections.MutInts
import com.varlanv.klab.glb.*
import com.varlanv.klab.sdl3.*
import java.io.InputStream
import java.lang.foreign.MemorySegment
import java.lang.foreign.SegmentAllocator
import java.lang.foreign.ValueLayout
import javax.imageio.ImageIO
import javax.imageio.stream.MemoryCacheImageInputStream

class GpuModel private constructor(
    internal val device: Sdl3GpuDevice,
    internal val meshes: List<List<GpuModelPrimitive>>,
    internal val nodes: List<GpuModelNode>,
    private val resources: List<AutoCloseable>,
) : AutoCloseable {

    private var closed = false

    internal fun checkOpen() {
        check(!closed) { "GPU model is closed" }
    }

    override fun close() {
        if (!closed) {
            closed = true
            closeModelResources(resources)
        }
    }

    companion object {
        context(gpa: SegmentAllocator)
        internal fun upload(device: Sdl3GpuDevice, source: GlbModel): GpuModel {
            require(source.skinCount == 0 && source.animationCount == 0) { "GPU models currently support static scenes" }
            val resources = ArrayList<AutoCloseable>()
            val transfers = ArrayList<AutoCloseable>()
            var uploadFailure: Throwable? = null
            try {
                device.acquireCommandBuffer().use { command ->
                    val result = command.beginCopyPass().use { copy ->
                        val upload = ModelUpload(device = device, source = source, copy = copy, resources = resources, transfers = transfers)
                        val nodes = upload.nodes()
                        require(nodes.isNotEmpty()) { "GLB scene contains no meshes" }
                        val meshes = MutableList<List<GpuModelPrimitive>>(source.meshCount) { emptyList() }
                        for (node in nodes) {
                            if (meshes[node.meshIndex].isEmpty()) meshes[node.meshIndex] = upload.mesh(node.meshIndex)
                        }
                        GpuModel(device = device, meshes = meshes, nodes = nodes, resources = resources)
                    }
                    command.submit()
                    return result
                }
            } catch (failure: Throwable) {
                uploadFailure = failure
                closeModelResources(resources = resources, cause = failure)
                throw failure
            } finally {
                closeModelResources(resources = transfers, cause = uploadFailure)
            }
        }
    }
}

internal class GpuModelPrimitive(
    val vertices: Sdl3GpuBuffer,
    val indices: Sdl3GpuBuffer,
    val indexCount: Int,
    val material: GpuModelMaterial,
)

internal class GpuModelNode(val meshIndex: Int, val transform: Floats)

internal class GpuModelMaterial(
    val texture: Sdl3GpuSampledTexture,
    val sampler: Sdl3GpuSampler,
    val baseColor: Floats,
    val alphaCutoff: Float,
    val unlit: Boolean,
)

private class ModelUpload(
    private val device: Sdl3GpuDevice,
    private val source: GlbModel,
    private val copy: Sdl3GpuCopyPass,
    private val resources: MutableList<AutoCloseable>,
    private val transfers: MutableList<AutoCloseable>,
) {

    private val materials = HashMap<Int, GpuModelMaterial>()
    private val images = HashMap<Int, Sdl3GpuSampledTexture>()
    private val samplers = HashMap<ModelSampler, Sdl3GpuSampler>()

    context(gpa: SegmentAllocator)
    fun nodes(): List<GpuModelNode> {
        val result = ArrayList<GpuModelNode>()
        val pending = ArrayDeque<Int>()
        val sceneIndex = source.defaultSceneIndex ?: if (source.sceneCount > 0) 0 else null
        if (sceneIndex != null) {
            val scene = source.scene(sceneIndex)
            for (index in scene.nodeCount - 1 downTo 0) pending.addLast(scene.nodeIndex(index))
        } else {
            for (index in source.nodeCount - 1 downTo 0) {
                if (source.node(index).parentIndex == null) pending.addLast(index)
            }
        }
        val matrix = gpa.allocate(64, 4)
        while (pending.isNotEmpty()) {
            val node = source.node(pending.removeLast())
            require(!node.hasSkin) { "Skinned nodes are not supported yet" }
            val meshIndex = node.meshIndex
            if (meshIndex != null) {
                val transform = MutFloats(16)
                node.copyWorldTransformTo(matrix)
                MemorySegment.copy(matrix, 0L, MemorySegment.ofArray(transform), 0L, 64L)
                result.add(GpuModelNode(meshIndex = meshIndex, transform = transform))
            }
            for (index in node.childCount - 1 downTo 0) pending.addLast(node.childIndex(index))
        }
        return result
    }

    context(gpa: SegmentAllocator)
    fun mesh(index: Int): List<GpuModelPrimitive> {
        val mesh = source.mesh(index)
        return List(mesh.primitiveCount) { primitive(mesh.primitive(it)) }
    }

    context(gpa: SegmentAllocator)
    private fun primitive(primitive: GlbPrimitive): GpuModelPrimitive {
        require(primitive.type == GlbPrimitiveType.Triangles) { "GPU models currently require triangle lists" }
        require(primitive.morphTargetCount == 0) { "Morph targets are not supported yet" }
        require(primitive.findAttribute(GlbAttributeSemantic.Color) == null) { "Vertex colors are not supported yet" }
        require(primitive.findAttribute(GlbAttributeSemantic.Joints) == null &&
                primitive.findAttribute(GlbAttributeSemantic.Weights) == null) { "Skinned meshes are not supported yet" }
        val position = checkNotNull(primitive.findAttribute(GlbAttributeSemantic.Position)) { "Mesh has no positions" }
        val count = Math.toIntExact(position.count)
        require(count > 0)
        val positions = floats(accessor = position, components = 3, count = count)
        val normal = primitive.findAttribute(GlbAttributeSemantic.Normal)
        val normals = normal?.let { floats(accessor = it, components = 3, count = count) }
        val uv = primitive.findAttribute(GlbAttributeSemantic.TexCoord)
        val uvs = uv?.let { floats(accessor = it, components = 2, count = count) }
        val material = material(primitive.materialIndex)
        if (material.texture.width > 1 || material.texture.height > 1) {
            require(uv != null) { "Textured meshes require TEXCOORD_0" }
        }
        val inputIndices = primitive.indices
        val indexCount = inputIndices?.let { Math.toIntExact(it.count) } ?: count
        require(indexCount > 0 && indexCount % 3 == 0) { "Triangle index count must be divisible by three" }
        val vertexBytes = Math.multiplyExact(count, 32)
        val indexBytes = Math.multiplyExact(indexCount, 4)
        val vertexBuffer = device.createBuffer(usage = Sdl3GpuBufferUsage.Vertex, size = vertexBytes).also(resources::add)
        val indexBuffer = device.createBuffer(usage = Sdl3GpuBufferUsage.Index, size = indexBytes).also(resources::add)
        val transfer = device.createTransferBuffer(Math.addExact(vertexBytes, indexBytes)).also(transfers::add)
        val mapped = transfer.map(cycle = false)
        try {
            for (vertex in 0 until count) {
                val target = vertex.toLong() * 32L
                val positionOffset = vertex * positions.stride
                for (component in 0..2) {
                    mapped.set(ValueLayout.JAVA_FLOAT, target + component * 4L,
                        positions.data.get(ValueLayout.JAVA_FLOAT, positionOffset + component * 4L))
                }
                for (component in 0..2) {
                    val value = normals?.data?.get(ValueLayout.JAVA_FLOAT, vertex * normals.stride + component * 4L)
                        ?: if (component == 1) 1f else 0f
                    mapped.set(ValueLayout.JAVA_FLOAT, target + 12L + component * 4L, value)
                }
                for (component in 0..1) {
                    val value = uvs?.data?.get(ValueLayout.JAVA_FLOAT, vertex * uvs.stride + component * 4L) ?: 0f
                    mapped.set(ValueLayout.JAVA_FLOAT, target + 24L + component * 4L, value)
                }
            }
            val outputIndices = mapped.asSlice(vertexBytes.toLong(), indexBytes.toLong())
            if (inputIndices != null) {
                inputIndices.copyIndicesTo(outputIndices)
            } else {
                for (index in 0 until indexCount) outputIndices.setAtIndex(ValueLayout.JAVA_INT, index.toLong(), index)
            }
        } finally {
            transfer.unmap()
        }
        copy.upload(source = transfer, destination = vertexBuffer, size = vertexBytes, cycle = false)
        copy.upload(source = transfer, destination = indexBuffer, size = indexBytes, sourceOffset = vertexBytes, cycle = false)
        return GpuModelPrimitive(vertices = vertexBuffer, indices = indexBuffer, indexCount = indexCount, material = material)
    }

    context(gpa: SegmentAllocator)
    private fun floats(accessor: GlbAccessor, components: Int, count: Int): ModelAttribute {
        require(accessor.elementType.componentCount == components && accessor.count == count.toLong()) { "Invalid mesh attribute layout" }
        if (accessor.componentType == GlbComponentType.Float && !accessor.normalized && !accessor.sparse) {
            val raw = accessor.rawBytes()
            if (raw != null) return ModelAttribute(data = raw, stride = accessor.strideBytes)
        }
        val stride = components * 4L
        val data = gpa.allocate(Math.multiplyExact(count.toLong(), stride), 4)
        accessor.copyFloatsTo(data)
        return ModelAttribute(data = data, stride = stride)
    }

    context(gpa: SegmentAllocator)
    private fun material(index: Int?): GpuModelMaterial = materials.getOrPut(index ?: -1) {
        val material = index?.let(source::material)
        require(material?.alphaMode != GlbAlphaMode.Blend) { "Transparent model materials are not supported yet" }
        val binding = material?.baseColorTexture
        require(binding == null || !binding.hasTransform) { "Texture transforms are not supported yet" }
        require(binding == null || binding.texCoord == 0) { "Model materials currently require TEXCOORD_0" }
        val textureIndex = binding?.textureIndex
        val texture = textureIndex?.let(source::texture)
        val imageIndex = texture?.imageIndex
        require(textureIndex == null || imageIndex != null) { "Texture has no supported image source" }
        val image = images.getOrPut(imageIndex ?: -1) { image(imageIndex) }
        val sourceSampler = texture?.sampler
        val settings = ModelSampler(
            minFilter = filter(sourceSampler?.minFilter ?: 9729),
            magFilter = filter(sourceSampler?.magFilter ?: 9729),
            addressModeU = addressMode(sourceSampler?.wrapS ?: 10497),
            addressModeV = addressMode(sourceSampler?.wrapT ?: 10497),
        )
        val sampler = samplers.getOrPut(settings) {
            device.createSampler(
                minFilter = settings.minFilter, magFilter = settings.magFilter,
                addressModeU = settings.addressModeU, addressModeV = settings.addressModeV,
            ).also(resources::add)
        }
        val color = MutFloats(4) { material?.baseColorFactor(it) ?: 1f }
        GpuModelMaterial(
            texture = image, sampler = sampler, baseColor = color,
            alphaCutoff = if (material?.alphaMode == GlbAlphaMode.Mask) material.alphaCutoff else -1f,
            unlit = material?.unlit ?: false,
        )
    }

    context(gpa: SegmentAllocator)
    private fun image(index: Int?): Sdl3GpuSampledTexture {
        if (index == null) {
            return uploadImage(width = 1, height = 1) { it.fill(0xff.toByte()) }
        }
        val image = source.image(index)
        require(image.mimeType == "image/png" || image.mimeType == "image/jpeg") { "Unsupported model image format: ${image.mimeType}" }
        val encoded = checkNotNull(image.encodedBytes()) { "External model images require a resource resolver" }
        val decoded = MemoryCacheImageInputStream(SegmentInputStream(encoded)).use { input ->
            val readers = ImageIO.getImageReaders(input)
            check(readers.hasNext()) { "Could not decode model image" }
            val reader = readers.next()
            try {
                reader.setInput(input, true, true)
                reader.read(0)
            } finally {
                reader.dispose()
            }
        }
        try {
            val row = MutInts(decoded.width)
            return uploadImage(width = decoded.width, height = decoded.height) { target ->
                for (y in 0 until decoded.height) {
                    decoded.getRGB(0, y, decoded.width, 1, row, 0, decoded.width)
                    for (x in row.indices) {
                        val argb = row[x]
                        val offset = (y.toLong() * decoded.width + x) * 4L
                        target.set(ValueLayout.JAVA_BYTE, offset, (argb ushr 16).toByte())
                        target.set(ValueLayout.JAVA_BYTE, offset + 1L, (argb ushr 8).toByte())
                        target.set(ValueLayout.JAVA_BYTE, offset + 2L, argb.toByte())
                        target.set(ValueLayout.JAVA_BYTE, offset + 3L, (argb ushr 24).toByte())
                    }
                }
            }
        } finally {
            decoded.flush()
        }
    }

    context(gpa: SegmentAllocator)
    private inline fun uploadImage(width: Int, height: Int, write: (MemorySegment) -> Unit): Sdl3GpuSampledTexture {
        val size = Math.multiplyExact(Math.multiplyExact(width, height), 4)
        val texture = device.createSampledTexture(width = width, height = height, srgb = true).also(resources::add)
        val transfer = device.createTransferBuffer(size).also(transfers::add)
        val mapped = transfer.map(cycle = false)
        try {
            write(mapped)
        } finally {
            transfer.unmap()
        }
        copy.upload(source = transfer, destination = texture)
        return texture
    }
}

private class ModelAttribute(val data: MemorySegment, val stride: Long)

private data class ModelSampler(
    val minFilter: Sdl3GpuFilter,
    val magFilter: Sdl3GpuFilter,
    val addressModeU: Sdl3GpuAddressMode,
    val addressModeV: Sdl3GpuAddressMode,
)

private fun filter(value: Int): Sdl3GpuFilter = when (value) {
    0, 9729, 9985, 9987 -> Sdl3GpuFilter.Linear
    9728, 9984, 9986 -> Sdl3GpuFilter.Nearest
    else -> error("Unsupported model texture filter: $value")
}

private fun addressMode(value: Int): Sdl3GpuAddressMode = when (value) {
    10497 -> Sdl3GpuAddressMode.Repeat
    33648 -> Sdl3GpuAddressMode.MirroredRepeat
    33071 -> Sdl3GpuAddressMode.ClampToEdge
    else -> error("Unsupported model texture wrap mode: $value")
}

private class SegmentInputStream(private val source: MemorySegment) : InputStream() {
    private var position = 0L

    override fun read(): Int =
        if (position == source.byteSize()) -1 else source.get(ValueLayout.JAVA_BYTE, position++).toInt() and 0xff

    override fun read(destination: MutBytes, offset: Int, length: Int): Int {
        require(offset >= 0 && length >= 0 && offset <= destination.size - length)
        if (length == 0) return 0
        if (position == source.byteSize()) return -1
        val count = minOf(length.toLong(), source.byteSize() - position).toInt()
        MemorySegment.copy(source, position, MemorySegment.ofArray(destination), offset.toLong(), count.toLong())
        position += count
        return count
    }
}

private fun closeModelResources(resources: List<AutoCloseable>, cause: Throwable? = null) {
    var failure = cause
    for (index in resources.indices.reversed()) {
        try {
            resources[index].close()
        } catch (error: Throwable) {
            if (failure == null) failure = error else failure.addSuppressed(error)
        }
    }
    if (failure != null && failure !== cause) throw failure
}
