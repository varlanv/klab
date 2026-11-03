package com.varlanv.klab.sdl3

import com.varlanv.klab.sdl3.ffi.generated.SDL3
import com.varlanv.klab.sdl3.ffi.generated.SDL_FColor
import com.varlanv.klab.sdl3.ffi.generated.SDL_GPUBufferBinding
import com.varlanv.klab.sdl3.ffi.generated.SDL_GPUBufferRegion
import com.varlanv.klab.sdl3.ffi.generated.SDL_GPUColorTargetInfo
import com.varlanv.klab.sdl3.ffi.generated.SDL_GPUTextureSamplerBinding
import com.varlanv.klab.sdl3.ffi.generated.SDL_GPUTransferBufferLocation
import java.lang.foreign.MemorySegment
import java.lang.foreign.SegmentAllocator

class Sdl3GpuCommandBuffer internal constructor(
    internal val device: MemorySegment,
    internal var handle: MemorySegment,
) : AutoCloseable {

    private var activePass: AutoCloseable? = null
    private var swapchainAcquired = false

    fun beginCopyPass(): Sdl3GpuCopyPass {
        checkIdle()
        val passHandle = SDL3.SDL_BeginGPUCopyPass(handle)
        check(passHandle.address() != 0L) { errorMessage("Failed to begin GPU copy pass") }
        val pass = Sdl3GpuCopyPass(command = this, handle = passHandle)
        activePass = pass
        return pass
    }

    fun submit() {
        checkIdle()
        val submitted = handle
        handle = MemorySegment.NULL
        check(SDL3.SDL_SubmitGPUCommandBuffer(submitted)) {
            errorMessage("Failed to submit GPU command buffer")
        }
    }

    internal fun checkOpen() {
        check(handle.address() != 0L) { "Command buffer is closed" }
    }

    internal fun checkIdle() {
        checkOpen()
        check(activePass == null) { "A GPU pass is already active" }
    }

    internal fun checkCanAcquire() {
        checkIdle()
        check(!swapchainAcquired) { "A swapchain texture has already been acquired" }
    }

    internal fun markSwapchainAcquired() {
        checkCanAcquire()
        swapchainAcquired = true
    }

    internal fun beginRenderPass(pass: Sdl3GpuRenderPass) {
        checkIdle()
        activePass = pass
    }

    internal fun checkPass(pass: AutoCloseable) {
        checkOpen()
        check(activePass === pass) { "GPU pass is no longer active" }
    }

    internal fun endPass(pass: AutoCloseable) {
        checkPass(pass)
        activePass = null
    }

    override fun close() {
        if (handle.address() == 0L) return
        activePass?.close()
        if (swapchainAcquired) {
            submit()
        } else {
            val cancelled = handle
            handle = MemorySegment.NULL
            check(SDL3.SDL_CancelGPUCommandBuffer(cancelled)) {
                errorMessage("Failed to cancel GPU command buffer")
            }
        }
    }
}

class Sdl3GpuCopyPass internal constructor(
    private val command: Sdl3GpuCommandBuffer,
    private var handle: MemorySegment,
) : AutoCloseable {

    context(gpa: SegmentAllocator)
    fun upload(
        source: Sdl3GpuTransferBuffer,
        destination: Sdl3GpuBuffer,
        size: Int,
        sourceOffset: Int = 0,
        destinationOffset: Int = 0,
        cycle: Boolean = true,
    ) {
        command.checkPass(this)
        source.checkOpen()
        destination.checkOpen()
        check(!source.isMapped) { "GPU transfer buffer must be unmapped before upload" }
        check(source.device.address() == command.device.address())
        check(destination.device.address() == command.device.address())
        require(size > 0)
        require(sourceOffset >= 0 && sourceOffset.toLong() + size <= source.size)
        require(destinationOffset >= 0 && destinationOffset.toLong() + size <= destination.size)
        val location = SDL_GPUTransferBufferLocation.allocate(gpa).fill(0)
        SDL_GPUTransferBufferLocation.transfer_buffer(location, source.handle)
        SDL_GPUTransferBufferLocation.offset(location, sourceOffset)
        val region = SDL_GPUBufferRegion.allocate(gpa).fill(0)
        SDL_GPUBufferRegion.buffer(region, destination.handle)
        SDL_GPUBufferRegion.offset(region, destinationOffset)
        SDL_GPUBufferRegion.size(region, size)
        SDL3.SDL_UploadToGPUBuffer(handle, location, region, cycle)
    }

    override fun close() {
        if (handle.address() != 0L) {
            command.checkPass(this)
            SDL3.SDL_EndGPUCopyPass(handle)
            handle = MemorySegment.NULL
            command.endPass(this)
        }
    }
}

class Sdl3GpuFrame internal constructor(
    private val swapchain: Sdl3GpuSwapchain,
    private val command: Sdl3GpuCommandBuffer,
    private val texture: MemorySegment,
    val width: Int,
    val height: Int,
) {

    private var started = false

    context(gpa: SegmentAllocator)
    fun beginRenderPass(r: Float, g: Float, b: Float, a: Float = 1f): Sdl3GpuRenderPass {
        swapchain.checkOpen()
        command.checkIdle()
        check(!started) { "Frame render pass has already begun" }
        val target = SDL_GPUColorTargetInfo.allocate(gpa).fill(0)
        SDL_GPUColorTargetInfo.texture(target, texture)
        SDL_GPUColorTargetInfo.load_op(target, SDL3.SDL_GPU_LOADOP_CLEAR())
        SDL_GPUColorTargetInfo.store_op(target, SDL3.SDL_GPU_STOREOP_STORE())
        val color = SDL_GPUColorTargetInfo.clear_color(target)
        SDL_FColor.r(color, r)
        SDL_FColor.g(color, g)
        SDL_FColor.b(color, b)
        SDL_FColor.a(color, a)
        val passHandle = SDL3.SDL_BeginGPURenderPass(command.handle, target, 1, MemorySegment.NULL)
        check(passHandle.address() != 0L) { errorMessage("Failed to begin GPU render pass") }
        val pass = Sdl3GpuRenderPass(command = command, handle = passHandle, width = width, height = height)
        command.beginRenderPass(pass)
        started = true
        return pass
    }
}

class Sdl3GpuRenderPass internal constructor(
    private val command: Sdl3GpuCommandBuffer,
    private var handle: MemorySegment,
    val width: Int,
    val height: Int,
) : AutoCloseable {

    private var pipelineBound = false
    private var vertexBufferBound = false
    private var indexBytes = -1

    fun bindPipeline(pipeline: Sdl3GpuGraphicsPipeline) {
        command.checkPass(this)
        pipeline.checkOpen()
        check(pipeline.device.address() == command.device.address())
        SDL3.SDL_BindGPUGraphicsPipeline(handle, pipeline.handle)
        pipelineBound = true
    }

    context(gpa: SegmentAllocator)
    fun bindVertexBuffer(buffer: Sdl3GpuBuffer, offset: Int = 0) {
        command.checkPass(this)
        buffer.checkOpen()
        check(buffer.device.address() == command.device.address())
        check(buffer.usage == Sdl3GpuBufferUsage.Vertex)
        require(offset >= 0 && offset < buffer.size)
        val binding = SDL_GPUBufferBinding.allocate(gpa).fill(0)
        SDL_GPUBufferBinding.buffer(binding, buffer.handle)
        SDL_GPUBufferBinding.offset(binding, offset)
        SDL3.SDL_BindGPUVertexBuffers(handle, 0, binding, 1)
        vertexBufferBound = true
    }

    context(gpa: SegmentAllocator)
    fun bindIndexBuffer(buffer: Sdl3GpuBuffer, offset: Int = 0) {
        command.checkPass(this)
        buffer.checkOpen()
        check(buffer.device.address() == command.device.address())
        check(buffer.usage == Sdl3GpuBufferUsage.Index)
        require(offset >= 0 && offset < buffer.size && offset % 4 == 0)
        val binding = SDL_GPUBufferBinding.allocate(gpa).fill(0)
        SDL_GPUBufferBinding.buffer(binding, buffer.handle)
        SDL_GPUBufferBinding.offset(binding, offset)
        SDL3.SDL_BindGPUIndexBuffer(handle, binding, SDL3.SDL_GPU_INDEXELEMENTSIZE_32BIT())
        indexBytes = buffer.size - offset
    }

    context(gpa: SegmentAllocator)
    fun bindFragmentSampler(texture: Sdl3GpuTexture, sampler: Sdl3GpuSampler, slot: Int = 0) {
        command.checkPass(this)
        sampler.checkOpen()
        check(sampler.device.address() == command.device.address())
        check(texture.handle.address() != 0L)
        require(slot >= 0)
        val binding = SDL_GPUTextureSamplerBinding.allocate(gpa).fill(0)
        SDL_GPUTextureSamplerBinding.texture(binding, texture.handle)
        SDL_GPUTextureSamplerBinding.sampler(binding, sampler.handle)
        SDL3.SDL_BindGPUFragmentSamplers(handle, slot, binding, 1)
    }

    fun pushVertexUniform(slot: Int, data: MemorySegment) {
        command.checkPass(this)
        require(slot >= 0)
        require(data.isNative && data.byteSize() in 1..Int.MAX_VALUE.toLong())
        SDL3.SDL_PushGPUVertexUniformData(command.handle, slot, data, data.byteSize().toInt())
    }

    fun drawIndexed(indexCount: Int, firstIndex: Int = 0, vertexOffset: Int = 0) {
        command.checkPass(this)
        check(pipelineBound && vertexBufferBound && indexBytes >= 0) { "Draw buffers and pipeline must be bound" }
        require(indexCount >= 0 && firstIndex >= 0)
        require((firstIndex.toLong() + indexCount) * 4 <= indexBytes)
        SDL3.SDL_DrawGPUIndexedPrimitives(handle, indexCount, 1, firstIndex, vertexOffset, 0)
    }

    override fun close() {
        if (handle.address() != 0L) {
            command.checkPass(this)
            SDL3.SDL_EndGPURenderPass(handle)
            handle = MemorySegment.NULL
            command.endPass(this)
        }
    }
}
