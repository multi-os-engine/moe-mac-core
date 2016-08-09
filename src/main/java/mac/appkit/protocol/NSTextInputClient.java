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
import org.moe.natj.objc.ann.IsOptional;
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
@ObjCProtocolName("NSTextInputClient")
public interface NSTextInputClient {
	@Generated
	@IsOptional
	@Selector("attributedString")
	public NSAttributedString attributedString();

	@Generated
	@Selector("attributedSubstringForProposedRange:actualRange:")
	public NSAttributedString attributedSubstringForProposedRangeActualRange(
			@ByValue NSRange aRange,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange actualRange);

	@Generated
	@IsOptional
	@Selector("baselineDeltaForCharacterAtIndex:")
	public double baselineDeltaForCharacterAtIndex(long anIndex);

	@Generated
	@Selector("characterIndexForPoint:")
	public long characterIndexForPoint(@ByValue CGPoint aPoint);

	@Generated
	@Selector("doCommandBySelector:")
	public void doCommandBySelector(SEL aSelector);

	@Generated
	@IsOptional
	@Selector("drawsVerticallyForCharacterAtIndex:")
	public boolean drawsVerticallyForCharacterAtIndex(long charIndex);

	@Generated
	@Selector("firstRectForCharacterRange:actualRange:")
	@ByValue
	public CGRect firstRectForCharacterRangeActualRange(
			@ByValue NSRange aRange,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange actualRange);

	@Generated
	@IsOptional
	@Selector("fractionOfDistanceThroughGlyphForPoint:")
	public double fractionOfDistanceThroughGlyphForPoint(@ByValue CGPoint aPoint);

	@Generated
	@Selector("hasMarkedText")
	public boolean hasMarkedText();

	@Generated
	@Selector("insertText:replacementRange:")
	public void insertTextReplacementRange(
			@Mapped(ObjCObjectMapper.class) Object aString,
			@ByValue NSRange replacementRange);

	@Generated
	@Selector("markedRange")
	@ByValue
	public NSRange markedRange();

	@Generated
	@Selector("selectedRange")
	@ByValue
	public NSRange selectedRange();

	@Generated
	@Selector("setMarkedText:selectedRange:replacementRange:")
	public void setMarkedTextSelectedRangeReplacementRange(
			@Mapped(ObjCObjectMapper.class) Object aString,
			@ByValue NSRange selectedRange, @ByValue NSRange replacementRange);

	@Generated
	@Selector("unmarkText")
	public void unmarkText();

	@Generated
	@Selector("validAttributesForMarkedText")
	public NSArray validAttributesForMarkedText();

	@Generated
	@IsOptional
	@Selector("windowLevel")
	public long windowLevel();
}
