package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

public class SDL_AudioSpec {

	SDL_AudioSpec() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("format"),
			SDL3.C_INT.withName("channels"),
			SDL3.C_INT.withName("freq")
	).withName("SDL_AudioSpec");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfInt format$LAYOUT = (OfInt) $LAYOUT.select(groupElement("format"));

	public static OfInt format$layout() {
		return format$LAYOUT;
	}

	private static final long format$OFFSET = $LAYOUT.byteOffset(groupElement("format"));

	public static long format$offset() {
		return format$OFFSET;
	}

	public static int format(MemorySegment struct) {
		return struct.get(format$LAYOUT, format$OFFSET);
	}

	public static void format(MemorySegment struct, int fieldValue) {
		struct.set(format$LAYOUT, format$OFFSET, fieldValue);
	}

	private static final OfInt channels$LAYOUT = (OfInt) $LAYOUT.select(groupElement("channels"));

	public static OfInt channels$layout() {
		return channels$LAYOUT;
	}

	private static final long channels$OFFSET = $LAYOUT.byteOffset(groupElement("channels"));

	public static long channels$offset() {
		return channels$OFFSET;
	}

	public static int channels(MemorySegment struct) {
		return struct.get(channels$LAYOUT, channels$OFFSET);
	}

	public static void channels(MemorySegment struct, int fieldValue) {
		struct.set(channels$LAYOUT, channels$OFFSET, fieldValue);
	}

	private static final OfInt freq$LAYOUT = (OfInt) $LAYOUT.select(groupElement("freq"));

	public static OfInt freq$layout() {
		return freq$LAYOUT;
	}

	private static final long freq$OFFSET = $LAYOUT.byteOffset(groupElement("freq"));

	public static long freq$offset() {
		return freq$OFFSET;
	}

	public static int freq(MemorySegment struct) {
		return struct.get(freq$LAYOUT, freq$OFFSET);
	}

	public static void freq(MemorySegment struct, int fieldValue) {
		struct.set(freq$LAYOUT, freq$OFFSET, fieldValue);
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
