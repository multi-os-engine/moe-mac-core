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
import mac.foundation.protocol.NSCopying;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURLSessionTask extends NSObject implements NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected NSURLSessionTask(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSURLSessionTask alloc();

	@Generated
	@Selector("cancel")
	public native void cancel();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("countOfBytesExpectedToReceive")
	public native long countOfBytesExpectedToReceive();

	@Generated
	@Selector("countOfBytesExpectedToSend")
	public native long countOfBytesExpectedToSend();

	@Generated
	@Selector("countOfBytesReceived")
	public native long countOfBytesReceived();

	@Generated
	@Selector("countOfBytesSent")
	public native long countOfBytesSent();

	@Generated
	@Selector("currentRequest")
	public native NSURLRequest currentRequest();

	@Generated
	@Selector("error")
	public native NSError error();

	@Generated
	@Selector("init")
	public native NSURLSessionTask init();

	@Generated
	@Selector("originalRequest")
	public native NSURLRequest originalRequest();

	@Generated
	@Selector("response")
	public native NSURLResponse response();

	@Generated
	@Selector("resume")
	public native void resume();

	@Generated
	@Selector("setTaskDescription:")
	public native void setTaskDescription(String value);

	@Generated
	@Selector("state")
	public native long state();

	@Generated
	@Selector("suspend")
	public native void suspend();

	@Generated
	@Selector("taskDescription")
	public native String taskDescription();

	@Generated
	@Selector("taskIdentifier")
	public native long taskIdentifier();
}
