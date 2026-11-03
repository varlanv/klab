package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_iridescence {

    cgltf_iridescence() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_FLOAT.withName("iridescence_factor"),
        MemoryLayout.paddingLayout(4),
        cgltf_texture_view.layout().withName("iridescence_texture"),
        Cgltf.C_FLOAT.withName("iridescence_ior"),
        Cgltf.C_FLOAT.withName("iridescence_thickness_min"),
        Cgltf.C_FLOAT.withName("iridescence_thickness_max"),
        MemoryLayout.paddingLayout(4),
        cgltf_texture_view.layout().withName("iridescence_thickness_texture")
    ).withName("cgltf_iridescence");

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfFloat iridescence_factor$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("iridescence_factor"));

    public static final OfFloat iridescence_factor$layout() {
        return iridescence_factor$LAYOUT;
    }

    private static final long iridescence_factor$OFFSET = $LAYOUT.byteOffset(groupElement("iridescence_factor"));

    public static final long iridescence_factor$offset() {
        return iridescence_factor$OFFSET;
    }

    public static float iridescence_factor(MemorySegment struct) {
        return struct.get(iridescence_factor$LAYOUT, iridescence_factor$OFFSET);
    }

    public static void iridescence_factor(MemorySegment struct, float fieldValue) {
        struct.set(iridescence_factor$LAYOUT, iridescence_factor$OFFSET, fieldValue);
    }

    private static final GroupLayout iridescence_texture$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("iridescence_texture"));

    public static final GroupLayout iridescence_texture$layout() {
        return iridescence_texture$LAYOUT;
    }

    private static final long iridescence_texture$OFFSET = $LAYOUT.byteOffset(groupElement("iridescence_texture"));

    public static final long iridescence_texture$offset() {
        return iridescence_texture$OFFSET;
    }

    public static MemorySegment iridescence_texture(MemorySegment struct) {
        return struct.asSlice(iridescence_texture$OFFSET, iridescence_texture$LAYOUT.byteSize());
    }

    public static void iridescence_texture(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, iridescence_texture$OFFSET, iridescence_texture$LAYOUT.byteSize());
    }

    private static final OfFloat iridescence_ior$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("iridescence_ior"));

    public static final OfFloat iridescence_ior$layout() {
        return iridescence_ior$LAYOUT;
    }

    private static final long iridescence_ior$OFFSET = $LAYOUT.byteOffset(groupElement("iridescence_ior"));

    public static final long iridescence_ior$offset() {
        return iridescence_ior$OFFSET;
    }

    public static float iridescence_ior(MemorySegment struct) {
        return struct.get(iridescence_ior$LAYOUT, iridescence_ior$OFFSET);
    }

    public static void iridescence_ior(MemorySegment struct, float fieldValue) {
        struct.set(iridescence_ior$LAYOUT, iridescence_ior$OFFSET, fieldValue);
    }

    private static final OfFloat iridescence_thickness_min$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("iridescence_thickness_min"));

    public static final OfFloat iridescence_thickness_min$layout() {
        return iridescence_thickness_min$LAYOUT;
    }

    private static final long iridescence_thickness_min$OFFSET = $LAYOUT.byteOffset(groupElement("iridescence_thickness_min"));

    public static final long iridescence_thickness_min$offset() {
        return iridescence_thickness_min$OFFSET;
    }

    public static float iridescence_thickness_min(MemorySegment struct) {
        return struct.get(iridescence_thickness_min$LAYOUT, iridescence_thickness_min$OFFSET);
    }

    public static void iridescence_thickness_min(MemorySegment struct, float fieldValue) {
        struct.set(iridescence_thickness_min$LAYOUT, iridescence_thickness_min$OFFSET, fieldValue);
    }

    private static final OfFloat iridescence_thickness_max$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("iridescence_thickness_max"));

    public static final OfFloat iridescence_thickness_max$layout() {
        return iridescence_thickness_max$LAYOUT;
    }

    private static final long iridescence_thickness_max$OFFSET = $LAYOUT.byteOffset(groupElement("iridescence_thickness_max"));

    public static final long iridescence_thickness_max$offset() {
        return iridescence_thickness_max$OFFSET;
    }

    public static float iridescence_thickness_max(MemorySegment struct) {
        return struct.get(iridescence_thickness_max$LAYOUT, iridescence_thickness_max$OFFSET);
    }

    public static void iridescence_thickness_max(MemorySegment struct, float fieldValue) {
        struct.set(iridescence_thickness_max$LAYOUT, iridescence_thickness_max$OFFSET, fieldValue);
    }

    private static final GroupLayout iridescence_thickness_texture$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("iridescence_thickness_texture"));

    public static final GroupLayout iridescence_thickness_texture$layout() {
        return iridescence_thickness_texture$LAYOUT;
    }

    private static final long iridescence_thickness_texture$OFFSET = $LAYOUT.byteOffset(groupElement("iridescence_thickness_texture"));

    public static final long iridescence_thickness_texture$offset() {
        return iridescence_thickness_texture$OFFSET;
    }

    public static MemorySegment iridescence_thickness_texture(MemorySegment struct) {
        return struct.asSlice(iridescence_thickness_texture$OFFSET, iridescence_thickness_texture$LAYOUT.byteSize());
    }

    public static void iridescence_thickness_texture(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, iridescence_thickness_texture$OFFSET, iridescence_thickness_texture$LAYOUT.byteSize());
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

