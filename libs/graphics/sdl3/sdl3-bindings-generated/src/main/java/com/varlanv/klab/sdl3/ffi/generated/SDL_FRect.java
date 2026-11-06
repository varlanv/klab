package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfFloat;

public class SDL_FRect {

	SDL_FRect() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_FLOAT.withName("x"),
			SDL3.C_FLOAT.withName("y"),
			SDL3.C_FLOAT.withName("w"),
			SDL3.C_FLOAT.withName("h")
	).withName("SDL_FRect");

	public static GroupLayout layout() {
		return $LAYOUT;
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

	private static final OfFloat w$LAYOUT = (OfFloat) $LAYOUT.select(groupElement("w"));

	public static OfFloat w$layout() {
		return w$LAYOUT;
	}

	private static final long w$OFFSET = $LAYOUT.byteOffset(groupElement("w"));

	public static long w$offset() {
		return w$OFFSET;
	}

	public static float w(MemorySegment struct) {
		return struct.get(w$LAYOUT, w$OFFSET);
	}

	public static void w(MemorySegment struct, float fieldValue) {
		struct.set(w$LAYOUT, w$OFFSET, fieldValue);
	}

	private static final OfFloat h$LAYOUT = (OfFloat) $LAYOUT.select(groupElement("h"));

	public static OfFloat h$layout() {
		return h$LAYOUT;
	}

	private static final long h$OFFSET = $LAYOUT.byteOffset(groupElement("h"));

	public static long h$offset() {
		return h$OFFSET;
	}

	public static float h(MemorySegment struct) {
		return struct.get(h$LAYOUT, h$OFFSET);
	}

	public static void h(MemorySegment struct, float fieldValue) {
		struct.set(h$LAYOUT, h$OFFSET, fieldValue);
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
