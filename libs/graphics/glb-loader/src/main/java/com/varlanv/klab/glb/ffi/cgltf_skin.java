package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_skin {

    cgltf_skin() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_POINTER.withName("name"),
        Cgltf.C_POINTER.withName("joints"),
        Cgltf.C_SIZE_T.withName("joints_count"),
        Cgltf.C_POINTER.withName("skeleton"),
        Cgltf.C_POINTER.withName("inverse_bind_matrices"),
        cgltf_extras.layout().withName("extras"),
        Cgltf.C_SIZE_T.withName("extensions_count"),
        Cgltf.C_POINTER.withName("extensions")
    ).withName("cgltf_skin");

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

    private static final AddressLayout joints$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("joints"));

    public static final AddressLayout joints$layout() {
        return joints$LAYOUT;
    }

    private static final long joints$OFFSET = $LAYOUT.byteOffset(groupElement("joints"));

    public static final long joints$offset() {
        return joints$OFFSET;
    }

    public static MemorySegment joints(MemorySegment struct) {
        return struct.get(joints$LAYOUT, joints$OFFSET);
    }

    public static void joints(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(joints$LAYOUT, joints$OFFSET, fieldValue);
    }

    private static final OfLong joints_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("joints_count"));

    public static final OfLong joints_count$layout() {
        return joints_count$LAYOUT;
    }

    private static final long joints_count$OFFSET = $LAYOUT.byteOffset(groupElement("joints_count"));

    public static final long joints_count$offset() {
        return joints_count$OFFSET;
    }

    public static long joints_count(MemorySegment struct) {
        return struct.get(joints_count$LAYOUT, joints_count$OFFSET);
    }

    public static void joints_count(MemorySegment struct, long fieldValue) {
        struct.set(joints_count$LAYOUT, joints_count$OFFSET, fieldValue);
    }

    private static final AddressLayout skeleton$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("skeleton"));

    public static final AddressLayout skeleton$layout() {
        return skeleton$LAYOUT;
    }

    private static final long skeleton$OFFSET = $LAYOUT.byteOffset(groupElement("skeleton"));

    public static final long skeleton$offset() {
        return skeleton$OFFSET;
    }

    public static MemorySegment skeleton(MemorySegment struct) {
        return struct.get(skeleton$LAYOUT, skeleton$OFFSET);
    }

    public static void skeleton(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(skeleton$LAYOUT, skeleton$OFFSET, fieldValue);
    }

    private static final AddressLayout inverse_bind_matrices$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("inverse_bind_matrices"));

    public static final AddressLayout inverse_bind_matrices$layout() {
        return inverse_bind_matrices$LAYOUT;
    }

    private static final long inverse_bind_matrices$OFFSET = $LAYOUT.byteOffset(groupElement("inverse_bind_matrices"));

    public static final long inverse_bind_matrices$offset() {
        return inverse_bind_matrices$OFFSET;
    }

    public static MemorySegment inverse_bind_matrices(MemorySegment struct) {
        return struct.get(inverse_bind_matrices$LAYOUT, inverse_bind_matrices$OFFSET);
    }

    public static void inverse_bind_matrices(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(inverse_bind_matrices$LAYOUT, inverse_bind_matrices$OFFSET, fieldValue);
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

