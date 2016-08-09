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
public class NSHTTPCookie extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSHTTPCookie(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSHTTPCookie alloc();

	@Generated
	@Selector("comment")
	public native String comment();

	@Generated
	@Selector("commentURL")
	public native NSURL commentURL();

	@Generated
	@Selector("cookieWithProperties:")
	public static native NSHTTPCookie cookieWithProperties(
			NSDictionary properties);

	@Generated
	@Selector("cookiesWithResponseHeaderFields:forURL:")
	public static native NSArray cookiesWithResponseHeaderFieldsForURL(
			NSDictionary headerFields, NSURL URL);

	@Generated
	@Selector("domain")
	public native String domain();

	@Generated
	@Selector("expiresDate")
	public native NSDate expiresDate();

	@Generated
	@Selector("init")
	public native NSHTTPCookie init();

	@Generated
	@Selector("initWithProperties:")
	public native NSHTTPCookie initWithProperties(NSDictionary properties);

	@Generated
	@Selector("isHTTPOnly")
	public native boolean isHTTPOnly();

	@Generated
	@Selector("isSecure")
	public native boolean isSecure();

	@Generated
	@Selector("isSessionOnly")
	public native boolean isSessionOnly();

	@Generated
	@Selector("name")
	public native String name();

	@Generated
	@Selector("path")
	public native String path();

	@Generated
	@Selector("portList")
	public native NSArray portList();

	@Generated
	@Selector("properties")
	public native NSDictionary properties();

	@Generated
	@Selector("requestHeaderFieldsWithCookies:")
	public static native NSDictionary requestHeaderFieldsWithCookies(
			NSArray cookies);

	@Generated
	@Selector("value")
	public native String value();

	@Generated
	@Selector("version")
	public native long version();
}
