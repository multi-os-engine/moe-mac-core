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
import mac.NSObject;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSStatusBar extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSStatusBar(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSStatusBar alloc();

	@Generated
	@Selector("init")
	public native NSStatusBar init();

	@Generated
	@Selector("isVertical")
	public native boolean isVertical();

	@Generated
	@Selector("removeStatusItem:")
	public native void removeStatusItem(NSStatusItem item);

	@Generated
	@Selector("statusItemWithLength:")
	public native NSStatusItem statusItemWithLength(double length);

	@Generated
	@Selector("systemStatusBar")
	public static native NSStatusBar systemStatusBar();

	@Generated
	@Selector("thickness")
	public native double thickness();
}
