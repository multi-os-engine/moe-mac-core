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
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class cssm_context extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_context() {
		super(cssm_context.class);
	}

	@Generated
	protected cssm_context(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int ContextType();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setContextType(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int AlgorithmType();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setAlgorithmType(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int NumberOfAttributes();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setNumberOfAttributes(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native VoidPtr ContextAttributes();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setContextAttributes(VoidPtr value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native long CSPHandle();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setCSPHandle(long value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int Privileged();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setPrivileged(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int EncryptionProhibited();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setEncryptionProhibited(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int WorkFactor();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setWorkFactor(int value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native int Reserved();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setReserved(int value);
}
