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

package mac.foundation;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.foundation.struct.NSRange;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMutableOrderedSet extends NSOrderedSet {
	static {
		NatJ.register();
	}

	@Generated
	protected NSMutableOrderedSet(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addObject:")
	public native void addObject(@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("addObjects:count:")
	public native void addObjectsCount(ConstPtr<? extends ObjCObject> objects, long count);

	@Generated
	@Selector("addObjectsFromArray:")
	public native void addObjectsFromArray(NSArray array);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSMutableOrderedSet alloc();

	@Generated
	@Selector("exchangeObjectAtIndex:withObjectAtIndex:")
	public native void exchangeObjectAtIndexWithObjectAtIndex(long idx1,
			long idx2);

	@Generated
	@Selector("filterUsingPredicate:")
	public native void filterUsingPredicate(NSPredicate p);

	@Generated
	@Selector("init")
	public native NSMutableOrderedSet init();

	@Generated
	@Selector("initWithArray:")
	public native NSMutableOrderedSet initWithArray(NSArray array);

	@Generated
	@Selector("initWithArray:copyItems:")
	public native NSMutableOrderedSet initWithArrayCopyItems(NSArray set,
			boolean flag);

	@Generated
	@Selector("initWithArray:range:copyItems:")
	public native NSMutableOrderedSet initWithArrayRangeCopyItems(NSArray set,
			@ByValue NSRange range, boolean flag);

	@Generated
	@Selector("initWithCapacity:")
	public native NSMutableOrderedSet initWithCapacity(long numItems);

	@Generated
	@Selector("initWithObject:")
	public native NSMutableOrderedSet initWithObject(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("initWithObjects:count:")
	public native NSMutableOrderedSet initWithObjectsCount(
			ConstPtr<? extends ObjCObject> objects, long cnt);

	@Generated
	@Selector("initWithOrderedSet:")
	public native NSMutableOrderedSet initWithOrderedSet(NSOrderedSet set);

	@Generated
	@Selector("initWithOrderedSet:copyItems:")
	public native NSMutableOrderedSet initWithOrderedSetCopyItems(
			NSOrderedSet set, boolean flag);

	@Generated
	@Selector("initWithOrderedSet:range:copyItems:")
	public native NSMutableOrderedSet initWithOrderedSetRangeCopyItems(
			NSOrderedSet set, @ByValue NSRange range, boolean flag);

	@Generated
	@Selector("initWithSet:")
	public native NSMutableOrderedSet initWithSet(NSSet set);

	@Generated
	@Selector("initWithSet:copyItems:")
	public native NSMutableOrderedSet initWithSetCopyItems(NSSet set,
			boolean flag);

	@Generated
	@Selector("insertObject:atIndex:")
	public native void insertObjectAtIndex(
			@Mapped(ObjCObjectMapper.class) Object object, long idx);

	@Generated
	@Selector("insertObjects:atIndexes:")
	public native void insertObjectsAtIndexes(NSArray objects,
			NSIndexSet indexes);

	@Generated
	@Selector("intersectOrderedSet:")
	public native void intersectOrderedSet(NSOrderedSet other);

	@Generated
	@Selector("intersectSet:")
	public native void intersectSet(NSSet other);

	@Generated
	@Selector("minusOrderedSet:")
	public native void minusOrderedSet(NSOrderedSet other);

	@Generated
	@Selector("minusSet:")
	public native void minusSet(NSSet other);

	@Generated
	@Selector("moveObjectsAtIndexes:toIndex:")
	public native void moveObjectsAtIndexesToIndex(NSIndexSet indexes, long idx);

	@Generated
	@Selector("orderedSet")
	public static native NSMutableOrderedSet orderedSet();

	@Generated
	@Selector("orderedSetWithArray:")
	public static native NSMutableOrderedSet orderedSetWithArray(NSArray array);

	@Generated
	@Selector("orderedSetWithArray:range:copyItems:")
	public static native NSMutableOrderedSet orderedSetWithArrayRangeCopyItems(
			NSArray array, @ByValue NSRange range, boolean flag);

	@Generated
	@Selector("orderedSetWithCapacity:")
	public static native NSMutableOrderedSet orderedSetWithCapacity(
			long numItems);

	@Generated
	@Selector("orderedSetWithObject:")
	public static native NSMutableOrderedSet orderedSetWithObject(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("orderedSetWithObjects:count:")
	public static native NSMutableOrderedSet orderedSetWithObjectsCount(
			ConstPtr<? extends ObjCObject> objects, long cnt);

	@Generated
	@Selector("orderedSetWithOrderedSet:")
	public static native NSMutableOrderedSet orderedSetWithOrderedSet(
			NSOrderedSet set);

	@Generated
	@Selector("orderedSetWithOrderedSet:range:copyItems:")
	public static native NSMutableOrderedSet orderedSetWithOrderedSetRangeCopyItems(
			NSOrderedSet set, @ByValue NSRange range, boolean flag);

	@Generated
	@Selector("orderedSetWithSet:")
	public static native NSMutableOrderedSet orderedSetWithSet(NSSet set);

	@Generated
	@Selector("orderedSetWithSet:copyItems:")
	public static native NSMutableOrderedSet orderedSetWithSetCopyItems(
			NSSet set, boolean flag);

	@Generated
	@Selector("removeAllObjects")
	public native void removeAllObjects();

	@Generated
	@Selector("removeObject:")
	public native void removeObject(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("removeObjectAtIndex:")
	public native void removeObjectAtIndex(long idx);

	@Generated
	@Selector("removeObjectsAtIndexes:")
	public native void removeObjectsAtIndexes(NSIndexSet indexes);

	@Generated
	@Selector("removeObjectsInArray:")
	public native void removeObjectsInArray(NSArray array);

	@Generated
	@Selector("removeObjectsInRange:")
	public native void removeObjectsInRange(@ByValue NSRange range);

	@Generated
	@Selector("replaceObjectAtIndex:withObject:")
	public native void replaceObjectAtIndexWithObject(long idx,
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("replaceObjectsAtIndexes:withObjects:")
	public native void replaceObjectsAtIndexesWithObjects(NSIndexSet indexes,
			NSArray objects);

	@Generated
	@Selector("replaceObjectsInRange:withObjects:count:")
	public native void replaceObjectsInRangeWithObjectsCount(
			@ByValue NSRange range, ConstPtr<? extends ObjCObject> objects, long count);

	@Generated
	@Selector("setObject:atIndex:")
	public native void setObjectAtIndex(
			@Mapped(ObjCObjectMapper.class) Object obj, long idx);

	@Generated
	@Selector("setObject:atIndexedSubscript:")
	public native void setObjectAtIndexedSubscript(
			@Mapped(ObjCObjectMapper.class) Object obj, long idx);

	@Generated
	@Selector("sortRange:options:usingComparator:")
	public native void sortRangeOptionsUsingComparator(
			@ByValue NSRange range,
			long opts,
			@ObjCBlock(name = "call_sortRangeOptionsUsingComparator") Block_sortRangeOptionsUsingComparator cmptr);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_sortRangeOptionsUsingComparator {
		@Generated
		public long call_sortRangeOptionsUsingComparator(
				@Mapped(ObjCObjectMapper.class) Object arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1);
	}

	@Generated
	@Selector("sortUsingComparator:")
	public native void sortUsingComparator(
			@ObjCBlock(name = "call_sortUsingComparator") Block_sortUsingComparator cmptr);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_sortUsingComparator {
		@Generated
		public long call_sortUsingComparator(
				@Mapped(ObjCObjectMapper.class) Object arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1);
	}

	@Generated
	@Selector("sortUsingDescriptors:")
	public native void sortUsingDescriptors(NSArray sortDescriptors);

	@Generated
	@Selector("sortWithOptions:usingComparator:")
	public native void sortWithOptionsUsingComparator(
			long opts,
			@ObjCBlock(name = "call_sortWithOptionsUsingComparator") Block_sortWithOptionsUsingComparator cmptr);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_sortWithOptionsUsingComparator {
		@Generated
		public long call_sortWithOptionsUsingComparator(
				@Mapped(ObjCObjectMapper.class) Object arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1);
	}

	@Generated
	@Selector("unionOrderedSet:")
	public native void unionOrderedSet(NSOrderedSet other);

	@Generated
	@Selector("unionSet:")
	public native void unionSet(NSSet other);
}
