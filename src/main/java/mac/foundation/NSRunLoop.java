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
import mac.corefoundation.opaque.CFRunLoopRef;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSRunLoop extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSRunLoop(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("acceptInputForMode:beforeDate:")
	public native void acceptInputForModeBeforeDate(String mode,
			NSDate limitDate);

	@Generated
	@Selector("addPort:forMode:")
	public native void addPortForMode(NSPort aPort, String mode);

	@Generated
	@Selector("addTimer:forMode:")
	public native void addTimerForMode(NSTimer timer, String mode);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSRunLoop alloc();

	@Generated
	@Selector("cancelPerformSelector:target:argument:")
	public native void cancelPerformSelectorTargetArgument(SEL aSelector,
			@Mapped(ObjCObjectMapper.class) Object target,
			@Mapped(ObjCObjectMapper.class) Object arg);

	@Generated
	@Selector("cancelPerformSelectorsWithTarget:")
	public native void cancelPerformSelectorsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object target);

	@Generated
	@Selector("configureAsServer")
	public native void configureAsServer();

	@Generated
	@Selector("currentMode")
	public native String currentMode();

	@Generated
	@Selector("currentRunLoop")
	public static native NSRunLoop currentRunLoop();

	@Generated
	@Selector("getCFRunLoop")
	public native CFRunLoopRef getCFRunLoop();

	@Generated
	@Selector("init")
	public native NSRunLoop init();

	@Generated
	@Selector("limitDateForMode:")
	public native NSDate limitDateForMode(String mode);

	@Generated
	@Selector("mainRunLoop")
	public static native NSRunLoop mainRunLoop();

	@Generated
	@Selector("performSelector:target:argument:order:modes:")
	public native void performSelectorTargetArgumentOrderModes(SEL aSelector,
			@Mapped(ObjCObjectMapper.class) Object target,
			@Mapped(ObjCObjectMapper.class) Object arg, long order,
			NSArray modes);

	@Generated
	@Selector("removePort:forMode:")
	public native void removePortForMode(NSPort aPort, String mode);

	@Generated
	@Selector("run")
	public native void run();

	@Generated
	@Selector("runMode:beforeDate:")
	public native boolean runModeBeforeDate(String mode, NSDate limitDate);

	@Generated
	@Selector("runUntilDate:")
	public native void runUntilDate(NSDate limitDate);
}
