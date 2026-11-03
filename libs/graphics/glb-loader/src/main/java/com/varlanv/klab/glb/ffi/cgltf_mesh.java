package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_mesh {

    cgltf_mesh() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_POINTER.withName("name"),
        Cgltf.C_POINTER.withName("primitives"),
        Cgltf.C_SIZE_T.withName("primitives_count"),
        Cgltf.C_POINTER.withName("weights"),
        Cgltf.C_SIZE_T.withName("weights_count"),
        Cgltf.C_POINTER.withName("target_names"),
        Cgltf.C_SIZE_T.withName("target_names_count"),
        cgltf_extras.layout().withName("extras"),
        Cgltf.C_SIZE_T.withName("extensions_count"),
        Cgltf.C_POINTER.withName("extensions")
    ).withName("cgltf_mesh");

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

    private static final AddressLayout primitives$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("primitives"));

    public static final AddressLayout primitives$layout() {
        return primitives$LAYOUT;
    }

    private static final long primitives$OFFSET = $LAYOUT.byteOffset(groupElement("primitives"));

    public static final long primitives$offset() {
        return primitives$OFFSET;
    }

    public static MemorySegment primitives(MemorySegment struct) {
        return struct.get(primitives$LAYOUT, primitives$OFFSET);
    }

    public static void primitives(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(primitives$LAYOUT, primitives$OFFSET, fieldValue);
    }

    private static final OfLong primitives_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("primitives_count"));

    public static final OfLong primitives_count$layout() {
        return primitives_count$LAYOUT;
    }

    private static final long primitives_count$OFFSET = $LAYOUT.byteOffset(groupElement("primitives_count"));

    public static final long primitives_count$offset() {
        return primitives_count$OFFSET;
    }

    public static long primitives_count(MemorySegment struct) {
        return struct.get(primitives_count$LAYOUT, primitives_count$OFFSET);
    }

    public static void primitives_count(MemorySegment struct, long fieldValue) {
        struct.set(primitives_count$LAYOUT, primitives_count$OFFSET, fieldValue);
    }

    private static final AddressLayout weights$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("weights"));

    public static final AddressLayout weights$layout() {
        return weights$LAYOUT;
    }

    private static final long weights$OFFSET = $LAYOUT.byteOffset(groupElement("weights"));

    public static final long weights$offset() {
        return weights$OFFSET;
    }

    public static MemorySegment weights(MemorySegment struct) {
        return struct.get(weights$LAYOUT, weights$OFFSET);
    }

    public static void weights(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(weights$LAYOUT, weights$OFFSET, fieldValue);
    }

    private static final OfLong weights_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("weights_count"));

    public static final OfLong weights_count$layout() {
        return weights_count$LAYOUT;
    }

    private static final long weights_count$OFFSET = $LAYOUT.byteOffset(groupElement("weights_count"));

    public static final long weights_count$offset() {
        return weights_count$OFFSET;
    }

    public static long weights_count(MemorySegment struct) {
        return struct.get(weights_count$LAYOUT, weights_count$OFFSET);
    }

    public static void weights_count(MemorySegment struct, long fieldValue) {
        struct.set(weights_count$LAYOUT, weights_count$OFFSET, fieldValue);
    }

    private static final AddressLayout target_names$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("target_names"));

    public static final AddressLayout target_names$layout() {
        return target_names$LAYOUT;
    }

    private static final long target_names$OFFSET = $LAYOUT.byteOffset(groupElement("target_names"));

    public static final long target_names$offset() {
        return target_names$OFFSET;
    }

    public static MemorySegment target_names(MemorySegment struct) {
        return struct.get(target_names$LAYOUT, target_names$OFFSET);
    }

    public static void target_names(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(target_names$LAYOUT, target_names$OFFSET, fieldValue);
    }

    private static final OfLong target_names_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("target_names_count"));

    public static final OfLong target_names_count$layout() {
        return target_names_count$LAYOUT;
    }

    private static final long target_names_count$OFFSET = $LAYOUT.byteOffset(groupElement("target_names_count"));

    public static final long target_names_count$offset() {
        return target_names_count$OFFSET;
    }

    public static long target_names_count(MemorySegment struct) {
        return struct.get(target_names_count$LAYOUT, target_names_count$OFFSET);
    }

    public static void target_names_count(MemorySegment struct, long fieldValue) {
        struct.set(target_names_count$LAYOUT, target_names_count$OFFSET, fieldValue);
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

