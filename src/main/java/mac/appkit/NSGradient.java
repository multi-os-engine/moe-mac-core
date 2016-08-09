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
import org.moe.natj.general.ptr.ConstDoublePtr;
import org.moe.natj.general.ptr.DoublePtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSArray;
import mac.foundation.NSCoder;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSGradient extends NSObject implements NSCopying, NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSGradient(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSGradient alloc();

	@Generated
	@Selector("colorSpace")
	public native NSColorSpace colorSpace();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("drawFromCenter:radius:toCenter:radius:options:")
	public native void drawFromCenterRadiusToCenterRadiusOptions(
			@ByValue CGPoint startCenter, double startRadius,
			@ByValue CGPoint endCenter, double endRadius, long options);

	@Generated
	@Selector("drawFromPoint:toPoint:options:")
	public native void drawFromPointToPointOptions(
			@ByValue CGPoint startingPoint, @ByValue CGPoint endingPoint,
			long options);

	@Generated
	@Selector("drawInBezierPath:angle:")
	public native void drawInBezierPathAngle(NSBezierPath path, double angle);

	@Generated
	@Selector("drawInBezierPath:relativeCenterPosition:")
	public native void drawInBezierPathRelativeCenterPosition(
			NSBezierPath path, @ByValue CGPoint relativeCenterPosition);

	@Generated
	@Selector("drawInRect:angle:")
	public native void drawInRectAngle(@ByValue CGRect rect, double angle);

	@Generated
	@Selector("drawInRect:relativeCenterPosition:")
	public native void drawInRectRelativeCenterPosition(@ByValue CGRect rect,
			@ByValue CGPoint relativeCenterPosition);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("getColor:location:atIndex:")
	public native void getColorLocationAtIndex(Ptr<NSColor> color,
			DoublePtr location, long index);

	@Generated
	@Selector("init")
	public native NSGradient init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithColors:")
	public native NSGradient initWithColors(NSArray colorArray);

	@Generated
	@Selector("initWithColors:atLocations:colorSpace:")
	public native NSGradient initWithColorsAtLocationsColorSpace(
			NSArray colorArray, ConstDoublePtr locations,
			NSColorSpace colorSpace);

	@Generated
	@Selector("initWithStartingColor:endingColor:")
	public native NSGradient initWithStartingColorEndingColor(
			NSColor startingColor, NSColor endingColor);

	@Generated
	@Selector("interpolatedColorAtLocation:")
	public native NSColor interpolatedColorAtLocation(double location);

	@Generated
	@Selector("numberOfColorStops")
	public native long numberOfColorStops();
}
