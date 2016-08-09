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
public class NSScriptSuiteRegistry extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSScriptSuiteRegistry(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("aeteResource:")
	public native NSData aeteResource(String languageName);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSScriptSuiteRegistry alloc();

	@Generated
	@Selector("appleEventCodeForSuite:")
	public native int appleEventCodeForSuite(String suiteName);

	@Generated
	@Selector("bundleForSuite:")
	public native NSBundle bundleForSuite(String suiteName);

	@Generated
	@Selector("classDescriptionWithAppleEventCode:")
	public native NSScriptClassDescription classDescriptionWithAppleEventCode(
			int appleEventCode);

	@Generated
	@Selector("classDescriptionsInSuite:")
	public native NSDictionary classDescriptionsInSuite(String suiteName);

	@Generated
	@Selector("commandDescriptionWithAppleEventClass:andAppleEventCode:")
	public native NSScriptCommandDescription commandDescriptionWithAppleEventClassAndAppleEventCode(
			int appleEventClassCode, int appleEventIDCode);

	@Generated
	@Selector("commandDescriptionsInSuite:")
	public native NSDictionary commandDescriptionsInSuite(String suiteName);

	@Generated
	@Selector("init")
	public native NSScriptSuiteRegistry init();

	@Generated
	@Selector("loadSuiteWithDictionary:fromBundle:")
	public native void loadSuiteWithDictionaryFromBundle(
			NSDictionary suiteDeclaration, NSBundle bundle);

	@Generated
	@Selector("loadSuitesFromBundle:")
	public native void loadSuitesFromBundle(NSBundle bundle);

	@Generated
	@Selector("registerClassDescription:")
	public native void registerClassDescription(
			NSScriptClassDescription classDescription);

	@Generated
	@Selector("registerCommandDescription:")
	public native void registerCommandDescription(
			NSScriptCommandDescription commandDescription);

	@Generated
	@Selector("setSharedScriptSuiteRegistry:")
	public static native void setSharedScriptSuiteRegistry(
			NSScriptSuiteRegistry registry);

	@Generated
	@Selector("sharedScriptSuiteRegistry")
	public static native NSScriptSuiteRegistry sharedScriptSuiteRegistry();

	@Generated
	@Selector("suiteForAppleEventCode:")
	public native String suiteForAppleEventCode(int appleEventCode);

	@Generated
	@Selector("suiteNames")
	public native NSArray suiteNames();
}
