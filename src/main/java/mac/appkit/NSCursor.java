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
import mac.NSObject;
import mac.coregraphics.struct.CGPoint;
import mac.foundation.NSCoder;
import mac.foundation.protocol.NSCoding;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSCursor extends NSObject implements NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSCursor(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("IBeamCursor")
	public static native NSCursor IBeamCursor();

	@Generated
	@Selector("IBeamCursorForVerticalLayout")
	public static native NSCursor IBeamCursorForVerticalLayout();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSCursor alloc();

	@Generated
	@Selector("arrowCursor")
	public static native NSCursor arrowCursor();

	@Generated
	@Selector("closedHandCursor")
	public static native NSCursor closedHandCursor();

	@Generated
	@Selector("contextualMenuCursor")
	public static native NSCursor contextualMenuCursor();

	@Generated
	@Selector("crosshairCursor")
	public static native NSCursor crosshairCursor();

	@Generated
	@Selector("currentCursor")
	public static native NSCursor currentCursor();

	@Generated
	@Selector("currentSystemCursor")
	public static native NSCursor currentSystemCursor();

	@Generated
	@Selector("disappearingItemCursor")
	public static native NSCursor disappearingItemCursor();

	@Generated
	@Selector("dragCopyCursor")
	public static native NSCursor dragCopyCursor();

	@Generated
	@Selector("dragLinkCursor")
	public static native NSCursor dragLinkCursor();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("hide")
	public static native void hide();

	@Generated
	@Selector("hotSpot")
	@ByValue
	public native CGPoint hotSpot();

	@Generated
	@Selector("image")
	public native NSImage image();

	@Generated
	@Selector("init")
	public native NSCursor init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithImage:foregroundColorHint:backgroundColorHint:hotSpot:")
	public native NSCursor initWithImageForegroundColorHintBackgroundColorHintHotSpot(
			NSImage newImage, NSColor fg, NSColor bg, @ByValue CGPoint hotSpot);

	@Generated
	@Selector("initWithImage:hotSpot:")
	public native NSCursor initWithImageHotSpot(NSImage newImage,
			@ByValue CGPoint aPoint);

	@Generated
	@Selector("isSetOnMouseEntered")
	public native boolean isSetOnMouseEntered();

	@Generated
	@Selector("isSetOnMouseExited")
	public native boolean isSetOnMouseExited();

	@Generated
	@Selector("mouseEntered:")
	public native void mouseEntered(NSEvent theEvent);

	@Generated
	@Selector("mouseExited:")
	public native void mouseExited(NSEvent theEvent);

	@Generated
	@Selector("openHandCursor")
	public static native NSCursor openHandCursor();

	@Generated
	@Selector("operationNotAllowedCursor")
	public static native NSCursor operationNotAllowedCursor();

	@Generated
	@Selector("pointingHandCursor")
	public static native NSCursor pointingHandCursor();

	@Generated
	@Selector("pop")
	public static native void pop_static();

	@Generated
	@Selector("pop")
	public native void pop();

	@Generated
	@Selector("push")
	public native void push();

	@Generated
	@Selector("resizeDownCursor")
	public static native NSCursor resizeDownCursor();

	@Generated
	@Selector("resizeLeftCursor")
	public static native NSCursor resizeLeftCursor();

	@Generated
	@Selector("resizeLeftRightCursor")
	public static native NSCursor resizeLeftRightCursor();

	@Generated
	@Selector("resizeRightCursor")
	public static native NSCursor resizeRightCursor();

	@Generated
	@Selector("resizeUpCursor")
	public static native NSCursor resizeUpCursor();

	@Generated
	@Selector("resizeUpDownCursor")
	public static native NSCursor resizeUpDownCursor();

	@Generated
	@Selector("set")
	public native void set();

	@Generated
	@Selector("setHiddenUntilMouseMoves:")
	public static native void setHiddenUntilMouseMoves(boolean flag);

	@Generated
	@Selector("setOnMouseEntered:")
	public native void setOnMouseEntered(boolean flag);

	@Generated
	@Selector("setOnMouseExited:")
	public native void setOnMouseExited(boolean flag);

	@Generated
	@Selector("unhide")
	public static native void unhide();
}
