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
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 2)
public final class AudioRecordingChunk extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public AudioRecordingChunk() {
		super(AudioRecordingChunk.class);
	}

	@Generated
	protected AudioRecordingChunk(Pointer peer) {
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
	@StructureField(order = 2, isGetter = true, count = 24)
	public native byte AESChannelStatus(int field_idx);

	@Generated
	@StructureField(order = 2, isGetter = false, count = 24)
	public native void setAESChannelStatus(byte value, int field_idx);
}