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

package mac.foundation;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import mac.NSObject;
import mac.foundation.struct.NSRange;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSLinguisticTagger extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSLinguisticTagger(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSLinguisticTagger alloc();

	@Generated
	@Selector("availableTagSchemesForLanguage:")
	public static native NSArray availableTagSchemesForLanguage(String language);

	@Generated
	@Selector("enumerateTagsInRange:scheme:options:usingBlock:")
	public native void enumerateTagsInRangeSchemeOptionsUsingBlock(
			@ByValue NSRange range,
			String tagScheme,
			long opts,
			@ObjCBlock(name = "call_enumerateTagsInRangeSchemeOptionsUsingBlock") Block_enumerateTagsInRangeSchemeOptionsUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_enumerateTagsInRangeSchemeOptionsUsingBlock {
		@Generated
		public void call_enumerateTagsInRangeSchemeOptionsUsingBlock(
				String arg0, @ByValue NSRange arg1, @ByValue NSRange arg2,
				BoolPtr arg3);
	}

	@Generated
	@Selector("init")
	public native NSLinguisticTagger init();

	@Generated
	@Selector("initWithTagSchemes:options:")
	public native NSLinguisticTagger initWithTagSchemesOptions(
			NSArray tagSchemes, long opts);

	@Generated
	@Selector("orthographyAtIndex:effectiveRange:")
	public native NSOrthography orthographyAtIndexEffectiveRange(
			long charIndex,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange effectiveRange);

	@Generated
	@Selector("possibleTagsAtIndex:scheme:tokenRange:sentenceRange:scores:")
	public native NSArray possibleTagsAtIndexSchemeTokenRangeSentenceRangeScores(
			long charIndex,
			String tagScheme,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange tokenRange,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange sentenceRange,
			Ptr<NSArray> scores);

	@Generated
	@Selector("sentenceRangeForRange:")
	@ByValue
	public native NSRange sentenceRangeForRange(@ByValue NSRange range);

	@Generated
	@Selector("setOrthography:range:")
	public native void setOrthographyRange(NSOrthography orthography,
			@ByValue NSRange range);

	@Generated
	@Selector("setString:")
	public native void setString(String string);

	@Generated
	@Selector("string")
	public native String string();

	@Generated
	@Selector("stringEditedInRange:changeInLength:")
	public native void stringEditedInRangeChangeInLength(
			@ByValue NSRange newRange, long delta);

	@Generated
	@Selector("tagAtIndex:scheme:tokenRange:sentenceRange:")
	public native String tagAtIndexSchemeTokenRangeSentenceRange(
			long charIndex,
			String tagScheme,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange tokenRange,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange sentenceRange);

	@Generated
	@Selector("tagSchemes")
	public native NSArray tagSchemes();

	@Generated
	@Selector("tagsInRange:scheme:options:tokenRanges:")
	public native NSArray tagsInRangeSchemeOptionsTokenRanges(
			@ByValue NSRange range, String tagScheme, long opts,
			Ptr<NSArray> tokenRanges);
}
