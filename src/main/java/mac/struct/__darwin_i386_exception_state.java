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
public final class __darwin_i386_exception_state extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public __darwin_i386_exception_state() {
		super(__darwin_i386_exception_state.class);
	}

	@Generated
	protected __darwin_i386_exception_state(Pointer peer) {
		super(peer);
	}

	@Generated
	public __darwin_i386_exception_state(short __trapno, short __cpu,
			int __err, int __faultvaddr) {
		super(__darwin_i386_exception_state.class);
		set__trapno(__trapno);
		set__cpu(__cpu);
		set__err(__err);
		set__faultvaddr(__faultvaddr);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short __trapno();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void set__trapno(short value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short __cpu();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void set__cpu(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int __err();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void set__err(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int __faultvaddr();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void set__faultvaddr(int value);
}
