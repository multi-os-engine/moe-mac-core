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
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.foundation.*;
import mac.foundation.struct.NSRange;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTextStorage extends NSMutableAttributedString {
	static {
		NatJ.register();
	}

	@Generated
	protected NSTextStorage(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addLayoutManager:")
	public native void addLayoutManager(NSLayoutManager obj);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSTextStorage alloc();

	@Generated
	@Selector("attributeRuns")
	public native NSArray attributeRuns();

	@Generated
	@Selector("attributedStringWithAttachment:")
	public static native NSAttributedString attributedStringWithAttachment(
			NSTextAttachment attachment);

	@Generated
	@Selector("changeInLength")
	public native long changeInLength();

	@Generated
	@Selector("characters")
	public native NSArray characters();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("edited:range:changeInLength:")
	public native void editedRangeChangeInLength(long editedMask,
			@ByValue NSRange range, long delta);

	@Generated
	@Selector("editedMask")
	public native long editedMask();

	@Generated
	@Selector("editedRange")
	@ByValue
	public native NSRange editedRange();

	@Generated
	@Selector("ensureAttributesAreFixedInRange:")
	public native void ensureAttributesAreFixedInRange(@ByValue NSRange range);

	@Generated
	@Selector("fixesAttributesLazily")
	public native boolean fixesAttributesLazily();

	@Generated
	@Selector("font")
	public native NSFont font();

	@Generated
	@Selector("foregroundColor")
	public native NSColor foregroundColor();

	@Generated
	@Selector("init")
	public native NSTextStorage init();

	@Generated
	@Selector("initWithAttributedString:")
	public native NSTextStorage initWithAttributedString(
			NSAttributedString attrStr);

	@Generated
	@Selector("initWithData:options:documentAttributes:error:")
	public native NSTextStorage initWithDataOptionsDocumentAttributesError(
			NSData data, NSDictionary options, Ptr<NSDictionary> dict,
			Ptr<NSError> error);

	@Generated
	@Selector("initWithDocFormat:documentAttributes:")
	public native NSTextStorage initWithDocFormatDocumentAttributes(
			NSData data, Ptr<NSDictionary> dict);

	@Generated
	@Selector("initWithHTML:baseURL:documentAttributes:")
	public native NSTextStorage initWithHTMLBaseURLDocumentAttributes(
			NSData data, NSURL base, Ptr<NSDictionary> dict);

	@Generated
	@Selector("initWithHTML:documentAttributes:")
	public native NSTextStorage initWithHTMLDocumentAttributes(NSData data,
			Ptr<NSDictionary> dict);

	@Generated
	@Selector("initWithHTML:options:documentAttributes:")
	public native NSTextStorage initWithHTMLOptionsDocumentAttributes(
			NSData data, NSDictionary options, Ptr<NSDictionary> dict);

	@Generated
	@Selector("initWithPath:documentAttributes:")
	public native NSTextStorage initWithPathDocumentAttributes(String path,
			Ptr<NSDictionary> dict);

	@Generated
	@Selector("initWithRTF:documentAttributes:")
	public native NSTextStorage initWithRTFDocumentAttributes(NSData data,
			Ptr<NSDictionary> dict);

	@Generated
	@Selector("initWithRTFD:documentAttributes:")
	public native NSTextStorage initWithRTFDDocumentAttributes(NSData data,
			Ptr<NSDictionary> dict);

	@Generated
	@Selector("initWithRTFDFileWrapper:documentAttributes:")
	public native NSTextStorage initWithRTFDFileWrapperDocumentAttributes(
			NSFileWrapper wrapper, Ptr<NSDictionary> dict);

	@Generated
	@Selector("initWithString:")
	public native NSTextStorage initWithString(String str);

	@Generated
	@Selector("initWithString:attributes:")
	public native NSTextStorage initWithStringAttributes(String str,
			NSDictionary attrs);

	@Generated
	@Selector("initWithURL:documentAttributes:")
	public native NSTextStorage initWithURLDocumentAttributes(NSURL url,
			Ptr<NSDictionary> dict);

	@Generated
	@Selector("initWithURL:options:documentAttributes:error:")
	public native NSTextStorage initWithURLOptionsDocumentAttributesError(
			NSURL url, NSDictionary options, Ptr<NSDictionary> dict,
			Ptr<NSError> error);

	@Generated
	@Selector("invalidateAttributesInRange:")
	public native void invalidateAttributesInRange(@ByValue NSRange range);

	@Generated
	@Selector("layoutManagers")
	public native NSArray layoutManagers();

	@Generated
	@Selector("paragraphs")
	public native NSArray paragraphs();

	@Generated
	@Selector("processEditing")
	public native void processEditing();

	@Generated
	@Selector("removeLayoutManager:")
	public native void removeLayoutManager(NSLayoutManager obj);

	@Generated
	@Selector("setAttributeRuns:")
	public native void setAttributeRuns(NSArray attributeRuns);

	@Generated
	@Selector("setCharacters:")
	public native void setCharacters(NSArray characters);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object delegate);

	@Generated
	@Selector("setFont:")
	public native void setFont(NSFont font);

	@Generated
	@Selector("setForegroundColor:")
	public native void setForegroundColor(NSColor color);

	@Generated
	@Selector("setParagraphs:")
	public native void setParagraphs(NSArray paragraphs);

	@Generated
	@Selector("setWords:")
	public native void setWords(NSArray words);

	@Generated
	@Selector("words")
	public native NSArray words();
}
