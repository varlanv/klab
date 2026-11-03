package com.varlanv.klab.sdl3

import com.varlanv.klab.sdl3.ffi.generated.SDL3
import java.lang.foreign.MemorySegment

class Sdl3Window internal constructor(private var handle: MemorySegment) : AutoCloseable {

    override fun close() {
        if (handle.address() != 0L) {
            SDL3.SDL_DestroyWindow(handle)
            handle = MemorySegment.NULL
        }
    }
}
