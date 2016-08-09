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
import mac.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSStream extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSStream(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSStream alloc();

	@Generated
	@Selector("close")
	public native void close();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("getStreamsToHost:port:inputStream:outputStream:")
	public static native void getStreamsToHostPortInputStreamOutputStream(
			NSHost host, long port, Ptr<NSInputStream> inputStream,
			Ptr<NSOutputStream> outputStream);

	@Generated
	@Selector("init")
	public native NSStream init();

	@Generated
	@Selector("open")
	public native void open();

	@Generated
	@Selector("propertyForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object propertyForKey(String key);

	@Generated
	@Selector("removeFromRunLoop:forMode:")
	public native void removeFromRunLoopForMode(NSRunLoop aRunLoop, String mode);

	@Generated
	@Selector("scheduleInRunLoop:forMode:")
	public native void scheduleInRunLoopForMode(NSRunLoop aRunLoop, String mode);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object delegate);

	@Generated
	@Selector("setProperty:forKey:")
	public native boolean setPropertyForKey(
			@Mapped(ObjCObjectMapper.class) Object property, String key);

	@Generated
	@Selector("streamError")
	public native NSError streamError();

	@Generated
	@Selector("streamStatus")
	public native long streamStatus();
}
