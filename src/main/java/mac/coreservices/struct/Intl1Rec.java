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
public final class Intl1Rec extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public Intl1Rec() {
		super(Intl1Rec.class);
	}

	@Generated
	protected Intl1Rec(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true, count = 112)
	public native byte days(int field_idx);

	@Generated
	@StructureField(order = 0, isGetter = false, count = 112)
	public native void setDays(byte value, int field_idx);

	@Generated
	@StructureField(order = 1, isGetter = true, count = 192)
	public native byte months(int field_idx);

	@Generated
	@StructureField(order = 1, isGetter = false, count = 192)
	public native void setMonths(byte value, int field_idx);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native byte suppressDay();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setSuppressDay(byte value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native byte lngDateFmt();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setLngDateFmt(byte value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native byte dayLeading0();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setDayLeading0(byte value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native byte abbrLen();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setAbbrLen(byte value);

	@Generated
	@StructureField(order = 6, isGetter = true, count = 4)
	public native byte st0(int field_idx);

	@Generated
	@StructureField(order = 6, isGetter = false, count = 4)
	public native void setSt0(byte value, int field_idx);

	@Generated
	@StructureField(order = 7, isGetter = true, count = 4)
	public native byte st1(int field_idx);

	@Generated
	@StructureField(order = 7, isGetter = false, count = 4)
	public native void setSt1(byte value, int field_idx);

	@Generated
	@StructureField(order = 8, isGetter = true, count = 4)
	public native byte st2(int field_idx);

	@Generated
	@StructureField(order = 8, isGetter = false, count = 4)
	public native void setSt2(byte value, int field_idx);

	@Generated
	@StructureField(order = 9, isGetter = true, count = 4)
	public native byte st3(int field_idx);

	@Generated
	@StructureField(order = 9, isGetter = false, count = 4)
	public native void setSt3(byte value, int field_idx);

	@Generated
	@StructureField(order = 10, isGetter = true, count = 4)
	public native byte st4(int field_idx);

	@Generated
	@StructureField(order = 10, isGetter = false, count = 4)
	public native void setSt4(byte value, int field_idx);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native short intl1Vers();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setIntl1Vers(short value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	public native short localRtn();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setLocalRtn(short value);
}
