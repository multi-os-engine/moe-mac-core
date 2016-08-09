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
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.appkit.*;
import mac.coregraphics.struct.CGPoint;
import mac.foundation.NSArray;
import mac.foundation.NSDictionary;
import mac.foundation.NSURL;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSDraggingInfo")
public interface NSDraggingInfo {
	@Generated
	@Selector("animatesToDestination")
	public boolean animatesToDestination();

	@Generated
	@Selector("draggedImage")
	public NSImage draggedImage();

	@Generated
	@Selector("draggedImageLocation")
	@ByValue
	public CGPoint draggedImageLocation();

	@Generated
	@Selector("draggingDestinationWindow")
	public NSWindow draggingDestinationWindow();

	@Generated
	@Selector("draggingFormation")
	public long draggingFormation();

	@Generated
	@Selector("draggingLocation")
	@ByValue
	public CGPoint draggingLocation();

	@Generated
	@Selector("draggingPasteboard")
	public NSPasteboard draggingPasteboard();

	@Generated
	@Selector("draggingSequenceNumber")
	public long draggingSequenceNumber();

	@Generated
	@Selector("draggingSource")
	@MappedReturn(ObjCObjectMapper.class)
	public Object draggingSource();

	@Generated
	@Selector("draggingSourceOperationMask")
	public long draggingSourceOperationMask();

	@Generated
	@Selector("enumerateDraggingItemsWithOptions:forView:classes:searchOptions:usingBlock:")
	public void enumerateDraggingItemsWithOptionsForViewClassesSearchOptionsUsingBlock(
			long enumOpts,
			NSView view,
			NSArray classArray,
			NSDictionary searchOptions,
			@ObjCBlock(name = "call_enumerateDraggingItemsWithOptionsForViewClassesSearchOptionsUsingBlock") Block_enumerateDraggingItemsWithOptionsForViewClassesSearchOptionsUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_enumerateDraggingItemsWithOptionsForViewClassesSearchOptionsUsingBlock {
		@Generated
		public void call_enumerateDraggingItemsWithOptionsForViewClassesSearchOptionsUsingBlock(
				NSDraggingItem arg0, long arg1, BoolPtr arg2);
	}

	@Generated
	@Selector("namesOfPromisedFilesDroppedAtDestination:")
	public NSArray namesOfPromisedFilesDroppedAtDestination(
			NSURL dropDestination);

	@Generated
	@Selector("numberOfValidItemsForDrop")
	public long numberOfValidItemsForDrop();

	@Generated
	@Selector("setAnimatesToDestination:")
	public void setAnimatesToDestination(boolean value);

	@Generated
	@Selector("setDraggingFormation:")
	public void setDraggingFormation(long value);

	@Generated
	@Selector("setNumberOfValidItemsForDrop:")
	public void setNumberOfValidItemsForDrop(long value);

	@Generated
	@Selector("slideDraggedImageTo:")
	public void slideDraggedImageTo(@ByValue CGPoint screenPoint);
}
