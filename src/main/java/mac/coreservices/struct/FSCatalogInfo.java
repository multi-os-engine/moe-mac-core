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

@Generated
@Structure(alignment = 2)
public final class FSCatalogInfo extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public FSCatalogInfo() {
		super(FSCatalogInfo.class);
	}

	@Generated
	protected FSCatalogInfo(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short nodeFlags();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setNodeFlags(short value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short volume();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setVolume(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int parentDirID();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setParentDirID(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int nodeID();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setNodeID(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native byte sharingFlags();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setSharingFlags(byte value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native byte userPrivileges();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setUserPrivileges(byte value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native byte reserved1();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setReserved1(byte value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native byte reserved2();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setReserved2(byte value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	@ByValue
	public native UTCDateTime createDate();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setCreateDate(@ByValue UTCDateTime value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	@ByValue
	public native UTCDateTime contentModDate();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setContentModDate(@ByValue UTCDateTime value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	@ByValue
	public native UTCDateTime attributeModDate();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setAttributeModDate(@ByValue UTCDateTime value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	@ByValue
	public native UTCDateTime accessDate();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setAccessDate(@ByValue UTCDateTime value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	@ByValue
	public native UTCDateTime backupDate();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setBackupDate(@ByValue UTCDateTime value);

	@Generated
	@StructureField(order = 13, isGetter = true)
	@ByValue
	public native FSPermissionInfo permissions();

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setPermissions(@ByValue FSPermissionInfo value);

	@Generated
	@StructureField(order = 14, isGetter = true, count = 16)
	public native byte finderInfo(int field_idx);

	@Generated
	@StructureField(order = 14, isGetter = false, count = 16)
	public native void setFinderInfo(byte value, int field_idx);

	@Generated
	@StructureField(order = 15, isGetter = true, count = 16)
	public native byte extFinderInfo(int field_idx);

	@Generated
	@StructureField(order = 15, isGetter = false, count = 16)
	public native void setExtFinderInfo(byte value, int field_idx);

	@Generated
	@StructureField(order = 16, isGetter = true)
	public native long dataLogicalSize();

	@Generated
	@StructureField(order = 16, isGetter = false)
	public native void setDataLogicalSize(long value);

	@Generated
	@StructureField(order = 17, isGetter = true)
	public native long dataPhysicalSize();

	@Generated
	@StructureField(order = 17, isGetter = false)
	public native void setDataPhysicalSize(long value);

	@Generated
	@StructureField(order = 18, isGetter = true)
	public native long rsrcLogicalSize();

	@Generated
	@StructureField(order = 18, isGetter = false)
	public native void setRsrcLogicalSize(long value);

	@Generated
	@StructureField(order = 19, isGetter = true)
	public native long rsrcPhysicalSize();

	@Generated
	@StructureField(order = 19, isGetter = false)
	public native void setRsrcPhysicalSize(long value);

	@Generated
	@StructureField(order = 20, isGetter = true)
	public native int valence();

	@Generated
	@StructureField(order = 20, isGetter = false)
	public native void setValence(int value);

	@Generated
	@StructureField(order = 21, isGetter = true)
	public native int textEncodingHint();

	@Generated
	@StructureField(order = 21, isGetter = false)
	public native void setTextEncodingHint(int value);
}
