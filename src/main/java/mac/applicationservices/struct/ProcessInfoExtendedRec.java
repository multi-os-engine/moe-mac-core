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

package mac.applicationservices.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.BytePtr;
import mac.coreservices.struct.FSRef;
import mac.struct.ProcessSerialNumber;

@Generated
@Structure(alignment = 2)
public final class ProcessInfoExtendedRec extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public ProcessInfoExtendedRec() {
		super(ProcessInfoExtendedRec.class);
	}

	@Generated
	protected ProcessInfoExtendedRec(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int processInfoLength();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setProcessInfoLength(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native BytePtr processName();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setProcessName(BytePtr value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@ByValue
	public native ProcessSerialNumber processNumber();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setProcessNumber(@ByValue ProcessSerialNumber value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int processType();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setProcessType(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int processSignature();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setProcessSignature(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int processMode();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setProcessMode(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native BytePtr processLocation();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setProcessLocation(BytePtr value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int processSize();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setProcessSize(int value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native int processFreeMem();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setProcessFreeMem(int value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	@ByValue
	public native ProcessSerialNumber processLauncher();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setProcessLauncher(@ByValue ProcessSerialNumber value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native int processLaunchDate();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setProcessLaunchDate(int value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native int processActiveTime();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setProcessActiveTime(int value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native FSRef processAppRef();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setProcessAppRef(
			@UncertainArgument("Options: reference, array Fallback: reference") FSRef value);

	@Generated
	@StructureField(order = 13, isGetter = true)
	public native int processTempMemTotal();

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setProcessTempMemTotal(int value);

	@Generated
	@StructureField(order = 14, isGetter = true)
	public native int processPurgeableTempMemTotal();

	@Generated
	@StructureField(order = 14, isGetter = false)
	public native void setProcessPurgeableTempMemTotal(int value);
}
