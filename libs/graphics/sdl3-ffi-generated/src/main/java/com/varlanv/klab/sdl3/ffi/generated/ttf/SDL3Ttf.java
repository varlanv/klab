package com.varlanv.klab.sdl3.ffi.generated.ttf;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.OfInt;

public class SDL3Ttf extends SDL3Ttf$shared {

	SDL3Ttf() {
	}

	static final Arena LIBRARY_ARENA = Arena.ofAuto();

	static final SymbolLookup SYMBOL_LOOKUP = SymbolLookup.libraryLookup("libSDL3_ttf.so.0", LIBRARY_ARENA)
			.or(SymbolLookup.loaderLookup())
			.or(Linker.nativeLinker().defaultLookup());

	private static final int SDL_TTF_MAJOR_VERSION = (int) 3L;

	public static int SDL_TTF_MAJOR_VERSION() {
		return SDL_TTF_MAJOR_VERSION;
	}

	private static final int SDL_TTF_MINOR_VERSION = (int) 2L;

	public static int SDL_TTF_MINOR_VERSION() {
		return SDL_TTF_MINOR_VERSION;
	}

	private static final int SDL_TTF_MICRO_VERSION = (int) 2L;

	public static int SDL_TTF_MICRO_VERSION() {
		return SDL_TTF_MICRO_VERSION;
	}

	private static final int TTF_STYLE_NORMAL = (int) 0L;

	public static int TTF_STYLE_NORMAL() {
		return TTF_STYLE_NORMAL;
	}

	private static final int TTF_STYLE_BOLD = (int) 1L;

	public static int TTF_STYLE_BOLD() {
		return TTF_STYLE_BOLD;
	}

	private static final int TTF_STYLE_ITALIC = (int) 2L;

	public static int TTF_STYLE_ITALIC() {
		return TTF_STYLE_ITALIC;
	}

	private static final int TTF_STYLE_UNDERLINE = (int) 4L;

	public static int TTF_STYLE_UNDERLINE() {
		return TTF_STYLE_UNDERLINE;
	}

	private static final int TTF_STYLE_STRIKETHROUGH = (int) 8L;

	public static int TTF_STYLE_STRIKETHROUGH() {
		return TTF_STYLE_STRIKETHROUGH;
	}

	private static final int TTF_FONT_WEIGHT_THIN = (int) 100L;

	public static int TTF_FONT_WEIGHT_THIN() {
		return TTF_FONT_WEIGHT_THIN;
	}

	private static final int TTF_FONT_WEIGHT_EXTRA_LIGHT = (int) 200L;

	public static int TTF_FONT_WEIGHT_EXTRA_LIGHT() {
		return TTF_FONT_WEIGHT_EXTRA_LIGHT;
	}

	private static final int TTF_FONT_WEIGHT_LIGHT = (int) 300L;

	public static int TTF_FONT_WEIGHT_LIGHT() {
		return TTF_FONT_WEIGHT_LIGHT;
	}

	private static final int TTF_FONT_WEIGHT_NORMAL = (int) 400L;

	public static int TTF_FONT_WEIGHT_NORMAL() {
		return TTF_FONT_WEIGHT_NORMAL;
	}

	private static final int TTF_FONT_WEIGHT_MEDIUM = (int) 500L;

	public static int TTF_FONT_WEIGHT_MEDIUM() {
		return TTF_FONT_WEIGHT_MEDIUM;
	}

	private static final int TTF_FONT_WEIGHT_SEMI_BOLD = (int) 600L;

	public static int TTF_FONT_WEIGHT_SEMI_BOLD() {
		return TTF_FONT_WEIGHT_SEMI_BOLD;
	}

	private static final int TTF_FONT_WEIGHT_BOLD = (int) 700L;

	public static int TTF_FONT_WEIGHT_BOLD() {
		return TTF_FONT_WEIGHT_BOLD;
	}

	private static final int TTF_FONT_WEIGHT_EXTRA_BOLD = (int) 800L;

	public static int TTF_FONT_WEIGHT_EXTRA_BOLD() {
		return TTF_FONT_WEIGHT_EXTRA_BOLD;
	}

	private static final int TTF_FONT_WEIGHT_BLACK = (int) 900L;

	public static int TTF_FONT_WEIGHT_BLACK() {
		return TTF_FONT_WEIGHT_BLACK;
	}

	private static final int TTF_FONT_WEIGHT_EXTRA_BLACK = (int) 950L;

	public static int TTF_FONT_WEIGHT_EXTRA_BLACK() {
		return TTF_FONT_WEIGHT_EXTRA_BLACK;
	}

	private static final int TTF_SUBSTRING_DIRECTION_MASK = (int) 255L;

	public static int TTF_SUBSTRING_DIRECTION_MASK() {
		return TTF_SUBSTRING_DIRECTION_MASK;
	}

	private static final int TTF_SUBSTRING_TEXT_START = (int) 256L;

	public static int TTF_SUBSTRING_TEXT_START() {
		return TTF_SUBSTRING_TEXT_START;
	}

	private static final int TTF_SUBSTRING_LINE_START = (int) 512L;

	public static int TTF_SUBSTRING_LINE_START() {
		return TTF_SUBSTRING_LINE_START;
	}

	private static final int TTF_SUBSTRING_LINE_END = (int) 1024L;

	public static int TTF_SUBSTRING_LINE_END() {
		return TTF_SUBSTRING_LINE_END;
	}

	private static final int TTF_SUBSTRING_TEXT_END = (int) 2048L;

	public static int TTF_SUBSTRING_TEXT_END() {
		return TTF_SUBSTRING_TEXT_END;
	}

	private static class TTF_Version {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_INT);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_Version");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_Version$descriptor() {
		return TTF_Version.DESC;
	}

	public static MethodHandle TTF_Version$handle() {
		return TTF_Version.HANDLE;
	}

	public static MemorySegment TTF_Version$address() {
		return TTF_Version.ADDR;
	}

	public static int TTF_Version() {
		var mh$ = TTF_Version.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_Version");
			}
			return (int) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetFreeTypeVersion {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetFreeTypeVersion");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetFreeTypeVersion$descriptor() {
		return TTF_GetFreeTypeVersion.DESC;
	}

	public static MethodHandle TTF_GetFreeTypeVersion$handle() {
		return TTF_GetFreeTypeVersion.HANDLE;
	}

	public static MemorySegment TTF_GetFreeTypeVersion$address() {
		return TTF_GetFreeTypeVersion.ADDR;
	}

	public static void TTF_GetFreeTypeVersion(MemorySegment major, MemorySegment minor, MemorySegment patch) {
		var mh$ = TTF_GetFreeTypeVersion.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetFreeTypeVersion", major, minor, patch);
			}
			mh$.invokeExact(major, minor, patch);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetHarfBuzzVersion {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetHarfBuzzVersion");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetHarfBuzzVersion$descriptor() {
		return TTF_GetHarfBuzzVersion.DESC;
	}

	public static MethodHandle TTF_GetHarfBuzzVersion$handle() {
		return TTF_GetHarfBuzzVersion.HANDLE;
	}

	public static MemorySegment TTF_GetHarfBuzzVersion$address() {
		return TTF_GetHarfBuzzVersion.ADDR;
	}

	public static void TTF_GetHarfBuzzVersion(MemorySegment major, MemorySegment minor, MemorySegment patch) {
		var mh$ = TTF_GetHarfBuzzVersion.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetHarfBuzzVersion", major, minor, patch);
			}
			mh$.invokeExact(major, minor, patch);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_Init {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_Init");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_Init$descriptor() {
		return TTF_Init.DESC;
	}

	public static MethodHandle TTF_Init$handle() {
		return TTF_Init.HANDLE;
	}

	public static MemorySegment TTF_Init$address() {
		return TTF_Init.ADDR;
	}

	public static boolean TTF_Init() {
		var mh$ = TTF_Init.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_Init");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_OpenFont {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_OpenFont");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_OpenFont$descriptor() {
		return TTF_OpenFont.DESC;
	}

	public static MethodHandle TTF_OpenFont$handle() {
		return TTF_OpenFont.HANDLE;
	}

	public static MemorySegment TTF_OpenFont$address() {
		return TTF_OpenFont.ADDR;
	}

	public static MemorySegment TTF_OpenFont(MemorySegment file, float ptsize) {
		var mh$ = TTF_OpenFont.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_OpenFont", file, ptsize);
			}
			return (MemorySegment) mh$.invokeExact(file, ptsize);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_OpenFontIO {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_OpenFontIO");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_OpenFontIO$descriptor() {
		return TTF_OpenFontIO.DESC;
	}

	public static MethodHandle TTF_OpenFontIO$handle() {
		return TTF_OpenFontIO.HANDLE;
	}

	public static MemorySegment TTF_OpenFontIO$address() {
		return TTF_OpenFontIO.ADDR;
	}

	public static MemorySegment TTF_OpenFontIO(MemorySegment src, boolean closeio, float ptsize) {
		var mh$ = TTF_OpenFontIO.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_OpenFontIO", src, closeio, ptsize);
			}
			return (MemorySegment) mh$.invokeExact(src, closeio, ptsize);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_OpenFontWithProperties {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_OpenFontWithProperties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_OpenFontWithProperties$descriptor() {
		return TTF_OpenFontWithProperties.DESC;
	}

	public static MethodHandle TTF_OpenFontWithProperties$handle() {
		return TTF_OpenFontWithProperties.HANDLE;
	}

	public static MemorySegment TTF_OpenFontWithProperties$address() {
		return TTF_OpenFontWithProperties.ADDR;
	}

	public static MemorySegment TTF_OpenFontWithProperties(int props) {
		var mh$ = TTF_OpenFontWithProperties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_OpenFontWithProperties", props);
			}
			return (MemorySegment) mh$.invokeExact(props);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_CopyFont {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_CopyFont");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_CopyFont$descriptor() {
		return TTF_CopyFont.DESC;
	}

	public static MethodHandle TTF_CopyFont$handle() {
		return TTF_CopyFont.HANDLE;
	}

	public static MemorySegment TTF_CopyFont$address() {
		return TTF_CopyFont.ADDR;
	}

	public static MemorySegment TTF_CopyFont(MemorySegment existing_font) {
		var mh$ = TTF_CopyFont.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_CopyFont", existing_font);
			}
			return (MemorySegment) mh$.invokeExact(existing_font);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetFontProperties {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_INT,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetFontProperties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetFontProperties$descriptor() {
		return TTF_GetFontProperties.DESC;
	}

	public static MethodHandle TTF_GetFontProperties$handle() {
		return TTF_GetFontProperties.HANDLE;
	}

	public static MemorySegment TTF_GetFontProperties$address() {
		return TTF_GetFontProperties.ADDR;
	}

	public static int TTF_GetFontProperties(MemorySegment font) {
		var mh$ = TTF_GetFontProperties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetFontProperties", font);
			}
			return (int) mh$.invokeExact(font);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetFontGeneration {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_INT,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetFontGeneration");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetFontGeneration$descriptor() {
		return TTF_GetFontGeneration.DESC;
	}

	public static MethodHandle TTF_GetFontGeneration$handle() {
		return TTF_GetFontGeneration.HANDLE;
	}

	public static MemorySegment TTF_GetFontGeneration$address() {
		return TTF_GetFontGeneration.ADDR;
	}

	public static int TTF_GetFontGeneration(MemorySegment font) {
		var mh$ = TTF_GetFontGeneration.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetFontGeneration", font);
			}
			return (int) mh$.invokeExact(font);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_AddFallbackFont {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_AddFallbackFont");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_AddFallbackFont$descriptor() {
		return TTF_AddFallbackFont.DESC;
	}

	public static MethodHandle TTF_AddFallbackFont$handle() {
		return TTF_AddFallbackFont.HANDLE;
	}

	public static MemorySegment TTF_AddFallbackFont$address() {
		return TTF_AddFallbackFont.ADDR;
	}

	public static boolean TTF_AddFallbackFont(MemorySegment font, MemorySegment fallback) {
		var mh$ = TTF_AddFallbackFont.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_AddFallbackFont", font, fallback);
			}
			return (boolean) mh$.invokeExact(font, fallback);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_RemoveFallbackFont {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_RemoveFallbackFont");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_RemoveFallbackFont$descriptor() {
		return TTF_RemoveFallbackFont.DESC;
	}

	public static MethodHandle TTF_RemoveFallbackFont$handle() {
		return TTF_RemoveFallbackFont.HANDLE;
	}

	public static MemorySegment TTF_RemoveFallbackFont$address() {
		return TTF_RemoveFallbackFont.ADDR;
	}

	public static void TTF_RemoveFallbackFont(MemorySegment font, MemorySegment fallback) {
		var mh$ = TTF_RemoveFallbackFont.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_RemoveFallbackFont", font, fallback);
			}
			mh$.invokeExact(font, fallback);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_ClearFallbackFonts {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_ClearFallbackFonts");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_ClearFallbackFonts$descriptor() {
		return TTF_ClearFallbackFonts.DESC;
	}

	public static MethodHandle TTF_ClearFallbackFonts$handle() {
		return TTF_ClearFallbackFonts.HANDLE;
	}

	public static MemorySegment TTF_ClearFallbackFonts$address() {
		return TTF_ClearFallbackFonts.ADDR;
	}

	public static void TTF_ClearFallbackFonts(MemorySegment font) {
		var mh$ = TTF_ClearFallbackFonts.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_ClearFallbackFonts", font);
			}
			mh$.invokeExact(font);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_SetFontSize {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_SetFontSize");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_SetFontSize$descriptor() {
		return TTF_SetFontSize.DESC;
	}

	public static MethodHandle TTF_SetFontSize$handle() {
		return TTF_SetFontSize.HANDLE;
	}

	public static MemorySegment TTF_SetFontSize$address() {
		return TTF_SetFontSize.ADDR;
	}

	public static boolean TTF_SetFontSize(MemorySegment font, float ptsize) {
		var mh$ = TTF_SetFontSize.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_SetFontSize", font, ptsize);
			}
			return (boolean) mh$.invokeExact(font, ptsize);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_SetFontSizeDPI {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_FLOAT,
				SDL3Ttf.C_INT,
				SDL3Ttf.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_SetFontSizeDPI");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_SetFontSizeDPI$descriptor() {
		return TTF_SetFontSizeDPI.DESC;
	}

	public static MethodHandle TTF_SetFontSizeDPI$handle() {
		return TTF_SetFontSizeDPI.HANDLE;
	}

	public static MemorySegment TTF_SetFontSizeDPI$address() {
		return TTF_SetFontSizeDPI.ADDR;
	}

	public static boolean TTF_SetFontSizeDPI(MemorySegment font, float ptsize, int hdpi, int vdpi) {
		var mh$ = TTF_SetFontSizeDPI.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_SetFontSizeDPI", font, ptsize, hdpi, vdpi);
			}
			return (boolean) mh$.invokeExact(font, ptsize, hdpi, vdpi);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetFontSize {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_FLOAT,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetFontSize");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetFontSize$descriptor() {
		return TTF_GetFontSize.DESC;
	}

	public static MethodHandle TTF_GetFontSize$handle() {
		return TTF_GetFontSize.HANDLE;
	}

	public static MemorySegment TTF_GetFontSize$address() {
		return TTF_GetFontSize.ADDR;
	}

	public static float TTF_GetFontSize(MemorySegment font) {
		var mh$ = TTF_GetFontSize.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetFontSize", font);
			}
			return (float) mh$.invokeExact(font);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetFontDPI {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetFontDPI");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetFontDPI$descriptor() {
		return TTF_GetFontDPI.DESC;
	}

	public static MethodHandle TTF_GetFontDPI$handle() {
		return TTF_GetFontDPI.HANDLE;
	}

	public static MemorySegment TTF_GetFontDPI$address() {
		return TTF_GetFontDPI.ADDR;
	}

	public static boolean TTF_GetFontDPI(MemorySegment font, MemorySegment hdpi, MemorySegment vdpi) {
		var mh$ = TTF_GetFontDPI.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetFontDPI", font, hdpi, vdpi);
			}
			return (boolean) mh$.invokeExact(font, hdpi, vdpi);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	public static OfInt TTF_FontStyleFlags = SDL3Ttf.C_INT;

	private static class TTF_SetFontStyle {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_SetFontStyle");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_SetFontStyle$descriptor() {
		return TTF_SetFontStyle.DESC;
	}

	public static MethodHandle TTF_SetFontStyle$handle() {
		return TTF_SetFontStyle.HANDLE;
	}

	public static MemorySegment TTF_SetFontStyle$address() {
		return TTF_SetFontStyle.ADDR;
	}

	public static void TTF_SetFontStyle(MemorySegment font, int style) {
		var mh$ = TTF_SetFontStyle.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_SetFontStyle", font, style);
			}
			mh$.invokeExact(font, style);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetFontStyle {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_INT,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetFontStyle");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetFontStyle$descriptor() {
		return TTF_GetFontStyle.DESC;
	}

	public static MethodHandle TTF_GetFontStyle$handle() {
		return TTF_GetFontStyle.HANDLE;
	}

	public static MemorySegment TTF_GetFontStyle$address() {
		return TTF_GetFontStyle.ADDR;
	}

	public static int TTF_GetFontStyle(MemorySegment font) {
		var mh$ = TTF_GetFontStyle.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetFontStyle", font);
			}
			return (int) mh$.invokeExact(font);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_SetFontOutline {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_SetFontOutline");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_SetFontOutline$descriptor() {
		return TTF_SetFontOutline.DESC;
	}

	public static MethodHandle TTF_SetFontOutline$handle() {
		return TTF_SetFontOutline.HANDLE;
	}

	public static MemorySegment TTF_SetFontOutline$address() {
		return TTF_SetFontOutline.ADDR;
	}

	public static boolean TTF_SetFontOutline(MemorySegment font, int outline) {
		var mh$ = TTF_SetFontOutline.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_SetFontOutline", font, outline);
			}
			return (boolean) mh$.invokeExact(font, outline);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetFontOutline {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_INT,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetFontOutline");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetFontOutline$descriptor() {
		return TTF_GetFontOutline.DESC;
	}

	public static MethodHandle TTF_GetFontOutline$handle() {
		return TTF_GetFontOutline.HANDLE;
	}

	public static MemorySegment TTF_GetFontOutline$address() {
		return TTF_GetFontOutline.ADDR;
	}

	public static int TTF_GetFontOutline(MemorySegment font) {
		var mh$ = TTF_GetFontOutline.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetFontOutline", font);
			}
			return (int) mh$.invokeExact(font);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static final int TTF_HINTING_INVALID = (int) -1L;

	public static int TTF_HINTING_INVALID() {
		return TTF_HINTING_INVALID;
	}

	private static final int TTF_HINTING_NORMAL = (int) 0L;

	public static int TTF_HINTING_NORMAL() {
		return TTF_HINTING_NORMAL;
	}

	private static final int TTF_HINTING_LIGHT = (int) 1L;

	public static int TTF_HINTING_LIGHT() {
		return TTF_HINTING_LIGHT;
	}

	private static final int TTF_HINTING_MONO = (int) 2L;

	public static int TTF_HINTING_MONO() {
		return TTF_HINTING_MONO;
	}

	private static final int TTF_HINTING_NONE = (int) 3L;

	public static int TTF_HINTING_NONE() {
		return TTF_HINTING_NONE;
	}

	private static final int TTF_HINTING_LIGHT_SUBPIXEL = (int) 4L;

	public static int TTF_HINTING_LIGHT_SUBPIXEL() {
		return TTF_HINTING_LIGHT_SUBPIXEL;
	}

	private static class TTF_SetFontHinting {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_SetFontHinting");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_SetFontHinting$descriptor() {
		return TTF_SetFontHinting.DESC;
	}

	public static MethodHandle TTF_SetFontHinting$handle() {
		return TTF_SetFontHinting.HANDLE;
	}

	public static MemorySegment TTF_SetFontHinting$address() {
		return TTF_SetFontHinting.ADDR;
	}

	public static void TTF_SetFontHinting(MemorySegment font, int hinting) {
		var mh$ = TTF_SetFontHinting.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_SetFontHinting", font, hinting);
			}
			mh$.invokeExact(font, hinting);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetNumFontFaces {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_INT,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetNumFontFaces");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetNumFontFaces$descriptor() {
		return TTF_GetNumFontFaces.DESC;
	}

	public static MethodHandle TTF_GetNumFontFaces$handle() {
		return TTF_GetNumFontFaces.HANDLE;
	}

	public static MemorySegment TTF_GetNumFontFaces$address() {
		return TTF_GetNumFontFaces.ADDR;
	}

	public static int TTF_GetNumFontFaces(MemorySegment font) {
		var mh$ = TTF_GetNumFontFaces.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetNumFontFaces", font);
			}
			return (int) mh$.invokeExact(font);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetFontHinting {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_INT,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetFontHinting");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetFontHinting$descriptor() {
		return TTF_GetFontHinting.DESC;
	}

	public static MethodHandle TTF_GetFontHinting$handle() {
		return TTF_GetFontHinting.HANDLE;
	}

	public static MemorySegment TTF_GetFontHinting$address() {
		return TTF_GetFontHinting.ADDR;
	}

	public static int TTF_GetFontHinting(MemorySegment font) {
		var mh$ = TTF_GetFontHinting.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetFontHinting", font);
			}
			return (int) mh$.invokeExact(font);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_SetFontSDF {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_SetFontSDF");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_SetFontSDF$descriptor() {
		return TTF_SetFontSDF.DESC;
	}

	public static MethodHandle TTF_SetFontSDF$handle() {
		return TTF_SetFontSDF.HANDLE;
	}

	public static MemorySegment TTF_SetFontSDF$address() {
		return TTF_SetFontSDF.ADDR;
	}

	public static boolean TTF_SetFontSDF(MemorySegment font, boolean enabled) {
		var mh$ = TTF_SetFontSDF.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_SetFontSDF", font, enabled);
			}
			return (boolean) mh$.invokeExact(font, enabled);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetFontSDF {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetFontSDF");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetFontSDF$descriptor() {
		return TTF_GetFontSDF.DESC;
	}

	public static MethodHandle TTF_GetFontSDF$handle() {
		return TTF_GetFontSDF.HANDLE;
	}

	public static MemorySegment TTF_GetFontSDF$address() {
		return TTF_GetFontSDF.ADDR;
	}

	public static boolean TTF_GetFontSDF(MemorySegment font) {
		var mh$ = TTF_GetFontSDF.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetFontSDF", font);
			}
			return (boolean) mh$.invokeExact(font);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetFontWeight {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_INT,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetFontWeight");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetFontWeight$descriptor() {
		return TTF_GetFontWeight.DESC;
	}

	public static MethodHandle TTF_GetFontWeight$handle() {
		return TTF_GetFontWeight.HANDLE;
	}

	public static MemorySegment TTF_GetFontWeight$address() {
		return TTF_GetFontWeight.ADDR;
	}

	public static int TTF_GetFontWeight(MemorySegment font) {
		var mh$ = TTF_GetFontWeight.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetFontWeight", font);
			}
			return (int) mh$.invokeExact(font);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static final int TTF_HORIZONTAL_ALIGN_INVALID = (int) -1L;

	public static int TTF_HORIZONTAL_ALIGN_INVALID() {
		return TTF_HORIZONTAL_ALIGN_INVALID;
	}

	private static final int TTF_HORIZONTAL_ALIGN_LEFT = (int) 0L;

	public static int TTF_HORIZONTAL_ALIGN_LEFT() {
		return TTF_HORIZONTAL_ALIGN_LEFT;
	}

	private static final int TTF_HORIZONTAL_ALIGN_CENTER = (int) 1L;

	public static int TTF_HORIZONTAL_ALIGN_CENTER() {
		return TTF_HORIZONTAL_ALIGN_CENTER;
	}

	private static final int TTF_HORIZONTAL_ALIGN_RIGHT = (int) 2L;

	public static int TTF_HORIZONTAL_ALIGN_RIGHT() {
		return TTF_HORIZONTAL_ALIGN_RIGHT;
	}

	private static class TTF_SetFontWrapAlignment {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_SetFontWrapAlignment");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_SetFontWrapAlignment$descriptor() {
		return TTF_SetFontWrapAlignment.DESC;
	}

	public static MethodHandle TTF_SetFontWrapAlignment$handle() {
		return TTF_SetFontWrapAlignment.HANDLE;
	}

	public static MemorySegment TTF_SetFontWrapAlignment$address() {
		return TTF_SetFontWrapAlignment.ADDR;
	}

	public static void TTF_SetFontWrapAlignment(MemorySegment font, int align) {
		var mh$ = TTF_SetFontWrapAlignment.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_SetFontWrapAlignment", font, align);
			}
			mh$.invokeExact(font, align);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetFontWrapAlignment {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_INT,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetFontWrapAlignment");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetFontWrapAlignment$descriptor() {
		return TTF_GetFontWrapAlignment.DESC;
	}

	public static MethodHandle TTF_GetFontWrapAlignment$handle() {
		return TTF_GetFontWrapAlignment.HANDLE;
	}

	public static MemorySegment TTF_GetFontWrapAlignment$address() {
		return TTF_GetFontWrapAlignment.ADDR;
	}

	public static int TTF_GetFontWrapAlignment(MemorySegment font) {
		var mh$ = TTF_GetFontWrapAlignment.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetFontWrapAlignment", font);
			}
			return (int) mh$.invokeExact(font);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetFontHeight {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_INT,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetFontHeight");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetFontHeight$descriptor() {
		return TTF_GetFontHeight.DESC;
	}

	public static MethodHandle TTF_GetFontHeight$handle() {
		return TTF_GetFontHeight.HANDLE;
	}

	public static MemorySegment TTF_GetFontHeight$address() {
		return TTF_GetFontHeight.ADDR;
	}

	public static int TTF_GetFontHeight(MemorySegment font) {
		var mh$ = TTF_GetFontHeight.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetFontHeight", font);
			}
			return (int) mh$.invokeExact(font);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetFontAscent {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_INT,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetFontAscent");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetFontAscent$descriptor() {
		return TTF_GetFontAscent.DESC;
	}

	public static MethodHandle TTF_GetFontAscent$handle() {
		return TTF_GetFontAscent.HANDLE;
	}

	public static MemorySegment TTF_GetFontAscent$address() {
		return TTF_GetFontAscent.ADDR;
	}

	public static int TTF_GetFontAscent(MemorySegment font) {
		var mh$ = TTF_GetFontAscent.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetFontAscent", font);
			}
			return (int) mh$.invokeExact(font);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetFontDescent {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_INT,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetFontDescent");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetFontDescent$descriptor() {
		return TTF_GetFontDescent.DESC;
	}

	public static MethodHandle TTF_GetFontDescent$handle() {
		return TTF_GetFontDescent.HANDLE;
	}

	public static MemorySegment TTF_GetFontDescent$address() {
		return TTF_GetFontDescent.ADDR;
	}

	public static int TTF_GetFontDescent(MemorySegment font) {
		var mh$ = TTF_GetFontDescent.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetFontDescent", font);
			}
			return (int) mh$.invokeExact(font);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_SetFontLineSkip {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_SetFontLineSkip");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_SetFontLineSkip$descriptor() {
		return TTF_SetFontLineSkip.DESC;
	}

	public static MethodHandle TTF_SetFontLineSkip$handle() {
		return TTF_SetFontLineSkip.HANDLE;
	}

	public static MemorySegment TTF_SetFontLineSkip$address() {
		return TTF_SetFontLineSkip.ADDR;
	}

	public static void TTF_SetFontLineSkip(MemorySegment font, int lineskip) {
		var mh$ = TTF_SetFontLineSkip.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_SetFontLineSkip", font, lineskip);
			}
			mh$.invokeExact(font, lineskip);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetFontLineSkip {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_INT,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetFontLineSkip");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetFontLineSkip$descriptor() {
		return TTF_GetFontLineSkip.DESC;
	}

	public static MethodHandle TTF_GetFontLineSkip$handle() {
		return TTF_GetFontLineSkip.HANDLE;
	}

	public static MemorySegment TTF_GetFontLineSkip$address() {
		return TTF_GetFontLineSkip.ADDR;
	}

	public static int TTF_GetFontLineSkip(MemorySegment font) {
		var mh$ = TTF_GetFontLineSkip.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetFontLineSkip", font);
			}
			return (int) mh$.invokeExact(font);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_SetFontKerning {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_SetFontKerning");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_SetFontKerning$descriptor() {
		return TTF_SetFontKerning.DESC;
	}

	public static MethodHandle TTF_SetFontKerning$handle() {
		return TTF_SetFontKerning.HANDLE;
	}

	public static MemorySegment TTF_SetFontKerning$address() {
		return TTF_SetFontKerning.ADDR;
	}

	public static void TTF_SetFontKerning(MemorySegment font, boolean enabled) {
		var mh$ = TTF_SetFontKerning.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_SetFontKerning", font, enabled);
			}
			mh$.invokeExact(font, enabled);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetFontKerning {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetFontKerning");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetFontKerning$descriptor() {
		return TTF_GetFontKerning.DESC;
	}

	public static MethodHandle TTF_GetFontKerning$handle() {
		return TTF_GetFontKerning.HANDLE;
	}

	public static MemorySegment TTF_GetFontKerning$address() {
		return TTF_GetFontKerning.ADDR;
	}

	public static boolean TTF_GetFontKerning(MemorySegment font) {
		var mh$ = TTF_GetFontKerning.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetFontKerning", font);
			}
			return (boolean) mh$.invokeExact(font);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_FontIsFixedWidth {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_FontIsFixedWidth");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_FontIsFixedWidth$descriptor() {
		return TTF_FontIsFixedWidth.DESC;
	}

	public static MethodHandle TTF_FontIsFixedWidth$handle() {
		return TTF_FontIsFixedWidth.HANDLE;
	}

	public static MemorySegment TTF_FontIsFixedWidth$address() {
		return TTF_FontIsFixedWidth.ADDR;
	}

	public static boolean TTF_FontIsFixedWidth(MemorySegment font) {
		var mh$ = TTF_FontIsFixedWidth.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_FontIsFixedWidth", font);
			}
			return (boolean) mh$.invokeExact(font);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_FontIsScalable {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_FontIsScalable");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_FontIsScalable$descriptor() {
		return TTF_FontIsScalable.DESC;
	}

	public static MethodHandle TTF_FontIsScalable$handle() {
		return TTF_FontIsScalable.HANDLE;
	}

	public static MemorySegment TTF_FontIsScalable$address() {
		return TTF_FontIsScalable.ADDR;
	}

	public static boolean TTF_FontIsScalable(MemorySegment font) {
		var mh$ = TTF_FontIsScalable.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_FontIsScalable", font);
			}
			return (boolean) mh$.invokeExact(font);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetFontFamilyName {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetFontFamilyName");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetFontFamilyName$descriptor() {
		return TTF_GetFontFamilyName.DESC;
	}

	public static MethodHandle TTF_GetFontFamilyName$handle() {
		return TTF_GetFontFamilyName.HANDLE;
	}

	public static MemorySegment TTF_GetFontFamilyName$address() {
		return TTF_GetFontFamilyName.ADDR;
	}

	public static MemorySegment TTF_GetFontFamilyName(MemorySegment font) {
		var mh$ = TTF_GetFontFamilyName.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetFontFamilyName", font);
			}
			return (MemorySegment) mh$.invokeExact(font);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetFontStyleName {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetFontStyleName");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetFontStyleName$descriptor() {
		return TTF_GetFontStyleName.DESC;
	}

	public static MethodHandle TTF_GetFontStyleName$handle() {
		return TTF_GetFontStyleName.HANDLE;
	}

	public static MemorySegment TTF_GetFontStyleName$address() {
		return TTF_GetFontStyleName.ADDR;
	}

	public static MemorySegment TTF_GetFontStyleName(MemorySegment font) {
		var mh$ = TTF_GetFontStyleName.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetFontStyleName", font);
			}
			return (MemorySegment) mh$.invokeExact(font);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static final int TTF_DIRECTION_INVALID = (int) 0L;

	public static int TTF_DIRECTION_INVALID() {
		return TTF_DIRECTION_INVALID;
	}

	private static final int TTF_DIRECTION_LTR = (int) 4L;

	public static int TTF_DIRECTION_LTR() {
		return TTF_DIRECTION_LTR;
	}

	private static final int TTF_DIRECTION_RTL = (int) 5L;

	public static int TTF_DIRECTION_RTL() {
		return TTF_DIRECTION_RTL;
	}

	private static final int TTF_DIRECTION_TTB = (int) 6L;

	public static int TTF_DIRECTION_TTB() {
		return TTF_DIRECTION_TTB;
	}

	private static final int TTF_DIRECTION_BTT = (int) 7L;

	public static int TTF_DIRECTION_BTT() {
		return TTF_DIRECTION_BTT;
	}

	private static class TTF_SetFontDirection {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_SetFontDirection");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_SetFontDirection$descriptor() {
		return TTF_SetFontDirection.DESC;
	}

	public static MethodHandle TTF_SetFontDirection$handle() {
		return TTF_SetFontDirection.HANDLE;
	}

	public static MemorySegment TTF_SetFontDirection$address() {
		return TTF_SetFontDirection.ADDR;
	}

	public static boolean TTF_SetFontDirection(MemorySegment font, int direction) {
		var mh$ = TTF_SetFontDirection.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_SetFontDirection", font, direction);
			}
			return (boolean) mh$.invokeExact(font, direction);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetFontDirection {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_INT,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetFontDirection");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetFontDirection$descriptor() {
		return TTF_GetFontDirection.DESC;
	}

	public static MethodHandle TTF_GetFontDirection$handle() {
		return TTF_GetFontDirection.HANDLE;
	}

	public static MemorySegment TTF_GetFontDirection$address() {
		return TTF_GetFontDirection.ADDR;
	}

	public static int TTF_GetFontDirection(MemorySegment font) {
		var mh$ = TTF_GetFontDirection.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetFontDirection", font);
			}
			return (int) mh$.invokeExact(font);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_StringToTag {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_INT,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_StringToTag");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_StringToTag$descriptor() {
		return TTF_StringToTag.DESC;
	}

	public static MethodHandle TTF_StringToTag$handle() {
		return TTF_StringToTag.HANDLE;
	}

	public static MemorySegment TTF_StringToTag$address() {
		return TTF_StringToTag.ADDR;
	}

	public static int TTF_StringToTag(MemorySegment string) {
		var mh$ = TTF_StringToTag.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_StringToTag", string);
			}
			return (int) mh$.invokeExact(string);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_TagToString {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3Ttf.C_INT,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_TagToString");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_TagToString$descriptor() {
		return TTF_TagToString.DESC;
	}

	public static MethodHandle TTF_TagToString$handle() {
		return TTF_TagToString.HANDLE;
	}

	public static MemorySegment TTF_TagToString$address() {
		return TTF_TagToString.ADDR;
	}

	public static void TTF_TagToString(int tag, MemorySegment string, long size) {
		var mh$ = TTF_TagToString.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_TagToString", tag, string, size);
			}
			mh$.invokeExact(tag, string, size);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_SetFontScript {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_SetFontScript");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_SetFontScript$descriptor() {
		return TTF_SetFontScript.DESC;
	}

	public static MethodHandle TTF_SetFontScript$handle() {
		return TTF_SetFontScript.HANDLE;
	}

	public static MemorySegment TTF_SetFontScript$address() {
		return TTF_SetFontScript.ADDR;
	}

	public static boolean TTF_SetFontScript(MemorySegment font, int script) {
		var mh$ = TTF_SetFontScript.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_SetFontScript", font, script);
			}
			return (boolean) mh$.invokeExact(font, script);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetFontScript {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_INT,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetFontScript");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetFontScript$descriptor() {
		return TTF_GetFontScript.DESC;
	}

	public static MethodHandle TTF_GetFontScript$handle() {
		return TTF_GetFontScript.HANDLE;
	}

	public static MemorySegment TTF_GetFontScript$address() {
		return TTF_GetFontScript.ADDR;
	}

	public static int TTF_GetFontScript(MemorySegment font) {
		var mh$ = TTF_GetFontScript.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetFontScript", font);
			}
			return (int) mh$.invokeExact(font);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetGlyphScript {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_INT,
				SDL3Ttf.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetGlyphScript");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetGlyphScript$descriptor() {
		return TTF_GetGlyphScript.DESC;
	}

	public static MethodHandle TTF_GetGlyphScript$handle() {
		return TTF_GetGlyphScript.HANDLE;
	}

	public static MemorySegment TTF_GetGlyphScript$address() {
		return TTF_GetGlyphScript.ADDR;
	}

	public static int TTF_GetGlyphScript(int ch) {
		var mh$ = TTF_GetGlyphScript.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetGlyphScript", ch);
			}
			return (int) mh$.invokeExact(ch);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_SetFontLanguage {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_SetFontLanguage");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_SetFontLanguage$descriptor() {
		return TTF_SetFontLanguage.DESC;
	}

	public static MethodHandle TTF_SetFontLanguage$handle() {
		return TTF_SetFontLanguage.HANDLE;
	}

	public static MemorySegment TTF_SetFontLanguage$address() {
		return TTF_SetFontLanguage.ADDR;
	}

	public static boolean TTF_SetFontLanguage(MemorySegment font, MemorySegment language_bcp47) {
		var mh$ = TTF_SetFontLanguage.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_SetFontLanguage", font, language_bcp47);
			}
			return (boolean) mh$.invokeExact(font, language_bcp47);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_FontHasGlyph {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_FontHasGlyph");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_FontHasGlyph$descriptor() {
		return TTF_FontHasGlyph.DESC;
	}

	public static MethodHandle TTF_FontHasGlyph$handle() {
		return TTF_FontHasGlyph.HANDLE;
	}

	public static MemorySegment TTF_FontHasGlyph$address() {
		return TTF_FontHasGlyph.ADDR;
	}

	public static boolean TTF_FontHasGlyph(MemorySegment font, int ch) {
		var mh$ = TTF_FontHasGlyph.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_FontHasGlyph", font, ch);
			}
			return (boolean) mh$.invokeExact(font, ch);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static final int TTF_IMAGE_INVALID = (int) 0L;

	public static int TTF_IMAGE_INVALID() {
		return TTF_IMAGE_INVALID;
	}

	private static final int TTF_IMAGE_ALPHA = (int) 1L;

	public static int TTF_IMAGE_ALPHA() {
		return TTF_IMAGE_ALPHA;
	}

	private static final int TTF_IMAGE_COLOR = (int) 2L;

	public static int TTF_IMAGE_COLOR() {
		return TTF_IMAGE_COLOR;
	}

	private static final int TTF_IMAGE_SDF = (int) 3L;

	public static int TTF_IMAGE_SDF() {
		return TTF_IMAGE_SDF;
	}

	private static class TTF_GetGlyphImage {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_INT,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetGlyphImage");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetGlyphImage$descriptor() {
		return TTF_GetGlyphImage.DESC;
	}

	public static MethodHandle TTF_GetGlyphImage$handle() {
		return TTF_GetGlyphImage.HANDLE;
	}

	public static MemorySegment TTF_GetGlyphImage$address() {
		return TTF_GetGlyphImage.ADDR;
	}

	public static MemorySegment TTF_GetGlyphImage(MemorySegment font, int ch, MemorySegment image_type) {
		var mh$ = TTF_GetGlyphImage.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetGlyphImage", font, ch, image_type);
			}
			return (MemorySegment) mh$.invokeExact(font, ch, image_type);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetGlyphImageForIndex {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_INT,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetGlyphImageForIndex");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetGlyphImageForIndex$descriptor() {
		return TTF_GetGlyphImageForIndex.DESC;
	}

	public static MethodHandle TTF_GetGlyphImageForIndex$handle() {
		return TTF_GetGlyphImageForIndex.HANDLE;
	}

	public static MemorySegment TTF_GetGlyphImageForIndex$address() {
		return TTF_GetGlyphImageForIndex.ADDR;
	}

	public static MemorySegment TTF_GetGlyphImageForIndex(MemorySegment font, int glyph_index, MemorySegment image_type) {
		var mh$ = TTF_GetGlyphImageForIndex.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetGlyphImageForIndex", font, glyph_index, image_type);
			}
			return (MemorySegment) mh$.invokeExact(font, glyph_index, image_type);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetGlyphMetrics {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_INT,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetGlyphMetrics");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetGlyphMetrics$descriptor() {
		return TTF_GetGlyphMetrics.DESC;
	}

	public static MethodHandle TTF_GetGlyphMetrics$handle() {
		return TTF_GetGlyphMetrics.HANDLE;
	}

	public static MemorySegment TTF_GetGlyphMetrics$address() {
		return TTF_GetGlyphMetrics.ADDR;
	}

	public static boolean TTF_GetGlyphMetrics(MemorySegment font, int ch, MemorySegment minx, MemorySegment maxx, MemorySegment miny, MemorySegment maxy, MemorySegment advance) {
		var mh$ = TTF_GetGlyphMetrics.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetGlyphMetrics", font, ch, minx, maxx, miny, maxy, advance);
			}
			return (boolean) mh$.invokeExact(font, ch, minx, maxx, miny, maxy, advance);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetGlyphKerning {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_INT,
				SDL3Ttf.C_INT,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetGlyphKerning");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetGlyphKerning$descriptor() {
		return TTF_GetGlyphKerning.DESC;
	}

	public static MethodHandle TTF_GetGlyphKerning$handle() {
		return TTF_GetGlyphKerning.HANDLE;
	}

	public static MemorySegment TTF_GetGlyphKerning$address() {
		return TTF_GetGlyphKerning.ADDR;
	}

	public static boolean TTF_GetGlyphKerning(MemorySegment font, int previous_ch, int ch, MemorySegment kerning) {
		var mh$ = TTF_GetGlyphKerning.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetGlyphKerning", font, previous_ch, ch, kerning);
			}
			return (boolean) mh$.invokeExact(font, previous_ch, ch, kerning);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetStringSize {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_LONG,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetStringSize");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetStringSize$descriptor() {
		return TTF_GetStringSize.DESC;
	}

	public static MethodHandle TTF_GetStringSize$handle() {
		return TTF_GetStringSize.HANDLE;
	}

	public static MemorySegment TTF_GetStringSize$address() {
		return TTF_GetStringSize.ADDR;
	}

	public static boolean TTF_GetStringSize(MemorySegment font, MemorySegment text, long length, MemorySegment w, MemorySegment h) {
		var mh$ = TTF_GetStringSize.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetStringSize", font, text, length, w, h);
			}
			return (boolean) mh$.invokeExact(font, text, length, w, h);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetStringSizeWrapped {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_LONG,
				SDL3Ttf.C_INT,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetStringSizeWrapped");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetStringSizeWrapped$descriptor() {
		return TTF_GetStringSizeWrapped.DESC;
	}

	public static MethodHandle TTF_GetStringSizeWrapped$handle() {
		return TTF_GetStringSizeWrapped.HANDLE;
	}

	public static MemorySegment TTF_GetStringSizeWrapped$address() {
		return TTF_GetStringSizeWrapped.ADDR;
	}

	public static boolean TTF_GetStringSizeWrapped(MemorySegment font, MemorySegment text, long length, int wrap_width, MemorySegment w, MemorySegment h) {
		var mh$ = TTF_GetStringSizeWrapped.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetStringSizeWrapped", font, text, length, wrap_width, w, h);
			}
			return (boolean) mh$.invokeExact(font, text, length, wrap_width, w, h);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_MeasureString {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_LONG,
				SDL3Ttf.C_INT,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_MeasureString");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_MeasureString$descriptor() {
		return TTF_MeasureString.DESC;
	}

	public static MethodHandle TTF_MeasureString$handle() {
		return TTF_MeasureString.HANDLE;
	}

	public static MemorySegment TTF_MeasureString$address() {
		return TTF_MeasureString.ADDR;
	}

	public static boolean TTF_MeasureString(MemorySegment font, MemorySegment text, long length, int max_width, MemorySegment measured_width, MemorySegment measured_length) {
		var mh$ = TTF_MeasureString.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_MeasureString", font, text, length, max_width, measured_width, measured_length);
			}
			return (boolean) mh$.invokeExact(font, text, length, max_width, measured_width, measured_length);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_RenderText_Solid {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_LONG,
				SDL_Color.layout()
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_RenderText_Solid");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_RenderText_Solid$descriptor() {
		return TTF_RenderText_Solid.DESC;
	}

	public static MethodHandle TTF_RenderText_Solid$handle() {
		return TTF_RenderText_Solid.HANDLE;
	}

	public static MemorySegment TTF_RenderText_Solid$address() {
		return TTF_RenderText_Solid.ADDR;
	}

	public static MemorySegment TTF_RenderText_Solid(MemorySegment font, MemorySegment text, long length, MemorySegment fg) {
		var mh$ = TTF_RenderText_Solid.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_RenderText_Solid", font, text, length, fg);
			}
			return (MemorySegment) mh$.invokeExact(font, text, length, fg);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_RenderText_Solid_Wrapped {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_LONG,
				SDL_Color.layout(),
				SDL3Ttf.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_RenderText_Solid_Wrapped");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_RenderText_Solid_Wrapped$descriptor() {
		return TTF_RenderText_Solid_Wrapped.DESC;
	}

	public static MethodHandle TTF_RenderText_Solid_Wrapped$handle() {
		return TTF_RenderText_Solid_Wrapped.HANDLE;
	}

	public static MemorySegment TTF_RenderText_Solid_Wrapped$address() {
		return TTF_RenderText_Solid_Wrapped.ADDR;
	}

	public static MemorySegment TTF_RenderText_Solid_Wrapped(MemorySegment font, MemorySegment text, long length, MemorySegment fg, int wrapLength) {
		var mh$ = TTF_RenderText_Solid_Wrapped.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_RenderText_Solid_Wrapped", font, text, length, fg, wrapLength);
			}
			return (MemorySegment) mh$.invokeExact(font, text, length, fg, wrapLength);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_RenderGlyph_Solid {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_INT,
				SDL_Color.layout()
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_RenderGlyph_Solid");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_RenderGlyph_Solid$descriptor() {
		return TTF_RenderGlyph_Solid.DESC;
	}

	public static MethodHandle TTF_RenderGlyph_Solid$handle() {
		return TTF_RenderGlyph_Solid.HANDLE;
	}

	public static MemorySegment TTF_RenderGlyph_Solid$address() {
		return TTF_RenderGlyph_Solid.ADDR;
	}

	public static MemorySegment TTF_RenderGlyph_Solid(MemorySegment font, int ch, MemorySegment fg) {
		var mh$ = TTF_RenderGlyph_Solid.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_RenderGlyph_Solid", font, ch, fg);
			}
			return (MemorySegment) mh$.invokeExact(font, ch, fg);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_RenderText_Shaded {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_LONG,
				SDL_Color.layout(),
				SDL_Color.layout()
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_RenderText_Shaded");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_RenderText_Shaded$descriptor() {
		return TTF_RenderText_Shaded.DESC;
	}

	public static MethodHandle TTF_RenderText_Shaded$handle() {
		return TTF_RenderText_Shaded.HANDLE;
	}

	public static MemorySegment TTF_RenderText_Shaded$address() {
		return TTF_RenderText_Shaded.ADDR;
	}

	public static MemorySegment TTF_RenderText_Shaded(MemorySegment font, MemorySegment text, long length, MemorySegment fg, MemorySegment bg) {
		var mh$ = TTF_RenderText_Shaded.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_RenderText_Shaded", font, text, length, fg, bg);
			}
			return (MemorySegment) mh$.invokeExact(font, text, length, fg, bg);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_RenderText_Shaded_Wrapped {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_LONG,
				SDL_Color.layout(),
				SDL_Color.layout(),
				SDL3Ttf.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_RenderText_Shaded_Wrapped");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_RenderText_Shaded_Wrapped$descriptor() {
		return TTF_RenderText_Shaded_Wrapped.DESC;
	}

	public static MethodHandle TTF_RenderText_Shaded_Wrapped$handle() {
		return TTF_RenderText_Shaded_Wrapped.HANDLE;
	}

	public static MemorySegment TTF_RenderText_Shaded_Wrapped$address() {
		return TTF_RenderText_Shaded_Wrapped.ADDR;
	}

	public static MemorySegment TTF_RenderText_Shaded_Wrapped(MemorySegment font, MemorySegment text, long length, MemorySegment fg, MemorySegment bg, int wrap_width) {
		var mh$ = TTF_RenderText_Shaded_Wrapped.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_RenderText_Shaded_Wrapped", font, text, length, fg, bg, wrap_width);
			}
			return (MemorySegment) mh$.invokeExact(font, text, length, fg, bg, wrap_width);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_RenderGlyph_Shaded {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_INT,
				SDL_Color.layout(),
				SDL_Color.layout()
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_RenderGlyph_Shaded");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_RenderGlyph_Shaded$descriptor() {
		return TTF_RenderGlyph_Shaded.DESC;
	}

	public static MethodHandle TTF_RenderGlyph_Shaded$handle() {
		return TTF_RenderGlyph_Shaded.HANDLE;
	}

	public static MemorySegment TTF_RenderGlyph_Shaded$address() {
		return TTF_RenderGlyph_Shaded.ADDR;
	}

	public static MemorySegment TTF_RenderGlyph_Shaded(MemorySegment font, int ch, MemorySegment fg, MemorySegment bg) {
		var mh$ = TTF_RenderGlyph_Shaded.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_RenderGlyph_Shaded", font, ch, fg, bg);
			}
			return (MemorySegment) mh$.invokeExact(font, ch, fg, bg);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_RenderText_Blended {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_LONG,
				SDL_Color.layout()
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_RenderText_Blended");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_RenderText_Blended$descriptor() {
		return TTF_RenderText_Blended.DESC;
	}

	public static MethodHandle TTF_RenderText_Blended$handle() {
		return TTF_RenderText_Blended.HANDLE;
	}

	public static MemorySegment TTF_RenderText_Blended$address() {
		return TTF_RenderText_Blended.ADDR;
	}

	public static MemorySegment TTF_RenderText_Blended(MemorySegment font, MemorySegment text, long length, MemorySegment fg) {
		var mh$ = TTF_RenderText_Blended.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_RenderText_Blended", font, text, length, fg);
			}
			return (MemorySegment) mh$.invokeExact(font, text, length, fg);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_RenderText_Blended_Wrapped {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_LONG,
				SDL_Color.layout(),
				SDL3Ttf.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_RenderText_Blended_Wrapped");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_RenderText_Blended_Wrapped$descriptor() {
		return TTF_RenderText_Blended_Wrapped.DESC;
	}

	public static MethodHandle TTF_RenderText_Blended_Wrapped$handle() {
		return TTF_RenderText_Blended_Wrapped.HANDLE;
	}

	public static MemorySegment TTF_RenderText_Blended_Wrapped$address() {
		return TTF_RenderText_Blended_Wrapped.ADDR;
	}

	public static MemorySegment TTF_RenderText_Blended_Wrapped(MemorySegment font, MemorySegment text, long length, MemorySegment fg, int wrap_width) {
		var mh$ = TTF_RenderText_Blended_Wrapped.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_RenderText_Blended_Wrapped", font, text, length, fg, wrap_width);
			}
			return (MemorySegment) mh$.invokeExact(font, text, length, fg, wrap_width);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_RenderGlyph_Blended {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_INT,
				SDL_Color.layout()
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_RenderGlyph_Blended");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_RenderGlyph_Blended$descriptor() {
		return TTF_RenderGlyph_Blended.DESC;
	}

	public static MethodHandle TTF_RenderGlyph_Blended$handle() {
		return TTF_RenderGlyph_Blended.HANDLE;
	}

	public static MemorySegment TTF_RenderGlyph_Blended$address() {
		return TTF_RenderGlyph_Blended.ADDR;
	}

	public static MemorySegment TTF_RenderGlyph_Blended(MemorySegment font, int ch, MemorySegment fg) {
		var mh$ = TTF_RenderGlyph_Blended.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_RenderGlyph_Blended", font, ch, fg);
			}
			return (MemorySegment) mh$.invokeExact(font, ch, fg);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_RenderText_LCD {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_LONG,
				SDL_Color.layout(),
				SDL_Color.layout()
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_RenderText_LCD");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_RenderText_LCD$descriptor() {
		return TTF_RenderText_LCD.DESC;
	}

	public static MethodHandle TTF_RenderText_LCD$handle() {
		return TTF_RenderText_LCD.HANDLE;
	}

	public static MemorySegment TTF_RenderText_LCD$address() {
		return TTF_RenderText_LCD.ADDR;
	}

	public static MemorySegment TTF_RenderText_LCD(MemorySegment font, MemorySegment text, long length, MemorySegment fg, MemorySegment bg) {
		var mh$ = TTF_RenderText_LCD.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_RenderText_LCD", font, text, length, fg, bg);
			}
			return (MemorySegment) mh$.invokeExact(font, text, length, fg, bg);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_RenderText_LCD_Wrapped {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_LONG,
				SDL_Color.layout(),
				SDL_Color.layout(),
				SDL3Ttf.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_RenderText_LCD_Wrapped");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_RenderText_LCD_Wrapped$descriptor() {
		return TTF_RenderText_LCD_Wrapped.DESC;
	}

	public static MethodHandle TTF_RenderText_LCD_Wrapped$handle() {
		return TTF_RenderText_LCD_Wrapped.HANDLE;
	}

	public static MemorySegment TTF_RenderText_LCD_Wrapped$address() {
		return TTF_RenderText_LCD_Wrapped.ADDR;
	}

	public static MemorySegment TTF_RenderText_LCD_Wrapped(MemorySegment font, MemorySegment text, long length, MemorySegment fg, MemorySegment bg, int wrap_width) {
		var mh$ = TTF_RenderText_LCD_Wrapped.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_RenderText_LCD_Wrapped", font, text, length, fg, bg, wrap_width);
			}
			return (MemorySegment) mh$.invokeExact(font, text, length, fg, bg, wrap_width);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_RenderGlyph_LCD {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_INT,
				SDL_Color.layout(),
				SDL_Color.layout()
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_RenderGlyph_LCD");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_RenderGlyph_LCD$descriptor() {
		return TTF_RenderGlyph_LCD.DESC;
	}

	public static MethodHandle TTF_RenderGlyph_LCD$handle() {
		return TTF_RenderGlyph_LCD.HANDLE;
	}

	public static MemorySegment TTF_RenderGlyph_LCD$address() {
		return TTF_RenderGlyph_LCD.ADDR;
	}

	public static MemorySegment TTF_RenderGlyph_LCD(MemorySegment font, int ch, MemorySegment fg, MemorySegment bg) {
		var mh$ = TTF_RenderGlyph_LCD.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_RenderGlyph_LCD", font, ch, fg, bg);
			}
			return (MemorySegment) mh$.invokeExact(font, ch, fg, bg);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_CreateSurfaceTextEngine {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_POINTER);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_CreateSurfaceTextEngine");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_CreateSurfaceTextEngine$descriptor() {
		return TTF_CreateSurfaceTextEngine.DESC;
	}

	public static MethodHandle TTF_CreateSurfaceTextEngine$handle() {
		return TTF_CreateSurfaceTextEngine.HANDLE;
	}

	public static MemorySegment TTF_CreateSurfaceTextEngine$address() {
		return TTF_CreateSurfaceTextEngine.ADDR;
	}

	public static MemorySegment TTF_CreateSurfaceTextEngine() {
		var mh$ = TTF_CreateSurfaceTextEngine.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_CreateSurfaceTextEngine");
			}
			return (MemorySegment) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_DrawSurfaceText {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_INT,
				SDL3Ttf.C_INT,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_DrawSurfaceText");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_DrawSurfaceText$descriptor() {
		return TTF_DrawSurfaceText.DESC;
	}

	public static MethodHandle TTF_DrawSurfaceText$handle() {
		return TTF_DrawSurfaceText.HANDLE;
	}

	public static MemorySegment TTF_DrawSurfaceText$address() {
		return TTF_DrawSurfaceText.ADDR;
	}

	public static boolean TTF_DrawSurfaceText(MemorySegment text, int x, int y, MemorySegment surface) {
		var mh$ = TTF_DrawSurfaceText.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_DrawSurfaceText", text, x, y, surface);
			}
			return (boolean) mh$.invokeExact(text, x, y, surface);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_DestroySurfaceTextEngine {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_DestroySurfaceTextEngine");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_DestroySurfaceTextEngine$descriptor() {
		return TTF_DestroySurfaceTextEngine.DESC;
	}

	public static MethodHandle TTF_DestroySurfaceTextEngine$handle() {
		return TTF_DestroySurfaceTextEngine.HANDLE;
	}

	public static MemorySegment TTF_DestroySurfaceTextEngine$address() {
		return TTF_DestroySurfaceTextEngine.ADDR;
	}

	public static void TTF_DestroySurfaceTextEngine(MemorySegment engine) {
		var mh$ = TTF_DestroySurfaceTextEngine.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_DestroySurfaceTextEngine", engine);
			}
			mh$.invokeExact(engine);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_CreateRendererTextEngine {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_CreateRendererTextEngine");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_CreateRendererTextEngine$descriptor() {
		return TTF_CreateRendererTextEngine.DESC;
	}

	public static MethodHandle TTF_CreateRendererTextEngine$handle() {
		return TTF_CreateRendererTextEngine.HANDLE;
	}

	public static MemorySegment TTF_CreateRendererTextEngine$address() {
		return TTF_CreateRendererTextEngine.ADDR;
	}

	public static MemorySegment TTF_CreateRendererTextEngine(MemorySegment renderer) {
		var mh$ = TTF_CreateRendererTextEngine.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_CreateRendererTextEngine", renderer);
			}
			return (MemorySegment) mh$.invokeExact(renderer);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_CreateRendererTextEngineWithProperties {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_CreateRendererTextEngineWithProperties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_CreateRendererTextEngineWithProperties$descriptor() {
		return TTF_CreateRendererTextEngineWithProperties.DESC;
	}

	public static MethodHandle TTF_CreateRendererTextEngineWithProperties$handle() {
		return TTF_CreateRendererTextEngineWithProperties.HANDLE;
	}

	public static MemorySegment TTF_CreateRendererTextEngineWithProperties$address() {
		return TTF_CreateRendererTextEngineWithProperties.ADDR;
	}

	public static MemorySegment TTF_CreateRendererTextEngineWithProperties(int props) {
		var mh$ = TTF_CreateRendererTextEngineWithProperties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_CreateRendererTextEngineWithProperties", props);
			}
			return (MemorySegment) mh$.invokeExact(props);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_DrawRendererText {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_FLOAT,
				SDL3Ttf.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_DrawRendererText");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_DrawRendererText$descriptor() {
		return TTF_DrawRendererText.DESC;
	}

	public static MethodHandle TTF_DrawRendererText$handle() {
		return TTF_DrawRendererText.HANDLE;
	}

	public static MemorySegment TTF_DrawRendererText$address() {
		return TTF_DrawRendererText.ADDR;
	}

	public static boolean TTF_DrawRendererText(MemorySegment text, float x, float y) {
		var mh$ = TTF_DrawRendererText.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_DrawRendererText", text, x, y);
			}
			return (boolean) mh$.invokeExact(text, x, y);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_DestroyRendererTextEngine {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_DestroyRendererTextEngine");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_DestroyRendererTextEngine$descriptor() {
		return TTF_DestroyRendererTextEngine.DESC;
	}

	public static MethodHandle TTF_DestroyRendererTextEngine$handle() {
		return TTF_DestroyRendererTextEngine.HANDLE;
	}

	public static MemorySegment TTF_DestroyRendererTextEngine$address() {
		return TTF_DestroyRendererTextEngine.ADDR;
	}

	public static void TTF_DestroyRendererTextEngine(MemorySegment engine) {
		var mh$ = TTF_DestroyRendererTextEngine.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_DestroyRendererTextEngine", engine);
			}
			mh$.invokeExact(engine);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_CreateGPUTextEngine {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_CreateGPUTextEngine");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_CreateGPUTextEngine$descriptor() {
		return TTF_CreateGPUTextEngine.DESC;
	}

	public static MethodHandle TTF_CreateGPUTextEngine$handle() {
		return TTF_CreateGPUTextEngine.HANDLE;
	}

	public static MemorySegment TTF_CreateGPUTextEngine$address() {
		return TTF_CreateGPUTextEngine.ADDR;
	}

	public static MemorySegment TTF_CreateGPUTextEngine(MemorySegment device) {
		var mh$ = TTF_CreateGPUTextEngine.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_CreateGPUTextEngine", device);
			}
			return (MemorySegment) mh$.invokeExact(device);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_CreateGPUTextEngineWithProperties {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_CreateGPUTextEngineWithProperties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_CreateGPUTextEngineWithProperties$descriptor() {
		return TTF_CreateGPUTextEngineWithProperties.DESC;
	}

	public static MethodHandle TTF_CreateGPUTextEngineWithProperties$handle() {
		return TTF_CreateGPUTextEngineWithProperties.HANDLE;
	}

	public static MemorySegment TTF_CreateGPUTextEngineWithProperties$address() {
		return TTF_CreateGPUTextEngineWithProperties.ADDR;
	}

	public static MemorySegment TTF_CreateGPUTextEngineWithProperties(int props) {
		var mh$ = TTF_CreateGPUTextEngineWithProperties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_CreateGPUTextEngineWithProperties", props);
			}
			return (MemorySegment) mh$.invokeExact(props);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetGPUTextDrawData {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetGPUTextDrawData");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetGPUTextDrawData$descriptor() {
		return TTF_GetGPUTextDrawData.DESC;
	}

	public static MethodHandle TTF_GetGPUTextDrawData$handle() {
		return TTF_GetGPUTextDrawData.HANDLE;
	}

	public static MemorySegment TTF_GetGPUTextDrawData$address() {
		return TTF_GetGPUTextDrawData.ADDR;
	}

	public static MemorySegment TTF_GetGPUTextDrawData(MemorySegment text) {
		var mh$ = TTF_GetGPUTextDrawData.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetGPUTextDrawData", text);
			}
			return (MemorySegment) mh$.invokeExact(text);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_DestroyGPUTextEngine {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_DestroyGPUTextEngine");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_DestroyGPUTextEngine$descriptor() {
		return TTF_DestroyGPUTextEngine.DESC;
	}

	public static MethodHandle TTF_DestroyGPUTextEngine$handle() {
		return TTF_DestroyGPUTextEngine.HANDLE;
	}

	public static MemorySegment TTF_DestroyGPUTextEngine$address() {
		return TTF_DestroyGPUTextEngine.ADDR;
	}

	public static void TTF_DestroyGPUTextEngine(MemorySegment engine) {
		var mh$ = TTF_DestroyGPUTextEngine.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_DestroyGPUTextEngine", engine);
			}
			mh$.invokeExact(engine);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static final int TTF_GPU_TEXTENGINE_WINDING_INVALID = (int) -1L;

	public static int TTF_GPU_TEXTENGINE_WINDING_INVALID() {
		return TTF_GPU_TEXTENGINE_WINDING_INVALID;
	}

	private static final int TTF_GPU_TEXTENGINE_WINDING_CLOCKWISE = (int) 0L;

	public static int TTF_GPU_TEXTENGINE_WINDING_CLOCKWISE() {
		return TTF_GPU_TEXTENGINE_WINDING_CLOCKWISE;
	}

	private static final int TTF_GPU_TEXTENGINE_WINDING_COUNTER_CLOCKWISE = (int) 1L;

	public static int TTF_GPU_TEXTENGINE_WINDING_COUNTER_CLOCKWISE() {
		return TTF_GPU_TEXTENGINE_WINDING_COUNTER_CLOCKWISE;
	}

	private static class TTF_SetGPUTextEngineWinding {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_SetGPUTextEngineWinding");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_SetGPUTextEngineWinding$descriptor() {
		return TTF_SetGPUTextEngineWinding.DESC;
	}

	public static MethodHandle TTF_SetGPUTextEngineWinding$handle() {
		return TTF_SetGPUTextEngineWinding.HANDLE;
	}

	public static MemorySegment TTF_SetGPUTextEngineWinding$address() {
		return TTF_SetGPUTextEngineWinding.ADDR;
	}

	public static void TTF_SetGPUTextEngineWinding(MemorySegment engine, int winding) {
		var mh$ = TTF_SetGPUTextEngineWinding.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_SetGPUTextEngineWinding", engine, winding);
			}
			mh$.invokeExact(engine, winding);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetGPUTextEngineWinding {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_INT,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetGPUTextEngineWinding");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetGPUTextEngineWinding$descriptor() {
		return TTF_GetGPUTextEngineWinding.DESC;
	}

	public static MethodHandle TTF_GetGPUTextEngineWinding$handle() {
		return TTF_GetGPUTextEngineWinding.HANDLE;
	}

	public static MemorySegment TTF_GetGPUTextEngineWinding$address() {
		return TTF_GetGPUTextEngineWinding.ADDR;
	}

	public static int TTF_GetGPUTextEngineWinding(MemorySegment engine) {
		var mh$ = TTF_GetGPUTextEngineWinding.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetGPUTextEngineWinding", engine);
			}
			return (int) mh$.invokeExact(engine);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_CreateText {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_CreateText");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_CreateText$descriptor() {
		return TTF_CreateText.DESC;
	}

	public static MethodHandle TTF_CreateText$handle() {
		return TTF_CreateText.HANDLE;
	}

	public static MemorySegment TTF_CreateText$address() {
		return TTF_CreateText.ADDR;
	}

	public static MemorySegment TTF_CreateText(MemorySegment engine, MemorySegment font, MemorySegment text, long length) {
		var mh$ = TTF_CreateText.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_CreateText", engine, font, text, length);
			}
			return (MemorySegment) mh$.invokeExact(engine, font, text, length);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetTextProperties {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_INT,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetTextProperties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetTextProperties$descriptor() {
		return TTF_GetTextProperties.DESC;
	}

	public static MethodHandle TTF_GetTextProperties$handle() {
		return TTF_GetTextProperties.HANDLE;
	}

	public static MemorySegment TTF_GetTextProperties$address() {
		return TTF_GetTextProperties.ADDR;
	}

	public static int TTF_GetTextProperties(MemorySegment text) {
		var mh$ = TTF_GetTextProperties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetTextProperties", text);
			}
			return (int) mh$.invokeExact(text);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_SetTextEngine {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_SetTextEngine");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_SetTextEngine$descriptor() {
		return TTF_SetTextEngine.DESC;
	}

	public static MethodHandle TTF_SetTextEngine$handle() {
		return TTF_SetTextEngine.HANDLE;
	}

	public static MemorySegment TTF_SetTextEngine$address() {
		return TTF_SetTextEngine.ADDR;
	}

	public static boolean TTF_SetTextEngine(MemorySegment text, MemorySegment engine) {
		var mh$ = TTF_SetTextEngine.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_SetTextEngine", text, engine);
			}
			return (boolean) mh$.invokeExact(text, engine);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetTextEngine {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetTextEngine");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetTextEngine$descriptor() {
		return TTF_GetTextEngine.DESC;
	}

	public static MethodHandle TTF_GetTextEngine$handle() {
		return TTF_GetTextEngine.HANDLE;
	}

	public static MemorySegment TTF_GetTextEngine$address() {
		return TTF_GetTextEngine.ADDR;
	}

	public static MemorySegment TTF_GetTextEngine(MemorySegment text) {
		var mh$ = TTF_GetTextEngine.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetTextEngine", text);
			}
			return (MemorySegment) mh$.invokeExact(text);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_SetTextFont {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_SetTextFont");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_SetTextFont$descriptor() {
		return TTF_SetTextFont.DESC;
	}

	public static MethodHandle TTF_SetTextFont$handle() {
		return TTF_SetTextFont.HANDLE;
	}

	public static MemorySegment TTF_SetTextFont$address() {
		return TTF_SetTextFont.ADDR;
	}

	public static boolean TTF_SetTextFont(MemorySegment text, MemorySegment font) {
		var mh$ = TTF_SetTextFont.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_SetTextFont", text, font);
			}
			return (boolean) mh$.invokeExact(text, font);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetTextFont {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetTextFont");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetTextFont$descriptor() {
		return TTF_GetTextFont.DESC;
	}

	public static MethodHandle TTF_GetTextFont$handle() {
		return TTF_GetTextFont.HANDLE;
	}

	public static MemorySegment TTF_GetTextFont$address() {
		return TTF_GetTextFont.ADDR;
	}

	public static MemorySegment TTF_GetTextFont(MemorySegment text) {
		var mh$ = TTF_GetTextFont.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetTextFont", text);
			}
			return (MemorySegment) mh$.invokeExact(text);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_SetTextDirection {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_SetTextDirection");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_SetTextDirection$descriptor() {
		return TTF_SetTextDirection.DESC;
	}

	public static MethodHandle TTF_SetTextDirection$handle() {
		return TTF_SetTextDirection.HANDLE;
	}

	public static MemorySegment TTF_SetTextDirection$address() {
		return TTF_SetTextDirection.ADDR;
	}

	public static boolean TTF_SetTextDirection(MemorySegment text, int direction) {
		var mh$ = TTF_SetTextDirection.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_SetTextDirection", text, direction);
			}
			return (boolean) mh$.invokeExact(text, direction);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetTextDirection {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_INT,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetTextDirection");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetTextDirection$descriptor() {
		return TTF_GetTextDirection.DESC;
	}

	public static MethodHandle TTF_GetTextDirection$handle() {
		return TTF_GetTextDirection.HANDLE;
	}

	public static MemorySegment TTF_GetTextDirection$address() {
		return TTF_GetTextDirection.ADDR;
	}

	public static int TTF_GetTextDirection(MemorySegment text) {
		var mh$ = TTF_GetTextDirection.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetTextDirection", text);
			}
			return (int) mh$.invokeExact(text);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_SetTextScript {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_SetTextScript");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_SetTextScript$descriptor() {
		return TTF_SetTextScript.DESC;
	}

	public static MethodHandle TTF_SetTextScript$handle() {
		return TTF_SetTextScript.HANDLE;
	}

	public static MemorySegment TTF_SetTextScript$address() {
		return TTF_SetTextScript.ADDR;
	}

	public static boolean TTF_SetTextScript(MemorySegment text, int script) {
		var mh$ = TTF_SetTextScript.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_SetTextScript", text, script);
			}
			return (boolean) mh$.invokeExact(text, script);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetTextScript {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_INT,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetTextScript");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetTextScript$descriptor() {
		return TTF_GetTextScript.DESC;
	}

	public static MethodHandle TTF_GetTextScript$handle() {
		return TTF_GetTextScript.HANDLE;
	}

	public static MemorySegment TTF_GetTextScript$address() {
		return TTF_GetTextScript.ADDR;
	}

	public static int TTF_GetTextScript(MemorySegment text) {
		var mh$ = TTF_GetTextScript.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetTextScript", text);
			}
			return (int) mh$.invokeExact(text);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_SetTextColor {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_CHAR,
				SDL3Ttf.C_CHAR,
				SDL3Ttf.C_CHAR,
				SDL3Ttf.C_CHAR
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_SetTextColor");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_SetTextColor$descriptor() {
		return TTF_SetTextColor.DESC;
	}

	public static MethodHandle TTF_SetTextColor$handle() {
		return TTF_SetTextColor.HANDLE;
	}

	public static MemorySegment TTF_SetTextColor$address() {
		return TTF_SetTextColor.ADDR;
	}

	public static boolean TTF_SetTextColor(MemorySegment text, byte r, byte g, byte b, byte a) {
		var mh$ = TTF_SetTextColor.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_SetTextColor", text, r, g, b, a);
			}
			return (boolean) mh$.invokeExact(text, r, g, b, a);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_SetTextColorFloat {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_FLOAT,
				SDL3Ttf.C_FLOAT,
				SDL3Ttf.C_FLOAT,
				SDL3Ttf.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_SetTextColorFloat");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_SetTextColorFloat$descriptor() {
		return TTF_SetTextColorFloat.DESC;
	}

	public static MethodHandle TTF_SetTextColorFloat$handle() {
		return TTF_SetTextColorFloat.HANDLE;
	}

	public static MemorySegment TTF_SetTextColorFloat$address() {
		return TTF_SetTextColorFloat.ADDR;
	}

	public static boolean TTF_SetTextColorFloat(MemorySegment text, float r, float g, float b, float a) {
		var mh$ = TTF_SetTextColorFloat.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_SetTextColorFloat", text, r, g, b, a);
			}
			return (boolean) mh$.invokeExact(text, r, g, b, a);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetTextColor {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetTextColor");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetTextColor$descriptor() {
		return TTF_GetTextColor.DESC;
	}

	public static MethodHandle TTF_GetTextColor$handle() {
		return TTF_GetTextColor.HANDLE;
	}

	public static MemorySegment TTF_GetTextColor$address() {
		return TTF_GetTextColor.ADDR;
	}

	public static boolean TTF_GetTextColor(MemorySegment text, MemorySegment r, MemorySegment g, MemorySegment b, MemorySegment a) {
		var mh$ = TTF_GetTextColor.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetTextColor", text, r, g, b, a);
			}
			return (boolean) mh$.invokeExact(text, r, g, b, a);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetTextColorFloat {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetTextColorFloat");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetTextColorFloat$descriptor() {
		return TTF_GetTextColorFloat.DESC;
	}

	public static MethodHandle TTF_GetTextColorFloat$handle() {
		return TTF_GetTextColorFloat.HANDLE;
	}

	public static MemorySegment TTF_GetTextColorFloat$address() {
		return TTF_GetTextColorFloat.ADDR;
	}

	public static boolean TTF_GetTextColorFloat(MemorySegment text, MemorySegment r, MemorySegment g, MemorySegment b, MemorySegment a) {
		var mh$ = TTF_GetTextColorFloat.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetTextColorFloat", text, r, g, b, a);
			}
			return (boolean) mh$.invokeExact(text, r, g, b, a);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_SetTextPosition {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_INT,
				SDL3Ttf.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_SetTextPosition");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_SetTextPosition$descriptor() {
		return TTF_SetTextPosition.DESC;
	}

	public static MethodHandle TTF_SetTextPosition$handle() {
		return TTF_SetTextPosition.HANDLE;
	}

	public static MemorySegment TTF_SetTextPosition$address() {
		return TTF_SetTextPosition.ADDR;
	}

	public static boolean TTF_SetTextPosition(MemorySegment text, int x, int y) {
		var mh$ = TTF_SetTextPosition.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_SetTextPosition", text, x, y);
			}
			return (boolean) mh$.invokeExact(text, x, y);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetTextPosition {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetTextPosition");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetTextPosition$descriptor() {
		return TTF_GetTextPosition.DESC;
	}

	public static MethodHandle TTF_GetTextPosition$handle() {
		return TTF_GetTextPosition.HANDLE;
	}

	public static MemorySegment TTF_GetTextPosition$address() {
		return TTF_GetTextPosition.ADDR;
	}

	public static boolean TTF_GetTextPosition(MemorySegment text, MemorySegment x, MemorySegment y) {
		var mh$ = TTF_GetTextPosition.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetTextPosition", text, x, y);
			}
			return (boolean) mh$.invokeExact(text, x, y);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_SetTextWrapWidth {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_SetTextWrapWidth");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_SetTextWrapWidth$descriptor() {
		return TTF_SetTextWrapWidth.DESC;
	}

	public static MethodHandle TTF_SetTextWrapWidth$handle() {
		return TTF_SetTextWrapWidth.HANDLE;
	}

	public static MemorySegment TTF_SetTextWrapWidth$address() {
		return TTF_SetTextWrapWidth.ADDR;
	}

	public static boolean TTF_SetTextWrapWidth(MemorySegment text, int wrap_width) {
		var mh$ = TTF_SetTextWrapWidth.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_SetTextWrapWidth", text, wrap_width);
			}
			return (boolean) mh$.invokeExact(text, wrap_width);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetTextWrapWidth {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetTextWrapWidth");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetTextWrapWidth$descriptor() {
		return TTF_GetTextWrapWidth.DESC;
	}

	public static MethodHandle TTF_GetTextWrapWidth$handle() {
		return TTF_GetTextWrapWidth.HANDLE;
	}

	public static MemorySegment TTF_GetTextWrapWidth$address() {
		return TTF_GetTextWrapWidth.ADDR;
	}

	public static boolean TTF_GetTextWrapWidth(MemorySegment text, MemorySegment wrap_width) {
		var mh$ = TTF_GetTextWrapWidth.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetTextWrapWidth", text, wrap_width);
			}
			return (boolean) mh$.invokeExact(text, wrap_width);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_SetTextWrapWhitespaceVisible {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_SetTextWrapWhitespaceVisible");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_SetTextWrapWhitespaceVisible$descriptor() {
		return TTF_SetTextWrapWhitespaceVisible.DESC;
	}

	public static MethodHandle TTF_SetTextWrapWhitespaceVisible$handle() {
		return TTF_SetTextWrapWhitespaceVisible.HANDLE;
	}

	public static MemorySegment TTF_SetTextWrapWhitespaceVisible$address() {
		return TTF_SetTextWrapWhitespaceVisible.ADDR;
	}

	public static boolean TTF_SetTextWrapWhitespaceVisible(MemorySegment text, boolean visible) {
		var mh$ = TTF_SetTextWrapWhitespaceVisible.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_SetTextWrapWhitespaceVisible", text, visible);
			}
			return (boolean) mh$.invokeExact(text, visible);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_TextWrapWhitespaceVisible {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_TextWrapWhitespaceVisible");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_TextWrapWhitespaceVisible$descriptor() {
		return TTF_TextWrapWhitespaceVisible.DESC;
	}

	public static MethodHandle TTF_TextWrapWhitespaceVisible$handle() {
		return TTF_TextWrapWhitespaceVisible.HANDLE;
	}

	public static MemorySegment TTF_TextWrapWhitespaceVisible$address() {
		return TTF_TextWrapWhitespaceVisible.ADDR;
	}

	public static boolean TTF_TextWrapWhitespaceVisible(MemorySegment text) {
		var mh$ = TTF_TextWrapWhitespaceVisible.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_TextWrapWhitespaceVisible", text);
			}
			return (boolean) mh$.invokeExact(text);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_SetTextString {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_SetTextString");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_SetTextString$descriptor() {
		return TTF_SetTextString.DESC;
	}

	public static MethodHandle TTF_SetTextString$handle() {
		return TTF_SetTextString.HANDLE;
	}

	public static MemorySegment TTF_SetTextString$address() {
		return TTF_SetTextString.ADDR;
	}

	public static boolean TTF_SetTextString(MemorySegment text, MemorySegment string, long length) {
		var mh$ = TTF_SetTextString.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_SetTextString", text, string, length);
			}
			return (boolean) mh$.invokeExact(text, string, length);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_InsertTextString {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_INT,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_InsertTextString");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_InsertTextString$descriptor() {
		return TTF_InsertTextString.DESC;
	}

	public static MethodHandle TTF_InsertTextString$handle() {
		return TTF_InsertTextString.HANDLE;
	}

	public static MemorySegment TTF_InsertTextString$address() {
		return TTF_InsertTextString.ADDR;
	}

	public static boolean TTF_InsertTextString(MemorySegment text, int offset, MemorySegment string, long length) {
		var mh$ = TTF_InsertTextString.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_InsertTextString", text, offset, string, length);
			}
			return (boolean) mh$.invokeExact(text, offset, string, length);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_AppendTextString {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_AppendTextString");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_AppendTextString$descriptor() {
		return TTF_AppendTextString.DESC;
	}

	public static MethodHandle TTF_AppendTextString$handle() {
		return TTF_AppendTextString.HANDLE;
	}

	public static MemorySegment TTF_AppendTextString$address() {
		return TTF_AppendTextString.ADDR;
	}

	public static boolean TTF_AppendTextString(MemorySegment text, MemorySegment string, long length) {
		var mh$ = TTF_AppendTextString.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_AppendTextString", text, string, length);
			}
			return (boolean) mh$.invokeExact(text, string, length);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_DeleteTextString {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_INT,
				SDL3Ttf.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_DeleteTextString");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_DeleteTextString$descriptor() {
		return TTF_DeleteTextString.DESC;
	}

	public static MethodHandle TTF_DeleteTextString$handle() {
		return TTF_DeleteTextString.HANDLE;
	}

	public static MemorySegment TTF_DeleteTextString$address() {
		return TTF_DeleteTextString.ADDR;
	}

	public static boolean TTF_DeleteTextString(MemorySegment text, int offset, int length) {
		var mh$ = TTF_DeleteTextString.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_DeleteTextString", text, offset, length);
			}
			return (boolean) mh$.invokeExact(text, offset, length);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetTextSize {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetTextSize");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetTextSize$descriptor() {
		return TTF_GetTextSize.DESC;
	}

	public static MethodHandle TTF_GetTextSize$handle() {
		return TTF_GetTextSize.HANDLE;
	}

	public static MemorySegment TTF_GetTextSize$address() {
		return TTF_GetTextSize.ADDR;
	}

	public static boolean TTF_GetTextSize(MemorySegment text, MemorySegment w, MemorySegment h) {
		var mh$ = TTF_GetTextSize.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetTextSize", text, w, h);
			}
			return (boolean) mh$.invokeExact(text, w, h);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	public static OfInt TTF_SubStringFlags = SDL3Ttf.C_INT;

	private static class TTF_GetTextSubString {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_INT,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetTextSubString");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetTextSubString$descriptor() {
		return TTF_GetTextSubString.DESC;
	}

	public static MethodHandle TTF_GetTextSubString$handle() {
		return TTF_GetTextSubString.HANDLE;
	}

	public static MemorySegment TTF_GetTextSubString$address() {
		return TTF_GetTextSubString.ADDR;
	}

	public static boolean TTF_GetTextSubString(MemorySegment text, int offset, MemorySegment substring) {
		var mh$ = TTF_GetTextSubString.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetTextSubString", text, offset, substring);
			}
			return (boolean) mh$.invokeExact(text, offset, substring);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetTextSubStringForLine {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_INT,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetTextSubStringForLine");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetTextSubStringForLine$descriptor() {
		return TTF_GetTextSubStringForLine.DESC;
	}

	public static MethodHandle TTF_GetTextSubStringForLine$handle() {
		return TTF_GetTextSubStringForLine.HANDLE;
	}

	public static MemorySegment TTF_GetTextSubStringForLine$address() {
		return TTF_GetTextSubStringForLine.ADDR;
	}

	public static boolean TTF_GetTextSubStringForLine(MemorySegment text, int line, MemorySegment substring) {
		var mh$ = TTF_GetTextSubStringForLine.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetTextSubStringForLine", text, line, substring);
			}
			return (boolean) mh$.invokeExact(text, line, substring);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetTextSubStringsForRange {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_INT,
				SDL3Ttf.C_INT,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetTextSubStringsForRange");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetTextSubStringsForRange$descriptor() {
		return TTF_GetTextSubStringsForRange.DESC;
	}

	public static MethodHandle TTF_GetTextSubStringsForRange$handle() {
		return TTF_GetTextSubStringsForRange.HANDLE;
	}

	public static MemorySegment TTF_GetTextSubStringsForRange$address() {
		return TTF_GetTextSubStringsForRange.ADDR;
	}

	public static MemorySegment TTF_GetTextSubStringsForRange(MemorySegment text, int offset, int length, MemorySegment count) {
		var mh$ = TTF_GetTextSubStringsForRange.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetTextSubStringsForRange", text, offset, length, count);
			}
			return (MemorySegment) mh$.invokeExact(text, offset, length, count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetTextSubStringForPoint {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_INT,
				SDL3Ttf.C_INT,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetTextSubStringForPoint");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetTextSubStringForPoint$descriptor() {
		return TTF_GetTextSubStringForPoint.DESC;
	}

	public static MethodHandle TTF_GetTextSubStringForPoint$handle() {
		return TTF_GetTextSubStringForPoint.HANDLE;
	}

	public static MemorySegment TTF_GetTextSubStringForPoint$address() {
		return TTF_GetTextSubStringForPoint.ADDR;
	}

	public static boolean TTF_GetTextSubStringForPoint(MemorySegment text, int x, int y, MemorySegment substring) {
		var mh$ = TTF_GetTextSubStringForPoint.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetTextSubStringForPoint", text, x, y, substring);
			}
			return (boolean) mh$.invokeExact(text, x, y, substring);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetPreviousTextSubString {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetPreviousTextSubString");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetPreviousTextSubString$descriptor() {
		return TTF_GetPreviousTextSubString.DESC;
	}

	public static MethodHandle TTF_GetPreviousTextSubString$handle() {
		return TTF_GetPreviousTextSubString.HANDLE;
	}

	public static MemorySegment TTF_GetPreviousTextSubString$address() {
		return TTF_GetPreviousTextSubString.ADDR;
	}

	public static boolean TTF_GetPreviousTextSubString(MemorySegment text, MemorySegment substring, MemorySegment previous) {
		var mh$ = TTF_GetPreviousTextSubString.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetPreviousTextSubString", text, substring, previous);
			}
			return (boolean) mh$.invokeExact(text, substring, previous);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_GetNextTextSubString {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_GetNextTextSubString");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_GetNextTextSubString$descriptor() {
		return TTF_GetNextTextSubString.DESC;
	}

	public static MethodHandle TTF_GetNextTextSubString$handle() {
		return TTF_GetNextTextSubString.HANDLE;
	}

	public static MemorySegment TTF_GetNextTextSubString$address() {
		return TTF_GetNextTextSubString.ADDR;
	}

	public static boolean TTF_GetNextTextSubString(MemorySegment text, MemorySegment substring, MemorySegment next) {
		var mh$ = TTF_GetNextTextSubString.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_GetNextTextSubString", text, substring, next);
			}
			return (boolean) mh$.invokeExact(text, substring, next);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_UpdateText {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_BOOL,
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_UpdateText");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_UpdateText$descriptor() {
		return TTF_UpdateText.DESC;
	}

	public static MethodHandle TTF_UpdateText$handle() {
		return TTF_UpdateText.HANDLE;
	}

	public static MemorySegment TTF_UpdateText$address() {
		return TTF_UpdateText.ADDR;
	}

	public static boolean TTF_UpdateText(MemorySegment text) {
		var mh$ = TTF_UpdateText.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_UpdateText", text);
			}
			return (boolean) mh$.invokeExact(text);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_DestroyText {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_DestroyText");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_DestroyText$descriptor() {
		return TTF_DestroyText.DESC;
	}

	public static MethodHandle TTF_DestroyText$handle() {
		return TTF_DestroyText.HANDLE;
	}

	public static MemorySegment TTF_DestroyText$address() {
		return TTF_DestroyText.ADDR;
	}

	public static void TTF_DestroyText(MemorySegment text) {
		var mh$ = TTF_DestroyText.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_DestroyText", text);
			}
			mh$.invokeExact(text);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_CloseFont {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3Ttf.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_CloseFont");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_CloseFont$descriptor() {
		return TTF_CloseFont.DESC;
	}

	public static MethodHandle TTF_CloseFont$handle() {
		return TTF_CloseFont.HANDLE;
	}

	public static MemorySegment TTF_CloseFont$address() {
		return TTF_CloseFont.ADDR;
	}

	public static void TTF_CloseFont(MemorySegment font) {
		var mh$ = TTF_CloseFont.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_CloseFont", font);
			}
			mh$.invokeExact(font);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_Quit {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid();

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_Quit");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_Quit$descriptor() {
		return TTF_Quit.DESC;
	}

	public static MethodHandle TTF_Quit$handle() {
		return TTF_Quit.HANDLE;
	}

	public static MemorySegment TTF_Quit$address() {
		return TTF_Quit.ADDR;
	}

	public static void TTF_Quit() {
		var mh$ = TTF_Quit.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_Quit");
			}
			mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class TTF_WasInit {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3Ttf.C_INT);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("TTF_WasInit");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor TTF_WasInit$descriptor() {
		return TTF_WasInit.DESC;
	}

	public static MethodHandle TTF_WasInit$handle() {
		return TTF_WasInit.HANDLE;
	}

	public static MemorySegment TTF_WasInit$address() {
		return TTF_WasInit.ADDR;
	}

	public static int TTF_WasInit() {
		var mh$ = TTF_WasInit.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("TTF_WasInit");
			}
			return (int) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static final int SDL_TTF_VERSION = (int) 3002002L;

	public static int SDL_TTF_VERSION() {
		return SDL_TTF_VERSION;
	}

	public static MemorySegment TTF_PROP_FONT_CREATE_FILENAME_STRING() {
		class Holder {
			static final MemorySegment TTF_PROP_FONT_CREATE_FILENAME_STRING
					= SDL3Ttf.LIBRARY_ARENA.allocateFrom("SDL_ttf.font.create.filename");
		}
		return Holder.TTF_PROP_FONT_CREATE_FILENAME_STRING;
	}

	public static MemorySegment TTF_PROP_FONT_CREATE_IOSTREAM_POINTER() {
		class Holder {
			static final MemorySegment TTF_PROP_FONT_CREATE_IOSTREAM_POINTER
					= SDL3Ttf.LIBRARY_ARENA.allocateFrom("SDL_ttf.font.create.iostream");
		}
		return Holder.TTF_PROP_FONT_CREATE_IOSTREAM_POINTER;
	}

	public static MemorySegment TTF_PROP_FONT_CREATE_IOSTREAM_OFFSET_NUMBER() {
		class Holder {
			static final MemorySegment TTF_PROP_FONT_CREATE_IOSTREAM_OFFSET_NUMBER
					= SDL3Ttf.LIBRARY_ARENA.allocateFrom("SDL_ttf.font.create.iostream.offset");
		}
		return Holder.TTF_PROP_FONT_CREATE_IOSTREAM_OFFSET_NUMBER;
	}

	public static MemorySegment TTF_PROP_FONT_CREATE_IOSTREAM_AUTOCLOSE_BOOLEAN() {
		class Holder {
			static final MemorySegment TTF_PROP_FONT_CREATE_IOSTREAM_AUTOCLOSE_BOOLEAN
					= SDL3Ttf.LIBRARY_ARENA.allocateFrom("SDL_ttf.font.create.iostream.autoclose");
		}
		return Holder.TTF_PROP_FONT_CREATE_IOSTREAM_AUTOCLOSE_BOOLEAN;
	}

	public static MemorySegment TTF_PROP_FONT_CREATE_SIZE_FLOAT() {
		class Holder {
			static final MemorySegment TTF_PROP_FONT_CREATE_SIZE_FLOAT
					= SDL3Ttf.LIBRARY_ARENA.allocateFrom("SDL_ttf.font.create.size");
		}
		return Holder.TTF_PROP_FONT_CREATE_SIZE_FLOAT;
	}

	public static MemorySegment TTF_PROP_FONT_CREATE_FACE_NUMBER() {
		class Holder {
			static final MemorySegment TTF_PROP_FONT_CREATE_FACE_NUMBER
					= SDL3Ttf.LIBRARY_ARENA.allocateFrom("SDL_ttf.font.create.face");
		}
		return Holder.TTF_PROP_FONT_CREATE_FACE_NUMBER;
	}

	public static MemorySegment TTF_PROP_FONT_CREATE_HORIZONTAL_DPI_NUMBER() {
		class Holder {
			static final MemorySegment TTF_PROP_FONT_CREATE_HORIZONTAL_DPI_NUMBER
					= SDL3Ttf.LIBRARY_ARENA.allocateFrom("SDL_ttf.font.create.hdpi");
		}
		return Holder.TTF_PROP_FONT_CREATE_HORIZONTAL_DPI_NUMBER;
	}

	public static MemorySegment TTF_PROP_FONT_CREATE_VERTICAL_DPI_NUMBER() {
		class Holder {
			static final MemorySegment TTF_PROP_FONT_CREATE_VERTICAL_DPI_NUMBER
					= SDL3Ttf.LIBRARY_ARENA.allocateFrom("SDL_ttf.font.create.vdpi");
		}
		return Holder.TTF_PROP_FONT_CREATE_VERTICAL_DPI_NUMBER;
	}

	public static MemorySegment TTF_PROP_FONT_CREATE_EXISTING_FONT() {
		class Holder {
			static final MemorySegment TTF_PROP_FONT_CREATE_EXISTING_FONT
					= SDL3Ttf.LIBRARY_ARENA.allocateFrom("SDL_ttf.font.create.existing_font");
		}
		return Holder.TTF_PROP_FONT_CREATE_EXISTING_FONT;
	}

	public static MemorySegment TTF_PROP_FONT_OUTLINE_LINE_CAP_NUMBER() {
		class Holder {
			static final MemorySegment TTF_PROP_FONT_OUTLINE_LINE_CAP_NUMBER
					= SDL3Ttf.LIBRARY_ARENA.allocateFrom("SDL_ttf.font.outline.line_cap");
		}
		return Holder.TTF_PROP_FONT_OUTLINE_LINE_CAP_NUMBER;
	}

	public static MemorySegment TTF_PROP_FONT_OUTLINE_LINE_JOIN_NUMBER() {
		class Holder {
			static final MemorySegment TTF_PROP_FONT_OUTLINE_LINE_JOIN_NUMBER
					= SDL3Ttf.LIBRARY_ARENA.allocateFrom("SDL_ttf.font.outline.line_join");
		}
		return Holder.TTF_PROP_FONT_OUTLINE_LINE_JOIN_NUMBER;
	}

	public static MemorySegment TTF_PROP_FONT_OUTLINE_MITER_LIMIT_NUMBER() {
		class Holder {
			static final MemorySegment TTF_PROP_FONT_OUTLINE_MITER_LIMIT_NUMBER
					= SDL3Ttf.LIBRARY_ARENA.allocateFrom("SDL_ttf.font.outline.miter_limit");
		}
		return Holder.TTF_PROP_FONT_OUTLINE_MITER_LIMIT_NUMBER;
	}

	public static MemorySegment TTF_PROP_RENDERER_TEXT_ENGINE_RENDERER() {
		class Holder {
			static final MemorySegment TTF_PROP_RENDERER_TEXT_ENGINE_RENDERER
					= SDL3Ttf.LIBRARY_ARENA.allocateFrom("SDL_ttf.renderer_text_engine.create.renderer");
		}
		return Holder.TTF_PROP_RENDERER_TEXT_ENGINE_RENDERER;
	}

	public static MemorySegment TTF_PROP_RENDERER_TEXT_ENGINE_ATLAS_TEXTURE_SIZE() {
		class Holder {
			static final MemorySegment TTF_PROP_RENDERER_TEXT_ENGINE_ATLAS_TEXTURE_SIZE
					= SDL3Ttf.LIBRARY_ARENA.allocateFrom("SDL_ttf.renderer_text_engine.create.atlas_texture_size");
		}
		return Holder.TTF_PROP_RENDERER_TEXT_ENGINE_ATLAS_TEXTURE_SIZE;
	}

	public static MemorySegment TTF_PROP_GPU_TEXT_ENGINE_DEVICE() {
		class Holder {
			static final MemorySegment TTF_PROP_GPU_TEXT_ENGINE_DEVICE
					= SDL3Ttf.LIBRARY_ARENA.allocateFrom("SDL_ttf.gpu_text_engine.create.device");
		}
		return Holder.TTF_PROP_GPU_TEXT_ENGINE_DEVICE;
	}

	public static MemorySegment TTF_PROP_GPU_TEXT_ENGINE_ATLAS_TEXTURE_SIZE() {
		class Holder {
			static final MemorySegment TTF_PROP_GPU_TEXT_ENGINE_ATLAS_TEXTURE_SIZE
					= SDL3Ttf.LIBRARY_ARENA.allocateFrom("SDL_ttf.gpu_text_engine.create.atlas_texture_size");
		}
		return Holder.TTF_PROP_GPU_TEXT_ENGINE_ATLAS_TEXTURE_SIZE;
	}
}
