package com.varlanv.klab.renderer

import com.varlanv.klab.collections.Bytes
import com.varlanv.klab.collections.MutFloats
import com.varlanv.klab.glb.GlbModel
import com.varlanv.klab.sdl3.*
import java.lang.foreign.MemorySegment
import java.lang.foreign.SegmentAllocator
import java.lang.foreign.ValueLayout

internal class ModelRenderer private constructor(
    private val device: Sdl3GpuDevice,
    private val pipeline: Sdl3GpuGraphicsPipeline,
    private val camera: Camera3D,
) : AutoCloseable {

    private val models = ArrayList<GpuModel>()
    private val queued = ArrayList<GpuModel>()
    private var placements = MutFloats(0)
    private var closed = false

    val hasGeometry: Boolean get() = queued.isNotEmpty()

    context(gpa: SegmentAllocator)
    fun upload(source: GlbModel): GpuModel {
        checkOpen()
        val model = GpuModel.upload(device = device, source = source)
        try {
            models.add(model)
            return model
        } catch (failure: Throwable) {
            model.close()
            throw failure
        }
    }

    fun draw(model: GpuModel, x: Float, y: Float, z: Float, scale: Float) {
        checkOpen()
        model.checkOpen()
        require(model.device === device) { "Model belongs to a different GPU device" }
        require(x.isFinite() && y.isFinite() && z.isFinite())
        require(scale.isFinite() && scale > 0f)
        val offset = Math.multiplyExact(queued.size, 4)
        val required = Math.addExact(offset, 4)
        if (placements.size < required) {
            placements = placements.copyOf(growCapacity(current = placements.size, required = required))
        }
        placements[offset] = x
        placements[offset + 1] = y
        placements[offset + 2] = z
        placements[offset + 3] = scale
        queued.add(model)
    }

    context(gpa: SegmentAllocator)
    fun render(pass: Sdl3GpuRenderPass) {
        checkOpen()
        if (!hasGeometry) return
        val vertexUniforms = gpa.allocate(160, 16)
        val fragmentUniforms = gpa.allocate(32, 16).fill(0)
        camera.writeUniforms(destination = vertexUniforms, width = pass.width, height = pass.height)
        pass.bindPipeline(pipeline)
        for (index in queued.indices) {
            val model = queued[index]
            model.checkOpen()
            MemorySegment.copy(MemorySegment.ofArray(placements), index * 16L, vertexUniforms, 144L, 16L)
            for (node in model.nodes) {
                MemorySegment.copy(MemorySegment.ofArray(node.transform), 0L, vertexUniforms, 80L, 64L)
                pass.pushVertexUniform(slot = 0, data = vertexUniforms)
                for (primitive in model.meshes[node.meshIndex]) {
                    val material = primitive.material
                    MemorySegment.copy(MemorySegment.ofArray(material.baseColor), 0L, fragmentUniforms, 0L, 16L)
                    fragmentUniforms.set(ValueLayout.JAVA_FLOAT, 16L, material.alphaCutoff)
                    fragmentUniforms.set(ValueLayout.JAVA_FLOAT, 20L, if (material.unlit) 1f else 0f)
                    pass.pushFragmentUniform(slot = 0, data = fragmentUniforms)
                    pass.bindVertexBuffer(primitive.vertices)
                    pass.bindIndexBuffer(primitive.indices)
                    pass.bindFragmentSampler(texture = material.texture.texture, sampler = material.sampler)
                    pass.drawIndexed(indexCount = primitive.indexCount)
                }
            }
        }
    }

    fun clear() {
        queued.clear()
    }

    private fun checkOpen() {
        check(!closed) { "Model renderer is closed" }
    }

    override fun close() {
        if (!closed) {
            closed = true
            queued.clear()
            try {
                closeResources(models.asReversed() + pipeline)
            } finally {
                models.clear()
            }
        }
    }

    companion object {
        context(gpa: SegmentAllocator)
        fun create(
            device: Sdl3GpuDevice,
            targetFormat: Sdl3GpuTextureFormat,
            depthFormat: Sdl3GpuTextureFormat,
            shader: Bytes,
            camera: Camera3D,
        ): ModelRenderer {
            device.createShader(
                code = shader, entrypoint = "vertexMain", stage = Sdl3GpuShaderStage.Vertex,
                uniformBufferCount = 1,
            ).use { vertex ->
                device.createShader(
                    code = shader, entrypoint = "fragmentMain", stage = Sdl3GpuShaderStage.Fragment,
                    samplerCount = 1, uniformBufferCount = 1,
                ).use { fragment ->
                    val pipeline = device.createGraphicsPipeline(
                        vertexShader = vertex, fragmentShader = fragment, targetFormat = targetFormat,
                        vertexPitch = 32,
                        attributes = listOf(
                            Sdl3GpuVertexAttribute(location = 0, offset = 0, format = Sdl3GpuVertexFormat.Float3),
                            Sdl3GpuVertexAttribute(location = 1, offset = 12, format = Sdl3GpuVertexFormat.Float3),
                            Sdl3GpuVertexAttribute(location = 2, offset = 24, format = Sdl3GpuVertexFormat.Float2),
                        ),
                        depthFormat = depthFormat, depthTest = true, depthWrite = true,
                    )
                    return ModelRenderer(device = device, pipeline = pipeline, camera = camera)
                }
            }
        }
    }
}
