package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

public class SDL_GPUVulkanOptions {

	SDL_GPUVulkanOptions() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("vulkan_api_version"),
			MemoryLayout.paddingLayout(4),
			SDL3.C_POINTER.withName("feature_list"),
			SDL3.C_POINTER.withName("vulkan_10_physical_device_features"),
			SDL3.C_INT.withName("device_extension_count"),
			MemoryLayout.paddingLayout(4),
			SDL3.C_POINTER.withName("device_extension_names"),
			SDL3.C_INT.withName("instance_extension_count"),
			MemoryLayout.paddingLayout(4),
			SDL3.C_POINTER.withName("instance_extension_names")
	).withName("SDL_GPUVulkanOptions");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfInt vulkan_api_version$LAYOUT = (OfInt) $LAYOUT.select(groupElement("vulkan_api_version"));

	public static OfInt vulkan_api_version$layout() {
		return vulkan_api_version$LAYOUT;
	}

	private static final long vulkan_api_version$OFFSET = $LAYOUT.byteOffset(groupElement("vulkan_api_version"));

	public static long vulkan_api_version$offset() {
		return vulkan_api_version$OFFSET;
	}

	public static int vulkan_api_version(MemorySegment struct) {
		return struct.get(vulkan_api_version$LAYOUT, vulkan_api_version$OFFSET);
	}

	public static void vulkan_api_version(MemorySegment struct, int fieldValue) {
		struct.set(vulkan_api_version$LAYOUT, vulkan_api_version$OFFSET, fieldValue);
	}

	private static final AddressLayout feature_list$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("feature_list"));

	public static AddressLayout feature_list$layout() {
		return feature_list$LAYOUT;
	}

	private static final long feature_list$OFFSET = $LAYOUT.byteOffset(groupElement("feature_list"));

	public static long feature_list$offset() {
		return feature_list$OFFSET;
	}

	public static MemorySegment feature_list(MemorySegment struct) {
		return struct.get(feature_list$LAYOUT, feature_list$OFFSET);
	}

	public static void feature_list(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(feature_list$LAYOUT, feature_list$OFFSET, fieldValue);
	}

	private static final AddressLayout vulkan_10_physical_device_features$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("vulkan_10_physical_device_features"));

	public static AddressLayout vulkan_10_physical_device_features$layout() {
		return vulkan_10_physical_device_features$LAYOUT;
	}

	private static final long vulkan_10_physical_device_features$OFFSET = $LAYOUT.byteOffset(groupElement("vulkan_10_physical_device_features"));

	public static long vulkan_10_physical_device_features$offset() {
		return vulkan_10_physical_device_features$OFFSET;
	}

	public static MemorySegment vulkan_10_physical_device_features(MemorySegment struct) {
		return struct.get(vulkan_10_physical_device_features$LAYOUT, vulkan_10_physical_device_features$OFFSET);
	}

	public static void vulkan_10_physical_device_features(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(vulkan_10_physical_device_features$LAYOUT, vulkan_10_physical_device_features$OFFSET, fieldValue);
	}

	private static final OfInt device_extension_count$LAYOUT = (OfInt) $LAYOUT.select(groupElement("device_extension_count"));

	public static OfInt device_extension_count$layout() {
		return device_extension_count$LAYOUT;
	}

	private static final long device_extension_count$OFFSET = $LAYOUT.byteOffset(groupElement("device_extension_count"));

	public static long device_extension_count$offset() {
		return device_extension_count$OFFSET;
	}

	public static int device_extension_count(MemorySegment struct) {
		return struct.get(device_extension_count$LAYOUT, device_extension_count$OFFSET);
	}

	public static void device_extension_count(MemorySegment struct, int fieldValue) {
		struct.set(device_extension_count$LAYOUT, device_extension_count$OFFSET, fieldValue);
	}

	private static final AddressLayout device_extension_names$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("device_extension_names"));

	public static AddressLayout device_extension_names$layout() {
		return device_extension_names$LAYOUT;
	}

	private static final long device_extension_names$OFFSET = $LAYOUT.byteOffset(groupElement("device_extension_names"));

	public static long device_extension_names$offset() {
		return device_extension_names$OFFSET;
	}

	public static MemorySegment device_extension_names(MemorySegment struct) {
		return struct.get(device_extension_names$LAYOUT, device_extension_names$OFFSET);
	}

	public static void device_extension_names(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(device_extension_names$LAYOUT, device_extension_names$OFFSET, fieldValue);
	}

	private static final OfInt instance_extension_count$LAYOUT = (OfInt) $LAYOUT.select(groupElement("instance_extension_count"));

	public static OfInt instance_extension_count$layout() {
		return instance_extension_count$LAYOUT;
	}

	private static final long instance_extension_count$OFFSET = $LAYOUT.byteOffset(groupElement("instance_extension_count"));

	public static long instance_extension_count$offset() {
		return instance_extension_count$OFFSET;
	}

	public static int instance_extension_count(MemorySegment struct) {
		return struct.get(instance_extension_count$LAYOUT, instance_extension_count$OFFSET);
	}

	public static void instance_extension_count(MemorySegment struct, int fieldValue) {
		struct.set(instance_extension_count$LAYOUT, instance_extension_count$OFFSET, fieldValue);
	}

	private static final AddressLayout instance_extension_names$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("instance_extension_names"));

	public static AddressLayout instance_extension_names$layout() {
		return instance_extension_names$LAYOUT;
	}

	private static final long instance_extension_names$OFFSET = $LAYOUT.byteOffset(groupElement("instance_extension_names"));

	public static long instance_extension_names$offset() {
		return instance_extension_names$OFFSET;
	}

	public static MemorySegment instance_extension_names(MemorySegment struct) {
		return struct.get(instance_extension_names$LAYOUT, instance_extension_names$OFFSET);
	}

	public static void instance_extension_names(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(instance_extension_names$LAYOUT, instance_extension_names$OFFSET, fieldValue);
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
