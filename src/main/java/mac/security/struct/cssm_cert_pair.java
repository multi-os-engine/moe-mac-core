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
public final class cssm_cert_pair extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_cert_pair() {
		super(cssm_cert_pair.class);
	}

	@Generated
	protected cssm_cert_pair(Pointer peer) {
		super(peer);
	}

	@Generated
	public cssm_cert_pair(@ByValue cssm_encoded_cert EncodedCert,
			@ByValue cssm_parsed_cert ParsedCert) {
		super(cssm_cert_pair.class);
		setEncodedCert(EncodedCert);
		setParsedCert(ParsedCert);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native cssm_encoded_cert EncodedCert();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setEncodedCert(@ByValue cssm_encoded_cert value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@ByValue
	public native cssm_parsed_cert ParsedCert();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setParsedCert(@ByValue cssm_parsed_cert value);
}
