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
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class AuthorizationItem extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public AuthorizationItem() {
		super(AuthorizationItem.class);
	}

	@Generated
	protected AuthorizationItem(Pointer peer) {
		super(peer);
	}

	@Generated
	public AuthorizationItem(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
			long valueLength, VoidPtr value, int flags) {
		super(AuthorizationItem.class);
		setName(name);
		setValueLength(valueLength);
		setValue(value);
		setFlags(flags);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public native String name();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setName(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native long valueLength();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setValueLength(long value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native VoidPtr value();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setValue(VoidPtr value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int flags();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setFlags(int value);
}
