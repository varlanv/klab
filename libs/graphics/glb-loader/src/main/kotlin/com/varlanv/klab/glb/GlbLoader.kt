package com.varlanv.klab.glb

import com.varlanv.klab.bin.BytesSlice
import com.varlanv.klab.collections.Bytes
import com.varlanv.klab.glb.ffi.*
import java.lang.foreign.MemorySegment
import java.lang.foreign.SegmentAllocator
import java.lang.foreign.ValueLayout
import java.nio.ByteOrder

object GlbLoader {

    private val abi: Unit by lazy {
        check(Cgltf.klab_glb_abi_version() == 1) { "Incompatible native GLB ABI" }
        check(Cgltf.klab_cgltf_data_size() == cgltf_data.sizeof()) { "Incompatible cgltf structure layout" }
    }

    context(gpa: SegmentAllocator)
    fun load(bytes: Bytes): GlbModel = loadBytes(bytes = bytes, offset = 0, length = bytes.size)

    context(gpa: SegmentAllocator)
    fun load(bytes: BytesSlice): GlbModel = loadBytes(bytes = bytes.bytes, offset = bytes.offset, length = bytes.len)

    context(gpa: SegmentAllocator)
    private fun loadBytes(bytes: Bytes, offset: Int, length: Int): GlbModel {
        val source = gpa.allocate(length.toLong(), 4)
        MemorySegment.copy(MemorySegment.ofArray(bytes), offset.toLong(), source, 0L, length.toLong())
        return load(source)
    }

    context(gpa: SegmentAllocator)
    fun load(source: MemorySegment): GlbModel {
        require(source.isNative) { "GLB input must be native memory" }
        require(source.address() % 4L == 0L) { "GLB input must be aligned to four bytes" }
        require(source.byteSize() >= 20L) { "GLB header is truncated" }
        val uint = ValueLayout.JAVA_INT_UNALIGNED.withOrder(ByteOrder.LITTLE_ENDIAN)
        require(source.get(uint, 0L) == 0x46546c67) { "Expected a GLB file" }
        require(source.get(uint, 4L) == 2) { "Only GLB version 2 is supported" }
        val length = source.get(uint, 8L).toLong() and 0xffffffffL
        require(length == source.byteSize()) { "GLB length does not match input size" }
        abi
        val options = cgltf_options.allocate(gpa).fill(0)
        cgltf_options.type(options, Cgltf.cgltf_file_type_glb())
        val result = gpa.allocate(ValueLayout.ADDRESS)
        checkResult(Cgltf.cgltf_parse(options, source, source.byteSize(), result), "parse")
        val handle = result.get(ValueLayout.ADDRESS, 0L).reinterpret(cgltf_data.sizeof())
        try {
            val buffers = cgltf_data.buffers(handle)
            val bufferCount = cgltf_data.buffers_count(handle)
            require(bufferCount <= 1L) { "External GLB buffers require a resource resolver" }
            if (bufferCount == 1L) {
                val buffer = buffers.reinterpret(cgltf_buffer.sizeof())
                require(cgltf_buffer.uri(buffer).address() == 0L) { "External GLB buffers require a resource resolver" }
            }
            checkResult(Cgltf.cgltf_load_buffers(options, handle, MemorySegment.NULL), "load buffers")
            validateRanges(handle)
            val extensions = cgltf_data.extensions_required(handle)
            var extension = 0L
            while (extension < cgltf_data.extensions_required_count(handle)) {
                val name =
                    extensions.getAtIndex(ValueLayout.ADDRESS, extension).reinterpret(Long.MAX_VALUE).getString(0L)
                require(
                    name != "KHR_draco_mesh_compression" && name != "EXT_meshopt_compression" &&
                            name != "KHR_meshopt_compression"
                ) { "GLB geometry requires an additional decoder: $name" }
                extension++
            }
            checkResult(Cgltf.cgltf_validate(handle), "validate")
            return GlbModel(handle = handle, source = source)
        } catch (failure: Throwable) {
            Cgltf.cgltf_free(handle)
            throw failure
        }
    }

    private fun validateRanges(data: MemorySegment) {
        val views = cgltf_data.buffer_views(data)
        var index = 0L
        while (index < cgltf_data.buffer_views_count(data)) {
            val view = views.asSlice(index * cgltf_buffer_view.sizeof(), cgltf_buffer_view.sizeof())
            val bufferPointer = cgltf_buffer_view.buffer(view)
            require(bufferPointer.address() != 0L) { "GLB buffer view has no buffer" }
            val buffer = bufferPointer.reinterpret(cgltf_buffer.sizeof())
            requireRange(
                offset = cgltf_buffer_view.offset(view), length = cgltf_buffer_view.size(view),
                available = cgltf_buffer.size(buffer)
            )
            index++
        }
        val accessors = cgltf_data.accessors(data)
        index = 0L
        while (index < cgltf_data.accessors_count(data)) {
            val accessor = accessors.asSlice(index * cgltf_accessor.sizeof(), cgltf_accessor.sizeof())
            val count = cgltf_accessor.count(accessor)
            val componentSize = Cgltf.cgltf_component_size(cgltf_accessor.component_type(accessor))
            val elementSize =
                Cgltf.cgltf_calc_size(cgltf_accessor.type(accessor), cgltf_accessor.component_type(accessor))
            val stride = cgltf_accessor.stride(accessor)
            require(count > 0L && componentSize > 0L && elementSize > 0L && stride >= elementSize && stride % componentSize == 0L) {
                "Invalid GLB accessor layout"
            }
            val pointer = cgltf_accessor.buffer_view(accessor)
            if (pointer.address() != 0L) {
                val view = pointer.reinterpret(cgltf_buffer_view.sizeof())
                val bytes = Math.addExact(Math.multiplyExact(count - 1L, stride), elementSize)
                requireViewRange(
                    view = view,
                    offset = cgltf_accessor.offset(accessor),
                    length = bytes,
                    alignment = componentSize
                )
            }
            if (cgltf_accessor.is_sparse(accessor) != 0) {
                val sparse = cgltf_accessor.sparse(accessor)
                val sparseCount = cgltf_accessor_sparse.count(sparse)
                require(sparseCount > 0L && sparseCount <= count) { "Invalid GLB sparse accessor count" }
                val type = cgltf_accessor_sparse.indices_component_type(sparse)
                require(
                    type == Cgltf.cgltf_component_type_r_8u() || type == Cgltf.cgltf_component_type_r_16u() ||
                            type == Cgltf.cgltf_component_type_r_32u()
                ) { "Invalid sparse index type" }
                val indexSize = Cgltf.cgltf_component_size(type)
                val indexView = cgltf_accessor_sparse.indices_buffer_view(sparse)
                val valuesView = cgltf_accessor_sparse.values_buffer_view(sparse)
                require(indexView.address() != 0L && valuesView.address() != 0L) { "Missing sparse accessor data" }
                requireViewRange(
                    view = indexView.reinterpret(cgltf_buffer_view.sizeof()),
                    offset = cgltf_accessor_sparse.indices_byte_offset(sparse),
                    length = Math.multiplyExact(sparseCount, indexSize), alignment = indexSize,
                )
                requireViewRange(
                    view = valuesView.reinterpret(cgltf_buffer_view.sizeof()),
                    offset = cgltf_accessor_sparse.values_byte_offset(sparse),
                    length = Math.multiplyExact(sparseCount, elementSize), alignment = componentSize,
                )
            }
            index++
        }
    }

    private fun requireViewRange(view: MemorySegment, offset: Long, length: Long, alignment: Long) {
        requireRange(offset = offset, length = length, available = cgltf_buffer_view.size(view))
        val buffer = cgltf_buffer_view.buffer(view).reinterpret(cgltf_buffer.sizeof())
        val address =
            Math.addExact(cgltf_buffer.data(buffer).address(), Math.addExact(cgltf_buffer_view.offset(view), offset))
        require(address % alignment == 0L) { "Unaligned GLB accessor data" }
    }

    private fun requireRange(offset: Long, length: Long, available: Long) {
        require(offset >= 0L && length >= 0L && available >= 0L && offset <= available - length) {
            "GLB buffer range is outside its payload"
        }
    }
}

internal fun checkResult(result: Int, operation: String) {
    if (result == Cgltf.cgltf_result_success()) return
    val reason = when (result) {
        Cgltf.cgltf_result_data_too_short() -> "truncated data"
        Cgltf.cgltf_result_unknown_format() -> "unknown format"
        Cgltf.cgltf_result_invalid_json() -> "invalid JSON"
        Cgltf.cgltf_result_invalid_gltf() -> "invalid glTF"
        Cgltf.cgltf_result_invalid_options() -> "invalid parser options"
        Cgltf.cgltf_result_out_of_memory() -> "out of native memory"
        Cgltf.cgltf_result_legacy_gltf() -> "unsupported glTF version"
        else -> "native error $result"
    }
    throw IllegalArgumentException("Failed to $operation GLB: $reason")
}
