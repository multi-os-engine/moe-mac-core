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

package mac.coregraphics.struct;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstDoublePtr;
import org.moe.natj.general.ptr.DoublePtr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class CGFunctionCallbacks extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CGFunctionCallbacks() {
		super(CGFunctionCallbacks.class);
	}

	@Generated
	protected CGFunctionCallbacks(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int version();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setVersion(int value);

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setEvaluate(
			@FunctionPtr(name = "call_evaluate") Function_evaluate value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_evaluate {
		@Generated
		public void call_evaluate(VoidPtr arg0, ConstDoublePtr arg1,
				DoublePtr arg2);
	}

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setReleaseInfo(
			@FunctionPtr(name = "call_releaseInfo") Function_releaseInfo value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_releaseInfo {
		@Generated
		public void call_releaseInfo(VoidPtr arg0);
	}
}
