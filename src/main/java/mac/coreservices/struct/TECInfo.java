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
public final class TECInfo extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public TECInfo() {
		super(TECInfo.class);
	}

	@Generated
	protected TECInfo(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short format();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setFormat(short value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short tecVersion();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setTecVersion(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int tecTextConverterFeatures();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setTecTextConverterFeatures(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int tecUnicodeConverterFeatures();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setTecUnicodeConverterFeatures(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int tecTextCommonFeatures();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setTecTextCommonFeatures(int value);

	@Generated
	@StructureField(order = 5, isGetter = true, count = 32)
	public native byte tecTextEncodingsFolderName(int field_idx);

	@Generated
	@StructureField(order = 5, isGetter = false, count = 32)
	public native void setTecTextEncodingsFolderName(byte value, int field_idx);

	@Generated
	@StructureField(order = 6, isGetter = true, count = 32)
	public native byte tecExtensionFileName(int field_idx);

	@Generated
	@StructureField(order = 6, isGetter = false, count = 32)
	public native void setTecExtensionFileName(byte value, int field_idx);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native short tecLowestTEFileVersion();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setTecLowestTEFileVersion(short value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native short tecHighestTEFileVersion();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setTecHighestTEFileVersion(short value);
}
