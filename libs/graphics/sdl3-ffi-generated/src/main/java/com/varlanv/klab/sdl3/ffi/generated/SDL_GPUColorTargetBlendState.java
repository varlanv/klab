package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.*;

public class SDL_GPUColorTargetBlendState {

	SDL_GPUColorTargetBlendState() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("src_color_blendfactor"),
			SDL3.C_INT.withName("dst_color_blendfactor"),
			SDL3.C_INT.withName("color_blend_op"),
			SDL3.C_INT.withName("src_alpha_blendfactor"),
			SDL3.C_INT.withName("dst_alpha_blendfactor"),
			SDL3.C_INT.withName("alpha_blend_op"),
			SDL3.C_CHAR.withName("color_write_mask"),
			SDL3.C_BOOL.withName("enable_blend"),
			SDL3.C_BOOL.withName("enable_color_write_mask"),
			SDL3.C_CHAR.withName("padding1"),
			SDL3.C_CHAR.withName("padding2"),
			MemoryLayout.paddingLayout(3)
	).withName("SDL_GPUColorTargetBlendState");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfInt src_color_blendfactor$LAYOUT = (OfInt) $LAYOUT.select(groupElement("src_color_blendfactor"));

	public static OfInt src_color_blendfactor$layout() {
		return src_color_blendfactor$LAYOUT;
	}

	private static final long src_color_blendfactor$OFFSET = $LAYOUT.byteOffset(groupElement("src_color_blendfactor"));

	public static long src_color_blendfactor$offset() {
		return src_color_blendfactor$OFFSET;
	}

	public static int src_color_blendfactor(MemorySegment struct) {
		return struct.get(src_color_blendfactor$LAYOUT, src_color_blendfactor$OFFSET);
	}

	public static void src_color_blendfactor(MemorySegment struct, int fieldValue) {
		struct.set(src_color_blendfactor$LAYOUT, src_color_blendfactor$OFFSET, fieldValue);
	}

	private static final OfInt dst_color_blendfactor$LAYOUT = (OfInt) $LAYOUT.select(groupElement("dst_color_blendfactor"));

	public static OfInt dst_color_blendfactor$layout() {
		return dst_color_blendfactor$LAYOUT;
	}

	private static final long dst_color_blendfactor$OFFSET = $LAYOUT.byteOffset(groupElement("dst_color_blendfactor"));

	public static long dst_color_blendfactor$offset() {
		return dst_color_blendfactor$OFFSET;
	}

	public static int dst_color_blendfactor(MemorySegment struct) {
		return struct.get(dst_color_blendfactor$LAYOUT, dst_color_blendfactor$OFFSET);
	}

	public static void dst_color_blendfactor(MemorySegment struct, int fieldValue) {
		struct.set(dst_color_blendfactor$LAYOUT, dst_color_blendfactor$OFFSET, fieldValue);
	}

	private static final OfInt color_blend_op$LAYOUT = (OfInt) $LAYOUT.select(groupElement("color_blend_op"));

	public static OfInt color_blend_op$layout() {
		return color_blend_op$LAYOUT;
	}

	private static final long color_blend_op$OFFSET = $LAYOUT.byteOffset(groupElement("color_blend_op"));

	public static long color_blend_op$offset() {
		return color_blend_op$OFFSET;
	}

	public static int color_blend_op(MemorySegment struct) {
		return struct.get(color_blend_op$LAYOUT, color_blend_op$OFFSET);
	}

	public static void color_blend_op(MemorySegment struct, int fieldValue) {
		struct.set(color_blend_op$LAYOUT, color_blend_op$OFFSET, fieldValue);
	}

	private static final OfInt src_alpha_blendfactor$LAYOUT = (OfInt) $LAYOUT.select(groupElement("src_alpha_blendfactor"));

	public static OfInt src_alpha_blendfactor$layout() {
		return src_alpha_blendfactor$LAYOUT;
	}

	private static final long src_alpha_blendfactor$OFFSET = $LAYOUT.byteOffset(groupElement("src_alpha_blendfactor"));

	public static long src_alpha_blendfactor$offset() {
		return src_alpha_blendfactor$OFFSET;
	}

	public static int src_alpha_blendfactor(MemorySegment struct) {
		return struct.get(src_alpha_blendfactor$LAYOUT, src_alpha_blendfactor$OFFSET);
	}

	public static void src_alpha_blendfactor(MemorySegment struct, int fieldValue) {
		struct.set(src_alpha_blendfactor$LAYOUT, src_alpha_blendfactor$OFFSET, fieldValue);
	}

	private static final OfInt dst_alpha_blendfactor$LAYOUT = (OfInt) $LAYOUT.select(groupElement("dst_alpha_blendfactor"));

	public static OfInt dst_alpha_blendfactor$layout() {
		return dst_alpha_blendfactor$LAYOUT;
	}

	private static final long dst_alpha_blendfactor$OFFSET = $LAYOUT.byteOffset(groupElement("dst_alpha_blendfactor"));

	public static long dst_alpha_blendfactor$offset() {
		return dst_alpha_blendfactor$OFFSET;
	}

	public static int dst_alpha_blendfactor(MemorySegment struct) {
		return struct.get(dst_alpha_blendfactor$LAYOUT, dst_alpha_blendfactor$OFFSET);
	}

	public static void dst_alpha_blendfactor(MemorySegment struct, int fieldValue) {
		struct.set(dst_alpha_blendfactor$LAYOUT, dst_alpha_blendfactor$OFFSET, fieldValue);
	}

	private static final OfInt alpha_blend_op$LAYOUT = (OfInt) $LAYOUT.select(groupElement("alpha_blend_op"));

	public static OfInt alpha_blend_op$layout() {
		return alpha_blend_op$LAYOUT;
	}

	private static final long alpha_blend_op$OFFSET = $LAYOUT.byteOffset(groupElement("alpha_blend_op"));

	public static long alpha_blend_op$offset() {
		return alpha_blend_op$OFFSET;
	}

	public static int alpha_blend_op(MemorySegment struct) {
		return struct.get(alpha_blend_op$LAYOUT, alpha_blend_op$OFFSET);
	}

	public static void alpha_blend_op(MemorySegment struct, int fieldValue) {
		struct.set(alpha_blend_op$LAYOUT, alpha_blend_op$OFFSET, fieldValue);
	}

	private static final OfByte color_write_mask$LAYOUT = (OfByte) $LAYOUT.select(groupElement("color_write_mask"));

	public static OfByte color_write_mask$layout() {
		return color_write_mask$LAYOUT;
	}

	private static final long color_write_mask$OFFSET = $LAYOUT.byteOffset(groupElement("color_write_mask"));

	public static long color_write_mask$offset() {
		return color_write_mask$OFFSET;
	}

	public static byte color_write_mask(MemorySegment struct) {
		return struct.get(color_write_mask$LAYOUT, color_write_mask$OFFSET);
	}

	public static void color_write_mask(MemorySegment struct, byte fieldValue) {
		struct.set(color_write_mask$LAYOUT, color_write_mask$OFFSET, fieldValue);
	}

	private static final OfBoolean enable_blend$LAYOUT = (OfBoolean) $LAYOUT.select(groupElement("enable_blend"));

	public static OfBoolean enable_blend$layout() {
		return enable_blend$LAYOUT;
	}

	private static final long enable_blend$OFFSET = $LAYOUT.byteOffset(groupElement("enable_blend"));

	public static long enable_blend$offset() {
		return enable_blend$OFFSET;
	}

	public static boolean enable_blend(MemorySegment struct) {
		return struct.get(enable_blend$LAYOUT, enable_blend$OFFSET);
	}

	public static void enable_blend(MemorySegment struct, boolean fieldValue) {
		struct.set(enable_blend$LAYOUT, enable_blend$OFFSET, fieldValue);
	}

	private static final OfBoolean enable_color_write_mask$LAYOUT = (OfBoolean) $LAYOUT.select(groupElement("enable_color_write_mask"));

	public static OfBoolean enable_color_write_mask$layout() {
		return enable_color_write_mask$LAYOUT;
	}

	private static final long enable_color_write_mask$OFFSET = $LAYOUT.byteOffset(groupElement("enable_color_write_mask"));

	public static long enable_color_write_mask$offset() {
		return enable_color_write_mask$OFFSET;
	}

	public static boolean enable_color_write_mask(MemorySegment struct) {
		return struct.get(enable_color_write_mask$LAYOUT, enable_color_write_mask$OFFSET);
	}

	public static void enable_color_write_mask(MemorySegment struct, boolean fieldValue) {
		struct.set(enable_color_write_mask$LAYOUT, enable_color_write_mask$OFFSET, fieldValue);
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
