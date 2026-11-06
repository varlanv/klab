package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

public class SDL_GPUColorTargetDescription {

	SDL_GPUColorTargetDescription() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("format"),
			SDL_GPUColorTargetBlendState.layout().withName("blend_state")
	).withName("SDL_GPUColorTargetDescription");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfInt format$LAYOUT = (OfInt) $LAYOUT.select(groupElement("format"));

	public static OfInt format$layout() {
		return format$LAYOUT;
	}

	private static final long format$OFFSET = $LAYOUT.byteOffset(groupElement("format"));

	public static long format$offset() {
		return format$OFFSET;
	}

	public static int format(MemorySegment struct) {
		return struct.get(format$LAYOUT, format$OFFSET);
	}

	public static void format(MemorySegment struct, int fieldValue) {
		struct.set(format$LAYOUT, format$OFFSET, fieldValue);
	}

	private static final GroupLayout blend_state$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("blend_state"));

	public static GroupLayout blend_state$layout() {
		return blend_state$LAYOUT;
	}

	private static final long blend_state$OFFSET = $LAYOUT.byteOffset(groupElement("blend_state"));

	public static long blend_state$offset() {
		return blend_state$OFFSET;
	}

	public static MemorySegment blend_state(MemorySegment struct) {
		return struct.asSlice(blend_state$OFFSET, blend_state$LAYOUT.byteSize());
	}

	public static void blend_state(MemorySegment struct, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, struct, blend_state$OFFSET, blend_state$LAYOUT.byteSize());
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
