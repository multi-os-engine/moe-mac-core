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
public final class IOFramebufferInformation extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public IOFramebufferInformation() {
		super(IOFramebufferInformation.class);
	}

	@Generated
	protected IOFramebufferInformation(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int baseAddress();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setBaseAddress(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int activeWidth();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setActiveWidth(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int activeHeight();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setActiveHeight(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int bytesPerRow();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setBytesPerRow(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int bytesPerPlane();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setBytesPerPlane(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int bitsPerPixel();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setBitsPerPixel(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int pixelType();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setPixelType(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int flags();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setFlags(int value);

	@Generated
	@StructureField(order = 8, isGetter = true, count = 4)
	public native int reserved(int field_idx);

	@Generated
	@StructureField(order = 8, isGetter = false, count = 4)
	public native void setReserved(int value, int field_idx);
}
