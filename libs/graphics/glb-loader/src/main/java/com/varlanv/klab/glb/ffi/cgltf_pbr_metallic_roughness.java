package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_pbr_metallic_roughness {

    cgltf_pbr_metallic_roughness() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        cgltf_texture_view.layout().withName("base_color_texture"),
        cgltf_texture_view.layout().withName("metallic_roughness_texture"),
        MemoryLayout.sequenceLayout(4, Cgltf.C_FLOAT).withName("base_color_factor"),
        Cgltf.C_FLOAT.withName("metallic_factor"),
        Cgltf.C_FLOAT.withName("roughness_factor")
    ).withName("cgltf_pbr_metallic_roughness");

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout base_color_texture$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("base_color_texture"));

    public static final GroupLayout base_color_texture$layout() {
        return base_color_texture$LAYOUT;
    }

    private static final long base_color_texture$OFFSET = $LAYOUT.byteOffset(groupElement("base_color_texture"));

    public static final long base_color_texture$offset() {
        return base_color_texture$OFFSET;
    }

    public static MemorySegment base_color_texture(MemorySegment struct) {
        return struct.asSlice(base_color_texture$OFFSET, base_color_texture$LAYOUT.byteSize());
    }

    public static void base_color_texture(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, base_color_texture$OFFSET, base_color_texture$LAYOUT.byteSize());
    }

    private static final GroupLayout metallic_roughness_texture$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("metallic_roughness_texture"));

    public static final GroupLayout metallic_roughness_texture$layout() {
        return metallic_roughness_texture$LAYOUT;
    }

    private static final long metallic_roughness_texture$OFFSET = $LAYOUT.byteOffset(groupElement("metallic_roughness_texture"));

    public static final long metallic_roughness_texture$offset() {
        return metallic_roughness_texture$OFFSET;
    }

    public static MemorySegment metallic_roughness_texture(MemorySegment struct) {
        return struct.asSlice(metallic_roughness_texture$OFFSET, metallic_roughness_texture$LAYOUT.byteSize());
    }

    public static void metallic_roughness_texture(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, metallic_roughness_texture$OFFSET, metallic_roughness_texture$LAYOUT.byteSize());
    }

    private static final SequenceLayout base_color_factor$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("base_color_factor"));

    public static final SequenceLayout base_color_factor$layout() {
        return base_color_factor$LAYOUT;
    }

    private static final long base_color_factor$OFFSET = $LAYOUT.byteOffset(groupElement("base_color_factor"));

    public static final long base_color_factor$offset() {
        return base_color_factor$OFFSET;
    }

    public static MemorySegment base_color_factor(MemorySegment struct) {
        return struct.asSlice(base_color_factor$OFFSET, base_color_factor$LAYOUT.byteSize());
    }

    public static void base_color_factor(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, base_color_factor$OFFSET, base_color_factor$LAYOUT.byteSize());
    }

    private static long[] base_color_factor$DIMS = { 4 };

    public static long[] base_color_factor$dimensions() {
        return base_color_factor$DIMS;
    }
    private static final VarHandle base_color_factor$ELEM_HANDLE = base_color_factor$LAYOUT.varHandle(sequenceElement());

    public static float base_color_factor(MemorySegment struct, long index0) {
        return (float)base_color_factor$ELEM_HANDLE.get(struct, base_color_factor$OFFSET, index0);
    }

    public static void base_color_factor(MemorySegment struct, long index0, float fieldValue) {
        base_color_factor$ELEM_HANDLE.set(struct, base_color_factor$OFFSET, index0, fieldValue);
    }

    private static final OfFloat metallic_factor$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("metallic_factor"));

    public static final OfFloat metallic_factor$layout() {
        return metallic_factor$LAYOUT;
    }

    private static final long metallic_factor$OFFSET = $LAYOUT.byteOffset(groupElement("metallic_factor"));

    public static final long metallic_factor$offset() {
        return metallic_factor$OFFSET;
    }

    public static float metallic_factor(MemorySegment struct) {
        return struct.get(metallic_factor$LAYOUT, metallic_factor$OFFSET);
    }

    public static void metallic_factor(MemorySegment struct, float fieldValue) {
        struct.set(metallic_factor$LAYOUT, metallic_factor$OFFSET, fieldValue);
    }

    private static final OfFloat roughness_factor$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("roughness_factor"));

    public static final OfFloat roughness_factor$layout() {
        return roughness_factor$LAYOUT;
    }

    private static final long roughness_factor$OFFSET = $LAYOUT.byteOffset(groupElement("roughness_factor"));

    public static final long roughness_factor$offset() {
        return roughness_factor$OFFSET;
    }

    public static float roughness_factor(MemorySegment struct) {
        return struct.get(roughness_factor$LAYOUT, roughness_factor$OFFSET);
    }

    public static void roughness_factor(MemorySegment struct, float fieldValue) {
        struct.set(roughness_factor$LAYOUT, roughness_factor$OFFSET, fieldValue);
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

