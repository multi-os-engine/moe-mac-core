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
public class NSOpenGLView extends NSView {
	static {
		NatJ.register();
	}

	@Generated
	protected NSOpenGLView(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSOpenGLView alloc();

	@Generated
	@Selector("clearGLContext")
	public native void clearGLContext();

	@Generated
	@Selector("defaultPixelFormat")
	public static native NSOpenGLPixelFormat defaultPixelFormat();

	@Generated
	@Selector("init")
	public native NSOpenGLView init();

	@Generated
	@Selector("initWithFrame:")
	public native NSOpenGLView initWithFrame(@ByValue CGRect frameRect);

	@Generated
	@Selector("initWithFrame:pixelFormat:")
	public native NSOpenGLView initWithFramePixelFormat(
			@ByValue CGRect frameRect, NSOpenGLPixelFormat format);

	@Generated
	@Selector("openGLContext")
	public native NSOpenGLContext openGLContext();

	@Generated
	@Selector("pixelFormat")
	public native NSOpenGLPixelFormat pixelFormat();

	@Generated
	@Selector("prepareOpenGL")
	public native void prepareOpenGL();

	@Generated
	@Selector("reshape")
	public native void reshape();

	@Generated
	@Selector("setOpenGLContext:")
	public native void setOpenGLContext(NSOpenGLContext context);

	@Generated
	@Selector("setPixelFormat:")
	public native void setPixelFormat(NSOpenGLPixelFormat pixelFormat);

	@Generated
	@Selector("update")
	public native void update();
}
