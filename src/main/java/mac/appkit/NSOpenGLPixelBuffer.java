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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import mac.NSObject;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSOpenGLPixelBuffer extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSOpenGLPixelBuffer(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("CGLPBufferObj")
	public native VoidPtr CGLPBufferObj();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSOpenGLPixelBuffer alloc();

	@Generated
	@Selector("init")
	public native NSOpenGLPixelBuffer init();

	@Generated
	@Selector("initWithCGLPBufferObj:")
	public native NSOpenGLPixelBuffer initWithCGLPBufferObj(VoidPtr pbuffer);

	@Generated
	@Selector("initWithTextureTarget:textureInternalFormat:textureMaxMipMapLevel:pixelsWide:pixelsHigh:")
	public native NSOpenGLPixelBuffer initWithTextureTargetTextureInternalFormatTextureMaxMipMapLevelPixelsWidePixelsHigh(
			int target, int format, int maxLevel, int pixelsWide, int pixelsHigh);

	@Generated
	@Selector("pixelsHigh")
	public native int pixelsHigh();

	@Generated
	@Selector("pixelsWide")
	public native int pixelsWide();

	@Generated
	@Selector("textureInternalFormat")
	public native int textureInternalFormat();

	@Generated
	@Selector("textureMaxMipMapLevel")
	public native int textureMaxMipMapLevel();

	@Generated
	@Selector("textureTarget")
	public native int textureTarget();
}
