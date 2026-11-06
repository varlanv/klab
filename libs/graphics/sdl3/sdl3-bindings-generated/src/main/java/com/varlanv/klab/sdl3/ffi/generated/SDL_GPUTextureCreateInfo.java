package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

public class SDL_GPUTextureCreateInfo {

	SDL_GPUTextureCreateInfo() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("type"),
			SDL3.C_INT.withName("format"),
			SDL3.C_INT.withName("usage"),
			SDL3.C_INT.withName("width"),
			SDL3.C_INT.withName("height"),
			SDL3.C_INT.withName("layer_count_or_depth"),
			SDL3.C_INT.withName("num_levels"),
			SDL3.C_INT.withName("sample_count"),
			SDL3.C_INT.withName("props")
	).withName("SDL_GPUTextureCreateInfo");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfInt type$LAYOUT = (OfInt) $LAYOUT.select(groupElement("type"));

	public static OfInt type$layout() {
		return type$LAYOUT;
	}

	private static final long type$OFFSET = $LAYOUT.byteOffset(groupElement("type"));

	public static long type$offset() {
		return type$OFFSET;
	}

	public static int type(MemorySegment struct) {
		return struct.get(type$LAYOUT, type$OFFSET);
	}

	public static void type(MemorySegment struct, int fieldValue) {
		struct.set(type$LAYOUT, type$OFFSET, fieldValue);
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

	private static final OfInt width$LAYOUT = (OfInt) $LAYOUT.select(groupElement("width"));

	public static OfInt width$layout() {
		return width$LAYOUT;
	}

	private static final long width$OFFSET = $LAYOUT.byteOffset(groupElement("width"));

	public static long width$offset() {
		return width$OFFSET;
	}

	public static int width(MemorySegment struct) {
		return struct.get(width$LAYOUT, width$OFFSET);
	}

	public static void width(MemorySegment struct, int fieldValue) {
		struct.set(width$LAYOUT, width$OFFSET, fieldValue);
	}

	private static final OfInt height$LAYOUT = (OfInt) $LAYOUT.select(groupElement("height"));

	public static OfInt height$layout() {
		return height$LAYOUT;
	}

	private static final long height$OFFSET = $LAYOUT.byteOffset(groupElement("height"));

	public static long height$offset() {
		return height$OFFSET;
	}

	public static int height(MemorySegment struct) {
		return struct.get(height$LAYOUT, height$OFFSET);
	}

	public static void height(MemorySegment struct, int fieldValue) {
		struct.set(height$LAYOUT, height$OFFSET, fieldValue);
	}

	private static final OfInt layer_count_or_depth$LAYOUT = (OfInt) $LAYOUT.select(groupElement("layer_count_or_depth"));

	public static OfInt layer_count_or_depth$layout() {
		return layer_count_or_depth$LAYOUT;
	}

	private static final long layer_count_or_depth$OFFSET = $LAYOUT.byteOffset(groupElement("layer_count_or_depth"));

	public static long layer_count_or_depth$offset() {
		return layer_count_or_depth$OFFSET;
	}

	public static int layer_count_or_depth(MemorySegment struct) {
		return struct.get(layer_count_or_depth$LAYOUT, layer_count_or_depth$OFFSET);
	}

	public static void layer_count_or_depth(MemorySegment struct, int fieldValue) {
		struct.set(layer_count_or_depth$LAYOUT, layer_count_or_depth$OFFSET, fieldValue);
	}

	private static final OfInt num_levels$LAYOUT = (OfInt) $LAYOUT.select(groupElement("num_levels"));

	public static OfInt num_levels$layout() {
		return num_levels$LAYOUT;
	}

	private static final long num_levels$OFFSET = $LAYOUT.byteOffset(groupElement("num_levels"));

	public static long num_levels$offset() {
		return num_levels$OFFSET;
	}

	public static int num_levels(MemorySegment struct) {
		return struct.get(num_levels$LAYOUT, num_levels$OFFSET);
	}

	public static void num_levels(MemorySegment struct, int fieldValue) {
		struct.set(num_levels$LAYOUT, num_levels$OFFSET, fieldValue);
	}

	private static final OfInt sample_count$LAYOUT = (OfInt) $LAYOUT.select(groupElement("sample_count"));

	public static OfInt sample_count$layout() {
		return sample_count$LAYOUT;
	}

	private static final long sample_count$OFFSET = $LAYOUT.byteOffset(groupElement("sample_count"));

	public static long sample_count$offset() {
		return sample_count$OFFSET;
	}

	public static int sample_count(MemorySegment struct) {
		return struct.get(sample_count$LAYOUT, sample_count$OFFSET);
	}

	public static void sample_count(MemorySegment struct, int fieldValue) {
		struct.set(sample_count$LAYOUT, sample_count$OFFSET, fieldValue);
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
