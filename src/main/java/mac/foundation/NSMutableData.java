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
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import mac.foundation.struct.NSRange;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMutableData extends NSData {
	static {
		NatJ.register();
	}

	@Generated
	protected NSMutableData(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSMutableData alloc();

	@Generated
	@Selector("appendBytes:length:")
	public native void appendBytesLength(ConstVoidPtr bytes, long length);

	@Generated
	@Selector("appendData:")
	public native void appendData(NSData other);

	@Generated
	@Selector("data")
	public static native NSMutableData data();

	@Generated
	@Selector("dataWithBytes:length:")
	public static native NSMutableData dataWithBytesLength(ConstVoidPtr bytes,
			long length);

	@Generated
	@Selector("dataWithBytesNoCopy:length:")
	public static native NSMutableData dataWithBytesNoCopyLength(VoidPtr bytes,
			long length);

	@Generated
	@Selector("dataWithBytesNoCopy:length:freeWhenDone:")
	public static native NSMutableData dataWithBytesNoCopyLengthFreeWhenDone(
			VoidPtr bytes, long length, boolean b);

	@Generated
	@Selector("dataWithCapacity:")
	public static native NSMutableData dataWithCapacity(long aNumItems);

	@Generated
	@Selector("dataWithContentsOfFile:")
	public static native NSMutableData dataWithContentsOfFile(String path);

	@Generated
	@Selector("dataWithContentsOfFile:options:error:")
	public static native NSMutableData dataWithContentsOfFileOptionsError(
			String path, long readOptionsMask, Ptr<NSError> errorPtr);

	@Generated
	@Selector("dataWithContentsOfMappedFile:")
	public static native NSMutableData dataWithContentsOfMappedFile(String path);

	@Generated
	@Selector("dataWithContentsOfURL:")
	public static native NSMutableData dataWithContentsOfURL(NSURL url);

	@Generated
	@Selector("dataWithContentsOfURL:options:error:")
	public static native NSMutableData dataWithContentsOfURLOptionsError(
			NSURL url, long readOptionsMask, Ptr<NSError> errorPtr);

	@Generated
	@Selector("dataWithData:")
	public static native NSMutableData dataWithData(NSData data);

	@Generated
	@Selector("dataWithLength:")
	public static native NSMutableData dataWithLength(long length);

	@Generated
	@Selector("increaseLengthBy:")
	public native void increaseLengthBy(long extraLength);

	@Generated
	@Selector("init")
	public native NSMutableData init();

	@Generated
	@Selector("initWithBase64EncodedData:options:")
	public native NSMutableData initWithBase64EncodedDataOptions(
			NSData base64Data, long options);

	@Generated
	@Selector("initWithBase64EncodedString:options:")
	public native NSMutableData initWithBase64EncodedStringOptions(
			String base64String, long options);

	@Generated
	@Selector("initWithBase64Encoding:")
	public native NSMutableData initWithBase64Encoding(String base64String);

	@Generated
	@Selector("initWithBytes:length:")
	public native NSMutableData initWithBytesLength(ConstVoidPtr bytes,
			long length);

	@Generated
	@Selector("initWithBytesNoCopy:length:")
	public native NSMutableData initWithBytesNoCopyLength(VoidPtr bytes,
			long length);

	@Generated
	@Selector("initWithBytesNoCopy:length:deallocator:")
	public native NSMutableData initWithBytesNoCopyLengthDeallocator(
			VoidPtr bytes,
			long length,
			@ObjCBlock(name = "call_initWithBytesNoCopyLengthDeallocator") NSData.Block_initWithBytesNoCopyLengthDeallocator deallocator);

	@Generated
	@Selector("initWithBytesNoCopy:length:freeWhenDone:")
	public native NSMutableData initWithBytesNoCopyLengthFreeWhenDone(
			VoidPtr bytes, long length, boolean b);

	@Generated
	@Selector("initWithCapacity:")
	public native NSMutableData initWithCapacity(long capacity);

	@Generated
	@Selector("initWithContentsOfFile:")
	public native NSMutableData initWithContentsOfFile(String path);

	@Generated
	@Selector("initWithContentsOfFile:options:error:")
	public native NSMutableData initWithContentsOfFileOptionsError(String path,
			long readOptionsMask, Ptr<NSError> errorPtr);

	@Generated
	@Selector("initWithContentsOfMappedFile:")
	public native NSMutableData initWithContentsOfMappedFile(String path);

	@Generated
	@Selector("initWithContentsOfURL:")
	public native NSMutableData initWithContentsOfURL(NSURL url);

	@Generated
	@Selector("initWithContentsOfURL:options:error:")
	public native NSMutableData initWithContentsOfURLOptionsError(NSURL url,
			long readOptionsMask, Ptr<NSError> errorPtr);

	@Generated
	@Selector("initWithData:")
	public native NSMutableData initWithData(NSData data);

	@Generated
	@Selector("initWithLength:")
	public native NSMutableData initWithLength(long length);

	@Generated
	@Selector("mutableBytes")
	public native VoidPtr mutableBytes();

	@Generated
	@Selector("replaceBytesInRange:withBytes:")
	public native void replaceBytesInRangeWithBytes(@ByValue NSRange range,
			ConstVoidPtr bytes);

	@Generated
	@Selector("replaceBytesInRange:withBytes:length:")
	public native void replaceBytesInRangeWithBytesLength(
			@ByValue NSRange range, ConstVoidPtr replacementBytes,
			long replacementLength);

	@Generated
	@Selector("resetBytesInRange:")
	public native void resetBytesInRange(@ByValue NSRange range);

	@Generated
	@Selector("setData:")
	public native void setData(NSData data);

	@Generated
	@Selector("setLength:")
	public native void setLength(long length);
}
