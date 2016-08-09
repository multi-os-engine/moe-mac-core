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

package mac.coreservices.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 2)
public final class Itl4Rec extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public Itl4Rec() {
		super(Itl4Rec.class);
	}

	@Generated
	protected Itl4Rec(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short flags();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setFlags(short value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int resourceType();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setResourceType(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short resourceNum();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setResourceNum(short value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native short version();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setVersion(short value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int resHeader1();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setResHeader1(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int resHeader2();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setResHeader2(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native short numTables();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setNumTables(short value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int mapOffset();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setMapOffset(int value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native int strOffset();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setStrOffset(int value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native int fetchOffset();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setFetchOffset(int value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native int unTokenOffset();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setUnTokenOffset(int value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native int defPartsOffset();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setDefPartsOffset(int value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	public native int resOffset6();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setResOffset6(int value);

	@Generated
	@StructureField(order = 13, isGetter = true)
	public native int resOffset7();

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setResOffset7(int value);

	@Generated
	@StructureField(order = 14, isGetter = true)
	public native int resOffset8();

	@Generated
	@StructureField(order = 14, isGetter = false)
	public native void setResOffset8(int value);
}
