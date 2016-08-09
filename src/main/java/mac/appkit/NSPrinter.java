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
import mac.coregraphics.struct.CGRect;
import mac.coregraphics.struct.CGSize;
import mac.foundation.NSArray;
import mac.foundation.NSCoder;
import mac.foundation.NSDictionary;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPrinter extends NSObject implements NSCopying, NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSPrinter(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("acceptsBinary")
	public native boolean acceptsBinary();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSPrinter alloc();

	@Generated
	@Selector("booleanForKey:inTable:")
	public native boolean booleanForKeyInTable(String key, String table);

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("deviceDescription")
	public native NSDictionary deviceDescription();

	@Generated
	@Selector("domain")
	public native String domain();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("floatForKey:inTable:")
	public native float floatForKeyInTable(String key, String table);

	@Generated
	@Selector("host")
	public native String host();

	@Generated
	@Selector("imageRectForPaper:")
	@ByValue
	public native CGRect imageRectForPaper(String paperName);

	@Generated
	@Selector("init")
	public native NSPrinter init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("intForKey:inTable:")
	public native int intForKeyInTable(String key, String table);

	@Generated
	@Selector("isColor")
	public native boolean isColor();

	@Generated
	@Selector("isFontAvailable:")
	public native boolean isFontAvailable(String faceName);

	@Generated
	@Selector("isKey:inTable:")
	public native boolean isKeyInTable(String key, String table);

	@Generated
	@Selector("isOutputStackInReverseOrder")
	public native boolean isOutputStackInReverseOrder();

	@Generated
	@Selector("languageLevel")
	public native long languageLevel();

	@Generated
	@Selector("name")
	public native String name();

	@Generated
	@Selector("note")
	public native String note();

	@Generated
	@Selector("pageSizeForPaper:")
	@ByValue
	public native CGSize pageSizeForPaper(String paperName);

	@Generated
	@Selector("printerNames")
	public static native NSArray printerNames();

	@Generated
	@Selector("printerTypes")
	public static native NSArray printerTypes();

	@Generated
	@Selector("printerWithName:")
	public static native NSPrinter printerWithName(String name);

	@Generated
	@Selector("printerWithName:domain:includeUnavailable:")
	public static native NSPrinter printerWithNameDomainIncludeUnavailable(
			String name, String domain, boolean flag);

	@Generated
	@Selector("printerWithType:")
	public static native NSPrinter printerWithType(String type);

	@Generated
	@Selector("rectForKey:inTable:")
	@ByValue
	public native CGRect rectForKeyInTable(String key, String table);

	@Generated
	@Selector("sizeForKey:inTable:")
	@ByValue
	public native CGSize sizeForKeyInTable(String key, String table);

	@Generated
	@Selector("statusForTable:")
	public native long statusForTable(String tableName);

	@Generated
	@Selector("stringForKey:inTable:")
	public native String stringForKeyInTable(String key, String table);

	@Generated
	@Selector("stringListForKey:inTable:")
	public native NSArray stringListForKeyInTable(String key, String table);

	@Generated
	@Selector("type")
	public native String type();
}
