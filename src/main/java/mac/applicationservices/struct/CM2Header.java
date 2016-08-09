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
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 2)
public final class CM2Header extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CM2Header() {
		super(CM2Header.class);
	}

	@Generated
	protected CM2Header(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int size();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setSize(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int CMMType();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setCMMType(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int profileVersion();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setProfileVersion(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int profileClass();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setProfileClass(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int dataColorSpace();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setDataColorSpace(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int profileConnectionSpace();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setProfileConnectionSpace(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	@ByValue
	public native CMDateTime dateTime();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setDateTime(@ByValue CMDateTime value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int CS2profileSignature();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setCS2profileSignature(int value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native int platform();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setPlatform(int value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native int flags();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setFlags(int value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native int deviceManufacturer();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setDeviceManufacturer(int value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native int deviceModel();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setDeviceModel(int value);

	@Generated
	@StructureField(order = 12, isGetter = true, count = 2)
	public native int deviceAttributes(int field_idx);

	@Generated
	@StructureField(order = 12, isGetter = false, count = 2)
	public native void setDeviceAttributes(int value, int field_idx);

	@Generated
	@StructureField(order = 13, isGetter = true)
	public native int renderingIntent();

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setRenderingIntent(int value);

	@Generated
	@StructureField(order = 14, isGetter = true)
	@ByValue
	public native CMFixedXYZColor white();

	@Generated
	@StructureField(order = 14, isGetter = false)
	public native void setWhite(@ByValue CMFixedXYZColor value);

	@Generated
	@StructureField(order = 15, isGetter = true)
	public native int creator();

	@Generated
	@StructureField(order = 15, isGetter = false)
	public native void setCreator(int value);

	@Generated
	@StructureField(order = 16, isGetter = true, count = 44)
	public native byte reserved(int field_idx);

	@Generated
	@StructureField(order = 16, isGetter = false, count = 44)
	public native void setReserved(byte value, int field_idx);
}
