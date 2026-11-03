package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.*;

public class SDL_GPUBlitInfo {

	SDL_GPUBlitInfo() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL_GPUBlitRegion.layout().withName("source"),
			SDL_GPUBlitRegion.layout().withName("destination"),
			SDL3.C_INT.withName("load_op"),
			SDL_FColor.layout().withName("clear_color"),
			SDL3.C_INT.withName("flip_mode"),
			SDL3.C_INT.withName("filter"),
			SDL3.C_BOOL.withName("cycle"),
			SDL3.C_CHAR.withName("padding1"),
			SDL3.C_CHAR.withName("padding2"),
			SDL3.C_CHAR.withName("padding3")
	).withName("SDL_GPUBlitInfo");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final GroupLayout source$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("source"));

	public static GroupLayout source$layout() {
		return source$LAYOUT;
	}

	private static final long source$OFFSET = $LAYOUT.byteOffset(groupElement("source"));

	public static long source$offset() {
		return source$OFFSET;
	}

	public static MemorySegment source(MemorySegment struct) {
		return struct.asSlice(source$OFFSET, source$LAYOUT.byteSize());
	}

	public static void source(MemorySegment struct, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, struct, source$OFFSET, source$LAYOUT.byteSize());
	}

	private static final GroupLayout destination$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("destination"));

	public static GroupLayout destination$layout() {
		return destination$LAYOUT;
	}

	private static final long destination$OFFSET = $LAYOUT.byteOffset(groupElement("destination"));

	public static long destination$offset() {
		return destination$OFFSET;
	}

	public static MemorySegment destination(MemorySegment struct) {
		return struct.asSlice(destination$OFFSET, destination$LAYOUT.byteSize());
	}

	public static void destination(MemorySegment struct, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, struct, destination$OFFSET, destination$LAYOUT.byteSize());
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

	private static final OfInt flip_mode$LAYOUT = (OfInt) $LAYOUT.select(groupElement("flip_mode"));

	public static OfInt flip_mode$layout() {
		return flip_mode$LAYOUT;
	}

	private static final long flip_mode$OFFSET = $LAYOUT.byteOffset(groupElement("flip_mode"));

	public static long flip_mode$offset() {
		return flip_mode$OFFSET;
	}

	public static int flip_mode(MemorySegment struct) {
		return struct.get(flip_mode$LAYOUT, flip_mode$OFFSET);
	}

	public static void flip_mode(MemorySegment struct, int fieldValue) {
		struct.set(flip_mode$LAYOUT, flip_mode$OFFSET, fieldValue);
	}

	private static final OfInt filter$LAYOUT = (OfInt) $LAYOUT.select(groupElement("filter"));

	public static OfInt filter$layout() {
		return filter$LAYOUT;
	}

	private static final long filter$OFFSET = $LAYOUT.byteOffset(groupElement("filter"));

	public static long filter$offset() {
		return filter$OFFSET;
	}

	public static int filter(MemorySegment struct) {
		return struct.get(filter$LAYOUT, filter$OFFSET);
	}

	public static void filter(MemorySegment struct, int fieldValue) {
		struct.set(filter$LAYOUT, filter$OFFSET, fieldValue);
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

	private static final OfByte padding3$LAYOUT = (OfByte) $LAYOUT.select(groupElement("padding3"));

	public static OfByte padding3$layout() {
		return padding3$LAYOUT;
	}

	private static final long padding3$OFFSET = $LAYOUT.byteOffset(groupElement("padding3"));

	public static long padding3$offset() {
		return padding3$OFFSET;
	}

	public static byte padding3(MemorySegment struct) {
		return struct.get(padding3$LAYOUT, padding3$OFFSET);
	}

	public static void padding3(MemorySegment struct, byte fieldValue) {
		struct.set(padding3$LAYOUT, padding3$OFFSET, fieldValue);
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
