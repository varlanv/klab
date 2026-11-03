package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_texture {

    cgltf_texture() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_POINTER.withName("name"),
        Cgltf.C_POINTER.withName("image"),
        Cgltf.C_POINTER.withName("sampler"),
        Cgltf.C_INT.withName("has_basisu"),
        MemoryLayout.paddingLayout(4),
        Cgltf.C_POINTER.withName("basisu_image"),
        Cgltf.C_INT.withName("has_webp"),
        MemoryLayout.paddingLayout(4),
        Cgltf.C_POINTER.withName("webp_image"),
        cgltf_extras.layout().withName("extras"),
        Cgltf.C_SIZE_T.withName("extensions_count"),
        Cgltf.C_POINTER.withName("extensions")
    ).withName("cgltf_texture");

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

    private static final AddressLayout image$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("image"));

    public static final AddressLayout image$layout() {
        return image$LAYOUT;
    }

    private static final long image$OFFSET = $LAYOUT.byteOffset(groupElement("image"));

    public static final long image$offset() {
        return image$OFFSET;
    }

    public static MemorySegment image(MemorySegment struct) {
        return struct.get(image$LAYOUT, image$OFFSET);
    }

    public static void image(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(image$LAYOUT, image$OFFSET, fieldValue);
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

    private static final OfInt has_basisu$LAYOUT = (OfInt)$LAYOUT.select(groupElement("has_basisu"));

    public static final OfInt has_basisu$layout() {
        return has_basisu$LAYOUT;
    }

    private static final long has_basisu$OFFSET = $LAYOUT.byteOffset(groupElement("has_basisu"));

    public static final long has_basisu$offset() {
        return has_basisu$OFFSET;
    }

    public static int has_basisu(MemorySegment struct) {
        return struct.get(has_basisu$LAYOUT, has_basisu$OFFSET);
    }

    public static void has_basisu(MemorySegment struct, int fieldValue) {
        struct.set(has_basisu$LAYOUT, has_basisu$OFFSET, fieldValue);
    }

    private static final AddressLayout basisu_image$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("basisu_image"));

    public static final AddressLayout basisu_image$layout() {
        return basisu_image$LAYOUT;
    }

    private static final long basisu_image$OFFSET = $LAYOUT.byteOffset(groupElement("basisu_image"));

    public static final long basisu_image$offset() {
        return basisu_image$OFFSET;
    }

    public static MemorySegment basisu_image(MemorySegment struct) {
        return struct.get(basisu_image$LAYOUT, basisu_image$OFFSET);
    }

    public static void basisu_image(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(basisu_image$LAYOUT, basisu_image$OFFSET, fieldValue);
    }

    private static final OfInt has_webp$LAYOUT = (OfInt)$LAYOUT.select(groupElement("has_webp"));

    public static final OfInt has_webp$layout() {
        return has_webp$LAYOUT;
    }

    private static final long has_webp$OFFSET = $LAYOUT.byteOffset(groupElement("has_webp"));

    public static final long has_webp$offset() {
        return has_webp$OFFSET;
    }

    public static int has_webp(MemorySegment struct) {
        return struct.get(has_webp$LAYOUT, has_webp$OFFSET);
    }

    public static void has_webp(MemorySegment struct, int fieldValue) {
        struct.set(has_webp$LAYOUT, has_webp$OFFSET, fieldValue);
    }

    private static final AddressLayout webp_image$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("webp_image"));

    public static final AddressLayout webp_image$layout() {
        return webp_image$LAYOUT;
    }

    private static final long webp_image$OFFSET = $LAYOUT.byteOffset(groupElement("webp_image"));

    public static final long webp_image$offset() {
        return webp_image$OFFSET;
    }

    public static MemorySegment webp_image(MemorySegment struct) {
        return struct.get(webp_image$LAYOUT, webp_image$OFFSET);
    }

    public static void webp_image(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(webp_image$LAYOUT, webp_image$OFFSET, fieldValue);
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

