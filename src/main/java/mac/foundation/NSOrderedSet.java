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
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.protocol.NSCopying;
import mac.foundation.protocol.NSFastEnumeration;
import mac.foundation.protocol.NSMutableCopying;
import mac.foundation.protocol.NSSecureCoding;
import mac.foundation.struct.NSRange;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSOrderedSet extends NSObject implements NSCopying,
		NSMutableCopying, NSSecureCoding, NSFastEnumeration {
	static {
		NatJ.register();
	}

	@Generated
	protected NSOrderedSet(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addObserver:forKeyPath:options:context:")
	public native void addObserverForKeyPathOptionsContext(NSObject observer,
			String keyPath, long options, VoidPtr context);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSOrderedSet alloc();

	@Generated
	@Selector("array")
	public native NSArray array();

	@Generated
	@Selector("containsObject:")
	public native boolean containsObject(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("count")
	public native long count();

	@Generated
	@Selector("countByEnumeratingWithState:objects:count:")
	public native long countByEnumeratingWithStateObjectsCount(VoidPtr state,
			Ptr<? extends ObjCObject> buffer, long len);

	@Generated
	@Selector("description")
	public native String description();

	@Generated
	@Selector("descriptionWithLocale:")
	public native String descriptionWithLocale(
			@Mapped(ObjCObjectMapper.class) Object locale);

	@Generated
	@Selector("descriptionWithLocale:indent:")
	public native String descriptionWithLocaleIndent(
			@Mapped(ObjCObjectMapper.class) Object locale, long level);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("enumerateObjectsAtIndexes:options:usingBlock:")
	public native void enumerateObjectsAtIndexesOptionsUsingBlock(
			NSIndexSet s,
			long opts,
			@ObjCBlock(name = "call_enumerateObjectsAtIndexesOptionsUsingBlock") Block_enumerateObjectsAtIndexesOptionsUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_enumerateObjectsAtIndexesOptionsUsingBlock {
		@Generated
		public void call_enumerateObjectsAtIndexesOptionsUsingBlock(
				@Mapped(ObjCObjectMapper.class) Object arg0, long arg1,
				BoolPtr arg2);
	}

	@Generated
	@Selector("enumerateObjectsUsingBlock:")
	public native void enumerateObjectsUsingBlock(
			@ObjCBlock(name = "call_enumerateObjectsUsingBlock") Block_enumerateObjectsUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_enumerateObjectsUsingBlock {
		@Generated
		public void call_enumerateObjectsUsingBlock(
				@Mapped(ObjCObjectMapper.class) Object arg0, long arg1,
				BoolPtr arg2);
	}

	@Generated
	@Selector("enumerateObjectsWithOptions:usingBlock:")
	public native void enumerateObjectsWithOptionsUsingBlock(
			long opts,
			@ObjCBlock(name = "call_enumerateObjectsWithOptionsUsingBlock") Block_enumerateObjectsWithOptionsUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_enumerateObjectsWithOptionsUsingBlock {
		@Generated
		public void call_enumerateObjectsWithOptionsUsingBlock(
				@Mapped(ObjCObjectMapper.class) Object arg0, long arg1,
				BoolPtr arg2);
	}

	@Generated
	@Selector("filteredOrderedSetUsingPredicate:")
	public native NSOrderedSet filteredOrderedSetUsingPredicate(NSPredicate p);

	@Generated
	@Selector("firstObject")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object firstObject();

	@Generated
	@Selector("getObjects:range:")
	public native void getObjectsRange(Ptr<? extends ObjCObject> objects,
			@ByValue NSRange range);

	@Generated
	@Selector("indexOfObject:")
	public native long indexOfObject(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("indexOfObject:inSortedRange:options:usingComparator:")
	public native long indexOfObjectInSortedRangeOptionsUsingComparator(
			@Mapped(ObjCObjectMapper.class) Object object,
			@ByValue NSRange range,
			long opts,
			@ObjCBlock(name = "call_indexOfObjectInSortedRangeOptionsUsingComparator") Block_indexOfObjectInSortedRangeOptionsUsingComparator cmp);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_indexOfObjectInSortedRangeOptionsUsingComparator {
		@Generated
		public long call_indexOfObjectInSortedRangeOptionsUsingComparator(
				@Mapped(ObjCObjectMapper.class) Object arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1);
	}

	@Generated
	@Selector("indexOfObjectAtIndexes:options:passingTest:")
	public native long indexOfObjectAtIndexesOptionsPassingTest(
			NSIndexSet s,
			long opts,
			@ObjCBlock(name = "call_indexOfObjectAtIndexesOptionsPassingTest") Block_indexOfObjectAtIndexesOptionsPassingTest predicate);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_indexOfObjectAtIndexesOptionsPassingTest {
		@Generated
		public boolean call_indexOfObjectAtIndexesOptionsPassingTest(
				@Mapped(ObjCObjectMapper.class) Object arg0, long arg1,
				BoolPtr arg2);
	}

	@Generated
	@Selector("indexOfObjectPassingTest:")
	public native long indexOfObjectPassingTest(
			@ObjCBlock(name = "call_indexOfObjectPassingTest") Block_indexOfObjectPassingTest predicate);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_indexOfObjectPassingTest {
		@Generated
		public boolean call_indexOfObjectPassingTest(
				@Mapped(ObjCObjectMapper.class) Object arg0, long arg1,
				BoolPtr arg2);
	}

	@Generated
	@Selector("indexOfObjectWithOptions:passingTest:")
	public native long indexOfObjectWithOptionsPassingTest(
			long opts,
			@ObjCBlock(name = "call_indexOfObjectWithOptionsPassingTest") Block_indexOfObjectWithOptionsPassingTest predicate);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_indexOfObjectWithOptionsPassingTest {
		@Generated
		public boolean call_indexOfObjectWithOptionsPassingTest(
				@Mapped(ObjCObjectMapper.class) Object arg0, long arg1,
				BoolPtr arg2);
	}

	@Generated
	@Selector("indexesOfObjectsAtIndexes:options:passingTest:")
	public native NSIndexSet indexesOfObjectsAtIndexesOptionsPassingTest(
			NSIndexSet s,
			long opts,
			@ObjCBlock(name = "call_indexesOfObjectsAtIndexesOptionsPassingTest") Block_indexesOfObjectsAtIndexesOptionsPassingTest predicate);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_indexesOfObjectsAtIndexesOptionsPassingTest {
		@Generated
		public boolean call_indexesOfObjectsAtIndexesOptionsPassingTest(
				@Mapped(ObjCObjectMapper.class) Object arg0, long arg1,
				BoolPtr arg2);
	}

	@Generated
	@Selector("indexesOfObjectsPassingTest:")
	public native NSIndexSet indexesOfObjectsPassingTest(
			@ObjCBlock(name = "call_indexesOfObjectsPassingTest") Block_indexesOfObjectsPassingTest predicate);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_indexesOfObjectsPassingTest {
		@Generated
		public boolean call_indexesOfObjectsPassingTest(
				@Mapped(ObjCObjectMapper.class) Object arg0, long arg1,
				BoolPtr arg2);
	}

	@Generated
	@Selector("indexesOfObjectsWithOptions:passingTest:")
	public native NSIndexSet indexesOfObjectsWithOptionsPassingTest(
			long opts,
			@ObjCBlock(name = "call_indexesOfObjectsWithOptionsPassingTest") Block_indexesOfObjectsWithOptionsPassingTest predicate);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_indexesOfObjectsWithOptionsPassingTest {
		@Generated
		public boolean call_indexesOfObjectsWithOptionsPassingTest(
				@Mapped(ObjCObjectMapper.class) Object arg0, long arg1,
				BoolPtr arg2);
	}

	@Generated
	@Selector("init")
	public native NSOrderedSet init();

	@Generated
	@Selector("initWithArray:")
	public native NSOrderedSet initWithArray(NSArray array);

	@Generated
	@Selector("initWithArray:copyItems:")
	public native NSOrderedSet initWithArrayCopyItems(NSArray set, boolean flag);

	@Generated
	@Selector("initWithArray:range:copyItems:")
	public native NSOrderedSet initWithArrayRangeCopyItems(NSArray set,
			@ByValue NSRange range, boolean flag);

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithObject:")
	public native NSOrderedSet initWithObject(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("initWithObjects:count:")
	public native NSOrderedSet initWithObjectsCount(
			ConstPtr<? extends ObjCObject> objects, long cnt);

	@Generated
	@Selector("initWithOrderedSet:")
	public native NSOrderedSet initWithOrderedSet(NSOrderedSet set);

	@Generated
	@Selector("initWithOrderedSet:copyItems:")
	public native NSOrderedSet initWithOrderedSetCopyItems(NSOrderedSet set,
			boolean flag);

	@Generated
	@Selector("initWithOrderedSet:range:copyItems:")
	public native NSOrderedSet initWithOrderedSetRangeCopyItems(
			NSOrderedSet set, @ByValue NSRange range, boolean flag);

	@Generated
	@Selector("initWithSet:")
	public native NSOrderedSet initWithSet(NSSet set);

	@Generated
	@Selector("initWithSet:copyItems:")
	public native NSOrderedSet initWithSetCopyItems(NSSet set, boolean flag);

	@Generated
	@Selector("intersectsOrderedSet:")
	public native boolean intersectsOrderedSet(NSOrderedSet other);

	@Generated
	@Selector("intersectsSet:")
	public native boolean intersectsSet(NSSet set);

	@Generated
	@Selector("isEqualToOrderedSet:")
	public native boolean isEqualToOrderedSet(NSOrderedSet other);

	@Generated
	@Selector("isSubsetOfOrderedSet:")
	public native boolean isSubsetOfOrderedSet(NSOrderedSet other);

	@Generated
	@Selector("isSubsetOfSet:")
	public native boolean isSubsetOfSet(NSSet set);

	@Generated
	@Selector("lastObject")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object lastObject();

	@Generated
	@Selector("mutableCopyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object mutableCopyWithZone(VoidPtr zone);

	@Generated
	@Selector("objectAtIndex:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object objectAtIndex(long idx);

	@Generated
	@Selector("objectAtIndexedSubscript:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object objectAtIndexedSubscript(long idx);

	@Generated
	@Selector("objectEnumerator")
	public native NSEnumerator objectEnumerator();

	@Generated
	@Selector("objectsAtIndexes:")
	public native NSArray objectsAtIndexes(NSIndexSet indexes);

	@Generated
	@Selector("orderedSet")
	public static native NSOrderedSet orderedSet();

	@Generated
	@Selector("orderedSetWithArray:")
	public static native NSOrderedSet orderedSetWithArray(NSArray array);

	@Generated
	@Selector("orderedSetWithArray:range:copyItems:")
	public static native NSOrderedSet orderedSetWithArrayRangeCopyItems(
			NSArray array, @ByValue NSRange range, boolean flag);

	@Generated
	@Selector("orderedSetWithObject:")
	public static native NSOrderedSet orderedSetWithObject(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("orderedSetWithObjects:count:")
	public static native NSOrderedSet orderedSetWithObjectsCount(
			ConstPtr<? extends ObjCObject> objects, long cnt);

	@Generated
	@Selector("orderedSetWithOrderedSet:")
	public static native NSOrderedSet orderedSetWithOrderedSet(NSOrderedSet set);

	@Generated
	@Selector("orderedSetWithOrderedSet:range:copyItems:")
	public static native NSOrderedSet orderedSetWithOrderedSetRangeCopyItems(
			NSOrderedSet set, @ByValue NSRange range, boolean flag);

	@Generated
	@Selector("orderedSetWithSet:")
	public static native NSOrderedSet orderedSetWithSet(NSSet set);

	@Generated
	@Selector("orderedSetWithSet:copyItems:")
	public static native NSOrderedSet orderedSetWithSetCopyItems(NSSet set,
			boolean flag);

	@Generated
	@Selector("removeObserver:forKeyPath:")
	public native void removeObserverForKeyPath(NSObject observer,
			String keyPath);

	@Generated
	@Selector("removeObserver:forKeyPath:context:")
	public native void removeObserverForKeyPathContext(NSObject observer,
			String keyPath, VoidPtr context);

	@Generated
	@Selector("reverseObjectEnumerator")
	public native NSEnumerator reverseObjectEnumerator();

	@Generated
	@Selector("reversedOrderedSet")
	public native NSOrderedSet reversedOrderedSet();

	@Generated
	@Selector("set")
	public native NSSet set();

	@Generated
	@Selector("setValue:forKey:")
	public native void setValueForKey(
			@Mapped(ObjCObjectMapper.class) Object value, String key);

	@Generated
	@Selector("sortedArrayUsingComparator:")
	public native NSArray sortedArrayUsingComparator(
			@ObjCBlock(name = "call_sortedArrayUsingComparator") Block_sortedArrayUsingComparator cmptr);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_sortedArrayUsingComparator {
		@Generated
		public long call_sortedArrayUsingComparator(
				@Mapped(ObjCObjectMapper.class) Object arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1);
	}

	@Generated
	@Selector("sortedArrayUsingDescriptors:")
	public native NSArray sortedArrayUsingDescriptors(NSArray sortDescriptors);

	@Generated
	@Selector("sortedArrayWithOptions:usingComparator:")
	public native NSArray sortedArrayWithOptionsUsingComparator(
			long opts,
			@ObjCBlock(name = "call_sortedArrayWithOptionsUsingComparator") Block_sortedArrayWithOptionsUsingComparator cmptr);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_sortedArrayWithOptionsUsingComparator {
		@Generated
		public long call_sortedArrayWithOptionsUsingComparator(
				@Mapped(ObjCObjectMapper.class) Object arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1);
	}

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	@Generated
	@Selector("valueForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object valueForKey(String key);
}
