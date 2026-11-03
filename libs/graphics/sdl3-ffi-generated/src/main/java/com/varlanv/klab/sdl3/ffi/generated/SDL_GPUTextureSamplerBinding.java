package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;

public class SDL_GPUTextureSamplerBinding {

	SDL_GPUTextureSamplerBinding() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_POINTER.withName("texture"),
			SDL3.C_POINTER.withName("sampler")
	).withName("SDL_GPUTextureSamplerBinding");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final AddressLayout texture$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("texture"));

	public static AddressLayout texture$layout() {
		return texture$LAYOUT;
	}

	private static final long texture$OFFSET = $LAYOUT.byteOffset(groupElement("texture"));

	public static long texture$offset() {
		return texture$OFFSET;
	}

	public static MemorySegment texture(MemorySegment struct) {
		return struct.get(texture$LAYOUT, texture$OFFSET);
	}

	public static void texture(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(texture$LAYOUT, texture$OFFSET, fieldValue);
	}

	private static final AddressLayout sampler$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("sampler"));

	public static AddressLayout sampler$layout() {
		return sampler$LAYOUT;
	}

	private static final long sampler$OFFSET = $LAYOUT.byteOffset(groupElement("sampler"));

	public static long sampler$offset() {
		return sampler$OFFSET;
	}

	public static MemorySegment sampler(MemorySegment struct) {
		return struct.get(sampler$LAYOUT, sampler$OFFSET);
	}

	public static void sampler(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(sampler$LAYOUT, sampler$OFFSET, fieldValue);
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
