package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

public class SDL_GPUBufferRegion {

	SDL_GPUBufferRegion() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_POINTER.withName("buffer"),
			SDL3.C_INT.withName("offset"),
			SDL3.C_INT.withName("size")
	).withName("SDL_GPUBufferRegion");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final AddressLayout buffer$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("buffer"));

	public static AddressLayout buffer$layout() {
		return buffer$LAYOUT;
	}

	private static final long buffer$OFFSET = $LAYOUT.byteOffset(groupElement("buffer"));

	public static long buffer$offset() {
		return buffer$OFFSET;
	}

	public static MemorySegment buffer(MemorySegment struct) {
		return struct.get(buffer$LAYOUT, buffer$OFFSET);
	}

	public static void buffer(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(buffer$LAYOUT, buffer$OFFSET, fieldValue);
	}

	private static final OfInt offset$LAYOUT = (OfInt) $LAYOUT.select(groupElement("offset"));

	public static OfInt offset$layout() {
		return offset$LAYOUT;
	}

	private static final long offset$OFFSET = $LAYOUT.byteOffset(groupElement("offset"));

	public static long offset$offset() {
		return offset$OFFSET;
	}

	public static int offset(MemorySegment struct) {
		return struct.get(offset$LAYOUT, offset$OFFSET);
	}

	public static void offset(MemorySegment struct, int fieldValue) {
		struct.set(offset$LAYOUT, offset$OFFSET, fieldValue);
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
