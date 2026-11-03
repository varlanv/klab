package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_pbr_specular_glossiness {

    cgltf_pbr_specular_glossiness() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        cgltf_texture_view.layout().withName("diffuse_texture"),
        cgltf_texture_view.layout().withName("specular_glossiness_texture"),
        MemoryLayout.sequenceLayout(4, Cgltf.C_FLOAT).withName("diffuse_factor"),
        MemoryLayout.sequenceLayout(3, Cgltf.C_FLOAT).withName("specular_factor"),
        Cgltf.C_FLOAT.withName("glossiness_factor")
    ).withName("cgltf_pbr_specular_glossiness");

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout diffuse_texture$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("diffuse_texture"));

    public static final GroupLayout diffuse_texture$layout() {
        return diffuse_texture$LAYOUT;
    }

    private static final long diffuse_texture$OFFSET = $LAYOUT.byteOffset(groupElement("diffuse_texture"));

    public static final long diffuse_texture$offset() {
        return diffuse_texture$OFFSET;
    }

    public static MemorySegment diffuse_texture(MemorySegment struct) {
        return struct.asSlice(diffuse_texture$OFFSET, diffuse_texture$LAYOUT.byteSize());
    }

    public static void diffuse_texture(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, diffuse_texture$OFFSET, diffuse_texture$LAYOUT.byteSize());
    }

    private static final GroupLayout specular_glossiness_texture$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("specular_glossiness_texture"));

    public static final GroupLayout specular_glossiness_texture$layout() {
        return specular_glossiness_texture$LAYOUT;
    }

    private static final long specular_glossiness_texture$OFFSET = $LAYOUT.byteOffset(groupElement("specular_glossiness_texture"));

    public static final long specular_glossiness_texture$offset() {
        return specular_glossiness_texture$OFFSET;
    }

    public static MemorySegment specular_glossiness_texture(MemorySegment struct) {
        return struct.asSlice(specular_glossiness_texture$OFFSET, specular_glossiness_texture$LAYOUT.byteSize());
    }

    public static void specular_glossiness_texture(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, specular_glossiness_texture$OFFSET, specular_glossiness_texture$LAYOUT.byteSize());
    }

    private static final SequenceLayout diffuse_factor$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("diffuse_factor"));

    public static final SequenceLayout diffuse_factor$layout() {
        return diffuse_factor$LAYOUT;
    }

    private static final long diffuse_factor$OFFSET = $LAYOUT.byteOffset(groupElement("diffuse_factor"));

    public static final long diffuse_factor$offset() {
        return diffuse_factor$OFFSET;
    }

    public static MemorySegment diffuse_factor(MemorySegment struct) {
        return struct.asSlice(diffuse_factor$OFFSET, diffuse_factor$LAYOUT.byteSize());
    }

    public static void diffuse_factor(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, diffuse_factor$OFFSET, diffuse_factor$LAYOUT.byteSize());
    }

    private static long[] diffuse_factor$DIMS = { 4 };

    public static long[] diffuse_factor$dimensions() {
        return diffuse_factor$DIMS;
    }
    private static final VarHandle diffuse_factor$ELEM_HANDLE = diffuse_factor$LAYOUT.varHandle(sequenceElement());

    public static float diffuse_factor(MemorySegment struct, long index0) {
        return (float)diffuse_factor$ELEM_HANDLE.get(struct, diffuse_factor$OFFSET, index0);
    }

    public static void diffuse_factor(MemorySegment struct, long index0, float fieldValue) {
        diffuse_factor$ELEM_HANDLE.set(struct, diffuse_factor$OFFSET, index0, fieldValue);
    }

    private static final SequenceLayout specular_factor$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("specular_factor"));

    public static final SequenceLayout specular_factor$layout() {
        return specular_factor$LAYOUT;
    }

    private static final long specular_factor$OFFSET = $LAYOUT.byteOffset(groupElement("specular_factor"));

    public static final long specular_factor$offset() {
        return specular_factor$OFFSET;
    }

    public static MemorySegment specular_factor(MemorySegment struct) {
        return struct.asSlice(specular_factor$OFFSET, specular_factor$LAYOUT.byteSize());
    }

    public static void specular_factor(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, specular_factor$OFFSET, specular_factor$LAYOUT.byteSize());
    }

    private static long[] specular_factor$DIMS = { 3 };

    public static long[] specular_factor$dimensions() {
        return specular_factor$DIMS;
    }
    private static final VarHandle specular_factor$ELEM_HANDLE = specular_factor$LAYOUT.varHandle(sequenceElement());

    public static float specular_factor(MemorySegment struct, long index0) {
        return (float)specular_factor$ELEM_HANDLE.get(struct, specular_factor$OFFSET, index0);
    }

    public static void specular_factor(MemorySegment struct, long index0, float fieldValue) {
        specular_factor$ELEM_HANDLE.set(struct, specular_factor$OFFSET, index0, fieldValue);
    }

    private static final OfFloat glossiness_factor$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("glossiness_factor"));

    public static final OfFloat glossiness_factor$layout() {
        return glossiness_factor$LAYOUT;
    }

    private static final long glossiness_factor$OFFSET = $LAYOUT.byteOffset(groupElement("glossiness_factor"));

    public static final long glossiness_factor$offset() {
        return glossiness_factor$OFFSET;
    }

    public static float glossiness_factor(MemorySegment struct) {
        return struct.get(glossiness_factor$LAYOUT, glossiness_factor$OFFSET);
    }

    public static void glossiness_factor(MemorySegment struct, float fieldValue) {
        struct.set(glossiness_factor$LAYOUT, glossiness_factor$OFFSET, fieldValue);
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

