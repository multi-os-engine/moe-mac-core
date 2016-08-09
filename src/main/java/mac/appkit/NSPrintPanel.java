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
import mac.foundation.NSArray;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPrintPanel extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSPrintPanel(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessoryControllers")
	public native NSArray accessoryControllers();

	@Generated
	@Selector("accessoryView")
	public native NSView accessoryView();

	@Generated
	@Selector("addAccessoryController:")
	public native void addAccessoryController(
			@Mapped(ObjCObjectMapper.class) Object accessoryController);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSPrintPanel alloc();

	@Generated
	@Selector("beginSheetWithPrintInfo:modalForWindow:delegate:didEndSelector:contextInfo:")
	public native void beginSheetWithPrintInfoModalForWindowDelegateDidEndSelectorContextInfo(
			NSPrintInfo printInfo, NSWindow docWindow,
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL didEndSelector, VoidPtr contextInfo);

	@Generated
	@Selector("defaultButtonTitle")
	public native String defaultButtonTitle();

	@Generated
	@Selector("finalWritePrintInfo")
	public native void finalWritePrintInfo();

	@Generated
	@Selector("helpAnchor")
	public native String helpAnchor();

	@Generated
	@Selector("init")
	public native NSPrintPanel init();

	@Generated
	@Selector("jobStyleHint")
	public native String jobStyleHint();

	@Generated
	@Selector("options")
	public native long options();

	@Generated
	@Selector("printInfo")
	public native NSPrintInfo printInfo();

	@Generated
	@Selector("printPanel")
	public static native NSPrintPanel printPanel();

	@Generated
	@Selector("removeAccessoryController:")
	public native void removeAccessoryController(
			@Mapped(ObjCObjectMapper.class) Object accessoryController);

	@Generated
	@Selector("runModal")
	public native long runModal();

	@Generated
	@Selector("runModalWithPrintInfo:")
	public native long runModalWithPrintInfo(NSPrintInfo printInfo);

	@Generated
	@Selector("setAccessoryView:")
	public native void setAccessoryView(NSView accessoryView);

	@Generated
	@Selector("setDefaultButtonTitle:")
	public native void setDefaultButtonTitle(String defaultButtonTitle);

	@Generated
	@Selector("setHelpAnchor:")
	public native void setHelpAnchor(String helpAnchor);

	@Generated
	@Selector("setJobStyleHint:")
	public native void setJobStyleHint(String hint);

	@Generated
	@Selector("setOptions:")
	public native void setOptions(long options);

	@Generated
	@Selector("updateFromPrintInfo")
	public native void updateFromPrintInfo();
}
