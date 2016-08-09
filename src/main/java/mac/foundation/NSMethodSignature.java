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


import org.moe.natj.c.map.CStringMapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import mac.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMethodSignature extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSMethodSignature(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSMethodSignature alloc();

	@Generated
	@Selector("frameLength")
	public native long frameLength();

	@Generated
	@Selector("getArgumentTypeAtIndex:")
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	@MappedReturn(CStringMapper.class)
	public native String getArgumentTypeAtIndex(long idx);

	@Generated
	@Selector("init")
	public native NSMethodSignature init();

	@Generated
	@Selector("isOneway")
	public native boolean isOneway();

	@Generated
	@Selector("methodReturnLength")
	public native long methodReturnLength();

	@Generated
	@Selector("methodReturnType")
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	@MappedReturn(CStringMapper.class)
	public native String methodReturnType();

	@Generated
	@Selector("numberOfArguments")
	public native long numberOfArguments();

	@Generated
	@Selector("signatureWithObjCTypes:")
	public static native NSMethodSignature signatureWithObjCTypes(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String types);
}
