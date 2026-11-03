package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_diffuse_transmission {

    cgltf_diffuse_transmission() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        cgltf_texture_view.layout().withName("diffuse_transmission_texture"),
        Cgltf.C_FLOAT.withName("diffuse_transmission_factor"),
        MemoryLayout.sequenceLayout(3, Cgltf.C_FLOAT).withName("diffuse_transmission_color_factor"),
        cgltf_texture_view.layout().withName("diffuse_transmission_color_texture")
    ).withName("cgltf_diffuse_transmission");

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout diffuse_transmission_texture$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("diffuse_transmission_texture"));

    public static final GroupLayout diffuse_transmission_texture$layout() {
        return diffuse_transmission_texture$LAYOUT;
    }

    private static final long diffuse_transmission_texture$OFFSET = $LAYOUT.byteOffset(groupElement("diffuse_transmission_texture"));

    public static final long diffuse_transmission_texture$offset() {
        return diffuse_transmission_texture$OFFSET;
    }

    public static MemorySegment diffuse_transmission_texture(MemorySegment struct) {
        return struct.asSlice(diffuse_transmission_texture$OFFSET, diffuse_transmission_texture$LAYOUT.byteSize());
    }

    public static void diffuse_transmission_texture(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, diffuse_transmission_texture$OFFSET, diffuse_transmission_texture$LAYOUT.byteSize());
    }

    private static final OfFloat diffuse_transmission_factor$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("diffuse_transmission_factor"));

    public static final OfFloat diffuse_transmission_factor$layout() {
        return diffuse_transmission_factor$LAYOUT;
    }

    private static final long diffuse_transmission_factor$OFFSET = $LAYOUT.byteOffset(groupElement("diffuse_transmission_factor"));

    public static final long diffuse_transmission_factor$offset() {
        return diffuse_transmission_factor$OFFSET;
    }

    public static float diffuse_transmission_factor(MemorySegment struct) {
        return struct.get(diffuse_transmission_factor$LAYOUT, diffuse_transmission_factor$OFFSET);
    }

    public static void diffuse_transmission_factor(MemorySegment struct, float fieldValue) {
        struct.set(diffuse_transmission_factor$LAYOUT, diffuse_transmission_factor$OFFSET, fieldValue);
    }

    private static final SequenceLayout diffuse_transmission_color_factor$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("diffuse_transmission_color_factor"));

    public static final SequenceLayout diffuse_transmission_color_factor$layout() {
        return diffuse_transmission_color_factor$LAYOUT;
    }

    private static final long diffuse_transmission_color_factor$OFFSET = $LAYOUT.byteOffset(groupElement("diffuse_transmission_color_factor"));

    public static final long diffuse_transmission_color_factor$offset() {
        return diffuse_transmission_color_factor$OFFSET;
    }

    public static MemorySegment diffuse_transmission_color_factor(MemorySegment struct) {
        return struct.asSlice(diffuse_transmission_color_factor$OFFSET, diffuse_transmission_color_factor$LAYOUT.byteSize());
    }

    public static void diffuse_transmission_color_factor(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, diffuse_transmission_color_factor$OFFSET, diffuse_transmission_color_factor$LAYOUT.byteSize());
    }

    private static long[] diffuse_transmission_color_factor$DIMS = { 3 };

    public static long[] diffuse_transmission_color_factor$dimensions() {
        return diffuse_transmission_color_factor$DIMS;
    }
    private static final VarHandle diffuse_transmission_color_factor$ELEM_HANDLE = diffuse_transmission_color_factor$LAYOUT.varHandle(sequenceElement());

    public static float diffuse_transmission_color_factor(MemorySegment struct, long index0) {
        return (float)diffuse_transmission_color_factor$ELEM_HANDLE.get(struct, diffuse_transmission_color_factor$OFFSET, index0);
    }

    public static void diffuse_transmission_color_factor(MemorySegment struct, long index0, float fieldValue) {
        diffuse_transmission_color_factor$ELEM_HANDLE.set(struct, diffuse_transmission_color_factor$OFFSET, index0, fieldValue);
    }

    private static final GroupLayout diffuse_transmission_color_texture$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("diffuse_transmission_color_texture"));

    public static final GroupLayout diffuse_transmission_color_texture$layout() {
        return diffuse_transmission_color_texture$LAYOUT;
    }

    private static final long diffuse_transmission_color_texture$OFFSET = $LAYOUT.byteOffset(groupElement("diffuse_transmission_color_texture"));

    public static final long diffuse_transmission_color_texture$offset() {
        return diffuse_transmission_color_texture$OFFSET;
    }

    public static MemorySegment diffuse_transmission_color_texture(MemorySegment struct) {
        return struct.asSlice(diffuse_transmission_color_texture$OFFSET, diffuse_transmission_color_texture$LAYOUT.byteSize());
    }

    public static void diffuse_transmission_color_texture(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, diffuse_transmission_color_texture$OFFSET, diffuse_transmission_color_texture$LAYOUT.byteSize());
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

