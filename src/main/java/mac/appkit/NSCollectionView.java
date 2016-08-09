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
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.appkit.protocol.NSDraggingDestination;
import mac.appkit.protocol.NSDraggingSource;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.coregraphics.struct.CGSize;
import mac.foundation.NSArray;
import mac.foundation.NSIndexSet;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSCollectionView extends NSView implements NSDraggingSource,
		NSDraggingDestination {
	static {
		NatJ.register();
	}

	@Generated
	protected NSCollectionView(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSCollectionView alloc();

	@Generated
	@Selector("allowsMultipleSelection")
	public native boolean allowsMultipleSelection();

	@Generated
	@Selector("backgroundColors")
	public native NSArray backgroundColors();

	@Generated
	@IsOptional
	@Selector("concludeDragOperation:")
	public native void concludeDragOperation(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("content")
	public native NSArray content();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@IsOptional
	@Selector("draggingEnded:")
	public native void draggingEnded(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@IsOptional
	@Selector("draggingEntered:")
	public native long draggingEntered(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@IsOptional
	@Selector("draggingExited:")
	public native void draggingExited(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("draggingImageForItemsAtIndexes:withEvent:offset:")
	public native NSImage draggingImageForItemsAtIndexesWithEventOffset(
			NSIndexSet indexes,
			NSEvent event,
			@UncertainArgument("Options: reference, array Fallback: reference") CGPoint dragImageOffset);

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
	@IsOptional
	@Selector("draggingUpdated:")
	public native long draggingUpdated(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("frameForItemAtIndex:")
	@ByValue
	public native CGRect frameForItemAtIndex(long index);

	@Generated
	@Selector("frameForItemAtIndex:withNumberOfItems:")
	@ByValue
	public native CGRect frameForItemAtIndexWithNumberOfItems(long index,
			long numberOfItems);

	@Generated
	@IsOptional
	@Selector("ignoreModifierKeysForDraggingSession:")
	public native boolean ignoreModifierKeysForDraggingSession(
			NSDraggingSession session);

	@Generated
	@Selector("init")
	public native NSCollectionView init();

	@Generated
	@Selector("initWithFrame:")
	public native NSCollectionView initWithFrame(@ByValue CGRect frameRect);

	@Generated
	@Selector("isFirstResponder")
	public native boolean isFirstResponder();

	@Generated
	@Selector("isSelectable")
	public native boolean isSelectable();

	@Generated
	@Selector("itemAtIndex:")
	public native NSCollectionViewItem itemAtIndex(long index);

	@Generated
	@Selector("itemPrototype")
	public native NSCollectionViewItem itemPrototype();

	@Generated
	@Selector("maxItemSize")
	@ByValue
	public native CGSize maxItemSize();

	@Generated
	@Selector("maxNumberOfColumns")
	public native long maxNumberOfColumns();

	@Generated
	@Selector("maxNumberOfRows")
	public native long maxNumberOfRows();

	@Generated
	@Selector("minItemSize")
	@ByValue
	public native CGSize minItemSize();

	@Generated
	@Selector("newItemForRepresentedObject:")
	public native NSCollectionViewItem newItemForRepresentedObject(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@IsOptional
	@Selector("performDragOperation:")
	public native boolean performDragOperation(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@IsOptional
	@Selector("prepareForDragOperation:")
	public native boolean prepareForDragOperation(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("selectionIndexes")
	public native NSIndexSet selectionIndexes();

	@Generated
	@Selector("setAllowsMultipleSelection:")
	public native void setAllowsMultipleSelection(boolean flag);

	@Generated
	@Selector("setBackgroundColors:")
	public native void setBackgroundColors(NSArray colors);

	@Generated
	@Selector("setContent:")
	public native void setContent(NSArray content);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object aDelegate);

	@Generated
	@Selector("setDraggingSourceOperationMask:forLocal:")
	public native void setDraggingSourceOperationMaskForLocal(
			long dragOperationMask, boolean localDestination);

	@Generated
	@Selector("setItemPrototype:")
	public native void setItemPrototype(NSCollectionViewItem prototype);

	@Generated
	@Selector("setMaxItemSize:")
	public native void setMaxItemSize(@ByValue CGSize size);

	@Generated
	@Selector("setMaxNumberOfColumns:")
	public native void setMaxNumberOfColumns(long number);

	@Generated
	@Selector("setMaxNumberOfRows:")
	public native void setMaxNumberOfRows(long number);

	@Generated
	@Selector("setMinItemSize:")
	public native void setMinItemSize(@ByValue CGSize size);

	@Generated
	@Selector("setSelectable:")
	public native void setSelectable(boolean flag);

	@Generated
	@Selector("setSelectionIndexes:")
	public native void setSelectionIndexes(NSIndexSet indexes);

	@Generated
	@IsOptional
	@Selector("updateDraggingItemsForDrag:")
	public native void updateDraggingItemsForDrag(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@IsOptional
	@Selector("wantsPeriodicDraggingUpdates")
	public native boolean wantsPeriodicDraggingUpdates();
}
