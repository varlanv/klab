package com.varlanv.klab.glb.kotlin

import com.varlanv.klab.collections.Array
import com.varlanv.klab.collections.Bytes
import com.varlanv.klab.collections.MutBytes
import com.varlanv.klab.collections.MutInts
import com.varlanv.klab.intViewHandle
import com.varlanv.klab.shortViewHandle
import jdk.incubator.vector.ByteVector
import jdk.incubator.vector.IntVector
import jdk.incubator.vector.ShortVector
import jdk.incubator.vector.VectorOperators
import java.nio.ByteOrder
import java.nio.file.Files
import java.nio.file.Path
import java.util.Base64

private const val GLTF_VERSION = "2.0"
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
private const val URI_ESCAPE_HEX_DIGITS = 2
private const val URI_ESCAPE_LENGTH = 3
private const val HEX_RADIX = 16
private const val HEX_DIGIT_BITS = 4

class KotlinGltfLoader {
    private val json = GltfJson()

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
                require(intViewHandle.get(source, GLB_VERSION_OFFSET) as Int == GLB_VERSION) { "Only GLB version 2 is supported" }
                require(intViewHandle.get(source, GLB_LENGTH_OFFSET) as Int == source.size) { "GLB length does not match input size" }
                val jsonSize = intViewHandle.get(source, GLB_JSON_LENGTH_OFFSET) as Int
                require(
                    jsonSize >= 0 && jsonSize <= source.size - GLB_JSON_PAYLOAD_OFFSET &&
                            jsonSize % GLB_CHUNK_ALIGNMENT == 0
                ) { "Invalid GLB JSON size" }
                require(intViewHandle.get(source, GLB_JSON_TYPE_OFFSET) as Int == GLB_JSON_CHUNK) { "Expected GLB JSON chunk" }
                val next = GLB_JSON_PAYLOAD_OFFSET + jsonSize
                if (next < source.size) {
                    require(next <= source.size - GLB_CHUNK_HEADER_BYTES) { "Truncated GLB BIN header" }
                    binSize = intViewHandle.get(source, next) as Int
                    require(
                        binSize >= 0 && binSize <= source.size - next - GLB_CHUNK_HEADER_BYTES &&
                                binSize % GLB_CHUNK_ALIGNMENT == 0
                    ) { "Invalid GLB BIN size" }
                    require(intViewHandle.get(source, next + GLB_CHUNK_TYPE_OFFSET) as Int == GLB_BIN_CHUNK) { "Expected GLB BIN chunk" }
                    binOffset = next + GLB_CHUNK_HEADER_BYTES
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
        require(
            model.asset.version == GLTF_VERSION &&
                    (model.asset.minVersion == null || model.asset.minVersion == GLTF_VERSION)
        ) { "Unsupported glTF version" }
        val bufferOffsets = MutInts(model.buffers.size)
        model.bufferSources = Array(model.buffers.size) { index ->
            val buffer = model.buffers[index]
            require(buffer.byteLength >= 0) { "Invalid buffer length" }
            val uri = buffer.uri
            val data = when {
                uri == null && index == 0 && binOffset > 0 -> {
                    require(buffer.byteLength <= binSize) { "Truncated GLB buffer" }
                    bufferOffsets[index] = binOffset
                    source
                }

                uri != null && uri.startsWith("data:") -> {
                    val comma = uri.indexOf(',')
                    require(comma >= 0 && uri.substring(0, comma).endsWith(";base64")) { "Unsupported buffer data URI" }
                    Base64.getDecoder().decode(uri.substring(comma + 1))
                }

                uri != null && resolver != null -> resolver(decodeGltfUri(uri))
                else -> error("External GLB buffers require a resource resolver")
            }
            require(buffer.byteLength <= data.size - bufferOffsets[index]) { "Truncated buffer" }
            data
        }
        model.bufferOffsets = bufferOffsets
        for (extension in model.extensionsRequired) require(
            extension != "KHR_draco_mesh_compression" &&
                    extension != "EXT_meshopt_compression" && extension != "KHR_meshopt_compression"
        ) { "GLB geometry requires an additional decoder: $extension" }
        validate(model)
        return model
    }

    private fun validate(model: KotlinGltf) {
        for (view in model.bufferViews) {
            reference(view.buffer, model.buffers.size, false)
            range(view.offset, view.byteLength.toLong(), model.buffers[view.buffer].byteLength)
            require(view.stride >= 0) { "Invalid buffer stride" }
            val compression = view.meshopt
            if (compression != null) {
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
            require(accessor.count > 0 && accessor.offset >= 0) { "Invalid GLB accessor layout" }
            accessor.stride = if (accessor.bufferView >= 0 && model.bufferViews[accessor.bufferView].stride != 0)
                model.bufferViews[accessor.bufferView].stride else size
            require(accessor.stride >= size && accessor.stride % component == 0) { "Invalid GLB accessor stride" }
            if (accessor.bufferView >= 0) viewRange(
                model, accessor.bufferView, accessor.offset,
                (accessor.count - 1L) * accessor.stride + size, component
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
                viewRange(model, sparse.valuesBufferView, sparse.valuesOffset, sparse.count.toLong() * size, component)
                require(
                    indexBound(
                        model,
                        sparse.indicesBufferView,
                        sparse.indicesOffset,
                        sparse.indicesComponentType,
                        sparse.count
                    ) < accessor.count.toLong()
                ) { "Sparse index exceeds accessor count" }
            }
        }
        for (mesh in model.meshes) {
            val targets = if (mesh.primitives.isEmpty()) 0 else mesh.primitives[0].targets.size
            require(mesh.weights.isEmpty() || mesh.weights.size == targets)
            require(mesh.targetNames.isEmpty() || mesh.targetNames.size == targets)
            for (primitive in mesh.primitives) {
                require(
                    primitive.mode in GLTF_PRIMITIVE_POINTS..GLTF_PRIMITIVE_TRIANGLE_FAN &&
                            primitive.targets.size == targets && primitive.attributes.isNotEmpty()
                ) { "Invalid GLB primitive" }
                reference(primitive.material, model.materials.size)
                val count = attributeCount(model, primitive.attributes)
                for (target in primitive.targets) for (attribute in target) {
                    reference(attribute.accessor, model.accessors.size, false)
                    require(model.accessors[attribute.accessor].count == count)
                }
                reference(primitive.indices, model.accessors.size)
                if (primitive.indices >= 0) {
                    val indices = model.accessors[primitive.indices]
                    require(
                        indices.type == GLTF_TYPE_SCALAR &&
                                (indices.componentType == GLTF_COMPONENT_UNSIGNED_BYTE ||
                                        indices.componentType == GLTF_COMPONENT_UNSIGNED_SHORT ||
                                        indices.componentType == GLTF_COMPONENT_UNSIGNED_INT)
                    ) { "Invalid index accessor" }
                    require(indices.stride == componentSize(indices.componentType)) { "Invalid index stride" }
                    if (indices.bufferView >= 0) {
                        val bound =
                            indexBound(model, indices.bufferView, indices.offset, indices.componentType, indices.count)
                        require(bound < count.toLong()) { "Index $bound exceeds vertex count $count; offset ${model.bufferOffsets[0]} view ${model.bufferViews[indices.bufferView].offset}" }
                    }
                }
                for (mapping in primitive.mappings) {
                    reference(mapping.variant, model.variants.size, false)
                    reference(mapping.material, model.materials.size, false)
                }
                primitive.draco?.let { reference(it.bufferView, model.bufferViews.size, false) }
            }
        }
        for (image in model.images) reference(image.bufferView, model.bufferViews.size)
        for (texture in model.textures) {
            reference(texture.image, model.images.size)
            reference(texture.basisuImage, model.images.size)
            reference(texture.webpImage, model.images.size)
            reference(texture.sampler, model.samplers.size)
        }
        for (material in model.materials) validateTextures(material, model.textures.size)
        for ((index, node) in model.nodes.withIndex()) {
            reference(node.mesh, model.meshes.size)
            reference(node.skin, model.skins.size)
            reference(node.camera, model.cameras.size)
            reference(node.light, model.lights.size)
            for (child in node.children) {
                reference(child, model.nodes.size, false)
                require(model.nodes[child].parent == GLTF_MISSING_INDEX) { "Node has multiple parents" }
                model.nodes[child].parent = index
            }
            if (node.weights.isNotEmpty() && node.mesh >= 0 && model.meshes[node.mesh].primitives.isNotEmpty())
                require(node.weights.size == model.meshes[node.mesh].primitives[0].targets.size)
            if (node.instancing.isNotEmpty() || node.extensions.any { it.name == "EXT_mesh_gpu_instancing" }) {
                require(node.mesh >= 0); attributeCount(model, node.instancing)
            }
        }
        for (node in model.nodes) {
            var slow = node.parent
            var fast = if (slow < 0) GLTF_MISSING_INDEX else model.nodes[slow].parent
            while (slow >= 0 && fast >= 0) {
                require(slow != fast) { "Node hierarchy contains a cycle" }
                slow = model.nodes[slow].parent
                fast = model.nodes[fast].parent
                if (fast >= 0) fast = model.nodes[fast].parent
            }
        }
        reference(model.scene, model.scenes.size)
        for (scene in model.scenes) for (node in scene.nodes) {
            reference(node, model.nodes.size, false)
            require(model.nodes[node].parent < 0) { "Scene node has a parent" }
        }
        for (skin in model.skins) {
            reference(skin.skeleton, model.nodes.size)
            reference(skin.inverseBindMatrices, model.accessors.size)
            for (joint in skin.joints) reference(joint, model.nodes.size, false)
        }
        for (animation in model.animations) {
            for (sampler in animation.samplers) {
                reference(sampler.input, model.accessors.size, false)
                reference(sampler.output, model.accessors.size, false)
            }
            for (channel in animation.channels) {
                reference(channel.sampler, animation.samplers.size, false)
                reference(channel.targetNode, model.nodes.size)
                if (channel.targetNode < 0) continue
                var components = 1
                if (channel.targetPath == GLTF_PATH_WEIGHTS) {
                    val mesh = model.nodes[channel.targetNode].mesh
                    require(mesh >= 0 && model.meshes[mesh].primitives.isNotEmpty())
                    components = model.meshes[mesh].primitives[0].targets.size
                }
                val sampler = animation.samplers[channel.sampler]
                val values = if (sampler.interpolation == GLTF_INTERPOLATION_CUBIC_SPLINE)
                    CUBIC_SPLINE_VALUES_PER_KEYFRAME else 1
                require(model.accessors[sampler.input].count.toLong() * components * values == model.accessors[sampler.output].count.toLong())
            }
        }
        for (variant in model.variants) require(variant.name != null)
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
            if (view != null) reference(view.texture, size)
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

    private fun indexBound(model: KotlinGltf, viewIndex: Int, offset: Int, type: Int, count: Int): Long {
        val view = model.bufferViews[viewIndex]
        val bytes = model.bufferSources[view.buffer]
        val start = model.bufferOffsets[view.buffer] + view.offset + offset
        return GltfIndexVectors.bound(bytes, start, type, count)
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
    GLTF_COMPONENT_UNSIGNED_SHORT -> ((shortViewHandle.get(bytes, offset) as Short).toInt() and UNSIGNED_SHORT_MASK).toLong()
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
                    var lanes = ByteVector.fromArray(bytesSpecies, bytes, start + index * Short.SIZE_BYTES).reinterpretAsShorts()
                    if (swapBytes) lanes = lanes.lanewise(VectorOperators.REVERSE_BYTES)
                    max = max.max(lanes.lanewise(VectorOperators.XOR, Short.MIN_VALUE))
                    index += shorts.length()
                }
                result = ((max.reduceLanes(VectorOperators.MAX).toInt() xor UNSIGNED_SHORT_SIGN_BIT) and UNSIGNED_SHORT_MASK).toLong()
            }

            GLTF_COMPONENT_UNSIGNED_INT -> {
                var max = IntVector.broadcast(ints, Int.MIN_VALUE)
                val end = ints.loopBound(count)
                while (index < end) {
                    var lanes = ByteVector.fromArray(bytesSpecies, bytes, start + index * Int.SIZE_BYTES).reinterpretAsInts()
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
                result = ((max.reduceLanes(VectorOperators.MAX).toInt() xor UNSIGNED_BYTE_SIGN_BIT) and UNSIGNED_BYTE_MASK).toLong()
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

fun decodeGltfUri(uri: String): String {
    val bytes: MutBytes = uri.toByteArray(Charsets.UTF_8)
    var read = 0
    var write = 0
    while (read < bytes.size) {
        if (bytes[read].toInt() == URI_ESCAPE_PREFIX && read + URI_ESCAPE_HEX_DIGITS < bytes.size) {
            val high = Character.digit(bytes[read + 1].toInt().toChar(), HEX_RADIX)
            val low = Character.digit(bytes[read + URI_ESCAPE_HEX_DIGITS].toInt().toChar(), HEX_RADIX)
            if (high >= 0 && low >= 0) {
                bytes[write++] = ((high shl HEX_DIGIT_BITS) or low).toByte(); read += URI_ESCAPE_LENGTH; continue
            }
        }
        bytes[write++] = bytes[read++]
    }
    return String(bytes, 0, write, Charsets.UTF_8)
}
