package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_ior {

    cgltf_ior() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_FLOAT.withName("ior")
    ).withName("cgltf_ior");

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfFloat ior$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("ior"));

    public static final OfFloat ior$layout() {
        return ior$LAYOUT;
    }

    private static final long ior$OFFSET = $LAYOUT.byteOffset(groupElement("ior"));

    public static final long ior$offset() {
        return ior$OFFSET;
    }

    public static float ior(MemorySegment struct) {
        return struct.get(ior$LAYOUT, ior$OFFSET);
    }

    public static void ior(MemorySegment struct, float fieldValue) {
        struct.set(ior$LAYOUT, ior$OFFSET, fieldValue);
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

