package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

public class SDL_Surface {

	SDL_Surface() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("flags"),
			SDL3.C_INT.withName("format"),
			SDL3.C_INT.withName("w"),
			SDL3.C_INT.withName("h"),
			SDL3.C_INT.withName("pitch"),
			MemoryLayout.paddingLayout(4),
			SDL3.C_POINTER.withName("pixels"),
			SDL3.C_INT.withName("refcount"),
			MemoryLayout.paddingLayout(4),
			SDL3.C_POINTER.withName("reserved")
	).withName("SDL_Surface");

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

	private static final OfInt w$LAYOUT = (OfInt) $LAYOUT.select(groupElement("w"));

	public static OfInt w$layout() {
		return w$LAYOUT;
	}

	private static final long w$OFFSET = $LAYOUT.byteOffset(groupElement("w"));

	public static long w$offset() {
		return w$OFFSET;
	}

	public static int w(MemorySegment struct) {
		return struct.get(w$LAYOUT, w$OFFSET);
	}

	public static void w(MemorySegment struct, int fieldValue) {
		struct.set(w$LAYOUT, w$OFFSET, fieldValue);
	}

	private static final OfInt h$LAYOUT = (OfInt) $LAYOUT.select(groupElement("h"));

	public static OfInt h$layout() {
		return h$LAYOUT;
	}

	private static final long h$OFFSET = $LAYOUT.byteOffset(groupElement("h"));

	public static long h$offset() {
		return h$OFFSET;
	}

	public static int h(MemorySegment struct) {
		return struct.get(h$LAYOUT, h$OFFSET);
	}

	public static void h(MemorySegment struct, int fieldValue) {
		struct.set(h$LAYOUT, h$OFFSET, fieldValue);
	}

	private static final OfInt pitch$LAYOUT = (OfInt) $LAYOUT.select(groupElement("pitch"));

	public static OfInt pitch$layout() {
		return pitch$LAYOUT;
	}

	private static final long pitch$OFFSET = $LAYOUT.byteOffset(groupElement("pitch"));

	public static long pitch$offset() {
		return pitch$OFFSET;
	}

	public static int pitch(MemorySegment struct) {
		return struct.get(pitch$LAYOUT, pitch$OFFSET);
	}

	public static void pitch(MemorySegment struct, int fieldValue) {
		struct.set(pitch$LAYOUT, pitch$OFFSET, fieldValue);
	}

	private static final AddressLayout pixels$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("pixels"));

	public static AddressLayout pixels$layout() {
		return pixels$LAYOUT;
	}

	private static final long pixels$OFFSET = $LAYOUT.byteOffset(groupElement("pixels"));

	public static long pixels$offset() {
		return pixels$OFFSET;
	}

	public static MemorySegment pixels(MemorySegment struct) {
		return struct.get(pixels$LAYOUT, pixels$OFFSET);
	}

	public static void pixels(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(pixels$LAYOUT, pixels$OFFSET, fieldValue);
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
