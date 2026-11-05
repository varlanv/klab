package com.varlanv.klab.sdl3

import com.varlanv.klab.mem.NativeAllocator
import com.varlanv.klab.sdl3.ffi.generated.SDL3
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout

enum class Sdl3Scancode(internal val value: Int) {
    W(SDL3.SDL_SCANCODE_W()),
    A(SDL3.SDL_SCANCODE_A()),
    S(SDL3.SDL_SCANCODE_S()),
    D(SDL3.SDL_SCANCODE_D()),
    Escape(SDL3.SDL_SCANCODE_ESCAPE()),
}

class Sdl3Input internal constructor(private val owner: Sdl3, private val keyboard: MemorySegment) {
    var mouseDeltaX = 0f
        private set
    var mouseDeltaY = 0f
        private set

    fun isKeyDown(key: Sdl3Scancode): Boolean {
        owner.checkOpen()
        return keyboard.get(ValueLayout.JAVA_BOOLEAN, key.value.toLong())
    }

    fun discardMouseMotion() {
        owner.checkOpen()
        SDL3.SDL_GetRelativeMouseState(MemorySegment.NULL, MemorySegment.NULL)
        mouseDeltaX = 0f
        mouseDeltaY = 0f
    }

    fun update(gpa: NativeAllocator) {
        owner.checkOpen()
        val delta = gpa.allocate(byteSize = 8, byteAlignment = 4)
        SDL3.SDL_GetRelativeMouseState(
            delta,
            delta.asSlice(
                4L,
                4L,
            ),
        )
        mouseDeltaX = delta.get(ValueLayout.JAVA_FLOAT, 0L)
        mouseDeltaY = delta.get(ValueLayout.JAVA_FLOAT, 4L)
    }
}
