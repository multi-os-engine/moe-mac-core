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
public class NSTimer extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSTimer(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSTimer alloc();

	@Generated
	@Selector("fire")
	public native void fire();

	@Generated
	@Selector("fireDate")
	public native NSDate fireDate();

	@Generated
	@Selector("init")
	public native NSTimer init();

	@Generated
	@Selector("initWithFireDate:interval:target:selector:userInfo:repeats:")
	public native NSTimer initWithFireDateIntervalTargetSelectorUserInfoRepeats(
			NSDate date, double ti, @Mapped(ObjCObjectMapper.class) Object t,
			SEL s, @Mapped(ObjCObjectMapper.class) Object ui, boolean rep);

	@Generated
	@Selector("invalidate")
	public native void invalidate();

	@Generated
	@Selector("isValid")
	public native boolean isValid();

	@Generated
	@Selector("scheduledTimerWithTimeInterval:invocation:repeats:")
	public static native NSTimer scheduledTimerWithTimeIntervalInvocationRepeats(
			double ti, NSInvocation invocation, boolean yesOrNo);

	@Generated
	@Selector("scheduledTimerWithTimeInterval:target:selector:userInfo:repeats:")
	public static native NSTimer scheduledTimerWithTimeIntervalTargetSelectorUserInfoRepeats(
			double ti, @Mapped(ObjCObjectMapper.class) Object aTarget,
			SEL aSelector, @Mapped(ObjCObjectMapper.class) Object userInfo,
			boolean yesOrNo);

	@Generated
	@Selector("setFireDate:")
	public native void setFireDate(NSDate date);

	@Generated
	@Selector("setTolerance:")
	public native void setTolerance(double tolerance);

	@Generated
	@Selector("timeInterval")
	public native double timeInterval();

	@Generated
	@Selector("timerWithTimeInterval:invocation:repeats:")
	public static native NSTimer timerWithTimeIntervalInvocationRepeats(
			double ti, NSInvocation invocation, boolean yesOrNo);

	@Generated
	@Selector("timerWithTimeInterval:target:selector:userInfo:repeats:")
	public static native NSTimer timerWithTimeIntervalTargetSelectorUserInfoRepeats(
			double ti, @Mapped(ObjCObjectMapper.class) Object aTarget,
			SEL aSelector, @Mapped(ObjCObjectMapper.class) Object userInfo,
			boolean yesOrNo);

	@Generated
	@Selector("tolerance")
	public native double tolerance();

	@Generated
	@Selector("userInfo")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object userInfo();
}
