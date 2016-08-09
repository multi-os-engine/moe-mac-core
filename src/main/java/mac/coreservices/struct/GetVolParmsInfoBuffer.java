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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure(alignment = 2)
public final class GetVolParmsInfoBuffer extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public GetVolParmsInfoBuffer() {
		super(GetVolParmsInfoBuffer.class);
	}

	@Generated
	protected GetVolParmsInfoBuffer(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short vMVersion();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setVMVersion(short value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int vMAttrib();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setVMAttrib(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@ReferenceInfo(type = Byte.class, depth = 2)
	public native Ptr<BytePtr> vMLocalHand();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setVMLocalHand(Ptr<BytePtr> value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int vMServerAdr();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setVMServerAdr(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int vMVolumeGrade();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setVMVolumeGrade(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native short vMForeignPrivID();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setVMForeignPrivID(short value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int vMExtendedAttributes();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setVMExtendedAttributes(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native VoidPtr vMDeviceID();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setVMDeviceID(VoidPtr value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native long vMMaxNameLength();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setVMMaxNameLength(long value);
}
