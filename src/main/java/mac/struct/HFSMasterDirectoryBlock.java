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
public final class HFSMasterDirectoryBlock extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public HFSMasterDirectoryBlock() {
		super(HFSMasterDirectoryBlock.class);
	}

	@Generated
	protected HFSMasterDirectoryBlock(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short drSigWord();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setDrSigWord(short value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int drCrDate();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setDrCrDate(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int drLsMod();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setDrLsMod(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native short drAtrb();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setDrAtrb(short value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native short drNmFls();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setDrNmFls(short value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native short drVBMSt();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setDrVBMSt(short value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native short drAllocPtr();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setDrAllocPtr(short value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native short drNmAlBlks();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setDrNmAlBlks(short value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native int drAlBlkSiz();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setDrAlBlkSiz(int value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native int drClpSiz();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setDrClpSiz(int value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native short drAlBlSt();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setDrAlBlSt(short value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native int drNxtCNID();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setDrNxtCNID(int value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	public native short drFreeBks();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setDrFreeBks(short value);

	@Generated
	@StructureField(order = 13, isGetter = true, count = 28)
	public native byte drVN(int field_idx);

	@Generated
	@StructureField(order = 13, isGetter = false, count = 28)
	public native void setDrVN(byte value, int field_idx);

	@Generated
	@StructureField(order = 14, isGetter = true)
	public native int drVolBkUp();

	@Generated
	@StructureField(order = 14, isGetter = false)
	public native void setDrVolBkUp(int value);

	@Generated
	@StructureField(order = 15, isGetter = true)
	public native short drVSeqNum();

	@Generated
	@StructureField(order = 15, isGetter = false)
	public native void setDrVSeqNum(short value);

	@Generated
	@StructureField(order = 16, isGetter = true)
	public native int drWrCnt();

	@Generated
	@StructureField(order = 16, isGetter = false)
	public native void setDrWrCnt(int value);

	@Generated
	@StructureField(order = 17, isGetter = true)
	public native int drXTClpSiz();

	@Generated
	@StructureField(order = 17, isGetter = false)
	public native void setDrXTClpSiz(int value);

	@Generated
	@StructureField(order = 18, isGetter = true)
	public native int drCTClpSiz();

	@Generated
	@StructureField(order = 18, isGetter = false)
	public native void setDrCTClpSiz(int value);

	@Generated
	@StructureField(order = 19, isGetter = true)
	public native short drNmRtDirs();

	@Generated
	@StructureField(order = 19, isGetter = false)
	public native void setDrNmRtDirs(short value);

	@Generated
	@StructureField(order = 20, isGetter = true)
	public native int drFilCnt();

	@Generated
	@StructureField(order = 20, isGetter = false)
	public native void setDrFilCnt(int value);

	@Generated
	@StructureField(order = 21, isGetter = true)
	public native int drDirCnt();

	@Generated
	@StructureField(order = 21, isGetter = false)
	public native void setDrDirCnt(int value);

	@Generated
	@StructureField(order = 22, isGetter = true, count = 8)
	public native int drFndrInfo(int field_idx);

	@Generated
	@StructureField(order = 22, isGetter = false, count = 8)
	public native void setDrFndrInfo(int value, int field_idx);

	@Generated
	@StructureField(order = 23, isGetter = true)
	public native short drEmbedSigWord();

	@Generated
	@StructureField(order = 23, isGetter = false)
	public native void setDrEmbedSigWord(short value);

	@Generated
	@StructureField(order = 24, isGetter = true)
	@ByValue
	public native HFSExtentDescriptor drEmbedExtent();

	@Generated
	@StructureField(order = 24, isGetter = false)
	public native void setDrEmbedExtent(@ByValue HFSExtentDescriptor value);

	@Generated
	@StructureField(order = 25, isGetter = true)
	public native int drXTFlSize();

	@Generated
	@StructureField(order = 25, isGetter = false)
	public native void setDrXTFlSize(int value);

	@Generated
	@StructureField(order = 26, isGetter = true, count = 3)
	@ByValue
	public native HFSExtentDescriptor drXTExtRec(int field_idx);

	@Generated
	@StructureField(order = 26, isGetter = false, count = 3)
	public native void setDrXTExtRec(@ByValue HFSExtentDescriptor value,
			int field_idx);

	@Generated
	@StructureField(order = 27, isGetter = true)
	public native int drCTFlSize();

	@Generated
	@StructureField(order = 27, isGetter = false)
	public native void setDrCTFlSize(int value);

	@Generated
	@StructureField(order = 28, isGetter = true, count = 3)
	@ByValue
	public native HFSExtentDescriptor drCTExtRec(int field_idx);

	@Generated
	@StructureField(order = 28, isGetter = false, count = 3)
	public native void setDrCTExtRec(@ByValue HFSExtentDescriptor value,
			int field_idx);
}
