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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPort extends NSObject implements NSCopying, NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSPort(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addConnection:toRunLoop:forMode:")
	public native void addConnectionToRunLoopForMode(NSConnection conn,
			NSRunLoop runLoop, String mode);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSPort alloc();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("init")
	public native NSPort init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("invalidate")
	public native void invalidate();

	@Generated
	@Selector("isValid")
	public native boolean isValid();

	@Generated
	@Selector("port")
	public static native NSPort port();

	@Generated
	@Selector("removeConnection:fromRunLoop:forMode:")
	public native void removeConnectionFromRunLoopForMode(NSConnection conn,
			NSRunLoop runLoop, String mode);

	@Generated
	@Selector("removeFromRunLoop:forMode:")
	public native void removeFromRunLoopForMode(NSRunLoop runLoop, String mode);

	@Generated
	@Selector("reservedSpaceLength")
	public native long reservedSpaceLength();

	@Generated
	@Selector("scheduleInRunLoop:forMode:")
	public native void scheduleInRunLoopForMode(NSRunLoop runLoop, String mode);

	@Generated
	@Selector("sendBeforeDate:components:from:reserved:")
	public native boolean sendBeforeDateComponentsFromReserved(
			NSDate limitDate, NSMutableArray components, NSPort receivePort,
			long headerSpaceReserved);

	@Generated
	@Selector("sendBeforeDate:msgid:components:from:reserved:")
	public native boolean sendBeforeDateMsgidComponentsFromReserved(
			NSDate limitDate, long msgID, NSMutableArray components,
			NSPort receivePort, long headerSpaceReserved);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object anObject);
}
