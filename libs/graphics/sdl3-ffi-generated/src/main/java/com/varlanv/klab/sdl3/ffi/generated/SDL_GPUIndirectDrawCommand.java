package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

public class SDL_GPUIndirectDrawCommand {

	SDL_GPUIndirectDrawCommand() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("num_vertices"),
			SDL3.C_INT.withName("num_instances"),
			SDL3.C_INT.withName("first_vertex"),
			SDL3.C_INT.withName("first_instance")
	).withName("SDL_GPUIndirectDrawCommand");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfInt num_vertices$LAYOUT = (OfInt) $LAYOUT.select(groupElement("num_vertices"));

	public static OfInt num_vertices$layout() {
		return num_vertices$LAYOUT;
	}

	private static final long num_vertices$OFFSET = $LAYOUT.byteOffset(groupElement("num_vertices"));

	public static long num_vertices$offset() {
		return num_vertices$OFFSET;
	}

	public static int num_vertices(MemorySegment struct) {
		return struct.get(num_vertices$LAYOUT, num_vertices$OFFSET);
	}

	public static void num_vertices(MemorySegment struct, int fieldValue) {
		struct.set(num_vertices$LAYOUT, num_vertices$OFFSET, fieldValue);
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

	private static final OfInt first_vertex$LAYOUT = (OfInt) $LAYOUT.select(groupElement("first_vertex"));

	public static OfInt first_vertex$layout() {
		return first_vertex$LAYOUT;
	}

	private static final long first_vertex$OFFSET = $LAYOUT.byteOffset(groupElement("first_vertex"));

	public static long first_vertex$offset() {
		return first_vertex$OFFSET;
	}

	public static int first_vertex(MemorySegment struct) {
		return struct.get(first_vertex$LAYOUT, first_vertex$OFFSET);
	}

	public static void first_vertex(MemorySegment struct, int fieldValue) {
		struct.set(first_vertex$LAYOUT, first_vertex$OFFSET, fieldValue);
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
