package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfLong;

public class SDL_InitState {

	SDL_InitState() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL_AtomicInt.layout().withName("status"),
			MemoryLayout.paddingLayout(4),
			SDL3.C_LONG.withName("thread"),
			SDL3.C_POINTER.withName("reserved")
	).withName("SDL_InitState");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final GroupLayout status$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("status"));

	public static GroupLayout status$layout() {
		return status$LAYOUT;
	}

	private static final long status$OFFSET = $LAYOUT.byteOffset(groupElement("status"));

	public static long status$offset() {
		return status$OFFSET;
	}

	public static MemorySegment status(MemorySegment struct) {
		return struct.asSlice(status$OFFSET, status$LAYOUT.byteSize());
	}

	public static void status(MemorySegment struct, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, struct, status$OFFSET, status$LAYOUT.byteSize());
	}

	private static final OfLong thread$LAYOUT = (OfLong) $LAYOUT.select(groupElement("thread"));

	public static OfLong thread$layout() {
		return thread$LAYOUT;
	}

	private static final long thread$OFFSET = $LAYOUT.byteOffset(groupElement("thread"));

	public static long thread$offset() {
		return thread$OFFSET;
	}

	public static long thread(MemorySegment struct) {
		return struct.get(thread$LAYOUT, thread$OFFSET);
	}

	public static void thread(MemorySegment struct, long fieldValue) {
		struct.set(thread$LAYOUT, thread$OFFSET, fieldValue);
	}

	private static final AddressLayout reserved$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("reserved"));

	public static AddressLayout reserved$layout() {
		return reserved$LAYOUT;
	}

	private static final long reserved$OFFSET = $LAYOUT.byteOffset(groupElement("reserved"));

	public static long reserved$offset() {
		return reserved$OFFSET;
	}

	public static MemorySegment reserved(MemorySegment struct) {
		return struct.get(reserved$LAYOUT, reserved$OFFSET);
	}

	public static void reserved(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(reserved$LAYOUT, reserved$OFFSET, fieldValue);
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
