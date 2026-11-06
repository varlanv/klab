package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

public class SDL_GPUStencilOpState {

	SDL_GPUStencilOpState() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("fail_op"),
			SDL3.C_INT.withName("pass_op"),
			SDL3.C_INT.withName("depth_fail_op"),
			SDL3.C_INT.withName("compare_op")
	).withName("SDL_GPUStencilOpState");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfInt fail_op$LAYOUT = (OfInt) $LAYOUT.select(groupElement("fail_op"));

	public static OfInt fail_op$layout() {
		return fail_op$LAYOUT;
	}

	private static final long fail_op$OFFSET = $LAYOUT.byteOffset(groupElement("fail_op"));

	public static long fail_op$offset() {
		return fail_op$OFFSET;
	}

	public static int fail_op(MemorySegment struct) {
		return struct.get(fail_op$LAYOUT, fail_op$OFFSET);
	}

	public static void fail_op(MemorySegment struct, int fieldValue) {
		struct.set(fail_op$LAYOUT, fail_op$OFFSET, fieldValue);
	}

	private static final OfInt pass_op$LAYOUT = (OfInt) $LAYOUT.select(groupElement("pass_op"));

	public static OfInt pass_op$layout() {
		return pass_op$LAYOUT;
	}

	private static final long pass_op$OFFSET = $LAYOUT.byteOffset(groupElement("pass_op"));

	public static long pass_op$offset() {
		return pass_op$OFFSET;
	}

	public static int pass_op(MemorySegment struct) {
		return struct.get(pass_op$LAYOUT, pass_op$OFFSET);
	}

	public static void pass_op(MemorySegment struct, int fieldValue) {
		struct.set(pass_op$LAYOUT, pass_op$OFFSET, fieldValue);
	}

	private static final OfInt depth_fail_op$LAYOUT = (OfInt) $LAYOUT.select(groupElement("depth_fail_op"));

	public static OfInt depth_fail_op$layout() {
		return depth_fail_op$LAYOUT;
	}

	private static final long depth_fail_op$OFFSET = $LAYOUT.byteOffset(groupElement("depth_fail_op"));

	public static long depth_fail_op$offset() {
		return depth_fail_op$OFFSET;
	}

	public static int depth_fail_op(MemorySegment struct) {
		return struct.get(depth_fail_op$LAYOUT, depth_fail_op$OFFSET);
	}

	public static void depth_fail_op(MemorySegment struct, int fieldValue) {
		struct.set(depth_fail_op$LAYOUT, depth_fail_op$OFFSET, fieldValue);
	}

	private static final OfInt compare_op$LAYOUT = (OfInt) $LAYOUT.select(groupElement("compare_op"));

	public static OfInt compare_op$layout() {
		return compare_op$LAYOUT;
	}

	private static final long compare_op$OFFSET = $LAYOUT.byteOffset(groupElement("compare_op"));

	public static long compare_op$offset() {
		return compare_op$OFFSET;
	}

	public static int compare_op(MemorySegment struct) {
		return struct.get(compare_op$LAYOUT, compare_op$OFFSET);
	}

	public static void compare_op(MemorySegment struct, int fieldValue) {
		struct.set(compare_op$LAYOUT, compare_op$OFFSET, fieldValue);
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
