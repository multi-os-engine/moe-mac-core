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
public class NSURLSession extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSURLSession(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSURLSession alloc();

	@Generated
	@Selector("configuration")
	public native NSURLSessionConfiguration configuration();

	@Generated
	@Selector("dataTaskWithHTTPGetRequest:")
	public native NSURLSessionDataTask dataTaskWithHTTPGetRequest(NSURL url);

	@Generated
	@Selector("dataTaskWithHTTPGetRequest:completionHandler:")
	public native NSURLSessionDataTask dataTaskWithHTTPGetRequestCompletionHandler(
			NSURL url,
			@ObjCBlock(name = "call_dataTaskWithHTTPGetRequestCompletionHandler") Block_dataTaskWithHTTPGetRequestCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_dataTaskWithHTTPGetRequestCompletionHandler {
		@Generated
		public void call_dataTaskWithHTTPGetRequestCompletionHandler(
				NSData arg0, NSURLResponse arg1, NSError arg2);
	}

	@Generated
	@Selector("dataTaskWithRequest:")
	public native NSURLSessionDataTask dataTaskWithRequest(NSURLRequest request);

	@Generated
	@Selector("dataTaskWithRequest:completionHandler:")
	public native NSURLSessionDataTask dataTaskWithRequestCompletionHandler(
			NSURLRequest request,
			@ObjCBlock(name = "call_dataTaskWithRequestCompletionHandler") Block_dataTaskWithRequestCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_dataTaskWithRequestCompletionHandler {
		@Generated
		public void call_dataTaskWithRequestCompletionHandler(NSData arg0,
				NSURLResponse arg1, NSError arg2);
	}

	@Generated
	@Selector("dataTaskWithURL:")
	public native NSURLSessionDataTask dataTaskWithURL(NSURL url);

	@Generated
	@Selector("dataTaskWithURL:completionHandler:")
	public native NSURLSessionDataTask dataTaskWithURLCompletionHandler(
			NSURL url,
			@ObjCBlock(name = "call_dataTaskWithURLCompletionHandler") Block_dataTaskWithURLCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_dataTaskWithURLCompletionHandler {
		@Generated
		public void call_dataTaskWithURLCompletionHandler(NSData arg0,
				NSURLResponse arg1, NSError arg2);
	}

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("delegateQueue")
	public native NSOperationQueue delegateQueue();

	@Generated
	@Selector("downloadTaskWithRequest:")
	public native NSURLSessionDownloadTask downloadTaskWithRequest(
			NSURLRequest request);

	@Generated
	@Selector("downloadTaskWithRequest:completionHandler:")
	public native NSURLSessionDownloadTask downloadTaskWithRequestCompletionHandler(
			NSURLRequest request,
			@ObjCBlock(name = "call_downloadTaskWithRequestCompletionHandler") Block_downloadTaskWithRequestCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_downloadTaskWithRequestCompletionHandler {
		@Generated
		public void call_downloadTaskWithRequestCompletionHandler(NSURL arg0,
				NSURLResponse arg1, NSError arg2);
	}

	@Generated
	@Selector("downloadTaskWithResumeData:")
	public native NSURLSessionDownloadTask downloadTaskWithResumeData(
			NSData resumeData);

	@Generated
	@Selector("downloadTaskWithResumeData:completionHandler:")
	public native NSURLSessionDownloadTask downloadTaskWithResumeDataCompletionHandler(
			NSData resumeData,
			@ObjCBlock(name = "call_downloadTaskWithResumeDataCompletionHandler") Block_downloadTaskWithResumeDataCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_downloadTaskWithResumeDataCompletionHandler {
		@Generated
		public void call_downloadTaskWithResumeDataCompletionHandler(
				NSURL arg0, NSURLResponse arg1, NSError arg2);
	}

	@Generated
	@Selector("downloadTaskWithURL:")
	public native NSURLSessionDownloadTask downloadTaskWithURL(NSURL url);

	@Generated
	@Selector("downloadTaskWithURL:completionHandler:")
	public native NSURLSessionDownloadTask downloadTaskWithURLCompletionHandler(
			NSURL url,
			@ObjCBlock(name = "call_downloadTaskWithURLCompletionHandler") Block_downloadTaskWithURLCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_downloadTaskWithURLCompletionHandler {
		@Generated
		public void call_downloadTaskWithURLCompletionHandler(NSURL arg0,
				NSURLResponse arg1, NSError arg2);
	}

	@Generated
	@Selector("finishTasksAndInvalidate")
	public native void finishTasksAndInvalidate();

	@Generated
	@Selector("flushWithCompletionHandler:")
	public native void flushWithCompletionHandler(
			@ObjCBlock(name = "call_flushWithCompletionHandler") Block_flushWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_flushWithCompletionHandler {
		@Generated
		public void call_flushWithCompletionHandler();
	}

	@Generated
	@Selector("getTasksWithCompletionHandler:")
	public native void getTasksWithCompletionHandler(
			@ObjCBlock(name = "call_getTasksWithCompletionHandler") Block_getTasksWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_getTasksWithCompletionHandler {
		@Generated
		public void call_getTasksWithCompletionHandler(NSArray arg0,
				NSArray arg1, NSArray arg2);
	}

	@Generated
	@Selector("init")
	public native NSURLSession init();

	@Generated
	@Selector("invalidateAndCancel")
	public native void invalidateAndCancel();

	@Generated
	@Selector("resetWithCompletionHandler:")
	public native void resetWithCompletionHandler(
			@ObjCBlock(name = "call_resetWithCompletionHandler") Block_resetWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_resetWithCompletionHandler {
		@Generated
		public void call_resetWithCompletionHandler();
	}

	@Generated
	@Selector("sessionDescription")
	public native String sessionDescription();

	@Generated
	@Selector("sessionWithConfiguration:")
	public static native NSURLSession sessionWithConfiguration(
			NSURLSessionConfiguration configuration);

	@Generated
	@Selector("sessionWithConfiguration:delegate:delegateQueue:")
	public static native NSURLSession sessionWithConfigurationDelegateDelegateQueue(
			NSURLSessionConfiguration configuration,
			@Mapped(ObjCObjectMapper.class) Object delegate,
			NSOperationQueue queue);

	@Generated
	@Selector("setSessionDescription:")
	public native void setSessionDescription(String value);

	@Generated
	@Selector("sharedSession")
	public static native NSURLSession sharedSession();

	@Generated
	@Selector("uploadTaskWithRequest:fromData:")
	public native NSURLSessionUploadTask uploadTaskWithRequestFromData(
			NSURLRequest request, NSData bodyData);

	@Generated
	@Selector("uploadTaskWithRequest:fromData:completionHandler:")
	public native NSURLSessionUploadTask uploadTaskWithRequestFromDataCompletionHandler(
			NSURLRequest request,
			NSData bodyData,
			@ObjCBlock(name = "call_uploadTaskWithRequestFromDataCompletionHandler") Block_uploadTaskWithRequestFromDataCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_uploadTaskWithRequestFromDataCompletionHandler {
		@Generated
		public void call_uploadTaskWithRequestFromDataCompletionHandler(
				NSData arg0, NSURLResponse arg1, NSError arg2);
	}

	@Generated
	@Selector("uploadTaskWithRequest:fromFile:")
	public native NSURLSessionUploadTask uploadTaskWithRequestFromFile(
			NSURLRequest request, NSURL fileURL);

	@Generated
	@Selector("uploadTaskWithRequest:fromFile:completionHandler:")
	public native NSURLSessionUploadTask uploadTaskWithRequestFromFileCompletionHandler(
			NSURLRequest request,
			NSURL fileURL,
			@ObjCBlock(name = "call_uploadTaskWithRequestFromFileCompletionHandler") Block_uploadTaskWithRequestFromFileCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_uploadTaskWithRequestFromFileCompletionHandler {
		@Generated
		public void call_uploadTaskWithRequestFromFileCompletionHandler(
				NSData arg0, NSURLResponse arg1, NSError arg2);
	}

	@Generated
	@Selector("uploadTaskWithStreamedRequest:")
	public native NSURLSessionUploadTask uploadTaskWithStreamedRequest(
			NSURLRequest request);
}
