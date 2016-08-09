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
import org.moe.natj.general.ptr.VoidPtr;
import mac.coreservices.opaque.MPAddressSpaceID;
import mac.coreservices.opaque.MPCpuID;
import mac.coreservices.opaque.MPOpaqueID;
import mac.coreservices.opaque.MPProcessID;
import mac.struct.UnsignedWide;

@Generated
@Structure()
public final class MPTaskInfo extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public MPTaskInfo() {
		super(MPTaskInfo.class);
	}

	@Generated
	protected MPTaskInfo(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int version();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setVersion(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int name();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setName(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int queueName();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setQueueName(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native short runState();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setRunState(short value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native short lastCPU();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setLastCPU(short value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int weight();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setWeight(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native MPProcessID processID();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setProcessID(MPProcessID value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	@ByValue
	public native UnsignedWide cpuTime();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setCpuTime(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	@ByValue
	public native UnsignedWide schedTime();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setSchedTime(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	@ByValue
	public native UnsignedWide creationTime();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setCreationTime(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native long codePageFaults();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setCodePageFaults(long value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native long dataPageFaults();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setDataPageFaults(long value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	public native long preemptions();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setPreemptions(long value);

	@Generated
	@StructureField(order = 13, isGetter = true)
	public native MPCpuID cpuID();

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setCpuID(MPCpuID value);

	@Generated
	@StructureField(order = 14, isGetter = true)
	public native MPOpaqueID blockedObject();

	@Generated
	@StructureField(order = 14, isGetter = false)
	public native void setBlockedObject(MPOpaqueID value);

	@Generated
	@StructureField(order = 15, isGetter = true)
	public native MPAddressSpaceID spaceID();

	@Generated
	@StructureField(order = 15, isGetter = false)
	public native void setSpaceID(MPAddressSpaceID value);

	@Generated
	@StructureField(order = 16, isGetter = true)
	public native VoidPtr stackBase();

	@Generated
	@StructureField(order = 16, isGetter = false)
	public native void setStackBase(VoidPtr value);

	@Generated
	@StructureField(order = 17, isGetter = true)
	public native VoidPtr stackLimit();

	@Generated
	@StructureField(order = 17, isGetter = false)
	public native void setStackLimit(VoidPtr value);

	@Generated
	@StructureField(order = 18, isGetter = true)
	public native VoidPtr stackCurr();

	@Generated
	@StructureField(order = 18, isGetter = false)
	public native void setStackCurr(VoidPtr value);
}
