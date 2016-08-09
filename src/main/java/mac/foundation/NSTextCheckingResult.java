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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;
import mac.foundation.struct.NSRange;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTextCheckingResult extends NSObject implements NSCopying,
		NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSTextCheckingResult(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("URL")
	public native NSURL URL();

	@Generated
	@Selector("addressCheckingResultWithRange:components:")
	public static native NSTextCheckingResult addressCheckingResultWithRangeComponents(
			@ByValue NSRange range, NSDictionary components);

	@Generated
	@Selector("addressComponents")
	public native NSDictionary addressComponents();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSTextCheckingResult alloc();

	@Generated
	@Selector("alternativeStrings")
	public native NSArray alternativeStrings();

	@Generated
	@Selector("components")
	public native NSDictionary components();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("correctionCheckingResultWithRange:replacementString:")
	public static native NSTextCheckingResult correctionCheckingResultWithRangeReplacementString(
			@ByValue NSRange range, String replacementString);

	@Generated
	@Selector("correctionCheckingResultWithRange:replacementString:alternativeStrings:")
	public static native NSTextCheckingResult correctionCheckingResultWithRangeReplacementStringAlternativeStrings(
			@ByValue NSRange range, String replacementString,
			NSArray alternativeStrings);

	@Generated
	@Selector("dashCheckingResultWithRange:replacementString:")
	public static native NSTextCheckingResult dashCheckingResultWithRangeReplacementString(
			@ByValue NSRange range, String replacementString);

	@Generated
	@Selector("date")
	public native NSDate date();

	@Generated
	@Selector("dateCheckingResultWithRange:date:")
	public static native NSTextCheckingResult dateCheckingResultWithRangeDate(
			@ByValue NSRange range, NSDate date);

	@Generated
	@Selector("dateCheckingResultWithRange:date:timeZone:duration:")
	public static native NSTextCheckingResult dateCheckingResultWithRangeDateTimeZoneDuration(
			@ByValue NSRange range, NSDate date, NSTimeZone timeZone,
			double duration);

	@Generated
	@Selector("duration")
	public native double duration();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("grammarCheckingResultWithRange:details:")
	public static native NSTextCheckingResult grammarCheckingResultWithRangeDetails(
			@ByValue NSRange range, NSArray details);

	@Generated
	@Selector("grammarDetails")
	public native NSArray grammarDetails();

	@Generated
	@Selector("init")
	public native NSTextCheckingResult init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("linkCheckingResultWithRange:URL:")
	public static native NSTextCheckingResult linkCheckingResultWithRangeURL(
			@ByValue NSRange range, NSURL url);

	@Generated
	@Selector("numberOfRanges")
	public native long numberOfRanges();

	@Generated
	@Selector("orthography")
	public native NSOrthography orthography();

	@Generated
	@Selector("orthographyCheckingResultWithRange:orthography:")
	public static native NSTextCheckingResult orthographyCheckingResultWithRangeOrthography(
			@ByValue NSRange range, NSOrthography orthography);

	@Generated
	@Selector("phoneNumber")
	public native String phoneNumber();

	@Generated
	@Selector("phoneNumberCheckingResultWithRange:phoneNumber:")
	public static native NSTextCheckingResult phoneNumberCheckingResultWithRangePhoneNumber(
			@ByValue NSRange range, String phoneNumber);

	@Generated
	@Selector("quoteCheckingResultWithRange:replacementString:")
	public static native NSTextCheckingResult quoteCheckingResultWithRangeReplacementString(
			@ByValue NSRange range, String replacementString);

	@Generated
	@Selector("range")
	@ByValue
	public native NSRange range();

	@Generated
	@Selector("rangeAtIndex:")
	@ByValue
	public native NSRange rangeAtIndex(long idx);

	@Generated
	@Selector("regularExpression")
	public native NSRegularExpression regularExpression();

	@Generated
	@Selector("regularExpressionCheckingResultWithRanges:count:regularExpression:")
	public static native NSTextCheckingResult regularExpressionCheckingResultWithRangesCountRegularExpression(
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange ranges,
			long count, NSRegularExpression regularExpression);

	@Generated
	@Selector("replacementCheckingResultWithRange:replacementString:")
	public static native NSTextCheckingResult replacementCheckingResultWithRangeReplacementString(
			@ByValue NSRange range, String replacementString);

	@Generated
	@Selector("replacementString")
	public native String replacementString();

	@Generated
	@Selector("resultByAdjustingRangesWithOffset:")
	public native NSTextCheckingResult resultByAdjustingRangesWithOffset(
			long offset);

	@Generated
	@Selector("resultType")
	public native long resultType();

	@Generated
	@Selector("spellCheckingResultWithRange:")
	public static native NSTextCheckingResult spellCheckingResultWithRange(
			@ByValue NSRange range);

	@Generated
	@Selector("timeZone")
	public native NSTimeZone timeZone();

	@Generated
	@Selector("transitInformationCheckingResultWithRange:components:")
	public static native NSTextCheckingResult transitInformationCheckingResultWithRangeComponents(
			@ByValue NSRange range, NSDictionary components);
}
