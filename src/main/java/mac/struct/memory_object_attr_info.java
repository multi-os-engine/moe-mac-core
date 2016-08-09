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
public final class memory_object_attr_info extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public memory_object_attr_info() {
		super(memory_object_attr_info.class);
	}

	@Generated
	protected memory_object_attr_info(Pointer peer) {
		super(peer);
	}

	@Generated
	public memory_object_attr_info(int copy_strategy, int cluster_size,
			int may_cache_object, int temporary) {
		super(memory_object_attr_info.class);
		setCopy_strategy(copy_strategy);
		setCluster_size(cluster_size);
		setMay_cache_object(may_cache_object);
		setTemporary(temporary);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int copy_strategy();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setCopy_strategy(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int cluster_size();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setCluster_size(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int may_cache_object();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setMay_cache_object(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int temporary();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setTemporary(int value);
}
