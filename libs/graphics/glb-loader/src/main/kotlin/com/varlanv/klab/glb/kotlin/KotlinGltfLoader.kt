package com.varlanv.klab.glb.kotlin

import com.varlanv.klab.collections.Array
import com.varlanv.klab.collections.Bytes
import com.varlanv.klab.collections.MutInts
import com.varlanv.klab.collections.MutLongs
import com.varlanv.klab.intViewHandle
import com.varlanv.klab.shortViewHandle
import jdk.incubator.vector.ByteVector
import jdk.incubator.vector.IntVector
import jdk.incubator.vector.ShortVector
import jdk.incubator.vector.VectorOperators
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.charset.CodingErrorAction
import java.nio.file.Files
import java.nio.file.Path
import java.util.*

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

class KotlinGltfLoader {
    private val json = GltfJson()
    private var nodeMarks = MutInts(0)
    private var viewUses = MutInts(0)
    private var indexBounds = MutLongs(0)
    private val validationScratch = GltfValidationScratch()

    fun load(source: Bytes): KotlinGltf = load(source, null)

    fun load(path: Path): KotlinGltf {
        val absolute = path.toAbsolutePath()
        return load(Files.readAllBytes(absolute)) { uri ->
            Files.readAllBytes(absolute.parent.resolve(uri))
        }
    }

    fun load(source: Bytes, resolver: ((String) -> Bytes)?): KotlinGltf {
        var binOffset = 0
        var binSize = 0
        val model = try {
            if (source.size >= Int.SIZE_BYTES && intViewHandle.get(source, GLB_MAGIC_OFFSET) as Int == GLB_MAGIC) {
                require(source.size >= GLB_JSON_PAYLOAD_OFFSET) { "GLB header is truncated" }
                require(
                    intViewHandle.get(
                        source,
                        GLB_VERSION_OFFSET
                    ) as Int == GLB_VERSION
                ) { "Only GLB version 2 is supported" }
                require(
                    intViewHandle.get(
                        source,
                        GLB_LENGTH_OFFSET
                    ) as Int == source.size
                ) { "GLB length does not match input size" }
                val jsonSize = intViewHandle.get(source, GLB_JSON_LENGTH_OFFSET) as Int
                require(
                    jsonSize >= 0 && jsonSize <= source.size - GLB_JSON_PAYLOAD_OFFSET &&
                            jsonSize % GLB_CHUNK_ALIGNMENT == 0
                ) { "Invalid GLB JSON size" }
                require(
                    intViewHandle.get(
                        source,
                        GLB_JSON_TYPE_OFFSET
                    ) as Int == GLB_JSON_CHUNK
                ) { "Expected GLB JSON chunk" }
                var next = GLB_JSON_PAYLOAD_OFFSET + jsonSize
                var chunk = 1
                while (next < source.size) {
                    require(next <= source.size - GLB_CHUNK_HEADER_BYTES) { "Truncated GLB chunk header" }
                    val size = intViewHandle.get(source, next) as Int
                    val type = intViewHandle.get(source, next + GLB_CHUNK_TYPE_OFFSET) as Int
                    require(
                        size >= 0 && size % GLB_CHUNK_ALIGNMENT == 0 &&
                                size <= source.size - next - GLB_CHUNK_HEADER_BYTES
                    ) { "Invalid GLB chunk size" }
                    require(type != GLB_JSON_CHUNK) { "Duplicate GLB JSON chunk" }
                    if (type == GLB_BIN_CHUNK) {
                        require(chunk == 1 && binOffset == 0) { "GLB BIN must be the second chunk" }
                        binSize = size
                        binOffset = next + GLB_CHUNK_HEADER_BYTES
                    }
                    next += GLB_CHUNK_HEADER_BYTES + size
                    chunk++
                }
                json.parse(source, GLB_JSON_PAYLOAD_OFFSET, jsonSize)
            } else json.parse(source, 0, source.size)
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
            require(buffer.byteLength > 0) { "Invalid buffer length" }
            val uri = buffer.uri
            val data = when {
                uri == null && index == 0 && binOffset > 0 -> {
                    require(buffer.byteLength <= binSize && binSize - buffer.byteLength <= 3) { "Invalid GLB buffer length" }
                    for (padding in buffer.byteLength until binSize) require(source[binOffset + padding] == 0.toByte()) { "Invalid GLB BIN padding" }
                    bufferOffsets[index] = binOffset
                    source
                }

                uri != null && uri.startsWith("data:") -> {
                    decodeDataUri(uri)
                }

                uri != null && resolver != null -> resolver(decodeGltfUri(uri))
                else -> error("External GLB buffers require a resource resolver")
            }
            require(buffer.byteLength <= data.size - bufferOffsets[index]) { "Truncated buffer" }
            data
        }
        model.bufferOffsets = bufferOffsets
        validate(model)
        return model
    }

    private fun validate(model: KotlinGltf) {
        if (indexBounds.size < model.accessors.size) indexBounds = MutLongs(model.accessors.size)
        indexBounds.fill(-1L, 0, model.accessors.size)
        for (view in model.bufferViews) {
            reference(view.buffer, model.buffers.size, false)
            range(view.offset, view.byteLength.toLong(), model.buffers[view.buffer].byteLength)
            require(view.byteLength > 0 && (view.stride == 0 || view.stride in 4..252 && view.stride % 4 == 0)) { "Invalid buffer view layout" }
            require(view.target == 0 || view.target == 34962 || view.target == 34963) { "Invalid buffer view target" }
            val compression = view.meshopt
            if (compression != null) {
                require(compression.count > 0 && compression.byteLength > 0)
                require(
                    compression.filter == null || compression.filter in arrayOf(
                        "NONE",
                        "OCTAHEDRAL",
                        "QUATERNION",
                        "EXPONENTIAL"
                    ) || compression.isKhr && compression.filter == "COLOR"
                )
                reference(compression.buffer, model.buffers.size, false)
                range(compression.offset, compression.byteLength.toLong(), model.buffers[compression.buffer].byteLength)
                require(view.stride == 0 || view.stride == compression.stride)
                require(view.byteLength.toLong() == compression.stride.toLong() * compression.count)
                require(compression.mode in arrayOf("ATTRIBUTES", "TRIANGLES", "INDICES"))
                when (compression.mode) {
                    "ATTRIBUTES" -> require(
                        compression.stride > 0 && compression.stride % MESHOPT_ATTRIBUTE_ALIGNMENT == 0 &&
                                compression.stride <= MESHOPT_MAX_ATTRIBUTE_STRIDE
                    )

                    "TRIANGLES", "INDICES" -> {
                        require(compression.stride == Short.SIZE_BYTES || compression.stride == Int.SIZE_BYTES)
                        require(compression.filter == null || compression.filter == "NONE")
                        if (compression.mode == "TRIANGLES") require(compression.count % TRIANGLE_VERTICES == 0)
                    }
                }
                when (compression.filter) {
                    "OCTAHEDRAL", "COLOR" -> require(
                        compression.stride == Int.SIZE_BYTES || compression.stride == MESHOPT_LARGE_FILTER_STRIDE
                    )

                    "QUATERNION" -> require(compression.stride == MESHOPT_LARGE_FILTER_STRIDE)
                }
            }
        }
        for (accessor in model.accessors) {
            reference(accessor.bufferView, model.bufferViews.size)
            val component = componentSize(accessor.componentType)
            val size = elementSize(accessor.type, accessor.componentType)
            require(accessor.count > 0 && accessor.offset >= 0 && accessor.offset % component == 0) { "Invalid GLB accessor layout" }
            require(accessor.bufferView >= 0 || accessor.offset == 0) { "Accessor offset requires a buffer view" }
            require(!accessor.normalized || accessor.componentType != GLTF_COMPONENT_FLOAT && accessor.componentType != GLTF_COMPONENT_UNSIGNED_INT) { "Invalid normalized accessor type" }
            val components = componentCount(accessor.type)
            require(accessor.min.isEmpty() || accessor.min.size == components)
            require(accessor.max.isEmpty() || accessor.max.size == components)
            validateAccessorBounds(accessor)
            accessor.stride = if (accessor.bufferView >= 0 && model.bufferViews[accessor.bufferView].stride != 0)
                model.bufferViews[accessor.bufferView].stride else size
            require(accessor.stride >= size && accessor.stride % component == 0) { "Invalid GLB accessor stride" }
            if (accessor.bufferView >= 0) viewRange(
                model, accessor.bufferView, accessor.offset,
                (accessor.count - 1L) * accessor.stride + elementExtent(accessor.type, accessor.componentType),
                if (accessor.type >= GLTF_TYPE_MAT2) 4 else component
            )
            val sparse = accessor.sparse
            if (sparse != null) {
                require(sparse.count > 0 && sparse.count <= accessor.count) { "Invalid sparse count" }
                require(
                    sparse.indicesComponentType == GLTF_COMPONENT_UNSIGNED_BYTE ||
                            sparse.indicesComponentType == GLTF_COMPONENT_UNSIGNED_SHORT ||
                            sparse.indicesComponentType == GLTF_COMPONENT_UNSIGNED_INT
                )
                val indexSize = componentSize(sparse.indicesComponentType)
                viewRange(
                    model,
                    sparse.indicesBufferView,
                    sparse.indicesOffset,
                    sparse.count.toLong() * indexSize,
                    indexSize
                )
                viewRange(
                    model, sparse.valuesBufferView, sparse.valuesOffset,
                    (sparse.count - 1L) * size + elementExtent(accessor.type, accessor.componentType),
                    if (accessor.type >= GLTF_TYPE_MAT2) 4 else component
                )
                require(sparse.indicesOffset % indexSize == 0 && sparse.valuesOffset % component == 0)
                validateUnstridedView(model.bufferViews[sparse.indicesBufferView])
                validateUnstridedView(model.bufferViews[sparse.valuesBufferView])
                val view = model.bufferViews[sparse.indicesBufferView]
                val bytes = model.bufferSources[view.buffer]
                val start = model.bufferOffsets[view.buffer] + view.offset + sparse.indicesOffset
                var previous = -1L
                repeat(sparse.count) {
                    val value = readUnsigned(bytes, start + it * indexSize, sparse.indicesComponentType)
                    require(value > previous && value < accessor.count.toLong()) { "Sparse indices must increase and fit the accessor" }
                    previous = value
                }
            }
        }
        for (mesh in model.meshes) {
            require(mesh.primitives.isNotEmpty()) { "Mesh requires primitives" }
            val targets = mesh.primitives[0].targets.size
            require(mesh.weights.isEmpty() || mesh.weights.size == targets)
            require(mesh.targetNames.isEmpty() || mesh.targetNames.size == targets)
            for (primitive in mesh.primitives) {
                require(
                    primitive.mode in GLTF_PRIMITIVE_POINTS..GLTF_PRIMITIVE_TRIANGLE_FAN &&
                            primitive.targets.size == targets && primitive.attributes.isNotEmpty()
                ) { "Invalid GLB primitive" }
                reference(primitive.material, model.materials.size)
                val count = attributeCount(model, primitive.attributes)
                validateAttributes(model, primitive.attributes, false)
                for (target in primitive.targets) {
                    require(target.isNotEmpty())
                    for (attribute in target) {
                        reference(attribute.accessor, model.accessors.size, false)
                        require(model.accessors[attribute.accessor].count == count)
                        require(primitive.attributes.any { it.name == attribute.name }) { "Morph attribute requires a matching base attribute" }
                    }
                    validateAttributes(model, target, true)
                }
                reference(primitive.indices, model.accessors.size)
                if (primitive.indices >= 0) {
                    val indices = model.accessors[primitive.indices]
                    require(
                        indices.type == GLTF_TYPE_SCALAR && !indices.normalized &&
                                (indices.componentType == GLTF_COMPONENT_UNSIGNED_BYTE ||
                                        indices.componentType == GLTF_COMPONENT_UNSIGNED_SHORT ||
                                        indices.componentType == GLTF_COMPONENT_UNSIGNED_INT)
                    ) { "Invalid index accessor" }
                    require(indices.stride == componentSize(indices.componentType)) { "Invalid index stride" }
                    if (indices.bufferView >= 0) {
                        val view = model.bufferViews[indices.bufferView]
                        require(view.stride == 0 && view.target != 34962) { "Invalid index buffer view" }
                    }
                    var bound = indexBounds[primitive.indices]
                    if (bound < 0) {
                        bound = effectiveIndexBound(model, indices)
                        indexBounds[primitive.indices] = bound
                    }
                    val sentinel = when (indices.componentType) {
                        GLTF_COMPONENT_UNSIGNED_BYTE -> 255L
                        GLTF_COMPONENT_UNSIGNED_SHORT -> 65535L
                        else -> 0xffffffffL
                    }
                    require(bound < count.toLong() && bound < sentinel) { "Invalid primitive index $bound for $count vertices" }
                }
                validateTopology(
                    primitive.mode,
                    if (primitive.indices >= 0) model.accessors[primitive.indices].count else count
                )
                for (mapping in primitive.mappings) {
                    reference(mapping.variant, model.variants.size, false)
                    reference(mapping.material, model.materials.size, false)
                }
                primitive.draco?.let { reference(it.bufferView, model.bufferViews.size, false) }
            }
        }
        validateResources(model)
        for (texture in model.textures) {
            reference(texture.image, model.images.size)
            reference(texture.basisuImage, model.images.size)
            reference(texture.webpImage, model.images.size)
            reference(texture.sampler, model.samplers.size)
        }
        for (material in model.materials) {
            validateTextures(material, model.textures.size)
            validateMaterial(material)
        }
        for ((index, node) in model.nodes.withIndex()) {
            require(!node.hasMatrix || !node.hasTranslation && !node.hasRotation && !node.hasScale) { "Node matrix and TRS are mutually exclusive" }
            require(node.rotationValues == null || kotlin.math.abs(node.rotation.sumOf { it.toDouble() * it } - 1.0) <= 0.0001) { "Node rotation must be a unit quaternion" }
            reference(node.mesh, model.meshes.size)
            reference(node.skin, model.skins.size)
            reference(node.camera, model.cameras.size)
            reference(node.light, model.lights.size)
            for (child in node.children) {
                reference(child, model.nodes.size, false)
                require(model.nodes[child].parent == GLTF_MISSING_INDEX) { "Node has multiple parents" }
                model.nodes[child].parent = index
            }
            if (node.weights.isNotEmpty()) require(node.mesh >= 0 && node.weights.size == model.meshes[node.mesh].primitives[0].targets.size)
            if (node.skin >= 0) {
                require(node.mesh >= 0) { "Skin requires a mesh" }
                for (primitive in model.meshes[node.mesh].primitives) require(
                    primitive.attributes.any { it.name == "JOINTS_0" } && primitive.attributes.any { it.name == "WEIGHTS_0" }
                ) { "Skinned primitives require joints and weights" }
            }
            if (node.instancing.isNotEmpty() || node.extensions.any { it.name == "EXT_mesh_gpu_instancing" }) {
                require(node.mesh >= 0); attributeCount(model, node.instancing)
                validateInstancing(model, node)
            }
        }
        validateNodeGraph(model)
        reference(model.scene, model.scenes.size)
        for (scene in model.scenes) {
            validationScratch.uniqueNodes(scene.nodes, model.nodes.size)
            for (node in scene.nodes) {
                reference(node, model.nodes.size, false)
                require(model.nodes[node].parent < 0) { "Scene node has a parent" }
            }
        }
        for (skin in model.skins) {
            reference(skin.skeleton, model.nodes.size)
            reference(skin.inverseBindMatrices, model.accessors.size)
            require(skin.joints.isNotEmpty()) { "Skin requires joints" }
            validationScratch.uniqueNodes(skin.joints, model.nodes.size)
            for (joint in skin.joints) reference(joint, model.nodes.size, false)
            if (skin.inverseBindMatrices >= 0) {
                val accessor = model.accessors[skin.inverseBindMatrices]
                require(accessor.type == GLTF_TYPE_MAT4 && accessor.componentType == GLTF_COMPONENT_FLOAT && accessor.count >= skin.joints.size)
                require(accessor.bufferView < 0 || model.bufferViews[accessor.bufferView].stride == 0)
            }
        }
        validationScratch.validateSkinHierarchy(model)
        validateAnimations(model, validationScratch)
        validateCamerasAndLights(model)
        validateViewUsage(model)
        for (variant in model.variants) require(variant.name != null)
    }

    private fun validateViewUsage(model: KotlinGltf) {
        val size = model.bufferViews.size
        val required = Math.multiplyExact(size, 2)
        if (viewUses.size < required) viewUses = MutInts(required)
        else viewUses.fill(0, 0, required)
        fun use(view: Int, kind: Int) {
            if (view < 0) return
            require(viewUses[view] == 0 || viewUses[view] == kind) { "Buffer view contains incompatible data kinds" }
            viewUses[view] = kind
        }

        fun vertex(index: Int) {
            val view = model.accessors[index].bufferView
            if (view < 0) return
            use(view, 1)
            val previous = viewUses[size + view]
            require(previous == 0 || previous == index + 1 || model.bufferViews[view].stride > 0) { "Shared vertex view requires byteStride" }
            viewUses[size + view] = index + 1
        }
        for (mesh in model.meshes) for (primitive in mesh.primitives) {
            for (attribute in primitive.attributes) vertex(attribute.accessor)
            for (target in primitive.targets) for (attribute in target) vertex(attribute.accessor)
            if (primitive.indices >= 0) use(model.accessors[primitive.indices].bufferView, 2)
        }
        for (node in model.nodes) for (attribute in node.instancing) vertex(attribute.accessor)
        for (image in model.images) use(image.bufferView, 4)
        for (accessor in model.accessors) accessor.sparse?.let {
            use(it.indicesBufferView, 8); use(it.valuesBufferView, 8)
        }
        for (animation in model.animations) for (sampler in animation.samplers) {
            use(model.accessors[sampler.input].bufferView, 8)
            use(model.accessors[sampler.output].bufferView, 8)
        }
        for (skin in model.skins) if (skin.inverseBindMatrices >= 0) use(
            model.accessors[skin.inverseBindMatrices].bufferView,
            8
        )
    }

    private fun validateNodeGraph(model: KotlinGltf) {
        if (nodeMarks.size < model.nodes.size) nodeMarks = MutInts(model.nodes.size)
        else nodeMarks.fill(0, 0, model.nodes.size)
        for (start in model.nodes.indices) {
            var node = start
            while (node >= 0 && nodeMarks[node] == 0) {
                nodeMarks[node] = 1
                node = model.nodes[node].parent
            }
            require(node < 0 || nodeMarks[node] == 2) { "Node hierarchy contains a cycle" }
            node = start
            while (node >= 0 && nodeMarks[node] == 1) {
                nodeMarks[node] = 2
                node = model.nodes[node].parent
            }
        }
    }

    private fun attributeCount(model: KotlinGltf, attributes: Array<KAttribute>): Int {
        require(attributes.isNotEmpty())
        reference(attributes[0].accessor, model.accessors.size, false)
        val count = model.accessors[attributes[0].accessor].count
        for (attribute in attributes) {
            reference(attribute.accessor, model.accessors.size, false)
            require(model.accessors[attribute.accessor].count == count) { "Mismatched attribute counts" }
        }
        return count
    }

    private fun validateTextures(material: KMaterial, size: Int) {
        fun texture(view: KTextureView?) {
            if (view != null) {
                reference(view.texture, size, false)
                require(view.texCoord >= 0)
                view.transform?.let { require(it.texCoord >= -1) }
            }
        }
        texture(material.normalTexture); texture(material.occlusionTexture); texture(material.emissiveTexture)
        material.metallicRoughness?.let { texture(it.baseColorTexture); texture(it.metallicRoughnessTexture) }
        material.specularGlossiness?.let { texture(it.diffuseTexture); texture(it.specularGlossinessTexture) }
        material.clearcoat?.let { texture(it.texture); texture(it.roughnessTexture); texture(it.normalTexture) }
        material.transmission?.let { texture(it.texture) }
        material.specular?.let { texture(it.texture); texture(it.colorTexture) }
        material.volume?.let { texture(it.thicknessTexture) }
        material.sheen?.let { texture(it.colorTexture); texture(it.roughnessTexture) }
        material.iridescence?.let { texture(it.texture); texture(it.thicknessTexture) }
        material.diffuseTransmission?.let { texture(it.texture); texture(it.colorTexture) }
        material.anisotropy?.let { texture(it.texture) }
    }


}

internal fun reference(index: Int, size: Int, optional: Boolean = true) {
    require(index >= (if (optional) GLTF_MISSING_INDEX else 0) && index < size) { "Invalid glTF reference $index/$size" }
}

internal fun range(offset: Int, length: Long, available: Int) {
    require(offset >= 0 && length >= 0 && offset.toLong() <= available.toLong() - length) { "GLB buffer range is outside its payload" }
}

internal fun viewRange(model: KotlinGltf, index: Int, offset: Int, length: Long, alignment: Int) {
    reference(index, model.bufferViews.size, false)
    val view = model.bufferViews[index]
    range(offset, length, view.byteLength)
    require((model.bufferOffsets[view.buffer].toLong() + view.offset + offset) % alignment == 0L) { "Unaligned GLB accessor data" }
}

fun componentSize(type: Int): Int = when (type) {
    GLTF_COMPONENT_BYTE, GLTF_COMPONENT_UNSIGNED_BYTE -> Byte.SIZE_BYTES
    GLTF_COMPONENT_SHORT, GLTF_COMPONENT_UNSIGNED_SHORT -> Short.SIZE_BYTES
    GLTF_COMPONENT_UNSIGNED_INT, GLTF_COMPONENT_FLOAT -> Int.SIZE_BYTES
    else -> error("Invalid component type")
}

fun componentCount(type: Int): Int = when (type) {
    GLTF_TYPE_SCALAR -> 1
    GLTF_TYPE_VEC2 -> VEC2_COMPONENTS
    GLTF_TYPE_VEC3 -> VEC3_COMPONENTS
    GLTF_TYPE_VEC4 -> VEC4_COMPONENTS
    GLTF_TYPE_MAT2 -> MAT2_COMPONENTS
    GLTF_TYPE_MAT3 -> MAT3_COMPONENTS
    GLTF_TYPE_MAT4 -> MAT4_COMPONENTS
    else -> error("Invalid element type")
}

fun elementSize(type: Int, componentType: Int): Int {
    val bytes = componentSize(componentType)
    return when (type) {
        GLTF_TYPE_MAT2 -> ((MAT2_ROWS * bytes + MATRIX_COLUMN_ALIGNMENT - 1) and -MATRIX_COLUMN_ALIGNMENT) * MAT2_ROWS
        GLTF_TYPE_MAT3 -> ((MAT3_ROWS * bytes + MATRIX_COLUMN_ALIGNMENT - 1) and -MATRIX_COLUMN_ALIGNMENT) * MAT3_ROWS
        else -> componentCount(type) * bytes
    }
}

internal fun scalarIndexBound(bytes: Bytes, start: Int, type: Int, count: Int): Long {
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

        else -> error("Invalid unsigned component type")
    }
}

internal fun readUnsigned(bytes: Bytes, offset: Int, type: Int): Long = when (type) {
    GLTF_COMPONENT_UNSIGNED_BYTE -> (bytes[offset].toInt() and UNSIGNED_BYTE_MASK).toLong()
    GLTF_COMPONENT_UNSIGNED_SHORT -> ((shortViewHandle.get(
        bytes,
        offset
    ) as Short).toInt() and UNSIGNED_SHORT_MASK).toLong()

    GLTF_COMPONENT_UNSIGNED_INT -> (intViewHandle.get(bytes, offset) as Int).toLong() and UNSIGNED_INT_MASK
    else -> error("Invalid unsigned component type")
}


private object GltfIndexVectors {
    private val shorts = ShortVector.SPECIES_PREFERRED
    private val ints = IntVector.SPECIES_PREFERRED
    private val bytesSpecies = ByteVector.SPECIES_PREFERRED
    private val swapBytes = ByteOrder.nativeOrder() != ByteOrder.LITTLE_ENDIAN

    fun bound(bytes: Bytes, start: Int, type: Int, count: Int): Long {
        var index = 0
        var result: Long
        when (type) {
            GLTF_COMPONENT_UNSIGNED_SHORT -> {
                var max = ShortVector.broadcast(shorts, Short.MIN_VALUE)
                val end = shorts.loopBound(count)
                while (index < end) {
                    var lanes = ByteVector.fromArray(bytesSpecies, bytes, start + index * Short.SIZE_BYTES)
                        .reinterpretAsShorts()
                    if (swapBytes) lanes = lanes.lanewise(VectorOperators.REVERSE_BYTES)
                    max = max.max(lanes.lanewise(VectorOperators.XOR, Short.MIN_VALUE))
                    index += shorts.length()
                }
                result = ((max.reduceLanes(VectorOperators.MAX)
                    .toInt() xor UNSIGNED_SHORT_SIGN_BIT) and UNSIGNED_SHORT_MASK).toLong()
            }

            GLTF_COMPONENT_UNSIGNED_INT -> {
                var max = IntVector.broadcast(ints, Int.MIN_VALUE)
                val end = ints.loopBound(count)
                while (index < end) {
                    var lanes =
                        ByteVector.fromArray(bytesSpecies, bytes, start + index * Int.SIZE_BYTES).reinterpretAsInts()
                    if (swapBytes) lanes = lanes.lanewise(VectorOperators.REVERSE_BYTES)
                    max = max.max(lanes.lanewise(VectorOperators.XOR, Int.MIN_VALUE))
                    index += ints.length()
                }
                result = (max.reduceLanes(VectorOperators.MAX) xor Int.MIN_VALUE).toLong() and UNSIGNED_INT_MASK
            }

            GLTF_COMPONENT_UNSIGNED_BYTE -> {
                var max = ByteVector.broadcast(bytesSpecies, Byte.MIN_VALUE)
                val end = bytesSpecies.loopBound(count)
                while (index < end) {
                    max = max.max(
                        ByteVector.fromArray(bytesSpecies, bytes, start + index)
                            .lanewise(VectorOperators.XOR, Byte.MIN_VALUE)
                    )
                    index += bytesSpecies.length()
                }
                result = ((max.reduceLanes(VectorOperators.MAX)
                    .toInt() xor UNSIGNED_BYTE_SIGN_BIT) and UNSIGNED_BYTE_MASK).toLong()
            }

            else -> error("Invalid index component type")
        }
        val size = componentSize(type)
        while (index < count) {
            result = maxOf(result, readUnsigned(bytes, start + index * size, type))
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
            require(read <= bytes.size - URI_ESCAPE_LENGTH) { "Truncated URI escape" }
            val high = Character.digit(bytes[read + 1].toInt().toChar(), HEX_RADIX)
            val low = Character.digit(bytes[read + 2].toInt().toChar(), HEX_RADIX)
            require(high >= 0 && low >= 0) { "Invalid URI escape" }
            bytes[write++] = ((high shl HEX_DIGIT_BITS) or low).toByte()
            read += URI_ESCAPE_LENGTH
        } else bytes[write++] = bytes[read++]
    }
    return bytes.copyOf(write)
}

fun decodeGltfUri(uri: String): String = Charsets.UTF_8.newDecoder()
    .onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT)
    .decode(ByteBuffer.wrap(percentDecodedBytes(uri))).toString()

private fun decodeDataUri(uri: String): Bytes {
    val comma = uri.indexOf(',')
    require(comma >= 0) { "Invalid data URI" }
    val payload = percentDecodedBytes(uri.substring(comma + 1))
    return if (uri.substring(0, comma).endsWith(";base64")) Base64.getDecoder().decode(payload) else payload
}

internal fun elementExtent(type: Int, componentType: Int): Int {
    val size = componentSize(componentType)
    val rows = when (type) {
        GLTF_TYPE_MAT2 -> 2; GLTF_TYPE_MAT3 -> 3; GLTF_TYPE_MAT4 -> 4; else -> return componentCount(type) * size
    }
    val column = (rows * size + 3) and -4
    return (rows - 1) * column + rows * size
}

private fun effectiveIndexBound(model: KotlinGltf, accessor: KAccessor): Long {
    val sparse = accessor.sparse
    if (sparse == null) {
        if (accessor.bufferView < 0) return 0
        val view = model.bufferViews[accessor.bufferView]
        return GltfIndexVectors.bound(
            model.bufferSources[view.buffer],
            model.bufferOffsets[view.buffer] + view.offset + accessor.offset,
            accessor.componentType,
            accessor.count
        )
    }
    val positions = model.bufferViews[sparse.indicesBufferView]
    val replacements = model.bufferViews[sparse.valuesBufferView]
    val positionStart = model.bufferOffsets[positions.buffer] + positions.offset + sparse.indicesOffset
    val replacementStart = model.bufferOffsets[replacements.buffer] + replacements.offset + sparse.valuesOffset
    val positionSize = componentSize(sparse.indicesComponentType)
    val valueSize = componentSize(accessor.componentType)
    var bound = GltfIndexVectors.bound(
        model.bufferSources[replacements.buffer],
        replacementStart,
        accessor.componentType,
        sparse.count
    )
    if (accessor.bufferView < 0) return bound
    val base = model.bufferViews[accessor.bufferView]
    val baseStart = model.bufferOffsets[base.buffer] + base.offset + accessor.offset
    var first = 0
    repeat(sparse.count) { patch ->
        val position = readUnsigned(
            model.bufferSources[positions.buffer],
            positionStart + patch * positionSize,
            sparse.indicesComponentType
        ).toInt()
        if (position > first) bound = maxOf(
            bound,
            GltfIndexVectors.bound(
                model.bufferSources[base.buffer],
                baseStart + first * valueSize,
                accessor.componentType,
                position - first
            )
        )
        first = position + 1
    }
    if (first < accessor.count) bound = maxOf(
        bound,
        GltfIndexVectors.bound(
            model.bufferSources[base.buffer],
            baseStart + first * valueSize,
            accessor.componentType,
            accessor.count - first
        )
    )
    return bound
}
