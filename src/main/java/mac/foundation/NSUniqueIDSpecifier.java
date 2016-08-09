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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSUniqueIDSpecifier extends NSScriptObjectSpecifier {
	static {
		NatJ.register();
	}

	@Generated
	protected NSUniqueIDSpecifier(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSUniqueIDSpecifier alloc();

	@Generated
	@Selector("init")
	public native NSUniqueIDSpecifier init();

	@Generated
	@Selector("initWithContainerClassDescription:containerSpecifier:key:")
	public native NSUniqueIDSpecifier initWithContainerClassDescriptionContainerSpecifierKey(
			NSScriptClassDescription classDesc,
			NSScriptObjectSpecifier container, String property);

	@Generated
	@Selector("initWithContainerClassDescription:containerSpecifier:key:uniqueID:")
	public native NSUniqueIDSpecifier initWithContainerClassDescriptionContainerSpecifierKeyUniqueID(
			NSScriptClassDescription classDesc,
			NSScriptObjectSpecifier container, String property,
			@Mapped(ObjCObjectMapper.class) Object uniqueID);

	@Generated
	@Selector("initWithContainerSpecifier:key:")
	public native NSUniqueIDSpecifier initWithContainerSpecifierKey(
			NSScriptObjectSpecifier container, String property);

	@Generated
	@Selector("objectSpecifierWithDescriptor:")
	public static native NSScriptObjectSpecifier objectSpecifierWithDescriptor(
			NSAppleEventDescriptor descriptor);

	@Generated
	@Selector("setUniqueID:")
	public native void setUniqueID(
			@Mapped(ObjCObjectMapper.class) Object uniqueID);

	@Generated
	@Selector("uniqueID")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object uniqueID();
}
