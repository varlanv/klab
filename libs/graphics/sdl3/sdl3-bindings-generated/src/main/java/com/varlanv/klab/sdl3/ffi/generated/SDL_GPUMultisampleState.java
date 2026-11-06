package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.*;

public class SDL_GPUMultisampleState {

	SDL_GPUMultisampleState() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("sample_count"),
			SDL3.C_INT.withName("sample_mask"),
			SDL3.C_BOOL.withName("enable_mask"),
			SDL3.C_BOOL.withName("enable_alpha_to_coverage"),
			SDL3.C_CHAR.withName("padding2"),
			SDL3.C_CHAR.withName("padding3")
	).withName("SDL_GPUMultisampleState");

	public static GroupLayout layout() {
		return $LAYOUT;
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

	private static final OfInt sample_mask$LAYOUT = (OfInt) $LAYOUT.select(groupElement("sample_mask"));

	public static OfInt sample_mask$layout() {
		return sample_mask$LAYOUT;
	}

	private static final long sample_mask$OFFSET = $LAYOUT.byteOffset(groupElement("sample_mask"));

	public static long sample_mask$offset() {
		return sample_mask$OFFSET;
	}

	public static int sample_mask(MemorySegment struct) {
		return struct.get(sample_mask$LAYOUT, sample_mask$OFFSET);
	}

	public static void sample_mask(MemorySegment struct, int fieldValue) {
		struct.set(sample_mask$LAYOUT, sample_mask$OFFSET, fieldValue);
	}

	private static final OfBoolean enable_mask$LAYOUT = (OfBoolean) $LAYOUT.select(groupElement("enable_mask"));

	public static OfBoolean enable_mask$layout() {
		return enable_mask$LAYOUT;
	}

	private static final long enable_mask$OFFSET = $LAYOUT.byteOffset(groupElement("enable_mask"));

	public static long enable_mask$offset() {
		return enable_mask$OFFSET;
	}

	public static boolean enable_mask(MemorySegment struct) {
		return struct.get(enable_mask$LAYOUT, enable_mask$OFFSET);
	}

	public static void enable_mask(MemorySegment struct, boolean fieldValue) {
		struct.set(enable_mask$LAYOUT, enable_mask$OFFSET, fieldValue);
	}

	private static final OfBoolean enable_alpha_to_coverage$LAYOUT = (OfBoolean) $LAYOUT.select(groupElement("enable_alpha_to_coverage"));

	public static OfBoolean enable_alpha_to_coverage$layout() {
		return enable_alpha_to_coverage$LAYOUT;
	}

	private static final long enable_alpha_to_coverage$OFFSET = $LAYOUT.byteOffset(groupElement("enable_alpha_to_coverage"));

	public static long enable_alpha_to_coverage$offset() {
		return enable_alpha_to_coverage$OFFSET;
	}

	public static boolean enable_alpha_to_coverage(MemorySegment struct) {
		return struct.get(enable_alpha_to_coverage$LAYOUT, enable_alpha_to_coverage$OFFSET);
	}

	public static void enable_alpha_to_coverage(MemorySegment struct, boolean fieldValue) {
		struct.set(enable_alpha_to_coverage$LAYOUT, enable_alpha_to_coverage$OFFSET, fieldValue);
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
