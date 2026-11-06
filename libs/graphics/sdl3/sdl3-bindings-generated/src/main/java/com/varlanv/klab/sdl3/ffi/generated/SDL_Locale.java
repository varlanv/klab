package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;

public class SDL_Locale {

	SDL_Locale() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_POINTER.withName("language"),
			SDL3.C_POINTER.withName("country")
	).withName("SDL_Locale");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final AddressLayout language$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("language"));

	public static AddressLayout language$layout() {
		return language$LAYOUT;
	}

	private static final long language$OFFSET = $LAYOUT.byteOffset(groupElement("language"));

	public static long language$offset() {
		return language$OFFSET;
	}

	public static MemorySegment language(MemorySegment struct) {
		return struct.get(language$LAYOUT, language$OFFSET);
	}

	public static void language(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(language$LAYOUT, language$OFFSET, fieldValue);
	}

	private static final AddressLayout country$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("country"));

	public static AddressLayout country$layout() {
		return country$LAYOUT;
	}

	private static final long country$OFFSET = $LAYOUT.byteOffset(groupElement("country"));

	public static long country$offset() {
		return country$OFFSET;
	}

	public static MemorySegment country(MemorySegment struct) {
		return struct.get(country$LAYOUT, country$OFFSET);
	}

	public static void country(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(country$LAYOUT, country$OFFSET, fieldValue);
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
