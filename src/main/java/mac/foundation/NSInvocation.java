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
import org.moe.natj.general.ptr.VoidPtr;
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
public class NSInvocation extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSInvocation(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSInvocation alloc();

	@Generated
	@Selector("argumentsRetained")
	public native boolean argumentsRetained();

	@Generated
	@Selector("getArgument:atIndex:")
	public native void getArgumentAtIndex(VoidPtr argumentLocation, long idx);

	@Generated
	@Selector("getReturnValue:")
	public native void getReturnValue(VoidPtr retLoc);

	@Generated
	@Selector("init")
	public native NSInvocation init();

	@Generated
	@Selector("invocationWithMethodSignature:")
	public static native NSInvocation invocationWithMethodSignature(
			NSMethodSignature sig);

	@Generated
	@Selector("invoke")
	public native void invoke();

	@Generated
	@Selector("invokeWithTarget:")
	public native void invokeWithTarget(
			@Mapped(ObjCObjectMapper.class) Object target);

	@Generated
	@Selector("methodSignature")
	public native NSMethodSignature methodSignature();

	@Generated
	@Selector("retainArguments")
	public native void retainArguments();

	@Generated
	@Selector("selector")
	public native SEL selector();

	@Generated
	@Selector("setArgument:atIndex:")
	public native void setArgumentAtIndex(VoidPtr argumentLocation, long idx);

	@Generated
	@Selector("setReturnValue:")
	public native void setReturnValue(VoidPtr retLoc);

	@Generated
	@Selector("setSelector:")
	public native void setSelector(SEL selector);

	@Generated
	@Selector("setTarget:")
	public native void setTarget(@Mapped(ObjCObjectMapper.class) Object target);

	@Generated
	@Selector("target")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object target();
}
