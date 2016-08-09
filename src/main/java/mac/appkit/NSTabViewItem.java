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
import mac.coregraphics.struct.CGSize;
import mac.foundation.NSCoder;
import mac.foundation.protocol.NSCoding;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTabViewItem extends NSObject implements NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSTabViewItem(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSTabViewItem alloc();

	@Generated
	@Selector("color")
	public native NSColor color();

	@Generated
	@Selector("drawLabel:inRect:")
	public native void drawLabelInRect(boolean shouldTruncateLabel,
			@ByValue CGRect labelRect);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("identifier")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object identifier();

	@Generated
	@Selector("init")
	public native NSTabViewItem init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithIdentifier:")
	public native NSTabViewItem initWithIdentifier(
			@Mapped(ObjCObjectMapper.class) Object identifier);

	@Generated
	@Selector("initialFirstResponder")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initialFirstResponder();

	@Generated
	@Selector("label")
	public native String label();

	@Generated
	@Selector("setColor:")
	public native void setColor(NSColor color);

	@Generated
	@Selector("setIdentifier:")
	public native void setIdentifier(
			@Mapped(ObjCObjectMapper.class) Object identifier);

	@Generated
	@Selector("setInitialFirstResponder:")
	public native void setInitialFirstResponder(NSView view);

	@Generated
	@Selector("setLabel:")
	public native void setLabel(String label);

	@Generated
	@Selector("setToolTip:")
	public native void setToolTip(String toolTip);

	@Generated
	@Selector("setView:")
	public native void setView(NSView view);

	@Generated
	@Selector("sizeOfLabel:")
	@ByValue
	public native CGSize sizeOfLabel(boolean computeMin);

	@Generated
	@Selector("tabState")
	public native long tabState();

	@Generated
	@Selector("tabView")
	public native NSTabView tabView();

	@Generated
	@Selector("toolTip")
	public native String toolTip();

	@Generated
	@Selector("view")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object view();
}
