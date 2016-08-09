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
@Structure()
public final class thread_basic_info extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public thread_basic_info() {
		super(thread_basic_info.class);
	}

	@Generated
	protected thread_basic_info(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native time_value user_time();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setUser_time(@ByValue time_value value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@ByValue
	public native time_value system_time();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setSystem_time(@ByValue time_value value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int cpu_usage();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setCpu_usage(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int policy();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setPolicy(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int run_state();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setRun_state(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int flags();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setFlags(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int suspend_count();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setSuspend_count(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int sleep_time();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setSleep_time(int value);
}
