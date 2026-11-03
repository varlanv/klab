package com.varlanv.klab.glb.kotlin

import com.varlanv.klab.collections.Array
import com.varlanv.klab.collections.Floats
import com.varlanv.klab.collections.Ints

private const val JSON_ROOT_TOKEN = 0
private const val DECIMAL_RADIX = 10
private const val ATTRIBUTE_INVALID = 0
private const val ATTRIBUTE_POSITION = 1
private const val ATTRIBUTE_NORMAL = 2
private const val ATTRIBUTE_TANGENT = 3
private const val ATTRIBUTE_TEXCOORD = 4
private const val ATTRIBUTE_COLOR = 5
private const val ATTRIBUTE_JOINTS = 6
private const val ATTRIBUTE_WEIGHTS = 7
private const val ATTRIBUTE_CUSTOM = 8
private const val ALPHA_OPAQUE = 0
private const val ALPHA_MASK = 1
private const val ALPHA_BLEND = 2
private const val CAMERA_INVALID = 0
private const val CAMERA_PERSPECTIVE = 1
private const val CAMERA_ORTHOGRAPHIC = 2
private const val LIGHT_INVALID = 0
private const val LIGHT_DIRECTIONAL = 1
private const val LIGHT_POINT = 2
private const val LIGHT_SPOT = 3
private const val TEXTURE_WRAP_REPEAT = 10497
private const val DEFAULT_ALPHA_CUTOFF = 0.5f
private const val DEFAULT_IOR = 1.5f
private const val DEFAULT_IRIDESCENCE_IOR = 1.3f
private const val DEFAULT_IRIDESCENCE_THICKNESS_MIN = 100f
private const val DEFAULT_IRIDESCENCE_THICKNESS_MAX = 400f
private const val DEFAULT_SPOT_OUTER_CONE_ANGLE = 0.7853981633974483f

internal fun mapGltf(json: GltfJson): KotlinGltf = GltfMapping(json).map()

private val emptyExtensions: Array<KExtension> = emptyArray<KExtension>()
private val emptyAttributes: Array<KAttribute> = emptyArray<KAttribute>()
private val emptyStrings: Array<String> = emptyArray<String>()

private class GltfMapping(private val json: GltfJson) {
    private fun f(obj: Int, name: String): Int = if (obj < 0) JSON_MISSING_TOKEN else json.field(obj, name)
    private fun s(obj: Int, name: String): String? = json.string(f(obj, name))
    private fun i(obj: Int, name: String, default: Int = 0): Int = json.int(f(obj, name), default)
    private fun ref(obj: Int, name: String): Int = i(obj, name, GLTF_MISSING_INDEX)
    private fun n(obj: Int, name: String, default: Float = 0f): Float = json.float(f(obj, name), default)
    private fun b(obj: Int, name: String): Boolean = json.bool(f(obj, name))
    private fun extras(obj: Int): String? = json.raw(f(obj, "extras"))
    private fun floats(obj: Int, name: String): Floats = json.floats(f(obj, name))
    private fun ints(obj: Int, name: String): Ints = json.ints(f(obj, name))
    private inline fun fixed(obj: Int, name: String, count: Int, defaults: () -> Floats): Floats {
        val token = f(obj, name)
        if (token < 0) return defaults()
        val result = json.floats(token)
        require(result.size == count) { "Invalid $name component count" }
        return result
    }

    private inline fun <reified T> array(token: Int, read: (Int) -> T): Array<T> {
        if (token < 0) return emptyArray()
        json.requireArray(token)
        var child = token + 1
        return Array(json.size(token)) {
            val current = child
            child = json.next(current)
            read(current)
        }
    }

    private fun strings(token: Int): Array<String> = if (token < 0) emptyStrings else {
        json.requireArray(token)
        if (json.size(token) == 0) emptyStrings else array(token) { requireNotNull(json.string(it)) }
    }

    private fun extensions(obj: Int): Array<KExtension> {
        val token = f(obj, "extensions")
        if (token < 0) return emptyExtensions
        json.requireObject(token)
        if (json.size(token) == 0) return emptyExtensions
        var key = token + 1
        return Array(json.size(token)) {
            val value = key + 1
            json.requireObject(value)
            val result = KExtension(
                requireNotNull(json.string(key)),
                requireNotNull(json.raw(value)),
            )
            key = json.next(value)
            result
        }
    }

    private fun extension(obj: Int, name: String): Int = f(f(obj, "extensions"), name)
    private fun extensionFloat(obj: Int, extension: String, name: String, default: Float): Float? {
        val token = this.extension(obj, extension)
        return if (token < 0) null else n(token, name, default)
    }

    private fun optionalFloat(obj: Int, name: String): Float? {
        val token = f(obj, name)
        return if (token < 0) null else json.float(token)
    }

    fun map(): KotlinGltf {
        val asset = f(JSON_ROOT_TOKEN, "asset")
        require(asset >= 0) { "Missing glTF asset" }
        val nodes = array(f(JSON_ROOT_TOKEN, "nodes"), ::node)
        val rootExtensions = f(JSON_ROOT_TOKEN, "extensions")
        return KotlinGltf(
            KAsset(
                s(asset, "copyright"),
                s(asset, "generator"),
                s(asset, "version"),
                s(asset, "minVersion"),
                extras(asset),
                extensions(asset)
            ),
            array(f(JSON_ROOT_TOKEN, "buffers"), ::buffer), array(f(JSON_ROOT_TOKEN, "bufferViews"), ::bufferView),
            array(f(JSON_ROOT_TOKEN, "accessors"), ::accessor), array(f(JSON_ROOT_TOKEN, "meshes"), ::mesh),
            array(f(JSON_ROOT_TOKEN, "materials"), ::material), array(f(JSON_ROOT_TOKEN, "images"), ::image),
            array(f(JSON_ROOT_TOKEN, "textures"), ::texture), array(f(JSON_ROOT_TOKEN, "samplers"), ::sampler),
            nodes,
            array(f(JSON_ROOT_TOKEN, "scenes"), ::scene),
            ref(JSON_ROOT_TOKEN, "scene"),
            array(f(JSON_ROOT_TOKEN, "skins"), ::skin),
            array(f(JSON_ROOT_TOKEN, "animations"), ::animation), array(f(JSON_ROOT_TOKEN, "cameras"), ::camera),
            array(f(f(rootExtensions, "KHR_lights_punctual"), "lights"), ::light),
            array(f(f(rootExtensions, "KHR_materials_variants"), "variants")) { KVariant(s(it, "name"), extras(it)) },
            strings(f(JSON_ROOT_TOKEN, "extensionsUsed")),
            strings(f(JSON_ROOT_TOKEN, "extensionsRequired")),
            extras(JSON_ROOT_TOKEN),
            extensions(JSON_ROOT_TOKEN),
        )
    }

    private fun buffer(obj: Int): KBuffer =
        KBuffer(s(obj, "name"), i(obj, "byteLength"), s(obj, "uri"), extras(obj), extensions(obj))

    private fun bufferView(obj: Int): KBufferView {
        var compression = extension(obj, "EXT_meshopt_compression")
        var khr = false
        if (compression < 0) {
            compression = extension(obj, "KHR_meshopt_compression")
            khr = compression >= 0
        }
        val meshopt = if (compression < 0) null else KMeshopt(
            ref(compression, "buffer"),
            i(compression, "byteOffset"),
            i(compression, "byteLength"),
            i(compression, "byteStride"),
            i(compression, "count"),
            s(compression, "mode"),
            s(compression, "filter"),
            khr,
        )
        return KBufferView(
            s(obj, "name"),
            ref(obj, "buffer"),
            i(obj, "byteOffset"),
            i(obj, "byteLength"),
            i(obj, "byteStride"),
            i(obj, "target"),
            meshopt,
            extras(obj),
            extensions(obj)
        )
    }

    private fun accessor(obj: Int): KAccessor {
        val sparseToken = f(obj, "sparse")
        val sparse = if (sparseToken < 0) null else {
            val indices = f(sparseToken, "indices")
            val values = f(sparseToken, "values")
            KSparse(
                i(sparseToken, "count"),
                ref(indices, "bufferView"),
                i(indices, "byteOffset"),
                i(indices, "componentType"),
                ref(values, "bufferView"),
                i(values, "byteOffset")
            )
        }
        val token = f(obj, "type")
        val type = when {
            json.matches(token, "SCALAR") -> GLTF_TYPE_SCALAR
            json.matches(token, "VEC2") -> GLTF_TYPE_VEC2
            json.matches(token, "VEC3") -> GLTF_TYPE_VEC3
            json.matches(token, "VEC4") -> GLTF_TYPE_VEC4
            json.matches(token, "MAT2") -> GLTF_TYPE_MAT2
            json.matches(token, "MAT3") -> GLTF_TYPE_MAT3
            json.matches(token, "MAT4") -> GLTF_TYPE_MAT4
            else -> GLTF_TYPE_INVALID
        }
        return KAccessor(
            s(obj, "name"),
            i(obj, "componentType"),
            type,
            i(obj, "byteOffset"),
            i(obj, "count"),
            0,
            ref(obj, "bufferView"),
            b(obj, "normalized"),
            floats(obj, "min"),
            floats(obj, "max"),
            sparse,
            extras(obj),
            extensions(obj)
        )
    }

    private fun attributes(obj: Int): Array<KAttribute> {
        if (obj < 0) return emptyAttributes
        json.requireObject(obj)
        if (json.size(obj) == 0) return emptyAttributes
        var key = obj + 1
        return Array(json.size(obj)) {
            val name = requireNotNull(json.string(key))
            val value = key + 1
            key = json.next(value)
            val separator = name.indexOf('_')
            val length = if (separator < 0) name.length else separator
            var semantic = when {
                name.startsWith("_") -> ATTRIBUTE_CUSTOM
                length == "POSITION".length && name.startsWith("POSITION") -> ATTRIBUTE_POSITION
                length == "NORMAL".length && name.startsWith("NORMAL") -> ATTRIBUTE_NORMAL
                length == "TANGENT".length && name.startsWith("TANGENT") -> ATTRIBUTE_TANGENT
                length == "TEXCOORD".length && name.startsWith("TEXCOORD") -> ATTRIBUTE_TEXCOORD
                length == "COLOR".length && name.startsWith("COLOR") -> ATTRIBUTE_COLOR
                length == "JOINTS".length && name.startsWith("JOINTS") -> ATTRIBUTE_JOINTS
                length == "WEIGHTS".length && name.startsWith("WEIGHTS") -> ATTRIBUTE_WEIGHTS
                else -> ATTRIBUTE_INVALID
            }
            var set = 0
            if (separator >= 0 && semantic in ATTRIBUTE_POSITION..ATTRIBUTE_WEIGHTS) {
                var digit = separator + 1
                val negative = digit < name.length && name[digit] == '-'
                if (digit < name.length && (name[digit] == '+' || negative)) digit++
                while (digit < name.length && name[digit] in '0'..'9') {
                    set = set * DECIMAL_RADIX + name[digit++].digitToInt()
                }
                if (negative && set != 0 || set < 0) {
                    semantic = ATTRIBUTE_INVALID; set = 0
                }
            }
            KAttribute(name, json.int(value, GLTF_MISSING_INDEX), semantic, set)
        }
    }

    private fun primitive(obj: Int): KPrimitive {
        val dracoToken = extension(obj, "KHR_draco_mesh_compression")
        val draco =
            if (dracoToken < 0) null else KDraco(ref(dracoToken, "bufferView"), attributes(f(dracoToken, "attributes")))
        val mappingsToken = f(extension(obj, "KHR_materials_variants"), "mappings")
        val mappings = if (mappingsToken < 0) emptyArray() else {
            val groups = array(mappingsToken) { token ->
                val material = ref(token, "material")
                val extras = extras(token)
                val variants = ints(token, "variants")
                Array(variants.size) { KMaterialMapping(variants[it], material, extras) }
            }
            Array(groups.sumOf { it.size }) { index ->
                var remaining = index
                var group = 0
                while (remaining >= groups[group].size) remaining -= groups[group++].size
                groups[group][remaining]
            }
        }
        return KPrimitive(
            i(obj, "mode", GLTF_PRIMITIVE_TRIANGLES),
            ref(obj, "indices"),
            ref(obj, "material"),
            attributes(f(obj, "attributes")),
            array(f(obj, "targets"), ::attributes),
            draco,
            mappings,
            extras(obj),
            extensions(obj)
        )
    }

    private fun mesh(obj: Int): KMesh = KMesh(
        s(obj, "name"),
        array(f(obj, "primitives"), ::primitive),
        floats(obj, "weights"),
        targetNames(obj),
        extras(obj),
        extensions(obj)
    )

    private fun targetNames(obj: Int): Array<String> {
        val token = f(obj, "extras")
        return if (json.isObject(token)) strings(f(token, "targetNames")) else emptyStrings
    }

    private fun textureView(obj: Int): KTextureView? {
        if (obj < 0) return null
        val transformToken = extension(obj, "KHR_texture_transform")
        val transform = if (transformToken < 0) null else KTextureTransform(
            fixed(transformToken, "offset", VEC2_COMPONENTS) { floatArrayOf(0f, 0f) },
            n(transformToken, "rotation"),
            fixed(transformToken, "scale", VEC2_COMPONENTS) { floatArrayOf(1f, 1f) },
            ref(transformToken, "texCoord")
        )
        return KTextureView(ref(obj, "index"), i(obj, "texCoord"), n(obj, "scale", n(obj, "strength", 1f)), transform)
    }

    private fun metallicRoughness(obj: Int): KMetallicRoughness? = if (obj < 0) null else KMetallicRoughness(
        textureView(f(obj, "baseColorTexture")),
        textureView(f(obj, "metallicRoughnessTexture")),
        fixed(obj, "baseColorFactor", VEC4_COMPONENTS) { floatArrayOf(1f, 1f, 1f, 1f) },
        n(obj, "metallicFactor", 1f),
        n(obj, "roughnessFactor", 1f),
    )

    private fun specularGlossiness(obj: Int): KSpecularGlossiness? = if (obj < 0) null else KSpecularGlossiness(
        textureView(f(obj, "diffuseTexture")),
        textureView(f(obj, "specularGlossinessTexture")),
        fixed(obj, "diffuseFactor", VEC4_COMPONENTS) { floatArrayOf(1f, 1f, 1f, 1f) },
        fixed(obj, "specularFactor", VEC3_COMPONENTS) { floatArrayOf(1f, 1f, 1f) },
        n(obj, "glossinessFactor", 1f),
    )

    private fun clearcoat(obj: Int): KClearcoat? = if (obj < 0) null else KClearcoat(
        textureView(f(obj, "clearcoatTexture")),
        textureView(f(obj, "clearcoatRoughnessTexture")),
        textureView(f(obj, "clearcoatNormalTexture")),
        n(obj, "clearcoatFactor"),
        n(obj, "clearcoatRoughnessFactor"),
    )

    private fun transmission(obj: Int): KTransmission? =
        if (obj < 0) null else KTransmission(textureView(f(obj, "transmissionTexture")), n(obj, "transmissionFactor"))

    private fun specular(obj: Int): KSpecular? = if (obj < 0) null else KSpecular(
        textureView(f(obj, "specularTexture")),
        textureView(f(obj, "specularColorTexture")),
        n(obj, "specularFactor", 1f),
        fixed(obj, "specularColorFactor", VEC3_COMPONENTS) { floatArrayOf(1f, 1f, 1f) })

    private fun volume(obj: Int): KVolume? = if (obj < 0) null else KVolume(
        textureView(f(obj, "thicknessTexture")),
        n(obj, "thicknessFactor"),
        fixed(obj, "attenuationColor", VEC3_COMPONENTS) { floatArrayOf(1f, 1f, 1f) },
        n(obj, "attenuationDistance", Float.MAX_VALUE)
    )

    private fun sheen(obj: Int): KSheen? = if (obj < 0) null else KSheen(
        textureView(f(obj, "sheenColorTexture")),
        fixed(obj, "sheenColorFactor", VEC3_COMPONENTS) { floatArrayOf(0f, 0f, 0f) },
        textureView(f(obj, "sheenRoughnessTexture")),
        n(obj, "sheenRoughnessFactor")
    )

    private fun iridescence(obj: Int): KIridescence? = if (obj < 0) null else KIridescence(
        n(obj, "iridescenceFactor"),
        textureView(f(obj, "iridescenceTexture")),
        n(obj, "iridescenceIor", DEFAULT_IRIDESCENCE_IOR),
        n(obj, "iridescenceThicknessMinimum", DEFAULT_IRIDESCENCE_THICKNESS_MIN),
        n(obj, "iridescenceThicknessMaximum", DEFAULT_IRIDESCENCE_THICKNESS_MAX),
        textureView(f(obj, "iridescenceThicknessTexture"))
    )

    private fun diffuseTransmission(obj: Int): KDiffuseTransmission? = if (obj < 0) null else KDiffuseTransmission(
        textureView(f(obj, "diffuseTransmissionTexture")),
        n(obj, "diffuseTransmissionFactor"),
        fixed(obj, "diffuseTransmissionColorFactor", VEC3_COMPONENTS) { floatArrayOf(1f, 1f, 1f) },
        textureView(f(obj, "diffuseTransmissionColorTexture"))
    )

    private fun anisotropy(obj: Int): KAnisotropy? = if (obj < 0) null else KAnisotropy(
        n(obj, "anisotropyStrength"),
        n(obj, "anisotropyRotation"),
        textureView(f(obj, "anisotropyTexture"))
    )

    private fun material(obj: Int): KMaterial {
        val alpha = f(obj, "alphaMode")
        return KMaterial(
            s(obj, "name"),
            metallicRoughness(f(obj, "pbrMetallicRoughness")),
            specularGlossiness(extension(obj, "KHR_materials_pbrSpecularGlossiness")),
            textureView(f(obj, "normalTexture")),
            textureView(f(obj, "occlusionTexture")),
            textureView(f(obj, "emissiveTexture")),
            fixed(obj, "emissiveFactor", VEC3_COMPONENTS) { floatArrayOf(0f, 0f, 0f) },
            when {
                json.matches(alpha, "MASK") -> ALPHA_MASK
                json.matches(alpha, "BLEND") -> ALPHA_BLEND
                else -> ALPHA_OPAQUE
            },
            n(obj, "alphaCutoff", DEFAULT_ALPHA_CUTOFF),
            b(obj, "doubleSided"),
            extension(obj, "KHR_materials_unlit") >= 0,
            clearcoat(extension(obj, "KHR_materials_clearcoat")),
            transmission(extension(obj, "KHR_materials_transmission")),
            extensionFloat(obj, "KHR_materials_ior", "ior", DEFAULT_IOR),
            specular(extension(obj, "KHR_materials_specular")),
            volume(extension(obj, "KHR_materials_volume")),
            sheen(extension(obj, "KHR_materials_sheen")),
            extensionFloat(obj, "KHR_materials_emissive_strength", "emissiveStrength", 1f),
            iridescence(extension(obj, "KHR_materials_iridescence")),
            diffuseTransmission(extension(obj, "KHR_materials_diffuse_transmission")),
            anisotropy(extension(obj, "KHR_materials_anisotropy")),
            extensionFloat(obj, "KHR_materials_dispersion", "dispersion", 0f),
            extras(obj),
            extensions(obj),
        )
    }

    private fun image(obj: Int): KImage =
        KImage(s(obj, "name"), s(obj, "uri"), ref(obj, "bufferView"), s(obj, "mimeType"), extras(obj), extensions(obj))

    private fun sampler(obj: Int): KSampler = KSampler(
        s(obj, "name"),
        i(obj, "magFilter"),
        i(obj, "minFilter"),
        i(obj, "wrapS", TEXTURE_WRAP_REPEAT),
        i(obj, "wrapT", TEXTURE_WRAP_REPEAT),
        extras(obj),
        extensions(obj)
    )

    private fun texture(obj: Int): KTexture = KTexture(
        s(obj, "name"),
        ref(obj, "source"),
        ref(obj, "sampler"),
        ref(extension(obj, "KHR_texture_basisu"), "source"),
        ref(extension(obj, "EXT_texture_webp"), "source"),
        extras(obj),
        extensions(obj)
    )

    private fun node(obj: Int): KNode = KNode(
        s(obj, "name"),
        GLTF_MISSING_INDEX,
        ints(obj, "children"),
        ref(obj, "mesh"),
        ref(obj, "skin"),
        ref(obj, "camera"),
        ref(extension(obj, "KHR_lights_punctual"), "light"),
        floats(obj, "weights"),
        fixed(obj, "translation", VEC3_COMPONENTS) { floatArrayOf(0f, 0f, 0f) },
        fixed(obj, "rotation", VEC4_COMPONENTS) { floatArrayOf(0f, 0f, 0f, 1f) },
        fixed(obj, "scale", VEC3_COMPONENTS) { floatArrayOf(1f, 1f, 1f) },
        fixed(obj, "matrix", MAT4_COMPONENTS) {
            floatArrayOf(
                1f, 0f, 0f, 0f,
                0f, 1f, 0f, 0f,
                0f, 0f, 1f, 0f,
                0f, 0f, 0f, 1f
            )
        },
        f(obj, "matrix") >= 0,
        f(obj, "translation") >= 0,
        f(obj, "rotation") >= 0,
        f(obj, "scale") >= 0,
        attributes(f(extension(obj, "EXT_mesh_gpu_instancing"), "attributes")),
        extras(obj),
        extensions(obj),
    )

    private fun scene(obj: Int): KScene = KScene(s(obj, "name"), ints(obj, "nodes"), extras(obj), extensions(obj))
    private fun skin(obj: Int): KSkin = KSkin(
        s(obj, "name"),
        ints(obj, "joints"),
        ref(obj, "skeleton"),
        ref(obj, "inverseBindMatrices"),
        extras(obj),
        extensions(obj)
    )

    private fun animationSampler(obj: Int): KAnimationSampler {
        val interpolation = f(obj, "interpolation")
        return KAnimationSampler(
            ref(obj, "input"), ref(obj, "output"), when {
                json.matches(interpolation, "STEP") -> GLTF_INTERPOLATION_STEP
                json.matches(interpolation, "CUBICSPLINE") -> GLTF_INTERPOLATION_CUBIC_SPLINE
                else -> GLTF_INTERPOLATION_LINEAR
            }, extras(obj), extensions(obj)
        )
    }

    private fun animationChannel(obj: Int): KAnimationChannel {
        val target = f(obj, "target")
        val path = f(target, "path")
        return KAnimationChannel(
            ref(obj, "sampler"), ref(target, "node"), when {
                json.matches(path, "translation") -> GLTF_PATH_TRANSLATION
                json.matches(path, "rotation") -> GLTF_PATH_ROTATION
                json.matches(path, "scale") -> GLTF_PATH_SCALE
                json.matches(path, "weights") -> GLTF_PATH_WEIGHTS
                else -> GLTF_PATH_INVALID
            }, extras(obj), extensions(obj)
        )
    }

    private fun animation(obj: Int): KAnimation = KAnimation(
        s(obj, "name"),
        array(f(obj, "samplers"), ::animationSampler),
        array(f(obj, "channels"), ::animationChannel),
        extras(obj),
        extensions(obj)
    )

    private fun camera(obj: Int): KCamera {
        val type = f(obj, "type")
        val perspectiveToken = f(obj, "perspective")
        val orthographicToken = f(obj, "orthographic")
        val perspective = if (perspectiveToken < 0) null else KPerspective(
            optionalFloat(perspectiveToken, "aspectRatio"),
            n(perspectiveToken, "yfov"),
            optionalFloat(perspectiveToken, "zfar"),
            n(perspectiveToken, "znear"),
            extras(perspectiveToken)
        )
        val orthographic = if (orthographicToken < 0) null else KOrthographic(
            n(orthographicToken, "xmag"),
            n(orthographicToken, "ymag"),
            n(orthographicToken, "zfar"),
            n(orthographicToken, "znear"),
            extras(orthographicToken)
        )
        return KCamera(
            s(obj, "name"), when {
                json.matches(type, "perspective") -> CAMERA_PERSPECTIVE
                json.matches(type, "orthographic") -> CAMERA_ORTHOGRAPHIC
                else -> CAMERA_INVALID
            }, perspective, orthographic, extras(obj), extensions(obj)
        )
    }

    private fun light(obj: Int): KLight {
        val spot = f(obj, "spot")
        val type = f(obj, "type")
        return KLight(
            s(obj, "name"),
            fixed(obj, "color", VEC3_COMPONENTS) { floatArrayOf(1f, 1f, 1f) },
            n(obj, "intensity", 1f),
            when {
                json.matches(type, "directional") -> LIGHT_DIRECTIONAL
                json.matches(type, "point") -> LIGHT_POINT
                json.matches(type, "spot") -> LIGHT_SPOT
                else -> LIGHT_INVALID
            },
            n(obj, "range"),
            n(spot, "innerConeAngle"),
            n(spot, "outerConeAngle", DEFAULT_SPOT_OUTER_CONE_ANGLE),
            extras(obj)
        )
    }
}
