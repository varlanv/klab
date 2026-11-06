package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

public class SDL_GPUIndexedIndirectDrawCommand {

	SDL_GPUIndexedIndirectDrawCommand() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("num_indices"),
			SDL3.C_INT.withName("num_instances"),
			SDL3.C_INT.withName("first_index"),
			SDL3.C_INT.withName("vertex_offset"),
			SDL3.C_INT.withName("first_instance")
	).withName("SDL_GPUIndexedIndirectDrawCommand");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfInt num_indices$LAYOUT = (OfInt) $LAYOUT.select(groupElement("num_indices"));

	public static OfInt num_indices$layout() {
		return num_indices$LAYOUT;
	}

	private static final long num_indices$OFFSET = $LAYOUT.byteOffset(groupElement("num_indices"));

	public static long num_indices$offset() {
		return num_indices$OFFSET;
	}

	public static int num_indices(MemorySegment struct) {
		return struct.get(num_indices$LAYOUT, num_indices$OFFSET);
	}

	public static void num_indices(MemorySegment struct, int fieldValue) {
		struct.set(num_indices$LAYOUT, num_indices$OFFSET, fieldValue);
	}

	private static final OfInt num_instances$LAYOUT = (OfInt) $LAYOUT.select(groupElement("num_instances"));

	public static OfInt num_instances$layout() {
		return num_instances$LAYOUT;
	}

	private static final long num_instances$OFFSET = $LAYOUT.byteOffset(groupElement("num_instances"));

	public static long num_instances$offset() {
		return num_instances$OFFSET;
	}

	public static int num_instances(MemorySegment struct) {
		return struct.get(num_instances$LAYOUT, num_instances$OFFSET);
	}

	public static void num_instances(MemorySegment struct, int fieldValue) {
		struct.set(num_instances$LAYOUT, num_instances$OFFSET, fieldValue);
	}

	private static final OfInt first_index$LAYOUT = (OfInt) $LAYOUT.select(groupElement("first_index"));

	public static OfInt first_index$layout() {
		return first_index$LAYOUT;
	}

	private static final long first_index$OFFSET = $LAYOUT.byteOffset(groupElement("first_index"));

	public static long first_index$offset() {
		return first_index$OFFSET;
	}

	public static int first_index(MemorySegment struct) {
		return struct.get(first_index$LAYOUT, first_index$OFFSET);
	}

	public static void first_index(MemorySegment struct, int fieldValue) {
		struct.set(first_index$LAYOUT, first_index$OFFSET, fieldValue);
	}

	private static final OfInt vertex_offset$LAYOUT = (OfInt) $LAYOUT.select(groupElement("vertex_offset"));

	public static OfInt vertex_offset$layout() {
		return vertex_offset$LAYOUT;
	}

	private static final long vertex_offset$OFFSET = $LAYOUT.byteOffset(groupElement("vertex_offset"));

	public static long vertex_offset$offset() {
		return vertex_offset$OFFSET;
	}

	public static int vertex_offset(MemorySegment struct) {
		return struct.get(vertex_offset$LAYOUT, vertex_offset$OFFSET);
	}

	public static void vertex_offset(MemorySegment struct, int fieldValue) {
		struct.set(vertex_offset$LAYOUT, vertex_offset$OFFSET, fieldValue);
	}

	private static final OfInt first_instance$LAYOUT = (OfInt) $LAYOUT.select(groupElement("first_instance"));

	public static OfInt first_instance$layout() {
		return first_instance$LAYOUT;
	}

	private static final long first_instance$OFFSET = $LAYOUT.byteOffset(groupElement("first_instance"));

	public static long first_instance$offset() {
		return first_instance$OFFSET;
	}

	public static int first_instance(MemorySegment struct) {
		return struct.get(first_instance$LAYOUT, first_instance$OFFSET);
	}

	public static void first_instance(MemorySegment struct, int fieldValue) {
		struct.set(first_instance$LAYOUT, first_instance$OFFSET, fieldValue);
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
