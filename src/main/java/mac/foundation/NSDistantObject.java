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
import mac.foundation.protocol.NSCoding;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSDistantObject extends NSProxy implements NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSDistantObject(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSDistantObject alloc();

	@Generated
	@Selector("connectionForProxy")
	public native NSConnection connectionForProxy();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithLocal:connection:")
	public native NSDistantObject initWithLocalConnection(
			@Mapped(ObjCObjectMapper.class) Object target,
			NSConnection connection);

	@Generated
	@Selector("initWithTarget:connection:")
	public native NSDistantObject initWithTargetConnection(
			@Mapped(ObjCObjectMapper.class) Object target,
			NSConnection connection);

	@Generated
	@Selector("proxyWithLocal:connection:")
	public static native NSDistantObject proxyWithLocalConnection(
			@Mapped(ObjCObjectMapper.class) Object target,
			NSConnection connection);

	@Generated
	@Selector("proxyWithTarget:connection:")
	public static native NSDistantObject proxyWithTargetConnection(
			@Mapped(ObjCObjectMapper.class) Object target,
			NSConnection connection);
}
