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
public final class HFSPlusAttrInlineData extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public HFSPlusAttrInlineData() {
		super(HFSPlusAttrInlineData.class);
	}

	@Generated
	protected HFSPlusAttrInlineData(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int recordType();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setRecordType(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int reserved();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setReserved(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int logicalSize();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setLogicalSize(int value);

	@Generated
	@StructureField(order = 3, isGetter = true, count = 2)
	public native byte userData(int field_idx);

	@Generated
	@StructureField(order = 3, isGetter = false, count = 2)
	public native void setUserData(byte value, int field_idx);
}
