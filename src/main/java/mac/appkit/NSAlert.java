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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.NSArray;
import mac.foundation.NSError;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSAlert extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSAlert(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessoryView")
	public native NSView accessoryView();

	@Generated
	@Selector("addButtonWithTitle:")
	public native NSButton addButtonWithTitle(String title);

	@Generated
	@Selector("alertStyle")
	public native long alertStyle();

	@Generated
	@Selector("alertWithError:")
	public static native NSAlert alertWithError(NSError error);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSAlert alloc();

	@Generated
	@Selector("beginSheetModalForWindow:completionHandler:")
	public native void beginSheetModalForWindowCompletionHandler(
			NSWindow sheetWindow,
			@ObjCBlock(name = "call_beginSheetModalForWindowCompletionHandler") Block_beginSheetModalForWindowCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_beginSheetModalForWindowCompletionHandler {
		@Generated
		public void call_beginSheetModalForWindowCompletionHandler(long arg0);
	}

	@Generated
	@Selector("beginSheetModalForWindow:modalDelegate:didEndSelector:contextInfo:")
	public native void beginSheetModalForWindowModalDelegateDidEndSelectorContextInfo(
			NSWindow window, @Mapped(ObjCObjectMapper.class) Object delegate,
			SEL didEndSelector, VoidPtr contextInfo);

	@Generated
	@Selector("buttons")
	public native NSArray buttons();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("helpAnchor")
	public native String helpAnchor();

	@Generated
	@Selector("icon")
	public native NSImage icon();

	@Generated
	@Selector("informativeText")
	public native String informativeText();

	@Generated
	@Selector("init")
	public native NSAlert init();

	@Generated
	@Selector("layout")
	public native void layout();

	@Generated
	@Selector("messageText")
	public native String messageText();

	@Generated
	@Selector("runModal")
	public native long runModal();

	@Generated
	@Selector("setAccessoryView:")
	public native void setAccessoryView(NSView view);

	@Generated
	@Selector("setAlertStyle:")
	public native void setAlertStyle(long style);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object delegate);

	@Generated
	@Selector("setHelpAnchor:")
	public native void setHelpAnchor(String anchor);

	@Generated
	@Selector("setIcon:")
	public native void setIcon(NSImage icon);

	@Generated
	@Selector("setInformativeText:")
	public native void setInformativeText(String informativeText);

	@Generated
	@Selector("setMessageText:")
	public native void setMessageText(String messageText);

	@Generated
	@Selector("setShowsHelp:")
	public native void setShowsHelp(boolean showsHelp);

	@Generated
	@Selector("setShowsSuppressionButton:")
	public native void setShowsSuppressionButton(boolean flag);

	@Generated
	@Selector("showsHelp")
	public native boolean showsHelp();

	@Generated
	@Selector("showsSuppressionButton")
	public native boolean showsSuppressionButton();

	@Generated
	@Selector("suppressionButton")
	public native NSButton suppressionButton();

	@Generated
	@Selector("window")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object window();
}
