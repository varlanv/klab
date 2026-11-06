package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.*;

public class SDL_GPUDepthStencilState {

	SDL_GPUDepthStencilState() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("compare_op"),
			SDL_GPUStencilOpState.layout().withName("back_stencil_state"),
			SDL_GPUStencilOpState.layout().withName("front_stencil_state"),
			SDL3.C_CHAR.withName("compare_mask"),
			SDL3.C_CHAR.withName("write_mask"),
			SDL3.C_BOOL.withName("enable_depth_test"),
			SDL3.C_BOOL.withName("enable_depth_write"),
			SDL3.C_BOOL.withName("enable_stencil_test"),
			SDL3.C_CHAR.withName("padding1"),
			SDL3.C_CHAR.withName("padding2"),
			SDL3.C_CHAR.withName("padding3")
	).withName("SDL_GPUDepthStencilState");

	public static GroupLayout layout() {
		return $LAYOUT;
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

	private static final GroupLayout back_stencil_state$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("back_stencil_state"));

	public static GroupLayout back_stencil_state$layout() {
		return back_stencil_state$LAYOUT;
	}

	private static final long back_stencil_state$OFFSET = $LAYOUT.byteOffset(groupElement("back_stencil_state"));

	public static long back_stencil_state$offset() {
		return back_stencil_state$OFFSET;
	}

	public static MemorySegment back_stencil_state(MemorySegment struct) {
		return struct.asSlice(back_stencil_state$OFFSET, back_stencil_state$LAYOUT.byteSize());
	}

	public static void back_stencil_state(MemorySegment struct, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, struct, back_stencil_state$OFFSET, back_stencil_state$LAYOUT.byteSize());
	}

	private static final GroupLayout front_stencil_state$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("front_stencil_state"));

	public static GroupLayout front_stencil_state$layout() {
		return front_stencil_state$LAYOUT;
	}

	private static final long front_stencil_state$OFFSET = $LAYOUT.byteOffset(groupElement("front_stencil_state"));

	public static long front_stencil_state$offset() {
		return front_stencil_state$OFFSET;
	}

	public static MemorySegment front_stencil_state(MemorySegment struct) {
		return struct.asSlice(front_stencil_state$OFFSET, front_stencil_state$LAYOUT.byteSize());
	}

	public static void front_stencil_state(MemorySegment struct, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, struct, front_stencil_state$OFFSET, front_stencil_state$LAYOUT.byteSize());
	}

	private static final OfByte compare_mask$LAYOUT = (OfByte) $LAYOUT.select(groupElement("compare_mask"));

	public static OfByte compare_mask$layout() {
		return compare_mask$LAYOUT;
	}

	private static final long compare_mask$OFFSET = $LAYOUT.byteOffset(groupElement("compare_mask"));

	public static long compare_mask$offset() {
		return compare_mask$OFFSET;
	}

	public static byte compare_mask(MemorySegment struct) {
		return struct.get(compare_mask$LAYOUT, compare_mask$OFFSET);
	}

	public static void compare_mask(MemorySegment struct, byte fieldValue) {
		struct.set(compare_mask$LAYOUT, compare_mask$OFFSET, fieldValue);
	}

	private static final OfByte write_mask$LAYOUT = (OfByte) $LAYOUT.select(groupElement("write_mask"));

	public static OfByte write_mask$layout() {
		return write_mask$LAYOUT;
	}

	private static final long write_mask$OFFSET = $LAYOUT.byteOffset(groupElement("write_mask"));

	public static long write_mask$offset() {
		return write_mask$OFFSET;
	}

	public static byte write_mask(MemorySegment struct) {
		return struct.get(write_mask$LAYOUT, write_mask$OFFSET);
	}

	public static void write_mask(MemorySegment struct, byte fieldValue) {
		struct.set(write_mask$LAYOUT, write_mask$OFFSET, fieldValue);
	}

	private static final OfBoolean enable_depth_test$LAYOUT = (OfBoolean) $LAYOUT.select(groupElement("enable_depth_test"));

	public static OfBoolean enable_depth_test$layout() {
		return enable_depth_test$LAYOUT;
	}

	private static final long enable_depth_test$OFFSET = $LAYOUT.byteOffset(groupElement("enable_depth_test"));

	public static long enable_depth_test$offset() {
		return enable_depth_test$OFFSET;
	}

	public static boolean enable_depth_test(MemorySegment struct) {
		return struct.get(enable_depth_test$LAYOUT, enable_depth_test$OFFSET);
	}

	public static void enable_depth_test(MemorySegment struct, boolean fieldValue) {
		struct.set(enable_depth_test$LAYOUT, enable_depth_test$OFFSET, fieldValue);
	}

	private static final OfBoolean enable_depth_write$LAYOUT = (OfBoolean) $LAYOUT.select(groupElement("enable_depth_write"));

	public static OfBoolean enable_depth_write$layout() {
		return enable_depth_write$LAYOUT;
	}

	private static final long enable_depth_write$OFFSET = $LAYOUT.byteOffset(groupElement("enable_depth_write"));

	public static long enable_depth_write$offset() {
		return enable_depth_write$OFFSET;
	}

	public static boolean enable_depth_write(MemorySegment struct) {
		return struct.get(enable_depth_write$LAYOUT, enable_depth_write$OFFSET);
	}

	public static void enable_depth_write(MemorySegment struct, boolean fieldValue) {
		struct.set(enable_depth_write$LAYOUT, enable_depth_write$OFFSET, fieldValue);
	}

	private static final OfBoolean enable_stencil_test$LAYOUT = (OfBoolean) $LAYOUT.select(groupElement("enable_stencil_test"));

	public static OfBoolean enable_stencil_test$layout() {
		return enable_stencil_test$LAYOUT;
	}

	private static final long enable_stencil_test$OFFSET = $LAYOUT.byteOffset(groupElement("enable_stencil_test"));

	public static long enable_stencil_test$offset() {
		return enable_stencil_test$OFFSET;
	}

	public static boolean enable_stencil_test(MemorySegment struct) {
		return struct.get(enable_stencil_test$LAYOUT, enable_stencil_test$OFFSET);
	}

	public static void enable_stencil_test(MemorySegment struct, boolean fieldValue) {
		struct.set(enable_stencil_test$LAYOUT, enable_stencil_test$OFFSET, fieldValue);
	}

	private static final OfByte padding1$LAYOUT = (OfByte) $LAYOUT.select(groupElement("padding1"));

	public static OfByte padding1$layout() {
		return padding1$LAYOUT;
	}

	private static final long padding1$OFFSET = $LAYOUT.byteOffset(groupElement("padding1"));

	public static long padding1$offset() {
		return padding1$OFFSET;
	}

	public static byte padding1(MemorySegment struct) {
		return struct.get(padding1$LAYOUT, padding1$OFFSET);
	}

	public static void padding1(MemorySegment struct, byte fieldValue) {
		struct.set(padding1$LAYOUT, padding1$OFFSET, fieldValue);
	}

	private static final OfByte padding2$LAYOUT = (OfByte) $LAYOUT.select(groupElement("padding2"));

	public static OfByte padding2$layout() {
		return padding2$LAYOUT;
	}

	private static final long padding2$OFFSET = $LAYOUT.byteOffset(groupElement("padding2"));

	public static long padding2$offset() {
		return padding2$OFFSET;
	}

	public static byte padding2(MemorySegment struct) {
		return struct.get(padding2$LAYOUT, padding2$OFFSET);
	}

	public static void padding2(MemorySegment struct, byte fieldValue) {
		struct.set(padding2$LAYOUT, padding2$OFFSET, fieldValue);
	}

	private static final OfByte padding3$LAYOUT = (OfByte) $LAYOUT.select(groupElement("padding3"));

	public static OfByte padding3$layout() {
		return padding3$LAYOUT;
	}

	private static final long padding3$OFFSET = $LAYOUT.byteOffset(groupElement("padding3"));

	public static long padding3$offset() {
		return padding3$OFFSET;
	}

	public static byte padding3(MemorySegment struct) {
		return struct.get(padding3$LAYOUT, padding3$OFFSET);
	}

	public static void padding3(MemorySegment struct, byte fieldValue) {
		struct.set(padding3$LAYOUT, padding3$OFFSET, fieldValue);
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
