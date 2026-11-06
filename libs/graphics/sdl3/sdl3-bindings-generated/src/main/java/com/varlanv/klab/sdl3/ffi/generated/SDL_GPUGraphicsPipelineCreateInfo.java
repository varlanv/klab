package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

public class SDL_GPUGraphicsPipelineCreateInfo {

	SDL_GPUGraphicsPipelineCreateInfo() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_POINTER.withName("vertex_shader"),
			SDL3.C_POINTER.withName("fragment_shader"),
			SDL_GPUVertexInputState.layout().withName("vertex_input_state"),
			SDL3.C_INT.withName("primitive_type"),
			SDL_GPURasterizerState.layout().withName("rasterizer_state"),
			SDL_GPUMultisampleState.layout().withName("multisample_state"),
			SDL_GPUDepthStencilState.layout().withName("depth_stencil_state"),
			SDL_GPUGraphicsPipelineTargetInfo.layout().withName("target_info"),
			SDL3.C_INT.withName("props"),
			MemoryLayout.paddingLayout(4)
	).withName("SDL_GPUGraphicsPipelineCreateInfo");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final AddressLayout vertex_shader$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("vertex_shader"));

	public static AddressLayout vertex_shader$layout() {
		return vertex_shader$LAYOUT;
	}

	private static final long vertex_shader$OFFSET = $LAYOUT.byteOffset(groupElement("vertex_shader"));

	public static long vertex_shader$offset() {
		return vertex_shader$OFFSET;
	}

	public static MemorySegment vertex_shader(MemorySegment struct) {
		return struct.get(vertex_shader$LAYOUT, vertex_shader$OFFSET);
	}

	public static void vertex_shader(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(vertex_shader$LAYOUT, vertex_shader$OFFSET, fieldValue);
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

	private static final GroupLayout vertex_input_state$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("vertex_input_state"));

	public static GroupLayout vertex_input_state$layout() {
		return vertex_input_state$LAYOUT;
	}

	private static final long vertex_input_state$OFFSET = $LAYOUT.byteOffset(groupElement("vertex_input_state"));

	public static long vertex_input_state$offset() {
		return vertex_input_state$OFFSET;
	}

	public static MemorySegment vertex_input_state(MemorySegment struct) {
		return struct.asSlice(vertex_input_state$OFFSET, vertex_input_state$LAYOUT.byteSize());
	}

	public static void vertex_input_state(MemorySegment struct, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, struct, vertex_input_state$OFFSET, vertex_input_state$LAYOUT.byteSize());
	}

	private static final OfInt primitive_type$LAYOUT = (OfInt) $LAYOUT.select(groupElement("primitive_type"));

	public static OfInt primitive_type$layout() {
		return primitive_type$LAYOUT;
	}

	private static final long primitive_type$OFFSET = $LAYOUT.byteOffset(groupElement("primitive_type"));

	public static long primitive_type$offset() {
		return primitive_type$OFFSET;
	}

	public static int primitive_type(MemorySegment struct) {
		return struct.get(primitive_type$LAYOUT, primitive_type$OFFSET);
	}

	public static void primitive_type(MemorySegment struct, int fieldValue) {
		struct.set(primitive_type$LAYOUT, primitive_type$OFFSET, fieldValue);
	}

	private static final GroupLayout rasterizer_state$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("rasterizer_state"));

	public static GroupLayout rasterizer_state$layout() {
		return rasterizer_state$LAYOUT;
	}

	private static final long rasterizer_state$OFFSET = $LAYOUT.byteOffset(groupElement("rasterizer_state"));

	public static long rasterizer_state$offset() {
		return rasterizer_state$OFFSET;
	}

	public static MemorySegment rasterizer_state(MemorySegment struct) {
		return struct.asSlice(rasterizer_state$OFFSET, rasterizer_state$LAYOUT.byteSize());
	}

	public static void rasterizer_state(MemorySegment struct, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, struct, rasterizer_state$OFFSET, rasterizer_state$LAYOUT.byteSize());
	}

	private static final GroupLayout multisample_state$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("multisample_state"));

	public static GroupLayout multisample_state$layout() {
		return multisample_state$LAYOUT;
	}

	private static final long multisample_state$OFFSET = $LAYOUT.byteOffset(groupElement("multisample_state"));

	public static long multisample_state$offset() {
		return multisample_state$OFFSET;
	}

	public static MemorySegment multisample_state(MemorySegment struct) {
		return struct.asSlice(multisample_state$OFFSET, multisample_state$LAYOUT.byteSize());
	}

	public static void multisample_state(MemorySegment struct, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, struct, multisample_state$OFFSET, multisample_state$LAYOUT.byteSize());
	}

	private static final GroupLayout depth_stencil_state$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("depth_stencil_state"));

	public static GroupLayout depth_stencil_state$layout() {
		return depth_stencil_state$LAYOUT;
	}

	private static final long depth_stencil_state$OFFSET = $LAYOUT.byteOffset(groupElement("depth_stencil_state"));

	public static long depth_stencil_state$offset() {
		return depth_stencil_state$OFFSET;
	}

	public static MemorySegment depth_stencil_state(MemorySegment struct) {
		return struct.asSlice(depth_stencil_state$OFFSET, depth_stencil_state$LAYOUT.byteSize());
	}

	public static void depth_stencil_state(MemorySegment struct, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, struct, depth_stencil_state$OFFSET, depth_stencil_state$LAYOUT.byteSize());
	}

	private static final GroupLayout target_info$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("target_info"));

	public static GroupLayout target_info$layout() {
		return target_info$LAYOUT;
	}

	private static final long target_info$OFFSET = $LAYOUT.byteOffset(groupElement("target_info"));

	public static long target_info$offset() {
		return target_info$OFFSET;
	}

	public static MemorySegment target_info(MemorySegment struct) {
		return struct.asSlice(target_info$OFFSET, target_info$LAYOUT.byteSize());
	}

	public static void target_info(MemorySegment struct, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, struct, target_info$OFFSET, target_info$LAYOUT.byteSize());
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
