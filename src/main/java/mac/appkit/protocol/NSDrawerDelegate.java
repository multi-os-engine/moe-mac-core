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


import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import mac.appkit.NSDrawer;
import mac.coregraphics.struct.CGSize;
import mac.foundation.NSNotification;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSDrawerDelegate")
public interface NSDrawerDelegate {
	@Generated
	@IsOptional
	@Selector("drawerDidClose:")
	public void drawerDidClose(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("drawerDidOpen:")
	public void drawerDidOpen(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("drawerShouldClose:")
	public boolean drawerShouldClose(NSDrawer sender);

	@Generated
	@IsOptional
	@Selector("drawerShouldOpen:")
	public boolean drawerShouldOpen(NSDrawer sender);

	@Generated
	@IsOptional
	@Selector("drawerWillClose:")
	public void drawerWillClose(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("drawerWillOpen:")
	public void drawerWillOpen(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("drawerWillResizeContents:toSize:")
	@ByValue
	public CGSize drawerWillResizeContentsToSize(NSDrawer sender,
			@ByValue CGSize contentSize);
}
