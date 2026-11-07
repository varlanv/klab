package com.varlanv.klab.tasks

import com.varlanv.klab.tasks.Task.Target
import com.varlanv.klab.testing.BaseSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeSameInstanceAs
import java.util.concurrent.CancellationException
import java.util.concurrent.ConcurrentLinkedQueue
import java.util.concurrent.CountDownLatch
import java.util.concurrent.CyclicBarrier
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicReference

class TaskWorldSpec : BaseSpec({

    should("initialize on a background platform worker when another worker is available") {
        // when starting a world with a main worker and a background worker
        runTaskWorld {

            // then initialize on the background worker with the requested parallelism
            parallelism shouldBe 2
            currentWorker.isMain shouldBe false
            Thread.currentThread().isVirtual shouldBe false
            mainWorker.isMain shouldBe true
        }
    }

    should("initialize on the main worker when it is the only worker") {
        // when starting a world with one worker
        runTaskWorld(1) {

            // then attach the initializer to the main worker
            currentWorker shouldBeSameInstanceAs mainWorker
            currentWorker.isMain shouldBe true
            currentWorker.highPriority.workerId.value shouldBe 0.toShort()
        }
    }

    should("reject worker access from an unattached thread") {
        // given a backend without an attached caller
        val backend = TaskWorldBackendImpl(1)

        // expect worker access to fail
        shouldThrow<IllegalStateException> { backend.currentWorker }
    }

    should("propagate the original initializer failure after stopping its worker") {
        // given an initializer failure and a place to retain its thread
        val failure = IllegalStateException("initializer failed")
        val workerThread = AtomicReference<Thread>()

        // when the initializer fails
        val caught = shouldThrow<IllegalStateException> {
            runTaskWorld {
                workerThread.set(Thread.currentThread())
                throw failure
            }
        }

        // then expose the same failure after the worker has terminated
        caught shouldBeSameInstanceAs failure
        workerThread.get().isAlive shouldBe false
    }

    should("execute an eligible task immediately on the current worker") {
        // given an attached worker
        runTaskWorld {
            val worker = currentWorker
            val thread = Thread.currentThread()

            // when executing a task on that worker
            val value = execute(worker.highPriority) {
                currentWorker shouldBeSameInstanceAs worker
                Thread.currentThread() shouldBeSameInstanceAs thread
                42
            }

            // then return its value directly
            value shouldBe 42
        }
    }

    should("execute main-targeted work on the main worker and resume its caller") {
        // given an initializer on a background worker
        runTaskWorld {
            val callerWorker = currentWorker
            val callerThread = Thread.currentThread()

            // when executing work on the main worker
            val mainThread = execute(mainWorker.lowPriority) {
                currentWorker shouldBeSameInstanceAs mainWorker
                Thread.currentThread()
            }

            // then preserve main affinity and resume the original caller
            (mainThread === callerThread) shouldBe false
            currentWorker shouldBeSameInstanceAs callerWorker
            Thread.currentThread() shouldBeSameInstanceAs callerThread
            execute(mainWorker.highPriority) { Thread.currentThread() } shouldBeSameInstanceAs mainThread
        }
    }

    should("return to an exact worker while that worker awaits a main-thread task") {
        // given an initializer that retains its worker and thread
        runTaskWorld {
            val owner = currentWorker
            val ownerThread = Thread.currentThread()

            // when main-thread work calls back onto the awaiting owner
            val result = fork(mainWorker.highPriority) {
                execute(owner.lowPriority) {
                    currentWorker shouldBeSameInstanceAs owner
                    Thread.currentThread()
                }
            }.await()

            // then complete the dependency on the owner's original thread
            result shouldBeSameInstanceAs ownerThread
        }
    }

    should("execute work pinned to worker two only on that worker") {
        // given a target pinned to worker two and a caller on main
        runTaskWorld(3) {
            val target = Target((Target.ANY_AVAILABLE_HIGH_PRIORITY shl 16) or 2)

            // when main executes work for that target
            val worker = execute(mainWorker.highPriority) {
                execute(target) { currentWorker }
            }

            // then preserve the requested worker affinity
            worker.highPriority.workerId.value shouldBe 2.toShort()
            worker.isMain shouldBe false
        }
    }

    should("restore the caller priority after inline execution fails") {
        // given a high-priority caller and a queued high-priority task
        runTaskWorld(1) {
            var ran = false
            val pending = fork(currentWorker.highPriority) { ran = true }
            val failure = IllegalArgumentException("inline failed")

            // when low-priority inline execution fails and the caller yields
            shouldThrow<IllegalArgumentException> {
                execute(currentWorker.lowPriority) { throw failure }
            } shouldBeSameInstanceAs failure
            yield()

            // then retain the caller's high priority and leave the task queued
            ran shouldBe false
            pending.await()
            ran shouldBe true
        }
    }

    should("publish completion and retain the same result for repeated awaits") {
        // given a task queued behind the only worker's initializer
        runTaskWorld(1) {
            val value = Any()
            val result = fork(currentWorker.lowPriority) { value }
            result.isDone shouldBe false

            // when awaiting its result
            val actual = result.await()

            // then publish completion and preserve the result identity
            result.isDone shouldBe true
            actual shouldBeSameInstanceAs value
            result.await() shouldBeSameInstanceAs value
        }
    }

    should("return null and unit results without confusing them with incomplete tasks") {
        // given tasks returning null and unit
        runTaskWorld(1) {
            val nullable = fork<String?>(currentWorker.lowPriority) { null }
            val unit = fork(currentWorker.lowPriority) { Unit }

            // expect both values to complete normally
            nullable.await() shouldBe null
            nullable.isDone shouldBe true
            unit.await() shouldBe Unit
            unit.isDone shouldBe true
        }
    }

    should("rethrow the original failure on every await") {
        // given a task that fails
        runTaskWorld(1) {
            val failure = IllegalArgumentException("task failed")
            val result = fork(currentWorker.lowPriority) { throw failure }

            // expect every observer to receive that same failure
            repeat(2) {
                shouldThrow<IllegalArgumentException> { result.await() } shouldBeSameInstanceAs failure
            }
            result.isDone shouldBe true
        }
    }

    should("preserve errors as task failures without losing the worker") {
        // given a task that throws an error
        runTaskWorld(1) {
            val failure = AssertionError("task failed")
            val result = fork(currentWorker.lowPriority) { throw failure }

            // when awaiting the failed task
            shouldThrow<AssertionError> { result.await() } shouldBeSameInstanceAs failure

            // then allow the worker to execute subsequent work
            fork(currentWorker.highPriority) { 42 }.await() shouldBe 42
        }
    }

    should("restore interruption when inline execution throws an interrupted exception") {
        // given an interrupted exception thrown by inline work
        runTaskWorld(1) {
            val failure = InterruptedException("inline interrupted")

            // when executing the failing work on the current worker
            try {
                val caught = shouldThrow<InterruptedException> {
                    execute(currentWorker.lowPriority) { throw failure }
                }

                // then preserve the original exception and restore the interrupt flag
                caught shouldBeSameInstanceAs failure
                Thread.currentThread().isInterrupted shouldBe true
            } finally {
                Thread.interrupted()
            }
        }
    }

    should("restore interruption when awaited work throws an interrupted exception") {
        // given an interrupted exception thrown by queued work
        runTaskWorld(1) {
            val failure = InterruptedException("queued task interrupted")
            val result = fork(currentWorker.lowPriority) { throw failure }

            // when helping the queued work while awaiting its result
            try {
                val caught = shouldThrow<InterruptedException> { result.await() }

                // then preserve the original exception and restore the interrupt flag
                caught shouldBeSameInstanceAs failure
                Thread.currentThread().isInterrupted shouldBe true
            } finally {
                Thread.interrupted()
            }
        }
    }

    should("treat a cancellation exception as a task failure without interrupting the worker") {
        // given a task that throws a cancellation exception
        runTaskWorld(1) {
            val failure = CancellationException("task failed")
            val result = fork(currentWorker.lowPriority) { throw failure }

            // when awaiting the failed task
            shouldThrow<CancellationException> { result.await() } shouldBeSameInstanceAs failure

            // then preserve the worker's interrupt status and ability to execute work
            Thread.currentThread().isInterrupted shouldBe false
            fork(currentWorker.highPriority) { 42 }.await() shouldBe 42
        }
    }

    should("complete nested awaits with only one worker") {
        // given a single worker and an unrestricted low-priority target
        runTaskWorld(1) {
            val target = Target((Target.ANY_AVAILABLE_LOW_PRIORITY shl 16) or 0xffff)

            // when a queued task awaits another queued task
            val result = fork(target) {
                fork(target) { 41 }.await() + 1
            }.await()

            // then help both tasks complete on the available worker
            result shouldBe 42
        }
    }

    should("allow several external threads to await the same result") {
        // given a task whose completion is controlled by a latch
        runTaskWorld {
            val release = CountDownLatch(1)
            val observing = CountDownLatch(4)
            val value = Any()
            val result = fork(mainWorker.highPriority) {
                check(release.await(5, TimeUnit.SECONDS))
                value
            }
            val values = ConcurrentLinkedQueue<Any>()
            val failure = AtomicReference<Throwable>()
            val observers = List(4) {
                Thread.ofPlatform().daemon().start {
                    try {
                        observing.countDown()
                        values.add(result.await())
                    } catch (caught: Throwable) {
                        failure.compareAndSet(null, caught)
                    }
                }
            }

            // when releasing the task after all observers start awaiting
            try {
                check(observing.await(5, TimeUnit.SECONDS))
            } finally {
                release.countDown()
                observers.forEach { it.awaitTaskTermination() }
            }

            // then deliver the same value to every observer
            failure.get()?.let { throw it }
            values.size shouldBe 4
            values.forEach { it shouldBeSameInstanceAs value }
        }
    }

    should("run joined branches concurrently on their requested workers") {
        // given two workers and a barrier requiring both branches to run
        runTaskWorld {
            val barrier = CyclicBarrier(2)
            val callerThread = Thread.currentThread()

            // when joining a caller-bound branch and a main-bound branch
            val result = join(
                targetA = currentWorker.highPriority,
                handleA = {
                    barrier.await(5, TimeUnit.SECONDS)
                    Thread.currentThread()
                },
                targetB = mainWorker.highPriority,
                handleB = {
                    barrier.await(5, TimeUnit.SECONDS)
                    currentWorker
                },
            )

            // then return both results in branch order
            result.first shouldBeSameInstanceAs callerThread
            result.second shouldBeSameInstanceAs mainWorker
        }
    }

    should("finish the other joined branch before propagating the first branch failure") {
        // given a single worker and a failing first branch
        runTaskWorld(1) {
            val failure = IllegalStateException("first failed")
            var secondFinished = false

            // when joining the failing branch with queued work
            val caught = shouldThrow<IllegalStateException> {
                join(
                    targetA = currentWorker.highPriority,
                    handleA = { throw failure },
                    targetB = currentWorker.lowPriority,
                    handleB = { secondFinished = true },
                )
            }

            // then finish the second branch and preserve the original failure
            secondFinished shouldBe true
            caught shouldBeSameInstanceAs failure
        }
    }

    should("propagate the second joined branch failure after the first branch succeeds") {
        // given a failing second branch
        runTaskWorld(1) {
            val failure = IllegalStateException("second failed")
            var firstFinished = false

            // when joining both branches
            val caught = shouldThrow<IllegalStateException> {
                join(
                    targetA = currentWorker.highPriority,
                    handleA = { firstFinished = true },
                    targetB = currentWorker.lowPriority,
                    handleB = { throw failure },
                )
            }

            // then finish the first branch and preserve the second branch failure
            firstFinished shouldBe true
            caught shouldBeSameInstanceAs failure
        }
    }

    should("preserve the first branch failure when both joined branches fail") {
        // given two failing branches
        runTaskWorld(1) {
            val first = IllegalStateException("first failed")
            val second = IllegalArgumentException("second failed")
            var secondFinished = false

            // when joining both failures
            val caught = shouldThrow<IllegalStateException> {
                join(
                    targetA = currentWorker.highPriority,
                    handleA = { throw first },
                    targetB = currentWorker.lowPriority,
                    handleB = {
                        secondFinished = true
                        throw second
                    },
                )
            }

            // then observe both branches and retain the first failure
            secondFinished shouldBe true
            caught shouldBeSameInstanceAs first
        }
    }

    should("run exactly one high-priority task at each low-priority yield") {
        // given a low-priority task and two queued high-priority tasks
        runTaskWorld(1) {
            execute(currentWorker.lowPriority) {
                val completed = mutableListOf<Int>()
                fork(currentWorker.highPriority) { completed.add(1) }
                fork(currentWorker.highPriority) { completed.add(2) }

                // when yielding once
                yield()

                // then complete only the first high-priority task
                completed shouldBe listOf(1)

                // when yielding again
                yield()

                // then resume at low priority and complete the remaining task
                completed shouldBe listOf(1, 2)
            }
        }
    }

    should("leave low-priority tasks queued when yielding") {
        // given a low-priority task with more low-priority work queued
        runTaskWorld(1) {
            execute(currentWorker.lowPriority) {
                var ran = false
                val pending = fork(currentWorker.lowPriority) { ran = true }

                // when yielding without pending high-priority work
                yield()

                // then leave the low-priority task queued until awaited
                ran shouldBe false
                pending.await()
                ran shouldBe true
            }
        }
    }

    should("leave queued work untouched when a high-priority task yields") {
        // given a high-priority initializer and queued high-priority work
        runTaskWorld(1) {
            var ran = false
            val pending = fork(currentWorker.highPriority) { ran = true }

            // when yielding from high priority
            yield()

            // then continue without executing the queued task
            ran shouldBe false
            pending.await()
            ran shouldBe true
        }
    }

    should("resume a yielding task after high-priority work fails") {
        // given a low-priority task and a failing high-priority task
        runTaskWorld(1) {
            execute(currentWorker.lowPriority) {
                val failure = IllegalArgumentException("high-priority task failed")
                val failed = fork(currentWorker.highPriority) { throw failure }
                var nextRan = false
                fork(currentWorker.highPriority) { nextRan = true }

                // when yielding to the failing task
                yield()

                // then retain the failure on its own result and resume at low priority
                failed.isDone shouldBe true
                shouldThrow<IllegalArgumentException> { failed.await() } shouldBeSameInstanceAs failure
                nextRan shouldBe false
                yield()
                nextRan shouldBe true
            }
        }
    }
})

internal fun runTaskWorld(
    parallelism: Int = 2,
    action: TaskFn<Unit>,
) {
    val backend = TaskWorldBackendImpl(parallelism)
    var completed = false
    var failure: Throwable? = null
    val main = Thread.ofPlatform().daemon().unstarted {
        val mainThread = Thread.currentThread()
        try {
            TaskWorld.start(backend) {
                action()
                completed = true
                mainThread.interrupt()
            }
        } catch (caught: Throwable) {
            failure = caught
        }
    }
    main.start()
    main.awaitTaskTermination()
    val caught = failure
    if (!completed || caught !is InterruptedException) {
        throw caught ?: AssertionError("The initializer did not complete")
    }
}

private fun Thread.awaitTaskTermination() {
    join(5_000)
    if (isAlive) {
        interrupt()
        join(5_000)
        error("Task thread did not finish within five seconds")
    }
}
