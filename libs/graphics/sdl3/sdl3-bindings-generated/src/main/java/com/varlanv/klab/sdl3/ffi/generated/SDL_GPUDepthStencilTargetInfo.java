package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.*;

public class SDL_GPUDepthStencilTargetInfo {

	SDL_GPUDepthStencilTargetInfo() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_POINTER.withName("texture"),
			SDL3.C_FLOAT.withName("clear_depth"),
			SDL3.C_INT.withName("load_op"),
			SDL3.C_INT.withName("store_op"),
			SDL3.C_INT.withName("stencil_load_op"),
			SDL3.C_INT.withName("stencil_store_op"),
			SDL3.C_BOOL.withName("cycle"),
			SDL3.C_CHAR.withName("clear_stencil"),
			SDL3.C_CHAR.withName("mip_level"),
			SDL3.C_CHAR.withName("layer")
	).withName("SDL_GPUDepthStencilTargetInfo");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final AddressLayout texture$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("texture"));

	public static AddressLayout texture$layout() {
		return texture$LAYOUT;
	}

	private static final long texture$OFFSET = $LAYOUT.byteOffset(groupElement("texture"));

	public static long texture$offset() {
		return texture$OFFSET;
	}

	public static MemorySegment texture(MemorySegment struct) {
		return struct.get(texture$LAYOUT, texture$OFFSET);
	}

	public static void texture(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(texture$LAYOUT, texture$OFFSET, fieldValue);
	}

	private static final OfFloat clear_depth$LAYOUT = (OfFloat) $LAYOUT.select(groupElement("clear_depth"));

	public static OfFloat clear_depth$layout() {
		return clear_depth$LAYOUT;
	}

	private static final long clear_depth$OFFSET = $LAYOUT.byteOffset(groupElement("clear_depth"));

	public static long clear_depth$offset() {
		return clear_depth$OFFSET;
	}

	public static float clear_depth(MemorySegment struct) {
		return struct.get(clear_depth$LAYOUT, clear_depth$OFFSET);
	}

	public static void clear_depth(MemorySegment struct, float fieldValue) {
		struct.set(clear_depth$LAYOUT, clear_depth$OFFSET, fieldValue);
	}

	private static final OfInt load_op$LAYOUT = (OfInt) $LAYOUT.select(groupElement("load_op"));

	public static OfInt load_op$layout() {
		return load_op$LAYOUT;
	}

	private static final long load_op$OFFSET = $LAYOUT.byteOffset(groupElement("load_op"));

	public static long load_op$offset() {
		return load_op$OFFSET;
	}

	public static int load_op(MemorySegment struct) {
		return struct.get(load_op$LAYOUT, load_op$OFFSET);
	}

	public static void load_op(MemorySegment struct, int fieldValue) {
		struct.set(load_op$LAYOUT, load_op$OFFSET, fieldValue);
	}

	private static final OfInt store_op$LAYOUT = (OfInt) $LAYOUT.select(groupElement("store_op"));

	public static OfInt store_op$layout() {
		return store_op$LAYOUT;
	}

	private static final long store_op$OFFSET = $LAYOUT.byteOffset(groupElement("store_op"));

	public static long store_op$offset() {
		return store_op$OFFSET;
	}

	public static int store_op(MemorySegment struct) {
		return struct.get(store_op$LAYOUT, store_op$OFFSET);
	}

	public static void store_op(MemorySegment struct, int fieldValue) {
		struct.set(store_op$LAYOUT, store_op$OFFSET, fieldValue);
	}

	private static final OfInt stencil_load_op$LAYOUT = (OfInt) $LAYOUT.select(groupElement("stencil_load_op"));

	public static OfInt stencil_load_op$layout() {
		return stencil_load_op$LAYOUT;
	}

	private static final long stencil_load_op$OFFSET = $LAYOUT.byteOffset(groupElement("stencil_load_op"));

	public static long stencil_load_op$offset() {
		return stencil_load_op$OFFSET;
	}

	public static int stencil_load_op(MemorySegment struct) {
		return struct.get(stencil_load_op$LAYOUT, stencil_load_op$OFFSET);
	}

	public static void stencil_load_op(MemorySegment struct, int fieldValue) {
		struct.set(stencil_load_op$LAYOUT, stencil_load_op$OFFSET, fieldValue);
	}

	private static final OfInt stencil_store_op$LAYOUT = (OfInt) $LAYOUT.select(groupElement("stencil_store_op"));

	public static OfInt stencil_store_op$layout() {
		return stencil_store_op$LAYOUT;
	}

	private static final long stencil_store_op$OFFSET = $LAYOUT.byteOffset(groupElement("stencil_store_op"));

	public static long stencil_store_op$offset() {
		return stencil_store_op$OFFSET;
	}

	public static int stencil_store_op(MemorySegment struct) {
		return struct.get(stencil_store_op$LAYOUT, stencil_store_op$OFFSET);
	}

	public static void stencil_store_op(MemorySegment struct, int fieldValue) {
		struct.set(stencil_store_op$LAYOUT, stencil_store_op$OFFSET, fieldValue);
	}

	private static final OfBoolean cycle$LAYOUT = (OfBoolean) $LAYOUT.select(groupElement("cycle"));

	public static OfBoolean cycle$layout() {
		return cycle$LAYOUT;
	}

	private static final long cycle$OFFSET = $LAYOUT.byteOffset(groupElement("cycle"));

	public static long cycle$offset() {
		return cycle$OFFSET;
	}

	public static boolean cycle(MemorySegment struct) {
		return struct.get(cycle$LAYOUT, cycle$OFFSET);
	}

	public static void cycle(MemorySegment struct, boolean fieldValue) {
		struct.set(cycle$LAYOUT, cycle$OFFSET, fieldValue);
	}

	private static final OfByte clear_stencil$LAYOUT = (OfByte) $LAYOUT.select(groupElement("clear_stencil"));

	public static OfByte clear_stencil$layout() {
		return clear_stencil$LAYOUT;
	}

	private static final long clear_stencil$OFFSET = $LAYOUT.byteOffset(groupElement("clear_stencil"));

	public static long clear_stencil$offset() {
		return clear_stencil$OFFSET;
	}

	public static byte clear_stencil(MemorySegment struct) {
		return struct.get(clear_stencil$LAYOUT, clear_stencil$OFFSET);
	}

	public static void clear_stencil(MemorySegment struct, byte fieldValue) {
		struct.set(clear_stencil$LAYOUT, clear_stencil$OFFSET, fieldValue);
	}

	private static final OfByte mip_level$LAYOUT = (OfByte) $LAYOUT.select(groupElement("mip_level"));

	public static OfByte mip_level$layout() {
		return mip_level$LAYOUT;
	}

	private static final long mip_level$OFFSET = $LAYOUT.byteOffset(groupElement("mip_level"));

	public static long mip_level$offset() {
		return mip_level$OFFSET;
	}

	public static byte mip_level(MemorySegment struct) {
		return struct.get(mip_level$LAYOUT, mip_level$OFFSET);
	}

	public static void mip_level(MemorySegment struct, byte fieldValue) {
		struct.set(mip_level$LAYOUT, mip_level$OFFSET, fieldValue);
	}

	private static final OfByte layer$LAYOUT = (OfByte) $LAYOUT.select(groupElement("layer"));

	public static OfByte layer$layout() {
		return layer$LAYOUT;
	}

	private static final long layer$OFFSET = $LAYOUT.byteOffset(groupElement("layer"));

	public static long layer$offset() {
		return layer$OFFSET;
	}

	public static byte layer(MemorySegment struct) {
		return struct.get(layer$LAYOUT, layer$OFFSET);
	}

	public static void layer(MemorySegment struct, byte fieldValue) {
		struct.set(layer$LAYOUT, layer$OFFSET, fieldValue);
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
