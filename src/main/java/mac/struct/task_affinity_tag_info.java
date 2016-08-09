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
public final class task_affinity_tag_info extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public task_affinity_tag_info() {
		super(task_affinity_tag_info.class);
	}

	@Generated
	protected task_affinity_tag_info(Pointer peer) {
		super(peer);
	}

	@Generated
	public task_affinity_tag_info(int set_count, int min, int max,
			int task_count) {
		super(task_affinity_tag_info.class);
		setSet_count(set_count);
		setMin(min);
		setMax(max);
		setTask_count(task_count);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int set_count();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setSet_count(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int min();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setMin(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int max();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setMax(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int task_count();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setTask_count(int value);
}
