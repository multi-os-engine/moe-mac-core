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
import mac.coreservices.opaque.AreaID;

@Generated
@Structure()
public final class MemoryExceptionInformation extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public MemoryExceptionInformation() {
		super(MemoryExceptionInformation.class);
	}

	@Generated
	protected MemoryExceptionInformation(Pointer peer) {
		super(peer);
	}

	@Generated
	public MemoryExceptionInformation(AreaID theArea, VoidPtr theAddress,
			int theError, long theReference) {
		super(MemoryExceptionInformation.class);
		setTheArea(theArea);
		setTheAddress(theAddress);
		setTheError(theError);
		setTheReference(theReference);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native AreaID theArea();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setTheArea(AreaID value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native VoidPtr theAddress();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setTheAddress(VoidPtr value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int theError();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setTheError(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native long theReference();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setTheReference(long value);
}
