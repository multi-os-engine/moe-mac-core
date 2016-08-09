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

@Generated
@Structure()
public final class cssm_csp_operational_statistics extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_csp_operational_statistics() {
		super(cssm_csp_operational_statistics.class);
	}

	@Generated
	protected cssm_csp_operational_statistics(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int UserAuthenticated();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setUserAuthenticated(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int DeviceFlags();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setDeviceFlags(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int TokenMaxSessionCount();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setTokenMaxSessionCount(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int TokenOpenedSessionCount();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setTokenOpenedSessionCount(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int TokenMaxRWSessionCount();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setTokenMaxRWSessionCount(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int TokenOpenedRWSessionCount();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setTokenOpenedRWSessionCount(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int TokenTotalPublicMem();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setTokenTotalPublicMem(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int TokenFreePublicMem();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setTokenFreePublicMem(int value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native int TokenTotalPrivateMem();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setTokenTotalPrivateMem(int value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native int TokenFreePrivateMem();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setTokenFreePrivateMem(int value);
}
