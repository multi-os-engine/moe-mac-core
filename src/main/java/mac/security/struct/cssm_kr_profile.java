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
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class cssm_kr_profile extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_kr_profile() {
		super(cssm_kr_profile.class);
	}

	@Generated
	protected cssm_kr_profile(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native cssm_kr_name UserName();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setUserName(@ByValue cssm_kr_name value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native VoidPtr UserCertificate();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setUserCertificate(VoidPtr value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native VoidPtr KRSCertChain();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setKRSCertChain(VoidPtr value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native byte LE_KRANum();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setLE_KRANum(byte value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native VoidPtr LE_KRACertChainList();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setLE_KRACertChainList(VoidPtr value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native byte ENT_KRANum();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setENT_KRANum(byte value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native VoidPtr ENT_KRACertChainList();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setENT_KRACertChainList(VoidPtr value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native byte INDIV_KRANum();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setINDIV_KRANum(byte value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native VoidPtr INDIV_KRACertChainList();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setINDIV_KRACertChainList(VoidPtr value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native cssm_data INDIV_AuthenticationInfo();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setINDIV_AuthenticationInfo(
			@UncertainArgument("Options: reference, array Fallback: reference") cssm_data value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native int KRSPFlags();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setKRSPFlags(int value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native cssm_data KRSPExtensions();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setKRSPExtensions(
			@UncertainArgument("Options: reference, array Fallback: reference") cssm_data value);
}
