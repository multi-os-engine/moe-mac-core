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
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class cssm_acl_entry_prototype extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_acl_entry_prototype() {
		super(cssm_acl_entry_prototype.class);
	}

	@Generated
	protected cssm_acl_entry_prototype(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native cssm_list TypedSubject();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setTypedSubject(@ByValue cssm_list value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int Delegate();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setDelegate(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@ByValue
	public native cssm_authorizationgroup Authorization();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setAuthorization(@ByValue cssm_authorizationgroup value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	@ByValue
	public native cssm_acl_validity_period TimeRange();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setTimeRange(@ByValue cssm_acl_validity_period value);

	@Generated
	@StructureField(order = 4, isGetter = true, count = 68)
	public native byte EntryTag(int field_idx);

	@Generated
	@StructureField(order = 4, isGetter = false, count = 68)
	public native void setEntryTag(byte value, int field_idx);
}
