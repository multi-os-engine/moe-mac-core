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

package mac.foundation.protocol;


import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import mac.foundation.NSArray;
import mac.foundation.NSDictionary;
import mac.foundation.NSOrthography;
import mac.foundation.NSSpellServer;
import mac.foundation.struct.NSRange;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSSpellServerDelegate")
public interface NSSpellServerDelegate {
	@Generated
	@IsOptional
	@Selector("spellServer:checkGrammarInString:language:details:")
	@ByValue
	public NSRange spellServerCheckGrammarInStringLanguageDetails(
			NSSpellServer sender, String stringToCheck, String language,
			Ptr<NSArray> details);

	@Generated
	@IsOptional
	@Selector("spellServer:checkString:offset:types:options:orthography:wordCount:")
	public NSArray spellServerCheckStringOffsetTypesOptionsOrthographyWordCount(
			NSSpellServer sender, String stringToCheck, long offset,
			long checkingTypes, NSDictionary options,
			NSOrthography orthography, LongPtr wordCount);

	@Generated
	@IsOptional
	@Selector("spellServer:didForgetWord:inLanguage:")
	public void spellServerDidForgetWordInLanguage(NSSpellServer sender,
			String word, String language);

	@Generated
	@IsOptional
	@Selector("spellServer:didLearnWord:inLanguage:")
	public void spellServerDidLearnWordInLanguage(NSSpellServer sender,
			String word, String language);

	@Generated
	@IsOptional
	@Selector("spellServer:findMisspelledWordInString:language:wordCount:countOnly:")
	@ByValue
	public NSRange spellServerFindMisspelledWordInStringLanguageWordCountCountOnly(
			NSSpellServer sender, String stringToCheck, String language,
			LongPtr wordCount, boolean countOnly);

	@Generated
	@IsOptional
	@Selector("spellServer:recordResponse:toCorrection:forWord:language:")
	public void spellServerRecordResponseToCorrectionForWordLanguage(
			NSSpellServer sender, long response, String correction,
			String word, String language);

	@Generated
	@IsOptional
	@Selector("spellServer:suggestCompletionsForPartialWordRange:inString:language:")
	public NSArray spellServerSuggestCompletionsForPartialWordRangeInStringLanguage(
			NSSpellServer sender, @ByValue NSRange range, String string,
			String language);

	@Generated
	@IsOptional
	@Selector("spellServer:suggestGuessesForWord:inLanguage:")
	public NSArray spellServerSuggestGuessesForWordInLanguage(
			NSSpellServer sender, String word, String language);
}
