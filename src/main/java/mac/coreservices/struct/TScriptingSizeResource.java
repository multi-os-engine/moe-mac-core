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
@Structure(alignment = 2)
public final class TScriptingSizeResource extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public TScriptingSizeResource() {
		super(TScriptingSizeResource.class);
	}

	@Generated
	protected TScriptingSizeResource(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short scriptingSizeFlags();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setScriptingSizeFlags(short value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int minStackSize();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setMinStackSize(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int preferredStackSize();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setPreferredStackSize(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int maxStackSize();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setMaxStackSize(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int minHeapSize();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setMinHeapSize(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int preferredHeapSize();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setPreferredHeapSize(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int maxHeapSize();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setMaxHeapSize(int value);
}
