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

@Generated
@Structure()
public final class SecAsn1Template_struct extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public SecAsn1Template_struct() {
		super(SecAsn1Template_struct.class);
	}

	@Generated
	protected SecAsn1Template_struct(Pointer peer) {
		super(peer);
	}

	@Generated
	public SecAsn1Template_struct(int kind, int offset, ConstVoidPtr sub,
			int size) {
		super(SecAsn1Template_struct.class);
		setKind(kind);
		setOffset(offset);
		setSub(sub);
		setSize(size);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int kind();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setKind(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int offset();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setOffset(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native ConstVoidPtr sub();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setSub(ConstVoidPtr value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int size();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setSize(int value);
}
