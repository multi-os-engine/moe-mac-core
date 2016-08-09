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
public final class FSAliasInfo extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public FSAliasInfo() {
		super(FSAliasInfo.class);
	}

	@Generated
	protected FSAliasInfo(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native UTCDateTime volumeCreateDate();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setVolumeCreateDate(@ByValue UTCDateTime value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@ByValue
	public native UTCDateTime targetCreateDate();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setTargetCreateDate(@ByValue UTCDateTime value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int fileType();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setFileType(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int fileCreator();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setFileCreator(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int parentDirID();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setParentDirID(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int nodeID();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setNodeID(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native short filesystemID();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setFilesystemID(short value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native short signature();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setSignature(short value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native byte volumeIsBootVolume();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setVolumeIsBootVolume(byte value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native byte volumeIsAutomounted();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setVolumeIsAutomounted(byte value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native byte volumeIsEjectable();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setVolumeIsEjectable(byte value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native byte volumeHasPersistentFileIDs();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setVolumeHasPersistentFileIDs(byte value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	public native byte isDirectory();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setIsDirectory(byte value);
}
