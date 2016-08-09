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

package mac.coreservices.struct;


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
import org.moe.natj.general.ann.UncertainReturn;

@Generated
@Structure(alignment = 2)
public final class DeferredTask extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public DeferredTask() {
		super(DeferredTask.class);
	}

	@Generated
	protected DeferredTask(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native QElem qLink();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setQLink(
			@UncertainArgument("Options: reference, array Fallback: reference") QElem value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short qType();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setQType(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short dtFlags();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setDtFlags(short value);

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setDtAddr(
			@FunctionPtr(name = "call_dtAddr") Function_dtAddr value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_dtAddr {
		@Generated
		public void call_dtAddr(long arg0);
	}

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native long dtParam();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setDtParam(long value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native long dtReserved();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setDtReserved(long value);
}
