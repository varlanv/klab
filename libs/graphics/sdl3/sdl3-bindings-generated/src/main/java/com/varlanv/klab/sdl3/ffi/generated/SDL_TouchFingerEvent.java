package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.*;

public class SDL_TouchFingerEvent {

	SDL_TouchFingerEvent() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("type"),
			SDL3.C_INT.withName("reserved"),
			SDL3.C_LONG.withName("timestamp"),
			SDL3.C_LONG.withName("touchID"),
			SDL3.C_LONG.withName("fingerID"),
			SDL3.C_FLOAT.withName("x"),
			SDL3.C_FLOAT.withName("y"),
			SDL3.C_FLOAT.withName("dx"),
			SDL3.C_FLOAT.withName("dy"),
			SDL3.C_FLOAT.withName("pressure"),
			SDL3.C_INT.withName("windowID")
	).withName("SDL_TouchFingerEvent");

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

	private static final OfLong touchID$LAYOUT = (OfLong) $LAYOUT.select(groupElement("touchID"));

	public static OfLong touchID$layout() {
		return touchID$LAYOUT;
	}

	private static final long touchID$OFFSET = $LAYOUT.byteOffset(groupElement("touchID"));

	public static long touchID$offset() {
		return touchID$OFFSET;
	}

	public static long touchID(MemorySegment struct) {
		return struct.get(touchID$LAYOUT, touchID$OFFSET);
	}

	public static void touchID(MemorySegment struct, long fieldValue) {
		struct.set(touchID$LAYOUT, touchID$OFFSET, fieldValue);
	}

	private static final OfLong fingerID$LAYOUT = (OfLong) $LAYOUT.select(groupElement("fingerID"));

	public static OfLong fingerID$layout() {
		return fingerID$LAYOUT;
	}

	private static final long fingerID$OFFSET = $LAYOUT.byteOffset(groupElement("fingerID"));

	public static long fingerID$offset() {
		return fingerID$OFFSET;
	}

	public static long fingerID(MemorySegment struct) {
		return struct.get(fingerID$LAYOUT, fingerID$OFFSET);
	}

	public static void fingerID(MemorySegment struct, long fieldValue) {
		struct.set(fingerID$LAYOUT, fingerID$OFFSET, fieldValue);
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

	private static final OfFloat dx$LAYOUT = (OfFloat) $LAYOUT.select(groupElement("dx"));

	public static OfFloat dx$layout() {
		return dx$LAYOUT;
	}

	private static final long dx$OFFSET = $LAYOUT.byteOffset(groupElement("dx"));

	public static long dx$offset() {
		return dx$OFFSET;
	}

	public static float dx(MemorySegment struct) {
		return struct.get(dx$LAYOUT, dx$OFFSET);
	}

	public static void dx(MemorySegment struct, float fieldValue) {
		struct.set(dx$LAYOUT, dx$OFFSET, fieldValue);
	}

	private static final OfFloat dy$LAYOUT = (OfFloat) $LAYOUT.select(groupElement("dy"));

	public static OfFloat dy$layout() {
		return dy$LAYOUT;
	}

	private static final long dy$OFFSET = $LAYOUT.byteOffset(groupElement("dy"));

	public static long dy$offset() {
		return dy$OFFSET;
	}

	public static float dy(MemorySegment struct) {
		return struct.get(dy$LAYOUT, dy$OFFSET);
	}

	public static void dy(MemorySegment struct, float fieldValue) {
		struct.set(dy$LAYOUT, dy$OFFSET, fieldValue);
	}

	private static final OfFloat pressure$LAYOUT = (OfFloat) $LAYOUT.select(groupElement("pressure"));

	public static OfFloat pressure$layout() {
		return pressure$LAYOUT;
	}

	private static final long pressure$OFFSET = $LAYOUT.byteOffset(groupElement("pressure"));

	public static long pressure$offset() {
		return pressure$OFFSET;
	}

	public static float pressure(MemorySegment struct) {
		return struct.get(pressure$LAYOUT, pressure$OFFSET);
	}

	public static void pressure(MemorySegment struct, float fieldValue) {
		struct.set(pressure$LAYOUT, pressure$OFFSET, fieldValue);
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
