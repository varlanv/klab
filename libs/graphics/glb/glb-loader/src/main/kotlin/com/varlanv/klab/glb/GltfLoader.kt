package com.varlanv.klab.glb

import com.varlanv.klab.collections.Array
import com.varlanv.klab.collections.Bytes
import com.varlanv.klab.collections.MutInts
import com.varlanv.klab.collections.MutLongs
import com.varlanv.klab.gpu.assets.PreparedModel
import com.varlanv.klab.vector.intViewHandle
import com.varlanv.klab.vector.shortViewHandle
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.charset.CodingErrorAction
import java.nio.file.Files
import java.nio.file.Path
import java.util.*
import jdk.incubator.vector.ByteVector
import jdk.incubator.vector.IntVector
import jdk.incubator.vector.ShortVector
import jdk.incubator.vector.VectorOperators
import kotlin.math.abs

private const val GLB_VERSION = 2
private const val GLB_MAGIC = 0x46546c67
private const val GLB_JSON_CHUNK = 0x4e4f534a
private const val GLB_BIN_CHUNK = 0x004e4942
private const val GLB_MAGIC_OFFSET = 0
private const val GLB_VERSION_OFFSET = 4
private const val GLB_LENGTH_OFFSET = 8
private const val GLB_JSON_LENGTH_OFFSET = 12
private const val GLB_JSON_TYPE_OFFSET = 16
private const val GLB_JSON_PAYLOAD_OFFSET = 20
private const val GLB_CHUNK_HEADER_BYTES = 8
private const val GLB_CHUNK_TYPE_OFFSET = 4
private const val GLB_CHUNK_ALIGNMENT = 4
private const val MESHOPT_ATTRIBUTE_ALIGNMENT = 4
private const val MESHOPT_MAX_ATTRIBUTE_STRIDE = 256
private const val MESHOPT_LARGE_FILTER_STRIDE = 8
private const val TRIANGLE_VERTICES = 3
private const val CUBIC_SPLINE_VALUES_PER_KEYFRAME = 3
private const val MAT2_ROWS = 2
private const val MAT3_ROWS = 3
private const val UNSIGNED_BYTE_MASK = 0xff
private const val UNSIGNED_SHORT_MASK = 0xffff
private const val UNSIGNED_INT_MASK = 0xffffffffL
private const val UNSIGNED_BYTE_SIGN_BIT = 0x80
private const val UNSIGNED_SHORT_SIGN_BIT = 0x8000
private const val URI_ESCAPE_PREFIX = 37
private const val URI_ESCAPE_LENGTH = 3
private const val HEX_RADIX = 16
private const val HEX_DIGIT_BITS = 4

class GltfLoader {
    private val json = GltfJson()
    private var nodeMarks = MutInts(0)
    private var viewUses = MutInts(0)
    private var indexBounds = MutLongs(0)
    private val validationScratch = GltfValidationScratch()

    fun load(source: Bytes): PreparedModel = load(source = source, resolver = null)

    fun load(path: Path): PreparedModel {
        val absolute = path.toAbsolutePath()
        return load(Files.readAllBytes(absolute)) { uri ->
            Files.readAllBytes(absolute.parent.resolve(uri))
        }
    }

    fun load(source: Bytes, resolver: ((String) -> Bytes)?): PreparedModel {
        var binOffset = 0
        var binSize = 0
        val model = try {
            if (source.size >= Int.SIZE_BYTES && intViewHandle.get(source, GLB_MAGIC_OFFSET) as Int == GLB_MAGIC) {
                assert(source.size >= GLB_JSON_PAYLOAD_OFFSET) { "GLB header is truncated" }
                assert(
                    intViewHandle.get(source, GLB_VERSION_OFFSET) as Int == GLB_VERSION,
                ) { "Only GLB version 2 is supported" }
                assert(
                    intViewHandle.get(source, GLB_LENGTH_OFFSET) as Int == source.size,
                ) { "GLB length does not match input size" }
                val jsonSize = intViewHandle.get(source, GLB_JSON_LENGTH_OFFSET) as Int
                assert(
                    jsonSize >= 0 &&
                        jsonSize <= source.size - GLB_JSON_PAYLOAD_OFFSET &&
                        jsonSize % GLB_CHUNK_ALIGNMENT == 0,
                ) { "Invalid GLB JSON size" }
                assert(
                    intViewHandle.get(source, GLB_JSON_TYPE_OFFSET) as Int == GLB_JSON_CHUNK,
                ) { "Expected GLB JSON chunk" }
                var next = GLB_JSON_PAYLOAD_OFFSET + jsonSize
                var chunk = 1
                while (next < source.size) {
                    assert(next <= source.size - GLB_CHUNK_HEADER_BYTES) { "Truncated GLB chunk header" }
                    val size = intViewHandle.get(source, next) as Int
                    val type = intViewHandle.get(source, next + GLB_CHUNK_TYPE_OFFSET) as Int
                    assert(
                        size >= 0 &&
                            size % GLB_CHUNK_ALIGNMENT == 0 &&
                            size <= source.size - next - GLB_CHUNK_HEADER_BYTES,
                    ) { "Invalid GLB chunk size" }
                    assert(type != GLB_JSON_CHUNK) { "Duplicate GLB JSON chunk" }
                    if (type == GLB_BIN_CHUNK) {
                        assert(chunk == 1 && binOffset == 0) { "GLB BIN must be the second chunk" }
                        binSize = size
                        binOffset = next + GLB_CHUNK_HEADER_BYTES
                    }
                    next += GLB_CHUNK_HEADER_BYTES + size
                    chunk++
                }
                json.parse(source = source, offset = GLB_JSON_PAYLOAD_OFFSET, length = jsonSize)
            } else {
                json.parse(source = source, offset = 0, length = source.size)
            }
            mapGltf(json)
        } finally {
            json.release()
        }
        model.source = source
        model.binOffset = binOffset
        model.binSize = binSize
        validateVersion(model.asset)
        validateRequiredExtensions(model)
        val bufferOffsets = MutInts(model.buffers.size)
        model.bufferSources = Array(model.buffers.size) { index ->
            val buffer = model.buffers[index]
            assert(buffer.byteLength > 0) { "Invalid buffer length" }
            val uri = buffer.uri
            val data = when {
                uri == null && index == 0 && binOffset > 0 -> {
                    assert(
                        buffer.byteLength <= binSize && binSize - buffer.byteLength <= 3,
                    ) { "Invalid GLB buffer length" }
                    for (padding in buffer.byteLength until binSize) assert(
                        source[binOffset + padding] == 0.toByte(),
                    ) { "Invalid GLB BIN padding" }
                    bufferOffsets[index] = binOffset
                    source
                }

                uri != null && uri.startsWith("data:") -> {
                    decodeDataUri(uri)
                }

                uri != null && resolver != null -> {
                    resolver(decodeGltfUri(uri))
                }
                else -> {
                    error("External GLB buffers require a resource resolver")
                }
            }
            assert(buffer.byteLength <= data.size - bufferOffsets[index]) { "Truncated buffer" }
            data
        }
        model.bufferOffsets = bufferOffsets
        validate(model)
        return prepareModel(source = model, resolver = resolver)
    }

    private fun validate(model: KGltf) {
        if (indexBounds.size < model.accessors.size) {
            indexBounds = MutLongs(model.accessors.size)
        }
        indexBounds.fill(-1L, 0, model.accessors.size)
        for (view in model.bufferViews) {
            reference(index = view.buffer, size = model.buffers.size, optional = false)
            range(
                offset = view.offset,
                length = view.byteLength.toLong(),
                available = model.buffers[view.buffer].byteLength,
            )
            assert(
                view.byteLength > 0 && (view.stride == 0 || view.stride in 4..252 && view.stride % 4 == 0),
            ) { "Invalid buffer view layout" }
            assert(view.target == 0 || view.target == 34962 || view.target == 34963) { "Invalid buffer view target" }
            val compression = view.meshopt
            if (compression != null) {
                assert(compression.count > 0 && compression.byteLength > 0)
                assert(
                    compression.filter == null ||
                        compression.filter in arrayOf("NONE", "OCTAHEDRAL", "QUATERNION", "EXPONENTIAL") ||
                        compression.isKhr &&
                        compression.filter == "COLOR",
                )
                reference(index = compression.buffer, size = model.buffers.size, optional = false)
                range(
                    offset = compression.offset,
                    length = compression.byteLength.toLong(),
                    available = model.buffers[compression.buffer].byteLength,
                )
                assert(view.stride == 0 || view.stride == compression.stride)
                assert(view.byteLength.toLong() == compression.stride.toLong() * compression.count)
                assert(compression.mode in arrayOf("ATTRIBUTES", "TRIANGLES", "INDICES"))
                when (compression.mode) {
                    "ATTRIBUTES" -> {
                        assert(
                            compression.stride > 0 &&
                                compression.stride % MESHOPT_ATTRIBUTE_ALIGNMENT == 0 &&
                                compression.stride <= MESHOPT_MAX_ATTRIBUTE_STRIDE,
                        )
                    }

                    "TRIANGLES", "INDICES" -> {
                        assert(compression.stride == Short.SIZE_BYTES || compression.stride == Int.SIZE_BYTES)
                        assert(compression.filter == null || compression.filter == "NONE")
                        if (compression.mode == "TRIANGLES") {
                            assert(compression.count % TRIANGLE_VERTICES == 0)
                        }
                    }
                }
                when (compression.filter) {
                    "OCTAHEDRAL", "COLOR" -> assert(
                        compression.stride == Int.SIZE_BYTES || compression.stride == MESHOPT_LARGE_FILTER_STRIDE,
                    )

                    "QUATERNION" -> assert(compression.stride == MESHOPT_LARGE_FILTER_STRIDE)
                }
            }
        }
        for (accessor in model.accessors) {
            reference(index = accessor.bufferView, size = model.bufferViews.size)
            val component = accessor.componentType.componentSize()
            val size = accessor.type.elementSize(accessor.componentType)
            assert(
                accessor.count > 0 && accessor.offset >= 0 && accessor.offset % component == 0,
            ) { "Invalid GLB accessor layout" }
            assert(accessor.bufferView >= 0 || accessor.offset == 0) { "Accessor offset requires a buffer view" }
            assert(
                !accessor.normalized ||
                    accessor.componentType.value != GLTF_COMPONENT_FLOAT &&
                    accessor.componentType.value != GLTF_COMPONENT_UNSIGNED_INT,
            ) { "Invalid normalized accessor type" }
            val components = accessor.type.componentCount()
            assert(accessor.min.isEmpty() || accessor.min.size == components)
            assert(accessor.max.isEmpty() || accessor.max.size == components)
            validateAccessorBounds(accessor)
            accessor.stride = if (accessor.bufferView >= 0 && model.bufferViews[accessor.bufferView].stride != 0) {
                model.bufferViews[accessor.bufferView].stride
            } else {
                size
            }
            assert(accessor.stride >= size && accessor.stride % component == 0) { "Invalid GLB accessor stride" }
            if (accessor.bufferView >= 0) {
                viewRange(
                    model = model,
                    index = accessor.bufferView,
                    offset = accessor.offset,
                    length = (accessor.count - 1L) * accessor.stride +
                        elementExtent(type = accessor.type, componentType = accessor.componentType),
                    alignment = if (accessor.type.value >= GLTF_TYPE_MAT2) {
                        4
                    } else {
                        component
                    },
                )
            }
            val sparse = accessor.sparse
            if (sparse != null) {
                assert(sparse.count > 0 && sparse.count <= accessor.count) { "Invalid sparse count" }
                assert(
                    sparse.indicesComponentType.value == GLTF_COMPONENT_UNSIGNED_BYTE ||
                        sparse.indicesComponentType.value == GLTF_COMPONENT_UNSIGNED_SHORT ||
                        sparse.indicesComponentType.value == GLTF_COMPONENT_UNSIGNED_INT,
                )
                val indexSize = sparse.indicesComponentType.componentSize()
                viewRange(
                    model = model,
                    index = sparse.indicesBufferView,
                    offset = sparse.indicesOffset,
                    length = sparse.count.toLong() * indexSize,
                    alignment = indexSize,
                )
                viewRange(
                    model = model,
                    index = sparse.valuesBufferView,
                    offset = sparse.valuesOffset,
                    length = (sparse.count - 1L) * size +
                        elementExtent(type = accessor.type, componentType = accessor.componentType),
                    alignment = if (accessor.type.value >= GLTF_TYPE_MAT2) {
                        4
                    } else {
                        component
                    },
                )
                assert(sparse.indicesOffset % indexSize == 0 && sparse.valuesOffset % component == 0)
                validateUnstridedView(model.bufferViews[sparse.indicesBufferView])
                validateUnstridedView(model.bufferViews[sparse.valuesBufferView])
                val view = model.bufferViews[sparse.indicesBufferView]
                val bytes = model.bufferSources[view.buffer]
                val start = model.bufferOffsets[view.buffer] + view.offset + sparse.indicesOffset
                var previous = -1L
                repeat(sparse.count) {
                    val value = sparse.indicesComponentType.readUnsigned(bytes = bytes, offset = start + it * indexSize)
                    assert(
                        value > previous && value < accessor.count.toLong(),
                    ) { "Sparse indices must increase and fit the accessor" }
                    previous = value
                }
            }
        }
        for (mesh in model.meshes) {
            assert(mesh.primitives.isNotEmpty()) { "Mesh requires primitives" }
            val targets = mesh.primitives[0].targets.size
            assert(mesh.weights.isEmpty() || mesh.weights.size == targets)
            assert(mesh.targetNames.isEmpty() || mesh.targetNames.size == targets)
            for (primitive in mesh.primitives) {
                assert(
                    primitive.mode in GLTF_PRIMITIVE_POINTS..GLTF_PRIMITIVE_TRIANGLE_FAN &&
                        primitive.targets.size == targets &&
                        primitive.attributes.isNotEmpty(),
                ) { "Invalid GLB primitive" }
                reference(index = primitive.material, size = model.materials.size)
                val count = validAttributeCount(model = model, attributes = primitive.attributes)
                validateAttributes(model = model, attributes = primitive.attributes, morph = false)
                for (target in primitive.targets) {
                    assert(target.isNotEmpty())
                    for (attribute in target) {
                        reference(index = attribute.accessor, size = model.accessors.size, optional = false)
                        assert(model.accessors[attribute.accessor].count == count)
                        assert(primitive.attributes.any { it.name == attribute.name }) {
                            "Morph attribute requires a matching base attribute"
                        }
                    }
                    validateAttributes(model = model, attributes = target, morph = true)
                }
                reference(index = primitive.indices, size = model.accessors.size)
                if (primitive.indices >= 0) {
                    val indices = model.accessors[primitive.indices]
                    assert(
                        indices.type.value == GLTF_TYPE_SCALAR &&
                            !indices.normalized &&
                            (indices.componentType.value == GLTF_COMPONENT_UNSIGNED_BYTE ||
                                indices.componentType.value == GLTF_COMPONENT_UNSIGNED_SHORT ||
                                indices.componentType.value == GLTF_COMPONENT_UNSIGNED_INT),
                    ) {
                        "Invalid index accessor"
                    }
                    assert(indices.stride == indices.componentType.componentSize()) {
                        "Invalid index stride"
                    }
                    if (indices.bufferView >= 0) {
                        val view = model.bufferViews[indices.bufferView]
                        assert(view.stride == 0 && view.target != 34962) {
                            "Invalid index buffer view"
                        }
                    }
                    var bound = indexBounds[primitive.indices]
                    if (bound < 0) {
                        bound = effectiveIndexBound(model = model, accessor = indices)
                        indexBounds[primitive.indices] = bound
                    }
                    val sentinel = when (indices.componentType.value) {
                        GLTF_COMPONENT_UNSIGNED_BYTE -> 255L
                        GLTF_COMPONENT_UNSIGNED_SHORT -> 65535L
                        else -> 0xffffffffL
                    }
                    assert(
                        bound < count.toLong() && bound < sentinel,
                    ) { "Invalid primitive index $bound for $count vertices" }
                }
                validateTopology(
                    mode = primitive.mode,
                    count = if (primitive.indices >= 0) {
                        model.accessors[primitive.indices].count
                    } else {
                        count
                    },
                )
                for (mapping in primitive.mappings) {
                    reference(index = mapping.variant, size = model.variants.size, optional = false)
                    reference(index = mapping.material, size = model.materials.size, optional = false)
                }
                primitive.draco?.let {
                    reference(index = it.bufferView, size = model.bufferViews.size, optional = false)
                }
            }
        }
        validateResources(model)
        for (texture in model.textures) {
            reference(index = texture.image, size = model.images.size)
            reference(index = texture.basisuImage, size = model.images.size)
            reference(index = texture.webpImage, size = model.images.size)
            reference(index = texture.sampler, size = model.samplers.size)
        }
        for (material in model.materials) {
            validateTextures(material = material, size = model.textures.size)
            validateMaterial(material)
        }
        for ((index, node) in model.nodes.withIndex()) {
            assert(!node.hasMatrix || !node.hasTranslation && !node.hasRotation && !node.hasScale) {
                "Node matrix and TRS are mutually exclusive"
            }
            assert(node.rotationValues == null || abs(node.rotation.sumOf { it.toDouble() * it } - 1.0) <= 0.0001) {
                "Node rotation must be a unit quaternion"
            }
            reference(index = node.mesh, size = model.meshes.size)
            reference(index = node.skin, size = model.skins.size)
            reference(index = node.camera, size = model.cameras.size)
            reference(index = node.light, size = model.lights.size)
            for (child in node.children) {
                reference(index = child, size = model.nodes.size, optional = false)
                assert(model.nodes[child].parent == GLTF_MISSING_INDEX) {
                    "Node has multiple parents"
                }
                model.nodes[child].parent = index
            }
            if (node.weights.isNotEmpty()) {
                assert(node.mesh >= 0 && node.weights.size == model.meshes[node.mesh].primitives[0].targets.size)
            }
            if (node.skin >= 0) {
                assert(node.mesh >= 0) {
                    "Skin requires a mesh"
                }
                for (primitive in model.meshes[node.mesh].primitives) assert(
                    primitive.attributes.any { it.name == "JOINTS_0" } && primitive.attributes.any {
                        it.name == "WEIGHTS_0"
                    },
                ) { "Skinned primitives require joints and weights" }
            }
            if (node.instancing.isNotEmpty() || node.extensions.any { it.name == "EXT_mesh_gpu_instancing" }) {
                assert(node.mesh >= 0)
                @Suppress("kotlin:compiler:warning:RETURN_VALUE_NOT_USED")
                validAttributeCount(model = model, attributes = node.instancing)
                validateInstancing(model = model, node = node)
            }
        }
        validateNodeGraph(model)
        reference(index = model.scene, size = model.scenes.size)
        for (scene in model.scenes) {
            validationScratch.uniqueNodes(indices = scene.nodes, count = model.nodes.size)
            for (node in scene.nodes) {
                reference(index = node, size = model.nodes.size, optional = false)
                assert(model.nodes[node].parent < 0) { "Scene node has a parent" }
            }
        }
        for (skin in model.skins) {
            reference(index = skin.skeleton, size = model.nodes.size)
            reference(index = skin.inverseBindMatrices, size = model.accessors.size)
            assert(skin.joints.isNotEmpty()) { "Skin requires joints" }
            validationScratch.uniqueNodes(indices = skin.joints, count = model.nodes.size)
            for (joint in skin.joints) reference(index = joint, size = model.nodes.size, optional = false)
            if (skin.inverseBindMatrices >= 0) {
                val accessor = model.accessors[skin.inverseBindMatrices]
                assert(
                    accessor.type.value == GLTF_TYPE_MAT4 &&
                        accessor.componentType.value == GLTF_COMPONENT_FLOAT &&
                        accessor.count >= skin.joints.size,
                )
                assert(accessor.bufferView < 0 || model.bufferViews[accessor.bufferView].stride == 0)
            }
        }
        validationScratch.validateSkinHierarchy(model)
        validateAnimations(model = model, scratch = validationScratch)
        validateCamerasAndLights(model)
        validateViewUsage(model)
        for (variant in model.variants) {
            assert(variant.name != null)
        }
    }

    private fun validateViewUsage(model: KGltf) {
        val size = model.bufferViews.size
        val required = Math.multiplyExact(size, 2)
        if (viewUses.size < required) {
            viewUses = MutInts(required)
        } else {
            viewUses.fill(0, 0, required)
        }
        fun use(view: Int, kind: Int) {
            if (view < 0) {
                return
            }
            assert(viewUses[view] == 0 || viewUses[view] == kind) { "Buffer view contains incompatible data kinds" }
            viewUses[view] = kind
        }

        fun vertex(index: Int) {
            val view = model.accessors[index].bufferView
            if (view < 0) {
                return
            }
            use(view = view, kind = 1)
            val previous = viewUses[size + view]
            assert(previous == 0 || previous == index + 1 || model.bufferViews[view].stride > 0) {
                "Shared vertex view requires byteStride"
            }
            viewUses[size + view] = index + 1
        }
        for (mesh in model.meshes) {
            for (primitive in mesh.primitives) {
                for (attribute in primitive.attributes) {
                    vertex(attribute.accessor)
                }
                for (target in primitive.targets) {
                    for (attribute in target) {
                        vertex(attribute.accessor)
                    }
                }
                if (primitive.indices >= 0) {
                    use(view = model.accessors[primitive.indices].bufferView, kind = 2)
                }
            }
        }
        for (node in model.nodes) {
            for (attribute in node.instancing) {
                vertex(attribute.accessor)
            }
        }
        for (image in model.images) {
            use(view = image.bufferView, kind = 4)
        }
        for (accessor in model.accessors) {
            accessor.sparse?.let {
                use(view = it.indicesBufferView, kind = 8)
                use(view = it.valuesBufferView, kind = 8)
            }
        }
        for (animation in model.animations) {
            for (sampler in animation.samplers) {
                use(view = model.accessors[sampler.input].bufferView, kind = 8)
                use(view = model.accessors[sampler.output].bufferView, kind = 8)
            }
        }
        for (skin in model.skins) {
            if (skin.inverseBindMatrices >= 0) {
                use(view = model.accessors[skin.inverseBindMatrices].bufferView, kind = 8)
            }
        }
    }

    private fun validateNodeGraph(model: KGltf) {
        if (nodeMarks.size < model.nodes.size) {
            nodeMarks = MutInts(model.nodes.size)
        } else {
            nodeMarks.fill(0, 0, model.nodes.size)
        }
        for (start in model.nodes.indices) {
            var node = start
            while (node >= 0 && nodeMarks[node] == 0) {
                nodeMarks[node] = 1
                node = model.nodes[node].parent
            }
            assert(node < 0 || nodeMarks[node] == 2) { "Node hierarchy contains a cycle" }
            node = start
            while (node >= 0 && nodeMarks[node] == 1) {
                nodeMarks[node] = 2
                node = model.nodes[node].parent
            }
        }
    }

    private fun validAttributeCount(model: KGltf, attributes: Array<KAttribute>): Int {
        assert(attributes.isNotEmpty())
        reference(index = attributes[0].accessor, size = model.accessors.size, optional = false)
        val count = model.accessors[attributes[0].accessor].count
        for (attribute in attributes) {
            reference(index = attribute.accessor, size = model.accessors.size, optional = false)
            assert(model.accessors[attribute.accessor].count == count) { "Mismatched attribute counts" }
        }
        return count
    }

    private fun validateTextures(material: KMaterial, size: Int) {
        fun texture(view: KTextureView?) {
            if (view != null) {
                reference(index = view.texture, size = size, optional = false)
                assert(view.texCoord >= 0)
                view.transform?.let { assert(it.texCoord >= -1) }
            }
        }
        texture(material.normalTexture)
        texture(material.occlusionTexture)
        texture(material.emissiveTexture)
        material.metallicRoughness?.let {
            texture(it.baseColorTexture)
            texture(it.metallicRoughnessTexture)
        }
        material.specularGlossiness?.let {
            texture(it.diffuseTexture)
            texture(it.specularGlossinessTexture)
        }
        material.clearcoat?.let {
            texture(it.texture)
            texture(it.roughnessTexture)
            texture(it.normalTexture)
        }
        material.transmission?.let { texture(it.texture) }
        material.specular?.let {
            texture(it.texture)
            texture(it.colorTexture)
        }
        material.volume?.let { texture(it.thicknessTexture) }
        material.sheen?.let {
            texture(it.colorTexture)
            texture(it.roughnessTexture)
        }
        material.iridescence?.let {
            texture(it.texture)
            texture(it.thicknessTexture)
        }
        material.diffuseTransmission?.let {
            texture(it.texture)
            texture(it.colorTexture)
        }
        material.anisotropy?.let { texture(it.texture) }
    }
}

internal fun reference(
    index: Int,
    size: Int,
    optional: Boolean = true,
) {
    assert(
        index >= (if (optional) {
            GLTF_MISSING_INDEX
        } else {
            0
        }) && index < size,
    ) { "Invalid glTF reference $index/$size" }
}

internal fun range(
    offset: Int,
    length: Long,
    available: Int,
) {
    assert(offset >= 0 && length >= 0 && offset.toLong() <= available.toLong() - length) {
        "GLB buffer range is outside its payload"
    }
}

internal fun viewRange(
    model: KGltf,
    index: Int,
    offset: Int,
    length: Long,
    alignment: Int,
) {
    reference(index = index, size = model.bufferViews.size, optional = false)
    val view = model.bufferViews[index]
    range(offset = offset, length = length, available = view.byteLength)
    assert((model.bufferOffsets[view.buffer].toLong() + view.offset + offset) % alignment == 0L) {
        "Unaligned GLB accessor data"
    }
}

internal fun scalarIndexBound(
    bytes: Bytes,
    start: Int,
    type: Int,
    count: Int,
): Long {
    var offset = start
    return when (type) {
        GLTF_COMPONENT_UNSIGNED_BYTE -> {
            var bound = 0
            repeat(count) { bound = maxOf(bound, bytes[offset++].toInt() and UNSIGNED_BYTE_MASK) }
            bound.toLong()
        }

        GLTF_COMPONENT_UNSIGNED_SHORT -> {
            var bound = 0
            repeat(count) {
                bound = maxOf(bound, (shortViewHandle.get(bytes, offset) as Short).toInt() and UNSIGNED_SHORT_MASK)
                offset += Short.SIZE_BYTES
            }
            bound.toLong()
        }

        GLTF_COMPONENT_UNSIGNED_INT -> {
            var bound = 0L
            repeat(count) {
                bound = maxOf(bound, (intViewHandle.get(bytes, offset) as Int).toLong() and UNSIGNED_INT_MASK)
                offset += Int.SIZE_BYTES
            }
            bound
        }

        else -> {
            error("Invalid unsigned component type")
        }
    }
}

private object GltfIndexVectors {
    private val shorts = ShortVector.SPECIES_PREFERRED
    private val ints = IntVector.SPECIES_PREFERRED
    private val bytesSpecies = ByteVector.SPECIES_PREFERRED
    private val swapBytes = ByteOrder.nativeOrder() != ByteOrder.LITTLE_ENDIAN

    fun bound(
        bytes: Bytes,
        start: Int,
        type: ComponentType,
        count: Int,
    ): Long {
        var index = 0
        var result: Long
        when (type.value) {
            GLTF_COMPONENT_UNSIGNED_SHORT -> {
                var max = ShortVector.broadcast(shorts, Short.MIN_VALUE)
                val end = shorts.loopBound(count)
                while (index < end) {
                    var lanes = ByteVector
                        .fromArray(bytesSpecies, bytes, start + index * Short.SIZE_BYTES)
                        .reinterpretAsShorts()
                    if (swapBytes) {
                        lanes = lanes.lanewise(VectorOperators.REVERSE_BYTES)
                    }
                    max = max.max(lanes.lanewise(VectorOperators.XOR, Short.MIN_VALUE))
                    index += shorts.length()
                }
                result =
                    ((max.reduceLanes(VectorOperators.MAX).toInt() xor UNSIGNED_SHORT_SIGN_BIT) and
                        UNSIGNED_SHORT_MASK).toLong()
            }

            GLTF_COMPONENT_UNSIGNED_INT -> {
                var max = IntVector.broadcast(ints, Int.MIN_VALUE)
                val end = ints.loopBound(count)
                while (index < end) {
                    var lanes = ByteVector
                        .fromArray(bytesSpecies, bytes, start + index * Int.SIZE_BYTES)
                        .reinterpretAsInts()
                    if (swapBytes) {
                        lanes = lanes.lanewise(VectorOperators.REVERSE_BYTES)
                    }
                    max = max.max(lanes.lanewise(VectorOperators.XOR, Int.MIN_VALUE))
                    index += ints.length()
                }
                result = (max.reduceLanes(VectorOperators.MAX) xor Int.MIN_VALUE).toLong() and UNSIGNED_INT_MASK
            }

            GLTF_COMPONENT_UNSIGNED_BYTE -> {
                var max = ByteVector.broadcast(bytesSpecies, Byte.MIN_VALUE)
                val end = bytesSpecies.loopBound(count)
                while (index < end) {
                    max =
                        max.max(
                            ByteVector
                                .fromArray(bytesSpecies, bytes, start + index)
                                .lanewise(VectorOperators.XOR, Byte.MIN_VALUE),
                        )
                    index += bytesSpecies.length()
                }
                result =
                    ((max.reduceLanes(VectorOperators.MAX).toInt() xor UNSIGNED_BYTE_SIGN_BIT) and
                        UNSIGNED_BYTE_MASK).toLong()
            }

            else -> {
                error("Invalid index component type")
            }
        }
        val size = type.componentSize()
        while (index < count) {
            result = maxOf(
                result,
                type.readUnsigned(
                    bytes = bytes,
                    offset = start + index * size,
                ),
            )
            index++
        }
        return result
    }
}

private fun percentDecodedBytes(uri: String): Bytes {
    val bytes = uri.toByteArray(Charsets.UTF_8)
    var read = 0
    var write = 0
    while (read < bytes.size) {
        if (bytes[read].toInt() == URI_ESCAPE_PREFIX) {
            assert(read <= bytes.size - URI_ESCAPE_LENGTH) { "Truncated URI escape" }
            val high = Character.digit(bytes[read + 1].toInt().toChar(), HEX_RADIX)
            val low = Character.digit(bytes[read + 2].toInt().toChar(), HEX_RADIX)
            assert(high >= 0 && low >= 0) { "Invalid URI escape" }
            bytes[write++] = ((high shl HEX_DIGIT_BITS) or low).toByte()
            read += URI_ESCAPE_LENGTH
        } else {
            bytes[write++] = bytes[read++]
        }
    }
    return bytes.copyOf(write)
}

fun decodeGltfUri(
    uri: String,
): String = Charsets.UTF_8
    .newDecoder()
    .onMalformedInput(CodingErrorAction.REPORT)
    .onUnmappableCharacter(CodingErrorAction.REPORT)
    .decode(ByteBuffer.wrap(percentDecodedBytes(uri)))
    .toString()

internal fun decodeDataUri(uri: String): Bytes {
    val comma = uri.indexOf(',')
    assert(comma >= 0) { "Invalid data URI" }
    val payload = percentDecodedBytes(uri.substring(comma + 1))
    return if (uri.substring(0, comma).endsWith(";base64")) {
        Base64.getDecoder().decode(payload)
    } else {
        payload
    }
}

internal fun elementExtent(type: AccessorType, componentType: ComponentType): Int {
    val size = componentType.componentSize()
    val rows = when (type.value) {
        GLTF_TYPE_MAT2 -> 2
        GLTF_TYPE_MAT3 -> 3
        GLTF_TYPE_MAT4 -> 4
        else -> return type.componentCount() * size
    }
    val column = (rows * size + 3) and -4
    return (rows - 1) * column + rows * size
}

private fun effectiveIndexBound(model: KGltf, accessor: KAccessor): Long {
    val sparse = accessor.sparse
    if (sparse == null) {
        if (accessor.bufferView < 0) {
            return 0
        }
        val view = model.bufferViews[accessor.bufferView]
        return GltfIndexVectors.bound(
            bytes = model.bufferSources[view.buffer],
            start = model.bufferOffsets[view.buffer] + view.offset + accessor.offset,
            type = accessor.componentType,
            count = accessor.count,
        )
    }
    val positions = model.bufferViews[sparse.indicesBufferView]
    val replacements = model.bufferViews[sparse.valuesBufferView]
    val positionStart = model.bufferOffsets[positions.buffer] + positions.offset + sparse.indicesOffset
    val replacementStart = model.bufferOffsets[replacements.buffer] + replacements.offset + sparse.valuesOffset
    val positionSize = sparse.indicesComponentType.componentSize()
    val valueSize = accessor.componentType.componentSize()
    var bound = GltfIndexVectors.bound(
        bytes = model.bufferSources[replacements.buffer],
        start = replacementStart,
        type = accessor.componentType,
        count = sparse.count,
    )
    if (accessor.bufferView < 0) {
        return bound
    }
    val base = model.bufferViews[accessor.bufferView]
    val baseStart = model.bufferOffsets[base.buffer] + base.offset + accessor.offset
    var first = 0
    repeat(sparse.count) { patch ->
        val position = sparse.indicesComponentType
            .readUnsigned(bytes = model.bufferSources[positions.buffer], offset = positionStart + patch * positionSize)
            .toInt()
        if (position > first) {
            bound = maxOf(
                bound,
                GltfIndexVectors.bound(
                    bytes = model.bufferSources[base.buffer],
                    start = baseStart + first * valueSize,
                    type = accessor.componentType,
                    count = position - first,
                ),
            )
        }
        first = position + 1
    }
    if (first < accessor.count) {
        bound = maxOf(
            bound,
            GltfIndexVectors.bound(
                bytes = model.bufferSources[base.buffer],
                start = baseStart + first * valueSize,
                type = accessor.componentType,
                count = accessor.count - first,
            ),
        )
    }
    return bound
}
