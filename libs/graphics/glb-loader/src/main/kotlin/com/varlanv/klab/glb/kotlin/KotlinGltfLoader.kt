package com.varlanv.klab.glb.kotlin

import com.varlanv.klab.intViewHandle
import com.varlanv.klab.shortViewHandle
import jdk.incubator.vector.ByteVector
import jdk.incubator.vector.IntVector
import jdk.incubator.vector.ShortVector
import jdk.incubator.vector.VectorOperators
import java.nio.ByteOrder
import java.util.Base64
import java.nio.file.Files
import java.nio.file.Path

class KotlinGltfLoader(private val vectorized: Boolean = true) {
    private val json = GltfJson()

    fun load(source: ByteArray): KotlinGltf = load(source, null)

    fun load(path: Path): KotlinGltf {
        val absolute = path.toAbsolutePath()
        return load(Files.readAllBytes(absolute)) { uri -> Files.readAllBytes(absolute.parent.resolve(uri)) }
    }

    fun load(source: ByteArray, resolver: ((String) -> ByteArray)?): KotlinGltf {
        var binOffset = 0
        var binSize = 0
        val model = try {
            if (source.size >= 4 && intViewHandle.get(source, 0) as Int == 0x46546c67) {
                require(source.size >= 20) { "GLB header is truncated" }
                require(intViewHandle.get(source, 4) as Int == 2) { "Only GLB version 2 is supported" }
                require(intViewHandle.get(source, 8) as Int == source.size) { "GLB length does not match input size" }
                val jsonSize = intViewHandle.get(source, 12) as Int
                require(jsonSize >= 0 && jsonSize <= source.size - 20 && jsonSize % 4 == 0) { "Invalid GLB JSON size" }
                require(intViewHandle.get(source, 16) as Int == 0x4e4f534a) { "Expected GLB JSON chunk" }
                val next = 20 + jsonSize
                if (next < source.size) {
                    require(next <= source.size - 8) { "Truncated GLB BIN header" }
                    binSize = intViewHandle.get(source, next) as Int
                    require(binSize >= 0 && binSize <= source.size - next - 8 && binSize % 4 == 0) { "Invalid GLB BIN size" }
                    require(intViewHandle.get(source, next + 4) as Int == 0x004e4942) { "Expected GLB BIN chunk" }
                    binOffset = next + 8
                }
                json.parse(source, 20, jsonSize)
            } else json.parse(source, 0, source.size)
            mapGltf(json)
        } finally {
            json.release()
        }
        model.vectorized = vectorized
        model.source = source
        model.binOffset = binOffset
        model.binSize = binSize
        require(model.asset.version == "2.0" && (model.asset.minVersion == null || model.asset.minVersion == "2.0")) { "Unsupported glTF version" }
        model.bufferOffsets = IntArray(model.buffers.size)
        model.bufferSources = Array(model.buffers.size) { index ->
            val buffer = model.buffers[index]
            require(buffer.byteLength >= 0) { "Invalid buffer length" }
            val uri = buffer.uri
            val data = when {
                uri == null && index == 0 && binOffset > 0 -> {
                    require(buffer.byteLength <= binSize) { "Truncated GLB buffer" }
                    model.bufferOffsets[index] = binOffset
                    source
                }
                uri != null && uri.startsWith("data:") -> {
                    val comma = uri.indexOf(',')
                    require(comma >= 0 && uri.substring(0, comma).endsWith(";base64")) { "Unsupported buffer data URI" }
                    Base64.getDecoder().decode(uri.substring(comma + 1))
                }
                uri != null && resolver != null -> resolver(decodeGltfUri(uri))
                else -> error("External GLB buffers require a resource resolver")
            }
            require(buffer.byteLength <= data.size - model.bufferOffsets[index]) { "Truncated buffer" }
            data
        }
        for (extension in model.extensionsRequired) require(extension != "KHR_draco_mesh_compression" &&
            extension != "EXT_meshopt_compression" && extension != "KHR_meshopt_compression") { "GLB geometry requires an additional decoder: $extension" }
        validate(model)
        return model
    }

    private fun validate(model: KotlinGltf) {
        for (view in model.bufferViews) {
            reference(view.buffer, model.buffers.size, false)
            range(view.offset, view.byteLength.toLong(), model.buffers[view.buffer].byteLength)
            require(view.stride >= 0) { "Invalid buffer stride" }
            val compression = view.meshopt
            if (compression != null) {
                reference(compression.buffer, model.buffers.size, false)
                range(compression.offset, compression.byteLength.toLong(), model.buffers[compression.buffer].byteLength)
                require(view.stride == 0 || view.stride == compression.stride)
                require(view.byteLength.toLong() == compression.stride.toLong() * compression.count)
                require(compression.mode in arrayOf("ATTRIBUTES", "TRIANGLES", "INDICES"))
                when (compression.mode) {
                    "ATTRIBUTES" -> require(compression.stride > 0 && compression.stride % 4 == 0 && compression.stride <= 256)
                    "TRIANGLES", "INDICES" -> {
                        require(compression.stride == 2 || compression.stride == 4)
                        require(compression.filter == null || compression.filter == "NONE")
                        if (compression.mode == "TRIANGLES") require(compression.count % 3 == 0)
                    }
                }
                when (compression.filter) {
                    "OCTAHEDRAL", "COLOR" -> require(compression.stride == 4 || compression.stride == 8)
                    "QUATERNION" -> require(compression.stride == 8)
                }
            }
        }
        for (accessor in model.accessors) {
            reference(accessor.bufferView, model.bufferViews.size)
            val component = componentSize(accessor.componentType)
            val size = elementSize(accessor.type, accessor.componentType)
            require(accessor.count > 0 && accessor.offset >= 0) { "Invalid GLB accessor layout" }
            accessor.stride = if (accessor.bufferView >= 0 && model.bufferViews[accessor.bufferView].stride != 0)
                model.bufferViews[accessor.bufferView].stride else size
            require(accessor.stride >= size && accessor.stride % component == 0) { "Invalid GLB accessor stride" }
            if (accessor.bufferView >= 0) viewRange(model, accessor.bufferView, accessor.offset,
                (accessor.count - 1L) * accessor.stride + size, component)
            val sparse = accessor.sparse
            if (sparse != null) {
                require(sparse.count > 0 && sparse.count <= accessor.count) { "Invalid sparse count" }
                require(sparse.indicesComponentType == 5121 || sparse.indicesComponentType == 5123 || sparse.indicesComponentType == 5125)
                val indexSize = componentSize(sparse.indicesComponentType)
                viewRange(model, sparse.indicesBufferView, sparse.indicesOffset, sparse.count.toLong() * indexSize, indexSize)
                viewRange(model, sparse.valuesBufferView, sparse.valuesOffset, sparse.count.toLong() * size, component)
                require(indexBound(model, sparse.indicesBufferView, sparse.indicesOffset, sparse.indicesComponentType, sparse.count) < accessor.count.toLong()) { "Sparse index exceeds accessor count" }
            }
        }
        for (mesh in model.meshes) {
            val targets = if (mesh.primitives.isEmpty()) 0 else mesh.primitives[0].targets.size
            require(mesh.weights.isEmpty() || mesh.weights.size == targets)
            require(mesh.targetNames.isEmpty() || mesh.targetNames.size == targets)
            for (primitive in mesh.primitives) {
                require(primitive.mode in 0..6 && primitive.targets.size == targets && primitive.attributes.isNotEmpty()) { "Invalid GLB primitive" }
                reference(primitive.material, model.materials.size)
                val count = attributeCount(model, primitive.attributes)
                for (target in primitive.targets) for (attribute in target) {
                    reference(attribute.accessor, model.accessors.size, false)
                    require(model.accessors[attribute.accessor].count == count)
                }
                reference(primitive.indices, model.accessors.size)
                if (primitive.indices >= 0) {
                    val indices = model.accessors[primitive.indices]
                    require(indices.type == 1 && (indices.componentType == 5121 || indices.componentType == 5123 || indices.componentType == 5125)) { "Invalid index accessor" }
                    require(indices.stride == componentSize(indices.componentType)) { "Invalid index stride" }
                    if (indices.bufferView >= 0) {
                        val bound = indexBound(model, indices.bufferView, indices.offset, indices.componentType, indices.count)
                        require(bound < count.toLong()) { "Index $bound exceeds vertex count $count; offset ${model.bufferOffsets[0]} view ${model.bufferViews[indices.bufferView].offset}" }
                    }
                }
                for (mapping in primitive.mappings) {
                    reference(mapping.variant, model.variants.size, false)
                    reference(mapping.material, model.materials.size, false)
                }
                primitive.draco?.let { reference(it.bufferView, model.bufferViews.size, false) }
            }
        }
        for (image in model.images) reference(image.bufferView, model.bufferViews.size)
        for (texture in model.textures) {
            reference(texture.image, model.images.size)
            reference(texture.basisuImage, model.images.size)
            reference(texture.webpImage, model.images.size)
            reference(texture.sampler, model.samplers.size)
        }
        for (material in model.materials) validateTextures(material, model.textures.size)
        for ((index, node) in model.nodes.withIndex()) {
            reference(node.mesh, model.meshes.size)
            reference(node.skin, model.skins.size)
            reference(node.camera, model.cameras.size)
            reference(node.light, model.lights.size)
            for (child in node.children) {
                reference(child, model.nodes.size, false)
                require(model.nodes[child].parent == -1) { "Node has multiple parents" }
                model.nodes[child].parent = index
            }
            if (node.weights.isNotEmpty() && node.mesh >= 0 && model.meshes[node.mesh].primitives.isNotEmpty())
                require(node.weights.size == model.meshes[node.mesh].primitives[0].targets.size)
            if (node.instancing.isNotEmpty() || node.extensions.any { it.name == "EXT_mesh_gpu_instancing" }) { require(node.mesh >= 0); attributeCount(model, node.instancing) }
        }
        for (node in model.nodes) {
            var slow = node.parent
            var fast = if (slow < 0) -1 else model.nodes[slow].parent
            while (slow >= 0 && fast >= 0) {
                require(slow != fast) { "Node hierarchy contains a cycle" }
                slow = model.nodes[slow].parent
                fast = model.nodes[fast].parent
                if (fast >= 0) fast = model.nodes[fast].parent
            }
        }
        reference(model.scene, model.scenes.size)
        for (scene in model.scenes) for (node in scene.nodes) {
            reference(node, model.nodes.size, false)
            require(model.nodes[node].parent < 0) { "Scene node has a parent" }
        }
        for (skin in model.skins) {
            reference(skin.skeleton, model.nodes.size)
            reference(skin.inverseBindMatrices, model.accessors.size)
            for (joint in skin.joints) reference(joint, model.nodes.size, false)
        }
        for (animation in model.animations) {
            for (sampler in animation.samplers) {
                reference(sampler.input, model.accessors.size, false)
                reference(sampler.output, model.accessors.size, false)
            }
            for (channel in animation.channels) {
                reference(channel.sampler, animation.samplers.size, false)
                reference(channel.targetNode, model.nodes.size)
                if (channel.targetNode < 0) continue
                var components = 1
                if (channel.targetPath == 4) {
                    val mesh = model.nodes[channel.targetNode].mesh
                    require(mesh >= 0 && model.meshes[mesh].primitives.isNotEmpty())
                    components = model.meshes[mesh].primitives[0].targets.size
                }
                val sampler = animation.samplers[channel.sampler]
                val values = if (sampler.interpolation == 2) 3 else 1
                require(model.accessors[sampler.input].count.toLong() * components * values == model.accessors[sampler.output].count.toLong())
            }
        }
        for (variant in model.variants) require(variant.name != null)
    }

    private fun attributeCount(model: KotlinGltf, attributes: Array<KAttribute>): Int {
        require(attributes.isNotEmpty())
        reference(attributes[0].accessor, model.accessors.size, false)
        val count = model.accessors[attributes[0].accessor].count
        for (attribute in attributes) {
            reference(attribute.accessor, model.accessors.size, false)
            require(model.accessors[attribute.accessor].count == count) { "Mismatched attribute counts" }
        }
        return count
    }

    private fun validateTextures(material: KMaterial, size: Int) {
        fun texture(view: KTextureView?) { if (view != null) reference(view.texture, size) }
        texture(material.normalTexture); texture(material.occlusionTexture); texture(material.emissiveTexture)
        material.metallicRoughness?.let { texture(it.baseColorTexture); texture(it.metallicRoughnessTexture) }
        material.specularGlossiness?.let { texture(it.diffuseTexture); texture(it.specularGlossinessTexture) }
        material.clearcoat?.let { texture(it.texture); texture(it.roughnessTexture); texture(it.normalTexture) }
        material.transmission?.let { texture(it.texture) }
        material.specular?.let { texture(it.texture); texture(it.colorTexture) }
        material.volume?.let { texture(it.thicknessTexture) }
        material.sheen?.let { texture(it.colorTexture); texture(it.roughnessTexture) }
        material.iridescence?.let { texture(it.texture); texture(it.thicknessTexture) }
        material.diffuseTransmission?.let { texture(it.texture); texture(it.colorTexture) }
        material.anisotropy?.let { texture(it.texture) }
    }

    private fun indexBound(model: KotlinGltf, viewIndex: Int, offset: Int, type: Int, count: Int): Long {
        val view = model.bufferViews[viewIndex]
        val bytes = model.bufferSources[view.buffer]
        val start = model.bufferOffsets[view.buffer] + view.offset + offset
        return if (vectorized && vectorAvailable) GltfIndexVectors.bound(bytes, start, type, count)
        else scalarIndexBound(bytes, start, type, count)
    }
}

internal fun reference(index: Int, size: Int, optional: Boolean = true) {
    require(index >= (if (optional) -1 else 0) && index < size) { "Invalid glTF reference $index/$size" }
}

internal fun range(offset: Int, length: Long, available: Int) {
    require(offset >= 0 && length >= 0 && offset.toLong() <= available.toLong() - length) { "GLB buffer range is outside its payload" }
}

internal fun viewRange(model: KotlinGltf, index: Int, offset: Int, length: Long, alignment: Int) {
    reference(index, model.bufferViews.size, false)
    val view = model.bufferViews[index]
    range(offset, length, view.byteLength)
    require((model.bufferOffsets[view.buffer].toLong() + view.offset + offset) % alignment == 0L) { "Unaligned GLB accessor data" }
}

fun componentSize(type: Int): Int = when (type) { 5120, 5121 -> 1; 5122, 5123 -> 2; 5125, 5126 -> 4; else -> error("Invalid component type") }
fun componentCount(type: Int): Int = when (type) { 1 -> 1; 2 -> 2; 3 -> 3; 4, 5 -> 4; 6 -> 9; 7 -> 16; else -> error("Invalid element type") }
fun elementSize(type: Int, componentType: Int): Int {
    val bytes = componentSize(componentType)
    return when (type) { 5 -> ((2 * bytes + 3) and -4) * 2; 6 -> ((3 * bytes + 3) and -4) * 3; else -> componentCount(type) * bytes }
}

internal fun scalarIndexBound(bytes: ByteArray, start: Int, type: Int, count: Int): Long {
    var offset = start
    return when (type) {
        5121 -> {
            var bound = 0
            repeat(count) { bound = maxOf(bound, bytes[offset++].toInt() and 255) }
            bound.toLong()
        }
        5123 -> {
            var bound = 0
            repeat(count) {
                bound = maxOf(bound, (shortViewHandle.get(bytes, offset) as Short).toInt() and 65535)
                offset += 2
            }
            bound.toLong()
        }
        5125 -> {
            var bound = 0L
            repeat(count) {
                bound = maxOf(bound, (intViewHandle.get(bytes, offset) as Int).toLong() and 0xffffffffL)
                offset += 4
            }
            bound
        }
        else -> error("Invalid unsigned component type")
    }
}

internal fun readUnsigned(bytes: ByteArray, offset: Int, type: Int): Long = when (type) {
    5121 -> (bytes[offset].toInt() and 255).toLong()
    5123 -> ((shortViewHandle.get(bytes, offset) as Short).toInt() and 65535).toLong()
    5125 -> (intViewHandle.get(bytes, offset) as Int).toLong() and 0xffffffffL
    else -> error("Invalid unsigned component type")
}

internal val vectorAvailable = ModuleLayer.boot().findModule("jdk.incubator.vector").isPresent

private object GltfIndexVectors {
    private val shorts = ShortVector.SPECIES_PREFERRED
    private val ints = IntVector.SPECIES_PREFERRED
    private val bytesSpecies = ByteVector.SPECIES_PREFERRED
    private val swapBytes = ByteOrder.nativeOrder() != ByteOrder.LITTLE_ENDIAN

    fun bound(bytes: ByteArray, start: Int, type: Int, count: Int): Long {
        var index = 0
        var result: Long
        when (type) {
            5123 -> {
                var max = ShortVector.broadcast(shorts, Short.MIN_VALUE)
                val end = shorts.loopBound(count)
                while (index < end) {
                    var lanes = ByteVector.fromArray(bytesSpecies, bytes, start + index * 2).reinterpretAsShorts()
                    if (swapBytes) lanes = lanes.lanewise(VectorOperators.REVERSE_BYTES)
                    max = max.max(lanes.lanewise(VectorOperators.XOR, Short.MIN_VALUE))
                    index += shorts.length()
                }
                result = ((max.reduceLanes(VectorOperators.MAX).toInt() xor 0x8000) and 65535).toLong()
            }
            5125 -> {
                var max = IntVector.broadcast(ints, Int.MIN_VALUE)
                val end = ints.loopBound(count)
                while (index < end) {
                    var lanes = ByteVector.fromArray(bytesSpecies, bytes, start + index * 4).reinterpretAsInts()
                    if (swapBytes) lanes = lanes.lanewise(VectorOperators.REVERSE_BYTES)
                    max = max.max(lanes.lanewise(VectorOperators.XOR, Int.MIN_VALUE))
                    index += ints.length()
                }
                result = (max.reduceLanes(VectorOperators.MAX) xor Int.MIN_VALUE).toLong() and 0xffffffffL
            }
            5121 -> {
                var max = ByteVector.broadcast(bytesSpecies, Byte.MIN_VALUE)
                val end = bytesSpecies.loopBound(count)
                while (index < end) {
                    max = max.max(ByteVector.fromArray(bytesSpecies, bytes, start + index).lanewise(VectorOperators.XOR, Byte.MIN_VALUE))
                    index += bytesSpecies.length()
                }
                result = ((max.reduceLanes(VectorOperators.MAX).toInt() xor 0x80) and 255).toLong()
            }
            else -> error("Invalid index component type")
        }
        val size = componentSize(type)
        while (index < count) {
            result = maxOf(result, readUnsigned(bytes, start + index * size, type))
            index++
        }
        return result
    }
}

fun decodeGltfUri(uri: String): String {
    val bytes = uri.toByteArray(Charsets.UTF_8)
    var read = 0
    var write = 0
    while (read < bytes.size) {
        if (bytes[read].toInt() == 37 && read + 2 < bytes.size) {
            val high = Character.digit(bytes[read + 1].toInt().toChar(), 16)
            val low = Character.digit(bytes[read + 2].toInt().toChar(), 16)
            if (high >= 0 && low >= 0) { bytes[write++] = ((high shl 4) or low).toByte(); read += 3; continue }
        }
        bytes[write++] = bytes[read++]
    }
    return String(bytes, 0, write, Charsets.UTF_8)
}
