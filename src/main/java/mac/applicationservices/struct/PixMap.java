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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import mac.struct.Rect;

@Generated
@Structure(alignment = 2)
public final class PixMap extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public PixMap() {
		super(PixMap.class);
	}

	@Generated
	protected PixMap(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native BytePtr baseAddr();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setBaseAddr(BytePtr value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short rowBytes();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setRowBytes(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@ByValue
	public native Rect bounds();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setBounds(@ByValue Rect value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native short pmVersion();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setPmVersion(short value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native short packType();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setPackType(short value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int packSize();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setPackSize(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int hRes();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setHRes(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int vRes();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setVRes(int value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native short pixelType();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setPixelType(short value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native short pixelSize();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setPixelSize(short value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native short cmpCount();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setCmpCount(short value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native short cmpSize();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setCmpSize(short value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	public native int pixelFormat();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setPixelFormat(int value);

	@Generated
	@StructureField(order = 13, isGetter = true)
	@ReferenceInfo(type = ColorTable.class, depth = 2)
	public native Ptr<Ptr<ColorTable>> pmTable();

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setPmTable(Ptr<Ptr<ColorTable>> value);

	@Generated
	@StructureField(order = 14, isGetter = true)
	public native VoidPtr pmExt();

	@Generated
	@StructureField(order = 14, isGetter = false)
	public native void setPmExt(VoidPtr value);
}
