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


import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.foundation.struct.NSRange;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMutableArray extends NSArray {
	static {
		NatJ.register();
	}

	@Generated
	protected NSMutableArray(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addObject:")
	public native void addObject(@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("addObjectsFromArray:")
	public native void addObjectsFromArray(NSArray otherArray);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSMutableArray alloc();

	@Generated
	@Selector("array")
	public static native NSMutableArray array();

	@Generated
	@Selector("arrayWithArray:")
	public static native NSMutableArray arrayWithArray(NSArray array);

	@Generated
	@Selector("arrayWithCapacity:")
	public static native NSMutableArray arrayWithCapacity(long numItems);

	@Generated
	@Selector("arrayWithContentsOfFile:")
	public static native NSMutableArray arrayWithContentsOfFile(String path);

	@Generated
	@Selector("arrayWithContentsOfURL:")
	public static native NSMutableArray arrayWithContentsOfURL(NSURL url);

	@Generated
	@Selector("arrayWithObject:")
	public static native NSMutableArray arrayWithObject(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("arrayWithObjects:count:")
	public static native NSMutableArray arrayWithObjectsCount(
			ConstPtr<? extends ObjCObject> objects, long cnt);

	@Generated
	@Selector("exchangeObjectAtIndex:withObjectAtIndex:")
	public native void exchangeObjectAtIndexWithObjectAtIndex(long idx1,
			long idx2);

	@Generated
	@Selector("filterUsingPredicate:")
	public native void filterUsingPredicate(NSPredicate predicate);

	@Generated
	@Selector("init")
	public native NSMutableArray init();

	@Generated
	@Selector("initWithArray:")
	public native NSMutableArray initWithArray(NSArray array);

	@Generated
	@Selector("initWithArray:copyItems:")
	public native NSMutableArray initWithArrayCopyItems(NSArray array,
			boolean flag);

	@Generated
	@Selector("initWithCapacity:")
	public native NSMutableArray initWithCapacity(long numItems);

	@Generated
	@Selector("initWithContentsOfFile:")
	public native NSMutableArray initWithContentsOfFile(String path);

	@Generated
	@Selector("initWithContentsOfURL:")
	public native NSMutableArray initWithContentsOfURL(NSURL url);

	@Generated
	@Selector("initWithObjects:count:")
	public native NSMutableArray initWithObjectsCount(
			ConstPtr<? extends ObjCObject> objects, long cnt);

	@Generated
	@Selector("insertObject:atIndex:")
	public native void insertObjectAtIndex(
			@Mapped(ObjCObjectMapper.class) Object anObject, long index);

	@Generated
	@Selector("insertObjects:atIndexes:")
	public native void insertObjectsAtIndexes(NSArray objects,
			NSIndexSet indexes);

	@Generated
	@Selector("removeAllObjects")
	public native void removeAllObjects();

	@Generated
	@Selector("removeLastObject")
	public native void removeLastObject();

	@Generated
	@Selector("removeObject:")
	public native void removeObject(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("removeObject:inRange:")
	public native void removeObjectInRange(
			@Mapped(ObjCObjectMapper.class) Object anObject,
			@ByValue NSRange range);

	@Generated
	@Selector("removeObjectAtIndex:")
	public native void removeObjectAtIndex(long index);

	@Generated
	@Selector("removeObjectIdenticalTo:")
	public native void removeObjectIdenticalTo(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("removeObjectIdenticalTo:inRange:")
	public native void removeObjectIdenticalToInRange(
			@Mapped(ObjCObjectMapper.class) Object anObject,
			@ByValue NSRange range);

	@Generated
	@Selector("removeObjectsAtIndexes:")
	public native void removeObjectsAtIndexes(NSIndexSet indexes);

	@Generated
	@Selector("removeObjectsFromIndices:numIndices:")
	public native void removeObjectsFromIndicesNumIndices(LongPtr indices,
			long cnt);

	@Generated
	@Selector("removeObjectsInArray:")
	public native void removeObjectsInArray(NSArray otherArray);

	@Generated
	@Selector("removeObjectsInRange:")
	public native void removeObjectsInRange(@ByValue NSRange range);

	@Generated
	@Selector("replaceObjectAtIndex:withObject:")
	public native void replaceObjectAtIndexWithObject(long index,
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("replaceObjectsAtIndexes:withObjects:")
	public native void replaceObjectsAtIndexesWithObjects(NSIndexSet indexes,
			NSArray objects);

	@Generated
	@Selector("replaceObjectsInRange:withObjectsFromArray:")
	public native void replaceObjectsInRangeWithObjectsFromArray(
			@ByValue NSRange range, NSArray otherArray);

	@Generated
	@Selector("replaceObjectsInRange:withObjectsFromArray:range:")
	public native void replaceObjectsInRangeWithObjectsFromArrayRange(
			@ByValue NSRange range, NSArray otherArray,
			@ByValue NSRange otherRange);

	@Generated
	@Selector("setArray:")
	public native void setArray(NSArray otherArray);

	@Generated
	@Selector("setObject:atIndexedSubscript:")
	public native void setObjectAtIndexedSubscript(
			@Mapped(ObjCObjectMapper.class) Object obj, long idx);

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
}
