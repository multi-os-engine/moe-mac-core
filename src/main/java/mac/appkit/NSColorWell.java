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
import mac.coregraphics.struct.CGRect;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSColorWell extends NSControl {
	static {
		NatJ.register();
	}

	@Generated
	protected NSColorWell(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("activate:")
	public native void activate(boolean exclusive);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSColorWell alloc();

	@Generated
	@Selector("color")
	public native NSColor color();

	@Generated
	@Selector("deactivate")
	public native void deactivate();

	@Generated
	@Selector("drawWellInside:")
	public native void drawWellInside(@ByValue CGRect insideRect);

	@Generated
	@Selector("init")
	public native NSColorWell init();

	@Generated
	@Selector("initWithFrame:")
	public native NSColorWell initWithFrame(@ByValue CGRect frameRect);

	@Generated
	@Selector("isActive")
	public native boolean isActive();

	@Generated
	@Selector("isBordered")
	public native boolean isBordered();

	@Generated
	@Selector("setBordered:")
	public native void setBordered(boolean flag);

	@Generated
	@Selector("setColor:")
	public native void setColor(NSColor color);

	@Generated
	@Selector("takeColorFrom:")
	public native void takeColorFrom(
			@Mapped(ObjCObjectMapper.class) Object sender);
}
