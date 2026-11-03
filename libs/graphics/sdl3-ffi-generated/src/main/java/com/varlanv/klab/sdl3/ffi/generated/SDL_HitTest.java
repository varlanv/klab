package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

public final class SDL_HitTest {

	private SDL_HitTest() {

	}

	public interface Function {
		int apply(MemorySegment win, MemorySegment area, MemorySegment data);
	}

	private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
			SDL3.C_INT,
			SDL3.C_POINTER,
			SDL3.C_POINTER,
			SDL3.C_POINTER
	);

	public static FunctionDescriptor descriptor() {
		return $DESC;
	}

	private static final MethodHandle UP$MH = SDL3.upcallHandle(SDL_HitTest.Function.class, "apply", $DESC);

	public static MemorySegment allocate(SDL_HitTest.Function fi, Arena arena) {
		return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
	}

	private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

	public static int invoke(MemorySegment funcPtr, MemorySegment win, MemorySegment area, MemorySegment data) {
		try {
			return (int) DOWN$MH.invokeExact(funcPtr, win, area, data);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}
}
