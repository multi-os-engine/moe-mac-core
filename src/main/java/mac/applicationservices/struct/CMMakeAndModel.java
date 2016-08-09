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
public final class CMMakeAndModel extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CMMakeAndModel() {
		super(CMMakeAndModel.class);
	}

	@Generated
	protected CMMakeAndModel(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int manufacturer();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setManufacturer(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int model();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setModel(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int serialNumber();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setSerialNumber(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int manufactureDate();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setManufactureDate(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int reserved1();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setReserved1(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int reserved2();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setReserved2(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int reserved3();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setReserved3(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int reserved4();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setReserved4(int value);
}
