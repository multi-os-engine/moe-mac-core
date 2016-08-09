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

package mac.security.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class CSSM_APPLE_TP_CERT_REQUEST extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CSSM_APPLE_TP_CERT_REQUEST() {
		super(CSSM_APPLE_TP_CERT_REQUEST.class);
	}

	@Generated
	protected CSSM_APPLE_TP_CERT_REQUEST(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native long cspHand();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setCspHand(long value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native long clHand();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setClHand(long value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int serialNumber();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setSerialNumber(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int numSubjectNames();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setNumSubjectNames(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native CSSM_APPLE_TP_NAME_OID subjectNames();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setSubjectNames(
			@UncertainArgument("Options: reference, array Fallback: reference") CSSM_APPLE_TP_NAME_OID value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int numIssuerNames();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setNumIssuerNames(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native CSSM_APPLE_TP_NAME_OID issuerNames();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setIssuerNames(
			@UncertainArgument("Options: reference, array Fallback: reference") CSSM_APPLE_TP_NAME_OID value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native cssm_x509_name issuerNameX509();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setIssuerNameX509(
			@UncertainArgument("Options: reference, array Fallback: reference") cssm_x509_name value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native cssm_key certPublicKey();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setCertPublicKey(
			@UncertainArgument("Options: reference, array Fallback: reference") cssm_key value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native cssm_key issuerPrivateKey();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setIssuerPrivateKey(
			@UncertainArgument("Options: reference, array Fallback: reference") cssm_key value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native int signatureAlg();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setSignatureAlg(int value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	@ByValue
	public native cssm_data signatureOid();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setSignatureOid(@ByValue cssm_data value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	public native int notBefore();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setNotBefore(int value);

	@Generated
	@StructureField(order = 13, isGetter = true)
	public native int notAfter();

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setNotAfter(int value);

	@Generated
	@StructureField(order = 14, isGetter = true)
	public native int numExtensions();

	@Generated
	@StructureField(order = 14, isGetter = false)
	public native void setNumExtensions(int value);

	@Generated
	@StructureField(order = 15, isGetter = true)
	public native VoidPtr extensions();

	@Generated
	@StructureField(order = 15, isGetter = false)
	public native void setExtensions(VoidPtr value);

	@Generated
	@StructureField(order = 16, isGetter = true)
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public native String challengeString();

	@Generated
	@StructureField(order = 16, isGetter = false)
	public native void setChallengeString(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String value);
}
