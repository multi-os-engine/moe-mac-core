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
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.appkit.NSImage;
import mac.appkit.NSSharingService;
import mac.appkit.NSWindow;
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSArray;
import mac.foundation.NSError;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSSharingServiceDelegate")
public interface NSSharingServiceDelegate {
	@Generated
	@IsOptional
	@Selector("sharingService:didFailToShareItems:error:")
	public void sharingServiceDidFailToShareItemsError(
			NSSharingService sharingService, NSArray items, NSError error);

	@Generated
	@IsOptional
	@Selector("sharingService:didShareItems:")
	public void sharingServiceDidShareItems(NSSharingService sharingService,
			NSArray items);

	@Generated
	@IsOptional
	@Selector("sharingService:sourceFrameOnScreenForShareItem:")
	@ByValue
	public CGRect sharingServiceSourceFrameOnScreenForShareItem(
			NSSharingService sharingService,
			@Mapped(ObjCObjectMapper.class) Object item);

	@Generated
	@IsOptional
	@Selector("sharingService:sourceWindowForShareItems:sharingContentScope:")
	public NSWindow sharingServiceSourceWindowForShareItemsSharingContentScope(
			NSSharingService sharingService, NSArray items,
			LongPtr sharingContentScope);

	@Generated
	@IsOptional
	@Selector("sharingService:transitionImageForShareItem:contentRect:")
	public NSImage sharingServiceTransitionImageForShareItemContentRect(
			NSSharingService sharingService,
			@Mapped(ObjCObjectMapper.class) Object item,
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect contentRect);

	@Generated
	@IsOptional
	@Selector("sharingService:willShareItems:")
	public void sharingServiceWillShareItems(NSSharingService sharingService,
			NSArray items);
}
