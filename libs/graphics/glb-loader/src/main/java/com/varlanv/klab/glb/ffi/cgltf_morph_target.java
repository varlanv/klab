package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_morph_target {

    cgltf_morph_target() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_POINTER.withName("attributes"),
        Cgltf.C_SIZE_T.withName("attributes_count")
    ).withName("cgltf_morph_target");

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout attributes$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("attributes"));

    public static final AddressLayout attributes$layout() {
        return attributes$LAYOUT;
    }

    private static final long attributes$OFFSET = $LAYOUT.byteOffset(groupElement("attributes"));

    public static final long attributes$offset() {
        return attributes$OFFSET;
    }

    public static MemorySegment attributes(MemorySegment struct) {
        return struct.get(attributes$LAYOUT, attributes$OFFSET);
    }

    public static void attributes(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(attributes$LAYOUT, attributes$OFFSET, fieldValue);
    }

    private static final OfLong attributes_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("attributes_count"));

    public static final OfLong attributes_count$layout() {
        return attributes_count$LAYOUT;
    }

    private static final long attributes_count$OFFSET = $LAYOUT.byteOffset(groupElement("attributes_count"));

    public static final long attributes_count$offset() {
        return attributes_count$OFFSET;
    }

    public static long attributes_count(MemorySegment struct) {
        return struct.get(attributes_count$LAYOUT, attributes_count$OFFSET);
    }

    public static void attributes_count(MemorySegment struct, long fieldValue) {
        struct.set(attributes_count$LAYOUT, attributes_count$OFFSET, fieldValue);
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

