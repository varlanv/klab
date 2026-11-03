package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;

public class SDL_Vertex {

	SDL_Vertex() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL_FPoint.layout().withName("position"),
			SDL_FColor.layout().withName("color"),
			SDL_FPoint.layout().withName("tex_coord")
	).withName("SDL_Vertex");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final GroupLayout position$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("position"));

	public static GroupLayout position$layout() {
		return position$LAYOUT;
	}

	private static final long position$OFFSET = $LAYOUT.byteOffset(groupElement("position"));

	public static long position$offset() {
		return position$OFFSET;
	}

	public static MemorySegment position(MemorySegment struct) {
		return struct.asSlice(position$OFFSET, position$LAYOUT.byteSize());
	}

	public static void position(MemorySegment struct, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, struct, position$OFFSET, position$LAYOUT.byteSize());
	}

	private static final GroupLayout color$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("color"));

	public static GroupLayout color$layout() {
		return color$LAYOUT;
	}

	private static final long color$OFFSET = $LAYOUT.byteOffset(groupElement("color"));

	public static long color$offset() {
		return color$OFFSET;
	}

	public static MemorySegment color(MemorySegment struct) {
		return struct.asSlice(color$OFFSET, color$LAYOUT.byteSize());
	}

	public static void color(MemorySegment struct, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, struct, color$OFFSET, color$LAYOUT.byteSize());
	}

	private static final GroupLayout tex_coord$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("tex_coord"));

	public static GroupLayout tex_coord$layout() {
		return tex_coord$LAYOUT;
	}

	private static final long tex_coord$OFFSET = $LAYOUT.byteOffset(groupElement("tex_coord"));

	public static long tex_coord$offset() {
		return tex_coord$OFFSET;
	}

	public static MemorySegment tex_coord(MemorySegment struct) {
		return struct.asSlice(tex_coord$OFFSET, tex_coord$LAYOUT.byteSize());
	}

	public static void tex_coord(MemorySegment struct, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, struct, tex_coord$OFFSET, tex_coord$LAYOUT.byteSize());
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
