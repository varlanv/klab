package com.varlanv.klab.glb.kotlin

internal fun mapGltf(json: GltfJson): KotlinGltf = GltfMapping(json).map()

private val emptyExtensions = emptyArray<KExtension>()
private val emptyAttributes = emptyArray<KAttribute>()
private val emptyStrings = emptyArray<String>()

private class GltfMapping(private val json: GltfJson) {
    private fun f(obj: Int, name: String): Int = if (obj < 0) -1 else json.field(obj, name)
    private fun s(obj: Int, name: String): String? = json.string(f(obj, name))
    private fun i(obj: Int, name: String, default: Int = 0): Int = json.int(f(obj, name), default)
    private fun ref(obj: Int, name: String): Int = i(obj, name, -1)
    private fun n(obj: Int, name: String, default: Float = 0f): Float = json.float(f(obj, name), default)
    private fun b(obj: Int, name: String): Boolean = json.bool(f(obj, name))
    private fun extras(obj: Int): String? = json.raw(f(obj, "extras"))
    private fun floats(obj: Int, name: String): FloatArray = json.floats(f(obj, name))
    private fun ints(obj: Int, name: String): IntArray = json.ints(f(obj, name))
    private inline fun fixed(obj: Int, name: String, count: Int, defaults: () -> FloatArray): FloatArray {
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
            val result = KExtension(requireNotNull(json.string(key)), requireNotNull(json.raw(value)))
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
        val asset = f(0, "asset")
        require(asset >= 0) { "Missing glTF asset" }
        val nodes = array(f(0, "nodes"), ::node)
        val rootExtensions = f(0, "extensions")
        return KotlinGltf(
            KAsset(s(asset, "copyright"), s(asset, "generator"), s(asset, "version"), s(asset, "minVersion"), extras(asset), extensions(asset)),
            array(f(0, "buffers"), ::buffer), array(f(0, "bufferViews"), ::bufferView),
            array(f(0, "accessors"), ::accessor), array(f(0, "meshes"), ::mesh),
            array(f(0, "materials"), ::material), array(f(0, "images"), ::image),
            array(f(0, "textures"), ::texture), array(f(0, "samplers"), ::sampler),
            nodes, array(f(0, "scenes"), ::scene), ref(0, "scene"), array(f(0, "skins"), ::skin),
            array(f(0, "animations"), ::animation), array(f(0, "cameras"), ::camera),
            array(f(f(rootExtensions, "KHR_lights_punctual"), "lights"), ::light),
            array(f(f(rootExtensions, "KHR_materials_variants"), "variants")) { KVariant(s(it, "name"), extras(it)) },
            strings(f(0, "extensionsUsed")), strings(f(0, "extensionsRequired")), extras(0), extensions(0),
        )
    }

    private fun buffer(obj: Int): KBuffer = KBuffer(s(obj, "name"), i(obj, "byteLength"), s(obj, "uri"), extras(obj), extensions(obj))

    private fun bufferView(obj: Int): KBufferView {
        var compression = extension(obj, "EXT_meshopt_compression")
        var khr = false
        if (compression < 0) {
            compression = extension(obj, "KHR_meshopt_compression")
            khr = compression >= 0
        }
        val meshopt = if (compression < 0) null else KMeshopt(
            ref(compression, "buffer"), i(compression, "byteOffset"), i(compression, "byteLength"),
            i(compression, "byteStride"), i(compression, "count"), s(compression, "mode"), s(compression, "filter"), khr,
        )
        return KBufferView(s(obj, "name"), ref(obj, "buffer"), i(obj, "byteOffset"), i(obj, "byteLength"), i(obj, "byteStride"), i(obj, "target"), meshopt, extras(obj), extensions(obj))
    }

    private fun accessor(obj: Int): KAccessor {
        val sparseToken = f(obj, "sparse")
        val sparse = if (sparseToken < 0) null else {
            val indices = f(sparseToken, "indices")
            val values = f(sparseToken, "values")
            KSparse(i(sparseToken, "count"), ref(indices, "bufferView"), i(indices, "byteOffset"), i(indices, "componentType"), ref(values, "bufferView"), i(values, "byteOffset"))
        }
        val token = f(obj, "type")
        val type = when {
            json.matches(token, "SCALAR") -> 1
            json.matches(token, "VEC2") -> 2
            json.matches(token, "VEC3") -> 3
            json.matches(token, "VEC4") -> 4
            json.matches(token, "MAT2") -> 5
            json.matches(token, "MAT3") -> 6
            json.matches(token, "MAT4") -> 7
            else -> 0
        }
        return KAccessor(s(obj, "name"), i(obj, "componentType"), type, i(obj, "byteOffset"), i(obj, "count"), 0, ref(obj, "bufferView"), b(obj, "normalized"), floats(obj, "min"), floats(obj, "max"), sparse, extras(obj), extensions(obj))
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
                name.startsWith("_") -> 8
                length == 8 && name.startsWith("POSITION") -> 1
                length == 6 && name.startsWith("NORMAL") -> 2
                length == 7 && name.startsWith("TANGENT") -> 3
                length == 8 && name.startsWith("TEXCOORD") -> 4
                length == 5 && name.startsWith("COLOR") -> 5
                length == 6 && name.startsWith("JOINTS") -> 6
                length == 7 && name.startsWith("WEIGHTS") -> 7
                else -> 0
            }
            var set = 0
            if (separator >= 0 && semantic in 1..7) {
                var digit = separator + 1
                val negative = digit < name.length && name[digit] == '-'
                if (digit < name.length && (name[digit] == '+' || negative)) digit++
                while (digit < name.length && name[digit] in '0'..'9') {
                    set = set * 10 + name[digit++].digitToInt()
                }
                if (negative && set != 0 || set < 0) { semantic = 0; set = 0 }
            }
            KAttribute(name, json.int(value, -1), semantic, set)
        }
    }

    private fun primitive(obj: Int): KPrimitive {
        val dracoToken = extension(obj, "KHR_draco_mesh_compression")
        val draco = if (dracoToken < 0) null else KDraco(ref(dracoToken, "bufferView"), attributes(f(dracoToken, "attributes")))
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
        return KPrimitive(i(obj, "mode", 4), ref(obj, "indices"), ref(obj, "material"), attributes(f(obj, "attributes")), array(f(obj, "targets"), ::attributes), draco, mappings, extras(obj), extensions(obj))
    }

    private fun mesh(obj: Int): KMesh = KMesh(s(obj, "name"), array(f(obj, "primitives"), ::primitive), floats(obj, "weights"), targetNames(obj), extras(obj), extensions(obj))

    private fun targetNames(obj: Int): Array<String> {
        val token = f(obj, "extras")
        return if (json.isObject(token)) strings(f(token, "targetNames")) else emptyStrings
    }

    private fun textureView(obj: Int): KTextureView? {
        if (obj < 0) return null
        val transformToken = extension(obj, "KHR_texture_transform")
        val transform = if (transformToken < 0) null else KTextureTransform(fixed(transformToken, "offset", 2) { floatArrayOf(0f, 0f) }, n(transformToken, "rotation"), fixed(transformToken, "scale", 2) { floatArrayOf(1f, 1f) }, ref(transformToken, "texCoord"))
        return KTextureView(ref(obj, "index"), i(obj, "texCoord"), n(obj, "scale", n(obj, "strength", 1f)), transform)
    }

    private fun metallicRoughness(obj: Int): KMetallicRoughness? = if (obj < 0) null else KMetallicRoughness(
        textureView(f(obj, "baseColorTexture")), textureView(f(obj, "metallicRoughnessTexture")), fixed(obj, "baseColorFactor", 4) { floatArrayOf(1f, 1f, 1f, 1f) }, n(obj, "metallicFactor", 1f), n(obj, "roughnessFactor", 1f),
    )

    private fun specularGlossiness(obj: Int): KSpecularGlossiness? = if (obj < 0) null else KSpecularGlossiness(
        textureView(f(obj, "diffuseTexture")), textureView(f(obj, "specularGlossinessTexture")), fixed(obj, "diffuseFactor", 4) { floatArrayOf(1f, 1f, 1f, 1f) }, fixed(obj, "specularFactor", 3) { floatArrayOf(1f, 1f, 1f) }, n(obj, "glossinessFactor", 1f),
    )

    private fun clearcoat(obj: Int): KClearcoat? = if (obj < 0) null else KClearcoat(
        textureView(f(obj, "clearcoatTexture")), textureView(f(obj, "clearcoatRoughnessTexture")), textureView(f(obj, "clearcoatNormalTexture")), n(obj, "clearcoatFactor"), n(obj, "clearcoatRoughnessFactor"),
    )

    private fun transmission(obj: Int): KTransmission? = if (obj < 0) null else KTransmission(textureView(f(obj, "transmissionTexture")), n(obj, "transmissionFactor"))
    private fun specular(obj: Int): KSpecular? = if (obj < 0) null else KSpecular(textureView(f(obj, "specularTexture")), textureView(f(obj, "specularColorTexture")), n(obj, "specularFactor", 1f), fixed(obj, "specularColorFactor", 3) { floatArrayOf(1f, 1f, 1f) })
    private fun volume(obj: Int): KVolume? = if (obj < 0) null else KVolume(textureView(f(obj, "thicknessTexture")), n(obj, "thicknessFactor"), fixed(obj, "attenuationColor", 3) { floatArrayOf(1f, 1f, 1f) }, n(obj, "attenuationDistance", Float.MAX_VALUE))
    private fun sheen(obj: Int): KSheen? = if (obj < 0) null else KSheen(textureView(f(obj, "sheenColorTexture")), fixed(obj, "sheenColorFactor", 3) { floatArrayOf(0f, 0f, 0f) }, textureView(f(obj, "sheenRoughnessTexture")), n(obj, "sheenRoughnessFactor"))
    private fun iridescence(obj: Int): KIridescence? = if (obj < 0) null else KIridescence(n(obj, "iridescenceFactor"), textureView(f(obj, "iridescenceTexture")), n(obj, "iridescenceIor", 1.3f), n(obj, "iridescenceThicknessMinimum", 100f), n(obj, "iridescenceThicknessMaximum", 400f), textureView(f(obj, "iridescenceThicknessTexture")))
    private fun diffuseTransmission(obj: Int): KDiffuseTransmission? = if (obj < 0) null else KDiffuseTransmission(textureView(f(obj, "diffuseTransmissionTexture")), n(obj, "diffuseTransmissionFactor"), fixed(obj, "diffuseTransmissionColorFactor", 3) { floatArrayOf(1f, 1f, 1f) }, textureView(f(obj, "diffuseTransmissionColorTexture")))
    private fun anisotropy(obj: Int): KAnisotropy? = if (obj < 0) null else KAnisotropy(n(obj, "anisotropyStrength"), n(obj, "anisotropyRotation"), textureView(f(obj, "anisotropyTexture")))

    private fun material(obj: Int): KMaterial {
        val alpha = f(obj, "alphaMode")
        return KMaterial(
        s(obj, "name"), metallicRoughness(f(obj, "pbrMetallicRoughness")), specularGlossiness(extension(obj, "KHR_materials_pbrSpecularGlossiness")),
        textureView(f(obj, "normalTexture")), textureView(f(obj, "occlusionTexture")), textureView(f(obj, "emissiveTexture")),
        fixed(obj, "emissiveFactor", 3) { floatArrayOf(0f, 0f, 0f) }, when { json.matches(alpha, "MASK") -> 1; json.matches(alpha, "BLEND") -> 2; else -> 0 }, n(obj, "alphaCutoff", 0.5f), b(obj, "doubleSided"),
        extension(obj, "KHR_materials_unlit") >= 0, clearcoat(extension(obj, "KHR_materials_clearcoat")), transmission(extension(obj, "KHR_materials_transmission")),
        extensionFloat(obj, "KHR_materials_ior", "ior", 1.5f), specular(extension(obj, "KHR_materials_specular")), volume(extension(obj, "KHR_materials_volume")),
        sheen(extension(obj, "KHR_materials_sheen")), extensionFloat(obj, "KHR_materials_emissive_strength", "emissiveStrength", 1f), iridescence(extension(obj, "KHR_materials_iridescence")),
        diffuseTransmission(extension(obj, "KHR_materials_diffuse_transmission")), anisotropy(extension(obj, "KHR_materials_anisotropy")), extensionFloat(obj, "KHR_materials_dispersion", "dispersion", 0f), extras(obj), extensions(obj),
        )
    }

    private fun image(obj: Int): KImage = KImage(s(obj, "name"), s(obj, "uri"), ref(obj, "bufferView"), s(obj, "mimeType"), extras(obj), extensions(obj))
    private fun sampler(obj: Int): KSampler = KSampler(s(obj, "name"), i(obj, "magFilter"), i(obj, "minFilter"), i(obj, "wrapS", 10497), i(obj, "wrapT", 10497), extras(obj), extensions(obj))
    private fun texture(obj: Int): KTexture = KTexture(s(obj, "name"), ref(obj, "source"), ref(obj, "sampler"), ref(extension(obj, "KHR_texture_basisu"), "source"), ref(extension(obj, "EXT_texture_webp"), "source"), extras(obj), extensions(obj))

    private fun node(obj: Int): KNode = KNode(
        s(obj, "name"), -1, ints(obj, "children"), ref(obj, "mesh"), ref(obj, "skin"), ref(obj, "camera"), ref(extension(obj, "KHR_lights_punctual"), "light"),
        floats(obj, "weights"), fixed(obj, "translation", 3) { floatArrayOf(0f, 0f, 0f) }, fixed(obj, "rotation", 4) { floatArrayOf(0f, 0f, 0f, 1f) }, fixed(obj, "scale", 3) { floatArrayOf(1f, 1f, 1f) },
        fixed(obj, "matrix", 16) { floatArrayOf(1f, 0f, 0f, 0f, 0f, 1f, 0f, 0f, 0f, 0f, 1f, 0f, 0f, 0f, 0f, 1f) }, f(obj, "matrix") >= 0,
        f(obj, "translation") >= 0, f(obj, "rotation") >= 0, f(obj, "scale") >= 0,
        attributes(f(extension(obj, "EXT_mesh_gpu_instancing"), "attributes")), extras(obj), extensions(obj),
    )

    private fun scene(obj: Int): KScene = KScene(s(obj, "name"), ints(obj, "nodes"), extras(obj), extensions(obj))
    private fun skin(obj: Int): KSkin = KSkin(s(obj, "name"), ints(obj, "joints"), ref(obj, "skeleton"), ref(obj, "inverseBindMatrices"), extras(obj), extensions(obj))
    private fun animationSampler(obj: Int): KAnimationSampler {
        val interpolation = f(obj, "interpolation")
        return KAnimationSampler(ref(obj, "input"), ref(obj, "output"), when { json.matches(interpolation, "STEP") -> 1; json.matches(interpolation, "CUBICSPLINE") -> 2; else -> 0 }, extras(obj), extensions(obj))
    }
    private fun animationChannel(obj: Int): KAnimationChannel {
        val target = f(obj, "target")
        val path = f(target, "path")
        return KAnimationChannel(ref(obj, "sampler"), ref(target, "node"), when { json.matches(path, "translation") -> 1; json.matches(path, "rotation") -> 2; json.matches(path, "scale") -> 3; json.matches(path, "weights") -> 4; else -> 0 }, extras(obj), extensions(obj))
    }
    private fun animation(obj: Int): KAnimation = KAnimation(s(obj, "name"), array(f(obj, "samplers"), ::animationSampler), array(f(obj, "channels"), ::animationChannel), extras(obj), extensions(obj))
    private fun camera(obj: Int): KCamera {
        val type = f(obj, "type")
        val perspectiveToken = f(obj, "perspective")
        val orthographicToken = f(obj, "orthographic")
        val perspective = if (perspectiveToken < 0) null else KPerspective(optionalFloat(perspectiveToken, "aspectRatio"), n(perspectiveToken, "yfov"), optionalFloat(perspectiveToken, "zfar"), n(perspectiveToken, "znear"), extras(perspectiveToken))
        val orthographic = if (orthographicToken < 0) null else KOrthographic(n(orthographicToken, "xmag"), n(orthographicToken, "ymag"), n(orthographicToken, "zfar"), n(orthographicToken, "znear"), extras(orthographicToken))
        return KCamera(s(obj, "name"), when { json.matches(type, "perspective") -> 1; json.matches(type, "orthographic") -> 2; else -> 0 }, perspective, orthographic, extras(obj), extensions(obj))
    }
    private fun light(obj: Int): KLight {
        val spot = f(obj, "spot")
        val type = f(obj, "type")
        return KLight(s(obj, "name"), fixed(obj, "color", 3) { floatArrayOf(1f, 1f, 1f) }, n(obj, "intensity", 1f), when { json.matches(type, "directional") -> 1; json.matches(type, "point") -> 2; json.matches(type, "spot") -> 3; else -> 0 }, n(obj, "range"), n(spot, "innerConeAngle"), n(spot, "outerConeAngle", 0.7853981633974483f), extras(obj))
    }
}
