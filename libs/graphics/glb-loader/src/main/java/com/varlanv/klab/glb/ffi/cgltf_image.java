package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_image {

    cgltf_image() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_POINTER.withName("name"),
        Cgltf.C_POINTER.withName("uri"),
        Cgltf.C_POINTER.withName("buffer_view"),
        Cgltf.C_POINTER.withName("mime_type"),
        cgltf_extras.layout().withName("extras"),
        Cgltf.C_SIZE_T.withName("extensions_count"),
        Cgltf.C_POINTER.withName("extensions")
    ).withName("cgltf_image");

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

    private static final AddressLayout uri$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("uri"));

    public static final AddressLayout uri$layout() {
        return uri$LAYOUT;
    }

    private static final long uri$OFFSET = $LAYOUT.byteOffset(groupElement("uri"));

    public static final long uri$offset() {
        return uri$OFFSET;
    }

    public static MemorySegment uri(MemorySegment struct) {
        return struct.get(uri$LAYOUT, uri$OFFSET);
    }

    public static void uri(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(uri$LAYOUT, uri$OFFSET, fieldValue);
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

    private static final AddressLayout mime_type$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("mime_type"));

    public static final AddressLayout mime_type$layout() {
        return mime_type$LAYOUT;
    }

    private static final long mime_type$OFFSET = $LAYOUT.byteOffset(groupElement("mime_type"));

    public static final long mime_type$offset() {
        return mime_type$OFFSET;
    }

    public static MemorySegment mime_type(MemorySegment struct) {
        return struct.get(mime_type$LAYOUT, mime_type$OFFSET);
    }

    public static void mime_type(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(mime_type$LAYOUT, mime_type$OFFSET, fieldValue);
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

