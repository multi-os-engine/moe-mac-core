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
public final class IODisplayModeInformation extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public IODisplayModeInformation() {
		super(IODisplayModeInformation.class);
	}

	@Generated
	protected IODisplayModeInformation(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int nominalWidth();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setNominalWidth(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int nominalHeight();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setNominalHeight(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int refreshRate();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setRefreshRate(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int maxDepthIndex();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setMaxDepthIndex(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int flags();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setFlags(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native short imageWidth();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setImageWidth(short value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native short imageHeight();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setImageHeight(short value);

	@Generated
	@StructureField(order = 7, isGetter = true, count = 3)
	public native int reserved(int field_idx);

	@Generated
	@StructureField(order = 7, isGetter = false, count = 3)
	public native void setReserved(int value, int field_idx);
}
