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

@Generated
@Structure()
public final class cssm_x509_tbs_certificate extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_x509_tbs_certificate() {
		super(cssm_x509_tbs_certificate.class);
	}

	@Generated
	protected cssm_x509_tbs_certificate(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native cssm_data version();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setVersion(@ByValue cssm_data value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@ByValue
	public native cssm_data serialNumber();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setSerialNumber(@ByValue cssm_data value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@ByValue
	public native cssm_x509_algorithm_identifier signature();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setSignature(
			@ByValue cssm_x509_algorithm_identifier value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	@ByValue
	public native cssm_x509_name issuer();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setIssuer(@ByValue cssm_x509_name value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	@ByValue
	public native x509_validity validity();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setValidity(@ByValue x509_validity value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	@ByValue
	public native cssm_x509_name subject();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setSubject(@ByValue cssm_x509_name value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	@ByValue
	public native cssm_x509_subject_public_key_info subjectPublicKeyInfo();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setSubjectPublicKeyInfo(
			@ByValue cssm_x509_subject_public_key_info value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	@ByValue
	public native cssm_data issuerUniqueIdentifier();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setIssuerUniqueIdentifier(@ByValue cssm_data value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	@ByValue
	public native cssm_data subjectUniqueIdentifier();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setSubjectUniqueIdentifier(@ByValue cssm_data value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	@ByValue
	public native cssm_x509_extensions extensions();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setExtensions(@ByValue cssm_x509_extensions value);
}
