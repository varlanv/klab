package com.varlanv.klab.mem

import com.varlanv.klab.collections.MutArray
import java.lang.foreign.MemorySegment
import java.lang.foreign.SegmentAllocator
import kotlin.math.max

/**
 * Allocates/manages bytes in off-heap memory.
 * This interface is suitable for cases when certain logic wants access to potentially reusable
 * off-heap [java.lang.foreign.MemorySegment], for example for uploading data to GPU.
 *
 * In rare cases, algorithm way consider operating on off-heap memory directly
 * to avoid additional copy of bytes from heap memory to off-heap memory. Such cases need benchmarks to prove that
 * performance gains of zero-copy outweigh performance gain of JVM optimizations while operating directly on heap arrays.
 *
 * Not threadsafe unless explicitly specified.
 */
interface NativeAllocator : SegmentAllocator {
    /** Allocates bytes with a positive power-of-two alignment. */
    fun alloc(
        requested: Long,
        alignment: Long = 1,
    ): MemorySegment

    override fun allocate(
        byteSize: Long,
        byteAlignment: Long,
    ): MemorySegment = alloc(requested = byteSize, alignment = byteAlignment)

    interface Managed {
        fun free(segment: MemorySegment)
    }

    class Arena(
        private val initialSize: Long,
        private val arenaProvider: JdkArenaProvider,
    ) : NativeAllocator, AutoCloseable {
        init {
            assert(initialSize >= 0)
        }

        private var jdkArena = arenaProvider.get()

        private var segments: MutArray<Item> = MutArray(1) { Item(segment = MemorySegment.NULL) }
        private var closed: Boolean = false
        private var maxAlignment = 1L

        private class Item(
            val segment: MemorySegment,
            var currentOffset: Long = 0,
        )

        override fun alloc(requested: Long, alignment: Long): MemorySegment {
            assert(!closed)
            require(requested >= 0)
            require(alignment > 0 && (alignment and (alignment - 1)) == 0L)
            maxAlignment = max(maxAlignment, alignment)
            val segments = this.segments
            // try to use existing buffer
            for (item in segments) {
                val segment = item.segment
                if (segment.address() == 0L) {
                    continue
                }
                val segmentSize = segment.byteSize()
                val padding = -(segment.address() + item.currentOffset) and (alignment - 1)
                val remaining = segmentSize - item.currentOffset
                if (padding > remaining || requested > remaining - padding) {
                    continue
                }
                val currentOffset = item.currentOffset + padding
                item.currentOffset = currentOffset + requested
                return segment.asSlice(currentOffset, requested)
            }
            // try to use non-initialized buffer and initialize it
            segments.forEachIndexed { index, item ->
                var segment = item.segment
                if (segment.address() == 0L) {
                    segment = jdkArena.allocate(
                        max(
                            requested,
                            initialSize,
                        ),
                        alignment,
                    )
                    segments[index] = Item(segment = segment, currentOffset = requested)
                    return segment.asSlice(0, requested)
                }
            }
            // grow buffer by 1 to fit new item. Not growing by multiplicand because grow is intended to be rare path
            val newSegment = jdkArena.allocate(
                max(
                    requested,
                    initialSize,
                ),
                alignment,
            )
            this.segments = MutArray(segments.size + 1) { idx ->
                if (idx < segments.size) {
                    segments[idx]
                } else {
                    Item(segment = newSegment, currentOffset = requested)
                }
            }
            return newSegment.asSlice(0, requested)
        }

        fun deInit() {
            assert(!closed)
            var newSize = 0L
            var countNonNullBuffers = 0
            for (item in segments) {
                newSize += item.currentOffset
                if (item.segment.address() != 0L) {
                    countNonNullBuffers += 1
                }
            }
            if (countNonNullBuffers > 1) {
                val newArena = arenaProvider.get()
                try {
                    val newSegments = arrayOf(Item(segment = newArena.allocate(newSize, maxAlignment)))
                    this.jdkArena.close()
                    this.jdkArena = newArena
                    this.segments = newSegments
                } catch (failure: Throwable) {
                    try {
                        newArena.close()
                    } catch (closeFailure: Throwable) {
                        failure.addSuppressed(closeFailure)
                    }
                    throw failure
                }
            } else {
                for (item in segments) {
                    item.currentOffset = 0
                }
            }
        }

        override fun close() {
            val isClosed = closed
            if (!isClosed) {
                this.closed = true
                jdkArena.close()
            }
        }
    }
}
