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

package mac.quartzcore;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstDoublePtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.appkit.NSColor;
import mac.coregraphics.opaque.CGColorRef;
import mac.coregraphics.opaque.CGColorSpaceRef;
import mac.foundation.NSCoder;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CIColor extends NSObject implements NSCoding, NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected CIColor(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native CIColor alloc();

	@Generated
	@Selector("alpha")
	public native double alpha();

	@Generated
	@Selector("blue")
	public native double blue();

	@Generated
	@Selector("colorSpace")
	public native CGColorSpaceRef colorSpace();

	@Generated
	@Selector("colorWithCGColor:")
	public static native CIColor colorWithCGColor(CGColorRef c);

	@Generated
	@Selector("colorWithRed:green:blue:")
	public static native CIColor colorWithRedGreenBlue(double r, double g,
			double b);

	@Generated
	@Selector("colorWithRed:green:blue:alpha:")
	public static native CIColor colorWithRedGreenBlueAlpha(double r, double g,
			double b, double a);

	@Generated
	@Selector("colorWithString:")
	public static native CIColor colorWithString(String representation);

	@Generated
	@Selector("components")
	public native ConstDoublePtr components();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("green")
	public native double green();

	@Generated
	@Selector("init")
	public native CIColor init();

	@Generated
	@Selector("initWithCGColor:")
	public native CIColor initWithCGColor(CGColorRef c);

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithColor:")
	public native CIColor initWithColor(NSColor color);

	@Generated
	@Selector("numberOfComponents")
	public native long numberOfComponents();

	@Generated
	@Selector("red")
	public native double red();

	@Generated
	@Selector("stringRepresentation")
	public native String stringRepresentation();
}
