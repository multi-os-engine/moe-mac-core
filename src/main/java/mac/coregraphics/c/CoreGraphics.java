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

package mac.coregraphics.c;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Inline;
import org.moe.natj.c.map.CStringArrayMapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.*;
import mac.corefoundation.opaque.*;
import mac.coregraphics.opaque.*;
import mac.coregraphics.struct.*;

@Generated
@Library("CoreGraphics")
@Runtime(CRuntime.class)
public final class CoreGraphics {
	static {
		NatJ.register();
	}

	@Generated
	private CoreGraphics() {
	}

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native CGPoint CGPointMake(double x, double y);

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native CGSize CGSizeMake(double width, double height);

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native CGVector CGVectorMake(double dx, double dy);

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native CGRect CGRectMake(double x, double y, double width,
			double height);

	@Generated
	@CFunction
	public static native double CGRectGetMinX(@ByValue CGRect rect);

	@Generated
	@CFunction
	public static native double CGRectGetMidX(@ByValue CGRect rect);

	@Generated
	@CFunction
	public static native double CGRectGetMaxX(@ByValue CGRect rect);

	@Generated
	@CFunction
	public static native double CGRectGetMinY(@ByValue CGRect rect);

	@Generated
	@CFunction
	public static native double CGRectGetMidY(@ByValue CGRect rect);

	@Generated
	@CFunction
	public static native double CGRectGetMaxY(@ByValue CGRect rect);

	@Generated
	@CFunction
	public static native double CGRectGetWidth(@ByValue CGRect rect);

	@Generated
	@CFunction
	public static native double CGRectGetHeight(@ByValue CGRect rect);

	@Generated
	@CFunction
	public static native boolean CGPointEqualToPoint(@ByValue CGPoint point1,
			@ByValue CGPoint point2);

	@Generated
	@CFunction
	public static native boolean CGSizeEqualToSize(@ByValue CGSize size1,
			@ByValue CGSize size2);

	@Generated
	@CFunction
	public static native boolean CGRectEqualToRect(@ByValue CGRect rect1,
			@ByValue CGRect rect2);

	@Generated
	@CFunction
	@ByValue
	public static native CGRect CGRectStandardize(@ByValue CGRect rect);

	@Generated
	@CFunction
	public static native boolean CGRectIsEmpty(@ByValue CGRect rect);

	@Generated
	@CFunction
	public static native boolean CGRectIsNull(@ByValue CGRect rect);

	@Generated
	@CFunction
	public static native boolean CGRectIsInfinite(@ByValue CGRect rect);

	@Generated
	@CFunction
	@ByValue
	public static native CGRect CGRectInset(@ByValue CGRect rect, double dx,
			double dy);

	@Generated
	@CFunction
	@ByValue
	public static native CGRect CGRectIntegral(@ByValue CGRect rect);

	@Generated
	@CFunction
	@ByValue
	public static native CGRect CGRectUnion(@ByValue CGRect r1,
			@ByValue CGRect r2);

	@Generated
	@CFunction
	@ByValue
	public static native CGRect CGRectIntersection(@ByValue CGRect r1,
			@ByValue CGRect r2);

	@Generated
	@CFunction
	@ByValue
	public static native CGRect CGRectOffset(@ByValue CGRect rect, double dx,
			double dy);

	@Generated
	@CFunction
	public static native void CGRectDivide(
			@ByValue CGRect rect,
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect slice,
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect remainder,
			double amount, int edge);

	@Generated
	@CFunction
	public static native boolean CGRectContainsPoint(@ByValue CGRect rect,
			@ByValue CGPoint point);

	@Generated
	@CFunction
	public static native boolean CGRectContainsRect(@ByValue CGRect rect1,
			@ByValue CGRect rect2);

	@Generated
	@CFunction
	public static native boolean CGRectIntersectsRect(@ByValue CGRect rect1,
			@ByValue CGRect rect2);

	@Generated
	@CFunction
	public static native CFDictionaryRef CGPointCreateDictionaryRepresentation(
			@ByValue CGPoint point);

	@Generated
	@CFunction
	public static native boolean CGPointMakeWithDictionaryRepresentation(
			CFDictionaryRef dict,
			@UncertainArgument("Options: reference, array Fallback: reference") CGPoint point);

	@Generated
	@CFunction
	public static native CFDictionaryRef CGSizeCreateDictionaryRepresentation(
			@ByValue CGSize size);

	@Generated
	@CFunction
	public static native boolean CGSizeMakeWithDictionaryRepresentation(
			CFDictionaryRef dict,
			@UncertainArgument("Options: reference, array Fallback: reference") CGSize size);

	@Generated
	@CFunction
	public static native CFDictionaryRef CGRectCreateDictionaryRepresentation(
			@ByValue CGRect arg1);

	@Generated
	@CFunction
	public static native boolean CGRectMakeWithDictionaryRepresentation(
			CFDictionaryRef dict,
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect rect);

	@Generated
	@Inline
	@CFunction
	public static native boolean __CGPointEqualToPoint(@ByValue CGPoint point1,
			@ByValue CGPoint point2);

	@Generated
	@Inline
	@CFunction
	public static native boolean __CGSizeEqualToSize(@ByValue CGSize size1,
			@ByValue CGSize size2);

	@Generated
	@CFunction
	@ByValue
	public static native CGAffineTransform CGAffineTransformMake(double a,
			double b, double c, double d, double tx, double ty);

	@Generated
	@CFunction
	@ByValue
	public static native CGAffineTransform CGAffineTransformMakeTranslation(
			double tx, double ty);

	@Generated
	@CFunction
	@ByValue
	public static native CGAffineTransform CGAffineTransformMakeScale(
			double sx, double sy);

	@Generated
	@CFunction
	@ByValue
	public static native CGAffineTransform CGAffineTransformMakeRotation(
			double angle);

	@Generated
	@CFunction
	public static native boolean CGAffineTransformIsIdentity(
			@ByValue CGAffineTransform t);

	@Generated
	@CFunction
	@ByValue
	public static native CGAffineTransform CGAffineTransformTranslate(
			@ByValue CGAffineTransform t, double tx, double ty);

	@Generated
	@CFunction
	@ByValue
	public static native CGAffineTransform CGAffineTransformScale(
			@ByValue CGAffineTransform t, double sx, double sy);

	@Generated
	@CFunction
	@ByValue
	public static native CGAffineTransform CGAffineTransformRotate(
			@ByValue CGAffineTransform t, double angle);

	@Generated
	@CFunction
	@ByValue
	public static native CGAffineTransform CGAffineTransformInvert(
			@ByValue CGAffineTransform t);

	@Generated
	@CFunction
	@ByValue
	public static native CGAffineTransform CGAffineTransformConcat(
			@ByValue CGAffineTransform t1, @ByValue CGAffineTransform t2);

	@Generated
	@CFunction
	public static native boolean CGAffineTransformEqualToTransform(
			@ByValue CGAffineTransform t1, @ByValue CGAffineTransform t2);

	@Generated
	@CFunction
	@ByValue
	public static native CGPoint CGPointApplyAffineTransform(
			@ByValue CGPoint point, @ByValue CGAffineTransform t);

	@Generated
	@CFunction
	@ByValue
	public static native CGSize CGSizeApplyAffineTransform(
			@ByValue CGSize size, @ByValue CGAffineTransform t);

	@Generated
	@CFunction
	@ByValue
	public static native CGRect CGRectApplyAffineTransform(
			@ByValue CGRect rect, @ByValue CGAffineTransform t);

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native CGAffineTransform __CGAffineTransformMake(double a,
			double b, double c, double d, double tx, double ty);

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native CGPoint __CGPointApplyAffineTransform(
			@ByValue CGPoint point, @ByValue CGAffineTransform t);

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native CGSize __CGSizeApplyAffineTransform(
			@ByValue CGSize size, @ByValue CGAffineTransform t);

	@Generated
	@CFunction
	public static native long CGDataProviderGetTypeID();

	@Generated
	@CFunction
	public static native CGDataProviderRef CGDataProviderCreateSequential(
			VoidPtr info,
			@UncertainArgument("Options: reference, array Fallback: reference") CGDataProviderSequentialCallbacks callbacks);

	@Generated
	@CFunction
	public static native CGDataProviderRef CGDataProviderCreateDirect(
			VoidPtr info,
			long size,
			@UncertainArgument("Options: reference, array Fallback: reference") CGDataProviderDirectCallbacks callbacks);

	@Generated
	@CFunction
	public static native CGDataProviderRef CGDataProviderCreateWithData(
			VoidPtr info,
			ConstVoidPtr data,
			long size,
			@FunctionPtr(name = "call_CGDataProviderCreateWithData") Function_CGDataProviderCreateWithData releaseData);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CGDataProviderCreateWithData {
		@Generated
		public void call_CGDataProviderCreateWithData(VoidPtr arg0,
				ConstVoidPtr arg1, long arg2);
	}

	@Generated
	@CFunction
	public static native CGDataProviderRef CGDataProviderCreateWithCFData(
			CFDataRef data);

	@Generated
	@CFunction
	public static native CGDataProviderRef CGDataProviderCreateWithURL(
			CFURLRef url);

	@Generated
	@CFunction
	public static native CGDataProviderRef CGDataProviderCreateWithFilename(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String filename);

	@Generated
	@CFunction
	public static native CGDataProviderRef CGDataProviderRetain(
			CGDataProviderRef provider);

	@Generated
	@CFunction
	public static native void CGDataProviderRelease(CGDataProviderRef provider);

	@Generated
	@CFunction
	public static native CFDataRef CGDataProviderCopyData(
			CGDataProviderRef provider);

	@Generated
	@CFunction
	public static native CGColorSpaceRef CGColorSpaceCreateDeviceGray();

	@Generated
	@CFunction
	public static native CGColorSpaceRef CGColorSpaceCreateDeviceRGB();

	@Generated
	@CFunction
	public static native CGColorSpaceRef CGColorSpaceCreateDeviceCMYK();

	@Generated
	@CFunction
	public static native CGColorSpaceRef CGColorSpaceCreateWithICCProfile(
			CFDataRef data);

	@Generated
	@CFunction
	public static native CGColorSpaceRef CGColorSpaceCreateICCBased(
			long nComponents, ConstDoublePtr range, CGDataProviderRef profile,
			CGColorSpaceRef alternate);

	@Generated
	@CFunction
	public static native CGColorSpaceRef CGColorSpaceCreateIndexed(
			CGColorSpaceRef baseSpace,
			long lastIndex,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String colorTable);

	@Generated
	@CFunction
	public static native CGColorSpaceRef CGColorSpaceCreatePattern(
			CGColorSpaceRef baseSpace);

	@Generated
	@CFunction
	public static native CGColorSpaceRef CGColorSpaceCreateWithName(
			CFStringRef name);

	@Generated
	@CFunction
	public static native CGColorSpaceRef CGColorSpaceRetain(
			CGColorSpaceRef space);

	@Generated
	@CFunction
	public static native void CGColorSpaceRelease(CGColorSpaceRef space);

	@Generated
	@CFunction
	public static native long CGColorSpaceGetTypeID();

	@Generated
	@CFunction
	public static native long CGColorSpaceGetNumberOfComponents(
			CGColorSpaceRef space);

	@Generated
	@CFunction
	public static native int CGColorSpaceGetModel(CGColorSpaceRef space);

	@Generated
	@CFunction
	public static native CGColorSpaceRef CGColorSpaceGetBaseColorSpace(
			CGColorSpaceRef space);

	@Generated
	@CFunction
	public static native long CGColorSpaceGetColorTableCount(
			CGColorSpaceRef space);

	@Generated
	@CFunction
	public static native void CGColorSpaceGetColorTable(CGColorSpaceRef space,
			BytePtr table);

	@Generated
	@CFunction
	public static native CFDataRef CGColorSpaceCopyICCProfile(
			CGColorSpaceRef space);

	@Generated
	@CFunction
	public static native long CGPatternGetTypeID();

	@Generated
	@CFunction
	public static native CGPatternRef CGPatternCreate(
			VoidPtr info,
			@ByValue CGRect bounds,
			@ByValue CGAffineTransform matrix,
			double xStep,
			double yStep,
			int tiling,
			boolean isColored,
			@UncertainArgument("Options: reference, array Fallback: reference") CGPatternCallbacks callbacks);

	@Generated
	@CFunction
	public static native CGPatternRef CGPatternRetain(CGPatternRef pattern);

	@Generated
	@CFunction
	public static native void CGPatternRelease(CGPatternRef pattern);

	@Generated
	@CFunction
	public static native CGColorRef CGColorCreate(CGColorSpaceRef space,
			ConstDoublePtr components);

	@Generated
	@CFunction
	public static native CGColorRef CGColorCreateWithPattern(
			CGColorSpaceRef space, CGPatternRef pattern,
			ConstDoublePtr components);

	@Generated
	@CFunction
	public static native CGColorRef CGColorCreateCopy(CGColorRef color);

	@Generated
	@CFunction
	public static native CGColorRef CGColorCreateCopyWithAlpha(
			CGColorRef color, double alpha);

	@Generated
	@CFunction
	public static native CGColorRef CGColorRetain(CGColorRef color);

	@Generated
	@CFunction
	public static native void CGColorRelease(CGColorRef color);

	@Generated
	@CFunction
	public static native boolean CGColorEqualToColor(CGColorRef color1,
			CGColorRef color2);

	@Generated
	@CFunction
	public static native long CGColorGetNumberOfComponents(CGColorRef color);

	@Generated
	@CFunction
	public static native ConstDoublePtr CGColorGetComponents(CGColorRef color);

	@Generated
	@CFunction
	public static native double CGColorGetAlpha(CGColorRef color);

	@Generated
	@CFunction
	public static native CGColorSpaceRef CGColorGetColorSpace(CGColorRef color);

	@Generated
	@CFunction
	public static native CGPatternRef CGColorGetPattern(CGColorRef color);

	@Generated
	@CFunction
	public static native long CGColorGetTypeID();

	@Generated
	@CFunction
	public static native long CGFontGetTypeID();

	@Generated
	@CFunction
	public static native CGFontRef CGFontCreateWithDataProvider(
			CGDataProviderRef provider);

	@Generated
	@CFunction
	public static native CGFontRef CGFontCreateWithFontName(CFStringRef name);

	@Generated
	@CFunction
	public static native CGFontRef CGFontCreateCopyWithVariations(
			CGFontRef font, CFDictionaryRef variations);

	@Generated
	@CFunction
	public static native CGFontRef CGFontRetain(CGFontRef font);

	@Generated
	@CFunction
	public static native void CGFontRelease(CGFontRef font);

	@Generated
	@CFunction
	public static native long CGFontGetNumberOfGlyphs(CGFontRef font);

	@Generated
	@CFunction
	public static native int CGFontGetUnitsPerEm(CGFontRef font);

	@Generated
	@CFunction
	public static native CFStringRef CGFontCopyPostScriptName(CGFontRef font);

	@Generated
	@CFunction
	public static native CFStringRef CGFontCopyFullName(CGFontRef font);

	@Generated
	@CFunction
	public static native int CGFontGetAscent(CGFontRef font);

	@Generated
	@CFunction
	public static native int CGFontGetDescent(CGFontRef font);

	@Generated
	@CFunction
	public static native int CGFontGetLeading(CGFontRef font);

	@Generated
	@CFunction
	public static native int CGFontGetCapHeight(CGFontRef font);

	@Generated
	@CFunction
	public static native int CGFontGetXHeight(CGFontRef font);

	@Generated
	@CFunction
	@ByValue
	public static native CGRect CGFontGetFontBBox(CGFontRef font);

	@Generated
	@CFunction
	public static native double CGFontGetItalicAngle(CGFontRef font);

	@Generated
	@CFunction
	public static native double CGFontGetStemV(CGFontRef font);

	@Generated
	@CFunction
	public static native CFArrayRef CGFontCopyVariationAxes(CGFontRef font);

	@Generated
	@CFunction
	public static native CFDictionaryRef CGFontCopyVariations(CGFontRef font);

	@Generated
	@CFunction
	public static native boolean CGFontGetGlyphAdvances(CGFontRef font,
			ConstShortPtr glyphs, long count, IntPtr advances);

	@Generated
	@CFunction
	public static native boolean CGFontGetGlyphBBoxes(
			CGFontRef font,
			ConstShortPtr glyphs,
			long count,
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect bboxes);

	@Generated
	@CFunction
	public static native short CGFontGetGlyphWithGlyphName(CGFontRef font,
			CFStringRef name);

	@Generated
	@CFunction
	public static native CFStringRef CGFontCopyGlyphNameForGlyph(
			CGFontRef font, short glyph);

	@Generated
	@CFunction
	public static native boolean CGFontCanCreatePostScriptSubset(
			CGFontRef font, int format);

	@Generated
	@CFunction
	public static native CFArrayRef CGFontCopyTableTags(CGFontRef font);

	@Generated
	@CFunction
	public static native CFDataRef CGFontCopyTableForTag(CGFontRef font, int tag);

	@Generated
	@CFunction
	public static native long CGGradientGetTypeID();

	@Generated
	@CFunction
	public static native CGGradientRef CGGradientCreateWithColorComponents(
			CGColorSpaceRef space, ConstDoublePtr components,
			ConstDoublePtr locations, long count);

	@Generated
	@CFunction
	public static native CGGradientRef CGGradientCreateWithColors(
			CGColorSpaceRef space, CFArrayRef colors, ConstDoublePtr locations);

	@Generated
	@CFunction
	public static native CGGradientRef CGGradientRetain(CGGradientRef gradient);

	@Generated
	@CFunction
	public static native void CGGradientRelease(CGGradientRef gradient);

	@Generated
	@CFunction
	public static native long CGImageGetTypeID();

	@Generated
	@CFunction
	public static native CGImageRef CGImageCreate(long width, long height,
			long bitsPerComponent, long bitsPerPixel, long bytesPerRow,
			CGColorSpaceRef space, int bitmapInfo, CGDataProviderRef provider,
			ConstDoublePtr decode, boolean shouldInterpolate, int intent);

	@Generated
	@CFunction
	public static native CGImageRef CGImageMaskCreate(long width, long height,
			long bitsPerComponent, long bitsPerPixel, long bytesPerRow,
			CGDataProviderRef provider, ConstDoublePtr decode,
			boolean shouldInterpolate);

	@Generated
	@CFunction
	public static native CGImageRef CGImageCreateCopy(CGImageRef image);

	@Generated
	@CFunction
	public static native CGImageRef CGImageCreateWithJPEGDataProvider(
			CGDataProviderRef source, ConstDoublePtr decode,
			boolean shouldInterpolate, int intent);

	@Generated
	@CFunction
	public static native CGImageRef CGImageCreateWithPNGDataProvider(
			CGDataProviderRef source, ConstDoublePtr decode,
			boolean shouldInterpolate, int intent);

	@Generated
	@CFunction
	public static native CGImageRef CGImageCreateWithImageInRect(
			CGImageRef image, @ByValue CGRect rect);

	@Generated
	@CFunction
	public static native CGImageRef CGImageCreateWithMask(CGImageRef image,
			CGImageRef mask);

	@Generated
	@CFunction
	public static native CGImageRef CGImageCreateWithMaskingColors(
			CGImageRef image, ConstDoublePtr components);

	@Generated
	@CFunction
	public static native CGImageRef CGImageCreateCopyWithColorSpace(
			CGImageRef image, CGColorSpaceRef space);

	@Generated
	@CFunction
	public static native CGImageRef CGImageRetain(CGImageRef image);

	@Generated
	@CFunction
	public static native void CGImageRelease(CGImageRef image);

	@Generated
	@CFunction
	public static native boolean CGImageIsMask(CGImageRef image);

	@Generated
	@CFunction
	public static native long CGImageGetWidth(CGImageRef image);

	@Generated
	@CFunction
	public static native long CGImageGetHeight(CGImageRef image);

	@Generated
	@CFunction
	public static native long CGImageGetBitsPerComponent(CGImageRef image);

	@Generated
	@CFunction
	public static native long CGImageGetBitsPerPixel(CGImageRef image);

	@Generated
	@CFunction
	public static native long CGImageGetBytesPerRow(CGImageRef image);

	@Generated
	@CFunction
	public static native CGColorSpaceRef CGImageGetColorSpace(CGImageRef image);

	@Generated
	@CFunction
	public static native int CGImageGetAlphaInfo(CGImageRef image);

	@Generated
	@CFunction
	public static native CGDataProviderRef CGImageGetDataProvider(
			CGImageRef image);

	@Generated
	@CFunction
	public static native ConstDoublePtr CGImageGetDecode(CGImageRef image);

	@Generated
	@CFunction
	public static native boolean CGImageGetShouldInterpolate(CGImageRef image);

	@Generated
	@CFunction
	public static native int CGImageGetRenderingIntent(CGImageRef image);

	@Generated
	@CFunction
	public static native int CGImageGetBitmapInfo(CGImageRef image);

	@Generated
	@CFunction
	public static native long CGPathGetTypeID();

	@Generated
	@CFunction
	public static native CGMutablePathRef CGPathCreateMutable();

	@Generated
	@CFunction
	public static native CGPathRef CGPathCreateCopy(CGPathRef path);

	@Generated
	@CFunction
	public static native CGPathRef CGPathCreateCopyByTransformingPath(
			CGPathRef path,
			@UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform transform);

	@Generated
	@CFunction
	public static native CGMutablePathRef CGPathCreateMutableCopy(CGPathRef path);

	@Generated
	@CFunction
	public static native CGMutablePathRef CGPathCreateMutableCopyByTransformingPath(
			CGPathRef path,
			@UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform transform);

	@Generated
	@CFunction
	public static native CGPathRef CGPathCreateWithRect(
			@ByValue CGRect rect,
			@UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform transform);

	@Generated
	@CFunction
	public static native CGPathRef CGPathCreateWithEllipseInRect(
			@ByValue CGRect rect,
			@UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform transform);

	@Generated
	@CFunction
	public static native CGPathRef CGPathCreateWithRoundedRect(
			@ByValue CGRect rect,
			double cornerWidth,
			double cornerHeight,
			@UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform transform);

	@Generated
	@CFunction
	public static native void CGPathAddRoundedRect(
			CGMutablePathRef path,
			@UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform transform,
			@ByValue CGRect rect, double cornerWidth, double cornerHeight);

	@Generated
	@CFunction
	public static native CGPathRef CGPathCreateCopyByDashingPath(
			CGPathRef path,
			@UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform transform,
			double phase, ConstDoublePtr lengths, long count);

	@Generated
	@CFunction
	public static native CGPathRef CGPathCreateCopyByStrokingPath(
			CGPathRef path,
			@UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform transform,
			double lineWidth, int lineCap, int lineJoin, double miterLimit);

	@Generated
	@CFunction
	public static native CGPathRef CGPathRetain(CGPathRef path);

	@Generated
	@CFunction
	public static native void CGPathRelease(CGPathRef path);

	@Generated
	@CFunction
	public static native boolean CGPathEqualToPath(CGPathRef path1,
			CGPathRef path2);

	@Generated
	@CFunction
	public static native void CGPathMoveToPoint(
			CGMutablePathRef path,
			@UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
			double x, double y);

	@Generated
	@CFunction
	public static native void CGPathAddLineToPoint(
			CGMutablePathRef path,
			@UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
			double x, double y);

	@Generated
	@CFunction
	public static native void CGPathAddQuadCurveToPoint(
			CGMutablePathRef path,
			@UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
			double cpx, double cpy, double x, double y);

	@Generated
	@CFunction
	public static native void CGPathAddCurveToPoint(
			CGMutablePathRef path,
			@UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
			double cp1x, double cp1y, double cp2x, double cp2y, double x,
			double y);

	@Generated
	@CFunction
	public static native void CGPathCloseSubpath(CGMutablePathRef path);

	@Generated
	@CFunction
	public static native void CGPathAddRect(
			CGMutablePathRef path,
			@UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
			@ByValue CGRect rect);

	@Generated
	@CFunction
	public static native void CGPathAddRects(
			CGMutablePathRef path,
			@UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect rects,
			long count);

	@Generated
	@CFunction
	public static native void CGPathAddLines(
			CGMutablePathRef path,
			@UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
			@UncertainArgument("Options: reference, array Fallback: reference") CGPoint points,
			long count);

	@Generated
	@CFunction
	public static native void CGPathAddEllipseInRect(
			CGMutablePathRef path,
			@UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
			@ByValue CGRect rect);

	@Generated
	@CFunction
	public static native void CGPathAddRelativeArc(
			CGMutablePathRef path,
			@UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix,
			double x, double y, double radius, double startAngle, double delta);

	@Generated
	@CFunction
	public static native void CGPathAddArc(
			CGMutablePathRef path,
			@UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
			double x, double y, double radius, double startAngle,
			double endAngle, boolean clockwise);

	@Generated
	@CFunction
	public static native void CGPathAddArcToPoint(
			CGMutablePathRef path,
			@UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
			double x1, double y1, double x2, double y2, double radius);

	@Generated
	@CFunction
	public static native void CGPathAddPath(
			CGMutablePathRef path1,
			@UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
			CGPathRef path2);

	@Generated
	@CFunction
	public static native boolean CGPathIsEmpty(CGPathRef path);

	@Generated
	@CFunction
	public static native boolean CGPathIsRect(
			CGPathRef path,
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect rect);

	@Generated
	@CFunction
	@ByValue
	public static native CGPoint CGPathGetCurrentPoint(CGPathRef path);

	@Generated
	@CFunction
	@ByValue
	public static native CGRect CGPathGetBoundingBox(CGPathRef path);

	@Generated
	@CFunction
	@ByValue
	public static native CGRect CGPathGetPathBoundingBox(CGPathRef path);

	@Generated
	@CFunction
	public static native boolean CGPathContainsPoint(
			CGPathRef path,
			@UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
			@ByValue CGPoint point, boolean eoFill);

	@Generated
	@CFunction
	public static native void CGPathApply(
			CGPathRef path,
			VoidPtr info,
			@FunctionPtr(name = "call_CGPathApply") Function_CGPathApply function);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CGPathApply {
		@Generated
		public void call_CGPathApply(
				VoidPtr arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") CGPathElement arg1);
	}

	@Generated
	@CFunction
	public static native int CGPDFObjectGetType(CGPDFObjectRef object);

	@Generated
	@CFunction
	public static native boolean CGPDFObjectGetValue(CGPDFObjectRef object,
			int type, VoidPtr value);

	@Generated
	@CFunction
	public static native CGPDFDictionaryRef CGPDFStreamGetDictionary(
			CGPDFStreamRef stream);

	@Generated
	@CFunction
	public static native CFDataRef CGPDFStreamCopyData(CGPDFStreamRef stream,
			IntPtr format);

	@Generated
	@CFunction
	public static native long CGPDFStringGetLength(CGPDFStringRef string);

	@Generated
	@CFunction
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public static native String CGPDFStringGetBytePtr(CGPDFStringRef string);

	@Generated
	@CFunction
	public static native CFStringRef CGPDFStringCopyTextString(
			CGPDFStringRef string);

	@Generated
	@CFunction
	public static native CFDateRef CGPDFStringCopyDate(CGPDFStringRef string);

	@Generated
	@CFunction
	public static native long CGPDFArrayGetCount(CGPDFArrayRef array);

	@Generated
	@CFunction
	public static native boolean CGPDFArrayGetObject(CGPDFArrayRef array,
			long index, Ptr<CGPDFObjectRef> value);

	@Generated
	@CFunction
	public static native boolean CGPDFArrayGetNull(CGPDFArrayRef array,
			long index);

	@Generated
	@CFunction
	public static native boolean CGPDFArrayGetBoolean(CGPDFArrayRef array,
			long index, BytePtr value);

	@Generated
	@CFunction
	public static native boolean CGPDFArrayGetInteger(CGPDFArrayRef array,
			long index, LongPtr value);

	@Generated
	@CFunction
	public static native boolean CGPDFArrayGetNumber(CGPDFArrayRef array,
			long index, DoublePtr value);

	@Generated
	@CFunction
	public static native boolean CGPDFArrayGetName(
			CGPDFArrayRef array,
			long index,
			@UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] value);

	@Generated
	@CFunction
	public static native boolean CGPDFArrayGetString(CGPDFArrayRef array,
			long index, Ptr<CGPDFStringRef> value);

	@Generated
	@CFunction
	public static native boolean CGPDFArrayGetArray(CGPDFArrayRef array,
			long index, Ptr<CGPDFArrayRef> value);

	@Generated
	@CFunction
	public static native boolean CGPDFArrayGetDictionary(CGPDFArrayRef array,
			long index, Ptr<CGPDFDictionaryRef> value);

	@Generated
	@CFunction
	public static native boolean CGPDFArrayGetStream(CGPDFArrayRef array,
			long index, Ptr<CGPDFStreamRef> value);

	@Generated
	@CFunction
	public static native long CGPDFDictionaryGetCount(CGPDFDictionaryRef dict);

	@Generated
	@CFunction
	public static native boolean CGPDFDictionaryGetObject(
			CGPDFDictionaryRef dict,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
			Ptr<CGPDFObjectRef> value);

	@Generated
	@CFunction
	public static native boolean CGPDFDictionaryGetBoolean(
			CGPDFDictionaryRef dict,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
			BytePtr value);

	@Generated
	@CFunction
	public static native boolean CGPDFDictionaryGetInteger(
			CGPDFDictionaryRef dict,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
			LongPtr value);

	@Generated
	@CFunction
	public static native boolean CGPDFDictionaryGetNumber(
			CGPDFDictionaryRef dict,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
			DoublePtr value);

	@Generated
	@CFunction
	public static native boolean CGPDFDictionaryGetName(
			CGPDFDictionaryRef dict,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
			@UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] value);

	@Generated
	@CFunction
	public static native boolean CGPDFDictionaryGetString(
			CGPDFDictionaryRef dict,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
			Ptr<CGPDFStringRef> value);

	@Generated
	@CFunction
	public static native boolean CGPDFDictionaryGetArray(
			CGPDFDictionaryRef dict,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
			Ptr<CGPDFArrayRef> value);

	@Generated
	@CFunction
	public static native boolean CGPDFDictionaryGetDictionary(
			CGPDFDictionaryRef dict,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
			Ptr<CGPDFDictionaryRef> value);

	@Generated
	@CFunction
	public static native boolean CGPDFDictionaryGetStream(
			CGPDFDictionaryRef dict,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
			Ptr<CGPDFStreamRef> value);

	@Generated
	@CFunction
	public static native void CGPDFDictionaryApplyFunction(
			CGPDFDictionaryRef dict,
			@FunctionPtr(name = "call_CGPDFDictionaryApplyFunction") Function_CGPDFDictionaryApplyFunction function,
			VoidPtr info);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CGPDFDictionaryApplyFunction {
		@Generated
		public void call_CGPDFDictionaryApplyFunction(
				@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg0,
				VoidPtr arg1, VoidPtr arg2);
	}

	@Generated
	@CFunction
	public static native CGPDFPageRef CGPDFPageRetain(CGPDFPageRef page);

	@Generated
	@CFunction
	public static native void CGPDFPageRelease(CGPDFPageRef page);

	@Generated
	@CFunction
	public static native CGPDFDocumentRef CGPDFPageGetDocument(CGPDFPageRef page);

	@Generated
	@CFunction
	public static native long CGPDFPageGetPageNumber(CGPDFPageRef page);

	@Generated
	@CFunction
	@ByValue
	public static native CGRect CGPDFPageGetBoxRect(CGPDFPageRef page, int box);

	@Generated
	@CFunction
	public static native int CGPDFPageGetRotationAngle(CGPDFPageRef page);

	@Generated
	@CFunction
	@ByValue
	public static native CGAffineTransform CGPDFPageGetDrawingTransform(
			CGPDFPageRef page, int box, @ByValue CGRect rect, int rotate,
			boolean preserveAspectRatio);

	@Generated
	@CFunction
	public static native CGPDFDictionaryRef CGPDFPageGetDictionary(
			CGPDFPageRef page);

	@Generated
	@CFunction
	public static native long CGPDFPageGetTypeID();

	@Generated
	@CFunction
	public static native CGPDFDocumentRef CGPDFDocumentCreateWithProvider(
			CGDataProviderRef provider);

	@Generated
	@CFunction
	public static native CGPDFDocumentRef CGPDFDocumentCreateWithURL(
			CFURLRef url);

	@Generated
	@CFunction
	public static native CGPDFDocumentRef CGPDFDocumentRetain(
			CGPDFDocumentRef document);

	@Generated
	@CFunction
	public static native void CGPDFDocumentRelease(CGPDFDocumentRef document);

	@Generated
	@CFunction
	public static native void CGPDFDocumentGetVersion(
			CGPDFDocumentRef document, IntPtr majorVersion, IntPtr minorVersion);

	@Generated
	@CFunction
	public static native boolean CGPDFDocumentIsEncrypted(
			CGPDFDocumentRef document);

	@Generated
	@CFunction
	public static native boolean CGPDFDocumentUnlockWithPassword(
			CGPDFDocumentRef document,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String password);

	@Generated
	@CFunction
	public static native boolean CGPDFDocumentIsUnlocked(
			CGPDFDocumentRef document);

	@Generated
	@CFunction
	public static native boolean CGPDFDocumentAllowsPrinting(
			CGPDFDocumentRef document);

	@Generated
	@CFunction
	public static native boolean CGPDFDocumentAllowsCopying(
			CGPDFDocumentRef document);

	@Generated
	@CFunction
	public static native long CGPDFDocumentGetNumberOfPages(
			CGPDFDocumentRef document);

	@Generated
	@CFunction
	public static native CGPDFPageRef CGPDFDocumentGetPage(
			CGPDFDocumentRef document, long pageNumber);

	@Generated
	@CFunction
	public static native CGPDFDictionaryRef CGPDFDocumentGetCatalog(
			CGPDFDocumentRef document);

	@Generated
	@CFunction
	public static native CGPDFDictionaryRef CGPDFDocumentGetInfo(
			CGPDFDocumentRef document);

	@Generated
	@CFunction
	public static native CGPDFArrayRef CGPDFDocumentGetID(
			CGPDFDocumentRef document);

	@Generated
	@CFunction
	public static native long CGPDFDocumentGetTypeID();

	@Generated
	@CFunction
	public static native long CGFunctionGetTypeID();

	@Generated
	@CFunction
	public static native CGFunctionRef CGFunctionCreate(
			VoidPtr info,
			long domainDimension,
			ConstDoublePtr domain,
			long rangeDimension,
			ConstDoublePtr range,
			@UncertainArgument("Options: reference, array Fallback: reference") CGFunctionCallbacks callbacks);

	@Generated
	@CFunction
	public static native CGFunctionRef CGFunctionRetain(CGFunctionRef function);

	@Generated
	@CFunction
	public static native void CGFunctionRelease(CGFunctionRef function);

	@Generated
	@CFunction
	public static native long CGShadingGetTypeID();

	@Generated
	@CFunction
	public static native CGShadingRef CGShadingCreateAxial(
			CGColorSpaceRef space, @ByValue CGPoint start,
			@ByValue CGPoint end, CGFunctionRef function, boolean extendStart,
			boolean extendEnd);

	@Generated
	@CFunction
	public static native CGShadingRef CGShadingCreateRadial(
			CGColorSpaceRef space, @ByValue CGPoint start, double startRadius,
			@ByValue CGPoint end, double endRadius, CGFunctionRef function,
			boolean extendStart, boolean extendEnd);

	@Generated
	@CFunction
	public static native CGShadingRef CGShadingRetain(CGShadingRef shading);

	@Generated
	@CFunction
	public static native void CGShadingRelease(CGShadingRef shading);

	@Generated
	@CFunction
	public static native long CGContextGetTypeID();

	@Generated
	@CFunction
	public static native void CGContextSaveGState(CGContextRef c);

	@Generated
	@CFunction
	public static native void CGContextRestoreGState(CGContextRef c);

	@Generated
	@CFunction
	public static native void CGContextScaleCTM(CGContextRef c, double sx,
			double sy);

	@Generated
	@CFunction
	public static native void CGContextTranslateCTM(CGContextRef c, double tx,
			double ty);

	@Generated
	@CFunction
	public static native void CGContextRotateCTM(CGContextRef c, double angle);

	@Generated
	@CFunction
	public static native void CGContextConcatCTM(CGContextRef c,
			@ByValue CGAffineTransform transform);

	@Generated
	@CFunction
	@ByValue
	public static native CGAffineTransform CGContextGetCTM(CGContextRef c);

	@Generated
	@CFunction
	public static native void CGContextSetLineWidth(CGContextRef c, double width);

	@Generated
	@CFunction
	public static native void CGContextSetLineCap(CGContextRef c, int cap);

	@Generated
	@CFunction
	public static native void CGContextSetLineJoin(CGContextRef c, int join);

	@Generated
	@CFunction
	public static native void CGContextSetMiterLimit(CGContextRef c,
			double limit);

	@Generated
	@CFunction
	public static native void CGContextSetLineDash(CGContextRef c,
			double phase, ConstDoublePtr lengths, long count);

	@Generated
	@CFunction
	public static native void CGContextSetFlatness(CGContextRef c,
			double flatness);

	@Generated
	@CFunction
	public static native void CGContextSetAlpha(CGContextRef c, double alpha);

	@Generated
	@CFunction
	public static native void CGContextSetBlendMode(CGContextRef context,
			int mode);

	@Generated
	@CFunction
	public static native void CGContextBeginPath(CGContextRef c);

	@Generated
	@CFunction
	public static native void CGContextMoveToPoint(CGContextRef c, double x,
			double y);

	@Generated
	@CFunction
	public static native void CGContextAddLineToPoint(CGContextRef c, double x,
			double y);

	@Generated
	@CFunction
	public static native void CGContextAddCurveToPoint(CGContextRef c,
			double cp1x, double cp1y, double cp2x, double cp2y, double x,
			double y);

	@Generated
	@CFunction
	public static native void CGContextAddQuadCurveToPoint(CGContextRef c,
			double cpx, double cpy, double x, double y);

	@Generated
	@CFunction
	public static native void CGContextClosePath(CGContextRef c);

	@Generated
	@CFunction
	public static native void CGContextAddRect(CGContextRef c,
			@ByValue CGRect rect);

	@Generated
	@CFunction
	public static native void CGContextAddRects(
			CGContextRef c,
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect rects,
			long count);

	@Generated
	@CFunction
	public static native void CGContextAddLines(
			CGContextRef c,
			@UncertainArgument("Options: reference, array Fallback: reference") CGPoint points,
			long count);

	@Generated
	@CFunction
	public static native void CGContextAddEllipseInRect(CGContextRef context,
			@ByValue CGRect rect);

	@Generated
	@CFunction
	public static native void CGContextAddArc(CGContextRef c, double x,
			double y, double radius, double startAngle, double endAngle,
			int clockwise);

	@Generated
	@CFunction
	public static native void CGContextAddArcToPoint(CGContextRef c, double x1,
			double y1, double x2, double y2, double radius);

	@Generated
	@CFunction
	public static native void CGContextAddPath(CGContextRef context,
			CGPathRef path);

	@Generated
	@CFunction
	public static native void CGContextReplacePathWithStrokedPath(CGContextRef c);

	@Generated
	@CFunction
	public static native boolean CGContextIsPathEmpty(CGContextRef context);

	@Generated
	@CFunction
	@ByValue
	public static native CGPoint CGContextGetPathCurrentPoint(
			CGContextRef context);

	@Generated
	@CFunction
	@ByValue
	public static native CGRect CGContextGetPathBoundingBox(CGContextRef context);

	@Generated
	@CFunction
	public static native CGPathRef CGContextCopyPath(CGContextRef context);

	@Generated
	@CFunction
	public static native boolean CGContextPathContainsPoint(
			CGContextRef context, @ByValue CGPoint point, int mode);

	@Generated
	@CFunction
	public static native void CGContextDrawPath(CGContextRef c, int mode);

	@Generated
	@CFunction
	public static native void CGContextFillPath(CGContextRef c);

	@Generated
	@CFunction
	public static native void CGContextEOFillPath(CGContextRef c);

	@Generated
	@CFunction
	public static native void CGContextStrokePath(CGContextRef c);

	@Generated
	@CFunction
	public static native void CGContextFillRect(CGContextRef c,
			@ByValue CGRect rect);

	@Generated
	@CFunction
	public static native void CGContextFillRects(
			CGContextRef c,
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect rects,
			long count);

	@Generated
	@CFunction
	public static native void CGContextStrokeRect(CGContextRef c,
			@ByValue CGRect rect);

	@Generated
	@CFunction
	public static native void CGContextStrokeRectWithWidth(CGContextRef c,
			@ByValue CGRect rect, double width);

	@Generated
	@CFunction
	public static native void CGContextClearRect(CGContextRef c,
			@ByValue CGRect rect);

	@Generated
	@CFunction
	public static native void CGContextFillEllipseInRect(CGContextRef context,
			@ByValue CGRect rect);

	@Generated
	@CFunction
	public static native void CGContextStrokeEllipseInRect(
			CGContextRef context, @ByValue CGRect rect);

	@Generated
	@CFunction
	public static native void CGContextStrokeLineSegments(
			CGContextRef c,
			@UncertainArgument("Options: reference, array Fallback: reference") CGPoint points,
			long count);

	@Generated
	@CFunction
	public static native void CGContextClip(CGContextRef c);

	@Generated
	@CFunction
	public static native void CGContextEOClip(CGContextRef c);

	@Generated
	@CFunction
	public static native void CGContextClipToMask(CGContextRef c,
			@ByValue CGRect rect, CGImageRef mask);

	@Generated
	@CFunction
	@ByValue
	public static native CGRect CGContextGetClipBoundingBox(CGContextRef c);

	@Generated
	@CFunction
	public static native void CGContextClipToRect(CGContextRef c,
			@ByValue CGRect rect);

	@Generated
	@CFunction
	public static native void CGContextClipToRects(
			CGContextRef c,
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect rects,
			long count);

	@Generated
	@CFunction
	public static native void CGContextSetFillColorWithColor(CGContextRef c,
			CGColorRef color);

	@Generated
	@CFunction
	public static native void CGContextSetStrokeColorWithColor(CGContextRef c,
			CGColorRef color);

	@Generated
	@CFunction
	public static native void CGContextSetFillColorSpace(CGContextRef context,
			CGColorSpaceRef space);

	@Generated
	@CFunction
	public static native void CGContextSetStrokeColorSpace(
			CGContextRef context, CGColorSpaceRef space);

	@Generated
	@CFunction
	public static native void CGContextSetFillColor(CGContextRef context,
			ConstDoublePtr components);

	@Generated
	@CFunction
	public static native void CGContextSetStrokeColor(CGContextRef context,
			ConstDoublePtr components);

	@Generated
	@CFunction
	public static native void CGContextSetFillPattern(CGContextRef context,
			CGPatternRef pattern, ConstDoublePtr components);

	@Generated
	@CFunction
	public static native void CGContextSetStrokePattern(CGContextRef context,
			CGPatternRef pattern, ConstDoublePtr components);

	@Generated
	@CFunction
	public static native void CGContextSetPatternPhase(CGContextRef context,
			@ByValue CGSize phase);

	@Generated
	@CFunction
	public static native void CGContextSetGrayFillColor(CGContextRef context,
			double gray, double alpha);

	@Generated
	@CFunction
	public static native void CGContextSetGrayStrokeColor(CGContextRef context,
			double gray, double alpha);

	@Generated
	@CFunction
	public static native void CGContextSetRGBFillColor(CGContextRef context,
			double red, double green, double blue, double alpha);

	@Generated
	@CFunction
	public static native void CGContextSetRGBStrokeColor(CGContextRef context,
			double red, double green, double blue, double alpha);

	@Generated
	@CFunction
	public static native void CGContextSetCMYKFillColor(CGContextRef context,
			double cyan, double magenta, double yellow, double black,
			double alpha);

	@Generated
	@CFunction
	public static native void CGContextSetCMYKStrokeColor(CGContextRef context,
			double cyan, double magenta, double yellow, double black,
			double alpha);

	@Generated
	@CFunction
	public static native void CGContextSetRenderingIntent(CGContextRef context,
			int intent);

	@Generated
	@CFunction
	public static native void CGContextDrawImage(CGContextRef c,
			@ByValue CGRect rect, CGImageRef image);

	@Generated
	@CFunction
	public static native void CGContextDrawTiledImage(CGContextRef c,
			@ByValue CGRect rect, CGImageRef image);

	@Generated
	@CFunction
	public static native int CGContextGetInterpolationQuality(
			CGContextRef context);

	@Generated
	@CFunction
	public static native void CGContextSetInterpolationQuality(
			CGContextRef context, int quality);

	@Generated
	@CFunction
	public static native void CGContextSetShadowWithColor(CGContextRef context,
			@ByValue CGSize offset, double blur, CGColorRef color);

	@Generated
	@CFunction
	public static native void CGContextSetShadow(CGContextRef context,
			@ByValue CGSize offset, double blur);

	@Generated
	@CFunction
	public static native void CGContextDrawLinearGradient(CGContextRef context,
			CGGradientRef gradient, @ByValue CGPoint startPoint,
			@ByValue CGPoint endPoint, int options);

	@Generated
	@CFunction
	public static native void CGContextDrawRadialGradient(CGContextRef context,
			CGGradientRef gradient, @ByValue CGPoint startCenter,
			double startRadius, @ByValue CGPoint endCenter, double endRadius,
			int options);

	@Generated
	@CFunction
	public static native void CGContextDrawShading(CGContextRef context,
			CGShadingRef shading);

	@Generated
	@CFunction
	public static native void CGContextSetCharacterSpacing(
			CGContextRef context, double spacing);

	@Generated
	@CFunction
	public static native void CGContextSetTextPosition(CGContextRef c,
			double x, double y);

	@Generated
	@CFunction
	@ByValue
	public static native CGPoint CGContextGetTextPosition(CGContextRef context);

	@Generated
	@CFunction
	public static native void CGContextSetTextMatrix(CGContextRef c,
			@ByValue CGAffineTransform t);

	@Generated
	@CFunction
	@ByValue
	public static native CGAffineTransform CGContextGetTextMatrix(CGContextRef c);

	@Generated
	@CFunction
	public static native void CGContextSetTextDrawingMode(CGContextRef c,
			int mode);

	@Generated
	@CFunction
	public static native void CGContextSetFont(CGContextRef c, CGFontRef font);

	@Generated
	@CFunction
	public static native void CGContextSetFontSize(CGContextRef c, double size);

	@Generated
	@CFunction
	public static native void CGContextShowGlyphsAtPositions(
			CGContextRef context,
			ConstShortPtr glyphs,
			@UncertainArgument("Options: reference, array Fallback: reference") CGPoint positions,
			long count);

	@Generated
	@CFunction
	public static native void CGContextDrawPDFPage(CGContextRef c,
			CGPDFPageRef page);

	@Generated
	@CFunction
	public static native void CGContextBeginPage(
			CGContextRef c,
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect mediaBox);

	@Generated
	@CFunction
	public static native void CGContextEndPage(CGContextRef c);

	@Generated
	@CFunction
	public static native CGContextRef CGContextRetain(CGContextRef c);

	@Generated
	@CFunction
	public static native void CGContextRelease(CGContextRef c);

	@Generated
	@CFunction
	public static native void CGContextFlush(CGContextRef c);

	@Generated
	@CFunction
	public static native void CGContextSynchronize(CGContextRef c);

	@Generated
	@CFunction
	public static native void CGContextSetShouldAntialias(CGContextRef context,
			boolean shouldAntialias);

	@Generated
	@CFunction
	public static native void CGContextSetAllowsAntialiasing(
			CGContextRef context, boolean allowsAntialiasing);

	@Generated
	@CFunction
	public static native void CGContextSetShouldSmoothFonts(
			CGContextRef context, boolean shouldSmoothFonts);

	@Generated
	@CFunction
	public static native void CGContextSetAllowsFontSmoothing(
			CGContextRef context, boolean allowsFontSmoothing);

	@Generated
	@CFunction
	public static native void CGContextSetShouldSubpixelPositionFonts(
			CGContextRef context, boolean shouldSubpixelPositionFonts);

	@Generated
	@CFunction
	public static native void CGContextSetAllowsFontSubpixelPositioning(
			CGContextRef context, boolean allowsFontSubpixelPositioning);

	@Generated
	@CFunction
	public static native void CGContextSetShouldSubpixelQuantizeFonts(
			CGContextRef context, boolean shouldSubpixelQuantizeFonts);

	@Generated
	@CFunction
	public static native void CGContextSetAllowsFontSubpixelQuantization(
			CGContextRef context, boolean allowsFontSubpixelQuantization);

	@Generated
	@CFunction
	public static native void CGContextBeginTransparencyLayer(
			CGContextRef context, CFDictionaryRef auxiliaryInfo);

	@Generated
	@CFunction
	public static native void CGContextBeginTransparencyLayerWithRect(
			CGContextRef context, @ByValue CGRect rect,
			CFDictionaryRef auxiliaryInfo);

	@Generated
	@CFunction
	public static native void CGContextEndTransparencyLayer(CGContextRef context);

	@Generated
	@CFunction
	@ByValue
	public static native CGAffineTransform CGContextGetUserSpaceToDeviceSpaceTransform(
			CGContextRef context);

	@Generated
	@CFunction
	@ByValue
	public static native CGPoint CGContextConvertPointToDeviceSpace(
			CGContextRef context, @ByValue CGPoint point);

	@Generated
	@CFunction
	@ByValue
	public static native CGPoint CGContextConvertPointToUserSpace(
			CGContextRef context, @ByValue CGPoint point);

	@Generated
	@CFunction
	@ByValue
	public static native CGSize CGContextConvertSizeToDeviceSpace(
			CGContextRef context, @ByValue CGSize size);

	@Generated
	@CFunction
	@ByValue
	public static native CGSize CGContextConvertSizeToUserSpace(
			CGContextRef context, @ByValue CGSize size);

	@Generated
	@CFunction
	@ByValue
	public static native CGRect CGContextConvertRectToDeviceSpace(
			CGContextRef context, @ByValue CGRect rect);

	@Generated
	@CFunction
	@ByValue
	public static native CGRect CGContextConvertRectToUserSpace(
			CGContextRef context, @ByValue CGRect rect);

	@Generated
	@Deprecated
	@CFunction
	public static native void CGContextSelectFont(
			CGContextRef c,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
			double size, int textEncoding);

	@Generated
	@Deprecated
	@CFunction
	public static native void CGContextShowText(
			CGContextRef c,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String string,
			long length);

	@Generated
	@Deprecated
	@CFunction
	public static native void CGContextShowTextAtPoint(
			CGContextRef c,
			double x,
			double y,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String string,
			long length);

	@Generated
	@Deprecated
	@CFunction
	public static native void CGContextShowGlyphs(CGContextRef c,
			ConstShortPtr g, long count);

	@Generated
	@Deprecated
	@CFunction
	public static native void CGContextShowGlyphsAtPoint(CGContextRef context,
			double x, double y, ConstShortPtr glyphs, long count);

	@Generated
	@Deprecated
	@CFunction
	public static native void CGContextShowGlyphsWithAdvances(
			CGContextRef context,
			ConstShortPtr glyphs,
			@UncertainArgument("Options: reference, array Fallback: reference") CGSize advances,
			long count);

	@Generated
	@CFunction
	public static native CGContextRef CGBitmapContextCreateWithData(
			VoidPtr data,
			long width,
			long height,
			long bitsPerComponent,
			long bytesPerRow,
			CGColorSpaceRef space,
			int bitmapInfo,
			@FunctionPtr(name = "call_CGBitmapContextCreateWithData") Function_CGBitmapContextCreateWithData releaseCallback,
			VoidPtr releaseInfo);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CGBitmapContextCreateWithData {
		@Generated
		public void call_CGBitmapContextCreateWithData(VoidPtr arg0,
				VoidPtr arg1);
	}

	@Generated
	@CFunction
	public static native CGContextRef CGBitmapContextCreate(VoidPtr data,
			long width, long height, long bitsPerComponent, long bytesPerRow,
			CGColorSpaceRef space, int bitmapInfo);

	@Generated
	@CFunction
	public static native VoidPtr CGBitmapContextGetData(CGContextRef context);

	@Generated
	@CFunction
	public static native long CGBitmapContextGetWidth(CGContextRef context);

	@Generated
	@CFunction
	public static native long CGBitmapContextGetHeight(CGContextRef context);

	@Generated
	@CFunction
	public static native long CGBitmapContextGetBitsPerComponent(
			CGContextRef context);

	@Generated
	@CFunction
	public static native long CGBitmapContextGetBitsPerPixel(
			CGContextRef context);

	@Generated
	@CFunction
	public static native long CGBitmapContextGetBytesPerRow(CGContextRef context);

	@Generated
	@CFunction
	public static native CGColorSpaceRef CGBitmapContextGetColorSpace(
			CGContextRef context);

	@Generated
	@CFunction
	public static native int CGBitmapContextGetAlphaInfo(CGContextRef context);

	@Generated
	@CFunction
	public static native int CGBitmapContextGetBitmapInfo(CGContextRef context);

	@Generated
	@CFunction
	public static native CGImageRef CGBitmapContextCreateImage(
			CGContextRef context);

	@Generated
	@CFunction
	public static native long CGDataConsumerGetTypeID();

	@Generated
	@CFunction
	public static native CGDataConsumerRef CGDataConsumerCreate(
			VoidPtr info,
			@UncertainArgument("Options: reference, array Fallback: reference") CGDataConsumerCallbacks callbacks);

	@Generated
	@CFunction
	public static native CGDataConsumerRef CGDataConsumerCreateWithURL(
			CFURLRef url);

	@Generated
	@CFunction
	public static native CGDataConsumerRef CGDataConsumerCreateWithCFData(
			CFMutableDataRef data);

	@Generated
	@CFunction
	public static native CGDataConsumerRef CGDataConsumerRetain(
			CGDataConsumerRef consumer);

	@Generated
	@CFunction
	public static native void CGDataConsumerRelease(CGDataConsumerRef consumer);

	@Generated
	@CFunction
	public static native CGLayerRef CGLayerCreateWithContext(
			CGContextRef context, @ByValue CGSize size,
			CFDictionaryRef auxiliaryInfo);

	@Generated
	@CFunction
	public static native CGLayerRef CGLayerRetain(CGLayerRef layer);

	@Generated
	@CFunction
	public static native void CGLayerRelease(CGLayerRef layer);

	@Generated
	@CFunction
	@ByValue
	public static native CGSize CGLayerGetSize(CGLayerRef layer);

	@Generated
	@CFunction
	public static native CGContextRef CGLayerGetContext(CGLayerRef layer);

	@Generated
	@CFunction
	public static native void CGContextDrawLayerInRect(CGContextRef context,
			@ByValue CGRect rect, CGLayerRef layer);

	@Generated
	@CFunction
	public static native void CGContextDrawLayerAtPoint(CGContextRef context,
			@ByValue CGPoint point, CGLayerRef layer);

	@Generated
	@CFunction
	public static native long CGLayerGetTypeID();

	@Generated
	@CFunction
	public static native CGPDFContentStreamRef CGPDFContentStreamCreateWithPage(
			CGPDFPageRef page);

	@Generated
	@CFunction
	public static native CGPDFContentStreamRef CGPDFContentStreamCreateWithStream(
			CGPDFStreamRef stream, CGPDFDictionaryRef streamResources,
			CGPDFContentStreamRef parent);

	@Generated
	@CFunction
	public static native CGPDFContentStreamRef CGPDFContentStreamRetain(
			CGPDFContentStreamRef cs);

	@Generated
	@CFunction
	public static native void CGPDFContentStreamRelease(CGPDFContentStreamRef cs);

	@Generated
	@CFunction
	public static native CFArrayRef CGPDFContentStreamGetStreams(
			CGPDFContentStreamRef cs);

	@Generated
	@CFunction
	public static native CGPDFObjectRef CGPDFContentStreamGetResource(
			CGPDFContentStreamRef cs,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String category,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name);

	@Generated
	@CFunction
	public static native CGContextRef CGPDFContextCreate(
			CGDataConsumerRef consumer,
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect mediaBox,
			CFDictionaryRef auxiliaryInfo);

	@Generated
	@CFunction
	public static native CGContextRef CGPDFContextCreateWithURL(
			CFURLRef url,
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect mediaBox,
			CFDictionaryRef auxiliaryInfo);

	@Generated
	@CFunction
	public static native void CGPDFContextClose(CGContextRef context);

	@Generated
	@CFunction
	public static native void CGPDFContextBeginPage(CGContextRef context,
			CFDictionaryRef pageInfo);

	@Generated
	@CFunction
	public static native void CGPDFContextEndPage(CGContextRef context);

	@Generated
	@CFunction
	public static native void CGPDFContextAddDocumentMetadata(
			CGContextRef context, CFDataRef metadata);

	@Generated
	@CFunction
	public static native void CGPDFContextSetURLForRect(CGContextRef context,
			CFURLRef url, @ByValue CGRect rect);

	@Generated
	@CFunction
	public static native void CGPDFContextAddDestinationAtPoint(
			CGContextRef context, CFStringRef name, @ByValue CGPoint point);

	@Generated
	@CFunction
	public static native void CGPDFContextSetDestinationForRect(
			CGContextRef context, CFStringRef name, @ByValue CGRect rect);

	@Generated
	@CFunction
	public static native CGPDFScannerRef CGPDFScannerCreate(
			CGPDFContentStreamRef cs, CGPDFOperatorTableRef table, VoidPtr info);

	@Generated
	@CFunction
	public static native CGPDFScannerRef CGPDFScannerRetain(
			CGPDFScannerRef scanner);

	@Generated
	@CFunction
	public static native void CGPDFScannerRelease(CGPDFScannerRef scanner);

	@Generated
	@CFunction
	public static native boolean CGPDFScannerScan(CGPDFScannerRef scanner);

	@Generated
	@CFunction
	public static native CGPDFContentStreamRef CGPDFScannerGetContentStream(
			CGPDFScannerRef scanner);

	@Generated
	@CFunction
	public static native boolean CGPDFScannerPopObject(CGPDFScannerRef scanner,
			Ptr<CGPDFObjectRef> value);

	@Generated
	@CFunction
	public static native boolean CGPDFScannerPopBoolean(
			CGPDFScannerRef scanner, BytePtr value);

	@Generated
	@CFunction
	public static native boolean CGPDFScannerPopInteger(
			CGPDFScannerRef scanner, LongPtr value);

	@Generated
	@CFunction
	public static native boolean CGPDFScannerPopNumber(CGPDFScannerRef scanner,
			DoublePtr value);

	@Generated
	@CFunction
	public static native boolean CGPDFScannerPopName(
			CGPDFScannerRef scanner,
			@UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] value);

	@Generated
	@CFunction
	public static native boolean CGPDFScannerPopString(CGPDFScannerRef scanner,
			Ptr<CGPDFStringRef> value);

	@Generated
	@CFunction
	public static native boolean CGPDFScannerPopArray(CGPDFScannerRef scanner,
			Ptr<CGPDFArrayRef> value);

	@Generated
	@CFunction
	public static native boolean CGPDFScannerPopDictionary(
			CGPDFScannerRef scanner, Ptr<CGPDFDictionaryRef> value);

	@Generated
	@CFunction
	public static native boolean CGPDFScannerPopStream(CGPDFScannerRef scanner,
			Ptr<CGPDFStreamRef> value);

	@Generated
	@CFunction
	public static native CGPDFOperatorTableRef CGPDFOperatorTableCreate();

	@Generated
	@CFunction
	public static native CGPDFOperatorTableRef CGPDFOperatorTableRetain(
			CGPDFOperatorTableRef table);

	@Generated
	@CFunction
	public static native void CGPDFOperatorTableRelease(
			CGPDFOperatorTableRef table);

	@Generated
	@CFunction
	public static native void CGPDFOperatorTableSetCallback(
			CGPDFOperatorTableRef table,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
			@FunctionPtr(name = "call_CGPDFOperatorTableSetCallback") Function_CGPDFOperatorTableSetCallback callback);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_CGPDFOperatorTableSetCallback {
		@Generated
		public void call_CGPDFOperatorTableSetCallback(VoidPtr arg0,
				VoidPtr arg1);
	}

	@Generated
	@CVariable()
	@ByValue
	public static native CGPoint CGPointZero();

	@Generated
	@CVariable()
	@ByValue
	public static native CGSize CGSizeZero();

	@Generated
	@CVariable()
	@ByValue
	public static native CGRect CGRectZero();

	@Generated
	@CVariable()
	@ByValue
	public static native CGRect CGRectNull();

	@Generated
	@CVariable()
	@ByValue
	public static native CGRect CGRectInfinite();

	@Generated
	@CVariable()
	@ByValue
	public static native CGAffineTransform CGAffineTransformIdentity();

	@Generated
	@CVariable()
	public static native CFStringRef kCGFontVariationAxisName();

	@Generated
	@CVariable()
	public static native CFStringRef kCGFontVariationAxisMinValue();

	@Generated
	@CVariable()
	public static native CFStringRef kCGFontVariationAxisMaxValue();

	@Generated
	@CVariable()
	public static native CFStringRef kCGFontVariationAxisDefaultValue();

	@Generated
	@CVariable()
	public static native CFStringRef kCGPDFContextMediaBox();

	@Generated
	@CVariable()
	public static native CFStringRef kCGPDFContextCropBox();

	@Generated
	@CVariable()
	public static native CFStringRef kCGPDFContextBleedBox();

	@Generated
	@CVariable()
	public static native CFStringRef kCGPDFContextTrimBox();

	@Generated
	@CVariable()
	public static native CFStringRef kCGPDFContextArtBox();

	@Generated
	@CVariable()
	public static native CFStringRef kCGPDFContextTitle();

	@Generated
	@CVariable()
	public static native CFStringRef kCGPDFContextAuthor();

	@Generated
	@CVariable()
	public static native CFStringRef kCGPDFContextSubject();

	@Generated
	@CVariable()
	public static native CFStringRef kCGPDFContextKeywords();

	@Generated
	@CVariable()
	public static native CFStringRef kCGPDFContextCreator();

	@Generated
	@CVariable()
	public static native CFStringRef kCGPDFContextOwnerPassword();

	@Generated
	@CVariable()
	public static native CFStringRef kCGPDFContextUserPassword();

	@Generated
	@CVariable()
	public static native CFStringRef kCGPDFContextEncryptionKeyLength();

	@Generated
	@CVariable()
	public static native CFStringRef kCGPDFContextAllowsPrinting();

	@Generated
	@CVariable()
	public static native CFStringRef kCGPDFContextAllowsCopying();
}
