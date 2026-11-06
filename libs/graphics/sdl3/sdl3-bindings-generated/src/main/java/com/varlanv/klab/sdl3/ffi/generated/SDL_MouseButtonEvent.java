package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.*;

public class SDL_MouseButtonEvent {

	SDL_MouseButtonEvent() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("type"),
			SDL3.C_INT.withName("reserved"),
			SDL3.C_LONG.withName("timestamp"),
			SDL3.C_INT.withName("windowID"),
			SDL3.C_INT.withName("which"),
			SDL3.C_CHAR.withName("button"),
			SDL3.C_BOOL.withName("down"),
			SDL3.C_CHAR.withName("clicks"),
			SDL3.C_CHAR.withName("padding"),
			SDL3.C_FLOAT.withName("x"),
			SDL3.C_FLOAT.withName("y"),
			MemoryLayout.paddingLayout(4)
	).withName("SDL_MouseButtonEvent");

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

	private static final OfByte button$LAYOUT = (OfByte) $LAYOUT.select(groupElement("button"));

	public static OfByte button$layout() {
		return button$LAYOUT;
	}

	private static final long button$OFFSET = $LAYOUT.byteOffset(groupElement("button"));

	public static long button$offset() {
		return button$OFFSET;
	}

	public static byte button(MemorySegment struct) {
		return struct.get(button$LAYOUT, button$OFFSET);
	}

	public static void button(MemorySegment struct, byte fieldValue) {
		struct.set(button$LAYOUT, button$OFFSET, fieldValue);
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

	private static final OfByte clicks$LAYOUT = (OfByte) $LAYOUT.select(groupElement("clicks"));

	public static OfByte clicks$layout() {
		return clicks$LAYOUT;
	}

	private static final long clicks$OFFSET = $LAYOUT.byteOffset(groupElement("clicks"));

	public static long clicks$offset() {
		return clicks$OFFSET;
	}

	public static byte clicks(MemorySegment struct) {
		return struct.get(clicks$LAYOUT, clicks$OFFSET);
	}

	public static void clicks(MemorySegment struct, byte fieldValue) {
		struct.set(clicks$LAYOUT, clicks$OFFSET, fieldValue);
	}

	private static final OfByte padding$LAYOUT = (OfByte) $LAYOUT.select(groupElement("padding"));

	public static OfByte padding$layout() {
		return padding$LAYOUT;
	}

	private static final long padding$OFFSET = $LAYOUT.byteOffset(groupElement("padding"));

	public static long padding$offset() {
		return padding$OFFSET;
	}

	public static byte padding(MemorySegment struct) {
		return struct.get(padding$LAYOUT, padding$OFFSET);
	}

	public static void padding(MemorySegment struct, byte fieldValue) {
		struct.set(padding$LAYOUT, padding$OFFSET, fieldValue);
	}

	private static final OfFloat x$LAYOUT = (OfFloat) $LAYOUT.select(groupElement("x"));

	public static OfFloat x$layout() {
		return x$LAYOUT;
	}

	private static final long x$OFFSET = $LAYOUT.byteOffset(groupElement("x"));

	public static long x$offset() {
		return x$OFFSET;
	}

	public static float x(MemorySegment struct) {
		return struct.get(x$LAYOUT, x$OFFSET);
	}

	public static void x(MemorySegment struct, float fieldValue) {
		struct.set(x$LAYOUT, x$OFFSET, fieldValue);
	}

	private static final OfFloat y$LAYOUT = (OfFloat) $LAYOUT.select(groupElement("y"));

	public static OfFloat y$layout() {
		return y$LAYOUT;
	}

	private static final long y$OFFSET = $LAYOUT.byteOffset(groupElement("y"));

	public static long y$offset() {
		return y$OFFSET;
	}

	public static float y(MemorySegment struct) {
		return struct.get(y$LAYOUT, y$OFFSET);
	}

	public static void y(MemorySegment struct, float fieldValue) {
		struct.set(y$LAYOUT, y$OFFSET, fieldValue);
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
