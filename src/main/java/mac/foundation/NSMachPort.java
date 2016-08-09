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
public class NSMachPort extends NSPort {
	static {
		NatJ.register();
	}

	@Generated
	protected NSMachPort(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSMachPort alloc();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("init")
	public native NSMachPort init();

	@Generated
	@Selector("initWithMachPort:")
	public native NSMachPort initWithMachPort(int machPort);

	@Generated
	@Selector("initWithMachPort:options:")
	public native NSMachPort initWithMachPortOptions(int machPort, long f);

	@Generated
	@Selector("machPort")
	public native int machPort();

	@Generated
	@Selector("port")
	public static native NSPort port();

	@Generated
	@Selector("portWithMachPort:")
	public static native NSPort portWithMachPort(int machPort);

	@Generated
	@Selector("portWithMachPort:options:")
	public static native NSPort portWithMachPortOptions(int machPort, long f);

	@Generated
	@Selector("removeFromRunLoop:forMode:")
	public native void removeFromRunLoopForMode(NSRunLoop runLoop, String mode);

	@Generated
	@Selector("scheduleInRunLoop:forMode:")
	public native void scheduleInRunLoopForMode(NSRunLoop runLoop, String mode);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object anObject);
}
