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
public final class vm_region_submap_short_info_64 extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public vm_region_submap_short_info_64() {
		super(vm_region_submap_short_info_64.class);
	}

	@Generated
	protected vm_region_submap_short_info_64(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int protection();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setProtection(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int max_protection();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setMax_protection(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int inheritance();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setInheritance(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native long offset();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setOffset(long value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int user_tag();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setUser_tag(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int ref_count();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setRef_count(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native short shadow_depth();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setShadow_depth(short value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native byte external_pager();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setExternal_pager(byte value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native byte share_mode();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setShare_mode(byte value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native int is_submap();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setIs_submap(int value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native int behavior();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setBehavior(int value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native int object_id();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setObject_id(int value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	public native short user_wired_count();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setUser_wired_count(short value);
}
