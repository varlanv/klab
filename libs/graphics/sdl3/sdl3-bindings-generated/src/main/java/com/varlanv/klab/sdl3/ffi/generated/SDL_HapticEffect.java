package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfShort;

public class SDL_HapticEffect {

	SDL_HapticEffect() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
			SDL3.C_SHORT.withName("type"),
			SDL_HapticConstant.layout().withName("constant"),
			SDL_HapticPeriodic.layout().withName("periodic"),
			SDL_HapticCondition.layout().withName("condition"),
			SDL_HapticRamp.layout().withName("ramp"),
			SDL_HapticLeftRight.layout().withName("leftright"),
			SDL_HapticCustom.layout().withName("custom"),
			MemoryLayout.paddingLayout(72)
	).withName("SDL_HapticEffect");

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

	public static short type(MemorySegment union) {
		return union.get(type$LAYOUT, type$OFFSET);
	}

	public static void type(MemorySegment union, short fieldValue) {
		union.set(type$LAYOUT, type$OFFSET, fieldValue);
	}

	private static final GroupLayout constant$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("constant"));

	public static GroupLayout constant$layout() {
		return constant$LAYOUT;
	}

	private static final long constant$OFFSET = $LAYOUT.byteOffset(groupElement("constant"));

	public static long constant$offset() {
		return constant$OFFSET;
	}

	public static MemorySegment constant(MemorySegment union) {
		return union.asSlice(constant$OFFSET, constant$LAYOUT.byteSize());
	}

	public static void constant(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, constant$OFFSET, constant$LAYOUT.byteSize());
	}

	private static final GroupLayout periodic$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("periodic"));

	public static GroupLayout periodic$layout() {
		return periodic$LAYOUT;
	}

	private static final long periodic$OFFSET = $LAYOUT.byteOffset(groupElement("periodic"));

	public static long periodic$offset() {
		return periodic$OFFSET;
	}

	public static MemorySegment periodic(MemorySegment union) {
		return union.asSlice(periodic$OFFSET, periodic$LAYOUT.byteSize());
	}

	public static void periodic(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, periodic$OFFSET, periodic$LAYOUT.byteSize());
	}

	private static final GroupLayout condition$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("condition"));

	public static GroupLayout condition$layout() {
		return condition$LAYOUT;
	}

	private static final long condition$OFFSET = $LAYOUT.byteOffset(groupElement("condition"));

	public static long condition$offset() {
		return condition$OFFSET;
	}

	public static MemorySegment condition(MemorySegment union) {
		return union.asSlice(condition$OFFSET, condition$LAYOUT.byteSize());
	}

	public static void condition(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, condition$OFFSET, condition$LAYOUT.byteSize());
	}

	private static final GroupLayout ramp$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("ramp"));

	public static GroupLayout ramp$layout() {
		return ramp$LAYOUT;
	}

	private static final long ramp$OFFSET = $LAYOUT.byteOffset(groupElement("ramp"));

	public static long ramp$offset() {
		return ramp$OFFSET;
	}

	public static MemorySegment ramp(MemorySegment union) {
		return union.asSlice(ramp$OFFSET, ramp$LAYOUT.byteSize());
	}

	public static void ramp(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, ramp$OFFSET, ramp$LAYOUT.byteSize());
	}

	private static final GroupLayout leftright$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("leftright"));

	public static GroupLayout leftright$layout() {
		return leftright$LAYOUT;
	}

	private static final long leftright$OFFSET = $LAYOUT.byteOffset(groupElement("leftright"));

	public static long leftright$offset() {
		return leftright$OFFSET;
	}

	public static MemorySegment leftright(MemorySegment union) {
		return union.asSlice(leftright$OFFSET, leftright$LAYOUT.byteSize());
	}

	public static void leftright(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, leftright$OFFSET, leftright$LAYOUT.byteSize());
	}

	private static final GroupLayout custom$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("custom"));

	public static GroupLayout custom$layout() {
		return custom$LAYOUT;
	}

	private static final long custom$OFFSET = $LAYOUT.byteOffset(groupElement("custom"));

	public static long custom$offset() {
		return custom$OFFSET;
	}

	public static MemorySegment custom(MemorySegment union) {
		return union.asSlice(custom$OFFSET, custom$LAYOUT.byteSize());
	}

	public static void custom(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, custom$OFFSET, custom$LAYOUT.byteSize());
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
