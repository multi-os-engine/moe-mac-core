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
import mac.coregraphics.struct.CGPoint;

@Generated
@Structure(alignment = 2)
public final class ATSGlyphScreenMetrics extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public ATSGlyphScreenMetrics() {
		super(ATSGlyphScreenMetrics.class);
	}

	@Generated
	protected ATSGlyphScreenMetrics(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native CGPoint deviceAdvance();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setDeviceAdvance(@ByValue CGPoint value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@ByValue
	public native CGPoint topLeft();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setTopLeft(@ByValue CGPoint value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int height();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setHeight(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int width();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setWidth(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	@ByValue
	public native CGPoint sideBearing();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setSideBearing(@ByValue CGPoint value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	@ByValue
	public native CGPoint otherSideBearing();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setOtherSideBearing(@ByValue CGPoint value);
}
