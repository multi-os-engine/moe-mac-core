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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import mac.NSObject;
import mac.foundation.protocol.NSLocking;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSConditionLock extends NSObject implements NSLocking {
	static {
		NatJ.register();
	}

	@Generated
	protected NSConditionLock(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSConditionLock alloc();

	@Generated
	@Selector("condition")
	public native long condition();

	@Generated
	@Selector("init")
	public native NSConditionLock init();

	@Generated
	@Selector("initWithCondition:")
	public native NSConditionLock initWithCondition(long condition);

	@Generated
	@Selector("lock")
	public native void lock();

	@Generated
	@Selector("lockBeforeDate:")
	public native boolean lockBeforeDate(NSDate limit);

	@Generated
	@Selector("lockWhenCondition:")
	public native void lockWhenCondition(long condition);

	@Generated
	@Selector("lockWhenCondition:beforeDate:")
	public native boolean lockWhenConditionBeforeDate(long condition,
			NSDate limit);

	@Generated
	@Selector("name")
	public native String name();

	@Generated
	@Selector("setName:")
	public native void setName(String n);

	@Generated
	@Selector("tryLock")
	public native boolean tryLock();

	@Generated
	@Selector("tryLockWhenCondition:")
	public native boolean tryLockWhenCondition(long condition);

	@Generated
	@Selector("unlock")
	public native void unlock();

	@Generated
	@Selector("unlockWithCondition:")
	public native void unlockWithCondition(long condition);
}
