package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.OfLong;

public class SDL_PenProximityEvent {

	SDL_PenProximityEvent() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("type"),
			SDL3.C_INT.withName("reserved"),
			SDL3.C_LONG.withName("timestamp"),
			SDL3.C_INT.withName("windowID"),
			SDL3.C_INT.withName("which"),
			SDL3.C_INT.withName("pen_state"),
			SDL3.C_INT.withName("device_type")
	).withName("SDL_PenProximityEvent");

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

	private static final OfInt pen_state$LAYOUT = (OfInt) $LAYOUT.select(groupElement("pen_state"));

	public static OfInt pen_state$layout() {
		return pen_state$LAYOUT;
	}

	private static final long pen_state$OFFSET = $LAYOUT.byteOffset(groupElement("pen_state"));

	public static long pen_state$offset() {
		return pen_state$OFFSET;
	}

	public static int pen_state(MemorySegment struct) {
		return struct.get(pen_state$LAYOUT, pen_state$OFFSET);
	}

	public static void pen_state(MemorySegment struct, int fieldValue) {
		struct.set(pen_state$LAYOUT, pen_state$OFFSET, fieldValue);
	}

	private static final OfInt device_type$LAYOUT = (OfInt) $LAYOUT.select(groupElement("device_type"));

	public static OfInt device_type$layout() {
		return device_type$LAYOUT;
	}

	private static final long device_type$OFFSET = $LAYOUT.byteOffset(groupElement("device_type"));

	public static long device_type$offset() {
		return device_type$OFFSET;
	}

	public static int device_type(MemorySegment struct) {
		return struct.get(device_type$LAYOUT, device_type$OFFSET);
	}

	public static void device_type(MemorySegment struct, int fieldValue) {
		struct.set(device_type$LAYOUT, device_type$OFFSET, fieldValue);
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
