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
import mac.coregraphics.struct.CGRect;
import mac.coregraphics.struct.CGSize;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPopover extends NSResponder {
	static {
		NatJ.register();
	}

	@Generated
	protected NSPopover(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSPopover alloc();

	@Generated
	@Selector("animates")
	public native boolean animates();

	@Generated
	@Selector("appearance")
	public native long appearance();

	@Generated
	@Selector("behavior")
	public native long behavior();

	@Generated
	@Selector("close")
	public native void close();

	@Generated
	@Selector("contentSize")
	@ByValue
	public native CGSize contentSize();

	@Generated
	@Selector("contentViewController")
	public native NSViewController contentViewController();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("init")
	public native NSPopover init();

	@Generated
	@Selector("isShown")
	public native boolean isShown();

	@Generated
	@Selector("performClose:")
	public native void performClose(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("positioningRect")
	@ByValue
	public native CGRect positioningRect();

	@Generated
	@Selector("setAnimates:")
	public native void setAnimates(boolean value);

	@Generated
	@Selector("setAppearance:")
	public native void setAppearance(long value);

	@Generated
	@Selector("setBehavior:")
	public native void setBehavior(long value);

	@Generated
	@Selector("setContentSize:")
	public native void setContentSize(@ByValue CGSize value);

	@Generated
	@Selector("setContentViewController:")
	public native void setContentViewController(NSViewController value);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	public void setDelegate(@Mapped(ObjCObjectMapper.class) Object value) {
		ObjCObject __old = (ObjCObject) delegate();
		if (value != null) {
			ObjCRuntime.associateObjCObject(this, value);
		}
		setDelegate_unsafe(value);
		if (__old != null) {
			ObjCRuntime
					.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("setPositioningRect:")
	public native void setPositioningRect(@ByValue CGRect value);

	@Generated
	@Selector("showRelativeToRect:ofView:preferredEdge:")
	public native void showRelativeToRectOfViewPreferredEdge(
			@ByValue CGRect positioningRect, NSView positioningView,
			long preferredEdge);
}
