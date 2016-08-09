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
import mac.corefoundation.opaque.CFURLRef;

@Generated
@Structure(alignment = 2)
public final class LSLaunchURLSpec extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public LSLaunchURLSpec() {
		super(LSLaunchURLSpec.class);
	}

	@Generated
	protected LSLaunchURLSpec(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native CFURLRef appURL();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setAppURL(CFURLRef value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native CFArrayRef itemURLs();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setItemURLs(CFArrayRef value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native AEDesc passThruParams();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setPassThruParams(
			@UncertainArgument("Options: reference, array Fallback: reference") AEDesc value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int launchFlags();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setLaunchFlags(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native VoidPtr asyncRefCon();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setAsyncRefCon(VoidPtr value);
}
