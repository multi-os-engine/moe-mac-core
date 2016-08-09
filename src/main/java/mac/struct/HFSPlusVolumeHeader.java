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

package mac.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 2)
public final class HFSPlusVolumeHeader extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public HFSPlusVolumeHeader() {
		super(HFSPlusVolumeHeader.class);
	}

	@Generated
	protected HFSPlusVolumeHeader(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short signature();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setSignature(short value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short version();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setVersion(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int attributes();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setAttributes(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int lastMountedVersion();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setLastMountedVersion(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int journalInfoBlock();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setJournalInfoBlock(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int createDate();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setCreateDate(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int modifyDate();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setModifyDate(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int backupDate();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setBackupDate(int value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native int checkedDate();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setCheckedDate(int value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native int fileCount();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setFileCount(int value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native int folderCount();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setFolderCount(int value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native int blockSize();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setBlockSize(int value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	public native int totalBlocks();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setTotalBlocks(int value);

	@Generated
	@StructureField(order = 13, isGetter = true)
	public native int freeBlocks();

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setFreeBlocks(int value);

	@Generated
	@StructureField(order = 14, isGetter = true)
	public native int nextAllocation();

	@Generated
	@StructureField(order = 14, isGetter = false)
	public native void setNextAllocation(int value);

	@Generated
	@StructureField(order = 15, isGetter = true)
	public native int rsrcClumpSize();

	@Generated
	@StructureField(order = 15, isGetter = false)
	public native void setRsrcClumpSize(int value);

	@Generated
	@StructureField(order = 16, isGetter = true)
	public native int dataClumpSize();

	@Generated
	@StructureField(order = 16, isGetter = false)
	public native void setDataClumpSize(int value);

	@Generated
	@StructureField(order = 17, isGetter = true)
	public native int nextCatalogID();

	@Generated
	@StructureField(order = 17, isGetter = false)
	public native void setNextCatalogID(int value);

	@Generated
	@StructureField(order = 18, isGetter = true)
	public native int writeCount();

	@Generated
	@StructureField(order = 18, isGetter = false)
	public native void setWriteCount(int value);

	@Generated
	@StructureField(order = 19, isGetter = true)
	public native long encodingsBitmap();

	@Generated
	@StructureField(order = 19, isGetter = false)
	public native void setEncodingsBitmap(long value);

	@Generated
	@StructureField(order = 20, isGetter = true, count = 32)
	public native byte finderInfo(int field_idx);

	@Generated
	@StructureField(order = 20, isGetter = false, count = 32)
	public native void setFinderInfo(byte value, int field_idx);

	@Generated
	@StructureField(order = 21, isGetter = true)
	@ByValue
	public native HFSPlusForkData allocationFile();

	@Generated
	@StructureField(order = 21, isGetter = false)
	public native void setAllocationFile(@ByValue HFSPlusForkData value);

	@Generated
	@StructureField(order = 22, isGetter = true)
	@ByValue
	public native HFSPlusForkData extentsFile();

	@Generated
	@StructureField(order = 22, isGetter = false)
	public native void setExtentsFile(@ByValue HFSPlusForkData value);

	@Generated
	@StructureField(order = 23, isGetter = true)
	@ByValue
	public native HFSPlusForkData catalogFile();

	@Generated
	@StructureField(order = 23, isGetter = false)
	public native void setCatalogFile(@ByValue HFSPlusForkData value);

	@Generated
	@StructureField(order = 24, isGetter = true)
	@ByValue
	public native HFSPlusForkData attributesFile();

	@Generated
	@StructureField(order = 24, isGetter = false)
	public native void setAttributesFile(@ByValue HFSPlusForkData value);

	@Generated
	@StructureField(order = 25, isGetter = true)
	@ByValue
	public native HFSPlusForkData startupFile();

	@Generated
	@StructureField(order = 25, isGetter = false)
	public native void setStartupFile(@ByValue HFSPlusForkData value);
}
