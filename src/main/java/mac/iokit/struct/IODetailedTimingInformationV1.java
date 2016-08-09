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

package mac.iokit.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class IODetailedTimingInformationV1 extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public IODetailedTimingInformationV1() {
		super(IODetailedTimingInformationV1.class);
	}

	@Generated
	protected IODetailedTimingInformationV1(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int pixelClock();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setPixelClock(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int horizontalActive();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setHorizontalActive(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int horizontalBlanking();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setHorizontalBlanking(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int horizontalBorder();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setHorizontalBorder(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int horizontalSyncOffset();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setHorizontalSyncOffset(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int horizontalSyncWidth();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setHorizontalSyncWidth(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int verticalActive();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setVerticalActive(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int verticalBlanking();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setVerticalBlanking(int value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native int verticalBorder();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setVerticalBorder(int value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native int verticalSyncOffset();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setVerticalSyncOffset(int value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native int verticalSyncWidth();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setVerticalSyncWidth(int value);
}
