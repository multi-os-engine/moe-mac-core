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
import mac.coregraphics.struct.CGSize;
import mac.foundation.NSAttributedString;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSFormCell extends NSActionCell {
	static {
		NatJ.register();
	}

	@Generated
	protected NSFormCell(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSFormCell alloc();

	@Generated
	@Selector("attributedTitle")
	public native NSAttributedString attributedTitle();

	@Generated
	@Selector("init")
	public native NSFormCell init();

	@Generated
	@Selector("initImageCell:")
	public native NSFormCell initImageCell(NSImage image);

	@Generated
	@Selector("initTextCell:")
	public native NSFormCell initTextCell(String aString);

	@Generated
	@Selector("isOpaque")
	public native boolean isOpaque();

	@Generated
	@Selector("placeholderAttributedString")
	public native NSAttributedString placeholderAttributedString();

	@Generated
	@Selector("placeholderString")
	public native String placeholderString();

	@Generated
	@Selector("preferredTextFieldWidth")
	public native double preferredTextFieldWidth();

	@Generated
	@Selector("setAttributedTitle:")
	public native void setAttributedTitle(NSAttributedString obj);

	@Generated
	@Selector("setPlaceholderAttributedString:")
	public native void setPlaceholderAttributedString(NSAttributedString string);

	@Generated
	@Selector("setPlaceholderString:")
	public native void setPlaceholderString(String string);

	@Generated
	@Selector("setPreferredTextFieldWidth:")
	public native void setPreferredTextFieldWidth(double preferredWidth);

	@Generated
	@Selector("setTitle:")
	public native void setTitle(String aString);

	@Generated
	@Selector("setTitleAlignment:")
	public native void setTitleAlignment(long mode);

	@Generated
	@Selector("setTitleBaseWritingDirection:")
	public native void setTitleBaseWritingDirection(long writingDirection);

	@Generated
	@Selector("setTitleFont:")
	public native void setTitleFont(NSFont fontObj);

	@Generated
	@Selector("setTitleWidth:")
	public native void setTitleWidth(double width);

	@Generated
	@Selector("setTitleWithMnemonic:")
	public native void setTitleWithMnemonic(String stringWithAmpersand);

	@Generated
	@Selector("title")
	public native String title();

	@Generated
	@Selector("titleAlignment")
	public native long titleAlignment();

	@Generated
	@Selector("titleBaseWritingDirection")
	public native long titleBaseWritingDirection();

	@Generated
	@Selector("titleFont")
	public native NSFont titleFont();

	@Generated
	@Selector("titleWidth")
	public native double titleWidth();

	@Generated
	@Selector("titleWidth:")
	public native double titleWidth(@ByValue CGSize aSize);
}
