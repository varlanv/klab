package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.OfLong;

public class SDL_AsyncIOOutcome {

	SDL_AsyncIOOutcome() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_POINTER.withName("asyncio"),
			SDL3.C_INT.withName("type"),
			SDL3.C_INT.withName("result"),
			SDL3.C_POINTER.withName("buffer"),
			SDL3.C_LONG.withName("offset"),
			SDL3.C_LONG.withName("bytes_requested"),
			SDL3.C_LONG.withName("bytes_transferred"),
			SDL3.C_POINTER.withName("userdata")
	).withName("SDL_AsyncIOOutcome");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final AddressLayout asyncio$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("asyncio"));

	public static AddressLayout asyncio$layout() {
		return asyncio$LAYOUT;
	}

	private static final long asyncio$OFFSET = $LAYOUT.byteOffset(groupElement("asyncio"));

	public static long asyncio$offset() {
		return asyncio$OFFSET;
	}

	public static MemorySegment asyncio(MemorySegment struct) {
		return struct.get(asyncio$LAYOUT, asyncio$OFFSET);
	}

	public static void asyncio(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(asyncio$LAYOUT, asyncio$OFFSET, fieldValue);
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

	private static final OfInt result$LAYOUT = (OfInt) $LAYOUT.select(groupElement("result"));

	public static OfInt result$layout() {
		return result$LAYOUT;
	}

	private static final long result$OFFSET = $LAYOUT.byteOffset(groupElement("result"));

	public static long result$offset() {
		return result$OFFSET;
	}

	public static int result(MemorySegment struct) {
		return struct.get(result$LAYOUT, result$OFFSET);
	}

	public static void result(MemorySegment struct, int fieldValue) {
		struct.set(result$LAYOUT, result$OFFSET, fieldValue);
	}

	private static final AddressLayout buffer$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("buffer"));

	public static AddressLayout buffer$layout() {
		return buffer$LAYOUT;
	}

	private static final long buffer$OFFSET = $LAYOUT.byteOffset(groupElement("buffer"));

	public static long buffer$offset() {
		return buffer$OFFSET;
	}

	public static MemorySegment buffer(MemorySegment struct) {
		return struct.get(buffer$LAYOUT, buffer$OFFSET);
	}

	public static void buffer(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(buffer$LAYOUT, buffer$OFFSET, fieldValue);
	}

	private static final OfLong offset$LAYOUT = (OfLong) $LAYOUT.select(groupElement("offset"));

	public static OfLong offset$layout() {
		return offset$LAYOUT;
	}

	private static final long offset$OFFSET = $LAYOUT.byteOffset(groupElement("offset"));

	public static long offset$offset() {
		return offset$OFFSET;
	}

	public static long offset(MemorySegment struct) {
		return struct.get(offset$LAYOUT, offset$OFFSET);
	}

	public static void offset(MemorySegment struct, long fieldValue) {
		struct.set(offset$LAYOUT, offset$OFFSET, fieldValue);
	}

	private static final OfLong bytes_requested$LAYOUT = (OfLong) $LAYOUT.select(groupElement("bytes_requested"));

	public static OfLong bytes_requested$layout() {
		return bytes_requested$LAYOUT;
	}

	private static final long bytes_requested$OFFSET = $LAYOUT.byteOffset(groupElement("bytes_requested"));

	public static long bytes_requested$offset() {
		return bytes_requested$OFFSET;
	}

	public static long bytes_requested(MemorySegment struct) {
		return struct.get(bytes_requested$LAYOUT, bytes_requested$OFFSET);
	}

	public static void bytes_requested(MemorySegment struct, long fieldValue) {
		struct.set(bytes_requested$LAYOUT, bytes_requested$OFFSET, fieldValue);
	}

	private static final OfLong bytes_transferred$LAYOUT = (OfLong) $LAYOUT.select(groupElement("bytes_transferred"));

	public static OfLong bytes_transferred$layout() {
		return bytes_transferred$LAYOUT;
	}

	private static final long bytes_transferred$OFFSET = $LAYOUT.byteOffset(groupElement("bytes_transferred"));

	public static long bytes_transferred$offset() {
		return bytes_transferred$OFFSET;
	}

	public static long bytes_transferred(MemorySegment struct) {
		return struct.get(bytes_transferred$LAYOUT, bytes_transferred$OFFSET);
	}

	public static void bytes_transferred(MemorySegment struct, long fieldValue) {
		struct.set(bytes_transferred$LAYOUT, bytes_transferred$OFFSET, fieldValue);
	}

	private static final AddressLayout userdata$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("userdata"));

	public static AddressLayout userdata$layout() {
		return userdata$LAYOUT;
	}

	private static final long userdata$OFFSET = $LAYOUT.byteOffset(groupElement("userdata"));

	public static long userdata$offset() {
		return userdata$OFFSET;
	}

	public static MemorySegment userdata(MemorySegment struct) {
		return struct.get(userdata$LAYOUT, userdata$OFFSET);
	}

	public static void userdata(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(userdata$LAYOUT, userdata$OFFSET, fieldValue);
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
