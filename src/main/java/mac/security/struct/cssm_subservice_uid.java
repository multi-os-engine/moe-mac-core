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
public final class cssm_subservice_uid extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_subservice_uid() {
		super(cssm_subservice_uid.class);
	}

	@Generated
	protected cssm_subservice_uid(Pointer peer) {
		super(peer);
	}

	@Generated
	public cssm_subservice_uid(@ByValue cssm_guid Guid,
			@ByValue cssm_version Version, int SubserviceId, int SubserviceType) {
		super(cssm_subservice_uid.class);
		setGuid(Guid);
		setVersion(Version);
		setSubserviceId(SubserviceId);
		setSubserviceType(SubserviceType);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native cssm_guid Guid();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setGuid(@ByValue cssm_guid value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@ByValue
	public native cssm_version Version();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setVersion(@ByValue cssm_version value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int SubserviceId();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setSubserviceId(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int SubserviceType();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setSubserviceType(int value);
}
