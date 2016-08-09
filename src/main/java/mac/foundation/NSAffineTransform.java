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
import mac.appkit.NSBezierPath;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGSize;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;
import mac.foundation.struct.NSAffineTransformStruct;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSAffineTransform extends NSObject implements NSCopying, NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSAffineTransform(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSAffineTransform alloc();

	@Generated
	@Selector("appendTransform:")
	public native void appendTransform(NSAffineTransform transform);

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
	public native NSAffineTransform init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithTransform:")
	public native NSAffineTransform initWithTransform(
			NSAffineTransform transform);

	@Generated
	@Selector("invert")
	public native void invert();

	@Generated
	@Selector("prependTransform:")
	public native void prependTransform(NSAffineTransform transform);

	@Generated
	@Selector("rotateByDegrees:")
	public native void rotateByDegrees(double angle);

	@Generated
	@Selector("rotateByRadians:")
	public native void rotateByRadians(double angle);

	@Generated
	@Selector("scaleBy:")
	public native void scaleBy(double scale);

	@Generated
	@Selector("scaleXBy:yBy:")
	public native void scaleXByYBy(double scaleX, double scaleY);

	@Generated
	@Selector("setTransformStruct:")
	public native void setTransformStruct(
			@ByValue NSAffineTransformStruct transformStruct);

	@Generated
	@Selector("transform")
	public static native NSAffineTransform transform();

	@Generated
	@Selector("transformPoint:")
	@ByValue
	public native CGPoint transformPoint(@ByValue CGPoint aPoint);

	@Generated
	@Selector("transformSize:")
	@ByValue
	public native CGSize transformSize(@ByValue CGSize aSize);

	@Generated
	@Selector("transformStruct")
	@ByValue
	public native NSAffineTransformStruct transformStruct();

	@Generated
	@Selector("translateXBy:yBy:")
	public native void translateXByYBy(double deltaX, double deltaY);

	@Generated
	@Selector("concat")
	public native void concat();

	@Generated
	@Selector("set")
	public native void set();

	@Generated
	@Selector("transformBezierPath:")
	public native NSBezierPath transformBezierPath(NSBezierPath aPath);
}
