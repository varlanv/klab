package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

public class SDL_GamepadBinding {

	SDL_GamepadBinding() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("input_type"),
			SDL_GamepadBinding.input.layout().withName("input"),
			SDL3.C_INT.withName("output_type"),
			SDL_GamepadBinding.output.layout().withName("output")
	).withName("SDL_GamepadBinding");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfInt input_type$LAYOUT = (OfInt) $LAYOUT.select(groupElement("input_type"));

	public static OfInt input_type$layout() {
		return input_type$LAYOUT;
	}

	private static final long input_type$OFFSET = $LAYOUT.byteOffset(groupElement("input_type"));

	public static long input_type$offset() {
		return input_type$OFFSET;
	}

	public static int input_type(MemorySegment struct) {
		return struct.get(input_type$LAYOUT, input_type$OFFSET);
	}

	public static void input_type(MemorySegment struct, int fieldValue) {
		struct.set(input_type$LAYOUT, input_type$OFFSET, fieldValue);
	}

	public static class input {

		input() {

		}

		private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
				SDL3.C_INT.withName("button"),
				SDL_GamepadBinding.input.axis.layout().withName("axis"),
				SDL_GamepadBinding.input.hat.layout().withName("hat")
		).withName("$anon$271:5");

		public static GroupLayout layout() {
			return $LAYOUT;
		}

		private static final OfInt button$LAYOUT = (OfInt) $LAYOUT.select(groupElement("button"));

		public static OfInt button$layout() {
			return button$LAYOUT;
		}

		private static final long button$OFFSET = $LAYOUT.byteOffset(groupElement("button"));

		public static long button$offset() {
			return button$OFFSET;
		}

		public static int button(MemorySegment union) {
			return union.get(button$LAYOUT, button$OFFSET);
		}

		public static void button(MemorySegment union, int fieldValue) {
			union.set(button$LAYOUT, button$OFFSET, fieldValue);
		}

		public static class axis {

			axis() {

			}

			private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
					SDL3.C_INT.withName("axis"),
					SDL3.C_INT.withName("axis_min"),
					SDL3.C_INT.withName("axis_max")
			).withName("$anon$275:9");

			public static GroupLayout layout() {
				return $LAYOUT;
			}

			private static final OfInt axis$LAYOUT = (OfInt) $LAYOUT.select(groupElement("axis"));

			public static OfInt axis$layout() {
				return axis$LAYOUT;
			}

			private static final long axis$OFFSET = $LAYOUT.byteOffset(groupElement("axis"));

			public static long axis$offset() {
				return axis$OFFSET;
			}

			public static int axis(MemorySegment struct) {
				return struct.get(axis$LAYOUT, axis$OFFSET);
			}

			public static void axis(MemorySegment struct, int fieldValue) {
				struct.set(axis$LAYOUT, axis$OFFSET, fieldValue);
			}

			private static final OfInt axis_min$LAYOUT = (OfInt) $LAYOUT.select(groupElement("axis_min"));

			public static OfInt axis_min$layout() {
				return axis_min$LAYOUT;
			}

			private static final long axis_min$OFFSET = $LAYOUT.byteOffset(groupElement("axis_min"));

			public static long axis_min$offset() {
				return axis_min$OFFSET;
			}

			public static int axis_min(MemorySegment struct) {
				return struct.get(axis_min$LAYOUT, axis_min$OFFSET);
			}

			public static void axis_min(MemorySegment struct, int fieldValue) {
				struct.set(axis_min$LAYOUT, axis_min$OFFSET, fieldValue);
			}

			private static final OfInt axis_max$LAYOUT = (OfInt) $LAYOUT.select(groupElement("axis_max"));

			public static OfInt axis_max$layout() {
				return axis_max$LAYOUT;
			}

			private static final long axis_max$OFFSET = $LAYOUT.byteOffset(groupElement("axis_max"));

			public static long axis_max$offset() {
				return axis_max$OFFSET;
			}

			public static int axis_max(MemorySegment struct) {
				return struct.get(axis_max$LAYOUT, axis_max$OFFSET);
			}

			public static void axis_max(MemorySegment struct, int fieldValue) {
				struct.set(axis_max$LAYOUT, axis_max$OFFSET, fieldValue);
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

		private static final GroupLayout axis$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("axis"));

		public static GroupLayout axis$layout() {
			return axis$LAYOUT;
		}

		private static final long axis$OFFSET = $LAYOUT.byteOffset(groupElement("axis"));

		public static long axis$offset() {
			return axis$OFFSET;
		}

		public static MemorySegment axis(MemorySegment union) {
			return union.asSlice(axis$OFFSET, axis$LAYOUT.byteSize());
		}

		public static void axis(MemorySegment union, MemorySegment fieldValue) {
			MemorySegment.copy(fieldValue, 0L, union, axis$OFFSET, axis$LAYOUT.byteSize());
		}

		public static class hat {

			hat() {

			}

			private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
					SDL3.C_INT.withName("hat"),
					SDL3.C_INT.withName("hat_mask")
			).withName("$anon$282:9");

			public static GroupLayout layout() {
				return $LAYOUT;
			}

			private static final OfInt hat$LAYOUT = (OfInt) $LAYOUT.select(groupElement("hat"));

			public static OfInt hat$layout() {
				return hat$LAYOUT;
			}

			private static final long hat$OFFSET = $LAYOUT.byteOffset(groupElement("hat"));

			public static long hat$offset() {
				return hat$OFFSET;
			}

			public static int hat(MemorySegment struct) {
				return struct.get(hat$LAYOUT, hat$OFFSET);
			}

			public static void hat(MemorySegment struct, int fieldValue) {
				struct.set(hat$LAYOUT, hat$OFFSET, fieldValue);
			}

			private static final OfInt hat_mask$LAYOUT = (OfInt) $LAYOUT.select(groupElement("hat_mask"));

			public static OfInt hat_mask$layout() {
				return hat_mask$LAYOUT;
			}

			private static final long hat_mask$OFFSET = $LAYOUT.byteOffset(groupElement("hat_mask"));

			public static long hat_mask$offset() {
				return hat_mask$OFFSET;
			}

			public static int hat_mask(MemorySegment struct) {
				return struct.get(hat_mask$LAYOUT, hat_mask$OFFSET);
			}

			public static void hat_mask(MemorySegment struct, int fieldValue) {
				struct.set(hat_mask$LAYOUT, hat_mask$OFFSET, fieldValue);
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

		private static final GroupLayout hat$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("hat"));

		public static GroupLayout hat$layout() {
			return hat$LAYOUT;
		}

		private static final long hat$OFFSET = $LAYOUT.byteOffset(groupElement("hat"));

		public static long hat$offset() {
			return hat$OFFSET;
		}

		public static MemorySegment hat(MemorySegment union) {
			return union.asSlice(hat$OFFSET, hat$LAYOUT.byteSize());
		}

		public static void hat(MemorySegment union, MemorySegment fieldValue) {
			MemorySegment.copy(fieldValue, 0L, union, hat$OFFSET, hat$LAYOUT.byteSize());
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

	private static final GroupLayout input$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("input"));

	public static GroupLayout input$layout() {
		return input$LAYOUT;
	}

	private static final long input$OFFSET = $LAYOUT.byteOffset(groupElement("input"));

	public static long input$offset() {
		return input$OFFSET;
	}

	public static MemorySegment input(MemorySegment struct) {
		return struct.asSlice(input$OFFSET, input$LAYOUT.byteSize());
	}

	public static void input(MemorySegment struct, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, struct, input$OFFSET, input$LAYOUT.byteSize());
	}

	private static final OfInt output_type$LAYOUT = (OfInt) $LAYOUT.select(groupElement("output_type"));

	public static OfInt output_type$layout() {
		return output_type$LAYOUT;
	}

	private static final long output_type$OFFSET = $LAYOUT.byteOffset(groupElement("output_type"));

	public static long output_type$offset() {
		return output_type$OFFSET;
	}

	public static int output_type(MemorySegment struct) {
		return struct.get(output_type$LAYOUT, output_type$OFFSET);
	}

	public static void output_type(MemorySegment struct, int fieldValue) {
		struct.set(output_type$LAYOUT, output_type$OFFSET, fieldValue);
	}

	public static class output {

		output() {

		}

		private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
				SDL3.C_INT.withName("button"),
				SDL_GamepadBinding.output.axis.layout().withName("axis")
		).withName("$anon$291:5");

		public static GroupLayout layout() {
			return $LAYOUT;
		}

		private static final OfInt button$LAYOUT = (OfInt) $LAYOUT.select(groupElement("button"));

		public static OfInt button$layout() {
			return button$LAYOUT;
		}

		private static final long button$OFFSET = $LAYOUT.byteOffset(groupElement("button"));

		public static long button$offset() {
			return button$OFFSET;
		}

		public static int button(MemorySegment union) {
			return union.get(button$LAYOUT, button$OFFSET);
		}

		public static void button(MemorySegment union, int fieldValue) {
			union.set(button$LAYOUT, button$OFFSET, fieldValue);
		}

		public static class axis {

			axis() {

			}

			private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
					SDL3.C_INT.withName("axis"),
					SDL3.C_INT.withName("axis_min"),
					SDL3.C_INT.withName("axis_max")
			).withName("$anon$295:9");

			public static GroupLayout layout() {
				return $LAYOUT;
			}

			private static final OfInt axis$LAYOUT = (OfInt) $LAYOUT.select(groupElement("axis"));

			public static OfInt axis$layout() {
				return axis$LAYOUT;
			}

			private static final long axis$OFFSET = $LAYOUT.byteOffset(groupElement("axis"));

			public static long axis$offset() {
				return axis$OFFSET;
			}

			public static int axis(MemorySegment struct) {
				return struct.get(axis$LAYOUT, axis$OFFSET);
			}

			public static void axis(MemorySegment struct, int fieldValue) {
				struct.set(axis$LAYOUT, axis$OFFSET, fieldValue);
			}

			private static final OfInt axis_min$LAYOUT = (OfInt) $LAYOUT.select(groupElement("axis_min"));

			public static OfInt axis_min$layout() {
				return axis_min$LAYOUT;
			}

			private static final long axis_min$OFFSET = $LAYOUT.byteOffset(groupElement("axis_min"));

			public static long axis_min$offset() {
				return axis_min$OFFSET;
			}

			public static int axis_min(MemorySegment struct) {
				return struct.get(axis_min$LAYOUT, axis_min$OFFSET);
			}

			public static void axis_min(MemorySegment struct, int fieldValue) {
				struct.set(axis_min$LAYOUT, axis_min$OFFSET, fieldValue);
			}

			private static final OfInt axis_max$LAYOUT = (OfInt) $LAYOUT.select(groupElement("axis_max"));

			public static OfInt axis_max$layout() {
				return axis_max$LAYOUT;
			}

			private static final long axis_max$OFFSET = $LAYOUT.byteOffset(groupElement("axis_max"));

			public static long axis_max$offset() {
				return axis_max$OFFSET;
			}

			public static int axis_max(MemorySegment struct) {
				return struct.get(axis_max$LAYOUT, axis_max$OFFSET);
			}

			public static void axis_max(MemorySegment struct, int fieldValue) {
				struct.set(axis_max$LAYOUT, axis_max$OFFSET, fieldValue);
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

		private static final GroupLayout axis$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("axis"));

		public static GroupLayout axis$layout() {
			return axis$LAYOUT;
		}

		private static final long axis$OFFSET = $LAYOUT.byteOffset(groupElement("axis"));

		public static long axis$offset() {
			return axis$OFFSET;
		}

		public static MemorySegment axis(MemorySegment union) {
			return union.asSlice(axis$OFFSET, axis$LAYOUT.byteSize());
		}

		public static void axis(MemorySegment union, MemorySegment fieldValue) {
			MemorySegment.copy(fieldValue, 0L, union, axis$OFFSET, axis$LAYOUT.byteSize());
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

	private static final GroupLayout output$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("output"));

	public static GroupLayout output$layout() {
		return output$LAYOUT;
	}

	private static final long output$OFFSET = $LAYOUT.byteOffset(groupElement("output"));

	public static long output$offset() {
		return output$OFFSET;
	}

	public static MemorySegment output(MemorySegment struct) {
		return struct.asSlice(output$OFFSET, output$LAYOUT.byteSize());
	}

	public static void output(MemorySegment struct, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, struct, output$OFFSET, output$LAYOUT.byteSize());
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
