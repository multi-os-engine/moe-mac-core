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
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 4)
public final class task_extmod_info extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public task_extmod_info() {
		super(task_extmod_info.class);
	}

	@Generated
	protected task_extmod_info(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true, count = 16)
	public native byte task_uuid(int field_idx);

	@Generated
	@StructureField(order = 0, isGetter = false, count = 16)
	public native void setTask_uuid(byte value, int field_idx);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@ByValue
	public native vm_extmod_statistics extmod_statistics();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setExtmod_statistics(@ByValue vm_extmod_statistics value);
}
