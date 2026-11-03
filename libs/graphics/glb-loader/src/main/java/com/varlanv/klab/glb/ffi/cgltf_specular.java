package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_specular {

    cgltf_specular() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        cgltf_texture_view.layout().withName("specular_texture"),
        cgltf_texture_view.layout().withName("specular_color_texture"),
        MemoryLayout.sequenceLayout(3, Cgltf.C_FLOAT).withName("specular_color_factor"),
        Cgltf.C_FLOAT.withName("specular_factor")
    ).withName("cgltf_specular");

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout specular_texture$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("specular_texture"));

    public static final GroupLayout specular_texture$layout() {
        return specular_texture$LAYOUT;
    }

    private static final long specular_texture$OFFSET = $LAYOUT.byteOffset(groupElement("specular_texture"));

    public static final long specular_texture$offset() {
        return specular_texture$OFFSET;
    }

    public static MemorySegment specular_texture(MemorySegment struct) {
        return struct.asSlice(specular_texture$OFFSET, specular_texture$LAYOUT.byteSize());
    }

    public static void specular_texture(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, specular_texture$OFFSET, specular_texture$LAYOUT.byteSize());
    }

    private static final GroupLayout specular_color_texture$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("specular_color_texture"));

    public static final GroupLayout specular_color_texture$layout() {
        return specular_color_texture$LAYOUT;
    }

    private static final long specular_color_texture$OFFSET = $LAYOUT.byteOffset(groupElement("specular_color_texture"));

    public static final long specular_color_texture$offset() {
        return specular_color_texture$OFFSET;
    }

    public static MemorySegment specular_color_texture(MemorySegment struct) {
        return struct.asSlice(specular_color_texture$OFFSET, specular_color_texture$LAYOUT.byteSize());
    }

    public static void specular_color_texture(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, specular_color_texture$OFFSET, specular_color_texture$LAYOUT.byteSize());
    }

    private static final SequenceLayout specular_color_factor$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("specular_color_factor"));

    public static final SequenceLayout specular_color_factor$layout() {
        return specular_color_factor$LAYOUT;
    }

    private static final long specular_color_factor$OFFSET = $LAYOUT.byteOffset(groupElement("specular_color_factor"));

    public static final long specular_color_factor$offset() {
        return specular_color_factor$OFFSET;
    }

    public static MemorySegment specular_color_factor(MemorySegment struct) {
        return struct.asSlice(specular_color_factor$OFFSET, specular_color_factor$LAYOUT.byteSize());
    }

    public static void specular_color_factor(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, specular_color_factor$OFFSET, specular_color_factor$LAYOUT.byteSize());
    }

    private static long[] specular_color_factor$DIMS = { 3 };

    public static long[] specular_color_factor$dimensions() {
        return specular_color_factor$DIMS;
    }
    private static final VarHandle specular_color_factor$ELEM_HANDLE = specular_color_factor$LAYOUT.varHandle(sequenceElement());

    public static float specular_color_factor(MemorySegment struct, long index0) {
        return (float)specular_color_factor$ELEM_HANDLE.get(struct, specular_color_factor$OFFSET, index0);
    }

    public static void specular_color_factor(MemorySegment struct, long index0, float fieldValue) {
        specular_color_factor$ELEM_HANDLE.set(struct, specular_color_factor$OFFSET, index0, fieldValue);
    }

    private static final OfFloat specular_factor$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("specular_factor"));

    public static final OfFloat specular_factor$layout() {
        return specular_factor$LAYOUT;
    }

    private static final long specular_factor$OFFSET = $LAYOUT.byteOffset(groupElement("specular_factor"));

    public static final long specular_factor$offset() {
        return specular_factor$OFFSET;
    }

    public static float specular_factor(MemorySegment struct) {
        return struct.get(specular_factor$LAYOUT, specular_factor$OFFSET);
    }

    public static void specular_factor(MemorySegment struct, float fieldValue) {
        struct.set(specular_factor$LAYOUT, specular_factor$OFFSET, fieldValue);
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

