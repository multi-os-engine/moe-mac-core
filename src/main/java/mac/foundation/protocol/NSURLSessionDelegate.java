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
import mac.foundation.NSError;
import mac.foundation.NSURLAuthenticationChallenge;
import mac.foundation.NSURLCredential;
import mac.foundation.NSURLSession;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSURLSessionDelegate")
public interface NSURLSessionDelegate {
	@Generated
	@IsOptional
	@Selector("URLSession:didBecomeInvalidWithError:")
	public void URLSessionDidBecomeInvalidWithError(NSURLSession session,
			NSError error);

	@Generated
	@IsOptional
	@Selector("URLSession:didReceiveChallenge:completionHandler:")
	public void URLSessionDidReceiveChallengeCompletionHandler(
			NSURLSession session,
			NSURLAuthenticationChallenge challenge,
			@ObjCBlock(name = "call_URLSessionDidReceiveChallengeCompletionHandler") Block_URLSessionDidReceiveChallengeCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_URLSessionDidReceiveChallengeCompletionHandler {
		@Generated
		public void call_URLSessionDidReceiveChallengeCompletionHandler(
				long arg0, NSURLCredential arg1);
	}

	@Generated
	@IsOptional
	@Selector("URLSessionDidFinishEventsForBackgroundURLSession:")
	public void URLSessionDidFinishEventsForBackgroundURLSession(
			NSURLSession session);
}
