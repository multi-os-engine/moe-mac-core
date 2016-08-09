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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSArray;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSColorPanel extends NSPanel {
	static {
		NatJ.register();
	}

	@Generated
	protected NSColorPanel(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessoryView")
	public native NSView accessoryView();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSColorPanel alloc();

	@Generated
	@Selector("alpha")
	public native double alpha();

	@Generated
	@Selector("attachColorList:")
	public native void attachColorList(NSColorList colorList);

	@Generated
	@Selector("color")
	public native NSColor color();

	@Generated
	@Selector("detachColorList:")
	public native void detachColorList(NSColorList colorList);

	@Generated
	@Selector("dragColor:withEvent:fromView:")
	public static native boolean dragColorWithEventFromView(NSColor color,
			NSEvent theEvent, NSView sourceView);

	@Generated
	@Selector("init")
	public native NSColorPanel init();

	@Generated
	@Selector("initWithContentRect:styleMask:backing:defer:")
	public native NSColorPanel initWithContentRectStyleMaskBackingDefer(
			@ByValue CGRect contentRect, long aStyle, long bufferingType,
			boolean flag);

	@Generated
	@Selector("initWithContentRect:styleMask:backing:defer:screen:")
	public native NSColorPanel initWithContentRectStyleMaskBackingDeferScreen(
			@ByValue CGRect contentRect, long aStyle, long bufferingType,
			boolean flag, NSScreen screen);

	@Generated
	@Selector("initWithWindowRef:")
	public native NSWindow initWithWindowRef(VoidPtr windowRef);

	@Generated
	@Selector("isContinuous")
	public native boolean isContinuous();

	@Generated
	@Selector("mode")
	public native long mode();

	@Generated
	@Selector("setAccessoryView:")
	public native void setAccessoryView(NSView aView);

	@Generated
	@Selector("setAction:")
	public native void setAction(SEL aSelector);

	@Generated
	@Selector("setColor:")
	public native void setColor(NSColor color);

	@Generated
	@Selector("setContinuous:")
	public native void setContinuous(boolean flag);

	@Generated
	@Selector("setMode:")
	public native void setMode(long mode);

	@Generated
	@Selector("setPickerMask:")
	public static native void setPickerMask(long mask);

	@Generated
	@Selector("setPickerMode:")
	public static native void setPickerMode(long mode);

	@Generated
	@Selector("setShowsAlpha:")
	public native void setShowsAlpha(boolean flag);

	@Generated
	@Selector("setTarget:")
	public native void setTarget(@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("sharedColorPanel")
	public static native NSColorPanel sharedColorPanel();

	@Generated
	@Selector("sharedColorPanelExists")
	public static native boolean sharedColorPanelExists();

	@Generated
	@Selector("showsAlpha")
	public native boolean showsAlpha();

	@Generated
	@Selector("windowNumberAtPoint:belowWindowWithWindowNumber:")
	public static native long windowNumberAtPointBelowWindowWithWindowNumber(
			@ByValue CGPoint point, long windowNumber);

	@Generated
	@Selector("windowNumbersWithOptions:")
	public static native NSArray windowNumbersWithOptions(long options);
}
