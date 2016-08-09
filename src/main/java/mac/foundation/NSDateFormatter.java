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
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import mac.foundation.struct.NSRange;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSDateFormatter extends NSFormatter {
	static {
		NatJ.register();
	}

	@Generated
	protected NSDateFormatter(Pointer peer) {
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
	public static native NSDateFormatter alloc();

	@Generated
	@Selector("allowsNaturalLanguage")
	public native boolean allowsNaturalLanguage();

	@Generated
	@Selector("calendar")
	public native NSCalendar calendar();

	@Generated
	@Selector("dateFormat")
	public native String dateFormat();

	@Generated
	@Selector("dateFormatFromTemplate:options:locale:")
	public static native String dateFormatFromTemplateOptionsLocale(
			String tmplate, long opts, NSLocale locale);

	@Generated
	@Selector("dateFromString:")
	public native NSDate dateFromString(String string);

	@Generated
	@Selector("dateStyle")
	public native long dateStyle();

	@Generated
	@Selector("defaultDate")
	public native NSDate defaultDate();

	@Generated
	@Selector("defaultFormatterBehavior")
	public static native long defaultFormatterBehavior();

	@Generated
	@Selector("doesRelativeDateFormatting")
	public native boolean doesRelativeDateFormatting();

	@Generated
	@Selector("eraSymbols")
	public native NSArray eraSymbols();

	@Generated
	@Selector("formatterBehavior")
	public native long formatterBehavior();

	@Generated
	@Selector("generatesCalendarDates")
	public native boolean generatesCalendarDates();

	@Generated
	@Selector("getObjectValue:forString:range:error:")
	public native boolean getObjectValueForStringRangeError(
			Ptr<? extends ObjCObject> obj,
			String string,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange rangep,
			Ptr<NSError> error);

	@Generated
	@Selector("gregorianStartDate")
	public native NSDate gregorianStartDate();

	@Generated
	@Selector("init")
	public native NSDateFormatter init();

	@Generated
	@Selector("initWithDateFormat:allowNaturalLanguage:")
	public native NSDateFormatter initWithDateFormatAllowNaturalLanguage(
			String format, boolean flag);

	@Generated
	@Selector("isLenient")
	public native boolean isLenient();

	@Generated
	@Selector("locale")
	public native NSLocale locale();

	@Generated
	@Selector("localizedStringFromDate:dateStyle:timeStyle:")
	public static native String localizedStringFromDateDateStyleTimeStyle(
			NSDate date, long dstyle, long tstyle);

	@Generated
	@Selector("longEraSymbols")
	public native NSArray longEraSymbols();

	@Generated
	@Selector("monthSymbols")
	public native NSArray monthSymbols();

	@Generated
	@Selector("quarterSymbols")
	public native NSArray quarterSymbols();

	@Generated
	@Selector("setAMSymbol:")
	public native void setAMSymbol(String string);

	@Generated
	@Selector("setCalendar:")
	public native void setCalendar(NSCalendar calendar);

	@Generated
	@Selector("setDateFormat:")
	public native void setDateFormat(String string);

	@Generated
	@Selector("setDateStyle:")
	public native void setDateStyle(long style);

	@Generated
	@Selector("setDefaultDate:")
	public native void setDefaultDate(NSDate date);

	@Generated
	@Selector("setDefaultFormatterBehavior:")
	public static native void setDefaultFormatterBehavior(long behavior);

	@Generated
	@Selector("setDoesRelativeDateFormatting:")
	public native void setDoesRelativeDateFormatting(boolean b);

	@Generated
	@Selector("setEraSymbols:")
	public native void setEraSymbols(NSArray array);

	@Generated
	@Selector("setFormatterBehavior:")
	public native void setFormatterBehavior(long behavior);

	@Generated
	@Selector("setGeneratesCalendarDates:")
	public native void setGeneratesCalendarDates(boolean b);

	@Generated
	@Selector("setGregorianStartDate:")
	public native void setGregorianStartDate(NSDate date);

	@Generated
	@Selector("setLenient:")
	public native void setLenient(boolean b);

	@Generated
	@Selector("setLocale:")
	public native void setLocale(NSLocale locale);

	@Generated
	@Selector("setLongEraSymbols:")
	public native void setLongEraSymbols(NSArray array);

	@Generated
	@Selector("setMonthSymbols:")
	public native void setMonthSymbols(NSArray array);

	@Generated
	@Selector("setPMSymbol:")
	public native void setPMSymbol(String string);

	@Generated
	@Selector("setQuarterSymbols:")
	public native void setQuarterSymbols(NSArray array);

	@Generated
	@Selector("setShortMonthSymbols:")
	public native void setShortMonthSymbols(NSArray array);

	@Generated
	@Selector("setShortQuarterSymbols:")
	public native void setShortQuarterSymbols(NSArray array);

	@Generated
	@Selector("setShortStandaloneMonthSymbols:")
	public native void setShortStandaloneMonthSymbols(NSArray array);

	@Generated
	@Selector("setShortStandaloneQuarterSymbols:")
	public native void setShortStandaloneQuarterSymbols(NSArray array);

	@Generated
	@Selector("setShortStandaloneWeekdaySymbols:")
	public native void setShortStandaloneWeekdaySymbols(NSArray array);

	@Generated
	@Selector("setShortWeekdaySymbols:")
	public native void setShortWeekdaySymbols(NSArray array);

	@Generated
	@Selector("setStandaloneMonthSymbols:")
	public native void setStandaloneMonthSymbols(NSArray array);

	@Generated
	@Selector("setStandaloneQuarterSymbols:")
	public native void setStandaloneQuarterSymbols(NSArray array);

	@Generated
	@Selector("setStandaloneWeekdaySymbols:")
	public native void setStandaloneWeekdaySymbols(NSArray array);

	@Generated
	@Selector("setTimeStyle:")
	public native void setTimeStyle(long style);

	@Generated
	@Selector("setTimeZone:")
	public native void setTimeZone(NSTimeZone tz);

	@Generated
	@Selector("setTwoDigitStartDate:")
	public native void setTwoDigitStartDate(NSDate date);

	@Generated
	@Selector("setVeryShortMonthSymbols:")
	public native void setVeryShortMonthSymbols(NSArray array);

	@Generated
	@Selector("setVeryShortStandaloneMonthSymbols:")
	public native void setVeryShortStandaloneMonthSymbols(NSArray array);

	@Generated
	@Selector("setVeryShortStandaloneWeekdaySymbols:")
	public native void setVeryShortStandaloneWeekdaySymbols(NSArray array);

	@Generated
	@Selector("setVeryShortWeekdaySymbols:")
	public native void setVeryShortWeekdaySymbols(NSArray array);

	@Generated
	@Selector("setWeekdaySymbols:")
	public native void setWeekdaySymbols(NSArray array);

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
	@Selector("stringFromDate:")
	public native String stringFromDate(NSDate date);

	@Generated
	@Selector("timeStyle")
	public native long timeStyle();

	@Generated
	@Selector("timeZone")
	public native NSTimeZone timeZone();

	@Generated
	@Selector("twoDigitStartDate")
	public native NSDate twoDigitStartDate();

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
