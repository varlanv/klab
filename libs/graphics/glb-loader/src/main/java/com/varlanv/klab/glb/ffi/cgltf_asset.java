package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_asset {

    cgltf_asset() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_POINTER.withName("copyright"),
        Cgltf.C_POINTER.withName("generator"),
        Cgltf.C_POINTER.withName("version"),
        Cgltf.C_POINTER.withName("min_version"),
        cgltf_extras.layout().withName("extras"),
        Cgltf.C_SIZE_T.withName("extensions_count"),
        Cgltf.C_POINTER.withName("extensions")
    ).withName("cgltf_asset");

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout copyright$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("copyright"));

    public static final AddressLayout copyright$layout() {
        return copyright$LAYOUT;
    }

    private static final long copyright$OFFSET = $LAYOUT.byteOffset(groupElement("copyright"));

    public static final long copyright$offset() {
        return copyright$OFFSET;
    }

    public static MemorySegment copyright(MemorySegment struct) {
        return struct.get(copyright$LAYOUT, copyright$OFFSET);
    }

    public static void copyright(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(copyright$LAYOUT, copyright$OFFSET, fieldValue);
    }

    private static final AddressLayout generator$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("generator"));

    public static final AddressLayout generator$layout() {
        return generator$LAYOUT;
    }

    private static final long generator$OFFSET = $LAYOUT.byteOffset(groupElement("generator"));

    public static final long generator$offset() {
        return generator$OFFSET;
    }

    public static MemorySegment generator(MemorySegment struct) {
        return struct.get(generator$LAYOUT, generator$OFFSET);
    }

    public static void generator(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(generator$LAYOUT, generator$OFFSET, fieldValue);
    }

    private static final AddressLayout version$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("version"));

    public static final AddressLayout version$layout() {
        return version$LAYOUT;
    }

    private static final long version$OFFSET = $LAYOUT.byteOffset(groupElement("version"));

    public static final long version$offset() {
        return version$OFFSET;
    }

    public static MemorySegment version(MemorySegment struct) {
        return struct.get(version$LAYOUT, version$OFFSET);
    }

    public static void version(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(version$LAYOUT, version$OFFSET, fieldValue);
    }

    private static final AddressLayout min_version$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("min_version"));

    public static final AddressLayout min_version$layout() {
        return min_version$LAYOUT;
    }

    private static final long min_version$OFFSET = $LAYOUT.byteOffset(groupElement("min_version"));

    public static final long min_version$offset() {
        return min_version$OFFSET;
    }

    public static MemorySegment min_version(MemorySegment struct) {
        return struct.get(min_version$LAYOUT, min_version$OFFSET);
    }

    public static void min_version(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(min_version$LAYOUT, min_version$OFFSET, fieldValue);
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

