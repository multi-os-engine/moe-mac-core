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


import org.moe.natj.c.map.CStringMapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.*;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.*;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.appkit.NSPasteboard;
import mac.appkit.protocol.NSPasteboardReading;
import mac.appkit.protocol.NSPasteboardWriting;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.coregraphics.struct.CGSize;
import mac.foundation.protocol.NSCopying;
import mac.foundation.protocol.NSMutableCopying;
import mac.foundation.protocol.NSSecureCoding;
import mac.foundation.struct.NSRange;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSString extends NSObject implements NSCopying, NSMutableCopying,
		NSSecureCoding, NSPasteboardWriting, NSPasteboardReading {
	static {
		NatJ.register();
	}

	@Generated
	protected NSString(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("UTF8String")
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	@MappedReturn(CStringMapper.class)
	public native String UTF8String();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSString alloc();

	@Generated
	@Selector("availableStringEncodings")
	public static native ConstLongPtr availableStringEncodings();

	@Generated
	@Selector("boolValue")
	public native boolean boolValue();

	@Generated
	@Selector("cString")
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	@MappedReturn(CStringMapper.class)
	public native String cString();

	@Generated
	@Selector("cStringLength")
	public native long cStringLength();

	@Generated
	@Selector("cStringUsingEncoding:")
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	@MappedReturn(CStringMapper.class)
	public native String cStringUsingEncoding(long encoding);

	@Generated
	@Selector("canBeConvertedToEncoding:")
	public native boolean canBeConvertedToEncoding(long encoding);

	@Generated
	@Selector("capitalizedString")
	public native String capitalizedString();

	@Generated
	@Selector("capitalizedStringWithLocale:")
	public native String capitalizedStringWithLocale(NSLocale locale);

	@Generated
	@Selector("caseInsensitiveCompare:")
	public native long caseInsensitiveCompare(String string);

	@Generated
	@Selector("characterAtIndex:")
	public native char characterAtIndex(long index);

	@Generated
	@Selector("commonPrefixWithString:options:")
	public native String commonPrefixWithStringOptions(String aString, long mask);

	@Generated
	@Selector("compare:")
	public native long compare(String string);

	@Generated
	@Selector("compare:options:")
	public native long compareOptions(String string, long mask);

	@Generated
	@Selector("compare:options:range:")
	public native long compareOptionsRange(String string, long mask,
			@ByValue NSRange compareRange);

	@Generated
	@Selector("compare:options:range:locale:")
	public native long compareOptionsRangeLocale(String string, long mask,
			@ByValue NSRange compareRange,
			@Mapped(ObjCObjectMapper.class) Object locale);

	@Generated
	@Selector("completePathIntoString:caseSensitive:matchesIntoArray:filterTypes:")
	public native long completePathIntoStringCaseSensitiveMatchesIntoArrayFilterTypes(
			Ptr<NSString> outputName, boolean flag, Ptr<NSArray> outputArray,
			NSArray filterTypes);

	@Generated
	@Selector("componentsSeparatedByCharactersInSet:")
	public native NSArray componentsSeparatedByCharactersInSet(
			NSCharacterSet separator);

	@Generated
	@Selector("componentsSeparatedByString:")
	public native NSArray componentsSeparatedByString(String separator);

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("dataUsingEncoding:")
	public native NSData dataUsingEncoding(long encoding);

	@Generated
	@Selector("dataUsingEncoding:allowLossyConversion:")
	public native NSData dataUsingEncodingAllowLossyConversion(long encoding,
			boolean lossy);

	@Generated
	@Selector("decomposedStringWithCanonicalMapping")
	public native String decomposedStringWithCanonicalMapping();

	@Generated
	@Selector("decomposedStringWithCompatibilityMapping")
	public native String decomposedStringWithCompatibilityMapping();

	@Generated
	@Selector("defaultCStringEncoding")
	public static native long defaultCStringEncoding();

	@Generated
	@Selector("description")
	public native String description();

	@Generated
	@Selector("doubleValue")
	public native double doubleValue();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("enumerateLinesUsingBlock:")
	public native void enumerateLinesUsingBlock(
			@ObjCBlock(name = "call_enumerateLinesUsingBlock") Block_enumerateLinesUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_enumerateLinesUsingBlock {
		@Generated
		public void call_enumerateLinesUsingBlock(String arg0, BoolPtr arg1);
	}

	@Generated
	@Selector("enumerateLinguisticTagsInRange:scheme:options:orthography:usingBlock:")
	public native void enumerateLinguisticTagsInRangeSchemeOptionsOrthographyUsingBlock(
			@ByValue NSRange range,
			String tagScheme,
			long opts,
			NSOrthography orthography,
			@ObjCBlock(name = "call_enumerateLinguisticTagsInRangeSchemeOptionsOrthographyUsingBlock") Block_enumerateLinguisticTagsInRangeSchemeOptionsOrthographyUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_enumerateLinguisticTagsInRangeSchemeOptionsOrthographyUsingBlock {
		@Generated
		public void call_enumerateLinguisticTagsInRangeSchemeOptionsOrthographyUsingBlock(
				String arg0, @ByValue NSRange arg1, @ByValue NSRange arg2,
				BoolPtr arg3);
	}

	@Generated
	@Selector("enumerateSubstringsInRange:options:usingBlock:")
	public native void enumerateSubstringsInRangeOptionsUsingBlock(
			@ByValue NSRange range,
			long opts,
			@ObjCBlock(name = "call_enumerateSubstringsInRangeOptionsUsingBlock") Block_enumerateSubstringsInRangeOptionsUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_enumerateSubstringsInRangeOptionsUsingBlock {
		@Generated
		public void call_enumerateSubstringsInRangeOptionsUsingBlock(
				String arg0, @ByValue NSRange arg1, @ByValue NSRange arg2,
				BoolPtr arg3);
	}

	@Generated
	@Selector("fastestEncoding")
	public native long fastestEncoding();

	@Generated
	@Selector("fileSystemRepresentation")
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	@MappedReturn(CStringMapper.class)
	public native String fileSystemRepresentation();

	@Generated
	@Selector("floatValue")
	public native float floatValue();

	@Generated
	@Selector("getBytes:maxLength:usedLength:encoding:options:range:remainingRange:")
	public native boolean getBytesMaxLengthUsedLengthEncodingOptionsRangeRemainingRange(
			VoidPtr buffer,
			long maxBufferCount,
			LongPtr usedBufferCount,
			long encoding,
			long options,
			@ByValue NSRange range,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange leftover);

	@Generated
	@Selector("getCString:")
	public native void getCString(BytePtr bytes);

	@Generated
	@Selector("getCString:maxLength:")
	public native void getCStringMaxLength(BytePtr bytes, long maxLength);

	@Generated
	@Selector("getCString:maxLength:encoding:")
	public native boolean getCStringMaxLengthEncoding(BytePtr buffer,
			long maxBufferCount, long encoding);

	@Generated
	@Selector("getCString:maxLength:range:remainingRange:")
	public native void getCStringMaxLengthRangeRemainingRange(
			BytePtr bytes,
			long maxLength,
			@ByValue NSRange aRange,
			@UncertainArgument("Options: reference, array Fallback: reference") NSRange leftoverRange);

	@Generated
	@Selector("getCharacters:")
	public native void getCharacters(CharPtr buffer);

	@Generated
	@Selector("getCharacters:range:")
	public native void getCharactersRange(CharPtr buffer,
			@ByValue NSRange aRange);

	@Generated
	@Selector("getFileSystemRepresentation:maxLength:")
	public native boolean getFileSystemRepresentationMaxLength(BytePtr cname,
			long max);

	@Generated
	@Selector("getLineStart:end:contentsEnd:forRange:")
	public native void getLineStartEndContentsEndForRange(LongPtr startPtr,
			LongPtr lineEndPtr, LongPtr contentsEndPtr, @ByValue NSRange range);

	@Generated
	@Selector("getParagraphStart:end:contentsEnd:forRange:")
	public native void getParagraphStartEndContentsEndForRange(
			LongPtr startPtr, LongPtr parEndPtr, LongPtr contentsEndPtr,
			@ByValue NSRange range);

	@Generated
	@Selector("hasPrefix:")
	public native boolean hasPrefix(String aString);

	@Generated
	@Selector("hasSuffix:")
	public native boolean hasSuffix(String aString);

	@Generated
	@Selector("hash")
	public native long hash();

	@Generated
	@Selector("init")
	public native NSString init();

	@Generated
	@Selector("initWithBytes:length:encoding:")
	public native NSString initWithBytesLengthEncoding(ConstVoidPtr bytes,
			long len, long encoding);

	@Generated
	@Selector("initWithBytesNoCopy:length:encoding:freeWhenDone:")
	public native NSString initWithBytesNoCopyLengthEncodingFreeWhenDone(
			VoidPtr bytes, long len, long encoding, boolean freeBuffer);

	@Generated
	@Selector("initWithCString:")
	public native NSString initWithCString(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String bytes);

	@Generated
	@Selector("initWithCString:encoding:")
	public native NSString initWithCStringEncoding(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String nullTerminatedCString,
			long encoding);

	@Generated
	@Selector("initWithCString:length:")
	public native NSString initWithCStringLength(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String bytes,
			long length);

	@Generated
	@Selector("initWithCStringNoCopy:length:freeWhenDone:")
	public native NSString initWithCStringNoCopyLengthFreeWhenDone(
			BytePtr bytes, long length, boolean freeBuffer);

	@Generated
	@Selector("initWithCharacters:length:")
	public native NSString initWithCharactersLength(ConstCharPtr characters,
			long length);

	@Generated
	@Selector("initWithCharactersNoCopy:length:freeWhenDone:")
	public native NSString initWithCharactersNoCopyLengthFreeWhenDone(
			CharPtr characters, long length, boolean freeBuffer);

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithContentsOfFile:")
	public native NSString initWithContentsOfFile(String path);

	@Generated
	@Selector("initWithContentsOfFile:encoding:error:")
	public native NSString initWithContentsOfFileEncodingError(String path,
			long enc, Ptr<NSError> error);

	@Generated
	@Selector("initWithContentsOfFile:usedEncoding:error:")
	public native NSString initWithContentsOfFileUsedEncodingError(String path,
			LongPtr enc, Ptr<NSError> error);

	@Generated
	@Selector("initWithContentsOfURL:")
	public native NSString initWithContentsOfURL(NSURL url);

	@Generated
	@Selector("initWithContentsOfURL:encoding:error:")
	public native NSString initWithContentsOfURLEncodingError(NSURL url,
			long enc, Ptr<NSError> error);

	@Generated
	@Selector("initWithContentsOfURL:usedEncoding:error:")
	public native NSString initWithContentsOfURLUsedEncodingError(NSURL url,
			LongPtr enc, Ptr<NSError> error);

	@Generated
	@Selector("initWithData:encoding:")
	public native NSString initWithDataEncoding(NSData data, long encoding);

	@Generated
	@Selector("initWithString:")
	public native NSString initWithString(String aString);

	@Generated
	@Selector("initWithUTF8String:")
	public native NSString initWithUTF8String(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String nullTerminatedCString);

	@Generated
	@Selector("intValue")
	public native int intValue();

	@Generated
	@Selector("integerValue")
	public native long integerValue();

	@Generated
	@Selector("isAbsolutePath")
	public native boolean isAbsolutePath();

	@Generated
	@Selector("isEqualToString:")
	public native boolean isEqualToString(String aString);

	@Generated
	@Selector("lastPathComponent")
	public native String lastPathComponent();

	@Generated
	@Selector("length")
	public native long length();

	@Generated
	@Selector("lengthOfBytesUsingEncoding:")
	public native long lengthOfBytesUsingEncoding(long enc);

	@Generated
	@Selector("lineRangeForRange:")
	@ByValue
	public native NSRange lineRangeForRange(@ByValue NSRange range);

	@Generated
	@Selector("linguisticTagsInRange:scheme:options:orthography:tokenRanges:")
	public native NSArray linguisticTagsInRangeSchemeOptionsOrthographyTokenRanges(
			@ByValue NSRange range, String tagScheme, long opts,
			NSOrthography orthography, Ptr<NSArray> tokenRanges);

	@Generated
	@Selector("localizedCaseInsensitiveCompare:")
	public native long localizedCaseInsensitiveCompare(String string);

	@Generated
	@Selector("localizedCompare:")
	public native long localizedCompare(String string);

	@Generated
	@Selector("localizedNameOfStringEncoding:")
	public static native String localizedNameOfStringEncoding(long encoding);

	@Generated
	@Selector("localizedStandardCompare:")
	public native long localizedStandardCompare(String string);

	@Generated
	@Selector("longLongValue")
	public native long longLongValue();

	@Generated
	@Selector("lossyCString")
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	@MappedReturn(CStringMapper.class)
	public native String lossyCString();

	@Generated
	@Selector("lowercaseString")
	public native String lowercaseString();

	@Generated
	@Selector("lowercaseStringWithLocale:")
	public native String lowercaseStringWithLocale(NSLocale locale);

	@Generated
	@Selector("maximumLengthOfBytesUsingEncoding:")
	public native long maximumLengthOfBytesUsingEncoding(long enc);

	@Generated
	@Selector("mutableCopyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object mutableCopyWithZone(VoidPtr zone);

	@Generated
	@Selector("paragraphRangeForRange:")
	@ByValue
	public native NSRange paragraphRangeForRange(@ByValue NSRange range);

	@Generated
	@Selector("pathComponents")
	public native NSArray pathComponents();

	@Generated
	@Selector("pathExtension")
	public native String pathExtension();

	@Generated
	@Selector("pathWithComponents:")
	public static native String pathWithComponents(NSArray components);

	@Generated
	@Selector("precomposedStringWithCanonicalMapping")
	public native String precomposedStringWithCanonicalMapping();

	@Generated
	@Selector("precomposedStringWithCompatibilityMapping")
	public native String precomposedStringWithCompatibilityMapping();

	@Generated
	@Selector("propertyList")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object propertyList();

	@Generated
	@Selector("propertyListFromStringsFileFormat")
	public native NSDictionary propertyListFromStringsFileFormat();

	@Generated
	@Selector("rangeOfCharacterFromSet:")
	@ByValue
	public native NSRange rangeOfCharacterFromSet(NSCharacterSet aSet);

	@Generated
	@Selector("rangeOfCharacterFromSet:options:")
	@ByValue
	public native NSRange rangeOfCharacterFromSetOptions(NSCharacterSet aSet,
			long mask);

	@Generated
	@Selector("rangeOfCharacterFromSet:options:range:")
	@ByValue
	public native NSRange rangeOfCharacterFromSetOptionsRange(
			NSCharacterSet aSet, long mask, @ByValue NSRange searchRange);

	@Generated
	@Selector("rangeOfComposedCharacterSequenceAtIndex:")
	@ByValue
	public native NSRange rangeOfComposedCharacterSequenceAtIndex(long index);

	@Generated
	@Selector("rangeOfComposedCharacterSequencesForRange:")
	@ByValue
	public native NSRange rangeOfComposedCharacterSequencesForRange(
			@ByValue NSRange range);

	@Generated
	@Selector("rangeOfString:")
	@ByValue
	public native NSRange rangeOfString(String aString);

	@Generated
	@Selector("rangeOfString:options:")
	@ByValue
	public native NSRange rangeOfStringOptions(String aString, long mask);

	@Generated
	@Selector("rangeOfString:options:range:")
	@ByValue
	public native NSRange rangeOfStringOptionsRange(String aString, long mask,
			@ByValue NSRange searchRange);

	@Generated
	@Selector("rangeOfString:options:range:locale:")
	@ByValue
	public native NSRange rangeOfStringOptionsRangeLocale(String aString,
			long mask, @ByValue NSRange searchRange, NSLocale locale);

	@Generated
	@Selector("smallestEncoding")
	public native long smallestEncoding();

	@Generated
	@Selector("string")
	public static native NSString string();

	@Generated
	@Selector("stringByAbbreviatingWithTildeInPath")
	public native String stringByAbbreviatingWithTildeInPath();

	@Generated
	@Selector("stringByAddingPercentEncodingWithAllowedCharacters:")
	public native String stringByAddingPercentEncodingWithAllowedCharacters(
			NSCharacterSet allowedCharacters);

	@Generated
	@Selector("stringByAddingPercentEscapesUsingEncoding:")
	public native String stringByAddingPercentEscapesUsingEncoding(long enc);

	@Generated
	@Selector("stringByAppendingPathComponent:")
	public native String stringByAppendingPathComponent(String str);

	@Generated
	@Selector("stringByAppendingPathExtension:")
	public native String stringByAppendingPathExtension(String str);

	@Generated
	@Selector("stringByAppendingString:")
	public native String stringByAppendingString(String aString);

	@Generated
	@Selector("stringByDeletingLastPathComponent")
	public native String stringByDeletingLastPathComponent();

	@Generated
	@Selector("stringByDeletingPathExtension")
	public native String stringByDeletingPathExtension();

	@Generated
	@Selector("stringByExpandingTildeInPath")
	public native String stringByExpandingTildeInPath();

	@Generated
	@Selector("stringByFoldingWithOptions:locale:")
	public native String stringByFoldingWithOptionsLocale(long options,
			NSLocale locale);

	@Generated
	@Selector("stringByPaddingToLength:withString:startingAtIndex:")
	public native String stringByPaddingToLengthWithStringStartingAtIndex(
			long newLength, String padString, long padIndex);

	@Generated
	@Selector("stringByRemovingPercentEncoding")
	public native String stringByRemovingPercentEncoding();

	@Generated
	@Selector("stringByReplacingCharactersInRange:withString:")
	public native String stringByReplacingCharactersInRangeWithString(
			@ByValue NSRange range, String replacement);

	@Generated
	@Selector("stringByReplacingOccurrencesOfString:withString:")
	public native String stringByReplacingOccurrencesOfStringWithString(
			String target, String replacement);

	@Generated
	@Selector("stringByReplacingOccurrencesOfString:withString:options:range:")
	public native String stringByReplacingOccurrencesOfStringWithStringOptionsRange(
			String target, String replacement, long options,
			@ByValue NSRange searchRange);

	@Generated
	@Selector("stringByReplacingPercentEscapesUsingEncoding:")
	public native String stringByReplacingPercentEscapesUsingEncoding(long enc);

	@Generated
	@Selector("stringByResolvingSymlinksInPath")
	public native String stringByResolvingSymlinksInPath();

	@Generated
	@Selector("stringByStandardizingPath")
	public native String stringByStandardizingPath();

	@Generated
	@Selector("stringByTrimmingCharactersInSet:")
	public native String stringByTrimmingCharactersInSet(NSCharacterSet set);

	@Generated
	@Selector("stringWithCString:")
	public static native NSString stringWithCString(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String bytes);

	@Generated
	@Selector("stringWithCString:encoding:")
	public static native NSString stringWithCStringEncoding(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String cString,
			long enc);

	@Generated
	@Selector("stringWithCString:length:")
	public static native NSString stringWithCStringLength(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String bytes,
			long length);

	@Generated
	@Selector("stringWithCharacters:length:")
	public static native NSString stringWithCharactersLength(
			ConstCharPtr characters, long length);

	@Generated
	@Selector("stringWithContentsOfFile:")
	public static native NSString stringWithContentsOfFile(String path);

	@Generated
	@Selector("stringWithContentsOfFile:encoding:error:")
	public static native NSString stringWithContentsOfFileEncodingError(
			String path, long enc, Ptr<NSError> error);

	@Generated
	@Selector("stringWithContentsOfFile:usedEncoding:error:")
	public static native NSString stringWithContentsOfFileUsedEncodingError(
			String path, LongPtr enc, Ptr<NSError> error);

	@Generated
	@Selector("stringWithContentsOfURL:")
	public static native NSString stringWithContentsOfURL(NSURL url);

	@Generated
	@Selector("stringWithContentsOfURL:encoding:error:")
	public static native NSString stringWithContentsOfURLEncodingError(
			NSURL url, long enc, Ptr<NSError> error);

	@Generated
	@Selector("stringWithContentsOfURL:usedEncoding:error:")
	public static native NSString stringWithContentsOfURLUsedEncodingError(
			NSURL url, LongPtr enc, Ptr<NSError> error);

	@Generated
	@Selector("stringWithString:")
	public static native NSString stringWithString(String string);

	@Generated
	@Selector("stringWithUTF8String:")
	public static native NSString stringWithUTF8String(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String nullTerminatedCString);

	@Generated
	@Selector("stringsByAppendingPaths:")
	public native NSArray stringsByAppendingPaths(NSArray paths);

	@Generated
	@Selector("substringFromIndex:")
	public native String substringFromIndex(long from);

	@Generated
	@Selector("substringToIndex:")
	public native String substringToIndex(long to);

	@Generated
	@Selector("substringWithRange:")
	public native String substringWithRange(@ByValue NSRange range);

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	@Generated
	@Selector("uppercaseString")
	public native String uppercaseString();

	@Generated
	@Selector("uppercaseStringWithLocale:")
	public native String uppercaseStringWithLocale(NSLocale locale);

	@Generated
	@Selector("writeToFile:atomically:")
	public native boolean writeToFileAtomically(String path,
			boolean useAuxiliaryFile);

	@Generated
	@Selector("writeToFile:atomically:encoding:error:")
	public native boolean writeToFileAtomicallyEncodingError(String path,
			boolean useAuxiliaryFile, long enc, Ptr<NSError> error);

	@Generated
	@Selector("writeToURL:atomically:")
	public native boolean writeToURLAtomically(NSURL url, boolean atomically);

	@Generated
	@Selector("writeToURL:atomically:encoding:error:")
	public native boolean writeToURLAtomicallyEncodingError(NSURL url,
			boolean useAuxiliaryFile, long enc, Ptr<NSError> error);

	@Generated
	@Selector("boundingRectWithSize:options:attributes:")
	@ByValue
	public native CGRect boundingRectWithSizeOptionsAttributes(
			@ByValue CGSize size, long options, NSDictionary attributes);

	@Generated
	@Selector("drawAtPoint:withAttributes:")
	public native void drawAtPointWithAttributes(@ByValue CGPoint point,
			NSDictionary attrs);

	@Generated
	@Selector("drawInRect:withAttributes:")
	public native void drawInRectWithAttributes(@ByValue CGRect rect,
			NSDictionary attrs);

	@Generated
	@Selector("drawWithRect:options:attributes:")
	public native void drawWithRectOptionsAttributes(@ByValue CGRect rect,
			long options, NSDictionary attributes);

	@Generated
	@IsOptional
	@Selector("initWithPasteboardPropertyList:ofType:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithPasteboardPropertyListOfType(
			@Mapped(ObjCObjectMapper.class) Object propertyList, String type);

	@Generated
	@Selector("pasteboardPropertyListForType:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object pasteboardPropertyListForType(String type);

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
	@Selector("sizeWithAttributes:")
	@ByValue
	public native CGSize sizeWithAttributes(NSDictionary attrs);

	@Generated
	@Selector("writableTypesForPasteboard:")
	public native NSArray writableTypesForPasteboard(NSPasteboard pasteboard);

	@Generated
	@IsOptional
	@Selector("writingOptionsForType:pasteboard:")
	public native long writingOptionsForTypePasteboard(String type,
			NSPasteboard pasteboard);
}
