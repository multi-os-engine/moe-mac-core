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
public class NSHashTable extends NSObject implements NSCopying, NSCoding,
		NSFastEnumeration {
	static {
		NatJ.register();
	}

	@Generated
	protected NSHashTable(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addObject:")
	public native void addObject(@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("allObjects")
	public native NSArray allObjects();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSHashTable alloc();

	@Generated
	@Selector("anyObject")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object anyObject();

	@Generated
	@Selector("containsObject:")
	public native boolean containsObject(
			@Mapped(ObjCObjectMapper.class) Object anObject);

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
	@Selector("hashTableWithOptions:")
	public static native NSHashTable hashTableWithOptions(long options);

	@Generated
	@Selector("hashTableWithWeakObjects")
	public static native NSHashTable hashTableWithWeakObjects();

	@Generated
	@Selector("init")
	public native NSHashTable init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithOptions:capacity:")
	public native NSHashTable initWithOptionsCapacity(long options,
			long initialCapacity);

	@Generated
	@Selector("initWithPointerFunctions:capacity:")
	public native NSHashTable initWithPointerFunctionsCapacity(
			NSPointerFunctions functions, long initialCapacity);

	@Generated
	@Selector("intersectHashTable:")
	public native void intersectHashTable(NSHashTable other);

	@Generated
	@Selector("intersectsHashTable:")
	public native boolean intersectsHashTable(NSHashTable other);

	@Generated
	@Selector("isEqualToHashTable:")
	public native boolean isEqualToHashTable(NSHashTable other);

	@Generated
	@Selector("isSubsetOfHashTable:")
	public native boolean isSubsetOfHashTable(NSHashTable other);

	@Generated
	@Selector("member:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object member(@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("minusHashTable:")
	public native void minusHashTable(NSHashTable other);

	@Generated
	@Selector("objectEnumerator")
	public native NSEnumerator objectEnumerator();

	@Generated
	@Selector("pointerFunctions")
	public native NSPointerFunctions pointerFunctions();

	@Generated
	@Selector("removeAllObjects")
	public native void removeAllObjects();

	@Generated
	@Selector("removeObject:")
	public native void removeObject(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("setRepresentation")
	public native NSSet setRepresentation();

	@Generated
	@Selector("unionHashTable:")
	public native void unionHashTable(NSHashTable other);

	@Generated
	@Selector("weakObjectsHashTable")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object weakObjectsHashTable();
}
