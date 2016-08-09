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
import mac.appkit.*;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSIndexSet;
import mac.foundation.NSNotification;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSTableViewDelegate")
public interface NSTableViewDelegate extends NSControlTextEditingDelegate {
	@Generated
	@IsOptional
	@Selector("selectionShouldChangeInTableView:")
	public boolean selectionShouldChangeInTableView(NSTableView tableView);

	@Generated
	@IsOptional
	@Selector("tableView:dataCellForTableColumn:row:")
	public NSCell tableViewDataCellForTableColumnRow(NSTableView tableView,
			NSTableColumn tableColumn, long row);

	@Generated
	@IsOptional
	@Selector("tableView:didAddRowView:forRow:")
	public void tableViewDidAddRowViewForRow(NSTableView tableView,
			NSTableRowView rowView, long row);

	@Generated
	@IsOptional
	@Selector("tableView:didClickTableColumn:")
	public void tableViewDidClickTableColumn(NSTableView tableView,
			NSTableColumn tableColumn);

	@Generated
	@IsOptional
	@Selector("tableView:didDragTableColumn:")
	public void tableViewDidDragTableColumn(NSTableView tableView,
			NSTableColumn tableColumn);

	@Generated
	@IsOptional
	@Selector("tableView:didRemoveRowView:forRow:")
	public void tableViewDidRemoveRowViewForRow(NSTableView tableView,
			NSTableRowView rowView, long row);

	@Generated
	@IsOptional
	@Selector("tableView:heightOfRow:")
	public double tableViewHeightOfRow(NSTableView tableView, long row);

	@Generated
	@IsOptional
	@Selector("tableView:isGroupRow:")
	public boolean tableViewIsGroupRow(NSTableView tableView, long row);

	@Generated
	@IsOptional
	@Selector("tableView:mouseDownInHeaderOfTableColumn:")
	public void tableViewMouseDownInHeaderOfTableColumn(NSTableView tableView,
			NSTableColumn tableColumn);

	@Generated
	@IsOptional
	@Selector("tableView:nextTypeSelectMatchFromRow:toRow:forString:")
	public long tableViewNextTypeSelectMatchFromRowToRowForString(
			NSTableView tableView, long startRow, long endRow,
			String searchString);

	@Generated
	@IsOptional
	@Selector("tableView:rowViewForRow:")
	public NSTableRowView tableViewRowViewForRow(NSTableView tableView, long row);

	@Generated
	@IsOptional
	@Selector("tableView:selectionIndexesForProposedSelection:")
	public NSIndexSet tableViewSelectionIndexesForProposedSelection(
			NSTableView tableView, NSIndexSet proposedSelectionIndexes);

	@Generated
	@IsOptional
	@Selector("tableView:shouldEditTableColumn:row:")
	public boolean tableViewShouldEditTableColumnRow(NSTableView tableView,
			NSTableColumn tableColumn, long row);

	@Generated
	@IsOptional
	@Selector("tableView:shouldReorderColumn:toColumn:")
	public boolean tableViewShouldReorderColumnToColumn(NSTableView tableView,
			long columnIndex, long newColumnIndex);

	@Generated
	@IsOptional
	@Selector("tableView:shouldSelectRow:")
	public boolean tableViewShouldSelectRow(NSTableView tableView, long row);

	@Generated
	@IsOptional
	@Selector("tableView:shouldSelectTableColumn:")
	public boolean tableViewShouldSelectTableColumn(NSTableView tableView,
			NSTableColumn tableColumn);

	@Generated
	@IsOptional
	@Selector("tableView:shouldShowCellExpansionForTableColumn:row:")
	public boolean tableViewShouldShowCellExpansionForTableColumnRow(
			NSTableView tableView, NSTableColumn tableColumn, long row);

	@Generated
	@IsOptional
	@Selector("tableView:shouldTrackCell:forTableColumn:row:")
	public boolean tableViewShouldTrackCellForTableColumnRow(
			NSTableView tableView, NSCell cell, NSTableColumn tableColumn,
			long row);

	@Generated
	@IsOptional
	@Selector("tableView:shouldTypeSelectForEvent:withCurrentSearchString:")
	public boolean tableViewShouldTypeSelectForEventWithCurrentSearchString(
			NSTableView tableView, NSEvent event, String searchString);

	@Generated
	@IsOptional
	@Selector("tableView:sizeToFitWidthOfColumn:")
	public double tableViewSizeToFitWidthOfColumn(NSTableView tableView,
			long column);

	@Generated
	@IsOptional
	@Selector("tableView:toolTipForCell:rect:tableColumn:row:mouseLocation:")
	public String tableViewToolTipForCellRectTableColumnRowMouseLocation(
			NSTableView tableView,
			NSCell cell,
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect rect,
			NSTableColumn tableColumn, long row, @ByValue CGPoint mouseLocation);

	@Generated
	@IsOptional
	@Selector("tableView:typeSelectStringForTableColumn:row:")
	public String tableViewTypeSelectStringForTableColumnRow(
			NSTableView tableView, NSTableColumn tableColumn, long row);

	@Generated
	@IsOptional
	@Selector("tableView:viewForTableColumn:row:")
	public NSView tableViewViewForTableColumnRow(NSTableView tableView,
			NSTableColumn tableColumn, long row);

	@Generated
	@IsOptional
	@Selector("tableView:willDisplayCell:forTableColumn:row:")
	public void tableViewWillDisplayCellForTableColumnRow(
			NSTableView tableView, @Mapped(ObjCObjectMapper.class) Object cell,
			NSTableColumn tableColumn, long row);

	@Generated
	@IsOptional
	@Selector("tableViewColumnDidMove:")
	public void tableViewColumnDidMove(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("tableViewColumnDidResize:")
	public void tableViewColumnDidResize(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("tableViewSelectionDidChange:")
	public void tableViewSelectionDidChange(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("tableViewSelectionIsChanging:")
	public void tableViewSelectionIsChanging(NSNotification notification);
}
