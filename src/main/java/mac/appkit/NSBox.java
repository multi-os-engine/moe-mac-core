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
import mac.coregraphics.struct.CGSize;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSBox extends NSView {
	static {
		NatJ.register();
	}

	@Generated
	protected NSBox(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSBox alloc();

	@Generated
	@Selector("borderColor")
	public native NSColor borderColor();

	@Generated
	@Selector("borderRect")
	@ByValue
	public native CGRect borderRect();

	@Generated
	@Selector("borderType")
	public native long borderType();

	@Generated
	@Selector("borderWidth")
	public native double borderWidth();

	@Generated
	@Selector("boxType")
	public native long boxType();

	@Generated
	@Selector("contentView")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object contentView();

	@Generated
	@Selector("contentViewMargins")
	@ByValue
	public native CGSize contentViewMargins();

	@Generated
	@Selector("cornerRadius")
	public native double cornerRadius();

	@Generated
	@Selector("fillColor")
	public native NSColor fillColor();

	@Generated
	@Selector("init")
	public native NSBox init();

	@Generated
	@Selector("initWithFrame:")
	public native NSBox initWithFrame(@ByValue CGRect frameRect);

	@Generated
	@Selector("isTransparent")
	public native boolean isTransparent();

	@Generated
	@Selector("setBorderColor:")
	public native void setBorderColor(NSColor borderColor);

	@Generated
	@Selector("setBorderType:")
	public native void setBorderType(long aType);

	@Generated
	@Selector("setBorderWidth:")
	public native void setBorderWidth(double borderWidth);

	@Generated
	@Selector("setBoxType:")
	public native void setBoxType(long boxType);

	@Generated
	@Selector("setContentView:")
	public native void setContentView(NSView aView);

	@Generated
	@Selector("setContentViewMargins:")
	public native void setContentViewMargins(@ByValue CGSize offsetSize);

	@Generated
	@Selector("setCornerRadius:")
	public native void setCornerRadius(double cornerRadius);

	@Generated
	@Selector("setFillColor:")
	public native void setFillColor(NSColor fillColor);

	@Generated
	@Selector("setFrameFromContentFrame:")
	public native void setFrameFromContentFrame(@ByValue CGRect contentFrame);

	@Generated
	@Selector("setTitle:")
	public native void setTitle(String aString);

	@Generated
	@Selector("setTitleFont:")
	public native void setTitleFont(NSFont fontObj);

	@Generated
	@Selector("setTitlePosition:")
	public native void setTitlePosition(long aPosition);

	@Generated
	@Selector("setTitleWithMnemonic:")
	public native void setTitleWithMnemonic(String stringWithAmpersand);

	@Generated
	@Selector("setTransparent:")
	public native void setTransparent(boolean flag);

	@Generated
	@Selector("sizeToFit")
	public native void sizeToFit();

	@Generated
	@Selector("title")
	public native String title();

	@Generated
	@Selector("titleCell")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object titleCell();

	@Generated
	@Selector("titleFont")
	public native NSFont titleFont();

	@Generated
	@Selector("titlePosition")
	public native long titlePosition();

	@Generated
	@Selector("titleRect")
	@ByValue
	public native CGRect titleRect();
}
