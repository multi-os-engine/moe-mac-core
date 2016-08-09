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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.appkit.protocol.NSAnimatablePropertyContainer;
import mac.appkit.protocol.NSAppearanceCustomization;
import mac.appkit.protocol.NSUserInterfaceItemIdentification;
import mac.appkit.protocol.NSUserInterfaceValidations;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.coregraphics.struct.CGSize;
import mac.foundation.*;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSWindow extends NSResponder implements
		NSAnimatablePropertyContainer, NSUserInterfaceValidations,
		NSUserInterfaceItemIdentification, NSAppearanceCustomization {
	static {
		NatJ.register();
	}

	@Generated
	protected NSWindow(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("acceptsMouseMovedEvents")
	public native boolean acceptsMouseMovedEvents();

	@Generated
	@Selector("addChildWindow:ordered:")
	public native void addChildWindowOrdered(NSWindow childWin, long place);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSWindow alloc();

	@Generated
	@Selector("allowsConcurrentViewDrawing")
	public native boolean allowsConcurrentViewDrawing();

	@Generated
	@Selector("allowsToolTipsWhenApplicationIsInactive")
	public native boolean allowsToolTipsWhenApplicationIsInactive();

	@Generated
	@Selector("alphaValue")
	public native double alphaValue();

	@Generated
	@Selector("anchorAttributeForOrientation:")
	public native long anchorAttributeForOrientation(long orientation);

	@Generated
	@Selector("animationBehavior")
	public native long animationBehavior();

	@Generated
	@Selector("animationForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object animationForKey(String key);

	@Generated
	@Selector("animationResizeTime:")
	public native double animationResizeTime(@ByValue CGRect newFrame);

	@Generated
	@Selector("animations")
	public native NSDictionary animations();

	@Generated
	@Selector("animator")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object animator();

	@Generated
	@Selector("appearance")
	public native NSAppearance appearance();

	@Generated
	@Selector("areCursorRectsEnabled")
	public native boolean areCursorRectsEnabled();

	@Generated
	@Selector("aspectRatio")
	@ByValue
	public native CGSize aspectRatio();

	@Generated
	@Selector("attachedSheet")
	public native NSWindow attachedSheet();

	@Generated
	@Selector("autorecalculatesContentBorderThicknessForEdge:")
	public native boolean autorecalculatesContentBorderThicknessForEdge(
			long edge);

	@Generated
	@Selector("autorecalculatesKeyViewLoop")
	public native boolean autorecalculatesKeyViewLoop();

	@Generated
	@Selector("backgroundColor")
	public native NSColor backgroundColor();

	@Generated
	@Selector("backingAlignedRect:options:")
	@ByValue
	public native CGRect backingAlignedRectOptions(@ByValue CGRect aRect,
			long options);

	@Generated
	@Selector("backingLocation")
	public native long backingLocation();

	@Generated
	@Selector("backingScaleFactor")
	public native double backingScaleFactor();

	@Generated
	@Selector("backingType")
	public native long backingType();

	@Generated
	@Selector("becomeKeyWindow")
	public native void becomeKeyWindow();

	@Generated
	@Selector("becomeMainWindow")
	public native void becomeMainWindow();

	@Generated
	@Selector("beginCriticalSheet:completionHandler:")
	public native void beginCriticalSheetCompletionHandler(
			NSWindow sheetWindow,
			@ObjCBlock(name = "call_beginCriticalSheetCompletionHandler") Block_beginCriticalSheetCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_beginCriticalSheetCompletionHandler {
		@Generated
		public void call_beginCriticalSheetCompletionHandler(long arg0);
	}

	@Generated
	@Selector("beginSheet:completionHandler:")
	public native void beginSheetCompletionHandler(
			NSWindow sheetWindow,
			@ObjCBlock(name = "call_beginSheetCompletionHandler") Block_beginSheetCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_beginSheetCompletionHandler {
		@Generated
		public void call_beginSheetCompletionHandler(long arg0);
	}

	@Generated
	@Selector("cacheImageInRect:")
	public native void cacheImageInRect(@ByValue CGRect aRect);

	@Generated
	@Selector("canBeVisibleOnAllSpaces")
	public native boolean canBeVisibleOnAllSpaces();

	@Generated
	@Selector("canBecomeKeyWindow")
	public native boolean canBecomeKeyWindow();

	@Generated
	@Selector("canBecomeMainWindow")
	public native boolean canBecomeMainWindow();

	@Generated
	@Selector("canBecomeVisibleWithoutLogin")
	public native boolean canBecomeVisibleWithoutLogin();

	@Generated
	@Selector("canHide")
	public native boolean canHide();

	@Generated
	@Selector("canStoreColor")
	public native boolean canStoreColor();

	@Generated
	@Selector("cascadeTopLeftFromPoint:")
	@ByValue
	public native CGPoint cascadeTopLeftFromPoint(@ByValue CGPoint topLeftPoint);

	@Generated
	@Selector("center")
	public native void center();

	@Generated
	@Selector("childWindows")
	public native NSArray childWindows();

	@Generated
	@Selector("close")
	public native void close();

	@Generated
	@Selector("collectionBehavior")
	public native long collectionBehavior();

	@Generated
	@Selector("colorSpace")
	public native NSColorSpace colorSpace();

	@Generated
	@Selector("constrainFrameRect:toScreen:")
	@ByValue
	public native CGRect constrainFrameRectToScreen(@ByValue CGRect frameRect,
			NSScreen screen);

	@Generated
	@Selector("contentAspectRatio")
	@ByValue
	public native CGSize contentAspectRatio();

	@Generated
	@Selector("contentBorderThicknessForEdge:")
	public native double contentBorderThicknessForEdge(long edge);

	@Generated
	@Selector("contentMaxSize")
	@ByValue
	public native CGSize contentMaxSize();

	@Generated
	@Selector("contentMinSize")
	@ByValue
	public native CGSize contentMinSize();

	@Generated
	@Selector("contentRectForFrameRect:")
	@ByValue
	public native CGRect contentRectForFrameRect(@ByValue CGRect frameRect);

	@Generated
	@Selector("contentRectForFrameRect:styleMask:")
	@ByValue
	public static native CGRect contentRectForFrameRectStyleMask(
			@ByValue CGRect fRect, long aStyle);

	@Generated
	@Selector("contentResizeIncrements")
	@ByValue
	public native CGSize contentResizeIncrements();

	@Generated
	@Selector("contentView")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object contentView();

	@Generated
	@Selector("convertBaseToScreen:")
	@ByValue
	public native CGPoint convertBaseToScreen(@ByValue CGPoint aPoint);

	@Generated
	@Selector("convertRectFromBacking:")
	@ByValue
	public native CGRect convertRectFromBacking(@ByValue CGRect aRect);

	@Generated
	@Selector("convertRectFromScreen:")
	@ByValue
	public native CGRect convertRectFromScreen(@ByValue CGRect aRect);

	@Generated
	@Selector("convertRectToBacking:")
	@ByValue
	public native CGRect convertRectToBacking(@ByValue CGRect aRect);

	@Generated
	@Selector("convertRectToScreen:")
	@ByValue
	public native CGRect convertRectToScreen(@ByValue CGRect aRect);

	@Generated
	@Selector("convertScreenToBase:")
	@ByValue
	public native CGPoint convertScreenToBase(@ByValue CGPoint aPoint);

	@Generated
	@Selector("currentEvent")
	public native NSEvent currentEvent();

	@Generated
	@Selector("dataWithEPSInsideRect:")
	public native NSData dataWithEPSInsideRect(@ByValue CGRect rect);

	@Generated
	@Selector("dataWithPDFInsideRect:")
	public native NSData dataWithPDFInsideRect(@ByValue CGRect rect);

	@Generated
	@Selector("deepestScreen")
	public native NSScreen deepestScreen();

	@Generated
	@Selector("defaultAnimationForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object defaultAnimationForKey(String key);

	@Generated
	@ProtocolClassMethod("defaultAnimationForKey")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _defaultAnimationForKey(String key) {
		return defaultAnimationForKey(key);
	}

	@Generated
	@Selector("defaultButtonCell")
	public native NSButtonCell defaultButtonCell();

	@Generated
	@Selector("defaultDepthLimit")
	public static native int defaultDepthLimit();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("deminiaturize:")
	public native void deminiaturize(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("depthLimit")
	public native int depthLimit();

	@Generated
	@Selector("deviceDescription")
	public native NSDictionary deviceDescription();

	@Generated
	@Selector("disableCursorRects")
	public native void disableCursorRects();

	@Generated
	@Selector("disableFlushWindow")
	public native void disableFlushWindow();

	@Generated
	@Selector("disableKeyEquivalentForDefaultButtonCell")
	public native void disableKeyEquivalentForDefaultButtonCell();

	@Generated
	@Selector("disableScreenUpdatesUntilFlush")
	public native void disableScreenUpdatesUntilFlush();

	@Generated
	@Selector("disableSnapshotRestoration")
	public native void disableSnapshotRestoration();

	@Generated
	@Selector("discardCachedImage")
	public native void discardCachedImage();

	@Generated
	@Selector("discardCursorRects")
	public native void discardCursorRects();

	@Generated
	@Selector("discardEventsMatchingMask:beforeEvent:")
	public native void discardEventsMatchingMaskBeforeEvent(long mask,
			NSEvent lastEvent);

	@Generated
	@Selector("display")
	public native void display();

	@Generated
	@Selector("displayIfNeeded")
	public native void displayIfNeeded();

	@Generated
	@Selector("displaysWhenScreenProfileChanges")
	public native boolean displaysWhenScreenProfileChanges();

	@Generated
	@Selector("dockTile")
	public native NSDockTile dockTile();

	@Generated
	@Selector("dragImage:at:offset:event:pasteboard:source:slideBack:")
	public native void dragImageAtOffsetEventPasteboardSourceSlideBack(
			NSImage anImage, @ByValue CGPoint baseLocation,
			@ByValue CGSize initialOffset, NSEvent event, NSPasteboard pboard,
			@Mapped(ObjCObjectMapper.class) Object sourceObj, boolean slideFlag);

	@Generated
	@Selector("drawers")
	public native NSArray drawers();

	@Generated
	@Selector("effectiveAppearance")
	public native NSAppearance effectiveAppearance();

	@Generated
	@Selector("enableCursorRects")
	public native void enableCursorRects();

	@Generated
	@Selector("enableFlushWindow")
	public native void enableFlushWindow();

	@Generated
	@Selector("enableKeyEquivalentForDefaultButtonCell")
	public native void enableKeyEquivalentForDefaultButtonCell();

	@Generated
	@Selector("enableSnapshotRestoration")
	public native void enableSnapshotRestoration();

	@Generated
	@Selector("endEditingFor:")
	public native void endEditingFor(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("endSheet:")
	public native void endSheet(NSWindow sheetWindow);

	@Generated
	@Selector("endSheet:returnCode:")
	public native void endSheetReturnCode(NSWindow sheetWindow, long returnCode);

	@Generated
	@Selector("fieldEditor:forObject:")
	public native NSText fieldEditorForObject(boolean createFlag,
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("firstResponder")
	public native NSResponder firstResponder();

	@Generated
	@Selector("flushWindow")
	public native void flushWindow();

	@Generated
	@Selector("flushWindowIfNeeded")
	public native void flushWindowIfNeeded();

	@Generated
	@Selector("frame")
	@ByValue
	public native CGRect frame();

	@Generated
	@Selector("frameAutosaveName")
	public native String frameAutosaveName();

	@Generated
	@Selector("frameRectForContentRect:")
	@ByValue
	public native CGRect frameRectForContentRect(@ByValue CGRect contentRect);

	@Generated
	@Selector("frameRectForContentRect:styleMask:")
	@ByValue
	public static native CGRect frameRectForContentRectStyleMask(
			@ByValue CGRect cRect, long aStyle);

	@Generated
	@Selector("gState")
	public native long gState();

	@Generated
	@Selector("graphicsContext")
	public native NSGraphicsContext graphicsContext();

	@Generated
	@Selector("handleCloseScriptCommand:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object handleCloseScriptCommand(NSCloseCommand command);

	@Generated
	@Selector("handlePrintScriptCommand:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object handlePrintScriptCommand(NSScriptCommand command);

	@Generated
	@Selector("handleSaveScriptCommand:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object handleSaveScriptCommand(NSScriptCommand command);

	@Generated
	@Selector("hasCloseBox")
	public native boolean hasCloseBox();

	@Generated
	@Selector("hasDynamicDepthLimit")
	public native boolean hasDynamicDepthLimit();

	@Generated
	@Selector("hasShadow")
	public native boolean hasShadow();

	@Generated
	@Selector("hasTitleBar")
	public native boolean hasTitleBar();

	@Generated
	@Selector("hidesOnDeactivate")
	public native boolean hidesOnDeactivate();

	@Generated
	@Selector("identifier")
	public native String identifier();

	@Generated
	@Selector("ignoresMouseEvents")
	public native boolean ignoresMouseEvents();

	@Generated
	@Selector("inLiveResize")
	public native boolean inLiveResize();

	@Generated
	@Selector("init")
	public native NSWindow init();

	@Generated
	@Selector("initWithContentRect:styleMask:backing:defer:")
	public native NSWindow initWithContentRectStyleMaskBackingDefer(
			@ByValue CGRect contentRect, long aStyle, long bufferingType,
			boolean flag);

	@Generated
	@Selector("initWithContentRect:styleMask:backing:defer:screen:")
	public native NSWindow initWithContentRectStyleMaskBackingDeferScreen(
			@ByValue CGRect contentRect, long aStyle, long bufferingType,
			boolean flag, NSScreen screen);

	@Generated
	@Selector("initWithWindowRef:")
	public native NSWindow initWithWindowRef(VoidPtr windowRef);

	@Generated
	@Selector("initialFirstResponder")
	public native NSView initialFirstResponder();

	@Generated
	@Selector("invalidateCursorRectsForView:")
	public native void invalidateCursorRectsForView(NSView aView);

	@Generated
	@Selector("invalidateShadow")
	public native void invalidateShadow();

	@Generated
	@Selector("isAutodisplay")
	public native boolean isAutodisplay();

	@Generated
	@Selector("isDocumentEdited")
	public native boolean isDocumentEdited();

	@Generated
	@Selector("isExcludedFromWindowsMenu")
	public native boolean isExcludedFromWindowsMenu();

	@Generated
	@Selector("isFloatingPanel")
	public native boolean isFloatingPanel();

	@Generated
	@Selector("isFlushWindowDisabled")
	public native boolean isFlushWindowDisabled();

	@Generated
	@Selector("isKeyWindow")
	public native boolean isKeyWindow();

	@Generated
	@Selector("isMainWindow")
	public native boolean isMainWindow();

	@Generated
	@Selector("isMiniaturizable")
	public native boolean isMiniaturizable();

	@Generated
	@Selector("isMiniaturized")
	public native boolean isMiniaturized();

	@Generated
	@Selector("isModalPanel")
	public native boolean isModalPanel();

	@Generated
	@Selector("isMovable")
	public native boolean isMovable();

	@Generated
	@Selector("isMovableByWindowBackground")
	public native boolean isMovableByWindowBackground();

	@Generated
	@Selector("isOnActiveSpace")
	public native boolean isOnActiveSpace();

	@Generated
	@Selector("isOneShot")
	public native boolean isOneShot();

	@Generated
	@Selector("isOpaque")
	public native boolean isOpaque();

	@Generated
	@Selector("isReleasedWhenClosed")
	public native boolean isReleasedWhenClosed();

	@Generated
	@Selector("isResizable")
	public native boolean isResizable();

	@Generated
	@Selector("isRestorable")
	public native boolean isRestorable();

	@Generated
	@Selector("isSheet")
	public native boolean isSheet();

	@Generated
	@Selector("isVisible")
	public native boolean isVisible();

	@Generated
	@Selector("isZoomable")
	public native boolean isZoomable();

	@Generated
	@Selector("isZoomed")
	public native boolean isZoomed();

	@Generated
	@Selector("keyDown:")
	public native void keyDown(NSEvent theEvent);

	@Generated
	@Selector("keyViewSelectionDirection")
	public native long keyViewSelectionDirection();

	@Generated
	@Selector("layoutIfNeeded")
	public native void layoutIfNeeded();

	@Generated
	@Selector("level")
	public native long level();

	@Generated
	@Selector("makeFirstResponder:")
	public native boolean makeFirstResponder(NSResponder aResponder);

	@Generated
	@Selector("makeKeyAndOrderFront:")
	public native void makeKeyAndOrderFront(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("makeKeyWindow")
	public native void makeKeyWindow();

	@Generated
	@Selector("makeMainWindow")
	public native void makeMainWindow();

	@Generated
	@Selector("maxSize")
	@ByValue
	public native CGSize maxSize();

	@Generated
	@Selector("menuChanged:")
	public static native void menuChanged(NSMenu menu);

	@Generated
	@Selector("minFrameWidthWithTitle:styleMask:")
	public static native double minFrameWidthWithTitleStyleMask(String aTitle,
			long aStyle);

	@Generated
	@Selector("minSize")
	@ByValue
	public native CGSize minSize();

	@Generated
	@Selector("miniaturize:")
	public native void miniaturize(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("miniwindowImage")
	public native NSImage miniwindowImage();

	@Generated
	@Selector("miniwindowTitle")
	public native String miniwindowTitle();

	@Generated
	@Selector("mouseLocationOutsideOfEventStream")
	@ByValue
	public native CGPoint mouseLocationOutsideOfEventStream();

	@Generated
	@Selector("nextEventMatchingMask:")
	public native NSEvent nextEventMatchingMask(long mask);

	@Generated
	@Selector("nextEventMatchingMask:untilDate:inMode:dequeue:")
	public native NSEvent nextEventMatchingMaskUntilDateInModeDequeue(
			long mask, NSDate expiration, String mode, boolean deqFlag);

	@Generated
	@Selector("occlusionState")
	public native long occlusionState();

	@Generated
	@Selector("orderBack:")
	public native void orderBack(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("orderFront:")
	public native void orderFront(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("orderFrontRegardless")
	public native void orderFrontRegardless();

	@Generated
	@Selector("orderOut:")
	public native void orderOut(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("orderWindow:relativeTo:")
	public native void orderWindowRelativeTo(long place, long otherWin);

	@Generated
	@Selector("orderedIndex")
	public native long orderedIndex();

	@Generated
	@Selector("parentWindow")
	public native NSWindow parentWindow();

	@Generated
	@Selector("performClose:")
	public native void performClose(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("performMiniaturize:")
	public native void performMiniaturize(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("performZoom:")
	public native void performZoom(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("postEvent:atStart:")
	public native void postEventAtStart(NSEvent event, boolean flag);

	@Generated
	@Selector("preferredBackingLocation")
	public native long preferredBackingLocation();

	@Generated
	@Selector("preservesContentDuringLiveResize")
	public native boolean preservesContentDuringLiveResize();

	@Generated
	@Selector("preventsApplicationTerminationWhenModal")
	public native boolean preventsApplicationTerminationWhenModal();

	@Generated
	@Selector("print:")
	public native void print(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("recalculateKeyViewLoop")
	public native void recalculateKeyViewLoop();

	@Generated
	@Selector("registerForDraggedTypes:")
	public native void registerForDraggedTypes(NSArray newTypes);

	@Generated
	@Selector("removeChildWindow:")
	public native void removeChildWindow(NSWindow childWin);

	@Generated
	@Selector("removeFrameUsingName:")
	public static native void removeFrameUsingName(String name);

	@Generated
	@Selector("representedFilename")
	public native String representedFilename();

	@Generated
	@Selector("representedURL")
	public native NSURL representedURL();

	@Generated
	@Selector("resetCursorRects")
	public native void resetCursorRects();

	@Generated
	@Selector("resignKeyWindow")
	public native void resignKeyWindow();

	@Generated
	@Selector("resignMainWindow")
	public native void resignMainWindow();

	@Generated
	@Selector("resizeFlags")
	public native long resizeFlags();

	@Generated
	@Selector("resizeIncrements")
	@ByValue
	public native CGSize resizeIncrements();

	@Generated
	@Selector("restorationClass")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object restorationClass();

	@Generated
	@Selector("restoreCachedImage")
	public native void restoreCachedImage();

	@Generated
	@Selector("runToolbarCustomizationPalette:")
	public native void runToolbarCustomizationPalette(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("saveFrameUsingName:")
	public native void saveFrameUsingName(String name);

	@Generated
	@Selector("screen")
	public native NSScreen screen();

	@Generated
	@Selector("selectKeyViewFollowingView:")
	public native void selectKeyViewFollowingView(NSView aView);

	@Generated
	@Selector("selectKeyViewPrecedingView:")
	public native void selectKeyViewPrecedingView(NSView aView);

	@Generated
	@Selector("selectNextKeyView:")
	public native void selectNextKeyView(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("selectPreviousKeyView:")
	public native void selectPreviousKeyView(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("sendEvent:")
	public native void sendEvent(NSEvent theEvent);

	@Generated
	@Selector("setAcceptsMouseMovedEvents:")
	public native void setAcceptsMouseMovedEvents(boolean flag);

	@Generated
	@Selector("setAllowsConcurrentViewDrawing:")
	public native void setAllowsConcurrentViewDrawing(boolean flag);

	@Generated
	@Selector("setAllowsToolTipsWhenApplicationIsInactive:")
	public native void setAllowsToolTipsWhenApplicationIsInactive(
			boolean allowWhenInactive);

	@Generated
	@Selector("setAlphaValue:")
	public native void setAlphaValue(double windowAlpha);

	@Generated
	@Selector("setAnchorAttribute:forOrientation:")
	public native void setAnchorAttributeForOrientation(long attr,
			long orientation);

	@Generated
	@Selector("setAnimationBehavior:")
	public native void setAnimationBehavior(long newAnimationBehavior);

	@Generated
	@Selector("setAnimations:")
	public native void setAnimations(NSDictionary animations);

	@Generated
	@Selector("setAppearance:")
	public native void setAppearance(NSAppearance value);

	@Generated
	@Selector("setAspectRatio:")
	public native void setAspectRatio(@ByValue CGSize ratio);

	@Generated
	@Selector("setAutodisplay:")
	public native void setAutodisplay(boolean flag);

	@Generated
	@Selector("setAutorecalculatesContentBorderThickness:forEdge:")
	public native void setAutorecalculatesContentBorderThicknessForEdge(
			boolean flag, long edge);

	@Generated
	@Selector("setAutorecalculatesKeyViewLoop:")
	public native void setAutorecalculatesKeyViewLoop(boolean flag);

	@Generated
	@Selector("setBackgroundColor:")
	public native void setBackgroundColor(NSColor color);

	@Generated
	@Selector("setBackingType:")
	public native void setBackingType(long bufferingType);

	@Generated
	@Selector("setCanBeVisibleOnAllSpaces:")
	public native void setCanBeVisibleOnAllSpaces(boolean flag);

	@Generated
	@Selector("setCanBecomeVisibleWithoutLogin:")
	public native void setCanBecomeVisibleWithoutLogin(boolean flag);

	@Generated
	@Selector("setCanHide:")
	public native void setCanHide(boolean flag);

	@Generated
	@Selector("setCollectionBehavior:")
	public native void setCollectionBehavior(long behavior);

	@Generated
	@Selector("setColorSpace:")
	public native void setColorSpace(NSColorSpace colorSpace);

	@Generated
	@Selector("setContentAspectRatio:")
	public native void setContentAspectRatio(@ByValue CGSize ratio);

	@Generated
	@Selector("setContentBorderThickness:forEdge:")
	public native void setContentBorderThicknessForEdge(double thickness,
			long edge);

	@Generated
	@Selector("setContentMaxSize:")
	public native void setContentMaxSize(@ByValue CGSize size);

	@Generated
	@Selector("setContentMinSize:")
	public native void setContentMinSize(@ByValue CGSize size);

	@Generated
	@Selector("setContentResizeIncrements:")
	public native void setContentResizeIncrements(@ByValue CGSize increments);

	@Generated
	@Selector("setContentSize:")
	public native void setContentSize(@ByValue CGSize aSize);

	@Generated
	@Selector("setContentView:")
	public native void setContentView(NSView aView);

	@Generated
	@Selector("setDefaultButtonCell:")
	public native void setDefaultButtonCell(NSButtonCell defButt);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("setDepthLimit:")
	public native void setDepthLimit(int limit);

	@Generated
	@Selector("setDisplaysWhenScreenProfileChanges:")
	public native void setDisplaysWhenScreenProfileChanges(boolean flag);

	@Generated
	@Selector("setDocumentEdited:")
	public native void setDocumentEdited(boolean flag);

	@Generated
	@Selector("setDynamicDepthLimit:")
	public native void setDynamicDepthLimit(boolean flag);

	@Generated
	@Selector("setExcludedFromWindowsMenu:")
	public native void setExcludedFromWindowsMenu(boolean flag);

	@Generated
	@Selector("setFrame:display:")
	public native void setFrameDisplay(@ByValue CGRect frameRect, boolean flag);

	@Generated
	@Selector("setFrame:display:animate:")
	public native void setFrameDisplayAnimate(@ByValue CGRect frameRect,
			boolean displayFlag, boolean animateFlag);

	@Generated
	@Selector("setFrameAutosaveName:")
	public native boolean setFrameAutosaveName(String name);

	@Generated
	@Selector("setFrameFromString:")
	public native void setFrameFromString(String string);

	@Generated
	@Selector("setFrameOrigin:")
	public native void setFrameOrigin(@ByValue CGPoint aPoint);

	@Generated
	@Selector("setFrameTopLeftPoint:")
	public native void setFrameTopLeftPoint(@ByValue CGPoint aPoint);

	@Generated
	@Selector("setFrameUsingName:")
	public native boolean setFrameUsingName(String name);

	@Generated
	@Selector("setFrameUsingName:force:")
	public native boolean setFrameUsingNameForce(String name, boolean force);

	@Generated
	@Selector("setHasShadow:")
	public native void setHasShadow(boolean hasShadow);

	@Generated
	@Selector("setHidesOnDeactivate:")
	public native void setHidesOnDeactivate(boolean flag);

	@Generated
	@Selector("setIdentifier:")
	public native void setIdentifier(String value);

	@Generated
	@Selector("setIgnoresMouseEvents:")
	public native void setIgnoresMouseEvents(boolean flag);

	@Generated
	@Selector("setInitialFirstResponder:")
	public native void setInitialFirstResponder(NSView view);

	@Generated
	@Selector("setIsMiniaturized:")
	public native void setIsMiniaturized(boolean flag);

	@Generated
	@Selector("setIsVisible:")
	public native void setIsVisible(boolean flag);

	@Generated
	@Selector("setIsZoomed:")
	public native void setIsZoomed(boolean flag);

	@Generated
	@Selector("setLevel:")
	public native void setLevel(long newLevel);

	@Generated
	@Selector("setMaxSize:")
	public native void setMaxSize(@ByValue CGSize size);

	@Generated
	@Selector("setMinSize:")
	public native void setMinSize(@ByValue CGSize size);

	@Generated
	@Selector("setMiniwindowImage:")
	public native void setMiniwindowImage(NSImage image);

	@Generated
	@Selector("setMiniwindowTitle:")
	public native void setMiniwindowTitle(String title);

	@Generated
	@Selector("setMovable:")
	public native void setMovable(boolean flag);

	@Generated
	@Selector("setMovableByWindowBackground:")
	public native void setMovableByWindowBackground(boolean flag);

	@Generated
	@Selector("setOneShot:")
	public native void setOneShot(boolean flag);

	@Generated
	@Selector("setOpaque:")
	public native void setOpaque(boolean isOpaque);

	@Generated
	@Selector("setOrderedIndex:")
	public native void setOrderedIndex(long index);

	@Generated
	@Selector("setParentWindow:")
	public native void setParentWindow(NSWindow window);

	@Generated
	@Selector("setPreferredBackingLocation:")
	public native void setPreferredBackingLocation(long backingLocation);

	@Generated
	@Selector("setPreservesContentDuringLiveResize:")
	public native void setPreservesContentDuringLiveResize(boolean flag);

	@Generated
	@Selector("setPreventsApplicationTerminationWhenModal:")
	public native void setPreventsApplicationTerminationWhenModal(boolean flag);

	@Generated
	@Selector("setReleasedWhenClosed:")
	public native void setReleasedWhenClosed(boolean flag);

	@Generated
	@Selector("setRepresentedFilename:")
	public native void setRepresentedFilename(String aString);

	@Generated
	@Selector("setRepresentedURL:")
	public native void setRepresentedURL(NSURL url);

	@Generated
	@Selector("setResizeIncrements:")
	public native void setResizeIncrements(@ByValue CGSize increments);

	@Generated
	@Selector("setRestorable:")
	public native void setRestorable(boolean flag);

	@Generated
	@Selector("setRestorationClass:")
	public native void setRestorationClass(
			@Mapped(ObjCObjectMapper.class) Object restorationClass);

	@Generated
	@Selector("setSharingType:")
	public native void setSharingType(long type);

	@Generated
	@Selector("setShowsResizeIndicator:")
	public native void setShowsResizeIndicator(boolean show);

	@Generated
	@Selector("setShowsToolbarButton:")
	public native void setShowsToolbarButton(boolean show);

	@Generated
	@Selector("setStyleMask:")
	public native void setStyleMask(long styleMask);

	@Generated
	@Selector("setTitle:")
	public native void setTitle(String aString);

	@Generated
	@Selector("setTitleWithRepresentedFilename:")
	public native void setTitleWithRepresentedFilename(String filename);

	@Generated
	@Selector("setToolbar:")
	public native void setToolbar(NSToolbar toolbar);

	@Generated
	@Selector("setViewsNeedDisplay:")
	public native void setViewsNeedDisplay(boolean flag);

	@Generated
	@Selector("setWindowController:")
	public native void setWindowController(NSWindowController windowController);

	@Generated
	@Selector("sharingType")
	public native long sharingType();

	@Generated
	@Selector("sheetParent")
	public native NSWindow sheetParent();

	@Generated
	@Selector("sheets")
	public native NSArray sheets();

	@Generated
	@Selector("showsResizeIndicator")
	public native boolean showsResizeIndicator();

	@Generated
	@Selector("showsToolbarButton")
	public native boolean showsToolbarButton();

	@Generated
	@Selector("standardWindowButton:")
	public native NSButton standardWindowButton(long b);

	@Generated
	@Selector("standardWindowButton:forStyleMask:")
	public static native NSButton standardWindowButtonForStyleMask(long b,
			long styleMask);

	@Generated
	@Selector("stringWithSavedFrame")
	public native String stringWithSavedFrame();

	@Generated
	@Selector("styleMask")
	public native long styleMask();

	@Generated
	@Selector("title")
	public native String title();

	@Generated
	@Selector("toggleFullScreen:")
	public native void toggleFullScreen(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("toggleToolbarShown:")
	public native void toggleToolbarShown(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("toolbar")
	public native NSToolbar toolbar();

	@Generated
	@Selector("tryToPerform:with:")
	public native boolean tryToPerformWith(SEL anAction,
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("unregisterDraggedTypes")
	public native void unregisterDraggedTypes();

	@Generated
	@Selector("update")
	public native void update();

	@Generated
	@Selector("updateConstraintsIfNeeded")
	public native void updateConstraintsIfNeeded();

	@Generated
	@Selector("useOptimizedDrawing:")
	public native void useOptimizedDrawing(boolean flag);

	@Generated
	@Selector("userSpaceScaleFactor")
	public native double userSpaceScaleFactor();

	@Generated
	@Selector("validRequestorForSendType:returnType:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object validRequestorForSendTypeReturnType(String sendType,
			String returnType);

	@Generated
	@Selector("validateUserInterfaceItem:")
	public native boolean validateUserInterfaceItem(
			@Mapped(ObjCObjectMapper.class) Object anItem);

	@Generated
	@Selector("viewsNeedDisplay")
	public native boolean viewsNeedDisplay();

	@Generated
	@Selector("visualizeConstraints:")
	public native void visualizeConstraints(NSArray constraints);

	@Generated
	@Selector("windowController")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object windowController();

	@Generated
	@Selector("windowNumber")
	public native long windowNumber();

	@Generated
	@Selector("windowNumberAtPoint:belowWindowWithWindowNumber:")
	public static native long windowNumberAtPointBelowWindowWithWindowNumber(
			@ByValue CGPoint point, long windowNumber);

	@Generated
	@Selector("windowNumbersWithOptions:")
	public static native NSArray windowNumbersWithOptions(long options);

	@Generated
	@Selector("windowRef")
	public native VoidPtr windowRef();

	@Generated
	@Selector("worksWhenModal")
	public native boolean worksWhenModal();

	@Generated
	@Selector("zoom:")
	public native void zoom(@Mapped(ObjCObjectMapper.class) Object sender);
}
