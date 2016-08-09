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

package mac.appkit.c;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.Inline;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.*;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.natj.objc.map.ObjCStringMapper;
import mac.appkit.NSColor;
import mac.appkit.NSImage;
import mac.appkit.NSPasteboard;
import mac.appkit.NSResponder;
import mac.appkit.struct.NSEdgeInsets;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.coregraphics.struct.CGSize;
import mac.foundation.NSArray;
import mac.foundation.NSDictionary;
import mac.foundation.NSString;

@Generated
@Library("AppKit")
@Runtime(CRuntime.class)
public final class AppKit {
	static {
		NatJ.register();
	}

	@Generated
	private AppKit() {
	}

	@Generated
	@CFunction
	public static native int NSBestDepth(
			@Mapped(ObjCStringMapper.class) String colorSpace, long bps,
			long bpp, boolean planar, BoolPtr exactMatch);

	@Generated
	@CFunction
	public static native boolean NSPlanarFromDepth(int depth);

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSColorSpaceFromDepth(int depth);

	@Generated
	@CFunction
	public static native long NSBitsPerSampleFromDepth(int depth);

	@Generated
	@CFunction
	public static native long NSBitsPerPixelFromDepth(int depth);

	@Generated
	@CFunction
	public static native long NSNumberOfColorComponents(
			@Mapped(ObjCStringMapper.class) String colorSpaceName);

	@Generated
	@CFunction
	public static native ConstIntPtr NSAvailableWindowDepths();

	@Generated
	@CFunction
	public static native void NSRectFill(@ByValue CGRect aRect);

	@Generated
	@CFunction
	public static native void NSRectFillList(
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect rects,
			long count);

	@Generated
	@CFunction
	public static native void NSRectFillListWithGrays(
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect rects,
			ConstDoublePtr grays, long num);

	@Generated
	@CFunction
	public static native void NSRectFillListWithColors(
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect rects,
			ConstPtr<NSColor> colors, long num);

	@Generated
	@CFunction
	public static native void NSRectFillUsingOperation(@ByValue CGRect aRect,
			long op);

	@Generated
	@CFunction
	public static native void NSRectFillListUsingOperation(
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect rects,
			long count, long op);

	@Generated
	@CFunction
	public static native void NSRectFillListWithColorsUsingOperation(
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect rects,
			ConstPtr<NSColor> colors, long num, long op);

	@Generated
	@CFunction
	public static native void NSFrameRect(@ByValue CGRect aRect);

	@Generated
	@CFunction
	public static native void NSFrameRectWithWidth(@ByValue CGRect aRect,
			double frameWidth);

	@Generated
	@CFunction
	public static native void NSFrameRectWithWidthUsingOperation(
			@ByValue CGRect aRect, double frameWidth, long op);

	@Generated
	@CFunction
	public static native void NSRectClip(@ByValue CGRect aRect);

	@Generated
	@CFunction
	public static native void NSRectClipList(
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect rects,
			long count);

	@Generated
	@CFunction
	@ByValue
	public static native CGRect NSDrawTiledRects(@ByValue CGRect boundsRect,
			@ByValue CGRect clipRect, ConstLongPtr sides, ConstDoublePtr grays,
			long count);

	@Generated
	@CFunction
	public static native void NSDrawGrayBezel(@ByValue CGRect aRect,
			@ByValue CGRect clipRect);

	@Generated
	@CFunction
	public static native void NSDrawGroove(@ByValue CGRect aRect,
			@ByValue CGRect clipRect);

	@Generated
	@CFunction
	public static native void NSDrawWhiteBezel(@ByValue CGRect aRect,
			@ByValue CGRect clipRect);

	@Generated
	@CFunction
	public static native void NSDrawButton(@ByValue CGRect aRect,
			@ByValue CGRect clipRect);

	@Generated
	@CFunction
	public static native void NSEraseRect(@ByValue CGRect aRect);

	@Generated
	@CFunction
	public static native NSColor NSReadPixel(@ByValue CGPoint passedPoint);

	@Generated
	@CFunction
	public static native void NSCopyBits(long srcGState,
			@ByValue CGRect srcRect, @ByValue CGPoint destPoint);

	@Generated
	@CFunction
	public static native void NSHighlightRect(@ByValue CGRect aRect);

	@Generated
	@CFunction
	public static native void NSBeep();

	@Generated
	@CFunction
	public static native long NSGetWindowServerMemory(long context,
			LongPtr virtualMemory, LongPtr windowBackingMemory,
			Ptr<NSString> windowDumpString);

	@Generated
	@CFunction
	@ByValue
	public static native CGRect NSDrawColorTiledRects(
			@ByValue CGRect boundsRect, @ByValue CGRect clipRect,
			ConstLongPtr sides, Ptr<NSColor> colors, long count);

	@Generated
	@CFunction
	public static native void NSDrawDarkBezel(@ByValue CGRect aRect,
			@ByValue CGRect clipRect);

	@Generated
	@CFunction
	public static native void NSDrawLightBezel(@ByValue CGRect aRect,
			@ByValue CGRect clipRect);

	@Generated
	@CFunction
	public static native void NSDottedFrameRect(@ByValue CGRect aRect);

	@Generated
	@CFunction
	public static native void NSDrawWindowBackground(@ByValue CGRect aRect);

	@Generated
	@CFunction
	public static native void NSSetFocusRingStyle(long placement);

	@Generated
	@CFunction
	public static native void NSDisableScreenUpdates();

	@Generated
	@CFunction
	public static native void NSEnableScreenUpdates();

	@Generated
	@CFunction
	public static native void NSShowAnimationEffect(long animationEffect,
			@ByValue CGPoint centerLocation, @ByValue CGSize size,
			@Mapped(ObjCObjectMapper.class) Object animationDelegate,
			SEL didEndSelector, VoidPtr contextInfo);

	@Generated
	@CFunction
	public static native void NSCountWindows(LongPtr count);

	@Generated
	@CFunction
	public static native void NSWindowList(long size, LongPtr list);

	@Generated
	@CFunction
	public static native void NSCountWindowsForContext(long context,
			LongPtr count);

	@Generated
	@CFunction
	public static native void NSWindowListForContext(long context, long size,
			LongPtr list);

	@Generated
	@CFunction
	public static native boolean NSAccessibilitySetMayContainProtectedContent(
			boolean flag);

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityRoleDescription(
			@Mapped(ObjCStringMapper.class) String role,
			@Mapped(ObjCStringMapper.class) String subrole);

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityRoleDescriptionForUIElement(
			@Mapped(ObjCObjectMapper.class) Object element);

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityActionDescription(
			@Mapped(ObjCStringMapper.class) String action);

	@Generated
	@CFunction
	public static native void NSAccessibilityRaiseBadArgumentException(
			@Mapped(ObjCObjectMapper.class) Object element,
			@Mapped(ObjCStringMapper.class) String attribute,
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object NSAccessibilityUnignoredAncestor(
			@Mapped(ObjCObjectMapper.class) Object element);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object NSAccessibilityUnignoredDescendant(
			@Mapped(ObjCObjectMapper.class) Object element);

	@Generated
	@CFunction
	public static native NSArray NSAccessibilityUnignoredChildren(
			NSArray originalChildren);

	@Generated
	@CFunction
	public static native NSArray NSAccessibilityUnignoredChildrenForOnlyChild(
			@Mapped(ObjCObjectMapper.class) Object originalChild);

	@Generated
	@CFunction
	public static native void NSAccessibilityPostNotification(
			@Mapped(ObjCObjectMapper.class) Object element,
			@Mapped(ObjCStringMapper.class) String notification);

	@Generated
	@CFunction
	public static native void NSAccessibilityPostNotificationWithUserInfo(
			@Mapped(ObjCObjectMapper.class) Object element,
			@Mapped(ObjCStringMapper.class) String notification,
			NSDictionary userInfo);

	@Generated
	@Inline
	@CFunction
	public static native long NSEventMaskFromType(long type);

	@Generated
	@CFunction
	public static native int NSApplicationMain(int argc, Ptr<ConstBytePtr> argv);

	@Generated
	@CFunction
	public static native boolean NSApplicationLoad();

	@Generated
	@CFunction
	public static native boolean NSShowsServicesMenuItem(
			@Mapped(ObjCStringMapper.class) String itemName);

	@Generated
	@CFunction
	public static native long NSSetShowsServicesMenuItem(
			@Mapped(ObjCStringMapper.class) String itemName, boolean enabled);

	@Generated
	@CFunction
	public static native void NSUpdateDynamicServices();

	@Generated
	@CFunction
	public static native boolean NSPerformService(
			@Mapped(ObjCStringMapper.class) String itemName, NSPasteboard pboard);

	@Generated
	@CFunction
	public static native void NSRegisterServicesProvider(
			@Mapped(ObjCObjectMapper.class) Object provider,
			@Mapped(ObjCStringMapper.class) String name);

	@Generated
	@CFunction
	public static native void NSUnregisterServicesProvider(
			@Mapped(ObjCStringMapper.class) String name);

	@Generated
	@CFunction
	public static native void NSDrawThreePartImage(@ByValue CGRect frame,
			NSImage startCap, NSImage centerFill, NSImage endCap,
			boolean vertical, long op, double alphaFraction, boolean flipped);

	@Generated
	@CFunction
	public static native void NSDrawNinePartImage(@ByValue CGRect frame,
			NSImage topLeftCorner, NSImage topEdgeFill, NSImage topRightCorner,
			NSImage leftEdgeFill, NSImage centerFill, NSImage rightEdgeFill,
			NSImage bottomLeftCorner, NSImage bottomEdgeFill,
			NSImage bottomRightCorner, long op, double alphaFraction,
			boolean flipped);

	@Generated
	@CFunction
	public static native long NSConvertGlyphsToPackedGlyphs(IntPtr glBuf,
			long count, long packing, BytePtr packedGlyphs);

	@Generated
	@CFunction
	public static native void NSReleaseAlertPanel(
			@Mapped(ObjCObjectMapper.class) Object panel);

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCreateFilenamePboardType(
			@Mapped(ObjCStringMapper.class) String fileType);

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCreateFileContentsPboardType(
			@Mapped(ObjCStringMapper.class) String fileType);

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSGetFileType(
			@Mapped(ObjCStringMapper.class) String pboardType);

	@Generated
	@CFunction
	public static native NSArray NSGetFileTypes(NSArray pboardTypes);

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native NSEdgeInsets NSEdgeInsetsMake(double top, double left,
			double bottom, double right);

	@Generated
	@CFunction
	public static native long NSInterfaceStyleForKey(
			@Mapped(ObjCStringMapper.class) String key, NSResponder responder);

	@Generated
	@CFunction
	public static native void NSOpenGLSetOption(int pname, int param);

	@Generated
	@CFunction
	public static native void NSOpenGLGetOption(int pname, IntPtr param);

	@Generated
	@CFunction
	public static native void NSOpenGLGetVersion(IntPtr major, IntPtr minor);

	@Generated
	@CFunction
	public static native boolean NSIsControllerMarker(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCalibratedWhiteColorSpace();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCalibratedRGBColorSpace();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDeviceWhiteColorSpace();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDeviceRGBColorSpace();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDeviceCMYKColorSpace();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSNamedColorSpace();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPatternColorSpace();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCustomColorSpace();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCalibratedBlackColorSpace();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDeviceBlackColorSpace();

	@Generated
	@CVariable()
	public static native double NSWhite();

	@Generated
	@CVariable()
	public static native double NSLightGray();

	@Generated
	@CVariable()
	public static native double NSDarkGray();

	@Generated
	@CVariable()
	public static native double NSBlack();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDeviceResolution();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDeviceColorSpaceName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDeviceBitsPerSample();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDeviceIsScreen();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDeviceIsPrinter();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDeviceSize();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSGraphicsContextDestinationAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSGraphicsContextRepresentationFormatAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSGraphicsContextPSFormat();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSGraphicsContextPDFFormat();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextLineTooLongException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextNoSelectionException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWordTablesWriteException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWordTablesReadException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextReadException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextWriteException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPasteboardCommunicationException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintingCommunicationException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAbortModalException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAbortPrintingException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSIllegalSelectorException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAppKitVirtualMemoryException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSBadRTFDirectiveException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSBadRTFFontTableException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSBadRTFStyleSheetException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTypedStreamVersionException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTIFFException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintPackageException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSBadRTFColorTableException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDraggingException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSColorListIOException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSColorListNotEditableException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSBadBitmapParametersException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWindowServerCommunicationException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontUnavailableException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPPDIncludeNotFoundException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPPDParseException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPPDIncludeStackOverflowException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPPDIncludeStackUnderflowException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSRTFPropertyStackOverflowException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAppKitIgnoredException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSBadComparisonException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageCacheException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSNibLoadingException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSBrowserIllegalDelegateException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityErrorCodeExceptionInfo();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityRoleAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityRoleDescriptionAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySubroleAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityHelpAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityValueAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityMinValueAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityMaxValueAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityEnabledAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityFocusedAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityParentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityChildrenAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityWindowAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityTopLevelUIElementAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySelectedChildrenAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityVisibleChildrenAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityPositionAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySizeAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityContentsAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityTitleAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityDescriptionAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityShownMenuAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityValueDescriptionAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityPreviousContentsAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityNextContentsAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityHeaderAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityEditedAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityTabsAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityHorizontalScrollBarAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityVerticalScrollBarAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityOverflowButtonAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityIncrementButtonAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityDecrementButtonAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityFilenameAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityExpandedAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySelectedAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySplittersAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityURLAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityIndexAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityRowCountAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityColumnCountAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityOrderedByRowAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityWarningValueAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityCriticalValueAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityPlaceholderValueAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityContainsProtectedContentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityTitleUIElementAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityServesAsTitleForUIElementsAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityLinkedUIElementsAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySelectedTextAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySelectedTextRangeAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityNumberOfCharactersAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityVisibleCharacterRangeAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySharedTextUIElementsAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySharedCharacterRangeAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityInsertionPointLineNumberAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySelectedTextRangesAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityLineForIndexParameterizedAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityRangeForLineParameterizedAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityStringForRangeParameterizedAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityRangeForPositionParameterizedAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityRangeForIndexParameterizedAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityBoundsForRangeParameterizedAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityRTFForRangeParameterizedAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityStyleRangeForIndexParameterizedAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityAttributedStringForRangeParameterizedAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityFontTextAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityForegroundColorTextAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityBackgroundColorTextAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityUnderlineColorTextAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityStrikethroughColorTextAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityUnderlineTextAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySuperscriptTextAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityStrikethroughTextAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityShadowTextAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityAttachmentTextAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityLinkTextAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityAutocorrectedTextAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityMisspelledTextAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityMarkedMisspelledTextAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityFontNameKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityFontFamilyKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityVisibleNameKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityFontSizeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityMainAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityMinimizedAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityCloseButtonAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityZoomButtonAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityMinimizeButtonAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityToolbarButtonAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityProxyAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityGrowAreaAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityModalAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityDefaultButtonAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityCancelButtonAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityFullScreenButtonAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityMenuBarAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityWindowsAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityFrontmostAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityHiddenAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityMainWindowAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityFocusedWindowAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityFocusedUIElementAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityExtrasMenuBarAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityOrientationAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityVerticalOrientationValue();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityHorizontalOrientationValue();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityUnknownOrientationValue();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityColumnTitlesAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySearchButtonAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySearchMenuAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityClearButtonAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityRowsAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityVisibleRowsAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySelectedRowsAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityColumnsAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityVisibleColumnsAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySelectedColumnsAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySortDirectionAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySelectedCellsAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityVisibleCellsAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityRowHeaderUIElementsAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityColumnHeaderUIElementsAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityCellForColumnAndRowParameterizedAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityRowIndexRangeAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityColumnIndexRangeAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityHorizontalUnitsAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityVerticalUnitsAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityHorizontalUnitDescriptionAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityVerticalUnitDescriptionAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityLayoutPointForScreenPointParameterizedAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityLayoutSizeForScreenSizeParameterizedAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityScreenPointForLayoutPointParameterizedAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityScreenSizeForLayoutSizeParameterizedAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityHandlesAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityAscendingSortDirectionValue();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityDescendingSortDirectionValue();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityUnknownSortDirectionValue();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityDisclosingAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityDisclosedRowsAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityDisclosedByRowAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityDisclosureLevelAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityAllowedValuesAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityLabelUIElementsAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityLabelValueAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityMatteHoleAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityMatteContentUIElementAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityMarkerUIElementsAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityMarkerValuesAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityMarkerGroupUIElementAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityUnitsAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityUnitDescriptionAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityMarkerTypeAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityMarkerTypeDescriptionAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityIdentifierAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityLeftTabStopMarkerTypeValue();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityRightTabStopMarkerTypeValue();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityCenterTabStopMarkerTypeValue();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityDecimalTabStopMarkerTypeValue();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityHeadIndentMarkerTypeValue();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityTailIndentMarkerTypeValue();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityFirstLineIndentMarkerTypeValue();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityUnknownMarkerTypeValue();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityInchesUnitValue();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityCentimetersUnitValue();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityPointsUnitValue();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityPicasUnitValue();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityUnknownUnitValue();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityPressAction();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityIncrementAction();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityDecrementAction();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityConfirmAction();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityPickAction();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityCancelAction();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityRaiseAction();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityShowMenuAction();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityDeleteAction();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityShowAlternateUIAction();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityShowDefaultUIAction();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityMainWindowChangedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityFocusedWindowChangedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityFocusedUIElementChangedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityApplicationActivatedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityApplicationDeactivatedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityApplicationHiddenNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityApplicationShownNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityWindowCreatedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityWindowMovedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityWindowResizedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityWindowMiniaturizedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityWindowDeminiaturizedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityDrawerCreatedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySheetCreatedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityUIElementDestroyedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityValueChangedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityTitleChangedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityResizedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityMovedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityCreatedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityLayoutChangedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityHelpTagCreatedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySelectedTextChangedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityRowCountChangedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySelectedChildrenChangedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySelectedRowsChangedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySelectedColumnsChangedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityRowExpandedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityRowCollapsedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySelectedCellsChangedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityUnitsChangedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySelectedChildrenMovedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityAnnouncementRequestedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityUnknownRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityButtonRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityRadioButtonRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityCheckBoxRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySliderRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityTabGroupRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityTextFieldRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityStaticTextRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityTextAreaRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityScrollAreaRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityPopUpButtonRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityMenuButtonRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityTableRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityApplicationRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityGroupRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityRadioGroupRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityListRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityScrollBarRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityValueIndicatorRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityImageRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityMenuBarRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityMenuRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityMenuItemRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityColumnRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityRowRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityToolbarRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityBusyIndicatorRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityProgressIndicatorRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityWindowRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityDrawerRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySystemWideRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityOutlineRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityIncrementorRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityBrowserRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityComboBoxRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySplitGroupRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySplitterRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityColorWellRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityGrowAreaRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySheetRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityHelpTagRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityMatteRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityRulerRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityRulerMarkerRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityLinkRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityDisclosureTriangleRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityGridRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityRelevanceIndicatorRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityLevelIndicatorRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityCellRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityPopoverRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityLayoutAreaRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityLayoutItemRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityHandleRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityUnknownSubrole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityCloseButtonSubrole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityZoomButtonSubrole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityMinimizeButtonSubrole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityToolbarButtonSubrole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityTableRowSubrole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityOutlineRowSubrole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySecureTextFieldSubrole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityStandardWindowSubrole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityDialogSubrole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySystemDialogSubrole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityFloatingWindowSubrole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySystemFloatingWindowSubrole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityIncrementArrowSubrole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityDecrementArrowSubrole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityIncrementPageSubrole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityDecrementPageSubrole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySearchFieldSubrole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityTextAttachmentSubrole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityTextLinkSubrole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityTimelineSubrole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySortButtonSubrole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityRatingIndicatorSubrole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityContentListSubrole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityDefinitionListSubrole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityFullScreenButtonSubrole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityToggleSubrole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySwitchSubrole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityDescriptionListSubrole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityUIElementsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityPriorityKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilityAnnouncementKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAccessibilitySortButtonRole();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceDesktopImageScalingKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceDesktopImageAllowClippingKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceDesktopImageFillColorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceApplicationKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceWillLaunchApplicationNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceDidLaunchApplicationNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceDidTerminateApplicationNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceDidHideApplicationNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceDidUnhideApplicationNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceDidActivateApplicationNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceDidDeactivateApplicationNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceVolumeLocalizedNameKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceVolumeURLKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceVolumeOldLocalizedNameKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceVolumeOldURLKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceDidMountNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceDidUnmountNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceWillUnmountNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceDidRenameVolumeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceWillPowerOffNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceWillSleepNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceDidWakeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceScreensDidSleepNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceScreensDidWakeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceSessionDidBecomeActiveNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceSessionDidResignActiveNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceDidPerformFileOperationNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceDidChangeFileLabelsNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceActiveSpaceDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceLaunchConfigurationAppleEvent();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceLaunchConfigurationArguments();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceLaunchConfigurationEnvironment();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceLaunchConfigurationArchitecture();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceMoveOperation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceCopyOperation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceLinkOperation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceCompressOperation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceDecompressOperation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceEncryptOperation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceDecryptOperation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceDestroyOperation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceRecycleOperation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWorkspaceDuplicateOperation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPlainFileType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDirectoryFileType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSApplicationFileType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFilesystemFileType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSShellCommandFileType();

	@Generated
	@CVariable()
	public static native double NSAppKitVersionNumber();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSModalPanelRunLoopMode();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSEventTrackingRunLoopMode();

	@Generated
	@CVariable()
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object NSApp();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSApplicationDidBecomeActiveNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSApplicationDidHideNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSApplicationDidFinishLaunchingNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSApplicationDidResignActiveNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSApplicationDidUnhideNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSApplicationDidUpdateNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSApplicationWillBecomeActiveNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSApplicationWillHideNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSApplicationWillFinishLaunchingNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSApplicationWillResignActiveNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSApplicationWillUnhideNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSApplicationWillUpdateNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSApplicationWillTerminateNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSApplicationDidChangeScreenParametersNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSApplicationLaunchIsDefaultLaunchKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSApplicationLaunchUserNotificationKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSApplicationLaunchRemoteNotificationKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSApplicationDidChangeOcclusionStateNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAnimationProgressMarkNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAnimationProgressMark();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSViewAnimationTargetKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSViewAnimationStartFrameKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSViewAnimationEndFrameKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSViewAnimationEffectKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSViewAnimationFadeInEffect();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSViewAnimationFadeOutEffect();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAnimationTriggerOrderIn();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAnimationTriggerOrderOut();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAppearanceNameAqua();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAppearanceNameLightContent();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFullScreenModeAllScreens();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFullScreenModeSetting();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFullScreenModeWindowLevel();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFullScreenModeApplicationPresentationOptions();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDefinitionPresentationTypeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDefinitionPresentationTypeOverlay();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDefinitionPresentationTypeDictionaryApplication();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSViewFrameDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSViewFocusDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSViewBoundsDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSViewGlobalFrameDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSViewDidUpdateTrackingAreasNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextDidBeginEditingNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextDidEndEditingNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTabColumnTerminatorsAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSControlTintDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSControlTextDidBeginEditingNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSControlTextDidEndEditingNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSControlTextDidChangeNotification();

	@Generated
	@CVariable()
	public static native ConstDoublePtr NSFontIdentityMatrix();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAntialiasThresholdChangedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontSetChangedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontCollectionIncludeDisabledFontsOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontCollectionRemoveDuplicatesOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontCollectionDisallowAutoActivationOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontCollectionDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontCollectionActionKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontCollectionNameKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontCollectionOldNameKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontCollectionVisibilityKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontCollectionWasShown();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontCollectionWasHidden();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontCollectionWasRenamed();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontCollectionAllFonts();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontCollectionUser();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontCollectionFavorites();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontCollectionRecentlyUsed();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontFamilyAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontNameAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontFaceAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontSizeAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontVisibleNameAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontMatrixAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontVariationAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontCharacterSetAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontCascadeListAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontTraitsAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontFixedAdvanceAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontFeatureSettingsAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontColorAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontSymbolicTrait();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontWeightTrait();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontWidthTrait();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontSlantTrait();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontVariationAxisIdentifierKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontVariationAxisMinimumValueKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontVariationAxisMaximumValueKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontVariationAxisDefaultValueKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontVariationAxisNameKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontFeatureTypeIdentifierKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontFeatureSelectorIdentifierKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWindowDidBecomeKeyNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWindowDidBecomeMainNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWindowDidChangeScreenNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWindowDidDeminiaturizeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWindowDidExposeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWindowDidMiniaturizeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWindowDidMoveNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWindowDidResignKeyNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWindowDidResignMainNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWindowDidResizeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWindowDidUpdateNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWindowWillCloseNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWindowWillMiniaturizeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWindowWillMoveNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWindowWillBeginSheetNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWindowDidEndSheetNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWindowDidChangeBackingPropertiesNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSBackingPropertyOldScaleFactorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSBackingPropertyOldColorSpaceKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWindowDidChangeScreenProfileNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWindowWillStartLiveResizeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWindowDidEndLiveResizeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWindowWillEnterFullScreenNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWindowDidEnterFullScreenNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWindowWillExitFullScreenNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWindowDidExitFullScreenNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWindowWillEnterVersionBrowserNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWindowDidEnterVersionBrowserNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWindowWillExitVersionBrowserNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWindowDidExitVersionBrowserNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWindowDidChangeOcclusionStateNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMenuWillSendActionNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMenuDidSendActionNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMenuDidAddItemNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMenuDidRemoveItemNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMenuDidChangeItemNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMenuDidBeginTrackingNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMenuDidEndTrackingNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPasteboardTypeString();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPasteboardTypePDF();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPasteboardTypeTIFF();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPasteboardTypePNG();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPasteboardTypeRTF();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPasteboardTypeRTFD();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPasteboardTypeHTML();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPasteboardTypeTabularText();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPasteboardTypeFont();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPasteboardTypeRuler();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPasteboardTypeColor();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPasteboardTypeSound();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPasteboardTypeMultipleTextSelection();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPasteboardTypeTextFinderOptions();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSGeneralPboard();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontPboard();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSRulerPboard();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFindPboard();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDragPboard();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPasteboardURLReadingFileURLsOnlyKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPasteboardURLReadingContentsConformToTypesKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStringPboardType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFilenamesPboardType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTIFFPboardType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSRTFPboardType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTabularTextPboardType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontPboardType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSRulerPboardType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSColorPboardType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSRTFDPboardType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHTMLPboardType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLPboardType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPDFPboardType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMultipleTextSelectionPboardType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPostScriptPboardType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSVCardPboardType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSInkTextPboardType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFilesPromisePboardType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPasteboardTypeFindPanelSearchOptions();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileContentsPboardType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPICTPboardType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSystemColorsDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageRepRegistryDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageCompressionMethod();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageCompressionFactor();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageDitherTransparency();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageRGBColorTable();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageInterlaced();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageColorSyncProfileData();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageFrameCount();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageCurrentFrame();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageCurrentFrameDuration();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageLoopCount();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageGamma();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageProgressive();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageEXIFData();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageFallbackBackgroundColor();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSBrowserColumnConfigurationDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSColorListDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSColorPanelColorDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDraggingImageComponentIconKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDraggingImageComponentLabelKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSContextHelpModeDidActivateNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSContextHelpModeDidDeactivateNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageHintCTM();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageHintInterpolation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameQuickLookTemplate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameBluetoothTemplate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameIChatTheaterTemplate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameSlideshowTemplate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameActionTemplate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameSmartBadgeTemplate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameIconViewTemplate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameListViewTemplate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameColumnViewTemplate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameFlowViewTemplate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNamePathTemplate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameInvalidDataFreestandingTemplate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameLockLockedTemplate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameLockUnlockedTemplate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameGoRightTemplate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameGoLeftTemplate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameRightFacingTriangleTemplate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameLeftFacingTriangleTemplate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameAddTemplate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameRemoveTemplate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameRevealFreestandingTemplate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameFollowLinkFreestandingTemplate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameEnterFullScreenTemplate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameExitFullScreenTemplate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameStopProgressTemplate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameStopProgressFreestandingTemplate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameRefreshTemplate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameRefreshFreestandingTemplate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameBonjour();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameComputer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameFolderBurnable();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameFolderSmart();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameFolder();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameNetwork();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameDotMac();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameMobileMe();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameMultipleDocuments();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameUserAccounts();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNamePreferencesGeneral();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameAdvanced();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameInfo();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameFontPanel();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameColorPanel();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameUser();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameUserGroup();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameEveryone();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameUserGuest();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameMenuOnStateTemplate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameMenuMixedStateTemplate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameApplicationIcon();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameTrashEmpty();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameTrashFull();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameHomeTemplate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameBookmarksTemplate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameCaution();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameStatusAvailable();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameStatusPartiallyAvailable();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameStatusUnavailable();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameStatusNone();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageNameShareTemplate();

	@Generated
	@CVariable()
	public static native double NSViewNoInstrinsicMetric();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSNibOwner();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSNibTopLevelObjects();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSVoiceName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSVoiceIdentifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSVoiceAge();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSVoiceGender();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSVoiceDemoText();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSVoiceLocaleIdentifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSVoiceSupportedCharacters();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSVoiceIndividuallySpokenCharacters();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSVoiceGenderNeuter();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSVoiceGenderMale();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSVoiceGenderFemale();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSVoiceLanguage();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechStatusProperty();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechErrorsProperty();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechInputModeProperty();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechCharacterModeProperty();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechNumberModeProperty();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechRateProperty();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechPitchBaseProperty();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechPitchModProperty();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechVolumeProperty();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechSynthesizerInfoProperty();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechRecentSyncProperty();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechPhonemeSymbolsProperty();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechCurrentVoiceProperty();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechCommandDelimiterProperty();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechResetProperty();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechOutputToFileURLProperty();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechModeText();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechModePhoneme();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechModeNormal();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechModeLiteral();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechStatusOutputBusy();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechStatusOutputPaused();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechStatusNumberOfCharactersLeft();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechStatusPhonemeCode();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechErrorCount();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechErrorOldestCode();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechErrorOldestCharacterOffset();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechErrorNewestCode();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechErrorNewestCharacterOffset();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechSynthesizerInfoIdentifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechSynthesizerInfoVersion();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechPhonemeInfoOpcode();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechPhonemeInfoSymbol();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechPhonemeInfoExample();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechPhonemeInfoHiliteStart();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechPhonemeInfoHiliteEnd();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechCommandPrefix();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechCommandSuffix();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechDictionaryLocaleIdentifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechDictionaryModificationDate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechDictionaryPronunciations();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechDictionaryAbbreviations();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechDictionaryEntrySpelling();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpeechDictionaryEntryPhonemes();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextCheckingOrthographyKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextCheckingQuotesKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextCheckingReplacementsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextCheckingReferenceDateKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextCheckingReferenceTimeZoneKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextCheckingDocumentURLKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextCheckingDocumentTitleKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextCheckingDocumentAuthorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextCheckingRegularExpressionsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpellCheckerDidChangeAutomaticSpellingCorrectionNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpellCheckerDidChangeAutomaticTextReplacementNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpellCheckerDidChangeAutomaticQuoteSubstitutionNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpellCheckerDidChangeAutomaticDashSubstitutionNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSplitViewWillResizeSubviewsNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSplitViewDidResizeSubviewsNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPopUpButtonWillPopUpNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintSpoolJob();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintPreviewJob();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintSaveJob();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintCancelJob();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintPaperName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintPaperSize();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintOrientation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintScalingFactor();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintLeftMargin();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintRightMargin();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintTopMargin();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintBottomMargin();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintHorizontallyCentered();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintVerticallyCentered();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintHorizontalPagination();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintVerticalPagination();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintPrinter();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintCopies();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintAllPages();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintFirstPage();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintLastPage();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintMustCollate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintReversePageOrder();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintJobDisposition();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintPagesAcross();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintPagesDown();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintTime();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintDetailedErrorReporting();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintFaxNumber();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintPrinterName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintSelectionOnly();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintJobSavingURL();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintJobSavingFileNameExtensionHidden();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintHeaderAndFooter();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintFormName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintJobFeatures();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintManualFeed();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintPagesPerSheet();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintPaperFeed();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintSavePath();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintOperationExistsException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintPhotoJobStyleHint();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintAllPresetsJobStyleHint();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintNoPresetsJobStyleHint();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintPanelAccessorySummaryItemNameKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrintPanelAccessorySummaryItemDescriptionKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSScreenColorSpaceDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPreferredScrollerStyleDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextFinderCaseInsensitiveKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextFinderMatchingTypeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSScrollViewWillStartLiveMagnifyNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSScrollViewDidEndLiveMagnifyNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSScrollViewWillStartLiveScrollNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSScrollViewDidLiveScrollNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSScrollViewDidEndLiveScrollNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSharingServiceNamePostOnFacebook();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSharingServiceNamePostOnTwitter();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSharingServiceNamePostOnSinaWeibo();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSharingServiceNamePostOnTencentWeibo();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSharingServiceNamePostOnLinkedIn();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSharingServiceNameComposeEmail();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSharingServiceNameComposeMessage();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSharingServiceNameSendViaAirDrop();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSharingServiceNameAddToSafariReadingList();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSharingServiceNameAddToIPhoto();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSharingServiceNameAddToAperture();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSharingServiceNameUseAsTwitterProfileImage();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSharingServiceNameUseAsFacebookProfileImage();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSharingServiceNameUseAsLinkedInProfileImage();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSharingServiceNameUseAsDesktopPicture();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSharingServiceNamePostImageOnFlickr();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSharingServiceNamePostVideoOnVimeo();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSharingServiceNamePostVideoOnYouku();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSharingServiceNamePostVideoOnTudou();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSComboBoxWillPopUpNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSComboBoxWillDismissNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSComboBoxSelectionDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSComboBoxSelectionIsChangingNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSParagraphStyleAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSForegroundColorAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSUnderlineStyleAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSuperscriptAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSBackgroundColorAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAttachmentAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLigatureAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSBaselineOffsetAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSKernAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinkAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStrokeWidthAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStrokeColorAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSUnderlineColorAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStrikethroughStyleAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStrikethroughColorAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSShadowAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSObliquenessAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSExpansionAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCursorAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSToolTipAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCharacterShapeAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSGlyphInfoAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWritingDirectionAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMarkedClauseSegmentAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSVerticalGlyphFormAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextAlternativesAttributeName();

	@Generated
	@CVariable()
	public static native long NSUnderlineByWordMask();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSpellingStateAttributeName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPlainTextDocumentType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSRTFTextDocumentType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSRTFDTextDocumentType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMacSimpleTextDocumentType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHTMLTextDocumentType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDocFormatTextDocumentType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWordMLTextDocumentType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWebArchiveTextDocumentType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSOfficeOpenXMLTextDocumentType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSOpenDocumentTextDocumentType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextLayoutSectionOrientation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextLayoutSectionRange();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPaperSizeDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLeftMarginDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSRightMarginDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTopMarginDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSBottomMarginDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSViewSizeDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSViewZoomDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSViewModeDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDocumentTypeDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSReadOnlyDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSConvertedDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCocoaVersionDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSBackgroundColorDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHyphenationFactorDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDefaultTabIntervalDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCharacterEncodingDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileTypeDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSUsesScreenFontsDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTitleDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCompanyDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCopyrightDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSubjectDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAuthorDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSKeywordsDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCommentDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSEditorDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCreationTimeDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSModificationTimeDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSManagerDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCategoryDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextLayoutSectionsAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSExcludedElementsDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextEncodingNameDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPrefixSpacesDocumentAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDocumentTypeDocumentOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDefaultAttributesDocumentOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCharacterEncodingDocumentOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextEncodingNameDocumentOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSBaseURLDocumentOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTimeoutDocumentOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWebPreferencesDocumentOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWebResourceLoadDelegateDocumentOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextSizeMultiplierDocumentOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileTypeDocumentOption();

	@Generated
	@CVariable()
	public static native long NSUnderlineStrikethroughMask();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAllRomanInputSourcesLocaleIdentifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextViewWillChangeNotifyingTextViewNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextViewDidChangeSelectionNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextViewDidChangeTypingAttributesNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFindPanelSearchOptionsPboardType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFindPanelCaseInsensitiveSearch();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFindPanelSubstringMatch();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTableViewSelectionDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTableViewColumnDidMoveNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTableViewColumnDidResizeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTableViewSelectionIsChangingNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTableViewRowViewKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSOutlineViewDisclosureButtonKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSOutlineViewShowHideButtonKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSOutlineViewSelectionDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSOutlineViewColumnDidMoveNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSOutlineViewColumnDidResizeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSOutlineViewSelectionIsChangingNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSOutlineViewItemWillExpandNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSOutlineViewItemDidExpandNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSOutlineViewItemWillCollapseNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSOutlineViewItemDidCollapseNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextStorageWillProcessEditingNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextStorageDidProcessEditingNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSInterfaceStyleDefault();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPopUpButtonCellWillPopUpNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSoundPboardType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDrawerWillOpenNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDrawerDidOpenNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDrawerWillCloseNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDrawerDidCloseNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSToolbarWillAddItemNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSToolbarDidRemoveItemNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSToolbarSeparatorItemIdentifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSToolbarSpaceItemIdentifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSToolbarFlexibleSpaceItemIdentifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSToolbarShowColorsItemIdentifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSToolbarShowFontsItemIdentifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSToolbarCustomizeToolbarItemIdentifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSToolbarPrintItemIdentifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object NSMultipleValuesMarker();

	@Generated
	@CVariable()
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object NSNoSelectionMarker();

	@Generated
	@CVariable()
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object NSNotApplicableMarker();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSObservedObjectKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSObservedKeyPathKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSOptionsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAlignmentBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAlternateImageBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAlternateTitleBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAnimateBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAnimationDelayBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSArgumentBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAttributedStringBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSContentArrayBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSContentArrayForMultipleSelectionBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSContentBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSContentDictionaryBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSContentHeightBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSContentObjectBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSContentObjectsBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSContentSetBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSContentValuesBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSContentWidthBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCriticalValueBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDataBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDisplayPatternTitleBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDisplayPatternValueBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDocumentEditedBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDoubleClickArgumentBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDoubleClickTargetBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSEditableBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSEnabledBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSExcludedKeysBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFilterPredicateBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontBoldBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontFamilyNameBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontItalicBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontNameBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFontSizeBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHeaderTitleBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHiddenBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSImageBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSIncludedKeysBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSInitialKeyBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSInitialValueBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSIsIndeterminateBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLabelBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLocalizedKeyDictionaryBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSManagedObjectContextBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMaximumRecentsBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMaxValueBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMaxWidthBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMinValueBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMinWidthBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMixedStateImageBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSOffStateImageBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSOnStateImageBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPositioningRectBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPredicateBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSRecentSearchesBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSRepresentedFilenameBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSRowHeightBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSelectedIdentifierBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSelectedIndexBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSelectedLabelBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSelectedObjectBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSelectedObjectsBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSelectedTagBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSelectedValueBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSelectedValuesBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSelectionIndexesBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSelectionIndexPathsBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSortDescriptorsBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTargetBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextColorBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTitleBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSToolTipBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTransparentBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSValueBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSValuePathBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSValueURLBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSVisibleBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWarningValueBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWidthBinding();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAllowsEditingMultipleValuesSelectionBindingOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAllowsNullArgumentBindingOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAlwaysPresentsApplicationModalAlertsBindingOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSConditionallySetsEditableBindingOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSConditionallySetsEnabledBindingOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSConditionallySetsHiddenBindingOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSContinuouslyUpdatesValueBindingOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCreatesSortDescriptorBindingOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDeletesObjectsOnRemoveBindingsOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDisplayNameBindingOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDisplayPatternBindingOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSContentPlacementTagBindingOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHandlesContentAsCompoundValueBindingOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSInsertsNullPlaceholderBindingOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSInvokesSeparatelyWithArrayObjectsBindingOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMultipleValuesPlaceholderBindingOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSNoSelectionPlaceholderBindingOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSNotApplicablePlaceholderBindingOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSNullPlaceholderBindingOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSRaisesForNotApplicableKeysBindingOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPredicateFormatBindingOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSelectorNameBindingOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSelectsAllWhenSettingContentBindingOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSValidatesImmediatelyBindingOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSValueTransformerNameBindingOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSValueTransformerBindingOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSRuleEditorPredicateLeftExpression();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSRuleEditorPredicateRightExpression();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSRuleEditorPredicateComparisonModifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSRuleEditorPredicateOptions();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSRuleEditorPredicateOperatorType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSRuleEditorPredicateCustomSelector();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSRuleEditorPredicateCompoundType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSRuleEditorRowsDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPopoverCloseReasonKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPopoverCloseReasonStandard();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPopoverCloseReasonDetachToWindow();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPopoverWillShowNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPopoverDidShowNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPopoverWillCloseNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPopoverDidCloseNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextInputContextKeyboardSelectionDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSApplicationDidFinishRestoringWindowsNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextAlternativesSelectedAlternativeStringNotification();
}
