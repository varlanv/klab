package com.varlanv.klab.platform

import com.varlanv.klab.ResourcesHolder
import com.varlanv.klab.Std
import com.varlanv.klab.TracedCloseable
import com.varlanv.klab.gpu.assets.*
import com.varlanv.klab.mem.NativeAllocator
import com.varlanv.klab.renderer.GpuModel
import com.varlanv.klab.renderer.GpuModelMaterial
import com.varlanv.klab.renderer.GpuModelNode
import com.varlanv.klab.renderer.GpuModelPrimitive
import com.varlanv.klab.sdl3.*
import java.lang.foreign.MemorySegment

private const val RGBA_BYTES = 4
private const val COLOR_COMPONENTS = 4
private const val MATRIX_COMPONENTS = 16
private const val WHITE_CHANNEL = 0xff
private const val MISSING_RESOURCE = -1

class AssetsImpl(private val device: Sdl3GpuDevice) : Assets {
    private val models = ResourcesHolder()
    private var closed = false

    context(std: Std)
    override fun uploadModel(gpa: NativeAllocator, source: PreparedModel): GpuModel {
        assert(!closed) { "Assets are closed" }
        assert(isValid(source))
        val pixelOffset = Math.addExact(source.geometry.byteSize, RGBA_BYTES - 1) and -RGBA_BYTES
        val whiteOffset = Math.addExact(pixelOffset, source.pixels.size)
        val needsWhite = source.materials.any { it.imageIndex == MISSING_RESOURCE }
        val transferSize = Math.addExact(
            whiteOffset,
            if (needsWhite) {
                RGBA_BYTES
            } else {
                0
            },
        )
        return ResourcesHolder.safeAllocate { ownership ->
            val resources = ownership.register(GpuResources())
            val result = device.createTransferBuffer(gpa = gpa, size = transferSize).use { transfer ->
                val mapped = transfer.map(false)
                try {
                    MemorySegment.copy(
                        MemorySegment.ofArray(source.geometry.bytes),
                        0L,
                        mapped,
                        0L,
                        source.geometry.byteSize.toLong(),
                    )
                    MemorySegment.copy(
                        MemorySegment.ofArray(source.pixels),
                        0L,
                        mapped,
                        pixelOffset.toLong(),
                        source.pixels.size.toLong(),
                    )
                    if (needsWhite) {
                        mapped.asSlice(whiteOffset.toLong(), RGBA_BYTES.toLong()).fill(WHITE_CHANNEL.toByte())
                    }
                } finally {
                    transfer.unmap()
                }
                device.acquireCommandBuffer().use { command ->
                    val model = command.beginCopyPass().use { copyPass ->
                        val textures = Array(source.images.size) { index ->
                            val image = source.images[index]
                            val texture = resources.register(
                                device.createSampledTexture(
                                    gpa = gpa,
                                    width = image.width,
                                    height = image.height,
                                    srgb = when (image.format) {
                                        PreparedImageFormat.Rgba8Unorm -> false
                                        PreparedImageFormat.Rgba8Srgb -> true
                                    },
                                ),
                            )
                            copyPass.upload(
                                gpa = gpa,
                                source = transfer,
                                destination = texture,
                                sourceOffset = Math.addExact(
                                    pixelOffset,
                                    image.mips[0].offset,
                                ),
                            )
                            texture
                        }
                        val samplers = Array(source.samplers.size) { index ->
                            val sampler = source.samplers[index]
                            resources.register(
                                device.createSampler(
                                    gpa = gpa,
                                    minFilter = sampler.minFilter.toSdl(),
                                    magFilter = sampler.magFilter.toSdl(),
                                    addressModeU = sampler.addressModeU.toSdl(),
                                    addressModeV = sampler.addressModeV.toSdl(),
                                ),
                            )
                        }
                        val white = if (needsWhite) {
                            resources.register(device.createSampledTexture(gpa = gpa, width = 1, height = 1)).also {
                                copyPass.upload(
                                    gpa = gpa,
                                    source = transfer,
                                    destination = it,
                                    sourceOffset = whiteOffset,
                                )
                            }
                        } else {
                            null
                        }
                        val defaultSampler = if (needsWhite) {
                            resources.register(device.createSampler(gpa = gpa))
                        } else {
                            null
                        }
                        val materials = Array(source.materials.size) { index ->
                            val material = source.materials[index]
                            GpuModelMaterial(
                                texture = if (material.imageIndex == MISSING_RESOURCE) {
                                    checkNotNull(white)
                                } else {
                                    textures[material.imageIndex]
                                },
                                sampler = if (material.samplerIndex == MISSING_RESOURCE) {
                                    checkNotNull(defaultSampler)
                                } else {
                                    samplers[material.samplerIndex]
                                },
                                baseColor = material.baseColor.copyOf(),
                                alphaCutoff = material.alphaCutoff,
                                unlit = material.unlit,
                            )
                        }
                        val primitives = Array(source.primitives.size) { index ->
                            val primitive = source.primitives[index]
                            val vertexBytes = primitive.vertexByteSize
                            val indexBytes = Math.multiplyExact(primitive.indexCount, primitive.indexFormat.byteSize)
                            val vertices = resources.register(
                                device.createBuffer(
                                    gpa = gpa,
                                    usage = Sdl3GpuBufferUsage.Vertex,
                                    size = vertexBytes,
                                ),
                            )
                            val indices = resources.register(
                                device.createBuffer(
                                    gpa = gpa,
                                    usage = Sdl3GpuBufferUsage.Index,
                                    size = indexBytes,
                                ),
                            )
                            copyPass.upload(
                                gpa = gpa,
                                source = transfer,
                                destination = vertices,
                                size = vertexBytes,
                                sourceOffset = primitive.vertexOffset,
                                cycle = false,
                            )
                            copyPass.upload(
                                gpa = gpa,
                                source = transfer,
                                destination = indices,
                                size = indexBytes,
                                sourceOffset = primitive.indexOffset,
                                cycle = false,
                            )
                            GpuModelPrimitive(
                                vertices = vertices,
                                indices = indices,
                                indexCount = primitive.indexCount,
                                indexFormat = when (primitive.indexFormat) {
                                    PreparedIndexFormat.Uint16 -> Sdl3GpuIndexFormat.Uint16
                                    PreparedIndexFormat.Uint32 -> Sdl3GpuIndexFormat.Uint32
                                },
                                material = materials[primitive.materialIndex],
                            )
                        }
                        GpuModel(
                            meshes = List(source.meshes.size) { index ->
                                val mesh = source.meshes[index]
                                List(mesh.primitiveCount) { primitives[mesh.firstPrimitive + it] }
                            },
                            nodes = List(source.nodes.size) { index ->
                                val node = source.nodes[index]
                                GpuModelNode(meshIndex = node.meshIndex, transform = node.transform.copyOf())
                            },
                            resources = ownership,
                        )
                    }
                    command.submit()
                    model
                }
            }
            models.register(result)
        }
    }

    context(std: Std)
    override fun close() {
        if (closed) {
            return
        }
        closed = true
        models.release()
    }
}

private fun isValid(source: PreparedModel): Boolean {
    assert(source.nodes.isNotEmpty() && source.primitives.isNotEmpty()) { "Model contains no geometry" }
    for (primitive in source.primitives) {
        assert(primitive.vertexCount > 0 && primitive.indexCount > 0)
        assert(
            primitive.vertexOffset % Float.SIZE_BYTES == 0 &&
                primitive.indexOffset % primitive.indexFormat.byteSize == 0,
        )
        assertRange(
            offset = primitive.vertexOffset,
            size = primitive.vertexByteSize,
            capacity = source.geometry.byteSize,
        )
        assertRange(
            offset = primitive.indexOffset,
            size = Math.multiplyExact(
                primitive.indexCount,
                primitive.indexFormat.byteSize,
            ),
            capacity = source.geometry.byteSize,
        )
        assert(primitive.materialIndex in source.materials.indices)
    }
    for (image in source.images) {
        assert(image.width > 0 && image.height > 0)
        assert(image.mips.size == 1) { "Model upload currently supports only the base mip" }
        val mip = image.mips[0]
        assert(
            mip.byteSize == Math.multiplyExact(
                Math.multiplyExact(
                    image.width,
                    image.height,
                ),
                RGBA_BYTES,
            ),
        )
        assert(mip.offset % RGBA_BYTES == 0)
        assertRange(offset = mip.offset, size = mip.byteSize, capacity = source.pixels.size)
    }
    assert(source.pixels.size % RGBA_BYTES == 0)
    for (sampler in source.samplers) {
        assert(
            sampler.mipmapMode == PreparedMipmapMode.None,
        ) { "Model upload currently supports non-mipmapped samplers" }
    }
    for (material in source.materials) {
        assert(material.baseColor.size == COLOR_COMPONENTS)
        if (material.imageIndex == MISSING_RESOURCE) {
            assert(material.samplerIndex == MISSING_RESOURCE)
        } else {
            assert(material.imageIndex in source.images.indices)
            assert(material.samplerIndex in source.samplers.indices)
        }
    }
    for (mesh in source.meshes) {
        assertRange(offset = mesh.firstPrimitive, size = mesh.primitiveCount, capacity = source.primitives.size)
    }
    for (node in source.nodes) {
        assert(node.meshIndex in source.meshes.indices)
        assert(node.transform.size == MATRIX_COMPONENTS)
    }
    return true
}

private fun assertRange(
    offset: Int,
    size: Int,
    capacity: Int,
) {
    assert(offset >= 0 && size >= 0 && offset <= capacity - size) { "Prepared model range exceeds its storage" }
}

private fun PreparedFilter.toSdl(): Sdl3GpuFilter = when (this) {
    PreparedFilter.Nearest -> Sdl3GpuFilter.Nearest
    PreparedFilter.Linear -> Sdl3GpuFilter.Linear
}

private fun PreparedAddressMode.toSdl(): Sdl3GpuAddressMode = when (this) {
    PreparedAddressMode.Repeat -> Sdl3GpuAddressMode.Repeat
    PreparedAddressMode.MirroredRepeat -> Sdl3GpuAddressMode.MirroredRepeat
    PreparedAddressMode.ClampToEdge -> Sdl3GpuAddressMode.ClampToEdge
}

private class GpuResources : TracedCloseable {
    private val resources = ArrayList<AutoCloseable>()

    fun <T : AutoCloseable> register(resource: T): T {
        resources.add(resource)
        return resource
    }

    context(std: Std)
    override fun close() {
        for (index in resources.indices.reversed()) {
            try {
                resources[index].close()
            } catch (failure: Throwable) {
                std.debug { "Failed to close GPU resource: ${failure.stackTraceToString()}" }
            }
        }
        resources.clear()
    }
}
