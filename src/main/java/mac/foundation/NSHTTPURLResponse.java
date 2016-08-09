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
public class NSHTTPURLResponse extends NSURLResponse {
	static {
		NatJ.register();
	}

	@Generated
	protected NSHTTPURLResponse(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("allHeaderFields")
	public native NSDictionary allHeaderFields();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSHTTPURLResponse alloc();

	@Generated
	@Selector("init")
	public native NSHTTPURLResponse init();

	@Generated
	@Selector("initWithURL:MIMEType:expectedContentLength:textEncodingName:")
	public native NSHTTPURLResponse initWithURLMIMETypeExpectedContentLengthTextEncodingName(
			NSURL URL, String MIMEType, long length, String name);

	@Generated
	@Selector("initWithURL:statusCode:HTTPVersion:headerFields:")
	public native NSHTTPURLResponse initWithURLStatusCodeHTTPVersionHeaderFields(
			NSURL url, long statusCode, String HTTPVersion,
			NSDictionary headerFields);

	@Generated
	@Selector("localizedStringForStatusCode:")
	public static native String localizedStringForStatusCode(long statusCode);

	@Generated
	@Selector("statusCode")
	public native long statusCode();
}
