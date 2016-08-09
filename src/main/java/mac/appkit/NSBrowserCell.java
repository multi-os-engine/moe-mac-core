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
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSBrowserCell extends NSCell {
	static {
		NatJ.register();
	}

	@Generated
	protected NSBrowserCell(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSBrowserCell alloc();

	@Generated
	@Selector("alternateImage")
	public native NSImage alternateImage();

	@Generated
	@Selector("branchImage")
	public static native NSImage branchImage();

	@Generated
	@Selector("highlightColorInView:")
	public native NSColor highlightColorInView(NSView controlView);

	@Generated
	@Selector("highlightedBranchImage")
	public static native NSImage highlightedBranchImage();

	@Generated
	@Selector("image")
	public native NSImage image();

	@Generated
	@Selector("init")
	public native NSBrowserCell init();

	@Generated
	@Selector("initImageCell:")
	public native NSBrowserCell initImageCell(NSImage image);

	@Generated
	@Selector("initTextCell:")
	public native NSBrowserCell initTextCell(String aString);

	@Generated
	@Selector("isLeaf")
	public native boolean isLeaf();

	@Generated
	@Selector("isLoaded")
	public native boolean isLoaded();

	@Generated
	@Selector("reset")
	public native void reset();

	@Generated
	@Selector("set")
	public native void set();

	@Generated
	@Selector("setAlternateImage:")
	public native void setAlternateImage(NSImage newAltImage);

	@Generated
	@Selector("setImage:")
	public native void setImage(NSImage image);

	@Generated
	@Selector("setLeaf:")
	public native void setLeaf(boolean flag);

	@Generated
	@Selector("setLoaded:")
	public native void setLoaded(boolean flag);
}
