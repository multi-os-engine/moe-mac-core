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
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import mac.foundation.*;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSURLProtocolClient")
public interface NSURLProtocolClient {
	@Generated
	@Selector("URLProtocol:cachedResponseIsValid:")
	public void URLProtocolCachedResponseIsValid(NSURLProtocol protocol,
			NSCachedURLResponse cachedResponse);

	@Generated
	@Selector("URLProtocol:didCancelAuthenticationChallenge:")
	public void URLProtocolDidCancelAuthenticationChallenge(
			NSURLProtocol protocol, NSURLAuthenticationChallenge challenge);

	@Generated
	@Selector("URLProtocol:didFailWithError:")
	public void URLProtocolDidFailWithError(NSURLProtocol protocol,
			NSError error);

	@Generated
	@Selector("URLProtocol:didLoadData:")
	public void URLProtocolDidLoadData(NSURLProtocol protocol, NSData data);

	@Generated
	@Selector("URLProtocol:didReceiveAuthenticationChallenge:")
	public void URLProtocolDidReceiveAuthenticationChallenge(
			NSURLProtocol protocol, NSURLAuthenticationChallenge challenge);

	@Generated
	@Selector("URLProtocol:didReceiveResponse:cacheStoragePolicy:")
	public void URLProtocolDidReceiveResponseCacheStoragePolicy(
			NSURLProtocol protocol, NSURLResponse response, long policy);

	@Generated
	@Selector("URLProtocol:wasRedirectedToRequest:redirectResponse:")
	public void URLProtocolWasRedirectedToRequestRedirectResponse(
			NSURLProtocol protocol, NSURLRequest request,
			NSURLResponse redirectResponse);

	@Generated
	@Selector("URLProtocolDidFinishLoading:")
	public void URLProtocolDidFinishLoading(NSURLProtocol protocol);
}
