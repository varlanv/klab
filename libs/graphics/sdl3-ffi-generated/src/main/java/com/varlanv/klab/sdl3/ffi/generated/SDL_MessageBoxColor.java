package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfByte;

public class SDL_MessageBoxColor {

	SDL_MessageBoxColor() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_CHAR.withName("r"),
			SDL3.C_CHAR.withName("g"),
			SDL3.C_CHAR.withName("b")
	).withName("SDL_MessageBoxColor");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfByte r$LAYOUT = (OfByte) $LAYOUT.select(groupElement("r"));

	public static OfByte r$layout() {
		return r$LAYOUT;
	}

	private static final long r$OFFSET = $LAYOUT.byteOffset(groupElement("r"));

	public static long r$offset() {
		return r$OFFSET;
	}

	public static byte r(MemorySegment struct) {
		return struct.get(r$LAYOUT, r$OFFSET);
	}

	public static void r(MemorySegment struct, byte fieldValue) {
		struct.set(r$LAYOUT, r$OFFSET, fieldValue);
	}

	private static final OfByte g$LAYOUT = (OfByte) $LAYOUT.select(groupElement("g"));

	public static OfByte g$layout() {
		return g$LAYOUT;
	}

	private static final long g$OFFSET = $LAYOUT.byteOffset(groupElement("g"));

	public static long g$offset() {
		return g$OFFSET;
	}

	public static byte g(MemorySegment struct) {
		return struct.get(g$LAYOUT, g$OFFSET);
	}

	public static void g(MemorySegment struct, byte fieldValue) {
		struct.set(g$LAYOUT, g$OFFSET, fieldValue);
	}

	private static final OfByte b$LAYOUT = (OfByte) $LAYOUT.select(groupElement("b"));

	public static OfByte b$layout() {
		return b$LAYOUT;
	}

	private static final long b$OFFSET = $LAYOUT.byteOffset(groupElement("b"));

	public static long b$offset() {
		return b$OFFSET;
	}

	public static byte b(MemorySegment struct) {
		return struct.get(b$LAYOUT, b$OFFSET);
	}

	public static void b(MemorySegment struct, byte fieldValue) {
		struct.set(b$LAYOUT, b$OFFSET, fieldValue);
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
