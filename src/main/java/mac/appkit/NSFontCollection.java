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
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.*;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;
import mac.foundation.protocol.NSMutableCopying;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSFontCollection extends NSObject implements NSCopying,
		NSMutableCopying, NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSFontCollection(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("allFontCollectionNames")
	public static native NSArray allFontCollectionNames();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSFontCollection alloc();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("exclusionDescriptors")
	public native NSArray exclusionDescriptors();

	@Generated
	@Selector("fontCollectionWithAllAvailableDescriptors")
	public static native NSFontCollection fontCollectionWithAllAvailableDescriptors();

	@Generated
	@Selector("fontCollectionWithDescriptors:")
	public static native NSFontCollection fontCollectionWithDescriptors(
			NSArray queryDescriptors);

	@Generated
	@Selector("fontCollectionWithLocale:")
	public static native NSFontCollection fontCollectionWithLocale(
			NSLocale locale);

	@Generated
	@Selector("fontCollectionWithName:")
	public static native NSFontCollection fontCollectionWithName(String name);

	@Generated
	@Selector("fontCollectionWithName:visibility:")
	public static native NSFontCollection fontCollectionWithNameVisibility(
			String name, long visibility);

	@Generated
	@Selector("hideFontCollectionWithName:visibility:error:")
	public static native boolean hideFontCollectionWithNameVisibilityError(
			String name, long visibility, Ptr<NSError> error);

	@Generated
	@Selector("init")
	public native NSFontCollection init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("matchingDescriptors")
	public native NSArray matchingDescriptors();

	@Generated
	@Selector("matchingDescriptorsForFamily:")
	public native NSArray matchingDescriptorsForFamily(String family);

	@Generated
	@Selector("matchingDescriptorsForFamily:options:")
	public native NSArray matchingDescriptorsForFamilyOptions(String family,
			NSDictionary options);

	@Generated
	@Selector("matchingDescriptorsWithOptions:")
	public native NSArray matchingDescriptorsWithOptions(NSDictionary options);

	@Generated
	@Selector("mutableCopyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object mutableCopyWithZone(VoidPtr zone);

	@Generated
	@Selector("queryDescriptors")
	public native NSArray queryDescriptors();

	@Generated
	@Selector("renameFontCollectionWithName:visibility:toName:error:")
	public static native boolean renameFontCollectionWithNameVisibilityToNameError(
			String name, long visibility, String name_, Ptr<NSError> error);

	@Generated
	@Selector("showFontCollection:withName:visibility:error:")
	public static native boolean showFontCollectionWithNameVisibilityError(
			NSFontCollection collection, String name, long visibility,
			Ptr<NSError> error);
}
