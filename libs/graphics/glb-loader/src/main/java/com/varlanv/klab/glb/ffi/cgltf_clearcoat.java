package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_clearcoat {

    cgltf_clearcoat() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        cgltf_texture_view.layout().withName("clearcoat_texture"),
        cgltf_texture_view.layout().withName("clearcoat_roughness_texture"),
        cgltf_texture_view.layout().withName("clearcoat_normal_texture"),
        Cgltf.C_FLOAT.withName("clearcoat_factor"),
        Cgltf.C_FLOAT.withName("clearcoat_roughness_factor")
    ).withName("cgltf_clearcoat");

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout clearcoat_texture$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("clearcoat_texture"));

    public static final GroupLayout clearcoat_texture$layout() {
        return clearcoat_texture$LAYOUT;
    }

    private static final long clearcoat_texture$OFFSET = $LAYOUT.byteOffset(groupElement("clearcoat_texture"));

    public static final long clearcoat_texture$offset() {
        return clearcoat_texture$OFFSET;
    }

    public static MemorySegment clearcoat_texture(MemorySegment struct) {
        return struct.asSlice(clearcoat_texture$OFFSET, clearcoat_texture$LAYOUT.byteSize());
    }

    public static void clearcoat_texture(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, clearcoat_texture$OFFSET, clearcoat_texture$LAYOUT.byteSize());
    }

    private static final GroupLayout clearcoat_roughness_texture$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("clearcoat_roughness_texture"));

    public static final GroupLayout clearcoat_roughness_texture$layout() {
        return clearcoat_roughness_texture$LAYOUT;
    }

    private static final long clearcoat_roughness_texture$OFFSET = $LAYOUT.byteOffset(groupElement("clearcoat_roughness_texture"));

    public static final long clearcoat_roughness_texture$offset() {
        return clearcoat_roughness_texture$OFFSET;
    }

    public static MemorySegment clearcoat_roughness_texture(MemorySegment struct) {
        return struct.asSlice(clearcoat_roughness_texture$OFFSET, clearcoat_roughness_texture$LAYOUT.byteSize());
    }

    public static void clearcoat_roughness_texture(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, clearcoat_roughness_texture$OFFSET, clearcoat_roughness_texture$LAYOUT.byteSize());
    }

    private static final GroupLayout clearcoat_normal_texture$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("clearcoat_normal_texture"));

    public static final GroupLayout clearcoat_normal_texture$layout() {
        return clearcoat_normal_texture$LAYOUT;
    }

    private static final long clearcoat_normal_texture$OFFSET = $LAYOUT.byteOffset(groupElement("clearcoat_normal_texture"));

    public static final long clearcoat_normal_texture$offset() {
        return clearcoat_normal_texture$OFFSET;
    }

    public static MemorySegment clearcoat_normal_texture(MemorySegment struct) {
        return struct.asSlice(clearcoat_normal_texture$OFFSET, clearcoat_normal_texture$LAYOUT.byteSize());
    }

    public static void clearcoat_normal_texture(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, clearcoat_normal_texture$OFFSET, clearcoat_normal_texture$LAYOUT.byteSize());
    }

    private static final OfFloat clearcoat_factor$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("clearcoat_factor"));

    public static final OfFloat clearcoat_factor$layout() {
        return clearcoat_factor$LAYOUT;
    }

    private static final long clearcoat_factor$OFFSET = $LAYOUT.byteOffset(groupElement("clearcoat_factor"));

    public static final long clearcoat_factor$offset() {
        return clearcoat_factor$OFFSET;
    }

    public static float clearcoat_factor(MemorySegment struct) {
        return struct.get(clearcoat_factor$LAYOUT, clearcoat_factor$OFFSET);
    }

    public static void clearcoat_factor(MemorySegment struct, float fieldValue) {
        struct.set(clearcoat_factor$LAYOUT, clearcoat_factor$OFFSET, fieldValue);
    }

    private static final OfFloat clearcoat_roughness_factor$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("clearcoat_roughness_factor"));

    public static final OfFloat clearcoat_roughness_factor$layout() {
        return clearcoat_roughness_factor$LAYOUT;
    }

    private static final long clearcoat_roughness_factor$OFFSET = $LAYOUT.byteOffset(groupElement("clearcoat_roughness_factor"));

    public static final long clearcoat_roughness_factor$offset() {
        return clearcoat_roughness_factor$OFFSET;
    }

    public static float clearcoat_roughness_factor(MemorySegment struct) {
        return struct.get(clearcoat_roughness_factor$LAYOUT, clearcoat_roughness_factor$OFFSET);
    }

    public static void clearcoat_roughness_factor(MemorySegment struct, float fieldValue) {
        struct.set(clearcoat_roughness_factor$LAYOUT, clearcoat_roughness_factor$OFFSET, fieldValue);
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

