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
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.VoidPtr;
import mac.corefoundation.opaque.CFArrayRef;
import mac.corefoundation.opaque.CFDictionaryRef;

@Generated
@Structure(alignment = 2)
public final class LSApplicationParameters extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public LSApplicationParameters() {
		super(LSApplicationParameters.class);
	}

	@Generated
	protected LSApplicationParameters(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native long version();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setVersion(long value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int flags();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setFlags(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native FSRef application();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setApplication(
			@UncertainArgument("Options: reference, array Fallback: reference") FSRef value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native VoidPtr asyncLaunchRefCon();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setAsyncLaunchRefCon(VoidPtr value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native CFDictionaryRef environment();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setEnvironment(CFDictionaryRef value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native CFArrayRef argv();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setArgv(CFArrayRef value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native AEDesc initialEvent();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setInitialEvent(
			@UncertainArgument("Options: reference, array Fallback: reference") AEDesc value);
}
