package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_animation_sampler {

    cgltf_animation_sampler() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_POINTER.withName("input"),
        Cgltf.C_POINTER.withName("output"),
        Cgltf.C_INT.withName("interpolation"),
        MemoryLayout.paddingLayout(4),
        cgltf_extras.layout().withName("extras"),
        Cgltf.C_SIZE_T.withName("extensions_count"),
        Cgltf.C_POINTER.withName("extensions")
    ).withName("cgltf_animation_sampler");

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout input$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("input"));

    public static final AddressLayout input$layout() {
        return input$LAYOUT;
    }

    private static final long input$OFFSET = $LAYOUT.byteOffset(groupElement("input"));

    public static final long input$offset() {
        return input$OFFSET;
    }

    public static MemorySegment input(MemorySegment struct) {
        return struct.get(input$LAYOUT, input$OFFSET);
    }

    public static void input(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(input$LAYOUT, input$OFFSET, fieldValue);
    }

    private static final AddressLayout output$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("output"));

    public static final AddressLayout output$layout() {
        return output$LAYOUT;
    }

    private static final long output$OFFSET = $LAYOUT.byteOffset(groupElement("output"));

    public static final long output$offset() {
        return output$OFFSET;
    }

    public static MemorySegment output(MemorySegment struct) {
        return struct.get(output$LAYOUT, output$OFFSET);
    }

    public static void output(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(output$LAYOUT, output$OFFSET, fieldValue);
    }

    private static final OfInt interpolation$LAYOUT = (OfInt)$LAYOUT.select(groupElement("interpolation"));

    public static final OfInt interpolation$layout() {
        return interpolation$LAYOUT;
    }

    private static final long interpolation$OFFSET = $LAYOUT.byteOffset(groupElement("interpolation"));

    public static final long interpolation$offset() {
        return interpolation$OFFSET;
    }

    public static int interpolation(MemorySegment struct) {
        return struct.get(interpolation$LAYOUT, interpolation$OFFSET);
    }

    public static void interpolation(MemorySegment struct, int fieldValue) {
        struct.set(interpolation$LAYOUT, interpolation$OFFSET, fieldValue);
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

    private static final OfLong extensions_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("extensions_count"));

    public static final OfLong extensions_count$layout() {
        return extensions_count$LAYOUT;
    }

    private static final long extensions_count$OFFSET = $LAYOUT.byteOffset(groupElement("extensions_count"));

    public static final long extensions_count$offset() {
        return extensions_count$OFFSET;
    }

    public static long extensions_count(MemorySegment struct) {
        return struct.get(extensions_count$LAYOUT, extensions_count$OFFSET);
    }

    public static void extensions_count(MemorySegment struct, long fieldValue) {
        struct.set(extensions_count$LAYOUT, extensions_count$OFFSET, fieldValue);
    }

    private static final AddressLayout extensions$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("extensions"));

    public static final AddressLayout extensions$layout() {
        return extensions$LAYOUT;
    }

    private static final long extensions$OFFSET = $LAYOUT.byteOffset(groupElement("extensions"));

    public static final long extensions$offset() {
        return extensions$OFFSET;
    }

    public static MemorySegment extensions(MemorySegment struct) {
        return struct.get(extensions$LAYOUT, extensions$OFFSET);
    }

    public static void extensions(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(extensions$LAYOUT, extensions$OFFSET, fieldValue);
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

