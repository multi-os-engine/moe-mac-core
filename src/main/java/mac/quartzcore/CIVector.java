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
import mac.coregraphics.struct.CGAffineTransform;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSCoder;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CIVector extends NSObject implements NSCopying, NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected CIVector(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("CGAffineTransformValue")
	@ByValue
	public native CGAffineTransform CGAffineTransformValue();

	@Generated
	@Selector("CGPointValue")
	@ByValue
	public native CGPoint CGPointValue();

	@Generated
	@Selector("CGRectValue")
	@ByValue
	public native CGRect CGRectValue();

	@Generated
	@Selector("W")
	public native double W();

	@Generated
	@Selector("X")
	public native double X();

	@Generated
	@Selector("Y")
	public native double Y();

	@Generated
	@Selector("Z")
	public native double Z();

	@Generated
	@Owned
	@Selector("alloc")
	public static native CIVector alloc();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("count")
	public native long count();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("init")
	public native CIVector init();

	@Generated
	@Selector("initWithCGAffineTransform:")
	public native CIVector initWithCGAffineTransform(
			@ByValue CGAffineTransform r);

	@Generated
	@Selector("initWithCGPoint:")
	public native CIVector initWithCGPoint(@ByValue CGPoint p);

	@Generated
	@Selector("initWithCGRect:")
	public native CIVector initWithCGRect(@ByValue CGRect r);

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithString:")
	public native CIVector initWithString(String representation);

	@Generated
	@Selector("initWithValues:count:")
	public native CIVector initWithValuesCount(ConstDoublePtr values, long count);

	@Generated
	@Selector("initWithX:")
	public native CIVector initWithX(double x);

	@Generated
	@Selector("initWithX:Y:")
	public native CIVector initWithXY(double x, double y);

	@Generated
	@Selector("initWithX:Y:Z:")
	public native CIVector initWithXYZ(double x, double y, double z);

	@Generated
	@Selector("initWithX:Y:Z:W:")
	public native CIVector initWithXYZW(double x, double y, double z, double w);

	@Generated
	@Selector("stringRepresentation")
	public native String stringRepresentation();

	@Generated
	@Selector("valueAtIndex:")
	public native double valueAtIndex(long index);

	@Generated
	@Selector("vectorWithCGAffineTransform:")
	public static native CIVector vectorWithCGAffineTransform(
			@ByValue CGAffineTransform t);

	@Generated
	@Selector("vectorWithCGPoint:")
	public static native CIVector vectorWithCGPoint(@ByValue CGPoint p);

	@Generated
	@Selector("vectorWithCGRect:")
	public static native CIVector vectorWithCGRect(@ByValue CGRect r);

	@Generated
	@Selector("vectorWithString:")
	public static native CIVector vectorWithString(String representation);

	@Generated
	@Selector("vectorWithValues:count:")
	public static native CIVector vectorWithValuesCount(ConstDoublePtr values,
			long count);

	@Generated
	@Selector("vectorWithX:")
	public static native CIVector vectorWithX(double x);

	@Generated
	@Selector("vectorWithX:Y:")
	public static native CIVector vectorWithXY(double x, double y);

	@Generated
	@Selector("vectorWithX:Y:Z:")
	public static native CIVector vectorWithXYZ(double x, double y, double z);

	@Generated
	@Selector("vectorWithX:Y:Z:W:")
	public static native CIVector vectorWithXYZW(double x, double y, double z,
			double w);
}
