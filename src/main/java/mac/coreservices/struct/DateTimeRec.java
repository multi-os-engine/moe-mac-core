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
public final class DateTimeRec extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public DateTimeRec() {
		super(DateTimeRec.class);
	}

	@Generated
	protected DateTimeRec(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short year();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setYear(short value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short month();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setMonth(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short day();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setDay(short value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native short hour();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setHour(short value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native short minute();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setMinute(short value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native short second();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setSecond(short value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native short dayOfWeek();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setDayOfWeek(short value);
}
