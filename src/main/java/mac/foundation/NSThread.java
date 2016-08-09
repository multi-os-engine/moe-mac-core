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
import mac.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSThread extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSThread(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSThread alloc();

	@Generated
	@Selector("callStackReturnAddresses")
	public static native NSArray callStackReturnAddresses();

	@Generated
	@Selector("callStackSymbols")
	public static native NSArray callStackSymbols();

	@Generated
	@Selector("cancel")
	public native void cancel();

	@Generated
	@Selector("currentThread")
	public static native NSThread currentThread();

	@Generated
	@Selector("detachNewThreadSelector:toTarget:withObject:")
	public static native void detachNewThreadSelectorToTargetWithObject(
			SEL selector, @Mapped(ObjCObjectMapper.class) Object target,
			@Mapped(ObjCObjectMapper.class) Object argument);

	@Generated
	@Selector("exit")
	public static native void exit();

	@Generated
	@Selector("init")
	public native NSThread init();

	@Generated
	@Selector("initWithTarget:selector:object:")
	public native NSThread initWithTargetSelectorObject(
			@Mapped(ObjCObjectMapper.class) Object target, SEL selector,
			@Mapped(ObjCObjectMapper.class) Object argument);

	@Generated
	@Selector("isCancelled")
	public native boolean isCancelled();

	@Generated
	@Selector("isExecuting")
	public native boolean isExecuting();

	@Generated
	@Selector("isFinished")
	public native boolean isFinished();

	@Generated
	@Selector("isMainThread")
	public native boolean isMainThread();

	@Generated
	@Selector("isMainThread")
	public static native boolean isMainThread_static();

	@Generated
	@Selector("isMultiThreaded")
	public static native boolean isMultiThreaded();

	@Generated
	@Selector("main")
	public native void main();

	@Generated
	@Selector("mainThread")
	public static native NSThread mainThread();

	@Generated
	@Selector("name")
	public native String name();

	@Generated
	@Selector("setName:")
	public native void setName(String n);

	@Generated
	@Selector("setStackSize:")
	public native void setStackSize(long s);

	@Generated
	@Selector("setThreadPriority:")
	public static native boolean setThreadPriority_static(double p);

	@Generated
	@Selector("setThreadPriority:")
	public native void setThreadPriority(double p);

	@Generated
	@Selector("sleepForTimeInterval:")
	public static native void sleepForTimeInterval(double ti);

	@Generated
	@Selector("sleepUntilDate:")
	public static native void sleepUntilDate(NSDate date);

	@Generated
	@Selector("stackSize")
	public native long stackSize();

	@Generated
	@Selector("start")
	public native void start();

	@Generated
	@Selector("threadDictionary")
	public native NSMutableDictionary threadDictionary();

	@Generated
	@Selector("threadPriority")
	public static native double threadPriority_static();

	@Generated
	@Selector("threadPriority")
	public native double threadPriority();
}
