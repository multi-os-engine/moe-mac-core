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
public final class task_absolutetime_info extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public task_absolutetime_info() {
		super(task_absolutetime_info.class);
	}

	@Generated
	protected task_absolutetime_info(Pointer peer) {
		super(peer);
	}

	@Generated
	public task_absolutetime_info(long total_user, long total_system,
			long threads_user, long threads_system) {
		super(task_absolutetime_info.class);
		setTotal_user(total_user);
		setTotal_system(total_system);
		setThreads_user(threads_user);
		setThreads_system(threads_system);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native long total_user();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setTotal_user(long value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native long total_system();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setTotal_system(long value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native long threads_user();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setThreads_user(long value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native long threads_system();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setThreads_system(long value);
}
