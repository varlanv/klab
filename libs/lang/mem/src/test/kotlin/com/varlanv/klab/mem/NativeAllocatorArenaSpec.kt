package com.varlanv.klab.mem

import com.varlanv.klab.testing.BaseSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import java.lang.foreign.Arena
import java.lang.foreign.ValueLayout.JAVA_BYTE

class NativeAllocatorArenaSpec : BaseSpec({

    should("create an arena without allocating memory") {
        // given an allocator with an initial buffer size
        withAllocator { _, fixture ->
            // expect one arena without any allocation or close calls
            fixture.provider.getCalled() shouldBe 1
            fixture.arenas.single().allocationsCount() shouldBe 0
            fixture.arenas.single().closeCalls() shouldBe 0
        }
    }

    should("reject a negative initial size before creating an arena") {
        // given an arena provider
        ArenaFixture().use { fixture ->
            // expect a negative initial size to be rejected without creating an arena
            shouldThrow<AssertionError> { NativeAllocator.Arena(initialSize = -1, arenaProvider = fixture.provider) }
            fixture.provider.getCalled() shouldBe 0
        }
    }

    should("allocate exactly the requested memory when initialized from zero") {
        // given an allocator with no initial buffer capacity
        withAllocator(0) { subject, fixture ->
            // when allocating three bytes
            val segment = subject.alloc(3)

            // then allocate exactly three bytes on the current thread
            segment.byteSize() shouldBe 3
            fixture.provider.getCalled() shouldBe 1
            val allocation = fixture.arenas.single().requireOneAllocation()
            allocation.byteSize shouldBe 3
            allocation.byteAlignment shouldBe 1
            allocation.threadId shouldBe Thread.currentThread().threadId()
        }
    }

    should("limit the first allocation to the requested size") {
        // given an allocator with an eight-byte initial buffer
        withAllocator { subject, fixture ->
            // when allocating two bytes
            val segment = subject.alloc(2)

            // then expose only those two bytes from the larger buffer
            segment.byteSize() shouldBe 2
            shouldThrow<IndexOutOfBoundsException> { segment.set(JAVA_BYTE, 2, 1) }
            fixture.arenas.single().requireOneAllocation().byteSize shouldBe 8
        }
    }

    should("allocate a buffer larger than the initial size when necessary") {
        // given an allocator with a two-byte initial buffer size
        withAllocator(2) { subject, fixture ->
            // when requesting eight bytes
            val segment = subject.alloc(8)

            // then allocate a buffer large enough for the entire request
            segment.byteSize() shouldBe 8
            fixture.arenas.single().requireOneAllocation().byteSize shouldBe 8
        }
    }

    should("return disjoint slices and fill an existing buffer exactly") {
        // given an allocator with an eight-byte initial buffer
        withAllocator { subject, fixture ->
            // when allocating slices that exactly fill the buffer
            val first = subject.alloc(2)
            val second = subject.alloc(3)
            val third = subject.alloc(3)

            // then return adjacent slices of the requested sizes
            first.byteSize() shouldBe 2
            second.byteSize() shouldBe 3
            third.byteSize() shouldBe 3
            second.address() shouldBe first.address() + 2
            third.address() shouldBe first.address() + 5

            // when filling each slice with a different value
            first.fill(11)
            second.fill(22)
            third.fill(33)

            // then preserve each value without allocating another buffer
            first.get(JAVA_BYTE, 1) shouldBe 11.toByte()
            second.get(JAVA_BYTE, 2) shouldBe 22.toByte()
            third.get(JAVA_BYTE, 2) shouldBe 33.toByte()
            fixture.arenas.single().allocationsCount() shouldBe 1
        }
    }

    should("grow repeatedly while preserving earlier allocations") {
        // given an allocator with a four-byte initial buffer size
        withAllocator(4) { subject, fixture ->
            // when allocating and filling three full buffers
            val first = subject.alloc(4).also { it.fill(11) }
            val second = subject.alloc(4).also { it.fill(22) }
            val third = subject.alloc(4).also { it.fill(33) }

            // then preserve all values in three buffers belonging to the same arena
            first.get(JAVA_BYTE, 0) shouldBe 11.toByte()
            second.get(JAVA_BYTE, 0) shouldBe 22.toByte()
            third.get(JAVA_BYTE, 0) shouldBe 33.toByte()
            fixture.arenas.single().allocations().map { it.byteSize } shouldBe listOf(4L, 4L, 4L)
            fixture.provider.getCalled() shouldBe 1
        }
    }

    should("limit allocations from a newly grown buffer to the requested size") {
        // given an allocator with a full initial buffer
        withAllocator { subject, fixture ->
            subject.alloc(8)

            // when requesting two more bytes
            val segment = subject.alloc(2)

            // then expose two bytes from a new eight-byte buffer
            segment.byteSize() shouldBe 2
            fixture.arenas.single().allocations().map { it.byteSize } shouldBe listOf(8L, 8L)
        }
    }

    should("reuse space in earlier buffers before growing again") {
        // given two buffers with two bytes and one byte remaining
        withAllocator { subject, fixture ->
            val first = subject.alloc(6)
            val second = subject.alloc(7)

            // when requesting slices that fit the remaining spaces
            val third = subject.alloc(2)
            val fourth = subject.alloc(1)

            // then reuse both buffers without growing again
            third.address() shouldBe first.address() + 6
            fourth.address() shouldBe second.address() + 7
            fixture.arenas.single().allocationsCount() shouldBe 2
        }
    }

    should("allow empty allocations without consuming buffer space") {
        // given allocators with zero and nonzero initial buffer sizes
        for (initialSize in listOf(0L, 8L)) {
            withAllocator(initialSize) { subject, _ ->
                // when interleaving empty allocations with two-byte allocations
                val firstEmpty = subject.alloc(0)
                val secondEmpty = subject.alloc(0)
                val first = subject.alloc(2)
                val thirdEmpty = subject.alloc(0)
                val second = subject.alloc(2)

                // then return empty slices and preserve the space for nonempty slices
                firstEmpty.byteSize() shouldBe 0
                secondEmpty.byteSize() shouldBe 0
                thirdEmpty.byteSize() shouldBe 0
                if (initialSize > 0) second.address() shouldBe first.address() + 2
                else second.byteSize() shouldBe 2
            }
        }
    }

    should("reject negative requests without allocating or consuming space") {
        // given an allocator without any allocations
        withAllocator { subject, fixture ->
            // expect a negative request to fail without allocating a buffer
            shouldThrow<IllegalArgumentException> { subject.alloc(-1) }
            fixture.arenas.single().allocationsCount() shouldBe 0

            // and an existing slice before another negative request
            val first = subject.alloc(2)

            // expect the invalid request to leave the remaining buffer space intact
            shouldThrow<IllegalArgumentException> { subject.alloc(Long.MIN_VALUE) }
            subject.alloc(6).address() shouldBe first.address() + 2
            fixture.arenas.single().allocationsCount() shouldBe 1
        }
    }

    should("reset an unused allocator without allocating or replacing its arena") {
        // given an allocator without any allocations
        withAllocator { subject, fixture ->
            // when resetting it twice
            repeat(2) { subject.deInit() }

            // then retain the same arena without allocating or closing anything
            fixture.provider.getCalled() shouldBe 1
            fixture.arenas.single().allocationsCount() shouldBe 0
            fixture.arenas.single().closeCalls() shouldBe 0

            // and allow a full-buffer allocation afterward
            subject.alloc(8).byteSize() shouldBe 8
        }
    }

    should("reuse a single buffer from its beginning after each reset") {
        // given an allocator with one partially used buffer
        withAllocator { subject, fixture ->
            val first = subject.alloc(3)

            // expect each reset to make the entire buffer available from its beginning
            repeat(2) {
                // when resetting and allocating a full buffer
                subject.deInit()
                val reused = subject.alloc(8)

                // then reuse the original buffer address
                reused.address() shouldBe first.address()
            }

            // and retain the same arena and buffer throughout
            fixture.provider.getCalled() shouldBe 1
            fixture.arenas.single().allocationsCount() shouldBe 1
            fixture.arenas.single().closeCalls() shouldBe 0
        }
    }

    should("consolidate used bytes from multiple buffers and reuse the combined buffer") {
        // given an allocator with twenty-two bytes used across three buffers
        ArenaFixture().use { fixture ->
            NativeAllocator.Arena(8, fixture.provider).use { subject ->
                val first = subject.alloc(6)
                val second = subject.alloc(7)
                subject.alloc(9)

                // when resetting the allocator
                subject.deInit()

                // then replace the old arena with one combined buffer of the used size
                fixture.provider.getCalled() shouldBe 2
                fixture.arenas[0].closeCalls() shouldBe 1
                first.scope().isAlive shouldBe false
                second.scope().isAlive shouldBe false
                fixture.arenas[1].requireOneAllocation().byteSize shouldBe 22

                // when filling the combined buffer and resetting again
                val combined = subject.alloc(22)
                subject.deInit()
                val reused = subject.alloc(22)

                // then reuse the combined buffer without replacing its arena
                combined.byteSize() shouldBe 22
                reused.address() shouldBe combined.address()
                fixture.provider.getCalled() shouldBe 2
            }

            // and close each arena exactly once when the allocator leaves its scope
            fixture.arenas[0].closeCalls() shouldBe 1
            fixture.arenas[1].closeCalls() shouldBe 1
        }
    }

    should("close the arena once and invalidate all its allocations") {
        // given an allocator with an allocated slice
        withAllocator { subject, fixture ->
            val segment = subject.alloc(2)

            // when closing the allocator twice
            repeat(2) { subject.close() }

            // then close the arena once and invalidate the slice
            fixture.arenas.single().closeCalls() shouldBe 1
            segment.scope().isAlive shouldBe false

            // and reject further allocations and resets
            shouldThrow<AssertionError> { subject.alloc(1) }
            shouldThrow<AssertionError> { subject.deInit() }
        }
    }

    should("preserve existing allocations when creating a replacement arena fails") {
        // given two used buffers and a provider that fails to create a replacement
        withAllocator { subject, fixture ->
            val first = subject.alloc(6).also { it.fill(11) }
            subject.alloc(7)
            fixture.providerFailure = IllegalStateException("provider failure")

            // expect reset to fail while preserving existing memory and buffer offsets
            shouldThrow<IllegalStateException> { subject.deInit() }
            first.scope().isAlive shouldBe true
            first.get(JAVA_BYTE, 0) shouldBe 11.toByte()
            subject.alloc(2).address() shouldBe first.address() + 6

            // when the provider recovers and reset is retried
            fixture.providerFailure = null
            subject.deInit()

            // then consolidate all fifteen used bytes
            fixture.arenas.last().requireOneAllocation().byteSize shouldBe 15
        }
    }

    should("close a failed replacement arena and preserve existing allocations") {
        // given two used buffers and a replacement arena that fails to allocate
        withAllocator { subject, fixture ->
            val first = subject.alloc(6).also { it.fill(11) }
            subject.alloc(7)
            fixture.nextAllocationFailure = OutOfMemoryError("allocation failure")

            // expect reset to fail and close the replacement while preserving the original memory
            shouldThrow<OutOfMemoryError> { subject.deInit() }
            fixture.arenas[1].closeCalls() shouldBe 1
            first.scope().isAlive shouldBe true
            first.get(JAVA_BYTE, 0) shouldBe 11.toByte()
            subject.alloc(2).address() shouldBe first.address() + 6

            // when allocation recovers and reset is retried
            fixture.nextAllocationFailure = null
            subject.deInit()

            // then consolidate all fifteen used bytes
            fixture.arenas.last().requireOneAllocation().byteSize shouldBe 15
        }
    }

    should("preserve buffer offsets when allocating the first buffer fails") {
        // given an allocator whose arena fails to allocate
        withAllocator { subject, fixture ->
            val arena = fixture.arenas.single()
            arena.allocationFailure = OutOfMemoryError("allocation failure")

            // expect the first allocation to fail
            shouldThrow<OutOfMemoryError> { subject.alloc(2) }

            // when allocation recovers and two slices fill the buffer
            arena.allocationFailure = null
            val first = subject.alloc(2)
            val second = subject.alloc(6)

            // then return adjacent slices from one buffer
            second.address() shouldBe first.address() + 2
            arena.allocationsCount() shouldBe 1
        }
    }

    should("discard the replacement when closing the current arena fails") {
        // given two used buffers in an arena that fails to close
        withAllocator { subject, fixture ->
            val first = subject.alloc(6).also { it.fill(11) }
            subject.alloc(7)
            val original = fixture.arenas.single()
            original.closeFailure = IllegalStateException("close failure")

            // expect reset to fail and discard its replacement while preserving the original memory
            shouldThrow<IllegalStateException> { subject.deInit() }
            first.scope().isAlive shouldBe true
            first.get(JAVA_BYTE, 0) shouldBe 11.toByte()
            fixture.arenas[1].closeCalls() shouldBe 1

            // when closing recovers and the allocator uses its remaining space
            original.closeFailure = null
            val remaining = subject.alloc(2)

            // then continue at the original buffer offset
            remaining.address() shouldBe first.address() + 6

            // when resetting again
            subject.deInit()

            // then consolidate all fifteen used bytes
            fixture.arenas.last().requireOneAllocation().byteSize shouldBe 15
        }
    }

    should("retain the allocation error when closing its failed replacement also fails") {
        // given two used buffers and a replacement that fails both allocation and closing
        withAllocator { subject, fixture ->
            val first = subject.alloc(6).also { it.fill(11) }
            subject.alloc(7)
            val allocationFailure = OutOfMemoryError("allocation failure")
            val closeFailure = IllegalStateException("close failure")
            fixture.nextAllocationFailure = allocationFailure
            fixture.nextCloseFailure = closeFailure

            // when attempting to reset the allocator
            val failure = shouldThrow<OutOfMemoryError> { subject.deInit() }

            // then retain the allocation error and suppress the closing error
            failure shouldBe allocationFailure
            failure.suppressed.toList() shouldBe listOf(closeFailure)

            // and preserve the original memory and remaining buffer space
            first.scope().isAlive shouldBe true
            first.get(JAVA_BYTE, 0) shouldBe 11.toByte()
            subject.alloc(2).address() shouldBe first.address() + 6
        }
    }

    should("preserve existing buffers when growing fails") {
        // given a partially used buffer in an arena that fails further allocation
        withAllocator { subject, fixture ->
            val first = subject.alloc(6).also { it.fill(11) }
            val arena = fixture.arenas.single()
            arena.allocationFailure = OutOfMemoryError("allocation failure")

            // expect a request larger than the remaining space to fail
            shouldThrow<OutOfMemoryError> { subject.alloc(3) }

            // when allocation recovers and the remaining buffer space is used
            arena.allocationFailure = null
            val remaining = subject.alloc(2)

            // then preserve the original offset and contents
            remaining.address() shouldBe first.address() + 6
            first.get(JAVA_BYTE, 0) shouldBe 11.toByte()

            // when requesting another slice that requires growth
            val grown = subject.alloc(3)

            // then allocate the slice from a second buffer
            grown.byteSize() shouldBe 3
            arena.allocationsCount() shouldBe 2
        }
    }
})

private fun withAllocator(initialSize: Long = 8, block: (NativeAllocator.Arena, ArenaFixture) -> Unit) {
    ArenaFixture().use { fixture ->
        NativeAllocator.Arena(initialSize, fixture.provider).use { block(it, fixture) }
    }
}

private class ArenaFixture : AutoCloseable {
    val arenas = mutableListOf<DebugArena>()
    var providerFailure: RuntimeException? = null
    var nextAllocationFailure: OutOfMemoryError? = null
    var nextCloseFailure: RuntimeException? = null
    val provider = JdkArenaProvider.Debug {
        providerFailure?.let { throw it }
        DebugArena(Arena.ofShared()).also {
            it.allocationFailure = nextAllocationFailure
            it.closeFailure = nextCloseFailure
            arenas.add(it)
        }
    }

    override fun close() {
        arenas.filter { it.scope()!!.isAlive }.forEach {
            it.closeFailure = null
            it.close()
        }
    }
}
