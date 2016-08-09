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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.foundation.NSArray;
import mac.foundation.NSIndexPath;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTreeController extends NSObjectController {
	static {
		NatJ.register();
	}

	@Generated
	protected NSTreeController(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("add:")
	public native void add(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("addChild:")
	public native void addChild(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("addSelectionIndexPaths:")
	public native boolean addSelectionIndexPaths(NSArray indexPaths);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSTreeController alloc();

	@Generated
	@Selector("alwaysUsesMultipleValuesMarker")
	public native boolean alwaysUsesMultipleValuesMarker();

	@Generated
	@Selector("arrangedObjects")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object arrangedObjects();

	@Generated
	@Selector("avoidsEmptySelection")
	public native boolean avoidsEmptySelection();

	@Generated
	@Selector("canAddChild")
	public native boolean canAddChild();

	@Generated
	@Selector("canInsert")
	public native boolean canInsert();

	@Generated
	@Selector("canInsertChild")
	public native boolean canInsertChild();

	@Generated
	@Selector("childrenKeyPath")
	public native String childrenKeyPath();

	@Generated
	@Selector("childrenKeyPathForNode:")
	public native String childrenKeyPathForNode(NSTreeNode node);

	@Generated
	@Selector("content")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object content();

	@Generated
	@Selector("countKeyPath")
	public native String countKeyPath();

	@Generated
	@Selector("countKeyPathForNode:")
	public native String countKeyPathForNode(NSTreeNode node);

	@Generated
	@Selector("init")
	public native NSTreeController init();

	@Generated
	@Selector("initWithContent:")
	public native NSTreeController initWithContent(
			@Mapped(ObjCObjectMapper.class) Object content);

	@Generated
	@Selector("insert:")
	public native void insert(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("insertChild:")
	public native void insertChild(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("insertObject:atArrangedObjectIndexPath:")
	public native void insertObjectAtArrangedObjectIndexPath(
			@Mapped(ObjCObjectMapper.class) Object object, NSIndexPath indexPath);

	@Generated
	@Selector("insertObjects:atArrangedObjectIndexPaths:")
	public native void insertObjectsAtArrangedObjectIndexPaths(NSArray objects,
			NSArray indexPaths);

	@Generated
	@Selector("leafKeyPath")
	public native String leafKeyPath();

	@Generated
	@Selector("leafKeyPathForNode:")
	public native String leafKeyPathForNode(NSTreeNode node);

	@Generated
	@Selector("moveNode:toIndexPath:")
	public native void moveNodeToIndexPath(NSTreeNode node,
			NSIndexPath indexPath);

	@Generated
	@Selector("moveNodes:toIndexPath:")
	public native void moveNodesToIndexPath(NSArray nodes,
			NSIndexPath startingIndexPath);

	@Generated
	@Selector("preservesSelection")
	public native boolean preservesSelection();

	@Generated
	@Selector("rearrangeObjects")
	public native void rearrangeObjects();

	@Generated
	@Selector("remove:")
	public native void remove(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("removeObjectAtArrangedObjectIndexPath:")
	public native void removeObjectAtArrangedObjectIndexPath(
			NSIndexPath indexPath);

	@Generated
	@Selector("removeObjectsAtArrangedObjectIndexPaths:")
	public native void removeObjectsAtArrangedObjectIndexPaths(
			NSArray indexPaths);

	@Generated
	@Selector("removeSelectionIndexPaths:")
	public native boolean removeSelectionIndexPaths(NSArray indexPaths);

	@Generated
	@Selector("selectedNodes")
	public native NSArray selectedNodes();

	@Generated
	@Selector("selectedObjects")
	public native NSArray selectedObjects();

	@Generated
	@Selector("selectionIndexPath")
	public native NSIndexPath selectionIndexPath();

	@Generated
	@Selector("selectionIndexPaths")
	public native NSArray selectionIndexPaths();

	@Generated
	@Selector("selectsInsertedObjects")
	public native boolean selectsInsertedObjects();

	@Generated
	@Selector("setAlwaysUsesMultipleValuesMarker:")
	public native void setAlwaysUsesMultipleValuesMarker(boolean flag);

	@Generated
	@Selector("setAvoidsEmptySelection:")
	public native void setAvoidsEmptySelection(boolean flag);

	@Generated
	@Selector("setChildrenKeyPath:")
	public native void setChildrenKeyPath(String keyPath);

	@Generated
	@Selector("setContent:")
	public native void setContent(@Mapped(ObjCObjectMapper.class) Object content);

	@Generated
	@Selector("setCountKeyPath:")
	public native void setCountKeyPath(String keyPath);

	@Generated
	@Selector("setLeafKeyPath:")
	public native void setLeafKeyPath(String keyPath);

	@Generated
	@Selector("setPreservesSelection:")
	public native void setPreservesSelection(boolean flag);

	@Generated
	@Selector("setSelectionIndexPath:")
	public native boolean setSelectionIndexPath(NSIndexPath indexPath);

	@Generated
	@Selector("setSelectionIndexPaths:")
	public native boolean setSelectionIndexPaths(NSArray indexPaths);

	@Generated
	@Selector("setSelectsInsertedObjects:")
	public native void setSelectsInsertedObjects(boolean flag);

	@Generated
	@Selector("setSortDescriptors:")
	public native void setSortDescriptors(NSArray sortDescriptors);

	@Generated
	@Selector("sortDescriptors")
	public native NSArray sortDescriptors();
}
