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
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class cssm_spi_ac_funcs extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_spi_ac_funcs() {
		super(cssm_spi_ac_funcs.class);
	}

	@Generated
	protected cssm_spi_ac_funcs(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setAuthCompute(
			@FunctionPtr(name = "call_AuthCompute") Function_AuthCompute value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_AuthCompute {
		@Generated
		public int call_AuthCompute(
				long arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_tuplegroup arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_tuplegroup arg2,
				int arg3,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_list arg4,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_list arg5,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_list arg6,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_tuplegroup arg7);
	}

	@Generated
	@StructureField(order = 1, isGetter = false)
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
				long arg3,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_dl_db_list arg4,
				int arg5, ConstVoidPtr arg6, Ptr<VoidPtr> arg7);
	}
}
