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
@ObjCProtocolName("NSOutlineViewDelegate")
public interface NSOutlineViewDelegate extends NSControlTextEditingDelegate {
	@Generated
	@IsOptional
	@Selector("outlineView:dataCellForTableColumn:item:")
	public NSCell outlineViewDataCellForTableColumnItem(
			NSOutlineView outlineView, NSTableColumn tableColumn,
			@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@IsOptional
	@Selector("outlineView:didAddRowView:forRow:")
	public void outlineViewDidAddRowViewForRow(NSOutlineView outlineView,
			NSTableRowView rowView, long row);

	@Generated
	@IsOptional
	@Selector("outlineView:didClickTableColumn:")
	public void outlineViewDidClickTableColumn(NSOutlineView outlineView,
			NSTableColumn tableColumn);

	@Generated
	@IsOptional
	@Selector("outlineView:didDragTableColumn:")
	public void outlineViewDidDragTableColumn(NSOutlineView outlineView,
			NSTableColumn tableColumn);

	@Generated
	@IsOptional
	@Selector("outlineView:didRemoveRowView:forRow:")
	public void outlineViewDidRemoveRowViewForRow(NSOutlineView outlineView,
			NSTableRowView rowView, long row);

	@Generated
	@IsOptional
	@Selector("outlineView:heightOfRowByItem:")
	public double outlineViewHeightOfRowByItem(NSOutlineView outlineView,
			@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@IsOptional
	@Selector("outlineView:isGroupItem:")
	public boolean outlineViewIsGroupItem(NSOutlineView outlineView,
			@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@IsOptional
	@Selector("outlineView:mouseDownInHeaderOfTableColumn:")
	public void outlineViewMouseDownInHeaderOfTableColumn(
			NSOutlineView outlineView, NSTableColumn tableColumn);

	@Generated
	@IsOptional
	@Selector("outlineView:nextTypeSelectMatchFromItem:toItem:forString:")
	@MappedReturn(ObjCObjectMapper.class)
	public Object outlineViewNextTypeSelectMatchFromItemToItemForString(
			NSOutlineView outlineView,
			@Mapped(ObjCObjectMapper.class) Object startItem,
			@Mapped(ObjCObjectMapper.class) Object endItem, String searchString);

	@Generated
	@IsOptional
	@Selector("outlineView:rowViewForItem:")
	public NSTableRowView outlineViewRowViewForItem(NSOutlineView outlineView,
			@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@IsOptional
	@Selector("outlineView:selectionIndexesForProposedSelection:")
	public NSIndexSet outlineViewSelectionIndexesForProposedSelection(
			NSOutlineView outlineView, NSIndexSet proposedSelectionIndexes);

	@Generated
	@IsOptional
	@Selector("outlineView:shouldCollapseItem:")
	public boolean outlineViewShouldCollapseItem(NSOutlineView outlineView,
			@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@IsOptional
	@Selector("outlineView:shouldEditTableColumn:item:")
	public boolean outlineViewShouldEditTableColumnItem(
			NSOutlineView outlineView, NSTableColumn tableColumn,
			@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@IsOptional
	@Selector("outlineView:shouldExpandItem:")
	public boolean outlineViewShouldExpandItem(NSOutlineView outlineView,
			@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@IsOptional
	@Selector("outlineView:shouldReorderColumn:toColumn:")
	public boolean outlineViewShouldReorderColumnToColumn(
			NSOutlineView outlineView, long columnIndex, long newColumnIndex);

	@Generated
	@IsOptional
	@Selector("outlineView:shouldSelectItem:")
	public boolean outlineViewShouldSelectItem(NSOutlineView outlineView,
			@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@IsOptional
	@Selector("outlineView:shouldSelectTableColumn:")
	public boolean outlineViewShouldSelectTableColumn(
			NSOutlineView outlineView, NSTableColumn tableColumn);

	@Generated
	@IsOptional
	@Selector("outlineView:shouldShowCellExpansionForTableColumn:item:")
	public boolean outlineViewShouldShowCellExpansionForTableColumnItem(
			NSOutlineView outlineView, NSTableColumn tableColumn,
			@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@IsOptional
	@Selector("outlineView:shouldShowOutlineCellForItem:")
	public boolean outlineViewShouldShowOutlineCellForItem(
			NSOutlineView outlineView,
			@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@IsOptional
	@Selector("outlineView:shouldTrackCell:forTableColumn:item:")
	public boolean outlineViewShouldTrackCellForTableColumnItem(
			NSOutlineView outlineView, NSCell cell, NSTableColumn tableColumn,
			@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@IsOptional
	@Selector("outlineView:shouldTypeSelectForEvent:withCurrentSearchString:")
	public boolean outlineViewShouldTypeSelectForEventWithCurrentSearchString(
			NSOutlineView outlineView, NSEvent event, String searchString);

	@Generated
	@IsOptional
	@Selector("outlineView:sizeToFitWidthOfColumn:")
	public double outlineViewSizeToFitWidthOfColumn(NSOutlineView outlineView,
			long column);

	@Generated
	@IsOptional
	@Selector("outlineView:toolTipForCell:rect:tableColumn:item:mouseLocation:")
	public String outlineViewToolTipForCellRectTableColumnItemMouseLocation(
			NSOutlineView outlineView,
			NSCell cell,
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect rect,
			NSTableColumn tableColumn,
			@Mapped(ObjCObjectMapper.class) Object item,
			@ByValue CGPoint mouseLocation);

	@Generated
	@IsOptional
	@Selector("outlineView:typeSelectStringForTableColumn:item:")
	public String outlineViewTypeSelectStringForTableColumnItem(
			NSOutlineView outlineView, NSTableColumn tableColumn,
			@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@IsOptional
	@Selector("outlineView:viewForTableColumn:item:")
	public NSView outlineViewViewForTableColumnItem(NSOutlineView outlineView,
			NSTableColumn tableColumn,
			@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@IsOptional
	@Selector("outlineView:willDisplayCell:forTableColumn:item:")
	public void outlineViewWillDisplayCellForTableColumnItem(
			NSOutlineView outlineView,
			@Mapped(ObjCObjectMapper.class) Object cell,
			NSTableColumn tableColumn,
			@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@IsOptional
	@Selector("outlineView:willDisplayOutlineCell:forTableColumn:item:")
	public void outlineViewWillDisplayOutlineCellForTableColumnItem(
			NSOutlineView outlineView,
			@Mapped(ObjCObjectMapper.class) Object cell,
			NSTableColumn tableColumn,
			@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@IsOptional
	@Selector("outlineViewColumnDidMove:")
	public void outlineViewColumnDidMove(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("outlineViewColumnDidResize:")
	public void outlineViewColumnDidResize(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("outlineViewItemDidCollapse:")
	public void outlineViewItemDidCollapse(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("outlineViewItemDidExpand:")
	public void outlineViewItemDidExpand(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("outlineViewItemWillCollapse:")
	public void outlineViewItemWillCollapse(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("outlineViewItemWillExpand:")
	public void outlineViewItemWillExpand(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("outlineViewSelectionDidChange:")
	public void outlineViewSelectionDidChange(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("outlineViewSelectionIsChanging:")
	public void outlineViewSelectionIsChanging(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("selectionShouldChangeInOutlineView:")
	public boolean selectionShouldChangeInOutlineView(NSOutlineView outlineView);
}
