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
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;

@Generated
@Structure(alignment = 4)
public final class kmod_reference extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public kmod_reference() {
		super(kmod_reference.class);
	}

	@Generated
	protected kmod_reference(Pointer peer) {
		super(peer);
	}

	@Generated
	public kmod_reference(
			@UncertainArgument("Options: reference, array Fallback: reference") kmod_reference next,
			@UncertainArgument("Options: reference, array Fallback: reference") kmod_info info) {
		super(kmod_reference.class);
		setNext(next);
		setInfo(info);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native kmod_reference next();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setNext(
			@UncertainArgument("Options: reference, array Fallback: reference") kmod_reference value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native kmod_info info();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setInfo(
			@UncertainArgument("Options: reference, array Fallback: reference") kmod_info value);
}
