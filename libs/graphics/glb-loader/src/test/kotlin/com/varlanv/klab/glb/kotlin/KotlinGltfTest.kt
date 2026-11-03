package com.varlanv.klab.glb.kotlin

import com.varlanv.klab.intViewHandle
import com.varlanv.klab.testing.BaseSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import java.math.BigDecimal
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.file.Files
import kotlin.math.abs
import kotlin.random.Random

class KotlinGltfTest : BaseSpec({
    should("materialize all metadata and retain custom extras and extensions") {
        val model = KotlinGltfLoader().load(glb("""
            {"asset":{"version":"2.0","generator":"fixture"},
             "accessors":[{"componentType":5126,"count":1,"type":"SCALAR"}],
             "nodes":[{"name":"joint","camera":0,"extensions":{"KHR_lights_punctual":{"light":0}}}],
             "skins":[{"joints":[0],"skeleton":0}],
             "scenes":[{"nodes":[0]}],"scene":0,
             "animations":[{"samplers":[{"input":0,"output":0,"interpolation":"STEP"}],"channels":[{"sampler":0,"target":{"node":0,"path":"translation"}}]}],
             "cameras":[{"type":"perspective","perspective":{"yfov":0.7,"znear":0.1}}],
             "materials":[{"name":"material","pbrMetallicRoughness":{"metallicFactor":0.25,"baseColorFactor":[1,0.5,0.25,1]},"alphaMode":"MASK","extensions":{"KHR_materials_clearcoat":{"clearcoatFactor":0.7},"KHR_materials_ior":{},"KHR_materials_emissive_strength":{},"KHR_materials_iridescence":{},"CUSTOM_material":{"enabled":true}}}],
             "extensionsUsed":["KHR_lights_punctual","KHR_materials_variants"],
             "extensions":{"KHR_lights_punctual":{"lights":[{"name":"lamp","type":"spot"}]},"KHR_materials_variants":{"variants":[{"name":"alternate"}]},"CUSTOM_root":{"answer":42}},
             "extras":{"label":"retained"}}
        """))
        model.asset.generator shouldBe "fixture"
        model.scene shouldBe 0
        model.scenes[0].nodes.contentEquals(intArrayOf(0)) shouldBe true
        model.skins[0].joints.contentEquals(intArrayOf(0)) shouldBe true
        model.nodes[0].camera shouldBe 0
        model.nodes[0].light shouldBe 0
        model.cameras[0].perspective!!.yfov shouldBe 0.7f
        model.animations[0].samplers[0].interpolation shouldBe 1
        model.animations[0].channels[0].targetPath shouldBe 1
        model.materials[0].metallicRoughness!!.metallicFactor shouldBe 0.25f
        model.materials[0].clearcoat!!.factor shouldBe 0.7f
        model.materials[0].ior shouldBe 1.5f
        model.materials[0].emissiveStrength shouldBe 1f
        model.materials[0].iridescence!!.thicknessMax shouldBe 400f
        model.materials[0].alphaMode shouldBe 1
        model.materials[0].extensions.last().data shouldBe "{\"enabled\":true}"
        model.lights[0].color.contentEquals(floatArrayOf(1f, 1f, 1f)) shouldBe true
        model.variants[0].name shouldBe "alternate"
        model.extensions.last().data shouldBe "{\"answer\":42}"
        model.extras shouldBe "{\"label\":\"retained\"}"
    }

    should("classify indexed and custom attribute names like cgltf") {
        val model = KotlinGltfLoader().load(glb("""{"asset":{"version":"2.0"},"accessors":[{"componentType":5126,"count":1,"type":"SCALAR"}],"meshes":[{"primitives":[{"attributes":{"POSITION":0,"TEXCOORD_2":0,"_CUSTOM_7":0,"UNKNOWN":0,"COLOR":0,"POSITION_1":0}}]}]}"""))
        val attributes = model.meshes[0].primitives[0].attributes
        attributes.map { it.semantic } shouldBe listOf(1, 4, 8, 0, 5, 1)
        attributes.map { it.set } shouldBe listOf(0, 2, 0, 0, 0, 1)
    }

    should("decode escaped property names and Unicode strings") {
        val model = KotlinGltfLoader().load(glb("""{"asset":{"vers\u0069on":"2.0","generator":"snowman \u2603 and \ud83e\udd86"}}"""))
        model.asset.generator shouldBe "snowman ☃ and 🦆"
    }

    should("preserve independently returned models when reusing parser buffers") {
        val loader = KotlinGltfLoader()
        val first = loader.load(glb("""{"asset":{"version":"2.0","generator":"first"},"nodes":[{"name":"original"}]}"""))
        val second = loader.load(glb("""{"asset":{"version":"2.0","generator":"second"},"nodes":[{"name":"replacement"}]}"""))
        first.asset.generator shouldBe "first"
        first.nodes[0].name shouldBe "original"
        second.nodes[0].name shouldBe "replacement"
    }

    should("match signed normalized byte conversion used by cgltf") {
        val model = KotlinGltfLoader().load(glb("""{"asset":{"version":"2.0"},"buffers":[{"byteLength":4}],"bufferViews":[{"buffer":0,"byteLength":4}],"accessors":[{"bufferView":0,"componentType":5120,"normalized":true,"count":1,"type":"VEC4"}]}""", byteArrayOf(-128, 127, 0, -1)))
        val values = FloatArray(4)
        model.copyFloatsTo(0, values)
        values[0] shouldBe -128f / 127f
        values[1] shouldBe 1f
        values[2] shouldBe 0f
        (abs(values[3] + 1f / 127f) < 0.000001f) shouldBe true
    }

    should("skip matrix column padding when unpacking byte matrices") {
        val model = KotlinGltfLoader().load(glb("""{"asset":{"version":"2.0"},"buffers":[{"byteLength":12}],"bufferViews":[{"buffer":0,"byteLength":12}],"accessors":[{"bufferView":0,"componentType":5121,"count":1,"type":"MAT3"}]}""", byteArrayOf(1, 2, 3, 99, 4, 5, 6, 99, 7, 8, 9, 99)))
        val values = FloatArray(9)
        model.copyFloatsTo(0, values)
        values.contentEquals(FloatArray(9) { (it + 1).toFloat() }) shouldBe true
    }

    should("apply sparse values to an accessor without a base buffer view") {
        val payload = ByteBuffer.allocate(12).order(ByteOrder.LITTLE_ENDIAN).put(1).position(4).putFloat(3.5f).putFloat(4.5f).array()
        val model = KotlinGltfLoader().load(glb("""{"asset":{"version":"2.0"},"buffers":[{"byteLength":12}],"bufferViews":[{"buffer":0,"byteLength":1},{"buffer":0,"byteOffset":4,"byteLength":8}],"accessors":[{"componentType":5126,"count":3,"type":"VEC2","sparse":{"count":1,"indices":{"bufferView":0,"componentType":5121},"values":{"bufferView":1}}}]}""", payload))
        val values = FloatArray(6) { 99f }
        model.copyFloatsTo(0, values)
        values.contentEquals(floatArrayOf(0f, 0f, 3.5f, 4.5f, 0f, 0f)) shouldBe true
    }

    should("unpack interleaved float attributes without reading adjacent channels") {
        val payload = ByteBuffer.allocate(32).order(ByteOrder.LITTLE_ENDIAN).putFloat(1f).putFloat(2f).putFloat(3f).putFloat(99f).putFloat(4f).putFloat(5f).putFloat(6f).putFloat(99f).array()
        val model = KotlinGltfLoader().load(glb("""{"asset":{"version":"2.0"},"buffers":[{"byteLength":32}],"bufferViews":[{"buffer":0,"byteLength":32,"byteStride":16}],"accessors":[{"bufferView":0,"componentType":5126,"count":2,"type":"VEC3"}]}""", payload))
        val values = FloatArray(6)
        model.copyFloatsTo(0, values)
        values.contentEquals(floatArrayOf(1f, 2f, 3f, 4f, 5f, 6f)) shouldBe true
    }

    should("preserve all unsigned index bits when unpacking integer indices") {
        val payload = ByteBuffer.allocate(12).order(ByteOrder.LITTLE_ENDIAN).putInt(0).putInt(Int.MAX_VALUE).putInt(-1).array()
        val model = KotlinGltfLoader().load(glb("""{"asset":{"version":"2.0"},"buffers":[{"byteLength":12}],"bufferViews":[{"buffer":0,"byteLength":12}],"accessors":[{"bufferView":0,"componentType":5125,"count":3,"type":"SCALAR"}]}""", payload))
        val values = IntArray(3)
        model.copyIndicesTo(0, values)
        values.contentEquals(intArrayOf(0, Int.MAX_VALUE, -1)) shouldBe true
    }

    should("compose parent translation with child scale and translation") {
        val model = KotlinGltfLoader().load(glb("""{"asset":{"version":"2.0"},"nodes":[{"translation":[2,3,4],"children":[1]},{"translation":[1,0,0],"scale":[2,3,4]}],"scenes":[{"nodes":[0]}],"scene":0}"""))
        val local = FloatArray(16)
        val world = FloatArray(16)
        model.copyLocalTransformTo(1, local)
        model.copyWorldTransformTo(1, world)
        local[12] shouldBe 1f
        world.contentEquals(floatArrayOf(2f, 0f, 0f, 0f, 0f, 3f, 0f, 0f, 0f, 0f, 4f, 0f, 3f, 3f, 4f, 1f)) shouldBe true
        model.nodes[1].parent shouldBe 0
    }

    should("load base64 buffers and resolve percent encoded external buffer paths") {
        val loader = KotlinGltfLoader()
        val embedded = loader.load("""{"asset":{"version":"2.0"},"buffers":[{"byteLength":4,"uri":"data:application/octet-stream;base64,AQIDBA=="}]}""".toByteArray())
        embedded.bufferSources[0].contentEquals(byteArrayOf(1, 2, 3, 4)) shouldBe true
        var resolved = ""
        val external = loader.load("""{"asset":{"version":"2.0"},"buffers":[{"byteLength":4,"uri":"a%20b.bin"}]}""".toByteArray()) { uri -> resolved = uri; byteArrayOf(4, 3, 2, 1) }
        resolved shouldBe "a b.bin"
        external.bufferSources[0].contentEquals(byteArrayOf(4, 3, 2, 1)) shouldBe true
    }

    should("reject buffer views outside the declared buffer payload") {
        shouldThrow<IllegalArgumentException> {
            KotlinGltfLoader().load(glb("""{"asset":{"version":"2.0"},"buffers":[{"byteLength":4}],"bufferViews":[{"buffer":0,"byteOffset":2,"byteLength":4}]}""", ByteArray(4)))
        }
    }

    should("reject primitive indices outside the vertex count") {
        shouldThrow<IllegalArgumentException> {
            KotlinGltfLoader().load(glb("""{"asset":{"version":"2.0"},"buffers":[{"byteLength":3}],"bufferViews":[{"buffer":0,"byteLength":3}],"accessors":[{"componentType":5126,"count":3,"type":"VEC3"},{"bufferView":0,"componentType":5121,"count":3,"type":"SCALAR"}],"meshes":[{"primitives":[{"attributes":{"POSITION":0},"indices":1}]}]}""", byteArrayOf(0, 1, 3)))
        }
    }

    should("reject invalid references and cyclic node hierarchies") {
        for (json in arrayOf(
            """{"asset":{"version":"2.0"},"nodes":[{"mesh":0}]}""",
            """{"asset":{"version":"2.0"},"nodes":[{"children":[1]},{"children":[0]}]}""",
            """{"asset":{"version":"2.0"},"nodes":[{"children":[2]}]}""",
        )) shouldThrow<IllegalArgumentException> { KotlinGltfLoader().load(glb(json)) }
    }

    should("retain scalar mesh extras and reject objects where arrays are required") {
        val model = KotlinGltfLoader().load(glb("""{"asset":{"version":"2.0"},"meshes":[{"primitives":[],"extras":42}]}"""))
        model.meshes[0].extras shouldBe "42"
        for (json in arrayOf(
            """{"asset":{"version":"2.0"},"nodes":{}}""",
            """{"asset":{"version":"2.0"},"nodes":[{"children":{}}]}""",
        )) shouldThrow<IllegalArgumentException> { KotlinGltfLoader().load(glb(json)) }
    }

    should("match scalar index validation across unsigned widths and vector tails") {
        val random = Random(7103)
        val sizes = intArrayOf(1, 7, 15, 16, 17, 31, 32, 33, 63, 64, 65, 129)
        for (type in intArrayOf(5121, 5123, 5125)) for (count in sizes) {
            val width = componentSize(type)
            val payload = ByteBuffer.allocate(count * width).order(ByteOrder.LITTLE_ENDIAN)
            var bound = 0L
            repeat(count) { index ->
                val value = when (type) {
                    5121 -> random.nextInt(256).toLong()
                    5123 -> random.nextInt(65536).toLong()
                    else -> random.nextInt(Int.MAX_VALUE).toLong()
                }
                bound = maxOf(bound, value)
                when (width) { 1 -> payload.put(value.toByte()); 2 -> payload.putShort(value.toShort()); else -> payload.putInt(value.toInt()) }
            }
            scalarIndexBound(payload.array(), 0, type, count) shouldBe bound
            fun fixture(vertices: Long): ByteArray = glb("""{"asset":{"version":"2.0"},"buffers":[{"byteLength":${count * width}}],"bufferViews":[{"buffer":0,"byteLength":${count * width}}],"accessors":[{"componentType":5126,"count":$vertices,"type":"VEC3"},{"bufferView":0,"componentType":$type,"count":$count,"type":"SCALAR"}],"meshes":[{"primitives":[{"attributes":{"POSITION":0},"indices":1}]}]}""", payload.array())
            for (vectorized in booleanArrayOf(false, true)) {
                KotlinGltfLoader(vectorized).load(fixture(bound + 1)).accessors[1].count shouldBe count
                shouldThrow<IllegalArgumentException> { KotlinGltfLoader(vectorized).load(fixture(bound)) }
            }
        }
        val unsigned = ByteBuffer.allocate(260).order(ByteOrder.LITTLE_ENDIAN)
        repeat(65) { unsigned.putInt(if (it == 64) Int.MIN_VALUE else 1) }
        val source = glb("""{"asset":{"version":"2.0"},"buffers":[{"byteLength":260}],"bufferViews":[{"buffer":0,"byteLength":260}],"accessors":[{"componentType":5126,"count":2147483647,"type":"VEC3"},{"bufferView":0,"componentType":5125,"count":65,"type":"SCALAR"}],"meshes":[{"primitives":[{"attributes":{"POSITION":0},"indices":1}]}]}""", unsigned.array())
        scalarIndexBound(unsigned.array(), 0, 5125, 65) shouldBe 2147483648L
        for (vectorized in booleanArrayOf(false, true)) shouldThrow<IllegalArgumentException> { KotlinGltfLoader(vectorized).load(source) }
    }

    should("round decimal JSON numbers exactly like the JDK float parser") {
        val json = GltfJson()
        val cases = mutableListOf("0", "-0", "0.0", "-0.0", "1", "-1", "1.23456789", "16777217", "3.4028234663852886e38", "1.401298464324817e-45", "1e-60", "-1e-60", "1e60", "-1e60", "0.100000001490116119384765625", "123456789012345678901234567890.01234567890123456789")
        val random = Random(617)
        repeat(500) {
            val digits = random.nextInt(1, 40)
            val significant = buildString { append(random.nextInt(1, 10)); repeat(digits - 1) { append(random.nextInt(10)) } }
            val split = random.nextInt(1, significant.length + 1)
            val decimal = if (split == significant.length) significant else significant.substring(0, split) + "." + significant.substring(split)
            cases += (if (random.nextBoolean()) "-" else "") + decimal + "e" + random.nextInt(-65, 50)
        }
        for (value in cases) {
            val bytes = "{\"number\":$value}".toByteArray()
            json.parse(bytes, 0, bytes.size)
            json.float(json.field(0, "number")).toRawBits() shouldBe java.lang.Float.parseFloat(value).toRawBits()
        }
    }

    should("match the JDK for random floating values and decimal midpoint neighbors") {
        val parser = GltfJson()
        fun compare(value: String) {
            val bytes = "{\"value\":$value}".toByteArray()
            parser.parse(bytes, 0, bytes.size)
            val actual = parser.float(parser.field(0, "value")).toRawBits()
            val expected = java.lang.Float.parseFloat(value).toRawBits()
            if (actual != expected) (actual to value) shouldBe (expected to value)
        }
        val random = Random(92716)
        repeat(50_000) {
            val float = Float.fromBits(random.nextInt())
            if (float.isFinite()) compare(float.toString())
            val double = Double.fromBits(random.nextLong())
            if (double.isFinite()) compare(double.toString())
        }
        repeat(50_000) {
            val count = random.nextInt(1, 46)
            val digits = buildString { append(random.nextInt(1, 10)); repeat(count - 1) { append(random.nextInt(10)) } }
            val split = random.nextInt(1, count + 1)
            val decimal = if (split == count) digits else digits.substring(0, split) + "." + digits.substring(split)
            compare((if (random.nextBoolean()) "-" else "") + decimal + "e" + random.nextInt(-70, 50))
        }
        val epsilon = BigDecimal.ONE.scaleByPowerOfTen(-100)
        repeat(256) {
            val lower = Float.fromBits(random.nextInt() and 0x7f7ffffe)
            val upper = Math.nextUp(lower)
            val midpoint = BigDecimal(lower.toDouble()).add(BigDecimal(upper.toDouble())).divide(BigDecimal(2))
            for (value in arrayOf(midpoint, midpoint.subtract(epsilon), midpoint.add(epsilon))) {
                compare(value.toPlainString())
                compare(value.negate().toPlainString())
            }
        }
        for (value in arrayOf("1e2147483648", "-1e2147483648", "1e-2147483648", "-1e-2147483648", "0e99999999999999999999999999", "-0e-99999999999999999999999999", "0.0000000000000000000000000000000000000000000000000000000000000000001")) compare(value)
    }

    should("read sparse unsigned vectors and scalar indices without losing high bits") {
        val vectorBytes = ByteBuffer.allocate(6).order(ByteOrder.LITTLE_ENDIAN).put(1).position(2).putShort(-1).putShort(Short.MIN_VALUE).array()
        val vector = KotlinGltfLoader().load(glb("""{"asset":{"version":"2.0"},"buffers":[{"byteLength":6}],"bufferViews":[{"buffer":0,"byteLength":1},{"buffer":0,"byteOffset":2,"byteLength":4}],"accessors":[{"componentType":5123,"count":3,"type":"VEC2","sparse":{"count":1,"indices":{"bufferView":0,"componentType":5121},"values":{"bufferView":1}}}]}""", vectorBytes))
        val uints = IntArray(2) { -7 }
        val floats = FloatArray(2)
        vector.readUInts(0, 1, uints)
        vector.readFloats(0, 1, floats)
        uints.contentEquals(intArrayOf(65535, 32768)) shouldBe true
        floats.contentEquals(floatArrayOf(65535f, 32768f)) shouldBe true
        vector.readUInts(0, 0, uints)
        uints.contentEquals(intArrayOf(0, 0)) shouldBe true
        val scalarBytes = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).put(2).position(4).putInt(-1).array()
        val scalar = KotlinGltfLoader().load(glb("""{"asset":{"version":"2.0"},"buffers":[{"byteLength":8}],"bufferViews":[{"buffer":0,"byteLength":1},{"buffer":0,"byteOffset":4,"byteLength":4}],"accessors":[{"componentType":5125,"count":3,"type":"SCALAR","sparse":{"count":1,"indices":{"bufferView":0,"componentType":5121},"values":{"bufferView":1}}}]}""", scalarBytes))
        scalar.readIndex(0, 2) shouldBe 4294967295L
        scalar.readIndex(0, 0) shouldBe 0L
        scalar.readUInts(0, 2, uints)
        uints[0] shouldBe -1
    }

    should("match cgltf component conversion for packed and interleaved vectors") {
        val count = 193
        val components = 4
        for (type in intArrayOf(5120, 5121, 5122, 5123, 5125, 5126)) {
            val width = componentSize(type)
            val sourceValues = when (type) {
                5120 -> longArrayOf(-128, -127, -1, 0, 1, 126, 127)
                5121 -> longArrayOf(0, 1, 127, 128, 254, 255)
                5122 -> longArrayOf(-32768, -32767, -1, 0, 1, 32766, 32767)
                5123 -> longArrayOf(0, 1, 32767, 32768, 65534, 65535)
                5125 -> longArrayOf(0, 1, 16777217, 2147483647, 2147483648, 4294967295)
                else -> longArrayOf(0, 0x80000000L, 0x3f800000, 0xbf800000, 0x7f800000, 0xff800000, 0x7fc01234, 1)
            }
            for (normalized in booleanArrayOf(false, true)) for (interleaved in booleanArrayOf(false, true)) {
                val stride = components * width + if (interleaved) 4 else 0
                val payload = ByteBuffer.allocate(count * stride).order(ByteOrder.LITTLE_ENDIAN)
                val expected = FloatArray(count * components)
                repeat(count) { element -> repeat(components) { component ->
                    val output = element * components + component
                    val value = sourceValues[output % sourceValues.size]
                    val address = element * stride + component * width
                    when (width) { 1 -> payload.put(address, value.toByte()); 2 -> payload.putShort(address, value.toShort()); else -> payload.putInt(address, value.toInt()) }
                    expected[output] = when {
                        type == 5126 -> Float.fromBits(value.toInt())
                        !normalized -> value.toFloat()
                        type == 5120 -> value.toFloat() / 127f
                        type == 5121 -> value.toFloat() / 255f
                        type == 5122 -> value.toFloat() / 32767f
                        type == 5123 -> value.toFloat() / 65535f
                        else -> 0f
                    }
                } }
                val source = glb("""{"asset":{"version":"2.0"},"buffers":[{"byteLength":${payload.capacity()}}],"bufferViews":[{"buffer":0,"byteLength":${payload.capacity()},"byteStride":$stride}],"accessors":[{"bufferView":0,"componentType":$type,"normalized":$normalized,"count":$count,"type":"VEC4"}]}""", payload.array())
                for (vectorized in booleanArrayOf(false, true)) {
                    val model = KotlinGltfLoader(vectorized).load(source)
                    val actual = FloatArray(expected.size + 5) { 77f }
                    model.copyFloatsTo(0, actual)
                    repeat(expected.size) { actual[it].toRawBits() shouldBe expected[it].toRawBits() }
                    actual.takeLast(5) shouldBe List(5) { 77f }
                    val element = FloatArray(components)
                    for (index in intArrayOf(0, 1, 127, count - 1)) {
                        model.readFloats(0, index, element)
                        repeat(components) { element[it].toRawBits() shouldBe expected[index * components + it].toRawBits() }
                    }
                }
            }
        }
    }

    should("preserve padding and normalization for multiple matrix component widths") {
        for (type in intArrayOf(5120, 5121, 5122, 5123, 5126)) for (rows in 2..4) {
            val width = componentSize(type)
            val columnSize = (rows * width + 3) and -4
            val stride = rows * columnSize
            val payload = ByteBuffer.allocate(stride * 3).order(ByteOrder.LITTLE_ENDIAN)
            val expected = FloatArray(rows * rows * 3)
            repeat(3) { matrix -> repeat(rows) { column -> repeat(rows) { row ->
                val number = matrix * rows * rows + column * rows + row + 1
                val address = matrix * stride + column * columnSize + row * width
                when (width) { 1 -> payload.put(address, number.toByte()); 2 -> payload.putShort(address, number.toShort()); else -> payload.putFloat(address, number.toFloat()) }
                expected[matrix * rows * rows + column * rows + row] = when (type) { 5120 -> number / 127f; 5121 -> number / 255f; 5122 -> number / 32767f; 5123 -> number / 65535f; else -> number.toFloat() }
            } } }
            val source = glb("""{"asset":{"version":"2.0"},"buffers":[{"byteLength":${payload.capacity()}}],"bufferViews":[{"buffer":0,"byteLength":${payload.capacity()}}],"accessors":[{"bufferView":0,"componentType":$type,"normalized":true,"count":3,"type":"MAT$rows"}]}""", payload.array())
            for (vectorized in booleanArrayOf(false, true)) {
                val model = KotlinGltfLoader(vectorized).load(source)
                val actual = FloatArray(expected.size)
                model.copyFloatsTo(0, actual)
                repeat(expected.size) { actual[it].toRawBits() shouldBe expected[it].toRawBits() }
                val element = FloatArray(rows * rows)
                model.readFloats(0, 2, element)
                repeat(element.size) { element[it].toRawBits() shouldBe expected[element.size * 2 + it].toRawBits() }
            }
        }
    }

    should("copy unsigned indices into each compatible output width across vector tails") {
        val random = Random(721)
        for (type in intArrayOf(5121, 5123, 5125)) for (count in intArrayOf(1, 31, 32, 33, 65, 127, 128, 129, 257)) {
            val width = componentSize(type)
            val payload = ByteBuffer.allocate(count * width).order(ByteOrder.LITTLE_ENDIAN)
            val expected = IntArray(count) { index ->
                val value = if (index == count - 1) -1 else random.nextInt()
                when (width) { 1 -> payload.put(value.toByte()); 2 -> payload.putShort(value.toShort()); else -> payload.putInt(value) }
                when (width) { 1 -> value and 255; 2 -> value and 65535; else -> value }
            }
            val source = glb("""{"asset":{"version":"2.0"},"buffers":[{"byteLength":${payload.capacity()}}],"bufferViews":[{"buffer":0,"byteLength":${payload.capacity()}}],"accessors":[{"bufferView":0,"componentType":$type,"count":$count,"type":"SCALAR"}]}""", payload.array())
            for (vectorized in booleanArrayOf(false, true)) {
                val model = KotlinGltfLoader(vectorized).load(source)
                val actual = IntArray(count + 3) { -7 }
                model.copyIndicesTo(0, actual)
                actual.take(count) shouldBe expected.toList()
                actual.takeLast(3) shouldBe listOf(-7, -7, -7)
                model.readIndex(0, count - 1) shouldBe when (type) { 5121 -> 255L; 5123 -> 65535L; else -> 4294967295L }
                if (width <= 2) {
                    val shorts = ShortArray(count + 3) { -7 }
                    model.copyIndicesTo(0, shorts)
                    shorts.take(count) shouldBe expected.map { it.toShort() }
                    shorts.takeLast(3) shouldBe listOf((-7).toShort(), (-7).toShort(), (-7).toShort())
                }
                if (width == 1) {
                    val bytes = ByteArray(count + 3) { -7 }
                    model.copyIndicesTo(0, bytes)
                    bytes.take(count) shouldBe expected.map { it.toByte() }
                    bytes.takeLast(3) shouldBe listOf((-7).toByte(), (-7).toByte(), (-7).toByte())
                }
            }
        }
    }

    should("resolve file buffers relative to the source path and retain model payloads after reuse") {
        val directory = Files.createTempDirectory("klab-gltf-test-")
        val asset = directory.resolve("scene.gltf")
        val payload = directory.resolve("vertex data.bin")
        try {
            Files.write(payload, ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putFloat(3.5f).putFloat(-4.25f).array())
            Files.writeString(asset, """{"asset":{"version":"2.0"},"buffers":[{"byteLength":8,"uri":"vertex%20data.bin"}],"bufferViews":[{"buffer":0,"byteLength":8}],"accessors":[{"bufferView":0,"componentType":5126,"count":1,"type":"VEC2"}]}""")
            val loader = KotlinGltfLoader()
            val original = loader.load(asset)
            Files.write(payload, ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putFloat(9f).putFloat(10f).array())
            val replacement = loader.load(asset)
            val values = FloatArray(2)
            original.copyFloatsTo(0, values)
            values.contentEquals(floatArrayOf(3.5f, -4.25f)) shouldBe true
            replacement.copyFloatsTo(0, values)
            values.contentEquals(floatArrayOf(9f, 10f)) shouldBe true
            original.bufferViewBytes(0).isReadOnly shouldBe true
            original.bufferViewBytes(0).remaining() shouldBe 8
        } finally {
            Files.deleteIfExists(payload)
            Files.deleteIfExists(asset)
            Files.deleteIfExists(directory)
        }
    }

    should("reject malformed known and custom extension payloads") {
        for (json in arrayOf(
            """{"asset":{"version":"2.0"},"nodes":[{"extensions":{"EXT_mesh_gpu_instancing":{}}}]}""",
            """{"asset":{"version":"2.0"},"materials":[{"extensions":{"KHR_materials_ior":42}}]}""",
            """{"asset":{"version":"2.0"},"textures":[{"extensions":{"KHR_texture_basisu":[]}}]}""",
            """{"asset":{"version":"2.0"},"nodes":[{"extensions":{"KHR_lights_punctual":true}}]}""",
            """{"asset":{"version":"2.0"},"extensions":{"CUSTOM_extension":3}}""",
        )) shouldThrow<IllegalArgumentException> { KotlinGltfLoader().load(glb(json)) }
    }

    should("recover when reusing a loader after malformed JSON or invalid metadata") {
        val loader = KotlinGltfLoader()
        val retained = loader.load(glb("""{"asset":{"version":"2.0","generator":"retained"}}"""))
        for (invalid in arrayOf(
            """{"asset":{"version":"2.0"},"nodes":[{"name":"unfinished"}""".toByteArray(),
            glb("""{"asset":{"version":"2.0"},"nodes":[{"children":[4]}]}"""),
        )) {
            shouldThrow<IllegalArgumentException> { loader.load(invalid) }
            loader.load(glb("""{"asset":{"version":"2.0","generator":"recovered"}}""")).asset.generator shouldBe "recovered"
            retained.asset.generator shouldBe "retained"
        }
    }

    should("reject truncated chunks and required geometry compression") {
        val source = glb("""{"asset":{"version":"2.0"}}""")
        intViewHandle.set(source, 12, source.size)
        shouldThrow<IllegalArgumentException> { KotlinGltfLoader().load(source) }
        shouldThrow<IllegalArgumentException> { KotlinGltfLoader().load(glb("""{"asset":{"version":"2.0"},"extensionsRequired":["KHR_draco_mesh_compression"]}""")) }
    }
})

private fun glb(json: String, bin: ByteArray? = null): ByteArray {
    val encoded = json.trimIndent().toByteArray(Charsets.UTF_8)
    val jsonSize = (encoded.size + 3) and -4
    val binSize = if (bin == null) 0 else (bin.size + 3) and -4
    val bytes = ByteArray(20 + jsonSize + if (bin == null) 0 else 8 + binSize)
    intViewHandle.set(bytes, 0, 0x46546c67)
    intViewHandle.set(bytes, 4, 2)
    intViewHandle.set(bytes, 8, bytes.size)
    intViewHandle.set(bytes, 12, jsonSize)
    intViewHandle.set(bytes, 16, 0x4e4f534a)
    encoded.copyInto(bytes, 20)
    bytes.fill(32, 20 + encoded.size, 20 + jsonSize)
    if (bin != null) {
        intViewHandle.set(bytes, 20 + jsonSize, binSize)
        intViewHandle.set(bytes, 24 + jsonSize, 0x004e4942)
        bin.copyInto(bytes, 28 + jsonSize)
    }
    return bytes
}
