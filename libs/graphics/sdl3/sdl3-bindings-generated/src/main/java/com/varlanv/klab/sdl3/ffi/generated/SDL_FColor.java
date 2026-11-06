package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfFloat;

public class SDL_FColor {

	SDL_FColor() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_FLOAT.withName("r"),
			SDL3.C_FLOAT.withName("g"),
			SDL3.C_FLOAT.withName("b"),
			SDL3.C_FLOAT.withName("a")
	).withName("SDL_FColor");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfFloat r$LAYOUT = (OfFloat) $LAYOUT.select(groupElement("r"));

	public static OfFloat r$layout() {
		return r$LAYOUT;
	}

	private static final long r$OFFSET = $LAYOUT.byteOffset(groupElement("r"));

	public static long r$offset() {
		return r$OFFSET;
	}

	public static float r(MemorySegment struct) {
		return struct.get(r$LAYOUT, r$OFFSET);
	}

	public static void r(MemorySegment struct, float fieldValue) {
		struct.set(r$LAYOUT, r$OFFSET, fieldValue);
	}

	private static final OfFloat g$LAYOUT = (OfFloat) $LAYOUT.select(groupElement("g"));

	public static OfFloat g$layout() {
		return g$LAYOUT;
	}

	private static final long g$OFFSET = $LAYOUT.byteOffset(groupElement("g"));

	public static long g$offset() {
		return g$OFFSET;
	}

	public static float g(MemorySegment struct) {
		return struct.get(g$LAYOUT, g$OFFSET);
	}

	public static void g(MemorySegment struct, float fieldValue) {
		struct.set(g$LAYOUT, g$OFFSET, fieldValue);
	}

	private static final OfFloat b$LAYOUT = (OfFloat) $LAYOUT.select(groupElement("b"));

	public static OfFloat b$layout() {
		return b$LAYOUT;
	}

	private static final long b$OFFSET = $LAYOUT.byteOffset(groupElement("b"));

	public static long b$offset() {
		return b$OFFSET;
	}

	public static float b(MemorySegment struct) {
		return struct.get(b$LAYOUT, b$OFFSET);
	}

	public static void b(MemorySegment struct, float fieldValue) {
		struct.set(b$LAYOUT, b$OFFSET, fieldValue);
	}

	private static final OfFloat a$LAYOUT = (OfFloat) $LAYOUT.select(groupElement("a"));

	public static OfFloat a$layout() {
		return a$LAYOUT;
	}

	private static final long a$OFFSET = $LAYOUT.byteOffset(groupElement("a"));

	public static long a$offset() {
		return a$OFFSET;
	}

	public static float a(MemorySegment struct) {
		return struct.get(a$LAYOUT, a$OFFSET);
	}

	public static void a(MemorySegment struct, float fieldValue) {
		struct.set(a$LAYOUT, a$OFFSET, fieldValue);
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
