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
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSCalendarDate extends NSDate {
	static {
		NatJ.register();
	}

	@Generated
	protected NSCalendarDate(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSCalendarDate alloc();

	@Generated
	@Selector("calendarDate")
	public static native NSCalendarDate calendarDate();

	@Generated
	@Selector("calendarFormat")
	public native String calendarFormat();

	@Generated
	@Selector("date")
	public static native NSCalendarDate date();

	@Generated
	@Selector("dateByAddingYears:months:days:hours:minutes:seconds:")
	public native NSCalendarDate dateByAddingYearsMonthsDaysHoursMinutesSeconds(
			long year, long month, long day, long hour, long minute, long second);

	@Generated
	@Selector("dateWithNaturalLanguageString:")
	public static native NSCalendarDate dateWithNaturalLanguageString(
			String string);

	@Generated
	@Selector("dateWithNaturalLanguageString:locale:")
	public static native NSCalendarDate dateWithNaturalLanguageStringLocale(
			String string, @Mapped(ObjCObjectMapper.class) Object locale);

	@Generated
	@Selector("dateWithString:")
	public static native NSCalendarDate dateWithString(String aString);

	@Generated
	@Selector("dateWithString:calendarFormat:")
	public static native NSCalendarDate dateWithStringCalendarFormat(
			String description, String format);

	@Generated
	@Selector("dateWithString:calendarFormat:locale:")
	public static native NSCalendarDate dateWithStringCalendarFormatLocale(
			String description, String format,
			@Mapped(ObjCObjectMapper.class) Object locale);

	@Generated
	@Selector("dateWithTimeInterval:sinceDate:")
	public static native NSCalendarDate dateWithTimeIntervalSinceDate(
			double secsToBeAdded, NSDate date);

	@Generated
	@Selector("dateWithTimeIntervalSince1970:")
	public static native NSCalendarDate dateWithTimeIntervalSince1970(
			double secs);

	@Generated
	@Selector("dateWithTimeIntervalSinceNow:")
	public static native NSCalendarDate dateWithTimeIntervalSinceNow(double secs);

	@Generated
	@Selector("dateWithTimeIntervalSinceReferenceDate:")
	public static native NSCalendarDate dateWithTimeIntervalSinceReferenceDate(
			double ti);

	@Generated
	@Selector("dateWithYear:month:day:hour:minute:second:timeZone:")
	public static native NSCalendarDate dateWithYearMonthDayHourMinuteSecondTimeZone(
			long year, long month, long day, long hour, long minute,
			long second, NSTimeZone aTimeZone);

	@Generated
	@Selector("dayOfCommonEra")
	public native long dayOfCommonEra();

	@Generated
	@Selector("dayOfMonth")
	public native long dayOfMonth();

	@Generated
	@Selector("dayOfWeek")
	public native long dayOfWeek();

	@Generated
	@Selector("dayOfYear")
	public native long dayOfYear();

	@Generated
	@Selector("descriptionWithCalendarFormat:")
	public native String descriptionWithCalendarFormat(String format);

	@Generated
	@Selector("descriptionWithCalendarFormat:locale:")
	public native String descriptionWithCalendarFormatLocale(String format,
			@Mapped(ObjCObjectMapper.class) Object locale);

	@Generated
	@Selector("descriptionWithLocale:")
	public native String descriptionWithLocale(
			@Mapped(ObjCObjectMapper.class) Object locale);

	@Generated
	@Selector("hourOfDay")
	public native long hourOfDay();

	@Generated
	@Selector("init")
	public native NSCalendarDate init();

	@Generated
	@Selector("initWithString:")
	public native NSCalendarDate initWithString(String description);

	@Generated
	@Selector("initWithString:calendarFormat:")
	public native NSCalendarDate initWithStringCalendarFormat(
			String description, String format);

	@Generated
	@Selector("initWithString:calendarFormat:locale:")
	public native NSCalendarDate initWithStringCalendarFormatLocale(
			String description, String format,
			@Mapped(ObjCObjectMapper.class) Object locale);

	@Generated
	@Selector("initWithTimeInterval:sinceDate:")
	public native NSCalendarDate initWithTimeIntervalSinceDate(
			double secsToBeAdded, NSDate date);

	@Generated
	@Selector("initWithTimeIntervalSince1970:")
	public native NSCalendarDate initWithTimeIntervalSince1970(double secs);

	@Generated
	@Selector("initWithTimeIntervalSinceNow:")
	public native NSCalendarDate initWithTimeIntervalSinceNow(double secs);

	@Generated
	@Selector("initWithTimeIntervalSinceReferenceDate:")
	public native NSCalendarDate initWithTimeIntervalSinceReferenceDate(
			double ti);

	@Generated
	@Selector("initWithYear:month:day:hour:minute:second:timeZone:")
	public native NSCalendarDate initWithYearMonthDayHourMinuteSecondTimeZone(
			long year, long month, long day, long hour, long minute,
			long second, NSTimeZone aTimeZone);

	@Generated
	@Selector("minuteOfHour")
	public native long minuteOfHour();

	@Generated
	@Selector("monthOfYear")
	public native long monthOfYear();

	@Generated
	@Selector("secondOfMinute")
	public native long secondOfMinute();

	@Generated
	@Selector("setCalendarFormat:")
	public native void setCalendarFormat(String format);

	@Generated
	@Selector("setTimeZone:")
	public native void setTimeZone(NSTimeZone aTimeZone);

	@Generated
	@Selector("timeZone")
	public native NSTimeZone timeZone();

	@Generated
	@Selector("yearOfCommonEra")
	public native long yearOfCommonEra();

	@Generated
	@Selector("years:months:days:hours:minutes:seconds:sinceDate:")
	public native void yearsMonthsDaysHoursMinutesSecondsSinceDate(LongPtr yp,
			LongPtr mop, LongPtr dp, LongPtr hp, LongPtr mip, LongPtr sp,
			NSCalendarDate date);
}
