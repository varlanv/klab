package com.varlanv.klab.glb

import com.varlanv.klab.testing.BaseSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import java.math.BigDecimal
import kotlin.random.Random

class GltfJsonSpec : BaseSpec({

    should("stop at closing quotes before reading subsequent fields and containers") {
        // given strings around the eight-byte scanning boundary
        for (length in listOf(0, 1, 7, 8, 9, 15, 16, 17, 31, 32, 33)) {
            val expected = "a".repeat(length)
            val source = """{"name":"$expected","enabled":true,"disabled":false,"nothing":null,"numbers":[1,2]}"""
                .toByteArray()
            val subject = GltfJson()

            // when parsing the entire object
            subject.parse(source = source, offset = 0, length = source.size)

            // then finish the string and continue consuming each subsequent value
            subject.string(subject.field(obj = 0, name = "name")) shouldBe expected
            subject.bool(token = subject.field(obj = 0, name = "enabled")) shouldBe true
            subject.bool(
                token = subject.field(
                    obj = 0,
                    name = "disabled",
                ),
                default = true,
            ) shouldBe false
            subject.raw(subject.field(obj = 0, name = "nothing")) shouldBe "null"
            subject.ints(subject.field(obj = 0, name = "numbers")).toList() shouldBe listOf(1, 2)
        }
    }

    should("decode escaped property names and Unicode surrogate pairs") {
        // given an escaped name and a string containing BMP and supplementary characters
        val source = """{"na\u006de":"snowman \u2603 and \ud83e\udd86"}""".toByteArray()
        val subject = GltfJson()

        // when parsing and looking up the decoded property name
        subject.parse(source = source, offset = 0, length = source.size)
        val value = subject.string(subject.field(obj = 0, name = "name"))

        // then decode both Unicode representations
        value shouldBe "snowman ☃ and 🦆"
    }

    should("match JDK float rounding at zero, precision, underflow, and overflow boundaries") {
        // given decimal values around representational boundaries
        val subject = GltfJson()
        val values = listOf(
            "0",
            "-0",
            "0.0",
            "-0.0",
            "1",
            "-1",
            "1.23456789",
            "16777217",
            "3.4028234663852886e38",
            "1.401298464324817e-45",
            "1e-60",
            "-1e-60",
            "1e60",
            "-1e60",
            "0.100000001490116119384765625",
            "123456789012345678901234567890.01234567890123456789",
            "1e2147483648",
            "-1e2147483648",
            "1e-2147483648",
            "-1e-2147483648",
            "0e99999999999999999999999999",
            "-0e-99999999999999999999999999",
            "0.0000000000000000000000000000000000000000000000000000000000000000001",
        )

        // expect identical float bits for finite results and rejection of overflow
        for (value in values) {
            assertFloat(subject = subject, value = value)
        }
    }

    should("match JDK rounding for deterministic random float and double strings") {
        // given a reproducible sample of binary floating-point values
        val subject = GltfJson()
        val random = Random(92716)

        // expect decimal parsing to agree with the JDK for every finite source value
        repeat(50_000) {
            val float = Float.fromBits(random.nextInt())
            val double = Double.fromBits(random.nextLong())
            if (float.isFinite()) {
                assertFloat(subject = subject, value = float.toString())
            }
            if (double.isFinite()) {
                assertFloat(subject = subject, value = double.toString())
            }
        }
    }

    should("match JDK rounding for long decimal significands and varying exponents") {
        // given reproducible decimal inputs longer than a machine integer
        val subject = GltfJson()
        val random = Random(617)

        // expect every finite conversion and overflow decision to match the JDK
        repeat(50_000) {
            val count = random.nextInt(1, 46)
            val digits = buildString {
                append(random.nextInt(1, 10))
                repeat(count - 1) { append(random.nextInt(10)) }
            }
            val split = random.nextInt(1, count + 1)
            val decimal = if (split == count) {
                digits
            } else {
                digits.take(split) + "." + digits.drop(split)
            }
            val sign = if (random.nextBoolean()) { "-" } else { "" }
            val exponent = random.nextInt(-70, 50)
            assertFloat(subject = subject, value = "$sign${decimal}e$exponent")
        }
    }

    should("round exact decimal midpoints and their immediate neighbors like the JDK") {
        // given adjacent positive floats and a decimal perturbation smaller than a float ULP
        val subject = GltfJson()
        val random = Random(721)
        val epsilon = BigDecimal.ONE.scaleByPowerOfTen(-100)

        // expect correct tie-breaking on both sides of zero
        repeat(256) {
            val lower = Float.fromBits(random.nextInt() and 0x7f7ffffe)
            val upper = Math.nextUp(lower)
            val midpoint = BigDecimal(lower.toDouble()).add(BigDecimal(upper.toDouble())).divide(BigDecimal(2))
            for (value in listOf(
                midpoint,
                midpoint.subtract(epsilon),
                midpoint.add(epsilon),
            )) {
                assertFloat(subject = subject, value = value.toPlainString())
                assertFloat(subject = subject, value = value.negate().toPlainString())
            }
        }
    }
})

private fun assertFloat(subject: GltfJson, value: String) {
    val source = """{"value":$value}""".toByteArray()
    subject.parse(source = source, offset = 0, length = source.size)
    val token = subject.field(obj = 0, name = "value")
    val expected = java.lang.Float.parseFloat(value)
    if (expected.isFinite()) {
        (value to subject.float(token = token).toRawBits()) shouldBe (value to expected.toRawBits())
    } else {
        shouldThrow<AssertionError> { subject.float(token = token) }
    }
}
