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

@Generated
@Structure(alignment = 2)
public final class CMNativeDisplayInfo extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CMNativeDisplayInfo() {
		super(CMNativeDisplayInfo.class);
	}

	@Generated
	protected CMNativeDisplayInfo(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int dataSize();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setDataSize(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@ByValue
	public native CMFixedXYColor redPhosphor();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setRedPhosphor(@ByValue CMFixedXYColor value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@ByValue
	public native CMFixedXYColor greenPhosphor();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setGreenPhosphor(@ByValue CMFixedXYColor value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	@ByValue
	public native CMFixedXYColor bluePhosphor();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setBluePhosphor(@ByValue CMFixedXYColor value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	@ByValue
	public native CMFixedXYColor whitePoint();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setWhitePoint(@ByValue CMFixedXYColor value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int redGammaValue();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setRedGammaValue(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int greenGammaValue();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setGreenGammaValue(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int blueGammaValue();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setBlueGammaValue(int value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native short gammaChannels();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setGammaChannels(short value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native short gammaEntryCount();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setGammaEntryCount(short value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native short gammaEntrySize();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setGammaEntrySize(short value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native byte gammaData();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setGammaData(byte value);
}
