package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

public final class SDL_X11EventHook {

	private SDL_X11EventHook() {

	}

	public interface Function {
		boolean apply(MemorySegment userdata, MemorySegment xevent);
	}

	private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
			SDL3.C_BOOL,
			SDL3.C_POINTER,
			SDL3.C_POINTER
	);

	public static FunctionDescriptor descriptor() {
		return $DESC;
	}

	private static final MethodHandle UP$MH = SDL3.upcallHandle(SDL_X11EventHook.Function.class, "apply", $DESC);

	public static MemorySegment allocate(SDL_X11EventHook.Function fi, Arena arena) {
		return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
	}

	private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

	public static boolean invoke(MemorySegment funcPtr, MemorySegment userdata, MemorySegment xevent) {
		try {
			return (boolean) DOWN$MH.invokeExact(funcPtr, userdata, xevent);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}
}
