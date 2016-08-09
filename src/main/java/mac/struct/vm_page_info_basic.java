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
public final class vm_page_info_basic extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public vm_page_info_basic() {
		super(vm_page_info_basic.class);
	}

	@Generated
	protected vm_page_info_basic(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int disposition();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setDisposition(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int ref_count();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setRef_count(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native long object_id();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setObject_id(long value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native long offset();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setOffset(long value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int depth();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setDepth(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int __pad();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void set__pad(int value);
}
