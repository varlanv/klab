package com.varlanv.klab.tasks

import com.varlanv.klab.collections.Array
import com.varlanv.klab.collections.MutArray
import com.varlanv.klab.tasks.Task.Target
import java.util.concurrent.ConcurrentLinkedQueue
import java.util.concurrent.ThreadLocalRandom
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.atomic.AtomicReference
import java.util.concurrent.locks.LockSupport

class TaskWorldBackendImpl(val parallelism: Int = Runtime.getRuntime().availableProcessors()) : TaskWorldBackend {
    init {
        assert(parallelism in 1..32768)
    }

    private val workers = MutArray(parallelism) { WorkerImpl(it) }
    private val attached = ThreadLocal<WorkerImpl>()
    private val high = ConcurrentLinkedQueue<ScheduledTask<*>>()
    private val low = ConcurrentLinkedQueue<ScheduledTask<*>>()
    private val sleepers = AtomicInteger()

    internal val world = TaskWorld(parallelism = parallelism, api = this, mainWorker = workers[0])

    internal val stopping: AtomicReference<Throwable?> = AtomicReference()

    private val started = AtomicBoolean()

    @Volatile
    private var running = false

    override val currentWorker: Worker
        get() = checkNotNull(attached.get()) { "The current thread is not attached to this task world" }

    override fun enter(target: Target): TaskEntry {
        validate(target)
        checkRunning()
        val worker = attached.get() ?: return TaskEntry.notEntered
        if (!accepts(worker = worker, target = target)) {
            return TaskEntry.notEntered
        }
        val previous = worker.priority
        worker.priority = target.priority
        return TaskEntry.entered(previous)
    }

    override fun leave(priority: TaskPriority) {
        val worker = attached.get()
        assert(worker != null)
        worker.priority = priority
    }

    override fun <T> fork(target: Target, handle: TaskFn<T>): TaskResult<T> {
        validate(target)
        checkRunning()
        val task = ScheduledTask(backend = this, target = target, handle = handle)
        enqueue(task)
        return task
    }

    override fun <T> joinAll(tasks: Array<Task<T>>, results: MutArray<T?>) {
        assert(tasks.size == results.size)
        checkRunning()
        for (task in tasks) {
            validate(task.target)
        }
        val pending = MutArray(tasks.size) { index ->
            val task = tasks[index]
            ScheduledTask(backend = this, target = task.target, handle = task.handle)
        }
        for (task in pending) {
            enqueue(task)
        }
        var failure: Throwable? = null
        for (index in pending.indices) {
            try {
                results[index] = pending[index].await()
            } catch (caught: Throwable) {
                if (failure == null) {
                    failure = caught
                }
            }
        }
        if (failure != null) {
            throw failure
        }
    }

    override fun yield() {
        val worker = checkNotNull(attached.get()) { "Only an attached worker can yield" }
        checkInterrupted()
        if (worker.priority.isHigh) {
            return
        }
        while (true) {
            val task = poll(worker = worker, highPriority = true) ?: return
            if (task.tryRun(worker)) {
                checkInterrupted()
                return
            }
        }
    }

    override fun start(initializer: TaskFn<Unit>): Nothing {
        check(started.compareAndSet(false, true)) { "The task world has already been started" }
        workers[0].thread = Thread.currentThread()
        for (index in 1 until parallelism) {
            val worker = workers[index]
            worker.thread = Thread.ofPlatform().name("task-world-$index").unstarted { runWorker(worker) }
        }
        val initializerWorker = if (parallelism == 1) {
            0
        } else {
            ThreadLocalRandom.current().nextInt(1, parallelism)
        }
        val task = ScheduledTask(
            backend = this,
            target = workers[initializerWorker].highPriority,
            handle = initializer,
            initializer = true,
        )
        try {
            checkInterrupted()
            running = true
            enqueue(task)
            for (index in 1 until parallelism) {
                workers[index].thread.start()
            }
            runWorker(workers[0])
        } catch (failure: Throwable) {
            stop(failure)
        } finally {
            val failure = checkNotNull(stopping.get())
            var interrupted = Thread.interrupted()
            for (index in 1 until parallelism) {
                val thread = workers[index].thread
                while (thread.isAlive) {
                    try {
                        thread.join()
                    } catch (_: InterruptedException) {
                        interrupted = true
                    }
                }
            }
            for (worker in workers) {
                while (true) {
                    val queued = worker.poll(true) ?: worker.poll(false) ?: break
                    queued.reject(failure)
                }
            }
            while (true) {
                val queued = high.poll() ?: low.poll() ?: break
                queued.reject(failure)
            }
            if (interrupted) {
                Thread.currentThread().interrupt()
            }
        }
        throw checkNotNull(stopping.get())
    }

    internal fun <T> await(task: ScheduledTask<T>): T {
        if (task.isDone) {
            return task.result()
        }
        val worker = attached.get()
        check(worker?.task !== task) { "A task cannot await itself" }
        var waiter: ScheduledTask.Waiter? = null
        try {
            while (!task.isDone) {
                checkInterrupted()
                if (worker != null) {
                    if (accepts(worker = worker, target = task.target) && removeLocal(worker = worker, task = task)) {
                        if (task.tryRun(worker)) {
                            continue
                        }
                    }
                    val next = poll(worker)
                    if (next != null) {
                        next.tryRun(worker)
                        continue
                    }
                    worker.sleeping.set(true)
                    sleepers.incrementAndGet()
                }
                var next: ScheduledTask<*>? = null
                try {
                    if (waiter == null) {
                        waiter = task.register()
                    }
                    if (task.isDone) {
                        continue
                    }
                    if (worker != null) {
                        next = poll(worker)
                    }
                    if (next == null) {
                        LockSupport.park(task)
                    }
                } finally {
                    if (worker != null) {
                        sleepers.decrementAndGet()
                        worker.sleeping.set(false)
                    }
                }
                next?.tryRun(checkNotNull(worker))
            }
            return task.result()
        } finally {
            waiter?.thread = null
        }
    }

    private fun removeLocal(worker: WorkerImpl, task: ScheduledTask<*>): Boolean {
        val highPriority = task.target.priority.isHigh
        return if (task.target.workerId.isAnyWorker && task.target.tag < 2) {
            val queue = if (highPriority) {
                worker.high
            } else {
                worker.low
            }
            queue.popIf(task)
        } else {
            val queue = if (highPriority) {
                worker.pinnedHigh
            } else {
                worker.pinnedLow
            }
            queue.remove(task)
        }
    }

    internal fun accepts(worker: WorkerImpl, target: Target): Boolean {
        val id = target.workerId.value.toInt()
        return if (target.tag >= Target.ONLY_MAIN_HIGH_PRIORITY) {
            worker.isMain
        } else {
            target.workerId.isAnyWorker || worker.id == id
        }
    }

    internal fun stop(cause: Throwable) {
        if (stopping.compareAndSet(null, cause)) {
            for (worker in workers) {
                worker.thread.interrupt()
            }
        }
    }

    private fun enqueue(task: ScheduledTask<*>) {
        val target = task.target
        val highPriority = target.priority.isHigh
        val workerId = if (target.tag >= Target.ONLY_MAIN_HIGH_PRIORITY) {
            0
        } else {
            target.workerId.value.toInt()
        }
        if (workerId >= 0) {
            val worker = workers[workerId]
            val queue = if (highPriority) {
                worker.pinnedHigh
            } else {
                worker.pinnedLow
            }
            queue.add(task)
            LockSupport.unpark(worker.thread)
        } else {
            val worker = attached.get()
            val queue = if (highPriority) {
                high
            } else {
                low
            }
            val local = if (highPriority) {
                worker?.high
            } else {
                worker?.low
            }
            if (local == null || !local.push(task)) {
                queue.add(task)
            }
            wakeWorker(worker)
        }
        val failure = stopping.get()
        if (failure != null) {
            task.reject(failure)
        }
    }

    private fun poll(worker: WorkerImpl, highPriority: Boolean): ScheduledTask<*>? {
        worker.poll(highPriority)?.let { return it }
        val queue = if (highPriority) {
            high
        } else {
            low
        }
        queue.poll()?.let { return it }
        repeat(parallelism) {
            worker.victim = (worker.victim + 1) % parallelism
            val other = workers[worker.victim]
            if (other !== worker) {
                val deque = if (highPriority) {
                    other.high
                } else {
                    other.low
                }
                deque.steal()?.let { return it }
            }
        }
        return null
    }

    private fun poll(worker: WorkerImpl): ScheduledTask<*>? {
        return poll(worker = worker, highPriority = true) ?: poll(worker = worker, highPriority = false)
    }

    private fun wakeWorker(current: WorkerImpl?) {
        if (sleepers.get() == 0) {
            return
        }
        val offset = current?.id ?: ThreadLocalRandom.current().nextInt(parallelism)
        repeat(parallelism) {
            val worker = workers[(offset + it + 1) % parallelism]
            if (worker !== current && worker.wake()) {
                return
            }
        }
    }

    private fun runWorker(worker: WorkerImpl) {
        attached.set(worker)
        try {
            while (stopping.get() == null) {
                checkInterrupted()
                var task = poll(worker)
                if (task == null) {
                    worker.sleeping.set(true)
                    sleepers.incrementAndGet()
                    try {
                        task = poll(worker)
                        if (task == null && stopping.get() == null) {
                            LockSupport.park(this)
                        }
                    } finally {
                        sleepers.decrementAndGet()
                        worker.sleeping.set(false)
                    }
                }
                task?.tryRun(worker)
            }
        } catch (failure: Throwable) {
            stop(failure)
        } finally {
            attached.remove()
        }
    }

    private fun validate(target: Target) {
        assert(target.tag in 0..3)
        assert(target.workerId.value.toInt() < parallelism)
        assert(target.tag < 2 || target.workerId.value.toInt() <= 0)
    }

    private fun checkRunning() {
        check(running && stopping.get() == null) { "The task world is not running" }
        checkInterrupted()
    }

    private fun checkInterrupted() {
        if (Thread.currentThread().isInterrupted) {
            throw InterruptedException()
        }
    }
}
