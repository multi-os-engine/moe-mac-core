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

package mac.foundation.struct;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.map.ObjCStringMapper;
import mac.foundation.NSHashTable;

@Generated
@Structure()
public final class NSHashTableCallBacks extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public NSHashTableCallBacks() {
		super(NSHashTableCallBacks.class);
	}

	@Generated
	protected NSHashTableCallBacks(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setHash(
			@FunctionPtr(name = "call_hash") Function_hash value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_hash {
		@Generated
		public long call_hash(NSHashTable arg0, ConstVoidPtr arg1);
	}

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setIsEqual(
			@FunctionPtr(name = "call_isEqual") Function_isEqual value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_isEqual {
		@Generated
		public byte call_isEqual(NSHashTable arg0, ConstVoidPtr arg1,
				ConstVoidPtr arg2);
	}

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setRetain(
			@FunctionPtr(name = "call_retain") Function_retain value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_retain {
		@Generated
		public void call_retain(NSHashTable arg0, ConstVoidPtr arg1);
	}

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setRelease(
			@FunctionPtr(name = "call_release") Function_release value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_release {
		@Generated
		public void call_release(NSHashTable arg0, VoidPtr arg1);
	}

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setDescribe(
			@FunctionPtr(name = "call_describe") Function_describe value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_describe {
		@Generated
		@MappedReturn(ObjCStringMapper.class)
		public String call_describe(NSHashTable arg0, ConstVoidPtr arg1);
	}
}
