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
import mac.foundation.protocol.NSSecureCoding;
import mac.security.opaque.SecTrustRef;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURLProtectionSpace extends NSObject implements NSSecureCoding,
		NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected NSURLProtectionSpace(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSURLProtectionSpace alloc();

	@Generated
	@Selector("authenticationMethod")
	public native String authenticationMethod();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("distinguishedNames")
	public native NSArray distinguishedNames();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("host")
	public native String host();

	@Generated
	@Selector("init")
	public native NSURLProtectionSpace init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithHost:port:protocol:realm:authenticationMethod:")
	public native NSURLProtectionSpace initWithHostPortProtocolRealmAuthenticationMethod(
			String host, long port, String protocol, String realm,
			String authenticationMethod);

	@Generated
	@Selector("initWithProxyHost:port:type:realm:authenticationMethod:")
	public native NSURLProtectionSpace initWithProxyHostPortTypeRealmAuthenticationMethod(
			String host, long port, String type, String realm,
			String authenticationMethod);

	@Generated
	@Selector("isProxy")
	public native boolean isProxy();

	@Generated
	@Selector("port")
	public native long port();

	@Generated
	@Selector("protocol")
	public native String protocol();

	@Generated
	@Selector("proxyType")
	public native String proxyType();

	@Generated
	@Selector("realm")
	public native String realm();

	@Generated
	@Selector("receivesCredentialSecurely")
	public native boolean receivesCredentialSecurely();

	@Generated
	@Selector("serverTrust")
	public native SecTrustRef serverTrust();

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}
}
