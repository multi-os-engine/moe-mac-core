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
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class cssm_manager_registration_info extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_manager_registration_info() {
		super(cssm_manager_registration_info.class);
	}

	@Generated
	protected cssm_manager_registration_info(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setInitialize(
			@FunctionPtr(name = "call_Initialize") Function_Initialize value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_Initialize {
		@Generated
		public int call_Initialize(int arg0, int arg1);
	}

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setTerminate(
			@FunctionPtr(name = "call_Terminate") Function_Terminate value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_Terminate {
		@Generated
		public int call_Terminate();
	}

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setRegisterDispatchTable(
			@FunctionPtr(name = "call_RegisterDispatchTable") Function_RegisterDispatchTable value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_RegisterDispatchTable {
		@Generated
		public int call_RegisterDispatchTable(VoidPtr arg0);
	}

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setDeregisterDispatchTable(
			@FunctionPtr(name = "call_DeregisterDispatchTable") Function_DeregisterDispatchTable value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_DeregisterDispatchTable {
		@Generated
		public int call_DeregisterDispatchTable();
	}

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setEventNotifyManager(
			@FunctionPtr(name = "call_EventNotifyManager") Function_EventNotifyManager value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_EventNotifyManager {
		@Generated
		public int call_EventNotifyManager(
				@UncertainArgument("Options: reference, array Fallback: reference") cssm_manager_event_notification arg0);
	}

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setRefreshFunctionTable(
			@FunctionPtr(name = "call_RefreshFunctionTable") Function_RefreshFunctionTable value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_RefreshFunctionTable {
		@Generated
		public int call_RefreshFunctionTable(VoidPtr arg0, int arg1);
	}
}
