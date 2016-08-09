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
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.appkit.protocol.NSDraggingSource;
import mac.appkit.protocol.NSTextViewDelegate;
import mac.appkit.protocol.NSUserInterfaceValidations;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.coregraphics.struct.CGSize;
import mac.foundation.*;
import mac.foundation.struct.NSRange;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTableView extends NSControl implements
		NSUserInterfaceValidations, NSTextViewDelegate, NSDraggingSource {
	static {
		NatJ.register();
	}

	@Generated
	protected NSTableView(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addTableColumn:")
	public native void addTableColumn(NSTableColumn tableColumn);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSTableView alloc();

	@Generated
	@Selector("allowsColumnReordering")
	public native boolean allowsColumnReordering();

	@Generated
	@Selector("allowsColumnResizing")
	public native boolean allowsColumnResizing();

	@Generated
	@Selector("allowsColumnSelection")
	public native boolean allowsColumnSelection();

	@Generated
	@Selector("allowsEmptySelection")
	public native boolean allowsEmptySelection();

	@Generated
	@Selector("allowsMultipleSelection")
	public native boolean allowsMultipleSelection();

	@Generated
	@Selector("allowsTypeSelect")
	public native boolean allowsTypeSelect();

	@Generated
	@Selector("autoresizesAllColumnsToFit")
	public native boolean autoresizesAllColumnsToFit();

	@Generated
	@Selector("autosaveName")
	public native String autosaveName();

	@Generated
	@Selector("autosaveTableColumns")
	public native boolean autosaveTableColumns();

	@Generated
	@Selector("backgroundColor")
	public native NSColor backgroundColor();

	@Generated
	@Selector("beginUpdates")
	public native void beginUpdates();

	@Generated
	@Selector("canDragRowsWithIndexes:atPoint:")
	public native boolean canDragRowsWithIndexesAtPoint(NSIndexSet rowIndexes,
			@ByValue CGPoint mouseDownPoint);

	@Generated
	@Selector("clickedColumn")
	public native long clickedColumn();

	@Generated
	@Selector("clickedRow")
	public native long clickedRow();

	@Generated
	@Selector("columnAtPoint:")
	public native long columnAtPoint(@ByValue CGPoint point);

	@Generated
	@Selector("columnAutoresizingStyle")
	public native long columnAutoresizingStyle();

	@Generated
	@Selector("columnForView:")
	public native long columnForView(NSView view);

	@Generated
	@Selector("columnIndexesInRect:")
	public native NSIndexSet columnIndexesInRect(@ByValue CGRect rect);

	@Generated
	@Selector("columnWithIdentifier:")
	public native long columnWithIdentifier(String identifier);

	@Generated
	@Selector("columnsInRect:")
	@ByValue
	public native NSRange columnsInRect(@ByValue CGRect rect);

	@Generated
	@Selector("cornerView")
	public native NSView cornerView();

	@Generated
	@Selector("dataSource")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object dataSource();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("deselectAll:")
	public native void deselectAll(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("deselectColumn:")
	public native void deselectColumn(long column);

	@Generated
	@Selector("deselectRow:")
	public native void deselectRow(long row);

	@Generated
	@Selector("didAddRowView:forRow:")
	public native void didAddRowViewForRow(NSTableRowView rowView, long row);

	@Generated
	@Selector("didRemoveRowView:forRow:")
	public native void didRemoveRowViewForRow(NSTableRowView rowView, long row);

	@Generated
	@Selector("doubleAction")
	public native SEL doubleAction();

	@Generated
	@Selector("dragImageForRows:event:dragImageOffset:")
	public native NSImage dragImageForRowsEventDragImageOffset(
			NSArray dragRows,
			NSEvent dragEvent,
			@UncertainArgument("Options: reference, array Fallback: reference") CGPoint dragImageOffset);

	@Generated
	@Selector("dragImageForRowsWithIndexes:tableColumns:event:offset:")
	public native NSImage dragImageForRowsWithIndexesTableColumnsEventOffset(
			NSIndexSet dragRows,
			NSArray tableColumns,
			NSEvent dragEvent,
			@UncertainArgument("Options: reference, array Fallback: reference") CGPoint dragImageOffset);

	@Generated
	@Selector("draggingDestinationFeedbackStyle")
	public native long draggingDestinationFeedbackStyle();

	@Generated
	@IsOptional
	@Selector("draggingSession:endedAtPoint:operation:")
	public native void draggingSessionEndedAtPointOperation(
			NSDraggingSession session, @ByValue CGPoint screenPoint,
			long operation);

	@Generated
	@IsOptional
	@Selector("draggingSession:movedToPoint:")
	public native void draggingSessionMovedToPoint(NSDraggingSession session,
			@ByValue CGPoint screenPoint);

	@Generated
	@Selector("draggingSession:sourceOperationMaskForDraggingContext:")
	public native long draggingSessionSourceOperationMaskForDraggingContext(
			NSDraggingSession session, long context);

	@Generated
	@IsOptional
	@Selector("draggingSession:willBeginAtPoint:")
	public native void draggingSessionWillBeginAtPoint(
			NSDraggingSession session, @ByValue CGPoint screenPoint);

	@Generated
	@Selector("drawBackgroundInClipRect:")
	public native void drawBackgroundInClipRect(@ByValue CGRect clipRect);

	@Generated
	@Selector("drawGridInClipRect:")
	public native void drawGridInClipRect(@ByValue CGRect clipRect);

	@Generated
	@Selector("drawRow:clipRect:")
	public native void drawRowClipRect(long row, @ByValue CGRect clipRect);

	@Generated
	@Selector("drawsGrid")
	public native boolean drawsGrid();

	@Generated
	@Selector("editColumn:row:withEvent:select:")
	public native void editColumnRowWithEventSelect(long column, long row,
			NSEvent theEvent, boolean select);

	@Generated
	@Selector("editedColumn")
	public native long editedColumn();

	@Generated
	@Selector("editedRow")
	public native long editedRow();

	@Generated
	@Selector("effectiveRowSizeStyle")
	public native long effectiveRowSizeStyle();

	@Generated
	@Selector("endUpdates")
	public native void endUpdates();

	@Generated
	@Selector("enumerateAvailableRowViewsUsingBlock:")
	public native void enumerateAvailableRowViewsUsingBlock(
			@ObjCBlock(name = "call_enumerateAvailableRowViewsUsingBlock") Block_enumerateAvailableRowViewsUsingBlock handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_enumerateAvailableRowViewsUsingBlock {
		@Generated
		public void call_enumerateAvailableRowViewsUsingBlock(
				NSTableRowView arg0, long arg1);
	}

	@Generated
	@Selector("floatsGroupRows")
	public native boolean floatsGroupRows();

	@Generated
	@Selector("focusedColumn")
	public native long focusedColumn();

	@Generated
	@Selector("frameOfCellAtColumn:row:")
	@ByValue
	public native CGRect frameOfCellAtColumnRow(long column, long row);

	@Generated
	@Selector("gridColor")
	public native NSColor gridColor();

	@Generated
	@Selector("gridStyleMask")
	public native long gridStyleMask();

	@Generated
	@Selector("headerView")
	public native NSTableHeaderView headerView();

	@Generated
	@Selector("highlightSelectionInClipRect:")
	public native void highlightSelectionInClipRect(@ByValue CGRect clipRect);

	@Generated
	@Selector("highlightedTableColumn")
	public native NSTableColumn highlightedTableColumn();

	@Generated
	@IsOptional
	@Selector("ignoreModifierKeysForDraggingSession:")
	public native boolean ignoreModifierKeysForDraggingSession(
			NSDraggingSession session);

	@Generated
	@Selector("indicatorImageInTableColumn:")
	public native NSImage indicatorImageInTableColumn(NSTableColumn tableColumn);

	@Generated
	@Selector("init")
	public native NSTableView init();

	@Generated
	@Selector("initWithFrame:")
	public native NSTableView initWithFrame(@ByValue CGRect frameRect);

	@Generated
	@Selector("insertRowsAtIndexes:withAnimation:")
	public native void insertRowsAtIndexesWithAnimation(NSIndexSet indexes,
			long animationOptions);

	@Generated
	@Selector("intercellSpacing")
	@ByValue
	public native CGSize intercellSpacing();

	@Generated
	@Selector("isColumnSelected:")
	public native boolean isColumnSelected(long column);

	@Generated
	@Selector("isRowSelected:")
	public native boolean isRowSelected(long row);

	@Generated
	@Selector("makeViewWithIdentifier:owner:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object makeViewWithIdentifierOwner(String identifier,
			@Mapped(ObjCObjectMapper.class) Object owner);

	@Generated
	@Selector("moveColumn:toColumn:")
	public native void moveColumnToColumn(long oldIndex, long newIndex);

	@Generated
	@Selector("moveRowAtIndex:toIndex:")
	public native void moveRowAtIndexToIndex(long oldIndex, long newIndex);

	@Generated
	@Selector("noteHeightOfRowsWithIndexesChanged:")
	public native void noteHeightOfRowsWithIndexesChanged(NSIndexSet indexSet);

	@Generated
	@Selector("noteNumberOfRowsChanged")
	public native void noteNumberOfRowsChanged();

	@Generated
	@Selector("numberOfColumns")
	public native long numberOfColumns();

	@Generated
	@Selector("numberOfRows")
	public native long numberOfRows();

	@Generated
	@Selector("numberOfSelectedColumns")
	public native long numberOfSelectedColumns();

	@Generated
	@Selector("numberOfSelectedRows")
	public native long numberOfSelectedRows();

	@Generated
	@Selector("performClickOnCellAtColumn:row:")
	public native void performClickOnCellAtColumnRow(long column, long row);

	@Generated
	@Selector("preparedCellAtColumn:row:")
	public native NSCell preparedCellAtColumnRow(long column, long row);

	@Generated
	@Selector("rectOfColumn:")
	@ByValue
	public native CGRect rectOfColumn(long column);

	@Generated
	@Selector("rectOfRow:")
	@ByValue
	public native CGRect rectOfRow(long row);

	@Generated
	@Selector("registerNib:forIdentifier:")
	public native void registerNibForIdentifier(NSNib nib, String identifier);

	@Generated
	@Selector("registeredNibsByIdentifier")
	public native NSDictionary registeredNibsByIdentifier();

	@Generated
	@Selector("reloadData")
	public native void reloadData();

	@Generated
	@Selector("reloadDataForRowIndexes:columnIndexes:")
	public native void reloadDataForRowIndexesColumnIndexes(
			NSIndexSet rowIndexes, NSIndexSet columnIndexes);

	@Generated
	@Selector("removeRowsAtIndexes:withAnimation:")
	public native void removeRowsAtIndexesWithAnimation(NSIndexSet indexes,
			long animationOptions);

	@Generated
	@Selector("removeTableColumn:")
	public native void removeTableColumn(NSTableColumn tableColumn);

	@Generated
	@Selector("rowAtPoint:")
	public native long rowAtPoint(@ByValue CGPoint point);

	@Generated
	@Selector("rowForView:")
	public native long rowForView(NSView view);

	@Generated
	@Selector("rowHeight")
	public native double rowHeight();

	@Generated
	@Selector("rowSizeStyle")
	public native long rowSizeStyle();

	@Generated
	@Selector("rowViewAtRow:makeIfNecessary:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object rowViewAtRowMakeIfNecessary(long row,
			boolean makeIfNecessary);

	@Generated
	@Selector("rowsInRect:")
	@ByValue
	public native NSRange rowsInRect(@ByValue CGRect rect);

	@Generated
	@Selector("scrollColumnToVisible:")
	public native void scrollColumnToVisible(long column);

	@Generated
	@Selector("scrollRowToVisible:")
	public native void scrollRowToVisible(long row);

	@Generated
	@Selector("selectAll:")
	public native void selectAll(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("selectColumn:byExtendingSelection:")
	public native void selectColumnByExtendingSelection(long column,
			boolean extend);

	@Generated
	@Selector("selectColumnIndexes:byExtendingSelection:")
	public native void selectColumnIndexesByExtendingSelection(
			NSIndexSet indexes, boolean extend);

	@Generated
	@Selector("selectRow:byExtendingSelection:")
	public native void selectRowByExtendingSelection(long row, boolean extend);

	@Generated
	@Selector("selectRowIndexes:byExtendingSelection:")
	public native void selectRowIndexesByExtendingSelection(NSIndexSet indexes,
			boolean extend);

	@Generated
	@Selector("selectedColumn")
	public native long selectedColumn();

	@Generated
	@Selector("selectedColumnEnumerator")
	public native NSEnumerator selectedColumnEnumerator();

	@Generated
	@Selector("selectedColumnIndexes")
	public native NSIndexSet selectedColumnIndexes();

	@Generated
	@Selector("selectedRow")
	public native long selectedRow();

	@Generated
	@Selector("selectedRowEnumerator")
	public native NSEnumerator selectedRowEnumerator();

	@Generated
	@Selector("selectedRowIndexes")
	public native NSIndexSet selectedRowIndexes();

	@Generated
	@Selector("selectionHighlightStyle")
	public native long selectionHighlightStyle();

	@Generated
	@Selector("setAllowsColumnReordering:")
	public native void setAllowsColumnReordering(boolean flag);

	@Generated
	@Selector("setAllowsColumnResizing:")
	public native void setAllowsColumnResizing(boolean flag);

	@Generated
	@Selector("setAllowsColumnSelection:")
	public native void setAllowsColumnSelection(boolean flag);

	@Generated
	@Selector("setAllowsEmptySelection:")
	public native void setAllowsEmptySelection(boolean flag);

	@Generated
	@Selector("setAllowsMultipleSelection:")
	public native void setAllowsMultipleSelection(boolean flag);

	@Generated
	@Selector("setAllowsTypeSelect:")
	public native void setAllowsTypeSelect(boolean value);

	@Generated
	@Selector("setAutoresizesAllColumnsToFit:")
	public native void setAutoresizesAllColumnsToFit(boolean flag);

	@Generated
	@Selector("setAutosaveName:")
	public native void setAutosaveName(String name);

	@Generated
	@Selector("setAutosaveTableColumns:")
	public native void setAutosaveTableColumns(boolean save);

	@Generated
	@Selector("setBackgroundColor:")
	public native void setBackgroundColor(NSColor color);

	@Generated
	@Selector("setColumnAutoresizingStyle:")
	public native void setColumnAutoresizingStyle(long style);

	@Generated
	@Selector("setCornerView:")
	public native void setCornerView(NSView cornerView);

	@Generated
	@Selector("setDataSource:")
	public native void setDataSource(
			@Mapped(ObjCObjectMapper.class) Object aSource);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object delegate);

	@Generated
	@Selector("setDoubleAction:")
	public native void setDoubleAction(SEL aSelector);

	@Generated
	@Selector("setDraggingDestinationFeedbackStyle:")
	public native void setDraggingDestinationFeedbackStyle(long style);

	@Generated
	@Selector("setDraggingSourceOperationMask:forLocal:")
	public native void setDraggingSourceOperationMaskForLocal(long mask,
			boolean isLocal);

	@Generated
	@Selector("setDrawsGrid:")
	public native void setDrawsGrid(boolean flag);

	@Generated
	@Selector("setDropRow:dropOperation:")
	public native void setDropRowDropOperation(long row, long dropOperation);

	@Generated
	@Selector("setFloatsGroupRows:")
	public native void setFloatsGroupRows(boolean value);

	@Generated
	@Selector("setFocusedColumn:")
	public native void setFocusedColumn(long focusedColumn);

	@Generated
	@Selector("setGridColor:")
	public native void setGridColor(NSColor color);

	@Generated
	@Selector("setGridStyleMask:")
	public native void setGridStyleMask(long gridStyle);

	@Generated
	@Selector("setHeaderView:")
	public native void setHeaderView(NSTableHeaderView headerView);

	@Generated
	@Selector("setHighlightedTableColumn:")
	public native void setHighlightedTableColumn(NSTableColumn tableColumn);

	@Generated
	@Selector("setIndicatorImage:inTableColumn:")
	public native void setIndicatorImageInTableColumn(NSImage anImage,
			NSTableColumn tableColumn);

	@Generated
	@Selector("setIntercellSpacing:")
	public native void setIntercellSpacing(@ByValue CGSize aSize);

	@Generated
	@Selector("setRowHeight:")
	public native void setRowHeight(double rowHeight);

	@Generated
	@Selector("setRowSizeStyle:")
	public native void setRowSizeStyle(long rowSizeStyle);

	@Generated
	@Selector("setSelectionHighlightStyle:")
	public native void setSelectionHighlightStyle(long selectionHighlightStyle);

	@Generated
	@Selector("setSortDescriptors:")
	public native void setSortDescriptors(NSArray array);

	@Generated
	@Selector("setUsesAlternatingRowBackgroundColors:")
	public native void setUsesAlternatingRowBackgroundColors(
			boolean useAlternatingRowColors);

	@Generated
	@Selector("setVerticalMotionCanBeginDrag:")
	public native void setVerticalMotionCanBeginDrag(boolean flag);

	@Generated
	@Selector("shouldFocusCell:atColumn:row:")
	public native boolean shouldFocusCellAtColumnRow(NSCell cell, long column,
			long row);

	@Generated
	@Selector("sizeLastColumnToFit")
	public native void sizeLastColumnToFit();

	@Generated
	@Selector("sizeToFit")
	public native void sizeToFit();

	@Generated
	@Selector("sortDescriptors")
	public native NSArray sortDescriptors();

	@Generated
	@Selector("tableColumnWithIdentifier:")
	public native NSTableColumn tableColumnWithIdentifier(String identifier);

	@Generated
	@Selector("tableColumns")
	public native NSArray tableColumns();

	@Generated
	@Selector("textDidBeginEditing:")
	public native void textDidBeginEditing(NSNotification notification);

	@Generated
	@Selector("textDidChange:")
	public native void textDidChange(NSNotification notification);

	@Generated
	@Selector("textDidEndEditing:")
	public native void textDidEndEditing(NSNotification notification);

	@Generated
	@Selector("textShouldBeginEditing:")
	public native boolean textShouldBeginEditing(NSText textObject);

	@Generated
	@Selector("textShouldEndEditing:")
	public native boolean textShouldEndEditing(NSText textObject);

	@Generated
	@IsOptional
	@Selector("textView:URLForContentsOfTextAttachment:atIndex:")
	public native NSURL textViewURLForContentsOfTextAttachmentAtIndex(
			NSTextView textView, NSTextAttachment textAttachment, long charIndex);

	@Generated
	@IsOptional
	@Selector("textView:clickedOnCell:inRect:")
	public native void textViewClickedOnCellInRect(NSTextView textView,
			@Mapped(ObjCObjectMapper.class) Object cell,
			@ByValue CGRect cellFrame);

	@Generated
	@IsOptional
	@Selector("textView:clickedOnCell:inRect:atIndex:")
	public native void textViewClickedOnCellInRectAtIndex(NSTextView textView,
			@Mapped(ObjCObjectMapper.class) Object cell,
			@ByValue CGRect cellFrame, long charIndex);

	@Generated
	@IsOptional
	@Selector("textView:clickedOnLink:")
	public native boolean textViewClickedOnLink(NSTextView textView,
			@Mapped(ObjCObjectMapper.class) Object link);

	@Generated
	@IsOptional
	@Selector("textView:clickedOnLink:atIndex:")
	public native boolean textViewClickedOnLinkAtIndex(NSTextView textView,
			@Mapped(ObjCObjectMapper.class) Object link, long charIndex);

	@Generated
	@IsOptional
	@Selector("textView:completions:forPartialWordRange:indexOfSelectedItem:")
	public native NSArray textViewCompletionsForPartialWordRangeIndexOfSelectedItem(
			NSTextView textView, NSArray words, @ByValue NSRange charRange,
			LongPtr index);

	@Generated
	@IsOptional
	@Selector("textView:didCheckTextInRange:types:options:results:orthography:wordCount:")
	public native NSArray textViewDidCheckTextInRangeTypesOptionsResultsOrthographyWordCount(
			NSTextView view, @ByValue NSRange range, long checkingTypes,
			NSDictionary options, NSArray results, NSOrthography orthography,
			long wordCount);

	@Generated
	@IsOptional
	@Selector("textView:doCommandBySelector:")
	public native boolean textViewDoCommandBySelector(NSTextView textView,
			SEL commandSelector);

	@Generated
	@IsOptional
	@Selector("textView:doubleClickedOnCell:inRect:")
	public native void textViewDoubleClickedOnCellInRect(NSTextView textView,
			@Mapped(ObjCObjectMapper.class) Object cell,
			@ByValue CGRect cellFrame);

	@Generated
	@IsOptional
	@Selector("textView:doubleClickedOnCell:inRect:atIndex:")
	public native void textViewDoubleClickedOnCellInRectAtIndex(
			NSTextView textView, @Mapped(ObjCObjectMapper.class) Object cell,
			@ByValue CGRect cellFrame, long charIndex);

	@Generated
	@IsOptional
	@Selector("textView:draggedCell:inRect:event:")
	public native void textViewDraggedCellInRectEvent(NSTextView view,
			@Mapped(ObjCObjectMapper.class) Object cell, @ByValue CGRect rect,
			NSEvent event);

	@Generated
	@IsOptional
	@Selector("textView:draggedCell:inRect:event:atIndex:")
	public native void textViewDraggedCellInRectEventAtIndex(NSTextView view,
			@Mapped(ObjCObjectMapper.class) Object cell, @ByValue CGRect rect,
			NSEvent event, long charIndex);

	@Generated
	@IsOptional
	@Selector("textView:menu:forEvent:atIndex:")
	public native NSMenu textViewMenuForEventAtIndex(NSTextView view,
			NSMenu menu, NSEvent event, long charIndex);

	@Generated
	@IsOptional
	@Selector("textView:shouldChangeTextInRange:replacementString:")
	public native boolean textViewShouldChangeTextInRangeReplacementString(
			NSTextView textView, @ByValue NSRange affectedCharRange,
			String replacementString);

	@Generated
	@IsOptional
	@Selector("textView:shouldChangeTextInRanges:replacementStrings:")
	public native boolean textViewShouldChangeTextInRangesReplacementStrings(
			NSTextView textView, NSArray affectedRanges,
			NSArray replacementStrings);

	@Generated
	@IsOptional
	@Selector("textView:shouldChangeTypingAttributes:toAttributes:")
	public native NSDictionary textViewShouldChangeTypingAttributesToAttributes(
			NSTextView textView, NSDictionary oldTypingAttributes,
			NSDictionary newTypingAttributes);

	@Generated
	@IsOptional
	@Selector("textView:shouldSetSpellingState:range:")
	public native long textViewShouldSetSpellingStateRange(NSTextView textView,
			long value, @ByValue NSRange affectedCharRange);

	@Generated
	@IsOptional
	@Selector("textView:willChangeSelectionFromCharacterRange:toCharacterRange:")
	@ByValue
	public native NSRange textViewWillChangeSelectionFromCharacterRangeToCharacterRange(
			NSTextView textView, @ByValue NSRange oldSelectedCharRange,
			@ByValue NSRange newSelectedCharRange);

	@Generated
	@IsOptional
	@Selector("textView:willChangeSelectionFromCharacterRanges:toCharacterRanges:")
	public native NSArray textViewWillChangeSelectionFromCharacterRangesToCharacterRanges(
			NSTextView textView, NSArray oldSelectedCharRanges,
			NSArray newSelectedCharRanges);

	@Generated
	@IsOptional
	@Selector("textView:willCheckTextInRange:options:types:")
	public native NSDictionary textViewWillCheckTextInRangeOptionsTypes(
			NSTextView view, @ByValue NSRange range, NSDictionary options,
			LongPtr checkingTypes);

	@Generated
	@IsOptional
	@Selector("textView:willDisplayToolTip:forCharacterAtIndex:")
	public native String textViewWillDisplayToolTipForCharacterAtIndex(
			NSTextView textView, String tooltip, long characterIndex);

	@Generated
	@IsOptional
	@Selector("textView:willShowSharingServicePicker:forItems:")
	public native NSSharingServicePicker textViewWillShowSharingServicePickerForItems(
			NSTextView textView, NSSharingServicePicker servicePicker,
			NSArray items);

	@Generated
	@IsOptional
	@Selector("textView:writablePasteboardTypesForCell:atIndex:")
	public native NSArray textViewWritablePasteboardTypesForCellAtIndex(
			NSTextView view, @Mapped(ObjCObjectMapper.class) Object cell,
			long charIndex);

	@Generated
	@IsOptional
	@Selector("textView:writeCell:atIndex:toPasteboard:type:")
	public native boolean textViewWriteCellAtIndexToPasteboardType(
			NSTextView view, @Mapped(ObjCObjectMapper.class) Object cell,
			long charIndex, NSPasteboard pboard, String type);

	@Generated
	@IsOptional
	@Selector("textViewDidChangeSelection:")
	public native void textViewDidChangeSelection(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("textViewDidChangeTypingAttributes:")
	public native void textViewDidChangeTypingAttributes(
			NSNotification notification);

	@Generated
	@Selector("tile")
	public native void tile();

	@Generated
	@IsOptional
	@Selector("undoManagerForTextView:")
	public native NSUndoManager undoManagerForTextView(NSTextView view);

	@Generated
	@Selector("usesAlternatingRowBackgroundColors")
	public native boolean usesAlternatingRowBackgroundColors();

	@Generated
	@Selector("validateUserInterfaceItem:")
	public native boolean validateUserInterfaceItem(
			@Mapped(ObjCObjectMapper.class) Object anItem);

	@Generated
	@Selector("verticalMotionCanBeginDrag")
	public native boolean verticalMotionCanBeginDrag();

	@Generated
	@Selector("viewAtColumn:row:makeIfNecessary:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object viewAtColumnRowMakeIfNecessary(long column, long row,
			boolean makeIfNecessary);
}
