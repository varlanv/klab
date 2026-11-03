package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;

class SDL3_3 extends SDL3$shared {

	SDL3_3() {

	}

	static final Arena LIBRARY_ARENA = Arena.ofAuto();

	static final SymbolLookup SYMBOL_LOOKUP = SymbolLookup.libraryLookup("libSDL3.so.0", LIBRARY_ARENA)
			.or(SymbolLookup.loaderLookup())
			.or(Linker.nativeLinker().defaultLookup());

	private static final int SDL_PLATFORM_LINUX = (int) 1L;

	public static int SDL_PLATFORM_LINUX() {
		return SDL_PLATFORM_LINUX;
	}

	private static final int SDL_PLATFORM_UNIX = (int) 1L;

	public static int SDL_PLATFORM_UNIX() {
		return SDL_PLATFORM_UNIX;
	}

	private static final int SDL_INVALID_UNICODE_CODEPOINT = (int) 65533L;

	public static int SDL_INVALID_UNICODE_CODEPOINT() {
		return SDL_INVALID_UNICODE_CODEPOINT;
	}

	private static final int SDL_ASSERT_LEVEL = (int) 2L;

	public static int SDL_ASSERT_LEVEL() {
		return SDL_ASSERT_LEVEL;
	}

	private static final int SDL_LIL_ENDIAN = (int) 1234L;

	public static int SDL_LIL_ENDIAN() {
		return SDL_LIL_ENDIAN;
	}

	private static final int SDL_BIG_ENDIAN = (int) 4321L;

	public static int SDL_BIG_ENDIAN() {
		return SDL_BIG_ENDIAN;
	}

	private static final int SDL_ALPHA_OPAQUE = (int) 255L;

	public static int SDL_ALPHA_OPAQUE() {
		return SDL_ALPHA_OPAQUE;
	}

	private static final int SDL_ALPHA_TRANSPARENT = (int) 0L;

	public static int SDL_ALPHA_TRANSPARENT() {
		return SDL_ALPHA_TRANSPARENT;
	}

	private static final int SDL_CACHELINE_SIZE = (int) 128L;

	public static int SDL_CACHELINE_SIZE() {
		return SDL_CACHELINE_SIZE;
	}

	private static final int SDL_GL_CONTEXT_PROFILE_CORE = (int) 1L;

	public static int SDL_GL_CONTEXT_PROFILE_CORE() {
		return SDL_GL_CONTEXT_PROFILE_CORE;
	}

	private static final int SDL_GL_CONTEXT_PROFILE_COMPATIBILITY = (int) 2L;

	public static int SDL_GL_CONTEXT_PROFILE_COMPATIBILITY() {
		return SDL_GL_CONTEXT_PROFILE_COMPATIBILITY;
	}

	private static final int SDL_GL_CONTEXT_PROFILE_ES = (int) 4L;

	public static int SDL_GL_CONTEXT_PROFILE_ES() {
		return SDL_GL_CONTEXT_PROFILE_ES;
	}

	private static final int SDL_GL_CONTEXT_DEBUG_FLAG = (int) 1L;

	public static int SDL_GL_CONTEXT_DEBUG_FLAG() {
		return SDL_GL_CONTEXT_DEBUG_FLAG;
	}

	private static final int SDL_GL_CONTEXT_FORWARD_COMPATIBLE_FLAG = (int) 2L;

	public static int SDL_GL_CONTEXT_FORWARD_COMPATIBLE_FLAG() {
		return SDL_GL_CONTEXT_FORWARD_COMPATIBLE_FLAG;
	}

	private static final int SDL_GL_CONTEXT_ROBUST_ACCESS_FLAG = (int) 4L;

	public static int SDL_GL_CONTEXT_ROBUST_ACCESS_FLAG() {
		return SDL_GL_CONTEXT_ROBUST_ACCESS_FLAG;
	}

	private static final int SDL_GL_CONTEXT_RESET_ISOLATION_FLAG = (int) 8L;

	public static int SDL_GL_CONTEXT_RESET_ISOLATION_FLAG() {
		return SDL_GL_CONTEXT_RESET_ISOLATION_FLAG;
	}

	private static final int SDL_GL_CONTEXT_RELEASE_BEHAVIOR_NONE = (int) 0L;

	public static int SDL_GL_CONTEXT_RELEASE_BEHAVIOR_NONE() {
		return SDL_GL_CONTEXT_RELEASE_BEHAVIOR_NONE;
	}

	private static final int SDL_GL_CONTEXT_RELEASE_BEHAVIOR_FLUSH = (int) 1L;

	public static int SDL_GL_CONTEXT_RELEASE_BEHAVIOR_FLUSH() {
		return SDL_GL_CONTEXT_RELEASE_BEHAVIOR_FLUSH;
	}

	private static final int SDL_GL_CONTEXT_RESET_NO_NOTIFICATION = (int) 0L;

	public static int SDL_GL_CONTEXT_RESET_NO_NOTIFICATION() {
		return SDL_GL_CONTEXT_RESET_NO_NOTIFICATION;
	}

	private static final int SDL_GL_CONTEXT_RESET_LOSE_CONTEXT = (int) 1L;

	public static int SDL_GL_CONTEXT_RESET_LOSE_CONTEXT() {
		return SDL_GL_CONTEXT_RESET_LOSE_CONTEXT;
	}

	private static final int SDL_WINDOW_SURFACE_VSYNC_DISABLED = (int) 0L;

	public static int SDL_WINDOW_SURFACE_VSYNC_DISABLED() {
		return SDL_WINDOW_SURFACE_VSYNC_DISABLED;
	}

	private static final int SDL_JOYSTICK_AXIS_MAX = (int) 32767L;

	public static int SDL_JOYSTICK_AXIS_MAX() {
		return SDL_JOYSTICK_AXIS_MAX;
	}

	private static final int SDL_BUTTON_LEFT = (int) 1L;

	public static int SDL_BUTTON_LEFT() {
		return SDL_BUTTON_LEFT;
	}

	private static final int SDL_BUTTON_MIDDLE = (int) 2L;

	public static int SDL_BUTTON_MIDDLE() {
		return SDL_BUTTON_MIDDLE;
	}

	private static final int SDL_BUTTON_RIGHT = (int) 3L;

	public static int SDL_BUTTON_RIGHT() {
		return SDL_BUTTON_RIGHT;
	}

	private static final int SDL_BUTTON_X1 = (int) 4L;

	public static int SDL_BUTTON_X1() {
		return SDL_BUTTON_X1;
	}

	private static final int SDL_BUTTON_X2 = (int) 5L;

	public static int SDL_BUTTON_X2() {
		return SDL_BUTTON_X2;
	}

	private static final int SDL_GPU_SHADERFORMAT_INVALID = (int) 0L;

	public static int SDL_GPU_SHADERFORMAT_INVALID() {
		return SDL_GPU_SHADERFORMAT_INVALID;
	}

	private static final int SDL_HAPTIC_POLAR = (int) 0L;

	public static int SDL_HAPTIC_POLAR() {
		return SDL_HAPTIC_POLAR;
	}

	private static final int SDL_HAPTIC_CARTESIAN = (int) 1L;

	public static int SDL_HAPTIC_CARTESIAN() {
		return SDL_HAPTIC_CARTESIAN;
	}

	private static final int SDL_HAPTIC_SPHERICAL = (int) 2L;

	public static int SDL_HAPTIC_SPHERICAL() {
		return SDL_HAPTIC_SPHERICAL;
	}

	private static final int SDL_HAPTIC_STEERING_AXIS = (int) 3L;

	public static int SDL_HAPTIC_STEERING_AXIS() {
		return SDL_HAPTIC_STEERING_AXIS;
	}

	private static final int SDL_RENDERER_VSYNC_DISABLED = (int) 0L;

	public static int SDL_RENDERER_VSYNC_DISABLED() {
		return SDL_RENDERER_VSYNC_DISABLED;
	}

	private static final int SDL_DEBUG_TEXT_FONT_CHARACTER_SIZE = (int) 8L;

	public static int SDL_DEBUG_TEXT_FONT_CHARACTER_SIZE() {
		return SDL_DEBUG_TEXT_FONT_CHARACTER_SIZE;
	}

	private static final int SDL_MS_PER_SECOND = (int) 1000L;

	public static int SDL_MS_PER_SECOND() {
		return SDL_MS_PER_SECOND;
	}

	private static final int SDL_US_PER_SECOND = (int) 1000000L;

	public static int SDL_US_PER_SECOND() {
		return SDL_US_PER_SECOND;
	}

	private static final int SDL_NS_PER_MS = (int) 1000000L;

	public static int SDL_NS_PER_MS() {
		return SDL_NS_PER_MS;
	}

	private static final int SDL_NS_PER_US = (int) 1000L;

	public static int SDL_NS_PER_US() {
		return SDL_NS_PER_US;
	}

	private static final int SDL_MAJOR_VERSION = (int) 3L;

	public static int SDL_MAJOR_VERSION() {
		return SDL_MAJOR_VERSION;
	}

	private static final int SDL_MINOR_VERSION = (int) 4L;

	public static int SDL_MINOR_VERSION() {
		return SDL_MINOR_VERSION;
	}

	private static final int SDL_MICRO_VERSION = (int) 18L;

	public static int SDL_MICRO_VERSION() {
		return SDL_MICRO_VERSION;
	}

	public static OfByte Sint8 = SDL3.C_CHAR;

	public static OfByte Uint8 = SDL3.C_CHAR;

	public static OfShort Sint16 = SDL3.C_SHORT;

	public static OfShort Uint16 = SDL3.C_SHORT;

	public static OfInt Sint32 = SDL3.C_INT;

	public static OfInt Uint32 = SDL3.C_INT;

	public static OfLong Sint64 = SDL3.C_LONG;

	public static OfLong Uint64 = SDL3.C_LONG;

	public static OfLong SDL_Time = SDL3.C_LONG;
	private static final int DUMMY_ENUM_VALUE = (int) 0L;

	public static int DUMMY_ENUM_VALUE() {
		return DUMMY_ENUM_VALUE;
	}

	private static class SDL_malloc {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_malloc");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_malloc$descriptor() {
		return SDL_malloc.DESC;
	}

	public static MethodHandle SDL_malloc$handle() {
		return SDL_malloc.HANDLE;
	}

	public static MemorySegment SDL_malloc$address() {
		return SDL_malloc.ADDR;
	}

	public static MemorySegment SDL_malloc(long size) {
		var mh$ = SDL_malloc.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_malloc", size);
			}
			return (MemorySegment) mh$.invokeExact(size);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_calloc {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_LONG,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_calloc");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_calloc$descriptor() {
		return SDL_calloc.DESC;
	}

	public static MethodHandle SDL_calloc$handle() {
		return SDL_calloc.HANDLE;
	}

	public static MemorySegment SDL_calloc$address() {
		return SDL_calloc.ADDR;
	}

	public static MemorySegment SDL_calloc(long nmemb, long size) {
		var mh$ = SDL_calloc.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_calloc", nmemb, size);
			}
			return (MemorySegment) mh$.invokeExact(nmemb, size);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_realloc {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_realloc");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_realloc$descriptor() {
		return SDL_realloc.DESC;
	}

	public static MethodHandle SDL_realloc$handle() {
		return SDL_realloc.HANDLE;
	}

	public static MemorySegment SDL_realloc$address() {
		return SDL_realloc.ADDR;
	}

	public static MemorySegment SDL_realloc(MemorySegment mem, long size) {
		var mh$ = SDL_realloc.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_realloc", mem, size);
			}
			return (MemorySegment) mh$.invokeExact(mem, size);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_free {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_free");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_free$descriptor() {
		return SDL_free.DESC;
	}

	public static MethodHandle SDL_free$handle() {
		return SDL_free.HANDLE;
	}

	public static MemorySegment SDL_free$address() {
		return SDL_free.ADDR;
	}

	public static void SDL_free(MemorySegment mem) {
		var mh$ = SDL_free.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_free", mem);
			}
			mh$.invokeExact(mem);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetOriginalMemoryFunctions {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetOriginalMemoryFunctions");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetOriginalMemoryFunctions$descriptor() {
		return SDL_GetOriginalMemoryFunctions.DESC;
	}

	public static MethodHandle SDL_GetOriginalMemoryFunctions$handle() {
		return SDL_GetOriginalMemoryFunctions.HANDLE;
	}

	public static MemorySegment SDL_GetOriginalMemoryFunctions$address() {
		return SDL_GetOriginalMemoryFunctions.ADDR;
	}

	public static void SDL_GetOriginalMemoryFunctions(MemorySegment malloc_func, MemorySegment calloc_func, MemorySegment realloc_func, MemorySegment free_func) {
		var mh$ = SDL_GetOriginalMemoryFunctions.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetOriginalMemoryFunctions", malloc_func, calloc_func, realloc_func, free_func);
			}
			mh$.invokeExact(malloc_func, calloc_func, realloc_func, free_func);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetMemoryFunctions {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetMemoryFunctions");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetMemoryFunctions$descriptor() {
		return SDL_GetMemoryFunctions.DESC;
	}

	public static MethodHandle SDL_GetMemoryFunctions$handle() {
		return SDL_GetMemoryFunctions.HANDLE;
	}

	public static MemorySegment SDL_GetMemoryFunctions$address() {
		return SDL_GetMemoryFunctions.ADDR;
	}

	public static void SDL_GetMemoryFunctions(MemorySegment malloc_func, MemorySegment calloc_func, MemorySegment realloc_func, MemorySegment free_func) {
		var mh$ = SDL_GetMemoryFunctions.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetMemoryFunctions", malloc_func, calloc_func, realloc_func, free_func);
			}
			mh$.invokeExact(malloc_func, calloc_func, realloc_func, free_func);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetMemoryFunctions {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetMemoryFunctions");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetMemoryFunctions$descriptor() {
		return SDL_SetMemoryFunctions.DESC;
	}

	public static MethodHandle SDL_SetMemoryFunctions$handle() {
		return SDL_SetMemoryFunctions.HANDLE;
	}

	public static MemorySegment SDL_SetMemoryFunctions$address() {
		return SDL_SetMemoryFunctions.ADDR;
	}

	public static boolean SDL_SetMemoryFunctions(MemorySegment malloc_func, MemorySegment calloc_func, MemorySegment realloc_func, MemorySegment free_func) {
		var mh$ = SDL_SetMemoryFunctions.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetMemoryFunctions", malloc_func, calloc_func, realloc_func, free_func);
			}
			return (boolean) mh$.invokeExact(malloc_func, calloc_func, realloc_func, free_func);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_aligned_alloc {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_LONG,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_aligned_alloc");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_aligned_alloc$descriptor() {
		return SDL_aligned_alloc.DESC;
	}

	public static MethodHandle SDL_aligned_alloc$handle() {
		return SDL_aligned_alloc.HANDLE;
	}

	public static MemorySegment SDL_aligned_alloc$address() {
		return SDL_aligned_alloc.ADDR;
	}

	public static MemorySegment SDL_aligned_alloc(long alignment, long size) {
		var mh$ = SDL_aligned_alloc.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_aligned_alloc", alignment, size);
			}
			return (MemorySegment) mh$.invokeExact(alignment, size);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_aligned_free {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_aligned_free");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_aligned_free$descriptor() {
		return SDL_aligned_free.DESC;
	}

	public static MethodHandle SDL_aligned_free$handle() {
		return SDL_aligned_free.HANDLE;
	}

	public static MemorySegment SDL_aligned_free$address() {
		return SDL_aligned_free.ADDR;
	}

	public static void SDL_aligned_free(MemorySegment mem) {
		var mh$ = SDL_aligned_free.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_aligned_free", mem);
			}
			mh$.invokeExact(mem);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetNumAllocations {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetNumAllocations");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetNumAllocations$descriptor() {
		return SDL_GetNumAllocations.DESC;
	}

	public static MethodHandle SDL_GetNumAllocations$handle() {
		return SDL_GetNumAllocations.HANDLE;
	}

	public static MemorySegment SDL_GetNumAllocations$address() {
		return SDL_GetNumAllocations.ADDR;
	}

	public static int SDL_GetNumAllocations() {
		var mh$ = SDL_GetNumAllocations.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetNumAllocations");
			}
			return (int) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetEnvironment {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetEnvironment");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetEnvironment$descriptor() {
		return SDL_GetEnvironment.DESC;
	}

	public static MethodHandle SDL_GetEnvironment$handle() {
		return SDL_GetEnvironment.HANDLE;
	}

	public static MemorySegment SDL_GetEnvironment$address() {
		return SDL_GetEnvironment.ADDR;
	}

	public static MemorySegment SDL_GetEnvironment() {
		var mh$ = SDL_GetEnvironment.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetEnvironment");
			}
			return (MemorySegment) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateEnvironment {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateEnvironment");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateEnvironment$descriptor() {
		return SDL_CreateEnvironment.DESC;
	}

	public static MethodHandle SDL_CreateEnvironment$handle() {
		return SDL_CreateEnvironment.HANDLE;
	}

	public static MemorySegment SDL_CreateEnvironment$address() {
		return SDL_CreateEnvironment.ADDR;
	}

	public static MemorySegment SDL_CreateEnvironment(boolean populated) {
		var mh$ = SDL_CreateEnvironment.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateEnvironment", populated);
			}
			return (MemorySegment) mh$.invokeExact(populated);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetEnvironmentVariable {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetEnvironmentVariable");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetEnvironmentVariable$descriptor() {
		return SDL_GetEnvironmentVariable.DESC;
	}

	public static MethodHandle SDL_GetEnvironmentVariable$handle() {
		return SDL_GetEnvironmentVariable.HANDLE;
	}

	public static MemorySegment SDL_GetEnvironmentVariable$address() {
		return SDL_GetEnvironmentVariable.ADDR;
	}

	public static MemorySegment SDL_GetEnvironmentVariable(MemorySegment env, MemorySegment name) {
		var mh$ = SDL_GetEnvironmentVariable.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetEnvironmentVariable", env, name);
			}
			return (MemorySegment) mh$.invokeExact(env, name);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetEnvironmentVariables {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetEnvironmentVariables");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetEnvironmentVariables$descriptor() {
		return SDL_GetEnvironmentVariables.DESC;
	}

	public static MethodHandle SDL_GetEnvironmentVariables$handle() {
		return SDL_GetEnvironmentVariables.HANDLE;
	}

	public static MemorySegment SDL_GetEnvironmentVariables$address() {
		return SDL_GetEnvironmentVariables.ADDR;
	}

	public static MemorySegment SDL_GetEnvironmentVariables(MemorySegment env) {
		var mh$ = SDL_GetEnvironmentVariables.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetEnvironmentVariables", env);
			}
			return (MemorySegment) mh$.invokeExact(env);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetEnvironmentVariable {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetEnvironmentVariable");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetEnvironmentVariable$descriptor() {
		return SDL_SetEnvironmentVariable.DESC;
	}

	public static MethodHandle SDL_SetEnvironmentVariable$handle() {
		return SDL_SetEnvironmentVariable.HANDLE;
	}

	public static MemorySegment SDL_SetEnvironmentVariable$address() {
		return SDL_SetEnvironmentVariable.ADDR;
	}

	public static boolean SDL_SetEnvironmentVariable(MemorySegment env, MemorySegment name, MemorySegment value, boolean overwrite) {
		var mh$ = SDL_SetEnvironmentVariable.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetEnvironmentVariable", env, name, value, overwrite);
			}
			return (boolean) mh$.invokeExact(env, name, value, overwrite);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_UnsetEnvironmentVariable {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_UnsetEnvironmentVariable");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_UnsetEnvironmentVariable$descriptor() {
		return SDL_UnsetEnvironmentVariable.DESC;
	}

	public static MethodHandle SDL_UnsetEnvironmentVariable$handle() {
		return SDL_UnsetEnvironmentVariable.HANDLE;
	}

	public static MemorySegment SDL_UnsetEnvironmentVariable$address() {
		return SDL_UnsetEnvironmentVariable.ADDR;
	}

	public static boolean SDL_UnsetEnvironmentVariable(MemorySegment env, MemorySegment name) {
		var mh$ = SDL_UnsetEnvironmentVariable.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_UnsetEnvironmentVariable", env, name);
			}
			return (boolean) mh$.invokeExact(env, name);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DestroyEnvironment {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DestroyEnvironment");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DestroyEnvironment$descriptor() {
		return SDL_DestroyEnvironment.DESC;
	}

	public static MethodHandle SDL_DestroyEnvironment$handle() {
		return SDL_DestroyEnvironment.HANDLE;
	}

	public static MemorySegment SDL_DestroyEnvironment$address() {
		return SDL_DestroyEnvironment.ADDR;
	}

	public static void SDL_DestroyEnvironment(MemorySegment env) {
		var mh$ = SDL_DestroyEnvironment.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DestroyEnvironment", env);
			}
			mh$.invokeExact(env);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_getenv {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_getenv");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_getenv$descriptor() {
		return SDL_getenv.DESC;
	}

	public static MethodHandle SDL_getenv$handle() {
		return SDL_getenv.HANDLE;
	}

	public static MemorySegment SDL_getenv$address() {
		return SDL_getenv.ADDR;
	}

	public static MemorySegment SDL_getenv(MemorySegment name) {
		var mh$ = SDL_getenv.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_getenv", name);
			}
			return (MemorySegment) mh$.invokeExact(name);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_getenv_unsafe {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_getenv_unsafe");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_getenv_unsafe$descriptor() {
		return SDL_getenv_unsafe.DESC;
	}

	public static MethodHandle SDL_getenv_unsafe$handle() {
		return SDL_getenv_unsafe.HANDLE;
	}

	public static MemorySegment SDL_getenv_unsafe$address() {
		return SDL_getenv_unsafe.ADDR;
	}

	public static MemorySegment SDL_getenv_unsafe(MemorySegment name) {
		var mh$ = SDL_getenv_unsafe.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_getenv_unsafe", name);
			}
			return (MemorySegment) mh$.invokeExact(name);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_setenv_unsafe {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_setenv_unsafe");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_setenv_unsafe$descriptor() {
		return SDL_setenv_unsafe.DESC;
	}

	public static MethodHandle SDL_setenv_unsafe$handle() {
		return SDL_setenv_unsafe.HANDLE;
	}

	public static MemorySegment SDL_setenv_unsafe$address() {
		return SDL_setenv_unsafe.ADDR;
	}

	public static int SDL_setenv_unsafe(MemorySegment name, MemorySegment value, int overwrite) {
		var mh$ = SDL_setenv_unsafe.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_setenv_unsafe", name, value, overwrite);
			}
			return (int) mh$.invokeExact(name, value, overwrite);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_unsetenv_unsafe {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_unsetenv_unsafe");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_unsetenv_unsafe$descriptor() {
		return SDL_unsetenv_unsafe.DESC;
	}

	public static MethodHandle SDL_unsetenv_unsafe$handle() {
		return SDL_unsetenv_unsafe.HANDLE;
	}

	public static MemorySegment SDL_unsetenv_unsafe$address() {
		return SDL_unsetenv_unsafe.ADDR;
	}

	public static int SDL_unsetenv_unsafe(MemorySegment name) {
		var mh$ = SDL_unsetenv_unsafe.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_unsetenv_unsafe", name);
			}
			return (int) mh$.invokeExact(name);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_qsort {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_LONG,
				SDL3.C_LONG,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_qsort");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_qsort$descriptor() {
		return SDL_qsort.DESC;
	}

	public static MethodHandle SDL_qsort$handle() {
		return SDL_qsort.HANDLE;
	}

	public static MemorySegment SDL_qsort$address() {
		return SDL_qsort.ADDR;
	}

	public static void SDL_qsort(MemorySegment base, long nmemb, long size, MemorySegment compare) {
		var mh$ = SDL_qsort.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_qsort", base, nmemb, size, compare);
			}
			mh$.invokeExact(base, nmemb, size, compare);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_bsearch {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG,
				SDL3.C_LONG,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_bsearch");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_bsearch$descriptor() {
		return SDL_bsearch.DESC;
	}

	public static MethodHandle SDL_bsearch$handle() {
		return SDL_bsearch.HANDLE;
	}

	public static MemorySegment SDL_bsearch$address() {
		return SDL_bsearch.ADDR;
	}

	public static MemorySegment SDL_bsearch(MemorySegment key, MemorySegment base, long nmemb, long size, MemorySegment compare) {
		var mh$ = SDL_bsearch.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_bsearch", key, base, nmemb, size, compare);
			}
			return (MemorySegment) mh$.invokeExact(key, base, nmemb, size, compare);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_qsort_r {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_LONG,
				SDL3.C_LONG,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_qsort_r");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_qsort_r$descriptor() {
		return SDL_qsort_r.DESC;
	}

	public static MethodHandle SDL_qsort_r$handle() {
		return SDL_qsort_r.HANDLE;
	}

	public static MemorySegment SDL_qsort_r$address() {
		return SDL_qsort_r.ADDR;
	}

	public static void SDL_qsort_r(MemorySegment base, long nmemb, long size, MemorySegment compare, MemorySegment userdata) {
		var mh$ = SDL_qsort_r.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_qsort_r", base, nmemb, size, compare, userdata);
			}
			mh$.invokeExact(base, nmemb, size, compare, userdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_bsearch_r {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG,
				SDL3.C_LONG,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_bsearch_r");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_bsearch_r$descriptor() {
		return SDL_bsearch_r.DESC;
	}

	public static MethodHandle SDL_bsearch_r$handle() {
		return SDL_bsearch_r.HANDLE;
	}

	public static MemorySegment SDL_bsearch_r$address() {
		return SDL_bsearch_r.ADDR;
	}

	public static MemorySegment SDL_bsearch_r(MemorySegment key, MemorySegment base, long nmemb, long size, MemorySegment compare, MemorySegment userdata) {
		var mh$ = SDL_bsearch_r.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_bsearch_r", key, base, nmemb, size, compare, userdata);
			}
			return (MemorySegment) mh$.invokeExact(key, base, nmemb, size, compare, userdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_abs {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_abs");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_abs$descriptor() {
		return SDL_abs.DESC;
	}

	public static MethodHandle SDL_abs$handle() {
		return SDL_abs.HANDLE;
	}

	public static MemorySegment SDL_abs$address() {
		return SDL_abs.ADDR;
	}

	public static int SDL_abs(int x) {
		var mh$ = SDL_abs.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_abs", x);
			}
			return (int) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_isalpha {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_isalpha");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_isalpha$descriptor() {
		return SDL_isalpha.DESC;
	}

	public static MethodHandle SDL_isalpha$handle() {
		return SDL_isalpha.HANDLE;
	}

	public static MemorySegment SDL_isalpha$address() {
		return SDL_isalpha.ADDR;
	}

	public static int SDL_isalpha(int x) {
		var mh$ = SDL_isalpha.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_isalpha", x);
			}
			return (int) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_isalnum {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_isalnum");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_isalnum$descriptor() {
		return SDL_isalnum.DESC;
	}

	public static MethodHandle SDL_isalnum$handle() {
		return SDL_isalnum.HANDLE;
	}

	public static MemorySegment SDL_isalnum$address() {
		return SDL_isalnum.ADDR;
	}

	public static int SDL_isalnum(int x) {
		var mh$ = SDL_isalnum.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_isalnum", x);
			}
			return (int) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_isblank {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_isblank");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_isblank$descriptor() {
		return SDL_isblank.DESC;
	}

	public static MethodHandle SDL_isblank$handle() {
		return SDL_isblank.HANDLE;
	}

	public static MemorySegment SDL_isblank$address() {
		return SDL_isblank.ADDR;
	}

	public static int SDL_isblank(int x) {
		var mh$ = SDL_isblank.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_isblank", x);
			}
			return (int) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_iscntrl {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_iscntrl");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_iscntrl$descriptor() {
		return SDL_iscntrl.DESC;
	}

	public static MethodHandle SDL_iscntrl$handle() {
		return SDL_iscntrl.HANDLE;
	}

	public static MemorySegment SDL_iscntrl$address() {
		return SDL_iscntrl.ADDR;
	}

	public static int SDL_iscntrl(int x) {
		var mh$ = SDL_iscntrl.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_iscntrl", x);
			}
			return (int) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_isdigit {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_isdigit");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_isdigit$descriptor() {
		return SDL_isdigit.DESC;
	}

	public static MethodHandle SDL_isdigit$handle() {
		return SDL_isdigit.HANDLE;
	}

	public static MemorySegment SDL_isdigit$address() {
		return SDL_isdigit.ADDR;
	}

	public static int SDL_isdigit(int x) {
		var mh$ = SDL_isdigit.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_isdigit", x);
			}
			return (int) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_isxdigit {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_isxdigit");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_isxdigit$descriptor() {
		return SDL_isxdigit.DESC;
	}

	public static MethodHandle SDL_isxdigit$handle() {
		return SDL_isxdigit.HANDLE;
	}

	public static MemorySegment SDL_isxdigit$address() {
		return SDL_isxdigit.ADDR;
	}

	public static int SDL_isxdigit(int x) {
		var mh$ = SDL_isxdigit.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_isxdigit", x);
			}
			return (int) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ispunct {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ispunct");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ispunct$descriptor() {
		return SDL_ispunct.DESC;
	}

	public static MethodHandle SDL_ispunct$handle() {
		return SDL_ispunct.HANDLE;
	}

	public static MemorySegment SDL_ispunct$address() {
		return SDL_ispunct.ADDR;
	}

	public static int SDL_ispunct(int x) {
		var mh$ = SDL_ispunct.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ispunct", x);
			}
			return (int) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_isspace {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_isspace");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_isspace$descriptor() {
		return SDL_isspace.DESC;
	}

	public static MethodHandle SDL_isspace$handle() {
		return SDL_isspace.HANDLE;
	}

	public static MemorySegment SDL_isspace$address() {
		return SDL_isspace.ADDR;
	}

	public static int SDL_isspace(int x) {
		var mh$ = SDL_isspace.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_isspace", x);
			}
			return (int) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_isupper {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_isupper");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_isupper$descriptor() {
		return SDL_isupper.DESC;
	}

	public static MethodHandle SDL_isupper$handle() {
		return SDL_isupper.HANDLE;
	}

	public static MemorySegment SDL_isupper$address() {
		return SDL_isupper.ADDR;
	}

	public static int SDL_isupper(int x) {
		var mh$ = SDL_isupper.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_isupper", x);
			}
			return (int) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_islower {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_islower");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_islower$descriptor() {
		return SDL_islower.DESC;
	}

	public static MethodHandle SDL_islower$handle() {
		return SDL_islower.HANDLE;
	}

	public static MemorySegment SDL_islower$address() {
		return SDL_islower.ADDR;
	}

	public static int SDL_islower(int x) {
		var mh$ = SDL_islower.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_islower", x);
			}
			return (int) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_isprint {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_isprint");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_isprint$descriptor() {
		return SDL_isprint.DESC;
	}

	public static MethodHandle SDL_isprint$handle() {
		return SDL_isprint.HANDLE;
	}

	public static MemorySegment SDL_isprint$address() {
		return SDL_isprint.ADDR;
	}

	public static int SDL_isprint(int x) {
		var mh$ = SDL_isprint.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_isprint", x);
			}
			return (int) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_isgraph {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_isgraph");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_isgraph$descriptor() {
		return SDL_isgraph.DESC;
	}

	public static MethodHandle SDL_isgraph$handle() {
		return SDL_isgraph.HANDLE;
	}

	public static MemorySegment SDL_isgraph$address() {
		return SDL_isgraph.ADDR;
	}

	public static int SDL_isgraph(int x) {
		var mh$ = SDL_isgraph.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_isgraph", x);
			}
			return (int) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_toupper {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_toupper");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_toupper$descriptor() {
		return SDL_toupper.DESC;
	}

	public static MethodHandle SDL_toupper$handle() {
		return SDL_toupper.HANDLE;
	}

	public static MemorySegment SDL_toupper$address() {
		return SDL_toupper.ADDR;
	}

	public static int SDL_toupper(int x) {
		var mh$ = SDL_toupper.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_toupper", x);
			}
			return (int) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_tolower {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_tolower");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_tolower$descriptor() {
		return SDL_tolower.DESC;
	}

	public static MethodHandle SDL_tolower$handle() {
		return SDL_tolower.HANDLE;
	}

	public static MemorySegment SDL_tolower$address() {
		return SDL_tolower.ADDR;
	}

	public static int SDL_tolower(int x) {
		var mh$ = SDL_tolower.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_tolower", x);
			}
			return (int) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_crc16 {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_SHORT,
				SDL3.C_SHORT,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_crc16");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_crc16$descriptor() {
		return SDL_crc16.DESC;
	}

	public static MethodHandle SDL_crc16$handle() {
		return SDL_crc16.HANDLE;
	}

	public static MemorySegment SDL_crc16$address() {
		return SDL_crc16.ADDR;
	}

	public static short SDL_crc16(short crc, MemorySegment data, long len) {
		var mh$ = SDL_crc16.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_crc16", crc, data, len);
			}
			return (short) mh$.invokeExact(crc, data, len);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_crc32 {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_crc32");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_crc32$descriptor() {
		return SDL_crc32.DESC;
	}

	public static MethodHandle SDL_crc32$handle() {
		return SDL_crc32.HANDLE;
	}

	public static MemorySegment SDL_crc32$address() {
		return SDL_crc32.ADDR;
	}

	public static int SDL_crc32(int crc, MemorySegment data, long len) {
		var mh$ = SDL_crc32.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_crc32", crc, data, len);
			}
			return (int) mh$.invokeExact(crc, data, len);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_murmur3_32 {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_LONG,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_murmur3_32");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_murmur3_32$descriptor() {
		return SDL_murmur3_32.DESC;
	}

	public static MethodHandle SDL_murmur3_32$handle() {
		return SDL_murmur3_32.HANDLE;
	}

	public static MemorySegment SDL_murmur3_32$address() {
		return SDL_murmur3_32.ADDR;
	}

	public static int SDL_murmur3_32(MemorySegment data, long len, int seed) {
		var mh$ = SDL_murmur3_32.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_murmur3_32", data, len, seed);
			}
			return (int) mh$.invokeExact(data, len, seed);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_memcpy {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_memcpy");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_memcpy$descriptor() {
		return SDL_memcpy.DESC;
	}

	public static MethodHandle SDL_memcpy$handle() {
		return SDL_memcpy.HANDLE;
	}

	public static MemorySegment SDL_memcpy$address() {
		return SDL_memcpy.ADDR;
	}

	public static MemorySegment SDL_memcpy(MemorySegment dst, MemorySegment src, long len) {
		var mh$ = SDL_memcpy.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_memcpy", dst, src, len);
			}
			return (MemorySegment) mh$.invokeExact(dst, src, len);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_memmove {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_memmove");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_memmove$descriptor() {
		return SDL_memmove.DESC;
	}

	public static MethodHandle SDL_memmove$handle() {
		return SDL_memmove.HANDLE;
	}

	public static MemorySegment SDL_memmove$address() {
		return SDL_memmove.ADDR;
	}

	public static MemorySegment SDL_memmove(MemorySegment dst, MemorySegment src, long len) {
		var mh$ = SDL_memmove.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_memmove", dst, src, len);
			}
			return (MemorySegment) mh$.invokeExact(dst, src, len);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_memset {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_memset");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_memset$descriptor() {
		return SDL_memset.DESC;
	}

	public static MethodHandle SDL_memset$handle() {
		return SDL_memset.HANDLE;
	}

	public static MemorySegment SDL_memset$address() {
		return SDL_memset.ADDR;
	}

	public static MemorySegment SDL_memset(MemorySegment dst, int c, long len) {
		var mh$ = SDL_memset.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_memset", dst, c, len);
			}
			return (MemorySegment) mh$.invokeExact(dst, c, len);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_memset4 {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_memset4");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_memset4$descriptor() {
		return SDL_memset4.DESC;
	}

	public static MethodHandle SDL_memset4$handle() {
		return SDL_memset4.HANDLE;
	}

	public static MemorySegment SDL_memset4$address() {
		return SDL_memset4.ADDR;
	}

	public static MemorySegment SDL_memset4(MemorySegment dst, int val, long dwords) {
		var mh$ = SDL_memset4.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_memset4", dst, val, dwords);
			}
			return (MemorySegment) mh$.invokeExact(dst, val, dwords);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_memcmp {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_memcmp");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_memcmp$descriptor() {
		return SDL_memcmp.DESC;
	}

	public static MethodHandle SDL_memcmp$handle() {
		return SDL_memcmp.HANDLE;
	}

	public static MemorySegment SDL_memcmp$address() {
		return SDL_memcmp.ADDR;
	}

	public static int SDL_memcmp(MemorySegment s1, MemorySegment s2, long len) {
		var mh$ = SDL_memcmp.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_memcmp", s1, s2, len);
			}
			return (int) mh$.invokeExact(s1, s2, len);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_wcslen {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_wcslen");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_wcslen$descriptor() {
		return SDL_wcslen.DESC;
	}

	public static MethodHandle SDL_wcslen$handle() {
		return SDL_wcslen.HANDLE;
	}

	public static MemorySegment SDL_wcslen$address() {
		return SDL_wcslen.ADDR;
	}

	public static long SDL_wcslen(MemorySegment wstr) {
		var mh$ = SDL_wcslen.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_wcslen", wstr);
			}
			return (long) mh$.invokeExact(wstr);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_wcsnlen {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_wcsnlen");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_wcsnlen$descriptor() {
		return SDL_wcsnlen.DESC;
	}

	public static MethodHandle SDL_wcsnlen$handle() {
		return SDL_wcsnlen.HANDLE;
	}

	public static MemorySegment SDL_wcsnlen$address() {
		return SDL_wcsnlen.ADDR;
	}

	public static long SDL_wcsnlen(MemorySegment wstr, long maxlen) {
		var mh$ = SDL_wcsnlen.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_wcsnlen", wstr, maxlen);
			}
			return (long) mh$.invokeExact(wstr, maxlen);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_wcslcpy {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_wcslcpy");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_wcslcpy$descriptor() {
		return SDL_wcslcpy.DESC;
	}

	public static MethodHandle SDL_wcslcpy$handle() {
		return SDL_wcslcpy.HANDLE;
	}

	public static MemorySegment SDL_wcslcpy$address() {
		return SDL_wcslcpy.ADDR;
	}

	public static long SDL_wcslcpy(MemorySegment dst, MemorySegment src, long maxlen) {
		var mh$ = SDL_wcslcpy.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_wcslcpy", dst, src, maxlen);
			}
			return (long) mh$.invokeExact(dst, src, maxlen);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_wcslcat {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_wcslcat");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_wcslcat$descriptor() {
		return SDL_wcslcat.DESC;
	}

	public static MethodHandle SDL_wcslcat$handle() {
		return SDL_wcslcat.HANDLE;
	}

	public static MemorySegment SDL_wcslcat$address() {
		return SDL_wcslcat.ADDR;
	}

	public static long SDL_wcslcat(MemorySegment dst, MemorySegment src, long maxlen) {
		var mh$ = SDL_wcslcat.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_wcslcat", dst, src, maxlen);
			}
			return (long) mh$.invokeExact(dst, src, maxlen);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_wcsdup {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_wcsdup");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_wcsdup$descriptor() {
		return SDL_wcsdup.DESC;
	}

	public static MethodHandle SDL_wcsdup$handle() {
		return SDL_wcsdup.HANDLE;
	}

	public static MemorySegment SDL_wcsdup$address() {
		return SDL_wcsdup.ADDR;
	}

	public static MemorySegment SDL_wcsdup(MemorySegment wstr) {
		var mh$ = SDL_wcsdup.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_wcsdup", wstr);
			}
			return (MemorySegment) mh$.invokeExact(wstr);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_wcsstr {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_wcsstr");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_wcsstr$descriptor() {
		return SDL_wcsstr.DESC;
	}

	public static MethodHandle SDL_wcsstr$handle() {
		return SDL_wcsstr.HANDLE;
	}

	public static MemorySegment SDL_wcsstr$address() {
		return SDL_wcsstr.ADDR;
	}

	public static MemorySegment SDL_wcsstr(MemorySegment haystack, MemorySegment needle) {
		var mh$ = SDL_wcsstr.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_wcsstr", haystack, needle);
			}
			return (MemorySegment) mh$.invokeExact(haystack, needle);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_wcsnstr {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_wcsnstr");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_wcsnstr$descriptor() {
		return SDL_wcsnstr.DESC;
	}

	public static MethodHandle SDL_wcsnstr$handle() {
		return SDL_wcsnstr.HANDLE;
	}

	public static MemorySegment SDL_wcsnstr$address() {
		return SDL_wcsnstr.ADDR;
	}

	public static MemorySegment SDL_wcsnstr(MemorySegment haystack, MemorySegment needle, long maxlen) {
		var mh$ = SDL_wcsnstr.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_wcsnstr", haystack, needle, maxlen);
			}
			return (MemorySegment) mh$.invokeExact(haystack, needle, maxlen);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_wcscmp {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_wcscmp");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_wcscmp$descriptor() {
		return SDL_wcscmp.DESC;
	}

	public static MethodHandle SDL_wcscmp$handle() {
		return SDL_wcscmp.HANDLE;
	}

	public static MemorySegment SDL_wcscmp$address() {
		return SDL_wcscmp.ADDR;
	}

	public static int SDL_wcscmp(MemorySegment str1, MemorySegment str2) {
		var mh$ = SDL_wcscmp.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_wcscmp", str1, str2);
			}
			return (int) mh$.invokeExact(str1, str2);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_wcsncmp {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_wcsncmp");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_wcsncmp$descriptor() {
		return SDL_wcsncmp.DESC;
	}

	public static MethodHandle SDL_wcsncmp$handle() {
		return SDL_wcsncmp.HANDLE;
	}

	public static MemorySegment SDL_wcsncmp$address() {
		return SDL_wcsncmp.ADDR;
	}

	public static int SDL_wcsncmp(MemorySegment str1, MemorySegment str2, long maxlen) {
		var mh$ = SDL_wcsncmp.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_wcsncmp", str1, str2, maxlen);
			}
			return (int) mh$.invokeExact(str1, str2, maxlen);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_wcscasecmp {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_wcscasecmp");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_wcscasecmp$descriptor() {
		return SDL_wcscasecmp.DESC;
	}

	public static MethodHandle SDL_wcscasecmp$handle() {
		return SDL_wcscasecmp.HANDLE;
	}

	public static MemorySegment SDL_wcscasecmp$address() {
		return SDL_wcscasecmp.ADDR;
	}

	public static int SDL_wcscasecmp(MemorySegment str1, MemorySegment str2) {
		var mh$ = SDL_wcscasecmp.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_wcscasecmp", str1, str2);
			}
			return (int) mh$.invokeExact(str1, str2);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_wcsncasecmp {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_wcsncasecmp");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_wcsncasecmp$descriptor() {
		return SDL_wcsncasecmp.DESC;
	}

	public static MethodHandle SDL_wcsncasecmp$handle() {
		return SDL_wcsncasecmp.HANDLE;
	}

	public static MemorySegment SDL_wcsncasecmp$address() {
		return SDL_wcsncasecmp.ADDR;
	}

	public static int SDL_wcsncasecmp(MemorySegment str1, MemorySegment str2, long maxlen) {
		var mh$ = SDL_wcsncasecmp.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_wcsncasecmp", str1, str2, maxlen);
			}
			return (int) mh$.invokeExact(str1, str2, maxlen);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_wcstol {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_wcstol");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_wcstol$descriptor() {
		return SDL_wcstol.DESC;
	}

	public static MethodHandle SDL_wcstol$handle() {
		return SDL_wcstol.HANDLE;
	}

	public static MemorySegment SDL_wcstol$address() {
		return SDL_wcstol.ADDR;
	}

	public static long SDL_wcstol(MemorySegment str, MemorySegment endp, int base) {
		var mh$ = SDL_wcstol.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_wcstol", str, endp, base);
			}
			return (long) mh$.invokeExact(str, endp, base);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_strlen {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_strlen");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_strlen$descriptor() {
		return SDL_strlen.DESC;
	}

	public static MethodHandle SDL_strlen$handle() {
		return SDL_strlen.HANDLE;
	}

	public static MemorySegment SDL_strlen$address() {
		return SDL_strlen.ADDR;
	}

	public static long SDL_strlen(MemorySegment str) {
		var mh$ = SDL_strlen.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_strlen", str);
			}
			return (long) mh$.invokeExact(str);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_strnlen {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_strnlen");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_strnlen$descriptor() {
		return SDL_strnlen.DESC;
	}

	public static MethodHandle SDL_strnlen$handle() {
		return SDL_strnlen.HANDLE;
	}

	public static MemorySegment SDL_strnlen$address() {
		return SDL_strnlen.ADDR;
	}

	public static long SDL_strnlen(MemorySegment str, long maxlen) {
		var mh$ = SDL_strnlen.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_strnlen", str, maxlen);
			}
			return (long) mh$.invokeExact(str, maxlen);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_strlcpy {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_strlcpy");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_strlcpy$descriptor() {
		return SDL_strlcpy.DESC;
	}

	public static MethodHandle SDL_strlcpy$handle() {
		return SDL_strlcpy.HANDLE;
	}

	public static MemorySegment SDL_strlcpy$address() {
		return SDL_strlcpy.ADDR;
	}

	public static long SDL_strlcpy(MemorySegment dst, MemorySegment src, long maxlen) {
		var mh$ = SDL_strlcpy.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_strlcpy", dst, src, maxlen);
			}
			return (long) mh$.invokeExact(dst, src, maxlen);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_utf8strlcpy {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_utf8strlcpy");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_utf8strlcpy$descriptor() {
		return SDL_utf8strlcpy.DESC;
	}

	public static MethodHandle SDL_utf8strlcpy$handle() {
		return SDL_utf8strlcpy.HANDLE;
	}

	public static MemorySegment SDL_utf8strlcpy$address() {
		return SDL_utf8strlcpy.ADDR;
	}

	public static long SDL_utf8strlcpy(MemorySegment dst, MemorySegment src, long dst_bytes) {
		var mh$ = SDL_utf8strlcpy.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_utf8strlcpy", dst, src, dst_bytes);
			}
			return (long) mh$.invokeExact(dst, src, dst_bytes);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_strlcat {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_strlcat");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_strlcat$descriptor() {
		return SDL_strlcat.DESC;
	}

	public static MethodHandle SDL_strlcat$handle() {
		return SDL_strlcat.HANDLE;
	}

	public static MemorySegment SDL_strlcat$address() {
		return SDL_strlcat.ADDR;
	}

	public static long SDL_strlcat(MemorySegment dst, MemorySegment src, long maxlen) {
		var mh$ = SDL_strlcat.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_strlcat", dst, src, maxlen);
			}
			return (long) mh$.invokeExact(dst, src, maxlen);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_strdup {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_strdup");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_strdup$descriptor() {
		return SDL_strdup.DESC;
	}

	public static MethodHandle SDL_strdup$handle() {
		return SDL_strdup.HANDLE;
	}

	public static MemorySegment SDL_strdup$address() {
		return SDL_strdup.ADDR;
	}

	public static MemorySegment SDL_strdup(MemorySegment str) {
		var mh$ = SDL_strdup.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_strdup", str);
			}
			return (MemorySegment) mh$.invokeExact(str);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_strndup {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_strndup");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_strndup$descriptor() {
		return SDL_strndup.DESC;
	}

	public static MethodHandle SDL_strndup$handle() {
		return SDL_strndup.HANDLE;
	}

	public static MemorySegment SDL_strndup$address() {
		return SDL_strndup.ADDR;
	}

	public static MemorySegment SDL_strndup(MemorySegment str, long maxlen) {
		var mh$ = SDL_strndup.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_strndup", str, maxlen);
			}
			return (MemorySegment) mh$.invokeExact(str, maxlen);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_strrev {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_strrev");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_strrev$descriptor() {
		return SDL_strrev.DESC;
	}

	public static MethodHandle SDL_strrev$handle() {
		return SDL_strrev.HANDLE;
	}

	public static MemorySegment SDL_strrev$address() {
		return SDL_strrev.ADDR;
	}

	public static MemorySegment SDL_strrev(MemorySegment str) {
		var mh$ = SDL_strrev.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_strrev", str);
			}
			return (MemorySegment) mh$.invokeExact(str);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_strupr {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_strupr");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_strupr$descriptor() {
		return SDL_strupr.DESC;
	}

	public static MethodHandle SDL_strupr$handle() {
		return SDL_strupr.HANDLE;
	}

	public static MemorySegment SDL_strupr$address() {
		return SDL_strupr.ADDR;
	}

	public static MemorySegment SDL_strupr(MemorySegment str) {
		var mh$ = SDL_strupr.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_strupr", str);
			}
			return (MemorySegment) mh$.invokeExact(str);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_strlwr {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_strlwr");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_strlwr$descriptor() {
		return SDL_strlwr.DESC;
	}

	public static MethodHandle SDL_strlwr$handle() {
		return SDL_strlwr.HANDLE;
	}

	public static MemorySegment SDL_strlwr$address() {
		return SDL_strlwr.ADDR;
	}

	public static MemorySegment SDL_strlwr(MemorySegment str) {
		var mh$ = SDL_strlwr.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_strlwr", str);
			}
			return (MemorySegment) mh$.invokeExact(str);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_strchr {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_strchr");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_strchr$descriptor() {
		return SDL_strchr.DESC;
	}

	public static MethodHandle SDL_strchr$handle() {
		return SDL_strchr.HANDLE;
	}

	public static MemorySegment SDL_strchr$address() {
		return SDL_strchr.ADDR;
	}

	public static MemorySegment SDL_strchr(MemorySegment str, int c) {
		var mh$ = SDL_strchr.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_strchr", str, c);
			}
			return (MemorySegment) mh$.invokeExact(str, c);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_strrchr {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_strrchr");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_strrchr$descriptor() {
		return SDL_strrchr.DESC;
	}

	public static MethodHandle SDL_strrchr$handle() {
		return SDL_strrchr.HANDLE;
	}

	public static MemorySegment SDL_strrchr$address() {
		return SDL_strrchr.ADDR;
	}

	public static MemorySegment SDL_strrchr(MemorySegment str, int c) {
		var mh$ = SDL_strrchr.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_strrchr", str, c);
			}
			return (MemorySegment) mh$.invokeExact(str, c);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_strstr {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_strstr");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_strstr$descriptor() {
		return SDL_strstr.DESC;
	}

	public static MethodHandle SDL_strstr$handle() {
		return SDL_strstr.HANDLE;
	}

	public static MemorySegment SDL_strstr$address() {
		return SDL_strstr.ADDR;
	}

	public static MemorySegment SDL_strstr(MemorySegment haystack, MemorySegment needle) {
		var mh$ = SDL_strstr.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_strstr", haystack, needle);
			}
			return (MemorySegment) mh$.invokeExact(haystack, needle);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_strnstr {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_strnstr");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_strnstr$descriptor() {
		return SDL_strnstr.DESC;
	}

	public static MethodHandle SDL_strnstr$handle() {
		return SDL_strnstr.HANDLE;
	}

	public static MemorySegment SDL_strnstr$address() {
		return SDL_strnstr.ADDR;
	}

	public static MemorySegment SDL_strnstr(MemorySegment haystack, MemorySegment needle, long maxlen) {
		var mh$ = SDL_strnstr.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_strnstr", haystack, needle, maxlen);
			}
			return (MemorySegment) mh$.invokeExact(haystack, needle, maxlen);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_strcasestr {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_strcasestr");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_strcasestr$descriptor() {
		return SDL_strcasestr.DESC;
	}

	public static MethodHandle SDL_strcasestr$handle() {
		return SDL_strcasestr.HANDLE;
	}

	public static MemorySegment SDL_strcasestr$address() {
		return SDL_strcasestr.ADDR;
	}

	public static MemorySegment SDL_strcasestr(MemorySegment haystack, MemorySegment needle) {
		var mh$ = SDL_strcasestr.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_strcasestr", haystack, needle);
			}
			return (MemorySegment) mh$.invokeExact(haystack, needle);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_strtok_r {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_strtok_r");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_strtok_r$descriptor() {
		return SDL_strtok_r.DESC;
	}

	public static MethodHandle SDL_strtok_r$handle() {
		return SDL_strtok_r.HANDLE;
	}

	public static MemorySegment SDL_strtok_r$address() {
		return SDL_strtok_r.ADDR;
	}

	public static MemorySegment SDL_strtok_r(MemorySegment str, MemorySegment delim, MemorySegment saveptr) {
		var mh$ = SDL_strtok_r.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_strtok_r", str, delim, saveptr);
			}
			return (MemorySegment) mh$.invokeExact(str, delim, saveptr);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_utf8strlen {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_utf8strlen");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_utf8strlen$descriptor() {
		return SDL_utf8strlen.DESC;
	}

	public static MethodHandle SDL_utf8strlen$handle() {
		return SDL_utf8strlen.HANDLE;
	}

	public static MemorySegment SDL_utf8strlen$address() {
		return SDL_utf8strlen.ADDR;
	}

	public static long SDL_utf8strlen(MemorySegment str) {
		var mh$ = SDL_utf8strlen.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_utf8strlen", str);
			}
			return (long) mh$.invokeExact(str);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_utf8strnlen {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_utf8strnlen");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_utf8strnlen$descriptor() {
		return SDL_utf8strnlen.DESC;
	}

	public static MethodHandle SDL_utf8strnlen$handle() {
		return SDL_utf8strnlen.HANDLE;
	}

	public static MemorySegment SDL_utf8strnlen$address() {
		return SDL_utf8strnlen.ADDR;
	}

	public static long SDL_utf8strnlen(MemorySegment str, long bytes) {
		var mh$ = SDL_utf8strnlen.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_utf8strnlen", str, bytes);
			}
			return (long) mh$.invokeExact(str, bytes);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_itoa {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_itoa");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_itoa$descriptor() {
		return SDL_itoa.DESC;
	}

	public static MethodHandle SDL_itoa$handle() {
		return SDL_itoa.HANDLE;
	}

	public static MemorySegment SDL_itoa$address() {
		return SDL_itoa.ADDR;
	}

	public static MemorySegment SDL_itoa(int value, MemorySegment str, int radix) {
		var mh$ = SDL_itoa.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_itoa", value, str, radix);
			}
			return (MemorySegment) mh$.invokeExact(value, str, radix);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_uitoa {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_uitoa");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_uitoa$descriptor() {
		return SDL_uitoa.DESC;
	}

	public static MethodHandle SDL_uitoa$handle() {
		return SDL_uitoa.HANDLE;
	}

	public static MemorySegment SDL_uitoa$address() {
		return SDL_uitoa.ADDR;
	}

	public static MemorySegment SDL_uitoa(int value, MemorySegment str, int radix) {
		var mh$ = SDL_uitoa.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_uitoa", value, str, radix);
			}
			return (MemorySegment) mh$.invokeExact(value, str, radix);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ltoa {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_LONG,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ltoa");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ltoa$descriptor() {
		return SDL_ltoa.DESC;
	}

	public static MethodHandle SDL_ltoa$handle() {
		return SDL_ltoa.HANDLE;
	}

	public static MemorySegment SDL_ltoa$address() {
		return SDL_ltoa.ADDR;
	}

	public static MemorySegment SDL_ltoa(long value, MemorySegment str, int radix) {
		var mh$ = SDL_ltoa.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ltoa", value, str, radix);
			}
			return (MemorySegment) mh$.invokeExact(value, str, radix);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ultoa {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_LONG,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ultoa");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ultoa$descriptor() {
		return SDL_ultoa.DESC;
	}

	public static MethodHandle SDL_ultoa$handle() {
		return SDL_ultoa.HANDLE;
	}

	public static MemorySegment SDL_ultoa$address() {
		return SDL_ultoa.ADDR;
	}

	public static MemorySegment SDL_ultoa(long value, MemorySegment str, int radix) {
		var mh$ = SDL_ultoa.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ultoa", value, str, radix);
			}
			return (MemorySegment) mh$.invokeExact(value, str, radix);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_lltoa {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_LONG_LONG,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_lltoa");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_lltoa$descriptor() {
		return SDL_lltoa.DESC;
	}

	public static MethodHandle SDL_lltoa$handle() {
		return SDL_lltoa.HANDLE;
	}

	public static MemorySegment SDL_lltoa$address() {
		return SDL_lltoa.ADDR;
	}

	public static MemorySegment SDL_lltoa(long value, MemorySegment str, int radix) {
		var mh$ = SDL_lltoa.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_lltoa", value, str, radix);
			}
			return (MemorySegment) mh$.invokeExact(value, str, radix);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ulltoa {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_LONG_LONG,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ulltoa");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ulltoa$descriptor() {
		return SDL_ulltoa.DESC;
	}

	public static MethodHandle SDL_ulltoa$handle() {
		return SDL_ulltoa.HANDLE;
	}

	public static MemorySegment SDL_ulltoa$address() {
		return SDL_ulltoa.ADDR;
	}

	public static MemorySegment SDL_ulltoa(long value, MemorySegment str, int radix) {
		var mh$ = SDL_ulltoa.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ulltoa", value, str, radix);
			}
			return (MemorySegment) mh$.invokeExact(value, str, radix);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_atoi {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_atoi");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_atoi$descriptor() {
		return SDL_atoi.DESC;
	}

	public static MethodHandle SDL_atoi$handle() {
		return SDL_atoi.HANDLE;
	}

	public static MemorySegment SDL_atoi$address() {
		return SDL_atoi.ADDR;
	}

	public static int SDL_atoi(MemorySegment str) {
		var mh$ = SDL_atoi.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_atoi", str);
			}
			return (int) mh$.invokeExact(str);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_atof {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_DOUBLE,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_atof");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_atof$descriptor() {
		return SDL_atof.DESC;
	}

	public static MethodHandle SDL_atof$handle() {
		return SDL_atof.HANDLE;
	}

	public static MemorySegment SDL_atof$address() {
		return SDL_atof.ADDR;
	}

	public static double SDL_atof(MemorySegment str) {
		var mh$ = SDL_atof.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_atof", str);
			}
			return (double) mh$.invokeExact(str);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_strtol {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_strtol");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_strtol$descriptor() {
		return SDL_strtol.DESC;
	}

	public static MethodHandle SDL_strtol$handle() {
		return SDL_strtol.HANDLE;
	}

	public static MemorySegment SDL_strtol$address() {
		return SDL_strtol.ADDR;
	}

	public static long SDL_strtol(MemorySegment str, MemorySegment endp, int base) {
		var mh$ = SDL_strtol.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_strtol", str, endp, base);
			}
			return (long) mh$.invokeExact(str, endp, base);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_strtoul {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_strtoul");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_strtoul$descriptor() {
		return SDL_strtoul.DESC;
	}

	public static MethodHandle SDL_strtoul$handle() {
		return SDL_strtoul.HANDLE;
	}

	public static MemorySegment SDL_strtoul$address() {
		return SDL_strtoul.ADDR;
	}

	public static long SDL_strtoul(MemorySegment str, MemorySegment endp, int base) {
		var mh$ = SDL_strtoul.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_strtoul", str, endp, base);
			}
			return (long) mh$.invokeExact(str, endp, base);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_strtoll {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG_LONG,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_strtoll");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_strtoll$descriptor() {
		return SDL_strtoll.DESC;
	}

	public static MethodHandle SDL_strtoll$handle() {
		return SDL_strtoll.HANDLE;
	}

	public static MemorySegment SDL_strtoll$address() {
		return SDL_strtoll.ADDR;
	}

	public static long SDL_strtoll(MemorySegment str, MemorySegment endp, int base) {
		var mh$ = SDL_strtoll.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_strtoll", str, endp, base);
			}
			return (long) mh$.invokeExact(str, endp, base);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_strtoull {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG_LONG,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_strtoull");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_strtoull$descriptor() {
		return SDL_strtoull.DESC;
	}

	public static MethodHandle SDL_strtoull$handle() {
		return SDL_strtoull.HANDLE;
	}

	public static MemorySegment SDL_strtoull$address() {
		return SDL_strtoull.ADDR;
	}

	public static long SDL_strtoull(MemorySegment str, MemorySegment endp, int base) {
		var mh$ = SDL_strtoull.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_strtoull", str, endp, base);
			}
			return (long) mh$.invokeExact(str, endp, base);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_strtod {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_DOUBLE,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_strtod");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_strtod$descriptor() {
		return SDL_strtod.DESC;
	}

	public static MethodHandle SDL_strtod$handle() {
		return SDL_strtod.HANDLE;
	}

	public static MemorySegment SDL_strtod$address() {
		return SDL_strtod.ADDR;
	}

	public static double SDL_strtod(MemorySegment str, MemorySegment endp) {
		var mh$ = SDL_strtod.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_strtod", str, endp);
			}
			return (double) mh$.invokeExact(str, endp);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_strcmp {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_strcmp");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_strcmp$descriptor() {
		return SDL_strcmp.DESC;
	}

	public static MethodHandle SDL_strcmp$handle() {
		return SDL_strcmp.HANDLE;
	}

	public static MemorySegment SDL_strcmp$address() {
		return SDL_strcmp.ADDR;
	}

	public static int SDL_strcmp(MemorySegment str1, MemorySegment str2) {
		var mh$ = SDL_strcmp.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_strcmp", str1, str2);
			}
			return (int) mh$.invokeExact(str1, str2);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_strncmp {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_strncmp");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_strncmp$descriptor() {
		return SDL_strncmp.DESC;
	}

	public static MethodHandle SDL_strncmp$handle() {
		return SDL_strncmp.HANDLE;
	}

	public static MemorySegment SDL_strncmp$address() {
		return SDL_strncmp.ADDR;
	}

	public static int SDL_strncmp(MemorySegment str1, MemorySegment str2, long maxlen) {
		var mh$ = SDL_strncmp.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_strncmp", str1, str2, maxlen);
			}
			return (int) mh$.invokeExact(str1, str2, maxlen);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_strcasecmp {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_strcasecmp");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_strcasecmp$descriptor() {
		return SDL_strcasecmp.DESC;
	}

	public static MethodHandle SDL_strcasecmp$handle() {
		return SDL_strcasecmp.HANDLE;
	}

	public static MemorySegment SDL_strcasecmp$address() {
		return SDL_strcasecmp.ADDR;
	}

	public static int SDL_strcasecmp(MemorySegment str1, MemorySegment str2) {
		var mh$ = SDL_strcasecmp.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_strcasecmp", str1, str2);
			}
			return (int) mh$.invokeExact(str1, str2);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_strncasecmp {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_strncasecmp");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_strncasecmp$descriptor() {
		return SDL_strncasecmp.DESC;
	}

	public static MethodHandle SDL_strncasecmp$handle() {
		return SDL_strncasecmp.HANDLE;
	}

	public static MemorySegment SDL_strncasecmp$address() {
		return SDL_strncasecmp.ADDR;
	}

	public static int SDL_strncasecmp(MemorySegment str1, MemorySegment str2, long maxlen) {
		var mh$ = SDL_strncasecmp.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_strncasecmp", str1, str2, maxlen);
			}
			return (int) mh$.invokeExact(str1, str2, maxlen);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_strpbrk {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_strpbrk");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_strpbrk$descriptor() {
		return SDL_strpbrk.DESC;
	}

	public static MethodHandle SDL_strpbrk$handle() {
		return SDL_strpbrk.HANDLE;
	}

	public static MemorySegment SDL_strpbrk$address() {
		return SDL_strpbrk.ADDR;
	}

	public static MemorySegment SDL_strpbrk(MemorySegment str, MemorySegment breakset) {
		var mh$ = SDL_strpbrk.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_strpbrk", str, breakset);
			}
			return (MemorySegment) mh$.invokeExact(str, breakset);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_StepUTF8 {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_StepUTF8");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_StepUTF8$descriptor() {
		return SDL_StepUTF8.DESC;
	}

	public static MethodHandle SDL_StepUTF8$handle() {
		return SDL_StepUTF8.HANDLE;
	}

	public static MemorySegment SDL_StepUTF8$address() {
		return SDL_StepUTF8.ADDR;
	}

	public static int SDL_StepUTF8(MemorySegment pstr, MemorySegment pslen) {
		var mh$ = SDL_StepUTF8.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_StepUTF8", pstr, pslen);
			}
			return (int) mh$.invokeExact(pstr, pslen);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_StepBackUTF8 {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_StepBackUTF8");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_StepBackUTF8$descriptor() {
		return SDL_StepBackUTF8.DESC;
	}

	public static MethodHandle SDL_StepBackUTF8$handle() {
		return SDL_StepBackUTF8.HANDLE;
	}

	public static MemorySegment SDL_StepBackUTF8$address() {
		return SDL_StepBackUTF8.ADDR;
	}

	public static int SDL_StepBackUTF8(MemorySegment start, MemorySegment pstr) {
		var mh$ = SDL_StepBackUTF8.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_StepBackUTF8", start, pstr);
			}
			return (int) mh$.invokeExact(start, pstr);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_UCS4ToUTF8 {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_UCS4ToUTF8");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_UCS4ToUTF8$descriptor() {
		return SDL_UCS4ToUTF8.DESC;
	}

	public static MethodHandle SDL_UCS4ToUTF8$handle() {
		return SDL_UCS4ToUTF8.HANDLE;
	}

	public static MemorySegment SDL_UCS4ToUTF8$address() {
		return SDL_UCS4ToUTF8.ADDR;
	}

	public static MemorySegment SDL_UCS4ToUTF8(int codepoint, MemorySegment dst) {
		var mh$ = SDL_UCS4ToUTF8.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_UCS4ToUTF8", codepoint, dst);
			}
			return (MemorySegment) mh$.invokeExact(codepoint, dst);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}


	private static class SDL_vsscanf {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_vsscanf");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_vsscanf$descriptor() {
		return SDL_vsscanf.DESC;
	}

	public static MethodHandle SDL_vsscanf$handle() {
		return SDL_vsscanf.HANDLE;
	}

	public static MemorySegment SDL_vsscanf$address() {
		return SDL_vsscanf.ADDR;
	}

	public static int SDL_vsscanf(MemorySegment text, MemorySegment fmt, MemorySegment ap) {
		var mh$ = SDL_vsscanf.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_vsscanf", text, fmt, ap);
			}
			return (int) mh$.invokeExact(text, fmt, ap);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}


	private static class SDL_vsnprintf {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_LONG,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_vsnprintf");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_vsnprintf$descriptor() {
		return SDL_vsnprintf.DESC;
	}

	public static MethodHandle SDL_vsnprintf$handle() {
		return SDL_vsnprintf.HANDLE;
	}

	public static MemorySegment SDL_vsnprintf$address() {
		return SDL_vsnprintf.ADDR;
	}

	public static int SDL_vsnprintf(MemorySegment text, long maxlen, MemorySegment fmt, MemorySegment ap) {
		var mh$ = SDL_vsnprintf.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_vsnprintf", text, maxlen, fmt, ap);
			}
			return (int) mh$.invokeExact(text, maxlen, fmt, ap);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_vswprintf {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_LONG,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_vswprintf");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_vswprintf$descriptor() {
		return SDL_vswprintf.DESC;
	}

	public static MethodHandle SDL_vswprintf$handle() {
		return SDL_vswprintf.HANDLE;
	}

	public static MemorySegment SDL_vswprintf$address() {
		return SDL_vswprintf.ADDR;
	}

	public static int SDL_vswprintf(MemorySegment text, long maxlen, MemorySegment fmt, MemorySegment ap) {
		var mh$ = SDL_vswprintf.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_vswprintf", text, maxlen, fmt, ap);
			}
			return (int) mh$.invokeExact(text, maxlen, fmt, ap);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}


	private static class SDL_vasprintf {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_vasprintf");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_vasprintf$descriptor() {
		return SDL_vasprintf.DESC;
	}

	public static MethodHandle SDL_vasprintf$handle() {
		return SDL_vasprintf.HANDLE;
	}

	public static MemorySegment SDL_vasprintf$address() {
		return SDL_vasprintf.ADDR;
	}

	public static int SDL_vasprintf(MemorySegment strp, MemorySegment fmt, MemorySegment ap) {
		var mh$ = SDL_vasprintf.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_vasprintf", strp, fmt, ap);
			}
			return (int) mh$.invokeExact(strp, fmt, ap);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_srand {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_srand");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_srand$descriptor() {
		return SDL_srand.DESC;
	}

	public static MethodHandle SDL_srand$handle() {
		return SDL_srand.HANDLE;
	}

	public static MemorySegment SDL_srand$address() {
		return SDL_srand.ADDR;
	}

	public static void SDL_srand(long seed) {
		var mh$ = SDL_srand.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_srand", seed);
			}
			mh$.invokeExact(seed);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_rand {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_rand");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_rand$descriptor() {
		return SDL_rand.DESC;
	}

	public static MethodHandle SDL_rand$handle() {
		return SDL_rand.HANDLE;
	}

	public static MemorySegment SDL_rand$address() {
		return SDL_rand.ADDR;
	}

	public static int SDL_rand(int n) {
		var mh$ = SDL_rand.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_rand", n);
			}
			return (int) mh$.invokeExact(n);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_randf {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_FLOAT);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_randf");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_randf$descriptor() {
		return SDL_randf.DESC;
	}

	public static MethodHandle SDL_randf$handle() {
		return SDL_randf.HANDLE;
	}

	public static MemorySegment SDL_randf$address() {
		return SDL_randf.ADDR;
	}

	public static float SDL_randf() {
		var mh$ = SDL_randf.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_randf");
			}
			return (float) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_rand_bits {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_rand_bits");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_rand_bits$descriptor() {
		return SDL_rand_bits.DESC;
	}

	public static MethodHandle SDL_rand_bits$handle() {
		return SDL_rand_bits.HANDLE;
	}

	public static MemorySegment SDL_rand_bits$address() {
		return SDL_rand_bits.ADDR;
	}

	public static int SDL_rand_bits() {
		var mh$ = SDL_rand_bits.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_rand_bits");
			}
			return (int) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_rand_r {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_rand_r");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_rand_r$descriptor() {
		return SDL_rand_r.DESC;
	}

	public static MethodHandle SDL_rand_r$handle() {
		return SDL_rand_r.HANDLE;
	}

	public static MemorySegment SDL_rand_r$address() {
		return SDL_rand_r.ADDR;
	}

	public static int SDL_rand_r(MemorySegment state, int n) {
		var mh$ = SDL_rand_r.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_rand_r", state, n);
			}
			return (int) mh$.invokeExact(state, n);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_randf_r {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_FLOAT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_randf_r");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_randf_r$descriptor() {
		return SDL_randf_r.DESC;
	}

	public static MethodHandle SDL_randf_r$handle() {
		return SDL_randf_r.HANDLE;
	}

	public static MemorySegment SDL_randf_r$address() {
		return SDL_randf_r.ADDR;
	}

	public static float SDL_randf_r(MemorySegment state) {
		var mh$ = SDL_randf_r.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_randf_r", state);
			}
			return (float) mh$.invokeExact(state);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_rand_bits_r {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_rand_bits_r");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_rand_bits_r$descriptor() {
		return SDL_rand_bits_r.DESC;
	}

	public static MethodHandle SDL_rand_bits_r$handle() {
		return SDL_rand_bits_r.HANDLE;
	}

	public static MemorySegment SDL_rand_bits_r$address() {
		return SDL_rand_bits_r.ADDR;
	}

	public static int SDL_rand_bits_r(MemorySegment state) {
		var mh$ = SDL_rand_bits_r.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_rand_bits_r", state);
			}
			return (int) mh$.invokeExact(state);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_acos {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_DOUBLE,
				SDL3.C_DOUBLE
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_acos");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_acos$descriptor() {
		return SDL_acos.DESC;
	}

	public static MethodHandle SDL_acos$handle() {
		return SDL_acos.HANDLE;
	}

	public static MemorySegment SDL_acos$address() {
		return SDL_acos.ADDR;
	}

	public static double SDL_acos(double x) {
		var mh$ = SDL_acos.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_acos", x);
			}
			return (double) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_acosf {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_FLOAT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_acosf");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_acosf$descriptor() {
		return SDL_acosf.DESC;
	}

	public static MethodHandle SDL_acosf$handle() {
		return SDL_acosf.HANDLE;
	}

	public static MemorySegment SDL_acosf$address() {
		return SDL_acosf.ADDR;
	}

	public static float SDL_acosf(float x) {
		var mh$ = SDL_acosf.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_acosf", x);
			}
			return (float) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_asin {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_DOUBLE,
				SDL3.C_DOUBLE
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_asin");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_asin$descriptor() {
		return SDL_asin.DESC;
	}

	public static MethodHandle SDL_asin$handle() {
		return SDL_asin.HANDLE;
	}

	public static MemorySegment SDL_asin$address() {
		return SDL_asin.ADDR;
	}

	public static double SDL_asin(double x) {
		var mh$ = SDL_asin.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_asin", x);
			}
			return (double) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_asinf {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_FLOAT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_asinf");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_asinf$descriptor() {
		return SDL_asinf.DESC;
	}

	public static MethodHandle SDL_asinf$handle() {
		return SDL_asinf.HANDLE;
	}

	public static MemorySegment SDL_asinf$address() {
		return SDL_asinf.ADDR;
	}

	public static float SDL_asinf(float x) {
		var mh$ = SDL_asinf.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_asinf", x);
			}
			return (float) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_atan {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_DOUBLE,
				SDL3.C_DOUBLE
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_atan");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_atan$descriptor() {
		return SDL_atan.DESC;
	}

	public static MethodHandle SDL_atan$handle() {
		return SDL_atan.HANDLE;
	}

	public static MemorySegment SDL_atan$address() {
		return SDL_atan.ADDR;
	}

	public static double SDL_atan(double x) {
		var mh$ = SDL_atan.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_atan", x);
			}
			return (double) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_atanf {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_FLOAT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_atanf");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_atanf$descriptor() {
		return SDL_atanf.DESC;
	}

	public static MethodHandle SDL_atanf$handle() {
		return SDL_atanf.HANDLE;
	}

	public static MemorySegment SDL_atanf$address() {
		return SDL_atanf.ADDR;
	}

	public static float SDL_atanf(float x) {
		var mh$ = SDL_atanf.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_atanf", x);
			}
			return (float) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_atan2 {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_DOUBLE,
				SDL3.C_DOUBLE,
				SDL3.C_DOUBLE
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_atan2");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_atan2$descriptor() {
		return SDL_atan2.DESC;
	}

	public static MethodHandle SDL_atan2$handle() {
		return SDL_atan2.HANDLE;
	}

	public static MemorySegment SDL_atan2$address() {
		return SDL_atan2.ADDR;
	}

	public static double SDL_atan2(double y, double x) {
		var mh$ = SDL_atan2.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_atan2", y, x);
			}
			return (double) mh$.invokeExact(y, x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_atan2f {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_FLOAT,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_atan2f");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_atan2f$descriptor() {
		return SDL_atan2f.DESC;
	}

	public static MethodHandle SDL_atan2f$handle() {
		return SDL_atan2f.HANDLE;
	}

	public static MemorySegment SDL_atan2f$address() {
		return SDL_atan2f.ADDR;
	}

	public static float SDL_atan2f(float y, float x) {
		var mh$ = SDL_atan2f.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_atan2f", y, x);
			}
			return (float) mh$.invokeExact(y, x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ceil {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_DOUBLE,
				SDL3.C_DOUBLE
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ceil");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ceil$descriptor() {
		return SDL_ceil.DESC;
	}

	public static MethodHandle SDL_ceil$handle() {
		return SDL_ceil.HANDLE;
	}

	public static MemorySegment SDL_ceil$address() {
		return SDL_ceil.ADDR;
	}

	public static double SDL_ceil(double x) {
		var mh$ = SDL_ceil.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ceil", x);
			}
			return (double) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ceilf {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_FLOAT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ceilf");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ceilf$descriptor() {
		return SDL_ceilf.DESC;
	}

	public static MethodHandle SDL_ceilf$handle() {
		return SDL_ceilf.HANDLE;
	}

	public static MemorySegment SDL_ceilf$address() {
		return SDL_ceilf.ADDR;
	}

	public static float SDL_ceilf(float x) {
		var mh$ = SDL_ceilf.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ceilf", x);
			}
			return (float) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_copysign {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_DOUBLE,
				SDL3.C_DOUBLE,
				SDL3.C_DOUBLE
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_copysign");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_copysign$descriptor() {
		return SDL_copysign.DESC;
	}

	public static MethodHandle SDL_copysign$handle() {
		return SDL_copysign.HANDLE;
	}

	public static MemorySegment SDL_copysign$address() {
		return SDL_copysign.ADDR;
	}

	public static double SDL_copysign(double x, double y) {
		var mh$ = SDL_copysign.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_copysign", x, y);
			}
			return (double) mh$.invokeExact(x, y);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_copysignf {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_FLOAT,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_copysignf");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_copysignf$descriptor() {
		return SDL_copysignf.DESC;
	}

	public static MethodHandle SDL_copysignf$handle() {
		return SDL_copysignf.HANDLE;
	}

	public static MemorySegment SDL_copysignf$address() {
		return SDL_copysignf.ADDR;
	}

	public static float SDL_copysignf(float x, float y) {
		var mh$ = SDL_copysignf.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_copysignf", x, y);
			}
			return (float) mh$.invokeExact(x, y);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_cos {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_DOUBLE,
				SDL3.C_DOUBLE
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_cos");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_cos$descriptor() {
		return SDL_cos.DESC;
	}

	public static MethodHandle SDL_cos$handle() {
		return SDL_cos.HANDLE;
	}

	public static MemorySegment SDL_cos$address() {
		return SDL_cos.ADDR;
	}

	public static double SDL_cos(double x) {
		var mh$ = SDL_cos.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_cos", x);
			}
			return (double) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_cosf {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_FLOAT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_cosf");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_cosf$descriptor() {
		return SDL_cosf.DESC;
	}

	public static MethodHandle SDL_cosf$handle() {
		return SDL_cosf.HANDLE;
	}

	public static MemorySegment SDL_cosf$address() {
		return SDL_cosf.ADDR;
	}

	public static float SDL_cosf(float x) {
		var mh$ = SDL_cosf.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_cosf", x);
			}
			return (float) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_exp {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_DOUBLE,
				SDL3.C_DOUBLE
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_exp");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_exp$descriptor() {
		return SDL_exp.DESC;
	}

	public static MethodHandle SDL_exp$handle() {
		return SDL_exp.HANDLE;
	}

	public static MemorySegment SDL_exp$address() {
		return SDL_exp.ADDR;
	}

	public static double SDL_exp(double x) {
		var mh$ = SDL_exp.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_exp", x);
			}
			return (double) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_expf {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_FLOAT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_expf");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_expf$descriptor() {
		return SDL_expf.DESC;
	}

	public static MethodHandle SDL_expf$handle() {
		return SDL_expf.HANDLE;
	}

	public static MemorySegment SDL_expf$address() {
		return SDL_expf.ADDR;
	}

	public static float SDL_expf(float x) {
		var mh$ = SDL_expf.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_expf", x);
			}
			return (float) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_fabs {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_DOUBLE,
				SDL3.C_DOUBLE
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_fabs");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_fabs$descriptor() {
		return SDL_fabs.DESC;
	}

	public static MethodHandle SDL_fabs$handle() {
		return SDL_fabs.HANDLE;
	}

	public static MemorySegment SDL_fabs$address() {
		return SDL_fabs.ADDR;
	}

	public static double SDL_fabs(double x) {
		var mh$ = SDL_fabs.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_fabs", x);
			}
			return (double) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_fabsf {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_FLOAT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_fabsf");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_fabsf$descriptor() {
		return SDL_fabsf.DESC;
	}

	public static MethodHandle SDL_fabsf$handle() {
		return SDL_fabsf.HANDLE;
	}

	public static MemorySegment SDL_fabsf$address() {
		return SDL_fabsf.ADDR;
	}

	public static float SDL_fabsf(float x) {
		var mh$ = SDL_fabsf.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_fabsf", x);
			}
			return (float) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_floor {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_DOUBLE,
				SDL3.C_DOUBLE
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_floor");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_floor$descriptor() {
		return SDL_floor.DESC;
	}

	public static MethodHandle SDL_floor$handle() {
		return SDL_floor.HANDLE;
	}

	public static MemorySegment SDL_floor$address() {
		return SDL_floor.ADDR;
	}

	public static double SDL_floor(double x) {
		var mh$ = SDL_floor.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_floor", x);
			}
			return (double) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_floorf {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_FLOAT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_floorf");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_floorf$descriptor() {
		return SDL_floorf.DESC;
	}

	public static MethodHandle SDL_floorf$handle() {
		return SDL_floorf.HANDLE;
	}

	public static MemorySegment SDL_floorf$address() {
		return SDL_floorf.ADDR;
	}

	public static float SDL_floorf(float x) {
		var mh$ = SDL_floorf.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_floorf", x);
			}
			return (float) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_trunc {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_DOUBLE,
				SDL3.C_DOUBLE
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_trunc");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_trunc$descriptor() {
		return SDL_trunc.DESC;
	}

	public static MethodHandle SDL_trunc$handle() {
		return SDL_trunc.HANDLE;
	}

	public static MemorySegment SDL_trunc$address() {
		return SDL_trunc.ADDR;
	}

	public static double SDL_trunc(double x) {
		var mh$ = SDL_trunc.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_trunc", x);
			}
			return (double) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_truncf {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_FLOAT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_truncf");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_truncf$descriptor() {
		return SDL_truncf.DESC;
	}

	public static MethodHandle SDL_truncf$handle() {
		return SDL_truncf.HANDLE;
	}

	public static MemorySegment SDL_truncf$address() {
		return SDL_truncf.ADDR;
	}

	public static float SDL_truncf(float x) {
		var mh$ = SDL_truncf.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_truncf", x);
			}
			return (float) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_fmod {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_DOUBLE,
				SDL3.C_DOUBLE,
				SDL3.C_DOUBLE
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_fmod");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_fmod$descriptor() {
		return SDL_fmod.DESC;
	}

	public static MethodHandle SDL_fmod$handle() {
		return SDL_fmod.HANDLE;
	}

	public static MemorySegment SDL_fmod$address() {
		return SDL_fmod.ADDR;
	}

	public static double SDL_fmod(double x, double y) {
		var mh$ = SDL_fmod.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_fmod", x, y);
			}
			return (double) mh$.invokeExact(x, y);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_fmodf {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_FLOAT,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_fmodf");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_fmodf$descriptor() {
		return SDL_fmodf.DESC;
	}

	public static MethodHandle SDL_fmodf$handle() {
		return SDL_fmodf.HANDLE;
	}

	public static MemorySegment SDL_fmodf$address() {
		return SDL_fmodf.ADDR;
	}

	public static float SDL_fmodf(float x, float y) {
		var mh$ = SDL_fmodf.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_fmodf", x, y);
			}
			return (float) mh$.invokeExact(x, y);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_isinf {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_DOUBLE
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_isinf");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_isinf$descriptor() {
		return SDL_isinf.DESC;
	}

	public static MethodHandle SDL_isinf$handle() {
		return SDL_isinf.HANDLE;
	}

	public static MemorySegment SDL_isinf$address() {
		return SDL_isinf.ADDR;
	}

	public static int SDL_isinf(double x) {
		var mh$ = SDL_isinf.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_isinf", x);
			}
			return (int) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_isinff {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_isinff");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_isinff$descriptor() {
		return SDL_isinff.DESC;
	}

	public static MethodHandle SDL_isinff$handle() {
		return SDL_isinff.HANDLE;
	}

	public static MemorySegment SDL_isinff$address() {
		return SDL_isinff.ADDR;
	}

	public static int SDL_isinff(float x) {
		var mh$ = SDL_isinff.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_isinff", x);
			}
			return (int) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_isnan {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_DOUBLE
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_isnan");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_isnan$descriptor() {
		return SDL_isnan.DESC;
	}

	public static MethodHandle SDL_isnan$handle() {
		return SDL_isnan.HANDLE;
	}

	public static MemorySegment SDL_isnan$address() {
		return SDL_isnan.ADDR;
	}

	public static int SDL_isnan(double x) {
		var mh$ = SDL_isnan.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_isnan", x);
			}
			return (int) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_isnanf {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_isnanf");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_isnanf$descriptor() {
		return SDL_isnanf.DESC;
	}

	public static MethodHandle SDL_isnanf$handle() {
		return SDL_isnanf.HANDLE;
	}

	public static MemorySegment SDL_isnanf$address() {
		return SDL_isnanf.ADDR;
	}

	public static int SDL_isnanf(float x) {
		var mh$ = SDL_isnanf.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_isnanf", x);
			}
			return (int) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_log {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_DOUBLE,
				SDL3.C_DOUBLE
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_log");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_log$descriptor() {
		return SDL_log.DESC;
	}

	public static MethodHandle SDL_log$handle() {
		return SDL_log.HANDLE;
	}

	public static MemorySegment SDL_log$address() {
		return SDL_log.ADDR;
	}

	public static double SDL_log(double x) {
		var mh$ = SDL_log.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_log", x);
			}
			return (double) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_logf {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_FLOAT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_logf");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_logf$descriptor() {
		return SDL_logf.DESC;
	}

	public static MethodHandle SDL_logf$handle() {
		return SDL_logf.HANDLE;
	}

	public static MemorySegment SDL_logf$address() {
		return SDL_logf.ADDR;
	}

	public static float SDL_logf(float x) {
		var mh$ = SDL_logf.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_logf", x);
			}
			return (float) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_log10 {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_DOUBLE,
				SDL3.C_DOUBLE
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_log10");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_log10$descriptor() {
		return SDL_log10.DESC;
	}

	public static MethodHandle SDL_log10$handle() {
		return SDL_log10.HANDLE;
	}

	public static MemorySegment SDL_log10$address() {
		return SDL_log10.ADDR;
	}

	public static double SDL_log10(double x) {
		var mh$ = SDL_log10.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_log10", x);
			}
			return (double) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_log10f {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_FLOAT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_log10f");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_log10f$descriptor() {
		return SDL_log10f.DESC;
	}

	public static MethodHandle SDL_log10f$handle() {
		return SDL_log10f.HANDLE;
	}

	public static MemorySegment SDL_log10f$address() {
		return SDL_log10f.ADDR;
	}

	public static float SDL_log10f(float x) {
		var mh$ = SDL_log10f.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_log10f", x);
			}
			return (float) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_modf {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_DOUBLE,
				SDL3.C_DOUBLE,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_modf");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_modf$descriptor() {
		return SDL_modf.DESC;
	}

	public static MethodHandle SDL_modf$handle() {
		return SDL_modf.HANDLE;
	}

	public static MemorySegment SDL_modf$address() {
		return SDL_modf.ADDR;
	}

	public static double SDL_modf(double x, MemorySegment y) {
		var mh$ = SDL_modf.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_modf", x, y);
			}
			return (double) mh$.invokeExact(x, y);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_modff {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_FLOAT,
				SDL3.C_FLOAT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_modff");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_modff$descriptor() {
		return SDL_modff.DESC;
	}

	public static MethodHandle SDL_modff$handle() {
		return SDL_modff.HANDLE;
	}

	public static MemorySegment SDL_modff$address() {
		return SDL_modff.ADDR;
	}

	public static float SDL_modff(float x, MemorySegment y) {
		var mh$ = SDL_modff.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_modff", x, y);
			}
			return (float) mh$.invokeExact(x, y);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_pow {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_DOUBLE,
				SDL3.C_DOUBLE,
				SDL3.C_DOUBLE
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_pow");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_pow$descriptor() {
		return SDL_pow.DESC;
	}

	public static MethodHandle SDL_pow$handle() {
		return SDL_pow.HANDLE;
	}

	public static MemorySegment SDL_pow$address() {
		return SDL_pow.ADDR;
	}

	public static double SDL_pow(double x, double y) {
		var mh$ = SDL_pow.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_pow", x, y);
			}
			return (double) mh$.invokeExact(x, y);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_powf {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_FLOAT,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_powf");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_powf$descriptor() {
		return SDL_powf.DESC;
	}

	public static MethodHandle SDL_powf$handle() {
		return SDL_powf.HANDLE;
	}

	public static MemorySegment SDL_powf$address() {
		return SDL_powf.ADDR;
	}

	public static float SDL_powf(float x, float y) {
		var mh$ = SDL_powf.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_powf", x, y);
			}
			return (float) mh$.invokeExact(x, y);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_round {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_DOUBLE,
				SDL3.C_DOUBLE
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_round");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_round$descriptor() {
		return SDL_round.DESC;
	}

	public static MethodHandle SDL_round$handle() {
		return SDL_round.HANDLE;
	}

	public static MemorySegment SDL_round$address() {
		return SDL_round.ADDR;
	}

	public static double SDL_round(double x) {
		var mh$ = SDL_round.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_round", x);
			}
			return (double) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_roundf {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_FLOAT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_roundf");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_roundf$descriptor() {
		return SDL_roundf.DESC;
	}

	public static MethodHandle SDL_roundf$handle() {
		return SDL_roundf.HANDLE;
	}

	public static MemorySegment SDL_roundf$address() {
		return SDL_roundf.ADDR;
	}

	public static float SDL_roundf(float x) {
		var mh$ = SDL_roundf.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_roundf", x);
			}
			return (float) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_lround {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_DOUBLE
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_lround");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_lround$descriptor() {
		return SDL_lround.DESC;
	}

	public static MethodHandle SDL_lround$handle() {
		return SDL_lround.HANDLE;
	}

	public static MemorySegment SDL_lround$address() {
		return SDL_lround.ADDR;
	}

	public static long SDL_lround(double x) {
		var mh$ = SDL_lround.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_lround", x);
			}
			return (long) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_lroundf {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_lroundf");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_lroundf$descriptor() {
		return SDL_lroundf.DESC;
	}

	public static MethodHandle SDL_lroundf$handle() {
		return SDL_lroundf.HANDLE;
	}

	public static MemorySegment SDL_lroundf$address() {
		return SDL_lroundf.ADDR;
	}

	public static long SDL_lroundf(float x) {
		var mh$ = SDL_lroundf.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_lroundf", x);
			}
			return (long) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_scalbn {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_DOUBLE,
				SDL3.C_DOUBLE,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_scalbn");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_scalbn$descriptor() {
		return SDL_scalbn.DESC;
	}

	public static MethodHandle SDL_scalbn$handle() {
		return SDL_scalbn.HANDLE;
	}

	public static MemorySegment SDL_scalbn$address() {
		return SDL_scalbn.ADDR;
	}

	public static double SDL_scalbn(double x, int n) {
		var mh$ = SDL_scalbn.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_scalbn", x, n);
			}
			return (double) mh$.invokeExact(x, n);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_scalbnf {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_FLOAT,
				SDL3.C_FLOAT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_scalbnf");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_scalbnf$descriptor() {
		return SDL_scalbnf.DESC;
	}

	public static MethodHandle SDL_scalbnf$handle() {
		return SDL_scalbnf.HANDLE;
	}

	public static MemorySegment SDL_scalbnf$address() {
		return SDL_scalbnf.ADDR;
	}

	public static float SDL_scalbnf(float x, int n) {
		var mh$ = SDL_scalbnf.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_scalbnf", x, n);
			}
			return (float) mh$.invokeExact(x, n);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_sin {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_DOUBLE,
				SDL3.C_DOUBLE
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_sin");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_sin$descriptor() {
		return SDL_sin.DESC;
	}

	public static MethodHandle SDL_sin$handle() {
		return SDL_sin.HANDLE;
	}

	public static MemorySegment SDL_sin$address() {
		return SDL_sin.ADDR;
	}

	public static double SDL_sin(double x) {
		var mh$ = SDL_sin.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_sin", x);
			}
			return (double) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_sinf {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_FLOAT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_sinf");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_sinf$descriptor() {
		return SDL_sinf.DESC;
	}

	public static MethodHandle SDL_sinf$handle() {
		return SDL_sinf.HANDLE;
	}

	public static MemorySegment SDL_sinf$address() {
		return SDL_sinf.ADDR;
	}

	public static float SDL_sinf(float x) {
		var mh$ = SDL_sinf.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_sinf", x);
			}
			return (float) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_sqrt {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_DOUBLE,
				SDL3.C_DOUBLE
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_sqrt");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_sqrt$descriptor() {
		return SDL_sqrt.DESC;
	}

	public static MethodHandle SDL_sqrt$handle() {
		return SDL_sqrt.HANDLE;
	}

	public static MemorySegment SDL_sqrt$address() {
		return SDL_sqrt.ADDR;
	}

	public static double SDL_sqrt(double x) {
		var mh$ = SDL_sqrt.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_sqrt", x);
			}
			return (double) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_sqrtf {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_FLOAT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_sqrtf");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_sqrtf$descriptor() {
		return SDL_sqrtf.DESC;
	}

	public static MethodHandle SDL_sqrtf$handle() {
		return SDL_sqrtf.HANDLE;
	}

	public static MemorySegment SDL_sqrtf$address() {
		return SDL_sqrtf.ADDR;
	}

	public static float SDL_sqrtf(float x) {
		var mh$ = SDL_sqrtf.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_sqrtf", x);
			}
			return (float) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_tan {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_DOUBLE,
				SDL3.C_DOUBLE
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_tan");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_tan$descriptor() {
		return SDL_tan.DESC;
	}

	public static MethodHandle SDL_tan$handle() {
		return SDL_tan.HANDLE;
	}

	public static MemorySegment SDL_tan$address() {
		return SDL_tan.ADDR;
	}

	public static double SDL_tan(double x) {
		var mh$ = SDL_tan.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_tan", x);
			}
			return (double) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_tanf {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_FLOAT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_tanf");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_tanf$descriptor() {
		return SDL_tanf.DESC;
	}

	public static MethodHandle SDL_tanf$handle() {
		return SDL_tanf.HANDLE;
	}

	public static MemorySegment SDL_tanf$address() {
		return SDL_tanf.ADDR;
	}

	public static float SDL_tanf(float x) {
		var mh$ = SDL_tanf.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_tanf", x);
			}
			return (float) mh$.invokeExact(x);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	public static AddressLayout SDL_iconv_t = SDL3.C_POINTER;

	private static class SDL_iconv_open {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_iconv_open");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_iconv_open$descriptor() {
		return SDL_iconv_open.DESC;
	}

	public static MethodHandle SDL_iconv_open$handle() {
		return SDL_iconv_open.HANDLE;
	}

	public static MemorySegment SDL_iconv_open$address() {
		return SDL_iconv_open.ADDR;
	}

	public static MemorySegment SDL_iconv_open(MemorySegment tocode, MemorySegment fromcode) {
		var mh$ = SDL_iconv_open.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_iconv_open", tocode, fromcode);
			}
			return (MemorySegment) mh$.invokeExact(tocode, fromcode);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_iconv_close {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_iconv_close");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_iconv_close$descriptor() {
		return SDL_iconv_close.DESC;
	}

	public static MethodHandle SDL_iconv_close$handle() {
		return SDL_iconv_close.HANDLE;
	}

	public static MemorySegment SDL_iconv_close$address() {
		return SDL_iconv_close.ADDR;
	}

	public static int SDL_iconv_close(MemorySegment cd) {
		var mh$ = SDL_iconv_close.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_iconv_close", cd);
			}
			return (int) mh$.invokeExact(cd);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_iconv {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_iconv");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_iconv$descriptor() {
		return SDL_iconv.DESC;
	}

	public static MethodHandle SDL_iconv$handle() {
		return SDL_iconv.HANDLE;
	}

	public static MemorySegment SDL_iconv$address() {
		return SDL_iconv.ADDR;
	}

	public static long SDL_iconv(MemorySegment cd, MemorySegment inbuf, MemorySegment inbytesleft, MemorySegment outbuf, MemorySegment outbytesleft) {
		var mh$ = SDL_iconv.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_iconv", cd, inbuf, inbytesleft, outbuf, outbytesleft);
			}
			return (long) mh$.invokeExact(cd, inbuf, inbytesleft, outbuf, outbytesleft);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_iconv_string {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_iconv_string");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_iconv_string$descriptor() {
		return SDL_iconv_string.DESC;
	}

	public static MethodHandle SDL_iconv_string$handle() {
		return SDL_iconv_string.HANDLE;
	}

	public static MemorySegment SDL_iconv_string$address() {
		return SDL_iconv_string.ADDR;
	}

	public static MemorySegment SDL_iconv_string(MemorySegment tocode, MemorySegment fromcode, MemorySegment inbuf, long inbytesleft) {
		var mh$ = SDL_iconv_string.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_iconv_string", tocode, fromcode, inbuf, inbytesleft);
			}
			return (MemorySegment) mh$.invokeExact(tocode, fromcode, inbuf, inbytesleft);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static final int SDL_ASSERTION_RETRY = (int) 0L;

	public static int SDL_ASSERTION_RETRY() {
		return SDL_ASSERTION_RETRY;
	}

	private static final int SDL_ASSERTION_BREAK = (int) 1L;

	public static int SDL_ASSERTION_BREAK() {
		return SDL_ASSERTION_BREAK;
	}

	private static final int SDL_ASSERTION_ABORT = (int) 2L;

	public static int SDL_ASSERTION_ABORT() {
		return SDL_ASSERTION_ABORT;
	}

	private static final int SDL_ASSERTION_IGNORE = (int) 3L;

	public static int SDL_ASSERTION_IGNORE() {
		return SDL_ASSERTION_IGNORE;
	}

	private static final int SDL_ASSERTION_ALWAYS_IGNORE = (int) 4L;

	public static int SDL_ASSERTION_ALWAYS_IGNORE() {
		return SDL_ASSERTION_ALWAYS_IGNORE;
	}

	private static class SDL_ReportAssertion {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ReportAssertion");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ReportAssertion$descriptor() {
		return SDL_ReportAssertion.DESC;
	}

	public static MethodHandle SDL_ReportAssertion$handle() {
		return SDL_ReportAssertion.HANDLE;
	}

	public static MemorySegment SDL_ReportAssertion$address() {
		return SDL_ReportAssertion.ADDR;
	}

	public static int SDL_ReportAssertion(MemorySegment data, MemorySegment func, MemorySegment file, int line) {
		var mh$ = SDL_ReportAssertion.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ReportAssertion", data, func, file, line);
			}
			return (int) mh$.invokeExact(data, func, file, line);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetAssertionHandler {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetAssertionHandler");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetAssertionHandler$descriptor() {
		return SDL_SetAssertionHandler.DESC;
	}

	public static MethodHandle SDL_SetAssertionHandler$handle() {
		return SDL_SetAssertionHandler.HANDLE;
	}

	public static MemorySegment SDL_SetAssertionHandler$address() {
		return SDL_SetAssertionHandler.ADDR;
	}

	public static void SDL_SetAssertionHandler(MemorySegment handler, MemorySegment userdata) {
		var mh$ = SDL_SetAssertionHandler.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetAssertionHandler", handler, userdata);
			}
			mh$.invokeExact(handler, userdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetDefaultAssertionHandler {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetDefaultAssertionHandler");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetDefaultAssertionHandler$descriptor() {
		return SDL_GetDefaultAssertionHandler.DESC;
	}

	public static MethodHandle SDL_GetDefaultAssertionHandler$handle() {
		return SDL_GetDefaultAssertionHandler.HANDLE;
	}

	public static MemorySegment SDL_GetDefaultAssertionHandler$address() {
		return SDL_GetDefaultAssertionHandler.ADDR;
	}

	public static MemorySegment SDL_GetDefaultAssertionHandler() {
		var mh$ = SDL_GetDefaultAssertionHandler.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetDefaultAssertionHandler");
			}
			return (MemorySegment) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetAssertionHandler {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetAssertionHandler");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetAssertionHandler$descriptor() {
		return SDL_GetAssertionHandler.DESC;
	}

	public static MethodHandle SDL_GetAssertionHandler$handle() {
		return SDL_GetAssertionHandler.HANDLE;
	}

	public static MemorySegment SDL_GetAssertionHandler$address() {
		return SDL_GetAssertionHandler.ADDR;
	}

	public static MemorySegment SDL_GetAssertionHandler(MemorySegment puserdata) {
		var mh$ = SDL_GetAssertionHandler.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetAssertionHandler", puserdata);
			}
			return (MemorySegment) mh$.invokeExact(puserdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetAssertionReport {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetAssertionReport");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetAssertionReport$descriptor() {
		return SDL_GetAssertionReport.DESC;
	}

	public static MethodHandle SDL_GetAssertionReport$handle() {
		return SDL_GetAssertionReport.HANDLE;
	}

	public static MemorySegment SDL_GetAssertionReport$address() {
		return SDL_GetAssertionReport.ADDR;
	}

	public static MemorySegment SDL_GetAssertionReport() {
		var mh$ = SDL_GetAssertionReport.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetAssertionReport");
			}
			return (MemorySegment) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ResetAssertionReport {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid();

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ResetAssertionReport");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ResetAssertionReport$descriptor() {
		return SDL_ResetAssertionReport.DESC;
	}

	public static MethodHandle SDL_ResetAssertionReport$handle() {
		return SDL_ResetAssertionReport.HANDLE;
	}

	public static MemorySegment SDL_ResetAssertionReport$address() {
		return SDL_ResetAssertionReport.ADDR;
	}

	public static void SDL_ResetAssertionReport() {
		var mh$ = SDL_ResetAssertionReport.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ResetAssertionReport");
			}
			mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static final int SDL_ASYNCIO_TASK_READ = (int) 0L;

	public static int SDL_ASYNCIO_TASK_READ() {
		return SDL_ASYNCIO_TASK_READ;
	}

	private static final int SDL_ASYNCIO_TASK_WRITE = (int) 1L;

	public static int SDL_ASYNCIO_TASK_WRITE() {
		return SDL_ASYNCIO_TASK_WRITE;
	}

	private static final int SDL_ASYNCIO_TASK_CLOSE = (int) 2L;

	public static int SDL_ASYNCIO_TASK_CLOSE() {
		return SDL_ASYNCIO_TASK_CLOSE;
	}

	private static final int SDL_ASYNCIO_COMPLETE = (int) 0L;

	public static int SDL_ASYNCIO_COMPLETE() {
		return SDL_ASYNCIO_COMPLETE;
	}

	private static final int SDL_ASYNCIO_FAILURE = (int) 1L;

	public static int SDL_ASYNCIO_FAILURE() {
		return SDL_ASYNCIO_FAILURE;
	}

	private static final int SDL_ASYNCIO_CANCELED = (int) 2L;

	public static int SDL_ASYNCIO_CANCELED() {
		return SDL_ASYNCIO_CANCELED;
	}

	private static class SDL_AsyncIOFromFile {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_AsyncIOFromFile");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_AsyncIOFromFile$descriptor() {
		return SDL_AsyncIOFromFile.DESC;
	}

	public static MethodHandle SDL_AsyncIOFromFile$handle() {
		return SDL_AsyncIOFromFile.HANDLE;
	}

	public static MemorySegment SDL_AsyncIOFromFile$address() {
		return SDL_AsyncIOFromFile.ADDR;
	}

	public static MemorySegment SDL_AsyncIOFromFile(MemorySegment file, MemorySegment mode) {
		var mh$ = SDL_AsyncIOFromFile.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_AsyncIOFromFile", file, mode);
			}
			return (MemorySegment) mh$.invokeExact(file, mode);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetAsyncIOSize {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetAsyncIOSize");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetAsyncIOSize$descriptor() {
		return SDL_GetAsyncIOSize.DESC;
	}

	public static MethodHandle SDL_GetAsyncIOSize$handle() {
		return SDL_GetAsyncIOSize.HANDLE;
	}

	public static MemorySegment SDL_GetAsyncIOSize$address() {
		return SDL_GetAsyncIOSize.ADDR;
	}

	public static long SDL_GetAsyncIOSize(MemorySegment asyncio) {
		var mh$ = SDL_GetAsyncIOSize.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetAsyncIOSize", asyncio);
			}
			return (long) mh$.invokeExact(asyncio);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ReadAsyncIO {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG,
				SDL3.C_LONG,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ReadAsyncIO");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ReadAsyncIO$descriptor() {
		return SDL_ReadAsyncIO.DESC;
	}

	public static MethodHandle SDL_ReadAsyncIO$handle() {
		return SDL_ReadAsyncIO.HANDLE;
	}

	public static MemorySegment SDL_ReadAsyncIO$address() {
		return SDL_ReadAsyncIO.ADDR;
	}

	public static boolean SDL_ReadAsyncIO(MemorySegment asyncio, MemorySegment ptr, long offset, long size, MemorySegment queue, MemorySegment userdata) {
		var mh$ = SDL_ReadAsyncIO.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ReadAsyncIO", asyncio, ptr, offset, size, queue, userdata);
			}
			return (boolean) mh$.invokeExact(asyncio, ptr, offset, size, queue, userdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WriteAsyncIO {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG,
				SDL3.C_LONG,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WriteAsyncIO");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WriteAsyncIO$descriptor() {
		return SDL_WriteAsyncIO.DESC;
	}

	public static MethodHandle SDL_WriteAsyncIO$handle() {
		return SDL_WriteAsyncIO.HANDLE;
	}

	public static MemorySegment SDL_WriteAsyncIO$address() {
		return SDL_WriteAsyncIO.ADDR;
	}

	public static boolean SDL_WriteAsyncIO(MemorySegment asyncio, MemorySegment ptr, long offset, long size, MemorySegment queue, MemorySegment userdata) {
		var mh$ = SDL_WriteAsyncIO.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WriteAsyncIO", asyncio, ptr, offset, size, queue, userdata);
			}
			return (boolean) mh$.invokeExact(asyncio, ptr, offset, size, queue, userdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CloseAsyncIO {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CloseAsyncIO");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CloseAsyncIO$descriptor() {
		return SDL_CloseAsyncIO.DESC;
	}

	public static MethodHandle SDL_CloseAsyncIO$handle() {
		return SDL_CloseAsyncIO.HANDLE;
	}

	public static MemorySegment SDL_CloseAsyncIO$address() {
		return SDL_CloseAsyncIO.ADDR;
	}

	public static boolean SDL_CloseAsyncIO(MemorySegment asyncio, boolean flush, MemorySegment queue, MemorySegment userdata) {
		var mh$ = SDL_CloseAsyncIO.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CloseAsyncIO", asyncio, flush, queue, userdata);
			}
			return (boolean) mh$.invokeExact(asyncio, flush, queue, userdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateAsyncIOQueue {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateAsyncIOQueue");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateAsyncIOQueue$descriptor() {
		return SDL_CreateAsyncIOQueue.DESC;
	}

	public static MethodHandle SDL_CreateAsyncIOQueue$handle() {
		return SDL_CreateAsyncIOQueue.HANDLE;
	}

	public static MemorySegment SDL_CreateAsyncIOQueue$address() {
		return SDL_CreateAsyncIOQueue.ADDR;
	}

	public static MemorySegment SDL_CreateAsyncIOQueue() {
		var mh$ = SDL_CreateAsyncIOQueue.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateAsyncIOQueue");
			}
			return (MemorySegment) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DestroyAsyncIOQueue {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DestroyAsyncIOQueue");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DestroyAsyncIOQueue$descriptor() {
		return SDL_DestroyAsyncIOQueue.DESC;
	}

	public static MethodHandle SDL_DestroyAsyncIOQueue$handle() {
		return SDL_DestroyAsyncIOQueue.HANDLE;
	}

	public static MemorySegment SDL_DestroyAsyncIOQueue$address() {
		return SDL_DestroyAsyncIOQueue.ADDR;
	}

	public static void SDL_DestroyAsyncIOQueue(MemorySegment queue) {
		var mh$ = SDL_DestroyAsyncIOQueue.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DestroyAsyncIOQueue", queue);
			}
			mh$.invokeExact(queue);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetAsyncIOResult {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetAsyncIOResult");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetAsyncIOResult$descriptor() {
		return SDL_GetAsyncIOResult.DESC;
	}

	public static MethodHandle SDL_GetAsyncIOResult$handle() {
		return SDL_GetAsyncIOResult.HANDLE;
	}

	public static MemorySegment SDL_GetAsyncIOResult$address() {
		return SDL_GetAsyncIOResult.ADDR;
	}

	public static boolean SDL_GetAsyncIOResult(MemorySegment queue, MemorySegment outcome) {
		var mh$ = SDL_GetAsyncIOResult.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetAsyncIOResult", queue, outcome);
			}
			return (boolean) mh$.invokeExact(queue, outcome);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WaitAsyncIOResult {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WaitAsyncIOResult");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WaitAsyncIOResult$descriptor() {
		return SDL_WaitAsyncIOResult.DESC;
	}

	public static MethodHandle SDL_WaitAsyncIOResult$handle() {
		return SDL_WaitAsyncIOResult.HANDLE;
	}

	public static MemorySegment SDL_WaitAsyncIOResult$address() {
		return SDL_WaitAsyncIOResult.ADDR;
	}

	public static boolean SDL_WaitAsyncIOResult(MemorySegment queue, MemorySegment outcome, int timeoutMS) {
		var mh$ = SDL_WaitAsyncIOResult.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WaitAsyncIOResult", queue, outcome, timeoutMS);
			}
			return (boolean) mh$.invokeExact(queue, outcome, timeoutMS);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SignalAsyncIOQueue {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SignalAsyncIOQueue");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SignalAsyncIOQueue$descriptor() {
		return SDL_SignalAsyncIOQueue.DESC;
	}

	public static MethodHandle SDL_SignalAsyncIOQueue$handle() {
		return SDL_SignalAsyncIOQueue.HANDLE;
	}

	public static MemorySegment SDL_SignalAsyncIOQueue$address() {
		return SDL_SignalAsyncIOQueue.ADDR;
	}

	public static void SDL_SignalAsyncIOQueue(MemorySegment queue) {
		var mh$ = SDL_SignalAsyncIOQueue.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SignalAsyncIOQueue", queue);
			}
			mh$.invokeExact(queue);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_LoadFileAsync {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_LoadFileAsync");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_LoadFileAsync$descriptor() {
		return SDL_LoadFileAsync.DESC;
	}

	public static MethodHandle SDL_LoadFileAsync$handle() {
		return SDL_LoadFileAsync.HANDLE;
	}

	public static MemorySegment SDL_LoadFileAsync$address() {
		return SDL_LoadFileAsync.ADDR;
	}

	public static boolean SDL_LoadFileAsync(MemorySegment file, MemorySegment queue, MemorySegment userdata) {
		var mh$ = SDL_LoadFileAsync.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_LoadFileAsync", file, queue, userdata);
			}
			return (boolean) mh$.invokeExact(file, queue, userdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	public static OfInt SDL_SpinLock = SDL3.C_INT;

	private static class SDL_TryLockSpinlock {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_TryLockSpinlock");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_TryLockSpinlock$descriptor() {
		return SDL_TryLockSpinlock.DESC;
	}

	public static MethodHandle SDL_TryLockSpinlock$handle() {
		return SDL_TryLockSpinlock.HANDLE;
	}

	public static MemorySegment SDL_TryLockSpinlock$address() {
		return SDL_TryLockSpinlock.ADDR;
	}

	public static boolean SDL_TryLockSpinlock(MemorySegment lock) {
		var mh$ = SDL_TryLockSpinlock.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_TryLockSpinlock", lock);
			}
			return (boolean) mh$.invokeExact(lock);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_LockSpinlock {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_LockSpinlock");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_LockSpinlock$descriptor() {
		return SDL_LockSpinlock.DESC;
	}

	public static MethodHandle SDL_LockSpinlock$handle() {
		return SDL_LockSpinlock.HANDLE;
	}

	public static MemorySegment SDL_LockSpinlock$address() {
		return SDL_LockSpinlock.ADDR;
	}

	public static void SDL_LockSpinlock(MemorySegment lock) {
		var mh$ = SDL_LockSpinlock.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_LockSpinlock", lock);
			}
			mh$.invokeExact(lock);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_UnlockSpinlock {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_UnlockSpinlock");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_UnlockSpinlock$descriptor() {
		return SDL_UnlockSpinlock.DESC;
	}

	public static MethodHandle SDL_UnlockSpinlock$handle() {
		return SDL_UnlockSpinlock.HANDLE;
	}

	public static MemorySegment SDL_UnlockSpinlock$address() {
		return SDL_UnlockSpinlock.ADDR;
	}

	public static void SDL_UnlockSpinlock(MemorySegment lock) {
		var mh$ = SDL_UnlockSpinlock.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_UnlockSpinlock", lock);
			}
			mh$.invokeExact(lock);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_MemoryBarrierReleaseFunction {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid();

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_MemoryBarrierReleaseFunction");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_MemoryBarrierReleaseFunction$descriptor() {
		return SDL_MemoryBarrierReleaseFunction.DESC;
	}

	public static MethodHandle SDL_MemoryBarrierReleaseFunction$handle() {
		return SDL_MemoryBarrierReleaseFunction.HANDLE;
	}

	public static MemorySegment SDL_MemoryBarrierReleaseFunction$address() {
		return SDL_MemoryBarrierReleaseFunction.ADDR;
	}

	public static void SDL_MemoryBarrierReleaseFunction() {
		var mh$ = SDL_MemoryBarrierReleaseFunction.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_MemoryBarrierReleaseFunction");
			}
			mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_MemoryBarrierAcquireFunction {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid();

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_MemoryBarrierAcquireFunction");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_MemoryBarrierAcquireFunction$descriptor() {
		return SDL_MemoryBarrierAcquireFunction.DESC;
	}

	public static MethodHandle SDL_MemoryBarrierAcquireFunction$handle() {
		return SDL_MemoryBarrierAcquireFunction.HANDLE;
	}

	public static MemorySegment SDL_MemoryBarrierAcquireFunction$address() {
		return SDL_MemoryBarrierAcquireFunction.ADDR;
	}

	public static void SDL_MemoryBarrierAcquireFunction() {
		var mh$ = SDL_MemoryBarrierAcquireFunction.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_MemoryBarrierAcquireFunction");
			}
			mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CompareAndSwapAtomicInt {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CompareAndSwapAtomicInt");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CompareAndSwapAtomicInt$descriptor() {
		return SDL_CompareAndSwapAtomicInt.DESC;
	}

	public static MethodHandle SDL_CompareAndSwapAtomicInt$handle() {
		return SDL_CompareAndSwapAtomicInt.HANDLE;
	}

	public static MemorySegment SDL_CompareAndSwapAtomicInt$address() {
		return SDL_CompareAndSwapAtomicInt.ADDR;
	}

	public static boolean SDL_CompareAndSwapAtomicInt(MemorySegment a, int oldval, int newval) {
		var mh$ = SDL_CompareAndSwapAtomicInt.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CompareAndSwapAtomicInt", a, oldval, newval);
			}
			return (boolean) mh$.invokeExact(a, oldval, newval);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetAtomicInt {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetAtomicInt");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetAtomicInt$descriptor() {
		return SDL_SetAtomicInt.DESC;
	}

	public static MethodHandle SDL_SetAtomicInt$handle() {
		return SDL_SetAtomicInt.HANDLE;
	}

	public static MemorySegment SDL_SetAtomicInt$address() {
		return SDL_SetAtomicInt.ADDR;
	}

	public static int SDL_SetAtomicInt(MemorySegment a, int v) {
		var mh$ = SDL_SetAtomicInt.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetAtomicInt", a, v);
			}
			return (int) mh$.invokeExact(a, v);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetAtomicInt {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetAtomicInt");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetAtomicInt$descriptor() {
		return SDL_GetAtomicInt.DESC;
	}

	public static MethodHandle SDL_GetAtomicInt$handle() {
		return SDL_GetAtomicInt.HANDLE;
	}

	public static MemorySegment SDL_GetAtomicInt$address() {
		return SDL_GetAtomicInt.ADDR;
	}

	public static int SDL_GetAtomicInt(MemorySegment a) {
		var mh$ = SDL_GetAtomicInt.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetAtomicInt", a);
			}
			return (int) mh$.invokeExact(a);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_AddAtomicInt {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_AddAtomicInt");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_AddAtomicInt$descriptor() {
		return SDL_AddAtomicInt.DESC;
	}

	public static MethodHandle SDL_AddAtomicInt$handle() {
		return SDL_AddAtomicInt.HANDLE;
	}

	public static MemorySegment SDL_AddAtomicInt$address() {
		return SDL_AddAtomicInt.ADDR;
	}

	public static int SDL_AddAtomicInt(MemorySegment a, int v) {
		var mh$ = SDL_AddAtomicInt.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_AddAtomicInt", a, v);
			}
			return (int) mh$.invokeExact(a, v);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CompareAndSwapAtomicU32 {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CompareAndSwapAtomicU32");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CompareAndSwapAtomicU32$descriptor() {
		return SDL_CompareAndSwapAtomicU32.DESC;
	}

	public static MethodHandle SDL_CompareAndSwapAtomicU32$handle() {
		return SDL_CompareAndSwapAtomicU32.HANDLE;
	}

	public static MemorySegment SDL_CompareAndSwapAtomicU32$address() {
		return SDL_CompareAndSwapAtomicU32.ADDR;
	}

	public static boolean SDL_CompareAndSwapAtomicU32(MemorySegment a, int oldval, int newval) {
		var mh$ = SDL_CompareAndSwapAtomicU32.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CompareAndSwapAtomicU32", a, oldval, newval);
			}
			return (boolean) mh$.invokeExact(a, oldval, newval);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetAtomicU32 {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetAtomicU32");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetAtomicU32$descriptor() {
		return SDL_SetAtomicU32.DESC;
	}

	public static MethodHandle SDL_SetAtomicU32$handle() {
		return SDL_SetAtomicU32.HANDLE;
	}

	public static MemorySegment SDL_SetAtomicU32$address() {
		return SDL_SetAtomicU32.ADDR;
	}

	public static int SDL_SetAtomicU32(MemorySegment a, int v) {
		var mh$ = SDL_SetAtomicU32.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetAtomicU32", a, v);
			}
			return (int) mh$.invokeExact(a, v);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetAtomicU32 {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetAtomicU32");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetAtomicU32$descriptor() {
		return SDL_GetAtomicU32.DESC;
	}

	public static MethodHandle SDL_GetAtomicU32$handle() {
		return SDL_GetAtomicU32.HANDLE;
	}

	public static MemorySegment SDL_GetAtomicU32$address() {
		return SDL_GetAtomicU32.ADDR;
	}

	public static int SDL_GetAtomicU32(MemorySegment a) {
		var mh$ = SDL_GetAtomicU32.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetAtomicU32", a);
			}
			return (int) mh$.invokeExact(a);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_AddAtomicU32 {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_AddAtomicU32");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_AddAtomicU32$descriptor() {
		return SDL_AddAtomicU32.DESC;
	}

	public static MethodHandle SDL_AddAtomicU32$handle() {
		return SDL_AddAtomicU32.HANDLE;
	}

	public static MemorySegment SDL_AddAtomicU32$address() {
		return SDL_AddAtomicU32.ADDR;
	}

	public static int SDL_AddAtomicU32(MemorySegment a, int v) {
		var mh$ = SDL_AddAtomicU32.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_AddAtomicU32", a, v);
			}
			return (int) mh$.invokeExact(a, v);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CompareAndSwapAtomicPointer {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CompareAndSwapAtomicPointer");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CompareAndSwapAtomicPointer$descriptor() {
		return SDL_CompareAndSwapAtomicPointer.DESC;
	}

	public static MethodHandle SDL_CompareAndSwapAtomicPointer$handle() {
		return SDL_CompareAndSwapAtomicPointer.HANDLE;
	}

	public static MemorySegment SDL_CompareAndSwapAtomicPointer$address() {
		return SDL_CompareAndSwapAtomicPointer.ADDR;
	}

	public static boolean SDL_CompareAndSwapAtomicPointer(MemorySegment a, MemorySegment oldval, MemorySegment newval) {
		var mh$ = SDL_CompareAndSwapAtomicPointer.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CompareAndSwapAtomicPointer", a, oldval, newval);
			}
			return (boolean) mh$.invokeExact(a, oldval, newval);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetAtomicPointer {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetAtomicPointer");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetAtomicPointer$descriptor() {
		return SDL_SetAtomicPointer.DESC;
	}

	public static MethodHandle SDL_SetAtomicPointer$handle() {
		return SDL_SetAtomicPointer.HANDLE;
	}

	public static MemorySegment SDL_SetAtomicPointer$address() {
		return SDL_SetAtomicPointer.ADDR;
	}

	public static MemorySegment SDL_SetAtomicPointer(MemorySegment a, MemorySegment v) {
		var mh$ = SDL_SetAtomicPointer.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetAtomicPointer", a, v);
			}
			return (MemorySegment) mh$.invokeExact(a, v);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetAtomicPointer {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetAtomicPointer");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetAtomicPointer$descriptor() {
		return SDL_GetAtomicPointer.DESC;
	}

	public static MethodHandle SDL_GetAtomicPointer$handle() {
		return SDL_GetAtomicPointer.HANDLE;
	}

	public static MemorySegment SDL_GetAtomicPointer$address() {
		return SDL_GetAtomicPointer.ADDR;
	}

	public static MemorySegment SDL_GetAtomicPointer(MemorySegment a) {
		var mh$ = SDL_GetAtomicPointer.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetAtomicPointer", a);
			}
			return (MemorySegment) mh$.invokeExact(a);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}


	private static class SDL_SetErrorV {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetErrorV");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetErrorV$descriptor() {
		return SDL_SetErrorV.DESC;
	}

	public static MethodHandle SDL_SetErrorV$handle() {
		return SDL_SetErrorV.HANDLE;
	}

	public static MemorySegment SDL_SetErrorV$address() {
		return SDL_SetErrorV.ADDR;
	}

	public static boolean SDL_SetErrorV(MemorySegment fmt, MemorySegment ap) {
		var mh$ = SDL_SetErrorV.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetErrorV", fmt, ap);
			}
			return (boolean) mh$.invokeExact(fmt, ap);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_OutOfMemory {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_OutOfMemory");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_OutOfMemory$descriptor() {
		return SDL_OutOfMemory.DESC;
	}

	public static MethodHandle SDL_OutOfMemory$handle() {
		return SDL_OutOfMemory.HANDLE;
	}

	public static MemorySegment SDL_OutOfMemory$address() {
		return SDL_OutOfMemory.ADDR;
	}

	public static boolean SDL_OutOfMemory() {
		var mh$ = SDL_OutOfMemory.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_OutOfMemory");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetError {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetError");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetError$descriptor() {
		return SDL_GetError.DESC;
	}

	public static MethodHandle SDL_GetError$handle() {
		return SDL_GetError.HANDLE;
	}

	public static MemorySegment SDL_GetError$address() {
		return SDL_GetError.ADDR;
	}

	public static MemorySegment SDL_GetError() {
		var mh$ = SDL_GetError.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetError");
			}
			return (MemorySegment) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ClearError {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ClearError");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ClearError$descriptor() {
		return SDL_ClearError.DESC;
	}

	public static MethodHandle SDL_ClearError$handle() {
		return SDL_ClearError.HANDLE;
	}

	public static MemorySegment SDL_ClearError$address() {
		return SDL_ClearError.ADDR;
	}

	public static boolean SDL_ClearError() {
		var mh$ = SDL_ClearError.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ClearError");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	public static OfInt SDL_PropertiesID = SDL3.C_INT;
	private static final int SDL_PROPERTY_TYPE_INVALID = (int) 0L;

	public static int SDL_PROPERTY_TYPE_INVALID() {
		return SDL_PROPERTY_TYPE_INVALID;
	}

	private static final int SDL_PROPERTY_TYPE_POINTER = (int) 1L;

	public static int SDL_PROPERTY_TYPE_POINTER() {
		return SDL_PROPERTY_TYPE_POINTER;
	}

	private static final int SDL_PROPERTY_TYPE_STRING = (int) 2L;

	public static int SDL_PROPERTY_TYPE_STRING() {
		return SDL_PROPERTY_TYPE_STRING;
	}

	private static final int SDL_PROPERTY_TYPE_NUMBER = (int) 3L;

	public static int SDL_PROPERTY_TYPE_NUMBER() {
		return SDL_PROPERTY_TYPE_NUMBER;
	}

	private static final int SDL_PROPERTY_TYPE_FLOAT = (int) 4L;

	public static int SDL_PROPERTY_TYPE_FLOAT() {
		return SDL_PROPERTY_TYPE_FLOAT;
	}

	private static final int SDL_PROPERTY_TYPE_BOOLEAN = (int) 5L;

	public static int SDL_PROPERTY_TYPE_BOOLEAN() {
		return SDL_PROPERTY_TYPE_BOOLEAN;
	}

	private static class SDL_GetGlobalProperties {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGlobalProperties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGlobalProperties$descriptor() {
		return SDL_GetGlobalProperties.DESC;
	}

	public static MethodHandle SDL_GetGlobalProperties$handle() {
		return SDL_GetGlobalProperties.HANDLE;
	}

	public static MemorySegment SDL_GetGlobalProperties$address() {
		return SDL_GetGlobalProperties.ADDR;
	}

	public static int SDL_GetGlobalProperties() {
		var mh$ = SDL_GetGlobalProperties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGlobalProperties");
			}
			return (int) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateProperties {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateProperties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateProperties$descriptor() {
		return SDL_CreateProperties.DESC;
	}

	public static MethodHandle SDL_CreateProperties$handle() {
		return SDL_CreateProperties.HANDLE;
	}

	public static MemorySegment SDL_CreateProperties$address() {
		return SDL_CreateProperties.ADDR;
	}

	public static int SDL_CreateProperties() {
		var mh$ = SDL_CreateProperties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateProperties");
			}
			return (int) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CopyProperties {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CopyProperties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CopyProperties$descriptor() {
		return SDL_CopyProperties.DESC;
	}

	public static MethodHandle SDL_CopyProperties$handle() {
		return SDL_CopyProperties.HANDLE;
	}

	public static MemorySegment SDL_CopyProperties$address() {
		return SDL_CopyProperties.ADDR;
	}

	public static boolean SDL_CopyProperties(int src, int dst) {
		var mh$ = SDL_CopyProperties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CopyProperties", src, dst);
			}
			return (boolean) mh$.invokeExact(src, dst);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_LockProperties {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_LockProperties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_LockProperties$descriptor() {
		return SDL_LockProperties.DESC;
	}

	public static MethodHandle SDL_LockProperties$handle() {
		return SDL_LockProperties.HANDLE;
	}

	public static MemorySegment SDL_LockProperties$address() {
		return SDL_LockProperties.ADDR;
	}

	public static boolean SDL_LockProperties(int props) {
		var mh$ = SDL_LockProperties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_LockProperties", props);
			}
			return (boolean) mh$.invokeExact(props);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_UnlockProperties {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_UnlockProperties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_UnlockProperties$descriptor() {
		return SDL_UnlockProperties.DESC;
	}

	public static MethodHandle SDL_UnlockProperties$handle() {
		return SDL_UnlockProperties.HANDLE;
	}

	public static MemorySegment SDL_UnlockProperties$address() {
		return SDL_UnlockProperties.ADDR;
	}

	public static void SDL_UnlockProperties(int props) {
		var mh$ = SDL_UnlockProperties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_UnlockProperties", props);
			}
			mh$.invokeExact(props);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetPointerPropertyWithCleanup {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetPointerPropertyWithCleanup");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetPointerPropertyWithCleanup$descriptor() {
		return SDL_SetPointerPropertyWithCleanup.DESC;
	}

	public static MethodHandle SDL_SetPointerPropertyWithCleanup$handle() {
		return SDL_SetPointerPropertyWithCleanup.HANDLE;
	}

	public static MemorySegment SDL_SetPointerPropertyWithCleanup$address() {
		return SDL_SetPointerPropertyWithCleanup.ADDR;
	}

	public static boolean SDL_SetPointerPropertyWithCleanup(int props, MemorySegment name, MemorySegment value, MemorySegment cleanup, MemorySegment userdata) {
		var mh$ = SDL_SetPointerPropertyWithCleanup.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetPointerPropertyWithCleanup", props, name, value, cleanup, userdata);
			}
			return (boolean) mh$.invokeExact(props, name, value, cleanup, userdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetPointerProperty {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetPointerProperty");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetPointerProperty$descriptor() {
		return SDL_SetPointerProperty.DESC;
	}

	public static MethodHandle SDL_SetPointerProperty$handle() {
		return SDL_SetPointerProperty.HANDLE;
	}

	public static MemorySegment SDL_SetPointerProperty$address() {
		return SDL_SetPointerProperty.ADDR;
	}

	public static boolean SDL_SetPointerProperty(int props, MemorySegment name, MemorySegment value) {
		var mh$ = SDL_SetPointerProperty.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetPointerProperty", props, name, value);
			}
			return (boolean) mh$.invokeExact(props, name, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetStringProperty {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetStringProperty");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetStringProperty$descriptor() {
		return SDL_SetStringProperty.DESC;
	}

	public static MethodHandle SDL_SetStringProperty$handle() {
		return SDL_SetStringProperty.HANDLE;
	}

	public static MemorySegment SDL_SetStringProperty$address() {
		return SDL_SetStringProperty.ADDR;
	}

	public static boolean SDL_SetStringProperty(int props, MemorySegment name, MemorySegment value) {
		var mh$ = SDL_SetStringProperty.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetStringProperty", props, name, value);
			}
			return (boolean) mh$.invokeExact(props, name, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetNumberProperty {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetNumberProperty");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetNumberProperty$descriptor() {
		return SDL_SetNumberProperty.DESC;
	}

	public static MethodHandle SDL_SetNumberProperty$handle() {
		return SDL_SetNumberProperty.HANDLE;
	}

	public static MemorySegment SDL_SetNumberProperty$address() {
		return SDL_SetNumberProperty.ADDR;
	}

	public static boolean SDL_SetNumberProperty(int props, MemorySegment name, long value) {
		var mh$ = SDL_SetNumberProperty.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetNumberProperty", props, name, value);
			}
			return (boolean) mh$.invokeExact(props, name, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetFloatProperty {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetFloatProperty");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetFloatProperty$descriptor() {
		return SDL_SetFloatProperty.DESC;
	}

	public static MethodHandle SDL_SetFloatProperty$handle() {
		return SDL_SetFloatProperty.HANDLE;
	}

	public static MemorySegment SDL_SetFloatProperty$address() {
		return SDL_SetFloatProperty.ADDR;
	}

	public static boolean SDL_SetFloatProperty(int props, MemorySegment name, float value) {
		var mh$ = SDL_SetFloatProperty.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetFloatProperty", props, name, value);
			}
			return (boolean) mh$.invokeExact(props, name, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetBooleanProperty {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetBooleanProperty");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetBooleanProperty$descriptor() {
		return SDL_SetBooleanProperty.DESC;
	}

	public static MethodHandle SDL_SetBooleanProperty$handle() {
		return SDL_SetBooleanProperty.HANDLE;
	}

	public static MemorySegment SDL_SetBooleanProperty$address() {
		return SDL_SetBooleanProperty.ADDR;
	}

	public static boolean SDL_SetBooleanProperty(int props, MemorySegment name, boolean value) {
		var mh$ = SDL_SetBooleanProperty.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetBooleanProperty", props, name, value);
			}
			return (boolean) mh$.invokeExact(props, name, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_HasProperty {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_HasProperty");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_HasProperty$descriptor() {
		return SDL_HasProperty.DESC;
	}

	public static MethodHandle SDL_HasProperty$handle() {
		return SDL_HasProperty.HANDLE;
	}

	public static MemorySegment SDL_HasProperty$address() {
		return SDL_HasProperty.ADDR;
	}

	public static boolean SDL_HasProperty(int props, MemorySegment name) {
		var mh$ = SDL_HasProperty.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_HasProperty", props, name);
			}
			return (boolean) mh$.invokeExact(props, name);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetPropertyType {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetPropertyType");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetPropertyType$descriptor() {
		return SDL_GetPropertyType.DESC;
	}

	public static MethodHandle SDL_GetPropertyType$handle() {
		return SDL_GetPropertyType.HANDLE;
	}

	public static MemorySegment SDL_GetPropertyType$address() {
		return SDL_GetPropertyType.ADDR;
	}

	public static int SDL_GetPropertyType(int props, MemorySegment name) {
		var mh$ = SDL_GetPropertyType.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetPropertyType", props, name);
			}
			return (int) mh$.invokeExact(props, name);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetPointerProperty {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetPointerProperty");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetPointerProperty$descriptor() {
		return SDL_GetPointerProperty.DESC;
	}

	public static MethodHandle SDL_GetPointerProperty$handle() {
		return SDL_GetPointerProperty.HANDLE;
	}

	public static MemorySegment SDL_GetPointerProperty$address() {
		return SDL_GetPointerProperty.ADDR;
	}

	public static MemorySegment SDL_GetPointerProperty(int props, MemorySegment name, MemorySegment default_value) {
		var mh$ = SDL_GetPointerProperty.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetPointerProperty", props, name, default_value);
			}
			return (MemorySegment) mh$.invokeExact(props, name, default_value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetStringProperty {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetStringProperty");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetStringProperty$descriptor() {
		return SDL_GetStringProperty.DESC;
	}

	public static MethodHandle SDL_GetStringProperty$handle() {
		return SDL_GetStringProperty.HANDLE;
	}

	public static MemorySegment SDL_GetStringProperty$address() {
		return SDL_GetStringProperty.ADDR;
	}

	public static MemorySegment SDL_GetStringProperty(int props, MemorySegment name, MemorySegment default_value) {
		var mh$ = SDL_GetStringProperty.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetStringProperty", props, name, default_value);
			}
			return (MemorySegment) mh$.invokeExact(props, name, default_value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetNumberProperty {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetNumberProperty");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetNumberProperty$descriptor() {
		return SDL_GetNumberProperty.DESC;
	}

	public static MethodHandle SDL_GetNumberProperty$handle() {
		return SDL_GetNumberProperty.HANDLE;
	}

	public static MemorySegment SDL_GetNumberProperty$address() {
		return SDL_GetNumberProperty.ADDR;
	}

	public static long SDL_GetNumberProperty(int props, MemorySegment name, long default_value) {
		var mh$ = SDL_GetNumberProperty.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetNumberProperty", props, name, default_value);
			}
			return (long) mh$.invokeExact(props, name, default_value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetFloatProperty {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_FLOAT,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetFloatProperty");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetFloatProperty$descriptor() {
		return SDL_GetFloatProperty.DESC;
	}

	public static MethodHandle SDL_GetFloatProperty$handle() {
		return SDL_GetFloatProperty.HANDLE;
	}

	public static MemorySegment SDL_GetFloatProperty$address() {
		return SDL_GetFloatProperty.ADDR;
	}

	public static float SDL_GetFloatProperty(int props, MemorySegment name, float default_value) {
		var mh$ = SDL_GetFloatProperty.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetFloatProperty", props, name, default_value);
			}
			return (float) mh$.invokeExact(props, name, default_value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetBooleanProperty {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetBooleanProperty");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetBooleanProperty$descriptor() {
		return SDL_GetBooleanProperty.DESC;
	}

	public static MethodHandle SDL_GetBooleanProperty$handle() {
		return SDL_GetBooleanProperty.HANDLE;
	}

	public static MemorySegment SDL_GetBooleanProperty$address() {
		return SDL_GetBooleanProperty.ADDR;
	}

	public static boolean SDL_GetBooleanProperty(int props, MemorySegment name, boolean default_value) {
		var mh$ = SDL_GetBooleanProperty.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetBooleanProperty", props, name, default_value);
			}
			return (boolean) mh$.invokeExact(props, name, default_value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ClearProperty {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ClearProperty");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ClearProperty$descriptor() {
		return SDL_ClearProperty.DESC;
	}

	public static MethodHandle SDL_ClearProperty$handle() {
		return SDL_ClearProperty.HANDLE;
	}

	public static MemorySegment SDL_ClearProperty$address() {
		return SDL_ClearProperty.ADDR;
	}

	public static boolean SDL_ClearProperty(int props, MemorySegment name) {
		var mh$ = SDL_ClearProperty.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ClearProperty", props, name);
			}
			return (boolean) mh$.invokeExact(props, name);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_EnumerateProperties {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_EnumerateProperties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_EnumerateProperties$descriptor() {
		return SDL_EnumerateProperties.DESC;
	}

	public static MethodHandle SDL_EnumerateProperties$handle() {
		return SDL_EnumerateProperties.HANDLE;
	}

	public static MemorySegment SDL_EnumerateProperties$address() {
		return SDL_EnumerateProperties.ADDR;
	}

	public static boolean SDL_EnumerateProperties(int props, MemorySegment callback, MemorySegment userdata) {
		var mh$ = SDL_EnumerateProperties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_EnumerateProperties", props, callback, userdata);
			}
			return (boolean) mh$.invokeExact(props, callback, userdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DestroyProperties {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DestroyProperties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DestroyProperties$descriptor() {
		return SDL_DestroyProperties.DESC;
	}

	public static MethodHandle SDL_DestroyProperties$handle() {
		return SDL_DestroyProperties.HANDLE;
	}

	public static MemorySegment SDL_DestroyProperties$address() {
		return SDL_DestroyProperties.ADDR;
	}

	public static void SDL_DestroyProperties(int props) {
		var mh$ = SDL_DestroyProperties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DestroyProperties", props);
			}
			mh$.invokeExact(props);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	public static OfLong SDL_ThreadID = SDL3.C_LONG;
	private static final int SDL_THREAD_PRIORITY_LOW = (int) 0L;

	public static int SDL_THREAD_PRIORITY_LOW() {
		return SDL_THREAD_PRIORITY_LOW;
	}

	private static final int SDL_THREAD_PRIORITY_NORMAL = (int) 1L;

	public static int SDL_THREAD_PRIORITY_NORMAL() {
		return SDL_THREAD_PRIORITY_NORMAL;
	}

	private static final int SDL_THREAD_PRIORITY_HIGH = (int) 2L;

	public static int SDL_THREAD_PRIORITY_HIGH() {
		return SDL_THREAD_PRIORITY_HIGH;
	}

	private static final int SDL_THREAD_PRIORITY_TIME_CRITICAL = (int) 3L;

	public static int SDL_THREAD_PRIORITY_TIME_CRITICAL() {
		return SDL_THREAD_PRIORITY_TIME_CRITICAL;
	}

	private static final int SDL_THREAD_UNKNOWN = (int) 0L;

	public static int SDL_THREAD_UNKNOWN() {
		return SDL_THREAD_UNKNOWN;
	}

	private static final int SDL_THREAD_ALIVE = (int) 1L;

	public static int SDL_THREAD_ALIVE() {
		return SDL_THREAD_ALIVE;
	}

	private static final int SDL_THREAD_DETACHED = (int) 2L;

	public static int SDL_THREAD_DETACHED() {
		return SDL_THREAD_DETACHED;
	}

	private static final int SDL_THREAD_COMPLETE = (int) 3L;

	public static int SDL_THREAD_COMPLETE() {
		return SDL_THREAD_COMPLETE;
	}

	private static class SDL_CreateThreadRuntime {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateThreadRuntime");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateThreadRuntime$descriptor() {
		return SDL_CreateThreadRuntime.DESC;
	}

	public static MethodHandle SDL_CreateThreadRuntime$handle() {
		return SDL_CreateThreadRuntime.HANDLE;
	}

	public static MemorySegment SDL_CreateThreadRuntime$address() {
		return SDL_CreateThreadRuntime.ADDR;
	}

	public static MemorySegment SDL_CreateThreadRuntime(MemorySegment fn, MemorySegment name, MemorySegment data, MemorySegment pfnBeginThread, MemorySegment pfnEndThread) {
		var mh$ = SDL_CreateThreadRuntime.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateThreadRuntime", fn, name, data, pfnBeginThread, pfnEndThread);
			}
			return (MemorySegment) mh$.invokeExact(fn, name, data, pfnBeginThread, pfnEndThread);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateThreadWithPropertiesRuntime {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateThreadWithPropertiesRuntime");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateThreadWithPropertiesRuntime$descriptor() {
		return SDL_CreateThreadWithPropertiesRuntime.DESC;
	}

	public static MethodHandle SDL_CreateThreadWithPropertiesRuntime$handle() {
		return SDL_CreateThreadWithPropertiesRuntime.HANDLE;
	}

	public static MemorySegment SDL_CreateThreadWithPropertiesRuntime$address() {
		return SDL_CreateThreadWithPropertiesRuntime.ADDR;
	}

	public static MemorySegment SDL_CreateThreadWithPropertiesRuntime(int props, MemorySegment pfnBeginThread, MemorySegment pfnEndThread) {
		var mh$ = SDL_CreateThreadWithPropertiesRuntime.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateThreadWithPropertiesRuntime", props, pfnBeginThread, pfnEndThread);
			}
			return (MemorySegment) mh$.invokeExact(props, pfnBeginThread, pfnEndThread);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetThreadName {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetThreadName");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetThreadName$descriptor() {
		return SDL_GetThreadName.DESC;
	}

	public static MethodHandle SDL_GetThreadName$handle() {
		return SDL_GetThreadName.HANDLE;
	}

	public static MemorySegment SDL_GetThreadName$address() {
		return SDL_GetThreadName.ADDR;
	}

	public static MemorySegment SDL_GetThreadName(MemorySegment thread) {
		var mh$ = SDL_GetThreadName.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetThreadName", thread);
			}
			return (MemorySegment) mh$.invokeExact(thread);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetCurrentThreadID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetCurrentThreadID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetCurrentThreadID$descriptor() {
		return SDL_GetCurrentThreadID.DESC;
	}

	public static MethodHandle SDL_GetCurrentThreadID$handle() {
		return SDL_GetCurrentThreadID.HANDLE;
	}

	public static MemorySegment SDL_GetCurrentThreadID$address() {
		return SDL_GetCurrentThreadID.ADDR;
	}

	public static long SDL_GetCurrentThreadID() {
		var mh$ = SDL_GetCurrentThreadID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetCurrentThreadID");
			}
			return (long) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetThreadID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetThreadID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetThreadID$descriptor() {
		return SDL_GetThreadID.DESC;
	}

	public static MethodHandle SDL_GetThreadID$handle() {
		return SDL_GetThreadID.HANDLE;
	}

	public static MemorySegment SDL_GetThreadID$address() {
		return SDL_GetThreadID.ADDR;
	}

	public static long SDL_GetThreadID(MemorySegment thread) {
		var mh$ = SDL_GetThreadID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetThreadID", thread);
			}
			return (long) mh$.invokeExact(thread);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetCurrentThreadPriority {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetCurrentThreadPriority");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetCurrentThreadPriority$descriptor() {
		return SDL_SetCurrentThreadPriority.DESC;
	}

	public static MethodHandle SDL_SetCurrentThreadPriority$handle() {
		return SDL_SetCurrentThreadPriority.HANDLE;
	}

	public static MemorySegment SDL_SetCurrentThreadPriority$address() {
		return SDL_SetCurrentThreadPriority.ADDR;
	}

	public static boolean SDL_SetCurrentThreadPriority(int priority) {
		var mh$ = SDL_SetCurrentThreadPriority.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetCurrentThreadPriority", priority);
			}
			return (boolean) mh$.invokeExact(priority);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WaitThread {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WaitThread");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WaitThread$descriptor() {
		return SDL_WaitThread.DESC;
	}

	public static MethodHandle SDL_WaitThread$handle() {
		return SDL_WaitThread.HANDLE;
	}

	public static MemorySegment SDL_WaitThread$address() {
		return SDL_WaitThread.ADDR;
	}

	public static void SDL_WaitThread(MemorySegment thread, MemorySegment status) {
		var mh$ = SDL_WaitThread.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WaitThread", thread, status);
			}
			mh$.invokeExact(thread, status);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetThreadState {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetThreadState");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetThreadState$descriptor() {
		return SDL_GetThreadState.DESC;
	}

	public static MethodHandle SDL_GetThreadState$handle() {
		return SDL_GetThreadState.HANDLE;
	}

	public static MemorySegment SDL_GetThreadState$address() {
		return SDL_GetThreadState.ADDR;
	}

	public static int SDL_GetThreadState(MemorySegment thread) {
		var mh$ = SDL_GetThreadState.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetThreadState", thread);
			}
			return (int) mh$.invokeExact(thread);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DetachThread {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DetachThread");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DetachThread$descriptor() {
		return SDL_DetachThread.DESC;
	}

	public static MethodHandle SDL_DetachThread$handle() {
		return SDL_DetachThread.HANDLE;
	}

	public static MemorySegment SDL_DetachThread$address() {
		return SDL_DetachThread.ADDR;
	}

	public static void SDL_DetachThread(MemorySegment thread) {
		var mh$ = SDL_DetachThread.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DetachThread", thread);
			}
			mh$.invokeExact(thread);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetTLS {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetTLS");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetTLS$descriptor() {
		return SDL_GetTLS.DESC;
	}

	public static MethodHandle SDL_GetTLS$handle() {
		return SDL_GetTLS.HANDLE;
	}

	public static MemorySegment SDL_GetTLS$address() {
		return SDL_GetTLS.ADDR;
	}

	public static MemorySegment SDL_GetTLS(MemorySegment id) {
		var mh$ = SDL_GetTLS.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetTLS", id);
			}
			return (MemorySegment) mh$.invokeExact(id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetTLS {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetTLS");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetTLS$descriptor() {
		return SDL_SetTLS.DESC;
	}

	public static MethodHandle SDL_SetTLS$handle() {
		return SDL_SetTLS.HANDLE;
	}

	public static MemorySegment SDL_SetTLS$address() {
		return SDL_SetTLS.ADDR;
	}

	public static boolean SDL_SetTLS(MemorySegment id, MemorySegment value, MemorySegment destructor) {
		var mh$ = SDL_SetTLS.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetTLS", id, value, destructor);
			}
			return (boolean) mh$.invokeExact(id, value, destructor);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CleanupTLS {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid();

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CleanupTLS");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CleanupTLS$descriptor() {
		return SDL_CleanupTLS.DESC;
	}

	public static MethodHandle SDL_CleanupTLS$handle() {
		return SDL_CleanupTLS.HANDLE;
	}

	public static MemorySegment SDL_CleanupTLS$address() {
		return SDL_CleanupTLS.ADDR;
	}

	public static void SDL_CleanupTLS() {
		var mh$ = SDL_CleanupTLS.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CleanupTLS");
			}
			mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateMutex {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateMutex");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateMutex$descriptor() {
		return SDL_CreateMutex.DESC;
	}

	public static MethodHandle SDL_CreateMutex$handle() {
		return SDL_CreateMutex.HANDLE;
	}

	public static MemorySegment SDL_CreateMutex$address() {
		return SDL_CreateMutex.ADDR;
	}

	public static MemorySegment SDL_CreateMutex() {
		var mh$ = SDL_CreateMutex.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateMutex");
			}
			return (MemorySegment) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_LockMutex {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_LockMutex");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_LockMutex$descriptor() {
		return SDL_LockMutex.DESC;
	}

	public static MethodHandle SDL_LockMutex$handle() {
		return SDL_LockMutex.HANDLE;
	}

	public static MemorySegment SDL_LockMutex$address() {
		return SDL_LockMutex.ADDR;
	}

	public static void SDL_LockMutex(MemorySegment mutex) {
		var mh$ = SDL_LockMutex.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_LockMutex", mutex);
			}
			mh$.invokeExact(mutex);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_TryLockMutex {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_TryLockMutex");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_TryLockMutex$descriptor() {
		return SDL_TryLockMutex.DESC;
	}

	public static MethodHandle SDL_TryLockMutex$handle() {
		return SDL_TryLockMutex.HANDLE;
	}

	public static MemorySegment SDL_TryLockMutex$address() {
		return SDL_TryLockMutex.ADDR;
	}

	public static boolean SDL_TryLockMutex(MemorySegment mutex) {
		var mh$ = SDL_TryLockMutex.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_TryLockMutex", mutex);
			}
			return (boolean) mh$.invokeExact(mutex);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_UnlockMutex {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_UnlockMutex");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_UnlockMutex$descriptor() {
		return SDL_UnlockMutex.DESC;
	}

	public static MethodHandle SDL_UnlockMutex$handle() {
		return SDL_UnlockMutex.HANDLE;
	}

	public static MemorySegment SDL_UnlockMutex$address() {
		return SDL_UnlockMutex.ADDR;
	}

	public static void SDL_UnlockMutex(MemorySegment mutex) {
		var mh$ = SDL_UnlockMutex.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_UnlockMutex", mutex);
			}
			mh$.invokeExact(mutex);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DestroyMutex {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DestroyMutex");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DestroyMutex$descriptor() {
		return SDL_DestroyMutex.DESC;
	}

	public static MethodHandle SDL_DestroyMutex$handle() {
		return SDL_DestroyMutex.HANDLE;
	}

	public static MemorySegment SDL_DestroyMutex$address() {
		return SDL_DestroyMutex.ADDR;
	}

	public static void SDL_DestroyMutex(MemorySegment mutex) {
		var mh$ = SDL_DestroyMutex.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DestroyMutex", mutex);
			}
			mh$.invokeExact(mutex);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateRWLock {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateRWLock");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateRWLock$descriptor() {
		return SDL_CreateRWLock.DESC;
	}

	public static MethodHandle SDL_CreateRWLock$handle() {
		return SDL_CreateRWLock.HANDLE;
	}

	public static MemorySegment SDL_CreateRWLock$address() {
		return SDL_CreateRWLock.ADDR;
	}

	public static MemorySegment SDL_CreateRWLock() {
		var mh$ = SDL_CreateRWLock.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateRWLock");
			}
			return (MemorySegment) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_LockRWLockForReading {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_LockRWLockForReading");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_LockRWLockForReading$descriptor() {
		return SDL_LockRWLockForReading.DESC;
	}

	public static MethodHandle SDL_LockRWLockForReading$handle() {
		return SDL_LockRWLockForReading.HANDLE;
	}

	public static MemorySegment SDL_LockRWLockForReading$address() {
		return SDL_LockRWLockForReading.ADDR;
	}

	public static void SDL_LockRWLockForReading(MemorySegment rwlock) {
		var mh$ = SDL_LockRWLockForReading.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_LockRWLockForReading", rwlock);
			}
			mh$.invokeExact(rwlock);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_LockRWLockForWriting {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_LockRWLockForWriting");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_LockRWLockForWriting$descriptor() {
		return SDL_LockRWLockForWriting.DESC;
	}

	public static MethodHandle SDL_LockRWLockForWriting$handle() {
		return SDL_LockRWLockForWriting.HANDLE;
	}

	public static MemorySegment SDL_LockRWLockForWriting$address() {
		return SDL_LockRWLockForWriting.ADDR;
	}

	public static void SDL_LockRWLockForWriting(MemorySegment rwlock) {
		var mh$ = SDL_LockRWLockForWriting.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_LockRWLockForWriting", rwlock);
			}
			mh$.invokeExact(rwlock);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_TryLockRWLockForReading {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_TryLockRWLockForReading");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_TryLockRWLockForReading$descriptor() {
		return SDL_TryLockRWLockForReading.DESC;
	}

	public static MethodHandle SDL_TryLockRWLockForReading$handle() {
		return SDL_TryLockRWLockForReading.HANDLE;
	}

	public static MemorySegment SDL_TryLockRWLockForReading$address() {
		return SDL_TryLockRWLockForReading.ADDR;
	}

	public static boolean SDL_TryLockRWLockForReading(MemorySegment rwlock) {
		var mh$ = SDL_TryLockRWLockForReading.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_TryLockRWLockForReading", rwlock);
			}
			return (boolean) mh$.invokeExact(rwlock);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_TryLockRWLockForWriting {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_TryLockRWLockForWriting");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_TryLockRWLockForWriting$descriptor() {
		return SDL_TryLockRWLockForWriting.DESC;
	}

	public static MethodHandle SDL_TryLockRWLockForWriting$handle() {
		return SDL_TryLockRWLockForWriting.HANDLE;
	}

	public static MemorySegment SDL_TryLockRWLockForWriting$address() {
		return SDL_TryLockRWLockForWriting.ADDR;
	}

	public static boolean SDL_TryLockRWLockForWriting(MemorySegment rwlock) {
		var mh$ = SDL_TryLockRWLockForWriting.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_TryLockRWLockForWriting", rwlock);
			}
			return (boolean) mh$.invokeExact(rwlock);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_UnlockRWLock {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_UnlockRWLock");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_UnlockRWLock$descriptor() {
		return SDL_UnlockRWLock.DESC;
	}

	public static MethodHandle SDL_UnlockRWLock$handle() {
		return SDL_UnlockRWLock.HANDLE;
	}

	public static MemorySegment SDL_UnlockRWLock$address() {
		return SDL_UnlockRWLock.ADDR;
	}

	public static void SDL_UnlockRWLock(MemorySegment rwlock) {
		var mh$ = SDL_UnlockRWLock.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_UnlockRWLock", rwlock);
			}
			mh$.invokeExact(rwlock);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DestroyRWLock {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DestroyRWLock");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DestroyRWLock$descriptor() {
		return SDL_DestroyRWLock.DESC;
	}

	public static MethodHandle SDL_DestroyRWLock$handle() {
		return SDL_DestroyRWLock.HANDLE;
	}

	public static MemorySegment SDL_DestroyRWLock$address() {
		return SDL_DestroyRWLock.ADDR;
	}

	public static void SDL_DestroyRWLock(MemorySegment rwlock) {
		var mh$ = SDL_DestroyRWLock.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DestroyRWLock", rwlock);
			}
			mh$.invokeExact(rwlock);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateSemaphore {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateSemaphore");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateSemaphore$descriptor() {
		return SDL_CreateSemaphore.DESC;
	}

	public static MethodHandle SDL_CreateSemaphore$handle() {
		return SDL_CreateSemaphore.HANDLE;
	}

	public static MemorySegment SDL_CreateSemaphore$address() {
		return SDL_CreateSemaphore.ADDR;
	}

	public static MemorySegment SDL_CreateSemaphore(int initial_value) {
		var mh$ = SDL_CreateSemaphore.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateSemaphore", initial_value);
			}
			return (MemorySegment) mh$.invokeExact(initial_value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DestroySemaphore {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DestroySemaphore");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DestroySemaphore$descriptor() {
		return SDL_DestroySemaphore.DESC;
	}

	public static MethodHandle SDL_DestroySemaphore$handle() {
		return SDL_DestroySemaphore.HANDLE;
	}

	public static MemorySegment SDL_DestroySemaphore$address() {
		return SDL_DestroySemaphore.ADDR;
	}

	public static void SDL_DestroySemaphore(MemorySegment sem) {
		var mh$ = SDL_DestroySemaphore.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DestroySemaphore", sem);
			}
			mh$.invokeExact(sem);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WaitSemaphore {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WaitSemaphore");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WaitSemaphore$descriptor() {
		return SDL_WaitSemaphore.DESC;
	}

	public static MethodHandle SDL_WaitSemaphore$handle() {
		return SDL_WaitSemaphore.HANDLE;
	}

	public static MemorySegment SDL_WaitSemaphore$address() {
		return SDL_WaitSemaphore.ADDR;
	}

	public static void SDL_WaitSemaphore(MemorySegment sem) {
		var mh$ = SDL_WaitSemaphore.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WaitSemaphore", sem);
			}
			mh$.invokeExact(sem);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_TryWaitSemaphore {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_TryWaitSemaphore");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_TryWaitSemaphore$descriptor() {
		return SDL_TryWaitSemaphore.DESC;
	}

	public static MethodHandle SDL_TryWaitSemaphore$handle() {
		return SDL_TryWaitSemaphore.HANDLE;
	}

	public static MemorySegment SDL_TryWaitSemaphore$address() {
		return SDL_TryWaitSemaphore.ADDR;
	}

	public static boolean SDL_TryWaitSemaphore(MemorySegment sem) {
		var mh$ = SDL_TryWaitSemaphore.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_TryWaitSemaphore", sem);
			}
			return (boolean) mh$.invokeExact(sem);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WaitSemaphoreTimeout {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WaitSemaphoreTimeout");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WaitSemaphoreTimeout$descriptor() {
		return SDL_WaitSemaphoreTimeout.DESC;
	}

	public static MethodHandle SDL_WaitSemaphoreTimeout$handle() {
		return SDL_WaitSemaphoreTimeout.HANDLE;
	}

	public static MemorySegment SDL_WaitSemaphoreTimeout$address() {
		return SDL_WaitSemaphoreTimeout.ADDR;
	}

	public static boolean SDL_WaitSemaphoreTimeout(MemorySegment sem, int timeoutMS) {
		var mh$ = SDL_WaitSemaphoreTimeout.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WaitSemaphoreTimeout", sem, timeoutMS);
			}
			return (boolean) mh$.invokeExact(sem, timeoutMS);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SignalSemaphore {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SignalSemaphore");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SignalSemaphore$descriptor() {
		return SDL_SignalSemaphore.DESC;
	}

	public static MethodHandle SDL_SignalSemaphore$handle() {
		return SDL_SignalSemaphore.HANDLE;
	}

	public static MemorySegment SDL_SignalSemaphore$address() {
		return SDL_SignalSemaphore.ADDR;
	}

	public static void SDL_SignalSemaphore(MemorySegment sem) {
		var mh$ = SDL_SignalSemaphore.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SignalSemaphore", sem);
			}
			mh$.invokeExact(sem);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetSemaphoreValue {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetSemaphoreValue");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetSemaphoreValue$descriptor() {
		return SDL_GetSemaphoreValue.DESC;
	}

	public static MethodHandle SDL_GetSemaphoreValue$handle() {
		return SDL_GetSemaphoreValue.HANDLE;
	}

	public static MemorySegment SDL_GetSemaphoreValue$address() {
		return SDL_GetSemaphoreValue.ADDR;
	}

	public static int SDL_GetSemaphoreValue(MemorySegment sem) {
		var mh$ = SDL_GetSemaphoreValue.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetSemaphoreValue", sem);
			}
			return (int) mh$.invokeExact(sem);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateCondition {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateCondition");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateCondition$descriptor() {
		return SDL_CreateCondition.DESC;
	}

	public static MethodHandle SDL_CreateCondition$handle() {
		return SDL_CreateCondition.HANDLE;
	}

	public static MemorySegment SDL_CreateCondition$address() {
		return SDL_CreateCondition.ADDR;
	}

	public static MemorySegment SDL_CreateCondition() {
		var mh$ = SDL_CreateCondition.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateCondition");
			}
			return (MemorySegment) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DestroyCondition {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DestroyCondition");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DestroyCondition$descriptor() {
		return SDL_DestroyCondition.DESC;
	}

	public static MethodHandle SDL_DestroyCondition$handle() {
		return SDL_DestroyCondition.HANDLE;
	}

	public static MemorySegment SDL_DestroyCondition$address() {
		return SDL_DestroyCondition.ADDR;
	}

	public static void SDL_DestroyCondition(MemorySegment cond) {
		var mh$ = SDL_DestroyCondition.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DestroyCondition", cond);
			}
			mh$.invokeExact(cond);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SignalCondition {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SignalCondition");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SignalCondition$descriptor() {
		return SDL_SignalCondition.DESC;
	}

	public static MethodHandle SDL_SignalCondition$handle() {
		return SDL_SignalCondition.HANDLE;
	}

	public static MemorySegment SDL_SignalCondition$address() {
		return SDL_SignalCondition.ADDR;
	}

	public static void SDL_SignalCondition(MemorySegment cond) {
		var mh$ = SDL_SignalCondition.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SignalCondition", cond);
			}
			mh$.invokeExact(cond);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_BroadcastCondition {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_BroadcastCondition");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_BroadcastCondition$descriptor() {
		return SDL_BroadcastCondition.DESC;
	}

	public static MethodHandle SDL_BroadcastCondition$handle() {
		return SDL_BroadcastCondition.HANDLE;
	}

	public static MemorySegment SDL_BroadcastCondition$address() {
		return SDL_BroadcastCondition.ADDR;
	}

	public static void SDL_BroadcastCondition(MemorySegment cond) {
		var mh$ = SDL_BroadcastCondition.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_BroadcastCondition", cond);
			}
			mh$.invokeExact(cond);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WaitCondition {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WaitCondition");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WaitCondition$descriptor() {
		return SDL_WaitCondition.DESC;
	}

	public static MethodHandle SDL_WaitCondition$handle() {
		return SDL_WaitCondition.HANDLE;
	}

	public static MemorySegment SDL_WaitCondition$address() {
		return SDL_WaitCondition.ADDR;
	}

	public static void SDL_WaitCondition(MemorySegment cond, MemorySegment mutex) {
		var mh$ = SDL_WaitCondition.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WaitCondition", cond, mutex);
			}
			mh$.invokeExact(cond, mutex);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WaitConditionTimeout {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WaitConditionTimeout");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WaitConditionTimeout$descriptor() {
		return SDL_WaitConditionTimeout.DESC;
	}

	public static MethodHandle SDL_WaitConditionTimeout$handle() {
		return SDL_WaitConditionTimeout.HANDLE;
	}

	public static MemorySegment SDL_WaitConditionTimeout$address() {
		return SDL_WaitConditionTimeout.ADDR;
	}

	public static boolean SDL_WaitConditionTimeout(MemorySegment cond, MemorySegment mutex, int timeoutMS) {
		var mh$ = SDL_WaitConditionTimeout.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WaitConditionTimeout", cond, mutex, timeoutMS);
			}
			return (boolean) mh$.invokeExact(cond, mutex, timeoutMS);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static final int SDL_INIT_STATUS_UNINITIALIZED = (int) 0L;

	public static int SDL_INIT_STATUS_UNINITIALIZED() {
		return SDL_INIT_STATUS_UNINITIALIZED;
	}

	private static final int SDL_INIT_STATUS_INITIALIZING = (int) 1L;

	public static int SDL_INIT_STATUS_INITIALIZING() {
		return SDL_INIT_STATUS_INITIALIZING;
	}

	private static final int SDL_INIT_STATUS_INITIALIZED = (int) 2L;

	public static int SDL_INIT_STATUS_INITIALIZED() {
		return SDL_INIT_STATUS_INITIALIZED;
	}

	private static final int SDL_INIT_STATUS_UNINITIALIZING = (int) 3L;

	public static int SDL_INIT_STATUS_UNINITIALIZING() {
		return SDL_INIT_STATUS_UNINITIALIZING;
	}

	private static class SDL_ShouldInit {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ShouldInit");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ShouldInit$descriptor() {
		return SDL_ShouldInit.DESC;
	}

	public static MethodHandle SDL_ShouldInit$handle() {
		return SDL_ShouldInit.HANDLE;
	}

	public static MemorySegment SDL_ShouldInit$address() {
		return SDL_ShouldInit.ADDR;
	}

	public static boolean SDL_ShouldInit(MemorySegment state) {
		var mh$ = SDL_ShouldInit.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ShouldInit", state);
			}
			return (boolean) mh$.invokeExact(state);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ShouldQuit {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ShouldQuit");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ShouldQuit$descriptor() {
		return SDL_ShouldQuit.DESC;
	}

	public static MethodHandle SDL_ShouldQuit$handle() {
		return SDL_ShouldQuit.HANDLE;
	}

	public static MemorySegment SDL_ShouldQuit$address() {
		return SDL_ShouldQuit.ADDR;
	}

	public static boolean SDL_ShouldQuit(MemorySegment state) {
		var mh$ = SDL_ShouldQuit.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ShouldQuit", state);
			}
			return (boolean) mh$.invokeExact(state);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetInitialized {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetInitialized");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetInitialized$descriptor() {
		return SDL_SetInitialized.DESC;
	}

	public static MethodHandle SDL_SetInitialized$handle() {
		return SDL_SetInitialized.HANDLE;
	}

	public static MemorySegment SDL_SetInitialized$address() {
		return SDL_SetInitialized.ADDR;
	}

	public static void SDL_SetInitialized(MemorySegment state, boolean initialized) {
		var mh$ = SDL_SetInitialized.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetInitialized", state, initialized);
			}
			mh$.invokeExact(state, initialized);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static final int SDL_IO_STATUS_READY = (int) 0L;

	public static int SDL_IO_STATUS_READY() {
		return SDL_IO_STATUS_READY;
	}

	private static final int SDL_IO_STATUS_ERROR = (int) 1L;

	public static int SDL_IO_STATUS_ERROR() {
		return SDL_IO_STATUS_ERROR;
	}

	private static final int SDL_IO_STATUS_EOF = (int) 2L;

	public static int SDL_IO_STATUS_EOF() {
		return SDL_IO_STATUS_EOF;
	}

	private static final int SDL_IO_STATUS_NOT_READY = (int) 3L;

	public static int SDL_IO_STATUS_NOT_READY() {
		return SDL_IO_STATUS_NOT_READY;
	}

	private static final int SDL_IO_STATUS_READONLY = (int) 4L;

	public static int SDL_IO_STATUS_READONLY() {
		return SDL_IO_STATUS_READONLY;
	}

	private static final int SDL_IO_STATUS_WRITEONLY = (int) 5L;

	public static int SDL_IO_STATUS_WRITEONLY() {
		return SDL_IO_STATUS_WRITEONLY;
	}

	private static final int SDL_IO_SEEK_SET = (int) 0L;

	public static int SDL_IO_SEEK_SET() {
		return SDL_IO_SEEK_SET;
	}

	private static final int SDL_IO_SEEK_CUR = (int) 1L;

	public static int SDL_IO_SEEK_CUR() {
		return SDL_IO_SEEK_CUR;
	}

	private static final int SDL_IO_SEEK_END = (int) 2L;

	public static int SDL_IO_SEEK_END() {
		return SDL_IO_SEEK_END;
	}

	private static class SDL_IOFromFile {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_IOFromFile");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_IOFromFile$descriptor() {
		return SDL_IOFromFile.DESC;
	}

	public static MethodHandle SDL_IOFromFile$handle() {
		return SDL_IOFromFile.HANDLE;
	}

	public static MemorySegment SDL_IOFromFile$address() {
		return SDL_IOFromFile.ADDR;
	}

	public static MemorySegment SDL_IOFromFile(MemorySegment file, MemorySegment mode) {
		var mh$ = SDL_IOFromFile.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_IOFromFile", file, mode);
			}
			return (MemorySegment) mh$.invokeExact(file, mode);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_IOFromMem {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_IOFromMem");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_IOFromMem$descriptor() {
		return SDL_IOFromMem.DESC;
	}

	public static MethodHandle SDL_IOFromMem$handle() {
		return SDL_IOFromMem.HANDLE;
	}

	public static MemorySegment SDL_IOFromMem$address() {
		return SDL_IOFromMem.ADDR;
	}

	public static MemorySegment SDL_IOFromMem(MemorySegment mem, long size) {
		var mh$ = SDL_IOFromMem.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_IOFromMem", mem, size);
			}
			return (MemorySegment) mh$.invokeExact(mem, size);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_IOFromConstMem {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_IOFromConstMem");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_IOFromConstMem$descriptor() {
		return SDL_IOFromConstMem.DESC;
	}

	public static MethodHandle SDL_IOFromConstMem$handle() {
		return SDL_IOFromConstMem.HANDLE;
	}

	public static MemorySegment SDL_IOFromConstMem$address() {
		return SDL_IOFromConstMem.ADDR;
	}

	public static MemorySegment SDL_IOFromConstMem(MemorySegment mem, long size) {
		var mh$ = SDL_IOFromConstMem.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_IOFromConstMem", mem, size);
			}
			return (MemorySegment) mh$.invokeExact(mem, size);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_IOFromDynamicMem {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_IOFromDynamicMem");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_IOFromDynamicMem$descriptor() {
		return SDL_IOFromDynamicMem.DESC;
	}

	public static MethodHandle SDL_IOFromDynamicMem$handle() {
		return SDL_IOFromDynamicMem.HANDLE;
	}

	public static MemorySegment SDL_IOFromDynamicMem$address() {
		return SDL_IOFromDynamicMem.ADDR;
	}

	public static MemorySegment SDL_IOFromDynamicMem() {
		var mh$ = SDL_IOFromDynamicMem.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_IOFromDynamicMem");
			}
			return (MemorySegment) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_OpenIO {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_OpenIO");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_OpenIO$descriptor() {
		return SDL_OpenIO.DESC;
	}

	public static MethodHandle SDL_OpenIO$handle() {
		return SDL_OpenIO.HANDLE;
	}

	public static MemorySegment SDL_OpenIO$address() {
		return SDL_OpenIO.ADDR;
	}

	public static MemorySegment SDL_OpenIO(MemorySegment iface, MemorySegment userdata) {
		var mh$ = SDL_OpenIO.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_OpenIO", iface, userdata);
			}
			return (MemorySegment) mh$.invokeExact(iface, userdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CloseIO {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CloseIO");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CloseIO$descriptor() {
		return SDL_CloseIO.DESC;
	}

	public static MethodHandle SDL_CloseIO$handle() {
		return SDL_CloseIO.HANDLE;
	}

	public static MemorySegment SDL_CloseIO$address() {
		return SDL_CloseIO.ADDR;
	}

	public static boolean SDL_CloseIO(MemorySegment context) {
		var mh$ = SDL_CloseIO.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CloseIO", context);
			}
			return (boolean) mh$.invokeExact(context);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetIOProperties {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetIOProperties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetIOProperties$descriptor() {
		return SDL_GetIOProperties.DESC;
	}

	public static MethodHandle SDL_GetIOProperties$handle() {
		return SDL_GetIOProperties.HANDLE;
	}

	public static MemorySegment SDL_GetIOProperties$address() {
		return SDL_GetIOProperties.ADDR;
	}

	public static int SDL_GetIOProperties(MemorySegment context) {
		var mh$ = SDL_GetIOProperties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetIOProperties", context);
			}
			return (int) mh$.invokeExact(context);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetIOStatus {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetIOStatus");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetIOStatus$descriptor() {
		return SDL_GetIOStatus.DESC;
	}

	public static MethodHandle SDL_GetIOStatus$handle() {
		return SDL_GetIOStatus.HANDLE;
	}

	public static MemorySegment SDL_GetIOStatus$address() {
		return SDL_GetIOStatus.ADDR;
	}

	public static int SDL_GetIOStatus(MemorySegment context) {
		var mh$ = SDL_GetIOStatus.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetIOStatus", context);
			}
			return (int) mh$.invokeExact(context);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetIOSize {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetIOSize");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetIOSize$descriptor() {
		return SDL_GetIOSize.DESC;
	}

	public static MethodHandle SDL_GetIOSize$handle() {
		return SDL_GetIOSize.HANDLE;
	}

	public static MemorySegment SDL_GetIOSize$address() {
		return SDL_GetIOSize.ADDR;
	}

	public static long SDL_GetIOSize(MemorySegment context) {
		var mh$ = SDL_GetIOSize.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetIOSize", context);
			}
			return (long) mh$.invokeExact(context);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SeekIO {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_POINTER,
				SDL3.C_LONG,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SeekIO");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SeekIO$descriptor() {
		return SDL_SeekIO.DESC;
	}

	public static MethodHandle SDL_SeekIO$handle() {
		return SDL_SeekIO.HANDLE;
	}

	public static MemorySegment SDL_SeekIO$address() {
		return SDL_SeekIO.ADDR;
	}

	public static long SDL_SeekIO(MemorySegment context, long offset, int whence) {
		var mh$ = SDL_SeekIO.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SeekIO", context, offset, whence);
			}
			return (long) mh$.invokeExact(context, offset, whence);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_TellIO {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_TellIO");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_TellIO$descriptor() {
		return SDL_TellIO.DESC;
	}

	public static MethodHandle SDL_TellIO$handle() {
		return SDL_TellIO.HANDLE;
	}

	public static MemorySegment SDL_TellIO$address() {
		return SDL_TellIO.ADDR;
	}

	public static long SDL_TellIO(MemorySegment context) {
		var mh$ = SDL_TellIO.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_TellIO", context);
			}
			return (long) mh$.invokeExact(context);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ReadIO {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ReadIO");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ReadIO$descriptor() {
		return SDL_ReadIO.DESC;
	}

	public static MethodHandle SDL_ReadIO$handle() {
		return SDL_ReadIO.HANDLE;
	}

	public static MemorySegment SDL_ReadIO$address() {
		return SDL_ReadIO.ADDR;
	}

	public static long SDL_ReadIO(MemorySegment context, MemorySegment ptr, long size) {
		var mh$ = SDL_ReadIO.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ReadIO", context, ptr, size);
			}
			return (long) mh$.invokeExact(context, ptr, size);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WriteIO {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WriteIO");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WriteIO$descriptor() {
		return SDL_WriteIO.DESC;
	}

	public static MethodHandle SDL_WriteIO$handle() {
		return SDL_WriteIO.HANDLE;
	}

	public static MemorySegment SDL_WriteIO$address() {
		return SDL_WriteIO.ADDR;
	}

	public static long SDL_WriteIO(MemorySegment context, MemorySegment ptr, long size) {
		var mh$ = SDL_WriteIO.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WriteIO", context, ptr, size);
			}
			return (long) mh$.invokeExact(context, ptr, size);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}


	private static class SDL_IOvprintf {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_IOvprintf");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_IOvprintf$descriptor() {
		return SDL_IOvprintf.DESC;
	}

	public static MethodHandle SDL_IOvprintf$handle() {
		return SDL_IOvprintf.HANDLE;
	}

	public static MemorySegment SDL_IOvprintf$address() {
		return SDL_IOvprintf.ADDR;
	}

	public static long SDL_IOvprintf(MemorySegment context, MemorySegment fmt, MemorySegment ap) {
		var mh$ = SDL_IOvprintf.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_IOvprintf", context, fmt, ap);
			}
			return (long) mh$.invokeExact(context, fmt, ap);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_FlushIO {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_FlushIO");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_FlushIO$descriptor() {
		return SDL_FlushIO.DESC;
	}

	public static MethodHandle SDL_FlushIO$handle() {
		return SDL_FlushIO.HANDLE;
	}

	public static MemorySegment SDL_FlushIO$address() {
		return SDL_FlushIO.ADDR;
	}

	public static boolean SDL_FlushIO(MemorySegment context) {
		var mh$ = SDL_FlushIO.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_FlushIO", context);
			}
			return (boolean) mh$.invokeExact(context);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_LoadFile_IO {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_LoadFile_IO");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_LoadFile_IO$descriptor() {
		return SDL_LoadFile_IO.DESC;
	}

	public static MethodHandle SDL_LoadFile_IO$handle() {
		return SDL_LoadFile_IO.HANDLE;
	}

	public static MemorySegment SDL_LoadFile_IO$address() {
		return SDL_LoadFile_IO.ADDR;
	}

	public static MemorySegment SDL_LoadFile_IO(MemorySegment src, MemorySegment datasize, boolean closeio) {
		var mh$ = SDL_LoadFile_IO.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_LoadFile_IO", src, datasize, closeio);
			}
			return (MemorySegment) mh$.invokeExact(src, datasize, closeio);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_LoadFile {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_LoadFile");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_LoadFile$descriptor() {
		return SDL_LoadFile.DESC;
	}

	public static MethodHandle SDL_LoadFile$handle() {
		return SDL_LoadFile.HANDLE;
	}

	public static MemorySegment SDL_LoadFile$address() {
		return SDL_LoadFile.ADDR;
	}

	public static MemorySegment SDL_LoadFile(MemorySegment file, MemorySegment datasize) {
		var mh$ = SDL_LoadFile.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_LoadFile", file, datasize);
			}
			return (MemorySegment) mh$.invokeExact(file, datasize);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SaveFile_IO {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SaveFile_IO");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SaveFile_IO$descriptor() {
		return SDL_SaveFile_IO.DESC;
	}

	public static MethodHandle SDL_SaveFile_IO$handle() {
		return SDL_SaveFile_IO.HANDLE;
	}

	public static MemorySegment SDL_SaveFile_IO$address() {
		return SDL_SaveFile_IO.ADDR;
	}

	public static boolean SDL_SaveFile_IO(MemorySegment src, MemorySegment data, long datasize, boolean closeio) {
		var mh$ = SDL_SaveFile_IO.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SaveFile_IO", src, data, datasize, closeio);
			}
			return (boolean) mh$.invokeExact(src, data, datasize, closeio);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SaveFile {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SaveFile");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SaveFile$descriptor() {
		return SDL_SaveFile.DESC;
	}

	public static MethodHandle SDL_SaveFile$handle() {
		return SDL_SaveFile.HANDLE;
	}

	public static MemorySegment SDL_SaveFile$address() {
		return SDL_SaveFile.ADDR;
	}

	public static boolean SDL_SaveFile(MemorySegment file, MemorySegment data, long datasize) {
		var mh$ = SDL_SaveFile.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SaveFile", file, data, datasize);
			}
			return (boolean) mh$.invokeExact(file, data, datasize);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ReadU8 {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ReadU8");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ReadU8$descriptor() {
		return SDL_ReadU8.DESC;
	}

	public static MethodHandle SDL_ReadU8$handle() {
		return SDL_ReadU8.HANDLE;
	}

	public static MemorySegment SDL_ReadU8$address() {
		return SDL_ReadU8.ADDR;
	}

	public static boolean SDL_ReadU8(MemorySegment src, MemorySegment value) {
		var mh$ = SDL_ReadU8.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ReadU8", src, value);
			}
			return (boolean) mh$.invokeExact(src, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ReadS8 {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ReadS8");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ReadS8$descriptor() {
		return SDL_ReadS8.DESC;
	}

	public static MethodHandle SDL_ReadS8$handle() {
		return SDL_ReadS8.HANDLE;
	}

	public static MemorySegment SDL_ReadS8$address() {
		return SDL_ReadS8.ADDR;
	}

	public static boolean SDL_ReadS8(MemorySegment src, MemorySegment value) {
		var mh$ = SDL_ReadS8.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ReadS8", src, value);
			}
			return (boolean) mh$.invokeExact(src, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ReadU16LE {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ReadU16LE");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ReadU16LE$descriptor() {
		return SDL_ReadU16LE.DESC;
	}

	public static MethodHandle SDL_ReadU16LE$handle() {
		return SDL_ReadU16LE.HANDLE;
	}

	public static MemorySegment SDL_ReadU16LE$address() {
		return SDL_ReadU16LE.ADDR;
	}

	public static boolean SDL_ReadU16LE(MemorySegment src, MemorySegment value) {
		var mh$ = SDL_ReadU16LE.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ReadU16LE", src, value);
			}
			return (boolean) mh$.invokeExact(src, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ReadS16LE {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ReadS16LE");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ReadS16LE$descriptor() {
		return SDL_ReadS16LE.DESC;
	}

	public static MethodHandle SDL_ReadS16LE$handle() {
		return SDL_ReadS16LE.HANDLE;
	}

	public static MemorySegment SDL_ReadS16LE$address() {
		return SDL_ReadS16LE.ADDR;
	}

	public static boolean SDL_ReadS16LE(MemorySegment src, MemorySegment value) {
		var mh$ = SDL_ReadS16LE.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ReadS16LE", src, value);
			}
			return (boolean) mh$.invokeExact(src, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ReadU16BE {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ReadU16BE");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ReadU16BE$descriptor() {
		return SDL_ReadU16BE.DESC;
	}

	public static MethodHandle SDL_ReadU16BE$handle() {
		return SDL_ReadU16BE.HANDLE;
	}

	public static MemorySegment SDL_ReadU16BE$address() {
		return SDL_ReadU16BE.ADDR;
	}

	public static boolean SDL_ReadU16BE(MemorySegment src, MemorySegment value) {
		var mh$ = SDL_ReadU16BE.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ReadU16BE", src, value);
			}
			return (boolean) mh$.invokeExact(src, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ReadS16BE {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ReadS16BE");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ReadS16BE$descriptor() {
		return SDL_ReadS16BE.DESC;
	}

	public static MethodHandle SDL_ReadS16BE$handle() {
		return SDL_ReadS16BE.HANDLE;
	}

	public static MemorySegment SDL_ReadS16BE$address() {
		return SDL_ReadS16BE.ADDR;
	}

	public static boolean SDL_ReadS16BE(MemorySegment src, MemorySegment value) {
		var mh$ = SDL_ReadS16BE.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ReadS16BE", src, value);
			}
			return (boolean) mh$.invokeExact(src, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ReadU32LE {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ReadU32LE");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ReadU32LE$descriptor() {
		return SDL_ReadU32LE.DESC;
	}

	public static MethodHandle SDL_ReadU32LE$handle() {
		return SDL_ReadU32LE.HANDLE;
	}

	public static MemorySegment SDL_ReadU32LE$address() {
		return SDL_ReadU32LE.ADDR;
	}

	public static boolean SDL_ReadU32LE(MemorySegment src, MemorySegment value) {
		var mh$ = SDL_ReadU32LE.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ReadU32LE", src, value);
			}
			return (boolean) mh$.invokeExact(src, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ReadS32LE {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ReadS32LE");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ReadS32LE$descriptor() {
		return SDL_ReadS32LE.DESC;
	}

	public static MethodHandle SDL_ReadS32LE$handle() {
		return SDL_ReadS32LE.HANDLE;
	}

	public static MemorySegment SDL_ReadS32LE$address() {
		return SDL_ReadS32LE.ADDR;
	}

	public static boolean SDL_ReadS32LE(MemorySegment src, MemorySegment value) {
		var mh$ = SDL_ReadS32LE.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ReadS32LE", src, value);
			}
			return (boolean) mh$.invokeExact(src, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ReadU32BE {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ReadU32BE");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ReadU32BE$descriptor() {
		return SDL_ReadU32BE.DESC;
	}

	public static MethodHandle SDL_ReadU32BE$handle() {
		return SDL_ReadU32BE.HANDLE;
	}

	public static MemorySegment SDL_ReadU32BE$address() {
		return SDL_ReadU32BE.ADDR;
	}

	public static boolean SDL_ReadU32BE(MemorySegment src, MemorySegment value) {
		var mh$ = SDL_ReadU32BE.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ReadU32BE", src, value);
			}
			return (boolean) mh$.invokeExact(src, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ReadS32BE {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ReadS32BE");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ReadS32BE$descriptor() {
		return SDL_ReadS32BE.DESC;
	}

	public static MethodHandle SDL_ReadS32BE$handle() {
		return SDL_ReadS32BE.HANDLE;
	}

	public static MemorySegment SDL_ReadS32BE$address() {
		return SDL_ReadS32BE.ADDR;
	}

	public static boolean SDL_ReadS32BE(MemorySegment src, MemorySegment value) {
		var mh$ = SDL_ReadS32BE.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ReadS32BE", src, value);
			}
			return (boolean) mh$.invokeExact(src, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ReadU64LE {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ReadU64LE");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ReadU64LE$descriptor() {
		return SDL_ReadU64LE.DESC;
	}

	public static MethodHandle SDL_ReadU64LE$handle() {
		return SDL_ReadU64LE.HANDLE;
	}

	public static MemorySegment SDL_ReadU64LE$address() {
		return SDL_ReadU64LE.ADDR;
	}

	public static boolean SDL_ReadU64LE(MemorySegment src, MemorySegment value) {
		var mh$ = SDL_ReadU64LE.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ReadU64LE", src, value);
			}
			return (boolean) mh$.invokeExact(src, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ReadS64LE {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ReadS64LE");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ReadS64LE$descriptor() {
		return SDL_ReadS64LE.DESC;
	}

	public static MethodHandle SDL_ReadS64LE$handle() {
		return SDL_ReadS64LE.HANDLE;
	}

	public static MemorySegment SDL_ReadS64LE$address() {
		return SDL_ReadS64LE.ADDR;
	}

	public static boolean SDL_ReadS64LE(MemorySegment src, MemorySegment value) {
		var mh$ = SDL_ReadS64LE.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ReadS64LE", src, value);
			}
			return (boolean) mh$.invokeExact(src, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ReadU64BE {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ReadU64BE");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ReadU64BE$descriptor() {
		return SDL_ReadU64BE.DESC;
	}

	public static MethodHandle SDL_ReadU64BE$handle() {
		return SDL_ReadU64BE.HANDLE;
	}

	public static MemorySegment SDL_ReadU64BE$address() {
		return SDL_ReadU64BE.ADDR;
	}

	public static boolean SDL_ReadU64BE(MemorySegment src, MemorySegment value) {
		var mh$ = SDL_ReadU64BE.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ReadU64BE", src, value);
			}
			return (boolean) mh$.invokeExact(src, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ReadS64BE {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ReadS64BE");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ReadS64BE$descriptor() {
		return SDL_ReadS64BE.DESC;
	}

	public static MethodHandle SDL_ReadS64BE$handle() {
		return SDL_ReadS64BE.HANDLE;
	}

	public static MemorySegment SDL_ReadS64BE$address() {
		return SDL_ReadS64BE.ADDR;
	}

	public static boolean SDL_ReadS64BE(MemorySegment src, MemorySegment value) {
		var mh$ = SDL_ReadS64BE.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ReadS64BE", src, value);
			}
			return (boolean) mh$.invokeExact(src, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WriteU8 {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_CHAR
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WriteU8");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WriteU8$descriptor() {
		return SDL_WriteU8.DESC;
	}

	public static MethodHandle SDL_WriteU8$handle() {
		return SDL_WriteU8.HANDLE;
	}

	public static MemorySegment SDL_WriteU8$address() {
		return SDL_WriteU8.ADDR;
	}

	public static boolean SDL_WriteU8(MemorySegment dst, byte value) {
		var mh$ = SDL_WriteU8.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WriteU8", dst, value);
			}
			return (boolean) mh$.invokeExact(dst, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WriteS8 {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_CHAR
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WriteS8");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WriteS8$descriptor() {
		return SDL_WriteS8.DESC;
	}

	public static MethodHandle SDL_WriteS8$handle() {
		return SDL_WriteS8.HANDLE;
	}

	public static MemorySegment SDL_WriteS8$address() {
		return SDL_WriteS8.ADDR;
	}

	public static boolean SDL_WriteS8(MemorySegment dst, byte value) {
		var mh$ = SDL_WriteS8.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WriteS8", dst, value);
			}
			return (boolean) mh$.invokeExact(dst, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WriteU16LE {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_SHORT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WriteU16LE");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WriteU16LE$descriptor() {
		return SDL_WriteU16LE.DESC;
	}

	public static MethodHandle SDL_WriteU16LE$handle() {
		return SDL_WriteU16LE.HANDLE;
	}

	public static MemorySegment SDL_WriteU16LE$address() {
		return SDL_WriteU16LE.ADDR;
	}

	public static boolean SDL_WriteU16LE(MemorySegment dst, short value) {
		var mh$ = SDL_WriteU16LE.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WriteU16LE", dst, value);
			}
			return (boolean) mh$.invokeExact(dst, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WriteS16LE {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_SHORT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WriteS16LE");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WriteS16LE$descriptor() {
		return SDL_WriteS16LE.DESC;
	}

	public static MethodHandle SDL_WriteS16LE$handle() {
		return SDL_WriteS16LE.HANDLE;
	}

	public static MemorySegment SDL_WriteS16LE$address() {
		return SDL_WriteS16LE.ADDR;
	}

	public static boolean SDL_WriteS16LE(MemorySegment dst, short value) {
		var mh$ = SDL_WriteS16LE.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WriteS16LE", dst, value);
			}
			return (boolean) mh$.invokeExact(dst, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WriteU16BE {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_SHORT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WriteU16BE");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WriteU16BE$descriptor() {
		return SDL_WriteU16BE.DESC;
	}

	public static MethodHandle SDL_WriteU16BE$handle() {
		return SDL_WriteU16BE.HANDLE;
	}

	public static MemorySegment SDL_WriteU16BE$address() {
		return SDL_WriteU16BE.ADDR;
	}

	public static boolean SDL_WriteU16BE(MemorySegment dst, short value) {
		var mh$ = SDL_WriteU16BE.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WriteU16BE", dst, value);
			}
			return (boolean) mh$.invokeExact(dst, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WriteS16BE {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_SHORT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WriteS16BE");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WriteS16BE$descriptor() {
		return SDL_WriteS16BE.DESC;
	}

	public static MethodHandle SDL_WriteS16BE$handle() {
		return SDL_WriteS16BE.HANDLE;
	}

	public static MemorySegment SDL_WriteS16BE$address() {
		return SDL_WriteS16BE.ADDR;
	}

	public static boolean SDL_WriteS16BE(MemorySegment dst, short value) {
		var mh$ = SDL_WriteS16BE.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WriteS16BE", dst, value);
			}
			return (boolean) mh$.invokeExact(dst, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WriteU32LE {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WriteU32LE");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WriteU32LE$descriptor() {
		return SDL_WriteU32LE.DESC;
	}

	public static MethodHandle SDL_WriteU32LE$handle() {
		return SDL_WriteU32LE.HANDLE;
	}

	public static MemorySegment SDL_WriteU32LE$address() {
		return SDL_WriteU32LE.ADDR;
	}

	public static boolean SDL_WriteU32LE(MemorySegment dst, int value) {
		var mh$ = SDL_WriteU32LE.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WriteU32LE", dst, value);
			}
			return (boolean) mh$.invokeExact(dst, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WriteS32LE {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WriteS32LE");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WriteS32LE$descriptor() {
		return SDL_WriteS32LE.DESC;
	}

	public static MethodHandle SDL_WriteS32LE$handle() {
		return SDL_WriteS32LE.HANDLE;
	}

	public static MemorySegment SDL_WriteS32LE$address() {
		return SDL_WriteS32LE.ADDR;
	}

	public static boolean SDL_WriteS32LE(MemorySegment dst, int value) {
		var mh$ = SDL_WriteS32LE.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WriteS32LE", dst, value);
			}
			return (boolean) mh$.invokeExact(dst, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WriteU32BE {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WriteU32BE");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WriteU32BE$descriptor() {
		return SDL_WriteU32BE.DESC;
	}

	public static MethodHandle SDL_WriteU32BE$handle() {
		return SDL_WriteU32BE.HANDLE;
	}

	public static MemorySegment SDL_WriteU32BE$address() {
		return SDL_WriteU32BE.ADDR;
	}

	public static boolean SDL_WriteU32BE(MemorySegment dst, int value) {
		var mh$ = SDL_WriteU32BE.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WriteU32BE", dst, value);
			}
			return (boolean) mh$.invokeExact(dst, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WriteS32BE {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WriteS32BE");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WriteS32BE$descriptor() {
		return SDL_WriteS32BE.DESC;
	}

	public static MethodHandle SDL_WriteS32BE$handle() {
		return SDL_WriteS32BE.HANDLE;
	}

	public static MemorySegment SDL_WriteS32BE$address() {
		return SDL_WriteS32BE.ADDR;
	}

	public static boolean SDL_WriteS32BE(MemorySegment dst, int value) {
		var mh$ = SDL_WriteS32BE.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WriteS32BE", dst, value);
			}
			return (boolean) mh$.invokeExact(dst, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WriteU64LE {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WriteU64LE");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WriteU64LE$descriptor() {
		return SDL_WriteU64LE.DESC;
	}

	public static MethodHandle SDL_WriteU64LE$handle() {
		return SDL_WriteU64LE.HANDLE;
	}

	public static MemorySegment SDL_WriteU64LE$address() {
		return SDL_WriteU64LE.ADDR;
	}

	public static boolean SDL_WriteU64LE(MemorySegment dst, long value) {
		var mh$ = SDL_WriteU64LE.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WriteU64LE", dst, value);
			}
			return (boolean) mh$.invokeExact(dst, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WriteS64LE {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WriteS64LE");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WriteS64LE$descriptor() {
		return SDL_WriteS64LE.DESC;
	}

	public static MethodHandle SDL_WriteS64LE$handle() {
		return SDL_WriteS64LE.HANDLE;
	}

	public static MemorySegment SDL_WriteS64LE$address() {
		return SDL_WriteS64LE.ADDR;
	}

	public static boolean SDL_WriteS64LE(MemorySegment dst, long value) {
		var mh$ = SDL_WriteS64LE.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WriteS64LE", dst, value);
			}
			return (boolean) mh$.invokeExact(dst, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WriteU64BE {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WriteU64BE");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WriteU64BE$descriptor() {
		return SDL_WriteU64BE.DESC;
	}

	public static MethodHandle SDL_WriteU64BE$handle() {
		return SDL_WriteU64BE.HANDLE;
	}

	public static MemorySegment SDL_WriteU64BE$address() {
		return SDL_WriteU64BE.ADDR;
	}

	public static boolean SDL_WriteU64BE(MemorySegment dst, long value) {
		var mh$ = SDL_WriteU64BE.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WriteU64BE", dst, value);
			}
			return (boolean) mh$.invokeExact(dst, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WriteS64BE {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WriteS64BE");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WriteS64BE$descriptor() {
		return SDL_WriteS64BE.DESC;
	}

	public static MethodHandle SDL_WriteS64BE$handle() {
		return SDL_WriteS64BE.HANDLE;
	}

	public static MemorySegment SDL_WriteS64BE$address() {
		return SDL_WriteS64BE.ADDR;
	}

	public static boolean SDL_WriteS64BE(MemorySegment dst, long value) {
		var mh$ = SDL_WriteS64BE.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WriteS64BE", dst, value);
			}
			return (boolean) mh$.invokeExact(dst, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static final int SDL_AUDIO_UNKNOWN = (int) 0L;

	public static int SDL_AUDIO_UNKNOWN() {
		return SDL_AUDIO_UNKNOWN;
	}

	private static final int SDL_AUDIO_U8 = (int) 8L;

	public static int SDL_AUDIO_U8() {
		return SDL_AUDIO_U8;
	}

	private static final int SDL_AUDIO_S8 = (int) 32776L;

	public static int SDL_AUDIO_S8() {
		return SDL_AUDIO_S8;
	}

	private static final int SDL_AUDIO_S16LE = (int) 32784L;

	public static int SDL_AUDIO_S16LE() {
		return SDL_AUDIO_S16LE;
	}

	private static final int SDL_AUDIO_S16BE = (int) 36880L;

	public static int SDL_AUDIO_S16BE() {
		return SDL_AUDIO_S16BE;
	}

	private static final int SDL_AUDIO_S32LE = (int) 32800L;

	public static int SDL_AUDIO_S32LE() {
		return SDL_AUDIO_S32LE;
	}

	private static final int SDL_AUDIO_S32BE = (int) 36896L;

	public static int SDL_AUDIO_S32BE() {
		return SDL_AUDIO_S32BE;
	}

	private static final int SDL_AUDIO_F32LE = (int) 33056L;

	public static int SDL_AUDIO_F32LE() {
		return SDL_AUDIO_F32LE;
	}

	private static final int SDL_AUDIO_F32BE = (int) 37152L;

	public static int SDL_AUDIO_F32BE() {
		return SDL_AUDIO_F32BE;
	}

	private static final int SDL_AUDIO_S16 = (int) 32784L;

	public static int SDL_AUDIO_S16() {
		return SDL_AUDIO_S16;
	}

	private static final int SDL_AUDIO_S32 = (int) 32800L;

	public static int SDL_AUDIO_S32() {
		return SDL_AUDIO_S32;
	}

	private static final int SDL_AUDIO_F32 = (int) 33056L;

	public static int SDL_AUDIO_F32() {
		return SDL_AUDIO_F32;
	}

	public static OfInt SDL_AudioDeviceID = SDL3.C_INT;

	private static class SDL_GetNumAudioDrivers {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetNumAudioDrivers");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetNumAudioDrivers$descriptor() {
		return SDL_GetNumAudioDrivers.DESC;
	}

	public static MethodHandle SDL_GetNumAudioDrivers$handle() {
		return SDL_GetNumAudioDrivers.HANDLE;
	}

	public static MemorySegment SDL_GetNumAudioDrivers$address() {
		return SDL_GetNumAudioDrivers.ADDR;
	}

	public static int SDL_GetNumAudioDrivers() {
		var mh$ = SDL_GetNumAudioDrivers.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetNumAudioDrivers");
			}
			return (int) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetAudioDriver {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetAudioDriver");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetAudioDriver$descriptor() {
		return SDL_GetAudioDriver.DESC;
	}

	public static MethodHandle SDL_GetAudioDriver$handle() {
		return SDL_GetAudioDriver.HANDLE;
	}

	public static MemorySegment SDL_GetAudioDriver$address() {
		return SDL_GetAudioDriver.ADDR;
	}

	public static MemorySegment SDL_GetAudioDriver(int index) {
		var mh$ = SDL_GetAudioDriver.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetAudioDriver", index);
			}
			return (MemorySegment) mh$.invokeExact(index);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetCurrentAudioDriver {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetCurrentAudioDriver");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetCurrentAudioDriver$descriptor() {
		return SDL_GetCurrentAudioDriver.DESC;
	}

	public static MethodHandle SDL_GetCurrentAudioDriver$handle() {
		return SDL_GetCurrentAudioDriver.HANDLE;
	}

	public static MemorySegment SDL_GetCurrentAudioDriver$address() {
		return SDL_GetCurrentAudioDriver.ADDR;
	}

	public static MemorySegment SDL_GetCurrentAudioDriver() {
		var mh$ = SDL_GetCurrentAudioDriver.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetCurrentAudioDriver");
			}
			return (MemorySegment) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetAudioPlaybackDevices {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetAudioPlaybackDevices");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetAudioPlaybackDevices$descriptor() {
		return SDL_GetAudioPlaybackDevices.DESC;
	}

	public static MethodHandle SDL_GetAudioPlaybackDevices$handle() {
		return SDL_GetAudioPlaybackDevices.HANDLE;
	}

	public static MemorySegment SDL_GetAudioPlaybackDevices$address() {
		return SDL_GetAudioPlaybackDevices.ADDR;
	}

	public static MemorySegment SDL_GetAudioPlaybackDevices(MemorySegment count) {
		var mh$ = SDL_GetAudioPlaybackDevices.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetAudioPlaybackDevices", count);
			}
			return (MemorySegment) mh$.invokeExact(count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetAudioRecordingDevices {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetAudioRecordingDevices");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetAudioRecordingDevices$descriptor() {
		return SDL_GetAudioRecordingDevices.DESC;
	}

	public static MethodHandle SDL_GetAudioRecordingDevices$handle() {
		return SDL_GetAudioRecordingDevices.HANDLE;
	}

	public static MemorySegment SDL_GetAudioRecordingDevices$address() {
		return SDL_GetAudioRecordingDevices.ADDR;
	}

	public static MemorySegment SDL_GetAudioRecordingDevices(MemorySegment count) {
		var mh$ = SDL_GetAudioRecordingDevices.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetAudioRecordingDevices", count);
			}
			return (MemorySegment) mh$.invokeExact(count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetAudioDeviceName {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetAudioDeviceName");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetAudioDeviceName$descriptor() {
		return SDL_GetAudioDeviceName.DESC;
	}

	public static MethodHandle SDL_GetAudioDeviceName$handle() {
		return SDL_GetAudioDeviceName.HANDLE;
	}

	public static MemorySegment SDL_GetAudioDeviceName$address() {
		return SDL_GetAudioDeviceName.ADDR;
	}

	public static MemorySegment SDL_GetAudioDeviceName(int devid) {
		var mh$ = SDL_GetAudioDeviceName.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetAudioDeviceName", devid);
			}
			return (MemorySegment) mh$.invokeExact(devid);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetAudioDeviceFormat {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetAudioDeviceFormat");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetAudioDeviceFormat$descriptor() {
		return SDL_GetAudioDeviceFormat.DESC;
	}

	public static MethodHandle SDL_GetAudioDeviceFormat$handle() {
		return SDL_GetAudioDeviceFormat.HANDLE;
	}

	public static MemorySegment SDL_GetAudioDeviceFormat$address() {
		return SDL_GetAudioDeviceFormat.ADDR;
	}

	public static boolean SDL_GetAudioDeviceFormat(int devid, MemorySegment spec, MemorySegment sample_frames) {
		var mh$ = SDL_GetAudioDeviceFormat.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetAudioDeviceFormat", devid, spec, sample_frames);
			}
			return (boolean) mh$.invokeExact(devid, spec, sample_frames);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetAudioDeviceChannelMap {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetAudioDeviceChannelMap");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetAudioDeviceChannelMap$descriptor() {
		return SDL_GetAudioDeviceChannelMap.DESC;
	}

	public static MethodHandle SDL_GetAudioDeviceChannelMap$handle() {
		return SDL_GetAudioDeviceChannelMap.HANDLE;
	}

	public static MemorySegment SDL_GetAudioDeviceChannelMap$address() {
		return SDL_GetAudioDeviceChannelMap.ADDR;
	}

	public static MemorySegment SDL_GetAudioDeviceChannelMap(int devid, MemorySegment count) {
		var mh$ = SDL_GetAudioDeviceChannelMap.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetAudioDeviceChannelMap", devid, count);
			}
			return (MemorySegment) mh$.invokeExact(devid, count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_OpenAudioDevice {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_OpenAudioDevice");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_OpenAudioDevice$descriptor() {
		return SDL_OpenAudioDevice.DESC;
	}

	public static MethodHandle SDL_OpenAudioDevice$handle() {
		return SDL_OpenAudioDevice.HANDLE;
	}

	public static MemorySegment SDL_OpenAudioDevice$address() {
		return SDL_OpenAudioDevice.ADDR;
	}

	public static int SDL_OpenAudioDevice(int devid, MemorySegment spec) {
		var mh$ = SDL_OpenAudioDevice.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_OpenAudioDevice", devid, spec);
			}
			return (int) mh$.invokeExact(devid, spec);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_IsAudioDevicePhysical {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_IsAudioDevicePhysical");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_IsAudioDevicePhysical$descriptor() {
		return SDL_IsAudioDevicePhysical.DESC;
	}

	public static MethodHandle SDL_IsAudioDevicePhysical$handle() {
		return SDL_IsAudioDevicePhysical.HANDLE;
	}

	public static MemorySegment SDL_IsAudioDevicePhysical$address() {
		return SDL_IsAudioDevicePhysical.ADDR;
	}

	public static boolean SDL_IsAudioDevicePhysical(int devid) {
		var mh$ = SDL_IsAudioDevicePhysical.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_IsAudioDevicePhysical", devid);
			}
			return (boolean) mh$.invokeExact(devid);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_IsAudioDevicePlayback {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_IsAudioDevicePlayback");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_IsAudioDevicePlayback$descriptor() {
		return SDL_IsAudioDevicePlayback.DESC;
	}

	public static MethodHandle SDL_IsAudioDevicePlayback$handle() {
		return SDL_IsAudioDevicePlayback.HANDLE;
	}

	public static MemorySegment SDL_IsAudioDevicePlayback$address() {
		return SDL_IsAudioDevicePlayback.ADDR;
	}

	public static boolean SDL_IsAudioDevicePlayback(int devid) {
		var mh$ = SDL_IsAudioDevicePlayback.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_IsAudioDevicePlayback", devid);
			}
			return (boolean) mh$.invokeExact(devid);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_PauseAudioDevice {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_PauseAudioDevice");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_PauseAudioDevice$descriptor() {
		return SDL_PauseAudioDevice.DESC;
	}

	public static MethodHandle SDL_PauseAudioDevice$handle() {
		return SDL_PauseAudioDevice.HANDLE;
	}

	public static MemorySegment SDL_PauseAudioDevice$address() {
		return SDL_PauseAudioDevice.ADDR;
	}

	public static boolean SDL_PauseAudioDevice(int devid) {
		var mh$ = SDL_PauseAudioDevice.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_PauseAudioDevice", devid);
			}
			return (boolean) mh$.invokeExact(devid);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ResumeAudioDevice {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ResumeAudioDevice");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ResumeAudioDevice$descriptor() {
		return SDL_ResumeAudioDevice.DESC;
	}

	public static MethodHandle SDL_ResumeAudioDevice$handle() {
		return SDL_ResumeAudioDevice.HANDLE;
	}

	public static MemorySegment SDL_ResumeAudioDevice$address() {
		return SDL_ResumeAudioDevice.ADDR;
	}

	public static boolean SDL_ResumeAudioDevice(int devid) {
		var mh$ = SDL_ResumeAudioDevice.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ResumeAudioDevice", devid);
			}
			return (boolean) mh$.invokeExact(devid);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_AudioDevicePaused {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_AudioDevicePaused");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_AudioDevicePaused$descriptor() {
		return SDL_AudioDevicePaused.DESC;
	}

	public static MethodHandle SDL_AudioDevicePaused$handle() {
		return SDL_AudioDevicePaused.HANDLE;
	}

	public static MemorySegment SDL_AudioDevicePaused$address() {
		return SDL_AudioDevicePaused.ADDR;
	}

	public static boolean SDL_AudioDevicePaused(int devid) {
		var mh$ = SDL_AudioDevicePaused.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_AudioDevicePaused", devid);
			}
			return (boolean) mh$.invokeExact(devid);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetAudioDeviceGain {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_FLOAT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetAudioDeviceGain");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetAudioDeviceGain$descriptor() {
		return SDL_GetAudioDeviceGain.DESC;
	}

	public static MethodHandle SDL_GetAudioDeviceGain$handle() {
		return SDL_GetAudioDeviceGain.HANDLE;
	}

	public static MemorySegment SDL_GetAudioDeviceGain$address() {
		return SDL_GetAudioDeviceGain.ADDR;
	}

	public static float SDL_GetAudioDeviceGain(int devid) {
		var mh$ = SDL_GetAudioDeviceGain.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetAudioDeviceGain", devid);
			}
			return (float) mh$.invokeExact(devid);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetAudioDeviceGain {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetAudioDeviceGain");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetAudioDeviceGain$descriptor() {
		return SDL_SetAudioDeviceGain.DESC;
	}

	public static MethodHandle SDL_SetAudioDeviceGain$handle() {
		return SDL_SetAudioDeviceGain.HANDLE;
	}

	public static MemorySegment SDL_SetAudioDeviceGain$address() {
		return SDL_SetAudioDeviceGain.ADDR;
	}

	public static boolean SDL_SetAudioDeviceGain(int devid, float gain) {
		var mh$ = SDL_SetAudioDeviceGain.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetAudioDeviceGain", devid, gain);
			}
			return (boolean) mh$.invokeExact(devid, gain);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CloseAudioDevice {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CloseAudioDevice");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CloseAudioDevice$descriptor() {
		return SDL_CloseAudioDevice.DESC;
	}

	public static MethodHandle SDL_CloseAudioDevice$handle() {
		return SDL_CloseAudioDevice.HANDLE;
	}

	public static MemorySegment SDL_CloseAudioDevice$address() {
		return SDL_CloseAudioDevice.ADDR;
	}

	public static void SDL_CloseAudioDevice(int devid) {
		var mh$ = SDL_CloseAudioDevice.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CloseAudioDevice", devid);
			}
			mh$.invokeExact(devid);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_BindAudioStreams {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_BindAudioStreams");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_BindAudioStreams$descriptor() {
		return SDL_BindAudioStreams.DESC;
	}

	public static MethodHandle SDL_BindAudioStreams$handle() {
		return SDL_BindAudioStreams.HANDLE;
	}

	public static MemorySegment SDL_BindAudioStreams$address() {
		return SDL_BindAudioStreams.ADDR;
	}

	public static boolean SDL_BindAudioStreams(int devid, MemorySegment streams, int num_streams) {
		var mh$ = SDL_BindAudioStreams.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_BindAudioStreams", devid, streams, num_streams);
			}
			return (boolean) mh$.invokeExact(devid, streams, num_streams);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_BindAudioStream {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_BindAudioStream");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_BindAudioStream$descriptor() {
		return SDL_BindAudioStream.DESC;
	}

	public static MethodHandle SDL_BindAudioStream$handle() {
		return SDL_BindAudioStream.HANDLE;
	}

	public static MemorySegment SDL_BindAudioStream$address() {
		return SDL_BindAudioStream.ADDR;
	}

	public static boolean SDL_BindAudioStream(int devid, MemorySegment stream) {
		var mh$ = SDL_BindAudioStream.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_BindAudioStream", devid, stream);
			}
			return (boolean) mh$.invokeExact(devid, stream);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_UnbindAudioStreams {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_UnbindAudioStreams");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_UnbindAudioStreams$descriptor() {
		return SDL_UnbindAudioStreams.DESC;
	}

	public static MethodHandle SDL_UnbindAudioStreams$handle() {
		return SDL_UnbindAudioStreams.HANDLE;
	}

	public static MemorySegment SDL_UnbindAudioStreams$address() {
		return SDL_UnbindAudioStreams.ADDR;
	}

	public static void SDL_UnbindAudioStreams(MemorySegment streams, int num_streams) {
		var mh$ = SDL_UnbindAudioStreams.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_UnbindAudioStreams", streams, num_streams);
			}
			mh$.invokeExact(streams, num_streams);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_UnbindAudioStream {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_UnbindAudioStream");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_UnbindAudioStream$descriptor() {
		return SDL_UnbindAudioStream.DESC;
	}

	public static MethodHandle SDL_UnbindAudioStream$handle() {
		return SDL_UnbindAudioStream.HANDLE;
	}

	public static MemorySegment SDL_UnbindAudioStream$address() {
		return SDL_UnbindAudioStream.ADDR;
	}

	public static void SDL_UnbindAudioStream(MemorySegment stream) {
		var mh$ = SDL_UnbindAudioStream.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_UnbindAudioStream", stream);
			}
			mh$.invokeExact(stream);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetAudioStreamDevice {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetAudioStreamDevice");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetAudioStreamDevice$descriptor() {
		return SDL_GetAudioStreamDevice.DESC;
	}

	public static MethodHandle SDL_GetAudioStreamDevice$handle() {
		return SDL_GetAudioStreamDevice.HANDLE;
	}

	public static MemorySegment SDL_GetAudioStreamDevice$address() {
		return SDL_GetAudioStreamDevice.ADDR;
	}

	public static int SDL_GetAudioStreamDevice(MemorySegment stream) {
		var mh$ = SDL_GetAudioStreamDevice.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetAudioStreamDevice", stream);
			}
			return (int) mh$.invokeExact(stream);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateAudioStream {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateAudioStream");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateAudioStream$descriptor() {
		return SDL_CreateAudioStream.DESC;
	}

	public static MethodHandle SDL_CreateAudioStream$handle() {
		return SDL_CreateAudioStream.HANDLE;
	}

	public static MemorySegment SDL_CreateAudioStream$address() {
		return SDL_CreateAudioStream.ADDR;
	}

	public static MemorySegment SDL_CreateAudioStream(MemorySegment src_spec, MemorySegment dst_spec) {
		var mh$ = SDL_CreateAudioStream.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateAudioStream", src_spec, dst_spec);
			}
			return (MemorySegment) mh$.invokeExact(src_spec, dst_spec);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetAudioStreamProperties {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetAudioStreamProperties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetAudioStreamProperties$descriptor() {
		return SDL_GetAudioStreamProperties.DESC;
	}

	public static MethodHandle SDL_GetAudioStreamProperties$handle() {
		return SDL_GetAudioStreamProperties.HANDLE;
	}

	public static MemorySegment SDL_GetAudioStreamProperties$address() {
		return SDL_GetAudioStreamProperties.ADDR;
	}

	public static int SDL_GetAudioStreamProperties(MemorySegment stream) {
		var mh$ = SDL_GetAudioStreamProperties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetAudioStreamProperties", stream);
			}
			return (int) mh$.invokeExact(stream);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetAudioStreamFormat {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetAudioStreamFormat");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetAudioStreamFormat$descriptor() {
		return SDL_GetAudioStreamFormat.DESC;
	}

	public static MethodHandle SDL_GetAudioStreamFormat$handle() {
		return SDL_GetAudioStreamFormat.HANDLE;
	}

	public static MemorySegment SDL_GetAudioStreamFormat$address() {
		return SDL_GetAudioStreamFormat.ADDR;
	}

	public static boolean SDL_GetAudioStreamFormat(MemorySegment stream, MemorySegment src_spec, MemorySegment dst_spec) {
		var mh$ = SDL_GetAudioStreamFormat.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetAudioStreamFormat", stream, src_spec, dst_spec);
			}
			return (boolean) mh$.invokeExact(stream, src_spec, dst_spec);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetAudioStreamFormat {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetAudioStreamFormat");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetAudioStreamFormat$descriptor() {
		return SDL_SetAudioStreamFormat.DESC;
	}

	public static MethodHandle SDL_SetAudioStreamFormat$handle() {
		return SDL_SetAudioStreamFormat.HANDLE;
	}

	public static MemorySegment SDL_SetAudioStreamFormat$address() {
		return SDL_SetAudioStreamFormat.ADDR;
	}

	public static boolean SDL_SetAudioStreamFormat(MemorySegment stream, MemorySegment src_spec, MemorySegment dst_spec) {
		var mh$ = SDL_SetAudioStreamFormat.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetAudioStreamFormat", stream, src_spec, dst_spec);
			}
			return (boolean) mh$.invokeExact(stream, src_spec, dst_spec);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetAudioStreamFrequencyRatio {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_FLOAT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetAudioStreamFrequencyRatio");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetAudioStreamFrequencyRatio$descriptor() {
		return SDL_GetAudioStreamFrequencyRatio.DESC;
	}

	public static MethodHandle SDL_GetAudioStreamFrequencyRatio$handle() {
		return SDL_GetAudioStreamFrequencyRatio.HANDLE;
	}

	public static MemorySegment SDL_GetAudioStreamFrequencyRatio$address() {
		return SDL_GetAudioStreamFrequencyRatio.ADDR;
	}

	public static float SDL_GetAudioStreamFrequencyRatio(MemorySegment stream) {
		var mh$ = SDL_GetAudioStreamFrequencyRatio.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetAudioStreamFrequencyRatio", stream);
			}
			return (float) mh$.invokeExact(stream);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetAudioStreamFrequencyRatio {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetAudioStreamFrequencyRatio");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetAudioStreamFrequencyRatio$descriptor() {
		return SDL_SetAudioStreamFrequencyRatio.DESC;
	}

	public static MethodHandle SDL_SetAudioStreamFrequencyRatio$handle() {
		return SDL_SetAudioStreamFrequencyRatio.HANDLE;
	}

	public static MemorySegment SDL_SetAudioStreamFrequencyRatio$address() {
		return SDL_SetAudioStreamFrequencyRatio.ADDR;
	}

	public static boolean SDL_SetAudioStreamFrequencyRatio(MemorySegment stream, float ratio) {
		var mh$ = SDL_SetAudioStreamFrequencyRatio.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetAudioStreamFrequencyRatio", stream, ratio);
			}
			return (boolean) mh$.invokeExact(stream, ratio);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetAudioStreamGain {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_FLOAT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetAudioStreamGain");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetAudioStreamGain$descriptor() {
		return SDL_GetAudioStreamGain.DESC;
	}

	public static MethodHandle SDL_GetAudioStreamGain$handle() {
		return SDL_GetAudioStreamGain.HANDLE;
	}

	public static MemorySegment SDL_GetAudioStreamGain$address() {
		return SDL_GetAudioStreamGain.ADDR;
	}

	public static float SDL_GetAudioStreamGain(MemorySegment stream) {
		var mh$ = SDL_GetAudioStreamGain.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetAudioStreamGain", stream);
			}
			return (float) mh$.invokeExact(stream);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetAudioStreamGain {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetAudioStreamGain");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetAudioStreamGain$descriptor() {
		return SDL_SetAudioStreamGain.DESC;
	}

	public static MethodHandle SDL_SetAudioStreamGain$handle() {
		return SDL_SetAudioStreamGain.HANDLE;
	}

	public static MemorySegment SDL_SetAudioStreamGain$address() {
		return SDL_SetAudioStreamGain.ADDR;
	}

	public static boolean SDL_SetAudioStreamGain(MemorySegment stream, float gain) {
		var mh$ = SDL_SetAudioStreamGain.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetAudioStreamGain", stream, gain);
			}
			return (boolean) mh$.invokeExact(stream, gain);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetAudioStreamInputChannelMap {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetAudioStreamInputChannelMap");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetAudioStreamInputChannelMap$descriptor() {
		return SDL_GetAudioStreamInputChannelMap.DESC;
	}

	public static MethodHandle SDL_GetAudioStreamInputChannelMap$handle() {
		return SDL_GetAudioStreamInputChannelMap.HANDLE;
	}

	public static MemorySegment SDL_GetAudioStreamInputChannelMap$address() {
		return SDL_GetAudioStreamInputChannelMap.ADDR;
	}

	public static MemorySegment SDL_GetAudioStreamInputChannelMap(MemorySegment stream, MemorySegment count) {
		var mh$ = SDL_GetAudioStreamInputChannelMap.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetAudioStreamInputChannelMap", stream, count);
			}
			return (MemorySegment) mh$.invokeExact(stream, count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetAudioStreamOutputChannelMap {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetAudioStreamOutputChannelMap");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetAudioStreamOutputChannelMap$descriptor() {
		return SDL_GetAudioStreamOutputChannelMap.DESC;
	}

	public static MethodHandle SDL_GetAudioStreamOutputChannelMap$handle() {
		return SDL_GetAudioStreamOutputChannelMap.HANDLE;
	}

	public static MemorySegment SDL_GetAudioStreamOutputChannelMap$address() {
		return SDL_GetAudioStreamOutputChannelMap.ADDR;
	}

	public static MemorySegment SDL_GetAudioStreamOutputChannelMap(MemorySegment stream, MemorySegment count) {
		var mh$ = SDL_GetAudioStreamOutputChannelMap.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetAudioStreamOutputChannelMap", stream, count);
			}
			return (MemorySegment) mh$.invokeExact(stream, count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetAudioStreamInputChannelMap {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetAudioStreamInputChannelMap");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetAudioStreamInputChannelMap$descriptor() {
		return SDL_SetAudioStreamInputChannelMap.DESC;
	}

	public static MethodHandle SDL_SetAudioStreamInputChannelMap$handle() {
		return SDL_SetAudioStreamInputChannelMap.HANDLE;
	}

	public static MemorySegment SDL_SetAudioStreamInputChannelMap$address() {
		return SDL_SetAudioStreamInputChannelMap.ADDR;
	}

	public static boolean SDL_SetAudioStreamInputChannelMap(MemorySegment stream, MemorySegment chmap, int count) {
		var mh$ = SDL_SetAudioStreamInputChannelMap.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetAudioStreamInputChannelMap", stream, chmap, count);
			}
			return (boolean) mh$.invokeExact(stream, chmap, count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetAudioStreamOutputChannelMap {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetAudioStreamOutputChannelMap");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetAudioStreamOutputChannelMap$descriptor() {
		return SDL_SetAudioStreamOutputChannelMap.DESC;
	}

	public static MethodHandle SDL_SetAudioStreamOutputChannelMap$handle() {
		return SDL_SetAudioStreamOutputChannelMap.HANDLE;
	}

	public static MemorySegment SDL_SetAudioStreamOutputChannelMap$address() {
		return SDL_SetAudioStreamOutputChannelMap.ADDR;
	}

	public static boolean SDL_SetAudioStreamOutputChannelMap(MemorySegment stream, MemorySegment chmap, int count) {
		var mh$ = SDL_SetAudioStreamOutputChannelMap.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetAudioStreamOutputChannelMap", stream, chmap, count);
			}
			return (boolean) mh$.invokeExact(stream, chmap, count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_PutAudioStreamData {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_PutAudioStreamData");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_PutAudioStreamData$descriptor() {
		return SDL_PutAudioStreamData.DESC;
	}

	public static MethodHandle SDL_PutAudioStreamData$handle() {
		return SDL_PutAudioStreamData.HANDLE;
	}

	public static MemorySegment SDL_PutAudioStreamData$address() {
		return SDL_PutAudioStreamData.ADDR;
	}

	public static boolean SDL_PutAudioStreamData(MemorySegment stream, MemorySegment buf, int len) {
		var mh$ = SDL_PutAudioStreamData.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_PutAudioStreamData", stream, buf, len);
			}
			return (boolean) mh$.invokeExact(stream, buf, len);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_PutAudioStreamDataNoCopy {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_PutAudioStreamDataNoCopy");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_PutAudioStreamDataNoCopy$descriptor() {
		return SDL_PutAudioStreamDataNoCopy.DESC;
	}

	public static MethodHandle SDL_PutAudioStreamDataNoCopy$handle() {
		return SDL_PutAudioStreamDataNoCopy.HANDLE;
	}

	public static MemorySegment SDL_PutAudioStreamDataNoCopy$address() {
		return SDL_PutAudioStreamDataNoCopy.ADDR;
	}

	public static boolean SDL_PutAudioStreamDataNoCopy(MemorySegment stream, MemorySegment buf, int len, MemorySegment callback, MemorySegment userdata) {
		var mh$ = SDL_PutAudioStreamDataNoCopy.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_PutAudioStreamDataNoCopy", stream, buf, len, callback, userdata);
			}
			return (boolean) mh$.invokeExact(stream, buf, len, callback, userdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_PutAudioStreamPlanarData {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_PutAudioStreamPlanarData");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_PutAudioStreamPlanarData$descriptor() {
		return SDL_PutAudioStreamPlanarData.DESC;
	}

	public static MethodHandle SDL_PutAudioStreamPlanarData$handle() {
		return SDL_PutAudioStreamPlanarData.HANDLE;
	}

	public static MemorySegment SDL_PutAudioStreamPlanarData$address() {
		return SDL_PutAudioStreamPlanarData.ADDR;
	}

	public static boolean SDL_PutAudioStreamPlanarData(MemorySegment stream, MemorySegment channel_buffers, int num_channels, int num_samples) {
		var mh$ = SDL_PutAudioStreamPlanarData.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_PutAudioStreamPlanarData", stream, channel_buffers, num_channels, num_samples);
			}
			return (boolean) mh$.invokeExact(stream, channel_buffers, num_channels, num_samples);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetAudioStreamData {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetAudioStreamData");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetAudioStreamData$descriptor() {
		return SDL_GetAudioStreamData.DESC;
	}

	public static MethodHandle SDL_GetAudioStreamData$handle() {
		return SDL_GetAudioStreamData.HANDLE;
	}

	public static MemorySegment SDL_GetAudioStreamData$address() {
		return SDL_GetAudioStreamData.ADDR;
	}

	public static int SDL_GetAudioStreamData(MemorySegment stream, MemorySegment buf, int len) {
		var mh$ = SDL_GetAudioStreamData.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetAudioStreamData", stream, buf, len);
			}
			return (int) mh$.invokeExact(stream, buf, len);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetAudioStreamAvailable {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetAudioStreamAvailable");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetAudioStreamAvailable$descriptor() {
		return SDL_GetAudioStreamAvailable.DESC;
	}

	public static MethodHandle SDL_GetAudioStreamAvailable$handle() {
		return SDL_GetAudioStreamAvailable.HANDLE;
	}

	public static MemorySegment SDL_GetAudioStreamAvailable$address() {
		return SDL_GetAudioStreamAvailable.ADDR;
	}

	public static int SDL_GetAudioStreamAvailable(MemorySegment stream) {
		var mh$ = SDL_GetAudioStreamAvailable.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetAudioStreamAvailable", stream);
			}
			return (int) mh$.invokeExact(stream);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetAudioStreamQueued {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetAudioStreamQueued");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetAudioStreamQueued$descriptor() {
		return SDL_GetAudioStreamQueued.DESC;
	}

	public static MethodHandle SDL_GetAudioStreamQueued$handle() {
		return SDL_GetAudioStreamQueued.HANDLE;
	}

	public static MemorySegment SDL_GetAudioStreamQueued$address() {
		return SDL_GetAudioStreamQueued.ADDR;
	}

	public static int SDL_GetAudioStreamQueued(MemorySegment stream) {
		var mh$ = SDL_GetAudioStreamQueued.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetAudioStreamQueued", stream);
			}
			return (int) mh$.invokeExact(stream);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_FlushAudioStream {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_FlushAudioStream");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_FlushAudioStream$descriptor() {
		return SDL_FlushAudioStream.DESC;
	}

	public static MethodHandle SDL_FlushAudioStream$handle() {
		return SDL_FlushAudioStream.HANDLE;
	}

	public static MemorySegment SDL_FlushAudioStream$address() {
		return SDL_FlushAudioStream.ADDR;
	}

	public static boolean SDL_FlushAudioStream(MemorySegment stream) {
		var mh$ = SDL_FlushAudioStream.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_FlushAudioStream", stream);
			}
			return (boolean) mh$.invokeExact(stream);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ClearAudioStream {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ClearAudioStream");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ClearAudioStream$descriptor() {
		return SDL_ClearAudioStream.DESC;
	}

	public static MethodHandle SDL_ClearAudioStream$handle() {
		return SDL_ClearAudioStream.HANDLE;
	}

	public static MemorySegment SDL_ClearAudioStream$address() {
		return SDL_ClearAudioStream.ADDR;
	}

	public static boolean SDL_ClearAudioStream(MemorySegment stream) {
		var mh$ = SDL_ClearAudioStream.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ClearAudioStream", stream);
			}
			return (boolean) mh$.invokeExact(stream);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_PauseAudioStreamDevice {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_PauseAudioStreamDevice");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_PauseAudioStreamDevice$descriptor() {
		return SDL_PauseAudioStreamDevice.DESC;
	}

	public static MethodHandle SDL_PauseAudioStreamDevice$handle() {
		return SDL_PauseAudioStreamDevice.HANDLE;
	}

	public static MemorySegment SDL_PauseAudioStreamDevice$address() {
		return SDL_PauseAudioStreamDevice.ADDR;
	}

	public static boolean SDL_PauseAudioStreamDevice(MemorySegment stream) {
		var mh$ = SDL_PauseAudioStreamDevice.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_PauseAudioStreamDevice", stream);
			}
			return (boolean) mh$.invokeExact(stream);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ResumeAudioStreamDevice {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ResumeAudioStreamDevice");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ResumeAudioStreamDevice$descriptor() {
		return SDL_ResumeAudioStreamDevice.DESC;
	}

	public static MethodHandle SDL_ResumeAudioStreamDevice$handle() {
		return SDL_ResumeAudioStreamDevice.HANDLE;
	}

	public static MemorySegment SDL_ResumeAudioStreamDevice$address() {
		return SDL_ResumeAudioStreamDevice.ADDR;
	}

	public static boolean SDL_ResumeAudioStreamDevice(MemorySegment stream) {
		var mh$ = SDL_ResumeAudioStreamDevice.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ResumeAudioStreamDevice", stream);
			}
			return (boolean) mh$.invokeExact(stream);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_AudioStreamDevicePaused {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_AudioStreamDevicePaused");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_AudioStreamDevicePaused$descriptor() {
		return SDL_AudioStreamDevicePaused.DESC;
	}

	public static MethodHandle SDL_AudioStreamDevicePaused$handle() {
		return SDL_AudioStreamDevicePaused.HANDLE;
	}

	public static MemorySegment SDL_AudioStreamDevicePaused$address() {
		return SDL_AudioStreamDevicePaused.ADDR;
	}

	public static boolean SDL_AudioStreamDevicePaused(MemorySegment stream) {
		var mh$ = SDL_AudioStreamDevicePaused.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_AudioStreamDevicePaused", stream);
			}
			return (boolean) mh$.invokeExact(stream);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_LockAudioStream {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_LockAudioStream");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_LockAudioStream$descriptor() {
		return SDL_LockAudioStream.DESC;
	}

	public static MethodHandle SDL_LockAudioStream$handle() {
		return SDL_LockAudioStream.HANDLE;
	}

	public static MemorySegment SDL_LockAudioStream$address() {
		return SDL_LockAudioStream.ADDR;
	}

	public static boolean SDL_LockAudioStream(MemorySegment stream) {
		var mh$ = SDL_LockAudioStream.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_LockAudioStream", stream);
			}
			return (boolean) mh$.invokeExact(stream);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_UnlockAudioStream {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_UnlockAudioStream");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_UnlockAudioStream$descriptor() {
		return SDL_UnlockAudioStream.DESC;
	}

	public static MethodHandle SDL_UnlockAudioStream$handle() {
		return SDL_UnlockAudioStream.HANDLE;
	}

	public static MemorySegment SDL_UnlockAudioStream$address() {
		return SDL_UnlockAudioStream.ADDR;
	}

	public static boolean SDL_UnlockAudioStream(MemorySegment stream) {
		var mh$ = SDL_UnlockAudioStream.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_UnlockAudioStream", stream);
			}
			return (boolean) mh$.invokeExact(stream);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetAudioStreamGetCallback {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetAudioStreamGetCallback");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetAudioStreamGetCallback$descriptor() {
		return SDL_SetAudioStreamGetCallback.DESC;
	}

	public static MethodHandle SDL_SetAudioStreamGetCallback$handle() {
		return SDL_SetAudioStreamGetCallback.HANDLE;
	}

	public static MemorySegment SDL_SetAudioStreamGetCallback$address() {
		return SDL_SetAudioStreamGetCallback.ADDR;
	}

	public static boolean SDL_SetAudioStreamGetCallback(MemorySegment stream, MemorySegment callback, MemorySegment userdata) {
		var mh$ = SDL_SetAudioStreamGetCallback.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetAudioStreamGetCallback", stream, callback, userdata);
			}
			return (boolean) mh$.invokeExact(stream, callback, userdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetAudioStreamPutCallback {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetAudioStreamPutCallback");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetAudioStreamPutCallback$descriptor() {
		return SDL_SetAudioStreamPutCallback.DESC;
	}

	public static MethodHandle SDL_SetAudioStreamPutCallback$handle() {
		return SDL_SetAudioStreamPutCallback.HANDLE;
	}

	public static MemorySegment SDL_SetAudioStreamPutCallback$address() {
		return SDL_SetAudioStreamPutCallback.ADDR;
	}

	public static boolean SDL_SetAudioStreamPutCallback(MemorySegment stream, MemorySegment callback, MemorySegment userdata) {
		var mh$ = SDL_SetAudioStreamPutCallback.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetAudioStreamPutCallback", stream, callback, userdata);
			}
			return (boolean) mh$.invokeExact(stream, callback, userdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DestroyAudioStream {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DestroyAudioStream");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DestroyAudioStream$descriptor() {
		return SDL_DestroyAudioStream.DESC;
	}

	public static MethodHandle SDL_DestroyAudioStream$handle() {
		return SDL_DestroyAudioStream.HANDLE;
	}

	public static MemorySegment SDL_DestroyAudioStream$address() {
		return SDL_DestroyAudioStream.ADDR;
	}

	public static void SDL_DestroyAudioStream(MemorySegment stream) {
		var mh$ = SDL_DestroyAudioStream.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DestroyAudioStream", stream);
			}
			mh$.invokeExact(stream);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_OpenAudioDeviceStream {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_OpenAudioDeviceStream");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_OpenAudioDeviceStream$descriptor() {
		return SDL_OpenAudioDeviceStream.DESC;
	}

	public static MethodHandle SDL_OpenAudioDeviceStream$handle() {
		return SDL_OpenAudioDeviceStream.HANDLE;
	}

	public static MemorySegment SDL_OpenAudioDeviceStream$address() {
		return SDL_OpenAudioDeviceStream.ADDR;
	}

	public static MemorySegment SDL_OpenAudioDeviceStream(int devid, MemorySegment spec, MemorySegment callback, MemorySegment userdata) {
		var mh$ = SDL_OpenAudioDeviceStream.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_OpenAudioDeviceStream", devid, spec, callback, userdata);
			}
			return (MemorySegment) mh$.invokeExact(devid, spec, callback, userdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetAudioPostmixCallback {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetAudioPostmixCallback");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetAudioPostmixCallback$descriptor() {
		return SDL_SetAudioPostmixCallback.DESC;
	}

	public static MethodHandle SDL_SetAudioPostmixCallback$handle() {
		return SDL_SetAudioPostmixCallback.HANDLE;
	}

	public static MemorySegment SDL_SetAudioPostmixCallback$address() {
		return SDL_SetAudioPostmixCallback.ADDR;
	}

	public static boolean SDL_SetAudioPostmixCallback(int devid, MemorySegment callback, MemorySegment userdata) {
		var mh$ = SDL_SetAudioPostmixCallback.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetAudioPostmixCallback", devid, callback, userdata);
			}
			return (boolean) mh$.invokeExact(devid, callback, userdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_LoadWAV_IO {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_LoadWAV_IO");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_LoadWAV_IO$descriptor() {
		return SDL_LoadWAV_IO.DESC;
	}

	public static MethodHandle SDL_LoadWAV_IO$handle() {
		return SDL_LoadWAV_IO.HANDLE;
	}

	public static MemorySegment SDL_LoadWAV_IO$address() {
		return SDL_LoadWAV_IO.ADDR;
	}

	public static boolean SDL_LoadWAV_IO(MemorySegment src, boolean closeio, MemorySegment spec, MemorySegment audio_buf, MemorySegment audio_len) {
		var mh$ = SDL_LoadWAV_IO.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_LoadWAV_IO", src, closeio, spec, audio_buf, audio_len);
			}
			return (boolean) mh$.invokeExact(src, closeio, spec, audio_buf, audio_len);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_LoadWAV {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_LoadWAV");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_LoadWAV$descriptor() {
		return SDL_LoadWAV.DESC;
	}

	public static MethodHandle SDL_LoadWAV$handle() {
		return SDL_LoadWAV.HANDLE;
	}

	public static MemorySegment SDL_LoadWAV$address() {
		return SDL_LoadWAV.ADDR;
	}

	public static boolean SDL_LoadWAV(MemorySegment path, MemorySegment spec, MemorySegment audio_buf, MemorySegment audio_len) {
		var mh$ = SDL_LoadWAV.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_LoadWAV", path, spec, audio_buf, audio_len);
			}
			return (boolean) mh$.invokeExact(path, spec, audio_buf, audio_len);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_MixAudio {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_MixAudio");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_MixAudio$descriptor() {
		return SDL_MixAudio.DESC;
	}

	public static MethodHandle SDL_MixAudio$handle() {
		return SDL_MixAudio.HANDLE;
	}

	public static MemorySegment SDL_MixAudio$address() {
		return SDL_MixAudio.ADDR;
	}

	public static boolean SDL_MixAudio(MemorySegment dst, MemorySegment src, int format, int len, float volume) {
		var mh$ = SDL_MixAudio.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_MixAudio", dst, src, format, len, volume);
			}
			return (boolean) mh$.invokeExact(dst, src, format, len, volume);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ConvertAudioSamples {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ConvertAudioSamples");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ConvertAudioSamples$descriptor() {
		return SDL_ConvertAudioSamples.DESC;
	}

	public static MethodHandle SDL_ConvertAudioSamples$handle() {
		return SDL_ConvertAudioSamples.HANDLE;
	}

	public static MemorySegment SDL_ConvertAudioSamples$address() {
		return SDL_ConvertAudioSamples.ADDR;
	}

	public static boolean SDL_ConvertAudioSamples(MemorySegment src_spec, MemorySegment src_data, int src_len, MemorySegment dst_spec, MemorySegment dst_data, MemorySegment dst_len) {
		var mh$ = SDL_ConvertAudioSamples.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ConvertAudioSamples", src_spec, src_data, src_len, dst_spec, dst_data, dst_len);
			}
			return (boolean) mh$.invokeExact(src_spec, src_data, src_len, dst_spec, dst_data, dst_len);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetAudioFormatName {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetAudioFormatName");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetAudioFormatName$descriptor() {
		return SDL_GetAudioFormatName.DESC;
	}

	public static MethodHandle SDL_GetAudioFormatName$handle() {
		return SDL_GetAudioFormatName.HANDLE;
	}

	public static MemorySegment SDL_GetAudioFormatName$address() {
		return SDL_GetAudioFormatName.ADDR;
	}

	public static MemorySegment SDL_GetAudioFormatName(int format) {
		var mh$ = SDL_GetAudioFormatName.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetAudioFormatName", format);
			}
			return (MemorySegment) mh$.invokeExact(format);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetSilenceValueForFormat {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetSilenceValueForFormat");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetSilenceValueForFormat$descriptor() {
		return SDL_GetSilenceValueForFormat.DESC;
	}

	public static MethodHandle SDL_GetSilenceValueForFormat$handle() {
		return SDL_GetSilenceValueForFormat.HANDLE;
	}

	public static MemorySegment SDL_GetSilenceValueForFormat$address() {
		return SDL_GetSilenceValueForFormat.ADDR;
	}

	public static int SDL_GetSilenceValueForFormat(int format) {
		var mh$ = SDL_GetSilenceValueForFormat.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetSilenceValueForFormat", format);
			}
			return (int) mh$.invokeExact(format);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	public static OfInt SDL_BlendMode = SDL3.C_INT;
	private static final int SDL_BLENDOPERATION_ADD = (int) 1L;

	public static int SDL_BLENDOPERATION_ADD() {
		return SDL_BLENDOPERATION_ADD;
	}

	private static final int SDL_BLENDOPERATION_SUBTRACT = (int) 2L;

	public static int SDL_BLENDOPERATION_SUBTRACT() {
		return SDL_BLENDOPERATION_SUBTRACT;
	}

	private static final int SDL_BLENDOPERATION_REV_SUBTRACT = (int) 3L;

	public static int SDL_BLENDOPERATION_REV_SUBTRACT() {
		return SDL_BLENDOPERATION_REV_SUBTRACT;
	}

	private static final int SDL_BLENDOPERATION_MINIMUM = (int) 4L;

	public static int SDL_BLENDOPERATION_MINIMUM() {
		return SDL_BLENDOPERATION_MINIMUM;
	}

	private static final int SDL_BLENDOPERATION_MAXIMUM = (int) 5L;

	public static int SDL_BLENDOPERATION_MAXIMUM() {
		return SDL_BLENDOPERATION_MAXIMUM;
	}

	private static final int SDL_BLENDFACTOR_ZERO = (int) 1L;

	public static int SDL_BLENDFACTOR_ZERO() {
		return SDL_BLENDFACTOR_ZERO;
	}

	private static final int SDL_BLENDFACTOR_ONE = (int) 2L;

	public static int SDL_BLENDFACTOR_ONE() {
		return SDL_BLENDFACTOR_ONE;
	}

	private static final int SDL_BLENDFACTOR_SRC_COLOR = (int) 3L;

	public static int SDL_BLENDFACTOR_SRC_COLOR() {
		return SDL_BLENDFACTOR_SRC_COLOR;
	}

	private static final int SDL_BLENDFACTOR_ONE_MINUS_SRC_COLOR = (int) 4L;

	public static int SDL_BLENDFACTOR_ONE_MINUS_SRC_COLOR() {
		return SDL_BLENDFACTOR_ONE_MINUS_SRC_COLOR;
	}

	private static final int SDL_BLENDFACTOR_SRC_ALPHA = (int) 5L;

	public static int SDL_BLENDFACTOR_SRC_ALPHA() {
		return SDL_BLENDFACTOR_SRC_ALPHA;
	}

	private static final int SDL_BLENDFACTOR_ONE_MINUS_SRC_ALPHA = (int) 6L;

	public static int SDL_BLENDFACTOR_ONE_MINUS_SRC_ALPHA() {
		return SDL_BLENDFACTOR_ONE_MINUS_SRC_ALPHA;
	}

	private static final int SDL_BLENDFACTOR_DST_COLOR = (int) 7L;

	public static int SDL_BLENDFACTOR_DST_COLOR() {
		return SDL_BLENDFACTOR_DST_COLOR;
	}

	private static final int SDL_BLENDFACTOR_ONE_MINUS_DST_COLOR = (int) 8L;

	public static int SDL_BLENDFACTOR_ONE_MINUS_DST_COLOR() {
		return SDL_BLENDFACTOR_ONE_MINUS_DST_COLOR;
	}

	private static final int SDL_BLENDFACTOR_DST_ALPHA = (int) 9L;

	public static int SDL_BLENDFACTOR_DST_ALPHA() {
		return SDL_BLENDFACTOR_DST_ALPHA;
	}

	private static final int SDL_BLENDFACTOR_ONE_MINUS_DST_ALPHA = (int) 10L;

	public static int SDL_BLENDFACTOR_ONE_MINUS_DST_ALPHA() {
		return SDL_BLENDFACTOR_ONE_MINUS_DST_ALPHA;
	}

	private static class SDL_ComposeCustomBlendMode {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ComposeCustomBlendMode");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ComposeCustomBlendMode$descriptor() {
		return SDL_ComposeCustomBlendMode.DESC;
	}

	public static MethodHandle SDL_ComposeCustomBlendMode$handle() {
		return SDL_ComposeCustomBlendMode.HANDLE;
	}

	public static MemorySegment SDL_ComposeCustomBlendMode$address() {
		return SDL_ComposeCustomBlendMode.ADDR;
	}

	public static int SDL_ComposeCustomBlendMode(int srcColorFactor, int dstColorFactor, int colorOperation, int srcAlphaFactor, int dstAlphaFactor, int alphaOperation) {
		var mh$ = SDL_ComposeCustomBlendMode.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ComposeCustomBlendMode", srcColorFactor, dstColorFactor, colorOperation, srcAlphaFactor, dstAlphaFactor, alphaOperation);
			}
			return (int) mh$.invokeExact(srcColorFactor, dstColorFactor, colorOperation, srcAlphaFactor, dstAlphaFactor, alphaOperation);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static final int SDL_PIXELTYPE_UNKNOWN = (int) 0L;

	public static int SDL_PIXELTYPE_UNKNOWN() {
		return SDL_PIXELTYPE_UNKNOWN;
	}

	private static final int SDL_PIXELTYPE_INDEX1 = (int) 1L;

	public static int SDL_PIXELTYPE_INDEX1() {
		return SDL_PIXELTYPE_INDEX1;
	}

	private static final int SDL_PIXELTYPE_INDEX4 = (int) 2L;

	public static int SDL_PIXELTYPE_INDEX4() {
		return SDL_PIXELTYPE_INDEX4;
	}

	private static final int SDL_PIXELTYPE_INDEX8 = (int) 3L;

	public static int SDL_PIXELTYPE_INDEX8() {
		return SDL_PIXELTYPE_INDEX8;
	}

	private static final int SDL_PIXELTYPE_PACKED8 = (int) 4L;

	public static int SDL_PIXELTYPE_PACKED8() {
		return SDL_PIXELTYPE_PACKED8;
	}

	private static final int SDL_PIXELTYPE_PACKED16 = (int) 5L;

	public static int SDL_PIXELTYPE_PACKED16() {
		return SDL_PIXELTYPE_PACKED16;
	}

	private static final int SDL_PIXELTYPE_PACKED32 = (int) 6L;

	public static int SDL_PIXELTYPE_PACKED32() {
		return SDL_PIXELTYPE_PACKED32;
	}

	private static final int SDL_PIXELTYPE_ARRAYU8 = (int) 7L;

	public static int SDL_PIXELTYPE_ARRAYU8() {
		return SDL_PIXELTYPE_ARRAYU8;
	}

	private static final int SDL_PIXELTYPE_ARRAYU16 = (int) 8L;

	public static int SDL_PIXELTYPE_ARRAYU16() {
		return SDL_PIXELTYPE_ARRAYU16;
	}

	private static final int SDL_PIXELTYPE_ARRAYU32 = (int) 9L;

	public static int SDL_PIXELTYPE_ARRAYU32() {
		return SDL_PIXELTYPE_ARRAYU32;
	}

	private static final int SDL_PIXELTYPE_ARRAYF16 = (int) 10L;

	public static int SDL_PIXELTYPE_ARRAYF16() {
		return SDL_PIXELTYPE_ARRAYF16;
	}

	private static final int SDL_PIXELTYPE_ARRAYF32 = (int) 11L;

	public static int SDL_PIXELTYPE_ARRAYF32() {
		return SDL_PIXELTYPE_ARRAYF32;
	}

	private static final int SDL_PIXELTYPE_INDEX2 = (int) 12L;

	public static int SDL_PIXELTYPE_INDEX2() {
		return SDL_PIXELTYPE_INDEX2;
	}

	private static final int SDL_BITMAPORDER_NONE = (int) 0L;

	public static int SDL_BITMAPORDER_NONE() {
		return SDL_BITMAPORDER_NONE;
	}

	private static final int SDL_BITMAPORDER_4321 = (int) 1L;

	public static int SDL_BITMAPORDER_4321() {
		return SDL_BITMAPORDER_4321;
	}

	private static final int SDL_BITMAPORDER_1234 = (int) 2L;

	public static int SDL_BITMAPORDER_1234() {
		return SDL_BITMAPORDER_1234;
	}

	private static final int SDL_PACKEDORDER_NONE = (int) 0L;

	public static int SDL_PACKEDORDER_NONE() {
		return SDL_PACKEDORDER_NONE;
	}

	private static final int SDL_PACKEDORDER_XRGB = (int) 1L;

	public static int SDL_PACKEDORDER_XRGB() {
		return SDL_PACKEDORDER_XRGB;
	}

	private static final int SDL_PACKEDORDER_RGBX = (int) 2L;

	public static int SDL_PACKEDORDER_RGBX() {
		return SDL_PACKEDORDER_RGBX;
	}

	private static final int SDL_PACKEDORDER_ARGB = (int) 3L;

	public static int SDL_PACKEDORDER_ARGB() {
		return SDL_PACKEDORDER_ARGB;
	}

	private static final int SDL_PACKEDORDER_RGBA = (int) 4L;

	public static int SDL_PACKEDORDER_RGBA() {
		return SDL_PACKEDORDER_RGBA;
	}

	private static final int SDL_PACKEDORDER_XBGR = (int) 5L;

	public static int SDL_PACKEDORDER_XBGR() {
		return SDL_PACKEDORDER_XBGR;
	}

	private static final int SDL_PACKEDORDER_BGRX = (int) 6L;

	public static int SDL_PACKEDORDER_BGRX() {
		return SDL_PACKEDORDER_BGRX;
	}

	private static final int SDL_PACKEDORDER_ABGR = (int) 7L;

	public static int SDL_PACKEDORDER_ABGR() {
		return SDL_PACKEDORDER_ABGR;
	}

	private static final int SDL_PACKEDORDER_BGRA = (int) 8L;

	public static int SDL_PACKEDORDER_BGRA() {
		return SDL_PACKEDORDER_BGRA;
	}

	private static final int SDL_ARRAYORDER_NONE = (int) 0L;

	public static int SDL_ARRAYORDER_NONE() {
		return SDL_ARRAYORDER_NONE;
	}

	private static final int SDL_ARRAYORDER_RGB = (int) 1L;

	public static int SDL_ARRAYORDER_RGB() {
		return SDL_ARRAYORDER_RGB;
	}

	private static final int SDL_ARRAYORDER_RGBA = (int) 2L;

	public static int SDL_ARRAYORDER_RGBA() {
		return SDL_ARRAYORDER_RGBA;
	}

	private static final int SDL_ARRAYORDER_ARGB = (int) 3L;

	public static int SDL_ARRAYORDER_ARGB() {
		return SDL_ARRAYORDER_ARGB;
	}

	private static final int SDL_ARRAYORDER_BGR = (int) 4L;

	public static int SDL_ARRAYORDER_BGR() {
		return SDL_ARRAYORDER_BGR;
	}

	private static final int SDL_ARRAYORDER_BGRA = (int) 5L;

	public static int SDL_ARRAYORDER_BGRA() {
		return SDL_ARRAYORDER_BGRA;
	}

	private static final int SDL_ARRAYORDER_ABGR = (int) 6L;

	public static int SDL_ARRAYORDER_ABGR() {
		return SDL_ARRAYORDER_ABGR;
	}

	private static final int SDL_PACKEDLAYOUT_NONE = (int) 0L;

	public static int SDL_PACKEDLAYOUT_NONE() {
		return SDL_PACKEDLAYOUT_NONE;
	}

	private static final int SDL_PACKEDLAYOUT_332 = (int) 1L;

	public static int SDL_PACKEDLAYOUT_332() {
		return SDL_PACKEDLAYOUT_332;
	}

	private static final int SDL_PACKEDLAYOUT_4444 = (int) 2L;

	public static int SDL_PACKEDLAYOUT_4444() {
		return SDL_PACKEDLAYOUT_4444;
	}

	private static final int SDL_PACKEDLAYOUT_1555 = (int) 3L;

	public static int SDL_PACKEDLAYOUT_1555() {
		return SDL_PACKEDLAYOUT_1555;
	}

	private static final int SDL_PACKEDLAYOUT_5551 = (int) 4L;

	public static int SDL_PACKEDLAYOUT_5551() {
		return SDL_PACKEDLAYOUT_5551;
	}

	private static final int SDL_PACKEDLAYOUT_565 = (int) 5L;

	public static int SDL_PACKEDLAYOUT_565() {
		return SDL_PACKEDLAYOUT_565;
	}

	private static final int SDL_PACKEDLAYOUT_8888 = (int) 6L;

	public static int SDL_PACKEDLAYOUT_8888() {
		return SDL_PACKEDLAYOUT_8888;
	}

	private static final int SDL_PACKEDLAYOUT_2101010 = (int) 7L;

	public static int SDL_PACKEDLAYOUT_2101010() {
		return SDL_PACKEDLAYOUT_2101010;
	}

	private static final int SDL_PACKEDLAYOUT_1010102 = (int) 8L;

	public static int SDL_PACKEDLAYOUT_1010102() {
		return SDL_PACKEDLAYOUT_1010102;
	}

	private static final int SDL_PIXELFORMAT_UNKNOWN = (int) 0L;

	public static int SDL_PIXELFORMAT_UNKNOWN() {
		return SDL_PIXELFORMAT_UNKNOWN;
	}

	private static final int SDL_PIXELFORMAT_INDEX1LSB = (int) 286261504L;

	public static int SDL_PIXELFORMAT_INDEX1LSB() {
		return SDL_PIXELFORMAT_INDEX1LSB;
	}

	private static final int SDL_PIXELFORMAT_INDEX1MSB = (int) 287310080L;

	public static int SDL_PIXELFORMAT_INDEX1MSB() {
		return SDL_PIXELFORMAT_INDEX1MSB;
	}

	private static final int SDL_PIXELFORMAT_INDEX2LSB = (int) 470811136L;

	public static int SDL_PIXELFORMAT_INDEX2LSB() {
		return SDL_PIXELFORMAT_INDEX2LSB;
	}

	private static final int SDL_PIXELFORMAT_INDEX2MSB = (int) 471859712L;

	public static int SDL_PIXELFORMAT_INDEX2MSB() {
		return SDL_PIXELFORMAT_INDEX2MSB;
	}

	private static final int SDL_PIXELFORMAT_INDEX4LSB = (int) 303039488L;

	public static int SDL_PIXELFORMAT_INDEX4LSB() {
		return SDL_PIXELFORMAT_INDEX4LSB;
	}

	private static final int SDL_PIXELFORMAT_INDEX4MSB = (int) 304088064L;

	public static int SDL_PIXELFORMAT_INDEX4MSB() {
		return SDL_PIXELFORMAT_INDEX4MSB;
	}

	private static final int SDL_PIXELFORMAT_INDEX8 = (int) 318769153L;

	public static int SDL_PIXELFORMAT_INDEX8() {
		return SDL_PIXELFORMAT_INDEX8;
	}

	private static final int SDL_PIXELFORMAT_RGB332 = (int) 336660481L;

	public static int SDL_PIXELFORMAT_RGB332() {
		return SDL_PIXELFORMAT_RGB332;
	}

	private static final int SDL_PIXELFORMAT_XRGB4444 = (int) 353504258L;

	public static int SDL_PIXELFORMAT_XRGB4444() {
		return SDL_PIXELFORMAT_XRGB4444;
	}

	private static final int SDL_PIXELFORMAT_XBGR4444 = (int) 357698562L;

	public static int SDL_PIXELFORMAT_XBGR4444() {
		return SDL_PIXELFORMAT_XBGR4444;
	}

	private static final int SDL_PIXELFORMAT_XRGB1555 = (int) 353570562L;

	public static int SDL_PIXELFORMAT_XRGB1555() {
		return SDL_PIXELFORMAT_XRGB1555;
	}

	private static final int SDL_PIXELFORMAT_XBGR1555 = (int) 357764866L;

	public static int SDL_PIXELFORMAT_XBGR1555() {
		return SDL_PIXELFORMAT_XBGR1555;
	}

	private static final int SDL_PIXELFORMAT_ARGB4444 = (int) 355602434L;

	public static int SDL_PIXELFORMAT_ARGB4444() {
		return SDL_PIXELFORMAT_ARGB4444;
	}

	private static final int SDL_PIXELFORMAT_RGBA4444 = (int) 356651010L;

	public static int SDL_PIXELFORMAT_RGBA4444() {
		return SDL_PIXELFORMAT_RGBA4444;
	}

	private static final int SDL_PIXELFORMAT_ABGR4444 = (int) 359796738L;

	public static int SDL_PIXELFORMAT_ABGR4444() {
		return SDL_PIXELFORMAT_ABGR4444;
	}

	private static final int SDL_PIXELFORMAT_BGRA4444 = (int) 360845314L;

	public static int SDL_PIXELFORMAT_BGRA4444() {
		return SDL_PIXELFORMAT_BGRA4444;
	}

	private static final int SDL_PIXELFORMAT_ARGB1555 = (int) 355667970L;

	public static int SDL_PIXELFORMAT_ARGB1555() {
		return SDL_PIXELFORMAT_ARGB1555;
	}

	private static final int SDL_PIXELFORMAT_RGBA5551 = (int) 356782082L;

	public static int SDL_PIXELFORMAT_RGBA5551() {
		return SDL_PIXELFORMAT_RGBA5551;
	}

	private static final int SDL_PIXELFORMAT_ABGR1555 = (int) 359862274L;

	public static int SDL_PIXELFORMAT_ABGR1555() {
		return SDL_PIXELFORMAT_ABGR1555;
	}

	private static final int SDL_PIXELFORMAT_BGRA5551 = (int) 360976386L;

	public static int SDL_PIXELFORMAT_BGRA5551() {
		return SDL_PIXELFORMAT_BGRA5551;
	}

	private static final int SDL_PIXELFORMAT_RGB565 = (int) 353701890L;

	public static int SDL_PIXELFORMAT_RGB565() {
		return SDL_PIXELFORMAT_RGB565;
	}

	private static final int SDL_PIXELFORMAT_BGR565 = (int) 357896194L;

	public static int SDL_PIXELFORMAT_BGR565() {
		return SDL_PIXELFORMAT_BGR565;
	}

	private static final int SDL_PIXELFORMAT_RGB24 = (int) 386930691L;

	public static int SDL_PIXELFORMAT_RGB24() {
		return SDL_PIXELFORMAT_RGB24;
	}

	private static final int SDL_PIXELFORMAT_BGR24 = (int) 390076419L;

	public static int SDL_PIXELFORMAT_BGR24() {
		return SDL_PIXELFORMAT_BGR24;
	}

	private static final int SDL_PIXELFORMAT_XRGB8888 = (int) 370546692L;

	public static int SDL_PIXELFORMAT_XRGB8888() {
		return SDL_PIXELFORMAT_XRGB8888;
	}

	private static final int SDL_PIXELFORMAT_RGBX8888 = (int) 371595268L;

	public static int SDL_PIXELFORMAT_RGBX8888() {
		return SDL_PIXELFORMAT_RGBX8888;
	}

	private static final int SDL_PIXELFORMAT_XBGR8888 = (int) 374740996L;

	public static int SDL_PIXELFORMAT_XBGR8888() {
		return SDL_PIXELFORMAT_XBGR8888;
	}

	private static final int SDL_PIXELFORMAT_BGRX8888 = (int) 375789572L;

	public static int SDL_PIXELFORMAT_BGRX8888() {
		return SDL_PIXELFORMAT_BGRX8888;
	}

	private static final int SDL_PIXELFORMAT_ARGB8888 = (int) 372645892L;

	public static int SDL_PIXELFORMAT_ARGB8888() {
		return SDL_PIXELFORMAT_ARGB8888;
	}

	private static final int SDL_PIXELFORMAT_RGBA8888 = (int) 373694468L;

	public static int SDL_PIXELFORMAT_RGBA8888() {
		return SDL_PIXELFORMAT_RGBA8888;
	}

	private static final int SDL_PIXELFORMAT_ABGR8888 = (int) 376840196L;

	public static int SDL_PIXELFORMAT_ABGR8888() {
		return SDL_PIXELFORMAT_ABGR8888;
	}

	private static final int SDL_PIXELFORMAT_BGRA8888 = (int) 377888772L;

	public static int SDL_PIXELFORMAT_BGRA8888() {
		return SDL_PIXELFORMAT_BGRA8888;
	}

	private static final int SDL_PIXELFORMAT_XRGB2101010 = (int) 370614276L;

	public static int SDL_PIXELFORMAT_XRGB2101010() {
		return SDL_PIXELFORMAT_XRGB2101010;
	}

	private static final int SDL_PIXELFORMAT_XBGR2101010 = (int) 374808580L;

	public static int SDL_PIXELFORMAT_XBGR2101010() {
		return SDL_PIXELFORMAT_XBGR2101010;
	}

	private static final int SDL_PIXELFORMAT_ARGB2101010 = (int) 372711428L;

	public static int SDL_PIXELFORMAT_ARGB2101010() {
		return SDL_PIXELFORMAT_ARGB2101010;
	}

	private static final int SDL_PIXELFORMAT_ABGR2101010 = (int) 376905732L;

	public static int SDL_PIXELFORMAT_ABGR2101010() {
		return SDL_PIXELFORMAT_ABGR2101010;
	}

	private static final int SDL_PIXELFORMAT_RGB48 = (int) 403714054L;

	public static int SDL_PIXELFORMAT_RGB48() {
		return SDL_PIXELFORMAT_RGB48;
	}

	private static final int SDL_PIXELFORMAT_BGR48 = (int) 406859782L;

	public static int SDL_PIXELFORMAT_BGR48() {
		return SDL_PIXELFORMAT_BGR48;
	}

	private static final int SDL_PIXELFORMAT_RGBA64 = (int) 404766728L;

	public static int SDL_PIXELFORMAT_RGBA64() {
		return SDL_PIXELFORMAT_RGBA64;
	}

	private static final int SDL_PIXELFORMAT_ARGB64 = (int) 405815304L;

	public static int SDL_PIXELFORMAT_ARGB64() {
		return SDL_PIXELFORMAT_ARGB64;
	}

	private static final int SDL_PIXELFORMAT_BGRA64 = (int) 407912456L;

	public static int SDL_PIXELFORMAT_BGRA64() {
		return SDL_PIXELFORMAT_BGRA64;
	}

	private static final int SDL_PIXELFORMAT_ABGR64 = (int) 408961032L;

	public static int SDL_PIXELFORMAT_ABGR64() {
		return SDL_PIXELFORMAT_ABGR64;
	}

	private static final int SDL_PIXELFORMAT_RGB48_FLOAT = (int) 437268486L;

	public static int SDL_PIXELFORMAT_RGB48_FLOAT() {
		return SDL_PIXELFORMAT_RGB48_FLOAT;
	}

	private static final int SDL_PIXELFORMAT_BGR48_FLOAT = (int) 440414214L;

	public static int SDL_PIXELFORMAT_BGR48_FLOAT() {
		return SDL_PIXELFORMAT_BGR48_FLOAT;
	}

	private static final int SDL_PIXELFORMAT_RGBA64_FLOAT = (int) 438321160L;

	public static int SDL_PIXELFORMAT_RGBA64_FLOAT() {
		return SDL_PIXELFORMAT_RGBA64_FLOAT;
	}

	private static final int SDL_PIXELFORMAT_ARGB64_FLOAT = (int) 439369736L;

	public static int SDL_PIXELFORMAT_ARGB64_FLOAT() {
		return SDL_PIXELFORMAT_ARGB64_FLOAT;
	}

	private static final int SDL_PIXELFORMAT_BGRA64_FLOAT = (int) 441466888L;

	public static int SDL_PIXELFORMAT_BGRA64_FLOAT() {
		return SDL_PIXELFORMAT_BGRA64_FLOAT;
	}

	private static final int SDL_PIXELFORMAT_ABGR64_FLOAT = (int) 442515464L;

	public static int SDL_PIXELFORMAT_ABGR64_FLOAT() {
		return SDL_PIXELFORMAT_ABGR64_FLOAT;
	}

	private static final int SDL_PIXELFORMAT_RGB96_FLOAT = (int) 454057996L;

	public static int SDL_PIXELFORMAT_RGB96_FLOAT() {
		return SDL_PIXELFORMAT_RGB96_FLOAT;
	}

	private static final int SDL_PIXELFORMAT_BGR96_FLOAT = (int) 457203724L;

	public static int SDL_PIXELFORMAT_BGR96_FLOAT() {
		return SDL_PIXELFORMAT_BGR96_FLOAT;
	}

	private static final int SDL_PIXELFORMAT_RGBA128_FLOAT = (int) 455114768L;

	public static int SDL_PIXELFORMAT_RGBA128_FLOAT() {
		return SDL_PIXELFORMAT_RGBA128_FLOAT;
	}

	private static final int SDL_PIXELFORMAT_ARGB128_FLOAT = (int) 456163344L;

	public static int SDL_PIXELFORMAT_ARGB128_FLOAT() {
		return SDL_PIXELFORMAT_ARGB128_FLOAT;
	}

	private static final int SDL_PIXELFORMAT_BGRA128_FLOAT = (int) 458260496L;

	public static int SDL_PIXELFORMAT_BGRA128_FLOAT() {
		return SDL_PIXELFORMAT_BGRA128_FLOAT;
	}

	private static final int SDL_PIXELFORMAT_ABGR128_FLOAT = (int) 459309072L;

	public static int SDL_PIXELFORMAT_ABGR128_FLOAT() {
		return SDL_PIXELFORMAT_ABGR128_FLOAT;
	}

	private static final int SDL_PIXELFORMAT_YV12 = (int) 842094169L;

	public static int SDL_PIXELFORMAT_YV12() {
		return SDL_PIXELFORMAT_YV12;
	}

	private static final int SDL_PIXELFORMAT_IYUV = (int) 1448433993L;

	public static int SDL_PIXELFORMAT_IYUV() {
		return SDL_PIXELFORMAT_IYUV;
	}

	private static final int SDL_PIXELFORMAT_YUY2 = (int) 844715353L;

	public static int SDL_PIXELFORMAT_YUY2() {
		return SDL_PIXELFORMAT_YUY2;
	}

	private static final int SDL_PIXELFORMAT_UYVY = (int) 1498831189L;

	public static int SDL_PIXELFORMAT_UYVY() {
		return SDL_PIXELFORMAT_UYVY;
	}

	private static final int SDL_PIXELFORMAT_YVYU = (int) 1431918169L;

	public static int SDL_PIXELFORMAT_YVYU() {
		return SDL_PIXELFORMAT_YVYU;
	}

	private static final int SDL_PIXELFORMAT_NV12 = (int) 842094158L;

	public static int SDL_PIXELFORMAT_NV12() {
		return SDL_PIXELFORMAT_NV12;
	}

	private static final int SDL_PIXELFORMAT_NV21 = (int) 825382478L;

	public static int SDL_PIXELFORMAT_NV21() {
		return SDL_PIXELFORMAT_NV21;
	}

	private static final int SDL_PIXELFORMAT_P010 = (int) 808530000L;

	public static int SDL_PIXELFORMAT_P010() {
		return SDL_PIXELFORMAT_P010;
	}

	private static final int SDL_PIXELFORMAT_EXTERNAL_OES = (int) 542328143L;

	public static int SDL_PIXELFORMAT_EXTERNAL_OES() {
		return SDL_PIXELFORMAT_EXTERNAL_OES;
	}

	private static final int SDL_PIXELFORMAT_MJPG = (int) 1196444237L;

	public static int SDL_PIXELFORMAT_MJPG() {
		return SDL_PIXELFORMAT_MJPG;
	}

	private static final int SDL_PIXELFORMAT_RGBA32 = (int) 376840196L;

	public static int SDL_PIXELFORMAT_RGBA32() {
		return SDL_PIXELFORMAT_RGBA32;
	}

	private static final int SDL_PIXELFORMAT_ARGB32 = (int) 377888772L;

	public static int SDL_PIXELFORMAT_ARGB32() {
		return SDL_PIXELFORMAT_ARGB32;
	}

	private static final int SDL_PIXELFORMAT_BGRA32 = (int) 372645892L;

	public static int SDL_PIXELFORMAT_BGRA32() {
		return SDL_PIXELFORMAT_BGRA32;
	}

	private static final int SDL_PIXELFORMAT_ABGR32 = (int) 373694468L;

	public static int SDL_PIXELFORMAT_ABGR32() {
		return SDL_PIXELFORMAT_ABGR32;
	}

	private static final int SDL_PIXELFORMAT_RGBX32 = (int) 374740996L;

	public static int SDL_PIXELFORMAT_RGBX32() {
		return SDL_PIXELFORMAT_RGBX32;
	}

	private static final int SDL_PIXELFORMAT_XRGB32 = (int) 375789572L;

	public static int SDL_PIXELFORMAT_XRGB32() {
		return SDL_PIXELFORMAT_XRGB32;
	}

	private static final int SDL_PIXELFORMAT_BGRX32 = (int) 370546692L;

	public static int SDL_PIXELFORMAT_BGRX32() {
		return SDL_PIXELFORMAT_BGRX32;
	}

	private static final int SDL_PIXELFORMAT_XBGR32 = (int) 371595268L;

	public static int SDL_PIXELFORMAT_XBGR32() {
		return SDL_PIXELFORMAT_XBGR32;
	}

	private static final int SDL_COLOR_TYPE_UNKNOWN = (int) 0L;

	public static int SDL_COLOR_TYPE_UNKNOWN() {
		return SDL_COLOR_TYPE_UNKNOWN;
	}

	private static final int SDL_COLOR_TYPE_RGB = (int) 1L;

	public static int SDL_COLOR_TYPE_RGB() {
		return SDL_COLOR_TYPE_RGB;
	}

	private static final int SDL_COLOR_TYPE_YCBCR = (int) 2L;

	public static int SDL_COLOR_TYPE_YCBCR() {
		return SDL_COLOR_TYPE_YCBCR;
	}

	private static final int SDL_COLOR_RANGE_UNKNOWN = (int) 0L;

	public static int SDL_COLOR_RANGE_UNKNOWN() {
		return SDL_COLOR_RANGE_UNKNOWN;
	}

	private static final int SDL_COLOR_RANGE_LIMITED = (int) 1L;

	public static int SDL_COLOR_RANGE_LIMITED() {
		return SDL_COLOR_RANGE_LIMITED;
	}

	private static final int SDL_COLOR_RANGE_FULL = (int) 2L;

	public static int SDL_COLOR_RANGE_FULL() {
		return SDL_COLOR_RANGE_FULL;
	}

	private static final int SDL_COLOR_PRIMARIES_UNKNOWN = (int) 0L;

	public static int SDL_COLOR_PRIMARIES_UNKNOWN() {
		return SDL_COLOR_PRIMARIES_UNKNOWN;
	}

	private static final int SDL_COLOR_PRIMARIES_BT709 = (int) 1L;

	public static int SDL_COLOR_PRIMARIES_BT709() {
		return SDL_COLOR_PRIMARIES_BT709;
	}

	private static final int SDL_COLOR_PRIMARIES_UNSPECIFIED = (int) 2L;

	public static int SDL_COLOR_PRIMARIES_UNSPECIFIED() {
		return SDL_COLOR_PRIMARIES_UNSPECIFIED;
	}

	private static final int SDL_COLOR_PRIMARIES_BT470M = (int) 4L;

	public static int SDL_COLOR_PRIMARIES_BT470M() {
		return SDL_COLOR_PRIMARIES_BT470M;
	}

	private static final int SDL_COLOR_PRIMARIES_BT470BG = (int) 5L;

	public static int SDL_COLOR_PRIMARIES_BT470BG() {
		return SDL_COLOR_PRIMARIES_BT470BG;
	}

	private static final int SDL_COLOR_PRIMARIES_BT601 = (int) 6L;

	public static int SDL_COLOR_PRIMARIES_BT601() {
		return SDL_COLOR_PRIMARIES_BT601;
	}

	private static final int SDL_COLOR_PRIMARIES_SMPTE240 = (int) 7L;

	public static int SDL_COLOR_PRIMARIES_SMPTE240() {
		return SDL_COLOR_PRIMARIES_SMPTE240;
	}

	private static final int SDL_COLOR_PRIMARIES_GENERIC_FILM = (int) 8L;

	public static int SDL_COLOR_PRIMARIES_GENERIC_FILM() {
		return SDL_COLOR_PRIMARIES_GENERIC_FILM;
	}

	private static final int SDL_COLOR_PRIMARIES_BT2020 = (int) 9L;

	public static int SDL_COLOR_PRIMARIES_BT2020() {
		return SDL_COLOR_PRIMARIES_BT2020;
	}

	private static final int SDL_COLOR_PRIMARIES_XYZ = (int) 10L;

	public static int SDL_COLOR_PRIMARIES_XYZ() {
		return SDL_COLOR_PRIMARIES_XYZ;
	}

	private static final int SDL_COLOR_PRIMARIES_SMPTE431 = (int) 11L;

	public static int SDL_COLOR_PRIMARIES_SMPTE431() {
		return SDL_COLOR_PRIMARIES_SMPTE431;
	}

	private static final int SDL_COLOR_PRIMARIES_SMPTE432 = (int) 12L;

	public static int SDL_COLOR_PRIMARIES_SMPTE432() {
		return SDL_COLOR_PRIMARIES_SMPTE432;
	}

	private static final int SDL_COLOR_PRIMARIES_EBU3213 = (int) 22L;

	public static int SDL_COLOR_PRIMARIES_EBU3213() {
		return SDL_COLOR_PRIMARIES_EBU3213;
	}

	private static final int SDL_COLOR_PRIMARIES_CUSTOM = (int) 31L;

	public static int SDL_COLOR_PRIMARIES_CUSTOM() {
		return SDL_COLOR_PRIMARIES_CUSTOM;
	}

	private static final int SDL_TRANSFER_CHARACTERISTICS_UNKNOWN = (int) 0L;

	public static int SDL_TRANSFER_CHARACTERISTICS_UNKNOWN() {
		return SDL_TRANSFER_CHARACTERISTICS_UNKNOWN;
	}

	private static final int SDL_TRANSFER_CHARACTERISTICS_BT709 = (int) 1L;

	public static int SDL_TRANSFER_CHARACTERISTICS_BT709() {
		return SDL_TRANSFER_CHARACTERISTICS_BT709;
	}

	private static final int SDL_TRANSFER_CHARACTERISTICS_UNSPECIFIED = (int) 2L;

	public static int SDL_TRANSFER_CHARACTERISTICS_UNSPECIFIED() {
		return SDL_TRANSFER_CHARACTERISTICS_UNSPECIFIED;
	}

	private static final int SDL_TRANSFER_CHARACTERISTICS_GAMMA22 = (int) 4L;

	public static int SDL_TRANSFER_CHARACTERISTICS_GAMMA22() {
		return SDL_TRANSFER_CHARACTERISTICS_GAMMA22;
	}

	private static final int SDL_TRANSFER_CHARACTERISTICS_GAMMA28 = (int) 5L;

	public static int SDL_TRANSFER_CHARACTERISTICS_GAMMA28() {
		return SDL_TRANSFER_CHARACTERISTICS_GAMMA28;
	}

	private static final int SDL_TRANSFER_CHARACTERISTICS_BT601 = (int) 6L;

	public static int SDL_TRANSFER_CHARACTERISTICS_BT601() {
		return SDL_TRANSFER_CHARACTERISTICS_BT601;
	}

	private static final int SDL_TRANSFER_CHARACTERISTICS_SMPTE240 = (int) 7L;

	public static int SDL_TRANSFER_CHARACTERISTICS_SMPTE240() {
		return SDL_TRANSFER_CHARACTERISTICS_SMPTE240;
	}

	private static final int SDL_TRANSFER_CHARACTERISTICS_LINEAR = (int) 8L;

	public static int SDL_TRANSFER_CHARACTERISTICS_LINEAR() {
		return SDL_TRANSFER_CHARACTERISTICS_LINEAR;
	}

	private static final int SDL_TRANSFER_CHARACTERISTICS_LOG100 = (int) 9L;

	public static int SDL_TRANSFER_CHARACTERISTICS_LOG100() {
		return SDL_TRANSFER_CHARACTERISTICS_LOG100;
	}

	private static final int SDL_TRANSFER_CHARACTERISTICS_LOG100_SQRT10 = (int) 10L;

	public static int SDL_TRANSFER_CHARACTERISTICS_LOG100_SQRT10() {
		return SDL_TRANSFER_CHARACTERISTICS_LOG100_SQRT10;
	}

	private static final int SDL_TRANSFER_CHARACTERISTICS_IEC61966 = (int) 11L;

	public static int SDL_TRANSFER_CHARACTERISTICS_IEC61966() {
		return SDL_TRANSFER_CHARACTERISTICS_IEC61966;
	}

	private static final int SDL_TRANSFER_CHARACTERISTICS_BT1361 = (int) 12L;

	public static int SDL_TRANSFER_CHARACTERISTICS_BT1361() {
		return SDL_TRANSFER_CHARACTERISTICS_BT1361;
	}

	private static final int SDL_TRANSFER_CHARACTERISTICS_SRGB = (int) 13L;

	public static int SDL_TRANSFER_CHARACTERISTICS_SRGB() {
		return SDL_TRANSFER_CHARACTERISTICS_SRGB;
	}

	private static final int SDL_TRANSFER_CHARACTERISTICS_BT2020_10BIT = (int) 14L;

	public static int SDL_TRANSFER_CHARACTERISTICS_BT2020_10BIT() {
		return SDL_TRANSFER_CHARACTERISTICS_BT2020_10BIT;
	}

	private static final int SDL_TRANSFER_CHARACTERISTICS_BT2020_12BIT = (int) 15L;

	public static int SDL_TRANSFER_CHARACTERISTICS_BT2020_12BIT() {
		return SDL_TRANSFER_CHARACTERISTICS_BT2020_12BIT;
	}

	private static final int SDL_TRANSFER_CHARACTERISTICS_PQ = (int) 16L;

	public static int SDL_TRANSFER_CHARACTERISTICS_PQ() {
		return SDL_TRANSFER_CHARACTERISTICS_PQ;
	}

	private static final int SDL_TRANSFER_CHARACTERISTICS_SMPTE428 = (int) 17L;

	public static int SDL_TRANSFER_CHARACTERISTICS_SMPTE428() {
		return SDL_TRANSFER_CHARACTERISTICS_SMPTE428;
	}

	private static final int SDL_TRANSFER_CHARACTERISTICS_HLG = (int) 18L;

	public static int SDL_TRANSFER_CHARACTERISTICS_HLG() {
		return SDL_TRANSFER_CHARACTERISTICS_HLG;
	}

	private static final int SDL_TRANSFER_CHARACTERISTICS_CUSTOM = (int) 31L;

	public static int SDL_TRANSFER_CHARACTERISTICS_CUSTOM() {
		return SDL_TRANSFER_CHARACTERISTICS_CUSTOM;
	}

	private static final int SDL_MATRIX_COEFFICIENTS_IDENTITY = (int) 0L;

	public static int SDL_MATRIX_COEFFICIENTS_IDENTITY() {
		return SDL_MATRIX_COEFFICIENTS_IDENTITY;
	}

	private static final int SDL_MATRIX_COEFFICIENTS_BT709 = (int) 1L;

	public static int SDL_MATRIX_COEFFICIENTS_BT709() {
		return SDL_MATRIX_COEFFICIENTS_BT709;
	}

	private static final int SDL_MATRIX_COEFFICIENTS_UNSPECIFIED = (int) 2L;

	public static int SDL_MATRIX_COEFFICIENTS_UNSPECIFIED() {
		return SDL_MATRIX_COEFFICIENTS_UNSPECIFIED;
	}

	private static final int SDL_MATRIX_COEFFICIENTS_FCC = (int) 4L;

	public static int SDL_MATRIX_COEFFICIENTS_FCC() {
		return SDL_MATRIX_COEFFICIENTS_FCC;
	}

	private static final int SDL_MATRIX_COEFFICIENTS_BT470BG = (int) 5L;

	public static int SDL_MATRIX_COEFFICIENTS_BT470BG() {
		return SDL_MATRIX_COEFFICIENTS_BT470BG;
	}

	private static final int SDL_MATRIX_COEFFICIENTS_BT601 = (int) 6L;

	public static int SDL_MATRIX_COEFFICIENTS_BT601() {
		return SDL_MATRIX_COEFFICIENTS_BT601;
	}

	private static final int SDL_MATRIX_COEFFICIENTS_SMPTE240 = (int) 7L;

	public static int SDL_MATRIX_COEFFICIENTS_SMPTE240() {
		return SDL_MATRIX_COEFFICIENTS_SMPTE240;
	}

	private static final int SDL_MATRIX_COEFFICIENTS_YCGCO = (int) 8L;

	public static int SDL_MATRIX_COEFFICIENTS_YCGCO() {
		return SDL_MATRIX_COEFFICIENTS_YCGCO;
	}

	private static final int SDL_MATRIX_COEFFICIENTS_BT2020_NCL = (int) 9L;

	public static int SDL_MATRIX_COEFFICIENTS_BT2020_NCL() {
		return SDL_MATRIX_COEFFICIENTS_BT2020_NCL;
	}

	private static final int SDL_MATRIX_COEFFICIENTS_BT2020_CL = (int) 10L;

	public static int SDL_MATRIX_COEFFICIENTS_BT2020_CL() {
		return SDL_MATRIX_COEFFICIENTS_BT2020_CL;
	}

	private static final int SDL_MATRIX_COEFFICIENTS_SMPTE2085 = (int) 11L;

	public static int SDL_MATRIX_COEFFICIENTS_SMPTE2085() {
		return SDL_MATRIX_COEFFICIENTS_SMPTE2085;
	}

	private static final int SDL_MATRIX_COEFFICIENTS_CHROMA_DERIVED_NCL = (int) 12L;

	public static int SDL_MATRIX_COEFFICIENTS_CHROMA_DERIVED_NCL() {
		return SDL_MATRIX_COEFFICIENTS_CHROMA_DERIVED_NCL;
	}

	private static final int SDL_MATRIX_COEFFICIENTS_CHROMA_DERIVED_CL = (int) 13L;

	public static int SDL_MATRIX_COEFFICIENTS_CHROMA_DERIVED_CL() {
		return SDL_MATRIX_COEFFICIENTS_CHROMA_DERIVED_CL;
	}

	private static final int SDL_MATRIX_COEFFICIENTS_ICTCP = (int) 14L;

	public static int SDL_MATRIX_COEFFICIENTS_ICTCP() {
		return SDL_MATRIX_COEFFICIENTS_ICTCP;
	}

	private static final int SDL_MATRIX_COEFFICIENTS_CUSTOM = (int) 31L;

	public static int SDL_MATRIX_COEFFICIENTS_CUSTOM() {
		return SDL_MATRIX_COEFFICIENTS_CUSTOM;
	}

	private static final int SDL_CHROMA_LOCATION_NONE = (int) 0L;

	public static int SDL_CHROMA_LOCATION_NONE() {
		return SDL_CHROMA_LOCATION_NONE;
	}

	private static final int SDL_CHROMA_LOCATION_LEFT = (int) 1L;

	public static int SDL_CHROMA_LOCATION_LEFT() {
		return SDL_CHROMA_LOCATION_LEFT;
	}

	private static final int SDL_CHROMA_LOCATION_CENTER = (int) 2L;

	public static int SDL_CHROMA_LOCATION_CENTER() {
		return SDL_CHROMA_LOCATION_CENTER;
	}

	private static final int SDL_CHROMA_LOCATION_TOPLEFT = (int) 3L;

	public static int SDL_CHROMA_LOCATION_TOPLEFT() {
		return SDL_CHROMA_LOCATION_TOPLEFT;
	}

	private static final int SDL_COLORSPACE_UNKNOWN = (int) 0L;

	public static int SDL_COLORSPACE_UNKNOWN() {
		return SDL_COLORSPACE_UNKNOWN;
	}

	private static final int SDL_COLORSPACE_SRGB = (int) 301991328L;

	public static int SDL_COLORSPACE_SRGB() {
		return SDL_COLORSPACE_SRGB;
	}

	private static final int SDL_COLORSPACE_SRGB_LINEAR = (int) 301991168L;

	public static int SDL_COLORSPACE_SRGB_LINEAR() {
		return SDL_COLORSPACE_SRGB_LINEAR;
	}

	private static final int SDL_COLORSPACE_HDR10 = (int) 301999616L;

	public static int SDL_COLORSPACE_HDR10() {
		return SDL_COLORSPACE_HDR10;
	}

	private static final int SDL_COLORSPACE_JPEG = (int) 570426566L;

	public static int SDL_COLORSPACE_JPEG() {
		return SDL_COLORSPACE_JPEG;
	}

	private static final int SDL_COLORSPACE_BT601_LIMITED = (int) 554703046L;

	public static int SDL_COLORSPACE_BT601_LIMITED() {
		return SDL_COLORSPACE_BT601_LIMITED;
	}

	private static final int SDL_COLORSPACE_BT601_FULL = (int) 571480262L;

	public static int SDL_COLORSPACE_BT601_FULL() {
		return SDL_COLORSPACE_BT601_FULL;
	}

	private static final int SDL_COLORSPACE_BT709_LIMITED = (int) 554697761L;

	public static int SDL_COLORSPACE_BT709_LIMITED() {
		return SDL_COLORSPACE_BT709_LIMITED;
	}

	private static final int SDL_COLORSPACE_BT709_FULL = (int) 571474977L;

	public static int SDL_COLORSPACE_BT709_FULL() {
		return SDL_COLORSPACE_BT709_FULL;
	}

	private static final int SDL_COLORSPACE_BT2020_LIMITED = (int) 554706441L;

	public static int SDL_COLORSPACE_BT2020_LIMITED() {
		return SDL_COLORSPACE_BT2020_LIMITED;
	}

	private static final int SDL_COLORSPACE_BT2020_FULL = (int) 571483657L;

	public static int SDL_COLORSPACE_BT2020_FULL() {
		return SDL_COLORSPACE_BT2020_FULL;
	}

	private static final int SDL_COLORSPACE_RGB_DEFAULT = (int) 301991328L;

	public static int SDL_COLORSPACE_RGB_DEFAULT() {
		return SDL_COLORSPACE_RGB_DEFAULT;
	}

	private static final int SDL_COLORSPACE_YUV_DEFAULT = (int) 554703046L;

	public static int SDL_COLORSPACE_YUV_DEFAULT() {
		return SDL_COLORSPACE_YUV_DEFAULT;
	}

	private static class SDL_GetPixelFormatName {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetPixelFormatName");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetPixelFormatName$descriptor() {
		return SDL_GetPixelFormatName.DESC;
	}

	public static MethodHandle SDL_GetPixelFormatName$handle() {
		return SDL_GetPixelFormatName.HANDLE;
	}

	public static MemorySegment SDL_GetPixelFormatName$address() {
		return SDL_GetPixelFormatName.ADDR;
	}

	public static MemorySegment SDL_GetPixelFormatName(int format) {
		var mh$ = SDL_GetPixelFormatName.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetPixelFormatName", format);
			}
			return (MemorySegment) mh$.invokeExact(format);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetMasksForPixelFormat {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetMasksForPixelFormat");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetMasksForPixelFormat$descriptor() {
		return SDL_GetMasksForPixelFormat.DESC;
	}

	public static MethodHandle SDL_GetMasksForPixelFormat$handle() {
		return SDL_GetMasksForPixelFormat.HANDLE;
	}

	public static MemorySegment SDL_GetMasksForPixelFormat$address() {
		return SDL_GetMasksForPixelFormat.ADDR;
	}

	public static boolean SDL_GetMasksForPixelFormat(int format, MemorySegment bpp, MemorySegment Rmask, MemorySegment Gmask, MemorySegment Bmask, MemorySegment Amask) {
		var mh$ = SDL_GetMasksForPixelFormat.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetMasksForPixelFormat", format, bpp, Rmask, Gmask, Bmask, Amask);
			}
			return (boolean) mh$.invokeExact(format, bpp, Rmask, Gmask, Bmask, Amask);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetPixelFormatForMasks {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetPixelFormatForMasks");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetPixelFormatForMasks$descriptor() {
		return SDL_GetPixelFormatForMasks.DESC;
	}

	public static MethodHandle SDL_GetPixelFormatForMasks$handle() {
		return SDL_GetPixelFormatForMasks.HANDLE;
	}

	public static MemorySegment SDL_GetPixelFormatForMasks$address() {
		return SDL_GetPixelFormatForMasks.ADDR;
	}

	public static int SDL_GetPixelFormatForMasks(int bpp, int Rmask, int Gmask, int Bmask, int Amask) {
		var mh$ = SDL_GetPixelFormatForMasks.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetPixelFormatForMasks", bpp, Rmask, Gmask, Bmask, Amask);
			}
			return (int) mh$.invokeExact(bpp, Rmask, Gmask, Bmask, Amask);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetPixelFormatDetails {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetPixelFormatDetails");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetPixelFormatDetails$descriptor() {
		return SDL_GetPixelFormatDetails.DESC;
	}

	public static MethodHandle SDL_GetPixelFormatDetails$handle() {
		return SDL_GetPixelFormatDetails.HANDLE;
	}

	public static MemorySegment SDL_GetPixelFormatDetails$address() {
		return SDL_GetPixelFormatDetails.ADDR;
	}

	public static MemorySegment SDL_GetPixelFormatDetails(int format) {
		var mh$ = SDL_GetPixelFormatDetails.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetPixelFormatDetails", format);
			}
			return (MemorySegment) mh$.invokeExact(format);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreatePalette {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreatePalette");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreatePalette$descriptor() {
		return SDL_CreatePalette.DESC;
	}

	public static MethodHandle SDL_CreatePalette$handle() {
		return SDL_CreatePalette.HANDLE;
	}

	public static MemorySegment SDL_CreatePalette$address() {
		return SDL_CreatePalette.ADDR;
	}

	public static MemorySegment SDL_CreatePalette(int ncolors) {
		var mh$ = SDL_CreatePalette.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreatePalette", ncolors);
			}
			return (MemorySegment) mh$.invokeExact(ncolors);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetPaletteColors {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetPaletteColors");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetPaletteColors$descriptor() {
		return SDL_SetPaletteColors.DESC;
	}

	public static MethodHandle SDL_SetPaletteColors$handle() {
		return SDL_SetPaletteColors.HANDLE;
	}

	public static MemorySegment SDL_SetPaletteColors$address() {
		return SDL_SetPaletteColors.ADDR;
	}

	public static boolean SDL_SetPaletteColors(MemorySegment palette, MemorySegment colors, int firstcolor, int ncolors) {
		var mh$ = SDL_SetPaletteColors.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetPaletteColors", palette, colors, firstcolor, ncolors);
			}
			return (boolean) mh$.invokeExact(palette, colors, firstcolor, ncolors);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DestroyPalette {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DestroyPalette");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DestroyPalette$descriptor() {
		return SDL_DestroyPalette.DESC;
	}

	public static MethodHandle SDL_DestroyPalette$handle() {
		return SDL_DestroyPalette.HANDLE;
	}

	public static MemorySegment SDL_DestroyPalette$address() {
		return SDL_DestroyPalette.ADDR;
	}

	public static void SDL_DestroyPalette(MemorySegment palette) {
		var mh$ = SDL_DestroyPalette.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DestroyPalette", palette);
			}
			mh$.invokeExact(palette);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_MapRGB {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_CHAR,
				SDL3.C_CHAR,
				SDL3.C_CHAR
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_MapRGB");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_MapRGB$descriptor() {
		return SDL_MapRGB.DESC;
	}

	public static MethodHandle SDL_MapRGB$handle() {
		return SDL_MapRGB.HANDLE;
	}

	public static MemorySegment SDL_MapRGB$address() {
		return SDL_MapRGB.ADDR;
	}

	public static int SDL_MapRGB(MemorySegment format, MemorySegment palette, byte r, byte g, byte b) {
		var mh$ = SDL_MapRGB.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_MapRGB", format, palette, r, g, b);
			}
			return (int) mh$.invokeExact(format, palette, r, g, b);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_MapRGBA {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_CHAR,
				SDL3.C_CHAR,
				SDL3.C_CHAR,
				SDL3.C_CHAR
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_MapRGBA");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_MapRGBA$descriptor() {
		return SDL_MapRGBA.DESC;
	}

	public static MethodHandle SDL_MapRGBA$handle() {
		return SDL_MapRGBA.HANDLE;
	}

	public static MemorySegment SDL_MapRGBA$address() {
		return SDL_MapRGBA.ADDR;
	}

	public static int SDL_MapRGBA(MemorySegment format, MemorySegment palette, byte r, byte g, byte b, byte a) {
		var mh$ = SDL_MapRGBA.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_MapRGBA", format, palette, r, g, b, a);
			}
			return (int) mh$.invokeExact(format, palette, r, g, b, a);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRGB {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRGB");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRGB$descriptor() {
		return SDL_GetRGB.DESC;
	}

	public static MethodHandle SDL_GetRGB$handle() {
		return SDL_GetRGB.HANDLE;
	}

	public static MemorySegment SDL_GetRGB$address() {
		return SDL_GetRGB.ADDR;
	}

	public static void SDL_GetRGB(int pixelvalue, MemorySegment format, MemorySegment palette, MemorySegment r, MemorySegment g, MemorySegment b) {
		var mh$ = SDL_GetRGB.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRGB", pixelvalue, format, palette, r, g, b);
			}
			mh$.invokeExact(pixelvalue, format, palette, r, g, b);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRGBA {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRGBA");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRGBA$descriptor() {
		return SDL_GetRGBA.DESC;
	}

	public static MethodHandle SDL_GetRGBA$handle() {
		return SDL_GetRGBA.HANDLE;
	}

	public static MemorySegment SDL_GetRGBA$address() {
		return SDL_GetRGBA.ADDR;
	}

	public static void SDL_GetRGBA(int pixelvalue, MemorySegment format, MemorySegment palette, MemorySegment r, MemorySegment g, MemorySegment b, MemorySegment a) {
		var mh$ = SDL_GetRGBA.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRGBA", pixelvalue, format, palette, r, g, b, a);
			}
			mh$.invokeExact(pixelvalue, format, palette, r, g, b, a);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_HasRectIntersection {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_HasRectIntersection");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_HasRectIntersection$descriptor() {
		return SDL_HasRectIntersection.DESC;
	}

	public static MethodHandle SDL_HasRectIntersection$handle() {
		return SDL_HasRectIntersection.HANDLE;
	}

	public static MemorySegment SDL_HasRectIntersection$address() {
		return SDL_HasRectIntersection.ADDR;
	}

	public static boolean SDL_HasRectIntersection(MemorySegment A, MemorySegment B) {
		var mh$ = SDL_HasRectIntersection.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_HasRectIntersection", A, B);
			}
			return (boolean) mh$.invokeExact(A, B);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRectIntersection {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRectIntersection");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRectIntersection$descriptor() {
		return SDL_GetRectIntersection.DESC;
	}

	public static MethodHandle SDL_GetRectIntersection$handle() {
		return SDL_GetRectIntersection.HANDLE;
	}

	public static MemorySegment SDL_GetRectIntersection$address() {
		return SDL_GetRectIntersection.ADDR;
	}

	public static boolean SDL_GetRectIntersection(MemorySegment A, MemorySegment B, MemorySegment result) {
		var mh$ = SDL_GetRectIntersection.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRectIntersection", A, B, result);
			}
			return (boolean) mh$.invokeExact(A, B, result);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRectUnion {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRectUnion");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRectUnion$descriptor() {
		return SDL_GetRectUnion.DESC;
	}

	public static MethodHandle SDL_GetRectUnion$handle() {
		return SDL_GetRectUnion.HANDLE;
	}

	public static MemorySegment SDL_GetRectUnion$address() {
		return SDL_GetRectUnion.ADDR;
	}

	public static boolean SDL_GetRectUnion(MemorySegment A, MemorySegment B, MemorySegment result) {
		var mh$ = SDL_GetRectUnion.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRectUnion", A, B, result);
			}
			return (boolean) mh$.invokeExact(A, B, result);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRectEnclosingPoints {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRectEnclosingPoints");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRectEnclosingPoints$descriptor() {
		return SDL_GetRectEnclosingPoints.DESC;
	}

	public static MethodHandle SDL_GetRectEnclosingPoints$handle() {
		return SDL_GetRectEnclosingPoints.HANDLE;
	}

	public static MemorySegment SDL_GetRectEnclosingPoints$address() {
		return SDL_GetRectEnclosingPoints.ADDR;
	}

	public static boolean SDL_GetRectEnclosingPoints(MemorySegment points, int count, MemorySegment clip, MemorySegment result) {
		var mh$ = SDL_GetRectEnclosingPoints.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRectEnclosingPoints", points, count, clip, result);
			}
			return (boolean) mh$.invokeExact(points, count, clip, result);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRectAndLineIntersection {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRectAndLineIntersection");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRectAndLineIntersection$descriptor() {
		return SDL_GetRectAndLineIntersection.DESC;
	}

	public static MethodHandle SDL_GetRectAndLineIntersection$handle() {
		return SDL_GetRectAndLineIntersection.HANDLE;
	}

	public static MemorySegment SDL_GetRectAndLineIntersection$address() {
		return SDL_GetRectAndLineIntersection.ADDR;
	}

	public static boolean SDL_GetRectAndLineIntersection(MemorySegment rect, MemorySegment X1, MemorySegment Y1, MemorySegment X2, MemorySegment Y2) {
		var mh$ = SDL_GetRectAndLineIntersection.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRectAndLineIntersection", rect, X1, Y1, X2, Y2);
			}
			return (boolean) mh$.invokeExact(rect, X1, Y1, X2, Y2);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_HasRectIntersectionFloat {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_HasRectIntersectionFloat");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_HasRectIntersectionFloat$descriptor() {
		return SDL_HasRectIntersectionFloat.DESC;
	}

	public static MethodHandle SDL_HasRectIntersectionFloat$handle() {
		return SDL_HasRectIntersectionFloat.HANDLE;
	}

	public static MemorySegment SDL_HasRectIntersectionFloat$address() {
		return SDL_HasRectIntersectionFloat.ADDR;
	}

	public static boolean SDL_HasRectIntersectionFloat(MemorySegment A, MemorySegment B) {
		var mh$ = SDL_HasRectIntersectionFloat.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_HasRectIntersectionFloat", A, B);
			}
			return (boolean) mh$.invokeExact(A, B);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRectIntersectionFloat {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRectIntersectionFloat");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRectIntersectionFloat$descriptor() {
		return SDL_GetRectIntersectionFloat.DESC;
	}

	public static MethodHandle SDL_GetRectIntersectionFloat$handle() {
		return SDL_GetRectIntersectionFloat.HANDLE;
	}

	public static MemorySegment SDL_GetRectIntersectionFloat$address() {
		return SDL_GetRectIntersectionFloat.ADDR;
	}

	public static boolean SDL_GetRectIntersectionFloat(MemorySegment A, MemorySegment B, MemorySegment result) {
		var mh$ = SDL_GetRectIntersectionFloat.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRectIntersectionFloat", A, B, result);
			}
			return (boolean) mh$.invokeExact(A, B, result);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRectUnionFloat {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRectUnionFloat");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRectUnionFloat$descriptor() {
		return SDL_GetRectUnionFloat.DESC;
	}

	public static MethodHandle SDL_GetRectUnionFloat$handle() {
		return SDL_GetRectUnionFloat.HANDLE;
	}

	public static MemorySegment SDL_GetRectUnionFloat$address() {
		return SDL_GetRectUnionFloat.ADDR;
	}

	public static boolean SDL_GetRectUnionFloat(MemorySegment A, MemorySegment B, MemorySegment result) {
		var mh$ = SDL_GetRectUnionFloat.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRectUnionFloat", A, B, result);
			}
			return (boolean) mh$.invokeExact(A, B, result);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRectEnclosingPointsFloat {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRectEnclosingPointsFloat");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRectEnclosingPointsFloat$descriptor() {
		return SDL_GetRectEnclosingPointsFloat.DESC;
	}

	public static MethodHandle SDL_GetRectEnclosingPointsFloat$handle() {
		return SDL_GetRectEnclosingPointsFloat.HANDLE;
	}

	public static MemorySegment SDL_GetRectEnclosingPointsFloat$address() {
		return SDL_GetRectEnclosingPointsFloat.ADDR;
	}

	public static boolean SDL_GetRectEnclosingPointsFloat(MemorySegment points, int count, MemorySegment clip, MemorySegment result) {
		var mh$ = SDL_GetRectEnclosingPointsFloat.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRectEnclosingPointsFloat", points, count, clip, result);
			}
			return (boolean) mh$.invokeExact(points, count, clip, result);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRectAndLineIntersectionFloat {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRectAndLineIntersectionFloat");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRectAndLineIntersectionFloat$descriptor() {
		return SDL_GetRectAndLineIntersectionFloat.DESC;
	}

	public static MethodHandle SDL_GetRectAndLineIntersectionFloat$handle() {
		return SDL_GetRectAndLineIntersectionFloat.HANDLE;
	}

	public static MemorySegment SDL_GetRectAndLineIntersectionFloat$address() {
		return SDL_GetRectAndLineIntersectionFloat.ADDR;
	}

	public static boolean SDL_GetRectAndLineIntersectionFloat(MemorySegment rect, MemorySegment X1, MemorySegment Y1, MemorySegment X2, MemorySegment Y2) {
		var mh$ = SDL_GetRectAndLineIntersectionFloat.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRectAndLineIntersectionFloat", rect, X1, Y1, X2, Y2);
			}
			return (boolean) mh$.invokeExact(rect, X1, Y1, X2, Y2);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	public static OfInt SDL_SurfaceFlags = SDL3.C_INT;
	private static final int SDL_SCALEMODE_INVALID = (int) -1L;

	public static int SDL_SCALEMODE_INVALID() {
		return SDL_SCALEMODE_INVALID;
	}

	private static final int SDL_SCALEMODE_NEAREST = (int) 0L;

	public static int SDL_SCALEMODE_NEAREST() {
		return SDL_SCALEMODE_NEAREST;
	}

	private static final int SDL_SCALEMODE_LINEAR = (int) 1L;

	public static int SDL_SCALEMODE_LINEAR() {
		return SDL_SCALEMODE_LINEAR;
	}

	private static final int SDL_SCALEMODE_PIXELART = (int) 2L;

	public static int SDL_SCALEMODE_PIXELART() {
		return SDL_SCALEMODE_PIXELART;
	}

	private static final int SDL_FLIP_NONE = (int) 0L;

	public static int SDL_FLIP_NONE() {
		return SDL_FLIP_NONE;
	}

	private static final int SDL_FLIP_HORIZONTAL = (int) 1L;

	public static int SDL_FLIP_HORIZONTAL() {
		return SDL_FLIP_HORIZONTAL;
	}

	private static final int SDL_FLIP_VERTICAL = (int) 2L;

	public static int SDL_FLIP_VERTICAL() {
		return SDL_FLIP_VERTICAL;
	}

	private static final int SDL_FLIP_HORIZONTAL_AND_VERTICAL = (int) 3L;

	public static int SDL_FLIP_HORIZONTAL_AND_VERTICAL() {
		return SDL_FLIP_HORIZONTAL_AND_VERTICAL;
	}

	private static class SDL_CreateSurface {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateSurface");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateSurface$descriptor() {
		return SDL_CreateSurface.DESC;
	}

	public static MethodHandle SDL_CreateSurface$handle() {
		return SDL_CreateSurface.HANDLE;
	}

	public static MemorySegment SDL_CreateSurface$address() {
		return SDL_CreateSurface.ADDR;
	}

	public static MemorySegment SDL_CreateSurface(int width, int height, int format) {
		var mh$ = SDL_CreateSurface.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateSurface", width, height, format);
			}
			return (MemorySegment) mh$.invokeExact(width, height, format);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateSurfaceFrom {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateSurfaceFrom");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateSurfaceFrom$descriptor() {
		return SDL_CreateSurfaceFrom.DESC;
	}

	public static MethodHandle SDL_CreateSurfaceFrom$handle() {
		return SDL_CreateSurfaceFrom.HANDLE;
	}

	public static MemorySegment SDL_CreateSurfaceFrom$address() {
		return SDL_CreateSurfaceFrom.ADDR;
	}

	public static MemorySegment SDL_CreateSurfaceFrom(int width, int height, int format, MemorySegment pixels, int pitch) {
		var mh$ = SDL_CreateSurfaceFrom.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateSurfaceFrom", width, height, format, pixels, pitch);
			}
			return (MemorySegment) mh$.invokeExact(width, height, format, pixels, pitch);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DestroySurface {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DestroySurface");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DestroySurface$descriptor() {
		return SDL_DestroySurface.DESC;
	}

	public static MethodHandle SDL_DestroySurface$handle() {
		return SDL_DestroySurface.HANDLE;
	}

	public static MemorySegment SDL_DestroySurface$address() {
		return SDL_DestroySurface.ADDR;
	}

	public static void SDL_DestroySurface(MemorySegment surface) {
		var mh$ = SDL_DestroySurface.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DestroySurface", surface);
			}
			mh$.invokeExact(surface);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetSurfaceProperties {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetSurfaceProperties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetSurfaceProperties$descriptor() {
		return SDL_GetSurfaceProperties.DESC;
	}

	public static MethodHandle SDL_GetSurfaceProperties$handle() {
		return SDL_GetSurfaceProperties.HANDLE;
	}

	public static MemorySegment SDL_GetSurfaceProperties$address() {
		return SDL_GetSurfaceProperties.ADDR;
	}

	public static int SDL_GetSurfaceProperties(MemorySegment surface) {
		var mh$ = SDL_GetSurfaceProperties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetSurfaceProperties", surface);
			}
			return (int) mh$.invokeExact(surface);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetSurfaceColorspace {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetSurfaceColorspace");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetSurfaceColorspace$descriptor() {
		return SDL_SetSurfaceColorspace.DESC;
	}

	public static MethodHandle SDL_SetSurfaceColorspace$handle() {
		return SDL_SetSurfaceColorspace.HANDLE;
	}

	public static MemorySegment SDL_SetSurfaceColorspace$address() {
		return SDL_SetSurfaceColorspace.ADDR;
	}

	public static boolean SDL_SetSurfaceColorspace(MemorySegment surface, int colorspace) {
		var mh$ = SDL_SetSurfaceColorspace.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetSurfaceColorspace", surface, colorspace);
			}
			return (boolean) mh$.invokeExact(surface, colorspace);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetSurfaceColorspace {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetSurfaceColorspace");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetSurfaceColorspace$descriptor() {
		return SDL_GetSurfaceColorspace.DESC;
	}

	public static MethodHandle SDL_GetSurfaceColorspace$handle() {
		return SDL_GetSurfaceColorspace.HANDLE;
	}

	public static MemorySegment SDL_GetSurfaceColorspace$address() {
		return SDL_GetSurfaceColorspace.ADDR;
	}

	public static int SDL_GetSurfaceColorspace(MemorySegment surface) {
		var mh$ = SDL_GetSurfaceColorspace.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetSurfaceColorspace", surface);
			}
			return (int) mh$.invokeExact(surface);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateSurfacePalette {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateSurfacePalette");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateSurfacePalette$descriptor() {
		return SDL_CreateSurfacePalette.DESC;
	}

	public static MethodHandle SDL_CreateSurfacePalette$handle() {
		return SDL_CreateSurfacePalette.HANDLE;
	}

	public static MemorySegment SDL_CreateSurfacePalette$address() {
		return SDL_CreateSurfacePalette.ADDR;
	}

	public static MemorySegment SDL_CreateSurfacePalette(MemorySegment surface) {
		var mh$ = SDL_CreateSurfacePalette.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateSurfacePalette", surface);
			}
			return (MemorySegment) mh$.invokeExact(surface);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetSurfacePalette {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetSurfacePalette");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetSurfacePalette$descriptor() {
		return SDL_SetSurfacePalette.DESC;
	}

	public static MethodHandle SDL_SetSurfacePalette$handle() {
		return SDL_SetSurfacePalette.HANDLE;
	}

	public static MemorySegment SDL_SetSurfacePalette$address() {
		return SDL_SetSurfacePalette.ADDR;
	}

	public static boolean SDL_SetSurfacePalette(MemorySegment surface, MemorySegment palette) {
		var mh$ = SDL_SetSurfacePalette.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetSurfacePalette", surface, palette);
			}
			return (boolean) mh$.invokeExact(surface, palette);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetSurfacePalette {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetSurfacePalette");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetSurfacePalette$descriptor() {
		return SDL_GetSurfacePalette.DESC;
	}

	public static MethodHandle SDL_GetSurfacePalette$handle() {
		return SDL_GetSurfacePalette.HANDLE;
	}

	public static MemorySegment SDL_GetSurfacePalette$address() {
		return SDL_GetSurfacePalette.ADDR;
	}

	public static MemorySegment SDL_GetSurfacePalette(MemorySegment surface) {
		var mh$ = SDL_GetSurfacePalette.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetSurfacePalette", surface);
			}
			return (MemorySegment) mh$.invokeExact(surface);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_AddSurfaceAlternateImage {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_AddSurfaceAlternateImage");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_AddSurfaceAlternateImage$descriptor() {
		return SDL_AddSurfaceAlternateImage.DESC;
	}

	public static MethodHandle SDL_AddSurfaceAlternateImage$handle() {
		return SDL_AddSurfaceAlternateImage.HANDLE;
	}

	public static MemorySegment SDL_AddSurfaceAlternateImage$address() {
		return SDL_AddSurfaceAlternateImage.ADDR;
	}

	public static boolean SDL_AddSurfaceAlternateImage(MemorySegment surface, MemorySegment image) {
		var mh$ = SDL_AddSurfaceAlternateImage.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_AddSurfaceAlternateImage", surface, image);
			}
			return (boolean) mh$.invokeExact(surface, image);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SurfaceHasAlternateImages {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SurfaceHasAlternateImages");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SurfaceHasAlternateImages$descriptor() {
		return SDL_SurfaceHasAlternateImages.DESC;
	}

	public static MethodHandle SDL_SurfaceHasAlternateImages$handle() {
		return SDL_SurfaceHasAlternateImages.HANDLE;
	}

	public static MemorySegment SDL_SurfaceHasAlternateImages$address() {
		return SDL_SurfaceHasAlternateImages.ADDR;
	}

	public static boolean SDL_SurfaceHasAlternateImages(MemorySegment surface) {
		var mh$ = SDL_SurfaceHasAlternateImages.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SurfaceHasAlternateImages", surface);
			}
			return (boolean) mh$.invokeExact(surface);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetSurfaceImages {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetSurfaceImages");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetSurfaceImages$descriptor() {
		return SDL_GetSurfaceImages.DESC;
	}

	public static MethodHandle SDL_GetSurfaceImages$handle() {
		return SDL_GetSurfaceImages.HANDLE;
	}

	public static MemorySegment SDL_GetSurfaceImages$address() {
		return SDL_GetSurfaceImages.ADDR;
	}

	public static MemorySegment SDL_GetSurfaceImages(MemorySegment surface, MemorySegment count) {
		var mh$ = SDL_GetSurfaceImages.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetSurfaceImages", surface, count);
			}
			return (MemorySegment) mh$.invokeExact(surface, count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RemoveSurfaceAlternateImages {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RemoveSurfaceAlternateImages");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RemoveSurfaceAlternateImages$descriptor() {
		return SDL_RemoveSurfaceAlternateImages.DESC;
	}

	public static MethodHandle SDL_RemoveSurfaceAlternateImages$handle() {
		return SDL_RemoveSurfaceAlternateImages.HANDLE;
	}

	public static MemorySegment SDL_RemoveSurfaceAlternateImages$address() {
		return SDL_RemoveSurfaceAlternateImages.ADDR;
	}

	public static void SDL_RemoveSurfaceAlternateImages(MemorySegment surface) {
		var mh$ = SDL_RemoveSurfaceAlternateImages.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RemoveSurfaceAlternateImages", surface);
			}
			mh$.invokeExact(surface);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_LockSurface {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_LockSurface");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_LockSurface$descriptor() {
		return SDL_LockSurface.DESC;
	}

	public static MethodHandle SDL_LockSurface$handle() {
		return SDL_LockSurface.HANDLE;
	}

	public static MemorySegment SDL_LockSurface$address() {
		return SDL_LockSurface.ADDR;
	}

	public static boolean SDL_LockSurface(MemorySegment surface) {
		var mh$ = SDL_LockSurface.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_LockSurface", surface);
			}
			return (boolean) mh$.invokeExact(surface);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_UnlockSurface {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_UnlockSurface");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_UnlockSurface$descriptor() {
		return SDL_UnlockSurface.DESC;
	}

	public static MethodHandle SDL_UnlockSurface$handle() {
		return SDL_UnlockSurface.HANDLE;
	}

	public static MemorySegment SDL_UnlockSurface$address() {
		return SDL_UnlockSurface.ADDR;
	}

	public static void SDL_UnlockSurface(MemorySegment surface) {
		var mh$ = SDL_UnlockSurface.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_UnlockSurface", surface);
			}
			mh$.invokeExact(surface);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_LoadSurface_IO {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_LoadSurface_IO");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_LoadSurface_IO$descriptor() {
		return SDL_LoadSurface_IO.DESC;
	}

	public static MethodHandle SDL_LoadSurface_IO$handle() {
		return SDL_LoadSurface_IO.HANDLE;
	}

	public static MemorySegment SDL_LoadSurface_IO$address() {
		return SDL_LoadSurface_IO.ADDR;
	}

	public static MemorySegment SDL_LoadSurface_IO(MemorySegment src, boolean closeio) {
		var mh$ = SDL_LoadSurface_IO.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_LoadSurface_IO", src, closeio);
			}
			return (MemorySegment) mh$.invokeExact(src, closeio);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_LoadSurface {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_LoadSurface");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_LoadSurface$descriptor() {
		return SDL_LoadSurface.DESC;
	}

	public static MethodHandle SDL_LoadSurface$handle() {
		return SDL_LoadSurface.HANDLE;
	}

	public static MemorySegment SDL_LoadSurface$address() {
		return SDL_LoadSurface.ADDR;
	}

	public static MemorySegment SDL_LoadSurface(MemorySegment file) {
		var mh$ = SDL_LoadSurface.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_LoadSurface", file);
			}
			return (MemorySegment) mh$.invokeExact(file);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_LoadBMP_IO {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_LoadBMP_IO");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_LoadBMP_IO$descriptor() {
		return SDL_LoadBMP_IO.DESC;
	}

	public static MethodHandle SDL_LoadBMP_IO$handle() {
		return SDL_LoadBMP_IO.HANDLE;
	}

	public static MemorySegment SDL_LoadBMP_IO$address() {
		return SDL_LoadBMP_IO.ADDR;
	}

	public static MemorySegment SDL_LoadBMP_IO(MemorySegment src, boolean closeio) {
		var mh$ = SDL_LoadBMP_IO.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_LoadBMP_IO", src, closeio);
			}
			return (MemorySegment) mh$.invokeExact(src, closeio);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_LoadBMP {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_LoadBMP");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_LoadBMP$descriptor() {
		return SDL_LoadBMP.DESC;
	}

	public static MethodHandle SDL_LoadBMP$handle() {
		return SDL_LoadBMP.HANDLE;
	}

	public static MemorySegment SDL_LoadBMP$address() {
		return SDL_LoadBMP.ADDR;
	}

	public static MemorySegment SDL_LoadBMP(MemorySegment file) {
		var mh$ = SDL_LoadBMP.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_LoadBMP", file);
			}
			return (MemorySegment) mh$.invokeExact(file);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SaveBMP_IO {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SaveBMP_IO");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SaveBMP_IO$descriptor() {
		return SDL_SaveBMP_IO.DESC;
	}

	public static MethodHandle SDL_SaveBMP_IO$handle() {
		return SDL_SaveBMP_IO.HANDLE;
	}

	public static MemorySegment SDL_SaveBMP_IO$address() {
		return SDL_SaveBMP_IO.ADDR;
	}

	public static boolean SDL_SaveBMP_IO(MemorySegment surface, MemorySegment dst, boolean closeio) {
		var mh$ = SDL_SaveBMP_IO.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SaveBMP_IO", surface, dst, closeio);
			}
			return (boolean) mh$.invokeExact(surface, dst, closeio);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SaveBMP {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SaveBMP");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SaveBMP$descriptor() {
		return SDL_SaveBMP.DESC;
	}

	public static MethodHandle SDL_SaveBMP$handle() {
		return SDL_SaveBMP.HANDLE;
	}

	public static MemorySegment SDL_SaveBMP$address() {
		return SDL_SaveBMP.ADDR;
	}

	public static boolean SDL_SaveBMP(MemorySegment surface, MemorySegment file) {
		var mh$ = SDL_SaveBMP.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SaveBMP", surface, file);
			}
			return (boolean) mh$.invokeExact(surface, file);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_LoadPNG_IO {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_LoadPNG_IO");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_LoadPNG_IO$descriptor() {
		return SDL_LoadPNG_IO.DESC;
	}

	public static MethodHandle SDL_LoadPNG_IO$handle() {
		return SDL_LoadPNG_IO.HANDLE;
	}

	public static MemorySegment SDL_LoadPNG_IO$address() {
		return SDL_LoadPNG_IO.ADDR;
	}

	public static MemorySegment SDL_LoadPNG_IO(MemorySegment src, boolean closeio) {
		var mh$ = SDL_LoadPNG_IO.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_LoadPNG_IO", src, closeio);
			}
			return (MemorySegment) mh$.invokeExact(src, closeio);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_LoadPNG {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_LoadPNG");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_LoadPNG$descriptor() {
		return SDL_LoadPNG.DESC;
	}

	public static MethodHandle SDL_LoadPNG$handle() {
		return SDL_LoadPNG.HANDLE;
	}

	public static MemorySegment SDL_LoadPNG$address() {
		return SDL_LoadPNG.ADDR;
	}

	public static MemorySegment SDL_LoadPNG(MemorySegment file) {
		var mh$ = SDL_LoadPNG.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_LoadPNG", file);
			}
			return (MemorySegment) mh$.invokeExact(file);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SavePNG_IO {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SavePNG_IO");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SavePNG_IO$descriptor() {
		return SDL_SavePNG_IO.DESC;
	}

	public static MethodHandle SDL_SavePNG_IO$handle() {
		return SDL_SavePNG_IO.HANDLE;
	}

	public static MemorySegment SDL_SavePNG_IO$address() {
		return SDL_SavePNG_IO.ADDR;
	}

	public static boolean SDL_SavePNG_IO(MemorySegment surface, MemorySegment dst, boolean closeio) {
		var mh$ = SDL_SavePNG_IO.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SavePNG_IO", surface, dst, closeio);
			}
			return (boolean) mh$.invokeExact(surface, dst, closeio);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SavePNG {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SavePNG");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SavePNG$descriptor() {
		return SDL_SavePNG.DESC;
	}

	public static MethodHandle SDL_SavePNG$handle() {
		return SDL_SavePNG.HANDLE;
	}

	public static MemorySegment SDL_SavePNG$address() {
		return SDL_SavePNG.ADDR;
	}

	public static boolean SDL_SavePNG(MemorySegment surface, MemorySegment file) {
		var mh$ = SDL_SavePNG.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SavePNG", surface, file);
			}
			return (boolean) mh$.invokeExact(surface, file);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetSurfaceRLE {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetSurfaceRLE");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetSurfaceRLE$descriptor() {
		return SDL_SetSurfaceRLE.DESC;
	}

	public static MethodHandle SDL_SetSurfaceRLE$handle() {
		return SDL_SetSurfaceRLE.HANDLE;
	}

	public static MemorySegment SDL_SetSurfaceRLE$address() {
		return SDL_SetSurfaceRLE.ADDR;
	}

	public static boolean SDL_SetSurfaceRLE(MemorySegment surface, boolean enabled) {
		var mh$ = SDL_SetSurfaceRLE.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetSurfaceRLE", surface, enabled);
			}
			return (boolean) mh$.invokeExact(surface, enabled);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SurfaceHasRLE {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SurfaceHasRLE");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SurfaceHasRLE$descriptor() {
		return SDL_SurfaceHasRLE.DESC;
	}

	public static MethodHandle SDL_SurfaceHasRLE$handle() {
		return SDL_SurfaceHasRLE.HANDLE;
	}

	public static MemorySegment SDL_SurfaceHasRLE$address() {
		return SDL_SurfaceHasRLE.ADDR;
	}

	public static boolean SDL_SurfaceHasRLE(MemorySegment surface) {
		var mh$ = SDL_SurfaceHasRLE.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SurfaceHasRLE", surface);
			}
			return (boolean) mh$.invokeExact(surface);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetSurfaceColorKey {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_BOOL,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetSurfaceColorKey");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetSurfaceColorKey$descriptor() {
		return SDL_SetSurfaceColorKey.DESC;
	}

	public static MethodHandle SDL_SetSurfaceColorKey$handle() {
		return SDL_SetSurfaceColorKey.HANDLE;
	}

	public static MemorySegment SDL_SetSurfaceColorKey$address() {
		return SDL_SetSurfaceColorKey.ADDR;
	}

	public static boolean SDL_SetSurfaceColorKey(MemorySegment surface, boolean enabled, int key) {
		var mh$ = SDL_SetSurfaceColorKey.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetSurfaceColorKey", surface, enabled, key);
			}
			return (boolean) mh$.invokeExact(surface, enabled, key);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SurfaceHasColorKey {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SurfaceHasColorKey");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SurfaceHasColorKey$descriptor() {
		return SDL_SurfaceHasColorKey.DESC;
	}

	public static MethodHandle SDL_SurfaceHasColorKey$handle() {
		return SDL_SurfaceHasColorKey.HANDLE;
	}

	public static MemorySegment SDL_SurfaceHasColorKey$address() {
		return SDL_SurfaceHasColorKey.ADDR;
	}

	public static boolean SDL_SurfaceHasColorKey(MemorySegment surface) {
		var mh$ = SDL_SurfaceHasColorKey.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SurfaceHasColorKey", surface);
			}
			return (boolean) mh$.invokeExact(surface);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetSurfaceColorKey {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetSurfaceColorKey");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetSurfaceColorKey$descriptor() {
		return SDL_GetSurfaceColorKey.DESC;
	}

	public static MethodHandle SDL_GetSurfaceColorKey$handle() {
		return SDL_GetSurfaceColorKey.HANDLE;
	}

	public static MemorySegment SDL_GetSurfaceColorKey$address() {
		return SDL_GetSurfaceColorKey.ADDR;
	}

	public static boolean SDL_GetSurfaceColorKey(MemorySegment surface, MemorySegment key) {
		var mh$ = SDL_GetSurfaceColorKey.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetSurfaceColorKey", surface, key);
			}
			return (boolean) mh$.invokeExact(surface, key);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetSurfaceColorMod {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_CHAR,
				SDL3.C_CHAR,
				SDL3.C_CHAR
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetSurfaceColorMod");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetSurfaceColorMod$descriptor() {
		return SDL_SetSurfaceColorMod.DESC;
	}

	public static MethodHandle SDL_SetSurfaceColorMod$handle() {
		return SDL_SetSurfaceColorMod.HANDLE;
	}

	public static MemorySegment SDL_SetSurfaceColorMod$address() {
		return SDL_SetSurfaceColorMod.ADDR;
	}

	public static boolean SDL_SetSurfaceColorMod(MemorySegment surface, byte r, byte g, byte b) {
		var mh$ = SDL_SetSurfaceColorMod.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetSurfaceColorMod", surface, r, g, b);
			}
			return (boolean) mh$.invokeExact(surface, r, g, b);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetSurfaceColorMod {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetSurfaceColorMod");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetSurfaceColorMod$descriptor() {
		return SDL_GetSurfaceColorMod.DESC;
	}

	public static MethodHandle SDL_GetSurfaceColorMod$handle() {
		return SDL_GetSurfaceColorMod.HANDLE;
	}

	public static MemorySegment SDL_GetSurfaceColorMod$address() {
		return SDL_GetSurfaceColorMod.ADDR;
	}

	public static boolean SDL_GetSurfaceColorMod(MemorySegment surface, MemorySegment r, MemorySegment g, MemorySegment b) {
		var mh$ = SDL_GetSurfaceColorMod.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetSurfaceColorMod", surface, r, g, b);
			}
			return (boolean) mh$.invokeExact(surface, r, g, b);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetSurfaceAlphaMod {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_CHAR
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetSurfaceAlphaMod");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetSurfaceAlphaMod$descriptor() {
		return SDL_SetSurfaceAlphaMod.DESC;
	}

	public static MethodHandle SDL_SetSurfaceAlphaMod$handle() {
		return SDL_SetSurfaceAlphaMod.HANDLE;
	}

	public static MemorySegment SDL_SetSurfaceAlphaMod$address() {
		return SDL_SetSurfaceAlphaMod.ADDR;
	}

	public static boolean SDL_SetSurfaceAlphaMod(MemorySegment surface, byte alpha) {
		var mh$ = SDL_SetSurfaceAlphaMod.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetSurfaceAlphaMod", surface, alpha);
			}
			return (boolean) mh$.invokeExact(surface, alpha);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetSurfaceAlphaMod {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetSurfaceAlphaMod");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetSurfaceAlphaMod$descriptor() {
		return SDL_GetSurfaceAlphaMod.DESC;
	}

	public static MethodHandle SDL_GetSurfaceAlphaMod$handle() {
		return SDL_GetSurfaceAlphaMod.HANDLE;
	}

	public static MemorySegment SDL_GetSurfaceAlphaMod$address() {
		return SDL_GetSurfaceAlphaMod.ADDR;
	}

	public static boolean SDL_GetSurfaceAlphaMod(MemorySegment surface, MemorySegment alpha) {
		var mh$ = SDL_GetSurfaceAlphaMod.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetSurfaceAlphaMod", surface, alpha);
			}
			return (boolean) mh$.invokeExact(surface, alpha);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetSurfaceBlendMode {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetSurfaceBlendMode");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetSurfaceBlendMode$descriptor() {
		return SDL_SetSurfaceBlendMode.DESC;
	}

	public static MethodHandle SDL_SetSurfaceBlendMode$handle() {
		return SDL_SetSurfaceBlendMode.HANDLE;
	}

	public static MemorySegment SDL_SetSurfaceBlendMode$address() {
		return SDL_SetSurfaceBlendMode.ADDR;
	}

	public static boolean SDL_SetSurfaceBlendMode(MemorySegment surface, int blendMode) {
		var mh$ = SDL_SetSurfaceBlendMode.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetSurfaceBlendMode", surface, blendMode);
			}
			return (boolean) mh$.invokeExact(surface, blendMode);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetSurfaceBlendMode {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetSurfaceBlendMode");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetSurfaceBlendMode$descriptor() {
		return SDL_GetSurfaceBlendMode.DESC;
	}

	public static MethodHandle SDL_GetSurfaceBlendMode$handle() {
		return SDL_GetSurfaceBlendMode.HANDLE;
	}

	public static MemorySegment SDL_GetSurfaceBlendMode$address() {
		return SDL_GetSurfaceBlendMode.ADDR;
	}

	public static boolean SDL_GetSurfaceBlendMode(MemorySegment surface, MemorySegment blendMode) {
		var mh$ = SDL_GetSurfaceBlendMode.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetSurfaceBlendMode", surface, blendMode);
			}
			return (boolean) mh$.invokeExact(surface, blendMode);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetSurfaceClipRect {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetSurfaceClipRect");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetSurfaceClipRect$descriptor() {
		return SDL_SetSurfaceClipRect.DESC;
	}

	public static MethodHandle SDL_SetSurfaceClipRect$handle() {
		return SDL_SetSurfaceClipRect.HANDLE;
	}

	public static MemorySegment SDL_SetSurfaceClipRect$address() {
		return SDL_SetSurfaceClipRect.ADDR;
	}

	public static boolean SDL_SetSurfaceClipRect(MemorySegment surface, MemorySegment rect) {
		var mh$ = SDL_SetSurfaceClipRect.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetSurfaceClipRect", surface, rect);
			}
			return (boolean) mh$.invokeExact(surface, rect);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetSurfaceClipRect {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetSurfaceClipRect");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetSurfaceClipRect$descriptor() {
		return SDL_GetSurfaceClipRect.DESC;
	}

	public static MethodHandle SDL_GetSurfaceClipRect$handle() {
		return SDL_GetSurfaceClipRect.HANDLE;
	}

	public static MemorySegment SDL_GetSurfaceClipRect$address() {
		return SDL_GetSurfaceClipRect.ADDR;
	}

	public static boolean SDL_GetSurfaceClipRect(MemorySegment surface, MemorySegment rect) {
		var mh$ = SDL_GetSurfaceClipRect.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetSurfaceClipRect", surface, rect);
			}
			return (boolean) mh$.invokeExact(surface, rect);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_FlipSurface {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_FlipSurface");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_FlipSurface$descriptor() {
		return SDL_FlipSurface.DESC;
	}

	public static MethodHandle SDL_FlipSurface$handle() {
		return SDL_FlipSurface.HANDLE;
	}

	public static MemorySegment SDL_FlipSurface$address() {
		return SDL_FlipSurface.ADDR;
	}

	public static boolean SDL_FlipSurface(MemorySegment surface, int flip) {
		var mh$ = SDL_FlipSurface.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_FlipSurface", surface, flip);
			}
			return (boolean) mh$.invokeExact(surface, flip);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RotateSurface {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RotateSurface");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RotateSurface$descriptor() {
		return SDL_RotateSurface.DESC;
	}

	public static MethodHandle SDL_RotateSurface$handle() {
		return SDL_RotateSurface.HANDLE;
	}

	public static MemorySegment SDL_RotateSurface$address() {
		return SDL_RotateSurface.ADDR;
	}

	public static MemorySegment SDL_RotateSurface(MemorySegment surface, float angle) {
		var mh$ = SDL_RotateSurface.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RotateSurface", surface, angle);
			}
			return (MemorySegment) mh$.invokeExact(surface, angle);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DuplicateSurface {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DuplicateSurface");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DuplicateSurface$descriptor() {
		return SDL_DuplicateSurface.DESC;
	}

	public static MethodHandle SDL_DuplicateSurface$handle() {
		return SDL_DuplicateSurface.HANDLE;
	}

	public static MemorySegment SDL_DuplicateSurface$address() {
		return SDL_DuplicateSurface.ADDR;
	}

	public static MemorySegment SDL_DuplicateSurface(MemorySegment surface) {
		var mh$ = SDL_DuplicateSurface.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DuplicateSurface", surface);
			}
			return (MemorySegment) mh$.invokeExact(surface);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ScaleSurface {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ScaleSurface");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ScaleSurface$descriptor() {
		return SDL_ScaleSurface.DESC;
	}

	public static MethodHandle SDL_ScaleSurface$handle() {
		return SDL_ScaleSurface.HANDLE;
	}

	public static MemorySegment SDL_ScaleSurface$address() {
		return SDL_ScaleSurface.ADDR;
	}

	public static MemorySegment SDL_ScaleSurface(MemorySegment surface, int width, int height, int scaleMode) {
		var mh$ = SDL_ScaleSurface.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ScaleSurface", surface, width, height, scaleMode);
			}
			return (MemorySegment) mh$.invokeExact(surface, width, height, scaleMode);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ConvertSurface {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ConvertSurface");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ConvertSurface$descriptor() {
		return SDL_ConvertSurface.DESC;
	}

	public static MethodHandle SDL_ConvertSurface$handle() {
		return SDL_ConvertSurface.HANDLE;
	}

	public static MemorySegment SDL_ConvertSurface$address() {
		return SDL_ConvertSurface.ADDR;
	}

	public static MemorySegment SDL_ConvertSurface(MemorySegment surface, int format) {
		var mh$ = SDL_ConvertSurface.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ConvertSurface", surface, format);
			}
			return (MemorySegment) mh$.invokeExact(surface, format);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ConvertSurfaceAndColorspace {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ConvertSurfaceAndColorspace");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ConvertSurfaceAndColorspace$descriptor() {
		return SDL_ConvertSurfaceAndColorspace.DESC;
	}

	public static MethodHandle SDL_ConvertSurfaceAndColorspace$handle() {
		return SDL_ConvertSurfaceAndColorspace.HANDLE;
	}

	public static MemorySegment SDL_ConvertSurfaceAndColorspace$address() {
		return SDL_ConvertSurfaceAndColorspace.ADDR;
	}

	public static MemorySegment SDL_ConvertSurfaceAndColorspace(MemorySegment surface, int format, MemorySegment palette, int colorspace, int props) {
		var mh$ = SDL_ConvertSurfaceAndColorspace.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ConvertSurfaceAndColorspace", surface, format, palette, colorspace, props);
			}
			return (MemorySegment) mh$.invokeExact(surface, format, palette, colorspace, props);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ConvertPixels {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ConvertPixels");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ConvertPixels$descriptor() {
		return SDL_ConvertPixels.DESC;
	}

	public static MethodHandle SDL_ConvertPixels$handle() {
		return SDL_ConvertPixels.HANDLE;
	}

	public static MemorySegment SDL_ConvertPixels$address() {
		return SDL_ConvertPixels.ADDR;
	}

	public static boolean SDL_ConvertPixels(int width, int height, int src_format, MemorySegment src, int src_pitch, int dst_format, MemorySegment dst, int dst_pitch) {
		var mh$ = SDL_ConvertPixels.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ConvertPixels", width, height, src_format, src, src_pitch, dst_format, dst, dst_pitch);
			}
			return (boolean) mh$.invokeExact(width, height, src_format, src, src_pitch, dst_format, dst, dst_pitch);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ConvertPixelsAndColorspace {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ConvertPixelsAndColorspace");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ConvertPixelsAndColorspace$descriptor() {
		return SDL_ConvertPixelsAndColorspace.DESC;
	}

	public static MethodHandle SDL_ConvertPixelsAndColorspace$handle() {
		return SDL_ConvertPixelsAndColorspace.HANDLE;
	}

	public static MemorySegment SDL_ConvertPixelsAndColorspace$address() {
		return SDL_ConvertPixelsAndColorspace.ADDR;
	}

	public static boolean SDL_ConvertPixelsAndColorspace(int width, int height, int src_format, int src_colorspace, int src_properties, MemorySegment src, int src_pitch, int dst_format, int dst_colorspace, int dst_properties, MemorySegment dst, int dst_pitch) {
		var mh$ = SDL_ConvertPixelsAndColorspace.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ConvertPixelsAndColorspace", width, height, src_format, src_colorspace, src_properties, src, src_pitch, dst_format, dst_colorspace, dst_properties, dst, dst_pitch);
			}
			return (boolean) mh$.invokeExact(width, height, src_format, src_colorspace, src_properties, src, src_pitch, dst_format, dst_colorspace, dst_properties, dst, dst_pitch);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_PremultiplyAlpha {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_PremultiplyAlpha");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_PremultiplyAlpha$descriptor() {
		return SDL_PremultiplyAlpha.DESC;
	}

	public static MethodHandle SDL_PremultiplyAlpha$handle() {
		return SDL_PremultiplyAlpha.HANDLE;
	}

	public static MemorySegment SDL_PremultiplyAlpha$address() {
		return SDL_PremultiplyAlpha.ADDR;
	}

	public static boolean SDL_PremultiplyAlpha(int width, int height, int src_format, MemorySegment src, int src_pitch, int dst_format, MemorySegment dst, int dst_pitch, boolean linear) {
		var mh$ = SDL_PremultiplyAlpha.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_PremultiplyAlpha", width, height, src_format, src, src_pitch, dst_format, dst, dst_pitch, linear);
			}
			return (boolean) mh$.invokeExact(width, height, src_format, src, src_pitch, dst_format, dst, dst_pitch, linear);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_PremultiplySurfaceAlpha {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_PremultiplySurfaceAlpha");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_PremultiplySurfaceAlpha$descriptor() {
		return SDL_PremultiplySurfaceAlpha.DESC;
	}

	public static MethodHandle SDL_PremultiplySurfaceAlpha$handle() {
		return SDL_PremultiplySurfaceAlpha.HANDLE;
	}

	public static MemorySegment SDL_PremultiplySurfaceAlpha$address() {
		return SDL_PremultiplySurfaceAlpha.ADDR;
	}

	public static boolean SDL_PremultiplySurfaceAlpha(MemorySegment surface, boolean linear) {
		var mh$ = SDL_PremultiplySurfaceAlpha.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_PremultiplySurfaceAlpha", surface, linear);
			}
			return (boolean) mh$.invokeExact(surface, linear);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ClearSurface {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ClearSurface");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ClearSurface$descriptor() {
		return SDL_ClearSurface.DESC;
	}

	public static MethodHandle SDL_ClearSurface$handle() {
		return SDL_ClearSurface.HANDLE;
	}

	public static MemorySegment SDL_ClearSurface$address() {
		return SDL_ClearSurface.ADDR;
	}

	public static boolean SDL_ClearSurface(MemorySegment surface, float r, float g, float b, float a) {
		var mh$ = SDL_ClearSurface.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ClearSurface", surface, r, g, b, a);
			}
			return (boolean) mh$.invokeExact(surface, r, g, b, a);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_FillSurfaceRect {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_FillSurfaceRect");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_FillSurfaceRect$descriptor() {
		return SDL_FillSurfaceRect.DESC;
	}

	public static MethodHandle SDL_FillSurfaceRect$handle() {
		return SDL_FillSurfaceRect.HANDLE;
	}

	public static MemorySegment SDL_FillSurfaceRect$address() {
		return SDL_FillSurfaceRect.ADDR;
	}

	public static boolean SDL_FillSurfaceRect(MemorySegment dst, MemorySegment rect, int color) {
		var mh$ = SDL_FillSurfaceRect.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_FillSurfaceRect", dst, rect, color);
			}
			return (boolean) mh$.invokeExact(dst, rect, color);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_FillSurfaceRects {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_FillSurfaceRects");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_FillSurfaceRects$descriptor() {
		return SDL_FillSurfaceRects.DESC;
	}

	public static MethodHandle SDL_FillSurfaceRects$handle() {
		return SDL_FillSurfaceRects.HANDLE;
	}

	public static MemorySegment SDL_FillSurfaceRects$address() {
		return SDL_FillSurfaceRects.ADDR;
	}

	public static boolean SDL_FillSurfaceRects(MemorySegment dst, MemorySegment rects, int count, int color) {
		var mh$ = SDL_FillSurfaceRects.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_FillSurfaceRects", dst, rects, count, color);
			}
			return (boolean) mh$.invokeExact(dst, rects, count, color);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_BlitSurface {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_BlitSurface");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_BlitSurface$descriptor() {
		return SDL_BlitSurface.DESC;
	}

	public static MethodHandle SDL_BlitSurface$handle() {
		return SDL_BlitSurface.HANDLE;
	}

	public static MemorySegment SDL_BlitSurface$address() {
		return SDL_BlitSurface.ADDR;
	}

	public static boolean SDL_BlitSurface(MemorySegment src, MemorySegment srcrect, MemorySegment dst, MemorySegment dstrect) {
		var mh$ = SDL_BlitSurface.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_BlitSurface", src, srcrect, dst, dstrect);
			}
			return (boolean) mh$.invokeExact(src, srcrect, dst, dstrect);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_BlitSurfaceUnchecked {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_BlitSurfaceUnchecked");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_BlitSurfaceUnchecked$descriptor() {
		return SDL_BlitSurfaceUnchecked.DESC;
	}

	public static MethodHandle SDL_BlitSurfaceUnchecked$handle() {
		return SDL_BlitSurfaceUnchecked.HANDLE;
	}

	public static MemorySegment SDL_BlitSurfaceUnchecked$address() {
		return SDL_BlitSurfaceUnchecked.ADDR;
	}

	public static boolean SDL_BlitSurfaceUnchecked(MemorySegment src, MemorySegment srcrect, MemorySegment dst, MemorySegment dstrect) {
		var mh$ = SDL_BlitSurfaceUnchecked.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_BlitSurfaceUnchecked", src, srcrect, dst, dstrect);
			}
			return (boolean) mh$.invokeExact(src, srcrect, dst, dstrect);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_BlitSurfaceScaled {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_BlitSurfaceScaled");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_BlitSurfaceScaled$descriptor() {
		return SDL_BlitSurfaceScaled.DESC;
	}

	public static MethodHandle SDL_BlitSurfaceScaled$handle() {
		return SDL_BlitSurfaceScaled.HANDLE;
	}

	public static MemorySegment SDL_BlitSurfaceScaled$address() {
		return SDL_BlitSurfaceScaled.ADDR;
	}

	public static boolean SDL_BlitSurfaceScaled(MemorySegment src, MemorySegment srcrect, MemorySegment dst, MemorySegment dstrect, int scaleMode) {
		var mh$ = SDL_BlitSurfaceScaled.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_BlitSurfaceScaled", src, srcrect, dst, dstrect, scaleMode);
			}
			return (boolean) mh$.invokeExact(src, srcrect, dst, dstrect, scaleMode);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_BlitSurfaceUncheckedScaled {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_BlitSurfaceUncheckedScaled");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_BlitSurfaceUncheckedScaled$descriptor() {
		return SDL_BlitSurfaceUncheckedScaled.DESC;
	}

	public static MethodHandle SDL_BlitSurfaceUncheckedScaled$handle() {
		return SDL_BlitSurfaceUncheckedScaled.HANDLE;
	}

	public static MemorySegment SDL_BlitSurfaceUncheckedScaled$address() {
		return SDL_BlitSurfaceUncheckedScaled.ADDR;
	}

	public static boolean SDL_BlitSurfaceUncheckedScaled(MemorySegment src, MemorySegment srcrect, MemorySegment dst, MemorySegment dstrect, int scaleMode) {
		var mh$ = SDL_BlitSurfaceUncheckedScaled.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_BlitSurfaceUncheckedScaled", src, srcrect, dst, dstrect, scaleMode);
			}
			return (boolean) mh$.invokeExact(src, srcrect, dst, dstrect, scaleMode);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_StretchSurface {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_StretchSurface");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_StretchSurface$descriptor() {
		return SDL_StretchSurface.DESC;
	}

	public static MethodHandle SDL_StretchSurface$handle() {
		return SDL_StretchSurface.HANDLE;
	}

	public static MemorySegment SDL_StretchSurface$address() {
		return SDL_StretchSurface.ADDR;
	}

	public static boolean SDL_StretchSurface(MemorySegment src, MemorySegment srcrect, MemorySegment dst, MemorySegment dstrect, int scaleMode) {
		var mh$ = SDL_StretchSurface.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_StretchSurface", src, srcrect, dst, dstrect, scaleMode);
			}
			return (boolean) mh$.invokeExact(src, srcrect, dst, dstrect, scaleMode);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_BlitSurfaceTiled {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_BlitSurfaceTiled");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_BlitSurfaceTiled$descriptor() {
		return SDL_BlitSurfaceTiled.DESC;
	}

	public static MethodHandle SDL_BlitSurfaceTiled$handle() {
		return SDL_BlitSurfaceTiled.HANDLE;
	}

	public static MemorySegment SDL_BlitSurfaceTiled$address() {
		return SDL_BlitSurfaceTiled.ADDR;
	}

	public static boolean SDL_BlitSurfaceTiled(MemorySegment src, MemorySegment srcrect, MemorySegment dst, MemorySegment dstrect) {
		var mh$ = SDL_BlitSurfaceTiled.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_BlitSurfaceTiled", src, srcrect, dst, dstrect);
			}
			return (boolean) mh$.invokeExact(src, srcrect, dst, dstrect);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_BlitSurfaceTiledWithScale {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_FLOAT,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_BlitSurfaceTiledWithScale");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_BlitSurfaceTiledWithScale$descriptor() {
		return SDL_BlitSurfaceTiledWithScale.DESC;
	}

	public static MethodHandle SDL_BlitSurfaceTiledWithScale$handle() {
		return SDL_BlitSurfaceTiledWithScale.HANDLE;
	}

	public static MemorySegment SDL_BlitSurfaceTiledWithScale$address() {
		return SDL_BlitSurfaceTiledWithScale.ADDR;
	}

	public static boolean SDL_BlitSurfaceTiledWithScale(MemorySegment src, MemorySegment srcrect, float scale, int scaleMode, MemorySegment dst, MemorySegment dstrect) {
		var mh$ = SDL_BlitSurfaceTiledWithScale.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_BlitSurfaceTiledWithScale", src, srcrect, scale, scaleMode, dst, dstrect);
			}
			return (boolean) mh$.invokeExact(src, srcrect, scale, scaleMode, dst, dstrect);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_BlitSurface9Grid {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_FLOAT,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_BlitSurface9Grid");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_BlitSurface9Grid$descriptor() {
		return SDL_BlitSurface9Grid.DESC;
	}

	public static MethodHandle SDL_BlitSurface9Grid$handle() {
		return SDL_BlitSurface9Grid.HANDLE;
	}

	public static MemorySegment SDL_BlitSurface9Grid$address() {
		return SDL_BlitSurface9Grid.ADDR;
	}

	public static boolean SDL_BlitSurface9Grid(MemorySegment src, MemorySegment srcrect, int left_width, int right_width, int top_height, int bottom_height, float scale, int scaleMode, MemorySegment dst, MemorySegment dstrect) {
		var mh$ = SDL_BlitSurface9Grid.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_BlitSurface9Grid", src, srcrect, left_width, right_width, top_height, bottom_height, scale, scaleMode, dst, dstrect);
			}
			return (boolean) mh$.invokeExact(src, srcrect, left_width, right_width, top_height, bottom_height, scale, scaleMode, dst, dstrect);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_MapSurfaceRGB {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_CHAR,
				SDL3.C_CHAR,
				SDL3.C_CHAR
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_MapSurfaceRGB");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_MapSurfaceRGB$descriptor() {
		return SDL_MapSurfaceRGB.DESC;
	}

	public static MethodHandle SDL_MapSurfaceRGB$handle() {
		return SDL_MapSurfaceRGB.HANDLE;
	}

	public static MemorySegment SDL_MapSurfaceRGB$address() {
		return SDL_MapSurfaceRGB.ADDR;
	}

	public static int SDL_MapSurfaceRGB(MemorySegment surface, byte r, byte g, byte b) {
		var mh$ = SDL_MapSurfaceRGB.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_MapSurfaceRGB", surface, r, g, b);
			}
			return (int) mh$.invokeExact(surface, r, g, b);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_MapSurfaceRGBA {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_CHAR,
				SDL3.C_CHAR,
				SDL3.C_CHAR,
				SDL3.C_CHAR
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_MapSurfaceRGBA");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_MapSurfaceRGBA$descriptor() {
		return SDL_MapSurfaceRGBA.DESC;
	}

	public static MethodHandle SDL_MapSurfaceRGBA$handle() {
		return SDL_MapSurfaceRGBA.HANDLE;
	}

	public static MemorySegment SDL_MapSurfaceRGBA$address() {
		return SDL_MapSurfaceRGBA.ADDR;
	}

	public static int SDL_MapSurfaceRGBA(MemorySegment surface, byte r, byte g, byte b, byte a) {
		var mh$ = SDL_MapSurfaceRGBA.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_MapSurfaceRGBA", surface, r, g, b, a);
			}
			return (int) mh$.invokeExact(surface, r, g, b, a);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ReadSurfacePixel {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ReadSurfacePixel");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ReadSurfacePixel$descriptor() {
		return SDL_ReadSurfacePixel.DESC;
	}

	public static MethodHandle SDL_ReadSurfacePixel$handle() {
		return SDL_ReadSurfacePixel.HANDLE;
	}

	public static MemorySegment SDL_ReadSurfacePixel$address() {
		return SDL_ReadSurfacePixel.ADDR;
	}

	public static boolean SDL_ReadSurfacePixel(MemorySegment surface, int x, int y, MemorySegment r, MemorySegment g, MemorySegment b, MemorySegment a) {
		var mh$ = SDL_ReadSurfacePixel.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ReadSurfacePixel", surface, x, y, r, g, b, a);
			}
			return (boolean) mh$.invokeExact(surface, x, y, r, g, b, a);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ReadSurfacePixelFloat {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ReadSurfacePixelFloat");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ReadSurfacePixelFloat$descriptor() {
		return SDL_ReadSurfacePixelFloat.DESC;
	}

	public static MethodHandle SDL_ReadSurfacePixelFloat$handle() {
		return SDL_ReadSurfacePixelFloat.HANDLE;
	}

	public static MemorySegment SDL_ReadSurfacePixelFloat$address() {
		return SDL_ReadSurfacePixelFloat.ADDR;
	}

	public static boolean SDL_ReadSurfacePixelFloat(MemorySegment surface, int x, int y, MemorySegment r, MemorySegment g, MemorySegment b, MemorySegment a) {
		var mh$ = SDL_ReadSurfacePixelFloat.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ReadSurfacePixelFloat", surface, x, y, r, g, b, a);
			}
			return (boolean) mh$.invokeExact(surface, x, y, r, g, b, a);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WriteSurfacePixel {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_CHAR,
				SDL3.C_CHAR,
				SDL3.C_CHAR,
				SDL3.C_CHAR
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WriteSurfacePixel");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WriteSurfacePixel$descriptor() {
		return SDL_WriteSurfacePixel.DESC;
	}

	public static MethodHandle SDL_WriteSurfacePixel$handle() {
		return SDL_WriteSurfacePixel.HANDLE;
	}

	public static MemorySegment SDL_WriteSurfacePixel$address() {
		return SDL_WriteSurfacePixel.ADDR;
	}

	public static boolean SDL_WriteSurfacePixel(MemorySegment surface, int x, int y, byte r, byte g, byte b, byte a) {
		var mh$ = SDL_WriteSurfacePixel.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WriteSurfacePixel", surface, x, y, r, g, b, a);
			}
			return (boolean) mh$.invokeExact(surface, x, y, r, g, b, a);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WriteSurfacePixelFloat {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WriteSurfacePixelFloat");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WriteSurfacePixelFloat$descriptor() {
		return SDL_WriteSurfacePixelFloat.DESC;
	}

	public static MethodHandle SDL_WriteSurfacePixelFloat$handle() {
		return SDL_WriteSurfacePixelFloat.HANDLE;
	}

	public static MemorySegment SDL_WriteSurfacePixelFloat$address() {
		return SDL_WriteSurfacePixelFloat.ADDR;
	}

	public static boolean SDL_WriteSurfacePixelFloat(MemorySegment surface, int x, int y, float r, float g, float b, float a) {
		var mh$ = SDL_WriteSurfacePixelFloat.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WriteSurfacePixelFloat", surface, x, y, r, g, b, a);
			}
			return (boolean) mh$.invokeExact(surface, x, y, r, g, b, a);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	public static OfInt SDL_CameraID = SDL3.C_INT;
	private static final int SDL_CAMERA_POSITION_UNKNOWN = (int) 0L;

	public static int SDL_CAMERA_POSITION_UNKNOWN() {
		return SDL_CAMERA_POSITION_UNKNOWN;
	}

	private static final int SDL_CAMERA_POSITION_FRONT_FACING = (int) 1L;

	public static int SDL_CAMERA_POSITION_FRONT_FACING() {
		return SDL_CAMERA_POSITION_FRONT_FACING;
	}

	private static final int SDL_CAMERA_POSITION_BACK_FACING = (int) 2L;

	public static int SDL_CAMERA_POSITION_BACK_FACING() {
		return SDL_CAMERA_POSITION_BACK_FACING;
	}

	private static final int SDL_CAMERA_PERMISSION_STATE_DENIED = (int) -1L;

	public static int SDL_CAMERA_PERMISSION_STATE_DENIED() {
		return SDL_CAMERA_PERMISSION_STATE_DENIED;
	}

	private static final int SDL_CAMERA_PERMISSION_STATE_PENDING = (int) 0L;

	public static int SDL_CAMERA_PERMISSION_STATE_PENDING() {
		return SDL_CAMERA_PERMISSION_STATE_PENDING;
	}

	private static final int SDL_CAMERA_PERMISSION_STATE_APPROVED = (int) 1L;

	public static int SDL_CAMERA_PERMISSION_STATE_APPROVED() {
		return SDL_CAMERA_PERMISSION_STATE_APPROVED;
	}

	private static class SDL_GetNumCameraDrivers {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetNumCameraDrivers");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetNumCameraDrivers$descriptor() {
		return SDL_GetNumCameraDrivers.DESC;
	}

	public static MethodHandle SDL_GetNumCameraDrivers$handle() {
		return SDL_GetNumCameraDrivers.HANDLE;
	}

	public static MemorySegment SDL_GetNumCameraDrivers$address() {
		return SDL_GetNumCameraDrivers.ADDR;
	}

	public static int SDL_GetNumCameraDrivers() {
		var mh$ = SDL_GetNumCameraDrivers.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetNumCameraDrivers");
			}
			return (int) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetCameraDriver {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetCameraDriver");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetCameraDriver$descriptor() {
		return SDL_GetCameraDriver.DESC;
	}

	public static MethodHandle SDL_GetCameraDriver$handle() {
		return SDL_GetCameraDriver.HANDLE;
	}

	public static MemorySegment SDL_GetCameraDriver$address() {
		return SDL_GetCameraDriver.ADDR;
	}

	public static MemorySegment SDL_GetCameraDriver(int index) {
		var mh$ = SDL_GetCameraDriver.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetCameraDriver", index);
			}
			return (MemorySegment) mh$.invokeExact(index);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetCurrentCameraDriver {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetCurrentCameraDriver");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetCurrentCameraDriver$descriptor() {
		return SDL_GetCurrentCameraDriver.DESC;
	}

	public static MethodHandle SDL_GetCurrentCameraDriver$handle() {
		return SDL_GetCurrentCameraDriver.HANDLE;
	}

	public static MemorySegment SDL_GetCurrentCameraDriver$address() {
		return SDL_GetCurrentCameraDriver.ADDR;
	}

	public static MemorySegment SDL_GetCurrentCameraDriver() {
		var mh$ = SDL_GetCurrentCameraDriver.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetCurrentCameraDriver");
			}
			return (MemorySegment) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetCameras {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetCameras");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetCameras$descriptor() {
		return SDL_GetCameras.DESC;
	}

	public static MethodHandle SDL_GetCameras$handle() {
		return SDL_GetCameras.HANDLE;
	}

	public static MemorySegment SDL_GetCameras$address() {
		return SDL_GetCameras.ADDR;
	}

	public static MemorySegment SDL_GetCameras(MemorySegment count) {
		var mh$ = SDL_GetCameras.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetCameras", count);
			}
			return (MemorySegment) mh$.invokeExact(count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetCameraSupportedFormats {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetCameraSupportedFormats");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetCameraSupportedFormats$descriptor() {
		return SDL_GetCameraSupportedFormats.DESC;
	}

	public static MethodHandle SDL_GetCameraSupportedFormats$handle() {
		return SDL_GetCameraSupportedFormats.HANDLE;
	}

	public static MemorySegment SDL_GetCameraSupportedFormats$address() {
		return SDL_GetCameraSupportedFormats.ADDR;
	}

	public static MemorySegment SDL_GetCameraSupportedFormats(int instance_id, MemorySegment count) {
		var mh$ = SDL_GetCameraSupportedFormats.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetCameraSupportedFormats", instance_id, count);
			}
			return (MemorySegment) mh$.invokeExact(instance_id, count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetCameraName {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetCameraName");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetCameraName$descriptor() {
		return SDL_GetCameraName.DESC;
	}

	public static MethodHandle SDL_GetCameraName$handle() {
		return SDL_GetCameraName.HANDLE;
	}

	public static MemorySegment SDL_GetCameraName$address() {
		return SDL_GetCameraName.ADDR;
	}

	public static MemorySegment SDL_GetCameraName(int instance_id) {
		var mh$ = SDL_GetCameraName.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetCameraName", instance_id);
			}
			return (MemorySegment) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetCameraPosition {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetCameraPosition");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetCameraPosition$descriptor() {
		return SDL_GetCameraPosition.DESC;
	}

	public static MethodHandle SDL_GetCameraPosition$handle() {
		return SDL_GetCameraPosition.HANDLE;
	}

	public static MemorySegment SDL_GetCameraPosition$address() {
		return SDL_GetCameraPosition.ADDR;
	}

	public static int SDL_GetCameraPosition(int instance_id) {
		var mh$ = SDL_GetCameraPosition.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetCameraPosition", instance_id);
			}
			return (int) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_OpenCamera {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_OpenCamera");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_OpenCamera$descriptor() {
		return SDL_OpenCamera.DESC;
	}

	public static MethodHandle SDL_OpenCamera$handle() {
		return SDL_OpenCamera.HANDLE;
	}

	public static MemorySegment SDL_OpenCamera$address() {
		return SDL_OpenCamera.ADDR;
	}

	public static MemorySegment SDL_OpenCamera(int instance_id, MemorySegment spec) {
		var mh$ = SDL_OpenCamera.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_OpenCamera", instance_id, spec);
			}
			return (MemorySegment) mh$.invokeExact(instance_id, spec);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetCameraPermissionState {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetCameraPermissionState");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetCameraPermissionState$descriptor() {
		return SDL_GetCameraPermissionState.DESC;
	}

	public static MethodHandle SDL_GetCameraPermissionState$handle() {
		return SDL_GetCameraPermissionState.HANDLE;
	}

	public static MemorySegment SDL_GetCameraPermissionState$address() {
		return SDL_GetCameraPermissionState.ADDR;
	}

	public static int SDL_GetCameraPermissionState(MemorySegment camera) {
		var mh$ = SDL_GetCameraPermissionState.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetCameraPermissionState", camera);
			}
			return (int) mh$.invokeExact(camera);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetCameraID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetCameraID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetCameraID$descriptor() {
		return SDL_GetCameraID.DESC;
	}

	public static MethodHandle SDL_GetCameraID$handle() {
		return SDL_GetCameraID.HANDLE;
	}

	public static MemorySegment SDL_GetCameraID$address() {
		return SDL_GetCameraID.ADDR;
	}

	public static int SDL_GetCameraID(MemorySegment camera) {
		var mh$ = SDL_GetCameraID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetCameraID", camera);
			}
			return (int) mh$.invokeExact(camera);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetCameraProperties {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetCameraProperties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetCameraProperties$descriptor() {
		return SDL_GetCameraProperties.DESC;
	}

	public static MethodHandle SDL_GetCameraProperties$handle() {
		return SDL_GetCameraProperties.HANDLE;
	}

	public static MemorySegment SDL_GetCameraProperties$address() {
		return SDL_GetCameraProperties.ADDR;
	}

	public static int SDL_GetCameraProperties(MemorySegment camera) {
		var mh$ = SDL_GetCameraProperties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetCameraProperties", camera);
			}
			return (int) mh$.invokeExact(camera);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetCameraFormat {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetCameraFormat");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetCameraFormat$descriptor() {
		return SDL_GetCameraFormat.DESC;
	}

	public static MethodHandle SDL_GetCameraFormat$handle() {
		return SDL_GetCameraFormat.HANDLE;
	}

	public static MemorySegment SDL_GetCameraFormat$address() {
		return SDL_GetCameraFormat.ADDR;
	}

	public static boolean SDL_GetCameraFormat(MemorySegment camera, MemorySegment spec) {
		var mh$ = SDL_GetCameraFormat.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetCameraFormat", camera, spec);
			}
			return (boolean) mh$.invokeExact(camera, spec);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_AcquireCameraFrame {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_AcquireCameraFrame");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_AcquireCameraFrame$descriptor() {
		return SDL_AcquireCameraFrame.DESC;
	}

	public static MethodHandle SDL_AcquireCameraFrame$handle() {
		return SDL_AcquireCameraFrame.HANDLE;
	}

	public static MemorySegment SDL_AcquireCameraFrame$address() {
		return SDL_AcquireCameraFrame.ADDR;
	}

	public static MemorySegment SDL_AcquireCameraFrame(MemorySegment camera, MemorySegment timestampNS) {
		var mh$ = SDL_AcquireCameraFrame.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_AcquireCameraFrame", camera, timestampNS);
			}
			return (MemorySegment) mh$.invokeExact(camera, timestampNS);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ReleaseCameraFrame {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ReleaseCameraFrame");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ReleaseCameraFrame$descriptor() {
		return SDL_ReleaseCameraFrame.DESC;
	}

	public static MethodHandle SDL_ReleaseCameraFrame$handle() {
		return SDL_ReleaseCameraFrame.HANDLE;
	}

	public static MemorySegment SDL_ReleaseCameraFrame$address() {
		return SDL_ReleaseCameraFrame.ADDR;
	}

	public static void SDL_ReleaseCameraFrame(MemorySegment camera, MemorySegment frame) {
		var mh$ = SDL_ReleaseCameraFrame.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ReleaseCameraFrame", camera, frame);
			}
			mh$.invokeExact(camera, frame);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CloseCamera {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CloseCamera");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CloseCamera$descriptor() {
		return SDL_CloseCamera.DESC;
	}

	public static MethodHandle SDL_CloseCamera$handle() {
		return SDL_CloseCamera.HANDLE;
	}

	public static MemorySegment SDL_CloseCamera$address() {
		return SDL_CloseCamera.ADDR;
	}

	public static void SDL_CloseCamera(MemorySegment camera) {
		var mh$ = SDL_CloseCamera.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CloseCamera", camera);
			}
			mh$.invokeExact(camera);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetClipboardText {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetClipboardText");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetClipboardText$descriptor() {
		return SDL_SetClipboardText.DESC;
	}

	public static MethodHandle SDL_SetClipboardText$handle() {
		return SDL_SetClipboardText.HANDLE;
	}

	public static MemorySegment SDL_SetClipboardText$address() {
		return SDL_SetClipboardText.ADDR;
	}

	public static boolean SDL_SetClipboardText(MemorySegment text) {
		var mh$ = SDL_SetClipboardText.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetClipboardText", text);
			}
			return (boolean) mh$.invokeExact(text);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetClipboardText {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetClipboardText");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetClipboardText$descriptor() {
		return SDL_GetClipboardText.DESC;
	}

	public static MethodHandle SDL_GetClipboardText$handle() {
		return SDL_GetClipboardText.HANDLE;
	}

	public static MemorySegment SDL_GetClipboardText$address() {
		return SDL_GetClipboardText.ADDR;
	}

	public static MemorySegment SDL_GetClipboardText() {
		var mh$ = SDL_GetClipboardText.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetClipboardText");
			}
			return (MemorySegment) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_HasClipboardText {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_HasClipboardText");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_HasClipboardText$descriptor() {
		return SDL_HasClipboardText.DESC;
	}

	public static MethodHandle SDL_HasClipboardText$handle() {
		return SDL_HasClipboardText.HANDLE;
	}

	public static MemorySegment SDL_HasClipboardText$address() {
		return SDL_HasClipboardText.ADDR;
	}

	public static boolean SDL_HasClipboardText() {
		var mh$ = SDL_HasClipboardText.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_HasClipboardText");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetPrimarySelectionText {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetPrimarySelectionText");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetPrimarySelectionText$descriptor() {
		return SDL_SetPrimarySelectionText.DESC;
	}

	public static MethodHandle SDL_SetPrimarySelectionText$handle() {
		return SDL_SetPrimarySelectionText.HANDLE;
	}

	public static MemorySegment SDL_SetPrimarySelectionText$address() {
		return SDL_SetPrimarySelectionText.ADDR;
	}

	public static boolean SDL_SetPrimarySelectionText(MemorySegment text) {
		var mh$ = SDL_SetPrimarySelectionText.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetPrimarySelectionText", text);
			}
			return (boolean) mh$.invokeExact(text);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetPrimarySelectionText {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetPrimarySelectionText");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetPrimarySelectionText$descriptor() {
		return SDL_GetPrimarySelectionText.DESC;
	}

	public static MethodHandle SDL_GetPrimarySelectionText$handle() {
		return SDL_GetPrimarySelectionText.HANDLE;
	}

	public static MemorySegment SDL_GetPrimarySelectionText$address() {
		return SDL_GetPrimarySelectionText.ADDR;
	}

	public static MemorySegment SDL_GetPrimarySelectionText() {
		var mh$ = SDL_GetPrimarySelectionText.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetPrimarySelectionText");
			}
			return (MemorySegment) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_HasPrimarySelectionText {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_HasPrimarySelectionText");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_HasPrimarySelectionText$descriptor() {
		return SDL_HasPrimarySelectionText.DESC;
	}

	public static MethodHandle SDL_HasPrimarySelectionText$handle() {
		return SDL_HasPrimarySelectionText.HANDLE;
	}

	public static MemorySegment SDL_HasPrimarySelectionText$address() {
		return SDL_HasPrimarySelectionText.ADDR;
	}

	public static boolean SDL_HasPrimarySelectionText() {
		var mh$ = SDL_HasPrimarySelectionText.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_HasPrimarySelectionText");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetClipboardData {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetClipboardData");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetClipboardData$descriptor() {
		return SDL_SetClipboardData.DESC;
	}

	public static MethodHandle SDL_SetClipboardData$handle() {
		return SDL_SetClipboardData.HANDLE;
	}

	public static MemorySegment SDL_SetClipboardData$address() {
		return SDL_SetClipboardData.ADDR;
	}

	public static boolean SDL_SetClipboardData(MemorySegment callback, MemorySegment cleanup, MemorySegment userdata, MemorySegment mime_types, long num_mime_types) {
		var mh$ = SDL_SetClipboardData.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetClipboardData", callback, cleanup, userdata, mime_types, num_mime_types);
			}
			return (boolean) mh$.invokeExact(callback, cleanup, userdata, mime_types, num_mime_types);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ClearClipboardData {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ClearClipboardData");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ClearClipboardData$descriptor() {
		return SDL_ClearClipboardData.DESC;
	}

	public static MethodHandle SDL_ClearClipboardData$handle() {
		return SDL_ClearClipboardData.HANDLE;
	}

	public static MemorySegment SDL_ClearClipboardData$address() {
		return SDL_ClearClipboardData.ADDR;
	}

	public static boolean SDL_ClearClipboardData() {
		var mh$ = SDL_ClearClipboardData.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ClearClipboardData");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetClipboardData {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetClipboardData");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetClipboardData$descriptor() {
		return SDL_GetClipboardData.DESC;
	}

	public static MethodHandle SDL_GetClipboardData$handle() {
		return SDL_GetClipboardData.HANDLE;
	}

	public static MemorySegment SDL_GetClipboardData$address() {
		return SDL_GetClipboardData.ADDR;
	}

	public static MemorySegment SDL_GetClipboardData(MemorySegment mime_type, MemorySegment size) {
		var mh$ = SDL_GetClipboardData.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetClipboardData", mime_type, size);
			}
			return (MemorySegment) mh$.invokeExact(mime_type, size);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_HasClipboardData {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_HasClipboardData");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_HasClipboardData$descriptor() {
		return SDL_HasClipboardData.DESC;
	}

	public static MethodHandle SDL_HasClipboardData$handle() {
		return SDL_HasClipboardData.HANDLE;
	}

	public static MemorySegment SDL_HasClipboardData$address() {
		return SDL_HasClipboardData.ADDR;
	}

	public static boolean SDL_HasClipboardData(MemorySegment mime_type) {
		var mh$ = SDL_HasClipboardData.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_HasClipboardData", mime_type);
			}
			return (boolean) mh$.invokeExact(mime_type);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetClipboardMimeTypes {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetClipboardMimeTypes");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetClipboardMimeTypes$descriptor() {
		return SDL_GetClipboardMimeTypes.DESC;
	}

	public static MethodHandle SDL_GetClipboardMimeTypes$handle() {
		return SDL_GetClipboardMimeTypes.HANDLE;
	}

	public static MemorySegment SDL_GetClipboardMimeTypes$address() {
		return SDL_GetClipboardMimeTypes.ADDR;
	}

	public static MemorySegment SDL_GetClipboardMimeTypes(MemorySegment num_mime_types) {
		var mh$ = SDL_GetClipboardMimeTypes.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetClipboardMimeTypes", num_mime_types);
			}
			return (MemorySegment) mh$.invokeExact(num_mime_types);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetNumLogicalCPUCores {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetNumLogicalCPUCores");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetNumLogicalCPUCores$descriptor() {
		return SDL_GetNumLogicalCPUCores.DESC;
	}

	public static MethodHandle SDL_GetNumLogicalCPUCores$handle() {
		return SDL_GetNumLogicalCPUCores.HANDLE;
	}

	public static MemorySegment SDL_GetNumLogicalCPUCores$address() {
		return SDL_GetNumLogicalCPUCores.ADDR;
	}

	public static int SDL_GetNumLogicalCPUCores() {
		var mh$ = SDL_GetNumLogicalCPUCores.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetNumLogicalCPUCores");
			}
			return (int) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetCPUCacheLineSize {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetCPUCacheLineSize");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetCPUCacheLineSize$descriptor() {
		return SDL_GetCPUCacheLineSize.DESC;
	}

	public static MethodHandle SDL_GetCPUCacheLineSize$handle() {
		return SDL_GetCPUCacheLineSize.HANDLE;
	}

	public static MemorySegment SDL_GetCPUCacheLineSize$address() {
		return SDL_GetCPUCacheLineSize.ADDR;
	}

	public static int SDL_GetCPUCacheLineSize() {
		var mh$ = SDL_GetCPUCacheLineSize.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetCPUCacheLineSize");
			}
			return (int) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_HasAltiVec {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_HasAltiVec");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_HasAltiVec$descriptor() {
		return SDL_HasAltiVec.DESC;
	}

	public static MethodHandle SDL_HasAltiVec$handle() {
		return SDL_HasAltiVec.HANDLE;
	}

	public static MemorySegment SDL_HasAltiVec$address() {
		return SDL_HasAltiVec.ADDR;
	}

	public static boolean SDL_HasAltiVec() {
		var mh$ = SDL_HasAltiVec.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_HasAltiVec");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_HasMMX {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_HasMMX");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_HasMMX$descriptor() {
		return SDL_HasMMX.DESC;
	}

	public static MethodHandle SDL_HasMMX$handle() {
		return SDL_HasMMX.HANDLE;
	}

	public static MemorySegment SDL_HasMMX$address() {
		return SDL_HasMMX.ADDR;
	}

	public static boolean SDL_HasMMX() {
		var mh$ = SDL_HasMMX.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_HasMMX");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_HasSSE {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_HasSSE");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_HasSSE$descriptor() {
		return SDL_HasSSE.DESC;
	}

	public static MethodHandle SDL_HasSSE$handle() {
		return SDL_HasSSE.HANDLE;
	}

	public static MemorySegment SDL_HasSSE$address() {
		return SDL_HasSSE.ADDR;
	}

	public static boolean SDL_HasSSE() {
		var mh$ = SDL_HasSSE.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_HasSSE");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_HasSSE2 {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_HasSSE2");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_HasSSE2$descriptor() {
		return SDL_HasSSE2.DESC;
	}

	public static MethodHandle SDL_HasSSE2$handle() {
		return SDL_HasSSE2.HANDLE;
	}

	public static MemorySegment SDL_HasSSE2$address() {
		return SDL_HasSSE2.ADDR;
	}

	public static boolean SDL_HasSSE2() {
		var mh$ = SDL_HasSSE2.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_HasSSE2");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_HasSSE3 {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_HasSSE3");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_HasSSE3$descriptor() {
		return SDL_HasSSE3.DESC;
	}

	public static MethodHandle SDL_HasSSE3$handle() {
		return SDL_HasSSE3.HANDLE;
	}

	public static MemorySegment SDL_HasSSE3$address() {
		return SDL_HasSSE3.ADDR;
	}

	public static boolean SDL_HasSSE3() {
		var mh$ = SDL_HasSSE3.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_HasSSE3");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_HasSSE41 {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_HasSSE41");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_HasSSE41$descriptor() {
		return SDL_HasSSE41.DESC;
	}

	public static MethodHandle SDL_HasSSE41$handle() {
		return SDL_HasSSE41.HANDLE;
	}

	public static MemorySegment SDL_HasSSE41$address() {
		return SDL_HasSSE41.ADDR;
	}

	public static boolean SDL_HasSSE41() {
		var mh$ = SDL_HasSSE41.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_HasSSE41");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_HasSSE42 {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_HasSSE42");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_HasSSE42$descriptor() {
		return SDL_HasSSE42.DESC;
	}

	public static MethodHandle SDL_HasSSE42$handle() {
		return SDL_HasSSE42.HANDLE;
	}

	public static MemorySegment SDL_HasSSE42$address() {
		return SDL_HasSSE42.ADDR;
	}

	public static boolean SDL_HasSSE42() {
		var mh$ = SDL_HasSSE42.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_HasSSE42");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_HasAVX {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_HasAVX");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_HasAVX$descriptor() {
		return SDL_HasAVX.DESC;
	}

	public static MethodHandle SDL_HasAVX$handle() {
		return SDL_HasAVX.HANDLE;
	}

	public static MemorySegment SDL_HasAVX$address() {
		return SDL_HasAVX.ADDR;
	}

	public static boolean SDL_HasAVX() {
		var mh$ = SDL_HasAVX.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_HasAVX");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_HasAVX2 {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_HasAVX2");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_HasAVX2$descriptor() {
		return SDL_HasAVX2.DESC;
	}

	public static MethodHandle SDL_HasAVX2$handle() {
		return SDL_HasAVX2.HANDLE;
	}

	public static MemorySegment SDL_HasAVX2$address() {
		return SDL_HasAVX2.ADDR;
	}

	public static boolean SDL_HasAVX2() {
		var mh$ = SDL_HasAVX2.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_HasAVX2");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_HasAVX512F {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_HasAVX512F");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_HasAVX512F$descriptor() {
		return SDL_HasAVX512F.DESC;
	}

	public static MethodHandle SDL_HasAVX512F$handle() {
		return SDL_HasAVX512F.HANDLE;
	}

	public static MemorySegment SDL_HasAVX512F$address() {
		return SDL_HasAVX512F.ADDR;
	}

	public static boolean SDL_HasAVX512F() {
		var mh$ = SDL_HasAVX512F.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_HasAVX512F");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_HasARMSIMD {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_HasARMSIMD");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_HasARMSIMD$descriptor() {
		return SDL_HasARMSIMD.DESC;
	}

	public static MethodHandle SDL_HasARMSIMD$handle() {
		return SDL_HasARMSIMD.HANDLE;
	}

	public static MemorySegment SDL_HasARMSIMD$address() {
		return SDL_HasARMSIMD.ADDR;
	}

	public static boolean SDL_HasARMSIMD() {
		var mh$ = SDL_HasARMSIMD.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_HasARMSIMD");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_HasNEON {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_HasNEON");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_HasNEON$descriptor() {
		return SDL_HasNEON.DESC;
	}

	public static MethodHandle SDL_HasNEON$handle() {
		return SDL_HasNEON.HANDLE;
	}

	public static MemorySegment SDL_HasNEON$address() {
		return SDL_HasNEON.ADDR;
	}

	public static boolean SDL_HasNEON() {
		var mh$ = SDL_HasNEON.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_HasNEON");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_HasLSX {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_HasLSX");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_HasLSX$descriptor() {
		return SDL_HasLSX.DESC;
	}

	public static MethodHandle SDL_HasLSX$handle() {
		return SDL_HasLSX.HANDLE;
	}

	public static MemorySegment SDL_HasLSX$address() {
		return SDL_HasLSX.ADDR;
	}

	public static boolean SDL_HasLSX() {
		var mh$ = SDL_HasLSX.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_HasLSX");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_HasLASX {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_HasLASX");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_HasLASX$descriptor() {
		return SDL_HasLASX.DESC;
	}

	public static MethodHandle SDL_HasLASX$handle() {
		return SDL_HasLASX.HANDLE;
	}

	public static MemorySegment SDL_HasLASX$address() {
		return SDL_HasLASX.ADDR;
	}

	public static boolean SDL_HasLASX() {
		var mh$ = SDL_HasLASX.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_HasLASX");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetSystemRAM {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetSystemRAM");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetSystemRAM$descriptor() {
		return SDL_GetSystemRAM.DESC;
	}

	public static MethodHandle SDL_GetSystemRAM$handle() {
		return SDL_GetSystemRAM.HANDLE;
	}

	public static MemorySegment SDL_GetSystemRAM$address() {
		return SDL_GetSystemRAM.ADDR;
	}

	public static int SDL_GetSystemRAM() {
		var mh$ = SDL_GetSystemRAM.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetSystemRAM");
			}
			return (int) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetSIMDAlignment {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetSIMDAlignment");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetSIMDAlignment$descriptor() {
		return SDL_GetSIMDAlignment.DESC;
	}

	public static MethodHandle SDL_GetSIMDAlignment$handle() {
		return SDL_GetSIMDAlignment.HANDLE;
	}

	public static MemorySegment SDL_GetSIMDAlignment$address() {
		return SDL_GetSIMDAlignment.ADDR;
	}

	public static long SDL_GetSIMDAlignment() {
		var mh$ = SDL_GetSIMDAlignment.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetSIMDAlignment");
			}
			return (long) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetSystemPageSize {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetSystemPageSize");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetSystemPageSize$descriptor() {
		return SDL_GetSystemPageSize.DESC;
	}

	public static MethodHandle SDL_GetSystemPageSize$handle() {
		return SDL_GetSystemPageSize.HANDLE;
	}

	public static MemorySegment SDL_GetSystemPageSize$address() {
		return SDL_GetSystemPageSize.ADDR;
	}

	public static int SDL_GetSystemPageSize() {
		var mh$ = SDL_GetSystemPageSize.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetSystemPageSize");
			}
			return (int) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	public static OfInt SDL_DisplayID = SDL3.C_INT;

	public static OfInt SDL_WindowID = SDL3.C_INT;
	private static final int SDL_SYSTEM_THEME_UNKNOWN = (int) 0L;

	public static int SDL_SYSTEM_THEME_UNKNOWN() {
		return SDL_SYSTEM_THEME_UNKNOWN;
	}

	private static final int SDL_SYSTEM_THEME_LIGHT = (int) 1L;

	public static int SDL_SYSTEM_THEME_LIGHT() {
		return SDL_SYSTEM_THEME_LIGHT;
	}

	private static final int SDL_SYSTEM_THEME_DARK = (int) 2L;

	public static int SDL_SYSTEM_THEME_DARK() {
		return SDL_SYSTEM_THEME_DARK;
	}

	private static final int SDL_ORIENTATION_UNKNOWN = (int) 0L;

	public static int SDL_ORIENTATION_UNKNOWN() {
		return SDL_ORIENTATION_UNKNOWN;
	}

	private static final int SDL_ORIENTATION_LANDSCAPE = (int) 1L;

	public static int SDL_ORIENTATION_LANDSCAPE() {
		return SDL_ORIENTATION_LANDSCAPE;
	}

	private static final int SDL_ORIENTATION_LANDSCAPE_FLIPPED = (int) 2L;

	public static int SDL_ORIENTATION_LANDSCAPE_FLIPPED() {
		return SDL_ORIENTATION_LANDSCAPE_FLIPPED;
	}

	private static final int SDL_ORIENTATION_PORTRAIT = (int) 3L;

	public static int SDL_ORIENTATION_PORTRAIT() {
		return SDL_ORIENTATION_PORTRAIT;
	}

	private static final int SDL_ORIENTATION_PORTRAIT_FLIPPED = (int) 4L;

	public static int SDL_ORIENTATION_PORTRAIT_FLIPPED() {
		return SDL_ORIENTATION_PORTRAIT_FLIPPED;
	}

	public static OfLong SDL_WindowFlags = SDL3.C_LONG;
	private static final int SDL_FLASH_CANCEL = (int) 0L;

	public static int SDL_FLASH_CANCEL() {
		return SDL_FLASH_CANCEL;
	}

	private static final int SDL_FLASH_BRIEFLY = (int) 1L;

	public static int SDL_FLASH_BRIEFLY() {
		return SDL_FLASH_BRIEFLY;
	}

	private static final int SDL_FLASH_UNTIL_FOCUSED = (int) 2L;

	public static int SDL_FLASH_UNTIL_FOCUSED() {
		return SDL_FLASH_UNTIL_FOCUSED;
	}

	private static final int SDL_PROGRESS_STATE_INVALID = (int) -1L;

	public static int SDL_PROGRESS_STATE_INVALID() {
		return SDL_PROGRESS_STATE_INVALID;
	}

	private static final int SDL_PROGRESS_STATE_NONE = (int) 0L;

	public static int SDL_PROGRESS_STATE_NONE() {
		return SDL_PROGRESS_STATE_NONE;
	}

	private static final int SDL_PROGRESS_STATE_INDETERMINATE = (int) 1L;

	public static int SDL_PROGRESS_STATE_INDETERMINATE() {
		return SDL_PROGRESS_STATE_INDETERMINATE;
	}

	private static final int SDL_PROGRESS_STATE_NORMAL = (int) 2L;

	public static int SDL_PROGRESS_STATE_NORMAL() {
		return SDL_PROGRESS_STATE_NORMAL;
	}

	private static final int SDL_PROGRESS_STATE_PAUSED = (int) 3L;

	public static int SDL_PROGRESS_STATE_PAUSED() {
		return SDL_PROGRESS_STATE_PAUSED;
	}

	private static final int SDL_PROGRESS_STATE_ERROR = (int) 4L;

	public static int SDL_PROGRESS_STATE_ERROR() {
		return SDL_PROGRESS_STATE_ERROR;
	}

	public static AddressLayout SDL_GLContext = SDL3.C_POINTER;

	public static AddressLayout SDL_EGLDisplay = SDL3.C_POINTER;

	public static AddressLayout SDL_EGLConfig = SDL3.C_POINTER;

	public static AddressLayout SDL_EGLSurface = SDL3.C_POINTER;

	public static OfLong SDL_EGLAttrib = SDL3.C_LONG;

	public static OfInt SDL_EGLint = SDL3.C_INT;
	private static final int SDL_GL_RED_SIZE = (int) 0L;

	public static int SDL_GL_RED_SIZE() {
		return SDL_GL_RED_SIZE;
	}

	private static final int SDL_GL_GREEN_SIZE = (int) 1L;

	public static int SDL_GL_GREEN_SIZE() {
		return SDL_GL_GREEN_SIZE;
	}

	private static final int SDL_GL_BLUE_SIZE = (int) 2L;

	public static int SDL_GL_BLUE_SIZE() {
		return SDL_GL_BLUE_SIZE;
	}

	private static final int SDL_GL_ALPHA_SIZE = (int) 3L;

	public static int SDL_GL_ALPHA_SIZE() {
		return SDL_GL_ALPHA_SIZE;
	}

	private static final int SDL_GL_BUFFER_SIZE = (int) 4L;

	public static int SDL_GL_BUFFER_SIZE() {
		return SDL_GL_BUFFER_SIZE;
	}

	private static final int SDL_GL_DOUBLEBUFFER = (int) 5L;

	public static int SDL_GL_DOUBLEBUFFER() {
		return SDL_GL_DOUBLEBUFFER;
	}

	private static final int SDL_GL_DEPTH_SIZE = (int) 6L;

	public static int SDL_GL_DEPTH_SIZE() {
		return SDL_GL_DEPTH_SIZE;
	}

	private static final int SDL_GL_STENCIL_SIZE = (int) 7L;

	public static int SDL_GL_STENCIL_SIZE() {
		return SDL_GL_STENCIL_SIZE;
	}

	private static final int SDL_GL_ACCUM_RED_SIZE = (int) 8L;

	public static int SDL_GL_ACCUM_RED_SIZE() {
		return SDL_GL_ACCUM_RED_SIZE;
	}

	private static final int SDL_GL_ACCUM_GREEN_SIZE = (int) 9L;

	public static int SDL_GL_ACCUM_GREEN_SIZE() {
		return SDL_GL_ACCUM_GREEN_SIZE;
	}

	private static final int SDL_GL_ACCUM_BLUE_SIZE = (int) 10L;

	public static int SDL_GL_ACCUM_BLUE_SIZE() {
		return SDL_GL_ACCUM_BLUE_SIZE;
	}

	private static final int SDL_GL_ACCUM_ALPHA_SIZE = (int) 11L;

	public static int SDL_GL_ACCUM_ALPHA_SIZE() {
		return SDL_GL_ACCUM_ALPHA_SIZE;
	}

	private static final int SDL_GL_STEREO = (int) 12L;

	public static int SDL_GL_STEREO() {
		return SDL_GL_STEREO;
	}

	private static final int SDL_GL_MULTISAMPLEBUFFERS = (int) 13L;

	public static int SDL_GL_MULTISAMPLEBUFFERS() {
		return SDL_GL_MULTISAMPLEBUFFERS;
	}

	private static final int SDL_GL_MULTISAMPLESAMPLES = (int) 14L;

	public static int SDL_GL_MULTISAMPLESAMPLES() {
		return SDL_GL_MULTISAMPLESAMPLES;
	}

	private static final int SDL_GL_ACCELERATED_VISUAL = (int) 15L;

	public static int SDL_GL_ACCELERATED_VISUAL() {
		return SDL_GL_ACCELERATED_VISUAL;
	}

	private static final int SDL_GL_RETAINED_BACKING = (int) 16L;

	public static int SDL_GL_RETAINED_BACKING() {
		return SDL_GL_RETAINED_BACKING;
	}

	private static final int SDL_GL_CONTEXT_MAJOR_VERSION = (int) 17L;

	public static int SDL_GL_CONTEXT_MAJOR_VERSION() {
		return SDL_GL_CONTEXT_MAJOR_VERSION;
	}

	private static final int SDL_GL_CONTEXT_MINOR_VERSION = (int) 18L;

	public static int SDL_GL_CONTEXT_MINOR_VERSION() {
		return SDL_GL_CONTEXT_MINOR_VERSION;
	}

	private static final int SDL_GL_CONTEXT_FLAGS = (int) 19L;

	public static int SDL_GL_CONTEXT_FLAGS() {
		return SDL_GL_CONTEXT_FLAGS;
	}

	private static final int SDL_GL_CONTEXT_PROFILE_MASK = (int) 20L;

	public static int SDL_GL_CONTEXT_PROFILE_MASK() {
		return SDL_GL_CONTEXT_PROFILE_MASK;
	}

	private static final int SDL_GL_SHARE_WITH_CURRENT_CONTEXT = (int) 21L;

	public static int SDL_GL_SHARE_WITH_CURRENT_CONTEXT() {
		return SDL_GL_SHARE_WITH_CURRENT_CONTEXT;
	}

	private static final int SDL_GL_FRAMEBUFFER_SRGB_CAPABLE = (int) 22L;

	public static int SDL_GL_FRAMEBUFFER_SRGB_CAPABLE() {
		return SDL_GL_FRAMEBUFFER_SRGB_CAPABLE;
	}

	private static final int SDL_GL_CONTEXT_RELEASE_BEHAVIOR = (int) 23L;

	public static int SDL_GL_CONTEXT_RELEASE_BEHAVIOR() {
		return SDL_GL_CONTEXT_RELEASE_BEHAVIOR;
	}

	private static final int SDL_GL_CONTEXT_RESET_NOTIFICATION = (int) 24L;

	public static int SDL_GL_CONTEXT_RESET_NOTIFICATION() {
		return SDL_GL_CONTEXT_RESET_NOTIFICATION;
	}

	private static final int SDL_GL_CONTEXT_NO_ERROR = (int) 25L;

	public static int SDL_GL_CONTEXT_NO_ERROR() {
		return SDL_GL_CONTEXT_NO_ERROR;
	}

	private static final int SDL_GL_FLOATBUFFERS = (int) 26L;

	public static int SDL_GL_FLOATBUFFERS() {
		return SDL_GL_FLOATBUFFERS;
	}

	private static final int SDL_GL_EGL_PLATFORM = (int) 27L;

	public static int SDL_GL_EGL_PLATFORM() {
		return SDL_GL_EGL_PLATFORM;
	}

	public static OfInt SDL_GLProfile = SDL3.C_INT;

	public static OfInt SDL_GLContextFlag = SDL3.C_INT;

	public static OfInt SDL_GLContextReleaseFlag = SDL3.C_INT;

	public static OfInt SDL_GLContextResetNotification = SDL3.C_INT;

	private static class SDL_GetNumVideoDrivers {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetNumVideoDrivers");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetNumVideoDrivers$descriptor() {
		return SDL_GetNumVideoDrivers.DESC;
	}

	public static MethodHandle SDL_GetNumVideoDrivers$handle() {
		return SDL_GetNumVideoDrivers.HANDLE;
	}

	public static MemorySegment SDL_GetNumVideoDrivers$address() {
		return SDL_GetNumVideoDrivers.ADDR;
	}

	public static int SDL_GetNumVideoDrivers() {
		var mh$ = SDL_GetNumVideoDrivers.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetNumVideoDrivers");
			}
			return (int) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetVideoDriver {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetVideoDriver");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetVideoDriver$descriptor() {
		return SDL_GetVideoDriver.DESC;
	}

	public static MethodHandle SDL_GetVideoDriver$handle() {
		return SDL_GetVideoDriver.HANDLE;
	}

	public static MemorySegment SDL_GetVideoDriver$address() {
		return SDL_GetVideoDriver.ADDR;
	}

	public static MemorySegment SDL_GetVideoDriver(int index) {
		var mh$ = SDL_GetVideoDriver.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetVideoDriver", index);
			}
			return (MemorySegment) mh$.invokeExact(index);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetCurrentVideoDriver {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetCurrentVideoDriver");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetCurrentVideoDriver$descriptor() {
		return SDL_GetCurrentVideoDriver.DESC;
	}

	public static MethodHandle SDL_GetCurrentVideoDriver$handle() {
		return SDL_GetCurrentVideoDriver.HANDLE;
	}

	public static MemorySegment SDL_GetCurrentVideoDriver$address() {
		return SDL_GetCurrentVideoDriver.ADDR;
	}

	public static MemorySegment SDL_GetCurrentVideoDriver() {
		var mh$ = SDL_GetCurrentVideoDriver.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetCurrentVideoDriver");
			}
			return (MemorySegment) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetSystemTheme {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetSystemTheme");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetSystemTheme$descriptor() {
		return SDL_GetSystemTheme.DESC;
	}

	public static MethodHandle SDL_GetSystemTheme$handle() {
		return SDL_GetSystemTheme.HANDLE;
	}

	public static MemorySegment SDL_GetSystemTheme$address() {
		return SDL_GetSystemTheme.ADDR;
	}

	public static int SDL_GetSystemTheme() {
		var mh$ = SDL_GetSystemTheme.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetSystemTheme");
			}
			return (int) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetDisplays {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetDisplays");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetDisplays$descriptor() {
		return SDL_GetDisplays.DESC;
	}

	public static MethodHandle SDL_GetDisplays$handle() {
		return SDL_GetDisplays.HANDLE;
	}

	public static MemorySegment SDL_GetDisplays$address() {
		return SDL_GetDisplays.ADDR;
	}

	public static MemorySegment SDL_GetDisplays(MemorySegment count) {
		var mh$ = SDL_GetDisplays.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetDisplays", count);
			}
			return (MemorySegment) mh$.invokeExact(count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetPrimaryDisplay {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetPrimaryDisplay");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetPrimaryDisplay$descriptor() {
		return SDL_GetPrimaryDisplay.DESC;
	}

	public static MethodHandle SDL_GetPrimaryDisplay$handle() {
		return SDL_GetPrimaryDisplay.HANDLE;
	}

	public static MemorySegment SDL_GetPrimaryDisplay$address() {
		return SDL_GetPrimaryDisplay.ADDR;
	}

	public static int SDL_GetPrimaryDisplay() {
		var mh$ = SDL_GetPrimaryDisplay.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetPrimaryDisplay");
			}
			return (int) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetDisplayProperties {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetDisplayProperties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetDisplayProperties$descriptor() {
		return SDL_GetDisplayProperties.DESC;
	}

	public static MethodHandle SDL_GetDisplayProperties$handle() {
		return SDL_GetDisplayProperties.HANDLE;
	}

	public static MemorySegment SDL_GetDisplayProperties$address() {
		return SDL_GetDisplayProperties.ADDR;
	}

	public static int SDL_GetDisplayProperties(int displayID) {
		var mh$ = SDL_GetDisplayProperties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetDisplayProperties", displayID);
			}
			return (int) mh$.invokeExact(displayID);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetDisplayName {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetDisplayName");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetDisplayName$descriptor() {
		return SDL_GetDisplayName.DESC;
	}

	public static MethodHandle SDL_GetDisplayName$handle() {
		return SDL_GetDisplayName.HANDLE;
	}

	public static MemorySegment SDL_GetDisplayName$address() {
		return SDL_GetDisplayName.ADDR;
	}

	public static MemorySegment SDL_GetDisplayName(int displayID) {
		var mh$ = SDL_GetDisplayName.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetDisplayName", displayID);
			}
			return (MemorySegment) mh$.invokeExact(displayID);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetDisplayBounds {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetDisplayBounds");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetDisplayBounds$descriptor() {
		return SDL_GetDisplayBounds.DESC;
	}

	public static MethodHandle SDL_GetDisplayBounds$handle() {
		return SDL_GetDisplayBounds.HANDLE;
	}

	public static MemorySegment SDL_GetDisplayBounds$address() {
		return SDL_GetDisplayBounds.ADDR;
	}

	public static boolean SDL_GetDisplayBounds(int displayID, MemorySegment rect) {
		var mh$ = SDL_GetDisplayBounds.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetDisplayBounds", displayID, rect);
			}
			return (boolean) mh$.invokeExact(displayID, rect);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetDisplayUsableBounds {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetDisplayUsableBounds");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetDisplayUsableBounds$descriptor() {
		return SDL_GetDisplayUsableBounds.DESC;
	}

	public static MethodHandle SDL_GetDisplayUsableBounds$handle() {
		return SDL_GetDisplayUsableBounds.HANDLE;
	}

	public static MemorySegment SDL_GetDisplayUsableBounds$address() {
		return SDL_GetDisplayUsableBounds.ADDR;
	}

	public static boolean SDL_GetDisplayUsableBounds(int displayID, MemorySegment rect) {
		var mh$ = SDL_GetDisplayUsableBounds.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetDisplayUsableBounds", displayID, rect);
			}
			return (boolean) mh$.invokeExact(displayID, rect);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetNaturalDisplayOrientation {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetNaturalDisplayOrientation");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetNaturalDisplayOrientation$descriptor() {
		return SDL_GetNaturalDisplayOrientation.DESC;
	}

	public static MethodHandle SDL_GetNaturalDisplayOrientation$handle() {
		return SDL_GetNaturalDisplayOrientation.HANDLE;
	}

	public static MemorySegment SDL_GetNaturalDisplayOrientation$address() {
		return SDL_GetNaturalDisplayOrientation.ADDR;
	}

	public static int SDL_GetNaturalDisplayOrientation(int displayID) {
		var mh$ = SDL_GetNaturalDisplayOrientation.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetNaturalDisplayOrientation", displayID);
			}
			return (int) mh$.invokeExact(displayID);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetCurrentDisplayOrientation {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetCurrentDisplayOrientation");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetCurrentDisplayOrientation$descriptor() {
		return SDL_GetCurrentDisplayOrientation.DESC;
	}

	public static MethodHandle SDL_GetCurrentDisplayOrientation$handle() {
		return SDL_GetCurrentDisplayOrientation.HANDLE;
	}

	public static MemorySegment SDL_GetCurrentDisplayOrientation$address() {
		return SDL_GetCurrentDisplayOrientation.ADDR;
	}

	public static int SDL_GetCurrentDisplayOrientation(int displayID) {
		var mh$ = SDL_GetCurrentDisplayOrientation.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetCurrentDisplayOrientation", displayID);
			}
			return (int) mh$.invokeExact(displayID);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetDisplayContentScale {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_FLOAT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetDisplayContentScale");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetDisplayContentScale$descriptor() {
		return SDL_GetDisplayContentScale.DESC;
	}

	public static MethodHandle SDL_GetDisplayContentScale$handle() {
		return SDL_GetDisplayContentScale.HANDLE;
	}

	public static MemorySegment SDL_GetDisplayContentScale$address() {
		return SDL_GetDisplayContentScale.ADDR;
	}

	public static float SDL_GetDisplayContentScale(int displayID) {
		var mh$ = SDL_GetDisplayContentScale.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetDisplayContentScale", displayID);
			}
			return (float) mh$.invokeExact(displayID);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetFullscreenDisplayModes {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetFullscreenDisplayModes");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetFullscreenDisplayModes$descriptor() {
		return SDL_GetFullscreenDisplayModes.DESC;
	}

	public static MethodHandle SDL_GetFullscreenDisplayModes$handle() {
		return SDL_GetFullscreenDisplayModes.HANDLE;
	}

	public static MemorySegment SDL_GetFullscreenDisplayModes$address() {
		return SDL_GetFullscreenDisplayModes.ADDR;
	}

	public static MemorySegment SDL_GetFullscreenDisplayModes(int displayID, MemorySegment count) {
		var mh$ = SDL_GetFullscreenDisplayModes.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetFullscreenDisplayModes", displayID, count);
			}
			return (MemorySegment) mh$.invokeExact(displayID, count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetClosestFullscreenDisplayMode {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_FLOAT,
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetClosestFullscreenDisplayMode");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetClosestFullscreenDisplayMode$descriptor() {
		return SDL_GetClosestFullscreenDisplayMode.DESC;
	}

	public static MethodHandle SDL_GetClosestFullscreenDisplayMode$handle() {
		return SDL_GetClosestFullscreenDisplayMode.HANDLE;
	}

	public static MemorySegment SDL_GetClosestFullscreenDisplayMode$address() {
		return SDL_GetClosestFullscreenDisplayMode.ADDR;
	}

	public static boolean SDL_GetClosestFullscreenDisplayMode(int displayID, int w, int h, float refresh_rate, boolean include_high_density_modes, MemorySegment closest) {
		var mh$ = SDL_GetClosestFullscreenDisplayMode.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetClosestFullscreenDisplayMode", displayID, w, h, refresh_rate, include_high_density_modes, closest);
			}
			return (boolean) mh$.invokeExact(displayID, w, h, refresh_rate, include_high_density_modes, closest);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetDesktopDisplayMode {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetDesktopDisplayMode");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetDesktopDisplayMode$descriptor() {
		return SDL_GetDesktopDisplayMode.DESC;
	}

	public static MethodHandle SDL_GetDesktopDisplayMode$handle() {
		return SDL_GetDesktopDisplayMode.HANDLE;
	}

	public static MemorySegment SDL_GetDesktopDisplayMode$address() {
		return SDL_GetDesktopDisplayMode.ADDR;
	}

	public static MemorySegment SDL_GetDesktopDisplayMode(int displayID) {
		var mh$ = SDL_GetDesktopDisplayMode.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetDesktopDisplayMode", displayID);
			}
			return (MemorySegment) mh$.invokeExact(displayID);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetCurrentDisplayMode {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetCurrentDisplayMode");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetCurrentDisplayMode$descriptor() {
		return SDL_GetCurrentDisplayMode.DESC;
	}

	public static MethodHandle SDL_GetCurrentDisplayMode$handle() {
		return SDL_GetCurrentDisplayMode.HANDLE;
	}

	public static MemorySegment SDL_GetCurrentDisplayMode$address() {
		return SDL_GetCurrentDisplayMode.ADDR;
	}

	public static MemorySegment SDL_GetCurrentDisplayMode(int displayID) {
		var mh$ = SDL_GetCurrentDisplayMode.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetCurrentDisplayMode", displayID);
			}
			return (MemorySegment) mh$.invokeExact(displayID);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetDisplayForPoint {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetDisplayForPoint");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetDisplayForPoint$descriptor() {
		return SDL_GetDisplayForPoint.DESC;
	}

	public static MethodHandle SDL_GetDisplayForPoint$handle() {
		return SDL_GetDisplayForPoint.HANDLE;
	}

	public static MemorySegment SDL_GetDisplayForPoint$address() {
		return SDL_GetDisplayForPoint.ADDR;
	}

	public static int SDL_GetDisplayForPoint(MemorySegment point) {
		var mh$ = SDL_GetDisplayForPoint.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetDisplayForPoint", point);
			}
			return (int) mh$.invokeExact(point);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetDisplayForRect {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetDisplayForRect");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetDisplayForRect$descriptor() {
		return SDL_GetDisplayForRect.DESC;
	}

	public static MethodHandle SDL_GetDisplayForRect$handle() {
		return SDL_GetDisplayForRect.HANDLE;
	}

	public static MemorySegment SDL_GetDisplayForRect$address() {
		return SDL_GetDisplayForRect.ADDR;
	}

	public static int SDL_GetDisplayForRect(MemorySegment rect) {
		var mh$ = SDL_GetDisplayForRect.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetDisplayForRect", rect);
			}
			return (int) mh$.invokeExact(rect);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetDisplayForWindow {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetDisplayForWindow");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetDisplayForWindow$descriptor() {
		return SDL_GetDisplayForWindow.DESC;
	}

	public static MethodHandle SDL_GetDisplayForWindow$handle() {
		return SDL_GetDisplayForWindow.HANDLE;
	}

	public static MemorySegment SDL_GetDisplayForWindow$address() {
		return SDL_GetDisplayForWindow.ADDR;
	}

	public static int SDL_GetDisplayForWindow(MemorySegment window) {
		var mh$ = SDL_GetDisplayForWindow.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetDisplayForWindow", window);
			}
			return (int) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetWindowPixelDensity {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_FLOAT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetWindowPixelDensity");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetWindowPixelDensity$descriptor() {
		return SDL_GetWindowPixelDensity.DESC;
	}

	public static MethodHandle SDL_GetWindowPixelDensity$handle() {
		return SDL_GetWindowPixelDensity.HANDLE;
	}

	public static MemorySegment SDL_GetWindowPixelDensity$address() {
		return SDL_GetWindowPixelDensity.ADDR;
	}

	public static float SDL_GetWindowPixelDensity(MemorySegment window) {
		var mh$ = SDL_GetWindowPixelDensity.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetWindowPixelDensity", window);
			}
			return (float) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetWindowDisplayScale {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_FLOAT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetWindowDisplayScale");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetWindowDisplayScale$descriptor() {
		return SDL_GetWindowDisplayScale.DESC;
	}

	public static MethodHandle SDL_GetWindowDisplayScale$handle() {
		return SDL_GetWindowDisplayScale.HANDLE;
	}

	public static MemorySegment SDL_GetWindowDisplayScale$address() {
		return SDL_GetWindowDisplayScale.ADDR;
	}

	public static float SDL_GetWindowDisplayScale(MemorySegment window) {
		var mh$ = SDL_GetWindowDisplayScale.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetWindowDisplayScale", window);
			}
			return (float) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetWindowFullscreenMode {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetWindowFullscreenMode");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetWindowFullscreenMode$descriptor() {
		return SDL_SetWindowFullscreenMode.DESC;
	}

	public static MethodHandle SDL_SetWindowFullscreenMode$handle() {
		return SDL_SetWindowFullscreenMode.HANDLE;
	}

	public static MemorySegment SDL_SetWindowFullscreenMode$address() {
		return SDL_SetWindowFullscreenMode.ADDR;
	}

	public static boolean SDL_SetWindowFullscreenMode(MemorySegment window, MemorySegment mode) {
		var mh$ = SDL_SetWindowFullscreenMode.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetWindowFullscreenMode", window, mode);
			}
			return (boolean) mh$.invokeExact(window, mode);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetWindowFullscreenMode {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetWindowFullscreenMode");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetWindowFullscreenMode$descriptor() {
		return SDL_GetWindowFullscreenMode.DESC;
	}

	public static MethodHandle SDL_GetWindowFullscreenMode$handle() {
		return SDL_GetWindowFullscreenMode.HANDLE;
	}

	public static MemorySegment SDL_GetWindowFullscreenMode$address() {
		return SDL_GetWindowFullscreenMode.ADDR;
	}

	public static MemorySegment SDL_GetWindowFullscreenMode(MemorySegment window) {
		var mh$ = SDL_GetWindowFullscreenMode.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetWindowFullscreenMode", window);
			}
			return (MemorySegment) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetWindowICCProfile {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetWindowICCProfile");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetWindowICCProfile$descriptor() {
		return SDL_GetWindowICCProfile.DESC;
	}

	public static MethodHandle SDL_GetWindowICCProfile$handle() {
		return SDL_GetWindowICCProfile.HANDLE;
	}

	public static MemorySegment SDL_GetWindowICCProfile$address() {
		return SDL_GetWindowICCProfile.ADDR;
	}

	public static MemorySegment SDL_GetWindowICCProfile(MemorySegment window, MemorySegment size) {
		var mh$ = SDL_GetWindowICCProfile.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetWindowICCProfile", window, size);
			}
			return (MemorySegment) mh$.invokeExact(window, size);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetWindowPixelFormat {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetWindowPixelFormat");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetWindowPixelFormat$descriptor() {
		return SDL_GetWindowPixelFormat.DESC;
	}

	public static MethodHandle SDL_GetWindowPixelFormat$handle() {
		return SDL_GetWindowPixelFormat.HANDLE;
	}

	public static MemorySegment SDL_GetWindowPixelFormat$address() {
		return SDL_GetWindowPixelFormat.ADDR;
	}

	public static int SDL_GetWindowPixelFormat(MemorySegment window) {
		var mh$ = SDL_GetWindowPixelFormat.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetWindowPixelFormat", window);
			}
			return (int) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetWindows {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetWindows");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetWindows$descriptor() {
		return SDL_GetWindows.DESC;
	}

	public static MethodHandle SDL_GetWindows$handle() {
		return SDL_GetWindows.HANDLE;
	}

	public static MemorySegment SDL_GetWindows$address() {
		return SDL_GetWindows.ADDR;
	}

	public static MemorySegment SDL_GetWindows(MemorySegment count) {
		var mh$ = SDL_GetWindows.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetWindows", count);
			}
			return (MemorySegment) mh$.invokeExact(count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateWindow {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateWindow");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateWindow$descriptor() {
		return SDL_CreateWindow.DESC;
	}

	public static MethodHandle SDL_CreateWindow$handle() {
		return SDL_CreateWindow.HANDLE;
	}

	public static MemorySegment SDL_CreateWindow$address() {
		return SDL_CreateWindow.ADDR;
	}

	public static MemorySegment SDL_CreateWindow(MemorySegment title, int w, int h, long flags) {
		var mh$ = SDL_CreateWindow.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateWindow", title, w, h, flags);
			}
			return (MemorySegment) mh$.invokeExact(title, w, h, flags);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreatePopupWindow {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreatePopupWindow");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreatePopupWindow$descriptor() {
		return SDL_CreatePopupWindow.DESC;
	}

	public static MethodHandle SDL_CreatePopupWindow$handle() {
		return SDL_CreatePopupWindow.HANDLE;
	}

	public static MemorySegment SDL_CreatePopupWindow$address() {
		return SDL_CreatePopupWindow.ADDR;
	}

	public static MemorySegment SDL_CreatePopupWindow(MemorySegment parent, int offset_x, int offset_y, int w, int h, long flags) {
		var mh$ = SDL_CreatePopupWindow.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreatePopupWindow", parent, offset_x, offset_y, w, h, flags);
			}
			return (MemorySegment) mh$.invokeExact(parent, offset_x, offset_y, w, h, flags);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateWindowWithProperties {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateWindowWithProperties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateWindowWithProperties$descriptor() {
		return SDL_CreateWindowWithProperties.DESC;
	}

	public static MethodHandle SDL_CreateWindowWithProperties$handle() {
		return SDL_CreateWindowWithProperties.HANDLE;
	}

	public static MemorySegment SDL_CreateWindowWithProperties$address() {
		return SDL_CreateWindowWithProperties.ADDR;
	}

	public static MemorySegment SDL_CreateWindowWithProperties(int props) {
		var mh$ = SDL_CreateWindowWithProperties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateWindowWithProperties", props);
			}
			return (MemorySegment) mh$.invokeExact(props);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetWindowID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetWindowID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetWindowID$descriptor() {
		return SDL_GetWindowID.DESC;
	}

	public static MethodHandle SDL_GetWindowID$handle() {
		return SDL_GetWindowID.HANDLE;
	}

	public static MemorySegment SDL_GetWindowID$address() {
		return SDL_GetWindowID.ADDR;
	}

	public static int SDL_GetWindowID(MemorySegment window) {
		var mh$ = SDL_GetWindowID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetWindowID", window);
			}
			return (int) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetWindowFromID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetWindowFromID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetWindowFromID$descriptor() {
		return SDL_GetWindowFromID.DESC;
	}

	public static MethodHandle SDL_GetWindowFromID$handle() {
		return SDL_GetWindowFromID.HANDLE;
	}

	public static MemorySegment SDL_GetWindowFromID$address() {
		return SDL_GetWindowFromID.ADDR;
	}

	public static MemorySegment SDL_GetWindowFromID(int id) {
		var mh$ = SDL_GetWindowFromID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetWindowFromID", id);
			}
			return (MemorySegment) mh$.invokeExact(id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetWindowParent {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetWindowParent");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetWindowParent$descriptor() {
		return SDL_GetWindowParent.DESC;
	}

	public static MethodHandle SDL_GetWindowParent$handle() {
		return SDL_GetWindowParent.HANDLE;
	}

	public static MemorySegment SDL_GetWindowParent$address() {
		return SDL_GetWindowParent.ADDR;
	}

	public static MemorySegment SDL_GetWindowParent(MemorySegment window) {
		var mh$ = SDL_GetWindowParent.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetWindowParent", window);
			}
			return (MemorySegment) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetWindowProperties {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetWindowProperties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetWindowProperties$descriptor() {
		return SDL_GetWindowProperties.DESC;
	}

	public static MethodHandle SDL_GetWindowProperties$handle() {
		return SDL_GetWindowProperties.HANDLE;
	}

	public static MemorySegment SDL_GetWindowProperties$address() {
		return SDL_GetWindowProperties.ADDR;
	}

	public static int SDL_GetWindowProperties(MemorySegment window) {
		var mh$ = SDL_GetWindowProperties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetWindowProperties", window);
			}
			return (int) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetWindowFlags {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetWindowFlags");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetWindowFlags$descriptor() {
		return SDL_GetWindowFlags.DESC;
	}

	public static MethodHandle SDL_GetWindowFlags$handle() {
		return SDL_GetWindowFlags.HANDLE;
	}

	public static MemorySegment SDL_GetWindowFlags$address() {
		return SDL_GetWindowFlags.ADDR;
	}

	public static long SDL_GetWindowFlags(MemorySegment window) {
		var mh$ = SDL_GetWindowFlags.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetWindowFlags", window);
			}
			return (long) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetWindowTitle {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetWindowTitle");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetWindowTitle$descriptor() {
		return SDL_SetWindowTitle.DESC;
	}

	public static MethodHandle SDL_SetWindowTitle$handle() {
		return SDL_SetWindowTitle.HANDLE;
	}

	public static MemorySegment SDL_SetWindowTitle$address() {
		return SDL_SetWindowTitle.ADDR;
	}

	public static boolean SDL_SetWindowTitle(MemorySegment window, MemorySegment title) {
		var mh$ = SDL_SetWindowTitle.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetWindowTitle", window, title);
			}
			return (boolean) mh$.invokeExact(window, title);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetWindowTitle {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetWindowTitle");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetWindowTitle$descriptor() {
		return SDL_GetWindowTitle.DESC;
	}

	public static MethodHandle SDL_GetWindowTitle$handle() {
		return SDL_GetWindowTitle.HANDLE;
	}

	public static MemorySegment SDL_GetWindowTitle$address() {
		return SDL_GetWindowTitle.ADDR;
	}

	public static MemorySegment SDL_GetWindowTitle(MemorySegment window) {
		var mh$ = SDL_GetWindowTitle.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetWindowTitle", window);
			}
			return (MemorySegment) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetWindowIcon {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetWindowIcon");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetWindowIcon$descriptor() {
		return SDL_SetWindowIcon.DESC;
	}

	public static MethodHandle SDL_SetWindowIcon$handle() {
		return SDL_SetWindowIcon.HANDLE;
	}

	public static MemorySegment SDL_SetWindowIcon$address() {
		return SDL_SetWindowIcon.ADDR;
	}

	public static boolean SDL_SetWindowIcon(MemorySegment window, MemorySegment icon) {
		var mh$ = SDL_SetWindowIcon.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetWindowIcon", window, icon);
			}
			return (boolean) mh$.invokeExact(window, icon);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetWindowPosition {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetWindowPosition");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetWindowPosition$descriptor() {
		return SDL_SetWindowPosition.DESC;
	}

	public static MethodHandle SDL_SetWindowPosition$handle() {
		return SDL_SetWindowPosition.HANDLE;
	}

	public static MemorySegment SDL_SetWindowPosition$address() {
		return SDL_SetWindowPosition.ADDR;
	}

	public static boolean SDL_SetWindowPosition(MemorySegment window, int x, int y) {
		var mh$ = SDL_SetWindowPosition.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetWindowPosition", window, x, y);
			}
			return (boolean) mh$.invokeExact(window, x, y);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetWindowPosition {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetWindowPosition");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetWindowPosition$descriptor() {
		return SDL_GetWindowPosition.DESC;
	}

	public static MethodHandle SDL_GetWindowPosition$handle() {
		return SDL_GetWindowPosition.HANDLE;
	}

	public static MemorySegment SDL_GetWindowPosition$address() {
		return SDL_GetWindowPosition.ADDR;
	}

	public static boolean SDL_GetWindowPosition(MemorySegment window, MemorySegment x, MemorySegment y) {
		var mh$ = SDL_GetWindowPosition.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetWindowPosition", window, x, y);
			}
			return (boolean) mh$.invokeExact(window, x, y);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetWindowSize {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetWindowSize");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetWindowSize$descriptor() {
		return SDL_SetWindowSize.DESC;
	}

	public static MethodHandle SDL_SetWindowSize$handle() {
		return SDL_SetWindowSize.HANDLE;
	}

	public static MemorySegment SDL_SetWindowSize$address() {
		return SDL_SetWindowSize.ADDR;
	}

	public static boolean SDL_SetWindowSize(MemorySegment window, int w, int h) {
		var mh$ = SDL_SetWindowSize.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetWindowSize", window, w, h);
			}
			return (boolean) mh$.invokeExact(window, w, h);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetWindowSize {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetWindowSize");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetWindowSize$descriptor() {
		return SDL_GetWindowSize.DESC;
	}

	public static MethodHandle SDL_GetWindowSize$handle() {
		return SDL_GetWindowSize.HANDLE;
	}

	public static MemorySegment SDL_GetWindowSize$address() {
		return SDL_GetWindowSize.ADDR;
	}

	public static boolean SDL_GetWindowSize(MemorySegment window, MemorySegment w, MemorySegment h) {
		var mh$ = SDL_GetWindowSize.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetWindowSize", window, w, h);
			}
			return (boolean) mh$.invokeExact(window, w, h);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetWindowSafeArea {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetWindowSafeArea");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetWindowSafeArea$descriptor() {
		return SDL_GetWindowSafeArea.DESC;
	}

	public static MethodHandle SDL_GetWindowSafeArea$handle() {
		return SDL_GetWindowSafeArea.HANDLE;
	}

	public static MemorySegment SDL_GetWindowSafeArea$address() {
		return SDL_GetWindowSafeArea.ADDR;
	}

	public static boolean SDL_GetWindowSafeArea(MemorySegment window, MemorySegment rect) {
		var mh$ = SDL_GetWindowSafeArea.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetWindowSafeArea", window, rect);
			}
			return (boolean) mh$.invokeExact(window, rect);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetWindowAspectRatio {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetWindowAspectRatio");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetWindowAspectRatio$descriptor() {
		return SDL_SetWindowAspectRatio.DESC;
	}

	public static MethodHandle SDL_SetWindowAspectRatio$handle() {
		return SDL_SetWindowAspectRatio.HANDLE;
	}

	public static MemorySegment SDL_SetWindowAspectRatio$address() {
		return SDL_SetWindowAspectRatio.ADDR;
	}

	public static boolean SDL_SetWindowAspectRatio(MemorySegment window, float min_aspect, float max_aspect) {
		var mh$ = SDL_SetWindowAspectRatio.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetWindowAspectRatio", window, min_aspect, max_aspect);
			}
			return (boolean) mh$.invokeExact(window, min_aspect, max_aspect);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetWindowAspectRatio {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetWindowAspectRatio");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetWindowAspectRatio$descriptor() {
		return SDL_GetWindowAspectRatio.DESC;
	}

	public static MethodHandle SDL_GetWindowAspectRatio$handle() {
		return SDL_GetWindowAspectRatio.HANDLE;
	}

	public static MemorySegment SDL_GetWindowAspectRatio$address() {
		return SDL_GetWindowAspectRatio.ADDR;
	}

	public static boolean SDL_GetWindowAspectRatio(MemorySegment window, MemorySegment min_aspect, MemorySegment max_aspect) {
		var mh$ = SDL_GetWindowAspectRatio.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetWindowAspectRatio", window, min_aspect, max_aspect);
			}
			return (boolean) mh$.invokeExact(window, min_aspect, max_aspect);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetWindowBordersSize {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetWindowBordersSize");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetWindowBordersSize$descriptor() {
		return SDL_GetWindowBordersSize.DESC;
	}

	public static MethodHandle SDL_GetWindowBordersSize$handle() {
		return SDL_GetWindowBordersSize.HANDLE;
	}

	public static MemorySegment SDL_GetWindowBordersSize$address() {
		return SDL_GetWindowBordersSize.ADDR;
	}

	public static boolean SDL_GetWindowBordersSize(MemorySegment window, MemorySegment top, MemorySegment left, MemorySegment bottom, MemorySegment right) {
		var mh$ = SDL_GetWindowBordersSize.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetWindowBordersSize", window, top, left, bottom, right);
			}
			return (boolean) mh$.invokeExact(window, top, left, bottom, right);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetWindowSizeInPixels {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetWindowSizeInPixels");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetWindowSizeInPixels$descriptor() {
		return SDL_GetWindowSizeInPixels.DESC;
	}

	public static MethodHandle SDL_GetWindowSizeInPixels$handle() {
		return SDL_GetWindowSizeInPixels.HANDLE;
	}

	public static MemorySegment SDL_GetWindowSizeInPixels$address() {
		return SDL_GetWindowSizeInPixels.ADDR;
	}

	public static boolean SDL_GetWindowSizeInPixels(MemorySegment window, MemorySegment w, MemorySegment h) {
		var mh$ = SDL_GetWindowSizeInPixels.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetWindowSizeInPixels", window, w, h);
			}
			return (boolean) mh$.invokeExact(window, w, h);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetWindowMinimumSize {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetWindowMinimumSize");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetWindowMinimumSize$descriptor() {
		return SDL_SetWindowMinimumSize.DESC;
	}

	public static MethodHandle SDL_SetWindowMinimumSize$handle() {
		return SDL_SetWindowMinimumSize.HANDLE;
	}

	public static MemorySegment SDL_SetWindowMinimumSize$address() {
		return SDL_SetWindowMinimumSize.ADDR;
	}

	public static boolean SDL_SetWindowMinimumSize(MemorySegment window, int min_w, int min_h) {
		var mh$ = SDL_SetWindowMinimumSize.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetWindowMinimumSize", window, min_w, min_h);
			}
			return (boolean) mh$.invokeExact(window, min_w, min_h);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetWindowMinimumSize {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetWindowMinimumSize");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetWindowMinimumSize$descriptor() {
		return SDL_GetWindowMinimumSize.DESC;
	}

	public static MethodHandle SDL_GetWindowMinimumSize$handle() {
		return SDL_GetWindowMinimumSize.HANDLE;
	}

	public static MemorySegment SDL_GetWindowMinimumSize$address() {
		return SDL_GetWindowMinimumSize.ADDR;
	}

	public static boolean SDL_GetWindowMinimumSize(MemorySegment window, MemorySegment w, MemorySegment h) {
		var mh$ = SDL_GetWindowMinimumSize.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetWindowMinimumSize", window, w, h);
			}
			return (boolean) mh$.invokeExact(window, w, h);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetWindowMaximumSize {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetWindowMaximumSize");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetWindowMaximumSize$descriptor() {
		return SDL_SetWindowMaximumSize.DESC;
	}

	public static MethodHandle SDL_SetWindowMaximumSize$handle() {
		return SDL_SetWindowMaximumSize.HANDLE;
	}

	public static MemorySegment SDL_SetWindowMaximumSize$address() {
		return SDL_SetWindowMaximumSize.ADDR;
	}

	public static boolean SDL_SetWindowMaximumSize(MemorySegment window, int max_w, int max_h) {
		var mh$ = SDL_SetWindowMaximumSize.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetWindowMaximumSize", window, max_w, max_h);
			}
			return (boolean) mh$.invokeExact(window, max_w, max_h);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetWindowMaximumSize {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetWindowMaximumSize");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetWindowMaximumSize$descriptor() {
		return SDL_GetWindowMaximumSize.DESC;
	}

	public static MethodHandle SDL_GetWindowMaximumSize$handle() {
		return SDL_GetWindowMaximumSize.HANDLE;
	}

	public static MemorySegment SDL_GetWindowMaximumSize$address() {
		return SDL_GetWindowMaximumSize.ADDR;
	}

	public static boolean SDL_GetWindowMaximumSize(MemorySegment window, MemorySegment w, MemorySegment h) {
		var mh$ = SDL_GetWindowMaximumSize.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetWindowMaximumSize", window, w, h);
			}
			return (boolean) mh$.invokeExact(window, w, h);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetWindowBordered {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetWindowBordered");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetWindowBordered$descriptor() {
		return SDL_SetWindowBordered.DESC;
	}

	public static MethodHandle SDL_SetWindowBordered$handle() {
		return SDL_SetWindowBordered.HANDLE;
	}

	public static MemorySegment SDL_SetWindowBordered$address() {
		return SDL_SetWindowBordered.ADDR;
	}

	public static boolean SDL_SetWindowBordered(MemorySegment window, boolean bordered) {
		var mh$ = SDL_SetWindowBordered.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetWindowBordered", window, bordered);
			}
			return (boolean) mh$.invokeExact(window, bordered);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetWindowResizable {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetWindowResizable");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetWindowResizable$descriptor() {
		return SDL_SetWindowResizable.DESC;
	}

	public static MethodHandle SDL_SetWindowResizable$handle() {
		return SDL_SetWindowResizable.HANDLE;
	}

	public static MemorySegment SDL_SetWindowResizable$address() {
		return SDL_SetWindowResizable.ADDR;
	}

	public static boolean SDL_SetWindowResizable(MemorySegment window, boolean resizable) {
		var mh$ = SDL_SetWindowResizable.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetWindowResizable", window, resizable);
			}
			return (boolean) mh$.invokeExact(window, resizable);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetWindowAlwaysOnTop {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetWindowAlwaysOnTop");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetWindowAlwaysOnTop$descriptor() {
		return SDL_SetWindowAlwaysOnTop.DESC;
	}

	public static MethodHandle SDL_SetWindowAlwaysOnTop$handle() {
		return SDL_SetWindowAlwaysOnTop.HANDLE;
	}

	public static MemorySegment SDL_SetWindowAlwaysOnTop$address() {
		return SDL_SetWindowAlwaysOnTop.ADDR;
	}

	public static boolean SDL_SetWindowAlwaysOnTop(MemorySegment window, boolean on_top) {
		var mh$ = SDL_SetWindowAlwaysOnTop.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetWindowAlwaysOnTop", window, on_top);
			}
			return (boolean) mh$.invokeExact(window, on_top);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetWindowFillDocument {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetWindowFillDocument");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetWindowFillDocument$descriptor() {
		return SDL_SetWindowFillDocument.DESC;
	}

	public static MethodHandle SDL_SetWindowFillDocument$handle() {
		return SDL_SetWindowFillDocument.HANDLE;
	}

	public static MemorySegment SDL_SetWindowFillDocument$address() {
		return SDL_SetWindowFillDocument.ADDR;
	}

	public static boolean SDL_SetWindowFillDocument(MemorySegment window, boolean fill) {
		var mh$ = SDL_SetWindowFillDocument.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetWindowFillDocument", window, fill);
			}
			return (boolean) mh$.invokeExact(window, fill);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ShowWindow {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ShowWindow");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ShowWindow$descriptor() {
		return SDL_ShowWindow.DESC;
	}

	public static MethodHandle SDL_ShowWindow$handle() {
		return SDL_ShowWindow.HANDLE;
	}

	public static MemorySegment SDL_ShowWindow$address() {
		return SDL_ShowWindow.ADDR;
	}

	public static boolean SDL_ShowWindow(MemorySegment window) {
		var mh$ = SDL_ShowWindow.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ShowWindow", window);
			}
			return (boolean) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_HideWindow {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_HideWindow");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_HideWindow$descriptor() {
		return SDL_HideWindow.DESC;
	}

	public static MethodHandle SDL_HideWindow$handle() {
		return SDL_HideWindow.HANDLE;
	}

	public static MemorySegment SDL_HideWindow$address() {
		return SDL_HideWindow.ADDR;
	}

	public static boolean SDL_HideWindow(MemorySegment window) {
		var mh$ = SDL_HideWindow.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_HideWindow", window);
			}
			return (boolean) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RaiseWindow {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RaiseWindow");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RaiseWindow$descriptor() {
		return SDL_RaiseWindow.DESC;
	}

	public static MethodHandle SDL_RaiseWindow$handle() {
		return SDL_RaiseWindow.HANDLE;
	}

	public static MemorySegment SDL_RaiseWindow$address() {
		return SDL_RaiseWindow.ADDR;
	}

	public static boolean SDL_RaiseWindow(MemorySegment window) {
		var mh$ = SDL_RaiseWindow.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RaiseWindow", window);
			}
			return (boolean) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_MaximizeWindow {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_MaximizeWindow");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_MaximizeWindow$descriptor() {
		return SDL_MaximizeWindow.DESC;
	}

	public static MethodHandle SDL_MaximizeWindow$handle() {
		return SDL_MaximizeWindow.HANDLE;
	}

	public static MemorySegment SDL_MaximizeWindow$address() {
		return SDL_MaximizeWindow.ADDR;
	}

	public static boolean SDL_MaximizeWindow(MemorySegment window) {
		var mh$ = SDL_MaximizeWindow.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_MaximizeWindow", window);
			}
			return (boolean) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_MinimizeWindow {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_MinimizeWindow");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_MinimizeWindow$descriptor() {
		return SDL_MinimizeWindow.DESC;
	}

	public static MethodHandle SDL_MinimizeWindow$handle() {
		return SDL_MinimizeWindow.HANDLE;
	}

	public static MemorySegment SDL_MinimizeWindow$address() {
		return SDL_MinimizeWindow.ADDR;
	}

	public static boolean SDL_MinimizeWindow(MemorySegment window) {
		var mh$ = SDL_MinimizeWindow.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_MinimizeWindow", window);
			}
			return (boolean) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RestoreWindow {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RestoreWindow");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RestoreWindow$descriptor() {
		return SDL_RestoreWindow.DESC;
	}

	public static MethodHandle SDL_RestoreWindow$handle() {
		return SDL_RestoreWindow.HANDLE;
	}

	public static MemorySegment SDL_RestoreWindow$address() {
		return SDL_RestoreWindow.ADDR;
	}

	public static boolean SDL_RestoreWindow(MemorySegment window) {
		var mh$ = SDL_RestoreWindow.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RestoreWindow", window);
			}
			return (boolean) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetWindowFullscreen {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetWindowFullscreen");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetWindowFullscreen$descriptor() {
		return SDL_SetWindowFullscreen.DESC;
	}

	public static MethodHandle SDL_SetWindowFullscreen$handle() {
		return SDL_SetWindowFullscreen.HANDLE;
	}

	public static MemorySegment SDL_SetWindowFullscreen$address() {
		return SDL_SetWindowFullscreen.ADDR;
	}

	public static boolean SDL_SetWindowFullscreen(MemorySegment window, boolean fullscreen) {
		var mh$ = SDL_SetWindowFullscreen.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetWindowFullscreen", window, fullscreen);
			}
			return (boolean) mh$.invokeExact(window, fullscreen);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SyncWindow {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SyncWindow");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SyncWindow$descriptor() {
		return SDL_SyncWindow.DESC;
	}

	public static MethodHandle SDL_SyncWindow$handle() {
		return SDL_SyncWindow.HANDLE;
	}

	public static MemorySegment SDL_SyncWindow$address() {
		return SDL_SyncWindow.ADDR;
	}

	public static boolean SDL_SyncWindow(MemorySegment window) {
		var mh$ = SDL_SyncWindow.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SyncWindow", window);
			}
			return (boolean) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WindowHasSurface {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WindowHasSurface");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WindowHasSurface$descriptor() {
		return SDL_WindowHasSurface.DESC;
	}

	public static MethodHandle SDL_WindowHasSurface$handle() {
		return SDL_WindowHasSurface.HANDLE;
	}

	public static MemorySegment SDL_WindowHasSurface$address() {
		return SDL_WindowHasSurface.ADDR;
	}

	public static boolean SDL_WindowHasSurface(MemorySegment window) {
		var mh$ = SDL_WindowHasSurface.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WindowHasSurface", window);
			}
			return (boolean) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetWindowSurface {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetWindowSurface");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetWindowSurface$descriptor() {
		return SDL_GetWindowSurface.DESC;
	}

	public static MethodHandle SDL_GetWindowSurface$handle() {
		return SDL_GetWindowSurface.HANDLE;
	}

	public static MemorySegment SDL_GetWindowSurface$address() {
		return SDL_GetWindowSurface.ADDR;
	}

	public static MemorySegment SDL_GetWindowSurface(MemorySegment window) {
		var mh$ = SDL_GetWindowSurface.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetWindowSurface", window);
			}
			return (MemorySegment) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetWindowSurfaceVSync {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetWindowSurfaceVSync");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetWindowSurfaceVSync$descriptor() {
		return SDL_SetWindowSurfaceVSync.DESC;
	}

	public static MethodHandle SDL_SetWindowSurfaceVSync$handle() {
		return SDL_SetWindowSurfaceVSync.HANDLE;
	}

	public static MemorySegment SDL_SetWindowSurfaceVSync$address() {
		return SDL_SetWindowSurfaceVSync.ADDR;
	}

	public static boolean SDL_SetWindowSurfaceVSync(MemorySegment window, int vsync) {
		var mh$ = SDL_SetWindowSurfaceVSync.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetWindowSurfaceVSync", window, vsync);
			}
			return (boolean) mh$.invokeExact(window, vsync);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetWindowSurfaceVSync {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetWindowSurfaceVSync");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetWindowSurfaceVSync$descriptor() {
		return SDL_GetWindowSurfaceVSync.DESC;
	}

	public static MethodHandle SDL_GetWindowSurfaceVSync$handle() {
		return SDL_GetWindowSurfaceVSync.HANDLE;
	}

	public static MemorySegment SDL_GetWindowSurfaceVSync$address() {
		return SDL_GetWindowSurfaceVSync.ADDR;
	}

	public static boolean SDL_GetWindowSurfaceVSync(MemorySegment window, MemorySegment vsync) {
		var mh$ = SDL_GetWindowSurfaceVSync.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetWindowSurfaceVSync", window, vsync);
			}
			return (boolean) mh$.invokeExact(window, vsync);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_UpdateWindowSurface {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_UpdateWindowSurface");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_UpdateWindowSurface$descriptor() {
		return SDL_UpdateWindowSurface.DESC;
	}

	public static MethodHandle SDL_UpdateWindowSurface$handle() {
		return SDL_UpdateWindowSurface.HANDLE;
	}

	public static MemorySegment SDL_UpdateWindowSurface$address() {
		return SDL_UpdateWindowSurface.ADDR;
	}

	public static boolean SDL_UpdateWindowSurface(MemorySegment window) {
		var mh$ = SDL_UpdateWindowSurface.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_UpdateWindowSurface", window);
			}
			return (boolean) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_UpdateWindowSurfaceRects {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_UpdateWindowSurfaceRects");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_UpdateWindowSurfaceRects$descriptor() {
		return SDL_UpdateWindowSurfaceRects.DESC;
	}

	public static MethodHandle SDL_UpdateWindowSurfaceRects$handle() {
		return SDL_UpdateWindowSurfaceRects.HANDLE;
	}

	public static MemorySegment SDL_UpdateWindowSurfaceRects$address() {
		return SDL_UpdateWindowSurfaceRects.ADDR;
	}

	public static boolean SDL_UpdateWindowSurfaceRects(MemorySegment window, MemorySegment rects, int numrects) {
		var mh$ = SDL_UpdateWindowSurfaceRects.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_UpdateWindowSurfaceRects", window, rects, numrects);
			}
			return (boolean) mh$.invokeExact(window, rects, numrects);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DestroyWindowSurface {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DestroyWindowSurface");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DestroyWindowSurface$descriptor() {
		return SDL_DestroyWindowSurface.DESC;
	}

	public static MethodHandle SDL_DestroyWindowSurface$handle() {
		return SDL_DestroyWindowSurface.HANDLE;
	}

	public static MemorySegment SDL_DestroyWindowSurface$address() {
		return SDL_DestroyWindowSurface.ADDR;
	}

	public static boolean SDL_DestroyWindowSurface(MemorySegment window) {
		var mh$ = SDL_DestroyWindowSurface.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DestroyWindowSurface", window);
			}
			return (boolean) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetWindowKeyboardGrab {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetWindowKeyboardGrab");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetWindowKeyboardGrab$descriptor() {
		return SDL_SetWindowKeyboardGrab.DESC;
	}

	public static MethodHandle SDL_SetWindowKeyboardGrab$handle() {
		return SDL_SetWindowKeyboardGrab.HANDLE;
	}

	public static MemorySegment SDL_SetWindowKeyboardGrab$address() {
		return SDL_SetWindowKeyboardGrab.ADDR;
	}

	public static boolean SDL_SetWindowKeyboardGrab(MemorySegment window, boolean grabbed) {
		var mh$ = SDL_SetWindowKeyboardGrab.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetWindowKeyboardGrab", window, grabbed);
			}
			return (boolean) mh$.invokeExact(window, grabbed);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetWindowMouseGrab {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetWindowMouseGrab");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetWindowMouseGrab$descriptor() {
		return SDL_SetWindowMouseGrab.DESC;
	}

	public static MethodHandle SDL_SetWindowMouseGrab$handle() {
		return SDL_SetWindowMouseGrab.HANDLE;
	}

	public static MemorySegment SDL_SetWindowMouseGrab$address() {
		return SDL_SetWindowMouseGrab.ADDR;
	}

	public static boolean SDL_SetWindowMouseGrab(MemorySegment window, boolean grabbed) {
		var mh$ = SDL_SetWindowMouseGrab.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetWindowMouseGrab", window, grabbed);
			}
			return (boolean) mh$.invokeExact(window, grabbed);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetWindowKeyboardGrab {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetWindowKeyboardGrab");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetWindowKeyboardGrab$descriptor() {
		return SDL_GetWindowKeyboardGrab.DESC;
	}

	public static MethodHandle SDL_GetWindowKeyboardGrab$handle() {
		return SDL_GetWindowKeyboardGrab.HANDLE;
	}

	public static MemorySegment SDL_GetWindowKeyboardGrab$address() {
		return SDL_GetWindowKeyboardGrab.ADDR;
	}

	public static boolean SDL_GetWindowKeyboardGrab(MemorySegment window) {
		var mh$ = SDL_GetWindowKeyboardGrab.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetWindowKeyboardGrab", window);
			}
			return (boolean) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetWindowMouseGrab {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetWindowMouseGrab");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetWindowMouseGrab$descriptor() {
		return SDL_GetWindowMouseGrab.DESC;
	}

	public static MethodHandle SDL_GetWindowMouseGrab$handle() {
		return SDL_GetWindowMouseGrab.HANDLE;
	}

	public static MemorySegment SDL_GetWindowMouseGrab$address() {
		return SDL_GetWindowMouseGrab.ADDR;
	}

	public static boolean SDL_GetWindowMouseGrab(MemorySegment window) {
		var mh$ = SDL_GetWindowMouseGrab.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetWindowMouseGrab", window);
			}
			return (boolean) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGrabbedWindow {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGrabbedWindow");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGrabbedWindow$descriptor() {
		return SDL_GetGrabbedWindow.DESC;
	}

	public static MethodHandle SDL_GetGrabbedWindow$handle() {
		return SDL_GetGrabbedWindow.HANDLE;
	}

	public static MemorySegment SDL_GetGrabbedWindow$address() {
		return SDL_GetGrabbedWindow.ADDR;
	}

	public static MemorySegment SDL_GetGrabbedWindow() {
		var mh$ = SDL_GetGrabbedWindow.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGrabbedWindow");
			}
			return (MemorySegment) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetWindowMouseRect {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetWindowMouseRect");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetWindowMouseRect$descriptor() {
		return SDL_SetWindowMouseRect.DESC;
	}

	public static MethodHandle SDL_SetWindowMouseRect$handle() {
		return SDL_SetWindowMouseRect.HANDLE;
	}

	public static MemorySegment SDL_SetWindowMouseRect$address() {
		return SDL_SetWindowMouseRect.ADDR;
	}

	public static boolean SDL_SetWindowMouseRect(MemorySegment window, MemorySegment rect) {
		var mh$ = SDL_SetWindowMouseRect.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetWindowMouseRect", window, rect);
			}
			return (boolean) mh$.invokeExact(window, rect);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetWindowMouseRect {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetWindowMouseRect");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetWindowMouseRect$descriptor() {
		return SDL_GetWindowMouseRect.DESC;
	}

	public static MethodHandle SDL_GetWindowMouseRect$handle() {
		return SDL_GetWindowMouseRect.HANDLE;
	}

	public static MemorySegment SDL_GetWindowMouseRect$address() {
		return SDL_GetWindowMouseRect.ADDR;
	}

	public static MemorySegment SDL_GetWindowMouseRect(MemorySegment window) {
		var mh$ = SDL_GetWindowMouseRect.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetWindowMouseRect", window);
			}
			return (MemorySegment) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetWindowOpacity {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetWindowOpacity");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetWindowOpacity$descriptor() {
		return SDL_SetWindowOpacity.DESC;
	}

	public static MethodHandle SDL_SetWindowOpacity$handle() {
		return SDL_SetWindowOpacity.HANDLE;
	}

	public static MemorySegment SDL_SetWindowOpacity$address() {
		return SDL_SetWindowOpacity.ADDR;
	}

	public static boolean SDL_SetWindowOpacity(MemorySegment window, float opacity) {
		var mh$ = SDL_SetWindowOpacity.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetWindowOpacity", window, opacity);
			}
			return (boolean) mh$.invokeExact(window, opacity);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetWindowOpacity {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_FLOAT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetWindowOpacity");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetWindowOpacity$descriptor() {
		return SDL_GetWindowOpacity.DESC;
	}

	public static MethodHandle SDL_GetWindowOpacity$handle() {
		return SDL_GetWindowOpacity.HANDLE;
	}

	public static MemorySegment SDL_GetWindowOpacity$address() {
		return SDL_GetWindowOpacity.ADDR;
	}

	public static float SDL_GetWindowOpacity(MemorySegment window) {
		var mh$ = SDL_GetWindowOpacity.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetWindowOpacity", window);
			}
			return (float) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetWindowParent {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetWindowParent");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetWindowParent$descriptor() {
		return SDL_SetWindowParent.DESC;
	}

	public static MethodHandle SDL_SetWindowParent$handle() {
		return SDL_SetWindowParent.HANDLE;
	}

	public static MemorySegment SDL_SetWindowParent$address() {
		return SDL_SetWindowParent.ADDR;
	}

	public static boolean SDL_SetWindowParent(MemorySegment window, MemorySegment parent) {
		var mh$ = SDL_SetWindowParent.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetWindowParent", window, parent);
			}
			return (boolean) mh$.invokeExact(window, parent);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetWindowModal {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetWindowModal");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetWindowModal$descriptor() {
		return SDL_SetWindowModal.DESC;
	}

	public static MethodHandle SDL_SetWindowModal$handle() {
		return SDL_SetWindowModal.HANDLE;
	}

	public static MemorySegment SDL_SetWindowModal$address() {
		return SDL_SetWindowModal.ADDR;
	}

	public static boolean SDL_SetWindowModal(MemorySegment window, boolean modal) {
		var mh$ = SDL_SetWindowModal.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetWindowModal", window, modal);
			}
			return (boolean) mh$.invokeExact(window, modal);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetWindowFocusable {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetWindowFocusable");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetWindowFocusable$descriptor() {
		return SDL_SetWindowFocusable.DESC;
	}

	public static MethodHandle SDL_SetWindowFocusable$handle() {
		return SDL_SetWindowFocusable.HANDLE;
	}

	public static MemorySegment SDL_SetWindowFocusable$address() {
		return SDL_SetWindowFocusable.ADDR;
	}

	public static boolean SDL_SetWindowFocusable(MemorySegment window, boolean focusable) {
		var mh$ = SDL_SetWindowFocusable.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetWindowFocusable", window, focusable);
			}
			return (boolean) mh$.invokeExact(window, focusable);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ShowWindowSystemMenu {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ShowWindowSystemMenu");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ShowWindowSystemMenu$descriptor() {
		return SDL_ShowWindowSystemMenu.DESC;
	}

	public static MethodHandle SDL_ShowWindowSystemMenu$handle() {
		return SDL_ShowWindowSystemMenu.HANDLE;
	}

	public static MemorySegment SDL_ShowWindowSystemMenu$address() {
		return SDL_ShowWindowSystemMenu.ADDR;
	}

	public static boolean SDL_ShowWindowSystemMenu(MemorySegment window, int x, int y) {
		var mh$ = SDL_ShowWindowSystemMenu.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ShowWindowSystemMenu", window, x, y);
			}
			return (boolean) mh$.invokeExact(window, x, y);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static final int SDL_HITTEST_NORMAL = (int) 0L;

	public static int SDL_HITTEST_NORMAL() {
		return SDL_HITTEST_NORMAL;
	}

	private static final int SDL_HITTEST_DRAGGABLE = (int) 1L;

	public static int SDL_HITTEST_DRAGGABLE() {
		return SDL_HITTEST_DRAGGABLE;
	}

	private static final int SDL_HITTEST_RESIZE_TOPLEFT = (int) 2L;

	public static int SDL_HITTEST_RESIZE_TOPLEFT() {
		return SDL_HITTEST_RESIZE_TOPLEFT;
	}

	private static final int SDL_HITTEST_RESIZE_TOP = (int) 3L;

	public static int SDL_HITTEST_RESIZE_TOP() {
		return SDL_HITTEST_RESIZE_TOP;
	}

	private static final int SDL_HITTEST_RESIZE_TOPRIGHT = (int) 4L;

	public static int SDL_HITTEST_RESIZE_TOPRIGHT() {
		return SDL_HITTEST_RESIZE_TOPRIGHT;
	}

	private static final int SDL_HITTEST_RESIZE_RIGHT = (int) 5L;

	public static int SDL_HITTEST_RESIZE_RIGHT() {
		return SDL_HITTEST_RESIZE_RIGHT;
	}

	private static final int SDL_HITTEST_RESIZE_BOTTOMRIGHT = (int) 6L;

	public static int SDL_HITTEST_RESIZE_BOTTOMRIGHT() {
		return SDL_HITTEST_RESIZE_BOTTOMRIGHT;
	}

	private static final int SDL_HITTEST_RESIZE_BOTTOM = (int) 7L;

	public static int SDL_HITTEST_RESIZE_BOTTOM() {
		return SDL_HITTEST_RESIZE_BOTTOM;
	}

	private static final int SDL_HITTEST_RESIZE_BOTTOMLEFT = (int) 8L;

	public static int SDL_HITTEST_RESIZE_BOTTOMLEFT() {
		return SDL_HITTEST_RESIZE_BOTTOMLEFT;
	}

	private static final int SDL_HITTEST_RESIZE_LEFT = (int) 9L;

	public static int SDL_HITTEST_RESIZE_LEFT() {
		return SDL_HITTEST_RESIZE_LEFT;
	}

	private static class SDL_SetWindowHitTest {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetWindowHitTest");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetWindowHitTest$descriptor() {
		return SDL_SetWindowHitTest.DESC;
	}

	public static MethodHandle SDL_SetWindowHitTest$handle() {
		return SDL_SetWindowHitTest.HANDLE;
	}

	public static MemorySegment SDL_SetWindowHitTest$address() {
		return SDL_SetWindowHitTest.ADDR;
	}

	public static boolean SDL_SetWindowHitTest(MemorySegment window, MemorySegment callback, MemorySegment callback_data) {
		var mh$ = SDL_SetWindowHitTest.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetWindowHitTest", window, callback, callback_data);
			}
			return (boolean) mh$.invokeExact(window, callback, callback_data);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetWindowShape {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetWindowShape");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetWindowShape$descriptor() {
		return SDL_SetWindowShape.DESC;
	}

	public static MethodHandle SDL_SetWindowShape$handle() {
		return SDL_SetWindowShape.HANDLE;
	}

	public static MemorySegment SDL_SetWindowShape$address() {
		return SDL_SetWindowShape.ADDR;
	}

	public static boolean SDL_SetWindowShape(MemorySegment window, MemorySegment shape) {
		var mh$ = SDL_SetWindowShape.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetWindowShape", window, shape);
			}
			return (boolean) mh$.invokeExact(window, shape);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_FlashWindow {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_FlashWindow");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_FlashWindow$descriptor() {
		return SDL_FlashWindow.DESC;
	}

	public static MethodHandle SDL_FlashWindow$handle() {
		return SDL_FlashWindow.HANDLE;
	}

	public static MemorySegment SDL_FlashWindow$address() {
		return SDL_FlashWindow.ADDR;
	}

	public static boolean SDL_FlashWindow(MemorySegment window, int operation) {
		var mh$ = SDL_FlashWindow.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_FlashWindow", window, operation);
			}
			return (boolean) mh$.invokeExact(window, operation);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetWindowProgressState {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetWindowProgressState");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetWindowProgressState$descriptor() {
		return SDL_SetWindowProgressState.DESC;
	}

	public static MethodHandle SDL_SetWindowProgressState$handle() {
		return SDL_SetWindowProgressState.HANDLE;
	}

	public static MemorySegment SDL_SetWindowProgressState$address() {
		return SDL_SetWindowProgressState.ADDR;
	}

	public static boolean SDL_SetWindowProgressState(MemorySegment window, int state) {
		var mh$ = SDL_SetWindowProgressState.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetWindowProgressState", window, state);
			}
			return (boolean) mh$.invokeExact(window, state);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetWindowProgressState {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetWindowProgressState");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetWindowProgressState$descriptor() {
		return SDL_GetWindowProgressState.DESC;
	}

	public static MethodHandle SDL_GetWindowProgressState$handle() {
		return SDL_GetWindowProgressState.HANDLE;
	}

	public static MemorySegment SDL_GetWindowProgressState$address() {
		return SDL_GetWindowProgressState.ADDR;
	}

	public static int SDL_GetWindowProgressState(MemorySegment window) {
		var mh$ = SDL_GetWindowProgressState.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetWindowProgressState", window);
			}
			return (int) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetWindowProgressValue {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetWindowProgressValue");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetWindowProgressValue$descriptor() {
		return SDL_SetWindowProgressValue.DESC;
	}

	public static MethodHandle SDL_SetWindowProgressValue$handle() {
		return SDL_SetWindowProgressValue.HANDLE;
	}

	public static MemorySegment SDL_SetWindowProgressValue$address() {
		return SDL_SetWindowProgressValue.ADDR;
	}

	public static boolean SDL_SetWindowProgressValue(MemorySegment window, float value) {
		var mh$ = SDL_SetWindowProgressValue.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetWindowProgressValue", window, value);
			}
			return (boolean) mh$.invokeExact(window, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetWindowProgressValue {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_FLOAT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetWindowProgressValue");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetWindowProgressValue$descriptor() {
		return SDL_GetWindowProgressValue.DESC;
	}

	public static MethodHandle SDL_GetWindowProgressValue$handle() {
		return SDL_GetWindowProgressValue.HANDLE;
	}

	public static MemorySegment SDL_GetWindowProgressValue$address() {
		return SDL_GetWindowProgressValue.ADDR;
	}

	public static float SDL_GetWindowProgressValue(MemorySegment window) {
		var mh$ = SDL_GetWindowProgressValue.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetWindowProgressValue", window);
			}
			return (float) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DestroyWindow {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DestroyWindow");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DestroyWindow$descriptor() {
		return SDL_DestroyWindow.DESC;
	}

	public static MethodHandle SDL_DestroyWindow$handle() {
		return SDL_DestroyWindow.HANDLE;
	}

	public static MemorySegment SDL_DestroyWindow$address() {
		return SDL_DestroyWindow.ADDR;
	}

	public static void SDL_DestroyWindow(MemorySegment window) {
		var mh$ = SDL_DestroyWindow.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DestroyWindow", window);
			}
			mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ScreenSaverEnabled {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ScreenSaverEnabled");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ScreenSaverEnabled$descriptor() {
		return SDL_ScreenSaverEnabled.DESC;
	}

	public static MethodHandle SDL_ScreenSaverEnabled$handle() {
		return SDL_ScreenSaverEnabled.HANDLE;
	}

	public static MemorySegment SDL_ScreenSaverEnabled$address() {
		return SDL_ScreenSaverEnabled.ADDR;
	}

	public static boolean SDL_ScreenSaverEnabled() {
		var mh$ = SDL_ScreenSaverEnabled.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ScreenSaverEnabled");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_EnableScreenSaver {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_EnableScreenSaver");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_EnableScreenSaver$descriptor() {
		return SDL_EnableScreenSaver.DESC;
	}

	public static MethodHandle SDL_EnableScreenSaver$handle() {
		return SDL_EnableScreenSaver.HANDLE;
	}

	public static MemorySegment SDL_EnableScreenSaver$address() {
		return SDL_EnableScreenSaver.ADDR;
	}

	public static boolean SDL_EnableScreenSaver() {
		var mh$ = SDL_EnableScreenSaver.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_EnableScreenSaver");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DisableScreenSaver {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DisableScreenSaver");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DisableScreenSaver$descriptor() {
		return SDL_DisableScreenSaver.DESC;
	}

	public static MethodHandle SDL_DisableScreenSaver$handle() {
		return SDL_DisableScreenSaver.HANDLE;
	}

	public static MemorySegment SDL_DisableScreenSaver$address() {
		return SDL_DisableScreenSaver.ADDR;
	}

	public static boolean SDL_DisableScreenSaver() {
		var mh$ = SDL_DisableScreenSaver.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DisableScreenSaver");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GL_LoadLibrary {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GL_LoadLibrary");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GL_LoadLibrary$descriptor() {
		return SDL_GL_LoadLibrary.DESC;
	}

	public static MethodHandle SDL_GL_LoadLibrary$handle() {
		return SDL_GL_LoadLibrary.HANDLE;
	}

	public static MemorySegment SDL_GL_LoadLibrary$address() {
		return SDL_GL_LoadLibrary.ADDR;
	}

	public static boolean SDL_GL_LoadLibrary(MemorySegment path) {
		var mh$ = SDL_GL_LoadLibrary.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GL_LoadLibrary", path);
			}
			return (boolean) mh$.invokeExact(path);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GL_GetProcAddress {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GL_GetProcAddress");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GL_GetProcAddress$descriptor() {
		return SDL_GL_GetProcAddress.DESC;
	}

	public static MethodHandle SDL_GL_GetProcAddress$handle() {
		return SDL_GL_GetProcAddress.HANDLE;
	}

	public static MemorySegment SDL_GL_GetProcAddress$address() {
		return SDL_GL_GetProcAddress.ADDR;
	}

	public static MemorySegment SDL_GL_GetProcAddress(MemorySegment proc) {
		var mh$ = SDL_GL_GetProcAddress.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GL_GetProcAddress", proc);
			}
			return (MemorySegment) mh$.invokeExact(proc);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_EGL_GetProcAddress {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_EGL_GetProcAddress");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_EGL_GetProcAddress$descriptor() {
		return SDL_EGL_GetProcAddress.DESC;
	}

	public static MethodHandle SDL_EGL_GetProcAddress$handle() {
		return SDL_EGL_GetProcAddress.HANDLE;
	}

	public static MemorySegment SDL_EGL_GetProcAddress$address() {
		return SDL_EGL_GetProcAddress.ADDR;
	}

	public static MemorySegment SDL_EGL_GetProcAddress(MemorySegment proc) {
		var mh$ = SDL_EGL_GetProcAddress.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_EGL_GetProcAddress", proc);
			}
			return (MemorySegment) mh$.invokeExact(proc);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GL_UnloadLibrary {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid();

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GL_UnloadLibrary");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GL_UnloadLibrary$descriptor() {
		return SDL_GL_UnloadLibrary.DESC;
	}

	public static MethodHandle SDL_GL_UnloadLibrary$handle() {
		return SDL_GL_UnloadLibrary.HANDLE;
	}

	public static MemorySegment SDL_GL_UnloadLibrary$address() {
		return SDL_GL_UnloadLibrary.ADDR;
	}

	public static void SDL_GL_UnloadLibrary() {
		var mh$ = SDL_GL_UnloadLibrary.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GL_UnloadLibrary");
			}
			mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GL_ExtensionSupported {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GL_ExtensionSupported");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GL_ExtensionSupported$descriptor() {
		return SDL_GL_ExtensionSupported.DESC;
	}

	public static MethodHandle SDL_GL_ExtensionSupported$handle() {
		return SDL_GL_ExtensionSupported.HANDLE;
	}

	public static MemorySegment SDL_GL_ExtensionSupported$address() {
		return SDL_GL_ExtensionSupported.ADDR;
	}

	public static boolean SDL_GL_ExtensionSupported(MemorySegment extension) {
		var mh$ = SDL_GL_ExtensionSupported.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GL_ExtensionSupported", extension);
			}
			return (boolean) mh$.invokeExact(extension);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GL_ResetAttributes {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid();

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GL_ResetAttributes");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GL_ResetAttributes$descriptor() {
		return SDL_GL_ResetAttributes.DESC;
	}

	public static MethodHandle SDL_GL_ResetAttributes$handle() {
		return SDL_GL_ResetAttributes.HANDLE;
	}

	public static MemorySegment SDL_GL_ResetAttributes$address() {
		return SDL_GL_ResetAttributes.ADDR;
	}

	public static void SDL_GL_ResetAttributes() {
		var mh$ = SDL_GL_ResetAttributes.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GL_ResetAttributes");
			}
			mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GL_SetAttribute {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GL_SetAttribute");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GL_SetAttribute$descriptor() {
		return SDL_GL_SetAttribute.DESC;
	}

	public static MethodHandle SDL_GL_SetAttribute$handle() {
		return SDL_GL_SetAttribute.HANDLE;
	}

	public static MemorySegment SDL_GL_SetAttribute$address() {
		return SDL_GL_SetAttribute.ADDR;
	}

	public static boolean SDL_GL_SetAttribute(int attr, int value) {
		var mh$ = SDL_GL_SetAttribute.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GL_SetAttribute", attr, value);
			}
			return (boolean) mh$.invokeExact(attr, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GL_GetAttribute {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GL_GetAttribute");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GL_GetAttribute$descriptor() {
		return SDL_GL_GetAttribute.DESC;
	}

	public static MethodHandle SDL_GL_GetAttribute$handle() {
		return SDL_GL_GetAttribute.HANDLE;
	}

	public static MemorySegment SDL_GL_GetAttribute$address() {
		return SDL_GL_GetAttribute.ADDR;
	}

	public static boolean SDL_GL_GetAttribute(int attr, MemorySegment value) {
		var mh$ = SDL_GL_GetAttribute.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GL_GetAttribute", attr, value);
			}
			return (boolean) mh$.invokeExact(attr, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GL_CreateContext {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GL_CreateContext");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GL_CreateContext$descriptor() {
		return SDL_GL_CreateContext.DESC;
	}

	public static MethodHandle SDL_GL_CreateContext$handle() {
		return SDL_GL_CreateContext.HANDLE;
	}

	public static MemorySegment SDL_GL_CreateContext$address() {
		return SDL_GL_CreateContext.ADDR;
	}

	public static MemorySegment SDL_GL_CreateContext(MemorySegment window) {
		var mh$ = SDL_GL_CreateContext.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GL_CreateContext", window);
			}
			return (MemorySegment) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GL_MakeCurrent {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GL_MakeCurrent");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GL_MakeCurrent$descriptor() {
		return SDL_GL_MakeCurrent.DESC;
	}

	public static MethodHandle SDL_GL_MakeCurrent$handle() {
		return SDL_GL_MakeCurrent.HANDLE;
	}

	public static MemorySegment SDL_GL_MakeCurrent$address() {
		return SDL_GL_MakeCurrent.ADDR;
	}

	public static boolean SDL_GL_MakeCurrent(MemorySegment window, MemorySegment context) {
		var mh$ = SDL_GL_MakeCurrent.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GL_MakeCurrent", window, context);
			}
			return (boolean) mh$.invokeExact(window, context);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GL_GetCurrentWindow {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GL_GetCurrentWindow");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GL_GetCurrentWindow$descriptor() {
		return SDL_GL_GetCurrentWindow.DESC;
	}

	public static MethodHandle SDL_GL_GetCurrentWindow$handle() {
		return SDL_GL_GetCurrentWindow.HANDLE;
	}

	public static MemorySegment SDL_GL_GetCurrentWindow$address() {
		return SDL_GL_GetCurrentWindow.ADDR;
	}

	public static MemorySegment SDL_GL_GetCurrentWindow() {
		var mh$ = SDL_GL_GetCurrentWindow.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GL_GetCurrentWindow");
			}
			return (MemorySegment) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GL_GetCurrentContext {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GL_GetCurrentContext");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GL_GetCurrentContext$descriptor() {
		return SDL_GL_GetCurrentContext.DESC;
	}

	public static MethodHandle SDL_GL_GetCurrentContext$handle() {
		return SDL_GL_GetCurrentContext.HANDLE;
	}

	public static MemorySegment SDL_GL_GetCurrentContext$address() {
		return SDL_GL_GetCurrentContext.ADDR;
	}

	public static MemorySegment SDL_GL_GetCurrentContext() {
		var mh$ = SDL_GL_GetCurrentContext.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GL_GetCurrentContext");
			}
			return (MemorySegment) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}
}
