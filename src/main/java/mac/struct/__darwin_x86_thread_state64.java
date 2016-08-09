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
public final class __darwin_x86_thread_state64 extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public __darwin_x86_thread_state64() {
		super(__darwin_x86_thread_state64.class);
	}

	@Generated
	protected __darwin_x86_thread_state64(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native long __rax();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void set__rax(long value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native long __rbx();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void set__rbx(long value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native long __rcx();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void set__rcx(long value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native long __rdx();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void set__rdx(long value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native long __rdi();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void set__rdi(long value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native long __rsi();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void set__rsi(long value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native long __rbp();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void set__rbp(long value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native long __rsp();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void set__rsp(long value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native long __r8();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void set__r8(long value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native long __r9();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void set__r9(long value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native long __r10();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void set__r10(long value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native long __r11();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void set__r11(long value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	public native long __r12();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void set__r12(long value);

	@Generated
	@StructureField(order = 13, isGetter = true)
	public native long __r13();

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void set__r13(long value);

	@Generated
	@StructureField(order = 14, isGetter = true)
	public native long __r14();

	@Generated
	@StructureField(order = 14, isGetter = false)
	public native void set__r14(long value);

	@Generated
	@StructureField(order = 15, isGetter = true)
	public native long __r15();

	@Generated
	@StructureField(order = 15, isGetter = false)
	public native void set__r15(long value);

	@Generated
	@StructureField(order = 16, isGetter = true)
	public native long __rip();

	@Generated
	@StructureField(order = 16, isGetter = false)
	public native void set__rip(long value);

	@Generated
	@StructureField(order = 17, isGetter = true)
	public native long __rflags();

	@Generated
	@StructureField(order = 17, isGetter = false)
	public native void set__rflags(long value);

	@Generated
	@StructureField(order = 18, isGetter = true)
	public native long __cs();

	@Generated
	@StructureField(order = 18, isGetter = false)
	public native void set__cs(long value);

	@Generated
	@StructureField(order = 19, isGetter = true)
	public native long __fs();

	@Generated
	@StructureField(order = 19, isGetter = false)
	public native void set__fs(long value);

	@Generated
	@StructureField(order = 20, isGetter = true)
	public native long __gs();

	@Generated
	@StructureField(order = 20, isGetter = false)
	public native void set__gs(long value);
}
