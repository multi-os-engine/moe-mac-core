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

package mac.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;

@Generated
@Structure()
public final class au_session extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public au_session() {
		super(au_session.class);
	}

	@Generated
	protected au_session(Pointer peer) {
		super(peer);
	}

	@Generated
	public au_session(
			@UncertainArgument("Options: reference, array Fallback: reference") auditinfo_addr as_aia_p,
			@ByValue au_mask as_mask) {
		super(au_session.class);
		setAs_aia_p(as_aia_p);
		setAs_mask(as_mask);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native auditinfo_addr as_aia_p();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setAs_aia_p(
			@UncertainArgument("Options: reference, array Fallback: reference") auditinfo_addr value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@ByValue
	public native au_mask as_mask();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setAs_mask(@ByValue au_mask value);
}
