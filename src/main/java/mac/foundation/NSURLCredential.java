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
import mac.security.opaque.SecIdentityRef;
import mac.security.opaque.SecTrustRef;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURLCredential extends NSObject implements NSSecureCoding,
		NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected NSURLCredential(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSURLCredential alloc();

	@Generated
	@Selector("certificates")
	public native NSArray certificates();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("credentialForTrust:")
	public static native NSURLCredential credentialForTrust(SecTrustRef trust);

	@Generated
	@Selector("credentialWithIdentity:certificates:persistence:")
	public static native NSURLCredential credentialWithIdentityCertificatesPersistence(
			SecIdentityRef identity, NSArray certArray, long persistence);

	@Generated
	@Selector("credentialWithUser:password:persistence:")
	public static native NSURLCredential credentialWithUserPasswordPersistence(
			String user, String password, long persistence);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("hasPassword")
	public native boolean hasPassword();

	@Generated
	@Selector("identity")
	public native SecIdentityRef identity();

	@Generated
	@Selector("init")
	public native NSURLCredential init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithIdentity:certificates:persistence:")
	public native NSURLCredential initWithIdentityCertificatesPersistence(
			SecIdentityRef identity, NSArray certArray, long persistence);

	@Generated
	@Selector("initWithTrust:")
	public native NSURLCredential initWithTrust(SecTrustRef trust);

	@Generated
	@Selector("initWithUser:password:persistence:")
	public native NSURLCredential initWithUserPasswordPersistence(String user,
			String password, long persistence);

	@Generated
	@Selector("password")
	public native String password();

	@Generated
	@Selector("persistence")
	public native long persistence();

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	@Generated
	@Selector("user")
	public native String user();
}
