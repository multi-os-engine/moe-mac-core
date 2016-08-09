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

package mac.foundation.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import mac.foundation.NSError;
import mac.foundation.NSFileManager;
import mac.foundation.NSURL;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSFileManagerDelegate")
public interface NSFileManagerDelegate {
	@Generated
	@IsOptional
	@Selector("fileManager:shouldCopyItemAtPath:toPath:")
	public boolean fileManagerShouldCopyItemAtPathToPath(
			NSFileManager fileManager, String srcPath, String dstPath);

	@Generated
	@IsOptional
	@Selector("fileManager:shouldCopyItemAtURL:toURL:")
	public boolean fileManagerShouldCopyItemAtURLToURL(
			NSFileManager fileManager, NSURL srcURL, NSURL dstURL);

	@Generated
	@IsOptional
	@Selector("fileManager:shouldLinkItemAtPath:toPath:")
	public boolean fileManagerShouldLinkItemAtPathToPath(
			NSFileManager fileManager, String srcPath, String dstPath);

	@Generated
	@IsOptional
	@Selector("fileManager:shouldLinkItemAtURL:toURL:")
	public boolean fileManagerShouldLinkItemAtURLToURL(
			NSFileManager fileManager, NSURL srcURL, NSURL dstURL);

	@Generated
	@IsOptional
	@Selector("fileManager:shouldMoveItemAtPath:toPath:")
	public boolean fileManagerShouldMoveItemAtPathToPath(
			NSFileManager fileManager, String srcPath, String dstPath);

	@Generated
	@IsOptional
	@Selector("fileManager:shouldMoveItemAtURL:toURL:")
	public boolean fileManagerShouldMoveItemAtURLToURL(
			NSFileManager fileManager, NSURL srcURL, NSURL dstURL);

	@Generated
	@IsOptional
	@Selector("fileManager:shouldProceedAfterError:copyingItemAtPath:toPath:")
	public boolean fileManagerShouldProceedAfterErrorCopyingItemAtPathToPath(
			NSFileManager fileManager, NSError error, String srcPath,
			String dstPath);

	@Generated
	@IsOptional
	@Selector("fileManager:shouldProceedAfterError:copyingItemAtURL:toURL:")
	public boolean fileManagerShouldProceedAfterErrorCopyingItemAtURLToURL(
			NSFileManager fileManager, NSError error, NSURL srcURL, NSURL dstURL);

	@Generated
	@IsOptional
	@Selector("fileManager:shouldProceedAfterError:linkingItemAtPath:toPath:")
	public boolean fileManagerShouldProceedAfterErrorLinkingItemAtPathToPath(
			NSFileManager fileManager, NSError error, String srcPath,
			String dstPath);

	@Generated
	@IsOptional
	@Selector("fileManager:shouldProceedAfterError:linkingItemAtURL:toURL:")
	public boolean fileManagerShouldProceedAfterErrorLinkingItemAtURLToURL(
			NSFileManager fileManager, NSError error, NSURL srcURL, NSURL dstURL);

	@Generated
	@IsOptional
	@Selector("fileManager:shouldProceedAfterError:movingItemAtPath:toPath:")
	public boolean fileManagerShouldProceedAfterErrorMovingItemAtPathToPath(
			NSFileManager fileManager, NSError error, String srcPath,
			String dstPath);

	@Generated
	@IsOptional
	@Selector("fileManager:shouldProceedAfterError:movingItemAtURL:toURL:")
	public boolean fileManagerShouldProceedAfterErrorMovingItemAtURLToURL(
			NSFileManager fileManager, NSError error, NSURL srcURL, NSURL dstURL);

	@Generated
	@IsOptional
	@Selector("fileManager:shouldProceedAfterError:removingItemAtPath:")
	public boolean fileManagerShouldProceedAfterErrorRemovingItemAtPath(
			NSFileManager fileManager, NSError error, String path);

	@Generated
	@IsOptional
	@Selector("fileManager:shouldProceedAfterError:removingItemAtURL:")
	public boolean fileManagerShouldProceedAfterErrorRemovingItemAtURL(
			NSFileManager fileManager, NSError error, NSURL URL);

	@Generated
	@IsOptional
	@Selector("fileManager:shouldRemoveItemAtPath:")
	public boolean fileManagerShouldRemoveItemAtPath(NSFileManager fileManager,
			String path);

	@Generated
	@IsOptional
	@Selector("fileManager:shouldRemoveItemAtURL:")
	public boolean fileManagerShouldRemoveItemAtURL(NSFileManager fileManager,
			NSURL URL);
}
