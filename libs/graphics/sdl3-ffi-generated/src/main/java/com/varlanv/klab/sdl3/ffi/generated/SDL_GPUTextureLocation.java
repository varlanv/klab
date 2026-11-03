package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

public class SDL_GPUTextureLocation {

	SDL_GPUTextureLocation() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_POINTER.withName("texture"),
			SDL3.C_INT.withName("mip_level"),
			SDL3.C_INT.withName("layer"),
			SDL3.C_INT.withName("x"),
			SDL3.C_INT.withName("y"),
			SDL3.C_INT.withName("z"),
			MemoryLayout.paddingLayout(4)
	).withName("SDL_GPUTextureLocation");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final AddressLayout texture$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("texture"));

	public static AddressLayout texture$layout() {
		return texture$LAYOUT;
	}

	private static final long texture$OFFSET = $LAYOUT.byteOffset(groupElement("texture"));

	public static long texture$offset() {
		return texture$OFFSET;
	}

	public static MemorySegment texture(MemorySegment struct) {
		return struct.get(texture$LAYOUT, texture$OFFSET);
	}

	public static void texture(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(texture$LAYOUT, texture$OFFSET, fieldValue);
	}

	private static final OfInt mip_level$LAYOUT = (OfInt) $LAYOUT.select(groupElement("mip_level"));

	public static OfInt mip_level$layout() {
		return mip_level$LAYOUT;
	}

	private static final long mip_level$OFFSET = $LAYOUT.byteOffset(groupElement("mip_level"));

	public static long mip_level$offset() {
		return mip_level$OFFSET;
	}

	public static int mip_level(MemorySegment struct) {
		return struct.get(mip_level$LAYOUT, mip_level$OFFSET);
	}

	public static void mip_level(MemorySegment struct, int fieldValue) {
		struct.set(mip_level$LAYOUT, mip_level$OFFSET, fieldValue);
	}

	private static final OfInt layer$LAYOUT = (OfInt) $LAYOUT.select(groupElement("layer"));

	public static OfInt layer$layout() {
		return layer$LAYOUT;
	}

	private static final long layer$OFFSET = $LAYOUT.byteOffset(groupElement("layer"));

	public static long layer$offset() {
		return layer$OFFSET;
	}

	public static int layer(MemorySegment struct) {
		return struct.get(layer$LAYOUT, layer$OFFSET);
	}

	public static void layer(MemorySegment struct, int fieldValue) {
		struct.set(layer$LAYOUT, layer$OFFSET, fieldValue);
	}

	private static final OfInt x$LAYOUT = (OfInt) $LAYOUT.select(groupElement("x"));

	public static OfInt x$layout() {
		return x$LAYOUT;
	}

	private static final long x$OFFSET = $LAYOUT.byteOffset(groupElement("x"));

	public static long x$offset() {
		return x$OFFSET;
	}

	public static int x(MemorySegment struct) {
		return struct.get(x$LAYOUT, x$OFFSET);
	}

	public static void x(MemorySegment struct, int fieldValue) {
		struct.set(x$LAYOUT, x$OFFSET, fieldValue);
	}

	private static final OfInt y$LAYOUT = (OfInt) $LAYOUT.select(groupElement("y"));

	public static OfInt y$layout() {
		return y$LAYOUT;
	}

	private static final long y$OFFSET = $LAYOUT.byteOffset(groupElement("y"));

	public static long y$offset() {
		return y$OFFSET;
	}

	public static int y(MemorySegment struct) {
		return struct.get(y$LAYOUT, y$OFFSET);
	}

	public static void y(MemorySegment struct, int fieldValue) {
		struct.set(y$LAYOUT, y$OFFSET, fieldValue);
	}

	private static final OfInt z$LAYOUT = (OfInt) $LAYOUT.select(groupElement("z"));

	public static OfInt z$layout() {
		return z$LAYOUT;
	}

	private static final long z$OFFSET = $LAYOUT.byteOffset(groupElement("z"));

	public static long z$offset() {
		return z$OFFSET;
	}

	public static int z(MemorySegment struct) {
		return struct.get(z$LAYOUT, z$OFFSET);
	}

	public static void z(MemorySegment struct, int fieldValue) {
		struct.set(z$LAYOUT, z$OFFSET, fieldValue);
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
