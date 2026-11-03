package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

public class SDL_CursorFrameInfo {

	SDL_CursorFrameInfo() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_POINTER.withName("surface"),
			SDL3.C_INT.withName("duration"),
			MemoryLayout.paddingLayout(4)
	).withName("SDL_CursorFrameInfo");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final AddressLayout surface$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("surface"));

	public static AddressLayout surface$layout() {
		return surface$LAYOUT;
	}

	private static final long surface$OFFSET = $LAYOUT.byteOffset(groupElement("surface"));

	public static long surface$offset() {
		return surface$OFFSET;
	}

	public static MemorySegment surface(MemorySegment struct) {
		return struct.get(surface$LAYOUT, surface$OFFSET);
	}

	public static void surface(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(surface$LAYOUT, surface$OFFSET, fieldValue);
	}

	private static final OfInt duration$LAYOUT = (OfInt) $LAYOUT.select(groupElement("duration"));

	public static OfInt duration$layout() {
		return duration$LAYOUT;
	}

	private static final long duration$OFFSET = $LAYOUT.byteOffset(groupElement("duration"));

	public static long duration$offset() {
		return duration$OFFSET;
	}

	public static int duration(MemorySegment struct) {
		return struct.get(duration$LAYOUT, duration$OFFSET);
	}

	public static void duration(MemorySegment struct, int fieldValue) {
		struct.set(duration$LAYOUT, duration$OFFSET, fieldValue);
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
