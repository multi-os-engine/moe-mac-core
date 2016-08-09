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
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSAttributedString;
import mac.foundation.NSFormatter;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSControl extends NSView {
	static {
		NatJ.register();
	}

	@Generated
	protected NSControl(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("abortEditing")
	public native boolean abortEditing();

	@Generated
	@Selector("action")
	public native SEL action();

	@Generated
	@Selector("alignment")
	public native long alignment();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSControl alloc();

	@Generated
	@Selector("allowsExpansionToolTips")
	public native boolean allowsExpansionToolTips();

	@Generated
	@Selector("attributedStringValue")
	public native NSAttributedString attributedStringValue();

	@Generated
	@Selector("baseWritingDirection")
	public native long baseWritingDirection();

	@Generated
	@Selector("calcSize")
	public native void calcSize();

	@Generated
	@Selector("cell")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object cell();

	@Generated
	@Selector("cellClass")
	public static native Class cellClass_static();

	@Generated
	@Selector("currentEditor")
	public native NSText currentEditor();

	@Generated
	@Selector("doubleValue")
	public native double doubleValue();

	@Generated
	@Selector("drawCell:")
	public native void drawCell(NSCell aCell);

	@Generated
	@Selector("drawCellInside:")
	public native void drawCellInside(NSCell aCell);

	@Generated
	@Selector("floatValue")
	public native float floatValue();

	@Generated
	@Selector("font")
	public native NSFont font();

	@Generated
	@Selector("formatter")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object formatter();

	@Generated
	@Selector("ignoresMultiClick")
	public native boolean ignoresMultiClick();

	@Generated
	@Selector("init")
	public native NSControl init();

	@Generated
	@Selector("initWithFrame:")
	public native NSControl initWithFrame(@ByValue CGRect frameRect);

	@Generated
	@Selector("intValue")
	public native int intValue();

	@Generated
	@Selector("integerValue")
	public native long integerValue();

	@Generated
	@Selector("invalidateIntrinsicContentSizeForCell:")
	public native void invalidateIntrinsicContentSizeForCell(NSCell cell);

	@Generated
	@Selector("isContinuous")
	public native boolean isContinuous();

	@Generated
	@Selector("isEnabled")
	public native boolean isEnabled();

	@Generated
	@Selector("mouseDown:")
	public native void mouseDown(NSEvent theEvent);

	@Generated
	@Selector("objectValue")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object objectValue();

	@Generated
	@Selector("performClick:")
	public native void performClick(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("refusesFirstResponder")
	public native boolean refusesFirstResponder();

	@Generated
	@Selector("selectCell:")
	public native void selectCell(NSCell aCell);

	@Generated
	@Selector("selectedCell")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object selectedCell();

	@Generated
	@Selector("selectedTag")
	public native long selectedTag();

	@Generated
	@Selector("sendAction:to:")
	public native boolean sendActionTo(SEL theAction,
			@Mapped(ObjCObjectMapper.class) Object theTarget);

	@Generated
	@Selector("sendActionOn:")
	public native long sendActionOn(long mask);

	@Generated
	@Selector("setAction:")
	public native void setAction(SEL aSelector);

	@Generated
	@Selector("setAlignment:")
	public native void setAlignment(long mode);

	@Generated
	@Selector("setAllowsExpansionToolTips:")
	public native void setAllowsExpansionToolTips(boolean value);

	@Generated
	@Selector("setAttributedStringValue:")
	public native void setAttributedStringValue(NSAttributedString obj);

	@Generated
	@Selector("setBaseWritingDirection:")
	public native void setBaseWritingDirection(long writingDirection);

	@Generated
	@Selector("setCell:")
	public native void setCell(NSCell aCell);

	@Generated
	@Selector("setCellClass:")
	public static native void setCellClass_static(Class factoryId);

	@Generated
	@Selector("setContinuous:")
	public native void setContinuous(boolean flag);

	@Generated
	@Selector("setDoubleValue:")
	public native void setDoubleValue(double aDouble);

	@Generated
	@Selector("setEnabled:")
	public native void setEnabled(boolean flag);

	@Generated
	@Selector("setFloatValue:")
	public native void setFloatValue(float aFloat);

	@Generated
	@Selector("setFloatingPointFormat:left:right:")
	public native void setFloatingPointFormatLeftRight(boolean autoRange,
			long leftDigits, long rightDigits);

	@Generated
	@Selector("setFont:")
	public native void setFont(NSFont fontObj);

	@Generated
	@Selector("setFormatter:")
	public native void setFormatter(NSFormatter newFormatter);

	@Generated
	@Selector("setIgnoresMultiClick:")
	public native void setIgnoresMultiClick(boolean flag);

	@Generated
	@Selector("setIntValue:")
	public native void setIntValue(int anInt);

	@Generated
	@Selector("setIntegerValue:")
	public native void setIntegerValue(long anInteger);

	@Generated
	@Selector("setNeedsDisplay")
	public native void setNeedsDisplay();

	@Generated
	@Selector("setObjectValue:")
	public native void setObjectValue(@Mapped(ObjCObjectMapper.class) Object obj);

	@Generated
	@Selector("setRefusesFirstResponder:")
	public native void setRefusesFirstResponder(boolean flag);

	@Generated
	@Selector("setStringValue:")
	public native void setStringValue(String aString);

	@Generated
	@Selector("setTag:")
	public native void setTag(long anInt);

	@Generated
	@Selector("setTarget:")
	public native void setTarget(@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("setUserInterfaceLayoutDirection:")
	public native void setUserInterfaceLayoutDirection(long value);

	@Generated
	@Selector("sizeToFit")
	public native void sizeToFit();

	@Generated
	@Selector("stringValue")
	public native String stringValue();

	@Generated
	@Selector("tag")
	public native long tag();

	@Generated
	@Selector("takeDoubleValueFrom:")
	public native void takeDoubleValueFrom(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("takeFloatValueFrom:")
	public native void takeFloatValueFrom(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("takeIntValueFrom:")
	public native void takeIntValueFrom(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("takeIntegerValueFrom:")
	public native void takeIntegerValueFrom(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("takeObjectValueFrom:")
	public native void takeObjectValueFrom(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("takeStringValueFrom:")
	public native void takeStringValueFrom(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("target")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object target();

	@Generated
	@Selector("updateCell:")
	public native void updateCell(NSCell aCell);

	@Generated
	@Selector("updateCellInside:")
	public native void updateCellInside(NSCell aCell);

	@Generated
	@Selector("userInterfaceLayoutDirection")
	public native long userInterfaceLayoutDirection();

	@Generated
	@Selector("validateEditing")
	public native void validateEditing();
}
