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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import mac.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSOperation extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSOperation(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addDependency:")
	public native void addDependency(NSOperation op);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSOperation alloc();

	@Generated
	@Selector("cancel")
	public native void cancel();

	@Generated
	@Selector("dependencies")
	public native NSArray dependencies();

	@Generated
	@Selector("init")
	public native NSOperation init();

	@Generated
	@Selector("isCancelled")
	public native boolean isCancelled();

	@Generated
	@Selector("isConcurrent")
	public native boolean isConcurrent();

	@Generated
	@Selector("isExecuting")
	public native boolean isExecuting();

	@Generated
	@Selector("isFinished")
	public native boolean isFinished();

	@Generated
	@Selector("isReady")
	public native boolean isReady();

	@Generated
	@Selector("main")
	public native void main();

	@Generated
	@Selector("queuePriority")
	public native long queuePriority();

	@Generated
	@Selector("removeDependency:")
	public native void removeDependency(NSOperation op);

	@Generated
	@Selector("setCompletionBlock:")
	public native void setCompletionBlock(
			@ObjCBlock(name = "call_setCompletionBlock") Block_setCompletionBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_setCompletionBlock {
		@Generated
		public void call_setCompletionBlock();
	}

	@Generated
	@Selector("setQueuePriority:")
	public native void setQueuePriority(long p);

	@Generated
	@Selector("setThreadPriority:")
	public native void setThreadPriority(double p);

	@Generated
	@Selector("start")
	public native void start();

	@Generated
	@Selector("threadPriority")
	public native double threadPriority();

	@Generated
	@Selector("waitUntilFinished")
	public native void waitUntilFinished();
}
