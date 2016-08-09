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
public final class NXEventSystemDevice extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public NXEventSystemDevice() {
		super(NXEventSystemDevice.class);
	}

	@Generated
	protected NXEventSystemDevice(Pointer peer) {
		super(peer);
	}

	@Generated
	public NXEventSystemDevice(int _interface, int interface_addr,
			int dev_type, int id) {
		super(NXEventSystemDevice.class);
		set_interface(_interface);
		setInterface_addr(interface_addr);
		setDev_type(dev_type);
		setId(id);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int _interface();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void set_interface(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int interface_addr();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setInterface_addr(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int dev_type();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setDev_type(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int id();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setId(int value);
}
