package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

public class SDL_MessageBoxButtonData {

	SDL_MessageBoxButtonData() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("flags"),
			SDL3.C_INT.withName("buttonID"),
			SDL3.C_POINTER.withName("text")
	).withName("SDL_MessageBoxButtonData");

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

	private static final OfInt buttonID$LAYOUT = (OfInt) $LAYOUT.select(groupElement("buttonID"));

	public static OfInt buttonID$layout() {
		return buttonID$LAYOUT;
	}

	private static final long buttonID$OFFSET = $LAYOUT.byteOffset(groupElement("buttonID"));

	public static long buttonID$offset() {
		return buttonID$OFFSET;
	}

	public static int buttonID(MemorySegment struct) {
		return struct.get(buttonID$LAYOUT, buttonID$OFFSET);
	}

	public static void buttonID(MemorySegment struct, int fieldValue) {
		struct.set(buttonID$LAYOUT, buttonID$OFFSET, fieldValue);
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
