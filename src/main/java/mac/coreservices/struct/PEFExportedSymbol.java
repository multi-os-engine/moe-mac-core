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
@Structure(alignment = 2)
public final class PEFExportedSymbol extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public PEFExportedSymbol() {
		super(PEFExportedSymbol.class);
	}

	@Generated
	protected PEFExportedSymbol(Pointer peer) {
		super(peer);
	}

	@Generated
	public PEFExportedSymbol(int classAndName, int symbolValue,
			short sectionIndex) {
		super(PEFExportedSymbol.class);
		setClassAndName(classAndName);
		setSymbolValue(symbolValue);
		setSectionIndex(sectionIndex);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int classAndName();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setClassAndName(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int symbolValue();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setSymbolValue(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short sectionIndex();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setSectionIndex(short value);
}
