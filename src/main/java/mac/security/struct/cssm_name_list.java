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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.Ptr;

@Generated
@Structure()
public final class cssm_name_list extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_name_list() {
		super(cssm_name_list.class);
	}

	@Generated
	protected cssm_name_list(Pointer peer) {
		super(peer);
	}

	@Generated
	public cssm_name_list(int NumStrings, Ptr<BytePtr> String) {
		super(cssm_name_list.class);
		setNumStrings(NumStrings);
		setString(String);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int NumStrings();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setNumStrings(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@ReferenceInfo(type = Byte.class, depth = 2)
	public native Ptr<BytePtr> String();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setString(Ptr<BytePtr> value);
}
