package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

public class SDL_GPURenderStateCreateInfo {

	SDL_GPURenderStateCreateInfo() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_POINTER.withName("fragment_shader"),
			SDL3.C_INT.withName("num_sampler_bindings"),
			MemoryLayout.paddingLayout(4),
			SDL3.C_POINTER.withName("sampler_bindings"),
			SDL3.C_INT.withName("num_storage_textures"),
			MemoryLayout.paddingLayout(4),
			SDL3.C_POINTER.withName("storage_textures"),
			SDL3.C_INT.withName("num_storage_buffers"),
			MemoryLayout.paddingLayout(4),
			SDL3.C_POINTER.withName("storage_buffers"),
			SDL3.C_INT.withName("props"),
			MemoryLayout.paddingLayout(4)
	).withName("SDL_GPURenderStateCreateInfo");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final AddressLayout fragment_shader$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("fragment_shader"));

	public static AddressLayout fragment_shader$layout() {
		return fragment_shader$LAYOUT;
	}

	private static final long fragment_shader$OFFSET = $LAYOUT.byteOffset(groupElement("fragment_shader"));

	public static long fragment_shader$offset() {
		return fragment_shader$OFFSET;
	}

	public static MemorySegment fragment_shader(MemorySegment struct) {
		return struct.get(fragment_shader$LAYOUT, fragment_shader$OFFSET);
	}

	public static void fragment_shader(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(fragment_shader$LAYOUT, fragment_shader$OFFSET, fieldValue);
	}

	private static final OfInt num_sampler_bindings$LAYOUT = (OfInt) $LAYOUT.select(groupElement("num_sampler_bindings"));

	public static OfInt num_sampler_bindings$layout() {
		return num_sampler_bindings$LAYOUT;
	}

	private static final long num_sampler_bindings$OFFSET = $LAYOUT.byteOffset(groupElement("num_sampler_bindings"));

	public static long num_sampler_bindings$offset() {
		return num_sampler_bindings$OFFSET;
	}

	public static int num_sampler_bindings(MemorySegment struct) {
		return struct.get(num_sampler_bindings$LAYOUT, num_sampler_bindings$OFFSET);
	}

	public static void num_sampler_bindings(MemorySegment struct, int fieldValue) {
		struct.set(num_sampler_bindings$LAYOUT, num_sampler_bindings$OFFSET, fieldValue);
	}

	private static final AddressLayout sampler_bindings$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("sampler_bindings"));

	public static AddressLayout sampler_bindings$layout() {
		return sampler_bindings$LAYOUT;
	}

	private static final long sampler_bindings$OFFSET = $LAYOUT.byteOffset(groupElement("sampler_bindings"));

	public static long sampler_bindings$offset() {
		return sampler_bindings$OFFSET;
	}

	public static MemorySegment sampler_bindings(MemorySegment struct) {
		return struct.get(sampler_bindings$LAYOUT, sampler_bindings$OFFSET);
	}

	public static void sampler_bindings(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(sampler_bindings$LAYOUT, sampler_bindings$OFFSET, fieldValue);
	}

	private static final OfInt num_storage_textures$LAYOUT = (OfInt) $LAYOUT.select(groupElement("num_storage_textures"));

	public static OfInt num_storage_textures$layout() {
		return num_storage_textures$LAYOUT;
	}

	private static final long num_storage_textures$OFFSET = $LAYOUT.byteOffset(groupElement("num_storage_textures"));

	public static long num_storage_textures$offset() {
		return num_storage_textures$OFFSET;
	}

	public static int num_storage_textures(MemorySegment struct) {
		return struct.get(num_storage_textures$LAYOUT, num_storage_textures$OFFSET);
	}

	public static void num_storage_textures(MemorySegment struct, int fieldValue) {
		struct.set(num_storage_textures$LAYOUT, num_storage_textures$OFFSET, fieldValue);
	}

	private static final AddressLayout storage_textures$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("storage_textures"));

	public static AddressLayout storage_textures$layout() {
		return storage_textures$LAYOUT;
	}

	private static final long storage_textures$OFFSET = $LAYOUT.byteOffset(groupElement("storage_textures"));

	public static long storage_textures$offset() {
		return storage_textures$OFFSET;
	}

	public static MemorySegment storage_textures(MemorySegment struct) {
		return struct.get(storage_textures$LAYOUT, storage_textures$OFFSET);
	}

	public static void storage_textures(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(storage_textures$LAYOUT, storage_textures$OFFSET, fieldValue);
	}

	private static final OfInt num_storage_buffers$LAYOUT = (OfInt) $LAYOUT.select(groupElement("num_storage_buffers"));

	public static OfInt num_storage_buffers$layout() {
		return num_storage_buffers$LAYOUT;
	}

	private static final long num_storage_buffers$OFFSET = $LAYOUT.byteOffset(groupElement("num_storage_buffers"));

	public static long num_storage_buffers$offset() {
		return num_storage_buffers$OFFSET;
	}

	public static int num_storage_buffers(MemorySegment struct) {
		return struct.get(num_storage_buffers$LAYOUT, num_storage_buffers$OFFSET);
	}

	public static void num_storage_buffers(MemorySegment struct, int fieldValue) {
		struct.set(num_storage_buffers$LAYOUT, num_storage_buffers$OFFSET, fieldValue);
	}

	private static final AddressLayout storage_buffers$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("storage_buffers"));

	public static AddressLayout storage_buffers$layout() {
		return storage_buffers$LAYOUT;
	}

	private static final long storage_buffers$OFFSET = $LAYOUT.byteOffset(groupElement("storage_buffers"));

	public static long storage_buffers$offset() {
		return storage_buffers$OFFSET;
	}

	public static MemorySegment storage_buffers(MemorySegment struct) {
		return struct.get(storage_buffers$LAYOUT, storage_buffers$OFFSET);
	}

	public static void storage_buffers(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(storage_buffers$LAYOUT, storage_buffers$OFFSET, fieldValue);
	}

	private static final OfInt props$LAYOUT = (OfInt) $LAYOUT.select(groupElement("props"));

	public static OfInt props$layout() {
		return props$LAYOUT;
	}

	private static final long props$OFFSET = $LAYOUT.byteOffset(groupElement("props"));

	public static long props$offset() {
		return props$OFFSET;
	}

	public static int props(MemorySegment struct) {
		return struct.get(props$LAYOUT, props$OFFSET);
	}

	public static void props(MemorySegment struct, int fieldValue) {
		struct.set(props$LAYOUT, props$OFFSET, fieldValue);
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
