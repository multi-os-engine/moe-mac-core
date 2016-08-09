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
public final class IODisplayTimingRange extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public IODisplayTimingRange() {
		super(IODisplayTimingRange.class);
	}

	@Generated
	protected IODisplayTimingRange(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true, count = 2)
	public native int __reservedA(int field_idx);

	@Generated
	@StructureField(order = 0, isGetter = false, count = 2)
	public native void set__reservedA(int value, int field_idx);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int version();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setVersion(int value);

	@Generated
	@StructureField(order = 2, isGetter = true, count = 5)
	public native int __reservedB(int field_idx);

	@Generated
	@StructureField(order = 2, isGetter = false, count = 5)
	public native void set__reservedB(int value, int field_idx);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native long minPixelClock();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setMinPixelClock(long value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native long maxPixelClock();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setMaxPixelClock(long value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int maxPixelError();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setMaxPixelError(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int supportedSyncFlags();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setSupportedSyncFlags(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int supportedSignalLevels();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setSupportedSignalLevels(int value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native int supportedSignalConfigs();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setSupportedSignalConfigs(int value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native int minFrameRate();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setMinFrameRate(int value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native int maxFrameRate();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setMaxFrameRate(int value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native int minLineRate();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setMinLineRate(int value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	public native int maxLineRate();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setMaxLineRate(int value);

	@Generated
	@StructureField(order = 13, isGetter = true)
	public native int maxHorizontalTotal();

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setMaxHorizontalTotal(int value);

	@Generated
	@StructureField(order = 14, isGetter = true)
	public native int maxVerticalTotal();

	@Generated
	@StructureField(order = 14, isGetter = false)
	public native void setMaxVerticalTotal(int value);

	@Generated
	@StructureField(order = 15, isGetter = true, count = 2)
	public native int __reservedD(int field_idx);

	@Generated
	@StructureField(order = 15, isGetter = false, count = 2)
	public native void set__reservedD(int value, int field_idx);

	@Generated
	@StructureField(order = 16, isGetter = true)
	public native byte charSizeHorizontalActive();

	@Generated
	@StructureField(order = 16, isGetter = false)
	public native void setCharSizeHorizontalActive(byte value);

	@Generated
	@StructureField(order = 17, isGetter = true)
	public native byte charSizeHorizontalBlanking();

	@Generated
	@StructureField(order = 17, isGetter = false)
	public native void setCharSizeHorizontalBlanking(byte value);

	@Generated
	@StructureField(order = 18, isGetter = true)
	public native byte charSizeHorizontalSyncOffset();

	@Generated
	@StructureField(order = 18, isGetter = false)
	public native void setCharSizeHorizontalSyncOffset(byte value);

	@Generated
	@StructureField(order = 19, isGetter = true)
	public native byte charSizeHorizontalSyncPulse();

	@Generated
	@StructureField(order = 19, isGetter = false)
	public native void setCharSizeHorizontalSyncPulse(byte value);

	@Generated
	@StructureField(order = 20, isGetter = true)
	public native byte charSizeVerticalActive();

	@Generated
	@StructureField(order = 20, isGetter = false)
	public native void setCharSizeVerticalActive(byte value);

	@Generated
	@StructureField(order = 21, isGetter = true)
	public native byte charSizeVerticalBlanking();

	@Generated
	@StructureField(order = 21, isGetter = false)
	public native void setCharSizeVerticalBlanking(byte value);

	@Generated
	@StructureField(order = 22, isGetter = true)
	public native byte charSizeVerticalSyncOffset();

	@Generated
	@StructureField(order = 22, isGetter = false)
	public native void setCharSizeVerticalSyncOffset(byte value);

	@Generated
	@StructureField(order = 23, isGetter = true)
	public native byte charSizeVerticalSyncPulse();

	@Generated
	@StructureField(order = 23, isGetter = false)
	public native void setCharSizeVerticalSyncPulse(byte value);

	@Generated
	@StructureField(order = 24, isGetter = true)
	public native byte charSizeHorizontalBorderLeft();

	@Generated
	@StructureField(order = 24, isGetter = false)
	public native void setCharSizeHorizontalBorderLeft(byte value);

	@Generated
	@StructureField(order = 25, isGetter = true)
	public native byte charSizeHorizontalBorderRight();

	@Generated
	@StructureField(order = 25, isGetter = false)
	public native void setCharSizeHorizontalBorderRight(byte value);

	@Generated
	@StructureField(order = 26, isGetter = true)
	public native byte charSizeVerticalBorderTop();

	@Generated
	@StructureField(order = 26, isGetter = false)
	public native void setCharSizeVerticalBorderTop(byte value);

	@Generated
	@StructureField(order = 27, isGetter = true)
	public native byte charSizeVerticalBorderBottom();

	@Generated
	@StructureField(order = 27, isGetter = false)
	public native void setCharSizeVerticalBorderBottom(byte value);

	@Generated
	@StructureField(order = 28, isGetter = true)
	public native byte charSizeHorizontalTotal();

	@Generated
	@StructureField(order = 28, isGetter = false)
	public native void setCharSizeHorizontalTotal(byte value);

	@Generated
	@StructureField(order = 29, isGetter = true)
	public native byte charSizeVerticalTotal();

	@Generated
	@StructureField(order = 29, isGetter = false)
	public native void setCharSizeVerticalTotal(byte value);

	@Generated
	@StructureField(order = 30, isGetter = true)
	public native short __reservedE();

	@Generated
	@StructureField(order = 30, isGetter = false)
	public native void set__reservedE(short value);

	@Generated
	@StructureField(order = 31, isGetter = true)
	public native int minHorizontalActiveClocks();

	@Generated
	@StructureField(order = 31, isGetter = false)
	public native void setMinHorizontalActiveClocks(int value);

	@Generated
	@StructureField(order = 32, isGetter = true)
	public native int maxHorizontalActiveClocks();

	@Generated
	@StructureField(order = 32, isGetter = false)
	public native void setMaxHorizontalActiveClocks(int value);

	@Generated
	@StructureField(order = 33, isGetter = true)
	public native int minHorizontalBlankingClocks();

	@Generated
	@StructureField(order = 33, isGetter = false)
	public native void setMinHorizontalBlankingClocks(int value);

	@Generated
	@StructureField(order = 34, isGetter = true)
	public native int maxHorizontalBlankingClocks();

	@Generated
	@StructureField(order = 34, isGetter = false)
	public native void setMaxHorizontalBlankingClocks(int value);

	@Generated
	@StructureField(order = 35, isGetter = true)
	public native int minHorizontalSyncOffsetClocks();

	@Generated
	@StructureField(order = 35, isGetter = false)
	public native void setMinHorizontalSyncOffsetClocks(int value);

	@Generated
	@StructureField(order = 36, isGetter = true)
	public native int maxHorizontalSyncOffsetClocks();

	@Generated
	@StructureField(order = 36, isGetter = false)
	public native void setMaxHorizontalSyncOffsetClocks(int value);

	@Generated
	@StructureField(order = 37, isGetter = true)
	public native int minHorizontalPulseWidthClocks();

	@Generated
	@StructureField(order = 37, isGetter = false)
	public native void setMinHorizontalPulseWidthClocks(int value);

	@Generated
	@StructureField(order = 38, isGetter = true)
	public native int maxHorizontalPulseWidthClocks();

	@Generated
	@StructureField(order = 38, isGetter = false)
	public native void setMaxHorizontalPulseWidthClocks(int value);

	@Generated
	@StructureField(order = 39, isGetter = true)
	public native int minVerticalActiveClocks();

	@Generated
	@StructureField(order = 39, isGetter = false)
	public native void setMinVerticalActiveClocks(int value);

	@Generated
	@StructureField(order = 40, isGetter = true)
	public native int maxVerticalActiveClocks();

	@Generated
	@StructureField(order = 40, isGetter = false)
	public native void setMaxVerticalActiveClocks(int value);

	@Generated
	@StructureField(order = 41, isGetter = true)
	public native int minVerticalBlankingClocks();

	@Generated
	@StructureField(order = 41, isGetter = false)
	public native void setMinVerticalBlankingClocks(int value);

	@Generated
	@StructureField(order = 42, isGetter = true)
	public native int maxVerticalBlankingClocks();

	@Generated
	@StructureField(order = 42, isGetter = false)
	public native void setMaxVerticalBlankingClocks(int value);

	@Generated
	@StructureField(order = 43, isGetter = true)
	public native int minVerticalSyncOffsetClocks();

	@Generated
	@StructureField(order = 43, isGetter = false)
	public native void setMinVerticalSyncOffsetClocks(int value);

	@Generated
	@StructureField(order = 44, isGetter = true)
	public native int maxVerticalSyncOffsetClocks();

	@Generated
	@StructureField(order = 44, isGetter = false)
	public native void setMaxVerticalSyncOffsetClocks(int value);

	@Generated
	@StructureField(order = 45, isGetter = true)
	public native int minVerticalPulseWidthClocks();

	@Generated
	@StructureField(order = 45, isGetter = false)
	public native void setMinVerticalPulseWidthClocks(int value);

	@Generated
	@StructureField(order = 46, isGetter = true)
	public native int maxVerticalPulseWidthClocks();

	@Generated
	@StructureField(order = 46, isGetter = false)
	public native void setMaxVerticalPulseWidthClocks(int value);

	@Generated
	@StructureField(order = 47, isGetter = true)
	public native int minHorizontalBorderLeft();

	@Generated
	@StructureField(order = 47, isGetter = false)
	public native void setMinHorizontalBorderLeft(int value);

	@Generated
	@StructureField(order = 48, isGetter = true)
	public native int maxHorizontalBorderLeft();

	@Generated
	@StructureField(order = 48, isGetter = false)
	public native void setMaxHorizontalBorderLeft(int value);

	@Generated
	@StructureField(order = 49, isGetter = true)
	public native int minHorizontalBorderRight();

	@Generated
	@StructureField(order = 49, isGetter = false)
	public native void setMinHorizontalBorderRight(int value);

	@Generated
	@StructureField(order = 50, isGetter = true)
	public native int maxHorizontalBorderRight();

	@Generated
	@StructureField(order = 50, isGetter = false)
	public native void setMaxHorizontalBorderRight(int value);

	@Generated
	@StructureField(order = 51, isGetter = true)
	public native int minVerticalBorderTop();

	@Generated
	@StructureField(order = 51, isGetter = false)
	public native void setMinVerticalBorderTop(int value);

	@Generated
	@StructureField(order = 52, isGetter = true)
	public native int maxVerticalBorderTop();

	@Generated
	@StructureField(order = 52, isGetter = false)
	public native void setMaxVerticalBorderTop(int value);

	@Generated
	@StructureField(order = 53, isGetter = true)
	public native int minVerticalBorderBottom();

	@Generated
	@StructureField(order = 53, isGetter = false)
	public native void setMinVerticalBorderBottom(int value);

	@Generated
	@StructureField(order = 54, isGetter = true)
	public native int maxVerticalBorderBottom();

	@Generated
	@StructureField(order = 54, isGetter = false)
	public native void setMaxVerticalBorderBottom(int value);

	@Generated
	@StructureField(order = 55, isGetter = true)
	public native int maxNumLinks();

	@Generated
	@StructureField(order = 55, isGetter = false)
	public native void setMaxNumLinks(int value);

	@Generated
	@StructureField(order = 56, isGetter = true)
	public native int minLink0PixelClock();

	@Generated
	@StructureField(order = 56, isGetter = false)
	public native void setMinLink0PixelClock(int value);

	@Generated
	@StructureField(order = 57, isGetter = true)
	public native int maxLink0PixelClock();

	@Generated
	@StructureField(order = 57, isGetter = false)
	public native void setMaxLink0PixelClock(int value);

	@Generated
	@StructureField(order = 58, isGetter = true)
	public native int minLink1PixelClock();

	@Generated
	@StructureField(order = 58, isGetter = false)
	public native void setMinLink1PixelClock(int value);

	@Generated
	@StructureField(order = 59, isGetter = true)
	public native int maxLink1PixelClock();

	@Generated
	@StructureField(order = 59, isGetter = false)
	public native void setMaxLink1PixelClock(int value);

	@Generated
	@StructureField(order = 60, isGetter = true, count = 3)
	public native int __reservedF(int field_idx);

	@Generated
	@StructureField(order = 60, isGetter = false, count = 3)
	public native void set__reservedF(int value, int field_idx);
}
