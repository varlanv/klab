package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.*;

public class SDL_ClipboardEvent {

	SDL_ClipboardEvent() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("type"),
			SDL3.C_INT.withName("reserved"),
			SDL3.C_LONG.withName("timestamp"),
			SDL3.C_BOOL.withName("owner"),
			MemoryLayout.paddingLayout(3),
			SDL3.C_INT.withName("num_mime_types"),
			SDL3.C_POINTER.withName("mime_types")
	).withName("SDL_ClipboardEvent");

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

	private static final OfBoolean owner$LAYOUT = (OfBoolean) $LAYOUT.select(groupElement("owner"));

	public static OfBoolean owner$layout() {
		return owner$LAYOUT;
	}

	private static final long owner$OFFSET = $LAYOUT.byteOffset(groupElement("owner"));

	public static long owner$offset() {
		return owner$OFFSET;
	}

	public static boolean owner(MemorySegment struct) {
		return struct.get(owner$LAYOUT, owner$OFFSET);
	}

	public static void owner(MemorySegment struct, boolean fieldValue) {
		struct.set(owner$LAYOUT, owner$OFFSET, fieldValue);
	}

	private static final OfInt num_mime_types$LAYOUT = (OfInt) $LAYOUT.select(groupElement("num_mime_types"));

	public static OfInt num_mime_types$layout() {
		return num_mime_types$LAYOUT;
	}

	private static final long num_mime_types$OFFSET = $LAYOUT.byteOffset(groupElement("num_mime_types"));

	public static long num_mime_types$offset() {
		return num_mime_types$OFFSET;
	}

	public static int num_mime_types(MemorySegment struct) {
		return struct.get(num_mime_types$LAYOUT, num_mime_types$OFFSET);
	}

	public static void num_mime_types(MemorySegment struct, int fieldValue) {
		struct.set(num_mime_types$LAYOUT, num_mime_types$OFFSET, fieldValue);
	}

	private static final AddressLayout mime_types$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("mime_types"));

	public static AddressLayout mime_types$layout() {
		return mime_types$LAYOUT;
	}

	private static final long mime_types$OFFSET = $LAYOUT.byteOffset(groupElement("mime_types"));

	public static long mime_types$offset() {
		return mime_types$OFFSET;
	}

	public static MemorySegment mime_types(MemorySegment struct) {
		return struct.get(mime_types$LAYOUT, mime_types$OFFSET);
	}

	public static void mime_types(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(mime_types$LAYOUT, mime_types$OFFSET, fieldValue);
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
