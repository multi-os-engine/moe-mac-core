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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURLSessionConfiguration extends NSObject implements NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected NSURLSessionConfiguration(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("HTTPAdditionalHeaders")
	public native NSDictionary HTTPAdditionalHeaders();

	@Generated
	@Selector("HTTPCookieAcceptPolicy")
	public native long HTTPCookieAcceptPolicy();

	@Generated
	@Selector("HTTPCookieStorage")
	public native NSHTTPCookieStorage HTTPCookieStorage();

	@Generated
	@Selector("HTTPMaximumConnectionsPerHost")
	public native long HTTPMaximumConnectionsPerHost();

	@Generated
	@Selector("HTTPShouldSetCookies")
	public native boolean HTTPShouldSetCookies();

	@Generated
	@Selector("HTTPShouldUsePipelining")
	public native boolean HTTPShouldUsePipelining();

	@Generated
	@Selector("TLSMaximumSupportedProtocol")
	public native int TLSMaximumSupportedProtocol();

	@Generated
	@Selector("TLSMinimumSupportedProtocol")
	public native int TLSMinimumSupportedProtocol();

	@Generated
	@Selector("URLCache")
	public native NSURLCache URLCache();

	@Generated
	@Selector("URLCredentialStorage")
	public native NSURLCredentialStorage URLCredentialStorage();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSURLSessionConfiguration alloc();

	@Generated
	@Selector("allowsCellularAccess")
	public native boolean allowsCellularAccess();

	@Generated
	@Selector("backgroundSessionConfiguration:")
	public static native NSURLSessionConfiguration backgroundSessionConfiguration(
			String identifier);

	@Generated
	@Selector("connectionProxyDictionary")
	public native NSDictionary connectionProxyDictionary();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("defaultSessionConfiguration")
	public static native NSURLSessionConfiguration defaultSessionConfiguration();

	@Generated
	@Selector("ephemeralSessionConfiguration")
	public static native NSURLSessionConfiguration ephemeralSessionConfiguration();

	@Generated
	@Selector("identifier")
	public native String identifier();

	@Generated
	@Selector("init")
	public native NSURLSessionConfiguration init();

	@Generated
	@Selector("isDiscretionary")
	public native boolean isDiscretionary();

	@Generated
	@Selector("networkServiceType")
	public native long networkServiceType();

	@Generated
	@Selector("protocolClasses")
	public native NSArray protocolClasses();

	@Generated
	@Selector("requestCachePolicy")
	public native long requestCachePolicy();

	@Generated
	@Selector("sessionSendsLaunchEvents")
	public native boolean sessionSendsLaunchEvents();

	@Generated
	@Selector("setAllowsCellularAccess:")
	public native void setAllowsCellularAccess(boolean value);

	@Generated
	@Selector("setConnectionProxyDictionary:")
	public native void setConnectionProxyDictionary(NSDictionary value);

	@Generated
	@Selector("setDiscretionary:")
	public native void setDiscretionary(boolean value);

	@Generated
	@Selector("setHTTPAdditionalHeaders:")
	public native void setHTTPAdditionalHeaders(NSDictionary value);

	@Generated
	@Selector("setHTTPCookieAcceptPolicy:")
	public native void setHTTPCookieAcceptPolicy(long value);

	@Generated
	@Selector("setHTTPCookieStorage:")
	public native void setHTTPCookieStorage(NSHTTPCookieStorage value);

	@Generated
	@Selector("setHTTPMaximumConnectionsPerHost:")
	public native void setHTTPMaximumConnectionsPerHost(long value);

	@Generated
	@Selector("setHTTPShouldSetCookies:")
	public native void setHTTPShouldSetCookies(boolean value);

	@Generated
	@Selector("setHTTPShouldUsePipelining:")
	public native void setHTTPShouldUsePipelining(boolean value);

	@Generated
	@Selector("setNetworkServiceType:")
	public native void setNetworkServiceType(long value);

	@Generated
	@Selector("setProtocolClasses:")
	public native void setProtocolClasses(NSArray value);

	@Generated
	@Selector("setRequestCachePolicy:")
	public native void setRequestCachePolicy(long value);

	@Generated
	@Selector("setSessionSendsLaunchEvents:")
	public native void setSessionSendsLaunchEvents(boolean value);

	@Generated
	@Selector("setTLSMaximumSupportedProtocol:")
	public native void setTLSMaximumSupportedProtocol(int value);

	@Generated
	@Selector("setTLSMinimumSupportedProtocol:")
	public native void setTLSMinimumSupportedProtocol(int value);

	@Generated
	@Selector("setTimeoutIntervalForRequest:")
	public native void setTimeoutIntervalForRequest(double value);

	@Generated
	@Selector("setTimeoutIntervalForResource:")
	public native void setTimeoutIntervalForResource(double value);

	@Generated
	@Selector("setURLCache:")
	public native void setURLCache(NSURLCache value);

	@Generated
	@Selector("setURLCredentialStorage:")
	public native void setURLCredentialStorage(NSURLCredentialStorage value);

	@Generated
	@Selector("timeoutIntervalForRequest")
	public native double timeoutIntervalForRequest();

	@Generated
	@Selector("timeoutIntervalForResource")
	public native double timeoutIntervalForResource();
}
