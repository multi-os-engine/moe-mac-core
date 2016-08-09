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
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURLProtocol extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSURLProtocol(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSURLProtocol alloc();

	@Generated
	@Selector("cachedResponse")
	public native NSCachedURLResponse cachedResponse();

	@Generated
	@Selector("canInitWithRequest:")
	public static native boolean canInitWithRequest(NSURLRequest request);

	@Generated
	@Selector("canonicalRequestForRequest:")
	public static native NSURLRequest canonicalRequestForRequest(
			NSURLRequest request);

	@Generated
	@Selector("client")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object client();

	@Generated
	@Selector("init")
	public native NSURLProtocol init();

	@Generated
	@Selector("initWithRequest:cachedResponse:client:")
	public native NSURLProtocol initWithRequestCachedResponseClient(
			NSURLRequest request, NSCachedURLResponse cachedResponse,
			@Mapped(ObjCObjectMapper.class) Object client);

	@Generated
	@Selector("propertyForKey:inRequest:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object propertyForKeyInRequest(String key,
			NSURLRequest request);

	@Generated
	@Selector("registerClass:")
	public static native boolean registerClass(Class protocolClass);

	@Generated
	@Selector("removePropertyForKey:inRequest:")
	public static native void removePropertyForKeyInRequest(String key,
			NSMutableURLRequest request);

	@Generated
	@Selector("request")
	public native NSURLRequest request();

	@Generated
	@Selector("requestIsCacheEquivalent:toRequest:")
	public static native boolean requestIsCacheEquivalentToRequest(
			NSURLRequest a, NSURLRequest b);

	@Generated
	@Selector("setProperty:forKey:inRequest:")
	public static native void setPropertyForKeyInRequest(
			@Mapped(ObjCObjectMapper.class) Object value, String key,
			NSMutableURLRequest request);

	@Generated
	@Selector("startLoading")
	public native void startLoading();

	@Generated
	@Selector("stopLoading")
	public native void stopLoading();

	@Generated
	@Selector("unregisterClass:")
	public static native void unregisterClass(Class protocolClass);
}
