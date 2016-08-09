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

package mac.appkit;


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
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGSize;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTouch extends NSObject implements NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected NSTouch(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSTouch alloc();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("device")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object device();

	@Generated
	@Selector("deviceSize")
	@ByValue
	public native CGSize deviceSize();

	@Generated
	@Selector("identity")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object identity();

	@Generated
	@Selector("init")
	public native NSTouch init();

	@Generated
	@Selector("isResting")
	public native boolean isResting();

	@Generated
	@Selector("normalizedPosition")
	@ByValue
	public native CGPoint normalizedPosition();

	@Generated
	@Selector("phase")
	public native long phase();
}
