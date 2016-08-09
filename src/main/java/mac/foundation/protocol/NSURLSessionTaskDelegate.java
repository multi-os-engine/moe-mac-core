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

package mac.foundation.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import mac.foundation.*;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSURLSessionTaskDelegate")
public interface NSURLSessionTaskDelegate extends NSURLSessionDelegate {
	@Generated
	@IsOptional
	@Selector("URLSession:task:didCompleteWithError:")
	public void URLSessionTaskDidCompleteWithError(NSURLSession session,
			NSURLSessionTask task, NSError error);

	@Generated
	@IsOptional
	@Selector("URLSession:task:didReceiveChallenge:completionHandler:")
	public void URLSessionTaskDidReceiveChallengeCompletionHandler(
			NSURLSession session,
			NSURLSessionTask task,
			NSURLAuthenticationChallenge challenge,
			@ObjCBlock(name = "call_URLSessionTaskDidReceiveChallengeCompletionHandler") Block_URLSessionTaskDidReceiveChallengeCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_URLSessionTaskDidReceiveChallengeCompletionHandler {
		@Generated
		public void call_URLSessionTaskDidReceiveChallengeCompletionHandler(
				long arg0, NSURLCredential arg1);
	}

	@Generated
	@IsOptional
	@Selector("URLSession:task:didSendBodyData:totalBytesSent:totalBytesExpectedToSend:")
	public void URLSessionTaskDidSendBodyDataTotalBytesSentTotalBytesExpectedToSend(
			NSURLSession session, NSURLSessionTask task, long bytesSent,
			long totalBytesSent, long totalBytesExpectedToSend);

	@Generated
	@IsOptional
	@Selector("URLSession:task:needNewBodyStream:")
	public void URLSessionTaskNeedNewBodyStream(
			NSURLSession session,
			NSURLSessionTask task,
			@ObjCBlock(name = "call_URLSessionTaskNeedNewBodyStream") Block_URLSessionTaskNeedNewBodyStream completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_URLSessionTaskNeedNewBodyStream {
		@Generated
		public void call_URLSessionTaskNeedNewBodyStream(NSInputStream arg0);
	}

	@Generated
	@IsOptional
	@Selector("URLSession:task:willPerformHTTPRedirection:newRequest:completionHandler:")
	public void URLSessionTaskWillPerformHTTPRedirectionNewRequestCompletionHandler(
			NSURLSession session,
			NSURLSessionTask task,
			NSHTTPURLResponse response,
			NSURLRequest request,
			@ObjCBlock(name = "call_URLSessionTaskWillPerformHTTPRedirectionNewRequestCompletionHandler") Block_URLSessionTaskWillPerformHTTPRedirectionNewRequestCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_URLSessionTaskWillPerformHTTPRedirectionNewRequestCompletionHandler {
		@Generated
		public void call_URLSessionTaskWillPerformHTTPRedirectionNewRequestCompletionHandler(
				NSURLRequest arg0);
	}
}
