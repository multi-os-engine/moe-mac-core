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
public final class CE_AuthorityKeyID extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CE_AuthorityKeyID() {
		super(CE_AuthorityKeyID.class);
	}

	@Generated
	protected CE_AuthorityKeyID(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int keyIdentifierPresent();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setKeyIdentifierPresent(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@ByValue
	public native cssm_data keyIdentifier();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setKeyIdentifier(@ByValue cssm_data value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int generalNamesPresent();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setGeneralNamesPresent(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native CE_GeneralNames generalNames();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setGeneralNames(
			@UncertainArgument("Options: reference, array Fallback: reference") CE_GeneralNames value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int serialNumberPresent();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setSerialNumberPresent(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	@ByValue
	public native cssm_data serialNumber();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setSerialNumber(@ByValue cssm_data value);
}
