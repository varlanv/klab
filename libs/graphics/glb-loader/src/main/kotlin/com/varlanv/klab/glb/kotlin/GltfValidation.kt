package com.varlanv.klab.glb.kotlin

import com.varlanv.klab.collections.Floats
import com.varlanv.klab.collections.Ints
import com.varlanv.klab.collections.MutFloats
import com.varlanv.klab.collections.MutInts

private val supportedRequiredExtensions = setOf(
    "KHR_mesh_quantization", "KHR_lights_punctual", "KHR_materials_variants", "KHR_texture_transform",
    "KHR_texture_basisu", "EXT_texture_webp", "EXT_mesh_gpu_instancing",
    "KHR_materials_pbrSpecularGlossiness", "KHR_materials_unlit", "KHR_materials_clearcoat",
    "KHR_materials_transmission", "KHR_materials_ior", "KHR_materials_specular", "KHR_materials_volume",
    "KHR_materials_sheen", "KHR_materials_emissive_strength", "KHR_materials_iridescence",
    "KHR_materials_diffuse_transmission", "KHR_materials_anisotropy", "KHR_materials_dispersion",
)

internal fun validateVersion(asset: KAsset) {
    if (asset.version == "2.0" && (asset.minVersion == null || asset.minVersion == "2.0")) return
    fun version(text: String?): Pair<Int, Int> {
        require(text != null && text.matches(Regex("[0-9]+\\.[0-9]+"))) { "Invalid glTF version" }
        val parts = text.split('.')
        return (parts[0].toIntOrNull() ?: error("Invalid glTF major version")) to
                (parts[1].toIntOrNull() ?: error("Invalid glTF minor version"))
    }

    val declared = version(asset.version)
    require(declared.first == 2) { "Unsupported glTF major version" }
    asset.minVersion?.let {
        val minimum = version(it)
        require(minimum.first == 2 && minimum.second == 0 && minimum.second <= declared.second) { "Unsupported minimum glTF version" }
    }
}

internal fun validateRequiredExtensions(model: KotlinGltf) {
    if (model.extensionsUsed.size > 1) require(model.extensionsUsed.toSet().size == model.extensionsUsed.size)
    if (model.extensionsRequired.size > 1) require(model.extensionsRequired.toSet().size == model.extensionsRequired.size)
    for (extension in model.extensionsRequired) {
        require(extension in model.extensionsUsed) { "Required extension is not listed in extensionsUsed: $extension" }
        require(extension in supportedRequiredExtensions) { "Unsupported required extension: $extension" }
    }
    if ("KHR_mesh_quantization" in model.extensionsUsed) require("KHR_mesh_quantization" in model.extensionsRequired)
}

internal fun validateAccessorBounds(accessor: KAccessor) {
    val minimum: Double
    val maximum: Double
    when (accessor.componentType) {
        GLTF_COMPONENT_BYTE -> {
            minimum = -128.0; maximum = 127.0
        }

        GLTF_COMPONENT_UNSIGNED_BYTE -> {
            minimum = 0.0; maximum = 255.0
        }

        GLTF_COMPONENT_SHORT -> {
            minimum = -32768.0; maximum = 32767.0
        }

        GLTF_COMPONENT_UNSIGNED_SHORT -> {
            minimum = 0.0; maximum = 65535.0
        }

        GLTF_COMPONENT_UNSIGNED_INT -> {
            minimum = 0.0; maximum = 4294967296.0
        }

        else -> {
            minimum = -Float.MAX_VALUE.toDouble(); maximum = Float.MAX_VALUE.toDouble()
        }
    }
    fun bounds(values: Floats) {
        for (value in values) {
            require(value.isFinite() && value.toDouble() in minimum..maximum) { "Invalid accessor bound" }
            if (accessor.componentType != GLTF_COMPONENT_FLOAT) require(value.toDouble() == kotlin.math.floor(value.toDouble()))
        }
    }
    bounds(accessor.min)
    bounds(accessor.max)
    if (accessor.min.isNotEmpty() && accessor.max.isNotEmpty())
        for (i in accessor.min.indices) require(accessor.min[i] <= accessor.max[i]) { "Accessor minimum exceeds maximum" }
}

internal fun validateAttributes(model: KotlinGltf, attributes: Array<KAttribute>, morph: Boolean) {
    val quantized = "KHR_mesh_quantization" in model.extensionsRequired
    for (attribute in attributes) {
        val accessor = model.accessors[attribute.accessor]
        val type = accessor.componentType
        val float = type == GLTF_COMPONENT_FLOAT
        val unsignedSmall = type == GLTF_COMPONENT_UNSIGNED_BYTE || type == GLTF_COMPONENT_UNSIGNED_SHORT
        val signedSmall = type == GLTF_COMPONENT_BYTE || type == GLTF_COMPONENT_SHORT
        val normalized = accessor.normalized
        val name = attribute.name
        if (attribute.semantic != 8) {
            require(attribute.semantic in 1..7) { "Invalid vertex semantic $name" }
            require(!morph || attribute.semantic in 1..5) { "Invalid morph semantic" }
            val valid = when (attribute.semantic) {
                1 -> accessor.type == GLTF_TYPE_VEC3 && (float || quantized && (signedSmall || !morph && unsignedSmall))
                2 -> accessor.type == GLTF_TYPE_VEC3 && (float || quantized && signedSmall && normalized)
                3 -> accessor.type == (if (morph) GLTF_TYPE_VEC3 else GLTF_TYPE_VEC4) && (float || quantized && signedSmall && normalized)
                4 -> accessor.type == GLTF_TYPE_VEC2 && (float || unsignedSmall && normalized ||
                        (morph || quantized) && signedSmall && normalized || quantized && (signedSmall || !morph && unsignedSmall))

                5 -> accessor.type in GLTF_TYPE_VEC3..GLTF_TYPE_VEC4 && (float || unsignedSmall && normalized || morph && signedSmall && normalized)
                6 -> accessor.type == GLTF_TYPE_VEC4 && unsignedSmall && !normalized
                7 -> accessor.type == GLTF_TYPE_VEC4 && (float || unsignedSmall && normalized)
                else -> false
            }
            require(valid) { "Invalid accessor type for $name" }
        }
        require(type != GLTF_COMPONENT_UNSIGNED_INT && accessor.type <= GLTF_TYPE_VEC4) { "Invalid vertex component type" }
        if (accessor.bufferView >= 0) {
            val view = model.bufferViews[accessor.bufferView]
            require(view.target != 34963 && accessor.offset % 4 == 0 && accessor.stride % 4 == 0) { "Invalid vertex alignment or target" }
        }
        if (attribute.semantic == 1) require(accessor.min.isNotEmpty() && accessor.max.isNotEmpty()) { "POSITION requires min/max" }
    }
    if (!morph) for (attribute in attributes) {
        if (attribute.semantic == 6 || attribute.semantic == 7) require(attributes.any {
            it.set == attribute.set && it.semantic == if (attribute.semantic == 6) 7 else 6
        }) { "JOINTS and WEIGHTS sets must match" }
    }
}

internal fun validateTopology(mode: Int, count: Int) {
    require(
        when (mode) {
            0 -> count >= 1
            1 -> count >= 2 && count % 2 == 0
            2, 3 -> count >= 2
            4 -> count >= 3 && count % 3 == 0
            5, 6 -> count >= 3
            else -> false
        }
    ) { "Invalid primitive element count" }
}

internal fun validateInstancing(model: KotlinGltf, node: KNode) {
    for (attribute in node.instancing) {
        val accessor = model.accessors[attribute.accessor]
        when (attribute.name) {
            "TRANSLATION", "SCALE" -> require(accessor.type == GLTF_TYPE_VEC3 && accessor.componentType == GLTF_COMPONENT_FLOAT)
            "ROTATION" -> require(
                accessor.type == GLTF_TYPE_VEC4 && (accessor.componentType == GLTF_COMPONENT_FLOAT ||
                        accessor.normalized && (accessor.componentType == GLTF_COMPONENT_BYTE || accessor.componentType == GLTF_COMPONENT_SHORT))
            )

            else -> require(attribute.name.startsWith('_')) { "Invalid instance attribute" }
        }
    }
}

/** Reused only while loading; returned models never reference this storage. */
internal class GltfValidationScratch {
    private var nodeMarks = MutInts(0)
    private var nodeEpoch = 0
    private var inputMarks = MutInts(0)
    private var targetMarks = MutInts(0)
    private var targetEpoch = 0
    private var roots = MutInts(0)
    private var entries = MutInts(0)
    private var ends = MutInts(0)
    private var order = MutInts(0)
    private var stack = MutInts(0)
    val animationValue: MutFloats = MutFloats(1)

    fun uniqueNodes(indices: Ints, count: Int) {
        if (nodeMarks.size < count) nodeMarks = MutInts(count)
        if (nodeEpoch == Int.MAX_VALUE) {
            nodeMarks.fill(0); nodeEpoch = 0
        }
        nodeEpoch++
        for (index in indices) {
            reference(index, count, false)
            require(nodeMarks[index] != nodeEpoch) { "Duplicate node reference" }
            nodeMarks[index] = nodeEpoch
        }
    }

    fun beginAnimations(accessors: Int, nodes: Int) {
        if (inputMarks.size < accessors) inputMarks = MutInts(accessors)
        else inputMarks.fill(0, 0, accessors)
        val count = Math.multiplyExact(nodes, 4)
        if (targetMarks.size < count) targetMarks = MutInts(count)
    }

    fun firstInput(index: Int): Boolean {
        if (inputMarks[index] != 0) return false
        inputMarks[index] = 1
        return true
    }

    fun beginTargets() {
        if (targetEpoch == Int.MAX_VALUE) {
            targetMarks.fill(0); targetEpoch = 0
        }
        targetEpoch++
    }

    fun firstTarget(node: Int, path: Int): Boolean {
        val index = node * 4 + path - GLTF_PATH_TRANSLATION
        if (targetMarks[index] == targetEpoch) return false
        targetMarks[index] = targetEpoch
        return true
    }

    fun validateSkinHierarchy(model: KotlinGltf) {
        if (model.skins.isEmpty()) return
        val count = model.nodes.size
        if (roots.size < count) {
            roots = MutInts(count)
            entries = MutInts(count)
            ends = MutInts(count)
            order = MutInts(count)
            stack = MutInts(count)
        }
        var used = 0
        for (root in model.nodes.indices) {
            if (model.nodes[root].parent >= 0) continue
            var pending = 1
            stack[0] = root
            while (pending > 0) {
                val node = stack[--pending]
                roots[node] = root
                entries[node] = used
                ends[node] = used
                order[used++] = node
                val children = model.nodes[node].children
                for (index in children.lastIndex downTo 0) stack[pending++] = children[index]
            }
        }
        assert(used == count)
        for (index in used - 1 downTo 0) {
            val node = order[index]
            val parent = model.nodes[node].parent
            if (parent >= 0) ends[parent] = maxOf(ends[parent], ends[node])
        }
        for (skin in model.skins) {
            val root = roots[skin.joints[0]]
            for (joint in skin.joints) {
                require(roots[joint] == root) { "Skin joints require a common ancestor" }
                if (skin.skeleton >= 0) require(entries[joint] in entries[skin.skeleton]..ends[skin.skeleton]) {
                    "Skeleton must be an ancestor of all joints"
                }
            }
        }
        for (scene in model.scenes) {
            uniqueNodes(scene.nodes, count)
            for (root in scene.nodes) for (index in entries[root]..ends[root]) {
                val skin = model.nodes[order[index]].skin
                if (skin >= 0) require(nodeMarks[roots[model.skins[skin].joints[0]]] == nodeEpoch) {
                    "Skin joint is outside the mesh scene"
                }
            }
        }
    }
}

internal fun validateResources(model: KotlinGltf) {
    for (image in model.images) {
        reference(image.bufferView, model.bufferViews.size)
        require((image.uri != null) != (image.bufferView >= 0)) { "Image requires exactly one URI or buffer view" }
        require(image.bufferView < 0 || image.mimeType != null) { "Embedded image requires MIME type" }
        if (image.bufferView >= 0) {
            val view = model.bufferViews[image.bufferView]
            require(view.stride == 0 && view.target == 0)
        }
    }
    for (texture in model.textures) {
        fun image(index: Int, mime: String?) {
            if (index < 0) return
            reference(index, model.images.size, false)
            val declared = model.images[index].mimeType ?: return
            require(if (mime == null) declared == "image/png" || declared == "image/jpeg" else declared == mime) { "Image MIME does not match texture source" }
        }
        image(texture.image, null)
        image(texture.basisuImage, "image/ktx2")
        image(texture.webpImage, "image/webp")
    }
    for (sampler in model.samplers) {
        require(sampler.magFilter == 0 || sampler.magFilter in 9728..9729)
        require(sampler.minFilter == 0 || sampler.minFilter in 9728..9729 || sampler.minFilter in 9984..9987)
        require(validWrap(sampler.wrapS) && validWrap(sampler.wrapT))
    }
}

private fun validWrap(value: Int): Boolean = value == 33071 || value == 33648 || value == 10497

internal fun validateMaterial(material: KMaterial) {
    fun unit(value: Float) {
        require(value in 0f..1f) { "Material factor outside [0,1]" }
    }

    fun color(values: Floats) {
        for (value in values) unit(value)
    }
    color(material.emissiveFactor)
    require(material.alphaCutoff >= 0)
    material.occlusionTexture?.let { unit(it.scale) }
    material.metallicRoughness?.let { color(it.baseColorFactor); unit(it.metallicFactor); unit(it.roughnessFactor) }
    material.specularGlossiness?.let { color(it.diffuseFactor); color(it.specularFactor); unit(it.glossinessFactor) }
    material.clearcoat?.let { unit(it.factor); unit(it.roughnessFactor) }
    material.transmission?.let { unit(it.factor) }
    material.ior?.let { require(it == 0f || it >= 1f) }
    material.specular?.let { unit(it.factor); color(it.colorFactor) }
    material.volume?.let { require(it.thicknessFactor >= 0 && it.attenuationDistance > 0); color(it.attenuationColor) }
    material.sheen?.let { color(it.colorFactor); unit(it.roughnessFactor) }
    material.emissiveStrength?.let { require(it >= 0) }
    material.iridescence?.let { unit(it.factor); require(it.ior >= 1 && it.thicknessMin >= 0 && it.thicknessMax >= it.thicknessMin) }
    material.diffuseTransmission?.let { unit(it.factor); color(it.colorFactor) }
    material.anisotropy?.let { unit(it.strength) }
    material.dispersion?.let { require(it >= 0) }
    if (material.unlit) require(material.specularGlossiness == null && material.emissiveStrength == null)
    if (material.unlit || material.specularGlossiness != null) require(
        material.clearcoat == null && material.ior == null && material.specular == null && material.transmission == null && material.volume == null &&
                material.sheen == null && material.iridescence == null && material.anisotropy == null &&
                material.diffuseTransmission == null && material.dispersion == null
    ) { "Incompatible material extensions" }
}

internal fun validateAnimations(model: KotlinGltf, scratch: GltfValidationScratch) {
    if (model.animations.isEmpty()) return
    val value = scratch.animationValue
    scratch.beginAnimations(accessors = model.accessors.size, nodes = model.nodes.size)
    for (animation in model.animations) {
        require(animation.samplers.isNotEmpty() && animation.channels.isNotEmpty())
        for (sampler in animation.samplers) {
            reference(sampler.input, model.accessors.size, false)
            reference(sampler.output, model.accessors.size, false)
            val input = model.accessors[sampler.input]
            require(input.type == GLTF_TYPE_SCALAR && input.componentType == GLTF_COMPONENT_FLOAT && input.min.isNotEmpty() && input.max.isNotEmpty()) { "Invalid animation input" }
            require(sampler.interpolation != GLTF_INTERPOLATION_CUBIC_SPLINE || input.count >= 2) { "Cubic spline requires two keyframes" }
            var previous = -1f
            if (scratch.firstInput(sampler.input)) repeat(input.count) { element ->
                model.readFloats(sampler.input, element, value)
                require(value[0] >= 0 && value[0] > previous) { "Animation times must increase and be nonnegative" }
                if (element == 0) require(input.min[0] == value[0]) { "Animation minimum does not match input" }
                previous = value[0]
                if (element == input.count - 1) require(input.max[0] == value[0]) { "Animation maximum does not match input" }
            }
            if (input.bufferView >= 0) validateUnstridedView(model.bufferViews[input.bufferView])
            val output = model.accessors[sampler.output]
            if (output.bufferView >= 0) validateUnstridedView(model.bufferViews[output.bufferView])
        }
        scratch.beginTargets()
        for (channel in animation.channels) {
            reference(channel.sampler, animation.samplers.size, false)
            reference(channel.targetNode, model.nodes.size)
            require(channel.targetPath in GLTF_PATH_TRANSLATION..GLTF_PATH_WEIGHTS)
            if (channel.targetNode < 0) continue
            require(
                scratch.firstTarget(
                    node = channel.targetNode,
                    path = channel.targetPath
                )
            ) { "Duplicate animation target" }
            val node = model.nodes[channel.targetNode]
            require(!node.hasMatrix) { "Animated node cannot define matrix" }
            val sampler = animation.samplers[channel.sampler]
            val output = model.accessors[sampler.output]
            val expectedType = when (channel.targetPath) {
                GLTF_PATH_TRANSLATION, GLTF_PATH_SCALE -> GLTF_TYPE_VEC3
                GLTF_PATH_ROTATION -> GLTF_TYPE_VEC4
                else -> GLTF_TYPE_SCALAR
            }
            val packed = channel.targetPath == GLTF_PATH_ROTATION || channel.targetPath == GLTF_PATH_WEIGHTS
            require(
                output.type == expectedType && (output.componentType == GLTF_COMPONENT_FLOAT || packed && output.normalized &&
                        output.componentType in GLTF_COMPONENT_BYTE..GLTF_COMPONENT_UNSIGNED_SHORT)
            ) { "Invalid animation output" }
            var components = 1
            if (channel.targetPath == GLTF_PATH_WEIGHTS) {
                require(node.mesh >= 0)
                components = model.meshes[node.mesh].primitives[0].targets.size
                require(components > 0)
            }
            val multiplier = if (sampler.interpolation == GLTF_INTERPOLATION_CUBIC_SPLINE) 3 else 1
            require(model.accessors[sampler.input].count.toLong() * components * multiplier == output.count.toLong()) { "Invalid animation output count" }
        }
    }
}

internal fun validateCamerasAndLights(model: KotlinGltf) {
    for (camera in model.cameras) {
        when (camera.type) {
            1 -> {
                val perspective = requireNotNull(camera.perspective)
                require(camera.orthographic == null && perspective.yfov > 0 && perspective.yfov < Math.PI && perspective.znear > 0)
                perspective.aspectRatio?.let { require(it > 0) }
                perspective.zfar?.let { require(it > perspective.znear) }
            }

            2 -> {
                val orthographic = requireNotNull(camera.orthographic)
                require(
                    camera.perspective == null && orthographic.xmag != 0f && orthographic.ymag != 0f &&
                            orthographic.znear >= 0 && orthographic.zfar > orthographic.znear
                )
            }

            else -> error("Invalid camera type")
        }
    }
    for (light in model.lights) {
        require(light.type in 1..3 && light.color.all { it in 0f..1f } && light.intensity >= 0 && light.range >= 0)
        require(light.innerConeAngle >= 0 && light.outerConeAngle > light.innerConeAngle && light.outerConeAngle <= Math.PI / 2)
    }
}

internal fun validateUnstridedView(view: KBufferView) {
    require(view.stride == 0 && view.target == 0) { "Buffer view cannot have stride or target" }
}
