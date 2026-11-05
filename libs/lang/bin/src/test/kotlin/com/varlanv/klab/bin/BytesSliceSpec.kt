package com.varlanv.klab.bin

import com.varlanv.klab.collections.BytesSlice
import com.varlanv.klab.collections.MutBytes
import com.varlanv.klab.collections.MutBytesSlice
import com.varlanv.klab.testing.BaseSpec
import io.kotest.matchers.shouldBe

class BytesSliceSpec : BaseSpec({

    should("clone only the slice contents at any buffer offset") {
        // given slices at zero, nonzero, and end-of-buffer offsets
        val bytes = MutBytes(16) { it.toByte() }
        for (offset in listOf(0, 2, 12, 16)) {
            val len = minOf(4, bytes.size - offset)
            val slice = BytesSlice(bytes = bytes, offset = offset, len = len)

            // when cloning the slice
            val copy = slice.cloneSlice()

            // then copy exactly its contents into a separate buffer
            copy.toList() shouldBe bytes.toList().subList(fromIndex = offset, toIndex = offset + len)
            (copy === bytes) shouldBe false
        }
    }

    should("keep a cloned slice independent of later mutations") {
        // given a mutable slice in the middle of a buffer
        val bytes = MutBytes(8) { it.toByte() }
        val slice = MutBytesSlice(bytes = bytes, offset = 3, len = 2)

        // when cloning the slice and modifying the original
        val copy = slice.cloneSlice()
        slice[0] = 99

        // then preserve the original contents in the clone
        copy.toList() shouldBe listOf<Byte>(3, 4)
    }

    should("give equal slices the same hash regardless of their offsets") {
        // given equal mutable and immutable slices at different offsets and lengths
        for (len in listOf(0, 1, 4, 9, 128, 257)) {
            val expected = MutBytes(len) { (it * 73 - 128).toByte() }
            val padded = MutBytes(len + 8) { 99 }
            expected.copyInto(destination = padded, destinationOffset = 5)
            val first = BytesSlice(bytes = expected, offset = 0, len = len)
            val second = MutBytesSlice(bytes = padded, offset = 5, len = len)

            // expect equality and the same content-based hash for both slices
            (first == second) shouldBe true
            (second == first) shouldBe true
            first.hashCode() shouldBe expected.contentHashCode()
            second.hashCode() shouldBe first.hashCode()
        }
    }

    should("write packed floats relative to the slice offset without changing surrounding bytes") {
        // given a slice surrounded by sentinel bytes
        for (offset in listOf(0, 3, 11)) {
            for (idx in listOf(0, 2, 4)) {
                val bytes = MutBytes(offset + 12) { 99 }
                val slice = MutBytesSlice(bytes = bytes, offset = offset, len = 8)

                // when writing a float at the beginning, middle, or end of the slice
                slice.setPackedFloat(idx = idx, value = -123.5f)

                // then read the value back at the same index
                slice.getPackedFloat(idx) shouldBe -123.5f

                // and preserve every byte outside the written value
                for (byteIndex in bytes.indices) {
                    if (byteIndex !in offset + idx until offset + idx + Float.SIZE_BYTES) {
                        bytes[byteIndex] shouldBe 99.toByte()
                    }
                }
            }
        }
    }

    should("write packed doubles relative to the slice offset without changing surrounding bytes") {
        // given a slice surrounded by sentinel bytes
        for (offset in listOf(0, 3, 11)) {
            for (idx in listOf(0, 2, 4)) {
                val bytes = MutBytes(offset + 16) { 99 }
                val slice = MutBytesSlice(bytes = bytes, offset = offset, len = 12)

                // when writing a double at the beginning, middle, or end of the slice
                slice.setPackedDouble(idx = idx, value = -123.5)

                // then read the value back at the same index
                slice.getPackedDouble(idx) shouldBe -123.5

                // and preserve every byte outside the written value
                for (byteIndex in bytes.indices) {
                    if (byteIndex !in offset + idx until offset + idx + Double.SIZE_BYTES) {
                        bytes[byteIndex] shouldBe 99.toByte()
                    }
                }
            }
        }
    }
})
