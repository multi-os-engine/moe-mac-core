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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.protocol.NSSecureCoding;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSFileHandle extends NSObject implements NSSecureCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSFileHandle(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("acceptConnectionInBackgroundAndNotify")
	public native void acceptConnectionInBackgroundAndNotify();

	@Generated
	@Selector("acceptConnectionInBackgroundAndNotifyForModes:")
	public native void acceptConnectionInBackgroundAndNotifyForModes(
			NSArray modes);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSFileHandle alloc();

	@Generated
	@Selector("availableData")
	public native NSData availableData();

	@Generated
	@Selector("closeFile")
	public native void closeFile();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("fileDescriptor")
	public native int fileDescriptor();

	@Generated
	@Selector("fileHandleForReadingAtPath:")
	public static native NSFileHandle fileHandleForReadingAtPath(String path);

	@Generated
	@Selector("fileHandleForReadingFromURL:error:")
	public static native NSFileHandle fileHandleForReadingFromURLError(
			NSURL url, Ptr<NSError> error);

	@Generated
	@Selector("fileHandleForUpdatingAtPath:")
	public static native NSFileHandle fileHandleForUpdatingAtPath(String path);

	@Generated
	@Selector("fileHandleForUpdatingURL:error:")
	public static native NSFileHandle fileHandleForUpdatingURLError(NSURL url,
			Ptr<NSError> error);

	@Generated
	@Selector("fileHandleForWritingAtPath:")
	public static native NSFileHandle fileHandleForWritingAtPath(String path);

	@Generated
	@Selector("fileHandleForWritingToURL:error:")
	public static native NSFileHandle fileHandleForWritingToURLError(NSURL url,
			Ptr<NSError> error);

	@Generated
	@Selector("fileHandleWithNullDevice")
	public static native NSFileHandle fileHandleWithNullDevice();

	@Generated
	@Selector("fileHandleWithStandardError")
	public static native NSFileHandle fileHandleWithStandardError();

	@Generated
	@Selector("fileHandleWithStandardInput")
	public static native NSFileHandle fileHandleWithStandardInput();

	@Generated
	@Selector("fileHandleWithStandardOutput")
	public static native NSFileHandle fileHandleWithStandardOutput();

	@Generated
	@Selector("init")
	public native NSFileHandle init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithFileDescriptor:")
	public native NSFileHandle initWithFileDescriptor(int fd);

	@Generated
	@Selector("initWithFileDescriptor:closeOnDealloc:")
	public native NSFileHandle initWithFileDescriptorCloseOnDealloc(int fd,
			boolean closeopt);

	@Generated
	@Selector("offsetInFile")
	public native long offsetInFile();

	@Generated
	@Selector("readDataOfLength:")
	public native NSData readDataOfLength(long length);

	@Generated
	@Selector("readDataToEndOfFile")
	public native NSData readDataToEndOfFile();

	@Generated
	@Selector("readInBackgroundAndNotify")
	public native void readInBackgroundAndNotify();

	@Generated
	@Selector("readInBackgroundAndNotifyForModes:")
	public native void readInBackgroundAndNotifyForModes(NSArray modes);

	@Generated
	@Selector("readToEndOfFileInBackgroundAndNotify")
	public native void readToEndOfFileInBackgroundAndNotify();

	@Generated
	@Selector("readToEndOfFileInBackgroundAndNotifyForModes:")
	public native void readToEndOfFileInBackgroundAndNotifyForModes(
			NSArray modes);

	@Generated
	@Selector("seekToEndOfFile")
	public native long seekToEndOfFile();

	@Generated
	@Selector("seekToFileOffset:")
	public native void seekToFileOffset(long offset);

	@Generated
	@Selector("setReadabilityHandler:")
	public native void setReadabilityHandler(
			@ObjCBlock(name = "call_setReadabilityHandler") Block_setReadabilityHandler value);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_setReadabilityHandler {
		@Generated
		public void call_setReadabilityHandler(NSFileHandle arg0);
	}

	@Generated
	@Selector("setWriteabilityHandler:")
	public native void setWriteabilityHandler(
			@ObjCBlock(name = "call_setWriteabilityHandler") Block_setWriteabilityHandler value);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_setWriteabilityHandler {
		@Generated
		public void call_setWriteabilityHandler(NSFileHandle arg0);
	}

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	@Generated
	@Selector("synchronizeFile")
	public native void synchronizeFile();

	@Generated
	@Selector("truncateFileAtOffset:")
	public native void truncateFileAtOffset(long offset);

	@Generated
	@Selector("waitForDataInBackgroundAndNotify")
	public native void waitForDataInBackgroundAndNotify();

	@Generated
	@Selector("waitForDataInBackgroundAndNotifyForModes:")
	public native void waitForDataInBackgroundAndNotifyForModes(NSArray modes);

	@Generated
	@Selector("writeData:")
	public native void writeData(NSData data);
}
