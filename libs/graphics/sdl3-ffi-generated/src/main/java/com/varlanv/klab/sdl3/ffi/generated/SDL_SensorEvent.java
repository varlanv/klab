package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.MemoryLayout.PathElement.sequenceElement;
import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.OfLong;

public class SDL_SensorEvent {

	SDL_SensorEvent() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("type"),
			SDL3.C_INT.withName("reserved"),
			SDL3.C_LONG.withName("timestamp"),
			SDL3.C_INT.withName("which"),
			MemoryLayout.sequenceLayout(6, SDL3.C_FLOAT).withName("data"),
			MemoryLayout.paddingLayout(4),
			SDL3.C_LONG.withName("sensor_timestamp")
	).withName("SDL_SensorEvent");

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

	private static final OfInt which$LAYOUT = (OfInt) $LAYOUT.select(groupElement("which"));

	public static OfInt which$layout() {
		return which$LAYOUT;
	}

	private static final long which$OFFSET = $LAYOUT.byteOffset(groupElement("which"));

	public static long which$offset() {
		return which$OFFSET;
	}

	public static int which(MemorySegment struct) {
		return struct.get(which$LAYOUT, which$OFFSET);
	}

	public static void which(MemorySegment struct, int fieldValue) {
		struct.set(which$LAYOUT, which$OFFSET, fieldValue);
	}

	private static final SequenceLayout data$LAYOUT = (SequenceLayout) $LAYOUT.select(groupElement("data"));

	public static SequenceLayout data$layout() {
		return data$LAYOUT;
	}

	private static final long data$OFFSET = $LAYOUT.byteOffset(groupElement("data"));

	public static long data$offset() {
		return data$OFFSET;
	}

	public static MemorySegment data(MemorySegment struct) {
		return struct.asSlice(data$OFFSET, data$LAYOUT.byteSize());
	}

	public static void data(MemorySegment struct, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, struct, data$OFFSET, data$LAYOUT.byteSize());
	}

	private static long[] data$DIMS = {6};

	public static long[] data$dimensions() {
		return data$DIMS;
	}

	private static final VarHandle data$ELEM_HANDLE = data$LAYOUT.varHandle(sequenceElement());

	public static float data(MemorySegment struct, long index0) {
		return (float) data$ELEM_HANDLE.get(struct, data$OFFSET, index0);
	}

	public static void data(MemorySegment struct, long index0, float fieldValue) {
		data$ELEM_HANDLE.set(struct, data$OFFSET, index0, fieldValue);
	}

	private static final OfLong sensor_timestamp$LAYOUT = (OfLong) $LAYOUT.select(groupElement("sensor_timestamp"));

	public static OfLong sensor_timestamp$layout() {
		return sensor_timestamp$LAYOUT;
	}

	private static final long sensor_timestamp$OFFSET = $LAYOUT.byteOffset(groupElement("sensor_timestamp"));

	public static long sensor_timestamp$offset() {
		return sensor_timestamp$OFFSET;
	}

	public static long sensor_timestamp(MemorySegment struct) {
		return struct.get(sensor_timestamp$LAYOUT, sensor_timestamp$OFFSET);
	}

	public static void sensor_timestamp(MemorySegment struct, long fieldValue) {
		struct.set(sensor_timestamp$LAYOUT, sensor_timestamp$OFFSET, fieldValue);
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
