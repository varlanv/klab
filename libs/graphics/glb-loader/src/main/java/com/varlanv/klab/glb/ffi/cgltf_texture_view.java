package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_texture_view {

    cgltf_texture_view() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_POINTER.withName("texture"),
        Cgltf.C_INT.withName("texcoord"),
        Cgltf.C_FLOAT.withName("scale"),
        Cgltf.C_INT.withName("has_transform"),
        cgltf_texture_transform.layout().withName("transform")
    ).withName("cgltf_texture_view");

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout texture$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("texture"));

    public static final AddressLayout texture$layout() {
        return texture$LAYOUT;
    }

    private static final long texture$OFFSET = $LAYOUT.byteOffset(groupElement("texture"));

    public static final long texture$offset() {
        return texture$OFFSET;
    }

    public static MemorySegment texture(MemorySegment struct) {
        return struct.get(texture$LAYOUT, texture$OFFSET);
    }

    public static void texture(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(texture$LAYOUT, texture$OFFSET, fieldValue);
    }

    private static final OfInt texcoord$LAYOUT = (OfInt)$LAYOUT.select(groupElement("texcoord"));

    public static final OfInt texcoord$layout() {
        return texcoord$LAYOUT;
    }

    private static final long texcoord$OFFSET = $LAYOUT.byteOffset(groupElement("texcoord"));

    public static final long texcoord$offset() {
        return texcoord$OFFSET;
    }

    public static int texcoord(MemorySegment struct) {
        return struct.get(texcoord$LAYOUT, texcoord$OFFSET);
    }

    public static void texcoord(MemorySegment struct, int fieldValue) {
        struct.set(texcoord$LAYOUT, texcoord$OFFSET, fieldValue);
    }

    private static final OfFloat scale$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("scale"));

    public static final OfFloat scale$layout() {
        return scale$LAYOUT;
    }

    private static final long scale$OFFSET = $LAYOUT.byteOffset(groupElement("scale"));

    public static final long scale$offset() {
        return scale$OFFSET;
    }

    public static float scale(MemorySegment struct) {
        return struct.get(scale$LAYOUT, scale$OFFSET);
    }

    public static void scale(MemorySegment struct, float fieldValue) {
        struct.set(scale$LAYOUT, scale$OFFSET, fieldValue);
    }

    private static final OfInt has_transform$LAYOUT = (OfInt)$LAYOUT.select(groupElement("has_transform"));

    public static final OfInt has_transform$layout() {
        return has_transform$LAYOUT;
    }

    private static final long has_transform$OFFSET = $LAYOUT.byteOffset(groupElement("has_transform"));

    public static final long has_transform$offset() {
        return has_transform$OFFSET;
    }

    public static int has_transform(MemorySegment struct) {
        return struct.get(has_transform$LAYOUT, has_transform$OFFSET);
    }

    public static void has_transform(MemorySegment struct, int fieldValue) {
        struct.set(has_transform$LAYOUT, has_transform$OFFSET, fieldValue);
    }

    private static final GroupLayout transform$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("transform"));

    public static final GroupLayout transform$layout() {
        return transform$LAYOUT;
    }

    private static final long transform$OFFSET = $LAYOUT.byteOffset(groupElement("transform"));

    public static final long transform$offset() {
        return transform$OFFSET;
    }

    public static MemorySegment transform(MemorySegment struct) {
        return struct.asSlice(transform$OFFSET, transform$LAYOUT.byteSize());
    }

    public static void transform(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, transform$OFFSET, transform$LAYOUT.byteSize());
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

