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
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSUserNotificationCenter extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSUserNotificationCenter(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSUserNotificationCenter alloc();

	@Generated
	@Selector("defaultUserNotificationCenter")
	public static native NSUserNotificationCenter defaultUserNotificationCenter();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("deliverNotification:")
	public native void deliverNotification(NSUserNotification notification);

	@Generated
	@Selector("deliveredNotifications")
	public native NSArray deliveredNotifications();

	@Generated
	@Selector("init")
	public native NSUserNotificationCenter init();

	@Generated
	@Selector("removeAllDeliveredNotifications")
	public native void removeAllDeliveredNotifications();

	@Generated
	@Selector("removeDeliveredNotification:")
	public native void removeDeliveredNotification(
			NSUserNotification notification);

	@Generated
	@Selector("removeScheduledNotification:")
	public native void removeScheduledNotification(
			NSUserNotification notification);

	@Generated
	@Selector("scheduleNotification:")
	public native void scheduleNotification(NSUserNotification notification);

	@Generated
	@Selector("scheduledNotifications")
	public native NSArray scheduledNotifications();

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	public void setDelegate(@Mapped(ObjCObjectMapper.class) Object value) {
		ObjCObject __old = (ObjCObject) delegate();
		if (value != null) {
			ObjCRuntime.associateObjCObject(this, value);
		}
		setDelegate_unsafe(value);
		if (__old != null) {
			ObjCRuntime
					.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("setScheduledNotifications:")
	public native void setScheduledNotifications(NSArray value);
}
