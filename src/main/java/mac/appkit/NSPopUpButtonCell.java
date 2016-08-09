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
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSArray;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPopUpButtonCell extends NSMenuItemCell {
	static {
		NatJ.register();
	}

	@Generated
	protected NSPopUpButtonCell(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addItemWithTitle:")
	public native void addItemWithTitle(String title);

	@Generated
	@Selector("addItemsWithTitles:")
	public native void addItemsWithTitles(NSArray itemTitles);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSPopUpButtonCell alloc();

	@Generated
	@Selector("altersStateOfSelectedItem")
	public native boolean altersStateOfSelectedItem();

	@Generated
	@Selector("arrowPosition")
	public native long arrowPosition();

	@Generated
	@Selector("attachPopUpWithFrame:inView:")
	public native void attachPopUpWithFrameInView(@ByValue CGRect cellFrame,
			NSView controlView);

	@Generated
	@Selector("autoenablesItems")
	public native boolean autoenablesItems();

	@Generated
	@Selector("dismissPopUp")
	public native void dismissPopUp();

	@Generated
	@Selector("indexOfItem:")
	public native long indexOfItem(NSMenuItem item);

	@Generated
	@Selector("indexOfItemWithRepresentedObject:")
	public native long indexOfItemWithRepresentedObject(
			@Mapped(ObjCObjectMapper.class) Object obj);

	@Generated
	@Selector("indexOfItemWithTag:")
	public native long indexOfItemWithTag(long tag);

	@Generated
	@Selector("indexOfItemWithTarget:andAction:")
	public native long indexOfItemWithTargetAndAction(
			@Mapped(ObjCObjectMapper.class) Object target, SEL actionSelector);

	@Generated
	@Selector("indexOfItemWithTitle:")
	public native long indexOfItemWithTitle(String title);

	@Generated
	@Selector("indexOfSelectedItem")
	public native long indexOfSelectedItem();

	@Generated
	@Selector("init")
	public native NSPopUpButtonCell init();

	@Generated
	@Selector("initImageCell:")
	public native NSPopUpButtonCell initImageCell(NSImage image);

	@Generated
	@Selector("initTextCell:")
	public native NSPopUpButtonCell initTextCell(String aString);

	@Generated
	@Selector("initTextCell:pullsDown:")
	public native NSPopUpButtonCell initTextCellPullsDown(String stringValue,
			boolean pullDown);

	@Generated
	@Selector("insertItemWithTitle:atIndex:")
	public native void insertItemWithTitleAtIndex(String title, long index);

	@Generated
	@Selector("itemArray")
	public native NSArray itemArray();

	@Generated
	@Selector("itemAtIndex:")
	public native NSMenuItem itemAtIndex(long index);

	@Generated
	@Selector("itemTitleAtIndex:")
	public native String itemTitleAtIndex(long index);

	@Generated
	@Selector("itemTitles")
	public native NSArray itemTitles();

	@Generated
	@Selector("itemWithTitle:")
	public native NSMenuItem itemWithTitle(String title);

	@Generated
	@Selector("lastItem")
	public native NSMenuItem lastItem();

	@Generated
	@Selector("menu")
	public native NSMenu menu();

	@Generated
	@Selector("numberOfItems")
	public native long numberOfItems();

	@Generated
	@Selector("objectValue")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object objectValue();

	@Generated
	@Selector("performClickWithFrame:inView:")
	public native void performClickWithFrameInView(@ByValue CGRect frame,
			NSView controlView);

	@Generated
	@Selector("preferredEdge")
	public native long preferredEdge();

	@Generated
	@Selector("pullsDown")
	public native boolean pullsDown();

	@Generated
	@Selector("removeAllItems")
	public native void removeAllItems();

	@Generated
	@Selector("removeItemAtIndex:")
	public native void removeItemAtIndex(long index);

	@Generated
	@Selector("removeItemWithTitle:")
	public native void removeItemWithTitle(String title);

	@Generated
	@Selector("selectItem:")
	public native void selectItem(NSMenuItem item);

	@Generated
	@Selector("selectItemAtIndex:")
	public native void selectItemAtIndex(long index);

	@Generated
	@Selector("selectItemWithTag:")
	public native boolean selectItemWithTag(long tag);

	@Generated
	@Selector("selectItemWithTitle:")
	public native void selectItemWithTitle(String title);

	@Generated
	@Selector("selectedItem")
	public native NSMenuItem selectedItem();

	@Generated
	@Selector("setAltersStateOfSelectedItem:")
	public native void setAltersStateOfSelectedItem(boolean flag);

	@Generated
	@Selector("setArrowPosition:")
	public native void setArrowPosition(long position);

	@Generated
	@Selector("setAutoenablesItems:")
	public native void setAutoenablesItems(boolean flag);

	@Generated
	@Selector("setMenu:")
	public native void setMenu(NSMenu menu);

	@Generated
	@Selector("setObjectValue:")
	public native void setObjectValue(@Mapped(ObjCObjectMapper.class) Object obj);

	@Generated
	@Selector("setPreferredEdge:")
	public native void setPreferredEdge(long edge);

	@Generated
	@Selector("setPullsDown:")
	public native void setPullsDown(boolean flag);

	@Generated
	@Selector("setTitle:")
	public native void setTitle(String aString);

	@Generated
	@Selector("setUsesItemFromMenu:")
	public native void setUsesItemFromMenu(boolean flag);

	@Generated
	@Selector("synchronizeTitleAndSelectedItem")
	public native void synchronizeTitleAndSelectedItem();

	@Generated
	@Selector("titleOfSelectedItem")
	public native String titleOfSelectedItem();

	@Generated
	@Selector("usesItemFromMenu")
	public native boolean usesItemFromMenu();
}
