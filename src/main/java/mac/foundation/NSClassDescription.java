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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import mac.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSClassDescription extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSClassDescription(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSClassDescription alloc();

	@Generated
	@Selector("attributeKeys")
	public native NSArray attributeKeys();

	@Generated
	@Selector("classDescriptionForClass:")
	public static native NSClassDescription classDescriptionForClass(
			Class aClass);

	@Generated
	@Selector("init")
	public native NSClassDescription init();

	@Generated
	@Selector("invalidateClassDescriptionCache")
	public static native void invalidateClassDescriptionCache();

	@Generated
	@Selector("inverseForRelationshipKey:")
	public native String inverseForRelationshipKey(String relationshipKey);

	@Generated
	@Selector("registerClassDescription:forClass:")
	public static native void registerClassDescriptionForClass(
			NSClassDescription description, Class aClass);

	@Generated
	@Selector("toManyRelationshipKeys")
	public native NSArray toManyRelationshipKeys();

	@Generated
	@Selector("toOneRelationshipKeys")
	public native NSArray toOneRelationshipKeys();
}
