package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_material_mapping {

    cgltf_material_mapping() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_SIZE_T.withName("variant"),
        Cgltf.C_POINTER.withName("material"),
        cgltf_extras.layout().withName("extras")
    ).withName("cgltf_material_mapping");

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong variant$LAYOUT = (OfLong)$LAYOUT.select(groupElement("variant"));

    public static final OfLong variant$layout() {
        return variant$LAYOUT;
    }

    private static final long variant$OFFSET = $LAYOUT.byteOffset(groupElement("variant"));

    public static final long variant$offset() {
        return variant$OFFSET;
    }

    public static long variant(MemorySegment struct) {
        return struct.get(variant$LAYOUT, variant$OFFSET);
    }

    public static void variant(MemorySegment struct, long fieldValue) {
        struct.set(variant$LAYOUT, variant$OFFSET, fieldValue);
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

