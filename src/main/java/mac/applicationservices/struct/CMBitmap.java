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
import org.moe.natj.general.ptr.BytePtr;

@Generated
@Structure()
public final class CMBitmap extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CMBitmap() {
		super(CMBitmap.class);
	}

	@Generated
	protected CMBitmap(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native BytePtr image();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setImage(BytePtr value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native long width();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setWidth(long value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native long height();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setHeight(long value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native long rowBytes();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setRowBytes(long value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native long pixelSize();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setPixelSize(long value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int space();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setSpace(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int user1();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setUser1(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int user2();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setUser2(int value);
}
