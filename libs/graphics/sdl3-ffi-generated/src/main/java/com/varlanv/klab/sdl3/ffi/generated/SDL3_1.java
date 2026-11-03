package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;

class SDL3_1 extends SDL3_2 {

	SDL3_1() {

	}

	private static final int SDL_GPU_BLENDOP_ADD = (int) 1L;

	public static int SDL_GPU_BLENDOP_ADD() {
		return SDL_GPU_BLENDOP_ADD;
	}

	private static final int SDL_GPU_BLENDOP_SUBTRACT = (int) 2L;

	public static int SDL_GPU_BLENDOP_SUBTRACT() {
		return SDL_GPU_BLENDOP_SUBTRACT;
	}

	private static final int SDL_GPU_BLENDOP_REVERSE_SUBTRACT = (int) 3L;

	public static int SDL_GPU_BLENDOP_REVERSE_SUBTRACT() {
		return SDL_GPU_BLENDOP_REVERSE_SUBTRACT;
	}

	private static final int SDL_GPU_BLENDOP_MIN = (int) 4L;

	public static int SDL_GPU_BLENDOP_MIN() {
		return SDL_GPU_BLENDOP_MIN;
	}

	private static final int SDL_GPU_BLENDOP_MAX = (int) 5L;

	public static int SDL_GPU_BLENDOP_MAX() {
		return SDL_GPU_BLENDOP_MAX;
	}

	private static final int SDL_GPU_BLENDFACTOR_INVALID = (int) 0L;

	public static int SDL_GPU_BLENDFACTOR_INVALID() {
		return SDL_GPU_BLENDFACTOR_INVALID;
	}

	private static final int SDL_GPU_BLENDFACTOR_ZERO = (int) 1L;

	public static int SDL_GPU_BLENDFACTOR_ZERO() {
		return SDL_GPU_BLENDFACTOR_ZERO;
	}

	private static final int SDL_GPU_BLENDFACTOR_ONE = (int) 2L;

	public static int SDL_GPU_BLENDFACTOR_ONE() {
		return SDL_GPU_BLENDFACTOR_ONE;
	}

	private static final int SDL_GPU_BLENDFACTOR_SRC_COLOR = (int) 3L;

	public static int SDL_GPU_BLENDFACTOR_SRC_COLOR() {
		return SDL_GPU_BLENDFACTOR_SRC_COLOR;
	}

	private static final int SDL_GPU_BLENDFACTOR_ONE_MINUS_SRC_COLOR = (int) 4L;

	public static int SDL_GPU_BLENDFACTOR_ONE_MINUS_SRC_COLOR() {
		return SDL_GPU_BLENDFACTOR_ONE_MINUS_SRC_COLOR;
	}

	private static final int SDL_GPU_BLENDFACTOR_DST_COLOR = (int) 5L;

	public static int SDL_GPU_BLENDFACTOR_DST_COLOR() {
		return SDL_GPU_BLENDFACTOR_DST_COLOR;
	}

	private static final int SDL_GPU_BLENDFACTOR_ONE_MINUS_DST_COLOR = (int) 6L;

	public static int SDL_GPU_BLENDFACTOR_ONE_MINUS_DST_COLOR() {
		return SDL_GPU_BLENDFACTOR_ONE_MINUS_DST_COLOR;
	}

	private static final int SDL_GPU_BLENDFACTOR_SRC_ALPHA = (int) 7L;

	public static int SDL_GPU_BLENDFACTOR_SRC_ALPHA() {
		return SDL_GPU_BLENDFACTOR_SRC_ALPHA;
	}

	private static final int SDL_GPU_BLENDFACTOR_ONE_MINUS_SRC_ALPHA = (int) 8L;

	public static int SDL_GPU_BLENDFACTOR_ONE_MINUS_SRC_ALPHA() {
		return SDL_GPU_BLENDFACTOR_ONE_MINUS_SRC_ALPHA;
	}

	private static final int SDL_GPU_BLENDFACTOR_DST_ALPHA = (int) 9L;

	public static int SDL_GPU_BLENDFACTOR_DST_ALPHA() {
		return SDL_GPU_BLENDFACTOR_DST_ALPHA;
	}

	private static final int SDL_GPU_BLENDFACTOR_ONE_MINUS_DST_ALPHA = (int) 10L;

	public static int SDL_GPU_BLENDFACTOR_ONE_MINUS_DST_ALPHA() {
		return SDL_GPU_BLENDFACTOR_ONE_MINUS_DST_ALPHA;
	}

	private static final int SDL_GPU_BLENDFACTOR_CONSTANT_COLOR = (int) 11L;

	public static int SDL_GPU_BLENDFACTOR_CONSTANT_COLOR() {
		return SDL_GPU_BLENDFACTOR_CONSTANT_COLOR;
	}

	private static final int SDL_GPU_BLENDFACTOR_ONE_MINUS_CONSTANT_COLOR = (int) 12L;

	public static int SDL_GPU_BLENDFACTOR_ONE_MINUS_CONSTANT_COLOR() {
		return SDL_GPU_BLENDFACTOR_ONE_MINUS_CONSTANT_COLOR;
	}

	private static final int SDL_GPU_BLENDFACTOR_SRC_ALPHA_SATURATE = (int) 13L;

	public static int SDL_GPU_BLENDFACTOR_SRC_ALPHA_SATURATE() {
		return SDL_GPU_BLENDFACTOR_SRC_ALPHA_SATURATE;
	}

	public static OfByte SDL_GPUColorComponentFlags = SDL3.C_CHAR;
	private static final int SDL_GPU_FILTER_NEAREST = (int) 0L;

	public static int SDL_GPU_FILTER_NEAREST() {
		return SDL_GPU_FILTER_NEAREST;
	}

	private static final int SDL_GPU_FILTER_LINEAR = (int) 1L;

	public static int SDL_GPU_FILTER_LINEAR() {
		return SDL_GPU_FILTER_LINEAR;
	}

	private static final int SDL_GPU_SAMPLERMIPMAPMODE_NEAREST = (int) 0L;

	public static int SDL_GPU_SAMPLERMIPMAPMODE_NEAREST() {
		return SDL_GPU_SAMPLERMIPMAPMODE_NEAREST;
	}

	private static final int SDL_GPU_SAMPLERMIPMAPMODE_LINEAR = (int) 1L;

	public static int SDL_GPU_SAMPLERMIPMAPMODE_LINEAR() {
		return SDL_GPU_SAMPLERMIPMAPMODE_LINEAR;
	}

	private static final int SDL_GPU_SAMPLERADDRESSMODE_REPEAT = (int) 0L;

	public static int SDL_GPU_SAMPLERADDRESSMODE_REPEAT() {
		return SDL_GPU_SAMPLERADDRESSMODE_REPEAT;
	}

	private static final int SDL_GPU_SAMPLERADDRESSMODE_MIRRORED_REPEAT = (int) 1L;

	public static int SDL_GPU_SAMPLERADDRESSMODE_MIRRORED_REPEAT() {
		return SDL_GPU_SAMPLERADDRESSMODE_MIRRORED_REPEAT;
	}

	private static final int SDL_GPU_SAMPLERADDRESSMODE_CLAMP_TO_EDGE = (int) 2L;

	public static int SDL_GPU_SAMPLERADDRESSMODE_CLAMP_TO_EDGE() {
		return SDL_GPU_SAMPLERADDRESSMODE_CLAMP_TO_EDGE;
	}

	private static final int SDL_GPU_PRESENTMODE_VSYNC = (int) 0L;

	public static int SDL_GPU_PRESENTMODE_VSYNC() {
		return SDL_GPU_PRESENTMODE_VSYNC;
	}

	private static final int SDL_GPU_PRESENTMODE_IMMEDIATE = (int) 1L;

	public static int SDL_GPU_PRESENTMODE_IMMEDIATE() {
		return SDL_GPU_PRESENTMODE_IMMEDIATE;
	}

	private static final int SDL_GPU_PRESENTMODE_MAILBOX = (int) 2L;

	public static int SDL_GPU_PRESENTMODE_MAILBOX() {
		return SDL_GPU_PRESENTMODE_MAILBOX;
	}

	private static final int SDL_GPU_SWAPCHAINCOMPOSITION_SDR = (int) 0L;

	public static int SDL_GPU_SWAPCHAINCOMPOSITION_SDR() {
		return SDL_GPU_SWAPCHAINCOMPOSITION_SDR;
	}

	private static final int SDL_GPU_SWAPCHAINCOMPOSITION_SDR_LINEAR = (int) 1L;

	public static int SDL_GPU_SWAPCHAINCOMPOSITION_SDR_LINEAR() {
		return SDL_GPU_SWAPCHAINCOMPOSITION_SDR_LINEAR;
	}

	private static final int SDL_GPU_SWAPCHAINCOMPOSITION_HDR_EXTENDED_LINEAR = (int) 2L;

	public static int SDL_GPU_SWAPCHAINCOMPOSITION_HDR_EXTENDED_LINEAR() {
		return SDL_GPU_SWAPCHAINCOMPOSITION_HDR_EXTENDED_LINEAR;
	}

	private static final int SDL_GPU_SWAPCHAINCOMPOSITION_HDR10_ST2084 = (int) 3L;

	public static int SDL_GPU_SWAPCHAINCOMPOSITION_HDR10_ST2084() {
		return SDL_GPU_SWAPCHAINCOMPOSITION_HDR10_ST2084;
	}

	private static class SDL_GPUSupportsShaderFormats {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GPUSupportsShaderFormats");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GPUSupportsShaderFormats$descriptor() {
		return SDL_GPUSupportsShaderFormats.DESC;
	}

	public static MethodHandle SDL_GPUSupportsShaderFormats$handle() {
		return SDL_GPUSupportsShaderFormats.HANDLE;
	}

	public static MemorySegment SDL_GPUSupportsShaderFormats$address() {
		return SDL_GPUSupportsShaderFormats.ADDR;
	}

	public static boolean SDL_GPUSupportsShaderFormats(int format_flags, MemorySegment name) {
		var mh$ = SDL_GPUSupportsShaderFormats.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GPUSupportsShaderFormats", format_flags, name);
			}
			return (boolean) mh$.invokeExact(format_flags, name);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GPUSupportsProperties {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GPUSupportsProperties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GPUSupportsProperties$descriptor() {
		return SDL_GPUSupportsProperties.DESC;
	}

	public static MethodHandle SDL_GPUSupportsProperties$handle() {
		return SDL_GPUSupportsProperties.HANDLE;
	}

	public static MemorySegment SDL_GPUSupportsProperties$address() {
		return SDL_GPUSupportsProperties.ADDR;
	}

	public static boolean SDL_GPUSupportsProperties(int props) {
		var mh$ = SDL_GPUSupportsProperties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GPUSupportsProperties", props);
			}
			return (boolean) mh$.invokeExact(props);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateGPUDevice {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateGPUDevice");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateGPUDevice$descriptor() {
		return SDL_CreateGPUDevice.DESC;
	}

	public static MethodHandle SDL_CreateGPUDevice$handle() {
		return SDL_CreateGPUDevice.HANDLE;
	}

	public static MemorySegment SDL_CreateGPUDevice$address() {
		return SDL_CreateGPUDevice.ADDR;
	}

	public static MemorySegment SDL_CreateGPUDevice(int format_flags, boolean debug_mode, MemorySegment name) {
		var mh$ = SDL_CreateGPUDevice.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateGPUDevice", format_flags, debug_mode, name);
			}
			return (MemorySegment) mh$.invokeExact(format_flags, debug_mode, name);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateGPUDeviceWithProperties {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateGPUDeviceWithProperties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateGPUDeviceWithProperties$descriptor() {
		return SDL_CreateGPUDeviceWithProperties.DESC;
	}

	public static MethodHandle SDL_CreateGPUDeviceWithProperties$handle() {
		return SDL_CreateGPUDeviceWithProperties.HANDLE;
	}

	public static MemorySegment SDL_CreateGPUDeviceWithProperties$address() {
		return SDL_CreateGPUDeviceWithProperties.ADDR;
	}

	public static MemorySegment SDL_CreateGPUDeviceWithProperties(int props) {
		var mh$ = SDL_CreateGPUDeviceWithProperties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateGPUDeviceWithProperties", props);
			}
			return (MemorySegment) mh$.invokeExact(props);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DestroyGPUDevice {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DestroyGPUDevice");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DestroyGPUDevice$descriptor() {
		return SDL_DestroyGPUDevice.DESC;
	}

	public static MethodHandle SDL_DestroyGPUDevice$handle() {
		return SDL_DestroyGPUDevice.HANDLE;
	}

	public static MemorySegment SDL_DestroyGPUDevice$address() {
		return SDL_DestroyGPUDevice.ADDR;
	}

	public static void SDL_DestroyGPUDevice(MemorySegment device) {
		var mh$ = SDL_DestroyGPUDevice.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DestroyGPUDevice", device);
			}
			mh$.invokeExact(device);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetNumGPUDrivers {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetNumGPUDrivers");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetNumGPUDrivers$descriptor() {
		return SDL_GetNumGPUDrivers.DESC;
	}

	public static MethodHandle SDL_GetNumGPUDrivers$handle() {
		return SDL_GetNumGPUDrivers.HANDLE;
	}

	public static MemorySegment SDL_GetNumGPUDrivers$address() {
		return SDL_GetNumGPUDrivers.ADDR;
	}

	public static int SDL_GetNumGPUDrivers() {
		var mh$ = SDL_GetNumGPUDrivers.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetNumGPUDrivers");
			}
			return (int) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGPUDriver {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGPUDriver");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGPUDriver$descriptor() {
		return SDL_GetGPUDriver.DESC;
	}

	public static MethodHandle SDL_GetGPUDriver$handle() {
		return SDL_GetGPUDriver.HANDLE;
	}

	public static MemorySegment SDL_GetGPUDriver$address() {
		return SDL_GetGPUDriver.ADDR;
	}

	public static MemorySegment SDL_GetGPUDriver(int index) {
		var mh$ = SDL_GetGPUDriver.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGPUDriver", index);
			}
			return (MemorySegment) mh$.invokeExact(index);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGPUDeviceDriver {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGPUDeviceDriver");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGPUDeviceDriver$descriptor() {
		return SDL_GetGPUDeviceDriver.DESC;
	}

	public static MethodHandle SDL_GetGPUDeviceDriver$handle() {
		return SDL_GetGPUDeviceDriver.HANDLE;
	}

	public static MemorySegment SDL_GetGPUDeviceDriver$address() {
		return SDL_GetGPUDeviceDriver.ADDR;
	}

	public static MemorySegment SDL_GetGPUDeviceDriver(MemorySegment device) {
		var mh$ = SDL_GetGPUDeviceDriver.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGPUDeviceDriver", device);
			}
			return (MemorySegment) mh$.invokeExact(device);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGPUShaderFormats {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGPUShaderFormats");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGPUShaderFormats$descriptor() {
		return SDL_GetGPUShaderFormats.DESC;
	}

	public static MethodHandle SDL_GetGPUShaderFormats$handle() {
		return SDL_GetGPUShaderFormats.HANDLE;
	}

	public static MemorySegment SDL_GetGPUShaderFormats$address() {
		return SDL_GetGPUShaderFormats.ADDR;
	}

	public static int SDL_GetGPUShaderFormats(MemorySegment device) {
		var mh$ = SDL_GetGPUShaderFormats.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGPUShaderFormats", device);
			}
			return (int) mh$.invokeExact(device);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGPUDeviceProperties {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGPUDeviceProperties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGPUDeviceProperties$descriptor() {
		return SDL_GetGPUDeviceProperties.DESC;
	}

	public static MethodHandle SDL_GetGPUDeviceProperties$handle() {
		return SDL_GetGPUDeviceProperties.HANDLE;
	}

	public static MemorySegment SDL_GetGPUDeviceProperties$address() {
		return SDL_GetGPUDeviceProperties.ADDR;
	}

	public static int SDL_GetGPUDeviceProperties(MemorySegment device) {
		var mh$ = SDL_GetGPUDeviceProperties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGPUDeviceProperties", device);
			}
			return (int) mh$.invokeExact(device);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateGPUComputePipeline {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateGPUComputePipeline");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateGPUComputePipeline$descriptor() {
		return SDL_CreateGPUComputePipeline.DESC;
	}

	public static MethodHandle SDL_CreateGPUComputePipeline$handle() {
		return SDL_CreateGPUComputePipeline.HANDLE;
	}

	public static MemorySegment SDL_CreateGPUComputePipeline$address() {
		return SDL_CreateGPUComputePipeline.ADDR;
	}

	public static MemorySegment SDL_CreateGPUComputePipeline(MemorySegment device, MemorySegment createinfo) {
		var mh$ = SDL_CreateGPUComputePipeline.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateGPUComputePipeline", device, createinfo);
			}
			return (MemorySegment) mh$.invokeExact(device, createinfo);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateGPUGraphicsPipeline {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateGPUGraphicsPipeline");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateGPUGraphicsPipeline$descriptor() {
		return SDL_CreateGPUGraphicsPipeline.DESC;
	}

	public static MethodHandle SDL_CreateGPUGraphicsPipeline$handle() {
		return SDL_CreateGPUGraphicsPipeline.HANDLE;
	}

	public static MemorySegment SDL_CreateGPUGraphicsPipeline$address() {
		return SDL_CreateGPUGraphicsPipeline.ADDR;
	}

	public static MemorySegment SDL_CreateGPUGraphicsPipeline(MemorySegment device, MemorySegment createinfo) {
		var mh$ = SDL_CreateGPUGraphicsPipeline.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateGPUGraphicsPipeline", device, createinfo);
			}
			return (MemorySegment) mh$.invokeExact(device, createinfo);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateGPUSampler {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateGPUSampler");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateGPUSampler$descriptor() {
		return SDL_CreateGPUSampler.DESC;
	}

	public static MethodHandle SDL_CreateGPUSampler$handle() {
		return SDL_CreateGPUSampler.HANDLE;
	}

	public static MemorySegment SDL_CreateGPUSampler$address() {
		return SDL_CreateGPUSampler.ADDR;
	}

	public static MemorySegment SDL_CreateGPUSampler(MemorySegment device, MemorySegment createinfo) {
		var mh$ = SDL_CreateGPUSampler.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateGPUSampler", device, createinfo);
			}
			return (MemorySegment) mh$.invokeExact(device, createinfo);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateGPUShader {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateGPUShader");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateGPUShader$descriptor() {
		return SDL_CreateGPUShader.DESC;
	}

	public static MethodHandle SDL_CreateGPUShader$handle() {
		return SDL_CreateGPUShader.HANDLE;
	}

	public static MemorySegment SDL_CreateGPUShader$address() {
		return SDL_CreateGPUShader.ADDR;
	}

	public static MemorySegment SDL_CreateGPUShader(MemorySegment device, MemorySegment createinfo) {
		var mh$ = SDL_CreateGPUShader.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateGPUShader", device, createinfo);
			}
			return (MemorySegment) mh$.invokeExact(device, createinfo);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateGPUTexture {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateGPUTexture");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateGPUTexture$descriptor() {
		return SDL_CreateGPUTexture.DESC;
	}

	public static MethodHandle SDL_CreateGPUTexture$handle() {
		return SDL_CreateGPUTexture.HANDLE;
	}

	public static MemorySegment SDL_CreateGPUTexture$address() {
		return SDL_CreateGPUTexture.ADDR;
	}

	public static MemorySegment SDL_CreateGPUTexture(MemorySegment device, MemorySegment createinfo) {
		var mh$ = SDL_CreateGPUTexture.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateGPUTexture", device, createinfo);
			}
			return (MemorySegment) mh$.invokeExact(device, createinfo);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateGPUBuffer {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateGPUBuffer");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateGPUBuffer$descriptor() {
		return SDL_CreateGPUBuffer.DESC;
	}

	public static MethodHandle SDL_CreateGPUBuffer$handle() {
		return SDL_CreateGPUBuffer.HANDLE;
	}

	public static MemorySegment SDL_CreateGPUBuffer$address() {
		return SDL_CreateGPUBuffer.ADDR;
	}

	public static MemorySegment SDL_CreateGPUBuffer(MemorySegment device, MemorySegment createinfo) {
		var mh$ = SDL_CreateGPUBuffer.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateGPUBuffer", device, createinfo);
			}
			return (MemorySegment) mh$.invokeExact(device, createinfo);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateGPUTransferBuffer {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateGPUTransferBuffer");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateGPUTransferBuffer$descriptor() {
		return SDL_CreateGPUTransferBuffer.DESC;
	}

	public static MethodHandle SDL_CreateGPUTransferBuffer$handle() {
		return SDL_CreateGPUTransferBuffer.HANDLE;
	}

	public static MemorySegment SDL_CreateGPUTransferBuffer$address() {
		return SDL_CreateGPUTransferBuffer.ADDR;
	}

	public static MemorySegment SDL_CreateGPUTransferBuffer(MemorySegment device, MemorySegment createinfo) {
		var mh$ = SDL_CreateGPUTransferBuffer.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateGPUTransferBuffer", device, createinfo);
			}
			return (MemorySegment) mh$.invokeExact(device, createinfo);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetGPUBufferName {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetGPUBufferName");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetGPUBufferName$descriptor() {
		return SDL_SetGPUBufferName.DESC;
	}

	public static MethodHandle SDL_SetGPUBufferName$handle() {
		return SDL_SetGPUBufferName.HANDLE;
	}

	public static MemorySegment SDL_SetGPUBufferName$address() {
		return SDL_SetGPUBufferName.ADDR;
	}

	public static void SDL_SetGPUBufferName(MemorySegment device, MemorySegment buffer, MemorySegment text) {
		var mh$ = SDL_SetGPUBufferName.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetGPUBufferName", device, buffer, text);
			}
			mh$.invokeExact(device, buffer, text);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetGPUTextureName {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetGPUTextureName");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetGPUTextureName$descriptor() {
		return SDL_SetGPUTextureName.DESC;
	}

	public static MethodHandle SDL_SetGPUTextureName$handle() {
		return SDL_SetGPUTextureName.HANDLE;
	}

	public static MemorySegment SDL_SetGPUTextureName$address() {
		return SDL_SetGPUTextureName.ADDR;
	}

	public static void SDL_SetGPUTextureName(MemorySegment device, MemorySegment texture, MemorySegment text) {
		var mh$ = SDL_SetGPUTextureName.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetGPUTextureName", device, texture, text);
			}
			mh$.invokeExact(device, texture, text);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_InsertGPUDebugLabel {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_InsertGPUDebugLabel");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_InsertGPUDebugLabel$descriptor() {
		return SDL_InsertGPUDebugLabel.DESC;
	}

	public static MethodHandle SDL_InsertGPUDebugLabel$handle() {
		return SDL_InsertGPUDebugLabel.HANDLE;
	}

	public static MemorySegment SDL_InsertGPUDebugLabel$address() {
		return SDL_InsertGPUDebugLabel.ADDR;
	}

	public static void SDL_InsertGPUDebugLabel(MemorySegment command_buffer, MemorySegment text) {
		var mh$ = SDL_InsertGPUDebugLabel.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_InsertGPUDebugLabel", command_buffer, text);
			}
			mh$.invokeExact(command_buffer, text);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_PushGPUDebugGroup {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_PushGPUDebugGroup");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_PushGPUDebugGroup$descriptor() {
		return SDL_PushGPUDebugGroup.DESC;
	}

	public static MethodHandle SDL_PushGPUDebugGroup$handle() {
		return SDL_PushGPUDebugGroup.HANDLE;
	}

	public static MemorySegment SDL_PushGPUDebugGroup$address() {
		return SDL_PushGPUDebugGroup.ADDR;
	}

	public static void SDL_PushGPUDebugGroup(MemorySegment command_buffer, MemorySegment name) {
		var mh$ = SDL_PushGPUDebugGroup.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_PushGPUDebugGroup", command_buffer, name);
			}
			mh$.invokeExact(command_buffer, name);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_PopGPUDebugGroup {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_PopGPUDebugGroup");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_PopGPUDebugGroup$descriptor() {
		return SDL_PopGPUDebugGroup.DESC;
	}

	public static MethodHandle SDL_PopGPUDebugGroup$handle() {
		return SDL_PopGPUDebugGroup.HANDLE;
	}

	public static MemorySegment SDL_PopGPUDebugGroup$address() {
		return SDL_PopGPUDebugGroup.ADDR;
	}

	public static void SDL_PopGPUDebugGroup(MemorySegment command_buffer) {
		var mh$ = SDL_PopGPUDebugGroup.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_PopGPUDebugGroup", command_buffer);
			}
			mh$.invokeExact(command_buffer);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ReleaseGPUTexture {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ReleaseGPUTexture");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ReleaseGPUTexture$descriptor() {
		return SDL_ReleaseGPUTexture.DESC;
	}

	public static MethodHandle SDL_ReleaseGPUTexture$handle() {
		return SDL_ReleaseGPUTexture.HANDLE;
	}

	public static MemorySegment SDL_ReleaseGPUTexture$address() {
		return SDL_ReleaseGPUTexture.ADDR;
	}

	public static void SDL_ReleaseGPUTexture(MemorySegment device, MemorySegment texture) {
		var mh$ = SDL_ReleaseGPUTexture.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ReleaseGPUTexture", device, texture);
			}
			mh$.invokeExact(device, texture);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ReleaseGPUSampler {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ReleaseGPUSampler");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ReleaseGPUSampler$descriptor() {
		return SDL_ReleaseGPUSampler.DESC;
	}

	public static MethodHandle SDL_ReleaseGPUSampler$handle() {
		return SDL_ReleaseGPUSampler.HANDLE;
	}

	public static MemorySegment SDL_ReleaseGPUSampler$address() {
		return SDL_ReleaseGPUSampler.ADDR;
	}

	public static void SDL_ReleaseGPUSampler(MemorySegment device, MemorySegment sampler) {
		var mh$ = SDL_ReleaseGPUSampler.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ReleaseGPUSampler", device, sampler);
			}
			mh$.invokeExact(device, sampler);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ReleaseGPUBuffer {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ReleaseGPUBuffer");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ReleaseGPUBuffer$descriptor() {
		return SDL_ReleaseGPUBuffer.DESC;
	}

	public static MethodHandle SDL_ReleaseGPUBuffer$handle() {
		return SDL_ReleaseGPUBuffer.HANDLE;
	}

	public static MemorySegment SDL_ReleaseGPUBuffer$address() {
		return SDL_ReleaseGPUBuffer.ADDR;
	}

	public static void SDL_ReleaseGPUBuffer(MemorySegment device, MemorySegment buffer) {
		var mh$ = SDL_ReleaseGPUBuffer.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ReleaseGPUBuffer", device, buffer);
			}
			mh$.invokeExact(device, buffer);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ReleaseGPUTransferBuffer {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ReleaseGPUTransferBuffer");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ReleaseGPUTransferBuffer$descriptor() {
		return SDL_ReleaseGPUTransferBuffer.DESC;
	}

	public static MethodHandle SDL_ReleaseGPUTransferBuffer$handle() {
		return SDL_ReleaseGPUTransferBuffer.HANDLE;
	}

	public static MemorySegment SDL_ReleaseGPUTransferBuffer$address() {
		return SDL_ReleaseGPUTransferBuffer.ADDR;
	}

	public static void SDL_ReleaseGPUTransferBuffer(MemorySegment device, MemorySegment transfer_buffer) {
		var mh$ = SDL_ReleaseGPUTransferBuffer.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ReleaseGPUTransferBuffer", device, transfer_buffer);
			}
			mh$.invokeExact(device, transfer_buffer);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ReleaseGPUComputePipeline {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ReleaseGPUComputePipeline");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ReleaseGPUComputePipeline$descriptor() {
		return SDL_ReleaseGPUComputePipeline.DESC;
	}

	public static MethodHandle SDL_ReleaseGPUComputePipeline$handle() {
		return SDL_ReleaseGPUComputePipeline.HANDLE;
	}

	public static MemorySegment SDL_ReleaseGPUComputePipeline$address() {
		return SDL_ReleaseGPUComputePipeline.ADDR;
	}

	public static void SDL_ReleaseGPUComputePipeline(MemorySegment device, MemorySegment compute_pipeline) {
		var mh$ = SDL_ReleaseGPUComputePipeline.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ReleaseGPUComputePipeline", device, compute_pipeline);
			}
			mh$.invokeExact(device, compute_pipeline);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ReleaseGPUShader {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ReleaseGPUShader");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ReleaseGPUShader$descriptor() {
		return SDL_ReleaseGPUShader.DESC;
	}

	public static MethodHandle SDL_ReleaseGPUShader$handle() {
		return SDL_ReleaseGPUShader.HANDLE;
	}

	public static MemorySegment SDL_ReleaseGPUShader$address() {
		return SDL_ReleaseGPUShader.ADDR;
	}

	public static void SDL_ReleaseGPUShader(MemorySegment device, MemorySegment shader) {
		var mh$ = SDL_ReleaseGPUShader.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ReleaseGPUShader", device, shader);
			}
			mh$.invokeExact(device, shader);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ReleaseGPUGraphicsPipeline {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ReleaseGPUGraphicsPipeline");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ReleaseGPUGraphicsPipeline$descriptor() {
		return SDL_ReleaseGPUGraphicsPipeline.DESC;
	}

	public static MethodHandle SDL_ReleaseGPUGraphicsPipeline$handle() {
		return SDL_ReleaseGPUGraphicsPipeline.HANDLE;
	}

	public static MemorySegment SDL_ReleaseGPUGraphicsPipeline$address() {
		return SDL_ReleaseGPUGraphicsPipeline.ADDR;
	}

	public static void SDL_ReleaseGPUGraphicsPipeline(MemorySegment device, MemorySegment graphics_pipeline) {
		var mh$ = SDL_ReleaseGPUGraphicsPipeline.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ReleaseGPUGraphicsPipeline", device, graphics_pipeline);
			}
			mh$.invokeExact(device, graphics_pipeline);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_AcquireGPUCommandBuffer {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_AcquireGPUCommandBuffer");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_AcquireGPUCommandBuffer$descriptor() {
		return SDL_AcquireGPUCommandBuffer.DESC;
	}

	public static MethodHandle SDL_AcquireGPUCommandBuffer$handle() {
		return SDL_AcquireGPUCommandBuffer.HANDLE;
	}

	public static MemorySegment SDL_AcquireGPUCommandBuffer$address() {
		return SDL_AcquireGPUCommandBuffer.ADDR;
	}

	public static MemorySegment SDL_AcquireGPUCommandBuffer(MemorySegment device) {
		var mh$ = SDL_AcquireGPUCommandBuffer.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_AcquireGPUCommandBuffer", device);
			}
			return (MemorySegment) mh$.invokeExact(device);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_PushGPUVertexUniformData {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_PushGPUVertexUniformData");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_PushGPUVertexUniformData$descriptor() {
		return SDL_PushGPUVertexUniformData.DESC;
	}

	public static MethodHandle SDL_PushGPUVertexUniformData$handle() {
		return SDL_PushGPUVertexUniformData.HANDLE;
	}

	public static MemorySegment SDL_PushGPUVertexUniformData$address() {
		return SDL_PushGPUVertexUniformData.ADDR;
	}

	public static void SDL_PushGPUVertexUniformData(MemorySegment command_buffer, int slot_index, MemorySegment data, int length) {
		var mh$ = SDL_PushGPUVertexUniformData.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_PushGPUVertexUniformData", command_buffer, slot_index, data, length);
			}
			mh$.invokeExact(command_buffer, slot_index, data, length);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_PushGPUFragmentUniformData {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_PushGPUFragmentUniformData");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_PushGPUFragmentUniformData$descriptor() {
		return SDL_PushGPUFragmentUniformData.DESC;
	}

	public static MethodHandle SDL_PushGPUFragmentUniformData$handle() {
		return SDL_PushGPUFragmentUniformData.HANDLE;
	}

	public static MemorySegment SDL_PushGPUFragmentUniformData$address() {
		return SDL_PushGPUFragmentUniformData.ADDR;
	}

	public static void SDL_PushGPUFragmentUniformData(MemorySegment command_buffer, int slot_index, MemorySegment data, int length) {
		var mh$ = SDL_PushGPUFragmentUniformData.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_PushGPUFragmentUniformData", command_buffer, slot_index, data, length);
			}
			mh$.invokeExact(command_buffer, slot_index, data, length);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_PushGPUComputeUniformData {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_PushGPUComputeUniformData");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_PushGPUComputeUniformData$descriptor() {
		return SDL_PushGPUComputeUniformData.DESC;
	}

	public static MethodHandle SDL_PushGPUComputeUniformData$handle() {
		return SDL_PushGPUComputeUniformData.HANDLE;
	}

	public static MemorySegment SDL_PushGPUComputeUniformData$address() {
		return SDL_PushGPUComputeUniformData.ADDR;
	}

	public static void SDL_PushGPUComputeUniformData(MemorySegment command_buffer, int slot_index, MemorySegment data, int length) {
		var mh$ = SDL_PushGPUComputeUniformData.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_PushGPUComputeUniformData", command_buffer, slot_index, data, length);
			}
			mh$.invokeExact(command_buffer, slot_index, data, length);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_BeginGPURenderPass {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_BeginGPURenderPass");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_BeginGPURenderPass$descriptor() {
		return SDL_BeginGPURenderPass.DESC;
	}

	public static MethodHandle SDL_BeginGPURenderPass$handle() {
		return SDL_BeginGPURenderPass.HANDLE;
	}

	public static MemorySegment SDL_BeginGPURenderPass$address() {
		return SDL_BeginGPURenderPass.ADDR;
	}

	public static MemorySegment SDL_BeginGPURenderPass(MemorySegment command_buffer, MemorySegment color_target_infos, int num_color_targets, MemorySegment depth_stencil_target_info) {
		var mh$ = SDL_BeginGPURenderPass.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_BeginGPURenderPass", command_buffer, color_target_infos, num_color_targets, depth_stencil_target_info);
			}
			return (MemorySegment) mh$.invokeExact(command_buffer, color_target_infos, num_color_targets, depth_stencil_target_info);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_BindGPUGraphicsPipeline {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_BindGPUGraphicsPipeline");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_BindGPUGraphicsPipeline$descriptor() {
		return SDL_BindGPUGraphicsPipeline.DESC;
	}

	public static MethodHandle SDL_BindGPUGraphicsPipeline$handle() {
		return SDL_BindGPUGraphicsPipeline.HANDLE;
	}

	public static MemorySegment SDL_BindGPUGraphicsPipeline$address() {
		return SDL_BindGPUGraphicsPipeline.ADDR;
	}

	public static void SDL_BindGPUGraphicsPipeline(MemorySegment render_pass, MemorySegment graphics_pipeline) {
		var mh$ = SDL_BindGPUGraphicsPipeline.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_BindGPUGraphicsPipeline", render_pass, graphics_pipeline);
			}
			mh$.invokeExact(render_pass, graphics_pipeline);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetGPUViewport {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetGPUViewport");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetGPUViewport$descriptor() {
		return SDL_SetGPUViewport.DESC;
	}

	public static MethodHandle SDL_SetGPUViewport$handle() {
		return SDL_SetGPUViewport.HANDLE;
	}

	public static MemorySegment SDL_SetGPUViewport$address() {
		return SDL_SetGPUViewport.ADDR;
	}

	public static void SDL_SetGPUViewport(MemorySegment render_pass, MemorySegment viewport) {
		var mh$ = SDL_SetGPUViewport.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetGPUViewport", render_pass, viewport);
			}
			mh$.invokeExact(render_pass, viewport);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetGPUScissor {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetGPUScissor");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetGPUScissor$descriptor() {
		return SDL_SetGPUScissor.DESC;
	}

	public static MethodHandle SDL_SetGPUScissor$handle() {
		return SDL_SetGPUScissor.HANDLE;
	}

	public static MemorySegment SDL_SetGPUScissor$address() {
		return SDL_SetGPUScissor.ADDR;
	}

	public static void SDL_SetGPUScissor(MemorySegment render_pass, MemorySegment scissor) {
		var mh$ = SDL_SetGPUScissor.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetGPUScissor", render_pass, scissor);
			}
			mh$.invokeExact(render_pass, scissor);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetGPUBlendConstants {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL_FColor.layout()
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetGPUBlendConstants");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetGPUBlendConstants$descriptor() {
		return SDL_SetGPUBlendConstants.DESC;
	}

	public static MethodHandle SDL_SetGPUBlendConstants$handle() {
		return SDL_SetGPUBlendConstants.HANDLE;
	}

	public static MemorySegment SDL_SetGPUBlendConstants$address() {
		return SDL_SetGPUBlendConstants.ADDR;
	}

	public static void SDL_SetGPUBlendConstants(MemorySegment render_pass, MemorySegment blend_constants) {
		var mh$ = SDL_SetGPUBlendConstants.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetGPUBlendConstants", render_pass, blend_constants);
			}
			mh$.invokeExact(render_pass, blend_constants);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetGPUStencilReference {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_CHAR
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetGPUStencilReference");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetGPUStencilReference$descriptor() {
		return SDL_SetGPUStencilReference.DESC;
	}

	public static MethodHandle SDL_SetGPUStencilReference$handle() {
		return SDL_SetGPUStencilReference.HANDLE;
	}

	public static MemorySegment SDL_SetGPUStencilReference$address() {
		return SDL_SetGPUStencilReference.ADDR;
	}

	public static void SDL_SetGPUStencilReference(MemorySegment render_pass, byte reference) {
		var mh$ = SDL_SetGPUStencilReference.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetGPUStencilReference", render_pass, reference);
			}
			mh$.invokeExact(render_pass, reference);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_BindGPUVertexBuffers {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_BindGPUVertexBuffers");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_BindGPUVertexBuffers$descriptor() {
		return SDL_BindGPUVertexBuffers.DESC;
	}

	public static MethodHandle SDL_BindGPUVertexBuffers$handle() {
		return SDL_BindGPUVertexBuffers.HANDLE;
	}

	public static MemorySegment SDL_BindGPUVertexBuffers$address() {
		return SDL_BindGPUVertexBuffers.ADDR;
	}

	public static void SDL_BindGPUVertexBuffers(MemorySegment render_pass, int first_slot, MemorySegment bindings, int num_bindings) {
		var mh$ = SDL_BindGPUVertexBuffers.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_BindGPUVertexBuffers", render_pass, first_slot, bindings, num_bindings);
			}
			mh$.invokeExact(render_pass, first_slot, bindings, num_bindings);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_BindGPUIndexBuffer {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_BindGPUIndexBuffer");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_BindGPUIndexBuffer$descriptor() {
		return SDL_BindGPUIndexBuffer.DESC;
	}

	public static MethodHandle SDL_BindGPUIndexBuffer$handle() {
		return SDL_BindGPUIndexBuffer.HANDLE;
	}

	public static MemorySegment SDL_BindGPUIndexBuffer$address() {
		return SDL_BindGPUIndexBuffer.ADDR;
	}

	public static void SDL_BindGPUIndexBuffer(MemorySegment render_pass, MemorySegment binding, int index_element_size) {
		var mh$ = SDL_BindGPUIndexBuffer.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_BindGPUIndexBuffer", render_pass, binding, index_element_size);
			}
			mh$.invokeExact(render_pass, binding, index_element_size);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_BindGPUVertexSamplers {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_BindGPUVertexSamplers");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_BindGPUVertexSamplers$descriptor() {
		return SDL_BindGPUVertexSamplers.DESC;
	}

	public static MethodHandle SDL_BindGPUVertexSamplers$handle() {
		return SDL_BindGPUVertexSamplers.HANDLE;
	}

	public static MemorySegment SDL_BindGPUVertexSamplers$address() {
		return SDL_BindGPUVertexSamplers.ADDR;
	}

	public static void SDL_BindGPUVertexSamplers(MemorySegment render_pass, int first_slot, MemorySegment texture_sampler_bindings, int num_bindings) {
		var mh$ = SDL_BindGPUVertexSamplers.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_BindGPUVertexSamplers", render_pass, first_slot, texture_sampler_bindings, num_bindings);
			}
			mh$.invokeExact(render_pass, first_slot, texture_sampler_bindings, num_bindings);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_BindGPUVertexStorageTextures {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_BindGPUVertexStorageTextures");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_BindGPUVertexStorageTextures$descriptor() {
		return SDL_BindGPUVertexStorageTextures.DESC;
	}

	public static MethodHandle SDL_BindGPUVertexStorageTextures$handle() {
		return SDL_BindGPUVertexStorageTextures.HANDLE;
	}

	public static MemorySegment SDL_BindGPUVertexStorageTextures$address() {
		return SDL_BindGPUVertexStorageTextures.ADDR;
	}

	public static void SDL_BindGPUVertexStorageTextures(MemorySegment render_pass, int first_slot, MemorySegment storage_textures, int num_bindings) {
		var mh$ = SDL_BindGPUVertexStorageTextures.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_BindGPUVertexStorageTextures", render_pass, first_slot, storage_textures, num_bindings);
			}
			mh$.invokeExact(render_pass, first_slot, storage_textures, num_bindings);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_BindGPUVertexStorageBuffers {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_BindGPUVertexStorageBuffers");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_BindGPUVertexStorageBuffers$descriptor() {
		return SDL_BindGPUVertexStorageBuffers.DESC;
	}

	public static MethodHandle SDL_BindGPUVertexStorageBuffers$handle() {
		return SDL_BindGPUVertexStorageBuffers.HANDLE;
	}

	public static MemorySegment SDL_BindGPUVertexStorageBuffers$address() {
		return SDL_BindGPUVertexStorageBuffers.ADDR;
	}

	public static void SDL_BindGPUVertexStorageBuffers(MemorySegment render_pass, int first_slot, MemorySegment storage_buffers, int num_bindings) {
		var mh$ = SDL_BindGPUVertexStorageBuffers.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_BindGPUVertexStorageBuffers", render_pass, first_slot, storage_buffers, num_bindings);
			}
			mh$.invokeExact(render_pass, first_slot, storage_buffers, num_bindings);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_BindGPUFragmentSamplers {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_BindGPUFragmentSamplers");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_BindGPUFragmentSamplers$descriptor() {
		return SDL_BindGPUFragmentSamplers.DESC;
	}

	public static MethodHandle SDL_BindGPUFragmentSamplers$handle() {
		return SDL_BindGPUFragmentSamplers.HANDLE;
	}

	public static MemorySegment SDL_BindGPUFragmentSamplers$address() {
		return SDL_BindGPUFragmentSamplers.ADDR;
	}

	public static void SDL_BindGPUFragmentSamplers(MemorySegment render_pass, int first_slot, MemorySegment texture_sampler_bindings, int num_bindings) {
		var mh$ = SDL_BindGPUFragmentSamplers.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_BindGPUFragmentSamplers", render_pass, first_slot, texture_sampler_bindings, num_bindings);
			}
			mh$.invokeExact(render_pass, first_slot, texture_sampler_bindings, num_bindings);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_BindGPUFragmentStorageTextures {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_BindGPUFragmentStorageTextures");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_BindGPUFragmentStorageTextures$descriptor() {
		return SDL_BindGPUFragmentStorageTextures.DESC;
	}

	public static MethodHandle SDL_BindGPUFragmentStorageTextures$handle() {
		return SDL_BindGPUFragmentStorageTextures.HANDLE;
	}

	public static MemorySegment SDL_BindGPUFragmentStorageTextures$address() {
		return SDL_BindGPUFragmentStorageTextures.ADDR;
	}

	public static void SDL_BindGPUFragmentStorageTextures(MemorySegment render_pass, int first_slot, MemorySegment storage_textures, int num_bindings) {
		var mh$ = SDL_BindGPUFragmentStorageTextures.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_BindGPUFragmentStorageTextures", render_pass, first_slot, storage_textures, num_bindings);
			}
			mh$.invokeExact(render_pass, first_slot, storage_textures, num_bindings);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_BindGPUFragmentStorageBuffers {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_BindGPUFragmentStorageBuffers");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_BindGPUFragmentStorageBuffers$descriptor() {
		return SDL_BindGPUFragmentStorageBuffers.DESC;
	}

	public static MethodHandle SDL_BindGPUFragmentStorageBuffers$handle() {
		return SDL_BindGPUFragmentStorageBuffers.HANDLE;
	}

	public static MemorySegment SDL_BindGPUFragmentStorageBuffers$address() {
		return SDL_BindGPUFragmentStorageBuffers.ADDR;
	}

	public static void SDL_BindGPUFragmentStorageBuffers(MemorySegment render_pass, int first_slot, MemorySegment storage_buffers, int num_bindings) {
		var mh$ = SDL_BindGPUFragmentStorageBuffers.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_BindGPUFragmentStorageBuffers", render_pass, first_slot, storage_buffers, num_bindings);
			}
			mh$.invokeExact(render_pass, first_slot, storage_buffers, num_bindings);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DrawGPUIndexedPrimitives {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DrawGPUIndexedPrimitives");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DrawGPUIndexedPrimitives$descriptor() {
		return SDL_DrawGPUIndexedPrimitives.DESC;
	}

	public static MethodHandle SDL_DrawGPUIndexedPrimitives$handle() {
		return SDL_DrawGPUIndexedPrimitives.HANDLE;
	}

	public static MemorySegment SDL_DrawGPUIndexedPrimitives$address() {
		return SDL_DrawGPUIndexedPrimitives.ADDR;
	}

	public static void SDL_DrawGPUIndexedPrimitives(MemorySegment render_pass, int num_indices, int num_instances, int first_index, int vertex_offset, int first_instance) {
		var mh$ = SDL_DrawGPUIndexedPrimitives.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DrawGPUIndexedPrimitives", render_pass, num_indices, num_instances, first_index, vertex_offset, first_instance);
			}
			mh$.invokeExact(render_pass, num_indices, num_instances, first_index, vertex_offset, first_instance);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DrawGPUPrimitives {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DrawGPUPrimitives");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DrawGPUPrimitives$descriptor() {
		return SDL_DrawGPUPrimitives.DESC;
	}

	public static MethodHandle SDL_DrawGPUPrimitives$handle() {
		return SDL_DrawGPUPrimitives.HANDLE;
	}

	public static MemorySegment SDL_DrawGPUPrimitives$address() {
		return SDL_DrawGPUPrimitives.ADDR;
	}

	public static void SDL_DrawGPUPrimitives(MemorySegment render_pass, int num_vertices, int num_instances, int first_vertex, int first_instance) {
		var mh$ = SDL_DrawGPUPrimitives.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DrawGPUPrimitives", render_pass, num_vertices, num_instances, first_vertex, first_instance);
			}
			mh$.invokeExact(render_pass, num_vertices, num_instances, first_vertex, first_instance);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DrawGPUPrimitivesIndirect {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DrawGPUPrimitivesIndirect");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DrawGPUPrimitivesIndirect$descriptor() {
		return SDL_DrawGPUPrimitivesIndirect.DESC;
	}

	public static MethodHandle SDL_DrawGPUPrimitivesIndirect$handle() {
		return SDL_DrawGPUPrimitivesIndirect.HANDLE;
	}

	public static MemorySegment SDL_DrawGPUPrimitivesIndirect$address() {
		return SDL_DrawGPUPrimitivesIndirect.ADDR;
	}

	public static void SDL_DrawGPUPrimitivesIndirect(MemorySegment render_pass, MemorySegment buffer, int offset, int draw_count) {
		var mh$ = SDL_DrawGPUPrimitivesIndirect.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DrawGPUPrimitivesIndirect", render_pass, buffer, offset, draw_count);
			}
			mh$.invokeExact(render_pass, buffer, offset, draw_count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DrawGPUIndexedPrimitivesIndirect {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DrawGPUIndexedPrimitivesIndirect");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DrawGPUIndexedPrimitivesIndirect$descriptor() {
		return SDL_DrawGPUIndexedPrimitivesIndirect.DESC;
	}

	public static MethodHandle SDL_DrawGPUIndexedPrimitivesIndirect$handle() {
		return SDL_DrawGPUIndexedPrimitivesIndirect.HANDLE;
	}

	public static MemorySegment SDL_DrawGPUIndexedPrimitivesIndirect$address() {
		return SDL_DrawGPUIndexedPrimitivesIndirect.ADDR;
	}

	public static void SDL_DrawGPUIndexedPrimitivesIndirect(MemorySegment render_pass, MemorySegment buffer, int offset, int draw_count) {
		var mh$ = SDL_DrawGPUIndexedPrimitivesIndirect.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DrawGPUIndexedPrimitivesIndirect", render_pass, buffer, offset, draw_count);
			}
			mh$.invokeExact(render_pass, buffer, offset, draw_count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_EndGPURenderPass {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_EndGPURenderPass");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_EndGPURenderPass$descriptor() {
		return SDL_EndGPURenderPass.DESC;
	}

	public static MethodHandle SDL_EndGPURenderPass$handle() {
		return SDL_EndGPURenderPass.HANDLE;
	}

	public static MemorySegment SDL_EndGPURenderPass$address() {
		return SDL_EndGPURenderPass.ADDR;
	}

	public static void SDL_EndGPURenderPass(MemorySegment render_pass) {
		var mh$ = SDL_EndGPURenderPass.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_EndGPURenderPass", render_pass);
			}
			mh$.invokeExact(render_pass);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_BeginGPUComputePass {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_BeginGPUComputePass");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_BeginGPUComputePass$descriptor() {
		return SDL_BeginGPUComputePass.DESC;
	}

	public static MethodHandle SDL_BeginGPUComputePass$handle() {
		return SDL_BeginGPUComputePass.HANDLE;
	}

	public static MemorySegment SDL_BeginGPUComputePass$address() {
		return SDL_BeginGPUComputePass.ADDR;
	}

	public static MemorySegment SDL_BeginGPUComputePass(MemorySegment command_buffer, MemorySegment storage_texture_bindings, int num_storage_texture_bindings, MemorySegment storage_buffer_bindings, int num_storage_buffer_bindings) {
		var mh$ = SDL_BeginGPUComputePass.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_BeginGPUComputePass", command_buffer, storage_texture_bindings, num_storage_texture_bindings, storage_buffer_bindings, num_storage_buffer_bindings);
			}
			return (MemorySegment) mh$.invokeExact(command_buffer, storage_texture_bindings, num_storage_texture_bindings, storage_buffer_bindings, num_storage_buffer_bindings);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_BindGPUComputePipeline {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_BindGPUComputePipeline");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_BindGPUComputePipeline$descriptor() {
		return SDL_BindGPUComputePipeline.DESC;
	}

	public static MethodHandle SDL_BindGPUComputePipeline$handle() {
		return SDL_BindGPUComputePipeline.HANDLE;
	}

	public static MemorySegment SDL_BindGPUComputePipeline$address() {
		return SDL_BindGPUComputePipeline.ADDR;
	}

	public static void SDL_BindGPUComputePipeline(MemorySegment compute_pass, MemorySegment compute_pipeline) {
		var mh$ = SDL_BindGPUComputePipeline.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_BindGPUComputePipeline", compute_pass, compute_pipeline);
			}
			mh$.invokeExact(compute_pass, compute_pipeline);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_BindGPUComputeSamplers {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_BindGPUComputeSamplers");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_BindGPUComputeSamplers$descriptor() {
		return SDL_BindGPUComputeSamplers.DESC;
	}

	public static MethodHandle SDL_BindGPUComputeSamplers$handle() {
		return SDL_BindGPUComputeSamplers.HANDLE;
	}

	public static MemorySegment SDL_BindGPUComputeSamplers$address() {
		return SDL_BindGPUComputeSamplers.ADDR;
	}

	public static void SDL_BindGPUComputeSamplers(MemorySegment compute_pass, int first_slot, MemorySegment texture_sampler_bindings, int num_bindings) {
		var mh$ = SDL_BindGPUComputeSamplers.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_BindGPUComputeSamplers", compute_pass, first_slot, texture_sampler_bindings, num_bindings);
			}
			mh$.invokeExact(compute_pass, first_slot, texture_sampler_bindings, num_bindings);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_BindGPUComputeStorageTextures {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_BindGPUComputeStorageTextures");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_BindGPUComputeStorageTextures$descriptor() {
		return SDL_BindGPUComputeStorageTextures.DESC;
	}

	public static MethodHandle SDL_BindGPUComputeStorageTextures$handle() {
		return SDL_BindGPUComputeStorageTextures.HANDLE;
	}

	public static MemorySegment SDL_BindGPUComputeStorageTextures$address() {
		return SDL_BindGPUComputeStorageTextures.ADDR;
	}

	public static void SDL_BindGPUComputeStorageTextures(MemorySegment compute_pass, int first_slot, MemorySegment storage_textures, int num_bindings) {
		var mh$ = SDL_BindGPUComputeStorageTextures.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_BindGPUComputeStorageTextures", compute_pass, first_slot, storage_textures, num_bindings);
			}
			mh$.invokeExact(compute_pass, first_slot, storage_textures, num_bindings);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_BindGPUComputeStorageBuffers {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_BindGPUComputeStorageBuffers");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_BindGPUComputeStorageBuffers$descriptor() {
		return SDL_BindGPUComputeStorageBuffers.DESC;
	}

	public static MethodHandle SDL_BindGPUComputeStorageBuffers$handle() {
		return SDL_BindGPUComputeStorageBuffers.HANDLE;
	}

	public static MemorySegment SDL_BindGPUComputeStorageBuffers$address() {
		return SDL_BindGPUComputeStorageBuffers.ADDR;
	}

	public static void SDL_BindGPUComputeStorageBuffers(MemorySegment compute_pass, int first_slot, MemorySegment storage_buffers, int num_bindings) {
		var mh$ = SDL_BindGPUComputeStorageBuffers.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_BindGPUComputeStorageBuffers", compute_pass, first_slot, storage_buffers, num_bindings);
			}
			mh$.invokeExact(compute_pass, first_slot, storage_buffers, num_bindings);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DispatchGPUCompute {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DispatchGPUCompute");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DispatchGPUCompute$descriptor() {
		return SDL_DispatchGPUCompute.DESC;
	}

	public static MethodHandle SDL_DispatchGPUCompute$handle() {
		return SDL_DispatchGPUCompute.HANDLE;
	}

	public static MemorySegment SDL_DispatchGPUCompute$address() {
		return SDL_DispatchGPUCompute.ADDR;
	}

	public static void SDL_DispatchGPUCompute(MemorySegment compute_pass, int groupcount_x, int groupcount_y, int groupcount_z) {
		var mh$ = SDL_DispatchGPUCompute.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DispatchGPUCompute", compute_pass, groupcount_x, groupcount_y, groupcount_z);
			}
			mh$.invokeExact(compute_pass, groupcount_x, groupcount_y, groupcount_z);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DispatchGPUComputeIndirect {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DispatchGPUComputeIndirect");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DispatchGPUComputeIndirect$descriptor() {
		return SDL_DispatchGPUComputeIndirect.DESC;
	}

	public static MethodHandle SDL_DispatchGPUComputeIndirect$handle() {
		return SDL_DispatchGPUComputeIndirect.HANDLE;
	}

	public static MemorySegment SDL_DispatchGPUComputeIndirect$address() {
		return SDL_DispatchGPUComputeIndirect.ADDR;
	}

	public static void SDL_DispatchGPUComputeIndirect(MemorySegment compute_pass, MemorySegment buffer, int offset) {
		var mh$ = SDL_DispatchGPUComputeIndirect.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DispatchGPUComputeIndirect", compute_pass, buffer, offset);
			}
			mh$.invokeExact(compute_pass, buffer, offset);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_EndGPUComputePass {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_EndGPUComputePass");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_EndGPUComputePass$descriptor() {
		return SDL_EndGPUComputePass.DESC;
	}

	public static MethodHandle SDL_EndGPUComputePass$handle() {
		return SDL_EndGPUComputePass.HANDLE;
	}

	public static MemorySegment SDL_EndGPUComputePass$address() {
		return SDL_EndGPUComputePass.ADDR;
	}

	public static void SDL_EndGPUComputePass(MemorySegment compute_pass) {
		var mh$ = SDL_EndGPUComputePass.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_EndGPUComputePass", compute_pass);
			}
			mh$.invokeExact(compute_pass);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_MapGPUTransferBuffer {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_MapGPUTransferBuffer");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_MapGPUTransferBuffer$descriptor() {
		return SDL_MapGPUTransferBuffer.DESC;
	}

	public static MethodHandle SDL_MapGPUTransferBuffer$handle() {
		return SDL_MapGPUTransferBuffer.HANDLE;
	}

	public static MemorySegment SDL_MapGPUTransferBuffer$address() {
		return SDL_MapGPUTransferBuffer.ADDR;
	}

	public static MemorySegment SDL_MapGPUTransferBuffer(MemorySegment device, MemorySegment transfer_buffer, boolean cycle) {
		var mh$ = SDL_MapGPUTransferBuffer.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_MapGPUTransferBuffer", device, transfer_buffer, cycle);
			}
			return (MemorySegment) mh$.invokeExact(device, transfer_buffer, cycle);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_UnmapGPUTransferBuffer {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_UnmapGPUTransferBuffer");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_UnmapGPUTransferBuffer$descriptor() {
		return SDL_UnmapGPUTransferBuffer.DESC;
	}

	public static MethodHandle SDL_UnmapGPUTransferBuffer$handle() {
		return SDL_UnmapGPUTransferBuffer.HANDLE;
	}

	public static MemorySegment SDL_UnmapGPUTransferBuffer$address() {
		return SDL_UnmapGPUTransferBuffer.ADDR;
	}

	public static void SDL_UnmapGPUTransferBuffer(MemorySegment device, MemorySegment transfer_buffer) {
		var mh$ = SDL_UnmapGPUTransferBuffer.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_UnmapGPUTransferBuffer", device, transfer_buffer);
			}
			mh$.invokeExact(device, transfer_buffer);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_BeginGPUCopyPass {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_BeginGPUCopyPass");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_BeginGPUCopyPass$descriptor() {
		return SDL_BeginGPUCopyPass.DESC;
	}

	public static MethodHandle SDL_BeginGPUCopyPass$handle() {
		return SDL_BeginGPUCopyPass.HANDLE;
	}

	public static MemorySegment SDL_BeginGPUCopyPass$address() {
		return SDL_BeginGPUCopyPass.ADDR;
	}

	public static MemorySegment SDL_BeginGPUCopyPass(MemorySegment command_buffer) {
		var mh$ = SDL_BeginGPUCopyPass.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_BeginGPUCopyPass", command_buffer);
			}
			return (MemorySegment) mh$.invokeExact(command_buffer);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_UploadToGPUTexture {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_UploadToGPUTexture");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_UploadToGPUTexture$descriptor() {
		return SDL_UploadToGPUTexture.DESC;
	}

	public static MethodHandle SDL_UploadToGPUTexture$handle() {
		return SDL_UploadToGPUTexture.HANDLE;
	}

	public static MemorySegment SDL_UploadToGPUTexture$address() {
		return SDL_UploadToGPUTexture.ADDR;
	}

	public static void SDL_UploadToGPUTexture(MemorySegment copy_pass, MemorySegment source, MemorySegment destination, boolean cycle) {
		var mh$ = SDL_UploadToGPUTexture.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_UploadToGPUTexture", copy_pass, source, destination, cycle);
			}
			mh$.invokeExact(copy_pass, source, destination, cycle);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_UploadToGPUBuffer {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_UploadToGPUBuffer");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_UploadToGPUBuffer$descriptor() {
		return SDL_UploadToGPUBuffer.DESC;
	}

	public static MethodHandle SDL_UploadToGPUBuffer$handle() {
		return SDL_UploadToGPUBuffer.HANDLE;
	}

	public static MemorySegment SDL_UploadToGPUBuffer$address() {
		return SDL_UploadToGPUBuffer.ADDR;
	}

	public static void SDL_UploadToGPUBuffer(MemorySegment copy_pass, MemorySegment source, MemorySegment destination, boolean cycle) {
		var mh$ = SDL_UploadToGPUBuffer.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_UploadToGPUBuffer", copy_pass, source, destination, cycle);
			}
			mh$.invokeExact(copy_pass, source, destination, cycle);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CopyGPUTextureToTexture {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CopyGPUTextureToTexture");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CopyGPUTextureToTexture$descriptor() {
		return SDL_CopyGPUTextureToTexture.DESC;
	}

	public static MethodHandle SDL_CopyGPUTextureToTexture$handle() {
		return SDL_CopyGPUTextureToTexture.HANDLE;
	}

	public static MemorySegment SDL_CopyGPUTextureToTexture$address() {
		return SDL_CopyGPUTextureToTexture.ADDR;
	}

	public static void SDL_CopyGPUTextureToTexture(MemorySegment copy_pass, MemorySegment source, MemorySegment destination, int w, int h, int d, boolean cycle) {
		var mh$ = SDL_CopyGPUTextureToTexture.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CopyGPUTextureToTexture", copy_pass, source, destination, w, h, d, cycle);
			}
			mh$.invokeExact(copy_pass, source, destination, w, h, d, cycle);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CopyGPUBufferToBuffer {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CopyGPUBufferToBuffer");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CopyGPUBufferToBuffer$descriptor() {
		return SDL_CopyGPUBufferToBuffer.DESC;
	}

	public static MethodHandle SDL_CopyGPUBufferToBuffer$handle() {
		return SDL_CopyGPUBufferToBuffer.HANDLE;
	}

	public static MemorySegment SDL_CopyGPUBufferToBuffer$address() {
		return SDL_CopyGPUBufferToBuffer.ADDR;
	}

	public static void SDL_CopyGPUBufferToBuffer(MemorySegment copy_pass, MemorySegment source, MemorySegment destination, int size, boolean cycle) {
		var mh$ = SDL_CopyGPUBufferToBuffer.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CopyGPUBufferToBuffer", copy_pass, source, destination, size, cycle);
			}
			mh$.invokeExact(copy_pass, source, destination, size, cycle);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DownloadFromGPUTexture {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DownloadFromGPUTexture");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DownloadFromGPUTexture$descriptor() {
		return SDL_DownloadFromGPUTexture.DESC;
	}

	public static MethodHandle SDL_DownloadFromGPUTexture$handle() {
		return SDL_DownloadFromGPUTexture.HANDLE;
	}

	public static MemorySegment SDL_DownloadFromGPUTexture$address() {
		return SDL_DownloadFromGPUTexture.ADDR;
	}

	public static void SDL_DownloadFromGPUTexture(MemorySegment copy_pass, MemorySegment source, MemorySegment destination) {
		var mh$ = SDL_DownloadFromGPUTexture.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DownloadFromGPUTexture", copy_pass, source, destination);
			}
			mh$.invokeExact(copy_pass, source, destination);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DownloadFromGPUBuffer {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DownloadFromGPUBuffer");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DownloadFromGPUBuffer$descriptor() {
		return SDL_DownloadFromGPUBuffer.DESC;
	}

	public static MethodHandle SDL_DownloadFromGPUBuffer$handle() {
		return SDL_DownloadFromGPUBuffer.HANDLE;
	}

	public static MemorySegment SDL_DownloadFromGPUBuffer$address() {
		return SDL_DownloadFromGPUBuffer.ADDR;
	}

	public static void SDL_DownloadFromGPUBuffer(MemorySegment copy_pass, MemorySegment source, MemorySegment destination) {
		var mh$ = SDL_DownloadFromGPUBuffer.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DownloadFromGPUBuffer", copy_pass, source, destination);
			}
			mh$.invokeExact(copy_pass, source, destination);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_EndGPUCopyPass {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_EndGPUCopyPass");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_EndGPUCopyPass$descriptor() {
		return SDL_EndGPUCopyPass.DESC;
	}

	public static MethodHandle SDL_EndGPUCopyPass$handle() {
		return SDL_EndGPUCopyPass.HANDLE;
	}

	public static MemorySegment SDL_EndGPUCopyPass$address() {
		return SDL_EndGPUCopyPass.ADDR;
	}

	public static void SDL_EndGPUCopyPass(MemorySegment copy_pass) {
		var mh$ = SDL_EndGPUCopyPass.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_EndGPUCopyPass", copy_pass);
			}
			mh$.invokeExact(copy_pass);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GenerateMipmapsForGPUTexture {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GenerateMipmapsForGPUTexture");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GenerateMipmapsForGPUTexture$descriptor() {
		return SDL_GenerateMipmapsForGPUTexture.DESC;
	}

	public static MethodHandle SDL_GenerateMipmapsForGPUTexture$handle() {
		return SDL_GenerateMipmapsForGPUTexture.HANDLE;
	}

	public static MemorySegment SDL_GenerateMipmapsForGPUTexture$address() {
		return SDL_GenerateMipmapsForGPUTexture.ADDR;
	}

	public static void SDL_GenerateMipmapsForGPUTexture(MemorySegment command_buffer, MemorySegment texture) {
		var mh$ = SDL_GenerateMipmapsForGPUTexture.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GenerateMipmapsForGPUTexture", command_buffer, texture);
			}
			mh$.invokeExact(command_buffer, texture);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_BlitGPUTexture {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_BlitGPUTexture");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_BlitGPUTexture$descriptor() {
		return SDL_BlitGPUTexture.DESC;
	}

	public static MethodHandle SDL_BlitGPUTexture$handle() {
		return SDL_BlitGPUTexture.HANDLE;
	}

	public static MemorySegment SDL_BlitGPUTexture$address() {
		return SDL_BlitGPUTexture.ADDR;
	}

	public static void SDL_BlitGPUTexture(MemorySegment command_buffer, MemorySegment info) {
		var mh$ = SDL_BlitGPUTexture.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_BlitGPUTexture", command_buffer, info);
			}
			mh$.invokeExact(command_buffer, info);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WindowSupportsGPUSwapchainComposition {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WindowSupportsGPUSwapchainComposition");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WindowSupportsGPUSwapchainComposition$descriptor() {
		return SDL_WindowSupportsGPUSwapchainComposition.DESC;
	}

	public static MethodHandle SDL_WindowSupportsGPUSwapchainComposition$handle() {
		return SDL_WindowSupportsGPUSwapchainComposition.HANDLE;
	}

	public static MemorySegment SDL_WindowSupportsGPUSwapchainComposition$address() {
		return SDL_WindowSupportsGPUSwapchainComposition.ADDR;
	}

	public static boolean SDL_WindowSupportsGPUSwapchainComposition(MemorySegment device, MemorySegment window, int swapchain_composition) {
		var mh$ = SDL_WindowSupportsGPUSwapchainComposition.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WindowSupportsGPUSwapchainComposition", device, window, swapchain_composition);
			}
			return (boolean) mh$.invokeExact(device, window, swapchain_composition);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WindowSupportsGPUPresentMode {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WindowSupportsGPUPresentMode");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WindowSupportsGPUPresentMode$descriptor() {
		return SDL_WindowSupportsGPUPresentMode.DESC;
	}

	public static MethodHandle SDL_WindowSupportsGPUPresentMode$handle() {
		return SDL_WindowSupportsGPUPresentMode.HANDLE;
	}

	public static MemorySegment SDL_WindowSupportsGPUPresentMode$address() {
		return SDL_WindowSupportsGPUPresentMode.ADDR;
	}

	public static boolean SDL_WindowSupportsGPUPresentMode(MemorySegment device, MemorySegment window, int present_mode) {
		var mh$ = SDL_WindowSupportsGPUPresentMode.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WindowSupportsGPUPresentMode", device, window, present_mode);
			}
			return (boolean) mh$.invokeExact(device, window, present_mode);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ClaimWindowForGPUDevice {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ClaimWindowForGPUDevice");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ClaimWindowForGPUDevice$descriptor() {
		return SDL_ClaimWindowForGPUDevice.DESC;
	}

	public static MethodHandle SDL_ClaimWindowForGPUDevice$handle() {
		return SDL_ClaimWindowForGPUDevice.HANDLE;
	}

	public static MemorySegment SDL_ClaimWindowForGPUDevice$address() {
		return SDL_ClaimWindowForGPUDevice.ADDR;
	}

	public static boolean SDL_ClaimWindowForGPUDevice(MemorySegment device, MemorySegment window) {
		var mh$ = SDL_ClaimWindowForGPUDevice.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ClaimWindowForGPUDevice", device, window);
			}
			return (boolean) mh$.invokeExact(device, window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ReleaseWindowFromGPUDevice {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ReleaseWindowFromGPUDevice");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ReleaseWindowFromGPUDevice$descriptor() {
		return SDL_ReleaseWindowFromGPUDevice.DESC;
	}

	public static MethodHandle SDL_ReleaseWindowFromGPUDevice$handle() {
		return SDL_ReleaseWindowFromGPUDevice.HANDLE;
	}

	public static MemorySegment SDL_ReleaseWindowFromGPUDevice$address() {
		return SDL_ReleaseWindowFromGPUDevice.ADDR;
	}

	public static void SDL_ReleaseWindowFromGPUDevice(MemorySegment device, MemorySegment window) {
		var mh$ = SDL_ReleaseWindowFromGPUDevice.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ReleaseWindowFromGPUDevice", device, window);
			}
			mh$.invokeExact(device, window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetGPUSwapchainParameters {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetGPUSwapchainParameters");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetGPUSwapchainParameters$descriptor() {
		return SDL_SetGPUSwapchainParameters.DESC;
	}

	public static MethodHandle SDL_SetGPUSwapchainParameters$handle() {
		return SDL_SetGPUSwapchainParameters.HANDLE;
	}

	public static MemorySegment SDL_SetGPUSwapchainParameters$address() {
		return SDL_SetGPUSwapchainParameters.ADDR;
	}

	public static boolean SDL_SetGPUSwapchainParameters(MemorySegment device, MemorySegment window, int swapchain_composition, int present_mode) {
		var mh$ = SDL_SetGPUSwapchainParameters.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetGPUSwapchainParameters", device, window, swapchain_composition, present_mode);
			}
			return (boolean) mh$.invokeExact(device, window, swapchain_composition, present_mode);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetGPUAllowedFramesInFlight {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetGPUAllowedFramesInFlight");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetGPUAllowedFramesInFlight$descriptor() {
		return SDL_SetGPUAllowedFramesInFlight.DESC;
	}

	public static MethodHandle SDL_SetGPUAllowedFramesInFlight$handle() {
		return SDL_SetGPUAllowedFramesInFlight.HANDLE;
	}

	public static MemorySegment SDL_SetGPUAllowedFramesInFlight$address() {
		return SDL_SetGPUAllowedFramesInFlight.ADDR;
	}

	public static boolean SDL_SetGPUAllowedFramesInFlight(MemorySegment device, int allowed_frames_in_flight) {
		var mh$ = SDL_SetGPUAllowedFramesInFlight.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetGPUAllowedFramesInFlight", device, allowed_frames_in_flight);
			}
			return (boolean) mh$.invokeExact(device, allowed_frames_in_flight);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGPUSwapchainTextureFormat {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGPUSwapchainTextureFormat");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGPUSwapchainTextureFormat$descriptor() {
		return SDL_GetGPUSwapchainTextureFormat.DESC;
	}

	public static MethodHandle SDL_GetGPUSwapchainTextureFormat$handle() {
		return SDL_GetGPUSwapchainTextureFormat.HANDLE;
	}

	public static MemorySegment SDL_GetGPUSwapchainTextureFormat$address() {
		return SDL_GetGPUSwapchainTextureFormat.ADDR;
	}

	public static int SDL_GetGPUSwapchainTextureFormat(MemorySegment device, MemorySegment window) {
		var mh$ = SDL_GetGPUSwapchainTextureFormat.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGPUSwapchainTextureFormat", device, window);
			}
			return (int) mh$.invokeExact(device, window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_AcquireGPUSwapchainTexture {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_AcquireGPUSwapchainTexture");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_AcquireGPUSwapchainTexture$descriptor() {
		return SDL_AcquireGPUSwapchainTexture.DESC;
	}

	public static MethodHandle SDL_AcquireGPUSwapchainTexture$handle() {
		return SDL_AcquireGPUSwapchainTexture.HANDLE;
	}

	public static MemorySegment SDL_AcquireGPUSwapchainTexture$address() {
		return SDL_AcquireGPUSwapchainTexture.ADDR;
	}

	public static boolean SDL_AcquireGPUSwapchainTexture(MemorySegment command_buffer, MemorySegment window, MemorySegment swapchain_texture, MemorySegment swapchain_texture_width, MemorySegment swapchain_texture_height) {
		var mh$ = SDL_AcquireGPUSwapchainTexture.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_AcquireGPUSwapchainTexture", command_buffer, window, swapchain_texture, swapchain_texture_width, swapchain_texture_height);
			}
			return (boolean) mh$.invokeExact(command_buffer, window, swapchain_texture, swapchain_texture_width, swapchain_texture_height);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WaitForGPUSwapchain {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WaitForGPUSwapchain");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WaitForGPUSwapchain$descriptor() {
		return SDL_WaitForGPUSwapchain.DESC;
	}

	public static MethodHandle SDL_WaitForGPUSwapchain$handle() {
		return SDL_WaitForGPUSwapchain.HANDLE;
	}

	public static MemorySegment SDL_WaitForGPUSwapchain$address() {
		return SDL_WaitForGPUSwapchain.ADDR;
	}

	public static boolean SDL_WaitForGPUSwapchain(MemorySegment device, MemorySegment window) {
		var mh$ = SDL_WaitForGPUSwapchain.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WaitForGPUSwapchain", device, window);
			}
			return (boolean) mh$.invokeExact(device, window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WaitAndAcquireGPUSwapchainTexture {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WaitAndAcquireGPUSwapchainTexture");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WaitAndAcquireGPUSwapchainTexture$descriptor() {
		return SDL_WaitAndAcquireGPUSwapchainTexture.DESC;
	}

	public static MethodHandle SDL_WaitAndAcquireGPUSwapchainTexture$handle() {
		return SDL_WaitAndAcquireGPUSwapchainTexture.HANDLE;
	}

	public static MemorySegment SDL_WaitAndAcquireGPUSwapchainTexture$address() {
		return SDL_WaitAndAcquireGPUSwapchainTexture.ADDR;
	}

	public static boolean SDL_WaitAndAcquireGPUSwapchainTexture(MemorySegment command_buffer, MemorySegment window, MemorySegment swapchain_texture, MemorySegment swapchain_texture_width, MemorySegment swapchain_texture_height) {
		var mh$ = SDL_WaitAndAcquireGPUSwapchainTexture.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WaitAndAcquireGPUSwapchainTexture", command_buffer, window, swapchain_texture, swapchain_texture_width, swapchain_texture_height);
			}
			return (boolean) mh$.invokeExact(command_buffer, window, swapchain_texture, swapchain_texture_width, swapchain_texture_height);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SubmitGPUCommandBuffer {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SubmitGPUCommandBuffer");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SubmitGPUCommandBuffer$descriptor() {
		return SDL_SubmitGPUCommandBuffer.DESC;
	}

	public static MethodHandle SDL_SubmitGPUCommandBuffer$handle() {
		return SDL_SubmitGPUCommandBuffer.HANDLE;
	}

	public static MemorySegment SDL_SubmitGPUCommandBuffer$address() {
		return SDL_SubmitGPUCommandBuffer.ADDR;
	}

	public static boolean SDL_SubmitGPUCommandBuffer(MemorySegment command_buffer) {
		var mh$ = SDL_SubmitGPUCommandBuffer.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SubmitGPUCommandBuffer", command_buffer);
			}
			return (boolean) mh$.invokeExact(command_buffer);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SubmitGPUCommandBufferAndAcquireFence {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SubmitGPUCommandBufferAndAcquireFence");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SubmitGPUCommandBufferAndAcquireFence$descriptor() {
		return SDL_SubmitGPUCommandBufferAndAcquireFence.DESC;
	}

	public static MethodHandle SDL_SubmitGPUCommandBufferAndAcquireFence$handle() {
		return SDL_SubmitGPUCommandBufferAndAcquireFence.HANDLE;
	}

	public static MemorySegment SDL_SubmitGPUCommandBufferAndAcquireFence$address() {
		return SDL_SubmitGPUCommandBufferAndAcquireFence.ADDR;
	}

	public static MemorySegment SDL_SubmitGPUCommandBufferAndAcquireFence(MemorySegment command_buffer) {
		var mh$ = SDL_SubmitGPUCommandBufferAndAcquireFence.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SubmitGPUCommandBufferAndAcquireFence", command_buffer);
			}
			return (MemorySegment) mh$.invokeExact(command_buffer);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CancelGPUCommandBuffer {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CancelGPUCommandBuffer");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CancelGPUCommandBuffer$descriptor() {
		return SDL_CancelGPUCommandBuffer.DESC;
	}

	public static MethodHandle SDL_CancelGPUCommandBuffer$handle() {
		return SDL_CancelGPUCommandBuffer.HANDLE;
	}

	public static MemorySegment SDL_CancelGPUCommandBuffer$address() {
		return SDL_CancelGPUCommandBuffer.ADDR;
	}

	public static boolean SDL_CancelGPUCommandBuffer(MemorySegment command_buffer) {
		var mh$ = SDL_CancelGPUCommandBuffer.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CancelGPUCommandBuffer", command_buffer);
			}
			return (boolean) mh$.invokeExact(command_buffer);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WaitForGPUIdle {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WaitForGPUIdle");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WaitForGPUIdle$descriptor() {
		return SDL_WaitForGPUIdle.DESC;
	}

	public static MethodHandle SDL_WaitForGPUIdle$handle() {
		return SDL_WaitForGPUIdle.HANDLE;
	}

	public static MemorySegment SDL_WaitForGPUIdle$address() {
		return SDL_WaitForGPUIdle.ADDR;
	}

	public static boolean SDL_WaitForGPUIdle(MemorySegment device) {
		var mh$ = SDL_WaitForGPUIdle.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WaitForGPUIdle", device);
			}
			return (boolean) mh$.invokeExact(device);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WaitForGPUFences {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WaitForGPUFences");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WaitForGPUFences$descriptor() {
		return SDL_WaitForGPUFences.DESC;
	}

	public static MethodHandle SDL_WaitForGPUFences$handle() {
		return SDL_WaitForGPUFences.HANDLE;
	}

	public static MemorySegment SDL_WaitForGPUFences$address() {
		return SDL_WaitForGPUFences.ADDR;
	}

	public static boolean SDL_WaitForGPUFences(MemorySegment device, boolean wait_all, MemorySegment fences, int num_fences) {
		var mh$ = SDL_WaitForGPUFences.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WaitForGPUFences", device, wait_all, fences, num_fences);
			}
			return (boolean) mh$.invokeExact(device, wait_all, fences, num_fences);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_QueryGPUFence {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_QueryGPUFence");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_QueryGPUFence$descriptor() {
		return SDL_QueryGPUFence.DESC;
	}

	public static MethodHandle SDL_QueryGPUFence$handle() {
		return SDL_QueryGPUFence.HANDLE;
	}

	public static MemorySegment SDL_QueryGPUFence$address() {
		return SDL_QueryGPUFence.ADDR;
	}

	public static boolean SDL_QueryGPUFence(MemorySegment device, MemorySegment fence) {
		var mh$ = SDL_QueryGPUFence.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_QueryGPUFence", device, fence);
			}
			return (boolean) mh$.invokeExact(device, fence);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ReleaseGPUFence {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ReleaseGPUFence");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ReleaseGPUFence$descriptor() {
		return SDL_ReleaseGPUFence.DESC;
	}

	public static MethodHandle SDL_ReleaseGPUFence$handle() {
		return SDL_ReleaseGPUFence.HANDLE;
	}

	public static MemorySegment SDL_ReleaseGPUFence$address() {
		return SDL_ReleaseGPUFence.ADDR;
	}

	public static void SDL_ReleaseGPUFence(MemorySegment device, MemorySegment fence) {
		var mh$ = SDL_ReleaseGPUFence.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ReleaseGPUFence", device, fence);
			}
			mh$.invokeExact(device, fence);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GPUTextureFormatTexelBlockSize {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GPUTextureFormatTexelBlockSize");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GPUTextureFormatTexelBlockSize$descriptor() {
		return SDL_GPUTextureFormatTexelBlockSize.DESC;
	}

	public static MethodHandle SDL_GPUTextureFormatTexelBlockSize$handle() {
		return SDL_GPUTextureFormatTexelBlockSize.HANDLE;
	}

	public static MemorySegment SDL_GPUTextureFormatTexelBlockSize$address() {
		return SDL_GPUTextureFormatTexelBlockSize.ADDR;
	}

	public static int SDL_GPUTextureFormatTexelBlockSize(int format) {
		var mh$ = SDL_GPUTextureFormatTexelBlockSize.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GPUTextureFormatTexelBlockSize", format);
			}
			return (int) mh$.invokeExact(format);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GPUTextureSupportsFormat {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GPUTextureSupportsFormat");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GPUTextureSupportsFormat$descriptor() {
		return SDL_GPUTextureSupportsFormat.DESC;
	}

	public static MethodHandle SDL_GPUTextureSupportsFormat$handle() {
		return SDL_GPUTextureSupportsFormat.HANDLE;
	}

	public static MemorySegment SDL_GPUTextureSupportsFormat$address() {
		return SDL_GPUTextureSupportsFormat.ADDR;
	}

	public static boolean SDL_GPUTextureSupportsFormat(MemorySegment device, int format, int type, int usage) {
		var mh$ = SDL_GPUTextureSupportsFormat.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GPUTextureSupportsFormat", device, format, type, usage);
			}
			return (boolean) mh$.invokeExact(device, format, type, usage);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GPUTextureSupportsSampleCount {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GPUTextureSupportsSampleCount");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GPUTextureSupportsSampleCount$descriptor() {
		return SDL_GPUTextureSupportsSampleCount.DESC;
	}

	public static MethodHandle SDL_GPUTextureSupportsSampleCount$handle() {
		return SDL_GPUTextureSupportsSampleCount.HANDLE;
	}

	public static MemorySegment SDL_GPUTextureSupportsSampleCount$address() {
		return SDL_GPUTextureSupportsSampleCount.ADDR;
	}

	public static boolean SDL_GPUTextureSupportsSampleCount(MemorySegment device, int format, int sample_count) {
		var mh$ = SDL_GPUTextureSupportsSampleCount.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GPUTextureSupportsSampleCount", device, format, sample_count);
			}
			return (boolean) mh$.invokeExact(device, format, sample_count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CalculateGPUTextureFormatSize {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CalculateGPUTextureFormatSize");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CalculateGPUTextureFormatSize$descriptor() {
		return SDL_CalculateGPUTextureFormatSize.DESC;
	}

	public static MethodHandle SDL_CalculateGPUTextureFormatSize$handle() {
		return SDL_CalculateGPUTextureFormatSize.HANDLE;
	}

	public static MemorySegment SDL_CalculateGPUTextureFormatSize$address() {
		return SDL_CalculateGPUTextureFormatSize.ADDR;
	}

	public static int SDL_CalculateGPUTextureFormatSize(int format, int width, int height, int depth_or_layer_count) {
		var mh$ = SDL_CalculateGPUTextureFormatSize.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CalculateGPUTextureFormatSize", format, width, height, depth_or_layer_count);
			}
			return (int) mh$.invokeExact(format, width, height, depth_or_layer_count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetPixelFormatFromGPUTextureFormat {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetPixelFormatFromGPUTextureFormat");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetPixelFormatFromGPUTextureFormat$descriptor() {
		return SDL_GetPixelFormatFromGPUTextureFormat.DESC;
	}

	public static MethodHandle SDL_GetPixelFormatFromGPUTextureFormat$handle() {
		return SDL_GetPixelFormatFromGPUTextureFormat.HANDLE;
	}

	public static MemorySegment SDL_GetPixelFormatFromGPUTextureFormat$address() {
		return SDL_GetPixelFormatFromGPUTextureFormat.ADDR;
	}

	public static int SDL_GetPixelFormatFromGPUTextureFormat(int format) {
		var mh$ = SDL_GetPixelFormatFromGPUTextureFormat.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetPixelFormatFromGPUTextureFormat", format);
			}
			return (int) mh$.invokeExact(format);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGPUTextureFormatFromPixelFormat {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGPUTextureFormatFromPixelFormat");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGPUTextureFormatFromPixelFormat$descriptor() {
		return SDL_GetGPUTextureFormatFromPixelFormat.DESC;
	}

	public static MethodHandle SDL_GetGPUTextureFormatFromPixelFormat$handle() {
		return SDL_GetGPUTextureFormatFromPixelFormat.HANDLE;
	}

	public static MemorySegment SDL_GetGPUTextureFormatFromPixelFormat$address() {
		return SDL_GetGPUTextureFormatFromPixelFormat.ADDR;
	}

	public static int SDL_GetGPUTextureFormatFromPixelFormat(int format) {
		var mh$ = SDL_GetGPUTextureFormatFromPixelFormat.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGPUTextureFormatFromPixelFormat", format);
			}
			return (int) mh$.invokeExact(format);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	public static OfShort SDL_HapticEffectType = SDL3.C_SHORT;

	public static OfByte SDL_HapticDirectionType = SDL3.C_CHAR;

	public static OfInt SDL_HapticEffectID = SDL3.C_INT;

	public static OfInt SDL_HapticID = SDL3.C_INT;

	private static class SDL_GetHaptics {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetHaptics");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetHaptics$descriptor() {
		return SDL_GetHaptics.DESC;
	}

	public static MethodHandle SDL_GetHaptics$handle() {
		return SDL_GetHaptics.HANDLE;
	}

	public static MemorySegment SDL_GetHaptics$address() {
		return SDL_GetHaptics.ADDR;
	}

	public static MemorySegment SDL_GetHaptics(MemorySegment count) {
		var mh$ = SDL_GetHaptics.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetHaptics", count);
			}
			return (MemorySegment) mh$.invokeExact(count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetHapticNameForID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetHapticNameForID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetHapticNameForID$descriptor() {
		return SDL_GetHapticNameForID.DESC;
	}

	public static MethodHandle SDL_GetHapticNameForID$handle() {
		return SDL_GetHapticNameForID.HANDLE;
	}

	public static MemorySegment SDL_GetHapticNameForID$address() {
		return SDL_GetHapticNameForID.ADDR;
	}

	public static MemorySegment SDL_GetHapticNameForID(int instance_id) {
		var mh$ = SDL_GetHapticNameForID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetHapticNameForID", instance_id);
			}
			return (MemorySegment) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_OpenHaptic {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_OpenHaptic");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_OpenHaptic$descriptor() {
		return SDL_OpenHaptic.DESC;
	}

	public static MethodHandle SDL_OpenHaptic$handle() {
		return SDL_OpenHaptic.HANDLE;
	}

	public static MemorySegment SDL_OpenHaptic$address() {
		return SDL_OpenHaptic.ADDR;
	}

	public static MemorySegment SDL_OpenHaptic(int instance_id) {
		var mh$ = SDL_OpenHaptic.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_OpenHaptic", instance_id);
			}
			return (MemorySegment) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetHapticFromID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetHapticFromID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetHapticFromID$descriptor() {
		return SDL_GetHapticFromID.DESC;
	}

	public static MethodHandle SDL_GetHapticFromID$handle() {
		return SDL_GetHapticFromID.HANDLE;
	}

	public static MemorySegment SDL_GetHapticFromID$address() {
		return SDL_GetHapticFromID.ADDR;
	}

	public static MemorySegment SDL_GetHapticFromID(int instance_id) {
		var mh$ = SDL_GetHapticFromID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetHapticFromID", instance_id);
			}
			return (MemorySegment) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetHapticID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetHapticID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetHapticID$descriptor() {
		return SDL_GetHapticID.DESC;
	}

	public static MethodHandle SDL_GetHapticID$handle() {
		return SDL_GetHapticID.HANDLE;
	}

	public static MemorySegment SDL_GetHapticID$address() {
		return SDL_GetHapticID.ADDR;
	}

	public static int SDL_GetHapticID(MemorySegment haptic) {
		var mh$ = SDL_GetHapticID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetHapticID", haptic);
			}
			return (int) mh$.invokeExact(haptic);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetHapticName {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetHapticName");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetHapticName$descriptor() {
		return SDL_GetHapticName.DESC;
	}

	public static MethodHandle SDL_GetHapticName$handle() {
		return SDL_GetHapticName.HANDLE;
	}

	public static MemorySegment SDL_GetHapticName$address() {
		return SDL_GetHapticName.ADDR;
	}

	public static MemorySegment SDL_GetHapticName(MemorySegment haptic) {
		var mh$ = SDL_GetHapticName.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetHapticName", haptic);
			}
			return (MemorySegment) mh$.invokeExact(haptic);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_IsMouseHaptic {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_IsMouseHaptic");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_IsMouseHaptic$descriptor() {
		return SDL_IsMouseHaptic.DESC;
	}

	public static MethodHandle SDL_IsMouseHaptic$handle() {
		return SDL_IsMouseHaptic.HANDLE;
	}

	public static MemorySegment SDL_IsMouseHaptic$address() {
		return SDL_IsMouseHaptic.ADDR;
	}

	public static boolean SDL_IsMouseHaptic() {
		var mh$ = SDL_IsMouseHaptic.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_IsMouseHaptic");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_OpenHapticFromMouse {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_OpenHapticFromMouse");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_OpenHapticFromMouse$descriptor() {
		return SDL_OpenHapticFromMouse.DESC;
	}

	public static MethodHandle SDL_OpenHapticFromMouse$handle() {
		return SDL_OpenHapticFromMouse.HANDLE;
	}

	public static MemorySegment SDL_OpenHapticFromMouse$address() {
		return SDL_OpenHapticFromMouse.ADDR;
	}

	public static MemorySegment SDL_OpenHapticFromMouse() {
		var mh$ = SDL_OpenHapticFromMouse.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_OpenHapticFromMouse");
			}
			return (MemorySegment) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_IsJoystickHaptic {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_IsJoystickHaptic");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_IsJoystickHaptic$descriptor() {
		return SDL_IsJoystickHaptic.DESC;
	}

	public static MethodHandle SDL_IsJoystickHaptic$handle() {
		return SDL_IsJoystickHaptic.HANDLE;
	}

	public static MemorySegment SDL_IsJoystickHaptic$address() {
		return SDL_IsJoystickHaptic.ADDR;
	}

	public static boolean SDL_IsJoystickHaptic(MemorySegment joystick) {
		var mh$ = SDL_IsJoystickHaptic.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_IsJoystickHaptic", joystick);
			}
			return (boolean) mh$.invokeExact(joystick);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_OpenHapticFromJoystick {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_OpenHapticFromJoystick");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_OpenHapticFromJoystick$descriptor() {
		return SDL_OpenHapticFromJoystick.DESC;
	}

	public static MethodHandle SDL_OpenHapticFromJoystick$handle() {
		return SDL_OpenHapticFromJoystick.HANDLE;
	}

	public static MemorySegment SDL_OpenHapticFromJoystick$address() {
		return SDL_OpenHapticFromJoystick.ADDR;
	}

	public static MemorySegment SDL_OpenHapticFromJoystick(MemorySegment joystick) {
		var mh$ = SDL_OpenHapticFromJoystick.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_OpenHapticFromJoystick", joystick);
			}
			return (MemorySegment) mh$.invokeExact(joystick);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CloseHaptic {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CloseHaptic");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CloseHaptic$descriptor() {
		return SDL_CloseHaptic.DESC;
	}

	public static MethodHandle SDL_CloseHaptic$handle() {
		return SDL_CloseHaptic.HANDLE;
	}

	public static MemorySegment SDL_CloseHaptic$address() {
		return SDL_CloseHaptic.ADDR;
	}

	public static void SDL_CloseHaptic(MemorySegment haptic) {
		var mh$ = SDL_CloseHaptic.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CloseHaptic", haptic);
			}
			mh$.invokeExact(haptic);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetMaxHapticEffects {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetMaxHapticEffects");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetMaxHapticEffects$descriptor() {
		return SDL_GetMaxHapticEffects.DESC;
	}

	public static MethodHandle SDL_GetMaxHapticEffects$handle() {
		return SDL_GetMaxHapticEffects.HANDLE;
	}

	public static MemorySegment SDL_GetMaxHapticEffects$address() {
		return SDL_GetMaxHapticEffects.ADDR;
	}

	public static int SDL_GetMaxHapticEffects(MemorySegment haptic) {
		var mh$ = SDL_GetMaxHapticEffects.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetMaxHapticEffects", haptic);
			}
			return (int) mh$.invokeExact(haptic);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetMaxHapticEffectsPlaying {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetMaxHapticEffectsPlaying");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetMaxHapticEffectsPlaying$descriptor() {
		return SDL_GetMaxHapticEffectsPlaying.DESC;
	}

	public static MethodHandle SDL_GetMaxHapticEffectsPlaying$handle() {
		return SDL_GetMaxHapticEffectsPlaying.HANDLE;
	}

	public static MemorySegment SDL_GetMaxHapticEffectsPlaying$address() {
		return SDL_GetMaxHapticEffectsPlaying.ADDR;
	}

	public static int SDL_GetMaxHapticEffectsPlaying(MemorySegment haptic) {
		var mh$ = SDL_GetMaxHapticEffectsPlaying.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetMaxHapticEffectsPlaying", haptic);
			}
			return (int) mh$.invokeExact(haptic);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetHapticFeatures {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetHapticFeatures");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetHapticFeatures$descriptor() {
		return SDL_GetHapticFeatures.DESC;
	}

	public static MethodHandle SDL_GetHapticFeatures$handle() {
		return SDL_GetHapticFeatures.HANDLE;
	}

	public static MemorySegment SDL_GetHapticFeatures$address() {
		return SDL_GetHapticFeatures.ADDR;
	}

	public static int SDL_GetHapticFeatures(MemorySegment haptic) {
		var mh$ = SDL_GetHapticFeatures.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetHapticFeatures", haptic);
			}
			return (int) mh$.invokeExact(haptic);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetNumHapticAxes {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetNumHapticAxes");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetNumHapticAxes$descriptor() {
		return SDL_GetNumHapticAxes.DESC;
	}

	public static MethodHandle SDL_GetNumHapticAxes$handle() {
		return SDL_GetNumHapticAxes.HANDLE;
	}

	public static MemorySegment SDL_GetNumHapticAxes$address() {
		return SDL_GetNumHapticAxes.ADDR;
	}

	public static int SDL_GetNumHapticAxes(MemorySegment haptic) {
		var mh$ = SDL_GetNumHapticAxes.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetNumHapticAxes", haptic);
			}
			return (int) mh$.invokeExact(haptic);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_HapticEffectSupported {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_HapticEffectSupported");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_HapticEffectSupported$descriptor() {
		return SDL_HapticEffectSupported.DESC;
	}

	public static MethodHandle SDL_HapticEffectSupported$handle() {
		return SDL_HapticEffectSupported.HANDLE;
	}

	public static MemorySegment SDL_HapticEffectSupported$address() {
		return SDL_HapticEffectSupported.ADDR;
	}

	public static boolean SDL_HapticEffectSupported(MemorySegment haptic, MemorySegment effect) {
		var mh$ = SDL_HapticEffectSupported.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_HapticEffectSupported", haptic, effect);
			}
			return (boolean) mh$.invokeExact(haptic, effect);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateHapticEffect {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateHapticEffect");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateHapticEffect$descriptor() {
		return SDL_CreateHapticEffect.DESC;
	}

	public static MethodHandle SDL_CreateHapticEffect$handle() {
		return SDL_CreateHapticEffect.HANDLE;
	}

	public static MemorySegment SDL_CreateHapticEffect$address() {
		return SDL_CreateHapticEffect.ADDR;
	}

	public static int SDL_CreateHapticEffect(MemorySegment haptic, MemorySegment effect) {
		var mh$ = SDL_CreateHapticEffect.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateHapticEffect", haptic, effect);
			}
			return (int) mh$.invokeExact(haptic, effect);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_UpdateHapticEffect {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_UpdateHapticEffect");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_UpdateHapticEffect$descriptor() {
		return SDL_UpdateHapticEffect.DESC;
	}

	public static MethodHandle SDL_UpdateHapticEffect$handle() {
		return SDL_UpdateHapticEffect.HANDLE;
	}

	public static MemorySegment SDL_UpdateHapticEffect$address() {
		return SDL_UpdateHapticEffect.ADDR;
	}

	public static boolean SDL_UpdateHapticEffect(MemorySegment haptic, int effect, MemorySegment data) {
		var mh$ = SDL_UpdateHapticEffect.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_UpdateHapticEffect", haptic, effect, data);
			}
			return (boolean) mh$.invokeExact(haptic, effect, data);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RunHapticEffect {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RunHapticEffect");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RunHapticEffect$descriptor() {
		return SDL_RunHapticEffect.DESC;
	}

	public static MethodHandle SDL_RunHapticEffect$handle() {
		return SDL_RunHapticEffect.HANDLE;
	}

	public static MemorySegment SDL_RunHapticEffect$address() {
		return SDL_RunHapticEffect.ADDR;
	}

	public static boolean SDL_RunHapticEffect(MemorySegment haptic, int effect, int iterations) {
		var mh$ = SDL_RunHapticEffect.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RunHapticEffect", haptic, effect, iterations);
			}
			return (boolean) mh$.invokeExact(haptic, effect, iterations);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_StopHapticEffect {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_StopHapticEffect");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_StopHapticEffect$descriptor() {
		return SDL_StopHapticEffect.DESC;
	}

	public static MethodHandle SDL_StopHapticEffect$handle() {
		return SDL_StopHapticEffect.HANDLE;
	}

	public static MemorySegment SDL_StopHapticEffect$address() {
		return SDL_StopHapticEffect.ADDR;
	}

	public static boolean SDL_StopHapticEffect(MemorySegment haptic, int effect) {
		var mh$ = SDL_StopHapticEffect.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_StopHapticEffect", haptic, effect);
			}
			return (boolean) mh$.invokeExact(haptic, effect);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DestroyHapticEffect {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DestroyHapticEffect");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DestroyHapticEffect$descriptor() {
		return SDL_DestroyHapticEffect.DESC;
	}

	public static MethodHandle SDL_DestroyHapticEffect$handle() {
		return SDL_DestroyHapticEffect.HANDLE;
	}

	public static MemorySegment SDL_DestroyHapticEffect$address() {
		return SDL_DestroyHapticEffect.ADDR;
	}

	public static void SDL_DestroyHapticEffect(MemorySegment haptic, int effect) {
		var mh$ = SDL_DestroyHapticEffect.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DestroyHapticEffect", haptic, effect);
			}
			mh$.invokeExact(haptic, effect);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetHapticEffectStatus {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetHapticEffectStatus");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetHapticEffectStatus$descriptor() {
		return SDL_GetHapticEffectStatus.DESC;
	}

	public static MethodHandle SDL_GetHapticEffectStatus$handle() {
		return SDL_GetHapticEffectStatus.HANDLE;
	}

	public static MemorySegment SDL_GetHapticEffectStatus$address() {
		return SDL_GetHapticEffectStatus.ADDR;
	}

	public static boolean SDL_GetHapticEffectStatus(MemorySegment haptic, int effect) {
		var mh$ = SDL_GetHapticEffectStatus.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetHapticEffectStatus", haptic, effect);
			}
			return (boolean) mh$.invokeExact(haptic, effect);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetHapticGain {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetHapticGain");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetHapticGain$descriptor() {
		return SDL_SetHapticGain.DESC;
	}

	public static MethodHandle SDL_SetHapticGain$handle() {
		return SDL_SetHapticGain.HANDLE;
	}

	public static MemorySegment SDL_SetHapticGain$address() {
		return SDL_SetHapticGain.ADDR;
	}

	public static boolean SDL_SetHapticGain(MemorySegment haptic, int gain) {
		var mh$ = SDL_SetHapticGain.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetHapticGain", haptic, gain);
			}
			return (boolean) mh$.invokeExact(haptic, gain);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetHapticAutocenter {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetHapticAutocenter");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetHapticAutocenter$descriptor() {
		return SDL_SetHapticAutocenter.DESC;
	}

	public static MethodHandle SDL_SetHapticAutocenter$handle() {
		return SDL_SetHapticAutocenter.HANDLE;
	}

	public static MemorySegment SDL_SetHapticAutocenter$address() {
		return SDL_SetHapticAutocenter.ADDR;
	}

	public static boolean SDL_SetHapticAutocenter(MemorySegment haptic, int autocenter) {
		var mh$ = SDL_SetHapticAutocenter.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetHapticAutocenter", haptic, autocenter);
			}
			return (boolean) mh$.invokeExact(haptic, autocenter);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_PauseHaptic {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_PauseHaptic");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_PauseHaptic$descriptor() {
		return SDL_PauseHaptic.DESC;
	}

	public static MethodHandle SDL_PauseHaptic$handle() {
		return SDL_PauseHaptic.HANDLE;
	}

	public static MemorySegment SDL_PauseHaptic$address() {
		return SDL_PauseHaptic.ADDR;
	}

	public static boolean SDL_PauseHaptic(MemorySegment haptic) {
		var mh$ = SDL_PauseHaptic.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_PauseHaptic", haptic);
			}
			return (boolean) mh$.invokeExact(haptic);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ResumeHaptic {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ResumeHaptic");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ResumeHaptic$descriptor() {
		return SDL_ResumeHaptic.DESC;
	}

	public static MethodHandle SDL_ResumeHaptic$handle() {
		return SDL_ResumeHaptic.HANDLE;
	}

	public static MemorySegment SDL_ResumeHaptic$address() {
		return SDL_ResumeHaptic.ADDR;
	}

	public static boolean SDL_ResumeHaptic(MemorySegment haptic) {
		var mh$ = SDL_ResumeHaptic.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ResumeHaptic", haptic);
			}
			return (boolean) mh$.invokeExact(haptic);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_StopHapticEffects {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_StopHapticEffects");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_StopHapticEffects$descriptor() {
		return SDL_StopHapticEffects.DESC;
	}

	public static MethodHandle SDL_StopHapticEffects$handle() {
		return SDL_StopHapticEffects.HANDLE;
	}

	public static MemorySegment SDL_StopHapticEffects$address() {
		return SDL_StopHapticEffects.ADDR;
	}

	public static boolean SDL_StopHapticEffects(MemorySegment haptic) {
		var mh$ = SDL_StopHapticEffects.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_StopHapticEffects", haptic);
			}
			return (boolean) mh$.invokeExact(haptic);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_HapticRumbleSupported {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_HapticRumbleSupported");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_HapticRumbleSupported$descriptor() {
		return SDL_HapticRumbleSupported.DESC;
	}

	public static MethodHandle SDL_HapticRumbleSupported$handle() {
		return SDL_HapticRumbleSupported.HANDLE;
	}

	public static MemorySegment SDL_HapticRumbleSupported$address() {
		return SDL_HapticRumbleSupported.ADDR;
	}

	public static boolean SDL_HapticRumbleSupported(MemorySegment haptic) {
		var mh$ = SDL_HapticRumbleSupported.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_HapticRumbleSupported", haptic);
			}
			return (boolean) mh$.invokeExact(haptic);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_InitHapticRumble {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_InitHapticRumble");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_InitHapticRumble$descriptor() {
		return SDL_InitHapticRumble.DESC;
	}

	public static MethodHandle SDL_InitHapticRumble$handle() {
		return SDL_InitHapticRumble.HANDLE;
	}

	public static MemorySegment SDL_InitHapticRumble$address() {
		return SDL_InitHapticRumble.ADDR;
	}

	public static boolean SDL_InitHapticRumble(MemorySegment haptic) {
		var mh$ = SDL_InitHapticRumble.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_InitHapticRumble", haptic);
			}
			return (boolean) mh$.invokeExact(haptic);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_PlayHapticRumble {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_FLOAT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_PlayHapticRumble");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_PlayHapticRumble$descriptor() {
		return SDL_PlayHapticRumble.DESC;
	}

	public static MethodHandle SDL_PlayHapticRumble$handle() {
		return SDL_PlayHapticRumble.HANDLE;
	}

	public static MemorySegment SDL_PlayHapticRumble$address() {
		return SDL_PlayHapticRumble.ADDR;
	}

	public static boolean SDL_PlayHapticRumble(MemorySegment haptic, float strength, int length) {
		var mh$ = SDL_PlayHapticRumble.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_PlayHapticRumble", haptic, strength, length);
			}
			return (boolean) mh$.invokeExact(haptic, strength, length);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_StopHapticRumble {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_StopHapticRumble");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_StopHapticRumble$descriptor() {
		return SDL_StopHapticRumble.DESC;
	}

	public static MethodHandle SDL_StopHapticRumble$handle() {
		return SDL_StopHapticRumble.HANDLE;
	}

	public static MemorySegment SDL_StopHapticRumble$address() {
		return SDL_StopHapticRumble.ADDR;
	}

	public static boolean SDL_StopHapticRumble(MemorySegment haptic) {
		var mh$ = SDL_StopHapticRumble.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_StopHapticRumble", haptic);
			}
			return (boolean) mh$.invokeExact(haptic);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static final int SDL_HID_API_BUS_UNKNOWN = (int) 0L;

	public static int SDL_HID_API_BUS_UNKNOWN() {
		return SDL_HID_API_BUS_UNKNOWN;
	}

	private static final int SDL_HID_API_BUS_USB = (int) 1L;

	public static int SDL_HID_API_BUS_USB() {
		return SDL_HID_API_BUS_USB;
	}

	private static final int SDL_HID_API_BUS_BLUETOOTH = (int) 2L;

	public static int SDL_HID_API_BUS_BLUETOOTH() {
		return SDL_HID_API_BUS_BLUETOOTH;
	}

	private static final int SDL_HID_API_BUS_I2C = (int) 3L;

	public static int SDL_HID_API_BUS_I2C() {
		return SDL_HID_API_BUS_I2C;
	}

	private static final int SDL_HID_API_BUS_SPI = (int) 4L;

	public static int SDL_HID_API_BUS_SPI() {
		return SDL_HID_API_BUS_SPI;
	}

	private static class SDL_hid_init {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_hid_init");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_hid_init$descriptor() {
		return SDL_hid_init.DESC;
	}

	public static MethodHandle SDL_hid_init$handle() {
		return SDL_hid_init.HANDLE;
	}

	public static MemorySegment SDL_hid_init$address() {
		return SDL_hid_init.ADDR;
	}

	public static int SDL_hid_init() {
		var mh$ = SDL_hid_init.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_hid_init");
			}
			return (int) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_hid_exit {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_hid_exit");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_hid_exit$descriptor() {
		return SDL_hid_exit.DESC;
	}

	public static MethodHandle SDL_hid_exit$handle() {
		return SDL_hid_exit.HANDLE;
	}

	public static MemorySegment SDL_hid_exit$address() {
		return SDL_hid_exit.ADDR;
	}

	public static int SDL_hid_exit() {
		var mh$ = SDL_hid_exit.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_hid_exit");
			}
			return (int) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_hid_device_change_count {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_hid_device_change_count");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_hid_device_change_count$descriptor() {
		return SDL_hid_device_change_count.DESC;
	}

	public static MethodHandle SDL_hid_device_change_count$handle() {
		return SDL_hid_device_change_count.HANDLE;
	}

	public static MemorySegment SDL_hid_device_change_count$address() {
		return SDL_hid_device_change_count.ADDR;
	}

	public static int SDL_hid_device_change_count() {
		var mh$ = SDL_hid_device_change_count.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_hid_device_change_count");
			}
			return (int) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_hid_enumerate {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_SHORT,
				SDL3.C_SHORT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_hid_enumerate");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_hid_enumerate$descriptor() {
		return SDL_hid_enumerate.DESC;
	}

	public static MethodHandle SDL_hid_enumerate$handle() {
		return SDL_hid_enumerate.HANDLE;
	}

	public static MemorySegment SDL_hid_enumerate$address() {
		return SDL_hid_enumerate.ADDR;
	}

	public static MemorySegment SDL_hid_enumerate(short vendor_id, short product_id) {
		var mh$ = SDL_hid_enumerate.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_hid_enumerate", vendor_id, product_id);
			}
			return (MemorySegment) mh$.invokeExact(vendor_id, product_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_hid_free_enumeration {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_hid_free_enumeration");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_hid_free_enumeration$descriptor() {
		return SDL_hid_free_enumeration.DESC;
	}

	public static MethodHandle SDL_hid_free_enumeration$handle() {
		return SDL_hid_free_enumeration.HANDLE;
	}

	public static MemorySegment SDL_hid_free_enumeration$address() {
		return SDL_hid_free_enumeration.ADDR;
	}

	public static void SDL_hid_free_enumeration(MemorySegment devs) {
		var mh$ = SDL_hid_free_enumeration.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_hid_free_enumeration", devs);
			}
			mh$.invokeExact(devs);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_hid_open {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_SHORT,
				SDL3.C_SHORT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_hid_open");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_hid_open$descriptor() {
		return SDL_hid_open.DESC;
	}

	public static MethodHandle SDL_hid_open$handle() {
		return SDL_hid_open.HANDLE;
	}

	public static MemorySegment SDL_hid_open$address() {
		return SDL_hid_open.ADDR;
	}

	public static MemorySegment SDL_hid_open(short vendor_id, short product_id, MemorySegment serial_number) {
		var mh$ = SDL_hid_open.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_hid_open", vendor_id, product_id, serial_number);
			}
			return (MemorySegment) mh$.invokeExact(vendor_id, product_id, serial_number);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_hid_open_path {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_hid_open_path");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_hid_open_path$descriptor() {
		return SDL_hid_open_path.DESC;
	}

	public static MethodHandle SDL_hid_open_path$handle() {
		return SDL_hid_open_path.HANDLE;
	}

	public static MemorySegment SDL_hid_open_path$address() {
		return SDL_hid_open_path.ADDR;
	}

	public static MemorySegment SDL_hid_open_path(MemorySegment path) {
		var mh$ = SDL_hid_open_path.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_hid_open_path", path);
			}
			return (MemorySegment) mh$.invokeExact(path);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_hid_get_properties {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_hid_get_properties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_hid_get_properties$descriptor() {
		return SDL_hid_get_properties.DESC;
	}

	public static MethodHandle SDL_hid_get_properties$handle() {
		return SDL_hid_get_properties.HANDLE;
	}

	public static MemorySegment SDL_hid_get_properties$address() {
		return SDL_hid_get_properties.ADDR;
	}

	public static int SDL_hid_get_properties(MemorySegment dev) {
		var mh$ = SDL_hid_get_properties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_hid_get_properties", dev);
			}
			return (int) mh$.invokeExact(dev);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_hid_write {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_hid_write");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_hid_write$descriptor() {
		return SDL_hid_write.DESC;
	}

	public static MethodHandle SDL_hid_write$handle() {
		return SDL_hid_write.HANDLE;
	}

	public static MemorySegment SDL_hid_write$address() {
		return SDL_hid_write.ADDR;
	}

	public static int SDL_hid_write(MemorySegment dev, MemorySegment data, long length) {
		var mh$ = SDL_hid_write.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_hid_write", dev, data, length);
			}
			return (int) mh$.invokeExact(dev, data, length);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_hid_read_timeout {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_hid_read_timeout");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_hid_read_timeout$descriptor() {
		return SDL_hid_read_timeout.DESC;
	}

	public static MethodHandle SDL_hid_read_timeout$handle() {
		return SDL_hid_read_timeout.HANDLE;
	}

	public static MemorySegment SDL_hid_read_timeout$address() {
		return SDL_hid_read_timeout.ADDR;
	}

	public static int SDL_hid_read_timeout(MemorySegment dev, MemorySegment data, long length, int milliseconds) {
		var mh$ = SDL_hid_read_timeout.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_hid_read_timeout", dev, data, length, milliseconds);
			}
			return (int) mh$.invokeExact(dev, data, length, milliseconds);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_hid_read {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_hid_read");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_hid_read$descriptor() {
		return SDL_hid_read.DESC;
	}

	public static MethodHandle SDL_hid_read$handle() {
		return SDL_hid_read.HANDLE;
	}

	public static MemorySegment SDL_hid_read$address() {
		return SDL_hid_read.ADDR;
	}

	public static int SDL_hid_read(MemorySegment dev, MemorySegment data, long length) {
		var mh$ = SDL_hid_read.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_hid_read", dev, data, length);
			}
			return (int) mh$.invokeExact(dev, data, length);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_hid_set_nonblocking {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_hid_set_nonblocking");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_hid_set_nonblocking$descriptor() {
		return SDL_hid_set_nonblocking.DESC;
	}

	public static MethodHandle SDL_hid_set_nonblocking$handle() {
		return SDL_hid_set_nonblocking.HANDLE;
	}

	public static MemorySegment SDL_hid_set_nonblocking$address() {
		return SDL_hid_set_nonblocking.ADDR;
	}

	public static int SDL_hid_set_nonblocking(MemorySegment dev, int nonblock) {
		var mh$ = SDL_hid_set_nonblocking.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_hid_set_nonblocking", dev, nonblock);
			}
			return (int) mh$.invokeExact(dev, nonblock);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_hid_send_feature_report {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_hid_send_feature_report");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_hid_send_feature_report$descriptor() {
		return SDL_hid_send_feature_report.DESC;
	}

	public static MethodHandle SDL_hid_send_feature_report$handle() {
		return SDL_hid_send_feature_report.HANDLE;
	}

	public static MemorySegment SDL_hid_send_feature_report$address() {
		return SDL_hid_send_feature_report.ADDR;
	}

	public static int SDL_hid_send_feature_report(MemorySegment dev, MemorySegment data, long length) {
		var mh$ = SDL_hid_send_feature_report.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_hid_send_feature_report", dev, data, length);
			}
			return (int) mh$.invokeExact(dev, data, length);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_hid_get_feature_report {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_hid_get_feature_report");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_hid_get_feature_report$descriptor() {
		return SDL_hid_get_feature_report.DESC;
	}

	public static MethodHandle SDL_hid_get_feature_report$handle() {
		return SDL_hid_get_feature_report.HANDLE;
	}

	public static MemorySegment SDL_hid_get_feature_report$address() {
		return SDL_hid_get_feature_report.ADDR;
	}

	public static int SDL_hid_get_feature_report(MemorySegment dev, MemorySegment data, long length) {
		var mh$ = SDL_hid_get_feature_report.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_hid_get_feature_report", dev, data, length);
			}
			return (int) mh$.invokeExact(dev, data, length);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_hid_get_input_report {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_hid_get_input_report");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_hid_get_input_report$descriptor() {
		return SDL_hid_get_input_report.DESC;
	}

	public static MethodHandle SDL_hid_get_input_report$handle() {
		return SDL_hid_get_input_report.HANDLE;
	}

	public static MemorySegment SDL_hid_get_input_report$address() {
		return SDL_hid_get_input_report.ADDR;
	}

	public static int SDL_hid_get_input_report(MemorySegment dev, MemorySegment data, long length) {
		var mh$ = SDL_hid_get_input_report.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_hid_get_input_report", dev, data, length);
			}
			return (int) mh$.invokeExact(dev, data, length);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_hid_close {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_hid_close");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_hid_close$descriptor() {
		return SDL_hid_close.DESC;
	}

	public static MethodHandle SDL_hid_close$handle() {
		return SDL_hid_close.HANDLE;
	}

	public static MemorySegment SDL_hid_close$address() {
		return SDL_hid_close.ADDR;
	}

	public static int SDL_hid_close(MemorySegment dev) {
		var mh$ = SDL_hid_close.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_hid_close", dev);
			}
			return (int) mh$.invokeExact(dev);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_hid_get_manufacturer_string {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_hid_get_manufacturer_string");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_hid_get_manufacturer_string$descriptor() {
		return SDL_hid_get_manufacturer_string.DESC;
	}

	public static MethodHandle SDL_hid_get_manufacturer_string$handle() {
		return SDL_hid_get_manufacturer_string.HANDLE;
	}

	public static MemorySegment SDL_hid_get_manufacturer_string$address() {
		return SDL_hid_get_manufacturer_string.ADDR;
	}

	public static int SDL_hid_get_manufacturer_string(MemorySegment dev, MemorySegment string, long maxlen) {
		var mh$ = SDL_hid_get_manufacturer_string.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_hid_get_manufacturer_string", dev, string, maxlen);
			}
			return (int) mh$.invokeExact(dev, string, maxlen);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_hid_get_product_string {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_hid_get_product_string");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_hid_get_product_string$descriptor() {
		return SDL_hid_get_product_string.DESC;
	}

	public static MethodHandle SDL_hid_get_product_string$handle() {
		return SDL_hid_get_product_string.HANDLE;
	}

	public static MemorySegment SDL_hid_get_product_string$address() {
		return SDL_hid_get_product_string.ADDR;
	}

	public static int SDL_hid_get_product_string(MemorySegment dev, MemorySegment string, long maxlen) {
		var mh$ = SDL_hid_get_product_string.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_hid_get_product_string", dev, string, maxlen);
			}
			return (int) mh$.invokeExact(dev, string, maxlen);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_hid_get_serial_number_string {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_hid_get_serial_number_string");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_hid_get_serial_number_string$descriptor() {
		return SDL_hid_get_serial_number_string.DESC;
	}

	public static MethodHandle SDL_hid_get_serial_number_string$handle() {
		return SDL_hid_get_serial_number_string.HANDLE;
	}

	public static MemorySegment SDL_hid_get_serial_number_string$address() {
		return SDL_hid_get_serial_number_string.ADDR;
	}

	public static int SDL_hid_get_serial_number_string(MemorySegment dev, MemorySegment string, long maxlen) {
		var mh$ = SDL_hid_get_serial_number_string.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_hid_get_serial_number_string", dev, string, maxlen);
			}
			return (int) mh$.invokeExact(dev, string, maxlen);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_hid_get_indexed_string {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_hid_get_indexed_string");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_hid_get_indexed_string$descriptor() {
		return SDL_hid_get_indexed_string.DESC;
	}

	public static MethodHandle SDL_hid_get_indexed_string$handle() {
		return SDL_hid_get_indexed_string.HANDLE;
	}

	public static MemorySegment SDL_hid_get_indexed_string$address() {
		return SDL_hid_get_indexed_string.ADDR;
	}

	public static int SDL_hid_get_indexed_string(MemorySegment dev, int string_index, MemorySegment string, long maxlen) {
		var mh$ = SDL_hid_get_indexed_string.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_hid_get_indexed_string", dev, string_index, string, maxlen);
			}
			return (int) mh$.invokeExact(dev, string_index, string, maxlen);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_hid_get_device_info {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_hid_get_device_info");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_hid_get_device_info$descriptor() {
		return SDL_hid_get_device_info.DESC;
	}

	public static MethodHandle SDL_hid_get_device_info$handle() {
		return SDL_hid_get_device_info.HANDLE;
	}

	public static MemorySegment SDL_hid_get_device_info$address() {
		return SDL_hid_get_device_info.ADDR;
	}

	public static MemorySegment SDL_hid_get_device_info(MemorySegment dev) {
		var mh$ = SDL_hid_get_device_info.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_hid_get_device_info", dev);
			}
			return (MemorySegment) mh$.invokeExact(dev);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_hid_get_report_descriptor {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_hid_get_report_descriptor");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_hid_get_report_descriptor$descriptor() {
		return SDL_hid_get_report_descriptor.DESC;
	}

	public static MethodHandle SDL_hid_get_report_descriptor$handle() {
		return SDL_hid_get_report_descriptor.HANDLE;
	}

	public static MemorySegment SDL_hid_get_report_descriptor$address() {
		return SDL_hid_get_report_descriptor.ADDR;
	}

	public static int SDL_hid_get_report_descriptor(MemorySegment dev, MemorySegment buf, long buf_size) {
		var mh$ = SDL_hid_get_report_descriptor.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_hid_get_report_descriptor", dev, buf, buf_size);
			}
			return (int) mh$.invokeExact(dev, buf, buf_size);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_hid_ble_scan {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_hid_ble_scan");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_hid_ble_scan$descriptor() {
		return SDL_hid_ble_scan.DESC;
	}

	public static MethodHandle SDL_hid_ble_scan$handle() {
		return SDL_hid_ble_scan.HANDLE;
	}

	public static MemorySegment SDL_hid_ble_scan$address() {
		return SDL_hid_ble_scan.ADDR;
	}

	public static void SDL_hid_ble_scan(boolean active) {
		var mh$ = SDL_hid_ble_scan.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_hid_ble_scan", active);
			}
			mh$.invokeExact(active);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static final int SDL_HINT_DEFAULT = (int) 0L;

	public static int SDL_HINT_DEFAULT() {
		return SDL_HINT_DEFAULT;
	}

	private static final int SDL_HINT_NORMAL = (int) 1L;

	public static int SDL_HINT_NORMAL() {
		return SDL_HINT_NORMAL;
	}

	private static final int SDL_HINT_OVERRIDE = (int) 2L;

	public static int SDL_HINT_OVERRIDE() {
		return SDL_HINT_OVERRIDE;
	}

	private static class SDL_SetHintWithPriority {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetHintWithPriority");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetHintWithPriority$descriptor() {
		return SDL_SetHintWithPriority.DESC;
	}

	public static MethodHandle SDL_SetHintWithPriority$handle() {
		return SDL_SetHintWithPriority.HANDLE;
	}

	public static MemorySegment SDL_SetHintWithPriority$address() {
		return SDL_SetHintWithPriority.ADDR;
	}

	public static boolean SDL_SetHintWithPriority(MemorySegment name, MemorySegment value, int priority) {
		var mh$ = SDL_SetHintWithPriority.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetHintWithPriority", name, value, priority);
			}
			return (boolean) mh$.invokeExact(name, value, priority);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetHint {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetHint");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetHint$descriptor() {
		return SDL_SetHint.DESC;
	}

	public static MethodHandle SDL_SetHint$handle() {
		return SDL_SetHint.HANDLE;
	}

	public static MemorySegment SDL_SetHint$address() {
		return SDL_SetHint.ADDR;
	}

	public static boolean SDL_SetHint(MemorySegment name, MemorySegment value) {
		var mh$ = SDL_SetHint.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetHint", name, value);
			}
			return (boolean) mh$.invokeExact(name, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ResetHint {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ResetHint");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ResetHint$descriptor() {
		return SDL_ResetHint.DESC;
	}

	public static MethodHandle SDL_ResetHint$handle() {
		return SDL_ResetHint.HANDLE;
	}

	public static MemorySegment SDL_ResetHint$address() {
		return SDL_ResetHint.ADDR;
	}

	public static boolean SDL_ResetHint(MemorySegment name) {
		var mh$ = SDL_ResetHint.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ResetHint", name);
			}
			return (boolean) mh$.invokeExact(name);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ResetHints {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid();

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ResetHints");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ResetHints$descriptor() {
		return SDL_ResetHints.DESC;
	}

	public static MethodHandle SDL_ResetHints$handle() {
		return SDL_ResetHints.HANDLE;
	}

	public static MemorySegment SDL_ResetHints$address() {
		return SDL_ResetHints.ADDR;
	}

	public static void SDL_ResetHints() {
		var mh$ = SDL_ResetHints.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ResetHints");
			}
			mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetHint {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetHint");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetHint$descriptor() {
		return SDL_GetHint.DESC;
	}

	public static MethodHandle SDL_GetHint$handle() {
		return SDL_GetHint.HANDLE;
	}

	public static MemorySegment SDL_GetHint$address() {
		return SDL_GetHint.ADDR;
	}

	public static MemorySegment SDL_GetHint(MemorySegment name) {
		var mh$ = SDL_GetHint.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetHint", name);
			}
			return (MemorySegment) mh$.invokeExact(name);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetHintBoolean {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetHintBoolean");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetHintBoolean$descriptor() {
		return SDL_GetHintBoolean.DESC;
	}

	public static MethodHandle SDL_GetHintBoolean$handle() {
		return SDL_GetHintBoolean.HANDLE;
	}

	public static MemorySegment SDL_GetHintBoolean$address() {
		return SDL_GetHintBoolean.ADDR;
	}

	public static boolean SDL_GetHintBoolean(MemorySegment name, boolean default_value) {
		var mh$ = SDL_GetHintBoolean.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetHintBoolean", name, default_value);
			}
			return (boolean) mh$.invokeExact(name, default_value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_AddHintCallback {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_AddHintCallback");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_AddHintCallback$descriptor() {
		return SDL_AddHintCallback.DESC;
	}

	public static MethodHandle SDL_AddHintCallback$handle() {
		return SDL_AddHintCallback.HANDLE;
	}

	public static MemorySegment SDL_AddHintCallback$address() {
		return SDL_AddHintCallback.ADDR;
	}

	public static boolean SDL_AddHintCallback(MemorySegment name, MemorySegment callback, MemorySegment userdata) {
		var mh$ = SDL_AddHintCallback.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_AddHintCallback", name, callback, userdata);
			}
			return (boolean) mh$.invokeExact(name, callback, userdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RemoveHintCallback {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RemoveHintCallback");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RemoveHintCallback$descriptor() {
		return SDL_RemoveHintCallback.DESC;
	}

	public static MethodHandle SDL_RemoveHintCallback$handle() {
		return SDL_RemoveHintCallback.HANDLE;
	}

	public static MemorySegment SDL_RemoveHintCallback$address() {
		return SDL_RemoveHintCallback.ADDR;
	}

	public static void SDL_RemoveHintCallback(MemorySegment name, MemorySegment callback, MemorySegment userdata) {
		var mh$ = SDL_RemoveHintCallback.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RemoveHintCallback", name, callback, userdata);
			}
			mh$.invokeExact(name, callback, userdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	public static OfInt SDL_InitFlags = SDL3.C_INT;
	private static final int SDL_APP_CONTINUE = (int) 0L;

	public static int SDL_APP_CONTINUE() {
		return SDL_APP_CONTINUE;
	}

	private static final int SDL_APP_SUCCESS = (int) 1L;

	public static int SDL_APP_SUCCESS() {
		return SDL_APP_SUCCESS;
	}

	private static final int SDL_APP_FAILURE = (int) 2L;

	public static int SDL_APP_FAILURE() {
		return SDL_APP_FAILURE;
	}

	private static class SDL_Init {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_Init");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_Init$descriptor() {
		return SDL_Init.DESC;
	}

	public static MethodHandle SDL_Init$handle() {
		return SDL_Init.HANDLE;
	}

	public static MemorySegment SDL_Init$address() {
		return SDL_Init.ADDR;
	}

	public static boolean SDL_Init(int flags) {
		var mh$ = SDL_Init.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_Init", flags);
			}
			return (boolean) mh$.invokeExact(flags);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_InitSubSystem {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_InitSubSystem");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_InitSubSystem$descriptor() {
		return SDL_InitSubSystem.DESC;
	}

	public static MethodHandle SDL_InitSubSystem$handle() {
		return SDL_InitSubSystem.HANDLE;
	}

	public static MemorySegment SDL_InitSubSystem$address() {
		return SDL_InitSubSystem.ADDR;
	}

	public static boolean SDL_InitSubSystem(int flags) {
		var mh$ = SDL_InitSubSystem.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_InitSubSystem", flags);
			}
			return (boolean) mh$.invokeExact(flags);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_QuitSubSystem {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_QuitSubSystem");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_QuitSubSystem$descriptor() {
		return SDL_QuitSubSystem.DESC;
	}

	public static MethodHandle SDL_QuitSubSystem$handle() {
		return SDL_QuitSubSystem.HANDLE;
	}

	public static MemorySegment SDL_QuitSubSystem$address() {
		return SDL_QuitSubSystem.ADDR;
	}

	public static void SDL_QuitSubSystem(int flags) {
		var mh$ = SDL_QuitSubSystem.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_QuitSubSystem", flags);
			}
			mh$.invokeExact(flags);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WasInit {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WasInit");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WasInit$descriptor() {
		return SDL_WasInit.DESC;
	}

	public static MethodHandle SDL_WasInit$handle() {
		return SDL_WasInit.HANDLE;
	}

	public static MemorySegment SDL_WasInit$address() {
		return SDL_WasInit.ADDR;
	}

	public static int SDL_WasInit(int flags) {
		var mh$ = SDL_WasInit.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WasInit", flags);
			}
			return (int) mh$.invokeExact(flags);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_Quit {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid();

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_Quit");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_Quit$descriptor() {
		return SDL_Quit.DESC;
	}

	public static MethodHandle SDL_Quit$handle() {
		return SDL_Quit.HANDLE;
	}

	public static MemorySegment SDL_Quit$address() {
		return SDL_Quit.ADDR;
	}

	public static void SDL_Quit() {
		var mh$ = SDL_Quit.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_Quit");
			}
			mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_IsMainThread {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_IsMainThread");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_IsMainThread$descriptor() {
		return SDL_IsMainThread.DESC;
	}

	public static MethodHandle SDL_IsMainThread$handle() {
		return SDL_IsMainThread.HANDLE;
	}

	public static MemorySegment SDL_IsMainThread$address() {
		return SDL_IsMainThread.ADDR;
	}

	public static boolean SDL_IsMainThread() {
		var mh$ = SDL_IsMainThread.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_IsMainThread");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RunOnMainThread {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RunOnMainThread");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RunOnMainThread$descriptor() {
		return SDL_RunOnMainThread.DESC;
	}

	public static MethodHandle SDL_RunOnMainThread$handle() {
		return SDL_RunOnMainThread.HANDLE;
	}

	public static MemorySegment SDL_RunOnMainThread$address() {
		return SDL_RunOnMainThread.ADDR;
	}

	public static boolean SDL_RunOnMainThread(MemorySegment callback, MemorySegment userdata, boolean wait_complete) {
		var mh$ = SDL_RunOnMainThread.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RunOnMainThread", callback, userdata, wait_complete);
			}
			return (boolean) mh$.invokeExact(callback, userdata, wait_complete);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetAppMetadata {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetAppMetadata");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetAppMetadata$descriptor() {
		return SDL_SetAppMetadata.DESC;
	}

	public static MethodHandle SDL_SetAppMetadata$handle() {
		return SDL_SetAppMetadata.HANDLE;
	}

	public static MemorySegment SDL_SetAppMetadata$address() {
		return SDL_SetAppMetadata.ADDR;
	}

	public static boolean SDL_SetAppMetadata(MemorySegment appname, MemorySegment appversion, MemorySegment appidentifier) {
		var mh$ = SDL_SetAppMetadata.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetAppMetadata", appname, appversion, appidentifier);
			}
			return (boolean) mh$.invokeExact(appname, appversion, appidentifier);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetAppMetadataProperty {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetAppMetadataProperty");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetAppMetadataProperty$descriptor() {
		return SDL_SetAppMetadataProperty.DESC;
	}

	public static MethodHandle SDL_SetAppMetadataProperty$handle() {
		return SDL_SetAppMetadataProperty.HANDLE;
	}

	public static MemorySegment SDL_SetAppMetadataProperty$address() {
		return SDL_SetAppMetadataProperty.ADDR;
	}

	public static boolean SDL_SetAppMetadataProperty(MemorySegment name, MemorySegment value) {
		var mh$ = SDL_SetAppMetadataProperty.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetAppMetadataProperty", name, value);
			}
			return (boolean) mh$.invokeExact(name, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetAppMetadataProperty {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetAppMetadataProperty");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetAppMetadataProperty$descriptor() {
		return SDL_GetAppMetadataProperty.DESC;
	}

	public static MethodHandle SDL_GetAppMetadataProperty$handle() {
		return SDL_GetAppMetadataProperty.HANDLE;
	}

	public static MemorySegment SDL_GetAppMetadataProperty$address() {
		return SDL_GetAppMetadataProperty.ADDR;
	}

	public static MemorySegment SDL_GetAppMetadataProperty(MemorySegment name) {
		var mh$ = SDL_GetAppMetadataProperty.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetAppMetadataProperty", name);
			}
			return (MemorySegment) mh$.invokeExact(name);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_LoadObject {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_LoadObject");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_LoadObject$descriptor() {
		return SDL_LoadObject.DESC;
	}

	public static MethodHandle SDL_LoadObject$handle() {
		return SDL_LoadObject.HANDLE;
	}

	public static MemorySegment SDL_LoadObject$address() {
		return SDL_LoadObject.ADDR;
	}

	public static MemorySegment SDL_LoadObject(MemorySegment sofile) {
		var mh$ = SDL_LoadObject.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_LoadObject", sofile);
			}
			return (MemorySegment) mh$.invokeExact(sofile);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_LoadFunction {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_LoadFunction");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_LoadFunction$descriptor() {
		return SDL_LoadFunction.DESC;
	}

	public static MethodHandle SDL_LoadFunction$handle() {
		return SDL_LoadFunction.HANDLE;
	}

	public static MemorySegment SDL_LoadFunction$address() {
		return SDL_LoadFunction.ADDR;
	}

	public static MemorySegment SDL_LoadFunction(MemorySegment handle, MemorySegment name) {
		var mh$ = SDL_LoadFunction.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_LoadFunction", handle, name);
			}
			return (MemorySegment) mh$.invokeExact(handle, name);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_UnloadObject {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_UnloadObject");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_UnloadObject$descriptor() {
		return SDL_UnloadObject.DESC;
	}

	public static MethodHandle SDL_UnloadObject$handle() {
		return SDL_UnloadObject.HANDLE;
	}

	public static MemorySegment SDL_UnloadObject$address() {
		return SDL_UnloadObject.ADDR;
	}

	public static void SDL_UnloadObject(MemorySegment handle) {
		var mh$ = SDL_UnloadObject.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_UnloadObject", handle);
			}
			mh$.invokeExact(handle);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetPreferredLocales {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetPreferredLocales");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetPreferredLocales$descriptor() {
		return SDL_GetPreferredLocales.DESC;
	}

	public static MethodHandle SDL_GetPreferredLocales$handle() {
		return SDL_GetPreferredLocales.HANDLE;
	}

	public static MemorySegment SDL_GetPreferredLocales$address() {
		return SDL_GetPreferredLocales.ADDR;
	}

	public static MemorySegment SDL_GetPreferredLocales(MemorySegment count) {
		var mh$ = SDL_GetPreferredLocales.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetPreferredLocales", count);
			}
			return (MemorySegment) mh$.invokeExact(count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static final int SDL_LOG_CATEGORY_APPLICATION = (int) 0L;

	public static int SDL_LOG_CATEGORY_APPLICATION() {
		return SDL_LOG_CATEGORY_APPLICATION;
	}

	private static final int SDL_LOG_CATEGORY_ERROR = (int) 1L;

	public static int SDL_LOG_CATEGORY_ERROR() {
		return SDL_LOG_CATEGORY_ERROR;
	}

	private static final int SDL_LOG_CATEGORY_ASSERT = (int) 2L;

	public static int SDL_LOG_CATEGORY_ASSERT() {
		return SDL_LOG_CATEGORY_ASSERT;
	}

	private static final int SDL_LOG_CATEGORY_SYSTEM = (int) 3L;

	public static int SDL_LOG_CATEGORY_SYSTEM() {
		return SDL_LOG_CATEGORY_SYSTEM;
	}

	private static final int SDL_LOG_CATEGORY_AUDIO = (int) 4L;

	public static int SDL_LOG_CATEGORY_AUDIO() {
		return SDL_LOG_CATEGORY_AUDIO;
	}

	private static final int SDL_LOG_CATEGORY_VIDEO = (int) 5L;

	public static int SDL_LOG_CATEGORY_VIDEO() {
		return SDL_LOG_CATEGORY_VIDEO;
	}

	private static final int SDL_LOG_CATEGORY_RENDER = (int) 6L;

	public static int SDL_LOG_CATEGORY_RENDER() {
		return SDL_LOG_CATEGORY_RENDER;
	}

	private static final int SDL_LOG_CATEGORY_INPUT = (int) 7L;

	public static int SDL_LOG_CATEGORY_INPUT() {
		return SDL_LOG_CATEGORY_INPUT;
	}

	private static final int SDL_LOG_CATEGORY_TEST = (int) 8L;

	public static int SDL_LOG_CATEGORY_TEST() {
		return SDL_LOG_CATEGORY_TEST;
	}

	private static final int SDL_LOG_CATEGORY_GPU = (int) 9L;

	public static int SDL_LOG_CATEGORY_GPU() {
		return SDL_LOG_CATEGORY_GPU;
	}

	private static final int SDL_LOG_CATEGORY_RESERVED2 = (int) 10L;

	public static int SDL_LOG_CATEGORY_RESERVED2() {
		return SDL_LOG_CATEGORY_RESERVED2;
	}

	private static final int SDL_LOG_CATEGORY_RESERVED3 = (int) 11L;

	public static int SDL_LOG_CATEGORY_RESERVED3() {
		return SDL_LOG_CATEGORY_RESERVED3;
	}

	private static final int SDL_LOG_CATEGORY_RESERVED4 = (int) 12L;

	public static int SDL_LOG_CATEGORY_RESERVED4() {
		return SDL_LOG_CATEGORY_RESERVED4;
	}

	private static final int SDL_LOG_CATEGORY_RESERVED5 = (int) 13L;

	public static int SDL_LOG_CATEGORY_RESERVED5() {
		return SDL_LOG_CATEGORY_RESERVED5;
	}

	private static final int SDL_LOG_CATEGORY_RESERVED6 = (int) 14L;

	public static int SDL_LOG_CATEGORY_RESERVED6() {
		return SDL_LOG_CATEGORY_RESERVED6;
	}

	private static final int SDL_LOG_CATEGORY_RESERVED7 = (int) 15L;

	public static int SDL_LOG_CATEGORY_RESERVED7() {
		return SDL_LOG_CATEGORY_RESERVED7;
	}

	private static final int SDL_LOG_CATEGORY_RESERVED8 = (int) 16L;

	public static int SDL_LOG_CATEGORY_RESERVED8() {
		return SDL_LOG_CATEGORY_RESERVED8;
	}

	private static final int SDL_LOG_CATEGORY_RESERVED9 = (int) 17L;

	public static int SDL_LOG_CATEGORY_RESERVED9() {
		return SDL_LOG_CATEGORY_RESERVED9;
	}

	private static final int SDL_LOG_CATEGORY_RESERVED10 = (int) 18L;

	public static int SDL_LOG_CATEGORY_RESERVED10() {
		return SDL_LOG_CATEGORY_RESERVED10;
	}

	private static final int SDL_LOG_CATEGORY_CUSTOM = (int) 19L;

	public static int SDL_LOG_CATEGORY_CUSTOM() {
		return SDL_LOG_CATEGORY_CUSTOM;
	}

	private static final int SDL_LOG_PRIORITY_INVALID = (int) 0L;

	public static int SDL_LOG_PRIORITY_INVALID() {
		return SDL_LOG_PRIORITY_INVALID;
	}

	private static final int SDL_LOG_PRIORITY_TRACE = (int) 1L;

	public static int SDL_LOG_PRIORITY_TRACE() {
		return SDL_LOG_PRIORITY_TRACE;
	}

	private static final int SDL_LOG_PRIORITY_VERBOSE = (int) 2L;

	public static int SDL_LOG_PRIORITY_VERBOSE() {
		return SDL_LOG_PRIORITY_VERBOSE;
	}

	private static final int SDL_LOG_PRIORITY_DEBUG = (int) 3L;

	public static int SDL_LOG_PRIORITY_DEBUG() {
		return SDL_LOG_PRIORITY_DEBUG;
	}

	private static final int SDL_LOG_PRIORITY_INFO = (int) 4L;

	public static int SDL_LOG_PRIORITY_INFO() {
		return SDL_LOG_PRIORITY_INFO;
	}

	private static final int SDL_LOG_PRIORITY_WARN = (int) 5L;

	public static int SDL_LOG_PRIORITY_WARN() {
		return SDL_LOG_PRIORITY_WARN;
	}

	private static final int SDL_LOG_PRIORITY_ERROR = (int) 6L;

	public static int SDL_LOG_PRIORITY_ERROR() {
		return SDL_LOG_PRIORITY_ERROR;
	}

	private static final int SDL_LOG_PRIORITY_CRITICAL = (int) 7L;

	public static int SDL_LOG_PRIORITY_CRITICAL() {
		return SDL_LOG_PRIORITY_CRITICAL;
	}

	private static final int SDL_LOG_PRIORITY_COUNT = (int) 8L;

	public static int SDL_LOG_PRIORITY_COUNT() {
		return SDL_LOG_PRIORITY_COUNT;
	}

	private static class SDL_SetLogPriorities {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetLogPriorities");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetLogPriorities$descriptor() {
		return SDL_SetLogPriorities.DESC;
	}

	public static MethodHandle SDL_SetLogPriorities$handle() {
		return SDL_SetLogPriorities.HANDLE;
	}

	public static MemorySegment SDL_SetLogPriorities$address() {
		return SDL_SetLogPriorities.ADDR;
	}

	public static void SDL_SetLogPriorities(int priority) {
		var mh$ = SDL_SetLogPriorities.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetLogPriorities", priority);
			}
			mh$.invokeExact(priority);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetLogPriority {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetLogPriority");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetLogPriority$descriptor() {
		return SDL_SetLogPriority.DESC;
	}

	public static MethodHandle SDL_SetLogPriority$handle() {
		return SDL_SetLogPriority.HANDLE;
	}

	public static MemorySegment SDL_SetLogPriority$address() {
		return SDL_SetLogPriority.ADDR;
	}

	public static void SDL_SetLogPriority(int category, int priority) {
		var mh$ = SDL_SetLogPriority.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetLogPriority", category, priority);
			}
			mh$.invokeExact(category, priority);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetLogPriority {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetLogPriority");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetLogPriority$descriptor() {
		return SDL_GetLogPriority.DESC;
	}

	public static MethodHandle SDL_GetLogPriority$handle() {
		return SDL_GetLogPriority.HANDLE;
	}

	public static MemorySegment SDL_GetLogPriority$address() {
		return SDL_GetLogPriority.ADDR;
	}

	public static int SDL_GetLogPriority(int category) {
		var mh$ = SDL_GetLogPriority.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetLogPriority", category);
			}
			return (int) mh$.invokeExact(category);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ResetLogPriorities {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid();

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ResetLogPriorities");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ResetLogPriorities$descriptor() {
		return SDL_ResetLogPriorities.DESC;
	}

	public static MethodHandle SDL_ResetLogPriorities$handle() {
		return SDL_ResetLogPriorities.HANDLE;
	}

	public static MemorySegment SDL_ResetLogPriorities$address() {
		return SDL_ResetLogPriorities.ADDR;
	}

	public static void SDL_ResetLogPriorities() {
		var mh$ = SDL_ResetLogPriorities.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ResetLogPriorities");
			}
			mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetLogPriorityPrefix {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetLogPriorityPrefix");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetLogPriorityPrefix$descriptor() {
		return SDL_SetLogPriorityPrefix.DESC;
	}

	public static MethodHandle SDL_SetLogPriorityPrefix$handle() {
		return SDL_SetLogPriorityPrefix.HANDLE;
	}

	public static MemorySegment SDL_SetLogPriorityPrefix$address() {
		return SDL_SetLogPriorityPrefix.ADDR;
	}

	public static boolean SDL_SetLogPriorityPrefix(int priority, MemorySegment prefix) {
		var mh$ = SDL_SetLogPriorityPrefix.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetLogPriorityPrefix", priority, prefix);
			}
			return (boolean) mh$.invokeExact(priority, prefix);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}


	private static class SDL_LogMessageV {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_LogMessageV");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_LogMessageV$descriptor() {
		return SDL_LogMessageV.DESC;
	}

	public static MethodHandle SDL_LogMessageV$handle() {
		return SDL_LogMessageV.HANDLE;
	}

	public static MemorySegment SDL_LogMessageV$address() {
		return SDL_LogMessageV.ADDR;
	}

	public static void SDL_LogMessageV(int category, int priority, MemorySegment fmt, MemorySegment ap) {
		var mh$ = SDL_LogMessageV.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_LogMessageV", category, priority, fmt, ap);
			}
			mh$.invokeExact(category, priority, fmt, ap);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetDefaultLogOutputFunction {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetDefaultLogOutputFunction");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetDefaultLogOutputFunction$descriptor() {
		return SDL_GetDefaultLogOutputFunction.DESC;
	}

	public static MethodHandle SDL_GetDefaultLogOutputFunction$handle() {
		return SDL_GetDefaultLogOutputFunction.HANDLE;
	}

	public static MemorySegment SDL_GetDefaultLogOutputFunction$address() {
		return SDL_GetDefaultLogOutputFunction.ADDR;
	}

	public static MemorySegment SDL_GetDefaultLogOutputFunction() {
		var mh$ = SDL_GetDefaultLogOutputFunction.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetDefaultLogOutputFunction");
			}
			return (MemorySegment) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetLogOutputFunction {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetLogOutputFunction");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetLogOutputFunction$descriptor() {
		return SDL_GetLogOutputFunction.DESC;
	}

	public static MethodHandle SDL_GetLogOutputFunction$handle() {
		return SDL_GetLogOutputFunction.HANDLE;
	}

	public static MemorySegment SDL_GetLogOutputFunction$address() {
		return SDL_GetLogOutputFunction.ADDR;
	}

	public static void SDL_GetLogOutputFunction(MemorySegment callback, MemorySegment userdata) {
		var mh$ = SDL_GetLogOutputFunction.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetLogOutputFunction", callback, userdata);
			}
			mh$.invokeExact(callback, userdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetLogOutputFunction {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetLogOutputFunction");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetLogOutputFunction$descriptor() {
		return SDL_SetLogOutputFunction.DESC;
	}

	public static MethodHandle SDL_SetLogOutputFunction$handle() {
		return SDL_SetLogOutputFunction.HANDLE;
	}

	public static MemorySegment SDL_SetLogOutputFunction$address() {
		return SDL_SetLogOutputFunction.ADDR;
	}

	public static void SDL_SetLogOutputFunction(MemorySegment callback, MemorySegment userdata) {
		var mh$ = SDL_SetLogOutputFunction.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetLogOutputFunction", callback, userdata);
			}
			mh$.invokeExact(callback, userdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	public static OfInt SDL_MessageBoxFlags = SDL3.C_INT;

	public static OfInt SDL_MessageBoxButtonFlags = SDL3.C_INT;
	private static final int SDL_MESSAGEBOX_COLOR_BACKGROUND = (int) 0L;

	public static int SDL_MESSAGEBOX_COLOR_BACKGROUND() {
		return SDL_MESSAGEBOX_COLOR_BACKGROUND;
	}

	private static final int SDL_MESSAGEBOX_COLOR_TEXT = (int) 1L;

	public static int SDL_MESSAGEBOX_COLOR_TEXT() {
		return SDL_MESSAGEBOX_COLOR_TEXT;
	}

	private static final int SDL_MESSAGEBOX_COLOR_BUTTON_BORDER = (int) 2L;

	public static int SDL_MESSAGEBOX_COLOR_BUTTON_BORDER() {
		return SDL_MESSAGEBOX_COLOR_BUTTON_BORDER;
	}

	private static final int SDL_MESSAGEBOX_COLOR_BUTTON_BACKGROUND = (int) 3L;

	public static int SDL_MESSAGEBOX_COLOR_BUTTON_BACKGROUND() {
		return SDL_MESSAGEBOX_COLOR_BUTTON_BACKGROUND;
	}

	private static final int SDL_MESSAGEBOX_COLOR_BUTTON_SELECTED = (int) 4L;

	public static int SDL_MESSAGEBOX_COLOR_BUTTON_SELECTED() {
		return SDL_MESSAGEBOX_COLOR_BUTTON_SELECTED;
	}

	private static final int SDL_MESSAGEBOX_COLOR_COUNT = (int) 5L;

	public static int SDL_MESSAGEBOX_COLOR_COUNT() {
		return SDL_MESSAGEBOX_COLOR_COUNT;
	}

	private static class SDL_ShowMessageBox {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ShowMessageBox");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ShowMessageBox$descriptor() {
		return SDL_ShowMessageBox.DESC;
	}

	public static MethodHandle SDL_ShowMessageBox$handle() {
		return SDL_ShowMessageBox.HANDLE;
	}

	public static MemorySegment SDL_ShowMessageBox$address() {
		return SDL_ShowMessageBox.ADDR;
	}

	public static boolean SDL_ShowMessageBox(MemorySegment messageboxdata, MemorySegment buttonid) {
		var mh$ = SDL_ShowMessageBox.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ShowMessageBox", messageboxdata, buttonid);
			}
			return (boolean) mh$.invokeExact(messageboxdata, buttonid);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ShowSimpleMessageBox {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ShowSimpleMessageBox");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ShowSimpleMessageBox$descriptor() {
		return SDL_ShowSimpleMessageBox.DESC;
	}

	public static MethodHandle SDL_ShowSimpleMessageBox$handle() {
		return SDL_ShowSimpleMessageBox.HANDLE;
	}

	public static MemorySegment SDL_ShowSimpleMessageBox$address() {
		return SDL_ShowSimpleMessageBox.ADDR;
	}

	public static boolean SDL_ShowSimpleMessageBox(int flags, MemorySegment title, MemorySegment message, MemorySegment window) {
		var mh$ = SDL_ShowSimpleMessageBox.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ShowSimpleMessageBox", flags, title, message, window);
			}
			return (boolean) mh$.invokeExact(flags, title, message, window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	public static AddressLayout SDL_MetalView = SDL3.C_POINTER;

	private static class SDL_Metal_CreateView {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_Metal_CreateView");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_Metal_CreateView$descriptor() {
		return SDL_Metal_CreateView.DESC;
	}

	public static MethodHandle SDL_Metal_CreateView$handle() {
		return SDL_Metal_CreateView.HANDLE;
	}

	public static MemorySegment SDL_Metal_CreateView$address() {
		return SDL_Metal_CreateView.ADDR;
	}

	public static MemorySegment SDL_Metal_CreateView(MemorySegment window) {
		var mh$ = SDL_Metal_CreateView.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_Metal_CreateView", window);
			}
			return (MemorySegment) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_Metal_DestroyView {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_Metal_DestroyView");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_Metal_DestroyView$descriptor() {
		return SDL_Metal_DestroyView.DESC;
	}

	public static MethodHandle SDL_Metal_DestroyView$handle() {
		return SDL_Metal_DestroyView.HANDLE;
	}

	public static MemorySegment SDL_Metal_DestroyView$address() {
		return SDL_Metal_DestroyView.ADDR;
	}

	public static void SDL_Metal_DestroyView(MemorySegment view) {
		var mh$ = SDL_Metal_DestroyView.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_Metal_DestroyView", view);
			}
			mh$.invokeExact(view);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_Metal_GetLayer {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_Metal_GetLayer");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_Metal_GetLayer$descriptor() {
		return SDL_Metal_GetLayer.DESC;
	}

	public static MethodHandle SDL_Metal_GetLayer$handle() {
		return SDL_Metal_GetLayer.HANDLE;
	}

	public static MemorySegment SDL_Metal_GetLayer$address() {
		return SDL_Metal_GetLayer.ADDR;
	}

	public static MemorySegment SDL_Metal_GetLayer(MemorySegment view) {
		var mh$ = SDL_Metal_GetLayer.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_Metal_GetLayer", view);
			}
			return (MemorySegment) mh$.invokeExact(view);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_OpenURL {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_OpenURL");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_OpenURL$descriptor() {
		return SDL_OpenURL.DESC;
	}

	public static MethodHandle SDL_OpenURL$handle() {
		return SDL_OpenURL.HANDLE;
	}

	public static MemorySegment SDL_OpenURL$address() {
		return SDL_OpenURL.ADDR;
	}

	public static boolean SDL_OpenURL(MemorySegment url) {
		var mh$ = SDL_OpenURL.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_OpenURL", url);
			}
			return (boolean) mh$.invokeExact(url);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetPlatform {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetPlatform");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetPlatform$descriptor() {
		return SDL_GetPlatform.DESC;
	}

	public static MethodHandle SDL_GetPlatform$handle() {
		return SDL_GetPlatform.HANDLE;
	}

	public static MemorySegment SDL_GetPlatform$address() {
		return SDL_GetPlatform.ADDR;
	}

	public static MemorySegment SDL_GetPlatform() {
		var mh$ = SDL_GetPlatform.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetPlatform");
			}
			return (MemorySegment) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateProcess {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateProcess");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateProcess$descriptor() {
		return SDL_CreateProcess.DESC;
	}

	public static MethodHandle SDL_CreateProcess$handle() {
		return SDL_CreateProcess.HANDLE;
	}

	public static MemorySegment SDL_CreateProcess$address() {
		return SDL_CreateProcess.ADDR;
	}

	public static MemorySegment SDL_CreateProcess(MemorySegment args, boolean pipe_stdio) {
		var mh$ = SDL_CreateProcess.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateProcess", args, pipe_stdio);
			}
			return (MemorySegment) mh$.invokeExact(args, pipe_stdio);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static final int SDL_PROCESS_STDIO_INHERITED = (int) 0L;

	public static int SDL_PROCESS_STDIO_INHERITED() {
		return SDL_PROCESS_STDIO_INHERITED;
	}

	private static final int SDL_PROCESS_STDIO_NULL = (int) 1L;

	public static int SDL_PROCESS_STDIO_NULL() {
		return SDL_PROCESS_STDIO_NULL;
	}

	private static final int SDL_PROCESS_STDIO_APP = (int) 2L;

	public static int SDL_PROCESS_STDIO_APP() {
		return SDL_PROCESS_STDIO_APP;
	}

	private static final int SDL_PROCESS_STDIO_REDIRECT = (int) 3L;

	public static int SDL_PROCESS_STDIO_REDIRECT() {
		return SDL_PROCESS_STDIO_REDIRECT;
	}

	private static class SDL_CreateProcessWithProperties {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateProcessWithProperties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateProcessWithProperties$descriptor() {
		return SDL_CreateProcessWithProperties.DESC;
	}

	public static MethodHandle SDL_CreateProcessWithProperties$handle() {
		return SDL_CreateProcessWithProperties.HANDLE;
	}

	public static MemorySegment SDL_CreateProcessWithProperties$address() {
		return SDL_CreateProcessWithProperties.ADDR;
	}

	public static MemorySegment SDL_CreateProcessWithProperties(int props) {
		var mh$ = SDL_CreateProcessWithProperties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateProcessWithProperties", props);
			}
			return (MemorySegment) mh$.invokeExact(props);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetProcessProperties {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetProcessProperties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetProcessProperties$descriptor() {
		return SDL_GetProcessProperties.DESC;
	}

	public static MethodHandle SDL_GetProcessProperties$handle() {
		return SDL_GetProcessProperties.HANDLE;
	}

	public static MemorySegment SDL_GetProcessProperties$address() {
		return SDL_GetProcessProperties.ADDR;
	}

	public static int SDL_GetProcessProperties(MemorySegment process) {
		var mh$ = SDL_GetProcessProperties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetProcessProperties", process);
			}
			return (int) mh$.invokeExact(process);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ReadProcess {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ReadProcess");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ReadProcess$descriptor() {
		return SDL_ReadProcess.DESC;
	}

	public static MethodHandle SDL_ReadProcess$handle() {
		return SDL_ReadProcess.HANDLE;
	}

	public static MemorySegment SDL_ReadProcess$address() {
		return SDL_ReadProcess.ADDR;
	}

	public static MemorySegment SDL_ReadProcess(MemorySegment process, MemorySegment datasize, MemorySegment exitcode) {
		var mh$ = SDL_ReadProcess.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ReadProcess", process, datasize, exitcode);
			}
			return (MemorySegment) mh$.invokeExact(process, datasize, exitcode);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetProcessInput {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetProcessInput");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetProcessInput$descriptor() {
		return SDL_GetProcessInput.DESC;
	}

	public static MethodHandle SDL_GetProcessInput$handle() {
		return SDL_GetProcessInput.HANDLE;
	}

	public static MemorySegment SDL_GetProcessInput$address() {
		return SDL_GetProcessInput.ADDR;
	}

	public static MemorySegment SDL_GetProcessInput(MemorySegment process) {
		var mh$ = SDL_GetProcessInput.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetProcessInput", process);
			}
			return (MemorySegment) mh$.invokeExact(process);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetProcessOutput {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetProcessOutput");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetProcessOutput$descriptor() {
		return SDL_GetProcessOutput.DESC;
	}

	public static MethodHandle SDL_GetProcessOutput$handle() {
		return SDL_GetProcessOutput.HANDLE;
	}

	public static MemorySegment SDL_GetProcessOutput$address() {
		return SDL_GetProcessOutput.ADDR;
	}

	public static MemorySegment SDL_GetProcessOutput(MemorySegment process) {
		var mh$ = SDL_GetProcessOutput.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetProcessOutput", process);
			}
			return (MemorySegment) mh$.invokeExact(process);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_KillProcess {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_KillProcess");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_KillProcess$descriptor() {
		return SDL_KillProcess.DESC;
	}

	public static MethodHandle SDL_KillProcess$handle() {
		return SDL_KillProcess.HANDLE;
	}

	public static MemorySegment SDL_KillProcess$address() {
		return SDL_KillProcess.ADDR;
	}

	public static boolean SDL_KillProcess(MemorySegment process, boolean force) {
		var mh$ = SDL_KillProcess.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_KillProcess", process, force);
			}
			return (boolean) mh$.invokeExact(process, force);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WaitProcess {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WaitProcess");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WaitProcess$descriptor() {
		return SDL_WaitProcess.DESC;
	}

	public static MethodHandle SDL_WaitProcess$handle() {
		return SDL_WaitProcess.HANDLE;
	}

	public static MemorySegment SDL_WaitProcess$address() {
		return SDL_WaitProcess.ADDR;
	}

	public static boolean SDL_WaitProcess(MemorySegment process, boolean block, MemorySegment exitcode) {
		var mh$ = SDL_WaitProcess.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WaitProcess", process, block, exitcode);
			}
			return (boolean) mh$.invokeExact(process, block, exitcode);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DestroyProcess {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DestroyProcess");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DestroyProcess$descriptor() {
		return SDL_DestroyProcess.DESC;
	}

	public static MethodHandle SDL_DestroyProcess$handle() {
		return SDL_DestroyProcess.HANDLE;
	}

	public static MemorySegment SDL_DestroyProcess$address() {
		return SDL_DestroyProcess.ADDR;
	}

	public static void SDL_DestroyProcess(MemorySegment process) {
		var mh$ = SDL_DestroyProcess.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DestroyProcess", process);
			}
			mh$.invokeExact(process);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static final int SDL_TEXTUREACCESS_STATIC = (int) 0L;

	public static int SDL_TEXTUREACCESS_STATIC() {
		return SDL_TEXTUREACCESS_STATIC;
	}

	private static final int SDL_TEXTUREACCESS_STREAMING = (int) 1L;

	public static int SDL_TEXTUREACCESS_STREAMING() {
		return SDL_TEXTUREACCESS_STREAMING;
	}

	private static final int SDL_TEXTUREACCESS_TARGET = (int) 2L;

	public static int SDL_TEXTUREACCESS_TARGET() {
		return SDL_TEXTUREACCESS_TARGET;
	}

	private static final int SDL_TEXTURE_ADDRESS_INVALID = (int) -1L;

	public static int SDL_TEXTURE_ADDRESS_INVALID() {
		return SDL_TEXTURE_ADDRESS_INVALID;
	}

	private static final int SDL_TEXTURE_ADDRESS_AUTO = (int) 0L;

	public static int SDL_TEXTURE_ADDRESS_AUTO() {
		return SDL_TEXTURE_ADDRESS_AUTO;
	}

	private static final int SDL_TEXTURE_ADDRESS_CLAMP = (int) 1L;

	public static int SDL_TEXTURE_ADDRESS_CLAMP() {
		return SDL_TEXTURE_ADDRESS_CLAMP;
	}

	private static final int SDL_TEXTURE_ADDRESS_WRAP = (int) 2L;

	public static int SDL_TEXTURE_ADDRESS_WRAP() {
		return SDL_TEXTURE_ADDRESS_WRAP;
	}

	private static final int SDL_LOGICAL_PRESENTATION_DISABLED = (int) 0L;

	public static int SDL_LOGICAL_PRESENTATION_DISABLED() {
		return SDL_LOGICAL_PRESENTATION_DISABLED;
	}

	private static final int SDL_LOGICAL_PRESENTATION_STRETCH = (int) 1L;

	public static int SDL_LOGICAL_PRESENTATION_STRETCH() {
		return SDL_LOGICAL_PRESENTATION_STRETCH;
	}

	private static final int SDL_LOGICAL_PRESENTATION_LETTERBOX = (int) 2L;

	public static int SDL_LOGICAL_PRESENTATION_LETTERBOX() {
		return SDL_LOGICAL_PRESENTATION_LETTERBOX;
	}

	private static final int SDL_LOGICAL_PRESENTATION_OVERSCAN = (int) 3L;

	public static int SDL_LOGICAL_PRESENTATION_OVERSCAN() {
		return SDL_LOGICAL_PRESENTATION_OVERSCAN;
	}

	private static final int SDL_LOGICAL_PRESENTATION_INTEGER_SCALE = (int) 4L;

	public static int SDL_LOGICAL_PRESENTATION_INTEGER_SCALE() {
		return SDL_LOGICAL_PRESENTATION_INTEGER_SCALE;
	}

	private static class SDL_GetNumRenderDrivers {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetNumRenderDrivers");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetNumRenderDrivers$descriptor() {
		return SDL_GetNumRenderDrivers.DESC;
	}

	public static MethodHandle SDL_GetNumRenderDrivers$handle() {
		return SDL_GetNumRenderDrivers.HANDLE;
	}

	public static MemorySegment SDL_GetNumRenderDrivers$address() {
		return SDL_GetNumRenderDrivers.ADDR;
	}

	public static int SDL_GetNumRenderDrivers() {
		var mh$ = SDL_GetNumRenderDrivers.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetNumRenderDrivers");
			}
			return (int) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRenderDriver {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRenderDriver");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRenderDriver$descriptor() {
		return SDL_GetRenderDriver.DESC;
	}

	public static MethodHandle SDL_GetRenderDriver$handle() {
		return SDL_GetRenderDriver.HANDLE;
	}

	public static MemorySegment SDL_GetRenderDriver$address() {
		return SDL_GetRenderDriver.ADDR;
	}

	public static MemorySegment SDL_GetRenderDriver(int index) {
		var mh$ = SDL_GetRenderDriver.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRenderDriver", index);
			}
			return (MemorySegment) mh$.invokeExact(index);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateWindowAndRenderer {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_LONG,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateWindowAndRenderer");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateWindowAndRenderer$descriptor() {
		return SDL_CreateWindowAndRenderer.DESC;
	}

	public static MethodHandle SDL_CreateWindowAndRenderer$handle() {
		return SDL_CreateWindowAndRenderer.HANDLE;
	}

	public static MemorySegment SDL_CreateWindowAndRenderer$address() {
		return SDL_CreateWindowAndRenderer.ADDR;
	}

	public static boolean SDL_CreateWindowAndRenderer(MemorySegment title, int width, int height, long window_flags, MemorySegment window, MemorySegment renderer) {
		var mh$ = SDL_CreateWindowAndRenderer.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateWindowAndRenderer", title, width, height, window_flags, window, renderer);
			}
			return (boolean) mh$.invokeExact(title, width, height, window_flags, window, renderer);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateRenderer {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateRenderer");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateRenderer$descriptor() {
		return SDL_CreateRenderer.DESC;
	}

	public static MethodHandle SDL_CreateRenderer$handle() {
		return SDL_CreateRenderer.HANDLE;
	}

	public static MemorySegment SDL_CreateRenderer$address() {
		return SDL_CreateRenderer.ADDR;
	}

	public static MemorySegment SDL_CreateRenderer(MemorySegment window, MemorySegment name) {
		var mh$ = SDL_CreateRenderer.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateRenderer", window, name);
			}
			return (MemorySegment) mh$.invokeExact(window, name);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateRendererWithProperties {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateRendererWithProperties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateRendererWithProperties$descriptor() {
		return SDL_CreateRendererWithProperties.DESC;
	}

	public static MethodHandle SDL_CreateRendererWithProperties$handle() {
		return SDL_CreateRendererWithProperties.HANDLE;
	}

	public static MemorySegment SDL_CreateRendererWithProperties$address() {
		return SDL_CreateRendererWithProperties.ADDR;
	}

	public static MemorySegment SDL_CreateRendererWithProperties(int props) {
		var mh$ = SDL_CreateRendererWithProperties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateRendererWithProperties", props);
			}
			return (MemorySegment) mh$.invokeExact(props);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateGPURenderer {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateGPURenderer");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateGPURenderer$descriptor() {
		return SDL_CreateGPURenderer.DESC;
	}

	public static MethodHandle SDL_CreateGPURenderer$handle() {
		return SDL_CreateGPURenderer.HANDLE;
	}

	public static MemorySegment SDL_CreateGPURenderer$address() {
		return SDL_CreateGPURenderer.ADDR;
	}

	public static MemorySegment SDL_CreateGPURenderer(MemorySegment device, MemorySegment window) {
		var mh$ = SDL_CreateGPURenderer.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateGPURenderer", device, window);
			}
			return (MemorySegment) mh$.invokeExact(device, window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGPURendererDevice {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGPURendererDevice");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGPURendererDevice$descriptor() {
		return SDL_GetGPURendererDevice.DESC;
	}

	public static MethodHandle SDL_GetGPURendererDevice$handle() {
		return SDL_GetGPURendererDevice.HANDLE;
	}

	public static MemorySegment SDL_GetGPURendererDevice$address() {
		return SDL_GetGPURendererDevice.ADDR;
	}

	public static MemorySegment SDL_GetGPURendererDevice(MemorySegment renderer) {
		var mh$ = SDL_GetGPURendererDevice.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGPURendererDevice", renderer);
			}
			return (MemorySegment) mh$.invokeExact(renderer);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateSoftwareRenderer {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateSoftwareRenderer");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateSoftwareRenderer$descriptor() {
		return SDL_CreateSoftwareRenderer.DESC;
	}

	public static MethodHandle SDL_CreateSoftwareRenderer$handle() {
		return SDL_CreateSoftwareRenderer.HANDLE;
	}

	public static MemorySegment SDL_CreateSoftwareRenderer$address() {
		return SDL_CreateSoftwareRenderer.ADDR;
	}

	public static MemorySegment SDL_CreateSoftwareRenderer(MemorySegment surface) {
		var mh$ = SDL_CreateSoftwareRenderer.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateSoftwareRenderer", surface);
			}
			return (MemorySegment) mh$.invokeExact(surface);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRenderer {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRenderer");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRenderer$descriptor() {
		return SDL_GetRenderer.DESC;
	}

	public static MethodHandle SDL_GetRenderer$handle() {
		return SDL_GetRenderer.HANDLE;
	}

	public static MemorySegment SDL_GetRenderer$address() {
		return SDL_GetRenderer.ADDR;
	}

	public static MemorySegment SDL_GetRenderer(MemorySegment window) {
		var mh$ = SDL_GetRenderer.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRenderer", window);
			}
			return (MemorySegment) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRenderWindow {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRenderWindow");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRenderWindow$descriptor() {
		return SDL_GetRenderWindow.DESC;
	}

	public static MethodHandle SDL_GetRenderWindow$handle() {
		return SDL_GetRenderWindow.HANDLE;
	}

	public static MemorySegment SDL_GetRenderWindow$address() {
		return SDL_GetRenderWindow.ADDR;
	}

	public static MemorySegment SDL_GetRenderWindow(MemorySegment renderer) {
		var mh$ = SDL_GetRenderWindow.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRenderWindow", renderer);
			}
			return (MemorySegment) mh$.invokeExact(renderer);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRendererName {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRendererName");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRendererName$descriptor() {
		return SDL_GetRendererName.DESC;
	}

	public static MethodHandle SDL_GetRendererName$handle() {
		return SDL_GetRendererName.HANDLE;
	}

	public static MemorySegment SDL_GetRendererName$address() {
		return SDL_GetRendererName.ADDR;
	}

	public static MemorySegment SDL_GetRendererName(MemorySegment renderer) {
		var mh$ = SDL_GetRendererName.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRendererName", renderer);
			}
			return (MemorySegment) mh$.invokeExact(renderer);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRendererProperties {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRendererProperties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRendererProperties$descriptor() {
		return SDL_GetRendererProperties.DESC;
	}

	public static MethodHandle SDL_GetRendererProperties$handle() {
		return SDL_GetRendererProperties.HANDLE;
	}

	public static MemorySegment SDL_GetRendererProperties$address() {
		return SDL_GetRendererProperties.ADDR;
	}

	public static int SDL_GetRendererProperties(MemorySegment renderer) {
		var mh$ = SDL_GetRendererProperties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRendererProperties", renderer);
			}
			return (int) mh$.invokeExact(renderer);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRenderOutputSize {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRenderOutputSize");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRenderOutputSize$descriptor() {
		return SDL_GetRenderOutputSize.DESC;
	}

	public static MethodHandle SDL_GetRenderOutputSize$handle() {
		return SDL_GetRenderOutputSize.HANDLE;
	}

	public static MemorySegment SDL_GetRenderOutputSize$address() {
		return SDL_GetRenderOutputSize.ADDR;
	}

	public static boolean SDL_GetRenderOutputSize(MemorySegment renderer, MemorySegment w, MemorySegment h) {
		var mh$ = SDL_GetRenderOutputSize.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRenderOutputSize", renderer, w, h);
			}
			return (boolean) mh$.invokeExact(renderer, w, h);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetCurrentRenderOutputSize {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetCurrentRenderOutputSize");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetCurrentRenderOutputSize$descriptor() {
		return SDL_GetCurrentRenderOutputSize.DESC;
	}

	public static MethodHandle SDL_GetCurrentRenderOutputSize$handle() {
		return SDL_GetCurrentRenderOutputSize.HANDLE;
	}

	public static MemorySegment SDL_GetCurrentRenderOutputSize$address() {
		return SDL_GetCurrentRenderOutputSize.ADDR;
	}

	public static boolean SDL_GetCurrentRenderOutputSize(MemorySegment renderer, MemorySegment w, MemorySegment h) {
		var mh$ = SDL_GetCurrentRenderOutputSize.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetCurrentRenderOutputSize", renderer, w, h);
			}
			return (boolean) mh$.invokeExact(renderer, w, h);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateTexture {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateTexture");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateTexture$descriptor() {
		return SDL_CreateTexture.DESC;
	}

	public static MethodHandle SDL_CreateTexture$handle() {
		return SDL_CreateTexture.HANDLE;
	}

	public static MemorySegment SDL_CreateTexture$address() {
		return SDL_CreateTexture.ADDR;
	}

	public static MemorySegment SDL_CreateTexture(MemorySegment renderer, int format, int access, int w, int h) {
		var mh$ = SDL_CreateTexture.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateTexture", renderer, format, access, w, h);
			}
			return (MemorySegment) mh$.invokeExact(renderer, format, access, w, h);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateTextureFromSurface {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateTextureFromSurface");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateTextureFromSurface$descriptor() {
		return SDL_CreateTextureFromSurface.DESC;
	}

	public static MethodHandle SDL_CreateTextureFromSurface$handle() {
		return SDL_CreateTextureFromSurface.HANDLE;
	}

	public static MemorySegment SDL_CreateTextureFromSurface$address() {
		return SDL_CreateTextureFromSurface.ADDR;
	}

	public static MemorySegment SDL_CreateTextureFromSurface(MemorySegment renderer, MemorySegment surface) {
		var mh$ = SDL_CreateTextureFromSurface.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateTextureFromSurface", renderer, surface);
			}
			return (MemorySegment) mh$.invokeExact(renderer, surface);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateTextureWithProperties {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateTextureWithProperties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateTextureWithProperties$descriptor() {
		return SDL_CreateTextureWithProperties.DESC;
	}

	public static MethodHandle SDL_CreateTextureWithProperties$handle() {
		return SDL_CreateTextureWithProperties.HANDLE;
	}

	public static MemorySegment SDL_CreateTextureWithProperties$address() {
		return SDL_CreateTextureWithProperties.ADDR;
	}

	public static MemorySegment SDL_CreateTextureWithProperties(MemorySegment renderer, int props) {
		var mh$ = SDL_CreateTextureWithProperties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateTextureWithProperties", renderer, props);
			}
			return (MemorySegment) mh$.invokeExact(renderer, props);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetTextureProperties {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetTextureProperties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetTextureProperties$descriptor() {
		return SDL_GetTextureProperties.DESC;
	}

	public static MethodHandle SDL_GetTextureProperties$handle() {
		return SDL_GetTextureProperties.HANDLE;
	}

	public static MemorySegment SDL_GetTextureProperties$address() {
		return SDL_GetTextureProperties.ADDR;
	}

	public static int SDL_GetTextureProperties(MemorySegment texture) {
		var mh$ = SDL_GetTextureProperties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetTextureProperties", texture);
			}
			return (int) mh$.invokeExact(texture);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRendererFromTexture {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRendererFromTexture");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRendererFromTexture$descriptor() {
		return SDL_GetRendererFromTexture.DESC;
	}

	public static MethodHandle SDL_GetRendererFromTexture$handle() {
		return SDL_GetRendererFromTexture.HANDLE;
	}

	public static MemorySegment SDL_GetRendererFromTexture$address() {
		return SDL_GetRendererFromTexture.ADDR;
	}

	public static MemorySegment SDL_GetRendererFromTexture(MemorySegment texture) {
		var mh$ = SDL_GetRendererFromTexture.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRendererFromTexture", texture);
			}
			return (MemorySegment) mh$.invokeExact(texture);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetTextureSize {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetTextureSize");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetTextureSize$descriptor() {
		return SDL_GetTextureSize.DESC;
	}

	public static MethodHandle SDL_GetTextureSize$handle() {
		return SDL_GetTextureSize.HANDLE;
	}

	public static MemorySegment SDL_GetTextureSize$address() {
		return SDL_GetTextureSize.ADDR;
	}

	public static boolean SDL_GetTextureSize(MemorySegment texture, MemorySegment w, MemorySegment h) {
		var mh$ = SDL_GetTextureSize.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetTextureSize", texture, w, h);
			}
			return (boolean) mh$.invokeExact(texture, w, h);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetTexturePalette {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetTexturePalette");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetTexturePalette$descriptor() {
		return SDL_SetTexturePalette.DESC;
	}

	public static MethodHandle SDL_SetTexturePalette$handle() {
		return SDL_SetTexturePalette.HANDLE;
	}

	public static MemorySegment SDL_SetTexturePalette$address() {
		return SDL_SetTexturePalette.ADDR;
	}

	public static boolean SDL_SetTexturePalette(MemorySegment texture, MemorySegment palette) {
		var mh$ = SDL_SetTexturePalette.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetTexturePalette", texture, palette);
			}
			return (boolean) mh$.invokeExact(texture, palette);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetTexturePalette {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetTexturePalette");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetTexturePalette$descriptor() {
		return SDL_GetTexturePalette.DESC;
	}

	public static MethodHandle SDL_GetTexturePalette$handle() {
		return SDL_GetTexturePalette.HANDLE;
	}

	public static MemorySegment SDL_GetTexturePalette$address() {
		return SDL_GetTexturePalette.ADDR;
	}

	public static MemorySegment SDL_GetTexturePalette(MemorySegment texture) {
		var mh$ = SDL_GetTexturePalette.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetTexturePalette", texture);
			}
			return (MemorySegment) mh$.invokeExact(texture);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetTextureColorMod {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_CHAR,
				SDL3.C_CHAR,
				SDL3.C_CHAR
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetTextureColorMod");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetTextureColorMod$descriptor() {
		return SDL_SetTextureColorMod.DESC;
	}

	public static MethodHandle SDL_SetTextureColorMod$handle() {
		return SDL_SetTextureColorMod.HANDLE;
	}

	public static MemorySegment SDL_SetTextureColorMod$address() {
		return SDL_SetTextureColorMod.ADDR;
	}

	public static boolean SDL_SetTextureColorMod(MemorySegment texture, byte r, byte g, byte b) {
		var mh$ = SDL_SetTextureColorMod.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetTextureColorMod", texture, r, g, b);
			}
			return (boolean) mh$.invokeExact(texture, r, g, b);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetTextureColorModFloat {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetTextureColorModFloat");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetTextureColorModFloat$descriptor() {
		return SDL_SetTextureColorModFloat.DESC;
	}

	public static MethodHandle SDL_SetTextureColorModFloat$handle() {
		return SDL_SetTextureColorModFloat.HANDLE;
	}

	public static MemorySegment SDL_SetTextureColorModFloat$address() {
		return SDL_SetTextureColorModFloat.ADDR;
	}

	public static boolean SDL_SetTextureColorModFloat(MemorySegment texture, float r, float g, float b) {
		var mh$ = SDL_SetTextureColorModFloat.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetTextureColorModFloat", texture, r, g, b);
			}
			return (boolean) mh$.invokeExact(texture, r, g, b);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetTextureColorMod {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetTextureColorMod");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetTextureColorMod$descriptor() {
		return SDL_GetTextureColorMod.DESC;
	}

	public static MethodHandle SDL_GetTextureColorMod$handle() {
		return SDL_GetTextureColorMod.HANDLE;
	}

	public static MemorySegment SDL_GetTextureColorMod$address() {
		return SDL_GetTextureColorMod.ADDR;
	}

	public static boolean SDL_GetTextureColorMod(MemorySegment texture, MemorySegment r, MemorySegment g, MemorySegment b) {
		var mh$ = SDL_GetTextureColorMod.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetTextureColorMod", texture, r, g, b);
			}
			return (boolean) mh$.invokeExact(texture, r, g, b);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetTextureColorModFloat {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetTextureColorModFloat");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetTextureColorModFloat$descriptor() {
		return SDL_GetTextureColorModFloat.DESC;
	}

	public static MethodHandle SDL_GetTextureColorModFloat$handle() {
		return SDL_GetTextureColorModFloat.HANDLE;
	}

	public static MemorySegment SDL_GetTextureColorModFloat$address() {
		return SDL_GetTextureColorModFloat.ADDR;
	}

	public static boolean SDL_GetTextureColorModFloat(MemorySegment texture, MemorySegment r, MemorySegment g, MemorySegment b) {
		var mh$ = SDL_GetTextureColorModFloat.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetTextureColorModFloat", texture, r, g, b);
			}
			return (boolean) mh$.invokeExact(texture, r, g, b);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetTextureAlphaMod {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_CHAR
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetTextureAlphaMod");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetTextureAlphaMod$descriptor() {
		return SDL_SetTextureAlphaMod.DESC;
	}

	public static MethodHandle SDL_SetTextureAlphaMod$handle() {
		return SDL_SetTextureAlphaMod.HANDLE;
	}

	public static MemorySegment SDL_SetTextureAlphaMod$address() {
		return SDL_SetTextureAlphaMod.ADDR;
	}

	public static boolean SDL_SetTextureAlphaMod(MemorySegment texture, byte alpha) {
		var mh$ = SDL_SetTextureAlphaMod.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetTextureAlphaMod", texture, alpha);
			}
			return (boolean) mh$.invokeExact(texture, alpha);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetTextureAlphaModFloat {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetTextureAlphaModFloat");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetTextureAlphaModFloat$descriptor() {
		return SDL_SetTextureAlphaModFloat.DESC;
	}

	public static MethodHandle SDL_SetTextureAlphaModFloat$handle() {
		return SDL_SetTextureAlphaModFloat.HANDLE;
	}

	public static MemorySegment SDL_SetTextureAlphaModFloat$address() {
		return SDL_SetTextureAlphaModFloat.ADDR;
	}

	public static boolean SDL_SetTextureAlphaModFloat(MemorySegment texture, float alpha) {
		var mh$ = SDL_SetTextureAlphaModFloat.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetTextureAlphaModFloat", texture, alpha);
			}
			return (boolean) mh$.invokeExact(texture, alpha);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetTextureAlphaMod {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetTextureAlphaMod");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetTextureAlphaMod$descriptor() {
		return SDL_GetTextureAlphaMod.DESC;
	}

	public static MethodHandle SDL_GetTextureAlphaMod$handle() {
		return SDL_GetTextureAlphaMod.HANDLE;
	}

	public static MemorySegment SDL_GetTextureAlphaMod$address() {
		return SDL_GetTextureAlphaMod.ADDR;
	}

	public static boolean SDL_GetTextureAlphaMod(MemorySegment texture, MemorySegment alpha) {
		var mh$ = SDL_GetTextureAlphaMod.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetTextureAlphaMod", texture, alpha);
			}
			return (boolean) mh$.invokeExact(texture, alpha);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetTextureAlphaModFloat {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetTextureAlphaModFloat");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetTextureAlphaModFloat$descriptor() {
		return SDL_GetTextureAlphaModFloat.DESC;
	}

	public static MethodHandle SDL_GetTextureAlphaModFloat$handle() {
		return SDL_GetTextureAlphaModFloat.HANDLE;
	}

	public static MemorySegment SDL_GetTextureAlphaModFloat$address() {
		return SDL_GetTextureAlphaModFloat.ADDR;
	}

	public static boolean SDL_GetTextureAlphaModFloat(MemorySegment texture, MemorySegment alpha) {
		var mh$ = SDL_GetTextureAlphaModFloat.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetTextureAlphaModFloat", texture, alpha);
			}
			return (boolean) mh$.invokeExact(texture, alpha);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetTextureBlendMode {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetTextureBlendMode");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetTextureBlendMode$descriptor() {
		return SDL_SetTextureBlendMode.DESC;
	}

	public static MethodHandle SDL_SetTextureBlendMode$handle() {
		return SDL_SetTextureBlendMode.HANDLE;
	}

	public static MemorySegment SDL_SetTextureBlendMode$address() {
		return SDL_SetTextureBlendMode.ADDR;
	}

	public static boolean SDL_SetTextureBlendMode(MemorySegment texture, int blendMode) {
		var mh$ = SDL_SetTextureBlendMode.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetTextureBlendMode", texture, blendMode);
			}
			return (boolean) mh$.invokeExact(texture, blendMode);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetTextureBlendMode {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetTextureBlendMode");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetTextureBlendMode$descriptor() {
		return SDL_GetTextureBlendMode.DESC;
	}

	public static MethodHandle SDL_GetTextureBlendMode$handle() {
		return SDL_GetTextureBlendMode.HANDLE;
	}

	public static MemorySegment SDL_GetTextureBlendMode$address() {
		return SDL_GetTextureBlendMode.ADDR;
	}

	public static boolean SDL_GetTextureBlendMode(MemorySegment texture, MemorySegment blendMode) {
		var mh$ = SDL_GetTextureBlendMode.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetTextureBlendMode", texture, blendMode);
			}
			return (boolean) mh$.invokeExact(texture, blendMode);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetTextureScaleMode {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetTextureScaleMode");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetTextureScaleMode$descriptor() {
		return SDL_SetTextureScaleMode.DESC;
	}

	public static MethodHandle SDL_SetTextureScaleMode$handle() {
		return SDL_SetTextureScaleMode.HANDLE;
	}

	public static MemorySegment SDL_SetTextureScaleMode$address() {
		return SDL_SetTextureScaleMode.ADDR;
	}

	public static boolean SDL_SetTextureScaleMode(MemorySegment texture, int scaleMode) {
		var mh$ = SDL_SetTextureScaleMode.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetTextureScaleMode", texture, scaleMode);
			}
			return (boolean) mh$.invokeExact(texture, scaleMode);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetTextureScaleMode {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetTextureScaleMode");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetTextureScaleMode$descriptor() {
		return SDL_GetTextureScaleMode.DESC;
	}

	public static MethodHandle SDL_GetTextureScaleMode$handle() {
		return SDL_GetTextureScaleMode.HANDLE;
	}

	public static MemorySegment SDL_GetTextureScaleMode$address() {
		return SDL_GetTextureScaleMode.ADDR;
	}

	public static boolean SDL_GetTextureScaleMode(MemorySegment texture, MemorySegment scaleMode) {
		var mh$ = SDL_GetTextureScaleMode.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetTextureScaleMode", texture, scaleMode);
			}
			return (boolean) mh$.invokeExact(texture, scaleMode);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_UpdateTexture {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_UpdateTexture");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_UpdateTexture$descriptor() {
		return SDL_UpdateTexture.DESC;
	}

	public static MethodHandle SDL_UpdateTexture$handle() {
		return SDL_UpdateTexture.HANDLE;
	}

	public static MemorySegment SDL_UpdateTexture$address() {
		return SDL_UpdateTexture.ADDR;
	}

	public static boolean SDL_UpdateTexture(MemorySegment texture, MemorySegment rect, MemorySegment pixels, int pitch) {
		var mh$ = SDL_UpdateTexture.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_UpdateTexture", texture, rect, pixels, pitch);
			}
			return (boolean) mh$.invokeExact(texture, rect, pixels, pitch);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_UpdateYUVTexture {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_UpdateYUVTexture");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_UpdateYUVTexture$descriptor() {
		return SDL_UpdateYUVTexture.DESC;
	}

	public static MethodHandle SDL_UpdateYUVTexture$handle() {
		return SDL_UpdateYUVTexture.HANDLE;
	}

	public static MemorySegment SDL_UpdateYUVTexture$address() {
		return SDL_UpdateYUVTexture.ADDR;
	}

	public static boolean SDL_UpdateYUVTexture(MemorySegment texture, MemorySegment rect, MemorySegment Yplane, int Ypitch, MemorySegment Uplane, int Upitch, MemorySegment Vplane, int Vpitch) {
		var mh$ = SDL_UpdateYUVTexture.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_UpdateYUVTexture", texture, rect, Yplane, Ypitch, Uplane, Upitch, Vplane, Vpitch);
			}
			return (boolean) mh$.invokeExact(texture, rect, Yplane, Ypitch, Uplane, Upitch, Vplane, Vpitch);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_UpdateNVTexture {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_UpdateNVTexture");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_UpdateNVTexture$descriptor() {
		return SDL_UpdateNVTexture.DESC;
	}

	public static MethodHandle SDL_UpdateNVTexture$handle() {
		return SDL_UpdateNVTexture.HANDLE;
	}

	public static MemorySegment SDL_UpdateNVTexture$address() {
		return SDL_UpdateNVTexture.ADDR;
	}

	public static boolean SDL_UpdateNVTexture(MemorySegment texture, MemorySegment rect, MemorySegment Yplane, int Ypitch, MemorySegment UVplane, int UVpitch) {
		var mh$ = SDL_UpdateNVTexture.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_UpdateNVTexture", texture, rect, Yplane, Ypitch, UVplane, UVpitch);
			}
			return (boolean) mh$.invokeExact(texture, rect, Yplane, Ypitch, UVplane, UVpitch);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_LockTexture {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_LockTexture");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_LockTexture$descriptor() {
		return SDL_LockTexture.DESC;
	}

	public static MethodHandle SDL_LockTexture$handle() {
		return SDL_LockTexture.HANDLE;
	}

	public static MemorySegment SDL_LockTexture$address() {
		return SDL_LockTexture.ADDR;
	}

	public static boolean SDL_LockTexture(MemorySegment texture, MemorySegment rect, MemorySegment pixels, MemorySegment pitch) {
		var mh$ = SDL_LockTexture.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_LockTexture", texture, rect, pixels, pitch);
			}
			return (boolean) mh$.invokeExact(texture, rect, pixels, pitch);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_LockTextureToSurface {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_LockTextureToSurface");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_LockTextureToSurface$descriptor() {
		return SDL_LockTextureToSurface.DESC;
	}

	public static MethodHandle SDL_LockTextureToSurface$handle() {
		return SDL_LockTextureToSurface.HANDLE;
	}

	public static MemorySegment SDL_LockTextureToSurface$address() {
		return SDL_LockTextureToSurface.ADDR;
	}

	public static boolean SDL_LockTextureToSurface(MemorySegment texture, MemorySegment rect, MemorySegment surface) {
		var mh$ = SDL_LockTextureToSurface.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_LockTextureToSurface", texture, rect, surface);
			}
			return (boolean) mh$.invokeExact(texture, rect, surface);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_UnlockTexture {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_UnlockTexture");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_UnlockTexture$descriptor() {
		return SDL_UnlockTexture.DESC;
	}

	public static MethodHandle SDL_UnlockTexture$handle() {
		return SDL_UnlockTexture.HANDLE;
	}

	public static MemorySegment SDL_UnlockTexture$address() {
		return SDL_UnlockTexture.ADDR;
	}

	public static void SDL_UnlockTexture(MemorySegment texture) {
		var mh$ = SDL_UnlockTexture.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_UnlockTexture", texture);
			}
			mh$.invokeExact(texture);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetRenderTarget {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetRenderTarget");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetRenderTarget$descriptor() {
		return SDL_SetRenderTarget.DESC;
	}

	public static MethodHandle SDL_SetRenderTarget$handle() {
		return SDL_SetRenderTarget.HANDLE;
	}

	public static MemorySegment SDL_SetRenderTarget$address() {
		return SDL_SetRenderTarget.ADDR;
	}

	public static boolean SDL_SetRenderTarget(MemorySegment renderer, MemorySegment texture) {
		var mh$ = SDL_SetRenderTarget.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetRenderTarget", renderer, texture);
			}
			return (boolean) mh$.invokeExact(renderer, texture);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRenderTarget {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRenderTarget");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRenderTarget$descriptor() {
		return SDL_GetRenderTarget.DESC;
	}

	public static MethodHandle SDL_GetRenderTarget$handle() {
		return SDL_GetRenderTarget.HANDLE;
	}

	public static MemorySegment SDL_GetRenderTarget$address() {
		return SDL_GetRenderTarget.ADDR;
	}

	public static MemorySegment SDL_GetRenderTarget(MemorySegment renderer) {
		var mh$ = SDL_GetRenderTarget.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRenderTarget", renderer);
			}
			return (MemorySegment) mh$.invokeExact(renderer);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetRenderLogicalPresentation {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetRenderLogicalPresentation");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetRenderLogicalPresentation$descriptor() {
		return SDL_SetRenderLogicalPresentation.DESC;
	}

	public static MethodHandle SDL_SetRenderLogicalPresentation$handle() {
		return SDL_SetRenderLogicalPresentation.HANDLE;
	}

	public static MemorySegment SDL_SetRenderLogicalPresentation$address() {
		return SDL_SetRenderLogicalPresentation.ADDR;
	}

	public static boolean SDL_SetRenderLogicalPresentation(MemorySegment renderer, int w, int h, int mode) {
		var mh$ = SDL_SetRenderLogicalPresentation.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetRenderLogicalPresentation", renderer, w, h, mode);
			}
			return (boolean) mh$.invokeExact(renderer, w, h, mode);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRenderLogicalPresentation {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRenderLogicalPresentation");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRenderLogicalPresentation$descriptor() {
		return SDL_GetRenderLogicalPresentation.DESC;
	}

	public static MethodHandle SDL_GetRenderLogicalPresentation$handle() {
		return SDL_GetRenderLogicalPresentation.HANDLE;
	}

	public static MemorySegment SDL_GetRenderLogicalPresentation$address() {
		return SDL_GetRenderLogicalPresentation.ADDR;
	}

	public static boolean SDL_GetRenderLogicalPresentation(MemorySegment renderer, MemorySegment w, MemorySegment h, MemorySegment mode) {
		var mh$ = SDL_GetRenderLogicalPresentation.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRenderLogicalPresentation", renderer, w, h, mode);
			}
			return (boolean) mh$.invokeExact(renderer, w, h, mode);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRenderLogicalPresentationRect {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRenderLogicalPresentationRect");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRenderLogicalPresentationRect$descriptor() {
		return SDL_GetRenderLogicalPresentationRect.DESC;
	}

	public static MethodHandle SDL_GetRenderLogicalPresentationRect$handle() {
		return SDL_GetRenderLogicalPresentationRect.HANDLE;
	}

	public static MemorySegment SDL_GetRenderLogicalPresentationRect$address() {
		return SDL_GetRenderLogicalPresentationRect.ADDR;
	}

	public static boolean SDL_GetRenderLogicalPresentationRect(MemorySegment renderer, MemorySegment rect) {
		var mh$ = SDL_GetRenderLogicalPresentationRect.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRenderLogicalPresentationRect", renderer, rect);
			}
			return (boolean) mh$.invokeExact(renderer, rect);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RenderCoordinatesFromWindow {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RenderCoordinatesFromWindow");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RenderCoordinatesFromWindow$descriptor() {
		return SDL_RenderCoordinatesFromWindow.DESC;
	}

	public static MethodHandle SDL_RenderCoordinatesFromWindow$handle() {
		return SDL_RenderCoordinatesFromWindow.HANDLE;
	}

	public static MemorySegment SDL_RenderCoordinatesFromWindow$address() {
		return SDL_RenderCoordinatesFromWindow.ADDR;
	}

	public static boolean SDL_RenderCoordinatesFromWindow(MemorySegment renderer, float window_x, float window_y, MemorySegment x, MemorySegment y) {
		var mh$ = SDL_RenderCoordinatesFromWindow.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RenderCoordinatesFromWindow", renderer, window_x, window_y, x, y);
			}
			return (boolean) mh$.invokeExact(renderer, window_x, window_y, x, y);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RenderCoordinatesToWindow {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RenderCoordinatesToWindow");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RenderCoordinatesToWindow$descriptor() {
		return SDL_RenderCoordinatesToWindow.DESC;
	}

	public static MethodHandle SDL_RenderCoordinatesToWindow$handle() {
		return SDL_RenderCoordinatesToWindow.HANDLE;
	}

	public static MemorySegment SDL_RenderCoordinatesToWindow$address() {
		return SDL_RenderCoordinatesToWindow.ADDR;
	}

	public static boolean SDL_RenderCoordinatesToWindow(MemorySegment renderer, float x, float y, MemorySegment window_x, MemorySegment window_y) {
		var mh$ = SDL_RenderCoordinatesToWindow.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RenderCoordinatesToWindow", renderer, x, y, window_x, window_y);
			}
			return (boolean) mh$.invokeExact(renderer, x, y, window_x, window_y);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ConvertEventToRenderCoordinates {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ConvertEventToRenderCoordinates");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ConvertEventToRenderCoordinates$descriptor() {
		return SDL_ConvertEventToRenderCoordinates.DESC;
	}

	public static MethodHandle SDL_ConvertEventToRenderCoordinates$handle() {
		return SDL_ConvertEventToRenderCoordinates.HANDLE;
	}

	public static MemorySegment SDL_ConvertEventToRenderCoordinates$address() {
		return SDL_ConvertEventToRenderCoordinates.ADDR;
	}

	public static boolean SDL_ConvertEventToRenderCoordinates(MemorySegment renderer, MemorySegment event) {
		var mh$ = SDL_ConvertEventToRenderCoordinates.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ConvertEventToRenderCoordinates", renderer, event);
			}
			return (boolean) mh$.invokeExact(renderer, event);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetRenderViewport {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetRenderViewport");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetRenderViewport$descriptor() {
		return SDL_SetRenderViewport.DESC;
	}

	public static MethodHandle SDL_SetRenderViewport$handle() {
		return SDL_SetRenderViewport.HANDLE;
	}

	public static MemorySegment SDL_SetRenderViewport$address() {
		return SDL_SetRenderViewport.ADDR;
	}

	public static boolean SDL_SetRenderViewport(MemorySegment renderer, MemorySegment rect) {
		var mh$ = SDL_SetRenderViewport.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetRenderViewport", renderer, rect);
			}
			return (boolean) mh$.invokeExact(renderer, rect);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRenderViewport {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRenderViewport");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRenderViewport$descriptor() {
		return SDL_GetRenderViewport.DESC;
	}

	public static MethodHandle SDL_GetRenderViewport$handle() {
		return SDL_GetRenderViewport.HANDLE;
	}

	public static MemorySegment SDL_GetRenderViewport$address() {
		return SDL_GetRenderViewport.ADDR;
	}

	public static boolean SDL_GetRenderViewport(MemorySegment renderer, MemorySegment rect) {
		var mh$ = SDL_GetRenderViewport.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRenderViewport", renderer, rect);
			}
			return (boolean) mh$.invokeExact(renderer, rect);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RenderViewportSet {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RenderViewportSet");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RenderViewportSet$descriptor() {
		return SDL_RenderViewportSet.DESC;
	}

	public static MethodHandle SDL_RenderViewportSet$handle() {
		return SDL_RenderViewportSet.HANDLE;
	}

	public static MemorySegment SDL_RenderViewportSet$address() {
		return SDL_RenderViewportSet.ADDR;
	}

	public static boolean SDL_RenderViewportSet(MemorySegment renderer) {
		var mh$ = SDL_RenderViewportSet.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RenderViewportSet", renderer);
			}
			return (boolean) mh$.invokeExact(renderer);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRenderSafeArea {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRenderSafeArea");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRenderSafeArea$descriptor() {
		return SDL_GetRenderSafeArea.DESC;
	}

	public static MethodHandle SDL_GetRenderSafeArea$handle() {
		return SDL_GetRenderSafeArea.HANDLE;
	}

	public static MemorySegment SDL_GetRenderSafeArea$address() {
		return SDL_GetRenderSafeArea.ADDR;
	}

	public static boolean SDL_GetRenderSafeArea(MemorySegment renderer, MemorySegment rect) {
		var mh$ = SDL_GetRenderSafeArea.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRenderSafeArea", renderer, rect);
			}
			return (boolean) mh$.invokeExact(renderer, rect);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetRenderClipRect {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetRenderClipRect");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetRenderClipRect$descriptor() {
		return SDL_SetRenderClipRect.DESC;
	}

	public static MethodHandle SDL_SetRenderClipRect$handle() {
		return SDL_SetRenderClipRect.HANDLE;
	}

	public static MemorySegment SDL_SetRenderClipRect$address() {
		return SDL_SetRenderClipRect.ADDR;
	}

	public static boolean SDL_SetRenderClipRect(MemorySegment renderer, MemorySegment rect) {
		var mh$ = SDL_SetRenderClipRect.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetRenderClipRect", renderer, rect);
			}
			return (boolean) mh$.invokeExact(renderer, rect);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRenderClipRect {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRenderClipRect");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRenderClipRect$descriptor() {
		return SDL_GetRenderClipRect.DESC;
	}

	public static MethodHandle SDL_GetRenderClipRect$handle() {
		return SDL_GetRenderClipRect.HANDLE;
	}

	public static MemorySegment SDL_GetRenderClipRect$address() {
		return SDL_GetRenderClipRect.ADDR;
	}

	public static boolean SDL_GetRenderClipRect(MemorySegment renderer, MemorySegment rect) {
		var mh$ = SDL_GetRenderClipRect.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRenderClipRect", renderer, rect);
			}
			return (boolean) mh$.invokeExact(renderer, rect);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RenderClipEnabled {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RenderClipEnabled");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RenderClipEnabled$descriptor() {
		return SDL_RenderClipEnabled.DESC;
	}

	public static MethodHandle SDL_RenderClipEnabled$handle() {
		return SDL_RenderClipEnabled.HANDLE;
	}

	public static MemorySegment SDL_RenderClipEnabled$address() {
		return SDL_RenderClipEnabled.ADDR;
	}

	public static boolean SDL_RenderClipEnabled(MemorySegment renderer) {
		var mh$ = SDL_RenderClipEnabled.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RenderClipEnabled", renderer);
			}
			return (boolean) mh$.invokeExact(renderer);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetRenderScale {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetRenderScale");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetRenderScale$descriptor() {
		return SDL_SetRenderScale.DESC;
	}

	public static MethodHandle SDL_SetRenderScale$handle() {
		return SDL_SetRenderScale.HANDLE;
	}

	public static MemorySegment SDL_SetRenderScale$address() {
		return SDL_SetRenderScale.ADDR;
	}

	public static boolean SDL_SetRenderScale(MemorySegment renderer, float scaleX, float scaleY) {
		var mh$ = SDL_SetRenderScale.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetRenderScale", renderer, scaleX, scaleY);
			}
			return (boolean) mh$.invokeExact(renderer, scaleX, scaleY);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRenderScale {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRenderScale");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRenderScale$descriptor() {
		return SDL_GetRenderScale.DESC;
	}

	public static MethodHandle SDL_GetRenderScale$handle() {
		return SDL_GetRenderScale.HANDLE;
	}

	public static MemorySegment SDL_GetRenderScale$address() {
		return SDL_GetRenderScale.ADDR;
	}

	public static boolean SDL_GetRenderScale(MemorySegment renderer, MemorySegment scaleX, MemorySegment scaleY) {
		var mh$ = SDL_GetRenderScale.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRenderScale", renderer, scaleX, scaleY);
			}
			return (boolean) mh$.invokeExact(renderer, scaleX, scaleY);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetRenderDrawColor {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_CHAR,
				SDL3.C_CHAR,
				SDL3.C_CHAR,
				SDL3.C_CHAR
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetRenderDrawColor");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetRenderDrawColor$descriptor() {
		return SDL_SetRenderDrawColor.DESC;
	}

	public static MethodHandle SDL_SetRenderDrawColor$handle() {
		return SDL_SetRenderDrawColor.HANDLE;
	}

	public static MemorySegment SDL_SetRenderDrawColor$address() {
		return SDL_SetRenderDrawColor.ADDR;
	}

	public static boolean SDL_SetRenderDrawColor(MemorySegment renderer, byte r, byte g, byte b, byte a) {
		var mh$ = SDL_SetRenderDrawColor.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetRenderDrawColor", renderer, r, g, b, a);
			}
			return (boolean) mh$.invokeExact(renderer, r, g, b, a);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetRenderDrawColorFloat {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetRenderDrawColorFloat");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetRenderDrawColorFloat$descriptor() {
		return SDL_SetRenderDrawColorFloat.DESC;
	}

	public static MethodHandle SDL_SetRenderDrawColorFloat$handle() {
		return SDL_SetRenderDrawColorFloat.HANDLE;
	}

	public static MemorySegment SDL_SetRenderDrawColorFloat$address() {
		return SDL_SetRenderDrawColorFloat.ADDR;
	}

	public static boolean SDL_SetRenderDrawColorFloat(MemorySegment renderer, float r, float g, float b, float a) {
		var mh$ = SDL_SetRenderDrawColorFloat.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetRenderDrawColorFloat", renderer, r, g, b, a);
			}
			return (boolean) mh$.invokeExact(renderer, r, g, b, a);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRenderDrawColor {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRenderDrawColor");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRenderDrawColor$descriptor() {
		return SDL_GetRenderDrawColor.DESC;
	}

	public static MethodHandle SDL_GetRenderDrawColor$handle() {
		return SDL_GetRenderDrawColor.HANDLE;
	}

	public static MemorySegment SDL_GetRenderDrawColor$address() {
		return SDL_GetRenderDrawColor.ADDR;
	}

	public static boolean SDL_GetRenderDrawColor(MemorySegment renderer, MemorySegment r, MemorySegment g, MemorySegment b, MemorySegment a) {
		var mh$ = SDL_GetRenderDrawColor.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRenderDrawColor", renderer, r, g, b, a);
			}
			return (boolean) mh$.invokeExact(renderer, r, g, b, a);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRenderDrawColorFloat {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRenderDrawColorFloat");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRenderDrawColorFloat$descriptor() {
		return SDL_GetRenderDrawColorFloat.DESC;
	}

	public static MethodHandle SDL_GetRenderDrawColorFloat$handle() {
		return SDL_GetRenderDrawColorFloat.HANDLE;
	}

	public static MemorySegment SDL_GetRenderDrawColorFloat$address() {
		return SDL_GetRenderDrawColorFloat.ADDR;
	}

	public static boolean SDL_GetRenderDrawColorFloat(MemorySegment renderer, MemorySegment r, MemorySegment g, MemorySegment b, MemorySegment a) {
		var mh$ = SDL_GetRenderDrawColorFloat.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRenderDrawColorFloat", renderer, r, g, b, a);
			}
			return (boolean) mh$.invokeExact(renderer, r, g, b, a);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetRenderColorScale {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetRenderColorScale");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetRenderColorScale$descriptor() {
		return SDL_SetRenderColorScale.DESC;
	}

	public static MethodHandle SDL_SetRenderColorScale$handle() {
		return SDL_SetRenderColorScale.HANDLE;
	}

	public static MemorySegment SDL_SetRenderColorScale$address() {
		return SDL_SetRenderColorScale.ADDR;
	}

	public static boolean SDL_SetRenderColorScale(MemorySegment renderer, float scale) {
		var mh$ = SDL_SetRenderColorScale.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetRenderColorScale", renderer, scale);
			}
			return (boolean) mh$.invokeExact(renderer, scale);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRenderColorScale {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRenderColorScale");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRenderColorScale$descriptor() {
		return SDL_GetRenderColorScale.DESC;
	}

	public static MethodHandle SDL_GetRenderColorScale$handle() {
		return SDL_GetRenderColorScale.HANDLE;
	}

	public static MemorySegment SDL_GetRenderColorScale$address() {
		return SDL_GetRenderColorScale.ADDR;
	}

	public static boolean SDL_GetRenderColorScale(MemorySegment renderer, MemorySegment scale) {
		var mh$ = SDL_GetRenderColorScale.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRenderColorScale", renderer, scale);
			}
			return (boolean) mh$.invokeExact(renderer, scale);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetRenderDrawBlendMode {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetRenderDrawBlendMode");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetRenderDrawBlendMode$descriptor() {
		return SDL_SetRenderDrawBlendMode.DESC;
	}

	public static MethodHandle SDL_SetRenderDrawBlendMode$handle() {
		return SDL_SetRenderDrawBlendMode.HANDLE;
	}

	public static MemorySegment SDL_SetRenderDrawBlendMode$address() {
		return SDL_SetRenderDrawBlendMode.ADDR;
	}

	public static boolean SDL_SetRenderDrawBlendMode(MemorySegment renderer, int blendMode) {
		var mh$ = SDL_SetRenderDrawBlendMode.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetRenderDrawBlendMode", renderer, blendMode);
			}
			return (boolean) mh$.invokeExact(renderer, blendMode);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRenderDrawBlendMode {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRenderDrawBlendMode");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRenderDrawBlendMode$descriptor() {
		return SDL_GetRenderDrawBlendMode.DESC;
	}

	public static MethodHandle SDL_GetRenderDrawBlendMode$handle() {
		return SDL_GetRenderDrawBlendMode.HANDLE;
	}

	public static MemorySegment SDL_GetRenderDrawBlendMode$address() {
		return SDL_GetRenderDrawBlendMode.ADDR;
	}

	public static boolean SDL_GetRenderDrawBlendMode(MemorySegment renderer, MemorySegment blendMode) {
		var mh$ = SDL_GetRenderDrawBlendMode.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRenderDrawBlendMode", renderer, blendMode);
			}
			return (boolean) mh$.invokeExact(renderer, blendMode);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RenderClear {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RenderClear");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RenderClear$descriptor() {
		return SDL_RenderClear.DESC;
	}

	public static MethodHandle SDL_RenderClear$handle() {
		return SDL_RenderClear.HANDLE;
	}

	public static MemorySegment SDL_RenderClear$address() {
		return SDL_RenderClear.ADDR;
	}

	public static boolean SDL_RenderClear(MemorySegment renderer) {
		var mh$ = SDL_RenderClear.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RenderClear", renderer);
			}
			return (boolean) mh$.invokeExact(renderer);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RenderPoint {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RenderPoint");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RenderPoint$descriptor() {
		return SDL_RenderPoint.DESC;
	}

	public static MethodHandle SDL_RenderPoint$handle() {
		return SDL_RenderPoint.HANDLE;
	}

	public static MemorySegment SDL_RenderPoint$address() {
		return SDL_RenderPoint.ADDR;
	}

	public static boolean SDL_RenderPoint(MemorySegment renderer, float x, float y) {
		var mh$ = SDL_RenderPoint.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RenderPoint", renderer, x, y);
			}
			return (boolean) mh$.invokeExact(renderer, x, y);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RenderPoints {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RenderPoints");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RenderPoints$descriptor() {
		return SDL_RenderPoints.DESC;
	}

	public static MethodHandle SDL_RenderPoints$handle() {
		return SDL_RenderPoints.HANDLE;
	}

	public static MemorySegment SDL_RenderPoints$address() {
		return SDL_RenderPoints.ADDR;
	}

	public static boolean SDL_RenderPoints(MemorySegment renderer, MemorySegment points, int count) {
		var mh$ = SDL_RenderPoints.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RenderPoints", renderer, points, count);
			}
			return (boolean) mh$.invokeExact(renderer, points, count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RenderLine {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RenderLine");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RenderLine$descriptor() {
		return SDL_RenderLine.DESC;
	}

	public static MethodHandle SDL_RenderLine$handle() {
		return SDL_RenderLine.HANDLE;
	}

	public static MemorySegment SDL_RenderLine$address() {
		return SDL_RenderLine.ADDR;
	}

	public static boolean SDL_RenderLine(MemorySegment renderer, float x1, float y1, float x2, float y2) {
		var mh$ = SDL_RenderLine.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RenderLine", renderer, x1, y1, x2, y2);
			}
			return (boolean) mh$.invokeExact(renderer, x1, y1, x2, y2);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RenderLines {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RenderLines");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RenderLines$descriptor() {
		return SDL_RenderLines.DESC;
	}

	public static MethodHandle SDL_RenderLines$handle() {
		return SDL_RenderLines.HANDLE;
	}

	public static MemorySegment SDL_RenderLines$address() {
		return SDL_RenderLines.ADDR;
	}

	public static boolean SDL_RenderLines(MemorySegment renderer, MemorySegment points, int count) {
		var mh$ = SDL_RenderLines.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RenderLines", renderer, points, count);
			}
			return (boolean) mh$.invokeExact(renderer, points, count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RenderRect {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RenderRect");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RenderRect$descriptor() {
		return SDL_RenderRect.DESC;
	}

	public static MethodHandle SDL_RenderRect$handle() {
		return SDL_RenderRect.HANDLE;
	}

	public static MemorySegment SDL_RenderRect$address() {
		return SDL_RenderRect.ADDR;
	}

	public static boolean SDL_RenderRect(MemorySegment renderer, MemorySegment rect) {
		var mh$ = SDL_RenderRect.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RenderRect", renderer, rect);
			}
			return (boolean) mh$.invokeExact(renderer, rect);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RenderRects {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RenderRects");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RenderRects$descriptor() {
		return SDL_RenderRects.DESC;
	}

	public static MethodHandle SDL_RenderRects$handle() {
		return SDL_RenderRects.HANDLE;
	}

	public static MemorySegment SDL_RenderRects$address() {
		return SDL_RenderRects.ADDR;
	}

	public static boolean SDL_RenderRects(MemorySegment renderer, MemorySegment rects, int count) {
		var mh$ = SDL_RenderRects.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RenderRects", renderer, rects, count);
			}
			return (boolean) mh$.invokeExact(renderer, rects, count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RenderFillRect {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RenderFillRect");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RenderFillRect$descriptor() {
		return SDL_RenderFillRect.DESC;
	}

	public static MethodHandle SDL_RenderFillRect$handle() {
		return SDL_RenderFillRect.HANDLE;
	}

	public static MemorySegment SDL_RenderFillRect$address() {
		return SDL_RenderFillRect.ADDR;
	}

	public static boolean SDL_RenderFillRect(MemorySegment renderer, MemorySegment rect) {
		var mh$ = SDL_RenderFillRect.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RenderFillRect", renderer, rect);
			}
			return (boolean) mh$.invokeExact(renderer, rect);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RenderFillRects {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RenderFillRects");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RenderFillRects$descriptor() {
		return SDL_RenderFillRects.DESC;
	}

	public static MethodHandle SDL_RenderFillRects$handle() {
		return SDL_RenderFillRects.HANDLE;
	}

	public static MemorySegment SDL_RenderFillRects$address() {
		return SDL_RenderFillRects.ADDR;
	}

	public static boolean SDL_RenderFillRects(MemorySegment renderer, MemorySegment rects, int count) {
		var mh$ = SDL_RenderFillRects.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RenderFillRects", renderer, rects, count);
			}
			return (boolean) mh$.invokeExact(renderer, rects, count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RenderTexture {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RenderTexture");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RenderTexture$descriptor() {
		return SDL_RenderTexture.DESC;
	}

	public static MethodHandle SDL_RenderTexture$handle() {
		return SDL_RenderTexture.HANDLE;
	}

	public static MemorySegment SDL_RenderTexture$address() {
		return SDL_RenderTexture.ADDR;
	}

	public static boolean SDL_RenderTexture(MemorySegment renderer, MemorySegment texture, MemorySegment srcrect, MemorySegment dstrect) {
		var mh$ = SDL_RenderTexture.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RenderTexture", renderer, texture, srcrect, dstrect);
			}
			return (boolean) mh$.invokeExact(renderer, texture, srcrect, dstrect);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RenderTextureRotated {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_DOUBLE,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RenderTextureRotated");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RenderTextureRotated$descriptor() {
		return SDL_RenderTextureRotated.DESC;
	}

	public static MethodHandle SDL_RenderTextureRotated$handle() {
		return SDL_RenderTextureRotated.HANDLE;
	}

	public static MemorySegment SDL_RenderTextureRotated$address() {
		return SDL_RenderTextureRotated.ADDR;
	}

	public static boolean SDL_RenderTextureRotated(MemorySegment renderer, MemorySegment texture, MemorySegment srcrect, MemorySegment dstrect, double angle, MemorySegment center, int flip) {
		var mh$ = SDL_RenderTextureRotated.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RenderTextureRotated", renderer, texture, srcrect, dstrect, angle, center, flip);
			}
			return (boolean) mh$.invokeExact(renderer, texture, srcrect, dstrect, angle, center, flip);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RenderTextureAffine {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RenderTextureAffine");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RenderTextureAffine$descriptor() {
		return SDL_RenderTextureAffine.DESC;
	}

	public static MethodHandle SDL_RenderTextureAffine$handle() {
		return SDL_RenderTextureAffine.HANDLE;
	}

	public static MemorySegment SDL_RenderTextureAffine$address() {
		return SDL_RenderTextureAffine.ADDR;
	}

	public static boolean SDL_RenderTextureAffine(MemorySegment renderer, MemorySegment texture, MemorySegment srcrect, MemorySegment origin, MemorySegment right, MemorySegment down) {
		var mh$ = SDL_RenderTextureAffine.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RenderTextureAffine", renderer, texture, srcrect, origin, right, down);
			}
			return (boolean) mh$.invokeExact(renderer, texture, srcrect, origin, right, down);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RenderTextureTiled {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_FLOAT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RenderTextureTiled");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RenderTextureTiled$descriptor() {
		return SDL_RenderTextureTiled.DESC;
	}

	public static MethodHandle SDL_RenderTextureTiled$handle() {
		return SDL_RenderTextureTiled.HANDLE;
	}

	public static MemorySegment SDL_RenderTextureTiled$address() {
		return SDL_RenderTextureTiled.ADDR;
	}

	public static boolean SDL_RenderTextureTiled(MemorySegment renderer, MemorySegment texture, MemorySegment srcrect, float scale, MemorySegment dstrect) {
		var mh$ = SDL_RenderTextureTiled.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RenderTextureTiled", renderer, texture, srcrect, scale, dstrect);
			}
			return (boolean) mh$.invokeExact(renderer, texture, srcrect, scale, dstrect);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RenderTexture9Grid {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RenderTexture9Grid");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RenderTexture9Grid$descriptor() {
		return SDL_RenderTexture9Grid.DESC;
	}

	public static MethodHandle SDL_RenderTexture9Grid$handle() {
		return SDL_RenderTexture9Grid.HANDLE;
	}

	public static MemorySegment SDL_RenderTexture9Grid$address() {
		return SDL_RenderTexture9Grid.ADDR;
	}

	public static boolean SDL_RenderTexture9Grid(MemorySegment renderer, MemorySegment texture, MemorySegment srcrect, float left_width, float right_width, float top_height, float bottom_height, float scale, MemorySegment dstrect) {
		var mh$ = SDL_RenderTexture9Grid.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RenderTexture9Grid", renderer, texture, srcrect, left_width, right_width, top_height, bottom_height, scale, dstrect);
			}
			return (boolean) mh$.invokeExact(renderer, texture, srcrect, left_width, right_width, top_height, bottom_height, scale, dstrect);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RenderTexture9GridTiled {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT,
				SDL3.C_POINTER,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RenderTexture9GridTiled");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RenderTexture9GridTiled$descriptor() {
		return SDL_RenderTexture9GridTiled.DESC;
	}

	public static MethodHandle SDL_RenderTexture9GridTiled$handle() {
		return SDL_RenderTexture9GridTiled.HANDLE;
	}

	public static MemorySegment SDL_RenderTexture9GridTiled$address() {
		return SDL_RenderTexture9GridTiled.ADDR;
	}

	public static boolean SDL_RenderTexture9GridTiled(MemorySegment renderer, MemorySegment texture, MemorySegment srcrect, float left_width, float right_width, float top_height, float bottom_height, float scale, MemorySegment dstrect, float tileScale) {
		var mh$ = SDL_RenderTexture9GridTiled.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RenderTexture9GridTiled", renderer, texture, srcrect, left_width, right_width, top_height, bottom_height, scale, dstrect, tileScale);
			}
			return (boolean) mh$.invokeExact(renderer, texture, srcrect, left_width, right_width, top_height, bottom_height, scale, dstrect, tileScale);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RenderGeometry {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RenderGeometry");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RenderGeometry$descriptor() {
		return SDL_RenderGeometry.DESC;
	}

	public static MethodHandle SDL_RenderGeometry$handle() {
		return SDL_RenderGeometry.HANDLE;
	}

	public static MemorySegment SDL_RenderGeometry$address() {
		return SDL_RenderGeometry.ADDR;
	}

	public static boolean SDL_RenderGeometry(MemorySegment renderer, MemorySegment texture, MemorySegment vertices, int num_vertices, MemorySegment indices, int num_indices) {
		var mh$ = SDL_RenderGeometry.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RenderGeometry", renderer, texture, vertices, num_vertices, indices, num_indices);
			}
			return (boolean) mh$.invokeExact(renderer, texture, vertices, num_vertices, indices, num_indices);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RenderGeometryRaw {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RenderGeometryRaw");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RenderGeometryRaw$descriptor() {
		return SDL_RenderGeometryRaw.DESC;
	}

	public static MethodHandle SDL_RenderGeometryRaw$handle() {
		return SDL_RenderGeometryRaw.HANDLE;
	}

	public static MemorySegment SDL_RenderGeometryRaw$address() {
		return SDL_RenderGeometryRaw.ADDR;
	}

	public static boolean SDL_RenderGeometryRaw(MemorySegment renderer, MemorySegment texture, MemorySegment xy, int xy_stride, MemorySegment color, int color_stride, MemorySegment uv, int uv_stride, int num_vertices, MemorySegment indices, int num_indices, int size_indices) {
		var mh$ = SDL_RenderGeometryRaw.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RenderGeometryRaw", renderer, texture, xy, xy_stride, color, color_stride, uv, uv_stride, num_vertices, indices, num_indices, size_indices);
			}
			return (boolean) mh$.invokeExact(renderer, texture, xy, xy_stride, color, color_stride, uv, uv_stride, num_vertices, indices, num_indices, size_indices);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetRenderTextureAddressMode {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetRenderTextureAddressMode");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetRenderTextureAddressMode$descriptor() {
		return SDL_SetRenderTextureAddressMode.DESC;
	}

	public static MethodHandle SDL_SetRenderTextureAddressMode$handle() {
		return SDL_SetRenderTextureAddressMode.HANDLE;
	}

	public static MemorySegment SDL_SetRenderTextureAddressMode$address() {
		return SDL_SetRenderTextureAddressMode.ADDR;
	}

	public static boolean SDL_SetRenderTextureAddressMode(MemorySegment renderer, int u_mode, int v_mode) {
		var mh$ = SDL_SetRenderTextureAddressMode.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetRenderTextureAddressMode", renderer, u_mode, v_mode);
			}
			return (boolean) mh$.invokeExact(renderer, u_mode, v_mode);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRenderTextureAddressMode {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRenderTextureAddressMode");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRenderTextureAddressMode$descriptor() {
		return SDL_GetRenderTextureAddressMode.DESC;
	}

	public static MethodHandle SDL_GetRenderTextureAddressMode$handle() {
		return SDL_GetRenderTextureAddressMode.HANDLE;
	}

	public static MemorySegment SDL_GetRenderTextureAddressMode$address() {
		return SDL_GetRenderTextureAddressMode.ADDR;
	}

	public static boolean SDL_GetRenderTextureAddressMode(MemorySegment renderer, MemorySegment u_mode, MemorySegment v_mode) {
		var mh$ = SDL_GetRenderTextureAddressMode.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRenderTextureAddressMode", renderer, u_mode, v_mode);
			}
			return (boolean) mh$.invokeExact(renderer, u_mode, v_mode);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RenderReadPixels {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RenderReadPixels");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RenderReadPixels$descriptor() {
		return SDL_RenderReadPixels.DESC;
	}

	public static MethodHandle SDL_RenderReadPixels$handle() {
		return SDL_RenderReadPixels.HANDLE;
	}

	public static MemorySegment SDL_RenderReadPixels$address() {
		return SDL_RenderReadPixels.ADDR;
	}

	public static MemorySegment SDL_RenderReadPixels(MemorySegment renderer, MemorySegment rect) {
		var mh$ = SDL_RenderReadPixels.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RenderReadPixels", renderer, rect);
			}
			return (MemorySegment) mh$.invokeExact(renderer, rect);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RenderPresent {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RenderPresent");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RenderPresent$descriptor() {
		return SDL_RenderPresent.DESC;
	}

	public static MethodHandle SDL_RenderPresent$handle() {
		return SDL_RenderPresent.HANDLE;
	}

	public static MemorySegment SDL_RenderPresent$address() {
		return SDL_RenderPresent.ADDR;
	}

	public static boolean SDL_RenderPresent(MemorySegment renderer) {
		var mh$ = SDL_RenderPresent.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RenderPresent", renderer);
			}
			return (boolean) mh$.invokeExact(renderer);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DestroyTexture {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DestroyTexture");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DestroyTexture$descriptor() {
		return SDL_DestroyTexture.DESC;
	}

	public static MethodHandle SDL_DestroyTexture$handle() {
		return SDL_DestroyTexture.HANDLE;
	}

	public static MemorySegment SDL_DestroyTexture$address() {
		return SDL_DestroyTexture.ADDR;
	}

	public static void SDL_DestroyTexture(MemorySegment texture) {
		var mh$ = SDL_DestroyTexture.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DestroyTexture", texture);
			}
			mh$.invokeExact(texture);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DestroyRenderer {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DestroyRenderer");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DestroyRenderer$descriptor() {
		return SDL_DestroyRenderer.DESC;
	}

	public static MethodHandle SDL_DestroyRenderer$handle() {
		return SDL_DestroyRenderer.HANDLE;
	}

	public static MemorySegment SDL_DestroyRenderer$address() {
		return SDL_DestroyRenderer.ADDR;
	}

	public static void SDL_DestroyRenderer(MemorySegment renderer) {
		var mh$ = SDL_DestroyRenderer.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DestroyRenderer", renderer);
			}
			mh$.invokeExact(renderer);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_FlushRenderer {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_FlushRenderer");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_FlushRenderer$descriptor() {
		return SDL_FlushRenderer.DESC;
	}

	public static MethodHandle SDL_FlushRenderer$handle() {
		return SDL_FlushRenderer.HANDLE;
	}

	public static MemorySegment SDL_FlushRenderer$address() {
		return SDL_FlushRenderer.ADDR;
	}

	public static boolean SDL_FlushRenderer(MemorySegment renderer) {
		var mh$ = SDL_FlushRenderer.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_FlushRenderer", renderer);
			}
			return (boolean) mh$.invokeExact(renderer);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRenderMetalLayer {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRenderMetalLayer");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRenderMetalLayer$descriptor() {
		return SDL_GetRenderMetalLayer.DESC;
	}

	public static MethodHandle SDL_GetRenderMetalLayer$handle() {
		return SDL_GetRenderMetalLayer.HANDLE;
	}

	public static MemorySegment SDL_GetRenderMetalLayer$address() {
		return SDL_GetRenderMetalLayer.ADDR;
	}

	public static MemorySegment SDL_GetRenderMetalLayer(MemorySegment renderer) {
		var mh$ = SDL_GetRenderMetalLayer.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRenderMetalLayer", renderer);
			}
			return (MemorySegment) mh$.invokeExact(renderer);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRenderMetalCommandEncoder {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRenderMetalCommandEncoder");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRenderMetalCommandEncoder$descriptor() {
		return SDL_GetRenderMetalCommandEncoder.DESC;
	}

	public static MethodHandle SDL_GetRenderMetalCommandEncoder$handle() {
		return SDL_GetRenderMetalCommandEncoder.HANDLE;
	}

	public static MemorySegment SDL_GetRenderMetalCommandEncoder$address() {
		return SDL_GetRenderMetalCommandEncoder.ADDR;
	}

	public static MemorySegment SDL_GetRenderMetalCommandEncoder(MemorySegment renderer) {
		var mh$ = SDL_GetRenderMetalCommandEncoder.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRenderMetalCommandEncoder", renderer);
			}
			return (MemorySegment) mh$.invokeExact(renderer);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_AddVulkanRenderSemaphores {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_LONG,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_AddVulkanRenderSemaphores");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_AddVulkanRenderSemaphores$descriptor() {
		return SDL_AddVulkanRenderSemaphores.DESC;
	}

	public static MethodHandle SDL_AddVulkanRenderSemaphores$handle() {
		return SDL_AddVulkanRenderSemaphores.HANDLE;
	}

	public static MemorySegment SDL_AddVulkanRenderSemaphores$address() {
		return SDL_AddVulkanRenderSemaphores.ADDR;
	}

	public static boolean SDL_AddVulkanRenderSemaphores(MemorySegment renderer, int wait_stage_mask, long wait_semaphore, long signal_semaphore) {
		var mh$ = SDL_AddVulkanRenderSemaphores.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_AddVulkanRenderSemaphores", renderer, wait_stage_mask, wait_semaphore, signal_semaphore);
			}
			return (boolean) mh$.invokeExact(renderer, wait_stage_mask, wait_semaphore, signal_semaphore);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetRenderVSync {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetRenderVSync");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetRenderVSync$descriptor() {
		return SDL_SetRenderVSync.DESC;
	}

	public static MethodHandle SDL_SetRenderVSync$handle() {
		return SDL_SetRenderVSync.HANDLE;
	}

	public static MemorySegment SDL_SetRenderVSync$address() {
		return SDL_SetRenderVSync.ADDR;
	}

	public static boolean SDL_SetRenderVSync(MemorySegment renderer, int vsync) {
		var mh$ = SDL_SetRenderVSync.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetRenderVSync", renderer, vsync);
			}
			return (boolean) mh$.invokeExact(renderer, vsync);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRenderVSync {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRenderVSync");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRenderVSync$descriptor() {
		return SDL_GetRenderVSync.DESC;
	}

	public static MethodHandle SDL_GetRenderVSync$handle() {
		return SDL_GetRenderVSync.HANDLE;
	}

	public static MemorySegment SDL_GetRenderVSync$address() {
		return SDL_GetRenderVSync.ADDR;
	}

	public static boolean SDL_GetRenderVSync(MemorySegment renderer, MemorySegment vsync) {
		var mh$ = SDL_GetRenderVSync.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRenderVSync", renderer, vsync);
			}
			return (boolean) mh$.invokeExact(renderer, vsync);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RenderDebugText {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RenderDebugText");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RenderDebugText$descriptor() {
		return SDL_RenderDebugText.DESC;
	}

	public static MethodHandle SDL_RenderDebugText$handle() {
		return SDL_RenderDebugText.HANDLE;
	}

	public static MemorySegment SDL_RenderDebugText$address() {
		return SDL_RenderDebugText.ADDR;
	}

	public static boolean SDL_RenderDebugText(MemorySegment renderer, float x, float y, MemorySegment str) {
		var mh$ = SDL_RenderDebugText.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RenderDebugText", renderer, x, y, str);
			}
			return (boolean) mh$.invokeExact(renderer, x, y, str);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}


	private static class SDL_SetDefaultTextureScaleMode {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetDefaultTextureScaleMode");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetDefaultTextureScaleMode$descriptor() {
		return SDL_SetDefaultTextureScaleMode.DESC;
	}

	public static MethodHandle SDL_SetDefaultTextureScaleMode$handle() {
		return SDL_SetDefaultTextureScaleMode.HANDLE;
	}

	public static MemorySegment SDL_SetDefaultTextureScaleMode$address() {
		return SDL_SetDefaultTextureScaleMode.ADDR;
	}

	public static boolean SDL_SetDefaultTextureScaleMode(MemorySegment renderer, int scale_mode) {
		var mh$ = SDL_SetDefaultTextureScaleMode.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetDefaultTextureScaleMode", renderer, scale_mode);
			}
			return (boolean) mh$.invokeExact(renderer, scale_mode);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetDefaultTextureScaleMode {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetDefaultTextureScaleMode");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetDefaultTextureScaleMode$descriptor() {
		return SDL_GetDefaultTextureScaleMode.DESC;
	}

	public static MethodHandle SDL_GetDefaultTextureScaleMode$handle() {
		return SDL_GetDefaultTextureScaleMode.HANDLE;
	}

	public static MemorySegment SDL_GetDefaultTextureScaleMode$address() {
		return SDL_GetDefaultTextureScaleMode.ADDR;
	}

	public static boolean SDL_GetDefaultTextureScaleMode(MemorySegment renderer, MemorySegment scale_mode) {
		var mh$ = SDL_GetDefaultTextureScaleMode.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetDefaultTextureScaleMode", renderer, scale_mode);
			}
			return (boolean) mh$.invokeExact(renderer, scale_mode);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateGPURenderState {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateGPURenderState");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateGPURenderState$descriptor() {
		return SDL_CreateGPURenderState.DESC;
	}

	public static MethodHandle SDL_CreateGPURenderState$handle() {
		return SDL_CreateGPURenderState.HANDLE;
	}

	public static MemorySegment SDL_CreateGPURenderState$address() {
		return SDL_CreateGPURenderState.ADDR;
	}

	public static MemorySegment SDL_CreateGPURenderState(MemorySegment renderer, MemorySegment createinfo) {
		var mh$ = SDL_CreateGPURenderState.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateGPURenderState", renderer, createinfo);
			}
			return (MemorySegment) mh$.invokeExact(renderer, createinfo);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetGPURenderStateFragmentUniforms {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetGPURenderStateFragmentUniforms");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetGPURenderStateFragmentUniforms$descriptor() {
		return SDL_SetGPURenderStateFragmentUniforms.DESC;
	}

	public static MethodHandle SDL_SetGPURenderStateFragmentUniforms$handle() {
		return SDL_SetGPURenderStateFragmentUniforms.HANDLE;
	}

	public static MemorySegment SDL_SetGPURenderStateFragmentUniforms$address() {
		return SDL_SetGPURenderStateFragmentUniforms.ADDR;
	}

	public static boolean SDL_SetGPURenderStateFragmentUniforms(MemorySegment state, int slot_index, MemorySegment data, int length) {
		var mh$ = SDL_SetGPURenderStateFragmentUniforms.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetGPURenderStateFragmentUniforms", state, slot_index, data, length);
			}
			return (boolean) mh$.invokeExact(state, slot_index, data, length);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetGPURenderState {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetGPURenderState");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetGPURenderState$descriptor() {
		return SDL_SetGPURenderState.DESC;
	}

	public static MethodHandle SDL_SetGPURenderState$handle() {
		return SDL_SetGPURenderState.HANDLE;
	}

	public static MemorySegment SDL_SetGPURenderState$address() {
		return SDL_SetGPURenderState.ADDR;
	}

	public static boolean SDL_SetGPURenderState(MemorySegment renderer, MemorySegment state) {
		var mh$ = SDL_SetGPURenderState.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetGPURenderState", renderer, state);
			}
			return (boolean) mh$.invokeExact(renderer, state);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DestroyGPURenderState {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DestroyGPURenderState");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DestroyGPURenderState$descriptor() {
		return SDL_DestroyGPURenderState.DESC;
	}

	public static MethodHandle SDL_DestroyGPURenderState$handle() {
		return SDL_DestroyGPURenderState.HANDLE;
	}

	public static MemorySegment SDL_DestroyGPURenderState$address() {
		return SDL_DestroyGPURenderState.ADDR;
	}

	public static void SDL_DestroyGPURenderState(MemorySegment state) {
		var mh$ = SDL_DestroyGPURenderState.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DestroyGPURenderState", state);
			}
			mh$.invokeExact(state);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_OpenTitleStorage {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_OpenTitleStorage");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_OpenTitleStorage$descriptor() {
		return SDL_OpenTitleStorage.DESC;
	}

	public static MethodHandle SDL_OpenTitleStorage$handle() {
		return SDL_OpenTitleStorage.HANDLE;
	}

	public static MemorySegment SDL_OpenTitleStorage$address() {
		return SDL_OpenTitleStorage.ADDR;
	}

	public static MemorySegment SDL_OpenTitleStorage(MemorySegment override, int props) {
		var mh$ = SDL_OpenTitleStorage.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_OpenTitleStorage", override, props);
			}
			return (MemorySegment) mh$.invokeExact(override, props);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_OpenUserStorage {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_OpenUserStorage");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_OpenUserStorage$descriptor() {
		return SDL_OpenUserStorage.DESC;
	}

	public static MethodHandle SDL_OpenUserStorage$handle() {
		return SDL_OpenUserStorage.HANDLE;
	}

	public static MemorySegment SDL_OpenUserStorage$address() {
		return SDL_OpenUserStorage.ADDR;
	}

	public static MemorySegment SDL_OpenUserStorage(MemorySegment org, MemorySegment app, int props) {
		var mh$ = SDL_OpenUserStorage.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_OpenUserStorage", org, app, props);
			}
			return (MemorySegment) mh$.invokeExact(org, app, props);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_OpenFileStorage {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_OpenFileStorage");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_OpenFileStorage$descriptor() {
		return SDL_OpenFileStorage.DESC;
	}

	public static MethodHandle SDL_OpenFileStorage$handle() {
		return SDL_OpenFileStorage.HANDLE;
	}

	public static MemorySegment SDL_OpenFileStorage$address() {
		return SDL_OpenFileStorage.ADDR;
	}

	public static MemorySegment SDL_OpenFileStorage(MemorySegment path) {
		var mh$ = SDL_OpenFileStorage.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_OpenFileStorage", path);
			}
			return (MemorySegment) mh$.invokeExact(path);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_OpenStorage {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_OpenStorage");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_OpenStorage$descriptor() {
		return SDL_OpenStorage.DESC;
	}

	public static MethodHandle SDL_OpenStorage$handle() {
		return SDL_OpenStorage.HANDLE;
	}

	public static MemorySegment SDL_OpenStorage$address() {
		return SDL_OpenStorage.ADDR;
	}

	public static MemorySegment SDL_OpenStorage(MemorySegment iface, MemorySegment userdata) {
		var mh$ = SDL_OpenStorage.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_OpenStorage", iface, userdata);
			}
			return (MemorySegment) mh$.invokeExact(iface, userdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CloseStorage {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CloseStorage");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CloseStorage$descriptor() {
		return SDL_CloseStorage.DESC;
	}

	public static MethodHandle SDL_CloseStorage$handle() {
		return SDL_CloseStorage.HANDLE;
	}

	public static MemorySegment SDL_CloseStorage$address() {
		return SDL_CloseStorage.ADDR;
	}

	public static boolean SDL_CloseStorage(MemorySegment storage) {
		var mh$ = SDL_CloseStorage.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CloseStorage", storage);
			}
			return (boolean) mh$.invokeExact(storage);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_StorageReady {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_StorageReady");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_StorageReady$descriptor() {
		return SDL_StorageReady.DESC;
	}

	public static MethodHandle SDL_StorageReady$handle() {
		return SDL_StorageReady.HANDLE;
	}

	public static MemorySegment SDL_StorageReady$address() {
		return SDL_StorageReady.ADDR;
	}

	public static boolean SDL_StorageReady(MemorySegment storage) {
		var mh$ = SDL_StorageReady.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_StorageReady", storage);
			}
			return (boolean) mh$.invokeExact(storage);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetStorageFileSize {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetStorageFileSize");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetStorageFileSize$descriptor() {
		return SDL_GetStorageFileSize.DESC;
	}

	public static MethodHandle SDL_GetStorageFileSize$handle() {
		return SDL_GetStorageFileSize.HANDLE;
	}

	public static MemorySegment SDL_GetStorageFileSize$address() {
		return SDL_GetStorageFileSize.ADDR;
	}

	public static boolean SDL_GetStorageFileSize(MemorySegment storage, MemorySegment path, MemorySegment length) {
		var mh$ = SDL_GetStorageFileSize.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetStorageFileSize", storage, path, length);
			}
			return (boolean) mh$.invokeExact(storage, path, length);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ReadStorageFile {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ReadStorageFile");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ReadStorageFile$descriptor() {
		return SDL_ReadStorageFile.DESC;
	}

	public static MethodHandle SDL_ReadStorageFile$handle() {
		return SDL_ReadStorageFile.HANDLE;
	}

	public static MemorySegment SDL_ReadStorageFile$address() {
		return SDL_ReadStorageFile.ADDR;
	}

	public static boolean SDL_ReadStorageFile(MemorySegment storage, MemorySegment path, MemorySegment destination, long length) {
		var mh$ = SDL_ReadStorageFile.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ReadStorageFile", storage, path, destination, length);
			}
			return (boolean) mh$.invokeExact(storage, path, destination, length);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WriteStorageFile {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WriteStorageFile");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WriteStorageFile$descriptor() {
		return SDL_WriteStorageFile.DESC;
	}

	public static MethodHandle SDL_WriteStorageFile$handle() {
		return SDL_WriteStorageFile.HANDLE;
	}

	public static MemorySegment SDL_WriteStorageFile$address() {
		return SDL_WriteStorageFile.ADDR;
	}

	public static boolean SDL_WriteStorageFile(MemorySegment storage, MemorySegment path, MemorySegment source, long length) {
		var mh$ = SDL_WriteStorageFile.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WriteStorageFile", storage, path, source, length);
			}
			return (boolean) mh$.invokeExact(storage, path, source, length);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateStorageDirectory {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateStorageDirectory");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateStorageDirectory$descriptor() {
		return SDL_CreateStorageDirectory.DESC;
	}

	public static MethodHandle SDL_CreateStorageDirectory$handle() {
		return SDL_CreateStorageDirectory.HANDLE;
	}

	public static MemorySegment SDL_CreateStorageDirectory$address() {
		return SDL_CreateStorageDirectory.ADDR;
	}

	public static boolean SDL_CreateStorageDirectory(MemorySegment storage, MemorySegment path) {
		var mh$ = SDL_CreateStorageDirectory.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateStorageDirectory", storage, path);
			}
			return (boolean) mh$.invokeExact(storage, path);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_EnumerateStorageDirectory {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_EnumerateStorageDirectory");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_EnumerateStorageDirectory$descriptor() {
		return SDL_EnumerateStorageDirectory.DESC;
	}

	public static MethodHandle SDL_EnumerateStorageDirectory$handle() {
		return SDL_EnumerateStorageDirectory.HANDLE;
	}

	public static MemorySegment SDL_EnumerateStorageDirectory$address() {
		return SDL_EnumerateStorageDirectory.ADDR;
	}

	public static boolean SDL_EnumerateStorageDirectory(MemorySegment storage, MemorySegment path, MemorySegment callback, MemorySegment userdata) {
		var mh$ = SDL_EnumerateStorageDirectory.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_EnumerateStorageDirectory", storage, path, callback, userdata);
			}
			return (boolean) mh$.invokeExact(storage, path, callback, userdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RemoveStoragePath {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RemoveStoragePath");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RemoveStoragePath$descriptor() {
		return SDL_RemoveStoragePath.DESC;
	}

	public static MethodHandle SDL_RemoveStoragePath$handle() {
		return SDL_RemoveStoragePath.HANDLE;
	}

	public static MemorySegment SDL_RemoveStoragePath$address() {
		return SDL_RemoveStoragePath.ADDR;
	}

	public static boolean SDL_RemoveStoragePath(MemorySegment storage, MemorySegment path) {
		var mh$ = SDL_RemoveStoragePath.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RemoveStoragePath", storage, path);
			}
			return (boolean) mh$.invokeExact(storage, path);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RenameStoragePath {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RenameStoragePath");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RenameStoragePath$descriptor() {
		return SDL_RenameStoragePath.DESC;
	}

	public static MethodHandle SDL_RenameStoragePath$handle() {
		return SDL_RenameStoragePath.HANDLE;
	}

	public static MemorySegment SDL_RenameStoragePath$address() {
		return SDL_RenameStoragePath.ADDR;
	}

	public static boolean SDL_RenameStoragePath(MemorySegment storage, MemorySegment oldpath, MemorySegment newpath) {
		var mh$ = SDL_RenameStoragePath.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RenameStoragePath", storage, oldpath, newpath);
			}
			return (boolean) mh$.invokeExact(storage, oldpath, newpath);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CopyStorageFile {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CopyStorageFile");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CopyStorageFile$descriptor() {
		return SDL_CopyStorageFile.DESC;
	}

	public static MethodHandle SDL_CopyStorageFile$handle() {
		return SDL_CopyStorageFile.HANDLE;
	}

	public static MemorySegment SDL_CopyStorageFile$address() {
		return SDL_CopyStorageFile.ADDR;
	}

	public static boolean SDL_CopyStorageFile(MemorySegment storage, MemorySegment oldpath, MemorySegment newpath) {
		var mh$ = SDL_CopyStorageFile.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CopyStorageFile", storage, oldpath, newpath);
			}
			return (boolean) mh$.invokeExact(storage, oldpath, newpath);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetStoragePathInfo {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetStoragePathInfo");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetStoragePathInfo$descriptor() {
		return SDL_GetStoragePathInfo.DESC;
	}

	public static MethodHandle SDL_GetStoragePathInfo$handle() {
		return SDL_GetStoragePathInfo.HANDLE;
	}

	public static MemorySegment SDL_GetStoragePathInfo$address() {
		return SDL_GetStoragePathInfo.ADDR;
	}

	public static boolean SDL_GetStoragePathInfo(MemorySegment storage, MemorySegment path, MemorySegment info) {
		var mh$ = SDL_GetStoragePathInfo.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetStoragePathInfo", storage, path, info);
			}
			return (boolean) mh$.invokeExact(storage, path, info);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetStorageSpaceRemaining {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetStorageSpaceRemaining");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetStorageSpaceRemaining$descriptor() {
		return SDL_GetStorageSpaceRemaining.DESC;
	}

	public static MethodHandle SDL_GetStorageSpaceRemaining$handle() {
		return SDL_GetStorageSpaceRemaining.HANDLE;
	}

	public static MemorySegment SDL_GetStorageSpaceRemaining$address() {
		return SDL_GetStorageSpaceRemaining.ADDR;
	}

	public static long SDL_GetStorageSpaceRemaining(MemorySegment storage) {
		var mh$ = SDL_GetStorageSpaceRemaining.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetStorageSpaceRemaining", storage);
			}
			return (long) mh$.invokeExact(storage);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GlobStorageDirectory {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GlobStorageDirectory");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GlobStorageDirectory$descriptor() {
		return SDL_GlobStorageDirectory.DESC;
	}

	public static MethodHandle SDL_GlobStorageDirectory$handle() {
		return SDL_GlobStorageDirectory.HANDLE;
	}

	public static MemorySegment SDL_GlobStorageDirectory$address() {
		return SDL_GlobStorageDirectory.ADDR;
	}

	public static MemorySegment SDL_GlobStorageDirectory(MemorySegment storage, MemorySegment path, MemorySegment pattern, int flags, MemorySegment count) {
		var mh$ = SDL_GlobStorageDirectory.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GlobStorageDirectory", storage, path, pattern, flags, count);
			}
			return (MemorySegment) mh$.invokeExact(storage, path, pattern, flags, count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetX11EventHook {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetX11EventHook");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetX11EventHook$descriptor() {
		return SDL_SetX11EventHook.DESC;
	}

	public static MethodHandle SDL_SetX11EventHook$handle() {
		return SDL_SetX11EventHook.HANDLE;
	}

	public static MemorySegment SDL_SetX11EventHook$address() {
		return SDL_SetX11EventHook.ADDR;
	}

	public static void SDL_SetX11EventHook(MemorySegment callback, MemorySegment userdata) {
		var mh$ = SDL_SetX11EventHook.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetX11EventHook", callback, userdata);
			}
			mh$.invokeExact(callback, userdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetLinuxThreadPriority {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_LONG,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetLinuxThreadPriority");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetLinuxThreadPriority$descriptor() {
		return SDL_SetLinuxThreadPriority.DESC;
	}

	public static MethodHandle SDL_SetLinuxThreadPriority$handle() {
		return SDL_SetLinuxThreadPriority.HANDLE;
	}

	public static MemorySegment SDL_SetLinuxThreadPriority$address() {
		return SDL_SetLinuxThreadPriority.ADDR;
	}

	public static boolean SDL_SetLinuxThreadPriority(long threadID, int priority) {
		var mh$ = SDL_SetLinuxThreadPriority.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetLinuxThreadPriority", threadID, priority);
			}
			return (boolean) mh$.invokeExact(threadID, priority);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetLinuxThreadPriorityAndPolicy {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_LONG,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetLinuxThreadPriorityAndPolicy");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetLinuxThreadPriorityAndPolicy$descriptor() {
		return SDL_SetLinuxThreadPriorityAndPolicy.DESC;
	}

	public static MethodHandle SDL_SetLinuxThreadPriorityAndPolicy$handle() {
		return SDL_SetLinuxThreadPriorityAndPolicy.HANDLE;
	}

	public static MemorySegment SDL_SetLinuxThreadPriorityAndPolicy$address() {
		return SDL_SetLinuxThreadPriorityAndPolicy.ADDR;
	}

	public static boolean SDL_SetLinuxThreadPriorityAndPolicy(long threadID, int sdlPriority, int schedPolicy) {
		var mh$ = SDL_SetLinuxThreadPriorityAndPolicy.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetLinuxThreadPriorityAndPolicy", threadID, sdlPriority, schedPolicy);
			}
			return (boolean) mh$.invokeExact(threadID, sdlPriority, schedPolicy);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_IsTablet {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_IsTablet");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_IsTablet$descriptor() {
		return SDL_IsTablet.DESC;
	}

	public static MethodHandle SDL_IsTablet$handle() {
		return SDL_IsTablet.HANDLE;
	}

	public static MemorySegment SDL_IsTablet$address() {
		return SDL_IsTablet.ADDR;
	}

	public static boolean SDL_IsTablet() {
		var mh$ = SDL_IsTablet.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_IsTablet");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_IsTV {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_IsTV");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_IsTV$descriptor() {
		return SDL_IsTV.DESC;
	}

	public static MethodHandle SDL_IsTV$handle() {
		return SDL_IsTV.HANDLE;
	}

	public static MemorySegment SDL_IsTV$address() {
		return SDL_IsTV.ADDR;
	}

	public static boolean SDL_IsTV() {
		var mh$ = SDL_IsTV.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_IsTV");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static final int SDL_SANDBOX_NONE = (int) 0L;

	public static int SDL_SANDBOX_NONE() {
		return SDL_SANDBOX_NONE;
	}

	private static final int SDL_SANDBOX_UNKNOWN_CONTAINER = (int) 1L;

	public static int SDL_SANDBOX_UNKNOWN_CONTAINER() {
		return SDL_SANDBOX_UNKNOWN_CONTAINER;
	}

	private static final int SDL_SANDBOX_FLATPAK = (int) 2L;

	public static int SDL_SANDBOX_FLATPAK() {
		return SDL_SANDBOX_FLATPAK;
	}

	private static final int SDL_SANDBOX_SNAP = (int) 3L;

	public static int SDL_SANDBOX_SNAP() {
		return SDL_SANDBOX_SNAP;
	}

	private static final int SDL_SANDBOX_MACOS = (int) 4L;

	public static int SDL_SANDBOX_MACOS() {
		return SDL_SANDBOX_MACOS;
	}

	private static class SDL_GetSandbox {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetSandbox");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetSandbox$descriptor() {
		return SDL_GetSandbox.DESC;
	}

	public static MethodHandle SDL_GetSandbox$handle() {
		return SDL_GetSandbox.HANDLE;
	}

	public static MemorySegment SDL_GetSandbox$address() {
		return SDL_GetSandbox.ADDR;
	}

	public static int SDL_GetSandbox() {
		var mh$ = SDL_GetSandbox.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetSandbox");
			}
			return (int) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_OnApplicationWillTerminate {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid();

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_OnApplicationWillTerminate");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_OnApplicationWillTerminate$descriptor() {
		return SDL_OnApplicationWillTerminate.DESC;
	}

	public static MethodHandle SDL_OnApplicationWillTerminate$handle() {
		return SDL_OnApplicationWillTerminate.HANDLE;
	}

	public static MemorySegment SDL_OnApplicationWillTerminate$address() {
		return SDL_OnApplicationWillTerminate.ADDR;
	}

	public static void SDL_OnApplicationWillTerminate() {
		var mh$ = SDL_OnApplicationWillTerminate.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_OnApplicationWillTerminate");
			}
			mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_OnApplicationDidReceiveMemoryWarning {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid();

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_OnApplicationDidReceiveMemoryWarning");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_OnApplicationDidReceiveMemoryWarning$descriptor() {
		return SDL_OnApplicationDidReceiveMemoryWarning.DESC;
	}

	public static MethodHandle SDL_OnApplicationDidReceiveMemoryWarning$handle() {
		return SDL_OnApplicationDidReceiveMemoryWarning.HANDLE;
	}

	public static MemorySegment SDL_OnApplicationDidReceiveMemoryWarning$address() {
		return SDL_OnApplicationDidReceiveMemoryWarning.ADDR;
	}

	public static void SDL_OnApplicationDidReceiveMemoryWarning() {
		var mh$ = SDL_OnApplicationDidReceiveMemoryWarning.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_OnApplicationDidReceiveMemoryWarning");
			}
			mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_OnApplicationWillEnterBackground {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid();

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_OnApplicationWillEnterBackground");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_OnApplicationWillEnterBackground$descriptor() {
		return SDL_OnApplicationWillEnterBackground.DESC;
	}

	public static MethodHandle SDL_OnApplicationWillEnterBackground$handle() {
		return SDL_OnApplicationWillEnterBackground.HANDLE;
	}

	public static MemorySegment SDL_OnApplicationWillEnterBackground$address() {
		return SDL_OnApplicationWillEnterBackground.ADDR;
	}

	public static void SDL_OnApplicationWillEnterBackground() {
		var mh$ = SDL_OnApplicationWillEnterBackground.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_OnApplicationWillEnterBackground");
			}
			mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_OnApplicationDidEnterBackground {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid();

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_OnApplicationDidEnterBackground");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_OnApplicationDidEnterBackground$descriptor() {
		return SDL_OnApplicationDidEnterBackground.DESC;
	}

	public static MethodHandle SDL_OnApplicationDidEnterBackground$handle() {
		return SDL_OnApplicationDidEnterBackground.HANDLE;
	}

	public static MemorySegment SDL_OnApplicationDidEnterBackground$address() {
		return SDL_OnApplicationDidEnterBackground.ADDR;
	}

	public static void SDL_OnApplicationDidEnterBackground() {
		var mh$ = SDL_OnApplicationDidEnterBackground.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_OnApplicationDidEnterBackground");
			}
			mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_OnApplicationWillEnterForeground {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid();

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_OnApplicationWillEnterForeground");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_OnApplicationWillEnterForeground$descriptor() {
		return SDL_OnApplicationWillEnterForeground.DESC;
	}

	public static MethodHandle SDL_OnApplicationWillEnterForeground$handle() {
		return SDL_OnApplicationWillEnterForeground.HANDLE;
	}

	public static MemorySegment SDL_OnApplicationWillEnterForeground$address() {
		return SDL_OnApplicationWillEnterForeground.ADDR;
	}

	public static void SDL_OnApplicationWillEnterForeground() {
		var mh$ = SDL_OnApplicationWillEnterForeground.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_OnApplicationWillEnterForeground");
			}
			mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_OnApplicationDidEnterForeground {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid();

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_OnApplicationDidEnterForeground");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_OnApplicationDidEnterForeground$descriptor() {
		return SDL_OnApplicationDidEnterForeground.DESC;
	}

	public static MethodHandle SDL_OnApplicationDidEnterForeground$handle() {
		return SDL_OnApplicationDidEnterForeground.HANDLE;
	}

	public static MemorySegment SDL_OnApplicationDidEnterForeground$address() {
		return SDL_OnApplicationDidEnterForeground.ADDR;
	}

	public static void SDL_OnApplicationDidEnterForeground() {
		var mh$ = SDL_OnApplicationDidEnterForeground.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_OnApplicationDidEnterForeground");
			}
			mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static final int SDL_DATE_FORMAT_YYYYMMDD = (int) 0L;

	public static int SDL_DATE_FORMAT_YYYYMMDD() {
		return SDL_DATE_FORMAT_YYYYMMDD;
	}

	private static final int SDL_DATE_FORMAT_DDMMYYYY = (int) 1L;

	public static int SDL_DATE_FORMAT_DDMMYYYY() {
		return SDL_DATE_FORMAT_DDMMYYYY;
	}

	private static final int SDL_DATE_FORMAT_MMDDYYYY = (int) 2L;

	public static int SDL_DATE_FORMAT_MMDDYYYY() {
		return SDL_DATE_FORMAT_MMDDYYYY;
	}

	private static final int SDL_TIME_FORMAT_24HR = (int) 0L;

	public static int SDL_TIME_FORMAT_24HR() {
		return SDL_TIME_FORMAT_24HR;
	}

	private static final int SDL_TIME_FORMAT_12HR = (int) 1L;

	public static int SDL_TIME_FORMAT_12HR() {
		return SDL_TIME_FORMAT_12HR;
	}

	private static class SDL_GetDateTimeLocalePreferences {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetDateTimeLocalePreferences");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetDateTimeLocalePreferences$descriptor() {
		return SDL_GetDateTimeLocalePreferences.DESC;
	}

	public static MethodHandle SDL_GetDateTimeLocalePreferences$handle() {
		return SDL_GetDateTimeLocalePreferences.HANDLE;
	}

	public static MemorySegment SDL_GetDateTimeLocalePreferences$address() {
		return SDL_GetDateTimeLocalePreferences.ADDR;
	}

	public static boolean SDL_GetDateTimeLocalePreferences(MemorySegment dateFormat, MemorySegment timeFormat) {
		var mh$ = SDL_GetDateTimeLocalePreferences.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetDateTimeLocalePreferences", dateFormat, timeFormat);
			}
			return (boolean) mh$.invokeExact(dateFormat, timeFormat);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetCurrentTime {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetCurrentTime");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetCurrentTime$descriptor() {
		return SDL_GetCurrentTime.DESC;
	}

	public static MethodHandle SDL_GetCurrentTime$handle() {
		return SDL_GetCurrentTime.HANDLE;
	}

	public static MemorySegment SDL_GetCurrentTime$address() {
		return SDL_GetCurrentTime.ADDR;
	}

	public static boolean SDL_GetCurrentTime(MemorySegment ticks) {
		var mh$ = SDL_GetCurrentTime.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetCurrentTime", ticks);
			}
			return (boolean) mh$.invokeExact(ticks);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_TimeToDateTime {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_LONG,
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_TimeToDateTime");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_TimeToDateTime$descriptor() {
		return SDL_TimeToDateTime.DESC;
	}

	public static MethodHandle SDL_TimeToDateTime$handle() {
		return SDL_TimeToDateTime.HANDLE;
	}

	public static MemorySegment SDL_TimeToDateTime$address() {
		return SDL_TimeToDateTime.ADDR;
	}

	public static boolean SDL_TimeToDateTime(long ticks, MemorySegment dt, boolean localTime) {
		var mh$ = SDL_TimeToDateTime.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_TimeToDateTime", ticks, dt, localTime);
			}
			return (boolean) mh$.invokeExact(ticks, dt, localTime);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DateTimeToTime {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DateTimeToTime");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DateTimeToTime$descriptor() {
		return SDL_DateTimeToTime.DESC;
	}

	public static MethodHandle SDL_DateTimeToTime$handle() {
		return SDL_DateTimeToTime.HANDLE;
	}

	public static MemorySegment SDL_DateTimeToTime$address() {
		return SDL_DateTimeToTime.ADDR;
	}

	public static boolean SDL_DateTimeToTime(MemorySegment dt, MemorySegment ticks) {
		var mh$ = SDL_DateTimeToTime.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DateTimeToTime", dt, ticks);
			}
			return (boolean) mh$.invokeExact(dt, ticks);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_TimeToWindows {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_LONG,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_TimeToWindows");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_TimeToWindows$descriptor() {
		return SDL_TimeToWindows.DESC;
	}

	public static MethodHandle SDL_TimeToWindows$handle() {
		return SDL_TimeToWindows.HANDLE;
	}

	public static MemorySegment SDL_TimeToWindows$address() {
		return SDL_TimeToWindows.ADDR;
	}

	public static void SDL_TimeToWindows(long ticks, MemorySegment dwLowDateTime, MemorySegment dwHighDateTime) {
		var mh$ = SDL_TimeToWindows.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_TimeToWindows", ticks, dwLowDateTime, dwHighDateTime);
			}
			mh$.invokeExact(ticks, dwLowDateTime, dwHighDateTime);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_TimeFromWindows {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_TimeFromWindows");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_TimeFromWindows$descriptor() {
		return SDL_TimeFromWindows.DESC;
	}

	public static MethodHandle SDL_TimeFromWindows$handle() {
		return SDL_TimeFromWindows.HANDLE;
	}

	public static MemorySegment SDL_TimeFromWindows$address() {
		return SDL_TimeFromWindows.ADDR;
	}

	public static long SDL_TimeFromWindows(int dwLowDateTime, int dwHighDateTime) {
		var mh$ = SDL_TimeFromWindows.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_TimeFromWindows", dwLowDateTime, dwHighDateTime);
			}
			return (long) mh$.invokeExact(dwLowDateTime, dwHighDateTime);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetDaysInMonth {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetDaysInMonth");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetDaysInMonth$descriptor() {
		return SDL_GetDaysInMonth.DESC;
	}

	public static MethodHandle SDL_GetDaysInMonth$handle() {
		return SDL_GetDaysInMonth.HANDLE;
	}

	public static MemorySegment SDL_GetDaysInMonth$address() {
		return SDL_GetDaysInMonth.ADDR;
	}

	public static int SDL_GetDaysInMonth(int year, int month) {
		var mh$ = SDL_GetDaysInMonth.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetDaysInMonth", year, month);
			}
			return (int) mh$.invokeExact(year, month);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetDayOfYear {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetDayOfYear");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetDayOfYear$descriptor() {
		return SDL_GetDayOfYear.DESC;
	}

	public static MethodHandle SDL_GetDayOfYear$handle() {
		return SDL_GetDayOfYear.HANDLE;
	}

	public static MemorySegment SDL_GetDayOfYear$address() {
		return SDL_GetDayOfYear.ADDR;
	}

	public static int SDL_GetDayOfYear(int year, int month, int day) {
		var mh$ = SDL_GetDayOfYear.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetDayOfYear", year, month, day);
			}
			return (int) mh$.invokeExact(year, month, day);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetDayOfWeek {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetDayOfWeek");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetDayOfWeek$descriptor() {
		return SDL_GetDayOfWeek.DESC;
	}

	public static MethodHandle SDL_GetDayOfWeek$handle() {
		return SDL_GetDayOfWeek.HANDLE;
	}

	public static MemorySegment SDL_GetDayOfWeek$address() {
		return SDL_GetDayOfWeek.ADDR;
	}

	public static int SDL_GetDayOfWeek(int year, int month, int day) {
		var mh$ = SDL_GetDayOfWeek.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetDayOfWeek", year, month, day);
			}
			return (int) mh$.invokeExact(year, month, day);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetTicks {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetTicks");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetTicks$descriptor() {
		return SDL_GetTicks.DESC;
	}

	public static MethodHandle SDL_GetTicks$handle() {
		return SDL_GetTicks.HANDLE;
	}

	public static MemorySegment SDL_GetTicks$address() {
		return SDL_GetTicks.ADDR;
	}

	public static long SDL_GetTicks() {
		var mh$ = SDL_GetTicks.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetTicks");
			}
			return (long) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetTicksNS {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetTicksNS");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetTicksNS$descriptor() {
		return SDL_GetTicksNS.DESC;
	}

	public static MethodHandle SDL_GetTicksNS$handle() {
		return SDL_GetTicksNS.HANDLE;
	}

	public static MemorySegment SDL_GetTicksNS$address() {
		return SDL_GetTicksNS.ADDR;
	}

	public static long SDL_GetTicksNS() {
		var mh$ = SDL_GetTicksNS.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetTicksNS");
			}
			return (long) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetPerformanceCounter {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetPerformanceCounter");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetPerformanceCounter$descriptor() {
		return SDL_GetPerformanceCounter.DESC;
	}

	public static MethodHandle SDL_GetPerformanceCounter$handle() {
		return SDL_GetPerformanceCounter.HANDLE;
	}

	public static MemorySegment SDL_GetPerformanceCounter$address() {
		return SDL_GetPerformanceCounter.ADDR;
	}

	public static long SDL_GetPerformanceCounter() {
		var mh$ = SDL_GetPerformanceCounter.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetPerformanceCounter");
			}
			return (long) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetPerformanceFrequency {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetPerformanceFrequency");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetPerformanceFrequency$descriptor() {
		return SDL_GetPerformanceFrequency.DESC;
	}

	public static MethodHandle SDL_GetPerformanceFrequency$handle() {
		return SDL_GetPerformanceFrequency.HANDLE;
	}

	public static MemorySegment SDL_GetPerformanceFrequency$address() {
		return SDL_GetPerformanceFrequency.ADDR;
	}

	public static long SDL_GetPerformanceFrequency() {
		var mh$ = SDL_GetPerformanceFrequency.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetPerformanceFrequency");
			}
			return (long) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_Delay {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_Delay");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_Delay$descriptor() {
		return SDL_Delay.DESC;
	}

	public static MethodHandle SDL_Delay$handle() {
		return SDL_Delay.HANDLE;
	}

	public static MemorySegment SDL_Delay$address() {
		return SDL_Delay.ADDR;
	}

	public static void SDL_Delay(int ms) {
		var mh$ = SDL_Delay.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_Delay", ms);
			}
			mh$.invokeExact(ms);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DelayNS {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DelayNS");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DelayNS$descriptor() {
		return SDL_DelayNS.DESC;
	}

	public static MethodHandle SDL_DelayNS$handle() {
		return SDL_DelayNS.HANDLE;
	}

	public static MemorySegment SDL_DelayNS$address() {
		return SDL_DelayNS.ADDR;
	}

	public static void SDL_DelayNS(long ns) {
		var mh$ = SDL_DelayNS.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DelayNS", ns);
			}
			mh$.invokeExact(ns);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DelayPrecise {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DelayPrecise");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DelayPrecise$descriptor() {
		return SDL_DelayPrecise.DESC;
	}

	public static MethodHandle SDL_DelayPrecise$handle() {
		return SDL_DelayPrecise.HANDLE;
	}

	public static MemorySegment SDL_DelayPrecise$address() {
		return SDL_DelayPrecise.ADDR;
	}

	public static void SDL_DelayPrecise(long ns) {
		var mh$ = SDL_DelayPrecise.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DelayPrecise", ns);
			}
			mh$.invokeExact(ns);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	public static OfInt SDL_TimerID = SDL3.C_INT;

	private static class SDL_AddTimer {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_AddTimer");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_AddTimer$descriptor() {
		return SDL_AddTimer.DESC;
	}

	public static MethodHandle SDL_AddTimer$handle() {
		return SDL_AddTimer.HANDLE;
	}

	public static MemorySegment SDL_AddTimer$address() {
		return SDL_AddTimer.ADDR;
	}

	public static int SDL_AddTimer(int interval, MemorySegment callback, MemorySegment userdata) {
		var mh$ = SDL_AddTimer.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_AddTimer", interval, callback, userdata);
			}
			return (int) mh$.invokeExact(interval, callback, userdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_AddTimerNS {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_LONG,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_AddTimerNS");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_AddTimerNS$descriptor() {
		return SDL_AddTimerNS.DESC;
	}

	public static MethodHandle SDL_AddTimerNS$handle() {
		return SDL_AddTimerNS.HANDLE;
	}

	public static MemorySegment SDL_AddTimerNS$address() {
		return SDL_AddTimerNS.ADDR;
	}

	public static int SDL_AddTimerNS(long interval, MemorySegment callback, MemorySegment userdata) {
		var mh$ = SDL_AddTimerNS.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_AddTimerNS", interval, callback, userdata);
			}
			return (int) mh$.invokeExact(interval, callback, userdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RemoveTimer {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RemoveTimer");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RemoveTimer$descriptor() {
		return SDL_RemoveTimer.DESC;
	}

	public static MethodHandle SDL_RemoveTimer$handle() {
		return SDL_RemoveTimer.HANDLE;
	}

	public static MemorySegment SDL_RemoveTimer$address() {
		return SDL_RemoveTimer.ADDR;
	}

	public static boolean SDL_RemoveTimer(int id) {
		var mh$ = SDL_RemoveTimer.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RemoveTimer", id);
			}
			return (boolean) mh$.invokeExact(id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	public static OfInt SDL_TrayEntryFlags = SDL3.C_INT;

	private static class SDL_CreateTray {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateTray");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateTray$descriptor() {
		return SDL_CreateTray.DESC;
	}

	public static MethodHandle SDL_CreateTray$handle() {
		return SDL_CreateTray.HANDLE;
	}

	public static MemorySegment SDL_CreateTray$address() {
		return SDL_CreateTray.ADDR;
	}

	public static MemorySegment SDL_CreateTray(MemorySegment icon, MemorySegment tooltip) {
		var mh$ = SDL_CreateTray.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateTray", icon, tooltip);
			}
			return (MemorySegment) mh$.invokeExact(icon, tooltip);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetTrayIcon {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetTrayIcon");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetTrayIcon$descriptor() {
		return SDL_SetTrayIcon.DESC;
	}

	public static MethodHandle SDL_SetTrayIcon$handle() {
		return SDL_SetTrayIcon.HANDLE;
	}

	public static MemorySegment SDL_SetTrayIcon$address() {
		return SDL_SetTrayIcon.ADDR;
	}

	public static void SDL_SetTrayIcon(MemorySegment tray, MemorySegment icon) {
		var mh$ = SDL_SetTrayIcon.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetTrayIcon", tray, icon);
			}
			mh$.invokeExact(tray, icon);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetTrayTooltip {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetTrayTooltip");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetTrayTooltip$descriptor() {
		return SDL_SetTrayTooltip.DESC;
	}

	public static MethodHandle SDL_SetTrayTooltip$handle() {
		return SDL_SetTrayTooltip.HANDLE;
	}

	public static MemorySegment SDL_SetTrayTooltip$address() {
		return SDL_SetTrayTooltip.ADDR;
	}

	public static void SDL_SetTrayTooltip(MemorySegment tray, MemorySegment tooltip) {
		var mh$ = SDL_SetTrayTooltip.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetTrayTooltip", tray, tooltip);
			}
			mh$.invokeExact(tray, tooltip);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateTrayMenu {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateTrayMenu");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateTrayMenu$descriptor() {
		return SDL_CreateTrayMenu.DESC;
	}

	public static MethodHandle SDL_CreateTrayMenu$handle() {
		return SDL_CreateTrayMenu.HANDLE;
	}

	public static MemorySegment SDL_CreateTrayMenu$address() {
		return SDL_CreateTrayMenu.ADDR;
	}

	public static MemorySegment SDL_CreateTrayMenu(MemorySegment tray) {
		var mh$ = SDL_CreateTrayMenu.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateTrayMenu", tray);
			}
			return (MemorySegment) mh$.invokeExact(tray);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateTraySubmenu {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateTraySubmenu");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateTraySubmenu$descriptor() {
		return SDL_CreateTraySubmenu.DESC;
	}

	public static MethodHandle SDL_CreateTraySubmenu$handle() {
		return SDL_CreateTraySubmenu.HANDLE;
	}

	public static MemorySegment SDL_CreateTraySubmenu$address() {
		return SDL_CreateTraySubmenu.ADDR;
	}

	public static MemorySegment SDL_CreateTraySubmenu(MemorySegment entry) {
		var mh$ = SDL_CreateTraySubmenu.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateTraySubmenu", entry);
			}
			return (MemorySegment) mh$.invokeExact(entry);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetTrayMenu {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetTrayMenu");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetTrayMenu$descriptor() {
		return SDL_GetTrayMenu.DESC;
	}

	public static MethodHandle SDL_GetTrayMenu$handle() {
		return SDL_GetTrayMenu.HANDLE;
	}

	public static MemorySegment SDL_GetTrayMenu$address() {
		return SDL_GetTrayMenu.ADDR;
	}

	public static MemorySegment SDL_GetTrayMenu(MemorySegment tray) {
		var mh$ = SDL_GetTrayMenu.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetTrayMenu", tray);
			}
			return (MemorySegment) mh$.invokeExact(tray);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetTraySubmenu {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetTraySubmenu");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetTraySubmenu$descriptor() {
		return SDL_GetTraySubmenu.DESC;
	}

	public static MethodHandle SDL_GetTraySubmenu$handle() {
		return SDL_GetTraySubmenu.HANDLE;
	}

	public static MemorySegment SDL_GetTraySubmenu$address() {
		return SDL_GetTraySubmenu.ADDR;
	}

	public static MemorySegment SDL_GetTraySubmenu(MemorySegment entry) {
		var mh$ = SDL_GetTraySubmenu.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetTraySubmenu", entry);
			}
			return (MemorySegment) mh$.invokeExact(entry);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetTrayEntries {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetTrayEntries");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetTrayEntries$descriptor() {
		return SDL_GetTrayEntries.DESC;
	}

	public static MethodHandle SDL_GetTrayEntries$handle() {
		return SDL_GetTrayEntries.HANDLE;
	}

	public static MemorySegment SDL_GetTrayEntries$address() {
		return SDL_GetTrayEntries.ADDR;
	}

	public static MemorySegment SDL_GetTrayEntries(MemorySegment menu, MemorySegment count) {
		var mh$ = SDL_GetTrayEntries.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetTrayEntries", menu, count);
			}
			return (MemorySegment) mh$.invokeExact(menu, count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RemoveTrayEntry {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RemoveTrayEntry");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RemoveTrayEntry$descriptor() {
		return SDL_RemoveTrayEntry.DESC;
	}

	public static MethodHandle SDL_RemoveTrayEntry$handle() {
		return SDL_RemoveTrayEntry.HANDLE;
	}

	public static MemorySegment SDL_RemoveTrayEntry$address() {
		return SDL_RemoveTrayEntry.ADDR;
	}

	public static void SDL_RemoveTrayEntry(MemorySegment entry) {
		var mh$ = SDL_RemoveTrayEntry.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RemoveTrayEntry", entry);
			}
			mh$.invokeExact(entry);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_InsertTrayEntryAt {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_InsertTrayEntryAt");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_InsertTrayEntryAt$descriptor() {
		return SDL_InsertTrayEntryAt.DESC;
	}

	public static MethodHandle SDL_InsertTrayEntryAt$handle() {
		return SDL_InsertTrayEntryAt.HANDLE;
	}

	public static MemorySegment SDL_InsertTrayEntryAt$address() {
		return SDL_InsertTrayEntryAt.ADDR;
	}

	public static MemorySegment SDL_InsertTrayEntryAt(MemorySegment menu, int pos, MemorySegment label, int flags) {
		var mh$ = SDL_InsertTrayEntryAt.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_InsertTrayEntryAt", menu, pos, label, flags);
			}
			return (MemorySegment) mh$.invokeExact(menu, pos, label, flags);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetTrayEntryLabel {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetTrayEntryLabel");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetTrayEntryLabel$descriptor() {
		return SDL_SetTrayEntryLabel.DESC;
	}

	public static MethodHandle SDL_SetTrayEntryLabel$handle() {
		return SDL_SetTrayEntryLabel.HANDLE;
	}

	public static MemorySegment SDL_SetTrayEntryLabel$address() {
		return SDL_SetTrayEntryLabel.ADDR;
	}

	public static void SDL_SetTrayEntryLabel(MemorySegment entry, MemorySegment label) {
		var mh$ = SDL_SetTrayEntryLabel.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetTrayEntryLabel", entry, label);
			}
			mh$.invokeExact(entry, label);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetTrayEntryLabel {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetTrayEntryLabel");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetTrayEntryLabel$descriptor() {
		return SDL_GetTrayEntryLabel.DESC;
	}

	public static MethodHandle SDL_GetTrayEntryLabel$handle() {
		return SDL_GetTrayEntryLabel.HANDLE;
	}

	public static MemorySegment SDL_GetTrayEntryLabel$address() {
		return SDL_GetTrayEntryLabel.ADDR;
	}

	public static MemorySegment SDL_GetTrayEntryLabel(MemorySegment entry) {
		var mh$ = SDL_GetTrayEntryLabel.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetTrayEntryLabel", entry);
			}
			return (MemorySegment) mh$.invokeExact(entry);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetTrayEntryChecked {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetTrayEntryChecked");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetTrayEntryChecked$descriptor() {
		return SDL_SetTrayEntryChecked.DESC;
	}

	public static MethodHandle SDL_SetTrayEntryChecked$handle() {
		return SDL_SetTrayEntryChecked.HANDLE;
	}

	public static MemorySegment SDL_SetTrayEntryChecked$address() {
		return SDL_SetTrayEntryChecked.ADDR;
	}

	public static void SDL_SetTrayEntryChecked(MemorySegment entry, boolean checked) {
		var mh$ = SDL_SetTrayEntryChecked.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetTrayEntryChecked", entry, checked);
			}
			mh$.invokeExact(entry, checked);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetTrayEntryChecked {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetTrayEntryChecked");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetTrayEntryChecked$descriptor() {
		return SDL_GetTrayEntryChecked.DESC;
	}

	public static MethodHandle SDL_GetTrayEntryChecked$handle() {
		return SDL_GetTrayEntryChecked.HANDLE;
	}

	public static MemorySegment SDL_GetTrayEntryChecked$address() {
		return SDL_GetTrayEntryChecked.ADDR;
	}

	public static boolean SDL_GetTrayEntryChecked(MemorySegment entry) {
		var mh$ = SDL_GetTrayEntryChecked.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetTrayEntryChecked", entry);
			}
			return (boolean) mh$.invokeExact(entry);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetTrayEntryEnabled {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetTrayEntryEnabled");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetTrayEntryEnabled$descriptor() {
		return SDL_SetTrayEntryEnabled.DESC;
	}

	public static MethodHandle SDL_SetTrayEntryEnabled$handle() {
		return SDL_SetTrayEntryEnabled.HANDLE;
	}

	public static MemorySegment SDL_SetTrayEntryEnabled$address() {
		return SDL_SetTrayEntryEnabled.ADDR;
	}

	public static void SDL_SetTrayEntryEnabled(MemorySegment entry, boolean enabled) {
		var mh$ = SDL_SetTrayEntryEnabled.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetTrayEntryEnabled", entry, enabled);
			}
			mh$.invokeExact(entry, enabled);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetTrayEntryEnabled {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetTrayEntryEnabled");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetTrayEntryEnabled$descriptor() {
		return SDL_GetTrayEntryEnabled.DESC;
	}

	public static MethodHandle SDL_GetTrayEntryEnabled$handle() {
		return SDL_GetTrayEntryEnabled.HANDLE;
	}

	public static MemorySegment SDL_GetTrayEntryEnabled$address() {
		return SDL_GetTrayEntryEnabled.ADDR;
	}

	public static boolean SDL_GetTrayEntryEnabled(MemorySegment entry) {
		var mh$ = SDL_GetTrayEntryEnabled.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetTrayEntryEnabled", entry);
			}
			return (boolean) mh$.invokeExact(entry);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetTrayEntryCallback {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetTrayEntryCallback");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetTrayEntryCallback$descriptor() {
		return SDL_SetTrayEntryCallback.DESC;
	}

	public static MethodHandle SDL_SetTrayEntryCallback$handle() {
		return SDL_SetTrayEntryCallback.HANDLE;
	}

	public static MemorySegment SDL_SetTrayEntryCallback$address() {
		return SDL_SetTrayEntryCallback.ADDR;
	}

	public static void SDL_SetTrayEntryCallback(MemorySegment entry, MemorySegment callback, MemorySegment userdata) {
		var mh$ = SDL_SetTrayEntryCallback.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetTrayEntryCallback", entry, callback, userdata);
			}
			mh$.invokeExact(entry, callback, userdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ClickTrayEntry {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ClickTrayEntry");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ClickTrayEntry$descriptor() {
		return SDL_ClickTrayEntry.DESC;
	}

	public static MethodHandle SDL_ClickTrayEntry$handle() {
		return SDL_ClickTrayEntry.HANDLE;
	}

	public static MemorySegment SDL_ClickTrayEntry$address() {
		return SDL_ClickTrayEntry.ADDR;
	}

	public static void SDL_ClickTrayEntry(MemorySegment entry) {
		var mh$ = SDL_ClickTrayEntry.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ClickTrayEntry", entry);
			}
			mh$.invokeExact(entry);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DestroyTray {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DestroyTray");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DestroyTray$descriptor() {
		return SDL_DestroyTray.DESC;
	}

	public static MethodHandle SDL_DestroyTray$handle() {
		return SDL_DestroyTray.HANDLE;
	}

	public static MemorySegment SDL_DestroyTray$address() {
		return SDL_DestroyTray.ADDR;
	}

	public static void SDL_DestroyTray(MemorySegment tray) {
		var mh$ = SDL_DestroyTray.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DestroyTray", tray);
			}
			mh$.invokeExact(tray);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetTrayEntryParent {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetTrayEntryParent");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetTrayEntryParent$descriptor() {
		return SDL_GetTrayEntryParent.DESC;
	}

	public static MethodHandle SDL_GetTrayEntryParent$handle() {
		return SDL_GetTrayEntryParent.HANDLE;
	}

	public static MemorySegment SDL_GetTrayEntryParent$address() {
		return SDL_GetTrayEntryParent.ADDR;
	}

	public static MemorySegment SDL_GetTrayEntryParent(MemorySegment entry) {
		var mh$ = SDL_GetTrayEntryParent.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetTrayEntryParent", entry);
			}
			return (MemorySegment) mh$.invokeExact(entry);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetTrayMenuParentEntry {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetTrayMenuParentEntry");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetTrayMenuParentEntry$descriptor() {
		return SDL_GetTrayMenuParentEntry.DESC;
	}

	public static MethodHandle SDL_GetTrayMenuParentEntry$handle() {
		return SDL_GetTrayMenuParentEntry.HANDLE;
	}

	public static MemorySegment SDL_GetTrayMenuParentEntry$address() {
		return SDL_GetTrayMenuParentEntry.ADDR;
	}

	public static MemorySegment SDL_GetTrayMenuParentEntry(MemorySegment menu) {
		var mh$ = SDL_GetTrayMenuParentEntry.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetTrayMenuParentEntry", menu);
			}
			return (MemorySegment) mh$.invokeExact(menu);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetTrayMenuParentTray {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetTrayMenuParentTray");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetTrayMenuParentTray$descriptor() {
		return SDL_GetTrayMenuParentTray.DESC;
	}

	public static MethodHandle SDL_GetTrayMenuParentTray$handle() {
		return SDL_GetTrayMenuParentTray.HANDLE;
	}

	public static MemorySegment SDL_GetTrayMenuParentTray$address() {
		return SDL_GetTrayMenuParentTray.ADDR;
	}

	public static MemorySegment SDL_GetTrayMenuParentTray(MemorySegment menu) {
		var mh$ = SDL_GetTrayMenuParentTray.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetTrayMenuParentTray", menu);
			}
			return (MemorySegment) mh$.invokeExact(menu);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_UpdateTrays {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid();

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_UpdateTrays");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_UpdateTrays$descriptor() {
		return SDL_UpdateTrays.DESC;
	}

	public static MethodHandle SDL_UpdateTrays$handle() {
		return SDL_UpdateTrays.HANDLE;
	}

	public static MemorySegment SDL_UpdateTrays$address() {
		return SDL_UpdateTrays.ADDR;
	}

	public static void SDL_UpdateTrays() {
		var mh$ = SDL_UpdateTrays.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_UpdateTrays");
			}
			mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetVersion {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetVersion");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetVersion$descriptor() {
		return SDL_GetVersion.DESC;
	}

	public static MethodHandle SDL_GetVersion$handle() {
		return SDL_GetVersion.HANDLE;
	}

	public static MemorySegment SDL_GetVersion$address() {
		return SDL_GetVersion.ADDR;
	}

	public static int SDL_GetVersion() {
		var mh$ = SDL_GetVersion.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetVersion");
			}
			return (int) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRevision {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRevision");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRevision$descriptor() {
		return SDL_GetRevision.DESC;
	}

	public static MethodHandle SDL_GetRevision$handle() {
		return SDL_GetRevision.HANDLE;
	}

	public static MemorySegment SDL_GetRevision$address() {
		return SDL_GetRevision.ADDR;
	}

	public static MemorySegment SDL_GetRevision() {
		var mh$ = SDL_GetRevision.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRevision");
			}
			return (MemorySegment) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetMainReady {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid();

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetMainReady");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetMainReady$descriptor() {
		return SDL_SetMainReady.DESC;
	}

	public static MethodHandle SDL_SetMainReady$handle() {
		return SDL_SetMainReady.HANDLE;
	}

	public static MemorySegment SDL_SetMainReady$address() {
		return SDL_SetMainReady.ADDR;
	}

	public static void SDL_SetMainReady() {
		var mh$ = SDL_SetMainReady.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetMainReady");
			}
			mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RunApp {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RunApp");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RunApp$descriptor() {
		return SDL_RunApp.DESC;
	}

	public static MethodHandle SDL_RunApp$handle() {
		return SDL_RunApp.HANDLE;
	}

	public static MemorySegment SDL_RunApp$address() {
		return SDL_RunApp.ADDR;
	}

	public static int SDL_RunApp(int argc, MemorySegment argv, MemorySegment mainFunction, MemorySegment reserved) {
		var mh$ = SDL_RunApp.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RunApp", argc, argv, mainFunction, reserved);
			}
			return (int) mh$.invokeExact(argc, argv, mainFunction, reserved);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_EnterAppMainCallbacks {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_EnterAppMainCallbacks");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_EnterAppMainCallbacks$descriptor() {
		return SDL_EnterAppMainCallbacks.DESC;
	}

	public static MethodHandle SDL_EnterAppMainCallbacks$handle() {
		return SDL_EnterAppMainCallbacks.HANDLE;
	}

	public static MemorySegment SDL_EnterAppMainCallbacks$address() {
		return SDL_EnterAppMainCallbacks.ADDR;
	}

	public static int SDL_EnterAppMainCallbacks(int argc, MemorySegment argv, MemorySegment appinit, MemorySegment appiter, MemorySegment appevent, MemorySegment appquit) {
		var mh$ = SDL_EnterAppMainCallbacks.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_EnterAppMainCallbacks", argc, argv, appinit, appiter, appevent, appquit);
			}
			return (int) mh$.invokeExact(argc, argv, appinit, appiter, appevent, appquit);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GDKSuspendComplete {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid();

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GDKSuspendComplete");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GDKSuspendComplete$descriptor() {
		return SDL_GDKSuspendComplete.DESC;
	}

	public static MethodHandle SDL_GDKSuspendComplete$handle() {
		return SDL_GDKSuspendComplete.HANDLE;
	}

	public static MemorySegment SDL_GDKSuspendComplete$address() {
		return SDL_GDKSuspendComplete.ADDR;
	}

	public static void SDL_GDKSuspendComplete() {
		var mh$ = SDL_GDKSuspendComplete.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GDKSuspendComplete");
			}
			mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	public static AddressLayout VkInstance = SDL3.C_POINTER;

	public static AddressLayout VkPhysicalDevice = SDL3.C_POINTER;

	public static AddressLayout VkSurfaceKHR = SDL3.C_POINTER;

	private static class SDL_Vulkan_LoadLibrary {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_Vulkan_LoadLibrary");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_Vulkan_LoadLibrary$descriptor() {
		return SDL_Vulkan_LoadLibrary.DESC;
	}

	public static MethodHandle SDL_Vulkan_LoadLibrary$handle() {
		return SDL_Vulkan_LoadLibrary.HANDLE;
	}

	public static MemorySegment SDL_Vulkan_LoadLibrary$address() {
		return SDL_Vulkan_LoadLibrary.ADDR;
	}

	public static boolean SDL_Vulkan_LoadLibrary(MemorySegment path) {
		var mh$ = SDL_Vulkan_LoadLibrary.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_Vulkan_LoadLibrary", path);
			}
			return (boolean) mh$.invokeExact(path);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_Vulkan_GetVkGetInstanceProcAddr {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_Vulkan_GetVkGetInstanceProcAddr");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_Vulkan_GetVkGetInstanceProcAddr$descriptor() {
		return SDL_Vulkan_GetVkGetInstanceProcAddr.DESC;
	}

	public static MethodHandle SDL_Vulkan_GetVkGetInstanceProcAddr$handle() {
		return SDL_Vulkan_GetVkGetInstanceProcAddr.HANDLE;
	}

	public static MemorySegment SDL_Vulkan_GetVkGetInstanceProcAddr$address() {
		return SDL_Vulkan_GetVkGetInstanceProcAddr.ADDR;
	}

	public static MemorySegment SDL_Vulkan_GetVkGetInstanceProcAddr() {
		var mh$ = SDL_Vulkan_GetVkGetInstanceProcAddr.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_Vulkan_GetVkGetInstanceProcAddr");
			}
			return (MemorySegment) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_Vulkan_UnloadLibrary {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid();

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_Vulkan_UnloadLibrary");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_Vulkan_UnloadLibrary$descriptor() {
		return SDL_Vulkan_UnloadLibrary.DESC;
	}

	public static MethodHandle SDL_Vulkan_UnloadLibrary$handle() {
		return SDL_Vulkan_UnloadLibrary.HANDLE;
	}

	public static MemorySegment SDL_Vulkan_UnloadLibrary$address() {
		return SDL_Vulkan_UnloadLibrary.ADDR;
	}

	public static void SDL_Vulkan_UnloadLibrary() {
		var mh$ = SDL_Vulkan_UnloadLibrary.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_Vulkan_UnloadLibrary");
			}
			mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_Vulkan_GetInstanceExtensions {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_Vulkan_GetInstanceExtensions");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_Vulkan_GetInstanceExtensions$descriptor() {
		return SDL_Vulkan_GetInstanceExtensions.DESC;
	}

	public static MethodHandle SDL_Vulkan_GetInstanceExtensions$handle() {
		return SDL_Vulkan_GetInstanceExtensions.HANDLE;
	}

	public static MemorySegment SDL_Vulkan_GetInstanceExtensions$address() {
		return SDL_Vulkan_GetInstanceExtensions.ADDR;
	}

	public static MemorySegment SDL_Vulkan_GetInstanceExtensions(MemorySegment count) {
		var mh$ = SDL_Vulkan_GetInstanceExtensions.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_Vulkan_GetInstanceExtensions", count);
			}
			return (MemorySegment) mh$.invokeExact(count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_Vulkan_CreateSurface {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_Vulkan_CreateSurface");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_Vulkan_CreateSurface$descriptor() {
		return SDL_Vulkan_CreateSurface.DESC;
	}

	public static MethodHandle SDL_Vulkan_CreateSurface$handle() {
		return SDL_Vulkan_CreateSurface.HANDLE;
	}

	public static MemorySegment SDL_Vulkan_CreateSurface$address() {
		return SDL_Vulkan_CreateSurface.ADDR;
	}

	public static boolean SDL_Vulkan_CreateSurface(MemorySegment window, MemorySegment instance, MemorySegment allocator, MemorySegment surface) {
		var mh$ = SDL_Vulkan_CreateSurface.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_Vulkan_CreateSurface", window, instance, allocator, surface);
			}
			return (boolean) mh$.invokeExact(window, instance, allocator, surface);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_Vulkan_DestroySurface {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_Vulkan_DestroySurface");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_Vulkan_DestroySurface$descriptor() {
		return SDL_Vulkan_DestroySurface.DESC;
	}

	public static MethodHandle SDL_Vulkan_DestroySurface$handle() {
		return SDL_Vulkan_DestroySurface.HANDLE;
	}

	public static MemorySegment SDL_Vulkan_DestroySurface$address() {
		return SDL_Vulkan_DestroySurface.ADDR;
	}

	public static void SDL_Vulkan_DestroySurface(MemorySegment instance, MemorySegment surface, MemorySegment allocator) {
		var mh$ = SDL_Vulkan_DestroySurface.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_Vulkan_DestroySurface", instance, surface, allocator);
			}
			mh$.invokeExact(instance, surface, allocator);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_Vulkan_GetPresentationSupport {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_Vulkan_GetPresentationSupport");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_Vulkan_GetPresentationSupport$descriptor() {
		return SDL_Vulkan_GetPresentationSupport.DESC;
	}

	public static MethodHandle SDL_Vulkan_GetPresentationSupport$handle() {
		return SDL_Vulkan_GetPresentationSupport.HANDLE;
	}

	public static MemorySegment SDL_Vulkan_GetPresentationSupport$address() {
		return SDL_Vulkan_GetPresentationSupport.ADDR;
	}

	public static boolean SDL_Vulkan_GetPresentationSupport(MemorySegment instance, MemorySegment physicalDevice, int queueFamilyIndex) {
		var mh$ = SDL_Vulkan_GetPresentationSupport.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_Vulkan_GetPresentationSupport", instance, physicalDevice, queueFamilyIndex);
			}
			return (boolean) mh$.invokeExact(instance, physicalDevice, queueFamilyIndex);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static final long SDL_SIZE_MAX = -1L;

	public static long SDL_SIZE_MAX() {
		return SDL_SIZE_MAX;
	}

	private static final byte SDL_MAX_SINT8 = (byte) 127L;

	public static byte SDL_MAX_SINT8() {
		return SDL_MAX_SINT8;
	}

	private static final byte SDL_MIN_SINT8 = (byte) -128L;

	public static byte SDL_MIN_SINT8() {
		return SDL_MIN_SINT8;
	}

	private static final byte SDL_MAX_UINT8 = (byte) 255L;

	public static byte SDL_MAX_UINT8() {
		return SDL_MAX_UINT8;
	}

	private static final byte SDL_MIN_UINT8 = (byte) 0L;

	public static byte SDL_MIN_UINT8() {
		return SDL_MIN_UINT8;
	}

	private static final short SDL_MAX_SINT16 = (short) 32767L;

	public static short SDL_MAX_SINT16() {
		return SDL_MAX_SINT16;
	}

	private static final short SDL_MIN_SINT16 = (short) -32768L;

	public static short SDL_MIN_SINT16() {
		return SDL_MIN_SINT16;
	}

	private static final short SDL_MAX_UINT16 = (short) 65535L;

	public static short SDL_MAX_UINT16() {
		return SDL_MAX_UINT16;
	}

	private static final short SDL_MIN_UINT16 = (short) 0L;

	public static short SDL_MIN_UINT16() {
		return SDL_MIN_UINT16;
	}

	private static final int SDL_MAX_SINT32 = (int) 2147483647L;

	public static int SDL_MAX_SINT32() {
		return SDL_MAX_SINT32;
	}

	private static final int SDL_MIN_SINT32 = (int) -2147483648L;

	public static int SDL_MIN_SINT32() {
		return SDL_MIN_SINT32;
	}

	private static final int SDL_MAX_UINT32 = (int) 4294967295L;

	public static int SDL_MAX_UINT32() {
		return SDL_MAX_UINT32;
	}

	private static final int SDL_MIN_UINT32 = (int) 0L;

	public static int SDL_MIN_UINT32() {
		return SDL_MIN_UINT32;
	}

	private static final long SDL_MAX_SINT64 = 9223372036854775807L;

	public static long SDL_MAX_SINT64() {
		return SDL_MAX_SINT64;
	}

	private static final long SDL_MIN_SINT64 = -9223372036854775808L;

	public static long SDL_MIN_SINT64() {
		return SDL_MIN_SINT64;
	}

	private static final long SDL_MAX_UINT64 = -1L;

	public static long SDL_MAX_UINT64() {
		return SDL_MAX_UINT64;
	}

	private static final long SDL_MIN_UINT64 = 0L;

	public static long SDL_MIN_UINT64() {
		return SDL_MIN_UINT64;
	}

	private static final long SDL_MAX_TIME = 9223372036854775807L;

	public static long SDL_MAX_TIME() {
		return SDL_MAX_TIME;
	}

	private static final long SDL_MIN_TIME = -9223372036854775808L;

	public static long SDL_MIN_TIME() {
		return SDL_MIN_TIME;
	}

	private static final float SDL_FLT_EPSILON = 1.1920928955078125E-7f;

	public static float SDL_FLT_EPSILON() {
		return SDL_FLT_EPSILON;
	}

	public static MemorySegment SDL_PRIs64() {
		class Holder {
			static final MemorySegment SDL_PRIs64
					= SDL3.LIBRARY_ARENA.allocateFrom("ld");
		}
		return Holder.SDL_PRIs64;
	}

	public static MemorySegment SDL_PRIu64() {
		class Holder {
			static final MemorySegment SDL_PRIu64
					= SDL3.LIBRARY_ARENA.allocateFrom("lu");
		}
		return Holder.SDL_PRIu64;
	}

	public static MemorySegment SDL_PRIx64() {
		class Holder {
			static final MemorySegment SDL_PRIx64
					= SDL3.LIBRARY_ARENA.allocateFrom("lx");
		}
		return Holder.SDL_PRIx64;
	}

	public static MemorySegment SDL_PRIX64() {
		class Holder {
			static final MemorySegment SDL_PRIX64
					= SDL3.LIBRARY_ARENA.allocateFrom("lX");
		}
		return Holder.SDL_PRIX64;
	}

	public static MemorySegment SDL_PRIs32() {
		class Holder {
			static final MemorySegment SDL_PRIs32
					= SDL3.LIBRARY_ARENA.allocateFrom("d");
		}
		return Holder.SDL_PRIs32;
	}

	public static MemorySegment SDL_PRIu32() {
		class Holder {
			static final MemorySegment SDL_PRIu32
					= SDL3.LIBRARY_ARENA.allocateFrom("u");
		}
		return Holder.SDL_PRIu32;
	}

	public static MemorySegment SDL_PRIx32() {
		class Holder {
			static final MemorySegment SDL_PRIx32
					= SDL3.LIBRARY_ARENA.allocateFrom("x");
		}
		return Holder.SDL_PRIx32;
	}

	public static MemorySegment SDL_PRIX32() {
		class Holder {
			static final MemorySegment SDL_PRIX32
					= SDL3.LIBRARY_ARENA.allocateFrom("X");
		}
		return Holder.SDL_PRIX32;
	}

	public static MemorySegment SDL_PRILL_PREFIX() {
		class Holder {
			static final MemorySegment SDL_PRILL_PREFIX
					= SDL3.LIBRARY_ARENA.allocateFrom("ll");
		}
		return Holder.SDL_PRILL_PREFIX;
	}

	public static MemorySegment SDL_PRILLd() {
		class Holder {
			static final MemorySegment SDL_PRILLd
					= SDL3.LIBRARY_ARENA.allocateFrom("lld");
		}
		return Holder.SDL_PRILLd;
	}

	public static MemorySegment SDL_PRILLu() {
		class Holder {
			static final MemorySegment SDL_PRILLu
					= SDL3.LIBRARY_ARENA.allocateFrom("llu");
		}
		return Holder.SDL_PRILLu;
	}

	public static MemorySegment SDL_PRILLx() {
		class Holder {
			static final MemorySegment SDL_PRILLx
					= SDL3.LIBRARY_ARENA.allocateFrom("llx");
		}
		return Holder.SDL_PRILLx;
	}

	public static MemorySegment SDL_PRILLX() {
		class Holder {
			static final MemorySegment SDL_PRILLX
					= SDL3.LIBRARY_ARENA.allocateFrom("llX");
		}
		return Holder.SDL_PRILLX;
	}

	private static final double SDL_PI_D = 3.141592653589793d;

	public static double SDL_PI_D() {
		return SDL_PI_D;
	}

	private static final float SDL_PI_F = 3.1415927410125732f;

	public static float SDL_PI_F() {
		return SDL_PI_F;
	}

	private static final long SDL_ICONV_ERROR = -1L;

	public static long SDL_ICONV_ERROR() {
		return SDL_ICONV_ERROR;
	}

	private static final long SDL_ICONV_E2BIG = -2L;

	public static long SDL_ICONV_E2BIG() {
		return SDL_ICONV_E2BIG;
	}

	private static final long SDL_ICONV_EILSEQ = -3L;

	public static long SDL_ICONV_EILSEQ() {
		return SDL_ICONV_EILSEQ;
	}

	private static final long SDL_ICONV_EINVAL = -4L;

	public static long SDL_ICONV_EINVAL() {
		return SDL_ICONV_EINVAL;
	}

	public static MemorySegment SDL_FILE() {
		class Holder {
			static final MemorySegment SDL_FILE
					= SDL3.LIBRARY_ARENA.allocateFrom("jextract$macro.h");
		}
		return Holder.SDL_FILE;
	}

	public static MemorySegment SDL_ASSERT_FILE() {
		class Holder {
			static final MemorySegment SDL_ASSERT_FILE
					= SDL3.LIBRARY_ARENA.allocateFrom("jextract$macro.h");
		}
		return Holder.SDL_ASSERT_FILE;
	}

	private static final int SDL_LINE = (int) 403L;

	public static int SDL_LINE() {
		return SDL_LINE;
	}

	private static final int SDL_NULL_WHILE_LOOP_CONDITION = (int) 0L;

	public static int SDL_NULL_WHILE_LOOP_CONDITION() {
		return SDL_NULL_WHILE_LOOP_CONDITION;
	}

	private static final int SDL_BYTEORDER = (int) 1234L;

	public static int SDL_BYTEORDER() {
		return SDL_BYTEORDER;
	}

	private static final int SDL_FLOATWORDORDER = (int) 1234L;

	public static int SDL_FLOATWORDORDER() {
		return SDL_FLOATWORDORDER;
	}

	public static MemorySegment SDL_PROP_NAME_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_NAME_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.name");
		}
		return Holder.SDL_PROP_NAME_STRING;
	}

	private static final MemorySegment SDL_BeginThreadFunction = MemorySegment.ofAddress(0L);

	public static MemorySegment SDL_BeginThreadFunction() {
		return SDL_BeginThreadFunction;
	}

	private static final MemorySegment SDL_EndThreadFunction = MemorySegment.ofAddress(0L);

	public static MemorySegment SDL_EndThreadFunction() {
		return SDL_EndThreadFunction;
	}

	public static MemorySegment SDL_PROP_THREAD_CREATE_ENTRY_FUNCTION_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_THREAD_CREATE_ENTRY_FUNCTION_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.thread.create.entry_function");
		}
		return Holder.SDL_PROP_THREAD_CREATE_ENTRY_FUNCTION_POINTER;
	}

	public static MemorySegment SDL_PROP_THREAD_CREATE_NAME_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_THREAD_CREATE_NAME_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.thread.create.name");
		}
		return Holder.SDL_PROP_THREAD_CREATE_NAME_STRING;
	}

	public static MemorySegment SDL_PROP_THREAD_CREATE_USERDATA_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_THREAD_CREATE_USERDATA_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.thread.create.userdata");
		}
		return Holder.SDL_PROP_THREAD_CREATE_USERDATA_POINTER;
	}

	public static MemorySegment SDL_PROP_THREAD_CREATE_STACKSIZE_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_THREAD_CREATE_STACKSIZE_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.thread.create.stacksize");
		}
		return Holder.SDL_PROP_THREAD_CREATE_STACKSIZE_NUMBER;
	}

	public static MemorySegment SDL_PROP_IOSTREAM_WINDOWS_HANDLE_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_IOSTREAM_WINDOWS_HANDLE_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.iostream.windows.handle");
		}
		return Holder.SDL_PROP_IOSTREAM_WINDOWS_HANDLE_POINTER;
	}

	public static MemorySegment SDL_PROP_IOSTREAM_STDIO_FILE_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_IOSTREAM_STDIO_FILE_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.iostream.stdio.file");
		}
		return Holder.SDL_PROP_IOSTREAM_STDIO_FILE_POINTER;
	}

	public static MemorySegment SDL_PROP_IOSTREAM_FILE_DESCRIPTOR_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_IOSTREAM_FILE_DESCRIPTOR_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.iostream.file_descriptor");
		}
		return Holder.SDL_PROP_IOSTREAM_FILE_DESCRIPTOR_NUMBER;
	}

	public static MemorySegment SDL_PROP_IOSTREAM_ANDROID_AASSET_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_IOSTREAM_ANDROID_AASSET_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.iostream.android.aasset");
		}
		return Holder.SDL_PROP_IOSTREAM_ANDROID_AASSET_POINTER;
	}

	public static MemorySegment SDL_PROP_IOSTREAM_MEMORY_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_IOSTREAM_MEMORY_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.iostream.memory.base");
		}
		return Holder.SDL_PROP_IOSTREAM_MEMORY_POINTER;
	}

	public static MemorySegment SDL_PROP_IOSTREAM_MEMORY_SIZE_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_IOSTREAM_MEMORY_SIZE_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.iostream.memory.size");
		}
		return Holder.SDL_PROP_IOSTREAM_MEMORY_SIZE_NUMBER;
	}

	public static MemorySegment SDL_PROP_IOSTREAM_MEMORY_FREE_FUNC_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_IOSTREAM_MEMORY_FREE_FUNC_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.iostream.memory.free");
		}
		return Holder.SDL_PROP_IOSTREAM_MEMORY_FREE_FUNC_POINTER;
	}

	public static MemorySegment SDL_PROP_IOSTREAM_DYNAMIC_MEMORY_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_IOSTREAM_DYNAMIC_MEMORY_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.iostream.dynamic.memory");
		}
		return Holder.SDL_PROP_IOSTREAM_DYNAMIC_MEMORY_POINTER;
	}

	public static MemorySegment SDL_PROP_IOSTREAM_DYNAMIC_CHUNKSIZE_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_IOSTREAM_DYNAMIC_CHUNKSIZE_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.iostream.dynamic.chunksize");
		}
		return Holder.SDL_PROP_IOSTREAM_DYNAMIC_CHUNKSIZE_NUMBER;
	}

	private static final int SDL_AUDIO_MASK_BITSIZE = (int) 255L;

	public static int SDL_AUDIO_MASK_BITSIZE() {
		return SDL_AUDIO_MASK_BITSIZE;
	}

	private static final int SDL_AUDIO_MASK_FLOAT = (int) 256L;

	public static int SDL_AUDIO_MASK_FLOAT() {
		return SDL_AUDIO_MASK_FLOAT;
	}

	private static final int SDL_AUDIO_MASK_BIG_ENDIAN = (int) 4096L;

	public static int SDL_AUDIO_MASK_BIG_ENDIAN() {
		return SDL_AUDIO_MASK_BIG_ENDIAN;
	}

	private static final int SDL_AUDIO_MASK_SIGNED = (int) 32768L;

	public static int SDL_AUDIO_MASK_SIGNED() {
		return SDL_AUDIO_MASK_SIGNED;
	}

	private static final int SDL_AUDIO_DEVICE_DEFAULT_PLAYBACK = (int) 4294967295L;

	public static int SDL_AUDIO_DEVICE_DEFAULT_PLAYBACK() {
		return SDL_AUDIO_DEVICE_DEFAULT_PLAYBACK;
	}

	private static final int SDL_AUDIO_DEVICE_DEFAULT_RECORDING = (int) 4294967294L;

	public static int SDL_AUDIO_DEVICE_DEFAULT_RECORDING() {
		return SDL_AUDIO_DEVICE_DEFAULT_RECORDING;
	}

	public static MemorySegment SDL_PROP_AUDIOSTREAM_AUTO_CLEANUP_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_AUDIOSTREAM_AUTO_CLEANUP_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.audiostream.auto_cleanup");
		}
		return Holder.SDL_PROP_AUDIOSTREAM_AUTO_CLEANUP_BOOLEAN;
	}

	private static final int SDL_BLENDMODE_NONE = (int) 0L;

	public static int SDL_BLENDMODE_NONE() {
		return SDL_BLENDMODE_NONE;
	}

	private static final int SDL_BLENDMODE_BLEND = (int) 1L;

	public static int SDL_BLENDMODE_BLEND() {
		return SDL_BLENDMODE_BLEND;
	}

	private static final int SDL_BLENDMODE_BLEND_PREMULTIPLIED = (int) 16L;

	public static int SDL_BLENDMODE_BLEND_PREMULTIPLIED() {
		return SDL_BLENDMODE_BLEND_PREMULTIPLIED;
	}

	private static final int SDL_BLENDMODE_ADD = (int) 2L;

	public static int SDL_BLENDMODE_ADD() {
		return SDL_BLENDMODE_ADD;
	}

	private static final int SDL_BLENDMODE_ADD_PREMULTIPLIED = (int) 32L;

	public static int SDL_BLENDMODE_ADD_PREMULTIPLIED() {
		return SDL_BLENDMODE_ADD_PREMULTIPLIED;
	}

	private static final int SDL_BLENDMODE_MOD = (int) 4L;

	public static int SDL_BLENDMODE_MOD() {
		return SDL_BLENDMODE_MOD;
	}

	private static final int SDL_BLENDMODE_MUL = (int) 8L;

	public static int SDL_BLENDMODE_MUL() {
		return SDL_BLENDMODE_MUL;
	}

	private static final int SDL_BLENDMODE_INVALID = (int) 2147483647L;

	public static int SDL_BLENDMODE_INVALID() {
		return SDL_BLENDMODE_INVALID;
	}

	private static final float SDL_ALPHA_OPAQUE_FLOAT = 1.0f;

	public static float SDL_ALPHA_OPAQUE_FLOAT() {
		return SDL_ALPHA_OPAQUE_FLOAT;
	}

	private static final float SDL_ALPHA_TRANSPARENT_FLOAT = 0.0f;

	public static float SDL_ALPHA_TRANSPARENT_FLOAT() {
		return SDL_ALPHA_TRANSPARENT_FLOAT;
	}

	private static final int SDL_SURFACE_PREALLOCATED = (int) 1L;

	public static int SDL_SURFACE_PREALLOCATED() {
		return SDL_SURFACE_PREALLOCATED;
	}

	private static final int SDL_SURFACE_LOCK_NEEDED = (int) 2L;

	public static int SDL_SURFACE_LOCK_NEEDED() {
		return SDL_SURFACE_LOCK_NEEDED;
	}

	private static final int SDL_SURFACE_LOCKED = (int) 4L;

	public static int SDL_SURFACE_LOCKED() {
		return SDL_SURFACE_LOCKED;
	}

	private static final int SDL_SURFACE_SIMD_ALIGNED = (int) 8L;

	public static int SDL_SURFACE_SIMD_ALIGNED() {
		return SDL_SURFACE_SIMD_ALIGNED;
	}

	public static MemorySegment SDL_PROP_SURFACE_SDR_WHITE_POINT_FLOAT() {
		class Holder {
			static final MemorySegment SDL_PROP_SURFACE_SDR_WHITE_POINT_FLOAT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.surface.SDR_white_point");
		}
		return Holder.SDL_PROP_SURFACE_SDR_WHITE_POINT_FLOAT;
	}

	public static MemorySegment SDL_PROP_SURFACE_HDR_HEADROOM_FLOAT() {
		class Holder {
			static final MemorySegment SDL_PROP_SURFACE_HDR_HEADROOM_FLOAT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.surface.HDR_headroom");
		}
		return Holder.SDL_PROP_SURFACE_HDR_HEADROOM_FLOAT;
	}

	public static MemorySegment SDL_PROP_SURFACE_TONEMAP_OPERATOR_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_SURFACE_TONEMAP_OPERATOR_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.surface.tonemap");
		}
		return Holder.SDL_PROP_SURFACE_TONEMAP_OPERATOR_STRING;
	}

	public static MemorySegment SDL_PROP_SURFACE_HOTSPOT_X_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_SURFACE_HOTSPOT_X_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.surface.hotspot.x");
		}
		return Holder.SDL_PROP_SURFACE_HOTSPOT_X_NUMBER;
	}

	public static MemorySegment SDL_PROP_SURFACE_HOTSPOT_Y_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_SURFACE_HOTSPOT_Y_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.surface.hotspot.y");
		}
		return Holder.SDL_PROP_SURFACE_HOTSPOT_Y_NUMBER;
	}

	public static MemorySegment SDL_PROP_SURFACE_ROTATION_FLOAT() {
		class Holder {
			static final MemorySegment SDL_PROP_SURFACE_ROTATION_FLOAT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.surface.rotation");
		}
		return Holder.SDL_PROP_SURFACE_ROTATION_FLOAT;
	}

	public static MemorySegment SDL_PROP_GLOBAL_VIDEO_WAYLAND_WL_DISPLAY_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_GLOBAL_VIDEO_WAYLAND_WL_DISPLAY_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.video.wayland.wl_display");
		}
		return Holder.SDL_PROP_GLOBAL_VIDEO_WAYLAND_WL_DISPLAY_POINTER;
	}

	private static final long SDL_WINDOW_FULLSCREEN = 1L;

	public static long SDL_WINDOW_FULLSCREEN() {
		return SDL_WINDOW_FULLSCREEN;
	}

	private static final long SDL_WINDOW_OPENGL = 2L;

	public static long SDL_WINDOW_OPENGL() {
		return SDL_WINDOW_OPENGL;
	}

	private static final long SDL_WINDOW_OCCLUDED = 4L;

	public static long SDL_WINDOW_OCCLUDED() {
		return SDL_WINDOW_OCCLUDED;
	}

	private static final long SDL_WINDOW_HIDDEN = 8L;

	public static long SDL_WINDOW_HIDDEN() {
		return SDL_WINDOW_HIDDEN;
	}

	private static final long SDL_WINDOW_BORDERLESS = 16L;

	public static long SDL_WINDOW_BORDERLESS() {
		return SDL_WINDOW_BORDERLESS;
	}

	private static final long SDL_WINDOW_RESIZABLE = 32L;

	public static long SDL_WINDOW_RESIZABLE() {
		return SDL_WINDOW_RESIZABLE;
	}

	private static final long SDL_WINDOW_MINIMIZED = 64L;

	public static long SDL_WINDOW_MINIMIZED() {
		return SDL_WINDOW_MINIMIZED;
	}

	private static final long SDL_WINDOW_MAXIMIZED = 128L;

	public static long SDL_WINDOW_MAXIMIZED() {
		return SDL_WINDOW_MAXIMIZED;
	}

	private static final long SDL_WINDOW_MOUSE_GRABBED = 256L;

	public static long SDL_WINDOW_MOUSE_GRABBED() {
		return SDL_WINDOW_MOUSE_GRABBED;
	}

	private static final long SDL_WINDOW_INPUT_FOCUS = 512L;

	public static long SDL_WINDOW_INPUT_FOCUS() {
		return SDL_WINDOW_INPUT_FOCUS;
	}

	private static final long SDL_WINDOW_MOUSE_FOCUS = 1024L;

	public static long SDL_WINDOW_MOUSE_FOCUS() {
		return SDL_WINDOW_MOUSE_FOCUS;
	}

	private static final long SDL_WINDOW_EXTERNAL = 2048L;

	public static long SDL_WINDOW_EXTERNAL() {
		return SDL_WINDOW_EXTERNAL;
	}

	private static final long SDL_WINDOW_MODAL = 4096L;

	public static long SDL_WINDOW_MODAL() {
		return SDL_WINDOW_MODAL;
	}

	private static final long SDL_WINDOW_HIGH_PIXEL_DENSITY = 8192L;

	public static long SDL_WINDOW_HIGH_PIXEL_DENSITY() {
		return SDL_WINDOW_HIGH_PIXEL_DENSITY;
	}

	private static final long SDL_WINDOW_MOUSE_CAPTURE = 16384L;

	public static long SDL_WINDOW_MOUSE_CAPTURE() {
		return SDL_WINDOW_MOUSE_CAPTURE;
	}

	private static final long SDL_WINDOW_MOUSE_RELATIVE_MODE = 32768L;

	public static long SDL_WINDOW_MOUSE_RELATIVE_MODE() {
		return SDL_WINDOW_MOUSE_RELATIVE_MODE;
	}

	private static final long SDL_WINDOW_ALWAYS_ON_TOP = 65536L;

	public static long SDL_WINDOW_ALWAYS_ON_TOP() {
		return SDL_WINDOW_ALWAYS_ON_TOP;
	}

	private static final long SDL_WINDOW_UTILITY = 131072L;

	public static long SDL_WINDOW_UTILITY() {
		return SDL_WINDOW_UTILITY;
	}

	private static final long SDL_WINDOW_TOOLTIP = 262144L;

	public static long SDL_WINDOW_TOOLTIP() {
		return SDL_WINDOW_TOOLTIP;
	}

	private static final long SDL_WINDOW_POPUP_MENU = 524288L;

	public static long SDL_WINDOW_POPUP_MENU() {
		return SDL_WINDOW_POPUP_MENU;
	}

	private static final long SDL_WINDOW_KEYBOARD_GRABBED = 1048576L;

	public static long SDL_WINDOW_KEYBOARD_GRABBED() {
		return SDL_WINDOW_KEYBOARD_GRABBED;
	}

	private static final long SDL_WINDOW_FILL_DOCUMENT = 2097152L;

	public static long SDL_WINDOW_FILL_DOCUMENT() {
		return SDL_WINDOW_FILL_DOCUMENT;
	}

	private static final long SDL_WINDOW_VULKAN = 268435456L;

	public static long SDL_WINDOW_VULKAN() {
		return SDL_WINDOW_VULKAN;
	}

	private static final long SDL_WINDOW_METAL = 536870912L;

	public static long SDL_WINDOW_METAL() {
		return SDL_WINDOW_METAL;
	}

	private static final long SDL_WINDOW_TRANSPARENT = 1073741824L;

	public static long SDL_WINDOW_TRANSPARENT() {
		return SDL_WINDOW_TRANSPARENT;
	}

	private static final long SDL_WINDOW_NOT_FOCUSABLE = 2147483648L;

	public static long SDL_WINDOW_NOT_FOCUSABLE() {
		return SDL_WINDOW_NOT_FOCUSABLE;
	}

	private static final int SDL_WINDOWPOS_UNDEFINED_MASK = (int) 536805376L;

	public static int SDL_WINDOWPOS_UNDEFINED_MASK() {
		return SDL_WINDOWPOS_UNDEFINED_MASK;
	}

	private static final int SDL_WINDOWPOS_UNDEFINED = (int) 536805376L;

	public static int SDL_WINDOWPOS_UNDEFINED() {
		return SDL_WINDOWPOS_UNDEFINED;
	}

	private static final int SDL_WINDOWPOS_CENTERED_MASK = (int) 805240832L;

	public static int SDL_WINDOWPOS_CENTERED_MASK() {
		return SDL_WINDOWPOS_CENTERED_MASK;
	}

	private static final int SDL_WINDOWPOS_CENTERED = (int) 805240832L;

	public static int SDL_WINDOWPOS_CENTERED() {
		return SDL_WINDOWPOS_CENTERED;
	}

	public static MemorySegment SDL_PROP_DISPLAY_HDR_ENABLED_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_DISPLAY_HDR_ENABLED_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.display.HDR_enabled");
		}
		return Holder.SDL_PROP_DISPLAY_HDR_ENABLED_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_DISPLAY_KMSDRM_PANEL_ORIENTATION_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_DISPLAY_KMSDRM_PANEL_ORIENTATION_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.display.KMSDRM.panel_orientation");
		}
		return Holder.SDL_PROP_DISPLAY_KMSDRM_PANEL_ORIENTATION_NUMBER;
	}

	public static MemorySegment SDL_PROP_DISPLAY_WAYLAND_WL_OUTPUT_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_DISPLAY_WAYLAND_WL_OUTPUT_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.display.wayland.wl_output");
		}
		return Holder.SDL_PROP_DISPLAY_WAYLAND_WL_OUTPUT_POINTER;
	}

	public static MemorySegment SDL_PROP_DISPLAY_WINDOWS_HMONITOR_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_DISPLAY_WINDOWS_HMONITOR_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.display.windows.hmonitor");
		}
		return Holder.SDL_PROP_DISPLAY_WINDOWS_HMONITOR_POINTER;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_ALWAYS_ON_TOP_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_ALWAYS_ON_TOP_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.always_on_top");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_ALWAYS_ON_TOP_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_BORDERLESS_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_BORDERLESS_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.borderless");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_BORDERLESS_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_CONSTRAIN_POPUP_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_CONSTRAIN_POPUP_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.constrain_popup");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_CONSTRAIN_POPUP_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_FOCUSABLE_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_FOCUSABLE_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.focusable");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_FOCUSABLE_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_EXTERNAL_GRAPHICS_CONTEXT_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_EXTERNAL_GRAPHICS_CONTEXT_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.external_graphics_context");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_EXTERNAL_GRAPHICS_CONTEXT_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_FLAGS_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_FLAGS_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.flags");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_FLAGS_NUMBER;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_FULLSCREEN_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_FULLSCREEN_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.fullscreen");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_FULLSCREEN_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_HEIGHT_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_HEIGHT_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.height");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_HEIGHT_NUMBER;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_HIDDEN_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_HIDDEN_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.hidden");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_HIDDEN_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_HIGH_PIXEL_DENSITY_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_HIGH_PIXEL_DENSITY_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.high_pixel_density");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_HIGH_PIXEL_DENSITY_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_MAXIMIZED_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_MAXIMIZED_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.maximized");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_MAXIMIZED_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_MENU_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_MENU_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.menu");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_MENU_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_METAL_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_METAL_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.metal");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_METAL_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_MINIMIZED_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_MINIMIZED_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.minimized");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_MINIMIZED_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_MODAL_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_MODAL_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.modal");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_MODAL_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_MOUSE_GRABBED_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_MOUSE_GRABBED_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.mouse_grabbed");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_MOUSE_GRABBED_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_OPENGL_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_OPENGL_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.opengl");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_OPENGL_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_PARENT_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_PARENT_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.parent");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_PARENT_POINTER;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_RESIZABLE_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_RESIZABLE_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.resizable");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_RESIZABLE_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_TITLE_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_TITLE_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.title");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_TITLE_STRING;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_TRANSPARENT_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_TRANSPARENT_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.transparent");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_TRANSPARENT_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_TOOLTIP_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_TOOLTIP_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.tooltip");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_TOOLTIP_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_UTILITY_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_UTILITY_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.utility");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_UTILITY_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_VULKAN_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_VULKAN_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.vulkan");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_VULKAN_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_WIDTH_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_WIDTH_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.width");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_WIDTH_NUMBER;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_X_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_X_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.x");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_X_NUMBER;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_Y_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_Y_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.y");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_Y_NUMBER;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_COCOA_WINDOW_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_COCOA_WINDOW_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.cocoa.window");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_COCOA_WINDOW_POINTER;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_COCOA_VIEW_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_COCOA_VIEW_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.cocoa.view");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_COCOA_VIEW_POINTER;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_WINDOWSCENE_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_WINDOWSCENE_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.uikit.windowscene");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_WINDOWSCENE_POINTER;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_WAYLAND_SURFACE_ROLE_CUSTOM_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_WAYLAND_SURFACE_ROLE_CUSTOM_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.wayland.surface_role_custom");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_WAYLAND_SURFACE_ROLE_CUSTOM_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_WAYLAND_CREATE_EGL_WINDOW_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_WAYLAND_CREATE_EGL_WINDOW_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.wayland.create_egl_window");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_WAYLAND_CREATE_EGL_WINDOW_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_WAYLAND_WL_SURFACE_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_WAYLAND_WL_SURFACE_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.wayland.wl_surface");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_WAYLAND_WL_SURFACE_POINTER;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_WIN32_HWND_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_WIN32_HWND_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.win32.hwnd");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_WIN32_HWND_POINTER;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_WIN32_PIXEL_FORMAT_HWND_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_WIN32_PIXEL_FORMAT_HWND_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.win32.pixel_format_hwnd");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_WIN32_PIXEL_FORMAT_HWND_POINTER;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_X11_WINDOW_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_X11_WINDOW_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.x11.window");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_X11_WINDOW_NUMBER;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_EMSCRIPTEN_CANVAS_ID_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_EMSCRIPTEN_CANVAS_ID_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.emscripten.canvas_id");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_EMSCRIPTEN_CANVAS_ID_STRING;
	}

	public static MemorySegment SDL_PROP_WINDOW_CREATE_EMSCRIPTEN_KEYBOARD_ELEMENT_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_CREATE_EMSCRIPTEN_KEYBOARD_ELEMENT_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.create.emscripten.keyboard_element");
		}
		return Holder.SDL_PROP_WINDOW_CREATE_EMSCRIPTEN_KEYBOARD_ELEMENT_STRING;
	}

	public static MemorySegment SDL_PROP_WINDOW_SHAPE_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_SHAPE_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.shape");
		}
		return Holder.SDL_PROP_WINDOW_SHAPE_POINTER;
	}

	public static MemorySegment SDL_PROP_WINDOW_HDR_ENABLED_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_HDR_ENABLED_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.HDR_enabled");
		}
		return Holder.SDL_PROP_WINDOW_HDR_ENABLED_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_WINDOW_SDR_WHITE_LEVEL_FLOAT() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_SDR_WHITE_LEVEL_FLOAT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.SDR_white_level");
		}
		return Holder.SDL_PROP_WINDOW_SDR_WHITE_LEVEL_FLOAT;
	}

	public static MemorySegment SDL_PROP_WINDOW_HDR_HEADROOM_FLOAT() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_HDR_HEADROOM_FLOAT
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.HDR_headroom");
		}
		return Holder.SDL_PROP_WINDOW_HDR_HEADROOM_FLOAT;
	}

	public static MemorySegment SDL_PROP_WINDOW_ANDROID_WINDOW_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_ANDROID_WINDOW_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.android.window");
		}
		return Holder.SDL_PROP_WINDOW_ANDROID_WINDOW_POINTER;
	}

	public static MemorySegment SDL_PROP_WINDOW_ANDROID_SURFACE_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_ANDROID_SURFACE_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.android.surface");
		}
		return Holder.SDL_PROP_WINDOW_ANDROID_SURFACE_POINTER;
	}

	public static MemorySegment SDL_PROP_WINDOW_UIKIT_WINDOW_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_UIKIT_WINDOW_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.uikit.window");
		}
		return Holder.SDL_PROP_WINDOW_UIKIT_WINDOW_POINTER;
	}

	public static MemorySegment SDL_PROP_WINDOW_UIKIT_METAL_VIEW_TAG_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_UIKIT_METAL_VIEW_TAG_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.uikit.metal_view_tag");
		}
		return Holder.SDL_PROP_WINDOW_UIKIT_METAL_VIEW_TAG_NUMBER;
	}

	public static MemorySegment SDL_PROP_WINDOW_UIKIT_OPENGL_FRAMEBUFFER_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_UIKIT_OPENGL_FRAMEBUFFER_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.uikit.opengl.framebuffer");
		}
		return Holder.SDL_PROP_WINDOW_UIKIT_OPENGL_FRAMEBUFFER_NUMBER;
	}

	public static MemorySegment SDL_PROP_WINDOW_UIKIT_OPENGL_RENDERBUFFER_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_UIKIT_OPENGL_RENDERBUFFER_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.uikit.opengl.renderbuffer");
		}
		return Holder.SDL_PROP_WINDOW_UIKIT_OPENGL_RENDERBUFFER_NUMBER;
	}

	public static MemorySegment SDL_PROP_WINDOW_UIKIT_OPENGL_RESOLVE_FRAMEBUFFER_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_UIKIT_OPENGL_RESOLVE_FRAMEBUFFER_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.uikit.opengl.resolve_framebuffer");
		}
		return Holder.SDL_PROP_WINDOW_UIKIT_OPENGL_RESOLVE_FRAMEBUFFER_NUMBER;
	}

	public static MemorySegment SDL_PROP_WINDOW_KMSDRM_DEVICE_INDEX_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_KMSDRM_DEVICE_INDEX_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.kmsdrm.dev_index");
		}
		return Holder.SDL_PROP_WINDOW_KMSDRM_DEVICE_INDEX_NUMBER;
	}

	public static MemorySegment SDL_PROP_WINDOW_KMSDRM_DRM_FD_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_KMSDRM_DRM_FD_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.kmsdrm.drm_fd");
		}
		return Holder.SDL_PROP_WINDOW_KMSDRM_DRM_FD_NUMBER;
	}

	public static MemorySegment SDL_PROP_WINDOW_KMSDRM_GBM_DEVICE_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_KMSDRM_GBM_DEVICE_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.kmsdrm.gbm_dev");
		}
		return Holder.SDL_PROP_WINDOW_KMSDRM_GBM_DEVICE_POINTER;
	}

	public static MemorySegment SDL_PROP_WINDOW_COCOA_WINDOW_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_COCOA_WINDOW_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.cocoa.window");
		}
		return Holder.SDL_PROP_WINDOW_COCOA_WINDOW_POINTER;
	}

	public static MemorySegment SDL_PROP_WINDOW_COCOA_METAL_VIEW_TAG_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_COCOA_METAL_VIEW_TAG_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.cocoa.metal_view_tag");
		}
		return Holder.SDL_PROP_WINDOW_COCOA_METAL_VIEW_TAG_NUMBER;
	}

	public static MemorySegment SDL_PROP_WINDOW_OPENVR_OVERLAY_ID_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_OPENVR_OVERLAY_ID_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.openvr.overlay_id");
		}
		return Holder.SDL_PROP_WINDOW_OPENVR_OVERLAY_ID_NUMBER;
	}

	public static MemorySegment SDL_PROP_WINDOW_VIVANTE_DISPLAY_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_VIVANTE_DISPLAY_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.vivante.display");
		}
		return Holder.SDL_PROP_WINDOW_VIVANTE_DISPLAY_POINTER;
	}

	public static MemorySegment SDL_PROP_WINDOW_VIVANTE_WINDOW_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_VIVANTE_WINDOW_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.vivante.window");
		}
		return Holder.SDL_PROP_WINDOW_VIVANTE_WINDOW_POINTER;
	}

	public static MemorySegment SDL_PROP_WINDOW_VIVANTE_SURFACE_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_VIVANTE_SURFACE_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.vivante.surface");
		}
		return Holder.SDL_PROP_WINDOW_VIVANTE_SURFACE_POINTER;
	}

	public static MemorySegment SDL_PROP_WINDOW_WIN32_HWND_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_WIN32_HWND_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.win32.hwnd");
		}
		return Holder.SDL_PROP_WINDOW_WIN32_HWND_POINTER;
	}

	public static MemorySegment SDL_PROP_WINDOW_WIN32_HDC_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_WIN32_HDC_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.win32.hdc");
		}
		return Holder.SDL_PROP_WINDOW_WIN32_HDC_POINTER;
	}

	public static MemorySegment SDL_PROP_WINDOW_WIN32_INSTANCE_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_WIN32_INSTANCE_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.win32.instance");
		}
		return Holder.SDL_PROP_WINDOW_WIN32_INSTANCE_POINTER;
	}

	public static MemorySegment SDL_PROP_WINDOW_WAYLAND_DISPLAY_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_WAYLAND_DISPLAY_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.wayland.display");
		}
		return Holder.SDL_PROP_WINDOW_WAYLAND_DISPLAY_POINTER;
	}

	public static MemorySegment SDL_PROP_WINDOW_WAYLAND_SURFACE_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_WAYLAND_SURFACE_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.wayland.surface");
		}
		return Holder.SDL_PROP_WINDOW_WAYLAND_SURFACE_POINTER;
	}

	public static MemorySegment SDL_PROP_WINDOW_WAYLAND_VIEWPORT_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_WAYLAND_VIEWPORT_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.wayland.viewport");
		}
		return Holder.SDL_PROP_WINDOW_WAYLAND_VIEWPORT_POINTER;
	}

	public static MemorySegment SDL_PROP_WINDOW_WAYLAND_EGL_WINDOW_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_WAYLAND_EGL_WINDOW_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.wayland.egl_window");
		}
		return Holder.SDL_PROP_WINDOW_WAYLAND_EGL_WINDOW_POINTER;
	}

	public static MemorySegment SDL_PROP_WINDOW_WAYLAND_XDG_SURFACE_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_WAYLAND_XDG_SURFACE_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.wayland.xdg_surface");
		}
		return Holder.SDL_PROP_WINDOW_WAYLAND_XDG_SURFACE_POINTER;
	}

	public static MemorySegment SDL_PROP_WINDOW_WAYLAND_XDG_TOPLEVEL_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_WAYLAND_XDG_TOPLEVEL_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.wayland.xdg_toplevel");
		}
		return Holder.SDL_PROP_WINDOW_WAYLAND_XDG_TOPLEVEL_POINTER;
	}

	public static MemorySegment SDL_PROP_WINDOW_WAYLAND_XDG_TOPLEVEL_EXPORT_HANDLE_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_WAYLAND_XDG_TOPLEVEL_EXPORT_HANDLE_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.wayland.xdg_toplevel_export_handle");
		}
		return Holder.SDL_PROP_WINDOW_WAYLAND_XDG_TOPLEVEL_EXPORT_HANDLE_STRING;
	}

	public static MemorySegment SDL_PROP_WINDOW_WAYLAND_XDG_POPUP_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_WAYLAND_XDG_POPUP_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.wayland.xdg_popup");
		}
		return Holder.SDL_PROP_WINDOW_WAYLAND_XDG_POPUP_POINTER;
	}

	public static MemorySegment SDL_PROP_WINDOW_WAYLAND_XDG_POSITIONER_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_WAYLAND_XDG_POSITIONER_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.wayland.xdg_positioner");
		}
		return Holder.SDL_PROP_WINDOW_WAYLAND_XDG_POSITIONER_POINTER;
	}

	public static MemorySegment SDL_PROP_WINDOW_X11_DISPLAY_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_X11_DISPLAY_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.x11.display");
		}
		return Holder.SDL_PROP_WINDOW_X11_DISPLAY_POINTER;
	}

	public static MemorySegment SDL_PROP_WINDOW_X11_SCREEN_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_X11_SCREEN_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.x11.screen");
		}
		return Holder.SDL_PROP_WINDOW_X11_SCREEN_NUMBER;
	}

	public static MemorySegment SDL_PROP_WINDOW_X11_WINDOW_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_X11_WINDOW_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.x11.window");
		}
		return Holder.SDL_PROP_WINDOW_X11_WINDOW_NUMBER;
	}

	public static MemorySegment SDL_PROP_WINDOW_EMSCRIPTEN_CANVAS_ID_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_EMSCRIPTEN_CANVAS_ID_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.emscripten.canvas_id");
		}
		return Holder.SDL_PROP_WINDOW_EMSCRIPTEN_CANVAS_ID_STRING;
	}

	public static MemorySegment SDL_PROP_WINDOW_EMSCRIPTEN_KEYBOARD_ELEMENT_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_WINDOW_EMSCRIPTEN_KEYBOARD_ELEMENT_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.window.emscripten.keyboard_element");
		}
		return Holder.SDL_PROP_WINDOW_EMSCRIPTEN_KEYBOARD_ELEMENT_STRING;
	}

	private static final int SDL_WINDOW_SURFACE_VSYNC_ADAPTIVE = (int) -1L;

	public static int SDL_WINDOW_SURFACE_VSYNC_ADAPTIVE() {
		return SDL_WINDOW_SURFACE_VSYNC_ADAPTIVE;
	}

	public static MemorySegment SDL_PROP_FILE_DIALOG_FILTERS_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_FILE_DIALOG_FILTERS_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.filedialog.filters");
		}
		return Holder.SDL_PROP_FILE_DIALOG_FILTERS_POINTER;
	}

	public static MemorySegment SDL_PROP_FILE_DIALOG_NFILTERS_NUMBER() {
		class Holder {
			static final MemorySegment SDL_PROP_FILE_DIALOG_NFILTERS_NUMBER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.filedialog.nfilters");
		}
		return Holder.SDL_PROP_FILE_DIALOG_NFILTERS_NUMBER;
	}

	public static MemorySegment SDL_PROP_FILE_DIALOG_WINDOW_POINTER() {
		class Holder {
			static final MemorySegment SDL_PROP_FILE_DIALOG_WINDOW_POINTER
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.filedialog.window");
		}
		return Holder.SDL_PROP_FILE_DIALOG_WINDOW_POINTER;
	}

	public static MemorySegment SDL_PROP_FILE_DIALOG_LOCATION_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_FILE_DIALOG_LOCATION_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.filedialog.location");
		}
		return Holder.SDL_PROP_FILE_DIALOG_LOCATION_STRING;
	}

	public static MemorySegment SDL_PROP_FILE_DIALOG_MANY_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_FILE_DIALOG_MANY_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.filedialog.many");
		}
		return Holder.SDL_PROP_FILE_DIALOG_MANY_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_FILE_DIALOG_TITLE_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_FILE_DIALOG_TITLE_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.filedialog.title");
		}
		return Holder.SDL_PROP_FILE_DIALOG_TITLE_STRING;
	}

	public static MemorySegment SDL_PROP_FILE_DIALOG_ACCEPT_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_FILE_DIALOG_ACCEPT_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.filedialog.accept");
		}
		return Holder.SDL_PROP_FILE_DIALOG_ACCEPT_STRING;
	}

	public static MemorySegment SDL_PROP_FILE_DIALOG_CANCEL_STRING() {
		class Holder {
			static final MemorySegment SDL_PROP_FILE_DIALOG_CANCEL_STRING
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.filedialog.cancel");
		}
		return Holder.SDL_PROP_FILE_DIALOG_CANCEL_STRING;
	}

	public static MemorySegment SDL_ELF_NOTE_DLOPEN_PRIORITY_SUGGESTED() {
		class Holder {
			static final MemorySegment SDL_ELF_NOTE_DLOPEN_PRIORITY_SUGGESTED
					= SDL3.LIBRARY_ARENA.allocateFrom("suggested");
		}
		return Holder.SDL_ELF_NOTE_DLOPEN_PRIORITY_SUGGESTED;
	}

	public static MemorySegment SDL_ELF_NOTE_DLOPEN_PRIORITY_RECOMMENDED() {
		class Holder {
			static final MemorySegment SDL_ELF_NOTE_DLOPEN_PRIORITY_RECOMMENDED
					= SDL3.LIBRARY_ARENA.allocateFrom("recommended");
		}
		return Holder.SDL_ELF_NOTE_DLOPEN_PRIORITY_RECOMMENDED;
	}

	public static MemorySegment SDL_ELF_NOTE_DLOPEN_PRIORITY_REQUIRED() {
		class Holder {
			static final MemorySegment SDL_ELF_NOTE_DLOPEN_PRIORITY_REQUIRED
					= SDL3.LIBRARY_ARENA.allocateFrom("required");
		}
		return Holder.SDL_ELF_NOTE_DLOPEN_PRIORITY_REQUIRED;
	}

	public static MemorySegment SDL_ELF_NOTE_DLOPEN_VENDOR() {
		class Holder {
			static final MemorySegment SDL_ELF_NOTE_DLOPEN_VENDOR
					= SDL3.LIBRARY_ARENA.allocateFrom("FDO");
		}
		return Holder.SDL_ELF_NOTE_DLOPEN_VENDOR;
	}

	private static final int SDL_ELF_NOTE_DLOPEN_TYPE = (int) 1081871370L;

	public static int SDL_ELF_NOTE_DLOPEN_TYPE() {
		return SDL_ELF_NOTE_DLOPEN_TYPE;
	}

	private static final float SDL_STANDARD_GRAVITY = 9.806650161743164f;

	public static float SDL_STANDARD_GRAVITY() {
		return SDL_STANDARD_GRAVITY;
	}

	private static final int SDL_JOYSTICK_AXIS_MIN = (int) -32768L;

	public static int SDL_JOYSTICK_AXIS_MIN() {
		return SDL_JOYSTICK_AXIS_MIN;
	}

	public static MemorySegment SDL_PROP_JOYSTICK_CAP_MONO_LED_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_JOYSTICK_CAP_MONO_LED_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.joystick.cap.mono_led");
		}
		return Holder.SDL_PROP_JOYSTICK_CAP_MONO_LED_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_JOYSTICK_CAP_RGB_LED_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_JOYSTICK_CAP_RGB_LED_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.joystick.cap.rgb_led");
		}
		return Holder.SDL_PROP_JOYSTICK_CAP_RGB_LED_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_JOYSTICK_CAP_PLAYER_LED_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_JOYSTICK_CAP_PLAYER_LED_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.joystick.cap.player_led");
		}
		return Holder.SDL_PROP_JOYSTICK_CAP_PLAYER_LED_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_JOYSTICK_CAP_RUMBLE_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_JOYSTICK_CAP_RUMBLE_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.joystick.cap.rumble");
		}
		return Holder.SDL_PROP_JOYSTICK_CAP_RUMBLE_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_JOYSTICK_CAP_TRIGGER_RUMBLE_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_JOYSTICK_CAP_TRIGGER_RUMBLE_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.joystick.cap.trigger_rumble");
		}
		return Holder.SDL_PROP_JOYSTICK_CAP_TRIGGER_RUMBLE_BOOLEAN;
	}

	private static final int SDL_HAT_CENTERED = (int) 0L;

	public static int SDL_HAT_CENTERED() {
		return SDL_HAT_CENTERED;
	}

	private static final int SDL_HAT_UP = (int) 1L;

	public static int SDL_HAT_UP() {
		return SDL_HAT_UP;
	}

	private static final int SDL_HAT_RIGHT = (int) 2L;

	public static int SDL_HAT_RIGHT() {
		return SDL_HAT_RIGHT;
	}

	private static final int SDL_HAT_DOWN = (int) 4L;

	public static int SDL_HAT_DOWN() {
		return SDL_HAT_DOWN;
	}

	private static final int SDL_HAT_LEFT = (int) 8L;

	public static int SDL_HAT_LEFT() {
		return SDL_HAT_LEFT;
	}

	private static final int SDL_HAT_RIGHTUP = (int) 3L;

	public static int SDL_HAT_RIGHTUP() {
		return SDL_HAT_RIGHTUP;
	}

	private static final int SDL_HAT_RIGHTDOWN = (int) 6L;

	public static int SDL_HAT_RIGHTDOWN() {
		return SDL_HAT_RIGHTDOWN;
	}

	private static final int SDL_HAT_LEFTUP = (int) 9L;

	public static int SDL_HAT_LEFTUP() {
		return SDL_HAT_LEFTUP;
	}

	private static final int SDL_HAT_LEFTDOWN = (int) 12L;

	public static int SDL_HAT_LEFTDOWN() {
		return SDL_HAT_LEFTDOWN;
	}

	public static MemorySegment SDL_PROP_GAMEPAD_CAP_MONO_LED_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_GAMEPAD_CAP_MONO_LED_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.joystick.cap.mono_led");
		}
		return Holder.SDL_PROP_GAMEPAD_CAP_MONO_LED_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_GAMEPAD_CAP_RGB_LED_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_GAMEPAD_CAP_RGB_LED_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.joystick.cap.rgb_led");
		}
		return Holder.SDL_PROP_GAMEPAD_CAP_RGB_LED_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_GAMEPAD_CAP_PLAYER_LED_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_GAMEPAD_CAP_PLAYER_LED_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.joystick.cap.player_led");
		}
		return Holder.SDL_PROP_GAMEPAD_CAP_PLAYER_LED_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_GAMEPAD_CAP_RUMBLE_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_GAMEPAD_CAP_RUMBLE_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.joystick.cap.rumble");
		}
		return Holder.SDL_PROP_GAMEPAD_CAP_RUMBLE_BOOLEAN;
	}

	public static MemorySegment SDL_PROP_GAMEPAD_CAP_TRIGGER_RUMBLE_BOOLEAN() {
		class Holder {
			static final MemorySegment SDL_PROP_GAMEPAD_CAP_TRIGGER_RUMBLE_BOOLEAN
					= SDL3.LIBRARY_ARENA.allocateFrom("SDL.joystick.cap.trigger_rumble");
		}
		return Holder.SDL_PROP_GAMEPAD_CAP_TRIGGER_RUMBLE_BOOLEAN;
	}

	private static final int SDLK_EXTENDED_MASK = (int) 536870912L;

	public static int SDLK_EXTENDED_MASK() {
		return SDLK_EXTENDED_MASK;
	}

	private static final int SDLK_SCANCODE_MASK = (int) 1073741824L;

	public static int SDLK_SCANCODE_MASK() {
		return SDLK_SCANCODE_MASK;
	}

	private static final int SDLK_UNKNOWN = (int) 0L;

	public static int SDLK_UNKNOWN() {
		return SDLK_UNKNOWN;
	}

	private static final int SDLK_RETURN = (int) 13L;

	public static int SDLK_RETURN() {
		return SDLK_RETURN;
	}

	private static final int SDLK_ESCAPE = (int) 27L;

	public static int SDLK_ESCAPE() {
		return SDLK_ESCAPE;
	}

	private static final int SDLK_BACKSPACE = (int) 8L;

	public static int SDLK_BACKSPACE() {
		return SDLK_BACKSPACE;
	}

	private static final int SDLK_TAB = (int) 9L;

	public static int SDLK_TAB() {
		return SDLK_TAB;
	}

	private static final int SDLK_SPACE = (int) 32L;

	public static int SDLK_SPACE() {
		return SDLK_SPACE;
	}

	private static final int SDLK_EXCLAIM = (int) 33L;

	public static int SDLK_EXCLAIM() {
		return SDLK_EXCLAIM;
	}

	private static final int SDLK_DBLAPOSTROPHE = (int) 34L;

	public static int SDLK_DBLAPOSTROPHE() {
		return SDLK_DBLAPOSTROPHE;
	}

	private static final int SDLK_HASH = (int) 35L;

	public static int SDLK_HASH() {
		return SDLK_HASH;
	}

	private static final int SDLK_DOLLAR = (int) 36L;

	public static int SDLK_DOLLAR() {
		return SDLK_DOLLAR;
	}

	private static final int SDLK_PERCENT = (int) 37L;

	public static int SDLK_PERCENT() {
		return SDLK_PERCENT;
	}

	private static final int SDLK_AMPERSAND = (int) 38L;

	public static int SDLK_AMPERSAND() {
		return SDLK_AMPERSAND;
	}

	private static final int SDLK_APOSTROPHE = (int) 39L;

	public static int SDLK_APOSTROPHE() {
		return SDLK_APOSTROPHE;
	}

	private static final int SDLK_LEFTPAREN = (int) 40L;

	public static int SDLK_LEFTPAREN() {
		return SDLK_LEFTPAREN;
	}

	private static final int SDLK_RIGHTPAREN = (int) 41L;

	public static int SDLK_RIGHTPAREN() {
		return SDLK_RIGHTPAREN;
	}

	private static final int SDLK_ASTERISK = (int) 42L;

	public static int SDLK_ASTERISK() {
		return SDLK_ASTERISK;
	}

	private static final int SDLK_PLUS = (int) 43L;

	public static int SDLK_PLUS() {
		return SDLK_PLUS;
	}

	private static final int SDLK_COMMA = (int) 44L;

	public static int SDLK_COMMA() {
		return SDLK_COMMA;
	}

	private static final int SDLK_MINUS = (int) 45L;

	public static int SDLK_MINUS() {
		return SDLK_MINUS;
	}

	private static final int SDLK_PERIOD = (int) 46L;

	public static int SDLK_PERIOD() {
		return SDLK_PERIOD;
	}

	private static final int SDLK_SLASH = (int) 47L;

	public static int SDLK_SLASH() {
		return SDLK_SLASH;
	}

	private static final int SDLK_0 = (int) 48L;

	public static int SDLK_0() {
		return SDLK_0;
	}

	private static final int SDLK_1 = (int) 49L;

	public static int SDLK_1() {
		return SDLK_1;
	}

	private static final int SDLK_2 = (int) 50L;

	public static int SDLK_2() {
		return SDLK_2;
	}

	private static final int SDLK_3 = (int) 51L;

	public static int SDLK_3() {
		return SDLK_3;
	}

	private static final int SDLK_4 = (int) 52L;

	public static int SDLK_4() {
		return SDLK_4;
	}

	private static final int SDLK_5 = (int) 53L;

	public static int SDLK_5() {
		return SDLK_5;
	}

	private static final int SDLK_6 = (int) 54L;

	public static int SDLK_6() {
		return SDLK_6;
	}

	private static final int SDLK_7 = (int) 55L;

	public static int SDLK_7() {
		return SDLK_7;
	}

	private static final int SDLK_8 = (int) 56L;

	public static int SDLK_8() {
		return SDLK_8;
	}

	private static final int SDLK_9 = (int) 57L;

	public static int SDLK_9() {
		return SDLK_9;
	}

	private static final int SDLK_COLON = (int) 58L;

	public static int SDLK_COLON() {
		return SDLK_COLON;
	}

	private static final int SDLK_SEMICOLON = (int) 59L;

	public static int SDLK_SEMICOLON() {
		return SDLK_SEMICOLON;
	}

	private static final int SDLK_LESS = (int) 60L;

	public static int SDLK_LESS() {
		return SDLK_LESS;
	}

	private static final int SDLK_EQUALS = (int) 61L;

	public static int SDLK_EQUALS() {
		return SDLK_EQUALS;
	}

	private static final int SDLK_GREATER = (int) 62L;

	public static int SDLK_GREATER() {
		return SDLK_GREATER;
	}

	private static final int SDLK_QUESTION = (int) 63L;

	public static int SDLK_QUESTION() {
		return SDLK_QUESTION;
	}

	private static final int SDLK_AT = (int) 64L;

	public static int SDLK_AT() {
		return SDLK_AT;
	}

	private static final int SDLK_LEFTBRACKET = (int) 91L;

	public static int SDLK_LEFTBRACKET() {
		return SDLK_LEFTBRACKET;
	}

	private static final int SDLK_BACKSLASH = (int) 92L;

	public static int SDLK_BACKSLASH() {
		return SDLK_BACKSLASH;
	}

	private static final int SDLK_RIGHTBRACKET = (int) 93L;

	public static int SDLK_RIGHTBRACKET() {
		return SDLK_RIGHTBRACKET;
	}

	private static final int SDLK_CARET = (int) 94L;

	public static int SDLK_CARET() {
		return SDLK_CARET;
	}

	private static final int SDLK_UNDERSCORE = (int) 95L;

	public static int SDLK_UNDERSCORE() {
		return SDLK_UNDERSCORE;
	}

	private static final int SDLK_GRAVE = (int) 96L;

	public static int SDLK_GRAVE() {
		return SDLK_GRAVE;
	}

	private static final int SDLK_A = (int) 97L;

	public static int SDLK_A() {
		return SDLK_A;
	}

	private static final int SDLK_B = (int) 98L;

	public static int SDLK_B() {
		return SDLK_B;
	}

	private static final int SDLK_C = (int) 99L;

	public static int SDLK_C() {
		return SDLK_C;
	}

	private static final int SDLK_D = (int) 100L;

	public static int SDLK_D() {
		return SDLK_D;
	}

	private static final int SDLK_E = (int) 101L;

	public static int SDLK_E() {
		return SDLK_E;
	}

	private static final int SDLK_F = (int) 102L;

	public static int SDLK_F() {
		return SDLK_F;
	}

	private static final int SDLK_G = (int) 103L;

	public static int SDLK_G() {
		return SDLK_G;
	}

	private static final int SDLK_H = (int) 104L;

	public static int SDLK_H() {
		return SDLK_H;
	}

	private static final int SDLK_I = (int) 105L;

	public static int SDLK_I() {
		return SDLK_I;
	}

	private static final int SDLK_J = (int) 106L;

	public static int SDLK_J() {
		return SDLK_J;
	}

	private static final int SDLK_K = (int) 107L;

	public static int SDLK_K() {
		return SDLK_K;
	}

	private static final int SDLK_L = (int) 108L;

	public static int SDLK_L() {
		return SDLK_L;
	}

	private static final int SDLK_M = (int) 109L;

	public static int SDLK_M() {
		return SDLK_M;
	}

	private static final int SDLK_N = (int) 110L;

	public static int SDLK_N() {
		return SDLK_N;
	}

	private static final int SDLK_O = (int) 111L;

	public static int SDLK_O() {
		return SDLK_O;
	}

	private static final int SDLK_P = (int) 112L;

	public static int SDLK_P() {
		return SDLK_P;
	}

	private static final int SDLK_Q = (int) 113L;

	public static int SDLK_Q() {
		return SDLK_Q;
	}

	private static final int SDLK_R = (int) 114L;

	public static int SDLK_R() {
		return SDLK_R;
	}

	private static final int SDLK_S = (int) 115L;

	public static int SDLK_S() {
		return SDLK_S;
	}

	private static final int SDLK_T = (int) 116L;

	public static int SDLK_T() {
		return SDLK_T;
	}

	private static final int SDLK_U = (int) 117L;

	public static int SDLK_U() {
		return SDLK_U;
	}

	private static final int SDLK_V = (int) 118L;

	public static int SDLK_V() {
		return SDLK_V;
	}

	private static final int SDLK_W = (int) 119L;

	public static int SDLK_W() {
		return SDLK_W;
	}

	private static final int SDLK_X = (int) 120L;

	public static int SDLK_X() {
		return SDLK_X;
	}

	private static final int SDLK_Y = (int) 121L;

	public static int SDLK_Y() {
		return SDLK_Y;
	}

	private static final int SDLK_Z = (int) 122L;

	public static int SDLK_Z() {
		return SDLK_Z;
	}

	private static final int SDLK_LEFTBRACE = (int) 123L;

	public static int SDLK_LEFTBRACE() {
		return SDLK_LEFTBRACE;
	}

	private static final int SDLK_PIPE = (int) 124L;

	public static int SDLK_PIPE() {
		return SDLK_PIPE;
	}

	private static final int SDLK_RIGHTBRACE = (int) 125L;

	public static int SDLK_RIGHTBRACE() {
		return SDLK_RIGHTBRACE;
	}

	private static final int SDLK_TILDE = (int) 126L;

	public static int SDLK_TILDE() {
		return SDLK_TILDE;
	}

	private static final int SDLK_DELETE = (int) 127L;

	public static int SDLK_DELETE() {
		return SDLK_DELETE;
	}

	private static final int SDLK_PLUSMINUS = (int) 177L;

	public static int SDLK_PLUSMINUS() {
		return SDLK_PLUSMINUS;
	}

	private static final int SDLK_CAPSLOCK = (int) 1073741881L;

	public static int SDLK_CAPSLOCK() {
		return SDLK_CAPSLOCK;
	}

	private static final int SDLK_F1 = (int) 1073741882L;

	public static int SDLK_F1() {
		return SDLK_F1;
	}

	private static final int SDLK_F2 = (int) 1073741883L;

	public static int SDLK_F2() {
		return SDLK_F2;
	}

	private static final int SDLK_F3 = (int) 1073741884L;

	public static int SDLK_F3() {
		return SDLK_F3;
	}

	private static final int SDLK_F4 = (int) 1073741885L;

	public static int SDLK_F4() {
		return SDLK_F4;
	}

	private static final int SDLK_F5 = (int) 1073741886L;

	public static int SDLK_F5() {
		return SDLK_F5;
	}

	private static final int SDLK_F6 = (int) 1073741887L;

	public static int SDLK_F6() {
		return SDLK_F6;
	}

	private static final int SDLK_F7 = (int) 1073741888L;

	public static int SDLK_F7() {
		return SDLK_F7;
	}

	private static final int SDLK_F8 = (int) 1073741889L;

	public static int SDLK_F8() {
		return SDLK_F8;
	}

	private static final int SDLK_F9 = (int) 1073741890L;

	public static int SDLK_F9() {
		return SDLK_F9;
	}

	private static final int SDLK_F10 = (int) 1073741891L;

	public static int SDLK_F10() {
		return SDLK_F10;
	}

	private static final int SDLK_F11 = (int) 1073741892L;

	public static int SDLK_F11() {
		return SDLK_F11;
	}

	private static final int SDLK_F12 = (int) 1073741893L;

	public static int SDLK_F12() {
		return SDLK_F12;
	}

	private static final int SDLK_PRINTSCREEN = (int) 1073741894L;

	public static int SDLK_PRINTSCREEN() {
		return SDLK_PRINTSCREEN;
	}

	private static final int SDLK_SCROLLLOCK = (int) 1073741895L;

	public static int SDLK_SCROLLLOCK() {
		return SDLK_SCROLLLOCK;
	}

	private static final int SDLK_PAUSE = (int) 1073741896L;

	public static int SDLK_PAUSE() {
		return SDLK_PAUSE;
	}

	private static final int SDLK_INSERT = (int) 1073741897L;

	public static int SDLK_INSERT() {
		return SDLK_INSERT;
	}

	private static final int SDLK_HOME = (int) 1073741898L;

	public static int SDLK_HOME() {
		return SDLK_HOME;
	}

	private static final int SDLK_PAGEUP = (int) 1073741899L;

	public static int SDLK_PAGEUP() {
		return SDLK_PAGEUP;
	}

	private static final int SDLK_END = (int) 1073741901L;

	public static int SDLK_END() {
		return SDLK_END;
	}

	private static final int SDLK_PAGEDOWN = (int) 1073741902L;

	public static int SDLK_PAGEDOWN() {
		return SDLK_PAGEDOWN;
	}

	private static final int SDLK_RIGHT = (int) 1073741903L;

	public static int SDLK_RIGHT() {
		return SDLK_RIGHT;
	}

	private static final int SDLK_LEFT = (int) 1073741904L;

	public static int SDLK_LEFT() {
		return SDLK_LEFT;
	}

	private static final int SDLK_DOWN = (int) 1073741905L;

	public static int SDLK_DOWN() {
		return SDLK_DOWN;
	}

	private static final int SDLK_UP = (int) 1073741906L;

	public static int SDLK_UP() {
		return SDLK_UP;
	}

	private static final int SDLK_NUMLOCKCLEAR = (int) 1073741907L;

	public static int SDLK_NUMLOCKCLEAR() {
		return SDLK_NUMLOCKCLEAR;
	}

	private static final int SDLK_KP_DIVIDE = (int) 1073741908L;

	public static int SDLK_KP_DIVIDE() {
		return SDLK_KP_DIVIDE;
	}

	private static final int SDLK_KP_MULTIPLY = (int) 1073741909L;

	public static int SDLK_KP_MULTIPLY() {
		return SDLK_KP_MULTIPLY;
	}

	private static final int SDLK_KP_MINUS = (int) 1073741910L;

	public static int SDLK_KP_MINUS() {
		return SDLK_KP_MINUS;
	}

	private static final int SDLK_KP_PLUS = (int) 1073741911L;

	public static int SDLK_KP_PLUS() {
		return SDLK_KP_PLUS;
	}

	private static final int SDLK_KP_ENTER = (int) 1073741912L;

	public static int SDLK_KP_ENTER() {
		return SDLK_KP_ENTER;
	}

	private static final int SDLK_KP_1 = (int) 1073741913L;

	public static int SDLK_KP_1() {
		return SDLK_KP_1;
	}

	private static final int SDLK_KP_2 = (int) 1073741914L;

	public static int SDLK_KP_2() {
		return SDLK_KP_2;
	}

	private static final int SDLK_KP_3 = (int) 1073741915L;

	public static int SDLK_KP_3() {
		return SDLK_KP_3;
	}

	private static final int SDLK_KP_4 = (int) 1073741916L;

	public static int SDLK_KP_4() {
		return SDLK_KP_4;
	}

	private static final int SDLK_KP_5 = (int) 1073741917L;

	public static int SDLK_KP_5() {
		return SDLK_KP_5;
	}

	private static final int SDLK_KP_6 = (int) 1073741918L;

	public static int SDLK_KP_6() {
		return SDLK_KP_6;
	}

	private static final int SDLK_KP_7 = (int) 1073741919L;

	public static int SDLK_KP_7() {
		return SDLK_KP_7;
	}

	private static final int SDLK_KP_8 = (int) 1073741920L;

	public static int SDLK_KP_8() {
		return SDLK_KP_8;
	}

	private static final int SDLK_KP_9 = (int) 1073741921L;

	public static int SDLK_KP_9() {
		return SDLK_KP_9;
	}

	private static final int SDLK_KP_0 = (int) 1073741922L;

	public static int SDLK_KP_0() {
		return SDLK_KP_0;
	}

	private static final int SDLK_KP_PERIOD = (int) 1073741923L;

	public static int SDLK_KP_PERIOD() {
		return SDLK_KP_PERIOD;
	}

	private static final int SDLK_APPLICATION = (int) 1073741925L;

	public static int SDLK_APPLICATION() {
		return SDLK_APPLICATION;
	}

	private static final int SDLK_POWER = (int) 1073741926L;

	public static int SDLK_POWER() {
		return SDLK_POWER;
	}

	private static final int SDLK_KP_EQUALS = (int) 1073741927L;

	public static int SDLK_KP_EQUALS() {
		return SDLK_KP_EQUALS;
	}

	private static final int SDLK_F13 = (int) 1073741928L;

	public static int SDLK_F13() {
		return SDLK_F13;
	}

	private static final int SDLK_F14 = (int) 1073741929L;

	public static int SDLK_F14() {
		return SDLK_F14;
	}

	private static final int SDLK_F15 = (int) 1073741930L;

	public static int SDLK_F15() {
		return SDLK_F15;
	}

	private static final int SDLK_F16 = (int) 1073741931L;

	public static int SDLK_F16() {
		return SDLK_F16;
	}

	private static final int SDLK_F17 = (int) 1073741932L;

	public static int SDLK_F17() {
		return SDLK_F17;
	}

	private static final int SDLK_F18 = (int) 1073741933L;

	public static int SDLK_F18() {
		return SDLK_F18;
	}

	private static final int SDLK_F19 = (int) 1073741934L;

	public static int SDLK_F19() {
		return SDLK_F19;
	}

	private static final int SDLK_F20 = (int) 1073741935L;

	public static int SDLK_F20() {
		return SDLK_F20;
	}

	private static final int SDLK_F21 = (int) 1073741936L;

	public static int SDLK_F21() {
		return SDLK_F21;
	}

	private static final int SDLK_F22 = (int) 1073741937L;

	public static int SDLK_F22() {
		return SDLK_F22;
	}

	private static final int SDLK_F23 = (int) 1073741938L;

	public static int SDLK_F23() {
		return SDLK_F23;
	}

	private static final int SDLK_F24 = (int) 1073741939L;

	public static int SDLK_F24() {
		return SDLK_F24;
	}

	private static final int SDLK_EXECUTE = (int) 1073741940L;

	public static int SDLK_EXECUTE() {
		return SDLK_EXECUTE;
	}

	private static final int SDLK_HELP = (int) 1073741941L;

	public static int SDLK_HELP() {
		return SDLK_HELP;
	}

	private static final int SDLK_MENU = (int) 1073741942L;

	public static int SDLK_MENU() {
		return SDLK_MENU;
	}

	private static final int SDLK_SELECT = (int) 1073741943L;

	public static int SDLK_SELECT() {
		return SDLK_SELECT;
	}

	private static final int SDLK_STOP = (int) 1073741944L;

	public static int SDLK_STOP() {
		return SDLK_STOP;
	}

	private static final int SDLK_AGAIN = (int) 1073741945L;

	public static int SDLK_AGAIN() {
		return SDLK_AGAIN;
	}

	private static final int SDLK_UNDO = (int) 1073741946L;

	public static int SDLK_UNDO() {
		return SDLK_UNDO;
	}

	private static final int SDLK_CUT = (int) 1073741947L;

	public static int SDLK_CUT() {
		return SDLK_CUT;
	}

	private static final int SDLK_COPY = (int) 1073741948L;

	public static int SDLK_COPY() {
		return SDLK_COPY;
	}

	private static final int SDLK_PASTE = (int) 1073741949L;

	public static int SDLK_PASTE() {
		return SDLK_PASTE;
	}

	private static final int SDLK_FIND = (int) 1073741950L;

	public static int SDLK_FIND() {
		return SDLK_FIND;
	}

	private static final int SDLK_MUTE = (int) 1073741951L;

	public static int SDLK_MUTE() {
		return SDLK_MUTE;
	}

	private static final int SDLK_VOLUMEUP = (int) 1073741952L;

	public static int SDLK_VOLUMEUP() {
		return SDLK_VOLUMEUP;
	}

	private static final int SDLK_VOLUMEDOWN = (int) 1073741953L;

	public static int SDLK_VOLUMEDOWN() {
		return SDLK_VOLUMEDOWN;
	}

	private static final int SDLK_KP_COMMA = (int) 1073741957L;

	public static int SDLK_KP_COMMA() {
		return SDLK_KP_COMMA;
	}

	private static final int SDLK_KP_EQUALSAS400 = (int) 1073741958L;

	public static int SDLK_KP_EQUALSAS400() {
		return SDLK_KP_EQUALSAS400;
	}

	private static final int SDLK_ALTERASE = (int) 1073741977L;

	public static int SDLK_ALTERASE() {
		return SDLK_ALTERASE;
	}

	private static final int SDLK_SYSREQ = (int) 1073741978L;

	public static int SDLK_SYSREQ() {
		return SDLK_SYSREQ;
	}

	private static final int SDLK_CANCEL = (int) 1073741979L;

	public static int SDLK_CANCEL() {
		return SDLK_CANCEL;
	}

	private static final int SDLK_CLEAR = (int) 1073741980L;

	public static int SDLK_CLEAR() {
		return SDLK_CLEAR;
	}

	private static final int SDLK_PRIOR = (int) 1073741981L;

	public static int SDLK_PRIOR() {
		return SDLK_PRIOR;
	}

	private static final int SDLK_RETURN2 = (int) 1073741982L;

	public static int SDLK_RETURN2() {
		return SDLK_RETURN2;
	}

	private static final int SDLK_SEPARATOR = (int) 1073741983L;

	public static int SDLK_SEPARATOR() {
		return SDLK_SEPARATOR;
	}

	private static final int SDLK_OUT = (int) 1073741984L;

	public static int SDLK_OUT() {
		return SDLK_OUT;
	}

	private static final int SDLK_OPER = (int) 1073741985L;

	public static int SDLK_OPER() {
		return SDLK_OPER;
	}

	private static final int SDLK_CLEARAGAIN = (int) 1073741986L;

	public static int SDLK_CLEARAGAIN() {
		return SDLK_CLEARAGAIN;
	}

	private static final int SDLK_CRSEL = (int) 1073741987L;

	public static int SDLK_CRSEL() {
		return SDLK_CRSEL;
	}

	private static final int SDLK_EXSEL = (int) 1073741988L;

	public static int SDLK_EXSEL() {
		return SDLK_EXSEL;
	}

	private static final int SDLK_FRONT = (int) 1073741989L;

	public static int SDLK_FRONT() {
		return SDLK_FRONT;
	}

	private static final int SDLK_KP_00 = (int) 1073742000L;

	public static int SDLK_KP_00() {
		return SDLK_KP_00;
	}

	private static final int SDLK_KP_000 = (int) 1073742001L;

	public static int SDLK_KP_000() {
		return SDLK_KP_000;
	}

	private static final int SDLK_THOUSANDSSEPARATOR = (int) 1073742002L;

	public static int SDLK_THOUSANDSSEPARATOR() {
		return SDLK_THOUSANDSSEPARATOR;
	}

	private static final int SDLK_DECIMALSEPARATOR = (int) 1073742003L;

	public static int SDLK_DECIMALSEPARATOR() {
		return SDLK_DECIMALSEPARATOR;
	}

	private static final int SDLK_CURRENCYUNIT = (int) 1073742004L;

	public static int SDLK_CURRENCYUNIT() {
		return SDLK_CURRENCYUNIT;
	}

	private static final int SDLK_CURRENCYSUBUNIT = (int) 1073742005L;

	public static int SDLK_CURRENCYSUBUNIT() {
		return SDLK_CURRENCYSUBUNIT;
	}

	private static final int SDLK_KP_LEFTPAREN = (int) 1073742006L;

	public static int SDLK_KP_LEFTPAREN() {
		return SDLK_KP_LEFTPAREN;
	}

	private static final int SDLK_KP_RIGHTPAREN = (int) 1073742007L;

	public static int SDLK_KP_RIGHTPAREN() {
		return SDLK_KP_RIGHTPAREN;
	}

	private static final int SDLK_KP_LEFTBRACE = (int) 1073742008L;

	public static int SDLK_KP_LEFTBRACE() {
		return SDLK_KP_LEFTBRACE;
	}

	private static final int SDLK_KP_RIGHTBRACE = (int) 1073742009L;

	public static int SDLK_KP_RIGHTBRACE() {
		return SDLK_KP_RIGHTBRACE;
	}

	private static final int SDLK_KP_TAB = (int) 1073742010L;

	public static int SDLK_KP_TAB() {
		return SDLK_KP_TAB;
	}

	private static final int SDLK_KP_BACKSPACE = (int) 1073742011L;

	public static int SDLK_KP_BACKSPACE() {
		return SDLK_KP_BACKSPACE;
	}

	private static final int SDLK_KP_A = (int) 1073742012L;

	public static int SDLK_KP_A() {
		return SDLK_KP_A;
	}

	private static final int SDLK_KP_B = (int) 1073742013L;

	public static int SDLK_KP_B() {
		return SDLK_KP_B;
	}

	private static final int SDLK_KP_C = (int) 1073742014L;

	public static int SDLK_KP_C() {
		return SDLK_KP_C;
	}

	private static final int SDLK_KP_D = (int) 1073742015L;

	public static int SDLK_KP_D() {
		return SDLK_KP_D;
	}

	private static final int SDLK_KP_E = (int) 1073742016L;

	public static int SDLK_KP_E() {
		return SDLK_KP_E;
	}

	private static final int SDLK_KP_F = (int) 1073742017L;

	public static int SDLK_KP_F() {
		return SDLK_KP_F;
	}

	private static final int SDLK_KP_XOR = (int) 1073742018L;

	public static int SDLK_KP_XOR() {
		return SDLK_KP_XOR;
	}

	private static final int SDLK_KP_POWER = (int) 1073742019L;

	public static int SDLK_KP_POWER() {
		return SDLK_KP_POWER;
	}

	private static final int SDLK_KP_PERCENT = (int) 1073742020L;

	public static int SDLK_KP_PERCENT() {
		return SDLK_KP_PERCENT;
	}

	private static final int SDLK_KP_LESS = (int) 1073742021L;

	public static int SDLK_KP_LESS() {
		return SDLK_KP_LESS;
	}

	private static final int SDLK_KP_GREATER = (int) 1073742022L;

	public static int SDLK_KP_GREATER() {
		return SDLK_KP_GREATER;
	}

	private static final int SDLK_KP_AMPERSAND = (int) 1073742023L;

	public static int SDLK_KP_AMPERSAND() {
		return SDLK_KP_AMPERSAND;
	}

	private static final int SDLK_KP_DBLAMPERSAND = (int) 1073742024L;

	public static int SDLK_KP_DBLAMPERSAND() {
		return SDLK_KP_DBLAMPERSAND;
	}

	private static final int SDLK_KP_VERTICALBAR = (int) 1073742025L;

	public static int SDLK_KP_VERTICALBAR() {
		return SDLK_KP_VERTICALBAR;
	}

	private static final int SDLK_KP_DBLVERTICALBAR = (int) 1073742026L;

	public static int SDLK_KP_DBLVERTICALBAR() {
		return SDLK_KP_DBLVERTICALBAR;
	}

	private static final int SDLK_KP_COLON = (int) 1073742027L;

	public static int SDLK_KP_COLON() {
		return SDLK_KP_COLON;
	}

	private static final int SDLK_KP_HASH = (int) 1073742028L;

	public static int SDLK_KP_HASH() {
		return SDLK_KP_HASH;
	}

	private static final int SDLK_KP_SPACE = (int) 1073742029L;

	public static int SDLK_KP_SPACE() {
		return SDLK_KP_SPACE;
	}

	private static final int SDLK_KP_AT = (int) 1073742030L;

	public static int SDLK_KP_AT() {
		return SDLK_KP_AT;
	}

	private static final int SDLK_KP_EXCLAM = (int) 1073742031L;

	public static int SDLK_KP_EXCLAM() {
		return SDLK_KP_EXCLAM;
	}

	private static final int SDLK_KP_MEMSTORE = (int) 1073742032L;

	public static int SDLK_KP_MEMSTORE() {
		return SDLK_KP_MEMSTORE;
	}

	private static final int SDLK_KP_MEMRECALL = (int) 1073742033L;

	public static int SDLK_KP_MEMRECALL() {
		return SDLK_KP_MEMRECALL;
	}

	private static final int SDLK_KP_MEMCLEAR = (int) 1073742034L;

	public static int SDLK_KP_MEMCLEAR() {
		return SDLK_KP_MEMCLEAR;
	}

	private static final int SDLK_KP_MEMADD = (int) 1073742035L;

	public static int SDLK_KP_MEMADD() {
		return SDLK_KP_MEMADD;
	}

	private static final int SDLK_KP_MEMSUBTRACT = (int) 1073742036L;

	public static int SDLK_KP_MEMSUBTRACT() {
		return SDLK_KP_MEMSUBTRACT;
	}

	private static final int SDLK_KP_MEMMULTIPLY = (int) 1073742037L;

	public static int SDLK_KP_MEMMULTIPLY() {
		return SDLK_KP_MEMMULTIPLY;
	}

	private static final int SDLK_KP_MEMDIVIDE = (int) 1073742038L;

	public static int SDLK_KP_MEMDIVIDE() {
		return SDLK_KP_MEMDIVIDE;
	}

	private static final int SDLK_KP_PLUSMINUS = (int) 1073742039L;

	public static int SDLK_KP_PLUSMINUS() {
		return SDLK_KP_PLUSMINUS;
	}

	private static final int SDLK_KP_CLEAR = (int) 1073742040L;

	public static int SDLK_KP_CLEAR() {
		return SDLK_KP_CLEAR;
	}

	private static final int SDLK_KP_CLEARENTRY = (int) 1073742041L;

	public static int SDLK_KP_CLEARENTRY() {
		return SDLK_KP_CLEARENTRY;
	}

	private static final int SDLK_KP_BINARY = (int) 1073742042L;

	public static int SDLK_KP_BINARY() {
		return SDLK_KP_BINARY;
	}

	private static final int SDLK_KP_OCTAL = (int) 1073742043L;

	public static int SDLK_KP_OCTAL() {
		return SDLK_KP_OCTAL;
	}

	private static final int SDLK_KP_DECIMAL = (int) 1073742044L;

	public static int SDLK_KP_DECIMAL() {
		return SDLK_KP_DECIMAL;
	}

	private static final int SDLK_KP_HEXADECIMAL = (int) 1073742045L;

	public static int SDLK_KP_HEXADECIMAL() {
		return SDLK_KP_HEXADECIMAL;
	}

	private static final int SDLK_LCTRL = (int) 1073742048L;

	public static int SDLK_LCTRL() {
		return SDLK_LCTRL;
	}

	private static final int SDLK_LSHIFT = (int) 1073742049L;

	public static int SDLK_LSHIFT() {
		return SDLK_LSHIFT;
	}

	private static final int SDLK_LALT = (int) 1073742050L;

	public static int SDLK_LALT() {
		return SDLK_LALT;
	}

	private static final int SDLK_LGUI = (int) 1073742051L;

	public static int SDLK_LGUI() {
		return SDLK_LGUI;
	}

	private static final int SDLK_RCTRL = (int) 1073742052L;

	public static int SDLK_RCTRL() {
		return SDLK_RCTRL;
	}

	private static final int SDLK_RSHIFT = (int) 1073742053L;

	public static int SDLK_RSHIFT() {
		return SDLK_RSHIFT;
	}

	private static final int SDLK_RALT = (int) 1073742054L;

	public static int SDLK_RALT() {
		return SDLK_RALT;
	}

	private static final int SDLK_RGUI = (int) 1073742055L;

	public static int SDLK_RGUI() {
		return SDLK_RGUI;
	}

	private static final int SDLK_MODE = (int) 1073742081L;

	public static int SDLK_MODE() {
		return SDLK_MODE;
	}

	private static final int SDLK_SLEEP = (int) 1073742082L;

	public static int SDLK_SLEEP() {
		return SDLK_SLEEP;
	}

	private static final int SDLK_WAKE = (int) 1073742083L;

	public static int SDLK_WAKE() {
		return SDLK_WAKE;
	}

	private static final int SDLK_CHANNEL_INCREMENT = (int) 1073742084L;

	public static int SDLK_CHANNEL_INCREMENT() {
		return SDLK_CHANNEL_INCREMENT;
	}

	private static final int SDLK_CHANNEL_DECREMENT = (int) 1073742085L;

	public static int SDLK_CHANNEL_DECREMENT() {
		return SDLK_CHANNEL_DECREMENT;
	}

	private static final int SDLK_MEDIA_PLAY = (int) 1073742086L;

	public static int SDLK_MEDIA_PLAY() {
		return SDLK_MEDIA_PLAY;
	}

	private static final int SDLK_MEDIA_PAUSE = (int) 1073742087L;

	public static int SDLK_MEDIA_PAUSE() {
		return SDLK_MEDIA_PAUSE;
	}

	private static final int SDLK_MEDIA_RECORD = (int) 1073742088L;

	public static int SDLK_MEDIA_RECORD() {
		return SDLK_MEDIA_RECORD;
	}

	private static final int SDLK_MEDIA_FAST_FORWARD = (int) 1073742089L;

	public static int SDLK_MEDIA_FAST_FORWARD() {
		return SDLK_MEDIA_FAST_FORWARD;
	}

	private static final int SDLK_MEDIA_REWIND = (int) 1073742090L;

	public static int SDLK_MEDIA_REWIND() {
		return SDLK_MEDIA_REWIND;
	}

	private static final int SDLK_MEDIA_NEXT_TRACK = (int) 1073742091L;

	public static int SDLK_MEDIA_NEXT_TRACK() {
		return SDLK_MEDIA_NEXT_TRACK;
	}

	private static final int SDLK_MEDIA_PREVIOUS_TRACK = (int) 1073742092L;

	public static int SDLK_MEDIA_PREVIOUS_TRACK() {
		return SDLK_MEDIA_PREVIOUS_TRACK;
	}

	private static final int SDLK_MEDIA_STOP = (int) 1073742093L;

	public static int SDLK_MEDIA_STOP() {
		return SDLK_MEDIA_STOP;
	}

	private static final int SDLK_MEDIA_EJECT = (int) 1073742094L;

	public static int SDLK_MEDIA_EJECT() {
		return SDLK_MEDIA_EJECT;
	}

	private static final int SDLK_MEDIA_PLAY_PAUSE = (int) 1073742095L;

	public static int SDLK_MEDIA_PLAY_PAUSE() {
		return SDLK_MEDIA_PLAY_PAUSE;
	}

	private static final int SDLK_MEDIA_SELECT = (int) 1073742096L;

	public static int SDLK_MEDIA_SELECT() {
		return SDLK_MEDIA_SELECT;
	}

	private static final int SDLK_AC_NEW = (int) 1073742097L;

	public static int SDLK_AC_NEW() {
		return SDLK_AC_NEW;
	}

	private static final int SDLK_AC_OPEN = (int) 1073742098L;

	public static int SDLK_AC_OPEN() {
		return SDLK_AC_OPEN;
	}

	private static final int SDLK_AC_CLOSE = (int) 1073742099L;

	public static int SDLK_AC_CLOSE() {
		return SDLK_AC_CLOSE;
	}

	private static final int SDLK_AC_EXIT = (int) 1073742100L;

	public static int SDLK_AC_EXIT() {
		return SDLK_AC_EXIT;
	}

	private static final int SDLK_AC_SAVE = (int) 1073742101L;

	public static int SDLK_AC_SAVE() {
		return SDLK_AC_SAVE;
	}

	private static final int SDLK_AC_PRINT = (int) 1073742102L;

	public static int SDLK_AC_PRINT() {
		return SDLK_AC_PRINT;
	}

	private static final int SDLK_AC_PROPERTIES = (int) 1073742103L;

	public static int SDLK_AC_PROPERTIES() {
		return SDLK_AC_PROPERTIES;
	}

	private static final int SDLK_AC_SEARCH = (int) 1073742104L;

	public static int SDLK_AC_SEARCH() {
		return SDLK_AC_SEARCH;
	}

	private static final int SDLK_AC_HOME = (int) 1073742105L;

	public static int SDLK_AC_HOME() {
		return SDLK_AC_HOME;
	}

	private static final int SDLK_AC_BACK = (int) 1073742106L;

	public static int SDLK_AC_BACK() {
		return SDLK_AC_BACK;
	}

	private static final int SDLK_AC_FORWARD = (int) 1073742107L;

	public static int SDLK_AC_FORWARD() {
		return SDLK_AC_FORWARD;
	}

	private static final int SDLK_AC_STOP = (int) 1073742108L;

	public static int SDLK_AC_STOP() {
		return SDLK_AC_STOP;
	}

	private static final int SDLK_AC_REFRESH = (int) 1073742109L;

	public static int SDLK_AC_REFRESH() {
		return SDLK_AC_REFRESH;
	}

	private static final int SDLK_AC_BOOKMARKS = (int) 1073742110L;

	public static int SDLK_AC_BOOKMARKS() {
		return SDLK_AC_BOOKMARKS;
	}

	private static final int SDLK_SOFTLEFT = (int) 1073742111L;

	public static int SDLK_SOFTLEFT() {
		return SDLK_SOFTLEFT;
	}

	private static final int SDLK_SOFTRIGHT = (int) 1073742112L;

	public static int SDLK_SOFTRIGHT() {
		return SDLK_SOFTRIGHT;
	}

	private static final int SDLK_CALL = (int) 1073742113L;

	public static int SDLK_CALL() {
		return SDLK_CALL;
	}

	private static final int SDLK_ENDCALL = (int) 1073742114L;

	public static int SDLK_ENDCALL() {
		return SDLK_ENDCALL;
	}

	private static final int SDLK_LEFT_TAB = (int) 536870913L;

	public static int SDLK_LEFT_TAB() {
		return SDLK_LEFT_TAB;
	}

	private static final int SDLK_LEVEL5_SHIFT = (int) 536870914L;

	public static int SDLK_LEVEL5_SHIFT() {
		return SDLK_LEVEL5_SHIFT;
	}

	private static final int SDLK_MULTI_KEY_COMPOSE = (int) 536870915L;

	public static int SDLK_MULTI_KEY_COMPOSE() {
		return SDLK_MULTI_KEY_COMPOSE;
	}

	private static final int SDLK_LMETA = (int) 536870916L;

	public static int SDLK_LMETA() {
		return SDLK_LMETA;
	}

	private static final int SDLK_RMETA = (int) 536870917L;

	public static int SDLK_RMETA() {
		return SDLK_RMETA;
	}
}
