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
import mac.appkit.NSControl;
import mac.appkit.NSText;
import mac.appkit.NSTextView;
import mac.foundation.NSArray;
import mac.foundation.struct.NSRange;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSControlTextEditingDelegate")
public interface NSControlTextEditingDelegate {
	@Generated
	@IsOptional
	@Selector("control:didFailToFormatString:errorDescription:")
	public boolean controlDidFailToFormatStringErrorDescription(
			NSControl control, String string, String error);

	@Generated
	@IsOptional
	@Selector("control:didFailToValidatePartialString:errorDescription:")
	public void controlDidFailToValidatePartialStringErrorDescription(
			NSControl control, String string, String error);

	@Generated
	@IsOptional
	@Selector("control:isValidObject:")
	public boolean controlIsValidObject(NSControl control,
			@Mapped(ObjCObjectMapper.class) Object obj);

	@Generated
	@IsOptional
	@Selector("control:textShouldBeginEditing:")
	public boolean controlTextShouldBeginEditing(NSControl control,
			NSText fieldEditor);

	@Generated
	@IsOptional
	@Selector("control:textShouldEndEditing:")
	public boolean controlTextShouldEndEditing(NSControl control,
			NSText fieldEditor);

	@Generated
	@IsOptional
	@Selector("control:textView:completions:forPartialWordRange:indexOfSelectedItem:")
	public NSArray controlTextViewCompletionsForPartialWordRangeIndexOfSelectedItem(
			NSControl control, NSTextView textView, NSArray words,
			@ByValue NSRange charRange, LongPtr index);

	@Generated
	@IsOptional
	@Selector("control:textView:doCommandBySelector:")
	public boolean controlTextViewDoCommandBySelector(NSControl control,
			NSTextView textView, SEL commandSelector);
}
