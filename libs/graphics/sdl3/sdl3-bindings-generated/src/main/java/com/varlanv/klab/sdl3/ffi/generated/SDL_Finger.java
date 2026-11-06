package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfFloat;
import static java.lang.foreign.ValueLayout.OfLong;

public class SDL_Finger {

	SDL_Finger() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_LONG.withName("id"),
			SDL3.C_FLOAT.withName("x"),
			SDL3.C_FLOAT.withName("y"),
			SDL3.C_FLOAT.withName("pressure"),
			MemoryLayout.paddingLayout(4)
	).withName("SDL_Finger");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfLong id$LAYOUT = (OfLong) $LAYOUT.select(groupElement("id"));

	public static OfLong id$layout() {
		return id$LAYOUT;
	}

	private static final long id$OFFSET = $LAYOUT.byteOffset(groupElement("id"));

	public static long id$offset() {
		return id$OFFSET;
	}

	public static long id(MemorySegment struct) {
		return struct.get(id$LAYOUT, id$OFFSET);
	}

	public static void id(MemorySegment struct, long fieldValue) {
		struct.set(id$LAYOUT, id$OFFSET, fieldValue);
	}

	private static final OfFloat x$LAYOUT = (OfFloat) $LAYOUT.select(groupElement("x"));

	public static OfFloat x$layout() {
		return x$LAYOUT;
	}

	private static final long x$OFFSET = $LAYOUT.byteOffset(groupElement("x"));

	public static long x$offset() {
		return x$OFFSET;
	}

	public static float x(MemorySegment struct) {
		return struct.get(x$LAYOUT, x$OFFSET);
	}

	public static void x(MemorySegment struct, float fieldValue) {
		struct.set(x$LAYOUT, x$OFFSET, fieldValue);
	}

	private static final OfFloat y$LAYOUT = (OfFloat) $LAYOUT.select(groupElement("y"));

	public static OfFloat y$layout() {
		return y$LAYOUT;
	}

	private static final long y$OFFSET = $LAYOUT.byteOffset(groupElement("y"));

	public static long y$offset() {
		return y$OFFSET;
	}

	public static float y(MemorySegment struct) {
		return struct.get(y$LAYOUT, y$OFFSET);
	}

	public static void y(MemorySegment struct, float fieldValue) {
		struct.set(y$LAYOUT, y$OFFSET, fieldValue);
	}

	private static final OfFloat pressure$LAYOUT = (OfFloat) $LAYOUT.select(groupElement("pressure"));

	public static OfFloat pressure$layout() {
		return pressure$LAYOUT;
	}

	private static final long pressure$OFFSET = $LAYOUT.byteOffset(groupElement("pressure"));

	public static long pressure$offset() {
		return pressure$OFFSET;
	}

	public static float pressure(MemorySegment struct) {
		return struct.get(pressure$LAYOUT, pressure$OFFSET);
	}

	public static void pressure(MemorySegment struct, float fieldValue) {
		struct.set(pressure$LAYOUT, pressure$OFFSET, fieldValue);
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
