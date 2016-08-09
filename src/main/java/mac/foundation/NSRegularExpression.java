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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
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
public class NSRegularExpression extends NSObject implements NSCopying,
		NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSRegularExpression(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSRegularExpression alloc();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("enumerateMatchesInString:options:range:usingBlock:")
	public native void enumerateMatchesInStringOptionsRangeUsingBlock(
			String string,
			long options,
			@ByValue NSRange range,
			@ObjCBlock(name = "call_enumerateMatchesInStringOptionsRangeUsingBlock") Block_enumerateMatchesInStringOptionsRangeUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_enumerateMatchesInStringOptionsRangeUsingBlock {
		@Generated
		public void call_enumerateMatchesInStringOptionsRangeUsingBlock(
				NSTextCheckingResult arg0, long arg1, BoolPtr arg2);
	}

	@Generated
	@Selector("escapedPatternForString:")
	public static native String escapedPatternForString(String string);

	@Generated
	@Selector("escapedTemplateForString:")
	public static native String escapedTemplateForString(String string);

	@Generated
	@Selector("firstMatchInString:options:range:")
	public native NSTextCheckingResult firstMatchInStringOptionsRange(
			String string, long options, @ByValue NSRange range);

	@Generated
	@Selector("init")
	public native NSRegularExpression init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithPattern:options:error:")
	public native NSRegularExpression initWithPatternOptionsError(
			String pattern, long options, Ptr<NSError> error);

	@Generated
	@Selector("matchesInString:options:range:")
	public native NSArray matchesInStringOptionsRange(String string,
			long options, @ByValue NSRange range);

	@Generated
	@Selector("numberOfCaptureGroups")
	public native long numberOfCaptureGroups();

	@Generated
	@Selector("numberOfMatchesInString:options:range:")
	public native long numberOfMatchesInStringOptionsRange(String string,
			long options, @ByValue NSRange range);

	@Generated
	@Selector("options")
	public native long options();

	@Generated
	@Selector("pattern")
	public native String pattern();

	@Generated
	@Selector("rangeOfFirstMatchInString:options:range:")
	@ByValue
	public native NSRange rangeOfFirstMatchInStringOptionsRange(String string,
			long options, @ByValue NSRange range);

	@Generated
	@Selector("regularExpressionWithPattern:options:error:")
	public static native NSRegularExpression regularExpressionWithPatternOptionsError(
			String pattern, long options, Ptr<NSError> error);

	@Generated
	@Selector("replaceMatchesInString:options:range:withTemplate:")
	public native long replaceMatchesInStringOptionsRangeWithTemplate(
			NSMutableString string, long options, @ByValue NSRange range,
			String templ);

	@Generated
	@Selector("replacementStringForResult:inString:offset:template:")
	public native String replacementStringForResultInStringOffsetTemplate(
			NSTextCheckingResult result, String string, long offset,
			String templ);

	@Generated
	@Selector("stringByReplacingMatchesInString:options:range:withTemplate:")
	public native String stringByReplacingMatchesInStringOptionsRangeWithTemplate(
			String string, long options, @ByValue NSRange range, String templ);
}
