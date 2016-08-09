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

package mac.coredata;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.foundation.NSData;

@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSAttributeDescription extends NSPropertyDescription {
	static {
		NatJ.register();
	}

	@Generated
	protected NSAttributeDescription(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSAttributeDescription alloc();

	@Generated
	@Selector("allowsExternalBinaryDataStorage")
	public native boolean allowsExternalBinaryDataStorage();

	@Generated
	@Selector("attributeType")
	public native long attributeType();

	@Generated
	@Selector("attributeValueClassName")
	public native String attributeValueClassName();

	@Generated
	@Selector("defaultValue")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object defaultValue();

	@Generated
	@Selector("init")
	public native NSAttributeDescription init();

	@Generated
	@Selector("setAllowsExternalBinaryDataStorage:")
	public native void setAllowsExternalBinaryDataStorage(boolean flag);

	@Generated
	@Selector("setAttributeType:")
	public native void setAttributeType(long type);

	@Generated
	@Selector("setAttributeValueClassName:")
	public native void setAttributeValueClassName(String className);

	@Generated
	@Selector("setDefaultValue:")
	public native void setDefaultValue(
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("setValueTransformerName:")
	public native void setValueTransformerName(String string);

	@Generated
	@Selector("valueTransformerName")
	public native String valueTransformerName();

	@Generated
	@Selector("versionHash")
	public native NSData versionHash();
}
