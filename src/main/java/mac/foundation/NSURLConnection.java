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
import mac.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURLConnection extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSURLConnection(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSURLConnection alloc();

	@Generated
	@Selector("canHandleRequest:")
	public static native boolean canHandleRequest(NSURLRequest request);

	@Generated
	@Selector("cancel")
	public native void cancel();

	@Generated
	@Selector("connectionWithRequest:delegate:")
	public static native NSURLConnection connectionWithRequestDelegate(
			NSURLRequest request,
			@Mapped(ObjCObjectMapper.class) Object delegate);

	@Generated
	@Selector("currentRequest")
	public native NSURLRequest currentRequest();

	@Generated
	@Selector("init")
	public native NSURLConnection init();

	@Generated
	@Selector("initWithRequest:delegate:")
	public native NSURLConnection initWithRequestDelegate(NSURLRequest request,
			@Mapped(ObjCObjectMapper.class) Object delegate);

	@Generated
	@Selector("initWithRequest:delegate:startImmediately:")
	public native NSURLConnection initWithRequestDelegateStartImmediately(
			NSURLRequest request,
			@Mapped(ObjCObjectMapper.class) Object delegate,
			boolean startImmediately);

	@Generated
	@Selector("originalRequest")
	public native NSURLRequest originalRequest();

	@Generated
	@Selector("scheduleInRunLoop:forMode:")
	public native void scheduleInRunLoopForMode(NSRunLoop aRunLoop, String mode);

	@Generated
	@Selector("sendAsynchronousRequest:queue:completionHandler:")
	public static native void sendAsynchronousRequestQueueCompletionHandler(
			NSURLRequest request,
			NSOperationQueue queue,
			@ObjCBlock(name = "call_sendAsynchronousRequestQueueCompletionHandler") Block_sendAsynchronousRequestQueueCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_sendAsynchronousRequestQueueCompletionHandler {
		@Generated
		public void call_sendAsynchronousRequestQueueCompletionHandler(
				NSURLResponse arg0, NSData arg1, NSError arg2);
	}

	@Generated
	@Selector("sendSynchronousRequest:returningResponse:error:")
	public static native NSData sendSynchronousRequestReturningResponseError(
			NSURLRequest request, Ptr<NSURLResponse> response,
			Ptr<NSError> error);

	@Generated
	@Selector("setDelegateQueue:")
	public native void setDelegateQueue(NSOperationQueue queue);

	@Generated
	@Selector("start")
	public native void start();

	@Generated
	@Selector("unscheduleFromRunLoop:forMode:")
	public native void unscheduleFromRunLoopForMode(NSRunLoop aRunLoop,
			String mode);
}
