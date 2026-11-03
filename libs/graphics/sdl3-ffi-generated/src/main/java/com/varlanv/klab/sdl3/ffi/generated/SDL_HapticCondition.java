package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.MemoryLayout.PathElement.sequenceElement;
import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.OfShort;

public class SDL_HapticCondition {

	SDL_HapticCondition() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_SHORT.withName("type"),
			MemoryLayout.paddingLayout(2),
			SDL_HapticDirection.layout().withName("direction"),
			SDL3.C_INT.withName("length"),
			SDL3.C_SHORT.withName("delay"),
			SDL3.C_SHORT.withName("button"),
			SDL3.C_SHORT.withName("interval"),
			MemoryLayout.sequenceLayout(3, SDL3.C_SHORT).withName("right_sat"),
			MemoryLayout.sequenceLayout(3, SDL3.C_SHORT).withName("left_sat"),
			MemoryLayout.sequenceLayout(3, SDL3.C_SHORT).withName("right_coeff"),
			MemoryLayout.sequenceLayout(3, SDL3.C_SHORT).withName("left_coeff"),
			MemoryLayout.sequenceLayout(3, SDL3.C_SHORT).withName("deadband"),
			MemoryLayout.sequenceLayout(3, SDL3.C_SHORT).withName("center"),
			MemoryLayout.paddingLayout(2)
	).withName("SDL_HapticCondition");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfShort type$LAYOUT = (OfShort) $LAYOUT.select(groupElement("type"));

	public static OfShort type$layout() {
		return type$LAYOUT;
	}

	private static final long type$OFFSET = $LAYOUT.byteOffset(groupElement("type"));

	public static long type$offset() {
		return type$OFFSET;
	}

	public static short type(MemorySegment struct) {
		return struct.get(type$LAYOUT, type$OFFSET);
	}

	public static void type(MemorySegment struct, short fieldValue) {
		struct.set(type$LAYOUT, type$OFFSET, fieldValue);
	}

	private static final GroupLayout direction$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("direction"));

	public static GroupLayout direction$layout() {
		return direction$LAYOUT;
	}

	private static final long direction$OFFSET = $LAYOUT.byteOffset(groupElement("direction"));

	public static long direction$offset() {
		return direction$OFFSET;
	}

	public static MemorySegment direction(MemorySegment struct) {
		return struct.asSlice(direction$OFFSET, direction$LAYOUT.byteSize());
	}

	public static void direction(MemorySegment struct, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, struct, direction$OFFSET, direction$LAYOUT.byteSize());
	}

	private static final OfInt length$LAYOUT = (OfInt) $LAYOUT.select(groupElement("length"));

	public static OfInt length$layout() {
		return length$LAYOUT;
	}

	private static final long length$OFFSET = $LAYOUT.byteOffset(groupElement("length"));

	public static long length$offset() {
		return length$OFFSET;
	}

	public static int length(MemorySegment struct) {
		return struct.get(length$LAYOUT, length$OFFSET);
	}

	public static void length(MemorySegment struct, int fieldValue) {
		struct.set(length$LAYOUT, length$OFFSET, fieldValue);
	}

	private static final OfShort delay$LAYOUT = (OfShort) $LAYOUT.select(groupElement("delay"));

	public static OfShort delay$layout() {
		return delay$LAYOUT;
	}

	private static final long delay$OFFSET = $LAYOUT.byteOffset(groupElement("delay"));

	public static long delay$offset() {
		return delay$OFFSET;
	}

	public static short delay(MemorySegment struct) {
		return struct.get(delay$LAYOUT, delay$OFFSET);
	}

	public static void delay(MemorySegment struct, short fieldValue) {
		struct.set(delay$LAYOUT, delay$OFFSET, fieldValue);
	}

	private static final OfShort button$LAYOUT = (OfShort) $LAYOUT.select(groupElement("button"));

	public static OfShort button$layout() {
		return button$LAYOUT;
	}

	private static final long button$OFFSET = $LAYOUT.byteOffset(groupElement("button"));

	public static long button$offset() {
		return button$OFFSET;
	}

	public static short button(MemorySegment struct) {
		return struct.get(button$LAYOUT, button$OFFSET);
	}

	public static void button(MemorySegment struct, short fieldValue) {
		struct.set(button$LAYOUT, button$OFFSET, fieldValue);
	}

	private static final OfShort interval$LAYOUT = (OfShort) $LAYOUT.select(groupElement("interval"));

	public static OfShort interval$layout() {
		return interval$LAYOUT;
	}

	private static final long interval$OFFSET = $LAYOUT.byteOffset(groupElement("interval"));

	public static long interval$offset() {
		return interval$OFFSET;
	}

	public static short interval(MemorySegment struct) {
		return struct.get(interval$LAYOUT, interval$OFFSET);
	}

	public static void interval(MemorySegment struct, short fieldValue) {
		struct.set(interval$LAYOUT, interval$OFFSET, fieldValue);
	}

	private static final SequenceLayout right_sat$LAYOUT = (SequenceLayout) $LAYOUT.select(groupElement("right_sat"));

	public static SequenceLayout right_sat$layout() {
		return right_sat$LAYOUT;
	}

	private static final long right_sat$OFFSET = $LAYOUT.byteOffset(groupElement("right_sat"));

	public static long right_sat$offset() {
		return right_sat$OFFSET;
	}

	public static MemorySegment right_sat(MemorySegment struct) {
		return struct.asSlice(right_sat$OFFSET, right_sat$LAYOUT.byteSize());
	}

	public static void right_sat(MemorySegment struct, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, struct, right_sat$OFFSET, right_sat$LAYOUT.byteSize());
	}

	private static long[] right_sat$DIMS = {3};

	public static long[] right_sat$dimensions() {
		return right_sat$DIMS;
	}

	private static final VarHandle right_sat$ELEM_HANDLE = right_sat$LAYOUT.varHandle(sequenceElement());

	public static short right_sat(MemorySegment struct, long index0) {
		return (short) right_sat$ELEM_HANDLE.get(struct, right_sat$OFFSET, index0);
	}

	public static void right_sat(MemorySegment struct, long index0, short fieldValue) {
		right_sat$ELEM_HANDLE.set(struct, right_sat$OFFSET, index0, fieldValue);
	}

	private static final SequenceLayout left_sat$LAYOUT = (SequenceLayout) $LAYOUT.select(groupElement("left_sat"));

	public static SequenceLayout left_sat$layout() {
		return left_sat$LAYOUT;
	}

	private static final long left_sat$OFFSET = $LAYOUT.byteOffset(groupElement("left_sat"));

	public static long left_sat$offset() {
		return left_sat$OFFSET;
	}

	public static MemorySegment left_sat(MemorySegment struct) {
		return struct.asSlice(left_sat$OFFSET, left_sat$LAYOUT.byteSize());
	}

	public static void left_sat(MemorySegment struct, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, struct, left_sat$OFFSET, left_sat$LAYOUT.byteSize());
	}

	private static long[] left_sat$DIMS = {3};

	public static long[] left_sat$dimensions() {
		return left_sat$DIMS;
	}

	private static final VarHandle left_sat$ELEM_HANDLE = left_sat$LAYOUT.varHandle(sequenceElement());

	public static short left_sat(MemorySegment struct, long index0) {
		return (short) left_sat$ELEM_HANDLE.get(struct, left_sat$OFFSET, index0);
	}

	public static void left_sat(MemorySegment struct, long index0, short fieldValue) {
		left_sat$ELEM_HANDLE.set(struct, left_sat$OFFSET, index0, fieldValue);
	}

	private static final SequenceLayout right_coeff$LAYOUT = (SequenceLayout) $LAYOUT.select(groupElement("right_coeff"));

	public static SequenceLayout right_coeff$layout() {
		return right_coeff$LAYOUT;
	}

	private static final long right_coeff$OFFSET = $LAYOUT.byteOffset(groupElement("right_coeff"));

	public static long right_coeff$offset() {
		return right_coeff$OFFSET;
	}

	public static MemorySegment right_coeff(MemorySegment struct) {
		return struct.asSlice(right_coeff$OFFSET, right_coeff$LAYOUT.byteSize());
	}

	public static void right_coeff(MemorySegment struct, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, struct, right_coeff$OFFSET, right_coeff$LAYOUT.byteSize());
	}

	private static long[] right_coeff$DIMS = {3};

	public static long[] right_coeff$dimensions() {
		return right_coeff$DIMS;
	}

	private static final VarHandle right_coeff$ELEM_HANDLE = right_coeff$LAYOUT.varHandle(sequenceElement());

	public static short right_coeff(MemorySegment struct, long index0) {
		return (short) right_coeff$ELEM_HANDLE.get(struct, right_coeff$OFFSET, index0);
	}

	public static void right_coeff(MemorySegment struct, long index0, short fieldValue) {
		right_coeff$ELEM_HANDLE.set(struct, right_coeff$OFFSET, index0, fieldValue);
	}

	private static final SequenceLayout left_coeff$LAYOUT = (SequenceLayout) $LAYOUT.select(groupElement("left_coeff"));

	public static SequenceLayout left_coeff$layout() {
		return left_coeff$LAYOUT;
	}

	private static final long left_coeff$OFFSET = $LAYOUT.byteOffset(groupElement("left_coeff"));

	public static long left_coeff$offset() {
		return left_coeff$OFFSET;
	}

	public static MemorySegment left_coeff(MemorySegment struct) {
		return struct.asSlice(left_coeff$OFFSET, left_coeff$LAYOUT.byteSize());
	}

	public static void left_coeff(MemorySegment struct, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, struct, left_coeff$OFFSET, left_coeff$LAYOUT.byteSize());
	}

	private static long[] left_coeff$DIMS = {3};

	public static long[] left_coeff$dimensions() {
		return left_coeff$DIMS;
	}

	private static final VarHandle left_coeff$ELEM_HANDLE = left_coeff$LAYOUT.varHandle(sequenceElement());

	public static short left_coeff(MemorySegment struct, long index0) {
		return (short) left_coeff$ELEM_HANDLE.get(struct, left_coeff$OFFSET, index0);
	}

	public static void left_coeff(MemorySegment struct, long index0, short fieldValue) {
		left_coeff$ELEM_HANDLE.set(struct, left_coeff$OFFSET, index0, fieldValue);
	}

	private static final SequenceLayout deadband$LAYOUT = (SequenceLayout) $LAYOUT.select(groupElement("deadband"));

	public static SequenceLayout deadband$layout() {
		return deadband$LAYOUT;
	}

	private static final long deadband$OFFSET = $LAYOUT.byteOffset(groupElement("deadband"));

	public static long deadband$offset() {
		return deadband$OFFSET;
	}

	public static MemorySegment deadband(MemorySegment struct) {
		return struct.asSlice(deadband$OFFSET, deadband$LAYOUT.byteSize());
	}

	public static void deadband(MemorySegment struct, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, struct, deadband$OFFSET, deadband$LAYOUT.byteSize());
	}

	private static long[] deadband$DIMS = {3};

	public static long[] deadband$dimensions() {
		return deadband$DIMS;
	}

	private static final VarHandle deadband$ELEM_HANDLE = deadband$LAYOUT.varHandle(sequenceElement());

	public static short deadband(MemorySegment struct, long index0) {
		return (short) deadband$ELEM_HANDLE.get(struct, deadband$OFFSET, index0);
	}

	public static void deadband(MemorySegment struct, long index0, short fieldValue) {
		deadband$ELEM_HANDLE.set(struct, deadband$OFFSET, index0, fieldValue);
	}

	private static final SequenceLayout center$LAYOUT = (SequenceLayout) $LAYOUT.select(groupElement("center"));

	public static SequenceLayout center$layout() {
		return center$LAYOUT;
	}

	private static final long center$OFFSET = $LAYOUT.byteOffset(groupElement("center"));

	public static long center$offset() {
		return center$OFFSET;
	}

	public static MemorySegment center(MemorySegment struct) {
		return struct.asSlice(center$OFFSET, center$LAYOUT.byteSize());
	}

	public static void center(MemorySegment struct, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, struct, center$OFFSET, center$LAYOUT.byteSize());
	}

	private static long[] center$DIMS = {3};

	public static long[] center$dimensions() {
		return center$DIMS;
	}

	private static final VarHandle center$ELEM_HANDLE = center$LAYOUT.varHandle(sequenceElement());

	public static short center(MemorySegment struct, long index0) {
		return (short) center$ELEM_HANDLE.get(struct, center$OFFSET, index0);
	}

	public static void center(MemorySegment struct, long index0, short fieldValue) {
		center$ELEM_HANDLE.set(struct, center$OFFSET, index0, fieldValue);
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
