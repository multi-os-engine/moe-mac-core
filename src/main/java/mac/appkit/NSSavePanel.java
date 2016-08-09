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
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSArray;
import mac.foundation.NSURL;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSSavePanel extends NSPanel {
	static {
		NatJ.register();
	}

	@Generated
	protected NSSavePanel(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("URL")
	public native NSURL URL();

	@Generated
	@Selector("accessoryView")
	public native NSView accessoryView();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSSavePanel alloc();

	@Generated
	@Selector("allowedFileTypes")
	public native NSArray allowedFileTypes();

	@Generated
	@Selector("allowsOtherFileTypes")
	public native boolean allowsOtherFileTypes();

	@Generated
	@Selector("beginSheetForDirectory:file:modalForWindow:modalDelegate:didEndSelector:contextInfo:")
	public native void beginSheetForDirectoryFileModalForWindowModalDelegateDidEndSelectorContextInfo(
			String path, String name, NSWindow docWindow,
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL didEndSelector, VoidPtr contextInfo);

	@Generated
	@Selector("beginSheetModalForWindow:completionHandler:")
	public native void beginSheetModalForWindowCompletionHandler(
			NSWindow window,
			@ObjCBlock(name = "call_beginSheetModalForWindowCompletionHandler") Block_beginSheetModalForWindowCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_beginSheetModalForWindowCompletionHandler {
		@Generated
		public void call_beginSheetModalForWindowCompletionHandler(long arg0);
	}

	@Generated
	@Selector("beginWithCompletionHandler:")
	public native void beginWithCompletionHandler(
			@ObjCBlock(name = "call_beginWithCompletionHandler") Block_beginWithCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_beginWithCompletionHandler {
		@Generated
		public void call_beginWithCompletionHandler(long arg0);
	}

	@Generated
	@Selector("canCreateDirectories")
	public native boolean canCreateDirectories();

	@Generated
	@Selector("canSelectHiddenExtension")
	public native boolean canSelectHiddenExtension();

	@Generated
	@Selector("cancel:")
	public native void cancel(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("directory")
	public native String directory();

	@Generated
	@Selector("directoryURL")
	public native NSURL directoryURL();

	@Generated
	@Selector("filename")
	public native String filename();

	@Generated
	@Selector("init")
	public native NSSavePanel init();

	@Generated
	@Selector("initWithContentRect:styleMask:backing:defer:")
	public native NSSavePanel initWithContentRectStyleMaskBackingDefer(
			@ByValue CGRect contentRect, long aStyle, long bufferingType,
			boolean flag);

	@Generated
	@Selector("initWithContentRect:styleMask:backing:defer:screen:")
	public native NSSavePanel initWithContentRectStyleMaskBackingDeferScreen(
			@ByValue CGRect contentRect, long aStyle, long bufferingType,
			boolean flag, NSScreen screen);

	@Generated
	@Selector("initWithWindowRef:")
	public native NSWindow initWithWindowRef(VoidPtr windowRef);

	@Generated
	@Selector("isExpanded")
	public native boolean isExpanded();

	@Generated
	@Selector("isExtensionHidden")
	public native boolean isExtensionHidden();

	@Generated
	@Selector("message")
	public native String message();

	@Generated
	@Selector("nameFieldLabel")
	public native String nameFieldLabel();

	@Generated
	@Selector("nameFieldStringValue")
	public native String nameFieldStringValue();

	@Generated
	@Selector("ok:")
	public native void ok(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("prompt")
	public native String prompt();

	@Generated
	@Selector("requiredFileType")
	public native String requiredFileType();

	@Generated
	@Selector("runModal")
	public native long runModal();

	@Generated
	@Selector("runModalForDirectory:file:")
	public native long runModalForDirectoryFile(String path, String name);

	@Generated
	@Selector("savePanel")
	public static native NSSavePanel savePanel();

	@Generated
	@Selector("selectText:")
	public native void selectText(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("setAccessoryView:")
	public native void setAccessoryView(NSView view);

	@Generated
	@Selector("setAllowedFileTypes:")
	public native void setAllowedFileTypes(NSArray types);

	@Generated
	@Selector("setAllowsOtherFileTypes:")
	public native void setAllowsOtherFileTypes(boolean flag);

	@Generated
	@Selector("setCanCreateDirectories:")
	public native void setCanCreateDirectories(boolean flag);

	@Generated
	@Selector("setCanSelectHiddenExtension:")
	public native void setCanSelectHiddenExtension(boolean flag);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object delegate);

	@Generated
	@Selector("setDirectory:")
	public native void setDirectory(String path);

	@Generated
	@Selector("setDirectoryURL:")
	public native void setDirectoryURL(NSURL url);

	@Generated
	@Selector("setExtensionHidden:")
	public native void setExtensionHidden(boolean flag);

	@Generated
	@Selector("setMessage:")
	public native void setMessage(String message);

	@Generated
	@Selector("setNameFieldLabel:")
	public native void setNameFieldLabel(String label);

	@Generated
	@Selector("setNameFieldStringValue:")
	public native void setNameFieldStringValue(String value);

	@Generated
	@Selector("setPrompt:")
	public native void setPrompt(String prompt);

	@Generated
	@Selector("setRequiredFileType:")
	public native void setRequiredFileType(String type);

	@Generated
	@Selector("setShowsHiddenFiles:")
	public native void setShowsHiddenFiles(boolean flag);

	@Generated
	@Selector("setShowsTagField:")
	public native void setShowsTagField(boolean flag);

	@Generated
	@Selector("setTagNames:")
	public native void setTagNames(NSArray tagNames);

	@Generated
	@Selector("setTitle:")
	public native void setTitle(String title);

	@Generated
	@Selector("setTreatsFilePackagesAsDirectories:")
	public native void setTreatsFilePackagesAsDirectories(boolean flag);

	@Generated
	@Selector("showsHiddenFiles")
	public native boolean showsHiddenFiles();

	@Generated
	@Selector("showsTagField")
	public native boolean showsTagField();

	@Generated
	@Selector("tagNames")
	public native NSArray tagNames();

	@Generated
	@Selector("title")
	public native String title();

	@Generated
	@Selector("treatsFilePackagesAsDirectories")
	public native boolean treatsFilePackagesAsDirectories();

	@Generated
	@Selector("validateVisibleColumns")
	public native void validateVisibleColumns();

	@Generated
	@Selector("windowNumberAtPoint:belowWindowWithWindowNumber:")
	public static native long windowNumberAtPointBelowWindowWithWindowNumber(
			@ByValue CGPoint point, long windowNumber);

	@Generated
	@Selector("windowNumbersWithOptions:")
	public static native NSArray windowNumbersWithOptions(long options);
}
