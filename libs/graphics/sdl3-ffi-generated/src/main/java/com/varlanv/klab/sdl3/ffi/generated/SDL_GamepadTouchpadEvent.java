package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.*;

public class SDL_GamepadTouchpadEvent {

	SDL_GamepadTouchpadEvent() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("type"),
			SDL3.C_INT.withName("reserved"),
			SDL3.C_LONG.withName("timestamp"),
			SDL3.C_INT.withName("which"),
			SDL3.C_INT.withName("touchpad"),
			SDL3.C_INT.withName("finger"),
			SDL3.C_FLOAT.withName("x"),
			SDL3.C_FLOAT.withName("y"),
			SDL3.C_FLOAT.withName("pressure")
	).withName("SDL_GamepadTouchpadEvent");

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

	private static final OfInt touchpad$LAYOUT = (OfInt) $LAYOUT.select(groupElement("touchpad"));

	public static OfInt touchpad$layout() {
		return touchpad$LAYOUT;
	}

	private static final long touchpad$OFFSET = $LAYOUT.byteOffset(groupElement("touchpad"));

	public static long touchpad$offset() {
		return touchpad$OFFSET;
	}

	public static int touchpad(MemorySegment struct) {
		return struct.get(touchpad$LAYOUT, touchpad$OFFSET);
	}

	public static void touchpad(MemorySegment struct, int fieldValue) {
		struct.set(touchpad$LAYOUT, touchpad$OFFSET, fieldValue);
	}

	private static final OfInt finger$LAYOUT = (OfInt) $LAYOUT.select(groupElement("finger"));

	public static OfInt finger$layout() {
		return finger$LAYOUT;
	}

	private static final long finger$OFFSET = $LAYOUT.byteOffset(groupElement("finger"));

	public static long finger$offset() {
		return finger$OFFSET;
	}

	public static int finger(MemorySegment struct) {
		return struct.get(finger$LAYOUT, finger$OFFSET);
	}

	public static void finger(MemorySegment struct, int fieldValue) {
		struct.set(finger$LAYOUT, finger$OFFSET, fieldValue);
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
