package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_animation_channel {

    cgltf_animation_channel() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_POINTER.withName("sampler"),
        Cgltf.C_POINTER.withName("target_node"),
        Cgltf.C_INT.withName("target_path"),
        MemoryLayout.paddingLayout(4),
        cgltf_extras.layout().withName("extras"),
        Cgltf.C_SIZE_T.withName("extensions_count"),
        Cgltf.C_POINTER.withName("extensions")
    ).withName("cgltf_animation_channel");

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout sampler$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("sampler"));

    public static final AddressLayout sampler$layout() {
        return sampler$LAYOUT;
    }

    private static final long sampler$OFFSET = $LAYOUT.byteOffset(groupElement("sampler"));

    public static final long sampler$offset() {
        return sampler$OFFSET;
    }

    public static MemorySegment sampler(MemorySegment struct) {
        return struct.get(sampler$LAYOUT, sampler$OFFSET);
    }

    public static void sampler(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(sampler$LAYOUT, sampler$OFFSET, fieldValue);
    }

    private static final AddressLayout target_node$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("target_node"));

    public static final AddressLayout target_node$layout() {
        return target_node$LAYOUT;
    }

    private static final long target_node$OFFSET = $LAYOUT.byteOffset(groupElement("target_node"));

    public static final long target_node$offset() {
        return target_node$OFFSET;
    }

    public static MemorySegment target_node(MemorySegment struct) {
        return struct.get(target_node$LAYOUT, target_node$OFFSET);
    }

    public static void target_node(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(target_node$LAYOUT, target_node$OFFSET, fieldValue);
    }

    private static final OfInt target_path$LAYOUT = (OfInt)$LAYOUT.select(groupElement("target_path"));

    public static final OfInt target_path$layout() {
        return target_path$LAYOUT;
    }

    private static final long target_path$OFFSET = $LAYOUT.byteOffset(groupElement("target_path"));

    public static final long target_path$offset() {
        return target_path$OFFSET;
    }

    public static int target_path(MemorySegment struct) {
        return struct.get(target_path$LAYOUT, target_path$OFFSET);
    }

    public static void target_path(MemorySegment struct, int fieldValue) {
        struct.set(target_path$LAYOUT, target_path$OFFSET, fieldValue);
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

