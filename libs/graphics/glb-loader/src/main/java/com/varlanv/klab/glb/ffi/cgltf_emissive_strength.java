package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_emissive_strength {

    cgltf_emissive_strength() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_FLOAT.withName("emissive_strength")
    ).withName("cgltf_emissive_strength");

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfFloat emissive_strength$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("emissive_strength"));

    public static final OfFloat emissive_strength$layout() {
        return emissive_strength$LAYOUT;
    }

    private static final long emissive_strength$OFFSET = $LAYOUT.byteOffset(groupElement("emissive_strength"));

    public static final long emissive_strength$offset() {
        return emissive_strength$OFFSET;
    }

    public static float emissive_strength(MemorySegment struct) {
        return struct.get(emissive_strength$LAYOUT, emissive_strength$OFFSET);
    }

    public static void emissive_strength(MemorySegment struct, float fieldValue) {
        struct.set(emissive_strength$LAYOUT, emissive_strength$OFFSET, fieldValue);
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

