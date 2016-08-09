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
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import mac.NSObject;
import mac.coregraphics.struct.CGPoint;
import mac.foundation.*;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSWorkspace extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSWorkspace(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("URLForApplicationToOpenURL:")
	public native NSURL URLForApplicationToOpenURL(NSURL url);

	@Generated
	@Selector("URLForApplicationWithBundleIdentifier:")
	public native NSURL URLForApplicationWithBundleIdentifier(
			String bundleIdentifier);

	@Generated
	@Selector("absolutePathForAppBundleWithIdentifier:")
	public native String absolutePathForAppBundleWithIdentifier(
			String bundleIdentifier);

	@Generated
	@Selector("activateFileViewerSelectingURLs:")
	public native void activateFileViewerSelectingURLs(NSArray fileURLs);

	@Generated
	@Selector("activeApplication")
	public native NSDictionary activeApplication();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSWorkspace alloc();

	@Generated
	@Selector("checkForRemovableMedia")
	public native void checkForRemovableMedia();

	@Generated
	@Selector("desktopImageOptionsForScreen:")
	public native NSDictionary desktopImageOptionsForScreen(NSScreen screen);

	@Generated
	@Selector("desktopImageURLForScreen:")
	public native NSURL desktopImageURLForScreen(NSScreen screen);

	@Generated
	@Selector("duplicateURLs:completionHandler:")
	public native void duplicateURLsCompletionHandler(
			NSArray URLs,
			@ObjCBlock(name = "call_duplicateURLsCompletionHandler") Block_duplicateURLsCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_duplicateURLsCompletionHandler {
		@Generated
		public void call_duplicateURLsCompletionHandler(NSDictionary arg0,
				NSError arg1);
	}

	@Generated
	@Selector("extendPowerOffBy:")
	public native long extendPowerOffBy(long requested);

	@Generated
	@Selector("fileLabelColors")
	public native NSArray fileLabelColors();

	@Generated
	@Selector("fileLabels")
	public native NSArray fileLabels();

	@Generated
	@Selector("fileSystemChanged")
	public native boolean fileSystemChanged();

	@Generated
	@Selector("filenameExtension:isValidForType:")
	public native boolean filenameExtensionIsValidForType(
			String filenameExtension, String typeName);

	@Generated
	@Selector("findApplications")
	public native void findApplications();

	@Generated
	@Selector("frontmostApplication")
	public native NSRunningApplication frontmostApplication();

	@Generated
	@Selector("fullPathForApplication:")
	public native String fullPathForApplication(String appName);

	@Generated
	@Selector("getFileSystemInfoForPath:isRemovable:isWritable:isUnmountable:description:type:")
	public native boolean getFileSystemInfoForPathIsRemovableIsWritableIsUnmountableDescriptionType(
			String fullPath, BoolPtr removableFlag, BoolPtr writableFlag,
			BoolPtr unmountableFlag, Ptr<NSString> description,
			Ptr<NSString> fileSystemType);

	@Generated
	@Selector("getInfoForFile:application:type:")
	public native boolean getInfoForFileApplicationType(String fullPath,
			Ptr<NSString> appName, Ptr<NSString> type);

	@Generated
	@Selector("hideOtherApplications")
	public native void hideOtherApplications();

	@Generated
	@Selector("iconForFile:")
	public native NSImage iconForFile(String fullPath);

	@Generated
	@Selector("iconForFileType:")
	public native NSImage iconForFileType(String fileType);

	@Generated
	@Selector("iconForFiles:")
	public native NSImage iconForFiles(NSArray fullPaths);

	@Generated
	@Selector("init")
	public native NSWorkspace init();

	@Generated
	@Selector("isFilePackageAtPath:")
	public native boolean isFilePackageAtPath(String fullPath);

	@Generated
	@Selector("launchAppWithBundleIdentifier:options:additionalEventParamDescriptor:launchIdentifier:")
	public native boolean launchAppWithBundleIdentifierOptionsAdditionalEventParamDescriptorLaunchIdentifier(
			String bundleIdentifier, long options,
			NSAppleEventDescriptor descriptor, Ptr<NSNumber> identifier);

	@Generated
	@Selector("launchApplication:")
	public native boolean launchApplication(String appName);

	@Generated
	@Selector("launchApplication:showIcon:autolaunch:")
	public native boolean launchApplicationShowIconAutolaunch(String appName,
			boolean showIcon, boolean autolaunch);

	@Generated
	@Selector("launchApplicationAtURL:options:configuration:error:")
	public native NSRunningApplication launchApplicationAtURLOptionsConfigurationError(
			NSURL url, long options, NSDictionary configuration,
			Ptr<NSError> error);

	@Generated
	@Selector("launchedApplications")
	public native NSArray launchedApplications();

	@Generated
	@Selector("localizedDescriptionForType:")
	public native String localizedDescriptionForType(String typeName);

	@Generated
	@Selector("menuBarOwningApplication")
	public native NSRunningApplication menuBarOwningApplication();

	@Generated
	@Selector("mountNewRemovableMedia")
	public native NSArray mountNewRemovableMedia();

	@Generated
	@Selector("mountedLocalVolumePaths")
	public native NSArray mountedLocalVolumePaths();

	@Generated
	@Selector("mountedRemovableMedia")
	public native NSArray mountedRemovableMedia();

	@Generated
	@Selector("noteFileSystemChanged")
	public native void noteFileSystemChanged();

	@Generated
	@Selector("noteFileSystemChanged:")
	public native void noteFileSystemChanged(String path);

	@Generated
	@Selector("noteUserDefaultsChanged")
	public native void noteUserDefaultsChanged();

	@Generated
	@Selector("notificationCenter")
	public native NSNotificationCenter notificationCenter();

	@Generated
	@Selector("openFile:")
	public native boolean openFile(String fullPath);

	@Generated
	@Selector("openFile:fromImage:at:inView:")
	public native boolean openFileFromImageAtInView(String fullPath,
			NSImage anImage, @ByValue CGPoint point, NSView aView);

	@Generated
	@Selector("openFile:withApplication:")
	public native boolean openFileWithApplication(String fullPath,
			String appName);

	@Generated
	@Selector("openFile:withApplication:andDeactivate:")
	public native boolean openFileWithApplicationAndDeactivate(String fullPath,
			String appName, boolean flag);

	@Generated
	@Selector("openTempFile:")
	public native boolean openTempFile(String fullPath);

	@Generated
	@Selector("openURL:")
	public native boolean openURL(NSURL url);

	@Generated
	@Selector("openURLs:withAppBundleIdentifier:options:additionalEventParamDescriptor:launchIdentifiers:")
	public native boolean openURLsWithAppBundleIdentifierOptionsAdditionalEventParamDescriptorLaunchIdentifiers(
			NSArray urls, String bundleIdentifier, long options,
			NSAppleEventDescriptor descriptor, Ptr<NSArray> identifiers);

	@Generated
	@Selector("performFileOperation:source:destination:files:tag:")
	public native boolean performFileOperationSourceDestinationFilesTag(
			String operation, String source, String destination, NSArray files,
			LongPtr tag);

	@Generated
	@Selector("preferredFilenameExtensionForType:")
	public native String preferredFilenameExtensionForType(String typeName);

	@Generated
	@Selector("recycleURLs:completionHandler:")
	public native void recycleURLsCompletionHandler(
			NSArray URLs,
			@ObjCBlock(name = "call_recycleURLsCompletionHandler") Block_recycleURLsCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_recycleURLsCompletionHandler {
		@Generated
		public void call_recycleURLsCompletionHandler(NSDictionary arg0,
				NSError arg1);
	}

	@Generated
	@Selector("runningApplications")
	public native NSArray runningApplications();

	@Generated
	@Selector("selectFile:inFileViewerRootedAtPath:")
	public native boolean selectFileInFileViewerRootedAtPath(String fullPath,
			String rootFullPath);

	@Generated
	@Selector("setDesktopImageURL:forScreen:options:error:")
	public native boolean setDesktopImageURLForScreenOptionsError(NSURL url,
			NSScreen screen, NSDictionary options, Ptr<NSError> error);

	@Generated
	@Selector("setIcon:forFile:options:")
	public native boolean setIconForFileOptions(NSImage image, String fullPath,
			long options);

	@Generated
	@Selector("sharedWorkspace")
	public static native NSWorkspace sharedWorkspace();

	@Generated
	@Selector("showSearchResultsForQueryString:")
	public native boolean showSearchResultsForQueryString(String queryString);

	@Generated
	@Selector("slideImage:from:to:")
	public native void slideImageFromTo(NSImage image,
			@ByValue CGPoint fromPoint, @ByValue CGPoint toPoint);

	@Generated
	@Selector("type:conformsToType:")
	public native boolean typeConformsToType(String firstTypeName,
			String secondTypeName);

	@Generated
	@Selector("typeOfFile:error:")
	public native String typeOfFileError(String absoluteFilePath,
			Ptr<NSError> outError);

	@Generated
	@Selector("unmountAndEjectDeviceAtPath:")
	public native boolean unmountAndEjectDeviceAtPath(String path);

	@Generated
	@Selector("unmountAndEjectDeviceAtURL:error:")
	public native boolean unmountAndEjectDeviceAtURLError(NSURL url,
			Ptr<NSError> error);

	@Generated
	@Selector("userDefaultsChanged")
	public native boolean userDefaultsChanged();
}
