package com.varlanv.klab.renderer

import com.varlanv.klab.ResourcesHolder
import com.varlanv.klab.Std
import com.varlanv.klab.TracedCloseable
import com.varlanv.klab.collections.Floats
import com.varlanv.klab.sdl3.Sdl3GpuBuffer
import com.varlanv.klab.sdl3.Sdl3GpuIndexFormat
import com.varlanv.klab.sdl3.Sdl3GpuSampledTexture
import com.varlanv.klab.sdl3.Sdl3GpuSampler

class GpuModel(
    val meshes: List<List<GpuModelPrimitive>>,
    val nodes: List<GpuModelNode>,
    private val resources: ResourcesHolder,
) : TracedCloseable {

    private var closed = false

    context(std: Std)
    override fun close() {
        if (!closed) {
            closed = true
            resources.release()
        }
    }

    fun checkOpen() {
        assert(!closed) { "GPU model is closed" }
    }
}

class GpuModelPrimitive(
    val vertices: Sdl3GpuBuffer,
    val indices: Sdl3GpuBuffer,
    val indexCount: Int,
    val indexFormat: Sdl3GpuIndexFormat,
    val material: GpuModelMaterial,
)

class GpuModelNode(val meshIndex: Int, val transform: Floats)

class GpuModelMaterial(
    val texture: Sdl3GpuSampledTexture,
    val sampler: Sdl3GpuSampler,
    val baseColor: Floats,
    val alphaCutoff: Float,
    val unlit: Boolean,
)
