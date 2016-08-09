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
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.coregraphics.struct.CGRect;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMediaLibraryBrowserController extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSMediaLibraryBrowserController(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSMediaLibraryBrowserController alloc();

	@Generated
	@Selector("frame")
	@ByValue
	public native CGRect frame();

	@Generated
	@Selector("init")
	public native NSMediaLibraryBrowserController init();

	@Generated
	@Selector("isVisible")
	public native boolean isVisible();

	@Generated
	@Selector("mediaLibraries")
	public native long mediaLibraries();

	@Generated
	@Selector("setFrame:")
	public native void setFrame(@ByValue CGRect value);

	@Generated
	@Selector("setMediaLibraries:")
	public native void setMediaLibraries(long value);

	@Generated
	@Selector("setVisible:")
	public native void setVisible(boolean value);

	@Generated
	@Selector("sharedMediaLibraryBrowserController")
	public static native NSMediaLibraryBrowserController sharedMediaLibraryBrowserController();

	@Generated
	@Selector("togglePanel:")
	public native void togglePanel(@Mapped(ObjCObjectMapper.class) Object sender);
}
