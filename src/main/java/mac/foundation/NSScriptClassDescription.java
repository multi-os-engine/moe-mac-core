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
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSScriptClassDescription extends NSClassDescription {
	static {
		NatJ.register();
	}

	@Generated
	protected NSScriptClassDescription(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSScriptClassDescription alloc();

	@Generated
	@Selector("appleEventCode")
	public native int appleEventCode();

	@Generated
	@Selector("appleEventCodeForKey:")
	public native int appleEventCodeForKey(String key);

	@Generated
	@Selector("classDescriptionForClass:")
	public static native NSScriptClassDescription classDescriptionForClass(
			Class aClass);

	@Generated
	@Selector("classDescriptionForKey:")
	public native NSScriptClassDescription classDescriptionForKey(String key);

	@Generated
	@Selector("className")
	public native String className();

	@Generated
	@Selector("defaultSubcontainerAttributeKey")
	public native String defaultSubcontainerAttributeKey();

	@Generated
	@Selector("hasOrderedToManyRelationshipForKey:")
	public native boolean hasOrderedToManyRelationshipForKey(String key);

	@Generated
	@Selector("hasPropertyForKey:")
	public native boolean hasPropertyForKey(String key);

	@Generated
	@Selector("hasReadablePropertyForKey:")
	public native boolean hasReadablePropertyForKey(String key);

	@Generated
	@Selector("hasWritablePropertyForKey:")
	public native boolean hasWritablePropertyForKey(String key);

	@Generated
	@Selector("implementationClassName")
	public native String implementationClassName();

	@Generated
	@Selector("init")
	public native NSScriptClassDescription init();

	@Generated
	@Selector("initWithSuiteName:className:dictionary:")
	public native NSScriptClassDescription initWithSuiteNameClassNameDictionary(
			String suiteName, String className, NSDictionary classDeclaration);

	@Generated
	@Selector("isLocationRequiredToCreateForKey:")
	public native boolean isLocationRequiredToCreateForKey(
			String toManyRelationshipKey);

	@Generated
	@Selector("isReadOnlyKey:")
	public native boolean isReadOnlyKey(String key);

	@Generated
	@Selector("keyWithAppleEventCode:")
	public native String keyWithAppleEventCode(int appleEventCode);

	@Generated
	@Selector("matchesAppleEventCode:")
	public native boolean matchesAppleEventCode(int appleEventCode);

	@Generated
	@Selector("selectorForCommand:")
	public native SEL selectorForCommand(
			NSScriptCommandDescription commandDescription);

	@Generated
	@Selector("suiteName")
	public native String suiteName();

	@Generated
	@Selector("superclassDescription")
	public native NSScriptClassDescription superclassDescription();

	@Generated
	@Selector("supportsCommand:")
	public native boolean supportsCommand(
			NSScriptCommandDescription commandDescription);

	@Generated
	@Selector("typeForKey:")
	public native String typeForKey(String key);
}
