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
public final class PEFLoaderInfoHeader extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public PEFLoaderInfoHeader() {
		super(PEFLoaderInfoHeader.class);
	}

	@Generated
	protected PEFLoaderInfoHeader(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int mainSection();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setMainSection(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int mainOffset();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setMainOffset(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int initSection();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setInitSection(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int initOffset();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setInitOffset(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int termSection();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setTermSection(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int termOffset();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setTermOffset(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int importedLibraryCount();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setImportedLibraryCount(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int totalImportedSymbolCount();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setTotalImportedSymbolCount(int value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native int relocSectionCount();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setRelocSectionCount(int value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native int relocInstrOffset();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setRelocInstrOffset(int value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native int loaderStringsOffset();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setLoaderStringsOffset(int value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native int exportHashOffset();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setExportHashOffset(int value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	public native int exportHashTablePower();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setExportHashTablePower(int value);

	@Generated
	@StructureField(order = 13, isGetter = true)
	public native int exportedSymbolCount();

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setExportedSymbolCount(int value);
}
