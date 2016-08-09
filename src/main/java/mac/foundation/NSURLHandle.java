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
public class NSURLHandle extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSURLHandle(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("URLHandleClassForURL:")
	public static native Class URLHandleClassForURL(NSURL anURL);

	@Generated
	@Selector("addClient:")
	public native void addClient(@Mapped(ObjCObjectMapper.class) Object client);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSURLHandle alloc();

	@Generated
	@Selector("availableResourceData")
	public native NSData availableResourceData();

	@Generated
	@Selector("backgroundLoadDidFailWithReason:")
	public native void backgroundLoadDidFailWithReason(String reason);

	@Generated
	@Selector("beginLoadInBackground")
	public native void beginLoadInBackground();

	@Generated
	@Selector("cachedHandleForURL:")
	public static native NSURLHandle cachedHandleForURL(NSURL anURL);

	@Generated
	@Selector("canInitWithURL:")
	public static native boolean canInitWithURL(NSURL anURL);

	@Generated
	@Selector("cancelLoadInBackground")
	public native void cancelLoadInBackground();

	@Generated
	@Selector("didLoadBytes:loadComplete:")
	public native void didLoadBytesLoadComplete(NSData newBytes, boolean yorn);

	@Generated
	@Selector("endLoadInBackground")
	public native void endLoadInBackground();

	@Generated
	@Selector("expectedResourceDataSize")
	public native long expectedResourceDataSize();

	@Generated
	@Selector("failureReason")
	public native String failureReason();

	@Generated
	@Selector("flushCachedData")
	public native void flushCachedData();

	@Generated
	@Selector("init")
	public native NSURLHandle init();

	@Generated
	@Selector("initWithURL:cached:")
	public native NSURLHandle initWithURLCached(NSURL anURL, boolean willCache);

	@Generated
	@Selector("loadInBackground")
	public native void loadInBackground();

	@Generated
	@Selector("loadInForeground")
	public native NSData loadInForeground();

	@Generated
	@Selector("propertyForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object propertyForKey(String propertyKey);

	@Generated
	@Selector("propertyForKeyIfAvailable:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object propertyForKeyIfAvailable(String propertyKey);

	@Generated
	@Selector("registerURLHandleClass:")
	public static native void registerURLHandleClass(Class anURLHandleSubclass);

	@Generated
	@Selector("removeClient:")
	public native void removeClient(
			@Mapped(ObjCObjectMapper.class) Object client);

	@Generated
	@Selector("resourceData")
	public native NSData resourceData();

	@Generated
	@Selector("status")
	public native long status();

	@Generated
	@Selector("writeData:")
	public native boolean writeData(NSData data);

	@Generated
	@Selector("writeProperty:forKey:")
	public native boolean writePropertyForKey(
			@Mapped(ObjCObjectMapper.class) Object propertyValue,
			String propertyKey);
}
