package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

public class SDL_Palette {

	SDL_Palette() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("ncolors"),
			MemoryLayout.paddingLayout(4),
			SDL3.C_POINTER.withName("colors"),
			SDL3.C_INT.withName("version"),
			SDL3.C_INT.withName("refcount")
	).withName("SDL_Palette");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfInt ncolors$LAYOUT = (OfInt) $LAYOUT.select(groupElement("ncolors"));

	public static OfInt ncolors$layout() {
		return ncolors$LAYOUT;
	}

	private static final long ncolors$OFFSET = $LAYOUT.byteOffset(groupElement("ncolors"));

	public static long ncolors$offset() {
		return ncolors$OFFSET;
	}

	public static int ncolors(MemorySegment struct) {
		return struct.get(ncolors$LAYOUT, ncolors$OFFSET);
	}

	public static void ncolors(MemorySegment struct, int fieldValue) {
		struct.set(ncolors$LAYOUT, ncolors$OFFSET, fieldValue);
	}

	private static final AddressLayout colors$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("colors"));

	public static AddressLayout colors$layout() {
		return colors$LAYOUT;
	}

	private static final long colors$OFFSET = $LAYOUT.byteOffset(groupElement("colors"));

	public static long colors$offset() {
		return colors$OFFSET;
	}

	public static MemorySegment colors(MemorySegment struct) {
		return struct.get(colors$LAYOUT, colors$OFFSET);
	}

	public static void colors(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(colors$LAYOUT, colors$OFFSET, fieldValue);
	}

	private static final OfInt version$LAYOUT = (OfInt) $LAYOUT.select(groupElement("version"));

	public static OfInt version$layout() {
		return version$LAYOUT;
	}

	private static final long version$OFFSET = $LAYOUT.byteOffset(groupElement("version"));

	public static long version$offset() {
		return version$OFFSET;
	}

	public static int version(MemorySegment struct) {
		return struct.get(version$LAYOUT, version$OFFSET);
	}

	public static void version(MemorySegment struct, int fieldValue) {
		struct.set(version$LAYOUT, version$OFFSET, fieldValue);
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
