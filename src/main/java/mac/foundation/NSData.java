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
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.protocol.NSCopying;
import mac.foundation.protocol.NSMutableCopying;
import mac.foundation.protocol.NSSecureCoding;
import mac.foundation.struct.NSRange;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSData extends NSObject implements NSCopying, NSMutableCopying,
		NSSecureCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSData(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSData alloc();

	@Generated
	@Selector("base64EncodedDataWithOptions:")
	public native NSData base64EncodedDataWithOptions(long options);

	@Generated
	@Selector("base64EncodedStringWithOptions:")
	public native String base64EncodedStringWithOptions(long options);

	@Generated
	@Selector("base64Encoding")
	public native String base64Encoding();

	@Generated
	@Selector("bytes")
	public native ConstVoidPtr bytes();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("data")
	public static native NSData data();

	@Generated
	@Selector("dataWithBytes:length:")
	public static native NSData dataWithBytesLength(ConstVoidPtr bytes,
			long length);

	@Generated
	@Selector("dataWithBytesNoCopy:length:")
	public static native NSData dataWithBytesNoCopyLength(VoidPtr bytes,
			long length);

	@Generated
	@Selector("dataWithBytesNoCopy:length:freeWhenDone:")
	public static native NSData dataWithBytesNoCopyLengthFreeWhenDone(
			VoidPtr bytes, long length, boolean b);

	@Generated
	@Selector("dataWithContentsOfFile:")
	public static native NSData dataWithContentsOfFile(String path);

	@Generated
	@Selector("dataWithContentsOfFile:options:error:")
	public static native NSData dataWithContentsOfFileOptionsError(String path,
			long readOptionsMask, Ptr<NSError> errorPtr);

	@Generated
	@Selector("dataWithContentsOfMappedFile:")
	public static native NSData dataWithContentsOfMappedFile(String path);

	@Generated
	@Selector("dataWithContentsOfURL:")
	public static native NSData dataWithContentsOfURL(NSURL url);

	@Generated
	@Selector("dataWithContentsOfURL:options:error:")
	public static native NSData dataWithContentsOfURLOptionsError(NSURL url,
			long readOptionsMask, Ptr<NSError> errorPtr);

	@Generated
	@Selector("dataWithData:")
	public static native NSData dataWithData(NSData data);

	@Generated
	@Selector("description")
	public native String description();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("enumerateByteRangesUsingBlock:")
	public native void enumerateByteRangesUsingBlock(
			@ObjCBlock(name = "call_enumerateByteRangesUsingBlock") Block_enumerateByteRangesUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_enumerateByteRangesUsingBlock {
		@Generated
		public void call_enumerateByteRangesUsingBlock(ConstVoidPtr arg0,
				@ByValue NSRange arg1, BoolPtr arg2);
	}

	@Generated
	@Selector("getBytes:")
	public native void getBytes(VoidPtr buffer);

	@Generated
	@Selector("getBytes:length:")
	public native void getBytesLength(VoidPtr buffer, long length);

	@Generated
	@Selector("getBytes:range:")
	public native void getBytesRange(VoidPtr buffer, @ByValue NSRange range);

	@Generated
	@Selector("init")
	public native NSData init();

	@Generated
	@Selector("initWithBase64EncodedData:options:")
	public native NSData initWithBase64EncodedDataOptions(NSData base64Data,
			long options);

	@Generated
	@Selector("initWithBase64EncodedString:options:")
	public native NSData initWithBase64EncodedStringOptions(
			String base64String, long options);

	@Generated
	@Selector("initWithBase64Encoding:")
	public native NSData initWithBase64Encoding(String base64String);

	@Generated
	@Selector("initWithBytes:length:")
	public native NSData initWithBytesLength(ConstVoidPtr bytes, long length);

	@Generated
	@Selector("initWithBytesNoCopy:length:")
	public native NSData initWithBytesNoCopyLength(VoidPtr bytes, long length);

	@Generated
	@Selector("initWithBytesNoCopy:length:deallocator:")
	public native NSData initWithBytesNoCopyLengthDeallocator(
			VoidPtr bytes,
			long length,
			@ObjCBlock(name = "call_initWithBytesNoCopyLengthDeallocator") Block_initWithBytesNoCopyLengthDeallocator deallocator);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_initWithBytesNoCopyLengthDeallocator {
		@Generated
		public void call_initWithBytesNoCopyLengthDeallocator(VoidPtr arg0,
				long arg1);
	}

	@Generated
	@Selector("initWithBytesNoCopy:length:freeWhenDone:")
	public native NSData initWithBytesNoCopyLengthFreeWhenDone(VoidPtr bytes,
			long length, boolean b);

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithContentsOfFile:")
	public native NSData initWithContentsOfFile(String path);

	@Generated
	@Selector("initWithContentsOfFile:options:error:")
	public native NSData initWithContentsOfFileOptionsError(String path,
			long readOptionsMask, Ptr<NSError> errorPtr);

	@Generated
	@Selector("initWithContentsOfMappedFile:")
	public native NSData initWithContentsOfMappedFile(String path);

	@Generated
	@Selector("initWithContentsOfURL:")
	public native NSData initWithContentsOfURL(NSURL url);

	@Generated
	@Selector("initWithContentsOfURL:options:error:")
	public native NSData initWithContentsOfURLOptionsError(NSURL url,
			long readOptionsMask, Ptr<NSError> errorPtr);

	@Generated
	@Selector("initWithData:")
	public native NSData initWithData(NSData data);

	@Generated
	@Selector("isEqualToData:")
	public native boolean isEqualToData(NSData other);

	@Generated
	@Selector("length")
	public native long length();

	@Generated
	@Selector("mutableCopyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object mutableCopyWithZone(VoidPtr zone);

	@Generated
	@Selector("rangeOfData:options:range:")
	@ByValue
	public native NSRange rangeOfDataOptionsRange(NSData dataToFind, long mask,
			@ByValue NSRange searchRange);

	@Generated
	@Selector("subdataWithRange:")
	public native NSData subdataWithRange(@ByValue NSRange range);

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	@Generated
	@Selector("writeToFile:atomically:")
	public native boolean writeToFileAtomically(String path,
			boolean useAuxiliaryFile);

	@Generated
	@Selector("writeToFile:options:error:")
	public native boolean writeToFileOptionsError(String path,
			long writeOptionsMask, Ptr<NSError> errorPtr);

	@Generated
	@Selector("writeToURL:atomically:")
	public native boolean writeToURLAtomically(NSURL url, boolean atomically);

	@Generated
	@Selector("writeToURL:options:error:")
	public native boolean writeToURLOptionsError(NSURL url,
			long writeOptionsMask, Ptr<NSError> errorPtr);
}
