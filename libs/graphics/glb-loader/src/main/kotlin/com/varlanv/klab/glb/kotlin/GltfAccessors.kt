package com.varlanv.klab.glb.kotlin

import com.varlanv.klab.collections.*
import com.varlanv.klab.intViewHandle
import com.varlanv.klab.shortViewHandle
import java.nio.ByteBuffer
import java.nio.ByteOrder

private const val MIN_VECTOR_INDEX_COUNT = 64
private const val UNSIGNED_BYTE_MASK = 0xff
private const val UNSIGNED_SHORT_MASK = 0xffff
private const val UNSIGNED_INT_MASK = 0xffffffffL
private const val SIGNED_BYTE_MAX = 127f
private const val UNSIGNED_BYTE_MAX = 255f
private const val SIGNED_SHORT_MAX = 32767f
private const val UNSIGNED_SHORT_MAX = 65535f
private const val MAT2_ROWS = 2
private const val MAT3_ROWS = 3
private const val MAT4_ROWS = 4
private const val MISSING_ELEMENT_LOCATION = -1L

fun KotlinGltf.copyFloatsTo(accessorIndex: Int, destination: MutFloats) {
    val accessor = accessors[accessorIndex]
    val components = componentCount(accessor.type)
    val total = Math.multiplyExact(accessor.count, components)
    require(destination.size >= total) { "Output is too small" }
    if (accessor.bufferView < 0) destination.fill(0f, 0, total) else {
        val view = bufferViews[accessor.bufferView]
        val bytes = bufferSources[view.buffer]
        val start = bufferOffsets[view.buffer] + view.offset + accessor.offset
        if (accessor.componentType == GLTF_COMPONENT_FLOAT && accessor.stride == components * Float.SIZE_BYTES) {
            copyPackedFloats(bytes, start, total, destination)
        } else if (accessor.componentType == GLTF_COMPONENT_FLOAT) {
            copyStridedFloats(bytes, start, accessor.count, components, accessor.stride, destination)
        } else if (accessor.type <= GLTF_TYPE_VEC4 && accessor.stride == components * componentSize(accessor.componentType)) {
            unpackPacked(bytes, start, total, accessor.componentType, accessor.normalized, destination)
        } else {
            var output = 0
            var element = start
            repeat(accessor.count) {
                var component = 0
                while (component < components) {
                    destination[output++] = readFloat(
                        bytes,
                        element + componentOffset(accessor, component),
                        accessor.componentType,
                        accessor.normalized
                    )
                    component++
                }
                element += accessor.stride
            }
        }
    }
    val sparse = accessor.sparse
    if (sparse != null) {
        val indices = bufferViews[sparse.indicesBufferView]
        val values = bufferViews[sparse.valuesBufferView]
        val indexBytes = bufferSources[indices.buffer]
        val valueBytes = bufferSources[values.buffer]
        val indexStart = bufferOffsets[indices.buffer] + indices.offset + sparse.indicesOffset
        val valueStart = bufferOffsets[values.buffer] + values.offset + sparse.valuesOffset
        val indexSize = componentSize(sparse.indicesComponentType)
        val size = elementSize(accessor.type, accessor.componentType)
        repeat(sparse.count) { patch ->
            val output =
                readUnsigned(
                    indexBytes,
                    indexStart + patch * indexSize,
                    sparse.indicesComponentType
                ).toInt() * components
            repeat(components) { component ->
                destination[output + component] = readFloat(
                    valueBytes,
                    valueStart + patch * size + componentOffset(accessor, component),
                    accessor.componentType,
                    accessor.normalized
                )
            }
        }
    }
}

private fun copyPackedFloats(bytes: Bytes, start: Int, count: Int, destination: MutFloats) {
    ByteBuffer.wrap(bytes, start, count * Float.SIZE_BYTES).order(ByteOrder.LITTLE_ENDIAN).asFloatBuffer()
        .get(destination, 0, count)
}

private fun copyStridedFloats(
    bytes: Bytes,
    start: Int,
    count: Int,
    components: Int,
    stride: Int,
    destination: MutFloats
) {
    var element = start
    var output = 0
    repeat(count) {
        repeat(components) { component ->
            val value = Float.fromBits(intViewHandle.get(bytes, element + component * Float.SIZE_BYTES) as Int)
            destination[output++] = value
        }
        element += stride
    }
}

fun KotlinGltf.copyIndicesTo(accessorIndex: Int, destination: MutInts) {
    val accessor = accessors[accessorIndex]
    require(
        accessor.type == GLTF_TYPE_SCALAR && !accessor.normalized &&
                (accessor.componentType == GLTF_COMPONENT_UNSIGNED_BYTE ||
                        accessor.componentType == GLTF_COMPONENT_UNSIGNED_SHORT ||
                        accessor.componentType == GLTF_COMPONENT_UNSIGNED_INT)
    ) { "Indices must be unsigned scalars" }
    require(destination.size >= accessor.count) { "Output is too small" }
    if (accessor.bufferView < 0) destination.fill(0, 0, accessor.count) else {
        val view = bufferViews[accessor.bufferView]
        val bytes = bufferSources[view.buffer]
        var offset = bufferOffsets[view.buffer] + view.offset + accessor.offset
        if (accessor.count >= MIN_VECTOR_INDEX_COUNT) {
            if (accessor.componentType == GLTF_COMPONENT_UNSIGNED_SHORT && accessor.stride == Short.SIZE_BYTES) {
                GltfIndexDecoder.copyShorts(bytes, offset, accessor.count, destination)
                sparseIndices(accessor) { index, value -> destination[index] = value.toInt() }
                return
            }
            if (accessor.componentType == GLTF_COMPONENT_UNSIGNED_BYTE && accessor.stride == Byte.SIZE_BYTES) {
                GltfIndexDecoder.copyBytes(bytes, offset, accessor.count, destination)
                sparseIndices(accessor) { index, value -> destination[index] = value.toInt() }
                return
            }
        }
        when (accessor.componentType) {
            GLTF_COMPONENT_UNSIGNED_BYTE -> repeat(accessor.count) {
                destination[it] = bytes[offset].toInt() and UNSIGNED_BYTE_MASK; offset += accessor.stride
            }

            GLTF_COMPONENT_UNSIGNED_SHORT -> repeat(accessor.count) {
                destination[it] = (shortViewHandle.get(bytes, offset) as Short).toInt() and UNSIGNED_SHORT_MASK
                offset += accessor.stride
            }

            GLTF_COMPONENT_UNSIGNED_INT -> if (accessor.stride == Int.SIZE_BYTES) {
                ByteBuffer.wrap(bytes, offset, accessor.count * Int.SIZE_BYTES).order(ByteOrder.LITTLE_ENDIAN)
                    .asIntBuffer()
                    .get(destination, 0, accessor.count)
            } else repeat(accessor.count) {
                destination[it] = intViewHandle.get(bytes, offset) as Int
                offset += accessor.stride
            }
        }
    }
    sparseIndices(accessor) { index, value -> destination[index] = value.toInt() }
}

fun KotlinGltf.copyIndicesTo(accessorIndex: Int, destination: MutShorts) {
    val accessor = accessors[accessorIndex]
    require(
        accessor.type == GLTF_TYPE_SCALAR && !accessor.normalized &&
                (accessor.componentType == GLTF_COMPONENT_UNSIGNED_BYTE ||
                        accessor.componentType == GLTF_COMPONENT_UNSIGNED_SHORT)
    )
    require(destination.size >= accessor.count)
    if (accessor.bufferView < 0) {
        destination.fill(0, 0, accessor.count)
        sparseIndices(accessor) { index, value -> destination[index] = value.toShort() }; return
    }
    val view = bufferViews[accessor.bufferView]
    val bytes = bufferSources[view.buffer]
    var offset = bufferOffsets[view.buffer] + view.offset + accessor.offset
    if (accessor.componentType == GLTF_COMPONENT_UNSIGNED_SHORT && accessor.stride == Short.SIZE_BYTES) {
        ByteBuffer.wrap(bytes, offset, accessor.count * Short.SIZE_BYTES).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer()
            .get(destination, 0, accessor.count)
    } else repeat(accessor.count) {
        destination[it] = readUnsigned(bytes, offset, accessor.componentType).toShort()
        offset += accessor.stride
    }
    sparseIndices(accessor) { index, value -> destination[index] = value.toShort() }
}

fun KotlinGltf.copyIndicesTo(accessorIndex: Int, destination: MutBytes) {
    val accessor = accessors[accessorIndex]
    require(
        accessor.type == GLTF_TYPE_SCALAR && !accessor.normalized && accessor.componentType == GLTF_COMPONENT_UNSIGNED_BYTE &&
                destination.size >= accessor.count
    )
    if (accessor.bufferView < 0) {
        destination.fill(0, 0, accessor.count)
        sparseIndices(accessor) { index, value -> destination[index] = value.toByte() }; return
    }
    val view = bufferViews[accessor.bufferView]
    val bytes = bufferSources[view.buffer]
    var offset = bufferOffsets[view.buffer] + view.offset + accessor.offset
    if (accessor.stride == Byte.SIZE_BYTES) bytes.copyInto(destination, 0, offset, offset + accessor.count)
    else repeat(accessor.count) { destination[it] = bytes[offset]; offset += accessor.stride }
    sparseIndices(accessor) { index, value -> destination[index] = value.toByte() }
}

private inline fun KotlinGltf.sparseIndices(accessor: KAccessor, write: (Int, Long) -> Unit) {
    val sparse = accessor.sparse ?: return
    val indices = bufferViews[sparse.indicesBufferView]
    val values = bufferViews[sparse.valuesBufferView]
    val indexStart = bufferOffsets[indices.buffer] + indices.offset + sparse.indicesOffset
    val valueStart = bufferOffsets[values.buffer] + values.offset + sparse.valuesOffset
    val indexSize = componentSize(sparse.indicesComponentType)
    val valueSize = componentSize(accessor.componentType)
    repeat(sparse.count) { patch ->
        val index = readUnsigned(
            bufferSources[indices.buffer],
            indexStart + patch * indexSize,
            sparse.indicesComponentType
        ).toInt()
        write(index, readUnsigned(bufferSources[values.buffer], valueStart + patch * valueSize, accessor.componentType))
    }
}

fun KotlinGltf.readFloats(accessorIndex: Int, elementIndex: Int, destination: MutFloats) {
    val accessor = accessors[accessorIndex]
    require(elementIndex in 0..<accessor.count)
    val components = componentCount(accessor.type)
    require(destination.size >= components)
    val location = elementLocation(accessor, elementIndex)
    val viewIndex = if (location < 0) GLTF_MISSING_INDEX else (location ushr Int.SIZE_BITS).toInt()
    val offset = location.toInt()
    if (viewIndex < 0) destination.fill(0f, 0, components) else {
        val view = bufferViews[viewIndex]
        val bytes = bufferSources[view.buffer]
        val start = bufferOffsets[view.buffer] + view.offset + offset
        repeat(components) { component ->
            destination[component] =
                readFloat(
                    bytes,
                    start + componentOffset(accessor, component),
                    accessor.componentType,
                    accessor.normalized
                )
        }
    }
}

fun KotlinGltf.readUInts(accessorIndex: Int, elementIndex: Int, destination: MutInts) {
    val accessor = accessors[accessorIndex]
    require(
        accessor.type in GLTF_TYPE_SCALAR..GLTF_TYPE_VEC4 && accessor.componentType != GLTF_COMPONENT_FLOAT &&
                elementIndex in 0..<accessor.count
    )
    val count = componentCount(accessor.type)
    require(destination.size >= count)
    val location = elementLocation(accessor, elementIndex)
    if (location < 0) {
        destination.fill(0, 0, count); return
    }
    val viewIndex = (location ushr Int.SIZE_BITS).toInt()
    val offset = location.toInt()
    val view = bufferViews[viewIndex]
    val bytes = bufferSources[view.buffer]
    val start = bufferOffsets[view.buffer] + view.offset + offset
    val size = componentSize(accessor.componentType)
    repeat(count) { component ->
        val address = start + component * size
        destination[component] = when (accessor.componentType) {
            GLTF_COMPONENT_BYTE -> bytes[address].toInt()
            GLTF_COMPONENT_SHORT -> (shortViewHandle.get(bytes, address) as Short).toInt()
            else -> readUnsigned(bytes, address, accessor.componentType).toInt()
        }
    }
}

fun KotlinGltf.readIndex(accessorIndex: Int, elementIndex: Int): Long {
    val accessor = accessors[accessorIndex]
    require(
        accessor.type == GLTF_TYPE_SCALAR && !accessor.normalized &&
                (accessor.componentType == GLTF_COMPONENT_UNSIGNED_BYTE || accessor.componentType == GLTF_COMPONENT_UNSIGNED_SHORT || accessor.componentType == GLTF_COMPONENT_UNSIGNED_INT) &&
                elementIndex in 0..<accessor.count
    )
    val location = elementLocation(accessor, elementIndex)
    if (location < 0) return 0L
    val view = bufferViews[(location ushr Int.SIZE_BITS).toInt()]
    return readUnsigned(
        bufferSources[view.buffer],
        bufferOffsets[view.buffer] + view.offset + location.toInt(),
        accessor.componentType
    )
}

private fun KotlinGltf.elementLocation(accessor: KAccessor, index: Int): Long {
    accessor.sparse?.let { sparse ->
        val view = bufferViews[sparse.indicesBufferView]
        val bytes = bufferSources[view.buffer]
        val start = bufferOffsets[view.buffer] + view.offset + sparse.indicesOffset
        val size = componentSize(sparse.indicesComponentType)
        var low = 0
        var high = sparse.count - 1
        while (low <= high) {
            val mid = (low + high) ushr 1
            val candidate = readUnsigned(bytes, start + mid * size, sparse.indicesComponentType)
            if (candidate == index.toLong()) return (sparse.valuesBufferView.toLong() shl Int.SIZE_BITS) or
                    ((sparse.valuesOffset + mid * elementSize(
                        accessor.type,
                        accessor.componentType
                    )).toLong() and UNSIGNED_INT_MASK)
            if (candidate < index) low = mid + 1 else high = mid - 1
        }
    }
    return if (accessor.bufferView < 0) MISSING_ELEMENT_LOCATION else (accessor.bufferView.toLong() shl Int.SIZE_BITS) or
            ((accessor.offset + index * accessor.stride).toLong() and UNSIGNED_INT_MASK)
}

fun KotlinGltf.findAccessor(mesh: Int, primitive: Int, semantic: Int, set: Int = 0): Int {
    for (attribute in meshes[mesh].primitives[primitive].attributes)
        if (attribute.semantic == semantic && attribute.set == set) return attribute.accessor
    return GLTF_MISSING_INDEX
}

fun KotlinGltf.bufferViewBytes(index: Int): ByteBuffer {
    val view = bufferViews[index]
    return ByteBuffer.wrap(bufferSources[view.buffer], bufferOffsets[view.buffer] + view.offset, view.byteLength)
        .slice().asReadOnlyBuffer().order(ByteOrder.LITTLE_ENDIAN)
}

private fun unpackPacked(bytes: Bytes, start: Int, count: Int, type: Int, normalized: Boolean, out: MutFloats) {
    var offset = start
    when (type) {
        GLTF_COMPONENT_BYTE -> {
            val divisor = if (normalized) SIGNED_BYTE_MAX else 1f
            repeat(count) {
                out[it] = if (normalized) maxOf(-1f, bytes[offset++].toFloat() / divisor) else bytes[offset++].toFloat()
            }
        }

        GLTF_COMPONENT_UNSIGNED_BYTE -> {
            val divisor = if (normalized) UNSIGNED_BYTE_MAX else 1f
            repeat(count) { out[it] = (bytes[offset++].toInt() and UNSIGNED_BYTE_MASK).toFloat() / divisor }
        }

        GLTF_COMPONENT_SHORT -> {
            val divisor = if (normalized) SIGNED_SHORT_MAX else 1f
            repeat(count) {
                val value = (shortViewHandle.get(bytes, offset) as Short).toFloat()
                out[it] = if (normalized) maxOf(-1f, value / divisor) else value
                offset += Short.SIZE_BYTES
            }
        }

        GLTF_COMPONENT_UNSIGNED_SHORT -> {
            val divisor = if (normalized) UNSIGNED_SHORT_MAX else 1f
            repeat(count) {
                out[it] =
                    ((shortViewHandle.get(bytes, offset) as Short).toInt() and UNSIGNED_SHORT_MASK).toFloat() / divisor
                offset += Short.SIZE_BYTES
            }
        }

        GLTF_COMPONENT_UNSIGNED_INT -> {
            if (normalized) out.fill(0f, 0, count) else repeat(count) {
                out[it] = ((intViewHandle.get(bytes, offset) as Int).toLong() and UNSIGNED_INT_MASK).toFloat()
                offset += Int.SIZE_BYTES
            }
        }

        else -> error("Invalid packed accessor component type")
    }
}

private fun componentOffset(accessor: KAccessor, component: Int): Int {
    val size = componentSize(accessor.componentType)
    val rows = when (accessor.type) {
        GLTF_TYPE_MAT2 -> MAT2_ROWS
        GLTF_TYPE_MAT3 -> MAT3_ROWS
        GLTF_TYPE_MAT4 -> MAT4_ROWS
        else -> return component * size
    }
    return (component / rows) * ((rows * size + MATRIX_COLUMN_ALIGNMENT - 1) and -MATRIX_COLUMN_ALIGNMENT) +
            (component % rows) * size
}

private fun readFloat(bytes: Bytes, offset: Int, type: Int, normalized: Boolean): Float = when (type) {
    GLTF_COMPONENT_FLOAT -> Float.fromBits(intViewHandle.get(bytes, offset) as Int)
    GLTF_COMPONENT_BYTE -> if (normalized) maxOf(-1f, bytes[offset] / SIGNED_BYTE_MAX) else bytes[offset].toFloat()
    GLTF_COMPONENT_UNSIGNED_BYTE -> {
        val value = bytes[offset].toInt() and UNSIGNED_BYTE_MASK
        if (normalized) value / UNSIGNED_BYTE_MAX else value.toFloat()
    }

    GLTF_COMPONENT_SHORT -> {
        val value = shortViewHandle.get(bytes, offset) as Short
        if (normalized) maxOf(-1f, value / SIGNED_SHORT_MAX) else value.toFloat()
    }

    GLTF_COMPONENT_UNSIGNED_SHORT -> {
        val value = (shortViewHandle.get(bytes, offset) as Short).toInt() and UNSIGNED_SHORT_MASK
        if (normalized) value / UNSIGNED_SHORT_MAX else value.toFloat()
    }

    GLTF_COMPONENT_UNSIGNED_INT -> if (normalized) 0f else
        ((intViewHandle.get(bytes, offset) as Int).toLong() and UNSIGNED_INT_MASK).toFloat()

    else -> error("Invalid component type")
}
