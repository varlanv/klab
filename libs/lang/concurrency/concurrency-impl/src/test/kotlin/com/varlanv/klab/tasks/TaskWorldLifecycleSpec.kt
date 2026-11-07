package com.varlanv.klab.tasks

import com.varlanv.klab.testing.BaseSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeInstanceOf
import io.kotest.matchers.types.shouldBeSameInstanceAs
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicReference

class TaskWorldLifecycleSpec : BaseSpec({

    should("reject parallelism that cannot identify a nonempty set of workers") {
        // expect worker counts outside the supported identifier range to fail
        for (parallelism in listOf(-1, 0, 32769, Int.MAX_VALUE)) {
            shouldThrow<AssertionError> { TaskWorldBackendImpl(parallelism) }
        }
    }

    should("preserve startup interruption without invoking the initializer") {
        // given an interrupted caller and an initializer that records invocation
        val backend = TaskWorldBackendImpl(2)
        val initialized = AtomicBoolean()
        val failure = AtomicReference<Throwable>()
        val interrupted = AtomicBoolean()

        // when starting the world from that caller
        val main = Thread.ofPlatform().daemon().start {
            Thread.currentThread().interrupt()
            try {
                TaskWorld.start(backend) { initialized.set(true) }
            } catch (caught: Throwable) {
                failure.set(caught)
                interrupted.set(Thread.currentThread().isInterrupted)
            }
        }
        main.joinWithinTimeout()

        // then report interruption with its status preserved and skip initialization
        failure.get().shouldBeInstanceOf<InterruptedException>()
        interrupted.get() shouldBe true
        initialized.get() shouldBe false
    }

    should("reject restarting a backend after it has stopped") {
        // given a backend that has completed startup and shutdown
        val backend = TaskWorldBackendImpl(1)
        val initialized = CountDownLatch(1)
        RunningTaskWorld(backend) { initialized.countDown() }.use {
            check(initialized.await(5, TimeUnit.SECONDS))
        }
        val restarted = AtomicBoolean()

        // when starting the same backend again
        RunningTaskWorld(backend) { restarted.set(true) }.use { second ->
            second.awaitTermination()

            // then reject the second startup before invoking its initializer
            second.failure.get().shouldBeInstanceOf<IllegalStateException>()
            restarted.get() shouldBe false
        }
    }

    should("continue dispatching high-priority work first after the initializer returns") {
        // given a single worker held in its initializer while external work is submitted
        val initialized = CountDownLatch(1)
        val release = CountDownLatch(1)
        val world = AtomicReference<TaskWorld>()
        val order = mutableListOf<Int>()
        RunningTaskWorld(TaskWorldBackendImpl(1)) {
            world.set(this)
            initialized.countDown()
            check(release.await(5, TimeUnit.SECONDS))
        }.use { running ->
            try {
                check(initialized.await(5, TimeUnit.SECONDS))
                val subject = world.get()
                val results = listOf(
                    subject.fork(subject.mainWorker.lowPriority) { order.add(3) },
                    subject.fork(subject.mainWorker.highPriority) { order.add(1) },
                    subject.fork(subject.mainWorker.highPriority) { order.add(2) },
                    subject.fork(subject.mainWorker.lowPriority) { order.add(4) },
                )
                val observerFailure = AtomicReference<Throwable>()
                val observer = Thread.ofPlatform().daemon().start {
                    try {
                        results.forEach { it.await() shouldBe true }
                    } catch (caught: Throwable) {
                        observerFailure.set(caught)
                    }
                }

                // when allowing the initializer to return and awaiting all results externally
                release.countDown()
                observer.joinWithinTimeout()

                // then execute both high-priority tasks first and keep the world running
                observerFailure.get()?.let { throw it }
                order shouldBe listOf(1, 2, 3, 4)
                results.all { it.isDone } shouldBe true
                running.main.isAlive shouldBe true
            } finally {
                release.countDown()
            }
        }
    }

    should("complete queued results exceptionally and join workers before shutdown finishes") {
        // given a blocked main worker and another task pinned behind it
        val initialized = CountDownLatch(1)
        val blocked = CountDownLatch(1)
        val release = CountDownLatch(1)
        val world = AtomicReference<TaskWorld>()
        val workerThread = AtomicReference<Thread>()
        val queuedRan = AtomicBoolean()
        RunningTaskWorld(TaskWorldBackendImpl(2)) {
            world.set(this)
            workerThread.set(Thread.currentThread())
            initialized.countDown()
        }.use { running ->
            try {
                check(initialized.await(5, TimeUnit.SECONDS))
                val subject = world.get()
                subject.fork(subject.mainWorker.highPriority) {
                    blocked.countDown()
                    check(release.await(5, TimeUnit.SECONDS))
                }
                check(blocked.await(5, TimeUnit.SECONDS))
                val queued = subject.fork(subject.mainWorker.lowPriority) { queuedRan.set(true) }

                // when interrupting the main worker and waiting for shutdown
                running.main.interrupt()
                running.awaitTermination()

                // then reject the queued task with the shutdown failure and stop every worker
                queued.isDone shouldBe true
                shouldThrow<InterruptedException> { queued.await() } shouldBeSameInstanceAs running.failure.get()
                queuedRan.get() shouldBe false
                workerThread.get().isAlive shouldBe false
                running.main.isAlive shouldBe false
            } finally {
                release.countDown()
            }
        }
    }

    should("interrupt an external await without cancelling its task or clearing interruption") {
        // given a task held before completion and an external observer
        runTaskWorld {
            val release = CountDownLatch(1)
            val observing = CountDownLatch(1)
            val failure = AtomicReference<Throwable>()
            val interrupted = AtomicBoolean()
            val result = fork(mainWorker.highPriority) {
                check(release.await(5, TimeUnit.SECONDS))
                42
            }
            val observer = Thread.ofPlatform().daemon().start {
                try {
                    observing.countDown()
                    result.await() shouldBe 42
                } catch (caught: Throwable) {
                    failure.set(caught)
                    interrupted.set(Thread.currentThread().isInterrupted)
                }
            }

            // when interrupting the observer while the result is unavailable
            try {
                check(observing.await(5, TimeUnit.SECONDS))
                observer.interrupt()
                observer.joinWithinTimeout()

                // then retain interruption and leave the task incomplete
                failure.get().shouldBeInstanceOf<InterruptedException>()
                interrupted.get() shouldBe true
                result.isDone shouldBe false
            } finally {
                release.countDown()
                observer.interrupt()
                observer.joinWithinTimeout()
            }

            // and allow another observer to receive the task's eventual result
            result.await() shouldBe 42
        }
    }
})

private class RunningTaskWorld(backend: TaskWorldBackend, initializer: TaskFn<Unit>) : AutoCloseable {
    val failure = AtomicReference<Throwable>()
    val main: Thread = Thread.ofPlatform().daemon().start {
        try {
            TaskWorld.start(backend = backend, initializer = initializer)
        } catch (caught: Throwable) {
            failure.set(caught)
        }
    }

    fun awaitTermination() {
        main.joinWithinTimeout()
    }

    override fun close() {
        main.interrupt()
        awaitTermination()
    }
}

private fun Thread.joinWithinTimeout() {
    join(5_000)
    if (isAlive) {
        interrupt()
        join(5_000)
        error("Task thread did not finish within five seconds")
    }
}
