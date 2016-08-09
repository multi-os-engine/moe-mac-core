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
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ptr.Ptr;
import mac.corefoundation.opaque.CFDictionaryRef;

@Generated
@Structure()
public final class CMDeviceInfo extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CMDeviceInfo() {
		super(CMDeviceInfo.class);
	}

	@Generated
	protected CMDeviceInfo(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int dataVersion();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setDataVersion(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int deviceClass();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setDeviceClass(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int deviceID();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setDeviceID(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	@ByValue
	public native CMDeviceScope deviceScope();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setDeviceScope(@ByValue CMDeviceScope value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int deviceState();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setDeviceState(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int defaultProfileID();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setDefaultProfileID(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	@ReferenceInfo(type = CFDictionaryRef.class)
	public native Ptr<CFDictionaryRef> deviceName();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setDeviceName(Ptr<CFDictionaryRef> value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int profileCount();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setProfileCount(int value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native int reserved();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setReserved(int value);
}
