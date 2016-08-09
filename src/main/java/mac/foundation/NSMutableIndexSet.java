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
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import mac.foundation.struct.NSRange;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMutableIndexSet extends NSIndexSet {
	static {
		NatJ.register();
	}

	@Generated
	protected NSMutableIndexSet(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addIndex:")
	public native void addIndex(long value);

	@Generated
	@Selector("addIndexes:")
	public native void addIndexes(NSIndexSet indexSet);

	@Generated
	@Selector("addIndexesInRange:")
	public native void addIndexesInRange(@ByValue NSRange range);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSMutableIndexSet alloc();

	@Generated
	@Selector("indexSet")
	public static native NSMutableIndexSet indexSet();

	@Generated
	@Selector("indexSetWithIndex:")
	public static native NSMutableIndexSet indexSetWithIndex(long value);

	@Generated
	@Selector("indexSetWithIndexesInRange:")
	public static native NSMutableIndexSet indexSetWithIndexesInRange(
			@ByValue NSRange range);

	@Generated
	@Selector("init")
	public native NSMutableIndexSet init();

	@Generated
	@Selector("initWithIndex:")
	public native NSMutableIndexSet initWithIndex(long value);

	@Generated
	@Selector("initWithIndexSet:")
	public native NSMutableIndexSet initWithIndexSet(NSIndexSet indexSet);

	@Generated
	@Selector("initWithIndexesInRange:")
	public native NSMutableIndexSet initWithIndexesInRange(
			@ByValue NSRange range);

	@Generated
	@Selector("removeAllIndexes")
	public native void removeAllIndexes();

	@Generated
	@Selector("removeIndex:")
	public native void removeIndex(long value);

	@Generated
	@Selector("removeIndexes:")
	public native void removeIndexes(NSIndexSet indexSet);

	@Generated
	@Selector("removeIndexesInRange:")
	public native void removeIndexesInRange(@ByValue NSRange range);

	@Generated
	@Selector("shiftIndexesStartingAtIndex:by:")
	public native void shiftIndexesStartingAtIndexBy(long index, long delta);
}
