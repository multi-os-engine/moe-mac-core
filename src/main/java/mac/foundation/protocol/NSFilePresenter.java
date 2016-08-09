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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import mac.foundation.NSError;
import mac.foundation.NSFileVersion;
import mac.foundation.NSOperationQueue;
import mac.foundation.NSURL;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSFilePresenter")
public interface NSFilePresenter {
	@Generated
	@IsOptional
	@Selector("accommodatePresentedItemDeletionWithCompletionHandler:")
	public void accommodatePresentedItemDeletionWithCompletionHandler(
			@ObjCBlock(name = "call_accommodatePresentedItemDeletionWithCompletionHandler") Block_accommodatePresentedItemDeletionWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_accommodatePresentedItemDeletionWithCompletionHandler {
		@Generated
		public void call_accommodatePresentedItemDeletionWithCompletionHandler(
				NSError arg0);
	}

	@Generated
	@IsOptional
	@Selector("accommodatePresentedSubitemDeletionAtURL:completionHandler:")
	public void accommodatePresentedSubitemDeletionAtURLCompletionHandler(
			NSURL url,
			@ObjCBlock(name = "call_accommodatePresentedSubitemDeletionAtURLCompletionHandler") Block_accommodatePresentedSubitemDeletionAtURLCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_accommodatePresentedSubitemDeletionAtURLCompletionHandler {
		@Generated
		public void call_accommodatePresentedSubitemDeletionAtURLCompletionHandler(
				NSError arg0);
	}

	@Generated
	@IsOptional
	@Selector("presentedItemDidChange")
	public void presentedItemDidChange();

	@Generated
	@IsOptional
	@Selector("presentedItemDidGainVersion:")
	public void presentedItemDidGainVersion(NSFileVersion version);

	@Generated
	@IsOptional
	@Selector("presentedItemDidLoseVersion:")
	public void presentedItemDidLoseVersion(NSFileVersion version);

	@Generated
	@IsOptional
	@Selector("presentedItemDidMoveToURL:")
	public void presentedItemDidMoveToURL(NSURL newURL);

	@Generated
	@IsOptional
	@Selector("presentedItemDidResolveConflictVersion:")
	public void presentedItemDidResolveConflictVersion(NSFileVersion version);

	@Generated
	@Selector("presentedItemOperationQueue")
	public NSOperationQueue presentedItemOperationQueue();

	@Generated
	@Selector("presentedItemURL")
	public NSURL presentedItemURL();

	@Generated
	@IsOptional
	@Selector("presentedSubitemAtURL:didGainVersion:")
	public void presentedSubitemAtURLDidGainVersion(NSURL url,
			NSFileVersion version);

	@Generated
	@IsOptional
	@Selector("presentedSubitemAtURL:didLoseVersion:")
	public void presentedSubitemAtURLDidLoseVersion(NSURL url,
			NSFileVersion version);

	@Generated
	@IsOptional
	@Selector("presentedSubitemAtURL:didMoveToURL:")
	public void presentedSubitemAtURLDidMoveToURL(NSURL oldURL, NSURL newURL);

	@Generated
	@IsOptional
	@Selector("presentedSubitemAtURL:didResolveConflictVersion:")
	public void presentedSubitemAtURLDidResolveConflictVersion(NSURL url,
			NSFileVersion version);

	@Generated
	@IsOptional
	@Selector("presentedSubitemDidAppearAtURL:")
	public void presentedSubitemDidAppearAtURL(NSURL url);

	@Generated
	@IsOptional
	@Selector("presentedSubitemDidChangeAtURL:")
	public void presentedSubitemDidChangeAtURL(NSURL url);

	@Generated
	@IsOptional
	@Selector("primaryPresentedItemURL")
	public NSURL primaryPresentedItemURL();

	@Generated
	@IsOptional
	@Selector("savePresentedItemChangesWithCompletionHandler:")
	public void savePresentedItemChangesWithCompletionHandler(
			@ObjCBlock(name = "call_savePresentedItemChangesWithCompletionHandler") Block_savePresentedItemChangesWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_savePresentedItemChangesWithCompletionHandler {
		@Generated
		public void call_savePresentedItemChangesWithCompletionHandler(
				NSError arg0);
	}
}
