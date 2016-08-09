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
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.appkit.protocol.NSUserInterfaceValidations;
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSAttributedString;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSButton extends NSControl implements NSUserInterfaceValidations {
	static {
		NatJ.register();
	}

	@Generated
	protected NSButton(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSButton alloc();

	@Generated
	@Selector("allowsMixedState")
	public native boolean allowsMixedState();

	@Generated
	@Selector("alternateImage")
	public native NSImage alternateImage();

	@Generated
	@Selector("alternateTitle")
	public native String alternateTitle();

	@Generated
	@Selector("attributedAlternateTitle")
	public native NSAttributedString attributedAlternateTitle();

	@Generated
	@Selector("attributedTitle")
	public native NSAttributedString attributedTitle();

	@Generated
	@Selector("bezelStyle")
	public native long bezelStyle();

	@Generated
	@Selector("getPeriodicDelay:interval:")
	public native void getPeriodicDelayInterval(FloatPtr delay,
			FloatPtr interval);

	@Generated
	@Selector("highlight:")
	public native void highlight(boolean flag);

	@Generated
	@Selector("image")
	public native NSImage image();

	@Generated
	@Selector("imagePosition")
	public native long imagePosition();

	@Generated
	@Selector("init")
	public native NSButton init();

	@Generated
	@Selector("initWithFrame:")
	public native NSButton initWithFrame(@ByValue CGRect frameRect);

	@Generated
	@Selector("isBordered")
	public native boolean isBordered();

	@Generated
	@Selector("isTransparent")
	public native boolean isTransparent();

	@Generated
	@Selector("keyEquivalent")
	public native String keyEquivalent();

	@Generated
	@Selector("keyEquivalentModifierMask")
	public native long keyEquivalentModifierMask();

	@Generated
	@Selector("performKeyEquivalent:")
	public native boolean performKeyEquivalent(NSEvent key);

	@Generated
	@Selector("setAllowsMixedState:")
	public native void setAllowsMixedState(boolean flag);

	@Generated
	@Selector("setAlternateImage:")
	public native void setAlternateImage(NSImage image);

	@Generated
	@Selector("setAlternateTitle:")
	public native void setAlternateTitle(String aString);

	@Generated
	@Selector("setAttributedAlternateTitle:")
	public native void setAttributedAlternateTitle(NSAttributedString obj);

	@Generated
	@Selector("setAttributedTitle:")
	public native void setAttributedTitle(NSAttributedString aString);

	@Generated
	@Selector("setBezelStyle:")
	public native void setBezelStyle(long bezelStyle);

	@Generated
	@Selector("setBordered:")
	public native void setBordered(boolean flag);

	@Generated
	@Selector("setButtonType:")
	public native void setButtonType(long aType);

	@Generated
	@Selector("setImage:")
	public native void setImage(NSImage image);

	@Generated
	@Selector("setImagePosition:")
	public native void setImagePosition(long aPosition);

	@Generated
	@Selector("setKeyEquivalent:")
	public native void setKeyEquivalent(String charCode);

	@Generated
	@Selector("setKeyEquivalentModifierMask:")
	public native void setKeyEquivalentModifierMask(long mask);

	@Generated
	@Selector("setNextState")
	public native void setNextState();

	@Generated
	@Selector("setPeriodicDelay:interval:")
	public native void setPeriodicDelayInterval(float delay, float interval);

	@Generated
	@Selector("setShowsBorderOnlyWhileMouseInside:")
	public native void setShowsBorderOnlyWhileMouseInside(boolean show);

	@Generated
	@Selector("setSound:")
	public native void setSound(NSSound aSound);

	@Generated
	@Selector("setState:")
	public native void setState(long value);

	@Generated
	@Selector("setTitle:")
	public native void setTitle(String aString);

	@Generated
	@Selector("setTitleWithMnemonic:")
	public native void setTitleWithMnemonic(String stringWithAmpersand);

	@Generated
	@Selector("setTransparent:")
	public native void setTransparent(boolean flag);

	@Generated
	@Selector("showsBorderOnlyWhileMouseInside")
	public native boolean showsBorderOnlyWhileMouseInside();

	@Generated
	@Selector("sound")
	public native NSSound sound();

	@Generated
	@Selector("state")
	public native long state();

	@Generated
	@Selector("title")
	public native String title();

	@Generated
	@Selector("validateUserInterfaceItem:")
	public native boolean validateUserInterfaceItem(
			@Mapped(ObjCObjectMapper.class) Object anItem);
}
