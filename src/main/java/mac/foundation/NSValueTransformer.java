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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSValueTransformer extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSValueTransformer(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSValueTransformer alloc();

	@Generated
	@Selector("allowsReverseTransformation")
	public static native boolean allowsReverseTransformation();

	@Generated
	@Selector("init")
	public native NSValueTransformer init();

	@Generated
	@Selector("reverseTransformedValue:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object reverseTransformedValue(
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("setValueTransformer:forName:")
	public static native void setValueTransformerForName(
			NSValueTransformer transformer, String name);

	@Generated
	@Selector("transformedValue:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object transformedValue(
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("transformedValueClass")
	public static native Class transformedValueClass();

	@Generated
	@Selector("valueTransformerForName:")
	public static native NSValueTransformer valueTransformerForName(String name);

	@Generated
	@Selector("valueTransformerNames")
	public static native NSArray valueTransformerNames();
}
