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
public class NSHTTPCookieStorage extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSHTTPCookieStorage(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSHTTPCookieStorage alloc();

	@Generated
	@Selector("cookieAcceptPolicy")
	public native long cookieAcceptPolicy();

	@Generated
	@Selector("cookies")
	public native NSArray cookies();

	@Generated
	@Selector("cookiesForURL:")
	public native NSArray cookiesForURL(NSURL URL);

	@Generated
	@Selector("deleteCookie:")
	public native void deleteCookie(NSHTTPCookie cookie);

	@Generated
	@Selector("init")
	public native NSHTTPCookieStorage init();

	@Generated
	@Selector("setCookie:")
	public native void setCookie(NSHTTPCookie cookie);

	@Generated
	@Selector("setCookieAcceptPolicy:")
	public native void setCookieAcceptPolicy(long cookieAcceptPolicy);

	@Generated
	@Selector("setCookies:forURL:mainDocumentURL:")
	public native void setCookiesForURLMainDocumentURL(NSArray cookies,
			NSURL URL, NSURL mainDocumentURL);

	@Generated
	@Selector("sharedHTTPCookieStorage")
	public static native NSHTTPCookieStorage sharedHTTPCookieStorage();

	@Generated
	@Selector("sortedCookiesUsingDescriptors:")
	public native NSArray sortedCookiesUsingDescriptors(NSArray sortOrder);
}
