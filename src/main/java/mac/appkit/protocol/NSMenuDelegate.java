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
import mac.appkit.NSMenu;
import mac.appkit.NSMenuItem;
import mac.appkit.NSScreen;
import mac.coregraphics.struct.CGRect;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSMenuDelegate")
public interface NSMenuDelegate {
	@Generated
	@IsOptional
	@Selector("confinementRectForMenu:onScreen:")
	@ByValue
	public CGRect confinementRectForMenuOnScreen(NSMenu menu, NSScreen screen);

	@Generated
	@IsOptional
	@Selector("menu:updateItem:atIndex:shouldCancel:")
	public boolean menuUpdateItemAtIndexShouldCancel(NSMenu menu,
			NSMenuItem item, long index, boolean shouldCancel);

	@Generated
	@IsOptional
	@Selector("menu:willHighlightItem:")
	public void menuWillHighlightItem(NSMenu menu, NSMenuItem item);

	@Generated
	@IsOptional
	@Selector("menuDidClose:")
	public void menuDidClose(NSMenu menu);

	@Generated
	@IsOptional
	@Selector("menuNeedsUpdate:")
	public void menuNeedsUpdate(NSMenu menu);

	@Generated
	@IsOptional
	@Selector("menuWillOpen:")
	public void menuWillOpen(NSMenu menu);

	@Generated
	@IsOptional
	@Selector("numberOfItemsInMenu:")
	public long numberOfItemsInMenu(NSMenu menu);
}
