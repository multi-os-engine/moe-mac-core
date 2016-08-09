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

package mac.corefoundation.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import mac.corefoundation.opaque.CFArrayRef;
import mac.corefoundation.opaque.CFDictionaryRef;

@Generated
@Structure()
public final class CFXMLElementInfo extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CFXMLElementInfo() {
		super(CFXMLElementInfo.class);
	}

	@Generated
	protected CFXMLElementInfo(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native CFDictionaryRef attributes();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setAttributes(CFDictionaryRef value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native CFArrayRef attributeOrder();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setAttributeOrder(CFArrayRef value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native byte isEmpty();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setIsEmpty(byte value);

	@Generated
	@StructureField(order = 3, isGetter = true, count = 3)
	public native byte _reserved(int field_idx);

	@Generated
	@StructureField(order = 3, isGetter = false, count = 3)
	public native void set_reserved(byte value, int field_idx);
}
