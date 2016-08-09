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
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSSocketPort extends NSPort {
	static {
		NatJ.register();
	}

	@Generated
	protected NSSocketPort(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("address")
	public native NSData address();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSSocketPort alloc();

	@Generated
	@Selector("init")
	public native NSSocketPort init();

	@Generated
	@Selector("initRemoteWithProtocolFamily:socketType:protocol:address:")
	public native NSSocketPort initRemoteWithProtocolFamilySocketTypeProtocolAddress(
			int family, int type, int protocol, NSData address);

	@Generated
	@Selector("initRemoteWithTCPPort:host:")
	public native NSSocketPort initRemoteWithTCPPortHost(short port,
			String hostName);

	@Generated
	@Selector("initWithProtocolFamily:socketType:protocol:address:")
	public native NSSocketPort initWithProtocolFamilySocketTypeProtocolAddress(
			int family, int type, int protocol, NSData address);

	@Generated
	@Selector("initWithProtocolFamily:socketType:protocol:socket:")
	public native NSSocketPort initWithProtocolFamilySocketTypeProtocolSocket(
			int family, int type, int protocol, int sock);

	@Generated
	@Selector("initWithTCPPort:")
	public native NSSocketPort initWithTCPPort(short port);

	@Generated
	@Selector("port")
	public static native NSPort port();

	@Generated
	@Selector("protocol")
	public native int protocol();

	@Generated
	@Selector("protocolFamily")
	public native int protocolFamily();

	@Generated
	@Selector("socket")
	public native int socket();

	@Generated
	@Selector("socketType")
	public native int socketType();
}
