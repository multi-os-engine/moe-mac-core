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
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure(alignment = 2)
public final class CSIdentityQueryClientContext extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CSIdentityQueryClientContext() {
		super(CSIdentityQueryClientContext.class);
	}

	@Generated
	protected CSIdentityQueryClientContext(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native long version();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setVersion(long value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native VoidPtr info();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setInfo(VoidPtr value);

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setRetainInfo(
			@FunctionPtr(name = "call_retainInfo") Function_retainInfo value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_retainInfo {
		@Generated
		public ConstVoidPtr call_retainInfo(ConstVoidPtr arg0);
	}

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setReleaseInfo(
			@FunctionPtr(name = "call_releaseInfo") Function_releaseInfo value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_releaseInfo {
		@Generated
		public void call_releaseInfo(ConstVoidPtr arg0);
	}

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setCopyInfoDescription(
			@FunctionPtr(name = "call_copyInfoDescription") Function_copyInfoDescription value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_copyInfoDescription {
		@Generated
		public VoidPtr call_copyInfoDescription(ConstVoidPtr arg0);
	}

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setReceiveEvent(
			@FunctionPtr(name = "call_receiveEvent") Function_receiveEvent value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_receiveEvent {
		@Generated
		public void call_receiveEvent(VoidPtr arg0, long arg1, VoidPtr arg2,
				VoidPtr arg3, VoidPtr arg4);
	}
}
