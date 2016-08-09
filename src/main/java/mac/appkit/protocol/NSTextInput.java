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

package mac.appkit.protocol;


import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSArray;
import mac.foundation.NSAttributedString;
import mac.foundation.struct.NSRange;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSTextInput")
public interface NSTextInput {
	@Generated
	@Selector("attributedSubstringFromRange:")
	public NSAttributedString attributedSubstringFromRange(
			@ByValue NSRange theRange);

	@Generated
	@Selector("characterIndexForPoint:")
	public long characterIndexForPoint(@ByValue CGPoint thePoint);

	@Generated
	@Selector("conversationIdentifier")
	public long conversationIdentifier();

	@Generated
	@Selector("doCommandBySelector:")
	public void doCommandBySelector(SEL aSelector);

	@Generated
	@Selector("firstRectForCharacterRange:")
	@ByValue
	public CGRect firstRectForCharacterRange(@ByValue NSRange theRange);

	@Generated
	@Selector("hasMarkedText")
	public boolean hasMarkedText();

	@Generated
	@Selector("insertText:")
	public void insertText(@Mapped(ObjCObjectMapper.class) Object aString);

	@Generated
	@Selector("markedRange")
	@ByValue
	public NSRange markedRange();

	@Generated
	@Selector("selectedRange")
	@ByValue
	public NSRange selectedRange();

	@Generated
	@Selector("setMarkedText:selectedRange:")
	public void setMarkedTextSelectedRange(
			@Mapped(ObjCObjectMapper.class) Object aString,
			@ByValue NSRange selRange);

	@Generated
	@Selector("unmarkText")
	public void unmarkText();

	@Generated
	@Selector("validAttributesForMarkedText")
	public NSArray validAttributesForMarkedText();
}
