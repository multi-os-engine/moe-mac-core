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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import mac.foundation.protocol.NSDiscardableContent;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPurgeableData extends NSMutableData implements
		NSDiscardableContent {
	static {
		NatJ.register();
	}

	@Generated
	protected NSPurgeableData(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSPurgeableData alloc();

	@Generated
	@Selector("beginContentAccess")
	public native boolean beginContentAccess();

	@Generated
	@Selector("data")
	public static native NSPurgeableData data();

	@Generated
	@Selector("dataWithBytes:length:")
	public static native NSPurgeableData dataWithBytesLength(
			ConstVoidPtr bytes, long length);

	@Generated
	@Selector("dataWithBytesNoCopy:length:")
	public static native NSPurgeableData dataWithBytesNoCopyLength(
			VoidPtr bytes, long length);

	@Generated
	@Selector("dataWithBytesNoCopy:length:freeWhenDone:")
	public static native NSPurgeableData dataWithBytesNoCopyLengthFreeWhenDone(
			VoidPtr bytes, long length, boolean b);

	@Generated
	@Selector("dataWithCapacity:")
	public static native NSPurgeableData dataWithCapacity(long aNumItems);

	@Generated
	@Selector("dataWithContentsOfFile:")
	public static native NSPurgeableData dataWithContentsOfFile(String path);

	@Generated
	@Selector("dataWithContentsOfFile:options:error:")
	public static native NSPurgeableData dataWithContentsOfFileOptionsError(
			String path, long readOptionsMask, Ptr<NSError> errorPtr);

	@Generated
	@Selector("dataWithContentsOfMappedFile:")
	public static native NSPurgeableData dataWithContentsOfMappedFile(
			String path);

	@Generated
	@Selector("dataWithContentsOfURL:")
	public static native NSPurgeableData dataWithContentsOfURL(NSURL url);

	@Generated
	@Selector("dataWithContentsOfURL:options:error:")
	public static native NSPurgeableData dataWithContentsOfURLOptionsError(
			NSURL url, long readOptionsMask, Ptr<NSError> errorPtr);

	@Generated
	@Selector("dataWithData:")
	public static native NSPurgeableData dataWithData(NSData data);

	@Generated
	@Selector("dataWithLength:")
	public static native NSPurgeableData dataWithLength(long length);

	@Generated
	@Selector("discardContentIfPossible")
	public native void discardContentIfPossible();

	@Generated
	@Selector("endContentAccess")
	public native void endContentAccess();

	@Generated
	@Selector("init")
	public native NSPurgeableData init();

	@Generated
	@Selector("initWithBase64EncodedData:options:")
	public native NSPurgeableData initWithBase64EncodedDataOptions(
			NSData base64Data, long options);

	@Generated
	@Selector("initWithBase64EncodedString:options:")
	public native NSPurgeableData initWithBase64EncodedStringOptions(
			String base64String, long options);

	@Generated
	@Selector("initWithBase64Encoding:")
	public native NSPurgeableData initWithBase64Encoding(String base64String);

	@Generated
	@Selector("initWithBytes:length:")
	public native NSPurgeableData initWithBytesLength(ConstVoidPtr bytes,
			long length);

	@Generated
	@Selector("initWithBytesNoCopy:length:")
	public native NSPurgeableData initWithBytesNoCopyLength(VoidPtr bytes,
			long length);

	@Generated
	@Selector("initWithBytesNoCopy:length:deallocator:")
	public native NSPurgeableData initWithBytesNoCopyLengthDeallocator(
			VoidPtr bytes,
			long length,
			@ObjCBlock(name = "call_initWithBytesNoCopyLengthDeallocator") NSData.Block_initWithBytesNoCopyLengthDeallocator deallocator);

	@Generated
	@Selector("initWithBytesNoCopy:length:freeWhenDone:")
	public native NSPurgeableData initWithBytesNoCopyLengthFreeWhenDone(
			VoidPtr bytes, long length, boolean b);

	@Generated
	@Selector("initWithCapacity:")
	public native NSPurgeableData initWithCapacity(long capacity);

	@Generated
	@Selector("initWithContentsOfFile:")
	public native NSPurgeableData initWithContentsOfFile(String path);

	@Generated
	@Selector("initWithContentsOfFile:options:error:")
	public native NSPurgeableData initWithContentsOfFileOptionsError(
			String path, long readOptionsMask, Ptr<NSError> errorPtr);

	@Generated
	@Selector("initWithContentsOfMappedFile:")
	public native NSPurgeableData initWithContentsOfMappedFile(String path);

	@Generated
	@Selector("initWithContentsOfURL:")
	public native NSPurgeableData initWithContentsOfURL(NSURL url);

	@Generated
	@Selector("initWithContentsOfURL:options:error:")
	public native NSPurgeableData initWithContentsOfURLOptionsError(NSURL url,
			long readOptionsMask, Ptr<NSError> errorPtr);

	@Generated
	@Selector("initWithData:")
	public native NSPurgeableData initWithData(NSData data);

	@Generated
	@Selector("initWithLength:")
	public native NSPurgeableData initWithLength(long length);

	@Generated
	@Selector("isContentDiscarded")
	public native boolean isContentDiscarded();
}
