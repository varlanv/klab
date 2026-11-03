package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfFloat;
import static java.lang.foreign.ValueLayout.OfInt;

public class SDL_DisplayMode {

	SDL_DisplayMode() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("displayID"),
			SDL3.C_INT.withName("format"),
			SDL3.C_INT.withName("w"),
			SDL3.C_INT.withName("h"),
			SDL3.C_FLOAT.withName("pixel_density"),
			SDL3.C_FLOAT.withName("refresh_rate"),
			SDL3.C_INT.withName("refresh_rate_numerator"),
			SDL3.C_INT.withName("refresh_rate_denominator"),
			SDL3.C_POINTER.withName("internal")
	).withName("SDL_DisplayMode");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfInt displayID$LAYOUT = (OfInt) $LAYOUT.select(groupElement("displayID"));

	public static OfInt displayID$layout() {
		return displayID$LAYOUT;
	}

	private static final long displayID$OFFSET = $LAYOUT.byteOffset(groupElement("displayID"));

	public static long displayID$offset() {
		return displayID$OFFSET;
	}

	public static int displayID(MemorySegment struct) {
		return struct.get(displayID$LAYOUT, displayID$OFFSET);
	}

	public static void displayID(MemorySegment struct, int fieldValue) {
		struct.set(displayID$LAYOUT, displayID$OFFSET, fieldValue);
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

	private static final OfFloat pixel_density$LAYOUT = (OfFloat) $LAYOUT.select(groupElement("pixel_density"));

	public static OfFloat pixel_density$layout() {
		return pixel_density$LAYOUT;
	}

	private static final long pixel_density$OFFSET = $LAYOUT.byteOffset(groupElement("pixel_density"));

	public static long pixel_density$offset() {
		return pixel_density$OFFSET;
	}

	public static float pixel_density(MemorySegment struct) {
		return struct.get(pixel_density$LAYOUT, pixel_density$OFFSET);
	}

	public static void pixel_density(MemorySegment struct, float fieldValue) {
		struct.set(pixel_density$LAYOUT, pixel_density$OFFSET, fieldValue);
	}

	private static final OfFloat refresh_rate$LAYOUT = (OfFloat) $LAYOUT.select(groupElement("refresh_rate"));

	public static OfFloat refresh_rate$layout() {
		return refresh_rate$LAYOUT;
	}

	private static final long refresh_rate$OFFSET = $LAYOUT.byteOffset(groupElement("refresh_rate"));

	public static long refresh_rate$offset() {
		return refresh_rate$OFFSET;
	}

	public static float refresh_rate(MemorySegment struct) {
		return struct.get(refresh_rate$LAYOUT, refresh_rate$OFFSET);
	}

	public static void refresh_rate(MemorySegment struct, float fieldValue) {
		struct.set(refresh_rate$LAYOUT, refresh_rate$OFFSET, fieldValue);
	}

	private static final OfInt refresh_rate_numerator$LAYOUT = (OfInt) $LAYOUT.select(groupElement("refresh_rate_numerator"));

	public static OfInt refresh_rate_numerator$layout() {
		return refresh_rate_numerator$LAYOUT;
	}

	private static final long refresh_rate_numerator$OFFSET = $LAYOUT.byteOffset(groupElement("refresh_rate_numerator"));

	public static long refresh_rate_numerator$offset() {
		return refresh_rate_numerator$OFFSET;
	}

	public static int refresh_rate_numerator(MemorySegment struct) {
		return struct.get(refresh_rate_numerator$LAYOUT, refresh_rate_numerator$OFFSET);
	}

	public static void refresh_rate_numerator(MemorySegment struct, int fieldValue) {
		struct.set(refresh_rate_numerator$LAYOUT, refresh_rate_numerator$OFFSET, fieldValue);
	}

	private static final OfInt refresh_rate_denominator$LAYOUT = (OfInt) $LAYOUT.select(groupElement("refresh_rate_denominator"));

	public static OfInt refresh_rate_denominator$layout() {
		return refresh_rate_denominator$LAYOUT;
	}

	private static final long refresh_rate_denominator$OFFSET = $LAYOUT.byteOffset(groupElement("refresh_rate_denominator"));

	public static long refresh_rate_denominator$offset() {
		return refresh_rate_denominator$OFFSET;
	}

	public static int refresh_rate_denominator(MemorySegment struct) {
		return struct.get(refresh_rate_denominator$LAYOUT, refresh_rate_denominator$OFFSET);
	}

	public static void refresh_rate_denominator(MemorySegment struct, int fieldValue) {
		struct.set(refresh_rate_denominator$LAYOUT, refresh_rate_denominator$OFFSET, fieldValue);
	}

	private static final AddressLayout internal$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("internal"));

	public static AddressLayout internal$layout() {
		return internal$LAYOUT;
	}

	private static final long internal$OFFSET = $LAYOUT.byteOffset(groupElement("internal"));

	public static long internal$offset() {
		return internal$OFFSET;
	}

	public static MemorySegment internal(MemorySegment struct) {
		return struct.get(internal$LAYOUT, internal$OFFSET);
	}

	public static void internal(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(internal$LAYOUT, internal$OFFSET, fieldValue);
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
