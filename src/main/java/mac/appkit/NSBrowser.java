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
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSArray;
import mac.foundation.NSIndexPath;
import mac.foundation.NSIndexSet;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSBrowser extends NSControl {
	static {
		NatJ.register();
	}

	@Generated
	protected NSBrowser(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("acceptsArrowKeys")
	public native boolean acceptsArrowKeys();

	@Generated
	@Selector("addColumn")
	public native void addColumn();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSBrowser alloc();

	@Generated
	@Selector("allowsBranchSelection")
	public native boolean allowsBranchSelection();

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
	@Selector("autohidesScroller")
	public native boolean autohidesScroller();

	@Generated
	@Selector("backgroundColor")
	public native NSColor backgroundColor();

	@Generated
	@Selector("canDragRowsWithIndexes:inColumn:withEvent:")
	public native boolean canDragRowsWithIndexesInColumnWithEvent(
			NSIndexSet rowIndexes, long column, NSEvent event);

	@Generated
	@Selector("cellClass")
	public static native Class cellClass();

	@Generated
	@Selector("cellPrototype")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object cellPrototype();

	@Generated
	@Selector("clickedColumn")
	public native long clickedColumn();

	@Generated
	@Selector("clickedRow")
	public native long clickedRow();

	@Generated
	@Selector("columnContentWidthForColumnWidth:")
	public native double columnContentWidthForColumnWidth(double columnWidth);

	@Generated
	@Selector("columnOfMatrix:")
	public native long columnOfMatrix(NSMatrix matrix);

	@Generated
	@Selector("columnResizingType")
	public native long columnResizingType();

	@Generated
	@Selector("columnWidthForColumnContentWidth:")
	public native double columnWidthForColumnContentWidth(
			double columnContentWidth);

	@Generated
	@Selector("columnsAutosaveName")
	public native String columnsAutosaveName();

	@Generated
	@Selector("defaultColumnWidth")
	public native double defaultColumnWidth();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("displayAllColumns")
	public native void displayAllColumns();

	@Generated
	@Selector("displayColumn:")
	public native void displayColumn(long column);

	@Generated
	@Selector("doClick:")
	public native void doClick(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("doDoubleClick:")
	public native void doDoubleClick(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("doubleAction")
	public native SEL doubleAction();

	@Generated
	@Selector("draggingImageForRowsWithIndexes:inColumn:withEvent:offset:")
	public native NSImage draggingImageForRowsWithIndexesInColumnWithEventOffset(
			NSIndexSet rowIndexes,
			long column,
			NSEvent event,
			@UncertainArgument("Options: reference, array Fallback: reference") CGPoint dragImageOffset);

	@Generated
	@Selector("drawTitleOfColumn:inRect:")
	public native void drawTitleOfColumnInRect(long column,
			@ByValue CGRect aRect);

	@Generated
	@Selector("editItemAtIndexPath:withEvent:select:")
	public native void editItemAtIndexPathWithEventSelect(
			NSIndexPath indexPath, NSEvent theEvent, boolean select);

	@Generated
	@Selector("firstVisibleColumn")
	public native long firstVisibleColumn();

	@Generated
	@Selector("frameOfColumn:")
	@ByValue
	public native CGRect frameOfColumn(long column);

	@Generated
	@Selector("frameOfInsideOfColumn:")
	@ByValue
	public native CGRect frameOfInsideOfColumn(long column);

	@Generated
	@Selector("frameOfRow:inColumn:")
	@ByValue
	public native CGRect frameOfRowInColumn(long row, long column);

	@Generated
	@Selector("getRow:column:forPoint:")
	public native boolean getRowColumnForPoint(LongPtr row, LongPtr column,
			@ByValue CGPoint point);

	@Generated
	@Selector("hasHorizontalScroller")
	public native boolean hasHorizontalScroller();

	@Generated
	@Selector("indexPathForColumn:")
	public native NSIndexPath indexPathForColumn(long column);

	@Generated
	@Selector("init")
	public native NSBrowser init();

	@Generated
	@Selector("initWithFrame:")
	public native NSBrowser initWithFrame(@ByValue CGRect frameRect);

	@Generated
	@Selector("isLeafItem:")
	public native boolean isLeafItem(@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@Selector("isLoaded")
	public native boolean isLoaded();

	@Generated
	@Selector("isTitled")
	public native boolean isTitled();

	@Generated
	@Selector("itemAtIndexPath:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object itemAtIndexPath(NSIndexPath indexPath);

	@Generated
	@Selector("itemAtRow:inColumn:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object itemAtRowInColumn(long row, long column);

	@Generated
	@Selector("lastColumn")
	public native long lastColumn();

	@Generated
	@Selector("lastVisibleColumn")
	public native long lastVisibleColumn();

	@Generated
	@Selector("loadColumnZero")
	public native void loadColumnZero();

	@Generated
	@Selector("loadedCellAtRow:column:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object loadedCellAtRowColumn(long row, long col);

	@Generated
	@Selector("matrixClass")
	public native Class matrixClass();

	@Generated
	@Selector("matrixInColumn:")
	public native NSMatrix matrixInColumn(long column);

	@Generated
	@Selector("maxVisibleColumns")
	public native long maxVisibleColumns();

	@Generated
	@Selector("minColumnWidth")
	public native double minColumnWidth();

	@Generated
	@Selector("noteHeightOfRowsWithIndexesChanged:inColumn:")
	public native void noteHeightOfRowsWithIndexesChangedInColumn(
			NSIndexSet indexSet, long columnIndex);

	@Generated
	@Selector("numberOfVisibleColumns")
	public native long numberOfVisibleColumns();

	@Generated
	@Selector("parentForItemsInColumn:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object parentForItemsInColumn(long column);

	@Generated
	@Selector("path")
	public native String path();

	@Generated
	@Selector("pathSeparator")
	public native String pathSeparator();

	@Generated
	@Selector("pathToColumn:")
	public native String pathToColumn(long column);

	@Generated
	@Selector("prefersAllColumnUserResizing")
	public native boolean prefersAllColumnUserResizing();

	@Generated
	@Selector("reloadColumn:")
	public native void reloadColumn(long column);

	@Generated
	@Selector("reloadDataForRowIndexes:inColumn:")
	public native void reloadDataForRowIndexesInColumn(NSIndexSet rowIndexes,
			long column);

	@Generated
	@Selector("removeSavedColumnsWithAutosaveName:")
	public static native void removeSavedColumnsWithAutosaveName(String name);

	@Generated
	@Selector("reusesColumns")
	public native boolean reusesColumns();

	@Generated
	@Selector("rowHeight")
	public native double rowHeight();

	@Generated
	@Selector("scrollColumnToVisible:")
	public native void scrollColumnToVisible(long column);

	@Generated
	@Selector("scrollColumnsLeftBy:")
	public native void scrollColumnsLeftBy(long shiftAmount);

	@Generated
	@Selector("scrollColumnsRightBy:")
	public native void scrollColumnsRightBy(long shiftAmount);

	@Generated
	@Selector("scrollRowToVisible:inColumn:")
	public native void scrollRowToVisibleInColumn(long row, long column);

	@Generated
	@Selector("scrollViaScroller:")
	public native void scrollViaScroller(NSScroller sender);

	@Generated
	@Selector("selectAll:")
	public native void selectAll(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("selectRow:inColumn:")
	public native void selectRowInColumn(long row, long column);

	@Generated
	@Selector("selectRowIndexes:inColumn:")
	public native void selectRowIndexesInColumn(NSIndexSet indexes, long column);

	@Generated
	@Selector("selectedCell")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object selectedCell();

	@Generated
	@Selector("selectedCellInColumn:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object selectedCellInColumn(long column);

	@Generated
	@Selector("selectedCells")
	public native NSArray selectedCells();

	@Generated
	@Selector("selectedColumn")
	public native long selectedColumn();

	@Generated
	@Selector("selectedRowInColumn:")
	public native long selectedRowInColumn(long column);

	@Generated
	@Selector("selectedRowIndexesInColumn:")
	public native NSIndexSet selectedRowIndexesInColumn(long column);

	@Generated
	@Selector("selectionIndexPath")
	public native NSIndexPath selectionIndexPath();

	@Generated
	@Selector("selectionIndexPaths")
	public native NSArray selectionIndexPaths();

	@Generated
	@Selector("sendAction")
	public native boolean sendAction();

	@Generated
	@Selector("sendsActionOnArrowKeys")
	public native boolean sendsActionOnArrowKeys();

	@Generated
	@Selector("separatesColumns")
	public native boolean separatesColumns();

	@Generated
	@Selector("setAcceptsArrowKeys:")
	public native void setAcceptsArrowKeys(boolean flag);

	@Generated
	@Selector("setAllowsBranchSelection:")
	public native void setAllowsBranchSelection(boolean flag);

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
	@Selector("setAutohidesScroller:")
	public native void setAutohidesScroller(boolean flag);

	@Generated
	@Selector("setBackgroundColor:")
	public native void setBackgroundColor(NSColor color);

	@Generated
	@Selector("setCellClass:")
	public native void setCellClass(Class factoryId);

	@Generated
	@Selector("setCellPrototype:")
	public native void setCellPrototype(NSCell aCell);

	@Generated
	@Selector("setColumnResizingType:")
	public native void setColumnResizingType(long columnResizingType);

	@Generated
	@Selector("setColumnsAutosaveName:")
	public native void setColumnsAutosaveName(String name);

	@Generated
	@Selector("setDefaultColumnWidth:")
	public native void setDefaultColumnWidth(double columnWidth);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("setDoubleAction:")
	public native void setDoubleAction(SEL aSelector);

	@Generated
	@Selector("setDraggingSourceOperationMask:forLocal:")
	public native void setDraggingSourceOperationMaskForLocal(long mask,
			boolean isLocal);

	@Generated
	@Selector("setHasHorizontalScroller:")
	public native void setHasHorizontalScroller(boolean flag);

	@Generated
	@Selector("setLastColumn:")
	public native void setLastColumn(long column);

	@Generated
	@Selector("setMatrixClass:")
	public native void setMatrixClass(Class factoryId);

	@Generated
	@Selector("setMaxVisibleColumns:")
	public native void setMaxVisibleColumns(long columnCount);

	@Generated
	@Selector("setMinColumnWidth:")
	public native void setMinColumnWidth(double columnWidth);

	@Generated
	@Selector("setPath:")
	public native boolean setPath(String path);

	@Generated
	@Selector("setPathSeparator:")
	public native void setPathSeparator(String newString);

	@Generated
	@Selector("setPrefersAllColumnUserResizing:")
	public native void setPrefersAllColumnUserResizing(
			boolean prefersAllColumnResizing);

	@Generated
	@Selector("setReusesColumns:")
	public native void setReusesColumns(boolean flag);

	@Generated
	@Selector("setRowHeight:")
	public native void setRowHeight(double height);

	@Generated
	@Selector("setSelectionIndexPath:")
	public native void setSelectionIndexPath(NSIndexPath path);

	@Generated
	@Selector("setSelectionIndexPaths:")
	public native void setSelectionIndexPaths(NSArray paths);

	@Generated
	@Selector("setSendsActionOnArrowKeys:")
	public native void setSendsActionOnArrowKeys(boolean flag);

	@Generated
	@Selector("setSeparatesColumns:")
	public native void setSeparatesColumns(boolean flag);

	@Generated
	@Selector("setTakesTitleFromPreviousColumn:")
	public native void setTakesTitleFromPreviousColumn(boolean flag);

	@Generated
	@Selector("setTitle:ofColumn:")
	public native void setTitleOfColumn(String aString, long column);

	@Generated
	@Selector("setTitled:")
	public native void setTitled(boolean flag);

	@Generated
	@Selector("setWidth:ofColumn:")
	public native void setWidthOfColumn(double columnWidth, long columnIndex);

	@Generated
	@Selector("takesTitleFromPreviousColumn")
	public native boolean takesTitleFromPreviousColumn();

	@Generated
	@Selector("tile")
	public native void tile();

	@Generated
	@Selector("titleFrameOfColumn:")
	@ByValue
	public native CGRect titleFrameOfColumn(long column);

	@Generated
	@Selector("titleHeight")
	public native double titleHeight();

	@Generated
	@Selector("titleOfColumn:")
	public native String titleOfColumn(long column);

	@Generated
	@Selector("updateScroller")
	public native void updateScroller();

	@Generated
	@Selector("validateVisibleColumns")
	public native void validateVisibleColumns();

	@Generated
	@Selector("widthOfColumn:")
	public native double widthOfColumn(long column);
}
