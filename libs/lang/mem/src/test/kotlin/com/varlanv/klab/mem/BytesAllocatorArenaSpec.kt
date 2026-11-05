package com.varlanv.klab.mem

import com.varlanv.klab.testing.BaseSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe

class BytesAllocatorArenaSpec : BaseSpec({

    should("reject a negative initial size") {
        // expect a negative initial size to be rejected
        shouldThrow<AssertionError> { HeapAllocator.Arena(-1) }
    }

    should("allocate the requested size when initialized from zero") {
        // given an allocator without initial capacity
        HeapAllocator.Arena(0).use { subject ->
            // when requesting three bytes
            val slice = subject.alloc(3)

            // then return exactly three bytes at the start of a new buffer
            slice.offset shouldBe 0
            slice.len shouldBe 3
            slice.bytes.size shouldBe 3
        }
    }

    should("expose only the requested portion of the initial buffer") {
        // given an allocator with an eight-byte initial buffer size
        HeapAllocator.Arena(8).use { subject ->
            // when requesting two bytes
            val slice = subject.alloc(2)

            // then return a two-byte slice of the larger buffer
            slice.offset shouldBe 0
            slice.len shouldBe 2
            slice.bytes.size shouldBe 8
        }
    }

    should("allocate more than the initial capacity when necessary") {
        // given an allocator with a two-byte initial buffer size
        HeapAllocator.Arena(2).use { subject ->
            // when requesting eight bytes
            val slice = subject.alloc(8)

            // then allocate a buffer large enough for the request
            slice.len shouldBe 8
            slice.bytes.size shouldBe 8
        }
    }

    should("fill a buffer with adjacent slices without overlapping their contents") {
        // given an allocator with an eight-byte buffer
        HeapAllocator.Arena(8).use { subject ->
            // when allocating slices that exactly fill the buffer
            val first = subject.alloc(2)
            val second = subject.alloc(3)
            val third = subject.alloc(3)

            // then return adjacent slices sharing the same buffer
            first.offset shouldBe 0
            second.offset shouldBe 2
            third.offset shouldBe 5
            first.len shouldBe 2
            second.len shouldBe 3
            third.len shouldBe 3
            (first.bytes === second.bytes) shouldBe true
            (first.bytes === third.bytes) shouldBe true

            // when writing a distinct value into each slice
            for (idx in 0 until first.len) first[idx] = 11
            for (idx in 0 until second.len) second[idx] = 22
            for (idx in 0 until third.len) third[idx] = 33

            // then preserve each slice's contents
            first.bytes.toList() shouldBe listOf<Byte>(11, 11, 22, 22, 22, 33, 33, 33)
        }
    }

    should("grow repeatedly while preserving earlier buffers") {
        // given an allocator with a four-byte initial buffer size
        HeapAllocator.Arena(4).use { subject ->
            // when filling three separate buffers
            val first = subject.alloc(4).also { it[0] = 11 }
            val second = subject.alloc(4).also { it[0] = 22 }
            val third = subject.alloc(4).also { it[0] = 33 }

            // then retain all buffers and their contents
            (first.bytes === second.bytes) shouldBe false
            (second.bytes === third.bytes) shouldBe false
            first[0] shouldBe 11.toByte()
            second[0] shouldBe 22.toByte()
            third[0] shouldBe 33.toByte()
        }
    }

    should("expose only the requested portion of a grown buffer") {
        // given an allocator with a full initial buffer
        HeapAllocator.Arena(8).use { subject ->
            val first = subject.alloc(8)

            // when requesting two more bytes
            val second = subject.alloc(2)

            // then return two bytes from a new eight-byte buffer
            (first.bytes === second.bytes) shouldBe false
            second.offset shouldBe 0
            second.len shouldBe 2
            second.bytes.size shouldBe 8
        }
    }

    should("reuse remaining space in earlier buffers before growing again") {
        // given two buffers with two bytes and one byte remaining
        HeapAllocator.Arena(8).use { subject ->
            val first = subject.alloc(6)
            val second = subject.alloc(7)

            // when requesting slices that fit the remaining spaces
            val third = subject.alloc(2)
            val fourth = subject.alloc(1)

            // then reuse both buffers at their current offsets
            (third.bytes === first.bytes) shouldBe true
            third.offset shouldBe 6
            (fourth.bytes === second.bytes) shouldBe true
            fourth.offset shouldBe 7
        }
    }

    should("allow empty allocations without consuming buffer space") {
        // given an allocator with an eight-byte buffer
        HeapAllocator.Arena(8).use { subject ->
            // when interleaving empty and nonempty allocations
            val firstEmpty = subject.alloc(0)
            val first = subject.alloc(3)
            val secondEmpty = subject.alloc(0)
            val second = subject.alloc(5)
            val lastEmpty = subject.alloc(0)

            // then preserve the offsets and reuse the same buffer throughout
            firstEmpty.len shouldBe 0
            firstEmpty.offset shouldBe 0
            secondEmpty.len shouldBe 0
            secondEmpty.offset shouldBe 3
            lastEmpty.len shouldBe 0
            lastEmpty.offset shouldBe 8
            second.offset shouldBe 3
            (firstEmpty.bytes === first.bytes) shouldBe true
            (second.bytes === first.bytes) shouldBe true
            (lastEmpty.bytes === first.bytes) shouldBe true
        }
    }

    should("grow from an empty buffer when initialized from zero") {
        // given an allocator with no initial capacity
        HeapAllocator.Arena(0).use { subject ->
            // when allocating empty slices followed by a nonempty slice
            val first = subject.alloc(0)
            val second = subject.alloc(0)
            val third = subject.alloc(2)

            // then return valid empty slices and a new buffer for the nonempty slice
            first.len shouldBe 0
            second.len shouldBe 0
            (first.bytes === second.bytes) shouldBe true
            third.len shouldBe 2
            third.offset shouldBe 0
            third.bytes.size shouldBe 2
        }
    }

    should("reject negative requests without consuming buffer space") {
        // given an allocator without any allocations
        HeapAllocator.Arena(8).use { subject ->
            // expect a negative request to be rejected
            shouldThrow<AssertionError> { subject.alloc(-1) }

            // and an existing slice before another invalid request
            val first = subject.alloc(2).also { it[1] = 11 }

            // expect another negative request to leave the current offset and contents intact
            shouldThrow<AssertionError> { subject.alloc(-1) }
            shouldThrow<AssertionError> { subject.alloc(Int.MIN_VALUE) }
            val second = subject.alloc(6)
            first.offset shouldBe 0
            first[1] shouldBe 11.toByte()
            second.offset shouldBe 2
            (second.bytes === first.bytes) shouldBe true
        }
    }

    should("reset an unused allocator repeatedly") {
        // given an allocator without any allocations
        HeapAllocator.Arena(8).use { subject ->
            // when resetting it twice before allocating
            repeat(2) { subject.deInit() }
            val slice = subject.alloc(8)

            // then allow a full allocation from the beginning
            slice.offset shouldBe 0
            slice.len shouldBe 8
        }
    }

    should("reuse a single buffer from its beginning after every reset") {
        // given a partially used buffer
        HeapAllocator.Arena(8).use { subject ->
            val first = subject.alloc(3)

            // expect each reset to make the entire original buffer available again
            repeat(2) {
                // when resetting and allocating the entire buffer
                subject.deInit()
                val reused = subject.alloc(8)

                // then reuse the original buffer from its beginning
                (reused.bytes === first.bytes) shouldBe true
                reused.offset shouldBe 0
                reused.len shouldBe 8
            }
        }
    }

    should("consolidate used bytes from multiple buffers on reset") {
        // given twenty-two bytes used across three buffers
        HeapAllocator.Arena(8).use { subject ->
            val first = subject.alloc(6)
            val second = subject.alloc(7)
            val third = subject.alloc(9)

            // when resetting and allocating the total used size
            subject.deInit()
            val combined = subject.alloc(22)

            // then allocate one combined buffer sized by usage rather than old capacity
            combined.bytes.size shouldBe 22
            combined.offset shouldBe 0
            combined.len shouldBe 22
            (combined.bytes === first.bytes) shouldBe false
            (combined.bytes === second.bytes) shouldBe false
            (combined.bytes === third.bytes) shouldBe false

            // when resetting and allocating the same size again
            subject.deInit()
            val reused = subject.alloc(22)

            // then reuse the combined buffer from its beginning
            (reused.bytes === combined.bytes) shouldBe true
            reused.offset shouldBe 0
        }
    }

    should("close repeatedly and reject subsequent allocations and resets") {
        // given an allocator with an allocated slice
        HeapAllocator.Arena(8).use { subject ->
            subject.alloc(2)

            // when closing the allocator twice
            repeat(2) { subject.close() }

            // then reject further allocations and resets
            shouldThrow<AssertionError> { subject.alloc(1) }
            shouldThrow<AssertionError> { subject.deInit() }
        }
    }
})
