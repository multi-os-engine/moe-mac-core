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
@ObjCProtocolName("NSURLSessionDataDelegate")
public interface NSURLSessionDataDelegate extends NSURLSessionTaskDelegate {
	@Generated
	@IsOptional
	@Selector("URLSession:dataTask:didBecomeDownloadTask:")
	public void URLSessionDataTaskDidBecomeDownloadTask(NSURLSession session,
			NSURLSessionDataTask dataTask, NSURLSessionDownloadTask downloadTask);

	@Generated
	@IsOptional
	@Selector("URLSession:dataTask:didReceiveData:")
	public void URLSessionDataTaskDidReceiveData(NSURLSession session,
			NSURLSessionDataTask dataTask, NSData data);

	@Generated
	@IsOptional
	@Selector("URLSession:dataTask:didReceiveResponse:completionHandler:")
	public void URLSessionDataTaskDidReceiveResponseCompletionHandler(
			NSURLSession session,
			NSURLSessionDataTask dataTask,
			NSURLResponse response,
			@ObjCBlock(name = "call_URLSessionDataTaskDidReceiveResponseCompletionHandler") Block_URLSessionDataTaskDidReceiveResponseCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_URLSessionDataTaskDidReceiveResponseCompletionHandler {
		@Generated
		public void call_URLSessionDataTaskDidReceiveResponseCompletionHandler(
				long arg0);
	}

	@Generated
	@IsOptional
	@Selector("URLSession:dataTask:willCacheResponse:completionHandler:")
	public void URLSessionDataTaskWillCacheResponseCompletionHandler(
			NSURLSession session,
			NSURLSessionDataTask dataTask,
			NSCachedURLResponse proposedResponse,
			@ObjCBlock(name = "call_URLSessionDataTaskWillCacheResponseCompletionHandler") Block_URLSessionDataTaskWillCacheResponseCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_URLSessionDataTaskWillCacheResponseCompletionHandler {
		@Generated
		public void call_URLSessionDataTaskWillCacheResponseCompletionHandler(
				NSCachedURLResponse arg0);
	}
}
