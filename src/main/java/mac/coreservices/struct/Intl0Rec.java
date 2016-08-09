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
@Structure()
public final class Intl0Rec extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public Intl0Rec() {
		super(Intl0Rec.class);
	}

	@Generated
	protected Intl0Rec(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native byte decimalPt();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setDecimalPt(byte value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native byte thousSep();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setThousSep(byte value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native byte listSep();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setListSep(byte value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native byte currSym1();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setCurrSym1(byte value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native byte currSym2();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setCurrSym2(byte value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native byte currSym3();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setCurrSym3(byte value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native byte currFmt();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setCurrFmt(byte value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native byte dateOrder();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setDateOrder(byte value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native byte shrtDateFmt();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setShrtDateFmt(byte value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native byte dateSep();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setDateSep(byte value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native byte timeCycle();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setTimeCycle(byte value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native byte timeFmt();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setTimeFmt(byte value);

	@Generated
	@StructureField(order = 12, isGetter = true, count = 4)
	public native byte mornStr(int field_idx);

	@Generated
	@StructureField(order = 12, isGetter = false, count = 4)
	public native void setMornStr(byte value, int field_idx);

	@Generated
	@StructureField(order = 13, isGetter = true, count = 4)
	public native byte eveStr(int field_idx);

	@Generated
	@StructureField(order = 13, isGetter = false, count = 4)
	public native void setEveStr(byte value, int field_idx);

	@Generated
	@StructureField(order = 14, isGetter = true)
	public native byte timeSep();

	@Generated
	@StructureField(order = 14, isGetter = false)
	public native void setTimeSep(byte value);

	@Generated
	@StructureField(order = 15, isGetter = true)
	public native byte time1Suff();

	@Generated
	@StructureField(order = 15, isGetter = false)
	public native void setTime1Suff(byte value);

	@Generated
	@StructureField(order = 16, isGetter = true)
	public native byte time2Suff();

	@Generated
	@StructureField(order = 16, isGetter = false)
	public native void setTime2Suff(byte value);

	@Generated
	@StructureField(order = 17, isGetter = true)
	public native byte time3Suff();

	@Generated
	@StructureField(order = 17, isGetter = false)
	public native void setTime3Suff(byte value);

	@Generated
	@StructureField(order = 18, isGetter = true)
	public native byte time4Suff();

	@Generated
	@StructureField(order = 18, isGetter = false)
	public native void setTime4Suff(byte value);

	@Generated
	@StructureField(order = 19, isGetter = true)
	public native byte time5Suff();

	@Generated
	@StructureField(order = 19, isGetter = false)
	public native void setTime5Suff(byte value);

	@Generated
	@StructureField(order = 20, isGetter = true)
	public native byte time6Suff();

	@Generated
	@StructureField(order = 20, isGetter = false)
	public native void setTime6Suff(byte value);

	@Generated
	@StructureField(order = 21, isGetter = true)
	public native byte time7Suff();

	@Generated
	@StructureField(order = 21, isGetter = false)
	public native void setTime7Suff(byte value);

	@Generated
	@StructureField(order = 22, isGetter = true)
	public native byte time8Suff();

	@Generated
	@StructureField(order = 22, isGetter = false)
	public native void setTime8Suff(byte value);

	@Generated
	@StructureField(order = 23, isGetter = true)
	public native byte metricSys();

	@Generated
	@StructureField(order = 23, isGetter = false)
	public native void setMetricSys(byte value);

	@Generated
	@StructureField(order = 24, isGetter = true)
	public native short intl0Vers();

	@Generated
	@StructureField(order = 24, isGetter = false)
	public native void setIntl0Vers(short value);
}
