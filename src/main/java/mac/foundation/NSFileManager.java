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

package mac.foundation;


import org.moe.natj.c.map.CStringMapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSFileManager extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSFileManager(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("URLForDirectory:inDomain:appropriateForURL:create:error:")
	public native NSURL URLForDirectoryInDomainAppropriateForURLCreateError(
			long directory, long domain, NSURL url, boolean shouldCreate,
			Ptr<NSError> error);

	@Generated
	@Selector("URLForPublishingUbiquitousItemAtURL:expirationDate:error:")
	public native NSURL URLForPublishingUbiquitousItemAtURLExpirationDateError(
			NSURL url, Ptr<NSDate> outDate, Ptr<NSError> error);

	@Generated
	@Selector("URLForUbiquityContainerIdentifier:")
	public native NSURL URLForUbiquityContainerIdentifier(
			String containerIdentifier);

	@Generated
	@Selector("URLsForDirectory:inDomains:")
	public native NSArray URLsForDirectoryInDomains(long directory,
			long domainMask);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSFileManager alloc();

	@Generated
	@Selector("attributesOfFileSystemForPath:error:")
	public native NSDictionary attributesOfFileSystemForPathError(String path,
			Ptr<NSError> error);

	@Generated
	@Selector("attributesOfItemAtPath:error:")
	public native NSDictionary attributesOfItemAtPathError(String path,
			Ptr<NSError> error);

	@Generated
	@Selector("changeCurrentDirectoryPath:")
	public native boolean changeCurrentDirectoryPath(String path);

	@Generated
	@Selector("changeFileAttributes:atPath:")
	public native boolean changeFileAttributesAtPath(NSDictionary attributes,
			String path);

	@Generated
	@Selector("componentsToDisplayForPath:")
	public native NSArray componentsToDisplayForPath(String path);

	@Generated
	@Selector("containerURLForSecurityApplicationGroupIdentifier:")
	public native NSURL containerURLForSecurityApplicationGroupIdentifier(
			String groupIdentifier);

	@Generated
	@Selector("contentsAtPath:")
	public native NSData contentsAtPath(String path);

	@Generated
	@Selector("contentsEqualAtPath:andPath:")
	public native boolean contentsEqualAtPathAndPath(String path1, String path2);

	@Generated
	@Selector("contentsOfDirectoryAtPath:error:")
	public native NSArray contentsOfDirectoryAtPathError(String path,
			Ptr<NSError> error);

	@Generated
	@Selector("contentsOfDirectoryAtURL:includingPropertiesForKeys:options:error:")
	public native NSArray contentsOfDirectoryAtURLIncludingPropertiesForKeysOptionsError(
			NSURL url, NSArray keys, long mask, Ptr<NSError> error);

	@Generated
	@Owned
	@Selector("copyItemAtPath:toPath:error:")
	public native boolean copyItemAtPathToPathError(String srcPath,
			String dstPath, Ptr<NSError> error);

	@Generated
	@Owned
	@Selector("copyItemAtURL:toURL:error:")
	public native boolean copyItemAtURLToURLError(NSURL srcURL, NSURL dstURL,
			Ptr<NSError> error);

	@Generated
	@Owned
	@Selector("copyPath:toPath:handler:")
	public native boolean copyPathToPathHandler(String src, String dest,
			@Mapped(ObjCObjectMapper.class) Object handler);

	@Generated
	@Selector("createDirectoryAtPath:attributes:")
	public native boolean createDirectoryAtPathAttributes(String path,
			NSDictionary attributes);

	@Generated
	@Selector("createDirectoryAtPath:withIntermediateDirectories:attributes:error:")
	public native boolean createDirectoryAtPathWithIntermediateDirectoriesAttributesError(
			String path, boolean createIntermediates, NSDictionary attributes,
			Ptr<NSError> error);

	@Generated
	@Selector("createDirectoryAtURL:withIntermediateDirectories:attributes:error:")
	public native boolean createDirectoryAtURLWithIntermediateDirectoriesAttributesError(
			NSURL url, boolean createIntermediates, NSDictionary attributes,
			Ptr<NSError> error);

	@Generated
	@Selector("createFileAtPath:contents:attributes:")
	public native boolean createFileAtPathContentsAttributes(String path,
			NSData data, NSDictionary attr);

	@Generated
	@Selector("createSymbolicLinkAtPath:pathContent:")
	public native boolean createSymbolicLinkAtPathPathContent(String path,
			String otherpath);

	@Generated
	@Selector("createSymbolicLinkAtPath:withDestinationPath:error:")
	public native boolean createSymbolicLinkAtPathWithDestinationPathError(
			String path, String destPath, Ptr<NSError> error);

	@Generated
	@Selector("createSymbolicLinkAtURL:withDestinationURL:error:")
	public native boolean createSymbolicLinkAtURLWithDestinationURLError(
			NSURL url, NSURL destURL, Ptr<NSError> error);

	@Generated
	@Selector("currentDirectoryPath")
	public native String currentDirectoryPath();

	@Generated
	@Selector("defaultManager")
	public static native NSFileManager defaultManager();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("destinationOfSymbolicLinkAtPath:error:")
	public native String destinationOfSymbolicLinkAtPathError(String path,
			Ptr<NSError> error);

	@Generated
	@Selector("directoryContentsAtPath:")
	public native NSArray directoryContentsAtPath(String path);

	@Generated
	@Selector("displayNameAtPath:")
	public native String displayNameAtPath(String path);

	@Generated
	@Selector("enumeratorAtPath:")
	public native NSDirectoryEnumerator enumeratorAtPath(String path);

	@Generated
	@Selector("enumeratorAtURL:includingPropertiesForKeys:options:errorHandler:")
	public native NSDirectoryEnumerator enumeratorAtURLIncludingPropertiesForKeysOptionsErrorHandler(
			NSURL url,
			NSArray keys,
			long mask,
			@ObjCBlock(name = "call_enumeratorAtURLIncludingPropertiesForKeysOptionsErrorHandler") Block_enumeratorAtURLIncludingPropertiesForKeysOptionsErrorHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_enumeratorAtURLIncludingPropertiesForKeysOptionsErrorHandler {
		@Generated
		public boolean call_enumeratorAtURLIncludingPropertiesForKeysOptionsErrorHandler(
				NSURL arg0, NSError arg1);
	}

	@Generated
	@Selector("evictUbiquitousItemAtURL:error:")
	public native boolean evictUbiquitousItemAtURLError(NSURL url,
			Ptr<NSError> error);

	@Generated
	@Selector("fileAttributesAtPath:traverseLink:")
	public native NSDictionary fileAttributesAtPathTraverseLink(String path,
			boolean yorn);

	@Generated
	@Selector("fileExistsAtPath:")
	public native boolean fileExistsAtPath(String path);

	@Generated
	@Selector("fileExistsAtPath:isDirectory:")
	public native boolean fileExistsAtPathIsDirectory(String path,
			BoolPtr isDirectory);

	@Generated
	@Selector("fileSystemAttributesAtPath:")
	public native NSDictionary fileSystemAttributesAtPath(String path);

	@Generated
	@Selector("fileSystemRepresentationWithPath:")
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	@MappedReturn(CStringMapper.class)
	public native String fileSystemRepresentationWithPath(String path);

	@Generated
	@Selector("init")
	public native NSFileManager init();

	@Generated
	@Selector("isDeletableFileAtPath:")
	public native boolean isDeletableFileAtPath(String path);

	@Generated
	@Selector("isExecutableFileAtPath:")
	public native boolean isExecutableFileAtPath(String path);

	@Generated
	@Selector("isReadableFileAtPath:")
	public native boolean isReadableFileAtPath(String path);

	@Generated
	@Selector("isUbiquitousItemAtURL:")
	public native boolean isUbiquitousItemAtURL(NSURL url);

	@Generated
	@Selector("isWritableFileAtPath:")
	public native boolean isWritableFileAtPath(String path);

	@Generated
	@Selector("linkItemAtPath:toPath:error:")
	public native boolean linkItemAtPathToPathError(String srcPath,
			String dstPath, Ptr<NSError> error);

	@Generated
	@Selector("linkItemAtURL:toURL:error:")
	public native boolean linkItemAtURLToURLError(NSURL srcURL, NSURL dstURL,
			Ptr<NSError> error);

	@Generated
	@Selector("linkPath:toPath:handler:")
	public native boolean linkPathToPathHandler(String src, String dest,
			@Mapped(ObjCObjectMapper.class) Object handler);

	@Generated
	@Selector("mountedVolumeURLsIncludingResourceValuesForKeys:options:")
	public native NSArray mountedVolumeURLsIncludingResourceValuesForKeysOptions(
			NSArray propertyKeys, long options);

	@Generated
	@Selector("moveItemAtPath:toPath:error:")
	public native boolean moveItemAtPathToPathError(String srcPath,
			String dstPath, Ptr<NSError> error);

	@Generated
	@Selector("moveItemAtURL:toURL:error:")
	public native boolean moveItemAtURLToURLError(NSURL srcURL, NSURL dstURL,
			Ptr<NSError> error);

	@Generated
	@Selector("movePath:toPath:handler:")
	public native boolean movePathToPathHandler(String src, String dest,
			@Mapped(ObjCObjectMapper.class) Object handler);

	@Generated
	@Selector("pathContentOfSymbolicLinkAtPath:")
	public native String pathContentOfSymbolicLinkAtPath(String path);

	@Generated
	@Selector("removeFileAtPath:handler:")
	public native boolean removeFileAtPathHandler(String path,
			@Mapped(ObjCObjectMapper.class) Object handler);

	@Generated
	@Selector("removeItemAtPath:error:")
	public native boolean removeItemAtPathError(String path, Ptr<NSError> error);

	@Generated
	@Selector("removeItemAtURL:error:")
	public native boolean removeItemAtURLError(NSURL URL, Ptr<NSError> error);

	@Generated
	@Selector("replaceItemAtURL:withItemAtURL:backupItemName:options:resultingItemURL:error:")
	public native boolean replaceItemAtURLWithItemAtURLBackupItemNameOptionsResultingItemURLError(
			NSURL originalItemURL, NSURL newItemURL, String backupItemName,
			long options, Ptr<NSURL> resultingURL, Ptr<NSError> error);

	@Generated
	@Selector("setAttributes:ofItemAtPath:error:")
	public native boolean setAttributesOfItemAtPathError(
			NSDictionary attributes, String path, Ptr<NSError> error);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object delegate);

	@Generated
	@Selector("setUbiquitous:itemAtURL:destinationURL:error:")
	public native boolean setUbiquitousItemAtURLDestinationURLError(
			boolean flag, NSURL url, NSURL destinationURL, Ptr<NSError> error);

	@Generated
	@Selector("startDownloadingUbiquitousItemAtURL:error:")
	public native boolean startDownloadingUbiquitousItemAtURLError(NSURL url,
			Ptr<NSError> error);

	@Generated
	@Selector("stringWithFileSystemRepresentation:length:")
	public native String stringWithFileSystemRepresentationLength(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String str,
			long len);

	@Generated
	@Selector("subpathsAtPath:")
	public native NSArray subpathsAtPath(String path);

	@Generated
	@Selector("subpathsOfDirectoryAtPath:error:")
	public native NSArray subpathsOfDirectoryAtPathError(String path,
			Ptr<NSError> error);

	@Generated
	@Selector("trashItemAtURL:resultingItemURL:error:")
	public native boolean trashItemAtURLResultingItemURLError(NSURL url,
			Ptr<NSURL> outResultingURL, Ptr<NSError> error);

	@Generated
	@Selector("ubiquityIdentityToken")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object ubiquityIdentityToken();
}
