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
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSIndexSet;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSOutlineView extends NSTableView {
	static {
		NatJ.register();
	}

	@Generated
	protected NSOutlineView(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSOutlineView alloc();

	@Generated
	@Selector("autoresizesOutlineColumn")
	public native boolean autoresizesOutlineColumn();

	@Generated
	@Selector("autosaveExpandedItems")
	public native boolean autosaveExpandedItems();

	@Generated
	@Selector("collapseItem:")
	public native void collapseItem(@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@Selector("collapseItem:collapseChildren:")
	public native void collapseItemCollapseChildren(
			@Mapped(ObjCObjectMapper.class) Object item,
			boolean collapseChildren);

	@Generated
	@Selector("dataSource")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object dataSource();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("expandItem:")
	public native void expandItem(@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@Selector("expandItem:expandChildren:")
	public native void expandItemExpandChildren(
			@Mapped(ObjCObjectMapper.class) Object item, boolean expandChildren);

	@Generated
	@Selector("frameOfOutlineCellAtRow:")
	@ByValue
	public native CGRect frameOfOutlineCellAtRow(long row);

	@Generated
	@Selector("indentationMarkerFollowsCell")
	public native boolean indentationMarkerFollowsCell();

	@Generated
	@Selector("indentationPerLevel")
	public native double indentationPerLevel();

	@Generated
	@Selector("init")
	public native NSOutlineView init();

	@Generated
	@Selector("initWithFrame:")
	public native NSOutlineView initWithFrame(@ByValue CGRect frameRect);

	@Generated
	@Selector("insertItemsAtIndexes:inParent:withAnimation:")
	public native void insertItemsAtIndexesInParentWithAnimation(
			NSIndexSet indexes, @Mapped(ObjCObjectMapper.class) Object parent,
			long animationOptions);

	@Generated
	@Selector("isExpandable:")
	public native boolean isExpandable(
			@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@Selector("isItemExpanded:")
	public native boolean isItemExpanded(
			@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@Selector("itemAtRow:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object itemAtRow(long row);

	@Generated
	@Selector("levelForItem:")
	public native long levelForItem(@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@Selector("levelForRow:")
	public native long levelForRow(long row);

	@Generated
	@Selector("moveItemAtIndex:inParent:toIndex:inParent:")
	public native void moveItemAtIndexInParentToIndexInParent(long fromIndex,
			@Mapped(ObjCObjectMapper.class) Object oldParent, long toIndex,
			@Mapped(ObjCObjectMapper.class) Object newParent);

	@Generated
	@Selector("outlineTableColumn")
	public native NSTableColumn outlineTableColumn();

	@Generated
	@Selector("parentForItem:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object parentForItem(
			@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@Selector("reloadItem:")
	public native void reloadItem(@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@Selector("reloadItem:reloadChildren:")
	public native void reloadItemReloadChildren(
			@Mapped(ObjCObjectMapper.class) Object item, boolean reloadChildren);

	@Generated
	@Selector("removeItemsAtIndexes:inParent:withAnimation:")
	public native void removeItemsAtIndexesInParentWithAnimation(
			NSIndexSet indexes, @Mapped(ObjCObjectMapper.class) Object parent,
			long animationOptions);

	@Generated
	@Selector("rowForItem:")
	public native long rowForItem(@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@Selector("setAutoresizesOutlineColumn:")
	public native void setAutoresizesOutlineColumn(boolean resize);

	@Generated
	@Selector("setAutosaveExpandedItems:")
	public native void setAutosaveExpandedItems(boolean save);

	@Generated
	@Selector("setDataSource:")
	public native void setDataSource(
			@Mapped(ObjCObjectMapper.class) Object aSource);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("setDropItem:dropChildIndex:")
	public native void setDropItemDropChildIndex(
			@Mapped(ObjCObjectMapper.class) Object item, long index);

	@Generated
	@Selector("setIndentationMarkerFollowsCell:")
	public native void setIndentationMarkerFollowsCell(boolean drawInCell);

	@Generated
	@Selector("setIndentationPerLevel:")
	public native void setIndentationPerLevel(double indentationPerLevel);

	@Generated
	@Selector("setOutlineTableColumn:")
	public native void setOutlineTableColumn(NSTableColumn outlineTableColumn);

	@Generated
	@Selector("setUserInterfaceLayoutDirection:")
	public native void setUserInterfaceLayoutDirection(long value);

	@Generated
	@Selector("shouldCollapseAutoExpandedItemsForDeposited:")
	public native boolean shouldCollapseAutoExpandedItemsForDeposited(
			boolean deposited);

	@Generated
	@Selector("userInterfaceLayoutDirection")
	public native long userInterfaceLayoutDirection();
}
