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
import org.moe.natj.objc.Class;
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
public class NSScriptCoercionHandler extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSScriptCoercionHandler(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSScriptCoercionHandler alloc();

	@Generated
	@Selector("coerceValue:toClass:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object coerceValueToClass(
			@Mapped(ObjCObjectMapper.class) Object value, Class toClass);

	@Generated
	@Selector("init")
	public native NSScriptCoercionHandler init();

	@Generated
	@Selector("registerCoercer:selector:toConvertFromClass:toClass:")
	public native void registerCoercerSelectorToConvertFromClassToClass(
			@Mapped(ObjCObjectMapper.class) Object coercer, SEL selector,
			Class fromClass, Class toClass);

	@Generated
	@Selector("sharedCoercionHandler")
	public static native NSScriptCoercionHandler sharedCoercionHandler();
}
