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

package mac.applicationservices.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class CMMInfo extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CMMInfo() {
		super(CMMInfo.class);
	}

	@Generated
	protected CMMInfo(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native long dataSize();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setDataSize(long value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int CMMType();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setCMMType(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int CMMMfr();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setCMMMfr(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int CMMVersion();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setCMMVersion(int value);

	@Generated
	@StructureField(order = 4, isGetter = true, count = 32)
	public native byte ASCIIName(int field_idx);

	@Generated
	@StructureField(order = 4, isGetter = false, count = 32)
	public native void setASCIIName(byte value, int field_idx);

	@Generated
	@StructureField(order = 5, isGetter = true, count = 256)
	public native byte ASCIIDesc(int field_idx);

	@Generated
	@StructureField(order = 5, isGetter = false, count = 256)
	public native void setASCIIDesc(byte value, int field_idx);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native long UniCodeNameCount();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setUniCodeNameCount(long value);

	@Generated
	@StructureField(order = 7, isGetter = true, count = 32)
	public native char UniCodeName(int field_idx);

	@Generated
	@StructureField(order = 7, isGetter = false, count = 32)
	public native void setUniCodeName(char value, int field_idx);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native long UniCodeDescCount();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setUniCodeDescCount(long value);

	@Generated
	@StructureField(order = 9, isGetter = true, count = 256)
	public native char UniCodeDesc(int field_idx);

	@Generated
	@StructureField(order = 9, isGetter = false, count = 256)
	public native void setUniCodeDesc(char value, int field_idx);
}
