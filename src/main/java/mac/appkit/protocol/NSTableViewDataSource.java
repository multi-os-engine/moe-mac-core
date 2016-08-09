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
import mac.appkit.NSPasteboard;
import mac.appkit.NSTableColumn;
import mac.appkit.NSTableView;
import mac.coregraphics.struct.CGPoint;
import mac.foundation.NSArray;
import mac.foundation.NSIndexSet;
import mac.foundation.NSURL;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSTableViewDataSource")
public interface NSTableViewDataSource {
	@Generated
	@IsOptional
	@Selector("numberOfRowsInTableView:")
	public long numberOfRowsInTableView(NSTableView tableView);

	@Generated
	@IsOptional
	@Selector("tableView:acceptDrop:row:dropOperation:")
	public boolean tableViewAcceptDropRowDropOperation(NSTableView tableView,
			@Mapped(ObjCObjectMapper.class) Object info, long row,
			long dropOperation);

	@Generated
	@IsOptional
	@Selector("tableView:draggingSession:endedAtPoint:operation:")
	public void tableViewDraggingSessionEndedAtPointOperation(
			NSTableView tableView, NSDraggingSession session,
			@ByValue CGPoint screenPoint, long operation);

	@Generated
	@IsOptional
	@Selector("tableView:draggingSession:willBeginAtPoint:forRowIndexes:")
	public void tableViewDraggingSessionWillBeginAtPointForRowIndexes(
			NSTableView tableView, NSDraggingSession session,
			@ByValue CGPoint screenPoint, NSIndexSet rowIndexes);

	@Generated
	@IsOptional
	@Selector("tableView:namesOfPromisedFilesDroppedAtDestination:forDraggedRowsWithIndexes:")
	public NSArray tableViewNamesOfPromisedFilesDroppedAtDestinationForDraggedRowsWithIndexes(
			NSTableView tableView, NSURL dropDestination, NSIndexSet indexSet);

	@Generated
	@IsOptional
	@Selector("tableView:objectValueForTableColumn:row:")
	@MappedReturn(ObjCObjectMapper.class)
	public Object tableViewObjectValueForTableColumnRow(NSTableView tableView,
			NSTableColumn tableColumn, long row);

	@Generated
	@IsOptional
	@Selector("tableView:pasteboardWriterForRow:")
	@MappedReturn(ObjCObjectMapper.class)
	public Object tableViewPasteboardWriterForRow(NSTableView tableView,
			long row);

	@Generated
	@IsOptional
	@Selector("tableView:setObjectValue:forTableColumn:row:")
	public void tableViewSetObjectValueForTableColumnRow(NSTableView tableView,
			@Mapped(ObjCObjectMapper.class) Object object,
			NSTableColumn tableColumn, long row);

	@Generated
	@IsOptional
	@Selector("tableView:sortDescriptorsDidChange:")
	public void tableViewSortDescriptorsDidChange(NSTableView tableView,
			NSArray oldDescriptors);

	@Generated
	@IsOptional
	@Selector("tableView:updateDraggingItemsForDrag:")
	public void tableViewUpdateDraggingItemsForDrag(NSTableView tableView,
			@Mapped(ObjCObjectMapper.class) Object draggingInfo);

	@Generated
	@IsOptional
	@Selector("tableView:validateDrop:proposedRow:proposedDropOperation:")
	public long tableViewValidateDropProposedRowProposedDropOperation(
			NSTableView tableView, @Mapped(ObjCObjectMapper.class) Object info,
			long row, long dropOperation);

	@Generated
	@IsOptional
	@Selector("tableView:writeRowsWithIndexes:toPasteboard:")
	public boolean tableViewWriteRowsWithIndexesToPasteboard(
			NSTableView tableView, NSIndexSet rowIndexes, NSPasteboard pboard);
}
