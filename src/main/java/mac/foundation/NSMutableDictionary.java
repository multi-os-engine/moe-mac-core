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
public class NSMutableDictionary extends NSDictionary {
	static {
		NatJ.register();
	}

	@Generated
	protected NSMutableDictionary(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addEntriesFromDictionary:")
	public native void addEntriesFromDictionary(NSDictionary otherDictionary);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSMutableDictionary alloc();

	@Generated
	@Selector("dictionary")
	public static native NSMutableDictionary dictionary();

	@Generated
	@Selector("dictionaryWithCapacity:")
	public static native NSMutableDictionary dictionaryWithCapacity(
			long numItems);

	@Generated
	@Selector("dictionaryWithContentsOfFile:")
	public static native NSMutableDictionary dictionaryWithContentsOfFile(
			String path);

	@Generated
	@Selector("dictionaryWithContentsOfURL:")
	public static native NSMutableDictionary dictionaryWithContentsOfURL(
			NSURL url);

	@Generated
	@Selector("dictionaryWithDictionary:")
	public static native NSMutableDictionary dictionaryWithDictionary(
			NSDictionary dict);

	@Generated
	@Selector("dictionaryWithObject:forKey:")
	public static native NSMutableDictionary dictionaryWithObjectForKey(
			@Mapped(ObjCObjectMapper.class) Object object,
			@Mapped(ObjCObjectMapper.class) Object key);

	@Generated
	@Selector("dictionaryWithObjects:forKeys:")
	public static native NSMutableDictionary dictionaryWithObjectsForKeys(
			NSArray objects, NSArray keys);

	@Generated
	@Selector("dictionaryWithObjects:forKeys:count:")
	public static native NSMutableDictionary dictionaryWithObjectsForKeysCount(
			ConstPtr<? extends ObjCObject> objects, ConstPtr<? extends ObjCObject> keys, long cnt);

	@Generated
	@Selector("dictionaryWithSharedKeySet:")
	public static native NSMutableDictionary dictionaryWithSharedKeySet(
			@Mapped(ObjCObjectMapper.class) Object keyset);

	@Generated
	@Selector("init")
	public native NSMutableDictionary init();

	@Generated
	@Selector("initWithCapacity:")
	public native NSMutableDictionary initWithCapacity(long numItems);

	@Generated
	@Selector("initWithContentsOfFile:")
	public native NSMutableDictionary initWithContentsOfFile(String path);

	@Generated
	@Selector("initWithContentsOfURL:")
	public native NSMutableDictionary initWithContentsOfURL(NSURL url);

	@Generated
	@Selector("initWithDictionary:")
	public native NSMutableDictionary initWithDictionary(
			NSDictionary otherDictionary);

	@Generated
	@Selector("initWithDictionary:copyItems:")
	public native NSMutableDictionary initWithDictionaryCopyItems(
			NSDictionary otherDictionary, boolean flag);

	@Generated
	@Selector("initWithObjects:forKeys:")
	public native NSMutableDictionary initWithObjectsForKeys(NSArray objects,
			NSArray keys);

	@Generated
	@Selector("initWithObjects:forKeys:count:")
	public native NSMutableDictionary initWithObjectsForKeysCount(
			ConstPtr<? extends ObjCObject> objects, ConstPtr<? extends ObjCObject> keys, long cnt);

	@Generated
	@Selector("removeAllObjects")
	public native void removeAllObjects();

	@Generated
	@Selector("removeObjectForKey:")
	public native void removeObjectForKey(
			@Mapped(ObjCObjectMapper.class) Object aKey);

	@Generated
	@Selector("removeObjectsForKeys:")
	public native void removeObjectsForKeys(NSArray keyArray);

	@Generated
	@Selector("setDictionary:")
	public native void setDictionary(NSDictionary otherDictionary);

	@Generated
	@Selector("setObject:forKey:")
	public native void setObjectForKey(
			@Mapped(ObjCObjectMapper.class) Object anObject,
			@Mapped(ObjCObjectMapper.class) Object aKey);

	@Generated
	@Selector("setObject:forKeyedSubscript:")
	public native void setObjectForKeyedSubscript(
			@Mapped(ObjCObjectMapper.class) Object obj,
			@Mapped(ObjCObjectMapper.class) Object key);

	@Generated
	@Selector("setValue:forKey:")
	public native void setValueForKey(
			@Mapped(ObjCObjectMapper.class) Object value, String key);
}
