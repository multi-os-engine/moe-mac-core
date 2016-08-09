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
public final class processor_set_basic_info extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public processor_set_basic_info() {
		super(processor_set_basic_info.class);
	}

	@Generated
	protected processor_set_basic_info(Pointer peer) {
		super(peer);
	}

	@Generated
	public processor_set_basic_info(int processor_count, int default_policy) {
		super(processor_set_basic_info.class);
		setProcessor_count(processor_count);
		setDefault_policy(default_policy);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int processor_count();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setProcessor_count(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int default_policy();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setDefault_policy(int value);
}
