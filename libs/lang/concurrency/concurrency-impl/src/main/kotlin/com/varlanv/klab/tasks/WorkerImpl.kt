package com.varlanv.klab.tasks

import com.varlanv.klab.tasks.Task.Target
import java.util.concurrent.ConcurrentLinkedQueue
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.locks.LockSupport

internal class WorkerImpl(val id: Int) : Worker {
    override val isMain: Boolean = id == 0

    override val highPriority = Target(
        ((if (isMain) {
            2
        } else {
            0
        }) shl 16) or id,
    )

    override val lowPriority = Target(
        ((if (isMain) {
            3
        } else {
            1
        }) shl 16) or id,
    )

    val high = WorkDeque<ScheduledTask<*>>()
    val low = WorkDeque<ScheduledTask<*>>()
    val pinnedHigh = ConcurrentLinkedQueue<ScheduledTask<*>>()
    val pinnedLow = ConcurrentLinkedQueue<ScheduledTask<*>>()

    lateinit var thread: Thread

    val sleeping = AtomicBoolean()

    var priority = TaskPriority.high
    var task: ScheduledTask<*>? = null
    var victim = id

    fun wake(): Boolean {
        if (!sleeping.compareAndSet(true, false)) {
            return false
        }
        LockSupport.unpark(thread)
        return true
    }

    fun poll(highPriority: Boolean): ScheduledTask<*>? {
        return if (highPriority) {
            pinnedHigh.poll() ?: high.pop()
        } else {
            pinnedLow.poll() ?: low.pop()
        }
    }
}
