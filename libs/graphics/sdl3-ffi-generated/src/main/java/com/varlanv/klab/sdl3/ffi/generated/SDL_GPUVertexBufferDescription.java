package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

public class SDL_GPUVertexBufferDescription {

	SDL_GPUVertexBufferDescription() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("slot"),
			SDL3.C_INT.withName("pitch"),
			SDL3.C_INT.withName("input_rate"),
			SDL3.C_INT.withName("instance_step_rate")
	).withName("SDL_GPUVertexBufferDescription");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfInt slot$LAYOUT = (OfInt) $LAYOUT.select(groupElement("slot"));

	public static OfInt slot$layout() {
		return slot$LAYOUT;
	}

	private static final long slot$OFFSET = $LAYOUT.byteOffset(groupElement("slot"));

	public static long slot$offset() {
		return slot$OFFSET;
	}

	public static int slot(MemorySegment struct) {
		return struct.get(slot$LAYOUT, slot$OFFSET);
	}

	public static void slot(MemorySegment struct, int fieldValue) {
		struct.set(slot$LAYOUT, slot$OFFSET, fieldValue);
	}

	private static final OfInt pitch$LAYOUT = (OfInt) $LAYOUT.select(groupElement("pitch"));

	public static OfInt pitch$layout() {
		return pitch$LAYOUT;
	}

	private static final long pitch$OFFSET = $LAYOUT.byteOffset(groupElement("pitch"));

	public static long pitch$offset() {
		return pitch$OFFSET;
	}

	public static int pitch(MemorySegment struct) {
		return struct.get(pitch$LAYOUT, pitch$OFFSET);
	}

	public static void pitch(MemorySegment struct, int fieldValue) {
		struct.set(pitch$LAYOUT, pitch$OFFSET, fieldValue);
	}

	private static final OfInt input_rate$LAYOUT = (OfInt) $LAYOUT.select(groupElement("input_rate"));

	public static OfInt input_rate$layout() {
		return input_rate$LAYOUT;
	}

	private static final long input_rate$OFFSET = $LAYOUT.byteOffset(groupElement("input_rate"));

	public static long input_rate$offset() {
		return input_rate$OFFSET;
	}

	public static int input_rate(MemorySegment struct) {
		return struct.get(input_rate$LAYOUT, input_rate$OFFSET);
	}

	public static void input_rate(MemorySegment struct, int fieldValue) {
		struct.set(input_rate$LAYOUT, input_rate$OFFSET, fieldValue);
	}

	private static final OfInt instance_step_rate$LAYOUT = (OfInt) $LAYOUT.select(groupElement("instance_step_rate"));

	public static OfInt instance_step_rate$layout() {
		return instance_step_rate$LAYOUT;
	}

	private static final long instance_step_rate$OFFSET = $LAYOUT.byteOffset(groupElement("instance_step_rate"));

	public static long instance_step_rate$offset() {
		return instance_step_rate$OFFSET;
	}

	public static int instance_step_rate(MemorySegment struct) {
		return struct.get(instance_step_rate$LAYOUT, instance_step_rate$OFFSET);
	}

	public static void instance_step_rate(MemorySegment struct, int fieldValue) {
		struct.set(instance_step_rate$LAYOUT, instance_step_rate$OFFSET, fieldValue);
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
