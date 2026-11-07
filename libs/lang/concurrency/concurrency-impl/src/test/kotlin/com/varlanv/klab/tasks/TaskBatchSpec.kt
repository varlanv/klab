package com.varlanv.klab.tasks

import com.varlanv.klab.collections.Array
import com.varlanv.klab.collections.MutArray
import com.varlanv.klab.tasks.Task.Target
import com.varlanv.klab.testing.BaseSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeSameInstanceAs
import java.util.concurrent.CountDownLatch
import java.util.concurrent.CyclicBarrier
import java.util.concurrent.Executors
import java.util.concurrent.FutureTask
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.atomic.AtomicIntegerArray
import java.util.concurrent.locks.LockSupport

class TaskBatchSpec : BaseSpec({

    should("return batch results in submission order with their declared array type") {
        // given tasks with different concrete result types
        runTaskWorld {
            val tasks = arrayOf(
                Task<Number>(mainWorker.highPriority) { 7 },
                Task<Number>(currentWorker.lowPriority) { 2.5 },
                Task<Number>(mainWorker.lowPriority) { 3L },
            )

            // when joining the batch
            val results: Array<Number> = joinAll(tasks)

            // then preserve order and the common element type
            results.toList() shouldBe listOf(7, 2.5, 3L)
            results.javaClass.componentType shouldBe Number::class.java
        }
    }

    should("preserve nullable results in a typed batch") {
        // given tasks returning both null and a value
        runTaskWorld(1) {
            val tasks = arrayOf(
                Task<String?>(mainWorker.highPriority) { null },
                Task<String?>(mainWorker.lowPriority) { "ready" },
            )

            // when joining the batch
            val results = joinAll(tasks)

            // then retain the null slot and array element type
            results.toList() shouldBe listOf(null, "ready")
            results.javaClass.componentType shouldBe String::class.java
        }
    }

    should("return an empty array of the requested type for an empty batch") {
        // given a running world
        runTaskWorld(1) {
            // when joining an empty batch
            val results = joinAll<String>(emptyArray())

            // then preserve its runtime element type without scheduling work
            results.size shouldBe 0
            results.javaClass.componentType shouldBe String::class.java
        }
    }

    should("finish the remaining batch tasks before rethrowing the original failure") {
        // given one failing task followed by successful work
        runTaskWorld(1) {
            val failure = IllegalArgumentException("batch failure")
            var finished = false
            val tasks = arrayOf(
                Task(mainWorker.highPriority) { throw failure },
                Task(mainWorker.lowPriority) { finished = true },
            )

            // when joining the failed batch
            val caught = shouldThrow<IllegalArgumentException> { joinAll(tasks) }

            // then preserve the failure and complete the other task
            caught shouldBeSameInstanceAs failure
            finished shouldBe true
        }
    }

    should("reject an invalid batch target before scheduling any of its tasks") {
        // given a valid task followed by an invalid worker target
        runTaskWorld(1) {
            var executed = false
            val tasks = arrayOf(
                Task(mainWorker.highPriority) { executed = true },
                Task(Target(1)) { executed = true },
            )

            // when rejecting the batch
            shouldThrow<AssertionError> { joinAll(tasks) }

            // then leave the valid task unsubmitted
            execute(mainWorker.lowPriority) { yield() }
            executed shouldBe false
        }
    }

    should("submit beyond local queue capacity without blocking the only worker") {
        // given a single worker that cannot consume while submitting
        runTaskWorld(1) {
            val target = Target((Target.ANY_AVAILABLE_LOW_PRIORITY shl 16) or 0xffff)
            val executions = AtomicInteger()

            // when filling the local deque and its overflow queue
            val results = MutArray(2_048) { index ->
                fork(target) {
                    executions.incrementAndGet()
                    index
                }
            }

            // then submission returns before any job runs and every result completes once
            executions.get() shouldBe 0
            results.forEachIndexed { index, result -> result.await() shouldBe index }
            executions.get() shouldBe results.size
        }
    }

    should("accept concurrent external submissions while preserving main thread affinity") {
        // given external producers and an attached main worker
        runTaskWorld {
            val world = this
            val mainThread = execute(mainWorker.highPriority) { Thread.currentThread() }
            val executor = Executors.newFixedThreadPool(4)
            try {
                // when producers repeatedly submit and wait across idle transitions
                val producers = List(4) {
                    executor.submit {
                        repeat(128) {
                            world
                                .fork(world.mainWorker.highPriority) {
                                    Thread.currentThread()
                                }
                                .await() shouldBeSameInstanceAs mainThread
                        }
                    }
                }

                // then all submissions complete on the attached main thread
                for (producer in producers) {
                    producer.get(5, TimeUnit.SECONDS)
                }
            } finally {
                executor.shutdownNow()
                check(executor.awaitTermination(5, TimeUnit.SECONDS))
            }
        }
    }

    should("execute each task once while awaiting races with stealing") {
        // given several workers sharing unrestricted tasks
        runTaskWorld(4) {
            val target = Target((Target.ANY_AVAILABLE_LOW_PRIORITY shl 16) or 0xffff)
            val executions = AtomicIntegerArray(4_096)

            // when direct awaits compete with other workers taking queued tasks
            val results = MutArray(executions.length()) { index ->
                fork(target) {
                    executions.incrementAndGet(index) shouldBe 1
                    index
                }
            }
            results.forEachIndexed { index, result -> result.await() shouldBe index }

            // then every task has run exactly once
            repeat(executions.length()) { index ->
                executions.get(index) shouldBe 1
            }
        }
    }

    should("complete child tasks when every worker is awaiting its own child") {
        // given one parent task assigned to each worker
        runTaskWorld(4) {
            val parents = CyclicBarrier(parallelism)
            val children = CyclicBarrier(parallelism)
            val target = Target((Target.ANY_AVAILABLE_HIGH_PRIORITY shl 16) or 0xffff)
            val tasks = MutArray(parallelism) { workerId ->
                Task(Target(workerId)) {
                    parents.await(5, TimeUnit.SECONDS)
                    fork(target) {
                        children.await(5, TimeUnit.SECONDS)
                        Thread.currentThread()
                    }.await()
                }
            }

            // when all parents await children that require concurrent execution
            val threads = joinAll(tasks)

            // then helping keeps every worker available to its child
            threads.toSet().size shouldBe parallelism
        }
    }

    should("wake an awaiting worker when its result completes without more queued work") {
        // given a main-thread job whose completion is controlled externally
        runTaskWorld {
            val started = CountDownLatch(1)
            val release = CountDownLatch(1)
            val awaitingThread = Thread.currentThread()
            val result = fork(mainWorker.highPriority) {
                started.countDown()
                check(release.await(5, TimeUnit.SECONDS))
                42
            }
            check(started.await(5, TimeUnit.SECONDS))
            val releaseTask = FutureTask {
                val deadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(5)
                while (LockSupport.getBlocker(awaitingThread) !== result) {
                    check(System.nanoTime() < deadline)
                    Thread.onSpinWait()
                }
                release.countDown()
            }
            val thread = Thread.ofPlatform().daemon().start(releaseTask)
            try {
                // when awaiting with no other runnable work
                val value = result.await()

                // then completion alone wakes the worker
                value shouldBe 42
                releaseTask.get(5, TimeUnit.SECONDS)
            } finally {
                release.countDown()
                thread.interrupt()
                thread.join(5_000)
                check(!thread.isAlive)
            }
        }
    }
})
