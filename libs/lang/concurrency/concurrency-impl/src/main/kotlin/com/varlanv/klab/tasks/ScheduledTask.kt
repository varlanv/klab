package com.varlanv.klab.tasks

import com.varlanv.klab.tasks.Task.Target
import java.lang.invoke.MethodHandles
import java.lang.invoke.VarHandle
import java.util.concurrent.locks.LockSupport

internal class ScheduledTask<T>(
    val backend: TaskWorldBackendImpl,
    val target: Target,
    private var handle: TaskFn<T>?,
    val initializer: Boolean = false,
) : TaskResult<T> {
    @Volatile
    private var state = 0

    @Volatile
    private var waiters: Waiter? = null

    private var value: T? = null
    private var failure: Throwable? = null

    override val isDone: Boolean get() = state == 2

    override fun await(): T = backend.await(this)

    @IgnorableReturnValue
    fun tryRun(worker: WorkerImpl): Boolean {
        if (!backend.accepts(worker = worker, target = target) || !stateHandle.compareAndSet(this, 0, 1)) {
            return false
        }
        val previousTask = worker.task
        val previousPriority = worker.priority
        worker.task = this
        worker.priority = target.priority
        try {
            val stopping = backend.stopping.get()
            if (stopping == null) {
                value = handle!!(backend.world)
            } else {
                failure = stopping
            }
        } catch (caught: InterruptedException) {
            failure = caught
            Thread.currentThread().interrupt()
        } catch (caught: Throwable) {
            failure = caught
        } finally {
            worker.task = previousTask
            worker.priority = previousPriority
            complete()
        }
        if (initializer && failure != null) {
            backend.stop(failure!!)
        }
        return true
    }

    fun reject(cause: Throwable) {
        if (stateHandle.compareAndSet(this, 0, 1)) {
            failure = cause
            complete()
        }
    }

    fun register(): Waiter? {
        val waiter = Waiter(Thread.currentThread())
        while (true) {
            val head = waiters
            if (head === completed) {
                return null
            }
            waiter.next = head
            if (waitersHandle.compareAndSet(this, head, waiter)) {
                return waiter
            }
        }
    }

    fun result(): T {
        assert(isDone)
        val caught = failure
        if (caught != null) {
            throw caught
        }
        @Suppress("UNCHECKED_CAST")
        return value as T
    }

    private fun complete() {
        handle = null
        state = 2
        var waiter = waitersHandle.getAndSet(this, completed) as Waiter?
        while (waiter != null) {
            LockSupport.unpark(waiter.thread)
            waiter = waiter.next
        }
    }

    class Waiter(@Volatile var thread: Thread?) {
        var next: Waiter? = null
    }

    private companion object {
        val completed = Waiter(null)
        val stateHandle: VarHandle = MethodHandles
            .lookup()
            .findVarHandle(ScheduledTask::class.java, "state", Int::class.javaPrimitiveType)
        val waitersHandle: VarHandle = MethodHandles
            .lookup()
            .findVarHandle(ScheduledTask::class.java, "waiters", Waiter::class.java)
    }
}
