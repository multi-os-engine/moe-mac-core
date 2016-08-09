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
public final class cssm_kr_wrappedproductinfo extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_kr_wrappedproductinfo() {
		super(cssm_kr_wrappedproductinfo.class);
	}

	@Generated
	protected cssm_kr_wrappedproductinfo(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native cssm_version StandardVersion();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setStandardVersion(@ByValue cssm_version value);

	@Generated
	@StructureField(order = 1, isGetter = true, count = 68)
	public native byte StandardDescription(int field_idx);

	@Generated
	@StructureField(order = 1, isGetter = false, count = 68)
	public native void setStandardDescription(byte value, int field_idx);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@ByValue
	public native cssm_version ProductVersion();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setProductVersion(@ByValue cssm_version value);

	@Generated
	@StructureField(order = 3, isGetter = true, count = 68)
	public native byte ProductDescription(int field_idx);

	@Generated
	@StructureField(order = 3, isGetter = false, count = 68)
	public native void setProductDescription(byte value, int field_idx);

	@Generated
	@StructureField(order = 4, isGetter = true, count = 68)
	public native byte ProductVendor(int field_idx);

	@Generated
	@StructureField(order = 4, isGetter = false, count = 68)
	public native void setProductVendor(byte value, int field_idx);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int ProductFlags();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setProductFlags(int value);
}
