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
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import mac.struct.UnsignedWide;

@Generated
@Structure()
public final class MachineInformationPowerPC extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public MachineInformationPowerPC() {
		super(MachineInformationPowerPC.class);
	}

	@Generated
	protected MachineInformationPowerPC(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native UnsignedWide CTR();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setCTR(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@ByValue
	public native UnsignedWide LR();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setLR(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@ByValue
	public native UnsignedWide PC();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setPC(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native long CRRegister();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setCRRegister(long value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native long XER();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setXER(long value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native long MSR();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setMSR(long value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native long MQ();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setMQ(long value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native long ExceptKind();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setExceptKind(long value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native long DSISR();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setDSISR(long value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	@ByValue
	public native UnsignedWide DAR();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setDAR(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	@ByValue
	public native UnsignedWide Reserved();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setReserved(@ByValue UnsignedWide value);
}
