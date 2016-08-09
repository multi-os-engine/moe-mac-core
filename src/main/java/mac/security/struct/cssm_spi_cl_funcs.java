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
public final class cssm_spi_cl_funcs extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_spi_cl_funcs() {
		super(cssm_spi_cl_funcs.class);
	}

	@Generated
	protected cssm_spi_cl_funcs(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setCertCreateTemplate(
			@FunctionPtr(name = "call_CertCreateTemplate") Function_CertCreateTemplate value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CertCreateTemplate {
		@Generated
		public int call_CertCreateTemplate(
				long arg0,
				int arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_field arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg3);
	}

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setCertGetAllTemplateFields(
			@FunctionPtr(name = "call_CertGetAllTemplateFields") Function_CertGetAllTemplateFields value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CertGetAllTemplateFields {
		@Generated
		public int call_CertGetAllTemplateFields(
				long arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg1,
				IntPtr arg2, Ptr<Ptr<cssm_field>> arg3);
	}

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setCertSign(
			@FunctionPtr(name = "call_CertSign") Function_CertSign value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CertSign {
		@Generated
		public int call_CertSign(
				long arg0,
				long arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_field arg3,
				int arg4,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg5);
	}

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setCertVerify(
			@FunctionPtr(name = "call_CertVerify") Function_CertVerify value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CertVerify {
		@Generated
		public int call_CertVerify(
				long arg0,
				long arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg3,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_field arg4,
				int arg5);
	}

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setCertVerifyWithKey(
			@FunctionPtr(name = "call_CertVerifyWithKey") Function_CertVerifyWithKey value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CertVerifyWithKey {
		@Generated
		public int call_CertVerifyWithKey(
				long arg0,
				long arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg2);
	}

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setCertGetFirstFieldValue(
			@FunctionPtr(name = "call_CertGetFirstFieldValue") Function_CertGetFirstFieldValue value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CertGetFirstFieldValue {
		@Generated
		public int call_CertGetFirstFieldValue(
				long arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg2,
				LongPtr arg3, IntPtr arg4, Ptr<Ptr<cssm_data>> arg5);
	}

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setCertGetNextFieldValue(
			@FunctionPtr(name = "call_CertGetNextFieldValue") Function_CertGetNextFieldValue value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CertGetNextFieldValue {
		@Generated
		public int call_CertGetNextFieldValue(long arg0, long arg1,
				Ptr<Ptr<cssm_data>> arg2);
	}

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setCertAbortQuery(
			@FunctionPtr(name = "call_CertAbortQuery") Function_CertAbortQuery value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CertAbortQuery {
		@Generated
		public int call_CertAbortQuery(long arg0, long arg1);
	}

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setCertGetKeyInfo(
			@FunctionPtr(name = "call_CertGetKeyInfo") Function_CertGetKeyInfo value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CertGetKeyInfo {
		@Generated
		public int call_CertGetKeyInfo(
				long arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg1,
				Ptr<Ptr<cssm_key>> arg2);
	}

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setCertGetAllFields(
			@FunctionPtr(name = "call_CertGetAllFields") Function_CertGetAllFields value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CertGetAllFields {
		@Generated
		public int call_CertGetAllFields(
				long arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg1,
				IntPtr arg2, Ptr<Ptr<cssm_field>> arg3);
	}

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setFreeFields(
			@FunctionPtr(name = "call_FreeFields") Function_FreeFields value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_FreeFields {
		@Generated
		public int call_FreeFields(long arg0, int arg1,
				Ptr<Ptr<cssm_field>> arg2);
	}

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setFreeFieldValue(
			@FunctionPtr(name = "call_FreeFieldValue") Function_FreeFieldValue value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_FreeFieldValue {
		@Generated
		public int call_FreeFieldValue(
				long arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg2);
	}

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setCertCache(
			@FunctionPtr(name = "call_CertCache") Function_CertCache value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CertCache {
		@Generated
		public int call_CertCache(
				long arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg1,
				LongPtr arg2);
	}

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setCertGetFirstCachedFieldValue(
			@FunctionPtr(name = "call_CertGetFirstCachedFieldValue") Function_CertGetFirstCachedFieldValue value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CertGetFirstCachedFieldValue {
		@Generated
		public int call_CertGetFirstCachedFieldValue(
				long arg0,
				long arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg2,
				LongPtr arg3, IntPtr arg4, Ptr<Ptr<cssm_data>> arg5);
	}

	@Generated
	@StructureField(order = 14, isGetter = false)
	public native void setCertGetNextCachedFieldValue(
			@FunctionPtr(name = "call_CertGetNextCachedFieldValue") Function_CertGetNextCachedFieldValue value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CertGetNextCachedFieldValue {
		@Generated
		public int call_CertGetNextCachedFieldValue(long arg0, long arg1,
				Ptr<Ptr<cssm_data>> arg2);
	}

	@Generated
	@StructureField(order = 15, isGetter = false)
	public native void setCertAbortCache(
			@FunctionPtr(name = "call_CertAbortCache") Function_CertAbortCache value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CertAbortCache {
		@Generated
		public int call_CertAbortCache(long arg0, long arg1);
	}

	@Generated
	@StructureField(order = 16, isGetter = false)
	public native void setCertGroupToSignedBundle(
			@FunctionPtr(name = "call_CertGroupToSignedBundle") Function_CertGroupToSignedBundle value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CertGroupToSignedBundle {
		@Generated
		public int call_CertGroupToSignedBundle(
				long arg0,
				long arg1,
				VoidPtr arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_cert_bundle_header arg3,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg4);
	}

	@Generated
	@StructureField(order = 17, isGetter = false)
	public native void setCertGroupFromVerifiedBundle(
			@FunctionPtr(name = "call_CertGroupFromVerifiedBundle") Function_CertGroupFromVerifiedBundle value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CertGroupFromVerifiedBundle {
		@Generated
		public int call_CertGroupFromVerifiedBundle(
				long arg0,
				long arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_cert_bundle arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg3,
				Ptr<VoidPtr> arg4);
	}

	@Generated
	@StructureField(order = 18, isGetter = false)
	public native void setCertDescribeFormat(
			@FunctionPtr(name = "call_CertDescribeFormat") Function_CertDescribeFormat value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CertDescribeFormat {
		@Generated
		public int call_CertDescribeFormat(long arg0, IntPtr arg1,
				Ptr<Ptr<cssm_data>> arg2);
	}

	@Generated
	@StructureField(order = 19, isGetter = false)
	public native void setCrlCreateTemplate(
			@FunctionPtr(name = "call_CrlCreateTemplate") Function_CrlCreateTemplate value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CrlCreateTemplate {
		@Generated
		public int call_CrlCreateTemplate(
				long arg0,
				int arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_field arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg3);
	}

	@Generated
	@StructureField(order = 20, isGetter = false)
	public native void setCrlSetFields(
			@FunctionPtr(name = "call_CrlSetFields") Function_CrlSetFields value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CrlSetFields {
		@Generated
		public int call_CrlSetFields(
				long arg0,
				int arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_field arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg3,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg4);
	}

	@Generated
	@StructureField(order = 21, isGetter = false)
	public native void setCrlAddCert(
			@FunctionPtr(name = "call_CrlAddCert") Function_CrlAddCert value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CrlAddCert {
		@Generated
		public int call_CrlAddCert(
				long arg0,
				long arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg2,
				int arg3,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_field arg4,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg5,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg6);
	}

	@Generated
	@StructureField(order = 22, isGetter = false)
	public native void setCrlRemoveCert(
			@FunctionPtr(name = "call_CrlRemoveCert") Function_CrlRemoveCert value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CrlRemoveCert {
		@Generated
		public int call_CrlRemoveCert(
				long arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg3);
	}

	@Generated
	@StructureField(order = 23, isGetter = false)
	public native void setCrlSign(
			@FunctionPtr(name = "call_CrlSign") Function_CrlSign value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CrlSign {
		@Generated
		public int call_CrlSign(
				long arg0,
				long arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_field arg3,
				int arg4,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg5);
	}

	@Generated
	@StructureField(order = 24, isGetter = false)
	public native void setCrlVerify(
			@FunctionPtr(name = "call_CrlVerify") Function_CrlVerify value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CrlVerify {
		@Generated
		public int call_CrlVerify(
				long arg0,
				long arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg3,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_field arg4,
				int arg5);
	}

	@Generated
	@StructureField(order = 25, isGetter = false)
	public native void setCrlVerifyWithKey(
			@FunctionPtr(name = "call_CrlVerifyWithKey") Function_CrlVerifyWithKey value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CrlVerifyWithKey {
		@Generated
		public int call_CrlVerifyWithKey(
				long arg0,
				long arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg2);
	}

	@Generated
	@StructureField(order = 26, isGetter = false)
	public native void setIsCertInCrl(
			@FunctionPtr(name = "call_IsCertInCrl") Function_IsCertInCrl value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_IsCertInCrl {
		@Generated
		public int call_IsCertInCrl(
				long arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg2,
				IntPtr arg3);
	}

	@Generated
	@StructureField(order = 27, isGetter = false)
	public native void setCrlGetFirstFieldValue(
			@FunctionPtr(name = "call_CrlGetFirstFieldValue") Function_CrlGetFirstFieldValue value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CrlGetFirstFieldValue {
		@Generated
		public int call_CrlGetFirstFieldValue(
				long arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg2,
				LongPtr arg3, IntPtr arg4, Ptr<Ptr<cssm_data>> arg5);
	}

	@Generated
	@StructureField(order = 28, isGetter = false)
	public native void setCrlGetNextFieldValue(
			@FunctionPtr(name = "call_CrlGetNextFieldValue") Function_CrlGetNextFieldValue value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CrlGetNextFieldValue {
		@Generated
		public int call_CrlGetNextFieldValue(long arg0, long arg1,
				Ptr<Ptr<cssm_data>> arg2);
	}

	@Generated
	@StructureField(order = 29, isGetter = false)
	public native void setCrlAbortQuery(
			@FunctionPtr(name = "call_CrlAbortQuery") Function_CrlAbortQuery value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CrlAbortQuery {
		@Generated
		public int call_CrlAbortQuery(long arg0, long arg1);
	}

	@Generated
	@StructureField(order = 30, isGetter = false)
	public native void setCrlGetAllFields(
			@FunctionPtr(name = "call_CrlGetAllFields") Function_CrlGetAllFields value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CrlGetAllFields {
		@Generated
		public int call_CrlGetAllFields(
				long arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg1,
				IntPtr arg2, Ptr<Ptr<cssm_field>> arg3);
	}

	@Generated
	@StructureField(order = 31, isGetter = false)
	public native void setCrlCache(
			@FunctionPtr(name = "call_CrlCache") Function_CrlCache value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CrlCache {
		@Generated
		public int call_CrlCache(
				long arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg1,
				LongPtr arg2);
	}

	@Generated
	@StructureField(order = 32, isGetter = false)
	public native void setIsCertInCachedCrl(
			@FunctionPtr(name = "call_IsCertInCachedCrl") Function_IsCertInCachedCrl value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_IsCertInCachedCrl {
		@Generated
		public int call_IsCertInCachedCrl(
				long arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg1,
				long arg2,
				IntPtr arg3,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg4);
	}

	@Generated
	@StructureField(order = 33, isGetter = false)
	public native void setCrlGetFirstCachedFieldValue(
			@FunctionPtr(name = "call_CrlGetFirstCachedFieldValue") Function_CrlGetFirstCachedFieldValue value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CrlGetFirstCachedFieldValue {
		@Generated
		public int call_CrlGetFirstCachedFieldValue(
				long arg0,
				long arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg2,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg3,
				LongPtr arg4, IntPtr arg5, Ptr<Ptr<cssm_data>> arg6);
	}

	@Generated
	@StructureField(order = 34, isGetter = false)
	public native void setCrlGetNextCachedFieldValue(
			@FunctionPtr(name = "call_CrlGetNextCachedFieldValue") Function_CrlGetNextCachedFieldValue value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CrlGetNextCachedFieldValue {
		@Generated
		public int call_CrlGetNextCachedFieldValue(long arg0, long arg1,
				Ptr<Ptr<cssm_data>> arg2);
	}

	@Generated
	@StructureField(order = 35, isGetter = false)
	public native void setCrlGetAllCachedRecordFields(
			@FunctionPtr(name = "call_CrlGetAllCachedRecordFields") Function_CrlGetAllCachedRecordFields value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CrlGetAllCachedRecordFields {
		@Generated
		public int call_CrlGetAllCachedRecordFields(
				long arg0,
				long arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_data arg2,
				IntPtr arg3, Ptr<Ptr<cssm_field>> arg4);
	}

	@Generated
	@StructureField(order = 36, isGetter = false)
	public native void setCrlAbortCache(
			@FunctionPtr(name = "call_CrlAbortCache") Function_CrlAbortCache value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CrlAbortCache {
		@Generated
		public int call_CrlAbortCache(long arg0, long arg1);
	}

	@Generated
	@StructureField(order = 37, isGetter = false)
	public native void setCrlDescribeFormat(
			@FunctionPtr(name = "call_CrlDescribeFormat") Function_CrlDescribeFormat value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CrlDescribeFormat {
		@Generated
		public int call_CrlDescribeFormat(long arg0, IntPtr arg1,
				Ptr<Ptr<cssm_data>> arg2);
	}

	@Generated
	@StructureField(order = 38, isGetter = false)
	public native void setPassThrough(
			@FunctionPtr(name = "call_PassThrough") Function_PassThrough value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_PassThrough {
		@Generated
		public int call_PassThrough(long arg0, long arg1, int arg2,
				ConstVoidPtr arg3, Ptr<VoidPtr> arg4);
	}
}
