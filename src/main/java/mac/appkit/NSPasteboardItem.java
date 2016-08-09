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
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.appkit.protocol.NSPasteboardReading;
import mac.appkit.protocol.NSPasteboardWriting;
import mac.foundation.NSArray;
import mac.foundation.NSData;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPasteboardItem extends NSObject implements NSPasteboardWriting,
		NSPasteboardReading {
	static {
		NatJ.register();
	}

	@Generated
	protected NSPasteboardItem(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSPasteboardItem alloc();

	@Generated
	@Selector("availableTypeFromArray:")
	public native String availableTypeFromArray(NSArray types);

	@Generated
	@Selector("dataForType:")
	public native NSData dataForType(String type);

	@Generated
	@Selector("init")
	public native NSPasteboardItem init();

	@Generated
	@IsOptional
	@Selector("initWithPasteboardPropertyList:ofType:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithPasteboardPropertyListOfType(
			@Mapped(ObjCObjectMapper.class) Object propertyList, String type);

	@Generated
	@Selector("pasteboardPropertyListForType:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object pasteboardPropertyListForType(String type);

	@Generated
	@Selector("propertyListForType:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object propertyListForType(String type);

	@Generated
	@Selector("readableTypesForPasteboard:")
	public static native NSArray readableTypesForPasteboard(
			NSPasteboard pasteboard);

	@Generated
	@ProtocolClassMethod("readableTypesForPasteboard")
	public NSArray _readableTypesForPasteboard(NSPasteboard pasteboard) {
		return readableTypesForPasteboard(pasteboard);
	}

	@Generated
	@IsOptional
	@Selector("readingOptionsForType:pasteboard:")
	public static native long readingOptionsForTypePasteboard(String type,
			NSPasteboard pasteboard);

	@Generated
	@IsOptional
	@ProtocolClassMethod("readingOptionsForTypePasteboard")
	public long _readingOptionsForTypePasteboard(String type,
			NSPasteboard pasteboard) {
		return readingOptionsForTypePasteboard(type, pasteboard);
	}

	@Generated
	@Selector("setData:forType:")
	public native boolean setDataForType(NSData data, String type);

	@Generated
	@Selector("setDataProvider:forTypes:")
	public native boolean setDataProviderForTypes(
			@Mapped(ObjCObjectMapper.class) Object dataProvider, NSArray types);

	@Generated
	@Selector("setPropertyList:forType:")
	public native boolean setPropertyListForType(
			@Mapped(ObjCObjectMapper.class) Object propertyList, String type);

	@Generated
	@Selector("setString:forType:")
	public native boolean setStringForType(String string, String type);

	@Generated
	@Selector("stringForType:")
	public native String stringForType(String type);

	@Generated
	@Selector("types")
	public native NSArray types();

	@Generated
	@Selector("writableTypesForPasteboard:")
	public native NSArray writableTypesForPasteboard(NSPasteboard pasteboard);

	@Generated
	@IsOptional
	@Selector("writingOptionsForType:pasteboard:")
	public native long writingOptionsForTypePasteboard(String type,
			NSPasteboard pasteboard);
}
