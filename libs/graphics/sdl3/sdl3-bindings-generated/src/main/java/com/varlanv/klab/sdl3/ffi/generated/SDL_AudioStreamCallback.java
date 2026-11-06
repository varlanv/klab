package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

public final class SDL_AudioStreamCallback {

	private SDL_AudioStreamCallback() {

	}

	public interface Function {
		void apply(MemorySegment userdata, MemorySegment stream, int additional_amount, int total_amount);
	}

	private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
			SDL3.C_POINTER,
			SDL3.C_POINTER,
			SDL3.C_INT,
			SDL3.C_INT
	);

	public static FunctionDescriptor descriptor() {
		return $DESC;
	}

	private static final MethodHandle UP$MH = SDL3.upcallHandle(SDL_AudioStreamCallback.Function.class, "apply", $DESC);

	public static MemorySegment allocate(SDL_AudioStreamCallback.Function fi, Arena arena) {
		return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
	}

	private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

	public static void invoke(MemorySegment funcPtr, MemorySegment userdata, MemorySegment stream, int additional_amount, int total_amount) {
		try {
			DOWN$MH.invokeExact(funcPtr, userdata, stream, additional_amount, total_amount);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}
}
