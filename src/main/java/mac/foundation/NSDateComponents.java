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
public class NSDateComponents extends NSObject implements NSCopying,
		NSSecureCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSDateComponents(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSDateComponents alloc();

	@Generated
	@Selector("calendar")
	public native NSCalendar calendar();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("date")
	public native NSDate date();

	@Generated
	@Selector("day")
	public native long day();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("era")
	public native long era();

	@Generated
	@Selector("hour")
	public native long hour();

	@Generated
	@Selector("init")
	public native NSDateComponents init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("isLeapMonth")
	public native boolean isLeapMonth();

	@Generated
	@Selector("isValidDate")
	public native boolean isValidDate();

	@Generated
	@Selector("isValidDateInCalendar:")
	public native boolean isValidDateInCalendar(NSCalendar calendar);

	@Generated
	@Selector("minute")
	public native long minute();

	@Generated
	@Selector("month")
	public native long month();

	@Generated
	@Selector("nanosecond")
	public native long nanosecond();

	@Generated
	@Selector("quarter")
	public native long quarter();

	@Generated
	@Selector("second")
	public native long second();

	@Generated
	@Selector("setCalendar:")
	public native void setCalendar(NSCalendar cal);

	@Generated
	@Selector("setDay:")
	public native void setDay(long v);

	@Generated
	@Selector("setEra:")
	public native void setEra(long v);

	@Generated
	@Selector("setHour:")
	public native void setHour(long v);

	@Generated
	@Selector("setLeapMonth:")
	public native void setLeapMonth(boolean lm);

	@Generated
	@Selector("setMinute:")
	public native void setMinute(long v);

	@Generated
	@Selector("setMonth:")
	public native void setMonth(long v);

	@Generated
	@Selector("setNanosecond:")
	public native void setNanosecond(long value);

	@Generated
	@Selector("setQuarter:")
	public native void setQuarter(long v);

	@Generated
	@Selector("setSecond:")
	public native void setSecond(long v);

	@Generated
	@Selector("setTimeZone:")
	public native void setTimeZone(NSTimeZone tz);

	@Generated
	@Selector("setValue:forComponent:")
	public native void setValueForComponent(long value, long unit);

	@Generated
	@Selector("setWeek:")
	public native void setWeek(long v);

	@Generated
	@Selector("setWeekOfMonth:")
	public native void setWeekOfMonth(long w);

	@Generated
	@Selector("setWeekOfYear:")
	public native void setWeekOfYear(long w);

	@Generated
	@Selector("setWeekday:")
	public native void setWeekday(long v);

	@Generated
	@Selector("setWeekdayOrdinal:")
	public native void setWeekdayOrdinal(long v);

	@Generated
	@Selector("setYear:")
	public native void setYear(long v);

	@Generated
	@Selector("setYearForWeekOfYear:")
	public native void setYearForWeekOfYear(long y);

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
	@Selector("valueForComponent:")
	public native long valueForComponent(long unit);

	@Generated
	@Selector("week")
	public native long week();

	@Generated
	@Selector("weekOfMonth")
	public native long weekOfMonth();

	@Generated
	@Selector("weekOfYear")
	public native long weekOfYear();

	@Generated
	@Selector("weekday")
	public native long weekday();

	@Generated
	@Selector("weekdayOrdinal")
	public native long weekdayOrdinal();

	@Generated
	@Selector("year")
	public native long year();

	@Generated
	@Selector("yearForWeekOfYear")
	public native long yearForWeekOfYear();
}
