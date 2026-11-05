@file:Suppress("NOTHING_TO_INLINE")

package com.varlanv.klab.collections

import com.varlanv.klab.collections.*
import java.util.*

sealed class BytesSliceBase(
    val bytes: Bytes,
    val offset: Int,
    val len: Int,
) {
    init {
        assert(offset >= 0 && len >= 0 && offset <= bytes.size - len)
    }

    inline operator fun get(idx: Int): Byte {
        assert(idx in 0..< len)
        return bytes[offset + idx]
    }

    inline fun getPackedInt(idx: Int): Int {
        assert(idx >= 0 && idx <= len - Int.SIZE_BYTES)
        return bytes.getPackedInt(offset + idx)
    }

    inline fun getPackedLong(idx: Int): Long {
        assert(idx >= 0 && idx <= len - Long.SIZE_BYTES)
        return bytes.getPackedLong(offset + idx)
    }

    inline fun getPackedShort(idx: Int): Short {
        assert(idx >= 0 && idx <= len - Short.SIZE_BYTES)
        return bytes.getPackedShort(offset + idx)
    }

    inline fun getPackedFloat(idx: Int): Float {
        assert(idx >= 0 && idx <= len - Float.SIZE_BYTES)
        return bytes.getPackedFloat(offset + idx)
    }

    inline fun getPackedDouble(idx: Int): Double {
        assert(idx >= 0 && idx <= len - Double.SIZE_BYTES)
        return bytes.getPackedDouble(offset + idx)
    }

    inline fun forEach(block: (Byte) -> Unit) {
        val limit = offset + len
        for (idx in offset until limit) {
            block(bytes[idx])
        }
    }

    inline fun forEachIndexed(block: (idx: Int, Byte) -> Unit) {
        val limit = offset + len
        for (idx in offset until limit) {
            block(idx - offset, bytes[idx])
        }
    }

    inline fun cloneSlice(): MutBytes {
        val res = MutBytes(len)
        bytes.copyInto(res, 0, offset, offset + len)
        return res
    }

    override fun equals(other: Any?): Boolean =
        other is BytesSliceBase &&
            Arrays.mismatch(bytes, offset, len + offset, other.bytes, other.offset, other.offset + other.len) == -1

    override fun hashCode(): Int = BytesHash.target.hash(bytes = bytes, start = offset, end = offset + len)
}

class BytesSlice(
    bytes: Bytes,
    offset: Int,
    len: Int,
) : BytesSliceBase(bytes, offset, len) {
    companion object {
        val empty: BytesSlice = BytesSlice(bytes = stableEmptyBytes, offset = 0, len = 0)
    }
}

class MutBytesSlice(
    bytes: MutBytes,
    offset: Int,
    len: Int,
) : BytesSliceBase(bytes, offset, len) {
    inline operator fun set(idx: Int, value: Byte) {
        assert(idx in 0..< len)
        bytes[offset + idx] = value
    }

    inline fun setPackedInt(idx: Int, value: Int) {
        assert(idx >= 0 && idx <= len - Int.SIZE_BYTES)
        bytes.setPackedInt(idx = offset + idx, value = value)
    }

    inline fun setPackedLong(idx: Int, value: Long) {
        assert(idx >= 0 && idx <= len - Long.SIZE_BYTES)
        bytes.setPackedLong(idx = offset + idx, value = value)
    }

    inline fun setPackedShort(idx: Int, value: Short) {
        assert(idx >= 0 && idx <= len - Short.SIZE_BYTES)
        bytes.setPackedShort(idx = offset + idx, value = value)
    }

    inline fun setPackedFloat(idx: Int, value: Float) {
        assert(idx >= 0 && idx <= len - Float.SIZE_BYTES)
        bytes.setPackedFloat(idx = offset + idx, value = value)
    }

    inline fun setPackedDouble(idx: Int, value: Double) {
        assert(idx >= 0 && idx <= len - Double.SIZE_BYTES)
        bytes.setPackedDouble(idx = offset + idx, value = value)
    }

    inline fun asInts(): MutIntsBytesSlice = MutIntsBytesSlice(this)

    inline fun asLongs(): MutLongBytesSlice = MutLongBytesSlice(this)

    companion object {
        val empty: MutBytesSlice = MutBytesSlice(bytes = stableEmptyBytes, offset = 0, len = 0)
    }
}

@JvmInline
value class MutIntsBytesSlice(@PublishedApi internal val bytes: MutBytesSlice) {
    val len get() = bytes.len / Int.SIZE_BYTES

    inline operator fun set(idx: Int, value: Int) {
        assert(idx in 0..< len)
        bytes.bytes.setPackedInt(idx = bytes.offset + idx * Int.SIZE_BYTES, value = value)
    }

    inline operator fun get(idx: Int): Int {
        assert(idx in 0..< len)
        return bytes.bytes.getPackedInt(bytes.offset + idx * Int.SIZE_BYTES)
    }
}

@JvmInline
value class MutLongBytesSlice(@PublishedApi internal val bytes: MutBytesSlice) {
    val len get() = bytes.len / Long.SIZE_BYTES

    inline operator fun set(idx: Int, value: Long) {
        assert(idx in 0..< len)
        bytes.bytes.setPackedLong(idx = bytes.offset + idx * Long.SIZE_BYTES, value = value)
    }

    inline operator fun get(idx: Int): Long {
        assert(idx in 0..< len)
        return bytes.bytes.getPackedLong(bytes.offset + idx * Long.SIZE_BYTES)
    }
}
