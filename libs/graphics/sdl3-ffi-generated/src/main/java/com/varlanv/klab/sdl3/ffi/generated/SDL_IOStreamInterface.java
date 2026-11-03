package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

public class SDL_IOStreamInterface {

	SDL_IOStreamInterface() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("version"),
			MemoryLayout.paddingLayout(4),
			SDL3.C_POINTER.withName("size"),
			SDL3.C_POINTER.withName("seek"),
			SDL3.C_POINTER.withName("read"),
			SDL3.C_POINTER.withName("write"),
			SDL3.C_POINTER.withName("flush"),
			SDL3.C_POINTER.withName("close")
	).withName("SDL_IOStreamInterface");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfInt version$LAYOUT = (OfInt) $LAYOUT.select(groupElement("version"));

	public static OfInt version$layout() {
		return version$LAYOUT;
	}

	private static final long version$OFFSET = $LAYOUT.byteOffset(groupElement("version"));

	public static long version$offset() {
		return version$OFFSET;
	}

	public static int version(MemorySegment struct) {
		return struct.get(version$LAYOUT, version$OFFSET);
	}

	public static void version(MemorySegment struct, int fieldValue) {
		struct.set(version$LAYOUT, version$OFFSET, fieldValue);
	}

	public final static class size {

		private size() {

		}

		public interface Function {
			long apply(MemorySegment _x0);
		}

		private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_POINTER
		);

		public static FunctionDescriptor descriptor() {
			return $DESC;
		}

		private static final MethodHandle UP$MH = SDL3.upcallHandle(size.Function.class, "apply", $DESC);

		public static MemorySegment allocate(size.Function fi, Arena arena) {
			return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
		}

		private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

		public static long invoke(MemorySegment funcPtr, MemorySegment _x0) {
			try {
				return (long) DOWN$MH.invokeExact(funcPtr, _x0);
			} catch (Error | RuntimeException ex) {
				throw ex;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	private static final AddressLayout size$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("size"));

	public static AddressLayout size$layout() {
		return size$LAYOUT;
	}

	private static final long size$OFFSET = $LAYOUT.byteOffset(groupElement("size"));

	public static long size$offset() {
		return size$OFFSET;
	}

	public static MemorySegment size(MemorySegment struct) {
		return struct.get(size$LAYOUT, size$OFFSET);
	}

	public static void size(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(size$LAYOUT, size$OFFSET, fieldValue);
	}

	public final static class seek {

		private seek() {

		}

		public interface Function {
			long apply(MemorySegment _x0, long _x1, int _x2);
		}

		private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_POINTER,
				SDL3.C_LONG,
				SDL3.C_INT
		);

		public static FunctionDescriptor descriptor() {
			return $DESC;
		}

		private static final MethodHandle UP$MH = SDL3.upcallHandle(seek.Function.class, "apply", $DESC);

		public static MemorySegment allocate(seek.Function fi, Arena arena) {
			return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
		}

		private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

		public static long invoke(MemorySegment funcPtr, MemorySegment _x0, long _x1, int _x2) {
			try {
				return (long) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
			} catch (Error | RuntimeException ex) {
				throw ex;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	private static final AddressLayout seek$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("seek"));

	public static AddressLayout seek$layout() {
		return seek$LAYOUT;
	}

	private static final long seek$OFFSET = $LAYOUT.byteOffset(groupElement("seek"));

	public static long seek$offset() {
		return seek$OFFSET;
	}

	public static MemorySegment seek(MemorySegment struct) {
		return struct.get(seek$LAYOUT, seek$OFFSET);
	}

	public static void seek(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(seek$LAYOUT, seek$OFFSET, fieldValue);
	}

	public final static class read {

		private read() {

		}

		public interface Function {
			long apply(MemorySegment _x0, MemorySegment _x1, long _x2, MemorySegment _x3);
		}

		private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG,
				SDL3.C_POINTER
		);

		public static FunctionDescriptor descriptor() {
			return $DESC;
		}

		private static final MethodHandle UP$MH = SDL3.upcallHandle(read.Function.class, "apply", $DESC);

		public static MemorySegment allocate(read.Function fi, Arena arena) {
			return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
		}

		private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

		public static long invoke(MemorySegment funcPtr, MemorySegment _x0, MemorySegment _x1, long _x2, MemorySegment _x3) {
			try {
				return (long) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3);
			} catch (Error | RuntimeException ex) {
				throw ex;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	private static final AddressLayout read$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("read"));

	public static AddressLayout read$layout() {
		return read$LAYOUT;
	}

	private static final long read$OFFSET = $LAYOUT.byteOffset(groupElement("read"));

	public static long read$offset() {
		return read$OFFSET;
	}

	public static MemorySegment read(MemorySegment struct) {
		return struct.get(read$LAYOUT, read$OFFSET);
	}

	public static void read(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(read$LAYOUT, read$OFFSET, fieldValue);
	}

	public final static class write {

		private write() {

		}

		public interface Function {
			long apply(MemorySegment _x0, MemorySegment _x1, long _x2, MemorySegment _x3);
		}

		private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG,
				SDL3.C_POINTER
		);

		public static FunctionDescriptor descriptor() {
			return $DESC;
		}

		private static final MethodHandle UP$MH = SDL3.upcallHandle(write.Function.class, "apply", $DESC);

		public static MemorySegment allocate(write.Function fi, Arena arena) {
			return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
		}

		private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

		public static long invoke(MemorySegment funcPtr, MemorySegment _x0, MemorySegment _x1, long _x2, MemorySegment _x3) {
			try {
				return (long) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3);
			} catch (Error | RuntimeException ex) {
				throw ex;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	private static final AddressLayout write$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("write"));

	public static AddressLayout write$layout() {
		return write$LAYOUT;
	}

	private static final long write$OFFSET = $LAYOUT.byteOffset(groupElement("write"));

	public static long write$offset() {
		return write$OFFSET;
	}

	public static MemorySegment write(MemorySegment struct) {
		return struct.get(write$LAYOUT, write$OFFSET);
	}

	public static void write(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(write$LAYOUT, write$OFFSET, fieldValue);
	}

	public final static class flush {

		private flush() {

		}

		public interface Function {
			boolean apply(MemorySegment _x0, MemorySegment _x1);
		}

		private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static FunctionDescriptor descriptor() {
			return $DESC;
		}

		private static final MethodHandle UP$MH = SDL3.upcallHandle(flush.Function.class, "apply", $DESC);

		public static MemorySegment allocate(flush.Function fi, Arena arena) {
			return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
		}

		private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

		public static boolean invoke(MemorySegment funcPtr, MemorySegment _x0, MemorySegment _x1) {
			try {
				return (boolean) DOWN$MH.invokeExact(funcPtr, _x0, _x1);
			} catch (Error | RuntimeException ex) {
				throw ex;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	private static final AddressLayout flush$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("flush"));

	public static AddressLayout flush$layout() {
		return flush$LAYOUT;
	}

	private static final long flush$OFFSET = $LAYOUT.byteOffset(groupElement("flush"));

	public static long flush$offset() {
		return flush$OFFSET;
	}

	public static MemorySegment flush(MemorySegment struct) {
		return struct.get(flush$LAYOUT, flush$OFFSET);
	}

	public static void flush(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(flush$LAYOUT, flush$OFFSET, fieldValue);
	}

	public final static class close {

		private close() {

		}

		public interface Function {
			boolean apply(MemorySegment _x0);
		}

		private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static FunctionDescriptor descriptor() {
			return $DESC;
		}

		private static final MethodHandle UP$MH = SDL3.upcallHandle(close.Function.class, "apply", $DESC);

		public static MemorySegment allocate(close.Function fi, Arena arena) {
			return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
		}

		private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

		public static boolean invoke(MemorySegment funcPtr, MemorySegment _x0) {
			try {
				return (boolean) DOWN$MH.invokeExact(funcPtr, _x0);
			} catch (Error | RuntimeException ex) {
				throw ex;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	private static final AddressLayout close$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("close"));

	public static AddressLayout close$layout() {
		return close$LAYOUT;
	}

	private static final long close$OFFSET = $LAYOUT.byteOffset(groupElement("close"));

	public static long close$offset() {
		return close$OFFSET;
	}

	public static MemorySegment close(MemorySegment struct) {
		return struct.get(close$LAYOUT, close$OFFSET);
	}

	public static void close(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(close$LAYOUT, close$OFFSET, fieldValue);
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
