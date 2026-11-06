package com.varlanv.klab.sdl3.ffi.generated;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.MemoryLayout.PathElement.sequenceElement;
import static java.lang.foreign.ValueLayout.OfInt;

public class SDL_Event {

	SDL_Event() {

	}

	private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
			SDL3.C_INT.withName("type"),
			SDL_CommonEvent.layout().withName("common"),
			SDL_DisplayEvent.layout().withName("display"),
			SDL_WindowEvent.layout().withName("window"),
			SDL_KeyboardDeviceEvent.layout().withName("kdevice"),
			SDL_KeyboardEvent.layout().withName("key"),
			SDL_TextEditingEvent.layout().withName("edit"),
			SDL_TextEditingCandidatesEvent.layout().withName("edit_candidates"),
			SDL_TextInputEvent.layout().withName("text"),
			SDL_MouseDeviceEvent.layout().withName("mdevice"),
			SDL_MouseMotionEvent.layout().withName("motion"),
			SDL_MouseButtonEvent.layout().withName("button"),
			SDL_MouseWheelEvent.layout().withName("wheel"),
			SDL_JoyDeviceEvent.layout().withName("jdevice"),
			SDL_JoyAxisEvent.layout().withName("jaxis"),
			SDL_JoyBallEvent.layout().withName("jball"),
			SDL_JoyHatEvent.layout().withName("jhat"),
			SDL_JoyButtonEvent.layout().withName("jbutton"),
			SDL_JoyBatteryEvent.layout().withName("jbattery"),
			SDL_GamepadDeviceEvent.layout().withName("gdevice"),
			SDL_GamepadAxisEvent.layout().withName("gaxis"),
			SDL_GamepadButtonEvent.layout().withName("gbutton"),
			SDL_GamepadTouchpadEvent.layout().withName("gtouchpad"),
			SDL_GamepadSensorEvent.layout().withName("gsensor"),
			SDL_AudioDeviceEvent.layout().withName("adevice"),
			SDL_CameraDeviceEvent.layout().withName("cdevice"),
			SDL_SensorEvent.layout().withName("sensor"),
			SDL_QuitEvent.layout().withName("quit"),
			SDL_UserEvent.layout().withName("user"),
			SDL_TouchFingerEvent.layout().withName("tfinger"),
			SDL_PinchFingerEvent.layout().withName("pinch"),
			SDL_PenProximityEvent.layout().withName("pproximity"),
			SDL_PenTouchEvent.layout().withName("ptouch"),
			SDL_PenMotionEvent.layout().withName("pmotion"),
			SDL_PenButtonEvent.layout().withName("pbutton"),
			SDL_PenAxisEvent.layout().withName("paxis"),
			SDL_RenderEvent.layout().withName("render"),
			SDL_DropEvent.layout().withName("drop"),
			SDL_ClipboardEvent.layout().withName("clipboard"),
			MemoryLayout.sequenceLayout(128, SDL3.C_CHAR).withName("padding")
	).withName("SDL_Event");

	public static GroupLayout layout() {
		return $LAYOUT;
	}

	private static final OfInt type$LAYOUT = (OfInt) $LAYOUT.select(groupElement("type"));

	public static OfInt type$layout() {
		return type$LAYOUT;
	}

	private static final long type$OFFSET = $LAYOUT.byteOffset(groupElement("type"));

	public static long type$offset() {
		return type$OFFSET;
	}

	public static int type(MemorySegment union) {
		return union.get(type$LAYOUT, type$OFFSET);
	}

	public static void type(MemorySegment union, int fieldValue) {
		union.set(type$LAYOUT, type$OFFSET, fieldValue);
	}

	private static final GroupLayout common$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("common"));

	public static GroupLayout common$layout() {
		return common$LAYOUT;
	}

	private static final long common$OFFSET = $LAYOUT.byteOffset(groupElement("common"));

	public static long common$offset() {
		return common$OFFSET;
	}

	public static MemorySegment common(MemorySegment union) {
		return union.asSlice(common$OFFSET, common$LAYOUT.byteSize());
	}

	public static void common(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, common$OFFSET, common$LAYOUT.byteSize());
	}

	private static final GroupLayout display$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("display"));

	public static GroupLayout display$layout() {
		return display$LAYOUT;
	}

	private static final long display$OFFSET = $LAYOUT.byteOffset(groupElement("display"));

	public static long display$offset() {
		return display$OFFSET;
	}

	public static MemorySegment display(MemorySegment union) {
		return union.asSlice(display$OFFSET, display$LAYOUT.byteSize());
	}

	public static void display(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, display$OFFSET, display$LAYOUT.byteSize());
	}

	private static final GroupLayout window$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("window"));

	public static GroupLayout window$layout() {
		return window$LAYOUT;
	}

	private static final long window$OFFSET = $LAYOUT.byteOffset(groupElement("window"));

	public static long window$offset() {
		return window$OFFSET;
	}

	public static MemorySegment window(MemorySegment union) {
		return union.asSlice(window$OFFSET, window$LAYOUT.byteSize());
	}

	public static void window(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, window$OFFSET, window$LAYOUT.byteSize());
	}

	private static final GroupLayout kdevice$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("kdevice"));

	public static GroupLayout kdevice$layout() {
		return kdevice$LAYOUT;
	}

	private static final long kdevice$OFFSET = $LAYOUT.byteOffset(groupElement("kdevice"));

	public static long kdevice$offset() {
		return kdevice$OFFSET;
	}

	public static MemorySegment kdevice(MemorySegment union) {
		return union.asSlice(kdevice$OFFSET, kdevice$LAYOUT.byteSize());
	}

	public static void kdevice(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, kdevice$OFFSET, kdevice$LAYOUT.byteSize());
	}

	private static final GroupLayout key$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("key"));

	public static GroupLayout key$layout() {
		return key$LAYOUT;
	}

	private static final long key$OFFSET = $LAYOUT.byteOffset(groupElement("key"));

	public static long key$offset() {
		return key$OFFSET;
	}

	public static MemorySegment key(MemorySegment union) {
		return union.asSlice(key$OFFSET, key$LAYOUT.byteSize());
	}

	public static void key(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, key$OFFSET, key$LAYOUT.byteSize());
	}

	private static final GroupLayout edit$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("edit"));

	public static GroupLayout edit$layout() {
		return edit$LAYOUT;
	}

	private static final long edit$OFFSET = $LAYOUT.byteOffset(groupElement("edit"));

	public static long edit$offset() {
		return edit$OFFSET;
	}

	public static MemorySegment edit(MemorySegment union) {
		return union.asSlice(edit$OFFSET, edit$LAYOUT.byteSize());
	}

	public static void edit(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, edit$OFFSET, edit$LAYOUT.byteSize());
	}

	private static final GroupLayout edit_candidates$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("edit_candidates"));

	public static GroupLayout edit_candidates$layout() {
		return edit_candidates$LAYOUT;
	}

	private static final long edit_candidates$OFFSET = $LAYOUT.byteOffset(groupElement("edit_candidates"));

	public static long edit_candidates$offset() {
		return edit_candidates$OFFSET;
	}

	public static MemorySegment edit_candidates(MemorySegment union) {
		return union.asSlice(edit_candidates$OFFSET, edit_candidates$LAYOUT.byteSize());
	}

	public static void edit_candidates(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, edit_candidates$OFFSET, edit_candidates$LAYOUT.byteSize());
	}

	private static final GroupLayout text$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("text"));

	public static GroupLayout text$layout() {
		return text$LAYOUT;
	}

	private static final long text$OFFSET = $LAYOUT.byteOffset(groupElement("text"));

	public static long text$offset() {
		return text$OFFSET;
	}

	public static MemorySegment text(MemorySegment union) {
		return union.asSlice(text$OFFSET, text$LAYOUT.byteSize());
	}

	public static void text(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, text$OFFSET, text$LAYOUT.byteSize());
	}

	private static final GroupLayout mdevice$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("mdevice"));

	public static GroupLayout mdevice$layout() {
		return mdevice$LAYOUT;
	}

	private static final long mdevice$OFFSET = $LAYOUT.byteOffset(groupElement("mdevice"));

	public static long mdevice$offset() {
		return mdevice$OFFSET;
	}

	public static MemorySegment mdevice(MemorySegment union) {
		return union.asSlice(mdevice$OFFSET, mdevice$LAYOUT.byteSize());
	}

	public static void mdevice(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, mdevice$OFFSET, mdevice$LAYOUT.byteSize());
	}

	private static final GroupLayout motion$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("motion"));

	public static GroupLayout motion$layout() {
		return motion$LAYOUT;
	}

	private static final long motion$OFFSET = $LAYOUT.byteOffset(groupElement("motion"));

	public static long motion$offset() {
		return motion$OFFSET;
	}

	public static MemorySegment motion(MemorySegment union) {
		return union.asSlice(motion$OFFSET, motion$LAYOUT.byteSize());
	}

	public static void motion(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, motion$OFFSET, motion$LAYOUT.byteSize());
	}

	private static final GroupLayout button$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("button"));

	public static GroupLayout button$layout() {
		return button$LAYOUT;
	}

	private static final long button$OFFSET = $LAYOUT.byteOffset(groupElement("button"));

	public static long button$offset() {
		return button$OFFSET;
	}

	public static MemorySegment button(MemorySegment union) {
		return union.asSlice(button$OFFSET, button$LAYOUT.byteSize());
	}

	public static void button(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, button$OFFSET, button$LAYOUT.byteSize());
	}

	private static final GroupLayout wheel$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("wheel"));

	public static GroupLayout wheel$layout() {
		return wheel$LAYOUT;
	}

	private static final long wheel$OFFSET = $LAYOUT.byteOffset(groupElement("wheel"));

	public static long wheel$offset() {
		return wheel$OFFSET;
	}

	public static MemorySegment wheel(MemorySegment union) {
		return union.asSlice(wheel$OFFSET, wheel$LAYOUT.byteSize());
	}

	public static void wheel(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, wheel$OFFSET, wheel$LAYOUT.byteSize());
	}

	private static final GroupLayout jdevice$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("jdevice"));

	public static GroupLayout jdevice$layout() {
		return jdevice$LAYOUT;
	}

	private static final long jdevice$OFFSET = $LAYOUT.byteOffset(groupElement("jdevice"));

	public static long jdevice$offset() {
		return jdevice$OFFSET;
	}

	public static MemorySegment jdevice(MemorySegment union) {
		return union.asSlice(jdevice$OFFSET, jdevice$LAYOUT.byteSize());
	}

	public static void jdevice(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, jdevice$OFFSET, jdevice$LAYOUT.byteSize());
	}

	private static final GroupLayout jaxis$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("jaxis"));

	public static GroupLayout jaxis$layout() {
		return jaxis$LAYOUT;
	}

	private static final long jaxis$OFFSET = $LAYOUT.byteOffset(groupElement("jaxis"));

	public static long jaxis$offset() {
		return jaxis$OFFSET;
	}

	public static MemorySegment jaxis(MemorySegment union) {
		return union.asSlice(jaxis$OFFSET, jaxis$LAYOUT.byteSize());
	}

	public static void jaxis(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, jaxis$OFFSET, jaxis$LAYOUT.byteSize());
	}

	private static final GroupLayout jball$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("jball"));

	public static GroupLayout jball$layout() {
		return jball$LAYOUT;
	}

	private static final long jball$OFFSET = $LAYOUT.byteOffset(groupElement("jball"));

	public static long jball$offset() {
		return jball$OFFSET;
	}

	public static MemorySegment jball(MemorySegment union) {
		return union.asSlice(jball$OFFSET, jball$LAYOUT.byteSize());
	}

	public static void jball(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, jball$OFFSET, jball$LAYOUT.byteSize());
	}

	private static final GroupLayout jhat$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("jhat"));

	public static GroupLayout jhat$layout() {
		return jhat$LAYOUT;
	}

	private static final long jhat$OFFSET = $LAYOUT.byteOffset(groupElement("jhat"));

	public static long jhat$offset() {
		return jhat$OFFSET;
	}

	public static MemorySegment jhat(MemorySegment union) {
		return union.asSlice(jhat$OFFSET, jhat$LAYOUT.byteSize());
	}

	public static void jhat(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, jhat$OFFSET, jhat$LAYOUT.byteSize());
	}

	private static final GroupLayout jbutton$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("jbutton"));

	public static GroupLayout jbutton$layout() {
		return jbutton$LAYOUT;
	}

	private static final long jbutton$OFFSET = $LAYOUT.byteOffset(groupElement("jbutton"));

	public static long jbutton$offset() {
		return jbutton$OFFSET;
	}

	public static MemorySegment jbutton(MemorySegment union) {
		return union.asSlice(jbutton$OFFSET, jbutton$LAYOUT.byteSize());
	}

	public static void jbutton(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, jbutton$OFFSET, jbutton$LAYOUT.byteSize());
	}

	private static final GroupLayout jbattery$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("jbattery"));

	public static GroupLayout jbattery$layout() {
		return jbattery$LAYOUT;
	}

	private static final long jbattery$OFFSET = $LAYOUT.byteOffset(groupElement("jbattery"));

	public static long jbattery$offset() {
		return jbattery$OFFSET;
	}

	public static MemorySegment jbattery(MemorySegment union) {
		return union.asSlice(jbattery$OFFSET, jbattery$LAYOUT.byteSize());
	}

	public static void jbattery(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, jbattery$OFFSET, jbattery$LAYOUT.byteSize());
	}

	private static final GroupLayout gdevice$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("gdevice"));

	public static GroupLayout gdevice$layout() {
		return gdevice$LAYOUT;
	}

	private static final long gdevice$OFFSET = $LAYOUT.byteOffset(groupElement("gdevice"));

	public static long gdevice$offset() {
		return gdevice$OFFSET;
	}

	public static MemorySegment gdevice(MemorySegment union) {
		return union.asSlice(gdevice$OFFSET, gdevice$LAYOUT.byteSize());
	}

	public static void gdevice(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, gdevice$OFFSET, gdevice$LAYOUT.byteSize());
	}

	private static final GroupLayout gaxis$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("gaxis"));

	public static GroupLayout gaxis$layout() {
		return gaxis$LAYOUT;
	}

	private static final long gaxis$OFFSET = $LAYOUT.byteOffset(groupElement("gaxis"));

	public static long gaxis$offset() {
		return gaxis$OFFSET;
	}

	public static MemorySegment gaxis(MemorySegment union) {
		return union.asSlice(gaxis$OFFSET, gaxis$LAYOUT.byteSize());
	}

	public static void gaxis(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, gaxis$OFFSET, gaxis$LAYOUT.byteSize());
	}

	private static final GroupLayout gbutton$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("gbutton"));

	public static GroupLayout gbutton$layout() {
		return gbutton$LAYOUT;
	}

	private static final long gbutton$OFFSET = $LAYOUT.byteOffset(groupElement("gbutton"));

	public static long gbutton$offset() {
		return gbutton$OFFSET;
	}

	public static MemorySegment gbutton(MemorySegment union) {
		return union.asSlice(gbutton$OFFSET, gbutton$LAYOUT.byteSize());
	}

	public static void gbutton(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, gbutton$OFFSET, gbutton$LAYOUT.byteSize());
	}

	private static final GroupLayout gtouchpad$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("gtouchpad"));

	public static GroupLayout gtouchpad$layout() {
		return gtouchpad$LAYOUT;
	}

	private static final long gtouchpad$OFFSET = $LAYOUT.byteOffset(groupElement("gtouchpad"));

	public static long gtouchpad$offset() {
		return gtouchpad$OFFSET;
	}

	public static MemorySegment gtouchpad(MemorySegment union) {
		return union.asSlice(gtouchpad$OFFSET, gtouchpad$LAYOUT.byteSize());
	}

	public static void gtouchpad(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, gtouchpad$OFFSET, gtouchpad$LAYOUT.byteSize());
	}

	private static final GroupLayout gsensor$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("gsensor"));

	public static GroupLayout gsensor$layout() {
		return gsensor$LAYOUT;
	}

	private static final long gsensor$OFFSET = $LAYOUT.byteOffset(groupElement("gsensor"));

	public static long gsensor$offset() {
		return gsensor$OFFSET;
	}

	public static MemorySegment gsensor(MemorySegment union) {
		return union.asSlice(gsensor$OFFSET, gsensor$LAYOUT.byteSize());
	}

	public static void gsensor(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, gsensor$OFFSET, gsensor$LAYOUT.byteSize());
	}

	private static final GroupLayout adevice$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("adevice"));

	public static GroupLayout adevice$layout() {
		return adevice$LAYOUT;
	}

	private static final long adevice$OFFSET = $LAYOUT.byteOffset(groupElement("adevice"));

	public static long adevice$offset() {
		return adevice$OFFSET;
	}

	public static MemorySegment adevice(MemorySegment union) {
		return union.asSlice(adevice$OFFSET, adevice$LAYOUT.byteSize());
	}

	public static void adevice(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, adevice$OFFSET, adevice$LAYOUT.byteSize());
	}

	private static final GroupLayout cdevice$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("cdevice"));

	public static GroupLayout cdevice$layout() {
		return cdevice$LAYOUT;
	}

	private static final long cdevice$OFFSET = $LAYOUT.byteOffset(groupElement("cdevice"));

	public static long cdevice$offset() {
		return cdevice$OFFSET;
	}

	public static MemorySegment cdevice(MemorySegment union) {
		return union.asSlice(cdevice$OFFSET, cdevice$LAYOUT.byteSize());
	}

	public static void cdevice(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, cdevice$OFFSET, cdevice$LAYOUT.byteSize());
	}

	private static final GroupLayout sensor$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("sensor"));

	public static GroupLayout sensor$layout() {
		return sensor$LAYOUT;
	}

	private static final long sensor$OFFSET = $LAYOUT.byteOffset(groupElement("sensor"));

	public static long sensor$offset() {
		return sensor$OFFSET;
	}

	public static MemorySegment sensor(MemorySegment union) {
		return union.asSlice(sensor$OFFSET, sensor$LAYOUT.byteSize());
	}

	public static void sensor(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, sensor$OFFSET, sensor$LAYOUT.byteSize());
	}

	private static final GroupLayout quit$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("quit"));

	public static GroupLayout quit$layout() {
		return quit$LAYOUT;
	}

	private static final long quit$OFFSET = $LAYOUT.byteOffset(groupElement("quit"));

	public static long quit$offset() {
		return quit$OFFSET;
	}

	public static MemorySegment quit(MemorySegment union) {
		return union.asSlice(quit$OFFSET, quit$LAYOUT.byteSize());
	}

	public static void quit(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, quit$OFFSET, quit$LAYOUT.byteSize());
	}

	private static final GroupLayout user$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("user"));

	public static GroupLayout user$layout() {
		return user$LAYOUT;
	}

	private static final long user$OFFSET = $LAYOUT.byteOffset(groupElement("user"));

	public static long user$offset() {
		return user$OFFSET;
	}

	public static MemorySegment user(MemorySegment union) {
		return union.asSlice(user$OFFSET, user$LAYOUT.byteSize());
	}

	public static void user(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, user$OFFSET, user$LAYOUT.byteSize());
	}

	private static final GroupLayout tfinger$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("tfinger"));

	public static GroupLayout tfinger$layout() {
		return tfinger$LAYOUT;
	}

	private static final long tfinger$OFFSET = $LAYOUT.byteOffset(groupElement("tfinger"));

	public static long tfinger$offset() {
		return tfinger$OFFSET;
	}

	public static MemorySegment tfinger(MemorySegment union) {
		return union.asSlice(tfinger$OFFSET, tfinger$LAYOUT.byteSize());
	}

	public static void tfinger(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, tfinger$OFFSET, tfinger$LAYOUT.byteSize());
	}

	private static final GroupLayout pinch$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("pinch"));

	public static GroupLayout pinch$layout() {
		return pinch$LAYOUT;
	}

	private static final long pinch$OFFSET = $LAYOUT.byteOffset(groupElement("pinch"));

	public static long pinch$offset() {
		return pinch$OFFSET;
	}

	public static MemorySegment pinch(MemorySegment union) {
		return union.asSlice(pinch$OFFSET, pinch$LAYOUT.byteSize());
	}

	public static void pinch(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, pinch$OFFSET, pinch$LAYOUT.byteSize());
	}

	private static final GroupLayout pproximity$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("pproximity"));

	public static GroupLayout pproximity$layout() {
		return pproximity$LAYOUT;
	}

	private static final long pproximity$OFFSET = $LAYOUT.byteOffset(groupElement("pproximity"));

	public static long pproximity$offset() {
		return pproximity$OFFSET;
	}

	public static MemorySegment pproximity(MemorySegment union) {
		return union.asSlice(pproximity$OFFSET, pproximity$LAYOUT.byteSize());
	}

	public static void pproximity(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, pproximity$OFFSET, pproximity$LAYOUT.byteSize());
	}

	private static final GroupLayout ptouch$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("ptouch"));

	public static GroupLayout ptouch$layout() {
		return ptouch$LAYOUT;
	}

	private static final long ptouch$OFFSET = $LAYOUT.byteOffset(groupElement("ptouch"));

	public static long ptouch$offset() {
		return ptouch$OFFSET;
	}

	public static MemorySegment ptouch(MemorySegment union) {
		return union.asSlice(ptouch$OFFSET, ptouch$LAYOUT.byteSize());
	}

	public static void ptouch(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, ptouch$OFFSET, ptouch$LAYOUT.byteSize());
	}

	private static final GroupLayout pmotion$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("pmotion"));

	public static GroupLayout pmotion$layout() {
		return pmotion$LAYOUT;
	}

	private static final long pmotion$OFFSET = $LAYOUT.byteOffset(groupElement("pmotion"));

	public static long pmotion$offset() {
		return pmotion$OFFSET;
	}

	public static MemorySegment pmotion(MemorySegment union) {
		return union.asSlice(pmotion$OFFSET, pmotion$LAYOUT.byteSize());
	}

	public static void pmotion(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, pmotion$OFFSET, pmotion$LAYOUT.byteSize());
	}

	private static final GroupLayout pbutton$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("pbutton"));

	public static GroupLayout pbutton$layout() {
		return pbutton$LAYOUT;
	}

	private static final long pbutton$OFFSET = $LAYOUT.byteOffset(groupElement("pbutton"));

	public static long pbutton$offset() {
		return pbutton$OFFSET;
	}

	public static MemorySegment pbutton(MemorySegment union) {
		return union.asSlice(pbutton$OFFSET, pbutton$LAYOUT.byteSize());
	}

	public static void pbutton(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, pbutton$OFFSET, pbutton$LAYOUT.byteSize());
	}

	private static final GroupLayout paxis$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("paxis"));

	public static GroupLayout paxis$layout() {
		return paxis$LAYOUT;
	}

	private static final long paxis$OFFSET = $LAYOUT.byteOffset(groupElement("paxis"));

	public static long paxis$offset() {
		return paxis$OFFSET;
	}

	public static MemorySegment paxis(MemorySegment union) {
		return union.asSlice(paxis$OFFSET, paxis$LAYOUT.byteSize());
	}

	public static void paxis(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, paxis$OFFSET, paxis$LAYOUT.byteSize());
	}

	private static final GroupLayout render$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("render"));

	public static GroupLayout render$layout() {
		return render$LAYOUT;
	}

	private static final long render$OFFSET = $LAYOUT.byteOffset(groupElement("render"));

	public static long render$offset() {
		return render$OFFSET;
	}

	public static MemorySegment render(MemorySegment union) {
		return union.asSlice(render$OFFSET, render$LAYOUT.byteSize());
	}

	public static void render(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, render$OFFSET, render$LAYOUT.byteSize());
	}

	private static final GroupLayout drop$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("drop"));

	public static GroupLayout drop$layout() {
		return drop$LAYOUT;
	}

	private static final long drop$OFFSET = $LAYOUT.byteOffset(groupElement("drop"));

	public static long drop$offset() {
		return drop$OFFSET;
	}

	public static MemorySegment drop(MemorySegment union) {
		return union.asSlice(drop$OFFSET, drop$LAYOUT.byteSize());
	}

	public static void drop(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, drop$OFFSET, drop$LAYOUT.byteSize());
	}

	private static final GroupLayout clipboard$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("clipboard"));

	public static GroupLayout clipboard$layout() {
		return clipboard$LAYOUT;
	}

	private static final long clipboard$OFFSET = $LAYOUT.byteOffset(groupElement("clipboard"));

	public static long clipboard$offset() {
		return clipboard$OFFSET;
	}

	public static MemorySegment clipboard(MemorySegment union) {
		return union.asSlice(clipboard$OFFSET, clipboard$LAYOUT.byteSize());
	}

	public static void clipboard(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, clipboard$OFFSET, clipboard$LAYOUT.byteSize());
	}

	private static final SequenceLayout padding$LAYOUT = (SequenceLayout) $LAYOUT.select(groupElement("padding"));

	public static SequenceLayout padding$layout() {
		return padding$LAYOUT;
	}

	private static final long padding$OFFSET = $LAYOUT.byteOffset(groupElement("padding"));

	public static long padding$offset() {
		return padding$OFFSET;
	}

	public static MemorySegment padding(MemorySegment union) {
		return union.asSlice(padding$OFFSET, padding$LAYOUT.byteSize());
	}

	public static void padding(MemorySegment union, MemorySegment fieldValue) {
		MemorySegment.copy(fieldValue, 0L, union, padding$OFFSET, padding$LAYOUT.byteSize());
	}

	private static long[] padding$DIMS = {128};

	public static long[] padding$dimensions() {
		return padding$DIMS;
	}

	private static final VarHandle padding$ELEM_HANDLE = padding$LAYOUT.varHandle(sequenceElement());

	public static byte padding(MemorySegment union, long index0) {
		return (byte) padding$ELEM_HANDLE.get(union, padding$OFFSET, index0);
	}

	public static void padding(MemorySegment union, long index0, byte fieldValue) {
		padding$ELEM_HANDLE.set(union, padding$OFFSET, index0, fieldValue);
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
