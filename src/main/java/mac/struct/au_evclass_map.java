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
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class au_evclass_map extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public au_evclass_map() {
		super(au_evclass_map.class);
	}

	@Generated
	protected au_evclass_map(Pointer peer) {
		super(peer);
	}

	@Generated
	public au_evclass_map(short ec_number, int ec_class) {
		super(au_evclass_map.class);
		setEc_number(ec_number);
		setEc_class(ec_class);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short ec_number();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setEc_number(short value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int ec_class();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setEc_class(int value);
}
