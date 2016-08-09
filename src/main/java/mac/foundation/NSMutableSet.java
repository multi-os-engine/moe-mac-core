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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMutableSet extends NSSet {
	static {
		NatJ.register();
	}

	@Generated
	protected NSMutableSet(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addObject:")
	public native void addObject(@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("addObjectsFromArray:")
	public native void addObjectsFromArray(NSArray array);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSMutableSet alloc();

	@Generated
	@Selector("filterUsingPredicate:")
	public native void filterUsingPredicate(NSPredicate predicate);

	@Generated
	@Selector("init")
	public native NSMutableSet init();

	@Generated
	@Selector("initWithArray:")
	public native NSMutableSet initWithArray(NSArray array);

	@Generated
	@Selector("initWithCapacity:")
	public native NSMutableSet initWithCapacity(long numItems);

	@Generated
	@Selector("initWithObjects:count:")
	public native NSMutableSet initWithObjectsCount(
			ConstPtr<? extends ObjCObject> objects, long cnt);

	@Generated
	@Selector("initWithSet:")
	public native NSMutableSet initWithSet(NSSet set);

	@Generated
	@Selector("initWithSet:copyItems:")
	public native NSMutableSet initWithSetCopyItems(NSSet set, boolean flag);

	@Generated
	@Selector("intersectSet:")
	public native void intersectSet(NSSet otherSet);

	@Generated
	@Selector("minusSet:")
	public native void minusSet(NSSet otherSet);

	@Generated
	@Selector("removeAllObjects")
	public native void removeAllObjects();

	@Generated
	@Selector("removeObject:")
	public native void removeObject(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("set")
	public static native NSMutableSet set();

	@Generated
	@Selector("setSet:")
	public native void setSet(NSSet otherSet);

	@Generated
	@Selector("setWithArray:")
	public static native NSMutableSet setWithArray(NSArray array);

	@Generated
	@Selector("setWithCapacity:")
	public static native NSMutableSet setWithCapacity(long numItems);

	@Generated
	@Selector("setWithObject:")
	public static native NSMutableSet setWithObject(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("setWithObjects:count:")
	public static native NSMutableSet setWithObjectsCount(
			ConstPtr<? extends ObjCObject> objects, long cnt);

	@Generated
	@Selector("setWithSet:")
	public static native NSMutableSet setWithSet(NSSet set);

	@Generated
	@Selector("unionSet:")
	public native void unionSet(NSSet otherSet);
}
