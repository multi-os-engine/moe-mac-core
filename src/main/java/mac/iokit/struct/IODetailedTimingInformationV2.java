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
public final class IODetailedTimingInformationV2 extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public IODetailedTimingInformationV2() {
		super(IODetailedTimingInformationV2.class);
	}

	@Generated
	protected IODetailedTimingInformationV2(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true, count = 3)
	public native int __reservedA(int field_idx);

	@Generated
	@StructureField(order = 0, isGetter = false, count = 3)
	public native void set__reservedA(int value, int field_idx);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int horizontalScaledInset();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setHorizontalScaledInset(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int verticalScaledInset();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setVerticalScaledInset(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int scalerFlags();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setScalerFlags(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int horizontalScaled();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setHorizontalScaled(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int verticalScaled();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setVerticalScaled(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int signalConfig();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setSignalConfig(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int signalLevels();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setSignalLevels(int value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native long pixelClock();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setPixelClock(long value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native long minPixelClock();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setMinPixelClock(long value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native long maxPixelClock();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setMaxPixelClock(long value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native int horizontalActive();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setHorizontalActive(int value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	public native int horizontalBlanking();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setHorizontalBlanking(int value);

	@Generated
	@StructureField(order = 13, isGetter = true)
	public native int horizontalSyncOffset();

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setHorizontalSyncOffset(int value);

	@Generated
	@StructureField(order = 14, isGetter = true)
	public native int horizontalSyncPulseWidth();

	@Generated
	@StructureField(order = 14, isGetter = false)
	public native void setHorizontalSyncPulseWidth(int value);

	@Generated
	@StructureField(order = 15, isGetter = true)
	public native int verticalActive();

	@Generated
	@StructureField(order = 15, isGetter = false)
	public native void setVerticalActive(int value);

	@Generated
	@StructureField(order = 16, isGetter = true)
	public native int verticalBlanking();

	@Generated
	@StructureField(order = 16, isGetter = false)
	public native void setVerticalBlanking(int value);

	@Generated
	@StructureField(order = 17, isGetter = true)
	public native int verticalSyncOffset();

	@Generated
	@StructureField(order = 17, isGetter = false)
	public native void setVerticalSyncOffset(int value);

	@Generated
	@StructureField(order = 18, isGetter = true)
	public native int verticalSyncPulseWidth();

	@Generated
	@StructureField(order = 18, isGetter = false)
	public native void setVerticalSyncPulseWidth(int value);

	@Generated
	@StructureField(order = 19, isGetter = true)
	public native int horizontalBorderLeft();

	@Generated
	@StructureField(order = 19, isGetter = false)
	public native void setHorizontalBorderLeft(int value);

	@Generated
	@StructureField(order = 20, isGetter = true)
	public native int horizontalBorderRight();

	@Generated
	@StructureField(order = 20, isGetter = false)
	public native void setHorizontalBorderRight(int value);

	@Generated
	@StructureField(order = 21, isGetter = true)
	public native int verticalBorderTop();

	@Generated
	@StructureField(order = 21, isGetter = false)
	public native void setVerticalBorderTop(int value);

	@Generated
	@StructureField(order = 22, isGetter = true)
	public native int verticalBorderBottom();

	@Generated
	@StructureField(order = 22, isGetter = false)
	public native void setVerticalBorderBottom(int value);

	@Generated
	@StructureField(order = 23, isGetter = true)
	public native int horizontalSyncConfig();

	@Generated
	@StructureField(order = 23, isGetter = false)
	public native void setHorizontalSyncConfig(int value);

	@Generated
	@StructureField(order = 24, isGetter = true)
	public native int horizontalSyncLevel();

	@Generated
	@StructureField(order = 24, isGetter = false)
	public native void setHorizontalSyncLevel(int value);

	@Generated
	@StructureField(order = 25, isGetter = true)
	public native int verticalSyncConfig();

	@Generated
	@StructureField(order = 25, isGetter = false)
	public native void setVerticalSyncConfig(int value);

	@Generated
	@StructureField(order = 26, isGetter = true)
	public native int verticalSyncLevel();

	@Generated
	@StructureField(order = 26, isGetter = false)
	public native void setVerticalSyncLevel(int value);

	@Generated
	@StructureField(order = 27, isGetter = true)
	public native int numLinks();

	@Generated
	@StructureField(order = 27, isGetter = false)
	public native void setNumLinks(int value);

	@Generated
	@StructureField(order = 28, isGetter = true, count = 7)
	public native int __reservedB(int field_idx);

	@Generated
	@StructureField(order = 28, isGetter = false, count = 7)
	public native void set__reservedB(int value, int field_idx);
}
