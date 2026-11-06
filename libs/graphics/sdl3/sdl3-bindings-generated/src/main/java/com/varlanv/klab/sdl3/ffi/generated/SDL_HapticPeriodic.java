package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.OfShort;

public class SDL_HapticPeriodic {

	SDL_HapticPeriodic() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_SHORT.withName("type"),
			MemoryLayout.paddingLayout(2),
			SDL_HapticDirection.layout().withName("direction"),
			SDL3.C_INT.withName("length"),
			SDL3.C_SHORT.withName("delay"),
			SDL3.C_SHORT.withName("button"),
			SDL3.C_SHORT.withName("interval"),
			SDL3.C_SHORT.withName("period"),
			SDL3.C_SHORT.withName("magnitude"),
			SDL3.C_SHORT.withName("offset"),
			SDL3.C_SHORT.withName("phase"),
			SDL3.C_SHORT.withName("attack_length"),
			SDL3.C_SHORT.withName("attack_level"),
			SDL3.C_SHORT.withName("fade_length"),
			SDL3.C_SHORT.withName("fade_level"),
			MemoryLayout.paddingLayout(2)
	).withName("SDL_HapticPeriodic");

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

	private static final OfShort period$LAYOUT = (OfShort) $LAYOUT.select(groupElement("period"));

	public static OfShort period$layout() {
		return period$LAYOUT;
	}

	private static final long period$OFFSET = $LAYOUT.byteOffset(groupElement("period"));

	public static long period$offset() {
		return period$OFFSET;
	}

	public static short period(MemorySegment struct) {
		return struct.get(period$LAYOUT, period$OFFSET);
	}

	public static void period(MemorySegment struct, short fieldValue) {
		struct.set(period$LAYOUT, period$OFFSET, fieldValue);
	}

	private static final OfShort magnitude$LAYOUT = (OfShort) $LAYOUT.select(groupElement("magnitude"));

	public static OfShort magnitude$layout() {
		return magnitude$LAYOUT;
	}

	private static final long magnitude$OFFSET = $LAYOUT.byteOffset(groupElement("magnitude"));

	public static long magnitude$offset() {
		return magnitude$OFFSET;
	}

	public static short magnitude(MemorySegment struct) {
		return struct.get(magnitude$LAYOUT, magnitude$OFFSET);
	}

	public static void magnitude(MemorySegment struct, short fieldValue) {
		struct.set(magnitude$LAYOUT, magnitude$OFFSET, fieldValue);
	}

	private static final OfShort offset$LAYOUT = (OfShort) $LAYOUT.select(groupElement("offset"));

	public static OfShort offset$layout() {
		return offset$LAYOUT;
	}

	private static final long offset$OFFSET = $LAYOUT.byteOffset(groupElement("offset"));

	public static long offset$offset() {
		return offset$OFFSET;
	}

	public static short offset(MemorySegment struct) {
		return struct.get(offset$LAYOUT, offset$OFFSET);
	}

	public static void offset(MemorySegment struct, short fieldValue) {
		struct.set(offset$LAYOUT, offset$OFFSET, fieldValue);
	}

	private static final OfShort phase$LAYOUT = (OfShort) $LAYOUT.select(groupElement("phase"));

	public static OfShort phase$layout() {
		return phase$LAYOUT;
	}

	private static final long phase$OFFSET = $LAYOUT.byteOffset(groupElement("phase"));

	public static long phase$offset() {
		return phase$OFFSET;
	}

	public static short phase(MemorySegment struct) {
		return struct.get(phase$LAYOUT, phase$OFFSET);
	}

	public static void phase(MemorySegment struct, short fieldValue) {
		struct.set(phase$LAYOUT, phase$OFFSET, fieldValue);
	}

	private static final OfShort attack_length$LAYOUT = (OfShort) $LAYOUT.select(groupElement("attack_length"));

	public static OfShort attack_length$layout() {
		return attack_length$LAYOUT;
	}

	private static final long attack_length$OFFSET = $LAYOUT.byteOffset(groupElement("attack_length"));

	public static long attack_length$offset() {
		return attack_length$OFFSET;
	}

	public static short attack_length(MemorySegment struct) {
		return struct.get(attack_length$LAYOUT, attack_length$OFFSET);
	}

	public static void attack_length(MemorySegment struct, short fieldValue) {
		struct.set(attack_length$LAYOUT, attack_length$OFFSET, fieldValue);
	}

	private static final OfShort attack_level$LAYOUT = (OfShort) $LAYOUT.select(groupElement("attack_level"));

	public static OfShort attack_level$layout() {
		return attack_level$LAYOUT;
	}

	private static final long attack_level$OFFSET = $LAYOUT.byteOffset(groupElement("attack_level"));

	public static long attack_level$offset() {
		return attack_level$OFFSET;
	}

	public static short attack_level(MemorySegment struct) {
		return struct.get(attack_level$LAYOUT, attack_level$OFFSET);
	}

	public static void attack_level(MemorySegment struct, short fieldValue) {
		struct.set(attack_level$LAYOUT, attack_level$OFFSET, fieldValue);
	}

	private static final OfShort fade_length$LAYOUT = (OfShort) $LAYOUT.select(groupElement("fade_length"));

	public static OfShort fade_length$layout() {
		return fade_length$LAYOUT;
	}

	private static final long fade_length$OFFSET = $LAYOUT.byteOffset(groupElement("fade_length"));

	public static long fade_length$offset() {
		return fade_length$OFFSET;
	}

	public static short fade_length(MemorySegment struct) {
		return struct.get(fade_length$LAYOUT, fade_length$OFFSET);
	}

	public static void fade_length(MemorySegment struct, short fieldValue) {
		struct.set(fade_length$LAYOUT, fade_length$OFFSET, fieldValue);
	}

	private static final OfShort fade_level$LAYOUT = (OfShort) $LAYOUT.select(groupElement("fade_level"));

	public static OfShort fade_level$layout() {
		return fade_level$LAYOUT;
	}

	private static final long fade_level$OFFSET = $LAYOUT.byteOffset(groupElement("fade_level"));

	public static long fade_level$offset() {
		return fade_level$OFFSET;
	}

	public static short fade_level(MemorySegment struct) {
		return struct.get(fade_level$LAYOUT, fade_level$OFFSET);
	}

	public static void fade_level(MemorySegment struct, short fieldValue) {
		struct.set(fade_level$LAYOUT, fade_level$OFFSET, fieldValue);
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
