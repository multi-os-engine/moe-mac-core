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

package mac.coredata;


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
import mac.foundation.NSArray;
import mac.foundation.NSCoder;
import mac.foundation.NSData;
import mac.foundation.NSDictionary;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPropertyDescription extends NSObject implements NSCoding,
		NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected NSPropertyDescription(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSPropertyDescription alloc();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("init")
	public native NSPropertyDescription init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("isIndexed")
	public native boolean isIndexed();

	@Generated
	@Selector("isIndexedBySpotlight")
	public native boolean isIndexedBySpotlight();

	@Generated
	@Selector("isOptional")
	public native boolean isOptional();

	@Generated
	@Selector("isStoredInExternalRecord")
	public native boolean isStoredInExternalRecord();

	@Generated
	@Selector("isTransient")
	public native boolean isTransient();

	@Generated
	@Selector("name")
	public native String name();

	@Generated
	@Selector("renamingIdentifier")
	public native String renamingIdentifier();

	@Generated
	@Selector("setIndexed:")
	public native void setIndexed(boolean flag);

	@Generated
	@Selector("setIndexedBySpotlight:")
	public native void setIndexedBySpotlight(boolean flag);

	@Generated
	@Selector("setName:")
	public native void setName(String name);

	@Generated
	@Selector("setOptional:")
	public native void setOptional(boolean flag);

	@Generated
	@Selector("setRenamingIdentifier:")
	public native void setRenamingIdentifier(String value);

	@Generated
	@Selector("setStoredInExternalRecord:")
	public native void setStoredInExternalRecord(boolean flag);

	@Generated
	@Selector("setTransient:")
	public native void setTransient(boolean flag);

	@Generated
	@Selector("setUserInfo:")
	public native void setUserInfo(NSDictionary dictionary);

	@Generated
	@Selector("setValidationPredicates:withValidationWarnings:")
	public native void setValidationPredicatesWithValidationWarnings(
			NSArray validationPredicates, NSArray validationWarnings);

	@Generated
	@Selector("setVersionHashModifier:")
	public native void setVersionHashModifier(String modifierString);

	@Generated
	@Selector("userInfo")
	public native NSDictionary userInfo();

	@Generated
	@Selector("validationPredicates")
	public native NSArray validationPredicates();

	@Generated
	@Selector("validationWarnings")
	public native NSArray validationWarnings();

	@Generated
	@Selector("versionHash")
	public native NSData versionHash();

	@Generated
	@Selector("versionHashModifier")
	public native String versionHashModifier();
}
