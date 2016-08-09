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

package mac.security.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class CSSM_TP_APPLE_EVIDENCE_INFO extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CSSM_TP_APPLE_EVIDENCE_INFO() {
		super(CSSM_TP_APPLE_EVIDENCE_INFO.class);
	}

	@Generated
	protected CSSM_TP_APPLE_EVIDENCE_INFO(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int StatusBits();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setStatusBits(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int NumStatusCodes();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setNumStatusCodes(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native IntPtr StatusCodes();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setStatusCodes(IntPtr value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int Index();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setIndex(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	@ByValue
	public native cssm_dl_db_handle DlDbHandle();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setDlDbHandle(@ByValue cssm_dl_db_handle value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native VoidPtr UniqueRecord();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setUniqueRecord(VoidPtr value);
}
