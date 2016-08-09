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
import mac.NSObject;
import mac.foundation.NSArray;
import mac.foundation.NSDictionary;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSToolbar extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSToolbar(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSToolbar alloc();

	@Generated
	@Selector("allowsUserCustomization")
	public native boolean allowsUserCustomization();

	@Generated
	@Selector("autosavesConfiguration")
	public native boolean autosavesConfiguration();

	@Generated
	@Selector("configurationDictionary")
	public native NSDictionary configurationDictionary();

	@Generated
	@Selector("customizationPaletteIsRunning")
	public native boolean customizationPaletteIsRunning();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("displayMode")
	public native long displayMode();

	@Generated
	@Selector("fullScreenAccessoryView")
	public native NSView fullScreenAccessoryView();

	@Generated
	@Selector("fullScreenAccessoryViewMaxHeight")
	public native double fullScreenAccessoryViewMaxHeight();

	@Generated
	@Selector("fullScreenAccessoryViewMinHeight")
	public native double fullScreenAccessoryViewMinHeight();

	@Generated
	@Selector("identifier")
	public native String identifier();

	@Generated
	@Selector("init")
	public native NSToolbar init();

	@Generated
	@Selector("initWithIdentifier:")
	public native NSToolbar initWithIdentifier(String identifier);

	@Generated
	@Selector("insertItemWithItemIdentifier:atIndex:")
	public native void insertItemWithItemIdentifierAtIndex(
			String itemIdentifier, long index);

	@Generated
	@Selector("isVisible")
	public native boolean isVisible();

	@Generated
	@Selector("items")
	public native NSArray items();

	@Generated
	@Selector("removeItemAtIndex:")
	public native void removeItemAtIndex(long index);

	@Generated
	@Selector("runCustomizationPalette:")
	public native void runCustomizationPalette(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("selectedItemIdentifier")
	public native String selectedItemIdentifier();

	@Generated
	@Selector("setAllowsUserCustomization:")
	public native void setAllowsUserCustomization(boolean allowCustomization);

	@Generated
	@Selector("setAutosavesConfiguration:")
	public native void setAutosavesConfiguration(boolean flag);

	@Generated
	@Selector("setConfigurationFromDictionary:")
	public native void setConfigurationFromDictionary(NSDictionary configDict);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object delegate);

	@Generated
	@Selector("setDisplayMode:")
	public native void setDisplayMode(long displayMode);

	@Generated
	@Selector("setFullScreenAccessoryView:")
	public native void setFullScreenAccessoryView(NSView view);

	@Generated
	@Selector("setFullScreenAccessoryViewMaxHeight:")
	public native void setFullScreenAccessoryViewMaxHeight(double maxHeight);

	@Generated
	@Selector("setFullScreenAccessoryViewMinHeight:")
	public native void setFullScreenAccessoryViewMinHeight(double minHeight);

	@Generated
	@Selector("setSelectedItemIdentifier:")
	public native void setSelectedItemIdentifier(String itemIdentifier);

	@Generated
	@Selector("setShowsBaselineSeparator:")
	public native void setShowsBaselineSeparator(boolean flag);

	@Generated
	@Selector("setSizeMode:")
	public native void setSizeMode(long sizeMode);

	@Generated
	@Selector("setVisible:")
	public native void setVisible(boolean shown);

	@Generated
	@Selector("showsBaselineSeparator")
	public native boolean showsBaselineSeparator();

	@Generated
	@Selector("sizeMode")
	public native long sizeMode();

	@Generated
	@Selector("validateVisibleItems")
	public native void validateVisibleItems();

	@Generated
	@Selector("visibleItems")
	public native NSArray visibleItems();
}
