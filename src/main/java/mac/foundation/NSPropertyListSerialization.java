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
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPropertyListSerialization extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSPropertyListSerialization(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSPropertyListSerialization alloc();

	@Generated
	@Selector("dataFromPropertyList:format:errorDescription:")
	public static native NSData dataFromPropertyListFormatErrorDescription(
			@Mapped(ObjCObjectMapper.class) Object plist, long format,
			Ptr<NSString> errorString);

	@Generated
	@Selector("dataWithPropertyList:format:options:error:")
	public static native NSData dataWithPropertyListFormatOptionsError(
			@Mapped(ObjCObjectMapper.class) Object plist, long format, long opt,
			Ptr<NSError> error);

	@Generated
	@Selector("init")
	public native NSPropertyListSerialization init();

	@Generated
	@Selector("propertyList:isValidForFormat:")
	public static native boolean propertyListIsValidForFormat(
			@Mapped(ObjCObjectMapper.class) Object plist, long format);

	@Generated
	@Selector("propertyListFromData:mutabilityOption:format:errorDescription:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object propertyListFromDataMutabilityOptionFormatErrorDescription(
			NSData data, long opt, LongPtr format, Ptr<NSString> errorString);

	@Generated
	@Selector("propertyListWithData:options:format:error:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object propertyListWithDataOptionsFormatError(
			NSData data, long opt, LongPtr format, Ptr<NSError> error);

	@Generated
	@Selector("propertyListWithStream:options:format:error:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object propertyListWithStreamOptionsFormatError(
			NSInputStream stream, long opt, LongPtr format, Ptr<NSError> error);

	@Generated
	@Selector("writePropertyList:toStream:format:options:error:")
	public static native long writePropertyListToStreamFormatOptionsError(
			@Mapped(ObjCObjectMapper.class) Object plist,
			NSOutputStream stream, long format, long opt, Ptr<NSError> error);
}
