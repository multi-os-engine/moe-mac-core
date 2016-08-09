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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.appkit.opaque.NSModalSession;
import mac.appkit.protocol.NSUserInterfaceValidations;
import mac.foundation.*;
import mac.foundation.struct.NSRange;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSApplication extends NSResponder implements
		NSUserInterfaceValidations {
	static {
		NatJ.register();
	}

	@Generated
	protected NSApplication(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("abortModal")
	public native void abortModal();

	@Generated
	@Selector("activateContextHelpMode:")
	public native void activateContextHelpMode(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("activateIgnoringOtherApps:")
	public native void activateIgnoringOtherApps(boolean flag);

	@Generated
	@Selector("activationPolicy")
	public native long activationPolicy();

	@Generated
	@Selector("addWindowsItem:title:filename:")
	public native void addWindowsItemTitleFilename(NSWindow win,
			String aString, boolean isFilename);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSApplication alloc();

	@Generated
	@Selector("application:printFiles:")
	public native void applicationPrintFiles(NSApplication sender,
			NSArray filenames);

	@Generated
	@Selector("applicationIconImage")
	public native NSImage applicationIconImage();

	@Generated
	@Selector("arrangeInFront:")
	public native void arrangeInFront(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("beginModalSessionForWindow:")
	public native NSModalSession beginModalSessionForWindow(NSWindow theWindow);

	@Generated
	@Selector("beginModalSessionForWindow:relativeToWindow:")
	public native NSModalSession beginModalSessionForWindowRelativeToWindow(
			NSWindow theWindow, NSWindow docWindow);

	@Generated
	@Selector("beginSheet:modalForWindow:modalDelegate:didEndSelector:contextInfo:")
	public native void beginSheetModalForWindowModalDelegateDidEndSelectorContextInfo(
			NSWindow sheet, NSWindow docWindow,
			@Mapped(ObjCObjectMapper.class) Object modalDelegate,
			SEL didEndSelector, VoidPtr contextInfo);

	@Generated
	@Selector("cancelUserAttentionRequest:")
	public native void cancelUserAttentionRequest(long request);

	@Generated
	@Selector("changeWindowsItem:title:filename:")
	public native void changeWindowsItemTitleFilename(NSWindow win,
			String aString, boolean isFilename);

	@Generated
	@Selector("completeStateRestoration")
	public native void completeStateRestoration();

	@Generated
	@Selector("context")
	public native NSGraphicsContext context();

	@Generated
	@Selector("currentEvent")
	public native NSEvent currentEvent();

	@Generated
	@Selector("currentSystemPresentationOptions")
	public native long currentSystemPresentationOptions();

	@Generated
	@Selector("deactivate")
	public native void deactivate();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("detachDrawingThread:toTarget:withObject:")
	public static native void detachDrawingThreadToTargetWithObject(
			SEL selector, @Mapped(ObjCObjectMapper.class) Object target,
			@Mapped(ObjCObjectMapper.class) Object argument);

	@Generated
	@Selector("disableRelaunchOnLogin")
	public native void disableRelaunchOnLogin();

	@Generated
	@Selector("discardEventsMatchingMask:beforeEvent:")
	public native void discardEventsMatchingMaskBeforeEvent(long mask,
			NSEvent lastEvent);

	@Generated
	@Selector("dockTile")
	public native NSDockTile dockTile();

	@Generated
	@Selector("enableRelaunchOnLogin")
	public native void enableRelaunchOnLogin();

	@Generated
	@Selector("enabledRemoteNotificationTypes")
	public native long enabledRemoteNotificationTypes();

	@Generated
	@Selector("endModalSession:")
	public native void endModalSession(NSModalSession session);

	@Generated
	@Selector("endSheet:")
	public native void endSheet(NSWindow sheet);

	@Generated
	@Selector("endSheet:returnCode:")
	public native void endSheetReturnCode(NSWindow sheet, long returnCode);

	@Generated
	@Selector("extendStateRestoration")
	public native void extendStateRestoration();

	@Generated
	@Selector("finishLaunching")
	public native void finishLaunching();

	@Generated
	@Selector("helpMenu")
	public native NSMenu helpMenu();

	@Generated
	@Selector("hide:")
	public native void hide(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("hideOtherApplications:")
	public native void hideOtherApplications(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("init")
	public native NSApplication init();

	@Generated
	@Selector("isActive")
	public native boolean isActive();

	@Generated
	@Selector("isFullKeyboardAccessEnabled")
	public native boolean isFullKeyboardAccessEnabled();

	@Generated
	@Selector("isHidden")
	public native boolean isHidden();

	@Generated
	@Selector("isRunning")
	public native boolean isRunning();

	@Generated
	@Selector("keyWindow")
	public native NSWindow keyWindow();

	@Generated
	@Selector("mainMenu")
	public native NSMenu mainMenu();

	@Generated
	@Selector("mainWindow")
	public native NSWindow mainWindow();

	@Generated
	@Selector("makeWindowsPerform:inOrder:")
	public native NSWindow makeWindowsPerformInOrder(SEL aSelector, boolean flag);

	@Generated
	@Selector("miniaturizeAll:")
	public native void miniaturizeAll(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("modalWindow")
	public native NSWindow modalWindow();

	@Generated
	@Selector("nextEventMatchingMask:untilDate:inMode:dequeue:")
	public native NSEvent nextEventMatchingMaskUntilDateInModeDequeue(
			long mask, NSDate expiration, String mode, boolean deqFlag);

	@Generated
	@Selector("occlusionState")
	public native long occlusionState();

	@Generated
	@Selector("orderFrontCharacterPalette:")
	public native void orderFrontCharacterPalette(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("orderFrontColorPanel:")
	public native void orderFrontColorPanel(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("orderFrontStandardAboutPanel:")
	public native void orderFrontStandardAboutPanel(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("orderFrontStandardAboutPanelWithOptions:")
	public native void orderFrontStandardAboutPanelWithOptions(
			NSDictionary optionsDictionary);

	@Generated
	@Selector("orderedDocuments")
	public native NSArray orderedDocuments();

	@Generated
	@Selector("orderedWindows")
	public native NSArray orderedWindows();

	@Generated
	@Selector("postEvent:atStart:")
	public native void postEventAtStart(NSEvent event, boolean flag);

	@Generated
	@Selector("presentationOptions")
	public native long presentationOptions();

	@Generated
	@Selector("preventWindowOrdering")
	public native void preventWindowOrdering();

	@Generated
	@Selector("registerForRemoteNotificationTypes:")
	public native void registerForRemoteNotificationTypes(long types);

	@Generated
	@Selector("registerServicesMenuSendTypes:returnTypes:")
	public native void registerServicesMenuSendTypesReturnTypes(
			NSArray sendTypes, NSArray returnTypes);

	@Generated
	@Selector("registerUserInterfaceItemSearchHandler:")
	public native void registerUserInterfaceItemSearchHandler(
			@Mapped(ObjCObjectMapper.class) Object handler);

	@Generated
	@Selector("removeWindowsItem:")
	public native void removeWindowsItem(NSWindow win);

	@Generated
	@Selector("replyToApplicationShouldTerminate:")
	public native void replyToApplicationShouldTerminate(boolean shouldTerminate);

	@Generated
	@Selector("replyToOpenOrPrint:")
	public native void replyToOpenOrPrint(long reply);

	@Generated
	@Selector("reportException:")
	public native void reportException(NSException theException);

	@Generated
	@Selector("requestUserAttention:")
	public native long requestUserAttention(long requestType);

	@Generated
	@Selector("restoreWindowWithIdentifier:state:completionHandler:")
	public native boolean restoreWindowWithIdentifierStateCompletionHandler(
			String identifier,
			NSCoder state,
			@ObjCBlock(name = "call_restoreWindowWithIdentifierStateCompletionHandler") Block_restoreWindowWithIdentifierStateCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_restoreWindowWithIdentifierStateCompletionHandler {
		@Generated
		public void call_restoreWindowWithIdentifierStateCompletionHandler(
				NSWindow arg0, NSError arg1);
	}

	@Generated
	@Selector("run")
	public native void run();

	@Generated
	@Selector("runModalForWindow:")
	public native long runModalForWindow(NSWindow theWindow);

	@Generated
	@Selector("runModalForWindow:relativeToWindow:")
	public native long runModalForWindowRelativeToWindow(NSWindow theWindow,
			NSWindow docWindow);

	@Generated
	@Selector("runModalSession:")
	public native long runModalSession(NSModalSession session);

	@Generated
	@Selector("runPageLayout:")
	public native void runPageLayout(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("searchString:inUserInterfaceItemString:searchRange:foundRange:")
	public native boolean searchStringInUserInterfaceItemStringSearchRangeFoundRange(
			String searchString,
			String stringToSearch,
			@ByValue NSRange searchRange,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange foundRange);

	@Generated
	@Selector("sendAction:to:from:")
	public native boolean sendActionToFrom(SEL theAction,
			@Mapped(ObjCObjectMapper.class) Object theTarget,
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("sendEvent:")
	public native void sendEvent(NSEvent theEvent);

	@Generated
	@Selector("servicesMenu")
	public native NSMenu servicesMenu();

	@Generated
	@Selector("servicesProvider")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object servicesProvider();

	@Generated
	@Selector("setActivationPolicy:")
	public native boolean setActivationPolicy(long activationPolicy);

	@Generated
	@Selector("setApplicationIconImage:")
	public native void setApplicationIconImage(NSImage image);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("setHelpMenu:")
	public native void setHelpMenu(NSMenu helpMenu);

	@Generated
	@Selector("setMainMenu:")
	public native void setMainMenu(NSMenu aMenu);

	@Generated
	@Selector("setPresentationOptions:")
	public native void setPresentationOptions(long newOptions);

	@Generated
	@Selector("setServicesMenu:")
	public native void setServicesMenu(NSMenu aMenu);

	@Generated
	@Selector("setServicesProvider:")
	public native void setServicesProvider(
			@Mapped(ObjCObjectMapper.class) Object provider);

	@Generated
	@Selector("setWindowsMenu:")
	public native void setWindowsMenu(NSMenu aMenu);

	@Generated
	@Selector("setWindowsNeedUpdate:")
	public native void setWindowsNeedUpdate(boolean needUpdate);

	@Generated
	@Selector("sharedApplication")
	public static native NSApplication sharedApplication();

	@Generated
	@Selector("showHelp:")
	public native void showHelp(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("stop:")
	public native void stop(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("stopModal")
	public native void stopModal();

	@Generated
	@Selector("stopModalWithCode:")
	public native void stopModalWithCode(long returnCode);

	@Generated
	@Selector("targetForAction:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object targetForAction(SEL theAction);

	@Generated
	@Selector("targetForAction:to:from:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object targetForActionToFrom(SEL theAction,
			@Mapped(ObjCObjectMapper.class) Object theTarget,
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("terminate:")
	public native void terminate(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("tryToPerform:with:")
	public native boolean tryToPerformWith(SEL anAction,
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("unhide:")
	public native void unhide(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("unhideAllApplications:")
	public native void unhideAllApplications(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("unhideWithoutActivation")
	public native void unhideWithoutActivation();

	@Generated
	@Selector("unregisterForRemoteNotifications")
	public native void unregisterForRemoteNotifications();

	@Generated
	@Selector("unregisterUserInterfaceItemSearchHandler:")
	public native void unregisterUserInterfaceItemSearchHandler(
			@Mapped(ObjCObjectMapper.class) Object handler);

	@Generated
	@Selector("updateWindows")
	public native void updateWindows();

	@Generated
	@Selector("updateWindowsItem:")
	public native void updateWindowsItem(NSWindow win);

	@Generated
	@Selector("userInterfaceLayoutDirection")
	public native long userInterfaceLayoutDirection();

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
	@Selector("windowWithWindowNumber:")
	public native NSWindow windowWithWindowNumber(long windowNum);

	@Generated
	@Selector("windows")
	public native NSArray windows();

	@Generated
	@Selector("windowsMenu")
	public native NSMenu windowsMenu();
}
