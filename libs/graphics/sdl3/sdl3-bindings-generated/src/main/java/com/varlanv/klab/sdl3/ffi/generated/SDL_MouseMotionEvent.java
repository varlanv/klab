package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.*;

public class SDL_MouseMotionEvent {

	SDL_MouseMotionEvent() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("type"),
			SDL3.C_INT.withName("reserved"),
			SDL3.C_LONG.withName("timestamp"),
			SDL3.C_INT.withName("windowID"),
			SDL3.C_INT.withName("which"),
			SDL3.C_INT.withName("state"),
			SDL3.C_FLOAT.withName("x"),
			SDL3.C_FLOAT.withName("y"),
			SDL3.C_FLOAT.withName("xrel"),
			SDL3.C_FLOAT.withName("yrel"),
			MemoryLayout.paddingLayout(4)
	).withName("SDL_MouseMotionEvent");

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

	private static final OfInt state$LAYOUT = (OfInt) $LAYOUT.select(groupElement("state"));

	public static OfInt state$layout() {
		return state$LAYOUT;
	}

	private static final long state$OFFSET = $LAYOUT.byteOffset(groupElement("state"));

	public static long state$offset() {
		return state$OFFSET;
	}

	public static int state(MemorySegment struct) {
		return struct.get(state$LAYOUT, state$OFFSET);
	}

	public static void state(MemorySegment struct, int fieldValue) {
		struct.set(state$LAYOUT, state$OFFSET, fieldValue);
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

	private static final OfFloat xrel$LAYOUT = (OfFloat) $LAYOUT.select(groupElement("xrel"));

	public static OfFloat xrel$layout() {
		return xrel$LAYOUT;
	}

	private static final long xrel$OFFSET = $LAYOUT.byteOffset(groupElement("xrel"));

	public static long xrel$offset() {
		return xrel$OFFSET;
	}

	public static float xrel(MemorySegment struct) {
		return struct.get(xrel$LAYOUT, xrel$OFFSET);
	}

	public static void xrel(MemorySegment struct, float fieldValue) {
		struct.set(xrel$LAYOUT, xrel$OFFSET, fieldValue);
	}

	private static final OfFloat yrel$LAYOUT = (OfFloat) $LAYOUT.select(groupElement("yrel"));

	public static OfFloat yrel$layout() {
		return yrel$LAYOUT;
	}

	private static final long yrel$OFFSET = $LAYOUT.byteOffset(groupElement("yrel"));

	public static long yrel$offset() {
		return yrel$OFFSET;
	}

	public static float yrel(MemorySegment struct) {
		return struct.get(yrel$LAYOUT, yrel$OFFSET);
	}

	public static void yrel(MemorySegment struct, float fieldValue) {
		struct.set(yrel$LAYOUT, yrel$OFFSET, fieldValue);
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
