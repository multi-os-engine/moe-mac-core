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


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.appkit.NSApplication;
import mac.appkit.NSMenu;
import mac.foundation.*;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSApplicationDelegate")
public interface NSApplicationDelegate {
	@Generated
	@IsOptional
	@Selector("application:didDecodeRestorableState:")
	public void applicationDidDecodeRestorableState(NSApplication app,
			NSCoder coder);

	@Generated
	@IsOptional
	@Selector("application:didFailToRegisterForRemoteNotificationsWithError:")
	public void applicationDidFailToRegisterForRemoteNotificationsWithError(
			NSApplication application, NSError error);

	@Generated
	@IsOptional
	@Selector("application:didReceiveRemoteNotification:")
	public void applicationDidReceiveRemoteNotification(
			NSApplication application, NSDictionary userInfo);

	@Generated
	@IsOptional
	@Selector("application:didRegisterForRemoteNotificationsWithDeviceToken:")
	public void applicationDidRegisterForRemoteNotificationsWithDeviceToken(
			NSApplication application, NSData deviceToken);

	@Generated
	@IsOptional
	@Selector("application:openFile:")
	public boolean applicationOpenFile(NSApplication sender, String filename);

	@Generated
	@IsOptional
	@Selector("application:openFileWithoutUI:")
	public boolean applicationOpenFileWithoutUI(
			@Mapped(ObjCObjectMapper.class) Object sender, String filename);

	@Generated
	@IsOptional
	@Selector("application:openFiles:")
	public void applicationOpenFiles(NSApplication sender, NSArray filenames);

	@Generated
	@IsOptional
	@Selector("application:openTempFile:")
	public boolean applicationOpenTempFile(NSApplication sender, String filename);

	@Generated
	@IsOptional
	@Selector("application:printFile:")
	public boolean applicationPrintFile(NSApplication sender, String filename);

	@Generated
	@IsOptional
	@Selector("application:printFiles:withSettings:showPrintPanels:")
	public long applicationPrintFilesWithSettingsShowPrintPanels(
			NSApplication application, NSArray fileNames,
			NSDictionary printSettings, boolean showPrintPanels);

	@Generated
	@IsOptional
	@Selector("application:willEncodeRestorableState:")
	public void applicationWillEncodeRestorableState(NSApplication app,
			NSCoder coder);

	@Generated
	@IsOptional
	@Selector("application:willPresentError:")
	public NSError applicationWillPresentError(NSApplication application,
			NSError error);

	@Generated
	@IsOptional
	@Selector("applicationDidBecomeActive:")
	public void applicationDidBecomeActive(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("applicationDidChangeOcclusionState:")
	public void applicationDidChangeOcclusionState(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("applicationDidChangeScreenParameters:")
	public void applicationDidChangeScreenParameters(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("applicationDidFinishLaunching:")
	public void applicationDidFinishLaunching(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("applicationDidHide:")
	public void applicationDidHide(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("applicationDidResignActive:")
	public void applicationDidResignActive(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("applicationDidUnhide:")
	public void applicationDidUnhide(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("applicationDidUpdate:")
	public void applicationDidUpdate(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("applicationDockMenu:")
	public NSMenu applicationDockMenu(NSApplication sender);

	@Generated
	@IsOptional
	@Selector("applicationOpenUntitledFile:")
	public boolean applicationOpenUntitledFile(NSApplication sender);

	@Generated
	@IsOptional
	@Selector("applicationShouldHandleReopen:hasVisibleWindows:")
	public boolean applicationShouldHandleReopenHasVisibleWindows(
			NSApplication sender, boolean flag);

	@Generated
	@IsOptional
	@Selector("applicationShouldOpenUntitledFile:")
	public boolean applicationShouldOpenUntitledFile(NSApplication sender);

	@Generated
	@IsOptional
	@Selector("applicationShouldTerminate:")
	public long applicationShouldTerminate(NSApplication sender);

	@Generated
	@IsOptional
	@Selector("applicationShouldTerminateAfterLastWindowClosed:")
	public boolean applicationShouldTerminateAfterLastWindowClosed(
			NSApplication sender);

	@Generated
	@IsOptional
	@Selector("applicationWillBecomeActive:")
	public void applicationWillBecomeActive(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("applicationWillFinishLaunching:")
	public void applicationWillFinishLaunching(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("applicationWillHide:")
	public void applicationWillHide(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("applicationWillResignActive:")
	public void applicationWillResignActive(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("applicationWillTerminate:")
	public void applicationWillTerminate(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("applicationWillUnhide:")
	public void applicationWillUnhide(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("applicationWillUpdate:")
	public void applicationWillUpdate(NSNotification notification);
}
