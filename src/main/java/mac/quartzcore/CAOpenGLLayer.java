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

package mac.quartzcore;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.corevideo.struct.CVTimeStamp;
import mac.opengl.opaque.CGLContextObj;
import mac.opengl.opaque.CGLPixelFormatObj;

@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CAOpenGLLayer extends CALayer {
	static {
		NatJ.register();
	}

	@Generated
	protected CAOpenGLLayer(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native CAOpenGLLayer alloc();

	@Generated
	@Selector("canDrawInCGLContext:pixelFormat:forLayerTime:displayTime:")
	public native boolean canDrawInCGLContextPixelFormatForLayerTimeDisplayTime(
			CGLContextObj ctx,
			CGLPixelFormatObj pf,
			double t,
			@UncertainArgument("Options: reference, array Fallback: reference") CVTimeStamp ts);

	@Generated
	@Owned
	@Selector("copyCGLContextForPixelFormat:")
	public native CGLContextObj copyCGLContextForPixelFormat(
			CGLPixelFormatObj pf);

	@Generated
	@Owned
	@Selector("copyCGLPixelFormatForDisplayMask:")
	public native CGLPixelFormatObj copyCGLPixelFormatForDisplayMask(int mask);

	@Generated
	@Selector("drawInCGLContext:pixelFormat:forLayerTime:displayTime:")
	public native void drawInCGLContextPixelFormatForLayerTimeDisplayTime(
			CGLContextObj ctx,
			CGLPixelFormatObj pf,
			double t,
			@UncertainArgument("Options: reference, array Fallback: reference") CVTimeStamp ts);

	@Generated
	@Selector("init")
	public native CAOpenGLLayer init();

	@Generated
	@Selector("initWithLayer:")
	public native CAOpenGLLayer initWithLayer(
			@Mapped(ObjCObjectMapper.class) Object layer);

	@Generated
	@Selector("isAsynchronous")
	public native boolean isAsynchronous();

	@Generated
	@Selector("layer")
	public static native CAOpenGLLayer layer();

	@Generated
	@Selector("releaseCGLContext:")
	public native void releaseCGLContext(CGLContextObj ctx);

	@Generated
	@Selector("releaseCGLPixelFormat:")
	public native void releaseCGLPixelFormat(CGLPixelFormatObj pf);

	@Generated
	@Selector("setAsynchronous:")
	public native void setAsynchronous(boolean value);
}
