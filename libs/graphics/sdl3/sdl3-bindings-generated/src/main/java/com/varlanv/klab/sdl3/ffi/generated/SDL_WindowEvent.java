package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.OfLong;

public class SDL_WindowEvent {

	SDL_WindowEvent() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("type"),
			SDL3.C_INT.withName("reserved"),
			SDL3.C_LONG.withName("timestamp"),
			SDL3.C_INT.withName("windowID"),
			SDL3.C_INT.withName("data1"),
			SDL3.C_INT.withName("data2"),
			MemoryLayout.paddingLayout(4)
	).withName("SDL_WindowEvent");

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

	private static final OfInt data1$LAYOUT = (OfInt) $LAYOUT.select(groupElement("data1"));

	public static OfInt data1$layout() {
		return data1$LAYOUT;
	}

	private static final long data1$OFFSET = $LAYOUT.byteOffset(groupElement("data1"));

	public static long data1$offset() {
		return data1$OFFSET;
	}

	public static int data1(MemorySegment struct) {
		return struct.get(data1$LAYOUT, data1$OFFSET);
	}

	public static void data1(MemorySegment struct, int fieldValue) {
		struct.set(data1$LAYOUT, data1$OFFSET, fieldValue);
	}

	private static final OfInt data2$LAYOUT = (OfInt) $LAYOUT.select(groupElement("data2"));

	public static OfInt data2$layout() {
		return data2$LAYOUT;
	}

	private static final long data2$OFFSET = $LAYOUT.byteOffset(groupElement("data2"));

	public static long data2$offset() {
		return data2$OFFSET;
	}

	public static int data2(MemorySegment struct) {
		return struct.get(data2$LAYOUT, data2$OFFSET);
	}

	public static void data2(MemorySegment struct, int fieldValue) {
		struct.set(data2$LAYOUT, data2$OFFSET, fieldValue);
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
