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

package mac.coreservices.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MDQueryBatchingParams extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public MDQueryBatchingParams() {
		super(MDQueryBatchingParams.class);
	}

	@Generated
	protected MDQueryBatchingParams(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native long first_max_num();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setFirst_max_num(long value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native long first_max_ms();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setFirst_max_ms(long value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native long progress_max_num();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setProgress_max_num(long value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native long progress_max_ms();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setProgress_max_ms(long value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native long update_max_num();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setUpdate_max_num(long value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native long update_max_ms();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setUpdate_max_ms(long value);
}
