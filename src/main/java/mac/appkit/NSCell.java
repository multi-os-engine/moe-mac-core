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
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.appkit.protocol.NSUserInterfaceItemIdentification;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.coregraphics.struct.CGSize;
import mac.foundation.NSArray;
import mac.foundation.NSAttributedString;
import mac.foundation.NSCoder;
import mac.foundation.NSFormatter;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSCell extends NSObject implements NSCopying, NSCoding,
		NSUserInterfaceItemIdentification {
	static {
		NatJ.register();
	}

	@Generated
	protected NSCell(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("acceptsFirstResponder")
	public native boolean acceptsFirstResponder();

	@Generated
	@Selector("action")
	public native SEL action();

	@Generated
	@Selector("alignment")
	public native long alignment();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSCell alloc();

	@Generated
	@Selector("allowsEditingTextAttributes")
	public native boolean allowsEditingTextAttributes();

	@Generated
	@Selector("allowsMixedState")
	public native boolean allowsMixedState();

	@Generated
	@Selector("allowsUndo")
	public native boolean allowsUndo();

	@Generated
	@Selector("attributedStringValue")
	public native NSAttributedString attributedStringValue();

	@Generated
	@Selector("backgroundStyle")
	public native long backgroundStyle();

	@Generated
	@Selector("baseWritingDirection")
	public native long baseWritingDirection();

	@Generated
	@Selector("calcDrawInfo:")
	public native void calcDrawInfo(@ByValue CGRect aRect);

	@Generated
	@Selector("cellAttribute:")
	public native long cellAttribute(long aParameter);

	@Generated
	@Selector("cellSize")
	@ByValue
	public native CGSize cellSize();

	@Generated
	@Selector("cellSizeForBounds:")
	@ByValue
	public native CGSize cellSizeForBounds(@ByValue CGRect aRect);

	@Generated
	@Selector("compare:")
	public native long compare(@Mapped(ObjCObjectMapper.class) Object otherCell);

	@Generated
	@Selector("continueTracking:at:inView:")
	public native boolean continueTrackingAtInView(@ByValue CGPoint lastPoint,
			@ByValue CGPoint currentPoint, NSView controlView);

	@Generated
	@Selector("controlSize")
	public native long controlSize();

	@Generated
	@Selector("controlTint")
	public native long controlTint();

	@Generated
	@Selector("controlView")
	public native NSView controlView();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("defaultFocusRingType")
	public static native long defaultFocusRingType();

	@Generated
	@Selector("defaultMenu")
	public static native NSMenu defaultMenu();

	@Generated
	@Selector("doubleValue")
	public native double doubleValue();

	@Generated
	@Selector("draggingImageComponentsWithFrame:inView:")
	public native NSArray draggingImageComponentsWithFrameInView(
			@ByValue CGRect frame, NSView view);

	@Generated
	@Selector("drawFocusRingMaskWithFrame:inView:")
	public native void drawFocusRingMaskWithFrameInView(
			@ByValue CGRect cellFrame, NSView controlView);

	@Generated
	@Selector("drawInteriorWithFrame:inView:")
	public native void drawInteriorWithFrameInView(@ByValue CGRect cellFrame,
			NSView controlView);

	@Generated
	@Selector("drawWithExpansionFrame:inView:")
	public native void drawWithExpansionFrameInView(@ByValue CGRect cellFrame,
			NSView view);

	@Generated
	@Selector("drawWithFrame:inView:")
	public native void drawWithFrameInView(@ByValue CGRect cellFrame,
			NSView controlView);

	@Generated
	@Selector("drawingRectForBounds:")
	@ByValue
	public native CGRect drawingRectForBounds(@ByValue CGRect theRect);

	@Generated
	@Selector("editWithFrame:inView:editor:delegate:event:")
	public native void editWithFrameInViewEditorDelegateEvent(
			@ByValue CGRect aRect, NSView controlView, NSText textObj,
			@Mapped(ObjCObjectMapper.class) Object anObject, NSEvent theEvent);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("endEditing:")
	public native void endEditing(NSText textObj);

	@Generated
	@Selector("entryType")
	public native long entryType();

	@Generated
	@Selector("expansionFrameWithFrame:inView:")
	@ByValue
	public native CGRect expansionFrameWithFrameInView(
			@ByValue CGRect cellFrame, NSView view);

	@Generated
	@Selector("fieldEditorForView:")
	public native NSTextView fieldEditorForView(NSView aControlView);

	@Generated
	@Selector("floatValue")
	public native float floatValue();

	@Generated
	@Selector("focusRingMaskBoundsForFrame:inView:")
	@ByValue
	public native CGRect focusRingMaskBoundsForFrameInView(
			@ByValue CGRect cellFrame, NSView controlView);

	@Generated
	@Selector("focusRingType")
	public native long focusRingType();

	@Generated
	@Selector("font")
	public native NSFont font();

	@Generated
	@Selector("formatter")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object formatter();

	@Generated
	@Selector("getPeriodicDelay:interval:")
	public native void getPeriodicDelayInterval(FloatPtr delay,
			FloatPtr interval);

	@Generated
	@Selector("hasValidObjectValue")
	public native boolean hasValidObjectValue();

	@Generated
	@Selector("highlight:withFrame:inView:")
	public native void highlightWithFrameInView(boolean flag,
			@ByValue CGRect cellFrame, NSView controlView);

	@Generated
	@Selector("highlightColorWithFrame:inView:")
	public native NSColor highlightColorWithFrameInView(
			@ByValue CGRect cellFrame, NSView controlView);

	@Generated
	@Selector("hitTestForEvent:inRect:ofView:")
	public native long hitTestForEventInRectOfView(NSEvent event,
			@ByValue CGRect cellFrame, NSView controlView);

	@Generated
	@Selector("identifier")
	public native String identifier();

	@Generated
	@Selector("image")
	public native NSImage image();

	@Generated
	@Selector("imageRectForBounds:")
	@ByValue
	public native CGRect imageRectForBounds(@ByValue CGRect theRect);

	@Generated
	@Selector("importsGraphics")
	public native boolean importsGraphics();

	@Generated
	@Selector("init")
	public native NSCell init();

	@Generated
	@Selector("initImageCell:")
	public native NSCell initImageCell(NSImage image);

	@Generated
	@Selector("initTextCell:")
	public native NSCell initTextCell(String aString);

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("intValue")
	public native int intValue();

	@Generated
	@Selector("integerValue")
	public native long integerValue();

	@Generated
	@Selector("interiorBackgroundStyle")
	public native long interiorBackgroundStyle();

	@Generated
	@Selector("isBezeled")
	public native boolean isBezeled();

	@Generated
	@Selector("isBordered")
	public native boolean isBordered();

	@Generated
	@Selector("isContinuous")
	public native boolean isContinuous();

	@Generated
	@Selector("isEditable")
	public native boolean isEditable();

	@Generated
	@Selector("isEnabled")
	public native boolean isEnabled();

	@Generated
	@Selector("isEntryAcceptable:")
	public native boolean isEntryAcceptable(String aString);

	@Generated
	@Selector("isHighlighted")
	public native boolean isHighlighted();

	@Generated
	@Selector("isOpaque")
	public native boolean isOpaque();

	@Generated
	@Selector("isScrollable")
	public native boolean isScrollable();

	@Generated
	@Selector("isSelectable")
	public native boolean isSelectable();

	@Generated
	@Selector("keyEquivalent")
	public native String keyEquivalent();

	@Generated
	@Selector("lineBreakMode")
	public native long lineBreakMode();

	@Generated
	@Selector("menu")
	public native NSMenu menu();

	@Generated
	@Selector("menuForEvent:inRect:ofView:")
	public native NSMenu menuForEventInRectOfView(NSEvent event,
			@ByValue CGRect cellFrame, NSView view);

	@Generated
	@Selector("mnemonic")
	public native String mnemonic();

	@Generated
	@Selector("mnemonicLocation")
	public native long mnemonicLocation();

	@Generated
	@Selector("mouseDownFlags")
	public native long mouseDownFlags();

	@Generated
	@Selector("nextState")
	public native long nextState();

	@Generated
	@Selector("objectValue")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object objectValue();

	@Generated
	@Selector("performClick:")
	public native void performClick(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("prefersTrackingUntilMouseUp")
	public static native boolean prefersTrackingUntilMouseUp();

	@Generated
	@Selector("refusesFirstResponder")
	public native boolean refusesFirstResponder();

	@Generated
	@Selector("representedObject")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object representedObject();

	@Generated
	@Selector("resetCursorRect:inView:")
	public native void resetCursorRectInView(@ByValue CGRect cellFrame,
			NSView controlView);

	@Generated
	@Selector("selectWithFrame:inView:editor:delegate:start:length:")
	public native void selectWithFrameInViewEditorDelegateStartLength(
			@ByValue CGRect aRect, NSView controlView, NSText textObj,
			@Mapped(ObjCObjectMapper.class) Object anObject, long selStart,
			long selLength);

	@Generated
	@Selector("sendActionOn:")
	public native long sendActionOn(long mask);

	@Generated
	@Selector("sendsActionOnEndEditing")
	public native boolean sendsActionOnEndEditing();

	@Generated
	@Selector("setAction:")
	public native void setAction(SEL aSelector);

	@Generated
	@Selector("setAlignment:")
	public native void setAlignment(long mode);

	@Generated
	@Selector("setAllowsEditingTextAttributes:")
	public native void setAllowsEditingTextAttributes(boolean flag);

	@Generated
	@Selector("setAllowsMixedState:")
	public native void setAllowsMixedState(boolean flag);

	@Generated
	@Selector("setAllowsUndo:")
	public native void setAllowsUndo(boolean allowsUndo);

	@Generated
	@Selector("setAttributedStringValue:")
	public native void setAttributedStringValue(NSAttributedString obj);

	@Generated
	@Selector("setBackgroundStyle:")
	public native void setBackgroundStyle(long style);

	@Generated
	@Selector("setBaseWritingDirection:")
	public native void setBaseWritingDirection(long writingDirection);

	@Generated
	@Selector("setBezeled:")
	public native void setBezeled(boolean flag);

	@Generated
	@Selector("setBordered:")
	public native void setBordered(boolean flag);

	@Generated
	@Selector("setCellAttribute:to:")
	public native void setCellAttributeTo(long aParameter, long value);

	@Generated
	@Selector("setContinuous:")
	public native void setContinuous(boolean flag);

	@Generated
	@Selector("setControlSize:")
	public native void setControlSize(long size);

	@Generated
	@Selector("setControlTint:")
	public native void setControlTint(long controlTint);

	@Generated
	@Selector("setControlView:")
	public native void setControlView(NSView view);

	@Generated
	@Selector("setDoubleValue:")
	public native void setDoubleValue(double aDouble);

	@Generated
	@Selector("setEditable:")
	public native void setEditable(boolean flag);

	@Generated
	@Selector("setEnabled:")
	public native void setEnabled(boolean flag);

	@Generated
	@Selector("setEntryType:")
	public native void setEntryType(long aType);

	@Generated
	@Selector("setFloatValue:")
	public native void setFloatValue(float aFloat);

	@Generated
	@Selector("setFloatingPointFormat:left:right:")
	public native void setFloatingPointFormatLeftRight(boolean autoRange,
			long leftDigits, long rightDigits);

	@Generated
	@Selector("setFocusRingType:")
	public native void setFocusRingType(long focusRingType);

	@Generated
	@Selector("setFont:")
	public native void setFont(NSFont fontObj);

	@Generated
	@Selector("setFormatter:")
	public native void setFormatter(NSFormatter newFormatter);

	@Generated
	@Selector("setHighlighted:")
	public native void setHighlighted(boolean flag);

	@Generated
	@Selector("setIdentifier:")
	public native void setIdentifier(String value);

	@Generated
	@Selector("setImage:")
	public native void setImage(NSImage image);

	@Generated
	@Selector("setImportsGraphics:")
	public native void setImportsGraphics(boolean flag);

	@Generated
	@Selector("setIntValue:")
	public native void setIntValue(int anInt);

	@Generated
	@Selector("setIntegerValue:")
	public native void setIntegerValue(long anInteger);

	@Generated
	@Selector("setLineBreakMode:")
	public native void setLineBreakMode(long mode);

	@Generated
	@Selector("setMenu:")
	public native void setMenu(NSMenu aMenu);

	@Generated
	@Selector("setMnemonicLocation:")
	public native void setMnemonicLocation(long location);

	@Generated
	@Selector("setNextState")
	public native void setNextState();

	@Generated
	@Selector("setObjectValue:")
	public native void setObjectValue(@Mapped(ObjCObjectMapper.class) Object obj);

	@Generated
	@Selector("setRefusesFirstResponder:")
	public native void setRefusesFirstResponder(boolean flag);

	@Generated
	@Selector("setRepresentedObject:")
	public native void setRepresentedObject(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("setScrollable:")
	public native void setScrollable(boolean flag);

	@Generated
	@Selector("setSelectable:")
	public native void setSelectable(boolean flag);

	@Generated
	@Selector("setSendsActionOnEndEditing:")
	public native void setSendsActionOnEndEditing(boolean flag);

	@Generated
	@Selector("setShowsFirstResponder:")
	public native void setShowsFirstResponder(boolean showFR);

	@Generated
	@Selector("setState:")
	public native void setState(long value);

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
	@Selector("setTitle:")
	public native void setTitle(String aString);

	@Generated
	@Selector("setTitleWithMnemonic:")
	public native void setTitleWithMnemonic(String stringWithAmpersand);

	@Generated
	@Selector("setTruncatesLastVisibleLine:")
	public native void setTruncatesLastVisibleLine(boolean flag);

	@Generated
	@Selector("setType:")
	public native void setType(long aType);

	@Generated
	@Selector("setUpFieldEditorAttributes:")
	public native NSText setUpFieldEditorAttributes(NSText textObj);

	@Generated
	@Selector("setUserInterfaceLayoutDirection:")
	public native void setUserInterfaceLayoutDirection(long layoutDirection);

	@Generated
	@Selector("setUsesSingleLineMode:")
	public native void setUsesSingleLineMode(boolean flag);

	@Generated
	@Selector("setWraps:")
	public native void setWraps(boolean flag);

	@Generated
	@Selector("showsFirstResponder")
	public native boolean showsFirstResponder();

	@Generated
	@Selector("startTrackingAt:inView:")
	public native boolean startTrackingAtInView(@ByValue CGPoint startPoint,
			NSView controlView);

	@Generated
	@Selector("state")
	public native long state();

	@Generated
	@Selector("stopTracking:at:inView:mouseIsUp:")
	public native void stopTrackingAtInViewMouseIsUp(
			@ByValue CGPoint lastPoint, @ByValue CGPoint stopPoint,
			NSView controlView, boolean flag);

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
	@Selector("title")
	public native String title();

	@Generated
	@Selector("titleRectForBounds:")
	@ByValue
	public native CGRect titleRectForBounds(@ByValue CGRect theRect);

	@Generated
	@Selector("trackMouse:inRect:ofView:untilMouseUp:")
	public native boolean trackMouseInRectOfViewUntilMouseUp(NSEvent theEvent,
			@ByValue CGRect cellFrame, NSView controlView, boolean flag);

	@Generated
	@Selector("truncatesLastVisibleLine")
	public native boolean truncatesLastVisibleLine();

	@Generated
	@Selector("type")
	public native long type();

	@Generated
	@Selector("userInterfaceLayoutDirection")
	public native long userInterfaceLayoutDirection();

	@Generated
	@Selector("usesSingleLineMode")
	public native boolean usesSingleLineMode();

	@Generated
	@Selector("wantsNotificationForMarkedText")
	public native boolean wantsNotificationForMarkedText();

	@Generated
	@Selector("wraps")
	public native boolean wraps();
}
