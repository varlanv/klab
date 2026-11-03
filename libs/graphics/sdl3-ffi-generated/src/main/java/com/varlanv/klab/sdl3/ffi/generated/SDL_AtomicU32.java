package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

public class SDL_AtomicU32 {

	SDL_AtomicU32() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("value")
	).withName("SDL_AtomicU32");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfInt value$LAYOUT = (OfInt) $LAYOUT.select(groupElement("value"));

	public static OfInt value$layout() {
		return value$LAYOUT;
	}

	private static final long value$OFFSET = $LAYOUT.byteOffset(groupElement("value"));

	public static long value$offset() {
		return value$OFFSET;
	}

	public static int value(MemorySegment struct) {
		return struct.get(value$LAYOUT, value$OFFSET);
	}

	public static void value(MemorySegment struct, int fieldValue) {
		struct.set(value$LAYOUT, value$OFFSET, fieldValue);
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
