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

package mac.security.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class cssm_tp_certchange_input extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_tp_certchange_input() {
		super(cssm_tp_certchange_input.class);
	}

	@Generated
	protected cssm_tp_certchange_input(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int Action();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setAction(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int Reason();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setReason(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native long CLHandle();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setCLHandle(long value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native cssm_data Cert();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setCert(
			@UncertainArgument("Options: reference, array Fallback: reference") cssm_data value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native cssm_field ChangeInfo();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setChangeInfo(
			@UncertainArgument("Options: reference, array Fallback: reference") cssm_field value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native BytePtr StartTime();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setStartTime(BytePtr value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native VoidPtr CallerCredentials();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setCallerCredentials(VoidPtr value);
}
