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
import mac.appkit.protocol.NSColorPickingDefault;
import mac.coregraphics.struct.CGSize;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSColorPicker extends NSObject implements NSColorPickingDefault {
	static {
		NatJ.register();
	}

	@Generated
	protected NSColorPicker(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSColorPicker alloc();

	@Generated
	@Selector("alphaControlAddedOrRemoved:")
	public native void alphaControlAddedOrRemoved(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("attachColorList:")
	public native void attachColorList(NSColorList colorList);

	@Generated
	@Selector("buttonToolTip")
	public native String buttonToolTip();

	@Generated
	@Selector("colorPanel")
	public native NSColorPanel colorPanel();

	@Generated
	@Selector("detachColorList:")
	public native void detachColorList(NSColorList colorList);

	@Generated
	@Selector("init")
	public native NSColorPicker init();

	@Generated
	@Selector("initWithPickerMask:colorPanel:")
	public native NSColorPicker initWithPickerMaskColorPanel(long mask,
			NSColorPanel owningColorPanel);

	@Generated
	@Selector("insertNewButtonImage:in:")
	public native void insertNewButtonImageIn(NSImage newButtonImage,
			NSButtonCell buttonCell);

	@Generated
	@Selector("minContentSize")
	@ByValue
	public native CGSize minContentSize();

	@Generated
	@Selector("provideNewButtonImage")
	public native NSImage provideNewButtonImage();

	@Generated
	@Selector("setMode:")
	public native void setMode(long mode);

	@Generated
	@Selector("viewSizeChanged:")
	public native void viewSizeChanged(
			@Mapped(ObjCObjectMapper.class) Object sender);
}
