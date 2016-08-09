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
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSConnection extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSConnection(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addRequestMode:")
	public native void addRequestMode(String rmode);

	@Generated
	@Selector("addRunLoop:")
	public native void addRunLoop(NSRunLoop runloop);

	@Generated
	@Selector("allConnections")
	public static native NSArray allConnections();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSConnection alloc();

	@Generated
	@Selector("connectionWithReceivePort:sendPort:")
	public static native NSConnection connectionWithReceivePortSendPort(
			NSPort receivePort, NSPort sendPort);

	@Generated
	@Selector("connectionWithRegisteredName:host:")
	public static native NSConnection connectionWithRegisteredNameHost(
			String name, String hostName);

	@Generated
	@Selector("connectionWithRegisteredName:host:usingNameServer:")
	public static native NSConnection connectionWithRegisteredNameHostUsingNameServer(
			String name, String hostName, NSPortNameServer server);

	@Generated
	@Selector("currentConversation")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object currentConversation();

	@Generated
	@Selector("defaultConnection")
	public static native NSConnection defaultConnection();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("dispatchWithComponents:")
	public native void dispatchWithComponents(NSArray components);

	@Generated
	@Selector("enableMultipleThreads")
	public native void enableMultipleThreads();

	@Generated
	@Selector("independentConversationQueueing")
	public native boolean independentConversationQueueing();

	@Generated
	@Selector("init")
	public native NSConnection init();

	@Generated
	@Selector("initWithReceivePort:sendPort:")
	public native NSConnection initWithReceivePortSendPort(NSPort receivePort,
			NSPort sendPort);

	@Generated
	@Selector("invalidate")
	public native void invalidate();

	@Generated
	@Selector("isValid")
	public native boolean isValid();

	@Generated
	@Selector("localObjects")
	public native NSArray localObjects();

	@Generated
	@Selector("multipleThreadsEnabled")
	public native boolean multipleThreadsEnabled();

	@Generated
	@Selector("receivePort")
	public native NSPort receivePort();

	@Generated
	@Selector("registerName:")
	public native boolean registerName(String name);

	@Generated
	@Selector("registerName:withNameServer:")
	public native boolean registerNameWithNameServer(String name,
			NSPortNameServer server);

	@Generated
	@Selector("remoteObjects")
	public native NSArray remoteObjects();

	@Generated
	@Selector("removeRequestMode:")
	public native void removeRequestMode(String rmode);

	@Generated
	@Selector("removeRunLoop:")
	public native void removeRunLoop(NSRunLoop runloop);

	@Generated
	@Selector("replyTimeout")
	public native double replyTimeout();

	@Generated
	@Selector("requestModes")
	public native NSArray requestModes();

	@Generated
	@Selector("requestTimeout")
	public native double requestTimeout();

	@Generated
	@Selector("rootObject")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object rootObject();

	@Generated
	@Selector("rootProxy")
	public native NSDistantObject rootProxy();

	@Generated
	@Selector("rootProxyForConnectionWithRegisteredName:host:")
	public static native NSDistantObject rootProxyForConnectionWithRegisteredNameHost(
			String name, String hostName);

	@Generated
	@Selector("rootProxyForConnectionWithRegisteredName:host:usingNameServer:")
	public static native NSDistantObject rootProxyForConnectionWithRegisteredNameHostUsingNameServer(
			String name, String hostName, NSPortNameServer server);

	@Generated
	@Selector("runInNewThread")
	public native void runInNewThread();

	@Generated
	@Selector("sendPort")
	public native NSPort sendPort();

	@Generated
	@Selector("serviceConnectionWithName:rootObject:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object serviceConnectionWithNameRootObject(
			String name, @Mapped(ObjCObjectMapper.class) Object root);

	@Generated
	@Selector("serviceConnectionWithName:rootObject:usingNameServer:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object serviceConnectionWithNameRootObjectUsingNameServer(
			String name, @Mapped(ObjCObjectMapper.class) Object root,
			NSPortNameServer server);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("setIndependentConversationQueueing:")
	public native void setIndependentConversationQueueing(boolean yorn);

	@Generated
	@Selector("setReplyTimeout:")
	public native void setReplyTimeout(double ti);

	@Generated
	@Selector("setRequestTimeout:")
	public native void setRequestTimeout(double ti);

	@Generated
	@Selector("setRootObject:")
	public native void setRootObject(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("statistics")
	public native NSDictionary statistics();
}
