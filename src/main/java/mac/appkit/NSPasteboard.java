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
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.NSArray;
import mac.foundation.NSData;
import mac.foundation.NSDictionary;
import mac.foundation.NSFileWrapper;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPasteboard extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSPasteboard(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addTypes:owner:")
	public native long addTypesOwner(NSArray newTypes,
			@Mapped(ObjCObjectMapper.class) Object newOwner);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSPasteboard alloc();

	@Generated
	@Selector("availableTypeFromArray:")
	public native String availableTypeFromArray(NSArray types);

	@Generated
	@Selector("canReadItemWithDataConformingToTypes:")
	public native boolean canReadItemWithDataConformingToTypes(NSArray types);

	@Generated
	@Selector("canReadObjectForClasses:options:")
	public native boolean canReadObjectForClassesOptions(NSArray classArray,
			NSDictionary options);

	@Generated
	@Selector("changeCount")
	public native long changeCount();

	@Generated
	@Selector("clearContents")
	public native long clearContents();

	@Generated
	@Selector("dataForType:")
	public native NSData dataForType(String dataType);

	@Generated
	@Selector("declareTypes:owner:")
	public native long declareTypesOwner(NSArray newTypes,
			@Mapped(ObjCObjectMapper.class) Object newOwner);

	@Generated
	@Selector("generalPasteboard")
	public static native NSPasteboard generalPasteboard();

	@Generated
	@Selector("indexOfPasteboardItem:")
	public native long indexOfPasteboardItem(NSPasteboardItem pasteboardItem);

	@Generated
	@Selector("init")
	public native NSPasteboard init();

	@Generated
	@Selector("name")
	public native String name();

	@Generated
	@Selector("pasteboardByFilteringData:ofType:")
	public static native NSPasteboard pasteboardByFilteringDataOfType(
			NSData data, String type);

	@Generated
	@Selector("pasteboardByFilteringFile:")
	public static native NSPasteboard pasteboardByFilteringFile(String filename);

	@Generated
	@Selector("pasteboardByFilteringTypesInPasteboard:")
	public static native NSPasteboard pasteboardByFilteringTypesInPasteboard(
			NSPasteboard pboard);

	@Generated
	@Selector("pasteboardItems")
	public native NSArray pasteboardItems();

	@Generated
	@Selector("pasteboardWithName:")
	public static native NSPasteboard pasteboardWithName(String name);

	@Generated
	@Selector("pasteboardWithUniqueName")
	public static native NSPasteboard pasteboardWithUniqueName();

	@Generated
	@Selector("propertyListForType:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object propertyListForType(String dataType);

	@Generated
	@Selector("readFileContentsType:toFile:")
	public native String readFileContentsTypeToFile(String type, String filename);

	@Generated
	@Selector("readFileWrapper")
	public native NSFileWrapper readFileWrapper();

	@Generated
	@Selector("readObjectsForClasses:options:")
	public native NSArray readObjectsForClassesOptions(NSArray classArray,
			NSDictionary options);

	@Generated
	@Selector("releaseGlobally")
	public native void releaseGlobally();

	@Generated
	@Selector("setData:forType:")
	public native boolean setDataForType(NSData data, String dataType);

	@Generated
	@Selector("setPropertyList:forType:")
	public native boolean setPropertyListForType(
			@Mapped(ObjCObjectMapper.class) Object plist, String dataType);

	@Generated
	@Selector("setString:forType:")
	public native boolean setStringForType(String string, String dataType);

	@Generated
	@Selector("stringForType:")
	public native String stringForType(String dataType);

	@Generated
	@Selector("types")
	public native NSArray types();

	@Generated
	@Selector("typesFilterableTo:")
	public static native NSArray typesFilterableTo(String type);

	@Generated
	@Selector("writeFileContents:")
	public native boolean writeFileContents(String filename);

	@Generated
	@Selector("writeFileWrapper:")
	public native boolean writeFileWrapper(NSFileWrapper wrapper);

	@Generated
	@Selector("writeObjects:")
	public native boolean writeObjects(NSArray objects);
}
