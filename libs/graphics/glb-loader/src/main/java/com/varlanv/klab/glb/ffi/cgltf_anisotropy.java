package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_anisotropy {

    cgltf_anisotropy() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_FLOAT.withName("anisotropy_strength"),
        Cgltf.C_FLOAT.withName("anisotropy_rotation"),
        cgltf_texture_view.layout().withName("anisotropy_texture")
    ).withName("cgltf_anisotropy");

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfFloat anisotropy_strength$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("anisotropy_strength"));

    public static final OfFloat anisotropy_strength$layout() {
        return anisotropy_strength$LAYOUT;
    }

    private static final long anisotropy_strength$OFFSET = $LAYOUT.byteOffset(groupElement("anisotropy_strength"));

    public static final long anisotropy_strength$offset() {
        return anisotropy_strength$OFFSET;
    }

    public static float anisotropy_strength(MemorySegment struct) {
        return struct.get(anisotropy_strength$LAYOUT, anisotropy_strength$OFFSET);
    }

    public static void anisotropy_strength(MemorySegment struct, float fieldValue) {
        struct.set(anisotropy_strength$LAYOUT, anisotropy_strength$OFFSET, fieldValue);
    }

    private static final OfFloat anisotropy_rotation$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("anisotropy_rotation"));

    public static final OfFloat anisotropy_rotation$layout() {
        return anisotropy_rotation$LAYOUT;
    }

    private static final long anisotropy_rotation$OFFSET = $LAYOUT.byteOffset(groupElement("anisotropy_rotation"));

    public static final long anisotropy_rotation$offset() {
        return anisotropy_rotation$OFFSET;
    }

    public static float anisotropy_rotation(MemorySegment struct) {
        return struct.get(anisotropy_rotation$LAYOUT, anisotropy_rotation$OFFSET);
    }

    public static void anisotropy_rotation(MemorySegment struct, float fieldValue) {
        struct.set(anisotropy_rotation$LAYOUT, anisotropy_rotation$OFFSET, fieldValue);
    }

    private static final GroupLayout anisotropy_texture$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("anisotropy_texture"));

    public static final GroupLayout anisotropy_texture$layout() {
        return anisotropy_texture$LAYOUT;
    }

    private static final long anisotropy_texture$OFFSET = $LAYOUT.byteOffset(groupElement("anisotropy_texture"));

    public static final long anisotropy_texture$offset() {
        return anisotropy_texture$OFFSET;
    }

    public static MemorySegment anisotropy_texture(MemorySegment struct) {
        return struct.asSlice(anisotropy_texture$OFFSET, anisotropy_texture$LAYOUT.byteSize());
    }

    public static void anisotropy_texture(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, anisotropy_texture$OFFSET, anisotropy_texture$LAYOUT.byteSize());
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

