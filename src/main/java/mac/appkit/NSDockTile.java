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
import mac.coregraphics.struct.CGSize;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSDockTile extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSDockTile(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSDockTile alloc();

	@Generated
	@Selector("badgeLabel")
	public native String badgeLabel();

	@Generated
	@Selector("contentView")
	public native NSView contentView();

	@Generated
	@Selector("display")
	public native void display();

	@Generated
	@Selector("init")
	public native NSDockTile init();

	@Generated
	@Selector("owner")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object owner();

	@Generated
	@Selector("setBadgeLabel:")
	public native void setBadgeLabel(String string);

	@Generated
	@Selector("setContentView:")
	public native void setContentView(NSView view);

	@Generated
	@Selector("setShowsApplicationBadge:")
	public native void setShowsApplicationBadge(boolean flag);

	@Generated
	@Selector("showsApplicationBadge")
	public native boolean showsApplicationBadge();

	@Generated
	@Selector("size")
	@ByValue
	public native CGSize size();
}
