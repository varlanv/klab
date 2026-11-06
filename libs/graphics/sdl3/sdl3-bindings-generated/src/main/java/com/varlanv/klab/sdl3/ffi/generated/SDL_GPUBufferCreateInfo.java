package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

public class SDL_GPUBufferCreateInfo {

	SDL_GPUBufferCreateInfo() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("usage"),
			SDL3.C_INT.withName("size"),
			SDL3.C_INT.withName("props")
	).withName("SDL_GPUBufferCreateInfo");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfInt usage$LAYOUT = (OfInt) $LAYOUT.select(groupElement("usage"));

	public static OfInt usage$layout() {
		return usage$LAYOUT;
	}

	private static final long usage$OFFSET = $LAYOUT.byteOffset(groupElement("usage"));

	public static long usage$offset() {
		return usage$OFFSET;
	}

	public static int usage(MemorySegment struct) {
		return struct.get(usage$LAYOUT, usage$OFFSET);
	}

	public static void usage(MemorySegment struct, int fieldValue) {
		struct.set(usage$LAYOUT, usage$OFFSET, fieldValue);
	}

	private static final OfInt size$LAYOUT = (OfInt) $LAYOUT.select(groupElement("size"));

	public static OfInt size$layout() {
		return size$LAYOUT;
	}

	private static final long size$OFFSET = $LAYOUT.byteOffset(groupElement("size"));

	public static long size$offset() {
		return size$OFFSET;
	}

	public static int size(MemorySegment struct) {
		return struct.get(size$LAYOUT, size$OFFSET);
	}

	public static void size(MemorySegment struct, int fieldValue) {
		struct.set(size$LAYOUT, size$OFFSET, fieldValue);
	}

	private static final OfInt props$LAYOUT = (OfInt) $LAYOUT.select(groupElement("props"));

	public static OfInt props$layout() {
		return props$LAYOUT;
	}

	private static final long props$OFFSET = $LAYOUT.byteOffset(groupElement("props"));

	public static long props$offset() {
		return props$OFFSET;
	}

	public static int props(MemorySegment struct) {
		return struct.get(props$LAYOUT, props$OFFSET);
	}

	public static void props(MemorySegment struct, int fieldValue) {
		struct.set(props$LAYOUT, props$OFFSET, fieldValue);
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
