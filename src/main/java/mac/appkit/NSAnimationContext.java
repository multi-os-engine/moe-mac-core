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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import mac.NSObject;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSAnimationContext extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSAnimationContext(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSAnimationContext alloc();

	@Generated
	@Selector("allowsImplicitAnimation")
	public native boolean allowsImplicitAnimation();

	@Generated
	@Selector("beginGrouping")
	public static native void beginGrouping();

	@Generated
	@Selector("currentContext")
	public static native NSAnimationContext currentContext();

	@Generated
	@Selector("duration")
	public native double duration();

	@Generated
	@Selector("endGrouping")
	public static native void endGrouping();

	@Generated
	@Selector("init")
	public native NSAnimationContext init();

	@Generated
	@Selector("runAnimationGroup:completionHandler:")
	public static native void runAnimationGroupCompletionHandler(
			@ObjCBlock(name = "call_runAnimationGroupCompletionHandler_0") Block_runAnimationGroupCompletionHandler_0 changes,
			@ObjCBlock(name = "call_runAnimationGroupCompletionHandler_1") Block_runAnimationGroupCompletionHandler_1 completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_runAnimationGroupCompletionHandler_0 {
		@Generated
		public void call_runAnimationGroupCompletionHandler_0(
				NSAnimationContext arg0);
	}

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_runAnimationGroupCompletionHandler_1 {
		@Generated
		public void call_runAnimationGroupCompletionHandler_1();
	}

	@Generated
	@Selector("setAllowsImplicitAnimation:")
	public native void setAllowsImplicitAnimation(boolean value);

	@Generated
	@Selector("setCompletionHandler:")
	public native void setCompletionHandler(
			@ObjCBlock(name = "call_setCompletionHandler") Block_setCompletionHandler value);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_setCompletionHandler {
		@Generated
		public void call_setCompletionHandler();
	}

	@Generated
	@Selector("setDuration:")
	public native void setDuration(double value);
}
