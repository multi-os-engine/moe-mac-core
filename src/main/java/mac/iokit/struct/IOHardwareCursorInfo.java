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
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.BytePtr;

@Generated
@Structure()
public final class IOHardwareCursorInfo extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public IOHardwareCursorInfo() {
		super(IOHardwareCursorInfo.class);
	}

	@Generated
	protected IOHardwareCursorInfo(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short majorVersion();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setMajorVersion(short value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short minorVersion();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setMinorVersion(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int cursorHeight();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setCursorHeight(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int cursorWidth();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setCursorWidth(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native IOColorEntry colorMap();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setColorMap(
			@UncertainArgument("Options: reference, array Fallback: reference") IOColorEntry value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native BytePtr hardwareCursorData();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setHardwareCursorData(BytePtr value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native short cursorHotSpotX();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setCursorHotSpotX(short value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native short cursorHotSpotY();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setCursorHotSpotY(short value);

	@Generated
	@StructureField(order = 8, isGetter = true, count = 5)
	public native int reserved(int field_idx);

	@Generated
	@StructureField(order = 8, isGetter = false, count = 5)
	public native void setReserved(int value, int field_idx);
}
