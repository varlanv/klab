package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_dispersion {

    cgltf_dispersion() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_FLOAT.withName("dispersion")
    ).withName("cgltf_dispersion");

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfFloat dispersion$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("dispersion"));

    public static final OfFloat dispersion$layout() {
        return dispersion$LAYOUT;
    }

    private static final long dispersion$OFFSET = $LAYOUT.byteOffset(groupElement("dispersion"));

    public static final long dispersion$offset() {
        return dispersion$OFFSET;
    }

    public static float dispersion(MemorySegment struct) {
        return struct.get(dispersion$LAYOUT, dispersion$OFFSET);
    }

    public static void dispersion(MemorySegment struct, float fieldValue) {
        struct.set(dispersion$LAYOUT, dispersion$OFFSET, fieldValue);
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

