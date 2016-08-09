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
public final class task_kernelmemory_info extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public task_kernelmemory_info() {
		super(task_kernelmemory_info.class);
	}

	@Generated
	protected task_kernelmemory_info(Pointer peer) {
		super(peer);
	}

	@Generated
	public task_kernelmemory_info(long total_palloc, long total_pfree,
			long total_salloc, long total_sfree) {
		super(task_kernelmemory_info.class);
		setTotal_palloc(total_palloc);
		setTotal_pfree(total_pfree);
		setTotal_salloc(total_salloc);
		setTotal_sfree(total_sfree);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native long total_palloc();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setTotal_palloc(long value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native long total_pfree();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setTotal_pfree(long value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native long total_salloc();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setTotal_salloc(long value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native long total_sfree();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setTotal_sfree(long value);
}
