package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;

public class SDL_DialogFileFilter {

	SDL_DialogFileFilter() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_POINTER.withName("name"),
			SDL3.C_POINTER.withName("pattern")
	).withName("SDL_DialogFileFilter");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final AddressLayout name$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("name"));

	public static AddressLayout name$layout() {
		return name$LAYOUT;
	}

	private static final long name$OFFSET = $LAYOUT.byteOffset(groupElement("name"));

	public static long name$offset() {
		return name$OFFSET;
	}

	public static MemorySegment name(MemorySegment struct) {
		return struct.get(name$LAYOUT, name$OFFSET);
	}

	public static void name(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(name$LAYOUT, name$OFFSET, fieldValue);
	}

	private static final AddressLayout pattern$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("pattern"));

	public static AddressLayout pattern$layout() {
		return pattern$LAYOUT;
	}

	private static final long pattern$OFFSET = $LAYOUT.byteOffset(groupElement("pattern"));

	public static long pattern$offset() {
		return pattern$OFFSET;
	}

	public static MemorySegment pattern(MemorySegment struct) {
		return struct.get(pattern$LAYOUT, pattern$OFFSET);
	}

	public static void pattern(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(pattern$LAYOUT, pattern$OFFSET, fieldValue);
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
