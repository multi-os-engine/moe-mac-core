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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSProcessInfo extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSProcessInfo(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("activeProcessorCount")
	public native long activeProcessorCount();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSProcessInfo alloc();

	@Generated
	@Selector("arguments")
	public native NSArray arguments();

	@Generated
	@Selector("automaticTerminationSupportEnabled")
	public native boolean automaticTerminationSupportEnabled();

	@Generated
	@Selector("beginActivityWithOptions:reason:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object beginActivityWithOptionsReason(long options,
			String reason);

	@Generated
	@Selector("disableAutomaticTermination:")
	public native void disableAutomaticTermination(String reason);

	@Generated
	@Selector("disableSuddenTermination")
	public native void disableSuddenTermination();

	@Generated
	@Selector("enableAutomaticTermination:")
	public native void enableAutomaticTermination(String reason);

	@Generated
	@Selector("enableSuddenTermination")
	public native void enableSuddenTermination();

	@Generated
	@Selector("endActivity:")
	public native void endActivity(
			@Mapped(ObjCObjectMapper.class) Object activity);

	@Generated
	@Selector("environment")
	public native NSDictionary environment();

	@Generated
	@Selector("globallyUniqueString")
	public native String globallyUniqueString();

	@Generated
	@Selector("hostName")
	public native String hostName();

	@Generated
	@Selector("init")
	public native NSProcessInfo init();

	@Generated
	@Selector("operatingSystem")
	public native long operatingSystem();

	@Generated
	@Selector("operatingSystemName")
	public native String operatingSystemName();

	@Generated
	@Selector("operatingSystemVersionString")
	public native String operatingSystemVersionString();

	@Generated
	@Selector("performActivityWithOptions:reason:usingBlock:")
	public native void performActivityWithOptionsReasonUsingBlock(
			long options,
			String reason,
			@ObjCBlock(name = "call_performActivityWithOptionsReasonUsingBlock") Block_performActivityWithOptionsReasonUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_performActivityWithOptionsReasonUsingBlock {
		@Generated
		public void call_performActivityWithOptionsReasonUsingBlock();
	}

	@Generated
	@Selector("physicalMemory")
	public native long physicalMemory();

	@Generated
	@Selector("processIdentifier")
	public native int processIdentifier();

	@Generated
	@Selector("processInfo")
	public static native NSProcessInfo processInfo();

	@Generated
	@Selector("processName")
	public native String processName();

	@Generated
	@Selector("processorCount")
	public native long processorCount();

	@Generated
	@Selector("setAutomaticTerminationSupportEnabled:")
	public native void setAutomaticTerminationSupportEnabled(boolean flag);

	@Generated
	@Selector("setProcessName:")
	public native void setProcessName(String newName);

	@Generated
	@Selector("systemUptime")
	public native double systemUptime();
}
