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
import mac.appkit.NSImage;
import mac.appkit.NSImageRep;
import mac.coregraphics.struct.CGRect;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSImageDelegate")
public interface NSImageDelegate {
	@Generated
	@IsOptional
	@Selector("image:didLoadPartOfRepresentation:withValidRows:")
	public void imageDidLoadPartOfRepresentationWithValidRows(NSImage image,
			NSImageRep rep, long rows);

	@Generated
	@IsOptional
	@Selector("image:didLoadRepresentation:withStatus:")
	public void imageDidLoadRepresentationWithStatus(NSImage image,
			NSImageRep rep, long status);

	@Generated
	@IsOptional
	@Selector("image:didLoadRepresentationHeader:")
	public void imageDidLoadRepresentationHeader(NSImage image, NSImageRep rep);

	@Generated
	@IsOptional
	@Selector("image:willLoadRepresentation:")
	public void imageWillLoadRepresentation(NSImage image, NSImageRep rep);

	@Generated
	@IsOptional
	@Selector("imageDidNotDraw:inRect:")
	public NSImage imageDidNotDrawInRect(
			@Mapped(ObjCObjectMapper.class) Object sender, @ByValue CGRect aRect);
}
