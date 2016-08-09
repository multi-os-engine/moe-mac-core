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
import mac.coreservices.struct.AliasRecord;
import mac.coreservices.struct.FSSpec;

@Generated
@Structure(alignment = 2)
public final class ICFileSpec extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public ICFileSpec() {
		super(ICFileSpec.class);
	}

	@Generated
	protected ICFileSpec(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true, count = 32)
	public native byte volName(int field_idx);

	@Generated
	@StructureField(order = 0, isGetter = false, count = 32)
	public native void setVolName(byte value, int field_idx);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int volCreationDate();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setVolCreationDate(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@ByValue
	public native FSSpec fss();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setFss(@ByValue FSSpec value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	@ByValue
	public native AliasRecord alias();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setAlias(@ByValue AliasRecord value);
}
