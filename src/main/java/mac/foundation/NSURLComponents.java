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
public class NSURLComponents extends NSObject implements NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected NSURLComponents(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("URL")
	public native NSURL URL();

	@Generated
	@Selector("URLRelativeToURL:")
	public native NSURL URLRelativeToURL(NSURL baseURL);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSURLComponents alloc();

	@Generated
	@Selector("componentsWithString:")
	public static native NSURLComponents componentsWithString(String URLString);

	@Generated
	@Selector("componentsWithURL:resolvingAgainstBaseURL:")
	public static native NSURLComponents componentsWithURLResolvingAgainstBaseURL(
			NSURL url, boolean resolve);

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("fragment")
	public native String fragment();

	@Generated
	@Selector("host")
	public native String host();

	@Generated
	@Selector("init")
	public native NSURLComponents init();

	@Generated
	@Selector("initWithString:")
	public native NSURLComponents initWithString(String URLString);

	@Generated
	@Selector("initWithURL:resolvingAgainstBaseURL:")
	public native NSURLComponents initWithURLResolvingAgainstBaseURL(NSURL url,
			boolean resolve);

	@Generated
	@Selector("password")
	public native String password();

	@Generated
	@Selector("path")
	public native String path();

	@Generated
	@Selector("percentEncodedFragment")
	public native String percentEncodedFragment();

	@Generated
	@Selector("percentEncodedHost")
	public native String percentEncodedHost();

	@Generated
	@Selector("percentEncodedPassword")
	public native String percentEncodedPassword();

	@Generated
	@Selector("percentEncodedPath")
	public native String percentEncodedPath();

	@Generated
	@Selector("percentEncodedQuery")
	public native String percentEncodedQuery();

	@Generated
	@Selector("percentEncodedUser")
	public native String percentEncodedUser();

	@Generated
	@Selector("port")
	public native NSNumber port();

	@Generated
	@Selector("query")
	public native String query();

	@Generated
	@Selector("scheme")
	public native String scheme();

	@Generated
	@Selector("setFragment:")
	public native void setFragment(String value);

	@Generated
	@Selector("setHost:")
	public native void setHost(String value);

	@Generated
	@Selector("setPassword:")
	public native void setPassword(String value);

	@Generated
	@Selector("setPath:")
	public native void setPath(String value);

	@Generated
	@Selector("setPercentEncodedFragment:")
	public native void setPercentEncodedFragment(String value);

	@Generated
	@Selector("setPercentEncodedHost:")
	public native void setPercentEncodedHost(String value);

	@Generated
	@Selector("setPercentEncodedPassword:")
	public native void setPercentEncodedPassword(String value);

	@Generated
	@Selector("setPercentEncodedPath:")
	public native void setPercentEncodedPath(String value);

	@Generated
	@Selector("setPercentEncodedQuery:")
	public native void setPercentEncodedQuery(String value);

	@Generated
	@Selector("setPercentEncodedUser:")
	public native void setPercentEncodedUser(String value);

	@Generated
	@Selector("setPort:")
	public native void setPort(NSNumber value);

	@Generated
	@Selector("setQuery:")
	public native void setQuery(String value);

	@Generated
	@Selector("setScheme:")
	public native void setScheme(String value);

	@Generated
	@Selector("setUser:")
	public native void setUser(String value);

	@Generated
	@Selector("user")
	public native String user();
}
