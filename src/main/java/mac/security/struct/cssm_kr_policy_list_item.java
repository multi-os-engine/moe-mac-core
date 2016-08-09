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

package mac.security.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class cssm_kr_policy_list_item extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_kr_policy_list_item() {
		super(cssm_kr_policy_list_item.class);
	}

	@Generated
	protected cssm_kr_policy_list_item(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native VoidPtr next();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setNext(VoidPtr value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int AlgorithmId();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setAlgorithmId(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int Mode();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setMode(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int MaxKeyLength();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setMaxKeyLength(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int MaxRounds();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setMaxRounds(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native byte WorkFactor();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setWorkFactor(byte value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int PolicyFlags();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setPolicyFlags(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int AlgClass();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setAlgClass(int value);
}
