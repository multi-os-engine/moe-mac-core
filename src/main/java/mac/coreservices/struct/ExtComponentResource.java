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
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 2)
public final class ExtComponentResource extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public ExtComponentResource() {
		super(ExtComponentResource.class);
	}

	@Generated
	protected ExtComponentResource(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native ComponentDescription cd();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setCd(@ByValue ComponentDescription value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@ByValue
	public native ResourceSpec component();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setComponent(@ByValue ResourceSpec value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@ByValue
	public native ResourceSpec componentName();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setComponentName(@ByValue ResourceSpec value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	@ByValue
	public native ResourceSpec componentInfo();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setComponentInfo(@ByValue ResourceSpec value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	@ByValue
	public native ResourceSpec componentIcon();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setComponentIcon(@ByValue ResourceSpec value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int componentVersion();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setComponentVersion(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int componentRegisterFlags();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setComponentRegisterFlags(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native short componentIconFamily();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setComponentIconFamily(short value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native int count();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setCount(int value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	@ByValue
	public native ComponentPlatformInfo platformArray();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setPlatformArray(@ByValue ComponentPlatformInfo value);
}
