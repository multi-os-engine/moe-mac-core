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
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 2)
public final class ItlbExtRecord extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public ItlbExtRecord() {
		super(ItlbExtRecord.class);
	}

	@Generated
	protected ItlbExtRecord(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native ItlbRecord base();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setBase(@ByValue ItlbRecord value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int itlbLocalSize();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setItlbLocalSize(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short itlbMonoFond();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setItlbMonoFond(short value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native short itlbMonoSize();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setItlbMonoSize(short value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native short itlbPrefFond();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setItlbPrefFond(short value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native short itlbPrefSize();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setItlbPrefSize(short value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native short itlbSmallFond();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setItlbSmallFond(short value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native short itlbSmallSize();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setItlbSmallSize(short value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native short itlbSysFond();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setItlbSysFond(short value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native short itlbSysSize();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setItlbSysSize(short value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native short itlbAppFond();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setItlbAppFond(short value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native short itlbAppSize();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setItlbAppSize(short value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	public native short itlbHelpFond();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setItlbHelpFond(short value);

	@Generated
	@StructureField(order = 13, isGetter = true)
	public native short itlbHelpSize();

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setItlbHelpSize(short value);

	@Generated
	@StructureField(order = 14, isGetter = true)
	public native byte itlbValidStyles();

	@Generated
	@StructureField(order = 14, isGetter = false)
	public native void setItlbValidStyles(byte value);

	@Generated
	@StructureField(order = 15, isGetter = true)
	public native byte itlbAliasStyle();

	@Generated
	@StructureField(order = 15, isGetter = false)
	public native void setItlbAliasStyle(byte value);
}
