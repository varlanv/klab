@file:Suppress("NOTHING_TO_INLINE")

package com.varlanv.klab.tasks

import com.varlanv.klab.collections.Array
import com.varlanv.klab.collections.MutArray
import com.varlanv.klab.tasks.Task.Target

/** A task body with access to the world executing it. */
typealias TaskFn<T> = TaskWorld.() -> T

/** Scheduler contract supporting [TaskWorld]'s inline operations, task submission, and lifecycle. */
interface TaskWorldBackend {
    /**
     * The worker attached to this backend on the calling thread.
     *
     * Fails if the caller is unattached - that is, a thread outside of [TaskWorld] tries to call it.
     * This should never happen at runtime, because the convention is to instantiate threads once at application
     * startup and reuse them across application; never creating new threads after entrypoint.
     */
    val currentWorker: Worker

    /**
     * Enters [target]'s priority on an eligible attached worker, returning the entry outcome and previous priority.
     * Returns [TaskEntry.notEntered] without changing context if inline execution is unavailable.
     * A successful entry must be paired with [leave] in a `finally` block.
     */
    fun enter(target: Target): TaskEntry

    /** Restores the priority returned by [enter] on the same worker. */
    fun leave(priority: TaskPriority)

    /** Submits work with the completion and failure semantics of [TaskWorld.fork]. */
    fun <T> fork(target: Target, handle: TaskFn<T>): TaskResult<T>

    /** Fills [results] in task order using [TaskWorld.joinAll]'s semantics. Both arrays must have equal size. */
    fun <T> joinAll(tasks: Array<Task<T>>, results: MutArray<T?>)

    /** Performs the single-task cooperative checkpoint described by [TaskWorld.yield]. */
    fun yield()

    /** Attaches the caller and runs the world according to [TaskWorld.start]'s lifecycle. */
    fun start(initializer: TaskFn<Unit>): Nothing
}

@JvmInline
value class TaskPriority(val value: Int) {
    inline val isHigh: Boolean get() = value == 0

    init {
        assert(value in 0..1)
    }

    companion object {
        inline val high: TaskPriority get() = TaskPriority(0)

        inline val low: TaskPriority get() = TaskPriority(1)
    }
}

@JvmInline
value class TaskEntry(val value: Int) {
    inline val isEntered: Boolean get() = value >= 0

    inline val previousPriority: TaskPriority get() = TaskPriority(value)

    init {
        assert(value in -1..1)
    }

    companion object {
        inline val notEntered: TaskEntry get() = TaskEntry(-1)

        inline fun entered(previousPriority: TaskPriority): TaskEntry = TaskEntry(previousPriority.value)
    }
}

/** Worker slot within a world: `0` identifies main, and `-1` leaves worker selection to the target tag. */
@JvmInline
value class TargetWorkerId(val value: Short) {
    /** Whether the worker ID is unspecified. A main-only target tag still restricts execution to main. */
    inline val isAnyWorker: Boolean get() = value == ANY_WORKER_SENTINEL

    init {
        assert(value >= ANY_WORKER_SENTINEL)
    }

    companion object {
        const val ANY_WORKER_SENTINEL: Short = -1
    }
}

/** A task description for [TaskWorld.joinAll]. Constructing it does not submit work. */
class Task<out T>(val target: Target, val handle: TaskFn<T>) {
    /**
     * Packed routing and priority: the upper signed 16 bits hold [tag], and the lower signed 16 bits
     * hold [workerId]. Pack them as `(tag shl 16) or (workerId and 0xffff)`.
     *
     * Any-available tags accept `-1` for any worker, including main, or a specific worker ID for affinity.
     * Main-only tags accept `-1` or `0` and always select main. IDs belong to the world receiving the task.
     * The constants below are tag values, so they must be packed before constructing a target.
     */
    @JvmInline
    value class Target(@PublishedApi internal val packed: Int) {
        /** Routing and priority tag. `-1` represents an unset tag and cannot be submitted. */
        inline val tag: Int
            get() {
                val value = packed shr 16
                assert(value >= TargetWorkerId.ANY_WORKER_SENTINEL)
                return value
            }

        /** Worker affinity, interpreted together with [tag]. */
        inline val workerId: TargetWorkerId get() = TargetWorkerId(packed.toShort())

        inline val priority: TaskPriority get() = TaskPriority(tag and 1)

        companion object {
            /** High priority, with worker selection determined by [workerId]. */
            const val ANY_AVAILABLE_HIGH_PRIORITY = 0

            /** Low priority, with worker selection determined by [workerId]. */
            const val ANY_AVAILABLE_LOW_PRIORITY = 1

            /** High priority on the attached main worker. */
            const val ONLY_MAIN_HIGH_PRIORITY = 2

            /** Low priority on the attached main worker. */
            const val ONLY_MAIN_LOW_PRIORITY = 3
        }
    }
}

/**
 * A stable handle to one platform thread for the lifetime of its world.
 * Retain its targets to run later work on that same thread, and use them with the originating world.
 */
interface Worker {
    /** Whether this is the calling thread attached by [TaskWorld.start]. */
    val isMain: Boolean

    /** High-priority target pinned to this worker. */
    val highPriority: Target

    /** Low-priority target pinned to this worker. */
    val lowPriority: Target
}

/** A shared, read-only task outcome. Multiple callers can await the same value or original failure. */
interface TaskResult<out T> {
    /** Whether the task has completed successfully or exceptionally. */
    val isDone: Boolean

    /**
     * Returns the task's value or rethrows its original failure instance. Repeated awaits retain the same outcome.
     *
     * A worker of the originating world runs eligible queued work on its current stack while waiting,
     * parking when no work is available. Other callers park without executing tasks. Helping can run
     * unrelated work, which must return before this call can return even if the awaited result is ready.
     * Nested waits therefore consume additional stack space.
     *
     * Interruption observed while waiting throws [InterruptedException] with the interrupt flag preserved;
     * it does not cancel the task. An already completed result is read without waiting.
     *
     * @throws IllegalStateException if a task tries to await itself.
     */
    fun await(): T
}

/**
 * Schedules CPU work with cooperative priorities and optional worker affinity.
 * Begin with [start]; its initializer receives the running world as its receiver.
 *
 * Submission and waiting are available to external callers. [currentWorker] and [yield] require an
 * attached worker. Waiting and yielding can run other tasks on the caller's stack, so application state
 * must be consistent at those boundaries. Dependency cycles remain invalid.
 *
 * Priorities control task selection without preempting running work or changing platform thread priority.
 * [execute] and [TaskResult.await] can run eligible tasks directly.
 *
 * @property parallelism Total worker count, including main.
 * @property mainWorker The caller attached by [start], with worker ID `0`.
 */
class TaskWorld(
    val parallelism: Int,
    @PublishedApi internal val api: TaskWorldBackend,
    val mainWorker: Worker,
) {
    /** The calling thread's worker in this world; throws [IllegalStateException] for an unattached caller. */
    val currentWorker: Worker
        get() = api.currentWorker

    /**
     * Runs [handle] at [target] and returns its value. An eligible attached caller executes inline;
     * otherwise the task is submitted and awaited using [TaskResult.await].
     *
     * The caller resumes on its original thread, and inline execution restores its previous priority
     * even on failure. Failures propagate unchanged; an inline [InterruptedException] restores interruption.
     */
    inline fun <T> execute(target: Target, crossinline handle: TaskFn<T>): T {
        val entry = api.enter(target)
        if (entry.isEntered) {
            try {
                return handle()
            } catch (failure: InterruptedException) {
                Thread.currentThread().interrupt()
                throw failure
            } finally {
                api.leave(entry.previousPriority)
            }
        }
        return fork(target) { handle() }.await()
    }

    /**
     * Submits branch B, executes branch A, and awaits both results in `(A, B)` order.
     * Branches can run concurrently when their targets and available workers permit it.
     *
     * An ordinary task failure still waits for the sibling. If both fail, A's original failure is thrown.
     * Waiting follows [TaskResult.await], so interruption can abort waiting before both branches finish.
     */
    inline fun <T, R> join(
        targetA: Target,
        crossinline handleA: TaskFn<T>,
        targetB: Target,
        crossinline handleB: TaskFn<R>,
    ): Pair<T, R> {
        val second = fork(targetB) { handleB() }
        var failure: Throwable? = null
        val firstValue = try {
            execute(targetA) { handleA() }
        } catch (caught: Throwable) {
            failure = caught
            null
        }
        val secondValue = try {
            second.await()
        } catch (caught: Throwable) {
            if (failure == null) {
                throw caught
            }
            null
        }
        if (failure != null) {
            throw failure
        }
        @Suppress("UNCHECKED_CAST")
        return Pair(firstValue as T, secondValue as R)
    }

    /**
     * Submits all [tasks] and returns their results in input order. The reified element type determines
     * the returned array's runtime type, including for an empty batch.
     *
     * Ordinary task failures still wait for the remaining tasks, then rethrow the first failure in input
     * order. Waiting follows [TaskResult.await], including its interruption behavior.
     */
    inline fun <reified T> joinAll(tasks: Array<Task<T>>): Array<T> {
        val results = arrayOfNulls<T>(tasks.size)
        api.joinAll(tasks = tasks, results = results)
        @Suppress("UNCHECKED_CAST")
        return results as Array<T>
    }

    /**
     * Enqueues [handle] at [target] and returns its shared result without waiting for execution or queue capacity.
     * Another worker may complete the task before this call returns. Completion covers this task body;
     * work it forks must be awaited explicitly when its completion is required.
     *
     * @throws IllegalStateException if the world is not running.
     * @throws InterruptedException if the submitting thread is interrupted.
     */
    inline fun <T> fork(target: Target, crossinline handle: TaskFn<T>): TaskResult<T> = api.fork(target) { handle() }

    /**
     * From low priority, executes at most one eligible high-priority task on the current worker's stack,
     * then resumes with the caller's priority restored. Returns immediately at high priority or when no
     * eligible high-priority work is available.
     *
     * A helped task's ordinary failure belongs to its own result and does not fail the yielding task.
     * Interruption propagates to the caller. This requires an attached worker.
     */
    fun yield() = api.yield()

    companion object {
        /**
         * Attaches the calling platform thread as main and runs [backend] until shutdown.
         * Call from the thread required by the application's main-thread APIs. Each backend can start once.
         *
         * Runs [initializer] at high priority on a randomly chosen background worker, or on main when it is
         * the only worker. Returning from the initializer leaves the world running. Initializer failure
         * or a worker's observed interruption initiates shutdown.
         *
         * Shutdown interrupts workers, waits for running tasks to return, and fails queued tasks with the
         * shutdown cause. Running tasks must cooperate with interruption for shutdown to finish.
         * This method never returns normally: it throws the first shutdown cause after workers stop.
         */
        fun start(backend: TaskWorldBackend, initializer: TaskFn<Unit>): Nothing = backend.start(initializer)
    }
}
