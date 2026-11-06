package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

public final class SDL_TrayCallback {

	private SDL_TrayCallback() {

	}

	public interface Function {
		void apply(MemorySegment userdata, MemorySegment entry);
	}

	private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
			SDL3.C_POINTER,
			SDL3.C_POINTER
	);

	public static FunctionDescriptor descriptor() {
		return $DESC;
	}

	private static final MethodHandle UP$MH = SDL3.upcallHandle(SDL_TrayCallback.Function.class, "apply", $DESC);

	public static MemorySegment allocate(SDL_TrayCallback.Function fi, Arena arena) {
		return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
	}

	private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

	public static void invoke(MemorySegment funcPtr, MemorySegment userdata, MemorySegment entry) {
		try {
			DOWN$MH.invokeExact(funcPtr, userdata, entry);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}
}
