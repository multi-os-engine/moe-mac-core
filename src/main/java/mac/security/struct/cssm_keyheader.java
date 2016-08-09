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

@Generated
@Structure()
public final class cssm_keyheader extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_keyheader() {
		super(cssm_keyheader.class);
	}

	@Generated
	protected cssm_keyheader(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int HeaderVersion();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setHeaderVersion(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@ByValue
	public native cssm_guid CspId();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setCspId(@ByValue cssm_guid value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int BlobType();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setBlobType(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int Format();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setFormat(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int AlgorithmId();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setAlgorithmId(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int KeyClass();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setKeyClass(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int LogicalKeySizeInBits();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setLogicalKeySizeInBits(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int KeyAttr();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setKeyAttr(int value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native int KeyUsage();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setKeyUsage(int value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	@ByValue
	public native cssm_date StartDate();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setStartDate(@ByValue cssm_date value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	@ByValue
	public native cssm_date EndDate();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setEndDate(@ByValue cssm_date value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native int WrapAlgorithmId();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setWrapAlgorithmId(int value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	public native int WrapMode();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setWrapMode(int value);

	@Generated
	@StructureField(order = 13, isGetter = true)
	public native int Reserved();

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setReserved(int value);
}
