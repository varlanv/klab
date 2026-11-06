package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

public class SDL3 extends SDL3_1 {

	public static class SDL_Log {
		private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);
		private static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_Log");

		private final MethodHandle handle;
		private final FunctionDescriptor descriptor;
		private final MethodHandle spreader;

		private SDL_Log(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
			this.handle = handle;
			this.descriptor = descriptor;
			this.spreader = spreader;
		}

		public static SDL_Log makeInvoker(MemoryLayout... layouts) {
			FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
			Linker.Option fva$ = Linker.Option.firstVariadicArg(BASE_DESC.argumentLayouts().size());
			var mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, fva$);
			var spreader$ = mh$.asSpreader(Object[].class, layouts.length);
			return new SDL_Log(mh$, desc$, spreader$);
		}

		public static MemorySegment address() {
			return ADDR;
		}

		public MethodHandle handle() {
			return handle;
		}

		public FunctionDescriptor descriptor() {
			return descriptor;
		}

		public void apply(MemorySegment fmt, Object... x1) {
			try {
				if (TRACE_DOWNCALLS) {
					traceDowncall("SDL_Log", fmt, x1);
				}
				spreader.invokeExact(fmt, x1);
			} catch (IllegalArgumentException | ClassCastException ex$) {
				throw ex$;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	public static class SDL_LogTrace {
		private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.ofVoid(
				SDL3.C_INT,
				SDL3.C_POINTER
		);
		private static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_LogTrace");

		private final MethodHandle handle;
		private final FunctionDescriptor descriptor;
		private final MethodHandle spreader;

		private SDL_LogTrace(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
			this.handle = handle;
			this.descriptor = descriptor;
			this.spreader = spreader;
		}

		public static SDL_LogTrace makeInvoker(MemoryLayout... layouts) {
			FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
			Linker.Option fva$ = Linker.Option.firstVariadicArg(BASE_DESC.argumentLayouts().size());
			var mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, fva$);
			var spreader$ = mh$.asSpreader(Object[].class, layouts.length);
			return new SDL_LogTrace(mh$, desc$, spreader$);
		}

		public static MemorySegment address() {
			return ADDR;
		}

		public MethodHandle handle() {
			return handle;
		}

		public FunctionDescriptor descriptor() {
			return descriptor;
		}

		public void apply(int category, MemorySegment fmt, Object... x2) {
			try {
				if (TRACE_DOWNCALLS) {
					traceDowncall("SDL_LogTrace", category, fmt, x2);
				}
				spreader.invokeExact(category, fmt, x2);
			} catch (IllegalArgumentException | ClassCastException ex$) {
				throw ex$;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	public static class SDL_LogVerbose {
		private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.ofVoid(
				SDL3.C_INT,
				SDL3.C_POINTER
		);
		private static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_LogVerbose");

		private final MethodHandle handle;
		private final FunctionDescriptor descriptor;
		private final MethodHandle spreader;

		private SDL_LogVerbose(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
			this.handle = handle;
			this.descriptor = descriptor;
			this.spreader = spreader;
		}

		public static SDL_LogVerbose makeInvoker(MemoryLayout... layouts) {
			FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
			Linker.Option fva$ = Linker.Option.firstVariadicArg(BASE_DESC.argumentLayouts().size());
			var mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, fva$);
			var spreader$ = mh$.asSpreader(Object[].class, layouts.length);
			return new SDL_LogVerbose(mh$, desc$, spreader$);
		}

		public static MemorySegment address() {
			return ADDR;
		}

		public MethodHandle handle() {
			return handle;
		}

		public FunctionDescriptor descriptor() {
			return descriptor;
		}

		public void apply(int category, MemorySegment fmt, Object... x2) {
			try {
				if (TRACE_DOWNCALLS) {
					traceDowncall("SDL_LogVerbose", category, fmt, x2);
				}
				spreader.invokeExact(category, fmt, x2);
			} catch (IllegalArgumentException | ClassCastException ex$) {
				throw ex$;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	public static class SDL_LogDebug {
		private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.ofVoid(
				SDL3.C_INT,
				SDL3.C_POINTER
		);
		private static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_LogDebug");

		private final MethodHandle handle;
		private final FunctionDescriptor descriptor;
		private final MethodHandle spreader;

		private SDL_LogDebug(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
			this.handle = handle;
			this.descriptor = descriptor;
			this.spreader = spreader;
		}

		public static SDL_LogDebug makeInvoker(MemoryLayout... layouts) {
			FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
			Linker.Option fva$ = Linker.Option.firstVariadicArg(BASE_DESC.argumentLayouts().size());
			var mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, fva$);
			var spreader$ = mh$.asSpreader(Object[].class, layouts.length);
			return new SDL_LogDebug(mh$, desc$, spreader$);
		}

		public static MemorySegment address() {
			return ADDR;
		}

		public MethodHandle handle() {
			return handle;
		}

		public FunctionDescriptor descriptor() {
			return descriptor;
		}

		public void apply(int category, MemorySegment fmt, Object... x2) {
			try {
				if (TRACE_DOWNCALLS) {
					traceDowncall("SDL_LogDebug", category, fmt, x2);
				}
				spreader.invokeExact(category, fmt, x2);
			} catch (IllegalArgumentException | ClassCastException ex$) {
				throw ex$;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	public static class SDL_LogInfo {
		private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.ofVoid(
				SDL3.C_INT,
				SDL3.C_POINTER
		);
		private static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_LogInfo");

		private final MethodHandle handle;
		private final FunctionDescriptor descriptor;
		private final MethodHandle spreader;

		private SDL_LogInfo(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
			this.handle = handle;
			this.descriptor = descriptor;
			this.spreader = spreader;
		}

		public static SDL_LogInfo makeInvoker(MemoryLayout... layouts) {
			FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
			Linker.Option fva$ = Linker.Option.firstVariadicArg(BASE_DESC.argumentLayouts().size());
			var mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, fva$);
			var spreader$ = mh$.asSpreader(Object[].class, layouts.length);
			return new SDL_LogInfo(mh$, desc$, spreader$);
		}

		public static MemorySegment address() {
			return ADDR;
		}

		public MethodHandle handle() {
			return handle;
		}

		public FunctionDescriptor descriptor() {
			return descriptor;
		}

		public void apply(int category, MemorySegment fmt, Object... x2) {
			try {
				if (TRACE_DOWNCALLS) {
					traceDowncall("SDL_LogInfo", category, fmt, x2);
				}
				spreader.invokeExact(category, fmt, x2);
			} catch (IllegalArgumentException | ClassCastException ex$) {
				throw ex$;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	public static class SDL_LogWarn {
		private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.ofVoid(
				SDL3.C_INT,
				SDL3.C_POINTER
		);
		private static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_LogWarn");

		private final MethodHandle handle;
		private final FunctionDescriptor descriptor;
		private final MethodHandle spreader;

		private SDL_LogWarn(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
			this.handle = handle;
			this.descriptor = descriptor;
			this.spreader = spreader;
		}

		public static SDL_LogWarn makeInvoker(MemoryLayout... layouts) {
			FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
			Linker.Option fva$ = Linker.Option.firstVariadicArg(BASE_DESC.argumentLayouts().size());
			var mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, fva$);
			var spreader$ = mh$.asSpreader(Object[].class, layouts.length);
			return new SDL_LogWarn(mh$, desc$, spreader$);
		}

		public static MemorySegment address() {
			return ADDR;
		}

		public MethodHandle handle() {
			return handle;
		}

		public FunctionDescriptor descriptor() {
			return descriptor;
		}

		public void apply(int category, MemorySegment fmt, Object... x2) {
			try {
				if (TRACE_DOWNCALLS) {
					traceDowncall("SDL_LogWarn", category, fmt, x2);
				}
				spreader.invokeExact(category, fmt, x2);
			} catch (IllegalArgumentException | ClassCastException ex$) {
				throw ex$;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	public static class SDL_LogError {
		private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.ofVoid(
				SDL3.C_INT,
				SDL3.C_POINTER
		);
		private static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_LogError");

		private final MethodHandle handle;
		private final FunctionDescriptor descriptor;
		private final MethodHandle spreader;

		private SDL_LogError(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
			this.handle = handle;
			this.descriptor = descriptor;
			this.spreader = spreader;
		}

		public static SDL_LogError makeInvoker(MemoryLayout... layouts) {
			FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
			Linker.Option fva$ = Linker.Option.firstVariadicArg(BASE_DESC.argumentLayouts().size());
			var mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, fva$);
			var spreader$ = mh$.asSpreader(Object[].class, layouts.length);
			return new SDL_LogError(mh$, desc$, spreader$);
		}

		public static MemorySegment address() {
			return ADDR;
		}

		public MethodHandle handle() {
			return handle;
		}

		public FunctionDescriptor descriptor() {
			return descriptor;
		}

		public void apply(int category, MemorySegment fmt, Object... x2) {
			try {
				if (TRACE_DOWNCALLS) {
					traceDowncall("SDL_LogError", category, fmt, x2);
				}
				spreader.invokeExact(category, fmt, x2);
			} catch (IllegalArgumentException | ClassCastException ex$) {
				throw ex$;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	public static class SDL_LogCritical {
		private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.ofVoid(
				SDL3.C_INT,
				SDL3.C_POINTER
		);
		private static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_LogCritical");

		private final MethodHandle handle;
		private final FunctionDescriptor descriptor;
		private final MethodHandle spreader;

		private SDL_LogCritical(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
			this.handle = handle;
			this.descriptor = descriptor;
			this.spreader = spreader;
		}

		public static SDL_LogCritical makeInvoker(MemoryLayout... layouts) {
			FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
			Linker.Option fva$ = Linker.Option.firstVariadicArg(BASE_DESC.argumentLayouts().size());
			var mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, fva$);
			var spreader$ = mh$.asSpreader(Object[].class, layouts.length);
			return new SDL_LogCritical(mh$, desc$, spreader$);
		}

		public static MemorySegment address() {
			return ADDR;
		}

		public MethodHandle handle() {
			return handle;
		}

		public FunctionDescriptor descriptor() {
			return descriptor;
		}

		public void apply(int category, MemorySegment fmt, Object... x2) {
			try {
				if (TRACE_DOWNCALLS) {
					traceDowncall("SDL_LogCritical", category, fmt, x2);
				}
				spreader.invokeExact(category, fmt, x2);
			} catch (IllegalArgumentException | ClassCastException ex$) {
				throw ex$;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	public static class SDL_LogMessage {
		private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.ofVoid(
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_POINTER
		);
		private static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_LogMessage");

		private final MethodHandle handle;
		private final FunctionDescriptor descriptor;
		private final MethodHandle spreader;

		private SDL_LogMessage(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
			this.handle = handle;
			this.descriptor = descriptor;
			this.spreader = spreader;
		}

		public static SDL_LogMessage makeInvoker(MemoryLayout... layouts) {
			FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
			Linker.Option fva$ = Linker.Option.firstVariadicArg(BASE_DESC.argumentLayouts().size());
			var mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, fva$);
			var spreader$ = mh$.asSpreader(Object[].class, layouts.length);
			return new SDL_LogMessage(mh$, desc$, spreader$);
		}

		public static MemorySegment address() {
			return ADDR;
		}

		public MethodHandle handle() {
			return handle;
		}

		public FunctionDescriptor descriptor() {
			return descriptor;
		}

		public void apply(int category, int priority, MemorySegment fmt, Object... x3) {
			try {
				if (TRACE_DOWNCALLS) {
					traceDowncall("SDL_LogMessage", category, priority, fmt, x3);
				}
				spreader.invokeExact(category, priority, fmt, x3);
			} catch (IllegalArgumentException | ClassCastException ex$) {
				throw ex$;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	public static class SDL_RenderDebugTextFormat {
		private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT,
				SDL3.C_POINTER
		);
		private static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RenderDebugTextFormat");

		private final MethodHandle handle;
		private final FunctionDescriptor descriptor;
		private final MethodHandle spreader;

		private SDL_RenderDebugTextFormat(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
			this.handle = handle;
			this.descriptor = descriptor;
			this.spreader = spreader;
		}

		public static SDL_RenderDebugTextFormat makeInvoker(MemoryLayout... layouts) {
			FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
			Linker.Option fva$ = Linker.Option.firstVariadicArg(BASE_DESC.argumentLayouts().size());
			var mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, fva$);
			var spreader$ = mh$.asSpreader(Object[].class, layouts.length);
			return new SDL_RenderDebugTextFormat(mh$, desc$, spreader$);
		}

		public static MemorySegment address() {
			return ADDR;
		}

		public MethodHandle handle() {
			return handle;
		}

		public FunctionDescriptor descriptor() {
			return descriptor;
		}

		public boolean apply(MemorySegment renderer, float x, float y, MemorySegment fmt, Object... x4) {
			try {
				if (TRACE_DOWNCALLS) {
					traceDowncall("SDL_RenderDebugTextFormat", renderer, x, y, fmt, x4);
				}
				return (boolean) spreader.invokeExact(renderer, x, y, fmt, x4);
			} catch (IllegalArgumentException | ClassCastException ex$) {
				throw ex$;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	public static class SDL_sscanf {
		private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);
		private static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_sscanf");

		private final MethodHandle handle;
		private final FunctionDescriptor descriptor;
		private final MethodHandle spreader;

		private SDL_sscanf(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
			this.handle = handle;
			this.descriptor = descriptor;
			this.spreader = spreader;
		}

		public static SDL_sscanf makeInvoker(MemoryLayout... layouts) {
			FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
			Linker.Option fva$ = Linker.Option.firstVariadicArg(BASE_DESC.argumentLayouts().size());
			var mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, fva$);
			var spreader$ = mh$.asSpreader(Object[].class, layouts.length);
			return new SDL_sscanf(mh$, desc$, spreader$);
		}

		public static MemorySegment address() {
			return ADDR;
		}

		public MethodHandle handle() {
			return handle;
		}

		public FunctionDescriptor descriptor() {
			return descriptor;
		}

		public int apply(MemorySegment text, MemorySegment fmt, Object... x2) {
			try {
				if (TRACE_DOWNCALLS) {
					traceDowncall("SDL_sscanf", text, fmt, x2);
				}
				return (int) spreader.invokeExact(text, fmt, x2);
			} catch (IllegalArgumentException | ClassCastException ex$) {
				throw ex$;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	public static class SDL_snprintf {
		private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_LONG,
				SDL3.C_POINTER
		);
		private static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_snprintf");

		private final MethodHandle handle;
		private final FunctionDescriptor descriptor;
		private final MethodHandle spreader;

		private SDL_snprintf(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
			this.handle = handle;
			this.descriptor = descriptor;
			this.spreader = spreader;
		}

		public static SDL_snprintf makeInvoker(MemoryLayout... layouts) {
			FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
			Linker.Option fva$ = Linker.Option.firstVariadicArg(BASE_DESC.argumentLayouts().size());
			var mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, fva$);
			var spreader$ = mh$.asSpreader(Object[].class, layouts.length);
			return new SDL_snprintf(mh$, desc$, spreader$);
		}

		public static MemorySegment address() {
			return ADDR;
		}

		public MethodHandle handle() {
			return handle;
		}

		public FunctionDescriptor descriptor() {
			return descriptor;
		}

		public int apply(MemorySegment text, long maxlen, MemorySegment fmt, Object... x3) {
			try {
				if (TRACE_DOWNCALLS) {
					traceDowncall("SDL_snprintf", text, maxlen, fmt, x3);
				}
				return (int) spreader.invokeExact(text, maxlen, fmt, x3);
			} catch (IllegalArgumentException | ClassCastException ex$) {
				throw ex$;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	public static class SDL_swprintf {
		private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_LONG,
				SDL3.C_POINTER
		);
		private static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_swprintf");

		private final MethodHandle handle;
		private final FunctionDescriptor descriptor;
		private final MethodHandle spreader;

		private SDL_swprintf(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
			this.handle = handle;
			this.descriptor = descriptor;
			this.spreader = spreader;
		}

		public static SDL_swprintf makeInvoker(MemoryLayout... layouts) {
			FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
			Linker.Option fva$ = Linker.Option.firstVariadicArg(BASE_DESC.argumentLayouts().size());
			var mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, fva$);
			var spreader$ = mh$.asSpreader(Object[].class, layouts.length);
			return new SDL_swprintf(mh$, desc$, spreader$);
		}

		public static MemorySegment address() {
			return ADDR;
		}

		public MethodHandle handle() {
			return handle;
		}

		public FunctionDescriptor descriptor() {
			return descriptor;
		}

		public int apply(MemorySegment text, long maxlen, MemorySegment fmt, Object... x3) {
			try {
				if (TRACE_DOWNCALLS) {
					traceDowncall("SDL_swprintf", text, maxlen, fmt, x3);
				}
				return (int) spreader.invokeExact(text, maxlen, fmt, x3);
			} catch (IllegalArgumentException | ClassCastException ex$) {
				throw ex$;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	public static class SDL_asprintf {
		private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);
		private static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_asprintf");

		private final MethodHandle handle;
		private final FunctionDescriptor descriptor;
		private final MethodHandle spreader;

		private SDL_asprintf(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
			this.handle = handle;
			this.descriptor = descriptor;
			this.spreader = spreader;
		}

		public static SDL_asprintf makeInvoker(MemoryLayout... layouts) {
			FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
			Linker.Option fva$ = Linker.Option.firstVariadicArg(BASE_DESC.argumentLayouts().size());
			var mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, fva$);
			var spreader$ = mh$.asSpreader(Object[].class, layouts.length);
			return new SDL_asprintf(mh$, desc$, spreader$);
		}

		public static MemorySegment address() {
			return ADDR;
		}

		public MethodHandle handle() {
			return handle;
		}

		public FunctionDescriptor descriptor() {
			return descriptor;
		}

		public int apply(MemorySegment strp, MemorySegment fmt, Object... x2) {
			try {
				if (TRACE_DOWNCALLS) {
					traceDowncall("SDL_asprintf", strp, fmt, x2);
				}
				return (int) spreader.invokeExact(strp, fmt, x2);
			} catch (IllegalArgumentException | ClassCastException ex$) {
				throw ex$;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	public static class SDL_SetError {
		private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);
		private static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetError");

		private final MethodHandle handle;
		private final FunctionDescriptor descriptor;
		private final MethodHandle spreader;

		private SDL_SetError(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
			this.handle = handle;
			this.descriptor = descriptor;
			this.spreader = spreader;
		}

		public static SDL_SetError makeInvoker(MemoryLayout... layouts) {
			FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
			Linker.Option fva$ = Linker.Option.firstVariadicArg(BASE_DESC.argumentLayouts().size());
			var mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, fva$);
			var spreader$ = mh$.asSpreader(Object[].class, layouts.length);
			return new SDL_SetError(mh$, desc$, spreader$);
		}

		public static MemorySegment address() {
			return ADDR;
		}

		public MethodHandle handle() {
			return handle;
		}

		public FunctionDescriptor descriptor() {
			return descriptor;
		}

		public boolean apply(MemorySegment fmt, Object... x1) {
			try {
				if (TRACE_DOWNCALLS) {
					traceDowncall("SDL_SetError", fmt, x1);
				}
				return (boolean) spreader.invokeExact(fmt, x1);
			} catch (IllegalArgumentException | ClassCastException ex$) {
				throw ex$;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	public static class SDL_IOprintf {
		private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);
		private static final MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_IOprintf");

		private final MethodHandle handle;
		private final FunctionDescriptor descriptor;
		private final MethodHandle spreader;

		private SDL_IOprintf(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
			this.handle = handle;
			this.descriptor = descriptor;
			this.spreader = spreader;
		}

		public static SDL_IOprintf makeInvoker(MemoryLayout... layouts) {
			FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
			Linker.Option fva$ = Linker.Option.firstVariadicArg(BASE_DESC.argumentLayouts().size());
			var mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, fva$);
			var spreader$ = mh$.asSpreader(Object[].class, layouts.length);
			return new SDL_IOprintf(mh$, desc$, spreader$);
		}

		public static MemorySegment address() {
			return ADDR;
		}

		public MethodHandle handle() {
			return handle;
		}

		public FunctionDescriptor descriptor() {
			return descriptor;
		}

		public long apply(MemorySegment context, MemorySegment fmt, Object... x2) {
			try {
				if (TRACE_DOWNCALLS) {
					traceDowncall("SDL_IOprintf", context, fmt, x2);
				}
				return (long) spreader.invokeExact(context, fmt, x2);
			} catch (IllegalArgumentException | ClassCastException ex$) {
				throw ex$;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	SDL3() {

	}

	private static final int SDLK_LHYPER = (int) 536870918L;

	public static int SDLK_LHYPER() {
		return SDLK_LHYPER;
	}

	private static final int SDLK_RHYPER = (int) 536870919L;

	public static int SDLK_RHYPER() {
		return SDLK_RHYPER;
	}

	private static final int SDL_KMOD_NONE = (int) 0L;

	public static int SDL_KMOD_NONE() {
		return SDL_KMOD_NONE;
	}

	private static final int SDL_KMOD_LSHIFT = (int) 1L;

	public static int SDL_KMOD_LSHIFT() {
		return SDL_KMOD_LSHIFT;
	}

	private static final int SDL_KMOD_RSHIFT = (int) 2L;

	public static int SDL_KMOD_RSHIFT() {
		return SDL_KMOD_RSHIFT;
	}

	private static final int SDL_KMOD_LEVEL5 = (int) 4L;

	public static int SDL_KMOD_LEVEL5() {
		return SDL_KMOD_LEVEL5;
	}

	private static final int SDL_KMOD_LCTRL = (int) 64L;

	public static int SDL_KMOD_LCTRL() {
		return SDL_KMOD_LCTRL;
	}

	private static final int SDL_KMOD_RCTRL = (int) 128L;

	public static int SDL_KMOD_RCTRL() {
		return SDL_KMOD_RCTRL;
	}

	private static final int SDL_KMOD_LALT = (int) 256L;

	public static int SDL_KMOD_LALT() {
		return SDL_KMOD_LALT;
	}

	private static final int SDL_KMOD_RALT = (int) 512L;

	public static int SDL_KMOD_RALT() {
		return SDL_KMOD_RALT;
	}

	private static final int SDL_KMOD_LGUI = (int) 1024L;

	public static int SDL_KMOD_LGUI() {
		return SDL_KMOD_LGUI;
	}

	private static final int SDL_KMOD_RGUI = (int) 2048L;

	public static int SDL_KMOD_RGUI() {
		return SDL_KMOD_RGUI;
	}

	private static final int SDL_KMOD_NUM = (int) 4096L;

	public static int SDL_KMOD_NUM() {
		return SDL_KMOD_NUM;
	}

	private static final int SDL_KMOD_CAPS = (int) 8192L;

	public static int SDL_KMOD_CAPS() {
		return SDL_KMOD_CAPS;
	}

	private static final int SDL_KMOD_MODE = (int) 16384L;

	public static int SDL_KMOD_MODE() {
		return SDL_KMOD_MODE;
	}

	private static final int SDL_KMOD_SCROLL = (int) 32768L;

	public static int SDL_KMOD_SCROLL() {
		return SDL_KMOD_SCROLL;
	}

	private static final int SDL_KMOD_CTRL = (int) 192L;

	public static int SDL_KMOD_CTRL() {
		return SDL_KMOD_CTRL;
	}

	private static final int SDL_KMOD_SHIFT = (int) 3L;

	public static int SDL_KMOD_SHIFT() {
		return SDL_KMOD_SHIFT;
	}

	private static final int SDL_KMOD_ALT = (int) 768L;

	public static int SDL_KMOD_ALT() {
		return SDL_KMOD_ALT;
	}

	private static final int SDL_KMOD_GUI = (int) 3072L;

	public static int SDL_KMOD_GUI() {
		return SDL_KMOD_GUI;
	}

	public static MemorySegment SDL_PROP_TEXTINPUT_TYPE_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTINPUT_TYPE_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.textinput.type");
		}
		return Holder.SDL_PROP_TEXTINPUT_TYPE_NUMBER;
	}

	public static MemorySegment SDL_PROP_TEXTINPUT_CAPITALIZATION_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTINPUT_CAPITALIZATION_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.textinput.capitalization");
		}
		return Holder.SDL_PROP_TEXTINPUT_CAPITALIZATION_NUMBER;
	}

	public static MemorySegment SDL_PROP_TEXTINPUT_AUTOCORRECT_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTINPUT_AUTOCORRECT_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.textinput.autocorrect");
		}
		return Holder.SDL_PROP_TEXTINPUT_AUTOCORRECT_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_TEXTINPUT_MULTILINE_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTINPUT_MULTILINE_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.textinput.multiline");
		}
		return Holder.SDL_PROP_TEXTINPUT_MULTILINE_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_TEXTINPUT_ANDROID_INPUTTYPE_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTINPUT_ANDROID_INPUTTYPE_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.textinput.android.inputtype");
		}
		return Holder.SDL_PROP_TEXTINPUT_ANDROID_INPUTTYPE_NUMBER;
	}

	private static final int SDL_BUTTON_LMASK = (int) 1L;

	public static int SDL_BUTTON_LMASK() {
		return SDL_BUTTON_LMASK;
	}

	private static final int SDL_BUTTON_MMASK = (int) 2L;

	public static int SDL_BUTTON_MMASK() {
		return SDL_BUTTON_MMASK;
	}

	private static final int SDL_BUTTON_RMASK = (int) 4L;

	public static int SDL_BUTTON_RMASK() {
		return SDL_BUTTON_RMASK;
	}

	private static final int SDL_BUTTON_X1MASK = (int) 8L;

	public static int SDL_BUTTON_X1MASK() {
		return SDL_BUTTON_X1MASK;
	}

	private static final int SDL_BUTTON_X2MASK = (int) 16L;

	public static int SDL_BUTTON_X2MASK() {
		return SDL_BUTTON_X2MASK;
	}

	private static final int SDL_TOUCH_MOUSEID = (int) 4294967295L;

	public static int SDL_TOUCH_MOUSEID() {
		return SDL_TOUCH_MOUSEID;
	}

	private static final long SDL_MOUSE_TOUCHID = -1L;

	public static long SDL_MOUSE_TOUCHID() {
		return SDL_MOUSE_TOUCHID;
	}

	private static final int SDL_PEN_MOUSEID = (int) 4294967294L;

	public static int SDL_PEN_MOUSEID() {
		return SDL_PEN_MOUSEID;
	}

	private static final long SDL_PEN_TOUCHID = -2L;

	public static long SDL_PEN_TOUCHID() {
		return SDL_PEN_TOUCHID;
	}

	private static final int SDL_PEN_INPUT_DOWN = (int) 1L;

	public static int SDL_PEN_INPUT_DOWN() {
		return SDL_PEN_INPUT_DOWN;
	}

	private static final int SDL_PEN_INPUT_BUTTON_1 = (int) 2L;

	public static int SDL_PEN_INPUT_BUTTON_1() {
		return SDL_PEN_INPUT_BUTTON_1;
	}

	private static final int SDL_PEN_INPUT_BUTTON_2 = (int) 4L;

	public static int SDL_PEN_INPUT_BUTTON_2() {
		return SDL_PEN_INPUT_BUTTON_2;
	}

	private static final int SDL_PEN_INPUT_BUTTON_3 = (int) 8L;

	public static int SDL_PEN_INPUT_BUTTON_3() {
		return SDL_PEN_INPUT_BUTTON_3;
	}

	private static final int SDL_PEN_INPUT_BUTTON_4 = (int) 16L;

	public static int SDL_PEN_INPUT_BUTTON_4() {
		return SDL_PEN_INPUT_BUTTON_4;
	}

	private static final int SDL_PEN_INPUT_BUTTON_5 = (int) 32L;

	public static int SDL_PEN_INPUT_BUTTON_5() {
		return SDL_PEN_INPUT_BUTTON_5;
	}

	private static final int SDL_PEN_INPUT_ERASER_TIP = (int) 1073741824L;

	public static int SDL_PEN_INPUT_ERASER_TIP() {
		return SDL_PEN_INPUT_ERASER_TIP;
	}

	private static final int SDL_PEN_INPUT_IN_PROXIMITY = (int) 2147483648L;

	public static int SDL_PEN_INPUT_IN_PROXIMITY() {
		return SDL_PEN_INPUT_IN_PROXIMITY;
	}

	private static final int SDL_GLOB_CASEINSENSITIVE = (int) 1L;

	public static int SDL_GLOB_CASEINSENSITIVE() {
		return SDL_GLOB_CASEINSENSITIVE;
	}

	private static final int SDL_GPU_TEXTUREUSAGE_SAMPLER = (int) 1L;

	public static int SDL_GPU_TEXTUREUSAGE_SAMPLER() {
		return SDL_GPU_TEXTUREUSAGE_SAMPLER;
	}

	private static final int SDL_GPU_TEXTUREUSAGE_COLOR_TARGET = (int) 2L;

	public static int SDL_GPU_TEXTUREUSAGE_COLOR_TARGET() {
		return SDL_GPU_TEXTUREUSAGE_COLOR_TARGET;
	}

	private static final int SDL_GPU_TEXTUREUSAGE_DEPTH_STENCIL_TARGET = (int) 4L;

	public static int SDL_GPU_TEXTUREUSAGE_DEPTH_STENCIL_TARGET() {
		return SDL_GPU_TEXTUREUSAGE_DEPTH_STENCIL_TARGET;
	}

	private static final int SDL_GPU_TEXTUREUSAGE_GRAPHICS_STORAGE_READ = (int) 8L;

	public static int SDL_GPU_TEXTUREUSAGE_GRAPHICS_STORAGE_READ() {
		return SDL_GPU_TEXTUREUSAGE_GRAPHICS_STORAGE_READ;
	}

	private static final int SDL_GPU_TEXTUREUSAGE_COMPUTE_STORAGE_READ = (int) 16L;

	public static int SDL_GPU_TEXTUREUSAGE_COMPUTE_STORAGE_READ() {
		return SDL_GPU_TEXTUREUSAGE_COMPUTE_STORAGE_READ;
	}

	private static final int SDL_GPU_TEXTUREUSAGE_COMPUTE_STORAGE_WRITE = (int) 32L;

	public static int SDL_GPU_TEXTUREUSAGE_COMPUTE_STORAGE_WRITE() {
		return SDL_GPU_TEXTUREUSAGE_COMPUTE_STORAGE_WRITE;
	}

	private static final int SDL_GPU_TEXTUREUSAGE_COMPUTE_STORAGE_SIMULTANEOUS_READ_WRITE = (int) 64L;

	public static int SDL_GPU_TEXTUREUSAGE_COMPUTE_STORAGE_SIMULTANEOUS_READ_WRITE() {
		return SDL_GPU_TEXTUREUSAGE_COMPUTE_STORAGE_SIMULTANEOUS_READ_WRITE;
	}

	private static final int SDL_GPU_BUFFERUSAGE_VERTEX = (int) 1L;

	public static int SDL_GPU_BUFFERUSAGE_VERTEX() {
		return SDL_GPU_BUFFERUSAGE_VERTEX;
	}

	private static final int SDL_GPU_BUFFERUSAGE_INDEX = (int) 2L;

	public static int SDL_GPU_BUFFERUSAGE_INDEX() {
		return SDL_GPU_BUFFERUSAGE_INDEX;
	}

	private static final int SDL_GPU_BUFFERUSAGE_INDIRECT = (int) 4L;

	public static int SDL_GPU_BUFFERUSAGE_INDIRECT() {
		return SDL_GPU_BUFFERUSAGE_INDIRECT;
	}

	private static final int SDL_GPU_BUFFERUSAGE_GRAPHICS_STORAGE_READ = (int) 8L;

	public static int SDL_GPU_BUFFERUSAGE_GRAPHICS_STORAGE_READ() {
		return SDL_GPU_BUFFERUSAGE_GRAPHICS_STORAGE_READ;
	}

	private static final int SDL_GPU_BUFFERUSAGE_COMPUTE_STORAGE_READ = (int) 16L;

	public static int SDL_GPU_BUFFERUSAGE_COMPUTE_STORAGE_READ() {
		return SDL_GPU_BUFFERUSAGE_COMPUTE_STORAGE_READ;
	}

	private static final int SDL_GPU_BUFFERUSAGE_COMPUTE_STORAGE_WRITE = (int) 32L;

	public static int SDL_GPU_BUFFERUSAGE_COMPUTE_STORAGE_WRITE() {
		return SDL_GPU_BUFFERUSAGE_COMPUTE_STORAGE_WRITE;
	}

	private static final int SDL_GPU_SHADERFORMAT_PRIVATE = (int) 1L;

	public static int SDL_GPU_SHADERFORMAT_PRIVATE() {
		return SDL_GPU_SHADERFORMAT_PRIVATE;
	}

	private static final int SDL_GPU_SHADERFORMAT_SPIRV = (int) 2L;

	public static int SDL_GPU_SHADERFORMAT_SPIRV() {
		return SDL_GPU_SHADERFORMAT_SPIRV;
	}

	private static final int SDL_GPU_SHADERFORMAT_DXBC = (int) 4L;

	public static int SDL_GPU_SHADERFORMAT_DXBC() {
		return SDL_GPU_SHADERFORMAT_DXBC;
	}

	private static final int SDL_GPU_SHADERFORMAT_DXIL = (int) 8L;

	public static int SDL_GPU_SHADERFORMAT_DXIL() {
		return SDL_GPU_SHADERFORMAT_DXIL;
	}

	private static final int SDL_GPU_SHADERFORMAT_MSL = (int) 16L;

	public static int SDL_GPU_SHADERFORMAT_MSL() {
		return SDL_GPU_SHADERFORMAT_MSL;
	}

	private static final int SDL_GPU_SHADERFORMAT_METALLIB = (int) 32L;

	public static int SDL_GPU_SHADERFORMAT_METALLIB() {
		return SDL_GPU_SHADERFORMAT_METALLIB;
	}

	private static final int SDL_GPU_COLORCOMPONENT_R = (int) 1L;

	public static int SDL_GPU_COLORCOMPONENT_R() {
		return SDL_GPU_COLORCOMPONENT_R;
	}

	private static final int SDL_GPU_COLORCOMPONENT_G = (int) 2L;

	public static int SDL_GPU_COLORCOMPONENT_G() {
		return SDL_GPU_COLORCOMPONENT_G;
	}

	private static final int SDL_GPU_COLORCOMPONENT_B = (int) 4L;

	public static int SDL_GPU_COLORCOMPONENT_B() {
		return SDL_GPU_COLORCOMPONENT_B;
	}

	private static final int SDL_GPU_COLORCOMPONENT_A = (int) 8L;

	public static int SDL_GPU_COLORCOMPONENT_A() {
		return SDL_GPU_COLORCOMPONENT_A;
	}

	public static MemorySegment SDL_PROP_GPU_DEVICE_CREATE_DEBUGMODE_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_DEVICE_CREATE_DEBUGMODE_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.device.create.debugmode");
		}
		return Holder.SDL_PROP_GPU_DEVICE_CREATE_DEBUGMODE_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_GPU_DEVICE_CREATE_PREFERLOWPOWER_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_DEVICE_CREATE_PREFERLOWPOWER_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.device.create.preferlowpower");
		}
		return Holder.SDL_PROP_GPU_DEVICE_CREATE_PREFERLOWPOWER_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_GPU_DEVICE_CREATE_VERBOSE_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_DEVICE_CREATE_VERBOSE_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.device.create.verbose");
		}
		return Holder.SDL_PROP_GPU_DEVICE_CREATE_VERBOSE_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_GPU_DEVICE_CREATE_NAME_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_DEVICE_CREATE_NAME_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.device.create.name");
		}
		return Holder.SDL_PROP_GPU_DEVICE_CREATE_NAME_STRING;
	}

	public static MemorySegment SDL_PROP_GPU_DEVICE_CREATE_FEATURE_CLIP_DISTANCE_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_DEVICE_CREATE_FEATURE_CLIP_DISTANCE_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.device.create.feature.clip_distance");
		}
		return Holder.SDL_PROP_GPU_DEVICE_CREATE_FEATURE_CLIP_DISTANCE_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_GPU_DEVICE_CREATE_FEATURE_DEPTH_CLAMPING_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_DEVICE_CREATE_FEATURE_DEPTH_CLAMPING_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.device.create.feature.depth_clamping");
		}
		return Holder.SDL_PROP_GPU_DEVICE_CREATE_FEATURE_DEPTH_CLAMPING_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_GPU_DEVICE_CREATE_FEATURE_INDIRECT_DRAW_FIRST_INSTANCE_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_DEVICE_CREATE_FEATURE_INDIRECT_DRAW_FIRST_INSTANCE_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.device.create.feature.indirect_draw_first_instance");
		}
		return Holder.SDL_PROP_GPU_DEVICE_CREATE_FEATURE_INDIRECT_DRAW_FIRST_INSTANCE_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_GPU_DEVICE_CREATE_FEATURE_ANISOTROPY_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_DEVICE_CREATE_FEATURE_ANISOTROPY_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.device.create.feature.anisotropy");
		}
		return Holder.SDL_PROP_GPU_DEVICE_CREATE_FEATURE_ANISOTROPY_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_GPU_DEVICE_CREATE_SHADERS_PRIVATE_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_DEVICE_CREATE_SHADERS_PRIVATE_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.device.create.shaders.private");
		}
		return Holder.SDL_PROP_GPU_DEVICE_CREATE_SHADERS_PRIVATE_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_GPU_DEVICE_CREATE_SHADERS_SPIRV_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_DEVICE_CREATE_SHADERS_SPIRV_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.device.create.shaders.spirv");
		}
		return Holder.SDL_PROP_GPU_DEVICE_CREATE_SHADERS_SPIRV_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_GPU_DEVICE_CREATE_SHADERS_DXBC_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_DEVICE_CREATE_SHADERS_DXBC_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.device.create.shaders.dxbc");
		}
		return Holder.SDL_PROP_GPU_DEVICE_CREATE_SHADERS_DXBC_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_GPU_DEVICE_CREATE_SHADERS_DXIL_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_DEVICE_CREATE_SHADERS_DXIL_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.device.create.shaders.dxil");
		}
		return Holder.SDL_PROP_GPU_DEVICE_CREATE_SHADERS_DXIL_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_GPU_DEVICE_CREATE_SHADERS_MSL_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_DEVICE_CREATE_SHADERS_MSL_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.device.create.shaders.msl");
		}
		return Holder.SDL_PROP_GPU_DEVICE_CREATE_SHADERS_MSL_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_GPU_DEVICE_CREATE_SHADERS_METALLIB_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_DEVICE_CREATE_SHADERS_METALLIB_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.device.create.shaders.metallib");
		}
		return Holder.SDL_PROP_GPU_DEVICE_CREATE_SHADERS_METALLIB_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_GPU_DEVICE_CREATE_D3D12_ALLOW_FEWER_RESOURCE_SLOTS_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_DEVICE_CREATE_D3D12_ALLOW_FEWER_RESOURCE_SLOTS_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.device.create.d3d12.allowtier1resourcebinding");
		}
		return Holder.SDL_PROP_GPU_DEVICE_CREATE_D3D12_ALLOW_FEWER_RESOURCE_SLOTS_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_GPU_DEVICE_CREATE_D3D12_SEMANTIC_NAME_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_DEVICE_CREATE_D3D12_SEMANTIC_NAME_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.device.create.d3d12.semantic");
		}
		return Holder.SDL_PROP_GPU_DEVICE_CREATE_D3D12_SEMANTIC_NAME_STRING;
	}

	public static MemorySegment SDL_PROP_GPU_DEVICE_CREATE_D3D12_AGILITY_SDK_VERSION_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_DEVICE_CREATE_D3D12_AGILITY_SDK_VERSION_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.device.create.d3d12.agility_sdk_version");
		}
		return Holder.SDL_PROP_GPU_DEVICE_CREATE_D3D12_AGILITY_SDK_VERSION_NUMBER;
	}

	public static MemorySegment SDL_PROP_GPU_DEVICE_CREATE_D3D12_AGILITY_SDK_PATH_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_DEVICE_CREATE_D3D12_AGILITY_SDK_PATH_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.device.create.d3d12.agility_sdk_path");
		}
		return Holder.SDL_PROP_GPU_DEVICE_CREATE_D3D12_AGILITY_SDK_PATH_STRING;
	}

	public static MemorySegment SDL_PROP_GPU_DEVICE_CREATE_VULKAN_REQUIRE_HARDWARE_ACCELERATION_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_DEVICE_CREATE_VULKAN_REQUIRE_HARDWARE_ACCELERATION_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.device.create.vulkan.requirehardwareacceleration");
		}
		return Holder.SDL_PROP_GPU_DEVICE_CREATE_VULKAN_REQUIRE_HARDWARE_ACCELERATION_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_GPU_DEVICE_CREATE_VULKAN_OPTIONS_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_DEVICE_CREATE_VULKAN_OPTIONS_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.device.create.vulkan.options");
		}
		return Holder.SDL_PROP_GPU_DEVICE_CREATE_VULKAN_OPTIONS_POINTER;
	}

	public static MemorySegment SDL_PROP_GPU_DEVICE_CREATE_METAL_ALLOW_MACFAMILY1_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_DEVICE_CREATE_METAL_ALLOW_MACFAMILY1_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.device.create.metal.allowmacfamily1");
		}
		return Holder.SDL_PROP_GPU_DEVICE_CREATE_METAL_ALLOW_MACFAMILY1_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_GPU_DEVICE_NAME_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_DEVICE_NAME_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.device.name");
		}
		return Holder.SDL_PROP_GPU_DEVICE_NAME_STRING;
	}

	public static MemorySegment SDL_PROP_GPU_DEVICE_DRIVER_NAME_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_DEVICE_DRIVER_NAME_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.device.driver_name");
		}
		return Holder.SDL_PROP_GPU_DEVICE_DRIVER_NAME_STRING;
	}

	public static MemorySegment SDL_PROP_GPU_DEVICE_DRIVER_VERSION_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_DEVICE_DRIVER_VERSION_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.device.driver_version");
		}
		return Holder.SDL_PROP_GPU_DEVICE_DRIVER_VERSION_STRING;
	}

	public static MemorySegment SDL_PROP_GPU_DEVICE_DRIVER_INFO_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_DEVICE_DRIVER_INFO_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.device.driver_info");
		}
		return Holder.SDL_PROP_GPU_DEVICE_DRIVER_INFO_STRING;
	}

	public static MemorySegment SDL_PROP_GPU_COMPUTEPIPELINE_CREATE_NAME_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_COMPUTEPIPELINE_CREATE_NAME_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.computepipeline.create.name");
		}
		return Holder.SDL_PROP_GPU_COMPUTEPIPELINE_CREATE_NAME_STRING;
	}

	public static MemorySegment SDL_PROP_GPU_GRAPHICSPIPELINE_CREATE_NAME_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_GRAPHICSPIPELINE_CREATE_NAME_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.graphicspipeline.create.name");
		}
		return Holder.SDL_PROP_GPU_GRAPHICSPIPELINE_CREATE_NAME_STRING;
	}

	public static MemorySegment SDL_PROP_GPU_SAMPLER_CREATE_NAME_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_SAMPLER_CREATE_NAME_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.sampler.create.name");
		}
		return Holder.SDL_PROP_GPU_SAMPLER_CREATE_NAME_STRING;
	}

	public static MemorySegment SDL_PROP_GPU_SHADER_CREATE_NAME_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_SHADER_CREATE_NAME_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.shader.create.name");
		}
		return Holder.SDL_PROP_GPU_SHADER_CREATE_NAME_STRING;
	}

	public static MemorySegment SDL_PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_R_FLOAT() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_R_FLOAT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.texture.create.d3d12.clear.r");
		}
		return Holder.SDL_PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_R_FLOAT;
	}

	public static MemorySegment SDL_PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_G_FLOAT() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_G_FLOAT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.texture.create.d3d12.clear.g");
		}
		return Holder.SDL_PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_G_FLOAT;
	}

	public static MemorySegment SDL_PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_B_FLOAT() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_B_FLOAT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.texture.create.d3d12.clear.b");
		}
		return Holder.SDL_PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_B_FLOAT;
	}

	public static MemorySegment SDL_PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_A_FLOAT() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_A_FLOAT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.texture.create.d3d12.clear.a");
		}
		return Holder.SDL_PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_A_FLOAT;
	}

	public static MemorySegment SDL_PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_DEPTH_FLOAT() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_DEPTH_FLOAT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.texture.create.d3d12.clear.depth");
		}
		return Holder.SDL_PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_DEPTH_FLOAT;
	}

	public static MemorySegment SDL_PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_STENCIL_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_STENCIL_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.texture.create.d3d12.clear.stencil");
		}
		return Holder.SDL_PROP_GPU_TEXTURE_CREATE_D3D12_CLEAR_STENCIL_NUMBER;
	}

	public static MemorySegment SDL_PROP_GPU_TEXTURE_CREATE_NAME_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_TEXTURE_CREATE_NAME_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.texture.create.name");
		}
		return Holder.SDL_PROP_GPU_TEXTURE_CREATE_NAME_STRING;
	}

	public static MemorySegment SDL_PROP_GPU_BUFFER_CREATE_NAME_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_BUFFER_CREATE_NAME_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.buffer.create.name");
		}
		return Holder.SDL_PROP_GPU_BUFFER_CREATE_NAME_STRING;
	}

	public static MemorySegment SDL_PROP_GPU_TRANSFERBUFFER_CREATE_NAME_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_GPU_TRANSFERBUFFER_CREATE_NAME_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.gpu.transferbuffer.create.name");
		}
		return Holder.SDL_PROP_GPU_TRANSFERBUFFER_CREATE_NAME_STRING;
	}

	private static final int SDL_HAPTIC_INFINITY = (int) 4294967295L;

	public static int SDL_HAPTIC_INFINITY() {
		return SDL_HAPTIC_INFINITY;
	}

	private static final int SDL_HAPTIC_CONSTANT = (int) 1L;

	public static int SDL_HAPTIC_CONSTANT() {
		return SDL_HAPTIC_CONSTANT;
	}

	private static final int SDL_HAPTIC_SINE = (int) 2L;

	public static int SDL_HAPTIC_SINE() {
		return SDL_HAPTIC_SINE;
	}

	private static final int SDL_HAPTIC_SQUARE = (int) 4L;

	public static int SDL_HAPTIC_SQUARE() {
		return SDL_HAPTIC_SQUARE;
	}

	private static final int SDL_HAPTIC_TRIANGLE = (int) 8L;

	public static int SDL_HAPTIC_TRIANGLE() {
		return SDL_HAPTIC_TRIANGLE;
	}

	private static final int SDL_HAPTIC_SAWTOOTHUP = (int) 16L;

	public static int SDL_HAPTIC_SAWTOOTHUP() {
		return SDL_HAPTIC_SAWTOOTHUP;
	}

	private static final int SDL_HAPTIC_SAWTOOTHDOWN = (int) 32L;

	public static int SDL_HAPTIC_SAWTOOTHDOWN() {
		return SDL_HAPTIC_SAWTOOTHDOWN;
	}

	private static final int SDL_HAPTIC_RAMP = (int) 64L;

	public static int SDL_HAPTIC_RAMP() {
		return SDL_HAPTIC_RAMP;
	}

	private static final int SDL_HAPTIC_SPRING = (int) 128L;

	public static int SDL_HAPTIC_SPRING() {
		return SDL_HAPTIC_SPRING;
	}

	private static final int SDL_HAPTIC_DAMPER = (int) 256L;

	public static int SDL_HAPTIC_DAMPER() {
		return SDL_HAPTIC_DAMPER;
	}

	private static final int SDL_HAPTIC_INERTIA = (int) 512L;

	public static int SDL_HAPTIC_INERTIA() {
		return SDL_HAPTIC_INERTIA;
	}

	private static final int SDL_HAPTIC_FRICTION = (int) 1024L;

	public static int SDL_HAPTIC_FRICTION() {
		return SDL_HAPTIC_FRICTION;
	}

	private static final int SDL_HAPTIC_LEFTRIGHT = (int) 2048L;

	public static int SDL_HAPTIC_LEFTRIGHT() {
		return SDL_HAPTIC_LEFTRIGHT;
	}

	private static final int SDL_HAPTIC_RESERVED1 = (int) 4096L;

	public static int SDL_HAPTIC_RESERVED1() {
		return SDL_HAPTIC_RESERVED1;
	}

	private static final int SDL_HAPTIC_RESERVED2 = (int) 8192L;

	public static int SDL_HAPTIC_RESERVED2() {
		return SDL_HAPTIC_RESERVED2;
	}

	private static final int SDL_HAPTIC_RESERVED3 = (int) 16384L;

	public static int SDL_HAPTIC_RESERVED3() {
		return SDL_HAPTIC_RESERVED3;
	}

	private static final int SDL_HAPTIC_CUSTOM = (int) 32768L;

	public static int SDL_HAPTIC_CUSTOM() {
		return SDL_HAPTIC_CUSTOM;
	}

	private static final int SDL_HAPTIC_GAIN = (int) 65536L;

	public static int SDL_HAPTIC_GAIN() {
		return SDL_HAPTIC_GAIN;
	}

	private static final int SDL_HAPTIC_AUTOCENTER = (int) 131072L;

	public static int SDL_HAPTIC_AUTOCENTER() {
		return SDL_HAPTIC_AUTOCENTER;
	}

	private static final int SDL_HAPTIC_STATUS = (int) 262144L;

	public static int SDL_HAPTIC_STATUS() {
		return SDL_HAPTIC_STATUS;
	}

	private static final int SDL_HAPTIC_PAUSE = (int) 524288L;

	public static int SDL_HAPTIC_PAUSE() {
		return SDL_HAPTIC_PAUSE;
	}

	public static MemorySegment SDL_PROP_HIDAPI_LIBUSB_DEVICE_HANDLE_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_HIDAPI_LIBUSB_DEVICE_HANDLE_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.hidapi.libusb.device.handle");
		}
		return Holder.SDL_PROP_HIDAPI_LIBUSB_DEVICE_HANDLE_POINTER;
	}

	public static MemorySegment SDL_HINT_ALLOW_ALT_TAB_WHILE_GRABBED() {
		class Holder {
			static final MemorySegment SDL_HINT_ALLOW_ALT_TAB_WHILE_GRABBED
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_ALLOW_ALT_TAB_WHILE_GRABBED");
		}
		return Holder.SDL_HINT_ALLOW_ALT_TAB_WHILE_GRABBED;
	}

	public static MemorySegment SDL_HINT_ANDROID_ALLOW_RECREATE_ACTIVITY() {
		class Holder {
			static final MemorySegment SDL_HINT_ANDROID_ALLOW_RECREATE_ACTIVITY
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_ANDROID_ALLOW_RECREATE_ACTIVITY");
		}
		return Holder.SDL_HINT_ANDROID_ALLOW_RECREATE_ACTIVITY;
	}

	public static MemorySegment SDL_HINT_ANDROID_BLOCK_ON_PAUSE() {
		class Holder {
			static final MemorySegment SDL_HINT_ANDROID_BLOCK_ON_PAUSE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_ANDROID_BLOCK_ON_PAUSE");
		}
		return Holder.SDL_HINT_ANDROID_BLOCK_ON_PAUSE;
	}

	public static MemorySegment SDL_HINT_ANDROID_LOW_LATENCY_AUDIO() {
		class Holder {
			static final MemorySegment SDL_HINT_ANDROID_LOW_LATENCY_AUDIO
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_ANDROID_LOW_LATENCY_AUDIO");
		}
		return Holder.SDL_HINT_ANDROID_LOW_LATENCY_AUDIO;
	}

	public static MemorySegment SDL_HINT_ANDROID_AAUDIO_INPUT_PRESET() {
		class Holder {
			static final MemorySegment SDL_HINT_ANDROID_AAUDIO_INPUT_PRESET
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_ANDROID_AAUDIO_INPUT_PRESET");
		}
		return Holder.SDL_HINT_ANDROID_AAUDIO_INPUT_PRESET;
	}

	public static MemorySegment SDL_HINT_ANDROID_TRAP_BACK_BUTTON() {
		class Holder {
			static final MemorySegment SDL_HINT_ANDROID_TRAP_BACK_BUTTON
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_ANDROID_TRAP_BACK_BUTTON");
		}
		return Holder.SDL_HINT_ANDROID_TRAP_BACK_BUTTON;
	}

	public static MemorySegment SDL_HINT_APP_ID() {
		class Holder {
			static final MemorySegment SDL_HINT_APP_ID
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_APP_ID");
		}
		return Holder.SDL_HINT_APP_ID;
	}

	public static MemorySegment SDL_HINT_APP_NAME() {
		class Holder {
			static final MemorySegment SDL_HINT_APP_NAME
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_APP_NAME");
		}
		return Holder.SDL_HINT_APP_NAME;
	}

	public static MemorySegment SDL_HINT_APPLE_TV_CONTROLLER_UI_EVENTS() {
		class Holder {
			static final MemorySegment SDL_HINT_APPLE_TV_CONTROLLER_UI_EVENTS
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_APPLE_TV_CONTROLLER_UI_EVENTS");
		}
		return Holder.SDL_HINT_APPLE_TV_CONTROLLER_UI_EVENTS;
	}

	public static MemorySegment SDL_HINT_APPLE_TV_REMOTE_ALLOW_ROTATION() {
		class Holder {
			static final MemorySegment SDL_HINT_APPLE_TV_REMOTE_ALLOW_ROTATION
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_APPLE_TV_REMOTE_ALLOW_ROTATION");
		}
		return Holder.SDL_HINT_APPLE_TV_REMOTE_ALLOW_ROTATION;
	}

	public static MemorySegment SDL_HINT_AUDIO_ALSA_DEFAULT_DEVICE() {
		class Holder {
			static final MemorySegment SDL_HINT_AUDIO_ALSA_DEFAULT_DEVICE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_AUDIO_ALSA_DEFAULT_DEVICE");
		}
		return Holder.SDL_HINT_AUDIO_ALSA_DEFAULT_DEVICE;
	}

	public static MemorySegment SDL_HINT_AUDIO_ALSA_DEFAULT_PLAYBACK_DEVICE() {
		class Holder {
			static final MemorySegment SDL_HINT_AUDIO_ALSA_DEFAULT_PLAYBACK_DEVICE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_AUDIO_ALSA_DEFAULT_PLAYBACK_DEVICE");
		}
		return Holder.SDL_HINT_AUDIO_ALSA_DEFAULT_PLAYBACK_DEVICE;
	}

	public static MemorySegment SDL_HINT_AUDIO_ALSA_DEFAULT_RECORDING_DEVICE() {
		class Holder {
			static final MemorySegment SDL_HINT_AUDIO_ALSA_DEFAULT_RECORDING_DEVICE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_AUDIO_ALSA_DEFAULT_RECORDING_DEVICE");
		}
		return Holder.SDL_HINT_AUDIO_ALSA_DEFAULT_RECORDING_DEVICE;
	}

	public static MemorySegment SDL_HINT_AUDIO_CATEGORY() {
		class Holder {
			static final MemorySegment SDL_HINT_AUDIO_CATEGORY
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_AUDIO_CATEGORY");
		}
		return Holder.SDL_HINT_AUDIO_CATEGORY;
	}

	public static MemorySegment SDL_HINT_AUDIO_CHANNELS() {
		class Holder {
			static final MemorySegment SDL_HINT_AUDIO_CHANNELS
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_AUDIO_CHANNELS");
		}
		return Holder.SDL_HINT_AUDIO_CHANNELS;
	}

	public static MemorySegment SDL_HINT_AUDIO_DEVICE_APP_ICON_NAME() {
		class Holder {
			static final MemorySegment SDL_HINT_AUDIO_DEVICE_APP_ICON_NAME
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_AUDIO_DEVICE_APP_ICON_NAME");
		}
		return Holder.SDL_HINT_AUDIO_DEVICE_APP_ICON_NAME;
	}

	public static MemorySegment SDL_HINT_AUDIO_DEVICE_SAMPLE_FRAMES() {
		class Holder {
			static final MemorySegment SDL_HINT_AUDIO_DEVICE_SAMPLE_FRAMES
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_AUDIO_DEVICE_SAMPLE_FRAMES");
		}
		return Holder.SDL_HINT_AUDIO_DEVICE_SAMPLE_FRAMES;
	}

	public static MemorySegment SDL_HINT_AUDIO_DEVICE_STREAM_NAME() {
		class Holder {
			static final MemorySegment SDL_HINT_AUDIO_DEVICE_STREAM_NAME
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_AUDIO_DEVICE_STREAM_NAME");
		}
		return Holder.SDL_HINT_AUDIO_DEVICE_STREAM_NAME;
	}

	public static MemorySegment SDL_HINT_AUDIO_DEVICE_STREAM_ROLE() {
		class Holder {
			static final MemorySegment SDL_HINT_AUDIO_DEVICE_STREAM_ROLE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_AUDIO_DEVICE_STREAM_ROLE");
		}
		return Holder.SDL_HINT_AUDIO_DEVICE_STREAM_ROLE;
	}

	public static MemorySegment SDL_HINT_AUDIO_DEVICE_RAW_STREAM() {
		class Holder {
			static final MemorySegment SDL_HINT_AUDIO_DEVICE_RAW_STREAM
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_AUDIO_DEVICE_RAW_STREAM");
		}
		return Holder.SDL_HINT_AUDIO_DEVICE_RAW_STREAM;
	}

	public static MemorySegment SDL_HINT_AUDIO_DISK_INPUT_FILE() {
		class Holder {
			static final MemorySegment SDL_HINT_AUDIO_DISK_INPUT_FILE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_AUDIO_DISK_INPUT_FILE");
		}
		return Holder.SDL_HINT_AUDIO_DISK_INPUT_FILE;
	}

	public static MemorySegment SDL_HINT_AUDIO_DISK_OUTPUT_FILE() {
		class Holder {
			static final MemorySegment SDL_HINT_AUDIO_DISK_OUTPUT_FILE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_AUDIO_DISK_OUTPUT_FILE");
		}
		return Holder.SDL_HINT_AUDIO_DISK_OUTPUT_FILE;
	}

	public static MemorySegment SDL_HINT_AUDIO_DISK_TIMESCALE() {
		class Holder {
			static final MemorySegment SDL_HINT_AUDIO_DISK_TIMESCALE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_AUDIO_DISK_TIMESCALE");
		}
		return Holder.SDL_HINT_AUDIO_DISK_TIMESCALE;
	}

	public static MemorySegment SDL_HINT_AUDIO_DRIVER() {
		class Holder {
			static final MemorySegment SDL_HINT_AUDIO_DRIVER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_AUDIO_DRIVER");
		}
		return Holder.SDL_HINT_AUDIO_DRIVER;
	}

	public static MemorySegment SDL_HINT_AUDIO_DUMMY_TIMESCALE() {
		class Holder {
			static final MemorySegment SDL_HINT_AUDIO_DUMMY_TIMESCALE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_AUDIO_DUMMY_TIMESCALE");
		}
		return Holder.SDL_HINT_AUDIO_DUMMY_TIMESCALE;
	}

	public static MemorySegment SDL_HINT_AUDIO_FORMAT() {
		class Holder {
			static final MemorySegment SDL_HINT_AUDIO_FORMAT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_AUDIO_FORMAT");
		}
		return Holder.SDL_HINT_AUDIO_FORMAT;
	}

	public static MemorySegment SDL_HINT_AUDIO_FREQUENCY() {
		class Holder {
			static final MemorySegment SDL_HINT_AUDIO_FREQUENCY
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_AUDIO_FREQUENCY");
		}
		return Holder.SDL_HINT_AUDIO_FREQUENCY;
	}

	public static MemorySegment SDL_HINT_AUDIO_INCLUDE_MONITORS() {
		class Holder {
			static final MemorySegment SDL_HINT_AUDIO_INCLUDE_MONITORS
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_AUDIO_INCLUDE_MONITORS");
		}
		return Holder.SDL_HINT_AUDIO_INCLUDE_MONITORS;
	}

	public static MemorySegment SDL_HINT_AUTO_UPDATE_JOYSTICKS() {
		class Holder {
			static final MemorySegment SDL_HINT_AUTO_UPDATE_JOYSTICKS
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_AUTO_UPDATE_JOYSTICKS");
		}
		return Holder.SDL_HINT_AUTO_UPDATE_JOYSTICKS;
	}

	public static MemorySegment SDL_HINT_AUTO_UPDATE_SENSORS() {
		class Holder {
			static final MemorySegment SDL_HINT_AUTO_UPDATE_SENSORS
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_AUTO_UPDATE_SENSORS");
		}
		return Holder.SDL_HINT_AUTO_UPDATE_SENSORS;
	}

	public static MemorySegment SDL_HINT_BMP_SAVE_LEGACY_FORMAT() {
		class Holder {
			static final MemorySegment SDL_HINT_BMP_SAVE_LEGACY_FORMAT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_BMP_SAVE_LEGACY_FORMAT");
		}
		return Holder.SDL_HINT_BMP_SAVE_LEGACY_FORMAT;
	}

	public static MemorySegment SDL_HINT_CAMERA_DRIVER() {
		class Holder {
			static final MemorySegment SDL_HINT_CAMERA_DRIVER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_CAMERA_DRIVER");
		}
		return Holder.SDL_HINT_CAMERA_DRIVER;
	}

	public static MemorySegment SDL_HINT_CPU_FEATURE_MASK() {
		class Holder {
			static final MemorySegment SDL_HINT_CPU_FEATURE_MASK
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_CPU_FEATURE_MASK");
		}
		return Holder.SDL_HINT_CPU_FEATURE_MASK;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_DIRECTINPUT() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_DIRECTINPUT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_DIRECTINPUT");
		}
		return Holder.SDL_HINT_JOYSTICK_DIRECTINPUT;
	}

	public static MemorySegment SDL_HINT_FILE_DIALOG_DRIVER() {
		class Holder {
			static final MemorySegment SDL_HINT_FILE_DIALOG_DRIVER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_FILE_DIALOG_DRIVER");
		}
		return Holder.SDL_HINT_FILE_DIALOG_DRIVER;
	}

	public static MemorySegment SDL_HINT_DISPLAY_USABLE_BOUNDS() {
		class Holder {
			static final MemorySegment SDL_HINT_DISPLAY_USABLE_BOUNDS
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_DISPLAY_USABLE_BOUNDS");
		}
		return Holder.SDL_HINT_DISPLAY_USABLE_BOUNDS;
	}

	public static MemorySegment SDL_HINT_INVALID_PARAM_CHECKS() {
		class Holder {
			static final MemorySegment SDL_HINT_INVALID_PARAM_CHECKS
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_INVALID_PARAM_CHECKS");
		}
		return Holder.SDL_HINT_INVALID_PARAM_CHECKS;
	}

	public static MemorySegment SDL_HINT_EMSCRIPTEN_ASYNCIFY() {
		class Holder {
			static final MemorySegment SDL_HINT_EMSCRIPTEN_ASYNCIFY
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_EMSCRIPTEN_ASYNCIFY");
		}
		return Holder.SDL_HINT_EMSCRIPTEN_ASYNCIFY;
	}

	public static MemorySegment SDL_HINT_EMSCRIPTEN_CANVAS_SELECTOR() {
		class Holder {
			static final MemorySegment SDL_HINT_EMSCRIPTEN_CANVAS_SELECTOR
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_EMSCRIPTEN_CANVAS_SELECTOR");
		}
		return Holder.SDL_HINT_EMSCRIPTEN_CANVAS_SELECTOR;
	}

	public static MemorySegment SDL_HINT_EMSCRIPTEN_KEYBOARD_ELEMENT() {
		class Holder {
			static final MemorySegment SDL_HINT_EMSCRIPTEN_KEYBOARD_ELEMENT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_EMSCRIPTEN_KEYBOARD_ELEMENT");
		}
		return Holder.SDL_HINT_EMSCRIPTEN_KEYBOARD_ELEMENT;
	}

	public static MemorySegment SDL_HINT_ENABLE_SCREEN_KEYBOARD() {
		class Holder {
			static final MemorySegment SDL_HINT_ENABLE_SCREEN_KEYBOARD
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_ENABLE_SCREEN_KEYBOARD");
		}
		return Holder.SDL_HINT_ENABLE_SCREEN_KEYBOARD;
	}

	public static MemorySegment SDL_HINT_ENABLE_STEAM_SCREEN_KEYBOARD() {
		class Holder {
			static final MemorySegment SDL_HINT_ENABLE_STEAM_SCREEN_KEYBOARD
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_ENABLE_STEAM_SCREEN_KEYBOARD");
		}
		return Holder.SDL_HINT_ENABLE_STEAM_SCREEN_KEYBOARD;
	}

	public static MemorySegment SDL_HINT_EVDEV_DEVICES() {
		class Holder {
			static final MemorySegment SDL_HINT_EVDEV_DEVICES
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_EVDEV_DEVICES");
		}
		return Holder.SDL_HINT_EVDEV_DEVICES;
	}

	public static MemorySegment SDL_HINT_EVENT_LOGGING() {
		class Holder {
			static final MemorySegment SDL_HINT_EVENT_LOGGING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_EVENT_LOGGING");
		}
		return Holder.SDL_HINT_EVENT_LOGGING;
	}

	public static MemorySegment SDL_HINT_FORCE_RAISEWINDOW() {
		class Holder {
			static final MemorySegment SDL_HINT_FORCE_RAISEWINDOW
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_FORCE_RAISEWINDOW");
		}
		return Holder.SDL_HINT_FORCE_RAISEWINDOW;
	}

	public static MemorySegment SDL_HINT_FRAMEBUFFER_ACCELERATION() {
		class Holder {
			static final MemorySegment SDL_HINT_FRAMEBUFFER_ACCELERATION
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_FRAMEBUFFER_ACCELERATION");
		}
		return Holder.SDL_HINT_FRAMEBUFFER_ACCELERATION;
	}

	public static MemorySegment SDL_HINT_GAMECONTROLLERCONFIG() {
		class Holder {
			static final MemorySegment SDL_HINT_GAMECONTROLLERCONFIG
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_GAMECONTROLLERCONFIG");
		}
		return Holder.SDL_HINT_GAMECONTROLLERCONFIG;
	}

	public static MemorySegment SDL_HINT_GAMECONTROLLERCONFIG_FILE() {
		class Holder {
			static final MemorySegment SDL_HINT_GAMECONTROLLERCONFIG_FILE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_GAMECONTROLLERCONFIG_FILE");
		}
		return Holder.SDL_HINT_GAMECONTROLLERCONFIG_FILE;
	}

	public static MemorySegment SDL_HINT_GAMECONTROLLERTYPE() {
		class Holder {
			static final MemorySegment SDL_HINT_GAMECONTROLLERTYPE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_GAMECONTROLLERTYPE");
		}
		return Holder.SDL_HINT_GAMECONTROLLERTYPE;
	}

	public static MemorySegment SDL_HINT_GAMECONTROLLER_IGNORE_DEVICES() {
		class Holder {
			static final MemorySegment SDL_HINT_GAMECONTROLLER_IGNORE_DEVICES
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_GAMECONTROLLER_IGNORE_DEVICES");
		}
		return Holder.SDL_HINT_GAMECONTROLLER_IGNORE_DEVICES;
	}

	public static MemorySegment SDL_HINT_GAMECONTROLLER_IGNORE_DEVICES_EXCEPT() {
		class Holder {
			static final MemorySegment SDL_HINT_GAMECONTROLLER_IGNORE_DEVICES_EXCEPT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_GAMECONTROLLER_IGNORE_DEVICES_EXCEPT");
		}
		return Holder.SDL_HINT_GAMECONTROLLER_IGNORE_DEVICES_EXCEPT;
	}

	public static MemorySegment SDL_HINT_GAMECONTROLLER_SENSOR_FUSION() {
		class Holder {
			static final MemorySegment SDL_HINT_GAMECONTROLLER_SENSOR_FUSION
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_GAMECONTROLLER_SENSOR_FUSION");
		}
		return Holder.SDL_HINT_GAMECONTROLLER_SENSOR_FUSION;
	}

	public static MemorySegment SDL_HINT_GDK_TEXTINPUT_DEFAULT_TEXT() {
		class Holder {
			static final MemorySegment SDL_HINT_GDK_TEXTINPUT_DEFAULT_TEXT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_GDK_TEXTINPUT_DEFAULT_TEXT");
		}
		return Holder.SDL_HINT_GDK_TEXTINPUT_DEFAULT_TEXT;
	}

	public static MemorySegment SDL_HINT_GDK_TEXTINPUT_DESCRIPTION() {
		class Holder {
			static final MemorySegment SDL_HINT_GDK_TEXTINPUT_DESCRIPTION
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_GDK_TEXTINPUT_DESCRIPTION");
		}
		return Holder.SDL_HINT_GDK_TEXTINPUT_DESCRIPTION;
	}

	public static MemorySegment SDL_HINT_GDK_TEXTINPUT_MAX_LENGTH() {
		class Holder {
			static final MemorySegment SDL_HINT_GDK_TEXTINPUT_MAX_LENGTH
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_GDK_TEXTINPUT_MAX_LENGTH");
		}
		return Holder.SDL_HINT_GDK_TEXTINPUT_MAX_LENGTH;
	}

	public static MemorySegment SDL_HINT_GDK_TEXTINPUT_SCOPE() {
		class Holder {
			static final MemorySegment SDL_HINT_GDK_TEXTINPUT_SCOPE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_GDK_TEXTINPUT_SCOPE");
		}
		return Holder.SDL_HINT_GDK_TEXTINPUT_SCOPE;
	}

	public static MemorySegment SDL_HINT_GDK_TEXTINPUT_TITLE() {
		class Holder {
			static final MemorySegment SDL_HINT_GDK_TEXTINPUT_TITLE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_GDK_TEXTINPUT_TITLE");
		}
		return Holder.SDL_HINT_GDK_TEXTINPUT_TITLE;
	}

	public static MemorySegment SDL_HINT_HIDAPI_LIBUSB() {
		class Holder {
			static final MemorySegment SDL_HINT_HIDAPI_LIBUSB
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_HIDAPI_LIBUSB");
		}
		return Holder.SDL_HINT_HIDAPI_LIBUSB;
	}

	public static MemorySegment SDL_HINT_HIDAPI_LIBUSB_GAMECUBE() {
		class Holder {
			static final MemorySegment SDL_HINT_HIDAPI_LIBUSB_GAMECUBE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_HIDAPI_LIBUSB_GAMECUBE");
		}
		return Holder.SDL_HINT_HIDAPI_LIBUSB_GAMECUBE;
	}

	public static MemorySegment SDL_HINT_HIDAPI_LIBUSB_WHITELIST() {
		class Holder {
			static final MemorySegment SDL_HINT_HIDAPI_LIBUSB_WHITELIST
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_HIDAPI_LIBUSB_WHITELIST");
		}
		return Holder.SDL_HINT_HIDAPI_LIBUSB_WHITELIST;
	}

	public static MemorySegment SDL_HINT_HIDAPI_UDEV() {
		class Holder {
			static final MemorySegment SDL_HINT_HIDAPI_UDEV
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_HIDAPI_UDEV");
		}
		return Holder.SDL_HINT_HIDAPI_UDEV;
	}

	public static MemorySegment SDL_HINT_GPU_DRIVER() {
		class Holder {
			static final MemorySegment SDL_HINT_GPU_DRIVER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_GPU_DRIVER");
		}
		return Holder.SDL_HINT_GPU_DRIVER;
	}

	public static MemorySegment SDL_HINT_HIDAPI_ENUMERATE_ONLY_CONTROLLERS() {
		class Holder {
			static final MemorySegment SDL_HINT_HIDAPI_ENUMERATE_ONLY_CONTROLLERS
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_HIDAPI_ENUMERATE_ONLY_CONTROLLERS");
		}
		return Holder.SDL_HINT_HIDAPI_ENUMERATE_ONLY_CONTROLLERS;
	}

	public static MemorySegment SDL_HINT_HIDAPI_IGNORE_DEVICES() {
		class Holder {
			static final MemorySegment SDL_HINT_HIDAPI_IGNORE_DEVICES
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_HIDAPI_IGNORE_DEVICES");
		}
		return Holder.SDL_HINT_HIDAPI_IGNORE_DEVICES;
	}

	public static MemorySegment SDL_HINT_IME_IMPLEMENTED_UI() {
		class Holder {
			static final MemorySegment SDL_HINT_IME_IMPLEMENTED_UI
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_IME_IMPLEMENTED_UI");
		}
		return Holder.SDL_HINT_IME_IMPLEMENTED_UI;
	}

	public static MemorySegment SDL_HINT_IOS_HIDE_HOME_INDICATOR() {
		class Holder {
			static final MemorySegment SDL_HINT_IOS_HIDE_HOME_INDICATOR
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_IOS_HIDE_HOME_INDICATOR");
		}
		return Holder.SDL_HINT_IOS_HIDE_HOME_INDICATOR;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_ALLOW_BACKGROUND_EVENTS() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_ALLOW_BACKGROUND_EVENTS
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_ALLOW_BACKGROUND_EVENTS");
		}
		return Holder.SDL_HINT_JOYSTICK_ALLOW_BACKGROUND_EVENTS;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_ARCADESTICK_DEVICES() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_ARCADESTICK_DEVICES
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_ARCADESTICK_DEVICES");
		}
		return Holder.SDL_HINT_JOYSTICK_ARCADESTICK_DEVICES;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_ARCADESTICK_DEVICES_EXCLUDED() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_ARCADESTICK_DEVICES_EXCLUDED
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_ARCADESTICK_DEVICES_EXCLUDED");
		}
		return Holder.SDL_HINT_JOYSTICK_ARCADESTICK_DEVICES_EXCLUDED;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_BLACKLIST_DEVICES() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_BLACKLIST_DEVICES
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_BLACKLIST_DEVICES");
		}
		return Holder.SDL_HINT_JOYSTICK_BLACKLIST_DEVICES;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_BLACKLIST_DEVICES_EXCLUDED() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_BLACKLIST_DEVICES_EXCLUDED
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_BLACKLIST_DEVICES_EXCLUDED");
		}
		return Holder.SDL_HINT_JOYSTICK_BLACKLIST_DEVICES_EXCLUDED;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_DEVICE() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_DEVICE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_DEVICE");
		}
		return Holder.SDL_HINT_JOYSTICK_DEVICE;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_ENHANCED_REPORTS() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_ENHANCED_REPORTS
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_ENHANCED_REPORTS");
		}
		return Holder.SDL_HINT_JOYSTICK_ENHANCED_REPORTS;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_FLIGHTSTICK_DEVICES() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_FLIGHTSTICK_DEVICES
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_FLIGHTSTICK_DEVICES");
		}
		return Holder.SDL_HINT_JOYSTICK_FLIGHTSTICK_DEVICES;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_FLIGHTSTICK_DEVICES_EXCLUDED() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_FLIGHTSTICK_DEVICES_EXCLUDED
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_FLIGHTSTICK_DEVICES_EXCLUDED");
		}
		return Holder.SDL_HINT_JOYSTICK_FLIGHTSTICK_DEVICES_EXCLUDED;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_GAMEINPUT() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_GAMEINPUT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_GAMEINPUT");
		}
		return Holder.SDL_HINT_JOYSTICK_GAMEINPUT;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_GAMEINPUT_RAW() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_GAMEINPUT_RAW
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_GAMEINPUT_RAW");
		}
		return Holder.SDL_HINT_JOYSTICK_GAMEINPUT_RAW;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_GAMECUBE_DEVICES() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_GAMECUBE_DEVICES
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_GAMECUBE_DEVICES");
		}
		return Holder.SDL_HINT_JOYSTICK_GAMECUBE_DEVICES;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_GAMECUBE_DEVICES_EXCLUDED() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_GAMECUBE_DEVICES_EXCLUDED
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_GAMECUBE_DEVICES_EXCLUDED");
		}
		return Holder.SDL_HINT_JOYSTICK_GAMECUBE_DEVICES_EXCLUDED;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_COMBINE_JOY_CONS() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_COMBINE_JOY_CONS
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_COMBINE_JOY_CONS");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_COMBINE_JOY_CONS;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_GAMECUBE() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_GAMECUBE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_GAMECUBE");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_GAMECUBE;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_GAMECUBE_RUMBLE_BRAKE() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_GAMECUBE_RUMBLE_BRAKE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_GAMECUBE_RUMBLE_BRAKE");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_GAMECUBE_RUMBLE_BRAKE;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_JOY_CONS() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_JOY_CONS
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_JOY_CONS");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_JOY_CONS;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_JOYCON_HOME_LED() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_JOYCON_HOME_LED
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_JOYCON_HOME_LED");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_JOYCON_HOME_LED;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_LUNA() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_LUNA
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_LUNA");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_LUNA;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_NINTENDO_CLASSIC() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_NINTENDO_CLASSIC
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_NINTENDO_CLASSIC");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_NINTENDO_CLASSIC;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_PS3() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_PS3
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_PS3");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_PS3;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_PS3_SIXAXIS_DRIVER() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_PS3_SIXAXIS_DRIVER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_PS3_SIXAXIS_DRIVER");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_PS3_SIXAXIS_DRIVER;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_PS4() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_PS4
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_PS4");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_PS4;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_PS4_REPORT_INTERVAL() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_PS4_REPORT_INTERVAL
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_PS4_REPORT_INTERVAL");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_PS4_REPORT_INTERVAL;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_PS5() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_PS5
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_PS5");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_PS5;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_PS5_PLAYER_LED() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_PS5_PLAYER_LED
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_PS5_PLAYER_LED");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_PS5_PLAYER_LED;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_SHIELD() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_SHIELD
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_SHIELD");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_SHIELD;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_STADIA() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_STADIA
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_STADIA");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_STADIA;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_STEAM() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_STEAM
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_STEAM");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_STEAM;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_STEAM_HOME_LED() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_STEAM_HOME_LED
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_STEAM_HOME_LED");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_STEAM_HOME_LED;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_STEAMDECK() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_STEAMDECK
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_STEAMDECK");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_STEAMDECK;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_STEAM_HORI() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_STEAM_HORI
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_STEAM_HORI");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_STEAM_HORI;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_LG4FF() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_LG4FF
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_LG4FF");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_LG4FF;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_8BITDO() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_8BITDO
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_8BITDO");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_8BITDO;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_SINPUT() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_SINPUT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_SINPUT");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_SINPUT;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_ZUIKI() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_ZUIKI
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_ZUIKI");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_ZUIKI;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_FLYDIGI() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_FLYDIGI
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_FLYDIGI");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_FLYDIGI;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_SWITCH() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_SWITCH
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_SWITCH");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_SWITCH;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_SWITCH_HOME_LED() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_SWITCH_HOME_LED
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_SWITCH_HOME_LED");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_SWITCH_HOME_LED;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_SWITCH_PLAYER_LED() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_SWITCH_PLAYER_LED
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_SWITCH_PLAYER_LED");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_SWITCH_PLAYER_LED;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_SWITCH2() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_SWITCH2
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_SWITCH2");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_SWITCH2;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_VERTICAL_JOY_CONS() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_VERTICAL_JOY_CONS
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_VERTICAL_JOY_CONS");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_VERTICAL_JOY_CONS;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_WII() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_WII
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_WII");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_WII;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_WII_PLAYER_LED() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_WII_PLAYER_LED
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_WII_PLAYER_LED");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_WII_PLAYER_LED;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_XBOX() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_XBOX
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_XBOX");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_XBOX;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_XBOX_360() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_XBOX_360
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_XBOX_360");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_XBOX_360;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_XBOX_360_PLAYER_LED() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_XBOX_360_PLAYER_LED
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_XBOX_360_PLAYER_LED");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_XBOX_360_PLAYER_LED;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_XBOX_360_WIRELESS() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_XBOX_360_WIRELESS
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_XBOX_360_WIRELESS");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_XBOX_360_WIRELESS;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_XBOX_ONE() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_XBOX_ONE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_XBOX_ONE");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_XBOX_ONE;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_XBOX_ONE_HOME_LED() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_XBOX_ONE_HOME_LED
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_XBOX_ONE_HOME_LED");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_XBOX_ONE_HOME_LED;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_GIP() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_GIP
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_GIP");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_GIP;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HIDAPI_GIP_RESET_FOR_METADATA() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HIDAPI_GIP_RESET_FOR_METADATA
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HIDAPI_GIP_RESET_FOR_METADATA");
		}
		return Holder.SDL_HINT_JOYSTICK_HIDAPI_GIP_RESET_FOR_METADATA;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_IOKIT() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_IOKIT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_IOKIT");
		}
		return Holder.SDL_HINT_JOYSTICK_IOKIT;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_LINUX_CLASSIC() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_LINUX_CLASSIC
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_LINUX_CLASSIC");
		}
		return Holder.SDL_HINT_JOYSTICK_LINUX_CLASSIC;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_LINUX_DEADZONES() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_LINUX_DEADZONES
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_LINUX_DEADZONES");
		}
		return Holder.SDL_HINT_JOYSTICK_LINUX_DEADZONES;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_LINUX_DIGITAL_HATS() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_LINUX_DIGITAL_HATS
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_LINUX_DIGITAL_HATS");
		}
		return Holder.SDL_HINT_JOYSTICK_LINUX_DIGITAL_HATS;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_LINUX_HAT_DEADZONES() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_LINUX_HAT_DEADZONES
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_LINUX_HAT_DEADZONES");
		}
		return Holder.SDL_HINT_JOYSTICK_LINUX_HAT_DEADZONES;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_MFI() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_MFI
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_MFI");
		}
		return Holder.SDL_HINT_JOYSTICK_MFI;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_RAWINPUT() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_RAWINPUT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_RAWINPUT");
		}
		return Holder.SDL_HINT_JOYSTICK_RAWINPUT;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_RAWINPUT_CORRELATE_XINPUT() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_RAWINPUT_CORRELATE_XINPUT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_RAWINPUT_CORRELATE_XINPUT");
		}
		return Holder.SDL_HINT_JOYSTICK_RAWINPUT_CORRELATE_XINPUT;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_ROG_CHAKRAM() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_ROG_CHAKRAM
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_ROG_CHAKRAM");
		}
		return Holder.SDL_HINT_JOYSTICK_ROG_CHAKRAM;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_THREAD() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_THREAD
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_THREAD");
		}
		return Holder.SDL_HINT_JOYSTICK_THREAD;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_THROTTLE_DEVICES() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_THROTTLE_DEVICES
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_THROTTLE_DEVICES");
		}
		return Holder.SDL_HINT_JOYSTICK_THROTTLE_DEVICES;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_THROTTLE_DEVICES_EXCLUDED() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_THROTTLE_DEVICES_EXCLUDED
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_THROTTLE_DEVICES_EXCLUDED");
		}
		return Holder.SDL_HINT_JOYSTICK_THROTTLE_DEVICES_EXCLUDED;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_WGI() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_WGI
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_WGI");
		}
		return Holder.SDL_HINT_JOYSTICK_WGI;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_WHEEL_DEVICES() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_WHEEL_DEVICES
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_WHEEL_DEVICES");
		}
		return Holder.SDL_HINT_JOYSTICK_WHEEL_DEVICES;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_WHEEL_DEVICES_EXCLUDED() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_WHEEL_DEVICES_EXCLUDED
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_WHEEL_DEVICES_EXCLUDED");
		}
		return Holder.SDL_HINT_JOYSTICK_WHEEL_DEVICES_EXCLUDED;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_ZERO_CENTERED_DEVICES() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_ZERO_CENTERED_DEVICES
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_ZERO_CENTERED_DEVICES");
		}
		return Holder.SDL_HINT_JOYSTICK_ZERO_CENTERED_DEVICES;
	}

	public static MemorySegment SDL_HINT_JOYSTICK_HAPTIC_AXES() {
		class Holder {
			static final MemorySegment SDL_HINT_JOYSTICK_HAPTIC_AXES
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_JOYSTICK_HAPTIC_AXES");
		}
		return Holder.SDL_HINT_JOYSTICK_HAPTIC_AXES;
	}

	public static MemorySegment SDL_HINT_KEYCODE_OPTIONS() {
		class Holder {
			static final MemorySegment SDL_HINT_KEYCODE_OPTIONS
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_KEYCODE_OPTIONS");
		}
		return Holder.SDL_HINT_KEYCODE_OPTIONS;
	}

	public static MemorySegment SDL_HINT_KMSDRM_DEVICE_INDEX() {
		class Holder {
			static final MemorySegment SDL_HINT_KMSDRM_DEVICE_INDEX
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_KMSDRM_DEVICE_INDEX");
		}
		return Holder.SDL_HINT_KMSDRM_DEVICE_INDEX;
	}

	public static MemorySegment SDL_HINT_KMSDRM_REQUIRE_DRM_MASTER() {
		class Holder {
			static final MemorySegment SDL_HINT_KMSDRM_REQUIRE_DRM_MASTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_KMSDRM_REQUIRE_DRM_MASTER");
		}
		return Holder.SDL_HINT_KMSDRM_REQUIRE_DRM_MASTER;
	}

	public static MemorySegment SDL_HINT_KMSDRM_ATOMIC() {
		class Holder {
			static final MemorySegment SDL_HINT_KMSDRM_ATOMIC
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_KMSDRM_ATOMIC");
		}
		return Holder.SDL_HINT_KMSDRM_ATOMIC;
	}

	public static MemorySegment SDL_HINT_LOGGING() {
		class Holder {
			static final MemorySegment SDL_HINT_LOGGING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_LOGGING");
		}
		return Holder.SDL_HINT_LOGGING;
	}

	public static MemorySegment SDL_HINT_MAC_BACKGROUND_APP() {
		class Holder {
			static final MemorySegment SDL_HINT_MAC_BACKGROUND_APP
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_MAC_BACKGROUND_APP");
		}
		return Holder.SDL_HINT_MAC_BACKGROUND_APP;
	}

	public static MemorySegment SDL_HINT_MAC_CTRL_CLICK_EMULATE_RIGHT_CLICK() {
		class Holder {
			static final MemorySegment SDL_HINT_MAC_CTRL_CLICK_EMULATE_RIGHT_CLICK
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_MAC_CTRL_CLICK_EMULATE_RIGHT_CLICK");
		}
		return Holder.SDL_HINT_MAC_CTRL_CLICK_EMULATE_RIGHT_CLICK;
	}

	public static MemorySegment SDL_HINT_MAC_OPENGL_ASYNC_DISPATCH() {
		class Holder {
			static final MemorySegment SDL_HINT_MAC_OPENGL_ASYNC_DISPATCH
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_MAC_OPENGL_ASYNC_DISPATCH");
		}
		return Holder.SDL_HINT_MAC_OPENGL_ASYNC_DISPATCH;
	}

	public static MemorySegment SDL_HINT_MAC_OPTION_AS_ALT() {
		class Holder {
			static final MemorySegment SDL_HINT_MAC_OPTION_AS_ALT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_MAC_OPTION_AS_ALT");
		}
		return Holder.SDL_HINT_MAC_OPTION_AS_ALT;
	}

	public static MemorySegment SDL_HINT_MAC_SCROLL_MOMENTUM() {
		class Holder {
			static final MemorySegment SDL_HINT_MAC_SCROLL_MOMENTUM
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_MAC_SCROLL_MOMENTUM");
		}
		return Holder.SDL_HINT_MAC_SCROLL_MOMENTUM;
	}

	public static MemorySegment SDL_HINT_MAC_PRESS_AND_HOLD() {
		class Holder {
			static final MemorySegment SDL_HINT_MAC_PRESS_AND_HOLD
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_MAC_PRESS_AND_HOLD");
		}
		return Holder.SDL_HINT_MAC_PRESS_AND_HOLD;
	}

	public static MemorySegment SDL_HINT_MAIN_CALLBACK_RATE() {
		class Holder {
			static final MemorySegment SDL_HINT_MAIN_CALLBACK_RATE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_MAIN_CALLBACK_RATE");
		}
		return Holder.SDL_HINT_MAIN_CALLBACK_RATE;
	}

	public static MemorySegment SDL_HINT_MOUSE_AUTO_CAPTURE() {
		class Holder {
			static final MemorySegment SDL_HINT_MOUSE_AUTO_CAPTURE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_MOUSE_AUTO_CAPTURE");
		}
		return Holder.SDL_HINT_MOUSE_AUTO_CAPTURE;
	}

	public static MemorySegment SDL_HINT_MOUSE_DOUBLE_CLICK_RADIUS() {
		class Holder {
			static final MemorySegment SDL_HINT_MOUSE_DOUBLE_CLICK_RADIUS
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_MOUSE_DOUBLE_CLICK_RADIUS");
		}
		return Holder.SDL_HINT_MOUSE_DOUBLE_CLICK_RADIUS;
	}

	public static MemorySegment SDL_HINT_MOUSE_DOUBLE_CLICK_TIME() {
		class Holder {
			static final MemorySegment SDL_HINT_MOUSE_DOUBLE_CLICK_TIME
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_MOUSE_DOUBLE_CLICK_TIME");
		}
		return Holder.SDL_HINT_MOUSE_DOUBLE_CLICK_TIME;
	}

	public static MemorySegment SDL_HINT_MOUSE_DEFAULT_SYSTEM_CURSOR() {
		class Holder {
			static final MemorySegment SDL_HINT_MOUSE_DEFAULT_SYSTEM_CURSOR
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_MOUSE_DEFAULT_SYSTEM_CURSOR");
		}
		return Holder.SDL_HINT_MOUSE_DEFAULT_SYSTEM_CURSOR;
	}

	public static MemorySegment SDL_HINT_MOUSE_DPI_SCALE_CURSORS() {
		class Holder {
			static final MemorySegment SDL_HINT_MOUSE_DPI_SCALE_CURSORS
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_MOUSE_DPI_SCALE_CURSORS");
		}
		return Holder.SDL_HINT_MOUSE_DPI_SCALE_CURSORS;
	}

	public static MemorySegment SDL_HINT_MOUSE_EMULATE_WARP_WITH_RELATIVE() {
		class Holder {
			static final MemorySegment SDL_HINT_MOUSE_EMULATE_WARP_WITH_RELATIVE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_MOUSE_EMULATE_WARP_WITH_RELATIVE");
		}
		return Holder.SDL_HINT_MOUSE_EMULATE_WARP_WITH_RELATIVE;
	}

	public static MemorySegment SDL_HINT_MOUSE_FOCUS_CLICKTHROUGH() {
		class Holder {
			static final MemorySegment SDL_HINT_MOUSE_FOCUS_CLICKTHROUGH
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_MOUSE_FOCUS_CLICKTHROUGH");
		}
		return Holder.SDL_HINT_MOUSE_FOCUS_CLICKTHROUGH;
	}

	public static MemorySegment SDL_HINT_MOUSE_NORMAL_SPEED_SCALE() {
		class Holder {
			static final MemorySegment SDL_HINT_MOUSE_NORMAL_SPEED_SCALE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_MOUSE_NORMAL_SPEED_SCALE");
		}
		return Holder.SDL_HINT_MOUSE_NORMAL_SPEED_SCALE;
	}

	public static MemorySegment SDL_HINT_MOUSE_RELATIVE_MODE_CENTER() {
		class Holder {
			static final MemorySegment SDL_HINT_MOUSE_RELATIVE_MODE_CENTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_MOUSE_RELATIVE_MODE_CENTER");
		}
		return Holder.SDL_HINT_MOUSE_RELATIVE_MODE_CENTER;
	}

	public static MemorySegment SDL_HINT_MOUSE_RELATIVE_SPEED_SCALE() {
		class Holder {
			static final MemorySegment SDL_HINT_MOUSE_RELATIVE_SPEED_SCALE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_MOUSE_RELATIVE_SPEED_SCALE");
		}
		return Holder.SDL_HINT_MOUSE_RELATIVE_SPEED_SCALE;
	}

	public static MemorySegment SDL_HINT_MOUSE_RELATIVE_SYSTEM_SCALE() {
		class Holder {
			static final MemorySegment SDL_HINT_MOUSE_RELATIVE_SYSTEM_SCALE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_MOUSE_RELATIVE_SYSTEM_SCALE");
		}
		return Holder.SDL_HINT_MOUSE_RELATIVE_SYSTEM_SCALE;
	}

	public static MemorySegment SDL_HINT_MOUSE_RELATIVE_WARP_MOTION() {
		class Holder {
			static final MemorySegment SDL_HINT_MOUSE_RELATIVE_WARP_MOTION
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_MOUSE_RELATIVE_WARP_MOTION");
		}
		return Holder.SDL_HINT_MOUSE_RELATIVE_WARP_MOTION;
	}

	public static MemorySegment SDL_HINT_MOUSE_RELATIVE_CURSOR_VISIBLE() {
		class Holder {
			static final MemorySegment SDL_HINT_MOUSE_RELATIVE_CURSOR_VISIBLE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_MOUSE_RELATIVE_CURSOR_VISIBLE");
		}
		return Holder.SDL_HINT_MOUSE_RELATIVE_CURSOR_VISIBLE;
	}

	public static MemorySegment SDL_HINT_MOUSE_TOUCH_EVENTS() {
		class Holder {
			static final MemorySegment SDL_HINT_MOUSE_TOUCH_EVENTS
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_MOUSE_TOUCH_EVENTS");
		}
		return Holder.SDL_HINT_MOUSE_TOUCH_EVENTS;
	}

	public static MemorySegment SDL_HINT_MUTE_CONSOLE_KEYBOARD() {
		class Holder {
			static final MemorySegment SDL_HINT_MUTE_CONSOLE_KEYBOARD
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_MUTE_CONSOLE_KEYBOARD");
		}
		return Holder.SDL_HINT_MUTE_CONSOLE_KEYBOARD;
	}

	public static MemorySegment SDL_HINT_NO_SIGNAL_HANDLERS() {
		class Holder {
			static final MemorySegment SDL_HINT_NO_SIGNAL_HANDLERS
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_NO_SIGNAL_HANDLERS");
		}
		return Holder.SDL_HINT_NO_SIGNAL_HANDLERS;
	}

	public static MemorySegment SDL_HINT_OPENGL_LIBRARY() {
		class Holder {
			static final MemorySegment SDL_HINT_OPENGL_LIBRARY
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_OPENGL_LIBRARY");
		}
		return Holder.SDL_HINT_OPENGL_LIBRARY;
	}

	public static MemorySegment SDL_HINT_EGL_LIBRARY() {
		class Holder {
			static final MemorySegment SDL_HINT_EGL_LIBRARY
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_EGL_LIBRARY");
		}
		return Holder.SDL_HINT_EGL_LIBRARY;
	}

	public static MemorySegment SDL_HINT_OPENGL_ES_DRIVER() {
		class Holder {
			static final MemorySegment SDL_HINT_OPENGL_ES_DRIVER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_OPENGL_ES_DRIVER");
		}
		return Holder.SDL_HINT_OPENGL_ES_DRIVER;
	}

	public static MemorySegment SDL_HINT_OPENGL_FORCE_SRGB_FRAMEBUFFER() {
		class Holder {
			static final MemorySegment SDL_HINT_OPENGL_FORCE_SRGB_FRAMEBUFFER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_OPENGL_FORCE_SRGB_FRAMEBUFFER");
		}
		return Holder.SDL_HINT_OPENGL_FORCE_SRGB_FRAMEBUFFER;
	}

	public static MemorySegment SDL_HINT_OPENVR_LIBRARY() {
		class Holder {
			static final MemorySegment SDL_HINT_OPENVR_LIBRARY
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_OPENVR_LIBRARY");
		}
		return Holder.SDL_HINT_OPENVR_LIBRARY;
	}

	public static MemorySegment SDL_HINT_ORIENTATIONS() {
		class Holder {
			static final MemorySegment SDL_HINT_ORIENTATIONS
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_ORIENTATIONS");
		}
		return Holder.SDL_HINT_ORIENTATIONS;
	}

	public static MemorySegment SDL_HINT_POLL_SENTINEL() {
		class Holder {
			static final MemorySegment SDL_HINT_POLL_SENTINEL
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_POLL_SENTINEL");
		}
		return Holder.SDL_HINT_POLL_SENTINEL;
	}

	public static MemorySegment SDL_HINT_PREFERRED_LOCALES() {
		class Holder {
			static final MemorySegment SDL_HINT_PREFERRED_LOCALES
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_PREFERRED_LOCALES");
		}
		return Holder.SDL_HINT_PREFERRED_LOCALES;
	}

	public static MemorySegment SDL_HINT_QUIT_ON_LAST_WINDOW_CLOSE() {
		class Holder {
			static final MemorySegment SDL_HINT_QUIT_ON_LAST_WINDOW_CLOSE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_QUIT_ON_LAST_WINDOW_CLOSE");
		}
		return Holder.SDL_HINT_QUIT_ON_LAST_WINDOW_CLOSE;
	}

	public static MemorySegment SDL_HINT_RENDER_DIRECT3D_THREADSAFE() {
		class Holder {
			static final MemorySegment SDL_HINT_RENDER_DIRECT3D_THREADSAFE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_RENDER_DIRECT3D_THREADSAFE");
		}
		return Holder.SDL_HINT_RENDER_DIRECT3D_THREADSAFE;
	}

	public static MemorySegment SDL_HINT_RENDER_DIRECT3D11_DEBUG() {
		class Holder {
			static final MemorySegment SDL_HINT_RENDER_DIRECT3D11_DEBUG
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_RENDER_DIRECT3D11_DEBUG");
		}
		return Holder.SDL_HINT_RENDER_DIRECT3D11_DEBUG;
	}

	public static MemorySegment SDL_HINT_RENDER_DIRECT3D11_WARP() {
		class Holder {
			static final MemorySegment SDL_HINT_RENDER_DIRECT3D11_WARP
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_RENDER_DIRECT3D11_WARP");
		}
		return Holder.SDL_HINT_RENDER_DIRECT3D11_WARP;
	}

	public static MemorySegment SDL_HINT_RENDER_VULKAN_DEBUG() {
		class Holder {
			static final MemorySegment SDL_HINT_RENDER_VULKAN_DEBUG
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_RENDER_VULKAN_DEBUG");
		}
		return Holder.SDL_HINT_RENDER_VULKAN_DEBUG;
	}

	public static MemorySegment SDL_HINT_RENDER_GPU_DEBUG() {
		class Holder {
			static final MemorySegment SDL_HINT_RENDER_GPU_DEBUG
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_RENDER_GPU_DEBUG");
		}
		return Holder.SDL_HINT_RENDER_GPU_DEBUG;
	}

	public static MemorySegment SDL_HINT_RENDER_GPU_LOW_POWER() {
		class Holder {
			static final MemorySegment SDL_HINT_RENDER_GPU_LOW_POWER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_RENDER_GPU_LOW_POWER");
		}
		return Holder.SDL_HINT_RENDER_GPU_LOW_POWER;
	}

	public static MemorySegment SDL_HINT_RENDER_DRIVER() {
		class Holder {
			static final MemorySegment SDL_HINT_RENDER_DRIVER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_RENDER_DRIVER");
		}
		return Holder.SDL_HINT_RENDER_DRIVER;
	}

	public static MemorySegment SDL_HINT_RENDER_LINE_METHOD() {
		class Holder {
			static final MemorySegment SDL_HINT_RENDER_LINE_METHOD
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_RENDER_LINE_METHOD");
		}
		return Holder.SDL_HINT_RENDER_LINE_METHOD;
	}

	public static MemorySegment SDL_HINT_RENDER_METAL_PREFER_LOW_POWER_DEVICE() {
		class Holder {
			static final MemorySegment SDL_HINT_RENDER_METAL_PREFER_LOW_POWER_DEVICE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_RENDER_METAL_PREFER_LOW_POWER_DEVICE");
		}
		return Holder.SDL_HINT_RENDER_METAL_PREFER_LOW_POWER_DEVICE;
	}

	public static MemorySegment SDL_HINT_RENDER_VSYNC() {
		class Holder {
			static final MemorySegment SDL_HINT_RENDER_VSYNC
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_RENDER_VSYNC");
		}
		return Holder.SDL_HINT_RENDER_VSYNC;
	}

	public static MemorySegment SDL_HINT_RETURN_KEY_HIDES_IME() {
		class Holder {
			static final MemorySegment SDL_HINT_RETURN_KEY_HIDES_IME
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_RETURN_KEY_HIDES_IME");
		}
		return Holder.SDL_HINT_RETURN_KEY_HIDES_IME;
	}

	public static MemorySegment SDL_HINT_ROG_GAMEPAD_MICE() {
		class Holder {
			static final MemorySegment SDL_HINT_ROG_GAMEPAD_MICE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_ROG_GAMEPAD_MICE");
		}
		return Holder.SDL_HINT_ROG_GAMEPAD_MICE;
	}

	public static MemorySegment SDL_HINT_ROG_GAMEPAD_MICE_EXCLUDED() {
		class Holder {
			static final MemorySegment SDL_HINT_ROG_GAMEPAD_MICE_EXCLUDED
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_ROG_GAMEPAD_MICE_EXCLUDED");
		}
		return Holder.SDL_HINT_ROG_GAMEPAD_MICE_EXCLUDED;
	}

	public static MemorySegment SDL_HINT_PS2_GS_WIDTH() {
		class Holder {
			static final MemorySegment SDL_HINT_PS2_GS_WIDTH
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_PS2_GS_WIDTH");
		}
		return Holder.SDL_HINT_PS2_GS_WIDTH;
	}

	public static MemorySegment SDL_HINT_PS2_GS_HEIGHT() {
		class Holder {
			static final MemorySegment SDL_HINT_PS2_GS_HEIGHT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_PS2_GS_HEIGHT");
		}
		return Holder.SDL_HINT_PS2_GS_HEIGHT;
	}

	public static MemorySegment SDL_HINT_PS2_GS_PROGRESSIVE() {
		class Holder {
			static final MemorySegment SDL_HINT_PS2_GS_PROGRESSIVE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_PS2_GS_PROGRESSIVE");
		}
		return Holder.SDL_HINT_PS2_GS_PROGRESSIVE;
	}

	public static MemorySegment SDL_HINT_PS2_GS_MODE() {
		class Holder {
			static final MemorySegment SDL_HINT_PS2_GS_MODE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_PS2_GS_MODE");
		}
		return Holder.SDL_HINT_PS2_GS_MODE;
	}

	public static MemorySegment SDL_HINT_RPI_VIDEO_LAYER() {
		class Holder {
			static final MemorySegment SDL_HINT_RPI_VIDEO_LAYER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_RPI_VIDEO_LAYER");
		}
		return Holder.SDL_HINT_RPI_VIDEO_LAYER;
	}

	public static MemorySegment SDL_HINT_SCREENSAVER_INHIBIT_ACTIVITY_NAME() {
		class Holder {
			static final MemorySegment SDL_HINT_SCREENSAVER_INHIBIT_ACTIVITY_NAME
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_SCREENSAVER_INHIBIT_ACTIVITY_NAME");
		}
		return Holder.SDL_HINT_SCREENSAVER_INHIBIT_ACTIVITY_NAME;
	}

	public static MemorySegment SDL_HINT_SHUTDOWN_DBUS_ON_QUIT() {
		class Holder {
			static final MemorySegment SDL_HINT_SHUTDOWN_DBUS_ON_QUIT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_SHUTDOWN_DBUS_ON_QUIT");
		}
		return Holder.SDL_HINT_SHUTDOWN_DBUS_ON_QUIT;
	}

	public static MemorySegment SDL_HINT_STORAGE_TITLE_DRIVER() {
		class Holder {
			static final MemorySegment SDL_HINT_STORAGE_TITLE_DRIVER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_STORAGE_TITLE_DRIVER");
		}
		return Holder.SDL_HINT_STORAGE_TITLE_DRIVER;
	}

	public static MemorySegment SDL_HINT_STORAGE_USER_DRIVER() {
		class Holder {
			static final MemorySegment SDL_HINT_STORAGE_USER_DRIVER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_STORAGE_USER_DRIVER");
		}
		return Holder.SDL_HINT_STORAGE_USER_DRIVER;
	}

	public static MemorySegment SDL_HINT_THREAD_FORCE_REALTIME_TIME_CRITICAL() {
		class Holder {
			static final MemorySegment SDL_HINT_THREAD_FORCE_REALTIME_TIME_CRITICAL
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_THREAD_FORCE_REALTIME_TIME_CRITICAL");
		}
		return Holder.SDL_HINT_THREAD_FORCE_REALTIME_TIME_CRITICAL;
	}

	public static MemorySegment SDL_HINT_THREAD_PRIORITY_POLICY() {
		class Holder {
			static final MemorySegment SDL_HINT_THREAD_PRIORITY_POLICY
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_THREAD_PRIORITY_POLICY");
		}
		return Holder.SDL_HINT_THREAD_PRIORITY_POLICY;
	}

	public static MemorySegment SDL_HINT_TIMER_RESOLUTION() {
		class Holder {
			static final MemorySegment SDL_HINT_TIMER_RESOLUTION
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_TIMER_RESOLUTION");
		}
		return Holder.SDL_HINT_TIMER_RESOLUTION;
	}

	public static MemorySegment SDL_HINT_TOUCH_MOUSE_EVENTS() {
		class Holder {
			static final MemorySegment SDL_HINT_TOUCH_MOUSE_EVENTS
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_TOUCH_MOUSE_EVENTS");
		}
		return Holder.SDL_HINT_TOUCH_MOUSE_EVENTS;
	}

	public static MemorySegment SDL_HINT_TRACKPAD_IS_TOUCH_ONLY() {
		class Holder {
			static final MemorySegment SDL_HINT_TRACKPAD_IS_TOUCH_ONLY
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_TRACKPAD_IS_TOUCH_ONLY");
		}
		return Holder.SDL_HINT_TRACKPAD_IS_TOUCH_ONLY;
	}

	public static MemorySegment SDL_HINT_TV_REMOTE_AS_JOYSTICK() {
		class Holder {
			static final MemorySegment SDL_HINT_TV_REMOTE_AS_JOYSTICK
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_TV_REMOTE_AS_JOYSTICK");
		}
		return Holder.SDL_HINT_TV_REMOTE_AS_JOYSTICK;
	}

	public static MemorySegment SDL_HINT_VIDEO_ALLOW_SCREENSAVER() {
		class Holder {
			static final MemorySegment SDL_HINT_VIDEO_ALLOW_SCREENSAVER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VIDEO_ALLOW_SCREENSAVER");
		}
		return Holder.SDL_HINT_VIDEO_ALLOW_SCREENSAVER;
	}

	public static MemorySegment SDL_HINT_VIDEO_DISPLAY_PRIORITY() {
		class Holder {
			static final MemorySegment SDL_HINT_VIDEO_DISPLAY_PRIORITY
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VIDEO_DISPLAY_PRIORITY");
		}
		return Holder.SDL_HINT_VIDEO_DISPLAY_PRIORITY;
	}

	public static MemorySegment SDL_HINT_VIDEO_DOUBLE_BUFFER() {
		class Holder {
			static final MemorySegment SDL_HINT_VIDEO_DOUBLE_BUFFER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VIDEO_DOUBLE_BUFFER");
		}
		return Holder.SDL_HINT_VIDEO_DOUBLE_BUFFER;
	}

	public static MemorySegment SDL_HINT_VIDEO_DRIVER() {
		class Holder {
			static final MemorySegment SDL_HINT_VIDEO_DRIVER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VIDEO_DRIVER");
		}
		return Holder.SDL_HINT_VIDEO_DRIVER;
	}

	public static MemorySegment SDL_HINT_VIDEO_DUMMY_SAVE_FRAMES() {
		class Holder {
			static final MemorySegment SDL_HINT_VIDEO_DUMMY_SAVE_FRAMES
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VIDEO_DUMMY_SAVE_FRAMES");
		}
		return Holder.SDL_HINT_VIDEO_DUMMY_SAVE_FRAMES;
	}

	public static MemorySegment SDL_HINT_VIDEO_EGL_ALLOW_GETDISPLAY_FALLBACK() {
		class Holder {
			static final MemorySegment SDL_HINT_VIDEO_EGL_ALLOW_GETDISPLAY_FALLBACK
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VIDEO_EGL_ALLOW_GETDISPLAY_FALLBACK");
		}
		return Holder.SDL_HINT_VIDEO_EGL_ALLOW_GETDISPLAY_FALLBACK;
	}

	public static MemorySegment SDL_HINT_VIDEO_FORCE_EGL() {
		class Holder {
			static final MemorySegment SDL_HINT_VIDEO_FORCE_EGL
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VIDEO_FORCE_EGL");
		}
		return Holder.SDL_HINT_VIDEO_FORCE_EGL;
	}

	public static MemorySegment SDL_HINT_VIDEO_MAC_FULLSCREEN_SPACES() {
		class Holder {
			static final MemorySegment SDL_HINT_VIDEO_MAC_FULLSCREEN_SPACES
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VIDEO_MAC_FULLSCREEN_SPACES");
		}
		return Holder.SDL_HINT_VIDEO_MAC_FULLSCREEN_SPACES;
	}

	public static MemorySegment SDL_HINT_VIDEO_MAC_FULLSCREEN_MENU_VISIBILITY() {
		class Holder {
			static final MemorySegment SDL_HINT_VIDEO_MAC_FULLSCREEN_MENU_VISIBILITY
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VIDEO_MAC_FULLSCREEN_MENU_VISIBILITY");
		}
		return Holder.SDL_HINT_VIDEO_MAC_FULLSCREEN_MENU_VISIBILITY;
	}

	public static MemorySegment SDL_HINT_VIDEO_METAL_AUTO_RESIZE_DRAWABLE() {
		class Holder {
			static final MemorySegment SDL_HINT_VIDEO_METAL_AUTO_RESIZE_DRAWABLE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VIDEO_METAL_AUTO_RESIZE_DRAWABLE");
		}
		return Holder.SDL_HINT_VIDEO_METAL_AUTO_RESIZE_DRAWABLE;
	}

	public static MemorySegment SDL_HINT_VIDEO_MATCH_EXCLUSIVE_MODE_ON_MOVE() {
		class Holder {
			static final MemorySegment SDL_HINT_VIDEO_MATCH_EXCLUSIVE_MODE_ON_MOVE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VIDEO_MATCH_EXCLUSIVE_MODE_ON_MOVE");
		}
		return Holder.SDL_HINT_VIDEO_MATCH_EXCLUSIVE_MODE_ON_MOVE;
	}

	public static MemorySegment SDL_HINT_VIDEO_MINIMIZE_ON_FOCUS_LOSS() {
		class Holder {
			static final MemorySegment SDL_HINT_VIDEO_MINIMIZE_ON_FOCUS_LOSS
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VIDEO_MINIMIZE_ON_FOCUS_LOSS");
		}
		return Holder.SDL_HINT_VIDEO_MINIMIZE_ON_FOCUS_LOSS;
	}

	public static MemorySegment SDL_HINT_VIDEO_OFFSCREEN_SAVE_FRAMES() {
		class Holder {
			static final MemorySegment SDL_HINT_VIDEO_OFFSCREEN_SAVE_FRAMES
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VIDEO_OFFSCREEN_SAVE_FRAMES");
		}
		return Holder.SDL_HINT_VIDEO_OFFSCREEN_SAVE_FRAMES;
	}

	public static MemorySegment SDL_HINT_VIDEO_SYNC_WINDOW_OPERATIONS() {
		class Holder {
			static final MemorySegment SDL_HINT_VIDEO_SYNC_WINDOW_OPERATIONS
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VIDEO_SYNC_WINDOW_OPERATIONS");
		}
		return Holder.SDL_HINT_VIDEO_SYNC_WINDOW_OPERATIONS;
	}

	public static MemorySegment SDL_HINT_VIDEO_WAYLAND_ALLOW_LIBDECOR() {
		class Holder {
			static final MemorySegment SDL_HINT_VIDEO_WAYLAND_ALLOW_LIBDECOR
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VIDEO_WAYLAND_ALLOW_LIBDECOR");
		}
		return Holder.SDL_HINT_VIDEO_WAYLAND_ALLOW_LIBDECOR;
	}

	public static MemorySegment SDL_HINT_VIDEO_WAYLAND_MODE_EMULATION() {
		class Holder {
			static final MemorySegment SDL_HINT_VIDEO_WAYLAND_MODE_EMULATION
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VIDEO_WAYLAND_MODE_EMULATION");
		}
		return Holder.SDL_HINT_VIDEO_WAYLAND_MODE_EMULATION;
	}

	public static MemorySegment SDL_HINT_VIDEO_WAYLAND_MODE_SCALING() {
		class Holder {
			static final MemorySegment SDL_HINT_VIDEO_WAYLAND_MODE_SCALING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VIDEO_WAYLAND_MODE_SCALING");
		}
		return Holder.SDL_HINT_VIDEO_WAYLAND_MODE_SCALING;
	}

	public static MemorySegment SDL_HINT_VIDEO_WAYLAND_PREFER_LIBDECOR() {
		class Holder {
			static final MemorySegment SDL_HINT_VIDEO_WAYLAND_PREFER_LIBDECOR
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VIDEO_WAYLAND_PREFER_LIBDECOR");
		}
		return Holder.SDL_HINT_VIDEO_WAYLAND_PREFER_LIBDECOR;
	}

	public static MemorySegment SDL_HINT_VIDEO_WAYLAND_SCALE_TO_DISPLAY() {
		class Holder {
			static final MemorySegment SDL_HINT_VIDEO_WAYLAND_SCALE_TO_DISPLAY
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VIDEO_WAYLAND_SCALE_TO_DISPLAY");
		}
		return Holder.SDL_HINT_VIDEO_WAYLAND_SCALE_TO_DISPLAY;
	}

	public static MemorySegment SDL_HINT_VIDEO_WIN_D3DCOMPILER() {
		class Holder {
			static final MemorySegment SDL_HINT_VIDEO_WIN_D3DCOMPILER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VIDEO_WIN_D3DCOMPILER");
		}
		return Holder.SDL_HINT_VIDEO_WIN_D3DCOMPILER;
	}

	public static MemorySegment SDL_HINT_VIDEO_X11_ENABLE_XSYNC_EXT() {
		class Holder {
			static final MemorySegment SDL_HINT_VIDEO_X11_ENABLE_XSYNC_EXT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VIDEO_X11_ENABLE_XSYNC_EXT");
		}
		return Holder.SDL_HINT_VIDEO_X11_ENABLE_XSYNC_EXT;
	}

	public static MemorySegment SDL_HINT_VIDEO_X11_EXTERNAL_WINDOW_INPUT() {
		class Holder {
			static final MemorySegment SDL_HINT_VIDEO_X11_EXTERNAL_WINDOW_INPUT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VIDEO_X11_EXTERNAL_WINDOW_INPUT");
		}
		return Holder.SDL_HINT_VIDEO_X11_EXTERNAL_WINDOW_INPUT;
	}

	public static MemorySegment SDL_HINT_VIDEO_X11_NET_WM_BYPASS_COMPOSITOR() {
		class Holder {
			static final MemorySegment SDL_HINT_VIDEO_X11_NET_WM_BYPASS_COMPOSITOR
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VIDEO_X11_NET_WM_BYPASS_COMPOSITOR");
		}
		return Holder.SDL_HINT_VIDEO_X11_NET_WM_BYPASS_COMPOSITOR;
	}

	public static MemorySegment SDL_HINT_VIDEO_X11_NET_WM_PING() {
		class Holder {
			static final MemorySegment SDL_HINT_VIDEO_X11_NET_WM_PING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VIDEO_X11_NET_WM_PING");
		}
		return Holder.SDL_HINT_VIDEO_X11_NET_WM_PING;
	}

	public static MemorySegment SDL_HINT_VIDEO_X11_NODIRECTCOLOR() {
		class Holder {
			static final MemorySegment SDL_HINT_VIDEO_X11_NODIRECTCOLOR
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VIDEO_X11_NODIRECTCOLOR");
		}
		return Holder.SDL_HINT_VIDEO_X11_NODIRECTCOLOR;
	}

	public static MemorySegment SDL_HINT_VIDEO_X11_SCALING_FACTOR() {
		class Holder {
			static final MemorySegment SDL_HINT_VIDEO_X11_SCALING_FACTOR
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VIDEO_X11_SCALING_FACTOR");
		}
		return Holder.SDL_HINT_VIDEO_X11_SCALING_FACTOR;
	}

	public static MemorySegment SDL_HINT_VIDEO_X11_VISUALID() {
		class Holder {
			static final MemorySegment SDL_HINT_VIDEO_X11_VISUALID
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VIDEO_X11_VISUALID");
		}
		return Holder.SDL_HINT_VIDEO_X11_VISUALID;
	}

	public static MemorySegment SDL_HINT_VIDEO_X11_WINDOW_VISUALID() {
		class Holder {
			static final MemorySegment SDL_HINT_VIDEO_X11_WINDOW_VISUALID
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VIDEO_X11_WINDOW_VISUALID");
		}
		return Holder.SDL_HINT_VIDEO_X11_WINDOW_VISUALID;
	}

	public static MemorySegment SDL_HINT_VIDEO_X11_XRANDR() {
		class Holder {
			static final MemorySegment SDL_HINT_VIDEO_X11_XRANDR
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VIDEO_X11_XRANDR");
		}
		return Holder.SDL_HINT_VIDEO_X11_XRANDR;
	}

	public static MemorySegment SDL_HINT_VITA_ENABLE_BACK_TOUCH() {
		class Holder {
			static final MemorySegment SDL_HINT_VITA_ENABLE_BACK_TOUCH
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VITA_ENABLE_BACK_TOUCH");
		}
		return Holder.SDL_HINT_VITA_ENABLE_BACK_TOUCH;
	}

	public static MemorySegment SDL_HINT_VITA_ENABLE_FRONT_TOUCH() {
		class Holder {
			static final MemorySegment SDL_HINT_VITA_ENABLE_FRONT_TOUCH
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VITA_ENABLE_FRONT_TOUCH");
		}
		return Holder.SDL_HINT_VITA_ENABLE_FRONT_TOUCH;
	}

	public static MemorySegment SDL_HINT_VITA_MODULE_PATH() {
		class Holder {
			static final MemorySegment SDL_HINT_VITA_MODULE_PATH
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VITA_MODULE_PATH");
		}
		return Holder.SDL_HINT_VITA_MODULE_PATH;
	}

	public static MemorySegment SDL_HINT_VITA_PVR_INIT() {
		class Holder {
			static final MemorySegment SDL_HINT_VITA_PVR_INIT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VITA_PVR_INIT");
		}
		return Holder.SDL_HINT_VITA_PVR_INIT;
	}

	public static MemorySegment SDL_HINT_VITA_RESOLUTION() {
		class Holder {
			static final MemorySegment SDL_HINT_VITA_RESOLUTION
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VITA_RESOLUTION");
		}
		return Holder.SDL_HINT_VITA_RESOLUTION;
	}

	public static MemorySegment SDL_HINT_VITA_PVR_OPENGL() {
		class Holder {
			static final MemorySegment SDL_HINT_VITA_PVR_OPENGL
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VITA_PVR_OPENGL");
		}
		return Holder.SDL_HINT_VITA_PVR_OPENGL;
	}

	public static MemorySegment SDL_HINT_VITA_TOUCH_MOUSE_DEVICE() {
		class Holder {
			static final MemorySegment SDL_HINT_VITA_TOUCH_MOUSE_DEVICE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VITA_TOUCH_MOUSE_DEVICE");
		}
		return Holder.SDL_HINT_VITA_TOUCH_MOUSE_DEVICE;
	}

	public static MemorySegment SDL_HINT_VULKAN_DISPLAY() {
		class Holder {
			static final MemorySegment SDL_HINT_VULKAN_DISPLAY
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VULKAN_DISPLAY");
		}
		return Holder.SDL_HINT_VULKAN_DISPLAY;
	}

	public static MemorySegment SDL_HINT_VULKAN_LIBRARY() {
		class Holder {
			static final MemorySegment SDL_HINT_VULKAN_LIBRARY
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_VULKAN_LIBRARY");
		}
		return Holder.SDL_HINT_VULKAN_LIBRARY;
	}

	public static MemorySegment SDL_HINT_WAVE_FACT_CHUNK() {
		class Holder {
			static final MemorySegment SDL_HINT_WAVE_FACT_CHUNK
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_WAVE_FACT_CHUNK");
		}
		return Holder.SDL_HINT_WAVE_FACT_CHUNK;
	}

	public static MemorySegment SDL_HINT_WAVE_CHUNK_LIMIT() {
		class Holder {
			static final MemorySegment SDL_HINT_WAVE_CHUNK_LIMIT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_WAVE_CHUNK_LIMIT");
		}
		return Holder.SDL_HINT_WAVE_CHUNK_LIMIT;
	}

	public static MemorySegment SDL_HINT_WAVE_RIFF_CHUNK_SIZE() {
		class Holder {
			static final MemorySegment SDL_HINT_WAVE_RIFF_CHUNK_SIZE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_WAVE_RIFF_CHUNK_SIZE");
		}
		return Holder.SDL_HINT_WAVE_RIFF_CHUNK_SIZE;
	}

	public static MemorySegment SDL_HINT_WAVE_TRUNCATION() {
		class Holder {
			static final MemorySegment SDL_HINT_WAVE_TRUNCATION
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_WAVE_TRUNCATION");
		}
		return Holder.SDL_HINT_WAVE_TRUNCATION;
	}

	public static MemorySegment SDL_HINT_WINDOW_ACTIVATE_WHEN_RAISED() {
		class Holder {
			static final MemorySegment SDL_HINT_WINDOW_ACTIVATE_WHEN_RAISED
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_WINDOW_ACTIVATE_WHEN_RAISED");
		}
		return Holder.SDL_HINT_WINDOW_ACTIVATE_WHEN_RAISED;
	}

	public static MemorySegment SDL_HINT_WINDOW_ACTIVATE_WHEN_SHOWN() {
		class Holder {
			static final MemorySegment SDL_HINT_WINDOW_ACTIVATE_WHEN_SHOWN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_WINDOW_ACTIVATE_WHEN_SHOWN");
		}
		return Holder.SDL_HINT_WINDOW_ACTIVATE_WHEN_SHOWN;
	}

	public static MemorySegment SDL_HINT_WINDOW_ALLOW_TOPMOST() {
		class Holder {
			static final MemorySegment SDL_HINT_WINDOW_ALLOW_TOPMOST
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_WINDOW_ALLOW_TOPMOST");
		}
		return Holder.SDL_HINT_WINDOW_ALLOW_TOPMOST;
	}

	public static MemorySegment SDL_HINT_WINDOW_FRAME_USABLE_WHILE_CURSOR_HIDDEN() {
		class Holder {
			static final MemorySegment SDL_HINT_WINDOW_FRAME_USABLE_WHILE_CURSOR_HIDDEN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_WINDOW_FRAME_USABLE_WHILE_CURSOR_HIDDEN");
		}
		return Holder.SDL_HINT_WINDOW_FRAME_USABLE_WHILE_CURSOR_HIDDEN;
	}

	public static MemorySegment SDL_HINT_WINDOWS_CLOSE_ON_ALT_F4() {
		class Holder {
			static final MemorySegment SDL_HINT_WINDOWS_CLOSE_ON_ALT_F4
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_WINDOWS_CLOSE_ON_ALT_F4");
		}
		return Holder.SDL_HINT_WINDOWS_CLOSE_ON_ALT_F4;
	}

	public static MemorySegment SDL_HINT_WINDOWS_ENABLE_MENU_MNEMONICS() {
		class Holder {
			static final MemorySegment SDL_HINT_WINDOWS_ENABLE_MENU_MNEMONICS
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_WINDOWS_ENABLE_MENU_MNEMONICS");
		}
		return Holder.SDL_HINT_WINDOWS_ENABLE_MENU_MNEMONICS;
	}

	public static MemorySegment SDL_HINT_WINDOWS_ENABLE_MESSAGELOOP() {
		class Holder {
			static final MemorySegment SDL_HINT_WINDOWS_ENABLE_MESSAGELOOP
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_WINDOWS_ENABLE_MESSAGELOOP");
		}
		return Holder.SDL_HINT_WINDOWS_ENABLE_MESSAGELOOP;
	}

	public static MemorySegment SDL_HINT_WINDOWS_GAMEINPUT() {
		class Holder {
			static final MemorySegment SDL_HINT_WINDOWS_GAMEINPUT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_WINDOWS_GAMEINPUT");
		}
		return Holder.SDL_HINT_WINDOWS_GAMEINPUT;
	}

	public static MemorySegment SDL_HINT_WINDOWS_RAW_KEYBOARD() {
		class Holder {
			static final MemorySegment SDL_HINT_WINDOWS_RAW_KEYBOARD
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_WINDOWS_RAW_KEYBOARD");
		}
		return Holder.SDL_HINT_WINDOWS_RAW_KEYBOARD;
	}

	public static MemorySegment SDL_HINT_WINDOWS_RAW_KEYBOARD_EXCLUDE_HOTKEYS() {
		class Holder {
			static final MemorySegment SDL_HINT_WINDOWS_RAW_KEYBOARD_EXCLUDE_HOTKEYS
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_WINDOWS_RAW_KEYBOARD_EXCLUDE_HOTKEYS");
		}
		return Holder.SDL_HINT_WINDOWS_RAW_KEYBOARD_EXCLUDE_HOTKEYS;
	}

	public static MemorySegment SDL_HINT_WINDOWS_RAW_KEYBOARD_INPUTSINK() {
		class Holder {
			static final MemorySegment SDL_HINT_WINDOWS_RAW_KEYBOARD_INPUTSINK
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_WINDOWS_RAW_KEYBOARD_INPUTSINK");
		}
		return Holder.SDL_HINT_WINDOWS_RAW_KEYBOARD_INPUTSINK;
	}

	public static MemorySegment SDL_HINT_WINDOWS_FORCE_SEMAPHORE_KERNEL() {
		class Holder {
			static final MemorySegment SDL_HINT_WINDOWS_FORCE_SEMAPHORE_KERNEL
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_WINDOWS_FORCE_SEMAPHORE_KERNEL");
		}
		return Holder.SDL_HINT_WINDOWS_FORCE_SEMAPHORE_KERNEL;
	}

	public static MemorySegment SDL_HINT_WINDOWS_INTRESOURCE_ICON() {
		class Holder {
			static final MemorySegment SDL_HINT_WINDOWS_INTRESOURCE_ICON
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_WINDOWS_INTRESOURCE_ICON");
		}
		return Holder.SDL_HINT_WINDOWS_INTRESOURCE_ICON;
	}

	public static MemorySegment SDL_HINT_WINDOWS_INTRESOURCE_ICON_SMALL() {
		class Holder {
			static final MemorySegment SDL_HINT_WINDOWS_INTRESOURCE_ICON_SMALL
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_WINDOWS_INTRESOURCE_ICON_SMALL");
		}
		return Holder.SDL_HINT_WINDOWS_INTRESOURCE_ICON_SMALL;
	}

	public static MemorySegment SDL_HINT_WINDOWS_USE_D3D9EX() {
		class Holder {
			static final MemorySegment SDL_HINT_WINDOWS_USE_D3D9EX
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_WINDOWS_USE_D3D9EX");
		}
		return Holder.SDL_HINT_WINDOWS_USE_D3D9EX;
	}

	public static MemorySegment SDL_HINT_WINDOWS_ERASE_BACKGROUND_MODE() {
		class Holder {
			static final MemorySegment SDL_HINT_WINDOWS_ERASE_BACKGROUND_MODE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_WINDOWS_ERASE_BACKGROUND_MODE");
		}
		return Holder.SDL_HINT_WINDOWS_ERASE_BACKGROUND_MODE;
	}

	public static MemorySegment SDL_HINT_X11_FORCE_OVERRIDE_REDIRECT() {
		class Holder {
			static final MemorySegment SDL_HINT_X11_FORCE_OVERRIDE_REDIRECT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_X11_FORCE_OVERRIDE_REDIRECT");
		}
		return Holder.SDL_HINT_X11_FORCE_OVERRIDE_REDIRECT;
	}

	public static MemorySegment SDL_HINT_X11_WINDOW_TYPE() {
		class Holder {
			static final MemorySegment SDL_HINT_X11_WINDOW_TYPE
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_X11_WINDOW_TYPE");
		}
		return Holder.SDL_HINT_X11_WINDOW_TYPE;
	}

	public static MemorySegment SDL_HINT_X11_XCB_LIBRARY() {
		class Holder {
			static final MemorySegment SDL_HINT_X11_XCB_LIBRARY
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_X11_XCB_LIBRARY");
		}
		return Holder.SDL_HINT_X11_XCB_LIBRARY;
	}

	public static MemorySegment SDL_HINT_XINPUT_ENABLED() {
		class Holder {
			static final MemorySegment SDL_HINT_XINPUT_ENABLED
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_XINPUT_ENABLED");
		}
		return Holder.SDL_HINT_XINPUT_ENABLED;
	}

	public static MemorySegment SDL_HINT_ASSERT() {
		class Holder {
			static final MemorySegment SDL_HINT_ASSERT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_ASSERT");
		}
		return Holder.SDL_HINT_ASSERT;
	}

	public static MemorySegment SDL_HINT_PEN_MOUSE_EVENTS() {
		class Holder {
			static final MemorySegment SDL_HINT_PEN_MOUSE_EVENTS
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_PEN_MOUSE_EVENTS");
		}
		return Holder.SDL_HINT_PEN_MOUSE_EVENTS;
	}

	public static MemorySegment SDL_HINT_PEN_TOUCH_EVENTS() {
		class Holder {
			static final MemorySegment SDL_HINT_PEN_TOUCH_EVENTS
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL_PEN_TOUCH_EVENTS");
		}
		return Holder.SDL_HINT_PEN_TOUCH_EVENTS;
	}

	private static final int SDL_INIT_AUDIO = (int) 16L;

	public static int SDL_INIT_AUDIO() {
		return SDL_INIT_AUDIO;
	}

	private static final int SDL_INIT_VIDEO = (int) 32L;

	public static int SDL_INIT_VIDEO() {
		return SDL_INIT_VIDEO;
	}

	private static final int SDL_INIT_JOYSTICK = (int) 512L;

	public static int SDL_INIT_JOYSTICK() {
		return SDL_INIT_JOYSTICK;
	}

	private static final int SDL_INIT_HAPTIC = (int) 4096L;

	public static int SDL_INIT_HAPTIC() {
		return SDL_INIT_HAPTIC;
	}

	private static final int SDL_INIT_GAMEPAD = (int) 8192L;

	public static int SDL_INIT_GAMEPAD() {
		return SDL_INIT_GAMEPAD;
	}

	private static final int SDL_INIT_EVENTS = (int) 16384L;

	public static int SDL_INIT_EVENTS() {
		return SDL_INIT_EVENTS;
	}

	private static final int SDL_INIT_SENSOR = (int) 32768L;

	public static int SDL_INIT_SENSOR() {
		return SDL_INIT_SENSOR;
	}

	private static final int SDL_INIT_CAMERA = (int) 65536L;

	public static int SDL_INIT_CAMERA() {
		return SDL_INIT_CAMERA;
	}

	public static MemorySegment SDL_PROP_APP_METADATA_NAME_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_APP_METADATA_NAME_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.app.metadata.name");
		}
		return Holder.SDL_PROP_APP_METADATA_NAME_STRING;
	}

	public static MemorySegment SDL_PROP_APP_METADATA_VERSION_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_APP_METADATA_VERSION_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.app.metadata.version");
		}
		return Holder.SDL_PROP_APP_METADATA_VERSION_STRING;
	}

	public static MemorySegment SDL_PROP_APP_METADATA_IDENTIFIER_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_APP_METADATA_IDENTIFIER_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.app.metadata.identifier");
		}
		return Holder.SDL_PROP_APP_METADATA_IDENTIFIER_STRING;
	}

	public static MemorySegment SDL_PROP_APP_METADATA_CREATOR_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_APP_METADATA_CREATOR_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.app.metadata.creator");
		}
		return Holder.SDL_PROP_APP_METADATA_CREATOR_STRING;
	}

	public static MemorySegment SDL_PROP_APP_METADATA_COPYRIGHT_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_APP_METADATA_COPYRIGHT_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.app.metadata.copyright");
		}
		return Holder.SDL_PROP_APP_METADATA_COPYRIGHT_STRING;
	}

	public static MemorySegment SDL_PROP_APP_METADATA_URL_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_APP_METADATA_URL_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.app.metadata.url");
		}
		return Holder.SDL_PROP_APP_METADATA_URL_STRING;
	}

	public static MemorySegment SDL_PROP_APP_METADATA_TYPE_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_APP_METADATA_TYPE_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.app.metadata.type");
		}
		return Holder.SDL_PROP_APP_METADATA_TYPE_STRING;
	}

	private static final int SDL_MESSAGEBOX_ERROR = (int) 16L;

	public static int SDL_MESSAGEBOX_ERROR() {
		return SDL_MESSAGEBOX_ERROR;
	}

	private static final int SDL_MESSAGEBOX_WARNING = (int) 32L;

	public static int SDL_MESSAGEBOX_WARNING() {
		return SDL_MESSAGEBOX_WARNING;
	}

	private static final int SDL_MESSAGEBOX_INFORMATION = (int) 64L;

	public static int SDL_MESSAGEBOX_INFORMATION() {
		return SDL_MESSAGEBOX_INFORMATION;
	}

	private static final int SDL_MESSAGEBOX_BUTTONS_LEFT_TO_RIGHT = (int) 128L;

	public static int SDL_MESSAGEBOX_BUTTONS_LEFT_TO_RIGHT() {
		return SDL_MESSAGEBOX_BUTTONS_LEFT_TO_RIGHT;
	}

	private static final int SDL_MESSAGEBOX_BUTTONS_RIGHT_TO_LEFT = (int) 256L;

	public static int SDL_MESSAGEBOX_BUTTONS_RIGHT_TO_LEFT() {
		return SDL_MESSAGEBOX_BUTTONS_RIGHT_TO_LEFT;
	}

	private static final int SDL_MESSAGEBOX_BUTTON_RETURNKEY_DEFAULT = (int) 1L;

	public static int SDL_MESSAGEBOX_BUTTON_RETURNKEY_DEFAULT() {
		return SDL_MESSAGEBOX_BUTTON_RETURNKEY_DEFAULT;
	}

	private static final int SDL_MESSAGEBOX_BUTTON_ESCAPEKEY_DEFAULT = (int) 2L;

	public static int SDL_MESSAGEBOX_BUTTON_ESCAPEKEY_DEFAULT() {
		return SDL_MESSAGEBOX_BUTTON_ESCAPEKEY_DEFAULT;
	}

	public static MemorySegment SDL_PROP_PROCESS_CREATE_ARGS_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_PROCESS_CREATE_ARGS_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.process.create.args");
		}
		return Holder.SDL_PROP_PROCESS_CREATE_ARGS_POINTER;
	}

	public static MemorySegment SDL_PROP_PROCESS_CREATE_ENVIRONMENT_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_PROCESS_CREATE_ENVIRONMENT_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.process.create.environment");
		}
		return Holder.SDL_PROP_PROCESS_CREATE_ENVIRONMENT_POINTER;
	}

	public static MemorySegment SDL_PROP_PROCESS_CREATE_WORKING_DIRECTORY_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_PROCESS_CREATE_WORKING_DIRECTORY_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.process.create.working_directory");
		}
		return Holder.SDL_PROP_PROCESS_CREATE_WORKING_DIRECTORY_STRING;
	}

	public static MemorySegment SDL_PROP_PROCESS_CREATE_STDIN_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_PROCESS_CREATE_STDIN_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.process.create.stdin_option");
		}
		return Holder.SDL_PROP_PROCESS_CREATE_STDIN_NUMBER;
	}

	public static MemorySegment SDL_PROP_PROCESS_CREATE_STDIN_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_PROCESS_CREATE_STDIN_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.process.create.stdin_source");
		}
		return Holder.SDL_PROP_PROCESS_CREATE_STDIN_POINTER;
	}

	public static MemorySegment SDL_PROP_PROCESS_CREATE_STDOUT_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_PROCESS_CREATE_STDOUT_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.process.create.stdout_option");
		}
		return Holder.SDL_PROP_PROCESS_CREATE_STDOUT_NUMBER;
	}

	public static MemorySegment SDL_PROP_PROCESS_CREATE_STDOUT_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_PROCESS_CREATE_STDOUT_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.process.create.stdout_source");
		}
		return Holder.SDL_PROP_PROCESS_CREATE_STDOUT_POINTER;
	}

	public static MemorySegment SDL_PROP_PROCESS_CREATE_STDERR_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_PROCESS_CREATE_STDERR_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.process.create.stderr_option");
		}
		return Holder.SDL_PROP_PROCESS_CREATE_STDERR_NUMBER;
	}

	public static MemorySegment SDL_PROP_PROCESS_CREATE_STDERR_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_PROCESS_CREATE_STDERR_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.process.create.stderr_source");
		}
		return Holder.SDL_PROP_PROCESS_CREATE_STDERR_POINTER;
	}

	public static MemorySegment SDL_PROP_PROCESS_CREATE_STDERR_TO_STDOUT_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_PROCESS_CREATE_STDERR_TO_STDOUT_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.process.create.stderr_to_stdout");
		}
		return Holder.SDL_PROP_PROCESS_CREATE_STDERR_TO_STDOUT_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_PROCESS_CREATE_BACKGROUND_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_PROCESS_CREATE_BACKGROUND_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.process.create.background");
		}
		return Holder.SDL_PROP_PROCESS_CREATE_BACKGROUND_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_PROCESS_CREATE_CMDLINE_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_PROCESS_CREATE_CMDLINE_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.process.create.cmdline");
		}
		return Holder.SDL_PROP_PROCESS_CREATE_CMDLINE_STRING;
	}

	public static MemorySegment SDL_PROP_PROCESS_PID_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_PROCESS_PID_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.process.pid");
		}
		return Holder.SDL_PROP_PROCESS_PID_NUMBER;
	}

	public static MemorySegment SDL_PROP_PROCESS_STDIN_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_PROCESS_STDIN_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.process.stdin");
		}
		return Holder.SDL_PROP_PROCESS_STDIN_POINTER;
	}

	public static MemorySegment SDL_PROP_PROCESS_STDOUT_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_PROCESS_STDOUT_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.process.stdout");
		}
		return Holder.SDL_PROP_PROCESS_STDOUT_POINTER;
	}

	public static MemorySegment SDL_PROP_PROCESS_STDERR_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_PROCESS_STDERR_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.process.stderr");
		}
		return Holder.SDL_PROP_PROCESS_STDERR_POINTER;
	}

	public static MemorySegment SDL_PROP_PROCESS_BACKGROUND_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_PROCESS_BACKGROUND_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.process.background");
		}
		return Holder.SDL_PROP_PROCESS_BACKGROUND_BOOLEAN;
	}

	public static MemorySegment SDL_SOFTWARE_RENDERER() {
		class Holder {
			static final MemorySegment SDL_SOFTWARE_RENDERER
					= SDL3.LIBRARY_ARENA.allocateFrom("software");
		}
		return Holder.SDL_SOFTWARE_RENDERER;
	}

	public static MemorySegment SDL_GPU_RENDERER() {
		class Holder {
			static final MemorySegment SDL_GPU_RENDERER
					= SDL3.LIBRARY_ARENA.allocateFrom("gpu");
		}
		return Holder.SDL_GPU_RENDERER;
	}

	public static MemorySegment SDL_PROP_RENDERER_CREATE_NAME_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_CREATE_NAME_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.create.name");
		}
		return Holder.SDL_PROP_RENDERER_CREATE_NAME_STRING;
	}

	public static MemorySegment SDL_PROP_RENDERER_CREATE_WINDOW_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_CREATE_WINDOW_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.create.window");
		}
		return Holder.SDL_PROP_RENDERER_CREATE_WINDOW_POINTER;
	}

	public static MemorySegment SDL_PROP_RENDERER_CREATE_SURFACE_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_CREATE_SURFACE_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.create.surface");
		}
		return Holder.SDL_PROP_RENDERER_CREATE_SURFACE_POINTER;
	}

	public static MemorySegment SDL_PROP_RENDERER_CREATE_OUTPUT_COLORSPACE_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_CREATE_OUTPUT_COLORSPACE_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.create.output_colorspace");
		}
		return Holder.SDL_PROP_RENDERER_CREATE_OUTPUT_COLORSPACE_NUMBER;
	}

	public static MemorySegment SDL_PROP_RENDERER_CREATE_PRESENT_VSYNC_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_CREATE_PRESENT_VSYNC_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.create.present_vsync");
		}
		return Holder.SDL_PROP_RENDERER_CREATE_PRESENT_VSYNC_NUMBER;
	}

	public static MemorySegment SDL_PROP_RENDERER_CREATE_GPU_DEVICE_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_CREATE_GPU_DEVICE_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.create.gpu.device");
		}
		return Holder.SDL_PROP_RENDERER_CREATE_GPU_DEVICE_POINTER;
	}

	public static MemorySegment SDL_PROP_RENDERER_CREATE_GPU_SHADERS_SPIRV_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_CREATE_GPU_SHADERS_SPIRV_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.create.gpu.shaders_spirv");
		}
		return Holder.SDL_PROP_RENDERER_CREATE_GPU_SHADERS_SPIRV_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_RENDERER_CREATE_GPU_SHADERS_DXIL_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_CREATE_GPU_SHADERS_DXIL_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.create.gpu.shaders_dxil");
		}
		return Holder.SDL_PROP_RENDERER_CREATE_GPU_SHADERS_DXIL_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_RENDERER_CREATE_GPU_SHADERS_MSL_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_CREATE_GPU_SHADERS_MSL_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.create.gpu.shaders_msl");
		}
		return Holder.SDL_PROP_RENDERER_CREATE_GPU_SHADERS_MSL_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_RENDERER_CREATE_VULKAN_INSTANCE_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_CREATE_VULKAN_INSTANCE_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.create.vulkan.instance");
		}
		return Holder.SDL_PROP_RENDERER_CREATE_VULKAN_INSTANCE_POINTER;
	}

	public static MemorySegment SDL_PROP_RENDERER_CREATE_VULKAN_SURFACE_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_CREATE_VULKAN_SURFACE_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.create.vulkan.surface");
		}
		return Holder.SDL_PROP_RENDERER_CREATE_VULKAN_SURFACE_NUMBER;
	}

	public static MemorySegment SDL_PROP_RENDERER_CREATE_VULKAN_PHYSICAL_DEVICE_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_CREATE_VULKAN_PHYSICAL_DEVICE_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.create.vulkan.physical_device");
		}
		return Holder.SDL_PROP_RENDERER_CREATE_VULKAN_PHYSICAL_DEVICE_POINTER;
	}

	public static MemorySegment SDL_PROP_RENDERER_CREATE_VULKAN_DEVICE_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_CREATE_VULKAN_DEVICE_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.create.vulkan.device");
		}
		return Holder.SDL_PROP_RENDERER_CREATE_VULKAN_DEVICE_POINTER;
	}

	public static MemorySegment SDL_PROP_RENDERER_CREATE_VULKAN_GRAPHICS_QUEUE_FAMILY_INDEX_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_CREATE_VULKAN_GRAPHICS_QUEUE_FAMILY_INDEX_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.create.vulkan.graphics_queue_family_index");
		}
		return Holder.SDL_PROP_RENDERER_CREATE_VULKAN_GRAPHICS_QUEUE_FAMILY_INDEX_NUMBER;
	}

	public static MemorySegment SDL_PROP_RENDERER_CREATE_VULKAN_PRESENT_QUEUE_FAMILY_INDEX_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_CREATE_VULKAN_PRESENT_QUEUE_FAMILY_INDEX_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.create.vulkan.present_queue_family_index");
		}
		return Holder.SDL_PROP_RENDERER_CREATE_VULKAN_PRESENT_QUEUE_FAMILY_INDEX_NUMBER;
	}

	public static MemorySegment SDL_PROP_RENDERER_NAME_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_NAME_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.name");
		}
		return Holder.SDL_PROP_RENDERER_NAME_STRING;
	}

	public static MemorySegment SDL_PROP_RENDERER_WINDOW_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_WINDOW_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.window");
		}
		return Holder.SDL_PROP_RENDERER_WINDOW_POINTER;
	}

	public static MemorySegment SDL_PROP_RENDERER_SURFACE_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_SURFACE_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.surface");
		}
		return Holder.SDL_PROP_RENDERER_SURFACE_POINTER;
	}

	public static MemorySegment SDL_PROP_RENDERER_VSYNC_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_VSYNC_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.vsync");
		}
		return Holder.SDL_PROP_RENDERER_VSYNC_NUMBER;
	}

	public static MemorySegment SDL_PROP_RENDERER_MAX_TEXTURE_SIZE_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_MAX_TEXTURE_SIZE_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.max_texture_size");
		}
		return Holder.SDL_PROP_RENDERER_MAX_TEXTURE_SIZE_NUMBER;
	}

	public static MemorySegment SDL_PROP_RENDERER_TEXTURE_FORMATS_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_TEXTURE_FORMATS_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.texture_formats");
		}
		return Holder.SDL_PROP_RENDERER_TEXTURE_FORMATS_POINTER;
	}

	public static MemorySegment SDL_PROP_RENDERER_TEXTURE_WRAPPING_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_TEXTURE_WRAPPING_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.texture_wrapping");
		}
		return Holder.SDL_PROP_RENDERER_TEXTURE_WRAPPING_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_RENDERER_OUTPUT_COLORSPACE_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_OUTPUT_COLORSPACE_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.output_colorspace");
		}
		return Holder.SDL_PROP_RENDERER_OUTPUT_COLORSPACE_NUMBER;
	}

	public static MemorySegment SDL_PROP_RENDERER_HDR_ENABLED_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_HDR_ENABLED_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.HDR_enabled");
		}
		return Holder.SDL_PROP_RENDERER_HDR_ENABLED_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_RENDERER_SDR_WHITE_POINT_FLOAT() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_SDR_WHITE_POINT_FLOAT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.SDR_white_point");
		}
		return Holder.SDL_PROP_RENDERER_SDR_WHITE_POINT_FLOAT;
	}

	public static MemorySegment SDL_PROP_RENDERER_HDR_HEADROOM_FLOAT() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_HDR_HEADROOM_FLOAT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.HDR_headroom");
		}
		return Holder.SDL_PROP_RENDERER_HDR_HEADROOM_FLOAT;
	}

	public static MemorySegment SDL_PROP_RENDERER_D3D9_DEVICE_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_D3D9_DEVICE_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.d3d9.device");
		}
		return Holder.SDL_PROP_RENDERER_D3D9_DEVICE_POINTER;
	}

	public static MemorySegment SDL_PROP_RENDERER_D3D11_DEVICE_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_D3D11_DEVICE_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.d3d11.device");
		}
		return Holder.SDL_PROP_RENDERER_D3D11_DEVICE_POINTER;
	}

	public static MemorySegment SDL_PROP_RENDERER_D3D11_SWAPCHAIN_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_D3D11_SWAPCHAIN_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.d3d11.swap_chain");
		}
		return Holder.SDL_PROP_RENDERER_D3D11_SWAPCHAIN_POINTER;
	}

	public static MemorySegment SDL_PROP_RENDERER_D3D12_DEVICE_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_D3D12_DEVICE_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.d3d12.device");
		}
		return Holder.SDL_PROP_RENDERER_D3D12_DEVICE_POINTER;
	}

	public static MemorySegment SDL_PROP_RENDERER_D3D12_SWAPCHAIN_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_D3D12_SWAPCHAIN_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.d3d12.swap_chain");
		}
		return Holder.SDL_PROP_RENDERER_D3D12_SWAPCHAIN_POINTER;
	}

	public static MemorySegment SDL_PROP_RENDERER_D3D12_COMMAND_QUEUE_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_D3D12_COMMAND_QUEUE_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.d3d12.command_queue");
		}
		return Holder.SDL_PROP_RENDERER_D3D12_COMMAND_QUEUE_POINTER;
	}

	public static MemorySegment SDL_PROP_RENDERER_VULKAN_INSTANCE_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_VULKAN_INSTANCE_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.vulkan.instance");
		}
		return Holder.SDL_PROP_RENDERER_VULKAN_INSTANCE_POINTER;
	}

	public static MemorySegment SDL_PROP_RENDERER_VULKAN_SURFACE_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_VULKAN_SURFACE_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.vulkan.surface");
		}
		return Holder.SDL_PROP_RENDERER_VULKAN_SURFACE_NUMBER;
	}

	public static MemorySegment SDL_PROP_RENDERER_VULKAN_PHYSICAL_DEVICE_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_VULKAN_PHYSICAL_DEVICE_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.vulkan.physical_device");
		}
		return Holder.SDL_PROP_RENDERER_VULKAN_PHYSICAL_DEVICE_POINTER;
	}

	public static MemorySegment SDL_PROP_RENDERER_VULKAN_DEVICE_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_VULKAN_DEVICE_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.vulkan.device");
		}
		return Holder.SDL_PROP_RENDERER_VULKAN_DEVICE_POINTER;
	}

	public static MemorySegment SDL_PROP_RENDERER_VULKAN_GRAPHICS_QUEUE_FAMILY_INDEX_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_VULKAN_GRAPHICS_QUEUE_FAMILY_INDEX_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.vulkan.graphics_queue_family_index");
		}
		return Holder.SDL_PROP_RENDERER_VULKAN_GRAPHICS_QUEUE_FAMILY_INDEX_NUMBER;
	}

	public static MemorySegment SDL_PROP_RENDERER_VULKAN_PRESENT_QUEUE_FAMILY_INDEX_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_VULKAN_PRESENT_QUEUE_FAMILY_INDEX_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.vulkan.present_queue_family_index");
		}
		return Holder.SDL_PROP_RENDERER_VULKAN_PRESENT_QUEUE_FAMILY_INDEX_NUMBER;
	}

	public static MemorySegment SDL_PROP_RENDERER_VULKAN_SWAPCHAIN_IMAGE_COUNT_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_VULKAN_SWAPCHAIN_IMAGE_COUNT_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.vulkan.swapchain_image_count");
		}
		return Holder.SDL_PROP_RENDERER_VULKAN_SWAPCHAIN_IMAGE_COUNT_NUMBER;
	}

	public static MemorySegment SDL_PROP_RENDERER_GPU_DEVICE_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_RENDERER_GPU_DEVICE_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.renderer.gpu.device");
		}
		return Holder.SDL_PROP_RENDERER_GPU_DEVICE_POINTER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_CREATE_COLORSPACE_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_CREATE_COLORSPACE_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.create.colorspace");
		}
		return Holder.SDL_PROP_TEXTURE_CREATE_COLORSPACE_NUMBER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_CREATE_FORMAT_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_CREATE_FORMAT_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.create.format");
		}
		return Holder.SDL_PROP_TEXTURE_CREATE_FORMAT_NUMBER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_CREATE_ACCESS_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_CREATE_ACCESS_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.create.access");
		}
		return Holder.SDL_PROP_TEXTURE_CREATE_ACCESS_NUMBER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_CREATE_WIDTH_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_CREATE_WIDTH_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.create.width");
		}
		return Holder.SDL_PROP_TEXTURE_CREATE_WIDTH_NUMBER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_CREATE_HEIGHT_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_CREATE_HEIGHT_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.create.height");
		}
		return Holder.SDL_PROP_TEXTURE_CREATE_HEIGHT_NUMBER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_CREATE_PALETTE_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_CREATE_PALETTE_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.create.palette");
		}
		return Holder.SDL_PROP_TEXTURE_CREATE_PALETTE_POINTER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_CREATE_SDR_WHITE_POINT_FLOAT() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_CREATE_SDR_WHITE_POINT_FLOAT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.create.SDR_white_point");
		}
		return Holder.SDL_PROP_TEXTURE_CREATE_SDR_WHITE_POINT_FLOAT;
	}

	public static MemorySegment SDL_PROP_TEXTURE_CREATE_HDR_HEADROOM_FLOAT() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_CREATE_HDR_HEADROOM_FLOAT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.create.HDR_headroom");
		}
		return Holder.SDL_PROP_TEXTURE_CREATE_HDR_HEADROOM_FLOAT;
	}

	public static MemorySegment SDL_PROP_TEXTURE_CREATE_D3D11_TEXTURE_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_CREATE_D3D11_TEXTURE_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.create.d3d11.texture");
		}
		return Holder.SDL_PROP_TEXTURE_CREATE_D3D11_TEXTURE_POINTER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_CREATE_D3D11_TEXTURE_U_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_CREATE_D3D11_TEXTURE_U_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.create.d3d11.texture_u");
		}
		return Holder.SDL_PROP_TEXTURE_CREATE_D3D11_TEXTURE_U_POINTER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_CREATE_D3D11_TEXTURE_V_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_CREATE_D3D11_TEXTURE_V_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.create.d3d11.texture_v");
		}
		return Holder.SDL_PROP_TEXTURE_CREATE_D3D11_TEXTURE_V_POINTER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_CREATE_D3D12_TEXTURE_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_CREATE_D3D12_TEXTURE_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.create.d3d12.texture");
		}
		return Holder.SDL_PROP_TEXTURE_CREATE_D3D12_TEXTURE_POINTER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_CREATE_D3D12_TEXTURE_U_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_CREATE_D3D12_TEXTURE_U_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.create.d3d12.texture_u");
		}
		return Holder.SDL_PROP_TEXTURE_CREATE_D3D12_TEXTURE_U_POINTER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_CREATE_D3D12_TEXTURE_V_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_CREATE_D3D12_TEXTURE_V_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.create.d3d12.texture_v");
		}
		return Holder.SDL_PROP_TEXTURE_CREATE_D3D12_TEXTURE_V_POINTER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_CREATE_METAL_PIXELBUFFER_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_CREATE_METAL_PIXELBUFFER_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.create.metal.pixelbuffer");
		}
		return Holder.SDL_PROP_TEXTURE_CREATE_METAL_PIXELBUFFER_POINTER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_CREATE_OPENGL_TEXTURE_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_CREATE_OPENGL_TEXTURE_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.create.opengl.texture");
		}
		return Holder.SDL_PROP_TEXTURE_CREATE_OPENGL_TEXTURE_NUMBER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_CREATE_OPENGL_TEXTURE_UV_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_CREATE_OPENGL_TEXTURE_UV_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.create.opengl.texture_uv");
		}
		return Holder.SDL_PROP_TEXTURE_CREATE_OPENGL_TEXTURE_UV_NUMBER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_CREATE_OPENGL_TEXTURE_U_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_CREATE_OPENGL_TEXTURE_U_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.create.opengl.texture_u");
		}
		return Holder.SDL_PROP_TEXTURE_CREATE_OPENGL_TEXTURE_U_NUMBER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_CREATE_OPENGL_TEXTURE_V_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_CREATE_OPENGL_TEXTURE_V_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.create.opengl.texture_v");
		}
		return Holder.SDL_PROP_TEXTURE_CREATE_OPENGL_TEXTURE_V_NUMBER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_CREATE_OPENGLES2_TEXTURE_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_CREATE_OPENGLES2_TEXTURE_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.create.opengles2.texture");
		}
		return Holder.SDL_PROP_TEXTURE_CREATE_OPENGLES2_TEXTURE_NUMBER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_CREATE_OPENGLES2_TEXTURE_UV_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_CREATE_OPENGLES2_TEXTURE_UV_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.create.opengles2.texture_uv");
		}
		return Holder.SDL_PROP_TEXTURE_CREATE_OPENGLES2_TEXTURE_UV_NUMBER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_CREATE_OPENGLES2_TEXTURE_U_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_CREATE_OPENGLES2_TEXTURE_U_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.create.opengles2.texture_u");
		}
		return Holder.SDL_PROP_TEXTURE_CREATE_OPENGLES2_TEXTURE_U_NUMBER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_CREATE_OPENGLES2_TEXTURE_V_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_CREATE_OPENGLES2_TEXTURE_V_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.create.opengles2.texture_v");
		}
		return Holder.SDL_PROP_TEXTURE_CREATE_OPENGLES2_TEXTURE_V_NUMBER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_CREATE_VULKAN_TEXTURE_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_CREATE_VULKAN_TEXTURE_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.create.vulkan.texture");
		}
		return Holder.SDL_PROP_TEXTURE_CREATE_VULKAN_TEXTURE_NUMBER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_CREATE_VULKAN_LAYOUT_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_CREATE_VULKAN_LAYOUT_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.create.vulkan.layout");
		}
		return Holder.SDL_PROP_TEXTURE_CREATE_VULKAN_LAYOUT_NUMBER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_CREATE_GPU_TEXTURE_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_CREATE_GPU_TEXTURE_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.create.gpu.texture");
		}
		return Holder.SDL_PROP_TEXTURE_CREATE_GPU_TEXTURE_POINTER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_CREATE_GPU_TEXTURE_UV_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_CREATE_GPU_TEXTURE_UV_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.create.gpu.texture_uv");
		}
		return Holder.SDL_PROP_TEXTURE_CREATE_GPU_TEXTURE_UV_POINTER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_CREATE_GPU_TEXTURE_U_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_CREATE_GPU_TEXTURE_U_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.create.gpu.texture_u");
		}
		return Holder.SDL_PROP_TEXTURE_CREATE_GPU_TEXTURE_U_POINTER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_CREATE_GPU_TEXTURE_V_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_CREATE_GPU_TEXTURE_V_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.create.gpu.texture_v");
		}
		return Holder.SDL_PROP_TEXTURE_CREATE_GPU_TEXTURE_V_POINTER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_COLORSPACE_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_COLORSPACE_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.colorspace");
		}
		return Holder.SDL_PROP_TEXTURE_COLORSPACE_NUMBER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_FORMAT_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_FORMAT_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.format");
		}
		return Holder.SDL_PROP_TEXTURE_FORMAT_NUMBER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_ACCESS_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_ACCESS_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.access");
		}
		return Holder.SDL_PROP_TEXTURE_ACCESS_NUMBER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_WIDTH_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_WIDTH_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.width");
		}
		return Holder.SDL_PROP_TEXTURE_WIDTH_NUMBER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_HEIGHT_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_HEIGHT_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.height");
		}
		return Holder.SDL_PROP_TEXTURE_HEIGHT_NUMBER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_SDR_WHITE_POINT_FLOAT() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_SDR_WHITE_POINT_FLOAT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.SDR_white_point");
		}
		return Holder.SDL_PROP_TEXTURE_SDR_WHITE_POINT_FLOAT;
	}

	public static MemorySegment SDL_PROP_TEXTURE_HDR_HEADROOM_FLOAT() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_HDR_HEADROOM_FLOAT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.HDR_headroom");
		}
		return Holder.SDL_PROP_TEXTURE_HDR_HEADROOM_FLOAT;
	}

	public static MemorySegment SDL_PROP_TEXTURE_D3D11_TEXTURE_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_D3D11_TEXTURE_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.d3d11.texture");
		}
		return Holder.SDL_PROP_TEXTURE_D3D11_TEXTURE_POINTER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_D3D11_TEXTURE_U_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_D3D11_TEXTURE_U_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.d3d11.texture_u");
		}
		return Holder.SDL_PROP_TEXTURE_D3D11_TEXTURE_U_POINTER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_D3D11_TEXTURE_V_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_D3D11_TEXTURE_V_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.d3d11.texture_v");
		}
		return Holder.SDL_PROP_TEXTURE_D3D11_TEXTURE_V_POINTER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_D3D12_TEXTURE_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_D3D12_TEXTURE_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.d3d12.texture");
		}
		return Holder.SDL_PROP_TEXTURE_D3D12_TEXTURE_POINTER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_D3D12_TEXTURE_U_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_D3D12_TEXTURE_U_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.d3d12.texture_u");
		}
		return Holder.SDL_PROP_TEXTURE_D3D12_TEXTURE_U_POINTER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_D3D12_TEXTURE_V_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_D3D12_TEXTURE_V_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.d3d12.texture_v");
		}
		return Holder.SDL_PROP_TEXTURE_D3D12_TEXTURE_V_POINTER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_OPENGL_TEXTURE_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_OPENGL_TEXTURE_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.opengl.texture");
		}
		return Holder.SDL_PROP_TEXTURE_OPENGL_TEXTURE_NUMBER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_OPENGL_TEXTURE_UV_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_OPENGL_TEXTURE_UV_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.opengl.texture_uv");
		}
		return Holder.SDL_PROP_TEXTURE_OPENGL_TEXTURE_UV_NUMBER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_OPENGL_TEXTURE_U_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_OPENGL_TEXTURE_U_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.opengl.texture_u");
		}
		return Holder.SDL_PROP_TEXTURE_OPENGL_TEXTURE_U_NUMBER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_OPENGL_TEXTURE_V_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_OPENGL_TEXTURE_V_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.opengl.texture_v");
		}
		return Holder.SDL_PROP_TEXTURE_OPENGL_TEXTURE_V_NUMBER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_OPENGL_TEXTURE_TARGET_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_OPENGL_TEXTURE_TARGET_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.opengl.target");
		}
		return Holder.SDL_PROP_TEXTURE_OPENGL_TEXTURE_TARGET_NUMBER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_OPENGL_TEX_W_FLOAT() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_OPENGL_TEX_W_FLOAT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.opengl.tex_w");
		}
		return Holder.SDL_PROP_TEXTURE_OPENGL_TEX_W_FLOAT;
	}

	public static MemorySegment SDL_PROP_TEXTURE_OPENGL_TEX_H_FLOAT() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_OPENGL_TEX_H_FLOAT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.opengl.tex_h");
		}
		return Holder.SDL_PROP_TEXTURE_OPENGL_TEX_H_FLOAT;
	}

	public static MemorySegment SDL_PROP_TEXTURE_OPENGLES2_TEXTURE_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_OPENGLES2_TEXTURE_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.opengles2.texture");
		}
		return Holder.SDL_PROP_TEXTURE_OPENGLES2_TEXTURE_NUMBER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_OPENGLES2_TEXTURE_UV_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_OPENGLES2_TEXTURE_UV_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.opengles2.texture_uv");
		}
		return Holder.SDL_PROP_TEXTURE_OPENGLES2_TEXTURE_UV_NUMBER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_OPENGLES2_TEXTURE_U_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_OPENGLES2_TEXTURE_U_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.opengles2.texture_u");
		}
		return Holder.SDL_PROP_TEXTURE_OPENGLES2_TEXTURE_U_NUMBER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_OPENGLES2_TEXTURE_V_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_OPENGLES2_TEXTURE_V_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.opengles2.texture_v");
		}
		return Holder.SDL_PROP_TEXTURE_OPENGLES2_TEXTURE_V_NUMBER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_OPENGLES2_TEXTURE_TARGET_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_OPENGLES2_TEXTURE_TARGET_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.opengles2.target");
		}
		return Holder.SDL_PROP_TEXTURE_OPENGLES2_TEXTURE_TARGET_NUMBER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_VULKAN_TEXTURE_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_VULKAN_TEXTURE_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.vulkan.texture");
		}
		return Holder.SDL_PROP_TEXTURE_VULKAN_TEXTURE_NUMBER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_GPU_TEXTURE_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_GPU_TEXTURE_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.gpu.texture");
		}
		return Holder.SDL_PROP_TEXTURE_GPU_TEXTURE_POINTER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_GPU_TEXTURE_UV_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_GPU_TEXTURE_UV_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.gpu.texture_uv");
		}
		return Holder.SDL_PROP_TEXTURE_GPU_TEXTURE_UV_POINTER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_GPU_TEXTURE_U_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_GPU_TEXTURE_U_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.gpu.texture_u");
		}
		return Holder.SDL_PROP_TEXTURE_GPU_TEXTURE_U_POINTER;
	}

	public static MemorySegment SDL_PROP_TEXTURE_GPU_TEXTURE_V_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_TEXTURE_GPU_TEXTURE_V_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.texture.gpu.texture_v");
		}
		return Holder.SDL_PROP_TEXTURE_GPU_TEXTURE_V_POINTER;
	}

	private static final int SDL_RENDERER_VSYNC_ADAPTIVE = (int) -1L;

	public static int SDL_RENDERER_VSYNC_ADAPTIVE() {
		return SDL_RENDERER_VSYNC_ADAPTIVE;
	}

	private static final long SDL_NS_PER_SECOND = 1000000000L;

	public static long SDL_NS_PER_SECOND() {
		return SDL_NS_PER_SECOND;
	}

	private static final int SDL_TRAYENTRY_BUTTON = (int) 1L;

	public static int SDL_TRAYENTRY_BUTTON() {
		return SDL_TRAYENTRY_BUTTON;
	}

	private static final int SDL_TRAYENTRY_CHECKBOX = (int) 2L;

	public static int SDL_TRAYENTRY_CHECKBOX() {
		return SDL_TRAYENTRY_CHECKBOX;
	}

	private static final int SDL_TRAYENTRY_SUBMENU = (int) 4L;

	public static int SDL_TRAYENTRY_SUBMENU() {
		return SDL_TRAYENTRY_SUBMENU;
	}

	private static final int SDL_TRAYENTRY_DISABLED = (int) 2147483648L;

	public static int SDL_TRAYENTRY_DISABLED() {
		return SDL_TRAYENTRY_DISABLED;
	}

	private static final int SDL_TRAYENTRY_CHECKED = (int) 1073741824L;

	public static int SDL_TRAYENTRY_CHECKED() {
		return SDL_TRAYENTRY_CHECKED;
	}

	private static final int SDL_VERSION = (int) 3004018L;

	public static int SDL_VERSION() {
		return SDL_VERSION;
	}
}
