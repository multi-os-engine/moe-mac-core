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
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSDistributedNotificationCenter extends NSNotificationCenter {
	static {
		NatJ.register();
	}

	@Generated
	protected NSDistributedNotificationCenter(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addObserver:selector:name:object:")
	public native void addObserverSelectorNameObject(
			@Mapped(ObjCObjectMapper.class) Object observer, SEL aSelector,
			String aName, String anObject);

	@Generated
	@Selector("addObserver:selector:name:object:suspensionBehavior:")
	public native void addObserverSelectorNameObjectSuspensionBehavior(
			@Mapped(ObjCObjectMapper.class) Object observer, SEL selector,
			String name, String object, long suspensionBehavior);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSDistributedNotificationCenter alloc();

	@Generated
	@Selector("defaultCenter")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object defaultCenter();

	@Generated
	@Selector("init")
	public native NSDistributedNotificationCenter init();

	@Generated
	@Selector("notificationCenterForType:")
	public static native NSDistributedNotificationCenter notificationCenterForType(
			String notificationCenterType);

	@Generated
	@Selector("postNotificationName:object:")
	public native void postNotificationNameObject(String aName, String anObject);

	@Generated
	@Selector("postNotificationName:object:userInfo:")
	public native void postNotificationNameObjectUserInfo(String aName,
			String anObject, NSDictionary aUserInfo);

	@Generated
	@Selector("postNotificationName:object:userInfo:deliverImmediately:")
	public native void postNotificationNameObjectUserInfoDeliverImmediately(
			String name, String object, NSDictionary userInfo,
			boolean deliverImmediately);

	@Generated
	@Selector("postNotificationName:object:userInfo:options:")
	public native void postNotificationNameObjectUserInfoOptions(String name,
			String object, NSDictionary userInfo, long options);

	@Generated
	@Selector("removeObserver:name:object:")
	public native void removeObserverNameObject(
			@Mapped(ObjCObjectMapper.class) Object observer, String aName,
			String anObject);

	@Generated
	@Selector("setSuspended:")
	public native void setSuspended(boolean suspended);

	@Generated
	@Selector("suspended")
	public native boolean suspended();
}
