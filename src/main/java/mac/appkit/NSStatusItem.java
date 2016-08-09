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
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSAttributedString;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSStatusItem extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSStatusItem(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("action")
	public native SEL action();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSStatusItem alloc();

	@Generated
	@Selector("alternateImage")
	public native NSImage alternateImage();

	@Generated
	@Selector("attributedTitle")
	public native NSAttributedString attributedTitle();

	@Generated
	@Selector("doubleAction")
	public native SEL doubleAction();

	@Generated
	@Selector("drawStatusBarBackgroundInRect:withHighlight:")
	public native void drawStatusBarBackgroundInRectWithHighlight(
			@ByValue CGRect rect, boolean highlight);

	@Generated
	@Selector("highlightMode")
	public native boolean highlightMode();

	@Generated
	@Selector("image")
	public native NSImage image();

	@Generated
	@Selector("init")
	public native NSStatusItem init();

	@Generated
	@Selector("isEnabled")
	public native boolean isEnabled();

	@Generated
	@Selector("length")
	public native double length();

	@Generated
	@Selector("menu")
	public native NSMenu menu();

	@Generated
	@Selector("popUpStatusItemMenu:")
	public native void popUpStatusItemMenu(NSMenu menu);

	@Generated
	@Selector("sendActionOn:")
	public native long sendActionOn(long mask);

	@Generated
	@Selector("setAction:")
	public native void setAction(SEL action);

	@Generated
	@Selector("setAlternateImage:")
	public native void setAlternateImage(NSImage image);

	@Generated
	@Selector("setAttributedTitle:")
	public native void setAttributedTitle(NSAttributedString title);

	@Generated
	@Selector("setDoubleAction:")
	public native void setDoubleAction(SEL action);

	@Generated
	@Selector("setEnabled:")
	public native void setEnabled(boolean enabled);

	@Generated
	@Selector("setHighlightMode:")
	public native void setHighlightMode(boolean highlightMode);

	@Generated
	@Selector("setImage:")
	public native void setImage(NSImage image);

	@Generated
	@Selector("setLength:")
	public native void setLength(double length);

	@Generated
	@Selector("setMenu:")
	public native void setMenu(NSMenu menu);

	@Generated
	@Selector("setTarget:")
	public native void setTarget(@Mapped(ObjCObjectMapper.class) Object target);

	@Generated
	@Selector("setTitle:")
	public native void setTitle(String title);

	@Generated
	@Selector("setToolTip:")
	public native void setToolTip(String toolTip);

	@Generated
	@Selector("setView:")
	public native void setView(NSView view);

	@Generated
	@Selector("statusBar")
	public native NSStatusBar statusBar();

	@Generated
	@Selector("target")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object target();

	@Generated
	@Selector("title")
	public native String title();

	@Generated
	@Selector("toolTip")
	public native String toolTip();

	@Generated
	@Selector("view")
	public native NSView view();
}
