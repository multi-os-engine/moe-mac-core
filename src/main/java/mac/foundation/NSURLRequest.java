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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.protocol.NSCopying;
import mac.foundation.protocol.NSMutableCopying;
import mac.foundation.protocol.NSSecureCoding;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURLRequest extends NSObject implements NSSecureCoding,
		NSCopying, NSMutableCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected NSURLRequest(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("HTTPBody")
	public native NSData HTTPBody();

	@Generated
	@Selector("HTTPBodyStream")
	public native NSInputStream HTTPBodyStream();

	@Generated
	@Selector("HTTPMethod")
	public native String HTTPMethod();

	@Generated
	@Selector("HTTPShouldHandleCookies")
	public native boolean HTTPShouldHandleCookies();

	@Generated
	@Selector("HTTPShouldUsePipelining")
	public native boolean HTTPShouldUsePipelining();

	@Generated
	@Selector("URL")
	public native NSURL URL();

	@Generated
	@Selector("allHTTPHeaderFields")
	public native NSDictionary allHTTPHeaderFields();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSURLRequest alloc();

	@Generated
	@Selector("allowsCellularAccess")
	public native boolean allowsCellularAccess();

	@Generated
	@Selector("cachePolicy")
	public native long cachePolicy();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("init")
	public native NSURLRequest init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithURL:")
	public native NSURLRequest initWithURL(NSURL URL);

	@Generated
	@Selector("initWithURL:cachePolicy:timeoutInterval:")
	public native NSURLRequest initWithURLCachePolicyTimeoutInterval(NSURL URL,
			long cachePolicy, double timeoutInterval);

	@Generated
	@Selector("mainDocumentURL")
	public native NSURL mainDocumentURL();

	@Generated
	@Selector("mutableCopyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object mutableCopyWithZone(VoidPtr zone);

	@Generated
	@Selector("networkServiceType")
	public native long networkServiceType();

	@Generated
	@Selector("requestWithURL:")
	public static native NSURLRequest requestWithURL(NSURL URL);

	@Generated
	@Selector("requestWithURL:cachePolicy:timeoutInterval:")
	public static native NSURLRequest requestWithURLCachePolicyTimeoutInterval(
			NSURL URL, long cachePolicy, double timeoutInterval);

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	@Generated
	@Selector("timeoutInterval")
	public native double timeoutInterval();

	@Generated
	@Selector("valueForHTTPHeaderField:")
	public native String valueForHTTPHeaderField(String field);
}
