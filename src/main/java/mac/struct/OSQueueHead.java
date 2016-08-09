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
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure(alignment = 16)
public final class OSQueueHead extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public OSQueueHead() {
		super(OSQueueHead.class);
	}

	@Generated
	protected OSQueueHead(Pointer peer) {
		super(peer);
	}

	@Generated
	public OSQueueHead(VoidPtr opaque1, long opaque2) {
		super(OSQueueHead.class);
		setOpaque1(opaque1);
		setOpaque2(opaque2);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native VoidPtr opaque1();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setOpaque1(VoidPtr value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native long opaque2();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setOpaque2(long value);
}
