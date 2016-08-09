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
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import mac.appkit.NSView;
import mac.foundation.NSArray;
import mac.foundation.struct.NSRange;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSTextFinderClient")
public interface NSTextFinderClient {
	@Generated
	@IsOptional
	@Selector("allowsMultipleSelection")
	public boolean allowsMultipleSelection();

	@Generated
	@IsOptional
	@Selector("contentViewAtIndex:effectiveCharacterRange:")
	public NSView contentViewAtIndexEffectiveCharacterRange(
			long index,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange outRange);

	@Generated
	@IsOptional
	@Selector("didReplaceCharacters")
	public void didReplaceCharacters();

	@Generated
	@IsOptional
	@Selector("drawCharactersInRange:forContentView:")
	public void drawCharactersInRangeForContentView(@ByValue NSRange range,
			NSView view);

	@Generated
	@IsOptional
	@Selector("firstSelectedRange")
	@ByValue
	public NSRange firstSelectedRange();

	@Generated
	@IsOptional
	@Selector("isEditable")
	public boolean isEditable();

	@Generated
	@IsOptional
	@Selector("isSelectable")
	public boolean isSelectable();

	@Generated
	@IsOptional
	@Selector("rectsForCharacterRange:")
	public NSArray rectsForCharacterRange(@ByValue NSRange range);

	@Generated
	@IsOptional
	@Selector("replaceCharactersInRange:withString:")
	public void replaceCharactersInRangeWithString(@ByValue NSRange range,
			String string);

	@Generated
	@IsOptional
	@Selector("scrollRangeToVisible:")
	public void scrollRangeToVisible(@ByValue NSRange range);

	@Generated
	@IsOptional
	@Selector("selectedRanges")
	public NSArray selectedRanges();

	@Generated
	@IsOptional
	@Selector("setSelectedRanges:")
	public void setSelectedRanges(NSArray value);

	@Generated
	@IsOptional
	@Selector("shouldReplaceCharactersInRanges:withStrings:")
	public boolean shouldReplaceCharactersInRangesWithStrings(NSArray ranges,
			NSArray strings);

	@Generated
	@IsOptional
	@Selector("string")
	public String string();

	@Generated
	@IsOptional
	@Selector("stringAtIndex:effectiveRange:endsWithSearchBoundary:")
	public String stringAtIndexEffectiveRangeEndsWithSearchBoundary(
			long characterIndex,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange outRange,
			BoolPtr outFlag);

	@Generated
	@IsOptional
	@Selector("stringLength")
	public long stringLength();

	@Generated
	@IsOptional
	@Selector("visibleCharacterRanges")
	public NSArray visibleCharacterRanges();
}
