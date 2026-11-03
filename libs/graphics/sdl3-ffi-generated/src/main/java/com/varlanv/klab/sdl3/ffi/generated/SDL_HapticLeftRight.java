package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.OfShort;

public class SDL_HapticLeftRight {

	SDL_HapticLeftRight() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_SHORT.withName("type"),
			MemoryLayout.paddingLayout(2),
			SDL3.C_INT.withName("length"),
			SDL3.C_SHORT.withName("large_magnitude"),
			SDL3.C_SHORT.withName("small_magnitude")
	).withName("SDL_HapticLeftRight");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfShort type$LAYOUT = (OfShort) $LAYOUT.select(groupElement("type"));

	public static OfShort type$layout() {
		return type$LAYOUT;
	}

	private static final long type$OFFSET = $LAYOUT.byteOffset(groupElement("type"));

	public static long type$offset() {
		return type$OFFSET;
	}

	public static short type(MemorySegment struct) {
		return struct.get(type$LAYOUT, type$OFFSET);
	}

	public static void type(MemorySegment struct, short fieldValue) {
		struct.set(type$LAYOUT, type$OFFSET, fieldValue);
	}

	private static final OfInt length$LAYOUT = (OfInt) $LAYOUT.select(groupElement("length"));

	public static OfInt length$layout() {
		return length$LAYOUT;
	}

	private static final long length$OFFSET = $LAYOUT.byteOffset(groupElement("length"));

	public static long length$offset() {
		return length$OFFSET;
	}

	public static int length(MemorySegment struct) {
		return struct.get(length$LAYOUT, length$OFFSET);
	}

	public static void length(MemorySegment struct, int fieldValue) {
		struct.set(length$LAYOUT, length$OFFSET, fieldValue);
	}

	private static final OfShort large_magnitude$LAYOUT = (OfShort) $LAYOUT.select(groupElement("large_magnitude"));

	public static OfShort large_magnitude$layout() {
		return large_magnitude$LAYOUT;
	}

	private static final long large_magnitude$OFFSET = $LAYOUT.byteOffset(groupElement("large_magnitude"));

	public static long large_magnitude$offset() {
		return large_magnitude$OFFSET;
	}

	public static short large_magnitude(MemorySegment struct) {
		return struct.get(large_magnitude$LAYOUT, large_magnitude$OFFSET);
	}

	public static void large_magnitude(MemorySegment struct, short fieldValue) {
		struct.set(large_magnitude$LAYOUT, large_magnitude$OFFSET, fieldValue);
	}

	private static final OfShort small_magnitude$LAYOUT = (OfShort) $LAYOUT.select(groupElement("small_magnitude"));

	public static OfShort small_magnitude$layout() {
		return small_magnitude$LAYOUT;
	}

	private static final long small_magnitude$OFFSET = $LAYOUT.byteOffset(groupElement("small_magnitude"));

	public static long small_magnitude$offset() {
		return small_magnitude$OFFSET;
	}

	public static short small_magnitude(MemorySegment struct) {
		return struct.get(small_magnitude$LAYOUT, small_magnitude$OFFSET);
	}

	public static void small_magnitude(MemorySegment struct, short fieldValue) {
		struct.set(small_magnitude$LAYOUT, small_magnitude$OFFSET, fieldValue);
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
