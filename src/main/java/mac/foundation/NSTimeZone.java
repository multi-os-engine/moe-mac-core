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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.protocol.NSCopying;
import mac.foundation.protocol.NSSecureCoding;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTimeZone extends NSObject implements NSCopying, NSSecureCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSTimeZone(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("abbreviation")
	public native String abbreviation();

	@Generated
	@Selector("abbreviationDictionary")
	public static native NSDictionary abbreviationDictionary();

	@Generated
	@Selector("abbreviationForDate:")
	public native String abbreviationForDate(NSDate aDate);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSTimeZone alloc();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("data")
	public native NSData data();

	@Generated
	@Selector("daylightSavingTimeOffset")
	public native double daylightSavingTimeOffset();

	@Generated
	@Selector("daylightSavingTimeOffsetForDate:")
	public native double daylightSavingTimeOffsetForDate(NSDate aDate);

	@Generated
	@Selector("defaultTimeZone")
	public static native NSTimeZone defaultTimeZone();

	@Generated
	@Selector("description")
	public native String description();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("init")
	public native NSTimeZone init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithName:")
	public native NSTimeZone initWithName(String tzName);

	@Generated
	@Selector("initWithName:data:")
	public native NSTimeZone initWithNameData(String tzName, NSData aData);

	@Generated
	@Selector("isDaylightSavingTime")
	public native boolean isDaylightSavingTime();

	@Generated
	@Selector("isDaylightSavingTimeForDate:")
	public native boolean isDaylightSavingTimeForDate(NSDate aDate);

	@Generated
	@Selector("isEqualToTimeZone:")
	public native boolean isEqualToTimeZone(NSTimeZone aTimeZone);

	@Generated
	@Selector("knownTimeZoneNames")
	public static native NSArray knownTimeZoneNames();

	@Generated
	@Selector("localTimeZone")
	public static native NSTimeZone localTimeZone();

	@Generated
	@Selector("localizedName:locale:")
	public native String localizedNameLocale(long style, NSLocale locale);

	@Generated
	@Selector("name")
	public native String name();

	@Generated
	@Selector("nextDaylightSavingTimeTransition")
	public native NSDate nextDaylightSavingTimeTransition();

	@Generated
	@Selector("nextDaylightSavingTimeTransitionAfterDate:")
	public native NSDate nextDaylightSavingTimeTransitionAfterDate(NSDate aDate);

	@Generated
	@Selector("resetSystemTimeZone")
	public static native void resetSystemTimeZone();

	@Generated
	@Selector("secondsFromGMT")
	public native long secondsFromGMT();

	@Generated
	@Selector("secondsFromGMTForDate:")
	public native long secondsFromGMTForDate(NSDate aDate);

	@Generated
	@Selector("setAbbreviationDictionary:")
	public static native void setAbbreviationDictionary(NSDictionary dict);

	@Generated
	@Selector("setDefaultTimeZone:")
	public static native void setDefaultTimeZone(NSTimeZone aTimeZone);

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	@Generated
	@Selector("systemTimeZone")
	public static native NSTimeZone systemTimeZone();

	@Generated
	@Selector("timeZoneDataVersion")
	public static native String timeZoneDataVersion();

	@Generated
	@Selector("timeZoneForSecondsFromGMT:")
	public static native NSTimeZone timeZoneForSecondsFromGMT(long seconds);

	@Generated
	@Selector("timeZoneWithAbbreviation:")
	public static native NSTimeZone timeZoneWithAbbreviation(String abbreviation);

	@Generated
	@Selector("timeZoneWithName:")
	public static native NSTimeZone timeZoneWithName(String tzName);

	@Generated
	@Selector("timeZoneWithName:data:")
	public static native NSTimeZone timeZoneWithNameData(String tzName,
			NSData aData);
}
