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
public final class Itl1ExtRec extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public Itl1ExtRec() {
		super(Itl1ExtRec.class);
	}

	@Generated
	protected Itl1ExtRec(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native Intl1Rec base();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setBase(@ByValue Intl1Rec value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short version();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setVersion(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short format();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setFormat(short value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native short calendarCode();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setCalendarCode(short value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int extraDaysTableOffset();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setExtraDaysTableOffset(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int extraDaysTableLength();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setExtraDaysTableLength(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int extraMonthsTableOffset();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setExtraMonthsTableOffset(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int extraMonthsTableLength();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setExtraMonthsTableLength(int value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native int abbrevDaysTableOffset();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setAbbrevDaysTableOffset(int value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native int abbrevDaysTableLength();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setAbbrevDaysTableLength(int value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native int abbrevMonthsTableOffset();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setAbbrevMonthsTableOffset(int value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native int abbrevMonthsTableLength();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setAbbrevMonthsTableLength(int value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	public native int extraSepsTableOffset();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setExtraSepsTableOffset(int value);

	@Generated
	@StructureField(order = 13, isGetter = true)
	public native int extraSepsTableLength();

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setExtraSepsTableLength(int value);

	@Generated
	@StructureField(order = 14, isGetter = true)
	public native short tables();

	@Generated
	@StructureField(order = 14, isGetter = false)
	public native void setTables(short value);
}
