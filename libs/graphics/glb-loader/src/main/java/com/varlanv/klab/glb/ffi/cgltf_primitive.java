package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_primitive {

    cgltf_primitive() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        Cgltf.C_POINTER.withName("indices"),
        Cgltf.C_POINTER.withName("material"),
        Cgltf.C_POINTER.withName("attributes"),
        Cgltf.C_SIZE_T.withName("attributes_count"),
        Cgltf.C_POINTER.withName("targets"),
        Cgltf.C_SIZE_T.withName("targets_count"),
        cgltf_extras.layout().withName("extras"),
        Cgltf.C_INT.withName("has_draco_mesh_compression"),
        MemoryLayout.paddingLayout(4),
        cgltf_draco_mesh_compression.layout().withName("draco_mesh_compression"),
        Cgltf.C_POINTER.withName("mappings"),
        Cgltf.C_SIZE_T.withName("mappings_count"),
        Cgltf.C_SIZE_T.withName("extensions_count"),
        Cgltf.C_POINTER.withName("extensions")
    ).withName("cgltf_primitive");

    public static final GroupLayout layout() {
        return $LAYOUT;
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

    private static final AddressLayout indices$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("indices"));

    public static final AddressLayout indices$layout() {
        return indices$LAYOUT;
    }

    private static final long indices$OFFSET = $LAYOUT.byteOffset(groupElement("indices"));

    public static final long indices$offset() {
        return indices$OFFSET;
    }

    public static MemorySegment indices(MemorySegment struct) {
        return struct.get(indices$LAYOUT, indices$OFFSET);
    }

    public static void indices(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(indices$LAYOUT, indices$OFFSET, fieldValue);
    }

    private static final AddressLayout material$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("material"));

    public static final AddressLayout material$layout() {
        return material$LAYOUT;
    }

    private static final long material$OFFSET = $LAYOUT.byteOffset(groupElement("material"));

    public static final long material$offset() {
        return material$OFFSET;
    }

    public static MemorySegment material(MemorySegment struct) {
        return struct.get(material$LAYOUT, material$OFFSET);
    }

    public static void material(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(material$LAYOUT, material$OFFSET, fieldValue);
    }

    private static final AddressLayout attributes$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("attributes"));

    public static final AddressLayout attributes$layout() {
        return attributes$LAYOUT;
    }

    private static final long attributes$OFFSET = $LAYOUT.byteOffset(groupElement("attributes"));

    public static final long attributes$offset() {
        return attributes$OFFSET;
    }

    public static MemorySegment attributes(MemorySegment struct) {
        return struct.get(attributes$LAYOUT, attributes$OFFSET);
    }

    public static void attributes(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(attributes$LAYOUT, attributes$OFFSET, fieldValue);
    }

    private static final OfLong attributes_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("attributes_count"));

    public static final OfLong attributes_count$layout() {
        return attributes_count$LAYOUT;
    }

    private static final long attributes_count$OFFSET = $LAYOUT.byteOffset(groupElement("attributes_count"));

    public static final long attributes_count$offset() {
        return attributes_count$OFFSET;
    }

    public static long attributes_count(MemorySegment struct) {
        return struct.get(attributes_count$LAYOUT, attributes_count$OFFSET);
    }

    public static void attributes_count(MemorySegment struct, long fieldValue) {
        struct.set(attributes_count$LAYOUT, attributes_count$OFFSET, fieldValue);
    }

    private static final AddressLayout targets$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("targets"));

    public static final AddressLayout targets$layout() {
        return targets$LAYOUT;
    }

    private static final long targets$OFFSET = $LAYOUT.byteOffset(groupElement("targets"));

    public static final long targets$offset() {
        return targets$OFFSET;
    }

    public static MemorySegment targets(MemorySegment struct) {
        return struct.get(targets$LAYOUT, targets$OFFSET);
    }

    public static void targets(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(targets$LAYOUT, targets$OFFSET, fieldValue);
    }

    private static final OfLong targets_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("targets_count"));

    public static final OfLong targets_count$layout() {
        return targets_count$LAYOUT;
    }

    private static final long targets_count$OFFSET = $LAYOUT.byteOffset(groupElement("targets_count"));

    public static final long targets_count$offset() {
        return targets_count$OFFSET;
    }

    public static long targets_count(MemorySegment struct) {
        return struct.get(targets_count$LAYOUT, targets_count$OFFSET);
    }

    public static void targets_count(MemorySegment struct, long fieldValue) {
        struct.set(targets_count$LAYOUT, targets_count$OFFSET, fieldValue);
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

    private static final OfInt has_draco_mesh_compression$LAYOUT = (OfInt)$LAYOUT.select(groupElement("has_draco_mesh_compression"));

    public static final OfInt has_draco_mesh_compression$layout() {
        return has_draco_mesh_compression$LAYOUT;
    }

    private static final long has_draco_mesh_compression$OFFSET = $LAYOUT.byteOffset(groupElement("has_draco_mesh_compression"));

    public static final long has_draco_mesh_compression$offset() {
        return has_draco_mesh_compression$OFFSET;
    }

    public static int has_draco_mesh_compression(MemorySegment struct) {
        return struct.get(has_draco_mesh_compression$LAYOUT, has_draco_mesh_compression$OFFSET);
    }

    public static void has_draco_mesh_compression(MemorySegment struct, int fieldValue) {
        struct.set(has_draco_mesh_compression$LAYOUT, has_draco_mesh_compression$OFFSET, fieldValue);
    }

    private static final GroupLayout draco_mesh_compression$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("draco_mesh_compression"));

    public static final GroupLayout draco_mesh_compression$layout() {
        return draco_mesh_compression$LAYOUT;
    }

    private static final long draco_mesh_compression$OFFSET = $LAYOUT.byteOffset(groupElement("draco_mesh_compression"));

    public static final long draco_mesh_compression$offset() {
        return draco_mesh_compression$OFFSET;
    }

    public static MemorySegment draco_mesh_compression(MemorySegment struct) {
        return struct.asSlice(draco_mesh_compression$OFFSET, draco_mesh_compression$LAYOUT.byteSize());
    }

    public static void draco_mesh_compression(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, draco_mesh_compression$OFFSET, draco_mesh_compression$LAYOUT.byteSize());
    }

    private static final AddressLayout mappings$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("mappings"));

    public static final AddressLayout mappings$layout() {
        return mappings$LAYOUT;
    }

    private static final long mappings$OFFSET = $LAYOUT.byteOffset(groupElement("mappings"));

    public static final long mappings$offset() {
        return mappings$OFFSET;
    }

    public static MemorySegment mappings(MemorySegment struct) {
        return struct.get(mappings$LAYOUT, mappings$OFFSET);
    }

    public static void mappings(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(mappings$LAYOUT, mappings$OFFSET, fieldValue);
    }

    private static final OfLong mappings_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("mappings_count"));

    public static final OfLong mappings_count$layout() {
        return mappings_count$LAYOUT;
    }

    private static final long mappings_count$OFFSET = $LAYOUT.byteOffset(groupElement("mappings_count"));

    public static final long mappings_count$offset() {
        return mappings_count$OFFSET;
    }

    public static long mappings_count(MemorySegment struct) {
        return struct.get(mappings_count$LAYOUT, mappings_count$OFFSET);
    }

    public static void mappings_count(MemorySegment struct, long fieldValue) {
        struct.set(mappings_count$LAYOUT, mappings_count$OFFSET, fieldValue);
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

