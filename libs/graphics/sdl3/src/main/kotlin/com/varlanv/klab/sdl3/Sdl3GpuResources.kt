package com.varlanv.klab.sdl3

import com.varlanv.klab.sdl3.ffi.generated.SDL3
import java.lang.foreign.MemorySegment

@JvmInline
value class Sdl3GpuTexture internal constructor(internal val handle: MemorySegment)

@JvmInline
value class Sdl3GpuTextureFormat(val value: Int)

enum class Sdl3GpuBufferUsage { Vertex, Index }

enum class Sdl3GpuShaderStage { Vertex, Fragment }

enum class Sdl3GpuVertexFormat { Float2, Float3, Float4 }

enum class Sdl3GpuPrimitiveType { Triangles, Lines }

enum class Sdl3GpuFilter { Nearest, Linear }

enum class Sdl3GpuAddressMode { Repeat, MirroredRepeat, ClampToEdge }

class Sdl3GpuSampledTexture internal constructor(
    internal val device: MemorySegment,
    internal var handle: MemorySegment,
    val width: Int,
    val height: Int,
    val format: Sdl3GpuTextureFormat,
) : AutoCloseable {

    val texture: Sdl3GpuTexture
        get() {
            checkOpen()
            return Sdl3GpuTexture(handle)
        }

    internal fun checkOpen() {
        check(handle.address() != 0L) { "GPU sampled texture is closed" }
    }

    override fun close() {
        if (handle.address() != 0L) {
            SDL3.SDL_ReleaseGPUTexture(device, handle)
            handle = MemorySegment.NULL
        }
    }
}

class Sdl3GpuDepthTexture internal constructor(
    internal val device: MemorySegment,
    internal var handle: MemorySegment,
    val width: Int,
    val height: Int,
    val format: Sdl3GpuTextureFormat,
) : AutoCloseable {

    internal fun checkOpen() {
        check(handle.address() != 0L) { "GPU depth texture is closed" }
    }

    override fun close() {
        if (handle.address() != 0L) {
            SDL3.SDL_ReleaseGPUTexture(device, handle)
            handle = MemorySegment.NULL
        }
    }
}

class Sdl3GpuVertexAttribute(
    val location: Int,
    val offset: Int,
    val format: Sdl3GpuVertexFormat,
)

class Sdl3GpuBuffer internal constructor(
    internal val device: MemorySegment,
    internal var handle: MemorySegment,
    val size: Int,
    val usage: Sdl3GpuBufferUsage,
) : AutoCloseable {

    internal fun checkOpen() {
        check(handle.address() != 0L) { "GPU buffer is closed" }
    }

    override fun close() {
        if (handle.address() != 0L) {
            SDL3.SDL_ReleaseGPUBuffer(device, handle)
            handle = MemorySegment.NULL
        }
    }
}

class Sdl3GpuTransferBuffer internal constructor(
    internal val device: MemorySegment,
    internal var handle: MemorySegment,
    val size: Int,
) : AutoCloseable {

    internal var isMapped = false
        private set

    internal fun checkOpen() {
        check(handle.address() != 0L) { "GPU transfer buffer is closed" }
    }

    fun map(cycle: Boolean = true): MemorySegment {
        checkOpen()
        check(!isMapped) { "GPU transfer buffer is already mapped" }
        val mapped = SDL3.SDL_MapGPUTransferBuffer(device, handle, cycle)
        check(mapped.address() != 0L) { errorMessage("Failed to map GPU transfer buffer") }
        isMapped = true
        return mapped.reinterpret(size.toLong())
    }

    fun unmap() {
        checkOpen()
        check(isMapped) { "GPU transfer buffer is not mapped" }
        SDL3.SDL_UnmapGPUTransferBuffer(device, handle)
        isMapped = false
    }

    override fun close() {
        if (handle.address() != 0L) {
            if (isMapped) unmap()
            SDL3.SDL_ReleaseGPUTransferBuffer(device, handle)
            handle = MemorySegment.NULL
        }
    }
}

class Sdl3GpuSampler internal constructor(
    internal val device: MemorySegment,
    internal var handle: MemorySegment,
) : AutoCloseable {

    internal fun checkOpen() {
        check(handle.address() != 0L) { "GPU sampler is closed" }
    }

    override fun close() {
        if (handle.address() != 0L) {
            SDL3.SDL_ReleaseGPUSampler(device, handle)
            handle = MemorySegment.NULL
        }
    }
}

class Sdl3GpuShader internal constructor(
    internal val device: MemorySegment,
    internal var handle: MemorySegment,
    val stage: Sdl3GpuShaderStage,
) : AutoCloseable {

    internal fun checkOpen() {
        check(handle.address() != 0L) { "GPU shader is closed" }
    }

    override fun close() {
        if (handle.address() != 0L) {
            SDL3.SDL_ReleaseGPUShader(device, handle)
            handle = MemorySegment.NULL
        }
    }
}

class Sdl3GpuGraphicsPipeline internal constructor(
    internal val device: MemorySegment,
    internal var handle: MemorySegment,
    internal val depthFormat: Sdl3GpuTextureFormat?,
) : AutoCloseable {

    internal fun checkOpen() {
        check(handle.address() != 0L) { "GPU graphics pipeline is closed" }
    }

    override fun close() {
        if (handle.address() != 0L) {
            SDL3.SDL_ReleaseGPUGraphicsPipeline(device, handle)
            handle = MemorySegment.NULL
        }
    }
}
