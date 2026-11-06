package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.MemoryLayout.PathElement.sequenceElement;

public class SDL_GUID {

	SDL_GUID() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			MemoryLayout.sequenceLayout(16, SDL3.C_CHAR).withName("data")
	).withName("SDL_GUID");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final SequenceLayout data$LAYOUT = (SequenceLayout) $LAYOUT.select(groupElement("data"));

	public static SequenceLayout data$layout() {
		return data$LAYOUT;
	}

	private static final long data$OFFSET = $LAYOUT.byteOffset(groupElement("data"));

	public static long data$offset() {
		return data$OFFSET;
	}

	public static MemorySegment data(MemorySegment struct) {
		return struct.asSlice(data$OFFSET, data$LAYOUT.byteSize());
	}

	public static void data(MemorySegment struct, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, struct, data$OFFSET, data$LAYOUT.byteSize());
	}

	private static long[] data$DIMS = {16};

	public static long[] data$dimensions() {
		return data$DIMS;
	}

	private static final VarHandle data$ELEM_HANDLE = data$LAYOUT.varHandle(sequenceElement());

	public static byte data(MemorySegment struct, long index0) {
		return (byte) data$ELEM_HANDLE.get(struct, data$OFFSET, index0);
	}

	public static void data(MemorySegment struct, long index0, byte fieldValue) {
		data$ELEM_HANDLE.set(struct, data$OFFSET, index0, fieldValue);
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
