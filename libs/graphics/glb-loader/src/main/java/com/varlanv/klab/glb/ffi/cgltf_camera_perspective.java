package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_camera_perspective {

    cgltf_camera_perspective() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_INT.withName("has_aspect_ratio"),
        Cgltf.C_FLOAT.withName("aspect_ratio"),
        Cgltf.C_FLOAT.withName("yfov"),
        Cgltf.C_INT.withName("has_zfar"),
        Cgltf.C_FLOAT.withName("zfar"),
        Cgltf.C_FLOAT.withName("znear"),
        cgltf_extras.layout().withName("extras")
    ).withName("cgltf_camera_perspective");

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt has_aspect_ratio$LAYOUT = (OfInt)$LAYOUT.select(groupElement("has_aspect_ratio"));

    public static final OfInt has_aspect_ratio$layout() {
        return has_aspect_ratio$LAYOUT;
    }

    private static final long has_aspect_ratio$OFFSET = $LAYOUT.byteOffset(groupElement("has_aspect_ratio"));

    public static final long has_aspect_ratio$offset() {
        return has_aspect_ratio$OFFSET;
    }

    public static int has_aspect_ratio(MemorySegment struct) {
        return struct.get(has_aspect_ratio$LAYOUT, has_aspect_ratio$OFFSET);
    }

    public static void has_aspect_ratio(MemorySegment struct, int fieldValue) {
        struct.set(has_aspect_ratio$LAYOUT, has_aspect_ratio$OFFSET, fieldValue);
    }

    private static final OfFloat aspect_ratio$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("aspect_ratio"));

    public static final OfFloat aspect_ratio$layout() {
        return aspect_ratio$LAYOUT;
    }

    private static final long aspect_ratio$OFFSET = $LAYOUT.byteOffset(groupElement("aspect_ratio"));

    public static final long aspect_ratio$offset() {
        return aspect_ratio$OFFSET;
    }

    public static float aspect_ratio(MemorySegment struct) {
        return struct.get(aspect_ratio$LAYOUT, aspect_ratio$OFFSET);
    }

    public static void aspect_ratio(MemorySegment struct, float fieldValue) {
        struct.set(aspect_ratio$LAYOUT, aspect_ratio$OFFSET, fieldValue);
    }

    private static final OfFloat yfov$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("yfov"));

    public static final OfFloat yfov$layout() {
        return yfov$LAYOUT;
    }

    private static final long yfov$OFFSET = $LAYOUT.byteOffset(groupElement("yfov"));

    public static final long yfov$offset() {
        return yfov$OFFSET;
    }

    public static float yfov(MemorySegment struct) {
        return struct.get(yfov$LAYOUT, yfov$OFFSET);
    }

    public static void yfov(MemorySegment struct, float fieldValue) {
        struct.set(yfov$LAYOUT, yfov$OFFSET, fieldValue);
    }

    private static final OfInt has_zfar$LAYOUT = (OfInt)$LAYOUT.select(groupElement("has_zfar"));

    public static final OfInt has_zfar$layout() {
        return has_zfar$LAYOUT;
    }

    private static final long has_zfar$OFFSET = $LAYOUT.byteOffset(groupElement("has_zfar"));

    public static final long has_zfar$offset() {
        return has_zfar$OFFSET;
    }

    public static int has_zfar(MemorySegment struct) {
        return struct.get(has_zfar$LAYOUT, has_zfar$OFFSET);
    }

    public static void has_zfar(MemorySegment struct, int fieldValue) {
        struct.set(has_zfar$LAYOUT, has_zfar$OFFSET, fieldValue);
    }

    private static final OfFloat zfar$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("zfar"));

    public static final OfFloat zfar$layout() {
        return zfar$LAYOUT;
    }

    private static final long zfar$OFFSET = $LAYOUT.byteOffset(groupElement("zfar"));

    public static final long zfar$offset() {
        return zfar$OFFSET;
    }

    public static float zfar(MemorySegment struct) {
        return struct.get(zfar$LAYOUT, zfar$OFFSET);
    }

    public static void zfar(MemorySegment struct, float fieldValue) {
        struct.set(zfar$LAYOUT, zfar$OFFSET, fieldValue);
    }

    private static final OfFloat znear$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("znear"));

    public static final OfFloat znear$layout() {
        return znear$LAYOUT;
    }

    private static final long znear$OFFSET = $LAYOUT.byteOffset(groupElement("znear"));

    public static final long znear$offset() {
        return znear$OFFSET;
    }

    public static float znear(MemorySegment struct) {
        return struct.get(znear$LAYOUT, znear$OFFSET);
    }

    public static void znear(MemorySegment struct, float fieldValue) {
        struct.set(znear$LAYOUT, znear$OFFSET, fieldValue);
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

