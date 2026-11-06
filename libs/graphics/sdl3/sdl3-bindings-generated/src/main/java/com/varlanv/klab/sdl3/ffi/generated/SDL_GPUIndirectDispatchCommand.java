package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

public class SDL_GPUIndirectDispatchCommand {

	SDL_GPUIndirectDispatchCommand() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("groupcount_x"),
			SDL3.C_INT.withName("groupcount_y"),
			SDL3.C_INT.withName("groupcount_z")
	).withName("SDL_GPUIndirectDispatchCommand");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfInt groupcount_x$LAYOUT = (OfInt) $LAYOUT.select(groupElement("groupcount_x"));

	public static OfInt groupcount_x$layout() {
		return groupcount_x$LAYOUT;
	}

	private static final long groupcount_x$OFFSET = $LAYOUT.byteOffset(groupElement("groupcount_x"));

	public static long groupcount_x$offset() {
		return groupcount_x$OFFSET;
	}

	public static int groupcount_x(MemorySegment struct) {
		return struct.get(groupcount_x$LAYOUT, groupcount_x$OFFSET);
	}

	public static void groupcount_x(MemorySegment struct, int fieldValue) {
		struct.set(groupcount_x$LAYOUT, groupcount_x$OFFSET, fieldValue);
	}

	private static final OfInt groupcount_y$LAYOUT = (OfInt) $LAYOUT.select(groupElement("groupcount_y"));

	public static OfInt groupcount_y$layout() {
		return groupcount_y$LAYOUT;
	}

	private static final long groupcount_y$OFFSET = $LAYOUT.byteOffset(groupElement("groupcount_y"));

	public static long groupcount_y$offset() {
		return groupcount_y$OFFSET;
	}

	public static int groupcount_y(MemorySegment struct) {
		return struct.get(groupcount_y$LAYOUT, groupcount_y$OFFSET);
	}

	public static void groupcount_y(MemorySegment struct, int fieldValue) {
		struct.set(groupcount_y$LAYOUT, groupcount_y$OFFSET, fieldValue);
	}

	private static final OfInt groupcount_z$LAYOUT = (OfInt) $LAYOUT.select(groupElement("groupcount_z"));

	public static OfInt groupcount_z$layout() {
		return groupcount_z$LAYOUT;
	}

	private static final long groupcount_z$OFFSET = $LAYOUT.byteOffset(groupElement("groupcount_z"));

	public static long groupcount_z$offset() {
		return groupcount_z$OFFSET;
	}

	public static int groupcount_z(MemorySegment struct) {
		return struct.get(groupcount_z$LAYOUT, groupcount_z$OFFSET);
	}

	public static void groupcount_z(MemorySegment struct, int fieldValue) {
		struct.set(groupcount_z$LAYOUT, groupcount_z$OFFSET, fieldValue);
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
