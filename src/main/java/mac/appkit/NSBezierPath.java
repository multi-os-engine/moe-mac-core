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


import org.moe.natj.c.map.CStringMapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.*;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSAffineTransform;
import mac.foundation.NSCoder;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSBezierPath extends NSObject implements NSCopying, NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSBezierPath(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addClip")
	public native void addClip();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSBezierPath alloc();

	@Generated
	@Selector("appendBezierPath:")
	public native void appendBezierPath(NSBezierPath path);

	@Generated
	@Selector("appendBezierPathWithArcFromPoint:toPoint:radius:")
	public native void appendBezierPathWithArcFromPointToPointRadius(
			@ByValue CGPoint point1, @ByValue CGPoint point2, double radius);

	@Generated
	@Selector("appendBezierPathWithArcWithCenter:radius:startAngle:endAngle:")
	public native void appendBezierPathWithArcWithCenterRadiusStartAngleEndAngle(
			@ByValue CGPoint center, double radius, double startAngle,
			double endAngle);

	@Generated
	@Selector("appendBezierPathWithArcWithCenter:radius:startAngle:endAngle:clockwise:")
	public native void appendBezierPathWithArcWithCenterRadiusStartAngleEndAngleClockwise(
			@ByValue CGPoint center, double radius, double startAngle,
			double endAngle, boolean clockwise);

	@Generated
	@Selector("appendBezierPathWithGlyph:inFont:")
	public native void appendBezierPathWithGlyphInFont(int glyph, NSFont font);

	@Generated
	@Selector("appendBezierPathWithGlyphs:count:inFont:")
	public native void appendBezierPathWithGlyphsCountInFont(IntPtr glyphs,
			long count, NSFont font);

	@Generated
	@Selector("appendBezierPathWithOvalInRect:")
	public native void appendBezierPathWithOvalInRect(@ByValue CGRect rect);

	@Generated
	@Selector("appendBezierPathWithPackedGlyphs:")
	public native void appendBezierPathWithPackedGlyphs(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String packedGlyphs);

	@Generated
	@Selector("appendBezierPathWithPoints:count:")
	public native void appendBezierPathWithPointsCount(
			@UncertainArgument("Options: reference, array Fallback: reference") CGPoint points,
			long count);

	@Generated
	@Selector("appendBezierPathWithRect:")
	public native void appendBezierPathWithRect(@ByValue CGRect rect);

	@Generated
	@Selector("appendBezierPathWithRoundedRect:xRadius:yRadius:")
	public native void appendBezierPathWithRoundedRectXRadiusYRadius(
			@ByValue CGRect rect, double xRadius, double yRadius);

	@Generated
	@Selector("bezierPath")
	public static native NSBezierPath bezierPath();

	@Generated
	@Selector("bezierPathByFlatteningPath")
	public native NSBezierPath bezierPathByFlatteningPath();

	@Generated
	@Selector("bezierPathByReversingPath")
	public native NSBezierPath bezierPathByReversingPath();

	@Generated
	@Selector("bezierPathWithOvalInRect:")
	public static native NSBezierPath bezierPathWithOvalInRect(
			@ByValue CGRect rect);

	@Generated
	@Selector("bezierPathWithRect:")
	public static native NSBezierPath bezierPathWithRect(@ByValue CGRect rect);

	@Generated
	@Selector("bezierPathWithRoundedRect:xRadius:yRadius:")
	public static native NSBezierPath bezierPathWithRoundedRectXRadiusYRadius(
			@ByValue CGRect rect, double xRadius, double yRadius);

	@Generated
	@Selector("bounds")
	@ByValue
	public native CGRect bounds();

	@Generated
	@Selector("cachesBezierPath")
	public native boolean cachesBezierPath();

	@Generated
	@Selector("clipRect:")
	public static native void clipRect(@ByValue CGRect rect);

	@Generated
	@Selector("closePath")
	public native void closePath();

	@Generated
	@Selector("containsPoint:")
	public native boolean containsPoint(@ByValue CGPoint point);

	@Generated
	@Selector("controlPointBounds")
	@ByValue
	public native CGRect controlPointBounds();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("currentPoint")
	@ByValue
	public native CGPoint currentPoint();

	@Generated
	@Selector("curveToPoint:controlPoint1:controlPoint2:")
	public native void curveToPointControlPoint1ControlPoint2(
			@ByValue CGPoint endPoint, @ByValue CGPoint controlPoint1,
			@ByValue CGPoint controlPoint2);

	@Generated
	@Selector("defaultFlatness")
	public static native double defaultFlatness();

	@Generated
	@Selector("defaultLineCapStyle")
	public static native long defaultLineCapStyle();

	@Generated
	@Selector("defaultLineJoinStyle")
	public static native long defaultLineJoinStyle();

	@Generated
	@Selector("defaultLineWidth")
	public static native double defaultLineWidth();

	@Generated
	@Selector("defaultMiterLimit")
	public static native double defaultMiterLimit();

	@Generated
	@Selector("defaultWindingRule")
	public static native long defaultWindingRule();

	@Generated
	@Selector("drawPackedGlyphs:atPoint:")
	public static native void drawPackedGlyphsAtPoint(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String packedGlyphs,
			@ByValue CGPoint point);

	@Generated
	@Selector("elementAtIndex:")
	public native long elementAtIndex(long index);

	@Generated
	@Selector("elementAtIndex:associatedPoints:")
	public native long elementAtIndexAssociatedPoints(
			long index,
			@UncertainArgument("Options: reference, array Fallback: reference") CGPoint points);

	@Generated
	@Selector("elementCount")
	public native long elementCount();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("fill")
	public native void fill();

	@Generated
	@Selector("fillRect:")
	public static native void fillRect(@ByValue CGRect rect);

	@Generated
	@Selector("flatness")
	public native double flatness();

	@Generated
	@Selector("getLineDash:count:phase:")
	public native void getLineDashCountPhase(DoublePtr pattern, LongPtr count,
			DoublePtr phase);

	@Generated
	@Selector("init")
	public native NSBezierPath init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("isEmpty")
	public native boolean isEmpty();

	@Generated
	@Selector("lineCapStyle")
	public native long lineCapStyle();

	@Generated
	@Selector("lineJoinStyle")
	public native long lineJoinStyle();

	@Generated
	@Selector("lineToPoint:")
	public native void lineToPoint(@ByValue CGPoint point);

	@Generated
	@Selector("lineWidth")
	public native double lineWidth();

	@Generated
	@Selector("miterLimit")
	public native double miterLimit();

	@Generated
	@Selector("moveToPoint:")
	public native void moveToPoint(@ByValue CGPoint point);

	@Generated
	@Selector("relativeCurveToPoint:controlPoint1:controlPoint2:")
	public native void relativeCurveToPointControlPoint1ControlPoint2(
			@ByValue CGPoint endPoint, @ByValue CGPoint controlPoint1,
			@ByValue CGPoint controlPoint2);

	@Generated
	@Selector("relativeLineToPoint:")
	public native void relativeLineToPoint(@ByValue CGPoint point);

	@Generated
	@Selector("relativeMoveToPoint:")
	public native void relativeMoveToPoint(@ByValue CGPoint point);

	@Generated
	@Selector("removeAllPoints")
	public native void removeAllPoints();

	@Generated
	@Selector("setAssociatedPoints:atIndex:")
	public native void setAssociatedPointsAtIndex(
			@UncertainArgument("Options: reference, array Fallback: reference") CGPoint points,
			long index);

	@Generated
	@Selector("setCachesBezierPath:")
	public native void setCachesBezierPath(boolean flag);

	@Generated
	@Selector("setClip")
	public native void setClip();

	@Generated
	@Selector("setDefaultFlatness:")
	public static native void setDefaultFlatness(double flatness);

	@Generated
	@Selector("setDefaultLineCapStyle:")
	public static native void setDefaultLineCapStyle(long lineCapStyle);

	@Generated
	@Selector("setDefaultLineJoinStyle:")
	public static native void setDefaultLineJoinStyle(long lineJoinStyle);

	@Generated
	@Selector("setDefaultLineWidth:")
	public static native void setDefaultLineWidth(double lineWidth);

	@Generated
	@Selector("setDefaultMiterLimit:")
	public static native void setDefaultMiterLimit(double limit);

	@Generated
	@Selector("setDefaultWindingRule:")
	public static native void setDefaultWindingRule(long windingRule);

	@Generated
	@Selector("setFlatness:")
	public native void setFlatness(double flatness);

	@Generated
	@Selector("setLineCapStyle:")
	public native void setLineCapStyle(long lineCapStyle);

	@Generated
	@Selector("setLineDash:count:phase:")
	public native void setLineDashCountPhase(ConstDoublePtr pattern,
			long count, double phase);

	@Generated
	@Selector("setLineJoinStyle:")
	public native void setLineJoinStyle(long lineJoinStyle);

	@Generated
	@Selector("setLineWidth:")
	public native void setLineWidth(double lineWidth);

	@Generated
	@Selector("setMiterLimit:")
	public native void setMiterLimit(double miterLimit);

	@Generated
	@Selector("setWindingRule:")
	public native void setWindingRule(long windingRule);

	@Generated
	@Selector("stroke")
	public native void stroke();

	@Generated
	@Selector("strokeLineFromPoint:toPoint:")
	public static native void strokeLineFromPointToPoint(
			@ByValue CGPoint point1, @ByValue CGPoint point2);

	@Generated
	@Selector("strokeRect:")
	public static native void strokeRect(@ByValue CGRect rect);

	@Generated
	@Selector("transformUsingAffineTransform:")
	public native void transformUsingAffineTransform(NSAffineTransform transform);

	@Generated
	@Selector("windingRule")
	public native long windingRule();
}
