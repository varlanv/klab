package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_texture_transform {

    cgltf_texture_transform() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(2, Cgltf.C_FLOAT).withName("offset"),
        Cgltf.C_FLOAT.withName("rotation"),
        MemoryLayout.sequenceLayout(2, Cgltf.C_FLOAT).withName("scale"),
        Cgltf.C_INT.withName("has_texcoord"),
        Cgltf.C_INT.withName("texcoord")
    ).withName("cgltf_texture_transform");

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final SequenceLayout offset$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("offset"));

    public static final SequenceLayout offset$layout() {
        return offset$LAYOUT;
    }

    private static final long offset$OFFSET = $LAYOUT.byteOffset(groupElement("offset"));

    public static final long offset$offset() {
        return offset$OFFSET;
    }

    public static MemorySegment offset(MemorySegment struct) {
        return struct.asSlice(offset$OFFSET, offset$LAYOUT.byteSize());
    }

    public static void offset(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, offset$OFFSET, offset$LAYOUT.byteSize());
    }

    private static long[] offset$DIMS = { 2 };

    public static long[] offset$dimensions() {
        return offset$DIMS;
    }
    private static final VarHandle offset$ELEM_HANDLE = offset$LAYOUT.varHandle(sequenceElement());

    public static float offset(MemorySegment struct, long index0) {
        return (float)offset$ELEM_HANDLE.get(struct, offset$OFFSET, index0);
    }

    public static void offset(MemorySegment struct, long index0, float fieldValue) {
        offset$ELEM_HANDLE.set(struct, offset$OFFSET, index0, fieldValue);
    }

    private static final OfFloat rotation$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("rotation"));

    public static final OfFloat rotation$layout() {
        return rotation$LAYOUT;
    }

    private static final long rotation$OFFSET = $LAYOUT.byteOffset(groupElement("rotation"));

    public static final long rotation$offset() {
        return rotation$OFFSET;
    }

    public static float rotation(MemorySegment struct) {
        return struct.get(rotation$LAYOUT, rotation$OFFSET);
    }

    public static void rotation(MemorySegment struct, float fieldValue) {
        struct.set(rotation$LAYOUT, rotation$OFFSET, fieldValue);
    }

    private static final SequenceLayout scale$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("scale"));

    public static final SequenceLayout scale$layout() {
        return scale$LAYOUT;
    }

    private static final long scale$OFFSET = $LAYOUT.byteOffset(groupElement("scale"));

    public static final long scale$offset() {
        return scale$OFFSET;
    }

    public static MemorySegment scale(MemorySegment struct) {
        return struct.asSlice(scale$OFFSET, scale$LAYOUT.byteSize());
    }

    public static void scale(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, scale$OFFSET, scale$LAYOUT.byteSize());
    }

    private static long[] scale$DIMS = { 2 };

    public static long[] scale$dimensions() {
        return scale$DIMS;
    }
    private static final VarHandle scale$ELEM_HANDLE = scale$LAYOUT.varHandle(sequenceElement());

    public static float scale(MemorySegment struct, long index0) {
        return (float)scale$ELEM_HANDLE.get(struct, scale$OFFSET, index0);
    }

    public static void scale(MemorySegment struct, long index0, float fieldValue) {
        scale$ELEM_HANDLE.set(struct, scale$OFFSET, index0, fieldValue);
    }

    private static final OfInt has_texcoord$LAYOUT = (OfInt)$LAYOUT.select(groupElement("has_texcoord"));

    public static final OfInt has_texcoord$layout() {
        return has_texcoord$LAYOUT;
    }

    private static final long has_texcoord$OFFSET = $LAYOUT.byteOffset(groupElement("has_texcoord"));

    public static final long has_texcoord$offset() {
        return has_texcoord$OFFSET;
    }

    public static int has_texcoord(MemorySegment struct) {
        return struct.get(has_texcoord$LAYOUT, has_texcoord$OFFSET);
    }

    public static void has_texcoord(MemorySegment struct, int fieldValue) {
        struct.set(has_texcoord$LAYOUT, has_texcoord$OFFSET, fieldValue);
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

