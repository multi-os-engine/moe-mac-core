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
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;
import mac.foundation.protocol.NSMutableCopying;
import mac.foundation.struct.NSRange;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSIndexSet extends NSObject implements NSCopying,
		NSMutableCopying, NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSIndexSet(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSIndexSet alloc();

	@Generated
	@Selector("containsIndex:")
	public native boolean containsIndex(long value);

	@Generated
	@Selector("containsIndexes:")
	public native boolean containsIndexes(NSIndexSet indexSet);

	@Generated
	@Selector("containsIndexesInRange:")
	public native boolean containsIndexesInRange(@ByValue NSRange range);

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("count")
	public native long count();

	@Generated
	@Selector("countOfIndexesInRange:")
	public native long countOfIndexesInRange(@ByValue NSRange range);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("enumerateIndexesInRange:options:usingBlock:")
	public native void enumerateIndexesInRangeOptionsUsingBlock(
			@ByValue NSRange range,
			long opts,
			@ObjCBlock(name = "call_enumerateIndexesInRangeOptionsUsingBlock") Block_enumerateIndexesInRangeOptionsUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_enumerateIndexesInRangeOptionsUsingBlock {
		@Generated
		public void call_enumerateIndexesInRangeOptionsUsingBlock(long arg0,
				BoolPtr arg1);
	}

	@Generated
	@Selector("enumerateIndexesUsingBlock:")
	public native void enumerateIndexesUsingBlock(
			@ObjCBlock(name = "call_enumerateIndexesUsingBlock") Block_enumerateIndexesUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_enumerateIndexesUsingBlock {
		@Generated
		public void call_enumerateIndexesUsingBlock(long arg0, BoolPtr arg1);
	}

	@Generated
	@Selector("enumerateIndexesWithOptions:usingBlock:")
	public native void enumerateIndexesWithOptionsUsingBlock(
			long opts,
			@ObjCBlock(name = "call_enumerateIndexesWithOptionsUsingBlock") Block_enumerateIndexesWithOptionsUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_enumerateIndexesWithOptionsUsingBlock {
		@Generated
		public void call_enumerateIndexesWithOptionsUsingBlock(long arg0,
				BoolPtr arg1);
	}

	@Generated
	@Selector("enumerateRangesInRange:options:usingBlock:")
	public native void enumerateRangesInRangeOptionsUsingBlock(
			@ByValue NSRange range,
			long opts,
			@ObjCBlock(name = "call_enumerateRangesInRangeOptionsUsingBlock") Block_enumerateRangesInRangeOptionsUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_enumerateRangesInRangeOptionsUsingBlock {
		@Generated
		public void call_enumerateRangesInRangeOptionsUsingBlock(
				@ByValue NSRange arg0, BoolPtr arg1);
	}

	@Generated
	@Selector("enumerateRangesUsingBlock:")
	public native void enumerateRangesUsingBlock(
			@ObjCBlock(name = "call_enumerateRangesUsingBlock") Block_enumerateRangesUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_enumerateRangesUsingBlock {
		@Generated
		public void call_enumerateRangesUsingBlock(@ByValue NSRange arg0,
				BoolPtr arg1);
	}

	@Generated
	@Selector("enumerateRangesWithOptions:usingBlock:")
	public native void enumerateRangesWithOptionsUsingBlock(
			long opts,
			@ObjCBlock(name = "call_enumerateRangesWithOptionsUsingBlock") Block_enumerateRangesWithOptionsUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_enumerateRangesWithOptionsUsingBlock {
		@Generated
		public void call_enumerateRangesWithOptionsUsingBlock(
				@ByValue NSRange arg0, BoolPtr arg1);
	}

	@Generated
	@Selector("firstIndex")
	public native long firstIndex();

	@Generated
	@Selector("getIndexes:maxCount:inIndexRange:")
	public native long getIndexesMaxCountInIndexRange(
			LongPtr indexBuffer,
			long bufferSize,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange range);

	@Generated
	@Selector("indexGreaterThanIndex:")
	public native long indexGreaterThanIndex(long value);

	@Generated
	@Selector("indexGreaterThanOrEqualToIndex:")
	public native long indexGreaterThanOrEqualToIndex(long value);

	@Generated
	@Selector("indexInRange:options:passingTest:")
	public native long indexInRangeOptionsPassingTest(
			@ByValue NSRange range,
			long opts,
			@ObjCBlock(name = "call_indexInRangeOptionsPassingTest") Block_indexInRangeOptionsPassingTest predicate);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_indexInRangeOptionsPassingTest {
		@Generated
		public boolean call_indexInRangeOptionsPassingTest(long arg0,
				BoolPtr arg1);
	}

	@Generated
	@Selector("indexLessThanIndex:")
	public native long indexLessThanIndex(long value);

	@Generated
	@Selector("indexLessThanOrEqualToIndex:")
	public native long indexLessThanOrEqualToIndex(long value);

	@Generated
	@Selector("indexPassingTest:")
	public native long indexPassingTest(
			@ObjCBlock(name = "call_indexPassingTest") Block_indexPassingTest predicate);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_indexPassingTest {
		@Generated
		public boolean call_indexPassingTest(long arg0, BoolPtr arg1);
	}

	@Generated
	@Selector("indexSet")
	public static native NSIndexSet indexSet();

	@Generated
	@Selector("indexSetWithIndex:")
	public static native NSIndexSet indexSetWithIndex(long value);

	@Generated
	@Selector("indexSetWithIndexesInRange:")
	public static native NSIndexSet indexSetWithIndexesInRange(
			@ByValue NSRange range);

	@Generated
	@Selector("indexWithOptions:passingTest:")
	public native long indexWithOptionsPassingTest(
			long opts,
			@ObjCBlock(name = "call_indexWithOptionsPassingTest") Block_indexWithOptionsPassingTest predicate);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_indexWithOptionsPassingTest {
		@Generated
		public boolean call_indexWithOptionsPassingTest(long arg0, BoolPtr arg1);
	}

	@Generated
	@Selector("indexesInRange:options:passingTest:")
	public native NSIndexSet indexesInRangeOptionsPassingTest(
			@ByValue NSRange range,
			long opts,
			@ObjCBlock(name = "call_indexesInRangeOptionsPassingTest") Block_indexesInRangeOptionsPassingTest predicate);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_indexesInRangeOptionsPassingTest {
		@Generated
		public boolean call_indexesInRangeOptionsPassingTest(long arg0,
				BoolPtr arg1);
	}

	@Generated
	@Selector("indexesPassingTest:")
	public native NSIndexSet indexesPassingTest(
			@ObjCBlock(name = "call_indexesPassingTest") Block_indexesPassingTest predicate);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_indexesPassingTest {
		@Generated
		public boolean call_indexesPassingTest(long arg0, BoolPtr arg1);
	}

	@Generated
	@Selector("indexesWithOptions:passingTest:")
	public native NSIndexSet indexesWithOptionsPassingTest(
			long opts,
			@ObjCBlock(name = "call_indexesWithOptionsPassingTest") Block_indexesWithOptionsPassingTest predicate);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_indexesWithOptionsPassingTest {
		@Generated
		public boolean call_indexesWithOptionsPassingTest(long arg0,
				BoolPtr arg1);
	}

	@Generated
	@Selector("init")
	public native NSIndexSet init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithIndex:")
	public native NSIndexSet initWithIndex(long value);

	@Generated
	@Selector("initWithIndexSet:")
	public native NSIndexSet initWithIndexSet(NSIndexSet indexSet);

	@Generated
	@Selector("initWithIndexesInRange:")
	public native NSIndexSet initWithIndexesInRange(@ByValue NSRange range);

	@Generated
	@Selector("intersectsIndexesInRange:")
	public native boolean intersectsIndexesInRange(@ByValue NSRange range);

	@Generated
	@Selector("isEqualToIndexSet:")
	public native boolean isEqualToIndexSet(NSIndexSet indexSet);

	@Generated
	@Selector("lastIndex")
	public native long lastIndex();

	@Generated
	@Selector("mutableCopyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object mutableCopyWithZone(VoidPtr zone);
}
