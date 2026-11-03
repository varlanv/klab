package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

public class SDL_StorageInterface {

	SDL_StorageInterface() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("version"),
			MemoryLayout.paddingLayout(4),
			SDL3.C_POINTER.withName("close"),
			SDL3.C_POINTER.withName("ready"),
			SDL3.C_POINTER.withName("enumerate"),
			SDL3.C_POINTER.withName("info"),
			SDL3.C_POINTER.withName("read_file"),
			SDL3.C_POINTER.withName("write_file"),
			SDL3.C_POINTER.withName("mkdir"),
			SDL3.C_POINTER.withName("remove"),
			SDL3.C_POINTER.withName("rename"),
			SDL3.C_POINTER.withName("copy"),
			SDL3.C_POINTER.withName("space_remaining")
	).withName("SDL_StorageInterface");

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

	public final static class ready {

		private ready() {

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

		private static final MethodHandle UP$MH = SDL3.upcallHandle(ready.Function.class, "apply", $DESC);

		public static MemorySegment allocate(ready.Function fi, Arena arena) {
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

	private static final AddressLayout ready$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("ready"));

	public static AddressLayout ready$layout() {
		return ready$LAYOUT;
	}

	private static final long ready$OFFSET = $LAYOUT.byteOffset(groupElement("ready"));

	public static long ready$offset() {
		return ready$OFFSET;
	}

	public static MemorySegment ready(MemorySegment struct) {
		return struct.get(ready$LAYOUT, ready$OFFSET);
	}

	public static void ready(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(ready$LAYOUT, ready$OFFSET, fieldValue);
	}

	public final static class enumerate {

		private enumerate() {

		}

		public interface Function {
			boolean apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, MemorySegment _x3);
		}

		private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static FunctionDescriptor descriptor() {
			return $DESC;
		}

		private static final MethodHandle UP$MH = SDL3.upcallHandle(enumerate.Function.class, "apply", $DESC);

		public static MemorySegment allocate(enumerate.Function fi, Arena arena) {
			return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
		}

		private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

		public static boolean invoke(MemorySegment funcPtr, MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, MemorySegment _x3) {
			try {
				return (boolean) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3);
			} catch (Error | RuntimeException ex) {
				throw ex;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	private static final AddressLayout enumerate$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("enumerate"));

	public static AddressLayout enumerate$layout() {
		return enumerate$LAYOUT;
	}

	private static final long enumerate$OFFSET = $LAYOUT.byteOffset(groupElement("enumerate"));

	public static long enumerate$offset() {
		return enumerate$OFFSET;
	}

	public static MemorySegment enumerate(MemorySegment struct) {
		return struct.get(enumerate$LAYOUT, enumerate$OFFSET);
	}

	public static void enumerate(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(enumerate$LAYOUT, enumerate$OFFSET, fieldValue);
	}

	public final static class info {

		private info() {

		}

		public interface Function {
			boolean apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2);
		}

		private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static FunctionDescriptor descriptor() {
			return $DESC;
		}

		private static final MethodHandle UP$MH = SDL3.upcallHandle(info.Function.class, "apply", $DESC);

		public static MemorySegment allocate(info.Function fi, Arena arena) {
			return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
		}

		private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

		public static boolean invoke(MemorySegment funcPtr, MemorySegment _x0, MemorySegment _x1, MemorySegment _x2) {
			try {
				return (boolean) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
			} catch (Error | RuntimeException ex) {
				throw ex;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	private static final AddressLayout info$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("info"));

	public static AddressLayout info$layout() {
		return info$LAYOUT;
	}

	private static final long info$OFFSET = $LAYOUT.byteOffset(groupElement("info"));

	public static long info$offset() {
		return info$OFFSET;
	}

	public static MemorySegment info(MemorySegment struct) {
		return struct.get(info$LAYOUT, info$OFFSET);
	}

	public static void info(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(info$LAYOUT, info$OFFSET, fieldValue);
	}

	public final static class read_file {

		private read_file() {

		}

		public interface Function {
			boolean apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, long _x3);
		}

		private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static FunctionDescriptor descriptor() {
			return $DESC;
		}

		private static final MethodHandle UP$MH = SDL3.upcallHandle(read_file.Function.class, "apply", $DESC);

		public static MemorySegment allocate(read_file.Function fi, Arena arena) {
			return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
		}

		private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

		public static boolean invoke(MemorySegment funcPtr, MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, long _x3) {
			try {
				return (boolean) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3);
			} catch (Error | RuntimeException ex) {
				throw ex;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	private static final AddressLayout read_file$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("read_file"));

	public static AddressLayout read_file$layout() {
		return read_file$LAYOUT;
	}

	private static final long read_file$OFFSET = $LAYOUT.byteOffset(groupElement("read_file"));

	public static long read_file$offset() {
		return read_file$OFFSET;
	}

	public static MemorySegment read_file(MemorySegment struct) {
		return struct.get(read_file$LAYOUT, read_file$OFFSET);
	}

	public static void read_file(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(read_file$LAYOUT, read_file$OFFSET, fieldValue);
	}

	public final static class write_file {

		private write_file() {

		}

		public interface Function {
			boolean apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, long _x3);
		}

		private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static FunctionDescriptor descriptor() {
			return $DESC;
		}

		private static final MethodHandle UP$MH = SDL3.upcallHandle(write_file.Function.class, "apply", $DESC);

		public static MemorySegment allocate(write_file.Function fi, Arena arena) {
			return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
		}

		private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

		public static boolean invoke(MemorySegment funcPtr, MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, long _x3) {
			try {
				return (boolean) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3);
			} catch (Error | RuntimeException ex) {
				throw ex;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	private static final AddressLayout write_file$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("write_file"));

	public static AddressLayout write_file$layout() {
		return write_file$LAYOUT;
	}

	private static final long write_file$OFFSET = $LAYOUT.byteOffset(groupElement("write_file"));

	public static long write_file$offset() {
		return write_file$OFFSET;
	}

	public static MemorySegment write_file(MemorySegment struct) {
		return struct.get(write_file$LAYOUT, write_file$OFFSET);
	}

	public static void write_file(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(write_file$LAYOUT, write_file$OFFSET, fieldValue);
	}

	public final static class mkdir {

		private mkdir() {

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

		private static final MethodHandle UP$MH = SDL3.upcallHandle(mkdir.Function.class, "apply", $DESC);

		public static MemorySegment allocate(mkdir.Function fi, Arena arena) {
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

	private static final AddressLayout mkdir$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("mkdir"));

	public static AddressLayout mkdir$layout() {
		return mkdir$LAYOUT;
	}

	private static final long mkdir$OFFSET = $LAYOUT.byteOffset(groupElement("mkdir"));

	public static long mkdir$offset() {
		return mkdir$OFFSET;
	}

	public static MemorySegment mkdir(MemorySegment struct) {
		return struct.get(mkdir$LAYOUT, mkdir$OFFSET);
	}

	public static void mkdir(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(mkdir$LAYOUT, mkdir$OFFSET, fieldValue);
	}

	public final static class remove {

		private remove() {

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

		private static final MethodHandle UP$MH = SDL3.upcallHandle(remove.Function.class, "apply", $DESC);

		public static MemorySegment allocate(remove.Function fi, Arena arena) {
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

	private static final AddressLayout remove$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("remove"));

	public static AddressLayout remove$layout() {
		return remove$LAYOUT;
	}

	private static final long remove$OFFSET = $LAYOUT.byteOffset(groupElement("remove"));

	public static long remove$offset() {
		return remove$OFFSET;
	}

	public static MemorySegment remove(MemorySegment struct) {
		return struct.get(remove$LAYOUT, remove$OFFSET);
	}

	public static void remove(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(remove$LAYOUT, remove$OFFSET, fieldValue);
	}

	public final static class rename {

		private rename() {

		}

		public interface Function {
			boolean apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2);
		}

		private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static FunctionDescriptor descriptor() {
			return $DESC;
		}

		private static final MethodHandle UP$MH = SDL3.upcallHandle(rename.Function.class, "apply", $DESC);

		public static MemorySegment allocate(rename.Function fi, Arena arena) {
			return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
		}

		private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

		public static boolean invoke(MemorySegment funcPtr, MemorySegment _x0, MemorySegment _x1, MemorySegment _x2) {
			try {
				return (boolean) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
			} catch (Error | RuntimeException ex) {
				throw ex;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	private static final AddressLayout rename$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("rename"));

	public static AddressLayout rename$layout() {
		return rename$LAYOUT;
	}

	private static final long rename$OFFSET = $LAYOUT.byteOffset(groupElement("rename"));

	public static long rename$offset() {
		return rename$OFFSET;
	}

	public static MemorySegment rename(MemorySegment struct) {
		return struct.get(rename$LAYOUT, rename$OFFSET);
	}

	public static void rename(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(rename$LAYOUT, rename$OFFSET, fieldValue);
	}

	public final static class copy {

		private copy() {

		}

		public interface Function {
			boolean apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2);
		}

		private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static FunctionDescriptor descriptor() {
			return $DESC;
		}

		private static final MethodHandle UP$MH = SDL3.upcallHandle(copy.Function.class, "apply", $DESC);

		public static MemorySegment allocate(copy.Function fi, Arena arena) {
			return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
		}

		private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

		public static boolean invoke(MemorySegment funcPtr, MemorySegment _x0, MemorySegment _x1, MemorySegment _x2) {
			try {
				return (boolean) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
			} catch (Error | RuntimeException ex) {
				throw ex;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	private static final AddressLayout copy$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("copy"));

	public static AddressLayout copy$layout() {
		return copy$LAYOUT;
	}

	private static final long copy$OFFSET = $LAYOUT.byteOffset(groupElement("copy"));

	public static long copy$offset() {
		return copy$OFFSET;
	}

	public static MemorySegment copy(MemorySegment struct) {
		return struct.get(copy$LAYOUT, copy$OFFSET);
	}

	public static void copy(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(copy$LAYOUT, copy$OFFSET, fieldValue);
	}

	public final static class space_remaining {

		private space_remaining() {

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

		private static final MethodHandle UP$MH = SDL3.upcallHandle(space_remaining.Function.class, "apply", $DESC);

		public static MemorySegment allocate(space_remaining.Function fi, Arena arena) {
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

	private static final AddressLayout space_remaining$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("space_remaining"));

	public static AddressLayout space_remaining$layout() {
		return space_remaining$LAYOUT;
	}

	private static final long space_remaining$OFFSET = $LAYOUT.byteOffset(groupElement("space_remaining"));

	public static long space_remaining$offset() {
		return space_remaining$OFFSET;
	}

	public static MemorySegment space_remaining(MemorySegment struct) {
		return struct.get(space_remaining$LAYOUT, space_remaining$OFFSET);
	}

	public static void space_remaining(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(space_remaining$LAYOUT, space_remaining$OFFSET, fieldValue);
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
