package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.*;

public class SDL_GPUSamplerCreateInfo {

	SDL_GPUSamplerCreateInfo() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("min_filter"),
			SDL3.C_INT.withName("mag_filter"),
			SDL3.C_INT.withName("mipmap_mode"),
			SDL3.C_INT.withName("address_mode_u"),
			SDL3.C_INT.withName("address_mode_v"),
			SDL3.C_INT.withName("address_mode_w"),
			SDL3.C_FLOAT.withName("mip_lod_bias"),
			SDL3.C_FLOAT.withName("max_anisotropy"),
			SDL3.C_INT.withName("compare_op"),
			SDL3.C_FLOAT.withName("min_lod"),
			SDL3.C_FLOAT.withName("max_lod"),
			SDL3.C_BOOL.withName("enable_anisotropy"),
			SDL3.C_BOOL.withName("enable_compare"),
			SDL3.C_CHAR.withName("padding1"),
			SDL3.C_CHAR.withName("padding2"),
			SDL3.C_INT.withName("props")
	).withName("SDL_GPUSamplerCreateInfo");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfInt min_filter$LAYOUT = (OfInt) $LAYOUT.select(groupElement("min_filter"));

	public static OfInt min_filter$layout() {
		return min_filter$LAYOUT;
	}

	private static final long min_filter$OFFSET = $LAYOUT.byteOffset(groupElement("min_filter"));

	public static long min_filter$offset() {
		return min_filter$OFFSET;
	}

	public static int min_filter(MemorySegment struct) {
		return struct.get(min_filter$LAYOUT, min_filter$OFFSET);
	}

	public static void min_filter(MemorySegment struct, int fieldValue) {
		struct.set(min_filter$LAYOUT, min_filter$OFFSET, fieldValue);
	}

	private static final OfInt mag_filter$LAYOUT = (OfInt) $LAYOUT.select(groupElement("mag_filter"));

	public static OfInt mag_filter$layout() {
		return mag_filter$LAYOUT;
	}

	private static final long mag_filter$OFFSET = $LAYOUT.byteOffset(groupElement("mag_filter"));

	public static long mag_filter$offset() {
		return mag_filter$OFFSET;
	}

	public static int mag_filter(MemorySegment struct) {
		return struct.get(mag_filter$LAYOUT, mag_filter$OFFSET);
	}

	public static void mag_filter(MemorySegment struct, int fieldValue) {
		struct.set(mag_filter$LAYOUT, mag_filter$OFFSET, fieldValue);
	}

	private static final OfInt mipmap_mode$LAYOUT = (OfInt) $LAYOUT.select(groupElement("mipmap_mode"));

	public static OfInt mipmap_mode$layout() {
		return mipmap_mode$LAYOUT;
	}

	private static final long mipmap_mode$OFFSET = $LAYOUT.byteOffset(groupElement("mipmap_mode"));

	public static long mipmap_mode$offset() {
		return mipmap_mode$OFFSET;
	}

	public static int mipmap_mode(MemorySegment struct) {
		return struct.get(mipmap_mode$LAYOUT, mipmap_mode$OFFSET);
	}

	public static void mipmap_mode(MemorySegment struct, int fieldValue) {
		struct.set(mipmap_mode$LAYOUT, mipmap_mode$OFFSET, fieldValue);
	}

	private static final OfInt address_mode_u$LAYOUT = (OfInt) $LAYOUT.select(groupElement("address_mode_u"));

	public static OfInt address_mode_u$layout() {
		return address_mode_u$LAYOUT;
	}

	private static final long address_mode_u$OFFSET = $LAYOUT.byteOffset(groupElement("address_mode_u"));

	public static long address_mode_u$offset() {
		return address_mode_u$OFFSET;
	}

	public static int address_mode_u(MemorySegment struct) {
		return struct.get(address_mode_u$LAYOUT, address_mode_u$OFFSET);
	}

	public static void address_mode_u(MemorySegment struct, int fieldValue) {
		struct.set(address_mode_u$LAYOUT, address_mode_u$OFFSET, fieldValue);
	}

	private static final OfInt address_mode_v$LAYOUT = (OfInt) $LAYOUT.select(groupElement("address_mode_v"));

	public static OfInt address_mode_v$layout() {
		return address_mode_v$LAYOUT;
	}

	private static final long address_mode_v$OFFSET = $LAYOUT.byteOffset(groupElement("address_mode_v"));

	public static long address_mode_v$offset() {
		return address_mode_v$OFFSET;
	}

	public static int address_mode_v(MemorySegment struct) {
		return struct.get(address_mode_v$LAYOUT, address_mode_v$OFFSET);
	}

	public static void address_mode_v(MemorySegment struct, int fieldValue) {
		struct.set(address_mode_v$LAYOUT, address_mode_v$OFFSET, fieldValue);
	}

	private static final OfInt address_mode_w$LAYOUT = (OfInt) $LAYOUT.select(groupElement("address_mode_w"));

	public static OfInt address_mode_w$layout() {
		return address_mode_w$LAYOUT;
	}

	private static final long address_mode_w$OFFSET = $LAYOUT.byteOffset(groupElement("address_mode_w"));

	public static long address_mode_w$offset() {
		return address_mode_w$OFFSET;
	}

	public static int address_mode_w(MemorySegment struct) {
		return struct.get(address_mode_w$LAYOUT, address_mode_w$OFFSET);
	}

	public static void address_mode_w(MemorySegment struct, int fieldValue) {
		struct.set(address_mode_w$LAYOUT, address_mode_w$OFFSET, fieldValue);
	}

	private static final OfFloat mip_lod_bias$LAYOUT = (OfFloat) $LAYOUT.select(groupElement("mip_lod_bias"));

	public static OfFloat mip_lod_bias$layout() {
		return mip_lod_bias$LAYOUT;
	}

	private static final long mip_lod_bias$OFFSET = $LAYOUT.byteOffset(groupElement("mip_lod_bias"));

	public static long mip_lod_bias$offset() {
		return mip_lod_bias$OFFSET;
	}

	public static float mip_lod_bias(MemorySegment struct) {
		return struct.get(mip_lod_bias$LAYOUT, mip_lod_bias$OFFSET);
	}

	public static void mip_lod_bias(MemorySegment struct, float fieldValue) {
		struct.set(mip_lod_bias$LAYOUT, mip_lod_bias$OFFSET, fieldValue);
	}

	private static final OfFloat max_anisotropy$LAYOUT = (OfFloat) $LAYOUT.select(groupElement("max_anisotropy"));

	public static OfFloat max_anisotropy$layout() {
		return max_anisotropy$LAYOUT;
	}

	private static final long max_anisotropy$OFFSET = $LAYOUT.byteOffset(groupElement("max_anisotropy"));

	public static long max_anisotropy$offset() {
		return max_anisotropy$OFFSET;
	}

	public static float max_anisotropy(MemorySegment struct) {
		return struct.get(max_anisotropy$LAYOUT, max_anisotropy$OFFSET);
	}

	public static void max_anisotropy(MemorySegment struct, float fieldValue) {
		struct.set(max_anisotropy$LAYOUT, max_anisotropy$OFFSET, fieldValue);
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

	private static final OfFloat min_lod$LAYOUT = (OfFloat) $LAYOUT.select(groupElement("min_lod"));

	public static OfFloat min_lod$layout() {
		return min_lod$LAYOUT;
	}

	private static final long min_lod$OFFSET = $LAYOUT.byteOffset(groupElement("min_lod"));

	public static long min_lod$offset() {
		return min_lod$OFFSET;
	}

	public static float min_lod(MemorySegment struct) {
		return struct.get(min_lod$LAYOUT, min_lod$OFFSET);
	}

	public static void min_lod(MemorySegment struct, float fieldValue) {
		struct.set(min_lod$LAYOUT, min_lod$OFFSET, fieldValue);
	}

	private static final OfFloat max_lod$LAYOUT = (OfFloat) $LAYOUT.select(groupElement("max_lod"));

	public static OfFloat max_lod$layout() {
		return max_lod$LAYOUT;
	}

	private static final long max_lod$OFFSET = $LAYOUT.byteOffset(groupElement("max_lod"));

	public static long max_lod$offset() {
		return max_lod$OFFSET;
	}

	public static float max_lod(MemorySegment struct) {
		return struct.get(max_lod$LAYOUT, max_lod$OFFSET);
	}

	public static void max_lod(MemorySegment struct, float fieldValue) {
		struct.set(max_lod$LAYOUT, max_lod$OFFSET, fieldValue);
	}

	private static final OfBoolean enable_anisotropy$LAYOUT = (OfBoolean) $LAYOUT.select(groupElement("enable_anisotropy"));

	public static OfBoolean enable_anisotropy$layout() {
		return enable_anisotropy$LAYOUT;
	}

	private static final long enable_anisotropy$OFFSET = $LAYOUT.byteOffset(groupElement("enable_anisotropy"));

	public static long enable_anisotropy$offset() {
		return enable_anisotropy$OFFSET;
	}

	public static boolean enable_anisotropy(MemorySegment struct) {
		return struct.get(enable_anisotropy$LAYOUT, enable_anisotropy$OFFSET);
	}

	public static void enable_anisotropy(MemorySegment struct, boolean fieldValue) {
		struct.set(enable_anisotropy$LAYOUT, enable_anisotropy$OFFSET, fieldValue);
	}

	private static final OfBoolean enable_compare$LAYOUT = (OfBoolean) $LAYOUT.select(groupElement("enable_compare"));

	public static OfBoolean enable_compare$layout() {
		return enable_compare$LAYOUT;
	}

	private static final long enable_compare$OFFSET = $LAYOUT.byteOffset(groupElement("enable_compare"));

	public static long enable_compare$offset() {
		return enable_compare$OFFSET;
	}

	public static boolean enable_compare(MemorySegment struct) {
		return struct.get(enable_compare$LAYOUT, enable_compare$OFFSET);
	}

	public static void enable_compare(MemorySegment struct, boolean fieldValue) {
		struct.set(enable_compare$LAYOUT, enable_compare$OFFSET, fieldValue);
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
