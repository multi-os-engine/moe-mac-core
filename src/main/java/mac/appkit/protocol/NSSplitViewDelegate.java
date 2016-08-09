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


import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import mac.appkit.NSSplitView;
import mac.appkit.NSView;
import mac.coregraphics.struct.CGRect;
import mac.coregraphics.struct.CGSize;
import mac.foundation.NSNotification;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSSplitViewDelegate")
public interface NSSplitViewDelegate {
	@Generated
	@IsOptional
	@Selector("splitView:additionalEffectiveRectOfDividerAtIndex:")
	@ByValue
	public CGRect splitViewAdditionalEffectiveRectOfDividerAtIndex(
			NSSplitView splitView, long dividerIndex);

	@Generated
	@IsOptional
	@Selector("splitView:canCollapseSubview:")
	public boolean splitViewCanCollapseSubview(NSSplitView splitView,
			NSView subview);

	@Generated
	@IsOptional
	@Selector("splitView:constrainMaxCoordinate:ofSubviewAt:")
	public double splitViewConstrainMaxCoordinateOfSubviewAt(
			NSSplitView splitView, double proposedMaximumPosition,
			long dividerIndex);

	@Generated
	@IsOptional
	@Selector("splitView:constrainMinCoordinate:ofSubviewAt:")
	public double splitViewConstrainMinCoordinateOfSubviewAt(
			NSSplitView splitView, double proposedMinimumPosition,
			long dividerIndex);

	@Generated
	@IsOptional
	@Selector("splitView:constrainSplitPosition:ofSubviewAt:")
	public double splitViewConstrainSplitPositionOfSubviewAt(
			NSSplitView splitView, double proposedPosition, long dividerIndex);

	@Generated
	@IsOptional
	@Selector("splitView:effectiveRect:forDrawnRect:ofDividerAtIndex:")
	@ByValue
	public CGRect splitViewEffectiveRectForDrawnRectOfDividerAtIndex(
			NSSplitView splitView, @ByValue CGRect proposedEffectiveRect,
			@ByValue CGRect drawnRect, long dividerIndex);

	@Generated
	@IsOptional
	@Selector("splitView:resizeSubviewsWithOldSize:")
	public void splitViewResizeSubviewsWithOldSize(NSSplitView splitView,
			@ByValue CGSize oldSize);

	@Generated
	@IsOptional
	@Selector("splitView:shouldAdjustSizeOfSubview:")
	public boolean splitViewShouldAdjustSizeOfSubview(NSSplitView splitView,
			NSView view);

	@Generated
	@IsOptional
	@Selector("splitView:shouldCollapseSubview:forDoubleClickOnDividerAtIndex:")
	public boolean splitViewShouldCollapseSubviewForDoubleClickOnDividerAtIndex(
			NSSplitView splitView, NSView subview, long dividerIndex);

	@Generated
	@IsOptional
	@Selector("splitView:shouldHideDividerAtIndex:")
	public boolean splitViewShouldHideDividerAtIndex(NSSplitView splitView,
			long dividerIndex);

	@Generated
	@IsOptional
	@Selector("splitViewDidResizeSubviews:")
	public void splitViewDidResizeSubviews(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("splitViewWillResizeSubviews:")
	public void splitViewWillResizeSubviews(NSNotification notification);
}
