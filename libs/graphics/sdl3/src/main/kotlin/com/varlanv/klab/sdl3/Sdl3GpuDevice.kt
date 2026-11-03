package com.varlanv.klab.sdl3

import com.varlanv.klab.collections.Bytes
import com.varlanv.klab.sdl3.ffi.generated.*
import com.varlanv.klab.sdl3.ffi.generated.ttf.SDL3Ttf
import java.lang.foreign.MemorySegment
import java.lang.foreign.SegmentAllocator

class Sdl3GpuDevice internal constructor(internal var handle: MemorySegment) : AutoCloseable {

    private var selectedDepthFormat = 0

    val depthTextureFormat: Sdl3GpuTextureFormat
        get() {
            checkOpen()
            if (selectedDepthFormat == 0) {
                selectedDepthFormat = when {
                    supportsDepthFormat(SDL3.SDL_GPU_TEXTUREFORMAT_D32_FLOAT()) -> SDL3.SDL_GPU_TEXTUREFORMAT_D32_FLOAT()
                    supportsDepthFormat(SDL3.SDL_GPU_TEXTUREFORMAT_D24_UNORM()) -> SDL3.SDL_GPU_TEXTUREFORMAT_D24_UNORM()
                    supportsDepthFormat(SDL3.SDL_GPU_TEXTUREFORMAT_D16_UNORM()) -> SDL3.SDL_GPU_TEXTUREFORMAT_D16_UNORM()
                    else -> error("GPU device does not support a depth texture format")
                }
            }
            return Sdl3GpuTextureFormat(selectedDepthFormat)
        }

    private fun supportsDepthFormat(format: Int): Boolean = SDL3.SDL_GPUTextureSupportsFormat(
        handle,
        format,
        SDL3.SDL_GPU_TEXTURETYPE_2D(),
        SDL3.SDL_GPU_TEXTUREUSAGE_DEPTH_STENCIL_TARGET(),
    )

    internal fun checkOpen() {
        check(handle.address() != 0L) { "GPU device is closed" }
    }

    fun claimWindow(window: Sdl3Window): Sdl3GpuSwapchain {
        checkOpen()
        check(window.handle.address() != 0L) { "Window is closed" }
        check(SDL3.SDL_ClaimWindowForGPUDevice(handle, window.handle)) {
            errorMessage("Failed to create window swapchain")
        }
        try {
            return Sdl3GpuSwapchain(device = handle, window = window.handle)
        } catch (failure: Throwable) {
            SDL3.SDL_ReleaseWindowFromGPUDevice(handle, window.handle)
            throw failure
        }
    }

    fun acquireCommandBuffer(): Sdl3GpuCommandBuffer {
        checkOpen()
        val command = SDL3.SDL_AcquireGPUCommandBuffer(handle)
        check(command.address() != 0L) { errorMessage("Failed to acquire GPU command buffer") }
        return Sdl3GpuCommandBuffer(device = handle, handle = command)
    }

    fun createTextEngine(): Sdl3GpuTextEngine {
        checkOpen()
        val engine = SDL3Ttf.TTF_CreateGPUTextEngine(handle)
        check(engine.address() != 0L) { errorMessage("Failed to create GPU text engine") }
        return Sdl3GpuTextEngine(device = handle, handle = engine)
    }

    context(gpa: SegmentAllocator)
    fun createBuffer(usage: Sdl3GpuBufferUsage, size: Int): Sdl3GpuBuffer {
        checkOpen()
        require(size > 0)
        val info = SDL_GPUBufferCreateInfo.allocate(gpa).fill(0)
        SDL_GPUBufferCreateInfo.size(info, size)
        SDL_GPUBufferCreateInfo.usage(
            info,
            when (usage) {
                Sdl3GpuBufferUsage.Vertex -> SDL3.SDL_GPU_BUFFERUSAGE_VERTEX()
                Sdl3GpuBufferUsage.Index -> SDL3.SDL_GPU_BUFFERUSAGE_INDEX()
            },
        )
        val buffer = SDL3.SDL_CreateGPUBuffer(handle, info)
        check(buffer.address() != 0L) { errorMessage("Failed to create GPU buffer") }
        return Sdl3GpuBuffer(device = handle, handle = buffer, size = size, usage = usage)
    }

    context(gpa: SegmentAllocator)
    fun createTransferBuffer(size: Int): Sdl3GpuTransferBuffer {
        checkOpen()
        require(size > 0)
        val info = SDL_GPUTransferBufferCreateInfo.allocate(gpa).fill(0)
        SDL_GPUTransferBufferCreateInfo.size(info, size)
        SDL_GPUTransferBufferCreateInfo.usage(info, SDL3.SDL_GPU_TRANSFERBUFFERUSAGE_UPLOAD())
        val buffer = SDL3.SDL_CreateGPUTransferBuffer(handle, info)
        check(buffer.address() != 0L) { errorMessage("Failed to create GPU transfer buffer") }
        return Sdl3GpuTransferBuffer(device = handle, handle = buffer, size = size)
    }

    context(gpa: SegmentAllocator)
    fun createDepthTexture(width: Int, height: Int): Sdl3GpuDepthTexture {
        checkOpen()
        require(width > 0 && height > 0)
        val format = depthTextureFormat
        val info = SDL_GPUTextureCreateInfo.allocate(gpa).fill(0)
        SDL_GPUTextureCreateInfo.type(info, SDL3.SDL_GPU_TEXTURETYPE_2D())
        SDL_GPUTextureCreateInfo.format(info, format.value)
        SDL_GPUTextureCreateInfo.usage(info, SDL3.SDL_GPU_TEXTUREUSAGE_DEPTH_STENCIL_TARGET())
        SDL_GPUTextureCreateInfo.width(info, width)
        SDL_GPUTextureCreateInfo.height(info, height)
        SDL_GPUTextureCreateInfo.layer_count_or_depth(info, 1)
        SDL_GPUTextureCreateInfo.num_levels(info, 1)
        SDL_GPUTextureCreateInfo.sample_count(info, SDL3.SDL_GPU_SAMPLECOUNT_1())
        val texture = SDL3.SDL_CreateGPUTexture(handle, info)
        check(texture.address() != 0L) { errorMessage("Failed to create GPU depth texture") }
        return Sdl3GpuDepthTexture(device = handle, handle = texture, width = width, height = height, format = format)
    }

    context(gpa: SegmentAllocator)
    fun createSampledTexture(width: Int, height: Int, srgb: Boolean = true): Sdl3GpuSampledTexture {
        checkOpen()
        require(width > 0 && height > 0)
        val format = Sdl3GpuTextureFormat(
            if (srgb) SDL3.SDL_GPU_TEXTUREFORMAT_R8G8B8A8_UNORM_SRGB() else SDL3.SDL_GPU_TEXTUREFORMAT_R8G8B8A8_UNORM(),
        )
        val info = SDL_GPUTextureCreateInfo.allocate(gpa).fill(0)
        SDL_GPUTextureCreateInfo.type(info, SDL3.SDL_GPU_TEXTURETYPE_2D())
        SDL_GPUTextureCreateInfo.format(info, format.value)
        SDL_GPUTextureCreateInfo.usage(info, SDL3.SDL_GPU_TEXTUREUSAGE_SAMPLER())
        SDL_GPUTextureCreateInfo.width(info, width)
        SDL_GPUTextureCreateInfo.height(info, height)
        SDL_GPUTextureCreateInfo.layer_count_or_depth(info, 1)
        SDL_GPUTextureCreateInfo.num_levels(info, 1)
        SDL_GPUTextureCreateInfo.sample_count(info, SDL3.SDL_GPU_SAMPLECOUNT_1())
        val texture = SDL3.SDL_CreateGPUTexture(handle, info)
        check(texture.address() != 0L) { errorMessage("Failed to create GPU sampled texture") }
        return Sdl3GpuSampledTexture(device = handle, handle = texture, width = width, height = height, format = format)
    }

    context(gpa: SegmentAllocator)
    fun createSampler(
        minFilter: Sdl3GpuFilter = Sdl3GpuFilter.Linear,
        magFilter: Sdl3GpuFilter = Sdl3GpuFilter.Linear,
        addressModeU: Sdl3GpuAddressMode = Sdl3GpuAddressMode.ClampToEdge,
        addressModeV: Sdl3GpuAddressMode = Sdl3GpuAddressMode.ClampToEdge,
    ): Sdl3GpuSampler {
        checkOpen()
        val info = SDL_GPUSamplerCreateInfo.allocate(gpa).fill(0)
        SDL_GPUSamplerCreateInfo.min_filter(info, minFilter.nativeValue())
        SDL_GPUSamplerCreateInfo.mag_filter(info, magFilter.nativeValue())
        SDL_GPUSamplerCreateInfo.address_mode_u(info, addressModeU.nativeValue())
        SDL_GPUSamplerCreateInfo.address_mode_v(info, addressModeV.nativeValue())
        SDL_GPUSamplerCreateInfo.address_mode_w(info, SDL3.SDL_GPU_SAMPLERADDRESSMODE_CLAMP_TO_EDGE())
        val sampler = SDL3.SDL_CreateGPUSampler(handle, info)
        check(sampler.address() != 0L) { errorMessage("Failed to create GPU sampler") }
        return Sdl3GpuSampler(device = handle, handle = sampler)
    }

    context(gpa: SegmentAllocator)
    fun createShader(
        code: Bytes,
        entrypoint: String,
        stage: Sdl3GpuShaderStage,
        samplerCount: Int = 0,
        uniformBufferCount: Int = 0,
    ): Sdl3GpuShader {
        checkOpen()
        require(code.size >= 20 && code.size % 4 == 0)
        require(entrypoint.isNotEmpty() && '\u0000' !in entrypoint)
        require(samplerCount >= 0 && uniformBufferCount >= 0)
        val shaderCode = gpa.allocate(code.size.toLong(), 4)
        MemorySegment.copy(MemorySegment.ofArray(code), 0L, shaderCode, 0L, shaderCode.byteSize())
        val info = SDL_GPUShaderCreateInfo.allocate(gpa).fill(0)
        SDL_GPUShaderCreateInfo.code(info, shaderCode)
        SDL_GPUShaderCreateInfo.code_size(info, shaderCode.byteSize())
        SDL_GPUShaderCreateInfo.entrypoint(info, gpa.allocateFrom(entrypoint))
        SDL_GPUShaderCreateInfo.format(info, SDL3.SDL_GPU_SHADERFORMAT_SPIRV())
        SDL_GPUShaderCreateInfo.stage(
            info,
            when (stage) {
                Sdl3GpuShaderStage.Vertex -> SDL3.SDL_GPU_SHADERSTAGE_VERTEX()
                Sdl3GpuShaderStage.Fragment -> SDL3.SDL_GPU_SHADERSTAGE_FRAGMENT()
            },
        )
        SDL_GPUShaderCreateInfo.num_samplers(info, samplerCount)
        SDL_GPUShaderCreateInfo.num_uniform_buffers(info, uniformBufferCount)
        val shader = SDL3.SDL_CreateGPUShader(handle, info)
        check(shader.address() != 0L) { errorMessage("Failed to create GPU shader") }
        return Sdl3GpuShader(device = handle, handle = shader, stage = stage)
    }

    context(gpa: SegmentAllocator)
    fun createGraphicsPipeline(
        vertexShader: Sdl3GpuShader,
        fragmentShader: Sdl3GpuShader,
        targetFormat: Sdl3GpuTextureFormat,
        vertexPitch: Int,
        attributes: List<Sdl3GpuVertexAttribute>,
        alphaBlend: Boolean = false,
        primitiveType: Sdl3GpuPrimitiveType = Sdl3GpuPrimitiveType.Triangles,
        depthFormat: Sdl3GpuTextureFormat? = null,
        depthTest: Boolean = false,
        depthWrite: Boolean = depthTest,
    ): Sdl3GpuGraphicsPipeline {
        checkOpen()
        vertexShader.checkOpen()
        fragmentShader.checkOpen()
        require(vertexShader.device.address() == handle.address())
        require(fragmentShader.device.address() == handle.address())
        require(vertexShader.stage == Sdl3GpuShaderStage.Vertex)
        require(fragmentShader.stage == Sdl3GpuShaderStage.Fragment)
        require(vertexPitch >= 8 && attributes.isNotEmpty())
        require(depthFormat != null || (!depthTest && !depthWrite))
        require(attributes.map { it.location }.distinct().size == attributes.size)
        val info = SDL_GPUGraphicsPipelineCreateInfo.allocate(gpa).fill(0)
        SDL_GPUGraphicsPipelineCreateInfo.vertex_shader(info, vertexShader.handle)
        SDL_GPUGraphicsPipelineCreateInfo.fragment_shader(info, fragmentShader.handle)
        SDL_GPURasterizerState.enable_depth_clip(SDL_GPUGraphicsPipelineCreateInfo.rasterizer_state(info), true)
        SDL_GPUGraphicsPipelineCreateInfo.primitive_type(
            info,
            when (primitiveType) {
                Sdl3GpuPrimitiveType.Triangles -> SDL3.SDL_GPU_PRIMITIVETYPE_TRIANGLELIST()
                Sdl3GpuPrimitiveType.Lines -> SDL3.SDL_GPU_PRIMITIVETYPE_LINELIST()
            },
        )
        val buffer = SDL_GPUVertexBufferDescription.allocate(gpa).fill(0)
        SDL_GPUVertexBufferDescription.pitch(buffer, vertexPitch)
        val nativeAttributes = SDL_GPUVertexAttribute.allocateArray(attributes.size.toLong(), gpa).fill(0)
        for (index in attributes.indices) {
            val attribute = attributes[index]
            val attributeSize = when (attribute.format) {
                Sdl3GpuVertexFormat.Float2 -> 8
                Sdl3GpuVertexFormat.Float3 -> 12
                Sdl3GpuVertexFormat.Float4 -> 16
            }
            require(attribute.location >= 0 && attribute.offset >= 0 && attribute.offset.toLong() + attributeSize <= vertexPitch)
            val native = SDL_GPUVertexAttribute.asSlice(nativeAttributes, index.toLong())
            SDL_GPUVertexAttribute.location(native, attribute.location)
            SDL_GPUVertexAttribute.offset(native, attribute.offset)
            SDL_GPUVertexAttribute.format(
                native,
                when (attribute.format) {
                    Sdl3GpuVertexFormat.Float2 -> SDL3.SDL_GPU_VERTEXELEMENTFORMAT_FLOAT2()
                    Sdl3GpuVertexFormat.Float3 -> SDL3.SDL_GPU_VERTEXELEMENTFORMAT_FLOAT3()
                    Sdl3GpuVertexFormat.Float4 -> SDL3.SDL_GPU_VERTEXELEMENTFORMAT_FLOAT4()
                },
            )
        }
        val input = SDL_GPUGraphicsPipelineCreateInfo.vertex_input_state(info)
        SDL_GPUVertexInputState.vertex_buffer_descriptions(input, buffer)
        SDL_GPUVertexInputState.num_vertex_buffers(input, 1)
        SDL_GPUVertexInputState.vertex_attributes(input, nativeAttributes)
        SDL_GPUVertexInputState.num_vertex_attributes(input, attributes.size)
        val target = SDL_GPUColorTargetDescription.allocate(gpa).fill(0)
        SDL_GPUColorTargetDescription.format(target, targetFormat.value)
        if (alphaBlend) {
            val blend = SDL_GPUColorTargetDescription.blend_state(target)
            SDL_GPUColorTargetBlendState.enable_blend(blend, true)
            SDL_GPUColorTargetBlendState.src_color_blendfactor(blend, SDL3.SDL_GPU_BLENDFACTOR_SRC_ALPHA())
            SDL_GPUColorTargetBlendState.dst_color_blendfactor(blend, SDL3.SDL_GPU_BLENDFACTOR_ONE_MINUS_SRC_ALPHA())
            SDL_GPUColorTargetBlendState.color_blend_op(blend, SDL3.SDL_GPU_BLENDOP_ADD())
            SDL_GPUColorTargetBlendState.src_alpha_blendfactor(blend, SDL3.SDL_GPU_BLENDFACTOR_ONE())
            SDL_GPUColorTargetBlendState.dst_alpha_blendfactor(blend, SDL3.SDL_GPU_BLENDFACTOR_ONE_MINUS_SRC_ALPHA())
            SDL_GPUColorTargetBlendState.alpha_blend_op(blend, SDL3.SDL_GPU_BLENDOP_ADD())
        }
        val targets = SDL_GPUGraphicsPipelineCreateInfo.target_info(info)
        SDL_GPUGraphicsPipelineTargetInfo.color_target_descriptions(targets, target)
        SDL_GPUGraphicsPipelineTargetInfo.num_color_targets(targets, 1)
        if (depthFormat != null) {
            SDL_GPUGraphicsPipelineTargetInfo.has_depth_stencil_target(targets, true)
            SDL_GPUGraphicsPipelineTargetInfo.depth_stencil_format(targets, depthFormat.value)
            val depth = SDL_GPUGraphicsPipelineCreateInfo.depth_stencil_state(info)
            SDL_GPUDepthStencilState.enable_depth_test(depth, depthTest)
            SDL_GPUDepthStencilState.enable_depth_write(depth, depthWrite)
            SDL_GPUDepthStencilState.compare_op(depth, SDL3.SDL_GPU_COMPAREOP_LESS_OR_EQUAL())
        }
        val pipeline = SDL3.SDL_CreateGPUGraphicsPipeline(handle, info)
        check(pipeline.address() != 0L) { errorMessage("Failed to create GPU graphics pipeline") }
        return Sdl3GpuGraphicsPipeline(device = handle, handle = pipeline, depthFormat = depthFormat)
    }

    override fun close() {
        if (handle.address() != 0L) {
            try {
                check(SDL3.SDL_WaitForGPUIdle(handle)) { errorMessage("Failed to wait for GPU idle") }
            } finally {
                SDL3.SDL_DestroyGPUDevice(handle)
                handle = MemorySegment.NULL
            }
        }
    }
}

private fun Sdl3GpuFilter.nativeValue(): Int = when (this) {
    Sdl3GpuFilter.Nearest -> SDL3.SDL_GPU_FILTER_NEAREST()
    Sdl3GpuFilter.Linear -> SDL3.SDL_GPU_FILTER_LINEAR()
}

private fun Sdl3GpuAddressMode.nativeValue(): Int = when (this) {
    Sdl3GpuAddressMode.Repeat -> SDL3.SDL_GPU_SAMPLERADDRESSMODE_REPEAT()
    Sdl3GpuAddressMode.MirroredRepeat -> SDL3.SDL_GPU_SAMPLERADDRESSMODE_MIRRORED_REPEAT()
    Sdl3GpuAddressMode.ClampToEdge -> SDL3.SDL_GPU_SAMPLERADDRESSMODE_CLAMP_TO_EDGE()
}
