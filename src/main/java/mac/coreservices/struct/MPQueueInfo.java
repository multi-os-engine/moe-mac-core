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


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.VoidPtr;
import mac.coreservices.opaque.MPProcessID;
import mac.coreservices.opaque.MPTaskID;

@Generated
@Structure()
public final class MPQueueInfo extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public MPQueueInfo() {
		super(MPQueueInfo.class);
	}

	@Generated
	protected MPQueueInfo(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int version();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setVersion(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native MPProcessID processID();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setProcessID(MPProcessID value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int queueName();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setQueueName(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native long nWaiting();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setNWaiting(long value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native MPTaskID waitingTaskID();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setWaitingTaskID(MPTaskID value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native long nMessages();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setNMessages(long value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native long nReserved();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setNReserved(long value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native VoidPtr p1();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setP1(VoidPtr value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native VoidPtr p2();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setP2(VoidPtr value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native VoidPtr p3();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setP3(VoidPtr value);
}
