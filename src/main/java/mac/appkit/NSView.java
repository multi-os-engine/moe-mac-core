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


import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.*;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.*;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.appkit.protocol.NSAnimatablePropertyContainer;
import mac.appkit.protocol.NSAppearanceCustomization;
import mac.appkit.protocol.NSDraggingDestination;
import mac.appkit.protocol.NSUserInterfaceItemIdentification;
import mac.appkit.struct.NSEdgeInsets;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.coregraphics.struct.CGSize;
import mac.foundation.NSArray;
import mac.foundation.NSAttributedString;
import mac.foundation.NSData;
import mac.foundation.NSDictionary;
import mac.foundation.struct.NSRange;
import mac.quartzcore.CALayer;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSView extends NSResponder implements
		NSAnimatablePropertyContainer, NSUserInterfaceItemIdentification,
		NSDraggingDestination, NSAppearanceCustomization {
	static {
		NatJ.register();
	}

	@Generated
	protected NSView(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("acceptsFirstMouse:")
	public native boolean acceptsFirstMouse(NSEvent theEvent);

	@Generated
	@Selector("acceptsTouchEvents")
	public native boolean acceptsTouchEvents();

	@Generated
	@Selector("addConstraint:")
	public native void addConstraint(NSLayoutConstraint constraint);

	@Generated
	@Selector("addConstraints:")
	public native void addConstraints(NSArray constraints);

	@Generated
	@Selector("addCursorRect:cursor:")
	public native void addCursorRectCursor(@ByValue CGRect aRect, NSCursor anObj);

	@Generated
	@Selector("addSubview:")
	public native void addSubview(NSView aView);

	@Generated
	@Selector("addSubview:positioned:relativeTo:")
	public native void addSubviewPositionedRelativeTo(NSView aView, long place,
			NSView otherView);

	@Generated
	@Selector("addToolTipRect:owner:userData:")
	public native long addToolTipRectOwnerUserData(@ByValue CGRect aRect,
			@Mapped(ObjCObjectMapper.class) Object anObject, VoidPtr data);

	@Generated
	@Selector("addTrackingArea:")
	public native void addTrackingArea(NSTrackingArea trackingArea);

	@Generated
	@Selector("addTrackingRect:owner:userData:assumeInside:")
	public native long addTrackingRectOwnerUserDataAssumeInside(
			@ByValue CGRect aRect,
			@Mapped(ObjCObjectMapper.class) Object anObject, VoidPtr data,
			boolean flag);

	@Generated
	@Selector("adjustPageHeightNew:top:bottom:limit:")
	public native void adjustPageHeightNewTopBottomLimit(DoublePtr newBottom,
			double oldTop, double oldBottom, double bottomLimit);

	@Generated
	@Selector("adjustPageWidthNew:left:right:limit:")
	public native void adjustPageWidthNewLeftRightLimit(DoublePtr newRight,
			double oldLeft, double oldRight, double rightLimit);

	@Generated
	@Selector("adjustScroll:")
	@ByValue
	public native CGRect adjustScroll(@ByValue CGRect newVisible);

	@Generated
	@Selector("alignmentRectForFrame:")
	@ByValue
	public native CGRect alignmentRectForFrame(@ByValue CGRect frame);

	@Generated
	@Selector("alignmentRectInsets")
	@ByValue
	public native NSEdgeInsets alignmentRectInsets();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSView alloc();

	@Generated
	@Selector("allocateGState")
	public native void allocateGState();

	@Generated
	@Selector("alphaValue")
	public native double alphaValue();

	@Generated
	@Selector("ancestorSharedWithView:")
	public native NSView ancestorSharedWithView(NSView aView);

	@Generated
	@Selector("animationForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object animationForKey(String key);

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
	@Selector("autoresizesSubviews")
	public native boolean autoresizesSubviews();

	@Generated
	@Selector("autoresizingMask")
	public native long autoresizingMask();

	@Generated
	@Selector("autoscroll:")
	public native boolean autoscroll(NSEvent theEvent);

	@Generated
	@Selector("backgroundFilters")
	public native NSArray backgroundFilters();

	@Generated
	@Selector("backingAlignedRect:options:")
	@ByValue
	public native CGRect backingAlignedRectOptions(@ByValue CGRect aRect,
			long options);

	@Generated
	@Selector("baselineOffsetFromBottom")
	public native double baselineOffsetFromBottom();

	@Generated
	@Selector("beginDocument")
	public native void beginDocument();

	@Generated
	@Selector("beginDraggingSessionWithItems:event:source:")
	public native NSDraggingSession beginDraggingSessionWithItemsEventSource(
			NSArray items, NSEvent event,
			@Mapped(ObjCObjectMapper.class) Object source);

	@Generated
	@Selector("beginPageInRect:atPlacement:")
	public native void beginPageInRectAtPlacement(@ByValue CGRect aRect,
			@ByValue CGPoint location);

	@Generated
	@Selector("bitmapImageRepForCachingDisplayInRect:")
	public native NSBitmapImageRep bitmapImageRepForCachingDisplayInRect(
			@ByValue CGRect rect);

	@Generated
	@Selector("bounds")
	@ByValue
	public native CGRect bounds();

	@Generated
	@Selector("boundsRotation")
	public native double boundsRotation();

	@Generated
	@Selector("cacheDisplayInRect:toBitmapImageRep:")
	public native void cacheDisplayInRectToBitmapImageRep(@ByValue CGRect rect,
			NSBitmapImageRep bitmapImageRep);

	@Generated
	@Selector("canBecomeKeyView")
	public native boolean canBecomeKeyView();

	@Generated
	@Selector("canDraw")
	public native boolean canDraw();

	@Generated
	@Selector("canDrawConcurrently")
	public native boolean canDrawConcurrently();

	@Generated
	@Selector("canDrawSubviewsIntoLayer")
	public native boolean canDrawSubviewsIntoLayer();

	@Generated
	@Selector("centerScanRect:")
	@ByValue
	public native CGRect centerScanRect(@ByValue CGRect aRect);

	@Generated
	@IsOptional
	@Selector("concludeDragOperation:")
	public native void concludeDragOperation(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("constraints")
	public native NSArray constraints();

	@Generated
	@Selector("constraintsAffectingLayoutForOrientation:")
	public native NSArray constraintsAffectingLayoutForOrientation(
			long orientation);

	@Generated
	@Selector("contentCompressionResistancePriorityForOrientation:")
	public native float contentCompressionResistancePriorityForOrientation(
			long orientation);

	@Generated
	@Selector("contentFilters")
	public native NSArray contentFilters();

	@Generated
	@Selector("contentHuggingPriorityForOrientation:")
	public native float contentHuggingPriorityForOrientation(long orientation);

	@Generated
	@Selector("convertPoint:fromView:")
	@ByValue
	public native CGPoint convertPointFromView(@ByValue CGPoint aPoint,
			NSView aView);

	@Generated
	@Selector("convertPoint:toView:")
	@ByValue
	public native CGPoint convertPointToView(@ByValue CGPoint aPoint,
			NSView aView);

	@Generated
	@Selector("convertPointFromBacking:")
	@ByValue
	public native CGPoint convertPointFromBacking(@ByValue CGPoint aPoint);

	@Generated
	@Selector("convertPointFromBase:")
	@ByValue
	public native CGPoint convertPointFromBase(@ByValue CGPoint aPoint);

	@Generated
	@Selector("convertPointFromLayer:")
	@ByValue
	public native CGPoint convertPointFromLayer(@ByValue CGPoint aPoint);

	@Generated
	@Selector("convertPointToBacking:")
	@ByValue
	public native CGPoint convertPointToBacking(@ByValue CGPoint aPoint);

	@Generated
	@Selector("convertPointToBase:")
	@ByValue
	public native CGPoint convertPointToBase(@ByValue CGPoint aPoint);

	@Generated
	@Selector("convertPointToLayer:")
	@ByValue
	public native CGPoint convertPointToLayer(@ByValue CGPoint aPoint);

	@Generated
	@Selector("convertRect:fromView:")
	@ByValue
	public native CGRect convertRectFromView(@ByValue CGRect aRect, NSView aView);

	@Generated
	@Selector("convertRect:toView:")
	@ByValue
	public native CGRect convertRectToView(@ByValue CGRect aRect, NSView aView);

	@Generated
	@Selector("convertRectFromBacking:")
	@ByValue
	public native CGRect convertRectFromBacking(@ByValue CGRect aRect);

	@Generated
	@Selector("convertRectFromBase:")
	@ByValue
	public native CGRect convertRectFromBase(@ByValue CGRect aRect);

	@Generated
	@Selector("convertRectFromLayer:")
	@ByValue
	public native CGRect convertRectFromLayer(@ByValue CGRect aRect);

	@Generated
	@Selector("convertRectToBacking:")
	@ByValue
	public native CGRect convertRectToBacking(@ByValue CGRect aRect);

	@Generated
	@Selector("convertRectToBase:")
	@ByValue
	public native CGRect convertRectToBase(@ByValue CGRect aRect);

	@Generated
	@Selector("convertRectToLayer:")
	@ByValue
	public native CGRect convertRectToLayer(@ByValue CGRect aRect);

	@Generated
	@Selector("convertSize:fromView:")
	@ByValue
	public native CGSize convertSizeFromView(@ByValue CGSize aSize, NSView aView);

	@Generated
	@Selector("convertSize:toView:")
	@ByValue
	public native CGSize convertSizeToView(@ByValue CGSize aSize, NSView aView);

	@Generated
	@Selector("convertSizeFromBacking:")
	@ByValue
	public native CGSize convertSizeFromBacking(@ByValue CGSize aSize);

	@Generated
	@Selector("convertSizeFromBase:")
	@ByValue
	public native CGSize convertSizeFromBase(@ByValue CGSize aSize);

	@Generated
	@Selector("convertSizeFromLayer:")
	@ByValue
	public native CGSize convertSizeFromLayer(@ByValue CGSize aSize);

	@Generated
	@Selector("convertSizeToBacking:")
	@ByValue
	public native CGSize convertSizeToBacking(@ByValue CGSize aSize);

	@Generated
	@Selector("convertSizeToBase:")
	@ByValue
	public native CGSize convertSizeToBase(@ByValue CGSize aSize);

	@Generated
	@Selector("convertSizeToLayer:")
	@ByValue
	public native CGSize convertSizeToLayer(@ByValue CGSize aSize);

	@Generated
	@Selector("dataWithEPSInsideRect:")
	public native NSData dataWithEPSInsideRect(@ByValue CGRect rect);

	@Generated
	@Selector("dataWithPDFInsideRect:")
	public native NSData dataWithPDFInsideRect(@ByValue CGRect rect);

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
	@Selector("defaultFocusRingType")
	public static native long defaultFocusRingType();

	@Generated
	@Selector("defaultMenu")
	public static native NSMenu defaultMenu();

	@Generated
	@Selector("didAddSubview:")
	public native void didAddSubview(NSView subview);

	@Generated
	@Selector("discardCursorRects")
	public native void discardCursorRects();

	@Generated
	@Selector("display")
	public native void display();

	@Generated
	@Selector("displayIfNeeded")
	public native void displayIfNeeded();

	@Generated
	@Selector("displayIfNeededIgnoringOpacity")
	public native void displayIfNeededIgnoringOpacity();

	@Generated
	@Selector("displayIfNeededInRect:")
	public native void displayIfNeededInRect(@ByValue CGRect rect);

	@Generated
	@Selector("displayIfNeededInRectIgnoringOpacity:")
	public native void displayIfNeededInRectIgnoringOpacity(@ByValue CGRect rect);

	@Generated
	@Selector("displayRect:")
	public native void displayRect(@ByValue CGRect rect);

	@Generated
	@Selector("displayRectIgnoringOpacity:")
	public native void displayRectIgnoringOpacity(@ByValue CGRect rect);

	@Generated
	@Selector("displayRectIgnoringOpacity:inContext:")
	public native void displayRectIgnoringOpacityInContext(
			@ByValue CGRect aRect, NSGraphicsContext context);

	@Generated
	@Selector("dragFile:fromRect:slideBack:event:")
	public native boolean dragFileFromRectSlideBackEvent(String filename,
			@ByValue CGRect rect, boolean aFlag, NSEvent event);

	@Generated
	@Selector("dragImage:at:offset:event:pasteboard:source:slideBack:")
	public native void dragImageAtOffsetEventPasteboardSourceSlideBack(
			NSImage anImage, @ByValue CGPoint viewLocation,
			@ByValue CGSize initialOffset, NSEvent event, NSPasteboard pboard,
			@Mapped(ObjCObjectMapper.class) Object sourceObj, boolean slideFlag);

	@Generated
	@Selector("dragPromisedFilesOfTypes:fromRect:source:slideBack:event:")
	public native boolean dragPromisedFilesOfTypesFromRectSourceSlideBackEvent(
			NSArray typeArray, @ByValue CGRect rect,
			@Mapped(ObjCObjectMapper.class) Object sourceObject, boolean aFlag,
			NSEvent event);

	@Generated
	@IsOptional
	@Selector("draggingEnded:")
	public native void draggingEnded(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@IsOptional
	@Selector("draggingEntered:")
	public native long draggingEntered(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@IsOptional
	@Selector("draggingExited:")
	public native void draggingExited(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@IsOptional
	@Selector("draggingUpdated:")
	public native long draggingUpdated(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("drawFocusRingMask")
	public native void drawFocusRingMask();

	@Generated
	@Selector("drawPageBorderWithSize:")
	public native void drawPageBorderWithSize(@ByValue CGSize borderSize);

	@Generated
	@Selector("drawRect:")
	public native void drawRect(@ByValue CGRect dirtyRect);

	@Generated
	@Selector("drawSheetBorderWithSize:")
	public native void drawSheetBorderWithSize(@ByValue CGSize borderSize);

	@Generated
	@Selector("effectiveAppearance")
	public native NSAppearance effectiveAppearance();

	@Generated
	@Selector("enclosingMenuItem")
	public native NSMenuItem enclosingMenuItem();

	@Generated
	@Selector("enclosingScrollView")
	public native NSScrollView enclosingScrollView();

	@Generated
	@Selector("endDocument")
	public native void endDocument();

	@Generated
	@Selector("endPage")
	public native void endPage();

	@Generated
	@Selector("enterFullScreenMode:withOptions:")
	public native boolean enterFullScreenModeWithOptions(NSScreen screen,
			NSDictionary options);

	@Generated
	@Selector("exerciseAmbiguityInLayout")
	public native void exerciseAmbiguityInLayout();

	@Generated
	@Selector("exitFullScreenModeWithOptions:")
	public native void exitFullScreenModeWithOptions(NSDictionary options);

	@Generated
	@Selector("fittingSize")
	@ByValue
	public native CGSize fittingSize();

	@Generated
	@Selector("focusRingMaskBounds")
	@ByValue
	public native CGRect focusRingMaskBounds();

	@Generated
	@Selector("focusRingType")
	public native long focusRingType();

	@Generated
	@Selector("focusView")
	public static native NSView focusView();

	@Generated
	@Selector("frame")
	@ByValue
	public native CGRect frame();

	@Generated
	@Selector("frameCenterRotation")
	public native double frameCenterRotation();

	@Generated
	@Selector("frameForAlignmentRect:")
	@ByValue
	public native CGRect frameForAlignmentRect(@ByValue CGRect alignmentRect);

	@Generated
	@Selector("frameRotation")
	public native double frameRotation();

	@Generated
	@Selector("gState")
	public native long gState();

	@Generated
	@Selector("getRectsBeingDrawn:count:")
	public native void getRectsBeingDrawnCount(Ptr<ConstPtr<CGRect>> rects,
			LongPtr count);

	@Generated
	@Selector("hasAmbiguousLayout")
	public native boolean hasAmbiguousLayout();

	@Generated
	@Selector("heightAdjustLimit")
	public native double heightAdjustLimit();

	@Generated
	@Selector("hitTest:")
	public native NSView hitTest(@ByValue CGPoint aPoint);

	@Generated
	@Selector("identifier")
	public native String identifier();

	@Generated
	@Selector("inLiveResize")
	public native boolean inLiveResize();

	@Generated
	@Selector("init")
	public native NSView init();

	@Generated
	@Selector("initWithFrame:")
	public native NSView initWithFrame(@ByValue CGRect frameRect);

	@Generated
	@Selector("inputContext")
	public native NSTextInputContext inputContext();

	@Generated
	@Selector("intrinsicContentSize")
	@ByValue
	public native CGSize intrinsicContentSize();

	@Generated
	@Selector("invalidateIntrinsicContentSize")
	public native void invalidateIntrinsicContentSize();

	@Generated
	@Selector("isCompatibleWithResponsiveScrolling")
	public static native boolean isCompatibleWithResponsiveScrolling();

	@Generated
	@Selector("isDescendantOf:")
	public native boolean isDescendantOf(NSView aView);

	@Generated
	@Selector("isDrawingFindIndicator")
	public native boolean isDrawingFindIndicator();

	@Generated
	@Selector("isFlipped")
	public native boolean isFlipped();

	@Generated
	@Selector("isHidden")
	public native boolean isHidden();

	@Generated
	@Selector("isHiddenOrHasHiddenAncestor")
	public native boolean isHiddenOrHasHiddenAncestor();

	@Generated
	@Selector("isInFullScreenMode")
	public native boolean isInFullScreenMode();

	@Generated
	@Selector("isOpaque")
	public native boolean isOpaque();

	@Generated
	@Selector("isRotatedFromBase")
	public native boolean isRotatedFromBase();

	@Generated
	@Selector("isRotatedOrScaledFromBase")
	public native boolean isRotatedOrScaledFromBase();

	@Generated
	@Selector("knowsPageRange:")
	public native boolean knowsPageRange(
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange range);

	@Generated
	@Selector("layer")
	public native CALayer layer();

	@Generated
	@Selector("layerContentsPlacement")
	public native long layerContentsPlacement();

	@Generated
	@Selector("layerContentsRedrawPolicy")
	public native long layerContentsRedrawPolicy();

	@Generated
	@Selector("layerUsesCoreImageFilters")
	public native boolean layerUsesCoreImageFilters();

	@Generated
	@Selector("layout")
	public native void layout();

	@Generated
	@Selector("layoutSubtreeIfNeeded")
	public native void layoutSubtreeIfNeeded();

	@Generated
	@Selector("locationOfPrintRect:")
	@ByValue
	public native CGPoint locationOfPrintRect(@ByValue CGRect aRect);

	@Generated
	@Selector("lockFocus")
	public native void lockFocus();

	@Generated
	@Selector("lockFocusIfCanDraw")
	public native boolean lockFocusIfCanDraw();

	@Generated
	@Selector("lockFocusIfCanDrawInContext:")
	public native boolean lockFocusIfCanDrawInContext(NSGraphicsContext context);

	@Generated
	@Selector("makeBackingLayer")
	public native CALayer makeBackingLayer();

	@Generated
	@Selector("menuForEvent:")
	public native NSMenu menuForEvent(NSEvent event);

	@Generated
	@Selector("mouse:inRect:")
	public native boolean mouseInRect(@ByValue CGPoint aPoint,
			@ByValue CGRect aRect);

	@Generated
	@Selector("mouseDownCanMoveWindow")
	public native boolean mouseDownCanMoveWindow();

	@Generated
	@Selector("needsDisplay")
	public native boolean needsDisplay();

	@Generated
	@Selector("needsLayout")
	public native boolean needsLayout();

	@Generated
	@Selector("needsPanelToBecomeKey")
	public native boolean needsPanelToBecomeKey();

	@Generated
	@Selector("needsToDrawRect:")
	public native boolean needsToDrawRect(@ByValue CGRect aRect);

	@Generated
	@Selector("needsUpdateConstraints")
	public native boolean needsUpdateConstraints();

	@Generated
	@Selector("nextKeyView")
	public native NSView nextKeyView();

	@Generated
	@Selector("nextValidKeyView")
	public native NSView nextValidKeyView();

	@Generated
	@Selector("noteFocusRingMaskChanged")
	public native void noteFocusRingMaskChanged();

	@Generated
	@Selector("opaqueAncestor")
	public native NSView opaqueAncestor();

	@Generated
	@Selector("pageFooter")
	public native NSAttributedString pageFooter();

	@Generated
	@Selector("pageHeader")
	public native NSAttributedString pageHeader();

	@Generated
	@IsOptional
	@Selector("performDragOperation:")
	public native boolean performDragOperation(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("performKeyEquivalent:")
	public native boolean performKeyEquivalent(NSEvent theEvent);

	@Generated
	@Selector("performMnemonic:")
	public native boolean performMnemonic(String theString);

	@Generated
	@Selector("postsBoundsChangedNotifications")
	public native boolean postsBoundsChangedNotifications();

	@Generated
	@Selector("postsFrameChangedNotifications")
	public native boolean postsFrameChangedNotifications();

	@Generated
	@Selector("prepareContentInRect:")
	public native void prepareContentInRect(@ByValue CGRect rect);

	@Generated
	@IsOptional
	@Selector("prepareForDragOperation:")
	public native boolean prepareForDragOperation(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("prepareForReuse")
	public native void prepareForReuse();

	@Generated
	@Selector("preparedContentRect")
	@ByValue
	public native CGRect preparedContentRect();

	@Generated
	@Selector("preservesContentDuringLiveResize")
	public native boolean preservesContentDuringLiveResize();

	@Generated
	@Selector("previousKeyView")
	public native NSView previousKeyView();

	@Generated
	@Selector("previousValidKeyView")
	public native NSView previousValidKeyView();

	@Generated
	@Selector("print:")
	public native void print(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("printJobTitle")
	public native String printJobTitle();

	@Generated
	@Selector("rectForPage:")
	@ByValue
	public native CGRect rectForPage(long page);

	@Generated
	@Selector("rectForSmartMagnificationAtPoint:inRect:")
	@ByValue
	public native CGRect rectForSmartMagnificationAtPointInRect(
			@ByValue CGPoint location, @ByValue CGRect visibleRect);

	@Generated
	@Selector("rectPreservedDuringLiveResize")
	@ByValue
	public native CGRect rectPreservedDuringLiveResize();

	@Generated
	@Selector("reflectScrolledClipView:")
	public native void reflectScrolledClipView(NSClipView aClipView);

	@Generated
	@Selector("registerForDraggedTypes:")
	public native void registerForDraggedTypes(NSArray newTypes);

	@Generated
	@Selector("registeredDraggedTypes")
	public native NSArray registeredDraggedTypes();

	@Generated
	@Selector("releaseGState")
	public native void releaseGState();

	@Generated
	@Selector("removeAllToolTips")
	public native void removeAllToolTips();

	@Generated
	@Selector("removeConstraint:")
	public native void removeConstraint(NSLayoutConstraint constraint);

	@Generated
	@Selector("removeConstraints:")
	public native void removeConstraints(NSArray constraints);

	@Generated
	@Selector("removeCursorRect:cursor:")
	public native void removeCursorRectCursor(@ByValue CGRect aRect,
			NSCursor anObj);

	@Generated
	@Selector("removeFromSuperview")
	public native void removeFromSuperview();

	@Generated
	@Selector("removeFromSuperviewWithoutNeedingDisplay")
	public native void removeFromSuperviewWithoutNeedingDisplay();

	@Generated
	@Selector("removeToolTip:")
	public native void removeToolTip(long tag);

	@Generated
	@Selector("removeTrackingArea:")
	public native void removeTrackingArea(NSTrackingArea trackingArea);

	@Generated
	@Selector("removeTrackingRect:")
	public native void removeTrackingRect(long tag);

	@Generated
	@Selector("renewGState")
	public native void renewGState();

	@Generated
	@Selector("replaceSubview:with:")
	public native void replaceSubviewWith(NSView oldView, NSView newView);

	@Generated
	@Selector("requiresConstraintBasedLayout")
	public static native boolean requiresConstraintBasedLayout();

	@Generated
	@Selector("resetCursorRects")
	public native void resetCursorRects();

	@Generated
	@Selector("resizeSubviewsWithOldSize:")
	public native void resizeSubviewsWithOldSize(@ByValue CGSize oldSize);

	@Generated
	@Selector("resizeWithOldSuperviewSize:")
	public native void resizeWithOldSuperviewSize(@ByValue CGSize oldSize);

	@Generated
	@Selector("rotateByAngle:")
	public native void rotateByAngle(double angle);

	@Generated
	@Selector("rulerView:didAddMarker:")
	public native void rulerViewDidAddMarker(NSRulerView ruler,
			NSRulerMarker marker);

	@Generated
	@Selector("rulerView:didMoveMarker:")
	public native void rulerViewDidMoveMarker(NSRulerView ruler,
			NSRulerMarker marker);

	@Generated
	@Selector("rulerView:didRemoveMarker:")
	public native void rulerViewDidRemoveMarker(NSRulerView ruler,
			NSRulerMarker marker);

	@Generated
	@Selector("rulerView:handleMouseDown:")
	public native void rulerViewHandleMouseDown(NSRulerView ruler, NSEvent event);

	@Generated
	@Selector("rulerView:locationForPoint:")
	public native double rulerViewLocationForPoint(NSRulerView ruler,
			@ByValue CGPoint aPoint);

	@Generated
	@Selector("rulerView:pointForLocation:")
	@ByValue
	public native CGPoint rulerViewPointForLocation(NSRulerView ruler,
			double aPoint);

	@Generated
	@Selector("rulerView:shouldAddMarker:")
	public native boolean rulerViewShouldAddMarker(NSRulerView ruler,
			NSRulerMarker marker);

	@Generated
	@Selector("rulerView:shouldMoveMarker:")
	public native boolean rulerViewShouldMoveMarker(NSRulerView ruler,
			NSRulerMarker marker);

	@Generated
	@Selector("rulerView:shouldRemoveMarker:")
	public native boolean rulerViewShouldRemoveMarker(NSRulerView ruler,
			NSRulerMarker marker);

	@Generated
	@Selector("rulerView:willAddMarker:atLocation:")
	public native double rulerViewWillAddMarkerAtLocation(NSRulerView ruler,
			NSRulerMarker marker, double location);

	@Generated
	@Selector("rulerView:willMoveMarker:toLocation:")
	public native double rulerViewWillMoveMarkerToLocation(NSRulerView ruler,
			NSRulerMarker marker, double location);

	@Generated
	@Selector("rulerView:willSetClientView:")
	public native void rulerViewWillSetClientView(NSRulerView ruler,
			NSView newClient);

	@Generated
	@Selector("scaleUnitSquareToSize:")
	public native void scaleUnitSquareToSize(@ByValue CGSize newUnitSize);

	@Generated
	@Selector("scrollClipView:toPoint:")
	public native void scrollClipViewToPoint(NSClipView aClipView,
			@ByValue CGPoint aPoint);

	@Generated
	@Selector("scrollPoint:")
	public native void scrollPoint(@ByValue CGPoint aPoint);

	@Generated
	@Selector("scrollRect:by:")
	public native void scrollRectBy(@ByValue CGRect aRect, @ByValue CGSize delta);

	@Generated
	@Selector("scrollRectToVisible:")
	public native boolean scrollRectToVisible(@ByValue CGRect aRect);

	@Generated
	@Selector("setAcceptsTouchEvents:")
	public native void setAcceptsTouchEvents(boolean flag);

	@Generated
	@Selector("setAlphaValue:")
	public native void setAlphaValue(double viewAlpha);

	@Generated
	@Selector("setAnimations:")
	public native void setAnimations(NSDictionary animations);

	@Generated
	@Selector("setAppearance:")
	public native void setAppearance(NSAppearance value);

	@Generated
	@Selector("setAutoresizesSubviews:")
	public native void setAutoresizesSubviews(boolean flag);

	@Generated
	@Selector("setAutoresizingMask:")
	public native void setAutoresizingMask(long mask);

	@Generated
	@Selector("setBackgroundFilters:")
	public native void setBackgroundFilters(NSArray filters);

	@Generated
	@Selector("setBounds:")
	public native void setBounds(@ByValue CGRect aRect);

	@Generated
	@Selector("setBoundsOrigin:")
	public native void setBoundsOrigin(@ByValue CGPoint newOrigin);

	@Generated
	@Selector("setBoundsRotation:")
	public native void setBoundsRotation(double angle);

	@Generated
	@Selector("setBoundsSize:")
	public native void setBoundsSize(@ByValue CGSize newSize);

	@Generated
	@Selector("setCanDrawConcurrently:")
	public native void setCanDrawConcurrently(boolean flag);

	@Generated
	@Selector("setCanDrawSubviewsIntoLayer:")
	public native void setCanDrawSubviewsIntoLayer(boolean flag);

	@Generated
	@Selector("setContentCompressionResistancePriority:forOrientation:")
	public native void setContentCompressionResistancePriorityForOrientation(
			float priority, long orientation);

	@Generated
	@Selector("setContentFilters:")
	public native void setContentFilters(NSArray filters);

	@Generated
	@Selector("setContentHuggingPriority:forOrientation:")
	public native void setContentHuggingPriorityForOrientation(float priority,
			long orientation);

	@Generated
	@Selector("setFocusRingType:")
	public native void setFocusRingType(long focusRingType);

	@Generated
	@Selector("setFrame:")
	public native void setFrame(@ByValue CGRect frameRect);

	@Generated
	@Selector("setFrameCenterRotation:")
	public native void setFrameCenterRotation(double angle);

	@Generated
	@Selector("setFrameOrigin:")
	public native void setFrameOrigin(@ByValue CGPoint newOrigin);

	@Generated
	@Selector("setFrameRotation:")
	public native void setFrameRotation(double angle);

	@Generated
	@Selector("setFrameSize:")
	public native void setFrameSize(@ByValue CGSize newSize);

	@Generated
	@Selector("setHidden:")
	public native void setHidden(boolean flag);

	@Generated
	@Selector("setIdentifier:")
	public native void setIdentifier(String value);

	@Generated
	@Selector("setKeyboardFocusRingNeedsDisplayInRect:")
	public native void setKeyboardFocusRingNeedsDisplayInRect(
			@ByValue CGRect rect);

	@Generated
	@Selector("setLayer:")
	public native void setLayer(CALayer newLayer);

	@Generated
	@Selector("setLayerContentsPlacement:")
	public native void setLayerContentsPlacement(long newPlacement);

	@Generated
	@Selector("setLayerContentsRedrawPolicy:")
	public native void setLayerContentsRedrawPolicy(long newPolicy);

	@Generated
	@Selector("setLayerUsesCoreImageFilters:")
	public native void setLayerUsesCoreImageFilters(boolean usesFilters);

	@Generated
	@Selector("setNeedsDisplay:")
	public native void setNeedsDisplay(boolean flag);

	@Generated
	@Selector("setNeedsDisplayInRect:")
	public native void setNeedsDisplayInRect(@ByValue CGRect invalidRect);

	@Generated
	@Selector("setNeedsLayout:")
	public native void setNeedsLayout(boolean flag);

	@Generated
	@Selector("setNeedsUpdateConstraints:")
	public native void setNeedsUpdateConstraints(boolean flag);

	@Generated
	@Selector("setNextKeyView:")
	public native void setNextKeyView(NSView next);

	@Generated
	@Selector("setPostsBoundsChangedNotifications:")
	public native void setPostsBoundsChangedNotifications(boolean flag);

	@Generated
	@Selector("setPostsFrameChangedNotifications:")
	public native void setPostsFrameChangedNotifications(boolean flag);

	@Generated
	@Selector("setPreparedContentRect:")
	public native void setPreparedContentRect(@ByValue CGRect value);

	@Generated
	@Selector("setShadow:")
	public native void setShadow(NSShadow shadow);

	@Generated
	@Selector("setSubviews:")
	public native void setSubviews(NSArray newSubviews);

	@Generated
	@Selector("setToolTip:")
	public native void setToolTip(String string);

	@Generated
	@Selector("setTranslatesAutoresizingMaskIntoConstraints:")
	public native void setTranslatesAutoresizingMaskIntoConstraints(boolean flag);

	@Generated
	@Selector("setUpGState")
	public native void setUpGState();

	@Generated
	@Selector("setUserInterfaceLayoutDirection:")
	public native void setUserInterfaceLayoutDirection(long value);

	@Generated
	@Selector("setWantsBestResolutionOpenGLSurface:")
	public native void setWantsBestResolutionOpenGLSurface(boolean flag);

	@Generated
	@Selector("setWantsLayer:")
	public native void setWantsLayer(boolean flag);

	@Generated
	@Selector("setWantsRestingTouches:")
	public native void setWantsRestingTouches(boolean flag);

	@Generated
	@Selector("shadow")
	public native NSShadow shadow();

	@Generated
	@Selector("shouldDelayWindowOrderingForEvent:")
	public native boolean shouldDelayWindowOrderingForEvent(NSEvent theEvent);

	@Generated
	@Selector("shouldDrawColor")
	public native boolean shouldDrawColor();

	@Generated
	@Selector("showDefinitionForAttributedString:atPoint:")
	public native void showDefinitionForAttributedStringAtPoint(
			NSAttributedString attrString, @ByValue CGPoint textBaselineOrigin);

	@Generated
	@Selector("showDefinitionForAttributedString:range:options:baselineOriginProvider:")
	public native void showDefinitionForAttributedStringRangeOptionsBaselineOriginProvider(
			NSAttributedString attrString,
			@ByValue NSRange targetRange,
			NSDictionary options,
			@ObjCBlock(name = "call_showDefinitionForAttributedStringRangeOptionsBaselineOriginProvider") Block_showDefinitionForAttributedStringRangeOptionsBaselineOriginProvider originProvider);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_showDefinitionForAttributedStringRangeOptionsBaselineOriginProvider {
		@Generated
		@ByValue
		public CGPoint call_showDefinitionForAttributedStringRangeOptionsBaselineOriginProvider(
				@ByValue NSRange arg0);
	}

	@Generated
	@Selector("sortSubviewsUsingFunction:context:")
	public native void sortSubviewsUsingFunctionContext(
			@FunctionPtr(name = "call_sortSubviewsUsingFunctionContext") Function_sortSubviewsUsingFunctionContext compare,
			VoidPtr context);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Function_sortSubviewsUsingFunctionContext {
		@Generated
		public long call_sortSubviewsUsingFunctionContext(
				@Mapped(ObjCObjectMapper.class) Object arg0,
				@Mapped(ObjCObjectMapper.class) Object arg1, VoidPtr arg2);
	}

	@Generated
	@Selector("subviews")
	public native NSArray subviews();

	@Generated
	@Selector("superview")
	public native NSView superview();

	@Generated
	@Selector("tag")
	public native long tag();

	@Generated
	@Selector("toolTip")
	public native String toolTip();

	@Generated
	@Selector("trackingAreas")
	public native NSArray trackingAreas();

	@Generated
	@Selector("translateOriginToPoint:")
	public native void translateOriginToPoint(@ByValue CGPoint translation);

	@Generated
	@Selector("translateRectsNeedingDisplayInRect:by:")
	public native void translateRectsNeedingDisplayInRectBy(
			@ByValue CGRect clipRect, @ByValue CGSize delta);

	@Generated
	@Selector("translatesAutoresizingMaskIntoConstraints")
	public native boolean translatesAutoresizingMaskIntoConstraints();

	@Generated
	@Selector("unlockFocus")
	public native void unlockFocus();

	@Generated
	@Selector("unregisterDraggedTypes")
	public native void unregisterDraggedTypes();

	@Generated
	@Selector("updateConstraints")
	public native void updateConstraints();

	@Generated
	@Selector("updateConstraintsForSubtreeIfNeeded")
	public native void updateConstraintsForSubtreeIfNeeded();

	@Generated
	@IsOptional
	@Selector("updateDraggingItemsForDrag:")
	public native void updateDraggingItemsForDrag(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("updateLayer")
	public native void updateLayer();

	@Generated
	@Selector("updateTrackingAreas")
	public native void updateTrackingAreas();

	@Generated
	@Selector("userInterfaceLayoutDirection")
	public native long userInterfaceLayoutDirection();

	@Generated
	@Selector("viewDidChangeBackingProperties")
	public native void viewDidChangeBackingProperties();

	@Generated
	@Selector("viewDidEndLiveResize")
	public native void viewDidEndLiveResize();

	@Generated
	@Selector("viewDidHide")
	public native void viewDidHide();

	@Generated
	@Selector("viewDidMoveToSuperview")
	public native void viewDidMoveToSuperview();

	@Generated
	@Selector("viewDidMoveToWindow")
	public native void viewDidMoveToWindow();

	@Generated
	@Selector("viewDidUnhide")
	public native void viewDidUnhide();

	@Generated
	@Selector("viewWillDraw")
	public native void viewWillDraw();

	@Generated
	@Selector("viewWillMoveToSuperview:")
	public native void viewWillMoveToSuperview(NSView newSuperview);

	@Generated
	@Selector("viewWillMoveToWindow:")
	public native void viewWillMoveToWindow(NSWindow newWindow);

	@Generated
	@Selector("viewWillStartLiveResize")
	public native void viewWillStartLiveResize();

	@Generated
	@Selector("viewWithTag:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object viewWithTag(long aTag);

	@Generated
	@Selector("visibleRect")
	@ByValue
	public native CGRect visibleRect();

	@Generated
	@Selector("wantsBestResolutionOpenGLSurface")
	public native boolean wantsBestResolutionOpenGLSurface();

	@Generated
	@Selector("wantsDefaultClipping")
	public native boolean wantsDefaultClipping();

	@Generated
	@Selector("wantsLayer")
	public native boolean wantsLayer();

	@Generated
	@IsOptional
	@Selector("wantsPeriodicDraggingUpdates")
	public native boolean wantsPeriodicDraggingUpdates();

	@Generated
	@Selector("wantsRestingTouches")
	public native boolean wantsRestingTouches();

	@Generated
	@Selector("wantsUpdateLayer")
	public native boolean wantsUpdateLayer();

	@Generated
	@Selector("widthAdjustLimit")
	public native double widthAdjustLimit();

	@Generated
	@Selector("willRemoveSubview:")
	public native void willRemoveSubview(NSView subview);

	@Generated
	@Selector("window")
	public native NSWindow window();

	@Generated
	@Selector("writeEPSInsideRect:toPasteboard:")
	public native void writeEPSInsideRectToPasteboard(@ByValue CGRect rect,
			NSPasteboard pasteboard);

	@Generated
	@Selector("writePDFInsideRect:toPasteboard:")
	public native void writePDFInsideRectToPasteboard(@ByValue CGRect rect,
			NSPasteboard pasteboard);
}
