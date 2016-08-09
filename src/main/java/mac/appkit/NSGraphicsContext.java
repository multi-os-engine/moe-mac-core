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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.coregraphics.struct.CGPoint;
import mac.foundation.NSDictionary;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSGraphicsContext extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSGraphicsContext(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSGraphicsContext alloc();

	@Generated
	@Selector("attributes")
	public native NSDictionary attributes();

	@Generated
	@Selector("colorRenderingIntent")
	public native long colorRenderingIntent();

	@Generated
	@Selector("compositingOperation")
	public native long compositingOperation();

	@Generated
	@Selector("currentContext")
	public static native NSGraphicsContext currentContext();

	@Generated
	@Selector("currentContextDrawingToScreen")
	public static native boolean currentContextDrawingToScreen();

	@Generated
	@Selector("flushGraphics")
	public native void flushGraphics();

	@Generated
	@Selector("focusStack")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object focusStack();

	@Generated
	@Selector("graphicsContextWithAttributes:")
	public static native NSGraphicsContext graphicsContextWithAttributes(
			NSDictionary attributes);

	@Generated
	@Selector("graphicsContextWithBitmapImageRep:")
	public static native NSGraphicsContext graphicsContextWithBitmapImageRep(
			NSBitmapImageRep bitmapRep);

	@Generated
	@Selector("graphicsContextWithGraphicsPort:flipped:")
	public static native NSGraphicsContext graphicsContextWithGraphicsPortFlipped(
			VoidPtr graphicsPort, boolean initialFlippedState);

	@Generated
	@Selector("graphicsContextWithWindow:")
	public static native NSGraphicsContext graphicsContextWithWindow(
			NSWindow window);

	@Generated
	@Selector("graphicsPort")
	public native VoidPtr graphicsPort();

	@Generated
	@Selector("imageInterpolation")
	public native long imageInterpolation();

	@Generated
	@Selector("init")
	public native NSGraphicsContext init();

	@Generated
	@Selector("isDrawingToScreen")
	public native boolean isDrawingToScreen();

	@Generated
	@Selector("isFlipped")
	public native boolean isFlipped();

	@Generated
	@Selector("patternPhase")
	@ByValue
	public native CGPoint patternPhase();

	@Generated
	@Selector("restoreGraphicsState")
	public static native void restoreGraphicsState_static();

	@Generated
	@Selector("restoreGraphicsState")
	public native void restoreGraphicsState();

	@Generated
	@Selector("saveGraphicsState")
	public static native void saveGraphicsState_static();

	@Generated
	@Selector("saveGraphicsState")
	public native void saveGraphicsState();

	@Generated
	@Selector("setColorRenderingIntent:")
	public native void setColorRenderingIntent(long renderingIntent);

	@Generated
	@Selector("setCompositingOperation:")
	public native void setCompositingOperation(long operation);

	@Generated
	@Selector("setCurrentContext:")
	public static native void setCurrentContext(NSGraphicsContext context);

	@Generated
	@Selector("setFocusStack:")
	public native void setFocusStack(
			@Mapped(ObjCObjectMapper.class) Object stack);

	@Generated
	@Selector("setGraphicsState:")
	public static native void setGraphicsState(long gState);

	@Generated
	@Selector("setImageInterpolation:")
	public native void setImageInterpolation(long interpolation);

	@Generated
	@Selector("setPatternPhase:")
	public native void setPatternPhase(@ByValue CGPoint phase);

	@Generated
	@Selector("setShouldAntialias:")
	public native void setShouldAntialias(boolean antialias);

	@Generated
	@Selector("shouldAntialias")
	public native boolean shouldAntialias();
}
