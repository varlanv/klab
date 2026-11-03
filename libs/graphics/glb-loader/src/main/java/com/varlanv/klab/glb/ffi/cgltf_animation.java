package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_animation {

    cgltf_animation() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_POINTER.withName("name"),
        Cgltf.C_POINTER.withName("samplers"),
        Cgltf.C_SIZE_T.withName("samplers_count"),
        Cgltf.C_POINTER.withName("channels"),
        Cgltf.C_SIZE_T.withName("channels_count"),
        cgltf_extras.layout().withName("extras"),
        Cgltf.C_SIZE_T.withName("extensions_count"),
        Cgltf.C_POINTER.withName("extensions")
    ).withName("cgltf_animation");

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

    private static final AddressLayout samplers$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("samplers"));

    public static final AddressLayout samplers$layout() {
        return samplers$LAYOUT;
    }

    private static final long samplers$OFFSET = $LAYOUT.byteOffset(groupElement("samplers"));

    public static final long samplers$offset() {
        return samplers$OFFSET;
    }

    public static MemorySegment samplers(MemorySegment struct) {
        return struct.get(samplers$LAYOUT, samplers$OFFSET);
    }

    public static void samplers(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(samplers$LAYOUT, samplers$OFFSET, fieldValue);
    }

    private static final OfLong samplers_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("samplers_count"));

    public static final OfLong samplers_count$layout() {
        return samplers_count$LAYOUT;
    }

    private static final long samplers_count$OFFSET = $LAYOUT.byteOffset(groupElement("samplers_count"));

    public static final long samplers_count$offset() {
        return samplers_count$OFFSET;
    }

    public static long samplers_count(MemorySegment struct) {
        return struct.get(samplers_count$LAYOUT, samplers_count$OFFSET);
    }

    public static void samplers_count(MemorySegment struct, long fieldValue) {
        struct.set(samplers_count$LAYOUT, samplers_count$OFFSET, fieldValue);
    }

    private static final AddressLayout channels$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("channels"));

    public static final AddressLayout channels$layout() {
        return channels$LAYOUT;
    }

    private static final long channels$OFFSET = $LAYOUT.byteOffset(groupElement("channels"));

    public static final long channels$offset() {
        return channels$OFFSET;
    }

    public static MemorySegment channels(MemorySegment struct) {
        return struct.get(channels$LAYOUT, channels$OFFSET);
    }

    public static void channels(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(channels$LAYOUT, channels$OFFSET, fieldValue);
    }

    private static final OfLong channels_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("channels_count"));

    public static final OfLong channels_count$layout() {
        return channels_count$LAYOUT;
    }

    private static final long channels_count$OFFSET = $LAYOUT.byteOffset(groupElement("channels_count"));

    public static final long channels_count$offset() {
        return channels_count$OFFSET;
    }

    public static long channels_count(MemorySegment struct) {
        return struct.get(channels_count$LAYOUT, channels_count$OFFSET);
    }

    public static void channels_count(MemorySegment struct, long fieldValue) {
        struct.set(channels_count$LAYOUT, channels_count$OFFSET, fieldValue);
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

