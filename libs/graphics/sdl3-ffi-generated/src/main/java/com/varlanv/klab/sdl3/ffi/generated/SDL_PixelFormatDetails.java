package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.MemoryLayout.PathElement.sequenceElement;
import static java.lang.foreign.ValueLayout.OfByte;
import static java.lang.foreign.ValueLayout.OfInt;

public class SDL_PixelFormatDetails {

	SDL_PixelFormatDetails() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("format"),
			SDL3.C_CHAR.withName("bits_per_pixel"),
			SDL3.C_CHAR.withName("bytes_per_pixel"),
			MemoryLayout.sequenceLayout(2, SDL3.C_CHAR).withName("padding"),
			SDL3.C_INT.withName("Rmask"),
			SDL3.C_INT.withName("Gmask"),
			SDL3.C_INT.withName("Bmask"),
			SDL3.C_INT.withName("Amask"),
			SDL3.C_CHAR.withName("Rbits"),
			SDL3.C_CHAR.withName("Gbits"),
			SDL3.C_CHAR.withName("Bbits"),
			SDL3.C_CHAR.withName("Abits"),
			SDL3.C_CHAR.withName("Rshift"),
			SDL3.C_CHAR.withName("Gshift"),
			SDL3.C_CHAR.withName("Bshift"),
			SDL3.C_CHAR.withName("Ashift")
	).withName("SDL_PixelFormatDetails");

	public static GroupLayout layout() {
		return $LAYOUT;
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

	private static final OfByte bits_per_pixel$LAYOUT = (OfByte) $LAYOUT.select(groupElement("bits_per_pixel"));

	public static OfByte bits_per_pixel$layout() {
		return bits_per_pixel$LAYOUT;
	}

	private static final long bits_per_pixel$OFFSET = $LAYOUT.byteOffset(groupElement("bits_per_pixel"));

	public static long bits_per_pixel$offset() {
		return bits_per_pixel$OFFSET;
	}

	public static byte bits_per_pixel(MemorySegment struct) {
		return struct.get(bits_per_pixel$LAYOUT, bits_per_pixel$OFFSET);
	}

	public static void bits_per_pixel(MemorySegment struct, byte fieldValue) {
		struct.set(bits_per_pixel$LAYOUT, bits_per_pixel$OFFSET, fieldValue);
	}

	private static final OfByte bytes_per_pixel$LAYOUT = (OfByte) $LAYOUT.select(groupElement("bytes_per_pixel"));

	public static OfByte bytes_per_pixel$layout() {
		return bytes_per_pixel$LAYOUT;
	}

	private static final long bytes_per_pixel$OFFSET = $LAYOUT.byteOffset(groupElement("bytes_per_pixel"));

	public static long bytes_per_pixel$offset() {
		return bytes_per_pixel$OFFSET;
	}

	public static byte bytes_per_pixel(MemorySegment struct) {
		return struct.get(bytes_per_pixel$LAYOUT, bytes_per_pixel$OFFSET);
	}

	public static void bytes_per_pixel(MemorySegment struct, byte fieldValue) {
		struct.set(bytes_per_pixel$LAYOUT, bytes_per_pixel$OFFSET, fieldValue);
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

	private static long[] padding$DIMS = {2};

	public static long[] padding$dimensions() {
		return padding$DIMS;
	}

	private static final VarHandle padding$ELEM_HANDLE = padding$LAYOUT.varHandle(sequenceElement());

	public static byte padding(MemorySegment struct, long index0) {
		return (byte) padding$ELEM_HANDLE.get(struct, padding$OFFSET, index0);
	}

	public static void padding(MemorySegment struct, long index0, byte fieldValue) {
		padding$ELEM_HANDLE.set(struct, padding$OFFSET, index0, fieldValue);
	}

	private static final OfInt Rmask$LAYOUT = (OfInt) $LAYOUT.select(groupElement("Rmask"));

	public static OfInt Rmask$layout() {
		return Rmask$LAYOUT;
	}

	private static final long Rmask$OFFSET = $LAYOUT.byteOffset(groupElement("Rmask"));

	public static long Rmask$offset() {
		return Rmask$OFFSET;
	}

	public static int Rmask(MemorySegment struct) {
		return struct.get(Rmask$LAYOUT, Rmask$OFFSET);
	}

	public static void Rmask(MemorySegment struct, int fieldValue) {
		struct.set(Rmask$LAYOUT, Rmask$OFFSET, fieldValue);
	}

	private static final OfInt Gmask$LAYOUT = (OfInt) $LAYOUT.select(groupElement("Gmask"));

	public static OfInt Gmask$layout() {
		return Gmask$LAYOUT;
	}

	private static final long Gmask$OFFSET = $LAYOUT.byteOffset(groupElement("Gmask"));

	public static long Gmask$offset() {
		return Gmask$OFFSET;
	}

	public static int Gmask(MemorySegment struct) {
		return struct.get(Gmask$LAYOUT, Gmask$OFFSET);
	}

	public static void Gmask(MemorySegment struct, int fieldValue) {
		struct.set(Gmask$LAYOUT, Gmask$OFFSET, fieldValue);
	}

	private static final OfInt Bmask$LAYOUT = (OfInt) $LAYOUT.select(groupElement("Bmask"));

	public static OfInt Bmask$layout() {
		return Bmask$LAYOUT;
	}

	private static final long Bmask$OFFSET = $LAYOUT.byteOffset(groupElement("Bmask"));

	public static long Bmask$offset() {
		return Bmask$OFFSET;
	}

	public static int Bmask(MemorySegment struct) {
		return struct.get(Bmask$LAYOUT, Bmask$OFFSET);
	}

	public static void Bmask(MemorySegment struct, int fieldValue) {
		struct.set(Bmask$LAYOUT, Bmask$OFFSET, fieldValue);
	}

	private static final OfInt Amask$LAYOUT = (OfInt) $LAYOUT.select(groupElement("Amask"));

	public static OfInt Amask$layout() {
		return Amask$LAYOUT;
	}

	private static final long Amask$OFFSET = $LAYOUT.byteOffset(groupElement("Amask"));

	public static long Amask$offset() {
		return Amask$OFFSET;
	}

	public static int Amask(MemorySegment struct) {
		return struct.get(Amask$LAYOUT, Amask$OFFSET);
	}

	public static void Amask(MemorySegment struct, int fieldValue) {
		struct.set(Amask$LAYOUT, Amask$OFFSET, fieldValue);
	}

	private static final OfByte Rbits$LAYOUT = (OfByte) $LAYOUT.select(groupElement("Rbits"));

	public static OfByte Rbits$layout() {
		return Rbits$LAYOUT;
	}

	private static final long Rbits$OFFSET = $LAYOUT.byteOffset(groupElement("Rbits"));

	public static long Rbits$offset() {
		return Rbits$OFFSET;
	}

	public static byte Rbits(MemorySegment struct) {
		return struct.get(Rbits$LAYOUT, Rbits$OFFSET);
	}

	public static void Rbits(MemorySegment struct, byte fieldValue) {
		struct.set(Rbits$LAYOUT, Rbits$OFFSET, fieldValue);
	}

	private static final OfByte Gbits$LAYOUT = (OfByte) $LAYOUT.select(groupElement("Gbits"));

	public static OfByte Gbits$layout() {
		return Gbits$LAYOUT;
	}

	private static final long Gbits$OFFSET = $LAYOUT.byteOffset(groupElement("Gbits"));

	public static long Gbits$offset() {
		return Gbits$OFFSET;
	}

	public static byte Gbits(MemorySegment struct) {
		return struct.get(Gbits$LAYOUT, Gbits$OFFSET);
	}

	public static void Gbits(MemorySegment struct, byte fieldValue) {
		struct.set(Gbits$LAYOUT, Gbits$OFFSET, fieldValue);
	}

	private static final OfByte Bbits$LAYOUT = (OfByte) $LAYOUT.select(groupElement("Bbits"));

	public static OfByte Bbits$layout() {
		return Bbits$LAYOUT;
	}

	private static final long Bbits$OFFSET = $LAYOUT.byteOffset(groupElement("Bbits"));

	public static long Bbits$offset() {
		return Bbits$OFFSET;
	}

	public static byte Bbits(MemorySegment struct) {
		return struct.get(Bbits$LAYOUT, Bbits$OFFSET);
	}

	public static void Bbits(MemorySegment struct, byte fieldValue) {
		struct.set(Bbits$LAYOUT, Bbits$OFFSET, fieldValue);
	}

	private static final OfByte Abits$LAYOUT = (OfByte) $LAYOUT.select(groupElement("Abits"));

	public static OfByte Abits$layout() {
		return Abits$LAYOUT;
	}

	private static final long Abits$OFFSET = $LAYOUT.byteOffset(groupElement("Abits"));

	public static long Abits$offset() {
		return Abits$OFFSET;
	}

	public static byte Abits(MemorySegment struct) {
		return struct.get(Abits$LAYOUT, Abits$OFFSET);
	}

	public static void Abits(MemorySegment struct, byte fieldValue) {
		struct.set(Abits$LAYOUT, Abits$OFFSET, fieldValue);
	}

	private static final OfByte Rshift$LAYOUT = (OfByte) $LAYOUT.select(groupElement("Rshift"));

	public static OfByte Rshift$layout() {
		return Rshift$LAYOUT;
	}

	private static final long Rshift$OFFSET = $LAYOUT.byteOffset(groupElement("Rshift"));

	public static long Rshift$offset() {
		return Rshift$OFFSET;
	}

	public static byte Rshift(MemorySegment struct) {
		return struct.get(Rshift$LAYOUT, Rshift$OFFSET);
	}

	public static void Rshift(MemorySegment struct, byte fieldValue) {
		struct.set(Rshift$LAYOUT, Rshift$OFFSET, fieldValue);
	}

	private static final OfByte Gshift$LAYOUT = (OfByte) $LAYOUT.select(groupElement("Gshift"));

	public static OfByte Gshift$layout() {
		return Gshift$LAYOUT;
	}

	private static final long Gshift$OFFSET = $LAYOUT.byteOffset(groupElement("Gshift"));

	public static long Gshift$offset() {
		return Gshift$OFFSET;
	}

	public static byte Gshift(MemorySegment struct) {
		return struct.get(Gshift$LAYOUT, Gshift$OFFSET);
	}

	public static void Gshift(MemorySegment struct, byte fieldValue) {
		struct.set(Gshift$LAYOUT, Gshift$OFFSET, fieldValue);
	}

	private static final OfByte Bshift$LAYOUT = (OfByte) $LAYOUT.select(groupElement("Bshift"));

	public static OfByte Bshift$layout() {
		return Bshift$LAYOUT;
	}

	private static final long Bshift$OFFSET = $LAYOUT.byteOffset(groupElement("Bshift"));

	public static long Bshift$offset() {
		return Bshift$OFFSET;
	}

	public static byte Bshift(MemorySegment struct) {
		return struct.get(Bshift$LAYOUT, Bshift$OFFSET);
	}

	public static void Bshift(MemorySegment struct, byte fieldValue) {
		struct.set(Bshift$LAYOUT, Bshift$OFFSET, fieldValue);
	}

	private static final OfByte Ashift$LAYOUT = (OfByte) $LAYOUT.select(groupElement("Ashift"));

	public static OfByte Ashift$layout() {
		return Ashift$LAYOUT;
	}

	private static final long Ashift$OFFSET = $LAYOUT.byteOffset(groupElement("Ashift"));

	public static long Ashift$offset() {
		return Ashift$OFFSET;
	}

	public static byte Ashift(MemorySegment struct) {
		return struct.get(Ashift$LAYOUT, Ashift$OFFSET);
	}

	public static void Ashift(MemorySegment struct, byte fieldValue) {
		struct.set(Ashift$LAYOUT, Ashift$OFFSET, fieldValue);
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
