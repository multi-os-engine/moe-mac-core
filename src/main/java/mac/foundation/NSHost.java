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
import mac.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSHost extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSHost(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("address")
	public native String address();

	@Generated
	@Selector("addresses")
	public native NSArray addresses();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSHost alloc();

	@Generated
	@Selector("currentHost")
	public static native NSHost currentHost();

	@Generated
	@Selector("flushHostCache")
	public static native void flushHostCache();

	@Generated
	@Selector("hostWithAddress:")
	public static native NSHost hostWithAddress(String address);

	@Generated
	@Selector("hostWithName:")
	public static native NSHost hostWithName(String name);

	@Generated
	@Selector("init")
	public native NSHost init();

	@Generated
	@Selector("isEqualToHost:")
	public native boolean isEqualToHost(NSHost aHost);

	@Generated
	@Selector("isHostCacheEnabled")
	public static native boolean isHostCacheEnabled();

	@Generated
	@Selector("localizedName")
	public native String localizedName();

	@Generated
	@Selector("name")
	public native String name();

	@Generated
	@Selector("names")
	public native NSArray names();

	@Generated
	@Selector("setHostCacheEnabled:")
	public static native void setHostCacheEnabled(boolean flag);
}
