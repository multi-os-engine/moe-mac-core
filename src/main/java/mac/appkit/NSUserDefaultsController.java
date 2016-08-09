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

package mac.appkit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.foundation.NSDictionary;
import mac.foundation.NSUserDefaults;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSUserDefaultsController extends NSController {
	static {
		NatJ.register();
	}

	@Generated
	protected NSUserDefaultsController(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSUserDefaultsController alloc();

	@Generated
	@Selector("appliesImmediately")
	public native boolean appliesImmediately();

	@Generated
	@Selector("defaults")
	public native NSUserDefaults defaults();

	@Generated
	@Selector("hasUnappliedChanges")
	public native boolean hasUnappliedChanges();

	@Generated
	@Selector("init")
	public native NSUserDefaultsController init();

	@Generated
	@Selector("initWithDefaults:initialValues:")
	public native NSUserDefaultsController initWithDefaultsInitialValues(
			NSUserDefaults defaults, NSDictionary initialValues);

	@Generated
	@Selector("initialValues")
	public native NSDictionary initialValues();

	@Generated
	@Selector("revert:")
	public native void revert(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("revertToInitialValues:")
	public native void revertToInitialValues(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("save:")
	public native void save(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("setAppliesImmediately:")
	public native void setAppliesImmediately(boolean flag);

	@Generated
	@Selector("setInitialValues:")
	public native void setInitialValues(NSDictionary initialValues);

	@Generated
	@Selector("sharedUserDefaultsController")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object sharedUserDefaultsController();

	@Generated
	@Selector("values")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object values();
}
