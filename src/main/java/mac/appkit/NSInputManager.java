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
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.appkit.protocol.NSTextInput;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSArray;
import mac.foundation.NSAttributedString;
import mac.foundation.struct.NSRange;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSInputManager extends NSObject implements NSTextInput {
	static {
		NatJ.register();
	}

	@Generated
	protected NSInputManager(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSInputManager alloc();

	@Generated
	@Selector("attributedSubstringFromRange:")
	public native NSAttributedString attributedSubstringFromRange(
			@ByValue NSRange theRange);

	@Generated
	@Selector("characterIndexForPoint:")
	public native long characterIndexForPoint(@ByValue CGPoint thePoint);

	@Generated
	@Selector("conversationIdentifier")
	public native long conversationIdentifier();

	@Generated
	@Selector("currentInputManager")
	public static native NSInputManager currentInputManager();

	@Generated
	@Selector("cycleToNextInputLanguage:")
	public static native void cycleToNextInputLanguage(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("cycleToNextInputServerInLanguage:")
	public static native void cycleToNextInputServerInLanguage(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("doCommandBySelector:")
	public native void doCommandBySelector(SEL aSelector);

	@Generated
	@Selector("firstRectForCharacterRange:")
	@ByValue
	public native CGRect firstRectForCharacterRange(@ByValue NSRange theRange);

	@Generated
	@Selector("handleMouseEvent:")
	public native boolean handleMouseEvent(NSEvent theMouseEvent);

	@Generated
	@Selector("hasMarkedText")
	public native boolean hasMarkedText();

	@Generated
	@Selector("image")
	public native NSImage image();

	@Generated
	@Selector("init")
	public native NSInputManager init();

	@Generated
	@Selector("initWithName:host:")
	public native NSInputManager initWithNameHost(String inputServerName,
			String hostName);

	@Generated
	@Selector("insertText:")
	public native void insertText(@Mapped(ObjCObjectMapper.class) Object aString);

	@Generated
	@Selector("language")
	public native String language();

	@Generated
	@Selector("localizedInputManagerName")
	public native String localizedInputManagerName();

	@Generated
	@Selector("markedRange")
	@ByValue
	public native NSRange markedRange();

	@Generated
	@Selector("markedTextAbandoned:")
	public native void markedTextAbandoned(
			@Mapped(ObjCObjectMapper.class) Object cli);

	@Generated
	@Selector("markedTextSelectionChanged:client:")
	public native void markedTextSelectionChangedClient(
			@ByValue NSRange newSel, @Mapped(ObjCObjectMapper.class) Object cli);

	@Generated
	@Selector("selectedRange")
	@ByValue
	public native NSRange selectedRange();

	@Generated
	@Selector("server")
	public native NSInputServer server();

	@Generated
	@Selector("setMarkedText:selectedRange:")
	public native void setMarkedTextSelectedRange(
			@Mapped(ObjCObjectMapper.class) Object aString,
			@ByValue NSRange selRange);

	@Generated
	@Selector("unmarkText")
	public native void unmarkText();

	@Generated
	@Selector("validAttributesForMarkedText")
	public native NSArray validAttributesForMarkedText();

	@Generated
	@Selector("wantsToDelayTextChangeNotifications")
	public native boolean wantsToDelayTextChangeNotifications();

	@Generated
	@Selector("wantsToHandleMouseEvents")
	public native boolean wantsToHandleMouseEvents();

	@Generated
	@Selector("wantsToInterpretAllKeystrokes")
	public native boolean wantsToInterpretAllKeystrokes();
}
