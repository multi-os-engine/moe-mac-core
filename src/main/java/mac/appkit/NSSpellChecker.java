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
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import mac.NSObject;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSArray;
import mac.foundation.NSDictionary;
import mac.foundation.NSOrthography;
import mac.foundation.NSTextCheckingResult;
import mac.foundation.struct.NSRange;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSSpellChecker extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSSpellChecker(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessoryView")
	public native NSView accessoryView();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSSpellChecker alloc();

	@Generated
	@Selector("automaticallyIdentifiesLanguages")
	public native boolean automaticallyIdentifiesLanguages();

	@Generated
	@Selector("availableLanguages")
	public native NSArray availableLanguages();

	@Generated
	@Selector("checkGrammarOfString:startingAt:language:wrap:inSpellDocumentWithTag:details:")
	@ByValue
	public native NSRange checkGrammarOfStringStartingAtLanguageWrapInSpellDocumentWithTagDetails(
			String stringToCheck, long startingOffset, String language,
			boolean wrapFlag, long tag, Ptr<NSArray> details);

	@Generated
	@Selector("checkSpellingOfString:startingAt:")
	@ByValue
	public native NSRange checkSpellingOfStringStartingAt(String stringToCheck,
			long startingOffset);

	@Generated
	@Selector("checkSpellingOfString:startingAt:language:wrap:inSpellDocumentWithTag:wordCount:")
	@ByValue
	public native NSRange checkSpellingOfStringStartingAtLanguageWrapInSpellDocumentWithTagWordCount(
			String stringToCheck, long startingOffset, String language,
			boolean wrapFlag, long tag, LongPtr wordCount);

	@Generated
	@Selector("checkString:range:types:options:inSpellDocumentWithTag:orthography:wordCount:")
	public native NSArray checkStringRangeTypesOptionsInSpellDocumentWithTagOrthographyWordCount(
			String stringToCheck, @ByValue NSRange range, long checkingTypes,
			NSDictionary options, long tag, Ptr<NSOrthography> orthography,
			LongPtr wordCount);

	@Generated
	@Selector("closeSpellDocumentWithTag:")
	public native void closeSpellDocumentWithTag(long tag);

	@Generated
	@Selector("completionsForPartialWordRange:inString:language:inSpellDocumentWithTag:")
	public native NSArray completionsForPartialWordRangeInStringLanguageInSpellDocumentWithTag(
			@ByValue NSRange range, String string, String language, long tag);

	@Generated
	@Selector("correctionForWordRange:inString:language:inSpellDocumentWithTag:")
	public native String correctionForWordRangeInStringLanguageInSpellDocumentWithTag(
			@ByValue NSRange range, String string, String language, long tag);

	@Generated
	@Selector("countWordsInString:language:")
	public native long countWordsInStringLanguage(String stringToCount,
			String language);

	@Generated
	@Selector("dismissCorrectionIndicatorForView:")
	public native void dismissCorrectionIndicatorForView(NSView view);

	@Generated
	@Selector("forgetWord:")
	public native void forgetWord(String word);

	@Generated
	@Selector("guessesForWord:")
	public native NSArray guessesForWord(String word);

	@Generated
	@Selector("guessesForWordRange:inString:language:inSpellDocumentWithTag:")
	public native NSArray guessesForWordRangeInStringLanguageInSpellDocumentWithTag(
			@ByValue NSRange range, String string, String language, long tag);

	@Generated
	@Selector("hasLearnedWord:")
	public native boolean hasLearnedWord(String word);

	@Generated
	@Selector("ignoreWord:inSpellDocumentWithTag:")
	public native void ignoreWordInSpellDocumentWithTag(String wordToIgnore,
			long tag);

	@Generated
	@Selector("ignoredWordsInSpellDocumentWithTag:")
	public native NSArray ignoredWordsInSpellDocumentWithTag(long tag);

	@Generated
	@Selector("init")
	public native NSSpellChecker init();

	@Generated
	@Selector("isAutomaticDashSubstitutionEnabled")
	public static native boolean isAutomaticDashSubstitutionEnabled();

	@Generated
	@Selector("isAutomaticQuoteSubstitutionEnabled")
	public static native boolean isAutomaticQuoteSubstitutionEnabled();

	@Generated
	@Selector("isAutomaticSpellingCorrectionEnabled")
	public static native boolean isAutomaticSpellingCorrectionEnabled();

	@Generated
	@Selector("isAutomaticTextReplacementEnabled")
	public static native boolean isAutomaticTextReplacementEnabled();

	@Generated
	@Selector("language")
	public native String language();

	@Generated
	@Selector("languageForWordRange:inString:orthography:")
	public native String languageForWordRangeInStringOrthography(
			@ByValue NSRange range, String string, NSOrthography orthography);

	@Generated
	@Selector("learnWord:")
	public native void learnWord(String word);

	@Generated
	@Selector("menuForResult:string:options:atLocation:inView:")
	public native NSMenu menuForResultStringOptionsAtLocationInView(
			NSTextCheckingResult result, String checkedString,
			NSDictionary options, @ByValue CGPoint location, NSView view);

	@Generated
	@Selector("recordResponse:toCorrection:forWord:language:inSpellDocumentWithTag:")
	public native void recordResponseToCorrectionForWordLanguageInSpellDocumentWithTag(
			long response, String correction, String word, String language,
			long tag);

	@Generated
	@Selector("requestCheckingOfString:range:types:options:inSpellDocumentWithTag:completionHandler:")
	public native long requestCheckingOfStringRangeTypesOptionsInSpellDocumentWithTagCompletionHandler(
			String stringToCheck,
			@ByValue NSRange range,
			long checkingTypes,
			NSDictionary options,
			long tag,
			@ObjCBlock(name = "call_requestCheckingOfStringRangeTypesOptionsInSpellDocumentWithTagCompletionHandler") Block_requestCheckingOfStringRangeTypesOptionsInSpellDocumentWithTagCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_requestCheckingOfStringRangeTypesOptionsInSpellDocumentWithTagCompletionHandler {
		@Generated
		public void call_requestCheckingOfStringRangeTypesOptionsInSpellDocumentWithTagCompletionHandler(
				long arg0, NSArray arg1, NSOrthography arg2, long arg3);
	}

	@Generated
	@Selector("setAccessoryView:")
	public native void setAccessoryView(NSView aView);

	@Generated
	@Selector("setAutomaticallyIdentifiesLanguages:")
	public native void setAutomaticallyIdentifiesLanguages(boolean flag);

	@Generated
	@Selector("setIgnoredWords:inSpellDocumentWithTag:")
	public native void setIgnoredWordsInSpellDocumentWithTag(NSArray words,
			long tag);

	@Generated
	@Selector("setLanguage:")
	public native boolean setLanguage(String language);

	@Generated
	@Selector("setSubstitutionsPanelAccessoryViewController:")
	public native void setSubstitutionsPanelAccessoryViewController(
			NSViewController accessoryController);

	@Generated
	@Selector("setWordFieldStringValue:")
	public native void setWordFieldStringValue(String aString);

	@Generated
	@Selector("sharedSpellChecker")
	public static native NSSpellChecker sharedSpellChecker();

	@Generated
	@Selector("sharedSpellCheckerExists")
	public static native boolean sharedSpellCheckerExists();

	@Generated
	@Selector("showCorrectionIndicatorOfType:primaryString:alternativeStrings:forStringInRect:view:completionHandler:")
	public native void showCorrectionIndicatorOfTypePrimaryStringAlternativeStringsForStringInRectViewCompletionHandler(
			long type,
			String primaryString,
			NSArray alternativeStrings,
			@ByValue CGRect rectOfTypedString,
			NSView view,
			@ObjCBlock(name = "call_showCorrectionIndicatorOfTypePrimaryStringAlternativeStringsForStringInRectViewCompletionHandler") Block_showCorrectionIndicatorOfTypePrimaryStringAlternativeStringsForStringInRectViewCompletionHandler completionBlock);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_showCorrectionIndicatorOfTypePrimaryStringAlternativeStringsForStringInRectViewCompletionHandler {
		@Generated
		public void call_showCorrectionIndicatorOfTypePrimaryStringAlternativeStringsForStringInRectViewCompletionHandler(
				String arg0);
	}

	@Generated
	@Selector("spellingPanel")
	public native NSPanel spellingPanel();

	@Generated
	@Selector("substitutionsPanel")
	public native NSPanel substitutionsPanel();

	@Generated
	@Selector("substitutionsPanelAccessoryViewController")
	public native NSViewController substitutionsPanelAccessoryViewController();

	@Generated
	@Selector("uniqueSpellDocumentTag")
	public static native long uniqueSpellDocumentTag();

	@Generated
	@Selector("unlearnWord:")
	public native void unlearnWord(String word);

	@Generated
	@Selector("updatePanels")
	public native void updatePanels();

	@Generated
	@Selector("updateSpellingPanelWithGrammarString:detail:")
	public native void updateSpellingPanelWithGrammarStringDetail(
			String string, NSDictionary detail);

	@Generated
	@Selector("updateSpellingPanelWithMisspelledWord:")
	public native void updateSpellingPanelWithMisspelledWord(String word);

	@Generated
	@Selector("userPreferredLanguages")
	public native NSArray userPreferredLanguages();

	@Generated
	@Selector("userQuotesArrayForLanguage:")
	public native NSArray userQuotesArrayForLanguage(String language);

	@Generated
	@Selector("userReplacementsDictionary")
	public native NSDictionary userReplacementsDictionary();
}
