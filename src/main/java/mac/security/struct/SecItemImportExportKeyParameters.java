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
import org.moe.natj.general.ptr.ConstVoidPtr;
import mac.corefoundation.opaque.CFArrayRef;
import mac.corefoundation.opaque.CFStringRef;
import mac.security.opaque.SecAccessRef;

@Generated
@Structure()
public final class SecItemImportExportKeyParameters extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public SecItemImportExportKeyParameters() {
		super(SecItemImportExportKeyParameters.class);
	}

	@Generated
	protected SecItemImportExportKeyParameters(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int version();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setVersion(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int flags();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setFlags(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native ConstVoidPtr passphrase();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setPassphrase(ConstVoidPtr value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native CFStringRef alertTitle();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setAlertTitle(CFStringRef value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native CFStringRef alertPrompt();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setAlertPrompt(CFStringRef value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native SecAccessRef accessRef();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setAccessRef(SecAccessRef value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native CFArrayRef keyUsage();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setKeyUsage(CFArrayRef value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native CFArrayRef keyAttributes();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setKeyAttributes(CFArrayRef value);
}
