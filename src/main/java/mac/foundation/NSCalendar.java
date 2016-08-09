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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.protocol.NSCopying;
import mac.foundation.protocol.NSSecureCoding;
import mac.foundation.struct.NSRange;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSCalendar extends NSObject implements NSCopying, NSSecureCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSCalendar(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("AMSymbol")
	public native String AMSymbol();

	@Generated
	@Selector("PMSymbol")
	public native String PMSymbol();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSCalendar alloc();

	@Generated
	@Selector("autoupdatingCurrentCalendar")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object autoupdatingCurrentCalendar();

	@Generated
	@Selector("calendarIdentifier")
	public native String calendarIdentifier();

	@Generated
	@Selector("calendarWithIdentifier:")
	public static native NSCalendar calendarWithIdentifier(
			String calendarIdentifierConstant);

	@Generated
	@Selector("compareDate:toDate:toUnitGranularity:")
	public native long compareDateToDateToUnitGranularity(NSDate date1,
			NSDate date2, long unit);

	@Generated
	@Selector("component:fromDate:")
	public native long componentFromDate(long unit, NSDate date);

	@Generated
	@Selector("components:fromDate:")
	public native NSDateComponents componentsFromDate(long unitFlags, NSDate date);

	@Generated
	@Selector("components:fromDate:toDate:options:")
	public native NSDateComponents componentsFromDateToDateOptions(
			long unitFlags, NSDate startingDate, NSDate resultDate, long opts);

	@Generated
	@Selector("components:fromDateComponents:toDateComponents:options:")
	public native NSDateComponents componentsFromDateComponentsToDateComponentsOptions(
			long unitFlags, NSDateComponents startingDateComp,
			NSDateComponents resultDateComp, long options);

	@Generated
	@Selector("componentsInTimeZone:fromDate:")
	public native NSDateComponents componentsInTimeZoneFromDate(
			NSTimeZone timezone, NSDate date);

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("currentCalendar")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object currentCalendar();

	@Generated
	@Selector("date:matchesComponents:")
	public native boolean dateMatchesComponents(NSDate date,
			NSDateComponents components);

	@Generated
	@Selector("dateByAddingComponents:toDate:options:")
	public native NSDate dateByAddingComponentsToDateOptions(
			NSDateComponents comps, NSDate date, long opts);

	@Generated
	@Selector("dateByAddingUnit:value:toDate:options:")
	public native NSDate dateByAddingUnitValueToDateOptions(long unit,
			long value, NSDate date, long options);

	@Generated
	@Selector("dateBySettingHour:minute:second:ofDate:options:")
	public native NSDate dateBySettingHourMinuteSecondOfDateOptions(long h,
			long m, long s, NSDate date, long opts);

	@Generated
	@Selector("dateBySettingUnit:value:ofDate:options:")
	public native NSDate dateBySettingUnitValueOfDateOptions(long unit, long v,
			NSDate date, long opts);

	@Generated
	@Selector("dateFromComponents:")
	public native NSDate dateFromComponents(NSDateComponents comps);

	@Generated
	@Selector("dateWithEra:year:month:day:hour:minute:second:nanosecond:")
	public native NSDate dateWithEraYearMonthDayHourMinuteSecondNanosecond(
			long eraValue, long yearValue, long monthValue, long dayValue,
			long hourValue, long minuteValue, long secondValue,
			long nanosecondValue);

	@Generated
	@Selector("dateWithEra:yearForWeekOfYear:weekOfYear:weekday:hour:minute:second:nanosecond:")
	public native NSDate dateWithEraYearForWeekOfYearWeekOfYearWeekdayHourMinuteSecondNanosecond(
			long eraValue, long yearValue, long weekValue, long weekdayValue,
			long hourValue, long minuteValue, long secondValue,
			long nanosecondValue);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("enumerateDatesStartingAfterDate:matchingComponents:options:usingBlock:")
	public native void enumerateDatesStartingAfterDateMatchingComponentsOptionsUsingBlock(
			NSDate start,
			NSDateComponents comps,
			long opts,
			@ObjCBlock(name = "call_enumerateDatesStartingAfterDateMatchingComponentsOptionsUsingBlock") Block_enumerateDatesStartingAfterDateMatchingComponentsOptionsUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_enumerateDatesStartingAfterDateMatchingComponentsOptionsUsingBlock {
		@Generated
		public void call_enumerateDatesStartingAfterDateMatchingComponentsOptionsUsingBlock(
				NSDate arg0, boolean arg1, BoolPtr arg2);
	}

	@Generated
	@Selector("eraSymbols")
	public native NSArray eraSymbols();

	@Generated
	@Selector("firstWeekday")
	public native long firstWeekday();

	@Generated
	@Selector("getEra:year:month:day:fromDate:")
	public native void getEraYearMonthDayFromDate(LongPtr eraValuePointer,
			LongPtr yearValuePointer, LongPtr monthValuePointer,
			LongPtr dayValuePointer, NSDate date);

	@Generated
	@Selector("getEra:yearForWeekOfYear:weekOfYear:weekday:fromDate:")
	public native void getEraYearForWeekOfYearWeekOfYearWeekdayFromDate(
			LongPtr eraValuePointer, LongPtr yearValuePointer,
			LongPtr weekValuePointer, LongPtr weekdayValuePointer, NSDate date);

	@Generated
	@Selector("getHour:minute:second:nanosecond:fromDate:")
	public native void getHourMinuteSecondNanosecondFromDate(
			LongPtr hourValuePointer, LongPtr minuteValuePointer,
			LongPtr secondValuePointer, LongPtr nanosecondValuePointer,
			NSDate date);

	@Generated
	@Selector("init")
	public native NSCalendar init();

	@Generated
	@Selector("initWithCalendarIdentifier:")
	public native NSCalendar initWithCalendarIdentifier(String ident);

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("isDate:equalToDate:toUnitGranularity:")
	public native boolean isDateEqualToDateToUnitGranularity(NSDate date1,
			NSDate date2, long unit);

	@Generated
	@Selector("isDate:inSameDayAsDate:")
	public native boolean isDateInSameDayAsDate(NSDate date1, NSDate date2);

	@Generated
	@Selector("isDateInToday:")
	public native boolean isDateInToday(NSDate date);

	@Generated
	@Selector("isDateInTomorrow:")
	public native boolean isDateInTomorrow(NSDate date);

	@Generated
	@Selector("isDateInWeekend:")
	public native boolean isDateInWeekend(NSDate date);

	@Generated
	@Selector("isDateInYesterday:")
	public native boolean isDateInYesterday(NSDate date);

	@Generated
	@Selector("locale")
	public native NSLocale locale();

	@Generated
	@Selector("longEraSymbols")
	public native NSArray longEraSymbols();

	@Generated
	@Selector("maximumRangeOfUnit:")
	@ByValue
	public native NSRange maximumRangeOfUnit(long unit);

	@Generated
	@Selector("minimumDaysInFirstWeek")
	public native long minimumDaysInFirstWeek();

	@Generated
	@Selector("minimumRangeOfUnit:")
	@ByValue
	public native NSRange minimumRangeOfUnit(long unit);

	@Generated
	@Selector("monthSymbols")
	public native NSArray monthSymbols();

	@Generated
	@Selector("nextDateAfterDate:matchingComponents:options:")
	public native NSDate nextDateAfterDateMatchingComponentsOptions(
			NSDate date, NSDateComponents comps, long options);

	@Generated
	@Selector("nextDateAfterDate:matchingHour:minute:second:options:")
	public native NSDate nextDateAfterDateMatchingHourMinuteSecondOptions(
			NSDate date, long hourValue, long minuteValue, long secondValue,
			long options);

	@Generated
	@Selector("nextDateAfterDate:matchingUnit:value:options:")
	public native NSDate nextDateAfterDateMatchingUnitValueOptions(NSDate date,
			long unit, long value, long options);

	@Generated
	@Selector("nextWeekendStartDate:interval:options:afterDate:")
	public native boolean nextWeekendStartDateIntervalOptionsAfterDate(
			Ptr<NSDate> datep, DoublePtr tip, long options, NSDate date);

	@Generated
	@Selector("ordinalityOfUnit:inUnit:forDate:")
	public native long ordinalityOfUnitInUnitForDate(long smaller, long larger,
			NSDate date);

	@Generated
	@Selector("quarterSymbols")
	public native NSArray quarterSymbols();

	@Generated
	@Selector("rangeOfUnit:inUnit:forDate:")
	@ByValue
	public native NSRange rangeOfUnitInUnitForDate(long smaller, long larger,
			NSDate date);

	@Generated
	@Selector("rangeOfUnit:startDate:interval:forDate:")
	public native boolean rangeOfUnitStartDateIntervalForDate(long unit,
			Ptr<NSDate> datep, DoublePtr tip, NSDate date);

	@Generated
	@Selector("rangeOfWeekendStartDate:interval:containingDate:")
	public native boolean rangeOfWeekendStartDateIntervalContainingDate(
			Ptr<NSDate> datep, DoublePtr tip, NSDate date);

	@Generated
	@Selector("setFirstWeekday:")
	public native void setFirstWeekday(long weekday);

	@Generated
	@Selector("setLocale:")
	public native void setLocale(NSLocale locale);

	@Generated
	@Selector("setMinimumDaysInFirstWeek:")
	public native void setMinimumDaysInFirstWeek(long mdw);

	@Generated
	@Selector("setTimeZone:")
	public native void setTimeZone(NSTimeZone tz);

	@Generated
	@Selector("shortMonthSymbols")
	public native NSArray shortMonthSymbols();

	@Generated
	@Selector("shortQuarterSymbols")
	public native NSArray shortQuarterSymbols();

	@Generated
	@Selector("shortStandaloneMonthSymbols")
	public native NSArray shortStandaloneMonthSymbols();

	@Generated
	@Selector("shortStandaloneQuarterSymbols")
	public native NSArray shortStandaloneQuarterSymbols();

	@Generated
	@Selector("shortStandaloneWeekdaySymbols")
	public native NSArray shortStandaloneWeekdaySymbols();

	@Generated
	@Selector("shortWeekdaySymbols")
	public native NSArray shortWeekdaySymbols();

	@Generated
	@Selector("standaloneMonthSymbols")
	public native NSArray standaloneMonthSymbols();

	@Generated
	@Selector("standaloneQuarterSymbols")
	public native NSArray standaloneQuarterSymbols();

	@Generated
	@Selector("standaloneWeekdaySymbols")
	public native NSArray standaloneWeekdaySymbols();

	@Generated
	@Selector("startOfDayForDate:")
	public native NSDate startOfDayForDate(NSDate date);

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	@Generated
	@Selector("timeZone")
	public native NSTimeZone timeZone();

	@Generated
	@Selector("veryShortMonthSymbols")
	public native NSArray veryShortMonthSymbols();

	@Generated
	@Selector("veryShortStandaloneMonthSymbols")
	public native NSArray veryShortStandaloneMonthSymbols();

	@Generated
	@Selector("veryShortStandaloneWeekdaySymbols")
	public native NSArray veryShortStandaloneWeekdaySymbols();

	@Generated
	@Selector("veryShortWeekdaySymbols")
	public native NSArray veryShortWeekdaySymbols();

	@Generated
	@Selector("weekdaySymbols")
	public native NSArray weekdaySymbols();
}
