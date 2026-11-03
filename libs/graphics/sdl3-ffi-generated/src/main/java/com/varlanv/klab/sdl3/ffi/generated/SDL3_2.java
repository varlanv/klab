package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;

class SDL3_2 extends SDL3_3 {

	SDL3_2() {

	}

	private static class SDL_EGL_GetCurrentDisplay {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_EGL_GetCurrentDisplay");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_EGL_GetCurrentDisplay$descriptor() {
		return SDL_EGL_GetCurrentDisplay.DESC;
	}

	public static MethodHandle SDL_EGL_GetCurrentDisplay$handle() {
		return SDL_EGL_GetCurrentDisplay.HANDLE;
	}

	public static MemorySegment SDL_EGL_GetCurrentDisplay$address() {
		return SDL_EGL_GetCurrentDisplay.ADDR;
	}

	public static MemorySegment SDL_EGL_GetCurrentDisplay() {
		var mh$ = SDL_EGL_GetCurrentDisplay.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_EGL_GetCurrentDisplay");
			}
			return (MemorySegment) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_EGL_GetCurrentConfig {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_EGL_GetCurrentConfig");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_EGL_GetCurrentConfig$descriptor() {
		return SDL_EGL_GetCurrentConfig.DESC;
	}

	public static MethodHandle SDL_EGL_GetCurrentConfig$handle() {
		return SDL_EGL_GetCurrentConfig.HANDLE;
	}

	public static MemorySegment SDL_EGL_GetCurrentConfig$address() {
		return SDL_EGL_GetCurrentConfig.ADDR;
	}

	public static MemorySegment SDL_EGL_GetCurrentConfig() {
		var mh$ = SDL_EGL_GetCurrentConfig.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_EGL_GetCurrentConfig");
			}
			return (MemorySegment) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_EGL_GetWindowSurface {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_EGL_GetWindowSurface");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_EGL_GetWindowSurface$descriptor() {
		return SDL_EGL_GetWindowSurface.DESC;
	}

	public static MethodHandle SDL_EGL_GetWindowSurface$handle() {
		return SDL_EGL_GetWindowSurface.HANDLE;
	}

	public static MemorySegment SDL_EGL_GetWindowSurface$address() {
		return SDL_EGL_GetWindowSurface.ADDR;
	}

	public static MemorySegment SDL_EGL_GetWindowSurface(MemorySegment window) {
		var mh$ = SDL_EGL_GetWindowSurface.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_EGL_GetWindowSurface", window);
			}
			return (MemorySegment) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_EGL_SetAttributeCallbacks {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_EGL_SetAttributeCallbacks");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_EGL_SetAttributeCallbacks$descriptor() {
		return SDL_EGL_SetAttributeCallbacks.DESC;
	}

	public static MethodHandle SDL_EGL_SetAttributeCallbacks$handle() {
		return SDL_EGL_SetAttributeCallbacks.HANDLE;
	}

	public static MemorySegment SDL_EGL_SetAttributeCallbacks$address() {
		return SDL_EGL_SetAttributeCallbacks.ADDR;
	}

	public static void SDL_EGL_SetAttributeCallbacks(MemorySegment platformAttribCallback, MemorySegment surfaceAttribCallback, MemorySegment contextAttribCallback, MemorySegment userdata) {
		var mh$ = SDL_EGL_SetAttributeCallbacks.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_EGL_SetAttributeCallbacks", platformAttribCallback, surfaceAttribCallback, contextAttribCallback, userdata);
			}
			mh$.invokeExact(platformAttribCallback, surfaceAttribCallback, contextAttribCallback, userdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GL_SetSwapInterval {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GL_SetSwapInterval");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GL_SetSwapInterval$descriptor() {
		return SDL_GL_SetSwapInterval.DESC;
	}

	public static MethodHandle SDL_GL_SetSwapInterval$handle() {
		return SDL_GL_SetSwapInterval.HANDLE;
	}

	public static MemorySegment SDL_GL_SetSwapInterval$address() {
		return SDL_GL_SetSwapInterval.ADDR;
	}

	public static boolean SDL_GL_SetSwapInterval(int interval) {
		var mh$ = SDL_GL_SetSwapInterval.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GL_SetSwapInterval", interval);
			}
			return (boolean) mh$.invokeExact(interval);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GL_GetSwapInterval {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GL_GetSwapInterval");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GL_GetSwapInterval$descriptor() {
		return SDL_GL_GetSwapInterval.DESC;
	}

	public static MethodHandle SDL_GL_GetSwapInterval$handle() {
		return SDL_GL_GetSwapInterval.HANDLE;
	}

	public static MemorySegment SDL_GL_GetSwapInterval$address() {
		return SDL_GL_GetSwapInterval.ADDR;
	}

	public static boolean SDL_GL_GetSwapInterval(MemorySegment interval) {
		var mh$ = SDL_GL_GetSwapInterval.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GL_GetSwapInterval", interval);
			}
			return (boolean) mh$.invokeExact(interval);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GL_SwapWindow {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GL_SwapWindow");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GL_SwapWindow$descriptor() {
		return SDL_GL_SwapWindow.DESC;
	}

	public static MethodHandle SDL_GL_SwapWindow$handle() {
		return SDL_GL_SwapWindow.HANDLE;
	}

	public static MemorySegment SDL_GL_SwapWindow$address() {
		return SDL_GL_SwapWindow.ADDR;
	}

	public static boolean SDL_GL_SwapWindow(MemorySegment window) {
		var mh$ = SDL_GL_SwapWindow.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GL_SwapWindow", window);
			}
			return (boolean) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GL_DestroyContext {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GL_DestroyContext");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GL_DestroyContext$descriptor() {
		return SDL_GL_DestroyContext.DESC;
	}

	public static MethodHandle SDL_GL_DestroyContext$handle() {
		return SDL_GL_DestroyContext.HANDLE;
	}

	public static MemorySegment SDL_GL_DestroyContext$address() {
		return SDL_GL_DestroyContext.ADDR;
	}

	public static boolean SDL_GL_DestroyContext(MemorySegment context) {
		var mh$ = SDL_GL_DestroyContext.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GL_DestroyContext", context);
			}
			return (boolean) mh$.invokeExact(context);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ShowOpenFileDialog {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ShowOpenFileDialog");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ShowOpenFileDialog$descriptor() {
		return SDL_ShowOpenFileDialog.DESC;
	}

	public static MethodHandle SDL_ShowOpenFileDialog$handle() {
		return SDL_ShowOpenFileDialog.HANDLE;
	}

	public static MemorySegment SDL_ShowOpenFileDialog$address() {
		return SDL_ShowOpenFileDialog.ADDR;
	}

	public static void SDL_ShowOpenFileDialog(MemorySegment callback, MemorySegment userdata, MemorySegment window, MemorySegment filters, int nfilters, MemorySegment default_location, boolean allow_many) {
		var mh$ = SDL_ShowOpenFileDialog.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ShowOpenFileDialog", callback, userdata, window, filters, nfilters, default_location, allow_many);
			}
			mh$.invokeExact(callback, userdata, window, filters, nfilters, default_location, allow_many);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ShowSaveFileDialog {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ShowSaveFileDialog");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ShowSaveFileDialog$descriptor() {
		return SDL_ShowSaveFileDialog.DESC;
	}

	public static MethodHandle SDL_ShowSaveFileDialog$handle() {
		return SDL_ShowSaveFileDialog.HANDLE;
	}

	public static MemorySegment SDL_ShowSaveFileDialog$address() {
		return SDL_ShowSaveFileDialog.ADDR;
	}

	public static void SDL_ShowSaveFileDialog(MemorySegment callback, MemorySegment userdata, MemorySegment window, MemorySegment filters, int nfilters, MemorySegment default_location) {
		var mh$ = SDL_ShowSaveFileDialog.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ShowSaveFileDialog", callback, userdata, window, filters, nfilters, default_location);
			}
			mh$.invokeExact(callback, userdata, window, filters, nfilters, default_location);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ShowOpenFolderDialog {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ShowOpenFolderDialog");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ShowOpenFolderDialog$descriptor() {
		return SDL_ShowOpenFolderDialog.DESC;
	}

	public static MethodHandle SDL_ShowOpenFolderDialog$handle() {
		return SDL_ShowOpenFolderDialog.HANDLE;
	}

	public static MemorySegment SDL_ShowOpenFolderDialog$address() {
		return SDL_ShowOpenFolderDialog.ADDR;
	}

	public static void SDL_ShowOpenFolderDialog(MemorySegment callback, MemorySegment userdata, MemorySegment window, MemorySegment default_location, boolean allow_many) {
		var mh$ = SDL_ShowOpenFolderDialog.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ShowOpenFolderDialog", callback, userdata, window, default_location, allow_many);
			}
			mh$.invokeExact(callback, userdata, window, default_location, allow_many);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static final int SDL_FILEDIALOG_OPENFILE = (int) 0L;

	public static int SDL_FILEDIALOG_OPENFILE() {
		return SDL_FILEDIALOG_OPENFILE;
	}

	private static final int SDL_FILEDIALOG_SAVEFILE = (int) 1L;

	public static int SDL_FILEDIALOG_SAVEFILE() {
		return SDL_FILEDIALOG_SAVEFILE;
	}

	private static final int SDL_FILEDIALOG_OPENFOLDER = (int) 2L;

	public static int SDL_FILEDIALOG_OPENFOLDER() {
		return SDL_FILEDIALOG_OPENFOLDER;
	}

	private static class SDL_ShowFileDialogWithProperties {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ShowFileDialogWithProperties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ShowFileDialogWithProperties$descriptor() {
		return SDL_ShowFileDialogWithProperties.DESC;
	}

	public static MethodHandle SDL_ShowFileDialogWithProperties$handle() {
		return SDL_ShowFileDialogWithProperties.HANDLE;
	}

	public static MemorySegment SDL_ShowFileDialogWithProperties$address() {
		return SDL_ShowFileDialogWithProperties.ADDR;
	}

	public static void SDL_ShowFileDialogWithProperties(int type, MemorySegment callback, MemorySegment userdata, int props) {
		var mh$ = SDL_ShowFileDialogWithProperties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ShowFileDialogWithProperties", type, callback, userdata, props);
			}
			mh$.invokeExact(type, callback, userdata, props);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GUIDToString {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL_GUID.layout(),
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GUIDToString");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GUIDToString$descriptor() {
		return SDL_GUIDToString.DESC;
	}

	public static MethodHandle SDL_GUIDToString$handle() {
		return SDL_GUIDToString.HANDLE;
	}

	public static MemorySegment SDL_GUIDToString$address() {
		return SDL_GUIDToString.ADDR;
	}

	public static void SDL_GUIDToString(MemorySegment guid, MemorySegment pszGUID, int cbGUID) {
		var mh$ = SDL_GUIDToString.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GUIDToString", guid, pszGUID, cbGUID);
			}
			mh$.invokeExact(guid, pszGUID, cbGUID);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_StringToGUID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL_GUID.layout(),
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_StringToGUID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_StringToGUID$descriptor() {
		return SDL_StringToGUID.DESC;
	}

	public static MethodHandle SDL_StringToGUID$handle() {
		return SDL_StringToGUID.HANDLE;
	}

	public static MemorySegment SDL_StringToGUID$address() {
		return SDL_StringToGUID.ADDR;
	}

	public static MemorySegment SDL_StringToGUID(SegmentAllocator allocator, MemorySegment pchGUID) {
		var mh$ = SDL_StringToGUID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_StringToGUID", allocator, pchGUID);
			}
			return (MemorySegment) mh$.invokeExact(allocator, pchGUID);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static final int SDL_POWERSTATE_ERROR = (int) -1L;

	public static int SDL_POWERSTATE_ERROR() {
		return SDL_POWERSTATE_ERROR;
	}

	private static final int SDL_POWERSTATE_UNKNOWN = (int) 0L;

	public static int SDL_POWERSTATE_UNKNOWN() {
		return SDL_POWERSTATE_UNKNOWN;
	}

	private static final int SDL_POWERSTATE_ON_BATTERY = (int) 1L;

	public static int SDL_POWERSTATE_ON_BATTERY() {
		return SDL_POWERSTATE_ON_BATTERY;
	}

	private static final int SDL_POWERSTATE_NO_BATTERY = (int) 2L;

	public static int SDL_POWERSTATE_NO_BATTERY() {
		return SDL_POWERSTATE_NO_BATTERY;
	}

	private static final int SDL_POWERSTATE_CHARGING = (int) 3L;

	public static int SDL_POWERSTATE_CHARGING() {
		return SDL_POWERSTATE_CHARGING;
	}

	private static final int SDL_POWERSTATE_CHARGED = (int) 4L;

	public static int SDL_POWERSTATE_CHARGED() {
		return SDL_POWERSTATE_CHARGED;
	}

	private static class SDL_GetPowerInfo {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetPowerInfo");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetPowerInfo$descriptor() {
		return SDL_GetPowerInfo.DESC;
	}

	public static MethodHandle SDL_GetPowerInfo$handle() {
		return SDL_GetPowerInfo.HANDLE;
	}

	public static MemorySegment SDL_GetPowerInfo$address() {
		return SDL_GetPowerInfo.ADDR;
	}

	public static int SDL_GetPowerInfo(MemorySegment seconds, MemorySegment percent) {
		var mh$ = SDL_GetPowerInfo.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetPowerInfo", seconds, percent);
			}
			return (int) mh$.invokeExact(seconds, percent);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	public static OfInt SDL_SensorID = SDL3.C_INT;
	private static final int SDL_SENSOR_INVALID = (int) -1L;

	public static int SDL_SENSOR_INVALID() {
		return SDL_SENSOR_INVALID;
	}

	private static final int SDL_SENSOR_UNKNOWN = (int) 0L;

	public static int SDL_SENSOR_UNKNOWN() {
		return SDL_SENSOR_UNKNOWN;
	}

	private static final int SDL_SENSOR_ACCEL = (int) 1L;

	public static int SDL_SENSOR_ACCEL() {
		return SDL_SENSOR_ACCEL;
	}

	private static final int SDL_SENSOR_GYRO = (int) 2L;

	public static int SDL_SENSOR_GYRO() {
		return SDL_SENSOR_GYRO;
	}

	private static final int SDL_SENSOR_ACCEL_L = (int) 3L;

	public static int SDL_SENSOR_ACCEL_L() {
		return SDL_SENSOR_ACCEL_L;
	}

	private static final int SDL_SENSOR_GYRO_L = (int) 4L;

	public static int SDL_SENSOR_GYRO_L() {
		return SDL_SENSOR_GYRO_L;
	}

	private static final int SDL_SENSOR_ACCEL_R = (int) 5L;

	public static int SDL_SENSOR_ACCEL_R() {
		return SDL_SENSOR_ACCEL_R;
	}

	private static final int SDL_SENSOR_GYRO_R = (int) 6L;

	public static int SDL_SENSOR_GYRO_R() {
		return SDL_SENSOR_GYRO_R;
	}

	private static final int SDL_SENSOR_COUNT = (int) 7L;

	public static int SDL_SENSOR_COUNT() {
		return SDL_SENSOR_COUNT;
	}

	private static class SDL_GetSensors {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetSensors");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetSensors$descriptor() {
		return SDL_GetSensors.DESC;
	}

	public static MethodHandle SDL_GetSensors$handle() {
		return SDL_GetSensors.HANDLE;
	}

	public static MemorySegment SDL_GetSensors$address() {
		return SDL_GetSensors.ADDR;
	}

	public static MemorySegment SDL_GetSensors(MemorySegment count) {
		var mh$ = SDL_GetSensors.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetSensors", count);
			}
			return (MemorySegment) mh$.invokeExact(count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetSensorNameForID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetSensorNameForID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetSensorNameForID$descriptor() {
		return SDL_GetSensorNameForID.DESC;
	}

	public static MethodHandle SDL_GetSensorNameForID$handle() {
		return SDL_GetSensorNameForID.HANDLE;
	}

	public static MemorySegment SDL_GetSensorNameForID$address() {
		return SDL_GetSensorNameForID.ADDR;
	}

	public static MemorySegment SDL_GetSensorNameForID(int instance_id) {
		var mh$ = SDL_GetSensorNameForID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetSensorNameForID", instance_id);
			}
			return (MemorySegment) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetSensorTypeForID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetSensorTypeForID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetSensorTypeForID$descriptor() {
		return SDL_GetSensorTypeForID.DESC;
	}

	public static MethodHandle SDL_GetSensorTypeForID$handle() {
		return SDL_GetSensorTypeForID.HANDLE;
	}

	public static MemorySegment SDL_GetSensorTypeForID$address() {
		return SDL_GetSensorTypeForID.ADDR;
	}

	public static int SDL_GetSensorTypeForID(int instance_id) {
		var mh$ = SDL_GetSensorTypeForID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetSensorTypeForID", instance_id);
			}
			return (int) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetSensorNonPortableTypeForID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetSensorNonPortableTypeForID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetSensorNonPortableTypeForID$descriptor() {
		return SDL_GetSensorNonPortableTypeForID.DESC;
	}

	public static MethodHandle SDL_GetSensorNonPortableTypeForID$handle() {
		return SDL_GetSensorNonPortableTypeForID.HANDLE;
	}

	public static MemorySegment SDL_GetSensorNonPortableTypeForID$address() {
		return SDL_GetSensorNonPortableTypeForID.ADDR;
	}

	public static int SDL_GetSensorNonPortableTypeForID(int instance_id) {
		var mh$ = SDL_GetSensorNonPortableTypeForID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetSensorNonPortableTypeForID", instance_id);
			}
			return (int) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_OpenSensor {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_OpenSensor");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_OpenSensor$descriptor() {
		return SDL_OpenSensor.DESC;
	}

	public static MethodHandle SDL_OpenSensor$handle() {
		return SDL_OpenSensor.HANDLE;
	}

	public static MemorySegment SDL_OpenSensor$address() {
		return SDL_OpenSensor.ADDR;
	}

	public static MemorySegment SDL_OpenSensor(int instance_id) {
		var mh$ = SDL_OpenSensor.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_OpenSensor", instance_id);
			}
			return (MemorySegment) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetSensorFromID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetSensorFromID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetSensorFromID$descriptor() {
		return SDL_GetSensorFromID.DESC;
	}

	public static MethodHandle SDL_GetSensorFromID$handle() {
		return SDL_GetSensorFromID.HANDLE;
	}

	public static MemorySegment SDL_GetSensorFromID$address() {
		return SDL_GetSensorFromID.ADDR;
	}

	public static MemorySegment SDL_GetSensorFromID(int instance_id) {
		var mh$ = SDL_GetSensorFromID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetSensorFromID", instance_id);
			}
			return (MemorySegment) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetSensorProperties {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetSensorProperties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetSensorProperties$descriptor() {
		return SDL_GetSensorProperties.DESC;
	}

	public static MethodHandle SDL_GetSensorProperties$handle() {
		return SDL_GetSensorProperties.HANDLE;
	}

	public static MemorySegment SDL_GetSensorProperties$address() {
		return SDL_GetSensorProperties.ADDR;
	}

	public static int SDL_GetSensorProperties(MemorySegment sensor) {
		var mh$ = SDL_GetSensorProperties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetSensorProperties", sensor);
			}
			return (int) mh$.invokeExact(sensor);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetSensorName {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetSensorName");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetSensorName$descriptor() {
		return SDL_GetSensorName.DESC;
	}

	public static MethodHandle SDL_GetSensorName$handle() {
		return SDL_GetSensorName.HANDLE;
	}

	public static MemorySegment SDL_GetSensorName$address() {
		return SDL_GetSensorName.ADDR;
	}

	public static MemorySegment SDL_GetSensorName(MemorySegment sensor) {
		var mh$ = SDL_GetSensorName.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetSensorName", sensor);
			}
			return (MemorySegment) mh$.invokeExact(sensor);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetSensorType {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetSensorType");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetSensorType$descriptor() {
		return SDL_GetSensorType.DESC;
	}

	public static MethodHandle SDL_GetSensorType$handle() {
		return SDL_GetSensorType.HANDLE;
	}

	public static MemorySegment SDL_GetSensorType$address() {
		return SDL_GetSensorType.ADDR;
	}

	public static int SDL_GetSensorType(MemorySegment sensor) {
		var mh$ = SDL_GetSensorType.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetSensorType", sensor);
			}
			return (int) mh$.invokeExact(sensor);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetSensorNonPortableType {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetSensorNonPortableType");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetSensorNonPortableType$descriptor() {
		return SDL_GetSensorNonPortableType.DESC;
	}

	public static MethodHandle SDL_GetSensorNonPortableType$handle() {
		return SDL_GetSensorNonPortableType.HANDLE;
	}

	public static MemorySegment SDL_GetSensorNonPortableType$address() {
		return SDL_GetSensorNonPortableType.ADDR;
	}

	public static int SDL_GetSensorNonPortableType(MemorySegment sensor) {
		var mh$ = SDL_GetSensorNonPortableType.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetSensorNonPortableType", sensor);
			}
			return (int) mh$.invokeExact(sensor);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetSensorID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetSensorID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetSensorID$descriptor() {
		return SDL_GetSensorID.DESC;
	}

	public static MethodHandle SDL_GetSensorID$handle() {
		return SDL_GetSensorID.HANDLE;
	}

	public static MemorySegment SDL_GetSensorID$address() {
		return SDL_GetSensorID.ADDR;
	}

	public static int SDL_GetSensorID(MemorySegment sensor) {
		var mh$ = SDL_GetSensorID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetSensorID", sensor);
			}
			return (int) mh$.invokeExact(sensor);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetSensorData {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetSensorData");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetSensorData$descriptor() {
		return SDL_GetSensorData.DESC;
	}

	public static MethodHandle SDL_GetSensorData$handle() {
		return SDL_GetSensorData.HANDLE;
	}

	public static MemorySegment SDL_GetSensorData$address() {
		return SDL_GetSensorData.ADDR;
	}

	public static boolean SDL_GetSensorData(MemorySegment sensor, MemorySegment data, int num_values) {
		var mh$ = SDL_GetSensorData.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetSensorData", sensor, data, num_values);
			}
			return (boolean) mh$.invokeExact(sensor, data, num_values);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CloseSensor {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CloseSensor");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CloseSensor$descriptor() {
		return SDL_CloseSensor.DESC;
	}

	public static MethodHandle SDL_CloseSensor$handle() {
		return SDL_CloseSensor.HANDLE;
	}

	public static MemorySegment SDL_CloseSensor$address() {
		return SDL_CloseSensor.ADDR;
	}

	public static void SDL_CloseSensor(MemorySegment sensor) {
		var mh$ = SDL_CloseSensor.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CloseSensor", sensor);
			}
			mh$.invokeExact(sensor);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_UpdateSensors {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid();

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_UpdateSensors");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_UpdateSensors$descriptor() {
		return SDL_UpdateSensors.DESC;
	}

	public static MethodHandle SDL_UpdateSensors$handle() {
		return SDL_UpdateSensors.HANDLE;
	}

	public static MemorySegment SDL_UpdateSensors$address() {
		return SDL_UpdateSensors.ADDR;
	}

	public static void SDL_UpdateSensors() {
		var mh$ = SDL_UpdateSensors.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_UpdateSensors");
			}
			mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	public static OfInt SDL_JoystickID = SDL3.C_INT;
	private static final int SDL_JOYSTICK_TYPE_UNKNOWN = (int) 0L;

	public static int SDL_JOYSTICK_TYPE_UNKNOWN() {
		return SDL_JOYSTICK_TYPE_UNKNOWN;
	}

	private static final int SDL_JOYSTICK_TYPE_GAMEPAD = (int) 1L;

	public static int SDL_JOYSTICK_TYPE_GAMEPAD() {
		return SDL_JOYSTICK_TYPE_GAMEPAD;
	}

	private static final int SDL_JOYSTICK_TYPE_WHEEL = (int) 2L;

	public static int SDL_JOYSTICK_TYPE_WHEEL() {
		return SDL_JOYSTICK_TYPE_WHEEL;
	}

	private static final int SDL_JOYSTICK_TYPE_ARCADE_STICK = (int) 3L;

	public static int SDL_JOYSTICK_TYPE_ARCADE_STICK() {
		return SDL_JOYSTICK_TYPE_ARCADE_STICK;
	}

	private static final int SDL_JOYSTICK_TYPE_FLIGHT_STICK = (int) 4L;

	public static int SDL_JOYSTICK_TYPE_FLIGHT_STICK() {
		return SDL_JOYSTICK_TYPE_FLIGHT_STICK;
	}

	private static final int SDL_JOYSTICK_TYPE_DANCE_PAD = (int) 5L;

	public static int SDL_JOYSTICK_TYPE_DANCE_PAD() {
		return SDL_JOYSTICK_TYPE_DANCE_PAD;
	}

	private static final int SDL_JOYSTICK_TYPE_GUITAR = (int) 6L;

	public static int SDL_JOYSTICK_TYPE_GUITAR() {
		return SDL_JOYSTICK_TYPE_GUITAR;
	}

	private static final int SDL_JOYSTICK_TYPE_DRUM_KIT = (int) 7L;

	public static int SDL_JOYSTICK_TYPE_DRUM_KIT() {
		return SDL_JOYSTICK_TYPE_DRUM_KIT;
	}

	private static final int SDL_JOYSTICK_TYPE_ARCADE_PAD = (int) 8L;

	public static int SDL_JOYSTICK_TYPE_ARCADE_PAD() {
		return SDL_JOYSTICK_TYPE_ARCADE_PAD;
	}

	private static final int SDL_JOYSTICK_TYPE_THROTTLE = (int) 9L;

	public static int SDL_JOYSTICK_TYPE_THROTTLE() {
		return SDL_JOYSTICK_TYPE_THROTTLE;
	}

	private static final int SDL_JOYSTICK_TYPE_COUNT = (int) 10L;

	public static int SDL_JOYSTICK_TYPE_COUNT() {
		return SDL_JOYSTICK_TYPE_COUNT;
	}

	private static final int SDL_JOYSTICK_CONNECTION_INVALID = (int) -1L;

	public static int SDL_JOYSTICK_CONNECTION_INVALID() {
		return SDL_JOYSTICK_CONNECTION_INVALID;
	}

	private static final int SDL_JOYSTICK_CONNECTION_UNKNOWN = (int) 0L;

	public static int SDL_JOYSTICK_CONNECTION_UNKNOWN() {
		return SDL_JOYSTICK_CONNECTION_UNKNOWN;
	}

	private static final int SDL_JOYSTICK_CONNECTION_WIRED = (int) 1L;

	public static int SDL_JOYSTICK_CONNECTION_WIRED() {
		return SDL_JOYSTICK_CONNECTION_WIRED;
	}

	private static final int SDL_JOYSTICK_CONNECTION_WIRELESS = (int) 2L;

	public static int SDL_JOYSTICK_CONNECTION_WIRELESS() {
		return SDL_JOYSTICK_CONNECTION_WIRELESS;
	}

	private static class SDL_LockJoysticks {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid();

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_LockJoysticks");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_LockJoysticks$descriptor() {
		return SDL_LockJoysticks.DESC;
	}

	public static MethodHandle SDL_LockJoysticks$handle() {
		return SDL_LockJoysticks.HANDLE;
	}

	public static MemorySegment SDL_LockJoysticks$address() {
		return SDL_LockJoysticks.ADDR;
	}

	public static void SDL_LockJoysticks() {
		var mh$ = SDL_LockJoysticks.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_LockJoysticks");
			}
			mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_UnlockJoysticks {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid();

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_UnlockJoysticks");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_UnlockJoysticks$descriptor() {
		return SDL_UnlockJoysticks.DESC;
	}

	public static MethodHandle SDL_UnlockJoysticks$handle() {
		return SDL_UnlockJoysticks.HANDLE;
	}

	public static MemorySegment SDL_UnlockJoysticks$address() {
		return SDL_UnlockJoysticks.ADDR;
	}

	public static void SDL_UnlockJoysticks() {
		var mh$ = SDL_UnlockJoysticks.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_UnlockJoysticks");
			}
			mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_HasJoystick {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_HasJoystick");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_HasJoystick$descriptor() {
		return SDL_HasJoystick.DESC;
	}

	public static MethodHandle SDL_HasJoystick$handle() {
		return SDL_HasJoystick.HANDLE;
	}

	public static MemorySegment SDL_HasJoystick$address() {
		return SDL_HasJoystick.ADDR;
	}

	public static boolean SDL_HasJoystick() {
		var mh$ = SDL_HasJoystick.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_HasJoystick");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetJoysticks {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetJoysticks");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetJoysticks$descriptor() {
		return SDL_GetJoysticks.DESC;
	}

	public static MethodHandle SDL_GetJoysticks$handle() {
		return SDL_GetJoysticks.HANDLE;
	}

	public static MemorySegment SDL_GetJoysticks$address() {
		return SDL_GetJoysticks.ADDR;
	}

	public static MemorySegment SDL_GetJoysticks(MemorySegment count) {
		var mh$ = SDL_GetJoysticks.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetJoysticks", count);
			}
			return (MemorySegment) mh$.invokeExact(count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetJoystickNameForID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetJoystickNameForID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetJoystickNameForID$descriptor() {
		return SDL_GetJoystickNameForID.DESC;
	}

	public static MethodHandle SDL_GetJoystickNameForID$handle() {
		return SDL_GetJoystickNameForID.HANDLE;
	}

	public static MemorySegment SDL_GetJoystickNameForID$address() {
		return SDL_GetJoystickNameForID.ADDR;
	}

	public static MemorySegment SDL_GetJoystickNameForID(int instance_id) {
		var mh$ = SDL_GetJoystickNameForID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetJoystickNameForID", instance_id);
			}
			return (MemorySegment) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetJoystickPathForID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetJoystickPathForID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetJoystickPathForID$descriptor() {
		return SDL_GetJoystickPathForID.DESC;
	}

	public static MethodHandle SDL_GetJoystickPathForID$handle() {
		return SDL_GetJoystickPathForID.HANDLE;
	}

	public static MemorySegment SDL_GetJoystickPathForID$address() {
		return SDL_GetJoystickPathForID.ADDR;
	}

	public static MemorySegment SDL_GetJoystickPathForID(int instance_id) {
		var mh$ = SDL_GetJoystickPathForID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetJoystickPathForID", instance_id);
			}
			return (MemorySegment) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetJoystickPlayerIndexForID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetJoystickPlayerIndexForID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetJoystickPlayerIndexForID$descriptor() {
		return SDL_GetJoystickPlayerIndexForID.DESC;
	}

	public static MethodHandle SDL_GetJoystickPlayerIndexForID$handle() {
		return SDL_GetJoystickPlayerIndexForID.HANDLE;
	}

	public static MemorySegment SDL_GetJoystickPlayerIndexForID$address() {
		return SDL_GetJoystickPlayerIndexForID.ADDR;
	}

	public static int SDL_GetJoystickPlayerIndexForID(int instance_id) {
		var mh$ = SDL_GetJoystickPlayerIndexForID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetJoystickPlayerIndexForID", instance_id);
			}
			return (int) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetJoystickGUIDForID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL_GUID.layout(),
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetJoystickGUIDForID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetJoystickGUIDForID$descriptor() {
		return SDL_GetJoystickGUIDForID.DESC;
	}

	public static MethodHandle SDL_GetJoystickGUIDForID$handle() {
		return SDL_GetJoystickGUIDForID.HANDLE;
	}

	public static MemorySegment SDL_GetJoystickGUIDForID$address() {
		return SDL_GetJoystickGUIDForID.ADDR;
	}

	public static MemorySegment SDL_GetJoystickGUIDForID(SegmentAllocator allocator, int instance_id) {
		var mh$ = SDL_GetJoystickGUIDForID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetJoystickGUIDForID", allocator, instance_id);
			}
			return (MemorySegment) mh$.invokeExact(allocator, instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetJoystickVendorForID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_SHORT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetJoystickVendorForID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetJoystickVendorForID$descriptor() {
		return SDL_GetJoystickVendorForID.DESC;
	}

	public static MethodHandle SDL_GetJoystickVendorForID$handle() {
		return SDL_GetJoystickVendorForID.HANDLE;
	}

	public static MemorySegment SDL_GetJoystickVendorForID$address() {
		return SDL_GetJoystickVendorForID.ADDR;
	}

	public static short SDL_GetJoystickVendorForID(int instance_id) {
		var mh$ = SDL_GetJoystickVendorForID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetJoystickVendorForID", instance_id);
			}
			return (short) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetJoystickProductForID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_SHORT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetJoystickProductForID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetJoystickProductForID$descriptor() {
		return SDL_GetJoystickProductForID.DESC;
	}

	public static MethodHandle SDL_GetJoystickProductForID$handle() {
		return SDL_GetJoystickProductForID.HANDLE;
	}

	public static MemorySegment SDL_GetJoystickProductForID$address() {
		return SDL_GetJoystickProductForID.ADDR;
	}

	public static short SDL_GetJoystickProductForID(int instance_id) {
		var mh$ = SDL_GetJoystickProductForID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetJoystickProductForID", instance_id);
			}
			return (short) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetJoystickProductVersionForID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_SHORT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetJoystickProductVersionForID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetJoystickProductVersionForID$descriptor() {
		return SDL_GetJoystickProductVersionForID.DESC;
	}

	public static MethodHandle SDL_GetJoystickProductVersionForID$handle() {
		return SDL_GetJoystickProductVersionForID.HANDLE;
	}

	public static MemorySegment SDL_GetJoystickProductVersionForID$address() {
		return SDL_GetJoystickProductVersionForID.ADDR;
	}

	public static short SDL_GetJoystickProductVersionForID(int instance_id) {
		var mh$ = SDL_GetJoystickProductVersionForID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetJoystickProductVersionForID", instance_id);
			}
			return (short) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetJoystickTypeForID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetJoystickTypeForID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetJoystickTypeForID$descriptor() {
		return SDL_GetJoystickTypeForID.DESC;
	}

	public static MethodHandle SDL_GetJoystickTypeForID$handle() {
		return SDL_GetJoystickTypeForID.HANDLE;
	}

	public static MemorySegment SDL_GetJoystickTypeForID$address() {
		return SDL_GetJoystickTypeForID.ADDR;
	}

	public static int SDL_GetJoystickTypeForID(int instance_id) {
		var mh$ = SDL_GetJoystickTypeForID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetJoystickTypeForID", instance_id);
			}
			return (int) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_OpenJoystick {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_OpenJoystick");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_OpenJoystick$descriptor() {
		return SDL_OpenJoystick.DESC;
	}

	public static MethodHandle SDL_OpenJoystick$handle() {
		return SDL_OpenJoystick.HANDLE;
	}

	public static MemorySegment SDL_OpenJoystick$address() {
		return SDL_OpenJoystick.ADDR;
	}

	public static MemorySegment SDL_OpenJoystick(int instance_id) {
		var mh$ = SDL_OpenJoystick.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_OpenJoystick", instance_id);
			}
			return (MemorySegment) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetJoystickFromID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetJoystickFromID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetJoystickFromID$descriptor() {
		return SDL_GetJoystickFromID.DESC;
	}

	public static MethodHandle SDL_GetJoystickFromID$handle() {
		return SDL_GetJoystickFromID.HANDLE;
	}

	public static MemorySegment SDL_GetJoystickFromID$address() {
		return SDL_GetJoystickFromID.ADDR;
	}

	public static MemorySegment SDL_GetJoystickFromID(int instance_id) {
		var mh$ = SDL_GetJoystickFromID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetJoystickFromID", instance_id);
			}
			return (MemorySegment) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetJoystickFromPlayerIndex {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetJoystickFromPlayerIndex");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetJoystickFromPlayerIndex$descriptor() {
		return SDL_GetJoystickFromPlayerIndex.DESC;
	}

	public static MethodHandle SDL_GetJoystickFromPlayerIndex$handle() {
		return SDL_GetJoystickFromPlayerIndex.HANDLE;
	}

	public static MemorySegment SDL_GetJoystickFromPlayerIndex$address() {
		return SDL_GetJoystickFromPlayerIndex.ADDR;
	}

	public static MemorySegment SDL_GetJoystickFromPlayerIndex(int player_index) {
		var mh$ = SDL_GetJoystickFromPlayerIndex.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetJoystickFromPlayerIndex", player_index);
			}
			return (MemorySegment) mh$.invokeExact(player_index);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_AttachVirtualJoystick {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_AttachVirtualJoystick");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_AttachVirtualJoystick$descriptor() {
		return SDL_AttachVirtualJoystick.DESC;
	}

	public static MethodHandle SDL_AttachVirtualJoystick$handle() {
		return SDL_AttachVirtualJoystick.HANDLE;
	}

	public static MemorySegment SDL_AttachVirtualJoystick$address() {
		return SDL_AttachVirtualJoystick.ADDR;
	}

	public static int SDL_AttachVirtualJoystick(MemorySegment desc) {
		var mh$ = SDL_AttachVirtualJoystick.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_AttachVirtualJoystick", desc);
			}
			return (int) mh$.invokeExact(desc);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DetachVirtualJoystick {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DetachVirtualJoystick");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DetachVirtualJoystick$descriptor() {
		return SDL_DetachVirtualJoystick.DESC;
	}

	public static MethodHandle SDL_DetachVirtualJoystick$handle() {
		return SDL_DetachVirtualJoystick.HANDLE;
	}

	public static MemorySegment SDL_DetachVirtualJoystick$address() {
		return SDL_DetachVirtualJoystick.ADDR;
	}

	public static boolean SDL_DetachVirtualJoystick(int instance_id) {
		var mh$ = SDL_DetachVirtualJoystick.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DetachVirtualJoystick", instance_id);
			}
			return (boolean) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_IsJoystickVirtual {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_IsJoystickVirtual");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_IsJoystickVirtual$descriptor() {
		return SDL_IsJoystickVirtual.DESC;
	}

	public static MethodHandle SDL_IsJoystickVirtual$handle() {
		return SDL_IsJoystickVirtual.HANDLE;
	}

	public static MemorySegment SDL_IsJoystickVirtual$address() {
		return SDL_IsJoystickVirtual.ADDR;
	}

	public static boolean SDL_IsJoystickVirtual(int instance_id) {
		var mh$ = SDL_IsJoystickVirtual.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_IsJoystickVirtual", instance_id);
			}
			return (boolean) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetJoystickVirtualAxis {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_SHORT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetJoystickVirtualAxis");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetJoystickVirtualAxis$descriptor() {
		return SDL_SetJoystickVirtualAxis.DESC;
	}

	public static MethodHandle SDL_SetJoystickVirtualAxis$handle() {
		return SDL_SetJoystickVirtualAxis.HANDLE;
	}

	public static MemorySegment SDL_SetJoystickVirtualAxis$address() {
		return SDL_SetJoystickVirtualAxis.ADDR;
	}

	public static boolean SDL_SetJoystickVirtualAxis(MemorySegment joystick, int axis, short value) {
		var mh$ = SDL_SetJoystickVirtualAxis.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetJoystickVirtualAxis", joystick, axis, value);
			}
			return (boolean) mh$.invokeExact(joystick, axis, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetJoystickVirtualBall {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_SHORT,
				SDL3.C_SHORT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetJoystickVirtualBall");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetJoystickVirtualBall$descriptor() {
		return SDL_SetJoystickVirtualBall.DESC;
	}

	public static MethodHandle SDL_SetJoystickVirtualBall$handle() {
		return SDL_SetJoystickVirtualBall.HANDLE;
	}

	public static MemorySegment SDL_SetJoystickVirtualBall$address() {
		return SDL_SetJoystickVirtualBall.ADDR;
	}

	public static boolean SDL_SetJoystickVirtualBall(MemorySegment joystick, int ball, short xrel, short yrel) {
		var mh$ = SDL_SetJoystickVirtualBall.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetJoystickVirtualBall", joystick, ball, xrel, yrel);
			}
			return (boolean) mh$.invokeExact(joystick, ball, xrel, yrel);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetJoystickVirtualButton {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetJoystickVirtualButton");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetJoystickVirtualButton$descriptor() {
		return SDL_SetJoystickVirtualButton.DESC;
	}

	public static MethodHandle SDL_SetJoystickVirtualButton$handle() {
		return SDL_SetJoystickVirtualButton.HANDLE;
	}

	public static MemorySegment SDL_SetJoystickVirtualButton$address() {
		return SDL_SetJoystickVirtualButton.ADDR;
	}

	public static boolean SDL_SetJoystickVirtualButton(MemorySegment joystick, int button, boolean down) {
		var mh$ = SDL_SetJoystickVirtualButton.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetJoystickVirtualButton", joystick, button, down);
			}
			return (boolean) mh$.invokeExact(joystick, button, down);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetJoystickVirtualHat {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_CHAR
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetJoystickVirtualHat");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetJoystickVirtualHat$descriptor() {
		return SDL_SetJoystickVirtualHat.DESC;
	}

	public static MethodHandle SDL_SetJoystickVirtualHat$handle() {
		return SDL_SetJoystickVirtualHat.HANDLE;
	}

	public static MemorySegment SDL_SetJoystickVirtualHat$address() {
		return SDL_SetJoystickVirtualHat.ADDR;
	}

	public static boolean SDL_SetJoystickVirtualHat(MemorySegment joystick, int hat, byte value) {
		var mh$ = SDL_SetJoystickVirtualHat.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetJoystickVirtualHat", joystick, hat, value);
			}
			return (boolean) mh$.invokeExact(joystick, hat, value);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetJoystickVirtualTouchpad {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_BOOL,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetJoystickVirtualTouchpad");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetJoystickVirtualTouchpad$descriptor() {
		return SDL_SetJoystickVirtualTouchpad.DESC;
	}

	public static MethodHandle SDL_SetJoystickVirtualTouchpad$handle() {
		return SDL_SetJoystickVirtualTouchpad.HANDLE;
	}

	public static MemorySegment SDL_SetJoystickVirtualTouchpad$address() {
		return SDL_SetJoystickVirtualTouchpad.ADDR;
	}

	public static boolean SDL_SetJoystickVirtualTouchpad(MemorySegment joystick, int touchpad, int finger, boolean down, float x, float y, float pressure) {
		var mh$ = SDL_SetJoystickVirtualTouchpad.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetJoystickVirtualTouchpad", joystick, touchpad, finger, down, x, y, pressure);
			}
			return (boolean) mh$.invokeExact(joystick, touchpad, finger, down, x, y, pressure);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SendJoystickVirtualSensorData {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_LONG,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SendJoystickVirtualSensorData");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SendJoystickVirtualSensorData$descriptor() {
		return SDL_SendJoystickVirtualSensorData.DESC;
	}

	public static MethodHandle SDL_SendJoystickVirtualSensorData$handle() {
		return SDL_SendJoystickVirtualSensorData.HANDLE;
	}

	public static MemorySegment SDL_SendJoystickVirtualSensorData$address() {
		return SDL_SendJoystickVirtualSensorData.ADDR;
	}

	public static boolean SDL_SendJoystickVirtualSensorData(MemorySegment joystick, int type, long sensor_timestamp, MemorySegment data, int num_values) {
		var mh$ = SDL_SendJoystickVirtualSensorData.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SendJoystickVirtualSensorData", joystick, type, sensor_timestamp, data, num_values);
			}
			return (boolean) mh$.invokeExact(joystick, type, sensor_timestamp, data, num_values);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetJoystickProperties {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetJoystickProperties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetJoystickProperties$descriptor() {
		return SDL_GetJoystickProperties.DESC;
	}

	public static MethodHandle SDL_GetJoystickProperties$handle() {
		return SDL_GetJoystickProperties.HANDLE;
	}

	public static MemorySegment SDL_GetJoystickProperties$address() {
		return SDL_GetJoystickProperties.ADDR;
	}

	public static int SDL_GetJoystickProperties(MemorySegment joystick) {
		var mh$ = SDL_GetJoystickProperties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetJoystickProperties", joystick);
			}
			return (int) mh$.invokeExact(joystick);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetJoystickName {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetJoystickName");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetJoystickName$descriptor() {
		return SDL_GetJoystickName.DESC;
	}

	public static MethodHandle SDL_GetJoystickName$handle() {
		return SDL_GetJoystickName.HANDLE;
	}

	public static MemorySegment SDL_GetJoystickName$address() {
		return SDL_GetJoystickName.ADDR;
	}

	public static MemorySegment SDL_GetJoystickName(MemorySegment joystick) {
		var mh$ = SDL_GetJoystickName.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetJoystickName", joystick);
			}
			return (MemorySegment) mh$.invokeExact(joystick);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetJoystickPath {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetJoystickPath");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetJoystickPath$descriptor() {
		return SDL_GetJoystickPath.DESC;
	}

	public static MethodHandle SDL_GetJoystickPath$handle() {
		return SDL_GetJoystickPath.HANDLE;
	}

	public static MemorySegment SDL_GetJoystickPath$address() {
		return SDL_GetJoystickPath.ADDR;
	}

	public static MemorySegment SDL_GetJoystickPath(MemorySegment joystick) {
		var mh$ = SDL_GetJoystickPath.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetJoystickPath", joystick);
			}
			return (MemorySegment) mh$.invokeExact(joystick);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetJoystickPlayerIndex {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetJoystickPlayerIndex");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetJoystickPlayerIndex$descriptor() {
		return SDL_GetJoystickPlayerIndex.DESC;
	}

	public static MethodHandle SDL_GetJoystickPlayerIndex$handle() {
		return SDL_GetJoystickPlayerIndex.HANDLE;
	}

	public static MemorySegment SDL_GetJoystickPlayerIndex$address() {
		return SDL_GetJoystickPlayerIndex.ADDR;
	}

	public static int SDL_GetJoystickPlayerIndex(MemorySegment joystick) {
		var mh$ = SDL_GetJoystickPlayerIndex.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetJoystickPlayerIndex", joystick);
			}
			return (int) mh$.invokeExact(joystick);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetJoystickPlayerIndex {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetJoystickPlayerIndex");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetJoystickPlayerIndex$descriptor() {
		return SDL_SetJoystickPlayerIndex.DESC;
	}

	public static MethodHandle SDL_SetJoystickPlayerIndex$handle() {
		return SDL_SetJoystickPlayerIndex.HANDLE;
	}

	public static MemorySegment SDL_SetJoystickPlayerIndex$address() {
		return SDL_SetJoystickPlayerIndex.ADDR;
	}

	public static boolean SDL_SetJoystickPlayerIndex(MemorySegment joystick, int player_index) {
		var mh$ = SDL_SetJoystickPlayerIndex.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetJoystickPlayerIndex", joystick, player_index);
			}
			return (boolean) mh$.invokeExact(joystick, player_index);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetJoystickGUID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL_GUID.layout(),
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetJoystickGUID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetJoystickGUID$descriptor() {
		return SDL_GetJoystickGUID.DESC;
	}

	public static MethodHandle SDL_GetJoystickGUID$handle() {
		return SDL_GetJoystickGUID.HANDLE;
	}

	public static MemorySegment SDL_GetJoystickGUID$address() {
		return SDL_GetJoystickGUID.ADDR;
	}

	public static MemorySegment SDL_GetJoystickGUID(SegmentAllocator allocator, MemorySegment joystick) {
		var mh$ = SDL_GetJoystickGUID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetJoystickGUID", allocator, joystick);
			}
			return (MemorySegment) mh$.invokeExact(allocator, joystick);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetJoystickVendor {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_SHORT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetJoystickVendor");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetJoystickVendor$descriptor() {
		return SDL_GetJoystickVendor.DESC;
	}

	public static MethodHandle SDL_GetJoystickVendor$handle() {
		return SDL_GetJoystickVendor.HANDLE;
	}

	public static MemorySegment SDL_GetJoystickVendor$address() {
		return SDL_GetJoystickVendor.ADDR;
	}

	public static short SDL_GetJoystickVendor(MemorySegment joystick) {
		var mh$ = SDL_GetJoystickVendor.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetJoystickVendor", joystick);
			}
			return (short) mh$.invokeExact(joystick);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetJoystickProduct {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_SHORT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetJoystickProduct");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetJoystickProduct$descriptor() {
		return SDL_GetJoystickProduct.DESC;
	}

	public static MethodHandle SDL_GetJoystickProduct$handle() {
		return SDL_GetJoystickProduct.HANDLE;
	}

	public static MemorySegment SDL_GetJoystickProduct$address() {
		return SDL_GetJoystickProduct.ADDR;
	}

	public static short SDL_GetJoystickProduct(MemorySegment joystick) {
		var mh$ = SDL_GetJoystickProduct.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetJoystickProduct", joystick);
			}
			return (short) mh$.invokeExact(joystick);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetJoystickProductVersion {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_SHORT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetJoystickProductVersion");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetJoystickProductVersion$descriptor() {
		return SDL_GetJoystickProductVersion.DESC;
	}

	public static MethodHandle SDL_GetJoystickProductVersion$handle() {
		return SDL_GetJoystickProductVersion.HANDLE;
	}

	public static MemorySegment SDL_GetJoystickProductVersion$address() {
		return SDL_GetJoystickProductVersion.ADDR;
	}

	public static short SDL_GetJoystickProductVersion(MemorySegment joystick) {
		var mh$ = SDL_GetJoystickProductVersion.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetJoystickProductVersion", joystick);
			}
			return (short) mh$.invokeExact(joystick);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetJoystickFirmwareVersion {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_SHORT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetJoystickFirmwareVersion");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetJoystickFirmwareVersion$descriptor() {
		return SDL_GetJoystickFirmwareVersion.DESC;
	}

	public static MethodHandle SDL_GetJoystickFirmwareVersion$handle() {
		return SDL_GetJoystickFirmwareVersion.HANDLE;
	}

	public static MemorySegment SDL_GetJoystickFirmwareVersion$address() {
		return SDL_GetJoystickFirmwareVersion.ADDR;
	}

	public static short SDL_GetJoystickFirmwareVersion(MemorySegment joystick) {
		var mh$ = SDL_GetJoystickFirmwareVersion.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetJoystickFirmwareVersion", joystick);
			}
			return (short) mh$.invokeExact(joystick);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetJoystickSerial {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetJoystickSerial");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetJoystickSerial$descriptor() {
		return SDL_GetJoystickSerial.DESC;
	}

	public static MethodHandle SDL_GetJoystickSerial$handle() {
		return SDL_GetJoystickSerial.HANDLE;
	}

	public static MemorySegment SDL_GetJoystickSerial$address() {
		return SDL_GetJoystickSerial.ADDR;
	}

	public static MemorySegment SDL_GetJoystickSerial(MemorySegment joystick) {
		var mh$ = SDL_GetJoystickSerial.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetJoystickSerial", joystick);
			}
			return (MemorySegment) mh$.invokeExact(joystick);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetJoystickType {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetJoystickType");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetJoystickType$descriptor() {
		return SDL_GetJoystickType.DESC;
	}

	public static MethodHandle SDL_GetJoystickType$handle() {
		return SDL_GetJoystickType.HANDLE;
	}

	public static MemorySegment SDL_GetJoystickType$address() {
		return SDL_GetJoystickType.ADDR;
	}

	public static int SDL_GetJoystickType(MemorySegment joystick) {
		var mh$ = SDL_GetJoystickType.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetJoystickType", joystick);
			}
			return (int) mh$.invokeExact(joystick);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetJoystickGUIDInfo {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL_GUID.layout(),
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetJoystickGUIDInfo");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetJoystickGUIDInfo$descriptor() {
		return SDL_GetJoystickGUIDInfo.DESC;
	}

	public static MethodHandle SDL_GetJoystickGUIDInfo$handle() {
		return SDL_GetJoystickGUIDInfo.HANDLE;
	}

	public static MemorySegment SDL_GetJoystickGUIDInfo$address() {
		return SDL_GetJoystickGUIDInfo.ADDR;
	}

	public static void SDL_GetJoystickGUIDInfo(MemorySegment guid, MemorySegment vendor, MemorySegment product, MemorySegment version, MemorySegment crc16) {
		var mh$ = SDL_GetJoystickGUIDInfo.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetJoystickGUIDInfo", guid, vendor, product, version, crc16);
			}
			mh$.invokeExact(guid, vendor, product, version, crc16);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_JoystickConnected {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_JoystickConnected");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_JoystickConnected$descriptor() {
		return SDL_JoystickConnected.DESC;
	}

	public static MethodHandle SDL_JoystickConnected$handle() {
		return SDL_JoystickConnected.HANDLE;
	}

	public static MemorySegment SDL_JoystickConnected$address() {
		return SDL_JoystickConnected.ADDR;
	}

	public static boolean SDL_JoystickConnected(MemorySegment joystick) {
		var mh$ = SDL_JoystickConnected.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_JoystickConnected", joystick);
			}
			return (boolean) mh$.invokeExact(joystick);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetJoystickID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetJoystickID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetJoystickID$descriptor() {
		return SDL_GetJoystickID.DESC;
	}

	public static MethodHandle SDL_GetJoystickID$handle() {
		return SDL_GetJoystickID.HANDLE;
	}

	public static MemorySegment SDL_GetJoystickID$address() {
		return SDL_GetJoystickID.ADDR;
	}

	public static int SDL_GetJoystickID(MemorySegment joystick) {
		var mh$ = SDL_GetJoystickID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetJoystickID", joystick);
			}
			return (int) mh$.invokeExact(joystick);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetNumJoystickAxes {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetNumJoystickAxes");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetNumJoystickAxes$descriptor() {
		return SDL_GetNumJoystickAxes.DESC;
	}

	public static MethodHandle SDL_GetNumJoystickAxes$handle() {
		return SDL_GetNumJoystickAxes.HANDLE;
	}

	public static MemorySegment SDL_GetNumJoystickAxes$address() {
		return SDL_GetNumJoystickAxes.ADDR;
	}

	public static int SDL_GetNumJoystickAxes(MemorySegment joystick) {
		var mh$ = SDL_GetNumJoystickAxes.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetNumJoystickAxes", joystick);
			}
			return (int) mh$.invokeExact(joystick);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetNumJoystickBalls {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetNumJoystickBalls");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetNumJoystickBalls$descriptor() {
		return SDL_GetNumJoystickBalls.DESC;
	}

	public static MethodHandle SDL_GetNumJoystickBalls$handle() {
		return SDL_GetNumJoystickBalls.HANDLE;
	}

	public static MemorySegment SDL_GetNumJoystickBalls$address() {
		return SDL_GetNumJoystickBalls.ADDR;
	}

	public static int SDL_GetNumJoystickBalls(MemorySegment joystick) {
		var mh$ = SDL_GetNumJoystickBalls.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetNumJoystickBalls", joystick);
			}
			return (int) mh$.invokeExact(joystick);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetNumJoystickHats {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetNumJoystickHats");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetNumJoystickHats$descriptor() {
		return SDL_GetNumJoystickHats.DESC;
	}

	public static MethodHandle SDL_GetNumJoystickHats$handle() {
		return SDL_GetNumJoystickHats.HANDLE;
	}

	public static MemorySegment SDL_GetNumJoystickHats$address() {
		return SDL_GetNumJoystickHats.ADDR;
	}

	public static int SDL_GetNumJoystickHats(MemorySegment joystick) {
		var mh$ = SDL_GetNumJoystickHats.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetNumJoystickHats", joystick);
			}
			return (int) mh$.invokeExact(joystick);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetNumJoystickButtons {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetNumJoystickButtons");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetNumJoystickButtons$descriptor() {
		return SDL_GetNumJoystickButtons.DESC;
	}

	public static MethodHandle SDL_GetNumJoystickButtons$handle() {
		return SDL_GetNumJoystickButtons.HANDLE;
	}

	public static MemorySegment SDL_GetNumJoystickButtons$address() {
		return SDL_GetNumJoystickButtons.ADDR;
	}

	public static int SDL_GetNumJoystickButtons(MemorySegment joystick) {
		var mh$ = SDL_GetNumJoystickButtons.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetNumJoystickButtons", joystick);
			}
			return (int) mh$.invokeExact(joystick);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetJoystickEventsEnabled {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetJoystickEventsEnabled");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetJoystickEventsEnabled$descriptor() {
		return SDL_SetJoystickEventsEnabled.DESC;
	}

	public static MethodHandle SDL_SetJoystickEventsEnabled$handle() {
		return SDL_SetJoystickEventsEnabled.HANDLE;
	}

	public static MemorySegment SDL_SetJoystickEventsEnabled$address() {
		return SDL_SetJoystickEventsEnabled.ADDR;
	}

	public static void SDL_SetJoystickEventsEnabled(boolean enabled) {
		var mh$ = SDL_SetJoystickEventsEnabled.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetJoystickEventsEnabled", enabled);
			}
			mh$.invokeExact(enabled);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_JoystickEventsEnabled {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_JoystickEventsEnabled");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_JoystickEventsEnabled$descriptor() {
		return SDL_JoystickEventsEnabled.DESC;
	}

	public static MethodHandle SDL_JoystickEventsEnabled$handle() {
		return SDL_JoystickEventsEnabled.HANDLE;
	}

	public static MemorySegment SDL_JoystickEventsEnabled$address() {
		return SDL_JoystickEventsEnabled.ADDR;
	}

	public static boolean SDL_JoystickEventsEnabled() {
		var mh$ = SDL_JoystickEventsEnabled.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_JoystickEventsEnabled");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_UpdateJoysticks {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid();

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_UpdateJoysticks");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_UpdateJoysticks$descriptor() {
		return SDL_UpdateJoysticks.DESC;
	}

	public static MethodHandle SDL_UpdateJoysticks$handle() {
		return SDL_UpdateJoysticks.HANDLE;
	}

	public static MemorySegment SDL_UpdateJoysticks$address() {
		return SDL_UpdateJoysticks.ADDR;
	}

	public static void SDL_UpdateJoysticks() {
		var mh$ = SDL_UpdateJoysticks.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_UpdateJoysticks");
			}
			mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetJoystickAxis {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_SHORT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetJoystickAxis");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetJoystickAxis$descriptor() {
		return SDL_GetJoystickAxis.DESC;
	}

	public static MethodHandle SDL_GetJoystickAxis$handle() {
		return SDL_GetJoystickAxis.HANDLE;
	}

	public static MemorySegment SDL_GetJoystickAxis$address() {
		return SDL_GetJoystickAxis.ADDR;
	}

	public static short SDL_GetJoystickAxis(MemorySegment joystick, int axis) {
		var mh$ = SDL_GetJoystickAxis.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetJoystickAxis", joystick, axis);
			}
			return (short) mh$.invokeExact(joystick, axis);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetJoystickAxisInitialState {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetJoystickAxisInitialState");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetJoystickAxisInitialState$descriptor() {
		return SDL_GetJoystickAxisInitialState.DESC;
	}

	public static MethodHandle SDL_GetJoystickAxisInitialState$handle() {
		return SDL_GetJoystickAxisInitialState.HANDLE;
	}

	public static MemorySegment SDL_GetJoystickAxisInitialState$address() {
		return SDL_GetJoystickAxisInitialState.ADDR;
	}

	public static boolean SDL_GetJoystickAxisInitialState(MemorySegment joystick, int axis, MemorySegment state) {
		var mh$ = SDL_GetJoystickAxisInitialState.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetJoystickAxisInitialState", joystick, axis, state);
			}
			return (boolean) mh$.invokeExact(joystick, axis, state);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetJoystickBall {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetJoystickBall");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetJoystickBall$descriptor() {
		return SDL_GetJoystickBall.DESC;
	}

	public static MethodHandle SDL_GetJoystickBall$handle() {
		return SDL_GetJoystickBall.HANDLE;
	}

	public static MemorySegment SDL_GetJoystickBall$address() {
		return SDL_GetJoystickBall.ADDR;
	}

	public static boolean SDL_GetJoystickBall(MemorySegment joystick, int ball, MemorySegment dx, MemorySegment dy) {
		var mh$ = SDL_GetJoystickBall.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetJoystickBall", joystick, ball, dx, dy);
			}
			return (boolean) mh$.invokeExact(joystick, ball, dx, dy);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetJoystickHat {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_CHAR,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetJoystickHat");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetJoystickHat$descriptor() {
		return SDL_GetJoystickHat.DESC;
	}

	public static MethodHandle SDL_GetJoystickHat$handle() {
		return SDL_GetJoystickHat.HANDLE;
	}

	public static MemorySegment SDL_GetJoystickHat$address() {
		return SDL_GetJoystickHat.ADDR;
	}

	public static byte SDL_GetJoystickHat(MemorySegment joystick, int hat) {
		var mh$ = SDL_GetJoystickHat.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetJoystickHat", joystick, hat);
			}
			return (byte) mh$.invokeExact(joystick, hat);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetJoystickButton {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetJoystickButton");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetJoystickButton$descriptor() {
		return SDL_GetJoystickButton.DESC;
	}

	public static MethodHandle SDL_GetJoystickButton$handle() {
		return SDL_GetJoystickButton.HANDLE;
	}

	public static MemorySegment SDL_GetJoystickButton$address() {
		return SDL_GetJoystickButton.ADDR;
	}

	public static boolean SDL_GetJoystickButton(MemorySegment joystick, int button) {
		var mh$ = SDL_GetJoystickButton.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetJoystickButton", joystick, button);
			}
			return (boolean) mh$.invokeExact(joystick, button);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RumbleJoystick {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_SHORT,
				SDL3.C_SHORT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RumbleJoystick");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RumbleJoystick$descriptor() {
		return SDL_RumbleJoystick.DESC;
	}

	public static MethodHandle SDL_RumbleJoystick$handle() {
		return SDL_RumbleJoystick.HANDLE;
	}

	public static MemorySegment SDL_RumbleJoystick$address() {
		return SDL_RumbleJoystick.ADDR;
	}

	public static boolean SDL_RumbleJoystick(MemorySegment joystick, short low_frequency_rumble, short high_frequency_rumble, int duration_ms) {
		var mh$ = SDL_RumbleJoystick.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RumbleJoystick", joystick, low_frequency_rumble, high_frequency_rumble, duration_ms);
			}
			return (boolean) mh$.invokeExact(joystick, low_frequency_rumble, high_frequency_rumble, duration_ms);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RumbleJoystickTriggers {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_SHORT,
				SDL3.C_SHORT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RumbleJoystickTriggers");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RumbleJoystickTriggers$descriptor() {
		return SDL_RumbleJoystickTriggers.DESC;
	}

	public static MethodHandle SDL_RumbleJoystickTriggers$handle() {
		return SDL_RumbleJoystickTriggers.HANDLE;
	}

	public static MemorySegment SDL_RumbleJoystickTriggers$address() {
		return SDL_RumbleJoystickTriggers.ADDR;
	}

	public static boolean SDL_RumbleJoystickTriggers(MemorySegment joystick, short left_rumble, short right_rumble, int duration_ms) {
		var mh$ = SDL_RumbleJoystickTriggers.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RumbleJoystickTriggers", joystick, left_rumble, right_rumble, duration_ms);
			}
			return (boolean) mh$.invokeExact(joystick, left_rumble, right_rumble, duration_ms);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetJoystickLED {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_CHAR,
				SDL3.C_CHAR,
				SDL3.C_CHAR
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetJoystickLED");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetJoystickLED$descriptor() {
		return SDL_SetJoystickLED.DESC;
	}

	public static MethodHandle SDL_SetJoystickLED$handle() {
		return SDL_SetJoystickLED.HANDLE;
	}

	public static MemorySegment SDL_SetJoystickLED$address() {
		return SDL_SetJoystickLED.ADDR;
	}

	public static boolean SDL_SetJoystickLED(MemorySegment joystick, byte red, byte green, byte blue) {
		var mh$ = SDL_SetJoystickLED.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetJoystickLED", joystick, red, green, blue);
			}
			return (boolean) mh$.invokeExact(joystick, red, green, blue);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SendJoystickEffect {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SendJoystickEffect");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SendJoystickEffect$descriptor() {
		return SDL_SendJoystickEffect.DESC;
	}

	public static MethodHandle SDL_SendJoystickEffect$handle() {
		return SDL_SendJoystickEffect.HANDLE;
	}

	public static MemorySegment SDL_SendJoystickEffect$address() {
		return SDL_SendJoystickEffect.ADDR;
	}

	public static boolean SDL_SendJoystickEffect(MemorySegment joystick, MemorySegment data, int size) {
		var mh$ = SDL_SendJoystickEffect.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SendJoystickEffect", joystick, data, size);
			}
			return (boolean) mh$.invokeExact(joystick, data, size);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CloseJoystick {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CloseJoystick");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CloseJoystick$descriptor() {
		return SDL_CloseJoystick.DESC;
	}

	public static MethodHandle SDL_CloseJoystick$handle() {
		return SDL_CloseJoystick.HANDLE;
	}

	public static MemorySegment SDL_CloseJoystick$address() {
		return SDL_CloseJoystick.ADDR;
	}

	public static void SDL_CloseJoystick(MemorySegment joystick) {
		var mh$ = SDL_CloseJoystick.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CloseJoystick", joystick);
			}
			mh$.invokeExact(joystick);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetJoystickConnectionState {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetJoystickConnectionState");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetJoystickConnectionState$descriptor() {
		return SDL_GetJoystickConnectionState.DESC;
	}

	public static MethodHandle SDL_GetJoystickConnectionState$handle() {
		return SDL_GetJoystickConnectionState.HANDLE;
	}

	public static MemorySegment SDL_GetJoystickConnectionState$address() {
		return SDL_GetJoystickConnectionState.ADDR;
	}

	public static int SDL_GetJoystickConnectionState(MemorySegment joystick) {
		var mh$ = SDL_GetJoystickConnectionState.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetJoystickConnectionState", joystick);
			}
			return (int) mh$.invokeExact(joystick);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetJoystickPowerInfo {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetJoystickPowerInfo");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetJoystickPowerInfo$descriptor() {
		return SDL_GetJoystickPowerInfo.DESC;
	}

	public static MethodHandle SDL_GetJoystickPowerInfo$handle() {
		return SDL_GetJoystickPowerInfo.HANDLE;
	}

	public static MemorySegment SDL_GetJoystickPowerInfo$address() {
		return SDL_GetJoystickPowerInfo.ADDR;
	}

	public static int SDL_GetJoystickPowerInfo(MemorySegment joystick, MemorySegment percent) {
		var mh$ = SDL_GetJoystickPowerInfo.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetJoystickPowerInfo", joystick, percent);
			}
			return (int) mh$.invokeExact(joystick, percent);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static final int SDL_GAMEPAD_TYPE_UNKNOWN = (int) 0L;

	public static int SDL_GAMEPAD_TYPE_UNKNOWN() {
		return SDL_GAMEPAD_TYPE_UNKNOWN;
	}

	private static final int SDL_GAMEPAD_TYPE_STANDARD = (int) 1L;

	public static int SDL_GAMEPAD_TYPE_STANDARD() {
		return SDL_GAMEPAD_TYPE_STANDARD;
	}

	private static final int SDL_GAMEPAD_TYPE_XBOX360 = (int) 2L;

	public static int SDL_GAMEPAD_TYPE_XBOX360() {
		return SDL_GAMEPAD_TYPE_XBOX360;
	}

	private static final int SDL_GAMEPAD_TYPE_XBOXONE = (int) 3L;

	public static int SDL_GAMEPAD_TYPE_XBOXONE() {
		return SDL_GAMEPAD_TYPE_XBOXONE;
	}

	private static final int SDL_GAMEPAD_TYPE_PS3 = (int) 4L;

	public static int SDL_GAMEPAD_TYPE_PS3() {
		return SDL_GAMEPAD_TYPE_PS3;
	}

	private static final int SDL_GAMEPAD_TYPE_PS4 = (int) 5L;

	public static int SDL_GAMEPAD_TYPE_PS4() {
		return SDL_GAMEPAD_TYPE_PS4;
	}

	private static final int SDL_GAMEPAD_TYPE_PS5 = (int) 6L;

	public static int SDL_GAMEPAD_TYPE_PS5() {
		return SDL_GAMEPAD_TYPE_PS5;
	}

	private static final int SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_PRO = (int) 7L;

	public static int SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_PRO() {
		return SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_PRO;
	}

	private static final int SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_JOYCON_LEFT = (int) 8L;

	public static int SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_JOYCON_LEFT() {
		return SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_JOYCON_LEFT;
	}

	private static final int SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_JOYCON_RIGHT = (int) 9L;

	public static int SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_JOYCON_RIGHT() {
		return SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_JOYCON_RIGHT;
	}

	private static final int SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_JOYCON_PAIR = (int) 10L;

	public static int SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_JOYCON_PAIR() {
		return SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_JOYCON_PAIR;
	}

	private static final int SDL_GAMEPAD_TYPE_GAMECUBE = (int) 11L;

	public static int SDL_GAMEPAD_TYPE_GAMECUBE() {
		return SDL_GAMEPAD_TYPE_GAMECUBE;
	}

	private static final int SDL_GAMEPAD_TYPE_STEAM = (int) 12L;

	public static int SDL_GAMEPAD_TYPE_STEAM() {
		return SDL_GAMEPAD_TYPE_STEAM;
	}

	private static final int SDL_GAMEPAD_TYPE_COUNT = (int) 13L;

	public static int SDL_GAMEPAD_TYPE_COUNT() {
		return SDL_GAMEPAD_TYPE_COUNT;
	}

	private static final int SDL_GAMEPAD_BUTTON_INVALID = (int) -1L;

	public static int SDL_GAMEPAD_BUTTON_INVALID() {
		return SDL_GAMEPAD_BUTTON_INVALID;
	}

	private static final int SDL_GAMEPAD_BUTTON_SOUTH = (int) 0L;

	public static int SDL_GAMEPAD_BUTTON_SOUTH() {
		return SDL_GAMEPAD_BUTTON_SOUTH;
	}

	private static final int SDL_GAMEPAD_BUTTON_EAST = (int) 1L;

	public static int SDL_GAMEPAD_BUTTON_EAST() {
		return SDL_GAMEPAD_BUTTON_EAST;
	}

	private static final int SDL_GAMEPAD_BUTTON_WEST = (int) 2L;

	public static int SDL_GAMEPAD_BUTTON_WEST() {
		return SDL_GAMEPAD_BUTTON_WEST;
	}

	private static final int SDL_GAMEPAD_BUTTON_NORTH = (int) 3L;

	public static int SDL_GAMEPAD_BUTTON_NORTH() {
		return SDL_GAMEPAD_BUTTON_NORTH;
	}

	private static final int SDL_GAMEPAD_BUTTON_BACK = (int) 4L;

	public static int SDL_GAMEPAD_BUTTON_BACK() {
		return SDL_GAMEPAD_BUTTON_BACK;
	}

	private static final int SDL_GAMEPAD_BUTTON_GUIDE = (int) 5L;

	public static int SDL_GAMEPAD_BUTTON_GUIDE() {
		return SDL_GAMEPAD_BUTTON_GUIDE;
	}

	private static final int SDL_GAMEPAD_BUTTON_START = (int) 6L;

	public static int SDL_GAMEPAD_BUTTON_START() {
		return SDL_GAMEPAD_BUTTON_START;
	}

	private static final int SDL_GAMEPAD_BUTTON_LEFT_STICK = (int) 7L;

	public static int SDL_GAMEPAD_BUTTON_LEFT_STICK() {
		return SDL_GAMEPAD_BUTTON_LEFT_STICK;
	}

	private static final int SDL_GAMEPAD_BUTTON_RIGHT_STICK = (int) 8L;

	public static int SDL_GAMEPAD_BUTTON_RIGHT_STICK() {
		return SDL_GAMEPAD_BUTTON_RIGHT_STICK;
	}

	private static final int SDL_GAMEPAD_BUTTON_LEFT_SHOULDER = (int) 9L;

	public static int SDL_GAMEPAD_BUTTON_LEFT_SHOULDER() {
		return SDL_GAMEPAD_BUTTON_LEFT_SHOULDER;
	}

	private static final int SDL_GAMEPAD_BUTTON_RIGHT_SHOULDER = (int) 10L;

	public static int SDL_GAMEPAD_BUTTON_RIGHT_SHOULDER() {
		return SDL_GAMEPAD_BUTTON_RIGHT_SHOULDER;
	}

	private static final int SDL_GAMEPAD_BUTTON_DPAD_UP = (int) 11L;

	public static int SDL_GAMEPAD_BUTTON_DPAD_UP() {
		return SDL_GAMEPAD_BUTTON_DPAD_UP;
	}

	private static final int SDL_GAMEPAD_BUTTON_DPAD_DOWN = (int) 12L;

	public static int SDL_GAMEPAD_BUTTON_DPAD_DOWN() {
		return SDL_GAMEPAD_BUTTON_DPAD_DOWN;
	}

	private static final int SDL_GAMEPAD_BUTTON_DPAD_LEFT = (int) 13L;

	public static int SDL_GAMEPAD_BUTTON_DPAD_LEFT() {
		return SDL_GAMEPAD_BUTTON_DPAD_LEFT;
	}

	private static final int SDL_GAMEPAD_BUTTON_DPAD_RIGHT = (int) 14L;

	public static int SDL_GAMEPAD_BUTTON_DPAD_RIGHT() {
		return SDL_GAMEPAD_BUTTON_DPAD_RIGHT;
	}

	private static final int SDL_GAMEPAD_BUTTON_MISC1 = (int) 15L;

	public static int SDL_GAMEPAD_BUTTON_MISC1() {
		return SDL_GAMEPAD_BUTTON_MISC1;
	}

	private static final int SDL_GAMEPAD_BUTTON_RIGHT_PADDLE1 = (int) 16L;

	public static int SDL_GAMEPAD_BUTTON_RIGHT_PADDLE1() {
		return SDL_GAMEPAD_BUTTON_RIGHT_PADDLE1;
	}

	private static final int SDL_GAMEPAD_BUTTON_LEFT_PADDLE1 = (int) 17L;

	public static int SDL_GAMEPAD_BUTTON_LEFT_PADDLE1() {
		return SDL_GAMEPAD_BUTTON_LEFT_PADDLE1;
	}

	private static final int SDL_GAMEPAD_BUTTON_RIGHT_PADDLE2 = (int) 18L;

	public static int SDL_GAMEPAD_BUTTON_RIGHT_PADDLE2() {
		return SDL_GAMEPAD_BUTTON_RIGHT_PADDLE2;
	}

	private static final int SDL_GAMEPAD_BUTTON_LEFT_PADDLE2 = (int) 19L;

	public static int SDL_GAMEPAD_BUTTON_LEFT_PADDLE2() {
		return SDL_GAMEPAD_BUTTON_LEFT_PADDLE2;
	}

	private static final int SDL_GAMEPAD_BUTTON_TOUCHPAD = (int) 20L;

	public static int SDL_GAMEPAD_BUTTON_TOUCHPAD() {
		return SDL_GAMEPAD_BUTTON_TOUCHPAD;
	}

	private static final int SDL_GAMEPAD_BUTTON_MISC2 = (int) 21L;

	public static int SDL_GAMEPAD_BUTTON_MISC2() {
		return SDL_GAMEPAD_BUTTON_MISC2;
	}

	private static final int SDL_GAMEPAD_BUTTON_MISC3 = (int) 22L;

	public static int SDL_GAMEPAD_BUTTON_MISC3() {
		return SDL_GAMEPAD_BUTTON_MISC3;
	}

	private static final int SDL_GAMEPAD_BUTTON_MISC4 = (int) 23L;

	public static int SDL_GAMEPAD_BUTTON_MISC4() {
		return SDL_GAMEPAD_BUTTON_MISC4;
	}

	private static final int SDL_GAMEPAD_BUTTON_MISC5 = (int) 24L;

	public static int SDL_GAMEPAD_BUTTON_MISC5() {
		return SDL_GAMEPAD_BUTTON_MISC5;
	}

	private static final int SDL_GAMEPAD_BUTTON_MISC6 = (int) 25L;

	public static int SDL_GAMEPAD_BUTTON_MISC6() {
		return SDL_GAMEPAD_BUTTON_MISC6;
	}

	private static final int SDL_GAMEPAD_BUTTON_COUNT = (int) 26L;

	public static int SDL_GAMEPAD_BUTTON_COUNT() {
		return SDL_GAMEPAD_BUTTON_COUNT;
	}

	private static final int SDL_GAMEPAD_BUTTON_LABEL_UNKNOWN = (int) 0L;

	public static int SDL_GAMEPAD_BUTTON_LABEL_UNKNOWN() {
		return SDL_GAMEPAD_BUTTON_LABEL_UNKNOWN;
	}

	private static final int SDL_GAMEPAD_BUTTON_LABEL_A = (int) 1L;

	public static int SDL_GAMEPAD_BUTTON_LABEL_A() {
		return SDL_GAMEPAD_BUTTON_LABEL_A;
	}

	private static final int SDL_GAMEPAD_BUTTON_LABEL_B = (int) 2L;

	public static int SDL_GAMEPAD_BUTTON_LABEL_B() {
		return SDL_GAMEPAD_BUTTON_LABEL_B;
	}

	private static final int SDL_GAMEPAD_BUTTON_LABEL_X = (int) 3L;

	public static int SDL_GAMEPAD_BUTTON_LABEL_X() {
		return SDL_GAMEPAD_BUTTON_LABEL_X;
	}

	private static final int SDL_GAMEPAD_BUTTON_LABEL_Y = (int) 4L;

	public static int SDL_GAMEPAD_BUTTON_LABEL_Y() {
		return SDL_GAMEPAD_BUTTON_LABEL_Y;
	}

	private static final int SDL_GAMEPAD_BUTTON_LABEL_CROSS = (int) 5L;

	public static int SDL_GAMEPAD_BUTTON_LABEL_CROSS() {
		return SDL_GAMEPAD_BUTTON_LABEL_CROSS;
	}

	private static final int SDL_GAMEPAD_BUTTON_LABEL_CIRCLE = (int) 6L;

	public static int SDL_GAMEPAD_BUTTON_LABEL_CIRCLE() {
		return SDL_GAMEPAD_BUTTON_LABEL_CIRCLE;
	}

	private static final int SDL_GAMEPAD_BUTTON_LABEL_SQUARE = (int) 7L;

	public static int SDL_GAMEPAD_BUTTON_LABEL_SQUARE() {
		return SDL_GAMEPAD_BUTTON_LABEL_SQUARE;
	}

	private static final int SDL_GAMEPAD_BUTTON_LABEL_TRIANGLE = (int) 8L;

	public static int SDL_GAMEPAD_BUTTON_LABEL_TRIANGLE() {
		return SDL_GAMEPAD_BUTTON_LABEL_TRIANGLE;
	}

	private static final int SDL_GAMEPAD_AXIS_INVALID = (int) -1L;

	public static int SDL_GAMEPAD_AXIS_INVALID() {
		return SDL_GAMEPAD_AXIS_INVALID;
	}

	private static final int SDL_GAMEPAD_AXIS_LEFTX = (int) 0L;

	public static int SDL_GAMEPAD_AXIS_LEFTX() {
		return SDL_GAMEPAD_AXIS_LEFTX;
	}

	private static final int SDL_GAMEPAD_AXIS_LEFTY = (int) 1L;

	public static int SDL_GAMEPAD_AXIS_LEFTY() {
		return SDL_GAMEPAD_AXIS_LEFTY;
	}

	private static final int SDL_GAMEPAD_AXIS_RIGHTX = (int) 2L;

	public static int SDL_GAMEPAD_AXIS_RIGHTX() {
		return SDL_GAMEPAD_AXIS_RIGHTX;
	}

	private static final int SDL_GAMEPAD_AXIS_RIGHTY = (int) 3L;

	public static int SDL_GAMEPAD_AXIS_RIGHTY() {
		return SDL_GAMEPAD_AXIS_RIGHTY;
	}

	private static final int SDL_GAMEPAD_AXIS_LEFT_TRIGGER = (int) 4L;

	public static int SDL_GAMEPAD_AXIS_LEFT_TRIGGER() {
		return SDL_GAMEPAD_AXIS_LEFT_TRIGGER;
	}

	private static final int SDL_GAMEPAD_AXIS_RIGHT_TRIGGER = (int) 5L;

	public static int SDL_GAMEPAD_AXIS_RIGHT_TRIGGER() {
		return SDL_GAMEPAD_AXIS_RIGHT_TRIGGER;
	}

	private static final int SDL_GAMEPAD_AXIS_COUNT = (int) 6L;

	public static int SDL_GAMEPAD_AXIS_COUNT() {
		return SDL_GAMEPAD_AXIS_COUNT;
	}

	private static final int SDL_GAMEPAD_BINDTYPE_NONE = (int) 0L;

	public static int SDL_GAMEPAD_BINDTYPE_NONE() {
		return SDL_GAMEPAD_BINDTYPE_NONE;
	}

	private static final int SDL_GAMEPAD_BINDTYPE_BUTTON = (int) 1L;

	public static int SDL_GAMEPAD_BINDTYPE_BUTTON() {
		return SDL_GAMEPAD_BINDTYPE_BUTTON;
	}

	private static final int SDL_GAMEPAD_BINDTYPE_AXIS = (int) 2L;

	public static int SDL_GAMEPAD_BINDTYPE_AXIS() {
		return SDL_GAMEPAD_BINDTYPE_AXIS;
	}

	private static final int SDL_GAMEPAD_BINDTYPE_HAT = (int) 3L;

	public static int SDL_GAMEPAD_BINDTYPE_HAT() {
		return SDL_GAMEPAD_BINDTYPE_HAT;
	}

	private static class SDL_AddGamepadMapping {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_AddGamepadMapping");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_AddGamepadMapping$descriptor() {
		return SDL_AddGamepadMapping.DESC;
	}

	public static MethodHandle SDL_AddGamepadMapping$handle() {
		return SDL_AddGamepadMapping.HANDLE;
	}

	public static MemorySegment SDL_AddGamepadMapping$address() {
		return SDL_AddGamepadMapping.ADDR;
	}

	public static int SDL_AddGamepadMapping(MemorySegment mapping) {
		var mh$ = SDL_AddGamepadMapping.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_AddGamepadMapping", mapping);
			}
			return (int) mh$.invokeExact(mapping);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_AddGamepadMappingsFromIO {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_AddGamepadMappingsFromIO");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_AddGamepadMappingsFromIO$descriptor() {
		return SDL_AddGamepadMappingsFromIO.DESC;
	}

	public static MethodHandle SDL_AddGamepadMappingsFromIO$handle() {
		return SDL_AddGamepadMappingsFromIO.HANDLE;
	}

	public static MemorySegment SDL_AddGamepadMappingsFromIO$address() {
		return SDL_AddGamepadMappingsFromIO.ADDR;
	}

	public static int SDL_AddGamepadMappingsFromIO(MemorySegment src, boolean closeio) {
		var mh$ = SDL_AddGamepadMappingsFromIO.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_AddGamepadMappingsFromIO", src, closeio);
			}
			return (int) mh$.invokeExact(src, closeio);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_AddGamepadMappingsFromFile {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_AddGamepadMappingsFromFile");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_AddGamepadMappingsFromFile$descriptor() {
		return SDL_AddGamepadMappingsFromFile.DESC;
	}

	public static MethodHandle SDL_AddGamepadMappingsFromFile$handle() {
		return SDL_AddGamepadMappingsFromFile.HANDLE;
	}

	public static MemorySegment SDL_AddGamepadMappingsFromFile$address() {
		return SDL_AddGamepadMappingsFromFile.ADDR;
	}

	public static int SDL_AddGamepadMappingsFromFile(MemorySegment file) {
		var mh$ = SDL_AddGamepadMappingsFromFile.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_AddGamepadMappingsFromFile", file);
			}
			return (int) mh$.invokeExact(file);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ReloadGamepadMappings {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ReloadGamepadMappings");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ReloadGamepadMappings$descriptor() {
		return SDL_ReloadGamepadMappings.DESC;
	}

	public static MethodHandle SDL_ReloadGamepadMappings$handle() {
		return SDL_ReloadGamepadMappings.HANDLE;
	}

	public static MemorySegment SDL_ReloadGamepadMappings$address() {
		return SDL_ReloadGamepadMappings.ADDR;
	}

	public static boolean SDL_ReloadGamepadMappings() {
		var mh$ = SDL_ReloadGamepadMappings.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ReloadGamepadMappings");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadMappings {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadMappings");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadMappings$descriptor() {
		return SDL_GetGamepadMappings.DESC;
	}

	public static MethodHandle SDL_GetGamepadMappings$handle() {
		return SDL_GetGamepadMappings.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadMappings$address() {
		return SDL_GetGamepadMappings.ADDR;
	}

	public static MemorySegment SDL_GetGamepadMappings(MemorySegment count) {
		var mh$ = SDL_GetGamepadMappings.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadMappings", count);
			}
			return (MemorySegment) mh$.invokeExact(count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadMappingForGUID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL_GUID.layout()
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadMappingForGUID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadMappingForGUID$descriptor() {
		return SDL_GetGamepadMappingForGUID.DESC;
	}

	public static MethodHandle SDL_GetGamepadMappingForGUID$handle() {
		return SDL_GetGamepadMappingForGUID.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadMappingForGUID$address() {
		return SDL_GetGamepadMappingForGUID.ADDR;
	}

	public static MemorySegment SDL_GetGamepadMappingForGUID(MemorySegment guid) {
		var mh$ = SDL_GetGamepadMappingForGUID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadMappingForGUID", guid);
			}
			return (MemorySegment) mh$.invokeExact(guid);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadMapping {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadMapping");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadMapping$descriptor() {
		return SDL_GetGamepadMapping.DESC;
	}

	public static MethodHandle SDL_GetGamepadMapping$handle() {
		return SDL_GetGamepadMapping.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadMapping$address() {
		return SDL_GetGamepadMapping.ADDR;
	}

	public static MemorySegment SDL_GetGamepadMapping(MemorySegment gamepad) {
		var mh$ = SDL_GetGamepadMapping.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadMapping", gamepad);
			}
			return (MemorySegment) mh$.invokeExact(gamepad);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetGamepadMapping {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetGamepadMapping");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetGamepadMapping$descriptor() {
		return SDL_SetGamepadMapping.DESC;
	}

	public static MethodHandle SDL_SetGamepadMapping$handle() {
		return SDL_SetGamepadMapping.HANDLE;
	}

	public static MemorySegment SDL_SetGamepadMapping$address() {
		return SDL_SetGamepadMapping.ADDR;
	}

	public static boolean SDL_SetGamepadMapping(int instance_id, MemorySegment mapping) {
		var mh$ = SDL_SetGamepadMapping.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetGamepadMapping", instance_id, mapping);
			}
			return (boolean) mh$.invokeExact(instance_id, mapping);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_HasGamepad {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_HasGamepad");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_HasGamepad$descriptor() {
		return SDL_HasGamepad.DESC;
	}

	public static MethodHandle SDL_HasGamepad$handle() {
		return SDL_HasGamepad.HANDLE;
	}

	public static MemorySegment SDL_HasGamepad$address() {
		return SDL_HasGamepad.ADDR;
	}

	public static boolean SDL_HasGamepad() {
		var mh$ = SDL_HasGamepad.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_HasGamepad");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepads {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepads");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepads$descriptor() {
		return SDL_GetGamepads.DESC;
	}

	public static MethodHandle SDL_GetGamepads$handle() {
		return SDL_GetGamepads.HANDLE;
	}

	public static MemorySegment SDL_GetGamepads$address() {
		return SDL_GetGamepads.ADDR;
	}

	public static MemorySegment SDL_GetGamepads(MemorySegment count) {
		var mh$ = SDL_GetGamepads.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepads", count);
			}
			return (MemorySegment) mh$.invokeExact(count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_IsGamepad {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_IsGamepad");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_IsGamepad$descriptor() {
		return SDL_IsGamepad.DESC;
	}

	public static MethodHandle SDL_IsGamepad$handle() {
		return SDL_IsGamepad.HANDLE;
	}

	public static MemorySegment SDL_IsGamepad$address() {
		return SDL_IsGamepad.ADDR;
	}

	public static boolean SDL_IsGamepad(int instance_id) {
		var mh$ = SDL_IsGamepad.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_IsGamepad", instance_id);
			}
			return (boolean) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadNameForID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadNameForID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadNameForID$descriptor() {
		return SDL_GetGamepadNameForID.DESC;
	}

	public static MethodHandle SDL_GetGamepadNameForID$handle() {
		return SDL_GetGamepadNameForID.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadNameForID$address() {
		return SDL_GetGamepadNameForID.ADDR;
	}

	public static MemorySegment SDL_GetGamepadNameForID(int instance_id) {
		var mh$ = SDL_GetGamepadNameForID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadNameForID", instance_id);
			}
			return (MemorySegment) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadPathForID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadPathForID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadPathForID$descriptor() {
		return SDL_GetGamepadPathForID.DESC;
	}

	public static MethodHandle SDL_GetGamepadPathForID$handle() {
		return SDL_GetGamepadPathForID.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadPathForID$address() {
		return SDL_GetGamepadPathForID.ADDR;
	}

	public static MemorySegment SDL_GetGamepadPathForID(int instance_id) {
		var mh$ = SDL_GetGamepadPathForID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadPathForID", instance_id);
			}
			return (MemorySegment) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadPlayerIndexForID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadPlayerIndexForID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadPlayerIndexForID$descriptor() {
		return SDL_GetGamepadPlayerIndexForID.DESC;
	}

	public static MethodHandle SDL_GetGamepadPlayerIndexForID$handle() {
		return SDL_GetGamepadPlayerIndexForID.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadPlayerIndexForID$address() {
		return SDL_GetGamepadPlayerIndexForID.ADDR;
	}

	public static int SDL_GetGamepadPlayerIndexForID(int instance_id) {
		var mh$ = SDL_GetGamepadPlayerIndexForID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadPlayerIndexForID", instance_id);
			}
			return (int) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadGUIDForID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL_GUID.layout(),
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadGUIDForID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadGUIDForID$descriptor() {
		return SDL_GetGamepadGUIDForID.DESC;
	}

	public static MethodHandle SDL_GetGamepadGUIDForID$handle() {
		return SDL_GetGamepadGUIDForID.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadGUIDForID$address() {
		return SDL_GetGamepadGUIDForID.ADDR;
	}

	public static MemorySegment SDL_GetGamepadGUIDForID(SegmentAllocator allocator, int instance_id) {
		var mh$ = SDL_GetGamepadGUIDForID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadGUIDForID", allocator, instance_id);
			}
			return (MemorySegment) mh$.invokeExact(allocator, instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadVendorForID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_SHORT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadVendorForID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadVendorForID$descriptor() {
		return SDL_GetGamepadVendorForID.DESC;
	}

	public static MethodHandle SDL_GetGamepadVendorForID$handle() {
		return SDL_GetGamepadVendorForID.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadVendorForID$address() {
		return SDL_GetGamepadVendorForID.ADDR;
	}

	public static short SDL_GetGamepadVendorForID(int instance_id) {
		var mh$ = SDL_GetGamepadVendorForID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadVendorForID", instance_id);
			}
			return (short) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadProductForID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_SHORT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadProductForID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadProductForID$descriptor() {
		return SDL_GetGamepadProductForID.DESC;
	}

	public static MethodHandle SDL_GetGamepadProductForID$handle() {
		return SDL_GetGamepadProductForID.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadProductForID$address() {
		return SDL_GetGamepadProductForID.ADDR;
	}

	public static short SDL_GetGamepadProductForID(int instance_id) {
		var mh$ = SDL_GetGamepadProductForID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadProductForID", instance_id);
			}
			return (short) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadProductVersionForID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_SHORT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadProductVersionForID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadProductVersionForID$descriptor() {
		return SDL_GetGamepadProductVersionForID.DESC;
	}

	public static MethodHandle SDL_GetGamepadProductVersionForID$handle() {
		return SDL_GetGamepadProductVersionForID.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadProductVersionForID$address() {
		return SDL_GetGamepadProductVersionForID.ADDR;
	}

	public static short SDL_GetGamepadProductVersionForID(int instance_id) {
		var mh$ = SDL_GetGamepadProductVersionForID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadProductVersionForID", instance_id);
			}
			return (short) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadTypeForID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadTypeForID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadTypeForID$descriptor() {
		return SDL_GetGamepadTypeForID.DESC;
	}

	public static MethodHandle SDL_GetGamepadTypeForID$handle() {
		return SDL_GetGamepadTypeForID.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadTypeForID$address() {
		return SDL_GetGamepadTypeForID.ADDR;
	}

	public static int SDL_GetGamepadTypeForID(int instance_id) {
		var mh$ = SDL_GetGamepadTypeForID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadTypeForID", instance_id);
			}
			return (int) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRealGamepadTypeForID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRealGamepadTypeForID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRealGamepadTypeForID$descriptor() {
		return SDL_GetRealGamepadTypeForID.DESC;
	}

	public static MethodHandle SDL_GetRealGamepadTypeForID$handle() {
		return SDL_GetRealGamepadTypeForID.HANDLE;
	}

	public static MemorySegment SDL_GetRealGamepadTypeForID$address() {
		return SDL_GetRealGamepadTypeForID.ADDR;
	}

	public static int SDL_GetRealGamepadTypeForID(int instance_id) {
		var mh$ = SDL_GetRealGamepadTypeForID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRealGamepadTypeForID", instance_id);
			}
			return (int) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadMappingForID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadMappingForID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadMappingForID$descriptor() {
		return SDL_GetGamepadMappingForID.DESC;
	}

	public static MethodHandle SDL_GetGamepadMappingForID$handle() {
		return SDL_GetGamepadMappingForID.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadMappingForID$address() {
		return SDL_GetGamepadMappingForID.ADDR;
	}

	public static MemorySegment SDL_GetGamepadMappingForID(int instance_id) {
		var mh$ = SDL_GetGamepadMappingForID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadMappingForID", instance_id);
			}
			return (MemorySegment) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_OpenGamepad {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_OpenGamepad");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_OpenGamepad$descriptor() {
		return SDL_OpenGamepad.DESC;
	}

	public static MethodHandle SDL_OpenGamepad$handle() {
		return SDL_OpenGamepad.HANDLE;
	}

	public static MemorySegment SDL_OpenGamepad$address() {
		return SDL_OpenGamepad.ADDR;
	}

	public static MemorySegment SDL_OpenGamepad(int instance_id) {
		var mh$ = SDL_OpenGamepad.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_OpenGamepad", instance_id);
			}
			return (MemorySegment) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadFromID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadFromID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadFromID$descriptor() {
		return SDL_GetGamepadFromID.DESC;
	}

	public static MethodHandle SDL_GetGamepadFromID$handle() {
		return SDL_GetGamepadFromID.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadFromID$address() {
		return SDL_GetGamepadFromID.ADDR;
	}

	public static MemorySegment SDL_GetGamepadFromID(int instance_id) {
		var mh$ = SDL_GetGamepadFromID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadFromID", instance_id);
			}
			return (MemorySegment) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadFromPlayerIndex {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadFromPlayerIndex");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadFromPlayerIndex$descriptor() {
		return SDL_GetGamepadFromPlayerIndex.DESC;
	}

	public static MethodHandle SDL_GetGamepadFromPlayerIndex$handle() {
		return SDL_GetGamepadFromPlayerIndex.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadFromPlayerIndex$address() {
		return SDL_GetGamepadFromPlayerIndex.ADDR;
	}

	public static MemorySegment SDL_GetGamepadFromPlayerIndex(int player_index) {
		var mh$ = SDL_GetGamepadFromPlayerIndex.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadFromPlayerIndex", player_index);
			}
			return (MemorySegment) mh$.invokeExact(player_index);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadProperties {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadProperties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadProperties$descriptor() {
		return SDL_GetGamepadProperties.DESC;
	}

	public static MethodHandle SDL_GetGamepadProperties$handle() {
		return SDL_GetGamepadProperties.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadProperties$address() {
		return SDL_GetGamepadProperties.ADDR;
	}

	public static int SDL_GetGamepadProperties(MemorySegment gamepad) {
		var mh$ = SDL_GetGamepadProperties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadProperties", gamepad);
			}
			return (int) mh$.invokeExact(gamepad);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadID$descriptor() {
		return SDL_GetGamepadID.DESC;
	}

	public static MethodHandle SDL_GetGamepadID$handle() {
		return SDL_GetGamepadID.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadID$address() {
		return SDL_GetGamepadID.ADDR;
	}

	public static int SDL_GetGamepadID(MemorySegment gamepad) {
		var mh$ = SDL_GetGamepadID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadID", gamepad);
			}
			return (int) mh$.invokeExact(gamepad);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadName {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadName");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadName$descriptor() {
		return SDL_GetGamepadName.DESC;
	}

	public static MethodHandle SDL_GetGamepadName$handle() {
		return SDL_GetGamepadName.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadName$address() {
		return SDL_GetGamepadName.ADDR;
	}

	public static MemorySegment SDL_GetGamepadName(MemorySegment gamepad) {
		var mh$ = SDL_GetGamepadName.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadName", gamepad);
			}
			return (MemorySegment) mh$.invokeExact(gamepad);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadPath {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadPath");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadPath$descriptor() {
		return SDL_GetGamepadPath.DESC;
	}

	public static MethodHandle SDL_GetGamepadPath$handle() {
		return SDL_GetGamepadPath.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadPath$address() {
		return SDL_GetGamepadPath.ADDR;
	}

	public static MemorySegment SDL_GetGamepadPath(MemorySegment gamepad) {
		var mh$ = SDL_GetGamepadPath.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadPath", gamepad);
			}
			return (MemorySegment) mh$.invokeExact(gamepad);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadType {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadType");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadType$descriptor() {
		return SDL_GetGamepadType.DESC;
	}

	public static MethodHandle SDL_GetGamepadType$handle() {
		return SDL_GetGamepadType.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadType$address() {
		return SDL_GetGamepadType.ADDR;
	}

	public static int SDL_GetGamepadType(MemorySegment gamepad) {
		var mh$ = SDL_GetGamepadType.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadType", gamepad);
			}
			return (int) mh$.invokeExact(gamepad);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRealGamepadType {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRealGamepadType");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRealGamepadType$descriptor() {
		return SDL_GetRealGamepadType.DESC;
	}

	public static MethodHandle SDL_GetRealGamepadType$handle() {
		return SDL_GetRealGamepadType.HANDLE;
	}

	public static MemorySegment SDL_GetRealGamepadType$address() {
		return SDL_GetRealGamepadType.ADDR;
	}

	public static int SDL_GetRealGamepadType(MemorySegment gamepad) {
		var mh$ = SDL_GetRealGamepadType.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRealGamepadType", gamepad);
			}
			return (int) mh$.invokeExact(gamepad);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadPlayerIndex {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadPlayerIndex");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadPlayerIndex$descriptor() {
		return SDL_GetGamepadPlayerIndex.DESC;
	}

	public static MethodHandle SDL_GetGamepadPlayerIndex$handle() {
		return SDL_GetGamepadPlayerIndex.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadPlayerIndex$address() {
		return SDL_GetGamepadPlayerIndex.ADDR;
	}

	public static int SDL_GetGamepadPlayerIndex(MemorySegment gamepad) {
		var mh$ = SDL_GetGamepadPlayerIndex.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadPlayerIndex", gamepad);
			}
			return (int) mh$.invokeExact(gamepad);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetGamepadPlayerIndex {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetGamepadPlayerIndex");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetGamepadPlayerIndex$descriptor() {
		return SDL_SetGamepadPlayerIndex.DESC;
	}

	public static MethodHandle SDL_SetGamepadPlayerIndex$handle() {
		return SDL_SetGamepadPlayerIndex.HANDLE;
	}

	public static MemorySegment SDL_SetGamepadPlayerIndex$address() {
		return SDL_SetGamepadPlayerIndex.ADDR;
	}

	public static boolean SDL_SetGamepadPlayerIndex(MemorySegment gamepad, int player_index) {
		var mh$ = SDL_SetGamepadPlayerIndex.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetGamepadPlayerIndex", gamepad, player_index);
			}
			return (boolean) mh$.invokeExact(gamepad, player_index);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadVendor {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_SHORT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadVendor");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadVendor$descriptor() {
		return SDL_GetGamepadVendor.DESC;
	}

	public static MethodHandle SDL_GetGamepadVendor$handle() {
		return SDL_GetGamepadVendor.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadVendor$address() {
		return SDL_GetGamepadVendor.ADDR;
	}

	public static short SDL_GetGamepadVendor(MemorySegment gamepad) {
		var mh$ = SDL_GetGamepadVendor.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadVendor", gamepad);
			}
			return (short) mh$.invokeExact(gamepad);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadProduct {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_SHORT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadProduct");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadProduct$descriptor() {
		return SDL_GetGamepadProduct.DESC;
	}

	public static MethodHandle SDL_GetGamepadProduct$handle() {
		return SDL_GetGamepadProduct.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadProduct$address() {
		return SDL_GetGamepadProduct.ADDR;
	}

	public static short SDL_GetGamepadProduct(MemorySegment gamepad) {
		var mh$ = SDL_GetGamepadProduct.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadProduct", gamepad);
			}
			return (short) mh$.invokeExact(gamepad);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadProductVersion {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_SHORT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadProductVersion");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadProductVersion$descriptor() {
		return SDL_GetGamepadProductVersion.DESC;
	}

	public static MethodHandle SDL_GetGamepadProductVersion$handle() {
		return SDL_GetGamepadProductVersion.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadProductVersion$address() {
		return SDL_GetGamepadProductVersion.ADDR;
	}

	public static short SDL_GetGamepadProductVersion(MemorySegment gamepad) {
		var mh$ = SDL_GetGamepadProductVersion.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadProductVersion", gamepad);
			}
			return (short) mh$.invokeExact(gamepad);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadFirmwareVersion {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_SHORT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadFirmwareVersion");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadFirmwareVersion$descriptor() {
		return SDL_GetGamepadFirmwareVersion.DESC;
	}

	public static MethodHandle SDL_GetGamepadFirmwareVersion$handle() {
		return SDL_GetGamepadFirmwareVersion.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadFirmwareVersion$address() {
		return SDL_GetGamepadFirmwareVersion.ADDR;
	}

	public static short SDL_GetGamepadFirmwareVersion(MemorySegment gamepad) {
		var mh$ = SDL_GetGamepadFirmwareVersion.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadFirmwareVersion", gamepad);
			}
			return (short) mh$.invokeExact(gamepad);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadSerial {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadSerial");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadSerial$descriptor() {
		return SDL_GetGamepadSerial.DESC;
	}

	public static MethodHandle SDL_GetGamepadSerial$handle() {
		return SDL_GetGamepadSerial.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadSerial$address() {
		return SDL_GetGamepadSerial.ADDR;
	}

	public static MemorySegment SDL_GetGamepadSerial(MemorySegment gamepad) {
		var mh$ = SDL_GetGamepadSerial.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadSerial", gamepad);
			}
			return (MemorySegment) mh$.invokeExact(gamepad);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadSteamHandle {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_LONG,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadSteamHandle");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadSteamHandle$descriptor() {
		return SDL_GetGamepadSteamHandle.DESC;
	}

	public static MethodHandle SDL_GetGamepadSteamHandle$handle() {
		return SDL_GetGamepadSteamHandle.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadSteamHandle$address() {
		return SDL_GetGamepadSteamHandle.ADDR;
	}

	public static long SDL_GetGamepadSteamHandle(MemorySegment gamepad) {
		var mh$ = SDL_GetGamepadSteamHandle.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadSteamHandle", gamepad);
			}
			return (long) mh$.invokeExact(gamepad);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadConnectionState {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadConnectionState");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadConnectionState$descriptor() {
		return SDL_GetGamepadConnectionState.DESC;
	}

	public static MethodHandle SDL_GetGamepadConnectionState$handle() {
		return SDL_GetGamepadConnectionState.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadConnectionState$address() {
		return SDL_GetGamepadConnectionState.ADDR;
	}

	public static int SDL_GetGamepadConnectionState(MemorySegment gamepad) {
		var mh$ = SDL_GetGamepadConnectionState.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadConnectionState", gamepad);
			}
			return (int) mh$.invokeExact(gamepad);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadPowerInfo {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadPowerInfo");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadPowerInfo$descriptor() {
		return SDL_GetGamepadPowerInfo.DESC;
	}

	public static MethodHandle SDL_GetGamepadPowerInfo$handle() {
		return SDL_GetGamepadPowerInfo.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadPowerInfo$address() {
		return SDL_GetGamepadPowerInfo.ADDR;
	}

	public static int SDL_GetGamepadPowerInfo(MemorySegment gamepad, MemorySegment percent) {
		var mh$ = SDL_GetGamepadPowerInfo.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadPowerInfo", gamepad, percent);
			}
			return (int) mh$.invokeExact(gamepad, percent);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GamepadConnected {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GamepadConnected");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GamepadConnected$descriptor() {
		return SDL_GamepadConnected.DESC;
	}

	public static MethodHandle SDL_GamepadConnected$handle() {
		return SDL_GamepadConnected.HANDLE;
	}

	public static MemorySegment SDL_GamepadConnected$address() {
		return SDL_GamepadConnected.ADDR;
	}

	public static boolean SDL_GamepadConnected(MemorySegment gamepad) {
		var mh$ = SDL_GamepadConnected.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GamepadConnected", gamepad);
			}
			return (boolean) mh$.invokeExact(gamepad);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadJoystick {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadJoystick");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadJoystick$descriptor() {
		return SDL_GetGamepadJoystick.DESC;
	}

	public static MethodHandle SDL_GetGamepadJoystick$handle() {
		return SDL_GetGamepadJoystick.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadJoystick$address() {
		return SDL_GetGamepadJoystick.ADDR;
	}

	public static MemorySegment SDL_GetGamepadJoystick(MemorySegment gamepad) {
		var mh$ = SDL_GetGamepadJoystick.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadJoystick", gamepad);
			}
			return (MemorySegment) mh$.invokeExact(gamepad);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetGamepadEventsEnabled {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetGamepadEventsEnabled");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetGamepadEventsEnabled$descriptor() {
		return SDL_SetGamepadEventsEnabled.DESC;
	}

	public static MethodHandle SDL_SetGamepadEventsEnabled$handle() {
		return SDL_SetGamepadEventsEnabled.HANDLE;
	}

	public static MemorySegment SDL_SetGamepadEventsEnabled$address() {
		return SDL_SetGamepadEventsEnabled.ADDR;
	}

	public static void SDL_SetGamepadEventsEnabled(boolean enabled) {
		var mh$ = SDL_SetGamepadEventsEnabled.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetGamepadEventsEnabled", enabled);
			}
			mh$.invokeExact(enabled);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GamepadEventsEnabled {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GamepadEventsEnabled");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GamepadEventsEnabled$descriptor() {
		return SDL_GamepadEventsEnabled.DESC;
	}

	public static MethodHandle SDL_GamepadEventsEnabled$handle() {
		return SDL_GamepadEventsEnabled.HANDLE;
	}

	public static MemorySegment SDL_GamepadEventsEnabled$address() {
		return SDL_GamepadEventsEnabled.ADDR;
	}

	public static boolean SDL_GamepadEventsEnabled() {
		var mh$ = SDL_GamepadEventsEnabled.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GamepadEventsEnabled");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadBindings {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadBindings");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadBindings$descriptor() {
		return SDL_GetGamepadBindings.DESC;
	}

	public static MethodHandle SDL_GetGamepadBindings$handle() {
		return SDL_GetGamepadBindings.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadBindings$address() {
		return SDL_GetGamepadBindings.ADDR;
	}

	public static MemorySegment SDL_GetGamepadBindings(MemorySegment gamepad, MemorySegment count) {
		var mh$ = SDL_GetGamepadBindings.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadBindings", gamepad, count);
			}
			return (MemorySegment) mh$.invokeExact(gamepad, count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_UpdateGamepads {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid();

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_UpdateGamepads");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_UpdateGamepads$descriptor() {
		return SDL_UpdateGamepads.DESC;
	}

	public static MethodHandle SDL_UpdateGamepads$handle() {
		return SDL_UpdateGamepads.HANDLE;
	}

	public static MemorySegment SDL_UpdateGamepads$address() {
		return SDL_UpdateGamepads.ADDR;
	}

	public static void SDL_UpdateGamepads() {
		var mh$ = SDL_UpdateGamepads.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_UpdateGamepads");
			}
			mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadTypeFromString {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadTypeFromString");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadTypeFromString$descriptor() {
		return SDL_GetGamepadTypeFromString.DESC;
	}

	public static MethodHandle SDL_GetGamepadTypeFromString$handle() {
		return SDL_GetGamepadTypeFromString.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadTypeFromString$address() {
		return SDL_GetGamepadTypeFromString.ADDR;
	}

	public static int SDL_GetGamepadTypeFromString(MemorySegment str) {
		var mh$ = SDL_GetGamepadTypeFromString.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadTypeFromString", str);
			}
			return (int) mh$.invokeExact(str);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadStringForType {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadStringForType");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadStringForType$descriptor() {
		return SDL_GetGamepadStringForType.DESC;
	}

	public static MethodHandle SDL_GetGamepadStringForType$handle() {
		return SDL_GetGamepadStringForType.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadStringForType$address() {
		return SDL_GetGamepadStringForType.ADDR;
	}

	public static MemorySegment SDL_GetGamepadStringForType(int type) {
		var mh$ = SDL_GetGamepadStringForType.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadStringForType", type);
			}
			return (MemorySegment) mh$.invokeExact(type);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadAxisFromString {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadAxisFromString");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadAxisFromString$descriptor() {
		return SDL_GetGamepadAxisFromString.DESC;
	}

	public static MethodHandle SDL_GetGamepadAxisFromString$handle() {
		return SDL_GetGamepadAxisFromString.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadAxisFromString$address() {
		return SDL_GetGamepadAxisFromString.ADDR;
	}

	public static int SDL_GetGamepadAxisFromString(MemorySegment str) {
		var mh$ = SDL_GetGamepadAxisFromString.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadAxisFromString", str);
			}
			return (int) mh$.invokeExact(str);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadStringForAxis {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadStringForAxis");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadStringForAxis$descriptor() {
		return SDL_GetGamepadStringForAxis.DESC;
	}

	public static MethodHandle SDL_GetGamepadStringForAxis$handle() {
		return SDL_GetGamepadStringForAxis.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadStringForAxis$address() {
		return SDL_GetGamepadStringForAxis.ADDR;
	}

	public static MemorySegment SDL_GetGamepadStringForAxis(int axis) {
		var mh$ = SDL_GetGamepadStringForAxis.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadStringForAxis", axis);
			}
			return (MemorySegment) mh$.invokeExact(axis);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GamepadHasAxis {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GamepadHasAxis");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GamepadHasAxis$descriptor() {
		return SDL_GamepadHasAxis.DESC;
	}

	public static MethodHandle SDL_GamepadHasAxis$handle() {
		return SDL_GamepadHasAxis.HANDLE;
	}

	public static MemorySegment SDL_GamepadHasAxis$address() {
		return SDL_GamepadHasAxis.ADDR;
	}

	public static boolean SDL_GamepadHasAxis(MemorySegment gamepad, int axis) {
		var mh$ = SDL_GamepadHasAxis.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GamepadHasAxis", gamepad, axis);
			}
			return (boolean) mh$.invokeExact(gamepad, axis);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadAxis {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_SHORT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadAxis");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadAxis$descriptor() {
		return SDL_GetGamepadAxis.DESC;
	}

	public static MethodHandle SDL_GetGamepadAxis$handle() {
		return SDL_GetGamepadAxis.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadAxis$address() {
		return SDL_GetGamepadAxis.ADDR;
	}

	public static short SDL_GetGamepadAxis(MemorySegment gamepad, int axis) {
		var mh$ = SDL_GetGamepadAxis.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadAxis", gamepad, axis);
			}
			return (short) mh$.invokeExact(gamepad, axis);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadButtonFromString {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadButtonFromString");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadButtonFromString$descriptor() {
		return SDL_GetGamepadButtonFromString.DESC;
	}

	public static MethodHandle SDL_GetGamepadButtonFromString$handle() {
		return SDL_GetGamepadButtonFromString.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadButtonFromString$address() {
		return SDL_GetGamepadButtonFromString.ADDR;
	}

	public static int SDL_GetGamepadButtonFromString(MemorySegment str) {
		var mh$ = SDL_GetGamepadButtonFromString.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadButtonFromString", str);
			}
			return (int) mh$.invokeExact(str);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadStringForButton {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadStringForButton");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadStringForButton$descriptor() {
		return SDL_GetGamepadStringForButton.DESC;
	}

	public static MethodHandle SDL_GetGamepadStringForButton$handle() {
		return SDL_GetGamepadStringForButton.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadStringForButton$address() {
		return SDL_GetGamepadStringForButton.ADDR;
	}

	public static MemorySegment SDL_GetGamepadStringForButton(int button) {
		var mh$ = SDL_GetGamepadStringForButton.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadStringForButton", button);
			}
			return (MemorySegment) mh$.invokeExact(button);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GamepadHasButton {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GamepadHasButton");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GamepadHasButton$descriptor() {
		return SDL_GamepadHasButton.DESC;
	}

	public static MethodHandle SDL_GamepadHasButton$handle() {
		return SDL_GamepadHasButton.HANDLE;
	}

	public static MemorySegment SDL_GamepadHasButton$address() {
		return SDL_GamepadHasButton.ADDR;
	}

	public static boolean SDL_GamepadHasButton(MemorySegment gamepad, int button) {
		var mh$ = SDL_GamepadHasButton.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GamepadHasButton", gamepad, button);
			}
			return (boolean) mh$.invokeExact(gamepad, button);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadButton {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadButton");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadButton$descriptor() {
		return SDL_GetGamepadButton.DESC;
	}

	public static MethodHandle SDL_GetGamepadButton$handle() {
		return SDL_GetGamepadButton.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadButton$address() {
		return SDL_GetGamepadButton.ADDR;
	}

	public static boolean SDL_GetGamepadButton(MemorySegment gamepad, int button) {
		var mh$ = SDL_GetGamepadButton.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadButton", gamepad, button);
			}
			return (boolean) mh$.invokeExact(gamepad, button);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadButtonLabelForType {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadButtonLabelForType");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadButtonLabelForType$descriptor() {
		return SDL_GetGamepadButtonLabelForType.DESC;
	}

	public static MethodHandle SDL_GetGamepadButtonLabelForType$handle() {
		return SDL_GetGamepadButtonLabelForType.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadButtonLabelForType$address() {
		return SDL_GetGamepadButtonLabelForType.ADDR;
	}

	public static int SDL_GetGamepadButtonLabelForType(int type, int button) {
		var mh$ = SDL_GetGamepadButtonLabelForType.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadButtonLabelForType", type, button);
			}
			return (int) mh$.invokeExact(type, button);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadButtonLabel {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadButtonLabel");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadButtonLabel$descriptor() {
		return SDL_GetGamepadButtonLabel.DESC;
	}

	public static MethodHandle SDL_GetGamepadButtonLabel$handle() {
		return SDL_GetGamepadButtonLabel.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadButtonLabel$address() {
		return SDL_GetGamepadButtonLabel.ADDR;
	}

	public static int SDL_GetGamepadButtonLabel(MemorySegment gamepad, int button) {
		var mh$ = SDL_GetGamepadButtonLabel.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadButtonLabel", gamepad, button);
			}
			return (int) mh$.invokeExact(gamepad, button);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetNumGamepadTouchpads {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetNumGamepadTouchpads");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetNumGamepadTouchpads$descriptor() {
		return SDL_GetNumGamepadTouchpads.DESC;
	}

	public static MethodHandle SDL_GetNumGamepadTouchpads$handle() {
		return SDL_GetNumGamepadTouchpads.HANDLE;
	}

	public static MemorySegment SDL_GetNumGamepadTouchpads$address() {
		return SDL_GetNumGamepadTouchpads.ADDR;
	}

	public static int SDL_GetNumGamepadTouchpads(MemorySegment gamepad) {
		var mh$ = SDL_GetNumGamepadTouchpads.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetNumGamepadTouchpads", gamepad);
			}
			return (int) mh$.invokeExact(gamepad);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetNumGamepadTouchpadFingers {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetNumGamepadTouchpadFingers");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetNumGamepadTouchpadFingers$descriptor() {
		return SDL_GetNumGamepadTouchpadFingers.DESC;
	}

	public static MethodHandle SDL_GetNumGamepadTouchpadFingers$handle() {
		return SDL_GetNumGamepadTouchpadFingers.HANDLE;
	}

	public static MemorySegment SDL_GetNumGamepadTouchpadFingers$address() {
		return SDL_GetNumGamepadTouchpadFingers.ADDR;
	}

	public static int SDL_GetNumGamepadTouchpadFingers(MemorySegment gamepad, int touchpad) {
		var mh$ = SDL_GetNumGamepadTouchpadFingers.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetNumGamepadTouchpadFingers", gamepad, touchpad);
			}
			return (int) mh$.invokeExact(gamepad, touchpad);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadTouchpadFinger {
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

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadTouchpadFinger");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadTouchpadFinger$descriptor() {
		return SDL_GetGamepadTouchpadFinger.DESC;
	}

	public static MethodHandle SDL_GetGamepadTouchpadFinger$handle() {
		return SDL_GetGamepadTouchpadFinger.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadTouchpadFinger$address() {
		return SDL_GetGamepadTouchpadFinger.ADDR;
	}

	public static boolean SDL_GetGamepadTouchpadFinger(MemorySegment gamepad, int touchpad, int finger, MemorySegment down, MemorySegment x, MemorySegment y, MemorySegment pressure) {
		var mh$ = SDL_GetGamepadTouchpadFinger.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadTouchpadFinger", gamepad, touchpad, finger, down, x, y, pressure);
			}
			return (boolean) mh$.invokeExact(gamepad, touchpad, finger, down, x, y, pressure);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GamepadHasSensor {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GamepadHasSensor");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GamepadHasSensor$descriptor() {
		return SDL_GamepadHasSensor.DESC;
	}

	public static MethodHandle SDL_GamepadHasSensor$handle() {
		return SDL_GamepadHasSensor.HANDLE;
	}

	public static MemorySegment SDL_GamepadHasSensor$address() {
		return SDL_GamepadHasSensor.ADDR;
	}

	public static boolean SDL_GamepadHasSensor(MemorySegment gamepad, int type) {
		var mh$ = SDL_GamepadHasSensor.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GamepadHasSensor", gamepad, type);
			}
			return (boolean) mh$.invokeExact(gamepad, type);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetGamepadSensorEnabled {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetGamepadSensorEnabled");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetGamepadSensorEnabled$descriptor() {
		return SDL_SetGamepadSensorEnabled.DESC;
	}

	public static MethodHandle SDL_SetGamepadSensorEnabled$handle() {
		return SDL_SetGamepadSensorEnabled.HANDLE;
	}

	public static MemorySegment SDL_SetGamepadSensorEnabled$address() {
		return SDL_SetGamepadSensorEnabled.ADDR;
	}

	public static boolean SDL_SetGamepadSensorEnabled(MemorySegment gamepad, int type, boolean enabled) {
		var mh$ = SDL_SetGamepadSensorEnabled.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetGamepadSensorEnabled", gamepad, type, enabled);
			}
			return (boolean) mh$.invokeExact(gamepad, type, enabled);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GamepadSensorEnabled {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GamepadSensorEnabled");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GamepadSensorEnabled$descriptor() {
		return SDL_GamepadSensorEnabled.DESC;
	}

	public static MethodHandle SDL_GamepadSensorEnabled$handle() {
		return SDL_GamepadSensorEnabled.HANDLE;
	}

	public static MemorySegment SDL_GamepadSensorEnabled$address() {
		return SDL_GamepadSensorEnabled.ADDR;
	}

	public static boolean SDL_GamepadSensorEnabled(MemorySegment gamepad, int type) {
		var mh$ = SDL_GamepadSensorEnabled.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GamepadSensorEnabled", gamepad, type);
			}
			return (boolean) mh$.invokeExact(gamepad, type);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadSensorDataRate {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_FLOAT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadSensorDataRate");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadSensorDataRate$descriptor() {
		return SDL_GetGamepadSensorDataRate.DESC;
	}

	public static MethodHandle SDL_GetGamepadSensorDataRate$handle() {
		return SDL_GetGamepadSensorDataRate.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadSensorDataRate$address() {
		return SDL_GetGamepadSensorDataRate.ADDR;
	}

	public static float SDL_GetGamepadSensorDataRate(MemorySegment gamepad, int type) {
		var mh$ = SDL_GetGamepadSensorDataRate.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadSensorDataRate", gamepad, type);
			}
			return (float) mh$.invokeExact(gamepad, type);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadSensorData {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadSensorData");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadSensorData$descriptor() {
		return SDL_GetGamepadSensorData.DESC;
	}

	public static MethodHandle SDL_GetGamepadSensorData$handle() {
		return SDL_GetGamepadSensorData.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadSensorData$address() {
		return SDL_GetGamepadSensorData.ADDR;
	}

	public static boolean SDL_GetGamepadSensorData(MemorySegment gamepad, int type, MemorySegment data, int num_values) {
		var mh$ = SDL_GetGamepadSensorData.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadSensorData", gamepad, type, data, num_values);
			}
			return (boolean) mh$.invokeExact(gamepad, type, data, num_values);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RumbleGamepad {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_SHORT,
				SDL3.C_SHORT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RumbleGamepad");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RumbleGamepad$descriptor() {
		return SDL_RumbleGamepad.DESC;
	}

	public static MethodHandle SDL_RumbleGamepad$handle() {
		return SDL_RumbleGamepad.HANDLE;
	}

	public static MemorySegment SDL_RumbleGamepad$address() {
		return SDL_RumbleGamepad.ADDR;
	}

	public static boolean SDL_RumbleGamepad(MemorySegment gamepad, short low_frequency_rumble, short high_frequency_rumble, int duration_ms) {
		var mh$ = SDL_RumbleGamepad.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RumbleGamepad", gamepad, low_frequency_rumble, high_frequency_rumble, duration_ms);
			}
			return (boolean) mh$.invokeExact(gamepad, low_frequency_rumble, high_frequency_rumble, duration_ms);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RumbleGamepadTriggers {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_SHORT,
				SDL3.C_SHORT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RumbleGamepadTriggers");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RumbleGamepadTriggers$descriptor() {
		return SDL_RumbleGamepadTriggers.DESC;
	}

	public static MethodHandle SDL_RumbleGamepadTriggers$handle() {
		return SDL_RumbleGamepadTriggers.HANDLE;
	}

	public static MemorySegment SDL_RumbleGamepadTriggers$address() {
		return SDL_RumbleGamepadTriggers.ADDR;
	}

	public static boolean SDL_RumbleGamepadTriggers(MemorySegment gamepad, short left_rumble, short right_rumble, int duration_ms) {
		var mh$ = SDL_RumbleGamepadTriggers.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RumbleGamepadTriggers", gamepad, left_rumble, right_rumble, duration_ms);
			}
			return (boolean) mh$.invokeExact(gamepad, left_rumble, right_rumble, duration_ms);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetGamepadLED {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_CHAR,
				SDL3.C_CHAR,
				SDL3.C_CHAR
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetGamepadLED");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetGamepadLED$descriptor() {
		return SDL_SetGamepadLED.DESC;
	}

	public static MethodHandle SDL_SetGamepadLED$handle() {
		return SDL_SetGamepadLED.HANDLE;
	}

	public static MemorySegment SDL_SetGamepadLED$address() {
		return SDL_SetGamepadLED.ADDR;
	}

	public static boolean SDL_SetGamepadLED(MemorySegment gamepad, byte red, byte green, byte blue) {
		var mh$ = SDL_SetGamepadLED.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetGamepadLED", gamepad, red, green, blue);
			}
			return (boolean) mh$.invokeExact(gamepad, red, green, blue);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SendGamepadEffect {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SendGamepadEffect");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SendGamepadEffect$descriptor() {
		return SDL_SendGamepadEffect.DESC;
	}

	public static MethodHandle SDL_SendGamepadEffect$handle() {
		return SDL_SendGamepadEffect.HANDLE;
	}

	public static MemorySegment SDL_SendGamepadEffect$address() {
		return SDL_SendGamepadEffect.ADDR;
	}

	public static boolean SDL_SendGamepadEffect(MemorySegment gamepad, MemorySegment data, int size) {
		var mh$ = SDL_SendGamepadEffect.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SendGamepadEffect", gamepad, data, size);
			}
			return (boolean) mh$.invokeExact(gamepad, data, size);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CloseGamepad {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CloseGamepad");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CloseGamepad$descriptor() {
		return SDL_CloseGamepad.DESC;
	}

	public static MethodHandle SDL_CloseGamepad$handle() {
		return SDL_CloseGamepad.HANDLE;
	}

	public static MemorySegment SDL_CloseGamepad$address() {
		return SDL_CloseGamepad.ADDR;
	}

	public static void SDL_CloseGamepad(MemorySegment gamepad) {
		var mh$ = SDL_CloseGamepad.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CloseGamepad", gamepad);
			}
			mh$.invokeExact(gamepad);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadAppleSFSymbolsNameForButton {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadAppleSFSymbolsNameForButton");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadAppleSFSymbolsNameForButton$descriptor() {
		return SDL_GetGamepadAppleSFSymbolsNameForButton.DESC;
	}

	public static MethodHandle SDL_GetGamepadAppleSFSymbolsNameForButton$handle() {
		return SDL_GetGamepadAppleSFSymbolsNameForButton.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadAppleSFSymbolsNameForButton$address() {
		return SDL_GetGamepadAppleSFSymbolsNameForButton.ADDR;
	}

	public static MemorySegment SDL_GetGamepadAppleSFSymbolsNameForButton(MemorySegment gamepad, int button) {
		var mh$ = SDL_GetGamepadAppleSFSymbolsNameForButton.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadAppleSFSymbolsNameForButton", gamepad, button);
			}
			return (MemorySegment) mh$.invokeExact(gamepad, button);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGamepadAppleSFSymbolsNameForAxis {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGamepadAppleSFSymbolsNameForAxis");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGamepadAppleSFSymbolsNameForAxis$descriptor() {
		return SDL_GetGamepadAppleSFSymbolsNameForAxis.DESC;
	}

	public static MethodHandle SDL_GetGamepadAppleSFSymbolsNameForAxis$handle() {
		return SDL_GetGamepadAppleSFSymbolsNameForAxis.HANDLE;
	}

	public static MemorySegment SDL_GetGamepadAppleSFSymbolsNameForAxis$address() {
		return SDL_GetGamepadAppleSFSymbolsNameForAxis.ADDR;
	}

	public static MemorySegment SDL_GetGamepadAppleSFSymbolsNameForAxis(MemorySegment gamepad, int axis) {
		var mh$ = SDL_GetGamepadAppleSFSymbolsNameForAxis.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGamepadAppleSFSymbolsNameForAxis", gamepad, axis);
			}
			return (MemorySegment) mh$.invokeExact(gamepad, axis);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static final int SDL_SCANCODE_UNKNOWN = (int) 0L;

	public static int SDL_SCANCODE_UNKNOWN() {
		return SDL_SCANCODE_UNKNOWN;
	}

	private static final int SDL_SCANCODE_A = (int) 4L;

	public static int SDL_SCANCODE_A() {
		return SDL_SCANCODE_A;
	}

	private static final int SDL_SCANCODE_B = (int) 5L;

	public static int SDL_SCANCODE_B() {
		return SDL_SCANCODE_B;
	}

	private static final int SDL_SCANCODE_C = (int) 6L;

	public static int SDL_SCANCODE_C() {
		return SDL_SCANCODE_C;
	}

	private static final int SDL_SCANCODE_D = (int) 7L;

	public static int SDL_SCANCODE_D() {
		return SDL_SCANCODE_D;
	}

	private static final int SDL_SCANCODE_E = (int) 8L;

	public static int SDL_SCANCODE_E() {
		return SDL_SCANCODE_E;
	}

	private static final int SDL_SCANCODE_F = (int) 9L;

	public static int SDL_SCANCODE_F() {
		return SDL_SCANCODE_F;
	}

	private static final int SDL_SCANCODE_G = (int) 10L;

	public static int SDL_SCANCODE_G() {
		return SDL_SCANCODE_G;
	}

	private static final int SDL_SCANCODE_H = (int) 11L;

	public static int SDL_SCANCODE_H() {
		return SDL_SCANCODE_H;
	}

	private static final int SDL_SCANCODE_I = (int) 12L;

	public static int SDL_SCANCODE_I() {
		return SDL_SCANCODE_I;
	}

	private static final int SDL_SCANCODE_J = (int) 13L;

	public static int SDL_SCANCODE_J() {
		return SDL_SCANCODE_J;
	}

	private static final int SDL_SCANCODE_K = (int) 14L;

	public static int SDL_SCANCODE_K() {
		return SDL_SCANCODE_K;
	}

	private static final int SDL_SCANCODE_L = (int) 15L;

	public static int SDL_SCANCODE_L() {
		return SDL_SCANCODE_L;
	}

	private static final int SDL_SCANCODE_M = (int) 16L;

	public static int SDL_SCANCODE_M() {
		return SDL_SCANCODE_M;
	}

	private static final int SDL_SCANCODE_N = (int) 17L;

	public static int SDL_SCANCODE_N() {
		return SDL_SCANCODE_N;
	}

	private static final int SDL_SCANCODE_O = (int) 18L;

	public static int SDL_SCANCODE_O() {
		return SDL_SCANCODE_O;
	}

	private static final int SDL_SCANCODE_P = (int) 19L;

	public static int SDL_SCANCODE_P() {
		return SDL_SCANCODE_P;
	}

	private static final int SDL_SCANCODE_Q = (int) 20L;

	public static int SDL_SCANCODE_Q() {
		return SDL_SCANCODE_Q;
	}

	private static final int SDL_SCANCODE_R = (int) 21L;

	public static int SDL_SCANCODE_R() {
		return SDL_SCANCODE_R;
	}

	private static final int SDL_SCANCODE_S = (int) 22L;

	public static int SDL_SCANCODE_S() {
		return SDL_SCANCODE_S;
	}

	private static final int SDL_SCANCODE_T = (int) 23L;

	public static int SDL_SCANCODE_T() {
		return SDL_SCANCODE_T;
	}

	private static final int SDL_SCANCODE_U = (int) 24L;

	public static int SDL_SCANCODE_U() {
		return SDL_SCANCODE_U;
	}

	private static final int SDL_SCANCODE_V = (int) 25L;

	public static int SDL_SCANCODE_V() {
		return SDL_SCANCODE_V;
	}

	private static final int SDL_SCANCODE_W = (int) 26L;

	public static int SDL_SCANCODE_W() {
		return SDL_SCANCODE_W;
	}

	private static final int SDL_SCANCODE_X = (int) 27L;

	public static int SDL_SCANCODE_X() {
		return SDL_SCANCODE_X;
	}

	private static final int SDL_SCANCODE_Y = (int) 28L;

	public static int SDL_SCANCODE_Y() {
		return SDL_SCANCODE_Y;
	}

	private static final int SDL_SCANCODE_Z = (int) 29L;

	public static int SDL_SCANCODE_Z() {
		return SDL_SCANCODE_Z;
	}

	private static final int SDL_SCANCODE_1 = (int) 30L;

	public static int SDL_SCANCODE_1() {
		return SDL_SCANCODE_1;
	}

	private static final int SDL_SCANCODE_2 = (int) 31L;

	public static int SDL_SCANCODE_2() {
		return SDL_SCANCODE_2;
	}

	private static final int SDL_SCANCODE_3 = (int) 32L;

	public static int SDL_SCANCODE_3() {
		return SDL_SCANCODE_3;
	}

	private static final int SDL_SCANCODE_4 = (int) 33L;

	public static int SDL_SCANCODE_4() {
		return SDL_SCANCODE_4;
	}

	private static final int SDL_SCANCODE_5 = (int) 34L;

	public static int SDL_SCANCODE_5() {
		return SDL_SCANCODE_5;
	}

	private static final int SDL_SCANCODE_6 = (int) 35L;

	public static int SDL_SCANCODE_6() {
		return SDL_SCANCODE_6;
	}

	private static final int SDL_SCANCODE_7 = (int) 36L;

	public static int SDL_SCANCODE_7() {
		return SDL_SCANCODE_7;
	}

	private static final int SDL_SCANCODE_8 = (int) 37L;

	public static int SDL_SCANCODE_8() {
		return SDL_SCANCODE_8;
	}

	private static final int SDL_SCANCODE_9 = (int) 38L;

	public static int SDL_SCANCODE_9() {
		return SDL_SCANCODE_9;
	}

	private static final int SDL_SCANCODE_0 = (int) 39L;

	public static int SDL_SCANCODE_0() {
		return SDL_SCANCODE_0;
	}

	private static final int SDL_SCANCODE_RETURN = (int) 40L;

	public static int SDL_SCANCODE_RETURN() {
		return SDL_SCANCODE_RETURN;
	}

	private static final int SDL_SCANCODE_ESCAPE = (int) 41L;

	public static int SDL_SCANCODE_ESCAPE() {
		return SDL_SCANCODE_ESCAPE;
	}

	private static final int SDL_SCANCODE_BACKSPACE = (int) 42L;

	public static int SDL_SCANCODE_BACKSPACE() {
		return SDL_SCANCODE_BACKSPACE;
	}

	private static final int SDL_SCANCODE_TAB = (int) 43L;

	public static int SDL_SCANCODE_TAB() {
		return SDL_SCANCODE_TAB;
	}

	private static final int SDL_SCANCODE_SPACE = (int) 44L;

	public static int SDL_SCANCODE_SPACE() {
		return SDL_SCANCODE_SPACE;
	}

	private static final int SDL_SCANCODE_MINUS = (int) 45L;

	public static int SDL_SCANCODE_MINUS() {
		return SDL_SCANCODE_MINUS;
	}

	private static final int SDL_SCANCODE_EQUALS = (int) 46L;

	public static int SDL_SCANCODE_EQUALS() {
		return SDL_SCANCODE_EQUALS;
	}

	private static final int SDL_SCANCODE_LEFTBRACKET = (int) 47L;

	public static int SDL_SCANCODE_LEFTBRACKET() {
		return SDL_SCANCODE_LEFTBRACKET;
	}

	private static final int SDL_SCANCODE_RIGHTBRACKET = (int) 48L;

	public static int SDL_SCANCODE_RIGHTBRACKET() {
		return SDL_SCANCODE_RIGHTBRACKET;
	}

	private static final int SDL_SCANCODE_BACKSLASH = (int) 49L;

	public static int SDL_SCANCODE_BACKSLASH() {
		return SDL_SCANCODE_BACKSLASH;
	}

	private static final int SDL_SCANCODE_NONUSHASH = (int) 50L;

	public static int SDL_SCANCODE_NONUSHASH() {
		return SDL_SCANCODE_NONUSHASH;
	}

	private static final int SDL_SCANCODE_SEMICOLON = (int) 51L;

	public static int SDL_SCANCODE_SEMICOLON() {
		return SDL_SCANCODE_SEMICOLON;
	}

	private static final int SDL_SCANCODE_APOSTROPHE = (int) 52L;

	public static int SDL_SCANCODE_APOSTROPHE() {
		return SDL_SCANCODE_APOSTROPHE;
	}

	private static final int SDL_SCANCODE_GRAVE = (int) 53L;

	public static int SDL_SCANCODE_GRAVE() {
		return SDL_SCANCODE_GRAVE;
	}

	private static final int SDL_SCANCODE_COMMA = (int) 54L;

	public static int SDL_SCANCODE_COMMA() {
		return SDL_SCANCODE_COMMA;
	}

	private static final int SDL_SCANCODE_PERIOD = (int) 55L;

	public static int SDL_SCANCODE_PERIOD() {
		return SDL_SCANCODE_PERIOD;
	}

	private static final int SDL_SCANCODE_SLASH = (int) 56L;

	public static int SDL_SCANCODE_SLASH() {
		return SDL_SCANCODE_SLASH;
	}

	private static final int SDL_SCANCODE_CAPSLOCK = (int) 57L;

	public static int SDL_SCANCODE_CAPSLOCK() {
		return SDL_SCANCODE_CAPSLOCK;
	}

	private static final int SDL_SCANCODE_F1 = (int) 58L;

	public static int SDL_SCANCODE_F1() {
		return SDL_SCANCODE_F1;
	}

	private static final int SDL_SCANCODE_F2 = (int) 59L;

	public static int SDL_SCANCODE_F2() {
		return SDL_SCANCODE_F2;
	}

	private static final int SDL_SCANCODE_F3 = (int) 60L;

	public static int SDL_SCANCODE_F3() {
		return SDL_SCANCODE_F3;
	}

	private static final int SDL_SCANCODE_F4 = (int) 61L;

	public static int SDL_SCANCODE_F4() {
		return SDL_SCANCODE_F4;
	}

	private static final int SDL_SCANCODE_F5 = (int) 62L;

	public static int SDL_SCANCODE_F5() {
		return SDL_SCANCODE_F5;
	}

	private static final int SDL_SCANCODE_F6 = (int) 63L;

	public static int SDL_SCANCODE_F6() {
		return SDL_SCANCODE_F6;
	}

	private static final int SDL_SCANCODE_F7 = (int) 64L;

	public static int SDL_SCANCODE_F7() {
		return SDL_SCANCODE_F7;
	}

	private static final int SDL_SCANCODE_F8 = (int) 65L;

	public static int SDL_SCANCODE_F8() {
		return SDL_SCANCODE_F8;
	}

	private static final int SDL_SCANCODE_F9 = (int) 66L;

	public static int SDL_SCANCODE_F9() {
		return SDL_SCANCODE_F9;
	}

	private static final int SDL_SCANCODE_F10 = (int) 67L;

	public static int SDL_SCANCODE_F10() {
		return SDL_SCANCODE_F10;
	}

	private static final int SDL_SCANCODE_F11 = (int) 68L;

	public static int SDL_SCANCODE_F11() {
		return SDL_SCANCODE_F11;
	}

	private static final int SDL_SCANCODE_F12 = (int) 69L;

	public static int SDL_SCANCODE_F12() {
		return SDL_SCANCODE_F12;
	}

	private static final int SDL_SCANCODE_PRINTSCREEN = (int) 70L;

	public static int SDL_SCANCODE_PRINTSCREEN() {
		return SDL_SCANCODE_PRINTSCREEN;
	}

	private static final int SDL_SCANCODE_SCROLLLOCK = (int) 71L;

	public static int SDL_SCANCODE_SCROLLLOCK() {
		return SDL_SCANCODE_SCROLLLOCK;
	}

	private static final int SDL_SCANCODE_PAUSE = (int) 72L;

	public static int SDL_SCANCODE_PAUSE() {
		return SDL_SCANCODE_PAUSE;
	}

	private static final int SDL_SCANCODE_INSERT = (int) 73L;

	public static int SDL_SCANCODE_INSERT() {
		return SDL_SCANCODE_INSERT;
	}

	private static final int SDL_SCANCODE_HOME = (int) 74L;

	public static int SDL_SCANCODE_HOME() {
		return SDL_SCANCODE_HOME;
	}

	private static final int SDL_SCANCODE_PAGEUP = (int) 75L;

	public static int SDL_SCANCODE_PAGEUP() {
		return SDL_SCANCODE_PAGEUP;
	}

	private static final int SDL_SCANCODE_DELETE = (int) 76L;

	public static int SDL_SCANCODE_DELETE() {
		return SDL_SCANCODE_DELETE;
	}

	private static final int SDL_SCANCODE_END = (int) 77L;

	public static int SDL_SCANCODE_END() {
		return SDL_SCANCODE_END;
	}

	private static final int SDL_SCANCODE_PAGEDOWN = (int) 78L;

	public static int SDL_SCANCODE_PAGEDOWN() {
		return SDL_SCANCODE_PAGEDOWN;
	}

	private static final int SDL_SCANCODE_RIGHT = (int) 79L;

	public static int SDL_SCANCODE_RIGHT() {
		return SDL_SCANCODE_RIGHT;
	}

	private static final int SDL_SCANCODE_LEFT = (int) 80L;

	public static int SDL_SCANCODE_LEFT() {
		return SDL_SCANCODE_LEFT;
	}

	private static final int SDL_SCANCODE_DOWN = (int) 81L;

	public static int SDL_SCANCODE_DOWN() {
		return SDL_SCANCODE_DOWN;
	}

	private static final int SDL_SCANCODE_UP = (int) 82L;

	public static int SDL_SCANCODE_UP() {
		return SDL_SCANCODE_UP;
	}

	private static final int SDL_SCANCODE_NUMLOCKCLEAR = (int) 83L;

	public static int SDL_SCANCODE_NUMLOCKCLEAR() {
		return SDL_SCANCODE_NUMLOCKCLEAR;
	}

	private static final int SDL_SCANCODE_KP_DIVIDE = (int) 84L;

	public static int SDL_SCANCODE_KP_DIVIDE() {
		return SDL_SCANCODE_KP_DIVIDE;
	}

	private static final int SDL_SCANCODE_KP_MULTIPLY = (int) 85L;

	public static int SDL_SCANCODE_KP_MULTIPLY() {
		return SDL_SCANCODE_KP_MULTIPLY;
	}

	private static final int SDL_SCANCODE_KP_MINUS = (int) 86L;

	public static int SDL_SCANCODE_KP_MINUS() {
		return SDL_SCANCODE_KP_MINUS;
	}

	private static final int SDL_SCANCODE_KP_PLUS = (int) 87L;

	public static int SDL_SCANCODE_KP_PLUS() {
		return SDL_SCANCODE_KP_PLUS;
	}

	private static final int SDL_SCANCODE_KP_ENTER = (int) 88L;

	public static int SDL_SCANCODE_KP_ENTER() {
		return SDL_SCANCODE_KP_ENTER;
	}

	private static final int SDL_SCANCODE_KP_1 = (int) 89L;

	public static int SDL_SCANCODE_KP_1() {
		return SDL_SCANCODE_KP_1;
	}

	private static final int SDL_SCANCODE_KP_2 = (int) 90L;

	public static int SDL_SCANCODE_KP_2() {
		return SDL_SCANCODE_KP_2;
	}

	private static final int SDL_SCANCODE_KP_3 = (int) 91L;

	public static int SDL_SCANCODE_KP_3() {
		return SDL_SCANCODE_KP_3;
	}

	private static final int SDL_SCANCODE_KP_4 = (int) 92L;

	public static int SDL_SCANCODE_KP_4() {
		return SDL_SCANCODE_KP_4;
	}

	private static final int SDL_SCANCODE_KP_5 = (int) 93L;

	public static int SDL_SCANCODE_KP_5() {
		return SDL_SCANCODE_KP_5;
	}

	private static final int SDL_SCANCODE_KP_6 = (int) 94L;

	public static int SDL_SCANCODE_KP_6() {
		return SDL_SCANCODE_KP_6;
	}

	private static final int SDL_SCANCODE_KP_7 = (int) 95L;

	public static int SDL_SCANCODE_KP_7() {
		return SDL_SCANCODE_KP_7;
	}

	private static final int SDL_SCANCODE_KP_8 = (int) 96L;

	public static int SDL_SCANCODE_KP_8() {
		return SDL_SCANCODE_KP_8;
	}

	private static final int SDL_SCANCODE_KP_9 = (int) 97L;

	public static int SDL_SCANCODE_KP_9() {
		return SDL_SCANCODE_KP_9;
	}

	private static final int SDL_SCANCODE_KP_0 = (int) 98L;

	public static int SDL_SCANCODE_KP_0() {
		return SDL_SCANCODE_KP_0;
	}

	private static final int SDL_SCANCODE_KP_PERIOD = (int) 99L;

	public static int SDL_SCANCODE_KP_PERIOD() {
		return SDL_SCANCODE_KP_PERIOD;
	}

	private static final int SDL_SCANCODE_NONUSBACKSLASH = (int) 100L;

	public static int SDL_SCANCODE_NONUSBACKSLASH() {
		return SDL_SCANCODE_NONUSBACKSLASH;
	}

	private static final int SDL_SCANCODE_APPLICATION = (int) 101L;

	public static int SDL_SCANCODE_APPLICATION() {
		return SDL_SCANCODE_APPLICATION;
	}

	private static final int SDL_SCANCODE_POWER = (int) 102L;

	public static int SDL_SCANCODE_POWER() {
		return SDL_SCANCODE_POWER;
	}

	private static final int SDL_SCANCODE_KP_EQUALS = (int) 103L;

	public static int SDL_SCANCODE_KP_EQUALS() {
		return SDL_SCANCODE_KP_EQUALS;
	}

	private static final int SDL_SCANCODE_F13 = (int) 104L;

	public static int SDL_SCANCODE_F13() {
		return SDL_SCANCODE_F13;
	}

	private static final int SDL_SCANCODE_F14 = (int) 105L;

	public static int SDL_SCANCODE_F14() {
		return SDL_SCANCODE_F14;
	}

	private static final int SDL_SCANCODE_F15 = (int) 106L;

	public static int SDL_SCANCODE_F15() {
		return SDL_SCANCODE_F15;
	}

	private static final int SDL_SCANCODE_F16 = (int) 107L;

	public static int SDL_SCANCODE_F16() {
		return SDL_SCANCODE_F16;
	}

	private static final int SDL_SCANCODE_F17 = (int) 108L;

	public static int SDL_SCANCODE_F17() {
		return SDL_SCANCODE_F17;
	}

	private static final int SDL_SCANCODE_F18 = (int) 109L;

	public static int SDL_SCANCODE_F18() {
		return SDL_SCANCODE_F18;
	}

	private static final int SDL_SCANCODE_F19 = (int) 110L;

	public static int SDL_SCANCODE_F19() {
		return SDL_SCANCODE_F19;
	}

	private static final int SDL_SCANCODE_F20 = (int) 111L;

	public static int SDL_SCANCODE_F20() {
		return SDL_SCANCODE_F20;
	}

	private static final int SDL_SCANCODE_F21 = (int) 112L;

	public static int SDL_SCANCODE_F21() {
		return SDL_SCANCODE_F21;
	}

	private static final int SDL_SCANCODE_F22 = (int) 113L;

	public static int SDL_SCANCODE_F22() {
		return SDL_SCANCODE_F22;
	}

	private static final int SDL_SCANCODE_F23 = (int) 114L;

	public static int SDL_SCANCODE_F23() {
		return SDL_SCANCODE_F23;
	}

	private static final int SDL_SCANCODE_F24 = (int) 115L;

	public static int SDL_SCANCODE_F24() {
		return SDL_SCANCODE_F24;
	}

	private static final int SDL_SCANCODE_EXECUTE = (int) 116L;

	public static int SDL_SCANCODE_EXECUTE() {
		return SDL_SCANCODE_EXECUTE;
	}

	private static final int SDL_SCANCODE_HELP = (int) 117L;

	public static int SDL_SCANCODE_HELP() {
		return SDL_SCANCODE_HELP;
	}

	private static final int SDL_SCANCODE_MENU = (int) 118L;

	public static int SDL_SCANCODE_MENU() {
		return SDL_SCANCODE_MENU;
	}

	private static final int SDL_SCANCODE_SELECT = (int) 119L;

	public static int SDL_SCANCODE_SELECT() {
		return SDL_SCANCODE_SELECT;
	}

	private static final int SDL_SCANCODE_STOP = (int) 120L;

	public static int SDL_SCANCODE_STOP() {
		return SDL_SCANCODE_STOP;
	}

	private static final int SDL_SCANCODE_AGAIN = (int) 121L;

	public static int SDL_SCANCODE_AGAIN() {
		return SDL_SCANCODE_AGAIN;
	}

	private static final int SDL_SCANCODE_UNDO = (int) 122L;

	public static int SDL_SCANCODE_UNDO() {
		return SDL_SCANCODE_UNDO;
	}

	private static final int SDL_SCANCODE_CUT = (int) 123L;

	public static int SDL_SCANCODE_CUT() {
		return SDL_SCANCODE_CUT;
	}

	private static final int SDL_SCANCODE_COPY = (int) 124L;

	public static int SDL_SCANCODE_COPY() {
		return SDL_SCANCODE_COPY;
	}

	private static final int SDL_SCANCODE_PASTE = (int) 125L;

	public static int SDL_SCANCODE_PASTE() {
		return SDL_SCANCODE_PASTE;
	}

	private static final int SDL_SCANCODE_FIND = (int) 126L;

	public static int SDL_SCANCODE_FIND() {
		return SDL_SCANCODE_FIND;
	}

	private static final int SDL_SCANCODE_MUTE = (int) 127L;

	public static int SDL_SCANCODE_MUTE() {
		return SDL_SCANCODE_MUTE;
	}

	private static final int SDL_SCANCODE_VOLUMEUP = (int) 128L;

	public static int SDL_SCANCODE_VOLUMEUP() {
		return SDL_SCANCODE_VOLUMEUP;
	}

	private static final int SDL_SCANCODE_VOLUMEDOWN = (int) 129L;

	public static int SDL_SCANCODE_VOLUMEDOWN() {
		return SDL_SCANCODE_VOLUMEDOWN;
	}

	private static final int SDL_SCANCODE_KP_COMMA = (int) 133L;

	public static int SDL_SCANCODE_KP_COMMA() {
		return SDL_SCANCODE_KP_COMMA;
	}

	private static final int SDL_SCANCODE_KP_EQUALSAS400 = (int) 134L;

	public static int SDL_SCANCODE_KP_EQUALSAS400() {
		return SDL_SCANCODE_KP_EQUALSAS400;
	}

	private static final int SDL_SCANCODE_INTERNATIONAL1 = (int) 135L;

	public static int SDL_SCANCODE_INTERNATIONAL1() {
		return SDL_SCANCODE_INTERNATIONAL1;
	}

	private static final int SDL_SCANCODE_INTERNATIONAL2 = (int) 136L;

	public static int SDL_SCANCODE_INTERNATIONAL2() {
		return SDL_SCANCODE_INTERNATIONAL2;
	}

	private static final int SDL_SCANCODE_INTERNATIONAL3 = (int) 137L;

	public static int SDL_SCANCODE_INTERNATIONAL3() {
		return SDL_SCANCODE_INTERNATIONAL3;
	}

	private static final int SDL_SCANCODE_INTERNATIONAL4 = (int) 138L;

	public static int SDL_SCANCODE_INTERNATIONAL4() {
		return SDL_SCANCODE_INTERNATIONAL4;
	}

	private static final int SDL_SCANCODE_INTERNATIONAL5 = (int) 139L;

	public static int SDL_SCANCODE_INTERNATIONAL5() {
		return SDL_SCANCODE_INTERNATIONAL5;
	}

	private static final int SDL_SCANCODE_INTERNATIONAL6 = (int) 140L;

	public static int SDL_SCANCODE_INTERNATIONAL6() {
		return SDL_SCANCODE_INTERNATIONAL6;
	}

	private static final int SDL_SCANCODE_INTERNATIONAL7 = (int) 141L;

	public static int SDL_SCANCODE_INTERNATIONAL7() {
		return SDL_SCANCODE_INTERNATIONAL7;
	}

	private static final int SDL_SCANCODE_INTERNATIONAL8 = (int) 142L;

	public static int SDL_SCANCODE_INTERNATIONAL8() {
		return SDL_SCANCODE_INTERNATIONAL8;
	}

	private static final int SDL_SCANCODE_INTERNATIONAL9 = (int) 143L;

	public static int SDL_SCANCODE_INTERNATIONAL9() {
		return SDL_SCANCODE_INTERNATIONAL9;
	}

	private static final int SDL_SCANCODE_LANG1 = (int) 144L;

	public static int SDL_SCANCODE_LANG1() {
		return SDL_SCANCODE_LANG1;
	}

	private static final int SDL_SCANCODE_LANG2 = (int) 145L;

	public static int SDL_SCANCODE_LANG2() {
		return SDL_SCANCODE_LANG2;
	}

	private static final int SDL_SCANCODE_LANG3 = (int) 146L;

	public static int SDL_SCANCODE_LANG3() {
		return SDL_SCANCODE_LANG3;
	}

	private static final int SDL_SCANCODE_LANG4 = (int) 147L;

	public static int SDL_SCANCODE_LANG4() {
		return SDL_SCANCODE_LANG4;
	}

	private static final int SDL_SCANCODE_LANG5 = (int) 148L;

	public static int SDL_SCANCODE_LANG5() {
		return SDL_SCANCODE_LANG5;
	}

	private static final int SDL_SCANCODE_LANG6 = (int) 149L;

	public static int SDL_SCANCODE_LANG6() {
		return SDL_SCANCODE_LANG6;
	}

	private static final int SDL_SCANCODE_LANG7 = (int) 150L;

	public static int SDL_SCANCODE_LANG7() {
		return SDL_SCANCODE_LANG7;
	}

	private static final int SDL_SCANCODE_LANG8 = (int) 151L;

	public static int SDL_SCANCODE_LANG8() {
		return SDL_SCANCODE_LANG8;
	}

	private static final int SDL_SCANCODE_LANG9 = (int) 152L;

	public static int SDL_SCANCODE_LANG9() {
		return SDL_SCANCODE_LANG9;
	}

	private static final int SDL_SCANCODE_ALTERASE = (int) 153L;

	public static int SDL_SCANCODE_ALTERASE() {
		return SDL_SCANCODE_ALTERASE;
	}

	private static final int SDL_SCANCODE_SYSREQ = (int) 154L;

	public static int SDL_SCANCODE_SYSREQ() {
		return SDL_SCANCODE_SYSREQ;
	}

	private static final int SDL_SCANCODE_CANCEL = (int) 155L;

	public static int SDL_SCANCODE_CANCEL() {
		return SDL_SCANCODE_CANCEL;
	}

	private static final int SDL_SCANCODE_CLEAR = (int) 156L;

	public static int SDL_SCANCODE_CLEAR() {
		return SDL_SCANCODE_CLEAR;
	}

	private static final int SDL_SCANCODE_PRIOR = (int) 157L;

	public static int SDL_SCANCODE_PRIOR() {
		return SDL_SCANCODE_PRIOR;
	}

	private static final int SDL_SCANCODE_RETURN2 = (int) 158L;

	public static int SDL_SCANCODE_RETURN2() {
		return SDL_SCANCODE_RETURN2;
	}

	private static final int SDL_SCANCODE_SEPARATOR = (int) 159L;

	public static int SDL_SCANCODE_SEPARATOR() {
		return SDL_SCANCODE_SEPARATOR;
	}

	private static final int SDL_SCANCODE_OUT = (int) 160L;

	public static int SDL_SCANCODE_OUT() {
		return SDL_SCANCODE_OUT;
	}

	private static final int SDL_SCANCODE_OPER = (int) 161L;

	public static int SDL_SCANCODE_OPER() {
		return SDL_SCANCODE_OPER;
	}

	private static final int SDL_SCANCODE_CLEARAGAIN = (int) 162L;

	public static int SDL_SCANCODE_CLEARAGAIN() {
		return SDL_SCANCODE_CLEARAGAIN;
	}

	private static final int SDL_SCANCODE_CRSEL = (int) 163L;

	public static int SDL_SCANCODE_CRSEL() {
		return SDL_SCANCODE_CRSEL;
	}

	private static final int SDL_SCANCODE_EXSEL = (int) 164L;

	public static int SDL_SCANCODE_EXSEL() {
		return SDL_SCANCODE_EXSEL;
	}

	private static final int SDL_SCANCODE_FRONT = (int) 165L;

	public static int SDL_SCANCODE_FRONT() {
		return SDL_SCANCODE_FRONT;
	}

	private static final int SDL_SCANCODE_KP_00 = (int) 176L;

	public static int SDL_SCANCODE_KP_00() {
		return SDL_SCANCODE_KP_00;
	}

	private static final int SDL_SCANCODE_KP_000 = (int) 177L;

	public static int SDL_SCANCODE_KP_000() {
		return SDL_SCANCODE_KP_000;
	}

	private static final int SDL_SCANCODE_THOUSANDSSEPARATOR = (int) 178L;

	public static int SDL_SCANCODE_THOUSANDSSEPARATOR() {
		return SDL_SCANCODE_THOUSANDSSEPARATOR;
	}

	private static final int SDL_SCANCODE_DECIMALSEPARATOR = (int) 179L;

	public static int SDL_SCANCODE_DECIMALSEPARATOR() {
		return SDL_SCANCODE_DECIMALSEPARATOR;
	}

	private static final int SDL_SCANCODE_CURRENCYUNIT = (int) 180L;

	public static int SDL_SCANCODE_CURRENCYUNIT() {
		return SDL_SCANCODE_CURRENCYUNIT;
	}

	private static final int SDL_SCANCODE_CURRENCYSUBUNIT = (int) 181L;

	public static int SDL_SCANCODE_CURRENCYSUBUNIT() {
		return SDL_SCANCODE_CURRENCYSUBUNIT;
	}

	private static final int SDL_SCANCODE_KP_LEFTPAREN = (int) 182L;

	public static int SDL_SCANCODE_KP_LEFTPAREN() {
		return SDL_SCANCODE_KP_LEFTPAREN;
	}

	private static final int SDL_SCANCODE_KP_RIGHTPAREN = (int) 183L;

	public static int SDL_SCANCODE_KP_RIGHTPAREN() {
		return SDL_SCANCODE_KP_RIGHTPAREN;
	}

	private static final int SDL_SCANCODE_KP_LEFTBRACE = (int) 184L;

	public static int SDL_SCANCODE_KP_LEFTBRACE() {
		return SDL_SCANCODE_KP_LEFTBRACE;
	}

	private static final int SDL_SCANCODE_KP_RIGHTBRACE = (int) 185L;

	public static int SDL_SCANCODE_KP_RIGHTBRACE() {
		return SDL_SCANCODE_KP_RIGHTBRACE;
	}

	private static final int SDL_SCANCODE_KP_TAB = (int) 186L;

	public static int SDL_SCANCODE_KP_TAB() {
		return SDL_SCANCODE_KP_TAB;
	}

	private static final int SDL_SCANCODE_KP_BACKSPACE = (int) 187L;

	public static int SDL_SCANCODE_KP_BACKSPACE() {
		return SDL_SCANCODE_KP_BACKSPACE;
	}

	private static final int SDL_SCANCODE_KP_A = (int) 188L;

	public static int SDL_SCANCODE_KP_A() {
		return SDL_SCANCODE_KP_A;
	}

	private static final int SDL_SCANCODE_KP_B = (int) 189L;

	public static int SDL_SCANCODE_KP_B() {
		return SDL_SCANCODE_KP_B;
	}

	private static final int SDL_SCANCODE_KP_C = (int) 190L;

	public static int SDL_SCANCODE_KP_C() {
		return SDL_SCANCODE_KP_C;
	}

	private static final int SDL_SCANCODE_KP_D = (int) 191L;

	public static int SDL_SCANCODE_KP_D() {
		return SDL_SCANCODE_KP_D;
	}

	private static final int SDL_SCANCODE_KP_E = (int) 192L;

	public static int SDL_SCANCODE_KP_E() {
		return SDL_SCANCODE_KP_E;
	}

	private static final int SDL_SCANCODE_KP_F = (int) 193L;

	public static int SDL_SCANCODE_KP_F() {
		return SDL_SCANCODE_KP_F;
	}

	private static final int SDL_SCANCODE_KP_XOR = (int) 194L;

	public static int SDL_SCANCODE_KP_XOR() {
		return SDL_SCANCODE_KP_XOR;
	}

	private static final int SDL_SCANCODE_KP_POWER = (int) 195L;

	public static int SDL_SCANCODE_KP_POWER() {
		return SDL_SCANCODE_KP_POWER;
	}

	private static final int SDL_SCANCODE_KP_PERCENT = (int) 196L;

	public static int SDL_SCANCODE_KP_PERCENT() {
		return SDL_SCANCODE_KP_PERCENT;
	}

	private static final int SDL_SCANCODE_KP_LESS = (int) 197L;

	public static int SDL_SCANCODE_KP_LESS() {
		return SDL_SCANCODE_KP_LESS;
	}

	private static final int SDL_SCANCODE_KP_GREATER = (int) 198L;

	public static int SDL_SCANCODE_KP_GREATER() {
		return SDL_SCANCODE_KP_GREATER;
	}

	private static final int SDL_SCANCODE_KP_AMPERSAND = (int) 199L;

	public static int SDL_SCANCODE_KP_AMPERSAND() {
		return SDL_SCANCODE_KP_AMPERSAND;
	}

	private static final int SDL_SCANCODE_KP_DBLAMPERSAND = (int) 200L;

	public static int SDL_SCANCODE_KP_DBLAMPERSAND() {
		return SDL_SCANCODE_KP_DBLAMPERSAND;
	}

	private static final int SDL_SCANCODE_KP_VERTICALBAR = (int) 201L;

	public static int SDL_SCANCODE_KP_VERTICALBAR() {
		return SDL_SCANCODE_KP_VERTICALBAR;
	}

	private static final int SDL_SCANCODE_KP_DBLVERTICALBAR = (int) 202L;

	public static int SDL_SCANCODE_KP_DBLVERTICALBAR() {
		return SDL_SCANCODE_KP_DBLVERTICALBAR;
	}

	private static final int SDL_SCANCODE_KP_COLON = (int) 203L;

	public static int SDL_SCANCODE_KP_COLON() {
		return SDL_SCANCODE_KP_COLON;
	}

	private static final int SDL_SCANCODE_KP_HASH = (int) 204L;

	public static int SDL_SCANCODE_KP_HASH() {
		return SDL_SCANCODE_KP_HASH;
	}

	private static final int SDL_SCANCODE_KP_SPACE = (int) 205L;

	public static int SDL_SCANCODE_KP_SPACE() {
		return SDL_SCANCODE_KP_SPACE;
	}

	private static final int SDL_SCANCODE_KP_AT = (int) 206L;

	public static int SDL_SCANCODE_KP_AT() {
		return SDL_SCANCODE_KP_AT;
	}

	private static final int SDL_SCANCODE_KP_EXCLAM = (int) 207L;

	public static int SDL_SCANCODE_KP_EXCLAM() {
		return SDL_SCANCODE_KP_EXCLAM;
	}

	private static final int SDL_SCANCODE_KP_MEMSTORE = (int) 208L;

	public static int SDL_SCANCODE_KP_MEMSTORE() {
		return SDL_SCANCODE_KP_MEMSTORE;
	}

	private static final int SDL_SCANCODE_KP_MEMRECALL = (int) 209L;

	public static int SDL_SCANCODE_KP_MEMRECALL() {
		return SDL_SCANCODE_KP_MEMRECALL;
	}

	private static final int SDL_SCANCODE_KP_MEMCLEAR = (int) 210L;

	public static int SDL_SCANCODE_KP_MEMCLEAR() {
		return SDL_SCANCODE_KP_MEMCLEAR;
	}

	private static final int SDL_SCANCODE_KP_MEMADD = (int) 211L;

	public static int SDL_SCANCODE_KP_MEMADD() {
		return SDL_SCANCODE_KP_MEMADD;
	}

	private static final int SDL_SCANCODE_KP_MEMSUBTRACT = (int) 212L;

	public static int SDL_SCANCODE_KP_MEMSUBTRACT() {
		return SDL_SCANCODE_KP_MEMSUBTRACT;
	}

	private static final int SDL_SCANCODE_KP_MEMMULTIPLY = (int) 213L;

	public static int SDL_SCANCODE_KP_MEMMULTIPLY() {
		return SDL_SCANCODE_KP_MEMMULTIPLY;
	}

	private static final int SDL_SCANCODE_KP_MEMDIVIDE = (int) 214L;

	public static int SDL_SCANCODE_KP_MEMDIVIDE() {
		return SDL_SCANCODE_KP_MEMDIVIDE;
	}

	private static final int SDL_SCANCODE_KP_PLUSMINUS = (int) 215L;

	public static int SDL_SCANCODE_KP_PLUSMINUS() {
		return SDL_SCANCODE_KP_PLUSMINUS;
	}

	private static final int SDL_SCANCODE_KP_CLEAR = (int) 216L;

	public static int SDL_SCANCODE_KP_CLEAR() {
		return SDL_SCANCODE_KP_CLEAR;
	}

	private static final int SDL_SCANCODE_KP_CLEARENTRY = (int) 217L;

	public static int SDL_SCANCODE_KP_CLEARENTRY() {
		return SDL_SCANCODE_KP_CLEARENTRY;
	}

	private static final int SDL_SCANCODE_KP_BINARY = (int) 218L;

	public static int SDL_SCANCODE_KP_BINARY() {
		return SDL_SCANCODE_KP_BINARY;
	}

	private static final int SDL_SCANCODE_KP_OCTAL = (int) 219L;

	public static int SDL_SCANCODE_KP_OCTAL() {
		return SDL_SCANCODE_KP_OCTAL;
	}

	private static final int SDL_SCANCODE_KP_DECIMAL = (int) 220L;

	public static int SDL_SCANCODE_KP_DECIMAL() {
		return SDL_SCANCODE_KP_DECIMAL;
	}

	private static final int SDL_SCANCODE_KP_HEXADECIMAL = (int) 221L;

	public static int SDL_SCANCODE_KP_HEXADECIMAL() {
		return SDL_SCANCODE_KP_HEXADECIMAL;
	}

	private static final int SDL_SCANCODE_LCTRL = (int) 224L;

	public static int SDL_SCANCODE_LCTRL() {
		return SDL_SCANCODE_LCTRL;
	}

	private static final int SDL_SCANCODE_LSHIFT = (int) 225L;

	public static int SDL_SCANCODE_LSHIFT() {
		return SDL_SCANCODE_LSHIFT;
	}

	private static final int SDL_SCANCODE_LALT = (int) 226L;

	public static int SDL_SCANCODE_LALT() {
		return SDL_SCANCODE_LALT;
	}

	private static final int SDL_SCANCODE_LGUI = (int) 227L;

	public static int SDL_SCANCODE_LGUI() {
		return SDL_SCANCODE_LGUI;
	}

	private static final int SDL_SCANCODE_RCTRL = (int) 228L;

	public static int SDL_SCANCODE_RCTRL() {
		return SDL_SCANCODE_RCTRL;
	}

	private static final int SDL_SCANCODE_RSHIFT = (int) 229L;

	public static int SDL_SCANCODE_RSHIFT() {
		return SDL_SCANCODE_RSHIFT;
	}

	private static final int SDL_SCANCODE_RALT = (int) 230L;

	public static int SDL_SCANCODE_RALT() {
		return SDL_SCANCODE_RALT;
	}

	private static final int SDL_SCANCODE_RGUI = (int) 231L;

	public static int SDL_SCANCODE_RGUI() {
		return SDL_SCANCODE_RGUI;
	}

	private static final int SDL_SCANCODE_MODE = (int) 257L;

	public static int SDL_SCANCODE_MODE() {
		return SDL_SCANCODE_MODE;
	}

	private static final int SDL_SCANCODE_SLEEP = (int) 258L;

	public static int SDL_SCANCODE_SLEEP() {
		return SDL_SCANCODE_SLEEP;
	}

	private static final int SDL_SCANCODE_WAKE = (int) 259L;

	public static int SDL_SCANCODE_WAKE() {
		return SDL_SCANCODE_WAKE;
	}

	private static final int SDL_SCANCODE_CHANNEL_INCREMENT = (int) 260L;

	public static int SDL_SCANCODE_CHANNEL_INCREMENT() {
		return SDL_SCANCODE_CHANNEL_INCREMENT;
	}

	private static final int SDL_SCANCODE_CHANNEL_DECREMENT = (int) 261L;

	public static int SDL_SCANCODE_CHANNEL_DECREMENT() {
		return SDL_SCANCODE_CHANNEL_DECREMENT;
	}

	private static final int SDL_SCANCODE_MEDIA_PLAY = (int) 262L;

	public static int SDL_SCANCODE_MEDIA_PLAY() {
		return SDL_SCANCODE_MEDIA_PLAY;
	}

	private static final int SDL_SCANCODE_MEDIA_PAUSE = (int) 263L;

	public static int SDL_SCANCODE_MEDIA_PAUSE() {
		return SDL_SCANCODE_MEDIA_PAUSE;
	}

	private static final int SDL_SCANCODE_MEDIA_RECORD = (int) 264L;

	public static int SDL_SCANCODE_MEDIA_RECORD() {
		return SDL_SCANCODE_MEDIA_RECORD;
	}

	private static final int SDL_SCANCODE_MEDIA_FAST_FORWARD = (int) 265L;

	public static int SDL_SCANCODE_MEDIA_FAST_FORWARD() {
		return SDL_SCANCODE_MEDIA_FAST_FORWARD;
	}

	private static final int SDL_SCANCODE_MEDIA_REWIND = (int) 266L;

	public static int SDL_SCANCODE_MEDIA_REWIND() {
		return SDL_SCANCODE_MEDIA_REWIND;
	}

	private static final int SDL_SCANCODE_MEDIA_NEXT_TRACK = (int) 267L;

	public static int SDL_SCANCODE_MEDIA_NEXT_TRACK() {
		return SDL_SCANCODE_MEDIA_NEXT_TRACK;
	}

	private static final int SDL_SCANCODE_MEDIA_PREVIOUS_TRACK = (int) 268L;

	public static int SDL_SCANCODE_MEDIA_PREVIOUS_TRACK() {
		return SDL_SCANCODE_MEDIA_PREVIOUS_TRACK;
	}

	private static final int SDL_SCANCODE_MEDIA_STOP = (int) 269L;

	public static int SDL_SCANCODE_MEDIA_STOP() {
		return SDL_SCANCODE_MEDIA_STOP;
	}

	private static final int SDL_SCANCODE_MEDIA_EJECT = (int) 270L;

	public static int SDL_SCANCODE_MEDIA_EJECT() {
		return SDL_SCANCODE_MEDIA_EJECT;
	}

	private static final int SDL_SCANCODE_MEDIA_PLAY_PAUSE = (int) 271L;

	public static int SDL_SCANCODE_MEDIA_PLAY_PAUSE() {
		return SDL_SCANCODE_MEDIA_PLAY_PAUSE;
	}

	private static final int SDL_SCANCODE_MEDIA_SELECT = (int) 272L;

	public static int SDL_SCANCODE_MEDIA_SELECT() {
		return SDL_SCANCODE_MEDIA_SELECT;
	}

	private static final int SDL_SCANCODE_AC_NEW = (int) 273L;

	public static int SDL_SCANCODE_AC_NEW() {
		return SDL_SCANCODE_AC_NEW;
	}

	private static final int SDL_SCANCODE_AC_OPEN = (int) 274L;

	public static int SDL_SCANCODE_AC_OPEN() {
		return SDL_SCANCODE_AC_OPEN;
	}

	private static final int SDL_SCANCODE_AC_CLOSE = (int) 275L;

	public static int SDL_SCANCODE_AC_CLOSE() {
		return SDL_SCANCODE_AC_CLOSE;
	}

	private static final int SDL_SCANCODE_AC_EXIT = (int) 276L;

	public static int SDL_SCANCODE_AC_EXIT() {
		return SDL_SCANCODE_AC_EXIT;
	}

	private static final int SDL_SCANCODE_AC_SAVE = (int) 277L;

	public static int SDL_SCANCODE_AC_SAVE() {
		return SDL_SCANCODE_AC_SAVE;
	}

	private static final int SDL_SCANCODE_AC_PRINT = (int) 278L;

	public static int SDL_SCANCODE_AC_PRINT() {
		return SDL_SCANCODE_AC_PRINT;
	}

	private static final int SDL_SCANCODE_AC_PROPERTIES = (int) 279L;

	public static int SDL_SCANCODE_AC_PROPERTIES() {
		return SDL_SCANCODE_AC_PROPERTIES;
	}

	private static final int SDL_SCANCODE_AC_SEARCH = (int) 280L;

	public static int SDL_SCANCODE_AC_SEARCH() {
		return SDL_SCANCODE_AC_SEARCH;
	}

	private static final int SDL_SCANCODE_AC_HOME = (int) 281L;

	public static int SDL_SCANCODE_AC_HOME() {
		return SDL_SCANCODE_AC_HOME;
	}

	private static final int SDL_SCANCODE_AC_BACK = (int) 282L;

	public static int SDL_SCANCODE_AC_BACK() {
		return SDL_SCANCODE_AC_BACK;
	}

	private static final int SDL_SCANCODE_AC_FORWARD = (int) 283L;

	public static int SDL_SCANCODE_AC_FORWARD() {
		return SDL_SCANCODE_AC_FORWARD;
	}

	private static final int SDL_SCANCODE_AC_STOP = (int) 284L;

	public static int SDL_SCANCODE_AC_STOP() {
		return SDL_SCANCODE_AC_STOP;
	}

	private static final int SDL_SCANCODE_AC_REFRESH = (int) 285L;

	public static int SDL_SCANCODE_AC_REFRESH() {
		return SDL_SCANCODE_AC_REFRESH;
	}

	private static final int SDL_SCANCODE_AC_BOOKMARKS = (int) 286L;

	public static int SDL_SCANCODE_AC_BOOKMARKS() {
		return SDL_SCANCODE_AC_BOOKMARKS;
	}

	private static final int SDL_SCANCODE_SOFTLEFT = (int) 287L;

	public static int SDL_SCANCODE_SOFTLEFT() {
		return SDL_SCANCODE_SOFTLEFT;
	}

	private static final int SDL_SCANCODE_SOFTRIGHT = (int) 288L;

	public static int SDL_SCANCODE_SOFTRIGHT() {
		return SDL_SCANCODE_SOFTRIGHT;
	}

	private static final int SDL_SCANCODE_CALL = (int) 289L;

	public static int SDL_SCANCODE_CALL() {
		return SDL_SCANCODE_CALL;
	}

	private static final int SDL_SCANCODE_ENDCALL = (int) 290L;

	public static int SDL_SCANCODE_ENDCALL() {
		return SDL_SCANCODE_ENDCALL;
	}

	private static final int SDL_SCANCODE_RESERVED = (int) 400L;

	public static int SDL_SCANCODE_RESERVED() {
		return SDL_SCANCODE_RESERVED;
	}

	private static final int SDL_SCANCODE_COUNT = (int) 512L;

	public static int SDL_SCANCODE_COUNT() {
		return SDL_SCANCODE_COUNT;
	}

	public static OfInt SDL_Keycode = SDL3.C_INT;

	public static OfShort SDL_Keymod = SDL3.C_SHORT;

	public static OfInt SDL_KeyboardID = SDL3.C_INT;

	private static class SDL_HasKeyboard {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_HasKeyboard");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_HasKeyboard$descriptor() {
		return SDL_HasKeyboard.DESC;
	}

	public static MethodHandle SDL_HasKeyboard$handle() {
		return SDL_HasKeyboard.HANDLE;
	}

	public static MemorySegment SDL_HasKeyboard$address() {
		return SDL_HasKeyboard.ADDR;
	}

	public static boolean SDL_HasKeyboard() {
		var mh$ = SDL_HasKeyboard.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_HasKeyboard");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetKeyboards {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetKeyboards");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetKeyboards$descriptor() {
		return SDL_GetKeyboards.DESC;
	}

	public static MethodHandle SDL_GetKeyboards$handle() {
		return SDL_GetKeyboards.HANDLE;
	}

	public static MemorySegment SDL_GetKeyboards$address() {
		return SDL_GetKeyboards.ADDR;
	}

	public static MemorySegment SDL_GetKeyboards(MemorySegment count) {
		var mh$ = SDL_GetKeyboards.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetKeyboards", count);
			}
			return (MemorySegment) mh$.invokeExact(count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetKeyboardNameForID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetKeyboardNameForID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetKeyboardNameForID$descriptor() {
		return SDL_GetKeyboardNameForID.DESC;
	}

	public static MethodHandle SDL_GetKeyboardNameForID$handle() {
		return SDL_GetKeyboardNameForID.HANDLE;
	}

	public static MemorySegment SDL_GetKeyboardNameForID$address() {
		return SDL_GetKeyboardNameForID.ADDR;
	}

	public static MemorySegment SDL_GetKeyboardNameForID(int instance_id) {
		var mh$ = SDL_GetKeyboardNameForID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetKeyboardNameForID", instance_id);
			}
			return (MemorySegment) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetKeyboardFocus {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetKeyboardFocus");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetKeyboardFocus$descriptor() {
		return SDL_GetKeyboardFocus.DESC;
	}

	public static MethodHandle SDL_GetKeyboardFocus$handle() {
		return SDL_GetKeyboardFocus.HANDLE;
	}

	public static MemorySegment SDL_GetKeyboardFocus$address() {
		return SDL_GetKeyboardFocus.ADDR;
	}

	public static MemorySegment SDL_GetKeyboardFocus() {
		var mh$ = SDL_GetKeyboardFocus.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetKeyboardFocus");
			}
			return (MemorySegment) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetKeyboardState {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetKeyboardState");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetKeyboardState$descriptor() {
		return SDL_GetKeyboardState.DESC;
	}

	public static MethodHandle SDL_GetKeyboardState$handle() {
		return SDL_GetKeyboardState.HANDLE;
	}

	public static MemorySegment SDL_GetKeyboardState$address() {
		return SDL_GetKeyboardState.ADDR;
	}

	public static MemorySegment SDL_GetKeyboardState(MemorySegment numkeys) {
		var mh$ = SDL_GetKeyboardState.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetKeyboardState", numkeys);
			}
			return (MemorySegment) mh$.invokeExact(numkeys);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ResetKeyboard {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid();

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ResetKeyboard");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ResetKeyboard$descriptor() {
		return SDL_ResetKeyboard.DESC;
	}

	public static MethodHandle SDL_ResetKeyboard$handle() {
		return SDL_ResetKeyboard.HANDLE;
	}

	public static MemorySegment SDL_ResetKeyboard$address() {
		return SDL_ResetKeyboard.ADDR;
	}

	public static void SDL_ResetKeyboard() {
		var mh$ = SDL_ResetKeyboard.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ResetKeyboard");
			}
			mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetModState {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_SHORT);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetModState");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetModState$descriptor() {
		return SDL_GetModState.DESC;
	}

	public static MethodHandle SDL_GetModState$handle() {
		return SDL_GetModState.HANDLE;
	}

	public static MemorySegment SDL_GetModState$address() {
		return SDL_GetModState.ADDR;
	}

	public static short SDL_GetModState() {
		var mh$ = SDL_GetModState.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetModState");
			}
			return (short) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetModState {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_SHORT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetModState");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetModState$descriptor() {
		return SDL_SetModState.DESC;
	}

	public static MethodHandle SDL_SetModState$handle() {
		return SDL_SetModState.HANDLE;
	}

	public static MemorySegment SDL_SetModState$address() {
		return SDL_SetModState.ADDR;
	}

	public static void SDL_SetModState(short modstate) {
		var mh$ = SDL_SetModState.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetModState", modstate);
			}
			mh$.invokeExact(modstate);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetKeyFromScancode {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_SHORT,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetKeyFromScancode");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetKeyFromScancode$descriptor() {
		return SDL_GetKeyFromScancode.DESC;
	}

	public static MethodHandle SDL_GetKeyFromScancode$handle() {
		return SDL_GetKeyFromScancode.HANDLE;
	}

	public static MemorySegment SDL_GetKeyFromScancode$address() {
		return SDL_GetKeyFromScancode.ADDR;
	}

	public static int SDL_GetKeyFromScancode(int scancode, short modstate, boolean key_event) {
		var mh$ = SDL_GetKeyFromScancode.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetKeyFromScancode", scancode, modstate, key_event);
			}
			return (int) mh$.invokeExact(scancode, modstate, key_event);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetScancodeFromKey {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetScancodeFromKey");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetScancodeFromKey$descriptor() {
		return SDL_GetScancodeFromKey.DESC;
	}

	public static MethodHandle SDL_GetScancodeFromKey$handle() {
		return SDL_GetScancodeFromKey.HANDLE;
	}

	public static MemorySegment SDL_GetScancodeFromKey$address() {
		return SDL_GetScancodeFromKey.ADDR;
	}

	public static int SDL_GetScancodeFromKey(int key, MemorySegment modstate) {
		var mh$ = SDL_GetScancodeFromKey.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetScancodeFromKey", key, modstate);
			}
			return (int) mh$.invokeExact(key, modstate);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetScancodeName {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetScancodeName");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetScancodeName$descriptor() {
		return SDL_SetScancodeName.DESC;
	}

	public static MethodHandle SDL_SetScancodeName$handle() {
		return SDL_SetScancodeName.HANDLE;
	}

	public static MemorySegment SDL_SetScancodeName$address() {
		return SDL_SetScancodeName.ADDR;
	}

	public static boolean SDL_SetScancodeName(int scancode, MemorySegment name) {
		var mh$ = SDL_SetScancodeName.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetScancodeName", scancode, name);
			}
			return (boolean) mh$.invokeExact(scancode, name);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetScancodeName {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetScancodeName");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetScancodeName$descriptor() {
		return SDL_GetScancodeName.DESC;
	}

	public static MethodHandle SDL_GetScancodeName$handle() {
		return SDL_GetScancodeName.HANDLE;
	}

	public static MemorySegment SDL_GetScancodeName$address() {
		return SDL_GetScancodeName.ADDR;
	}

	public static MemorySegment SDL_GetScancodeName(int scancode) {
		var mh$ = SDL_GetScancodeName.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetScancodeName", scancode);
			}
			return (MemorySegment) mh$.invokeExact(scancode);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetScancodeFromName {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetScancodeFromName");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetScancodeFromName$descriptor() {
		return SDL_GetScancodeFromName.DESC;
	}

	public static MethodHandle SDL_GetScancodeFromName$handle() {
		return SDL_GetScancodeFromName.HANDLE;
	}

	public static MemorySegment SDL_GetScancodeFromName$address() {
		return SDL_GetScancodeFromName.ADDR;
	}

	public static int SDL_GetScancodeFromName(MemorySegment name) {
		var mh$ = SDL_GetScancodeFromName.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetScancodeFromName", name);
			}
			return (int) mh$.invokeExact(name);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetKeyName {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetKeyName");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetKeyName$descriptor() {
		return SDL_GetKeyName.DESC;
	}

	public static MethodHandle SDL_GetKeyName$handle() {
		return SDL_GetKeyName.HANDLE;
	}

	public static MemorySegment SDL_GetKeyName$address() {
		return SDL_GetKeyName.ADDR;
	}

	public static MemorySegment SDL_GetKeyName(int key) {
		var mh$ = SDL_GetKeyName.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetKeyName", key);
			}
			return (MemorySegment) mh$.invokeExact(key);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetKeyFromName {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetKeyFromName");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetKeyFromName$descriptor() {
		return SDL_GetKeyFromName.DESC;
	}

	public static MethodHandle SDL_GetKeyFromName$handle() {
		return SDL_GetKeyFromName.HANDLE;
	}

	public static MemorySegment SDL_GetKeyFromName$address() {
		return SDL_GetKeyFromName.ADDR;
	}

	public static int SDL_GetKeyFromName(MemorySegment name) {
		var mh$ = SDL_GetKeyFromName.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetKeyFromName", name);
			}
			return (int) mh$.invokeExact(name);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_StartTextInput {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_StartTextInput");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_StartTextInput$descriptor() {
		return SDL_StartTextInput.DESC;
	}

	public static MethodHandle SDL_StartTextInput$handle() {
		return SDL_StartTextInput.HANDLE;
	}

	public static MemorySegment SDL_StartTextInput$address() {
		return SDL_StartTextInput.ADDR;
	}

	public static boolean SDL_StartTextInput(MemorySegment window) {
		var mh$ = SDL_StartTextInput.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_StartTextInput", window);
			}
			return (boolean) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static final int SDL_TEXTINPUT_TYPE_TEXT = (int) 0L;

	public static int SDL_TEXTINPUT_TYPE_TEXT() {
		return SDL_TEXTINPUT_TYPE_TEXT;
	}

	private static final int SDL_TEXTINPUT_TYPE_TEXT_NAME = (int) 1L;

	public static int SDL_TEXTINPUT_TYPE_TEXT_NAME() {
		return SDL_TEXTINPUT_TYPE_TEXT_NAME;
	}

	private static final int SDL_TEXTINPUT_TYPE_TEXT_EMAIL = (int) 2L;

	public static int SDL_TEXTINPUT_TYPE_TEXT_EMAIL() {
		return SDL_TEXTINPUT_TYPE_TEXT_EMAIL;
	}

	private static final int SDL_TEXTINPUT_TYPE_TEXT_USERNAME = (int) 3L;

	public static int SDL_TEXTINPUT_TYPE_TEXT_USERNAME() {
		return SDL_TEXTINPUT_TYPE_TEXT_USERNAME;
	}

	private static final int SDL_TEXTINPUT_TYPE_TEXT_PASSWORD_HIDDEN = (int) 4L;

	public static int SDL_TEXTINPUT_TYPE_TEXT_PASSWORD_HIDDEN() {
		return SDL_TEXTINPUT_TYPE_TEXT_PASSWORD_HIDDEN;
	}

	private static final int SDL_TEXTINPUT_TYPE_TEXT_PASSWORD_VISIBLE = (int) 5L;

	public static int SDL_TEXTINPUT_TYPE_TEXT_PASSWORD_VISIBLE() {
		return SDL_TEXTINPUT_TYPE_TEXT_PASSWORD_VISIBLE;
	}

	private static final int SDL_TEXTINPUT_TYPE_NUMBER = (int) 6L;

	public static int SDL_TEXTINPUT_TYPE_NUMBER() {
		return SDL_TEXTINPUT_TYPE_NUMBER;
	}

	private static final int SDL_TEXTINPUT_TYPE_NUMBER_PASSWORD_HIDDEN = (int) 7L;

	public static int SDL_TEXTINPUT_TYPE_NUMBER_PASSWORD_HIDDEN() {
		return SDL_TEXTINPUT_TYPE_NUMBER_PASSWORD_HIDDEN;
	}

	private static final int SDL_TEXTINPUT_TYPE_NUMBER_PASSWORD_VISIBLE = (int) 8L;

	public static int SDL_TEXTINPUT_TYPE_NUMBER_PASSWORD_VISIBLE() {
		return SDL_TEXTINPUT_TYPE_NUMBER_PASSWORD_VISIBLE;
	}

	private static final int SDL_CAPITALIZE_NONE = (int) 0L;

	public static int SDL_CAPITALIZE_NONE() {
		return SDL_CAPITALIZE_NONE;
	}

	private static final int SDL_CAPITALIZE_SENTENCES = (int) 1L;

	public static int SDL_CAPITALIZE_SENTENCES() {
		return SDL_CAPITALIZE_SENTENCES;
	}

	private static final int SDL_CAPITALIZE_WORDS = (int) 2L;

	public static int SDL_CAPITALIZE_WORDS() {
		return SDL_CAPITALIZE_WORDS;
	}

	private static final int SDL_CAPITALIZE_LETTERS = (int) 3L;

	public static int SDL_CAPITALIZE_LETTERS() {
		return SDL_CAPITALIZE_LETTERS;
	}

	private static class SDL_StartTextInputWithProperties {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_StartTextInputWithProperties");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_StartTextInputWithProperties$descriptor() {
		return SDL_StartTextInputWithProperties.DESC;
	}

	public static MethodHandle SDL_StartTextInputWithProperties$handle() {
		return SDL_StartTextInputWithProperties.HANDLE;
	}

	public static MemorySegment SDL_StartTextInputWithProperties$address() {
		return SDL_StartTextInputWithProperties.ADDR;
	}

	public static boolean SDL_StartTextInputWithProperties(MemorySegment window, int props) {
		var mh$ = SDL_StartTextInputWithProperties.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_StartTextInputWithProperties", window, props);
			}
			return (boolean) mh$.invokeExact(window, props);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_TextInputActive {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_TextInputActive");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_TextInputActive$descriptor() {
		return SDL_TextInputActive.DESC;
	}

	public static MethodHandle SDL_TextInputActive$handle() {
		return SDL_TextInputActive.HANDLE;
	}

	public static MemorySegment SDL_TextInputActive$address() {
		return SDL_TextInputActive.ADDR;
	}

	public static boolean SDL_TextInputActive(MemorySegment window) {
		var mh$ = SDL_TextInputActive.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_TextInputActive", window);
			}
			return (boolean) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_StopTextInput {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_StopTextInput");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_StopTextInput$descriptor() {
		return SDL_StopTextInput.DESC;
	}

	public static MethodHandle SDL_StopTextInput$handle() {
		return SDL_StopTextInput.HANDLE;
	}

	public static MemorySegment SDL_StopTextInput$address() {
		return SDL_StopTextInput.ADDR;
	}

	public static boolean SDL_StopTextInput(MemorySegment window) {
		var mh$ = SDL_StopTextInput.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_StopTextInput", window);
			}
			return (boolean) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ClearComposition {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ClearComposition");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ClearComposition$descriptor() {
		return SDL_ClearComposition.DESC;
	}

	public static MethodHandle SDL_ClearComposition$handle() {
		return SDL_ClearComposition.HANDLE;
	}

	public static MemorySegment SDL_ClearComposition$address() {
		return SDL_ClearComposition.ADDR;
	}

	public static boolean SDL_ClearComposition(MemorySegment window) {
		var mh$ = SDL_ClearComposition.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ClearComposition", window);
			}
			return (boolean) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetTextInputArea {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetTextInputArea");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetTextInputArea$descriptor() {
		return SDL_SetTextInputArea.DESC;
	}

	public static MethodHandle SDL_SetTextInputArea$handle() {
		return SDL_SetTextInputArea.HANDLE;
	}

	public static MemorySegment SDL_SetTextInputArea$address() {
		return SDL_SetTextInputArea.ADDR;
	}

	public static boolean SDL_SetTextInputArea(MemorySegment window, MemorySegment rect, int cursor) {
		var mh$ = SDL_SetTextInputArea.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetTextInputArea", window, rect, cursor);
			}
			return (boolean) mh$.invokeExact(window, rect, cursor);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetTextInputArea {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetTextInputArea");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetTextInputArea$descriptor() {
		return SDL_GetTextInputArea.DESC;
	}

	public static MethodHandle SDL_GetTextInputArea$handle() {
		return SDL_GetTextInputArea.HANDLE;
	}

	public static MemorySegment SDL_GetTextInputArea$address() {
		return SDL_GetTextInputArea.ADDR;
	}

	public static boolean SDL_GetTextInputArea(MemorySegment window, MemorySegment rect, MemorySegment cursor) {
		var mh$ = SDL_GetTextInputArea.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetTextInputArea", window, rect, cursor);
			}
			return (boolean) mh$.invokeExact(window, rect, cursor);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_HasScreenKeyboardSupport {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_HasScreenKeyboardSupport");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_HasScreenKeyboardSupport$descriptor() {
		return SDL_HasScreenKeyboardSupport.DESC;
	}

	public static MethodHandle SDL_HasScreenKeyboardSupport$handle() {
		return SDL_HasScreenKeyboardSupport.HANDLE;
	}

	public static MemorySegment SDL_HasScreenKeyboardSupport$address() {
		return SDL_HasScreenKeyboardSupport.ADDR;
	}

	public static boolean SDL_HasScreenKeyboardSupport() {
		var mh$ = SDL_HasScreenKeyboardSupport.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_HasScreenKeyboardSupport");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ScreenKeyboardShown {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ScreenKeyboardShown");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ScreenKeyboardShown$descriptor() {
		return SDL_ScreenKeyboardShown.DESC;
	}

	public static MethodHandle SDL_ScreenKeyboardShown$handle() {
		return SDL_ScreenKeyboardShown.HANDLE;
	}

	public static MemorySegment SDL_ScreenKeyboardShown$address() {
		return SDL_ScreenKeyboardShown.ADDR;
	}

	public static boolean SDL_ScreenKeyboardShown(MemorySegment window) {
		var mh$ = SDL_ScreenKeyboardShown.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ScreenKeyboardShown", window);
			}
			return (boolean) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	public static OfInt SDL_MouseID = SDL3.C_INT;
	private static final int SDL_SYSTEM_CURSOR_DEFAULT = (int) 0L;

	public static int SDL_SYSTEM_CURSOR_DEFAULT() {
		return SDL_SYSTEM_CURSOR_DEFAULT;
	}

	private static final int SDL_SYSTEM_CURSOR_TEXT = (int) 1L;

	public static int SDL_SYSTEM_CURSOR_TEXT() {
		return SDL_SYSTEM_CURSOR_TEXT;
	}

	private static final int SDL_SYSTEM_CURSOR_WAIT = (int) 2L;

	public static int SDL_SYSTEM_CURSOR_WAIT() {
		return SDL_SYSTEM_CURSOR_WAIT;
	}

	private static final int SDL_SYSTEM_CURSOR_CROSSHAIR = (int) 3L;

	public static int SDL_SYSTEM_CURSOR_CROSSHAIR() {
		return SDL_SYSTEM_CURSOR_CROSSHAIR;
	}

	private static final int SDL_SYSTEM_CURSOR_PROGRESS = (int) 4L;

	public static int SDL_SYSTEM_CURSOR_PROGRESS() {
		return SDL_SYSTEM_CURSOR_PROGRESS;
	}

	private static final int SDL_SYSTEM_CURSOR_NWSE_RESIZE = (int) 5L;

	public static int SDL_SYSTEM_CURSOR_NWSE_RESIZE() {
		return SDL_SYSTEM_CURSOR_NWSE_RESIZE;
	}

	private static final int SDL_SYSTEM_CURSOR_NESW_RESIZE = (int) 6L;

	public static int SDL_SYSTEM_CURSOR_NESW_RESIZE() {
		return SDL_SYSTEM_CURSOR_NESW_RESIZE;
	}

	private static final int SDL_SYSTEM_CURSOR_EW_RESIZE = (int) 7L;

	public static int SDL_SYSTEM_CURSOR_EW_RESIZE() {
		return SDL_SYSTEM_CURSOR_EW_RESIZE;
	}

	private static final int SDL_SYSTEM_CURSOR_NS_RESIZE = (int) 8L;

	public static int SDL_SYSTEM_CURSOR_NS_RESIZE() {
		return SDL_SYSTEM_CURSOR_NS_RESIZE;
	}

	private static final int SDL_SYSTEM_CURSOR_MOVE = (int) 9L;

	public static int SDL_SYSTEM_CURSOR_MOVE() {
		return SDL_SYSTEM_CURSOR_MOVE;
	}

	private static final int SDL_SYSTEM_CURSOR_NOT_ALLOWED = (int) 10L;

	public static int SDL_SYSTEM_CURSOR_NOT_ALLOWED() {
		return SDL_SYSTEM_CURSOR_NOT_ALLOWED;
	}

	private static final int SDL_SYSTEM_CURSOR_POINTER = (int) 11L;

	public static int SDL_SYSTEM_CURSOR_POINTER() {
		return SDL_SYSTEM_CURSOR_POINTER;
	}

	private static final int SDL_SYSTEM_CURSOR_NW_RESIZE = (int) 12L;

	public static int SDL_SYSTEM_CURSOR_NW_RESIZE() {
		return SDL_SYSTEM_CURSOR_NW_RESIZE;
	}

	private static final int SDL_SYSTEM_CURSOR_N_RESIZE = (int) 13L;

	public static int SDL_SYSTEM_CURSOR_N_RESIZE() {
		return SDL_SYSTEM_CURSOR_N_RESIZE;
	}

	private static final int SDL_SYSTEM_CURSOR_NE_RESIZE = (int) 14L;

	public static int SDL_SYSTEM_CURSOR_NE_RESIZE() {
		return SDL_SYSTEM_CURSOR_NE_RESIZE;
	}

	private static final int SDL_SYSTEM_CURSOR_E_RESIZE = (int) 15L;

	public static int SDL_SYSTEM_CURSOR_E_RESIZE() {
		return SDL_SYSTEM_CURSOR_E_RESIZE;
	}

	private static final int SDL_SYSTEM_CURSOR_SE_RESIZE = (int) 16L;

	public static int SDL_SYSTEM_CURSOR_SE_RESIZE() {
		return SDL_SYSTEM_CURSOR_SE_RESIZE;
	}

	private static final int SDL_SYSTEM_CURSOR_S_RESIZE = (int) 17L;

	public static int SDL_SYSTEM_CURSOR_S_RESIZE() {
		return SDL_SYSTEM_CURSOR_S_RESIZE;
	}

	private static final int SDL_SYSTEM_CURSOR_SW_RESIZE = (int) 18L;

	public static int SDL_SYSTEM_CURSOR_SW_RESIZE() {
		return SDL_SYSTEM_CURSOR_SW_RESIZE;
	}

	private static final int SDL_SYSTEM_CURSOR_W_RESIZE = (int) 19L;

	public static int SDL_SYSTEM_CURSOR_W_RESIZE() {
		return SDL_SYSTEM_CURSOR_W_RESIZE;
	}

	private static final int SDL_SYSTEM_CURSOR_COUNT = (int) 20L;

	public static int SDL_SYSTEM_CURSOR_COUNT() {
		return SDL_SYSTEM_CURSOR_COUNT;
	}

	private static final int SDL_MOUSEWHEEL_NORMAL = (int) 0L;

	public static int SDL_MOUSEWHEEL_NORMAL() {
		return SDL_MOUSEWHEEL_NORMAL;
	}

	private static final int SDL_MOUSEWHEEL_FLIPPED = (int) 1L;

	public static int SDL_MOUSEWHEEL_FLIPPED() {
		return SDL_MOUSEWHEEL_FLIPPED;
	}

	public static OfInt SDL_MouseButtonFlags = SDL3.C_INT;

	private static class SDL_HasMouse {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_HasMouse");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_HasMouse$descriptor() {
		return SDL_HasMouse.DESC;
	}

	public static MethodHandle SDL_HasMouse$handle() {
		return SDL_HasMouse.HANDLE;
	}

	public static MemorySegment SDL_HasMouse$address() {
		return SDL_HasMouse.ADDR;
	}

	public static boolean SDL_HasMouse() {
		var mh$ = SDL_HasMouse.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_HasMouse");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetMice {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetMice");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetMice$descriptor() {
		return SDL_GetMice.DESC;
	}

	public static MethodHandle SDL_GetMice$handle() {
		return SDL_GetMice.HANDLE;
	}

	public static MemorySegment SDL_GetMice$address() {
		return SDL_GetMice.ADDR;
	}

	public static MemorySegment SDL_GetMice(MemorySegment count) {
		var mh$ = SDL_GetMice.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetMice", count);
			}
			return (MemorySegment) mh$.invokeExact(count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetMouseNameForID {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetMouseNameForID");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetMouseNameForID$descriptor() {
		return SDL_GetMouseNameForID.DESC;
	}

	public static MethodHandle SDL_GetMouseNameForID$handle() {
		return SDL_GetMouseNameForID.HANDLE;
	}

	public static MemorySegment SDL_GetMouseNameForID$address() {
		return SDL_GetMouseNameForID.ADDR;
	}

	public static MemorySegment SDL_GetMouseNameForID(int instance_id) {
		var mh$ = SDL_GetMouseNameForID.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetMouseNameForID", instance_id);
			}
			return (MemorySegment) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetMouseFocus {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetMouseFocus");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetMouseFocus$descriptor() {
		return SDL_GetMouseFocus.DESC;
	}

	public static MethodHandle SDL_GetMouseFocus$handle() {
		return SDL_GetMouseFocus.HANDLE;
	}

	public static MemorySegment SDL_GetMouseFocus$address() {
		return SDL_GetMouseFocus.ADDR;
	}

	public static MemorySegment SDL_GetMouseFocus() {
		var mh$ = SDL_GetMouseFocus.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetMouseFocus");
			}
			return (MemorySegment) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetMouseState {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetMouseState");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetMouseState$descriptor() {
		return SDL_GetMouseState.DESC;
	}

	public static MethodHandle SDL_GetMouseState$handle() {
		return SDL_GetMouseState.HANDLE;
	}

	public static MemorySegment SDL_GetMouseState$address() {
		return SDL_GetMouseState.ADDR;
	}

	public static int SDL_GetMouseState(MemorySegment x, MemorySegment y) {
		var mh$ = SDL_GetMouseState.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetMouseState", x, y);
			}
			return (int) mh$.invokeExact(x, y);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetGlobalMouseState {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetGlobalMouseState");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetGlobalMouseState$descriptor() {
		return SDL_GetGlobalMouseState.DESC;
	}

	public static MethodHandle SDL_GetGlobalMouseState$handle() {
		return SDL_GetGlobalMouseState.HANDLE;
	}

	public static MemorySegment SDL_GetGlobalMouseState$address() {
		return SDL_GetGlobalMouseState.ADDR;
	}

	public static int SDL_GetGlobalMouseState(MemorySegment x, MemorySegment y) {
		var mh$ = SDL_GetGlobalMouseState.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetGlobalMouseState", x, y);
			}
			return (int) mh$.invokeExact(x, y);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetRelativeMouseState {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetRelativeMouseState");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetRelativeMouseState$descriptor() {
		return SDL_GetRelativeMouseState.DESC;
	}

	public static MethodHandle SDL_GetRelativeMouseState$handle() {
		return SDL_GetRelativeMouseState.HANDLE;
	}

	public static MemorySegment SDL_GetRelativeMouseState$address() {
		return SDL_GetRelativeMouseState.ADDR;
	}

	public static int SDL_GetRelativeMouseState(MemorySegment x, MemorySegment y) {
		var mh$ = SDL_GetRelativeMouseState.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetRelativeMouseState", x, y);
			}
			return (int) mh$.invokeExact(x, y);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WarpMouseInWindow {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WarpMouseInWindow");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WarpMouseInWindow$descriptor() {
		return SDL_WarpMouseInWindow.DESC;
	}

	public static MethodHandle SDL_WarpMouseInWindow$handle() {
		return SDL_WarpMouseInWindow.HANDLE;
	}

	public static MemorySegment SDL_WarpMouseInWindow$address() {
		return SDL_WarpMouseInWindow.ADDR;
	}

	public static void SDL_WarpMouseInWindow(MemorySegment window, float x, float y) {
		var mh$ = SDL_WarpMouseInWindow.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WarpMouseInWindow", window, x, y);
			}
			mh$.invokeExact(window, x, y);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WarpMouseGlobal {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_FLOAT,
				SDL3.C_FLOAT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WarpMouseGlobal");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WarpMouseGlobal$descriptor() {
		return SDL_WarpMouseGlobal.DESC;
	}

	public static MethodHandle SDL_WarpMouseGlobal$handle() {
		return SDL_WarpMouseGlobal.HANDLE;
	}

	public static MemorySegment SDL_WarpMouseGlobal$address() {
		return SDL_WarpMouseGlobal.ADDR;
	}

	public static boolean SDL_WarpMouseGlobal(float x, float y) {
		var mh$ = SDL_WarpMouseGlobal.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WarpMouseGlobal", x, y);
			}
			return (boolean) mh$.invokeExact(x, y);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetRelativeMouseTransform {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetRelativeMouseTransform");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetRelativeMouseTransform$descriptor() {
		return SDL_SetRelativeMouseTransform.DESC;
	}

	public static MethodHandle SDL_SetRelativeMouseTransform$handle() {
		return SDL_SetRelativeMouseTransform.HANDLE;
	}

	public static MemorySegment SDL_SetRelativeMouseTransform$address() {
		return SDL_SetRelativeMouseTransform.ADDR;
	}

	public static boolean SDL_SetRelativeMouseTransform(MemorySegment callback, MemorySegment userdata) {
		var mh$ = SDL_SetRelativeMouseTransform.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetRelativeMouseTransform", callback, userdata);
			}
			return (boolean) mh$.invokeExact(callback, userdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetWindowRelativeMouseMode {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetWindowRelativeMouseMode");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetWindowRelativeMouseMode$descriptor() {
		return SDL_SetWindowRelativeMouseMode.DESC;
	}

	public static MethodHandle SDL_SetWindowRelativeMouseMode$handle() {
		return SDL_SetWindowRelativeMouseMode.HANDLE;
	}

	public static MemorySegment SDL_SetWindowRelativeMouseMode$address() {
		return SDL_SetWindowRelativeMouseMode.ADDR;
	}

	public static boolean SDL_SetWindowRelativeMouseMode(MemorySegment window, boolean enabled) {
		var mh$ = SDL_SetWindowRelativeMouseMode.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetWindowRelativeMouseMode", window, enabled);
			}
			return (boolean) mh$.invokeExact(window, enabled);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetWindowRelativeMouseMode {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetWindowRelativeMouseMode");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetWindowRelativeMouseMode$descriptor() {
		return SDL_GetWindowRelativeMouseMode.DESC;
	}

	public static MethodHandle SDL_GetWindowRelativeMouseMode$handle() {
		return SDL_GetWindowRelativeMouseMode.HANDLE;
	}

	public static MemorySegment SDL_GetWindowRelativeMouseMode$address() {
		return SDL_GetWindowRelativeMouseMode.ADDR;
	}

	public static boolean SDL_GetWindowRelativeMouseMode(MemorySegment window) {
		var mh$ = SDL_GetWindowRelativeMouseMode.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetWindowRelativeMouseMode", window);
			}
			return (boolean) mh$.invokeExact(window);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CaptureMouse {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CaptureMouse");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CaptureMouse$descriptor() {
		return SDL_CaptureMouse.DESC;
	}

	public static MethodHandle SDL_CaptureMouse$handle() {
		return SDL_CaptureMouse.HANDLE;
	}

	public static MemorySegment SDL_CaptureMouse$address() {
		return SDL_CaptureMouse.ADDR;
	}

	public static boolean SDL_CaptureMouse(boolean enabled) {
		var mh$ = SDL_CaptureMouse.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CaptureMouse", enabled);
			}
			return (boolean) mh$.invokeExact(enabled);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateCursor {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateCursor");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateCursor$descriptor() {
		return SDL_CreateCursor.DESC;
	}

	public static MethodHandle SDL_CreateCursor$handle() {
		return SDL_CreateCursor.HANDLE;
	}

	public static MemorySegment SDL_CreateCursor$address() {
		return SDL_CreateCursor.ADDR;
	}

	public static MemorySegment SDL_CreateCursor(MemorySegment data, MemorySegment mask, int w, int h, int hot_x, int hot_y) {
		var mh$ = SDL_CreateCursor.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateCursor", data, mask, w, h, hot_x, hot_y);
			}
			return (MemorySegment) mh$.invokeExact(data, mask, w, h, hot_x, hot_y);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateColorCursor {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateColorCursor");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateColorCursor$descriptor() {
		return SDL_CreateColorCursor.DESC;
	}

	public static MethodHandle SDL_CreateColorCursor$handle() {
		return SDL_CreateColorCursor.HANDLE;
	}

	public static MemorySegment SDL_CreateColorCursor$address() {
		return SDL_CreateColorCursor.ADDR;
	}

	public static MemorySegment SDL_CreateColorCursor(MemorySegment surface, int hot_x, int hot_y) {
		var mh$ = SDL_CreateColorCursor.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateColorCursor", surface, hot_x, hot_y);
			}
			return (MemorySegment) mh$.invokeExact(surface, hot_x, hot_y);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateAnimatedCursor {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateAnimatedCursor");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateAnimatedCursor$descriptor() {
		return SDL_CreateAnimatedCursor.DESC;
	}

	public static MethodHandle SDL_CreateAnimatedCursor$handle() {
		return SDL_CreateAnimatedCursor.HANDLE;
	}

	public static MemorySegment SDL_CreateAnimatedCursor$address() {
		return SDL_CreateAnimatedCursor.ADDR;
	}

	public static MemorySegment SDL_CreateAnimatedCursor(MemorySegment frames, int frame_count, int hot_x, int hot_y) {
		var mh$ = SDL_CreateAnimatedCursor.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateAnimatedCursor", frames, frame_count, hot_x, hot_y);
			}
			return (MemorySegment) mh$.invokeExact(frames, frame_count, hot_x, hot_y);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CreateSystemCursor {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateSystemCursor");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateSystemCursor$descriptor() {
		return SDL_CreateSystemCursor.DESC;
	}

	public static MethodHandle SDL_CreateSystemCursor$handle() {
		return SDL_CreateSystemCursor.HANDLE;
	}

	public static MemorySegment SDL_CreateSystemCursor$address() {
		return SDL_CreateSystemCursor.ADDR;
	}

	public static MemorySegment SDL_CreateSystemCursor(int id) {
		var mh$ = SDL_CreateSystemCursor.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateSystemCursor", id);
			}
			return (MemorySegment) mh$.invokeExact(id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetCursor {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetCursor");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetCursor$descriptor() {
		return SDL_SetCursor.DESC;
	}

	public static MethodHandle SDL_SetCursor$handle() {
		return SDL_SetCursor.HANDLE;
	}

	public static MemorySegment SDL_SetCursor$address() {
		return SDL_SetCursor.ADDR;
	}

	public static boolean SDL_SetCursor(MemorySegment cursor) {
		var mh$ = SDL_SetCursor.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetCursor", cursor);
			}
			return (boolean) mh$.invokeExact(cursor);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetCursor {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetCursor");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetCursor$descriptor() {
		return SDL_GetCursor.DESC;
	}

	public static MethodHandle SDL_GetCursor$handle() {
		return SDL_GetCursor.HANDLE;
	}

	public static MemorySegment SDL_GetCursor$address() {
		return SDL_GetCursor.ADDR;
	}

	public static MemorySegment SDL_GetCursor() {
		var mh$ = SDL_GetCursor.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetCursor");
			}
			return (MemorySegment) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetDefaultCursor {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetDefaultCursor");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetDefaultCursor$descriptor() {
		return SDL_GetDefaultCursor.DESC;
	}

	public static MethodHandle SDL_GetDefaultCursor$handle() {
		return SDL_GetDefaultCursor.HANDLE;
	}

	public static MemorySegment SDL_GetDefaultCursor$address() {
		return SDL_GetDefaultCursor.ADDR;
	}

	public static MemorySegment SDL_GetDefaultCursor() {
		var mh$ = SDL_GetDefaultCursor.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetDefaultCursor");
			}
			return (MemorySegment) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_DestroyCursor {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_DestroyCursor");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_DestroyCursor$descriptor() {
		return SDL_DestroyCursor.DESC;
	}

	public static MethodHandle SDL_DestroyCursor$handle() {
		return SDL_DestroyCursor.HANDLE;
	}

	public static MemorySegment SDL_DestroyCursor$address() {
		return SDL_DestroyCursor.ADDR;
	}

	public static void SDL_DestroyCursor(MemorySegment cursor) {
		var mh$ = SDL_DestroyCursor.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_DestroyCursor", cursor);
			}
			mh$.invokeExact(cursor);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_ShowCursor {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_ShowCursor");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_ShowCursor$descriptor() {
		return SDL_ShowCursor.DESC;
	}

	public static MethodHandle SDL_ShowCursor$handle() {
		return SDL_ShowCursor.HANDLE;
	}

	public static MemorySegment SDL_ShowCursor$address() {
		return SDL_ShowCursor.ADDR;
	}

	public static boolean SDL_ShowCursor() {
		var mh$ = SDL_ShowCursor.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_ShowCursor");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_HideCursor {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_HideCursor");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_HideCursor$descriptor() {
		return SDL_HideCursor.DESC;
	}

	public static MethodHandle SDL_HideCursor$handle() {
		return SDL_HideCursor.HANDLE;
	}

	public static MemorySegment SDL_HideCursor$address() {
		return SDL_HideCursor.ADDR;
	}

	public static boolean SDL_HideCursor() {
		var mh$ = SDL_HideCursor.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_HideCursor");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CursorVisible {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CursorVisible");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CursorVisible$descriptor() {
		return SDL_CursorVisible.DESC;
	}

	public static MethodHandle SDL_CursorVisible$handle() {
		return SDL_CursorVisible.HANDLE;
	}

	public static MemorySegment SDL_CursorVisible$address() {
		return SDL_CursorVisible.ADDR;
	}

	public static boolean SDL_CursorVisible() {
		var mh$ = SDL_CursorVisible.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CursorVisible");
			}
			return (boolean) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	public static OfLong SDL_TouchID = SDL3.C_LONG;

	public static OfLong SDL_FingerID = SDL3.C_LONG;
	private static final int SDL_TOUCH_DEVICE_INVALID = (int) -1L;

	public static int SDL_TOUCH_DEVICE_INVALID() {
		return SDL_TOUCH_DEVICE_INVALID;
	}

	private static final int SDL_TOUCH_DEVICE_DIRECT = (int) 0L;

	public static int SDL_TOUCH_DEVICE_DIRECT() {
		return SDL_TOUCH_DEVICE_DIRECT;
	}

	private static final int SDL_TOUCH_DEVICE_INDIRECT_ABSOLUTE = (int) 1L;

	public static int SDL_TOUCH_DEVICE_INDIRECT_ABSOLUTE() {
		return SDL_TOUCH_DEVICE_INDIRECT_ABSOLUTE;
	}

	private static final int SDL_TOUCH_DEVICE_INDIRECT_RELATIVE = (int) 2L;

	public static int SDL_TOUCH_DEVICE_INDIRECT_RELATIVE() {
		return SDL_TOUCH_DEVICE_INDIRECT_RELATIVE;
	}

	private static class SDL_GetTouchDevices {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetTouchDevices");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetTouchDevices$descriptor() {
		return SDL_GetTouchDevices.DESC;
	}

	public static MethodHandle SDL_GetTouchDevices$handle() {
		return SDL_GetTouchDevices.HANDLE;
	}

	public static MemorySegment SDL_GetTouchDevices$address() {
		return SDL_GetTouchDevices.ADDR;
	}

	public static MemorySegment SDL_GetTouchDevices(MemorySegment count) {
		var mh$ = SDL_GetTouchDevices.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetTouchDevices", count);
			}
			return (MemorySegment) mh$.invokeExact(count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetTouchDeviceName {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetTouchDeviceName");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetTouchDeviceName$descriptor() {
		return SDL_GetTouchDeviceName.DESC;
	}

	public static MethodHandle SDL_GetTouchDeviceName$handle() {
		return SDL_GetTouchDeviceName.HANDLE;
	}

	public static MemorySegment SDL_GetTouchDeviceName$address() {
		return SDL_GetTouchDeviceName.ADDR;
	}

	public static MemorySegment SDL_GetTouchDeviceName(long touchID) {
		var mh$ = SDL_GetTouchDeviceName.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetTouchDeviceName", touchID);
			}
			return (MemorySegment) mh$.invokeExact(touchID);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetTouchDeviceType {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_LONG
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetTouchDeviceType");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetTouchDeviceType$descriptor() {
		return SDL_GetTouchDeviceType.DESC;
	}

	public static MethodHandle SDL_GetTouchDeviceType$handle() {
		return SDL_GetTouchDeviceType.HANDLE;
	}

	public static MemorySegment SDL_GetTouchDeviceType$address() {
		return SDL_GetTouchDeviceType.ADDR;
	}

	public static int SDL_GetTouchDeviceType(long touchID) {
		var mh$ = SDL_GetTouchDeviceType.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetTouchDeviceType", touchID);
			}
			return (int) mh$.invokeExact(touchID);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetTouchFingers {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_LONG,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetTouchFingers");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetTouchFingers$descriptor() {
		return SDL_GetTouchFingers.DESC;
	}

	public static MethodHandle SDL_GetTouchFingers$handle() {
		return SDL_GetTouchFingers.HANDLE;
	}

	public static MemorySegment SDL_GetTouchFingers$address() {
		return SDL_GetTouchFingers.ADDR;
	}

	public static MemorySegment SDL_GetTouchFingers(long touchID, MemorySegment count) {
		var mh$ = SDL_GetTouchFingers.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetTouchFingers", touchID, count);
			}
			return (MemorySegment) mh$.invokeExact(touchID, count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	public static OfInt SDL_PenID = SDL3.C_INT;

	public static OfInt SDL_PenInputFlags = SDL3.C_INT;
	private static final int SDL_PEN_AXIS_PRESSURE = (int) 0L;

	public static int SDL_PEN_AXIS_PRESSURE() {
		return SDL_PEN_AXIS_PRESSURE;
	}

	private static final int SDL_PEN_AXIS_XTILT = (int) 1L;

	public static int SDL_PEN_AXIS_XTILT() {
		return SDL_PEN_AXIS_XTILT;
	}

	private static final int SDL_PEN_AXIS_YTILT = (int) 2L;

	public static int SDL_PEN_AXIS_YTILT() {
		return SDL_PEN_AXIS_YTILT;
	}

	private static final int SDL_PEN_AXIS_DISTANCE = (int) 3L;

	public static int SDL_PEN_AXIS_DISTANCE() {
		return SDL_PEN_AXIS_DISTANCE;
	}

	private static final int SDL_PEN_AXIS_ROTATION = (int) 4L;

	public static int SDL_PEN_AXIS_ROTATION() {
		return SDL_PEN_AXIS_ROTATION;
	}

	private static final int SDL_PEN_AXIS_SLIDER = (int) 5L;

	public static int SDL_PEN_AXIS_SLIDER() {
		return SDL_PEN_AXIS_SLIDER;
	}

	private static final int SDL_PEN_AXIS_TANGENTIAL_PRESSURE = (int) 6L;

	public static int SDL_PEN_AXIS_TANGENTIAL_PRESSURE() {
		return SDL_PEN_AXIS_TANGENTIAL_PRESSURE;
	}

	private static final int SDL_PEN_AXIS_COUNT = (int) 7L;

	public static int SDL_PEN_AXIS_COUNT() {
		return SDL_PEN_AXIS_COUNT;
	}

	private static final int SDL_PEN_DEVICE_TYPE_INVALID = (int) -1L;

	public static int SDL_PEN_DEVICE_TYPE_INVALID() {
		return SDL_PEN_DEVICE_TYPE_INVALID;
	}

	private static final int SDL_PEN_DEVICE_TYPE_UNKNOWN = (int) 0L;

	public static int SDL_PEN_DEVICE_TYPE_UNKNOWN() {
		return SDL_PEN_DEVICE_TYPE_UNKNOWN;
	}

	private static final int SDL_PEN_DEVICE_TYPE_DIRECT = (int) 1L;

	public static int SDL_PEN_DEVICE_TYPE_DIRECT() {
		return SDL_PEN_DEVICE_TYPE_DIRECT;
	}

	private static final int SDL_PEN_DEVICE_TYPE_INDIRECT = (int) 2L;

	public static int SDL_PEN_DEVICE_TYPE_INDIRECT() {
		return SDL_PEN_DEVICE_TYPE_INDIRECT;
	}

	private static class SDL_GetPenDeviceType {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetPenDeviceType");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetPenDeviceType$descriptor() {
		return SDL_GetPenDeviceType.DESC;
	}

	public static MethodHandle SDL_GetPenDeviceType$handle() {
		return SDL_GetPenDeviceType.HANDLE;
	}

	public static MemorySegment SDL_GetPenDeviceType$address() {
		return SDL_GetPenDeviceType.ADDR;
	}

	public static int SDL_GetPenDeviceType(int instance_id) {
		var mh$ = SDL_GetPenDeviceType.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetPenDeviceType", instance_id);
			}
			return (int) mh$.invokeExact(instance_id);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static final int SDL_EVENT_FIRST = (int) 0L;

	public static int SDL_EVENT_FIRST() {
		return SDL_EVENT_FIRST;
	}

	private static final int SDL_EVENT_QUIT = (int) 256L;

	public static int SDL_EVENT_QUIT() {
		return SDL_EVENT_QUIT;
	}

	private static final int SDL_EVENT_TERMINATING = (int) 257L;

	public static int SDL_EVENT_TERMINATING() {
		return SDL_EVENT_TERMINATING;
	}

	private static final int SDL_EVENT_LOW_MEMORY = (int) 258L;

	public static int SDL_EVENT_LOW_MEMORY() {
		return SDL_EVENT_LOW_MEMORY;
	}

	private static final int SDL_EVENT_WILL_ENTER_BACKGROUND = (int) 259L;

	public static int SDL_EVENT_WILL_ENTER_BACKGROUND() {
		return SDL_EVENT_WILL_ENTER_BACKGROUND;
	}

	private static final int SDL_EVENT_DID_ENTER_BACKGROUND = (int) 260L;

	public static int SDL_EVENT_DID_ENTER_BACKGROUND() {
		return SDL_EVENT_DID_ENTER_BACKGROUND;
	}

	private static final int SDL_EVENT_WILL_ENTER_FOREGROUND = (int) 261L;

	public static int SDL_EVENT_WILL_ENTER_FOREGROUND() {
		return SDL_EVENT_WILL_ENTER_FOREGROUND;
	}

	private static final int SDL_EVENT_DID_ENTER_FOREGROUND = (int) 262L;

	public static int SDL_EVENT_DID_ENTER_FOREGROUND() {
		return SDL_EVENT_DID_ENTER_FOREGROUND;
	}

	private static final int SDL_EVENT_LOCALE_CHANGED = (int) 263L;

	public static int SDL_EVENT_LOCALE_CHANGED() {
		return SDL_EVENT_LOCALE_CHANGED;
	}

	private static final int SDL_EVENT_SYSTEM_THEME_CHANGED = (int) 264L;

	public static int SDL_EVENT_SYSTEM_THEME_CHANGED() {
		return SDL_EVENT_SYSTEM_THEME_CHANGED;
	}

	private static final int SDL_EVENT_DISPLAY_ORIENTATION = (int) 337L;

	public static int SDL_EVENT_DISPLAY_ORIENTATION() {
		return SDL_EVENT_DISPLAY_ORIENTATION;
	}

	private static final int SDL_EVENT_DISPLAY_ADDED = (int) 338L;

	public static int SDL_EVENT_DISPLAY_ADDED() {
		return SDL_EVENT_DISPLAY_ADDED;
	}

	private static final int SDL_EVENT_DISPLAY_REMOVED = (int) 339L;

	public static int SDL_EVENT_DISPLAY_REMOVED() {
		return SDL_EVENT_DISPLAY_REMOVED;
	}

	private static final int SDL_EVENT_DISPLAY_MOVED = (int) 340L;

	public static int SDL_EVENT_DISPLAY_MOVED() {
		return SDL_EVENT_DISPLAY_MOVED;
	}

	private static final int SDL_EVENT_DISPLAY_DESKTOP_MODE_CHANGED = (int) 341L;

	public static int SDL_EVENT_DISPLAY_DESKTOP_MODE_CHANGED() {
		return SDL_EVENT_DISPLAY_DESKTOP_MODE_CHANGED;
	}

	private static final int SDL_EVENT_DISPLAY_CURRENT_MODE_CHANGED = (int) 342L;

	public static int SDL_EVENT_DISPLAY_CURRENT_MODE_CHANGED() {
		return SDL_EVENT_DISPLAY_CURRENT_MODE_CHANGED;
	}

	private static final int SDL_EVENT_DISPLAY_CONTENT_SCALE_CHANGED = (int) 343L;

	public static int SDL_EVENT_DISPLAY_CONTENT_SCALE_CHANGED() {
		return SDL_EVENT_DISPLAY_CONTENT_SCALE_CHANGED;
	}

	private static final int SDL_EVENT_DISPLAY_USABLE_BOUNDS_CHANGED = (int) 344L;

	public static int SDL_EVENT_DISPLAY_USABLE_BOUNDS_CHANGED() {
		return SDL_EVENT_DISPLAY_USABLE_BOUNDS_CHANGED;
	}

	private static final int SDL_EVENT_DISPLAY_FIRST = (int) 337L;

	public static int SDL_EVENT_DISPLAY_FIRST() {
		return SDL_EVENT_DISPLAY_FIRST;
	}

	private static final int SDL_EVENT_DISPLAY_LAST = (int) 344L;

	public static int SDL_EVENT_DISPLAY_LAST() {
		return SDL_EVENT_DISPLAY_LAST;
	}

	private static final int SDL_EVENT_WINDOW_SHOWN = (int) 514L;

	public static int SDL_EVENT_WINDOW_SHOWN() {
		return SDL_EVENT_WINDOW_SHOWN;
	}

	private static final int SDL_EVENT_WINDOW_HIDDEN = (int) 515L;

	public static int SDL_EVENT_WINDOW_HIDDEN() {
		return SDL_EVENT_WINDOW_HIDDEN;
	}

	private static final int SDL_EVENT_WINDOW_EXPOSED = (int) 516L;

	public static int SDL_EVENT_WINDOW_EXPOSED() {
		return SDL_EVENT_WINDOW_EXPOSED;
	}

	private static final int SDL_EVENT_WINDOW_MOVED = (int) 517L;

	public static int SDL_EVENT_WINDOW_MOVED() {
		return SDL_EVENT_WINDOW_MOVED;
	}

	private static final int SDL_EVENT_WINDOW_RESIZED = (int) 518L;

	public static int SDL_EVENT_WINDOW_RESIZED() {
		return SDL_EVENT_WINDOW_RESIZED;
	}

	private static final int SDL_EVENT_WINDOW_PIXEL_SIZE_CHANGED = (int) 519L;

	public static int SDL_EVENT_WINDOW_PIXEL_SIZE_CHANGED() {
		return SDL_EVENT_WINDOW_PIXEL_SIZE_CHANGED;
	}

	private static final int SDL_EVENT_WINDOW_METAL_VIEW_RESIZED = (int) 520L;

	public static int SDL_EVENT_WINDOW_METAL_VIEW_RESIZED() {
		return SDL_EVENT_WINDOW_METAL_VIEW_RESIZED;
	}

	private static final int SDL_EVENT_WINDOW_MINIMIZED = (int) 521L;

	public static int SDL_EVENT_WINDOW_MINIMIZED() {
		return SDL_EVENT_WINDOW_MINIMIZED;
	}

	private static final int SDL_EVENT_WINDOW_MAXIMIZED = (int) 522L;

	public static int SDL_EVENT_WINDOW_MAXIMIZED() {
		return SDL_EVENT_WINDOW_MAXIMIZED;
	}

	private static final int SDL_EVENT_WINDOW_RESTORED = (int) 523L;

	public static int SDL_EVENT_WINDOW_RESTORED() {
		return SDL_EVENT_WINDOW_RESTORED;
	}

	private static final int SDL_EVENT_WINDOW_MOUSE_ENTER = (int) 524L;

	public static int SDL_EVENT_WINDOW_MOUSE_ENTER() {
		return SDL_EVENT_WINDOW_MOUSE_ENTER;
	}

	private static final int SDL_EVENT_WINDOW_MOUSE_LEAVE = (int) 525L;

	public static int SDL_EVENT_WINDOW_MOUSE_LEAVE() {
		return SDL_EVENT_WINDOW_MOUSE_LEAVE;
	}

	private static final int SDL_EVENT_WINDOW_FOCUS_GAINED = (int) 526L;

	public static int SDL_EVENT_WINDOW_FOCUS_GAINED() {
		return SDL_EVENT_WINDOW_FOCUS_GAINED;
	}

	private static final int SDL_EVENT_WINDOW_FOCUS_LOST = (int) 527L;

	public static int SDL_EVENT_WINDOW_FOCUS_LOST() {
		return SDL_EVENT_WINDOW_FOCUS_LOST;
	}

	private static final int SDL_EVENT_WINDOW_CLOSE_REQUESTED = (int) 528L;

	public static int SDL_EVENT_WINDOW_CLOSE_REQUESTED() {
		return SDL_EVENT_WINDOW_CLOSE_REQUESTED;
	}

	private static final int SDL_EVENT_WINDOW_HIT_TEST = (int) 529L;

	public static int SDL_EVENT_WINDOW_HIT_TEST() {
		return SDL_EVENT_WINDOW_HIT_TEST;
	}

	private static final int SDL_EVENT_WINDOW_ICCPROF_CHANGED = (int) 530L;

	public static int SDL_EVENT_WINDOW_ICCPROF_CHANGED() {
		return SDL_EVENT_WINDOW_ICCPROF_CHANGED;
	}

	private static final int SDL_EVENT_WINDOW_DISPLAY_CHANGED = (int) 531L;

	public static int SDL_EVENT_WINDOW_DISPLAY_CHANGED() {
		return SDL_EVENT_WINDOW_DISPLAY_CHANGED;
	}

	private static final int SDL_EVENT_WINDOW_DISPLAY_SCALE_CHANGED = (int) 532L;

	public static int SDL_EVENT_WINDOW_DISPLAY_SCALE_CHANGED() {
		return SDL_EVENT_WINDOW_DISPLAY_SCALE_CHANGED;
	}

	private static final int SDL_EVENT_WINDOW_SAFE_AREA_CHANGED = (int) 533L;

	public static int SDL_EVENT_WINDOW_SAFE_AREA_CHANGED() {
		return SDL_EVENT_WINDOW_SAFE_AREA_CHANGED;
	}

	private static final int SDL_EVENT_WINDOW_OCCLUDED = (int) 534L;

	public static int SDL_EVENT_WINDOW_OCCLUDED() {
		return SDL_EVENT_WINDOW_OCCLUDED;
	}

	private static final int SDL_EVENT_WINDOW_ENTER_FULLSCREEN = (int) 535L;

	public static int SDL_EVENT_WINDOW_ENTER_FULLSCREEN() {
		return SDL_EVENT_WINDOW_ENTER_FULLSCREEN;
	}

	private static final int SDL_EVENT_WINDOW_LEAVE_FULLSCREEN = (int) 536L;

	public static int SDL_EVENT_WINDOW_LEAVE_FULLSCREEN() {
		return SDL_EVENT_WINDOW_LEAVE_FULLSCREEN;
	}

	private static final int SDL_EVENT_WINDOW_DESTROYED = (int) 537L;

	public static int SDL_EVENT_WINDOW_DESTROYED() {
		return SDL_EVENT_WINDOW_DESTROYED;
	}

	private static final int SDL_EVENT_WINDOW_HDR_STATE_CHANGED = (int) 538L;

	public static int SDL_EVENT_WINDOW_HDR_STATE_CHANGED() {
		return SDL_EVENT_WINDOW_HDR_STATE_CHANGED;
	}

	private static final int SDL_EVENT_WINDOW_FIRST = (int) 514L;

	public static int SDL_EVENT_WINDOW_FIRST() {
		return SDL_EVENT_WINDOW_FIRST;
	}

	private static final int SDL_EVENT_WINDOW_LAST = (int) 538L;

	public static int SDL_EVENT_WINDOW_LAST() {
		return SDL_EVENT_WINDOW_LAST;
	}

	private static final int SDL_EVENT_KEY_DOWN = (int) 768L;

	public static int SDL_EVENT_KEY_DOWN() {
		return SDL_EVENT_KEY_DOWN;
	}

	private static final int SDL_EVENT_KEY_UP = (int) 769L;

	public static int SDL_EVENT_KEY_UP() {
		return SDL_EVENT_KEY_UP;
	}

	private static final int SDL_EVENT_TEXT_EDITING = (int) 770L;

	public static int SDL_EVENT_TEXT_EDITING() {
		return SDL_EVENT_TEXT_EDITING;
	}

	private static final int SDL_EVENT_TEXT_INPUT = (int) 771L;

	public static int SDL_EVENT_TEXT_INPUT() {
		return SDL_EVENT_TEXT_INPUT;
	}

	private static final int SDL_EVENT_KEYMAP_CHANGED = (int) 772L;

	public static int SDL_EVENT_KEYMAP_CHANGED() {
		return SDL_EVENT_KEYMAP_CHANGED;
	}

	private static final int SDL_EVENT_KEYBOARD_ADDED = (int) 773L;

	public static int SDL_EVENT_KEYBOARD_ADDED() {
		return SDL_EVENT_KEYBOARD_ADDED;
	}

	private static final int SDL_EVENT_KEYBOARD_REMOVED = (int) 774L;

	public static int SDL_EVENT_KEYBOARD_REMOVED() {
		return SDL_EVENT_KEYBOARD_REMOVED;
	}

	private static final int SDL_EVENT_TEXT_EDITING_CANDIDATES = (int) 775L;

	public static int SDL_EVENT_TEXT_EDITING_CANDIDATES() {
		return SDL_EVENT_TEXT_EDITING_CANDIDATES;
	}

	private static final int SDL_EVENT_SCREEN_KEYBOARD_SHOWN = (int) 776L;

	public static int SDL_EVENT_SCREEN_KEYBOARD_SHOWN() {
		return SDL_EVENT_SCREEN_KEYBOARD_SHOWN;
	}

	private static final int SDL_EVENT_SCREEN_KEYBOARD_HIDDEN = (int) 777L;

	public static int SDL_EVENT_SCREEN_KEYBOARD_HIDDEN() {
		return SDL_EVENT_SCREEN_KEYBOARD_HIDDEN;
	}

	private static final int SDL_EVENT_MOUSE_MOTION = (int) 1024L;

	public static int SDL_EVENT_MOUSE_MOTION() {
		return SDL_EVENT_MOUSE_MOTION;
	}

	private static final int SDL_EVENT_MOUSE_BUTTON_DOWN = (int) 1025L;

	public static int SDL_EVENT_MOUSE_BUTTON_DOWN() {
		return SDL_EVENT_MOUSE_BUTTON_DOWN;
	}

	private static final int SDL_EVENT_MOUSE_BUTTON_UP = (int) 1026L;

	public static int SDL_EVENT_MOUSE_BUTTON_UP() {
		return SDL_EVENT_MOUSE_BUTTON_UP;
	}

	private static final int SDL_EVENT_MOUSE_WHEEL = (int) 1027L;

	public static int SDL_EVENT_MOUSE_WHEEL() {
		return SDL_EVENT_MOUSE_WHEEL;
	}

	private static final int SDL_EVENT_MOUSE_ADDED = (int) 1028L;

	public static int SDL_EVENT_MOUSE_ADDED() {
		return SDL_EVENT_MOUSE_ADDED;
	}

	private static final int SDL_EVENT_MOUSE_REMOVED = (int) 1029L;

	public static int SDL_EVENT_MOUSE_REMOVED() {
		return SDL_EVENT_MOUSE_REMOVED;
	}

	private static final int SDL_EVENT_JOYSTICK_AXIS_MOTION = (int) 1536L;

	public static int SDL_EVENT_JOYSTICK_AXIS_MOTION() {
		return SDL_EVENT_JOYSTICK_AXIS_MOTION;
	}

	private static final int SDL_EVENT_JOYSTICK_BALL_MOTION = (int) 1537L;

	public static int SDL_EVENT_JOYSTICK_BALL_MOTION() {
		return SDL_EVENT_JOYSTICK_BALL_MOTION;
	}

	private static final int SDL_EVENT_JOYSTICK_HAT_MOTION = (int) 1538L;

	public static int SDL_EVENT_JOYSTICK_HAT_MOTION() {
		return SDL_EVENT_JOYSTICK_HAT_MOTION;
	}

	private static final int SDL_EVENT_JOYSTICK_BUTTON_DOWN = (int) 1539L;

	public static int SDL_EVENT_JOYSTICK_BUTTON_DOWN() {
		return SDL_EVENT_JOYSTICK_BUTTON_DOWN;
	}

	private static final int SDL_EVENT_JOYSTICK_BUTTON_UP = (int) 1540L;

	public static int SDL_EVENT_JOYSTICK_BUTTON_UP() {
		return SDL_EVENT_JOYSTICK_BUTTON_UP;
	}

	private static final int SDL_EVENT_JOYSTICK_ADDED = (int) 1541L;

	public static int SDL_EVENT_JOYSTICK_ADDED() {
		return SDL_EVENT_JOYSTICK_ADDED;
	}

	private static final int SDL_EVENT_JOYSTICK_REMOVED = (int) 1542L;

	public static int SDL_EVENT_JOYSTICK_REMOVED() {
		return SDL_EVENT_JOYSTICK_REMOVED;
	}

	private static final int SDL_EVENT_JOYSTICK_BATTERY_UPDATED = (int) 1543L;

	public static int SDL_EVENT_JOYSTICK_BATTERY_UPDATED() {
		return SDL_EVENT_JOYSTICK_BATTERY_UPDATED;
	}

	private static final int SDL_EVENT_JOYSTICK_UPDATE_COMPLETE = (int) 1544L;

	public static int SDL_EVENT_JOYSTICK_UPDATE_COMPLETE() {
		return SDL_EVENT_JOYSTICK_UPDATE_COMPLETE;
	}

	private static final int SDL_EVENT_GAMEPAD_AXIS_MOTION = (int) 1616L;

	public static int SDL_EVENT_GAMEPAD_AXIS_MOTION() {
		return SDL_EVENT_GAMEPAD_AXIS_MOTION;
	}

	private static final int SDL_EVENT_GAMEPAD_BUTTON_DOWN = (int) 1617L;

	public static int SDL_EVENT_GAMEPAD_BUTTON_DOWN() {
		return SDL_EVENT_GAMEPAD_BUTTON_DOWN;
	}

	private static final int SDL_EVENT_GAMEPAD_BUTTON_UP = (int) 1618L;

	public static int SDL_EVENT_GAMEPAD_BUTTON_UP() {
		return SDL_EVENT_GAMEPAD_BUTTON_UP;
	}

	private static final int SDL_EVENT_GAMEPAD_ADDED = (int) 1619L;

	public static int SDL_EVENT_GAMEPAD_ADDED() {
		return SDL_EVENT_GAMEPAD_ADDED;
	}

	private static final int SDL_EVENT_GAMEPAD_REMOVED = (int) 1620L;

	public static int SDL_EVENT_GAMEPAD_REMOVED() {
		return SDL_EVENT_GAMEPAD_REMOVED;
	}

	private static final int SDL_EVENT_GAMEPAD_REMAPPED = (int) 1621L;

	public static int SDL_EVENT_GAMEPAD_REMAPPED() {
		return SDL_EVENT_GAMEPAD_REMAPPED;
	}

	private static final int SDL_EVENT_GAMEPAD_TOUCHPAD_DOWN = (int) 1622L;

	public static int SDL_EVENT_GAMEPAD_TOUCHPAD_DOWN() {
		return SDL_EVENT_GAMEPAD_TOUCHPAD_DOWN;
	}

	private static final int SDL_EVENT_GAMEPAD_TOUCHPAD_MOTION = (int) 1623L;

	public static int SDL_EVENT_GAMEPAD_TOUCHPAD_MOTION() {
		return SDL_EVENT_GAMEPAD_TOUCHPAD_MOTION;
	}

	private static final int SDL_EVENT_GAMEPAD_TOUCHPAD_UP = (int) 1624L;

	public static int SDL_EVENT_GAMEPAD_TOUCHPAD_UP() {
		return SDL_EVENT_GAMEPAD_TOUCHPAD_UP;
	}

	private static final int SDL_EVENT_GAMEPAD_SENSOR_UPDATE = (int) 1625L;

	public static int SDL_EVENT_GAMEPAD_SENSOR_UPDATE() {
		return SDL_EVENT_GAMEPAD_SENSOR_UPDATE;
	}

	private static final int SDL_EVENT_GAMEPAD_UPDATE_COMPLETE = (int) 1626L;

	public static int SDL_EVENT_GAMEPAD_UPDATE_COMPLETE() {
		return SDL_EVENT_GAMEPAD_UPDATE_COMPLETE;
	}

	private static final int SDL_EVENT_GAMEPAD_STEAM_HANDLE_UPDATED = (int) 1627L;

	public static int SDL_EVENT_GAMEPAD_STEAM_HANDLE_UPDATED() {
		return SDL_EVENT_GAMEPAD_STEAM_HANDLE_UPDATED;
	}

	private static final int SDL_EVENT_FINGER_DOWN = (int) 1792L;

	public static int SDL_EVENT_FINGER_DOWN() {
		return SDL_EVENT_FINGER_DOWN;
	}

	private static final int SDL_EVENT_FINGER_UP = (int) 1793L;

	public static int SDL_EVENT_FINGER_UP() {
		return SDL_EVENT_FINGER_UP;
	}

	private static final int SDL_EVENT_FINGER_MOTION = (int) 1794L;

	public static int SDL_EVENT_FINGER_MOTION() {
		return SDL_EVENT_FINGER_MOTION;
	}

	private static final int SDL_EVENT_FINGER_CANCELED = (int) 1795L;

	public static int SDL_EVENT_FINGER_CANCELED() {
		return SDL_EVENT_FINGER_CANCELED;
	}

	private static final int SDL_EVENT_PINCH_BEGIN = (int) 1808L;

	public static int SDL_EVENT_PINCH_BEGIN() {
		return SDL_EVENT_PINCH_BEGIN;
	}

	private static final int SDL_EVENT_PINCH_UPDATE = (int) 1809L;

	public static int SDL_EVENT_PINCH_UPDATE() {
		return SDL_EVENT_PINCH_UPDATE;
	}

	private static final int SDL_EVENT_PINCH_END = (int) 1810L;

	public static int SDL_EVENT_PINCH_END() {
		return SDL_EVENT_PINCH_END;
	}

	private static final int SDL_EVENT_CLIPBOARD_UPDATE = (int) 2304L;

	public static int SDL_EVENT_CLIPBOARD_UPDATE() {
		return SDL_EVENT_CLIPBOARD_UPDATE;
	}

	private static final int SDL_EVENT_DROP_FILE = (int) 4096L;

	public static int SDL_EVENT_DROP_FILE() {
		return SDL_EVENT_DROP_FILE;
	}

	private static final int SDL_EVENT_DROP_TEXT = (int) 4097L;

	public static int SDL_EVENT_DROP_TEXT() {
		return SDL_EVENT_DROP_TEXT;
	}

	private static final int SDL_EVENT_DROP_BEGIN = (int) 4098L;

	public static int SDL_EVENT_DROP_BEGIN() {
		return SDL_EVENT_DROP_BEGIN;
	}

	private static final int SDL_EVENT_DROP_COMPLETE = (int) 4099L;

	public static int SDL_EVENT_DROP_COMPLETE() {
		return SDL_EVENT_DROP_COMPLETE;
	}

	private static final int SDL_EVENT_DROP_POSITION = (int) 4100L;

	public static int SDL_EVENT_DROP_POSITION() {
		return SDL_EVENT_DROP_POSITION;
	}

	private static final int SDL_EVENT_AUDIO_DEVICE_ADDED = (int) 4352L;

	public static int SDL_EVENT_AUDIO_DEVICE_ADDED() {
		return SDL_EVENT_AUDIO_DEVICE_ADDED;
	}

	private static final int SDL_EVENT_AUDIO_DEVICE_REMOVED = (int) 4353L;

	public static int SDL_EVENT_AUDIO_DEVICE_REMOVED() {
		return SDL_EVENT_AUDIO_DEVICE_REMOVED;
	}

	private static final int SDL_EVENT_AUDIO_DEVICE_FORMAT_CHANGED = (int) 4354L;

	public static int SDL_EVENT_AUDIO_DEVICE_FORMAT_CHANGED() {
		return SDL_EVENT_AUDIO_DEVICE_FORMAT_CHANGED;
	}

	private static final int SDL_EVENT_SENSOR_UPDATE = (int) 4608L;

	public static int SDL_EVENT_SENSOR_UPDATE() {
		return SDL_EVENT_SENSOR_UPDATE;
	}

	private static final int SDL_EVENT_PEN_PROXIMITY_IN = (int) 4864L;

	public static int SDL_EVENT_PEN_PROXIMITY_IN() {
		return SDL_EVENT_PEN_PROXIMITY_IN;
	}

	private static final int SDL_EVENT_PEN_PROXIMITY_OUT = (int) 4865L;

	public static int SDL_EVENT_PEN_PROXIMITY_OUT() {
		return SDL_EVENT_PEN_PROXIMITY_OUT;
	}

	private static final int SDL_EVENT_PEN_DOWN = (int) 4866L;

	public static int SDL_EVENT_PEN_DOWN() {
		return SDL_EVENT_PEN_DOWN;
	}

	private static final int SDL_EVENT_PEN_UP = (int) 4867L;

	public static int SDL_EVENT_PEN_UP() {
		return SDL_EVENT_PEN_UP;
	}

	private static final int SDL_EVENT_PEN_BUTTON_DOWN = (int) 4868L;

	public static int SDL_EVENT_PEN_BUTTON_DOWN() {
		return SDL_EVENT_PEN_BUTTON_DOWN;
	}

	private static final int SDL_EVENT_PEN_BUTTON_UP = (int) 4869L;

	public static int SDL_EVENT_PEN_BUTTON_UP() {
		return SDL_EVENT_PEN_BUTTON_UP;
	}

	private static final int SDL_EVENT_PEN_MOTION = (int) 4870L;

	public static int SDL_EVENT_PEN_MOTION() {
		return SDL_EVENT_PEN_MOTION;
	}

	private static final int SDL_EVENT_PEN_AXIS = (int) 4871L;

	public static int SDL_EVENT_PEN_AXIS() {
		return SDL_EVENT_PEN_AXIS;
	}

	private static final int SDL_EVENT_CAMERA_DEVICE_ADDED = (int) 5120L;

	public static int SDL_EVENT_CAMERA_DEVICE_ADDED() {
		return SDL_EVENT_CAMERA_DEVICE_ADDED;
	}

	private static final int SDL_EVENT_CAMERA_DEVICE_REMOVED = (int) 5121L;

	public static int SDL_EVENT_CAMERA_DEVICE_REMOVED() {
		return SDL_EVENT_CAMERA_DEVICE_REMOVED;
	}

	private static final int SDL_EVENT_CAMERA_DEVICE_APPROVED = (int) 5122L;

	public static int SDL_EVENT_CAMERA_DEVICE_APPROVED() {
		return SDL_EVENT_CAMERA_DEVICE_APPROVED;
	}

	private static final int SDL_EVENT_CAMERA_DEVICE_DENIED = (int) 5123L;

	public static int SDL_EVENT_CAMERA_DEVICE_DENIED() {
		return SDL_EVENT_CAMERA_DEVICE_DENIED;
	}

	private static final int SDL_EVENT_RENDER_TARGETS_RESET = (int) 8192L;

	public static int SDL_EVENT_RENDER_TARGETS_RESET() {
		return SDL_EVENT_RENDER_TARGETS_RESET;
	}

	private static final int SDL_EVENT_RENDER_DEVICE_RESET = (int) 8193L;

	public static int SDL_EVENT_RENDER_DEVICE_RESET() {
		return SDL_EVENT_RENDER_DEVICE_RESET;
	}

	private static final int SDL_EVENT_RENDER_DEVICE_LOST = (int) 8194L;

	public static int SDL_EVENT_RENDER_DEVICE_LOST() {
		return SDL_EVENT_RENDER_DEVICE_LOST;
	}

	private static final int SDL_EVENT_PRIVATE0 = (int) 16384L;

	public static int SDL_EVENT_PRIVATE0() {
		return SDL_EVENT_PRIVATE0;
	}

	private static final int SDL_EVENT_PRIVATE1 = (int) 16385L;

	public static int SDL_EVENT_PRIVATE1() {
		return SDL_EVENT_PRIVATE1;
	}

	private static final int SDL_EVENT_PRIVATE2 = (int) 16386L;

	public static int SDL_EVENT_PRIVATE2() {
		return SDL_EVENT_PRIVATE2;
	}

	private static final int SDL_EVENT_PRIVATE3 = (int) 16387L;

	public static int SDL_EVENT_PRIVATE3() {
		return SDL_EVENT_PRIVATE3;
	}

	private static final int SDL_EVENT_POLL_SENTINEL = (int) 32512L;

	public static int SDL_EVENT_POLL_SENTINEL() {
		return SDL_EVENT_POLL_SENTINEL;
	}

	private static final int SDL_EVENT_USER = (int) 32768L;

	public static int SDL_EVENT_USER() {
		return SDL_EVENT_USER;
	}

	private static final int SDL_EVENT_LAST = (int) 65535L;

	public static int SDL_EVENT_LAST() {
		return SDL_EVENT_LAST;
	}

	private static final int SDL_EVENT_ENUM_PADDING = (int) 2147483647L;

	public static int SDL_EVENT_ENUM_PADDING() {
		return SDL_EVENT_ENUM_PADDING;
	}

	private static class SDL_PumpEvents {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid();

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_PumpEvents");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_PumpEvents$descriptor() {
		return SDL_PumpEvents.DESC;
	}

	public static MethodHandle SDL_PumpEvents$handle() {
		return SDL_PumpEvents.HANDLE;
	}

	public static MemorySegment SDL_PumpEvents$address() {
		return SDL_PumpEvents.ADDR;
	}

	public static void SDL_PumpEvents() {
		var mh$ = SDL_PumpEvents.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_PumpEvents");
			}
			mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static final int SDL_ADDEVENT = (int) 0L;

	public static int SDL_ADDEVENT() {
		return SDL_ADDEVENT;
	}

	private static final int SDL_PEEKEVENT = (int) 1L;

	public static int SDL_PEEKEVENT() {
		return SDL_PEEKEVENT;
	}

	private static final int SDL_GETEVENT = (int) 2L;

	public static int SDL_GETEVENT() {
		return SDL_GETEVENT;
	}

	private static class SDL_PeepEvents {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_PeepEvents");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_PeepEvents$descriptor() {
		return SDL_PeepEvents.DESC;
	}

	public static MethodHandle SDL_PeepEvents$handle() {
		return SDL_PeepEvents.HANDLE;
	}

	public static MemorySegment SDL_PeepEvents$address() {
		return SDL_PeepEvents.ADDR;
	}

	public static int SDL_PeepEvents(MemorySegment events, int numevents, int action, int minType, int maxType) {
		var mh$ = SDL_PeepEvents.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_PeepEvents", events, numevents, action, minType, maxType);
			}
			return (int) mh$.invokeExact(events, numevents, action, minType, maxType);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_HasEvent {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_HasEvent");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_HasEvent$descriptor() {
		return SDL_HasEvent.DESC;
	}

	public static MethodHandle SDL_HasEvent$handle() {
		return SDL_HasEvent.HANDLE;
	}

	public static MemorySegment SDL_HasEvent$address() {
		return SDL_HasEvent.ADDR;
	}

	public static boolean SDL_HasEvent(int type) {
		var mh$ = SDL_HasEvent.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_HasEvent", type);
			}
			return (boolean) mh$.invokeExact(type);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_HasEvents {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_HasEvents");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_HasEvents$descriptor() {
		return SDL_HasEvents.DESC;
	}

	public static MethodHandle SDL_HasEvents$handle() {
		return SDL_HasEvents.HANDLE;
	}

	public static MemorySegment SDL_HasEvents$address() {
		return SDL_HasEvents.ADDR;
	}

	public static boolean SDL_HasEvents(int minType, int maxType) {
		var mh$ = SDL_HasEvents.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_HasEvents", minType, maxType);
			}
			return (boolean) mh$.invokeExact(minType, maxType);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_FlushEvent {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_FlushEvent");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_FlushEvent$descriptor() {
		return SDL_FlushEvent.DESC;
	}

	public static MethodHandle SDL_FlushEvent$handle() {
		return SDL_FlushEvent.HANDLE;
	}

	public static MemorySegment SDL_FlushEvent$address() {
		return SDL_FlushEvent.ADDR;
	}

	public static void SDL_FlushEvent(int type) {
		var mh$ = SDL_FlushEvent.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_FlushEvent", type);
			}
			mh$.invokeExact(type);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_FlushEvents {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_FlushEvents");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_FlushEvents$descriptor() {
		return SDL_FlushEvents.DESC;
	}

	public static MethodHandle SDL_FlushEvents$handle() {
		return SDL_FlushEvents.HANDLE;
	}

	public static MemorySegment SDL_FlushEvents$address() {
		return SDL_FlushEvents.ADDR;
	}

	public static void SDL_FlushEvents(int minType, int maxType) {
		var mh$ = SDL_FlushEvents.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_FlushEvents", minType, maxType);
			}
			mh$.invokeExact(minType, maxType);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_PollEvent {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_PollEvent");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_PollEvent$descriptor() {
		return SDL_PollEvent.DESC;
	}

	public static MethodHandle SDL_PollEvent$handle() {
		return SDL_PollEvent.HANDLE;
	}

	public static MemorySegment SDL_PollEvent$address() {
		return SDL_PollEvent.ADDR;
	}

	public static boolean SDL_PollEvent(MemorySegment event) {
		var mh$ = SDL_PollEvent.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_PollEvent", event);
			}
			return (boolean) mh$.invokeExact(event);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WaitEvent {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WaitEvent");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WaitEvent$descriptor() {
		return SDL_WaitEvent.DESC;
	}

	public static MethodHandle SDL_WaitEvent$handle() {
		return SDL_WaitEvent.HANDLE;
	}

	public static MemorySegment SDL_WaitEvent$address() {
		return SDL_WaitEvent.ADDR;
	}

	public static boolean SDL_WaitEvent(MemorySegment event) {
		var mh$ = SDL_WaitEvent.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WaitEvent", event);
			}
			return (boolean) mh$.invokeExact(event);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_WaitEventTimeout {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_WaitEventTimeout");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_WaitEventTimeout$descriptor() {
		return SDL_WaitEventTimeout.DESC;
	}

	public static MethodHandle SDL_WaitEventTimeout$handle() {
		return SDL_WaitEventTimeout.HANDLE;
	}

	public static MemorySegment SDL_WaitEventTimeout$address() {
		return SDL_WaitEventTimeout.ADDR;
	}

	public static boolean SDL_WaitEventTimeout(MemorySegment event, int timeoutMS) {
		var mh$ = SDL_WaitEventTimeout.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_WaitEventTimeout", event, timeoutMS);
			}
			return (boolean) mh$.invokeExact(event, timeoutMS);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_PushEvent {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_PushEvent");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_PushEvent$descriptor() {
		return SDL_PushEvent.DESC;
	}

	public static MethodHandle SDL_PushEvent$handle() {
		return SDL_PushEvent.HANDLE;
	}

	public static MemorySegment SDL_PushEvent$address() {
		return SDL_PushEvent.ADDR;
	}

	public static boolean SDL_PushEvent(MemorySegment event) {
		var mh$ = SDL_PushEvent.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_PushEvent", event);
			}
			return (boolean) mh$.invokeExact(event);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetEventFilter {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetEventFilter");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetEventFilter$descriptor() {
		return SDL_SetEventFilter.DESC;
	}

	public static MethodHandle SDL_SetEventFilter$handle() {
		return SDL_SetEventFilter.HANDLE;
	}

	public static MemorySegment SDL_SetEventFilter$address() {
		return SDL_SetEventFilter.ADDR;
	}

	public static void SDL_SetEventFilter(MemorySegment filter, MemorySegment userdata) {
		var mh$ = SDL_SetEventFilter.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetEventFilter", filter, userdata);
			}
			mh$.invokeExact(filter, userdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetEventFilter {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetEventFilter");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetEventFilter$descriptor() {
		return SDL_GetEventFilter.DESC;
	}

	public static MethodHandle SDL_GetEventFilter$handle() {
		return SDL_GetEventFilter.HANDLE;
	}

	public static MemorySegment SDL_GetEventFilter$address() {
		return SDL_GetEventFilter.ADDR;
	}

	public static boolean SDL_GetEventFilter(MemorySegment filter, MemorySegment userdata) {
		var mh$ = SDL_GetEventFilter.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetEventFilter", filter, userdata);
			}
			return (boolean) mh$.invokeExact(filter, userdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_AddEventWatch {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_AddEventWatch");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_AddEventWatch$descriptor() {
		return SDL_AddEventWatch.DESC;
	}

	public static MethodHandle SDL_AddEventWatch$handle() {
		return SDL_AddEventWatch.HANDLE;
	}

	public static MemorySegment SDL_AddEventWatch$address() {
		return SDL_AddEventWatch.ADDR;
	}

	public static boolean SDL_AddEventWatch(MemorySegment filter, MemorySegment userdata) {
		var mh$ = SDL_AddEventWatch.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_AddEventWatch", filter, userdata);
			}
			return (boolean) mh$.invokeExact(filter, userdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RemoveEventWatch {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RemoveEventWatch");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RemoveEventWatch$descriptor() {
		return SDL_RemoveEventWatch.DESC;
	}

	public static MethodHandle SDL_RemoveEventWatch$handle() {
		return SDL_RemoveEventWatch.HANDLE;
	}

	public static MemorySegment SDL_RemoveEventWatch$address() {
		return SDL_RemoveEventWatch.ADDR;
	}

	public static void SDL_RemoveEventWatch(MemorySegment filter, MemorySegment userdata) {
		var mh$ = SDL_RemoveEventWatch.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RemoveEventWatch", filter, userdata);
			}
			mh$.invokeExact(filter, userdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_FilterEvents {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_FilterEvents");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_FilterEvents$descriptor() {
		return SDL_FilterEvents.DESC;
	}

	public static MethodHandle SDL_FilterEvents$handle() {
		return SDL_FilterEvents.HANDLE;
	}

	public static MemorySegment SDL_FilterEvents$address() {
		return SDL_FilterEvents.ADDR;
	}

	public static void SDL_FilterEvents(MemorySegment filter, MemorySegment userdata) {
		var mh$ = SDL_FilterEvents.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_FilterEvents", filter, userdata);
			}
			mh$.invokeExact(filter, userdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_SetEventEnabled {
		public static FunctionDescriptor DESC = FunctionDescriptor.ofVoid(
				SDL3.C_INT,
				SDL3.C_BOOL
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_SetEventEnabled");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_SetEventEnabled$descriptor() {
		return SDL_SetEventEnabled.DESC;
	}

	public static MethodHandle SDL_SetEventEnabled$handle() {
		return SDL_SetEventEnabled.HANDLE;
	}

	public static MemorySegment SDL_SetEventEnabled$address() {
		return SDL_SetEventEnabled.ADDR;
	}

	public static void SDL_SetEventEnabled(int type, boolean enabled) {
		var mh$ = SDL_SetEventEnabled.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_SetEventEnabled", type, enabled);
			}
			mh$.invokeExact(type, enabled);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_EventEnabled {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_EventEnabled");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_EventEnabled$descriptor() {
		return SDL_EventEnabled.DESC;
	}

	public static MethodHandle SDL_EventEnabled$handle() {
		return SDL_EventEnabled.HANDLE;
	}

	public static MemorySegment SDL_EventEnabled$address() {
		return SDL_EventEnabled.ADDR;
	}

	public static boolean SDL_EventEnabled(int type) {
		var mh$ = SDL_EventEnabled.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_EventEnabled", type);
			}
			return (boolean) mh$.invokeExact(type);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RegisterEvents {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RegisterEvents");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RegisterEvents$descriptor() {
		return SDL_RegisterEvents.DESC;
	}

	public static MethodHandle SDL_RegisterEvents$handle() {
		return SDL_RegisterEvents.HANDLE;
	}

	public static MemorySegment SDL_RegisterEvents$address() {
		return SDL_RegisterEvents.ADDR;
	}

	public static int SDL_RegisterEvents(int numevents) {
		var mh$ = SDL_RegisterEvents.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RegisterEvents", numevents);
			}
			return (int) mh$.invokeExact(numevents);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetWindowFromEvent {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetWindowFromEvent");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetWindowFromEvent$descriptor() {
		return SDL_GetWindowFromEvent.DESC;
	}

	public static MethodHandle SDL_GetWindowFromEvent$handle() {
		return SDL_GetWindowFromEvent.HANDLE;
	}

	public static MemorySegment SDL_GetWindowFromEvent$address() {
		return SDL_GetWindowFromEvent.ADDR;
	}

	public static MemorySegment SDL_GetWindowFromEvent(MemorySegment event) {
		var mh$ = SDL_GetWindowFromEvent.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetWindowFromEvent", event);
			}
			return (MemorySegment) mh$.invokeExact(event);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetEventDescription {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_INT,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetEventDescription");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetEventDescription$descriptor() {
		return SDL_GetEventDescription.DESC;
	}

	public static MethodHandle SDL_GetEventDescription$handle() {
		return SDL_GetEventDescription.HANDLE;
	}

	public static MemorySegment SDL_GetEventDescription$address() {
		return SDL_GetEventDescription.ADDR;
	}

	public static int SDL_GetEventDescription(MemorySegment event, MemorySegment buf, int buflen) {
		var mh$ = SDL_GetEventDescription.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetEventDescription", event, buf, buflen);
			}
			return (int) mh$.invokeExact(event, buf, buflen);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetBasePath {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetBasePath");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetBasePath$descriptor() {
		return SDL_GetBasePath.DESC;
	}

	public static MethodHandle SDL_GetBasePath$handle() {
		return SDL_GetBasePath.HANDLE;
	}

	public static MemorySegment SDL_GetBasePath$address() {
		return SDL_GetBasePath.ADDR;
	}

	public static MemorySegment SDL_GetBasePath() {
		var mh$ = SDL_GetBasePath.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetBasePath");
			}
			return (MemorySegment) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetPrefPath {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetPrefPath");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetPrefPath$descriptor() {
		return SDL_GetPrefPath.DESC;
	}

	public static MethodHandle SDL_GetPrefPath$handle() {
		return SDL_GetPrefPath.HANDLE;
	}

	public static MemorySegment SDL_GetPrefPath$address() {
		return SDL_GetPrefPath.ADDR;
	}

	public static MemorySegment SDL_GetPrefPath(MemorySegment org, MemorySegment app) {
		var mh$ = SDL_GetPrefPath.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetPrefPath", org, app);
			}
			return (MemorySegment) mh$.invokeExact(org, app);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static final int SDL_FOLDER_HOME = (int) 0L;

	public static int SDL_FOLDER_HOME() {
		return SDL_FOLDER_HOME;
	}

	private static final int SDL_FOLDER_DESKTOP = (int) 1L;

	public static int SDL_FOLDER_DESKTOP() {
		return SDL_FOLDER_DESKTOP;
	}

	private static final int SDL_FOLDER_DOCUMENTS = (int) 2L;

	public static int SDL_FOLDER_DOCUMENTS() {
		return SDL_FOLDER_DOCUMENTS;
	}

	private static final int SDL_FOLDER_DOWNLOADS = (int) 3L;

	public static int SDL_FOLDER_DOWNLOADS() {
		return SDL_FOLDER_DOWNLOADS;
	}

	private static final int SDL_FOLDER_MUSIC = (int) 4L;

	public static int SDL_FOLDER_MUSIC() {
		return SDL_FOLDER_MUSIC;
	}

	private static final int SDL_FOLDER_PICTURES = (int) 5L;

	public static int SDL_FOLDER_PICTURES() {
		return SDL_FOLDER_PICTURES;
	}

	private static final int SDL_FOLDER_PUBLICSHARE = (int) 6L;

	public static int SDL_FOLDER_PUBLICSHARE() {
		return SDL_FOLDER_PUBLICSHARE;
	}

	private static final int SDL_FOLDER_SAVEDGAMES = (int) 7L;

	public static int SDL_FOLDER_SAVEDGAMES() {
		return SDL_FOLDER_SAVEDGAMES;
	}

	private static final int SDL_FOLDER_SCREENSHOTS = (int) 8L;

	public static int SDL_FOLDER_SCREENSHOTS() {
		return SDL_FOLDER_SCREENSHOTS;
	}

	private static final int SDL_FOLDER_TEMPLATES = (int) 9L;

	public static int SDL_FOLDER_TEMPLATES() {
		return SDL_FOLDER_TEMPLATES;
	}

	private static final int SDL_FOLDER_VIDEOS = (int) 10L;

	public static int SDL_FOLDER_VIDEOS() {
		return SDL_FOLDER_VIDEOS;
	}

	private static final int SDL_FOLDER_COUNT = (int) 11L;

	public static int SDL_FOLDER_COUNT() {
		return SDL_FOLDER_COUNT;
	}

	private static class SDL_GetUserFolder {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetUserFolder");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetUserFolder$descriptor() {
		return SDL_GetUserFolder.DESC;
	}

	public static MethodHandle SDL_GetUserFolder$handle() {
		return SDL_GetUserFolder.HANDLE;
	}

	public static MemorySegment SDL_GetUserFolder$address() {
		return SDL_GetUserFolder.ADDR;
	}

	public static MemorySegment SDL_GetUserFolder(int folder) {
		var mh$ = SDL_GetUserFolder.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetUserFolder", folder);
			}
			return (MemorySegment) mh$.invokeExact(folder);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static final int SDL_PATHTYPE_NONE = (int) 0L;

	public static int SDL_PATHTYPE_NONE() {
		return SDL_PATHTYPE_NONE;
	}

	private static final int SDL_PATHTYPE_FILE = (int) 1L;

	public static int SDL_PATHTYPE_FILE() {
		return SDL_PATHTYPE_FILE;
	}

	private static final int SDL_PATHTYPE_DIRECTORY = (int) 2L;

	public static int SDL_PATHTYPE_DIRECTORY() {
		return SDL_PATHTYPE_DIRECTORY;
	}

	private static final int SDL_PATHTYPE_OTHER = (int) 3L;

	public static int SDL_PATHTYPE_OTHER() {
		return SDL_PATHTYPE_OTHER;
	}

	public static OfInt SDL_GlobFlags = SDL3.C_INT;

	private static class SDL_CreateDirectory {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CreateDirectory");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CreateDirectory$descriptor() {
		return SDL_CreateDirectory.DESC;
	}

	public static MethodHandle SDL_CreateDirectory$handle() {
		return SDL_CreateDirectory.HANDLE;
	}

	public static MemorySegment SDL_CreateDirectory$address() {
		return SDL_CreateDirectory.ADDR;
	}

	public static boolean SDL_CreateDirectory(MemorySegment path) {
		var mh$ = SDL_CreateDirectory.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CreateDirectory", path);
			}
			return (boolean) mh$.invokeExact(path);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static final int SDL_ENUM_CONTINUE = (int) 0L;

	public static int SDL_ENUM_CONTINUE() {
		return SDL_ENUM_CONTINUE;
	}

	private static final int SDL_ENUM_SUCCESS = (int) 1L;

	public static int SDL_ENUM_SUCCESS() {
		return SDL_ENUM_SUCCESS;
	}

	private static final int SDL_ENUM_FAILURE = (int) 2L;

	public static int SDL_ENUM_FAILURE() {
		return SDL_ENUM_FAILURE;
	}

	private static class SDL_EnumerateDirectory {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_EnumerateDirectory");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_EnumerateDirectory$descriptor() {
		return SDL_EnumerateDirectory.DESC;
	}

	public static MethodHandle SDL_EnumerateDirectory$handle() {
		return SDL_EnumerateDirectory.HANDLE;
	}

	public static MemorySegment SDL_EnumerateDirectory$address() {
		return SDL_EnumerateDirectory.ADDR;
	}

	public static boolean SDL_EnumerateDirectory(MemorySegment path, MemorySegment callback, MemorySegment userdata) {
		var mh$ = SDL_EnumerateDirectory.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_EnumerateDirectory", path, callback, userdata);
			}
			return (boolean) mh$.invokeExact(path, callback, userdata);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RemovePath {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RemovePath");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RemovePath$descriptor() {
		return SDL_RemovePath.DESC;
	}

	public static MethodHandle SDL_RemovePath$handle() {
		return SDL_RemovePath.HANDLE;
	}

	public static MemorySegment SDL_RemovePath$address() {
		return SDL_RemovePath.ADDR;
	}

	public static boolean SDL_RemovePath(MemorySegment path) {
		var mh$ = SDL_RemovePath.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RemovePath", path);
			}
			return (boolean) mh$.invokeExact(path);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_RenamePath {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_RenamePath");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_RenamePath$descriptor() {
		return SDL_RenamePath.DESC;
	}

	public static MethodHandle SDL_RenamePath$handle() {
		return SDL_RenamePath.HANDLE;
	}

	public static MemorySegment SDL_RenamePath$address() {
		return SDL_RenamePath.ADDR;
	}

	public static boolean SDL_RenamePath(MemorySegment oldpath, MemorySegment newpath) {
		var mh$ = SDL_RenamePath.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_RenamePath", oldpath, newpath);
			}
			return (boolean) mh$.invokeExact(oldpath, newpath);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_CopyFile {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_CopyFile");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_CopyFile$descriptor() {
		return SDL_CopyFile.DESC;
	}

	public static MethodHandle SDL_CopyFile$handle() {
		return SDL_CopyFile.HANDLE;
	}

	public static MemorySegment SDL_CopyFile$address() {
		return SDL_CopyFile.ADDR;
	}

	public static boolean SDL_CopyFile(MemorySegment oldpath, MemorySegment newpath) {
		var mh$ = SDL_CopyFile.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_CopyFile", oldpath, newpath);
			}
			return (boolean) mh$.invokeExact(oldpath, newpath);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetPathInfo {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetPathInfo");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetPathInfo$descriptor() {
		return SDL_GetPathInfo.DESC;
	}

	public static MethodHandle SDL_GetPathInfo$handle() {
		return SDL_GetPathInfo.HANDLE;
	}

	public static MemorySegment SDL_GetPathInfo$address() {
		return SDL_GetPathInfo.ADDR;
	}

	public static boolean SDL_GetPathInfo(MemorySegment path, MemorySegment info) {
		var mh$ = SDL_GetPathInfo.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetPathInfo", path, info);
			}
			return (boolean) mh$.invokeExact(path, info);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GlobDirectory {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT,
				SDL3.C_POINTER
		);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GlobDirectory");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GlobDirectory$descriptor() {
		return SDL_GlobDirectory.DESC;
	}

	public static MethodHandle SDL_GlobDirectory$handle() {
		return SDL_GlobDirectory.HANDLE;
	}

	public static MemorySegment SDL_GlobDirectory$address() {
		return SDL_GlobDirectory.ADDR;
	}

	public static MemorySegment SDL_GlobDirectory(MemorySegment path, MemorySegment pattern, int flags, MemorySegment count) {
		var mh$ = SDL_GlobDirectory.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GlobDirectory", path, pattern, flags, count);
			}
			return (MemorySegment) mh$.invokeExact(path, pattern, flags, count);
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static class SDL_GetCurrentDirectory {
		public static FunctionDescriptor DESC = FunctionDescriptor.of(
				SDL3.C_POINTER);

		public static MemorySegment ADDR = SYMBOL_LOOKUP.findOrThrow("SDL_GetCurrentDirectory");

		public static MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
	}

	public static FunctionDescriptor SDL_GetCurrentDirectory$descriptor() {
		return SDL_GetCurrentDirectory.DESC;
	}

	public static MethodHandle SDL_GetCurrentDirectory$handle() {
		return SDL_GetCurrentDirectory.HANDLE;
	}

	public static MemorySegment SDL_GetCurrentDirectory$address() {
		return SDL_GetCurrentDirectory.ADDR;
	}

	public static MemorySegment SDL_GetCurrentDirectory() {
		var mh$ = SDL_GetCurrentDirectory.HANDLE;
		try {
			if (TRACE_DOWNCALLS) {
				traceDowncall("SDL_GetCurrentDirectory");
			}
			return (MemorySegment) mh$.invokeExact();
		} catch (Error | RuntimeException ex) {
			throw ex;
		} catch (Throwable ex$) {
			throw new AssertionError("should not reach here", ex$);
		}
	}

	private static final int SDL_GPU_PRIMITIVETYPE_TRIANGLELIST = (int) 0L;

	public static int SDL_GPU_PRIMITIVETYPE_TRIANGLELIST() {
		return SDL_GPU_PRIMITIVETYPE_TRIANGLELIST;
	}

	private static final int SDL_GPU_PRIMITIVETYPE_TRIANGLESTRIP = (int) 1L;

	public static int SDL_GPU_PRIMITIVETYPE_TRIANGLESTRIP() {
		return SDL_GPU_PRIMITIVETYPE_TRIANGLESTRIP;
	}

	private static final int SDL_GPU_PRIMITIVETYPE_LINELIST = (int) 2L;

	public static int SDL_GPU_PRIMITIVETYPE_LINELIST() {
		return SDL_GPU_PRIMITIVETYPE_LINELIST;
	}

	private static final int SDL_GPU_PRIMITIVETYPE_LINESTRIP = (int) 3L;

	public static int SDL_GPU_PRIMITIVETYPE_LINESTRIP() {
		return SDL_GPU_PRIMITIVETYPE_LINESTRIP;
	}

	private static final int SDL_GPU_PRIMITIVETYPE_POINTLIST = (int) 4L;

	public static int SDL_GPU_PRIMITIVETYPE_POINTLIST() {
		return SDL_GPU_PRIMITIVETYPE_POINTLIST;
	}

	private static final int SDL_GPU_LOADOP_LOAD = (int) 0L;

	public static int SDL_GPU_LOADOP_LOAD() {
		return SDL_GPU_LOADOP_LOAD;
	}

	private static final int SDL_GPU_LOADOP_CLEAR = (int) 1L;

	public static int SDL_GPU_LOADOP_CLEAR() {
		return SDL_GPU_LOADOP_CLEAR;
	}

	private static final int SDL_GPU_LOADOP_DONT_CARE = (int) 2L;

	public static int SDL_GPU_LOADOP_DONT_CARE() {
		return SDL_GPU_LOADOP_DONT_CARE;
	}

	private static final int SDL_GPU_STOREOP_STORE = (int) 0L;

	public static int SDL_GPU_STOREOP_STORE() {
		return SDL_GPU_STOREOP_STORE;
	}

	private static final int SDL_GPU_STOREOP_DONT_CARE = (int) 1L;

	public static int SDL_GPU_STOREOP_DONT_CARE() {
		return SDL_GPU_STOREOP_DONT_CARE;
	}

	private static final int SDL_GPU_STOREOP_RESOLVE = (int) 2L;

	public static int SDL_GPU_STOREOP_RESOLVE() {
		return SDL_GPU_STOREOP_RESOLVE;
	}

	private static final int SDL_GPU_STOREOP_RESOLVE_AND_STORE = (int) 3L;

	public static int SDL_GPU_STOREOP_RESOLVE_AND_STORE() {
		return SDL_GPU_STOREOP_RESOLVE_AND_STORE;
	}

	private static final int SDL_GPU_INDEXELEMENTSIZE_16BIT = (int) 0L;

	public static int SDL_GPU_INDEXELEMENTSIZE_16BIT() {
		return SDL_GPU_INDEXELEMENTSIZE_16BIT;
	}

	private static final int SDL_GPU_INDEXELEMENTSIZE_32BIT = (int) 1L;

	public static int SDL_GPU_INDEXELEMENTSIZE_32BIT() {
		return SDL_GPU_INDEXELEMENTSIZE_32BIT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_INVALID = (int) 0L;

	public static int SDL_GPU_TEXTUREFORMAT_INVALID() {
		return SDL_GPU_TEXTUREFORMAT_INVALID;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_A8_UNORM = (int) 1L;

	public static int SDL_GPU_TEXTUREFORMAT_A8_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_A8_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R8_UNORM = (int) 2L;

	public static int SDL_GPU_TEXTUREFORMAT_R8_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_R8_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R8G8_UNORM = (int) 3L;

	public static int SDL_GPU_TEXTUREFORMAT_R8G8_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_R8G8_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R8G8B8A8_UNORM = (int) 4L;

	public static int SDL_GPU_TEXTUREFORMAT_R8G8B8A8_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_R8G8B8A8_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R16_UNORM = (int) 5L;

	public static int SDL_GPU_TEXTUREFORMAT_R16_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_R16_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R16G16_UNORM = (int) 6L;

	public static int SDL_GPU_TEXTUREFORMAT_R16G16_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_R16G16_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R16G16B16A16_UNORM = (int) 7L;

	public static int SDL_GPU_TEXTUREFORMAT_R16G16B16A16_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_R16G16B16A16_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R10G10B10A2_UNORM = (int) 8L;

	public static int SDL_GPU_TEXTUREFORMAT_R10G10B10A2_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_R10G10B10A2_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_B5G6R5_UNORM = (int) 9L;

	public static int SDL_GPU_TEXTUREFORMAT_B5G6R5_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_B5G6R5_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_B5G5R5A1_UNORM = (int) 10L;

	public static int SDL_GPU_TEXTUREFORMAT_B5G5R5A1_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_B5G5R5A1_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_B4G4R4A4_UNORM = (int) 11L;

	public static int SDL_GPU_TEXTUREFORMAT_B4G4R4A4_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_B4G4R4A4_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_B8G8R8A8_UNORM = (int) 12L;

	public static int SDL_GPU_TEXTUREFORMAT_B8G8R8A8_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_B8G8R8A8_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_BC1_RGBA_UNORM = (int) 13L;

	public static int SDL_GPU_TEXTUREFORMAT_BC1_RGBA_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_BC1_RGBA_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_BC2_RGBA_UNORM = (int) 14L;

	public static int SDL_GPU_TEXTUREFORMAT_BC2_RGBA_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_BC2_RGBA_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_BC3_RGBA_UNORM = (int) 15L;

	public static int SDL_GPU_TEXTUREFORMAT_BC3_RGBA_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_BC3_RGBA_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_BC4_R_UNORM = (int) 16L;

	public static int SDL_GPU_TEXTUREFORMAT_BC4_R_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_BC4_R_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_BC5_RG_UNORM = (int) 17L;

	public static int SDL_GPU_TEXTUREFORMAT_BC5_RG_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_BC5_RG_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_BC7_RGBA_UNORM = (int) 18L;

	public static int SDL_GPU_TEXTUREFORMAT_BC7_RGBA_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_BC7_RGBA_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_BC6H_RGB_FLOAT = (int) 19L;

	public static int SDL_GPU_TEXTUREFORMAT_BC6H_RGB_FLOAT() {
		return SDL_GPU_TEXTUREFORMAT_BC6H_RGB_FLOAT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_BC6H_RGB_UFLOAT = (int) 20L;

	public static int SDL_GPU_TEXTUREFORMAT_BC6H_RGB_UFLOAT() {
		return SDL_GPU_TEXTUREFORMAT_BC6H_RGB_UFLOAT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R8_SNORM = (int) 21L;

	public static int SDL_GPU_TEXTUREFORMAT_R8_SNORM() {
		return SDL_GPU_TEXTUREFORMAT_R8_SNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R8G8_SNORM = (int) 22L;

	public static int SDL_GPU_TEXTUREFORMAT_R8G8_SNORM() {
		return SDL_GPU_TEXTUREFORMAT_R8G8_SNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R8G8B8A8_SNORM = (int) 23L;

	public static int SDL_GPU_TEXTUREFORMAT_R8G8B8A8_SNORM() {
		return SDL_GPU_TEXTUREFORMAT_R8G8B8A8_SNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R16_SNORM = (int) 24L;

	public static int SDL_GPU_TEXTUREFORMAT_R16_SNORM() {
		return SDL_GPU_TEXTUREFORMAT_R16_SNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R16G16_SNORM = (int) 25L;

	public static int SDL_GPU_TEXTUREFORMAT_R16G16_SNORM() {
		return SDL_GPU_TEXTUREFORMAT_R16G16_SNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R16G16B16A16_SNORM = (int) 26L;

	public static int SDL_GPU_TEXTUREFORMAT_R16G16B16A16_SNORM() {
		return SDL_GPU_TEXTUREFORMAT_R16G16B16A16_SNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R16_FLOAT = (int) 27L;

	public static int SDL_GPU_TEXTUREFORMAT_R16_FLOAT() {
		return SDL_GPU_TEXTUREFORMAT_R16_FLOAT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R16G16_FLOAT = (int) 28L;

	public static int SDL_GPU_TEXTUREFORMAT_R16G16_FLOAT() {
		return SDL_GPU_TEXTUREFORMAT_R16G16_FLOAT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R16G16B16A16_FLOAT = (int) 29L;

	public static int SDL_GPU_TEXTUREFORMAT_R16G16B16A16_FLOAT() {
		return SDL_GPU_TEXTUREFORMAT_R16G16B16A16_FLOAT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R32_FLOAT = (int) 30L;

	public static int SDL_GPU_TEXTUREFORMAT_R32_FLOAT() {
		return SDL_GPU_TEXTUREFORMAT_R32_FLOAT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R32G32_FLOAT = (int) 31L;

	public static int SDL_GPU_TEXTUREFORMAT_R32G32_FLOAT() {
		return SDL_GPU_TEXTUREFORMAT_R32G32_FLOAT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R32G32B32A32_FLOAT = (int) 32L;

	public static int SDL_GPU_TEXTUREFORMAT_R32G32B32A32_FLOAT() {
		return SDL_GPU_TEXTUREFORMAT_R32G32B32A32_FLOAT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R11G11B10_UFLOAT = (int) 33L;

	public static int SDL_GPU_TEXTUREFORMAT_R11G11B10_UFLOAT() {
		return SDL_GPU_TEXTUREFORMAT_R11G11B10_UFLOAT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R8_UINT = (int) 34L;

	public static int SDL_GPU_TEXTUREFORMAT_R8_UINT() {
		return SDL_GPU_TEXTUREFORMAT_R8_UINT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R8G8_UINT = (int) 35L;

	public static int SDL_GPU_TEXTUREFORMAT_R8G8_UINT() {
		return SDL_GPU_TEXTUREFORMAT_R8G8_UINT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R8G8B8A8_UINT = (int) 36L;

	public static int SDL_GPU_TEXTUREFORMAT_R8G8B8A8_UINT() {
		return SDL_GPU_TEXTUREFORMAT_R8G8B8A8_UINT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R16_UINT = (int) 37L;

	public static int SDL_GPU_TEXTUREFORMAT_R16_UINT() {
		return SDL_GPU_TEXTUREFORMAT_R16_UINT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R16G16_UINT = (int) 38L;

	public static int SDL_GPU_TEXTUREFORMAT_R16G16_UINT() {
		return SDL_GPU_TEXTUREFORMAT_R16G16_UINT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R16G16B16A16_UINT = (int) 39L;

	public static int SDL_GPU_TEXTUREFORMAT_R16G16B16A16_UINT() {
		return SDL_GPU_TEXTUREFORMAT_R16G16B16A16_UINT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R32_UINT = (int) 40L;

	public static int SDL_GPU_TEXTUREFORMAT_R32_UINT() {
		return SDL_GPU_TEXTUREFORMAT_R32_UINT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R32G32_UINT = (int) 41L;

	public static int SDL_GPU_TEXTUREFORMAT_R32G32_UINT() {
		return SDL_GPU_TEXTUREFORMAT_R32G32_UINT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R32G32B32A32_UINT = (int) 42L;

	public static int SDL_GPU_TEXTUREFORMAT_R32G32B32A32_UINT() {
		return SDL_GPU_TEXTUREFORMAT_R32G32B32A32_UINT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R8_INT = (int) 43L;

	public static int SDL_GPU_TEXTUREFORMAT_R8_INT() {
		return SDL_GPU_TEXTUREFORMAT_R8_INT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R8G8_INT = (int) 44L;

	public static int SDL_GPU_TEXTUREFORMAT_R8G8_INT() {
		return SDL_GPU_TEXTUREFORMAT_R8G8_INT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R8G8B8A8_INT = (int) 45L;

	public static int SDL_GPU_TEXTUREFORMAT_R8G8B8A8_INT() {
		return SDL_GPU_TEXTUREFORMAT_R8G8B8A8_INT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R16_INT = (int) 46L;

	public static int SDL_GPU_TEXTUREFORMAT_R16_INT() {
		return SDL_GPU_TEXTUREFORMAT_R16_INT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R16G16_INT = (int) 47L;

	public static int SDL_GPU_TEXTUREFORMAT_R16G16_INT() {
		return SDL_GPU_TEXTUREFORMAT_R16G16_INT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R16G16B16A16_INT = (int) 48L;

	public static int SDL_GPU_TEXTUREFORMAT_R16G16B16A16_INT() {
		return SDL_GPU_TEXTUREFORMAT_R16G16B16A16_INT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R32_INT = (int) 49L;

	public static int SDL_GPU_TEXTUREFORMAT_R32_INT() {
		return SDL_GPU_TEXTUREFORMAT_R32_INT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R32G32_INT = (int) 50L;

	public static int SDL_GPU_TEXTUREFORMAT_R32G32_INT() {
		return SDL_GPU_TEXTUREFORMAT_R32G32_INT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R32G32B32A32_INT = (int) 51L;

	public static int SDL_GPU_TEXTUREFORMAT_R32G32B32A32_INT() {
		return SDL_GPU_TEXTUREFORMAT_R32G32B32A32_INT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_R8G8B8A8_UNORM_SRGB = (int) 52L;

	public static int SDL_GPU_TEXTUREFORMAT_R8G8B8A8_UNORM_SRGB() {
		return SDL_GPU_TEXTUREFORMAT_R8G8B8A8_UNORM_SRGB;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_B8G8R8A8_UNORM_SRGB = (int) 53L;

	public static int SDL_GPU_TEXTUREFORMAT_B8G8R8A8_UNORM_SRGB() {
		return SDL_GPU_TEXTUREFORMAT_B8G8R8A8_UNORM_SRGB;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_BC1_RGBA_UNORM_SRGB = (int) 54L;

	public static int SDL_GPU_TEXTUREFORMAT_BC1_RGBA_UNORM_SRGB() {
		return SDL_GPU_TEXTUREFORMAT_BC1_RGBA_UNORM_SRGB;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_BC2_RGBA_UNORM_SRGB = (int) 55L;

	public static int SDL_GPU_TEXTUREFORMAT_BC2_RGBA_UNORM_SRGB() {
		return SDL_GPU_TEXTUREFORMAT_BC2_RGBA_UNORM_SRGB;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_BC3_RGBA_UNORM_SRGB = (int) 56L;

	public static int SDL_GPU_TEXTUREFORMAT_BC3_RGBA_UNORM_SRGB() {
		return SDL_GPU_TEXTUREFORMAT_BC3_RGBA_UNORM_SRGB;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_BC7_RGBA_UNORM_SRGB = (int) 57L;

	public static int SDL_GPU_TEXTUREFORMAT_BC7_RGBA_UNORM_SRGB() {
		return SDL_GPU_TEXTUREFORMAT_BC7_RGBA_UNORM_SRGB;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_D16_UNORM = (int) 58L;

	public static int SDL_GPU_TEXTUREFORMAT_D16_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_D16_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_D24_UNORM = (int) 59L;

	public static int SDL_GPU_TEXTUREFORMAT_D24_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_D24_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_D32_FLOAT = (int) 60L;

	public static int SDL_GPU_TEXTUREFORMAT_D32_FLOAT() {
		return SDL_GPU_TEXTUREFORMAT_D32_FLOAT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_D24_UNORM_S8_UINT = (int) 61L;

	public static int SDL_GPU_TEXTUREFORMAT_D24_UNORM_S8_UINT() {
		return SDL_GPU_TEXTUREFORMAT_D24_UNORM_S8_UINT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_D32_FLOAT_S8_UINT = (int) 62L;

	public static int SDL_GPU_TEXTUREFORMAT_D32_FLOAT_S8_UINT() {
		return SDL_GPU_TEXTUREFORMAT_D32_FLOAT_S8_UINT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_4x4_UNORM = (int) 63L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_4x4_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_4x4_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_5x4_UNORM = (int) 64L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_5x4_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_5x4_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_5x5_UNORM = (int) 65L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_5x5_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_5x5_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_6x5_UNORM = (int) 66L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_6x5_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_6x5_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_6x6_UNORM = (int) 67L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_6x6_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_6x6_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_8x5_UNORM = (int) 68L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_8x5_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_8x5_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_8x6_UNORM = (int) 69L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_8x6_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_8x6_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_8x8_UNORM = (int) 70L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_8x8_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_8x8_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_10x5_UNORM = (int) 71L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_10x5_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_10x5_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_10x6_UNORM = (int) 72L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_10x6_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_10x6_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_10x8_UNORM = (int) 73L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_10x8_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_10x8_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_10x10_UNORM = (int) 74L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_10x10_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_10x10_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_12x10_UNORM = (int) 75L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_12x10_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_12x10_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_12x12_UNORM = (int) 76L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_12x12_UNORM() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_12x12_UNORM;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_4x4_UNORM_SRGB = (int) 77L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_4x4_UNORM_SRGB() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_4x4_UNORM_SRGB;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_5x4_UNORM_SRGB = (int) 78L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_5x4_UNORM_SRGB() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_5x4_UNORM_SRGB;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_5x5_UNORM_SRGB = (int) 79L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_5x5_UNORM_SRGB() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_5x5_UNORM_SRGB;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_6x5_UNORM_SRGB = (int) 80L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_6x5_UNORM_SRGB() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_6x5_UNORM_SRGB;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_6x6_UNORM_SRGB = (int) 81L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_6x6_UNORM_SRGB() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_6x6_UNORM_SRGB;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_8x5_UNORM_SRGB = (int) 82L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_8x5_UNORM_SRGB() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_8x5_UNORM_SRGB;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_8x6_UNORM_SRGB = (int) 83L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_8x6_UNORM_SRGB() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_8x6_UNORM_SRGB;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_8x8_UNORM_SRGB = (int) 84L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_8x8_UNORM_SRGB() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_8x8_UNORM_SRGB;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_10x5_UNORM_SRGB = (int) 85L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_10x5_UNORM_SRGB() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_10x5_UNORM_SRGB;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_10x6_UNORM_SRGB = (int) 86L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_10x6_UNORM_SRGB() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_10x6_UNORM_SRGB;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_10x8_UNORM_SRGB = (int) 87L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_10x8_UNORM_SRGB() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_10x8_UNORM_SRGB;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_10x10_UNORM_SRGB = (int) 88L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_10x10_UNORM_SRGB() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_10x10_UNORM_SRGB;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_12x10_UNORM_SRGB = (int) 89L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_12x10_UNORM_SRGB() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_12x10_UNORM_SRGB;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_12x12_UNORM_SRGB = (int) 90L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_12x12_UNORM_SRGB() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_12x12_UNORM_SRGB;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_4x4_FLOAT = (int) 91L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_4x4_FLOAT() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_4x4_FLOAT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_5x4_FLOAT = (int) 92L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_5x4_FLOAT() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_5x4_FLOAT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_5x5_FLOAT = (int) 93L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_5x5_FLOAT() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_5x5_FLOAT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_6x5_FLOAT = (int) 94L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_6x5_FLOAT() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_6x5_FLOAT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_6x6_FLOAT = (int) 95L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_6x6_FLOAT() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_6x6_FLOAT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_8x5_FLOAT = (int) 96L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_8x5_FLOAT() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_8x5_FLOAT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_8x6_FLOAT = (int) 97L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_8x6_FLOAT() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_8x6_FLOAT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_8x8_FLOAT = (int) 98L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_8x8_FLOAT() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_8x8_FLOAT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_10x5_FLOAT = (int) 99L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_10x5_FLOAT() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_10x5_FLOAT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_10x6_FLOAT = (int) 100L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_10x6_FLOAT() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_10x6_FLOAT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_10x8_FLOAT = (int) 101L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_10x8_FLOAT() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_10x8_FLOAT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_10x10_FLOAT = (int) 102L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_10x10_FLOAT() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_10x10_FLOAT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_12x10_FLOAT = (int) 103L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_12x10_FLOAT() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_12x10_FLOAT;
	}

	private static final int SDL_GPU_TEXTUREFORMAT_ASTC_12x12_FLOAT = (int) 104L;

	public static int SDL_GPU_TEXTUREFORMAT_ASTC_12x12_FLOAT() {
		return SDL_GPU_TEXTUREFORMAT_ASTC_12x12_FLOAT;
	}

	public static OfInt SDL_GPUTextureUsageFlags = SDL3.C_INT;
	private static final int SDL_GPU_TEXTURETYPE_2D = (int) 0L;

	public static int SDL_GPU_TEXTURETYPE_2D() {
		return SDL_GPU_TEXTURETYPE_2D;
	}

	private static final int SDL_GPU_TEXTURETYPE_2D_ARRAY = (int) 1L;

	public static int SDL_GPU_TEXTURETYPE_2D_ARRAY() {
		return SDL_GPU_TEXTURETYPE_2D_ARRAY;
	}

	private static final int SDL_GPU_TEXTURETYPE_3D = (int) 2L;

	public static int SDL_GPU_TEXTURETYPE_3D() {
		return SDL_GPU_TEXTURETYPE_3D;
	}

	private static final int SDL_GPU_TEXTURETYPE_CUBE = (int) 3L;

	public static int SDL_GPU_TEXTURETYPE_CUBE() {
		return SDL_GPU_TEXTURETYPE_CUBE;
	}

	private static final int SDL_GPU_TEXTURETYPE_CUBE_ARRAY = (int) 4L;

	public static int SDL_GPU_TEXTURETYPE_CUBE_ARRAY() {
		return SDL_GPU_TEXTURETYPE_CUBE_ARRAY;
	}

	private static final int SDL_GPU_SAMPLECOUNT_1 = (int) 0L;

	public static int SDL_GPU_SAMPLECOUNT_1() {
		return SDL_GPU_SAMPLECOUNT_1;
	}

	private static final int SDL_GPU_SAMPLECOUNT_2 = (int) 1L;

	public static int SDL_GPU_SAMPLECOUNT_2() {
		return SDL_GPU_SAMPLECOUNT_2;
	}

	private static final int SDL_GPU_SAMPLECOUNT_4 = (int) 2L;

	public static int SDL_GPU_SAMPLECOUNT_4() {
		return SDL_GPU_SAMPLECOUNT_4;
	}

	private static final int SDL_GPU_SAMPLECOUNT_8 = (int) 3L;

	public static int SDL_GPU_SAMPLECOUNT_8() {
		return SDL_GPU_SAMPLECOUNT_8;
	}

	private static final int SDL_GPU_CUBEMAPFACE_POSITIVEX = (int) 0L;

	public static int SDL_GPU_CUBEMAPFACE_POSITIVEX() {
		return SDL_GPU_CUBEMAPFACE_POSITIVEX;
	}

	private static final int SDL_GPU_CUBEMAPFACE_NEGATIVEX = (int) 1L;

	public static int SDL_GPU_CUBEMAPFACE_NEGATIVEX() {
		return SDL_GPU_CUBEMAPFACE_NEGATIVEX;
	}

	private static final int SDL_GPU_CUBEMAPFACE_POSITIVEY = (int) 2L;

	public static int SDL_GPU_CUBEMAPFACE_POSITIVEY() {
		return SDL_GPU_CUBEMAPFACE_POSITIVEY;
	}

	private static final int SDL_GPU_CUBEMAPFACE_NEGATIVEY = (int) 3L;

	public static int SDL_GPU_CUBEMAPFACE_NEGATIVEY() {
		return SDL_GPU_CUBEMAPFACE_NEGATIVEY;
	}

	private static final int SDL_GPU_CUBEMAPFACE_POSITIVEZ = (int) 4L;

	public static int SDL_GPU_CUBEMAPFACE_POSITIVEZ() {
		return SDL_GPU_CUBEMAPFACE_POSITIVEZ;
	}

	private static final int SDL_GPU_CUBEMAPFACE_NEGATIVEZ = (int) 5L;

	public static int SDL_GPU_CUBEMAPFACE_NEGATIVEZ() {
		return SDL_GPU_CUBEMAPFACE_NEGATIVEZ;
	}

	public static OfInt SDL_GPUBufferUsageFlags = SDL3.C_INT;
	private static final int SDL_GPU_TRANSFERBUFFERUSAGE_UPLOAD = (int) 0L;

	public static int SDL_GPU_TRANSFERBUFFERUSAGE_UPLOAD() {
		return SDL_GPU_TRANSFERBUFFERUSAGE_UPLOAD;
	}

	private static final int SDL_GPU_TRANSFERBUFFERUSAGE_DOWNLOAD = (int) 1L;

	public static int SDL_GPU_TRANSFERBUFFERUSAGE_DOWNLOAD() {
		return SDL_GPU_TRANSFERBUFFERUSAGE_DOWNLOAD;
	}

	private static final int SDL_GPU_SHADERSTAGE_VERTEX = (int) 0L;

	public static int SDL_GPU_SHADERSTAGE_VERTEX() {
		return SDL_GPU_SHADERSTAGE_VERTEX;
	}

	private static final int SDL_GPU_SHADERSTAGE_FRAGMENT = (int) 1L;

	public static int SDL_GPU_SHADERSTAGE_FRAGMENT() {
		return SDL_GPU_SHADERSTAGE_FRAGMENT;
	}

	public static OfInt SDL_GPUShaderFormat = SDL3.C_INT;
	private static final int SDL_GPU_VERTEXELEMENTFORMAT_INVALID = (int) 0L;

	public static int SDL_GPU_VERTEXELEMENTFORMAT_INVALID() {
		return SDL_GPU_VERTEXELEMENTFORMAT_INVALID;
	}

	private static final int SDL_GPU_VERTEXELEMENTFORMAT_INT = (int) 1L;

	public static int SDL_GPU_VERTEXELEMENTFORMAT_INT() {
		return SDL_GPU_VERTEXELEMENTFORMAT_INT;
	}

	private static final int SDL_GPU_VERTEXELEMENTFORMAT_INT2 = (int) 2L;

	public static int SDL_GPU_VERTEXELEMENTFORMAT_INT2() {
		return SDL_GPU_VERTEXELEMENTFORMAT_INT2;
	}

	private static final int SDL_GPU_VERTEXELEMENTFORMAT_INT3 = (int) 3L;

	public static int SDL_GPU_VERTEXELEMENTFORMAT_INT3() {
		return SDL_GPU_VERTEXELEMENTFORMAT_INT3;
	}

	private static final int SDL_GPU_VERTEXELEMENTFORMAT_INT4 = (int) 4L;

	public static int SDL_GPU_VERTEXELEMENTFORMAT_INT4() {
		return SDL_GPU_VERTEXELEMENTFORMAT_INT4;
	}

	private static final int SDL_GPU_VERTEXELEMENTFORMAT_UINT = (int) 5L;

	public static int SDL_GPU_VERTEXELEMENTFORMAT_UINT() {
		return SDL_GPU_VERTEXELEMENTFORMAT_UINT;
	}

	private static final int SDL_GPU_VERTEXELEMENTFORMAT_UINT2 = (int) 6L;

	public static int SDL_GPU_VERTEXELEMENTFORMAT_UINT2() {
		return SDL_GPU_VERTEXELEMENTFORMAT_UINT2;
	}

	private static final int SDL_GPU_VERTEXELEMENTFORMAT_UINT3 = (int) 7L;

	public static int SDL_GPU_VERTEXELEMENTFORMAT_UINT3() {
		return SDL_GPU_VERTEXELEMENTFORMAT_UINT3;
	}

	private static final int SDL_GPU_VERTEXELEMENTFORMAT_UINT4 = (int) 8L;

	public static int SDL_GPU_VERTEXELEMENTFORMAT_UINT4() {
		return SDL_GPU_VERTEXELEMENTFORMAT_UINT4;
	}

	private static final int SDL_GPU_VERTEXELEMENTFORMAT_FLOAT = (int) 9L;

	public static int SDL_GPU_VERTEXELEMENTFORMAT_FLOAT() {
		return SDL_GPU_VERTEXELEMENTFORMAT_FLOAT;
	}

	private static final int SDL_GPU_VERTEXELEMENTFORMAT_FLOAT2 = (int) 10L;

	public static int SDL_GPU_VERTEXELEMENTFORMAT_FLOAT2() {
		return SDL_GPU_VERTEXELEMENTFORMAT_FLOAT2;
	}

	private static final int SDL_GPU_VERTEXELEMENTFORMAT_FLOAT3 = (int) 11L;

	public static int SDL_GPU_VERTEXELEMENTFORMAT_FLOAT3() {
		return SDL_GPU_VERTEXELEMENTFORMAT_FLOAT3;
	}

	private static final int SDL_GPU_VERTEXELEMENTFORMAT_FLOAT4 = (int) 12L;

	public static int SDL_GPU_VERTEXELEMENTFORMAT_FLOAT4() {
		return SDL_GPU_VERTEXELEMENTFORMAT_FLOAT4;
	}

	private static final int SDL_GPU_VERTEXELEMENTFORMAT_BYTE2 = (int) 13L;

	public static int SDL_GPU_VERTEXELEMENTFORMAT_BYTE2() {
		return SDL_GPU_VERTEXELEMENTFORMAT_BYTE2;
	}

	private static final int SDL_GPU_VERTEXELEMENTFORMAT_BYTE4 = (int) 14L;

	public static int SDL_GPU_VERTEXELEMENTFORMAT_BYTE4() {
		return SDL_GPU_VERTEXELEMENTFORMAT_BYTE4;
	}

	private static final int SDL_GPU_VERTEXELEMENTFORMAT_UBYTE2 = (int) 15L;

	public static int SDL_GPU_VERTEXELEMENTFORMAT_UBYTE2() {
		return SDL_GPU_VERTEXELEMENTFORMAT_UBYTE2;
	}

	private static final int SDL_GPU_VERTEXELEMENTFORMAT_UBYTE4 = (int) 16L;

	public static int SDL_GPU_VERTEXELEMENTFORMAT_UBYTE4() {
		return SDL_GPU_VERTEXELEMENTFORMAT_UBYTE4;
	}

	private static final int SDL_GPU_VERTEXELEMENTFORMAT_BYTE2_NORM = (int) 17L;

	public static int SDL_GPU_VERTEXELEMENTFORMAT_BYTE2_NORM() {
		return SDL_GPU_VERTEXELEMENTFORMAT_BYTE2_NORM;
	}

	private static final int SDL_GPU_VERTEXELEMENTFORMAT_BYTE4_NORM = (int) 18L;

	public static int SDL_GPU_VERTEXELEMENTFORMAT_BYTE4_NORM() {
		return SDL_GPU_VERTEXELEMENTFORMAT_BYTE4_NORM;
	}

	private static final int SDL_GPU_VERTEXELEMENTFORMAT_UBYTE2_NORM = (int) 19L;

	public static int SDL_GPU_VERTEXELEMENTFORMAT_UBYTE2_NORM() {
		return SDL_GPU_VERTEXELEMENTFORMAT_UBYTE2_NORM;
	}

	private static final int SDL_GPU_VERTEXELEMENTFORMAT_UBYTE4_NORM = (int) 20L;

	public static int SDL_GPU_VERTEXELEMENTFORMAT_UBYTE4_NORM() {
		return SDL_GPU_VERTEXELEMENTFORMAT_UBYTE4_NORM;
	}

	private static final int SDL_GPU_VERTEXELEMENTFORMAT_SHORT2 = (int) 21L;

	public static int SDL_GPU_VERTEXELEMENTFORMAT_SHORT2() {
		return SDL_GPU_VERTEXELEMENTFORMAT_SHORT2;
	}

	private static final int SDL_GPU_VERTEXELEMENTFORMAT_SHORT4 = (int) 22L;

	public static int SDL_GPU_VERTEXELEMENTFORMAT_SHORT4() {
		return SDL_GPU_VERTEXELEMENTFORMAT_SHORT4;
	}

	private static final int SDL_GPU_VERTEXELEMENTFORMAT_USHORT2 = (int) 23L;

	public static int SDL_GPU_VERTEXELEMENTFORMAT_USHORT2() {
		return SDL_GPU_VERTEXELEMENTFORMAT_USHORT2;
	}

	private static final int SDL_GPU_VERTEXELEMENTFORMAT_USHORT4 = (int) 24L;

	public static int SDL_GPU_VERTEXELEMENTFORMAT_USHORT4() {
		return SDL_GPU_VERTEXELEMENTFORMAT_USHORT4;
	}

	private static final int SDL_GPU_VERTEXELEMENTFORMAT_SHORT2_NORM = (int) 25L;

	public static int SDL_GPU_VERTEXELEMENTFORMAT_SHORT2_NORM() {
		return SDL_GPU_VERTEXELEMENTFORMAT_SHORT2_NORM;
	}

	private static final int SDL_GPU_VERTEXELEMENTFORMAT_SHORT4_NORM = (int) 26L;

	public static int SDL_GPU_VERTEXELEMENTFORMAT_SHORT4_NORM() {
		return SDL_GPU_VERTEXELEMENTFORMAT_SHORT4_NORM;
	}

	private static final int SDL_GPU_VERTEXELEMENTFORMAT_USHORT2_NORM = (int) 27L;

	public static int SDL_GPU_VERTEXELEMENTFORMAT_USHORT2_NORM() {
		return SDL_GPU_VERTEXELEMENTFORMAT_USHORT2_NORM;
	}

	private static final int SDL_GPU_VERTEXELEMENTFORMAT_USHORT4_NORM = (int) 28L;

	public static int SDL_GPU_VERTEXELEMENTFORMAT_USHORT4_NORM() {
		return SDL_GPU_VERTEXELEMENTFORMAT_USHORT4_NORM;
	}

	private static final int SDL_GPU_VERTEXELEMENTFORMAT_HALF2 = (int) 29L;

	public static int SDL_GPU_VERTEXELEMENTFORMAT_HALF2() {
		return SDL_GPU_VERTEXELEMENTFORMAT_HALF2;
	}

	private static final int SDL_GPU_VERTEXELEMENTFORMAT_HALF4 = (int) 30L;

	public static int SDL_GPU_VERTEXELEMENTFORMAT_HALF4() {
		return SDL_GPU_VERTEXELEMENTFORMAT_HALF4;
	}

	private static final int SDL_GPU_VERTEXINPUTRATE_VERTEX = (int) 0L;

	public static int SDL_GPU_VERTEXINPUTRATE_VERTEX() {
		return SDL_GPU_VERTEXINPUTRATE_VERTEX;
	}

	private static final int SDL_GPU_VERTEXINPUTRATE_INSTANCE = (int) 1L;

	public static int SDL_GPU_VERTEXINPUTRATE_INSTANCE() {
		return SDL_GPU_VERTEXINPUTRATE_INSTANCE;
	}

	private static final int SDL_GPU_FILLMODE_FILL = (int) 0L;

	public static int SDL_GPU_FILLMODE_FILL() {
		return SDL_GPU_FILLMODE_FILL;
	}

	private static final int SDL_GPU_FILLMODE_LINE = (int) 1L;

	public static int SDL_GPU_FILLMODE_LINE() {
		return SDL_GPU_FILLMODE_LINE;
	}

	private static final int SDL_GPU_CULLMODE_NONE = (int) 0L;

	public static int SDL_GPU_CULLMODE_NONE() {
		return SDL_GPU_CULLMODE_NONE;
	}

	private static final int SDL_GPU_CULLMODE_FRONT = (int) 1L;

	public static int SDL_GPU_CULLMODE_FRONT() {
		return SDL_GPU_CULLMODE_FRONT;
	}

	private static final int SDL_GPU_CULLMODE_BACK = (int) 2L;

	public static int SDL_GPU_CULLMODE_BACK() {
		return SDL_GPU_CULLMODE_BACK;
	}

	private static final int SDL_GPU_FRONTFACE_COUNTER_CLOCKWISE = (int) 0L;

	public static int SDL_GPU_FRONTFACE_COUNTER_CLOCKWISE() {
		return SDL_GPU_FRONTFACE_COUNTER_CLOCKWISE;
	}

	private static final int SDL_GPU_FRONTFACE_CLOCKWISE = (int) 1L;

	public static int SDL_GPU_FRONTFACE_CLOCKWISE() {
		return SDL_GPU_FRONTFACE_CLOCKWISE;
	}

	private static final int SDL_GPU_COMPAREOP_INVALID = (int) 0L;

	public static int SDL_GPU_COMPAREOP_INVALID() {
		return SDL_GPU_COMPAREOP_INVALID;
	}

	private static final int SDL_GPU_COMPAREOP_NEVER = (int) 1L;

	public static int SDL_GPU_COMPAREOP_NEVER() {
		return SDL_GPU_COMPAREOP_NEVER;
	}

	private static final int SDL_GPU_COMPAREOP_LESS = (int) 2L;

	public static int SDL_GPU_COMPAREOP_LESS() {
		return SDL_GPU_COMPAREOP_LESS;
	}

	private static final int SDL_GPU_COMPAREOP_EQUAL = (int) 3L;

	public static int SDL_GPU_COMPAREOP_EQUAL() {
		return SDL_GPU_COMPAREOP_EQUAL;
	}

	private static final int SDL_GPU_COMPAREOP_LESS_OR_EQUAL = (int) 4L;

	public static int SDL_GPU_COMPAREOP_LESS_OR_EQUAL() {
		return SDL_GPU_COMPAREOP_LESS_OR_EQUAL;
	}

	private static final int SDL_GPU_COMPAREOP_GREATER = (int) 5L;

	public static int SDL_GPU_COMPAREOP_GREATER() {
		return SDL_GPU_COMPAREOP_GREATER;
	}

	private static final int SDL_GPU_COMPAREOP_NOT_EQUAL = (int) 6L;

	public static int SDL_GPU_COMPAREOP_NOT_EQUAL() {
		return SDL_GPU_COMPAREOP_NOT_EQUAL;
	}

	private static final int SDL_GPU_COMPAREOP_GREATER_OR_EQUAL = (int) 7L;

	public static int SDL_GPU_COMPAREOP_GREATER_OR_EQUAL() {
		return SDL_GPU_COMPAREOP_GREATER_OR_EQUAL;
	}

	private static final int SDL_GPU_COMPAREOP_ALWAYS = (int) 8L;

	public static int SDL_GPU_COMPAREOP_ALWAYS() {
		return SDL_GPU_COMPAREOP_ALWAYS;
	}

	private static final int SDL_GPU_STENCILOP_INVALID = (int) 0L;

	public static int SDL_GPU_STENCILOP_INVALID() {
		return SDL_GPU_STENCILOP_INVALID;
	}

	private static final int SDL_GPU_STENCILOP_KEEP = (int) 1L;

	public static int SDL_GPU_STENCILOP_KEEP() {
		return SDL_GPU_STENCILOP_KEEP;
	}

	private static final int SDL_GPU_STENCILOP_ZERO = (int) 2L;

	public static int SDL_GPU_STENCILOP_ZERO() {
		return SDL_GPU_STENCILOP_ZERO;
	}

	private static final int SDL_GPU_STENCILOP_REPLACE = (int) 3L;

	public static int SDL_GPU_STENCILOP_REPLACE() {
		return SDL_GPU_STENCILOP_REPLACE;
	}

	private static final int SDL_GPU_STENCILOP_INCREMENT_AND_CLAMP = (int) 4L;

	public static int SDL_GPU_STENCILOP_INCREMENT_AND_CLAMP() {
		return SDL_GPU_STENCILOP_INCREMENT_AND_CLAMP;
	}

	private static final int SDL_GPU_STENCILOP_DECREMENT_AND_CLAMP = (int) 5L;

	public static int SDL_GPU_STENCILOP_DECREMENT_AND_CLAMP() {
		return SDL_GPU_STENCILOP_DECREMENT_AND_CLAMP;
	}

	private static final int SDL_GPU_STENCILOP_INVERT = (int) 6L;

	public static int SDL_GPU_STENCILOP_INVERT() {
		return SDL_GPU_STENCILOP_INVERT;
	}

	private static final int SDL_GPU_STENCILOP_INCREMENT_AND_WRAP = (int) 7L;

	public static int SDL_GPU_STENCILOP_INCREMENT_AND_WRAP() {
		return SDL_GPU_STENCILOP_INCREMENT_AND_WRAP;
	}

	private static final int SDL_GPU_STENCILOP_DECREMENT_AND_WRAP = (int) 8L;

	public static int SDL_GPU_STENCILOP_DECREMENT_AND_WRAP() {
		return SDL_GPU_STENCILOP_DECREMENT_AND_WRAP;
	}

	private static final int SDL_GPU_BLENDOP_INVALID = (int) 0L;

	public static int SDL_GPU_BLENDOP_INVALID() {
		return SDL_GPU_BLENDOP_INVALID;
	}
}
