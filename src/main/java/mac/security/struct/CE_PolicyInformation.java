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
public final class CE_PolicyInformation extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CE_PolicyInformation() {
		super(CE_PolicyInformation.class);
	}

	@Generated
	protected CE_PolicyInformation(Pointer peer) {
		super(peer);
	}

	@Generated
	public CE_PolicyInformation(
			@ByValue cssm_data certPolicyId,
			int numPolicyQualifiers,
			@UncertainArgument("Options: reference, array Fallback: reference") CE_PolicyQualifierInfo policyQualifiers) {
		super(CE_PolicyInformation.class);
		setCertPolicyId(certPolicyId);
		setNumPolicyQualifiers(numPolicyQualifiers);
		setPolicyQualifiers(policyQualifiers);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native cssm_data certPolicyId();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setCertPolicyId(@ByValue cssm_data value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int numPolicyQualifiers();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setNumPolicyQualifiers(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native CE_PolicyQualifierInfo policyQualifiers();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setPolicyQualifiers(
			@UncertainArgument("Options: reference, array Fallback: reference") CE_PolicyQualifierInfo value);
}
