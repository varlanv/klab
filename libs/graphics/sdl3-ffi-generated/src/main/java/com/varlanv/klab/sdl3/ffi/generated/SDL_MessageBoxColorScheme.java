package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.MemoryLayout.PathElement.sequenceElement;

public class SDL_MessageBoxColorScheme {

	SDL_MessageBoxColorScheme() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			MemoryLayout.sequenceLayout(5, SDL_MessageBoxColor.layout()).withName("colors")
	).withName("SDL_MessageBoxColorScheme");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final SequenceLayout colors$LAYOUT = (SequenceLayout) $LAYOUT.select(groupElement("colors"));

	public static SequenceLayout colors$layout() {
		return colors$LAYOUT;
	}

	private static final long colors$OFFSET = $LAYOUT.byteOffset(groupElement("colors"));

	public static long colors$offset() {
		return colors$OFFSET;
	}

	public static MemorySegment colors(MemorySegment struct) {
		return struct.asSlice(colors$OFFSET, colors$LAYOUT.byteSize());
	}

	public static void colors(MemorySegment struct, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, struct, colors$OFFSET, colors$LAYOUT.byteSize());
	}

	private static long[] colors$DIMS = {5};

	public static long[] colors$dimensions() {
		return colors$DIMS;
	}

	private static final MethodHandle colors$ELEM_HANDLE = colors$LAYOUT.sliceHandle(sequenceElement());

	public static MemorySegment colors(MemorySegment struct, long index0) {
		try {
			return (MemorySegment) colors$ELEM_HANDLE.invokeExact(struct, colors$OFFSET, index0);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	public static void colors(MemorySegment struct, long index0, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, colors(struct, index0), 0L, SDL_MessageBoxColor.layout().byteSize());
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
