package com.varlanv.klab.sdl3

import com.varlanv.klab.Io
import com.varlanv.klab.collections.Bytes
import com.varlanv.klab.sdl3.ffi.generated.SDL3
import com.varlanv.klab.sdl3.ffi.generated.SDL_FColor
import com.varlanv.klab.sdl3.ffi.generated.SDL_GPUColorTargetInfo
import java.lang.foreign.MemorySegment
import java.lang.foreign.SegmentAllocator
import java.lang.foreign.ValueLayout

class Sdl3GpuSwapchain internal constructor(
    gpa: SegmentAllocator,
    private val device: MemorySegment,
    private var window: MemorySegment,
) : AutoCloseable {

    private val texturePointer = gpa.allocate(ValueLayout.ADDRESS)
    private val widthPointer = gpa.allocate(ValueLayout.JAVA_INT)
    private val heightPointer = gpa.allocate(ValueLayout.JAVA_INT)
    private val colorTarget = SDL_GPUColorTargetInfo.allocate(gpa).fill(0)
    private val clearColor = SDL_GPUColorTargetInfo.clear_color(colorTarget)

    init {
        SDL_GPUColorTargetInfo.load_op(colorTarget, SDL3.SDL_GPU_LOADOP_CLEAR())
        SDL_GPUColorTargetInfo.store_op(colorTarget, SDL3.SDL_GPU_STOREOP_STORE())
    }

    context(gpa: SegmentAllocator, io: Io)
    fun createTextEngine(shader: Bytes): Sdl3GpuTextEngine {
        check(window.address() != 0L)
        return Sdl3GpuTextEngine.create(device = device, window = window, shader = shader)
    }

    fun render(r: Float, g: Float, b: Float, a: Float = 1f, text: Sdl3GpuText? = null): Boolean {
        check(window.address() != 0L)
        SDL_FColor.r(clearColor, r)
        SDL_FColor.g(clearColor, g)
        SDL_FColor.b(clearColor, b)
        SDL_FColor.a(clearColor, a)

        val commandBuffer = SDL3.SDL_AcquireGPUCommandBuffer(device)
        check(commandBuffer.address() != 0L) { errorMessage("Failed to acquire GPU command buffer") }
        var acquired = false
        var submitted = false
        try {
            check(
                SDL3.SDL_WaitAndAcquireGPUSwapchainTexture(
                    commandBuffer,
                    window,
                    texturePointer,
                    widthPointer,
                    heightPointer,
                ),
            ) { errorMessage("Failed to acquire swapchain texture") }
            val texture = texturePointer.get(ValueLayout.ADDRESS, 0L)
            if (texture.address() == 0L) {
                return false
            }
            acquired = true

            SDL_GPUColorTargetInfo.texture(colorTarget, texture)
            val renderPass = SDL3.SDL_BeginGPURenderPass(commandBuffer, colorTarget, 1, MemorySegment.NULL)
            check(renderPass.address() != 0L) { errorMessage("Failed to begin GPU render pass") }
            try {
                text?.draw(
                    device = device,
                    command = commandBuffer,
                    pass = renderPass,
                    width = widthPointer.get(ValueLayout.JAVA_INT, 0L),
                    height = heightPointer.get(ValueLayout.JAVA_INT, 0L),
                )
            } finally {
                SDL3.SDL_EndGPURenderPass(renderPass)
            }

            submitted = true
            check(SDL3.SDL_SubmitGPUCommandBuffer(commandBuffer)) {
                errorMessage("Failed to submit GPU command buffer")
            }
            return true
        } finally {
            if (!submitted) {
                if (acquired) {
                    SDL3.SDL_SubmitGPUCommandBuffer(commandBuffer)
                } else {
                    SDL3.SDL_CancelGPUCommandBuffer(commandBuffer)
                }
            }
        }
    }

    override fun close() {
        if (window.address() != 0L) {
            SDL3.SDL_ReleaseWindowFromGPUDevice(device, window)
            window = MemorySegment.NULL
        }
    }
}
