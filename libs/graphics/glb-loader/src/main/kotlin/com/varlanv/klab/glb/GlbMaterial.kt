package com.varlanv.klab.glb

import com.varlanv.klab.glb.ffi.*
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout

enum class GlbAlphaMode { Opaque, Mask, Blend }

class GlbMaterial internal constructor(private val model: GlbModel, private val data: MemorySegment) {
    val name: String? get() = model.read { nativeString(cgltf_material.name(data)) }
    val doubleSided: Boolean get() = model.read { cgltf_material.double_sided(data) != 0 }
    val unlit: Boolean get() = model.read { cgltf_material.unlit(data) != 0 }
    val alphaMode: GlbAlphaMode get() = model.read { GlbAlphaMode.entries[cgltf_material.alpha_mode(data)] }
    val alphaCutoff: Float get() = model.read { cgltf_material.alpha_cutoff(data) }
    val metallicFactor: Float get() = model.read {
        if (cgltf_material.has_pbr_metallic_roughness(data) == 0) 1f
        else cgltf_pbr_metallic_roughness.metallic_factor(cgltf_material.pbr_metallic_roughness(data))
    }
    val roughnessFactor: Float get() = model.read {
        if (cgltf_material.has_pbr_metallic_roughness(data) == 0) 1f
        else cgltf_pbr_metallic_roughness.roughness_factor(cgltf_material.pbr_metallic_roughness(data))
    }
    val baseColorTexture: GlbTextureBinding get() = model.read {
        GlbTextureBinding(model, cgltf_pbr_metallic_roughness.base_color_texture(cgltf_material.pbr_metallic_roughness(data)))
    }
    val metallicRoughnessTexture: GlbTextureBinding get() = model.read {
        GlbTextureBinding(model, cgltf_pbr_metallic_roughness.metallic_roughness_texture(cgltf_material.pbr_metallic_roughness(data)))
    }
    val normalTexture: GlbTextureBinding get() = model.read { GlbTextureBinding(model, cgltf_material.normal_texture(data)) }
    val occlusionTexture: GlbTextureBinding get() = model.read { GlbTextureBinding(model, cgltf_material.occlusion_texture(data)) }
    val emissiveTexture: GlbTextureBinding get() = model.read { GlbTextureBinding(model, cgltf_material.emissive_texture(data)) }

    fun baseColorFactor(component: Int): Float = model.read {
        require(component >= 0 && component < 4)
        if (cgltf_material.has_pbr_metallic_roughness(data) == 0) 1f
        else cgltf_pbr_metallic_roughness.base_color_factor(cgltf_material.pbr_metallic_roughness(data))
            .getAtIndex(ValueLayout.JAVA_FLOAT, component.toLong())
    }

    fun emissiveFactor(component: Int): Float = model.read {
        require(component >= 0 && component < 3)
        cgltf_material.emissive_factor(data).getAtIndex(ValueLayout.JAVA_FLOAT, component.toLong())
    }
}

class GlbTextureBinding internal constructor(private val model: GlbModel, private val data: MemorySegment) {
    val textureIndex: Int? get() = model.read { model.textureIndex(cgltf_texture_view.texture(data)) }
    val texCoord: Int get() = model.read {
        val transform = cgltf_texture_view.transform(data)
        if (cgltf_texture_view.has_transform(data) != 0 && cgltf_texture_transform.has_texcoord(transform) != 0)
            cgltf_texture_transform.texcoord(transform) else cgltf_texture_view.texcoord(data)
    }
    val strength: Float get() = model.read { cgltf_texture_view.scale(data) }
    val hasTransform: Boolean get() = model.read { cgltf_texture_view.has_transform(data) != 0 }
    val rotation: Float get() = model.read {
        if (cgltf_texture_view.has_transform(data) != 0) cgltf_texture_transform.rotation(cgltf_texture_view.transform(data)) else 0f
    }

    fun offset(component: Int): Float = model.read {
        require(component == 0 || component == 1)
        if (cgltf_texture_view.has_transform(data) == 0) 0f
        else cgltf_texture_transform.offset(cgltf_texture_view.transform(data)).getAtIndex(ValueLayout.JAVA_FLOAT, component.toLong())
    }

    fun scale(component: Int): Float = model.read {
        require(component == 0 || component == 1)
        if (cgltf_texture_view.has_transform(data) == 0) 1f
        else cgltf_texture_transform.scale(cgltf_texture_view.transform(data)).getAtIndex(ValueLayout.JAVA_FLOAT, component.toLong())
    }
}

class GlbTexture internal constructor(private val model: GlbModel, private val data: MemorySegment) {
    val name: String? get() = model.read { nativeString(cgltf_texture.name(data)) }
    val imageIndex: Int? get() = model.read { model.imageIndex(cgltf_texture.image(data)) }
    val basisImageIndex: Int? get() = model.read { model.imageIndex(cgltf_texture.basisu_image(data)) }
    val webpImageIndex: Int? get() = model.read { model.imageIndex(cgltf_texture.webp_image(data)) }
    val sampler: GlbSampler? get() = model.read {
        val sampler = cgltf_texture.sampler(data)
        if (sampler.address() == 0L) null else GlbSampler(model, sampler.reinterpret(cgltf_sampler.sizeof()))
    }
}

class GlbSampler internal constructor(private val model: GlbModel, private val data: MemorySegment) {
    val minFilter: Int get() = model.read { cgltf_sampler.min_filter(data) }
    val magFilter: Int get() = model.read { cgltf_sampler.mag_filter(data) }
    val wrapS: Int get() = model.read { cgltf_sampler.wrap_s(data) }
    val wrapT: Int get() = model.read { cgltf_sampler.wrap_t(data) }
}

class GlbImage internal constructor(private val model: GlbModel, private val data: MemorySegment) {
    val name: String? get() = model.read { nativeString(cgltf_image.name(data)) }
    val mimeType: String? get() = model.read { nativeString(cgltf_image.mime_type(data)) }
    val uri: String? get() = model.read { nativeString(cgltf_image.uri(data)) }

    fun encodedBytes(): MemorySegment? = model.read {
        val view = cgltf_image.buffer_view(data)
        if (view.address() == 0L) null else model.bufferBytes(view.reinterpret(cgltf_buffer_view.sizeof()))
    }
}
