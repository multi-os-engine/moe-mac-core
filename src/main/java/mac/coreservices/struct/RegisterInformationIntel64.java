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
@Structure()
public final class RegisterInformationIntel64 extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public RegisterInformationIntel64() {
		super(RegisterInformationIntel64.class);
	}

	@Generated
	protected RegisterInformationIntel64(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native long RAX();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setRAX(long value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native long RBX();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setRBX(long value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native long RCX();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setRCX(long value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native long RDX();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setRDX(long value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native long RDI();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setRDI(long value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native long RSI();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setRSI(long value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native long RBP();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setRBP(long value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native long RSP();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setRSP(long value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native long R8();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setR8(long value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native long R9();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setR9(long value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native long R10();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setR10(long value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native long R11();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setR11(long value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	public native long R12();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setR12(long value);

	@Generated
	@StructureField(order = 13, isGetter = true)
	public native long R13();

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setR13(long value);

	@Generated
	@StructureField(order = 14, isGetter = true)
	public native long R14();

	@Generated
	@StructureField(order = 14, isGetter = false)
	public native void setR14(long value);

	@Generated
	@StructureField(order = 15, isGetter = true)
	public native long R15();

	@Generated
	@StructureField(order = 15, isGetter = false)
	public native void setR15(long value);
}
