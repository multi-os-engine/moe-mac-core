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
public class NSMapTable extends NSObject implements NSCopying, NSCoding,
		NSFastEnumeration {
	static {
		NatJ.register();
	}

	@Generated
	protected NSMapTable(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSMapTable alloc();

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
	@Selector("dictionaryRepresentation")
	public native NSDictionary dictionaryRepresentation();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("init")
	public native NSMapTable init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithKeyOptions:valueOptions:capacity:")
	public native NSMapTable initWithKeyOptionsValueOptionsCapacity(
			long keyOptions, long valueOptions, long initialCapacity);

	@Generated
	@Selector("initWithKeyPointerFunctions:valuePointerFunctions:capacity:")
	public native NSMapTable initWithKeyPointerFunctionsValuePointerFunctionsCapacity(
			NSPointerFunctions keyFunctions, NSPointerFunctions valueFunctions,
			long initialCapacity);

	@Generated
	@Selector("keyEnumerator")
	public native NSEnumerator keyEnumerator();

	@Generated
	@Selector("keyPointerFunctions")
	public native NSPointerFunctions keyPointerFunctions();

	@Generated
	@Selector("mapTableWithKeyOptions:valueOptions:")
	public static native NSMapTable mapTableWithKeyOptionsValueOptions(
			long keyOptions, long valueOptions);

	@Generated
	@Selector("mapTableWithStrongToStrongObjects")
	public static native NSMapTable mapTableWithStrongToStrongObjects();

	@Generated
	@Selector("mapTableWithStrongToWeakObjects")
	public static native NSMapTable mapTableWithStrongToWeakObjects();

	@Generated
	@Selector("mapTableWithWeakToStrongObjects")
	public static native NSMapTable mapTableWithWeakToStrongObjects();

	@Generated
	@Selector("mapTableWithWeakToWeakObjects")
	public static native NSMapTable mapTableWithWeakToWeakObjects();

	@Generated
	@Selector("objectEnumerator")
	public native NSEnumerator objectEnumerator();

	@Generated
	@Selector("objectForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object objectForKey(
			@Mapped(ObjCObjectMapper.class) Object aKey);

	@Generated
	@Selector("removeAllObjects")
	public native void removeAllObjects();

	@Generated
	@Selector("removeObjectForKey:")
	public native void removeObjectForKey(
			@Mapped(ObjCObjectMapper.class) Object aKey);

	@Generated
	@Selector("setObject:forKey:")
	public native void setObjectForKey(
			@Mapped(ObjCObjectMapper.class) Object anObject,
			@Mapped(ObjCObjectMapper.class) Object aKey);

	@Generated
	@Selector("strongToStrongObjectsMapTable")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object strongToStrongObjectsMapTable();

	@Generated
	@Selector("strongToWeakObjectsMapTable")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object strongToWeakObjectsMapTable();

	@Generated
	@Selector("valuePointerFunctions")
	public native NSPointerFunctions valuePointerFunctions();

	@Generated
	@Selector("weakToStrongObjectsMapTable")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object weakToStrongObjectsMapTable();

	@Generated
	@Selector("weakToWeakObjectsMapTable")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object weakToWeakObjectsMapTable();
}
