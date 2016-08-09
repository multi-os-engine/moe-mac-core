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
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class cssm_cert_bundle_header extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_cert_bundle_header() {
		super(cssm_cert_bundle_header.class);
	}

	@Generated
	protected cssm_cert_bundle_header(Pointer peer) {
		super(peer);
	}

	@Generated
	public cssm_cert_bundle_header(int BundleType, int BundleEncoding) {
		super(cssm_cert_bundle_header.class);
		setBundleType(BundleType);
		setBundleEncoding(BundleEncoding);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int BundleType();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setBundleType(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int BundleEncoding();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setBundleEncoding(int value);
}
