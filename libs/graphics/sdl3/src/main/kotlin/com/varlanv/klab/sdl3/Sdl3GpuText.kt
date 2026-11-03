package com.varlanv.klab.sdl3

import com.varlanv.klab.sdl3.ffi.generated.*
import com.varlanv.klab.sdl3.ffi.generated.ttf.SDL3Ttf
import com.varlanv.klab.sdl3.ffi.generated.ttf.TTF_GPUAtlasDrawSequence
import java.lang.foreign.MemorySegment
import java.lang.foreign.SegmentAllocator
import java.lang.foreign.ValueLayout

class Sdl3GpuText internal constructor(
    private val engine: Sdl3GpuTextEngine,
    private var handle: MemorySegment,
    gpa: SegmentAllocator,
) : AutoCloseable {

    private class Batch(
        val texture: MemorySegment,
        val firstIndex: Int,
        val indexCount: Int,
        val vertexOffset: Int,
    )

    private val vertexBinding = SDL_GPUBufferBinding.allocate(gpa).fill(0)
    private val indexBinding = SDL_GPUBufferBinding.allocate(gpa).fill(0)
    private val samplerBinding = SDL_GPUTextureSamplerBinding.allocate(gpa).fill(0)
    private val uniforms = gpa.allocate(32, 16).fill(0)
    private var vertexBuffer = MemorySegment.NULL
    private var indexBuffer = MemorySegment.NULL
    private var transferBuffer = MemorySegment.NULL
    private var vertexCapacity = 0
    private var indexCapacity = 0
    private var batches: List<Batch> = emptyList()
    private var value: String? = null

    init {
        SDL_GPUTextureSamplerBinding.sampler(samplerBinding, engine.sampler)
        setColor(red = 0f, green = 0f, blue = 0f)
    }

    fun setPosition(x: Float, y: Float) {
        uniforms.set(ValueLayout.JAVA_FLOAT, 8L, x)
        uniforms.set(ValueLayout.JAVA_FLOAT, 12L, y)
    }

    fun setColor(red: Float, green: Float, blue: Float, alpha: Float = 1f) {
        uniforms.set(ValueLayout.JAVA_FLOAT, 16L, red)
        uniforms.set(ValueLayout.JAVA_FLOAT, 20L, green)
        uniforms.set(ValueLayout.JAVA_FLOAT, 24L, blue)
        uniforms.set(ValueLayout.JAVA_FLOAT, 28L, alpha)
    }

    context(gpa: SegmentAllocator)
    fun setText(text: String) {
        check(handle.address() != 0L)
        if (text == value) return
        check(SDL3Ttf.TTF_SetTextString(handle, gpa.allocateFrom(text), 0L)) {
            errorMessage("Failed to update text")
        }
        check(SDL3Ttf.TTF_UpdateText(handle)) { errorMessage("Failed to update text layout") }
        updateGeometry()
        value = text
    }

    context(gpa: SegmentAllocator)
    private fun updateGeometry() {
        val sequences = ArrayList<MemorySegment>()
        var next = SDL3Ttf.TTF_GetGPUTextDrawData(handle)
        var vertexCount = 0
        var indexCount = 0
        while (next.address() != 0L) {
            val sequence = next.reinterpret(TTF_GPUAtlasDrawSequence.sizeof())
            val type = TTF_GPUAtlasDrawSequence.image_type(sequence)
            check(type == SDL3Ttf.TTF_IMAGE_ALPHA() || type == SDL3Ttf.TTF_IMAGE_COLOR()) {
                "Unsupported GPU text image type: $type"
            }
            assert(TTF_GPUAtlasDrawSequence.num_vertices(sequence) >= 0)
            assert(TTF_GPUAtlasDrawSequence.num_indices(sequence) >= 0)
            vertexCount = Math.addExact(vertexCount, TTF_GPUAtlasDrawSequence.num_vertices(sequence))
            indexCount = Math.addExact(indexCount, TTF_GPUAtlasDrawSequence.num_indices(sequence))
            sequences.add(sequence)
            next = TTF_GPUAtlasDrawSequence.next(sequence)
        }
        if (indexCount == 0) {
            batches = emptyList()
            return
        }
        val vertexBytes = Math.multiplyExact(vertexCount, 16)
        val indexBytes = Math.multiplyExact(indexCount, 4)
        ensureBuffers(vertexBytes = vertexBytes, indexBytes = indexBytes)
        val mapped = SDL3.SDL_MapGPUTransferBuffer(engine.device, transferBuffer, true)
        check(mapped.address() != 0L) { errorMessage("Failed to map text transfer buffer") }
        val data = mapped.reinterpret(vertexCapacity.toLong() + indexCapacity)
        val updated = ArrayList<Batch>(sequences.size)
        var vertexOffset = 0
        var firstIndex = 0
        try {
            for (sequence in sequences) {
                val vertices = TTF_GPUAtlasDrawSequence.num_vertices(sequence)
                val indices = TTF_GPUAtlasDrawSequence.num_indices(sequence)
                val xy = TTF_GPUAtlasDrawSequence.xy(sequence).reinterpret(vertices * 8L)
                val uv = TTF_GPUAtlasDrawSequence.uv(sequence).reinterpret(vertices * 8L)
                for (index in 0 until vertices) {
                    val offset = (vertexOffset + index) * 16L
                    MemorySegment.copy(xy, index * 8L, data, offset, 8L)
                    MemorySegment.copy(uv, index * 8L, data, offset + 8L, 8L)
                }
                MemorySegment.copy(
                    TTF_GPUAtlasDrawSequence.indices(sequence).reinterpret(indices * 4L),
                    0L,
                    data,
                    vertexCapacity + firstIndex * 4L,
                    indices * 4L,
                )
                updated.add(
                    Batch(
                        texture = TTF_GPUAtlasDrawSequence.atlas_texture(sequence),
                        firstIndex = firstIndex,
                        indexCount = indices,
                        vertexOffset = vertexOffset,
                    ),
                )
                vertexOffset += vertices
                firstIndex += indices
            }
        } finally {
            SDL3.SDL_UnmapGPUTransferBuffer(engine.device, transferBuffer)
        }
        upload(vertexBytes = vertexBytes, indexBytes = indexBytes)
        batches = updated
    }

    context(gpa: SegmentAllocator)
    private fun ensureBuffers(vertexBytes: Int, indexBytes: Int) {
        if (vertexBytes <= vertexCapacity && indexBytes <= indexCapacity) return
        releaseBuffers()
        vertexCapacity = maxOf(vertexBytes, vertexCapacity)
        indexCapacity = maxOf(indexBytes, indexCapacity)
        val info = SDL_GPUBufferCreateInfo.allocate(gpa).fill(0)
        SDL_GPUBufferCreateInfo.usage(info, SDL3.SDL_GPU_BUFFERUSAGE_VERTEX())
        SDL_GPUBufferCreateInfo.size(info, vertexCapacity)
        vertexBuffer = SDL3.SDL_CreateGPUBuffer(engine.device, info)
        check(vertexBuffer.address() != 0L) { errorMessage("Failed to create text vertex buffer") }
        SDL_GPUBufferCreateInfo.usage(info, SDL3.SDL_GPU_BUFFERUSAGE_INDEX())
        SDL_GPUBufferCreateInfo.size(info, indexCapacity)
        indexBuffer = SDL3.SDL_CreateGPUBuffer(engine.device, info)
        check(indexBuffer.address() != 0L) { errorMessage("Failed to create text index buffer") }
        val transferInfo = SDL_GPUTransferBufferCreateInfo.allocate(gpa).fill(0)
        SDL_GPUTransferBufferCreateInfo.usage(transferInfo, SDL3.SDL_GPU_TRANSFERBUFFERUSAGE_UPLOAD())
        SDL_GPUTransferBufferCreateInfo.size(transferInfo, Math.addExact(vertexCapacity, indexCapacity))
        transferBuffer = SDL3.SDL_CreateGPUTransferBuffer(engine.device, transferInfo)
        check(transferBuffer.address() != 0L) { errorMessage("Failed to create text transfer buffer") }
        SDL_GPUBufferBinding.buffer(vertexBinding, vertexBuffer)
        SDL_GPUBufferBinding.buffer(indexBinding, indexBuffer)
    }

    context(gpa: SegmentAllocator)
    private fun upload(vertexBytes: Int, indexBytes: Int) {
        val source = SDL_GPUTransferBufferLocation.allocate(gpa).fill(0)
        SDL_GPUTransferBufferLocation.transfer_buffer(source, transferBuffer)
        val destination = SDL_GPUBufferRegion.allocate(gpa).fill(0)
        val command = SDL3.SDL_AcquireGPUCommandBuffer(engine.device)
        check(command.address() != 0L) { errorMessage("Failed to acquire text upload command buffer") }
        val copy = SDL3.SDL_BeginGPUCopyPass(command)
        if (copy.address() == 0L) {
            SDL3.SDL_CancelGPUCommandBuffer(command)
            error(errorMessage("Failed to begin text upload"))
        }
        SDL_GPUBufferRegion.buffer(destination, vertexBuffer)
        SDL_GPUBufferRegion.size(destination, vertexBytes)
        SDL3.SDL_UploadToGPUBuffer(copy, source, destination, true)
        SDL_GPUTransferBufferLocation.offset(source, vertexCapacity)
        SDL_GPUBufferRegion.buffer(destination, indexBuffer)
        SDL_GPUBufferRegion.size(destination, indexBytes)
        SDL3.SDL_UploadToGPUBuffer(copy, source, destination, true)
        SDL3.SDL_EndGPUCopyPass(copy)
        check(SDL3.SDL_SubmitGPUCommandBuffer(command)) { errorMessage("Failed to submit text upload") }
    }

    internal fun draw(
        device: MemorySegment,
        command: MemorySegment,
        pass: MemorySegment,
        width: Int,
        height: Int,
    ) {
        check(handle.address() != 0L)
        check(device.address() == engine.device.address())
        if (batches.isEmpty()) return
        uniforms.set(ValueLayout.JAVA_FLOAT, 0L, width.toFloat())
        uniforms.set(ValueLayout.JAVA_FLOAT, 4L, height.toFloat())
        SDL3.SDL_PushGPUVertexUniformData(command, 0, uniforms, 32)
        SDL3.SDL_BindGPUGraphicsPipeline(pass, engine.pipeline)
        SDL3.SDL_BindGPUVertexBuffers(pass, 0, vertexBinding, 1)
        SDL3.SDL_BindGPUIndexBuffer(pass, indexBinding, SDL3.SDL_GPU_INDEXELEMENTSIZE_32BIT())
        for (batch in batches) {
            SDL_GPUTextureSamplerBinding.texture(samplerBinding, batch.texture)
            SDL3.SDL_BindGPUFragmentSamplers(pass, 0, samplerBinding, 1)
            SDL3.SDL_DrawGPUIndexedPrimitives(pass, batch.indexCount, 1, batch.firstIndex, batch.vertexOffset, 0)
        }
    }

    private fun releaseBuffers() {
        if (transferBuffer.address() != 0L) SDL3.SDL_ReleaseGPUTransferBuffer(engine.device, transferBuffer)
        if (indexBuffer.address() != 0L) SDL3.SDL_ReleaseGPUBuffer(engine.device, indexBuffer)
        if (vertexBuffer.address() != 0L) SDL3.SDL_ReleaseGPUBuffer(engine.device, vertexBuffer)
        transferBuffer = MemorySegment.NULL
        indexBuffer = MemorySegment.NULL
        vertexBuffer = MemorySegment.NULL
    }

    override fun close() {
        if (handle.address() != 0L) {
            SDL3Ttf.TTF_DestroyText(handle)
            handle = MemorySegment.NULL
            releaseBuffers()
            batches = emptyList()
        }
    }
}
