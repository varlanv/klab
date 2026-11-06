package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.OfShort;

public class SDL_hid_device_info {

	SDL_hid_device_info() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_POINTER.withName("path"),
			SDL3.C_SHORT.withName("vendor_id"),
			SDL3.C_SHORT.withName("product_id"),
			MemoryLayout.paddingLayout(4),
			SDL3.C_POINTER.withName("serial_number"),
			SDL3.C_SHORT.withName("release_number"),
			MemoryLayout.paddingLayout(6),
			SDL3.C_POINTER.withName("manufacturer_string"),
			SDL3.C_POINTER.withName("product_string"),
			SDL3.C_SHORT.withName("usage_page"),
			SDL3.C_SHORT.withName("usage"),
			SDL3.C_INT.withName("interface_number"),
			SDL3.C_INT.withName("interface_class"),
			SDL3.C_INT.withName("interface_subclass"),
			SDL3.C_INT.withName("interface_protocol"),
			SDL3.C_INT.withName("bus_type"),
			SDL3.C_POINTER.withName("next")
	).withName("SDL_hid_device_info");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final AddressLayout path$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("path"));

	public static AddressLayout path$layout() {
		return path$LAYOUT;
	}

	private static final long path$OFFSET = $LAYOUT.byteOffset(groupElement("path"));

	public static long path$offset() {
		return path$OFFSET;
	}

	public static MemorySegment path(MemorySegment struct) {
		return struct.get(path$LAYOUT, path$OFFSET);
	}

	public static void path(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(path$LAYOUT, path$OFFSET, fieldValue);
	}

	private static final OfShort vendor_id$LAYOUT = (OfShort) $LAYOUT.select(groupElement("vendor_id"));

	public static OfShort vendor_id$layout() {
		return vendor_id$LAYOUT;
	}

	private static final long vendor_id$OFFSET = $LAYOUT.byteOffset(groupElement("vendor_id"));

	public static long vendor_id$offset() {
		return vendor_id$OFFSET;
	}

	public static short vendor_id(MemorySegment struct) {
		return struct.get(vendor_id$LAYOUT, vendor_id$OFFSET);
	}

	public static void vendor_id(MemorySegment struct, short fieldValue) {
		struct.set(vendor_id$LAYOUT, vendor_id$OFFSET, fieldValue);
	}

	private static final OfShort product_id$LAYOUT = (OfShort) $LAYOUT.select(groupElement("product_id"));

	public static OfShort product_id$layout() {
		return product_id$LAYOUT;
	}

	private static final long product_id$OFFSET = $LAYOUT.byteOffset(groupElement("product_id"));

	public static long product_id$offset() {
		return product_id$OFFSET;
	}

	public static short product_id(MemorySegment struct) {
		return struct.get(product_id$LAYOUT, product_id$OFFSET);
	}

	public static void product_id(MemorySegment struct, short fieldValue) {
		struct.set(product_id$LAYOUT, product_id$OFFSET, fieldValue);
	}

	private static final AddressLayout serial_number$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("serial_number"));

	public static AddressLayout serial_number$layout() {
		return serial_number$LAYOUT;
	}

	private static final long serial_number$OFFSET = $LAYOUT.byteOffset(groupElement("serial_number"));

	public static long serial_number$offset() {
		return serial_number$OFFSET;
	}

	public static MemorySegment serial_number(MemorySegment struct) {
		return struct.get(serial_number$LAYOUT, serial_number$OFFSET);
	}

	public static void serial_number(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(serial_number$LAYOUT, serial_number$OFFSET, fieldValue);
	}

	private static final OfShort release_number$LAYOUT = (OfShort) $LAYOUT.select(groupElement("release_number"));

	public static OfShort release_number$layout() {
		return release_number$LAYOUT;
	}

	private static final long release_number$OFFSET = $LAYOUT.byteOffset(groupElement("release_number"));

	public static long release_number$offset() {
		return release_number$OFFSET;
	}

	public static short release_number(MemorySegment struct) {
		return struct.get(release_number$LAYOUT, release_number$OFFSET);
	}

	public static void release_number(MemorySegment struct, short fieldValue) {
		struct.set(release_number$LAYOUT, release_number$OFFSET, fieldValue);
	}

	private static final AddressLayout manufacturer_string$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("manufacturer_string"));

	public static AddressLayout manufacturer_string$layout() {
		return manufacturer_string$LAYOUT;
	}

	private static final long manufacturer_string$OFFSET = $LAYOUT.byteOffset(groupElement("manufacturer_string"));

	public static long manufacturer_string$offset() {
		return manufacturer_string$OFFSET;
	}

	public static MemorySegment manufacturer_string(MemorySegment struct) {
		return struct.get(manufacturer_string$LAYOUT, manufacturer_string$OFFSET);
	}

	public static void manufacturer_string(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(manufacturer_string$LAYOUT, manufacturer_string$OFFSET, fieldValue);
	}

	private static final AddressLayout product_string$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("product_string"));

	public static AddressLayout product_string$layout() {
		return product_string$LAYOUT;
	}

	private static final long product_string$OFFSET = $LAYOUT.byteOffset(groupElement("product_string"));

	public static long product_string$offset() {
		return product_string$OFFSET;
	}

	public static MemorySegment product_string(MemorySegment struct) {
		return struct.get(product_string$LAYOUT, product_string$OFFSET);
	}

	public static void product_string(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(product_string$LAYOUT, product_string$OFFSET, fieldValue);
	}

	private static final OfShort usage_page$LAYOUT = (OfShort) $LAYOUT.select(groupElement("usage_page"));

	public static OfShort usage_page$layout() {
		return usage_page$LAYOUT;
	}

	private static final long usage_page$OFFSET = $LAYOUT.byteOffset(groupElement("usage_page"));

	public static long usage_page$offset() {
		return usage_page$OFFSET;
	}

	public static short usage_page(MemorySegment struct) {
		return struct.get(usage_page$LAYOUT, usage_page$OFFSET);
	}

	public static void usage_page(MemorySegment struct, short fieldValue) {
		struct.set(usage_page$LAYOUT, usage_page$OFFSET, fieldValue);
	}

	private static final OfShort usage$LAYOUT = (OfShort) $LAYOUT.select(groupElement("usage"));

	public static OfShort usage$layout() {
		return usage$LAYOUT;
	}

	private static final long usage$OFFSET = $LAYOUT.byteOffset(groupElement("usage"));

	public static long usage$offset() {
		return usage$OFFSET;
	}

	public static short usage(MemorySegment struct) {
		return struct.get(usage$LAYOUT, usage$OFFSET);
	}

	public static void usage(MemorySegment struct, short fieldValue) {
		struct.set(usage$LAYOUT, usage$OFFSET, fieldValue);
	}

	private static final OfInt interface_number$LAYOUT = (OfInt) $LAYOUT.select(groupElement("interface_number"));

	public static OfInt interface_number$layout() {
		return interface_number$LAYOUT;
	}

	private static final long interface_number$OFFSET = $LAYOUT.byteOffset(groupElement("interface_number"));

	public static long interface_number$offset() {
		return interface_number$OFFSET;
	}

	public static int interface_number(MemorySegment struct) {
		return struct.get(interface_number$LAYOUT, interface_number$OFFSET);
	}

	public static void interface_number(MemorySegment struct, int fieldValue) {
		struct.set(interface_number$LAYOUT, interface_number$OFFSET, fieldValue);
	}

	private static final OfInt interface_class$LAYOUT = (OfInt) $LAYOUT.select(groupElement("interface_class"));

	public static OfInt interface_class$layout() {
		return interface_class$LAYOUT;
	}

	private static final long interface_class$OFFSET = $LAYOUT.byteOffset(groupElement("interface_class"));

	public static long interface_class$offset() {
		return interface_class$OFFSET;
	}

	public static int interface_class(MemorySegment struct) {
		return struct.get(interface_class$LAYOUT, interface_class$OFFSET);
	}

	public static void interface_class(MemorySegment struct, int fieldValue) {
		struct.set(interface_class$LAYOUT, interface_class$OFFSET, fieldValue);
	}

	private static final OfInt interface_subclass$LAYOUT = (OfInt) $LAYOUT.select(groupElement("interface_subclass"));

	public static OfInt interface_subclass$layout() {
		return interface_subclass$LAYOUT;
	}

	private static final long interface_subclass$OFFSET = $LAYOUT.byteOffset(groupElement("interface_subclass"));

	public static long interface_subclass$offset() {
		return interface_subclass$OFFSET;
	}

	public static int interface_subclass(MemorySegment struct) {
		return struct.get(interface_subclass$LAYOUT, interface_subclass$OFFSET);
	}

	public static void interface_subclass(MemorySegment struct, int fieldValue) {
		struct.set(interface_subclass$LAYOUT, interface_subclass$OFFSET, fieldValue);
	}

	private static final OfInt interface_protocol$LAYOUT = (OfInt) $LAYOUT.select(groupElement("interface_protocol"));

	public static OfInt interface_protocol$layout() {
		return interface_protocol$LAYOUT;
	}

	private static final long interface_protocol$OFFSET = $LAYOUT.byteOffset(groupElement("interface_protocol"));

	public static long interface_protocol$offset() {
		return interface_protocol$OFFSET;
	}

	public static int interface_protocol(MemorySegment struct) {
		return struct.get(interface_protocol$LAYOUT, interface_protocol$OFFSET);
	}

	public static void interface_protocol(MemorySegment struct, int fieldValue) {
		struct.set(interface_protocol$LAYOUT, interface_protocol$OFFSET, fieldValue);
	}

	private static final OfInt bus_type$LAYOUT = (OfInt) $LAYOUT.select(groupElement("bus_type"));

	public static OfInt bus_type$layout() {
		return bus_type$LAYOUT;
	}

	private static final long bus_type$OFFSET = $LAYOUT.byteOffset(groupElement("bus_type"));

	public static long bus_type$offset() {
		return bus_type$OFFSET;
	}

	public static int bus_type(MemorySegment struct) {
		return struct.get(bus_type$LAYOUT, bus_type$OFFSET);
	}

	public static void bus_type(MemorySegment struct, int fieldValue) {
		struct.set(bus_type$LAYOUT, bus_type$OFFSET, fieldValue);
	}

	private static final AddressLayout next$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("next"));

	public static AddressLayout next$layout() {
		return next$LAYOUT;
	}

	private static final long next$OFFSET = $LAYOUT.byteOffset(groupElement("next"));

	public static long next$offset() {
		return next$OFFSET;
	}

	public static MemorySegment next(MemorySegment struct) {
		return struct.get(next$LAYOUT, next$OFFSET);
	}

	public static void next(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(next$LAYOUT, next$OFFSET, fieldValue);
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
