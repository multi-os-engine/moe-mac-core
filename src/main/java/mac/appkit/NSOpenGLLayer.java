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
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.corevideo.struct.CVTimeStamp;
import mac.quartzcore.CAOpenGLLayer;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSOpenGLLayer extends CAOpenGLLayer {
	static {
		NatJ.register();
	}

	@Generated
	protected NSOpenGLLayer(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSOpenGLLayer alloc();

	@Generated
	@Selector("canDrawInOpenGLContext:pixelFormat:forLayerTime:displayTime:")
	public native boolean canDrawInOpenGLContextPixelFormatForLayerTimeDisplayTime(
			NSOpenGLContext context,
			NSOpenGLPixelFormat pixelFormat,
			double t,
			@UncertainArgument("Options: reference, array Fallback: reference") CVTimeStamp ts);

	@Generated
	@Selector("drawInOpenGLContext:pixelFormat:forLayerTime:displayTime:")
	public native void drawInOpenGLContextPixelFormatForLayerTimeDisplayTime(
			NSOpenGLContext context,
			NSOpenGLPixelFormat pixelFormat,
			double t,
			@UncertainArgument("Options: reference, array Fallback: reference") CVTimeStamp ts);

	@Generated
	@Selector("init")
	public native NSOpenGLLayer init();

	@Generated
	@Selector("initWithLayer:")
	public native NSOpenGLLayer initWithLayer(
			@Mapped(ObjCObjectMapper.class) Object layer);

	@Generated
	@Selector("layer")
	public static native NSOpenGLLayer layer();

	@Generated
	@Selector("openGLContext")
	public native NSOpenGLContext openGLContext();

	@Generated
	@Selector("openGLContextForPixelFormat:")
	public native NSOpenGLContext openGLContextForPixelFormat(
			NSOpenGLPixelFormat pixelFormat);

	@Generated
	@Selector("openGLPixelFormat")
	public native NSOpenGLPixelFormat openGLPixelFormat();

	@Generated
	@Selector("openGLPixelFormatForDisplayMask:")
	public native NSOpenGLPixelFormat openGLPixelFormatForDisplayMask(int mask);

	@Generated
	@Selector("setOpenGLContext:")
	public native void setOpenGLContext(NSOpenGLContext value);

	@Generated
	@Selector("setOpenGLPixelFormat:")
	public native void setOpenGLPixelFormat(NSOpenGLPixelFormat value);

	@Generated
	@Selector("setView:")
	public native void setView_unsafe(NSView value);

	@Generated
	public void setView(NSView value) {
		ObjCObject __old = (ObjCObject) view();
		if (value != null) {
			ObjCRuntime.associateObjCObject(this, value);
		}
		setView_unsafe(value);
		if (__old != null) {
			ObjCRuntime
					.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("view")
	public native NSView view();
}
