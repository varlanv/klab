package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

public final class SDL_CompareCallback {

	private SDL_CompareCallback() {

	}

	public interface Function {
		int apply(MemorySegment a, MemorySegment b);
	}

	private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
			SDL3.C_INT,
			SDL3.C_POINTER,
			SDL3.C_POINTER
	);

	public static FunctionDescriptor descriptor() {
		return $DESC;
	}

	private static final MethodHandle UP$MH = SDL3.upcallHandle(SDL_CompareCallback.Function.class, "apply", $DESC);

	public static MemorySegment allocate(SDL_CompareCallback.Function fi, Arena arena) {
		return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
	}

	private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

	public static int invoke(MemorySegment funcPtr, MemorySegment a, MemorySegment b) {
		try {
			return (int) DOWN$MH.invokeExact(funcPtr, a, b);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}
}
