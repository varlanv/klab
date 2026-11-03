package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfByte;

public class SDL_alignment_test {

	SDL_alignment_test() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_CHAR.withName("a"),
			MemoryLayout.paddingLayout(7),
			SDL3.C_POINTER.withName("b")
	).withName("SDL_alignment_test");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfByte a$LAYOUT = (OfByte) $LAYOUT.select(groupElement("a"));

	public static OfByte a$layout() {
		return a$LAYOUT;
	}

	private static final long a$OFFSET = $LAYOUT.byteOffset(groupElement("a"));

	public static long a$offset() {
		return a$OFFSET;
	}

	public static byte a(MemorySegment struct) {
		return struct.get(a$LAYOUT, a$OFFSET);
	}

	public static void a(MemorySegment struct, byte fieldValue) {
		struct.set(a$LAYOUT, a$OFFSET, fieldValue);
	}

	private static final AddressLayout b$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("b"));

	public static AddressLayout b$layout() {
		return b$LAYOUT;
	}

	private static final long b$OFFSET = $LAYOUT.byteOffset(groupElement("b"));

	public static long b$offset() {
		return b$OFFSET;
	}

	public static MemorySegment b(MemorySegment struct) {
		return struct.get(b$LAYOUT, b$OFFSET);
	}

	public static void b(MemorySegment struct, MemorySegment fieldValue) {
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
