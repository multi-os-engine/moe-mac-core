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
public final class PEFContainerHeader extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public PEFContainerHeader() {
		super(PEFContainerHeader.class);
	}

	@Generated
	protected PEFContainerHeader(Pointer peer) {
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
	public native int architecture();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setArchitecture(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int formatVersion();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setFormatVersion(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int dateTimeStamp();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setDateTimeStamp(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int oldDefVersion();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setOldDefVersion(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int oldImpVersion();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setOldImpVersion(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int currentVersion();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setCurrentVersion(int value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native short sectionCount();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setSectionCount(short value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native short instSectionCount();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setInstSectionCount(short value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native int reservedA();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setReservedA(int value);
}
