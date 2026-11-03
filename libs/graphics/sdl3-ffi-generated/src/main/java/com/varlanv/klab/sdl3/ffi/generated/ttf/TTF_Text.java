package com.varlanv.klab.sdl3.ffi.generated.ttf;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

public class TTF_Text {

	TTF_Text() {
	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3Ttf.C_POINTER.withName("text"),
			SDL3Ttf.C_INT.withName("num_lines"),
			SDL3Ttf.C_INT.withName("refcount"),
			SDL3Ttf.C_POINTER.withName("internal")
	).withName("TTF_Text");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final AddressLayout text$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("text"));

	public static AddressLayout text$layout() {
		return text$LAYOUT;
	}

	private static final long text$OFFSET = $LAYOUT.byteOffset(groupElement("text"));

	public static long text$offset() {
		return text$OFFSET;
	}

	public static MemorySegment text(MemorySegment struct) {
		return struct.get(text$LAYOUT, text$OFFSET);
	}

	public static void text(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(text$LAYOUT, text$OFFSET, fieldValue);
	}

	private static final OfInt num_lines$LAYOUT = (OfInt) $LAYOUT.select(groupElement("num_lines"));

	public static OfInt num_lines$layout() {
		return num_lines$LAYOUT;
	}

	private static final long num_lines$OFFSET = $LAYOUT.byteOffset(groupElement("num_lines"));

	public static long num_lines$offset() {
		return num_lines$OFFSET;
	}

	public static int num_lines(MemorySegment struct) {
		return struct.get(num_lines$LAYOUT, num_lines$OFFSET);
	}

	public static void num_lines(MemorySegment struct, int fieldValue) {
		struct.set(num_lines$LAYOUT, num_lines$OFFSET, fieldValue);
	}

	private static final OfInt refcount$LAYOUT = (OfInt) $LAYOUT.select(groupElement("refcount"));

	public static OfInt refcount$layout() {
		return refcount$LAYOUT;
	}

	private static final long refcount$OFFSET = $LAYOUT.byteOffset(groupElement("refcount"));

	public static long refcount$offset() {
		return refcount$OFFSET;
	}

	public static int refcount(MemorySegment struct) {
		return struct.get(refcount$LAYOUT, refcount$OFFSET);
	}

	public static void refcount(MemorySegment struct, int fieldValue) {
		struct.set(refcount$LAYOUT, refcount$OFFSET, fieldValue);
	}

	private static final AddressLayout internal$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("internal"));

	public static AddressLayout internal$layout() {
		return internal$LAYOUT;
	}

	private static final long internal$OFFSET = $LAYOUT.byteOffset(groupElement("internal"));

	public static long internal$offset() {
		return internal$OFFSET;
	}

	public static MemorySegment internal(MemorySegment struct) {
		return struct.get(internal$LAYOUT, internal$OFFSET);
	}

	public static void internal(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(internal$LAYOUT, internal$OFFSET, fieldValue);
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
