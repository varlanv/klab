package com.varlanv.klab.tasks

import com.varlanv.klab.testing.BaseSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.atomic.AtomicIntegerArray
import java.util.concurrent.atomic.AtomicReference

class WorkDequeSpec : BaseSpec({

    should("reject capacities that are not positive powers of two") {
        // expect invalid capacities to fail before allocating the ring
        for (capacity in listOf(-1, 0, 3, 6)) {
            shouldThrow<AssertionError> { WorkDeque<Any>(capacity) }
        }
    }

    should("return no work from an empty deque") {
        // given an empty deque
        val subject = WorkDeque<Int>(4)

        // expect both consumers to leave the deque empty
        repeat(3) {
            subject.pop() shouldBe null
            subject.steal() shouldBe null
        }
    }

    should("return the newest work to its owner") {
        // given three queued items
        val subject = WorkDeque<Int>(4)
        for (value in 1..3) {
            subject.push(value) shouldBe true
        }

        // expect the owner to consume them in reverse order
        subject.pop() shouldBe 3
        subject.pop() shouldBe 2
        subject.pop() shouldBe 1
        subject.pop() shouldBe null
    }

    should("give thieves the oldest work") {
        // given three queued items
        val subject = WorkDeque<Int>(4)
        for (value in 1..3) {
            subject.push(value) shouldBe true
        }

        // expect stealing to preserve submission order
        subject.steal() shouldBe 1
        subject.steal() shouldBe 2
        subject.steal() shouldBe 3
        subject.steal() shouldBe null
    }

    should("remove the requested instance from the owner's end") {
        // given two queued instances
        val subject = WorkDeque<Any>(2)
        val first = Any()
        val last = Any()
        subject.push(first) shouldBe true
        subject.push(last) shouldBe true

        // when removing the instance at the owner's end
        val removed = subject.popIf(last)

        // then preserve the older instance
        removed shouldBe true
        subject.pop() shouldBe first
        subject.pop() shouldBe null
    }

    should("leave both entries intact when the requested instance is not last") {
        // given an older instance below another entry
        val subject = WorkDeque<Any>(2)
        val first = Any()
        val last = Any()
        subject.push(first) shouldBe true
        subject.push(last) shouldBe true

        // when requesting removal of the older entry
        val removed = subject.popIf(first)

        // then leave the entire deque unchanged
        removed shouldBe false
        subject.pop() shouldBe last
        subject.pop() shouldBe first
    }

    should("keep equal entries unless their identities match") {
        // given equal but distinct instances
        data class Entry(val id: Int)
        val subject = WorkDeque<Entry>(1)
        val queued = Entry(1)
        val equal = Entry(1)
        subject.push(queued) shouldBe true

        // expect conditional removal to use identity
        subject.popIf(equal) shouldBe false
        subject.popIf(queued) shouldBe true
        subject.pop() shouldBe null
    }

    should("leave an empty deque reusable after conditional removal") {
        // given an empty deque and an absent instance
        val subject = WorkDeque<Any>(1)
        val value = Any()

        // expect unsuccessful removal to preserve the empty slot
        subject.popIf(value) shouldBe false
        subject.push(value) shouldBe true
        subject.popIf(value) shouldBe true
        subject.popIf(value) shouldBe false
    }

    should("reject overflow without replacing queued work") {
        // given a full deque
        val subject = WorkDeque<Int>(2)
        subject.push(1) shouldBe true
        subject.push(2) shouldBe true

        // when submitting beyond its capacity
        val accepted = subject.push(3)

        // then retain both original items
        accepted shouldBe false
        subject.steal() shouldBe 1
        subject.pop() shouldBe 2
        subject.pop() shouldBe null
    }

    should("reuse every slot after both ends wrap around the ring") {
        // given a small deque that will wrap repeatedly
        val subject = WorkDeque<Int>(4)

        // expect alternating consumers to preserve each batch
        repeat(100) { batch ->
            val first = batch * 4
            repeat(4) { offset ->
                subject.push(first + offset) shouldBe true
            }
            subject.steal() shouldBe first
            subject.pop() shouldBe first + 3
            subject.steal() shouldBe first + 1
            subject.pop() shouldBe first + 2
            subject.steal() shouldBe null
        }
    }

    should("reuse a single slot after alternating owner and thief consumption") {
        // given a deque with one slot
        val subject = WorkDeque<Any>(1)
        val value = Any()

        // expect the same instance to survive repeated reuse
        repeat(100) {
            subject.push(value) shouldBe true
            subject.pop() shouldBe value
            subject.push(value) shouldBe true
            subject.steal() shouldBe value
        }
    }

    should("deliver each item exactly once while the owner races multiple thieves") {
        // given a ring much smaller than the submitted workload
        val subject = WorkDeque<Int>(8)
        val count = 20_000
        val seen = AtomicIntegerArray(count)

        // when pushes and owner pops race three thieves through repeated wraps
        raceDeque(subject = subject, count = count, value = { it }) { value ->
            seen.incrementAndGet(value) shouldBe 1
        }

        // then every item is consumed and the ring is reusable
        repeat(count) { value ->
            seen.get(value) shouldBe 1
        }
        subject.pop() shouldBe null
        subject.steal() shouldBe null
        subject.push(count) shouldBe true
        subject.pop() shouldBe count
    }

    should("preserve repeated instances while thieves race slot reuse") {
        // given one object reused for every submission
        val subject = WorkDeque<Any>(2)
        val value = Any()
        val consumed = AtomicInteger()
        val count = 10_000

        // when owner and thieves repeatedly consume the same instance
        raceDeque(subject = subject, count = count, value = { value }) { item ->
            (item === value) shouldBe true
            consumed.incrementAndGet()
        }

        // then no reuse is mistaken for an earlier submission
        consumed.get() shouldBe count
        subject.pop() shouldBe null
        subject.steal() shouldBe null
    }
})

private fun <T : Any> raceDeque(
    subject: WorkDeque<T>,
    count: Int,
    value: (Int) -> T,
    consume: (T) -> Unit,
) {
    val start = CountDownLatch(1)
    val stopped = AtomicBoolean()
    val consumed = AtomicInteger()
    val failure = AtomicReference<Throwable>()
    val thieves = List(3) {
        Thread.ofPlatform().daemon().start {
            try {
                check(start.await(5, TimeUnit.SECONDS))
                while (!stopped.get()) {
                    val item = subject.steal()
                    if (item != null) {
                        consume(item)
                        consumed.incrementAndGet()
                    } else {
                        Thread.onSpinWait()
                    }
                }
            } catch (caught: Throwable) {
                failure.compareAndSet(null, caught)
                stopped.set(true)
            }
        }
    }
    val deadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(5)
    try {
        start.countDown()
        repeat(count) { index ->
            val item = value(index)
            while (!subject.push(item)) {
                failure.get()?.let { throw it }
                check(System.nanoTime() < deadline)
                subject.pop()?.let {
                    consume(it)
                    consumed.incrementAndGet()
                }
            }
            if (index and 3 == 0) {
                subject.pop()?.let {
                    consume(it)
                    consumed.incrementAndGet()
                }
            }
        }
        while (consumed.get() < count) {
            failure.get()?.let { throw it }
            check(System.nanoTime() < deadline)
            subject.pop()?.let {
                consume(it)
                consumed.incrementAndGet()
            }
        }
    } finally {
        stopped.set(true)
        start.countDown()
        for (thief in thieves) {
            thief.join(5_000)
            check(!thief.isAlive)
        }
    }
    failure.get()?.let { throw it }
    consumed.get() shouldBe count
}
