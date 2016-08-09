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
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSNetService extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSNetService(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("TXTRecordData")
	public native NSData TXTRecordData();

	@Generated
	@Selector("addresses")
	public native NSArray addresses();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSNetService alloc();

	@Generated
	@Selector("dataFromTXTRecordDictionary:")
	public static native NSData dataFromTXTRecordDictionary(
			NSDictionary txtDictionary);

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("dictionaryFromTXTRecordData:")
	public static native NSDictionary dictionaryFromTXTRecordData(NSData txtData);

	@Generated
	@Selector("domain")
	public native String domain();

	@Generated
	@Selector("getInputStream:outputStream:")
	public native boolean getInputStreamOutputStream(
			Ptr<NSInputStream> inputStream, Ptr<NSOutputStream> outputStream);

	@Generated
	@Selector("hostName")
	public native String hostName();

	@Generated
	@Selector("includesPeerToPeer")
	public native boolean includesPeerToPeer();

	@Generated
	@Selector("init")
	public native NSNetService init();

	@Generated
	@Selector("initWithDomain:type:name:")
	public native NSNetService initWithDomainTypeName(String domain,
			String type, String name);

	@Generated
	@Selector("initWithDomain:type:name:port:")
	public native NSNetService initWithDomainTypeNamePort(String domain,
			String type, String name, int port);

	@Generated
	@Selector("name")
	public native String name();

	@Generated
	@Selector("port")
	public native long port();

	@Generated
	@Selector("protocolSpecificInformation")
	public native String protocolSpecificInformation();

	@Generated
	@Selector("publish")
	public native void publish();

	@Generated
	@Selector("publishWithOptions:")
	public native void publishWithOptions(long options);

	@Generated
	@Selector("removeFromRunLoop:forMode:")
	public native void removeFromRunLoopForMode(NSRunLoop aRunLoop, String mode);

	@Generated
	@Selector("resolve")
	public native void resolve();

	@Generated
	@Selector("resolveWithTimeout:")
	public native void resolveWithTimeout(double timeout);

	@Generated
	@Selector("scheduleInRunLoop:forMode:")
	public native void scheduleInRunLoopForMode(NSRunLoop aRunLoop, String mode);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	public void setDelegate(@Mapped(ObjCObjectMapper.class) Object value) {
		ObjCObject __old = (ObjCObject) delegate();
		if (value != null) {
			ObjCRuntime.associateObjCObject(this, value);
		}
		setDelegate_unsafe(value);
		if (__old != null) {
			ObjCRuntime
					.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("setIncludesPeerToPeer:")
	public native void setIncludesPeerToPeer(boolean value);

	@Generated
	@Selector("setProtocolSpecificInformation:")
	public native void setProtocolSpecificInformation(String specificInformation);

	@Generated
	@Selector("setTXTRecordData:")
	public native boolean setTXTRecordData(NSData recordData);

	@Generated
	@Selector("startMonitoring")
	public native void startMonitoring();

	@Generated
	@Selector("stop")
	public native void stop();

	@Generated
	@Selector("stopMonitoring")
	public native void stopMonitoring();

	@Generated
	@Selector("type")
	public native String type();
}
