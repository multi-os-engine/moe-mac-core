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
@Structure(alignment = 2)
public final class FndrExtendedDirInfo extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public FndrExtendedDirInfo() {
		super(FndrExtendedDirInfo.class);
	}

	@Generated
	protected FndrExtendedDirInfo(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int document_id();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setDocument_id(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int date_added();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setDate_added(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short extended_flags();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setExtended_flags(short value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native short reserved3();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setReserved3(short value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int write_gen_counter();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setWrite_gen_counter(int value);
}
