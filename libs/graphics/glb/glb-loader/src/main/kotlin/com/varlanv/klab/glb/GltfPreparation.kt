package com.varlanv.klab.glb

import com.varlanv.klab.collections.*
import com.varlanv.klab.gpu.assets.*

private const val MISSING = -1
private const val TRIANGLE_VERTICES = 3
private const val GEOMETRY_ALIGNMENT = Int.SIZE_BYTES
private const val UINT16_VERTEX_LIMIT = 65536
private const val X = 0
private const val Y = 1
private const val Z = 2
private const val U = 0
private const val V = 1
private const val FILTER_NEAREST = 9728
private const val FILTER_LINEAR = 9729
private const val FILTER_NEAREST_MIPMAP_NEAREST = 9984
private const val FILTER_LINEAR_MIPMAP_NEAREST = 9985
private const val FILTER_NEAREST_MIPMAP_LINEAR = 9986
private const val FILTER_LINEAR_MIPMAP_LINEAR = 9987
private const val WRAP_REPEAT = 10497
private const val WRAP_MIRRORED_REPEAT = 33648
private const val WRAP_CLAMP_TO_EDGE = 33071

internal fun prepareModel(source: KGltf, resolver: ((String) -> Bytes)?): PreparedModel =
    ModelPreparation(source, resolver).prepare()

private class ModelPreparation(private val source: KGltf, private val resolver: ((String) -> Bytes)?) {
    private val meshIndices = MutInts(source.meshes.size) { MISSING }
    private val materialIndices = MutInts(source.materials.size + 1) { MISSING }
    private val imageIndices = MutInts(source.images.size) { MISSING }
    private val samplerIndices = MutInts(source.samplers.size + 1) { MISSING }
    private val meshes = ArrayList<PreparedMesh>()
    private val primitives = ArrayList<PrimitivePlan>()
    private val materials = ArrayList<PreparedMaterial>()
    private val images = ArrayList<PreparedImage>()
    private val imageReaders = ArrayList<PreparedImageReader>()
    private val samplers = ArrayList<PreparedSampler>()
    private var geometrySize = 0
    private var pixelSize = 0

    fun prepare(): PreparedModel {
        assert(source.skins.isEmpty() && source.animations.isEmpty()) { "Prepared models currently support static scenes" }
        var failure: Throwable? = null
        try {
            val nodes = nodes()
            assert(nodes.isNotEmpty()) { "Scene contains no meshes" }
            val geometry = PreparedGeometry(MutBytes(geometrySize))
            for (plan in primitives) {
                writePrimitive(plan, geometry)
            }
            val pixels = MutBytes(pixelSize)
            for (index in imageReaders.indices) {
                imageReaders[index].use { it.copyPixelsTo(pixels, images[index].mips[0].offset) }
            }
            return PreparedModel(
                geometry = geometry,
                pixels = pixels,
                meshes = meshes.toTypedArray(),
                primitives = Array(primitives.size) { primitives[it].prepared },
                images = images.toTypedArray(),
                samplers = samplers.toTypedArray(),
                materials = materials.toTypedArray(),
                nodes = nodes.toTypedArray(),
            )
        } catch (error: Throwable) {
            failure = error
            throw error
        } finally {
            var closeFailure: Throwable? = failure
            for (reader in imageReaders) {
                try {
                    reader.close()
                } catch (error: Throwable) {
                    if (closeFailure == null) {
                        closeFailure = error
                    } else {
                        closeFailure.addSuppressed(error)
                    }
                }
            }
            if (failure == null) {
                closeFailure?.let { throw it }
            }
        }
    }

    private fun nodes(): List<PreparedNode> {
        val result = ArrayList<PreparedNode>()
        val pending = MutInts(source.nodes.size)
        val transforms = arrayOfNulls<MutFloats>(source.nodes.size)
        var pendingSize = 0
        val scene = if (source.scene >= 0) {
            source.scene
        } else if (source.scenes.isNotEmpty()) {
            0
        } else {
            MISSING
        }
        if (scene >= 0) {
            val roots = source.scenes[scene].nodes
            for (index in roots.indices.reversed()) {
                pending[pendingSize++] = roots[index]
            }
        } else {
            for (index in source.nodes.indices.reversed()) {
                if (source.nodes[index].parent < 0) {
                    pending[pendingSize++] = index
                }
            }
        }
        while (pendingSize > 0) {
            val index = pending[--pendingSize]
            val node = source.nodes[index]
            assert(node.skin < 0 && node.instancing.isEmpty()) {
                "Skinning and GPU instancing are not supported yet"
            }
            val transform = MutFloats(MAT4_COMPONENTS)
            source.copyLocalTransformTo(index, transform)
            if (node.parent >= 0) {
                multiplyTransform(checkNotNull(transforms[node.parent]), transform)
            }
            transforms[index] = transform
            if (node.mesh >= 0) {
                result.add(PreparedNode(mesh(node.mesh), transform))
            }
            for (child in node.children.indices.reversed()) {
                pending[pendingSize++] = node.children[child]
            }
        }
        return result
    }

    private fun mesh(index: Int): Int {
        if (meshIndices[index] >= 0) {
            return meshIndices[index]
        }
        val mesh = source.meshes[index]
        val first = primitives.size
        for (sourcePrimitive in mesh.primitives) {
            primitives.add(primitive(sourcePrimitive))
        }
        val preparedIndex = meshes.size
        meshes.add(PreparedMesh(first, primitives.size - first))
        meshIndices[index] = preparedIndex
        return preparedIndex
    }

    private fun primitive(primitive: KPrimitive): PrimitivePlan {
        assert(primitive.mode == GLTF_PRIMITIVE_TRIANGLES) {
            "Prepared models require triangle lists"
        }
        assert(primitive.targets.isEmpty() && primitive.draco == null) {
            "Morph targets and Draco compression are not supported yet"
        }
        assert(primitive.accessor(ATTRIBUTE_COLOR) < 0) {
            "Vertex colors are not supported yet"
        }
        assert(
            primitive.accessor(ATTRIBUTE_JOINTS) < 0 &&
                    primitive.accessor(ATTRIBUTE_WEIGHTS) < 0
        ) {
            "Skinned meshes are not supported yet"
        }
        val position = primitive.accessor(ATTRIBUTE_POSITION)
        assert(position >= 0) {
            "Mesh has no positions"
        }
        val normal = primitive.accessor(ATTRIBUTE_NORMAL)
        val uv = primitive.accessor(ATTRIBUTE_TEXCOORD)
        val count = source.accessors[position].count
        assert(count > 0)
        validateAttribute(position, VEC3_COMPONENTS, count)
        if (normal >= 0) {
            validateAttribute(normal, VEC3_COMPONENTS, count)
        }
        if (uv >= 0) {
            validateAttribute(uv, VEC2_COMPONENTS, count)
        }
        val material = material(primitive.material)
        assert(materials[material].imageIndex < 0 || uv >= 0) {
            "Textured meshes require TEXCOORD_0"
        }
        val indices = primitive.indices.takeIf { it >= 0 }?.let { source.accessors[it] }
        if (indices != null) {
            assert(indices.type.value == GLTF_TYPE_SCALAR && !indices.normalized)
            assert(indices.componentType.value in unsignedIndexTypes) {
                "Indices must be unsigned scalars"
            }
            validateStorage(indices)
        }
        val indexCount = indices?.count ?: count
        assert(indexCount > 0 && indexCount % TRIANGLE_VERTICES == 0) {
            "Triangle index count must be divisible by three"
        }
        val format = if (indices == null) {
            if (count <= UINT16_VERTEX_LIMIT) {
                PreparedIndexFormat.Uint16
            } else {
                PreparedIndexFormat.Uint32
            }
        } else if (indices.componentType.value == GLTF_COMPONENT_UNSIGNED_INT) {
            PreparedIndexFormat.Uint32
        } else {
            PreparedIndexFormat.Uint16
        }
        val vertexOffset = geometrySize
        val indexOffset = Math.addExact(vertexOffset, PreparedVertex.byteSize(count))
        val end = Math.addExact(indexOffset, Math.multiplyExact(indexCount, format.byteSize))
        geometrySize = Math.addExact(end, GEOMETRY_ALIGNMENT - 1) and -GEOMETRY_ALIGNMENT
        return PrimitivePlan(
            prepared = PreparedPrimitive(
                vertexOffset = vertexOffset,
                vertexCount = count,
                indexOffset = indexOffset,
                indexCount = indexCount,
                indexFormat = format,
                materialIndex = material
            ),
            position = position,
            normal = normal,
            uv = uv,
            indices = primitive.indices,
        )
    }

    private fun validateAttribute(index: Int, components: Int, count: Int) {
        val accessor = source.accessors[index]
        assert(
            accessor.type.componentCount() == components &&
                    accessor.count == count
        ) { "Invalid mesh attribute layout" }
        validateStorage(accessor)
    }

    private fun validateStorage(accessor: KAccessor) {
        fun view(index: Int) {
            if (index >= 0) {
                assert(source.bufferViews[index].meshopt == null) {
                    "Meshopt compression is not supported yet"
                }
            }
        }
        view(accessor.bufferView)
        accessor.sparse?.let {
            view(it.indicesBufferView);
            view(it.valuesBufferView)
        }
    }

    private fun writePrimitive(plan: PrimitivePlan, geometry: PreparedGeometry) {
        val positions = attribute(plan.position)
        val normals = plan.normal.takeIf { it >= 0 }?.let(::attribute)
        val uvs = plan.uv.takeIf { it >= 0 }?.let(::attribute)
        val primitive = plan.prepared
        for (index in 0 until primitive.vertexCount) {
            val vertex = primitive.vertex(index)
            geometry.setPosition(
                vertex = vertex,
                x = positions.get(
                    index,
                    X
                ),
                y = positions.get(index, Y),
                z = positions.get(index, Z)
            )
            geometry.setNormal(
                vertex = vertex,
                x = normals?.get(index, X) ?: 0f,
                y = normals?.get(index, Y) ?: 1f,
                z = normals?.get(index, Z) ?: 0f
            )
            geometry.setUv(
                vertex = vertex,
                u = uvs?.get(index, U) ?: 0f,
                v = uvs?.get(index, V) ?: 0f
            )
        }
        val accessor = plan.indices.takeIf { it >= 0 }?.let { source.accessors[it] }
        val sparseIndices = if (accessor?.sparse != null) {
            MutInts(accessor.count).also {
                source.copyIndicesTo(plan.indices, it)
            }
        } else {
            null
        }
        val view = accessor?.bufferView?.takeIf { it >= 0 }?.let { source.bufferViews[it] }
        val start =
            if (accessor != null && view != null) {
                source.bufferOffsets[view.buffer] + view.offset + accessor.offset
            } else {
                0
            }
        var target = primitive.indexOffset
        for (index in 0 until primitive.indexCount) {
            val value = when {
                accessor == null -> index.toLong()
                sparseIndices != null -> sparseIndices[index].toLong() and UINT32_MASK
                view == null -> 0L
                else -> accessor.componentType.readUnsigned(
                    source.bufferSources[view.buffer],
                    start + index * accessor.stride
                )
            }
            assert(value < primitive.vertexCount.toLong()) {
                "Index exceeds vertex count"
            }
            when (primitive.indexFormat) {
                PreparedIndexFormat.Uint16 -> geometry.bytes.setPackedShort(target, value.toShort())
                PreparedIndexFormat.Uint32 -> geometry.bytes.setPackedInt(target, value.toInt())
            }
            target += primitive.indexFormat.byteSize
        }
    }

    private fun attribute(index: Int): FloatAttribute {
        val accessor = source.accessors[index]
        if (accessor.componentType.value == GLTF_COMPONENT_FLOAT &&
            !accessor.normalized &&
            accessor.sparse == null &&
            accessor.bufferView >= 0
        ) {
            val view = source.bufferViews[accessor.bufferView]
            return FloatAttribute(
                bytes = source.bufferSources[view.buffer],
                offset = source.bufferOffsets[view.buffer] + view.offset + accessor.offset,
                stride = accessor.stride,
                values = null,
                components = 0
            )
        }
        val components = accessor.type.componentCount()
        val values = MutFloats(Math.multiplyExact(accessor.count, components))
        source.copyFloatsTo(index, values)
        return FloatAttribute(
            bytes = null,
            offset = 0,
            stride = 0,
            values = values,
            components = components
        )
    }

    private fun material(index: Int): Int {
        val key = index + 1
        if (materialIndices[key] >= 0) {
            return materialIndices[key]
        }
        val material = index.takeIf { it >= 0 }?.let { source.materials[it] }
        assert(material?.alphaMode != ALPHA_BLEND) {
            "Transparent materials are not supported yet"
        }
        val binding = material?.metallicRoughness?.baseColorTexture
        assert(binding?.transform == null) {
            "Texture transforms are not supported yet"
        }
        assert(binding == null || binding.texCoord == 0) {
            "Materials require TEXCOORD_0"
        }
        val texture = binding?.let { source.textures[it.texture] }
        val image = if (texture != null) {
            assert(texture.image >= 0) {
                "Texture has no supported image source"
            }
            image(texture.image)
        } else {
            MISSING
        }
        val sampler = if (texture != null) {
            sampler(texture.sampler)
        } else {
            MISSING
        }
        val preparedIndex = materials.size
        materials.add(
            PreparedMaterial(
                imageIndex = image,
                samplerIndex = sampler,
                baseColor = material?.metallicRoughness?.baseColorFactor?.copyOf() ?: MutFloats(VEC4_COMPONENTS) { 1f },
                alphaCutoff = if (material?.alphaMode == ALPHA_MASK) {
                    material.alphaCutoff
                } else {
                    -1f
                },
                unlit = material?.unlit ?: false,
            )
        )
        materialIndices[key] = preparedIndex
        return preparedIndex
    }

    private fun image(index: Int): Int {
        if (imageIndices[index] >= 0) {
            return imageIndices[index]
        }
        val reader = openPreparedImage(source, index, resolver)
        imageReaders.add(reader)
        val size = reader.byteSize
        val offset = pixelSize
        pixelSize = Math.addExact(pixelSize, size)
        val preparedIndex = images.size
        images.add(
            PreparedImage(
                reader.width,
                reader.height,
                PreparedImageFormat.Rgba8Srgb,
                arrayOf(PreparedMip(offset, size))
            )
        )
        imageIndices[index] = preparedIndex
        return preparedIndex
    }

    private fun sampler(index: Int): Int {
        val key = index + 1
        if (samplerIndices[key] >= 0) {
            return samplerIndices[key]
        }
        val sampler = index.takeIf { it >= 0 }?.let { source.samplers[it] }
        val prepared = PreparedSampler(
            filter(sampler?.minFilter ?: FILTER_LINEAR),
            filter(sampler?.magFilter ?: FILTER_LINEAR),
            PreparedMipmapMode.None, // Preparation currently produces only the base mip.
            addressMode(sampler?.wrapS ?: WRAP_REPEAT),
            addressMode(sampler?.wrapT ?: WRAP_REPEAT),
        )
        val preparedIndex = samplers.indexOfFirst {
            it.minFilter == prepared.minFilter &&
                    it.magFilter == prepared.magFilter &&
                    it.addressModeU == prepared.addressModeU &&
                    it.addressModeV == prepared.addressModeV
        }.takeIf { it >= 0 } ?: samplers.size.also { samplers.add(prepared) }
        samplerIndices[key] = preparedIndex
        return preparedIndex
    }
}

private class PrimitivePlan(
    val prepared: PreparedPrimitive,
    val position: Int,
    val normal: Int,
    val uv: Int,
    val indices: Int
)

private class FloatAttribute(
    val bytes: Bytes?,
    val offset: Int,
    val stride: Int,
    val values: Floats?,
    val components: Int
) {
    fun get(vertex: Int, component: Int): Float =
        if (values != null) {
            values[vertex * components + component]
        } else {
            bytes!!.getPackedFloat(offset + vertex * stride + component * Float.SIZE_BYTES)
        }
}

private fun KPrimitive.accessor(semantic: Int): Int =
    attributes.firstOrNull { it.semantic == semantic && it.set == 0 }?.accessor ?: MISSING

private val unsignedIndexTypes =
    intArrayOf(GLTF_COMPONENT_UNSIGNED_BYTE, GLTF_COMPONENT_UNSIGNED_SHORT, GLTF_COMPONENT_UNSIGNED_INT)
private const val UINT32_MASK = 0xffffffffL

private fun filter(value: Int): PreparedFilter = when (value) {
    0, FILTER_LINEAR, FILTER_LINEAR_MIPMAP_NEAREST, FILTER_LINEAR_MIPMAP_LINEAR -> PreparedFilter.Linear
    FILTER_NEAREST, FILTER_NEAREST_MIPMAP_NEAREST, FILTER_NEAREST_MIPMAP_LINEAR -> PreparedFilter.Nearest
    else -> error("Unsupported texture filter: $value")
}

private fun addressMode(value: Int): PreparedAddressMode = when (value) {
    WRAP_REPEAT -> PreparedAddressMode.Repeat
    WRAP_MIRRORED_REPEAT -> PreparedAddressMode.MirroredRepeat
    WRAP_CLAMP_TO_EDGE -> PreparedAddressMode.ClampToEdge
    else -> error("Unsupported texture wrap mode: $value")
}
