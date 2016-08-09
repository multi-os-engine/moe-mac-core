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
import mac.coregraphics.struct.CGSize;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSToolbarItem extends NSObject implements NSCopying,
		NSValidatedUserInterfaceItem {
	static {
		NatJ.register();
	}

	@Generated
	protected NSToolbarItem(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("action")
	public native SEL action();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSToolbarItem alloc();

	@Generated
	@Selector("allowsDuplicatesInToolbar")
	public native boolean allowsDuplicatesInToolbar();

	@Generated
	@Selector("autovalidates")
	public native boolean autovalidates();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("image")
	public native NSImage image();

	@Generated
	@Selector("init")
	public native NSToolbarItem init();

	@Generated
	@Selector("initWithItemIdentifier:")
	public native NSToolbarItem initWithItemIdentifier(String itemIdentifier);

	@Generated
	@Selector("isEnabled")
	public native boolean isEnabled();

	@Generated
	@Selector("itemIdentifier")
	public native String itemIdentifier();

	@Generated
	@Selector("label")
	public native String label();

	@Generated
	@Selector("maxSize")
	@ByValue
	public native CGSize maxSize();

	@Generated
	@Selector("menuFormRepresentation")
	public native NSMenuItem menuFormRepresentation();

	@Generated
	@Selector("minSize")
	@ByValue
	public native CGSize minSize();

	@Generated
	@Selector("paletteLabel")
	public native String paletteLabel();

	@Generated
	@Selector("setAction:")
	public native void setAction(SEL action);

	@Generated
	@Selector("setAutovalidates:")
	public native void setAutovalidates(boolean resistance);

	@Generated
	@Selector("setEnabled:")
	public native void setEnabled(boolean enabled);

	@Generated
	@Selector("setImage:")
	public native void setImage(NSImage image);

	@Generated
	@Selector("setLabel:")
	public native void setLabel(String label);

	@Generated
	@Selector("setMaxSize:")
	public native void setMaxSize(@ByValue CGSize size);

	@Generated
	@Selector("setMenuFormRepresentation:")
	public native void setMenuFormRepresentation(NSMenuItem menuItem);

	@Generated
	@Selector("setMinSize:")
	public native void setMinSize(@ByValue CGSize size);

	@Generated
	@Selector("setPaletteLabel:")
	public native void setPaletteLabel(String paletteLabel);

	@Generated
	@Selector("setTag:")
	public native void setTag(long tag);

	@Generated
	@Selector("setTarget:")
	public native void setTarget(@Mapped(ObjCObjectMapper.class) Object target);

	@Generated
	@Selector("setToolTip:")
	public native void setToolTip(String toolTip);

	@Generated
	@Selector("setView:")
	public native void setView(NSView view);

	@Generated
	@Selector("setVisibilityPriority:")
	public native void setVisibilityPriority(long visibilityPriority);

	@Generated
	@Selector("tag")
	public native long tag();

	@Generated
	@Selector("target")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object target();

	@Generated
	@Selector("toolTip")
	public native String toolTip();

	@Generated
	@Selector("toolbar")
	public native NSToolbar toolbar();

	@Generated
	@Selector("validate")
	public native void validate();

	@Generated
	@Selector("view")
	public native NSView view();

	@Generated
	@Selector("visibilityPriority")
	public native long visibilityPriority();
}
