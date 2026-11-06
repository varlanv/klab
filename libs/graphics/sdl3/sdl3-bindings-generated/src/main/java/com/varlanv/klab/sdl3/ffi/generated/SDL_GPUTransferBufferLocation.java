package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

public class SDL_GPUTransferBufferLocation {

	SDL_GPUTransferBufferLocation() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_POINTER.withName("transfer_buffer"),
			SDL3.C_INT.withName("offset"),
			MemoryLayout.paddingLayout(4)
	).withName("SDL_GPUTransferBufferLocation");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final AddressLayout transfer_buffer$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("transfer_buffer"));

	public static AddressLayout transfer_buffer$layout() {
		return transfer_buffer$LAYOUT;
	}

	private static final long transfer_buffer$OFFSET = $LAYOUT.byteOffset(groupElement("transfer_buffer"));

	public static long transfer_buffer$offset() {
		return transfer_buffer$OFFSET;
	}

	public static MemorySegment transfer_buffer(MemorySegment struct) {
		return struct.get(transfer_buffer$LAYOUT, transfer_buffer$OFFSET);
	}

	public static void transfer_buffer(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(transfer_buffer$LAYOUT, transfer_buffer$OFFSET, fieldValue);
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
