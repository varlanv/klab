package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.MemoryLayout.PathElement.sequenceElement;
import static java.lang.foreign.ValueLayout.OfShort;

public class SDL_VirtualJoystickTouchpadDesc {

	SDL_VirtualJoystickTouchpadDesc() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_SHORT.withName("nfingers"),
			MemoryLayout.sequenceLayout(3, SDL3.C_SHORT).withName("padding")
	).withName("SDL_VirtualJoystickTouchpadDesc");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfShort nfingers$LAYOUT = (OfShort) $LAYOUT.select(groupElement("nfingers"));

	public static OfShort nfingers$layout() {
		return nfingers$LAYOUT;
	}

	private static final long nfingers$OFFSET = $LAYOUT.byteOffset(groupElement("nfingers"));

	public static long nfingers$offset() {
		return nfingers$OFFSET;
	}

	public static short nfingers(MemorySegment struct) {
		return struct.get(nfingers$LAYOUT, nfingers$OFFSET);
	}

	public static void nfingers(MemorySegment struct, short fieldValue) {
		struct.set(nfingers$LAYOUT, nfingers$OFFSET, fieldValue);
	}

	private static final SequenceLayout padding$LAYOUT = (SequenceLayout) $LAYOUT.select(groupElement("padding"));

	public static SequenceLayout padding$layout() {
		return padding$LAYOUT;
	}

	private static final long padding$OFFSET = $LAYOUT.byteOffset(groupElement("padding"));

	public static long padding$offset() {
		return padding$OFFSET;
	}

	public static MemorySegment padding(MemorySegment struct) {
		return struct.asSlice(padding$OFFSET, padding$LAYOUT.byteSize());
	}

	public static void padding(MemorySegment struct, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, struct, padding$OFFSET, padding$LAYOUT.byteSize());
	}

	private static long[] padding$DIMS = {3};

	public static long[] padding$dimensions() {
		return padding$DIMS;
	}

	private static final VarHandle padding$ELEM_HANDLE = padding$LAYOUT.varHandle(sequenceElement());

	public static short padding(MemorySegment struct, long index0) {
		return (short) padding$ELEM_HANDLE.get(struct, padding$OFFSET, index0);
	}

	public static void padding(MemorySegment struct, long index0, short fieldValue) {
		padding$ELEM_HANDLE.set(struct, padding$OFFSET, index0, fieldValue);
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
