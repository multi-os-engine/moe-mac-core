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

@Generated
@Structure()
public final class decform extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public decform() {
		super(decform.class);
	}

	@Generated
	protected decform(Pointer peer) {
		super(peer);
	}

	@Generated
	public decform(byte style, byte unused, short digits) {
		super(decform.class);
		setStyle(style);
		setUnused(unused);
		setDigits(digits);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native byte style();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setStyle(byte value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native byte unused();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setUnused(byte value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short digits();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setDigits(short value);
}
