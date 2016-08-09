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
@Structure()
public final class IODisplayScalerInformation extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public IODisplayScalerInformation() {
		super(IODisplayScalerInformation.class);
	}

	@Generated
	protected IODisplayScalerInformation(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int __reservedA();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void set__reservedA(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int version();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setVersion(int value);

	@Generated
	@StructureField(order = 2, isGetter = true, count = 2)
	public native int __reservedB(int field_idx);

	@Generated
	@StructureField(order = 2, isGetter = false, count = 2)
	public native void set__reservedB(int value, int field_idx);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int scalerFeatures();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setScalerFeatures(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int maxHorizontalPixels();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setMaxHorizontalPixels(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int maxVerticalPixels();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setMaxVerticalPixels(int value);

	@Generated
	@StructureField(order = 6, isGetter = true, count = 5)
	public native int __reservedC(int field_idx);

	@Generated
	@StructureField(order = 6, isGetter = false, count = 5)
	public native void set__reservedC(int value, int field_idx);
}
