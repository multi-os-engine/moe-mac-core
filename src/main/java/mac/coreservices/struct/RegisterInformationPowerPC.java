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
import mac.struct.UnsignedWide;

@Generated
@Structure()
public final class RegisterInformationPowerPC extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public RegisterInformationPowerPC() {
		super(RegisterInformationPowerPC.class);
	}

	@Generated
	protected RegisterInformationPowerPC(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native UnsignedWide R0();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setR0(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@ByValue
	public native UnsignedWide R1();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setR1(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@ByValue
	public native UnsignedWide R2();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setR2(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	@ByValue
	public native UnsignedWide R3();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setR3(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	@ByValue
	public native UnsignedWide R4();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setR4(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	@ByValue
	public native UnsignedWide R5();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setR5(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	@ByValue
	public native UnsignedWide R6();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setR6(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	@ByValue
	public native UnsignedWide R7();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setR7(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	@ByValue
	public native UnsignedWide R8();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setR8(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	@ByValue
	public native UnsignedWide R9();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setR9(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	@ByValue
	public native UnsignedWide R10();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setR10(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	@ByValue
	public native UnsignedWide R11();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setR11(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	@ByValue
	public native UnsignedWide R12();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setR12(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 13, isGetter = true)
	@ByValue
	public native UnsignedWide R13();

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setR13(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 14, isGetter = true)
	@ByValue
	public native UnsignedWide R14();

	@Generated
	@StructureField(order = 14, isGetter = false)
	public native void setR14(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 15, isGetter = true)
	@ByValue
	public native UnsignedWide R15();

	@Generated
	@StructureField(order = 15, isGetter = false)
	public native void setR15(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 16, isGetter = true)
	@ByValue
	public native UnsignedWide R16();

	@Generated
	@StructureField(order = 16, isGetter = false)
	public native void setR16(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 17, isGetter = true)
	@ByValue
	public native UnsignedWide R17();

	@Generated
	@StructureField(order = 17, isGetter = false)
	public native void setR17(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 18, isGetter = true)
	@ByValue
	public native UnsignedWide R18();

	@Generated
	@StructureField(order = 18, isGetter = false)
	public native void setR18(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 19, isGetter = true)
	@ByValue
	public native UnsignedWide R19();

	@Generated
	@StructureField(order = 19, isGetter = false)
	public native void setR19(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 20, isGetter = true)
	@ByValue
	public native UnsignedWide R20();

	@Generated
	@StructureField(order = 20, isGetter = false)
	public native void setR20(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 21, isGetter = true)
	@ByValue
	public native UnsignedWide R21();

	@Generated
	@StructureField(order = 21, isGetter = false)
	public native void setR21(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 22, isGetter = true)
	@ByValue
	public native UnsignedWide R22();

	@Generated
	@StructureField(order = 22, isGetter = false)
	public native void setR22(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 23, isGetter = true)
	@ByValue
	public native UnsignedWide R23();

	@Generated
	@StructureField(order = 23, isGetter = false)
	public native void setR23(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 24, isGetter = true)
	@ByValue
	public native UnsignedWide R24();

	@Generated
	@StructureField(order = 24, isGetter = false)
	public native void setR24(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 25, isGetter = true)
	@ByValue
	public native UnsignedWide R25();

	@Generated
	@StructureField(order = 25, isGetter = false)
	public native void setR25(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 26, isGetter = true)
	@ByValue
	public native UnsignedWide R26();

	@Generated
	@StructureField(order = 26, isGetter = false)
	public native void setR26(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 27, isGetter = true)
	@ByValue
	public native UnsignedWide R27();

	@Generated
	@StructureField(order = 27, isGetter = false)
	public native void setR27(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 28, isGetter = true)
	@ByValue
	public native UnsignedWide R28();

	@Generated
	@StructureField(order = 28, isGetter = false)
	public native void setR28(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 29, isGetter = true)
	@ByValue
	public native UnsignedWide R29();

	@Generated
	@StructureField(order = 29, isGetter = false)
	public native void setR29(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 30, isGetter = true)
	@ByValue
	public native UnsignedWide R30();

	@Generated
	@StructureField(order = 30, isGetter = false)
	public native void setR30(@ByValue UnsignedWide value);

	@Generated
	@StructureField(order = 31, isGetter = true)
	@ByValue
	public native UnsignedWide R31();

	@Generated
	@StructureField(order = 31, isGetter = false)
	public native void setR31(@ByValue UnsignedWide value);
}
