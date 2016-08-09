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

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSScriptCommandDescription extends NSObject implements NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSScriptCommandDescription(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSScriptCommandDescription alloc();

	@Generated
	@Selector("appleEventClassCode")
	public native int appleEventClassCode();

	@Generated
	@Selector("appleEventCode")
	public native int appleEventCode();

	@Generated
	@Selector("appleEventCodeForArgumentWithName:")
	public native int appleEventCodeForArgumentWithName(String argumentName);

	@Generated
	@Selector("appleEventCodeForReturnType")
	public native int appleEventCodeForReturnType();

	@Generated
	@Selector("argumentNames")
	public native NSArray argumentNames();

	@Generated
	@Selector("commandClassName")
	public native String commandClassName();

	@Generated
	@Selector("commandName")
	public native String commandName();

	@Generated
	@Selector("createCommandInstance")
	public native NSScriptCommand createCommandInstance();

	@Generated
	@Selector("createCommandInstanceWithZone:")
	public native NSScriptCommand createCommandInstanceWithZone(VoidPtr zone);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("init")
	public native NSScriptCommandDescription init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithSuiteName:commandName:dictionary:")
	public native NSScriptCommandDescription initWithSuiteNameCommandNameDictionary(
			String suiteName, String commandName,
			NSDictionary commandDeclaration);

	@Generated
	@Selector("isOptionalArgumentWithName:")
	public native boolean isOptionalArgumentWithName(String argumentName);

	@Generated
	@Selector("returnType")
	public native String returnType();

	@Generated
	@Selector("suiteName")
	public native String suiteName();

	@Generated
	@Selector("typeForArgumentWithName:")
	public native String typeForArgumentWithName(String argumentName);
}
