package com.varlanv.klab.renderer

import com.varlanv.klab.collections.Bytes
import com.varlanv.klab.sdl3.*
import java.lang.foreign.MemorySegment
import java.lang.foreign.SegmentAllocator
import java.lang.foreign.ValueLayout

class TextRenderer private constructor(
    private val device: Sdl3GpuDevice,
    private val engine: Sdl3GpuTextEngine,
    private val pipeline: Sdl3GpuGraphicsPipeline,
    private val sampler: Sdl3GpuSampler,
) : AutoCloseable {

    private val texts = ArrayList<Text>()
    private var vertexBuffer: Sdl3GpuBuffer? = null
    private var indexBuffer: Sdl3GpuBuffer? = null
    private var transferBuffer: Sdl3GpuTransferBuffer? = null
    private var vertexCount = 0
    private var indexCount = 0
    private var geometryDirty = true
    private var uploadPending = false
    private var uploadRecorded = false
    private var closed = false

    fun createText(font: Sdl3Font, text: String = ""): Text {
        checkOpen()
        val native = engine.createText(font)
        try {
            val result = Text(owner = this, native = native, content = text)
            texts.add(result)
            geometryDirty = true
            return result
        } catch (failure: Throwable) {
            native.close()
            throw failure
        }
    }

    internal fun remove(text: Text) {
        check(texts.remove(text))
        geometryDirty = true
    }

    context(gpa: SegmentAllocator)
    fun prepare() {
        checkOpen()
        uploadRecorded = false
        for (text in texts) {
            if (text.dirty) {
                text.prepare()
                geometryDirty = true
            }
        }
        if (!geometryDirty) return
        var vertices = 0
        var indices = 0
        for (text in texts) {
            text.firstVertex = vertices
            text.firstIndex = indices
            vertices = Math.addExact(vertices, text.vertexCount)
            indices = Math.addExact(indices, text.indexCount)
        }
        vertexCount = vertices
        indexCount = indices
        uploadPending = indices > 0
        geometryDirty = false
    }

    context(gpa: SegmentAllocator)
    fun upload(command: Sdl3GpuCommandBuffer) {
        checkOpen()
        check(!geometryDirty && texts.none { it.dirty }) { "Prepare text before uploading" }
        if (!uploadPending) return
        val vertexBytes = Math.multiplyExact(vertexCount, 16)
        val indexBytes = Math.multiplyExact(indexCount, 4)
        ensureBuffers(vertexBytes = vertexBytes, indexBytes = indexBytes)
        val vertices = checkNotNull(vertexBuffer)
        val indices = checkNotNull(indexBuffer)
        val transfer = checkNotNull(transferBuffer)
        val data = transfer.map()
        try {
            for (text in texts) {
                MemorySegment.copy(
                    MemorySegment.ofArray(text.vertices), 0L,
                    data, text.firstVertex * 16L, text.vertexCount * 16L,
                )
                MemorySegment.copy(
                    MemorySegment.ofArray(text.indices), 0L,
                    data, vertices.size + text.firstIndex * 4L, text.indexCount * 4L,
                )
            }
        } finally {
            transfer.unmap()
        }
        command.beginCopyPass().use { copy ->
            copy.upload(source = transfer, destination = vertices, size = vertexBytes)
            copy.upload(source = transfer, destination = indices, size = indexBytes, sourceOffset = vertices.size)
        }
        uploadRecorded = true
    }

    internal fun commitUploads() {
        if (uploadRecorded) uploadPending = false
        uploadRecorded = false
    }

    context(gpa: SegmentAllocator)
    fun draw(pass: Sdl3GpuRenderPass) {
        checkOpen()
        check(!geometryDirty && (!uploadPending || uploadRecorded) && texts.none { it.dirty }) {
            "Prepare and upload text before drawing"
        }
        if (indexCount == 0) return
        pass.bindPipeline(pipeline)
        pass.bindVertexBuffer(checkNotNull(vertexBuffer))
        pass.bindIndexBuffer(checkNotNull(indexBuffer))
        val uniforms = gpa.allocate(32, 16)
        uniforms.set(ValueLayout.JAVA_FLOAT, 0L, pass.width.toFloat())
        uniforms.set(ValueLayout.JAVA_FLOAT, 4L, pass.height.toFloat())
        for (text in texts) {
            if (text.indexCount == 0) continue
            uniforms.set(ValueLayout.JAVA_FLOAT, 8L, text.x)
            uniforms.set(ValueLayout.JAVA_FLOAT, 12L, text.y)
            uniforms.set(ValueLayout.JAVA_FLOAT, 16L, text.red)
            uniforms.set(ValueLayout.JAVA_FLOAT, 20L, text.green)
            uniforms.set(ValueLayout.JAVA_FLOAT, 24L, text.blue)
            uniforms.set(ValueLayout.JAVA_FLOAT, 28L, text.alpha)
            pass.pushVertexUniform(slot = 0, data = uniforms)
            for (batch in text.textures.indices) {
                pass.bindFragmentSampler(texture = text.textures[batch], sampler = sampler)
                pass.drawIndexed(
                    indexCount = text.batchIndexCounts[batch],
                    firstIndex = text.firstIndex + text.batchFirstIndices[batch],
                    vertexOffset = text.firstVertex + text.batchVertexOffsets[batch],
                )
            }
        }
    }

    context(gpa: SegmentAllocator)
    private fun ensureBuffers(vertexBytes: Int, indexBytes: Int) {
        val oldVertexSize = vertexBuffer?.size ?: 0
        val oldIndexSize = indexBuffer?.size ?: 0
        if (vertexBytes <= oldVertexSize && indexBytes <= oldIndexSize) return
        val vertexSize = if (vertexBytes > oldVertexSize) growCapacity(oldVertexSize, vertexBytes) else oldVertexSize
        val indexSize = if (indexBytes > oldIndexSize) growCapacity(oldIndexSize, indexBytes) else oldIndexSize
        val vertices = device.createBuffer(usage = Sdl3GpuBufferUsage.Vertex, size = vertexSize)
        var indices: Sdl3GpuBuffer? = null
        var transfer: Sdl3GpuTransferBuffer? = null
        try {
            indices = device.createBuffer(usage = Sdl3GpuBufferUsage.Index, size = indexSize)
            transfer = device.createTransferBuffer(Math.addExact(vertexSize, indexSize))
        } catch (failure: Throwable) {
            transfer?.close()
            indices?.close()
            vertices.close()
            throw failure
        }
        transferBuffer?.close()
        indexBuffer?.close()
        vertexBuffer?.close()
        vertexBuffer = vertices
        indexBuffer = indices
        transferBuffer = transfer
    }

    internal fun checkOpen() {
        check(!closed) { "Text renderer is closed" }
    }

    override fun close() {
        if (!closed) {
            while (texts.isNotEmpty()) texts.last().close()
            transferBuffer?.close()
            indexBuffer?.close()
            vertexBuffer?.close()
            sampler.close()
            pipeline.close()
            engine.close()
            closed = true
        }
    }

    companion object {
        context(gpa: SegmentAllocator)
        fun create(device: Sdl3GpuDevice, targetFormat: Sdl3GpuTextureFormat, shader: Bytes): TextRenderer {
            val engine = device.createTextEngine()
            var pipeline: Sdl3GpuGraphicsPipeline? = null
            var sampler: Sdl3GpuSampler? = null
            try {
                device.createShader(
                    code = shader, entrypoint = "vertexMain", stage = Sdl3GpuShaderStage.Vertex,
                    uniformBufferCount = 1,
                ).use { vertex ->
                    device.createShader(
                        code = shader, entrypoint = "fragmentMain", stage = Sdl3GpuShaderStage.Fragment,
                        samplerCount = 1,
                    ).use { fragment ->
                        pipeline = device.createGraphicsPipeline(
                            vertexShader = vertex,
                            fragmentShader = fragment,
                            targetFormat = targetFormat,
                            vertexPitch = 16,
                            attributes = listOf(
                                Sdl3GpuVertexAttribute(location = 0, offset = 0, format = Sdl3GpuVertexFormat.Float2),
                                Sdl3GpuVertexAttribute(location = 1, offset = 8, format = Sdl3GpuVertexFormat.Float2),
                            ),
                            alphaBlend = true,
                        )
                    }
                }
                sampler = device.createSampler()
                return TextRenderer(device = device, engine = engine, pipeline = checkNotNull(pipeline), sampler = sampler)
            } catch (failure: Throwable) {
                sampler?.close()
                pipeline?.close()
                engine.close()
                throw failure
            }
        }
    }
}
