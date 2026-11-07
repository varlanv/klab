package com.varlanv.klab.tasks

import com.varlanv.klab.tasks.Task.Target
import com.varlanv.klab.testing.BaseSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe

class TaskTargetSpec : BaseSpec({

    should("preserve the tag and worker independently across signed boundaries") {
        // given valid tags and worker identifiers including the empty sentinel
        val tags = listOf(-1, 0, 3, Short.MAX_VALUE.toInt())
        val workerIds = listOf(-1, 0, 1, Short.MAX_VALUE.toInt())

        // expect each packed field to retain its value independently
        for (tag in tags) {
            for (workerId in workerIds) {
                val target = Target((tag shl 16) or (workerId and 0xffff))
                target.tag shouldBe tag
                target.workerId.value shouldBe workerId.toShort()
            }
        }
    }

    should("recognize only the empty worker identifier as any worker") {
        // expect the sentinel to be distinct from worker zero and positive identifiers
        TargetWorkerId((-1).toShort()).isAnyWorker shouldBe true
        TargetWorkerId(0).isAnyWorker shouldBe false
        TargetWorkerId(1).isAnyWorker shouldBe false
        TargetWorkerId(Short.MAX_VALUE).isAnyWorker shouldBe false
    }

    should("reject tags below the empty sentinel without affecting the worker identifier") {
        // given invalid signed tags with a valid worker identifier
        val tags = listOf(-2, Short.MIN_VALUE.toInt())

        // expect tag access to reject each invalid value while preserving worker zero
        for (tag in tags) {
            val target = Target(tag shl 16)
            target.workerId.value shouldBe 0.toShort()
            shouldThrow<AssertionError> { target.tag }
        }
    }

    should("reject packed worker identifiers below the empty sentinel without affecting the tag") {
        // given invalid signed worker identifiers with a valid tag
        val workerIds = listOf(-2, Short.MIN_VALUE.toInt())

        // expect worker access to reject each invalid value while preserving the tag
        for (workerId in workerIds) {
            val target = Target((3 shl 16) or (workerId and 0xffff))
            target.tag shouldBe 3
            shouldThrow<AssertionError> { target.workerId }
        }
    }

    should("reject worker identifiers below the empty sentinel when constructed directly") {
        // expect invalid signed identifiers to fail their invariant
        shouldThrow<AssertionError> { TargetWorkerId((-2).toShort()) }
        shouldThrow<AssertionError> { TargetWorkerId(Short.MIN_VALUE) }
    }
})
