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
public final class processor_basic_info extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public processor_basic_info() {
		super(processor_basic_info.class);
	}

	@Generated
	protected processor_basic_info(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int cpu_type();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setCpu_type(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int cpu_subtype();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setCpu_subtype(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int running();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setRunning(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int slot_num();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setSlot_num(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int is_master();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setIs_master(int value);
}
