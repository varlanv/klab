package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_scene {

    cgltf_scene() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_POINTER.withName("name"),
        Cgltf.C_POINTER.withName("nodes"),
        Cgltf.C_SIZE_T.withName("nodes_count"),
        cgltf_extras.layout().withName("extras"),
        Cgltf.C_SIZE_T.withName("extensions_count"),
        Cgltf.C_POINTER.withName("extensions")
    ).withName("cgltf_scene");

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

    private static final AddressLayout nodes$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("nodes"));

    public static final AddressLayout nodes$layout() {
        return nodes$LAYOUT;
    }

    private static final long nodes$OFFSET = $LAYOUT.byteOffset(groupElement("nodes"));

    public static final long nodes$offset() {
        return nodes$OFFSET;
    }

    public static MemorySegment nodes(MemorySegment struct) {
        return struct.get(nodes$LAYOUT, nodes$OFFSET);
    }

    public static void nodes(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(nodes$LAYOUT, nodes$OFFSET, fieldValue);
    }

    private static final OfLong nodes_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("nodes_count"));

    public static final OfLong nodes_count$layout() {
        return nodes_count$LAYOUT;
    }

    private static final long nodes_count$OFFSET = $LAYOUT.byteOffset(groupElement("nodes_count"));

    public static final long nodes_count$offset() {
        return nodes_count$OFFSET;
    }

    public static long nodes_count(MemorySegment struct) {
        return struct.get(nodes_count$LAYOUT, nodes_count$OFFSET);
    }

    public static void nodes_count(MemorySegment struct, long fieldValue) {
        struct.set(nodes_count$LAYOUT, nodes_count$OFFSET, fieldValue);
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

