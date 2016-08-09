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
import org.moe.natj.general.ptr.ConstDoublePtr;
import org.moe.natj.general.ptr.DoublePtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.appkit.protocol.NSPasteboardReading;
import mac.appkit.protocol.NSPasteboardWriting;
import mac.coregraphics.opaque.CGColorRef;
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSArray;
import mac.foundation.NSCoder;
import mac.foundation.NSDictionary;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;
import mac.quartzcore.CIColor;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSColor extends NSObject implements NSCopying, NSCoding,
		NSPasteboardReading, NSPasteboardWriting {
	static {
		NatJ.register();
	}

	@Generated
	protected NSColor(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("CGColor")
	public native CGColorRef CGColor();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSColor alloc();

	@Generated
	@Selector("alphaComponent")
	public native double alphaComponent();

	@Generated
	@Selector("alternateSelectedControlColor")
	public static native NSColor alternateSelectedControlColor();

	@Generated
	@Selector("alternateSelectedControlTextColor")
	public static native NSColor alternateSelectedControlTextColor();

	@Generated
	@Selector("blackColor")
	public static native NSColor blackColor();

	@Generated
	@Selector("blackComponent")
	public native double blackComponent();

	@Generated
	@Selector("blendedColorWithFraction:ofColor:")
	public native NSColor blendedColorWithFractionOfColor(double fraction,
			NSColor color);

	@Generated
	@Selector("blueColor")
	public static native NSColor blueColor();

	@Generated
	@Selector("blueComponent")
	public native double blueComponent();

	@Generated
	@Selector("brightnessComponent")
	public native double brightnessComponent();

	@Generated
	@Selector("brownColor")
	public static native NSColor brownColor();

	@Generated
	@Selector("catalogNameComponent")
	public native String catalogNameComponent();

	@Generated
	@Selector("clearColor")
	public static native NSColor clearColor();

	@Generated
	@Selector("colorForControlTint:")
	public static native NSColor colorForControlTint(long controlTint);

	@Generated
	@Selector("colorFromPasteboard:")
	public static native NSColor colorFromPasteboard(NSPasteboard pasteBoard);

	@Generated
	@Selector("colorNameComponent")
	public native String colorNameComponent();

	@Generated
	@Selector("colorSpace")
	public native NSColorSpace colorSpace();

	@Generated
	@Selector("colorSpaceName")
	public native String colorSpaceName();

	@Generated
	@Selector("colorUsingColorSpace:")
	public native NSColor colorUsingColorSpace(NSColorSpace space);

	@Generated
	@Selector("colorUsingColorSpaceName:")
	public native NSColor colorUsingColorSpaceName(String colorSpace);

	@Generated
	@Selector("colorUsingColorSpaceName:device:")
	public native NSColor colorUsingColorSpaceNameDevice(String colorSpace,
			NSDictionary deviceDescription);

	@Generated
	@Selector("colorWithAlphaComponent:")
	public native NSColor colorWithAlphaComponent(double alpha);

	@Generated
	@Selector("colorWithCGColor:")
	public static native NSColor colorWithCGColor(CGColorRef cgColor);

	@Generated
	@Selector("colorWithCIColor:")
	public static native NSColor colorWithCIColor(CIColor color);

	@Generated
	@Selector("colorWithCalibratedHue:saturation:brightness:alpha:")
	public static native NSColor colorWithCalibratedHueSaturationBrightnessAlpha(
			double hue, double saturation, double brightness, double alpha);

	@Generated
	@Selector("colorWithCalibratedRed:green:blue:alpha:")
	public static native NSColor colorWithCalibratedRedGreenBlueAlpha(
			double red, double green, double blue, double alpha);

	@Generated
	@Selector("colorWithCalibratedWhite:alpha:")
	public static native NSColor colorWithCalibratedWhiteAlpha(double white,
			double alpha);

	@Generated
	@Selector("colorWithCatalogName:colorName:")
	public static native NSColor colorWithCatalogNameColorName(String listName,
			String colorName);

	@Generated
	@Selector("colorWithColorSpace:components:count:")
	public static native NSColor colorWithColorSpaceComponentsCount(
			NSColorSpace space, ConstDoublePtr components,
			long numberOfComponents);

	@Generated
	@Selector("colorWithDeviceCyan:magenta:yellow:black:alpha:")
	public static native NSColor colorWithDeviceCyanMagentaYellowBlackAlpha(
			double cyan, double magenta, double yellow, double black,
			double alpha);

	@Generated
	@Selector("colorWithDeviceHue:saturation:brightness:alpha:")
	public static native NSColor colorWithDeviceHueSaturationBrightnessAlpha(
			double hue, double saturation, double brightness, double alpha);

	@Generated
	@Selector("colorWithDeviceRed:green:blue:alpha:")
	public static native NSColor colorWithDeviceRedGreenBlueAlpha(double red,
			double green, double blue, double alpha);

	@Generated
	@Selector("colorWithDeviceWhite:alpha:")
	public static native NSColor colorWithDeviceWhiteAlpha(double white,
			double alpha);

	@Generated
	@Selector("colorWithGenericGamma22White:alpha:")
	public static native NSColor colorWithGenericGamma22WhiteAlpha(
			double white, double alpha);

	@Generated
	@Selector("colorWithHue:saturation:brightness:alpha:")
	public static native NSColor colorWithHueSaturationBrightnessAlpha(
			double hue, double saturation, double brightness, double alpha);

	@Generated
	@Selector("colorWithPatternImage:")
	public static native NSColor colorWithPatternImage(NSImage image);

	@Generated
	@Selector("colorWithRed:green:blue:alpha:")
	public static native NSColor colorWithRedGreenBlueAlpha(double red,
			double green, double blue, double alpha);

	@Generated
	@Selector("colorWithSRGBRed:green:blue:alpha:")
	public static native NSColor colorWithSRGBRedGreenBlueAlpha(double red,
			double green, double blue, double alpha);

	@Generated
	@Selector("colorWithWhite:alpha:")
	public static native NSColor colorWithWhiteAlpha(double white, double alpha);

	@Generated
	@Selector("controlAlternatingRowBackgroundColors")
	public static native NSArray controlAlternatingRowBackgroundColors();

	@Generated
	@Selector("controlBackgroundColor")
	public static native NSColor controlBackgroundColor();

	@Generated
	@Selector("controlColor")
	public static native NSColor controlColor();

	@Generated
	@Selector("controlDarkShadowColor")
	public static native NSColor controlDarkShadowColor();

	@Generated
	@Selector("controlHighlightColor")
	public static native NSColor controlHighlightColor();

	@Generated
	@Selector("controlLightHighlightColor")
	public static native NSColor controlLightHighlightColor();

	@Generated
	@Selector("controlShadowColor")
	public static native NSColor controlShadowColor();

	@Generated
	@Selector("controlTextColor")
	public static native NSColor controlTextColor();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("currentControlTint")
	public static native long currentControlTint();

	@Generated
	@Selector("cyanColor")
	public static native NSColor cyanColor();

	@Generated
	@Selector("cyanComponent")
	public native double cyanComponent();

	@Generated
	@Selector("darkGrayColor")
	public static native NSColor darkGrayColor();

	@Generated
	@Selector("disabledControlTextColor")
	public static native NSColor disabledControlTextColor();

	@Generated
	@Selector("drawSwatchInRect:")
	public native void drawSwatchInRect(@ByValue CGRect rect);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("getComponents:")
	public native void getComponents(DoublePtr components);

	@Generated
	@Selector("getCyan:magenta:yellow:black:alpha:")
	public native void getCyanMagentaYellowBlackAlpha(DoublePtr cyan,
			DoublePtr magenta, DoublePtr yellow, DoublePtr black,
			DoublePtr alpha);

	@Generated
	@Selector("getHue:saturation:brightness:alpha:")
	public native void getHueSaturationBrightnessAlpha(DoublePtr hue,
			DoublePtr saturation, DoublePtr brightness, DoublePtr alpha);

	@Generated
	@Selector("getRed:green:blue:alpha:")
	public native void getRedGreenBlueAlpha(DoublePtr red, DoublePtr green,
			DoublePtr blue, DoublePtr alpha);

	@Generated
	@Selector("getWhite:alpha:")
	public native void getWhiteAlpha(DoublePtr white, DoublePtr alpha);

	@Generated
	@Selector("grayColor")
	public static native NSColor grayColor();

	@Generated
	@Selector("greenColor")
	public static native NSColor greenColor();

	@Generated
	@Selector("greenComponent")
	public native double greenComponent();

	@Generated
	@Selector("gridColor")
	public static native NSColor gridColor();

	@Generated
	@Selector("headerColor")
	public static native NSColor headerColor();

	@Generated
	@Selector("headerTextColor")
	public static native NSColor headerTextColor();

	@Generated
	@Selector("highlightColor")
	public static native NSColor highlightColor();

	@Generated
	@Selector("highlightWithLevel:")
	public native NSColor highlightWithLevel(double val);

	@Generated
	@Selector("hueComponent")
	public native double hueComponent();

	@Generated
	@Selector("ignoresAlpha")
	public static native boolean ignoresAlpha();

	@Generated
	@Selector("init")
	public native NSColor init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@IsOptional
	@Selector("initWithPasteboardPropertyList:ofType:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithPasteboardPropertyListOfType(
			@Mapped(ObjCObjectMapper.class) Object propertyList, String type);

	@Generated
	@Selector("keyboardFocusIndicatorColor")
	public static native NSColor keyboardFocusIndicatorColor();

	@Generated
	@Selector("knobColor")
	public static native NSColor knobColor();

	@Generated
	@Selector("lightGrayColor")
	public static native NSColor lightGrayColor();

	@Generated
	@Selector("localizedCatalogNameComponent")
	public native String localizedCatalogNameComponent();

	@Generated
	@Selector("localizedColorNameComponent")
	public native String localizedColorNameComponent();

	@Generated
	@Selector("magentaColor")
	public static native NSColor magentaColor();

	@Generated
	@Selector("magentaComponent")
	public native double magentaComponent();

	@Generated
	@Selector("numberOfComponents")
	public native long numberOfComponents();

	@Generated
	@Selector("orangeColor")
	public static native NSColor orangeColor();

	@Generated
	@Selector("pasteboardPropertyListForType:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object pasteboardPropertyListForType(String type);

	@Generated
	@Selector("patternImage")
	public native NSImage patternImage();

	@Generated
	@Selector("purpleColor")
	public static native NSColor purpleColor();

	@Generated
	@Selector("readableTypesForPasteboard:")
	public static native NSArray readableTypesForPasteboard(
			NSPasteboard pasteboard);

	@Generated
	@ProtocolClassMethod("readableTypesForPasteboard")
	public NSArray _readableTypesForPasteboard(NSPasteboard pasteboard) {
		return readableTypesForPasteboard(pasteboard);
	}

	@Generated
	@IsOptional
	@Selector("readingOptionsForType:pasteboard:")
	public static native long readingOptionsForTypePasteboard(String type,
			NSPasteboard pasteboard);

	@Generated
	@IsOptional
	@ProtocolClassMethod("readingOptionsForTypePasteboard")
	public long _readingOptionsForTypePasteboard(String type,
			NSPasteboard pasteboard) {
		return readingOptionsForTypePasteboard(type, pasteboard);
	}

	@Generated
	@Selector("redColor")
	public static native NSColor redColor();

	@Generated
	@Selector("redComponent")
	public native double redComponent();

	@Generated
	@Selector("saturationComponent")
	public native double saturationComponent();

	@Generated
	@Selector("scrollBarColor")
	public static native NSColor scrollBarColor();

	@Generated
	@Selector("secondarySelectedControlColor")
	public static native NSColor secondarySelectedControlColor();

	@Generated
	@Selector("selectedControlColor")
	public static native NSColor selectedControlColor();

	@Generated
	@Selector("selectedControlTextColor")
	public static native NSColor selectedControlTextColor();

	@Generated
	@Selector("selectedKnobColor")
	public static native NSColor selectedKnobColor();

	@Generated
	@Selector("selectedMenuItemColor")
	public static native NSColor selectedMenuItemColor();

	@Generated
	@Selector("selectedMenuItemTextColor")
	public static native NSColor selectedMenuItemTextColor();

	@Generated
	@Selector("selectedTextBackgroundColor")
	public static native NSColor selectedTextBackgroundColor();

	@Generated
	@Selector("selectedTextColor")
	public static native NSColor selectedTextColor();

	@Generated
	@Selector("set")
	public native void set();

	@Generated
	@Selector("setFill")
	public native void setFill();

	@Generated
	@Selector("setIgnoresAlpha:")
	public static native void setIgnoresAlpha(boolean flag);

	@Generated
	@Selector("setStroke")
	public native void setStroke();

	@Generated
	@Selector("shadowColor")
	public static native NSColor shadowColor();

	@Generated
	@Selector("shadowWithLevel:")
	public native NSColor shadowWithLevel(double val);

	@Generated
	@Selector("textBackgroundColor")
	public static native NSColor textBackgroundColor();

	@Generated
	@Selector("textColor")
	public static native NSColor textColor();

	@Generated
	@Selector("underPageBackgroundColor")
	public static native NSColor underPageBackgroundColor();

	@Generated
	@Selector("whiteColor")
	public static native NSColor whiteColor();

	@Generated
	@Selector("whiteComponent")
	public native double whiteComponent();

	@Generated
	@Selector("windowBackgroundColor")
	public static native NSColor windowBackgroundColor();

	@Generated
	@Selector("windowFrameColor")
	public static native NSColor windowFrameColor();

	@Generated
	@Selector("windowFrameTextColor")
	public static native NSColor windowFrameTextColor();

	@Generated
	@Selector("writableTypesForPasteboard:")
	public native NSArray writableTypesForPasteboard(NSPasteboard pasteboard);

	@Generated
	@Selector("writeToPasteboard:")
	public native void writeToPasteboard(NSPasteboard pasteBoard);

	@Generated
	@IsOptional
	@Selector("writingOptionsForType:pasteboard:")
	public native long writingOptionsForTypePasteboard(String type,
			NSPasteboard pasteboard);

	@Generated
	@Selector("yellowColor")
	public static native NSColor yellowColor();

	@Generated
	@Selector("yellowComponent")
	public native double yellowComponent();
}
