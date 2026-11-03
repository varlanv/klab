package com.varlanv.klab.glb

import com.varlanv.klab.glb.ffi.*
import java.lang.foreign.MemorySegment

enum class GlbPrimitiveType { Points, Lines, LineLoop, LineStrip, Triangles, TriangleStrip, TriangleFan }

enum class GlbAttributeSemantic { Position, Normal, Tangent, TexCoord, Color, Joints, Weights, Custom }

enum class GlbComponentType(val byteSize: Int) {
    Byte(1), UnsignedByte(1), Short(2), UnsignedShort(2), UnsignedInt(4), Float(4)
}

enum class GlbElementType(val componentCount: Int) { Scalar(1), Vec2(2), Vec3(3), Vec4(4), Mat2(4), Mat3(9), Mat4(16) }

class GlbMesh internal constructor(private val model: GlbModel, private val data: MemorySegment) {
    val name: String? get() = model.read { nativeString(cgltf_mesh.name(data)) }
    val primitiveCount: Int get() = model.read { Math.toIntExact(cgltf_mesh.primitives_count(data)) }

    fun primitive(index: Int): GlbPrimitive = model.read {
        GlbPrimitive(
            model,
            element(
                pointer = cgltf_mesh.primitives(data),
                count = cgltf_mesh.primitives_count(data),
                size = cgltf_primitive.sizeof(),
                index = index
            )
        )
    }
}

class GlbPrimitive internal constructor(private val model: GlbModel, private val data: MemorySegment) {
    val type: GlbPrimitiveType get() = model.read { GlbPrimitiveType.entries[cgltf_primitive.type(data) - 1] }
    val attributeCount: Int get() = model.read { Math.toIntExact(cgltf_primitive.attributes_count(data)) }
    val morphTargetCount: Int get() = model.read { Math.toIntExact(cgltf_primitive.targets_count(data)) }
    val materialIndex: Int? get() = model.read { model.materialIndex(cgltf_primitive.material(data)) }
    val indices: GlbAccessor?
        get() = model.read {
            val accessor = cgltf_primitive.indices(data)
            if (accessor.address() == 0L) null else GlbAccessor(model, accessor.reinterpret(cgltf_accessor.sizeof()))
        }

    fun attribute(index: Int): GlbAttribute = model.read {
        GlbAttribute(
            model,
            element(
                pointer = cgltf_primitive.attributes(data),
                count = cgltf_primitive.attributes_count(data),
                size = cgltf_attribute.sizeof(),
                index = index
            )
        )
    }

    fun findAttribute(semantic: GlbAttributeSemantic, set: Int = 0): GlbAccessor? = model.read {
        require(set >= 0)
        val count = cgltf_primitive.attributes_count(data)
        val attributes = cgltf_primitive.attributes(data)
        var index = 0L
        while (index < count) {
            val attribute = attributes.asSlice(index * cgltf_attribute.sizeof(), cgltf_attribute.sizeof())
            if (cgltf_attribute.type(attribute) == semantic.ordinal + 1 && cgltf_attribute.index(attribute) == set) {
                return@read GlbAccessor(model, cgltf_attribute.data(attribute).reinterpret(cgltf_accessor.sizeof()))
            }
            index++
        }
        null
    }
}

class GlbAttribute internal constructor(private val model: GlbModel, private val data: MemorySegment) {
    val name: String? get() = model.read { nativeString(cgltf_attribute.name(data)) }
    val semantic: GlbAttributeSemantic get() = model.read { GlbAttributeSemantic.entries[cgltf_attribute.type(data) - 1] }
    val set: Int get() = model.read { cgltf_attribute.index(data) }
    val accessor: GlbAccessor
        get() = model.read {
            GlbAccessor(model, cgltf_attribute.data(data).reinterpret(cgltf_accessor.sizeof()))
        }
}

class GlbAccessor internal constructor(private val model: GlbModel, private val data: MemorySegment) {
    val count: Long get() = model.read { cgltf_accessor.count(data) }
    val componentType: GlbComponentType get() = model.read { GlbComponentType.entries[cgltf_accessor.component_type(data) - 1] }
    val elementType: GlbElementType get() = model.read { GlbElementType.entries[cgltf_accessor.type(data) - 1] }
    val normalized: Boolean get() = model.read { cgltf_accessor.normalized(data) != 0 }
    val sparse: Boolean get() = model.read { cgltf_accessor.is_sparse(data) != 0 }
    val strideBytes: Long get() = model.read { cgltf_accessor.stride(data) }
    val elementSizeBytes: Long
        get() = model.read {
            Cgltf.cgltf_calc_size(cgltf_accessor.type(data), cgltf_accessor.component_type(data))
        }

    fun rawBytes(): MemorySegment? = model.read {
        check(cgltf_accessor.is_sparse(data) == 0) { "Sparse accessors must be unpacked" }
        val view = cgltf_accessor.buffer_view(data)
        if (view.address() == 0L) return@read null
        val count = cgltf_accessor.count(data)
        val elementSize = Cgltf.cgltf_calc_size(cgltf_accessor.type(data), cgltf_accessor.component_type(data))
        val size = if (count == 0L) 0L else Math.addExact(
            Math.multiplyExact(count - 1L, cgltf_accessor.stride(data)),
            elementSize
        )
        model.bufferBytes(view.reinterpret(cgltf_buffer_view.sizeof())).asSlice(cgltf_accessor.offset(data), size)
    }

    fun copyFloatsTo(destination: MemorySegment) = model.read {
        check(
            cgltf_accessor.is_sparse(data) == 0 || cgltf_accessor.stride(data) ==
                    Cgltf.cgltf_calc_size(cgltf_accessor.type(data), cgltf_accessor.component_type(data))
        ) {
            "cgltf cannot safely unpack sparse accessors with an interleaved base"
        }
        val components = Cgltf.cgltf_num_components(cgltf_accessor.type(data))
        val count = Math.multiplyExact(cgltf_accessor.count(data), components)
        requireOutput(destination = destination, bytes = Math.multiplyExact(count, 4L), alignment = 4)
        check(Cgltf.cgltf_accessor_unpack_floats(data, destination, count) == count) { "Failed to unpack GLB accessor" }
    }

    fun copyIndicesTo(destination: MemorySegment, componentType: GlbComponentType = GlbComponentType.UnsignedInt) =
        model.read {
            require(cgltf_accessor.type(data) == Cgltf.cgltf_type_scalar()) { "Indices must be scalar" }
            val inputType = cgltf_accessor.component_type(data)
            require(
                inputType == Cgltf.cgltf_component_type_r_8u() || inputType == Cgltf.cgltf_component_type_r_16u() ||
                        inputType == Cgltf.cgltf_component_type_r_32u()
            ) { "Indices must use an unsigned integer type" }
            require(
                componentType == GlbComponentType.UnsignedByte || componentType == GlbComponentType.UnsignedShort ||
                        componentType == GlbComponentType.UnsignedInt
            )
            check(cgltf_accessor.is_sparse(data) == 0) { "Sparse index conversion is not supported by cgltf" }
            val count = cgltf_accessor.count(data)
            requireOutput(
                destination = destination, bytes = Math.multiplyExact(count, componentType.byteSize.toLong()),
                alignment = componentType.byteSize
            )
            check(
                Cgltf.cgltf_accessor_unpack_indices(
                    data,
                    destination,
                    componentType.byteSize.toLong(),
                    count
                ) == count
            ) {
                "Cannot unpack GLB indices to ${componentType.name}"
            }
        }
}

class GlbBufferView internal constructor(private val model: GlbModel, private val data: MemorySegment) {
    val byteSize: Long get() = model.read { cgltf_buffer_view.size(data) }
    val byteStride: Long get() = model.read { cgltf_buffer_view.stride(data) }
    fun bytes(): MemorySegment = model.bufferBytes(data)
}

internal fun requireOutput(destination: MemorySegment, bytes: Long, alignment: Int) {
    require(destination.isNative && !destination.isReadOnly && destination.byteSize() >= bytes) { "Invalid GLB output memory" }
    require(destination.address() % alignment == 0L) { "Unaligned GLB output memory" }
    check(destination.scope().isAlive && destination.isAccessibleBy(Thread.currentThread())) { "GLB output memory is not accessible" }
}
