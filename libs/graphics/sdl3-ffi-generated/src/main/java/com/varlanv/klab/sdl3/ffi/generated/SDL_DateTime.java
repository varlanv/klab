package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

public class SDL_DateTime {

	SDL_DateTime() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("year"),
			SDL3.C_INT.withName("month"),
			SDL3.C_INT.withName("day"),
			SDL3.C_INT.withName("hour"),
			SDL3.C_INT.withName("minute"),
			SDL3.C_INT.withName("second"),
			SDL3.C_INT.withName("nanosecond"),
			SDL3.C_INT.withName("day_of_week"),
			SDL3.C_INT.withName("utc_offset")
	).withName("SDL_DateTime");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfInt year$LAYOUT = (OfInt) $LAYOUT.select(groupElement("year"));

	public static OfInt year$layout() {
		return year$LAYOUT;
	}

	private static final long year$OFFSET = $LAYOUT.byteOffset(groupElement("year"));

	public static long year$offset() {
		return year$OFFSET;
	}

	public static int year(MemorySegment struct) {
		return struct.get(year$LAYOUT, year$OFFSET);
	}

	public static void year(MemorySegment struct, int fieldValue) {
		struct.set(year$LAYOUT, year$OFFSET, fieldValue);
	}

	private static final OfInt month$LAYOUT = (OfInt) $LAYOUT.select(groupElement("month"));

	public static OfInt month$layout() {
		return month$LAYOUT;
	}

	private static final long month$OFFSET = $LAYOUT.byteOffset(groupElement("month"));

	public static long month$offset() {
		return month$OFFSET;
	}

	public static int month(MemorySegment struct) {
		return struct.get(month$LAYOUT, month$OFFSET);
	}

	public static void month(MemorySegment struct, int fieldValue) {
		struct.set(month$LAYOUT, month$OFFSET, fieldValue);
	}

	private static final OfInt day$LAYOUT = (OfInt) $LAYOUT.select(groupElement("day"));

	public static OfInt day$layout() {
		return day$LAYOUT;
	}

	private static final long day$OFFSET = $LAYOUT.byteOffset(groupElement("day"));

	public static long day$offset() {
		return day$OFFSET;
	}

	public static int day(MemorySegment struct) {
		return struct.get(day$LAYOUT, day$OFFSET);
	}

	public static void day(MemorySegment struct, int fieldValue) {
		struct.set(day$LAYOUT, day$OFFSET, fieldValue);
	}

	private static final OfInt hour$LAYOUT = (OfInt) $LAYOUT.select(groupElement("hour"));

	public static OfInt hour$layout() {
		return hour$LAYOUT;
	}

	private static final long hour$OFFSET = $LAYOUT.byteOffset(groupElement("hour"));

	public static long hour$offset() {
		return hour$OFFSET;
	}

	public static int hour(MemorySegment struct) {
		return struct.get(hour$LAYOUT, hour$OFFSET);
	}

	public static void hour(MemorySegment struct, int fieldValue) {
		struct.set(hour$LAYOUT, hour$OFFSET, fieldValue);
	}

	private static final OfInt minute$LAYOUT = (OfInt) $LAYOUT.select(groupElement("minute"));

	public static OfInt minute$layout() {
		return minute$LAYOUT;
	}

	private static final long minute$OFFSET = $LAYOUT.byteOffset(groupElement("minute"));

	public static long minute$offset() {
		return minute$OFFSET;
	}

	public static int minute(MemorySegment struct) {
		return struct.get(minute$LAYOUT, minute$OFFSET);
	}

	public static void minute(MemorySegment struct, int fieldValue) {
		struct.set(minute$LAYOUT, minute$OFFSET, fieldValue);
	}

	private static final OfInt second$LAYOUT = (OfInt) $LAYOUT.select(groupElement("second"));

	public static OfInt second$layout() {
		return second$LAYOUT;
	}

	private static final long second$OFFSET = $LAYOUT.byteOffset(groupElement("second"));

	public static long second$offset() {
		return second$OFFSET;
	}

	public static int second(MemorySegment struct) {
		return struct.get(second$LAYOUT, second$OFFSET);
	}

	public static void second(MemorySegment struct, int fieldValue) {
		struct.set(second$LAYOUT, second$OFFSET, fieldValue);
	}

	private static final OfInt nanosecond$LAYOUT = (OfInt) $LAYOUT.select(groupElement("nanosecond"));

	public static OfInt nanosecond$layout() {
		return nanosecond$LAYOUT;
	}

	private static final long nanosecond$OFFSET = $LAYOUT.byteOffset(groupElement("nanosecond"));

	public static long nanosecond$offset() {
		return nanosecond$OFFSET;
	}

	public static int nanosecond(MemorySegment struct) {
		return struct.get(nanosecond$LAYOUT, nanosecond$OFFSET);
	}

	public static void nanosecond(MemorySegment struct, int fieldValue) {
		struct.set(nanosecond$LAYOUT, nanosecond$OFFSET, fieldValue);
	}

	private static final OfInt day_of_week$LAYOUT = (OfInt) $LAYOUT.select(groupElement("day_of_week"));

	public static OfInt day_of_week$layout() {
		return day_of_week$LAYOUT;
	}

	private static final long day_of_week$OFFSET = $LAYOUT.byteOffset(groupElement("day_of_week"));

	public static long day_of_week$offset() {
		return day_of_week$OFFSET;
	}

	public static int day_of_week(MemorySegment struct) {
		return struct.get(day_of_week$LAYOUT, day_of_week$OFFSET);
	}

	public static void day_of_week(MemorySegment struct, int fieldValue) {
		struct.set(day_of_week$LAYOUT, day_of_week$OFFSET, fieldValue);
	}

	private static final OfInt utc_offset$LAYOUT = (OfInt) $LAYOUT.select(groupElement("utc_offset"));

	public static OfInt utc_offset$layout() {
		return utc_offset$LAYOUT;
	}

	private static final long utc_offset$OFFSET = $LAYOUT.byteOffset(groupElement("utc_offset"));

	public static long utc_offset$offset() {
		return utc_offset$OFFSET;
	}

	public static int utc_offset(MemorySegment struct) {
		return struct.get(utc_offset$LAYOUT, utc_offset$OFFSET);
	}

	public static void utc_offset(MemorySegment struct, int fieldValue) {
		struct.set(utc_offset$LAYOUT, utc_offset$OFFSET, fieldValue);
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
