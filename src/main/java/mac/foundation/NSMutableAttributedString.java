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
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.appkit.NSTextAttachment;
import mac.foundation.struct.NSRange;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMutableAttributedString extends NSAttributedString {
	static {
		NatJ.register();
	}

	@Generated
	protected NSMutableAttributedString(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addAttribute:value:range:")
	public native void addAttributeValueRange(String name,
			@Mapped(ObjCObjectMapper.class) Object value, @ByValue NSRange range);

	@Generated
	@Selector("addAttributes:range:")
	public native void addAttributesRange(NSDictionary attrs,
			@ByValue NSRange range);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSMutableAttributedString alloc();

	@Generated
	@Selector("appendAttributedString:")
	public native void appendAttributedString(NSAttributedString attrString);

	@Generated
	@Selector("beginEditing")
	public native void beginEditing();

	@Generated
	@Selector("deleteCharactersInRange:")
	public native void deleteCharactersInRange(@ByValue NSRange range);

	@Generated
	@Selector("endEditing")
	public native void endEditing();

	@Generated
	@Selector("init")
	public native NSMutableAttributedString init();

	@Generated
	@Selector("initWithAttributedString:")
	public native NSMutableAttributedString initWithAttributedString(
			NSAttributedString attrStr);

	@Generated
	@Selector("initWithString:")
	public native NSMutableAttributedString initWithString(String str);

	@Generated
	@Selector("initWithString:attributes:")
	public native NSMutableAttributedString initWithStringAttributes(
			String str, NSDictionary attrs);

	@Generated
	@Selector("insertAttributedString:atIndex:")
	public native void insertAttributedStringAtIndex(
			NSAttributedString attrString, long loc);

	@Generated
	@Selector("mutableString")
	public native NSMutableString mutableString();

	@Generated
	@Selector("removeAttribute:range:")
	public native void removeAttributeRange(String name, @ByValue NSRange range);

	@Generated
	@Selector("replaceCharactersInRange:withAttributedString:")
	public native void replaceCharactersInRangeWithAttributedString(
			@ByValue NSRange range, NSAttributedString attrString);

	@Generated
	@Selector("replaceCharactersInRange:withString:")
	public native void replaceCharactersInRangeWithString(
			@ByValue NSRange range, String str);

	@Generated
	@Selector("setAttributedString:")
	public native void setAttributedString(NSAttributedString attrString);

	@Generated
	@Selector("setAttributes:range:")
	public native void setAttributesRange(NSDictionary attrs,
			@ByValue NSRange range);

	@Generated
	@Selector("applyFontTraits:range:")
	public native void applyFontTraitsRange(long traitMask,
			@ByValue NSRange range);

	@Generated
	@Selector("attributedStringWithAttachment:")
	public static native NSAttributedString attributedStringWithAttachment(
			NSTextAttachment attachment);

	@Generated
	@Selector("fixAttachmentAttributeInRange:")
	public native void fixAttachmentAttributeInRange(@ByValue NSRange range);

	@Generated
	@Selector("fixAttributesInRange:")
	public native void fixAttributesInRange(@ByValue NSRange range);

	@Generated
	@Selector("fixFontAttributeInRange:")
	public native void fixFontAttributeInRange(@ByValue NSRange range);

	@Generated
	@Selector("fixParagraphStyleAttributeInRange:")
	public native void fixParagraphStyleAttributeInRange(@ByValue NSRange range);

	@Generated
	@Selector("initWithData:options:documentAttributes:error:")
	public native NSMutableAttributedString initWithDataOptionsDocumentAttributesError(
			NSData data, NSDictionary options, Ptr<NSDictionary> dict,
			Ptr<NSError> error);

	@Generated
	@Selector("initWithDocFormat:documentAttributes:")
	public native NSMutableAttributedString initWithDocFormatDocumentAttributes(
			NSData data, Ptr<NSDictionary> dict);

	@Generated
	@Selector("initWithHTML:baseURL:documentAttributes:")
	public native NSMutableAttributedString initWithHTMLBaseURLDocumentAttributes(
			NSData data, NSURL base, Ptr<NSDictionary> dict);

	@Generated
	@Selector("initWithHTML:documentAttributes:")
	public native NSMutableAttributedString initWithHTMLDocumentAttributes(
			NSData data, Ptr<NSDictionary> dict);

	@Generated
	@Selector("initWithHTML:options:documentAttributes:")
	public native NSMutableAttributedString initWithHTMLOptionsDocumentAttributes(
			NSData data, NSDictionary options, Ptr<NSDictionary> dict);

	@Generated
	@Selector("initWithPath:documentAttributes:")
	public native NSMutableAttributedString initWithPathDocumentAttributes(
			String path, Ptr<NSDictionary> dict);

	@Generated
	@Selector("initWithRTF:documentAttributes:")
	public native NSMutableAttributedString initWithRTFDocumentAttributes(
			NSData data, Ptr<NSDictionary> dict);

	@Generated
	@Selector("initWithRTFD:documentAttributes:")
	public native NSMutableAttributedString initWithRTFDDocumentAttributes(
			NSData data, Ptr<NSDictionary> dict);

	@Generated
	@Selector("initWithRTFDFileWrapper:documentAttributes:")
	public native NSMutableAttributedString initWithRTFDFileWrapperDocumentAttributes(
			NSFileWrapper wrapper, Ptr<NSDictionary> dict);

	@Generated
	@Selector("initWithURL:documentAttributes:")
	public native NSMutableAttributedString initWithURLDocumentAttributes(
			NSURL url, Ptr<NSDictionary> dict);

	@Generated
	@Selector("initWithURL:options:documentAttributes:error:")
	public native NSMutableAttributedString initWithURLOptionsDocumentAttributesError(
			NSURL url, NSDictionary options, Ptr<NSDictionary> dict,
			Ptr<NSError> error);

	@Generated
	@Selector("readFromData:options:documentAttributes:")
	public native boolean readFromDataOptionsDocumentAttributes(NSData data,
			NSDictionary options, Ptr<NSDictionary> dict);

	@Generated
	@Selector("readFromData:options:documentAttributes:error:")
	public native boolean readFromDataOptionsDocumentAttributesError(
			NSData data, NSDictionary opts, Ptr<NSDictionary> dict,
			Ptr<NSError> error);

	@Generated
	@Selector("readFromURL:options:documentAttributes:")
	public native boolean readFromURLOptionsDocumentAttributes(NSURL url,
			NSDictionary options, Ptr<NSDictionary> dict);

	@Generated
	@Selector("readFromURL:options:documentAttributes:error:")
	public native boolean readFromURLOptionsDocumentAttributesError(NSURL url,
			NSDictionary opts, Ptr<NSDictionary> dict, Ptr<NSError> error);

	@Generated
	@Selector("setAlignment:range:")
	public native void setAlignmentRange(long alignment, @ByValue NSRange range);

	@Generated
	@Selector("setBaseWritingDirection:range:")
	public native void setBaseWritingDirectionRange(long writingDirection,
			@ByValue NSRange range);

	@Generated
	@Selector("subscriptRange:")
	public native void subscriptRange(@ByValue NSRange range);

	@Generated
	@Selector("superscriptRange:")
	public native void superscriptRange(@ByValue NSRange range);

	@Generated
	@Selector("unscriptRange:")
	public native void unscriptRange(@ByValue NSRange range);

	@Generated
	@Selector("updateAttachmentsFromPath:")
	public native void updateAttachmentsFromPath(String path);
}
