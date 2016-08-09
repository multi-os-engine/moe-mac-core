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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.*;

@Generated
@Structure()
public final class cssm_spi_kr_funcs extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_spi_kr_funcs() {
		super(cssm_spi_kr_funcs.class);
	}

	@Generated
	protected cssm_spi_kr_funcs(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setRegistrationRequest(
			@FunctionPtr(name = "call_RegistrationRequest") Function_RegistrationRequest value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_RegistrationRequest {
		@Generated
		public int call_RegistrationRequest(
				int arg0,
				long arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_context arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg3,
				VoidPtr arg4, int arg5, IntPtr arg6, LongPtr arg7);
	}

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setRegistrationRetrieve(
			@FunctionPtr(name = "call_RegistrationRetrieve") Function_RegistrationRetrieve value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_RegistrationRetrieve {
		@Generated
		public int call_RegistrationRetrieve(
				int arg0,
				long arg1,
				IntPtr arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_kr_profile arg3);
	}

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setGenerateRecoveryFields(
			@FunctionPtr(name = "call_GenerateRecoveryFields") Function_GenerateRecoveryFields value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_GenerateRecoveryFields {
		@Generated
		public int call_GenerateRecoveryFields(
				int arg0,
				long arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_context arg2,
				long arg3,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_context arg4,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg5,
				int arg6,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg7);
	}

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setProcessRecoveryFields(
			@FunctionPtr(name = "call_ProcessRecoveryFields") Function_ProcessRecoveryFields value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_ProcessRecoveryFields {
		@Generated
		public int call_ProcessRecoveryFields(
				int arg0,
				long arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_context arg2,
				long arg3,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_context arg4,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg5,
				int arg6,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg7);
	}

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setRecoveryRequest(
			@FunctionPtr(name = "call_RecoveryRequest") Function_RecoveryRequest value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_RecoveryRequest {
		@Generated
		public int call_RecoveryRequest(
				int arg0,
				long arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_context arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg3,
				VoidPtr arg4, IntPtr arg5, LongPtr arg6);
	}

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setRecoveryRetrieve(
			@FunctionPtr(name = "call_RecoveryRetrieve") Function_RecoveryRetrieve value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_RecoveryRetrieve {
		@Generated
		public int call_RecoveryRetrieve(int arg0, long arg1, IntPtr arg2,
				LongPtr arg3, IntPtr arg4);
	}

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setGetRecoveredObject(
			@FunctionPtr(name = "call_GetRecoveredObject") Function_GetRecoveredObject value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_GetRecoveredObject {
		@Generated
		public int call_GetRecoveredObject(
				int arg0,
				long arg1,
				int arg2,
				long arg3,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_resource_control_context arg4,
				int arg5,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_key arg6,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg7);
	}

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setRecoveryRequestAbort(
			@FunctionPtr(name = "call_RecoveryRequestAbort") Function_RecoveryRequestAbort value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_RecoveryRequestAbort {
		@Generated
		public int call_RecoveryRequestAbort(int arg0, long arg1);
	}

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setPassThrough(
			@FunctionPtr(name = "call_PassThrough") Function_PassThrough value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_PassThrough {
		@Generated
		public int call_PassThrough(
				int arg0,
				long arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_context arg2,
				long arg3,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_context arg4,
				int arg5, ConstVoidPtr arg6, Ptr<VoidPtr> arg7);
	}
}
