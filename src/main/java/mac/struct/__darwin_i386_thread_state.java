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


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class __darwin_i386_thread_state extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public __darwin_i386_thread_state() {
		super(__darwin_i386_thread_state.class);
	}

	@Generated
	protected __darwin_i386_thread_state(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int __eax();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void set__eax(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int __ebx();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void set__ebx(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int __ecx();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void set__ecx(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int __edx();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void set__edx(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int __edi();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void set__edi(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int __esi();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void set__esi(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int __ebp();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void set__ebp(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int __esp();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void set__esp(int value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native int __ss();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void set__ss(int value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native int __eflags();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void set__eflags(int value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native int __eip();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void set__eip(int value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native int __cs();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void set__cs(int value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	public native int __ds();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void set__ds(int value);

	@Generated
	@StructureField(order = 13, isGetter = true)
	public native int __es();

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void set__es(int value);

	@Generated
	@StructureField(order = 14, isGetter = true)
	public native int __fs();

	@Generated
	@StructureField(order = 14, isGetter = false)
	public native void set__fs(int value);

	@Generated
	@StructureField(order = 15, isGetter = true)
	public native int __gs();

	@Generated
	@StructureField(order = 15, isGetter = false)
	public native void set__gs(int value);
}
