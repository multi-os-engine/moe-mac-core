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
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import mac.coregraphics.struct.CGRect;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMenuItemCell extends NSButtonCell {
	static {
		NatJ.register();
	}

	@Generated
	protected NSMenuItemCell(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSMenuItemCell alloc();

	@Generated
	@Selector("calcSize")
	public native void calcSize();

	@Generated
	@Selector("drawBorderAndBackgroundWithFrame:inView:")
	public native void drawBorderAndBackgroundWithFrameInView(
			@ByValue CGRect cellFrame, NSView controlView);

	@Generated
	@Selector("drawImageWithFrame:inView:")
	public native void drawImageWithFrameInView(@ByValue CGRect cellFrame,
			NSView controlView);

	@Generated
	@Selector("drawKeyEquivalentWithFrame:inView:")
	public native void drawKeyEquivalentWithFrameInView(
			@ByValue CGRect cellFrame, NSView controlView);

	@Generated
	@Selector("drawSeparatorItemWithFrame:inView:")
	public native void drawSeparatorItemWithFrameInView(
			@ByValue CGRect cellFrame, NSView controlView);

	@Generated
	@Selector("drawStateImageWithFrame:inView:")
	public native void drawStateImageWithFrameInView(@ByValue CGRect cellFrame,
			NSView controlView);

	@Generated
	@Selector("drawTitleWithFrame:inView:")
	public native void drawTitleWithFrameInView(@ByValue CGRect cellFrame,
			NSView controlView);

	@Generated
	@Selector("imageWidth")
	public native double imageWidth();

	@Generated
	@Selector("init")
	public native NSMenuItemCell init();

	@Generated
	@Selector("initImageCell:")
	public native NSMenuItemCell initImageCell(NSImage image);

	@Generated
	@Selector("initTextCell:")
	public native NSMenuItemCell initTextCell(String aString);

	@Generated
	@Selector("keyEquivalentRectForBounds:")
	@ByValue
	public native CGRect keyEquivalentRectForBounds(@ByValue CGRect cellFrame);

	@Generated
	@Selector("keyEquivalentWidth")
	public native double keyEquivalentWidth();

	@Generated
	@Selector("menuItem")
	public native NSMenuItem menuItem();

	@Generated
	@Selector("needsDisplay")
	public native boolean needsDisplay();

	@Generated
	@Selector("needsSizing")
	public native boolean needsSizing();

	@Generated
	@Selector("setMenuItem:")
	public native void setMenuItem(NSMenuItem item);

	@Generated
	@Selector("setNeedsDisplay:")
	public native void setNeedsDisplay(boolean flag);

	@Generated
	@Selector("setNeedsSizing:")
	public native void setNeedsSizing(boolean flag);

	@Generated
	@Selector("stateImageRectForBounds:")
	@ByValue
	public native CGRect stateImageRectForBounds(@ByValue CGRect cellFrame);

	@Generated
	@Selector("stateImageWidth")
	public native double stateImageWidth();

	@Generated
	@Selector("tag")
	public native long tag();

	@Generated
	@Selector("titleRectForBounds:")
	@ByValue
	public native CGRect titleRectForBounds(@ByValue CGRect cellFrame);

	@Generated
	@Selector("titleWidth")
	public native double titleWidth();
}
