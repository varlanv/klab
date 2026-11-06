package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.*;

public class SDL_GPUColorTargetInfo {

	SDL_GPUColorTargetInfo() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_POINTER.withName("texture"),
			SDL3.C_INT.withName("mip_level"),
			SDL3.C_INT.withName("layer_or_depth_plane"),
			SDL_FColor.layout().withName("clear_color"),
			SDL3.C_INT.withName("load_op"),
			SDL3.C_INT.withName("store_op"),
			SDL3.C_POINTER.withName("resolve_texture"),
			SDL3.C_INT.withName("resolve_mip_level"),
			SDL3.C_INT.withName("resolve_layer"),
			SDL3.C_BOOL.withName("cycle"),
			SDL3.C_BOOL.withName("cycle_resolve_texture"),
			SDL3.C_CHAR.withName("padding1"),
			SDL3.C_CHAR.withName("padding2"),
			MemoryLayout.paddingLayout(4)
	).withName("SDL_GPUColorTargetInfo");

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

	private static final OfInt mip_level$LAYOUT = (OfInt) $LAYOUT.select(groupElement("mip_level"));

	public static OfInt mip_level$layout() {
		return mip_level$LAYOUT;
	}

	private static final long mip_level$OFFSET = $LAYOUT.byteOffset(groupElement("mip_level"));

	public static long mip_level$offset() {
		return mip_level$OFFSET;
	}

	public static int mip_level(MemorySegment struct) {
		return struct.get(mip_level$LAYOUT, mip_level$OFFSET);
	}

	public static void mip_level(MemorySegment struct, int fieldValue) {
		struct.set(mip_level$LAYOUT, mip_level$OFFSET, fieldValue);
	}

	private static final OfInt layer_or_depth_plane$LAYOUT = (OfInt) $LAYOUT.select(groupElement("layer_or_depth_plane"));

	public static OfInt layer_or_depth_plane$layout() {
		return layer_or_depth_plane$LAYOUT;
	}

	private static final long layer_or_depth_plane$OFFSET = $LAYOUT.byteOffset(groupElement("layer_or_depth_plane"));

	public static long layer_or_depth_plane$offset() {
		return layer_or_depth_plane$OFFSET;
	}

	public static int layer_or_depth_plane(MemorySegment struct) {
		return struct.get(layer_or_depth_plane$LAYOUT, layer_or_depth_plane$OFFSET);
	}

	public static void layer_or_depth_plane(MemorySegment struct, int fieldValue) {
		struct.set(layer_or_depth_plane$LAYOUT, layer_or_depth_plane$OFFSET, fieldValue);
	}

	private static final GroupLayout clear_color$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("clear_color"));

	public static GroupLayout clear_color$layout() {
		return clear_color$LAYOUT;
	}

	private static final long clear_color$OFFSET = $LAYOUT.byteOffset(groupElement("clear_color"));

	public static long clear_color$offset() {
		return clear_color$OFFSET;
	}

	public static MemorySegment clear_color(MemorySegment struct) {
		return struct.asSlice(clear_color$OFFSET, clear_color$LAYOUT.byteSize());
	}

	public static void clear_color(MemorySegment struct, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, struct, clear_color$OFFSET, clear_color$LAYOUT.byteSize());
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

	private static final AddressLayout resolve_texture$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("resolve_texture"));

	public static AddressLayout resolve_texture$layout() {
		return resolve_texture$LAYOUT;
	}

	private static final long resolve_texture$OFFSET = $LAYOUT.byteOffset(groupElement("resolve_texture"));

	public static long resolve_texture$offset() {
		return resolve_texture$OFFSET;
	}

	public static MemorySegment resolve_texture(MemorySegment struct) {
		return struct.get(resolve_texture$LAYOUT, resolve_texture$OFFSET);
	}

	public static void resolve_texture(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(resolve_texture$LAYOUT, resolve_texture$OFFSET, fieldValue);
	}

	private static final OfInt resolve_mip_level$LAYOUT = (OfInt) $LAYOUT.select(groupElement("resolve_mip_level"));

	public static OfInt resolve_mip_level$layout() {
		return resolve_mip_level$LAYOUT;
	}

	private static final long resolve_mip_level$OFFSET = $LAYOUT.byteOffset(groupElement("resolve_mip_level"));

	public static long resolve_mip_level$offset() {
		return resolve_mip_level$OFFSET;
	}

	public static int resolve_mip_level(MemorySegment struct) {
		return struct.get(resolve_mip_level$LAYOUT, resolve_mip_level$OFFSET);
	}

	public static void resolve_mip_level(MemorySegment struct, int fieldValue) {
		struct.set(resolve_mip_level$LAYOUT, resolve_mip_level$OFFSET, fieldValue);
	}

	private static final OfInt resolve_layer$LAYOUT = (OfInt) $LAYOUT.select(groupElement("resolve_layer"));

	public static OfInt resolve_layer$layout() {
		return resolve_layer$LAYOUT;
	}

	private static final long resolve_layer$OFFSET = $LAYOUT.byteOffset(groupElement("resolve_layer"));

	public static long resolve_layer$offset() {
		return resolve_layer$OFFSET;
	}

	public static int resolve_layer(MemorySegment struct) {
		return struct.get(resolve_layer$LAYOUT, resolve_layer$OFFSET);
	}

	public static void resolve_layer(MemorySegment struct, int fieldValue) {
		struct.set(resolve_layer$LAYOUT, resolve_layer$OFFSET, fieldValue);
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

	private static final OfBoolean cycle_resolve_texture$LAYOUT = (OfBoolean) $LAYOUT.select(groupElement("cycle_resolve_texture"));

	public static OfBoolean cycle_resolve_texture$layout() {
		return cycle_resolve_texture$LAYOUT;
	}

	private static final long cycle_resolve_texture$OFFSET = $LAYOUT.byteOffset(groupElement("cycle_resolve_texture"));

	public static long cycle_resolve_texture$offset() {
		return cycle_resolve_texture$OFFSET;
	}

	public static boolean cycle_resolve_texture(MemorySegment struct) {
		return struct.get(cycle_resolve_texture$LAYOUT, cycle_resolve_texture$OFFSET);
	}

	public static void cycle_resolve_texture(MemorySegment struct, boolean fieldValue) {
		struct.set(cycle_resolve_texture$LAYOUT, cycle_resolve_texture$OFFSET, fieldValue);
	}

	private static final OfByte padding1$LAYOUT = (OfByte) $LAYOUT.select(groupElement("padding1"));

	public static OfByte padding1$layout() {
		return padding1$LAYOUT;
	}

	private static final long padding1$OFFSET = $LAYOUT.byteOffset(groupElement("padding1"));

	public static long padding1$offset() {
		return padding1$OFFSET;
	}

	public static byte padding1(MemorySegment struct) {
		return struct.get(padding1$LAYOUT, padding1$OFFSET);
	}

	public static void padding1(MemorySegment struct, byte fieldValue) {
		struct.set(padding1$LAYOUT, padding1$OFFSET, fieldValue);
	}

	private static final OfByte padding2$LAYOUT = (OfByte) $LAYOUT.select(groupElement("padding2"));

	public static OfByte padding2$layout() {
		return padding2$LAYOUT;
	}

	private static final long padding2$OFFSET = $LAYOUT.byteOffset(groupElement("padding2"));

	public static long padding2$offset() {
		return padding2$OFFSET;
	}

	public static byte padding2(MemorySegment struct) {
		return struct.get(padding2$LAYOUT, padding2$OFFSET);
	}

	public static void padding2(MemorySegment struct, byte fieldValue) {
		struct.set(padding2$LAYOUT, padding2$OFFSET, fieldValue);
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
