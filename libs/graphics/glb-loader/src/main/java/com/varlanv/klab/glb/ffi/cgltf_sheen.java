package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_sheen {

    cgltf_sheen() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        cgltf_texture_view.layout().withName("sheen_color_texture"),
        MemoryLayout.sequenceLayout(3, Cgltf.C_FLOAT).withName("sheen_color_factor"),
        MemoryLayout.paddingLayout(4),
        cgltf_texture_view.layout().withName("sheen_roughness_texture"),
        Cgltf.C_FLOAT.withName("sheen_roughness_factor"),
        MemoryLayout.paddingLayout(4)
    ).withName("cgltf_sheen");

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout sheen_color_texture$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("sheen_color_texture"));

    public static final GroupLayout sheen_color_texture$layout() {
        return sheen_color_texture$LAYOUT;
    }

    private static final long sheen_color_texture$OFFSET = $LAYOUT.byteOffset(groupElement("sheen_color_texture"));

    public static final long sheen_color_texture$offset() {
        return sheen_color_texture$OFFSET;
    }

    public static MemorySegment sheen_color_texture(MemorySegment struct) {
        return struct.asSlice(sheen_color_texture$OFFSET, sheen_color_texture$LAYOUT.byteSize());
    }

    public static void sheen_color_texture(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, sheen_color_texture$OFFSET, sheen_color_texture$LAYOUT.byteSize());
    }

    private static final SequenceLayout sheen_color_factor$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("sheen_color_factor"));

    public static final SequenceLayout sheen_color_factor$layout() {
        return sheen_color_factor$LAYOUT;
    }

    private static final long sheen_color_factor$OFFSET = $LAYOUT.byteOffset(groupElement("sheen_color_factor"));

    public static final long sheen_color_factor$offset() {
        return sheen_color_factor$OFFSET;
    }

    public static MemorySegment sheen_color_factor(MemorySegment struct) {
        return struct.asSlice(sheen_color_factor$OFFSET, sheen_color_factor$LAYOUT.byteSize());
    }

    public static void sheen_color_factor(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, sheen_color_factor$OFFSET, sheen_color_factor$LAYOUT.byteSize());
    }

    private static long[] sheen_color_factor$DIMS = { 3 };

    public static long[] sheen_color_factor$dimensions() {
        return sheen_color_factor$DIMS;
    }
    private static final VarHandle sheen_color_factor$ELEM_HANDLE = sheen_color_factor$LAYOUT.varHandle(sequenceElement());

    public static float sheen_color_factor(MemorySegment struct, long index0) {
        return (float)sheen_color_factor$ELEM_HANDLE.get(struct, sheen_color_factor$OFFSET, index0);
    }

    public static void sheen_color_factor(MemorySegment struct, long index0, float fieldValue) {
        sheen_color_factor$ELEM_HANDLE.set(struct, sheen_color_factor$OFFSET, index0, fieldValue);
    }

    private static final GroupLayout sheen_roughness_texture$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("sheen_roughness_texture"));

    public static final GroupLayout sheen_roughness_texture$layout() {
        return sheen_roughness_texture$LAYOUT;
    }

    private static final long sheen_roughness_texture$OFFSET = $LAYOUT.byteOffset(groupElement("sheen_roughness_texture"));

    public static final long sheen_roughness_texture$offset() {
        return sheen_roughness_texture$OFFSET;
    }

    public static MemorySegment sheen_roughness_texture(MemorySegment struct) {
        return struct.asSlice(sheen_roughness_texture$OFFSET, sheen_roughness_texture$LAYOUT.byteSize());
    }

    public static void sheen_roughness_texture(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, sheen_roughness_texture$OFFSET, sheen_roughness_texture$LAYOUT.byteSize());
    }

    private static final OfFloat sheen_roughness_factor$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("sheen_roughness_factor"));

    public static final OfFloat sheen_roughness_factor$layout() {
        return sheen_roughness_factor$LAYOUT;
    }

    private static final long sheen_roughness_factor$OFFSET = $LAYOUT.byteOffset(groupElement("sheen_roughness_factor"));

    public static final long sheen_roughness_factor$offset() {
        return sheen_roughness_factor$OFFSET;
    }

    public static float sheen_roughness_factor(MemorySegment struct) {
        return struct.get(sheen_roughness_factor$LAYOUT, sheen_roughness_factor$OFFSET);
    }

    public static void sheen_roughness_factor(MemorySegment struct, float fieldValue) {
        struct.set(sheen_roughness_factor$LAYOUT, sheen_roughness_factor$OFFSET, fieldValue);
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

