package com.varlanv.klab.sdl3

import com.varlanv.klab.sdl3.ffi.generated.ttf.SDL3Ttf
import com.varlanv.klab.sdl3.ffi.generated.ttf.TTF_GPUAtlasDrawSequence
import java.lang.foreign.MemorySegment
import java.lang.foreign.SegmentAllocator

class Sdl3GpuText internal constructor(
    private val engine: Sdl3GpuTextEngine,
    private val font: Sdl3Font,
    private var handle: MemorySegment,
) : AutoCloseable {

    context(gpa: SegmentAllocator)
    fun setText(text: String) {
        checkOpen()
        check(SDL3Ttf.TTF_SetTextString(handle, gpa.allocateFrom(text), 0L)) {
            errorMessage("Failed to update text")
        }
    }

    fun drawData(): Sdl3GpuTextSequence? {
        checkOpen()
        check(SDL3Ttf.TTF_UpdateText(handle)) { errorMessage("Failed to update text layout") }
        val sequence = SDL3Ttf.TTF_GetGPUTextDrawData(handle)
        return if (sequence.address() == 0L) null else Sdl3GpuTextSequence(sequence)
    }

    private fun checkOpen() {
        check(handle.address() != 0L) { "Text is closed" }
        engine.checkOpen()
        font.checkOpen()
    }

    override fun close() {
        if (handle.address() != 0L) {
            SDL3Ttf.TTF_DestroyText(handle)
            handle = MemorySegment.NULL
            engine.textClosed()
            assert(font.textCount > 0)
            font.textCount--
        }
    }
}

@JvmInline
value class Sdl3GpuTextSequence internal constructor(private val address: MemorySegment) {

    private val data: MemorySegment
        get() = address.reinterpret(TTF_GPUAtlasDrawSequence.sizeof())

    val vertexCount: Int
        get() = TTF_GPUAtlasDrawSequence.num_vertices(data)

    val indexCount: Int
        get() = TTF_GPUAtlasDrawSequence.num_indices(data)

    val texture: Sdl3GpuTexture
        get() = Sdl3GpuTexture(TTF_GPUAtlasDrawSequence.atlas_texture(data))

    val next: Sdl3GpuTextSequence?
        get() {
            val next = TTF_GPUAtlasDrawSequence.next(data)
            return if (next.address() == 0L) null else Sdl3GpuTextSequence(next)
        }

    fun copyVertices(destination: MemorySegment, offset: Long) {
        val type = TTF_GPUAtlasDrawSequence.image_type(data)
        check(type == SDL3Ttf.TTF_IMAGE_ALPHA() || type == SDL3Ttf.TTF_IMAGE_COLOR()) {
            "Unsupported GPU text image type: $type"
        }
        val count = vertexCount
        assert(count >= 0)
        val xy = TTF_GPUAtlasDrawSequence.xy(data).reinterpret(count * 8L)
        val uv = TTF_GPUAtlasDrawSequence.uv(data).reinterpret(count * 8L)
        for (index in 0 until count) {
            MemorySegment.copy(xy, index * 8L, destination, offset + index * 16L, 8L)
            MemorySegment.copy(uv, index * 8L, destination, offset + index * 16L + 8L, 8L)
        }
    }

    fun copyIndices(destination: MemorySegment, offset: Long) {
        val size = indexCount * 4L
        assert(size >= 0L)
        MemorySegment.copy(TTF_GPUAtlasDrawSequence.indices(data).reinterpret(size), 0L, destination, offset, size)
    }
}
