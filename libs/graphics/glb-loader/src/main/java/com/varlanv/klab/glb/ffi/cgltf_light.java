package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_light {

    cgltf_light() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_POINTER.withName("name"),
        MemoryLayout.sequenceLayout(3, Cgltf.C_FLOAT).withName("color"),
        Cgltf.C_FLOAT.withName("intensity"),
        Cgltf.C_INT.withName("type"),
        Cgltf.C_FLOAT.withName("range"),
        Cgltf.C_FLOAT.withName("spot_inner_cone_angle"),
        Cgltf.C_FLOAT.withName("spot_outer_cone_angle"),
        cgltf_extras.layout().withName("extras")
    ).withName("cgltf_light");

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout name$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("name"));

    public static final AddressLayout name$layout() {
        return name$LAYOUT;
    }

    private static final long name$OFFSET = $LAYOUT.byteOffset(groupElement("name"));

    public static final long name$offset() {
        return name$OFFSET;
    }

    public static MemorySegment name(MemorySegment struct) {
        return struct.get(name$LAYOUT, name$OFFSET);
    }

    public static void name(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(name$LAYOUT, name$OFFSET, fieldValue);
    }

    private static final SequenceLayout color$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("color"));

    public static final SequenceLayout color$layout() {
        return color$LAYOUT;
    }

    private static final long color$OFFSET = $LAYOUT.byteOffset(groupElement("color"));

    public static final long color$offset() {
        return color$OFFSET;
    }

    public static MemorySegment color(MemorySegment struct) {
        return struct.asSlice(color$OFFSET, color$LAYOUT.byteSize());
    }

    public static void color(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, color$OFFSET, color$LAYOUT.byteSize());
    }

    private static long[] color$DIMS = { 3 };

    public static long[] color$dimensions() {
        return color$DIMS;
    }
    private static final VarHandle color$ELEM_HANDLE = color$LAYOUT.varHandle(sequenceElement());

    public static float color(MemorySegment struct, long index0) {
        return (float)color$ELEM_HANDLE.get(struct, color$OFFSET, index0);
    }

    public static void color(MemorySegment struct, long index0, float fieldValue) {
        color$ELEM_HANDLE.set(struct, color$OFFSET, index0, fieldValue);
    }

    private static final OfFloat intensity$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("intensity"));

    public static final OfFloat intensity$layout() {
        return intensity$LAYOUT;
    }

    private static final long intensity$OFFSET = $LAYOUT.byteOffset(groupElement("intensity"));

    public static final long intensity$offset() {
        return intensity$OFFSET;
    }

    public static float intensity(MemorySegment struct) {
        return struct.get(intensity$LAYOUT, intensity$OFFSET);
    }

    public static void intensity(MemorySegment struct, float fieldValue) {
        struct.set(intensity$LAYOUT, intensity$OFFSET, fieldValue);
    }

    private static final OfInt type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("type"));

    public static final OfInt type$layout() {
        return type$LAYOUT;
    }

    private static final long type$OFFSET = $LAYOUT.byteOffset(groupElement("type"));

    public static final long type$offset() {
        return type$OFFSET;
    }

    public static int type(MemorySegment struct) {
        return struct.get(type$LAYOUT, type$OFFSET);
    }

    public static void type(MemorySegment struct, int fieldValue) {
        struct.set(type$LAYOUT, type$OFFSET, fieldValue);
    }

    private static final OfFloat range$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("range"));

    public static final OfFloat range$layout() {
        return range$LAYOUT;
    }

    private static final long range$OFFSET = $LAYOUT.byteOffset(groupElement("range"));

    public static final long range$offset() {
        return range$OFFSET;
    }

    public static float range(MemorySegment struct) {
        return struct.get(range$LAYOUT, range$OFFSET);
    }

    public static void range(MemorySegment struct, float fieldValue) {
        struct.set(range$LAYOUT, range$OFFSET, fieldValue);
    }

    private static final OfFloat spot_inner_cone_angle$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("spot_inner_cone_angle"));

    public static final OfFloat spot_inner_cone_angle$layout() {
        return spot_inner_cone_angle$LAYOUT;
    }

    private static final long spot_inner_cone_angle$OFFSET = $LAYOUT.byteOffset(groupElement("spot_inner_cone_angle"));

    public static final long spot_inner_cone_angle$offset() {
        return spot_inner_cone_angle$OFFSET;
    }

    public static float spot_inner_cone_angle(MemorySegment struct) {
        return struct.get(spot_inner_cone_angle$LAYOUT, spot_inner_cone_angle$OFFSET);
    }

    public static void spot_inner_cone_angle(MemorySegment struct, float fieldValue) {
        struct.set(spot_inner_cone_angle$LAYOUT, spot_inner_cone_angle$OFFSET, fieldValue);
    }

    private static final OfFloat spot_outer_cone_angle$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("spot_outer_cone_angle"));

    public static final OfFloat spot_outer_cone_angle$layout() {
        return spot_outer_cone_angle$LAYOUT;
    }

    private static final long spot_outer_cone_angle$OFFSET = $LAYOUT.byteOffset(groupElement("spot_outer_cone_angle"));

    public static final long spot_outer_cone_angle$offset() {
        return spot_outer_cone_angle$OFFSET;
    }

    public static float spot_outer_cone_angle(MemorySegment struct) {
        return struct.get(spot_outer_cone_angle$LAYOUT, spot_outer_cone_angle$OFFSET);
    }

    public static void spot_outer_cone_angle(MemorySegment struct, float fieldValue) {
        struct.set(spot_outer_cone_angle$LAYOUT, spot_outer_cone_angle$OFFSET, fieldValue);
    }

    private static final GroupLayout extras$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("extras"));

    public static final GroupLayout extras$layout() {
        return extras$LAYOUT;
    }

    private static final long extras$OFFSET = $LAYOUT.byteOffset(groupElement("extras"));

    public static final long extras$offset() {
        return extras$OFFSET;
    }

    public static MemorySegment extras(MemorySegment struct) {
        return struct.asSlice(extras$OFFSET, extras$LAYOUT.byteSize());
    }

    public static void extras(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, extras$OFFSET, extras$LAYOUT.byteSize());
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

