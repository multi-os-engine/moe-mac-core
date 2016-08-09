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
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSCalendar;
import mac.foundation.NSDate;
import mac.foundation.NSLocale;
import mac.foundation.NSTimeZone;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSDatePicker extends NSControl {
	static {
		NatJ.register();
	}

	@Generated
	protected NSDatePicker(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSDatePicker alloc();

	@Generated
	@Selector("backgroundColor")
	public native NSColor backgroundColor();

	@Generated
	@Selector("calendar")
	public native NSCalendar calendar();

	@Generated
	@Selector("datePickerElements")
	public native long datePickerElements();

	@Generated
	@Selector("datePickerMode")
	public native long datePickerMode();

	@Generated
	@Selector("datePickerStyle")
	public native long datePickerStyle();

	@Generated
	@Selector("dateValue")
	public native NSDate dateValue();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("drawsBackground")
	public native boolean drawsBackground();

	@Generated
	@Selector("init")
	public native NSDatePicker init();

	@Generated
	@Selector("initWithFrame:")
	public native NSDatePicker initWithFrame(@ByValue CGRect frameRect);

	@Generated
	@Selector("isBezeled")
	public native boolean isBezeled();

	@Generated
	@Selector("isBordered")
	public native boolean isBordered();

	@Generated
	@Selector("locale")
	public native NSLocale locale();

	@Generated
	@Selector("maxDate")
	public native NSDate maxDate();

	@Generated
	@Selector("minDate")
	public native NSDate minDate();

	@Generated
	@Selector("setBackgroundColor:")
	public native void setBackgroundColor(NSColor color);

	@Generated
	@Selector("setBezeled:")
	public native void setBezeled(boolean flag);

	@Generated
	@Selector("setBordered:")
	public native void setBordered(boolean flag);

	@Generated
	@Selector("setCalendar:")
	public native void setCalendar(NSCalendar newCalendar);

	@Generated
	@Selector("setDatePickerElements:")
	public native void setDatePickerElements(long elementFlags);

	@Generated
	@Selector("setDatePickerMode:")
	public native void setDatePickerMode(long newMode);

	@Generated
	@Selector("setDatePickerStyle:")
	public native void setDatePickerStyle(long newStyle);

	@Generated
	@Selector("setDateValue:")
	public native void setDateValue(NSDate newStartDate);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("setDrawsBackground:")
	public native void setDrawsBackground(boolean flag);

	@Generated
	@Selector("setLocale:")
	public native void setLocale(NSLocale newLocale);

	@Generated
	@Selector("setMaxDate:")
	public native void setMaxDate(NSDate date);

	@Generated
	@Selector("setMinDate:")
	public native void setMinDate(NSDate date);

	@Generated
	@Selector("setTextColor:")
	public native void setTextColor(NSColor color);

	@Generated
	@Selector("setTimeInterval:")
	public native void setTimeInterval(double newTimeInterval);

	@Generated
	@Selector("setTimeZone:")
	public native void setTimeZone(NSTimeZone newTimeZone);

	@Generated
	@Selector("textColor")
	public native NSColor textColor();

	@Generated
	@Selector("timeInterval")
	public native double timeInterval();

	@Generated
	@Selector("timeZone")
	public native NSTimeZone timeZone();
}
