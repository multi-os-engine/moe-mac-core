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
import org.moe.natj.general.ptr.VoidPtr;
import mac.coreservices.struct.FSRef;
import mac.struct.ProcessSerialNumber;

@Generated
@Structure(alignment = 2)
public final class LaunchParamBlockRec extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public LaunchParamBlockRec() {
		super(LaunchParamBlockRec.class);
	}

	@Generated
	protected LaunchParamBlockRec(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int reserved1();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setReserved1(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short reserved2();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setReserved2(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short launchBlockID();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setLaunchBlockID(short value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int launchEPBLength();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setLaunchEPBLength(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native short launchFileFlags();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setLaunchFileFlags(short value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native short launchControlFlags();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setLaunchControlFlags(short value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native FSRef launchAppRef();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setLaunchAppRef(
			@UncertainArgument("Options: reference, array Fallback: reference") FSRef value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	@ByValue
	public native ProcessSerialNumber launchProcessSN();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setLaunchProcessSN(@ByValue ProcessSerialNumber value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native int launchPreferredSize();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setLaunchPreferredSize(int value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native int launchMinimumSize();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setLaunchMinimumSize(int value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native int launchAvailableSize();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setLaunchAvailableSize(int value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native VoidPtr launchAppParameters();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setLaunchAppParameters(VoidPtr value);
}
