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
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class cssm_spi_tp_funcs extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_spi_tp_funcs() {
		super(cssm_spi_tp_funcs.class);
	}

	@Generated
	protected cssm_spi_tp_funcs(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setSubmitCredRequest(
			@FunctionPtr(name = "call_SubmitCredRequest") Function_SubmitCredRequest value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_SubmitCredRequest {
		@Generated
		public int call_SubmitCredRequest(
				long arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_tp_authority_id arg1,
				int arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_tp_request_set arg3,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_tp_callerauth_context arg4,
				IntPtr arg5,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg6);
	}

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setRetrieveCredResult(
			@FunctionPtr(name = "call_RetrieveCredResult") Function_RetrieveCredResult value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_RetrieveCredResult {
		@Generated
		public int call_RetrieveCredResult(
				long arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_tp_callerauth_context arg2,
				IntPtr arg3, IntPtr arg4, Ptr<Ptr<cssm_tp_result_set>> arg5);
	}

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setConfirmCredResult(
			@FunctionPtr(name = "call_ConfirmCredResult") Function_ConfirmCredResult value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_ConfirmCredResult {
		@Generated
		public int call_ConfirmCredResult(
				long arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_tp_callerauth_context arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_tp_confirm_response arg3,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_tp_authority_id arg4);
	}

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setReceiveConfirmation(
			@FunctionPtr(name = "call_ReceiveConfirmation") Function_ReceiveConfirmation value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_ReceiveConfirmation {
		@Generated
		public int call_ReceiveConfirmation(
				long arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg1,
				Ptr<Ptr<cssm_tp_confirm_response>> arg2, IntPtr arg3);
	}

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setCertReclaimKey(
			@FunctionPtr(name = "call_CertReclaimKey") Function_CertReclaimKey value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CertReclaimKey {
		@Generated
		public int call_CertReclaimKey(
				long arg0,
				VoidPtr arg1,
				int arg2,
				long arg3,
				long arg4,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_resource_control_context arg5);
	}

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setCertReclaimAbort(
			@FunctionPtr(name = "call_CertReclaimAbort") Function_CertReclaimAbort value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CertReclaimAbort {
		@Generated
		public int call_CertReclaimAbort(long arg0, long arg1);
	}

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setFormRequest(
			@FunctionPtr(name = "call_FormRequest") Function_FormRequest value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_FormRequest {
		@Generated
		public int call_FormRequest(
				long arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_tp_authority_id arg1,
				int arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg3);
	}

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setFormSubmit(
			@FunctionPtr(name = "call_FormSubmit") Function_FormSubmit value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_FormSubmit {
		@Generated
		public int call_FormSubmit(
				long arg0,
				int arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_tp_authority_id arg3,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_tp_authority_id arg4,
				VoidPtr arg5);
	}

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setCertGroupVerify(
			@FunctionPtr(name = "call_CertGroupVerify") Function_CertGroupVerify value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CertGroupVerify {
		@Generated
		public int call_CertGroupVerify(
				long arg0,
				long arg1,
				long arg2,
				VoidPtr arg3,
				VoidPtr arg4,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_tp_verify_context_result arg5);
	}

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setCertCreateTemplate(
			@FunctionPtr(name = "call_CertCreateTemplate") Function_CertCreateTemplate value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CertCreateTemplate {
		@Generated
		public int call_CertCreateTemplate(
				long arg0,
				long arg1,
				int arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_field arg3,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg4);
	}

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setCertGetAllTemplateFields(
			@FunctionPtr(name = "call_CertGetAllTemplateFields") Function_CertGetAllTemplateFields value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CertGetAllTemplateFields {
		@Generated
		public int call_CertGetAllTemplateFields(
				long arg0,
				long arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg2,
				IntPtr arg3, Ptr<Ptr<cssm_field>> arg4);
	}

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setCertSign(
			@FunctionPtr(name = "call_CertSign") Function_CertSign value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CertSign {
		@Generated
		public int call_CertSign(
				long arg0,
				long arg1,
				long arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg3,
				VoidPtr arg4,
				VoidPtr arg5,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_tp_verify_context_result arg6,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg7);
	}

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setCrlVerify(
			@FunctionPtr(name = "call_CrlVerify") Function_CrlVerify value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CrlVerify {
		@Generated
		public int call_CrlVerify(
				long arg0,
				long arg1,
				long arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_encoded_crl arg3,
				VoidPtr arg4,
				VoidPtr arg5,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_tp_verify_context_result arg6);
	}

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setCrlCreateTemplate(
			@FunctionPtr(name = "call_CrlCreateTemplate") Function_CrlCreateTemplate value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CrlCreateTemplate {
		@Generated
		public int call_CrlCreateTemplate(
				long arg0,
				long arg1,
				int arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_field arg3,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg4);
	}

	@Generated
	@StructureField(order = 14, isGetter = false)
	public native void setCertRevoke(
			@FunctionPtr(name = "call_CertRevoke") Function_CertRevoke value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CertRevoke {
		@Generated
		public int call_CertRevoke(
				long arg0,
				long arg1,
				long arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg3,
				VoidPtr arg4,
				VoidPtr arg5,
				VoidPtr arg6,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_tp_verify_context_result arg7,
				int arg8,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg9);
	}

	@Generated
	@StructureField(order = 15, isGetter = false)
	public native void setCertRemoveFromCrlTemplate(
			@FunctionPtr(name = "call_CertRemoveFromCrlTemplate") Function_CertRemoveFromCrlTemplate value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CertRemoveFromCrlTemplate {
		@Generated
		public int call_CertRemoveFromCrlTemplate(
				long arg0,
				long arg1,
				long arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg3,
				VoidPtr arg4,
				VoidPtr arg5,
				VoidPtr arg6,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_tp_verify_context_result arg7,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg8);
	}

	@Generated
	@StructureField(order = 16, isGetter = false)
	public native void setCrlSign(
			@FunctionPtr(name = "call_CrlSign") Function_CrlSign value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CrlSign {
		@Generated
		public int call_CrlSign(
				long arg0,
				long arg1,
				long arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_encoded_crl arg3,
				VoidPtr arg4,
				VoidPtr arg5,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_tp_verify_context_result arg6,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg7);
	}

	@Generated
	@StructureField(order = 17, isGetter = false)
	public native void setApplyCrlToDb(
			@FunctionPtr(name = "call_ApplyCrlToDb") Function_ApplyCrlToDb value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_ApplyCrlToDb {
		@Generated
		public int call_ApplyCrlToDb(
				long arg0,
				long arg1,
				long arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_encoded_crl arg3,
				VoidPtr arg4,
				VoidPtr arg5,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_tp_verify_context_result arg6);
	}

	@Generated
	@StructureField(order = 18, isGetter = false)
	public native void setCertGroupConstruct(
			@FunctionPtr(name = "call_CertGroupConstruct") Function_CertGroupConstruct value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CertGroupConstruct {
		@Generated
		public int call_CertGroupConstruct(
				long arg0,
				long arg1,
				long arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_dl_db_list arg3,
				ConstVoidPtr arg4, VoidPtr arg5, Ptr<VoidPtr> arg6);
	}

	@Generated
	@StructureField(order = 19, isGetter = false)
	public native void setCertGroupPrune(
			@FunctionPtr(name = "call_CertGroupPrune") Function_CertGroupPrune value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CertGroupPrune {
		@Generated
		public int call_CertGroupPrune(
				long arg0,
				long arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_dl_db_list arg2,
				VoidPtr arg3, Ptr<VoidPtr> arg4);
	}

	@Generated
	@StructureField(order = 20, isGetter = false)
	public native void setCertGroupToTupleGroup(
			@FunctionPtr(name = "call_CertGroupToTupleGroup") Function_CertGroupToTupleGroup value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CertGroupToTupleGroup {
		@Generated
		public int call_CertGroupToTupleGroup(long arg0, long arg1,
				VoidPtr arg2, Ptr<Ptr<cssm_tuplegroup>> arg3);
	}

	@Generated
	@StructureField(order = 21, isGetter = false)
	public native void setTupleGroupToCertGroup(
			@FunctionPtr(name = "call_TupleGroupToCertGroup") Function_TupleGroupToCertGroup value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_TupleGroupToCertGroup {
		@Generated
		public int call_TupleGroupToCertGroup(
				long arg0,
				long arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_tuplegroup arg2,
				Ptr<VoidPtr> arg3);
	}

	@Generated
	@StructureField(order = 22, isGetter = false)
	public native void setPassThrough(
			@FunctionPtr(name = "call_PassThrough") Function_PassThrough value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_PassThrough {
		@Generated
		public int call_PassThrough(
				long arg0,
				long arg1,
				long arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_dl_db_list arg3,
				int arg4, ConstVoidPtr arg5, Ptr<VoidPtr> arg6);
	}
}
