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
public final class FPUInformationIntel64 extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public FPUInformationIntel64() {
		super(FPUInformationIntel64.class);
	}

	@Generated
	protected FPUInformationIntel64(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true, count = 80)
	public native byte Registers(int field_idx);

	@Generated
	@StructureField(order = 0, isGetter = false, count = 80)
	public native void setRegisters(byte value, int field_idx);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short Control();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setControl(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short Status();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setStatus(short value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native short Tag();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setTag(short value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native short Opcode();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setOpcode(short value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int IP();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setIP(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int DP();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setDP(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int DS();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setDS(int value);
}
