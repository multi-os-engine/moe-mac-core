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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class LAMorphemeRec extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public LAMorphemeRec() {
		super(LAMorphemeRec.class);
	}

	@Generated
	protected LAMorphemeRec(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int sourceTextLength();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setSourceTextLength(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native VoidPtr sourceTextPtr();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setSourceTextPtr(VoidPtr value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int morphemeTextLength();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setMorphemeTextLength(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native VoidPtr morphemeTextPtr();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setMorphemeTextPtr(VoidPtr value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int partOfSpeech();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setPartOfSpeech(int value);
}
