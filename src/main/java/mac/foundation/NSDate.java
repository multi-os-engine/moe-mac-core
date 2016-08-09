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
public class NSDate extends NSObject implements NSCopying, NSSecureCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSDate(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addTimeInterval:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object addTimeInterval(double seconds);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSDate alloc();

	@Generated
	@Selector("compare:")
	public native long compare(NSDate other);

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("date")
	public static native NSDate date();

	@Generated
	@Selector("dateByAddingTimeInterval:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object dateByAddingTimeInterval(double ti);

	@Generated
	@Selector("dateWithCalendarFormat:timeZone:")
	public native NSCalendarDate dateWithCalendarFormatTimeZone(String format,
			NSTimeZone aTimeZone);

	@Generated
	@Selector("dateWithNaturalLanguageString:")
	public static native NSDate dateWithNaturalLanguageString(String string);

	@Generated
	@Selector("dateWithNaturalLanguageString:locale:")
	public static native NSDate dateWithNaturalLanguageStringLocale(
			String string, @Mapped(ObjCObjectMapper.class) Object locale);

	@Generated
	@Selector("dateWithString:")
	public static native NSDate dateWithString(String aString);

	@Generated
	@Selector("dateWithTimeInterval:sinceDate:")
	public static native NSDate dateWithTimeIntervalSinceDate(
			double secsToBeAdded, NSDate date);

	@Generated
	@Selector("dateWithTimeIntervalSince1970:")
	public static native NSDate dateWithTimeIntervalSince1970(double secs);

	@Generated
	@Selector("dateWithTimeIntervalSinceNow:")
	public static native NSDate dateWithTimeIntervalSinceNow(double secs);

	@Generated
	@Selector("dateWithTimeIntervalSinceReferenceDate:")
	public static native NSDate dateWithTimeIntervalSinceReferenceDate(double ti);

	@Generated
	@Selector("description")
	public native String description();

	@Generated
	@Selector("descriptionWithCalendarFormat:timeZone:locale:")
	public native String descriptionWithCalendarFormatTimeZoneLocale(
			String format, NSTimeZone aTimeZone,
			@Mapped(ObjCObjectMapper.class) Object locale);

	@Generated
	@Selector("descriptionWithLocale:")
	public native String descriptionWithLocale(
			@Mapped(ObjCObjectMapper.class) Object locale);

	@Generated
	@Selector("distantFuture")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object distantFuture();

	@Generated
	@Selector("distantPast")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object distantPast();

	@Generated
	@Selector("earlierDate:")
	public native NSDate earlierDate(NSDate anotherDate);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("init")
	public native NSDate init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithString:")
	public native NSDate initWithString(String description);

	@Generated
	@Selector("initWithTimeInterval:sinceDate:")
	public native NSDate initWithTimeIntervalSinceDate(double secsToBeAdded,
			NSDate date);

	@Generated
	@Selector("initWithTimeIntervalSince1970:")
	public native NSDate initWithTimeIntervalSince1970(double secs);

	@Generated
	@Selector("initWithTimeIntervalSinceNow:")
	public native NSDate initWithTimeIntervalSinceNow(double secs);

	@Generated
	@Selector("initWithTimeIntervalSinceReferenceDate:")
	public native NSDate initWithTimeIntervalSinceReferenceDate(double ti);

	@Generated
	@Selector("isEqualToDate:")
	public native boolean isEqualToDate(NSDate otherDate);

	@Generated
	@Selector("laterDate:")
	public native NSDate laterDate(NSDate anotherDate);

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	@Generated
	@Selector("timeIntervalSince1970")
	public native double timeIntervalSince1970();

	@Generated
	@Selector("timeIntervalSinceDate:")
	public native double timeIntervalSinceDate(NSDate anotherDate);

	@Generated
	@Selector("timeIntervalSinceNow")
	public native double timeIntervalSinceNow();

	@Generated
	@Selector("timeIntervalSinceReferenceDate")
	public native double timeIntervalSinceReferenceDate();

	@Generated
	@Selector("timeIntervalSinceReferenceDate")
	public static native double timeIntervalSinceReferenceDate_static();
}
