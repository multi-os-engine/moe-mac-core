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
public final class PEFSectionHeader extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public PEFSectionHeader() {
		super(PEFSectionHeader.class);
	}

	@Generated
	protected PEFSectionHeader(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int nameOffset();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setNameOffset(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int defaultAddress();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setDefaultAddress(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int totalLength();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setTotalLength(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int unpackedLength();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setUnpackedLength(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int containerLength();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setContainerLength(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int containerOffset();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setContainerOffset(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native byte sectionKind();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setSectionKind(byte value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native byte shareKind();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setShareKind(byte value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native byte alignment();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setAlignment(byte value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native byte reservedA();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setReservedA(byte value);
}
