package com.varlanv.klab.sdl3

import com.varlanv.klab.Io
import com.varlanv.klab.collections.Bytes
import com.varlanv.klab.sdl3.ffi.generated.*
import com.varlanv.klab.sdl3.ffi.generated.ttf.SDL3Ttf
import java.lang.foreign.MemorySegment
import java.lang.foreign.SegmentAllocator

class Sdl3GpuTextEngine private constructor(
    internal val device: MemorySegment,
    private var handle: MemorySegment,
    internal val pipeline: MemorySegment,
    internal val sampler: MemorySegment,
) : AutoCloseable {

    context(gpa: SegmentAllocator)
    fun createText(font: Sdl3Font, text: String): Sdl3GpuText {
        check(handle.address() != 0L)
        check(font.handle.address() != 0L)
        val textHandle = SDL3Ttf.TTF_CreateText(handle, font.handle, MemorySegment.NULL, 0L)
        check(textHandle.address() != 0L) { errorMessage("Failed to create text") }
        val result = Sdl3GpuText(engine = this, handle = textHandle, gpa = gpa)
        try {
            result.setText(text)
            return result
        } catch (failure: Throwable) {
            result.close()
            throw failure
        }
    }

    override fun close() {
        if (handle.address() != 0L) {
            SDL3Ttf.TTF_DestroyGPUTextEngine(handle)
            SDL3.SDL_ReleaseGPUSampler(device, sampler)
            SDL3.SDL_ReleaseGPUGraphicsPipeline(device, pipeline)
            handle = MemorySegment.NULL
        }
    }

    companion object {

        context(gpa: SegmentAllocator, io: Io)
        internal fun create(
            device: MemorySegment,
            window: MemorySegment,
            shader: Bytes,
        ): Sdl3GpuTextEngine {
            val handle = SDL3Ttf.TTF_CreateGPUTextEngine(device)
            check(handle.address() != 0L) { errorMessage("Failed to create GPU text engine") }
            var pipeline = MemorySegment.NULL
            var sampler = MemorySegment.NULL
            try {
                pipeline = createPipeline(device = device, window = window, shader = shader)
                val info = SDL_GPUSamplerCreateInfo.allocate(gpa).fill(0)
                SDL_GPUSamplerCreateInfo.min_filter(info, SDL3.SDL_GPU_FILTER_LINEAR())
                SDL_GPUSamplerCreateInfo.mag_filter(info, SDL3.SDL_GPU_FILTER_LINEAR())
                SDL_GPUSamplerCreateInfo.address_mode_u(info, SDL3.SDL_GPU_SAMPLERADDRESSMODE_CLAMP_TO_EDGE())
                SDL_GPUSamplerCreateInfo.address_mode_v(info, SDL3.SDL_GPU_SAMPLERADDRESSMODE_CLAMP_TO_EDGE())
                SDL_GPUSamplerCreateInfo.address_mode_w(info, SDL3.SDL_GPU_SAMPLERADDRESSMODE_CLAMP_TO_EDGE())
                sampler = SDL3.SDL_CreateGPUSampler(device, info)
                check(sampler.address() != 0L) { errorMessage("Failed to create text sampler") }
                return Sdl3GpuTextEngine(
                    device = device,
                    handle = handle,
                    pipeline = pipeline,
                    sampler = sampler,
                )
            } catch (failure: Throwable) {
                if (sampler.address() != 0L) {
                    io.debug { "calling [ SDL_ReleaseGPUSampler ]" }
                    SDL3.SDL_ReleaseGPUSampler(device, sampler)
                }
                if (pipeline.address() != 0L) {
                    io.debug { "calling [ SDL_ReleaseGPUGraphicsPipeline ]" }
                    SDL3.SDL_ReleaseGPUGraphicsPipeline(device, pipeline)
                }
                io.debug { "calling [ TTF_DestroyGPUTextEngine ]" }
                SDL3Ttf.TTF_DestroyGPUTextEngine(handle)
                throw failure
            }
        }

        context(gpa: SegmentAllocator)
        private fun createPipeline(
            device: MemorySegment,
            window: MemorySegment,
            shader: Bytes,
        ): MemorySegment {
            val code = gpa.allocate(shader.size.toLong(), 4)
            MemorySegment.copy(MemorySegment.ofArray(shader), 0L, code, 0L, code.byteSize())
            val shaderInfo = SDL_GPUShaderCreateInfo.allocate(gpa).fill(0)
            SDL_GPUShaderCreateInfo.code(shaderInfo, code)
            SDL_GPUShaderCreateInfo.code_size(shaderInfo, code.byteSize())
            SDL_GPUShaderCreateInfo.format(shaderInfo, SDL3.SDL_GPU_SHADERFORMAT_SPIRV())
            SDL_GPUShaderCreateInfo.stage(shaderInfo, SDL3.SDL_GPU_SHADERSTAGE_VERTEX())
            SDL_GPUShaderCreateInfo.entrypoint(shaderInfo, gpa.allocateFrom("vertexMain"))
            SDL_GPUShaderCreateInfo.num_uniform_buffers(shaderInfo, 1)
            val vertex = SDL3.SDL_CreateGPUShader(device, shaderInfo)
            check(vertex.address() != 0L) { errorMessage("Failed to create text vertex shader") }
            var fragment = MemorySegment.NULL
            try {
                SDL_GPUShaderCreateInfo.stage(shaderInfo, SDL3.SDL_GPU_SHADERSTAGE_FRAGMENT())
                SDL_GPUShaderCreateInfo.entrypoint(shaderInfo, gpa.allocateFrom("fragmentMain"))
                SDL_GPUShaderCreateInfo.num_uniform_buffers(shaderInfo, 0)
                SDL_GPUShaderCreateInfo.num_samplers(shaderInfo, 1)
                fragment = SDL3.SDL_CreateGPUShader(device, shaderInfo)
                check(fragment.address() != 0L) { errorMessage("Failed to create text fragment shader") }

                val info = SDL_GPUGraphicsPipelineCreateInfo.allocate(gpa).fill(0)
                SDL_GPUGraphicsPipelineCreateInfo.vertex_shader(info, vertex)
                SDL_GPUGraphicsPipelineCreateInfo.fragment_shader(info, fragment)
                SDL_GPUGraphicsPipelineCreateInfo.primitive_type(info, SDL3.SDL_GPU_PRIMITIVETYPE_TRIANGLELIST())

                val buffer = SDL_GPUVertexBufferDescription.allocate(gpa).fill(0)
                SDL_GPUVertexBufferDescription.pitch(buffer, 16)
                val attributes = SDL_GPUVertexAttribute.allocateArray(2, gpa).fill(0)
                for (index in 0..1) {
                    val attribute = SDL_GPUVertexAttribute.asSlice(attributes, index.toLong())
                    SDL_GPUVertexAttribute.location(attribute, index)
                    SDL_GPUVertexAttribute.format(attribute, SDL3.SDL_GPU_VERTEXELEMENTFORMAT_FLOAT2())
                    SDL_GPUVertexAttribute.offset(attribute, index * 8)
                }
                val input = SDL_GPUGraphicsPipelineCreateInfo.vertex_input_state(info)
                SDL_GPUVertexInputState.vertex_buffer_descriptions(input, buffer)
                SDL_GPUVertexInputState.num_vertex_buffers(input, 1)
                SDL_GPUVertexInputState.vertex_attributes(input, attributes)
                SDL_GPUVertexInputState.num_vertex_attributes(input, 2)

                val target = SDL_GPUColorTargetDescription.allocate(gpa).fill(0)
                SDL_GPUColorTargetDescription.format(target, SDL3.SDL_GetGPUSwapchainTextureFormat(device, window))
                val blend = SDL_GPUColorTargetDescription.blend_state(target)
                SDL_GPUColorTargetBlendState.enable_blend(blend, true)
                SDL_GPUColorTargetBlendState.src_color_blendfactor(blend, SDL3.SDL_GPU_BLENDFACTOR_SRC_ALPHA())
                SDL_GPUColorTargetBlendState.dst_color_blendfactor(
                    blend,
                    SDL3.SDL_GPU_BLENDFACTOR_ONE_MINUS_SRC_ALPHA()
                )
                SDL_GPUColorTargetBlendState.color_blend_op(blend, SDL3.SDL_GPU_BLENDOP_ADD())
                SDL_GPUColorTargetBlendState.src_alpha_blendfactor(blend, SDL3.SDL_GPU_BLENDFACTOR_ONE())
                SDL_GPUColorTargetBlendState.dst_alpha_blendfactor(
                    blend,
                    SDL3.SDL_GPU_BLENDFACTOR_ONE_MINUS_SRC_ALPHA()
                )
                SDL_GPUColorTargetBlendState.alpha_blend_op(blend, SDL3.SDL_GPU_BLENDOP_ADD())
                val targets = SDL_GPUGraphicsPipelineCreateInfo.target_info(info)
                SDL_GPUGraphicsPipelineTargetInfo.color_target_descriptions(targets, target)
                SDL_GPUGraphicsPipelineTargetInfo.num_color_targets(targets, 1)
                val pipeline = SDL3.SDL_CreateGPUGraphicsPipeline(device, info)
                check(pipeline.address() != 0L) { errorMessage("Failed to create text graphics pipeline") }
                return pipeline
            } finally {
                if (fragment.address() != 0L) SDL3.SDL_ReleaseGPUShader(device, fragment)
                SDL3.SDL_ReleaseGPUShader(device, vertex)
            }
        }
    }
}
