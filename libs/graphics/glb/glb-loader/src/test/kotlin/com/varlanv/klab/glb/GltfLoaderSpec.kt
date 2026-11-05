package com.varlanv.klab.glb

import com.varlanv.klab.collections.Bytes
import com.varlanv.klab.collections.MutBytes
import com.varlanv.klab.gpu.assets.PreparedAddressMode
import com.varlanv.klab.gpu.assets.PreparedFilter
import com.varlanv.klab.gpu.assets.PreparedImageFormat
import com.varlanv.klab.gpu.assets.PreparedIndexFormat
import com.varlanv.klab.gpu.assets.PreparedMipmapMode
import com.varlanv.klab.gpu.assets.PreparedModel
import com.varlanv.klab.testing.BaseSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import java.awt.image.BufferedImage
import java.io.ByteArrayOutputStream
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.file.Files
import java.util.Base64
import javax.imageio.ImageIO

class GltfLoaderSpec : BaseSpec({

    should("prepare the application's duck model with its geometry and texture") {
        // given the same GLB resource loaded by the application
        val source = checkNotNull(GltfLoaderSpec::class.java.getResourceAsStream("/models/duck/Duck.glb"))
            .use { it.readAllBytes() }

        // when preparing the complete asset
        val model = GltfLoader().load(source)
        val primitive = model.primitives.single()
        val image = model.images.single()

        // then preserve its mesh instance, indexed geometry, and decoded texture
        model.meshes.single().primitiveCount shouldBe 1
        model.nodes.single().meshIndex shouldBe 0
        primitive.vertexCount shouldBe 2399
        primitive.indexCount shouldBe 12636
        primitive.indexFormat shouldBe PreparedIndexFormat.Uint16
        model.materials.single().imageIndex shouldBe 0
        (image.width > 0 && image.height > 0) shouldBe true
        model.pixels.size shouldBe image.width * image.height * 4
    }

    should("prepare an untextured triangle with generated indices and default attributes") {
        // given a GLB containing only triangle positions
        val source = glb(json = triangleJson())

        // when preparing the model
        val model = GltfLoader().load(source)
        val primitive = model.primitives.single()
        val material = model.materials.single()

        // then expose one mesh instance and a complete packed vertex layout
        model.meshes.single().firstPrimitive shouldBe 0
        model.meshes.single().primitiveCount shouldBe 1
        model.nodes.single().meshIndex shouldBe 0
        model.nodes.single().transform.toList() shouldBe
            listOf(1f, 0f, 0f, 0f, 0f, 1f, 0f, 0f, 0f, 0f, 1f, 0f, 0f, 0f, 0f, 1f)
        primitive.vertexCount shouldBe 3
        primitive.vertexByteSize shouldBe 96
        primitive.vertexOffset shouldBe 0
        primitive.indexOffset shouldBe 96
        primitive.indexCount shouldBe 3
        primitive.indexFormat shouldBe PreparedIndexFormat.Uint16
        indices(model = model) shouldBe listOf(0, 1, 2)
        model.geometry.bytes.take(32) shouldBe floatBytes(0f, 0f, 0f, 0f, 1f, 0f, 0f, 0f).toList()
        model.geometry.positionX(primitive.vertex(1)) shouldBe 1f
        model.geometry.positionY(primitive.vertex(2)) shouldBe 1f

        // and supply an opaque white material without texture resources
        primitive.materialIndex shouldBe 0
        material.baseColor.toList() shouldBe listOf(1f, 1f, 1f, 1f)
        material.alphaCutoff shouldBe -1f
        material.unlit shouldBe false
        material.imageIndex shouldBe -1
        material.samplerIndex shouldBe -1
        model.images.size shouldBe 0
        model.samplers.size shouldBe 0
        model.pixels.size shouldBe 0
    }

    should("read interleaved attributes using their accessor offsets and source stride") {
        // given position, normal, and UV channels separated by a padding float
        val payload = floatBytes(
            0f,
            0f,
            0f,
            0f,
            0f,
            1f,
            0.25f,
            0.5f,
            99f,
            1f,
            0f,
            0f,
            0f,
            1f,
            0f,
            0.5f,
            0.75f,
            99f,
            0f,
            1f,
            0f,
            1f,
            0f,
            0f,
            0.75f,
            1f,
            99f,
        )
        val json = triangleJson(
            bufferLength = payload.size,
            views = """{"buffer":0,"byteLength":108,"byteStride":36}""",
            accessors = """
                {"bufferView":0,"componentType":5126,"count":3,"type":"VEC3","min":[0,0,0],"max":[1,1,0]},
                {"bufferView":0,"byteOffset":12,"componentType":5126,"count":3,"type":"VEC3"},
                {"bufferView":0,"byteOffset":24,"componentType":5126,"count":3,"type":"VEC2"}
            """,
            primitives = """{"attributes":{"POSITION":0,"NORMAL":1,"TEXCOORD_0":2}}""",
        )

        // when preparing the interleaved source
        val model = GltfLoader().load(glb(json = json, bin = payload))
        val vertex = model.primitives.single().vertex(1)

        // then preserve each channel and omit source padding
        model.geometry.positionX(vertex) shouldBe 1f
        model.geometry.positionY(vertex) shouldBe 0f
        model.geometry.positionZ(vertex) shouldBe 0f
        model.geometry.normalX(vertex) shouldBe 0f
        model.geometry.normalY(vertex) shouldBe 1f
        model.geometry.normalZ(vertex) shouldBe 0f
        model.geometry.u(vertex) shouldBe 0.5f
        model.geometry.v(vertex) shouldBe 0.75f
        model.primitives.single().vertexByteSize shouldBe 96
    }

    should("normalize quantized normals and unsigned texture coordinates") {
        // given signed byte normals and unsigned short UVs
        val payload = ByteBuffer
            .allocate(60)
            .order(ByteOrder.LITTLE_ENDIAN)
            .put(trianglePositions())
            .put(byteArrayOf(-128, 0, 0, 99, 0, 127, 0, 99, 0, 0, -128, 99))
            .putShort(0)
            .putShort(-1)
            .putShort(32767)
            .putShort(0)
            .putShort(-1)
            .putShort(-1)
            .array()
        val json = triangleJson(
            bufferLength = payload.size,
            views = """
                {"buffer":0,"byteLength":36},
                {"buffer":0,"byteOffset":36,"byteLength":12,"byteStride":4},
                {"buffer":0,"byteOffset":48,"byteLength":12}
            """,
            accessors = """
                $POSITION_ACCESSOR,
                {"bufferView":1,"componentType":5120,"normalized":true,"count":3,"type":"VEC3"},
                {"bufferView":2,"componentType":5123,"normalized":true,"count":3,"type":"VEC2"}
            """,
            primitives = """{"attributes":{"POSITION":0,"NORMAL":1,"TEXCOORD_0":2}}""",
            extra = """, "extensionsUsed":["KHR_mesh_quantization"],"extensionsRequired":["KHR_mesh_quantization"]""",
        )

        // when preparing normalized attributes
        val model = GltfLoader().load(glb(json = json, bin = payload))
        val primitive = model.primitives.single()

        // then clamp signed minima and preserve unsigned maxima
        model.geometry.normalX(primitive.vertex(0)) shouldBe -1f
        model.geometry.normalY(primitive.vertex(0)) shouldBe 0f
        model.geometry.normalZ(primitive.vertex(0)) shouldBe 0f
        model.geometry.normalY(primitive.vertex(1)) shouldBe 1f
        model.geometry.normalZ(primitive.vertex(2)) shouldBe -1f
        model.geometry.u(primitive.vertex(0)) shouldBe 0f
        model.geometry.v(primitive.vertex(0)) shouldBe 1f
        model.geometry.u(primitive.vertex(1)) shouldBe 32767f / 65535f
        model.geometry.v(primitive.vertex(2)) shouldBe 1f
    }

    should("apply sparse positions over an implicit zero-filled base") {
        // given one sparse replacement at the second vertex
        val payload = ByteBuffer
            .allocate(16)
            .order(ByteOrder.LITTLE_ENDIAN)
            .put(1)
            .position(4)
            .putFloat(1f)
            .putFloat(2f)
            .putFloat(3f)
            .array()
        val json = triangleJson(
            bufferLength = payload.size,
            views = """{"buffer":0,"byteLength":1},{"buffer":0,"byteOffset":4,"byteLength":12}""",
            accessors = """
                {"componentType":5126,"count":3,"type":"VEC3","min":[0,0,0],"max":[1,2,3],
                 "sparse":{"count":1,"indices":{"bufferView":0,"componentType":5121},"values":{"bufferView":1}}}
            """,
        )

        // when preparing the sparse accessor
        val model = GltfLoader().load(glb(json = json, bin = payload))
        val primitive = model.primitives.single()

        // then replace only the addressed vertex
        for (index in listOf(0, 2)) {
            model.geometry.positionX(primitive.vertex(index)) shouldBe 0f
            model.geometry.positionY(primitive.vertex(index)) shouldBe 0f
            model.geometry.positionZ(primitive.vertex(index)) shouldBe 0f
        }
        model.geometry.positionX(primitive.vertex(1)) shouldBe 1f
        model.geometry.positionY(primitive.vertex(1)) shouldBe 2f
        model.geometry.positionZ(primitive.vertex(1)) shouldBe 3f
    }

    for ((componentType, width) in listOf(5121 to 1, 5123 to 2, 5125 to 4)) {
        should("preserve index order for component type $componentType across vector tails") {
            // given triangle index counts around vector boundaries
            for (count in listOf(3, 15, 30, 33, 63, 66, 129, 258)) {
                val expected = List(count) { 2 - it % 3 }
                val payload = ByteBuffer.allocate(36 + count * width).order(ByteOrder.LITTLE_ENDIAN)
                payload.put(trianglePositions())
                for (value in expected) {
                    when (width) {
                        1 -> payload.put(value.toByte())
                        2 -> payload.putShort(value.toShort())
                        else -> payload.putInt(value)
                    }
                }
                val json = triangleJson(
                    bufferLength = payload.capacity(),
                    views = """{"buffer":0,"byteLength":36},{"buffer":0,"byteOffset":36,"byteLength":${count *
                        width}}""",
                    accessors = """$POSITION_ACCESSOR,{"bufferView":1,"componentType":$componentType,"count":$count,"type":"SCALAR"}""",
                    primitives = """{"attributes":{"POSITION":0},"indices":1}""",
                )

                // when preparing indexed geometry
                val model = GltfLoader().load(glb(json = json, bin = payload.array()))

                // then preserve values and retain 32-bit indices only when supplied
                indices(model = model) shouldBe expected
                model.primitives.single().indexFormat shouldBe
                    if (width == 4) { PreparedIndexFormat.Uint32 } else { PreparedIndexFormat.Uint16 }
            }
        }
    }

    should("apply sparse index replacements without a base index buffer") {
        // given two sparse replacements over three implicit zero indices
        val payload = ByteBuffer
            .allocate(48)
            .order(ByteOrder.LITTLE_ENDIAN)
            .put(trianglePositions())
            .put(1)
            .put(2)
            .position(40)
            .putInt(1)
            .putInt(2)
            .array()
        val json = triangleJson(
            bufferLength = payload.size,
            views = """
                {"buffer":0,"byteLength":36},
                {"buffer":0,"byteOffset":36,"byteLength":2},
                {"buffer":0,"byteOffset":40,"byteLength":8}
            """,
            accessors = """
                $POSITION_ACCESSOR,
                {"componentType":5125,"count":3,"type":"SCALAR",
                 "sparse":{"count":2,"indices":{"bufferView":1,"componentType":5121},"values":{"bufferView":2}}}
            """,
            primitives = """{"attributes":{"POSITION":0},"indices":1}""",
        )

        // when preparing sparse indices
        val model = GltfLoader().load(glb(json = json, bin = payload))

        // then retain the untouched zero and both replacements in 32-bit storage
        indices(model = model) shouldBe listOf(0, 1, 2)
        model.primitives.single().indexFormat shouldBe PreparedIndexFormat.Uint32
    }

    for ((vertexCount, expectedFormat) in listOf(
        65535 to PreparedIndexFormat.Uint16,
        65538 to PreparedIndexFormat.Uint32,
    )) {
        should("generate $expectedFormat indices for $vertexCount unindexed vertices") {
            // given a triangle list near the 16-bit index limit
            val json = triangleJson(
                accessors = """{"componentType":5126,"count":$vertexCount,"type":"VEC3","min":[0,0,0],"max":[0,0,0]}""",
            )

            // when preparing its implicit indices
            val model = GltfLoader().load(glb(json = json))

            // then preserve every generated index, including values above signed-short range
            model.primitives.single().indexFormat shouldBe expectedFormat
            indices(model = model) shouldBe List(vertexCount) { it }
        }
    }

    should("compose node transforms while sharing one prepared mesh between instances") {
        // given two instances under a translated and scaled parent
        val json = triangleJson(
            nodes = """
                {"translation":[2,3,4],"scale":[2,3,4],"children":[1,2]},
                {"mesh":0,"translation":[1,0,0]},
                {"mesh":0,"translation":[0,1,0]}
            """,
        )

        // when preparing the scene
        val model = GltfLoader().load(glb(json = json))

        // then prepare the shared mesh once and retain independent world transforms
        model.meshes.size shouldBe 1
        model.primitives.size shouldBe 1
        model.nodes.map { it.meshIndex } shouldBe listOf(0, 0)
        model.nodes[0].transform.toList() shouldBe
            listOf(2f, 0f, 0f, 0f, 0f, 3f, 0f, 0f, 0f, 0f, 4f, 0f, 4f, 3f, 4f, 1f)
        model.nodes[1].transform.toList().takeLast(4) shouldBe listOf(2f, 6f, 4f, 1f)
        (model.nodes[0].transform === model.nodes[1].transform) shouldBe false
    }

    for ((description, selection, expectedTranslations) in listOf(
        Triple(
            "use the explicitly selected scene",
            """, "scenes":[{"nodes":[0]},{"nodes":[1]}],"scene":1""",
            listOf(7f),
        ),
        Triple(
            "use the first scene when no default is declared",
            """, "scenes":[{"nodes":[0]},{"nodes":[1]}]""",
            listOf(2f),
        ),
        Triple(
            "use parentless nodes when no scenes are declared",
            "",
            listOf(
                2f,
                7f,
            ),
        ),
    )) {
        should(description) {
            // given two mesh instances and an optional scene selection
            val json = triangleJson(
                nodes = """{"mesh":0,"translation":[2,0,0]},{"mesh":0,"translation":[7,0,0]}""",
                sceneFields = selection,
            )

            // when preparing the selected scene or parentless roots
            val model = GltfLoader().load(glb(json = json))

            // then include only the selected instances
            model.nodes.map { it.transform[12] } shouldBe expectedTranslations
            model.meshes.size shouldBe 1
        }
    }

    should("pack disjoint aligned primitive ranges and reuse their material") {
        // given two primitives that refer to the same source attributes and material
        val json = triangleJson(primitives = """{"attributes":{"POSITION":0}},{"attributes":{"POSITION":0}}""")

        // when preparing both primitives
        val model = GltfLoader().load(glb(json = json))
        val first = model.primitives[0]
        val second = model.primitives[1]

        // then keep each range aligned and inside the owned geometry buffer
        model.meshes.single().primitiveCount shouldBe 2
        (second.vertexOffset >= first.indexOffset + first.indexCount * first.indexFormat.byteSize) shouldBe true
        for (primitive in model.primitives) {
            primitive.vertexOffset % 4 shouldBe 0
            primitive.indexOffset % 4 shouldBe 0
            primitive.indexOffset shouldBe primitive.vertexOffset + primitive.vertexByteSize
            (primitive.indexOffset + primitive.indexCount * primitive.indexFormat.byteSize <=
                model.geometry.byteSize) shouldBe true
        }
        indices(model = model, primitiveIndex = 0) shouldBe listOf(0, 1, 2)
        indices(model = model, primitiveIndex = 1) shouldBe listOf(0, 1, 2)
        model.geometry.positionX(second.vertex(1)) shouldBe 1f
        model.materials.size shouldBe 1
        second.materialIndex shouldBe first.materialIndex
    }

    for (sourceKind in listOf("embedded", "data URI", "external")) {
        should("decode a PNG from $sourceKind into shared RGBA pixels and sampler state") {
            // given two materials sharing an image and equivalent samplers
            val png = twoPixelPng()
            val externalPaths = mutableListOf<String>()
            val imageSource = when (sourceKind) {
                "embedded" -> "\"bufferView\":1,\"mimeType\":\"image/png\""
                "data URI" -> "\"uri\":\"data:image/png;base64,${Base64.getEncoder().encodeToString(png)}\""
                else -> "\"uri\":\"color%20map.png\""
            }
            val payload = if (sourceKind == "embedded") { trianglePositions() + png } else { trianglePositions() }
            val imageView = if (sourceKind == "embedded") {
                """,{"buffer":0,"byteOffset":36,"byteLength":${png.size}}"""
            } else {
                ""
            }
            val json = triangleJson(
                bufferLength = payload.size,
                views = """{"buffer":0,"byteLength":36}$imageView""",
                accessors = """$POSITION_ACCESSOR,{"componentType":5126,"count":3,"type":"VEC2"}""",
                primitives = """
                    {"attributes":{"POSITION":0,"TEXCOORD_0":1},"material":0},
                    {"attributes":{"POSITION":0,"TEXCOORD_0":1},"material":1}
                """,
                extra = """,
                    "extensionsUsed":["KHR_materials_unlit"],
                    "images":[{$imageSource},{"uri":"unused.png"}],
                    "samplers":[
                        {"minFilter":9984,"magFilter":9729,"wrapS":33071,"wrapT":33648},
                        {"minFilter":9728,"magFilter":9729,"wrapS":33071,"wrapT":33648}
                    ],
                    "textures":[{"source":0,"sampler":0},{"source":0,"sampler":1}],
                    "materials":[
                        {"pbrMetallicRoughness":{"baseColorTexture":{"index":0},"baseColorFactor":[0.25,0.5,0.75,1]},
                         "alphaMode":"MASK","alphaCutoff":0.25,"extensions":{"KHR_materials_unlit":{}}},
                        {"pbrMetallicRoughness":{"baseColorTexture":{"index":1}}}
                    ]
                """,
            )

            // when decoding the image and preparing its users
            val model = GltfLoader().load(glb(json = json, bin = payload)) { uri ->
                externalPaths.add(uri)
                uri shouldBe "color map.png"
                png
            }
            val image = model.images.single()
            val sampler = model.samplers.single()

            // then expose tightly packed sRGB RGBA pixels in source row order
            image.width shouldBe 2
            image.height shouldBe 1
            image.format shouldBe PreparedImageFormat.Rgba8Srgb
            image.mips.single().offset shouldBe 0
            image.mips.single().byteSize shouldBe 8
            model.pixels.map { it.toInt() and 255 } shouldBe listOf(255, 0, 0, 255, 0, 255, 0, 128)
            externalPaths shouldBe if (sourceKind == "external") { listOf("color map.png") } else { emptyList() }

            // and share the image and effective sampler without generating mips
            model.materials.map { it.imageIndex } shouldBe listOf(0, 0)
            model.materials.map { it.samplerIndex } shouldBe listOf(0, 0)
            model.materials[0].baseColor.toList() shouldBe listOf(0.25f, 0.5f, 0.75f, 1f)
            model.materials[0].alphaCutoff shouldBe 0.25f
            model.materials[0].unlit shouldBe true
            model.materials[1].alphaCutoff shouldBe -1f
            sampler.minFilter shouldBe PreparedFilter.Nearest
            sampler.magFilter shouldBe PreparedFilter.Linear
            sampler.mipmapMode shouldBe PreparedMipmapMode.None
            sampler.addressModeU shouldBe PreparedAddressMode.ClampToEdge
            sampler.addressModeV shouldBe PreparedAddressMode.MirroredRepeat
        }
    }

    should("load base64 buffers and decode external buffer paths") {
        // given equivalent inline and external buffer references
        val payload = trianglePositions()
        val resolved = mutableListOf<String>()
        val embedded = triangleJson(
            bufferUri = "data:application/octet-stream;base64,${Base64.getEncoder().encodeToString(payload)}",
        )
        val external = triangleJson(bufferUri = "vertex%20data.bin")
        val loader = GltfLoader()

        // when loading JSON glTF through both resource paths
        val inlineModel = loader.load(embedded.toByteArray())
        val externalModel = loader.load(external.toByteArray()) { uri ->
            resolved.add(uri)
            payload
        }

        // then prepare the same geometry and decode the resolver argument
        resolved shouldBe listOf("vertex data.bin")
        inlineModel.geometry.bytes.toList() shouldBe externalModel.geometry.bytes.toList()
        inlineModel.geometry.positionX(inlineModel.primitives.single().vertex(1)) shouldBe 1f
    }

    should("own prepared storage independently of source bytes and subsequent loads") {
        // given a loader and a mutable GLB input
        val loader = GltfLoader()
        val source = glb(json = triangleJson(nodes = """{"mesh":0,"translation":[2,3,4]}"""))
        val first = loader.load(source)
        val retainedGeometry = first.geometry.bytes.toList()

        // when overwriting the source and reusing the loader
        source.fill(0)
        val second = loader.load(glb(json = triangleJson()))

        // then preserve the earlier model without sharing prepared storage
        first.geometry.bytes.toList() shouldBe retainedGeometry
        first.nodes.single().transform.toList().takeLast(4) shouldBe listOf(2f, 3f, 4f, 1f)
        second.nodes.single().transform.toList().takeLast(4) shouldBe listOf(0f, 0f, 0f, 1f)
        (first.geometry.bytes === second.geometry.bytes) shouldBe false
        (first.materials.single().baseColor === second.materials.single().baseColor) shouldBe false
    }

    should("resolve buffers relative to a file and retain models after files change") {
        // given a glTF file next to its percent-encoded buffer reference
        val directory = Files.createTempDirectory("klab-gltf-")
        val asset = directory.resolve("scene.gltf")
        val buffer = directory.resolve("vertex data.bin")
        try {
            Files.writeString(
                asset,
                triangleJson(bufferUri = "vertex%20data.bin"),
            )
            Files.write(buffer, trianglePositions())
            val loader = GltfLoader()

            // when loading before and after replacing the buffer contents
            val first = loader.load(asset)
            Files.write(
                buffer,
                floatBytes(
                    0f,
                    0f,
                    0f,
                    0f,
                    1f,
                    0f,
                    1f,
                    0f,
                    0f,
                ),
            )
            val second = loader.load(asset)

            // then keep the first model's geometry independent of the file
            first.geometry.positionX(first.primitives.single().vertex(1)) shouldBe 1f
            second.geometry.positionX(second.primitives.single().vertex(1)) shouldBe 0f
            second.geometry.positionY(second.primitives.single().vertex(1)) shouldBe 1f
        } finally {
            Files.deleteIfExists(buffer)
            Files.deleteIfExists(asset)
            Files.deleteIfExists(directory)
        }
    }

    should("recover after malformed JSON and a failed model preparation") {
        // given a loader with an already returned model
        val loader = GltfLoader()
        val retained = loader.load(glb(json = triangleJson()))

        // expect both parsing and preparation failures without poisoning subsequent loads
        for (invalid in listOf(
            """{"asset":{"version":"2.0"}""".toByteArray(),
            glb(json = triangleJson(primitives = """{"mode":0,"attributes":{"POSITION":0}}""")),
        )) {
            shouldThrow<AssertionError> { loader.load(invalid) }
            val recovered = loader.load(glb(json = triangleJson()))
            indices(model = recovered) shouldBe listOf(0, 1, 2)
            retained.geometry.positionX(retained.primitives.single().vertex(1)) shouldBe 1f
        }
    }

    should("reject unsupported blending and scenes without mesh instances") {
        // given valid glTF documents that cannot produce the supported prepared representation
        val blended = triangleJson(
            primitives = """{"attributes":{"POSITION":0},"material":0}""",
            extra = """, "materials":[{"alphaMode":"BLEND"}]""",
        )
        val empty = triangleJson(nodes = "{}")

        // expect preparation to reject both documents
        shouldThrow<AssertionError> { GltfLoader().load(glb(json = blended)) }
        shouldThrow<AssertionError> { GltfLoader().load(glb(json = empty)) }
    }

    should("reject skins, animations, and morph targets for static prepared models") {
        // given otherwise valid documents containing unsupported deformation data
        val documents = listOf(
            triangleJson(extra = """, "skins":[{"joints":[0]}]"""),
            triangleJson(
                accessors = """
                    $POSITION_ACCESSOR,
                    {"componentType":5126,"count":1,"type":"SCALAR","min":[0],"max":[0]},
                    {"componentType":5126,"count":1,"type":"VEC3"}
                """,
                extra = """, "animations":[{"samplers":[{"input":1,"output":2}],
                    "channels":[{"sampler":0,"target":{"node":0,"path":"translation"}}]}]""",
            ),
            triangleJson(primitives = """{"attributes":{"POSITION":0},"targets":[{"POSITION":0}]}"""),
        )

        // expect preparation to reject each unsupported representation
        for (json in documents) {
            shouldThrow<AssertionError> { GltfLoader().load(glb(json = json)) }
        }
    }

    should("reject out-of-range indices before producing prepared geometry") {
        // given three vertices and an index referencing a fourth
        val json = triangleJson(
            bufferLength = 39,
            views = """{"buffer":0,"byteLength":36},{"buffer":0,"byteOffset":36,"byteLength":3}""",
            accessors = """$POSITION_ACCESSOR,{"bufferView":1,"componentType":5121,"count":3,"type":"SCALAR"}""",
            primitives = """{"attributes":{"POSITION":0},"indices":1}""",
        )
        val source = glb(json = json, bin = trianglePositions() + byteArrayOf(0, 1, 3))

        // expect metadata validation to reject the invalid reference
        shouldThrow<AssertionError> { GltfLoader().load(source) }
    }

    should("reject invalid buffer ranges and cyclic node hierarchies") {
        // given invalid ranges, references, and a cycle
        val documents = listOf(
            triangleJson(views = """{"buffer":0,"byteOffset":4,"byteLength":36}"""),
            triangleJson(nodes = """{"mesh":1}"""),
            triangleJson(nodes = """{"mesh":0,"children":[1]},{"children":[0]}"""),
            triangleJson(nodes = """{"mesh":0,"children":[2]}"""),
        )

        // expect validation to reject each document
        for (json in documents) {
            shouldThrow<AssertionError> { GltfLoader().load(glb(json = json)) }
        }
    }

    should("reject truncated GLB chunks and required geometry compression") {
        // given a corrupt chunk length and an unsupported required extension
        val truncated = glb(json = triangleJson())
        ByteBuffer.wrap(truncated).order(ByteOrder.LITTLE_ENDIAN).putInt(12, truncated.size)
        val compressed = triangleJson(
            extra = """, "extensionsUsed":["KHR_draco_mesh_compression"],"extensionsRequired":["KHR_draco_mesh_compression"]""",
        )

        // expect validation to reject both inputs
        shouldThrow<AssertionError> { GltfLoader().load(truncated) }
        shouldThrow<AssertionError> { GltfLoader().load(glb(json = compressed)) }
    }
})

private const val POSITION_ACCESSOR =
    """{"bufferView":0,"componentType":5126,"count":3,"type":"VEC3","min":[0,0,0],"max":[1,1,0]}"""

private fun triangleJson(
    bufferLength: Int = 36,
    bufferUri: String? = null,
    views: String = """{"buffer":0,"byteLength":36}""",
    accessors: String = POSITION_ACCESSOR,
    primitives: String = """{"attributes":{"POSITION":0}}""",
    nodes: String = """{"mesh":0}""",
    sceneFields: String = """, "scenes":[{"nodes":[0]}],"scene":0""",
    extra: String = "",
): String {
    val uri = bufferUri?.let { ", \"uri\":\"$it\"" } ?: ""
    return """
        {"asset":{"version":"2.0"},
         "buffers":[{"byteLength":$bufferLength$uri}],
         "bufferViews":[$views],"accessors":[$accessors],
         "meshes":[{"primitives":[$primitives]}],"nodes":[$nodes]
         $sceneFields$extra}
    """
        .trimIndent()
}

private fun trianglePositions(): Bytes = floatBytes(0f, 0f, 0f, 1f, 0f, 0f, 0f, 1f, 0f)

private fun floatBytes(vararg values: Float): Bytes {
    val buffer = ByteBuffer.allocate(values.size * Float.SIZE_BYTES).order(ByteOrder.LITTLE_ENDIAN)
    for (value in values) {
        buffer.putFloat(value)
    }
    return buffer.array()
}

private fun indices(
    model: PreparedModel,
    primitiveIndex: Int = 0,
): List<Int> {
    val primitive = model.primitives[primitiveIndex]
    val bytes = ByteBuffer.wrap(model.geometry.bytes).order(ByteOrder.LITTLE_ENDIAN)
    return List(primitive.indexCount) { index ->
        val offset = primitive.indexOffset + index * primitive.indexFormat.byteSize
        when (primitive.indexFormat) {
            PreparedIndexFormat.Uint16 -> bytes.getShort(offset).toInt() and 65535
            PreparedIndexFormat.Uint32 -> bytes.getInt(offset)
        }
    }
}

private fun twoPixelPng(): Bytes {
    val image = BufferedImage(2, 1, BufferedImage.TYPE_INT_ARGB)
    try {
        image.setRGB(0, 0, 0xffff0000.toInt())
        image.setRGB(1, 0, 0x8000ff00.toInt())
        return ByteArrayOutputStream().use { output ->
            check(ImageIO.write(image, "png", output))
            output.toByteArray()
        }
    } finally {
        image.flush()
    }
}

private fun glb(
    json: String,
    bin: Bytes = trianglePositions(),
): MutBytes {
    val encoded = json.trimIndent().toByteArray(Charsets.UTF_8)
    val jsonSize = (encoded.size + 3) and -4
    val binSize = (bin.size + 3) and -4
    val bytes = MutBytes(28 + jsonSize + binSize)
    val buffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN)
    buffer.putInt(0x46546c67).putInt(2).putInt(bytes.size)
    buffer.putInt(jsonSize).putInt(0x4e4f534a).put(encoded)
    repeat(jsonSize - encoded.size) { buffer.put(32) }
    buffer.putInt(binSize).putInt(0x004e4942).put(bin)
    return bytes
}
