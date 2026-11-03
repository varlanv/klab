package com.varlanv.klab.sdl3

import com.varlanv.klab.sdl3.ffi.generated.SDL3
import com.varlanv.klab.sdl3.ffi.generated.SDL_Event
import java.lang.foreign.SegmentAllocator

class Sdl3 private constructor(private val gpa: SegmentAllocator) : AutoCloseable {

    private val event = SDL_Event.allocate(gpa)

    fun createWindow(title: String, width: Int, height: Int): Sdl3Window {
        val handle = SDL3.SDL_CreateWindow(gpa.allocateFrom(title), width, height, 0L)
        check(handle.address() != 0L) { errorMessage("Failed to create window") }
        return Sdl3Window(handle)
    }

    fun waitEvent(): Sdl3Event {
        check(SDL3.SDL_WaitEvent(event)) { errorMessage("Failed to wait for event") }
        return when (SDL_Event.type(event)) {
            SDL3.SDL_EVENT_QUIT() -> Sdl3Event.Quit
            SDL3.SDL_EVENT_WINDOW_CLOSE_REQUESTED() -> Sdl3Event.WindowCloseRequested
            else -> Sdl3Event.Other
        }
    }

    override fun close() {
        SDL3.SDL_Quit()
    }

    companion object {
        fun init(gpa: SegmentAllocator): Sdl3 {
            SDL3.SDL_SetMainReady()
            try {
                check(SDL3.SDL_Init(SDL3.SDL_INIT_VIDEO())) { errorMessage("Failed to initialize SDL3") }
                return Sdl3(gpa)
            } catch (failure: Throwable) {
                SDL3.SDL_Quit()
                throw failure
            }
        }
    }
}

private fun errorMessage(message: String): String = "$message: ${SDL3.SDL_GetError().getString(0)}"
