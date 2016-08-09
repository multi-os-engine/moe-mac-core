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
import org.moe.natj.general.ptr.IntPtr;

@Generated
@Structure()
public final class IOHardwareCursorDescriptor extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public IOHardwareCursorDescriptor() {
		super(IOHardwareCursorDescriptor.class);
	}

	@Generated
	protected IOHardwareCursorDescriptor(Pointer peer) {
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
	public native int height();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setHeight(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int width();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setWidth(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int bitDepth();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setBitDepth(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int maskBitDepth();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setMaskBitDepth(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int numColors();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setNumColors(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native IntPtr colorEncodings();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setColorEncodings(IntPtr value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native int flags();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setFlags(int value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native int supportedSpecialEncodings();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setSupportedSpecialEncodings(int value);

	@Generated
	@StructureField(order = 10, isGetter = true, count = 16)
	public native int specialEncodings(int field_idx);

	@Generated
	@StructureField(order = 10, isGetter = false, count = 16)
	public native void setSpecialEncodings(int value, int field_idx);
}
