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
import mac.foundation.NSIndexSet;
import mac.foundation.NSPredicate;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSArrayController extends NSObjectController {
	static {
		NatJ.register();
	}

	@Generated
	protected NSArrayController(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("add:")
	public native void add(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("addObject:")
	public native void addObject(@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("addObjects:")
	public native void addObjects(NSArray objects);

	@Generated
	@Selector("addSelectedObjects:")
	public native boolean addSelectedObjects(NSArray objects);

	@Generated
	@Selector("addSelectionIndexes:")
	public native boolean addSelectionIndexes(NSIndexSet indexes);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSArrayController alloc();

	@Generated
	@Selector("alwaysUsesMultipleValuesMarker")
	public native boolean alwaysUsesMultipleValuesMarker();

	@Generated
	@Selector("arrangeObjects:")
	public native NSArray arrangeObjects(NSArray objects);

	@Generated
	@Selector("arrangedObjects")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object arrangedObjects();

	@Generated
	@Selector("automaticRearrangementKeyPaths")
	public native NSArray automaticRearrangementKeyPaths();

	@Generated
	@Selector("automaticallyRearrangesObjects")
	public native boolean automaticallyRearrangesObjects();

	@Generated
	@Selector("avoidsEmptySelection")
	public native boolean avoidsEmptySelection();

	@Generated
	@Selector("canInsert")
	public native boolean canInsert();

	@Generated
	@Selector("canSelectNext")
	public native boolean canSelectNext();

	@Generated
	@Selector("canSelectPrevious")
	public native boolean canSelectPrevious();

	@Generated
	@Selector("clearsFilterPredicateOnInsertion")
	public native boolean clearsFilterPredicateOnInsertion();

	@Generated
	@Selector("didChangeArrangementCriteria")
	public native void didChangeArrangementCriteria();

	@Generated
	@Selector("filterPredicate")
	public native NSPredicate filterPredicate();

	@Generated
	@Selector("init")
	public native NSArrayController init();

	@Generated
	@Selector("initWithContent:")
	public native NSArrayController initWithContent(
			@Mapped(ObjCObjectMapper.class) Object content);

	@Generated
	@Selector("insert:")
	public native void insert(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("insertObject:atArrangedObjectIndex:")
	public native void insertObjectAtArrangedObjectIndex(
			@Mapped(ObjCObjectMapper.class) Object object, long index);

	@Generated
	@Selector("insertObjects:atArrangedObjectIndexes:")
	public native void insertObjectsAtArrangedObjectIndexes(NSArray objects,
			NSIndexSet indexes);

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
	@Selector("removeObject:")
	public native void removeObject(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("removeObjectAtArrangedObjectIndex:")
	public native void removeObjectAtArrangedObjectIndex(long index);

	@Generated
	@Selector("removeObjects:")
	public native void removeObjects(NSArray objects);

	@Generated
	@Selector("removeObjectsAtArrangedObjectIndexes:")
	public native void removeObjectsAtArrangedObjectIndexes(NSIndexSet indexes);

	@Generated
	@Selector("removeSelectedObjects:")
	public native boolean removeSelectedObjects(NSArray objects);

	@Generated
	@Selector("removeSelectionIndexes:")
	public native boolean removeSelectionIndexes(NSIndexSet indexes);

	@Generated
	@Selector("selectNext:")
	public native void selectNext(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("selectPrevious:")
	public native void selectPrevious(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("selectedObjects")
	public native NSArray selectedObjects();

	@Generated
	@Selector("selectionIndex")
	public native long selectionIndex();

	@Generated
	@Selector("selectionIndexes")
	public native NSIndexSet selectionIndexes();

	@Generated
	@Selector("selectsInsertedObjects")
	public native boolean selectsInsertedObjects();

	@Generated
	@Selector("setAlwaysUsesMultipleValuesMarker:")
	public native void setAlwaysUsesMultipleValuesMarker(boolean flag);

	@Generated
	@Selector("setAutomaticallyRearrangesObjects:")
	public native void setAutomaticallyRearrangesObjects(boolean flag);

	@Generated
	@Selector("setAvoidsEmptySelection:")
	public native void setAvoidsEmptySelection(boolean flag);

	@Generated
	@Selector("setClearsFilterPredicateOnInsertion:")
	public native void setClearsFilterPredicateOnInsertion(boolean flag);

	@Generated
	@Selector("setFilterPredicate:")
	public native void setFilterPredicate(NSPredicate filterPredicate);

	@Generated
	@Selector("setPreservesSelection:")
	public native void setPreservesSelection(boolean flag);

	@Generated
	@Selector("setSelectedObjects:")
	public native boolean setSelectedObjects(NSArray objects);

	@Generated
	@Selector("setSelectionIndex:")
	public native boolean setSelectionIndex(long index);

	@Generated
	@Selector("setSelectionIndexes:")
	public native boolean setSelectionIndexes(NSIndexSet indexes);

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
