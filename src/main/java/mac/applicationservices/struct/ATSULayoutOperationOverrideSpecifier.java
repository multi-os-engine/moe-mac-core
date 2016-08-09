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

package mac.applicationservices.struct;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure(alignment = 2)
public final class ATSULayoutOperationOverrideSpecifier extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public ATSULayoutOperationOverrideSpecifier() {
		super(ATSULayoutOperationOverrideSpecifier.class);
	}

	@Generated
	protected ATSULayoutOperationOverrideSpecifier(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int operationSelector();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setOperationSelector(int value);

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setOverrideUPP(
			@FunctionPtr(name = "call_overrideUPP") Function_overrideUPP value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_overrideUPP {
		@Generated
		public int call_overrideUPP(int arg0, VoidPtr arg1, VoidPtr arg2,
				VoidPtr arg3, IntPtr arg4);
	}
}
