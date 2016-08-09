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
import mac.struct.Point;
import mac.struct.Rect;

@Generated
@Structure()
public final class MacPolygon extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public MacPolygon() {
		super(MacPolygon.class);
	}

	@Generated
	protected MacPolygon(Pointer peer) {
		super(peer);
	}

	@Generated
	public MacPolygon(short polySize, @ByValue Rect polyBBox,
			@ByValue Point polyPoints) {
		super(MacPolygon.class);
		setPolySize(polySize);
		setPolyBBox(polyBBox);
		setPolyPoints(polyPoints);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short polySize();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setPolySize(short value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@ByValue
	public native Rect polyBBox();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setPolyBBox(@ByValue Rect value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@ByValue
	public native Point polyPoints();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setPolyPoints(@ByValue Point value);
}
