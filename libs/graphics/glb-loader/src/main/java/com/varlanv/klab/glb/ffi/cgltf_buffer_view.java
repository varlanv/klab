package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_buffer_view {

    cgltf_buffer_view() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_POINTER.withName("name"),
        Cgltf.C_POINTER.withName("buffer"),
        Cgltf.C_SIZE_T.withName("offset"),
        Cgltf.C_SIZE_T.withName("size"),
        Cgltf.C_SIZE_T.withName("stride"),
        Cgltf.C_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        Cgltf.C_POINTER.withName("data"),
        Cgltf.C_INT.withName("has_meshopt_compression"),
        MemoryLayout.paddingLayout(4),
        cgltf_meshopt_compression.layout().withName("meshopt_compression"),
        cgltf_extras.layout().withName("extras"),
        Cgltf.C_SIZE_T.withName("extensions_count"),
        Cgltf.C_POINTER.withName("extensions")
    ).withName("cgltf_buffer_view");

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

    private static final AddressLayout data$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("data"));

    public static final AddressLayout data$layout() {
        return data$LAYOUT;
    }

    private static final long data$OFFSET = $LAYOUT.byteOffset(groupElement("data"));

    public static final long data$offset() {
        return data$OFFSET;
    }

    public static MemorySegment data(MemorySegment struct) {
        return struct.get(data$LAYOUT, data$OFFSET);
    }

    public static void data(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(data$LAYOUT, data$OFFSET, fieldValue);
    }

    private static final OfInt has_meshopt_compression$LAYOUT = (OfInt)$LAYOUT.select(groupElement("has_meshopt_compression"));

    public static final OfInt has_meshopt_compression$layout() {
        return has_meshopt_compression$LAYOUT;
    }

    private static final long has_meshopt_compression$OFFSET = $LAYOUT.byteOffset(groupElement("has_meshopt_compression"));

    public static final long has_meshopt_compression$offset() {
        return has_meshopt_compression$OFFSET;
    }

    public static int has_meshopt_compression(MemorySegment struct) {
        return struct.get(has_meshopt_compression$LAYOUT, has_meshopt_compression$OFFSET);
    }

    public static void has_meshopt_compression(MemorySegment struct, int fieldValue) {
        struct.set(has_meshopt_compression$LAYOUT, has_meshopt_compression$OFFSET, fieldValue);
    }

    private static final GroupLayout meshopt_compression$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("meshopt_compression"));

    public static final GroupLayout meshopt_compression$layout() {
        return meshopt_compression$LAYOUT;
    }

    private static final long meshopt_compression$OFFSET = $LAYOUT.byteOffset(groupElement("meshopt_compression"));

    public static final long meshopt_compression$offset() {
        return meshopt_compression$OFFSET;
    }

    public static MemorySegment meshopt_compression(MemorySegment struct) {
        return struct.asSlice(meshopt_compression$OFFSET, meshopt_compression$LAYOUT.byteSize());
    }

    public static void meshopt_compression(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, meshopt_compression$OFFSET, meshopt_compression$LAYOUT.byteSize());
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

