package com.varlanv.klab.mem

import com.varlanv.klab.collections.MutArray
import com.varlanv.klab.collections.MutBytes
import com.varlanv.klab.collections.MutBytesSlice
import com.varlanv.klab.collections.stableEmptyMutBytes
import kotlin.math.max

/**
 * Allocates/manages bytes on heap.
 * This interface is suitable for cases when certain logic needs access to fast, potentially reusable byte buffers
 * that don't leave heap (via Java FFM).
 * Benchmarks show that algorithms that operate directly on [com.varlanv.klab.collections.Bytes] perform
 * multiple times faster than working on [java.lang.foreign.MemorySegment] - no matter whether heap or off-heap.
 * In most cases, most efficient way of doing CPU/GPU work is to operate on reusable [com.varlanv.klab.collections.Bytes]
 * buffer, and then making copy of prepared aligned data into reusable off-heap [java.lang.foreign.MemorySegment]
 * for passing to prepared data to GPU.
 *
 * Not threadsafe unless explicitly specified.
 */
interface HeapAllocator {
    fun alloc(requested: Int): MutBytesSlice

    interface Managed {
        fun free(segment: MutBytesSlice)
    }

    class Arena(private val initialSize: Int) : HeapAllocator, AutoCloseable {
        init {
            assert(initialSize >= 0)
        }

        private var segments: MutArray<Item> = MutArray(1) { Item(segment = stableEmptyMutBytes) }
        private var closed: Boolean = false

        private class Item(
            val segment: MutBytes,
            var currentOffset: Int = 0,
        ) {
            companion object {
                val emptyArray: MutArray<Item> = emptyArray()
            }
        }

        override fun alloc(requested: Int): MutBytesSlice {
            assert(!closed)
            assert(requested >= 0)
            val segments = this.segments
            assert(segments.isNotEmpty())
            // try to use existing buffer
            for (item in segments) {
                val segment = item.segment
                if (segment === stableEmptyMutBytes) {
                    continue
                }
                val segmentSize = segment.size
                val currentOffset = item.currentOffset
                if (segmentSize - currentOffset - requested < 0) {
                    continue
                }
                item.currentOffset = currentOffset + requested
                return MutBytesSlice(bytes = segment, offset = currentOffset, len = requested)
            }
            // try to use non-initialized buffer and initialize it
            segments.forEachIndexed { index, item ->
                var segment = item.segment
                if (segment === stableEmptyMutBytes) {
                    segment = MutBytes(max(requested, initialSize))
                    segments[index] = Item(segment = segment, currentOffset = requested)
                    return MutBytesSlice(bytes = segment, offset = 0, len = requested)
                }
            }
            // grow buffer by 1 to fit new item. Not growing by multiplicand because grow is intended to be rare path
            val newSegment = MutBytes(max(requested, initialSize))
            this.segments = MutArray(segments.size + 1) { idx ->
                if (idx < segments.size) {
                    segments[idx]
                } else {
                    Item(segment = newSegment, currentOffset = requested)
                }
            }
            return MutBytesSlice(bytes = newSegment, offset = 0, len = requested)
        }

        fun deInit() {
            assert(!closed)
            var newSize = 0
            var countNonNullBuffers = 0
            for (item in segments) {
                newSize += item.currentOffset
                if (item.segment !== stableEmptyMutBytes) {
                    countNonNullBuffers += 1
                }
            }
            if (countNonNullBuffers > 1) {
                val newSegments = MutArray(1) { Item(segment = stableEmptyMutBytes) }
                val combinedSegment = MutBytes(newSize)
                newSegments[0] = Item(segment = combinedSegment)
                this.segments = newSegments
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
                this.segments = Item.emptyArray
            }
        }
    }
}
