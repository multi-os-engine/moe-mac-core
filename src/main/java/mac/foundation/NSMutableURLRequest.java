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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMutableURLRequest extends NSURLRequest {
	static {
		NatJ.register();
	}

	@Generated
	protected NSMutableURLRequest(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addValue:forHTTPHeaderField:")
	public native void addValueForHTTPHeaderField(String value, String field);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSMutableURLRequest alloc();

	@Generated
	@Selector("init")
	public native NSMutableURLRequest init();

	@Generated
	@Selector("initWithURL:")
	public native NSMutableURLRequest initWithURL(NSURL URL);

	@Generated
	@Selector("initWithURL:cachePolicy:timeoutInterval:")
	public native NSMutableURLRequest initWithURLCachePolicyTimeoutInterval(
			NSURL URL, long cachePolicy, double timeoutInterval);

	@Generated
	@Selector("requestWithURL:")
	public static native NSMutableURLRequest requestWithURL(NSURL URL);

	@Generated
	@Selector("requestWithURL:cachePolicy:timeoutInterval:")
	public static native NSMutableURLRequest requestWithURLCachePolicyTimeoutInterval(
			NSURL URL, long cachePolicy, double timeoutInterval);

	@Generated
	@Selector("setAllHTTPHeaderFields:")
	public native void setAllHTTPHeaderFields(NSDictionary headerFields);

	@Generated
	@Selector("setAllowsCellularAccess:")
	public native void setAllowsCellularAccess(boolean allow);

	@Generated
	@Selector("setCachePolicy:")
	public native void setCachePolicy(long policy);

	@Generated
	@Selector("setHTTPBody:")
	public native void setHTTPBody(NSData data);

	@Generated
	@Selector("setHTTPBodyStream:")
	public native void setHTTPBodyStream(NSInputStream inputStream);

	@Generated
	@Selector("setHTTPMethod:")
	public native void setHTTPMethod(String method);

	@Generated
	@Selector("setHTTPShouldHandleCookies:")
	public native void setHTTPShouldHandleCookies(boolean should);

	@Generated
	@Selector("setHTTPShouldUsePipelining:")
	public native void setHTTPShouldUsePipelining(boolean shouldUsePipelining);

	@Generated
	@Selector("setMainDocumentURL:")
	public native void setMainDocumentURL(NSURL URL);

	@Generated
	@Selector("setNetworkServiceType:")
	public native void setNetworkServiceType(long networkServiceType);

	@Generated
	@Selector("setTimeoutInterval:")
	public native void setTimeoutInterval(double seconds);

	@Generated
	@Selector("setURL:")
	public native void setURL(NSURL URL);

	@Generated
	@Selector("setValue:forHTTPHeaderField:")
	public native void setValueForHTTPHeaderField(String value, String field);
}
