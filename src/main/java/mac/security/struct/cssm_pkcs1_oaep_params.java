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
public final class cssm_pkcs1_oaep_params extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_pkcs1_oaep_params() {
		super(cssm_pkcs1_oaep_params.class);
	}

	@Generated
	protected cssm_pkcs1_oaep_params(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int HashAlgorithm();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setHashAlgorithm(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@ByValue
	public native cssm_data HashParams();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setHashParams(@ByValue cssm_data value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int MGF();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setMGF(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	@ByValue
	public native cssm_data MGFParams();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setMGFParams(@ByValue cssm_data value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int PSource();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setPSource(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	@ByValue
	public native cssm_data PSourceParams();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setPSourceParams(@ByValue cssm_data value);
}
