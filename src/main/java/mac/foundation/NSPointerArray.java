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
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;
import mac.foundation.protocol.NSFastEnumeration;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPointerArray extends NSObject implements NSFastEnumeration,
		NSCopying, NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSPointerArray(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addPointer:")
	public native void addPointer(VoidPtr pointer);

	@Generated
	@Selector("allObjects")
	public native NSArray allObjects();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSPointerArray alloc();

	@Generated
	@Selector("compact")
	public native void compact();

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
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("init")
	public native NSPointerArray init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithOptions:")
	public native NSPointerArray initWithOptions(long options);

	@Generated
	@Selector("initWithPointerFunctions:")
	public native NSPointerArray initWithPointerFunctions(
			NSPointerFunctions functions);

	@Generated
	@Selector("insertPointer:atIndex:")
	public native void insertPointerAtIndex(VoidPtr item, long index);

	@Generated
	@Selector("pointerArrayWithOptions:")
	public static native NSPointerArray pointerArrayWithOptions(long options);

	@Generated
	@Selector("pointerArrayWithPointerFunctions:")
	public static native NSPointerArray pointerArrayWithPointerFunctions(
			NSPointerFunctions functions);

	@Generated
	@Selector("pointerArrayWithStrongObjects")
	public static native NSPointerArray pointerArrayWithStrongObjects();

	@Generated
	@Selector("pointerArrayWithWeakObjects")
	public static native NSPointerArray pointerArrayWithWeakObjects();

	@Generated
	@Selector("pointerAtIndex:")
	public native VoidPtr pointerAtIndex(long index);

	@Generated
	@Selector("pointerFunctions")
	public native NSPointerFunctions pointerFunctions();

	@Generated
	@Selector("removePointerAtIndex:")
	public native void removePointerAtIndex(long index);

	@Generated
	@Selector("replacePointerAtIndex:withPointer:")
	public native void replacePointerAtIndexWithPointer(long index, VoidPtr item);

	@Generated
	@Selector("setCount:")
	public native void setCount(long count);

	@Generated
	@Selector("strongObjectsPointerArray")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object strongObjectsPointerArray();

	@Generated
	@Selector("weakObjectsPointerArray")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object weakObjectsPointerArray();
}
