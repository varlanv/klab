package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.*;

public class SDL_GPURasterizerState {

	SDL_GPURasterizerState() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("fill_mode"),
			SDL3.C_INT.withName("cull_mode"),
			SDL3.C_INT.withName("front_face"),
			SDL3.C_FLOAT.withName("depth_bias_constant_factor"),
			SDL3.C_FLOAT.withName("depth_bias_clamp"),
			SDL3.C_FLOAT.withName("depth_bias_slope_factor"),
			SDL3.C_BOOL.withName("enable_depth_bias"),
			SDL3.C_BOOL.withName("enable_depth_clip"),
			SDL3.C_CHAR.withName("padding1"),
			SDL3.C_CHAR.withName("padding2")
	).withName("SDL_GPURasterizerState");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfInt fill_mode$LAYOUT = (OfInt) $LAYOUT.select(groupElement("fill_mode"));

	public static OfInt fill_mode$layout() {
		return fill_mode$LAYOUT;
	}

	private static final long fill_mode$OFFSET = $LAYOUT.byteOffset(groupElement("fill_mode"));

	public static long fill_mode$offset() {
		return fill_mode$OFFSET;
	}

	public static int fill_mode(MemorySegment struct) {
		return struct.get(fill_mode$LAYOUT, fill_mode$OFFSET);
	}

	public static void fill_mode(MemorySegment struct, int fieldValue) {
		struct.set(fill_mode$LAYOUT, fill_mode$OFFSET, fieldValue);
	}

	private static final OfInt cull_mode$LAYOUT = (OfInt) $LAYOUT.select(groupElement("cull_mode"));

	public static OfInt cull_mode$layout() {
		return cull_mode$LAYOUT;
	}

	private static final long cull_mode$OFFSET = $LAYOUT.byteOffset(groupElement("cull_mode"));

	public static long cull_mode$offset() {
		return cull_mode$OFFSET;
	}

	public static int cull_mode(MemorySegment struct) {
		return struct.get(cull_mode$LAYOUT, cull_mode$OFFSET);
	}

	public static void cull_mode(MemorySegment struct, int fieldValue) {
		struct.set(cull_mode$LAYOUT, cull_mode$OFFSET, fieldValue);
	}

	private static final OfInt front_face$LAYOUT = (OfInt) $LAYOUT.select(groupElement("front_face"));

	public static OfInt front_face$layout() {
		return front_face$LAYOUT;
	}

	private static final long front_face$OFFSET = $LAYOUT.byteOffset(groupElement("front_face"));

	public static long front_face$offset() {
		return front_face$OFFSET;
	}

	public static int front_face(MemorySegment struct) {
		return struct.get(front_face$LAYOUT, front_face$OFFSET);
	}

	public static void front_face(MemorySegment struct, int fieldValue) {
		struct.set(front_face$LAYOUT, front_face$OFFSET, fieldValue);
	}

	private static final OfFloat depth_bias_constant_factor$LAYOUT = (OfFloat) $LAYOUT.select(groupElement("depth_bias_constant_factor"));

	public static OfFloat depth_bias_constant_factor$layout() {
		return depth_bias_constant_factor$LAYOUT;
	}

	private static final long depth_bias_constant_factor$OFFSET = $LAYOUT.byteOffset(groupElement("depth_bias_constant_factor"));

	public static long depth_bias_constant_factor$offset() {
		return depth_bias_constant_factor$OFFSET;
	}

	public static float depth_bias_constant_factor(MemorySegment struct) {
		return struct.get(depth_bias_constant_factor$LAYOUT, depth_bias_constant_factor$OFFSET);
	}

	public static void depth_bias_constant_factor(MemorySegment struct, float fieldValue) {
		struct.set(depth_bias_constant_factor$LAYOUT, depth_bias_constant_factor$OFFSET, fieldValue);
	}

	private static final OfFloat depth_bias_clamp$LAYOUT = (OfFloat) $LAYOUT.select(groupElement("depth_bias_clamp"));

	public static OfFloat depth_bias_clamp$layout() {
		return depth_bias_clamp$LAYOUT;
	}

	private static final long depth_bias_clamp$OFFSET = $LAYOUT.byteOffset(groupElement("depth_bias_clamp"));

	public static long depth_bias_clamp$offset() {
		return depth_bias_clamp$OFFSET;
	}

	public static float depth_bias_clamp(MemorySegment struct) {
		return struct.get(depth_bias_clamp$LAYOUT, depth_bias_clamp$OFFSET);
	}

	public static void depth_bias_clamp(MemorySegment struct, float fieldValue) {
		struct.set(depth_bias_clamp$LAYOUT, depth_bias_clamp$OFFSET, fieldValue);
	}

	private static final OfFloat depth_bias_slope_factor$LAYOUT = (OfFloat) $LAYOUT.select(groupElement("depth_bias_slope_factor"));

	public static OfFloat depth_bias_slope_factor$layout() {
		return depth_bias_slope_factor$LAYOUT;
	}

	private static final long depth_bias_slope_factor$OFFSET = $LAYOUT.byteOffset(groupElement("depth_bias_slope_factor"));

	public static long depth_bias_slope_factor$offset() {
		return depth_bias_slope_factor$OFFSET;
	}

	public static float depth_bias_slope_factor(MemorySegment struct) {
		return struct.get(depth_bias_slope_factor$LAYOUT, depth_bias_slope_factor$OFFSET);
	}

	public static void depth_bias_slope_factor(MemorySegment struct, float fieldValue) {
		struct.set(depth_bias_slope_factor$LAYOUT, depth_bias_slope_factor$OFFSET, fieldValue);
	}

	private static final OfBoolean enable_depth_bias$LAYOUT = (OfBoolean) $LAYOUT.select(groupElement("enable_depth_bias"));

	public static OfBoolean enable_depth_bias$layout() {
		return enable_depth_bias$LAYOUT;
	}

	private static final long enable_depth_bias$OFFSET = $LAYOUT.byteOffset(groupElement("enable_depth_bias"));

	public static long enable_depth_bias$offset() {
		return enable_depth_bias$OFFSET;
	}

	public static boolean enable_depth_bias(MemorySegment struct) {
		return struct.get(enable_depth_bias$LAYOUT, enable_depth_bias$OFFSET);
	}

	public static void enable_depth_bias(MemorySegment struct, boolean fieldValue) {
		struct.set(enable_depth_bias$LAYOUT, enable_depth_bias$OFFSET, fieldValue);
	}

	private static final OfBoolean enable_depth_clip$LAYOUT = (OfBoolean) $LAYOUT.select(groupElement("enable_depth_clip"));

	public static OfBoolean enable_depth_clip$layout() {
		return enable_depth_clip$LAYOUT;
	}

	private static final long enable_depth_clip$OFFSET = $LAYOUT.byteOffset(groupElement("enable_depth_clip"));

	public static long enable_depth_clip$offset() {
		return enable_depth_clip$OFFSET;
	}

	public static boolean enable_depth_clip(MemorySegment struct) {
		return struct.get(enable_depth_clip$LAYOUT, enable_depth_clip$OFFSET);
	}

	public static void enable_depth_clip(MemorySegment struct, boolean fieldValue) {
		struct.set(enable_depth_clip$LAYOUT, enable_depth_clip$OFFSET, fieldValue);
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
