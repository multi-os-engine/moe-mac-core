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
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.ConstCharPtr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure(alignment = 2)
public final class FSRefForkIOParam extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public FSRefForkIOParam() {
		super(FSRefForkIOParam.class);
	}

	@Generated
	protected FSRefForkIOParam(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native QElem qLink();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setQLink(
			@UncertainArgument("Options: reference, array Fallback: reference") QElem value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short qType();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setQType(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short ioTrap();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setIoTrap(short value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native BytePtr ioCmdAddr();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setIoCmdAddr(BytePtr value);

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setIoCompletion(
			@FunctionPtr(name = "call_ioCompletion") Function_ioCompletion value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_ioCompletion {
		@Generated
		public void call_ioCompletion(VoidPtr arg0);
	}

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native short ioResult();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setIoResult(short value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native FSRef parentRef();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setParentRef(
			@UncertainArgument("Options: reference, array Fallback: reference") FSRef value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native long nameLength();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setNameLength(long value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native ConstCharPtr name();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setName(ConstCharPtr value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native int whichInfo();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setWhichInfo(int value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native FSCatalogInfo catInfo();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setCatInfo(
			@UncertainArgument("Options: reference, array Fallback: reference") FSCatalogInfo value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native long forkNameLength();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setForkNameLength(long value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	public native ConstCharPtr forkName();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setForkName(ConstCharPtr value);

	@Generated
	@StructureField(order = 13, isGetter = true)
	public native byte permissions();

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setPermissions(byte value);

	@Generated
	@StructureField(order = 14, isGetter = true)
	public native byte reserved1();

	@Generated
	@StructureField(order = 14, isGetter = false)
	public native void setReserved1(byte value);

	@Generated
	@StructureField(order = 15, isGetter = true)
	public native int forkRefNum();

	@Generated
	@StructureField(order = 15, isGetter = false)
	public native void setForkRefNum(int value);

	@Generated
	@StructureField(order = 16, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native FSRef newRef();

	@Generated
	@StructureField(order = 16, isGetter = false)
	public native void setNewRef(
			@UncertainArgument("Options: reference, array Fallback: reference") FSRef value);
}
