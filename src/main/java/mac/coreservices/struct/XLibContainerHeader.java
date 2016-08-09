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
public final class XLibContainerHeader extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public XLibContainerHeader() {
		super(XLibContainerHeader.class);
	}

	@Generated
	protected XLibContainerHeader(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int tag1();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setTag1(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int tag2();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setTag2(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int currentFormat();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setCurrentFormat(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int containerStringsOffset();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setContainerStringsOffset(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int exportHashOffset();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setExportHashOffset(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int exportKeyOffset();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setExportKeyOffset(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int exportSymbolOffset();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setExportSymbolOffset(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int exportNamesOffset();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setExportNamesOffset(int value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native int exportHashTablePower();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setExportHashTablePower(int value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native int exportedSymbolCount();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setExportedSymbolCount(int value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native int fragNameOffset();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setFragNameOffset(int value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native int fragNameLength();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setFragNameLength(int value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	public native int dylibPathOffset();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setDylibPathOffset(int value);

	@Generated
	@StructureField(order = 13, isGetter = true)
	public native int dylibPathLength();

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setDylibPathLength(int value);

	@Generated
	@StructureField(order = 14, isGetter = true)
	public native int cpuFamily();

	@Generated
	@StructureField(order = 14, isGetter = false)
	public native void setCpuFamily(int value);

	@Generated
	@StructureField(order = 15, isGetter = true)
	public native int cpuModel();

	@Generated
	@StructureField(order = 15, isGetter = false)
	public native void setCpuModel(int value);

	@Generated
	@StructureField(order = 16, isGetter = true)
	public native int dateTimeStamp();

	@Generated
	@StructureField(order = 16, isGetter = false)
	public native void setDateTimeStamp(int value);

	@Generated
	@StructureField(order = 17, isGetter = true)
	public native int currentVersion();

	@Generated
	@StructureField(order = 17, isGetter = false)
	public native void setCurrentVersion(int value);

	@Generated
	@StructureField(order = 18, isGetter = true)
	public native int oldDefVersion();

	@Generated
	@StructureField(order = 18, isGetter = false)
	public native void setOldDefVersion(int value);

	@Generated
	@StructureField(order = 19, isGetter = true)
	public native int oldImpVersion();

	@Generated
	@StructureField(order = 19, isGetter = false)
	public native void setOldImpVersion(int value);
}
