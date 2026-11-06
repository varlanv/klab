package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

public class SDL_GPUVertexAttribute {

	SDL_GPUVertexAttribute() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("location"),
			SDL3.C_INT.withName("buffer_slot"),
			SDL3.C_INT.withName("format"),
			SDL3.C_INT.withName("offset")
	).withName("SDL_GPUVertexAttribute");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfInt location$LAYOUT = (OfInt) $LAYOUT.select(groupElement("location"));

	public static OfInt location$layout() {
		return location$LAYOUT;
	}

	private static final long location$OFFSET = $LAYOUT.byteOffset(groupElement("location"));

	public static long location$offset() {
		return location$OFFSET;
	}

	public static int location(MemorySegment struct) {
		return struct.get(location$LAYOUT, location$OFFSET);
	}

	public static void location(MemorySegment struct, int fieldValue) {
		struct.set(location$LAYOUT, location$OFFSET, fieldValue);
	}

	private static final OfInt buffer_slot$LAYOUT = (OfInt) $LAYOUT.select(groupElement("buffer_slot"));

	public static OfInt buffer_slot$layout() {
		return buffer_slot$LAYOUT;
	}

	private static final long buffer_slot$OFFSET = $LAYOUT.byteOffset(groupElement("buffer_slot"));

	public static long buffer_slot$offset() {
		return buffer_slot$OFFSET;
	}

	public static int buffer_slot(MemorySegment struct) {
		return struct.get(buffer_slot$LAYOUT, buffer_slot$OFFSET);
	}

	public static void buffer_slot(MemorySegment struct, int fieldValue) {
		struct.set(buffer_slot$LAYOUT, buffer_slot$OFFSET, fieldValue);
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
