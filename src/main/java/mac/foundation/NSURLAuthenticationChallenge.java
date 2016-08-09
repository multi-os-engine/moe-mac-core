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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.protocol.NSSecureCoding;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURLAuthenticationChallenge extends NSObject implements
		NSSecureCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSURLAuthenticationChallenge(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSURLAuthenticationChallenge alloc();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("error")
	public native NSError error();

	@Generated
	@Selector("failureResponse")
	public native NSURLResponse failureResponse();

	@Generated
	@Selector("init")
	public native NSURLAuthenticationChallenge init();

	@Generated
	@Selector("initWithAuthenticationChallenge:sender:")
	public native NSURLAuthenticationChallenge initWithAuthenticationChallengeSender(
			NSURLAuthenticationChallenge challenge,
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithProtectionSpace:proposedCredential:previousFailureCount:failureResponse:error:sender:")
	public native NSURLAuthenticationChallenge initWithProtectionSpaceProposedCredentialPreviousFailureCountFailureResponseErrorSender(
			NSURLProtectionSpace space, NSURLCredential credential,
			long previousFailureCount, NSURLResponse response, NSError error,
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("previousFailureCount")
	public native long previousFailureCount();

	@Generated
	@Selector("proposedCredential")
	public native NSURLCredential proposedCredential();

	@Generated
	@Selector("protectionSpace")
	public native NSURLProtectionSpace protectionSpace();

	@Generated
	@Selector("sender")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object sender();

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}
}
