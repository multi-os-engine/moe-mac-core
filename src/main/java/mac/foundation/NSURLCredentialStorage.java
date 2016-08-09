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
public class NSURLCredentialStorage extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSURLCredentialStorage(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("allCredentials")
	public native NSDictionary allCredentials();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSURLCredentialStorage alloc();

	@Generated
	@Selector("credentialsForProtectionSpace:")
	public native NSDictionary credentialsForProtectionSpace(
			NSURLProtectionSpace space);

	@Generated
	@Selector("defaultCredentialForProtectionSpace:")
	public native NSURLCredential defaultCredentialForProtectionSpace(
			NSURLProtectionSpace space);

	@Generated
	@Selector("init")
	public native NSURLCredentialStorage init();

	@Generated
	@Selector("removeCredential:forProtectionSpace:")
	public native void removeCredentialForProtectionSpace(
			NSURLCredential credential, NSURLProtectionSpace space);

	@Generated
	@Selector("removeCredential:forProtectionSpace:options:")
	public native void removeCredentialForProtectionSpaceOptions(
			NSURLCredential credential, NSURLProtectionSpace space,
			NSDictionary options);

	@Generated
	@Selector("setCredential:forProtectionSpace:")
	public native void setCredentialForProtectionSpace(
			NSURLCredential credential, NSURLProtectionSpace space);

	@Generated
	@Selector("setDefaultCredential:forProtectionSpace:")
	public native void setDefaultCredentialForProtectionSpace(
			NSURLCredential credential, NSURLProtectionSpace space);

	@Generated
	@Selector("sharedCredentialStorage")
	public static native NSURLCredentialStorage sharedCredentialStorage();
}
