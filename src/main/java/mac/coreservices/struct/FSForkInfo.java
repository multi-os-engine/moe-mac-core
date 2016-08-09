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

@Generated
@Structure(alignment = 2)
public final class FSForkInfo extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public FSForkInfo() {
		super(FSForkInfo.class);
	}

	@Generated
	protected FSForkInfo(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native byte flags();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setFlags(byte value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native byte permissions();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setPermissions(byte value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short volume();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setVolume(short value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int reserved2();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setReserved2(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int nodeID();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setNodeID(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int forkID();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setForkID(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native long currentPosition();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setCurrentPosition(long value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native long logicalEOF();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setLogicalEOF(long value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native long physicalEOF();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setPhysicalEOF(long value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native long process();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setProcess(long value);
}
