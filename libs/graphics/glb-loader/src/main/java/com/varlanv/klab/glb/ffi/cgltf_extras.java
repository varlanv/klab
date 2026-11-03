package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_extras {

    cgltf_extras() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_SIZE_T.withName("start_offset"),
        Cgltf.C_SIZE_T.withName("end_offset"),
        Cgltf.C_POINTER.withName("data")
    ).withName("cgltf_extras");

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong start_offset$LAYOUT = (OfLong)$LAYOUT.select(groupElement("start_offset"));

    public static final OfLong start_offset$layout() {
        return start_offset$LAYOUT;
    }

    private static final long start_offset$OFFSET = $LAYOUT.byteOffset(groupElement("start_offset"));

    public static final long start_offset$offset() {
        return start_offset$OFFSET;
    }

    public static long start_offset(MemorySegment struct) {
        return struct.get(start_offset$LAYOUT, start_offset$OFFSET);
    }

    public static void start_offset(MemorySegment struct, long fieldValue) {
        struct.set(start_offset$LAYOUT, start_offset$OFFSET, fieldValue);
    }

    private static final OfLong end_offset$LAYOUT = (OfLong)$LAYOUT.select(groupElement("end_offset"));

    public static final OfLong end_offset$layout() {
        return end_offset$LAYOUT;
    }

    private static final long end_offset$OFFSET = $LAYOUT.byteOffset(groupElement("end_offset"));

    public static final long end_offset$offset() {
        return end_offset$OFFSET;
    }

    public static long end_offset(MemorySegment struct) {
        return struct.get(end_offset$LAYOUT, end_offset$OFFSET);
    }

    public static void end_offset(MemorySegment struct, long fieldValue) {
        struct.set(end_offset$LAYOUT, end_offset$OFFSET, fieldValue);
    }

    private static final AddressLayout data$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("data"));

    public static final AddressLayout data$layout() {
        return data$LAYOUT;
    }

    private static final long data$OFFSET = $LAYOUT.byteOffset(groupElement("data"));

    public static final long data$offset() {
        return data$OFFSET;
    }

    public static MemorySegment data(MemorySegment struct) {
        return struct.get(data$LAYOUT, data$OFFSET);
    }

    public static void data(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(data$LAYOUT, data$OFFSET, fieldValue);
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

