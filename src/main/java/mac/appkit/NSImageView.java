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
public class NSImageView extends NSControl {
	static {
		NatJ.register();
	}

	@Generated
	protected NSImageView(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSImageView alloc();

	@Generated
	@Selector("allowsCutCopyPaste")
	public native boolean allowsCutCopyPaste();

	@Generated
	@Selector("animates")
	public native boolean animates();

	@Generated
	@Selector("image")
	public native NSImage image();

	@Generated
	@Selector("imageAlignment")
	public native long imageAlignment();

	@Generated
	@Selector("imageFrameStyle")
	public native long imageFrameStyle();

	@Generated
	@Selector("imageScaling")
	public native long imageScaling();

	@Generated
	@Selector("init")
	public native NSImageView init();

	@Generated
	@Selector("initWithFrame:")
	public native NSImageView initWithFrame(@ByValue CGRect frameRect);

	@Generated
	@Selector("isEditable")
	public native boolean isEditable();

	@Generated
	@Selector("setAllowsCutCopyPaste:")
	public native void setAllowsCutCopyPaste(boolean allow);

	@Generated
	@Selector("setAnimates:")
	public native void setAnimates(boolean flag);

	@Generated
	@Selector("setEditable:")
	public native void setEditable(boolean yn);

	@Generated
	@Selector("setImage:")
	public native void setImage(NSImage newImage);

	@Generated
	@Selector("setImageAlignment:")
	public native void setImageAlignment(long newAlign);

	@Generated
	@Selector("setImageFrameStyle:")
	public native void setImageFrameStyle(long newStyle);

	@Generated
	@Selector("setImageScaling:")
	public native void setImageScaling(long newScaling);
}
