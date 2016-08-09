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
@Structure(alignment = 4)
public final class task_vm_info extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public task_vm_info() {
		super(task_vm_info.class);
	}

	@Generated
	protected task_vm_info(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native long virtual_size();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setVirtual_size(long value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int region_count();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setRegion_count(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int page_size();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setPage_size(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native long resident_size();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setResident_size(long value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native long resident_size_peak();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setResident_size_peak(long value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native long device();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setDevice(long value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native long device_peak();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setDevice_peak(long value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native long internal();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setInternal(long value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native long internal_peak();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setInternal_peak(long value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native long external();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setExternal(long value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native long external_peak();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setExternal_peak(long value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native long reusable();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setReusable(long value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	public native long reusable_peak();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setReusable_peak(long value);

	@Generated
	@StructureField(order = 13, isGetter = true)
	public native long purgeable_volatile_pmap();

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setPurgeable_volatile_pmap(long value);

	@Generated
	@StructureField(order = 14, isGetter = true)
	public native long purgeable_volatile_resident();

	@Generated
	@StructureField(order = 14, isGetter = false)
	public native void setPurgeable_volatile_resident(long value);

	@Generated
	@StructureField(order = 15, isGetter = true)
	public native long purgeable_volatile_virtual();

	@Generated
	@StructureField(order = 15, isGetter = false)
	public native void setPurgeable_volatile_virtual(long value);

	@Generated
	@StructureField(order = 16, isGetter = true)
	public native long compressed();

	@Generated
	@StructureField(order = 16, isGetter = false)
	public native void setCompressed(long value);

	@Generated
	@StructureField(order = 17, isGetter = true)
	public native long compressed_peak();

	@Generated
	@StructureField(order = 17, isGetter = false)
	public native void setCompressed_peak(long value);

	@Generated
	@StructureField(order = 18, isGetter = true)
	public native long compressed_lifetime();

	@Generated
	@StructureField(order = 18, isGetter = false)
	public native void setCompressed_lifetime(long value);
}
