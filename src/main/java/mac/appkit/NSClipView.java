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
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSNotification;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSClipView extends NSView {
	static {
		NatJ.register();
	}

	@Generated
	protected NSClipView(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSClipView alloc();

	@Generated
	@Selector("autoscroll:")
	public native boolean autoscroll(NSEvent theEvent);

	@Generated
	@Selector("backgroundColor")
	public native NSColor backgroundColor();

	@Generated
	@Selector("constrainBoundsRect:")
	@ByValue
	public native CGRect constrainBoundsRect(@ByValue CGRect proposedBounds);

	@Generated
	@Selector("constrainScrollPoint:")
	@ByValue
	public native CGPoint constrainScrollPoint(@ByValue CGPoint newOrigin);

	@Generated
	@Selector("copiesOnScroll")
	public native boolean copiesOnScroll();

	@Generated
	@Selector("documentCursor")
	public native NSCursor documentCursor();

	@Generated
	@Selector("documentRect")
	@ByValue
	public native CGRect documentRect();

	@Generated
	@Selector("documentView")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object documentView();

	@Generated
	@Selector("documentVisibleRect")
	@ByValue
	public native CGRect documentVisibleRect();

	@Generated
	@Selector("drawsBackground")
	public native boolean drawsBackground();

	@Generated
	@Selector("init")
	public native NSClipView init();

	@Generated
	@Selector("initWithFrame:")
	public native NSClipView initWithFrame(@ByValue CGRect frameRect);

	@Generated
	@Selector("scrollToPoint:")
	public native void scrollToPoint(@ByValue CGPoint newOrigin);

	@Generated
	@Selector("setBackgroundColor:")
	public native void setBackgroundColor(NSColor color);

	@Generated
	@Selector("setCopiesOnScroll:")
	public native void setCopiesOnScroll(boolean flag);

	@Generated
	@Selector("setDocumentCursor:")
	public native void setDocumentCursor(NSCursor anObj);

	@Generated
	@Selector("setDocumentView:")
	public native void setDocumentView(NSView aView);

	@Generated
	@Selector("setDrawsBackground:")
	public native void setDrawsBackground(boolean flag);

	@Generated
	@Selector("viewBoundsChanged:")
	public native void viewBoundsChanged(NSNotification notification);

	@Generated
	@Selector("viewFrameChanged:")
	public native void viewFrameChanged(NSNotification notification);
}
