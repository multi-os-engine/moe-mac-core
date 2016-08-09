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
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import mac.corefoundation.opaque.CFStringRef;

@Generated
@Structure()
public final class CFXMLEntityInfo extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CFXMLEntityInfo() {
		super(CFXMLEntityInfo.class);
	}

	@Generated
	protected CFXMLEntityInfo(Pointer peer) {
		super(peer);
	}

	@Generated
	public CFXMLEntityInfo(long entityType, CFStringRef replacementText,
			@ByValue CFXMLExternalID entityID, CFStringRef notationName) {
		super(CFXMLEntityInfo.class);
		setEntityType(entityType);
		setReplacementText(replacementText);
		setEntityID(entityID);
		setNotationName(notationName);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native long entityType();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setEntityType(long value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native CFStringRef replacementText();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setReplacementText(CFStringRef value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@ByValue
	public native CFXMLExternalID entityID();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setEntityID(@ByValue CFXMLExternalID value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native CFStringRef notationName();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setNotationName(CFStringRef value);
}
