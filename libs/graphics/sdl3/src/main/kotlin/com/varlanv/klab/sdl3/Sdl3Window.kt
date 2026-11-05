package com.varlanv.klab.sdl3

import com.varlanv.klab.sdl3.ffi.generated.SDL3
import com.varlanv.klab.sdl3.ffi.generated.SDL_DisplayMode
import java.lang.foreign.MemorySegment

class Sdl3Window internal constructor(internal var handle: MemorySegment) : AutoCloseable {
    val relativeMouseMode: Boolean
        get() {
            checkOpen()
            return SDL3.SDL_GetWindowRelativeMouseMode(handle)
        }

    val hasInputFocus: Boolean
        get() {
            checkOpen()
            return (SDL3.SDL_GetWindowFlags(handle) and SDL3.SDL_WINDOW_INPUT_FOCUS()) != 0L
        }

    fun setRelativeMouseMode(enabled: Boolean) {
        checkOpen()
        check(SDL3.SDL_SetWindowRelativeMouseMode(handle, enabled)) {
            errorMessage("Failed to change relative mouse mode")
        }
    }

    fun currentDisplayRefreshRate(): Double {
        checkOpen()
        val display = SDL3.SDL_GetDisplayForWindow(handle)
        check(display != 0) { errorMessage("Failed to find window display") }
        val mode = SDL3.SDL_GetCurrentDisplayMode(display)
        check(mode.address() != 0L) { errorMessage("Failed to get display mode") }
        val numerator = SDL_DisplayMode.refresh_rate_numerator(mode)
        val denominator = SDL_DisplayMode.refresh_rate_denominator(mode)
        return if (numerator > 0 && denominator > 0) {
            numerator.toDouble() / denominator
        } else {
            SDL_DisplayMode.refresh_rate(mode).toDouble()
        }
    }

    override fun close() {
        if (handle.address() != 0L) {
            SDL3.SDL_DestroyWindow(handle)
            handle = MemorySegment.NULL
        }
    }

    internal fun checkOpen() {
        check(handle.address() != 0L) { "Window is closed" }
    }
}
