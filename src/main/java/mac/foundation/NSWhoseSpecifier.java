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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSWhoseSpecifier extends NSScriptObjectSpecifier {
	static {
		NatJ.register();
	}

	@Generated
	protected NSWhoseSpecifier(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSWhoseSpecifier alloc();

	@Generated
	@Selector("endSubelementIdentifier")
	public native long endSubelementIdentifier();

	@Generated
	@Selector("endSubelementIndex")
	public native long endSubelementIndex();

	@Generated
	@Selector("init")
	public native NSWhoseSpecifier init();

	@Generated
	@Selector("initWithContainerClassDescription:containerSpecifier:key:")
	public native NSWhoseSpecifier initWithContainerClassDescriptionContainerSpecifierKey(
			NSScriptClassDescription classDesc,
			NSScriptObjectSpecifier container, String property);

	@Generated
	@Selector("initWithContainerClassDescription:containerSpecifier:key:test:")
	public native NSWhoseSpecifier initWithContainerClassDescriptionContainerSpecifierKeyTest(
			NSScriptClassDescription classDesc,
			NSScriptObjectSpecifier container, String property,
			NSScriptWhoseTest test);

	@Generated
	@Selector("initWithContainerSpecifier:key:")
	public native NSWhoseSpecifier initWithContainerSpecifierKey(
			NSScriptObjectSpecifier container, String property);

	@Generated
	@Selector("objectSpecifierWithDescriptor:")
	public static native NSScriptObjectSpecifier objectSpecifierWithDescriptor(
			NSAppleEventDescriptor descriptor);

	@Generated
	@Selector("setEndSubelementIdentifier:")
	public native void setEndSubelementIdentifier(long subelement);

	@Generated
	@Selector("setEndSubelementIndex:")
	public native void setEndSubelementIndex(long index);

	@Generated
	@Selector("setStartSubelementIdentifier:")
	public native void setStartSubelementIdentifier(long subelement);

	@Generated
	@Selector("setStartSubelementIndex:")
	public native void setStartSubelementIndex(long index);

	@Generated
	@Selector("setTest:")
	public native void setTest(NSScriptWhoseTest test);

	@Generated
	@Selector("startSubelementIdentifier")
	public native long startSubelementIdentifier();

	@Generated
	@Selector("startSubelementIndex")
	public native long startSubelementIndex();

	@Generated
	@Selector("test")
	public native NSScriptWhoseTest test();
}
