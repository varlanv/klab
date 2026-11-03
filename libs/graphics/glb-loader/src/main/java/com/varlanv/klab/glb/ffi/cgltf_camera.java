package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_camera {

    cgltf_camera() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_POINTER.withName("name"),
        Cgltf.C_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        cgltf_camera.data.layout().withName("data"),
        cgltf_extras.layout().withName("extras"),
        Cgltf.C_SIZE_T.withName("extensions_count"),
        Cgltf.C_POINTER.withName("extensions")
    ).withName("cgltf_camera");

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout name$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("name"));

    public static final AddressLayout name$layout() {
        return name$LAYOUT;
    }

    private static final long name$OFFSET = $LAYOUT.byteOffset(groupElement("name"));

    public static final long name$offset() {
        return name$OFFSET;
    }

    public static MemorySegment name(MemorySegment struct) {
        return struct.get(name$LAYOUT, name$OFFSET);
    }

    public static void name(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(name$LAYOUT, name$OFFSET, fieldValue);
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

    public static class data {

        data() {
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            cgltf_camera_perspective.layout().withName("perspective"),
            cgltf_camera_orthographic.layout().withName("orthographic")
        ).withName("$anon$670:1");

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final GroupLayout perspective$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("perspective"));

        public static final GroupLayout perspective$layout() {
            return perspective$LAYOUT;
        }

        private static final long perspective$OFFSET = $LAYOUT.byteOffset(groupElement("perspective"));

        public static final long perspective$offset() {
            return perspective$OFFSET;
        }

        public static MemorySegment perspective(MemorySegment union) {
            return union.asSlice(perspective$OFFSET, perspective$LAYOUT.byteSize());
        }

        public static void perspective(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, perspective$OFFSET, perspective$LAYOUT.byteSize());
        }

        private static final GroupLayout orthographic$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("orthographic"));

        public static final GroupLayout orthographic$layout() {
            return orthographic$LAYOUT;
        }

        private static final long orthographic$OFFSET = $LAYOUT.byteOffset(groupElement("orthographic"));

        public static final long orthographic$offset() {
            return orthographic$OFFSET;
        }

        public static MemorySegment orthographic(MemorySegment union) {
            return union.asSlice(orthographic$OFFSET, orthographic$LAYOUT.byteSize());
        }

        public static void orthographic(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, orthographic$OFFSET, orthographic$LAYOUT.byteSize());
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

    private static final GroupLayout data$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("data"));

    public static final GroupLayout data$layout() {
        return data$LAYOUT;
    }

    private static final long data$OFFSET = $LAYOUT.byteOffset(groupElement("data"));

    public static final long data$offset() {
        return data$OFFSET;
    }

    public static MemorySegment data(MemorySegment struct) {
        return struct.asSlice(data$OFFSET, data$LAYOUT.byteSize());
    }

    public static void data(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, data$OFFSET, data$LAYOUT.byteSize());
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

