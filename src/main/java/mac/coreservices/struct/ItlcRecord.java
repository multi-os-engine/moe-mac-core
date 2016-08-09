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

package mac.coreservices.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class ItlcRecord extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public ItlcRecord() {
		super(ItlcRecord.class);
	}

	@Generated
	protected ItlcRecord(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short itlcSystem();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setItlcSystem(short value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short itlcReserved();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setItlcReserved(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native byte itlcFontForce();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setItlcFontForce(byte value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native byte itlcIntlForce();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setItlcIntlForce(byte value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native byte itlcOldKybd();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setItlcOldKybd(byte value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native byte itlcFlags();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setItlcFlags(byte value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native short itlcIconOffset();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setItlcIconOffset(short value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native byte itlcIconSide();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setItlcIconSide(byte value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native byte itlcIconRsvd();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setItlcIconRsvd(byte value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native short itlcRegionCode();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setItlcRegionCode(short value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native short itlcSysFlags();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setItlcSysFlags(short value);

	@Generated
	@StructureField(order = 11, isGetter = true, count = 32)
	public native byte itlcReserved4(int field_idx);

	@Generated
	@StructureField(order = 11, isGetter = false, count = 32)
	public native void setItlcReserved4(byte value, int field_idx);
}
