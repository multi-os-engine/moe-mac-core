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

package mac.opengl.c;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.ConstIntPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.Ptr;
import mac.opengl.opaque.CGLContextObj;
import mac.opengl.opaque.CGLPixelFormatObj;
import mac.opengl.opaque.CGLRendererInfoObj;

@Generated
@Library("OpenGL")
@Runtime(CRuntime.class)
public final class OpenGL {
	static {
		NatJ.register();
	}

	@Generated
	private OpenGL() {
	}

	@Generated
	@CFunction
	public static native int CGLSetCurrentContext(CGLContextObj ctx);

	@Generated
	@CFunction
	public static native CGLContextObj CGLGetCurrentContext();

	@Generated
	@CFunction
	public static native int CGLChoosePixelFormat(ConstIntPtr attribs,
			Ptr<CGLPixelFormatObj> pix, IntPtr npix);

	@Generated
	@CFunction
	public static native int CGLDestroyPixelFormat(CGLPixelFormatObj pix);

	@Generated
	@CFunction
	public static native int CGLDescribePixelFormat(CGLPixelFormatObj pix,
			int pix_num, int attrib, IntPtr value);

	@Generated
	@CFunction
	public static native int CGLQueryRendererInfo(int display_mask,
			Ptr<CGLRendererInfoObj> rend, IntPtr nrend);

	@Generated
	@CFunction
	public static native int CGLDestroyRendererInfo(CGLRendererInfoObj rend);

	@Generated
	@CFunction
	public static native int CGLDescribeRenderer(CGLRendererInfoObj rend,
			int rend_num, int prop, IntPtr value);

	@Generated
	@CFunction
	public static native int CGLCreateContext(CGLPixelFormatObj pix,
			CGLContextObj share, Ptr<CGLContextObj> ctx);

	@Generated
	@CFunction
	public static native int CGLDestroyContext(CGLContextObj ctx);

	@Generated
	@CFunction
	public static native int CGLClearDrawable(CGLContextObj ctx);

	@Generated
	@CFunction
	public static native int CGLFlushDrawable(CGLContextObj ctx);

	@Generated
	@CFunction
	public static native int CGLEnable(CGLContextObj ctx, int pname);

	@Generated
	@CFunction
	public static native int CGLDisable(CGLContextObj ctx, int pname);

	@Generated
	@CFunction
	public static native int CGLIsEnabled(CGLContextObj ctx, int pname,
			IntPtr enable);

	@Generated
	@CFunction
	public static native int CGLSetParameter(CGLContextObj ctx, int pname,
			ConstIntPtr params);

	@Generated
	@CFunction
	public static native int CGLGetParameter(CGLContextObj ctx, int pname,
			IntPtr params);

	@Generated
	@CFunction
	public static native int CGLSetVirtualScreen(CGLContextObj ctx, int screen);

	@Generated
	@CFunction
	public static native int CGLGetVirtualScreen(CGLContextObj ctx,
			IntPtr screen);

	@Generated
	@CFunction
	public static native int CGLSetOption(int pname, int param);

	@Generated
	@CFunction
	public static native int CGLGetOption(int pname, IntPtr param);

	@Generated
	@CFunction
	public static native void CGLGetVersion(IntPtr majorvers, IntPtr minorvers);

	@Generated
	@CFunction
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public static native String CGLErrorString(int error);
}
