package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

public final class SDL_NSTimerCallback {

	private SDL_NSTimerCallback() {

	}

	public interface Function {
		long apply(MemorySegment userdata, int timerID, long interval);
	}

	private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
			SDL3.C_LONG,
			SDL3.C_POINTER,
			SDL3.C_INT,
			SDL3.C_LONG
	);

	public static FunctionDescriptor descriptor() {
		return $DESC;
	}

	private static final MethodHandle UP$MH = SDL3.upcallHandle(SDL_NSTimerCallback.Function.class, "apply", $DESC);

	public static MemorySegment allocate(SDL_NSTimerCallback.Function fi, Arena arena) {
		return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
	}

	private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

	public static long invoke(MemorySegment funcPtr, MemorySegment userdata, int timerID, long interval) {
		try {
			return (long) DOWN$MH.invokeExact(funcPtr, userdata, timerID, interval);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}
}
