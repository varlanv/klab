package com.varlanv.klab.sdl3

import com.varlanv.klab.sdl3.ffi.generated.SDL3
import java.lang.foreign.MemorySegment
import java.lang.foreign.SegmentAllocator

class Sdl3GpuDevice internal constructor(
    private var handle: MemorySegment,
    private val gpa: SegmentAllocator,
) : AutoCloseable {

    fun claimWindow(window: Sdl3Window): Sdl3GpuSwapchain {
        check(SDL3.SDL_ClaimWindowForGPUDevice(handle, window.handle)) {
            errorMessage("Failed to create window swapchain")
        }
        try {
            return Sdl3GpuSwapchain(handle, window.handle, gpa)
        } catch (failure: Throwable) {
            SDL3.SDL_ReleaseWindowFromGPUDevice(handle, window.handle)
            throw failure
        }
    }

    override fun close() {
        if (handle.address() != 0L) {
            SDL3.SDL_DestroyGPUDevice(handle)
            handle = MemorySegment.NULL
        }
    }
}
