package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

public class SDL_GPUVertexInputState {

	SDL_GPUVertexInputState() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_POINTER.withName("vertex_buffer_descriptions"),
			SDL3.C_INT.withName("num_vertex_buffers"),
			MemoryLayout.paddingLayout(4),
			SDL3.C_POINTER.withName("vertex_attributes"),
			SDL3.C_INT.withName("num_vertex_attributes"),
			MemoryLayout.paddingLayout(4)
	).withName("SDL_GPUVertexInputState");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final AddressLayout vertex_buffer_descriptions$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("vertex_buffer_descriptions"));

	public static AddressLayout vertex_buffer_descriptions$layout() {
		return vertex_buffer_descriptions$LAYOUT;
	}

	private static final long vertex_buffer_descriptions$OFFSET = $LAYOUT.byteOffset(groupElement("vertex_buffer_descriptions"));

	public static long vertex_buffer_descriptions$offset() {
		return vertex_buffer_descriptions$OFFSET;
	}

	public static MemorySegment vertex_buffer_descriptions(MemorySegment struct) {
		return struct.get(vertex_buffer_descriptions$LAYOUT, vertex_buffer_descriptions$OFFSET);
	}

	public static void vertex_buffer_descriptions(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(vertex_buffer_descriptions$LAYOUT, vertex_buffer_descriptions$OFFSET, fieldValue);
	}

	private static final OfInt num_vertex_buffers$LAYOUT = (OfInt) $LAYOUT.select(groupElement("num_vertex_buffers"));

	public static OfInt num_vertex_buffers$layout() {
		return num_vertex_buffers$LAYOUT;
	}

	private static final long num_vertex_buffers$OFFSET = $LAYOUT.byteOffset(groupElement("num_vertex_buffers"));

	public static long num_vertex_buffers$offset() {
		return num_vertex_buffers$OFFSET;
	}

	public static int num_vertex_buffers(MemorySegment struct) {
		return struct.get(num_vertex_buffers$LAYOUT, num_vertex_buffers$OFFSET);
	}

	public static void num_vertex_buffers(MemorySegment struct, int fieldValue) {
		struct.set(num_vertex_buffers$LAYOUT, num_vertex_buffers$OFFSET, fieldValue);
	}

	private static final AddressLayout vertex_attributes$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("vertex_attributes"));

	public static AddressLayout vertex_attributes$layout() {
		return vertex_attributes$LAYOUT;
	}

	private static final long vertex_attributes$OFFSET = $LAYOUT.byteOffset(groupElement("vertex_attributes"));

	public static long vertex_attributes$offset() {
		return vertex_attributes$OFFSET;
	}

	public static MemorySegment vertex_attributes(MemorySegment struct) {
		return struct.get(vertex_attributes$LAYOUT, vertex_attributes$OFFSET);
	}

	public static void vertex_attributes(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(vertex_attributes$LAYOUT, vertex_attributes$OFFSET, fieldValue);
	}

	private static final OfInt num_vertex_attributes$LAYOUT = (OfInt) $LAYOUT.select(groupElement("num_vertex_attributes"));

	public static OfInt num_vertex_attributes$layout() {
		return num_vertex_attributes$LAYOUT;
	}

	private static final long num_vertex_attributes$OFFSET = $LAYOUT.byteOffset(groupElement("num_vertex_attributes"));

	public static long num_vertex_attributes$offset() {
		return num_vertex_attributes$OFFSET;
	}

	public static int num_vertex_attributes(MemorySegment struct) {
		return struct.get(num_vertex_attributes$LAYOUT, num_vertex_attributes$OFFSET);
	}

	public static void num_vertex_attributes(MemorySegment struct, int fieldValue) {
		struct.set(num_vertex_attributes$LAYOUT, num_vertex_attributes$OFFSET, fieldValue);
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
