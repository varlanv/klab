package com.varlanv.klab.sdl3

import com.varlanv.klab.sdl3.ffi.generated.ttf.SDL3Ttf
import java.lang.foreign.MemorySegment

class Sdl3GpuTextEngine internal constructor(
    internal val device: MemorySegment,
    private var handle: MemorySegment,
) : AutoCloseable {
    private var textCount = 0

    fun createText(font: Sdl3Font): Sdl3GpuText {
        checkOpen()
        font.checkOpen()
        val textHandle = SDL3Ttf.TTF_CreateText(handle, font.handle, MemorySegment.NULL, 0L)
        check(textHandle.address() != 0L) { errorMessage("Failed to create text") }
        val text = Sdl3GpuText(engine = this, font = font, handle = textHandle)
        textCount++
        font.textCount++
        return text
    }

    internal fun checkOpen() {
        check(handle.address() != 0L) { "GPU text engine is closed" }
    }

    internal fun textClosed() {
        assert(textCount > 0)
        textCount--
    }

    override fun close() {
        if (handle.address() != 0L) {
            check(textCount == 0) { "Close text objects before their engine" }
            SDL3Ttf.TTF_DestroyGPUTextEngine(handle)
            handle = MemorySegment.NULL
        }
    }
}
