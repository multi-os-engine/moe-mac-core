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

package mac.appkit.protocol;


import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.appkit.*;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.coregraphics.struct.CGSize;
import mac.foundation.NSArray;
import mac.foundation.NSCoder;
import mac.foundation.NSNotification;
import mac.foundation.NSUndoManager;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSWindowDelegate")
public interface NSWindowDelegate {
	@Generated
	@IsOptional
	@Selector("customWindowsToEnterFullScreenForWindow:")
	public NSArray customWindowsToEnterFullScreenForWindow(NSWindow window);

	@Generated
	@IsOptional
	@Selector("customWindowsToEnterFullScreenForWindow:onScreen:")
	public NSArray customWindowsToEnterFullScreenForWindowOnScreen(
			NSWindow window, NSScreen screen);

	@Generated
	@IsOptional
	@Selector("customWindowsToExitFullScreenForWindow:")
	public NSArray customWindowsToExitFullScreenForWindow(NSWindow window);

	@Generated
	@IsOptional
	@Selector("window:didDecodeRestorableState:")
	public void windowDidDecodeRestorableState(NSWindow window, NSCoder state);

	@Generated
	@IsOptional
	@Selector("window:shouldDragDocumentWithEvent:from:withPasteboard:")
	public boolean windowShouldDragDocumentWithEventFromWithPasteboard(
			NSWindow window, NSEvent event, @ByValue CGPoint dragImageLocation,
			NSPasteboard pasteboard);

	@Generated
	@IsOptional
	@Selector("window:shouldPopUpDocumentPathMenu:")
	public boolean windowShouldPopUpDocumentPathMenu(NSWindow window,
			NSMenu menu);

	@Generated
	@IsOptional
	@Selector("window:startCustomAnimationToEnterFullScreenOnScreen:withDuration:")
	public void windowStartCustomAnimationToEnterFullScreenOnScreenWithDuration(
			NSWindow window, NSScreen screen, double duration);

	@Generated
	@IsOptional
	@Selector("window:startCustomAnimationToEnterFullScreenWithDuration:")
	public void windowStartCustomAnimationToEnterFullScreenWithDuration(
			NSWindow window, double duration);

	@Generated
	@IsOptional
	@Selector("window:startCustomAnimationToExitFullScreenWithDuration:")
	public void windowStartCustomAnimationToExitFullScreenWithDuration(
			NSWindow window, double duration);

	@Generated
	@IsOptional
	@Selector("window:willEncodeRestorableState:")
	public void windowWillEncodeRestorableState(NSWindow window, NSCoder state);

	@Generated
	@IsOptional
	@Selector("window:willPositionSheet:usingRect:")
	@ByValue
	public CGRect windowWillPositionSheetUsingRect(NSWindow window,
			NSWindow sheet, @ByValue CGRect rect);

	@Generated
	@IsOptional
	@Selector("window:willResizeForVersionBrowserWithMaxPreferredSize:maxAllowedSize:")
	@ByValue
	public CGSize windowWillResizeForVersionBrowserWithMaxPreferredSizeMaxAllowedSize(
			NSWindow window, @ByValue CGSize maxPreferredFrameSize,
			@ByValue CGSize maxAllowedFrameSize);

	@Generated
	@IsOptional
	@Selector("window:willUseFullScreenContentSize:")
	@ByValue
	public CGSize windowWillUseFullScreenContentSize(NSWindow window,
			@ByValue CGSize proposedSize);

	@Generated
	@IsOptional
	@Selector("window:willUseFullScreenPresentationOptions:")
	public long windowWillUseFullScreenPresentationOptions(NSWindow window,
			long proposedOptions);

	@Generated
	@IsOptional
	@Selector("windowDidBecomeKey:")
	public void windowDidBecomeKey(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("windowDidBecomeMain:")
	public void windowDidBecomeMain(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("windowDidChangeBackingProperties:")
	public void windowDidChangeBackingProperties(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("windowDidChangeOcclusionState:")
	public void windowDidChangeOcclusionState(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("windowDidChangeScreen:")
	public void windowDidChangeScreen(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("windowDidChangeScreenProfile:")
	public void windowDidChangeScreenProfile(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("windowDidDeminiaturize:")
	public void windowDidDeminiaturize(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("windowDidEndLiveResize:")
	public void windowDidEndLiveResize(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("windowDidEndSheet:")
	public void windowDidEndSheet(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("windowDidEnterFullScreen:")
	public void windowDidEnterFullScreen(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("windowDidEnterVersionBrowser:")
	public void windowDidEnterVersionBrowser(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("windowDidExitFullScreen:")
	public void windowDidExitFullScreen(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("windowDidExitVersionBrowser:")
	public void windowDidExitVersionBrowser(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("windowDidExpose:")
	public void windowDidExpose(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("windowDidFailToEnterFullScreen:")
	public void windowDidFailToEnterFullScreen(NSWindow window);

	@Generated
	@IsOptional
	@Selector("windowDidFailToExitFullScreen:")
	public void windowDidFailToExitFullScreen(NSWindow window);

	@Generated
	@IsOptional
	@Selector("windowDidMiniaturize:")
	public void windowDidMiniaturize(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("windowDidMove:")
	public void windowDidMove(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("windowDidResignKey:")
	public void windowDidResignKey(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("windowDidResignMain:")
	public void windowDidResignMain(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("windowDidResize:")
	public void windowDidResize(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("windowDidUpdate:")
	public void windowDidUpdate(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("windowShouldClose:")
	public boolean windowShouldClose(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@IsOptional
	@Selector("windowShouldZoom:toFrame:")
	public boolean windowShouldZoomToFrame(NSWindow window,
			@ByValue CGRect newFrame);

	@Generated
	@IsOptional
	@Selector("windowWillBeginSheet:")
	public void windowWillBeginSheet(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("windowWillClose:")
	public void windowWillClose(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("windowWillEnterFullScreen:")
	public void windowWillEnterFullScreen(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("windowWillEnterVersionBrowser:")
	public void windowWillEnterVersionBrowser(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("windowWillExitFullScreen:")
	public void windowWillExitFullScreen(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("windowWillExitVersionBrowser:")
	public void windowWillExitVersionBrowser(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("windowWillMiniaturize:")
	public void windowWillMiniaturize(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("windowWillMove:")
	public void windowWillMove(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("windowWillResize:toSize:")
	@ByValue
	public CGSize windowWillResizeToSize(NSWindow sender,
			@ByValue CGSize frameSize);

	@Generated
	@IsOptional
	@Selector("windowWillReturnFieldEditor:toObject:")
	@MappedReturn(ObjCObjectMapper.class)
	public Object windowWillReturnFieldEditorToObject(NSWindow sender,
			@Mapped(ObjCObjectMapper.class) Object client);

	@Generated
	@IsOptional
	@Selector("windowWillReturnUndoManager:")
	public NSUndoManager windowWillReturnUndoManager(NSWindow window);

	@Generated
	@IsOptional
	@Selector("windowWillStartLiveResize:")
	public void windowWillStartLiveResize(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("windowWillUseStandardFrame:defaultFrame:")
	@ByValue
	public CGRect windowWillUseStandardFrameDefaultFrame(NSWindow window,
			@ByValue CGRect newFrame);
}
