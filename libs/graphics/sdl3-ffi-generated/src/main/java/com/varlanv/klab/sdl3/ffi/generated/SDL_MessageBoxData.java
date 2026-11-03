package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

public class SDL_MessageBoxData {

	SDL_MessageBoxData() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("flags"),
			MemoryLayout.paddingLayout(4),
			SDL3.C_POINTER.withName("window"),
			SDL3.C_POINTER.withName("title"),
			SDL3.C_POINTER.withName("message"),
			SDL3.C_INT.withName("numbuttons"),
			MemoryLayout.paddingLayout(4),
			SDL3.C_POINTER.withName("buttons"),
			SDL3.C_POINTER.withName("colorScheme")
	).withName("SDL_MessageBoxData");

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

	private static final AddressLayout window$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("window"));

	public static AddressLayout window$layout() {
		return window$LAYOUT;
	}

	private static final long window$OFFSET = $LAYOUT.byteOffset(groupElement("window"));

	public static long window$offset() {
		return window$OFFSET;
	}

	public static MemorySegment window(MemorySegment struct) {
		return struct.get(window$LAYOUT, window$OFFSET);
	}

	public static void window(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(window$LAYOUT, window$OFFSET, fieldValue);
	}

	private static final AddressLayout title$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("title"));

	public static AddressLayout title$layout() {
		return title$LAYOUT;
	}

	private static final long title$OFFSET = $LAYOUT.byteOffset(groupElement("title"));

	public static long title$offset() {
		return title$OFFSET;
	}

	public static MemorySegment title(MemorySegment struct) {
		return struct.get(title$LAYOUT, title$OFFSET);
	}

	public static void title(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(title$LAYOUT, title$OFFSET, fieldValue);
	}

	private static final AddressLayout message$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("message"));

	public static AddressLayout message$layout() {
		return message$LAYOUT;
	}

	private static final long message$OFFSET = $LAYOUT.byteOffset(groupElement("message"));

	public static long message$offset() {
		return message$OFFSET;
	}

	public static MemorySegment message(MemorySegment struct) {
		return struct.get(message$LAYOUT, message$OFFSET);
	}

	public static void message(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(message$LAYOUT, message$OFFSET, fieldValue);
	}

	private static final OfInt numbuttons$LAYOUT = (OfInt) $LAYOUT.select(groupElement("numbuttons"));

	public static OfInt numbuttons$layout() {
		return numbuttons$LAYOUT;
	}

	private static final long numbuttons$OFFSET = $LAYOUT.byteOffset(groupElement("numbuttons"));

	public static long numbuttons$offset() {
		return numbuttons$OFFSET;
	}

	public static int numbuttons(MemorySegment struct) {
		return struct.get(numbuttons$LAYOUT, numbuttons$OFFSET);
	}

	public static void numbuttons(MemorySegment struct, int fieldValue) {
		struct.set(numbuttons$LAYOUT, numbuttons$OFFSET, fieldValue);
	}

	private static final AddressLayout buttons$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("buttons"));

	public static AddressLayout buttons$layout() {
		return buttons$LAYOUT;
	}

	private static final long buttons$OFFSET = $LAYOUT.byteOffset(groupElement("buttons"));

	public static long buttons$offset() {
		return buttons$OFFSET;
	}

	public static MemorySegment buttons(MemorySegment struct) {
		return struct.get(buttons$LAYOUT, buttons$OFFSET);
	}

	public static void buttons(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(buttons$LAYOUT, buttons$OFFSET, fieldValue);
	}

	private static final AddressLayout colorScheme$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("colorScheme"));

	public static AddressLayout colorScheme$layout() {
		return colorScheme$LAYOUT;
	}

	private static final long colorScheme$OFFSET = $LAYOUT.byteOffset(groupElement("colorScheme"));

	public static long colorScheme$offset() {
		return colorScheme$OFFSET;
	}

	public static MemorySegment colorScheme(MemorySegment struct) {
		return struct.get(colorScheme$LAYOUT, colorScheme$OFFSET);
	}

	public static void colorScheme(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(colorScheme$LAYOUT, colorScheme$OFFSET, fieldValue);
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
