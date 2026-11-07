package com.varlanv.klab.tasks

import java.util.concurrent.atomic.AtomicLong
import java.util.concurrent.atomic.AtomicReferenceArray

internal class WorkDeque<T : Any>(capacity: Int = 256) {
    init {
        assert(capacity > 0 && capacity and (capacity - 1) == 0)
    }

    private val entries = AtomicReferenceArray<T>(capacity)
    private val mask = capacity - 1
    private val top = AtomicLong()

    @Volatile
    private var bottom = 0L

    fun push(value: T): Boolean {
        val next = bottom
        if (next - top.get() >= entries.length()) {
            return false
        }
        val index = next.toInt() and mask
        if (entries.get(index) != null) {
            return false
        }
        entries.set(index, value)
        bottom = next + 1
        return true
    }

    fun pop(): T? {
        val next = bottom - 1
        bottom = next
        val first = top.get()
        if (first > next) {
            bottom = first
            return null
        }
        val index = next.toInt() and mask
        val value = entries.get(index)
        if (first == next) {
            val claimed = top.compareAndSet(first, first + 1)
            bottom = first + 1
            if (!claimed) {
                return null
            }
        }
        assert(value != null)
        entries.set(index, null)
        return value
    }

    @IgnorableReturnValue
    fun popIf(value: T): Boolean {
        val next = bottom - 1
        if (next < top.get() || entries.get(next.toInt() and mask) !== value) {
            return false
        }
        return pop() === value
    }

    fun steal(): T? {
        val first = top.get()
        if (first >= bottom) {
            return null
        }
        val index = first.toInt() and mask
        val value = entries.get(index)
        if (!top.compareAndSet(first, first + 1)) {
            return null
        }
        assert(value != null)
        entries.set(index, null)
        return value
    }
}
