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
public final class policy_fifo_info extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public policy_fifo_info() {
		super(policy_fifo_info.class);
	}

	@Generated
	protected policy_fifo_info(Pointer peer) {
		super(peer);
	}

	@Generated
	public policy_fifo_info(int max_priority, int base_priority, int depressed,
			int depress_priority) {
		super(policy_fifo_info.class);
		setMax_priority(max_priority);
		setBase_priority(base_priority);
		setDepressed(depressed);
		setDepress_priority(depress_priority);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int max_priority();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setMax_priority(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int base_priority();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setBase_priority(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int depressed();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setDepressed(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int depress_priority();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setDepress_priority(int value);
}
