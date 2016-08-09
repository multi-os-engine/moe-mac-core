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
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSUbiquitousKeyValueStore extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSUbiquitousKeyValueStore(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSUbiquitousKeyValueStore alloc();

	@Generated
	@Selector("arrayForKey:")
	public native NSArray arrayForKey(String aKey);

	@Generated
	@Selector("boolForKey:")
	public native boolean boolForKey(String aKey);

	@Generated
	@Selector("dataForKey:")
	public native NSData dataForKey(String aKey);

	@Generated
	@Selector("defaultStore")
	public static native NSUbiquitousKeyValueStore defaultStore();

	@Generated
	@Selector("dictionaryForKey:")
	public native NSDictionary dictionaryForKey(String aKey);

	@Generated
	@Selector("dictionaryRepresentation")
	public native NSDictionary dictionaryRepresentation();

	@Generated
	@Selector("doubleForKey:")
	public native double doubleForKey(String aKey);

	@Generated
	@Selector("init")
	public native NSUbiquitousKeyValueStore init();

	@Generated
	@Selector("longLongForKey:")
	public native long longLongForKey(String aKey);

	@Generated
	@Selector("objectForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object objectForKey(String aKey);

	@Generated
	@Selector("removeObjectForKey:")
	public native void removeObjectForKey(String aKey);

	@Generated
	@Selector("setArray:forKey:")
	public native void setArrayForKey(NSArray anArray, String aKey);

	@Generated
	@Selector("setBool:forKey:")
	public native void setBoolForKey(boolean value, String aKey);

	@Generated
	@Selector("setData:forKey:")
	public native void setDataForKey(NSData aData, String aKey);

	@Generated
	@Selector("setDictionary:forKey:")
	public native void setDictionaryForKey(NSDictionary aDictionary, String aKey);

	@Generated
	@Selector("setDouble:forKey:")
	public native void setDoubleForKey(double value, String aKey);

	@Generated
	@Selector("setLongLong:forKey:")
	public native void setLongLongForKey(long value, String aKey);

	@Generated
	@Selector("setObject:forKey:")
	public native void setObjectForKey(
			@Mapped(ObjCObjectMapper.class) Object anObject, String aKey);

	@Generated
	@Selector("setString:forKey:")
	public native void setStringForKey(String aString, String aKey);

	@Generated
	@Selector("stringForKey:")
	public native String stringForKey(String aKey);

	@Generated
	@Selector("synchronize")
	public native boolean synchronize();
}
