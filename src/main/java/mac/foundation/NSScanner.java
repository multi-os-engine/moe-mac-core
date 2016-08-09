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

package mac.foundation;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.*;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSScanner extends NSObject implements NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected NSScanner(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSScanner alloc();

	@Generated
	@Selector("caseSensitive")
	public native boolean caseSensitive();

	@Generated
	@Selector("charactersToBeSkipped")
	public native NSCharacterSet charactersToBeSkipped();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("init")
	public native NSScanner init();

	@Generated
	@Selector("initWithString:")
	public native NSScanner initWithString(String string);

	@Generated
	@Selector("isAtEnd")
	public native boolean isAtEnd();

	@Generated
	@Selector("locale")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object locale();

	@Generated
	@Selector("localizedScannerWithString:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object localizedScannerWithString(String string);

	@Generated
	@Selector("scanCharactersFromSet:intoString:")
	public native boolean scanCharactersFromSetIntoString(NSCharacterSet set,
			Ptr<NSString> result);

	@Generated
	@Selector("scanDecimal:")
	public native boolean scanDecimal(VoidPtr dcm);

	@Generated
	@Selector("scanDouble:")
	public native boolean scanDouble(DoublePtr result);

	@Generated
	@Selector("scanFloat:")
	public native boolean scanFloat(FloatPtr result);

	@Generated
	@Selector("scanHexDouble:")
	public native boolean scanHexDouble(DoublePtr result);

	@Generated
	@Selector("scanHexFloat:")
	public native boolean scanHexFloat(FloatPtr result);

	@Generated
	@Selector("scanHexInt:")
	public native boolean scanHexInt(IntPtr result);

	@Generated
	@Selector("scanHexLongLong:")
	public native boolean scanHexLongLong(LongPtr result);

	@Generated
	@Selector("scanInt:")
	public native boolean scanInt(IntPtr result);

	@Generated
	@Selector("scanInteger:")
	public native boolean scanInteger(LongPtr result);

	@Generated
	@Selector("scanLocation")
	public native long scanLocation();

	@Generated
	@Selector("scanLongLong:")
	public native boolean scanLongLong(LongPtr result);

	@Generated
	@Selector("scanString:intoString:")
	public native boolean scanStringIntoString(String string,
			Ptr<NSString> result);

	@Generated
	@Selector("scanUnsignedLongLong:")
	public native boolean scanUnsignedLongLong(LongPtr result);

	@Generated
	@Selector("scanUpToCharactersFromSet:intoString:")
	public native boolean scanUpToCharactersFromSetIntoString(
			NSCharacterSet set, Ptr<NSString> result);

	@Generated
	@Selector("scanUpToString:intoString:")
	public native boolean scanUpToStringIntoString(String string,
			Ptr<NSString> result);

	@Generated
	@Selector("scannerWithString:")
	public static native NSScanner scannerWithString(String string);

	@Generated
	@Selector("setCaseSensitive:")
	public native void setCaseSensitive(boolean flag);

	@Generated
	@Selector("setCharactersToBeSkipped:")
	public native void setCharactersToBeSkipped(NSCharacterSet set);

	@Generated
	@Selector("setLocale:")
	public native void setLocale(@Mapped(ObjCObjectMapper.class) Object locale);

	@Generated
	@Selector("setScanLocation:")
	public native void setScanLocation(long pos);

	@Generated
	@Selector("string")
	public native String string();
}
