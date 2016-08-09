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
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class x509_validity extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public x509_validity() {
		super(x509_validity.class);
	}

	@Generated
	protected x509_validity(Pointer peer) {
		super(peer);
	}

	@Generated
	public x509_validity(@ByValue cssm_x509_time notBefore,
			@ByValue cssm_x509_time notAfter) {
		super(x509_validity.class);
		setNotBefore(notBefore);
		setNotAfter(notAfter);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native cssm_x509_time notBefore();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setNotBefore(@ByValue cssm_x509_time value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@ByValue
	public native cssm_x509_time notAfter();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setNotAfter(@ByValue cssm_x509_time value);
}
