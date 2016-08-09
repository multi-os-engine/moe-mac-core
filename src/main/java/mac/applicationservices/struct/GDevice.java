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
import mac.struct.Rect;

@Generated
@Structure(alignment = 2)
public final class GDevice extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public GDevice() {
		super(GDevice.class);
	}

	@Generated
	protected GDevice(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short gdRefNum();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setGdRefNum(short value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short gdID();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setGdID(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short gdType();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setGdType(short value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	@ReferenceInfo(type = Byte.class, depth = 2)
	public native Ptr<BytePtr> gdITable();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setGdITable(Ptr<BytePtr> value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native short gdResPref();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setGdResPref(short value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	@ReferenceInfo(type = Byte.class, depth = 2)
	public native Ptr<BytePtr> gdSearchProc();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setGdSearchProc(Ptr<BytePtr> value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	@ReferenceInfo(type = Byte.class, depth = 2)
	public native Ptr<BytePtr> gdCompProc();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setGdCompProc(Ptr<BytePtr> value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native short gdFlags();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setGdFlags(short value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	@ReferenceInfo(type = PixMap.class, depth = 2)
	public native Ptr<Ptr<PixMap>> gdPMap();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setGdPMap(Ptr<Ptr<PixMap>> value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native int gdRefCon();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setGdRefCon(int value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	@ReferenceInfo(type = GDevice.class, depth = 2)
	public native Ptr<Ptr<GDevice>> gdNextGD();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setGdNextGD(Ptr<Ptr<GDevice>> value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	@ByValue
	public native Rect gdRect();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setGdRect(@ByValue Rect value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	public native int gdMode();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setGdMode(int value);

	@Generated
	@StructureField(order = 13, isGetter = true)
	public native short gdCCBytes();

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setGdCCBytes(short value);

	@Generated
	@StructureField(order = 14, isGetter = true)
	public native short gdCCDepth();

	@Generated
	@StructureField(order = 14, isGetter = false)
	public native void setGdCCDepth(short value);

	@Generated
	@StructureField(order = 15, isGetter = true)
	@ReferenceInfo(type = Byte.class, depth = 2)
	public native Ptr<BytePtr> gdCCXData();

	@Generated
	@StructureField(order = 15, isGetter = false)
	public native void setGdCCXData(Ptr<BytePtr> value);

	@Generated
	@StructureField(order = 16, isGetter = true)
	@ReferenceInfo(type = Byte.class, depth = 2)
	public native Ptr<BytePtr> gdCCXMask();

	@Generated
	@StructureField(order = 16, isGetter = false)
	public native void setGdCCXMask(Ptr<BytePtr> value);

	@Generated
	@StructureField(order = 17, isGetter = true)
	@ReferenceInfo(type = Byte.class, depth = 2)
	public native Ptr<BytePtr> gdExt();

	@Generated
	@StructureField(order = 17, isGetter = false)
	public native void setGdExt(Ptr<BytePtr> value);
}
