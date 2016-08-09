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
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSUserAutomatorTask extends NSUserScriptTask {
	static {
		NatJ.register();
	}

	@Generated
	protected NSUserAutomatorTask(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSUserAutomatorTask alloc();

	@Generated
	@Selector("executeWithInput:completionHandler:")
	public native void executeWithInputCompletionHandler(
			@Mapped(ObjCObjectMapper.class) Object input,
			@ObjCBlock(name = "call_executeWithInputCompletionHandler") Block_executeWithInputCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_executeWithInputCompletionHandler {
		@Generated
		public void call_executeWithInputCompletionHandler(
				@Mapped(ObjCObjectMapper.class) Object arg0, NSError arg1);
	}

	@Generated
	@Selector("init")
	public native NSUserAutomatorTask init();

	@Generated
	@Selector("initWithURL:error:")
	public native NSUserAutomatorTask initWithURLError(NSURL url,
			Ptr<NSError> error);

	@Generated
	@Selector("setVariables:")
	public native void setVariables(NSDictionary value);

	@Generated
	@Selector("variables")
	public native NSDictionary variables();
}
