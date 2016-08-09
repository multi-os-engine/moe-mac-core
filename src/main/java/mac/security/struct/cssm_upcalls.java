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
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class cssm_upcalls extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_upcalls() {
		super(cssm_upcalls.class);
	}

	@Generated
	protected cssm_upcalls(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setMalloc_func(
			@FunctionPtr(name = "call_malloc_func") Function_malloc_func value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_malloc_func {
		@Generated
		public VoidPtr call_malloc_func(long arg0, long arg1);
	}

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setFree_func(
			@FunctionPtr(name = "call_free_func") Function_free_func value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_free_func {
		@Generated
		public void call_free_func(long arg0, VoidPtr arg1);
	}

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setRealloc_func(
			@FunctionPtr(name = "call_realloc_func") Function_realloc_func value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_realloc_func {
		@Generated
		public VoidPtr call_realloc_func(long arg0, VoidPtr arg1, long arg2);
	}

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setCalloc_func(
			@FunctionPtr(name = "call_calloc_func") Function_calloc_func value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_calloc_func {
		@Generated
		public VoidPtr call_calloc_func(long arg0, long arg1, long arg2);
	}

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setCcToHandle_func(
			@FunctionPtr(name = "call_CcToHandle_func") Function_CcToHandle_func value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CcToHandle_func {
		@Generated
		public int call_CcToHandle_func(long arg0, LongPtr arg1);
	}

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setGetModuleInfo_func(
			@FunctionPtr(name = "call_GetModuleInfo_func") Function_GetModuleInfo_func value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_GetModuleInfo_func {
		@Generated
		public int call_GetModuleInfo_func(
				long arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_guid arg1,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_version arg2,
				IntPtr arg3,
				IntPtr arg4,
				IntPtr arg5,
				IntPtr arg6,
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_memory_funcs arg7,
				VoidPtr arg8, int arg9);
	}
}
