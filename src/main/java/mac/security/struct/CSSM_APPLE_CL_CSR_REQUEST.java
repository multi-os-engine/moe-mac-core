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

@Generated
@Structure()
public final class CSSM_APPLE_CL_CSR_REQUEST extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CSSM_APPLE_CL_CSR_REQUEST() {
		super(CSSM_APPLE_CL_CSR_REQUEST.class);
	}

	@Generated
	protected CSSM_APPLE_CL_CSR_REQUEST(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native cssm_x509_name subjectNameX509();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setSubjectNameX509(
			@UncertainArgument("Options: reference, array Fallback: reference") cssm_x509_name value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int signatureAlg();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setSignatureAlg(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@ByValue
	public native cssm_data signatureOid();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setSignatureOid(@ByValue cssm_data value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native long cspHand();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setCspHand(long value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native cssm_key subjectPublicKey();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setSubjectPublicKey(
			@UncertainArgument("Options: reference, array Fallback: reference") cssm_key value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native cssm_key subjectPrivateKey();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setSubjectPrivateKey(
			@UncertainArgument("Options: reference, array Fallback: reference") cssm_key value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public native String challengeString();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setChallengeString(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String value);
}
