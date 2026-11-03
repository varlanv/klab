package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_volume {

    cgltf_volume() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        cgltf_texture_view.layout().withName("thickness_texture"),
        Cgltf.C_FLOAT.withName("thickness_factor"),
        MemoryLayout.sequenceLayout(3, Cgltf.C_FLOAT).withName("attenuation_color"),
        Cgltf.C_FLOAT.withName("attenuation_distance"),
        MemoryLayout.paddingLayout(4)
    ).withName("cgltf_volume");

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout thickness_texture$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("thickness_texture"));

    public static final GroupLayout thickness_texture$layout() {
        return thickness_texture$LAYOUT;
    }

    private static final long thickness_texture$OFFSET = $LAYOUT.byteOffset(groupElement("thickness_texture"));

    public static final long thickness_texture$offset() {
        return thickness_texture$OFFSET;
    }

    public static MemorySegment thickness_texture(MemorySegment struct) {
        return struct.asSlice(thickness_texture$OFFSET, thickness_texture$LAYOUT.byteSize());
    }

    public static void thickness_texture(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, thickness_texture$OFFSET, thickness_texture$LAYOUT.byteSize());
    }

    private static final OfFloat thickness_factor$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("thickness_factor"));

    public static final OfFloat thickness_factor$layout() {
        return thickness_factor$LAYOUT;
    }

    private static final long thickness_factor$OFFSET = $LAYOUT.byteOffset(groupElement("thickness_factor"));

    public static final long thickness_factor$offset() {
        return thickness_factor$OFFSET;
    }

    public static float thickness_factor(MemorySegment struct) {
        return struct.get(thickness_factor$LAYOUT, thickness_factor$OFFSET);
    }

    public static void thickness_factor(MemorySegment struct, float fieldValue) {
        struct.set(thickness_factor$LAYOUT, thickness_factor$OFFSET, fieldValue);
    }

    private static final SequenceLayout attenuation_color$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("attenuation_color"));

    public static final SequenceLayout attenuation_color$layout() {
        return attenuation_color$LAYOUT;
    }

    private static final long attenuation_color$OFFSET = $LAYOUT.byteOffset(groupElement("attenuation_color"));

    public static final long attenuation_color$offset() {
        return attenuation_color$OFFSET;
    }

    public static MemorySegment attenuation_color(MemorySegment struct) {
        return struct.asSlice(attenuation_color$OFFSET, attenuation_color$LAYOUT.byteSize());
    }

    public static void attenuation_color(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, attenuation_color$OFFSET, attenuation_color$LAYOUT.byteSize());
    }

    private static long[] attenuation_color$DIMS = { 3 };

    public static long[] attenuation_color$dimensions() {
        return attenuation_color$DIMS;
    }
    private static final VarHandle attenuation_color$ELEM_HANDLE = attenuation_color$LAYOUT.varHandle(sequenceElement());

    public static float attenuation_color(MemorySegment struct, long index0) {
        return (float)attenuation_color$ELEM_HANDLE.get(struct, attenuation_color$OFFSET, index0);
    }

    public static void attenuation_color(MemorySegment struct, long index0, float fieldValue) {
        attenuation_color$ELEM_HANDLE.set(struct, attenuation_color$OFFSET, index0, fieldValue);
    }

    private static final OfFloat attenuation_distance$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("attenuation_distance"));

    public static final OfFloat attenuation_distance$layout() {
        return attenuation_distance$LAYOUT;
    }

    private static final long attenuation_distance$OFFSET = $LAYOUT.byteOffset(groupElement("attenuation_distance"));

    public static final long attenuation_distance$offset() {
        return attenuation_distance$OFFSET;
    }

    public static float attenuation_distance(MemorySegment struct) {
        return struct.get(attenuation_distance$LAYOUT, attenuation_distance$OFFSET);
    }

    public static void attenuation_distance(MemorySegment struct, float fieldValue) {
        struct.set(attenuation_distance$LAYOUT, attenuation_distance$OFFSET, fieldValue);
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

