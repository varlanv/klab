package com.varlanv.klab.mem

import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.util.concurrent.ConcurrentLinkedQueue
import java.util.concurrent.atomic.AtomicInteger

class DebugArena(private val delegate: Arena) : Arena {
    data class AllocationCall(
        val threadId: Long,
        val byteSize: Long,
        val byteAlignment: Long,
    )

    private val allocationCalls = ConcurrentLinkedQueue<AllocationCall>()
    private val closeCalls = AtomicInteger()

    var allocationFailure: OutOfMemoryError? = null
    var closeFailure: RuntimeException? = null

    override fun allocate(byteSize: Long, byteAlignment: Long): MemorySegment? {
        allocationFailure?.let { throw it }
        allocationCalls.add(
            AllocationCall(
                threadId = Thread.currentThread().threadId(),
                byteSize = byteSize,
                byteAlignment = byteAlignment,
            ),
        )
        return delegate.allocate(byteSize, byteAlignment)
    }

    override fun scope(): MemorySegment.Scope? {
        return delegate.scope()
    }

    override fun close() {
        closeFailure?.let { throw it }
        closeCalls.incrementAndGet()
        return delegate.close()
    }

    fun allocationsCount(): Int = allocationCalls.count()

    fun allocations(): Array<AllocationCall> = allocationCalls.toTypedArray()

    fun requireOneAllocation(): AllocationCall {
        val size = allocationCalls.size
        if (size > 1 || size == 0) {
            error("Required one allocation, but was [ $size ]")
        } else {
            return allocationCalls.peek()
        }
    }

    fun closeCalls(): Int = closeCalls.get()

    fun verifySameThreadAccess() {
        val copy = allocationCalls.toTypedArray()
        val threads = copy.asSequence().map { it.threadId }.toSet()
        if (threads.size > 1) {
            val truncatedCopy = if (copy.size > 1000) {
                copy.slice(0..1000)
            } else {
                copy.toList()
            }
            val truncateText = if (copy.size > 1000) {
                "...truncated"
            } else {
                ""
            }
            error(
                "Requested same thread arena access, but was called from [ ${threads.size} ] threads. Allocation calls: $truncatedCopy$truncateText",
            )
        }
    }
}
