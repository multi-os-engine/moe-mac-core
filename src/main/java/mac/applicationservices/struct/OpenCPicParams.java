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
import mac.struct.Rect;

@Generated
@Structure(alignment = 2)
public final class OpenCPicParams extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public OpenCPicParams() {
		super(OpenCPicParams.class);
	}

	@Generated
	protected OpenCPicParams(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native Rect srcRect();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setSrcRect(@ByValue Rect value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int hRes();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setHRes(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int vRes();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setVRes(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native short version();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setVersion(short value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native short reserved1();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setReserved1(short value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int reserved2();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setReserved2(int value);
}
