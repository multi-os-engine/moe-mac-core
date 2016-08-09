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


import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.appkit.protocol.NSUserInterfaceValidations;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.coregraphics.struct.CGSize;
import mac.foundation.NSArray;
import mac.foundation.NSNotification;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMatrix extends NSControl implements NSUserInterfaceValidations {
	static {
		NatJ.register();
	}

	@Generated
	protected NSMatrix(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("acceptsFirstMouse:")
	public native boolean acceptsFirstMouse(NSEvent theEvent);

	@Generated
	@Selector("addColumn")
	public native void addColumn();

	@Generated
	@Selector("addColumnWithCells:")
	public native void addColumnWithCells(NSArray newCells);

	@Generated
	@Selector("addRow")
	public native void addRow();

	@Generated
	@Selector("addRowWithCells:")
	public native void addRowWithCells(NSArray newCells);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSMatrix alloc();

	@Generated
	@Selector("allowsEmptySelection")
	public native boolean allowsEmptySelection();

	@Generated
	@Selector("autorecalculatesCellSize")
	public native boolean autorecalculatesCellSize();

	@Generated
	@Selector("autosizesCells")
	public native boolean autosizesCells();

	@Generated
	@Selector("backgroundColor")
	public native NSColor backgroundColor();

	@Generated
	@Selector("cellAtRow:column:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object cellAtRowColumn(long row, long col);

	@Generated
	@Selector("cellBackgroundColor")
	public native NSColor cellBackgroundColor();

	@Generated
	@Selector("cellClass")
	public native Class cellClass();

	@Generated
	@Selector("cellFrameAtRow:column:")
	@ByValue
	public native CGRect cellFrameAtRowColumn(long row, long col);

	@Generated
	@Selector("cellSize")
	@ByValue
	public native CGSize cellSize();

	@Generated
	@Selector("cellWithTag:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object cellWithTag(long anInt);

	@Generated
	@Selector("cells")
	public native NSArray cells();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("deselectAllCells")
	public native void deselectAllCells();

	@Generated
	@Selector("deselectSelectedCell")
	public native void deselectSelectedCell();

	@Generated
	@Selector("doubleAction")
	public native SEL doubleAction();

	@Generated
	@Selector("drawCellAtRow:column:")
	public native void drawCellAtRowColumn(long row, long col);

	@Generated
	@Selector("drawsBackground")
	public native boolean drawsBackground();

	@Generated
	@Selector("drawsCellBackground")
	public native boolean drawsCellBackground();

	@Generated
	@Selector("getNumberOfRows:columns:")
	public native void getNumberOfRowsColumns(LongPtr rowCount, LongPtr colCount);

	@Generated
	@Selector("getRow:column:forPoint:")
	public native boolean getRowColumnForPoint(LongPtr row, LongPtr col,
			@ByValue CGPoint aPoint);

	@Generated
	@Selector("getRow:column:ofCell:")
	public native boolean getRowColumnOfCell(LongPtr row, LongPtr col,
			NSCell aCell);

	@Generated
	@Selector("highlightCell:atRow:column:")
	public native void highlightCellAtRowColumn(boolean flag, long row, long col);

	@Generated
	@Selector("init")
	public native NSMatrix init();

	@Generated
	@Selector("initWithFrame:")
	public native NSMatrix initWithFrame(@ByValue CGRect frameRect);

	@Generated
	@Selector("initWithFrame:mode:cellClass:numberOfRows:numberOfColumns:")
	public native NSMatrix initWithFrameModeCellClassNumberOfRowsNumberOfColumns(
			@ByValue CGRect frameRect, long aMode, Class factoryId,
			long rowsHigh, long colsWide);

	@Generated
	@Selector("initWithFrame:mode:prototype:numberOfRows:numberOfColumns:")
	public native NSMatrix initWithFrameModePrototypeNumberOfRowsNumberOfColumns(
			@ByValue CGRect frameRect, long aMode, NSCell aCell, long rowsHigh,
			long colsWide);

	@Generated
	@Selector("insertColumn:")
	public native void insertColumn(long column);

	@Generated
	@Selector("insertColumn:withCells:")
	public native void insertColumnWithCells(long column, NSArray newCells);

	@Generated
	@Selector("insertRow:")
	public native void insertRow(long row);

	@Generated
	@Selector("insertRow:withCells:")
	public native void insertRowWithCells(long row, NSArray newCells);

	@Generated
	@Selector("intercellSpacing")
	@ByValue
	public native CGSize intercellSpacing();

	@Generated
	@Selector("isAutoscroll")
	public native boolean isAutoscroll();

	@Generated
	@Selector("isSelectionByRect")
	public native boolean isSelectionByRect();

	@Generated
	@Selector("keyCell")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object keyCell();

	@Generated
	@Selector("makeCellAtRow:column:")
	public native NSCell makeCellAtRowColumn(long row, long col);

	@Generated
	@Selector("mode")
	public native long mode();

	@Generated
	@Selector("mouseDown:")
	public native void mouseDown(NSEvent theEvent);

	@Generated
	@Selector("mouseDownFlags")
	public native long mouseDownFlags();

	@Generated
	@Selector("numberOfColumns")
	public native long numberOfColumns();

	@Generated
	@Selector("numberOfRows")
	public native long numberOfRows();

	@Generated
	@Selector("performKeyEquivalent:")
	public native boolean performKeyEquivalent(NSEvent theEvent);

	@Generated
	@Selector("prototype")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object prototype();

	@Generated
	@Selector("putCell:atRow:column:")
	public native void putCellAtRowColumn(NSCell newCell, long row, long col);

	@Generated
	@Selector("removeColumn:")
	public native void removeColumn(long col);

	@Generated
	@Selector("removeRow:")
	public native void removeRow(long row);

	@Generated
	@Selector("renewRows:columns:")
	public native void renewRowsColumns(long newRows, long newCols);

	@Generated
	@Selector("resetCursorRects")
	public native void resetCursorRects();

	@Generated
	@Selector("scrollCellToVisibleAtRow:column:")
	public native void scrollCellToVisibleAtRowColumn(long row, long col);

	@Generated
	@Selector("selectAll:")
	public native void selectAll(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("selectCellAtRow:column:")
	public native void selectCellAtRowColumn(long row, long col);

	@Generated
	@Selector("selectCellWithTag:")
	public native boolean selectCellWithTag(long anInt);

	@Generated
	@Selector("selectText:")
	public native void selectText(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("selectTextAtRow:column:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object selectTextAtRowColumn(long row, long col);

	@Generated
	@Selector("selectedCell")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object selectedCell();

	@Generated
	@Selector("selectedCells")
	public native NSArray selectedCells();

	@Generated
	@Selector("selectedColumn")
	public native long selectedColumn();

	@Generated
	@Selector("selectedRow")
	public native long selectedRow();

	@Generated
	@Selector("sendAction")
	public native boolean sendAction();

	@Generated
	@Selector("sendAction:to:forAllCells:")
	public native void sendActionToForAllCells(SEL aSelector,
			@Mapped(ObjCObjectMapper.class) Object anObject, boolean flag);

	@Generated
	@Selector("sendDoubleAction")
	public native void sendDoubleAction();

	@Generated
	@Selector("setAllowsEmptySelection:")
	public native void setAllowsEmptySelection(boolean flag);

	@Generated
	@Selector("setAutorecalculatesCellSize:")
	public native void setAutorecalculatesCellSize(boolean flag);

	@Generated
	@Selector("setAutoscroll:")
	public native void setAutoscroll(boolean flag);

	@Generated
	@Selector("setAutosizesCells:")
	public native void setAutosizesCells(boolean flag);

	@Generated
	@Selector("setBackgroundColor:")
	public native void setBackgroundColor(NSColor color);

	@Generated
	@Selector("setCellBackgroundColor:")
	public native void setCellBackgroundColor(NSColor color);

	@Generated
	@Selector("setCellClass:")
	public native void setCellClass(Class factoryId);

	@Generated
	@Selector("setCellSize:")
	public native void setCellSize(@ByValue CGSize aSize);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("setDoubleAction:")
	public native void setDoubleAction(SEL aSelector);

	@Generated
	@Selector("setDrawsBackground:")
	public native void setDrawsBackground(boolean flag);

	@Generated
	@Selector("setDrawsCellBackground:")
	public native void setDrawsCellBackground(boolean flag);

	@Generated
	@Selector("setIntercellSpacing:")
	public native void setIntercellSpacing(@ByValue CGSize aSize);

	@Generated
	@Selector("setKeyCell:")
	public native void setKeyCell(NSCell keyCell);

	@Generated
	@Selector("setMode:")
	public native void setMode(long aMode);

	@Generated
	@Selector("setPrototype:")
	public native void setPrototype(NSCell aCell);

	@Generated
	@Selector("setScrollable:")
	public native void setScrollable(boolean flag);

	@Generated
	@Selector("setSelectionByRect:")
	public native void setSelectionByRect(boolean flag);

	@Generated
	@Selector("setSelectionFrom:to:anchor:highlight:")
	public native void setSelectionFromToAnchorHighlight(long startPos,
			long endPos, long anchorPos, boolean lit);

	@Generated
	@Selector("setState:atRow:column:")
	public native void setStateAtRowColumn(long value, long row, long col);

	@Generated
	@Selector("setTabKeyTraversesCells:")
	public native void setTabKeyTraversesCells(boolean flag);

	@Generated
	@Selector("setToolTip:forCell:")
	public native void setToolTipForCell(String toolTipString, NSCell cell);

	@Generated
	@Selector("setValidateSize:")
	public native void setValidateSize(boolean flag);

	@Generated
	@Selector("sizeToCells")
	public native void sizeToCells();

	@Generated
	@Selector("sortUsingFunction:context:")
	public native void sortUsingFunctionContext(
			@FunctionPtr(name = "call_sortUsingFunctionContext") Function_sortUsingFunctionContext compare,
			VoidPtr context);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Function_sortUsingFunctionContext {
		@Generated
		public long call_sortUsingFunctionContext(
				@Mapped(ObjCObjectMapper.class) Object arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1, VoidPtr arg2);
	}

	@Generated
	@Selector("sortUsingSelector:")
	public native void sortUsingSelector(SEL comparator);

	@Generated
	@Selector("tabKeyTraversesCells")
	public native boolean tabKeyTraversesCells();

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
	@Selector("toolTipForCell:")
	public native String toolTipForCell(NSCell cell);

	@Generated
	@Selector("validateUserInterfaceItem:")
	public native boolean validateUserInterfaceItem(
			@Mapped(ObjCObjectMapper.class) Object anItem);
}
