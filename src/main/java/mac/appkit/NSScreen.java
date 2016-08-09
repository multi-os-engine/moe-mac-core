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
import org.moe.natj.general.ptr.ConstIntPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import mac.NSObject;
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSArray;
import mac.foundation.NSDictionary;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSScreen extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSScreen(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSScreen alloc();

	@Generated
	@Selector("backingAlignedRect:options:")
	@ByValue
	public native CGRect backingAlignedRectOptions(@ByValue CGRect aRect,
			long options);

	@Generated
	@Selector("backingScaleFactor")
	public native double backingScaleFactor();

	@Generated
	@Selector("colorSpace")
	public native NSColorSpace colorSpace();

	@Generated
	@Selector("convertRectFromBacking:")
	@ByValue
	public native CGRect convertRectFromBacking(@ByValue CGRect aRect);

	@Generated
	@Selector("convertRectToBacking:")
	@ByValue
	public native CGRect convertRectToBacking(@ByValue CGRect aRect);

	@Generated
	@Selector("deepestScreen")
	public static native NSScreen deepestScreen();

	@Generated
	@Selector("depth")
	public native int depth();

	@Generated
	@Selector("deviceDescription")
	public native NSDictionary deviceDescription();

	@Generated
	@Selector("frame")
	@ByValue
	public native CGRect frame();

	@Generated
	@Selector("init")
	public native NSScreen init();

	@Generated
	@Selector("mainScreen")
	public static native NSScreen mainScreen();

	@Generated
	@Selector("screens")
	public static native NSArray screens();

	@Generated
	@Selector("screensHaveSeparateSpaces")
	public static native boolean screensHaveSeparateSpaces();

	@Generated
	@Selector("supportedWindowDepths")
	public native ConstIntPtr supportedWindowDepths();

	@Generated
	@Selector("userSpaceScaleFactor")
	public native double userSpaceScaleFactor();

	@Generated
	@Selector("visibleFrame")
	@ByValue
	public native CGRect visibleFrame();
}
