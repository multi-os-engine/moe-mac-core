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
@Structure(alignment = 2)
public final class FolderDesc extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public FolderDesc() {
		super(FolderDesc.class);
	}

	@Generated
	protected FolderDesc(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native long descSize();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setDescSize(long value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int foldType();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setFoldType(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int flags();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setFlags(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int foldClass();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setFoldClass(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int foldLocation();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setFoldLocation(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int badgeSignature();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setBadgeSignature(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int badgeType();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setBadgeType(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int reserved();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setReserved(int value);

	@Generated
	@StructureField(order = 8, isGetter = true, count = 64)
	public native byte name(int field_idx);

	@Generated
	@StructureField(order = 8, isGetter = false, count = 64)
	public native void setName(byte value, int field_idx);
}
