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

package mac.iokit.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 4)
public final class NXTabletProximityData extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public NXTabletProximityData() {
		super(NXTabletProximityData.class);
	}

	@Generated
	protected NXTabletProximityData(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short vendorID();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setVendorID(short value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short tabletID();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setTabletID(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short pointerID();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setPointerID(short value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native short deviceID();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setDeviceID(short value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native short systemTabletID();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setSystemTabletID(short value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native short vendorPointerType();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setVendorPointerType(short value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int pointerSerialNumber();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setPointerSerialNumber(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native long uniqueID();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setUniqueID(long value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native int capabilityMask();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setCapabilityMask(int value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native byte pointerType();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setPointerType(byte value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native byte enterProximity();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setEnterProximity(byte value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native short reserved1();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setReserved1(short value);
}
