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
    private val mesh = MeshBuffers(device)
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

    fun prepare(gpa: SegmentAllocator) {
        checkOpen()
        uploadRecorded = false
        for (text in texts) {
            if (text.dirty) {
                text.prepare(gpa)
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

    fun upload(gpa: SegmentAllocator, command: Sdl3GpuCommandBuffer) {
        checkOpen()
        check(!geometryDirty && texts.none { it.dirty }) { "Prepare text before uploading" }
        if (!uploadPending) return
        val vertexBytes = Math.multiplyExact(vertexCount, 16)
        val indexBytes = Math.multiplyExact(indexCount, 4)
        val data = mesh.map(gpa = gpa, vertexBytes = vertexBytes, indexBytes = indexBytes)
        try {
            for (text in texts) {
                MemorySegment.copy(
                    MemorySegment.ofArray(text.vertices), 0L,
                    data, text.firstVertex * 16L, text.vertexCount * 16L,
                )
                MemorySegment.copy(
                    MemorySegment.ofArray(text.indices), 0L,
                    data, mesh.indexOffset + text.firstIndex * 4L, text.indexCount * 4L,
                )
            }
        } finally {
            mesh.unmap()
        }
        mesh.upload(gpa = gpa, command = command, vertexBytes = vertexBytes, indexBytes = indexBytes)
        uploadRecorded = true
    }

    internal fun commitUploads() {
        if (uploadRecorded) uploadPending = false
        uploadRecorded = false
    }

    fun draw(gpa: SegmentAllocator,pass: Sdl3GpuRenderPass) {
        checkOpen()
        check(!geometryDirty && (!uploadPending || uploadRecorded) && texts.none { it.dirty }) {
            "Prepare and upload text before drawing"
        }
        if (indexCount == 0) return
        pass.bindPipeline(pipeline)
        mesh.bind(gpa,pass)
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
                pass.bindFragmentSampler(gpa=gpa,texture = text.textures[batch], sampler = sampler)
                pass.drawIndexed(
                    indexCount = text.batchIndexCounts[batch],
                    firstIndex = text.firstIndex + text.batchFirstIndices[batch],
                    vertexOffset = text.firstVertex + text.batchVertexOffsets[batch],
                )
            }
        }
    }

    internal fun checkOpen() {
        check(!closed) { "Text renderer is closed" }
    }

    override fun close() {
        if (!closed) {
            while (texts.isNotEmpty()) texts.last().close()
            mesh.close()
            sampler.close()
            pipeline.close()
            engine.close()
            closed = true
        }
    }

    companion object {
        fun create(
            gpa: SegmentAllocator,
            device: Sdl3GpuDevice,
            targetFormat: Sdl3GpuTextureFormat,
            shader: Bytes
        ): TextRenderer {
            val engine = device.createTextEngine()
            var pipeline: Sdl3GpuGraphicsPipeline? = null
            var sampler: Sdl3GpuSampler? = null
            try {
                device.createShader(
                    gpa = gpa,
                    code = shader, entrypoint = "vertexMain", stage = Sdl3GpuShaderStage.Vertex,
                    uniformBufferCount = 1,
                ).use { vertex ->
                    device.createShader(
                        gpa = gpa,
                        code = shader, entrypoint = "fragmentMain", stage = Sdl3GpuShaderStage.Fragment,
                        samplerCount = 1,
                    ).use { fragment ->
                        pipeline = device.createGraphicsPipeline(
                            gpa = gpa,
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
                sampler = device.createSampler(gpa)
                return TextRenderer(
                    device = device,
                    engine = engine,
                    pipeline = checkNotNull(pipeline),
                    sampler = sampler
                )
            } catch (failure: Throwable) {
                sampler?.close()
                pipeline?.close()
                engine.close()
                throw failure
            }
        }
    }
}
