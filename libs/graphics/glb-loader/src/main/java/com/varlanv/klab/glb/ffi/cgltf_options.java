package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_options {

    cgltf_options() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        Cgltf.C_SIZE_T.withName("json_token_count"),
        cgltf_memory_options.layout().withName("memory"),
        cgltf_file_options.layout().withName("file")
    ).withName("cgltf_options");

    public static final GroupLayout layout() {
        return $LAYOUT;
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

    private static final OfLong json_token_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("json_token_count"));

    public static final OfLong json_token_count$layout() {
        return json_token_count$LAYOUT;
    }

    private static final long json_token_count$OFFSET = $LAYOUT.byteOffset(groupElement("json_token_count"));

    public static final long json_token_count$offset() {
        return json_token_count$OFFSET;
    }

    public static long json_token_count(MemorySegment struct) {
        return struct.get(json_token_count$LAYOUT, json_token_count$OFFSET);
    }

    public static void json_token_count(MemorySegment struct, long fieldValue) {
        struct.set(json_token_count$LAYOUT, json_token_count$OFFSET, fieldValue);
    }

    private static final GroupLayout memory$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("memory"));

    public static final GroupLayout memory$layout() {
        return memory$LAYOUT;
    }

    private static final long memory$OFFSET = $LAYOUT.byteOffset(groupElement("memory"));

    public static final long memory$offset() {
        return memory$OFFSET;
    }

    public static MemorySegment memory(MemorySegment struct) {
        return struct.asSlice(memory$OFFSET, memory$LAYOUT.byteSize());
    }

    public static void memory(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, memory$OFFSET, memory$LAYOUT.byteSize());
    }

    private static final GroupLayout file$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("file"));

    public static final GroupLayout file$layout() {
        return file$LAYOUT;
    }

    private static final long file$OFFSET = $LAYOUT.byteOffset(groupElement("file"));

    public static final long file$offset() {
        return file$OFFSET;
    }

    public static MemorySegment file(MemorySegment struct) {
        return struct.asSlice(file$OFFSET, file$LAYOUT.byteSize());
    }

    public static void file(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, file$OFFSET, file$LAYOUT.byteSize());
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

