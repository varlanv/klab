package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.MemoryLayout.PathElement.sequenceElement;
import static java.lang.foreign.ValueLayout.OfByte;

public class SDL_HapticDirection {

	SDL_HapticDirection() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_CHAR.withName("type"),
			MemoryLayout.paddingLayout(3),
			MemoryLayout.sequenceLayout(3, SDL3.C_INT).withName("dir")
	).withName("SDL_HapticDirection");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfByte type$LAYOUT = (OfByte) $LAYOUT.select(groupElement("type"));

	public static OfByte type$layout() {
		return type$LAYOUT;
	}

	private static final long type$OFFSET = $LAYOUT.byteOffset(groupElement("type"));

	public static long type$offset() {
		return type$OFFSET;
	}

	public static byte type(MemorySegment struct) {
		return struct.get(type$LAYOUT, type$OFFSET);
	}

	public static void type(MemorySegment struct, byte fieldValue) {
		struct.set(type$LAYOUT, type$OFFSET, fieldValue);
	}

	private static final SequenceLayout dir$LAYOUT = (SequenceLayout) $LAYOUT.select(groupElement("dir"));

	public static SequenceLayout dir$layout() {
		return dir$LAYOUT;
	}

	private static final long dir$OFFSET = $LAYOUT.byteOffset(groupElement("dir"));

	public static long dir$offset() {
		return dir$OFFSET;
	}

	public static MemorySegment dir(MemorySegment struct) {
		return struct.asSlice(dir$OFFSET, dir$LAYOUT.byteSize());
	}

	public static void dir(MemorySegment struct, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, struct, dir$OFFSET, dir$LAYOUT.byteSize());
	}

	private static long[] dir$DIMS = {3};

	public static long[] dir$dimensions() {
		return dir$DIMS;
	}

	private static final VarHandle dir$ELEM_HANDLE = dir$LAYOUT.varHandle(sequenceElement());

	public static int dir(MemorySegment struct, long index0) {
		return (int) dir$ELEM_HANDLE.get(struct, dir$OFFSET, index0);
	}

	public static void dir(MemorySegment struct, long index0, int fieldValue) {
		dir$ELEM_HANDLE.set(struct, dir$OFFSET, index0, fieldValue);
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
