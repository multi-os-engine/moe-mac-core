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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSArray;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSFontPanel extends NSPanel {
	static {
		NatJ.register();
	}

	@Generated
	protected NSFontPanel(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessoryView")
	public native NSView accessoryView();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSFontPanel alloc();

	@Generated
	@Selector("init")
	public native NSFontPanel init();

	@Generated
	@Selector("initWithContentRect:styleMask:backing:defer:")
	public native NSFontPanel initWithContentRectStyleMaskBackingDefer(
			@ByValue CGRect contentRect, long aStyle, long bufferingType,
			boolean flag);

	@Generated
	@Selector("initWithContentRect:styleMask:backing:defer:screen:")
	public native NSFontPanel initWithContentRectStyleMaskBackingDeferScreen(
			@ByValue CGRect contentRect, long aStyle, long bufferingType,
			boolean flag, NSScreen screen);

	@Generated
	@Selector("initWithWindowRef:")
	public native NSWindow initWithWindowRef(VoidPtr windowRef);

	@Generated
	@Selector("isEnabled")
	public native boolean isEnabled();

	@Generated
	@Selector("panelConvertFont:")
	public native NSFont panelConvertFont(NSFont fontObj);

	@Generated
	@Selector("reloadDefaultFontFamilies")
	public native void reloadDefaultFontFamilies();

	@Generated
	@Selector("setAccessoryView:")
	public native void setAccessoryView(NSView aView);

	@Generated
	@Selector("setEnabled:")
	public native void setEnabled(boolean flag);

	@Generated
	@Selector("setPanelFont:isMultiple:")
	public native void setPanelFontIsMultiple(NSFont fontObj, boolean flag);

	@Generated
	@Selector("sharedFontPanel")
	public static native NSFontPanel sharedFontPanel();

	@Generated
	@Selector("sharedFontPanelExists")
	public static native boolean sharedFontPanelExists();

	@Generated
	@Selector("windowNumberAtPoint:belowWindowWithWindowNumber:")
	public static native long windowNumberAtPointBelowWindowWithWindowNumber(
			@ByValue CGPoint point, long windowNumber);

	@Generated
	@Selector("windowNumbersWithOptions:")
	public static native NSArray windowNumbersWithOptions(long options);

	@Generated
	@Selector("worksWhenModal")
	public native boolean worksWhenModal();
}
