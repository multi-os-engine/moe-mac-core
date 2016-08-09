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
import mac.coreservices.opaque.MPProcessID;
import mac.coreservices.opaque.MPTaskID;

@Generated
@Structure()
public final class MPCriticalRegionInfo extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public MPCriticalRegionInfo() {
		super(MPCriticalRegionInfo.class);
	}

	@Generated
	protected MPCriticalRegionInfo(Pointer peer) {
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
	public native MPProcessID processID();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setProcessID(MPProcessID value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int regionName();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setRegionName(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native long nWaiting();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setNWaiting(long value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native MPTaskID waitingTaskID();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setWaitingTaskID(MPTaskID value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native MPTaskID owningTask();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setOwningTask(MPTaskID value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native long count();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setCount(long value);
}
