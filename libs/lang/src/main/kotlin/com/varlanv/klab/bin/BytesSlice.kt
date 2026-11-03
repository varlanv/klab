@file:Suppress("NOTHING_TO_INLINE")

package com.varlanv.klab.bin

import com.varlanv.klab.collections.*
import java.util.*

class BytesSlice(
    val bytes: Bytes,
    val offset: Int,
    val len: Int,
) {
    init {
        require(offset >= 0 && len >= 0 && offset <= bytes.size - len)
    }

    inline fun getPackedInt(idx: Int): Int {
        require(idx >= 0 && idx <= len - Int.SIZE_BYTES)
        return bytes.getPackedInt(offset + idx)
    }

    inline fun getPackedLong(idx: Int): Long {
        require(idx >= 0 && idx <= len - Long.SIZE_BYTES)
        return bytes.getPackedLong(offset + idx)
    }

    inline fun getPackedShort(idx: Int): Short {
        require(idx >= 0 && idx <= len - Short.SIZE_BYTES)
        return bytes.getPackedShort(offset + idx)
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

    inline operator fun get(idx: Int): Byte {
        require(idx in 0..<len)
        return bytes[offset + idx]
    }

    inline fun cloneSlice(): MutBytes {
        val res = MutBytes(len)
        bytes.copyInto(destination = res, destinationOffset = 0, startIndex = offset, endIndex = len)
        return res
    }

    override fun equals(other: Any?): Boolean =
        other is BytesSlice &&
                Arrays.mismatch(
                    bytes,
                    offset,
                    len + offset,
                    other.bytes,
                    other.offset,
                    other.offset + other.len,
                ) == -1

    override fun hashCode(): Int = BytesHash.target.hash(bytes = bytes, start = offset, end = len)

    companion object {
        val empty: BytesSlice = BytesSlice(bytes = stableEmptyBytes, offset = 0, len = 0)
    }
}
