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
import mac.struct.FixedPoint;

@Generated
@Structure()
public final class ATSTrapezoid extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public ATSTrapezoid() {
		super(ATSTrapezoid.class);
	}

	@Generated
	protected ATSTrapezoid(Pointer peer) {
		super(peer);
	}

	@Generated
	public ATSTrapezoid(@ByValue FixedPoint upperLeft,
			@ByValue FixedPoint upperRight, @ByValue FixedPoint lowerRight,
			@ByValue FixedPoint lowerLeft) {
		super(ATSTrapezoid.class);
		setUpperLeft(upperLeft);
		setUpperRight(upperRight);
		setLowerRight(lowerRight);
		setLowerLeft(lowerLeft);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native FixedPoint upperLeft();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setUpperLeft(@ByValue FixedPoint value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@ByValue
	public native FixedPoint upperRight();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setUpperRight(@ByValue FixedPoint value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@ByValue
	public native FixedPoint lowerRight();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setLowerRight(@ByValue FixedPoint value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	@ByValue
	public native FixedPoint lowerLeft();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setLowerLeft(@ByValue FixedPoint value);
}
