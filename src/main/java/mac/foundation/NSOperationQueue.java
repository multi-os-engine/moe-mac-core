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
public class NSOperationQueue extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSOperationQueue(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addOperation:")
	public native void addOperation(NSOperation op);

	@Generated
	@Selector("addOperationWithBlock:")
	public native void addOperationWithBlock(
			@ObjCBlock(name = "call_addOperationWithBlock") Block_addOperationWithBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_addOperationWithBlock {
		@Generated
		public void call_addOperationWithBlock();
	}

	@Generated
	@Selector("addOperations:waitUntilFinished:")
	public native void addOperationsWaitUntilFinished(NSArray ops, boolean wait_);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSOperationQueue alloc();

	@Generated
	@Selector("cancelAllOperations")
	public native void cancelAllOperations();

	@Generated
	@Selector("currentQueue")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object currentQueue();

	@Generated
	@Selector("init")
	public native NSOperationQueue init();

	@Generated
	@Selector("isSuspended")
	public native boolean isSuspended();

	@Generated
	@Selector("mainQueue")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object mainQueue();

	@Generated
	@Selector("maxConcurrentOperationCount")
	public native long maxConcurrentOperationCount();

	@Generated
	@Selector("name")
	public native String name();

	@Generated
	@Selector("operationCount")
	public native long operationCount();

	@Generated
	@Selector("operations")
	public native NSArray operations();

	@Generated
	@Selector("setMaxConcurrentOperationCount:")
	public native void setMaxConcurrentOperationCount(long cnt);

	@Generated
	@Selector("setName:")
	public native void setName(String n);

	@Generated
	@Selector("setSuspended:")
	public native void setSuspended(boolean b);

	@Generated
	@Selector("waitUntilAllOperationsAreFinished")
	public native void waitUntilAllOperationsAreFinished();
}
