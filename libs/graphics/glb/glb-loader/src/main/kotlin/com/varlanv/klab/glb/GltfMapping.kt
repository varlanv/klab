package com.varlanv.klab.glb

import com.varlanv.klab.collections.Array
import com.varlanv.klab.collections.Floats
import com.varlanv.klab.collections.Ints

private const val JSON_ROOT_TOKEN = 0
private const val DECIMAL_RADIX = 10
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

internal fun mapGltf(json: GltfJson): KGltf = GltfMapping(json).map()

private val emptyExtensions: Array<KExtension> = emptyArray<KExtension>()
private val emptyAttributes: Array<KAttribute> = emptyArray<KAttribute>()
private val emptyStrings: Array<String> = emptyArray<String>()

private class GltfMapping(private val json: GltfJson) {
    private fun fieldTokenIndex(obj: Int, name: GltfName): Int =
        if (obj < 0) {
            JSON_MISSING_TOKEN
        } else {
            json.field(obj, name)
        }

    private fun string(obj: Int, name: GltfName): String? = json.string(fieldTokenIndex(obj, name))
    private fun integer(obj: Int, name: GltfName, default: Int = 0): Int = json.int(fieldTokenIndex(obj, name), default)
    private fun ref(obj: Int, name: GltfName): Int {
        val token = fieldTokenIndex(obj, name)
        if (token < 0) {
            return GLTF_MISSING_INDEX
        }
        return json.int(token).also { assert(it >= 0) { "Negative glTF reference" } }
    }

    private fun required(obj: Int, name: GltfName): Int =
        fieldTokenIndex(obj, name).also { assert(it >= 0) { "Missing $name" } }

    private fun requiredNumber(obj: Int, name: GltfName): Float = json.float(required(obj, name))
    private fun number(obj: Int, name: GltfName, default: Float = 0f): Float =
        json.float(fieldTokenIndex(obj, name), default)

    private fun boolean(obj: Int, name: GltfName): Boolean = json.bool(fieldTokenIndex(obj, name))
    private fun extras(obj: Int): String? = json.raw(fieldTokenIndex(obj, GltfName.Extras))
    private fun floats(obj: Int, name: GltfName): Floats {
        val token = fieldTokenIndex(obj, name)
        return json.floats(token).also { assert(token < 0 || it.isNotEmpty()) { "Empty $name" } }
    }

    private fun bounds(obj: Int, name: GltfName, componentType: Int): Floats {
        val token = fieldTokenIndex(obj, name)
        val values = json.floats(token)
        assert(token < 0 || values.isNotEmpty()) { "Empty accessor $name" }
        json.validateIntegerBounds(token, componentType)
        return values
    }

    private fun ints(obj: Int, name: GltfName): Ints {
        val token = fieldTokenIndex(obj, name)
        return json.ints(token).also { assert(token < 0 || it.isNotEmpty()) { "Empty $name" } }
    }

    private inline fun fixed(obj: Int, name: GltfName, count: Int, defaults: () -> Floats): Floats {
        return fixedToken(fieldTokenIndex(obj, name), name, count, defaults)
    }

    private inline fun fixedToken(token: Int, name: GltfName, count: Int, defaults: () -> Floats): Floats {
        if (token < 0) {
            return defaults()
        }
        val result = json.floats(token)
        assert(result.size == count) { "Invalid $name component count" }
        return result
    }

    private inline fun <reified T> array(token: Int, read: (Int) -> T): Array<T> {
        if (token < 0) {
            return emptyArray()
        }
        json.requireArray(token)
        assert(json.size(token) > 0) { "Empty glTF array" }
        var child = token + 1
        return Array(json.size(token)) {
            val current = child
            child = json.next(current)
            read(current)
        }
    }

    private fun strings(token: Int, allowEmpty: Boolean = false): Array<String> = if (token < 0) {
        emptyStrings
    } else {
        json.requireArray(token)
        assert(allowEmpty || json.size(token) > 0) { "Empty glTF string array" }
        if (json.size(token) == 0) {
            emptyStrings
        } else {
            array(token) { requireNotNull(json.string(it)) }
        }
    }

    private fun extensions(obj: Int): Array<KExtension> {
        val token = fieldTokenIndex(obj, GltfName.Extensions)
        if (token < 0) {
            return emptyExtensions
        }
        json.requireObject(token)
        if (json.size(token) == 0) {
            return emptyExtensions
        }
        var key = token + 1
        return lastProperties(Array(json.size(token)) {
            val name = requireNotNull(json.string(key))
            val next = json.next(key + 1)
            val value = json.field(obj = token, nameToken = key)
            json.requireObject(value)
            val result = KExtension(
                name,
                requireNotNull(json.raw(value)),
            )
            key = next
            result
        }) { it.name }
    }

    private inline fun <reified T> lastProperties(values: Array<T>, name: (T) -> String): Array<T> {
        for (i in values.indices) {
            for (j in i + 1 until values.size) {
                if (name(values[i]) == name(values[j])) {
                    return values.filterIndexed { index, value ->
                        (index + 1 until values.size).none { name(value) == name(values[it]) }
                    }.toTypedArray()
                }
            }
        }
        return values
    }

    private fun extension(obj: Int, name: GltfName): Int =
        fieldTokenIndex(fieldTokenIndex(obj, GltfName.Extensions), name)

    private fun extensionRef(obj: Int, name: GltfName, field: GltfName): Int {
        val token = extension(obj, name)
        if (token < 0) {
            return GLTF_MISSING_INDEX
        }
        return ref(token, field).also { assert(it >= 0) { "Missing $field in $name" } }
    }

    private fun extensionFloat(obj: Int, extension: GltfName, name: GltfName, default: Float): Float? {
        val token = this.extension(obj, extension)
        return if (token < 0) {
            null
        } else {
            number(token, name, default)
        }
    }

    private fun optionalFloat(obj: Int, name: GltfName): Float? {
        val token = fieldTokenIndex(obj, name)
        return if (token < 0) {
            null
        } else {
            json.float(token)
        }
    }

    fun map(): KGltf {
        val asset = fieldTokenIndex(JSON_ROOT_TOKEN, GltfName.Asset)
        assert(asset >= 0) { "Missing glTF asset" }
        val nodes = array(fieldTokenIndex(JSON_ROOT_TOKEN, GltfName.Nodes), ::node)
        val rootExtensions = fieldTokenIndex(JSON_ROOT_TOKEN, GltfName.Extensions)
        return KGltf(
            asset = KAsset(
                copyright = string(asset, GltfName.Copyright),
                generator = string(asset, GltfName.Generator),
                version = string(asset, GltfName.Version),
                minVersion = string(asset, GltfName.MinVersion),
                extras = extras(asset),
                extensions = extensions(asset)
            ),
            buffers = array(fieldTokenIndex(JSON_ROOT_TOKEN, GltfName.Buffers), ::buffer),
            bufferViews = array(fieldTokenIndex(JSON_ROOT_TOKEN, GltfName.BufferViews), ::bufferView),
            accessors = array(fieldTokenIndex(JSON_ROOT_TOKEN, GltfName.Accessors), ::accessor),
            meshes = array(fieldTokenIndex(JSON_ROOT_TOKEN, GltfName.Meshes), ::mesh),
            materials = array(fieldTokenIndex(JSON_ROOT_TOKEN, GltfName.Materials), ::material),
            images = array(fieldTokenIndex(JSON_ROOT_TOKEN, GltfName.Images), ::image),
            textures = array(fieldTokenIndex(JSON_ROOT_TOKEN, GltfName.Textures), ::texture),
            samplers = array(fieldTokenIndex(JSON_ROOT_TOKEN, GltfName.Samplers), ::sampler),
            nodes = nodes,
            scenes = array(fieldTokenIndex(JSON_ROOT_TOKEN, GltfName.Scenes), ::scene),
            scene = ref(JSON_ROOT_TOKEN, GltfName.Scene),
            skins = array(fieldTokenIndex(JSON_ROOT_TOKEN, GltfName.Skins), ::skin),
            animations = array(fieldTokenIndex(JSON_ROOT_TOKEN, GltfName.Animations), ::animation),
            cameras = array(fieldTokenIndex(JSON_ROOT_TOKEN, GltfName.Cameras), ::camera),
            lights = array(
                fieldTokenIndex(fieldTokenIndex(rootExtensions, GltfName.KHR_lights_punctual), GltfName.Lights),
                ::light
            ),
            variants = array(
                fieldTokenIndex(
                    fieldTokenIndex(rootExtensions, GltfName.KHR_materials_variants),
                    GltfName.Variants
                )
            ) {
                KVariant(
                    string(it, GltfName.Name),
                    extras(it)
                )
            },
            extensionsUsed = strings(fieldTokenIndex(JSON_ROOT_TOKEN, GltfName.ExtensionsUsed)),
            extensionsRequired = strings(fieldTokenIndex(JSON_ROOT_TOKEN, GltfName.ExtensionsRequired)),
            extras = extras(JSON_ROOT_TOKEN),
            extensions = extensions(JSON_ROOT_TOKEN),
        )
    }

    private fun buffer(obj: Int): KBuffer =
        KBuffer(
            string(obj, GltfName.Name),
            integer(obj, GltfName.ByteLength),
            string(obj, GltfName.Uri),
            extras(obj),
            extensions(obj)
        )

    private fun bufferView(obj: Int): KBufferView {
        assert(
            extension(obj, GltfName.EXT_meshopt_compression) < 0 || extension(
                obj,
                GltfName.KHR_meshopt_compression
            ) < 0
        ) { "Conflicting meshopt extensions" }
        var compression = extension(obj, GltfName.EXT_meshopt_compression)
        var khr = false
        if (compression < 0) {
            compression = extension(obj, GltfName.KHR_meshopt_compression)
            khr = compression >= 0
        }
        val meshopt = if (compression < 0) {
            null
        } else {
            KMeshopt(
                ref(compression, GltfName.Buffer),
                integer(compression, GltfName.ByteOffset),
                integer(compression, GltfName.ByteLength),
                integer(compression, GltfName.ByteStride),
                integer(compression, GltfName.Count),
                string(compression, GltfName.Mode),
                string(compression, GltfName.Filter),
                khr,
            )
        }
        return KBufferView(
            string(obj, GltfName.Name),
            ref(obj, GltfName.Buffer),
            integer(obj, GltfName.ByteOffset),
            integer(obj, GltfName.ByteLength),
            integer(obj, GltfName.ByteStride).also { assert(fieldTokenIndex(obj, GltfName.ByteStride) < 0 || it > 0) },
            integer(obj, GltfName.Target).also { assert(fieldTokenIndex(obj, GltfName.Target) < 0 || it > 0) },
            meshopt,
            extras(obj),
            extensions(obj)
        )
    }

    private fun accessor(obj: Int): KAccessor {
        val sparseToken = fieldTokenIndex(obj, GltfName.Sparse)
        val sparse = if (sparseToken < 0) {
            null
        } else {
            val indices = required(sparseToken, GltfName.Indices)
            val values = required(sparseToken, GltfName.Values)
            KSparse(
                count = integer(sparseToken, GltfName.Count),
                indicesBufferView = ref(indices, GltfName.BufferView),
                indicesOffset = integer(indices, GltfName.ByteOffset),
                indicesComponentType = ComponentType(integer(indices, GltfName.ComponentType)),
                valuesBufferView = ref(values, GltfName.BufferView),
                valuesOffset = integer(values, GltfName.ByteOffset)
            )
        }
        assert(
            fieldTokenIndex(obj, GltfName.BufferView) >= 0 || fieldTokenIndex(
                obj,
                GltfName.ByteOffset
            ) < 0
        ) { "Accessor byteOffset requires bufferView" }
        val token = fieldTokenIndex(obj, GltfName.Type)
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
        val componentType = integer(obj, GltfName.ComponentType)
        return KAccessor(
            name = string(obj, GltfName.Name),
            componentType = ComponentType(componentType),
            type = AccessorType(type),
            offset = integer(obj, GltfName.ByteOffset),
            count = integer(obj, GltfName.Count),
            stride = 0,
            bufferView = ref(obj, GltfName.BufferView),
            normalized = boolean(obj, GltfName.Normalized),
            min = bounds(obj, GltfName.Min, componentType),
            max = bounds(obj, GltfName.Max, componentType),
            sparse = sparse,
            extras = extras(obj),
            extensions = extensions(obj)
        )
    }

    private fun attributes(obj: Int): Array<KAttribute> {
        if (obj < 0) {
            return emptyAttributes
        }
        json.requireObject(obj)
        if (json.size(obj) == 0) {
            return emptyAttributes
        }
        var key = obj + 1
        return lastProperties(Array(json.size(obj)) {
            val name = requireNotNull(json.string(key))
            val value = json.field(obj = obj, nameToken = key)
            key = json.next(key + 1)
            val separator = name.indexOf('_')
            val length = if (separator < 0) {
                name.length
            } else {
                separator
            }
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
            if (semantic in ATTRIBUTE_TEXCOORD..ATTRIBUTE_WEIGHTS) {
                if (separator < 0 || separator == name.lastIndex) {
                    semantic = ATTRIBUTE_INVALID
                } else for (index in separator + 1 until name.length) {
                    val digit = name[index] - '0'
                    if (digit !in 0..9 || set > (Int.MAX_VALUE - digit) / 10) {
                        semantic = ATTRIBUTE_INVALID
                        break
                    }
                    set = set * 10 + digit
                }
            } else if (semantic in ATTRIBUTE_POSITION..ATTRIBUTE_TANGENT && separator >= 0) {
                semantic = ATTRIBUTE_INVALID
            }
            KAttribute(name, json.int(value).also { assert(it >= 0) }, semantic, set)
        }) { it.name }
    }

    private fun primitive(obj: Int): KPrimitive {
        val dracoToken = extension(obj, GltfName.KHR_draco_mesh_compression)
        val draco = if (dracoToken < 0) {
            null
        } else {
            KDraco(
                ref(dracoToken, GltfName.BufferView),
                attributes(fieldTokenIndex(dracoToken, GltfName.Attributes))
            )
        }
        val mappingsToken = fieldTokenIndex(extension(obj, GltfName.KHR_materials_variants), GltfName.Mappings)
        val mappings = if (mappingsToken < 0) {
            emptyArray()
        } else {
            val groups = array(mappingsToken) { token ->
                val material = ref(token, GltfName.Material)
                val extras = extras(token)
                val variants = ints(token, GltfName.Variants)
                assert(material >= 0 && variants.isNotEmpty()) { "Invalid material variant mapping" }
                Array(variants.size) { KMaterialMapping(variants[it], material, extras) }
            }
            Array(groups.sumOf { it.size }) { index ->
                var remaining = index
                var group = 0
                while (remaining >= groups[group].size) {
                    remaining -= groups[group++].size
                }
                groups[group][remaining]
            }
        }
        return KPrimitive(
            integer(obj, GltfName.Mode, GLTF_PRIMITIVE_TRIANGLES),
            ref(obj, GltfName.Indices),
            ref(obj, GltfName.Material),
            attributes(fieldTokenIndex(obj, GltfName.Attributes)),
            array(fieldTokenIndex(obj, GltfName.Targets), ::attributes),
            draco,
            mappings,
            extras(obj),
            extensions(obj)
        )
    }

    private fun mesh(obj: Int): KMesh = KMesh(
        string(obj, GltfName.Name),
        array(fieldTokenIndex(obj, GltfName.Primitives), ::primitive),
        floats(obj, GltfName.Weights),
        targetNames(obj),
        extras(obj),
        extensions(obj)
    )

    private fun targetNames(obj: Int): Array<String> {
        val token = fieldTokenIndex(obj, GltfName.Extras)
        return if (json.isObject(token)) {
            strings(fieldTokenIndex(token, GltfName.TargetNames), true)
        } else {
            emptyStrings
        }
    }

    private fun textureView(obj: Int, scaleProperty: GltfName? = null): KTextureView? {
        if (obj < 0) {
            return null
        }
        val transformToken = extension(obj, GltfName.KHR_texture_transform)
        val transform = if (transformToken < 0) {
            null
        } else {
            KTextureTransform(
                fixed(transformToken, GltfName.Offset, VEC2_COMPONENTS) { floatArrayOf(0f, 0f) },
                number(transformToken, GltfName.Rotation),
                fixed(transformToken, GltfName.Scale, VEC2_COMPONENTS) { floatArrayOf(1f, 1f) },
                ref(transformToken, GltfName.TexCoord)
            )
        }
        return KTextureView(
            ref(obj, GltfName.Index),
            integer(obj, GltfName.TexCoord),
            if (scaleProperty == null) {
                1f
            } else {
                number(obj, scaleProperty, 1f)
            },
            transform
        )
    }

    private fun metallicRoughness(obj: Int): KMetallicRoughness? = if (obj < 0) {
        null
    } else {
        KMetallicRoughness(
            textureView(fieldTokenIndex(obj, GltfName.BaseColorTexture)),
            textureView(fieldTokenIndex(obj, GltfName.MetallicRoughnessTexture)),
            fixed(obj, GltfName.BaseColorFactor, VEC4_COMPONENTS) { floatArrayOf(1f, 1f, 1f, 1f) },
            number(obj, GltfName.MetallicFactor, 1f),
            number(obj, GltfName.RoughnessFactor, 1f),
        )
    }

    private fun specularGlossiness(obj: Int): KSpecularGlossiness? = if (obj < 0) {
        null
    } else {
        KSpecularGlossiness(
            textureView(fieldTokenIndex(obj, GltfName.DiffuseTexture)),
            textureView(fieldTokenIndex(obj, GltfName.SpecularGlossinessTexture)),
            fixed(obj, GltfName.DiffuseFactor, VEC4_COMPONENTS) { floatArrayOf(1f, 1f, 1f, 1f) },
            fixed(obj, GltfName.SpecularFactor, VEC3_COMPONENTS) { floatArrayOf(1f, 1f, 1f) },
            number(obj, GltfName.GlossinessFactor, 1f),
        )
    }

    private fun clearcoat(obj: Int): KClearcoat? = if (obj < 0) {
        null
    } else {
        KClearcoat(
            textureView(fieldTokenIndex(obj, GltfName.ClearcoatTexture)),
            textureView(fieldTokenIndex(obj, GltfName.ClearcoatRoughnessTexture)),
            textureView(fieldTokenIndex(obj, GltfName.ClearcoatNormalTexture), GltfName.Scale),
            number(obj, GltfName.ClearcoatFactor),
            number(obj, GltfName.ClearcoatRoughnessFactor),
        )
    }

    private fun transmission(obj: Int): KTransmission? =
        if (obj < 0) {
            null
        } else {
            KTransmission(
                textureView(fieldTokenIndex(obj, GltfName.TransmissionTexture)),
                number(obj, GltfName.TransmissionFactor)
            )
        }

    private fun specular(obj: Int): KSpecular? = if (obj < 0) {
        null
    } else {
        KSpecular(
            textureView(fieldTokenIndex(obj, GltfName.SpecularTexture)),
            textureView(fieldTokenIndex(obj, GltfName.SpecularColorTexture)),
            number(obj, GltfName.SpecularFactor, 1f),
            fixed(obj, GltfName.SpecularColorFactor, VEC3_COMPONENTS) { floatArrayOf(1f, 1f, 1f) })
    }

    private fun volume(obj: Int): KVolume? = if (obj < 0) {
        null
    } else {
        KVolume(
            textureView(fieldTokenIndex(obj, GltfName.ThicknessTexture)),
            number(obj, GltfName.ThicknessFactor),
            fixed(obj, GltfName.AttenuationColor, VEC3_COMPONENTS) { floatArrayOf(1f, 1f, 1f) },
            number(obj, GltfName.AttenuationDistance, Float.MAX_VALUE)
        )
    }

    private fun sheen(obj: Int): KSheen? = if (obj < 0) {
        null
    } else {
        KSheen(
            textureView(fieldTokenIndex(obj, GltfName.SheenColorTexture)),
            fixed(obj, GltfName.SheenColorFactor, VEC3_COMPONENTS) { floatArrayOf(0f, 0f, 0f) },
            textureView(fieldTokenIndex(obj, GltfName.SheenRoughnessTexture)),
            number(obj, GltfName.SheenRoughnessFactor)
        )
    }

    private fun iridescence(obj: Int): KIridescence? = if (obj < 0) {
        null
    } else {
        KIridescence(
            number(obj, GltfName.IridescenceFactor),
            textureView(fieldTokenIndex(obj, GltfName.IridescenceTexture)),
            number(obj, GltfName.IridescenceIor, DEFAULT_IRIDESCENCE_IOR),
            number(obj, GltfName.IridescenceThicknessMinimum, DEFAULT_IRIDESCENCE_THICKNESS_MIN),
            number(obj, GltfName.IridescenceThicknessMaximum, DEFAULT_IRIDESCENCE_THICKNESS_MAX),
            textureView(fieldTokenIndex(obj, GltfName.IridescenceThicknessTexture))
        )
    }

    private fun diffuseTransmission(obj: Int): KDiffuseTransmission? = if (obj < 0) {
        null
    } else {
        KDiffuseTransmission(
            textureView(fieldTokenIndex(obj, GltfName.DiffuseTransmissionTexture)),
            number(obj, GltfName.DiffuseTransmissionFactor),
            fixed(obj, GltfName.DiffuseTransmissionColorFactor, VEC3_COMPONENTS) { floatArrayOf(1f, 1f, 1f) },
            textureView(fieldTokenIndex(obj, GltfName.DiffuseTransmissionColorTexture))
        )
    }

    private fun anisotropy(obj: Int): KAnisotropy? = if (obj < 0) {
        null
    } else {
        KAnisotropy(
            number(obj, GltfName.AnisotropyStrength),
            number(obj, GltfName.AnisotropyRotation),
            textureView(fieldTokenIndex(obj, GltfName.AnisotropyTexture))
        )
    }

    private fun material(obj: Int): KMaterial {
        val alpha = fieldTokenIndex(obj, GltfName.AlphaMode)
        assert(
            alpha < 0 || json.matches(alpha, "OPAQUE") || json.matches(alpha, "MASK") || json.matches(
                alpha,
                "BLEND"
            )
        ) { "Invalid alphaMode" }
        return KMaterial(
            string(obj, GltfName.Name),
            metallicRoughness(fieldTokenIndex(obj, GltfName.PbrMetallicRoughness)),
            specularGlossiness(extension(obj, GltfName.KHR_materials_pbrSpecularGlossiness)),
            textureView(fieldTokenIndex(obj, GltfName.NormalTexture), GltfName.Scale),
            textureView(fieldTokenIndex(obj, GltfName.OcclusionTexture), GltfName.Strength),
            textureView(fieldTokenIndex(obj, GltfName.EmissiveTexture)),
            fixed(obj, GltfName.EmissiveFactor, VEC3_COMPONENTS) { floatArrayOf(0f, 0f, 0f) },
            when {
                json.matches(alpha, "MASK") -> ALPHA_MASK
                json.matches(alpha, "BLEND") -> ALPHA_BLEND
                else -> ALPHA_OPAQUE
            },
            number(obj, GltfName.AlphaCutoff, DEFAULT_ALPHA_CUTOFF),
            boolean(obj, GltfName.DoubleSided),
            extension(obj, GltfName.KHR_materials_unlit) >= 0,
            clearcoat(extension(obj, GltfName.KHR_materials_clearcoat)),
            transmission(extension(obj, GltfName.KHR_materials_transmission)),
            extensionFloat(obj, GltfName.KHR_materials_ior, GltfName.Ior, DEFAULT_IOR),
            specular(extension(obj, GltfName.KHR_materials_specular)),
            volume(extension(obj, GltfName.KHR_materials_volume)),
            sheen(extension(obj, GltfName.KHR_materials_sheen)),
            extensionFloat(obj, GltfName.KHR_materials_emissive_strength, GltfName.EmissiveStrength, 1f),
            iridescence(extension(obj, GltfName.KHR_materials_iridescence)),
            diffuseTransmission(extension(obj, GltfName.KHR_materials_diffuse_transmission)),
            anisotropy(extension(obj, GltfName.KHR_materials_anisotropy)),
            extensionFloat(obj, GltfName.KHR_materials_dispersion, GltfName.Dispersion, 0f),
            extras(obj),
            extensions(obj),
        )
    }

    private fun image(obj: Int): KImage =
        KImage(
            string(obj, GltfName.Name),
            string(obj, GltfName.Uri),
            ref(obj, GltfName.BufferView),
            string(obj, GltfName.MimeType),
            extras(obj),
            extensions(obj)
        )

    private fun sampler(obj: Int): KSampler = KSampler(
        string(obj, GltfName.Name),
        integer(obj, GltfName.MagFilter).also { assert(fieldTokenIndex(obj, GltfName.MagFilter) < 0 || it > 0) },
        integer(obj, GltfName.MinFilter).also { assert(fieldTokenIndex(obj, GltfName.MinFilter) < 0 || it > 0) },
        integer(obj, GltfName.WrapS, TEXTURE_WRAP_REPEAT),
        integer(obj, GltfName.WrapT, TEXTURE_WRAP_REPEAT),
        extras(obj),
        extensions(obj)
    )

    private fun texture(obj: Int): KTexture = KTexture(
        string(obj, GltfName.Name),
        ref(obj, GltfName.Source),
        ref(obj, GltfName.Sampler),
        extensionRef(obj, GltfName.KHR_texture_basisu, GltfName.Source),
        extensionRef(obj, GltfName.EXT_texture_webp, GltfName.Source),
        extras(obj),
        extensions(obj)
    )

    private fun node(obj: Int): KNode {
        val translation = fieldTokenIndex(obj, GltfName.Translation)
        val rotation = fieldTokenIndex(obj, GltfName.Rotation)
        val scale = fieldTokenIndex(obj, GltfName.Scale)
        val matrix = fieldTokenIndex(obj, GltfName.Matrix)
        return KNode(
            string(obj, GltfName.Name),
            GLTF_MISSING_INDEX,
            ints(obj, GltfName.Children),
            ref(obj, GltfName.Mesh),
            ref(obj, GltfName.Skin),
            ref(obj, GltfName.Camera),
            extensionRef(obj, GltfName.KHR_lights_punctual, GltfName.Light),
            floats(obj, GltfName.Weights),
            if (translation < 0) {
                null
            } else {
                fixedToken(
                    translation,
                    GltfName.Translation,
                    VEC3_COMPONENTS
                ) { defaultTranslation }
            },
            if (rotation < 0) {
                null
            } else {
                fixedToken(rotation, GltfName.Rotation, VEC4_COMPONENTS) { defaultRotation }
            },
            if (scale < 0) {
                null
            } else {
                fixedToken(scale, GltfName.Scale, VEC3_COMPONENTS) { defaultScale }
            },
            if (matrix < 0) {
                null
            } else {
                fixedToken(matrix, GltfName.Matrix, MAT4_COMPONENTS) { defaultMatrix }
            },
            matrix >= 0,
            translation >= 0,
            rotation >= 0,
            scale >= 0,
            attributes(fieldTokenIndex(extension(obj, GltfName.EXT_mesh_gpu_instancing), GltfName.Attributes)),
            extras(obj),
            extensions(obj),
        )
    }

    private fun scene(obj: Int): KScene =
        KScene(string(obj, GltfName.Name), ints(obj, GltfName.Nodes), extras(obj), extensions(obj))

    private fun skin(obj: Int): KSkin = KSkin(
        string(obj, GltfName.Name),
        ints(obj, GltfName.Joints),
        ref(obj, GltfName.Skeleton),
        ref(obj, GltfName.InverseBindMatrices),
        extras(obj),
        extensions(obj)
    )

    private fun animationSampler(obj: Int): KAnimationSampler {
        val interpolation = fieldTokenIndex(obj, GltfName.Interpolation)
        assert(
            interpolation < 0 || json.matches(interpolation, "LINEAR") || json.matches(
                interpolation,
                "STEP"
            ) || json.matches(interpolation, "CUBICSPLINE")
        ) { "Invalid animation interpolation" }
        return KAnimationSampler(
            ref(obj, GltfName.Input), ref(obj, GltfName.Output), when {
                json.matches(interpolation, "STEP") -> GLTF_INTERPOLATION_STEP
                json.matches(interpolation, "CUBICSPLINE") -> GLTF_INTERPOLATION_CUBIC_SPLINE
                else -> GLTF_INTERPOLATION_LINEAR
            }, extras(obj), extensions(obj)
        )
    }

    private fun animationChannel(obj: Int): KAnimationChannel {
        val target = required(obj, GltfName.Target)
        val path = fieldTokenIndex(target, GltfName.Path)
        return KAnimationChannel(
            ref(obj, GltfName.Sampler), ref(target, GltfName.Node), when {
                json.matches(path, GltfName.Translation) -> GLTF_PATH_TRANSLATION
                json.matches(path, GltfName.Rotation) -> GLTF_PATH_ROTATION
                json.matches(path, GltfName.Scale) -> GLTF_PATH_SCALE
                json.matches(path, GltfName.Weights) -> GLTF_PATH_WEIGHTS
                else -> GLTF_PATH_INVALID
            }, extras(obj), extensions(obj)
        )
    }

    private fun animation(obj: Int): KAnimation = KAnimation(
        string(obj, GltfName.Name),
        array(fieldTokenIndex(obj, GltfName.Samplers), ::animationSampler),
        array(fieldTokenIndex(obj, GltfName.Channels), ::animationChannel),
        extras(obj),
        extensions(obj)
    )

    private fun camera(obj: Int): KCamera {
        val type = fieldTokenIndex(obj, GltfName.Type)
        val perspectiveToken = fieldTokenIndex(obj, GltfName.Perspective)
        val orthographicToken = fieldTokenIndex(obj, GltfName.Orthographic)
        val perspective = if (perspectiveToken < 0) {
            null
        } else {
            KPerspective(
                optionalFloat(perspectiveToken, GltfName.AspectRatio),
                requiredNumber(perspectiveToken, GltfName.Yfov),
                optionalFloat(perspectiveToken, GltfName.Zfar),
                requiredNumber(perspectiveToken, GltfName.Znear),
                extras(perspectiveToken)
            )
        }
        val orthographic = if (orthographicToken < 0) {
            null
        } else {
            KOrthographic(
                requiredNumber(orthographicToken, GltfName.Xmag),
                requiredNumber(orthographicToken, GltfName.Ymag),
                requiredNumber(orthographicToken, GltfName.Zfar),
                requiredNumber(orthographicToken, GltfName.Znear),
                extras(orthographicToken)
            )
        }
        return KCamera(
            string(obj, GltfName.Name), when {
                json.matches(type, "perspective") -> CAMERA_PERSPECTIVE
                json.matches(type, "orthographic") -> CAMERA_ORTHOGRAPHIC
                else -> CAMERA_INVALID
            }, perspective, orthographic, extras(obj), extensions(obj)
        )
    }

    private fun light(obj: Int): KLight {
        val spot = fieldTokenIndex(obj, GltfName.Spot)
        val type = fieldTokenIndex(obj, GltfName.Type)
        return KLight(
            string(obj, GltfName.Name),
            fixed(obj, GltfName.Color, VEC3_COMPONENTS) { floatArrayOf(1f, 1f, 1f) },
            number(obj, GltfName.Intensity, 1f),
            when {
                json.matches(type, "directional") -> LIGHT_DIRECTIONAL
                json.matches(type, "point") -> LIGHT_POINT
                json.matches(type, "spot") -> LIGHT_SPOT
                else -> LIGHT_INVALID
            },
            number(obj, GltfName.Range).also { assert(fieldTokenIndex(obj, GltfName.Range) < 0 || it > 0) },
            number(spot, GltfName.InnerConeAngle),
            number(spot, GltfName.OuterConeAngle, DEFAULT_SPOT_OUTER_CONE_ANGLE),
            extras(obj)
        )
    }
}
