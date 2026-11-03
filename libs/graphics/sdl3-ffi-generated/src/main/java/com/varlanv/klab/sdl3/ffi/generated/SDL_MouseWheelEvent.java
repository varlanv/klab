package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.*;

public class SDL_MouseWheelEvent {

	SDL_MouseWheelEvent() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("type"),
			SDL3.C_INT.withName("reserved"),
			SDL3.C_LONG.withName("timestamp"),
			SDL3.C_INT.withName("windowID"),
			SDL3.C_INT.withName("which"),
			SDL3.C_FLOAT.withName("x"),
			SDL3.C_FLOAT.withName("y"),
			SDL3.C_INT.withName("direction"),
			SDL3.C_FLOAT.withName("mouse_x"),
			SDL3.C_FLOAT.withName("mouse_y"),
			SDL3.C_INT.withName("integer_x"),
			SDL3.C_INT.withName("integer_y"),
			MemoryLayout.paddingLayout(4)
	).withName("SDL_MouseWheelEvent");

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

	private static final OfInt direction$LAYOUT = (OfInt) $LAYOUT.select(groupElement("direction"));

	public static OfInt direction$layout() {
		return direction$LAYOUT;
	}

	private static final long direction$OFFSET = $LAYOUT.byteOffset(groupElement("direction"));

	public static long direction$offset() {
		return direction$OFFSET;
	}

	public static int direction(MemorySegment struct) {
		return struct.get(direction$LAYOUT, direction$OFFSET);
	}

	public static void direction(MemorySegment struct, int fieldValue) {
		struct.set(direction$LAYOUT, direction$OFFSET, fieldValue);
	}

	private static final OfFloat mouse_x$LAYOUT = (OfFloat) $LAYOUT.select(groupElement("mouse_x"));

	public static OfFloat mouse_x$layout() {
		return mouse_x$LAYOUT;
	}

	private static final long mouse_x$OFFSET = $LAYOUT.byteOffset(groupElement("mouse_x"));

	public static long mouse_x$offset() {
		return mouse_x$OFFSET;
	}

	public static float mouse_x(MemorySegment struct) {
		return struct.get(mouse_x$LAYOUT, mouse_x$OFFSET);
	}

	public static void mouse_x(MemorySegment struct, float fieldValue) {
		struct.set(mouse_x$LAYOUT, mouse_x$OFFSET, fieldValue);
	}

	private static final OfFloat mouse_y$LAYOUT = (OfFloat) $LAYOUT.select(groupElement("mouse_y"));

	public static OfFloat mouse_y$layout() {
		return mouse_y$LAYOUT;
	}

	private static final long mouse_y$OFFSET = $LAYOUT.byteOffset(groupElement("mouse_y"));

	public static long mouse_y$offset() {
		return mouse_y$OFFSET;
	}

	public static float mouse_y(MemorySegment struct) {
		return struct.get(mouse_y$LAYOUT, mouse_y$OFFSET);
	}

	public static void mouse_y(MemorySegment struct, float fieldValue) {
		struct.set(mouse_y$LAYOUT, mouse_y$OFFSET, fieldValue);
	}

	private static final OfInt integer_x$LAYOUT = (OfInt) $LAYOUT.select(groupElement("integer_x"));

	public static OfInt integer_x$layout() {
		return integer_x$LAYOUT;
	}

	private static final long integer_x$OFFSET = $LAYOUT.byteOffset(groupElement("integer_x"));

	public static long integer_x$offset() {
		return integer_x$OFFSET;
	}

	public static int integer_x(MemorySegment struct) {
		return struct.get(integer_x$LAYOUT, integer_x$OFFSET);
	}

	public static void integer_x(MemorySegment struct, int fieldValue) {
		struct.set(integer_x$LAYOUT, integer_x$OFFSET, fieldValue);
	}

	private static final OfInt integer_y$LAYOUT = (OfInt) $LAYOUT.select(groupElement("integer_y"));

	public static OfInt integer_y$layout() {
		return integer_y$LAYOUT;
	}

	private static final long integer_y$OFFSET = $LAYOUT.byteOffset(groupElement("integer_y"));

	public static long integer_y$offset() {
		return integer_y$OFFSET;
	}

	public static int integer_y(MemorySegment struct) {
		return struct.get(integer_y$LAYOUT, integer_y$OFFSET);
	}

	public static void integer_y(MemorySegment struct, int fieldValue) {
		struct.set(integer_y$LAYOUT, integer_y$OFFSET, fieldValue);
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
