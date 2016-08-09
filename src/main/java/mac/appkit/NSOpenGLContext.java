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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstIntPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import mac.NSObject;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSOpenGLContext extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSOpenGLContext(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("CGLContextObj")
	public native VoidPtr CGLContextObj();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSOpenGLContext alloc();

	@Generated
	@Selector("clearCurrentContext")
	public static native void clearCurrentContext();

	@Generated
	@Selector("clearDrawable")
	public native void clearDrawable();

	@Generated
	@Owned
	@Selector("copyAttributesFromContext:withMask:")
	public native void copyAttributesFromContextWithMask(
			NSOpenGLContext context, int mask);

	@Generated
	@Selector("createTexture:fromView:internalFormat:")
	public native void createTextureFromViewInternalFormat(int target,
			NSView view, int format);

	@Generated
	@Selector("currentContext")
	public static native NSOpenGLContext currentContext();

	@Generated
	@Selector("currentVirtualScreen")
	public native int currentVirtualScreen();

	@Generated
	@Selector("flushBuffer")
	public native void flushBuffer();

	@Generated
	@Selector("getValues:forParameter:")
	public native void getValuesForParameter(IntPtr vals, int param);

	@Generated
	@Selector("init")
	public native NSOpenGLContext init();

	@Generated
	@Selector("initWithCGLContextObj:")
	public native NSOpenGLContext initWithCGLContextObj(VoidPtr context);

	@Generated
	@Selector("initWithFormat:shareContext:")
	public native NSOpenGLContext initWithFormatShareContext(
			NSOpenGLPixelFormat format, NSOpenGLContext share);

	@Generated
	@Selector("makeCurrentContext")
	public native void makeCurrentContext();

	@Generated
	@Selector("pixelBuffer")
	public native NSOpenGLPixelBuffer pixelBuffer();

	@Generated
	@Selector("pixelBufferCubeMapFace")
	public native int pixelBufferCubeMapFace();

	@Generated
	@Selector("pixelBufferMipMapLevel")
	public native int pixelBufferMipMapLevel();

	@Generated
	@Selector("setCurrentVirtualScreen:")
	public native void setCurrentVirtualScreen(int screen);

	@Generated
	@Selector("setFullScreen")
	public native void setFullScreen();

	@Generated
	@Selector("setOffScreen:width:height:rowbytes:")
	public native void setOffScreenWidthHeightRowbytes(VoidPtr baseaddr,
			int width, int height, int rowbytes);

	@Generated
	@Selector("setPixelBuffer:cubeMapFace:mipMapLevel:currentVirtualScreen:")
	public native void setPixelBufferCubeMapFaceMipMapLevelCurrentVirtualScreen(
			NSOpenGLPixelBuffer pixelBuffer, int face, int level, int screen);

	@Generated
	@Selector("setTextureImageToPixelBuffer:colorBuffer:")
	public native void setTextureImageToPixelBufferColorBuffer(
			NSOpenGLPixelBuffer pixelBuffer, int source);

	@Generated
	@Selector("setValues:forParameter:")
	public native void setValuesForParameter(ConstIntPtr vals, int param);

	@Generated
	@Selector("setView:")
	public native void setView(NSView view);

	@Generated
	@Selector("update")
	public native void update();

	@Generated
	@Selector("view")
	public native NSView view();
}
