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
import org.moe.natj.objc.ann.*;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.appkit.*;
import mac.appkit.protocol.NSPasteboardReading;
import mac.appkit.protocol.NSPasteboardWriting;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.coregraphics.struct.CGSize;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;
import mac.foundation.protocol.NSMutableCopying;
import mac.foundation.struct.NSRange;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSAttributedString extends NSObject implements NSCopying,
		NSMutableCopying, NSCoding, NSPasteboardReading, NSPasteboardWriting {
	static {
		NatJ.register();
	}

	@Generated
	protected NSAttributedString(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSAttributedString alloc();

	@Generated
	@Selector("attribute:atIndex:effectiveRange:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object attributeAtIndexEffectiveRange(
			String attrName,
			long location,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange range);

	@Generated
	@Selector("attribute:atIndex:longestEffectiveRange:inRange:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object attributeAtIndexLongestEffectiveRangeInRange(
			String attrName,
			long location,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange range,
			@ByValue NSRange rangeLimit);

	@Generated
	@Selector("attributedSubstringFromRange:")
	public native NSAttributedString attributedSubstringFromRange(
			@ByValue NSRange range);

	@Generated
	@Selector("attributesAtIndex:effectiveRange:")
	public native NSDictionary attributesAtIndexEffectiveRange(
			long location,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange range);

	@Generated
	@Selector("attributesAtIndex:longestEffectiveRange:inRange:")
	public native NSDictionary attributesAtIndexLongestEffectiveRangeInRange(
			long location,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange range,
			@ByValue NSRange rangeLimit);

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("enumerateAttribute:inRange:options:usingBlock:")
	public native void enumerateAttributeInRangeOptionsUsingBlock(
			String attrName,
			@ByValue NSRange enumerationRange,
			long opts,
			@ObjCBlock(name = "call_enumerateAttributeInRangeOptionsUsingBlock") Block_enumerateAttributeInRangeOptionsUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_enumerateAttributeInRangeOptionsUsingBlock {
		@Generated
		public void call_enumerateAttributeInRangeOptionsUsingBlock(
				@Mapped(ObjCObjectMapper.class) Object arg0,
				@ByValue NSRange arg1, BoolPtr arg2);
	}

	@Generated
	@Selector("enumerateAttributesInRange:options:usingBlock:")
	public native void enumerateAttributesInRangeOptionsUsingBlock(
			@ByValue NSRange enumerationRange,
			long opts,
			@ObjCBlock(name = "call_enumerateAttributesInRangeOptionsUsingBlock") Block_enumerateAttributesInRangeOptionsUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_enumerateAttributesInRangeOptionsUsingBlock {
		@Generated
		public void call_enumerateAttributesInRangeOptionsUsingBlock(
				NSDictionary arg0, @ByValue NSRange arg1, BoolPtr arg2);
	}

	@Generated
	@Selector("init")
	public native NSAttributedString init();

	@Generated
	@Selector("initWithAttributedString:")
	public native NSAttributedString initWithAttributedString(
			NSAttributedString attrStr);

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithString:")
	public native NSAttributedString initWithString(String str);

	@Generated
	@Selector("initWithString:attributes:")
	public native NSAttributedString initWithStringAttributes(String str,
			NSDictionary attrs);

	@Generated
	@Selector("isEqualToAttributedString:")
	public native boolean isEqualToAttributedString(NSAttributedString other);

	@Generated
	@Selector("length")
	public native long length();

	@Generated
	@Selector("mutableCopyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object mutableCopyWithZone(VoidPtr zone);

	@Generated
	@Selector("string")
	public native String string();

	@Generated
	@Selector("RTFDFileWrapperFromRange:documentAttributes:")
	public native NSFileWrapper RTFDFileWrapperFromRangeDocumentAttributes(
			@ByValue NSRange range, NSDictionary dict);

	@Generated
	@Selector("RTFDFromRange:documentAttributes:")
	public native NSData RTFDFromRangeDocumentAttributes(
			@ByValue NSRange range, NSDictionary dict);

	@Generated
	@Selector("RTFFromRange:documentAttributes:")
	public native NSData RTFFromRangeDocumentAttributes(@ByValue NSRange range,
			NSDictionary dict);

	@Generated
	@Selector("URLAtIndex:effectiveRange:")
	public native NSURL URLAtIndexEffectiveRange(
			long location,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange effectiveRange);

	@Generated
	@Selector("attributedStringWithAttachment:")
	public static native NSAttributedString attributedStringWithAttachment(
			NSTextAttachment attachment);

	@Generated
	@Selector("boundingRectWithSize:options:")
	@ByValue
	public native CGRect boundingRectWithSizeOptions(@ByValue CGSize size,
			long options);

	@Generated
	@Selector("containsAttachments")
	public native boolean containsAttachments();

	@Generated
	@Selector("dataFromRange:documentAttributes:error:")
	public native NSData dataFromRangeDocumentAttributesError(
			@ByValue NSRange range, NSDictionary dict, Ptr<NSError> error);

	@Generated
	@Selector("docFormatFromRange:documentAttributes:")
	public native NSData docFormatFromRangeDocumentAttributes(
			@ByValue NSRange range, NSDictionary dict);

	@Generated
	@Selector("doubleClickAtIndex:")
	@ByValue
	public native NSRange doubleClickAtIndex(long location);

	@Generated
	@Selector("drawAtPoint:")
	public native void drawAtPoint(@ByValue CGPoint point);

	@Generated
	@Selector("drawInRect:")
	public native void drawInRect(@ByValue CGRect rect);

	@Generated
	@Selector("drawWithRect:options:")
	public native void drawWithRectOptions(@ByValue CGRect rect, long options);

	@Generated
	@Selector("fileWrapperFromRange:documentAttributes:error:")
	public native NSFileWrapper fileWrapperFromRangeDocumentAttributesError(
			@ByValue NSRange range, NSDictionary dict, Ptr<NSError> error);

	@Generated
	@Selector("fontAttributesInRange:")
	public native NSDictionary fontAttributesInRange(@ByValue NSRange range);

	@Generated
	@Selector("initWithData:options:documentAttributes:error:")
	public native NSAttributedString initWithDataOptionsDocumentAttributesError(
			NSData data, NSDictionary options, Ptr<NSDictionary> dict,
			Ptr<NSError> error);

	@Generated
	@Selector("initWithDocFormat:documentAttributes:")
	public native NSAttributedString initWithDocFormatDocumentAttributes(
			NSData data, Ptr<NSDictionary> dict);

	@Generated
	@Selector("initWithHTML:baseURL:documentAttributes:")
	public native NSAttributedString initWithHTMLBaseURLDocumentAttributes(
			NSData data, NSURL base, Ptr<NSDictionary> dict);

	@Generated
	@Selector("initWithHTML:documentAttributes:")
	public native NSAttributedString initWithHTMLDocumentAttributes(
			NSData data, Ptr<NSDictionary> dict);

	@Generated
	@Selector("initWithHTML:options:documentAttributes:")
	public native NSAttributedString initWithHTMLOptionsDocumentAttributes(
			NSData data, NSDictionary options, Ptr<NSDictionary> dict);

	@Generated
	@IsOptional
	@Selector("initWithPasteboardPropertyList:ofType:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithPasteboardPropertyListOfType(
			@Mapped(ObjCObjectMapper.class) Object propertyList, String type);

	@Generated
	@Selector("initWithPath:documentAttributes:")
	public native NSAttributedString initWithPathDocumentAttributes(
			String path, Ptr<NSDictionary> dict);

	@Generated
	@Selector("initWithRTF:documentAttributes:")
	public native NSAttributedString initWithRTFDocumentAttributes(NSData data,
			Ptr<NSDictionary> dict);

	@Generated
	@Selector("initWithRTFD:documentAttributes:")
	public native NSAttributedString initWithRTFDDocumentAttributes(
			NSData data, Ptr<NSDictionary> dict);

	@Generated
	@Selector("initWithRTFDFileWrapper:documentAttributes:")
	public native NSAttributedString initWithRTFDFileWrapperDocumentAttributes(
			NSFileWrapper wrapper, Ptr<NSDictionary> dict);

	@Generated
	@Selector("initWithURL:documentAttributes:")
	public native NSAttributedString initWithURLDocumentAttributes(NSURL url,
			Ptr<NSDictionary> dict);

	@Generated
	@Selector("initWithURL:options:documentAttributes:error:")
	public native NSAttributedString initWithURLOptionsDocumentAttributesError(
			NSURL url, NSDictionary options, Ptr<NSDictionary> dict,
			Ptr<NSError> error);

	@Generated
	@Selector("itemNumberInTextList:atIndex:")
	public native long itemNumberInTextListAtIndex(NSTextList list,
			long location);

	@Generated
	@Selector("lineBreakBeforeIndex:withinRange:")
	public native long lineBreakBeforeIndexWithinRange(long location,
			@ByValue NSRange aRange);

	@Generated
	@Selector("lineBreakByHyphenatingBeforeIndex:withinRange:")
	public native long lineBreakByHyphenatingBeforeIndexWithinRange(
			long location, @ByValue NSRange aRange);

	@Generated
	@Selector("nextWordFromIndex:forward:")
	public native long nextWordFromIndexForward(long location, boolean isForward);

	@Generated
	@Selector("pasteboardPropertyListForType:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object pasteboardPropertyListForType(String type);

	@Generated
	@Selector("rangeOfTextBlock:atIndex:")
	@ByValue
	public native NSRange rangeOfTextBlockAtIndex(NSTextBlock block,
			long location);

	@Generated
	@Selector("rangeOfTextList:atIndex:")
	@ByValue
	public native NSRange rangeOfTextListAtIndex(NSTextList list, long location);

	@Generated
	@Selector("rangeOfTextTable:atIndex:")
	@ByValue
	public native NSRange rangeOfTextTableAtIndex(NSTextTable table,
			long location);

	@Generated
	@Selector("readableTypesForPasteboard:")
	public static native NSArray readableTypesForPasteboard(
			NSPasteboard pasteboard);

	@Generated
	@ProtocolClassMethod("readableTypesForPasteboard")
	public NSArray _readableTypesForPasteboard(NSPasteboard pasteboard) {
		return readableTypesForPasteboard(pasteboard);
	}

	@Generated
	@IsOptional
	@Selector("readingOptionsForType:pasteboard:")
	public static native long readingOptionsForTypePasteboard(String type,
			NSPasteboard pasteboard);

	@Generated
	@IsOptional
	@ProtocolClassMethod("readingOptionsForTypePasteboard")
	public long _readingOptionsForTypePasteboard(String type,
			NSPasteboard pasteboard) {
		return readingOptionsForTypePasteboard(type, pasteboard);
	}

	@Generated
	@Selector("rulerAttributesInRange:")
	public native NSDictionary rulerAttributesInRange(@ByValue NSRange range);

	@Generated
	@Selector("size")
	@ByValue
	public native CGSize size();

	@Generated
	@Selector("textFileTypes")
	public static native NSArray textFileTypes();

	@Generated
	@Selector("textPasteboardTypes")
	public static native NSArray textPasteboardTypes();

	@Generated
	@Selector("textTypes")
	public static native NSArray textTypes();

	@Generated
	@Selector("textUnfilteredFileTypes")
	public static native NSArray textUnfilteredFileTypes();

	@Generated
	@Selector("textUnfilteredPasteboardTypes")
	public static native NSArray textUnfilteredPasteboardTypes();

	@Generated
	@Selector("textUnfilteredTypes")
	public static native NSArray textUnfilteredTypes();

	@Generated
	@Selector("writableTypesForPasteboard:")
	public native NSArray writableTypesForPasteboard(NSPasteboard pasteboard);

	@Generated
	@IsOptional
	@Selector("writingOptionsForType:pasteboard:")
	public native long writingOptionsForTypePasteboard(String type,
			NSPasteboard pasteboard);
}
