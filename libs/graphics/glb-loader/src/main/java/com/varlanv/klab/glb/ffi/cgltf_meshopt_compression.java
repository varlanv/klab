package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_meshopt_compression {

    cgltf_meshopt_compression() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_POINTER.withName("buffer"),
        Cgltf.C_SIZE_T.withName("offset"),
        Cgltf.C_SIZE_T.withName("size"),
        Cgltf.C_SIZE_T.withName("stride"),
        Cgltf.C_SIZE_T.withName("count"),
        Cgltf.C_INT.withName("mode"),
        Cgltf.C_INT.withName("filter"),
        Cgltf.C_INT.withName("is_khr"),
        MemoryLayout.paddingLayout(4)
    ).withName("cgltf_meshopt_compression");

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout buffer$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("buffer"));

    public static final AddressLayout buffer$layout() {
        return buffer$LAYOUT;
    }

    private static final long buffer$OFFSET = $LAYOUT.byteOffset(groupElement("buffer"));

    public static final long buffer$offset() {
        return buffer$OFFSET;
    }

    public static MemorySegment buffer(MemorySegment struct) {
        return struct.get(buffer$LAYOUT, buffer$OFFSET);
    }

    public static void buffer(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(buffer$LAYOUT, buffer$OFFSET, fieldValue);
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

    private static final OfLong size$LAYOUT = (OfLong)$LAYOUT.select(groupElement("size"));

    public static final OfLong size$layout() {
        return size$LAYOUT;
    }

    private static final long size$OFFSET = $LAYOUT.byteOffset(groupElement("size"));

    public static final long size$offset() {
        return size$OFFSET;
    }

    public static long size(MemorySegment struct) {
        return struct.get(size$LAYOUT, size$OFFSET);
    }

    public static void size(MemorySegment struct, long fieldValue) {
        struct.set(size$LAYOUT, size$OFFSET, fieldValue);
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

    private static final OfInt mode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("mode"));

    public static final OfInt mode$layout() {
        return mode$LAYOUT;
    }

    private static final long mode$OFFSET = $LAYOUT.byteOffset(groupElement("mode"));

    public static final long mode$offset() {
        return mode$OFFSET;
    }

    public static int mode(MemorySegment struct) {
        return struct.get(mode$LAYOUT, mode$OFFSET);
    }

    public static void mode(MemorySegment struct, int fieldValue) {
        struct.set(mode$LAYOUT, mode$OFFSET, fieldValue);
    }

    private static final OfInt filter$LAYOUT = (OfInt)$LAYOUT.select(groupElement("filter"));

    public static final OfInt filter$layout() {
        return filter$LAYOUT;
    }

    private static final long filter$OFFSET = $LAYOUT.byteOffset(groupElement("filter"));

    public static final long filter$offset() {
        return filter$OFFSET;
    }

    public static int filter(MemorySegment struct) {
        return struct.get(filter$LAYOUT, filter$OFFSET);
    }

    public static void filter(MemorySegment struct, int fieldValue) {
        struct.set(filter$LAYOUT, filter$OFFSET, fieldValue);
    }

    private static final OfInt is_khr$LAYOUT = (OfInt)$LAYOUT.select(groupElement("is_khr"));

    public static final OfInt is_khr$layout() {
        return is_khr$LAYOUT;
    }

    private static final long is_khr$OFFSET = $LAYOUT.byteOffset(groupElement("is_khr"));

    public static final long is_khr$offset() {
        return is_khr$OFFSET;
    }

    public static int is_khr(MemorySegment struct) {
        return struct.get(is_khr$LAYOUT, is_khr$OFFSET);
    }

    public static void is_khr(MemorySegment struct, int fieldValue) {
        struct.set(is_khr$LAYOUT, is_khr$OFFSET, fieldValue);
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

