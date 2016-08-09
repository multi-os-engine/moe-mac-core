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
public class NSOpenPanel extends NSSavePanel {
	static {
		NatJ.register();
	}

	@Generated
	protected NSOpenPanel(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("URLs")
	public native NSArray URLs();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSOpenPanel alloc();

	@Generated
	@Selector("allowsMultipleSelection")
	public native boolean allowsMultipleSelection();

	@Generated
	@Selector("beginForDirectory:file:types:modelessDelegate:didEndSelector:contextInfo:")
	public native void beginForDirectoryFileTypesModelessDelegateDidEndSelectorContextInfo(
			String path, String name, NSArray fileTypes,
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL didEndSelector, VoidPtr contextInfo);

	@Generated
	@Selector("beginSheetForDirectory:file:types:modalForWindow:modalDelegate:didEndSelector:contextInfo:")
	public native void beginSheetForDirectoryFileTypesModalForWindowModalDelegateDidEndSelectorContextInfo(
			String path, String name, NSArray fileTypes, NSWindow docWindow,
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL didEndSelector, VoidPtr contextInfo);

	@Generated
	@Selector("canChooseDirectories")
	public native boolean canChooseDirectories();

	@Generated
	@Selector("canChooseFiles")
	public native boolean canChooseFiles();

	@Generated
	@Selector("filenames")
	public native NSArray filenames();

	@Generated
	@Selector("init")
	public native NSOpenPanel init();

	@Generated
	@Selector("initWithContentRect:styleMask:backing:defer:")
	public native NSOpenPanel initWithContentRectStyleMaskBackingDefer(
			@ByValue CGRect contentRect, long aStyle, long bufferingType,
			boolean flag);

	@Generated
	@Selector("initWithContentRect:styleMask:backing:defer:screen:")
	public native NSOpenPanel initWithContentRectStyleMaskBackingDeferScreen(
			@ByValue CGRect contentRect, long aStyle, long bufferingType,
			boolean flag, NSScreen screen);

	@Generated
	@Selector("initWithWindowRef:")
	public native NSWindow initWithWindowRef(VoidPtr windowRef);

	@Generated
	@Selector("openPanel")
	public static native NSOpenPanel openPanel();

	@Generated
	@Selector("resolvesAliases")
	public native boolean resolvesAliases();

	@Generated
	@Selector("runModalForDirectory:file:types:")
	public native long runModalForDirectoryFileTypes(String path, String name,
			NSArray fileTypes);

	@Generated
	@Selector("runModalForTypes:")
	public native long runModalForTypes(NSArray fileTypes);

	@Generated
	@Selector("savePanel")
	public static native NSSavePanel savePanel();

	@Generated
	@Selector("setAllowsMultipleSelection:")
	public native void setAllowsMultipleSelection(boolean flag);

	@Generated
	@Selector("setCanChooseDirectories:")
	public native void setCanChooseDirectories(boolean flag);

	@Generated
	@Selector("setCanChooseFiles:")
	public native void setCanChooseFiles(boolean flag);

	@Generated
	@Selector("setResolvesAliases:")
	public native void setResolvesAliases(boolean flag);

	@Generated
	@Selector("windowNumberAtPoint:belowWindowWithWindowNumber:")
	public static native long windowNumberAtPointBelowWindowWithWindowNumber(
			@ByValue CGPoint point, long windowNumber);

	@Generated
	@Selector("windowNumbersWithOptions:")
	public static native NSArray windowNumbersWithOptions(long options);
}
