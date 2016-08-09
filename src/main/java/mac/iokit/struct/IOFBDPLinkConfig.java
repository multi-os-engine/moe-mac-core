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
public final class IOFBDPLinkConfig extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public IOFBDPLinkConfig() {
		super(IOFBDPLinkConfig.class);
	}

	@Generated
	protected IOFBDPLinkConfig(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short version();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setVersion(short value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native byte bitRate();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setBitRate(byte value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native byte __reservedA();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void set__reservedA(byte value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native short t1Time();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setT1Time(short value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native short t2Time();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setT2Time(short value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native short t3Time();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setT3Time(short value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native byte idlePatterns();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setIdlePatterns(byte value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native byte laneCount();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setLaneCount(byte value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native byte voltage();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setVoltage(byte value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native byte preEmphasis();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setPreEmphasis(byte value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native byte downspread();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setDownspread(byte value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native byte scrambler();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setScrambler(byte value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	public native byte maxBitRate();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setMaxBitRate(byte value);

	@Generated
	@StructureField(order = 13, isGetter = true)
	public native byte maxLaneCount();

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setMaxLaneCount(byte value);

	@Generated
	@StructureField(order = 14, isGetter = true)
	public native byte maxDownspread();

	@Generated
	@StructureField(order = 14, isGetter = false)
	public native void setMaxDownspread(byte value);

	@Generated
	@StructureField(order = 15, isGetter = true, count = 9)
	public native byte __reservedB(int field_idx);

	@Generated
	@StructureField(order = 15, isGetter = false, count = 9)
	public native void set__reservedB(byte value, int field_idx);
}
