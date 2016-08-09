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
public final class task_dyld_info extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public task_dyld_info() {
		super(task_dyld_info.class);
	}

	@Generated
	protected task_dyld_info(Pointer peer) {
		super(peer);
	}

	@Generated
	public task_dyld_info(long all_image_info_addr, long all_image_info_size,
			int all_image_info_format) {
		super(task_dyld_info.class);
		setAll_image_info_addr(all_image_info_addr);
		setAll_image_info_size(all_image_info_size);
		setAll_image_info_format(all_image_info_format);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native long all_image_info_addr();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setAll_image_info_addr(long value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native long all_image_info_size();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setAll_image_info_size(long value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int all_image_info_format();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setAll_image_info_format(int value);
}
