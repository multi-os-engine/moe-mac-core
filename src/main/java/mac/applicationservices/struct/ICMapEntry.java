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
@Structure(alignment = 2)
public final class ICMapEntry extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public ICMapEntry() {
		super(ICMapEntry.class);
	}

	@Generated
	protected ICMapEntry(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short totalLength();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setTotalLength(short value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short fixedLength();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setFixedLength(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short version();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setVersion(short value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int fileType();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setFileType(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int fileCreator();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setFileCreator(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int postCreator();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setPostCreator(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int flags();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setFlags(int value);

	@Generated
	@StructureField(order = 7, isGetter = true, count = 256)
	public native byte extension(int field_idx);

	@Generated
	@StructureField(order = 7, isGetter = false, count = 256)
	public native void setExtension(byte value, int field_idx);

	@Generated
	@StructureField(order = 8, isGetter = true, count = 256)
	public native byte creatorAppName(int field_idx);

	@Generated
	@StructureField(order = 8, isGetter = false, count = 256)
	public native void setCreatorAppName(byte value, int field_idx);

	@Generated
	@StructureField(order = 9, isGetter = true, count = 256)
	public native byte postAppName(int field_idx);

	@Generated
	@StructureField(order = 9, isGetter = false, count = 256)
	public native void setPostAppName(byte value, int field_idx);

	@Generated
	@StructureField(order = 10, isGetter = true, count = 256)
	public native byte MIMEType(int field_idx);

	@Generated
	@StructureField(order = 10, isGetter = false, count = 256)
	public native void setMIMEType(byte value, int field_idx);

	@Generated
	@StructureField(order = 11, isGetter = true, count = 256)
	public native byte entryName(int field_idx);

	@Generated
	@StructureField(order = 11, isGetter = false, count = 256)
	public native void setEntryName(byte value, int field_idx);
}
