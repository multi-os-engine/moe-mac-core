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
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class CE_CRLDistributionPoint extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CE_CRLDistributionPoint() {
		super(CE_CRLDistributionPoint.class);
	}

	@Generated
	protected CE_CRLDistributionPoint(Pointer peer) {
		super(peer);
	}

	@Generated
	public CE_CRLDistributionPoint(
			VoidPtr distPointName,
			int reasonsPresent,
			byte reasons,
			@UncertainArgument("Options: reference, array Fallback: reference") CE_GeneralNames crlIssuer) {
		super(CE_CRLDistributionPoint.class);
		setDistPointName(distPointName);
		setReasonsPresent(reasonsPresent);
		setReasons(reasons);
		setCrlIssuer(crlIssuer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native VoidPtr distPointName();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setDistPointName(VoidPtr value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int reasonsPresent();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setReasonsPresent(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native byte reasons();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setReasons(byte value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native CE_GeneralNames crlIssuer();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setCrlIssuer(
			@UncertainArgument("Options: reference, array Fallback: reference") CE_GeneralNames value);
}
