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
import org.moe.natj.general.ptr.ConstLongPtr;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSIndexPath extends NSObject implements NSCopying, NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSIndexPath(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSIndexPath alloc();

	@Generated
	@Selector("compare:")
	public native long compare(NSIndexPath otherObject);

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("getIndexes:")
	public native void getIndexes(LongPtr indexes);

	@Generated
	@Selector("indexAtPosition:")
	public native long indexAtPosition(long position);

	@Generated
	@Selector("indexPathByAddingIndex:")
	public native NSIndexPath indexPathByAddingIndex(long index);

	@Generated
	@Selector("indexPathByRemovingLastIndex")
	public native NSIndexPath indexPathByRemovingLastIndex();

	@Generated
	@Selector("indexPathWithIndex:")
	public static native NSIndexPath indexPathWithIndex(long index);

	@Generated
	@Selector("indexPathWithIndexes:length:")
	public static native NSIndexPath indexPathWithIndexesLength(
			ConstLongPtr indexes, long length);

	@Generated
	@Selector("init")
	public native NSIndexPath init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithIndex:")
	public native NSIndexPath initWithIndex(long index);

	@Generated
	@Selector("initWithIndexes:length:")
	public native NSIndexPath initWithIndexesLength(ConstLongPtr indexes,
			long length);

	@Generated
	@Selector("length")
	public native long length();
}
