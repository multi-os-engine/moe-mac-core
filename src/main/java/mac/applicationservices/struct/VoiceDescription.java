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
public final class VoiceDescription extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public VoiceDescription() {
		super(VoiceDescription.class);
	}

	@Generated
	protected VoiceDescription(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int length();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setLength(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@ByValue
	public native VoiceSpec voice();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setVoice(@ByValue VoiceSpec value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int version();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setVersion(int value);

	@Generated
	@StructureField(order = 3, isGetter = true, count = 64)
	public native byte name(int field_idx);

	@Generated
	@StructureField(order = 3, isGetter = false, count = 64)
	public native void setName(byte value, int field_idx);

	@Generated
	@StructureField(order = 4, isGetter = true, count = 256)
	public native byte comment(int field_idx);

	@Generated
	@StructureField(order = 4, isGetter = false, count = 256)
	public native void setComment(byte value, int field_idx);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native short gender();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setGender(short value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native short age();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setAge(short value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native short script();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setScript(short value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native short language();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setLanguage(short value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native short region();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setRegion(short value);

	@Generated
	@StructureField(order = 10, isGetter = true, count = 4)
	public native int reserved(int field_idx);

	@Generated
	@StructureField(order = 10, isGetter = false, count = 4)
	public native void setReserved(int value, int field_idx);
}
