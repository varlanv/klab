package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_accessor {

    cgltf_accessor() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_POINTER.withName("name"),
        Cgltf.C_INT.withName("component_type"),
        Cgltf.C_INT.withName("normalized"),
        Cgltf.C_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        Cgltf.C_SIZE_T.withName("offset"),
        Cgltf.C_SIZE_T.withName("count"),
        Cgltf.C_SIZE_T.withName("stride"),
        Cgltf.C_POINTER.withName("buffer_view"),
        Cgltf.C_INT.withName("has_min"),
        MemoryLayout.sequenceLayout(16, Cgltf.C_FLOAT).withName("min"),
        Cgltf.C_INT.withName("has_max"),
        MemoryLayout.sequenceLayout(16, Cgltf.C_FLOAT).withName("max"),
        Cgltf.C_INT.withName("is_sparse"),
        MemoryLayout.paddingLayout(4),
        cgltf_accessor_sparse.layout().withName("sparse"),
        cgltf_extras.layout().withName("extras"),
        Cgltf.C_SIZE_T.withName("extensions_count"),
        Cgltf.C_POINTER.withName("extensions")
    ).withName("cgltf_accessor");

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout name$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("name"));

    public static final AddressLayout name$layout() {
        return name$LAYOUT;
    }

    private static final long name$OFFSET = $LAYOUT.byteOffset(groupElement("name"));

    public static final long name$offset() {
        return name$OFFSET;
    }

    public static MemorySegment name(MemorySegment struct) {
        return struct.get(name$LAYOUT, name$OFFSET);
    }

    public static void name(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(name$LAYOUT, name$OFFSET, fieldValue);
    }

    private static final OfInt component_type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("component_type"));

    public static final OfInt component_type$layout() {
        return component_type$LAYOUT;
    }

    private static final long component_type$OFFSET = $LAYOUT.byteOffset(groupElement("component_type"));

    public static final long component_type$offset() {
        return component_type$OFFSET;
    }

    public static int component_type(MemorySegment struct) {
        return struct.get(component_type$LAYOUT, component_type$OFFSET);
    }

    public static void component_type(MemorySegment struct, int fieldValue) {
        struct.set(component_type$LAYOUT, component_type$OFFSET, fieldValue);
    }

    private static final OfInt normalized$LAYOUT = (OfInt)$LAYOUT.select(groupElement("normalized"));

    public static final OfInt normalized$layout() {
        return normalized$LAYOUT;
    }

    private static final long normalized$OFFSET = $LAYOUT.byteOffset(groupElement("normalized"));

    public static final long normalized$offset() {
        return normalized$OFFSET;
    }

    public static int normalized(MemorySegment struct) {
        return struct.get(normalized$LAYOUT, normalized$OFFSET);
    }

    public static void normalized(MemorySegment struct, int fieldValue) {
        struct.set(normalized$LAYOUT, normalized$OFFSET, fieldValue);
    }

    private static final OfInt type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("type"));

    public static final OfInt type$layout() {
        return type$LAYOUT;
    }

    private static final long type$OFFSET = $LAYOUT.byteOffset(groupElement("type"));

    public static final long type$offset() {
        return type$OFFSET;
    }

    public static int type(MemorySegment struct) {
        return struct.get(type$LAYOUT, type$OFFSET);
    }

    public static void type(MemorySegment struct, int fieldValue) {
        struct.set(type$LAYOUT, type$OFFSET, fieldValue);
    }

    private static final OfLong offset$LAYOUT = (OfLong)$LAYOUT.select(groupElement("offset"));

    public static final OfLong offset$layout() {
        return offset$LAYOUT;
    }

    private static final long offset$OFFSET = $LAYOUT.byteOffset(groupElement("offset"));

    public static final long offset$offset() {
        return offset$OFFSET;
    }

    public static long offset(MemorySegment struct) {
        return struct.get(offset$LAYOUT, offset$OFFSET);
    }

    public static void offset(MemorySegment struct, long fieldValue) {
        struct.set(offset$LAYOUT, offset$OFFSET, fieldValue);
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

    private static final OfLong stride$LAYOUT = (OfLong)$LAYOUT.select(groupElement("stride"));

    public static final OfLong stride$layout() {
        return stride$LAYOUT;
    }

    private static final long stride$OFFSET = $LAYOUT.byteOffset(groupElement("stride"));

    public static final long stride$offset() {
        return stride$OFFSET;
    }

    public static long stride(MemorySegment struct) {
        return struct.get(stride$LAYOUT, stride$OFFSET);
    }

    public static void stride(MemorySegment struct, long fieldValue) {
        struct.set(stride$LAYOUT, stride$OFFSET, fieldValue);
    }

    private static final AddressLayout buffer_view$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("buffer_view"));

    public static final AddressLayout buffer_view$layout() {
        return buffer_view$LAYOUT;
    }

    private static final long buffer_view$OFFSET = $LAYOUT.byteOffset(groupElement("buffer_view"));

    public static final long buffer_view$offset() {
        return buffer_view$OFFSET;
    }

    public static MemorySegment buffer_view(MemorySegment struct) {
        return struct.get(buffer_view$LAYOUT, buffer_view$OFFSET);
    }

    public static void buffer_view(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(buffer_view$LAYOUT, buffer_view$OFFSET, fieldValue);
    }

    private static final OfInt has_min$LAYOUT = (OfInt)$LAYOUT.select(groupElement("has_min"));

    public static final OfInt has_min$layout() {
        return has_min$LAYOUT;
    }

    private static final long has_min$OFFSET = $LAYOUT.byteOffset(groupElement("has_min"));

    public static final long has_min$offset() {
        return has_min$OFFSET;
    }

    public static int has_min(MemorySegment struct) {
        return struct.get(has_min$LAYOUT, has_min$OFFSET);
    }

    public static void has_min(MemorySegment struct, int fieldValue) {
        struct.set(has_min$LAYOUT, has_min$OFFSET, fieldValue);
    }

    private static final SequenceLayout min$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("min"));

    public static final SequenceLayout min$layout() {
        return min$LAYOUT;
    }

    private static final long min$OFFSET = $LAYOUT.byteOffset(groupElement("min"));

    public static final long min$offset() {
        return min$OFFSET;
    }

    public static MemorySegment min(MemorySegment struct) {
        return struct.asSlice(min$OFFSET, min$LAYOUT.byteSize());
    }

    public static void min(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, min$OFFSET, min$LAYOUT.byteSize());
    }

    private static long[] min$DIMS = { 16 };

    public static long[] min$dimensions() {
        return min$DIMS;
    }
    private static final VarHandle min$ELEM_HANDLE = min$LAYOUT.varHandle(sequenceElement());

    public static float min(MemorySegment struct, long index0) {
        return (float)min$ELEM_HANDLE.get(struct, min$OFFSET, index0);
    }

    public static void min(MemorySegment struct, long index0, float fieldValue) {
        min$ELEM_HANDLE.set(struct, min$OFFSET, index0, fieldValue);
    }

    private static final OfInt has_max$LAYOUT = (OfInt)$LAYOUT.select(groupElement("has_max"));

    public static final OfInt has_max$layout() {
        return has_max$LAYOUT;
    }

    private static final long has_max$OFFSET = $LAYOUT.byteOffset(groupElement("has_max"));

    public static final long has_max$offset() {
        return has_max$OFFSET;
    }

    public static int has_max(MemorySegment struct) {
        return struct.get(has_max$LAYOUT, has_max$OFFSET);
    }

    public static void has_max(MemorySegment struct, int fieldValue) {
        struct.set(has_max$LAYOUT, has_max$OFFSET, fieldValue);
    }

    private static final SequenceLayout max$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("max"));

    public static final SequenceLayout max$layout() {
        return max$LAYOUT;
    }

    private static final long max$OFFSET = $LAYOUT.byteOffset(groupElement("max"));

    public static final long max$offset() {
        return max$OFFSET;
    }

    public static MemorySegment max(MemorySegment struct) {
        return struct.asSlice(max$OFFSET, max$LAYOUT.byteSize());
    }

    public static void max(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, max$OFFSET, max$LAYOUT.byteSize());
    }

    private static long[] max$DIMS = { 16 };

    public static long[] max$dimensions() {
        return max$DIMS;
    }
    private static final VarHandle max$ELEM_HANDLE = max$LAYOUT.varHandle(sequenceElement());

    public static float max(MemorySegment struct, long index0) {
        return (float)max$ELEM_HANDLE.get(struct, max$OFFSET, index0);
    }

    public static void max(MemorySegment struct, long index0, float fieldValue) {
        max$ELEM_HANDLE.set(struct, max$OFFSET, index0, fieldValue);
    }

    private static final OfInt is_sparse$LAYOUT = (OfInt)$LAYOUT.select(groupElement("is_sparse"));

    public static final OfInt is_sparse$layout() {
        return is_sparse$LAYOUT;
    }

    private static final long is_sparse$OFFSET = $LAYOUT.byteOffset(groupElement("is_sparse"));

    public static final long is_sparse$offset() {
        return is_sparse$OFFSET;
    }

    public static int is_sparse(MemorySegment struct) {
        return struct.get(is_sparse$LAYOUT, is_sparse$OFFSET);
    }

    public static void is_sparse(MemorySegment struct, int fieldValue) {
        struct.set(is_sparse$LAYOUT, is_sparse$OFFSET, fieldValue);
    }

    private static final GroupLayout sparse$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("sparse"));

    public static final GroupLayout sparse$layout() {
        return sparse$LAYOUT;
    }

    private static final long sparse$OFFSET = $LAYOUT.byteOffset(groupElement("sparse"));

    public static final long sparse$offset() {
        return sparse$OFFSET;
    }

    public static MemorySegment sparse(MemorySegment struct) {
        return struct.asSlice(sparse$OFFSET, sparse$LAYOUT.byteSize());
    }

    public static void sparse(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, sparse$OFFSET, sparse$LAYOUT.byteSize());
    }

    private static final GroupLayout extras$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("extras"));

    public static final GroupLayout extras$layout() {
        return extras$LAYOUT;
    }

    private static final long extras$OFFSET = $LAYOUT.byteOffset(groupElement("extras"));

    public static final long extras$offset() {
        return extras$OFFSET;
    }

    public static MemorySegment extras(MemorySegment struct) {
        return struct.asSlice(extras$OFFSET, extras$LAYOUT.byteSize());
    }

    public static void extras(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, extras$OFFSET, extras$LAYOUT.byteSize());
    }

    private static final OfLong extensions_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("extensions_count"));

    public static final OfLong extensions_count$layout() {
        return extensions_count$LAYOUT;
    }

    private static final long extensions_count$OFFSET = $LAYOUT.byteOffset(groupElement("extensions_count"));

    public static final long extensions_count$offset() {
        return extensions_count$OFFSET;
    }

    public static long extensions_count(MemorySegment struct) {
        return struct.get(extensions_count$LAYOUT, extensions_count$OFFSET);
    }

    public static void extensions_count(MemorySegment struct, long fieldValue) {
        struct.set(extensions_count$LAYOUT, extensions_count$OFFSET, fieldValue);
    }

    private static final AddressLayout extensions$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("extensions"));

    public static final AddressLayout extensions$layout() {
        return extensions$LAYOUT;
    }

    private static final long extensions$OFFSET = $LAYOUT.byteOffset(groupElement("extensions"));

    public static final long extensions$offset() {
        return extensions$OFFSET;
    }

    public static MemorySegment extensions(MemorySegment struct) {
        return struct.get(extensions$LAYOUT, extensions$OFFSET);
    }

    public static void extensions(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(extensions$LAYOUT, extensions$OFFSET, fieldValue);
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

