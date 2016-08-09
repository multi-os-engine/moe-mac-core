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
import mac.struct.Float80;

@Generated
@Structure(alignment = 2)
public final class CommonChunk extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CommonChunk() {
		super(CommonChunk.class);
	}

	@Generated
	protected CommonChunk(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int ckID();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setCkID(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int ckSize();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setCkSize(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short numChannels();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setNumChannels(short value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int numSampleFrames();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setNumSampleFrames(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native short sampleSize();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setSampleSize(short value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	@ByValue
	public native Float80 sampleRate();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setSampleRate(@ByValue Float80 value);
}
