package com.varlanv.klab.glb.kotlin

import com.varlanv.klab.intViewHandle
import com.varlanv.klab.shortViewHandle
import java.nio.ByteBuffer
import java.nio.ByteOrder

fun KotlinGltf.copyFloatsTo(accessorIndex: Int, destination: FloatArray) {
    val accessor = accessors[accessorIndex]
    val components = componentCount(accessor.type)
    val total = Math.multiplyExact(accessor.count, components)
    require(destination.size >= total) { "Output is too small" }
    if (accessor.bufferView < 0) destination.fill(0f, 0, total) else {
        val view = bufferViews[accessor.bufferView]
        val bytes = bufferSources[view.buffer]
        val start = bufferOffsets[view.buffer] + view.offset + accessor.offset
        if (accessor.componentType == 5126 && accessor.stride == components * 4) {
            ByteBuffer.wrap(bytes, start, total * 4).order(ByteOrder.LITTLE_ENDIAN).asFloatBuffer().get(destination, 0, total)
        } else if (accessor.type <= 4 && accessor.stride == components * componentSize(accessor.componentType)) {
            unpackPacked(bytes, start, total, accessor.componentType, accessor.normalized, destination)
        } else {
            var output = 0
            var element = start
            repeat(accessor.count) {
                var component = 0
                while (component < components) {
                    destination[output++] = readFloat(bytes, element + componentOffset(accessor, component), accessor.componentType, accessor.normalized)
                    component++
                }
                element += accessor.stride
            }
        }
    }
    val sparse = accessor.sparse ?: return
    val indices = bufferViews[sparse.indicesBufferView]
    val values = bufferViews[sparse.valuesBufferView]
    val indexBytes = bufferSources[indices.buffer]
    val valueBytes = bufferSources[values.buffer]
    val indexStart = bufferOffsets[indices.buffer] + indices.offset + sparse.indicesOffset
    val valueStart = bufferOffsets[values.buffer] + values.offset + sparse.valuesOffset
    val indexSize = componentSize(sparse.indicesComponentType)
    val size = elementSize(accessor.type, accessor.componentType)
    repeat(sparse.count) { patch ->
        val output = readUnsigned(indexBytes, indexStart + patch * indexSize, sparse.indicesComponentType).toInt() * components
        repeat(components) { component ->
            destination[output + component] = readFloat(valueBytes, valueStart + patch * size + componentOffset(accessor, component), accessor.componentType, accessor.normalized)
        }
    }
}

fun KotlinGltf.copyIndicesTo(accessorIndex: Int, destination: IntArray) {
    val accessor = accessors[accessorIndex]
    require(accessor.type == 1 && (accessor.componentType == 5121 || accessor.componentType == 5123 || accessor.componentType == 5125)) { "Indices must be unsigned scalars" }
    require(destination.size >= accessor.count) { "Output is too small" }
    check(accessor.sparse == null) { "Sparse index conversion is not supported by cgltf" }
    if (accessor.bufferView < 0) destination.fill(0, 0, accessor.count) else {
        val view = bufferViews[accessor.bufferView]
        val bytes = bufferSources[view.buffer]
        var offset = bufferOffsets[view.buffer] + view.offset + accessor.offset
        if (vectorized && vectorAvailable && accessor.count >= 64) {
            if (accessor.componentType == 5123 && accessor.stride == 2) {
                GltfIndexDecoder.copyShorts(bytes, offset, accessor.count, destination)
                return
            }
            if (accessor.componentType == 5121 && accessor.stride == 1) {
                GltfIndexDecoder.copyBytes(bytes, offset, accessor.count, destination)
                return
            }
        }
        when (accessor.componentType) {
            5121 -> repeat(accessor.count) { destination[it] = bytes[offset].toInt() and 255; offset += accessor.stride }
            5123 -> repeat(accessor.count) {
                destination[it] = (shortViewHandle.get(bytes, offset) as Short).toInt() and 65535
                offset += accessor.stride
            }
            5125 -> if (accessor.stride == 4) {
                ByteBuffer.wrap(bytes, offset, accessor.count * 4).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer().get(destination, 0, accessor.count)
            } else repeat(accessor.count) {
                destination[it] = intViewHandle.get(bytes, offset) as Int
                offset += accessor.stride
            }
        }
    }
}

fun KotlinGltf.copyIndicesTo(accessorIndex: Int, destination: ShortArray) {
    val accessor = accessors[accessorIndex]
    require(accessor.type == 1 && (accessor.componentType == 5121 || accessor.componentType == 5123))
    require(destination.size >= accessor.count)
    check(accessor.sparse == null)
    if (accessor.bufferView < 0) { destination.fill(0, 0, accessor.count); return }
    val view = bufferViews[accessor.bufferView]
    val bytes = bufferSources[view.buffer]
    var offset = bufferOffsets[view.buffer] + view.offset + accessor.offset
    if (accessor.componentType == 5123 && accessor.stride == 2) {
        ByteBuffer.wrap(bytes, offset, accessor.count * 2).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(destination, 0, accessor.count)
    } else repeat(accessor.count) {
        destination[it] = readUnsigned(bytes, offset, accessor.componentType).toShort()
        offset += accessor.stride
    }
}

fun KotlinGltf.copyIndicesTo(accessorIndex: Int, destination: ByteArray) {
    val accessor = accessors[accessorIndex]
    require(accessor.type == 1 && accessor.componentType == 5121 && destination.size >= accessor.count)
    check(accessor.sparse == null)
    if (accessor.bufferView < 0) { destination.fill(0, 0, accessor.count); return }
    val view = bufferViews[accessor.bufferView]
    val bytes = bufferSources[view.buffer]
    var offset = bufferOffsets[view.buffer] + view.offset + accessor.offset
    if (accessor.stride == 1) bytes.copyInto(destination, 0, offset, offset + accessor.count)
    else repeat(accessor.count) { destination[it] = bytes[offset]; offset += accessor.stride }
}

fun KotlinGltf.readFloats(accessorIndex: Int, elementIndex: Int, destination: FloatArray) {
    val accessor = accessors[accessorIndex]
    require(elementIndex in 0..<accessor.count)
    val components = componentCount(accessor.type)
    require(destination.size >= components)
    val location = elementLocation(accessor, elementIndex)
    val viewIndex = if (location < 0) -1 else (location ushr 32).toInt()
    val offset = location.toInt()
    if (viewIndex < 0) destination.fill(0f, 0, components) else {
        val view = bufferViews[viewIndex]
        val bytes = bufferSources[view.buffer]
        val start = bufferOffsets[view.buffer] + view.offset + offset
        repeat(components) { component -> destination[component] =
            readFloat(bytes, start + componentOffset(accessor, component), accessor.componentType, accessor.normalized) }
    }
}

fun KotlinGltf.readUInts(accessorIndex: Int, elementIndex: Int, destination: IntArray) {
    val accessor = accessors[accessorIndex]
    require(accessor.type in 1..4 && accessor.componentType != 5126 && elementIndex in 0..<accessor.count)
    val count = componentCount(accessor.type)
    require(destination.size >= count)
    val location = elementLocation(accessor, elementIndex)
    if (location < 0) { destination.fill(0, 0, count); return }
    val viewIndex = (location ushr 32).toInt()
    val offset = location.toInt()
    val view = bufferViews[viewIndex]
    val bytes = bufferSources[view.buffer]
    val start = bufferOffsets[view.buffer] + view.offset + offset
    val size = componentSize(accessor.componentType)
    repeat(count) { component ->
        val address = start + component * size
        destination[component] = when (accessor.componentType) {
            5120 -> bytes[address].toInt()
            5122 -> (shortViewHandle.get(bytes, address) as Short).toInt()
            else -> readUnsigned(bytes, address, accessor.componentType).toInt()
        }
    }
}

fun KotlinGltf.readIndex(accessorIndex: Int, elementIndex: Int): Long {
    val accessor = accessors[accessorIndex]
    require(accessor.type == 1 && elementIndex in 0..<accessor.count)
    val location = elementLocation(accessor, elementIndex)
    if (location < 0) return 0L
    val view = bufferViews[(location ushr 32).toInt()]
    return readUnsigned(bufferSources[view.buffer], bufferOffsets[view.buffer] + view.offset + location.toInt(), accessor.componentType)
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
            if (candidate == index.toLong()) return (sparse.valuesBufferView.toLong() shl 32) or
                ((sparse.valuesOffset + mid * elementSize(accessor.type, accessor.componentType)).toLong() and 0xffffffffL)
            if (candidate < index) low = mid + 1 else high = mid - 1
        }
    }
    return if (accessor.bufferView < 0) -1L else (accessor.bufferView.toLong() shl 32) or
        ((accessor.offset + index * accessor.stride).toLong() and 0xffffffffL)
}

fun KotlinGltf.findAccessor(mesh: Int, primitive: Int, semantic: Int, set: Int = 0): Int {
    for (attribute in meshes[mesh].primitives[primitive].attributes)
        if (attribute.semantic == semantic && attribute.set == set) return attribute.accessor
    return -1
}

fun KotlinGltf.bufferViewBytes(index: Int): ByteBuffer {
    val view = bufferViews[index]
    return ByteBuffer.wrap(bufferSources[view.buffer], bufferOffsets[view.buffer] + view.offset, view.byteLength).slice().asReadOnlyBuffer()
}

private fun unpackPacked(bytes: ByteArray, start: Int, count: Int, type: Int, normalized: Boolean, out: FloatArray) {
    var offset = start
    when (type) {
        5120 -> {
            val divisor = if (normalized) 127f else 1f
            repeat(count) { out[it] = bytes[offset++].toFloat() / divisor }
        }
        5121 -> {
            val divisor = if (normalized) 255f else 1f
            repeat(count) { out[it] = (bytes[offset++].toInt() and 255).toFloat() / divisor }
        }
        5122 -> {
            val divisor = if (normalized) 32767f else 1f
            repeat(count) {
                out[it] = (shortViewHandle.get(bytes, offset) as Short).toFloat() / divisor
                offset += 2
            }
        }
        5123 -> {
            val divisor = if (normalized) 65535f else 1f
            repeat(count) {
                out[it] = ((shortViewHandle.get(bytes, offset) as Short).toInt() and 65535).toFloat() / divisor
                offset += 2
            }
        }
        5125 -> {
            if (normalized) out.fill(0f, 0, count) else repeat(count) {
                out[it] = ((intViewHandle.get(bytes, offset) as Int).toLong() and 0xffffffffL).toFloat()
                offset += 4
            }
        }
        else -> error("Invalid packed accessor component type")
    }
}

private fun componentOffset(accessor: KAccessor, component: Int): Int {
    val size = componentSize(accessor.componentType)
    val rows = when (accessor.type) { 5 -> 2; 6 -> 3; 7 -> 4; else -> return component * size }
    return (component / rows) * ((rows * size + 3) and -4) + (component % rows) * size
}

private fun readFloat(bytes: ByteArray, offset: Int, type: Int, normalized: Boolean): Float = when (type) {
    5126 -> Float.fromBits(intViewHandle.get(bytes, offset) as Int)
    5120 -> if (normalized) bytes[offset] / 127f else bytes[offset].toFloat()
    5121 -> if (normalized) (bytes[offset].toInt() and 255) / 255f else (bytes[offset].toInt() and 255).toFloat()
    5122 -> {
        val value = shortViewHandle.get(bytes, offset) as Short
        if (normalized) value / 32767f else value.toFloat()
    }
    5123 -> {
        val value = (shortViewHandle.get(bytes, offset) as Short).toInt() and 65535
        if (normalized) value / 65535f else value.toFloat()
    }
    5125 -> if (normalized) 0f else ((intViewHandle.get(bytes, offset) as Int).toLong() and 0xffffffffL).toFloat()
    else -> error("Invalid component type")
}
