package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

public class SDL_CameraSpec {

	SDL_CameraSpec() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("format"),
			SDL3.C_INT.withName("colorspace"),
			SDL3.C_INT.withName("width"),
			SDL3.C_INT.withName("height"),
			SDL3.C_INT.withName("framerate_numerator"),
			SDL3.C_INT.withName("framerate_denominator")
	).withName("SDL_CameraSpec");

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

	private static final OfInt colorspace$LAYOUT = (OfInt) $LAYOUT.select(groupElement("colorspace"));

	public static OfInt colorspace$layout() {
		return colorspace$LAYOUT;
	}

	private static final long colorspace$OFFSET = $LAYOUT.byteOffset(groupElement("colorspace"));

	public static long colorspace$offset() {
		return colorspace$OFFSET;
	}

	public static int colorspace(MemorySegment struct) {
		return struct.get(colorspace$LAYOUT, colorspace$OFFSET);
	}

	public static void colorspace(MemorySegment struct, int fieldValue) {
		struct.set(colorspace$LAYOUT, colorspace$OFFSET, fieldValue);
	}

	private static final OfInt width$LAYOUT = (OfInt) $LAYOUT.select(groupElement("width"));

	public static OfInt width$layout() {
		return width$LAYOUT;
	}

	private static final long width$OFFSET = $LAYOUT.byteOffset(groupElement("width"));

	public static long width$offset() {
		return width$OFFSET;
	}

	public static int width(MemorySegment struct) {
		return struct.get(width$LAYOUT, width$OFFSET);
	}

	public static void width(MemorySegment struct, int fieldValue) {
		struct.set(width$LAYOUT, width$OFFSET, fieldValue);
	}

	private static final OfInt height$LAYOUT = (OfInt) $LAYOUT.select(groupElement("height"));

	public static OfInt height$layout() {
		return height$LAYOUT;
	}

	private static final long height$OFFSET = $LAYOUT.byteOffset(groupElement("height"));

	public static long height$offset() {
		return height$OFFSET;
	}

	public static int height(MemorySegment struct) {
		return struct.get(height$LAYOUT, height$OFFSET);
	}

	public static void height(MemorySegment struct, int fieldValue) {
		struct.set(height$LAYOUT, height$OFFSET, fieldValue);
	}

	private static final OfInt framerate_numerator$LAYOUT = (OfInt) $LAYOUT.select(groupElement("framerate_numerator"));

	public static OfInt framerate_numerator$layout() {
		return framerate_numerator$LAYOUT;
	}

	private static final long framerate_numerator$OFFSET = $LAYOUT.byteOffset(groupElement("framerate_numerator"));

	public static long framerate_numerator$offset() {
		return framerate_numerator$OFFSET;
	}

	public static int framerate_numerator(MemorySegment struct) {
		return struct.get(framerate_numerator$LAYOUT, framerate_numerator$OFFSET);
	}

	public static void framerate_numerator(MemorySegment struct, int fieldValue) {
		struct.set(framerate_numerator$LAYOUT, framerate_numerator$OFFSET, fieldValue);
	}

	private static final OfInt framerate_denominator$LAYOUT = (OfInt) $LAYOUT.select(groupElement("framerate_denominator"));

	public static OfInt framerate_denominator$layout() {
		return framerate_denominator$LAYOUT;
	}

	private static final long framerate_denominator$OFFSET = $LAYOUT.byteOffset(groupElement("framerate_denominator"));

	public static long framerate_denominator$offset() {
		return framerate_denominator$OFFSET;
	}

	public static int framerate_denominator(MemorySegment struct) {
		return struct.get(framerate_denominator$LAYOUT, framerate_denominator$OFFSET);
	}

	public static void framerate_denominator(MemorySegment struct, int fieldValue) {
		struct.set(framerate_denominator$LAYOUT, framerate_denominator$OFFSET, fieldValue);
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
