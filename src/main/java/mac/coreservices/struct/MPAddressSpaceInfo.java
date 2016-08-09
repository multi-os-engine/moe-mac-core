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
import mac.coreservices.opaque.MPCoherenceID;
import mac.coreservices.opaque.MPProcessID;

@Generated
@Structure()
public final class MPAddressSpaceInfo extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public MPAddressSpaceInfo() {
		super(MPAddressSpaceInfo.class);
	}

	@Generated
	protected MPAddressSpaceInfo(Pointer peer) {
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
	public native MPCoherenceID groupID();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setGroupID(MPCoherenceID value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native long nTasks();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setNTasks(long value);

	@Generated
	@StructureField(order = 4, isGetter = true, count = 16)
	public native int vsid(int field_idx);

	@Generated
	@StructureField(order = 4, isGetter = false, count = 16)
	public native void setVsid(int value, int field_idx);
}
