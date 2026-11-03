package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_sampler {

    cgltf_sampler() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_POINTER.withName("name"),
        Cgltf.C_INT.withName("mag_filter"),
        Cgltf.C_INT.withName("min_filter"),
        Cgltf.C_INT.withName("wrap_s"),
        Cgltf.C_INT.withName("wrap_t"),
        cgltf_extras.layout().withName("extras"),
        Cgltf.C_SIZE_T.withName("extensions_count"),
        Cgltf.C_POINTER.withName("extensions")
    ).withName("cgltf_sampler");

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

    private static final OfInt mag_filter$LAYOUT = (OfInt)$LAYOUT.select(groupElement("mag_filter"));

    public static final OfInt mag_filter$layout() {
        return mag_filter$LAYOUT;
    }

    private static final long mag_filter$OFFSET = $LAYOUT.byteOffset(groupElement("mag_filter"));

    public static final long mag_filter$offset() {
        return mag_filter$OFFSET;
    }

    public static int mag_filter(MemorySegment struct) {
        return struct.get(mag_filter$LAYOUT, mag_filter$OFFSET);
    }

    public static void mag_filter(MemorySegment struct, int fieldValue) {
        struct.set(mag_filter$LAYOUT, mag_filter$OFFSET, fieldValue);
    }

    private static final OfInt min_filter$LAYOUT = (OfInt)$LAYOUT.select(groupElement("min_filter"));

    public static final OfInt min_filter$layout() {
        return min_filter$LAYOUT;
    }

    private static final long min_filter$OFFSET = $LAYOUT.byteOffset(groupElement("min_filter"));

    public static final long min_filter$offset() {
        return min_filter$OFFSET;
    }

    public static int min_filter(MemorySegment struct) {
        return struct.get(min_filter$LAYOUT, min_filter$OFFSET);
    }

    public static void min_filter(MemorySegment struct, int fieldValue) {
        struct.set(min_filter$LAYOUT, min_filter$OFFSET, fieldValue);
    }

    private static final OfInt wrap_s$LAYOUT = (OfInt)$LAYOUT.select(groupElement("wrap_s"));

    public static final OfInt wrap_s$layout() {
        return wrap_s$LAYOUT;
    }

    private static final long wrap_s$OFFSET = $LAYOUT.byteOffset(groupElement("wrap_s"));

    public static final long wrap_s$offset() {
        return wrap_s$OFFSET;
    }

    public static int wrap_s(MemorySegment struct) {
        return struct.get(wrap_s$LAYOUT, wrap_s$OFFSET);
    }

    public static void wrap_s(MemorySegment struct, int fieldValue) {
        struct.set(wrap_s$LAYOUT, wrap_s$OFFSET, fieldValue);
    }

    private static final OfInt wrap_t$LAYOUT = (OfInt)$LAYOUT.select(groupElement("wrap_t"));

    public static final OfInt wrap_t$layout() {
        return wrap_t$LAYOUT;
    }

    private static final long wrap_t$OFFSET = $LAYOUT.byteOffset(groupElement("wrap_t"));

    public static final long wrap_t$offset() {
        return wrap_t$OFFSET;
    }

    public static int wrap_t(MemorySegment struct) {
        return struct.get(wrap_t$LAYOUT, wrap_t$OFFSET);
    }

    public static void wrap_t(MemorySegment struct, int fieldValue) {
        struct.set(wrap_t$LAYOUT, wrap_t$OFFSET, fieldValue);
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

