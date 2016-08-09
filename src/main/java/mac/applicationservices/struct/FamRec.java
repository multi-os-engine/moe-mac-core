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

package mac.applicationservices.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 2)
public final class FamRec extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public FamRec() {
		super(FamRec.class);
	}

	@Generated
	protected FamRec(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short ffFlags();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setFfFlags(short value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short ffFamID();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setFfFamID(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short ffFirstChar();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setFfFirstChar(short value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native short ffLastChar();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setFfLastChar(short value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native short ffAscent();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setFfAscent(short value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native short ffDescent();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setFfDescent(short value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native short ffLeading();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setFfLeading(short value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native short ffWidMax();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setFfWidMax(short value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native int ffWTabOff();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setFfWTabOff(int value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native int ffKernOff();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setFfKernOff(int value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native int ffStylOff();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setFfStylOff(int value);

	@Generated
	@StructureField(order = 11, isGetter = true, count = 9)
	public native short ffProperty(int field_idx);

	@Generated
	@StructureField(order = 11, isGetter = false, count = 9)
	public native void setFfProperty(short value, int field_idx);

	@Generated
	@StructureField(order = 12, isGetter = true, count = 2)
	public native short ffIntl(int field_idx);

	@Generated
	@StructureField(order = 12, isGetter = false, count = 2)
	public native void setFfIntl(short value, int field_idx);

	@Generated
	@StructureField(order = 13, isGetter = true)
	public native short ffVersion();

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setFfVersion(short value);
}
