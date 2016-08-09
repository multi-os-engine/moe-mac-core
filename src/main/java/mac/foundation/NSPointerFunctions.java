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


import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.natj.objc.map.ObjCStringMapper;
import mac.NSObject;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPointerFunctions extends NSObject implements NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected NSPointerFunctions(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSPointerFunctions alloc();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("init")
	public native NSPointerFunctions init();

	@Generated
	@Selector("initWithOptions:")
	public native NSPointerFunctions initWithOptions(long options);

	@Generated
	@Selector("pointerFunctionsWithOptions:")
	public static native NSPointerFunctions pointerFunctionsWithOptions(
			long options);

	@Generated
	@Selector("setDescriptionFunction:")
	public native void setDescriptionFunction(
			@FunctionPtr(name = "call_setDescriptionFunction") Function_setDescriptionFunction value);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Function_setDescriptionFunction {
		@Generated
		@MappedReturn(ObjCStringMapper.class)
		public String call_setDescriptionFunction(ConstVoidPtr arg0);
	}

	@Generated
	@Selector("setSizeFunction:")
	public native void setSizeFunction(
			@FunctionPtr(name = "call_setSizeFunction") Function_setSizeFunction value);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Function_setSizeFunction {
		@Generated
		public long call_setSizeFunction(ConstVoidPtr arg0);
	}

	@Generated
	@Selector("setUsesStrongWriteBarrier:")
	public native void setUsesStrongWriteBarrier(boolean value);

	@Generated
	@Selector("setUsesWeakReadAndWriteBarriers:")
	public native void setUsesWeakReadAndWriteBarriers(boolean value);

	@Generated
	@Selector("usesStrongWriteBarrier")
	public native boolean usesStrongWriteBarrier();

	@Generated
	@Selector("usesWeakReadAndWriteBarriers")
	public native boolean usesWeakReadAndWriteBarriers();
}
