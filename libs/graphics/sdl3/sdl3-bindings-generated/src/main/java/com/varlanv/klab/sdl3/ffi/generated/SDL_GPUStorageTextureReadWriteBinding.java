package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.*;

public class SDL_GPUStorageTextureReadWriteBinding {

	SDL_GPUStorageTextureReadWriteBinding() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_POINTER.withName("texture"),
			SDL3.C_INT.withName("mip_level"),
			SDL3.C_INT.withName("layer"),
			SDL3.C_BOOL.withName("cycle"),
			SDL3.C_CHAR.withName("padding1"),
			SDL3.C_CHAR.withName("padding2"),
			SDL3.C_CHAR.withName("padding3"),
			MemoryLayout.paddingLayout(4)
	).withName("SDL_GPUStorageTextureReadWriteBinding");

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

	private static final OfBoolean cycle$LAYOUT = (OfBoolean) $LAYOUT.select(groupElement("cycle"));

	public static OfBoolean cycle$layout() {
		return cycle$LAYOUT;
	}

	private static final long cycle$OFFSET = $LAYOUT.byteOffset(groupElement("cycle"));

	public static long cycle$offset() {
		return cycle$OFFSET;
	}

	public static boolean cycle(MemorySegment struct) {
		return struct.get(cycle$LAYOUT, cycle$OFFSET);
	}

	public static void cycle(MemorySegment struct, boolean fieldValue) {
		struct.set(cycle$LAYOUT, cycle$OFFSET, fieldValue);
	}

	private static final OfByte padding1$LAYOUT = (OfByte) $LAYOUT.select(groupElement("padding1"));

	public static OfByte padding1$layout() {
		return padding1$LAYOUT;
	}

	private static final long padding1$OFFSET = $LAYOUT.byteOffset(groupElement("padding1"));

	public static long padding1$offset() {
		return padding1$OFFSET;
	}

	public static byte padding1(MemorySegment struct) {
		return struct.get(padding1$LAYOUT, padding1$OFFSET);
	}

	public static void padding1(MemorySegment struct, byte fieldValue) {
		struct.set(padding1$LAYOUT, padding1$OFFSET, fieldValue);
	}

	private static final OfByte padding2$LAYOUT = (OfByte) $LAYOUT.select(groupElement("padding2"));

	public static OfByte padding2$layout() {
		return padding2$LAYOUT;
	}

	private static final long padding2$OFFSET = $LAYOUT.byteOffset(groupElement("padding2"));

	public static long padding2$offset() {
		return padding2$OFFSET;
	}

	public static byte padding2(MemorySegment struct) {
		return struct.get(padding2$LAYOUT, padding2$OFFSET);
	}

	public static void padding2(MemorySegment struct, byte fieldValue) {
		struct.set(padding2$LAYOUT, padding2$OFFSET, fieldValue);
	}

	private static final OfByte padding3$LAYOUT = (OfByte) $LAYOUT.select(groupElement("padding3"));

	public static OfByte padding3$layout() {
		return padding3$LAYOUT;
	}

	private static final long padding3$OFFSET = $LAYOUT.byteOffset(groupElement("padding3"));

	public static long padding3$offset() {
		return padding3$OFFSET;
	}

	public static byte padding3(MemorySegment struct) {
		return struct.get(padding3$LAYOUT, padding3$OFFSET);
	}

	public static void padding3(MemorySegment struct, byte fieldValue) {
		struct.set(padding3$LAYOUT, padding3$OFFSET, fieldValue);
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
