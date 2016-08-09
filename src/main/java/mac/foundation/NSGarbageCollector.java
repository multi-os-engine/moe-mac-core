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
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSGarbageCollector extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSGarbageCollector(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSGarbageCollector alloc();

	@Generated
	@Selector("collectExhaustively")
	public native void collectExhaustively();

	@Generated
	@Selector("collectIfNeeded")
	public native void collectIfNeeded();

	@Generated
	@Selector("defaultCollector")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object defaultCollector();

	@Generated
	@Selector("disable")
	public native void disable();

	@Generated
	@Selector("disableCollectorForPointer:")
	public native void disableCollectorForPointer(ConstVoidPtr ptr);

	@Generated
	@Selector("enable")
	public native void enable();

	@Generated
	@Selector("enableCollectorForPointer:")
	public native void enableCollectorForPointer(ConstVoidPtr ptr);

	@Generated
	@Selector("init")
	public native NSGarbageCollector init();

	@Generated
	@Selector("isCollecting")
	public native boolean isCollecting();

	@Generated
	@Selector("isEnabled")
	public native boolean isEnabled();

	@Generated
	@Selector("zone")
	public native VoidPtr zone();
}
