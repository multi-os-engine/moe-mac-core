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
public final class host_load_info extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public host_load_info() {
		super(host_load_info.class);
	}

	@Generated
	protected host_load_info(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true, count = 3)
	public native int avenrun(int field_idx);

	@Generated
	@StructureField(order = 0, isGetter = false, count = 3)
	public native void setAvenrun(int value, int field_idx);

	@Generated
	@StructureField(order = 1, isGetter = true, count = 3)
	public native int mach_factor(int field_idx);

	@Generated
	@StructureField(order = 1, isGetter = false, count = 3)
	public native void setMach_factor(int value, int field_idx);
}
