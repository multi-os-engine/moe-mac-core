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
import mac.foundation.NSURL;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSCollectionViewDelegate")
public interface NSCollectionViewDelegate {
	@Generated
	@IsOptional
	@Selector("collectionView:acceptDrop:index:dropOperation:")
	public boolean collectionViewAcceptDropIndexDropOperation(
			NSCollectionView collectionView,
			@Mapped(ObjCObjectMapper.class) Object draggingInfo, long index,
			long dropOperation);

	@Generated
	@IsOptional
	@Selector("collectionView:canDragItemsAtIndexes:withEvent:")
	public boolean collectionViewCanDragItemsAtIndexesWithEvent(
			NSCollectionView collectionView, NSIndexSet indexes, NSEvent event);

	@Generated
	@IsOptional
	@Selector("collectionView:draggingImageForItemsAtIndexes:withEvent:offset:")
	public NSImage collectionViewDraggingImageForItemsAtIndexesWithEventOffset(
			NSCollectionView collectionView,
			NSIndexSet indexes,
			NSEvent event,
			@UncertainArgument("Options: reference, array Fallback: reference") CGPoint dragImageOffset);

	@Generated
	@IsOptional
	@Selector("collectionView:draggingSession:endedAtPoint:dragOperation:")
	public void collectionViewDraggingSessionEndedAtPointDragOperation(
			NSCollectionView collectionView, NSDraggingSession session,
			@ByValue CGPoint screenPoint, long operation);

	@Generated
	@IsOptional
	@Selector("collectionView:draggingSession:willBeginAtPoint:forItemsAtIndexes:")
	public void collectionViewDraggingSessionWillBeginAtPointForItemsAtIndexes(
			NSCollectionView collectionView, NSDraggingSession session,
			@ByValue CGPoint screenPoint, NSIndexSet indexes);

	@Generated
	@IsOptional
	@Selector("collectionView:namesOfPromisedFilesDroppedAtDestination:forDraggedItemsAtIndexes:")
	public NSArray collectionViewNamesOfPromisedFilesDroppedAtDestinationForDraggedItemsAtIndexes(
			NSCollectionView collectionView, NSURL dropURL, NSIndexSet indexes);

	@Generated
	@IsOptional
	@Selector("collectionView:pasteboardWriterForItemAtIndex:")
	@MappedReturn(ObjCObjectMapper.class)
	public Object collectionViewPasteboardWriterForItemAtIndex(
			NSCollectionView collectionView, long index);

	@Generated
	@IsOptional
	@Selector("collectionView:updateDraggingItemsForDrag:")
	public void collectionViewUpdateDraggingItemsForDrag(
			NSCollectionView collectionView,
			@Mapped(ObjCObjectMapper.class) Object draggingInfo);

	@Generated
	@IsOptional
	@Selector("collectionView:validateDrop:proposedIndex:dropOperation:")
	public long collectionViewValidateDropProposedIndexDropOperation(
			NSCollectionView collectionView,
			@Mapped(ObjCObjectMapper.class) Object draggingInfo,
			LongPtr proposedDropIndex, LongPtr proposedDropOperation);

	@Generated
	@IsOptional
	@Selector("collectionView:writeItemsAtIndexes:toPasteboard:")
	public boolean collectionViewWriteItemsAtIndexesToPasteboard(
			NSCollectionView collectionView, NSIndexSet indexes,
			NSPasteboard pasteboard);
}
