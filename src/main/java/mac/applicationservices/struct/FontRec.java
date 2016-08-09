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
@Structure()
public final class FontRec extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public FontRec() {
		super(FontRec.class);
	}

	@Generated
	protected FontRec(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short fontType();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setFontType(short value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short firstChar();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setFirstChar(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short lastChar();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setLastChar(short value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native short widMax();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setWidMax(short value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native short kernMax();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setKernMax(short value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native short nDescent();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setNDescent(short value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native short fRectWidth();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setFRectWidth(short value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native short fRectHeight();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setFRectHeight(short value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native short owTLoc();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setOwTLoc(short value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native short ascent();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setAscent(short value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native short descent();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setDescent(short value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native short leading();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setLeading(short value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	public native short rowWords();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setRowWords(short value);
}
