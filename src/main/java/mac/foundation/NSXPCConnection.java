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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.protocol.NSXPCProxyCreating;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSXPCConnection extends NSObject implements NSXPCProxyCreating {
	static {
		NatJ.register();
	}

	@Generated
	protected NSXPCConnection(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSXPCConnection alloc();

	@Generated
	@Selector("auditSessionIdentifier")
	public native int auditSessionIdentifier();

	@Generated
	@Selector("effectiveGroupIdentifier")
	public native int effectiveGroupIdentifier();

	@Generated
	@Selector("effectiveUserIdentifier")
	public native int effectiveUserIdentifier();

	@Generated
	@Selector("endpoint")
	public native NSXPCListenerEndpoint endpoint();

	@Generated
	@Selector("exportedInterface")
	public native NSXPCInterface exportedInterface();

	@Generated
	@Selector("exportedObject")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object exportedObject();

	@Generated
	@Selector("init")
	public native NSXPCConnection init();

	@Generated
	@Selector("initWithListenerEndpoint:")
	public native NSXPCConnection initWithListenerEndpoint(
			NSXPCListenerEndpoint endpoint);

	@Generated
	@Selector("initWithMachServiceName:options:")
	public native NSXPCConnection initWithMachServiceNameOptions(String name,
			long options);

	@Generated
	@Selector("initWithServiceName:")
	public native NSXPCConnection initWithServiceName(String serviceName);

	@Generated
	@Selector("invalidate")
	public native void invalidate();

	@Generated
	@Selector("processIdentifier")
	public native int processIdentifier();

	@Generated
	@Selector("remoteObjectInterface")
	public native NSXPCInterface remoteObjectInterface();

	@Generated
	@Selector("remoteObjectProxy")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object remoteObjectProxy();

	@Generated
	@Selector("remoteObjectProxyWithErrorHandler:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object remoteObjectProxyWithErrorHandler(
			@ObjCBlock(name = "call_remoteObjectProxyWithErrorHandler") NSXPCProxyCreating.Block_remoteObjectProxyWithErrorHandler handler);

	@Generated
	@Selector("resume")
	public native void resume();

	@Generated
	@Selector("serviceName")
	public native String serviceName();

	@Generated
	@Selector("setExportedInterface:")
	public native void setExportedInterface(NSXPCInterface value);

	@Generated
	@Selector("setExportedObject:")
	public native void setExportedObject(
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("setInterruptionHandler:")
	public native void setInterruptionHandler(
			@ObjCBlock(name = "call_setInterruptionHandler") Block_setInterruptionHandler value);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_setInterruptionHandler {
		@Generated
		public void call_setInterruptionHandler();
	}

	@Generated
	@Selector("setInvalidationHandler:")
	public native void setInvalidationHandler(
			@ObjCBlock(name = "call_setInvalidationHandler") Block_setInvalidationHandler value);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_setInvalidationHandler {
		@Generated
		public void call_setInvalidationHandler();
	}

	@Generated
	@Selector("setRemoteObjectInterface:")
	public native void setRemoteObjectInterface(NSXPCInterface value);

	@Generated
	@Selector("suspend")
	public native void suspend();
}
