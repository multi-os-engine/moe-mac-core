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
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;

@Generated
@Structure()
public final class cssm_acl_edit extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_acl_edit() {
		super(cssm_acl_edit.class);
	}

	@Generated
	protected cssm_acl_edit(Pointer peer) {
		super(peer);
	}

	@Generated
	public cssm_acl_edit(
			int EditMode,
			long OldEntryHandle,
			@UncertainArgument("Options: reference, array Fallback: reference") cssm_acl_entry_input NewEntry) {
		super(cssm_acl_edit.class);
		setEditMode(EditMode);
		setOldEntryHandle(OldEntryHandle);
		setNewEntry(NewEntry);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int EditMode();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setEditMode(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native long OldEntryHandle();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setOldEntryHandle(long value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native cssm_acl_entry_input NewEntry();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setNewEntry(
			@UncertainArgument("Options: reference, array Fallback: reference") cssm_acl_entry_input value);
}
