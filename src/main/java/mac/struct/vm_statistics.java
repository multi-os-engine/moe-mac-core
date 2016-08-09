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

package mac.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class vm_statistics extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public vm_statistics() {
		super(vm_statistics.class);
	}

	@Generated
	protected vm_statistics(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int free_count();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setFree_count(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int active_count();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setActive_count(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int inactive_count();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setInactive_count(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int wire_count();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setWire_count(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int zero_fill_count();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setZero_fill_count(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int reactivations();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setReactivations(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int pageins();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setPageins(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int pageouts();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setPageouts(int value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native int faults();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setFaults(int value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native int cow_faults();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setCow_faults(int value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native int lookups();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setLookups(int value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native int hits();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setHits(int value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	public native int purgeable_count();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setPurgeable_count(int value);

	@Generated
	@StructureField(order = 13, isGetter = true)
	public native int purges();

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setPurges(int value);

	@Generated
	@StructureField(order = 14, isGetter = true)
	public native int speculative_count();

	@Generated
	@StructureField(order = 14, isGetter = false)
	public native void setSpeculative_count(int value);
}
