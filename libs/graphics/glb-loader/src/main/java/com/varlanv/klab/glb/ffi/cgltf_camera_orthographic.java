package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_camera_orthographic {

    cgltf_camera_orthographic() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_FLOAT.withName("xmag"),
        Cgltf.C_FLOAT.withName("ymag"),
        Cgltf.C_FLOAT.withName("zfar"),
        Cgltf.C_FLOAT.withName("znear"),
        cgltf_extras.layout().withName("extras")
    ).withName("cgltf_camera_orthographic");

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfFloat xmag$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("xmag"));

    public static final OfFloat xmag$layout() {
        return xmag$LAYOUT;
    }

    private static final long xmag$OFFSET = $LAYOUT.byteOffset(groupElement("xmag"));

    public static final long xmag$offset() {
        return xmag$OFFSET;
    }

    public static float xmag(MemorySegment struct) {
        return struct.get(xmag$LAYOUT, xmag$OFFSET);
    }

    public static void xmag(MemorySegment struct, float fieldValue) {
        struct.set(xmag$LAYOUT, xmag$OFFSET, fieldValue);
    }

    private static final OfFloat ymag$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("ymag"));

    public static final OfFloat ymag$layout() {
        return ymag$LAYOUT;
    }

    private static final long ymag$OFFSET = $LAYOUT.byteOffset(groupElement("ymag"));

    public static final long ymag$offset() {
        return ymag$OFFSET;
    }

    public static float ymag(MemorySegment struct) {
        return struct.get(ymag$LAYOUT, ymag$OFFSET);
    }

    public static void ymag(MemorySegment struct, float fieldValue) {
        struct.set(ymag$LAYOUT, ymag$OFFSET, fieldValue);
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

