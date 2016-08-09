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
public class NSTask extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSTask(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSTask alloc();

	@Generated
	@Selector("arguments")
	public native NSArray arguments();

	@Generated
	@Selector("currentDirectoryPath")
	public native String currentDirectoryPath();

	@Generated
	@Selector("environment")
	public native NSDictionary environment();

	@Generated
	@Selector("init")
	public native NSTask init();

	@Generated
	@Selector("interrupt")
	public native void interrupt();

	@Generated
	@Selector("isRunning")
	public native boolean isRunning();

	@Generated
	@Selector("launch")
	public native void launch();

	@Generated
	@Selector("launchPath")
	public native String launchPath();

	@Generated
	@Selector("launchedTaskWithLaunchPath:arguments:")
	public static native NSTask launchedTaskWithLaunchPathArguments(
			String path, NSArray arguments);

	@Generated
	@Selector("processIdentifier")
	public native int processIdentifier();

	@Generated
	@Selector("resume")
	public native boolean resume();

	@Generated
	@Selector("setArguments:")
	public native void setArguments(NSArray arguments);

	@Generated
	@Selector("setCurrentDirectoryPath:")
	public native void setCurrentDirectoryPath(String path);

	@Generated
	@Selector("setEnvironment:")
	public native void setEnvironment(NSDictionary dict);

	@Generated
	@Selector("setLaunchPath:")
	public native void setLaunchPath(String path);

	@Generated
	@Selector("setStandardError:")
	public native void setStandardError(
			@Mapped(ObjCObjectMapper.class) Object error);

	@Generated
	@Selector("setStandardInput:")
	public native void setStandardInput(
			@Mapped(ObjCObjectMapper.class) Object input);

	@Generated
	@Selector("setStandardOutput:")
	public native void setStandardOutput(
			@Mapped(ObjCObjectMapper.class) Object output);

	@Generated
	@Selector("setTerminationHandler:")
	public native void setTerminationHandler(
			@ObjCBlock(name = "call_setTerminationHandler") Block_setTerminationHandler value);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_setTerminationHandler {
		@Generated
		public void call_setTerminationHandler(NSTask arg0);
	}

	@Generated
	@Selector("standardError")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object standardError();

	@Generated
	@Selector("standardInput")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object standardInput();

	@Generated
	@Selector("standardOutput")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object standardOutput();

	@Generated
	@Selector("suspend")
	public native boolean suspend();

	@Generated
	@Selector("terminate")
	public native void terminate();

	@Generated
	@Selector("terminationReason")
	public native long terminationReason();

	@Generated
	@Selector("terminationStatus")
	public native int terminationStatus();

	@Generated
	@Selector("waitUntilExit")
	public native void waitUntilExit();
}
