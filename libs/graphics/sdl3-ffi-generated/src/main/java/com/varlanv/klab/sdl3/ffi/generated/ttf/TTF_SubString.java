package com.varlanv.klab.sdl3.ffi.generated.ttf;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

public class TTF_SubString {

	TTF_SubString() {
	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3Ttf.C_INT.withName("flags"),
			SDL3Ttf.C_INT.withName("offset"),
			SDL3Ttf.C_INT.withName("length"),
			SDL3Ttf.C_INT.withName("line_index"),
			SDL3Ttf.C_INT.withName("cluster_index"),
			SDL_Rect.layout().withName("rect")
	).withName("TTF_SubString");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfInt flags$LAYOUT = (OfInt) $LAYOUT.select(groupElement("flags"));

	public static OfInt flags$layout() {
		return flags$LAYOUT;
	}

	private static final long flags$OFFSET = $LAYOUT.byteOffset(groupElement("flags"));

	public static long flags$offset() {
		return flags$OFFSET;
	}

	public static int flags(MemorySegment struct) {
		return struct.get(flags$LAYOUT, flags$OFFSET);
	}

	public static void flags(MemorySegment struct, int fieldValue) {
		struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
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

	private static final OfInt length$LAYOUT = (OfInt) $LAYOUT.select(groupElement("length"));

	public static OfInt length$layout() {
		return length$LAYOUT;
	}

	private static final long length$OFFSET = $LAYOUT.byteOffset(groupElement("length"));

	public static long length$offset() {
		return length$OFFSET;
	}

	public static int length(MemorySegment struct) {
		return struct.get(length$LAYOUT, length$OFFSET);
	}

	public static void length(MemorySegment struct, int fieldValue) {
		struct.set(length$LAYOUT, length$OFFSET, fieldValue);
	}

	private static final OfInt line_index$LAYOUT = (OfInt) $LAYOUT.select(groupElement("line_index"));

	public static OfInt line_index$layout() {
		return line_index$LAYOUT;
	}

	private static final long line_index$OFFSET = $LAYOUT.byteOffset(groupElement("line_index"));

	public static long line_index$offset() {
		return line_index$OFFSET;
	}

	public static int line_index(MemorySegment struct) {
		return struct.get(line_index$LAYOUT, line_index$OFFSET);
	}

	public static void line_index(MemorySegment struct, int fieldValue) {
		struct.set(line_index$LAYOUT, line_index$OFFSET, fieldValue);
	}

	private static final OfInt cluster_index$LAYOUT = (OfInt) $LAYOUT.select(groupElement("cluster_index"));

	public static OfInt cluster_index$layout() {
		return cluster_index$LAYOUT;
	}

	private static final long cluster_index$OFFSET = $LAYOUT.byteOffset(groupElement("cluster_index"));

	public static long cluster_index$offset() {
		return cluster_index$OFFSET;
	}

	public static int cluster_index(MemorySegment struct) {
		return struct.get(cluster_index$LAYOUT, cluster_index$OFFSET);
	}

	public static void cluster_index(MemorySegment struct, int fieldValue) {
		struct.set(cluster_index$LAYOUT, cluster_index$OFFSET, fieldValue);
	}

	private static final GroupLayout rect$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("rect"));

	public static GroupLayout rect$layout() {
		return rect$LAYOUT;
	}

	private static final long rect$OFFSET = $LAYOUT.byteOffset(groupElement("rect"));

	public static long rect$offset() {
		return rect$OFFSET;
	}

	public static MemorySegment rect(MemorySegment struct) {
		return struct.asSlice(rect$OFFSET, rect$LAYOUT.byteSize());
	}

	public static void rect(MemorySegment struct, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, struct, rect$OFFSET, rect$LAYOUT.byteSize());
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
