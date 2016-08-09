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

package mac.struct;


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
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure(alignment = 4)
public final class kmod_info extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public kmod_info() {
		super(kmod_info.class);
	}

	@Generated
	protected kmod_info(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native kmod_info next();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setNext(
			@UncertainArgument("Options: reference, array Fallback: reference") kmod_info value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int info_version();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setInfo_version(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int id();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setId(int value);

	@Generated
	@StructureField(order = 3, isGetter = true, count = 64)
	public native byte name(int field_idx);

	@Generated
	@StructureField(order = 3, isGetter = false, count = 64)
	public native void setName(byte value, int field_idx);

	@Generated
	@StructureField(order = 4, isGetter = true, count = 64)
	public native byte version(int field_idx);

	@Generated
	@StructureField(order = 4, isGetter = false, count = 64)
	public native void setVersion(byte value, int field_idx);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int reference_count();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setReference_count(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native kmod_reference reference_list();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setReference_list(
			@UncertainArgument("Options: reference, array Fallback: reference") kmod_reference value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native long address();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setAddress(long value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native long size();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setSize(long value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native long hdr_size();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setHdr_size(long value);

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setStart(
			@FunctionPtr(name = "call_start") Function_start value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_start {
		@Generated
		public int call_start(
				@UncertainArgument("Options: reference, array Fallback: reference") kmod_info arg0,
				VoidPtr arg1);
	}

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setStop(
			@FunctionPtr(name = "call_stop") Function_stop value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_stop {
		@Generated
		public int call_stop(
				@UncertainArgument("Options: reference, array Fallback: reference") kmod_info arg0,
				VoidPtr arg1);
	}
}
