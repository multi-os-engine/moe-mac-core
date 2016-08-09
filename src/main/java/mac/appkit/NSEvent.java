/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package mac.appkit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.coregraphics.opaque.CGEventRef;
import mac.coregraphics.struct.CGPoint;
import mac.foundation.NSCoder;
import mac.foundation.NSSet;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSEvent extends NSObject implements NSCopying, NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSEvent(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("CGEvent")
	public native CGEventRef CGEvent();

	@Generated
	@Selector("absoluteX")
	public native long absoluteX();

	@Generated
	@Selector("absoluteY")
	public native long absoluteY();

	@Generated
	@Selector("absoluteZ")
	public native long absoluteZ();

	@Generated
	@Selector("addGlobalMonitorForEventsMatchingMask:handler:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object addGlobalMonitorForEventsMatchingMaskHandler(
			long mask,
			@ObjCBlock(name = "call_addGlobalMonitorForEventsMatchingMaskHandler") Block_addGlobalMonitorForEventsMatchingMaskHandler block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_addGlobalMonitorForEventsMatchingMaskHandler {
		@Generated
		public void call_addGlobalMonitorForEventsMatchingMaskHandler(
				NSEvent arg0);
	}

	@Generated
	@Selector("addLocalMonitorForEventsMatchingMask:handler:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object addLocalMonitorForEventsMatchingMaskHandler(
			long mask,
			@ObjCBlock(name = "call_addLocalMonitorForEventsMatchingMaskHandler") Block_addLocalMonitorForEventsMatchingMaskHandler block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_addLocalMonitorForEventsMatchingMaskHandler {
		@Generated
		public NSEvent call_addLocalMonitorForEventsMatchingMaskHandler(
				NSEvent arg0);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSEvent alloc();

	@Generated
	@Selector("buttonMask")
	public native long buttonMask();

	@Generated
	@Selector("buttonNumber")
	public native long buttonNumber();

	@Generated
	@Selector("capabilityMask")
	public native long capabilityMask();

	@Generated
	@Selector("characters")
	public native String characters();

	@Generated
	@Selector("charactersIgnoringModifiers")
	public native String charactersIgnoringModifiers();

	@Generated
	@Selector("clickCount")
	public native long clickCount();

	@Generated
	@Selector("context")
	public native NSGraphicsContext context();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("data1")
	public native long data1();

	@Generated
	@Selector("data2")
	public native long data2();

	@Generated
	@Selector("deltaX")
	public native double deltaX();

	@Generated
	@Selector("deltaY")
	public native double deltaY();

	@Generated
	@Selector("deltaZ")
	public native double deltaZ();

	@Generated
	@Selector("deviceID")
	public native long deviceID();

	@Generated
	@Selector("doubleClickInterval")
	public static native double doubleClickInterval();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("enterExitEventWithType:location:modifierFlags:timestamp:windowNumber:context:eventNumber:trackingNumber:userData:")
	public static native NSEvent enterExitEventWithTypeLocationModifierFlagsTimestampWindowNumberContextEventNumberTrackingNumberUserData(
			long type, @ByValue CGPoint location, long flags, double time,
			long wNum, NSGraphicsContext context, long eNum, long tNum,
			VoidPtr data);

	@Generated
	@Selector("eventNumber")
	public native long eventNumber();

	@Generated
	@Selector("eventRef")
	public native ConstVoidPtr eventRef();

	@Generated
	@Selector("eventWithCGEvent:")
	public static native NSEvent eventWithCGEvent(CGEventRef cgEvent);

	@Generated
	@Selector("eventWithEventRef:")
	public static native NSEvent eventWithEventRef(ConstVoidPtr eventRef);

	@Generated
	@Selector("hasPreciseScrollingDeltas")
	public native boolean hasPreciseScrollingDeltas();

	@Generated
	@Selector("init")
	public native NSEvent init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("isARepeat")
	public native boolean isARepeat();

	@Generated
	@Selector("isDirectionInvertedFromDevice")
	public native boolean isDirectionInvertedFromDevice();

	@Generated
	@Selector("isEnteringProximity")
	public native boolean isEnteringProximity();

	@Generated
	@Selector("isMouseCoalescingEnabled")
	public static native boolean isMouseCoalescingEnabled();

	@Generated
	@Selector("isSwipeTrackingFromScrollEventsEnabled")
	public static native boolean isSwipeTrackingFromScrollEventsEnabled();

	@Generated
	@Selector("keyCode")
	public native short keyCode();

	@Generated
	@Selector("keyEventWithType:location:modifierFlags:timestamp:windowNumber:context:characters:charactersIgnoringModifiers:isARepeat:keyCode:")
	public static native NSEvent keyEventWithTypeLocationModifierFlagsTimestampWindowNumberContextCharactersCharactersIgnoringModifiersIsARepeatKeyCode(
			long type, @ByValue CGPoint location, long flags, double time,
			long wNum, NSGraphicsContext context, String keys, String ukeys,
			boolean flag, short code);

	@Generated
	@Selector("keyRepeatDelay")
	public static native double keyRepeatDelay();

	@Generated
	@Selector("keyRepeatInterval")
	public static native double keyRepeatInterval();

	@Generated
	@Selector("locationInWindow")
	@ByValue
	public native CGPoint locationInWindow();

	@Generated
	@Selector("magnification")
	public native double magnification();

	@Generated
	@Selector("modifierFlags")
	public native long modifierFlags();

	@Generated
	@Selector("modifierFlags")
	public static native long modifierFlags_static();

	@Generated
	@Selector("momentumPhase")
	public native long momentumPhase();

	@Generated
	@Selector("mouseEventWithType:location:modifierFlags:timestamp:windowNumber:context:eventNumber:clickCount:pressure:")
	public static native NSEvent mouseEventWithTypeLocationModifierFlagsTimestampWindowNumberContextEventNumberClickCountPressure(
			long type, @ByValue CGPoint location, long flags, double time,
			long wNum, NSGraphicsContext context, long eNum, long cNum,
			float pressure);

	@Generated
	@Selector("mouseLocation")
	@ByValue
	public static native CGPoint mouseLocation();

	@Generated
	@Selector("otherEventWithType:location:modifierFlags:timestamp:windowNumber:context:subtype:data1:data2:")
	public static native NSEvent otherEventWithTypeLocationModifierFlagsTimestampWindowNumberContextSubtypeData1Data2(
			long type, @ByValue CGPoint location, long flags, double time,
			long wNum, NSGraphicsContext context, short subtype, long d1,
			long d2);

	@Generated
	@Selector("phase")
	public native long phase();

	@Generated
	@Selector("pointingDeviceID")
	public native long pointingDeviceID();

	@Generated
	@Selector("pointingDeviceSerialNumber")
	public native long pointingDeviceSerialNumber();

	@Generated
	@Selector("pointingDeviceType")
	public native long pointingDeviceType();

	@Generated
	@Selector("pressedMouseButtons")
	public static native long pressedMouseButtons();

	@Generated
	@Selector("pressure")
	public native float pressure();

	@Generated
	@Selector("removeMonitor:")
	public static native void removeMonitor(
			@Mapped(ObjCObjectMapper.class) Object eventMonitor);

	@Generated
	@Selector("rotation")
	public native float rotation();

	@Generated
	@Selector("scrollingDeltaX")
	public native double scrollingDeltaX();

	@Generated
	@Selector("scrollingDeltaY")
	public native double scrollingDeltaY();

	@Generated
	@Selector("setMouseCoalescingEnabled:")
	public static native void setMouseCoalescingEnabled(boolean flag);

	@Generated
	@Selector("startPeriodicEventsAfterDelay:withPeriod:")
	public static native void startPeriodicEventsAfterDelayWithPeriod(
			double delay, double period);

	@Generated
	@Selector("stopPeriodicEvents")
	public static native void stopPeriodicEvents();

	@Generated
	@Selector("subtype")
	public native short subtype();

	@Generated
	@Selector("systemTabletID")
	public native long systemTabletID();

	@Generated
	@Selector("tabletID")
	public native long tabletID();

	@Generated
	@Selector("tangentialPressure")
	public native float tangentialPressure();

	@Generated
	@Selector("tilt")
	@ByValue
	public native CGPoint tilt();

	@Generated
	@Selector("timestamp")
	public native double timestamp();

	@Generated
	@Selector("touchesMatchingPhase:inView:")
	public native NSSet touchesMatchingPhaseInView(long phase, NSView view);

	@Generated
	@Selector("trackSwipeEventWithOptions:dampenAmountThresholdMin:max:usingHandler:")
	public native void trackSwipeEventWithOptionsDampenAmountThresholdMinMaxUsingHandler(
			long options,
			double minDampenThreshold,
			double maxDampenThreshold,
			@ObjCBlock(name = "call_trackSwipeEventWithOptionsDampenAmountThresholdMinMaxUsingHandler") Block_trackSwipeEventWithOptionsDampenAmountThresholdMinMaxUsingHandler trackingHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_trackSwipeEventWithOptionsDampenAmountThresholdMinMaxUsingHandler {
		@Generated
		public void call_trackSwipeEventWithOptionsDampenAmountThresholdMinMaxUsingHandler(
				double arg0, long arg1, boolean arg2, BoolPtr arg3);
	}

	@Generated
	@Selector("trackingArea")
	public native NSTrackingArea trackingArea();

	@Generated
	@Selector("trackingNumber")
	public native long trackingNumber();

	@Generated
	@Selector("type")
	public native long type();

	@Generated
	@Selector("uniqueID")
	public native long uniqueID();

	@Generated
	@Selector("userData")
	public native VoidPtr userData();

	@Generated
	@Selector("vendorDefined")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object vendorDefined();

	@Generated
	@Selector("vendorID")
	public native long vendorID();

	@Generated
	@Selector("vendorPointingDeviceType")
	public native long vendorPointingDeviceType();

	@Generated
	@Selector("window")
	public native NSWindow window();

	@Generated
	@Selector("windowNumber")
	public native long windowNumber();
}
