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
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.appkit.*;
import mac.coregraphics.struct.CGPoint;
import mac.foundation.NSArray;
import mac.foundation.NSIndexSet;
import mac.foundation.NSNotification;
import mac.foundation.NSURL;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSBrowserDelegate")
public interface NSBrowserDelegate {
	@Generated
	@IsOptional
	@Selector("browser:acceptDrop:atRow:column:dropOperation:")
	public boolean browserAcceptDropAtRowColumnDropOperation(NSBrowser browser,
			@Mapped(ObjCObjectMapper.class) Object info, long row, long column,
			long dropOperation);

	@Generated
	@IsOptional
	@Selector("browser:canDragRowsWithIndexes:inColumn:withEvent:")
	public boolean browserCanDragRowsWithIndexesInColumnWithEvent(
			NSBrowser browser, NSIndexSet rowIndexes, long column, NSEvent event);

	@Generated
	@IsOptional
	@Selector("browser:child:ofItem:")
	@MappedReturn(ObjCObjectMapper.class)
	public Object browserChildOfItem(NSBrowser browser, long index,
			@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@IsOptional
	@Selector("browser:createRowsForColumn:inMatrix:")
	public void browserCreateRowsForColumnInMatrix(NSBrowser sender,
			long column, NSMatrix matrix);

	@Generated
	@IsOptional
	@Selector("browser:didChangeLastColumn:toColumn:")
	public void browserDidChangeLastColumnToColumn(NSBrowser browser,
			long oldLastColumn, long column);

	@Generated
	@IsOptional
	@Selector("browser:draggingImageForRowsWithIndexes:inColumn:withEvent:offset:")
	public NSImage browserDraggingImageForRowsWithIndexesInColumnWithEventOffset(
			NSBrowser browser,
			NSIndexSet rowIndexes,
			long column,
			NSEvent event,
			@UncertainArgument("Options: reference, array Fallback: reference") CGPoint dragImageOffset);

	@Generated
	@IsOptional
	@Selector("browser:headerViewControllerForItem:")
	public NSViewController browserHeaderViewControllerForItem(
			NSBrowser browser, @Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@IsOptional
	@Selector("browser:heightOfRow:inColumn:")
	public double browserHeightOfRowInColumn(NSBrowser browser, long row,
			long columnIndex);

	@Generated
	@IsOptional
	@Selector("browser:isColumnValid:")
	public boolean browserIsColumnValid(NSBrowser sender, long column);

	@Generated
	@IsOptional
	@Selector("browser:isLeafItem:")
	public boolean browserIsLeafItem(NSBrowser browser,
			@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@IsOptional
	@Selector("browser:namesOfPromisedFilesDroppedAtDestination:forDraggedRowsWithIndexes:inColumn:")
	public NSArray browserNamesOfPromisedFilesDroppedAtDestinationForDraggedRowsWithIndexesInColumn(
			NSBrowser browser, NSURL dropDestination, NSIndexSet rowIndexes,
			long column);

	@Generated
	@IsOptional
	@Selector("browser:nextTypeSelectMatchFromRow:toRow:inColumn:forString:")
	public long browserNextTypeSelectMatchFromRowToRowInColumnForString(
			NSBrowser browser, long startRow, long endRow, long column,
			String searchString);

	@Generated
	@IsOptional
	@Selector("browser:numberOfChildrenOfItem:")
	public long browserNumberOfChildrenOfItem(NSBrowser browser,
			@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@IsOptional
	@Selector("browser:numberOfRowsInColumn:")
	public long browserNumberOfRowsInColumn(NSBrowser sender, long column);

	@Generated
	@IsOptional
	@Selector("browser:objectValueForItem:")
	@MappedReturn(ObjCObjectMapper.class)
	public Object browserObjectValueForItem(NSBrowser browser,
			@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@IsOptional
	@Selector("browser:previewViewControllerForLeafItem:")
	public NSViewController browserPreviewViewControllerForLeafItem(
			NSBrowser browser, @Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@IsOptional
	@Selector("browser:selectCellWithString:inColumn:")
	public boolean browserSelectCellWithStringInColumn(NSBrowser sender,
			String title, long column);

	@Generated
	@IsOptional
	@Selector("browser:selectRow:inColumn:")
	public boolean browserSelectRowInColumn(NSBrowser sender, long row,
			long column);

	@Generated
	@IsOptional
	@Selector("browser:selectionIndexesForProposedSelection:inColumn:")
	public NSIndexSet browserSelectionIndexesForProposedSelectionInColumn(
			NSBrowser browser, NSIndexSet proposedSelectionIndexes, long column);

	@Generated
	@IsOptional
	@Selector("browser:setObjectValue:forItem:")
	public void browserSetObjectValueForItem(NSBrowser browser,
			@Mapped(ObjCObjectMapper.class) Object object,
			@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@IsOptional
	@Selector("browser:shouldEditItem:")
	public boolean browserShouldEditItem(NSBrowser browser,
			@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@IsOptional
	@Selector("browser:shouldShowCellExpansionForRow:column:")
	public boolean browserShouldShowCellExpansionForRowColumn(
			NSBrowser browser, long row, long column);

	@Generated
	@IsOptional
	@Selector("browser:shouldSizeColumn:forUserResize:toWidth:")
	public double browserShouldSizeColumnForUserResizeToWidth(
			NSBrowser browser, long columnIndex, boolean forUserResize,
			double suggestedWidth);

	@Generated
	@IsOptional
	@Selector("browser:shouldTypeSelectForEvent:withCurrentSearchString:")
	public boolean browserShouldTypeSelectForEventWithCurrentSearchString(
			NSBrowser browser, NSEvent event, String searchString);

	@Generated
	@IsOptional
	@Selector("browser:sizeToFitWidthOfColumn:")
	public double browserSizeToFitWidthOfColumn(NSBrowser browser,
			long columnIndex);

	@Generated
	@IsOptional
	@Selector("browser:titleOfColumn:")
	public String browserTitleOfColumn(NSBrowser sender, long column);

	@Generated
	@IsOptional
	@Selector("browser:typeSelectStringForRow:inColumn:")
	public String browserTypeSelectStringForRowInColumn(NSBrowser browser,
			long row, long column);

	@Generated
	@IsOptional
	@Selector("browser:validateDrop:proposedRow:column:dropOperation:")
	public long browserValidateDropProposedRowColumnDropOperation(
			NSBrowser browser, @Mapped(ObjCObjectMapper.class) Object info,
			LongPtr row, LongPtr column, LongPtr dropOperation);

	@Generated
	@IsOptional
	@Selector("browser:willDisplayCell:atRow:column:")
	public void browserWillDisplayCellAtRowColumn(NSBrowser sender,
			@Mapped(ObjCObjectMapper.class) Object cell, long row, long column);

	@Generated
	@IsOptional
	@Selector("browser:writeRowsWithIndexes:inColumn:toPasteboard:")
	public boolean browserWriteRowsWithIndexesInColumnToPasteboard(
			NSBrowser browser, NSIndexSet rowIndexes, long column,
			NSPasteboard pasteboard);

	@Generated
	@IsOptional
	@Selector("browserColumnConfigurationDidChange:")
	public void browserColumnConfigurationDidChange(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("browserDidScroll:")
	public void browserDidScroll(NSBrowser sender);

	@Generated
	@IsOptional
	@Selector("browserWillScroll:")
	public void browserWillScroll(NSBrowser sender);

	@Generated
	@IsOptional
	@Selector("rootItemForBrowser:")
	@MappedReturn(ObjCObjectMapper.class)
	public Object rootItemForBrowser(NSBrowser browser);
}
