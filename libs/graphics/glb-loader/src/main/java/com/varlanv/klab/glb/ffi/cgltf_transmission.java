package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_transmission {

    cgltf_transmission() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        cgltf_texture_view.layout().withName("transmission_texture"),
        Cgltf.C_FLOAT.withName("transmission_factor"),
        MemoryLayout.paddingLayout(4)
    ).withName("cgltf_transmission");

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout transmission_texture$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("transmission_texture"));

    public static final GroupLayout transmission_texture$layout() {
        return transmission_texture$LAYOUT;
    }

    private static final long transmission_texture$OFFSET = $LAYOUT.byteOffset(groupElement("transmission_texture"));

    public static final long transmission_texture$offset() {
        return transmission_texture$OFFSET;
    }

    public static MemorySegment transmission_texture(MemorySegment struct) {
        return struct.asSlice(transmission_texture$OFFSET, transmission_texture$LAYOUT.byteSize());
    }

    public static void transmission_texture(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, transmission_texture$OFFSET, transmission_texture$LAYOUT.byteSize());
    }

    private static final OfFloat transmission_factor$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("transmission_factor"));

    public static final OfFloat transmission_factor$layout() {
        return transmission_factor$LAYOUT;
    }

    private static final long transmission_factor$OFFSET = $LAYOUT.byteOffset(groupElement("transmission_factor"));

    public static final long transmission_factor$offset() {
        return transmission_factor$OFFSET;
    }

    public static float transmission_factor(MemorySegment struct) {
        return struct.get(transmission_factor$LAYOUT, transmission_factor$OFFSET);
    }

    public static void transmission_factor(MemorySegment struct, float fieldValue) {
        struct.set(transmission_factor$LAYOUT, transmission_factor$OFFSET, fieldValue);
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

