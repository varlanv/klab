package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfBoolean;
import static java.lang.foreign.ValueLayout.OfInt;

public class SDL_AssertData {

	SDL_AssertData() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_BOOL.withName("always_ignore"),
			MemoryLayout.paddingLayout(3),
			SDL3.C_INT.withName("trigger_count"),
			SDL3.C_POINTER.withName("condition"),
			SDL3.C_POINTER.withName("filename"),
			SDL3.C_INT.withName("linenum"),
			MemoryLayout.paddingLayout(4),
			SDL3.C_POINTER.withName("function"),
			SDL3.C_POINTER.withName("next")
	).withName("SDL_AssertData");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfBoolean always_ignore$LAYOUT = (OfBoolean) $LAYOUT.select(groupElement("always_ignore"));

	public static OfBoolean always_ignore$layout() {
		return always_ignore$LAYOUT;
	}

	private static final long always_ignore$OFFSET = $LAYOUT.byteOffset(groupElement("always_ignore"));

	public static long always_ignore$offset() {
		return always_ignore$OFFSET;
	}

	public static boolean always_ignore(MemorySegment struct) {
		return struct.get(always_ignore$LAYOUT, always_ignore$OFFSET);
	}

	public static void always_ignore(MemorySegment struct, boolean fieldValue) {
		struct.set(always_ignore$LAYOUT, always_ignore$OFFSET, fieldValue);
	}

	private static final OfInt trigger_count$LAYOUT = (OfInt) $LAYOUT.select(groupElement("trigger_count"));

	public static OfInt trigger_count$layout() {
		return trigger_count$LAYOUT;
	}

	private static final long trigger_count$OFFSET = $LAYOUT.byteOffset(groupElement("trigger_count"));

	public static long trigger_count$offset() {
		return trigger_count$OFFSET;
	}

	public static int trigger_count(MemorySegment struct) {
		return struct.get(trigger_count$LAYOUT, trigger_count$OFFSET);
	}

	public static void trigger_count(MemorySegment struct, int fieldValue) {
		struct.set(trigger_count$LAYOUT, trigger_count$OFFSET, fieldValue);
	}

	private static final AddressLayout condition$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("condition"));

	public static AddressLayout condition$layout() {
		return condition$LAYOUT;
	}

	private static final long condition$OFFSET = $LAYOUT.byteOffset(groupElement("condition"));

	public static long condition$offset() {
		return condition$OFFSET;
	}

	public static MemorySegment condition(MemorySegment struct) {
		return struct.get(condition$LAYOUT, condition$OFFSET);
	}

	public static void condition(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(condition$LAYOUT, condition$OFFSET, fieldValue);
	}

	private static final AddressLayout filename$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("filename"));

	public static AddressLayout filename$layout() {
		return filename$LAYOUT;
	}

	private static final long filename$OFFSET = $LAYOUT.byteOffset(groupElement("filename"));

	public static long filename$offset() {
		return filename$OFFSET;
	}

	public static MemorySegment filename(MemorySegment struct) {
		return struct.get(filename$LAYOUT, filename$OFFSET);
	}

	public static void filename(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(filename$LAYOUT, filename$OFFSET, fieldValue);
	}

	private static final OfInt linenum$LAYOUT = (OfInt) $LAYOUT.select(groupElement("linenum"));

	public static OfInt linenum$layout() {
		return linenum$LAYOUT;
	}

	private static final long linenum$OFFSET = $LAYOUT.byteOffset(groupElement("linenum"));

	public static long linenum$offset() {
		return linenum$OFFSET;
	}

	public static int linenum(MemorySegment struct) {
		return struct.get(linenum$LAYOUT, linenum$OFFSET);
	}

	public static void linenum(MemorySegment struct, int fieldValue) {
		struct.set(linenum$LAYOUT, linenum$OFFSET, fieldValue);
	}

	private static final AddressLayout function$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("function"));

	public static AddressLayout function$layout() {
		return function$LAYOUT;
	}

	private static final long function$OFFSET = $LAYOUT.byteOffset(groupElement("function"));

	public static long function$offset() {
		return function$OFFSET;
	}

	public static MemorySegment function(MemorySegment struct) {
		return struct.get(function$LAYOUT, function$OFFSET);
	}

	public static void function(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(function$LAYOUT, function$OFFSET, fieldValue);
	}

	private static final AddressLayout next$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("next"));

	public static AddressLayout next$layout() {
		return next$LAYOUT;
	}

	private static final long next$OFFSET = $LAYOUT.byteOffset(groupElement("next"));

	public static long next$offset() {
		return next$OFFSET;
	}

	public static MemorySegment next(MemorySegment struct) {
		return struct.get(next$LAYOUT, next$OFFSET);
	}

	public static void next(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(next$LAYOUT, next$OFFSET, fieldValue);
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
