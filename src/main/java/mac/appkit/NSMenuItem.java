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
import mac.NSObject;
import mac.appkit.protocol.NSValidatedUserInterfaceItem;
import mac.foundation.NSAttributedString;
import mac.foundation.NSCoder;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMenuItem extends NSObject implements NSCopying, NSCoding,
		NSValidatedUserInterfaceItem {
	static {
		NatJ.register();
	}

	@Generated
	protected NSMenuItem(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("action")
	public native SEL action();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSMenuItem alloc();

	@Generated
	@Selector("attributedTitle")
	public native NSAttributedString attributedTitle();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("hasSubmenu")
	public native boolean hasSubmenu();

	@Generated
	@Selector("image")
	public native NSImage image();

	@Generated
	@Selector("indentationLevel")
	public native long indentationLevel();

	@Generated
	@Selector("init")
	public native NSMenuItem init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithTitle:action:keyEquivalent:")
	public native NSMenuItem initWithTitleActionKeyEquivalent(String aString,
			SEL aSelector, String charCode);

	@Generated
	@Selector("isAlternate")
	public native boolean isAlternate();

	@Generated
	@Selector("isEnabled")
	public native boolean isEnabled();

	@Generated
	@Selector("isHidden")
	public native boolean isHidden();

	@Generated
	@Selector("isHiddenOrHasHiddenAncestor")
	public native boolean isHiddenOrHasHiddenAncestor();

	@Generated
	@Selector("isHighlighted")
	public native boolean isHighlighted();

	@Generated
	@Selector("isSeparatorItem")
	public native boolean isSeparatorItem();

	@Generated
	@Selector("keyEquivalent")
	public native String keyEquivalent();

	@Generated
	@Selector("keyEquivalentModifierMask")
	public native long keyEquivalentModifierMask();

	@Generated
	@Selector("menu")
	public native NSMenu menu();

	@Generated
	@Selector("mixedStateImage")
	public native NSImage mixedStateImage();

	@Generated
	@Selector("mnemonic")
	public native String mnemonic();

	@Generated
	@Selector("mnemonicLocation")
	public native long mnemonicLocation();

	@Generated
	@Selector("offStateImage")
	public native NSImage offStateImage();

	@Generated
	@Selector("onStateImage")
	public native NSImage onStateImage();

	@Generated
	@Selector("parentItem")
	public native NSMenuItem parentItem();

	@Generated
	@Selector("representedObject")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object representedObject();

	@Generated
	@Selector("separatorItem")
	public static native NSMenuItem separatorItem();

	@Generated
	@Selector("setAction:")
	public native void setAction(SEL aSelector);

	@Generated
	@Selector("setAlternate:")
	public native void setAlternate(boolean isAlternate);

	@Generated
	@Selector("setAttributedTitle:")
	public native void setAttributedTitle(NSAttributedString string);

	@Generated
	@Selector("setEnabled:")
	public native void setEnabled(boolean flag);

	@Generated
	@Selector("setHidden:")
	public native void setHidden(boolean hidden);

	@Generated
	@Selector("setImage:")
	public native void setImage(NSImage menuImage);

	@Generated
	@Selector("setIndentationLevel:")
	public native void setIndentationLevel(long indentationLevel);

	@Generated
	@Selector("setKeyEquivalent:")
	public native void setKeyEquivalent(String aKeyEquivalent);

	@Generated
	@Selector("setKeyEquivalentModifierMask:")
	public native void setKeyEquivalentModifierMask(long mask);

	@Generated
	@Selector("setMenu:")
	public native void setMenu(NSMenu menu);

	@Generated
	@Selector("setMixedStateImage:")
	public native void setMixedStateImage(NSImage image);

	@Generated
	@Selector("setMnemonicLocation:")
	public native void setMnemonicLocation(long location);

	@Generated
	@Selector("setOffStateImage:")
	public native void setOffStateImage(NSImage image);

	@Generated
	@Selector("setOnStateImage:")
	public native void setOnStateImage(NSImage image);

	@Generated
	@Selector("setRepresentedObject:")
	public native void setRepresentedObject(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("setState:")
	public native void setState(long state);

	@Generated
	@Selector("setSubmenu:")
	public native void setSubmenu(NSMenu submenu);

	@Generated
	@Selector("setTag:")
	public native void setTag(long anInt);

	@Generated
	@Selector("setTarget:")
	public native void setTarget(@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("setTitle:")
	public native void setTitle(String aString);

	@Generated
	@Selector("setTitleWithMnemonic:")
	public native void setTitleWithMnemonic(String stringWithAmpersand);

	@Generated
	@Selector("setToolTip:")
	public native void setToolTip(String toolTip);

	@Generated
	@Selector("setUsesUserKeyEquivalents:")
	public static native void setUsesUserKeyEquivalents(boolean flag);

	@Generated
	@Selector("setView:")
	public native void setView(NSView view);

	@Generated
	@Selector("state")
	public native long state();

	@Generated
	@Selector("submenu")
	public native NSMenu submenu();

	@Generated
	@Selector("tag")
	public native long tag();

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
	@Selector("userKeyEquivalent")
	public native String userKeyEquivalent();

	@Generated
	@Selector("usesUserKeyEquivalents")
	public static native boolean usesUserKeyEquivalents();

	@Generated
	@Selector("view")
	public native NSView view();
}
