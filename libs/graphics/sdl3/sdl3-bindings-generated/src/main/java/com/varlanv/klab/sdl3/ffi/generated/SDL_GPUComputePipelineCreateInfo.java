package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.OfLong;

public class SDL_GPUComputePipelineCreateInfo {

	SDL_GPUComputePipelineCreateInfo() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_LONG.withName("code_size"),
			SDL3.C_POINTER.withName("code"),
			SDL3.C_POINTER.withName("entrypoint"),
			SDL3.C_INT.withName("format"),
			SDL3.C_INT.withName("num_samplers"),
			SDL3.C_INT.withName("num_readonly_storage_textures"),
			SDL3.C_INT.withName("num_readonly_storage_buffers"),
			SDL3.C_INT.withName("num_readwrite_storage_textures"),
			SDL3.C_INT.withName("num_readwrite_storage_buffers"),
			SDL3.C_INT.withName("num_uniform_buffers"),
			SDL3.C_INT.withName("threadcount_x"),
			SDL3.C_INT.withName("threadcount_y"),
			SDL3.C_INT.withName("threadcount_z"),
			SDL3.C_INT.withName("props"),
			MemoryLayout.paddingLayout(4)
	).withName("SDL_GPUComputePipelineCreateInfo");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfLong code_size$LAYOUT = (OfLong) $LAYOUT.select(groupElement("code_size"));

	public static OfLong code_size$layout() {
		return code_size$LAYOUT;
	}

	private static final long code_size$OFFSET = $LAYOUT.byteOffset(groupElement("code_size"));

	public static long code_size$offset() {
		return code_size$OFFSET;
	}

	public static long code_size(MemorySegment struct) {
		return struct.get(code_size$LAYOUT, code_size$OFFSET);
	}

	public static void code_size(MemorySegment struct, long fieldValue) {
		struct.set(code_size$LAYOUT, code_size$OFFSET, fieldValue);
	}

	private static final AddressLayout code$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("code"));

	public static AddressLayout code$layout() {
		return code$LAYOUT;
	}

	private static final long code$OFFSET = $LAYOUT.byteOffset(groupElement("code"));

	public static long code$offset() {
		return code$OFFSET;
	}

	public static MemorySegment code(MemorySegment struct) {
		return struct.get(code$LAYOUT, code$OFFSET);
	}

	public static void code(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(code$LAYOUT, code$OFFSET, fieldValue);
	}

	private static final AddressLayout entrypoint$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("entrypoint"));

	public static AddressLayout entrypoint$layout() {
		return entrypoint$LAYOUT;
	}

	private static final long entrypoint$OFFSET = $LAYOUT.byteOffset(groupElement("entrypoint"));

	public static long entrypoint$offset() {
		return entrypoint$OFFSET;
	}

	public static MemorySegment entrypoint(MemorySegment struct) {
		return struct.get(entrypoint$LAYOUT, entrypoint$OFFSET);
	}

	public static void entrypoint(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(entrypoint$LAYOUT, entrypoint$OFFSET, fieldValue);
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

	private static final OfInt num_samplers$LAYOUT = (OfInt) $LAYOUT.select(groupElement("num_samplers"));

	public static OfInt num_samplers$layout() {
		return num_samplers$LAYOUT;
	}

	private static final long num_samplers$OFFSET = $LAYOUT.byteOffset(groupElement("num_samplers"));

	public static long num_samplers$offset() {
		return num_samplers$OFFSET;
	}

	public static int num_samplers(MemorySegment struct) {
		return struct.get(num_samplers$LAYOUT, num_samplers$OFFSET);
	}

	public static void num_samplers(MemorySegment struct, int fieldValue) {
		struct.set(num_samplers$LAYOUT, num_samplers$OFFSET, fieldValue);
	}

	private static final OfInt num_readonly_storage_textures$LAYOUT = (OfInt) $LAYOUT.select(groupElement("num_readonly_storage_textures"));

	public static OfInt num_readonly_storage_textures$layout() {
		return num_readonly_storage_textures$LAYOUT;
	}

	private static final long num_readonly_storage_textures$OFFSET = $LAYOUT.byteOffset(groupElement("num_readonly_storage_textures"));

	public static long num_readonly_storage_textures$offset() {
		return num_readonly_storage_textures$OFFSET;
	}

	public static int num_readonly_storage_textures(MemorySegment struct) {
		return struct.get(num_readonly_storage_textures$LAYOUT, num_readonly_storage_textures$OFFSET);
	}

	public static void num_readonly_storage_textures(MemorySegment struct, int fieldValue) {
		struct.set(num_readonly_storage_textures$LAYOUT, num_readonly_storage_textures$OFFSET, fieldValue);
	}

	private static final OfInt num_readonly_storage_buffers$LAYOUT = (OfInt) $LAYOUT.select(groupElement("num_readonly_storage_buffers"));

	public static OfInt num_readonly_storage_buffers$layout() {
		return num_readonly_storage_buffers$LAYOUT;
	}

	private static final long num_readonly_storage_buffers$OFFSET = $LAYOUT.byteOffset(groupElement("num_readonly_storage_buffers"));

	public static long num_readonly_storage_buffers$offset() {
		return num_readonly_storage_buffers$OFFSET;
	}

	public static int num_readonly_storage_buffers(MemorySegment struct) {
		return struct.get(num_readonly_storage_buffers$LAYOUT, num_readonly_storage_buffers$OFFSET);
	}

	public static void num_readonly_storage_buffers(MemorySegment struct, int fieldValue) {
		struct.set(num_readonly_storage_buffers$LAYOUT, num_readonly_storage_buffers$OFFSET, fieldValue);
	}

	private static final OfInt num_readwrite_storage_textures$LAYOUT = (OfInt) $LAYOUT.select(groupElement("num_readwrite_storage_textures"));

	public static OfInt num_readwrite_storage_textures$layout() {
		return num_readwrite_storage_textures$LAYOUT;
	}

	private static final long num_readwrite_storage_textures$OFFSET = $LAYOUT.byteOffset(groupElement("num_readwrite_storage_textures"));

	public static long num_readwrite_storage_textures$offset() {
		return num_readwrite_storage_textures$OFFSET;
	}

	public static int num_readwrite_storage_textures(MemorySegment struct) {
		return struct.get(num_readwrite_storage_textures$LAYOUT, num_readwrite_storage_textures$OFFSET);
	}

	public static void num_readwrite_storage_textures(MemorySegment struct, int fieldValue) {
		struct.set(num_readwrite_storage_textures$LAYOUT, num_readwrite_storage_textures$OFFSET, fieldValue);
	}

	private static final OfInt num_readwrite_storage_buffers$LAYOUT = (OfInt) $LAYOUT.select(groupElement("num_readwrite_storage_buffers"));

	public static OfInt num_readwrite_storage_buffers$layout() {
		return num_readwrite_storage_buffers$LAYOUT;
	}

	private static final long num_readwrite_storage_buffers$OFFSET = $LAYOUT.byteOffset(groupElement("num_readwrite_storage_buffers"));

	public static long num_readwrite_storage_buffers$offset() {
		return num_readwrite_storage_buffers$OFFSET;
	}

	public static int num_readwrite_storage_buffers(MemorySegment struct) {
		return struct.get(num_readwrite_storage_buffers$LAYOUT, num_readwrite_storage_buffers$OFFSET);
	}

	public static void num_readwrite_storage_buffers(MemorySegment struct, int fieldValue) {
		struct.set(num_readwrite_storage_buffers$LAYOUT, num_readwrite_storage_buffers$OFFSET, fieldValue);
	}

	private static final OfInt num_uniform_buffers$LAYOUT = (OfInt) $LAYOUT.select(groupElement("num_uniform_buffers"));

	public static OfInt num_uniform_buffers$layout() {
		return num_uniform_buffers$LAYOUT;
	}

	private static final long num_uniform_buffers$OFFSET = $LAYOUT.byteOffset(groupElement("num_uniform_buffers"));

	public static long num_uniform_buffers$offset() {
		return num_uniform_buffers$OFFSET;
	}

	public static int num_uniform_buffers(MemorySegment struct) {
		return struct.get(num_uniform_buffers$LAYOUT, num_uniform_buffers$OFFSET);
	}

	public static void num_uniform_buffers(MemorySegment struct, int fieldValue) {
		struct.set(num_uniform_buffers$LAYOUT, num_uniform_buffers$OFFSET, fieldValue);
	}

	private static final OfInt threadcount_x$LAYOUT = (OfInt) $LAYOUT.select(groupElement("threadcount_x"));

	public static OfInt threadcount_x$layout() {
		return threadcount_x$LAYOUT;
	}

	private static final long threadcount_x$OFFSET = $LAYOUT.byteOffset(groupElement("threadcount_x"));

	public static long threadcount_x$offset() {
		return threadcount_x$OFFSET;
	}

	public static int threadcount_x(MemorySegment struct) {
		return struct.get(threadcount_x$LAYOUT, threadcount_x$OFFSET);
	}

	public static void threadcount_x(MemorySegment struct, int fieldValue) {
		struct.set(threadcount_x$LAYOUT, threadcount_x$OFFSET, fieldValue);
	}

	private static final OfInt threadcount_y$LAYOUT = (OfInt) $LAYOUT.select(groupElement("threadcount_y"));

	public static OfInt threadcount_y$layout() {
		return threadcount_y$LAYOUT;
	}

	private static final long threadcount_y$OFFSET = $LAYOUT.byteOffset(groupElement("threadcount_y"));

	public static long threadcount_y$offset() {
		return threadcount_y$OFFSET;
	}

	public static int threadcount_y(MemorySegment struct) {
		return struct.get(threadcount_y$LAYOUT, threadcount_y$OFFSET);
	}

	public static void threadcount_y(MemorySegment struct, int fieldValue) {
		struct.set(threadcount_y$LAYOUT, threadcount_y$OFFSET, fieldValue);
	}

	private static final OfInt threadcount_z$LAYOUT = (OfInt) $LAYOUT.select(groupElement("threadcount_z"));

	public static OfInt threadcount_z$layout() {
		return threadcount_z$LAYOUT;
	}

	private static final long threadcount_z$OFFSET = $LAYOUT.byteOffset(groupElement("threadcount_z"));

	public static long threadcount_z$offset() {
		return threadcount_z$OFFSET;
	}

	public static int threadcount_z(MemorySegment struct) {
		return struct.get(threadcount_z$LAYOUT, threadcount_z$OFFSET);
	}

	public static void threadcount_z(MemorySegment struct, int fieldValue) {
		struct.set(threadcount_z$LAYOUT, threadcount_z$OFFSET, fieldValue);
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
