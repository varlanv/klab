package com.varlanv.klab.sdl3

import com.varlanv.klab.sdl3.ffi.generated.SDL3
import com.varlanv.klab.sdl3.ffi.generated.SDL_Event
import com.varlanv.klab.sdl3.ffi.generated.SDL_KeyboardEvent
import com.varlanv.klab.sdl3.ffi.generated.SDL_MouseButtonEvent
import java.lang.foreign.MemorySegment
import java.lang.foreign.SegmentAllocator
import java.lang.foreign.ValueLayout

class Sdl3 private constructor(private val event: MemorySegment) : AutoCloseable {

    private var initialized = true

    internal fun checkOpen() {
        check(initialized) { "SDL is closed" }
    }

    fun createWindow(title: MemorySegment, width: Int, height: Int): Sdl3Window {
        checkOpen()
        val handle = SDL3.SDL_CreateWindow(title, width, height, 0L)
        check(handle.address() != 0L) { errorMessage("Failed to create window") }
        return Sdl3Window(handle)
    }

    fun waitEvent(): Sdl3Event {
        checkOpen()
        check(SDL3.SDL_WaitEvent(event)) { errorMessage("Failed to wait for event") }
        return eventType()
    }

    fun pollEvent(): Sdl3Event? {
        checkOpen()
        return if (SDL3.SDL_PollEvent(event)) eventType() else null
    }

    fun createGpuDevice(): Sdl3GpuDevice {
        checkOpen()
        val handle = SDL3.SDL_CreateGPUDevice(
            SDL3.SDL_GPU_SHADERFORMAT_SPIRV(),
            false,
            MemorySegment.NULL,
        )
        check(handle.address() != 0L) { errorMessage("Failed to create GPU device") }
        return Sdl3GpuDevice(handle)
    }

    context(gpa: SegmentAllocator)
    fun createInput(): Sdl3Input {
        checkOpen()
        val count = gpa.allocate(ValueLayout.JAVA_INT)
        val keyboard = SDL3.SDL_GetKeyboardState(count)
        check(keyboard.address() != 0L) { errorMessage("Failed to get keyboard state") }
        val keyCount = count.get(ValueLayout.JAVA_INT, 0L)
        check(keyCount > 0) { "Keyboard state is empty" }
        return Sdl3Input(owner = this, keyboard = keyboard.reinterpret(keyCount.toLong()))
    }

    fun ticksNs(): Long {
        checkOpen()
        return SDL3.SDL_GetTicksNS()
    }

    fun delayPrecise(ns: Long) {
        checkOpen()
        if (ns > 0L) {
            SDL3.SDL_DelayPrecise(ns)
        }
    }

    private fun eventType(): Sdl3Event {
        return when (SDL_Event.type(event)) {
            SDL3.SDL_EVENT_QUIT() -> Sdl3Event.Quit
            SDL3.SDL_EVENT_WINDOW_CLOSE_REQUESTED() -> Sdl3Event.WindowCloseRequested
            SDL3.SDL_EVENT_WINDOW_FOCUS_LOST() -> Sdl3Event.WindowFocusLost
            SDL3.SDL_EVENT_WINDOW_FOCUS_GAINED() -> Sdl3Event.WindowFocusGained
            SDL3.SDL_EVENT_KEY_DOWN() -> {
                if (SDL_KeyboardEvent.scancode(event) == SDL3.SDL_SCANCODE_ESCAPE() && !SDL_KeyboardEvent.repeat(event)) {
                    Sdl3Event.EscapePressed
                } else {
                    Sdl3Event.Other
                }
            }

            SDL3.SDL_EVENT_MOUSE_BUTTON_DOWN() -> {
                if (SDL_MouseButtonEvent.button(event).toInt() == SDL3.SDL_BUTTON_LEFT()) {
                    Sdl3Event.LeftMousePressed
                } else {
                    Sdl3Event.Other
                }
            }

            else -> Sdl3Event.Other
        }
    }

    override fun close() {
        if (initialized) {
            SDL3.SDL_Quit()
            initialized = false
        }
    }

    companion object {
        context(gpa: SegmentAllocator)
        fun init(): Sdl3 {
            SDL3.SDL_SetMainReady()
            try {
                check(SDL3.SDL_Init(SDL3.SDL_INIT_VIDEO())) { errorMessage("Failed to initialize SDL3") }
                return Sdl3(SDL_Event.allocate(gpa))
            } catch (failure: Throwable) {
                SDL3.SDL_Quit()
                throw failure
            }
        }
    }
}

internal fun errorMessage(message: String): String = "$message: ${SDL3.SDL_GetError().getString(0)}"
