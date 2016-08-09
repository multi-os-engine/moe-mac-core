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
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.appkit.*;
import mac.coregraphics.struct.CGRect;
import mac.foundation.*;
import mac.foundation.struct.NSRange;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSTextViewDelegate")
public interface NSTextViewDelegate extends NSTextDelegate {
	@Generated
	@IsOptional
	@Selector("textView:URLForContentsOfTextAttachment:atIndex:")
	public NSURL textViewURLForContentsOfTextAttachmentAtIndex(
			NSTextView textView, NSTextAttachment textAttachment, long charIndex);

	@Generated
	@IsOptional
	@Selector("textView:clickedOnCell:inRect:")
	public void textViewClickedOnCellInRect(NSTextView textView,
			@Mapped(ObjCObjectMapper.class) Object cell,
			@ByValue CGRect cellFrame);

	@Generated
	@IsOptional
	@Selector("textView:clickedOnCell:inRect:atIndex:")
	public void textViewClickedOnCellInRectAtIndex(NSTextView textView,
			@Mapped(ObjCObjectMapper.class) Object cell,
			@ByValue CGRect cellFrame, long charIndex);

	@Generated
	@IsOptional
	@Selector("textView:clickedOnLink:")
	public boolean textViewClickedOnLink(NSTextView textView,
			@Mapped(ObjCObjectMapper.class) Object link);

	@Generated
	@IsOptional
	@Selector("textView:clickedOnLink:atIndex:")
	public boolean textViewClickedOnLinkAtIndex(NSTextView textView,
			@Mapped(ObjCObjectMapper.class) Object link, long charIndex);

	@Generated
	@IsOptional
	@Selector("textView:completions:forPartialWordRange:indexOfSelectedItem:")
	public NSArray textViewCompletionsForPartialWordRangeIndexOfSelectedItem(
			NSTextView textView, NSArray words, @ByValue NSRange charRange,
			LongPtr index);

	@Generated
	@IsOptional
	@Selector("textView:didCheckTextInRange:types:options:results:orthography:wordCount:")
	public NSArray textViewDidCheckTextInRangeTypesOptionsResultsOrthographyWordCount(
			NSTextView view, @ByValue NSRange range, long checkingTypes,
			NSDictionary options, NSArray results, NSOrthography orthography,
			long wordCount);

	@Generated
	@IsOptional
	@Selector("textView:doCommandBySelector:")
	public boolean textViewDoCommandBySelector(NSTextView textView,
			SEL commandSelector);

	@Generated
	@IsOptional
	@Selector("textView:doubleClickedOnCell:inRect:")
	public void textViewDoubleClickedOnCellInRect(NSTextView textView,
			@Mapped(ObjCObjectMapper.class) Object cell,
			@ByValue CGRect cellFrame);

	@Generated
	@IsOptional
	@Selector("textView:doubleClickedOnCell:inRect:atIndex:")
	public void textViewDoubleClickedOnCellInRectAtIndex(NSTextView textView,
			@Mapped(ObjCObjectMapper.class) Object cell,
			@ByValue CGRect cellFrame, long charIndex);

	@Generated
	@IsOptional
	@Selector("textView:draggedCell:inRect:event:")
	public void textViewDraggedCellInRectEvent(NSTextView view,
			@Mapped(ObjCObjectMapper.class) Object cell, @ByValue CGRect rect,
			NSEvent event);

	@Generated
	@IsOptional
	@Selector("textView:draggedCell:inRect:event:atIndex:")
	public void textViewDraggedCellInRectEventAtIndex(NSTextView view,
			@Mapped(ObjCObjectMapper.class) Object cell, @ByValue CGRect rect,
			NSEvent event, long charIndex);

	@Generated
	@IsOptional
	@Selector("textView:menu:forEvent:atIndex:")
	public NSMenu textViewMenuForEventAtIndex(NSTextView view, NSMenu menu,
			NSEvent event, long charIndex);

	@Generated
	@IsOptional
	@Selector("textView:shouldChangeTextInRange:replacementString:")
	public boolean textViewShouldChangeTextInRangeReplacementString(
			NSTextView textView, @ByValue NSRange affectedCharRange,
			String replacementString);

	@Generated
	@IsOptional
	@Selector("textView:shouldChangeTextInRanges:replacementStrings:")
	public boolean textViewShouldChangeTextInRangesReplacementStrings(
			NSTextView textView, NSArray affectedRanges,
			NSArray replacementStrings);

	@Generated
	@IsOptional
	@Selector("textView:shouldChangeTypingAttributes:toAttributes:")
	public NSDictionary textViewShouldChangeTypingAttributesToAttributes(
			NSTextView textView, NSDictionary oldTypingAttributes,
			NSDictionary newTypingAttributes);

	@Generated
	@IsOptional
	@Selector("textView:shouldSetSpellingState:range:")
	public long textViewShouldSetSpellingStateRange(NSTextView textView,
			long value, @ByValue NSRange affectedCharRange);

	@Generated
	@IsOptional
	@Selector("textView:willChangeSelectionFromCharacterRange:toCharacterRange:")
	@ByValue
	public NSRange textViewWillChangeSelectionFromCharacterRangeToCharacterRange(
			NSTextView textView, @ByValue NSRange oldSelectedCharRange,
			@ByValue NSRange newSelectedCharRange);

	@Generated
	@IsOptional
	@Selector("textView:willChangeSelectionFromCharacterRanges:toCharacterRanges:")
	public NSArray textViewWillChangeSelectionFromCharacterRangesToCharacterRanges(
			NSTextView textView, NSArray oldSelectedCharRanges,
			NSArray newSelectedCharRanges);

	@Generated
	@IsOptional
	@Selector("textView:willCheckTextInRange:options:types:")
	public NSDictionary textViewWillCheckTextInRangeOptionsTypes(
			NSTextView view, @ByValue NSRange range, NSDictionary options,
			LongPtr checkingTypes);

	@Generated
	@IsOptional
	@Selector("textView:willDisplayToolTip:forCharacterAtIndex:")
	public String textViewWillDisplayToolTipForCharacterAtIndex(
			NSTextView textView, String tooltip, long characterIndex);

	@Generated
	@IsOptional
	@Selector("textView:willShowSharingServicePicker:forItems:")
	public NSSharingServicePicker textViewWillShowSharingServicePickerForItems(
			NSTextView textView, NSSharingServicePicker servicePicker,
			NSArray items);

	@Generated
	@IsOptional
	@Selector("textView:writablePasteboardTypesForCell:atIndex:")
	public NSArray textViewWritablePasteboardTypesForCellAtIndex(
			NSTextView view, @Mapped(ObjCObjectMapper.class) Object cell,
			long charIndex);

	@Generated
	@IsOptional
	@Selector("textView:writeCell:atIndex:toPasteboard:type:")
	public boolean textViewWriteCellAtIndexToPasteboardType(NSTextView view,
			@Mapped(ObjCObjectMapper.class) Object cell, long charIndex,
			NSPasteboard pboard, String type);

	@Generated
	@IsOptional
	@Selector("textViewDidChangeSelection:")
	public void textViewDidChangeSelection(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("textViewDidChangeTypingAttributes:")
	public void textViewDidChangeTypingAttributes(NSNotification notification);

	@Generated
	@IsOptional
	@Selector("undoManagerForTextView:")
	public NSUndoManager undoManagerForTextView(NSTextView view);
}
