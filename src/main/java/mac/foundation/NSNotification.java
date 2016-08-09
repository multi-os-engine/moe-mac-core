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
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSNotification extends NSObject implements NSCopying, NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSNotification(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSNotification alloc();

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
	public native NSNotification init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithName:object:userInfo:")
	public native NSNotification initWithNameObjectUserInfo(String name,
			@Mapped(ObjCObjectMapper.class) Object object, NSDictionary userInfo);

	@Generated
	@Selector("name")
	public native String name();

	@Generated
	@Selector("notificationWithName:object:")
	public static native NSNotification notificationWithNameObject(
			String aName, @Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("notificationWithName:object:userInfo:")
	public static native NSNotification notificationWithNameObjectUserInfo(
			String aName, @Mapped(ObjCObjectMapper.class) Object anObject,
			NSDictionary aUserInfo);

	@Generated
	@Selector("object")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object object();

	@Generated
	@Selector("userInfo")
	public native NSDictionary userInfo();
}
