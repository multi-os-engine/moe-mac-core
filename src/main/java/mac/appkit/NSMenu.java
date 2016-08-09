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
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGSize;
import mac.foundation.NSArray;
import mac.foundation.NSCoder;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMenu extends NSObject implements NSCopying, NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSMenu(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addItem:")
	public native void addItem(NSMenuItem newItem);

	@Generated
	@Selector("addItemWithTitle:action:keyEquivalent:")
	public native NSMenuItem addItemWithTitleActionKeyEquivalent(
			String aString, SEL aSelector, String charCode);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSMenu alloc();

	@Generated
	@Selector("allowsContextMenuPlugIns")
	public native boolean allowsContextMenuPlugIns();

	@Generated
	@Selector("attachedMenu")
	public native NSMenu attachedMenu();

	@Generated
	@Selector("autoenablesItems")
	public native boolean autoenablesItems();

	@Generated
	@Selector("cancelTracking")
	public native void cancelTracking();

	@Generated
	@Selector("cancelTrackingWithoutAnimation")
	public native void cancelTrackingWithoutAnimation();

	@Generated
	@Selector("contextMenuRepresentation")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object contextMenuRepresentation();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("font")
	public native NSFont font();

	@Generated
	@Selector("helpRequested:")
	public native void helpRequested(NSEvent eventPtr);

	@Generated
	@Selector("highlightedItem")
	public native NSMenuItem highlightedItem();

	@Generated
	@Selector("indexOfItem:")
	public native long indexOfItem(NSMenuItem index);

	@Generated
	@Selector("indexOfItemWithRepresentedObject:")
	public native long indexOfItemWithRepresentedObject(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("indexOfItemWithSubmenu:")
	public native long indexOfItemWithSubmenu(NSMenu submenu);

	@Generated
	@Selector("indexOfItemWithTag:")
	public native long indexOfItemWithTag(long aTag);

	@Generated
	@Selector("indexOfItemWithTarget:andAction:")
	public native long indexOfItemWithTargetAndAction(
			@Mapped(ObjCObjectMapper.class) Object target, SEL actionSelector);

	@Generated
	@Selector("indexOfItemWithTitle:")
	public native long indexOfItemWithTitle(String aTitle);

	@Generated
	@Selector("init")
	public native NSMenu init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithTitle:")
	public native NSMenu initWithTitle(String aTitle);

	@Generated
	@Selector("insertItem:atIndex:")
	public native void insertItemAtIndex(NSMenuItem newItem, long index);

	@Generated
	@Selector("insertItemWithTitle:action:keyEquivalent:atIndex:")
	public native NSMenuItem insertItemWithTitleActionKeyEquivalentAtIndex(
			String aString, SEL aSelector, String charCode, long index);

	@Generated
	@Selector("isAttached")
	public native boolean isAttached();

	@Generated
	@Selector("isTornOff")
	public native boolean isTornOff();

	@Generated
	@Selector("itemArray")
	public native NSArray itemArray();

	@Generated
	@Selector("itemAtIndex:")
	public native NSMenuItem itemAtIndex(long index);

	@Generated
	@Selector("itemChanged:")
	public native void itemChanged(NSMenuItem item);

	@Generated
	@Selector("itemWithTag:")
	public native NSMenuItem itemWithTag(long tag);

	@Generated
	@Selector("itemWithTitle:")
	public native NSMenuItem itemWithTitle(String aTitle);

	@Generated
	@Selector("locationForSubmenu:")
	@ByValue
	public native CGPoint locationForSubmenu(NSMenu aSubmenu);

	@Generated
	@Selector("menuBarHeight")
	public native double menuBarHeight();

	@Generated
	@Selector("menuBarVisible")
	public static native boolean menuBarVisible();

	@Generated
	@Selector("menuChangedMessagesEnabled")
	public native boolean menuChangedMessagesEnabled();

	@Generated
	@Selector("menuRepresentation")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object menuRepresentation();

	@Generated
	@Selector("menuZone")
	public static native VoidPtr menuZone();

	@Generated
	@Selector("minimumWidth")
	public native double minimumWidth();

	@Generated
	@Selector("numberOfItems")
	public native long numberOfItems();

	@Generated
	@Selector("performActionForItemAtIndex:")
	public native void performActionForItemAtIndex(long index);

	@Generated
	@Selector("performKeyEquivalent:")
	public native boolean performKeyEquivalent(NSEvent theEvent);

	@Generated
	@Selector("popUpContextMenu:withEvent:forView:")
	public static native void popUpContextMenuWithEventForView(NSMenu menu,
			NSEvent event, NSView view);

	@Generated
	@Selector("popUpContextMenu:withEvent:forView:withFont:")
	public static native void popUpContextMenuWithEventForViewWithFont(
			NSMenu menu, NSEvent event, NSView view, NSFont font);

	@Generated
	@Selector("popUpMenuPositioningItem:atLocation:inView:")
	public native boolean popUpMenuPositioningItemAtLocationInView(
			NSMenuItem item, @ByValue CGPoint location, NSView view);

	@Generated
	@Selector("propertiesToUpdate")
	public native long propertiesToUpdate();

	@Generated
	@Selector("removeAllItems")
	public native void removeAllItems();

	@Generated
	@Selector("removeItem:")
	public native void removeItem(NSMenuItem item);

	@Generated
	@Selector("removeItemAtIndex:")
	public native void removeItemAtIndex(long index);

	@Generated
	@Selector("setAllowsContextMenuPlugIns:")
	public native void setAllowsContextMenuPlugIns(boolean allows);

	@Generated
	@Selector("setAutoenablesItems:")
	public native void setAutoenablesItems(boolean flag);

	@Generated
	@Selector("setContextMenuRepresentation:")
	public native void setContextMenuRepresentation(
			@Mapped(ObjCObjectMapper.class) Object menuRep);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("setFont:")
	public native void setFont(NSFont font);

	@Generated
	@Selector("setMenuBarVisible:")
	public static native void setMenuBarVisible(boolean visible);

	@Generated
	@Selector("setMenuChangedMessagesEnabled:")
	public native void setMenuChangedMessagesEnabled(boolean flag);

	@Generated
	@Selector("setMenuRepresentation:")
	public native void setMenuRepresentation(
			@Mapped(ObjCObjectMapper.class) Object menuRep);

	@Generated
	@Selector("setMenuZone:")
	public static native void setMenuZone(VoidPtr aZone);

	@Generated
	@Selector("setMinimumWidth:")
	public native void setMinimumWidth(double width);

	@Generated
	@Selector("setShowsStateColumn:")
	public native void setShowsStateColumn(boolean showsState);

	@Generated
	@Selector("setSubmenu:forItem:")
	public native void setSubmenuForItem(NSMenu aMenu, NSMenuItem anItem);

	@Generated
	@Selector("setSupermenu:")
	public native void setSupermenu(NSMenu supermenu);

	@Generated
	@Selector("setTearOffMenuRepresentation:")
	public native void setTearOffMenuRepresentation(
			@Mapped(ObjCObjectMapper.class) Object menuRep);

	@Generated
	@Selector("setTitle:")
	public native void setTitle(String aString);

	@Generated
	@Selector("showsStateColumn")
	public native boolean showsStateColumn();

	@Generated
	@Selector("size")
	@ByValue
	public native CGSize size();

	@Generated
	@Selector("sizeToFit")
	public native void sizeToFit();

	@Generated
	@Selector("submenuAction:")
	public native void submenuAction(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("supermenu")
	public native NSMenu supermenu();

	@Generated
	@Selector("tearOffMenuRepresentation")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object tearOffMenuRepresentation();

	@Generated
	@Selector("title")
	public native String title();

	@Generated
	@Selector("update")
	public native void update();
}
