package com.varlanv.klab.sdl3

import com.varlanv.klab.sdl3.ffi.generated.SDL3
import java.lang.foreign.MemorySegment
import java.lang.foreign.SegmentAllocator
import java.lang.foreign.ValueLayout

class Sdl3GpuSwapchain internal constructor(
    private val device: MemorySegment,
    private var window: MemorySegment,
) : AutoCloseable {

    val textureFormat: Sdl3GpuTextureFormat
        get() {
            checkOpen()
            val format = SDL3.SDL_GetGPUSwapchainTextureFormat(device, window)
            check(format != SDL3.SDL_GPU_TEXTUREFORMAT_INVALID()) { errorMessage("Failed to get swapchain texture format") }
            return Sdl3GpuTextureFormat(format)
        }

    fun acquireFrame(gpa: SegmentAllocator,command: Sdl3GpuCommandBuffer): Sdl3GpuFrame? {
        checkOpen()
        command.checkCanAcquire()
        check(command.device.address() == device.address())
        val texturePointer = gpa.allocate(ValueLayout.ADDRESS)
        val widthPointer = gpa.allocate(ValueLayout.JAVA_INT)
        val heightPointer = gpa.allocate(ValueLayout.JAVA_INT)
        check(
            SDL3.SDL_WaitAndAcquireGPUSwapchainTexture(
                command.handle,
                window,
                texturePointer,
                widthPointer,
                heightPointer,
            ),
        ) { errorMessage("Failed to acquire swapchain texture") }
        val texture = texturePointer.get(ValueLayout.ADDRESS, 0L)
        if (texture.address() == 0L) return null
        command.markSwapchainAcquired()
        val width = widthPointer.get(ValueLayout.JAVA_INT, 0L)
        val height = heightPointer.get(ValueLayout.JAVA_INT, 0L)
        assert(width > 0 && height > 0)
        return Sdl3GpuFrame(
            swapchain = this,
            command = command,
            texture = texture,
            width = width,
            height = height,
        )
    }

    internal fun checkOpen() {
        check(window.address() != 0L) { "Swapchain is closed" }
    }

    override fun close() {
        if (window.address() != 0L) {
            SDL3.SDL_ReleaseWindowFromGPUDevice(device, window)
            window = MemorySegment.NULL
        }
    }
}
