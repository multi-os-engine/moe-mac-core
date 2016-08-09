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
public class NSJSONSerialization extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSJSONSerialization(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("JSONObjectWithData:options:error:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object JSONObjectWithDataOptionsError(NSData data,
			long opt, Ptr<NSError> error);

	@Generated
	@Selector("JSONObjectWithStream:options:error:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object JSONObjectWithStreamOptionsError(
			NSInputStream stream, long opt, Ptr<NSError> error);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSJSONSerialization alloc();

	@Generated
	@Selector("dataWithJSONObject:options:error:")
	public static native NSData dataWithJSONObjectOptionsError(
			@Mapped(ObjCObjectMapper.class) Object obj, long opt,
			Ptr<NSError> error);

	@Generated
	@Selector("init")
	public native NSJSONSerialization init();

	@Generated
	@Selector("isValidJSONObject:")
	public static native boolean isValidJSONObject(
			@Mapped(ObjCObjectMapper.class) Object obj);

	@Generated
	@Selector("writeJSONObject:toStream:options:error:")
	public static native long writeJSONObjectToStreamOptionsError(
			@Mapped(ObjCObjectMapper.class) Object obj, NSOutputStream stream,
			long opt, Ptr<NSError> error);
}
