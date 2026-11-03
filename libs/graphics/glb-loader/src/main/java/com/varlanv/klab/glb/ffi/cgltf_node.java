package com.varlanv.klab.glb.ffi;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class cgltf_node {

    cgltf_node() {
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Cgltf.C_POINTER.withName("name"),
        Cgltf.C_POINTER.withName("parent"),
        Cgltf.C_POINTER.withName("children"),
        Cgltf.C_SIZE_T.withName("children_count"),
        Cgltf.C_POINTER.withName("skin"),
        Cgltf.C_POINTER.withName("mesh"),
        Cgltf.C_POINTER.withName("camera"),
        Cgltf.C_POINTER.withName("light"),
        Cgltf.C_POINTER.withName("weights"),
        Cgltf.C_SIZE_T.withName("weights_count"),
        Cgltf.C_INT.withName("has_translation"),
        Cgltf.C_INT.withName("has_rotation"),
        Cgltf.C_INT.withName("has_scale"),
        Cgltf.C_INT.withName("has_matrix"),
        MemoryLayout.sequenceLayout(3, Cgltf.C_FLOAT).withName("translation"),
        MemoryLayout.sequenceLayout(4, Cgltf.C_FLOAT).withName("rotation"),
        MemoryLayout.sequenceLayout(3, Cgltf.C_FLOAT).withName("scale"),
        MemoryLayout.sequenceLayout(16, Cgltf.C_FLOAT).withName("matrix"),
        cgltf_extras.layout().withName("extras"),
        Cgltf.C_INT.withName("has_mesh_gpu_instancing"),
        MemoryLayout.paddingLayout(4),
        cgltf_mesh_gpu_instancing.layout().withName("mesh_gpu_instancing"),
        Cgltf.C_SIZE_T.withName("extensions_count"),
        Cgltf.C_POINTER.withName("extensions")
    ).withName("cgltf_node");

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

    private static final AddressLayout parent$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("parent"));

    public static final AddressLayout parent$layout() {
        return parent$LAYOUT;
    }

    private static final long parent$OFFSET = $LAYOUT.byteOffset(groupElement("parent"));

    public static final long parent$offset() {
        return parent$OFFSET;
    }

    public static MemorySegment parent(MemorySegment struct) {
        return struct.get(parent$LAYOUT, parent$OFFSET);
    }

    public static void parent(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(parent$LAYOUT, parent$OFFSET, fieldValue);
    }

    private static final AddressLayout children$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("children"));

    public static final AddressLayout children$layout() {
        return children$LAYOUT;
    }

    private static final long children$OFFSET = $LAYOUT.byteOffset(groupElement("children"));

    public static final long children$offset() {
        return children$OFFSET;
    }

    public static MemorySegment children(MemorySegment struct) {
        return struct.get(children$LAYOUT, children$OFFSET);
    }

    public static void children(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(children$LAYOUT, children$OFFSET, fieldValue);
    }

    private static final OfLong children_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("children_count"));

    public static final OfLong children_count$layout() {
        return children_count$LAYOUT;
    }

    private static final long children_count$OFFSET = $LAYOUT.byteOffset(groupElement("children_count"));

    public static final long children_count$offset() {
        return children_count$OFFSET;
    }

    public static long children_count(MemorySegment struct) {
        return struct.get(children_count$LAYOUT, children_count$OFFSET);
    }

    public static void children_count(MemorySegment struct, long fieldValue) {
        struct.set(children_count$LAYOUT, children_count$OFFSET, fieldValue);
    }

    private static final AddressLayout skin$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("skin"));

    public static final AddressLayout skin$layout() {
        return skin$LAYOUT;
    }

    private static final long skin$OFFSET = $LAYOUT.byteOffset(groupElement("skin"));

    public static final long skin$offset() {
        return skin$OFFSET;
    }

    public static MemorySegment skin(MemorySegment struct) {
        return struct.get(skin$LAYOUT, skin$OFFSET);
    }

    public static void skin(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(skin$LAYOUT, skin$OFFSET, fieldValue);
    }

    private static final AddressLayout mesh$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("mesh"));

    public static final AddressLayout mesh$layout() {
        return mesh$LAYOUT;
    }

    private static final long mesh$OFFSET = $LAYOUT.byteOffset(groupElement("mesh"));

    public static final long mesh$offset() {
        return mesh$OFFSET;
    }

    public static MemorySegment mesh(MemorySegment struct) {
        return struct.get(mesh$LAYOUT, mesh$OFFSET);
    }

    public static void mesh(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(mesh$LAYOUT, mesh$OFFSET, fieldValue);
    }

    private static final AddressLayout camera$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("camera"));

    public static final AddressLayout camera$layout() {
        return camera$LAYOUT;
    }

    private static final long camera$OFFSET = $LAYOUT.byteOffset(groupElement("camera"));

    public static final long camera$offset() {
        return camera$OFFSET;
    }

    public static MemorySegment camera(MemorySegment struct) {
        return struct.get(camera$LAYOUT, camera$OFFSET);
    }

    public static void camera(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(camera$LAYOUT, camera$OFFSET, fieldValue);
    }

    private static final AddressLayout light$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("light"));

    public static final AddressLayout light$layout() {
        return light$LAYOUT;
    }

    private static final long light$OFFSET = $LAYOUT.byteOffset(groupElement("light"));

    public static final long light$offset() {
        return light$OFFSET;
    }

    public static MemorySegment light(MemorySegment struct) {
        return struct.get(light$LAYOUT, light$OFFSET);
    }

    public static void light(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(light$LAYOUT, light$OFFSET, fieldValue);
    }

    private static final AddressLayout weights$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("weights"));

    public static final AddressLayout weights$layout() {
        return weights$LAYOUT;
    }

    private static final long weights$OFFSET = $LAYOUT.byteOffset(groupElement("weights"));

    public static final long weights$offset() {
        return weights$OFFSET;
    }

    public static MemorySegment weights(MemorySegment struct) {
        return struct.get(weights$LAYOUT, weights$OFFSET);
    }

    public static void weights(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(weights$LAYOUT, weights$OFFSET, fieldValue);
    }

    private static final OfLong weights_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("weights_count"));

    public static final OfLong weights_count$layout() {
        return weights_count$LAYOUT;
    }

    private static final long weights_count$OFFSET = $LAYOUT.byteOffset(groupElement("weights_count"));

    public static final long weights_count$offset() {
        return weights_count$OFFSET;
    }

    public static long weights_count(MemorySegment struct) {
        return struct.get(weights_count$LAYOUT, weights_count$OFFSET);
    }

    public static void weights_count(MemorySegment struct, long fieldValue) {
        struct.set(weights_count$LAYOUT, weights_count$OFFSET, fieldValue);
    }

    private static final OfInt has_translation$LAYOUT = (OfInt)$LAYOUT.select(groupElement("has_translation"));

    public static final OfInt has_translation$layout() {
        return has_translation$LAYOUT;
    }

    private static final long has_translation$OFFSET = $LAYOUT.byteOffset(groupElement("has_translation"));

    public static final long has_translation$offset() {
        return has_translation$OFFSET;
    }

    public static int has_translation(MemorySegment struct) {
        return struct.get(has_translation$LAYOUT, has_translation$OFFSET);
    }

    public static void has_translation(MemorySegment struct, int fieldValue) {
        struct.set(has_translation$LAYOUT, has_translation$OFFSET, fieldValue);
    }

    private static final OfInt has_rotation$LAYOUT = (OfInt)$LAYOUT.select(groupElement("has_rotation"));

    public static final OfInt has_rotation$layout() {
        return has_rotation$LAYOUT;
    }

    private static final long has_rotation$OFFSET = $LAYOUT.byteOffset(groupElement("has_rotation"));

    public static final long has_rotation$offset() {
        return has_rotation$OFFSET;
    }

    public static int has_rotation(MemorySegment struct) {
        return struct.get(has_rotation$LAYOUT, has_rotation$OFFSET);
    }

    public static void has_rotation(MemorySegment struct, int fieldValue) {
        struct.set(has_rotation$LAYOUT, has_rotation$OFFSET, fieldValue);
    }

    private static final OfInt has_scale$LAYOUT = (OfInt)$LAYOUT.select(groupElement("has_scale"));

    public static final OfInt has_scale$layout() {
        return has_scale$LAYOUT;
    }

    private static final long has_scale$OFFSET = $LAYOUT.byteOffset(groupElement("has_scale"));

    public static final long has_scale$offset() {
        return has_scale$OFFSET;
    }

    public static int has_scale(MemorySegment struct) {
        return struct.get(has_scale$LAYOUT, has_scale$OFFSET);
    }

    public static void has_scale(MemorySegment struct, int fieldValue) {
        struct.set(has_scale$LAYOUT, has_scale$OFFSET, fieldValue);
    }

    private static final OfInt has_matrix$LAYOUT = (OfInt)$LAYOUT.select(groupElement("has_matrix"));

    public static final OfInt has_matrix$layout() {
        return has_matrix$LAYOUT;
    }

    private static final long has_matrix$OFFSET = $LAYOUT.byteOffset(groupElement("has_matrix"));

    public static final long has_matrix$offset() {
        return has_matrix$OFFSET;
    }

    public static int has_matrix(MemorySegment struct) {
        return struct.get(has_matrix$LAYOUT, has_matrix$OFFSET);
    }

    public static void has_matrix(MemorySegment struct, int fieldValue) {
        struct.set(has_matrix$LAYOUT, has_matrix$OFFSET, fieldValue);
    }

    private static final SequenceLayout translation$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("translation"));

    public static final SequenceLayout translation$layout() {
        return translation$LAYOUT;
    }

    private static final long translation$OFFSET = $LAYOUT.byteOffset(groupElement("translation"));

    public static final long translation$offset() {
        return translation$OFFSET;
    }

    public static MemorySegment translation(MemorySegment struct) {
        return struct.asSlice(translation$OFFSET, translation$LAYOUT.byteSize());
    }

    public static void translation(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, translation$OFFSET, translation$LAYOUT.byteSize());
    }

    private static long[] translation$DIMS = { 3 };

    public static long[] translation$dimensions() {
        return translation$DIMS;
    }
    private static final VarHandle translation$ELEM_HANDLE = translation$LAYOUT.varHandle(sequenceElement());

    public static float translation(MemorySegment struct, long index0) {
        return (float)translation$ELEM_HANDLE.get(struct, translation$OFFSET, index0);
    }

    public static void translation(MemorySegment struct, long index0, float fieldValue) {
        translation$ELEM_HANDLE.set(struct, translation$OFFSET, index0, fieldValue);
    }

    private static final SequenceLayout rotation$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("rotation"));

    public static final SequenceLayout rotation$layout() {
        return rotation$LAYOUT;
    }

    private static final long rotation$OFFSET = $LAYOUT.byteOffset(groupElement("rotation"));

    public static final long rotation$offset() {
        return rotation$OFFSET;
    }

    public static MemorySegment rotation(MemorySegment struct) {
        return struct.asSlice(rotation$OFFSET, rotation$LAYOUT.byteSize());
    }

    public static void rotation(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, rotation$OFFSET, rotation$LAYOUT.byteSize());
    }

    private static long[] rotation$DIMS = { 4 };

    public static long[] rotation$dimensions() {
        return rotation$DIMS;
    }
    private static final VarHandle rotation$ELEM_HANDLE = rotation$LAYOUT.varHandle(sequenceElement());

    public static float rotation(MemorySegment struct, long index0) {
        return (float)rotation$ELEM_HANDLE.get(struct, rotation$OFFSET, index0);
    }

    public static void rotation(MemorySegment struct, long index0, float fieldValue) {
        rotation$ELEM_HANDLE.set(struct, rotation$OFFSET, index0, fieldValue);
    }

    private static final SequenceLayout scale$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("scale"));

    public static final SequenceLayout scale$layout() {
        return scale$LAYOUT;
    }

    private static final long scale$OFFSET = $LAYOUT.byteOffset(groupElement("scale"));

    public static final long scale$offset() {
        return scale$OFFSET;
    }

    public static MemorySegment scale(MemorySegment struct) {
        return struct.asSlice(scale$OFFSET, scale$LAYOUT.byteSize());
    }

    public static void scale(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, scale$OFFSET, scale$LAYOUT.byteSize());
    }

    private static long[] scale$DIMS = { 3 };

    public static long[] scale$dimensions() {
        return scale$DIMS;
    }
    private static final VarHandle scale$ELEM_HANDLE = scale$LAYOUT.varHandle(sequenceElement());

    public static float scale(MemorySegment struct, long index0) {
        return (float)scale$ELEM_HANDLE.get(struct, scale$OFFSET, index0);
    }

    public static void scale(MemorySegment struct, long index0, float fieldValue) {
        scale$ELEM_HANDLE.set(struct, scale$OFFSET, index0, fieldValue);
    }

    private static final SequenceLayout matrix$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("matrix"));

    public static final SequenceLayout matrix$layout() {
        return matrix$LAYOUT;
    }

    private static final long matrix$OFFSET = $LAYOUT.byteOffset(groupElement("matrix"));

    public static final long matrix$offset() {
        return matrix$OFFSET;
    }

    public static MemorySegment matrix(MemorySegment struct) {
        return struct.asSlice(matrix$OFFSET, matrix$LAYOUT.byteSize());
    }

    public static void matrix(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, matrix$OFFSET, matrix$LAYOUT.byteSize());
    }

    private static long[] matrix$DIMS = { 16 };

    public static long[] matrix$dimensions() {
        return matrix$DIMS;
    }
    private static final VarHandle matrix$ELEM_HANDLE = matrix$LAYOUT.varHandle(sequenceElement());

    public static float matrix(MemorySegment struct, long index0) {
        return (float)matrix$ELEM_HANDLE.get(struct, matrix$OFFSET, index0);
    }

    public static void matrix(MemorySegment struct, long index0, float fieldValue) {
        matrix$ELEM_HANDLE.set(struct, matrix$OFFSET, index0, fieldValue);
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

    private static final OfInt has_mesh_gpu_instancing$LAYOUT = (OfInt)$LAYOUT.select(groupElement("has_mesh_gpu_instancing"));

    public static final OfInt has_mesh_gpu_instancing$layout() {
        return has_mesh_gpu_instancing$LAYOUT;
    }

    private static final long has_mesh_gpu_instancing$OFFSET = $LAYOUT.byteOffset(groupElement("has_mesh_gpu_instancing"));

    public static final long has_mesh_gpu_instancing$offset() {
        return has_mesh_gpu_instancing$OFFSET;
    }

    public static int has_mesh_gpu_instancing(MemorySegment struct) {
        return struct.get(has_mesh_gpu_instancing$LAYOUT, has_mesh_gpu_instancing$OFFSET);
    }

    public static void has_mesh_gpu_instancing(MemorySegment struct, int fieldValue) {
        struct.set(has_mesh_gpu_instancing$LAYOUT, has_mesh_gpu_instancing$OFFSET, fieldValue);
    }

    private static final GroupLayout mesh_gpu_instancing$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("mesh_gpu_instancing"));

    public static final GroupLayout mesh_gpu_instancing$layout() {
        return mesh_gpu_instancing$LAYOUT;
    }

    private static final long mesh_gpu_instancing$OFFSET = $LAYOUT.byteOffset(groupElement("mesh_gpu_instancing"));

    public static final long mesh_gpu_instancing$offset() {
        return mesh_gpu_instancing$OFFSET;
    }

    public static MemorySegment mesh_gpu_instancing(MemorySegment struct) {
        return struct.asSlice(mesh_gpu_instancing$OFFSET, mesh_gpu_instancing$LAYOUT.byteSize());
    }

    public static void mesh_gpu_instancing(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, mesh_gpu_instancing$OFFSET, mesh_gpu_instancing$LAYOUT.byteSize());
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

