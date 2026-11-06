package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.MemoryLayout.PathElement.sequenceElement;
import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.OfShort;

public class SDL_VirtualJoystickDesc {

	SDL_VirtualJoystickDesc() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
			SDL3.C_INT.withName("version"),
			SDL3.C_SHORT.withName("type"),
			SDL3.C_SHORT.withName("padding"),
			SDL3.C_SHORT.withName("vendor_id"),
			SDL3.C_SHORT.withName("product_id"),
			SDL3.C_SHORT.withName("naxes"),
			SDL3.C_SHORT.withName("nbuttons"),
			SDL3.C_SHORT.withName("nballs"),
			SDL3.C_SHORT.withName("nhats"),
			SDL3.C_SHORT.withName("ntouchpads"),
			SDL3.C_SHORT.withName("nsensors"),
			MemoryLayout.sequenceLayout(2, SDL3.C_SHORT).withName("padding2"),
			SDL3.C_INT.withName("button_mask"),
			SDL3.C_INT.withName("axis_mask"),
			MemoryLayout.paddingLayout(4),
			SDL3.C_POINTER.withName("name"),
			SDL3.C_POINTER.withName("touchpads"),
			SDL3.C_POINTER.withName("sensors"),
			SDL3.C_POINTER.withName("userdata"),
			SDL3.C_POINTER.withName("Update"),
			SDL3.C_POINTER.withName("SetPlayerIndex"),
			SDL3.C_POINTER.withName("Rumble"),
			SDL3.C_POINTER.withName("RumbleTriggers"),
			SDL3.C_POINTER.withName("SetLED"),
			SDL3.C_POINTER.withName("SendEffect"),
			SDL3.C_POINTER.withName("SetSensorsEnabled"),
			SDL3.C_POINTER.withName("Cleanup")
	).withName("SDL_VirtualJoystickDesc");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfInt version$LAYOUT = (OfInt) $LAYOUT.select(groupElement("version"));

	public static OfInt version$layout() {
		return version$LAYOUT;
	}

	private static final long version$OFFSET = $LAYOUT.byteOffset(groupElement("version"));

	public static long version$offset() {
		return version$OFFSET;
	}

	public static int version(MemorySegment struct) {
		return struct.get(version$LAYOUT, version$OFFSET);
	}

	public static void version(MemorySegment struct, int fieldValue) {
		struct.set(version$LAYOUT, version$OFFSET, fieldValue);
	}

	private static final OfShort type$LAYOUT = (OfShort) $LAYOUT.select(groupElement("type"));

	public static OfShort type$layout() {
		return type$LAYOUT;
	}

	private static final long type$OFFSET = $LAYOUT.byteOffset(groupElement("type"));

	public static long type$offset() {
		return type$OFFSET;
	}

	public static short type(MemorySegment struct) {
		return struct.get(type$LAYOUT, type$OFFSET);
	}

	public static void type(MemorySegment struct, short fieldValue) {
		struct.set(type$LAYOUT, type$OFFSET, fieldValue);
	}

	private static final OfShort padding$LAYOUT = (OfShort) $LAYOUT.select(groupElement("padding"));

	public static OfShort padding$layout() {
		return padding$LAYOUT;
	}

	private static final long padding$OFFSET = $LAYOUT.byteOffset(groupElement("padding"));

	public static long padding$offset() {
		return padding$OFFSET;
	}

	public static short padding(MemorySegment struct) {
		return struct.get(padding$LAYOUT, padding$OFFSET);
	}

	public static void padding(MemorySegment struct, short fieldValue) {
		struct.set(padding$LAYOUT, padding$OFFSET, fieldValue);
	}

	private static final OfShort vendor_id$LAYOUT = (OfShort) $LAYOUT.select(groupElement("vendor_id"));

	public static OfShort vendor_id$layout() {
		return vendor_id$LAYOUT;
	}

	private static final long vendor_id$OFFSET = $LAYOUT.byteOffset(groupElement("vendor_id"));

	public static long vendor_id$offset() {
		return vendor_id$OFFSET;
	}

	public static short vendor_id(MemorySegment struct) {
		return struct.get(vendor_id$LAYOUT, vendor_id$OFFSET);
	}

	public static void vendor_id(MemorySegment struct, short fieldValue) {
		struct.set(vendor_id$LAYOUT, vendor_id$OFFSET, fieldValue);
	}

	private static final OfShort product_id$LAYOUT = (OfShort) $LAYOUT.select(groupElement("product_id"));

	public static OfShort product_id$layout() {
		return product_id$LAYOUT;
	}

	private static final long product_id$OFFSET = $LAYOUT.byteOffset(groupElement("product_id"));

	public static long product_id$offset() {
		return product_id$OFFSET;
	}

	public static short product_id(MemorySegment struct) {
		return struct.get(product_id$LAYOUT, product_id$OFFSET);
	}

	public static void product_id(MemorySegment struct, short fieldValue) {
		struct.set(product_id$LAYOUT, product_id$OFFSET, fieldValue);
	}

	private static final OfShort naxes$LAYOUT = (OfShort) $LAYOUT.select(groupElement("naxes"));

	public static OfShort naxes$layout() {
		return naxes$LAYOUT;
	}

	private static final long naxes$OFFSET = $LAYOUT.byteOffset(groupElement("naxes"));

	public static long naxes$offset() {
		return naxes$OFFSET;
	}

	public static short naxes(MemorySegment struct) {
		return struct.get(naxes$LAYOUT, naxes$OFFSET);
	}

	public static void naxes(MemorySegment struct, short fieldValue) {
		struct.set(naxes$LAYOUT, naxes$OFFSET, fieldValue);
	}

	private static final OfShort nbuttons$LAYOUT = (OfShort) $LAYOUT.select(groupElement("nbuttons"));

	public static OfShort nbuttons$layout() {
		return nbuttons$LAYOUT;
	}

	private static final long nbuttons$OFFSET = $LAYOUT.byteOffset(groupElement("nbuttons"));

	public static long nbuttons$offset() {
		return nbuttons$OFFSET;
	}

	public static short nbuttons(MemorySegment struct) {
		return struct.get(nbuttons$LAYOUT, nbuttons$OFFSET);
	}

	public static void nbuttons(MemorySegment struct, short fieldValue) {
		struct.set(nbuttons$LAYOUT, nbuttons$OFFSET, fieldValue);
	}

	private static final OfShort nballs$LAYOUT = (OfShort) $LAYOUT.select(groupElement("nballs"));

	public static OfShort nballs$layout() {
		return nballs$LAYOUT;
	}

	private static final long nballs$OFFSET = $LAYOUT.byteOffset(groupElement("nballs"));

	public static long nballs$offset() {
		return nballs$OFFSET;
	}

	public static short nballs(MemorySegment struct) {
		return struct.get(nballs$LAYOUT, nballs$OFFSET);
	}

	public static void nballs(MemorySegment struct, short fieldValue) {
		struct.set(nballs$LAYOUT, nballs$OFFSET, fieldValue);
	}

	private static final OfShort nhats$LAYOUT = (OfShort) $LAYOUT.select(groupElement("nhats"));

	public static OfShort nhats$layout() {
		return nhats$LAYOUT;
	}

	private static final long nhats$OFFSET = $LAYOUT.byteOffset(groupElement("nhats"));

	public static long nhats$offset() {
		return nhats$OFFSET;
	}

	public static short nhats(MemorySegment struct) {
		return struct.get(nhats$LAYOUT, nhats$OFFSET);
	}

	public static void nhats(MemorySegment struct, short fieldValue) {
		struct.set(nhats$LAYOUT, nhats$OFFSET, fieldValue);
	}

	private static final OfShort ntouchpads$LAYOUT = (OfShort) $LAYOUT.select(groupElement("ntouchpads"));

	public static OfShort ntouchpads$layout() {
		return ntouchpads$LAYOUT;
	}

	private static final long ntouchpads$OFFSET = $LAYOUT.byteOffset(groupElement("ntouchpads"));

	public static long ntouchpads$offset() {
		return ntouchpads$OFFSET;
	}

	public static short ntouchpads(MemorySegment struct) {
		return struct.get(ntouchpads$LAYOUT, ntouchpads$OFFSET);
	}

	public static void ntouchpads(MemorySegment struct, short fieldValue) {
		struct.set(ntouchpads$LAYOUT, ntouchpads$OFFSET, fieldValue);
	}

	private static final OfShort nsensors$LAYOUT = (OfShort) $LAYOUT.select(groupElement("nsensors"));

	public static OfShort nsensors$layout() {
		return nsensors$LAYOUT;
	}

	private static final long nsensors$OFFSET = $LAYOUT.byteOffset(groupElement("nsensors"));

	public static long nsensors$offset() {
		return nsensors$OFFSET;
	}

	public static short nsensors(MemorySegment struct) {
		return struct.get(nsensors$LAYOUT, nsensors$OFFSET);
	}

	public static void nsensors(MemorySegment struct, short fieldValue) {
		struct.set(nsensors$LAYOUT, nsensors$OFFSET, fieldValue);
	}

	private static final SequenceLayout padding2$LAYOUT = (SequenceLayout) $LAYOUT.select(groupElement("padding2"));

	public static SequenceLayout padding2$layout() {
		return padding2$LAYOUT;
	}

	private static final long padding2$OFFSET = $LAYOUT.byteOffset(groupElement("padding2"));

	public static long padding2$offset() {
		return padding2$OFFSET;
	}

	public static MemorySegment padding2(MemorySegment struct) {
		return struct.asSlice(padding2$OFFSET, padding2$LAYOUT.byteSize());
	}

	public static void padding2(MemorySegment struct, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, struct, padding2$OFFSET, padding2$LAYOUT.byteSize());
	}

	private static long[] padding2$DIMS = {2};

	public static long[] padding2$dimensions() {
		return padding2$DIMS;
	}

	private static final VarHandle padding2$ELEM_HANDLE = padding2$LAYOUT.varHandle(sequenceElement());

	public static short padding2(MemorySegment struct, long index0) {
		return (short) padding2$ELEM_HANDLE.get(struct, padding2$OFFSET, index0);
	}

	public static void padding2(MemorySegment struct, long index0, short fieldValue) {
		padding2$ELEM_HANDLE.set(struct, padding2$OFFSET, index0, fieldValue);
	}

	private static final OfInt button_mask$LAYOUT = (OfInt) $LAYOUT.select(groupElement("button_mask"));

	public static OfInt button_mask$layout() {
		return button_mask$LAYOUT;
	}

	private static final long button_mask$OFFSET = $LAYOUT.byteOffset(groupElement("button_mask"));

	public static long button_mask$offset() {
		return button_mask$OFFSET;
	}

	public static int button_mask(MemorySegment struct) {
		return struct.get(button_mask$LAYOUT, button_mask$OFFSET);
	}

	public static void button_mask(MemorySegment struct, int fieldValue) {
		struct.set(button_mask$LAYOUT, button_mask$OFFSET, fieldValue);
	}

	private static final OfInt axis_mask$LAYOUT = (OfInt) $LAYOUT.select(groupElement("axis_mask"));

	public static OfInt axis_mask$layout() {
		return axis_mask$LAYOUT;
	}

	private static final long axis_mask$OFFSET = $LAYOUT.byteOffset(groupElement("axis_mask"));

	public static long axis_mask$offset() {
		return axis_mask$OFFSET;
	}

	public static int axis_mask(MemorySegment struct) {
		return struct.get(axis_mask$LAYOUT, axis_mask$OFFSET);
	}

	public static void axis_mask(MemorySegment struct, int fieldValue) {
		struct.set(axis_mask$LAYOUT, axis_mask$OFFSET, fieldValue);
	}

	private static final AddressLayout name$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("name"));

	public static AddressLayout name$layout() {
		return name$LAYOUT;
	}

	private static final long name$OFFSET = $LAYOUT.byteOffset(groupElement("name"));

	public static long name$offset() {
		return name$OFFSET;
	}

	public static MemorySegment name(MemorySegment struct) {
		return struct.get(name$LAYOUT, name$OFFSET);
	}

	public static void name(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(name$LAYOUT, name$OFFSET, fieldValue);
	}

	private static final AddressLayout touchpads$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("touchpads"));

	public static AddressLayout touchpads$layout() {
		return touchpads$LAYOUT;
	}

	private static final long touchpads$OFFSET = $LAYOUT.byteOffset(groupElement("touchpads"));

	public static long touchpads$offset() {
		return touchpads$OFFSET;
	}

	public static MemorySegment touchpads(MemorySegment struct) {
		return struct.get(touchpads$LAYOUT, touchpads$OFFSET);
	}

	public static void touchpads(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(touchpads$LAYOUT, touchpads$OFFSET, fieldValue);
	}

	private static final AddressLayout sensors$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("sensors"));

	public static AddressLayout sensors$layout() {
		return sensors$LAYOUT;
	}

	private static final long sensors$OFFSET = $LAYOUT.byteOffset(groupElement("sensors"));

	public static long sensors$offset() {
		return sensors$OFFSET;
	}

	public static MemorySegment sensors(MemorySegment struct) {
		return struct.get(sensors$LAYOUT, sensors$OFFSET);
	}

	public static void sensors(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(sensors$LAYOUT, sensors$OFFSET, fieldValue);
	}

	private static final AddressLayout userdata$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("userdata"));

	public static AddressLayout userdata$layout() {
		return userdata$LAYOUT;
	}

	private static final long userdata$OFFSET = $LAYOUT.byteOffset(groupElement("userdata"));

	public static long userdata$offset() {
		return userdata$OFFSET;
	}

	public static MemorySegment userdata(MemorySegment struct) {
		return struct.get(userdata$LAYOUT, userdata$OFFSET);
	}

	public static void userdata(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(userdata$LAYOUT, userdata$OFFSET, fieldValue);
	}

	public final static class Update {

		private Update() {

		}

		public interface Function {
			void apply(MemorySegment _x0);
		}

		private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static FunctionDescriptor descriptor() {
			return $DESC;
		}

		private static final MethodHandle UP$MH = SDL3.upcallHandle(Update.Function.class, "apply", $DESC);

		public static MemorySegment allocate(Update.Function fi, Arena arena) {
			return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
		}

		private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

		public static void invoke(MemorySegment funcPtr, MemorySegment _x0) {
			try {
				DOWN$MH.invokeExact(funcPtr, _x0);
			} catch (Error | RuntimeException ex) {
				throw ex;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	private static final AddressLayout Update$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("Update"));

	public static AddressLayout Update$layout() {
		return Update$LAYOUT;
	}

	private static final long Update$OFFSET = $LAYOUT.byteOffset(groupElement("Update"));

	public static long Update$offset() {
		return Update$OFFSET;
	}

	public static MemorySegment Update(MemorySegment struct) {
		return struct.get(Update$LAYOUT, Update$OFFSET);
	}

	public static void Update(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(Update$LAYOUT, Update$OFFSET, fieldValue);
	}

	public final static class SetPlayerIndex {

		private SetPlayerIndex() {

		}

		public interface Function {
			void apply(MemorySegment _x0, int _x1);
		}

		private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static FunctionDescriptor descriptor() {
			return $DESC;
		}

		private static final MethodHandle UP$MH = SDL3.upcallHandle(SetPlayerIndex.Function.class, "apply", $DESC);

		public static MemorySegment allocate(SetPlayerIndex.Function fi, Arena arena) {
			return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
		}

		private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

		public static void invoke(MemorySegment funcPtr, MemorySegment _x0, int _x1) {
			try {
				DOWN$MH.invokeExact(funcPtr, _x0, _x1);
			} catch (Error | RuntimeException ex) {
				throw ex;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	private static final AddressLayout SetPlayerIndex$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("SetPlayerIndex"));

	public static AddressLayout SetPlayerIndex$layout() {
		return SetPlayerIndex$LAYOUT;
	}

	private static final long SetPlayerIndex$OFFSET = $LAYOUT.byteOffset(groupElement("SetPlayerIndex"));

	public static long SetPlayerIndex$offset() {
		return SetPlayerIndex$OFFSET;
	}

	public static MemorySegment SetPlayerIndex(MemorySegment struct) {
		return struct.get(SetPlayerIndex$LAYOUT, SetPlayerIndex$OFFSET);
	}

	public static void SetPlayerIndex(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(SetPlayerIndex$LAYOUT, SetPlayerIndex$OFFSET, fieldValue);
	}

	public final static class Rumble {

		private Rumble() {

		}

		public interface Function {
			boolean apply(MemorySegment _x0, short _x1, short _x2);
		}

		private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_SHORT,
				SDL3.C_SHORT
		);

		public static FunctionDescriptor descriptor() {
			return $DESC;
		}

		private static final MethodHandle UP$MH = SDL3.upcallHandle(Rumble.Function.class, "apply", $DESC);

		public static MemorySegment allocate(Rumble.Function fi, Arena arena) {
			return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
		}

		private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

		public static boolean invoke(MemorySegment funcPtr, MemorySegment _x0, short _x1, short _x2) {
			try {
				return (boolean) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
			} catch (Error | RuntimeException ex) {
				throw ex;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	private static final AddressLayout Rumble$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("Rumble"));

	public static AddressLayout Rumble$layout() {
		return Rumble$LAYOUT;
	}

	private static final long Rumble$OFFSET = $LAYOUT.byteOffset(groupElement("Rumble"));

	public static long Rumble$offset() {
		return Rumble$OFFSET;
	}

	public static MemorySegment Rumble(MemorySegment struct) {
		return struct.get(Rumble$LAYOUT, Rumble$OFFSET);
	}

	public static void Rumble(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(Rumble$LAYOUT, Rumble$OFFSET, fieldValue);
	}

	public final static class RumbleTriggers {

		private RumbleTriggers() {

		}

		public interface Function {
			boolean apply(MemorySegment _x0, short _x1, short _x2);
		}

		private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_SHORT,
				SDL3.C_SHORT
		);

		public static FunctionDescriptor descriptor() {
			return $DESC;
		}

		private static final MethodHandle UP$MH = SDL3.upcallHandle(RumbleTriggers.Function.class, "apply", $DESC);

		public static MemorySegment allocate(RumbleTriggers.Function fi, Arena arena) {
			return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
		}

		private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

		public static boolean invoke(MemorySegment funcPtr, MemorySegment _x0, short _x1, short _x2) {
			try {
				return (boolean) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
			} catch (Error | RuntimeException ex) {
				throw ex;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	private static final AddressLayout RumbleTriggers$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("RumbleTriggers"));

	public static AddressLayout RumbleTriggers$layout() {
		return RumbleTriggers$LAYOUT;
	}

	private static final long RumbleTriggers$OFFSET = $LAYOUT.byteOffset(groupElement("RumbleTriggers"));

	public static long RumbleTriggers$offset() {
		return RumbleTriggers$OFFSET;
	}

	public static MemorySegment RumbleTriggers(MemorySegment struct) {
		return struct.get(RumbleTriggers$LAYOUT, RumbleTriggers$OFFSET);
	}

	public static void RumbleTriggers(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(RumbleTriggers$LAYOUT, RumbleTriggers$OFFSET, fieldValue);
	}

	public final static class SetLED {

		private SetLED() {

		}

		public interface Function {
			boolean apply(MemorySegment _x0, byte _x1, byte _x2, byte _x3);
		}

		private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_CHAR,
				SDL3.C_CHAR,
				SDL3.C_CHAR
		);

		public static FunctionDescriptor descriptor() {
			return $DESC;
		}

		private static final MethodHandle UP$MH = SDL3.upcallHandle(SetLED.Function.class, "apply", $DESC);

		public static MemorySegment allocate(SetLED.Function fi, Arena arena) {
			return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
		}

		private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

		public static boolean invoke(MemorySegment funcPtr, MemorySegment _x0, byte _x1, byte _x2, byte _x3) {
			try {
				return (boolean) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3);
			} catch (Error | RuntimeException ex) {
				throw ex;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	private static final AddressLayout SetLED$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("SetLED"));

	public static AddressLayout SetLED$layout() {
		return SetLED$LAYOUT;
	}

	private static final long SetLED$OFFSET = $LAYOUT.byteOffset(groupElement("SetLED"));

	public static long SetLED$offset() {
		return SetLED$OFFSET;
	}

	public static MemorySegment SetLED(MemorySegment struct) {
		return struct.get(SetLED$LAYOUT, SetLED$OFFSET);
	}

	public static void SetLED(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(SetLED$LAYOUT, SetLED$OFFSET, fieldValue);
	}

	public final static class SendEffect {

		private SendEffect() {

		}

		public interface Function {
			boolean apply(MemorySegment _x0, MemorySegment _x1, int _x2);
		}

		private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_POINTER,
				SDL3.C_INT
		);

		public static FunctionDescriptor descriptor() {
			return $DESC;
		}

		private static final MethodHandle UP$MH = SDL3.upcallHandle(SendEffect.Function.class, "apply", $DESC);

		public static MemorySegment allocate(SendEffect.Function fi, Arena arena) {
			return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
		}

		private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

		public static boolean invoke(MemorySegment funcPtr, MemorySegment _x0, MemorySegment _x1, int _x2) {
			try {
				return (boolean) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
			} catch (Error | RuntimeException ex) {
				throw ex;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	private static final AddressLayout SendEffect$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("SendEffect"));

	public static AddressLayout SendEffect$layout() {
		return SendEffect$LAYOUT;
	}

	private static final long SendEffect$OFFSET = $LAYOUT.byteOffset(groupElement("SendEffect"));

	public static long SendEffect$offset() {
		return SendEffect$OFFSET;
	}

	public static MemorySegment SendEffect(MemorySegment struct) {
		return struct.get(SendEffect$LAYOUT, SendEffect$OFFSET);
	}

	public static void SendEffect(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(SendEffect$LAYOUT, SendEffect$OFFSET, fieldValue);
	}

	public final static class SetSensorsEnabled {

		private SetSensorsEnabled() {

		}

		public interface Function {
			boolean apply(MemorySegment _x0, boolean _x1);
		}

		private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
				SDL3.C_BOOL,
				SDL3.C_POINTER,
				SDL3.C_BOOL
		);

		public static FunctionDescriptor descriptor() {
			return $DESC;
		}

		private static final MethodHandle UP$MH = SDL3.upcallHandle(SetSensorsEnabled.Function.class, "apply", $DESC);

		public static MemorySegment allocate(SetSensorsEnabled.Function fi, Arena arena) {
			return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
		}

		private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

		public static boolean invoke(MemorySegment funcPtr, MemorySegment _x0, boolean _x1) {
			try {
				return (boolean) DOWN$MH.invokeExact(funcPtr, _x0, _x1);
			} catch (Error | RuntimeException ex) {
				throw ex;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	private static final AddressLayout SetSensorsEnabled$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("SetSensorsEnabled"));

	public static AddressLayout SetSensorsEnabled$layout() {
		return SetSensorsEnabled$LAYOUT;
	}

	private static final long SetSensorsEnabled$OFFSET = $LAYOUT.byteOffset(groupElement("SetSensorsEnabled"));

	public static long SetSensorsEnabled$offset() {
		return SetSensorsEnabled$OFFSET;
	}

	public static MemorySegment SetSensorsEnabled(MemorySegment struct) {
		return struct.get(SetSensorsEnabled$LAYOUT, SetSensorsEnabled$OFFSET);
	}

	public static void SetSensorsEnabled(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(SetSensorsEnabled$LAYOUT, SetSensorsEnabled$OFFSET, fieldValue);
	}

	public final static class Cleanup {

		private Cleanup() {

		}

		public interface Function {
			void apply(MemorySegment _x0);
		}

		private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
				SDL3.C_POINTER
		);

		public static FunctionDescriptor descriptor() {
			return $DESC;
		}

		private static final MethodHandle UP$MH = SDL3.upcallHandle(Cleanup.Function.class, "apply", $DESC);

		public static MemorySegment allocate(Cleanup.Function fi, Arena arena) {
			return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
		}

		private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

		public static void invoke(MemorySegment funcPtr, MemorySegment _x0) {
			try {
				DOWN$MH.invokeExact(funcPtr, _x0);
			} catch (Error | RuntimeException ex) {
				throw ex;
			} catch (Throwable ex$) {
				throw new AssertionError("should not reach here", ex$);
			}
		}
	}

	private static final AddressLayout Cleanup$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("Cleanup"));

	public static AddressLayout Cleanup$layout() {
		return Cleanup$LAYOUT;
	}

	private static final long Cleanup$OFFSET = $LAYOUT.byteOffset(groupElement("Cleanup"));

	public static long Cleanup$offset() {
		return Cleanup$OFFSET;
	}

	public static MemorySegment Cleanup(MemorySegment struct) {
		return struct.get(Cleanup$LAYOUT, Cleanup$OFFSET);
	}

	public static void Cleanup(MemorySegment struct, MemorySegment fieldValue) {
		struct.set(Cleanup$LAYOUT, Cleanup$OFFSET, fieldValue);
	}

	public static MemorySegment asSlice(MemorySegment array, long index) {
		return array.asSlice(layout().byteSize() * index);
	}

	public static long sizeof() {
		return layout().byteSize();
	}

	public static MemorySegment allocate(SegmentAllocator allocator) {
		return allocator.allocate(layout());
	}

	public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
		return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
	}

	public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
		return reinterpret(addr, 1, arena, cleanup);
	}

	public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
		return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
	}
}
