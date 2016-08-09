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
public final class AFPXVolMountInfo extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public AFPXVolMountInfo() {
		super(AFPXVolMountInfo.class);
	}

	@Generated
	protected AFPXVolMountInfo(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short length();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setLength(short value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int media();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setMedia(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short flags();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setFlags(short value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native byte nbpInterval();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setNbpInterval(byte value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native byte nbpCount();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setNbpCount(byte value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native short uamType();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setUamType(short value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native short zoneNameOffset();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setZoneNameOffset(short value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native short serverNameOffset();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setServerNameOffset(short value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native short volNameOffset();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setVolNameOffset(short value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native short userNameOffset();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setUserNameOffset(short value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native short userPasswordOffset();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setUserPasswordOffset(short value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native short volPasswordOffset();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setVolPasswordOffset(short value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	public native short extendedFlags();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setExtendedFlags(short value);

	@Generated
	@StructureField(order = 13, isGetter = true)
	public native short uamNameOffset();

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setUamNameOffset(short value);

	@Generated
	@StructureField(order = 14, isGetter = true)
	public native short alternateAddressOffset();

	@Generated
	@StructureField(order = 14, isGetter = false)
	public native void setAlternateAddressOffset(short value);

	@Generated
	@StructureField(order = 15, isGetter = true, count = 176)
	public native byte AFPData(int field_idx);

	@Generated
	@StructureField(order = 15, isGetter = false, count = 176)
	public native void setAFPData(byte value, int field_idx);
}
