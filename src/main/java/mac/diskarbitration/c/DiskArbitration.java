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

package mac.diskarbitration.c;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.corefoundation.opaque.*;
import mac.diskarbitration.opaque.DAApprovalSessionRef;
import mac.diskarbitration.opaque.DADiskRef;
import mac.diskarbitration.opaque.DASessionRef;

@Generated
@Library("DiskArbitration")
@Runtime(CRuntime.class)
public final class DiskArbitration {
	static {
		NatJ.register();
	}

	@Generated
	private DiskArbitration() {
	}

	@Generated
	@CFunction
	public static native long DASessionGetTypeID();

	@Generated
	@CFunction
	public static native DASessionRef DASessionCreate(CFAllocatorRef allocator);

	@Generated
	@CFunction
	public static native void DASessionScheduleWithRunLoop(
			DASessionRef session, CFRunLoopRef runLoop, CFStringRef runLoopMode);

	@Generated
	@CFunction
	public static native void DASessionUnscheduleFromRunLoop(
			DASessionRef session, CFRunLoopRef runLoop, CFStringRef runLoopMode);

	@Generated
	@CFunction
	public static native void DASessionSetDispatchQueue(DASessionRef session,
			@Mapped(ObjCObjectMapper.class) Object queue);

	@Generated
	@CFunction
	public static native long DAApprovalSessionGetTypeID();

	@Generated
	@CFunction
	public static native DAApprovalSessionRef DAApprovalSessionCreate(
			CFAllocatorRef allocator);

	@Generated
	@CFunction
	public static native void DAApprovalSessionScheduleWithRunLoop(
			DAApprovalSessionRef session, CFRunLoopRef runLoop,
			CFStringRef runLoopMode);

	@Generated
	@CFunction
	public static native void DAApprovalSessionUnscheduleFromRunLoop(
			DAApprovalSessionRef session, CFRunLoopRef runLoop,
			CFStringRef runLoopMode);

	@Generated
	@CFunction
	public static native long DADiskGetTypeID();

	@Generated
	@CFunction
	public static native DADiskRef DADiskCreateFromBSDName(
			CFAllocatorRef allocator,
			DASessionRef session,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name);

	@Generated
	@CFunction
	public static native DADiskRef DADiskCreateFromIOMedia(
			CFAllocatorRef allocator, DASessionRef session, int media);

	@Generated
	@CFunction
	public static native DADiskRef DADiskCreateFromVolumePath(
			CFAllocatorRef allocator, DASessionRef session, CFURLRef path);

	@Generated
	@CFunction
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public static native String DADiskGetBSDName(DADiskRef disk);

	@Generated
	@CFunction
	public static native int DADiskCopyIOMedia(DADiskRef disk);

	@Generated
	@CFunction
	public static native CFDictionaryRef DADiskCopyDescription(DADiskRef disk);

	@Generated
	@CFunction
	public static native DADiskRef DADiskCopyWholeDisk(DADiskRef disk);

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionVolumeKindKey();

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionVolumeMountableKey();

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionVolumeNameKey();

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionVolumeNetworkKey();

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionVolumePathKey();

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionVolumeUUIDKey();

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionMediaBlockSizeKey();

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionMediaBSDMajorKey();

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionMediaBSDMinorKey();

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionMediaBSDNameKey();

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionMediaBSDUnitKey();

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionMediaContentKey();

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionMediaEjectableKey();

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionMediaIconKey();

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionMediaKindKey();

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionMediaLeafKey();

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionMediaNameKey();

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionMediaPathKey();

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionMediaRemovableKey();

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionMediaSizeKey();

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionMediaTypeKey();

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionMediaUUIDKey();

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionMediaWholeKey();

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionMediaWritableKey();

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionDeviceGUIDKey();

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionDeviceInternalKey();

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionDeviceModelKey();

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionDevicePathKey();

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionDeviceProtocolKey();

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionDeviceRevisionKey();

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionDeviceUnitKey();

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionDeviceVendorKey();

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionBusNameKey();

	@Generated
	@CVariable()
	public static native CFStringRef kDADiskDescriptionBusPathKey();
}
