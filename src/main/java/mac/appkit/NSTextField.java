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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.appkit.protocol.NSUserInterfaceValidations;
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSNotification;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTextField extends NSControl implements
		NSUserInterfaceValidations {
	static {
		NatJ.register();
	}

	@Generated
	protected NSTextField(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("acceptsFirstResponder")
	public native boolean acceptsFirstResponder();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSTextField alloc();

	@Generated
	@Selector("allowsEditingTextAttributes")
	public native boolean allowsEditingTextAttributes();

	@Generated
	@Selector("backgroundColor")
	public native NSColor backgroundColor();

	@Generated
	@Selector("bezelStyle")
	public native long bezelStyle();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("drawsBackground")
	public native boolean drawsBackground();

	@Generated
	@Selector("importsGraphics")
	public native boolean importsGraphics();

	@Generated
	@Selector("init")
	public native NSTextField init();

	@Generated
	@Selector("initWithFrame:")
	public native NSTextField initWithFrame(@ByValue CGRect frameRect);

	@Generated
	@Selector("isBezeled")
	public native boolean isBezeled();

	@Generated
	@Selector("isBordered")
	public native boolean isBordered();

	@Generated
	@Selector("isEditable")
	public native boolean isEditable();

	@Generated
	@Selector("isSelectable")
	public native boolean isSelectable();

	@Generated
	@Selector("preferredMaxLayoutWidth")
	public native double preferredMaxLayoutWidth();

	@Generated
	@Selector("selectText:")
	public native void selectText(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("setAllowsEditingTextAttributes:")
	public native void setAllowsEditingTextAttributes(boolean flag);

	@Generated
	@Selector("setBackgroundColor:")
	public native void setBackgroundColor(NSColor color);

	@Generated
	@Selector("setBezelStyle:")
	public native void setBezelStyle(long style);

	@Generated
	@Selector("setBezeled:")
	public native void setBezeled(boolean flag);

	@Generated
	@Selector("setBordered:")
	public native void setBordered(boolean flag);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("setDrawsBackground:")
	public native void setDrawsBackground(boolean flag);

	@Generated
	@Selector("setEditable:")
	public native void setEditable(boolean flag);

	@Generated
	@Selector("setImportsGraphics:")
	public native void setImportsGraphics(boolean flag);

	@Generated
	@Selector("setPreferredMaxLayoutWidth:")
	public native void setPreferredMaxLayoutWidth(double width);

	@Generated
	@Selector("setSelectable:")
	public native void setSelectable(boolean flag);

	@Generated
	@Selector("setTextColor:")
	public native void setTextColor(NSColor color);

	@Generated
	@Selector("setTitleWithMnemonic:")
	public native void setTitleWithMnemonic(String stringWithAmpersand);

	@Generated
	@Selector("textColor")
	public native NSColor textColor();

	@Generated
	@Selector("textDidBeginEditing:")
	public native void textDidBeginEditing(NSNotification notification);

	@Generated
	@Selector("textDidChange:")
	public native void textDidChange(NSNotification notification);

	@Generated
	@Selector("textDidEndEditing:")
	public native void textDidEndEditing(NSNotification notification);

	@Generated
	@Selector("textShouldBeginEditing:")
	public native boolean textShouldBeginEditing(NSText textObject);

	@Generated
	@Selector("textShouldEndEditing:")
	public native boolean textShouldEndEditing(NSText textObject);

	@Generated
	@Selector("validateUserInterfaceItem:")
	public native boolean validateUserInterfaceItem(
			@Mapped(ObjCObjectMapper.class) Object anItem);
}
