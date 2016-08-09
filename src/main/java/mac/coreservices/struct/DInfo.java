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
import mac.struct.Point;
import mac.struct.Rect;

@Generated
@Structure()
public final class DInfo extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public DInfo() {
		super(DInfo.class);
	}

	@Generated
	protected DInfo(Pointer peer) {
		super(peer);
	}

	@Generated
	public DInfo(@ByValue Rect frRect, short frFlags,
			@ByValue Point frLocation, short frView) {
		super(DInfo.class);
		setFrRect(frRect);
		setFrFlags(frFlags);
		setFrLocation(frLocation);
		setFrView(frView);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native Rect frRect();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setFrRect(@ByValue Rect value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short frFlags();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setFrFlags(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@ByValue
	public native Point frLocation();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setFrLocation(@ByValue Point value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native short frView();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setFrView(short value);
}
