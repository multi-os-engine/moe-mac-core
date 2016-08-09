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
import mac.coregraphics.struct.CGSize;
import mac.foundation.NSCoder;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSShadow extends NSObject implements NSCopying, NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSShadow(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSShadow alloc();

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
	public native NSShadow init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("set")
	public native void set();

	@Generated
	@Selector("setShadowBlurRadius:")
	public native void setShadowBlurRadius(double val);

	@Generated
	@Selector("setShadowColor:")
	public native void setShadowColor(NSColor color);

	@Generated
	@Selector("setShadowOffset:")
	public native void setShadowOffset(@ByValue CGSize offset);

	@Generated
	@Selector("shadowBlurRadius")
	public native double shadowBlurRadius();

	@Generated
	@Selector("shadowColor")
	public native NSColor shadowColor();

	@Generated
	@Selector("shadowOffset")
	@ByValue
	public native CGSize shadowOffset();
}
