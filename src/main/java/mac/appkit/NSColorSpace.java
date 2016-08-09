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

package mac.appkit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.coregraphics.opaque.CGColorSpaceRef;
import mac.foundation.NSArray;
import mac.foundation.NSCoder;
import mac.foundation.NSData;
import mac.foundation.protocol.NSCoding;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSColorSpace extends NSObject implements NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSColorSpace(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("CGColorSpace")
	public native CGColorSpaceRef CGColorSpace();

	@Generated
	@Selector("ICCProfileData")
	public native NSData ICCProfileData();

	@Generated
	@Selector("adobeRGB1998ColorSpace")
	public static native NSColorSpace adobeRGB1998ColorSpace();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSColorSpace alloc();

	@Generated
	@Selector("availableColorSpacesWithModel:")
	public static native NSArray availableColorSpacesWithModel(long model);

	@Generated
	@Selector("colorSpaceModel")
	public native long colorSpaceModel();

	@Generated
	@Selector("colorSyncProfile")
	public native VoidPtr colorSyncProfile();

	@Generated
	@Selector("deviceCMYKColorSpace")
	public static native NSColorSpace deviceCMYKColorSpace();

	@Generated
	@Selector("deviceGrayColorSpace")
	public static native NSColorSpace deviceGrayColorSpace();

	@Generated
	@Selector("deviceRGBColorSpace")
	public static native NSColorSpace deviceRGBColorSpace();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("genericCMYKColorSpace")
	public static native NSColorSpace genericCMYKColorSpace();

	@Generated
	@Selector("genericGamma22GrayColorSpace")
	public static native NSColorSpace genericGamma22GrayColorSpace();

	@Generated
	@Selector("genericGrayColorSpace")
	public static native NSColorSpace genericGrayColorSpace();

	@Generated
	@Selector("genericRGBColorSpace")
	public static native NSColorSpace genericRGBColorSpace();

	@Generated
	@Selector("init")
	public native NSColorSpace init();

	@Generated
	@Selector("initWithCGColorSpace:")
	public native NSColorSpace initWithCGColorSpace(CGColorSpaceRef cgColorSpace);

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithColorSyncProfile:")
	public native NSColorSpace initWithColorSyncProfile(VoidPtr prof);

	@Generated
	@Selector("initWithICCProfileData:")
	public native NSColorSpace initWithICCProfileData(NSData iccData);

	@Generated
	@Selector("localizedName")
	public native String localizedName();

	@Generated
	@Selector("numberOfColorComponents")
	public native long numberOfColorComponents();

	@Generated
	@Selector("sRGBColorSpace")
	public static native NSColorSpace sRGBColorSpace();
}
