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
    private fun fieldTokenIndex(obj: Int, name: GltfName): Int = if (obj < 0) {
        JSON_MISSING_TOKEN
    } else {
        json.field(obj, name)
    }

    private fun string(obj: Int, name: GltfName): String? = json.string(fieldTokenIndex(obj = obj, name = name))

    private fun integer(
        obj: Int,
        name: GltfName,
        default: Int = 0,
    ): Int = json.int(
        token = fieldTokenIndex(
            obj = obj,
            name = name,
        ),
        default = default,
    )

    private fun ref(obj: Int, name: GltfName): Int {
        val token = fieldTokenIndex(obj = obj, name = name)
        if (token < 0) {
            return GLTF_MISSING_INDEX
        }
        return json.int(token = token).also { assert(it >= 0) { "Negative glTF reference" } }
    }

    private fun required(
        obj: Int,
        name: GltfName,
    ): Int = fieldTokenIndex(obj = obj, name = name).also { assert(it >= 0) { "Missing $name" } }

    private fun requiredNumber(obj: Int, name: GltfName): Float = json.float(token = required(obj = obj, name = name))

    private fun number(
        obj: Int,
        name: GltfName,
        default: Float = 0f,
    ): Float = json.float(
        token = fieldTokenIndex(
            obj = obj,
            name = name,
        ),
        default = default,
    )

    private fun boolean(obj: Int, name: GltfName): Boolean = json.bool(token = fieldTokenIndex(obj = obj, name = name))

    private fun extras(obj: Int): String? = json.raw(fieldTokenIndex(obj = obj, name = GltfName.Extras))

    private fun floats(obj: Int, name: GltfName): Floats {
        val token = fieldTokenIndex(obj = obj, name = name)
        return json.floats(token).also { assert(token < 0 || it.isNotEmpty()) { "Empty $name" } }
    }

    private fun bounds(
        obj: Int,
        name: GltfName,
        componentType: Int,
    ): Floats {
        val token = fieldTokenIndex(obj = obj, name = name)
        val values = json.floats(token)
        assert(token < 0 || values.isNotEmpty()) { "Empty accessor $name" }
        json.validateIntegerBounds(token = token, componentType = componentType)
        return values
    }

    private fun ints(obj: Int, name: GltfName): Ints {
        val token = fieldTokenIndex(obj = obj, name = name)
        return json.ints(token).also { assert(token < 0 || it.isNotEmpty()) { "Empty $name" } }
    }

    private inline fun fixed(
        obj: Int,
        name: GltfName,
        count: Int,
        defaults: () -> Floats,
    ): Floats {
        return fixedToken(
            token = fieldTokenIndex(
                obj = obj,
                name = name,
            ),
            name = name,
            count = count,
            defaults = defaults,
        )
    }

    private inline fun fixedToken(
        token: Int,
        name: GltfName,
        count: Int,
        defaults: () -> Floats,
    ): Floats {
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

    private fun strings(
        token: Int,
        allowEmpty: Boolean = false,
    ): Array<String> = if (token < 0) {
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
        val token = fieldTokenIndex(obj = obj, name = GltfName.Extensions)
        if (token < 0) {
            return emptyExtensions
        }
        json.requireObject(token)
        if (json.size(token) == 0) {
            return emptyExtensions
        }
        var key = token + 1
        return lastProperties(
            Array(json.size(token)) {
                val name = requireNotNull(json.string(key))
                val next = json.next(key + 1)
                val value = json.field(obj = token, nameToken = key)
                json.requireObject(value)
                val result = KExtension(
                    name = name,
                    data = requireNotNull(json.raw(value)),
                )
                key = next
                result
            },
        ) { it.name }
    }

    private inline fun <reified T> lastProperties(values: Array<T>, name: (T) -> String): Array<T> {
        for (i in values.indices) {
            for (j in i + 1 until values.size) {
                if (name(values[i]) == name(values[j])) {
                    return values
                        .filterIndexed { index, value ->
                            (index + 1 until values.size).none { name(value) == name(values[it]) }
                        }
                        .toTypedArray()
                }
            }
        }
        return values
    }

    private fun extension(obj: Int, name: GltfName): Int = fieldTokenIndex(
        obj = fieldTokenIndex(
            obj = obj,
            name = GltfName.Extensions,
        ),
        name = name,
    )

    private fun extensionRef(
        obj: Int,
        name: GltfName,
        field: GltfName,
    ): Int {
        val token = extension(obj = obj, name = name)
        if (token < 0) {
            return GLTF_MISSING_INDEX
        }
        return ref(obj = token, name = field).also { assert(it >= 0) { "Missing $field in $name" } }
    }

    private fun extensionFloat(
        obj: Int,
        extension: GltfName,
        name: GltfName,
        default: Float,
    ): Float? {
        val token = this.extension(obj = obj, name = extension)
        return if (token < 0) {
            null
        } else {
            number(obj = token, name = name, default = default)
        }
    }

    private fun optionalFloat(obj: Int, name: GltfName): Float? {
        val token = fieldTokenIndex(obj = obj, name = name)
        return if (token < 0) {
            null
        } else {
            json.float(token = token)
        }
    }

    fun map(): KGltf {
        val asset = fieldTokenIndex(obj = JSON_ROOT_TOKEN, name = GltfName.Asset)
        assert(asset >= 0) { "Missing glTF asset" }
        val nodes = array(
            token = fieldTokenIndex(
                obj = JSON_ROOT_TOKEN,
                name = GltfName.Nodes,
            ),
            read = ::node,
        )
        val rootExtensions = fieldTokenIndex(obj = JSON_ROOT_TOKEN, name = GltfName.Extensions)
        return KGltf(
            asset = KAsset(
                copyright = string(
                    obj = asset,
                    name = GltfName.Copyright,
                ),
                generator = string(
                    obj = asset,
                    name = GltfName.Generator,
                ),
                version = string(
                    obj = asset,
                    name = GltfName.Version,
                ),
                minVersion = string(
                    obj = asset,
                    name = GltfName.MinVersion,
                ),
                extras = extras(asset),
                extensions = extensions(asset),
            ),
            buffers = array(
                token = fieldTokenIndex(
                    obj = JSON_ROOT_TOKEN,
                    name = GltfName.Buffers,
                ),
                read = ::buffer,
            ),
            bufferViews = array(
                token = fieldTokenIndex(
                    obj = JSON_ROOT_TOKEN,
                    name = GltfName.BufferViews,
                ),
                read = ::bufferView,
            ),
            accessors = array(
                token = fieldTokenIndex(
                    obj = JSON_ROOT_TOKEN,
                    name = GltfName.Accessors,
                ),
                read = ::accessor,
            ),
            meshes = array(
                token = fieldTokenIndex(
                    obj = JSON_ROOT_TOKEN,
                    name = GltfName.Meshes,
                ),
                read = ::mesh,
            ),
            materials = array(
                token = fieldTokenIndex(
                    obj = JSON_ROOT_TOKEN,
                    name = GltfName.Materials,
                ),
                read = ::material,
            ),
            images = array(
                token = fieldTokenIndex(
                    obj = JSON_ROOT_TOKEN,
                    name = GltfName.Images,
                ),
                read = ::image,
            ),
            textures = array(
                token = fieldTokenIndex(
                    obj = JSON_ROOT_TOKEN,
                    name = GltfName.Textures,
                ),
                read = ::texture,
            ),
            samplers = array(
                token = fieldTokenIndex(
                    obj = JSON_ROOT_TOKEN,
                    name = GltfName.Samplers,
                ),
                read = ::sampler,
            ),
            nodes = nodes,
            scenes = array(
                token = fieldTokenIndex(
                    obj = JSON_ROOT_TOKEN,
                    name = GltfName.Scenes,
                ),
                read = ::scene,
            ),
            scene = ref(
                obj = JSON_ROOT_TOKEN,
                name = GltfName.Scene,
            ),
            skins = array(
                token = fieldTokenIndex(
                    obj = JSON_ROOT_TOKEN,
                    name = GltfName.Skins,
                ),
                read = ::skin,
            ),
            animations = array(
                token = fieldTokenIndex(
                    obj = JSON_ROOT_TOKEN,
                    name = GltfName.Animations,
                ),
                read = ::animation,
            ),
            cameras = array(
                token = fieldTokenIndex(
                    obj = JSON_ROOT_TOKEN,
                    name = GltfName.Cameras,
                ),
                read = ::camera,
            ),
            lights = array(
                token = fieldTokenIndex(
                    obj = fieldTokenIndex(
                        obj = rootExtensions,
                        name = GltfName.KHR_lights_punctual,
                    ),
                    name = GltfName.Lights,
                ),
                read = ::light,
            ),
            variants = array(
                fieldTokenIndex(
                    obj = fieldTokenIndex(
                        obj = rootExtensions,
                        name = GltfName.KHR_materials_variants,
                    ),
                    name = GltfName.Variants,
                ),
            ) {
                KVariant(
                    name = string(
                        obj = it,
                        name = GltfName.Name,
                    ),
                    extras = extras(it),
                )
            },
            extensionsUsed = strings(token = fieldTokenIndex(obj = JSON_ROOT_TOKEN, name = GltfName.ExtensionsUsed)),
            extensionsRequired = strings(
                token = fieldTokenIndex(
                    obj = JSON_ROOT_TOKEN,
                    name = GltfName.ExtensionsRequired,
                ),
            ),
            extras = extras(JSON_ROOT_TOKEN),
            extensions = extensions(JSON_ROOT_TOKEN),
        )
    }

    private fun buffer(obj: Int): KBuffer = KBuffer(
        name = string(
            obj = obj,
            name = GltfName.Name,
        ),
        byteLength = integer(
            obj = obj,
            name = GltfName.ByteLength,
        ),
        uri = string(
            obj = obj,
            name = GltfName.Uri,
        ),
        extras = extras(obj),
        extensions = extensions(obj),
    )

    private fun bufferView(obj: Int): KBufferView {
        assert(
            extension(obj = obj, name = GltfName.EXT_meshopt_compression) < 0 ||
                extension(obj = obj, name = GltfName.KHR_meshopt_compression) < 0,
        ) { "Conflicting meshopt extensions" }
        var compression = extension(obj = obj, name = GltfName.EXT_meshopt_compression)
        var khr = false
        if (compression < 0) {
            compression = extension(obj = obj, name = GltfName.KHR_meshopt_compression)
            khr = compression >= 0
        }
        val meshopt = if (compression < 0) {
            null
        } else {
            KMeshopt(
                buffer = ref(
                    obj = compression,
                    name = GltfName.Buffer,
                ),
                offset = integer(
                    obj = compression,
                    name = GltfName.ByteOffset,
                ),
                byteLength = integer(
                    obj = compression,
                    name = GltfName.ByteLength,
                ),
                stride = integer(
                    obj = compression,
                    name = GltfName.ByteStride,
                ),
                count = integer(
                    obj = compression,
                    name = GltfName.Count,
                ),
                mode = string(
                    obj = compression,
                    name = GltfName.Mode,
                ),
                filter = string(
                    obj = compression,
                    name = GltfName.Filter,
                ),
                isKhr = khr,
            )
        }
        return KBufferView(
            name = string(
                obj = obj,
                name = GltfName.Name,
            ),
            buffer = ref(
                obj = obj,
                name = GltfName.Buffer,
            ),
            offset = integer(
                obj = obj,
                name = GltfName.ByteOffset,
            ),
            byteLength = integer(
                obj = obj,
                name = GltfName.ByteLength,
            ),
            stride = integer(
                obj = obj,
                name = GltfName.ByteStride,
            ).also { assert(fieldTokenIndex(obj = obj, name = GltfName.ByteStride) < 0 || it > 0) },
            target = integer(
                obj = obj,
                name = GltfName.Target,
            ).also { assert(fieldTokenIndex(obj = obj, name = GltfName.Target) < 0 || it > 0) },
            meshopt = meshopt,
            extras = extras(obj),
            extensions = extensions(obj),
        )
    }

    private fun accessor(obj: Int): KAccessor {
        val sparseToken = fieldTokenIndex(obj = obj, name = GltfName.Sparse)
        val sparse = if (sparseToken < 0) {
            null
        } else {
            val indices = required(obj = sparseToken, name = GltfName.Indices)
            val values = required(obj = sparseToken, name = GltfName.Values)
            KSparse(
                count = integer(
                    obj = sparseToken,
                    name = GltfName.Count,
                ),
                indicesBufferView = ref(
                    obj = indices,
                    name = GltfName.BufferView,
                ),
                indicesOffset = integer(
                    obj = indices,
                    name = GltfName.ByteOffset,
                ),
                indicesComponentType = ComponentType(integer(obj = indices, name = GltfName.ComponentType)),
                valuesBufferView = ref(
                    obj = values,
                    name = GltfName.BufferView,
                ),
                valuesOffset = integer(
                    obj = values,
                    name = GltfName.ByteOffset,
                ),
            )
        }
        assert(
            fieldTokenIndex(obj = obj, name = GltfName.BufferView) >= 0 ||
                fieldTokenIndex(obj = obj, name = GltfName.ByteOffset) < 0,
        ) { "Accessor byteOffset requires bufferView" }
        val token = fieldTokenIndex(obj = obj, name = GltfName.Type)
        val type = when {
            json.matches(token = token, text = "SCALAR") -> GLTF_TYPE_SCALAR
            json.matches(token = token, text = "VEC2") -> GLTF_TYPE_VEC2
            json.matches(token = token, text = "VEC3") -> GLTF_TYPE_VEC3
            json.matches(token = token, text = "VEC4") -> GLTF_TYPE_VEC4
            json.matches(token = token, text = "MAT2") -> GLTF_TYPE_MAT2
            json.matches(token = token, text = "MAT3") -> GLTF_TYPE_MAT3
            json.matches(token = token, text = "MAT4") -> GLTF_TYPE_MAT4
            else -> GLTF_TYPE_INVALID
        }
        val componentType = integer(obj = obj, name = GltfName.ComponentType)
        return KAccessor(
            name = string(
                obj = obj,
                name = GltfName.Name,
            ),
            componentType = ComponentType(componentType),
            type = AccessorType(type),
            offset = integer(
                obj = obj,
                name = GltfName.ByteOffset,
            ),
            count = integer(
                obj = obj,
                name = GltfName.Count,
            ),
            stride = 0,
            bufferView = ref(
                obj = obj,
                name = GltfName.BufferView,
            ),
            normalized = boolean(
                obj = obj,
                name = GltfName.Normalized,
            ),
            min = bounds(
                obj = obj,
                name = GltfName.Min,
                componentType = componentType,
            ),
            max = bounds(
                obj = obj,
                name = GltfName.Max,
                componentType = componentType,
            ),
            sparse = sparse,
            extras = extras(obj),
            extensions = extensions(obj),
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
        return lastProperties(
            Array(json.size(obj)) {
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
                    } else {
                        for (index in separator + 1 until name.length) {
                            val digit = name[index] - '0'
                            if (digit !in 0..9 || set > (Int.MAX_VALUE - digit) / 10) {
                                semantic = ATTRIBUTE_INVALID
                                break
                            }
                            set = set * 10 + digit
                        }
                    }
                } else if (semantic in ATTRIBUTE_POSITION..ATTRIBUTE_TANGENT && separator >= 0) {
                    semantic = ATTRIBUTE_INVALID
                }
                KAttribute(
                    name = name,
                    accessor = json.int(token = value).also { assert(it >= 0) },
                    semantic = semantic,
                    set = set,
                )
            },
        ) { it.name }
    }

    private fun primitive(obj: Int): KPrimitive {
        val dracoToken = extension(obj = obj, name = GltfName.KHR_draco_mesh_compression)
        val draco = if (dracoToken < 0) {
            null
        } else {
            KDraco(
                bufferView = ref(
                    obj = dracoToken,
                    name = GltfName.BufferView,
                ),
                attributes = attributes(fieldTokenIndex(obj = dracoToken, name = GltfName.Attributes)),
            )
        }
        val mappingsToken = fieldTokenIndex(
            obj = extension(
                obj = obj,
                name = GltfName.KHR_materials_variants,
            ),
            name = GltfName.Mappings,
        )
        val mappings = if (mappingsToken < 0) {
            emptyArray()
        } else {
            val groups = array(mappingsToken) { token ->
                val material = ref(obj = token, name = GltfName.Material)
                val extras = extras(token)
                val variants = ints(obj = token, name = GltfName.Variants)
                assert(material >= 0 && variants.isNotEmpty()) { "Invalid material variant mapping" }
                Array(variants.size) { KMaterialMapping(variant = variants[it], material = material, extras = extras) }
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
            mode = integer(
                obj = obj,
                name = GltfName.Mode,
                default = GLTF_PRIMITIVE_TRIANGLES,
            ),
            indices = ref(
                obj = obj,
                name = GltfName.Indices,
            ),
            material = ref(
                obj = obj,
                name = GltfName.Material,
            ),
            attributes = attributes(fieldTokenIndex(obj = obj, name = GltfName.Attributes)),
            targets = array(
                token = fieldTokenIndex(
                    obj = obj,
                    name = GltfName.Targets,
                ),
                read = ::attributes,
            ),
            draco = draco,
            mappings = mappings,
            extras = extras(obj),
            extensions = extensions(obj),
        )
    }

    private fun mesh(obj: Int): KMesh = KMesh(
        name = string(
            obj = obj,
            name = GltfName.Name,
        ),
        primitives = array(
            token = fieldTokenIndex(
                obj = obj,
                name = GltfName.Primitives,
            ),
            read = ::primitive,
        ),
        weights = floats(
            obj = obj,
            name = GltfName.Weights,
        ),
        targetNames = targetNames(obj),
        extras = extras(obj),
        extensions = extensions(obj),
    )

    private fun targetNames(obj: Int): Array<String> {
        val token = fieldTokenIndex(obj = obj, name = GltfName.Extras)
        return if (json.isObject(token)) {
            strings(
                token = fieldTokenIndex(
                    obj = token,
                    name = GltfName.TargetNames,
                ),
                allowEmpty = true,
            )
        } else {
            emptyStrings
        }
    }

    private fun textureView(
        obj: Int,
        scaleProperty: GltfName? = null,
    ): KTextureView? {
        if (obj < 0) {
            return null
        }
        val transformToken = extension(obj = obj, name = GltfName.KHR_texture_transform)
        val transform = if (transformToken < 0) {
            null
        } else {
            KTextureTransform(
                offset = fixed(
                    obj = transformToken,
                    name = GltfName.Offset,
                    count = VEC2_COMPONENTS,
                ) { floatArrayOf(0f, 0f) },
                rotation = number(
                    obj = transformToken,
                    name = GltfName.Rotation,
                ),
                scale = fixed(
                    obj = transformToken,
                    name = GltfName.Scale,
                    count = VEC2_COMPONENTS,
                ) { floatArrayOf(1f, 1f) },
                texCoord = ref(
                    obj = transformToken,
                    name = GltfName.TexCoord,
                ),
            )
        }
        return KTextureView(
            texture = ref(
                obj = obj,
                name = GltfName.Index,
            ),
            texCoord = integer(
                obj = obj,
                name = GltfName.TexCoord,
            ),
            scale = if (scaleProperty == null) {
                1f
            } else {
                number(obj = obj, name = scaleProperty, default = 1f)
            },
            transform = transform,
        )
    }

    private fun metallicRoughness(obj: Int): KMetallicRoughness? = if (obj < 0) {
        null
    } else {
        KMetallicRoughness(
            baseColorTexture = textureView(obj = fieldTokenIndex(obj = obj, name = GltfName.BaseColorTexture)),
            metallicRoughnessTexture = textureView(
                obj = fieldTokenIndex(
                    obj = obj,
                    name = GltfName.MetallicRoughnessTexture,
                ),
            ),
            baseColorFactor = fixed(
                obj = obj,
                name = GltfName.BaseColorFactor,
                count = VEC4_COMPONENTS,
            ) { floatArrayOf(1f, 1f, 1f, 1f) },
            metallicFactor = number(
                obj = obj,
                name = GltfName.MetallicFactor,
                default = 1f,
            ),
            roughnessFactor = number(
                obj = obj,
                name = GltfName.RoughnessFactor,
                default = 1f,
            ),
        )
    }

    private fun specularGlossiness(obj: Int): KSpecularGlossiness? = if (obj < 0) {
        null
    } else {
        KSpecularGlossiness(
            diffuseTexture = textureView(obj = fieldTokenIndex(obj = obj, name = GltfName.DiffuseTexture)),
            specularGlossinessTexture = textureView(
                obj = fieldTokenIndex(
                    obj = obj,
                    name = GltfName.SpecularGlossinessTexture,
                ),
            ),
            diffuseFactor = fixed(
                obj = obj,
                name = GltfName.DiffuseFactor,
                count = VEC4_COMPONENTS,
            ) { floatArrayOf(1f, 1f, 1f, 1f) },
            specularFactor = fixed(
                obj = obj,
                name = GltfName.SpecularFactor,
                count = VEC3_COMPONENTS,
            ) { floatArrayOf(1f, 1f, 1f) },
            glossinessFactor = number(
                obj = obj,
                name = GltfName.GlossinessFactor,
                default = 1f,
            ),
        )
    }

    private fun clearcoat(obj: Int): KClearcoat? = if (obj < 0) {
        null
    } else {
        KClearcoat(
            texture = textureView(obj = fieldTokenIndex(obj = obj, name = GltfName.ClearcoatTexture)),
            roughnessTexture = textureView(obj = fieldTokenIndex(obj = obj, name = GltfName.ClearcoatRoughnessTexture)),
            normalTexture = textureView(
                obj = fieldTokenIndex(
                    obj = obj,
                    name = GltfName.ClearcoatNormalTexture,
                ),
                scaleProperty = GltfName.Scale,
            ),
            factor = number(
                obj = obj,
                name = GltfName.ClearcoatFactor,
            ),
            roughnessFactor = number(
                obj = obj,
                name = GltfName.ClearcoatRoughnessFactor,
            ),
        )
    }

    private fun transmission(obj: Int): KTransmission? = if (obj < 0) {
        null
    } else {
        KTransmission(
            texture = textureView(obj = fieldTokenIndex(obj = obj, name = GltfName.TransmissionTexture)),
            factor = number(
                obj = obj,
                name = GltfName.TransmissionFactor,
            ),
        )
    }

    private fun specular(obj: Int): KSpecular? = if (obj < 0) {
        null
    } else {
        KSpecular(
            texture = textureView(obj = fieldTokenIndex(obj = obj, name = GltfName.SpecularTexture)),
            colorTexture = textureView(obj = fieldTokenIndex(obj = obj, name = GltfName.SpecularColorTexture)),
            factor = number(
                obj = obj,
                name = GltfName.SpecularFactor,
                default = 1f,
            ),
            colorFactor = fixed(
                obj = obj,
                name = GltfName.SpecularColorFactor,
                count = VEC3_COMPONENTS,
            ) { floatArrayOf(1f, 1f, 1f) },
        )
    }

    private fun volume(obj: Int): KVolume? = if (obj < 0) {
        null
    } else {
        KVolume(
            thicknessTexture = textureView(obj = fieldTokenIndex(obj = obj, name = GltfName.ThicknessTexture)),
            thicknessFactor = number(
                obj = obj,
                name = GltfName.ThicknessFactor,
            ),
            attenuationColor = fixed(
                obj = obj,
                name = GltfName.AttenuationColor,
                count = VEC3_COMPONENTS,
            ) { floatArrayOf(1f, 1f, 1f) },
            attenuationDistance = number(
                obj = obj,
                name = GltfName.AttenuationDistance,
                default = Float.MAX_VALUE,
            ),
        )
    }

    private fun sheen(obj: Int): KSheen? = if (obj < 0) {
        null
    } else {
        KSheen(
            colorTexture = textureView(obj = fieldTokenIndex(obj = obj, name = GltfName.SheenColorTexture)),
            colorFactor = fixed(
                obj = obj,
                name = GltfName.SheenColorFactor,
                count = VEC3_COMPONENTS,
            ) { floatArrayOf(0f, 0f, 0f) },
            roughnessTexture = textureView(obj = fieldTokenIndex(obj = obj, name = GltfName.SheenRoughnessTexture)),
            roughnessFactor = number(
                obj = obj,
                name = GltfName.SheenRoughnessFactor,
            ),
        )
    }

    private fun iridescence(obj: Int): KIridescence? = if (obj < 0) {
        null
    } else {
        KIridescence(
            factor = number(
                obj = obj,
                name = GltfName.IridescenceFactor,
            ),
            texture = textureView(obj = fieldTokenIndex(obj = obj, name = GltfName.IridescenceTexture)),
            ior = number(
                obj = obj,
                name = GltfName.IridescenceIor,
                default = DEFAULT_IRIDESCENCE_IOR,
            ),
            thicknessMin = number(
                obj = obj,
                name = GltfName.IridescenceThicknessMinimum,
                default = DEFAULT_IRIDESCENCE_THICKNESS_MIN,
            ),
            thicknessMax = number(
                obj = obj,
                name = GltfName.IridescenceThicknessMaximum,
                default = DEFAULT_IRIDESCENCE_THICKNESS_MAX,
            ),
            thicknessTexture = textureView(
                obj = fieldTokenIndex(
                    obj = obj,
                    name = GltfName.IridescenceThicknessTexture,
                ),
            ),
        )
    }

    private fun diffuseTransmission(obj: Int): KDiffuseTransmission? = if (obj < 0) {
        null
    } else {
        KDiffuseTransmission(
            texture = textureView(obj = fieldTokenIndex(obj = obj, name = GltfName.DiffuseTransmissionTexture)),
            factor = number(
                obj = obj,
                name = GltfName.DiffuseTransmissionFactor,
            ),
            colorFactor = fixed(
                obj = obj,
                name = GltfName.DiffuseTransmissionColorFactor,
                count = VEC3_COMPONENTS,
            ) { floatArrayOf(1f, 1f, 1f) },
            colorTexture = textureView(
                obj = fieldTokenIndex(
                    obj = obj,
                    name = GltfName.DiffuseTransmissionColorTexture,
                ),
            ),
        )
    }

    private fun anisotropy(obj: Int): KAnisotropy? = if (obj < 0) {
        null
    } else {
        KAnisotropy(
            strength = number(
                obj = obj,
                name = GltfName.AnisotropyStrength,
            ),
            rotation = number(
                obj = obj,
                name = GltfName.AnisotropyRotation,
            ),
            texture = textureView(obj = fieldTokenIndex(obj = obj, name = GltfName.AnisotropyTexture)),
        )
    }

    private fun material(obj: Int): KMaterial {
        val alpha = fieldTokenIndex(obj = obj, name = GltfName.AlphaMode)
        assert(
            alpha < 0 ||
                json.matches(token = alpha, text = "OPAQUE") ||
                json.matches(token = alpha, text = "MASK") ||
                json.matches(token = alpha, text = "BLEND"),
        ) { "Invalid alphaMode" }
        return KMaterial(
            name = string(
                obj = obj,
                name = GltfName.Name,
            ),
            metallicRoughness = metallicRoughness(fieldTokenIndex(obj = obj, name = GltfName.PbrMetallicRoughness)),
            specularGlossiness = specularGlossiness(
                extension(
                    obj = obj,
                    name = GltfName.KHR_materials_pbrSpecularGlossiness,
                ),
            ),
            normalTexture = textureView(
                obj = fieldTokenIndex(
                    obj = obj,
                    name = GltfName.NormalTexture,
                ),
                scaleProperty = GltfName.Scale,
            ),
            occlusionTexture = textureView(
                obj = fieldTokenIndex(
                    obj = obj,
                    name = GltfName.OcclusionTexture,
                ),
                scaleProperty = GltfName.Strength,
            ),
            emissiveTexture = textureView(obj = fieldTokenIndex(obj = obj, name = GltfName.EmissiveTexture)),
            emissiveFactor = fixed(
                obj = obj,
                name = GltfName.EmissiveFactor,
                count = VEC3_COMPONENTS,
            ) { floatArrayOf(0f, 0f, 0f) },
            alphaMode = when {
                json.matches(token = alpha, text = "MASK") -> ALPHA_MASK
                json.matches(token = alpha, text = "BLEND") -> ALPHA_BLEND
                else -> ALPHA_OPAQUE
            },
            alphaCutoff = number(
                obj = obj,
                name = GltfName.AlphaCutoff,
                default = DEFAULT_ALPHA_CUTOFF,
            ),
            doubleSided = boolean(
                obj = obj,
                name = GltfName.DoubleSided,
            ),
            unlit = extension(
                obj = obj,
                name = GltfName.KHR_materials_unlit,
            ) >= 0,
            clearcoat = clearcoat(extension(obj = obj, name = GltfName.KHR_materials_clearcoat)),
            transmission = transmission(extension(obj = obj, name = GltfName.KHR_materials_transmission)),
            ior = extensionFloat(
                obj = obj,
                extension = GltfName.KHR_materials_ior,
                name = GltfName.Ior,
                default = DEFAULT_IOR,
            ),
            specular = specular(extension(obj = obj, name = GltfName.KHR_materials_specular)),
            volume = volume(extension(obj = obj, name = GltfName.KHR_materials_volume)),
            sheen = sheen(extension(obj = obj, name = GltfName.KHR_materials_sheen)),
            emissiveStrength = extensionFloat(
                obj = obj,
                extension = GltfName.KHR_materials_emissive_strength,
                name = GltfName.EmissiveStrength,
                default = 1f,
            ),
            iridescence = iridescence(extension(obj = obj, name = GltfName.KHR_materials_iridescence)),
            diffuseTransmission = diffuseTransmission(
                extension(
                    obj = obj,
                    name = GltfName.KHR_materials_diffuse_transmission,
                ),
            ),
            anisotropy = anisotropy(extension(obj = obj, name = GltfName.KHR_materials_anisotropy)),
            dispersion = extensionFloat(
                obj = obj,
                extension = GltfName.KHR_materials_dispersion,
                name = GltfName.Dispersion,
                default = 0f,
            ),
            extras = extras(obj),
            extensions = extensions(obj),
        )
    }

    private fun image(obj: Int): KImage = KImage(
        name = string(
            obj = obj,
            name = GltfName.Name,
        ),
        uri = string(
            obj = obj,
            name = GltfName.Uri,
        ),
        bufferView = ref(
            obj = obj,
            name = GltfName.BufferView,
        ),
        mimeType = string(
            obj = obj,
            name = GltfName.MimeType,
        ),
        extras = extras(obj),
        extensions = extensions(obj),
    )

    private fun sampler(obj: Int): KSampler = KSampler(
        name = string(
            obj = obj,
            name = GltfName.Name,
        ),
        magFilter = integer(
            obj = obj,
            name = GltfName.MagFilter,
        ).also { assert(fieldTokenIndex(obj = obj, name = GltfName.MagFilter) < 0 || it > 0) },
        minFilter = integer(
            obj = obj,
            name = GltfName.MinFilter,
        ).also { assert(fieldTokenIndex(obj = obj, name = GltfName.MinFilter) < 0 || it > 0) },
        wrapS = integer(
            obj = obj,
            name = GltfName.WrapS,
            default = TEXTURE_WRAP_REPEAT,
        ),
        wrapT = integer(
            obj = obj,
            name = GltfName.WrapT,
            default = TEXTURE_WRAP_REPEAT,
        ),
        extras = extras(obj),
        extensions = extensions(obj),
    )

    private fun texture(obj: Int): KTexture = KTexture(
        name = string(
            obj = obj,
            name = GltfName.Name,
        ),
        image = ref(
            obj = obj,
            name = GltfName.Source,
        ),
        sampler = ref(
            obj = obj,
            name = GltfName.Sampler,
        ),
        basisuImage = extensionRef(
            obj = obj,
            name = GltfName.KHR_texture_basisu,
            field = GltfName.Source,
        ),
        webpImage = extensionRef(
            obj = obj,
            name = GltfName.EXT_texture_webp,
            field = GltfName.Source,
        ),
        extras = extras(obj),
        extensions = extensions(obj),
    )

    private fun node(obj: Int): KNode {
        val translation = fieldTokenIndex(obj = obj, name = GltfName.Translation)
        val rotation = fieldTokenIndex(obj = obj, name = GltfName.Rotation)
        val scale = fieldTokenIndex(obj = obj, name = GltfName.Scale)
        val matrix = fieldTokenIndex(obj = obj, name = GltfName.Matrix)
        return KNode(
            name = string(
                obj = obj,
                name = GltfName.Name,
            ),
            parent = GLTF_MISSING_INDEX,
            children = ints(
                obj = obj,
                name = GltfName.Children,
            ),
            mesh = ref(
                obj = obj,
                name = GltfName.Mesh,
            ),
            skin = ref(
                obj = obj,
                name = GltfName.Skin,
            ),
            camera = ref(
                obj = obj,
                name = GltfName.Camera,
            ),
            light = extensionRef(
                obj = obj,
                name = GltfName.KHR_lights_punctual,
                field = GltfName.Light,
            ),
            weights = floats(
                obj = obj,
                name = GltfName.Weights,
            ),
            translation = if (translation < 0) {
                null
            } else {
                fixedToken(
                    token = translation,
                    name = GltfName.Translation,
                    count = VEC3_COMPONENTS,
                ) { defaultTranslation }
            },
            rotation = if (rotation < 0) {
                null
            } else {
                fixedToken(token = rotation, name = GltfName.Rotation, count = VEC4_COMPONENTS) { defaultRotation }
            },
            scale = if (scale < 0) {
                null
            } else {
                fixedToken(token = scale, name = GltfName.Scale, count = VEC3_COMPONENTS) { defaultScale }
            },
            matrix = if (matrix < 0) {
                null
            } else {
                fixedToken(token = matrix, name = GltfName.Matrix, count = MAT4_COMPONENTS) { defaultMatrix }
            },
            hasMatrix = matrix >= 0,
            hasTranslation = translation >= 0,
            hasRotation = rotation >= 0,
            hasScale = scale >= 0,
            instancing = attributes(
                fieldTokenIndex(
                    obj = extension(
                        obj = obj,
                        name = GltfName.EXT_mesh_gpu_instancing,
                    ),
                    name = GltfName.Attributes,
                ),
            ),
            extras = extras(obj),
            extensions = extensions(obj),
        )
    }

    private fun scene(obj: Int): KScene = KScene(
        name = string(
            obj = obj,
            name = GltfName.Name,
        ),
        nodes = ints(
            obj = obj,
            name = GltfName.Nodes,
        ),
        extras = extras(obj),
        extensions = extensions(obj),
    )

    private fun skin(obj: Int): KSkin = KSkin(
        name = string(
            obj = obj,
            name = GltfName.Name,
        ),
        joints = ints(
            obj = obj,
            name = GltfName.Joints,
        ),
        skeleton = ref(
            obj = obj,
            name = GltfName.Skeleton,
        ),
        inverseBindMatrices = ref(
            obj = obj,
            name = GltfName.InverseBindMatrices,
        ),
        extras = extras(obj),
        extensions = extensions(obj),
    )

    private fun animationSampler(obj: Int): KAnimationSampler {
        val interpolation = fieldTokenIndex(obj = obj, name = GltfName.Interpolation)
        assert(
            interpolation < 0 ||
                json.matches(token = interpolation, text = "LINEAR") ||
                json.matches(token = interpolation, text = "STEP") ||
                json.matches(token = interpolation, text = "CUBICSPLINE"),
        ) { "Invalid animation interpolation" }
        return KAnimationSampler(
            input = ref(
                obj = obj,
                name = GltfName.Input,
            ),
            output = ref(
                obj = obj,
                name = GltfName.Output,
            ),
            interpolation = when {
                json.matches(token = interpolation, text = "STEP") -> GLTF_INTERPOLATION_STEP
                json.matches(token = interpolation, text = "CUBICSPLINE") -> GLTF_INTERPOLATION_CUBIC_SPLINE
                else -> GLTF_INTERPOLATION_LINEAR
            },
            extras = extras(obj),
            extensions = extensions(obj),
        )
    }

    private fun animationChannel(obj: Int): KAnimationChannel {
        val target = required(obj = obj, name = GltfName.Target)
        val path = fieldTokenIndex(obj = target, name = GltfName.Path)
        return KAnimationChannel(
            sampler = ref(
                obj = obj,
                name = GltfName.Sampler,
            ),
            targetNode = ref(
                obj = target,
                name = GltfName.Node,
            ),
            targetPath = when {
                json.matches(token = path, name = GltfName.Translation) -> GLTF_PATH_TRANSLATION
                json.matches(token = path, name = GltfName.Rotation) -> GLTF_PATH_ROTATION
                json.matches(token = path, name = GltfName.Scale) -> GLTF_PATH_SCALE
                json.matches(token = path, name = GltfName.Weights) -> GLTF_PATH_WEIGHTS
                else -> GLTF_PATH_INVALID
            },
            extras = extras(obj),
            extensions = extensions(obj),
        )
    }

    private fun animation(obj: Int): KAnimation = KAnimation(
        name = string(
            obj = obj,
            name = GltfName.Name,
        ),
        samplers = array(
            token = fieldTokenIndex(
                obj = obj,
                name = GltfName.Samplers,
            ),
            read = ::animationSampler,
        ),
        channels = array(
            token = fieldTokenIndex(
                obj = obj,
                name = GltfName.Channels,
            ),
            read = ::animationChannel,
        ),
        extras = extras(obj),
        extensions = extensions(obj),
    )

    private fun camera(obj: Int): KCamera {
        val type = fieldTokenIndex(obj = obj, name = GltfName.Type)
        val perspectiveToken = fieldTokenIndex(obj = obj, name = GltfName.Perspective)
        val orthographicToken = fieldTokenIndex(obj = obj, name = GltfName.Orthographic)
        val perspective = if (perspectiveToken < 0) {
            null
        } else {
            KPerspective(
                aspectRatio = optionalFloat(
                    obj = perspectiveToken,
                    name = GltfName.AspectRatio,
                ),
                yfov = requiredNumber(
                    obj = perspectiveToken,
                    name = GltfName.Yfov,
                ),
                zfar = optionalFloat(
                    obj = perspectiveToken,
                    name = GltfName.Zfar,
                ),
                znear = requiredNumber(
                    obj = perspectiveToken,
                    name = GltfName.Znear,
                ),
                extras = extras(perspectiveToken),
            )
        }
        val orthographic = if (orthographicToken < 0) {
            null
        } else {
            KOrthographic(
                xmag = requiredNumber(
                    obj = orthographicToken,
                    name = GltfName.Xmag,
                ),
                ymag = requiredNumber(
                    obj = orthographicToken,
                    name = GltfName.Ymag,
                ),
                zfar = requiredNumber(
                    obj = orthographicToken,
                    name = GltfName.Zfar,
                ),
                znear = requiredNumber(
                    obj = orthographicToken,
                    name = GltfName.Znear,
                ),
                extras = extras(orthographicToken),
            )
        }
        return KCamera(
            name = string(
                obj = obj,
                name = GltfName.Name,
            ),
            type = when {
                json.matches(token = type, text = "perspective") -> CAMERA_PERSPECTIVE
                json.matches(token = type, text = "orthographic") -> CAMERA_ORTHOGRAPHIC
                else -> CAMERA_INVALID
            },
            perspective = perspective,
            orthographic = orthographic,
            extras = extras(obj),
            extensions = extensions(obj),
        )
    }

    private fun light(obj: Int): KLight {
        val spot = fieldTokenIndex(obj = obj, name = GltfName.Spot)
        val type = fieldTokenIndex(obj = obj, name = GltfName.Type)
        return KLight(
            name = string(
                obj = obj,
                name = GltfName.Name,
            ),
            color = fixed(
                obj = obj,
                name = GltfName.Color,
                count = VEC3_COMPONENTS,
            ) { floatArrayOf(1f, 1f, 1f) },
            intensity = number(
                obj = obj,
                name = GltfName.Intensity,
                default = 1f,
            ),
            type = when {
                json.matches(token = type, text = "directional") -> LIGHT_DIRECTIONAL
                json.matches(token = type, text = "point") -> LIGHT_POINT
                json.matches(token = type, text = "spot") -> LIGHT_SPOT
                else -> LIGHT_INVALID
            },
            range = number(
                obj = obj,
                name = GltfName.Range,
            ).also { assert(fieldTokenIndex(obj = obj, name = GltfName.Range) < 0 || it > 0) },
            innerConeAngle = number(
                obj = spot,
                name = GltfName.InnerConeAngle,
            ),
            outerConeAngle = number(
                obj = spot,
                name = GltfName.OuterConeAngle,
                default = DEFAULT_SPOT_OUTER_CONE_ANGLE,
            ),
            extras = extras(obj),
        )
    }
}
