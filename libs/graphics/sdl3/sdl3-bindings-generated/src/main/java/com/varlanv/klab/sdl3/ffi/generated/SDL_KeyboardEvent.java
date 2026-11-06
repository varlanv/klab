package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.*;

public class SDL_KeyboardEvent {

	SDL_KeyboardEvent() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("type"),
			SDL3.C_INT.withName("reserved"),
			SDL3.C_LONG.withName("timestamp"),
			SDL3.C_INT.withName("windowID"),
			SDL3.C_INT.withName("which"),
			SDL3.C_INT.withName("scancode"),
			SDL3.C_INT.withName("key"),
			SDL3.C_SHORT.withName("mod"),
			SDL3.C_SHORT.withName("raw"),
			SDL3.C_BOOL.withName("down"),
			SDL3.C_BOOL.withName("repeat"),
			MemoryLayout.paddingLayout(2)
	).withName("SDL_KeyboardEvent");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfInt type$LAYOUT = (OfInt) $LAYOUT.select(groupElement("type"));

	public static OfInt type$layout() {
		return type$LAYOUT;
	}

	private static final long type$OFFSET = $LAYOUT.byteOffset(groupElement("type"));

	public static long type$offset() {
		return type$OFFSET;
	}

	public static int type(MemorySegment struct) {
		return struct.get(type$LAYOUT, type$OFFSET);
	}

	public static void type(MemorySegment struct, int fieldValue) {
		struct.set(type$LAYOUT, type$OFFSET, fieldValue);
	}

	private static final OfInt reserved$LAYOUT = (OfInt) $LAYOUT.select(groupElement("reserved"));

	public static OfInt reserved$layout() {
		return reserved$LAYOUT;
	}

	private static final long reserved$OFFSET = $LAYOUT.byteOffset(groupElement("reserved"));

	public static long reserved$offset() {
		return reserved$OFFSET;
	}

	public static int reserved(MemorySegment struct) {
		return struct.get(reserved$LAYOUT, reserved$OFFSET);
	}

	public static void reserved(MemorySegment struct, int fieldValue) {
		struct.set(reserved$LAYOUT, reserved$OFFSET, fieldValue);
	}

	private static final OfLong timestamp$LAYOUT = (OfLong) $LAYOUT.select(groupElement("timestamp"));

	public static OfLong timestamp$layout() {
		return timestamp$LAYOUT;
	}

	private static final long timestamp$OFFSET = $LAYOUT.byteOffset(groupElement("timestamp"));

	public static long timestamp$offset() {
		return timestamp$OFFSET;
	}

	public static long timestamp(MemorySegment struct) {
		return struct.get(timestamp$LAYOUT, timestamp$OFFSET);
	}

	public static void timestamp(MemorySegment struct, long fieldValue) {
		struct.set(timestamp$LAYOUT, timestamp$OFFSET, fieldValue);
	}

	private static final OfInt windowID$LAYOUT = (OfInt) $LAYOUT.select(groupElement("windowID"));

	public static OfInt windowID$layout() {
		return windowID$LAYOUT;
	}

	private static final long windowID$OFFSET = $LAYOUT.byteOffset(groupElement("windowID"));

	public static long windowID$offset() {
		return windowID$OFFSET;
	}

	public static int windowID(MemorySegment struct) {
		return struct.get(windowID$LAYOUT, windowID$OFFSET);
	}

	public static void windowID(MemorySegment struct, int fieldValue) {
		struct.set(windowID$LAYOUT, windowID$OFFSET, fieldValue);
	}

	private static final OfInt which$LAYOUT = (OfInt) $LAYOUT.select(groupElement("which"));

	public static OfInt which$layout() {
		return which$LAYOUT;
	}

	private static final long which$OFFSET = $LAYOUT.byteOffset(groupElement("which"));

	public static long which$offset() {
		return which$OFFSET;
	}

	public static int which(MemorySegment struct) {
		return struct.get(which$LAYOUT, which$OFFSET);
	}

	public static void which(MemorySegment struct, int fieldValue) {
		struct.set(which$LAYOUT, which$OFFSET, fieldValue);
	}

	private static final OfInt scancode$LAYOUT = (OfInt) $LAYOUT.select(groupElement("scancode"));

	public static OfInt scancode$layout() {
		return scancode$LAYOUT;
	}

	private static final long scancode$OFFSET = $LAYOUT.byteOffset(groupElement("scancode"));

	public static long scancode$offset() {
		return scancode$OFFSET;
	}

	public static int scancode(MemorySegment struct) {
		return struct.get(scancode$LAYOUT, scancode$OFFSET);
	}

	public static void scancode(MemorySegment struct, int fieldValue) {
		struct.set(scancode$LAYOUT, scancode$OFFSET, fieldValue);
	}

	private static final OfInt key$LAYOUT = (OfInt) $LAYOUT.select(groupElement("key"));

	public static OfInt key$layout() {
		return key$LAYOUT;
	}

	private static final long key$OFFSET = $LAYOUT.byteOffset(groupElement("key"));

	public static long key$offset() {
		return key$OFFSET;
	}

	public static int key(MemorySegment struct) {
		return struct.get(key$LAYOUT, key$OFFSET);
	}

	public static void key(MemorySegment struct, int fieldValue) {
		struct.set(key$LAYOUT, key$OFFSET, fieldValue);
	}

	private static final OfShort mod$LAYOUT = (OfShort) $LAYOUT.select(groupElement("mod"));

	public static OfShort mod$layout() {
		return mod$LAYOUT;
	}

	private static final long mod$OFFSET = $LAYOUT.byteOffset(groupElement("mod"));

	public static long mod$offset() {
		return mod$OFFSET;
	}

	public static short mod(MemorySegment struct) {
		return struct.get(mod$LAYOUT, mod$OFFSET);
	}

	public static void mod(MemorySegment struct, short fieldValue) {
		struct.set(mod$LAYOUT, mod$OFFSET, fieldValue);
	}

	private static final OfShort raw$LAYOUT = (OfShort) $LAYOUT.select(groupElement("raw"));

	public static OfShort raw$layout() {
		return raw$LAYOUT;
	}

	private static final long raw$OFFSET = $LAYOUT.byteOffset(groupElement("raw"));

	public static long raw$offset() {
		return raw$OFFSET;
	}

	public static short raw(MemorySegment struct) {
		return struct.get(raw$LAYOUT, raw$OFFSET);
	}

	public static void raw(MemorySegment struct, short fieldValue) {
		struct.set(raw$LAYOUT, raw$OFFSET, fieldValue);
	}

	private static final OfBoolean down$LAYOUT = (OfBoolean) $LAYOUT.select(groupElement("down"));

	public static OfBoolean down$layout() {
		return down$LAYOUT;
	}

	private static final long down$OFFSET = $LAYOUT.byteOffset(groupElement("down"));

	public static long down$offset() {
		return down$OFFSET;
	}

	public static boolean down(MemorySegment struct) {
		return struct.get(down$LAYOUT, down$OFFSET);
	}

	public static void down(MemorySegment struct, boolean fieldValue) {
		struct.set(down$LAYOUT, down$OFFSET, fieldValue);
	}

	private static final OfBoolean repeat$LAYOUT = (OfBoolean) $LAYOUT.select(groupElement("repeat"));

	public static OfBoolean repeat$layout() {
		return repeat$LAYOUT;
	}

	private static final long repeat$OFFSET = $LAYOUT.byteOffset(groupElement("repeat"));

	public static long repeat$offset() {
		return repeat$OFFSET;
	}

	public static boolean repeat(MemorySegment struct) {
		return struct.get(repeat$LAYOUT, repeat$OFFSET);
	}

	public static void repeat(MemorySegment struct, boolean fieldValue) {
		struct.set(repeat$LAYOUT, repeat$OFFSET, fieldValue);
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
