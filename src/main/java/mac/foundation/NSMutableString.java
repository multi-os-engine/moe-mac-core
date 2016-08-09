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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import mac.foundation.struct.NSRange;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMutableString extends NSString {
	static {
		NatJ.register();
	}

	@Generated
	protected NSMutableString(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSMutableString alloc();

	@Generated
	@Selector("appendString:")
	public native void appendString(String aString);

	@Generated
	@Selector("deleteCharactersInRange:")
	public native void deleteCharactersInRange(@ByValue NSRange range);

	@Generated
	@Selector("init")
	public native NSMutableString init();

	@Generated
	@Selector("initWithBytes:length:encoding:")
	public native NSMutableString initWithBytesLengthEncoding(
			ConstVoidPtr bytes, long len, long encoding);

	@Generated
	@Selector("initWithBytesNoCopy:length:encoding:freeWhenDone:")
	public native NSMutableString initWithBytesNoCopyLengthEncodingFreeWhenDone(
			VoidPtr bytes, long len, long encoding, boolean freeBuffer);

	@Generated
	@Selector("initWithCString:")
	public native NSMutableString initWithCString(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String bytes);

	@Generated
	@Selector("initWithCString:encoding:")
	public native NSMutableString initWithCStringEncoding(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String nullTerminatedCString,
			long encoding);

	@Generated
	@Selector("initWithCString:length:")
	public native NSMutableString initWithCStringLength(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String bytes,
			long length);

	@Generated
	@Selector("initWithCStringNoCopy:length:freeWhenDone:")
	public native NSMutableString initWithCStringNoCopyLengthFreeWhenDone(
			BytePtr bytes, long length, boolean freeBuffer);

	@Generated
	@Selector("initWithCapacity:")
	public native NSMutableString initWithCapacity(long capacity);

	@Generated
	@Selector("initWithCharacters:length:")
	public native NSMutableString initWithCharactersLength(
			ConstCharPtr characters, long length);

	@Generated
	@Selector("initWithCharactersNoCopy:length:freeWhenDone:")
	public native NSMutableString initWithCharactersNoCopyLengthFreeWhenDone(
			CharPtr characters, long length, boolean freeBuffer);

	@Generated
	@Selector("initWithContentsOfFile:")
	public native NSMutableString initWithContentsOfFile(String path);

	@Generated
	@Selector("initWithContentsOfFile:encoding:error:")
	public native NSMutableString initWithContentsOfFileEncodingError(
			String path, long enc, Ptr<NSError> error);

	@Generated
	@Selector("initWithContentsOfFile:usedEncoding:error:")
	public native NSMutableString initWithContentsOfFileUsedEncodingError(
			String path, LongPtr enc, Ptr<NSError> error);

	@Generated
	@Selector("initWithContentsOfURL:")
	public native NSMutableString initWithContentsOfURL(NSURL url);

	@Generated
	@Selector("initWithContentsOfURL:encoding:error:")
	public native NSMutableString initWithContentsOfURLEncodingError(NSURL url,
			long enc, Ptr<NSError> error);

	@Generated
	@Selector("initWithContentsOfURL:usedEncoding:error:")
	public native NSMutableString initWithContentsOfURLUsedEncodingError(
			NSURL url, LongPtr enc, Ptr<NSError> error);

	@Generated
	@Selector("initWithData:encoding:")
	public native NSMutableString initWithDataEncoding(NSData data,
			long encoding);

	@Generated
	@Selector("initWithString:")
	public native NSMutableString initWithString(String aString);

	@Generated
	@Selector("initWithUTF8String:")
	public native NSMutableString initWithUTF8String(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String nullTerminatedCString);

	@Generated
	@Selector("insertString:atIndex:")
	public native void insertStringAtIndex(String aString, long loc);

	@Generated
	@Selector("replaceCharactersInRange:withString:")
	public native void replaceCharactersInRangeWithString(
			@ByValue NSRange range, String aString);

	@Generated
	@Selector("replaceOccurrencesOfString:withString:options:range:")
	public native long replaceOccurrencesOfStringWithStringOptionsRange(
			String target, String replacement, long options,
			@ByValue NSRange searchRange);

	@Generated
	@Selector("setString:")
	public native void setString(String aString);

	@Generated
	@Selector("string")
	public static native NSMutableString string();

	@Generated
	@Selector("stringWithCString:")
	public static native NSMutableString stringWithCString(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String bytes);

	@Generated
	@Selector("stringWithCString:encoding:")
	public static native NSMutableString stringWithCStringEncoding(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String cString,
			long enc);

	@Generated
	@Selector("stringWithCString:length:")
	public static native NSMutableString stringWithCStringLength(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String bytes,
			long length);

	@Generated
	@Selector("stringWithCapacity:")
	public static native NSMutableString stringWithCapacity(long capacity);

	@Generated
	@Selector("stringWithCharacters:length:")
	public static native NSMutableString stringWithCharactersLength(
			ConstCharPtr characters, long length);

	@Generated
	@Selector("stringWithContentsOfFile:")
	public static native NSMutableString stringWithContentsOfFile(String path);

	@Generated
	@Selector("stringWithContentsOfFile:encoding:error:")
	public static native NSMutableString stringWithContentsOfFileEncodingError(
			String path, long enc, Ptr<NSError> error);

	@Generated
	@Selector("stringWithContentsOfFile:usedEncoding:error:")
	public static native NSMutableString stringWithContentsOfFileUsedEncodingError(
			String path, LongPtr enc, Ptr<NSError> error);

	@Generated
	@Selector("stringWithContentsOfURL:")
	public static native NSMutableString stringWithContentsOfURL(NSURL url);

	@Generated
	@Selector("stringWithContentsOfURL:encoding:error:")
	public static native NSMutableString stringWithContentsOfURLEncodingError(
			NSURL url, long enc, Ptr<NSError> error);

	@Generated
	@Selector("stringWithContentsOfURL:usedEncoding:error:")
	public static native NSMutableString stringWithContentsOfURLUsedEncodingError(
			NSURL url, LongPtr enc, Ptr<NSError> error);

	@Generated
	@Selector("stringWithString:")
	public static native NSMutableString stringWithString(String string);

	@Generated
	@Selector("stringWithUTF8String:")
	public static native NSMutableString stringWithUTF8String(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String nullTerminatedCString);
}
