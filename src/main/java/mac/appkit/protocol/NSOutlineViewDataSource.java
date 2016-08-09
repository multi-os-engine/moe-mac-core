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

package mac.appkit.protocol;


import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.appkit.NSDraggingSession;
import mac.appkit.NSOutlineView;
import mac.appkit.NSPasteboard;
import mac.appkit.NSTableColumn;
import mac.coregraphics.struct.CGPoint;
import mac.foundation.NSArray;
import mac.foundation.NSURL;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSOutlineViewDataSource")
public interface NSOutlineViewDataSource {
	@Generated
	@IsOptional
	@Selector("outlineView:acceptDrop:item:childIndex:")
	public boolean outlineViewAcceptDropItemChildIndex(
			NSOutlineView outlineView,
			@Mapped(ObjCObjectMapper.class) Object info,
			@Mapped(ObjCObjectMapper.class) Object item, long index);

	@Generated
	@IsOptional
	@Selector("outlineView:child:ofItem:")
	@MappedReturn(ObjCObjectMapper.class)
	public Object outlineViewChildOfItem(NSOutlineView outlineView, long index,
			@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@IsOptional
	@Selector("outlineView:draggingSession:endedAtPoint:operation:")
	public void outlineViewDraggingSessionEndedAtPointOperation(
			NSOutlineView outlineView, NSDraggingSession session,
			@ByValue CGPoint screenPoint, long operation);

	@Generated
	@IsOptional
	@Selector("outlineView:draggingSession:willBeginAtPoint:forItems:")
	public void outlineViewDraggingSessionWillBeginAtPointForItems(
			NSOutlineView outlineView, NSDraggingSession session,
			@ByValue CGPoint screenPoint, NSArray draggedItems);

	@Generated
	@IsOptional
	@Selector("outlineView:isItemExpandable:")
	public boolean outlineViewIsItemExpandable(NSOutlineView outlineView,
			@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@IsOptional
	@Selector("outlineView:itemForPersistentObject:")
	@MappedReturn(ObjCObjectMapper.class)
	public Object outlineViewItemForPersistentObject(NSOutlineView outlineView,
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@IsOptional
	@Selector("outlineView:namesOfPromisedFilesDroppedAtDestination:forDraggedItems:")
	public NSArray outlineViewNamesOfPromisedFilesDroppedAtDestinationForDraggedItems(
			NSOutlineView outlineView, NSURL dropDestination, NSArray items);

	@Generated
	@IsOptional
	@Selector("outlineView:numberOfChildrenOfItem:")
	public long outlineViewNumberOfChildrenOfItem(NSOutlineView outlineView,
			@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@IsOptional
	@Selector("outlineView:objectValueForTableColumn:byItem:")
	@MappedReturn(ObjCObjectMapper.class)
	public Object outlineViewObjectValueForTableColumnByItem(
			NSOutlineView outlineView, NSTableColumn tableColumn,
			@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@IsOptional
	@Selector("outlineView:pasteboardWriterForItem:")
	@MappedReturn(ObjCObjectMapper.class)
	public Object outlineViewPasteboardWriterForItem(NSOutlineView outlineView,
			@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@IsOptional
	@Selector("outlineView:persistentObjectForItem:")
	@MappedReturn(ObjCObjectMapper.class)
	public Object outlineViewPersistentObjectForItem(NSOutlineView outlineView,
			@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@IsOptional
	@Selector("outlineView:setObjectValue:forTableColumn:byItem:")
	public void outlineViewSetObjectValueForTableColumnByItem(
			NSOutlineView outlineView,
			@Mapped(ObjCObjectMapper.class) Object object,
			NSTableColumn tableColumn,
			@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@IsOptional
	@Selector("outlineView:sortDescriptorsDidChange:")
	public void outlineViewSortDescriptorsDidChange(NSOutlineView outlineView,
			NSArray oldDescriptors);

	@Generated
	@IsOptional
	@Selector("outlineView:updateDraggingItemsForDrag:")
	public void outlineViewUpdateDraggingItemsForDrag(
			NSOutlineView outlineView,
			@Mapped(ObjCObjectMapper.class) Object draggingInfo);

	@Generated
	@IsOptional
	@Selector("outlineView:validateDrop:proposedItem:proposedChildIndex:")
	public long outlineViewValidateDropProposedItemProposedChildIndex(
			NSOutlineView outlineView,
			@Mapped(ObjCObjectMapper.class) Object info,
			@Mapped(ObjCObjectMapper.class) Object item, long index);

	@Generated
	@IsOptional
	@Selector("outlineView:writeItems:toPasteboard:")
	public boolean outlineViewWriteItemsToPasteboard(NSOutlineView outlineView,
			NSArray items, NSPasteboard pasteboard);
}
