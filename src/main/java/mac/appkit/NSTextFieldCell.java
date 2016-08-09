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
import mac.foundation.NSArray;
import mac.foundation.NSAttributedString;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTextFieldCell extends NSActionCell {
	static {
		NatJ.register();
	}

	@Generated
	protected NSTextFieldCell(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSTextFieldCell alloc();

	@Generated
	@Selector("allowedInputSourceLocales")
	public native NSArray allowedInputSourceLocales();

	@Generated
	@Selector("backgroundColor")
	public native NSColor backgroundColor();

	@Generated
	@Selector("bezelStyle")
	public native long bezelStyle();

	@Generated
	@Selector("drawsBackground")
	public native boolean drawsBackground();

	@Generated
	@Selector("init")
	public native NSTextFieldCell init();

	@Generated
	@Selector("initImageCell:")
	public native NSTextFieldCell initImageCell(NSImage image);

	@Generated
	@Selector("initTextCell:")
	public native NSTextFieldCell initTextCell(String aString);

	@Generated
	@Selector("placeholderAttributedString")
	public native NSAttributedString placeholderAttributedString();

	@Generated
	@Selector("placeholderString")
	public native String placeholderString();

	@Generated
	@Selector("setAllowedInputSourceLocales:")
	public native void setAllowedInputSourceLocales(NSArray localeIdentifiers);

	@Generated
	@Selector("setBackgroundColor:")
	public native void setBackgroundColor(NSColor color);

	@Generated
	@Selector("setBezelStyle:")
	public native void setBezelStyle(long style);

	@Generated
	@Selector("setDrawsBackground:")
	public native void setDrawsBackground(boolean flag);

	@Generated
	@Selector("setPlaceholderAttributedString:")
	public native void setPlaceholderAttributedString(NSAttributedString string);

	@Generated
	@Selector("setPlaceholderString:")
	public native void setPlaceholderString(String string);

	@Generated
	@Selector("setTextColor:")
	public native void setTextColor(NSColor color);

	@Generated
	@Selector("setUpFieldEditorAttributes:")
	public native NSText setUpFieldEditorAttributes(NSText textObj);

	@Generated
	@Selector("setWantsNotificationForMarkedText:")
	public native void setWantsNotificationForMarkedText(boolean flag);

	@Generated
	@Selector("textColor")
	public native NSColor textColor();
}
