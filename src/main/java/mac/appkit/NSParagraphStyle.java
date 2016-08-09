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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.NSArray;
import mac.foundation.NSCoder;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;
import mac.foundation.protocol.NSMutableCopying;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSParagraphStyle extends NSObject implements NSCopying,
		NSMutableCopying, NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSParagraphStyle(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("alignment")
	public native long alignment();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSParagraphStyle alloc();

	@Generated
	@Selector("baseWritingDirection")
	public native long baseWritingDirection();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("defaultParagraphStyle")
	public static native NSParagraphStyle defaultParagraphStyle();

	@Generated
	@Selector("defaultTabInterval")
	public native double defaultTabInterval();

	@Generated
	@Selector("defaultWritingDirectionForLanguage:")
	public static native long defaultWritingDirectionForLanguage(
			String languageName);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("firstLineHeadIndent")
	public native double firstLineHeadIndent();

	@Generated
	@Selector("headIndent")
	public native double headIndent();

	@Generated
	@Selector("headerLevel")
	public native long headerLevel();

	@Generated
	@Selector("hyphenationFactor")
	public native float hyphenationFactor();

	@Generated
	@Selector("init")
	public native NSParagraphStyle init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("lineBreakMode")
	public native long lineBreakMode();

	@Generated
	@Selector("lineHeightMultiple")
	public native double lineHeightMultiple();

	@Generated
	@Selector("lineSpacing")
	public native double lineSpacing();

	@Generated
	@Selector("maximumLineHeight")
	public native double maximumLineHeight();

	@Generated
	@Selector("minimumLineHeight")
	public native double minimumLineHeight();

	@Generated
	@Selector("mutableCopyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object mutableCopyWithZone(VoidPtr zone);

	@Generated
	@Selector("paragraphSpacing")
	public native double paragraphSpacing();

	@Generated
	@Selector("paragraphSpacingBefore")
	public native double paragraphSpacingBefore();

	@Generated
	@Selector("tabStops")
	public native NSArray tabStops();

	@Generated
	@Selector("tailIndent")
	public native double tailIndent();

	@Generated
	@Selector("textBlocks")
	public native NSArray textBlocks();

	@Generated
	@Selector("textLists")
	public native NSArray textLists();

	@Generated
	@Selector("tighteningFactorForTruncation")
	public native float tighteningFactorForTruncation();
}
