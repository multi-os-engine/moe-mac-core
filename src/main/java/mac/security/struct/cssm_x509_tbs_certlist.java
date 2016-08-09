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
public final class cssm_x509_tbs_certlist extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_x509_tbs_certlist() {
		super(cssm_x509_tbs_certlist.class);
	}

	@Generated
	protected cssm_x509_tbs_certlist(Pointer peer) {
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
	public native cssm_x509_algorithm_identifier signature();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setSignature(
			@ByValue cssm_x509_algorithm_identifier value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@ByValue
	public native cssm_x509_name issuer();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setIssuer(@ByValue cssm_x509_name value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	@ByValue
	public native cssm_x509_time thisUpdate();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setThisUpdate(@ByValue cssm_x509_time value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	@ByValue
	public native cssm_x509_time nextUpdate();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setNextUpdate(@ByValue cssm_x509_time value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native cssm_x509_revoked_cert_list revokedCertificates();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setRevokedCertificates(
			@UncertainArgument("Options: reference, array Fallback: reference") cssm_x509_revoked_cert_list value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	@ByValue
	public native cssm_x509_extensions extensions();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setExtensions(@ByValue cssm_x509_extensions value);
}
