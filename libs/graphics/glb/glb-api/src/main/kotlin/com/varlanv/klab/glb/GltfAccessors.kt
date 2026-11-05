package com.varlanv.klab.glb

import com.varlanv.klab.collections.*
import com.varlanv.klab.vector.intViewHandle
import com.varlanv.klab.vector.shortViewHandle
import java.nio.ByteBuffer
import java.nio.ByteOrder

internal const val MIN_VECTOR_INDEX_COUNT = 64
internal const val UNSIGNED_BYTE_MASK = 0xff
internal const val UNSIGNED_SHORT_MASK = 0xffff
internal const val UNSIGNED_INT_MASK = 0xffffffffL
internal const val SIGNED_BYTE_MAX = 127f
internal const val UNSIGNED_BYTE_MAX = 255f
internal const val SIGNED_SHORT_MAX = 32767f
internal const val UNSIGNED_SHORT_MAX = 65535f
internal const val MAT2_ROWS = 2
internal const val MAT3_ROWS = 3
internal const val MAT4_ROWS = 4
internal const val MISSING_ELEMENT_LOCATION = -1L

fun KGltf.copyFloatsTo(accessorIndex: Int, destination: MutFloats) {
    val accessor = accessors[accessorIndex]
    val components = accessor.type.componentCount()
    val total = Math.multiplyExact(accessor.count, components)
    require(destination.size >= total) { "Output is too small" }
    if (accessor.bufferView < 0) {
        destination.fill(0f, 0, total)
    } else {
        val view = bufferViews[accessor.bufferView]
        val bytes = bufferSources[view.buffer]
        val start = bufferOffsets[view.buffer] + view.offset + accessor.offset
        if (accessor.componentType.value == GLTF_COMPONENT_FLOAT && accessor.stride == components * Float.SIZE_BYTES) {
            copyPackedFloats(bytes = bytes, start = start, count = total, destination = destination)
        } else if (accessor.componentType.value == GLTF_COMPONENT_FLOAT) {
            copyStridedFloats(
                bytes = bytes,
                start = start,
                count = accessor.count,
                components = components,
                stride = accessor.stride,
                destination = destination,
            )
        } else if (accessor.type.value <= GLTF_TYPE_VEC4 &&
            accessor.stride == components * accessor.componentType.componentSize()) {
            unpackPacked(
                bytes = bytes,
                start = start,
                count = total,
                type = accessor.componentType,
                normalized = accessor.normalized,
                out = destination,
            )
        } else {
            var output = 0
            var element = start
            repeat(accessor.count) {
                var component = 0
                while (component < components) {
                    destination[output++] =
                        accessor.componentType.readFloat(
                            bytes = bytes,
                            offset = element + componentOffset(accessor = accessor, component = component),
                            normalized = accessor.normalized,
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
        val indexSize = sparse.indicesComponentType.componentSize()
        val size = accessor.type.elementSize(accessor.componentType)
        repeat(sparse.count) { patch ->
            val output =
                sparse.indicesComponentType
                    .readUnsigned(bytes = indexBytes, offset = indexStart + patch * indexSize)
                    .toInt() * components
            repeat(components) { component ->
                destination[output + component] =
                    accessor.componentType.readFloat(
                        bytes = valueBytes,
                        offset = valueStart +
                            patch * size +
                            componentOffset(accessor = accessor, component = component),
                        normalized = accessor.normalized,
                    )
            }
        }
    }
}

private fun copyPackedFloats(
    bytes: Bytes,
    start: Int,
    count: Int,
    destination: MutFloats,
) {
    ByteBuffer
        .wrap(bytes, start, count * Float.SIZE_BYTES)
        .order(ByteOrder.LITTLE_ENDIAN)
        .asFloatBuffer()
        .get(destination, 0, count)
}

private fun copyStridedFloats(
    bytes: Bytes,
    start: Int,
    count: Int,
    components: Int,
    stride: Int,
    destination: MutFloats,
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

fun KGltf.copyIndicesTo(accessorIndex: Int, destination: MutInts) {
    val accessor = accessors[accessorIndex]
    assert(
        accessor.type.value == GLTF_TYPE_SCALAR &&
            !accessor.normalized &&
            (accessor.componentType.value == GLTF_COMPONENT_UNSIGNED_BYTE ||
                accessor.componentType.value == GLTF_COMPONENT_UNSIGNED_SHORT ||
                accessor.componentType.value == GLTF_COMPONENT_UNSIGNED_INT),
    ) { "Indices must be unsigned scalars" }
    assert(destination.size >= accessor.count) { "Output is too small" }
    if (accessor.bufferView < 0) {
        destination.fill(0, 0, accessor.count)
    } else {
        val view = bufferViews[accessor.bufferView]
        val bytes = bufferSources[view.buffer]
        var offset = bufferOffsets[view.buffer] + view.offset + accessor.offset
        if (accessor.count >= MIN_VECTOR_INDEX_COUNT) {
            if (accessor.componentType.value == GLTF_COMPONENT_UNSIGNED_SHORT && accessor.stride == Short.SIZE_BYTES) {
                GltfIndexDecoder.copyShorts(bytes = bytes, start = offset, count = accessor.count, out = destination)
                sparseIndices(accessor) { index, value -> destination[index] = value.toInt() }
                return
            }
            if (accessor.componentType.value == GLTF_COMPONENT_UNSIGNED_BYTE && accessor.stride == Byte.SIZE_BYTES) {
                GltfIndexDecoder.copyBytes(bytes = bytes, start = offset, count = accessor.count, out = destination)
                sparseIndices(accessor) { index, value -> destination[index] = value.toInt() }
                return
            }
        }
        when (accessor.componentType.value) {
            GLTF_COMPONENT_UNSIGNED_BYTE -> repeat(accessor.count) {
                destination[it] = bytes[offset].toInt() and UNSIGNED_BYTE_MASK
                offset += accessor.stride
            }

            GLTF_COMPONENT_UNSIGNED_SHORT -> repeat(accessor.count) {
                destination[it] = (shortViewHandle.get(bytes, offset) as Short).toInt() and UNSIGNED_SHORT_MASK
                offset += accessor.stride
            }

            GLTF_COMPONENT_UNSIGNED_INT -> if (accessor.stride == Int.SIZE_BYTES) {
                ByteBuffer
                    .wrap(bytes, offset, accessor.count * Int.SIZE_BYTES)
                    .order(ByteOrder.LITTLE_ENDIAN)
                    .asIntBuffer()
                    .get(destination, 0, accessor.count)
            } else {
                repeat(accessor.count) {
                    destination[it] = intViewHandle.get(bytes, offset) as Int
                    offset += accessor.stride
                }
            }
        }
    }
    sparseIndices(accessor) { index, value -> destination[index] = value.toInt() }
}

fun KGltf.copyIndicesTo(accessorIndex: Int, destination: MutShorts) {
    val accessor = accessors[accessorIndex]
    assert(
        accessor.type.value == GLTF_TYPE_SCALAR &&
            !accessor.normalized &&
            (accessor.componentType.value == GLTF_COMPONENT_UNSIGNED_BYTE ||
                accessor.componentType.value == GLTF_COMPONENT_UNSIGNED_SHORT),
    )
    assert(destination.size >= accessor.count)
    if (accessor.bufferView < 0) {
        destination.fill(0, 0, accessor.count)
        sparseIndices(accessor) { index, value -> destination[index] = value.toShort() }
        return
    }
    val view = bufferViews[accessor.bufferView]
    val bytes = bufferSources[view.buffer]
    var offset = bufferOffsets[view.buffer] + view.offset + accessor.offset
    if (accessor.componentType.value == GLTF_COMPONENT_UNSIGNED_SHORT && accessor.stride == Short.SIZE_BYTES) {
        ByteBuffer
            .wrap(bytes, offset, accessor.count * Short.SIZE_BYTES)
            .order(ByteOrder.LITTLE_ENDIAN)
            .asShortBuffer()
            .get(destination, 0, accessor.count)
    } else {
        repeat(accessor.count) {
            destination[it] = accessor.componentType.readUnsigned(bytes = bytes, offset = offset).toShort()
            offset += accessor.stride
        }
    }
    sparseIndices(accessor) { index, value -> destination[index] = value.toShort() }
}

fun KGltf.copyIndicesTo(accessorIndex: Int, destination: MutBytes) {
    val accessor = accessors[accessorIndex]
    assert(
        accessor.type.value == GLTF_TYPE_SCALAR &&
            !accessor.normalized &&
            accessor.componentType.value == GLTF_COMPONENT_UNSIGNED_BYTE &&
            destination.size >= accessor.count,
    )
    if (accessor.bufferView < 0) {
        destination.fill(0, 0, accessor.count)
        sparseIndices(accessor) { index, value -> destination[index] = value.toByte() }
        return
    }
    val view = bufferViews[accessor.bufferView]
    val bytes = bufferSources[view.buffer]
    var offset = bufferOffsets[view.buffer] + view.offset + accessor.offset
    if (accessor.stride == Byte.SIZE_BYTES) {
        bytes.copyInto(destination, 0, offset, offset + accessor.count)
    } else {
        repeat(accessor.count) {
            destination[it] = bytes[offset]
            offset += accessor.stride
        }
    }
    sparseIndices(accessor) { index, value -> destination[index] = value.toByte() }
}

private inline fun KGltf.sparseIndices(accessor: KAccessor, write: (Int, Long) -> Unit) {
    val sparse = accessor.sparse ?: return
    val indices = bufferViews[sparse.indicesBufferView]
    val values = bufferViews[sparse.valuesBufferView]
    val indexStart = bufferOffsets[indices.buffer] + indices.offset + sparse.indicesOffset
    val valueStart = bufferOffsets[values.buffer] + values.offset + sparse.valuesOffset
    val indexSize = sparse.indicesComponentType.componentSize()
    val valueSize = accessor.componentType.componentSize()
    repeat(sparse.count) { patch ->
        val index = sparse.indicesComponentType
            .readUnsigned(bytes = bufferSources[indices.buffer], offset = indexStart + patch * indexSize)
            .toInt()
        write(
            index,
            accessor.componentType.readUnsigned(
                bytes = bufferSources[values.buffer],
                offset = valueStart + patch * valueSize,
            ),
        )
    }
}

fun KGltf.readFloats(
    accessorIndex: Int,
    elementIndex: Int,
    destination: MutFloats,
) {
    val accessor = accessors[accessorIndex]
    require(elementIndex in 0..< accessor.count)
    val components = accessor.type.componentCount()
    require(destination.size >= components)
    val location = elementLocation(accessor = accessor, index = elementIndex)
    val viewIndex = if (location < 0) {
        GLTF_MISSING_INDEX
    } else {
        (location ushr Int.SIZE_BITS).toInt()
    }
    val offset = location.toInt()
    if (viewIndex < 0) {
        destination.fill(0f, 0, components)
    } else {
        val view = bufferViews[viewIndex]
        val bytes = bufferSources[view.buffer]
        val start = bufferOffsets[view.buffer] + view.offset + offset
        repeat(components) { component ->
            destination[component] =
                accessor.componentType.readFloat(
                    bytes = bytes,
                    offset = start + componentOffset(accessor = accessor, component = component),
                    normalized = accessor.normalized,
                )
        }
    }
}

fun KGltf.readUInts(
    accessorIndex: Int,
    elementIndex: Int,
    destination: MutInts,
) {
    val accessor = accessors[accessorIndex]
    assert(
        accessor.type.value in GLTF_TYPE_SCALAR..GLTF_TYPE_VEC4 &&
            accessor.componentType.value != GLTF_COMPONENT_FLOAT &&
            elementIndex in 0..< accessor.count,
    )
    val count = accessor.type.componentCount()
    assert(destination.size >= count)
    val location = elementLocation(accessor = accessor, index = elementIndex)
    if (location < 0) {
        destination.fill(0, 0, count)
        return
    }
    val viewIndex = (location ushr Int.SIZE_BITS).toInt()
    val offset = location.toInt()
    val view = bufferViews[viewIndex]
    val bytes = bufferSources[view.buffer]
    val start = bufferOffsets[view.buffer] + view.offset + offset
    val size = accessor.componentType.componentSize()
    repeat(count) { component ->
        val address = start + component * size
        destination[component] = when (accessor.componentType.value) {
            GLTF_COMPONENT_BYTE -> bytes[address].toInt()
            GLTF_COMPONENT_SHORT -> (shortViewHandle.get(bytes, address) as Short).toInt()
            else -> accessor.componentType.readUnsigned(bytes = bytes, offset = address).toInt()
        }
    }
}

fun KGltf.readIndex(accessorIndex: Int, elementIndex: Int): Long {
    val accessor = accessors[accessorIndex]
    assert(
        accessor.type.value == GLTF_TYPE_SCALAR &&
            !accessor.normalized &&
            (accessor.componentType.value == GLTF_COMPONENT_UNSIGNED_BYTE ||
                accessor.componentType.value == GLTF_COMPONENT_UNSIGNED_SHORT ||
                accessor.componentType.value == GLTF_COMPONENT_UNSIGNED_INT) &&
            elementIndex in 0..< accessor.count,
    )
    val location = elementLocation(accessor = accessor, index = elementIndex)
    if (location < 0) {
        return 0L
    }
    val view = bufferViews[(location ushr Int.SIZE_BITS).toInt()]
    return accessor.componentType.readUnsigned(
        bytes = bufferSources[view.buffer],
        offset = bufferOffsets[view.buffer] + view.offset + location.toInt(),
    )
}

private fun KGltf.elementLocation(accessor: KAccessor, index: Int): Long {
    accessor.sparse?.let { sparse ->
        val view = bufferViews[sparse.indicesBufferView]
        val bytes = bufferSources[view.buffer]
        val start = bufferOffsets[view.buffer] + view.offset + sparse.indicesOffset
        val size = sparse.indicesComponentType.componentSize()
        var low = 0
        var high = sparse.count - 1
        while (low <= high) {
            val mid = (low + high) ushr 1
            val candidate = sparse.indicesComponentType.readUnsigned(bytes = bytes, offset = start + mid * size)
            if (candidate == index.toLong()) {
                return (sparse.valuesBufferView.toLong() shl Int.SIZE_BITS) or
                    ((sparse.valuesOffset + mid * accessor.type.elementSize(accessor.componentType)).toLong() and
                        UNSIGNED_INT_MASK)
            }
            if (candidate < index) {
                low = mid + 1
            } else {
                high = mid - 1
            }
        }
    }
    return if (accessor.bufferView < 0) {
        MISSING_ELEMENT_LOCATION
    } else {
        (accessor.bufferView.toLong() shl Int.SIZE_BITS) or
            ((accessor.offset + index * accessor.stride).toLong() and UNSIGNED_INT_MASK)
    }
}

fun KGltf.findAccessor(
    mesh: Int,
    primitive: Int,
    semantic: Int,
    set: Int = 0,
): Int {
    for (attribute in meshes[mesh].primitives[primitive].attributes)
    if (attribute.semantic == semantic && attribute.set == set) {
        return attribute.accessor
    }
    return GLTF_MISSING_INDEX
}

fun KGltf.bufferViewBytes(index: Int): ByteBuffer {
    val view = bufferViews[index]
    return ByteBuffer
        .wrap(bufferSources[view.buffer], bufferOffsets[view.buffer] + view.offset, view.byteLength)
        .slice()
        .asReadOnlyBuffer()
        .order(ByteOrder.LITTLE_ENDIAN)
}

private fun unpackPacked(
    bytes: Bytes,
    start: Int,
    count: Int,
    type: ComponentType,
    normalized: Boolean,
    out: MutFloats,
) {
    var offset = start
    when (type.value) {
        GLTF_COMPONENT_BYTE -> {
            val divisor = if (normalized) {
                SIGNED_BYTE_MAX
            } else {
                1f
            }
            repeat(count) {
                out[it] = if (normalized) {
                    maxOf(-1f, bytes[offset++].toFloat() / divisor)
                } else {
                    bytes[offset++].toFloat()
                }
            }
        }

        GLTF_COMPONENT_UNSIGNED_BYTE -> {
            val divisor = if (normalized) {
                UNSIGNED_BYTE_MAX
            } else {
                1f
            }
            repeat(count) { out[it] = (bytes[offset++].toInt() and UNSIGNED_BYTE_MASK).toFloat() / divisor }
        }

        GLTF_COMPONENT_SHORT -> {
            val divisor = if (normalized) {
                SIGNED_SHORT_MAX
            } else {
                1f
            }
            repeat(count) {
                val value = (shortViewHandle.get(bytes, offset) as Short).toFloat()
                out[it] = if (normalized) {
                    maxOf(-1f, value / divisor)
                } else {
                    value
                }
                offset += Short.SIZE_BYTES
            }
        }

        GLTF_COMPONENT_UNSIGNED_SHORT -> {
            val divisor = if (normalized) {
                UNSIGNED_SHORT_MAX
            } else {
                1f
            }
            repeat(count) {
                out[it] =
                    ((shortViewHandle.get(bytes, offset) as Short).toInt() and UNSIGNED_SHORT_MASK).toFloat() / divisor
                offset += Short.SIZE_BYTES
            }
        }

        GLTF_COMPONENT_UNSIGNED_INT -> {
            if (normalized) {
                out.fill(0f, 0, count)
            } else {
                repeat(count) {
                    out[it] = ((intViewHandle.get(bytes, offset) as Int).toLong() and UNSIGNED_INT_MASK).toFloat()
                    offset += Int.SIZE_BYTES
                }
            }
        }

        else -> {
            error("Invalid packed accessor component type")
        }
    }
}

private fun componentOffset(accessor: KAccessor, component: Int): Int {
    val size = accessor.componentType.componentSize()
    val rows = when (accessor.type.value) {
        GLTF_TYPE_MAT2 -> MAT2_ROWS
        GLTF_TYPE_MAT3 -> MAT3_ROWS
        GLTF_TYPE_MAT4 -> MAT4_ROWS
        else -> return component * size
    }
    return (component / rows) * ((rows * size + MATRIX_COLUMN_ALIGNMENT - 1) and -MATRIX_COLUMN_ALIGNMENT) +
        (component % rows) * size
}
