package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_accessor_sparse {

    cgltf_accessor_sparse() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_SIZE_T.withName("count"),
        Cgltf.C_POINTER.withName("indices_buffer_view"),
        Cgltf.C_SIZE_T.withName("indices_byte_offset"),
        Cgltf.C_INT.withName("indices_component_type"),
        MemoryLayout.paddingLayout(4),
        Cgltf.C_POINTER.withName("values_buffer_view"),
        Cgltf.C_SIZE_T.withName("values_byte_offset")
    ).withName("cgltf_accessor_sparse");

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("count"));

    public static final OfLong count$layout() {
        return count$LAYOUT;
    }

    private static final long count$OFFSET = $LAYOUT.byteOffset(groupElement("count"));

    public static final long count$offset() {
        return count$OFFSET;
    }

    public static long count(MemorySegment struct) {
        return struct.get(count$LAYOUT, count$OFFSET);
    }

    public static void count(MemorySegment struct, long fieldValue) {
        struct.set(count$LAYOUT, count$OFFSET, fieldValue);
    }

    private static final AddressLayout indices_buffer_view$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("indices_buffer_view"));

    public static final AddressLayout indices_buffer_view$layout() {
        return indices_buffer_view$LAYOUT;
    }

    private static final long indices_buffer_view$OFFSET = $LAYOUT.byteOffset(groupElement("indices_buffer_view"));

    public static final long indices_buffer_view$offset() {
        return indices_buffer_view$OFFSET;
    }

    public static MemorySegment indices_buffer_view(MemorySegment struct) {
        return struct.get(indices_buffer_view$LAYOUT, indices_buffer_view$OFFSET);
    }

    public static void indices_buffer_view(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(indices_buffer_view$LAYOUT, indices_buffer_view$OFFSET, fieldValue);
    }

    private static final OfLong indices_byte_offset$LAYOUT = (OfLong)$LAYOUT.select(groupElement("indices_byte_offset"));

    public static final OfLong indices_byte_offset$layout() {
        return indices_byte_offset$LAYOUT;
    }

    private static final long indices_byte_offset$OFFSET = $LAYOUT.byteOffset(groupElement("indices_byte_offset"));

    public static final long indices_byte_offset$offset() {
        return indices_byte_offset$OFFSET;
    }

    public static long indices_byte_offset(MemorySegment struct) {
        return struct.get(indices_byte_offset$LAYOUT, indices_byte_offset$OFFSET);
    }

    public static void indices_byte_offset(MemorySegment struct, long fieldValue) {
        struct.set(indices_byte_offset$LAYOUT, indices_byte_offset$OFFSET, fieldValue);
    }

    private static final OfInt indices_component_type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("indices_component_type"));

    public static final OfInt indices_component_type$layout() {
        return indices_component_type$LAYOUT;
    }

    private static final long indices_component_type$OFFSET = $LAYOUT.byteOffset(groupElement("indices_component_type"));

    public static final long indices_component_type$offset() {
        return indices_component_type$OFFSET;
    }

    public static int indices_component_type(MemorySegment struct) {
        return struct.get(indices_component_type$LAYOUT, indices_component_type$OFFSET);
    }

    public static void indices_component_type(MemorySegment struct, int fieldValue) {
        struct.set(indices_component_type$LAYOUT, indices_component_type$OFFSET, fieldValue);
    }

    private static final AddressLayout values_buffer_view$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("values_buffer_view"));

    public static final AddressLayout values_buffer_view$layout() {
        return values_buffer_view$LAYOUT;
    }

    private static final long values_buffer_view$OFFSET = $LAYOUT.byteOffset(groupElement("values_buffer_view"));

    public static final long values_buffer_view$offset() {
        return values_buffer_view$OFFSET;
    }

    public static MemorySegment values_buffer_view(MemorySegment struct) {
        return struct.get(values_buffer_view$LAYOUT, values_buffer_view$OFFSET);
    }

    public static void values_buffer_view(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(values_buffer_view$LAYOUT, values_buffer_view$OFFSET, fieldValue);
    }

    private static final OfLong values_byte_offset$LAYOUT = (OfLong)$LAYOUT.select(groupElement("values_byte_offset"));

    public static final OfLong values_byte_offset$layout() {
        return values_byte_offset$LAYOUT;
    }

    private static final long values_byte_offset$OFFSET = $LAYOUT.byteOffset(groupElement("values_byte_offset"));

    public static final long values_byte_offset$offset() {
        return values_byte_offset$OFFSET;
    }

    public static long values_byte_offset(MemorySegment struct) {
        return struct.get(values_byte_offset$LAYOUT, values_byte_offset$OFFSET);
    }

    public static void values_byte_offset(MemorySegment struct, long fieldValue) {
        struct.set(values_byte_offset$LAYOUT, values_byte_offset$OFFSET, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    public static long sizeof() { return layout().byteSize(); }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

