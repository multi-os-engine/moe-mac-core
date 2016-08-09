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

@Generated
@Structure(alignment = 2)
public final class PixPat extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public PixPat() {
		super(PixPat.class);
	}

	@Generated
	protected PixPat(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short patType();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setPatType(short value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@ReferenceInfo(type = PixMap.class, depth = 2)
	public native Ptr<Ptr<PixMap>> patMap();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setPatMap(Ptr<Ptr<PixMap>> value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@ReferenceInfo(type = Byte.class, depth = 2)
	public native Ptr<BytePtr> patData();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setPatData(Ptr<BytePtr> value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	@ReferenceInfo(type = Byte.class, depth = 2)
	public native Ptr<BytePtr> patXData();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setPatXData(Ptr<BytePtr> value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native short patXValid();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setPatXValid(short value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	@ReferenceInfo(type = Byte.class, depth = 2)
	public native Ptr<BytePtr> patXMap();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setPatXMap(Ptr<BytePtr> value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	@ByValue
	public native Pattern pat1Data();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setPat1Data(@ByValue Pattern value);
}
