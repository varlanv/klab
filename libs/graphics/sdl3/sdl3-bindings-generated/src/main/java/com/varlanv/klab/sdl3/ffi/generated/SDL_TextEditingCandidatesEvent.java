package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.*;

public class SDL_TextEditingCandidatesEvent {

	SDL_TextEditingCandidatesEvent() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("type"),
			SDL3.C_INT.withName("reserved"),
			SDL3.C_LONG.withName("timestamp"),
			SDL3.C_INT.withName("windowID"),
			MemoryLayout.paddingLayout(4),
			SDL3.C_POINTER.withName("candidates"),
			SDL3.C_INT.withName("num_candidates"),
			SDL3.C_INT.withName("selected_candidate"),
			SDL3.C_BOOL.withName("horizontal"),
			SDL3.C_CHAR.withName("padding1"),
			SDL3.C_CHAR.withName("padding2"),
			SDL3.C_CHAR.withName("padding3"),
			MemoryLayout.paddingLayout(4)
	).withName("SDL_TextEditingCandidatesEvent");

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

	private static final AddressLayout candidates$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("candidates"));

	public static AddressLayout candidates$layout() {
		return candidates$LAYOUT;
	}

	private static final long candidates$OFFSET = $LAYOUT.byteOffset(groupElement("candidates"));

	public static long candidates$offset() {
		return candidates$OFFSET;
	}

	public static MemorySegment candidates(MemorySegment struct) {
		return struct.get(candidates$LAYOUT, candidates$OFFSET);
	}

	public static void candidates(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(candidates$LAYOUT, candidates$OFFSET, fieldValue);
	}

	private static final OfInt num_candidates$LAYOUT = (OfInt) $LAYOUT.select(groupElement("num_candidates"));

	public static OfInt num_candidates$layout() {
		return num_candidates$LAYOUT;
	}

	private static final long num_candidates$OFFSET = $LAYOUT.byteOffset(groupElement("num_candidates"));

	public static long num_candidates$offset() {
		return num_candidates$OFFSET;
	}

	public static int num_candidates(MemorySegment struct) {
		return struct.get(num_candidates$LAYOUT, num_candidates$OFFSET);
	}

	public static void num_candidates(MemorySegment struct, int fieldValue) {
		struct.set(num_candidates$LAYOUT, num_candidates$OFFSET, fieldValue);
	}

	private static final OfInt selected_candidate$LAYOUT = (OfInt) $LAYOUT.select(groupElement("selected_candidate"));

	public static OfInt selected_candidate$layout() {
		return selected_candidate$LAYOUT;
	}

	private static final long selected_candidate$OFFSET = $LAYOUT.byteOffset(groupElement("selected_candidate"));

	public static long selected_candidate$offset() {
		return selected_candidate$OFFSET;
	}

	public static int selected_candidate(MemorySegment struct) {
		return struct.get(selected_candidate$LAYOUT, selected_candidate$OFFSET);
	}

	public static void selected_candidate(MemorySegment struct, int fieldValue) {
		struct.set(selected_candidate$LAYOUT, selected_candidate$OFFSET, fieldValue);
	}

	private static final OfBoolean horizontal$LAYOUT = (OfBoolean) $LAYOUT.select(groupElement("horizontal"));

	public static OfBoolean horizontal$layout() {
		return horizontal$LAYOUT;
	}

	private static final long horizontal$OFFSET = $LAYOUT.byteOffset(groupElement("horizontal"));

	public static long horizontal$offset() {
		return horizontal$OFFSET;
	}

	public static boolean horizontal(MemorySegment struct) {
		return struct.get(horizontal$LAYOUT, horizontal$OFFSET);
	}

	public static void horizontal(MemorySegment struct, boolean fieldValue) {
		struct.set(horizontal$LAYOUT, horizontal$OFFSET, fieldValue);
	}

	private static final OfByte padding1$LAYOUT = (OfByte) $LAYOUT.select(groupElement("padding1"));

	public static OfByte padding1$layout() {
		return padding1$LAYOUT;
	}

	private static final long padding1$OFFSET = $LAYOUT.byteOffset(groupElement("padding1"));

	public static long padding1$offset() {
		return padding1$OFFSET;
	}

	public static byte padding1(MemorySegment struct) {
		return struct.get(padding1$LAYOUT, padding1$OFFSET);
	}

	public static void padding1(MemorySegment struct, byte fieldValue) {
		struct.set(padding1$LAYOUT, padding1$OFFSET, fieldValue);
	}

	private static final OfByte padding2$LAYOUT = (OfByte) $LAYOUT.select(groupElement("padding2"));

	public static OfByte padding2$layout() {
		return padding2$LAYOUT;
	}

	private static final long padding2$OFFSET = $LAYOUT.byteOffset(groupElement("padding2"));

	public static long padding2$offset() {
		return padding2$OFFSET;
	}

	public static byte padding2(MemorySegment struct) {
		return struct.get(padding2$LAYOUT, padding2$OFFSET);
	}

	public static void padding2(MemorySegment struct, byte fieldValue) {
		struct.set(padding2$LAYOUT, padding2$OFFSET, fieldValue);
	}

	private static final OfByte padding3$LAYOUT = (OfByte) $LAYOUT.select(groupElement("padding3"));

	public static OfByte padding3$layout() {
		return padding3$LAYOUT;
	}

	private static final long padding3$OFFSET = $LAYOUT.byteOffset(groupElement("padding3"));

	public static long padding3$offset() {
		return padding3$OFFSET;
	}

	public static byte padding3(MemorySegment struct) {
		return struct.get(padding3$LAYOUT, padding3$OFFSET);
	}

	public static void padding3(MemorySegment struct, byte fieldValue) {
		struct.set(padding3$LAYOUT, padding3$OFFSET, fieldValue);
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
