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


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class cssm_tp_callerauth_context extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_tp_callerauth_context() {
		super(cssm_tp_callerauth_context.class);
	}

	@Generated
	protected cssm_tp_callerauth_context(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native cssm_tp_policyinfo Policy();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setPolicy(@ByValue cssm_tp_policyinfo value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native BytePtr VerifyTime();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setVerifyTime(BytePtr value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int VerificationAbortOn();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setVerificationAbortOn(int value);

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setCallbackWithVerifiedCert(
			@FunctionPtr(name = "call_CallbackWithVerifiedCert") Function_CallbackWithVerifiedCert value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CallbackWithVerifiedCert {
		@Generated
		public int call_CallbackWithVerifiedCert(
				long arg0,
				VoidPtr arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg2);
	}

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int NumberOfAnchorCerts();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setNumberOfAnchorCerts(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native cssm_data AnchorCerts();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setAnchorCerts(
			@UncertainArgument("Options: reference, array Fallback: reference") cssm_data value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native cssm_dl_db_list DBList();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setDBList(
			@UncertainArgument("Options: reference, array Fallback: reference") cssm_dl_db_list value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native VoidPtr CallerCredentials();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setCallerCredentials(VoidPtr value);
}
