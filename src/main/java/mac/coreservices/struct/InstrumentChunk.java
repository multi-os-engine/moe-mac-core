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

@Generated
@Structure(alignment = 2)
public final class InstrumentChunk extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public InstrumentChunk() {
		super(InstrumentChunk.class);
	}

	@Generated
	protected InstrumentChunk(Pointer peer) {
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
	public native byte baseFrequency();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setBaseFrequency(byte value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native byte detune();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setDetune(byte value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native byte lowFrequency();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setLowFrequency(byte value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native byte highFrequency();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setHighFrequency(byte value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native byte lowVelocity();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setLowVelocity(byte value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native byte highVelocity();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setHighVelocity(byte value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native short gain();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setGain(short value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	@ByValue
	public native AIFFLoop sustainLoop();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setSustainLoop(@ByValue AIFFLoop value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	@ByValue
	public native AIFFLoop releaseLoop();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setReleaseLoop(@ByValue AIFFLoop value);
}
