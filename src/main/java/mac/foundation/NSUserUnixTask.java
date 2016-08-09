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
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSUserUnixTask extends NSUserScriptTask {
	static {
		NatJ.register();
	}

	@Generated
	protected NSUserUnixTask(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSUserUnixTask alloc();

	@Generated
	@Selector("executeWithArguments:completionHandler:")
	public native void executeWithArgumentsCompletionHandler(
			NSArray arguments,
			@ObjCBlock(name = "call_executeWithArgumentsCompletionHandler") Block_executeWithArgumentsCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_executeWithArgumentsCompletionHandler {
		@Generated
		public void call_executeWithArgumentsCompletionHandler(NSError arg0);
	}

	@Generated
	@Selector("init")
	public native NSUserUnixTask init();

	@Generated
	@Selector("initWithURL:error:")
	public native NSUserUnixTask initWithURLError(NSURL url, Ptr<NSError> error);

	@Generated
	@Selector("setStandardError:")
	public native void setStandardError(NSFileHandle value);

	@Generated
	@Selector("setStandardInput:")
	public native void setStandardInput(NSFileHandle value);

	@Generated
	@Selector("setStandardOutput:")
	public native void setStandardOutput(NSFileHandle value);

	@Generated
	@Selector("standardError")
	public native NSFileHandle standardError();

	@Generated
	@Selector("standardInput")
	public native NSFileHandle standardInput();

	@Generated
	@Selector("standardOutput")
	public native NSFileHandle standardOutput();
}
