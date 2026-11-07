@file:Suppress("NOTHING_TO_INLINE")

package com.varlanv.klab.tasks

import com.varlanv.klab.tasks.Task.Target

typealias TaskFn<T> = TaskWorld.() -> T

interface TaskWorldBackend

@JvmInline
value class TargetWorkerId(val value: Short) {

    inline val isAnyWorker: Boolean get() = value == (-1).toShort()

    init {
        assert(value >= -1)
    }
}

class Task<out T>(val target: Target, val handle: TaskFn<T>) {
    @JvmInline
    value class Target(@PublishedApi internal val packed: Int) {
        inline val tag: Int
            get() {
                val value = packed shr 16
                assert(value >= -1)
                return value
            }

        inline val workerId: TargetWorkerId get() = TargetWorkerId(packed.toShort())

        companion object {
            const val ANY_AVAILABLE_HIGH_PRIORITY = 0
            const val ANY_AVAILABLE_LOW_PRIORITY = 1
            const val ONLY_MAIN_HIGH_PRIORITY = 2
            const val ONLY_MAIN_LOW_PRIORITY = 3
        }
    }
}

interface Worker {
    val isMain: Boolean

    val highPriority: Target

    val lowPriority: Target
}

interface TaskResult<out T> {
    val isDone: Boolean

    fun await(): T
}

class TaskWorld(
    val parallelism: Int,
    @PublishedApi internal val api: TaskWorldBackend,
    val mainWorker: Worker,
) {
    val currentWorker: Worker
        get() = TODO()

    inline fun <T> execute(target: Target, crossinline handle: TaskFn<T>): T = TODO()

    inline fun <T, R> join(
        targetA: Target,
        crossinline handleA: TaskFn<T>,
        targetB: Target,
        crossinline handleB: TaskFn<R>,
    ): Pair<T, R> = TODO()

    fun <T> joinAll(tasks: Array<Task<T>>): Array<T> = TODO()

    inline fun <T> fork(target: Target, crossinline handle: TaskFn<T>): TaskResult<T> = TODO()

    fun yield(): Unit = TODO()

    companion object {
        fun start(backend: TaskWorldBackend, initializer: TaskFn<Unit>): Nothing = TODO()
    }
}
