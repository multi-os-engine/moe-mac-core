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
import mac.applicationservices.opaque.CMProfileRef;

@Generated
@Structure()
public final class CMConcatProfileSet extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CMConcatProfileSet() {
		super(CMConcatProfileSet.class);
	}

	@Generated
	protected CMConcatProfileSet(Pointer peer) {
		super(peer);
	}

	@Generated
	public CMConcatProfileSet(short keyIndex, short count,
			CMProfileRef profileSet) {
		super(CMConcatProfileSet.class);
		setKeyIndex(keyIndex);
		setCount(count);
		setProfileSet(profileSet);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short keyIndex();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setKeyIndex(short value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short count();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setCount(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native CMProfileRef profileSet();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setProfileSet(CMProfileRef value);
}
