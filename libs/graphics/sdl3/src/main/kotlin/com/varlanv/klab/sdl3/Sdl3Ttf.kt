package com.varlanv.klab.sdl3

import com.varlanv.klab.collections.Bytes
import com.varlanv.klab.sdl3.ffi.generated.SDL3
import com.varlanv.klab.sdl3.ffi.generated.ttf.SDL3Ttf
import java.lang.foreign.MemorySegment
import java.lang.foreign.SegmentAllocator

class Sdl3Ttf private constructor() : AutoCloseable {

    private var initialized = true

    fun openFont(gpa: SegmentAllocator, data: Bytes, pointSize: Float): Sdl3Font {
        check(initialized)
        require(data.isNotEmpty())
        require(pointSize.isFinite() && pointSize > 0f)
        val bytes = gpa.allocate(data.size.toLong())
        MemorySegment.copy(MemorySegment.ofArray(data), 0L, bytes, 0L, bytes.byteSize())
        val stream = SDL3.SDL_IOFromConstMem(bytes, bytes.byteSize())
        check(stream.address() != 0L) { errorMessage("Failed to open font stream") }
        val handle = SDL3Ttf.TTF_OpenFontIO(stream, true, pointSize)
        check(handle.address() != 0L) { errorMessage("Failed to open font") }
        return Sdl3Font(handle)
    }

    override fun close() {
        if (initialized) {
            SDL3Ttf.TTF_Quit()
            initialized = false
        }
    }

    companion object {
        fun init(): Sdl3Ttf {
            check(SDL3Ttf.TTF_Init()) { errorMessage("Failed to initialize SDL_ttf") }
            return Sdl3Ttf()
        }
    }
}

class Sdl3Font internal constructor(internal var handle: MemorySegment) : AutoCloseable {

    override fun close() {
        if (handle.address() != 0L) {
            SDL3Ttf.TTF_CloseFont(handle)
            handle = MemorySegment.NULL
        }
    }
}
