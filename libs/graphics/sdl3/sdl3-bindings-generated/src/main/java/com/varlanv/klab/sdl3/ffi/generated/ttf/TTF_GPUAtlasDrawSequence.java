package com.varlanv.klab.sdl3.ffi.generated.ttf;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

public class TTF_GPUAtlasDrawSequence {

	TTF_GPUAtlasDrawSequence() {
	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3Ttf.C_POINTER.withName("atlas_texture"),
			SDL3Ttf.C_POINTER.withName("xy"),
			SDL3Ttf.C_POINTER.withName("uv"),
			SDL3Ttf.C_INT.withName("num_vertices"),
			MemoryLayout.paddingLayout(4),
			SDL3Ttf.C_POINTER.withName("indices"),
			SDL3Ttf.C_INT.withName("num_indices"),
			SDL3Ttf.C_INT.withName("image_type"),
			SDL3Ttf.C_POINTER.withName("next")
	).withName("TTF_GPUAtlasDrawSequence");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final AddressLayout atlas_texture$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("atlas_texture"));

	public static AddressLayout atlas_texture$layout() {
		return atlas_texture$LAYOUT;
	}

	private static final long atlas_texture$OFFSET = $LAYOUT.byteOffset(groupElement("atlas_texture"));

	public static long atlas_texture$offset() {
		return atlas_texture$OFFSET;
	}

	public static MemorySegment atlas_texture(MemorySegment struct) {
		return struct.get(atlas_texture$LAYOUT, atlas_texture$OFFSET);
	}

	public static void atlas_texture(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(atlas_texture$LAYOUT, atlas_texture$OFFSET, fieldValue);
	}

	private static final AddressLayout xy$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("xy"));

	public static AddressLayout xy$layout() {
		return xy$LAYOUT;
	}

	private static final long xy$OFFSET = $LAYOUT.byteOffset(groupElement("xy"));

	public static long xy$offset() {
		return xy$OFFSET;
	}

	public static MemorySegment xy(MemorySegment struct) {
		return struct.get(xy$LAYOUT, xy$OFFSET);
	}

	public static void xy(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(xy$LAYOUT, xy$OFFSET, fieldValue);
	}

	private static final AddressLayout uv$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("uv"));

	public static AddressLayout uv$layout() {
		return uv$LAYOUT;
	}

	private static final long uv$OFFSET = $LAYOUT.byteOffset(groupElement("uv"));

	public static long uv$offset() {
		return uv$OFFSET;
	}

	public static MemorySegment uv(MemorySegment struct) {
		return struct.get(uv$LAYOUT, uv$OFFSET);
	}

	public static void uv(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(uv$LAYOUT, uv$OFFSET, fieldValue);
	}

	private static final OfInt num_vertices$LAYOUT = (OfInt) $LAYOUT.select(groupElement("num_vertices"));

	public static OfInt num_vertices$layout() {
		return num_vertices$LAYOUT;
	}

	private static final long num_vertices$OFFSET = $LAYOUT.byteOffset(groupElement("num_vertices"));

	public static long num_vertices$offset() {
		return num_vertices$OFFSET;
	}

	public static int num_vertices(MemorySegment struct) {
		return struct.get(num_vertices$LAYOUT, num_vertices$OFFSET);
	}

	public static void num_vertices(MemorySegment struct, int fieldValue) {
		struct.set(num_vertices$LAYOUT, num_vertices$OFFSET, fieldValue);
	}

	private static final AddressLayout indices$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("indices"));

	public static AddressLayout indices$layout() {
		return indices$LAYOUT;
	}

	private static final long indices$OFFSET = $LAYOUT.byteOffset(groupElement("indices"));

	public static long indices$offset() {
		return indices$OFFSET;
	}

	public static MemorySegment indices(MemorySegment struct) {
		return struct.get(indices$LAYOUT, indices$OFFSET);
	}

	public static void indices(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(indices$LAYOUT, indices$OFFSET, fieldValue);
	}

	private static final OfInt num_indices$LAYOUT = (OfInt) $LAYOUT.select(groupElement("num_indices"));

	public static OfInt num_indices$layout() {
		return num_indices$LAYOUT;
	}

	private static final long num_indices$OFFSET = $LAYOUT.byteOffset(groupElement("num_indices"));

	public static long num_indices$offset() {
		return num_indices$OFFSET;
	}

	public static int num_indices(MemorySegment struct) {
		return struct.get(num_indices$LAYOUT, num_indices$OFFSET);
	}

	public static void num_indices(MemorySegment struct, int fieldValue) {
		struct.set(num_indices$LAYOUT, num_indices$OFFSET, fieldValue);
	}

	private static final OfInt image_type$LAYOUT = (OfInt) $LAYOUT.select(groupElement("image_type"));

	public static OfInt image_type$layout() {
		return image_type$LAYOUT;
	}

	private static final long image_type$OFFSET = $LAYOUT.byteOffset(groupElement("image_type"));

	public static long image_type$offset() {
		return image_type$OFFSET;
	}

	public static int image_type(MemorySegment struct) {
		return struct.get(image_type$LAYOUT, image_type$OFFSET);
	}

	public static void image_type(MemorySegment struct, int fieldValue) {
		struct.set(image_type$LAYOUT, image_type$OFFSET, fieldValue);
	}

	private static final AddressLayout next$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("next"));

	public static AddressLayout next$layout() {
		return next$LAYOUT;
	}

	private static final long next$OFFSET = $LAYOUT.byteOffset(groupElement("next"));

	public static long next$offset() {
		return next$OFFSET;
	}

	public static MemorySegment next(MemorySegment struct) {
		return struct.get(next$LAYOUT, next$OFFSET);
	}

	public static void next(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(next$LAYOUT, next$OFFSET, fieldValue);
	}

	public static MemorySegment asSlice(MemorySegment array, long index) {
		return array.asSlice(layout().byteSize() * index);
	}

	public static long sizeof() {
		return layout().byteSize();
	}

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
