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
public final class cssm_acl_entry_info extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_acl_entry_info() {
		super(cssm_acl_entry_info.class);
	}

	@Generated
	protected cssm_acl_entry_info(Pointer peer) {
		super(peer);
	}

	@Generated
	public cssm_acl_entry_info(
			@ByValue cssm_acl_entry_prototype EntryPublicInfo, long EntryHandle) {
		super(cssm_acl_entry_info.class);
		setEntryPublicInfo(EntryPublicInfo);
		setEntryHandle(EntryHandle);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native cssm_acl_entry_prototype EntryPublicInfo();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setEntryPublicInfo(
			@ByValue cssm_acl_entry_prototype value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native long EntryHandle();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setEntryHandle(long value);
}
